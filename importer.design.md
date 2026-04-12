The full product is: share anything to RecipeBook, let the app extract a structured draft with deterministic tools first, then use AI to finish, normalize, and translate before save.

**High-Level Flow**
1. User shares a URL, image, or text to `RecipeBook`.
2. RecipeBook creates an `import draft job`.
3. The app extracts as much structure as it can without AI.
4. The app sends the extracted material to the AI only for the parts machines are bad at doing deterministically.
5. The app opens a draft editor in the active language only.
6. User reviews and edits that one language.
7. On save, the app regenerates the opposite language and runs final normalization.
8. The app stores a normal `Recipe` plus import provenance.

This hybrid model does:
- deterministic extraction where websites already provide structure
- OCR when input is visual
- AI for recovery, interpretation, bilingual output, and normalization
- a final human review step in only one language, so the UX stays compact

That is probably the best fit for RecipeBook’s bilingual and normalization requirements.

**Input Types**
There are three entry points, all using Android share support from `#5`.

1. `Shared webpage URL`
From Chrome, Firefox, etc.

2. `Shared image`
From Photos, screenshots, camera output, scanned pages, handwritten recipes if readable enough.

3. `Shared text`
From notes, email, messages, PDFs that expose text, copied recipe blocks.

All three end up in the same internal import pipeline.

RecipeBook registers itself as an Android share target for:
- `text/plain`
- `image/*`
- optionally multiple images
- URL-like shared text

When the user shares something:
- the app receives the payload
- stores it immediately as a temporary import source
- starts an import job
- shows progress like `Fetching recipe`, `Reading image`, `Building draft`

This part is mostly Android integration and workflow design.

**Part B: Deterministic Extraction First (#2)**
This is the “be smart before calling AI” layer.

For a `webpage URL`, I would do this in order:

1. Fetch the page HTML.
2. Look for `schema.org/Recipe` JSON-LD.
3. If found, extract:
- title
- description
- ingredients
- instructions
- times
- yields
- author/source
- images

4. If that is incomplete, fall back to cleaned readable article extraction:
- remove navigation, ads, comments, junk
- keep title and main article body
- preserve lists and headings when possible

5. Build a normalized raw extraction bundle.

This matters because many recipe sites already expose machine-readable recipe fields. If you use them first, you get higher accuracy and fewer AI mistakes.

For an `image`, I would do this:

1. If needed, crop/clean the image or use document scan flow.
2. Run OCR.
3. Preserve line order and block grouping.
4. Detect likely sections:
- title
- ingredient list
- instructions
- notes
- timings
- servings

5. Build a raw extraction bundle with the OCR text plus any layout hints.

For `shared text`, the deterministic step is simpler:
- classify whether it already looks like recipe text
- detect lines, sections, bullets, numbered steps
- extract obvious structured fields before AI

**Part C: AI Finisher**

The AI is not asked “please invent a recipe object from this.”
It is asked to transform a known source bundle into your recipe creation payload under strict rules.

So the AI input would include:
- source type: webpage, image, or text
- raw extracted content
- any deterministic structured fields found already
- current app language
- your schema shape
- ingredient/unit expectations
- bilingual requirement
- rules about uncertainty and no hallucination

The AI output should be:
- strictly structured recipe creation JSON
- not prose
- with confidence-aware behavior

The AI responsibilities are:
- infer recipe structure from noisy content
- convert extracted text into clean fields
- translate to the other language
- normalize ingredient naming
- normalize units/times where appropriate
- preserve original ingredient wording in `originalText`
- leave missing values blank instead of guessing

This is where structured output really matters. You want the app to validate the result against your existing recipe creation schema before it ever reaches storage.

**What the AI prompt should enforce**
The prompt should be very strict. For example, the model should be told to:
- output only valid JSON matching the schema
- never invent missing quantities, temperatures, or times
- keep uncertain ingredient parsing in `originalText`
- preserve temperature mentions in both C/F in the textual instructions if needed
- produce both `fr` and `en` system fields
- use Quebec French wording where applicable
- keep ingredient lines ordered
- keep instructions ordered
- set fields to empty string or null when unknown
- prefer exact source wording over “improved rewriting”

That last point is especially important. For recipe imports, “better writing” is often worse data.

**Part D: Draft Editor**
After extraction, the app opens a dedicated import draft screen or the normal editor in import mode.

The user sees:
- one editable language only: the active app language
- parsed title, description, ingredients, steps, notes, times, source
- warnings for uncertain fields
- maybe a small import summary like:
  - `Imported from webpage`
  - `3 ingredient lines uncertain`
  - `French will be regenerated on save`

The non-active language should not be a full editable form here.
At most, show:
- hidden generated state
- or a preview toggle
- or a “regenerate translation” action

This keeps the UI much cleaner.

**Part E: Save Pipeline**
Save is where the bilingual and normalization rules become canonical.

When the user taps save:
1. Take the edited active-language fields.
2. Treat that version as the authoritative reviewable text.
3. Generate or regenerate the opposite language from that reviewed version.
4. Run normalization passes:
- ingredient reference matching
- unit cleanup
- time cleanup
- source metadata population
- import metadata population

5. Validate against the recipe creation schema.
6. Convert to domain `Recipe`.
7. Save through the repository.

This is important: the reviewed active language should be the source of truth for the final bilingual output, not the earlier raw AI draft.

**How bilingual editing should behave**
You said:
- be able to edit only the active language
- app auto translates and normalize in both languages on save

This combined design supports that very well.

The user experience would be:
- active language fields are editable
- opposite language is generated
- switching app language later lets the user edit that language if they want
- on save, the app updates the other side again

That means every save effectively does:
- one-language human edit
- two-language canonical rebuild

This is simpler than maintaining two equal manual drafts at once.

**Normalization Details**
RecipeBook already cares about structured ingredients and ingredient references, so normalization should happen in layers.

I would do:
1. `Text normalization`
- trim whitespace
- normalize line breaks
- standardize fractions/decimals if needed

2. `Recipe structure normalization`
- title
- description
- steps
- notes
- servings
- times

3. `Ingredient normalization`
- parse quantity/unit when confidently possible
- preserve source line in `originalText`
- map display name toward known ingredient references
- keep uncertain matches unresolved instead of forcing them

4. `Localization normalization`
- Quebec French wording
- bilingual completeness
- no fallback text stored as content

5. `Metadata normalization`
- `source.sourceUrl`
- `source.sourceName`
- `importMetadata.sourceType`
- `importMetadata.parserVersion`
- `importMetadata.originalUnits`

**Concrete Example: Webpage**
User is on a recipe blog and taps `Share -> RecipeBook`.

Pipeline:
1. App receives URL.
2. App fetches page.
3. Finds JSON-LD recipe data with ingredients and instructions.
4. Also extracts readable article body because maybe notes and yield are better there.
5. App builds import source bundle.
6. AI converts bundle into validated recipe creation JSON in both languages.
7. App opens draft in English because the user’s active language is English.
8. User fixes one ingredient and one step.
9. User taps save.
10. App regenerates French from the reviewed English text.
11. App normalizes ingredient references and units.
12. Recipe saved with source URL and import metadata.

**Concrete Example: Screenshot**
User shares a screenshot of a recipe card.

Pipeline:
1. App receives image URI.
2. OCR extracts title, ingredients, steps.
3. Layout heuristics group lines into sections.
4. AI turns OCR text into recipe creation JSON.
5. Draft opens in French because app language is French.
6. User fixes OCR mistakes.
7. Save regenerates English and normalizes.

**What should happen when extraction is messy**
This is where product quality lives.

The app should not pretend certainty.
It should surface uncertainty in a compact way:
- ingredient line could not be fully parsed
- time detected but may be ambiguous
- servings missing
- source text looked incomplete
- translation regenerated from reviewed source

You do not need a big scary review screen, just lightweight warnings and highlighted fields.

**Recommended internal components**
Architecturally, I’d split it like this:

1. `ShareIngress`
Android intent handling for URL/image/text.

2. `ImportSourceStore`
Temporary local storage for incoming import jobs and payload references.

3. `RawExtractor`
Deterministic extraction:
- webpage extractor
- OCR/image extractor
- shared text extractor

4. `AiRecipeImportService`
Takes extracted content and produces schema-valid recipe payload.

5. `ImportDraftMapper`
Maps schema payload into editor draft state.

6. `BilingualSavePipeline`
Uses reviewed active-language content to regenerate opposite language and normalize final recipe.

7. `ImportMetadataBuilder`
Builds provenance data for saved recipes.

That separation will make testing much easier.

**Testing strategy**
This approach is testable if you split it properly.

I’d want:
- unit tests for webpage structured-data extraction
- unit tests for OCR text section parsing heuristics
- unit tests for schema validation and mapping
- unit tests for bilingual save regeneration logic
- fake AI service tests with tricky inputs
- instrumentation tests for the share intent flow
- emulator validation on Pixel 9a for:
  - share URL from browser
  - share screenshot from Photos
  - review draft
  - save and reopen recipe

For AI-dependent tests, I would not rely on the live model for most automated coverage.
Instead:
- test prompt contract with fixtures
- store sample extracted inputs and expected structured outputs
- use a fake service in tests
- do live-model smoke tests separately

**Cost and privacy profile**
Compared with pure API import:
- cost is lower because many fields come from deterministic extraction first
- token usage drops
- privacy is better because you can send cleaned recipe content instead of full webpage noise

Compared with full on-device:
- quality is higher
- webpage import is much more reliable
- image import handles messy layouts better

**Where this can still fail**
Even this design has hard cases:
- JS-heavy pages with poor accessible content
- OCR on low-quality or handwritten images
- recipes split across multiple images
- blog posts with lots of story and weak structure
- ambiguous ingredient names

That is why I’d keep the draft review step and the uncertainty flags.

**My recommendation for the first version**
For v1 of this feature, I would scope it to:
- share URL
- share single image
- share plain text
- active-language-only draft editor
- AI-backed final bilingual generation on save
- deterministic webpage parsing first
- OCR first for images
- import metadata saved

I would leave for later:
- multi-image stitching
- PDF import
- handwriting optimization
- background batch import inbox
- confidence scoring UI beyond lightweight warnings

That first version is already strong and aligned with your app.

**The main product idea in one sentence**
Capture from anywhere with Android share, extract deterministically when possible, use AI only to bridge the messy parts, let the user review one language, then save a normalized bilingual recipe.
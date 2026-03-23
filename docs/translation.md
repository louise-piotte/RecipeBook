# Recipe Cleanup And Translation Memory

This file tracks durable cleanup and translation rules for importing recipes into the app's current format.

## Core Rules
- Convert every imported recipe to the current app format.
- Consistency is mandatory across the library. Reuse the same wording and formatting choices for repeated patterns instead of rewriting them ad hoc.
- Use Quebec French, not France French.
- Adapt tags to the current tag model. Do not rely on removed ingredient-tag behavior.
- Add any missing translation when one language is absent.
- If a tag or ingredient is missing from the database, add the canonical entry or an appropriate alias.
- Clean and fix recipe text while keeping the chosen conventions consistent.
- Fill in missing structure as accurately as possible, but do not invent missing factual data.
- If a source URL exists, consult it for translation context, terminology, and clarification only; keep the user's personalized recipe amounts if they differ.
- Port recipe pictures into the app database/assets flow whenever source images are available.
- If a source still contains unresolved either/or ingredient choices or variant selections, stop and ask instead of importing every option.

## Consistency To Track
- Oven temperature style and bilingual temperature presentation.
- Unit wording and abbreviations in English and French.
- Ingredient naming, including canonical names and aliases.
- Instruction voice, punctuation, and capitalization.
- Section naming for ingredients, steps, notes, and yields.
- Tag naming and when each tag should be applied.
- Title translation style and validated common culinary terms.
- Recipe image coverage and main-photo selection.
- File encoding for accents, apostrophes, and degree symbols.

## Working Conventions
- Prefer correcting typos, accents, and malformed text instead of preserving noisy source text.
- Prefer one canonical ingredient name plus aliases rather than near-duplicate ingredient entries.
- For pure chocolate baking chips, normalize to the matching base chocolate ingredient instead of keeping a separate chips ingredient: for example chocolate chips/semi-sweet chocolate chips -> semisweet chocolate, white chocolate chips -> white chocolate, and the same pattern for other plain chocolate variants. Do not apply this to non-chocolate chips like peanut butter chips or butterscotch chips.
- When a recipe implies a missing tag, ingredient, or translation, update the supporting data as part of the same cleanup pass.
- Keep notes here when a new library-wide style decision is made so later conversions stay aligned.
- Write temperatures as `x°C/y°F`.
- Write times as `xh ymin zsec`, omitting any part whose value is zero.
- Add missing translations, but do not fabricate missing times, temperatures, yields, or other factual recipe data.
- Use direct title translations, then validate them against the term actually used in cooking context.
- Preserve the user's personalized recipe content while still importing available source images.
- If no source description exists, write a short description of the finished dish, not the preparation method.
- Write updated JSON and text files explicitly as UTF-8 so accented characters and ° stay intact.
- If imported text already contains mojibake like Ã, Â, broken °, or damaged French accents, repair it as UTF-8 text that was misread as Latin-1/ISO-8859-1, then rewrite the final file as UTF-8 without BOM.

## Things To Confirm During Import
- The source recipe has enough information to produce a complete bilingual record.
- Units, temperatures, and yields are normalized to app expectations.
- Existing ingredients, aliases, and tags are reused before creating new ones.
- The final French wording matches Quebec usage and proper spelling.
- Any source URL has been checked for terminology/translation context without replacing personalized user-edited amounts.
- Available recipe images have been imported and the appropriate main photo has been identified.
- Any user-selected ingredient option has been resolved before import.

# WP03 Section I — almond-butter formulation boundary review (R367)

- **Reviewed:** 2026-10-16
- **Status:** Integrated as a source-backed ledger verification and documentation update on 2026-10-16.
- **Scope:** One bounded question under the open Section I checklist item “Record added sugar, salt, oil, and stabilizers when they materially affect culinary behavior”: should the existing almond-butter identity split into formulation or texture forms, or should those product differences remain source-specific? No other nut or seed butter is reviewed here.

## Recommendation

Keep the single active identity **almond butter / beurre d'amande**, ID `ingredient-ref-almond-butter`, category `FAT_AND_OIL`. Verify that identity and record the reviewed package formulas as product-specific evidence on its existing ledger record. Do not add references, forms, or aliases for natural, creamy/smooth, crunchy, sweetened, salted, or stabilized almond butter.

The sources demonstrate real formula and handling differences within products marketed as almond butter: a Québec product lists almonds alone and naturally separates; other manufacturer products list added palm fruit oil, and one also lists cane sugar and salt. The USDA procurement specification likewise describes almond butter with a minimum almond content and optional additions. Sugar and salt can change a recipe's sweetness and seasoning; added oil and stabilization can change spreadability and oil separation. Those effects justify retaining the formulation evidence, but the source-specific ingredient lists do not define universal catalog forms. “Natural,” “creamy,” “smooth,” and “crunchy” are not consistent formulation recipes, and the bundled recipes use only unqualified almond butter.

Keep the current display names and empty alias arrays. The Québec Food Directory and a Québec maker directly attest the French product wording `beurre d'amande` in longer product names. This is product naming evidence, not an OQLF ruling that every longer qualifier should become an alias.

| Catalog field | Recommendation |
|---|---|
| Reference and category | Keep `ingredient-ref-almond-butter`, `FAT_AND_OIL` |
| English / French display | Keep `almond butter` / `beurre d'amande` |
| Aliases and forms | Keep both alias arrays empty; add no formulation or texture forms |
| Identity ledger state | Change `unreviewed` to `verified` and record the bounded identity/formulation decision with sources S01–S05 |
| Measurement ledger state | Keep `blocked_pending_evidence`; no active density, mapping, conversion, or yield |
| Substitution ledger state | Keep `not_yet_researched`; add no substitution rule |

## Live ownership and plan fit

A read-only snapshot of the live package on 2026-10-16 found 1,694 active ingredient references, 139 forms, 114 manifest recipes with 1,123 ingredient rows, and 2,050 ledger records with 9,210 source entries. The active almond-butter row has English display `almond butter`, French display `beurre d'amande`, no aliases, `defaultDensity: null`, empty `unitMappings`, and no attached forms. Its ledger record has no sources, `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`.

Section I has an open parent checklist item for peanut, almond, cashew, sunflower, sesame/tahini, and other nut/seed butters and pastes, plus the open formulation subcheck for material added sugar, salt, oil, and stabilizers. The earlier WP03 nut/seed-butter overview retained the almond-butter identity but did not review its product formulation. The R213 peanut-butter review specifically covered peanut formulations and peanut recipe aliases; this proposal covers almond-butter evidence only and does not reuse those peanut product claims.

## Formulation evidence

| Source evidence | Observed product wording and formulation | Limit |
|---|---|---|
| Québec Food Directory, Mille et Une Noix organic creamy almond butter [S01] | The French product name is `Beurre d'amande crémeux bio`; ingredients are organic European almonds. Its nutrition panel is stated for 1 tbsp (15 g). | One listed SKU. The directory serving and ingredient data do not establish a generic almond-butter formula or conversion. |
| Mille et Une Noix, Québec maker product page [S02] | Product title `Beurre d’amande crémeux biologique`; the maker says it roasts and grinds almonds, recommends stirring, and explains that natural nut oil rises because no stabilizer is used. | Describes this maker's product and handling; do not assign it to every almond butter. |
| Barney Butter Bare Smooth Almond Butter [S03] | The manufacturer lists blanched roasted almonds and palm fruit oil, with no added sugar or salt; it describes the product as no-stir. | A particular U.S. product. It shows that a no-added-sugar/salt smooth product may still contain added oil. |
| Barney Butter Crunchy Almond Butter [S04] | The manufacturer lists blanched roasted almonds, cane sugar, palm fruit oil, and sea salt; the page describes diced almonds and a slightly sweetened, salted product. | A separate U.S. product. Do not assign this ingredient list or its texture to generic almond butter. |
| USDA AMS Nut Butters and Nut Spreads procurement specification A-A-20328C [S05] | The procurement specification describes almond butter made from raw or roasted almonds and permits additions such as salt, honey, syrups, maltodextrin, seeds, wheat germ, cocoa, cocoa butter, vanilla, and stabilizing oils. It also lists purchaser options for smooth/medium/crunchy texture, stabilized/non-stabilized type, and salted/unsalted seasoning. | U.S. procurement specification, not a Canadian standard or universal retail definition. It establishes possible product variation, not a required formula or catalog taxonomy. |

These sources support recording the distinction at the product-evidence level. They do not support mapping the word “natural” to a fixed ingredients list, treating “smooth/creamy” as a stable formulation, or treating sweetened/salted/stabilized products as a separate ingredient identity. No catalog-level form is recommended.

## Picker and recipe-corpus impact

The current picker indexes bilingual reference names, aliases, and attached form terms. `IngredientReferenceSearchIndex` normalizes accents and punctuation, prefers complete phrase matches, then falls back to substring matching. A static projection over the live reference and form files produced:

| Search query | Current owner |
|---|---|
| `almond butter` | `ingredient-ref-almond-butter` |
| `beurre d'amande` | `ingredient-ref-almond-butter` |
| `natural almond butter` | No result |
| `smooth almond butter` | No result |
| `creamy almond butter` | No result |
| `beurre d'amande crémeux` | No result |

No aliases are proposed, so picker results stay as shown. The three bundled rows contain no formulation or texture qualifier, so there is no current recipe phrase to repair:

| Recipe row | Bundled ingredient text | Current owner |
|---|---|---|
| `031#9` | `almond butter` (no quantity or unit) | `ingredient-ref-almond-butter` |
| `040#4` | `1 cup almond butter` | `ingredient-ref-almond-butter` |
| `070#14` | `60 g almond butter` | `ingredient-ref-almond-butter` |

Preserve all original ingredient text, amounts, units, and links. The recipe-specific cashew-butter option documented for recipe 040 in the R291 review remains scoped to that recipe; it does not establish a global almond-to-cashew substitution or a swap among almond-butter formulations.

## Numeric and substitution limits

The Québec Food Directory gives a label serving of 1 tbsp (15 g) for its specific organic creamy almond-butter SKU [S01]. Treat that only as product-specific package evidence. The corpus includes one cup and 60 g for unspecified products, so this single SKU serving does not establish a general cup-to-mass factor, filling method, or transferable density. Keep `defaultDensity` null, `unitMappings` empty, and the measurement state blocked. No form conversion, yield, or recipe amount change is recommended.

None of the formulation sources tests recipe interchangeability. Keep substitution research not yet researched and add no global or contextual rule. Ingredient-list similarity, texture labels, and the recipe-specific cashew option do not support an automatic substitution.

## Proposal-local sources and uniqueness audit

The source IDs below were proposal-local before integration. Root checked that the five URLs and source-ID prefix `WP03-I-ALMOND-BUTTER-FORMULATION-R367-20261016` were unused in the shared ledger and archive before adding the sources to the existing almond-butter record.

| Source ID | Source and direct URL | Claim and boundary |
|---|---|---|
| `WP03-I-ALMOND-BUTTER-FORMULATION-R367-20261016-S01` | Québec Food Directory, [Beurre d'amande crémeux bio, Mille et Une Noix](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207930) | Québec display wording, ingredient declaration, and SKU label serving 1 tbsp (15 g); product-specific evidence. |
| `WP03-I-ALMOND-BUTTER-FORMULATION-R367-20261016-S02` | Mille et Une Noix, [Beurre d’amande crémeux biologique](https://www.milleetunenoix.ca/products/organic-creamy-almond-butter) | Québec maker's display wording, almonds-only formula, roasting/grinding, natural separation, and no-stabilizer handling; maker-specific. |
| `WP03-I-ALMOND-BUTTER-FORMULATION-R367-20261016-S03` | Barney Butter, [Bare Smooth Almond Butter](https://barneybutter.com/products/bare-smooth-almond-butter) | Manufacturer ingredient list and no-added-sugar/salt statement for one smooth product; SKU-specific. |
| `WP03-I-ALMOND-BUTTER-FORMULATION-R367-20261016-S04` | Barney Butter, [Crunchy Almond Butter](https://barneybutter.com/products/crunchy-almond-butter) | Manufacturer ingredient list and texture/product description for one sweetened, salted product; SKU-specific. |
| `WP03-I-ALMOND-BUTTER-FORMULATION-R367-20261016-S05` | USDA AMS, [Nut Butters and Nut Spreads, A-A-20328C](https://www.ams.usda.gov/sites/default/files/media/NutButtersNutSpreads.pdf), Sections 3, 6.3.1.2, and 6.4.1–6.4.2 | U.S. procurement categories and allowed almond-butter ingredients; not Canadian regulatory guidance or a mandatory formula. |

No software tests, build, or emulator checks were needed; the change adds only research data to the JSON ledger and documentation.

## Integration record

Added S01–S05 and one accepted identity decision to the existing `ingredient-ref-almond-butter` ledger record and changed `identityState` to `verified`. Kept `measurementState: blocked_pending_evidence` and `substitutionResearchState: not_yet_researched`. The active reference, aliases, forms, recipe rows, and generated picker index remain unchanged. The Section I plan and `roadmap.md` record this bounded evidence review; see the [R367 integration README](../batches/wp03-section-i-almond-butter-formulation-evidence-integration-r367-20261016/README.md).

# WP03 Section F — aval / flattened-rice alias review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** proposal only; no catalog, ledger, recipe, plan, roadmap, or generated file changed.
- **Scope:** decide whether bare regional product name `aval` merits one English-search alias on the existing flattened-rice reference. This review covers no other regional name, color, grade, prepared dish, or recipe.
- **Plan context:** Section F continues to leave regional cereal mixes and preprocessed grains open ([active plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2210), [continuation checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L9416)).
- **Prior hold:** the 2026-10-10 poha-thickness integration explicitly left `aval`, `avalakki`, `atukulu`, `chuda`, and `chira` pending a separate regional/product-scope review ([batch record](../batches/poha-thickness-synonyms-integration-20261010/README.md)). The later chiura review added only `chiura`; it did not resolve these other terms. This proposal addresses only `aval` and does not reopen chiura, chiwda/chivda, generic poha grades, red-rice flakes, or maize poha.

## Recommendation

**Add only `aval` to `aliasesEn` on the existing `ingredient-ref-flattened-rice-poha` reference.** Keep the English display `flattened rice (poha)`, Québec French display `flocons de riz (poha)`, existing French aliases `riz aplati` and `riz battu`, category, and all other fields unchanged. Do not create an ingredient reference, form, legacy candidate, or ledger record for `aval`.

The source evidence supports `aval` as a regional name for the plain flattened-rice product, including current English-language Canadian product listings. The existing broad flattened-rice identity is the appropriate target. Use an English alias because the attestation is in English-language product and technical material; the reviewed French-Canadian product sources support the current French display and aliases but do not use `aval` as a French label. Do not add a French alias or replace the display.

| Field | Proposal |
| --- | --- |
| Existing reference | `ingredient-ref-flattened-rice-poha` |
| English display | Keep `flattened rice (poha)` |
| fr-CA display | Keep `flocons de riz (poha)` |
| English alias | Add only `aval` |
| French aliases | Keep `riz aplati`, `riz battu` unchanged |
| New reference, form, or candidate | None |
| Category | Keep `GRAIN_AND_CEREAL` |
| Recipe links | None |
| Measures, density, mappings, conversions, yields, substitutions | None |

## Why this term fits the existing product boundary

NIFTEM's rice-processing material lists `aval` as a regional name for flaked rice in Tamil and Malayalam. The CSIR-CFTRI compendium groups aval with flaked rice, beaten rice, poha, and other regional names for the rice-flake product. A current Kitchener retailer markets **White Aval** as flattened rice / poha and describes a white-rice product that is parboiled, flattened, and dried. A second current Canadian retail listing calls its product **White Poha Thick Aval** and describes white aval as beaten rice. Together, these support bare `aval` as a useful search name for the existing generic product family.

The evidence has limits. The Canadian listings describe specific white and thickness-qualified products, not every possible cultivar, rice color, grade, or process. One seller's processing description is not a universal specification. The regional-name sources support a broad rice-flake term but do not establish that `aval` is a fr-CA word or a formal Québec terminology-authority term. The recommendation therefore adds only the bare English-search alias and does not import product qualifiers or numeric claims.

## Exact ownership and picker behavior

The read-only normalized-key audit covered active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and every string in the research ledger. No exact normalized owner exists for `aval`, `avalakki`, `white aval`, `white poha aval`, `aval flakes`, `aval rice flakes`, `matta aval`, `aval upma`, `avala`, `atukulu`, `chuda`, or `chira`. The existing exact French owners `flocons de riz (poha)`, `riz aplati`, and `riz battu` belong to the generic flattened-rice reference. The historic poha/chiura records mention the broader terminology family but do not assign `aval` as an accepted alias.

The active generic row currently has English aliases `beaten rice`, `flaked rice`, `rice flakes`, and `chiura`; French aliases `riz aplati` and `riz battu`; `defaultDensity: null`; and an empty `unitMappings` array. Thin, medium, and thick commercial poha forms attach to this row, each with `densityGPerMl: null`. The separate `ingredient-ref-red-rice-flakes` row has the English alias `red rice poha`; a French marketplace source uses the product-qualified wording `Matta Aval`. Keep `Matta Aval` attached to that specific red-rice listing and do not add it, `red aval`, `white aval`, or another color/grade-qualified phrase to the generic alias set. The separate corn-poha row also remains unchanged.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches complete normalized word phrases first and uses substring matching only when no phrase match exists. Current source-code behavior for a bare `aval` query is no phrase match, followed by unrelated substring results for collard greens (through `chou cavalier`) and Sichuan pepper (through `clavalier`). If the exact alias `aval` is added to the flattened-rice row, the phrase pass should return that row alone and suppress the unrelated substring fallback. This is a code-path assessment, not live picker QA.

The scoped alias leaves these boundaries intact:

- `avalakki` remains unassigned; a source listing it beside aval in the same regional family does not make this proposal a review of its spelling, language, or retailer search value.
- `white aval`, `matta aval`, `red aval`, and thickness-qualified names remain unassigned because they can encode a rice color, cultivar, or product grade.
- `aval upma` remains unassigned as a prepared-dish phrase, not an ingredient synonym.
- No French query behavior changes. Existing `poha`, `rice flakes`, `flocons de riz`, `riz aplati`, and `riz battu` results remain unchanged.

## English and fr-CA names

The proposed English search alias is supported by regional technical naming and Canadian English-market product labels. The English display remains the clearer general name `flattened rice (poha)`.

For fr-CA, the current display `flocons de riz (poha)` is supported by Atlantic Superstore's French product listing, while Spice Divine's French product description uses `riz aplati` and `riz battu` for poha. Those Canadian retailer labels support the existing display and aliases; they are not OQLF or TERMIUM rulings. None of the reviewed fr-CA listings names the generic product `aval`. Keep the French display and aliases unchanged and make no claim that `aval` is an official or preferred French term.

## Recipe-demand audit

A read-only scan covered every manifest-listed bundled recipe, the serialized recipe text, and every ingredient row. Candidate and neighboring terms included `aval`, `white aval`, `avalakki`, `matta aval`, `aval upma`, `atukulu`, `chuda`, `chira`, `chiura`, `poha`, `flattened rice`, `beaten rice`, `rice flakes`, `flaked rice`, `riz aplati`, `riz battu`, and `flocons de riz`.

| Corpus measure | Result |
| --- | ---: |
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Candidate-phrase recipe files | 0 |
| Candidate-phrase ingredient rows | 0 |
| Manifest-order corpus SHA-256 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

No bundled recipe demand, quantity, form-specific use, or recipe link justifies a data change. No recipe or ingredient line is proposed.

## Measurement, density, processing, and substitution limits

- **Measurements and density:** keep `defaultDensity` null, `unitMappings` empty, and all three poha form densities null. The Canadian product weights (500 g and 1 kg) are package sizes, not portion measures, household-volume conversions, or density observations.
- **Process and yield:** Tasty Grains describes one white-rice product as parboiled, flattened, and dried. CFTRI's process paper discusses rice-flake yield from paddy under specific soaking, roasting, and flaking conditions. These are product/process evidence only; the industrial paddy-to-flake output is not a recipe cooking yield, dry-to-prepared ratio, or reusable quantity conversion.
- **Forms:** add no form. Do not infer a white, red, parboiled, cooked, soaked, or roasted form from individual product wording. Existing thin, medium, and thick poha grades remain unchanged and have no established universal dimensional cutoffs.
- **Conversions and substitutions:** add no conversion, yield, or substitution involving aval, generic poha, rice, red rice flakes, corn poha, puffed rice, or cereal products. Shared breakfast and snack uses do not establish interchangeable cooking performance or a ratio. The existing poha ledger keeps `measurementState: not_yet_researched` and `substitutionResearchState: blocked_pending_evidence`; this alias review does not alter those states.

## Source register

The three proposal-local source IDs were checked against the research ledger and proposal archive and were unallocated on 2026-10-12. They are not additions to the shared ledger. Existing source IDs are reused only for the unchanged generic/French product boundary.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP03-AVAL-20261012-S01` | National Institute of Food Technology Entrepreneurship and Management (NIFTEM), PMFME, [Puffed and Flaked Rice](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/Rice-based-product-Process-PPT.pdf), slide/page headed “Common Names in Indian States” under “Flaked Rice”. Accessed 2026-10-12. | Lists `Aval – Tamil, Malayalam` under flaked rice. Supports the regional name and language scope; it does not establish color, grade, a Québec French name, or recipe measures. PDF search retrieval succeeded; direct PDF open timed out during this review. |
| `WP03-AVAL-20261012-S02` | Tasty Grains, Kitchener, [Flattened Rice – White Aval](https://www.tastygrain.ca/products/flattened-rice-white-aval), product title, description, and store address. Accessed 2026-10-12. | The English page calls White Aval flattened rice and poha and says this specific product is made from white rice, parboiled, flattened, and dried. It describes aval upma, sweet aval, and curd aval as uses. The page simultaneously showed “Sold out” and “Availability: In Stock”; no stock claim is made. Its 1 kg listing is package data only. |
| `WP03-AVAL-20261012-S03` | FreshOnTheGo Grocery, [White Poha Thick Aval 500 gm](https://www.freshonthegrocery.ca/products/b72d1f3e3d/10705000000618279), product title and description. Accessed 2026-10-12 through the current search-indexed listing; direct page retrieval was unavailable. | The Canadian English listing calls its product White Poha Thick Aval and says white aval is beaten rice. It mentions breakfast, upma, and dessert uses. The title's white/thick qualifiers are product-specific. The 500 g is package size, not a serving or conversion. |
| Reused `WP03-S93` | Council of Scientific and Industrial Research / CFTRI, [Socially Relevant Technologies](https://www.csir.res.in/sites/default/files/2023-06/Compendium-of-Social-relevant-technologies-2.6.2021.pdf), cereal-flakes entry, PDF pp. 52–53. | Groups rice flakes, flaked rice, beaten rice, aval/avalakki, poha, and chiwda as regional names for the processed product. Supports the family-level identity; does not settle each regional spelling's separate search behavior. |
| Reused `WP03-S92` | Central Food Technological Research Institute, [Improvement of the traditional process for rice flakes](https://ir.cftri.res.in/6762/), 1982 abstract. | Identifies rice flakes as poha/avalakki and describes soaking, roasting, and flaking. Its yield observations concern paddy processing conditions, not household recipe measures or cooking yield. |
| Reused `WP03-S95` | Atlantic Superstore, [International Foods (fr-CA)](https://www.atlanticsuperstore.ca/fr/clpplp/clpplp/clpplp/food/international-foods/c/58044), French product category. | The current indexed French listing names the product `Suraj Flocons de riz (Poha) 300 g`. Supports existing market wording; the package size is not a recipe measure. |
| Reused `WP03-POHA-GRADES-20261010-S02` | Spice Divine, [From The Earth Thin Poha 800 g (fr-CA)](https://spicedivine.ca/fr/products/from-the-earth-thin-poha-800g), French product description. | Uses `riz aplati` and `riz battu` for poha and describes thin flakes. The product page currently shows out of stock; it supports wording, not availability or a universal grade standard. |
| Reused `WP03-RRPOHA-20261012-S02` | Walmart Canada (French), [Unitaste Riz Rouge Poha / Matta Aval — Riz Rouge Aplati](https://www.walmart.ca/fr/ip/Unitaste-Riz-Rouge-Poha-Matta-Aval-500g-17-6oz-Riz-Rouge-Aplati-pour-Recettes-Traditionnelles/1EW9HTGVSXW8), product title and description. | Product-qualified French marketplace wording ties `Matta Aval` to a red-rice-flake listing. It supports keeping that phrase out of this generic alias; direct page retrieval was unavailable in the referenced review, and no general fr-CA term is inferred. |

## Live local evidence snapshot

Read-only snapshot refreshed on 2026-10-12. SHA-256 values cover exact file bytes. The recipe corpus fingerprint hashes each manifest-relative recipe path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | SHA-256 / fingerprint |
| --- | ---: | --- |
| Active ingredient references | 1,288 (124 `GRAIN_AND_CEREAL`) | `d20bc95f97b8d78ee6709655f3321ff000925c135862fd15cbc52e7d85e473ad` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research-ledger records | 1,596; 5,718 source entries; 4,743 distinct source IDs | `91c80a5c5fc283dbdea2b1e6bda350f0eb1caf08ca8e4a596bd0a99cd5e9ceb1` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The live generic-poha ledger record remains identity-verified, with measurement not yet researched and substitutions blocked pending evidence. No candidate source ID or exact `aval` owner is allocated. These counts and hashes describe this audit point and are not integration claims.

## Disposition

For integration, add one English alias `aval` to `ingredient-ref-flattened-rice-poha`. Keep the existing displays and French aliases, all forms and numeric fields, the red-rice and corn-poha boundaries, the recipe corpus, and ledger states unchanged. Do not add `avalakki`, color/grade-qualified aval phrases, a French alias, or a substitution. Section F's broader regional cereal-mix and preprocessed-grain review remains open.

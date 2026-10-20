# WP04 Proposal: Tempeh Identity and Satay Note Boundary

**Review date:** 2026-10-10

**Status:** Root integrated one identity-only tempeh reference and source-qualified CNF portion evidence. Recipe 095 retains its local pork-to-tempeh note without a new ingredient row, transferred quantity, or reusable substitution rule.

## Scope and disposition

The open WP04 Section R checklist names tempeh among the plant-based protein products still to review. The earlier [animal-food residual audit](wp04-animal-foods-residual-coverage-audit-20261010.md) correctly found no tempeh ingredient in `ingredients[]`; this follow-up also checks recipe notes and finds one explicit tempeh variation in recipe 095, *Satay*. The mention is not an ingredient row, and its recipe source field is null.

Propose one separate `PROTEIN` identity, `tempeh / tempeh`, with no aliases, forms, density, or unit mappings. Do not add a tempeh ingredient row to recipe 095, transfer the pork amount, or turn the note into a global or contextual substitution rule. The note is a recipe-local instruction with unresolved provenance and no replacement amount.

## Exact recipe demand and live catalog state

| Reference | Bundled text and structured state | What it supports and what remains open |
| --- | --- | --- |
| Recipe `095`, `Satay`, `languages.en.notes` and `languages.fr.notes` | EN: `Tempeh variation: replace the pork with tempeh cut into 1-inch strips, then cook sous vide at 88°C/190°F for 3 h.` FR: `Variante tempeh : remplacer le porc par du tempeh coupé en lanières de 1 po, puis cuire sous vide à 88°C/190°F pendant 3 h.` | Direct bundled evidence that this recipe carries a named tempeh option and a recipe-local cut/method note. It gives no tempeh amount or pork-to-tempeh ratio. The recipe's `source` field is `null`; the original source for this note cannot be verified from the bundle. |
| Recipe `095#1`; ingredient UUID `9ec0ba36-1f7e-47d0-aedc-22ca03a5c672-ingredient-1` | `1 lb boneless pork loin chops, cut into diagonal strips`; quantity `1`, unit `lb`; `ingredientRefId: ingredient-ref-pork-loin-chops`. | Keep the existing pork line and link intact. The pound amount belongs to the listed pork ingredient and cannot be transferred to the note-only tempeh variation. |

The exact `tempeh` / `tempe` names have no owner among the active ingredient references, ingredient forms, legacy-import candidates, or research-ledger record IDs. The current reference categories have no dedicated plant-protein value; `PROTEIN` is the existing category for this source-supported protein identity. Keep tempeh separate from pork, chicken, tofu, natto, textured vegetable protein, and other formed meat alternatives.

## Supported identity and product boundary

The OQLF's current food-domain entry uses preferred Québec French **tempeh** and pairs it with English **tempeh**. It defines the product as cooked and fermented soybeans—or, less commonly, other legumes or cereals—bound into a firm mass by *Rhizopus* [S01]. Health Canada's Food Guide separately lists tempeh under soy products and plant-based protein foods, alongside but distinct from tofu [S02]. USDA SR24 describes tempeh as a fermented cake product and distinguishes it from natto, tofu, and textured vegetable protein [S04].

Recommend this identity only:

| Stable ID | Category | English display | fr-CA display | Aliases | Scope |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-tempeh` | `PROTEIN` | `tempeh` | `tempeh` | none | The named fermented culinary product family. The recipe note does not specify soybean-only, another legume/grain base, seasoning, brand, or package state. |

The word “tempeh” in the note does not establish a cooked, smoked, flavoured, frozen, or ready-to-eat form. Its 1-inch strips are a recipe preparation cut, not a distinct ingredient form. Do not add `tempe` as an alias: OQLF selects `tempeh`, and the bundle uses that spelling in both languages. Do not alias the name to pork, chicken, tofu, natto, or TVP.

## Measurement and substitution evidence

Health Canada's CNF food code `4986`, *Soybean, fermented products, Tempeh (tempe), cooked*, reports `1 serving = 150.0 g`, `100 grams of edible portion = 100 grams`, and `total refuse 0%` [S03]. This is a source-specific portion for the cooked soybean-tempeh record. It is not a retail package size, a one-inch-strip measure, or the amount of tempeh for recipe 095. The recipe note gives no amount and does not specify the starting or served state, so do not attach 150 g to the note or infer a pork replacement ratio.

The ledger now keeps the 150 g value as one source-qualified `portion_weight` observation for the exact cooked CNF food description, with `sourceQuantity` of one source serving and `evidenceKind: published_portion`. Its cooked-state and soy-food qualifiers remain attached. The observation is outside `defaultDensity`, `unitMappings`, and recipe 095's ingredient list. No count, purchase-yield, cooking-yield, raw-to-cooked conversion, or general tempeh mass is supported.

The local note says tempeh can replace pork in this Satay version, but the source URL is missing and the note supplies neither a tempeh quantity nor a formulation or performance basis. Do not treat this mention as proof of equal mass, cooking equivalence, or a general pork-to-tempeh substitution. Keep substitution research `not_yet_researched` for reusable rules; create no `SubstitutionFinding` or runtime rule. The stated sous-vide conditions remain quoted recipe-note text only and are not promoted as general preparation or food-safety guidance.

## Integrated evidence record

Root created the `ingredient-ref-tempeh` ledger record and added only source-qualified evidence:

- Add source citations S01–S04 with their dates, locators, and limits below. Use them for the bilingual identity, product boundary, plant-protein classification, and the exact CNF portion only.
- Record the CNF code 4986 `1 serving = 150 g` as the single cooked-soy-tempeh `portion_weight` observation described above. Keep the observation source-specific and inactive as a conversion.
- Set `identityState: verified` and `measurementState: researched_supported` only for the exact source-scoped cooked portion. Keep `substitutionResearchState: not_yet_researched`; the bundled note is not an externally traceable substitution study.
- Keep the base `ingredient-ref-pork-loin-chops` row, recipe note, recipe count and amount, forms, active conversions, and substitutions unchanged.

Do not add a ledger source entry for the bundle note as if it were an external publisher source: its `source` field is null. Preserve the local note as the only recipe-context evidence until the original source is established.

## Source register

Sources were accessed on **2026-10-10**. The recipe file itself was re-read from the current bundled package on that date.

| Source ID | Primary source and locator | Claim supported and limit |
| --- | --- | --- |
| `WP04-TEMPEH-20261010-S01` | Office québécois de la langue française, [tempeh, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17049860/tempeh), food domain; updated 2025. | Preferred Québec term `tempeh`; English translation `tempeh`; product definition includes cooked and Rhizopus-fermented soybeans or less commonly other legumes/cereals. Terminology and broad product-family evidence, not a recipe amount or substitution rule. |
| `WP04-TEMPEH-20261010-S02` | Health Canada, [Cooking with plant-based protein foods](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/cooking-plant-based-protein-foods.html), “Types of plant-based protein foods,” “Choosing,” and “Preparing and cooking”; page details 2026-04-23. | Classifies tempeh under soy products and plant-based protein foods; gives general shopping/preparation guidance. Does not support a pork replacement ratio, recipe-specific performance, or safe time/temperature. |
| `WP04-TEMPEH-20261010-S03` | Health Canada CNF, [food code 4986: Tempeh (tempe), cooked](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4986), serving-size page. | One source serving = 150.0 g; 100 g edible portion = 100 g; total refuse 0%. This applies to the exact cooked soybean-tempeh CNF record only, not to the unqualified Satay note or retail package. |
| `WP04-TEMPEH-20261010-S04` | USDA ARS, *Composition of Foods: Raw, Processed, Prepared — National Nutrient Database for Standard Reference, Release 24* (September 2011), [official PDF](https://www.ars.usda.gov/ARSUserFiles/80400535/DATA/sr24/sr24_doc.pdf), “Notes on Foods — Legumes and Legume Products,” soybean products, printed pp. 77–78 (PDF pp. 79–80). | Distinguishes tempeh from natto, tofu, and textured vegetable protein using their processes/product descriptions. Historical product-boundary reference, not a current market survey, standardized formulation, recipe match, or measure. |

## Integration checks

- Added only one new identity, `ingredient-ref-tempeh`, with `PROTEIN` category and bilingual display `tempeh` / `tempeh`; aliases remain empty.
- Keep tempeh distinct from pork, chicken, tofu, natto, TVP, tempeh-flavoured products, and other formulated meat alternatives.
- Preserve recipe 095's note as a local alternative, with no new `ingredients[]` row and no inferred amount from the pork's `1 lb` line.
- The CNF portion retains food code 4986, cooked state, source serving, edible portion, and 0% refuse as source-specific evidence; no density or unit mapping is active.
- Do not create a substitution rule, conversion, yield, form, or safety claim. Keep reusable substitution research open until the original recipe source and product-specific amount/context can be verified.

No recipe ingredient row, source-less external citation, form, runtime measurement, conversion, or substitution rule was added. Verification results are recorded in the matching batch README.

# WP03 Section H frozen shelled edamame form review — 2026-10-13

- **Status:** Integrated as `ingredient-form-edamame-frozen-shelled` under `ingredient-ref-edamame`; see [integration record](../batches/wp03-section-h-frozen-shelled-edamame-form-integration-20261013/README.md).
- **Scope:** One Section H form candidate under the existing green-edamame identity.
- **Recommendation:** Add one frozen, shelled product form to `ingredient-ref-edamame`. Do not add a new ingredient identity, numeric conversion, recipe link, or substitution rule.

## Decision and rationale

The catalog already identifies immature green soybeans as `edamame / fèves de soya vertes`. A focused 2026-10-11 integration deliberately left fresh/frozen, in-pod/shelled, and cooked states unmodeled because the bundled recipe corpus had no edamame line. New Québec evidence changes the product-form boundary: Metro currently lists a frozen, shelled product in both locales under the same product number, and its Québec recipe pages call for that specific presentation in measured amounts.

Add only the frozen, shelled form below. Keep frozen in-pod edamame outside this form. Do not add a broad “frozen edamame” alias: it would discard the shell distinction and could misclassify an in-pod product. The external recipes establish Québec culinary use, but the bundled package still has zero edamame ingredient rows, so no recipe line should be linked.

## Review snapshot and prior work

The 2026-10-13 package snapshot has 1,391 active ingredient references, 100 forms, 63 legacy candidates, and 1,724 research-ledger records. The active catalog contains 42 `LEGUME_AND_PULSE` references and 9 forms attached to that category. The 114 manifest-listed recipes contain 1,123 ingredient rows.

- Active `ingredient-ref-edamame`: `edamame / fèves de soya vertes`; aliases `edamame bean`, `green vegetable soybean`, `vegetable soybean`, `fève edamame`, `édamames`, and `fève de soya verte`. Category is `LEGUME_AND_PULSE`; density is null and unit mappings are empty.
- Mature soybeans remain a separate active reference, `ingredient-ref-soybeans` (`soybeans / fèves de soya`).
- No active reference, form, or legacy candidate owns the qualified phrases `frozen shelled edamame`, `shelled edamame`, or `edamames écossés surgelés`. No proposed form ID collision exists.
- The ledger verifies the edamame identity but leaves measurement and substitution research not yet researched. No source IDs with the prefix `WP03-H-EDAMAME-FORM-20261013-` are present.
- The prior [soybean and edamame integration](../batches/wp03-soybeans-edamame-integration-20261011/README.md) explicitly left frozen, podded, shelled, and cooked states unmodeled. The [lentil/pea/soy coordinator review](wp03-lentils-peas-soybeans-coordinator-review-20261009.md) and the integrated [residual pulse-form corpus audit](wp03-h-pulse-form-residual-corpus-audit-20261011.md) likewise found no bundled edamame demand. This proposal does not reopen their identity decisions; the new Metro recipe evidence supplies the missing product-form use case.

The [global catalog plan, Section H](../../RecipeBook-global-ingredient-catalog-plan.txt) leaves whole/split and hulled/unhulled distinctions open where meaningful and leaves dry, soaked, cooked, canned, puréed/refried, and fermented forms open where justified. The [roadmap entry for the 2026-10-11 soybeans/edamame integration](../../../roadmap.md#L251) records the earlier identity-only boundary. This review resolves one narrowly named retail form only.

## Proposed form

| Field | Proposed value |
|---|---|
| ID | `ingredient-form-edamame-frozen-shelled` |
| Parent | `ingredient-ref-edamame` |
| `formCode` | `frozen_shelled` |
| English label | `frozen shelled edamame` |
| fr-CA label | `edamames écossés surgelés` |
| `prepState` | `frozen` |
| English match terms | `shelled edamame` |
| French match terms | `edamames écossés` |
| Density / unit mappings | `null` / none |
| Recipe links / package yields | None |

The proposed French display is directly attested in a current Metro Québec product title. OQLF supports the base terms `fève de soya verte` and `édamame`, including plural `édamames`; it does not adjudicate the full frozen/shelled compound. Treat the qualified label as market-attested Québec wording, not an OQLF-preferred term. Confidence is high for the identity and medium for the exact qualified form label.

The shorter match terms are exact subphrases of the paired retailer titles and allow a picker form hint for an explicitly shelled query. Do not add unqualified `frozen edamame`, `edamames surgelés`, or `green soybeans` as form match terms.

## Ownership and picker projection

An exact-term scan covered active reference names and aliases, forms and match terms, and legacy candidates. Static inspection of `IngredientReferenceSearchIndex` shows attached form terms are indexed on their parent reference, so they project to the same ingredient row; a form hint is returned only when the complete query equals one form search term. Search normalization folds French accents.

| Query or neighbor | Current owner / result | Projection after this proposal |
|---|---|---|
| `edamame`, `édamame`, `édamames`, `fèves de soya vertes`, `fève de soya verte` | `ingredient-ref-edamame` | Same single base reference; no duplicate identity. |
| `frozen shelled edamame`, `shelled edamame` | No exact active reference, form, or legacy owner | One result: `ingredient-ref-edamame`; exact form phrase supplies `ingredient-form-edamame-frozen-shelled` as the selected form hint. |
| `edamames écossés surgelés`, `edamames écossés` | No exact active reference, form, or legacy owner | One result: `ingredient-ref-edamame`; accent-folded and accented queries map to the same form hint. |
| `soybeans`, `fèves de soya` | `ingredient-ref-soybeans` | Remains separate; no alias or form is moved across identities. |
| `edamames en cosse surgelés` | No current picker match; the prior integration documents a Québec in-pod product | Remains no result and is not assigned to the shelled form. The proposed terms do not claim an in-pod state. |

The form labels and match terms create no new ingredient search result. Only the existing edamame reference owns these queries after integration; the picker can carry the form when the full shelled phrase is explicit.

## Recipe demand

A scan of all 114 manifest-listed recipe files found no edamame or green-soybean term in any ingredient row or recipe text. The app corpus therefore contributes zero edamame links.

The new evidence is external, Québec-local recipe demand:

- Metro’s *Bols poké Irresistibles* (2023-09-13) specifies `1/2 tasse` of Mieux-Être organic frozen shelled edamame, prepared per the package directions.
- Metro’s *Tartine poulet, basilic et pesto d’edamames* (2018-05-08) specifies `375 ml (1 1/2 tasse)` frozen, shelled edamames for four portions; its method cooks them for 3–4 minutes, rinses, and purées them.
- Metro’s *Curry minute* (2014-03-28) specifies `125 ml (1/2 tasse)` of shelled, frozen edamame for four portions and simmers them for two minutes.

These are distinct recipe-specific uses of the same frozen-shelled presentation. They justify representing the form for future picker use, but do not justify adding an external recipe to the bundled package or changing any current recipe row.

## Measurement and substitution boundary

The Metro recipes report volume amounts only. The explicit `375 ml = 1 1/2 tasse` and `125 ml = 1/2 tasse` pairs are source-specific recipe amounts, not mass conversions. The poké recipe’s `1/2 tasse` likewise has no paired weight. Metro’s bilingual product listing gives a 450 g package size, not a cup weight or recipe yield.

Health Canada’s 2015 CNF online entry for food code 6217 is titled `Soybeans, green (edamame), frozen, unprepared`. It lists 100 ml = 49.9 g, 125 ml = 62.3 g, and 250 ml = 124.7 g; its `Refuse` section is blank. This is evidence for source-specific serving-weight observations for that exact CNF record. It does not establish whether the product is shelled or in pods: neither the English nor French description says so. The online record also does not expose the underlying `FoodSourceID` or `CountryCode` fields from the downloadable relational data, so this review cannot verify the row’s underlying source match. Health Canada’s database guide shows those fields and the refuse and conversion-factor files are separate metadata.

Therefore, measurement research is supported for the generic CNF 6217 entry: the three pairs may be retained as ledger-only observations explicitly scoped to the 2015 CNF food code. Measurement research remains unresolved for this proposal’s exact frozen-shelled form because CNF 6217 does not identify shell state. Do not attach its observations to the form or turn them into an active unit mapping or default density.

For comparison, CNF food code 2208 is explicitly raw green edamame and lists 100 ml = 108.2 g, 125 ml = 135.2 g, and 250 ml = 270.0 g, with 47% refuse as pods. Do not transfer that refuse rate to 6217. Conversely, do not treat 6217’s blank refuse section as proof of zero refuse or as proof that it is shelled; no edible/refuse adjustment is justified from either record for the proposed form.

No reviewed source supports a frozen-to-cooked conversion, cooking yield, package yield, or substitution with peas, mature soybeans, or in-pod edamame. Keep density and unit mappings empty.

## Sources

All online sources were accessed 2026-10-13. Source IDs S02–S05 were added to the form ledger record, while S06–S08 were added to the parent edamame record for the generic CNF observations.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| `WP03-H-EDAMAME-FORM-20261013-S01` | Office québécois de la langue française, [fève de soya verte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532560/feve-de-soya-verte), definition and preferred terms (updated 2019). | Defines the green soybean as consumed before maturity; supports `fève de soya verte`, `édamame`, the plural `édamames`, and English `edamame`. It does not establish a frozen/shelled form name. |
| `WP03-H-EDAMAME-FORM-20261013-S02` | Metro, [French product listing](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/fruits-et-legumes/legumes/edamames-ecosses-surgeles/p/059749994361) and [English product listing](https://www.metro.ca/en/online-grocery/aisles/frozen/fruit-vegetables/vegetables/frozen-shelled-edamame/p/059749994361), product 059749994361. | Same 450 g product number is titled `Edamames écossés surgelés, Biologique` in French and `Frozen Shelled Edamame, Organic` in English; ingredient statement is edamame. The page may report out-of-stock for the selected store; listing evidence is not a claim of local availability. |
| `WP03-H-EDAMAME-FORM-20261013-S03` | Metro, [Bols poké Irresistibles](https://api.metro.ca/recettes-et-occasions/recettes/bols-poke-irresistibles), ingredient list; published 2023-09-13. | Uses `1/2 tasse` of the same retailer’s frozen, shelled edamame product. No weight is stated. |
| `WP03-H-EDAMAME-FORM-20261013-S04` | Metro, [Tartine poulet, basilic et pesto d’edamames](https://www.metro.ca/recettes-et-occasions/recettes/tartine-poulet-basilic-et-pesto-d-edamames), ingredient list and pesto method; published 2018-05-08. | Uses 375 ml (1 1/2 tasse) frozen, shelled edamames for four portions and gives a recipe-specific cook/rinse/purée method. No mass or general yield is stated. |
| `WP03-H-EDAMAME-FORM-20261013-S05` | Metro, [Curry minute](https://www.metro.ca/recettes-et-occasions/recettes/curry-minute), ingredient list and method; published 2014-03-28. | Uses 125 ml (1/2 tasse) shelled, frozen edamame in a four-portion recipe and simmers for two minutes. No mass or general yield is stated. |
| `WP03-H-EDAMAME-FORM-20261013-S06` | Health Canada, [Canadian Nutrient File serving portion: Soybeans, green (edamame), raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2208), food code 2208, serving sizes and refuse. | Reports raw-edamame serving-volume weights and 47% pod refuse. This is explicitly not a conversion source for frozen, shelled beans. |
| `WP03-H-EDAMAME-FORM-20261013-S07` | Health Canada, [Canadian Nutrient File serving portion: Soybeans, green (edamame), frozen, unprepared](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6217), food code 6217, description, serving sizes, and refuse section. | The 2015 online record gives 100 ml = 49.9 g, 125 ml = 62.3 g, and 250 ml = 124.7 g. It does not state shelled or in-pod; its refuse section is blank. Supports source-qualified observations only, not a form match or active mapping. |
| `WP03-H-EDAMAME-FORM-20261013-S08` | Health Canada, [CNF FAQ](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/frequently-asked-questions-canadian-nutrient-file.html) and [2015 database structure guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-database-structure.html), sections on downloadable metadata and Food Name, Refuse Amount, and Conversion Factor files. | Health Canada says the online CNF is the 2015 version and the complete downloadable files contain additional source, quality, and data-type metadata. The structure guide documents FoodSourceID and CountryCode in Food Name, with refuse and conversion factors in linked files. Those row-level source fields are not visible in the online 6217 page, so this proposal makes no claim about 6217’s underlying source match or shell state. |

## Pre-integration static checks

- Before integration, the requested proposal path and proposed form ID were absent from the package and ledger.
- Active picker ownership and bundled recipe rows were scanned; the proposed form resolves to one existing identity and creates no bundled recipe link.
- No app tests or emulator checks were run because the changes add database JSON data.


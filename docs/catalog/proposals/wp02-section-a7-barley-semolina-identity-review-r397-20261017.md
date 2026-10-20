# WP02 Section A7 R397: Québec barley semolina identity

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This file does not change the active catalog, ingredient forms, research ledger, plan, roadmap, recipe package, or any other proposal.
- **Open checklist:** WP02 Section A7 still asks for review of other grain meals at [plan line 2004](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Prior reviews:** [R385](wp02-section-a-next-milling-gap-review-r385-20261017.md) held Finnish rye semolina / Ruismanna; [R394](wp02-section-a7-next-milling-gap-review-r394-20261017.md) added spring wheat semolina and left generic wheat meal unresolved. This R397 review considers a separate barley milling product.
- **Proposed source-ID prefix:** `WP02-A7-BARLEY-SEMOLINA-R397-20261017`; IDs below are proposal-local. No source entry is added to the shared ledger.
- **Scope:** Review barley semolina against current barley meal, flour, cereal, and couscous ownership, Québec naming, picker results, bundled recipe demand, measurements, and substitutions. This does not resolve generic `barley meal` or the broad `dchicha` / `belboula` family.

## Recommendation

Add a distinct identity for the source-named barley milling product:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-barley-semolina` |
| Category | `GRAIN_AND_CEREAL` |
| English display | `barley semolina` |
| French display | `semoule d'orge` |
| English aliases | `medium barley semolina` |
| French aliases | `semoule d'orge grosseur moyenne` |
| Forms | none |
| Default density / unit mappings | none |
| Measurements, conversions, yields, recipe links, substitutions | none |

A 2025 Québec recipe book uses `semoule d'orge` as a recipe ingredient and names medium-size semolina in both its ingredient line and Québec local-buying guide. Health Canada's French terminology list separately names semolina, milled barley, barley flour, and bran as barley-grain products; the Canadian Food Inspection Agency's import taxonomy has a distinct barley-gruau/semolina class. A Canadian retailer lists an English-labeled medium barley-semolina product with the French wording `semoule d'orge`. Together these sources support a narrow, bilingual barley-semolina identity. The French display is directly attested in Québec food-use text, but is not an OQLF ruling or a claimed standardized French equivalent.

The proposed `GRAIN_AND_CEREAL` category follows the current grain-specific semolina precedent `ingredient-ref-sorghum-semolina`; barley semolina remains distinct from barley flour, which is categorized as `FLOUR_AND_STARCH`.

Keep this identity separate from the unresolved generic `barley meal` candidate. Prior Canadian evidence uses `barley meal` for more than one grind boundary, including whole barley ground fine-to-coarse and cross-cut barley pieces also called grits. Do not add `barley meal`, `barley grits`, or `cracked barley` as aliases. Keep `farine d'orge / barley flour` on its existing row, and do not move `belboula` from `ingredient-ref-barley-couscous`. Do not add `dchicha`, `tchicha`, `balboula`, or `belboula`: R41 documents variation in these terms and the active `belboula` alias already points to barley couscous.

The local recipe and Canadian retail listing both say medium size, but neither defines sieve limits or a transferable grain-size class. Retain the exact medium phrases as narrow search aliases for this identity; do not create a reusable medium-grind form until a product or standard gives it an explicit boundary. The recipe's quantity and Health Canada's composite flour-or-semolina food code are observations, not general conversions for barley semolina. No supported substitution rule was found in the reviewed exact-class material.

## Current-state audit

The following snapshot was checked against the live split seed package and current catalog sources.

| Store | Snapshot | Ownership result |
| --- | ---: | --- |
| Active ingredient references | 1,706 rows; SHA-256 `c576194c982048b2baf8a0819f82896179172055fc550f24f3872b451c6f3c74` | No row owns `barley semolina`, `semoule d'orge`, or the proposed ID. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form owns barley semolina or either medium-size phrase. |
| Legacy import identities | 56 candidates | No exact barley-semolina identity or phrase owner. |
| Research ledger | 2,066 records / 9,336 source entries | No dedicated barley-semolina record. `candidate-barley-meal` remains `needs_clarification`, with measurement and substitution research still `not_yet_researched`. `ingredient-ref-barley-couscous` discusses semolina in its source history but is not an owner for the dry semolina identity. |
| Recipe manifest | 114 recipe files; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Full corpus scanned; results below. |

Relevant active rows remain:

- `ingredient-ref-barley`: `barley / orge`.
- `ingredient-ref-barley-flour`: `barley flour / farine d'orge`.
- `ingredient-ref-whole-barley-flour`: `whole barley flour / farine d'orge entière`.
- `ingredient-ref-cream-of-barley-cereal`: `cream of barley cereal / crème d'orge`, a cereal preparation.
- `ingredient-ref-barley-couscous`: `barley couscous / couscous d'orge`, with the existing English alias `belboula`.
- `ingredient-ref-sorghum-semolina` and `ingredient-ref-spring-wheat-semolina`: grain-qualified semolina neighbors, not barley owners.
- `ingredient-ref-rye-meal`: `semoule de seigle` remains an alias on the separately scoped rye-meal identity.

The prior [barley-meal product-boundary review](wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md) held generic barley meal because Canadian sources did not establish one stable class and Québec display. This proposal uses a narrower product name, corroborated by Québec recipe use, and does not reopen that hold. [R41](wp03-section-f-balboula-belboula-picker-boundary-hold-20261013-r41.md) held broader Balboula/Belboula naming; the Québec recipe source adds evidence for `semoule d'orge` as an ingredient name, not a basis to assign those broad names to it.

## Picker projection

`IngredientSearch.kt` folds accents and punctuation, checks complete word phrases across names and aliases first, then uses substring fallback. This projection adds the proposed canonical bilingual names and the two source-attested medium-size aliases, with no forms.

| Query | Current result(s) | Projected result(s) |
| --- | --- | --- |
| `barley semolina` | none | barley semolina |
| `semoule d'orge` | none | barley semolina |
| `medium barley semolina` | none | barley semolina |
| `semoule d'orge grosseur moyenne` | none | barley semolina |
| `semolina` | durum semolina; sankhal; remilled durum semolina; sorghum semolina; spring wheat semolina | prior five plus barley semolina |
| `semoule` | corn grits; cornmeal; durum semolina; rye meal; remilled durum semolina; sorghum semolina; spring wheat semolina; granulated sugar (through its form) | prior eight plus barley semolina |
| `barley meal` | none | none; generic barley meal remains unresolved |
| `barley flour` | barley flour; malted barley flour; roasted barley flour; whole barley flour | unchanged |
| `belboula` | barley couscous | unchanged; alias ownership stays on barley couscous |
| `dchicha`, `tchicha`, `balboula` | none | none; no broad alias is proposed |

The two medium aliases allow the picker to find the source's local recipe phrase and a current Canadian product wording. They do not add a medium form hint or imply a standard particle-size threshold.

## Bundled recipe-demand audit

All **114** manifest-listed recipe files and **1,123** ingredient rows were searched. The scan covered each serialized recipe and ingredient-row text, including `originalText`, `ingredientName`, preparation/notes, and reference IDs. Search phrases included `barley semolina`, `semolina barley`, `semoule d'orge`, `semoule d'orge grosseur moyenne`, `barley meal`, `barley grits`, `dchicha`, `tchicha`, `belboula`, and `balboula`.

Results: **0 matching recipe files, 0 matching ingredient rows, and 0 links** to `ingredient-ref-barley-semolina`. The 2025 Québec pudding is external recipe evidence, not bundled-library demand. No recipe link or edit is proposed.

## Measurements, forms, and substitutions

- The Québec pudding recipe lists **1½ cups (315 g)** of medium-size barley semolina for 25 portions, then adds it to boiling milk and stirs until it thickens for about 15 minutes [S01]. This is a specific recipe observation. Do not derive or activate a general cups-to-grams mapping, density, cooking time, or yield from this one pudding formulation.
- Health Canada's Canadian Nutrient File food code 4872 lists **100 mL = 62.6 g**, **250 mL = 156.4 g**, and **one serving = 20 g**, but its bilingual food name groups barley flour and semolina together (`Grains, barley flour / Grains céréaliers, farine ou semoule d'orge`) [S05]. It does not isolate semolina, so those measures cannot be assigned to this identity.
- Canadian and distributor product listings show 1 kg packaging [S03, S04]. Package mass is not a household measure or density.
- The reviewed sources provide no sieve thresholds or common definition for medium barley semolina. Add no forms, density, unit mappings, conversions, or yields.
- No exact-class source reviewed states a substitute or ratio. The active global and contextual substitution files contain no barley-semolina rule. Add no same-ingredient form conversion or contextual substitution; keep this question open for recipe-specific evidence.

## Source register

| ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **WP02-A7-BARLEY-SEMOLINA-R397-20261017-S01** | Centdegrés / M361, [Pour des aliments québécois dans nos écoles: Répertoire de recettes simples et savoureuses avec des aliments d'ici](https://apprendre.centdegres.ca/wp-content/uploads/2025/12/MAPAQ_Repertoire-recettes-vf.pdf), printed pp. 28–29, recipe “Pouding semoule d'orge,” source ITHQ, accessed 2026-10-17. | Québec French ingredient wording `semoule d'orge grosseur moyenne`; 1½ cups (315 g) in a 25-portion pudding; local-buying guide names Moulin Abénakis and Semican for the medium-size ingredient. | Recipe and source-specific use, not an OQLF terminology ruling, sieve definition, general kitchen conversion, or proof of every named supplier's current product specification. |
| **WP02-A7-BARLEY-SEMOLINA-R397-20261017-S02** | Health Canada, [Résumé de l'évaluation d'une allégation santé au sujet des produits à base d'orge](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/etiquetage-aliments/allegations-sante/examen/evaluation-allegation-sante-sujet-produits-base-orge-diminution-cholesterol-sanguin.html), footnote 5, accessed 2026-10-17. | Lists semoule d'orge, orge moulue, farine d'orge, and son d'orge as distinct barley-grain product types. Used only for class terminology. | Regulatory health-claim review context, not an ingredient naming standard, milling threshold, or product claim for this proposal. The review makes no nutrition or health claim. |
| **WP02-A7-BARLEY-SEMOLINA-R397-20261017-S03** | Canadian Food Inspection Agency, [SARI update, 2024-12-02](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/vegetaux-produits-vegetaux/sari/mises-jour-acia-sari-2024-12-02), tariff headings 11.03.19.7101 and adjacent grain-milling headings, accessed 2026-10-17. | Canadian French import taxonomy names `Gruaux et semoules : D'orge` as a barley product class, separate from flour categories. | Customs/import classification, not a consumer definition or specification for granulation, food use, or bilingual display. |
| **WP02-A7-BARLEY-SEMOLINA-R397-20261017-S04** | ZaytunaMart, [Semolina Barley Dchicha Medium Alitkane 1 kg](https://www.zaytunamart.ca/products/semolina-barley-tchicha-fine-alitkane-1kg-copy), product title and description, accessed 2026-10-17. | Canadian retailer page pairs the English product title and medium grade with `semoule d'orge`; the site lists delivery to Montréal and Québec City. | Imported, source-specific product and retailer wording, not a Québec language authority; page showed the item out of stock. Its `Dchicha` / `belboula` wording is not adopted as an alias. |
| **WP02-A7-BARLEY-SEMOLINA-R397-20261017-S05** | Health Canada, [Canadian Nutrient File serving size, food code 4872](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4872), accessed 2026-10-17. | Provides the listed mass-volume amounts for the combined barley-flour-or-semolina food code. | The bilingual code combines flour and semolina and does not support a semolina-only value; no numeric value is activated. |
| **WP02-A7-BARLEY-SEMOLINA-R397-20261017-S06** | OMA Trading, [Product Catalogue](https://shop.oma-trading.be/files/catalog.pdf), 2024 catalogue, “TAYBA semoule d'orge moyen / medium barley semolina,” plus fine and coarse listings, accessed 2026-10-17. | Confirms a bilingual trade-label pairing and market use of medium, fine, and coarse grade wording for barley semolina. | Distributor catalogue outside Québec; product-grade names are not defined by sieve thresholds and catalogue package sizes do not establish kitchen measures. |

## Disposition

Promote only the proposed barley-semolina identity and its two narrow, source-attested medium-size search aliases if accepted. Keep generic `barley meal` unresolved, `belboula` on barley couscous, and flour, cereal-preparation, and couscous identities separate. Add no forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions. WP02 Section A7 remains open.

This is a documentation-only proposal. No unit, instrumentation, build, or emulator tests were run.

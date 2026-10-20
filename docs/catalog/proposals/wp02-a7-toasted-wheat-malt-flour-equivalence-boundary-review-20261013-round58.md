# WP02 A7 R58: Toasted Wheat Malt Flour Equivalence Boundary Review

- **Reviewed:** 2026-10-13
- **Status:** Root accepted the equivalence hold on 2026-10-13. Keep the toasted-wheat product wording unallocated and do not alias it to the active roasted-wheat-malt-flour row. No canonical catalog or ledger data changed.
- **A7 anchor:** The open parent item is [Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L1449), which continues review of other grain meals, malted/toasted flour identities, and gluten-flour equivalence.
- **Scope:** Whether source-named `toasted wheat malt flour / farine de blé malté toasté` should be treated as an alias or separate identity relative to the active `roasted wheat malt flour / farine de malt de blé torréfié` reference.
- **Proposal-local source IDs:** `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S01` through `S07`. These IDs are local to this proposal, not ledger source records.

## Recommendation

**Keep the toasted-wheat product phrase unallocated. Do not add `toasted wheat malt flour`, `farine de blé malté toasté`, or `slightly roasted wheat malt flour` as aliases to the existing roasted-wheat-malt-flour reference. Do not add a new active reference or ledger candidate from this review.**

The reviewed manufacturers name real, source-specific wheat-malt flour products, but they do not establish that `toasted`, `slightly roasted`, and the active row's unqualified `roasted` wording identify one interchangeable product class. Moulins Bourgeois lists a 25 kg toasted wheat malt flour and separately lists a black roasted wheat malt flour; its bilingual naming and package descriptions distinguish those products within its range [S03–S05]. Current IREKS North America pages name a Canadian-market product `slightly roasted wheat malt flour / farine de blé malté légèrement grillée`, with a 25 kg package and a 1–5% flour-basis professional dosage [S01–S02]. These source-specific descriptions do not establish a shared treatment sequence, grade, or functional equivalence.

Retain the active `ingredient-ref-roasted-wheat-malt-flour` and its current French display. Its existing bilingual ingredient-declaration source lists ordinary wheat malt flour separately from roasted wheat malt flour but does not identify a roast grade or specify whether the malt or the flour is heated [S06]. Keep this identity separate from ordinary malted wheat flour and generic malt flour. The OQLF entry `farine maltée` describes flour with added malt extract or ground malt; it does not define the more specific malted-wheat flour products reviewed here and should not be added as a synonym for them [S07].

No bundled recipe demand calls for the unallocated product. The package and bakery dosage are product-specific and provide no home measure, density, conversion, yield, or transferable substitution rule. The recommendation is a terminology and identity hold; it does not claim that no manufacturer or market uses these products.

## A7 and archive check

The A7 checklist is still open for further malted/toasted-flour identities and equivalence boundaries. The 2026-10-10 broad grain-meal and malted/toasted-flour review kept `toasted` and `roasted` from becoming general cross-cereal synonyms, but did not decide this wheat-malt product pair [the prior A7 review](wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md). The 2026-10-11 Québec French review retained the active roasted wheat malt flour row and documented that its manufacturer declaration does not specify which component is roasted [the roasted-flour review](wp02-roasted-flour-quebec-french-display-review-20261011.md). Neither packet assigns `toasted wheat malt flour` or its French wording. The R57 roasted-barley-malt review concerns a different cereal and remains separate [R57](wp02-a7-roasted-barley-malt-flour-identity-boundary-review-20261013-round57.md).

Before drafting, exact normalized ownership and proposal-archive searches found no prior focused disposition of `toasted wheat malt flour`, `farine de blé malté toasté`, or `slightly roasted wheat malt flour`. The closely related active wheat-malt rows are owners for their own phrases, not evidence that the new terms are synonyms.

Current snapshot: **1,382 active references**, **100 forms**, **63 legacy-import candidates**, **1,713 research-ledger records**, and **114 manifest-listed recipes with 1,123 ingredient rows**. The R58 source-ID prefix and filename were absent before drafting.

## Ownership and product boundary

| Current owner or record | Current state | Boundary relevant to this review |
| --- | --- | --- |
| `ingredient-ref-roasted-wheat-malt-flour` | `roasted wheat malt flour / farine de malt de blé torréfié`; no aliases; category `FLOUR_AND_STARCH`; null density and empty unit mappings. | The active identity is supported by a bilingual ingredient declaration separate from ordinary wheat malt flour. Its source gives no roast grade or treatment sequence [S06]. Retain its exact current ownership. |
| `ingredient-ref-malted-wheat-flour` | `malted wheat flour / farine de blé maltée`; no aliases. | Ordinary malted wheat flour has its own active identity. Do not assign toasted/roasted product wording here. |
| `ingredient-ref-malt-flour` | `malt flour / farine maltée`; English alias `malted cereal flour`. | This generic row does not resolve cereal-specific roasting or toasting. The OQLF definition describes malt added to flour rather than the source-specific products' treatment sequence [S07]. |
| Forms | No form belongs to `ingredient-ref-roasted-wheat-malt-flour`; there are 100 forms overall. | There is no same-ingredient form encoding toast, roast, or malt activity for these wheat products. Do not model an unresolved product identity as a form. |
| Legacy candidates | The 63-candidate legacy file has no exact owner for the toast/roast candidate phrases. | No legacy candidate needs merging or promotion. |
| Research ledger | `ingredient-ref-roasted-wheat-malt-flour` is verified; its measurement and substitution research states remain `not_yet_researched`. No toast-specific candidate record or exact toast-term source decision was found. | Preserve the accepted active row's source-specific boundary. This packet proposes no ledger rewrite or candidate record. |

## Picker consequences

The static projection follows complete normalized phrase matching, then partial matching, as implemented in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses current reference and form search terms; it is not a live app-picker test.

| Query | Current result | Consequence of this recommendation |
| --- | --- | --- |
| `roasted wheat malt flour`; `farine de malt de blé torréfié` | `ingredient-ref-roasted-wheat-malt-flour` | Keep the existing precise owner. |
| `malted wheat flour`; `farine de blé maltée` | `ingredient-ref-malted-wheat-flour` | Preserve ordinary malted wheat flour as a separate owner. |
| `toasted wheat malt flour`; `farine de blé malté toasté` | No result | Do not redirect an exact toasted-product query to the roasted row. |
| `slightly roasted wheat malt flour`; `farine de blé malté légèrement grillée` | No result | Do not treat the IREKS product-specific grade as an alias for the active row. |
| `wheat malt flour`; `farine de malt de blé` | `ingredient-ref-roasted-wheat-malt-flour` | The current partial phrase result is not proof of equivalence. Adding a separate toasted identity would make these broad queries return both wheat rows. |
| `malt flour` | Five rows: generic malt flour, roasted oat malt flour, roasted wheat malt flour, malted spelt flour, and roasted barley malt flour. | Keep the existing broad query multi-result; do not add a generic synonym. |

The source terms are not exact active names or aliases, and there is no exact form or legacy owner. Do not add `toasted wheat malt flour`, `farine de blé malté toasté`, or IREKS's `slightly roasted` phrase to an active reference unless a future decision establishes the intended identity boundary.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. The scan checked full serialized recipe JSON and the structured ingredient text fields for the candidate phrases, existing roasted/malted wheat names, and the reviewed French variants. It found **zero full-recipe text hits, zero ingredient-row hits, and zero direct links** to `ingredient-ref-roasted-wheat-malt-flour`. No bundled recipe calls for a toast/roast wheat-malt equivalence or recipe relink.

## Measurements, forms, and substitutions

- IREKS lists a 25 kg paper bag and a 1–5% dosage based on flour weight for its named `IREKS AROMA WHEAT MALT K` product [S01–S02]. This is manufacturer-specific bakery dosage and packaging, not a household measure, density, unit mapping, cooking yield, or transferable substitution ratio.
- Moulins Bourgeois lists its toasted product in a 25 kg bag and the separately named black roasted product in a 5 kg bag; the descriptions concern the named bakery products [S03–S04]. Package sizes are not volume or serving measures.
- The active roasted-wheat-malt row has no forms, unit mappings, package yields, substitution rules, or contextual substitution rules. Its ledger marks measurement and substitution research as not yet researched. No reviewed source validates substitution among toasted, slightly roasted, black roasted, ordinary malted wheat flour, or generic malt flour.
- Add no form, numeric data, conversion, yield, recipe link, or substitution rule from these product descriptions.

## Source register

Sources were reviewed on **2026-10-13**. IDs are local to this proposal.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S01` | IREKS North America, [IREKS AROMA WHEAT MALT K](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-wheat-malt-k), current product detail, accessed 2026-10-13. | Names “Slightly roasted wheat malt flour,” lists 25 kg paper packaging and a 1–5% dosage based on flour, and identifies IREKS North America at its Brampton, Ontario address. This is a named professional product, not a household measure or general grade specification. |
| `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S02` | IREKS North America, [French product search page](https://www.ireksnorthamerica.com/fr/produits/recherche-de-produits), IREKS AROMA WHEAT MALT K, accessed 2026-10-13. | Names the same Canadian-market product `Farine de blé malté légèrement grillée avec une note de caramel malté`. Supports this manufacturer's bilingual phrasing; it does not establish that the product is equivalent to every unqualified roasted or toasted wheat-malt flour. |
| `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S03` | Moulins Bourgeois, [2024 English product catalogue](https://www.moulins-bourgeois.com/wp-content/uploads/2024/10/Catalogue-EN-EU-1.pdf), “Ingredients toasted/roasted.” | Lists `Toasted wheat malt flour`, describes its bakery use as adding colour and a sweet taste, and gives a 25 kg bag. This French supplier catalogue does not establish Québec availability or universal process equivalence. |
| `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S04` | Moulins Bourgeois, [2024 French product catalogue](https://www.moulinsbourgeois.fr/pdf/Catalogue-produits-MoulinsBourgeois2024.pdf), “Ingrédients toastés / torréfiés.” | Lists `Farine de blé malté toasté` in a 25 kg bag and separately lists `Farine de blé malté torréfié (noir) (bio)` in a 5 kg bag, with distinct descriptions. This is source-specific product separation, not a general definition of `toasté` versus `torréfié`. |
| `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S05` | Moulins Bourgeois / Certipaq Bio, [2020–2022 bilingual organic certificate](https://www.moulins-bourgeois.com/wp-content/uploads/2021/01/moulins-bourgeois-organic-certificate.pdf), pp. 8–9, issued 2020-11-04; validity through 2022-03-31. | Pairs `Farine de blé malté toasté / Toasted Wheat malt flour` and separately `Farine de blé malté toasté noir / Roasted Wheat malt flour (black)`. This historical certificate corroborates one producer's bilingual product names but does not establish present availability. |
| `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S06` | Diversi Foods, [Technical Sheet 74-05](https://diversifoods.com/uploads/files/technical-reports/74-05.pdf), bilingual ingredient declaration; existing active-row source `WP02-S129`, accessed in the active ledger on 2026-10-06. | Separately declares ordinary wheat malt flour and roasted wheat malt flour in English and French. The document does not give a roast grade or specify whether the malt or the flour is roasted. It supports the current owner, not equivalence with the new toast wording. |
| `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S07` | Office québécois de la langue française, [farine maltée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432785/farine-maltee), terminology record, last updated 1982. | Defines `farine maltée` as flour with malt extract or ground malt added. It does not define wheat malt flour that is toasted or roasted, nor validate a synonym for the products in this review. |

## Limits and test note

The exact toasted product pair is documented by a French manufacturer, not a Québec terminology authority or Canadian retail label. IREKS supplies current Canadian bilingual evidence for the closely related, explicitly **slightly roasted** product, but its wording cannot be generalized to the distinct Moulins Bourgeois product. The archive review and source search are bounded; they do not prove that no further Canadian label or technical specification exists.

This proposal changes no database JSON or application code. Under the current `AGENTS.md` rule, database-JSON-only additions require no testing; this proposal-only review also needs no app tests or emulator run. Static document checks are the only checks planned.

## Root integration result

Accepted as a bounded no-equivalence hold. The active `ingredient-ref-roasted-wheat-malt-flour` and `ingredient-ref-malted-wheat-flour` rows remain unchanged; no new alias, reference, ledger candidate, form, or recipe link was added. The A7 checklist and roadmap now record the disposition. See [`wp02-a7-toasted-wheat-malt-flour-equivalence-hold-integration-20261013/README.md`](../batches/wp02-a7-toasted-wheat-malt-flour-equivalence-hold-integration-20261013/README.md).

# WP02 A7 — Malted Quinoa Flour Boundary Review (R38)

- Reviewed: 2026-10-13.
- Status: Integrated documentation-only hold. The proposal, plan, roadmap, and batch README record the decision; no shared catalog, ledger, recipe, or package file was changed.
- Proposal-local source-ID prefix: `WP02-A7-MALTED-QUINOA-FLOUR-20261013-R38-S` (sources S01–S06). These IDs belong only to this proposal and are not ledger records.
- Scope: the experimental flour made from malted quinoa, called `malted quinoa flour` in food-science papers. Keep it distinct from plain, color-qualified, and roasted quinoa flour; whole quinoa malt; and generic malt flour. This review does not reopen R32–R37 or the earlier A7 grain-meal and rice-grits decisions.

## Disposition

Keep malted quinoa flour **unresolved and unallocated**. Add no active reference, alias, form, legacy identity, measurement, recipe link, conversion, yield, or substitution. Research papers establish an experimental food ingredient, but the sources reviewed do not establish a current Canadian or Québec standalone product specification or a Québec French product name.

The exact English phrase is attested in experimental studies; it is not a manufacturer product name in the sources reviewed. Québec sources use `farine de quinoa` for plain quinoa flour and distinguish a roasted product. `Farine de quinoa maltée` is a useful literal search phrase only; it is not verified as a Québec product label or a terminology recommendation, so do not add it as a display or alias.

Keep the candidate separate from `quinoa flour / farine de quinoa`, `roasted quinoa flour / farine de quinoa torréfiée`, the black, red, and white quinoa-flour references, whole `quinoa / quinoa`, and generic `malt flour / farine maltée`. The studies do not establish that malted quinoa flour is equivalent to any of these existing products.

## A7 and archive check

The active A7 parent item at [the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444) remains open for other grain meals, other malted/toasted flour identities, and gluten-flour equivalence. Before this proposal, no A7 proposal or ledger candidate named malted quinoa flour or quinoa malt flour. R37 concerns malted teff; earlier quinoa records concern whole quinoa, plain/color-qualified flour, roasted flour, flakes, or puffed quinoa. None resolves malted quinoa flour.

## Live ownership and picker audit

Pre-integration audit snapshot: **1,366 active references**, **100 forms**, **64 legacy candidates**, **1,699 ledger records**, **114 manifest-listed recipes**, and **1,123 ingredient rows**.

| Surface | Current finding |
|---|---|
| Active references | Eight references contain `quinoa`: `ingredient-ref-quinoa` (`quinoa / quinoa`, `GRAIN_AND_CEREAL`, alias `quinua`); `ingredient-ref-quinoa-flour` (`quinoa flour / farine de quinoa`); `ingredient-ref-roasted-quinoa-flour` (`roasted quinoa flour / farine de quinoa torréfiée`); `ingredient-ref-black-quinoa-flour` (`black quinoa flour / farine de quinoa noir`); `ingredient-ref-red-quinoa-flour` (`red quinoa flour / farine de quinoa rouge`); `ingredient-ref-white-quinoa-flour` (`white quinoa flour / farine de quinoa blanc`); `ingredient-ref-quinoa-flakes` (`quinoa flakes / flocons de quinoa`); and `ingredient-ref-puffed-quinoa` (`puffed quinoa / quinoa soufflé`). The flour references are separate `FLOUR_AND_STARCH` identities. The quinoa flour rows have no aliases, default density, or unit mappings. No active row owns a malted-quinoa phrase. |
| Forms | Only whole quinoa has forms: `ingredient-form-quinoa-dry` and `ingredient-form-quinoa-cooked`; both have no density, conversion, or cooking-yield relation. No flour or malted-quinoa form exists. |
| Legacy and ledger | No legacy candidate or ledger candidate record owns `malted quinoa flour`, `quinoa malt flour`, `malted quinoa`, or a French malted-quinoa phrase. Existing quinoa ledger records concern the separately identified active products; no candidate ownership or legacy mapping is proposed. |
| Proposal archive | No prior proposal adjudicates malted quinoa flour. The R38 filename and source-ID prefix were absent from the archive before this proposal. |

The picker implementation in `IngredientSearch.kt` normalizes accents and punctuation, searches names, aliases, and attached forms, prefers complete word-phrase matches, then falls back to substring matching. Static projections from the current references and forms are:

| Query | Current result |
|---|---|
| `malted quinoa flour`; `quinoa malt flour`; `farine de quinoa maltée` | No result |
| `quinoa flour`; `farine de quinoa` | Five flour references: plain, roasted, black, red, and white |
| `quinoa` | Eight quinoa-related references |
| `roasted quinoa flour`; `farine de quinoa torréfiée` | `ingredient-ref-roasted-quinoa-flour` |

These are code/package projections, not a live UI picker test. A future row named `malted quinoa flour` would broaden `quinoa flour` from five to six results and `quinoa` from eight to nine. If the unverified French phrase were later accepted, `farine de quinoa` would likewise broaden from five to six. No picker change is proposed now.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe JSON files** and their **1,123 ingredient rows** for malted quinoa, quinoa malt, quinoa flour, and French candidate phrases. There were **zero matching candidate or flour ingredient rows**. One row in one recipe mentions quinoa: `2 cups cooked quinoa` in [Quinoa Bites](../../../app/src/main/assets/seed/bundled-library/recipes/016-bouch-es-de-quinoa-quinoa-bites-98235299-3e38-4cf6-acbc-cb24bda45509.v1.json), linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`. It does not support a flour identity, candidate alias, or recipe link.

## Measurement, density, and substitution limits

- The 2021 study germinates black and white quinoa for 24–96 hours, dries it at 50 °C, then declumes, grinds, and sieves the material to obtain malt flour. These are experimental process conditions, not household measures, a commercial specification, or an exact-form density.
- The Québec Food Directory lists plain organic quinoa flour with a nutrition portion of 1/4 cup (30 g) and a serving size of 30 g. This is evidence for that named plain product only; it is not a reusable density or unit mapping and must not be transferred to malted quinoa flour.
- The 2019 gluten-free muffin study compares a 100% rice-flour reference with formulations using 30% replacement by whole or malted quinoa flour. That tested formula and its 24-hour-malted sample results are product- and recipe-specific. They do not establish a general substitution ratio for home recipes or an interchange with plain, roasted, or other malted flour.
- No reviewed source provides an exact-form household volume/weight mapping, density, or broadly tested substitution for malted quinoa flour. Add none.

## Sources and limits

Sources checked on 2026-10-13.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-MALTED-QUINOA-FLOUR-20261013-R38-S01` | Bhinder et al., [“Impact of germination on phenolic composition, antioxidant properties, antinutritional factors, mineral content and Maillard reaction products of malted quinoa flour”](https://pubmed.ncbi.nlm.nih.gov/33418417/), *Food Chemistry*, 346, 128915 (2021), DOI 10.1016/j.foodchem.2020.128915; abstract and malt-flour preparation description. | Names malted quinoa flour and describes experimental black and white quinoa malting, drying, decluming, grinding, and sieving. | Research material, not a current Canadian product, standardized commercial grade, Québec label, household measure, or substitution test. The process endpoints are not cooking conversions. |
| `WP02-A7-MALTED-QUINOA-FLOUR-20261013-R38-S02` | Miranda-Villa et al., [“Effects of Whole and Malted Quinoa Flour Addition on Gluten-Free Muffins Quality”](https://pubmed.ncbi.nlm.nih.gov/30569476/), *Journal of Food Science*, 84(1), 147–153 (2019), DOI 10.1111/1750-3841.14413; abstract, formulation design and 24-hour-malted result. | Confirms experimental food use of whole and malted quinoa flour in gluten-free muffins, including a 30% replacement formulation. | One study formulation does not validate a general substitution, product specification, household measure, or Québec French product name. |
| `WP02-A7-MALTED-QUINOA-FLOUR-20261013-R38-S03` | Office québécois de la langue française, [quinoa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa), definition and preferred term (updated 2025). | Supports the Québec term `quinoa` and identifies quinoa as a pseudocereal. | It does not name quinoa flour, malted quinoa flour, or a French name for the candidate. |
| `WP02-A7-MALTED-QUINOA-FLOUR-20261013-R38-S04` | Répertoire des aliments québécois, [Farine de Quinoa Biologique / Organic Quinoa Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223789), Cuisine Soleil product sheet; product name, description, ingredients, nutrition portion, and serving size (last updated 2026-03-09). | Current Québec product record for plain `farine de quinoa`; reports 1/4 cup (30 g) and a 30 g serving for that SKU. | It specifies plain organic quinoa flour, not a malted product. Its portion is not a general density, reusable mapping, or malted-flour measure. |
| `WP02-A7-MALTED-QUINOA-FLOUR-20261013-R38-S05` | Quinoa du Québec, [Nos produits pour les professionnels](https://www.quinoaquebec.com/nosproduitprofessionnel), flour section and product formats. | A Québec producer lists conventional and roasted `farine de quinoa` as separate flour products. | The public range reviewed is not a complete market survey; the page does not list or characterize malted quinoa flour and does not prove none exists elsewhere. It gives no malted-product French wording or measure. |
| `WP02-A7-MALTED-QUINOA-FLOUR-20261013-R38-S06` | Port Royal Mills, [Canadian product overview](https://www.portroyalmills.com/), product list and milling overview (page copyright 2026). | Current public Canadian mill index separately lists quinoa, malted barley, and malted wheat product families. | No malted-quinoa SKU/specification or French label is listed. A public category list is not proof of market-wide absence or special-order availability. |

## Next action

Keep malted quinoa flour inactive and unallocated. Reopen only if a current Canadian or Québec-facing source establishes a standalone food-flour product, its distinction from plain/roasted quinoa flour and whole quinoa malt, and a supported Québec French name. Then recheck picker ownership and exact-form evidence. Review density, measures, and substitutions separately; do not infer them from plain quinoa flour, malted-grain process research, or the muffin formula. This documentation-only hold adds no database JSON data and required no tests.

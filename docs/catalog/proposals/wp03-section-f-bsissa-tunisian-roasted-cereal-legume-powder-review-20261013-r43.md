# WP03 Section F — Tunisian Bsissa powder identity review (2026-10-13, R43)

## Review record

- **Scope:** the dry Tunisian *Bsissa* powder/mix made from roasted and milled cereals and legumes with seasonings.
- **Open checklist:** the regional cereal-mix and preprocessed-grain item remains open in the [live catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Status:** integrated 2026-10-13 as identity-only `ingredient-ref-bsissa` in the active reference catalog. No forms, measures, densities, unit mappings, recipe links, conversions, yields, substitutions, or shared-ledger record were added.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference with English and Québec French display names `bsissa / bsissa`, and the source-attested aliases `bsissa powder`, `bsissa flour`, and `bsissa en poudre`. Suggested ID: `ingredient-ref-bsissa`.
- **Boundary:** this identifies the dry, sellable powder family. Formulas vary by producer and region; the proposal does not assign one universal grain or legume formula. It excludes prepared Bsissa paste/cream/balls and ready-to-drink Bsissa beverages.
- **Data limits:** add no forms, measures, density, unit mappings, recipe links, conversions, yield, substitutions, or shared-ledger record.

## Why this is a distinct open item

The live Section F checklist still asks for regional cereal mixes and preprocessed grains. Focused searches of that checklist, roadmap, proposal and batch archive, active reference catalog, form catalog, legacy-import identities, research ledger, and manifest-listed recipes found no prior Bsissa review or exact owner. This review is separate from the Moroccan Zamita/Zammita/Zemita hold in [R42](wp03-section-f-zamita-zammita-product-family-boundary-hold-20261013-r42.md) and does not add those spellings as aliases.

The product family has a repeatable dry-product boundary, even though its formula varies. A 2020 survey by Tunisian agri-food researchers describes Bsissa as roasted, ground, and sifted multigrain flour based on cereals, legumes, spices, and aromatic herbs. The Lamta survey collected 103 formula types from local producers and records combinations ranging from one to nine or more ingredients, varying by region and family recipe [S01]. A 2021 *Food Control* study likewise describes commercial Bsissa as a traditional breakfast based mainly on roasted cereals, legumes, and spices and sampled 34 commercial products [S02]. These sources support a named product family, not one standardized recipe.

## English and Québec French naming and product boundary

Use **`bsissa`** as the primary name in both languages. The Québec-facing Aliments du Québec directory lists a locally prepared product as **Bsissa sans gluten**, classifies it under cereals and granola, and describes it in French as a breakfast mix of cereals and legumes [S03]. This supports the proper name *Bsissa* in Québec French; the qualifier *sans gluten* belongs to that one listed product and is not a family-wide property. The Québec maker's English page calls its own product **Gluten-free Bsissa flour** [S04]. Current Tunisian product pages use **Bsissa powder** in English and **Bsissa en poudre** in French [S05, S06]. The display names therefore retain the source-attested proper name, while aliases capture the product descriptors. No OQLF entry for *Bsissa* was found in the targeted terminology search; the Québec evidence here is a current product label, not a terminology ruling.

The shared family boundary is the dry roasted/milled ingredient product. The 2020 survey and current product pages show variation in cereal bases and additions: examples include wheat, barley, sorghum, oats, rice, maize, chickpeas, lentils, aromatic herbs, and spices [S01, S04–S06]. Do not transfer any one product's formula to all Bsissa.

Keep these separate:

- The Québec **Bsissa sans gluten** SKU is one product variant. Do not add `gluten-free bsissa` or `bsissa sans gluten` as aliases for the broader family or imply that all Bsissa is gluten-free [S03, S04].
- A prepared paste, breakfast cream, or energy ball made by mixing the powder with oil, honey, or other ingredients is a prepared use, not a catalog form of the dry powder [S04, S07].
- The Tunisian **Bsissa à boire** UHT milk-cereal beverage is sold as a ready-to-drink product with water, spiced cereal flour, milk, and sugar. It is not the dry powder identity [S07].
- *Rowina* is described by a 2025 review as a drink made by diluting Bsissa; do not make it a dry-powder alias [S08].
- Keep Moroccan Zamita/Zammita/Zemita and its R42 boundary distinct. No reviewed source establishes synonymy between these regional product families.

## Exact ownership and picker effects

The current snapshot contains **1,367 active references**, **100 forms**, **64 legacy-import candidates**, and **1,699 research-ledger records**. Normalized searches found no exact *Bsissa*, *Bsissa powder*, *Bsissa flour*, or *Bsissa en poudre* owner in those stores. The candidate ID `ingredient-ref-bsissa` and source-ID prefix `WP03-BSISSA-R43-20261013-` were also unused before this proposal.

| Phrase or owner | Current exact owner | Proposed effect |
|---|---|---|
| `bsissa`, `bsissa powder`, `bsissa flour`, `bsissa en poudre` | None in references, forms, legacy identities, or ledger | Each becomes a phrase match to the new identity. |
| `bsissa sans gluten`, `gluten-free bsissa` | None | Leave unmatched as product-specific wording; do not label the family gluten-free. |
| `roasted barley flour` | `ingredient-ref-roasted-barley-flour` | Keep as a substrate-specific flour; do not absorb the mixed Bsissa family. |
| `roasted wheat flour` | `ingredient-ref-roasted-wheat-flour` | Keep as a substrate-specific flour; do not absorb the mixed Bsissa family. |
| `powder` / `poudre` / `flour` | 38 / 34 / 123 references when attached forms are included | Add one broad-query result for each, producing 39 / 35 / 124. `farine` remains unchanged because it is not proposed as a name or alias. |
| `rowina`, `zamita`, `zammita`, `zemita` | No Bsissa ownership | Do not redirect these distinct drink or regional product terms to Bsissa. |

These are static projections of the current bilingual, phrase-first and substring-fallback search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9). The identity does not claim one formula, gluten status, or prepared serving state.

## Recipe-demand audit

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across serialized recipe text, ingredient names, authored lines, and reference IDs for *Bsissa*, spelling variants, *Rowina*, *Bsissa powder*, *Bsissa flour*, *Bsissa en poudre*, and source-attested roasted cereal/legume powder wording.

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Existing links to `ingredient-ref-bsissa`: **0**.

The Québec product listing supports picker relevance, but the bundled recipe corpus has no direct Bsissa demand. No recipe link or recipe edit is proposed.

## Forms, measurements, and substitutions

- **Forms:** add none. This identity is bounded to the dry ingredient powder family. Its use in a paste, drink, cream, or energy ball is a preparation, not an alternate global ingredient form.
- **Measures and density:** retain `defaultDensity: null` and empty `unitMappings`. The Québec directory lists a 300 g SKU; Tunisian sellers list 500 g and 1 kg packages [S03, S05, S06]. Package weights are not household measures. The survey's different ingredient quantities describe particular formulas, not reusable Bsissa measurements [S01]. No exact-form volume-to-mass observation, density, or yield was established.
- **Substitutions:** add no global or contextual rule. Création Delicia's English page broadly markets its gluten-free SKU as a replacement for groats, cereals, and bread spreads, but gives no transferable ratio, recipe role, or method [S04]. Do not encode that marketing statement as a substitution for this variable family.
- **Numeric evidence:** do not transfer nutrition data, commercial package amounts, composition percentages, or recipe-specific preparation amounts into ingredient measurements.

## Source register

Sources were checked online on 2026-10-13. Proposal-local IDs use the prechecked prefix `WP03-BSISSA-R43-20261013-`; no source IDs or candidate status were added to the shared research ledger.

| Source ID | Source and evidence | Limits |
|---|---|---|
| `WP03-BSISSA-R43-20261013-S01` | Imene Kerbouai, Khaled Sassi, and Hanen Ben Ismail, [“Survey on the Preparation of a Traditional Roasted Multigrain Flour: Bsissa”](https://agribalkan.congress.gen.tr/files/site/16/files/AGBIOL%20Conference%202020%20Full%20Proceeding%20Book%282%29.pdf), II International Agricultural, Biological & Life Science Conference proceedings (2020). The Lamta survey records 103 formula types and describes cleaning, roasting, grinding, and sifting the ingredients into a powder. | A local festival-producer survey and proceedings paper, not a product standard. It documents variability and process, not a universal ingredient list, ratio, density, or household measure. |
| `WP03-BSISSA-R43-20261013-S02` | Tesnime Ghazouani, Alessandro Atzei, Wafa Talbi, Maurizio Antonio Fenu, Carlo Tuberoso, and Sami Fattouch, [“Occurrence of acrylamide, hydroxymethylfurfural and furaldehyde as process contaminants in traditional breakfast cereals: ‘Bsissa’”](https://doi.org/10.1016/j.foodcont.2021.107931), *Food Control* 124 (2021), 107931. The abstract describes the traditional product as mainly roasted cereals, legumes, and spices and reports a sample of 34 commercial Bsissa products. | A contaminant-analysis study, not a culinary specification. Sampled products do not define a universal formula, preparation ratio, or measure. |
| `WP03-BSISSA-R43-20261013-S03` | Aliments du Québec, [Bsissa sans gluten](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/bsissa-sans-gluten). The current French listing places the Québec-prepared product in “Céréales et granola,” calls it a breakfast mix of cereals and legumes, and lists a 300 g package. | Supports the Quebec-facing proper name and one local SKU only; it does not establish that all Bsissa is gluten-free or specify a common family formula. The package size is not a recipe measure. |
| `WP03-BSISSA-R43-20261013-S04` | Création Delicia, [Gluten-free Bsissa](https://www.creationdelicia.com/en/products/gluten-free-bsissa), current English manufacturer page. It uses the phrase “Bsissa flour” and gives its own formulation, including rice flour, chickpeas, lentils, and maize. | One gluten-free product SKU. Its ingredient list and broad replacement claim are not transferable to all Bsissa or an executable substitution rule. |
| `WP03-BSISSA-R43-20261013-S05` | ILEY'COM, [Bsissa powder](https://ileycom.tn/en/collections/bsissa-en-poudre), current English marketplace category. It uses the product name *Bsissa powder* and lists wheat powder and wheat/barley powder products. | Marketplace wording and SKU package sizes; not an independent standard or a Québec terminology source. |
| `WP03-BSISSA-R43-20261013-S06` | Azza Food, [Bsissa en poudre](https://azzafood.tn/categorie-produit/bsissa-en-poudre/), current French Tunisian seller page. It describes a ready-to-use roasted cereal/legume powder and lists oat, wheat, and dried-fruit product variants. | Seller's product family and variants; does not establish a single formula, universal preparation, household measure, or Québec terminology ruling. |
| `WP03-BSISSA-R43-20261013-S07` | Délice Holding, [Bsissa à boire](https://www.delice.tn/bsissa/), current Tunisian dairy-manufacturer page. It labels the product an UHT sterilized milk beverage with cereals and lists water, spiced cereal flour, milk, and sugar. | Evidence for one ready beverage and its legal product denomination; not a dry Bsissa formula or measure. |
| `WP03-BSISSA-R43-20261013-S08` | F. Boukid, [“Traditional Cereal-based Foods in North African Cuisine: Wheat as the Cornerstone”](https://www.najfnr.com/home/article/download/594/357), *North African Journal of Food and Nutrition Research* 9(19) (2025), p. 48. The review describes Bsissa and refers to a diluted milk- or water-based drink as *Rowina*. | Secondary regional review; use only to document one drink-use term, not to establish universal synonymy or add a powder alias. |

## Integration record

The active seed now contains identity-only `ingredient-ref-bsissa` with the bilingual display name `bsissa / bsissa`, English aliases `bsissa powder` and `bsissa flour`, and French alias `bsissa en poudre`. Its category is `GRAIN_AND_CEREAL`; density remains null and unit mappings remain empty. The generated Kotlin import-audit index was regenerated from the seed. The recipe corpus and application behavior were not changed. No tests were run because the change only adds database reference data and its generated index under the updated workspace rule. Section F remains open.

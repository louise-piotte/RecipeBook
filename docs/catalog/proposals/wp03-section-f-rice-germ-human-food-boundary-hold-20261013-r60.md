# WP03 Section F: rice germ human-food boundary hold (R60, 2026-10-13)

## Review record

- **Scope:** separated rice embryo proposed as a standalone dry human-food ingredient. This review distinguishes it from rice kernels that retain the germ, germinated rice, rice bran, combined bran-and-germ products, extracts, oils, and feed material.
- **Status:** Root-reviewed and integrated as a documentation-only hold; rice germ remains outside the active catalog and research ledger.
- **Recommendation:** **Hold** rice germ outside both the active catalog and research-candidate ledger until a Canadian human-food source establishes a standalone food-grade product and a Québec-facing French food name. The reviewed sources establish the grain part and show combined bran-and-germ foods, but not a standalone product identity in this market.
- **Open-checklist context:** Section F remains open for cereal and preprocessed-grain coverage. Recent brown-rice sprout and rice-bran entries are separate decisions; they mention rice germ only as a neighboring grain part and do not review a standalone germ product ([plan, lines 2761–2778](../../RecipeBook-global-ingredient-catalog-plan.txt#L2761); [sprouted-rice review](./wp03-section-f-sprouted-brown-rice-identity-review-20261012-round2.md); [rice-bran review](./wp03-section-f-rice-bran-identity-review-20261013.md)).
- **Proposal-local source-ID prefix:** `WP03-RICE-GERM-20261013-R60-S` (S01–S06); no shared ledger source IDs are proposed.

## Product boundary

Health Canada describes the rice grain as having a bran, endosperm, and germ; its French page uses **germe** for that grain part. It also identifies white rice as refined rice from which both bran and germ have been removed [S01]. This establishes the anatomical distinction but does not define a standalone retail ingredient.

The OQLF entry for **germe de riz** defines the separated embryo left nearly free of bran residues and starchy portions after polishing. Its recorded domains are animal feed and treated cereal, and its English equivalent is **rice germ meal** [S02]. This supports a milling-fraction boundary, while leaving open whether an unqualified `rice germ` is a human-food product name.

| Neighbor | Boundary for this review |
|---|---|
| Brown rice / riz brun | Whole rice kernels retain their grain parts; they are not separated germ. |
| Haiga rice | A Canadian distributor describes Tamaki Haiga as Koshihikari kernels milled to retain their own germ. The product is sold and used as rice, not as separated germ [S06]. |
| Sprouted brown rice / riz brun germé | Already integrated as a marketed germinated grain. Germination of a kernel is distinct from selling its separated embryo [S03]. |
| Rice bran / son de riz | Already integrated as a separate milling fraction. The bran identity does not include germ by default [S04]. |
| Brown-rice bran-and-germ powder | CFIA surveyed two samples of this combined food product; a Canadian retailer's product listing also names brown-rice bran and germ powder [S05]. These sources establish a combined product, not standalone germ. |
| Rice germ meal | The OQLF entry's English equivalent is scoped to animal-feed/treated-cereal domains. Do not transfer feed wording or use to a human-food picker row [S02]. |

Do not use **rice with germ**, **haiga rice**, or **germinated brown rice** as aliases for separated rice germ. Do not treat rice germ extract, rice germ oil, or a bran-and-germ blend as the same product.

## Canadian human-food evidence and Québec French naming

The strongest Canadian human-food evidence located is for a **combined** product. CFIA's 2018–19 food survey included two samples of brown-rice bran-and-germ powder [S05]. A Canadian retailer's Natural Traditions listing gives the ingredient as brown-rice bran-and-germ powder, a 200 g package, and a one-tablespoon (15 g) serving; the page was marked “no longer carry” when reviewed [S05]. These sources do not verify a plain rice-germ SKU.

The French Canadian Well.ca listing for Westpoint Naturals uses the product title **Son de riz stabilisé** and the ingredient wording **Son et germe de riz (brun)**. The listing was marked sold out when checked [S05]. This is direct Québec-facing French human-food wording for a combined ingredient declaration, not a standalone name for rice germ.

The OQLF's **germe de riz** is the exact Québec terminology entry found, but its definition is situated in animal feed and treated-cereal domains and gives **rice germ meal** as the English equivalent [S02]. Health Canada's French whole-grain page uses **germe** anatomically, not as a standalone food ingredient label [S01]. I found no Canadian or Québec French retail/producer label that names separated rice germ for human consumption. Therefore, `germe de riz` is not approved here as a Québec-facing picker display or alias.

## Exact-key ownership and picker boundary

The read-only package snapshot contained **1,384 active references**, **100 forms**, **63 legacy-import candidates**, and **1,716 research-ledger records**. Normalized exact-term checks found no owner for `rice germ`, `germe de riz`, `rice germ meal`, `rice germ powder`, `ingredient-ref-rice-germ`, or `candidate-rice-germ` among active reference names and aliases, form labels and match terms, legacy candidates, or standalone ledger-candidate records. The related rice-bran ledger record mentions rice germ only as a distinct neighboring product. The proposal-local source-ID prefix was also unallocated.

Nearby owners remain distinct:

| Current owner | Exact display or term | Boundary |
|---|---|---|
| `ingredient-ref-wheat-germ` | `wheat germ / germe de blé` | Wheat embryo; not rice germ. |
| `ingredient-ref-sprouted-brown-rice` | `sprouted brown rice / riz brun germé`; English alias `germinated brown rice` | Germinated whole-grain product; not separated germ. |
| `ingredient-ref-rice-bran` | `rice bran / son de riz` | Rice bran fraction; not a bran-and-germ blend or rice germ. |
| `ingredient-ref-rice-bran-oil` | `rice bran oil / huile de riz`; English alias `rice oil` | Oil identity; not a grain fraction. |

Current complete-phrase search returns no result for `rice germ`, `germe de riz`, `rice germ meal`, or `rice germ powder`. Broad `germ` and `germe` queries already return wheat germ and/or sprouted-grain results; no short alias such as `germ` or `germe` is proposed. These are static projections from the current reference/form data and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9), not live picker observations. Since this is a hold, no query result changes.

## Recipe-corpus demand

All **114 manifest-listed recipes** and **1,123 ingredient rows** were parsed. A scan of serialized recipe content and ingredient rows for `rice germ`, `germe de riz`, `rice germ meal`, `rice germ powder`, `rice with germ`, `haiga rice`, `brown rice bran and germ`, `rice bran and germ`, `son et germe de riz`, `germinated brown rice`, `rice germ oil`, and `rice germ extract` found **0 matching recipe files and 0 matching ingredient rows**. The bundled corpus supports no identity, recipe link, or recipe-specific form for this candidate.

## Numeric and form limits

The only household quantity located is the Canadian retailer's **1 tablespoon (15 g)** serving for one branded **brown-rice bran-and-germ powder**; its 200 g pack is also product-specific [S05]. Neither value can be assigned to separated rice germ. The CFIA survey supplies no household measure or general formulation. Haiga-rice package size and cooking use belong to the intact rice product, not its retained germ [S06].

No source establishes a reusable raw, toasted, stabilized, or cooked form for standalone rice germ, nor a general measure, density, unit mapping, conversion, yield, or substitution. Keep all of those behaviors inactive. No recipe link is supported.

## Source register

Sources were checked online on 2026-10-13. Source IDs are proposal-local only.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| `WP03-RICE-GERM-20261013-R60-S01` | Health Canada, [Whole Grains — Get the Facts](https://www.canada.ca/en/health-canada/services/canada-food-guide/resources/healthy-eating-recommendations/eat-a-variety/whole-grain/get-facts.html); [French page](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire-canadien/ressources/recommendations-saine-alimentation/savourez-une-variete/grains-entiers/les-faits.html), “What are whole grains?” / « Qu'est-ce que les grains entiers? » | Defines bran, endosperm, and germ as grain parts and notes that refined rice has had bran and germ removed. Supports anatomy and grain-part separation, not a standalone rice-germ food product. |
| `WP03-RICE-GERM-20261013-R60-S02` | Office québécois de la langue française, [germe de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9498735/germe-de-riz) | Defines the separated rice embryo after polishing; lists animal-feed and treated-cereal domains and the English equivalent `rice germ meal`. This is terminology/process evidence, not a human-food label or display recommendation. |
| `WP03-RICE-GERM-20261013-R60-S03` | WP03 Section F, [sprouted brown-rice identity review](./wp03-section-f-sprouted-brown-rice-identity-review-20261012-round2.md) and [integration record](../batches/wp03-section-f-sprouted-brown-rice-identity-integration-20261012/README.md) | Existing decision identifies sprouted brown rice as a separate whole-grain product and explicitly distinguishes germ retention from germination. Used only to preserve the nearby identity boundary. |
| `WP03-RICE-GERM-20261013-R60-S04` | WP03 Section F, [rice-bran identity review](./wp03-section-f-rice-bran-identity-review-20261013.md) and [integration record](../batches/wp03-section-f-rice-bran-identity-integration-20261013/README.md) | Existing rice-bran identity defines a separate milling fraction and states that one branded product's bran-and-germ declaration does not make germ part of every bran product. Used only to preserve the adjacent identity boundary. |
| `WP03-RICE-GERM-20261013-R60-S05` | CFIA, [Toxic Metals in Selected Foods, April 1, 2018 to March 31, 2019](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/toxic-metals-selected-foods-april-1-2018-mar), rice products section; National Nutrition, [Natural Traditions Brown Rice Bran and Germ Powder, 200 g](https://www.nationalnutrition.ca/natural-traditions-brown-rice-bran-and-germ-powder-200g.html); Well.ca, [Westpoint Naturals Son de riz stabilisé](https://well.ca/fr/produits/westpoint-naturals-stabilized-rice_297338.html) | CFIA reports two samples of brown-rice bran-and-germ powder. The Canadian retailer lists that combined powder and a 1 tbsp/15 g serving; it was marked no longer carried when checked. The French Canadian page says `Son et germe de riz (brun)` in the ingredient statement and was marked sold out. Together these support combined human-food products and local French wording only, not standalone rice germ. |
| `WP03-RICE-GERM-20261013-R60-S06` | Ozawa Canada, [Tamaki Haiga Rice, 4.4 lb](https://ozawa.ca/product/tamaki-haiga-rice-4-4-lbs/) | Describes Haiga as Koshihikari rice kernels that retain their own germ and lists the product under rice. Supports the intact-kernel boundary; its package size and cooking uses are not measures or forms for separated germ. |

## Disposition

**Hold rice germ outside the active catalog and research-candidate ledger.** The grain part and a milling-fraction boundary are clear, but the Canadian human-food evidence reviewed names combined bran-and-germ powders or whole rice retaining germ. The Québec terminology entry for `germe de riz` is scoped to animal feed/treated cereal, and no standalone human-food French label was verified. Reopen if a Canadian food-grade standalone rice-germ product and a Québec-facing French label or authoritative human-food naming source become available. Until then, add no active reference, aliases, ledger candidate, forms, measures, recipe links, density, unit mappings, conversions, yields, or substitutions.

## Root review and integration (2026-10-13)

Accepted the hold and marked the Section F review item complete. No database JSON, generated file,
or catalog data changed. The integration record is in
[`the batch README`](../batches/wp03-section-f-rice-germ-human-food-boundary-hold-integration-20261013/README.md).
This documentation-only decision needed no tests.

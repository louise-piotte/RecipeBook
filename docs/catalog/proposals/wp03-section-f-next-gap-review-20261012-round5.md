# WP03 Section F: raw buckwheat groats identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as an identity-only reference and ledger record; see the [integration record](../batches/wp03-section-f-raw-buckwheat-groats-identity-integration-20261012/README.md).
- **Scope:** Plain hulled buckwheat groats sold raw/unroasted for human food.
- **Recommendation:** Add identity-only `ingredient-ref-raw-buckwheat-groats` as **`buckwheat groats, raw / gruau de sarrasin cru`** in `GRAIN_AND_CEREAL`. Keep aliases, forms, measurements, conversions, yields, recipe links, and substitutions empty.
- **Plan context:** Section F still leaves regionally significant cereal mixes and preprocessed grains open at [plan line 2146](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239). The existing roasted-grain row and its independent Québec display review concern **roasted, dry** groats; this proposal covers the separate raw product state and does not reopen that decision ([roasted-grain review](wp03-roasted-buckwheat-groats-quebec-display-review-20261011.md)).

## Why this is a distinct open candidate

The live reference catalog contains `ingredient-ref-roasted-buckwheat-groats-dry`, currently displayed as `buckwheat groats, roasted, dry / grains de sarrasin rôtis et secs`. It has no aliases, forms, active measurements, or unit mappings. Its completed Québec terminology review concerns only that roasted-and-dry product. I found no prior standalone raw-groats proposal, catalog row, or raw-groats hold in the active Section F plan or the prior proposal set.

Current manufacturers sell the raw, dehulled whole seed as buckwheat groats. Yupik identifies its Organic Whole White Buckwheat Groats (SKU P31023) as raw and explains that the outer shell has been removed. A Canadian buckwheat processor, Fyk Soba Inc., separately lists whole raw buckwheat and cracked groats. In Québec, the same raw-groat product class is sold under French wording including `gruau de sarrasin cru` and `sarrasin entier blanc cru`. This supports a bounded raw-groat identity, distinct from roasted groats, flour, flakes, puffed buckwheat, and prepared hot cereal [S04–S08].

The recommended pair uses the source-attested Canadian English product term `buckwheat groats` with the processing qualifier `raw`, and the current Québec-market product wording `gruau de sarrasin cru`. The French product phrase is market-attested; no OQLF preference for the full compound is claimed. OQLF supports the base pairing `sarrasin / buckwheat` only [S02–S03, S07].

## Current catalog, ledger, and recipe audit

The snapshot was checked in the current workspace on 2026-10-12. Exact ownership checks used the catalog search normalization: lowercase, Unicode compatibility decomposition, accent/ligature folding, punctuation-to-space conversion, and whitespace normalization.

| Artifact | Current count or result |
|---|---:|
| `ingredient-references.v1.json` | 1,309 references |
| `ingredient-forms.v1.json` | 98 forms |
| `legacy-import-identities.v1.json` | 64 candidates |
| `research-ledger.v1.json` | 1,617 records; 5,889 source entries |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows |

No active reference, ingredient form, legacy candidate, or ledger record ID owns `ingredient-ref-raw-buckwheat-groats`, `raw buckwheat groats`, `buckwheat groats, raw`, `gruau de sarrasin cru`, or `sarrasin écalé cru`. No form, package-yield entry, unit conversion, or substitution rule mentions buckwheat or sarrasin. Before this proposal was drafted, the source-ID prefix `WP03-BWGROATS-RAW-20261012` was absent from the current ledger and documentation set.

Nearby active rows include buckwheat flour, buckwheat flakes, puffed buckwheat, roasted dry buckwheat groats, creamy buckwheat hot cereal, and soba noodles. These remain separate. The ledger's unresolved `ingredient-ref-kasha` candidate concerns the prepared *kacha/kasha* dish; it does not allocate raw groats. A source mention of raw groats occurs on the creamy hot-cereal record, where the manufacturer says that cereal is milled from raw groats. That component description is not an identity record or ownership link for the raw grain.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `raw buckwheat groats`, `buckwheat groats, raw`, `unroasted buckwheat groats`, `gruau de sarrasin cru`, `gruaux de sarrasin crus`, `sarrasin écalé cru`, `sarrasin entier blanc cru`, `buckwheat groats`, `buckwheat`, and `sarrasin`. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe link or relink is proposed.

## Proposed identity and naming boundary

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-raw-buckwheat-groats` |
| English display | `buckwheat groats, raw` |
| French display | `gruau de sarrasin cru` |
| English aliases | None |
| French aliases | None |
| Category | `GRAIN_AND_CEREAL` |
| Identity scope | Whole buckwheat kernels with the outer hull removed, sold raw/unroasted as a dry food ingredient. The display does not imply an organic certification, white cultivar, or specific cooking method. |
| Forms | None |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Recipe links, yields, conversions, substitutions | None |

Keep the proposed identity distinct from:

- roasted dry buckwheat groats and the prepared *kacha/kasha* dish;
- buckwheat flour, flakes, puffed buckwheat, creamy buckwheat hot cereal, and soba noodles;
- whole, hull-on buckwheat seed sold for sprouting or agricultural use;
- buckwheat species names and source-specific white, black, green, organic, or sprouted qualifiers.

Keep both alias arrays empty. In particular, do not add broad `buckwheat`, `sarrasin`, or unqualified `buckwheat groats` terms; exact source labels already distinguish raw from roasted products, while broad searches can return multiple buckwheat identities. Do not add `kasha` or `kacha`, which refer to a prepared roasted-buckwheat dish in the reviewed Québec terminology sources. Do not turn `organic`, `whole white`, or SKU-specific descriptions into general aliases.

## Identity, form, measurement, and substitution findings

| Concern | Evidence and decision |
|---|---|
| Product identity | Current manufacturer listings identify raw whole buckwheat groats as a food product. Yupik says the groat is the buckwheat seed with its outer shell removed; Fyk Soba Inc. lists whole raw buckwheat separately from cracked groats. The Canadian Grain Commission's definition of `graines décortiquées` likewise describes buckwheat seeds whose hull has been removed [S01, S04, S08]. Recommend one identity-only row for the raw hulled product. |
| Forms | Add no `IngredientForm`. Raw/unroasted is part of this separate product identity, not a reusable state form of the active roasted-groats identity. Cooking directions do not establish a catalog cooked form or standard yield. |
| Measures and conversions | Yupik's SKU P31023 label gives 1/4 cup (50 g) and a brand-specific 1:2 groat-to-water cooking direction. A Québec retailer's directions for the Moissonneries du Pays product use 1/3 cup (80 mL) of groats and 350 mL water, simmered 6–8 minutes for two portions [S04, S07]. These are product-specific label/recipe details; do not generalize a serving, cup conversion, density, water ratio, or cooking yield. |
| Package sizes | The reviewed product listings include 400 g, 450 g, and 1 kg packs. These are SKU/package formats, not household measures or a transferable quantity relation [S06–S07]. |
| Substitutions | One Québec retailer listing broadly suggests cooked groats in place of rice, potatoes, or pasta; manufacturers also describe side-dish and salad uses [S04, S07–S09]. These broad use suggestions supply no tested quantity ratio or method limits. Add no substitution finding or active rule. |
| Recipe demand | No bundled recipe file or ingredient row mentions buckwheat or sarrasin. No recipe link or quantity change is justified. |

Do not copy the existing roasted-groats record's outstanding measurement research into this candidate. That record's research state remains unchanged; this review makes no claim about its 2026 CNF follow-up.

## Proposal-local source register

The sources below were checked on 2026-10-12. IDs use the new, unique prefix `WP03-BWGROATS-RAW-20261012`; they are proposal-local and have not been added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-BWGROATS-RAW-20261012-S01` | Canadian Grain Commission, [Official Grain Grading Guide — Buckwheat](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/pdf/13-sarrasin.pdf), section `Graines décortiquées`, 2026–2027 edition. | Defines dehulled buckwheat seeds as seeds whose hull has been removed. Supports the kernel boundary; it does not name a consumer product, establish roasting state, or define groat size. |
| `WP03-BWGROATS-RAW-20261012-S02` | Statistics Canada, [Système de classification des produits de l'Amérique du Nord (SCPAN) — Canada 2017](https://www150.statcan.gc.ca/n1/pub/12-003-x/12-003-x2017001-fra.pdf), p. 213, product 1821234. | Places `gruau de sarrasin` among grain products for human consumption and separately identifies animal-feed products. It supports Canadian French classification usage, not an OQLF preference or a raw/roasted distinction. |
| `WP03-BWGROATS-RAW-20261012-S03` | OQLF, [GDT: `sarrasin`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082623/sarrasin), updated 1991. | Pairs the Québec term `sarrasin` with English `buckwheat`. It defines the base plant/food term, not groats or the proposed full display. |
| `WP03-BWGROATS-RAW-20261012-S04` | Yupik, [Organic Whole White Buckwheat Groats, SKU P31023](https://yupik.com/en/organic/organic-whole-white-buckwheat-groats-p31023), current manufacturer page. | Names a raw, hulled, whole buckwheat product and describes the shell removal. The 1/4-cup (50 g) serving and 1:2 cooking ratio are specific to this SKU and are not generalized. |
| `WP03-BWGROATS-RAW-20261012-S05` | Yupik, [Sarrasin entier blanc biologique, SKU P31023](https://yupik.com/fr/organic-whole-white-buckwheat-groats-p31023), current French manufacturer page. | The same SKU is marked `Cru`; the text calls it `sarrasin écalé` and says it is a raw agricultural product. It supports source-attested Québec-facing French terms, not an OQLF ruling for the compound. The serving data match the product-specific English page. |
| `WP03-BWGROATS-RAW-20261012-S06` | Aliments du Québec, [Sarrasin entier blanc cru biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/sarrasin-entier-blanc-cru-biologique), Moissonneries du Pays product record. | Lists the Québec-market product as a cereal item and provides 450 g and 1 kg formats plus Québec retailer availability. The bilingual directory title pairs this with `Organic raw white buckwheat groats`; white/organic wording remains SKU-specific. |
| `WP03-BWGROATS-RAW-20261012-S07` | La Boite à Grains, [Gruau de sarrasin biologique cru — Les Moissonneries du Pays](https://laboiteagrains.com/products/gruau-de-sarrasin-biologique-cru-400-g-les-moissonneries-du-pays?variant=42088210661442), current Québec retailer product listing. | Directly attests the proposed French phrase for a current 400 g product. The product instructions give 1/3 cup (80 mL), 350 mL water, 6–8 minutes, and two portions; retain these as product-specific preparation context only. |
| `WP03-BWGROATS-RAW-20261012-S08` | Fyk Soba Inc., [Products](https://fyksoba.com/products/), current Canadian manufacturer listing. | Lists `Whole Raw Buckwheat` for soups and salads separately from `Cracked Buckwheat` groats used as a cooked cereal. Supports a raw-versus-cracked product distinction and human-food use, but supplies no French name or household measure. |
| `WP03-BWGROATS-RAW-20261012-S09` | Monde Naturel, [Sarrasin entier blanc cru biologique, 450 g](https://shop.mondenaturel.ca/products/sarrasin-entier-blanc-cru-bio-450g), Québec retailer listing for Les Moissonneries du Pays. | Uses the current French product title and suggests using the cooked groats in place of potatoes, rice, or pasta. The listing did not show the item in stock when checked; its broad suggestion gives no substitution ratio or method limits. |

## Static verification performed

- Re-read `AGENTS.md`, the live Section F plan, current catalog/ledger, and relevant roasted-groat, raw-groat incidental-source, and kasha records.
- Checked normalized exact ownership across active references, 98 forms, 64 legacy candidates, and ledger IDs; found no exact owner for the proposed ID or display pair. Recorded the incidental raw-groat component mention on the creamy hot-cereal record without treating it as a catalog owner.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows for the exact proposed names and broad buckwheat/sarrasin terms; found no demand.
- Checked related form, package-yield, unit-conversion, and substitution data; found no buckwheat-specific rows.
- Confirmed that the proposal-local source-ID prefix was unused before integration. Verified this Markdown file as UTF-8 without BOM and checked it for mojibake. The independent review did not modify shared data.
- The root integration added the reference and accepted ledger record, updated the catalog plan and roadmap, and generated the Kotlin picker index. See the integration record for static validation.
- No app tests or emulator checks were run because the integration only adds database JSON data and regenerates its index.

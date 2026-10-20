# WP03 Section F: sorghum-flakes product and Québec-name review

## Review record

- **Reviewed:** 2026-10-11.
- **Status:** Root review retained sorghum flakes as an unresolved candidate and added the evidence and hold decision to the shared research ledger on 2026-10-11; no active reference was added.
- **Scope:** one open Section F preprocessed-grain candidate: human-food sorghum flakes. The plan leaves regionally significant cereal mixes and preprocessed grains open. This review does not reopen the integrated grain-sorghum or puffed-sorghum identities.
- **Disposition:** keep sorghum flakes unallocated. The English product wording is attested, but current Canadian listings do not establish one common processing scope, and no Québec/Canadian French product label or terminology entry supports a canonical picker name.

## Decision and identity boundaries

The current evidence indicates that “sorghum flakes” can refer to more than one marketed product. A Canadian retailer's older listing for GoGo Quinoa describes **instant sorghum flakes** as a single-ingredient product for porridge and recipes, but the listing now reports the item unavailable. A current OM Foods listing is titled **Organic Sorghum Crisps, flakes** and describes a ready-to-eat cereal/snack/topping made with sorghum; it does not state whether the product is rolled, puffed, or otherwise expanded. A French-language European supplier separately describes **flocons de sorgho blanc** made by cleaning, flaking/rolling, and drying the grain. These labels support several human-food product examples, not one source-neutral specification.

| Candidate wording or product | Recommendation | Evidence boundary |
| --- | --- | --- |
| `sorghum flakes` | Keep as a research-candidate phrase only; do not add an active reference or reserve an ID. | English wording appears on Canadian retail/product pages, but the pages do not show that instant-cooked flakes and ready-to-eat crisp flakes share one process or catalog identity. |
| `instant sorghum flakes` | Retain only as the specific discontinued/ unavailable GoGo Quinoa product wording. Do not use `instant` as a generic alias or form. | The retailer page gives single-ingredient and use information, but no flaking method, botanical/cultivar scope, or current availability. Its cooking directions apply to that product only. |
| `sorghum crisp flakes` / `Organic Sorghum Crisps, flakes` | Keep source-scoped; do not alias it to plain flakes or puffed sorghum. | OM Foods calls this ready-to-eat and lists sorghum as the ingredient, but gives no process specification. “Crisps” may overlap puffed or expanded products. |
| Possible French phrase `flocons de sorgho` | Do not activate as a fr-CA display or alias yet. | A European supplier uses `flocons de sorgho blanc` for its semi-finished ingredient. No Québec or Canadian human-food label reviewed here uses this wording for the candidate. |
| `grain sorghum / sorgho à graine` | Keep the active whole-grain identity unchanged. | OQLF directly supports the base species name, and the current catalog already has a separate grain-sorghum row. Flakes are a processed-product question, not an alias of the whole grain. |
| `puffed sorghum / sorgho soufflé` | Keep the active ready-to-eat puffed-grain identity unchanged. Do not alias `sorghum flakes`, `sorghum crisp flakes`, or `instant sorghum flakes` to it. | The existing identity covers source-described puffed/expanded grain. Current crisp-flake retail wording does not establish that same process; the instant-flakes listing does not describe its process. |
| `cracked sorghum` | Keep separate from flakes. | Puratos Canada lists cracked sorghum as one component of a formulated 13-grain bakery product; it is not a standalone flake product. |
| `sorghum flour`, bran flakes, cereal blends, and animal-feed flakes | Keep outside this candidate. | Milling, cereal formulations, and feed products have different scope from a plain human-food grain-flake product. |

The exact English `sorghum flakes` is useful as research wording, but the French display remains unresolved. The OQLF entry supports `sorgho` for the plant/grain and lists `sorgo` as an orthographic-reform spelling; it does not name a flaked product. Do not add `jowar`, `white`, `instant`, `crisp`, `organic`, `popped`, or `puffed` as aliases: these are regional, product, cultivar/color, or process qualifiers, and the consulted sources do not establish unambiguous equivalence.

If a later review accepts a narrowly defined row, it would likely belong in `GRAIN_AND_CEREAL`, with `defaultDensity: null` and `unitMappings: []`. That allocation is not recommended from this evidence alone.

## Current package, collision, and recipe audit

The proposal research snapshot contained **948 ingredient references**, **53 forms**, **1,216 ledger records**, and **114 manifest-listed recipes with 1,123 ingredient rows**. Root integration later added two active identities and the held sorghum-flakes candidate.

- The active neighbors are `ingredient-ref-grain-sorghum` (`grain sorghum / sorgho à graine`), `ingredient-ref-sorghum-flour` (`sorghum flour / farine de sorgho`), and `ingredient-ref-puffed-sorghum` (`puffed sorghum / sorgho soufflé`, with the English aliases `popped sorghum` and `sorghum puffs`). None names flakes.
- No active reference or form owns `sorghum flakes`, `instant sorghum flakes`, `sorghum crisp flakes`, or `flocons de sorgho`. Root added `candidate-sorghum-flakes` to the ledger as an unresolved research record; the active reference ID `ingredient-ref-sorghum-flakes` remains unallocated. This is an exact-key audit; broad `sorghum` and `sorgho` searches can still reach multiple neighboring references.
- The full proposal and batch scan found no earlier focused sorghum-flakes identity review. The puffed-sorghum integration is complete and remains out of scope here.
- A scan of all 114 recipe files and 1,123 ingredient rows found **zero** occurrences of `sorghum`, `sorgho`, `jowar`, or `flocons de sorgho`. Generic `flakes`/`flocons` mentions belong to other products and do not establish sorghum-flake demand.

No recipe link, recipe edit, form, measurement, or substitution is supported by the bundled corpus.

## Measurements, forms, conversions, and substitutions

- **Forms:** add none. A flaked product is not a dry/cooked state form of the whole-grain or puffed-sorghum identities.
- **Density and mappings:** leave density null and unit mappings empty if a future identity is accepted. Package weights do not establish a volume-to-mass mapping.
- **Source-specific quantity:** Well.ca shows one discontinued GoGo Quinoa product serving of `1/3 cup (40 g)` and product instructions using `1/2 to 2/3 cup` boiling liquid with a 2–3 minute rest. Keep those values attached only to that SKU; do not transfer them to a generic reference or recipe.
- **Conversions and yield:** add no mass-volume conversion, raw-to-flaked process yield, cooking yield, package yield, or liquid conversion. Neither the manufacturer-like product pages nor the Québec corpus supplies a reusable method.
- **Substitutions:** activate none. GoGo's suggestion to use its instant flakes in place of regular flakes lacks a general amount or method crosswalk. Similar cereal, porridge, topping, or baking uses do not establish equivalence with rolled oats or other grains.

## Source register

Sources were reviewed on 2026-10-11. Source IDs are local to this proposal and are not registered in the shared ledger.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-SORGFLAKE-20261011-S01` | Office québécois de la langue française, [sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho), updated 2010. | Gives preferred Québec French `sorgho` (and the reformed spelling `sorgo`) with English `sorghum` and *Sorghum bicolor*. This is base plant terminology, not a product name for flakes. |
| `WP03-SORGFLAKE-20261011-S02` | Statistics Canada, [Enquête mensuelle auprès des minotiers, 2024](https://www23.statcan.gc.ca/imdb/p3Instr_f.pl?Function=assembleInstr&Item_Id=1530723&a=1&lang=fr), question 8, “Céréales et cultures non céréalières moulues.” | Requires reporting products of milling for human consumption only, and lists `Sorgho – céréales` with `Farine de sorgho` and `Tous les autres produits du sorgho`. Supports a human-food processing category and current French base wording; it does not identify flakes or provide a consumer label. |
| `WP03-SORGFLAKE-20261011-S03` | Well.ca, [GoGo Quinoa Organic Instant Sorghum Flakes](https://well.ca/products/gogo-quinoa-organic-instant-sorghum_132284.html), product description and instructions. | Retail page lists one ingredient, organic sorghum flakes, and identifies the product as instant; it provides one product-specific serving and preparation direction. The page currently marks it no longer available, does not state how the flakes are produced, and provides no paired French label. |
| `WP03-SORGFLAKE-20261011-S04` | OM Foods, [Organic Sorghum Crisps, flakes](https://omfoods.com/products/pastas-cereals-sorghum-crisps-flakes), product name, description, ingredients, and origin. | Current product page calls the product “Sorghum Crisp Flakes,” lists sorghum as the ingredient, describes ready-to-eat cereal/snack/topping uses, and states U.S. origin. It does not specify rolling, puffing, or another process; package sizes and stock status are product-specific. |
| `WP03-SORGFLAKE-20261011-S05` | CerealVeneta, [Flocons de sorgho blanc](https://cerealveneta.it/fr/semi-finis/flocons-de-sorgho-blanc/), product heading and process description. | French-language Italian ingredient supplier names `flocons de sorgho blanc` and says the grains are cleaned, flaked/rolled, and dried, with further treatment according to need. Supports a French product phrase and one flaking process, not Québec usage, a Canadian label, a retail product class, or equivalence to the instant/crisp products. |
| `WP03-SORGFLAKE-20261011-S06` | Puratos Canada, [Softgrain Treize](https://www.puratos.ca/en/products/Softgrain-Treize), ingredient statement. | A formulated bakery grain mix lists `cracked sorghum` separately among its components. Supports keeping cracked grain and composite mixes outside a plain flake identity. Does not define sorghum flakes. |

The existing [puffed-sorghum integration record](../batches/wp03-puffed-sorghum-identity-integration-20261011/README.md) establishes that neighboring row's accepted scope; it is retained as a catalog boundary reference, not as new sorghum-flakes evidence.

## Review disposition

**Keep sorghum flakes as an unallocated Section F candidate.** The plan's preprocessed-grain gap is open, and current sources establish that sorghum flakes exist, but the retrieved Canadian examples do not settle a single product/process class or a Québec French display. The foreign phrase `flocons de sorgho` is a lead for future Québec terminology review, not an active name. Preserve the existing grain-sorghum, sorghum-flour, and puffed-sorghum identities; add no row, alias, form, measure, conversion, yield, recipe link, or substitution. Reopen when a current Québec/Canadian human-food label identifies plain sorghum flakes in French and supplies enough process context to distinguish flaked grain from puffed/crisp products.


## Root integration note

Root independently rechecked the OQLF base term, Statistics Canada milling categories, Well.ca's product wording and product-specific serving, OM Foods' crisp-flake listing, CerealVeneta's rolled-and-dried product, and Puratos Canada's cracked-sorghum mix. The ledger now records the unresolved `candidate-sorghum-flakes` with all six sources. No active row, form, recipe link, conversion, yield, or substitution was added. Reopen after Québec/Canadian evidence clarifies a shared product scope and French display.

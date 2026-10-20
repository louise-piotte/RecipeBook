# WP02/WP03/WP04 R806–R808 integration — 2026-10-19

## Integration result

- **R806, WP02 Section A7:** Added `rye malt flour` as an English alias for the existing `malted rye flour / farine de seigle malté` reference. Kept Briess's R662 3/4 cup (98 g) observation unchanged and product-specific. Added a no-supported-substitute finding because Briess's L100 is diastatic and King Arthur's tested ratio is for plain medium rye flour. No measure, form, mapping, recipe link, or active substitution rule was added. See the [proposal](../../proposals/wp02-section-a7-milling-gap-review-r806-20261019.md).
- **R807, WP03 Section F:** Added `kiwicha` as an English alias on the existing amaranth-grain row. Reused OQLF source `WP03-S23` and added current Peru MIDAGRI/Agroideas and INIA records. The prior R168 exclusion is superseded by this narrower grain-alias review; it does not make the catalog identity species-specific or establish current Canadian/Québec retail use. French names, measures, forms, and substitution state remain unchanged. See the [proposal](../../proposals/wp03-section-f-grain-gap-review-r807-20261019.md).
- **R808, WP04 Section P:** Added identity-only `edible crab / tourteau` for *Cancer pagurus*, with English aliases `brown crab` and `common crab`. Kept `crabe tourteau`, `crabe dormeur`, `crabe commun`, `rock crab`, and broad crab aliases off the row. Recorded no reusable supported measure and no supported substitute. The Metro recipe's taxon-unresolved wording and quantity were not assigned to this identity; no recipe link, form, density, mapping, conversion, yield, or active rule was added. See the [proposal](../../proposals/wp04-section-p-shellfish-gap-review-r808-20261019.md).

## Evidence links

- R806: [Briess malted-flour listing](https://food.briess.com/products/briess-specialty-malt-flours/), [Briess malting overview](https://food.briess.com/capabilities/malting/), [Brewing With Briess dinner-roll recipe](https://www.brewingwithbriess.com/blog/dress-up-your-thanksgiving-feast-with-a-double-dose-of-malt/), and [King Arthur rye substitution tests](https://www.kingarthurbaking.com/blog/2020/10/05/how-to-substitute-rye-for-all-purpose-flour).
- R807: [OQLF amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), [Peru MIDAGRI/Agroideas Kiwicha](https://agroideas.gob.pe/project/kiwicha/), and [Peru INIA germplasm records](https://genebankperu.inia.gob.pe/consulta?type=2&var=5).
- R808: [OQLF tourteau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198934/tourteau), [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on%2F1000&cmbIn=e&lang=e&q=crab), [Canadian brown-crab supplier](https://atlanticlobster.ca/product/crab/), [OQLF crabe commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198892/crabe-commun), [DFO historical naming note](https://waves-vagues.dfo-mpo.gc.ca/Library/166007.pdf), and [Metro's taxon-unresolved recipe](https://www.metro.ca/recettes-et-occasions/recettes/gateau-de-crabe-tourteau-a-la-creme-de-mais-pousses-de-coriandre).

## Static verification

- Seed reference normalization and package normalization check passed; package schema and consistency validation reported no errors.
- Regenerated `BundledIngredientCatalog.kt` from the canonical reference JSON and confirmed the generated index is current at **1,885 references**. Phrase-first picker projection returns only the expected row for `rye malt flour`, `kiwicha`, `edible crab`, `brown crab`, `common crab`, and `tourteau`; `crabe tourteau` remains unassigned. The `malt flour` query gains the qualified rye-malt result through subphrase matching (7 results total); the broad `crab` query returns 14 results and `crabe` remains at 13.
- Research ledger schema validation reported **0 errors**. Source-ID-to-URL consistency had **0 conflicts**.
- Counts after integration: **1,885 references**, **199 forms**, **114 recipes / 1,123 ingredient rows**, **2,293 ledger records**, **10,752 source entries**, **9,047 distinct source IDs**, and **7,694 distinct source URLs**.
- The full manifest-listed recipe corpus was checked; no recipe-specific linkage or quantity was inferred for these identities.
- No Gradle/app tests, build, emulator, or deployment were run: this batch adds and updates catalog/database JSON data, covered by the no-testing instruction in `AGENTS.md`.

Sections A7, F, and P remain open for their broader reviews.

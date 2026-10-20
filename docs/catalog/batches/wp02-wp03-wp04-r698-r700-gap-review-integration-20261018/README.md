# WP02/WP03/WP04 R698–R700 gap review integration

Integrated 2026-10-18. R698 adds one source-backed milling-product identity. R699 and R700 are bounded holds; neither allocates an active reference or ledger identity. Sections A7, F, and P remain open.

## R698 — Wheatlets milling-product identity

Added `ingredient-ref-wheatlets` as `Wheatlets / Wheatlets` in `FLOUR_AND_STARCH`, with empty alias arrays, null default density, and no unit mappings. Ardent Mills' English and French Canadian portfolios name Wheatlets separately as a coarse-granular product made from purified wheat endosperm. The ledger reuses the existing R455 portfolio source IDs S03 and S04 rather than creating new URL/source IDs.

Keep Wheatlets separate from Talisman Granular, Farina, durum and spring-wheat semolinas, whole-wheat meal, cracked wheat, and Cream of Wheat hot cereal. The portfolio's wheat-middlings application statement does not support a general equivalence or substitution. No household measure or density is available from the reviewed sources; the industrial product codes are not kitchen measures. No forms, recipe links, conversions, package yields, or substitution rules were added. The 114-file / 1,123-row bundle has no Wheatlets demand. Sources: Ardent Mills [English portfolio](https://ardentmills.ca/media/2154/ardent-mills-flour-portfolio_en.pdf) and [French portfolio](https://contentlibrary.ardentmills.com/m/2f1bc7848e6b9a0/original/FR-Flour-Portfolio.pdf).

## R699 — Lucky Charms family-scope hold

Kept the standard Canadian Lucky Charms cereal outside active data pending a family-level picker decision. Metro lists a separate Fruit Lucky Charms cereal, while General Mills Canada's brand page does not establish a complete current Canadian SKU roster. Adding only the standard cereal would make the broad brand query look complete. The bundle has no matching recipe demand; no active reference, ledger record, family alias, or sibling variant was allocated. Sources: [General Mills Canada](https://www.generalmills.ca/our-food/brands/lucky-charms), Metro [standard cereal listing](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/family-cereals/frosted-toasted-oat-cereal-with-marshmallows/p/065633132122), [French listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-d-avoine-grillee-givrees-avec-des-guimauves/p/065633132122), and [Fruit Lucky Charms listing](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/family-cereals/fruity-cereals/p/065633150829).

## R700 — Yellowtail snapper picker-boundary hold

Accepted the source-verified *Ocyurus chrysurus* name pair as research evidence, but kept the active reference and ledger identity unallocated. OQLF prefers `vivaneau à queue jaune` and links `yellowtail snapper` to the species. CFIA lists that pair, but also assigns broad `snapper` and `vivaneau` labels across many taxa; adding the bilingual display would make those broad searches return only this species. The bundle has no matching demand. Reconsider when picker behavior can preserve the shared market-name scope. Sources: [OQLF GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1299192/vivaneau-a-queue-jaune), [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), and [CFIA snapper results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=snapper).

## Package snapshot

| Measure | Before R698–R700 | After integration |
| --- | ---: | ---: |
| Ingredient references | 1,838 | 1,839 |
| Forms | 173 | 173 |
| Legacy candidates | 56 | 56 |
| Recipes / ingredient rows | 114 / 1,123 | 114 / 1,123 |
| Research-ledger records | 2,220 | 2,221 |
| Source entries | 10,406 | 10,408 |
| Distinct source IDs | 8,782 | 8,782 |
| Distinct source URLs | 7,431 | 7,431 |

R698 adds two reused source entries to the Wheatlets record. It adds no new source ID or URL. R699 and R700 remain documented proposal-level holds and add no shared catalog or ledger records.

## Validation

- The generated `BundledIngredientCatalog.kt` was regenerated from the canonical reference JSON and contains 1,839 references.
- Static package/ledger, source ownership, picker projection, recipe-corpus, encoding, and documentation checks passed.
- No app tests, build, emulator run, or deployment were run under the updated `AGENTS.md` rule for database JSON data.

See the [R698 proposal](../../proposals/wp02-a7-next-open-gap-review-r698-20261018.md), [R699 proposal](../../proposals/wp03-section-f-next-open-grain-gap-review-r699-20261018.md), [R700 proposal](../../proposals/wp04-section-p-next-open-seafood-gap-review-r700-20261018.md), [catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt), [workflow](../../ingredient-catalog-workflow.md), [grain and cereal packet](../plant-grains-cereals.md), and [roadmap](../../../../roadmap.md).

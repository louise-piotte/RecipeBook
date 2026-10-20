# WP03 Section F: South African samp identity and Québec display boundary — 2026-10-13 (R54)

## Review record

- **Status:** integrated by root on 2026-10-13; see the integration decision below. The original hold recommendation was superseded.
- **Scope:** plain, dried, human-food South African *samp* sold as a maize product. This review does not cover the prepared dish *umngqusho* / samp and beans, or create a recipe identity.
- **Open checklist:** the Section F item for regionally significant cereal mixes and preprocessed grains remains open in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2587) and the [plant-grains checklist](../batches/plant-grains-cereals.md#L266).
- **Worker recommendation:** keep samp outside the active catalog and research ledger until a Québec or Canadian French product label or authoritative French terminology source resolves its display name and search boundary. The South African product identity itself is well supported; the hold concerns bilingual catalog naming and allocation.

South African government food specifications describe samp as dried corn kernels pounded and chopped until broken, but not ground as finely as maize meal. South African grading rules list *samp*, *maize rice*, *maize grits*, and *maize flour* separately. These sources establish a source-bounded regional product, not a universal grind specification or an equivalence to North American cornmeal or grits. French-language reporting glosses it as *maïs concassé*, but that is not a Québec terminology ruling. The OQLF's existing *semoule de maïs / corn meal* entry covers dried maize grinds from fine through coarse, and that French term already belongs to `ingredient-ref-cornmeal`. No distinct Québec French display is established here.

## Ownership, picker, forms, and archive audit

Read-only audit of the live package: **1,378 ingredient references, 100 forms, 63 legacy-import candidates, 1,708 ledger records, and 114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Current owner/result | Disposition |
| --- | --- | --- |
| Cornmeal | `ingredient-ref-cornmeal`: `cornmeal / semoule de maïs`, category `FLOUR_AND_STARCH`; English alias `corn meal`; no French aliases, density, or unit mappings. | Do not map samp to the existing cornmeal identity solely because both are maize products. The OQLF source allows coarse cornmeal, while the South African specification distinguishes samp by broken dried kernels. |
| Hominy | `ingredient-ref-hominy-corn`: `hominy corn / maïs lessivé`, with English alias `lyed corn`; `ingredient-ref-hominy-grits`: `hominy grits / gruau de maïs`. Neither has a density or unit mapping. | Keep samp separate from the lye-treated hominy identity and from its ground grits product. Do not add `hominy`, `hominy grits`, or `gruau de maïs` as samp aliases. |
| Other active maize products | `ingredient-ref-corn-kernels` is `corn kernels / maïs`; `ingredient-ref-corn-poha` is `corn poha / poha de maïs`; `ingredient-ref-maize-arraw` is `arraw (corn granules) / arraw de maïs`; `ingredient-ref-baddaz-corn-couscous` is Baddaz. `ingredient-ref-popcorn` now has French alias `maïs éclaté` from the integrated R53 review. | No reviewed source equates these whole-kernel, flattened, granular, couscous, or popped identities with samp. Do not transfer their labels to samp or reopen R53. |
| Grits search owners | `ingredient-ref-attieke` has English alias `steamed cassava grits`; `ingredient-ref-hominy-grits` is a grits identity; `ingredient-ref-sorghum-grits` has alias `sorghum grit`. | Generic `grits` is already ambiguous. Do not attach `grits` or `corn grits` to samp. |
| Forms | No active form label or match term contains exact `samp` or `umngqusho`; no form or match-term owner for those names was found. | No form or form hint is proposed. |
| Legacy import | None of the 63 legacy candidates has an exact normalized display or alias for `samp` or `umngqusho`. | No legacy promotion or remapping. |
| Research ledger | None of the 1,708 records contains exact `samp` or `umngqusho`, and no `candidate-south-african-samp` record exists. Nearby open corn candidates such as puffed corn, pearled hominy, polenta, and pozole corn remain separate. | Allocate no candidate ID or new ledger record in this proposal-only review. |
| Proposal and batch archive | Exact scans found no prior *samp*, *umngqusho*, or samp-and-beans decision. The prefix `WP03-SA-SAMP-20261013-R54-` was unused before this proposal. | This is a distinct review of the still-open regional/preprocessed-grain checklist item. |

The live picker uses complete normalized phrase matching before substring fallback. Current results are:

| Query | Current result |
| --- | --- |
| `samp`, `umngqusho`, `samp and beans`, `maize grits`, `corn grits`, `maize rice`, `maïs concassé` | No result |
| `cornmeal`, `corn meal`, `semoule de maïs` | `ingredient-ref-cornmeal` only |
| `hominy grits`, `gruau de maïs` | `ingredient-ref-hominy-grits` only |
| `grits` | `ingredient-ref-attieke`, `ingredient-ref-hominy-grits`, and `ingredient-ref-sorghum-grits` |
| `maïs éclaté` | `ingredient-ref-popcorn` only (R53) |

Keeping samp unallocated makes no picker change. If a future proposal adds a row, an exact `samp` query could be useful, but its French display must first be established. `semoule de maïs` would collide with the current cornmeal display; `grits` would broaden an already ambiguous query; and a bare `maïs concassé` alias would turn a descriptive French gloss into a global product identity without Québec scope evidence. `samp and beans` and *umngqusho* should remain dish/preparation wording, not dry-ingredient aliases.

## Bundled recipe demand

The full manifest-listed corpus has **zero of 114 recipes and zero of 1,123 ingredient rows** containing `samp`, `umngqusho`, `samp and beans`, `maize grits`, `corn grits`, `maize rice`, `cornmeal`, `hominy grits`, or `polenta`; no recipe line references a samp candidate. No recipe link or recipe edit is warranted. External cuisine reporting supports regional recognition, not demand in this bundled library.

## Numeric and substitution limits

The inspected live maize identities have no default density or unit mappings relevant to samp. The sources provide product or procurement pack sizes (including a current 1 kg Canadian retail pack and 10 kg South African listing), not household volume-to-mass measures. The 2024 government food specification's nutrition-per-100-g section is composition data, not a conversion or serving observation. No source reviewed supplies a transferable loose or packed density, household measure, cooked yield, dry-to-cooked conversion, or substitution ratio. No form, mapping, measure, yield, conversion, recipe link, or substitution is proposed. Do not substitute cornmeal, hominy, ordinary grits, maize rice, or another granular maize product for samp without recipe-specific evidence.

## Source evidence

| Source ID | Source and locator | Supports / limits |
| --- | --- | --- |
| `WP03-SA-SAMP-20261013-R54-S01` | South African Department of Basic Education, [2024 NSNP Food Specification Guidelines](https://www.education.gov.za/Portals/0/Documents/Publications/2024%20NSNP%20Food%20Specification%20Guidelines.pdf), §3.5.1, printed p. 19 / PDF p. 18. | Defines samp as dried corn kernels pounded and chopped until broken, but not as finely ground as mealie meal. This current public-sector school-food specification supports the product boundary; it does not set a Québec name, a single particle-size class, or a home-recipe measure. |
| `WP03-SA-SAMP-20261013-R54-S02` | South African Government, [Regulations: Grading, packing and marking of maize products intended for sale in South Africa](https://www.gov.za/sites/default/files/gcis_document/201601/39613pro3.pdf), regulation 3 and the fineness/general-description provisions. | Lists *samp*, *maize rice*, *maize grits*, and *maize flour* as separate named product grades. Used for category distinction only; no crosswalk to the app's cornmeal or hominy identities is inferred. |
| `WP03-SA-SAMP-20261013-R54-S03` | South African Store, [Iwisa Samp — 1 kg](https://southafricanstore.ca/products/iwiza-samp-1-kg), current product name and description; North York, Ontario retailer; rechecked 2026-10-13. | A current Canadian listing names the product *Samp* and describes dried, stamped corn kernels for South African cooking. The 1 kg figure is the listed pack size, not a recipe measure. The listing supplies no Québec French label. |
| `WP03-SA-SAMP-20261013-R54-S04` | NWK Shop, [Super White Samp 10KG](https://shop.nwk.co.za/products/super-white-samp-10kg), current product description; rechecked 2026-10-13. | A current South African product listing describes samp as coarsely stamped South African maize and mentions serving it with beans. It supports market use of the name and product distinction, not a universal recipe or package conversion. |
| `WP03-SA-SAMP-20261013-R54-S05` | *Le Monde*, [“J’ai servi du baobab séché dans un dîner caritatif”](https://www.lemonde.fr/m-styles/article/2019/02/21/j-ai-servi-du-baobab-seche-dans-un-diner-caritatif_5426227_4497319.html), photo caption, 2019-02-21. | French-language caption identifies a South African ingredient as `samp (maïs concassé)`. This is a descriptive Francophone gloss, not a Québec label or terminology ruling. |
| Reused `WP03-S144` | OQLF, [*semoule de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), definition and usage note (updated 2019). | Defines the term as a milling of dried maize, says the grind may be fine, medium, or coarse, and gives `corn meal` as English. This is the existing cornmeal owner's broad French term; it does not specifically name samp. |

## Proposed disposition

Keep South African samp outside the active catalog and ledger for now. Preserve it as a distinct regional, preprocessed maize candidate in the Section F review record; do not merge it into `cornmeal`, hominy, hominy grits, generic grits, maize rice, corn kernels, arraw, corn poha, or Baddaz. Do not activate `maïs concassé` or invent a qualified French translation. Revisit allocation when a Québec/Canadian French package label, authoritative terminology entry, or comparable local source resolves the display and search boundary. The broader Section F checklist remains open.

## Root integration decision — 2026-10-13

Accepted as an identity-only row despite the worker's proposed hold. The South African Department of
Basic Education defines samp as dried maize kernels pounded and chopped until broken, and South
African grading regulations list it separately from maize rice, maize grits, and maize flour. A
Canadian retailer lists a current 1 kg product named Iwisa Samp. The exact name `samp` is used in
French-language reporting, so the catalog stores `samp` in both locale fields while keeping the
fr-CA display provisional for independent Québec review. The descriptive gloss `maïs concassé` stays
out of aliases because it is not established as a Québec product name and could collide with other
broken-maize products.

Added `ingredient-ref-south-african-samp` in `GRAIN_AND_CEREAL` with no aliases, forms, recipe links,
or active numeric or substitution behavior. The 114-recipe bundle has no matching demand. Package
weights and the source nutrition table are not kitchen measures. Static package, generated-index,
ledger, ownership/picker, corpus, UTF-8, link, and whitespace checks passed. No app tests or emulator
checks were run because the application change only adds database JSON data.

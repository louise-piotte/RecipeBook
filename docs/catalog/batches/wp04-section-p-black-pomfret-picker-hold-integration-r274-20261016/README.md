# WP04 Section P R274 integration: black pomfret picker hold

## Decision

Keep black pomfret (*Parastromateus niger*) outside active references, forms, legacy identities, and the research ledger. CFIA pairs the species with Black Pomfret / Castagnoline Noire, and current Ontario and Montréal product pages support a market listing. Fresh Water Foods distinguishes black pomfret from silver pomfret and Golden Pomfret (Pompano). An active black-pomfret row by itself would make the broad `pomfret` picker query appear to resolve to one species. The 114 bundled recipes contain no matching ingredient rows.

No catalog or ledger data changed. Do not allocate an ID or add aliases, forms, measures, recipe links, conversions, yields, or substitutions. Keep the active pompano row and R252 silver-pomfret hold unchanged.

## Evidence and limits

- [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) provides accepted Canadian fish-labelling names and scientific names; its returned row for *P. niger* pairs Black Pomfret with Castagnoline Noire. The dynamic result page did not open as a static page during review.
- [ITIS](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=168785) recognizes *P. niger* as a valid species in Carangidae. This establishes taxonomy, not the identity of an individual retail package.
- [Fresh Water Foods](https://freshwaterfood.ca/tropical-fish.html) separately lists black pomfret (*P. niger*), silver pomfret (*Pampus argenteus*), and Golden Pomfret (Pompano) (*Trachinotus blochii*). Its seller-specific origins, sizes, forms, and cooking suggestions are not general standards or substitution evidence.
- [Madina Supermarket](https://madinasupermarket.ca/product/black-pomfret-indian/) lists “BLACK POMFRET INDIAN (350-500 GR)” and a LaSalle address, but no binomial, French wording, package-label image, or current stock status.
- No independent Québec consumer wording for this species was established. No bundled recipe demand was found in the 114 recipes / 1,123 ingredient rows.

The proposal records the source scope, exact-ownership audit, picker projection, and recipe scan: [R274 proposal](../../proposals/wp04-section-p-black-pomfret-picker-hold-review-r274-20261016.md). The adjacent decisions are [R252 silver pomfret](../../proposals/wp04-section-p-residual-seafood-gap-review-r252-20261016.md) and [R109 pompano](../../proposals/wp04-section-p-pompano-market-group-identity-review-r109-20261014.md).

## Validation

The proposal’s static review confirmed UTF-8 without BOM, local references, whitespace, and proposal-local source-ID uniqueness. The checklist and roadmap links were reviewed after integration. No catalog JSON changed, so no package or application tests, build, emulator, or deployment checks were needed.

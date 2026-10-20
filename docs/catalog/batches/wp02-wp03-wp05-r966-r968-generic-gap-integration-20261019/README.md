# WP02/WP03/WP05 R966–R968 generic-gap integration

Reviewed and integrated on 2026-10-19. Root review confirmed each proposal’s identity boundary, exact catalog/ledger ownership, recipe demand, source ownership, measurement and substitution limits, and cross-category scope. The three proposals were proposal-only; shared data files were changed only during this root integration.

## Dispositions

- **R966, separated rice germ:** the new food studies resolve the standalone human-food-use question, but no supported Québec-facing French human-food name was found. Keep the identity out of active reference and ledger data. OQLF’s `germe de riz` entry is feed/treatment-scoped. Preserve existing rice-bran and sprouted-rice entries and their evidence. See the [proposal](../../proposals/wp02-a7-generic-grain-gap-review-r966-20261019.md) and the [prior R60 hold](../../proposals/wp03-section-f-rice-germ-human-food-boundary-hold-20261013-r60.md).
- **R967, musk pumpkin leaves:** added identity-only `musk pumpkin leaves / feuilles de courge musquée` for leaves of *Cucurbita moschata*, with no aliases. USDA SR28’s 39 g raw cup entry has no taxon in its item label; its 71 g cooked entry identifies only *Cucurbita spp.*. FAO’s Pacific Islands composition entries are explicitly *C. pepo*. Keep those values source- and taxon-scoped; no measures, density, mapping, form, recipe link, or active substitution was added. The PROTA *C. maxima* replacement statement remains blocked for lack of dish role, preparation-state match, ratio, and adjustment evidence. See the [proposal](../../proposals/wp03-section-k-generic-produce-gap-review-r967-20261019.md).
- **R968, nanohana-zuke:** added identity-only `nanohana-zuke / nanohana-zuke`, with `Matsugasaki-zuke` as the one MAFF-attested English alternate spelling. Keep the French display provisional and add no French alias. MAFF’s 60 g quantity is for unspecified Kyoto pickles, not this preserve; the rice-bran method duration is not a measure. No form, reusable measurement, recipe link, conversion, yield, or active substitution was added. See the [proposal](../../proposals/wp05-section-w-generic-preserved-food-gap-review-r968-20261019.md).

## Scope and preservation

The cross-category queue review found no new open task whose sole deliverable is a commercial roster. The existing Section F cereal-roster clauses and named Anson Mills wheat-meal lead remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and their product-specific evidence were preserved; no product-only measurement or claim was generalized without a separate transferability review.

R967 adds seven source records and R968 adds two. R966 source evidence remains proposal-local while the candidate is held. The catalog now has 1,986 references, 205 forms, and 2,391 ledger records. Recipe corpus remains 114 files and 1,123 ingredient rows. No forms, unit conversions, densities, recipe links, or active substitutions were added.

## Validation

Static package, schema, source-ID ownership, generated-index freshness, exact-name ownership, recipe-demand, encoding, link, and scoped-whitespace checks passed. No software tests were run because app changes only add database JSON under `AGENTS.md`.

# WP02/WP03/WP05 R978–R980 generic ingredient integration

Reviewed and integrated on 2026-10-19. The root checked ingredient identity, bilingual naming, source ownership, bundled recipe demand, evidence limits, and the all-category catalog scope before changing shared data.

## Dispositions

- **R978, defatted oat bran:** added identity-only `defatted oat bran / son d’avoine dégraissé` in `GRAIN_AND_CEREAL`. Keep the French qualifier descriptive and provisional. Reused the existing OQLF oat-bran definition source on the oat-germ boundary record (`WP02-B2-OAT-GERM-R933-20261019-S04`). The biscuit study's bran replacement levels and the VTT dissertation's defatted oat-bran concentrate remain scoped to their cited studies. Added no aliases, forms, measures, density, unit mapping, recipe link, conversion, yield, or active substitution.
- **R979, ivy-gourd leaves and shoots:** added one part-qualified identity for leaves and tender shoots of *Coccinia grandis* in `VEGETABLE_AND_AROMATIC`, with no aliases. JIRCAS supports edible young shoots; PROSEA supports culinary use of leaves and shoots. The French display remains descriptive and provisional because the Health Canada source names `courge lierre` for the fruit part, not a Québec culinary leaf/shoot term. Preserve the existing ivy-gourd fruit row and its evidence. Added no measures, forms, recipe links, conversions, yields, or substitutions.
- **R980, Dongbei suancai:** added identity-only `Dongbei suancai / Dongbei suancai` in `SAUCE_AND_CONDIMENT`, with no aliases. Keep the French display as a provisional borrowed name and leave the unqualified `suan cai` held because it spans different regional products. The studies' cabbage, salt, jar, timing, and laboratory findings remain source-specific. Preserve napa cabbage, Bashang suancai, other named preserves, and all existing branded rows. Added no forms, measures, recipe links, conversions, yields, or active substitutions.

## Cross-category scope and preservation

- The fresh open-plan scan found no new task whose sole deliverable was a commercial brand, product-line, flavour-family, SKU, or retailer-variant roster. Such roster-only work remains out of scope because commercial-product counts do not add ingredient diversity. The previously dispositioned Section F commercial cereal-roster clauses and named Anson Mills wheat-meal lead remain out of scope; generic ingredient diversity remains open across every category.
- Existing branded entries, source ownership, and product-specific evidence were left intact. Manufacturer or product pages may still support a generic ingredient where their evidence transfers beyond the named product. No product-specific quantity or claim was generalized in this batch.
- The three proposal packets record pre-integration ownership and recipe-corpus snapshots. Their final integration status and any proposal-stage source corrections are noted in the packets and this README.

## Validation

Static reference normalization, bundled package validation, ledger JSON Schema validation, generated-catalog freshness, unique reference/ledger IDs, source ownership and decision/finding source links, form ownership, candidate-name recipe scans, UTF-8/no-BOM and escaped-Unicode checks, local links, and scoped whitespace checks passed at **1,998 references, 205 forms, 55 legacy candidates, 2,403 ledger records, and 114 recipes / 1,123 ingredient rows**. The integration added ten new source IDs and reused one existing OQLF source ID. No software tests or builds were run because these changes only add database JSON under `AGENTS.md`.

See the [R978 proposal](../../proposals/wp02-a7-generic-gap-review-r978-20261019.md), [R979 proposal](../../proposals/wp03-section-k-generic-gap-review-r979-20261019.md), and [R980 proposal](../../proposals/wp05-section-w-generic-gap-review-r980-20261019.md).

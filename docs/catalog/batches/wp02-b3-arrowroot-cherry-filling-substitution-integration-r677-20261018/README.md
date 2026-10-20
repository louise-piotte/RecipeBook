# WP02 B3 R677 — arrowroot option in Cherry Cake Filling

Integrated 2026-10-18. Updated the existing `ingredient-ref-arrowroot` research record for Baking With Butter's Cherry Cake Filling. The recipe card lists cornstarch or arrowroot, but its written method makes a cornstarch slurry and boils the filling for about five minutes. Bob's Red Mill gives arrowroot-specific thickening guidance while warning about long, high-temperature cooking; one reader comment reports an undesirable texture after trying arrowroot.

## Ledger change

- Reused recipe source `WP03-FRUIT-PITTED-20261011-S05` on the arrowroot record. The same URL and source ID remain on the pitted-cherry form record, where it supports the cherry amount.
- Refined the existing Bob's Red Mill source entry to record its bounded 1:1 guidance, heat caveat, and acidic-ingredient note. No new source ID or URL was allocated.
- Set substitution research to `blocked_pending_evidence`, added one unresolved decision and one recipe-scoped blocked finding. The reader report remains identified as anecdotal.
- Preserved the existing measurement state and observations, aliases, French labels, null density, empty mappings, and all active rules. No form, recipe link, recipe edit, measure, conversion, yield, or substitution rule was added.
- The recipe corpus remains at 114 files / 1,123 ingredient rows. Recipe 029's cornstarch line remains linked only to cornstarch.

## Validation

Research-ledger schema and custom validation passed with 2,215 records and zero errors. Source-ID/URL ownership, recipe-corpus, UTF-8/no-BOM, local-link, and whitespace checks passed. No software tests, build, emulator, or deployment were run because this update only adds database JSON research data and documentation under [AGENTS.md](../../../../AGENTS.md).

See the [R677 proposal](../../proposals/wp02-b3-arrowroot-cherry-filling-substitution-review-r677-20261018.md) and the [B2/B3 plan section](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3164). Broader WP02 B2/B3 coverage remains open.

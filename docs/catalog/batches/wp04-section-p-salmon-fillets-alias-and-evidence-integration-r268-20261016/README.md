# R268 — Salmon-fillets alias and scoped evidence

Integrated on 2026-10-16 from the [WP04 Section P proposal](../../proposals/wp04-next-section-p-gap-review-r268-20261016.md).

## Catalog and ledger changes

- Added `filets de saumon` to the French aliases for `ingredient-ref-salmon-fillets-without-skin`; kept the existing displays and English aliases unchanged.
- Verified the generic recipe-search identity while retaining the unresolved species boundary for recipe 077#10. Its `675 g` quantity, generic reference link, and skinless/cubed preparation remain unchanged.
- Recorded the IGA-credited Québec recipe’s approximate `1 filet ≈ 200 g` only as a source-specific estimate. The recipe page is dated 2009-09-03; this supports the wording and recipe statement, not a claim about current retail availability or a universal fillet weight.
- Recorded the author’s rainbow-trout and Arctic-char alternatives as a supported finding for that dill-baked recipe only. `omble de l’Arctique` maps to the existing Arctic-char reference for research purposes; it was not added as an alias.
- Added no form, density, unit mapping, conversion, cooking or edible yield, default count measure, global or contextual substitution rule, or recipe-line substitution.

## Static verification

- Bundled seed package validation passed, and the package is normalized.
- Generated ingredient catalog is current at 1,656 references.
- Research ledger validates against `research-ledger.schema.json`; R268 decision, measurement, and finding source IDs are attached to this record, and each source ID retains one URL.
- Phrase-first picker projection: `filets de saumon` returns only the generic fillet row; `filet de saumon` remains one result; bare `filets` has six fillet results; broad `salmon` and `saumon` each retain nine; species and canned/smoked queries retain their separate rows.
- Manifest scan: 114 recipes and 1,123 ingredient rows; the single salmon row remains recipe 077#10.
- UTF-8/no-BOM, local links, and `git diff --check` passed.

No software tests, Gradle tasks, emulator checks, or deployment were run because the change adds database JSON data under `AGENTS.md`.

Ledger totals after integration: 2,004 records, 8,788 source entries, 7,441 distinct source IDs, and 6,207 distinct URLs. The bundle remains 114 recipes / 1,123 ingredient rows. Broader Section P work remains open.

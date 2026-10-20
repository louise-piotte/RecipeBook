# WP04 Section P Pacific saury picker-boundary review

Reviewed and integrated on 2026-10-13 from
[`wp04-section-p-pacific-saury-balaou-picker-boundary-review-20261013.md`](../../proposals/wp04-section-p-pacific-saury-balaou-picker-boundary-review-20261013.md).

## Decision

Record Pacific saury (*Cololabis saira*) as ledger-only `candidate-pacific-saury` with
`identityState: verified`. CFIA lists Pacific and Atlantic saury with overlapping short names, and
OQLF's older Québec `balaou` entry maps to Atlantic saury. The current picker would return the
Pacific candidate alone for broad `saury` and `balaou` searches even when its displays are qualified
as `Pacific saury / balaou du Pacifique`. Keep the identity out of active references until search can
preserve both species scopes.

Current Montréal canned and Canadian frozen product listings support human-food use but establish
no reusable measure, form, count-to-mass conversion, yield, or substitution. No bundled recipe
requests Pacific saury. Add no active row, alias, form, recipe link, measurement, conversion, yield,
or substitution.

## Files

- Research evidence: `docs/catalog/research-ledger.v1.json`
- Plan and roadmap: `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `roadmap.md`
- Review proposal: [`proposal`](../../proposals/wp04-section-p-pacific-saury-balaou-picker-boundary-review-20261013.md)

## Verification

Static seed-package and ledger validation, generated-index freshness, exact-key/picker ownership,
recipe-corpus, source-ID/URL, UTF-8/no-BOM, local-link, and whitespace checks passed. No tests or
emulator checks were run because this change only adds database JSON research evidence, per
`AGENTS.md`.

# WP02/WP03/WP04 R302–R304 Research Integration

Integrated 2026-10-16 by the root reviewer from the three proposal-only reviews:

- [WP02 R302 — green lentil flour measurement and substitution](../../proposals/wp02-next-open-b2-b3-gap-review-r302-20261016.md)
- [WP03 R303 — dry quinoa portion evidence](../../proposals/wp03-section-f-next-gap-review-r303-20261016.md)
- [WP04 R304 — Atlantic mackerel French alias](../../proposals/wp04-section-p-next-gap-review-r304-20261016.md)

The reference total remains **1,671** and the form total remains **127**. The research ledger remains at **2,018 records** and now has **8,938 source entries**. The bundle remains 114 manifest-listed recipes and 1,123 structured ingredient rows.

## R302 — green lentil flour

The existing `ingredient-ref-green-lentil-flour` reference is unchanged. Its `measurementState` is now `researched_no_supported_value`: the reviewed Québec package listings and milling research do not establish a household portion, cup weight, or product-matched density. No observation, density, or unit mapping was added.

The bounded substitution review adds six scoped sources. During integration, review of the newer primary studies added the 2024 open-access muffin study and its 2026 sensory follow-up, which were not in the proposal's original source set. Together they support only one specific alternative: green lentil flour replacing part of the oat flour in the tested muffin formulation. That formula used a 50% green-lentil flour share of its flour blend and adjusted other ingredients; the follow-up used green lentils milled in-house and reported similar flavour, texture, and overall acceptance, with lower appearance and smell scores. The formula is recorded as `researched_supported` evidence, with no generic ratio or active substitution rule.

The two 2022 wheat-bread studies remain `blocked_pending_evidence` findings for general recipe use. Their flour blends and results are limited to experimental products and methods, and do not support a reusable wheat replacement instruction. No form, recipe link, yield, conversion, or active rule was added. The bundled corpus has no matching green-lentil-flour recipe demand.

New integration sources are `WP02-B2-GREEN-LENTIL-FLOUR-MEASURE-SUBSTITUTION-R302-20261016-S01` through `S06`. The 2024 paper is available in the [Catholic University of Portugal repository](https://ciencia.ucp.pt/ws/files/108737711/107219764.pdf); the [publisher record](https://www.sciencedirect.com/science/article/pii/S095965262403275X) and [2026 sensory follow-up](https://www.sciencedirect.com/science/article/abs/pii/S2949824426000820) were also checked.

## R303 — dry quinoa portions

Added two `portion_weight` observations to the existing `ingredient-form-quinoa-dry` ledger record for Health Canada's CNF 2015 Food Code 4495:

- 100 mL = 71.9 g
- 250 mL = 179.6 g

These are publication-specific portions. No packing method is stated; neither value is promoted to a density, unit mapping, or reusable measure. They are not combined with the cooked-quinoa records. The generic quinoa reference, active measurements, conversion, yield, and recipe 016#1 cooked-form link are unchanged.

The dry form's measurement research state is `researched_supported` for these historical observations. CNF 2026 Food Code 4495 row contents were not inspected, so a separate open checklist item now tracks that review when the files become accessible.

## R304 — Atlantic mackerel alias

Added `maquereau bleu` to `aliasesFr` on the existing `ingredient-ref-atlantic-mackerel` reference. DFO's French fish guide pairs the phrase with *Scomber scombrus* and English “Atlantic mackerel”; a 2022 DFO fisheries plan confirms Canadian Atlantic use. The displayed names remain `maquereau de l’Atlantique / Atlantic mackerel`, and the generic, Pacific, canned, and smoked mackerel boundaries remain unchanged.

The normal short-token search behavior means `bleu` gains Atlantic mackerel as a sixth result. This side effect is documented; no phrase-only search workaround was added. No form, measurement, conversion, substitution, recipe link, or legacy mapping changed.

## Files and verification

- Updated `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` for the French mackerel alias.
- Updated `docs/catalog/research-ledger.v1.json` with the source records, scoped findings, dry-quinoa observations, and research states.
- Updated the global ingredient catalog plan with the three completed subtasks and an open CNF 2026 dry-quinoa row review.
- The generated Kotlin catalog index is maintained by the seed-package normalizer; its check status is recorded after validation below.

No application logic, recipe data, or schema changed; the generated Kotlin import-audit index was refreshed from the canonical reference JSON. No software tests, build, emulator session, or deployment was run, as the changes are database JSON data only under the updated `AGENTS.md` rule. Static package, schema, source-ownership, Unicode, and generated-index validation results are recorded after normalization and checks.

Static verification completed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — package already normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — package and research ledger valid.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated index current for 1,671 references.
- Confirmed all nine new source IDs have unique ownership, all measurement-observation IDs and substitution-finding IDs are unique, and the R304 picker projection returns only Atlantic mackerel for `maquereau bleu`; `bleu` has six results, while `maquereau` has five and `mackerel` has six.
- Scanned all 114 manifest-listed recipe files for the new green-lentil-flour demand and the mackerel alias/species terms; no hits. Confirmed both edited JSON files are UTF-8 without BOM or mojibake markers.
- Scoped `git diff --check` passed for the integration files. The repository-wide check is not used here because unrelated modified files already contain whitespace errors.

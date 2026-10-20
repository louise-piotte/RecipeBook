# WP03 generic rice, quinoa, and oat-bran state forms

## Packet record

- **Owner:** catalog integration lead
- **Reviewers:** WP03 research and independent Québec French reviewer remain pending
- **Status:** integrated; WP03 remains open
- **Decision date:** 2026-10-07
- **Scope:** resolve the dry/cooked allocation under WP01, update the canonical seed and research ledger, attach explicitly cooked recipe lines, and verify bilingual form search. No measurement, yield, conversion, or substitution work is included.

## Model decision

Apply the completed WP01 identity/form contract: when dry and cooked describe the preparation state of the same food, retain one base identity and use forms where the state matters for recipe matching. This resolves the old rice-specific hold without creating a row for every grain type × state combination.

- Keep stable `ingredient-ref-rice` as `rice / riz`; add `ingredient-form-rice-dry` and `ingredient-form-rice-cooked`.
- Keep stable `ingredient-ref-quinoa` as `quinoa / quinoa`; add `ingredient-form-quinoa-dry` and `ingredient-form-quinoa-cooked`.
- Add `ingredient-ref-oat-bran` as `oat bran / son d'avoine`, separate from oat flour and whole oats; add dry and cooked forms.
- Leave all aliases empty. Do not apply these generic state forms to every named rice identity.
- Keep all densities, unit mappings, conversions, cooking yields, and substitutions absent. Health Canada's pages display food-composition and serving-size values, but those numbers were not imported.

## Seed rows

| Stable ID | English | fr-CA | State | Category / note |
| --- | --- | --- | --- | --- |
| `ingredient-ref-rice` | rice | riz | Base | `GRAIN_AND_CEREAL`; stable ID, now a base identity |
| `ingredient-form-rice-dry` | dry rice | riz sec | Dry | Explicit state form; no density or yield |
| `ingredient-form-rice-cooked` | cooked rice | riz cuit | Cooked | Explicit state form; linked to three cooked-rice recipe lines |
| `ingredient-ref-quinoa` | quinoa | quinoa | Base | `GRAIN_AND_CEREAL`; stable ID, now a base identity |
| `ingredient-form-quinoa-dry` | quinoa, dry | quinoa, sec | Dry | Explicit state form; no density or yield |
| `ingredient-form-quinoa-cooked` | quinoa, cooked | quinoa, cuit | Cooked | Explicit state form; linked to the cooked-quinoa recipe line |
| `ingredient-ref-oat-bran` | oat bran | son d'avoine | Base | `GRAIN_AND_CEREAL`; distinct from oat flour and whole oats |
| `ingredient-form-oat-bran-dry` | oat bran, dry | son d'avoine, sec | Dry | Explicit state form; no density or yield |
| `ingredient-form-oat-bran-cooked` | oat bran, cooked | son d'avoine, cuit | Cooked | Explicit state form; no density or yield |

## Recipe audit

Scanned all 114 bundled recipe files. The three existing lines linked to generic rice explicitly request cooked rice and now carry `ingredient-form-rice-cooked`. The one line linked to quinoa explicitly requests cooked quinoa and now carries `ingredient-form-quinoa-cooked`. The exact display/alias audit found no key collision after the base names changed.

“Cooked white rice, for serving” remains unlinked because the generic base does not capture its white-rice qualifier; no recipe text or quantity changed. No bundled recipe requests dry rice or oat bran. At this checkpoint, the legacy `rice cereal` row remained unresolved; the later 2026-10-07 crispy-rice-cereal checkpoint scopes it to the processed cereal product used by recipe 040.

## Evidence

| Source | Use and limits |
| --- | --- |
| [OQLF, riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432759/riz) | Directly pairs *riz* with *rice* and identifies the edible grain; no variety or preparation-state claim. |
| [Codex, Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf) | Rice identity and separation of milling/grain-length classes; no Québec display names or conversions. |
| [Health Canada CNF, white long-grain rice, dry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471), [cooked](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523) | Exact bilingual state descriptions. These source records specify white long-grain regular rice; only the dry/cooked state distinction is used on generic rice. No serving values are imported. |
| [Health Canada CNF, quinoa, dry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495), [cooked](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5917) | Exact bilingual dry/cooked state descriptions. No serving values are imported. |
| [OQLF, pseudocéréale](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26577199/pseudocereale) | Lists quinoa among pseudocereals; supports the grain identity, separate from quinoa flour. |
| [Health Canada CNF, oat bran, dry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4493), [cooked](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4494) | Exact bilingual oat-bran state labels. No serving values are imported. |

The Health Canada and OQLF pages were checked on 2026-10-07. Source records are `WP03-S2`, `WP03-S3`, `WP03-S3-COOKED-4523`, `WP03-S5`, `WP03-S5-COOKED-5917`, `WP03-S14`, `WP03-S24`, `WP03-S24-COOKED-4494`, and `WP03-S74` in the research ledger.

## Verification

- Bundled package validation and normalized-state checks: passed.
- Ingredient-reference normalization and generated Kotlin index freshness: passed (348 references).
- Python seed-package tests: 9 passed.
- Android unit tests: 249 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 API 36 verification: the deploy script built and installed the app after emulator storage recovery. English searches showed `rice / cooked rice` and `rice / dry rice`; fr-CA searches showed `riz / riz cuit`, `quinoa / quinoa, sec`, and `son d'avoine / son d'avoine, cuit`. The blank draft probes were discarded without saving. The French home returned to 114 recipes.
- UTF-8/no-BOM and escaped-Unicode seed audit: passed across all 125 bundled JSON files and the evidence ledger.
- `git diff --check`: passed.

## Screenshots

- [English cooked-rice picker](pixel9a-rice-form-picker-en.png)
- [English dry-rice picker](pixel9a-rice-dry-form-picker-en.png)
- [fr-CA cooked-rice picker](pixel9a-rice-form-picker-fr-ca.png)
- [fr-CA dry-quinoa picker](pixel9a-quinoa-dry-form-picker-fr-ca.png)
- [fr-CA cooked-oat-bran picker](pixel9a-oat-bran-cooked-form-picker-fr-ca.png)
- [fr-CA home with 114 recipes](pixel9a-grains-home-fr-ca-114.png)

The deployment required uninstalling the emulator-only app because the AVD lacked internal storage; it was reseeded from the bundled package before the live picker checks.

## Remaining work

Independent Québec French review, measurements, cooking-yield evidence, conversions, and substitutions remain separate work. Do not use source portion weights as conversion data. Keep the broader Section F packet open for broken rice, generic sushi rice, rice flakes/poha, oat processing forms, and remaining grains. Black rice and scoped edible red rice were integrated in later checkpoints; crispy rice cereal was also resolved afterward.

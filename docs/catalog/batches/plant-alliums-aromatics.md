# WP03 Allium Identity Follow-up (Section 04 J)

## Packet record

- **Owner:** WP03 plant-identity integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-05
- **Scope:** Reconcile shallot and common chives legacy candidates and add Chinese chives as source-backed Section J identities. This is an allium tranche, not completion of the allium checklist or WP03.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4` (`main`). The plan input SHA-256 was `f7e97e02ddb4493697c686dd9d81d9f708a1dc290b568029ddd4002360083d17`. The pre-integration reference JSON SHA-256 was `0b6f9ee7b0a169e90e58469ee85143c68cfd28e8005d17f1a636d87463d0dac6` (269 references); the current file has 272 references and SHA-256 `200ee378e166ac71067824677952a9cb43191a118ec51acb3d61c6e1141339a3`. The 114 recipe files were searched through their ingredient-name/reference fields; none directly use these three identities. `shallots` appears in free-text method prose, not as an ingredient line.
- **Dependencies:** WP01 identity/evidence contract; previous WP03 plant packets; WP10 stable-ID and canonical seed integration.

## Integrated identity decisions

All rows use `VEGETABLE_AND_AROMATIC`, null density, and empty unit mappings. The shallot and common-chive IDs previously existed as unresolved legacy candidates; they are now reconciled to source-backed ingredient references. Chinese chives uses a new ID. All three ledger records have identity state `verified`; measurement and substitution research remain `not_yet_researched`. No forms, conversions, yields, or substitutions were added.

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-shallot` | shallot / échalote française | EN: `eschalot`, `shallots`; FR: `échalote sèche` | OQLF lists shallot / échalote and distinguishes Québec `échalote française` from immature onion and ciboule, which may also be called `échalote`. Keep unqualified `échalote` inactive as an alias. [S01] |
| `ingredient-ref-chives` | chives / ciboulette | EN: `chive`; FR: `civette` | OQLF lists the bilingual terms and notes that ciboulette and ciboule resemble one another but are distinct and often confused. Keep `cive` inactive because OQLF also uses it for ciboule. [S02] |
| `ingredient-ref-chinese-chives` | Chinese chives / ciboulette chinoise | EN: `garlic chives`; FR: none | OQLF identifies *Allium tuberosum*, lists both English terms, and describes its garlic-like leaves and flower stalks as culinary parts. Keep distinct from common chives and garlic. [S03] |

The existing `ingredient-ref-green-onions` row and its `scallions` alias were not changed. The OQLF entry for ciboule lists scallion and green onion among its English equivalents but also explains the local overlap with immature *Allium cepa*. Do not resolve a future recipe mention of `échalote` by silently changing this row or the shallot row; review its source wording and context.

Source records `WP03J-S11`–`WP03J-S13` are attached to the three catalog rows in `docs/catalog/research-ledger.v1.json`. Identity terminology does not establish measurements or substitutions.

## Source register

- **S01 — OQLF, « échalote »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083670/echalote), preferred terms, English equivalents, botanical identity, and Québec distinction among shallot, immature onion, and ciboule.
- **S02 — OQLF, « ciboulette »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083617/ciboulette), bilingual terms, botanical identity, and distinction from ciboule.
- **S03 — OQLF, « ciboulette chinoise »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015544/ciboulette-chinoise), preferred French term, English equivalents, botanical identity, and culinary-use note.

## Verification

- `./gradlew :app:testDebugUnitTest --no-daemon --console=plain`: 193 tests passed with no failures, errors, or skips. The deploy script's full `test` task and `:app:assembleDebug` passed.
- All 9 Python seed-package tests, ingredient/package normalization and validation, generated-index freshness, evidence-ledger schema validation (424 records), UTF-8/no-BOM checks across 124 bundled JSON files, and `git diff --check` passed.
- The app installed and launched on Pixel 9a / Android 16. Picker query `chinoise` returned only `Chinese chives`; English alias query `eschalot` returned `shallot`. The empty probe was discarded and the home screen remained at 114 recipes.
- Keep independent bilingual review and measurement/substitution research separate. No numeric or interchangeability claim is active from this tranche.

## Remaining work

- Obtain independent bilingual review of the three labels and aliases.
- Continue the Section J review for onion types, garlic scapes, other aromatics, roots, tubers, regional produce, and preparation forms.
- Preserve the Québec ambiguity among `échalote`, `oignon vert`, and ciboule until source/context supports a resolution.

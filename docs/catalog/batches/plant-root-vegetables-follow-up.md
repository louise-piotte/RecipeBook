# WP03 Root Vegetable Follow-up (Section 04 J)

## Packet record

- **Owner:** WP03 plant-identity integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-05
- **Scope:** Review the existing carrot / carotte identity and its size-related aliases; add beet, radish, daikon, and kohlrabi as source-backed identities. This is a Section J tranche, not full Section J or WP03 completion.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4` (`main`). The plan input SHA-256 was `d290bcb9fb9667a604dec103c45f302f1f11b06edb76b31dbd0382704d3aea41`. The pre-integration reference file SHA-256 was `5c7cde95739576a1d58afb6f87a5822cfd99d6c1cddc4ed6e9fdeea67454a654` (265 references); the current integrated file has 269 references and SHA-256 `0b6f9ee7b0a169e90e58469ee85143c68cfd28e8005d17f1a636d87463d0dac6`. The 114 recipe files had combined fingerprint `f2e98fbcd7ac5c7b838a58d4d401c3c82b8dfc4598fdcae8ea23f60dc05c0ab6`. Four recipe lines directly reference the existing carrot ID; no recipe line directly references the four new identities. The broad text match in `peas and carrots` remains an unlinked compound ingredient line.
- **Dependencies:** WP01 identity and evidence contract; earlier WP03 grain and root/tuber packets; WP10 stable-ID and canonical seed integration.

## Integrated identity decisions

Every row uses `VEGETABLE_AND_AROMATIC`, null density, and empty unit mappings. The existing carrot row is now identity-verified from OQLF; its unsupported `baby carrots` / `petites carottes` aliases were removed because they can encode size or product form and are not established as unconditional synonyms by the source. The four new rows have identity state `verified`; their measurement and substitution research remain `not_yet_researched`. No forms, conversions, yields, or substitutions were added.

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-carrot` (existing) | carrot / carotte | None | OQLF supports the cultivated carrot identity. Do not use size/product wording as a generic alias without a clearer identity or form decision. Four existing recipe lines retain their carrot ID. [S01] |
| `ingredient-ref-beet` | beet / betterave | EN: `beetroot`; FR: `betterave potagère` | OQLF lists both English terms and the Québec French name. Keep `bette` inactive: OQLF discourages it for beet because it names chard. [S02] |
| `ingredient-ref-radish` | radish / radis | None | OQLF lists radish / radis and describes multiple ordinary radish colors and shapes. Keep separate from horseradish and the named daikon identity. [S03] |
| `ingredient-ref-daikon` | daikon / daïkon | EN: `Chinese radish`, `Japanese radish`, `Oriental radish`; FR: `radis daïkon`, `radis oriental`, `radis du Japon`, `radis japonais`, `radis de Satzouma`, `radis blanc` | OQLF lists these terms for daikon, a specific large Oriental radish. The English display already covers French `daikon` after accent folding; do not add generic `radish` / `radis` as aliases. [S04] |
| `ingredient-ref-kohlrabi` | kohlrabi / chou-rave | None | OQLF gives the bilingual pair and identifies *Brassica oleracea* var. *gongylodes*. Do not use `chou-navet`: despite the word's etymology, kohlrabi is not a turnip-cabbage hybrid. [S05] |

The five source records `WP03J-S06`–`WP03J-S10` are attached to these catalog rows in `docs/catalog/research-ledger.v1.json`. Identity terminology does not establish measurements or substitutions.

## Source register

- **S01 — OQLF, « carotte »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296988/carotte), preferred French and English names for cultivated carrot.
- **S02 — OQLF, « betterave »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297065/betterave), preferred beet / beetroot terms and the Québec warning about `bette`.
- **S03 — OQLF, « radis »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082624/radis), radish / radis identity, varieties, and distinction from horseradish.
- **S04 — OQLF, « daïkon »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17018743/daikon), preferred French variants, English equivalents, and botanical identity.
- **S05 — OQLF, « chou-rave »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296983/chou-rave), preferred bilingual pair, botanical identity, and clarification that the plant is not a turnip-cabbage hybrid.

## Verification

- `./gradlew :app:testDebugUnitTest --no-daemon --console=plain`: 192 tests passed with no failures, errors, or skips. The deployment script's full `test` task and `:app:assembleDebug` passed.
- All 9 Python seed-package tests, ingredient/package normalization and validation, generated-index freshness, evidence-ledger schema validation (423 records), and `git diff --check` passed.
- The app installed and launched on Pixel 9a / Android 16. Live picker search `radis blanc` returned `daikon`; the unsaved probe was discarded and the home screen still showed 114 recipes.
- This live search used the retained emulator store to confirm the new identity. Insert-only refresh preserves previously stored catalog rows, so the prior carrot aliases may remain on an already seeded device; they are absent from the canonical seed and generated index and the unit test asserts they are no longer in the canonical search catalog. No migration was added.

## Remaining work

- Obtain independent bilingual review of the reviewed carrot aliases and the four new identities.
- Continue Section J coverage for alliums, other roots and tubers, regional produce, and preparation forms; preserve distinctions among radish, daikon, horseradish, rutabaga, turnip, and kohlrabi.
- Keep measurement and substitution research separate. No numeric or interchangeability claim is active from this tranche.

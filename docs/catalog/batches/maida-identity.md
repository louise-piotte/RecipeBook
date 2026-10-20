# WP02 Maida Identity (Section 04 A2)

## Packet record

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate maida as a distinct regional wheat-flour identity with bilingual naming supported by current Canadian product listings. Do not equate it with all-purpose flour or infer measurement/substitution data.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `0f81e8dddbc9feacd22e1458cd7c6f04da643190c2b44eb8e8c4889a0516c0b6` (298 references); pre-integration ledger SHA-256 `f5827d2eef6f5916f6c16947d260acb4c5e7ab7c222dc2d9d1d4fa6dd8e5476b` (448 records); plan snapshot SHA-256 `c1dab2ee9b631ad3c549abbbe48acc7fd0d068f2d294e2f02e0ad2c87111c63d`.
- **Recipe audit:** no direct recipe line contains `maida` or `maida flour`; no recipe line was relinked.
- **Dependencies:** WP01 identity/evidence contract; WP02 flour/starch source packet; WP10 canonical seed integration.

## Integrated identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-maida` | maida / maida | EN: `maida flour`; no FR aliases | FSSAI defines maida as a wheat-milling product with bran and germ essentially removed. Canadian English and French grocery listings preserve the name `Maida` in their titles for the same product number. Keep distinct from atta and from generic all-purpose flour. [S01–S03] |

Retail titles add the broad descriptors “All Purpose Flour” and “Farine tout usage” before Maida.
Those complete titles are documentary market wording, not active aliases: the app already uses the broad
terms for generic all-purpose flour, and including them in a searchable phrase would make the generic
query return multiple identities. The canonical product name remains `maida` in both locales; the
English `maida flour` alias retains the flour cue without activating a broad all-purpose synonym.

The new row uses `FLOUR_AND_STARCH`, null density, and empty unit mappings. No forms, measurements,
conversions, yields, or substitutions were added. FSSAI technical specifications were used only to
establish the product boundary; no numeric specification was copied into the catalog.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — FSSAI, Chapter 2.4 Cereal (Cereals and cereal products):** [Chapter 2.4, Section 2.4.2](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4%20%28Cereals%20and%20Cereal%20products%29%281%29.pdf), Version 1 dated 2023-09-01. Defines maida (refined wheat flour) as wheat milled with bran and germ essentially removed and the remainder comminuted to a suitable fineness.
- **S02 — Metro, “Farine tout usage Maida Divya”:** [French-language product listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-tout-usage/p/062781201595), product number 062781201595 and heading “Farine tout usage, Maida”. Supports the Quebec-market spelling `Maida` only; product-specific ingredient and nutrition details were not generalized.
- **S03 — Food Basics, “Divya Maida All Purpose Flour”:** [English-language product listing](https://www.foodbasics.ca/aisles/pantry/baking-ingredients/flour-baking-essentials/all-purpose-flour/p/062781201595), the same product number and heading “All Purpose Flour, Maida”. Supports the English spelling `Maida` only; the broad phrase “all-purpose flour” remains unassigned as an alias.

## Integration and verification

- Added `ingredient-ref-maida` to the canonical seed and research ledger with identity state `verified`; no measurement or substitution evidence was activated.
- Normalized-key collision review found no active alias collision. The exact retailer phrases beginning with generic all-purpose wording were deliberately not activated, so broad English and French searches continue to resolve to generic all-purpose flour.
- Unit and picker search fixtures cover `maida flour` plus the broad English/French all-purpose terms to enforce the distinction.
- `./gradlew :app:testDebugUnitTest --no-daemon --console=plain` passed all 201 unit tests. Connected Pixel 9a / Android 16 instrumentation reported 26 test cases, 24 passed, zero failures/errors, and two environment-gated skips.
- All 9 Python seed-package tests passed. Reference normalization, seed-package validation and normalization checks, generated-index freshness (299 references), evidence-ledger validation (449 records), alias-collision review, UTF-8/no-BOM audit (124 JSON files), and `git diff --check` passed.
- The deployment script's `test` and `:app:assembleDebug` tasks passed; it installed and launched the app on Pixel 9a / Android 16. Live queries `maida` and `maida flour` returned only `maida`; `all purpose flour` and `farine tout usage` each returned only `all-purpose flour`.
- Screenshots: `pixel9a-maida-picker.png`, `pixel9a-maida-flour-picker.png`, `pixel9a-all-purpose-flour-picker.png`, and `pixel9a-farine-tout-usage-picker.png`. The unsaved probe was discarded; the home screen remained at 114 recipes.

## Remaining work

- Obtain independent bilingual Québec French review of the retained `maida` display name.
- Continue the remaining durum-flour, regional wheat-flour, and other A1–A7 review.

# WP03 Regional Roots and Shoots (Section 04 J)

## Packet record

- **Owner:** WP03 plant-identity integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-05
- **Scope:** Add six named Section J vegetable identities: jicama, lotus root, burdock, water chestnut, bamboo shoots, and hearts of palm. This packet does not close the Section J list or WP03 plant-food review.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4` (`main`). The plan input SHA-256 was `d9cfc6eb5318c1b7b13c0cda7a11fc635c61dff736dafcc85c877708c37ee5f1`. The pre-integration reference JSON SHA-256 was `200ee378e166ac71067824677952a9cb43191a118ec51acb3d61c6e1141339a3` (272 references); the current file has 278 references and SHA-256 `2a27af4479e13e27aa75520a9e5cc8b76bb7f181b9365b9a542880aba7694852`. The 114 bundled recipe files were searched in ingredient-name and ingredient-reference fields; none directly reference these six identities.
- **Dependencies:** WP01 identity/evidence rules, earlier WP03 root/allium packets, and WP10 canonical seed integration.

## Integrated identity decisions

All six rows use `VEGETABLE_AND_AROMATIC`, null density, and empty unit mappings. Each ledger identity is `verified`; measurement and substitution research remain `not_yet_researched`. No forms, conversions, package yields, measurements, or substitutions were activated.

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-jicama` | jicama / dolique bulbeux | FR: `dolique tubéreux` | OQLF lists the French terms, identifies *Pachyrhizus erosus*, and uses jicama in its French note. Keep `yam bean` and `yam-bean` unresolved: the same English entry lists them but also distinguishes jicama from yam-bean. [S01] |
| `ingredient-ref-lotus-root` | lotus root / racine de lotus | None | OQLF pairs the terms and describes a tuberous lotus vegetable; canned and dried sale forms are noted but remain unmodeled. [S02] |
| `ingredient-ref-burdock` | burdock / bardane | EN: `burdock root`, `gobo` | OQLF pairs bardane with burdock and elsewhere refers to bardane/gobo as a root. Keep distinct from true white salsify and black salsify/scorsonère. [S03–S04] |
| `ingredient-ref-water-chestnut` | water chestnut / châtaigne d'eau | None | OQLF uses these terms for the edible Chinese-sedge tuber. It also has a separate water-caltrop entry where water chestnut is only an associated term; keep that plant distinct and do not activate `water nut`. [S05–S06] |
| `ingredient-ref-bamboo-shoots` | bamboo shoots / pousses de bambou | EN: `bamboo shoot`; FR: `pousse de bambou` | OQLF identifies edible young Bambusa shoots and notes fresh and treated products. Those preparation states remain unmodeled. [S07] |
| `ingredient-ref-hearts-of-palm` | hearts of palm / cœurs de palmier | EN: `heart of palm`; FR: `cœur de palmier`, `chou palmiste` | OQLF describes the edible tender terminal bud and notes that it may come from several palm genera. Do not apply `palm cabbage` across all genera. [S08] |

Source IDs `WP03J-S14`–`WP03J-S21` are attached to the catalog rows in `docs/catalog/research-ledger.v1.json`. Identity evidence does not establish measurement or substitution values.

## Source register

- **S01 — OQLF, « dolique bulbeux »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17020934/dolique-bulbeux), preferred French terms, English terms, botanical identity, and the unresolved yam-bean wording.
- **S02 — OQLF, « racine de lotus »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434863/racine-de-lotus), preferred French and English food terms and sale-form note.
- **S03 — OQLF / Les Éditions Québec Amérique, « bardane »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423404/bardane), food-plant entry pairing bardane with burdock.
- **S04 — OQLF, « scorsonère »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296886/scorsonere), distinction between white salsify and black salsify and reference to bardane/gobo as a root.
- **S05 — OQLF, « châtaigne d'eau » (Chinese sedge):** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434646/chataigne-deau), preferred French term and English water-chestnut terms.
- **S06 — OQLF / Michaux, « châtaigne d'eau » (water caltrop):** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19475118/chataigne-deau), separate water-caltrop entry and associated English usage.
- **S07 — OQLF, « pousse de bambou »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083672/pousse-de-bambou), preferred terms, botanical scope, and fresh/treated culinary use.
- **S08 — OQLF, « cœur de palmier »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082822/coeur-de-palmier), preferred French and English terms and multiple-palm scope.

## Verification

- `:app:testDebugUnitTest` passed: 194 tests, with no failures, errors, or skips. The deployment
  script's full `test` task and `:app:assembleDebug` also passed.
- All 9 Python seed-package tests passed. Ingredient/package normalization, package validation,
  generated-index freshness, and research-ledger JSON Schema validation (430 records) passed.
- All 124 bundled JSON files passed UTF-8/no-BOM and mojibake checks; `git diff --check` passed.
- On Pixel 9a / Android 16, searching `dolique` in the ingredient picker returned `jicama`; the
  screenshot was checked. The empty probe was discarded without saving, and the home screen remained
  at 114 recipes.
- Keep the unresolved alias distinctions and independent bilingual review open. No numerical or interchangeability claims are active from this packet.

## Remaining work

- Obtain independent bilingual review of all six identities and active aliases.
- Review arrowhead and remaining roots/tubers, regionally significant produce, and preparation forms.
- Resolve `yam bean` terminology with stronger identity evidence before enabling it as a jicama alias.
- Keep water chestnut distinct from water caltrop and avoid the ambiguous `water nut` alias.

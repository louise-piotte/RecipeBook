# WP03 Generic Millet and Amaranth Grain

- **Owner:** WP03 plant-food researcher; WP10 integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate broad millet and edible amaranth seed identities in the grain/cereal category. Review names, exact-key collisions, the existing flour/species boundaries, recipe use, and picker ambiguity. Measurement, cooking, and substitution evidence remain separate.

## Identity decisions

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-millet` | millet / millet | None | `GRAIN_AND_CEREAL`. OQLF says unqualified *millet* can group several species and can also abbreviate a specific species. This broad row stays separate from pearl millet and carries no species-specific properties [WP03-S18, S20, S46, S47]. |
| `ingredient-ref-amaranth-grain` | amaranth / amarante | None | `GRAIN_AND_CEREAL`. OQLF defines the cereal from edible amaranth seeds and supplies the English/French terms; the Canadian schedule corroborates grain use. Keep separate from amaranth flour and any future leafy-amaranth identity [WP03-S14, S23, S46–S48]. |

Both rows are identity-only. Neither has a density, unit mapping, form, conversion, yield, measurement observation, or substitution. No recipe was relinked.

### Withheld terms and search behavior

- Do not assign `mil`, `petit mil`, pearl-millet names, or other named species to generic millet. OQLF lists *mil* and *petit mil* for pearl millet too; keep those overlapping terms inactive on the broad row [WP03-S18, S20].
- Do not assign `kiwicha` as an amaranth alias pending regional/product review. OQLF lists it in the English translation field, but this integration accepts only the direct *amarante / amaranth* name pair [WP03-S23].
- Do not assign `amaranthe`. The French Canadian grain-use schedule spells the item that way, while OQLF defines *amaranthe* as a food-colouring powder. The exact spelling collision remains documented rather than becoming an automatic ingredient match [WP03-S47, S48].
- The editor's complete-word search intentionally returns several choices for broad terms. At this packet's 2026-10-06 checkpoint, `millet` returned generic millet, pearl millet, and pearl-millet flour; later foxtail and common/proso millet identities bring the 2026-10-07 picker to five `millet` matches. The qualified queries `millet perlé`, `millet d'Italie`, and `millet commun` resolve to their intended identities. `amaranth` and `amarante` each return the grain and the separately named flour. These are reviewable choices, not duplicate identities; see `foxtail-millet.md` and `common-millet-identity.md` for the species-specific decisions.

## Source register

- **WP03-S14 — OQLF, pseudocéréale:** [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26577199/pseudocereale). Supports the pseudocereal class and includes amaranth among edible seed foods.
- **WP03-S18 — OQLF, millet perle:** [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle). Provides the species-qualified pearl-millet term and lists overlapping *mil* / *petit mil* terms.
- **WP03-S20 — OQLF, millet:** [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet). Provides French *millet*, English *millet*, and the note that generic usage may cover multiple species or abbreviate a species-specific term.
- **WP03-S23 — OQLF, amarante:** [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante). Defines a cereal from edible seeds, says the seeds can be used whole or milled into flour, and supplies preferred French *amarante* / English *amaranth*.
- **WP03-S46 — Safe Food for Canadians Regulations, Schedule 1 (English):** [grain-use schedule](https://laws-lois.justice.gc.ca/eng/regulations/SOR-2018-108/page-24.html). Lists amaranth and millet among foods used as grain. Used for broad category placement only.
- **WP03-S47 — Règlement sur la salubrité des aliments au Canada, annexe 1 (français):** [annexe sur les aliments utilisés comme grain](https://laws-lois.justice.gc.ca/fra/reglements/DORS-2018-108/page-24.html). Lists *millet* and spells amaranth as *amaranthe*; this spelling was not activated as an alias.
- **WP03-S48 — OQLF, amaranthe:** [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8884624/amaranthe). Defines the similar spelling as a red-brown powder used to colour food; used to keep it out of the grain aliases.

## Catalog and recipe audit

Before allocation, neither proposed ID nor an exact English/French display key existed in the 338-reference seed. Existing related rows were `ingredient-ref-pearl-millet`, `ingredient-ref-pearl-millet-flour`, and `ingredient-ref-amaranth-flour`; there was no amaranth-grain or generic-millet row. No exact alias collision was found for the chosen display pairs.

All 114 bundled recipe JSON files were scanned for `millet`, `mil`, `petit mil`, pearl-millet names, `amaranth`, `amarante`, `amaranthe`, and `kiwicha`. No matching ingredient name, alias, ID, or source-text mention was found, so no recipe changed.

## Verification record

- Canonical split seed: 340 references, SHA-256 `523d87a390abcdfd2b7abff5e197fd2381db194f640ddf5a704bb0b25246d6ba`. Evidence ledger: 495 records, SHA-256 `261f84e42c18634d67d5dd202fec72efe001301313f76fc8be0ab58a094946d3`.
- All 244 Android unit tests and all 9 Python seed-package tests passed. Reference normalization, bundled-package normalization/validation, generated-index freshness, ledger schema validation, UTF-8/no-BOM/escaped-Unicode checks for all 125 seed JSON files, and `git diff --check` passed.
- Pixel 9a / Android 16 API 36 live picker QA showed two distinct amaranth choices in both languages and the expected three choices for broad French `millet`. The first install hit emulator storage limits; after uninstalling the old emulator app, the current APK installed and the bundled 114-recipe library reseeded. This name-only batch required no migration change or separate connected instrumentation run. The empty draft was discarded, and the fr-CA home was restored with 114 recipes. Screenshots: [English amaranth](pixel9a-amaranth-picker-en.png), [fr-CA amarante](pixel9a-amaranth-picker-fr-ca.png), [fr-CA millet choices](pixel9a-millet-picker-fr-ca.png), and [restored 114-recipe home](pixel9a-grain-home-fr-ca-114.png).
- Independent bilingual Québec French review remains pending. The broader Section F checklist remains open, including rice state allocation, oats, other millet species, teff, kasha, and processed cereal products.

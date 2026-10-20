# WP03 Root and Tuber Identity Tranche (Section 04 J)

## Packet record

- **Owner:** WP03 research and catalog integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-05
- **Scope:** Five source-backed identities from Section J only: celeriac, parsnip, Jerusalem artichoke, rutabaga, and turnip. This tranche does not complete Section J or the broader WP03 plant-food review.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4` (`main`). The plan input SHA-256 was `d6d98fa1ee79839f5bd0387f740a746ec470feb770f9919ff541058cc59cfeb8`. The pre-tranche canonical reference file was SHA-256 `44706b444c38f859cd91497c6811c7c7dce957825b9def75dccf6ce8ddf6d759` (260 references). The post-first-tranche checkpoint was SHA-256 `5c7cde95739576a1d58afb6f87a5822cfd99d6c1cddc4ed6e9fdeea67454a654` (265 references); the follow-up package has since reached 269 references, SHA-256 `0b6f9ee7b0a169e90e58469ee85143c68cfd28e8005d17f1a636d87463d0dac6`. The bundled package has 114 recipes; an exact-name search of recipe JSON found no matches for these five identities or their accepted aliases.
- **Dependencies:** WP01 identity/evidence contract; WP03 Section F grain and WP02 flour/starch boundaries; WP10 integration owner controls stable-ID allocation and canonical package changes.

## Integrated identity decisions

All five accepted rows use `VEGETABLE_AND_AROMATIC`, null density, and empty unit mappings. The ledger records identity as `verified`, while measurement and substitution research remain `not_yet_researched`. No forms, conversions, yields, or substitutions were added.

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-celeriac` | celeriac / céleri-rave | EN: `celery root`, `knob celery`; FR: `céleri tubéreux`, `céleri-boule` | OQLF lists these terms for root celery (*Apium graveolens* var. *rapaceum*). Keep distinct from stalk celery. [S01] |
| `ingredient-ref-parsnip` | parsnip / panais | None | OQLF pairs the preferred English/French terms. Do not activate `carotte blanche` or `grand chervis`: regional resemblance-based names can refer to distinct vegetables. [S02] |
| `ingredient-ref-jerusalem-artichoke` | Jerusalem artichoke / topinambour | EN: `sunchoke`, `sunroot`; FR: `artichaut de Jérusalem` | OQLF identifies *Helianthus tuberosus*. Keep distinct from globe artichoke; the name does not establish Jerusalem provenance. [S03] |
| `ingredient-ref-rutabaga` | rutabaga / rutabaga | EN: `swede`; FR: none | OQLF distinguishes rutabaga (*Brassica napus* var. *napobrassica*) from true turnip and documents colloquial Québec `navet` for rutabaga. Do not use that ambiguous term as an automatic alias. [S04] |
| `ingredient-ref-turnip` | turnip / navet | None | OQLF pairs turnip with `navet` and identifies *Brassica rapa*. Keep separate from rutabaga; do not activate `navet blanc` as a redundant alias or broaden `rabiole`, a variety name, to every turnip. [S05] |

The OQLF entries support English and Québec French terminology and the documented distinctions. They do not support measurement or substitution values. Source records `WP03J-S01`–`WP03J-S05` are attached to the five reference rows in `docs/catalog/research-ledger.v1.json`.

## Source register

- **S01 — OQLF, « céleri-rave »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520184/celeri-rave), preferred French term, English equivalents, and botanical identity.
- **S02 — OQLF, « panais »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/23797105/panais), bilingual identity and regional resemblance-based names.
- **S03 — OQLF, « topinambour »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8871095/topinambour), bilingual terminology, botanical identity, and Jerusalem-name note.
- **S04 — OQLF, « rutabaga »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870639/rutabaga), bilingual terminology and distinction from true turnip.
- **S05 — OQLF, « navet »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870711/navet), bilingual identity, species distinction, and Québec usage note.

## Remaining work

- Obtain independent bilingual review of all five labels and aliases.
- Continue Section J coverage for the other roots, tubers, alliums, aromatics, and preparation forms; preserve the distinction between rutabaga and turnip.
- Keep measurements and substitutions as separate research tasks. No claim in this packet activates either.

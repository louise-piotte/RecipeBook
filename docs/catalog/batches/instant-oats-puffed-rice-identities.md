# WP03 instant oats and puffed rice identities

- **Reviewed:** 2026-10-07
- **Status:** two identity-only references integrated and verified on Pixel 9a; independent Québec French terminology review remains open.
- **Scope:** plain dry instant oat flakes and heat-expanded puffed rice grains. No recipe lines, aliases, forms, measurements, conversions, yields, or substitutions are added.

## Integrated references

| ID | English | fr-CA | Category | Boundary |
| --- | --- | --- | --- | --- |
| `ingredient-ref-instant-oats` | instant oats | flocons d'avoine à cuisson instantanée | `GRAIN_AND_CEREAL` | Plain dry instant oat flakes, separate from quick oats and prepared/flavoured instant-oatmeal sachets. No aliases. |
| `ingredient-ref-puffed-rice` | puffed rice | riz soufflé | `GRAIN_AND_CEREAL` | Whole rice grains expanded by heat. Separate from generic rice, flattened rice (poha), and the ready-to-eat crispy rice cereal in recipe 040. No aliases. |

Both references have null density and empty unit mappings. Their identities are source-supported; measurement and substitution research remain open. No forms or recipe links were added.

## Evidence and naming limits

CFIA's Canadian retail survey separately lists instant, quick, and rolled oats and describes processing oat groats into those products [WP03-S67–S68]. A withdrawn 1987 CGSB rolled-oats standard historically defines distinct quick-cooking and instant-cooking rolled-oat types [WP03-S100]. It corroborates a processing difference but is not a current standard. TERMIUM gives *flocons d'avoine à cuisson instantanée* for *instant oats*, although the entry context refers to flavoured sachets; it is used for the term only [WP03-S101]. OQLF defines unqualified *gruau* as the cooked oatmeal dish [WP03-S27], so the new display avoids *gruau instantané*. Do not alias quick oats, generic rolled oats, instant oatmeal, or flavoured packet products.

Usito provides the Québec/Canadian pair *puffed rice / riz soufflé* and defines the product as rice grains expanded by heat. It separately marks *riz croustillant* as the Rice Krispies product [WP03-S102]. The withdrawn CGSB breakfast-cereal specification describes puffed rice as whole dehulled rice expanded by heat; its scope also places it within ready-to-eat breakfast cereals [WP03-S103–S104]. Codex likewise lists puffed rice among breakfast-cereal examples [WP03-S105]. These sources support a narrow heat-expanded-grain identity, while leaving product-use overlap explicit. Keep `puffed rice cereal`, unqualified `rice cereal`, *riz croustillant*, and rice cakes out of aliases.

## Recipe and collision audit

The 114 bundled recipe files contain no instant-oat or puffed-rice ingredient line, so no recipe link or quantity changed. The live normalized-key audit found no exact collision for either full bilingual display. Broad searches such as `flocons d'avoine` can naturally match rolled and instant oats; the full qualified display remains distinct. Recipe 040 continues to use `crispy rice cereal`, not puffed rice.

## Verification record

- The original integration checkpoint had 353 references, 16 forms, 114 recipes, and 518 ledger records; the instant-oats candidate was promoted in place. The later medium-grain verification checkpoint had 356 references, 16 forms, 114 recipes, and 521 ledger records.
- Seed package validation, reference normalization, generated Kotlin catalog freshness, research-ledger schema validation, `git diff --check`, and 9 Python package tests pass. Android unit tests pass (253 tests); Pixel 9a API 36 connected instrumentation passes (29 tests, 2 existing skips).
- Pixel 9a picker results: `instant oats` → `instant oats` / `flocons d'avoine à cuisson instantanée`; `puffed rice` → `puffed rice` / `riz soufflé`. Recipe 040 remains separately linked to crispy rice cereal, not puffed rice.
- Final SHA-256: ingredient references `7f3ecdd18de4d3c7f932618ab9efbfb39dc36349471da794f0da68f4e9de9bee`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `8b37c220a7f8665dc72cf0df141dc45ae963a867180ab500fc49b08cf8ae6671`; generated Kotlin catalog `ab124930e7267bcd8913350dc305f6773ae8d6ea9c75204c50ca3c8d66adf1ba`.
- Picker screenshots: [instant oats EN](screenshots/picker-instant-oats-en.png), [instant oats fr-CA](screenshots/picker-instant-oats-fr.png), [puffed rice EN](screenshots/picker-puffed-rice-en.png), and [puffed rice fr-CA](screenshots/picker-puffed-rice-fr.png). The final library home still shows 114 recipes: [fr-CA home](screenshots/recipebook-library-home-fr-114.png). Recipe 040 boundary screenshots: [EN](screenshots/recipe-040-crispy-rice-cereal-en.png) and [fr-CA](screenshots/recipe-040-crispy-rice-cereal-fr-ca.png).

## Sources

- **WP03-S67–S68 — CFIA/ACIA, [Bacterial Pathogens and Indicators in Oats](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/testing-reports-and-journal-articles/april-1-2018-march-31-2020-0) / [Bactéries pathogènes et indicatrices dans l'avoine](https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues/1-avril-2018-au-31-mars-2020-0):** separate Canadian retail categories and oat-processing description; sampling occurred in 2018–2020.
- **WP03-S27 — OQLF, [gruau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau):** defines the cooked oatmeal dish; supports avoiding unqualified *gruau instantané* as the dry-flake display.
- **WP03-S100 — Canadian General Standards Board, [Cereal, rolled oats (CAN/CGSB-32.14-87)](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-014-1987.pdf):** historical rolled-oat classes; withdrawn April 2020.
- **WP03-S101 — TERMIUM Plus, [instant oats](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=AVOINE+GRUAU):** terminology pair; sachet context limits the evidence to wording.
- **WP03-S102 — Usito, [riz soufflé](https://sanction.usito.usherbrooke.ca/d%C3%A9finitions/riz):** Québec/Canadian English-French pair and heat-expanded-grain definition; identifies *riz croustillant* separately as Rice Krispies.
- **WP03-S103–S104 — Government of Canada Publications and CGSB, [breakfast-cereal standard catalogue record](https://publications.gc.ca/site/eng/9.841373/publication.html) / [CAN/CGSB-32.13-88](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-013-1988.pdf):** historical puffed-rice definition and withdrawal metadata; withdrawn April 2020.
- **WP03-S105 — Codex, [Food Category 06.3](https://codex.fao.org/codex-texts/codex-online-databases/gsfa/food-categories/food-category-details?categoryId=1d73ded6-249a-f111-b8dc-70a8a5613865):** broad breakfast-cereal categorization, not a strict identity boundary.

# WP03 Section F R485 / WP04 Section P R486 / WP06 Africa R487 integration

Integrated on 2026-10-17 after root review of [R485](../../proposals/wp03-section-f-next-gap-review-r485-20261017.md), [R486](../../proposals/wp04-section-p-next-seafood-review-r486-20261017.md), and [R487](../../proposals/wp06-african-next-regional-review-r487-20261017.md).

## Decisions

- **R485 — Rice Chex family hold:** kept a single `Rice Chex cereal / Céréales Chex au riz` row unallocated until a family-wide Chex picker review. General Mills Canada's May 2025 guide lists Rice Chex alongside four other distinct current Chex cereals. Adding Rice Chex alone would make the broad `Chex` query return a misleading singleton. The [manufacturer guide](https://www.generalmillsfoodservice.ca/wp-content/uploads/2025/05/GM-Complete-Product-Guide-May-2025-ENG.pdf) and its [French guide](https://www.generalmillsfoodservice.ca/wp-content/uploads/2023/10/GM-guide-des-produits-Sept-23.pdf) support product-specific naming; the bundle has no Rice Chex demand. No active reference or ledger record was added.
- **R486 — coconut shrimp:** added identity-only `coconut shrimp / crevettes à la noix de coco` as `ingredient-ref-coconut-shrimp`, with singular `crevette à la noix de coco` as its only alias. The [BlueWater manufacturer page](https://www.bluewater.ca/en/products/coconut-shrimp/) names the prepared product; Québec retail listings use the plural French title. Kept coconut butterfly shrimp, plain breaded shrimp, popcorn shrimp, tempura shrimp, species identities, and sauce bundles separate. Added no forms, measures, mappings, conversions, yields, recipe links, or substitutions.
- **R487 — Ugu leaves:** added identity-only `ugu leaves / feuilles de courge cannelée (ugu)` as `ingredient-ref-ugu-leaves`, with no aliases. [FAO](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=10307) and [PROTA](https://plantuse.plantnet.org/en/Telfairia_occidentalis_%28PROTA%29) support the edible leaf use of *Telfairia occidentalis*; a [Kitchener seller](https://folakafricanfoods.com/product/ugwu-leaves/) and a [French-language Gatineau farm listing](https://www.greenfocusfarms.ca/fr/products/ugu-leaf-frais-okongbong-flutted-pumpkin) support Ugu product wording. Kept the plant's seed products, ordinary pumpkin/squash leaves, and unscoped regional names distinct. The descriptive French display remains provisional pending Québec terminology review. Added no forms, measures, mappings, conversions, yields, recipe links, or substitutions.

Section F, Section P, and broader African regional coverage remain open.

## Catalog and recipe effects

- Active references: **1,762**, up from 1,760. Ingredient forms remain **143**; legacy-import candidates remain **56**.
- The research ledger has **2,121 records**, **9,688 source entries**, **8,220 distinct source IDs**, and **6,933 distinct source URLs**. R486 and R487 add two records and twelve new source IDs; R486 reuses two existing source entries by their exact IDs and URLs.
- The bundle remains **114 recipes / 1,123 ingredient rows**. The manifest-order corpus fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. No candidate-specific file or ingredient-row hits were found.
- Exact `coconut shrimp`, `crevettes à la noix de coco`, and `crevette à la noix de coco` queries return the new coconut-shrimp identity. Broad `shrimp` grows from 9 to 10 results and `crevettes` from 13 to 14; coconut-butterfly, breaded, and popcorn queries retain their existing owners.
- Exact `ugu leaves`, `feuilles de courge cannelée`, and `courge cannelée` queries return the new Ugu identity. `ugu` previously fell through to an `arugula` substring match; the new complete word phrase takes priority. Broad `pumpkin` results and `pumpkin leaves`, `fluted pumpkin leaves`, and `Telfairia occidentalis` queries remain unchanged.
- The `Chex` and Rice Chex queries remain unmatched while the family hold stands; generic `rice cereal` remains on its two existing cereal identities.

## Validation

- Reference normalization, seed-package normalization/validation, and generated-index freshness checks passed. The generated Kotlin catalog contains **1,762 references**.
- The research ledger passed Draft 2020-12 schema validation. A full source-ID-to-URL audit found no conflicts.
- Static picker projections and the full manifest-ordered 114-file / 1,123-row recipe scan passed. The recipe corpus bytes and fingerprint are unchanged.
- Changed JSON and generated-index files are UTF-8 without BOM; seed reference text remains ASCII-escaped. Local links and scoped whitespace checks passed.
- No app tests, Gradle tasks, emulator checks, or deployment were run: the active catalog changes only add database JSON data, and the Rice Chex decision is a documentation hold, under the `AGENTS.md` rule.

## Snapshot hashes

- Ingredient references: `3821584df16033c29ef1a2fc7822f656425a040ddc074ac7273abca01af82b12`
- Ingredient forms: `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6`
- Research ledger: `1b406fea98da4bc1fa3d755894ac0d5df4e67dac2d6919e0fe9a5437f32349ec`

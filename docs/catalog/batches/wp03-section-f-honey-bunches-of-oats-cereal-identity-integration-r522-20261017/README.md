# WP03 Section F R522 integration — Honey Bunches of Oats cereals

- **Date:** 2026-10-17
- **Decision:** Add three separately formulated, identity-only Canadian finished cereals.
- **Catalog IDs:** `ingredient-ref-honey-bunches-of-oats-honey-roasted-cereal`, `ingredient-ref-honey-bunches-of-oats-with-almonds-cereal`, and `ingredient-ref-honey-bunches-of-oats-with-real-strawberries-cereal`.
- **Category:** `GRAIN_AND_CEREAL` for all three.
- **French displays:** `Céréales Bouchées d’avoine au miel, saveur originale`; `Céréales Bouchées d’avoine au miel avec amandes`; `Céréales Bouchées d’avoine au miel – Avec vraies fraises`.
- **Aliases:** none. The French labels follow current Canadian manufacturer wording and remain descriptive, not OQLF terminology rulings.
- **Behavior:** no forms, household measures, mappings, densities, conversions, yields, recipe links, or substitutions. Package weights remain product presentation evidence only.

## Evidence and boundary

Post Consumer Brands Canada’s current Canadian English and French product pages identify Honey Roasted, with Almonds, and with Real Strawberries. The [Honey Roasted English page](https://www.postconsumerbrands.ca/brand/honey-bunches-of-oats/products/honey-roasted/) and its [French page](https://www.postconsumerbrands.ca/fr-ca/marques/bouchees-davoine-au-miel/produits/bouchees-davoine-au-miel/) describe the original flavor and list 340 g and 625 g boxes. The [Almonds English page](https://www.postconsumerbrands.ca/brand/honey-bunches-of-oats/products/almonds/) and its [French page](https://www.postconsumerbrands.ca/fr-ca/marques/bouchees-davoine-au-miel/produits/bouchees-davoine-au-miel-avec-amandes/) support the distinct almond product. The [Real Strawberries English page](https://www.postconsumerbrands.ca/brand/honey-bunches-of-oats/products/honey-bunches-of-oats-with-real-strawberries/) and its [French page](https://www.postconsumerbrands.ca/fr-ca/marques/bouchees-davoine-au-miel/produits/bouchees-davoine-au-miel-avec-vraies-fraises/) support the distinct strawberry product.

The French brand overview says “Essayez les 3 saveurs” but retains an image alt labelled “HBO avec chocolat.” No current product-specific Canadian English and French chocolate pages were verified, so chocolate remains excluded. This integration does not claim to enumerate all historical, international, or future products. Keep each finished cereal distinct from oats, wheat, corn, honey, almonds, strawberries, and other cereal components; do not model the formulated products as ingredient forms.

## Picker and corpus results

The static phrase-first projection adds three results to `Honey Bunches of Oats` and `Bouchées d’avoine au miel`, and one exact product result for each English/French product query. Broad `honey`/`miel`, `oats`/`avoine`, and `cereal`/`céréales` queries each gain three. Singular `almond` remains 11 → 11 because the existing linked “almond slices” form supplies the complete phrase match; plural `almonds` changes 1 → 2. Singular `strawberry` stays 5 → 5, while `strawberries` changes 2 → 3.

The complete 114-file, 1,123-row manifest recipe scan found no matching Honey Bunches of Oats identity or product ID. Corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

## Source ownership and static validation

Eight new source IDs and eight exact URLs were registered. The two Canadian brand pages are shared context and are attached to all three product records, giving twelve source entries total. Each product-specific English and French page is attached only to its matching product record. The full ledger audit found zero source IDs mapped to multiple URLs.

After integration the catalog contains 1,797 ingredient references, 143 forms, and 56 legacy candidates. The ledger contains 2,153 records, 9,886 source entries, 8,365 distinct source IDs, and 7,075 distinct URLs. Seed-package normalization and validation passed; the generated ingredient index is current at 1,797 references. Picker projection, source ownership, encoding, and corpus checks passed.

No software tests, build, emulator check, or deployment were run because this change only adds database JSON data under `AGENTS.md`. Section F remains open for broader cereal and preprocessed-grain review. See the [R522 proposal](../../proposals/wp03-section-f-next-gap-review-r522-20261017.md).

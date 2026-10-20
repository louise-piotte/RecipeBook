# WP03 Section F R738 — Oatmeal Crisp Chocolate Almond family-completeness hold

## Review record

- **Integration:** Adopted as a documentation-only hold in the WP02/WP03/WP04 R737–R739 batch; no active IDs or data were allocated.

- **Reviewed:** 2026-10-18.
- **Checklist fit:** This is one candidate in the open Section F checklist for regionally significant cereal mixes and preprocessed grains ([plan, line 4789](../../RecipeBook-global-ingredient-catalog-plan.txt#L4798)). The prior [R735 Reese’s Puffs hold](wp03-section-f-next-open-gap-review-r735-20261018.md) addressed conflicting product-code mappings in a different cereal family; it did not assess Oatmeal Crisp.
- **Bounded candidate:** General Mills Canada’s current Oatmeal Crisp Chocolate Almond cereal.
- **Recommendation: HOLD this single product outside active catalog and ledger data** until the family-level picker decision covers the seven products on the current bilingual manufacturer listings. Adding only Chocolate Almond would make the brand-family queries `Oatmeal Crisp` and `Avoine Croquante` each return one row even though the official family page lists seven variants.
- **No shared data change:** Do not allocate the candidate reference, alias, form, source record, portion observation, package yield, unit mapping, recipe link, conversion, or substitution. This is a targeted family-completeness hold, not a finding that the product itself is unsupported.
- **Snapshot:** 1,848 active references, 176 forms, 2,233 ledger records, and 114 manifest-listed recipes / 1,123 structured ingredient rows.

The [R734–R736 integration](../batches/wp02-wp03-wp04-r734-r736-gap-review-integration-20261018/README.md) left Section F open. R735 likewise allocated no active cereal rows, but its reason was a Reese’s Puffs package-code conflict. R738 documents a separate Oatmeal Crisp picker boundary.

## Source evidence

The `S01`–`S05` labels below are local to this proposal. They are not ledger source IDs and reserve no shared identifiers.

| Label | Source and evidence | Use and limit |
|---|---|---|
| S01 | General Mills Canada, [English Oatmeal Crisp product listing](https://www.oatmealcrisp.ca/products), checked 2026-10-18. It lists seven products, including “Oatmeal Crisp Chocolate Almond.” | Establishes the current English family roster and its size; scope evidence only. |
| S02 | General Mills Canada, [French Oatmeal Crisp product listing](https://www.oatmealcrisp.ca/fr-CA/products), checked 2026-10-18. It lists the corresponding seven French titles, including “Avoine Croquante Chocolat et Amandes.” | Establishes the current French family roster and bilingual pairing; scope evidence only. |
| S03 | General Mills Canada, [Oatmeal Crisp Chocolate Almond](https://www.oatmealcrisp.ca/products/oatmeal-crisp-chocolate-almond), checked 2026-10-18. The page gives the English title, describes one 437 g box, and states a Nutrition Facts serving of 1 cup (58 g). | Primary product identity and product-specific portion evidence for this candidate. The page says product details can change and directs consumers to the package for current information. It does not give a cup filling or weighing method. |
| S04 | General Mills Canada, [Avoine Croquante Chocolat et Amandes](https://www.oatmealcrisp.ca/fr-CA/products/avoine-croquante-chocolat-et-amandes), checked 2026-10-18. The page gives the French title, one 437 g box, and a serving of 1 tasse (58 g). | Primary French-title and bilingual portion corroboration. It has the same package-label freshness limitation as S03; the two language pages describe one product label, not independent measurements. |
| S05 | Provigo, [Avoine Croquante Saveur de chocolat et amandes Céréales](https://www.provigo.ca/fr/avoine-croquante-saveur-de-chocolat-et-amandes-c-r/p/21739910_EA), checked 2026-10-18. It lists a 437 g product and retailer number `21739910_EA`. | Supports the exact brand-qualified French search alias `Avoine Croquante Saveur de chocolat et amandes`. The retailer number is not presented as a UPC or manufacturer crosswalk. The retailer also advises checking the physical package for current details. |

The manufacturer’s current bilingual listings pair these seven titles:

| English listing | French listing |
|---|---|
| Oatmeal Crisp Protein Apple Crisp | Avoine Croquante Protéines Croustade aux pommes |
| Oatmeal Crisp Protein Vanilla | Avoine Croquante Protéines Vanille |
| Oatmeal Crisp Chocolate Almond | Avoine Croquante Chocolat et Amandes |
| Oatmeal Crisp Triple Berry | Avoine Croquante Trio de Petits Fruits |
| Oatmeal Crisp Honey Crunch | Avoine Croquante Croquant Au Miel |
| Oatmeal Crisp Maple Nut | Avoine Croquante Saveur érable et Noix |
| Oatmeal Crisp Almond | Avoine Croquante Amandes |

Only Chocolate Almond’s detailed product pages and its Quebec retailer listing were reviewed for this bounded hold. The other six entries above are roster evidence only; no portion, identity row, alias, or ledger source is proposed for them here.

## Candidate boundary and exact disposition

The source-backed hypothetical identity, **if reconsidered as part of a complete family-level decision**, is:

- ID: `ingredient-ref-oatmeal-crisp-chocolate-almond`
- English name: `Oatmeal Crisp Chocolate Almond cereal`
- French name: `Céréales Avoine Croquante Chocolat et Amandes`
- French alias supported by S05: `Avoine Croquante Saveur de chocolat et amandes`
- Category: `GRAIN_AND_CEREAL`

Do not add this row in R738. S03/S04 support one manufacturer-labelled, product-specific `1 cup (58 g)` portion observation, but R738 does not allocate it to the ledger. If the family-level review later supports catalog rows, keep that portion as product-specific evidence only; do not derive density, an active cup mapping, or a package yield from it. No product form or substitution rule is proposed. Substitution research was not performed.

## Ownership and collision audit

The current ingredient reference and form files contain no Oatmeal Crisp or Avoine Croquante row, term, or form. The proposed reference ID is unallocated. The five source URLs above have no exact URL owner in the live research ledger. No source ID, ingredient ID, observation ID, or form ID is allocated or reserved by this hold.

The candidate-specific French alias stays brand-qualified. Do not add standalone `chocolate`, `almond`, `cereal`, `chocolat`, `amandes`, or generic Oatmeal Crisp aliases: these would broaden component/category searches beyond the product identity. The source-backed English and French product titles are sufficient for exact variant search if the row is reconsidered.

## Phrase-first picker projection

Counts use the live [ingredient search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including names, aliases, and attached form terms. Phrase matches are returned before substring fallback. The three projection columns are the current package, one Chocolate Almond row with the name and alias above, and a hypothetical full seven-row family using the bilingual listing titles.

| Query | Current | One candidate row | Full seven-row family | Reading |
|---|---:|---:|---:|---|
| `Oatmeal Crisp` | 0 | 1 | 7 | A single SKU would appear to be the only result for the brand-family phrase. |
| `Avoine Croquante` | 0 | 1 | 7 | Same singleton effect in French. |
| `Céréales Avoine Croquante` | 0 | 1 | 7 | Same effect with the catalog’s French cereal type prefix. |
| `cereal` / `céréales` | 77 / 73 | 78 / 74 | 84 / 80 | A full-family addition would broaden both existing category searches by seven products. |
| `Chocolate Almond` / `Chocolat et Amandes` | 0 / 0 | 1 / 1 | 1 / 1 | The variant-qualified English and French queries identify this candidate uniquely. |
| `Saveur de chocolat et amandes` | 0 | 1 | 1 | The retailer-backed French alias adds a precise alternate phrase. |

Because the manufacturer currently presents a seven-product family and no recipe demand singles out Chocolate Almond, the one-row projection is an incomplete family result. Keep this SKU held until the family-level decision can avoid that misleading singleton.

## Manifest-listed recipe corpus

The manifest-ordered package contains 114 recipe files, 1,123 structured ingredient rows, and 754,048 recipe-file bytes (SHA-256 `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`). The full proposed English/French product names, brand phrases, French alias, candidate reference ID, and Provigo retailer number were scanned. No brand, full product-title, candidate-ID, retailer-number, or direct ingredient-reference-link match was found.

The short, brandless phrase `Chocolate Almond` does occur after punctuation folding in one unrelated recipe description: [Chocolate Nutty Crisp](../../../app/src/main/assets/seed/bundled-library/recipes/040-croustillant-chocolate-et-noix-chocolate-nutty-crisp-798352ab-d4ad-4e5d-9c90-f0484609bca2.v1.json) describes “chocolate, almond butter.” Its structured rows link to dark chocolate, almond butter, and crispy rice cereal; none refers to Oatmeal Crisp. This generic ingredient wording is not demand for the packaged cereal.

## Reopen condition and checks

Reopen the candidate when a bounded family review can decide how all seven current manufacturer-listed products should appear together for the English and French brand-family queries. At that review, verify each selected variant’s direct bilingual page and current portion separately; do not infer values for the six unreviewed variants from Chocolate Almond.

- [x] Read the current Section F checklist, R735 hold, R734–R736 integration record, live reference/form/ledger state, and manifest-listed recipe corpus.
- [x] Verify the current seven-item English/French manufacturer roster and the Chocolate Almond bilingual product pages; check the Quebec retailer wording used for the proposed alias.
- [x] Audit candidate ID/name and exact source URL ownership; found no existing owner. Allocate no shared IDs.
- [x] Project the exact family queries against current search terms, the single-row candidate, and the full seven-title family.
- [x] Scan all 114 manifest-listed recipes / 1,123 structured rows, including the candidate names, alias, ID, and retailer number; classify the one brandless ingredient-phrase collision above.
- [x] No shared seed/catalog JSON, ledger, checklist, plan, roadmap, workflow, generated code, or integration files were edited.
- **No software tests, build, emulator, or deployment were run.** R738 is a proposal-only hold with no software or active database data change.

# WP03 Section F R771 — Oatmeal Crisp bilingual family picker review

## Review record

- **Reviewed:** 2026-10-18.
- **Checklist fit:** The open Section F checklist still covers regional cereal mixes and preprocessed grains ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L4893)). [R738](wp03-section-f-oatmeal-crisp-chocolate-almond-family-hold-r738-20261018.md) held one Oatmeal Crisp Chocolate Almond product until a family-level picker decision covered the seven products on General Mills Canada’s bilingual pages. This review resolves that bounded picker question; it does not reopen [R767’s Holy Crap Superseed hold](wp03-section-f-next-open-gap-review-r767-20261018.md) or [R762’s Post Shredded Wheat & Bran Spoon Size decision](wp03-section-f-next-gap-review-r762-20261018.md).
- **Scope:** The seven products currently listed on both the English and French Oatmeal Crisp product pages.
- **Recommendation:** Add seven separate `GRAIN_AND_CEREAL` ingredient-reference identities with the paired manufacturer titles below. This complete family set makes the `Oatmeal Crisp` and `Avoine Croquante` searches return seven named variants instead of making one held SKU look like the entire family. Record each product page’s published Nutrition Facts serving as a separate product-specific `portion_weight` ledger observation. Add no aliases, forms, density, unit mappings, active conversions, yields, recipe links, or substitutions.
- **Status:** Proposal only. This file is the sole intended change; no shared catalog, ledger, checklist, plan, roadmap, workflow, generated file, or app file was edited.
- **Snapshot:** 1,857 active references, 188 forms, 56 legacy-import candidates, 2,254 research-ledger records, and 114 manifest-listed recipes with 1,123 structured ingredient rows.

## Bilingual family and recommended rows

General Mills’ English and French product listings each show seven Oatmeal Crisp products [S01–S02]. The French list has one matching product-title translation for every English variant. Each English/French product page pair below identifies the same named cereal variant and gives the same manufacturer-published serving mass. The title `New` / `Nouveau` on Chocolate Almond is a current promotional marker; it is not part of the stable ingredient identity.

Use the exact manufacturer product title, with the catalog’s cereal type descriptor appended in English and prefixed in French. The descriptor is supported by each product description, which identifies the item as cereal / céréales. These are catalog display names, not claims that the full strings are the verbatim page headings.

| Proposed reference ID | `nameEn` | `nameFr` | Manufacturer serving observation |
|---|---|---|---|
| `ingredient-ref-oatmeal-crisp-protein-apple-crisp-cereal` | `Oatmeal Crisp Protein Apple Crisp cereal` | `Céréales Avoine Croquante Protéines Croustade aux pommes` | 1 cup / 1 tasse = 58 g |
| `ingredient-ref-oatmeal-crisp-protein-vanilla-cereal` | `Oatmeal Crisp Protein Vanilla cereal` | `Céréales Avoine Croquante Protéines Vanille` | 1 cup / 1 tasse = 58 g |
| `ingredient-ref-oatmeal-crisp-chocolate-almond-cereal` | `Oatmeal Crisp Chocolate Almond cereal` | `Céréales Avoine Croquante Chocolat et Amandes` | 1 cup / 1 tasse = 58 g |
| `ingredient-ref-oatmeal-crisp-triple-berry-cereal` | `Oatmeal Crisp Triple Berry cereal` | `Céréales Avoine Croquante Trio de Petits Fruits` | 1 cup / 1 tasse = 54 g |
| `ingredient-ref-oatmeal-crisp-honey-crunch-cereal` | `Oatmeal Crisp Honey Crunch cereal` | `Céréales Avoine Croquante Croquant Au Miel` | 1 cup / 1 tasse = 58 g |
| `ingredient-ref-oatmeal-crisp-maple-nut-cereal` | `Oatmeal Crisp Maple Nut cereal` | `Céréales Avoine Croquante Saveur érable et Noix` | 1 cup / 1 tasse = 58 g |
| `ingredient-ref-oatmeal-crisp-almond-cereal` | `Oatmeal Crisp Almond cereal` | `Céréales Avoine Croquante Amandes` | 1 cup / 1 tasse = 58 g |

Keep all seven as distinct finished cereal products. The product pages describe cereal blends and list ingredients, but do not quantify ingredient proportions. Do not decompose them into oat, wheat, sugar, fruit, nut, or other component references, or merge any variant with the generic cereal, oatmeal, or granola identities. Use empty alias lists: the full bilingual product names already include their family and variant words, so no brand-only or component alias is needed.

## Source evidence and measurement boundary

The source register was checked on 2026-10-18. English and French family pages establish the current seven-item roster. The individual manufacturer pages establish localized product titles and publish serving sizes of one cup / one tasse with a gram mass. General Mills cautions that online ingredient and nutrition data can change and that the package governs if its information differs. No physical package or UPC crosswalk was inspected; the proposal does not make a package-code or exact UPC claim. In paired rows below, shorthand `S03` through `S16` expands to the full `WP03-OATMEALCRISP-FAMILY-R771-20261018-Snn` source ID shown for S01–S02.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S01` | General Mills, [Oatmeal Crisp English product listing](https://www.oatmealcrisp.ca/products), product result list. | Shows the seven current English product titles. Family completeness and name evidence only. |
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S02` | General Mills, [Oatmeal Crisp French product listing](https://www.oatmealcrisp.ca/fr-CA/products), product result list. | Shows the seven corresponding French product titles. Family completeness and bilingual-pairing evidence only. |
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S03` / `S04` | General Mills, [Oatmeal Crisp Protein Apple Crisp](https://www.oatmealcrisp.ca/products/oatmeal-crisp-protein-apple-crisp) / [Avoine Croquante Protéines Croustade aux pommes](https://www.oatmealcrisp.ca/fr-CA/products/avoine-croquante-proteines-croustade-aux-pommes), product title, description, and Nutrition Facts. | Paired English/French product names and 1 cup / 1 tasse (58 g) serving. |
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S05` / `S06` | General Mills, [Oatmeal Crisp Protein Vanilla](https://www.oatmealcrisp.ca/products/oatmeal-crisp-protein-vanilla) / [Avoine Croquante Protéines Vanille](https://www.oatmealcrisp.ca/fr-CA/products/avoine-croquante-proteines-vanille), product title, description, and Nutrition Facts. | Paired English/French product names and 1 cup / 1 tasse (58 g) serving. |
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S07` / `S08` | General Mills, [Oatmeal Crisp Chocolate Almond](https://www.oatmealcrisp.ca/products/oatmeal-crisp-chocolate-almond) / [Avoine Croquante Chocolat et Amandes](https://www.oatmealcrisp.ca/fr-CA/products/avoine-croquante-chocolat-et-amandes), product title, description, and Nutrition Facts. | Paired English/French product names and 1 cup / 1 tasse (58 g) serving. The current French product page was opened through the French family listing. |
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S09` / `S10` | General Mills, [Oatmeal Crisp Triple Berry](https://www.oatmealcrisp.ca/products/oatmeal-crisp-triple-berry) / [Avoine Croquante Trio de Petits Fruits](https://www.oatmealcrisp.ca/fr-CA/products/avoine-croquante-trio-de-petits-fruits), product title, description, and Nutrition Facts. | Paired English/French product names and 1 cup / 1 tasse (54 g) serving. The French page’s current indexed content was checked on 2026-10-18. |
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S11` / `S12` | General Mills, [Oatmeal Crisp Honey Crunch](https://www.oatmealcrisp.ca/products/oatmeal-crisp-honey-crunch) / [Avoine Croquante Croquant Au Miel](https://www.oatmealcrisp.ca/fr-CA/products/avoine-croquante-croquant-au-miel), product title, description, and Nutrition Facts. | Paired English/French product names and 1 cup / 1 tasse (58 g) serving. |
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S13` / `S14` | General Mills, [Oatmeal Crisp Maple Nut](https://www.oatmealcrisp.ca/products/oatmeal-crisp-maple-nut) / [Avoine Croquante Saveur érable et Noix](https://www.oatmealcrisp.ca/fr-CA/products/avoine-croquante-saveur-erable-et-noix), product title, description, and Nutrition Facts. | Paired English/French product names and 1 cup / 1 tasse (58 g) serving. |
| `WP03-OATMEALCRISP-FAMILY-R771-20261018-S15` / `S16` | General Mills, [Oatmeal Crisp Almond](https://www.oatmealcrisp.ca/products/oatmeal-crisp-almond) / [Avoine Croquante Amandes](https://www.oatmealcrisp.ca/fr-CA/products/avoine-croquante-amandes), product title, description, and Nutrition Facts. | Paired English/French product names and 1 cup / 1 tasse (58 g) serving. |

If integrated, create one manufacturer-label `portion_weight` observation per product using the pair of sources listed for that variant. Keep `sourceQuantity` as one cup, `observedMassG` / `value` as that item’s listed value, and the observation scoped to that finished product’s dry, ready-to-eat cereal serving. These are published serving statements, not direct fill measurements. They do not establish a generic cereal cup mass, a packing/fill method, density, an active unit mapping, a recipe portion, or a value transferable to another variant. Keep measurement research `researched_supported` for the published product-specific portion only. Do not add forms, unit conversions, cooking or package yields. Substitution research is outside this review; keep it `not_yet_researched` and add no rules.

## Ownership and prior-review audit

The active [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) has 1,857 rows and the active [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) has 188; neither file has an Oatmeal Crisp name, alias, form label, match term, or any of the seven proposed IDs. The [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) has 56 candidates and no matching family/product identity. The [`research-ledger.v1.json`](../research-ledger.v1.json) has 2,254 records and no record for these identities or the proposed IDs. The seven proposed IDs, all 16 proposal-local source IDs, and all product/family URLs have no exact owner in the live ledger. No IDs are allocated or reserved by this proposal.

R738 is the only prior focused review of this family. It held Chocolate Almond until a family-level picker decision, listed the same seven English/French variants, and left its suggested single-candidate ID unallocated. [R759](wp03-section-f-next-gap-review-r759-20261018.md) references R738 only as a separate open hold. The [R762 bran-added Shredded Wheat review](wp03-section-f-next-gap-review-r762-20261018.md), [R767 Holy Crap Superseed review](wp03-section-f-next-open-gap-review-r767-20261018.md), and [R767–R769 integration](../batches/wp02-wp03-wp04-r767-r769-gap-review-integration-20261018/README.md) do not decide any Oatmeal Crisp identity. The English/French family-list URLs and the Chocolate Almond English/French detail URLs were already cited proposal-locally by R738; the other twelve product-detail URLs are new to the proposal archive. None is owned by a ledger source, so there is no live-ledger source owner to update. The proposal-local R771 IDs were checked and are unique within the live ledger and review archive.


## Picker projection

The static projection uses current reference and form names, aliases, labels, and match terms with [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, accent and ligature folding, complete word-phrase matching first, and substring fallback only when no complete phrase matches. It applies the exact proposed English suffix and French type prefix above and no aliases.

| Query | Current results | With R771 | Effect |
|---|---:|---:|---|
| `Oatmeal Crisp` | 0 | 7 | All seven English family members appear; avoids the misleading one-row result that R738 held. |
| `Avoine Croquante` | 0 | 7 | All seven French family members appear. |
| `Céréales Avoine Croquante` | 0 | 7 | The French type-prefixed family query also returns all seven. |
| Each full English or French variant title | 0 | 1 | Each full product query resolves to its own row. |
| `Oatmeal Crisp Protein` | 0 | 2 | Returns the two explicitly named protein variants. |
| `cereal` / `céréales` | 84 / 81 | 91 / 88 | The seven ready-to-eat products add seven exact English and French family results. |

**Integration correction:** the first projection counted five French `céréales` substring matches in the English `cereal` result set, even though 84 exact English matches already exist and phrase-first search does not use substring fallback when exact matches exist. The correct projection is 84 to 91 for `cereal` and 81 to 88 for `céréales`. Those five French-only substring matches were not actual pre-R771 results. The seven-row family result is an intentional effect of seven distinct current manufacturer products, not a generic alias. No standalone `oats`, `wheat`, `almond`, `chocolate`, `berries`, `honey`, `maple`, `granola`, or other component term is added. The counts are a deterministic projection of current catalog terms, not an Android picker test.

## Manifest recipe-corpus audit

The [`bundled-library manifest`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists **114 recipe files** with **1,123 structured ingredient rows**. A scan of every manifest-listed file and its ingredient rows searched the seven proposed IDs; all fourteen product-title variants; the family phrases `Oatmeal Crisp` and `Avoine Croquante`; and representative full-name spellings. It found **0 matching recipe files and 0 matching ingredient rows**. The corpus supplies no recipe demand or direct ingredient link for this family. Generic recipe mentions of oats, wheat, fruit, nuts, or cereal do not identify a finished Oatmeal Crisp product; add no recipe link or recipe text change.

## Static checks and test scope

- [x] Re-read current `AGENTS.md`, the open Section F plan, roadmap, live reference/form/legacy/ledger data, R738 family hold, recent R762 and R767 reviews, and the latest R767–R769 integration note.
- [x] Rechecked current bilingual manufacturer rosters, all seven product titles, and all seven product-specific published servings. The French title strings are manufacturer Canada French product-page wording; no independent terminology ruling or package/UPC crosswalk is claimed.
- [x] Checked candidate IDs and source IDs against active references, forms, legacy candidates, ledger records, prior proposals, and source URLs against live ledger ownership.
- [x] Projected family, variant, and generic cereal searches with the current phrase-first matching behavior; scanned all 114 manifest-listed recipes and 1,123 ingredient rows.
- **No software tests, build, emulator, or deployment were run.** This is proposal-only documentation; no database data changed. The updated `AGENTS.md` exempts JSON-only additions from software testing.

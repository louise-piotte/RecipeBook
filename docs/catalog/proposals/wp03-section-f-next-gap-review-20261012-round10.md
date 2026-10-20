# WP03 Section F: Puffed Khorasan wheat identity review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12; see the [batch integration record](../batches/wp03-section-f-puffed-khorasan-wheat-identity-integration-20261012/README.md). This update reconciles the review with the live package; it edits only this proposal.
- **Scope:** One plain, ready-to-eat puffed-grain product made from Khorasan wheat kernels.
- **Disposition:** Added identity-only `ingredient-ref-puffed-khorasan-wheat` as **`puffed Khorasan wheat / blé khorasan soufflé`** in `GRAIN_AND_CEREAL`. The integrated row has no forms, numeric behavior, recipe links, or active substitutions, and has only the manufacturer-attested English alias `Khorasan wheat puffs`.
- **Open checklist:** Section F still leaves “remaining puffed-grain candidates” open ([plan around lines 2065–2069](../../RecipeBook-global-ingredient-catalog-plan.txt#L2158)). Its current list has integrated puffed wheat, quinoa, millet, amaranth, sorghum, rice, buckwheat, spelt, and barley, while other puffed products remain unresolved.

## Product identity and boundary

Nature’s Path currently lists **Organic Khorasan Wheat Puffs Cereal** in Canada. Its description says the cereal is made from whole-grain Khorasan wheat kernels, air-popped, and contains one ingredient. This supports a named puffed Khorasan-wheat product. The product page showed the multipack as sold out when reviewed; this is product-identity evidence, not a claim about present availability. The Québec retailer La Moisson lists the item as **Céréales - Au blé Khorasan soufflé**, describes whole Khorasan grains puffed with air, and gives a single-ingredient statement. Its displayed French wording supports the proposed French name; it is market evidence rather than an OQLF term. The Québec Metro search record independently uses **Céréales de blé Khorasan soufflé biologiques**, though its direct page redirected to an English page during review, so it is secondary corroboration only.

This is a distinct preprocessed product from the intact Khorasan-wheat grain, Khorasan flakes, and Khorasan flour identities already integrated. It is species-qualified, while generic `puffed wheat / blé soufflé` remains the broad product identity. Khorasan is described by OQLF as an old durum-wheat variety; the proposed row retains that market distinction without treating it as a separate botanical family. Do not merge this product into the generic puffed-wheat row or treat it as interchangeable with that row.

| Neighboring identity | Boundary retained |
|---|---|
| `ingredient-ref-khorasan-wheat-grain` — `Khorasan wheat / blé khorasan` | Intact food-grade kernels, not puffed cereal. |
| `ingredient-ref-khorasan-flakes` — `Khorasan flakes / flocons de khorasan` | Flaked product, not puffed kernels. Its review explicitly left puffed Khorasan outside its scope. |
| `ingredient-ref-khorasan-flour` — `khorasan flour / farine de khorasan` | Milled product. |
| `ingredient-ref-puffed-wheat` — `puffed wheat / blé soufflé` | Generic wheat product. Keep it distinct from this named Khorasan product. |
| `ingredient-ref-puffed-spelt` — `puffed spelt / épeautre soufflé` | Separate species-qualified puffed grain. |
| Composite or sweetened cereals and snacks | Excluded; the identity is plain puffed Khorasan wheat as an ingredient, not any product containing it. |

The product’s organic claim, brand, package, and current stock status are not part of the proposed identity. The reviewed evidence establishes one manufacturer’s air-puffed product but does not prove that every product called puffed Khorasan wheat uses the same process or contains only one ingredient.

## Integrated reference fields

| Field | Live value | Evidence boundary |
|---|---|---|
| ID | `ingredient-ref-puffed-khorasan-wheat` | Owned by the active reference and its ledger record. |
| English display | `puffed Khorasan wheat` | Nature’s Path describes whole-grain Khorasan kernels that are air-popped; iHerb’s product information describes the same named SKU as “Khorasan Puffed Wheat.” |
| French display | `blé khorasan soufflé` | This phrase appears within La Moisson’s Québec product title, “Céréales - Au blé Khorasan soufflé.” OQLF supplies the base French term `blé khorasan`, not a preferred processed-product term. |
| English aliases | `Khorasan wheat puffs` | Source-attested phrase from the manufacturer’s product name. No other English alias is proposed. |
| French aliases | None | The product-attested French display is the sole French term. |
| Category | `GRAIN_AND_CEREAL` | Matches the processed cereal product category. |
| Density and unit mappings | `null`; empty | No cross-product mass/volume relation is supported. |
| Forms, conversions, yields, recipe links, active substitutions | None | Product identity evidence does not establish reusable form or conversion rules. |

OQLF pairs `blé khorasan` with English `Khorasan wheat`, identifies *Triticum turanicum*, and marks `Kamut`, `blé Kamut`, and `Kamut wheat` as trademarks. Keep `Kamut`, `Kamut puffs`, and `blé Kamut` out of generic names and aliases. The iHerb page also shows the wording “Khorasan Puffed Wheat”; I do not propose that as an alias because it contains the contiguous generic phrase `puffed wheat` and would make a generic `puffed wheat` query return both this named item and the broad wheat identity. The chosen display and manufacturer-title alias preserve precise searches without changing that broad query.

## Current package and ledger snapshot

Post-integration snapshot from the live worktree on 2026-10-12. File hashes are SHA-256 over exact bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, its exact bytes, and a trailing NUL byte in manifest order.

| Artifact | Current count/state | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,320 references; 137 `GRAIN_AND_CEREAL` | `4170561b1106f2bf98a3cfb0c789ec2f1a80e11095a58d342fd55a28fce56ef3` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,628 records; 5,979 source entries; 4,996 distinct source IDs; 8 unit conversions | `c1ef18297730fb99f8c2f032b4478ec04c6e4e2d51b614a0ee4c8ff89c21c523` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | 1,320 references | `0c5a0254e5b0961cbf271d92e69ba56bf6f1a6ea9cc38a8aab7a179c94024236` |
| `package-yields.v1.json` | 1 entry | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| `substitution-rules.v1.json` | 0 global rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 contextual rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Exact ownership and picker behavior

Using the repository’s `normalize_search_key` behavior (case, accents, punctuation, and spacing folded), I rechecked the ID and bilingual terms across active references, ingredient forms, legacy candidates, ledger record IDs, and prior proposal/batch history. The live `ingredient-ref-puffed-khorasan-wheat` reference owns the exact English and French displays and the English alias; its ledger record has the same ID. There is no corresponding form or legacy-import candidate. The existing Khorasan-flour, Khorasan-flakes, and intact Khorasan-grain records remain separate.

The source prefix `WP03-KHORASAN-PUFFS-20261012` is now allocated to the integrated ledger record. S01–S06 each appear exactly once in that record’s `sources[]`; the accepted decision cites all six. S06 also supports the rejected recipe-specific substitution finding. The batch record and plan checkpoint mark this product integrated.

The picker code normalizes names and aliases, returns complete phrase matches before trying substring fallback, and indexes form terms. The table below is a static evaluation of that logic against the live integrated JSON; it is not an emulator or runtime picker result.

| Query | Current live picker result |
|---|---|---|
| `puffed Khorasan wheat` | `ingredient-ref-puffed-khorasan-wheat` — exact phrase. |
| `Khorasan wheat puffs` | `ingredient-ref-puffed-khorasan-wheat` — exact phrase via alias. |
| `blé khorasan soufflé` | `ingredient-ref-puffed-khorasan-wheat` — exact phrase; accent folding also supports `ble khorasan souffle`. |
| `puffed wheat` | `ingredient-ref-puffed-wheat` only; the Khorasan row does not contain this contiguous phrase. |
| `Khorasan wheat` | `ingredient-ref-khorasan-wheat-grain` and `ingredient-ref-puffed-khorasan-wheat`. |
| `Khorasan` | Khorasan flakes, flour, intact grain, and puffed Khorasan wheat. |
| `blé soufflé` | `ingredient-ref-puffed-wheat` only; the Khorasan qualifier remains between those words in the new French display. |
| `soufflé` | Nine results: popcorn and puffed buckwheat, Khorasan wheat, millet, quinoa, rice, sorghum, spelt, and wheat. |

## Full bundled-recipe audit

I parsed every manifest-listed recipe and checked its complete serialized JSON plus all 1,123 ingredient rows (`originalText`, `ingredientName`, `ingredientRefId`, and other row fields). The search set included `puffed Khorasan wheat`, `Khorasan wheat puffs`, `Khorasan puffed wheat`, `Khorasan puffs`, `puffed Khorasan`, `Kamut puffs`, `puffed Kamut`, `blé Khorasan soufflé`, `céréales au blé Khorasan soufflé`, `blé Kamut`, `Khorasan`, and `Kamut`, using normalized phrase matching.

| Search result | Count |
|---|---:|
| Matching files | 0 / 114 |
| Matching ingredient rows | 0 / 1,123 |
| Existing recipe links to a Khorasan-puffs reference | 0 |

No bundled recipe currently requests Khorasan puffs. No recipe link, amount, form hint, or recipe edit is proposed.

## Forms, measurements, and substitutions

- **Forms:** Propose no `IngredientForm`. The identity is a ready-to-eat puffed-grain product. Its processing does not establish a reusable conversion from raw Khorasan wheat.
- **Measurements:** The ledger records the iHerb Canada package serving of **1 cup cereal (16 g)** for the 170 g Nature’s Path SKU as source evidence. It does not establish a universal cup weight, fill method, density, unit mapping, or package yield. The integrated reference keeps density null and unit mappings empty; no active measure, conversion, or yield was added.
- **Substitution:** The ledger now records the 2025 blog’s puffed-brown-rice suggestion under `wp03-puffed-khorasan-wheat-no-supported-general-substitute-20261012`, with the candidate explicitly rejected. The blog gives no replacement quantity or tested equivalence. No global or contextual runtime substitution was added, and the recipe’s separate 6 oz Khorasan-puff line is not treated as a 1:1 amount.
- **Other numeric claims:** Package sizes and servings identify a specific retail SKU. They do not define default ingredient behavior.

## Integrated source register

Sources were reviewed on 2026-10-12. `WP03-KHORASAN-PUFFS-20261012-S01` through `S06` are now registered in the ledger record `ingredient-ref-puffed-khorasan-wheat`. Each ID appears exactly once as a source entry in that record. The accepted decision references all six; S06 also appears in the rejected substitution finding.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| `WP03-KHORASAN-PUFFS-20261012-S01` | Nature’s Path Canada, [Organic Khorasan Wheat Puffs Cereal](https://naturespath.com/en-ca/products/puffed-khorasan-cold-cereal-np-ca) | Manufacturer page names the cereal, describes whole-grain Khorasan kernels that are air-popped, and says it contains one ingredient. Page showed the multipack sold out on review; it does not prove current retail availability or establish a universal puffing process. |
| `WP03-KHORASAN-PUFFS-20261012-S02` | La Moisson Québec, [Céréales - Au blé Khorasan soufflé](https://lamoisson.com/products/cereales-au-ble-khorasan-souffle) | Current Québec French product listing supports the wording `blé Khorasan soufflé`, whole Khorasan grain, air-puffing, and a one-ingredient product. It is retailer copy and also notes its listing is available for in-store pickup only; no availability claim is imported. |
| `WP03-KHORASAN-PUFFS-20261012-S03` | Metro Québec, [Céréales de blé Khorasan soufflé biologiques](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-soufflees-biologiques/p/058449620044) | Search-indexed French product record provides independent Québec title wording. Direct opening redirected to an English Metro page, so this is secondary name corroboration only; the listing showed out of stock. |
| `WP03-KHORASAN-PUFFS-20261012-S04` | Office québécois de la langue française, [blé khorasan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan) | Gives the preferred French base `blé khorasan`, English `Khorasan wheat`, *Triticum turanicum*, and marks `Kamut` / `blé Kamut` / `Kamut wheat` as trademarks. It does not name the puffed product. |
| `WP03-KHORASAN-PUFFS-20261012-S05` | iHerb Canada, [Nature’s Path Organic Khorasan Wheat Puffs Cereal](https://ca.iherb.com/pr/nature-s-path-organic-khorasan-wheat-puffs-cereal-6-oz-170-g/122700) | Retailer page reproduces product details and a package nutrition-panel serving of 1 cup (16 g), plus “Khorasan Puffed Wheat” wording. Use the numeric detail only for that SKU; it provides no general density or conversion. The retailer cautions that package information may lag manufacturer changes. |
| `WP03-KHORASAN-PUFFS-20261012-S06` | The Good Stuff Bake Shop, [Easy Wheat Puff Cereal Recipe](https://thegoodstuffbakeshop.com/easy-wheat-puff-cereal/) | Independent recipe blog lists 6 oz Khorasan Wheat Puffs and says puffed brown rice works as a gluten-free alternative in that recipe. It gives no replacement amount, does not test a general ingredient equivalence, and is not primary or authoritative substitution guidance. |

## Static checks performed

- The integration batch reports passing static package, generated-index, ledger, ownership, corpus, encoding, and whitespace checks.
- For this refresh, parsed the live references, forms, manifest, legacy candidates, research ledger, package-yield file, and substitution-rule files; recomputed the counts, byte hashes, source counts, and recipe-corpus digest shown above.
- Verified that the integrated ID and display/alias keys resolve to the live reference and ledger record, that no matching form or legacy candidate exists, and that S01–S06 each appear once in the record’s `sources[]`.
- Re-evaluated the exact-phrase/substring picker behavior from `IngredientSearch.kt` against the live reference data and rescanned all 114 recipes and 1,123 ingredient rows; found zero candidate phrase hits.
- Checked this proposal’s UTF-8 encoding without BOM, listed mojibake markers, trailing whitespace, and final newline. This refresh edited only this proposal.
- No app tests or emulator checks were run. The integrated implementation adds database JSON data and its generated search index, for which `AGENTS.md` exempts app testing.

## Disposition

Integrated the identity-only `GRAIN_AND_CEREAL` reference **`puffed Khorasan wheat / blé khorasan soufflé`** with the manufacturer-attested English alias `Khorasan wheat puffs`. The live ledger marks its identity verified, records no supported reusable measurement or substitution, and retains the puffed-brown-rice suggestion as a rejected recipe-specific candidate. The reference remains distinct from Khorasan grain, flour, flakes, generic puffed wheat, and other puffed-grain identities; `Kamut` remains outside generic names. The 114-file / 1,123-row corpus still has no matching recipe demand or links. See the [integration batch](../batches/wp03-section-f-puffed-khorasan-wheat-identity-integration-20261012/README.md).

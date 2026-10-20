# WP03 Section F: Puttu podi product-family boundary hold — 2026-10-13

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Source-grounded regional preprocessed-grain candidate; keep the generic product-family identity unresolved.
- **Open checklist:** The live Section F item for regionally significant cereal mixes and preprocessed grains remains open at [plan line 2389](../../RecipeBook-global-ingredient-catalog-plan.txt#L2482).
- **Scope:** Flour or powder prepared for steaming Kerala-style *puttu*, including the grain-qualified retail products sold under names such as *puttu podi*. The prepared steamed dish itself and ordinary rice, millet, corn, or wheat flour are outside this ingredient scope.
- **Decision:** Do not add a generic `puttu podi` / `puttu flour` active reference or aliases, and do not attach these names to generic rice flour, white rice flour, or roasted red rice flour. Hold pending a product-specific substrate/process boundary and a verified Québec-facing French display. The sources establish that the regional product is real and commercially distinct, while current Canadian product listings use the same family wording for several different grain-labelled products. A single unqualified picker result would obscure those choices.
- **Catalog ID:** None proposed for allocation. Decide first whether a fully sourced, substrate-qualified item (for example, white-rice puttu flour) is the intended ingredient and whether it is distinct from the corresponding ordinary flour.
- **Source-ID prefix:** `WP03-PUTTU-PODI-BOUNDARY-20261013-R33-`. The prefix was absent from the current ledger and proposal/batch archive at review time. IDs below are proposal-local and are not ledger additions.

## Product boundary and prior work

Kerala government sources name puttu powder as a marketed powder product, and NIFTEM-T's rice-flour handbook describes a puttu-specific flour process and quality targets. The product family is therefore a genuine preprocessed-grain gap, rather than another name for the prepared dish. The technical source limits its account to rice-based puttu flour and discusses both white-rice and pounded-red-rice types.

The Canadian retailer category page checked for this review (web crawl roughly two months before review) lists several separately named products: white puttu podi, chemba puttu podi, corn puttu podi, ragi puttu podi, oats puttu, and generic rice puttu podi. The retailer page does not provide ingredient statements or process specifications for each item, so those titles establish a variant boundary to investigate, not a common recipe or formula. A generic family row could return one result for all of them and would not tell a recipe author which substrate the source intended.

This is separate from completed reviews of idli rava, hot cereal identities, grain flakes, quick-cooking barley, cereal blends, and the barley-couscous decision. It does not reopen the held farro, sushi-rice, pearled-hominy, pozole-corn, Ogi Baba, Tom Brown, Hausa Koko, or Fura boundaries. The only earlier archive hit for `pittu` is a mention of pittu as one possible use for a red-rice flour listing in [the roasted urid/mong/oat/rice flour review](wp02-roasted-urid-mong-oat-rice-flour-review-20261010.md); it does not review puttu podi or a puttu-specific product.

Do not equate this product with appam/idiyappam/pathiri flour, ordinary rice flour, roasted red rice flour, millet flour, corn flour, wheat flour, or the steamed puttu dish. Shared substrate or culinary context does not establish identical preparation, milling, roasting, particle size, or substitutability.

## Exact ownership and live baseline

Normalized exact-key checks covered the candidate terms `puttu`, `pittu`, `puttu podi`, `puttu powder`, `puttu flour`, `white puttu podi`, `chemba puttu podi`, `corn puttu podi`, `ragi puttu podi`, `oats puttu`, `wheat puttu podi`, `farine de puttu`, `poudre de puttu`, `farine pour puttu`, `farine de riz pour puttu`, and `poudre pour puttu`. There is no exact owner in active ingredient names or aliases, form labels or match terms, the 64 legacy-import candidates, or the research ledger. The ledger contains no `puttu` or `pittu` mention. No Puttu form exists.

The adjacent active flour identities remain separate:

- `ingredient-ref-rice-flour` — `rice flour / farine de riz`;
- `ingredient-ref-white-rice-flour` — `white rice flour / farine de riz blanc`;
- `ingredient-ref-roasted-red-rice-flour` — `roasted red rice flour / farine de riz rouge torréfiée`;
- brown-rice, glutinous-rice, Mochiko, and Shiratamako flour identities.

The seven rice-flour references have no attached forms. The generic, white-rice, and roasted-red-rice entries have null density and empty unit mappings; none supplies puttu-specific measurement data. No legacy candidate or ledger record is a Puttu owner.

| Artifact | Live snapshot |
| --- | --- |
| `ingredient-references.v1.json` | 1,364 references; SHA-256 `80ecf866eb614caa604338c909687c3c4f0ffc228cff2fa6c56d8ab9e6ea3b0d` |
| `ingredient-forms.v1.json` | 100 forms; SHA-256 `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63`; no Puttu form terms |
| `legacy-import-identities.v1.json` | 64 candidates; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,691 records, 6,598 source-entry occurrences, 5,529 distinct source IDs; SHA-256 `1927a4922e2b0726c1bf8f64ff90a03ea9c09c87823c97755ea3b8771c4b8363`; no Puttu mention |
| `manifest.v1.json` | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Picker and recipe-demand effects

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, and punctuation, returns complete word-phrase matches first, and falls back to substring matching. Static projections from the live references and forms show:

| Query | Current picker result | Illustrative effect of one generic `puttu flour / farine pour puttu` row with `puttu podi` and `puttu powder` aliases |
| --- | --- | --- |
| `puttu`, `puttu podi`, `puttu flour` | No result | One generic result for each query, despite Canadian listings distinguishing multiple grain-labelled products |
| `pittu` | No result | No result; this spelling is not supported as an alias by the product evidence reviewed here |
| `rice flour` / `farine de riz` | Seven existing rice-flour identities | Unchanged if kept out of the Puttu row; attaching a rice-flour phrase would add another result to these already broad queries |
| `white rice flour` / `farine de riz blanc` | One white-rice flour result | Unchanged if the Puttu row stays product-qualified; a future French alias containing this phrase would add a second result to `farine de riz blanc` |
| `chemba puttu podi` | No result | A generic alias would still hide whether the requested product is white rice, red rice, corn, ragi, oats, or another substrate |

The illustrative row is not an approved candidate. Keeping the umbrella row out preserves the current no-result behavior for Puttu-specific searches until a source-qualified identity or set of identities is selected. Do not add `pittu` as an English alias based on an archive mention that only lists a possible recipe use for red-rice flour.

The full recipe package was scanned through all 114 manifest-listed files, all 1,123 ingredient rows, and serialized recipe strings for `puttu`, `pittu`, `puttu podi`, `puttu powder`, `puttu flour`, `chemba puttu`, grain-qualified puttu names, and candidate French phrases. The scan found zero matching files, zero ingredient-row hits, and zero Puttu reference links. The manifest-order corpus fingerprint is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` (753,792 recipe-file bytes). No recipe link is proposed.

## Measurement, forms, and substitution limits

- **Process and product state:** NIFTEM-T describes flour moistened with a small amount of water and grated coconut, then open-steamed; it identifies grain hydration, particle-size distribution, and roasting as quality variables. This establishes a product-specific process but not one universal processing specification. Add no form until an exact commercial product and process are selected.
- **Measures and density:** One Canadian listing gives a one-cup puttu-podi plus one-cup-water preparation direction for its white-rice SKU, followed by resting and steaming. The page identifies its inventory timestamp as 2025-07-04. This is a product-specific wetting instruction, not a dry flour mass, a general formula, or a volume-to-mass conversion. Retail package sizes such as 500 g and 1 kg are package masses, not recipe measures. Add no density, unit mapping, conversion, or reusable household measure.
- **Yield:** Add no preparation yield. A package recipe direction does not establish a general dry-to-steamed yield.
- **Substitution:** Add no global or contextual substitution between Puttu podi and ordinary rice flour, white or red rice flour, millet, corn, oats, wheat, or another Puttu product. Similar intended dishes do not establish equal ingredient roles, amounts, moisture absorption, particle size, or cooking behavior.
- **Recipe links:** Add none; the bundled corpus contains no matching demand.

## Source register

Sources were checked online on 2026-10-13. The source IDs are unique proposal-local identifiers and have not been added to the shared ledger.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S01` | Kerala Local Self Government Department, Kudumbashree, [Office opened for Curry Powder Consortium in Thrissur](https://lsgkerala.gov.in/en/kudumbashree/featured-topics/office-opened-curry-powder-consortium-thrissur), posted 2024-09-03. | Lists “steamed puttu powder” separately among products made by Kudumbashree enterprises for public markets. Supports a marketed processed product in Kerala; it does not specify cereal composition, a common manufacturing standard, or a Canadian/French product name. |
| `WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S02` | NIFTEM-T, [Products from Rice Flour](https://niftem-t.ac.in/olapp/pmfme/upload/mt_handbook_grain.pdf), rice-flour products section. | Describes puttu as a traditional Kerala product made by mixing rice flour with a small amount of water and coconut before open steaming; identifies low-amylose/low-gelatinization/low-peak-viscosity rice flour, hydration, particle size, roasting, and white-rice and pounded-red-rice types. Technical handbook evidence is scoped to rice-based products and does not define all current retail variants. |
| `WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S03` | Kerala Food Safety Department, [Serving Safe 2024 booklet](https://foodsafety.kerala.gov.in/wp-content/uploads/2024/05/ServingSafe2024-booklet-1.pdf), “Special drive to check quality of rice powder,” pp. 21–22. | Describes rice powder as a base for multiple Kerala dishes and says the inspection drive covered units manufacturing rice powder, puttu powder, appam powder, and idiyappam powder. Supports a distinct manufacturing/product category; does not establish one universal Puttu formula or measure. |
| `WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S04` | Canadian Intellectual Property Office, [Journal des marques de commerce, vol. 72, no. 3685](https://publications.gc.ca/collections/collection_2025/opic-cipo/RG42-2-72-3685-fra.pdf), 2025-06-11, p. 334. | In a trademark goods list, renders `chemba puttu podi` as `nommément farine de riz rouge`. This is an official Canadian French goods-list translation for one red-rice product name, not an OQLF/TERMIUM terminology ruling or a general French name for the family. |
| `WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S05` | Indian Spice Haven, Canadian retailer, [Flours product category](https://www.indianspicehaven.ca/category/flours), page checked 2026-10-13; web index crawl roughly two months earlier. | Displays separate product titles for White puttu podi, Chemba puttu podi, Corn Puttu Podi, Ragi Puttu Podi, Oats Puttu, and generic rice puttu podi, with package sizes and some add-to-cart listings. The titles do not provide complete ingredient declarations or prove each recipe/process; this is retail-surface evidence of distinct substrate-qualified listings only. |
| `WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S06` | Grocerybasket.ca, Canadian retailer, [Puttu podi (White Rice) 1Kg](https://grocerybasket.ca/products/white-puttupodi-white-rice-flour-for-funnel-cake-1000g-dh), product instructions and inventory note. | Names a Double Horse white-rice product and gives a one-cup powder plus one-cup water direction, resting 20–30 minutes before steaming. The page says its inventory was last updated 2025-07-04; this does not establish present availability, dry cup mass, generic ratio, density, or equivalent behavior for another SKU. |

The targeted Québec terminology search did not establish an OQLF or TERMIUM entry for `puttu podi`, `puttu flour`, `farine de puttu`, or `farine de riz pour puttu`. This is a bounded search result, not proof that no Québec usage exists. The CIPO translation and retailer labels are not a substitute for a Québec-facing terminology decision.

## Next action

Reopen only with a selected, source-qualified product (such as white-rice or chemba-red-rice puttu flour), a current manufacturer or retailer ingredient/process statement, and a verified Québec-facing French display. Then repeat exact ownership and picker projections for the substrate-qualified and broad `puttu` queries. Keep the candidate outside active references, aliases, forms, measurements, recipe links, conversions, yields, and substitutions until that boundary is resolved; leave the broader Section F checklist open.

## Static proposal checks

- Re-read `AGENTS.md`, `Requirements.md`, the live plan/roadmap, and the proposal archive before selection.
- Recomputed catalog, form, legacy, ledger, manifest, and corpus counts and hashes from the live worktree.
- Checked exact owners across active names/aliases, attached form terms, all legacy candidates, ledger text, and the proposal/batch archive; the only `pittu` archive hit is the adjacent use mention described above.
- Projected the live phrase-first/substring-fallback picker for current queries and one illustrative generic row. This is a static query simulation, not runtime picker QA.
- Parsed every manifest-listed recipe and found no Puttu phrase or ingredient-row matches.
- This proposal is the only file created for this task. No shared catalog, ledger, plan, roadmap, code, or recipe files were edited; no tests were run for proposal-only work.

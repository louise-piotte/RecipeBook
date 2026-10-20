# WP04 Section P — masago identity review (R419)

- **Review and source-access date:** 2026-10-17.
- **Candidate:** masago, the named sushi-roe product category also marketed as capelin roe / `œufs de capelan`.
- **Recommendation:** Add identity-only `masago / masago` as `ingredient-ref-masago` in `PROTEIN`, with `capelin roe` and `œufs de capelan` as the only aliases. Keep the identity scoped to the named culinary category. Current Canadian manufacturers sell both capelin-only and capelin-plus-herring formulations as masago; do not assign one species composition, seasoning, color, or preservation state to every SKU.
- **Scope:** This is a distinct decision on masago. It does not reopen R416 herring roe, R413 sujiko, R410 Nenu Dieune, R42 kazunoko, or any integrated roe identity. Keep those decisions and boundaries unchanged.
- **Proposal-only status:** This file is the only proposed change. No shared catalog JSON, ledger, plan, roadmap, generated index, archive, recipe, or application code was edited. No software tests, build, emulator, or deployment was run.
- **Proposal-local source IDs:** New IDs use `WP04-SECTIONP-MASAGO-R419-20261017-`; audit label `WP04-SECTIONP-MASAGO-R419-20261017-R01`. Existing source IDs are reused where the URL is already in the ledger or earlier proposal archive.

## Why this is the next distinct roe gap

The open Section P checklist still names roe, tobiko, and masago as recipe-conditioned gaps ([plan, line 7395](../../RecipeBook-global-ingredient-catalog-plan.txt#L7413)). The October 9 tobiko/masago packet set out possible identities but left them proposal-only because the bundled recipes had no roe demand ([earlier proposal](wp04-tobiko-masago-roe-boundary-review-20261009.md), plan line 11365). R416 has since held herring roe because current sources disagree about whether it means unprepared roe, salted kazunoko, or another product state. Masago is a separate named sushi-roe product with its own current Canadian and Québec-facing listings; this review does not treat it as herring roe or a herring-roe state.

Current product evidence now supports a bounded masago identity. A Montréal-market retailer sells red masago, calls the English listing capelin roe [S04] and the French listing œufs de capelan [S01], and identifies its source as *Mallotus villosus*. The seller also lists masago for Québec City delivery under an existing source record. A Canadian manufacturer separately markets multiple Masago SKUs. Its pages show why the catalog should represent the named ingredient category without promising a universal formula: one SKU lists capelin and herring caviar, while another lists capelin caviar and seasonings. A Québec marine-food resource also says capelin eggs are called masago in Asian cuisine and used with sushi. These sources support the culinary product name and its capelin association; they do not establish that every branded masago SKU contains only capelin roe.

This recommendation updates the older demand-only deferral with direct current product evidence, following the same identity-only approach used for other named roe products. The bundle still has no recipe demand. No measurement, form, recipe link, conversion, yield, or substitution is activated.

## Names and product boundaries

Use bilingual display names `masago / masago`, with only these qualified search aliases:

| Search term | Scope and support |
|---|---|
| `masago` | The same culinary product name is used in current English and French Canadian product listings. It is the preferred display in both languages. |
| `capelin roe` | A current Montréal-market seller uses this name for its red masago SKU; Canadian marine-food material links capelin eggs with masago. Keep this as a search alias for the named culinary category, not a promise that every masago package contains pure capelin roe. |
| `œufs de capelan` | The Montréal-market French listing uses the wording for capelin eggs; OQLF normalizes `capelan` for *Mallotus villosus*. Keep the term scoped to the roe product and separate from the whole-fish reference. |

Do not add `caviar`, `caviar rouge`, `caviar de capelan`, `sushi caviar`, `capelin eggs`, `œufs d’éperlan`, `tobiko`, `tobikko`, `masago arare`, or a herring-roe term as aliases. Product titles sometimes use the commercial word *caviar*, but it would add an unrelated broad picker match; Canadian product declarations also show that Masago SKU ingredients can vary. A single Québec sushi-menu phrase calling masago `œufs d’éperlan` conflicts with the source-backed distinction between capelin and rainbow smelt, so do not adopt that phrase. Preserve the menu wording only as a noted local usage conflict in the older boundary review.

Keep masago separate from whole Atlantic capelin, tobiko/flying-fish roe, salmon and trout roe, herring roe/kazunoko, roe-on-kelp, bottarga, milt, sea-urchin gonads/uni, lumpfish roe, and sturgeon caviar. Masago is not a form of `ingredient-ref-atlantic-capelin`; a roe product is distinct from whole fish flesh. Do not infer species purity, color, seasoning, salt level, pasteurization, origin, fresh/frozen state, or package size from one seller's SKU.

## Live ownership, archive, and source-ID audit

The repository snapshot read on 2026-10-17 contains **1,719 active references**, **141 forms**, **56 legacy candidates**, and **2,078 research-ledger records** with **9,411 source entries**, **7,973 distinct source IDs**, and **6,691 distinct source URLs**. The manifest lists **114 recipe files** and the current files contain **1,123 ingredient rows**.

| Surface or key | Current owner or mention | R419 disposition |
|---|---|---|
| Active reference names and aliases | No exact normalized-key owner for `masago`, `masago orange`, `masago red`, `capelin roe`, `capelin eggs`, `œufs de capelan`, or proposed ID `ingredient-ref-masago`. The whole-fish `ingredient-ref-atlantic-capelin` is the only current `capelin` / `capelan` result. | Add one identity-only masago reference; keep whole capelin as a separate reference. |
| Active forms | No form label or match term owns masago, capelin roe, or `œufs de capelan`. | Add no form or state relationship. |
| Legacy import candidates | No candidate ID, bilingual name, or alias owns the candidate phrases or proposed reference ID. | Add no legacy mapping. |
| Research ledger | No dedicated masago identity, candidate ID, or exact phrase owner exists. The ledger mentions masago only as neighboring roe context in salmon-roe, sea-urchin-gonad, and bottarga records; none allocates a masago identity. | Add a verified `ingredient-ref-masago` identity record at integration; do not convert or duplicate another record. |
| Plan and archive | The October 9 tobiko/masago packet is proposal-only. Current plan work integrates or holds salmon roe, bottarga, milt, trout roe, cod roe, kazunoko, sujiko, Nenu Dieune, and herring roe separately. | Decide only masago; keep all those records and holds unchanged. |
| Proposed ID and source prefix | No exact owner for `ingredient-ref-masago` or any `WP04-SECTIONP-MASAGO-R419-20261017-` source ID was found in the live data, proposal archive, or batch archive. | Keep the proposed identity and new evidence IDs unallocated until root review. Reuse existing source IDs for repeated URLs. |

Snapshot file hashes are references **6c4b0493f61e19ef452677a88a3d23fb033fc915c724c23d035387f7de6371ac**, forms **2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed**, legacy candidates **8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720**, and ledger **b9cf313e089fcf4c8928f3320212d537286753e40e18ad42380f1ccce5b60298**. The recipe-corpus digest is recorded below.

## Picker projection

The projection follows phrase-first search and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms. The hypothetical row uses the proposed display names `masago / masago` and aliases `capelin roe / œufs de capelan`.

| Query | Current result | With proposed row |
|---|---|---|
| `masago`; `capelin roe`; `œufs de capelan` | No result | Masago |
| `capelin`; `capelan` | Atlantic capelin | Atlantic capelin; Masago |
| `roe` | Bottarga; milt; salmon roe; trout roe | The same four plus Masago |
| `fish roe`; `œufs de poisson` | Bottarga | Unchanged |
| `fish eggs` | No result | No result |
| `caviar` | Finger lime; salmon roe; trout roe | Unchanged; no caviar alias is proposed |
| `tobiko`; `ikura`; `kazunoko`; `herring roe`; `œufs de hareng`; `œufs d’éperlan` | No result | No result |
| `masago orange`; `masago red`; `caviar de capelan` | No result | No result; product colors and caviar wording stay SKU-specific |

Adding the alias makes broad `capelin / capelan` queries return both the existing whole-fish reference and the separate roe product. The broad `roe` query grows from four to five distinct results. Leave generic `fish roe` and `caviar` behavior unchanged; do not add an alias that obscures the product boundary.

## Manifest-listed recipe demand

The scan read all **114** recipe files listed by the seed manifest and all **1,123** structured `ingredients[]` rows, including complete recipe JSON content. It searched for `masago`, `masago orange`, `masago red`, `masago arare`, `capelin roe`, `capelin eggs`, `œufs de capelan`, `caviar de capelan`, `tobiko/tobikko`, `œufs d’éperlan`, `smelt roe`, `roe`, `fish roe`, `fish eggs`, `ikura`, `kazunoko`, `herring roe`, `œufs de hareng`, roe-on-kelp, and spawn-on-kelp. It found **zero matching recipe files**, **zero matching ingredient rows**, and no direct recipe-reference link to masago.

The ordered corpus digest, hashing each manifest-relative path, NUL separator, exact file bytes, and trailing NUL separator, is **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e** (**753,988 recipe-file bytes**). This is no demand in the bundled manifest corpus only; it does not establish demand outside the bundled library. [R01]

## Measures, forms, and substitutions

CaviarHub's current red-masago page lists a 50 g jar and seller serving suggestions including 50 g for 1–2 people and 100 g for 2–4 people. These are observations about that seller's product and serving guide, not a reusable portion or kitchen measure. Azuma's Masago Orange listing gives 100 g and 2 kg package options by case and states a frozen shelf life; the Masago Delight listing gives a separate 500 g case configuration. These SKU-specific amounts and storage statements do not establish a standard masago package, form, shelf life, yield, or conversion. If retained at integration, record serving and package values only as source-specific observations.

Add no reusable mass or volume measure, density, unit mapping, form, package yield, recipe yield, conversion, or recipe link. The global and contextual substitution-rule files contain no current masago rule. CaviarHub compares masago with tobiko by size, texture, and flavor but provides no recipe context, replacement quantity, or tested outcome. No bundled recipe tests replacing masago with tobiko, salmon/trout roe, herring roe, bottarga, or another ingredient. Add no global or contextual substitution rule, warning, or recipe-line link.

## Proposed catalog disposition

At integration, add the following identity-only row:

```json
{
  "id": "ingredient-ref-masago",
  "nameEn": "masago",
  "nameFr": "masago",
  "aliasesEn": ["capelin roe"],
  "aliasesFr": ["œufs de capelan"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Keep the entry at the named culinary-category level. Record the manufacturer evidence that some Masago SKUs include herring roe as a product-variation boundary; do not add herring aliases or make herring roe a form. Add no ingredient form, density, mapping, measure, conversion, yield, recipe link, or active substitution. Keep the broader Section P roe checklist open.

## Source register

Sources were checked or rechecked on 2026-10-17. Root review added the English sibling listing as S04 to directly support the `capelin roe` alias; proposal-local IDs do not create shared-ledger records. Existing source IDs are reused where the URL already has a ledger or proposal owner.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-MASAGO-R419-20261017-S01** | CaviarHub, [Masago (rouge)](https://caviarhub.ca/fr/products/masago-red-caviar), current product page, description and details. | French-facing Canadian seller page lists masago, capelin eggs, *Mallotus villosus*, an Iceland origin, 50 g size, pasteurized/salted state, and seller serving suggestions. These claims are specific to this SKU and are not generalized to every masago product. The separate [Québec City delivery page](https://caviarhub.ca/fr/pages/ville-de-quebec-caviar-esturgeon-oeufs-de-poisson-truffes) lists Masago Orange and Red for Québec City delivery; reuse ledger source ID `WP04-SECTIONP-TROUT-ROE-R395-20261017-S03` for that URL. |
| **WP04-SECTIONP-MASAGO-R419-20261017-S02** | Azuma Foods (Canada), [Masago Orange](https://azumafoods.ca/products/masago-orange/), current manufacturer product listing, product numbers 63056, 63058, and 63149. | Names the product Masago Orange / seasoned capelin-and-herring caviar and lists capelin, herring, and seasonings as its main ingredients. Package options and frozen shelf life apply to those SKUs only. This product-specific mixture means the catalog must not promise species purity for all masago. |
| **WP04-SECTIONP-MASAGO-R419-20261017-S03** | Azuma Foods (Canada), [Masago Delight](https://azumafoods.ca/products/masago-delight/), current manufacturer product listing, product 63120. | Names Masago Delight / seasoned capelin caviar and lists capelin caviar with seasonings. The 24 × 500 g case configuration and frozen shelf life are specific to this SKU. It documents a different formulation; it does not establish one standard formula for the Masago family. |
| **WP04-SECTIONP-MASAGO-R419-20261017-S04** | CaviarHub, [Red Masago Caviar](https://caviarhub.ca/products/masago-red-caviar), current English product page. | Directly supports the `capelin roe` search alias by describing red masago as capelin roe. The page's Iceland origin, red SKU, 50 g jar, pasteurized/salted state, and serving guide remain specific to that product. |
| **Reused WP04-P-ATLANTIC-CAPELIN-20261012-S01** | OQLF, [GDT: capelan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198782/capelan). | Normalizes the Québec French fish term `capelan`, with English `capelin` and *Mallotus villosus*. This supports the French alias wording and the whole-fish boundary, not the processing or composition of masago. |
| **Reused WP04-P-ATLANTIC-CAPELIN-20261012-S06** | Exploramer / Fourchette bleue, [Capelan](https://fourchettebleue.ca/produits/capelan/), culinary-use section. | Identifies *Mallotus villosus* and says capelin eggs are called masago in Asian cuisine and accompany sushi. It supports the capelin-roe association and Québec context, not one SKU formula or measure. |
| **Reused WP04-ROE-S08** | Azuma Foods (Canada), [2022 product catalogue](https://azumafoods.ca/wp-content/uploads/2022/07/Azuma-Foods-Canada-Product-Catalogue-2022.pdf), Masago product pages. | Earlier proposal source ID for Azuma's older product catalogue; current R419 claims about formulation rely on the current manufacturer product pages above. |
| **WP04-SECTIONP-MASAGO-R419-20261017-R01** | Current manifest, ingredient references, forms, legacy candidates, research ledger, substitution files, `IngredientSearch.kt`, and manifest-listed recipe corpus. | Static ownership, source-ID, picker-projection, and corpus audit against the snapshot described in this proposal. It does not establish demand outside the bundled library. |

## Final disposition

**Add identity-only masago / masago** with `capelin roe` and `œufs de capelan` as qualified aliases. Current Québec-facing retail and Canadian manufacturer evidence support the named culinary category, while current SKU labels show that formulation can vary. Keep all blend ingredients, species-purity claims, colors, preservation states, package amounts, serving guides, and other product details source-specific. Preserve all prior roe decisions, add no active measures or substitutions, and leave the broad Section P roe checklist open.

# WP03 Section F malted wheat flakes identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** integrated on 2026-10-12 after coordinator review; see the [integration record](../batches/wp03-section-f-malted-wheat-flakes-integration-20261012/README.md). No recipe, form, or reusable numeric behavior was added.
- **Scope:** resolve the malted-wheat-flakes boundary that the wheat-flakes review explicitly excluded, without reopening the accepted plain `wheat flakes / flocons de blé` identity. The Section F checklist still calls for regional cereal and preprocessed-grain review ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L507), [latest open item](../../RecipeBook-global-ingredient-catalog-plan.txt#L9115)).
- **Overlap check:** at proposal time, no dedicated malted-wheat-flakes proposal or integration batch existed. The plain wheat-flakes review names malted wheat flakes only as an excluded neighboring product ([review](./wp03-section-f-next-grains-gap-sweep-20261012.md#candidate-decision-plain-wheat-flakes), [integration record](../batches/wp03-section-f-wheat-flakes-integration-20261012/README.md)). Other malt reviews cover flour or malt extract, not this flaked product.
- **Disposition:** recommend one identity-only `GRAIN_AND_CEREAL` reference for **`malted wheat flakes / flocons de blé malté`**. Current English product evidence, a Canadian ingredient declaration, and its Québec-facing French label support a distinct food ingredient. Treat the French display as label-attested rather than an OQLF ruling. Keep recipe links and numeric behavior empty.

## Proposal-time package snapshot

Read-only snapshot of the canonical split seed and catalog records at review time:

| Artifact | Count at proposal review |
|---|---:|
| Active ingredient references | 1,258 |
| Ingredient forms | 94 |
| Legacy import candidates | 66 |
| Research-ledger records | 1,567 |
| Manifest-listed recipes | 114 |
| Ingredient rows in those recipes | 1,123 |

The recipe count and row count were recomputed from the manifest and every listed recipe file. Counts are a proposal-time snapshot, not a completion claim. At the integration recheck, the live pre-addition package had 1,296 references and 1,604 ledger records; forms, legacy candidates, and recipe totals were unchanged.

## Identity and scope used for integration

| Field | Decision |
|---|---|
| ID | `ingredient-ref-malted-wheat-flakes` (allocated on 2026-10-12) |
| English display | `malted wheat flakes` |
| Québec French display | `flocons de blé malté` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | None |
| Recipe links | None; no candidate phrase occurs in the bundled recipe corpus |
| Forms, density, unit mappings, measurements, conversions, yields, substitutions | None |

This row denotes the food ingredient sold or declared as malted wheat flakes. Keep it separate from plain wheat flakes (`ingredient-ref-wheat-flakes`), malted wheat flour (`ingredient-ref-malted-wheat-flour`), generic malt flour, malt extract, malted barley flour, roasted wheat malt flour, wheat berries, and composite breakfast cereals or breads. Do not claim one universal malting, flaking, toasting, or gelatinization process: current product makers describe different processing and use contexts. The identity should preserve the named product boundary without importing a supplier specification.

The historical Canadian cereal specification uses the French form `flocons de blé maltés`, but its Class C formula specifies whole wheat plus malted barley. That is useful as historical evidence that the breakfast-cereal vocabulary distinguished the malted class from plain wheat flakes; it is not proof that this phrase is an exact synonym for today's malted-wheat ingredient. Keep the older plural phrase out of aliases until an independent current Canadian label supports it.

## Pre-integration exact active, form, legacy, and ledger ownership

At proposal review, the audit used the repository's `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` (case-folding, accent and ligature folding, and punctuation normalization). It compared complete normalized terms against active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. This pre-integration snapshot was rechecked against the live references, forms, and legacy candidates before insertion; no other exact owner was found.

| Normalized phrase | Active reference owner | Form owner | Legacy owner | Ledger state |
|---|---|---|---|---|
| `malted wheat flakes`, `malted wheat flake`, `flocons de blé malté`, `flocons de blé maltés` | None | None | None | No candidate or active identity record for malted wheat flakes |
| `wheat flakes`, `flocons de blé` | `ingredient-ref-wheat-flakes` (`GRAIN_AND_CEREAL`) | None | None | Verified plain-flakes identity; its source register includes the withdrawn CGSB product-class boundary |
| `malted wheat flour`, `farine de blé maltée` | `ingredient-ref-malted-wheat-flour` (`FLOUR_AND_STARCH`) | None | None | Verified flour identity; measurement and substitution research remain open |
| `malt flour`, `malted cereal flour` | `ingredient-ref-malt-flour` (`FLOUR_AND_STARCH`) | None | None | Verified generic flour identity; distinct from cereal-specific malted flour and flakes |

There are no forms attached to `ingredient-ref-wheat-flakes`, and no exact candidate phrase is assigned to any of the 94 current forms. None of the 66 legacy candidates owns a candidate phrase. The ledger has no `candidate-malted-wheat-flakes` or `ingredient-ref-malted-wheat-flakes` record. Its `ingredient-ref-wheat-flakes` record cites CGSB GCS 32.13-88 as historical boundary evidence and explicitly keeps malted flakes separate; that is not ownership of the candidate identity. The existing `ingredient-ref-malted-wheat-flour` ledger record is a separate milling product.

## Picker phrase boundary

The picker indexes display names and aliases and accepts a complete query phrase contained within a longer indexed phrase. With the proposed display and no aliases:

- `malted wheat flakes` should identify the proposed row; accent-folded `flocons de ble malte` should do the same.
- `wheat flakes` / `flocons de blé` will match both plain and malted wheat flakes because each phrase is contained in the proposed full name. The two display names retain the distinguishing qualifier.
- `malted wheat` will match both malted wheat flour and malted wheat flakes. Do not assign bare `malted wheat` to either row.
- Do not add `flaked wheat`, `wheat malt flakes`, `malted wheat cereal`, generic `flakes`, or the historical standard's `flocons de blé maltés` as aliases without further current product evidence.

This is a source and search-model audit, not a live picker test. The phrase overlap is intentional and visible in the full result names; no broader synonym is proposed.

## Recipe-corpus demand audit

All 114 manifest-listed recipe JSON files were scanned after normalization, including full serialized recipe text and every ingredient row. The scan covered `malted wheat flakes`, its singular and word-order variants, `flocons de blé malté(s)`, and nearby wheat-flake and malted-wheat phrases.

| Candidate/boundary phrase set | Full recipe files with phrase hit | Ingredient rows with phrase hit |
|---|---:|---:|
| Malted wheat flakes and French variants | 0 / 114 | 0 / 1,123 |
| Plain wheat flakes / `flocons de blé` | 0 / 114 | 0 / 1,123 |
| Malted wheat flour / `farine de blé maltée` | 0 / 114 | 0 / 1,123 |

No recipe link is recommended. The identity case rests on a distinct product class and market labels, not existing bundled demand.

## English and Québec French evidence; limits

Current English product evidence distinguishes malted wheat flakes from plain wheat flakes. Muntons describes its product as lightly toasted and pre-gelatinized flakes for brewing; GoodMills identifies a single-ingredient, whole-meal-wheat product made with a special malting process for bread and rolls. A Canadian Metro ingredient declaration also names `MALTED WHEAT FLAKES` in a Canadian-made bread. These support the product name and food-ingredient scope but do not establish a single technical specification.

The current French Metro listing for that Canadian bread gives the ingredient as **`flocons de blé malté`**. This is current Québec-facing retail-label wording, not an OQLF terminology decision or a standalone package for the flake ingredient. The Government of Québec allergen guide recognizes wheat, cereal products, and bread/baked goods but does not define this exact phrase. No direct OQLF entry for malted wheat flakes was found in the bounded search. The official CGSB standard supplies historical bilingual `flocons de blé maltés` terminology only; its Class C formula and withdrawn status prevent using it as a current identity or specification source.

The display recommendation follows the current Canadian French ingredient declaration. No alternative French alias is activated because the historical plural form may refer to the older wheat-plus-malted-barley breakfast cereal product. A later Québec terminology review can revise this display if an OQLF or current standalone product label becomes available.

## Numeric, form, and substitution limits

- Muntons lists a **2–12%** brewing inclusion range by desired mouthfeel. This is a product-specific brewing guideline, not a kitchen amount, recipe-line substitution, or universal composition rule.
- GoodMills says its product may replace **10–50%** of cereal products in bakery use. This is supplier formulation guidance for its product and application; do not turn it into a reusable substitution ratio.
- The withdrawn CGSB specification's sieve limit is not current product behavior and must not become a size, measurement, or conversion rule.
- None of the sources gives a home-kitchen serving mass, cup mass, volume conversion, bulk density, cooking yield, or supported form-conversion rule. Leave these unknown.
- Keep plain wheat flakes, brewing adjuncts, flours, and malt extracts as separate identities. No form, contextual substitution, global conversion, or recipe-line substitution is supported.

## Proposal-local source register

The source IDs below were checked absent from the shared ledger on 2026-10-12. Sources were reviewed on that date.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-MWFLAKE-20261012-S01` | Muntons, [Malted Wheat Flakes](https://www.muntons.com/brewing_distilling/malted-wheat-flakes/), product description and applications. | Current maltster page explicitly names malted wheat flakes, describes light toasting and pre-gelatinization, and scopes the product to brewing. Its 2–12% application range is product-specific, not a general recipe ratio or measurement. The page does not establish a Québec French name. |
| `WP03-MWFLAKE-20261012-S02` | GoodMills Innovation, [Slow Milling Weizenmalz-Flocken](https://www.goodmillsinnovation.com/en/products/slow-milling-weizenmalz-flocken/), product description. | Current manufacturer describes malted wheat flakes as a single-ingredient, 100% whole-meal-wheat product for bread and rolls. Its 10–50% replacement guidance is limited to the supplier's bakery application; it is not a general substitution. No Québec name is supplied. |
| `WP03-MWFLAKE-20261012-S03` | Metro Canada, [Country Harvest Stone Milled Bread with Roasted and Malt Wheat](https://www.metro.ca/en/online-grocery/aisles/bread-bakery-products/packaged-bread/whole-wheat-grain/stone-milled-bread-with-roasted-and-malt-wheat/p/063400138780), ingredients and product origin. | Current Canadian retail ingredient declaration lists `MALTED WHEAT FLAKES` in a Canadian-made composite bread. This corroborates Canadian food use and English naming, but is not a standalone flake specification or full recipe formula. |
| `WP03-MWFLAKE-20261012-S04` | Metro Canada, [Pain moulu à la meule de pierre avec blé rôti et malt](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-emballes/ble-entier-et-cereales/pain-moulu-a-la-meule-de-pierre-avec-ble-roti-et-malt/p/063400138780), French ingredients. | Current Canadian French product page lists `flocons de blé malté`. This supports the proposed Québec French display as label usage, not as a terminology authority or standalone ingredient package. The English and French pages are the same product, not independent sources. |
| `WP03-MWFLAKE-20261012-S05` | Metro Canada, [Pain de grains entiers tranché aux 12 céréales Dempster's](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-emballes/ble-entier-et-cereales/pain-de-grains-entiers-tranche-aux-12-cereales/p/068721722342), French ingredients. | A second current Canadian label uses `flocons de blé malté` as one element in a multigrain bread. It corroborates local phrase use but is a composite product, not a standalone flake specification. |
| `WP03-MWFLAKE-20261012-S06` | Canadian General Standards Board, [Cereals, breakfast, prepared, ready-to-eat / Céréales à déjeuner, préparées et prêtes-à-servir, GCS 32.13-88](https://publications.gc.ca/site/eng/9.841373/publication.html), archived [standard PDF](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-013-1988.pdf), §5.1.2–5.1.4. | Historical official bilingual vocabulary separates plain wheat flakes, malted wheat flakes (`flocons de blé maltés`), and bran flakes. The standard was withdrawn in April 2020. Its Class C recipe specifies whole wheat and malted barley; use this only for historical category distinction, not current identity, exact synonym, or product specifications. |
| `WP03-MWFLAKE-20261012-S07` | Gouvernement du Québec, [Allergènes et leurs différentes appellations](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations), section “Gluten.” | Confirms the Québec guide places wheat among gluten sources and bread/baked goods among relevant product classes. It does not name or define malted wheat flakes. |

## Integrated decision

**Integrated as one identity-only `GRAIN_AND_CEREAL` row: `malted wheat flakes / flocons de blé malté`.** No aliases, recipe links, forms, measurements, density, unit mappings, conversions, yields, or active substitutions were added. The Québec French display is supported by current retail-label usage rather than a terminology ruling; manufacturing and application details remain product-specific. Section F remains open.

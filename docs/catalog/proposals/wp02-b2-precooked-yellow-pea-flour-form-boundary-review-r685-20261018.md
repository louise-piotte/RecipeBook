# WP02 B2 — precooked yellow pea flour form boundary review (R685)

- **Reviewed:** 2026-10-18.
- **Disposition:** Hold a `precooked yellow pea flour` form outside active data pending a product-matched Canadian or Québec-facing listing. Keep the existing yellow-pea-flour reference unchanged.
- **Plan anchor:** The open B2 flour review names pea flour within the alternative-flour family ([plan, line 2795](../../RecipeBook-global-ingredient-catalog-plan.txt#L2795)). The completed R306 item covers measurement and substitution for the existing yellow-pea-flour identity ([line 2832](../../RecipeBook-global-ingredient-catalog-plan.txt#L2832)), not this form boundary.
- **Candidate form ID, unreserved:** `ingredient-form-yellow-pea-flour-precooked` under `ingredient-ref-yellow-pea-flour`.
- **Proposal source-ID prefix:** `WP02-B2-PRECOOKED-YELLOW-PEA-FLOUR-FORM-R685-20261018` (checked free in the current ledger and proposal/batch archive).

## Decision

Current manufacturer sources establish a commercial `precooked yellow pea flour` product class, separate in processing from ordinary flour. They do not establish a Canadian retail product or a Québec product label for that flour. A current Canadian certification listing names `precooked split yellow pea powder` from a Saskatoon processor, but the listing uses **powder**, specifies **split** peas, and is not a product specification. It does not establish that this is the same product as the source-named flour.

Keep the candidate outside active forms and the research ledger until a Canadian source matches the flour product and a Québec-facing source supports its French wording. A possible descriptive fr-CA label, only if later accepted, is `farine de pois jaune précuite`; this combines the existing Québec-facing base name with a French processing adjective, but no reviewed Québec source uses that full product name. Do not present it as an OQLF term.

This is a distinct form review, not a repeat of R306. R306 records a serving for the existing unqualified flour and reviews fixed recipes and studies; it does not decide whether a source-named precooked product should be exposed as a form. The earlier chickpea and fava `precooked` forms are useful schema precedents, but do not establish this product's local availability or French label.

## Product and naming boundary

| Phrase or product | Disposition | Evidence boundary |
|---|---|---|
| `yellow pea flour / farine de pois jaune` | Keep on `ingredient-ref-yellow-pea-flour`. | Health Canada and the current Québec-facing manufacturer listing support the existing base name. The active reference is color-qualified and has no aliases. |
| `precooked yellow pea flour` | Keep as an unallocated form candidate. | Armada lists a named precooked yellow-pea-flour SKU and describes its precooked pulse flours as hydrothermally treated. Ebro's French-language manufacturer page separately lists precooked pulse flours and includes yellow-pea flour in its product range. Neither source is Québec-facing. [S01–S02] |
| `farine de pois jaune précuite` | Descriptive candidate label only; do not activate yet. | The base phrase `farine de pois jaune` has Québec-facing support; the complete precooked compound does not. Ebro uses French precooked-flour wording for the wider product family, outside Québec. [S02, existing source IDs WP02-B23-FLOUR-RESIDUAL-20261010-S02 and WP02-B23-FLOUR-RESIDUAL-20261010-S05-FR] |
| `precooked split yellow pea powder` | Keep distinct and unassigned to this form. | OCIA's current certified-operator list names this product for InfraReady Products in Saskatoon. “Powder” and “split” do not prove equivalence to Armada's flour product. The list is certification-scope evidence, not a recipe ingredient specification. [existing source ID WP02-A6-QAM-FLOUR-20261011-S10] |
| `roasted yellow split-pea flour` | Keep separate. | The R306 study tests raw and roasted split-pea flours in specified breads. Roasting in that study does not mean the manufacturer's `precooked` product. Reuse R306 source ID `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S05`. |
| `pregelatinized yellow pea flour`, pea starch, or pea protein | Do not alias or merge. | These phrases describe a different processing claim or a different extracted ingredient. Neither source wording nor shared applications establishes identity or recipe interchangeability. |

## Current owners and audit snapshot

| Surface | Finding |
|---|---|
| Active references | 1,838. `ingredient-ref-yellow-pea-flour` is `yellow pea flour / farine de pois jaune`, category `FLOUR_AND_STARCH`, aliases empty, `defaultDensity: null`, and `unitMappings: []`. |
| Active forms | 169. No form is attached to the yellow-pea-flour reference; no active form owns either proposed full phrase. |
| Legacy identities | 56 candidates. No exact owner for the candidate form ID or display phrases. |
| Research ledger | 2,216 records. `ingredient-ref-yellow-pea-flour` is the verified parent record; its existing R306 portion observation and no-supported-general-substitute finding remain scoped to the unqualified flour. No precooked form record exists. |
| Proposal and batch archive | R306 is the only focused yellow-pea-flour measurement/substitution review and includes precooked flour only in fixed-formula evidence. No focused precooked-yellow-pea-flour form boundary decision or R685 record exists. |
| Candidate and source ownership | `ingredient-form-yellow-pea-flour-precooked` and the R685 prefix are unused. Armada, Ebro, and Pot Étiques URLs below are not registered in the ledger. Reuse the existing OCIA, R306, Health Canada, and Cuisine Soleil source IDs shown above rather than allocating duplicate owners. |

The live Québec retailer Pot Étiques lists Le Pré Rieur's ordinary yellow-pea flour under `Farine de pois jaunes`, with Québec provenance and ingredient `Pois jaune biologique`. That supports the base phrase and a local ordinary-flour product; it does not label the product precooked. [S03]

## Picker effect

The current search normalizer folds accents, looks for complete word phrases first, and uses substring matching only if no phrase match exists. A form is surfaced as a form hint only for a complete form-label or match-term query.

| Query | Current result | If the candidate form were later added |
|---|---|---|
| `precooked yellow pea flour` | No result. | `ingredient-ref-yellow-pea-flour`, with the `precooked` form hint. |
| `farine de pois jaune précuite` | No result. | `ingredient-ref-yellow-pea-flour`, with the `precooked` form hint; the accent-folded query behaves the same. |
| `yellow pea flour`; `farine de pois jaune`; `pea flour` | `ingredient-ref-yellow-pea-flour`. | Same reference results; base-name searches do not select the form hint. |
| `yellow split pea` | `ingredient-ref-yellow-split-peas`. | Unchanged; no pulse-form alias is proposed. |
| `precooked` | Chickpea flour, fava bean flour, precooked corn flour, and precooked fonio. | Adds the yellow-pea-flour reference as a fifth result. |
| `précuite` | Chickpea flour, fava bean flour, and precooked corn flour. | Adds the yellow-pea-flour reference as a fourth result. |

These are static projections from the current reference and form terms plus the candidate label. No app picker was run. Under the recommendation, both exact candidate phrases remain without a result.

## Measurements, substitutions, and recipe demand

Do not add density, unit mappings, a form-specific measure, conversion, yield, or substitution. R306's `¼ cup (30 g)` Cuisine Soleil observation belongs to the unqualified manufacturer flour; it is not a precooked-product measure. Armada's bulk-sack information is packaging, not a kitchen measure. No source reviewed supplies a household volume-to-mass value for the precooked product.

R306 already concluded that the reviewed yellow-pea-flour evidence does not support a reusable direct substitute. Its pulse-industry source includes fixed formulas using precooked yellow pea flour, but those percentages are tied to named bread formulations and do not establish a stand-alone replacement rule. No rule, replacements, or recipe link is proposed for this form. [reused source ID WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S03]

The manifest-ordered bundle scan covered **114 recipe files and 1,123 ingredient rows**. It found no candidate phrase in recipe text or ingredient rows and no ingredient links to `ingredient-ref-yellow-pea-flour`. Recipe 105 contains dried yellow peas linked to `ingredient-ref-yellow-peas` and its whole-dried form; it does not request flour. No recipe link, measure, or substitution is supported. Corpus fingerprint: `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362` (manifest path, NUL, file bytes, NUL in manifest order).

## Sources

Sources were checked online on 2026-10-18. New S01–S03 IDs below are proposal-local only; no source record or catalog data is added by this hold.

| Source ID | Source and evidence | Limit |
|---|---|---|
| **S01 — new, proposal-local** `WP02-B2-PRECOOKED-YELLOW-PEA-FLOUR-FORM-R685-20261018-S01` | Armada Ingredients, [Precooked Pulse Flours](https://armadaingredients.com/products/precooked-pulse-flours). Current manufacturer page lists `Precooked Yellow Pea Flour` (SKU AG-PC-YPF), describes precooked pulse flour as hydrothermally treated and already cooked, and offers bulk and 25 kg formats. | B2B supplier outside Canada. Direct page extraction returned no readable lines in this review; the current indexed page text supports only the named product and stated processing description. Bulk packaging is not a household measure. |
| **S02 — new, proposal-local** `WP02-B2-PRECOOKED-YELLOW-PEA-FLOUR-FORM-R685-20261018-S02` | Ebro Ingredients, [Farines précuites de fèves, lentilles, pois et pois chiches](https://www.ebroingredients.com/fr/ingredients/ingredients-a-base-de-legumineuses/farines-precuites-de-feves-lentilles-pois-et-pois-chiches/), current French-language manufacturer page. It identifies a family of precooked pulse flours and lists `farine de pois jaunes`. | Supports French product-family wording outside Québec; it does not provide a Québec label or a standalone package specification. The full proposed compound is descriptive, not copied as an exact Québec label. |
| **S03 — new, proposal-local** `WP02-B2-PRECOOKED-YELLOW-PEA-FLOUR-FORM-R685-20261018-S03` | Pot Étiques, [Farine de pois jaunes biologiques QC](https://potetique.com/boutique/product/farine-de-pois-jaunes-biologiques-qc/), current Québec retailer listing for Le Pré Rieur, including Québec provenance, French product wording, and the yellow-pea ingredient. | Local evidence for ordinary yellow-pea flour only; the listing does not state that it is precooked. |
| **Reused** `WP02-A6-QAM-FLOUR-20261011-S10` | OCIA, [2026 certified operations list](https://ocia.org/wp-content/uploads/2026/04/cor_certified_operations.pdf). The indexed list identifies InfraReady Products (Saskatoon, Saskatchewan) and includes `Precooked Split Yellow Pea Powder`. | Canadian product-scope evidence for powder, not an exact precooked-flour label; direct PDF retrieval was unavailable in this review. This URL and source ID are already registered in the ledger for other listed product rows. |
| **Reused** `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S03` | USA Dry Pea & Lentil Council, [Baking Guide for Pulse Ingredients](https://usapulses.org/wp-content/uploads/2025/10/USA-Pulse-Flour-Brochure.pdf), formula tables reviewed in R306. | Source ID and URL are already owned by the yellow-pea-flour ledger record. The guide supports only fixed bakery formulas, not a general substitution or product availability in Canada. |
| **Reused** `WP02-B23-FLOUR-RESIDUAL-20261010-S01`, `...-S02`, `...-S05-FR` | Health Canada’s current bilingual [non-novel determinations](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html) and Cuisine Soleil / Moulin A. Coutu, [Farine de pois jaune](https://cuisinesoleil.com/produit/farine-de-pois-jaune/). | Already registered on the parent ledger record; they support the base flour term and identity, not the precooked form. |

No software tests were run. This is a proposal-only review; shared catalog, forms, ledger, plan, workflow, roadmap, recipes, and generated files were not changed.

# WP02 A6 Regional Flour Follow-up: Rajgira Flour Naming — 2026-10-12

## Review record

- **Reviewed and sources accessed:** 2026-10-12.
- **Status:** Proposal only. This review changed no canonical catalog, forms, legacy, ledger, recipe, generated, checklist, or roadmap files.
- **Scope:** One English naming extension for the existing generic amaranth-flour identity in the still-open WP02 A6 regional-flour review. The candidate is **`rajgira flour`**, with the closely qualified retail variant **`rajgira atta`**. This is not a new ingredient identity.
- **Plan context:** The project plan leaves A6 open for continued review of regional grain flours ([WP02 A6 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1241)).
- **Proposal-local source IDs:** `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S01` through `S08`; none was present in the research ledger when checked. Existing ledger source `WP02-S28` was rechecked and reused for Québec terminology.
- **A6 status:** Keep the broad A6 review open. This proposal does not reopen or change other covered flour identities.

## Recommendation

Add the English aliases **`rajgira flour`** and **`rajgira atta`** to the existing `ingredient-ref-amaranth-flour` row. Keep its display pair `amaranth flour / farine d'amarante`, category `FLOUR_AND_STARCH`, and numeric fields unchanged. Do not add a new Rajgira reference or a French Rajgira alias.

This narrowly reopens the earlier Rajgira hold because new Canadian retailer pages now use the flour-qualified terms and directly identify the product as amaranth flour or flour made from amaranth grains [S01–S04]. The 2026-10-11 review held bare `rajgira` because it had not found a Canadian or Québec flour label establishing that relationship [prior review, §Amaranth]. That hold remains for the bare word and for a grain alias: the new sources establish flour wording, not an unqualified grain-name mapping.

| Candidate or field | Disposition | Evidence boundary |
|---|---|---|
| `rajgira flour` | **Accept as `aliasesEn`** on `ingredient-ref-amaranth-flour`. | Exact flour-qualified wording appears on independent Canadian retail pages and is explicitly paired with amaranth flour/grain [S01–S03]. |
| `rajgira atta` | **Accept as `aliasesEn`** on the same row. | A Canadian product page uses the exact phrase and explains it as flour made from amaranth seeds; another current Canadian listing pairs Rajgira Atta with Amaranth Flour [S03–S04]. This does not make bare `atta` a synonym. |
| French display | **Retain** `farine d'amarante`; keep `aliasesFr: []`. | OQLF prefers `amarante` and notes its seeds can be reduced to flour; a Québec product listing uses `farine d'amarante`. No reviewed Québec French source uses `rajgira` as a French flour term [WP02-S28; S06]. |
| Bare `rajgira` / `rajgira` grain alias | **Hold.** | The new evidence is about qualified flour products. Do not attach the bare term to either the flour or intact-grain row on this evidence alone. |
| `farine de rajgira` | **Hold.** | No Québec French product label or Québec terminology source reviewed here supports this French phrase. |
| New ingredient ID, forms, recipes, numeric behavior | **Do not add.** | The present evidence supports names only; bundled recipe demand is zero, and the mass/density and baking evidence does not support transferable catalog behavior. |

## Previous decision and new evidence

The prior amaranth-flour review retained generic `amaranth flour / farine d'amarante` and explicitly withheld `rajgira` because OQLF did not identify it as Québec French and the Canadian/Québec flour labels then reviewed did not establish it as a flour name [prior review, §Amaranth]. The present packet preserves that prior boundary for bare `rajgira` and French naming. It reopens only the flour-qualified English search terms because current Canadian listings now title products `Rajgira Flour`, `Rajgira Flour (Amaranth)`, and `Rajgira Atta/Amaranth Flour`, with descriptions that link the named flour to amaranth [S01–S04].

The product pages do not identify a single amaranth species or a standardized extraction level. Keep the generic flour identity generic; do not infer a species, whole-grain status, grind, organic status, gluten-free claim, or producer-specific process as part of either alias.

## Current catalog, ledger, and collision audit

Snapshot read from the shared working tree on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, the exact recipe-file bytes, and a final NUL byte.

| Store | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,288 rows | `d20bc95f97b8d78ee6709655f3321ff000925c135862fd15cbc52e7d85e473ad` |
| Ingredient forms | 98 rows | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,596 records; 5,718 source entries; 4,743 distinct source IDs; 8 unit conversions | `91c80a5c5fc283dbdea2b1e6bda350f0eb1caf08ca8e4a596bd0a99cd5e9ceb1` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The active row is `ingredient-ref-amaranth-flour` (`amaranth flour / farine d'amarante`), `FLOUR_AND_STARCH`, with empty alias arrays, `defaultDensity: null`, and `unitMappings: []`. It has no forms. Its ledger record is `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; the record already cites the accepted Québec spelling and the OQLF spelling boundary [WP02-S26, WP02-S28, WP02-S30].

Exact normalized-key ownership was checked across active reference names and aliases, form display/match terms, legacy candidate names and aliases, and ledger record IDs, using the repository search normalization (case and accents folded, punctuation converted to spaces, repeated whitespace collapsed):

| Exact key | Active reference owner | Form owner | Legacy owner | Ledger record-ID owner |
|---|---|---|---|---|
| `rajgira flour` | none | none | none | none |
| `rajgira atta` | none | none | none | none |
| `rajgira` | none | none | none | none |
| `farine de rajgira` | none | none | none | none |
| `amaranth flour` | `ingredient-ref-amaranth-flour` | none | none | none |
| `farine d'amarante` | `ingredient-ref-amaranth-flour` | none | none | none |

There is no exact Rajgira flour/atta legacy candidate, form, or ledger record ID. `rajgira` appears in the prior 2026-10-11 proposal as a held bare alias, not as an active catalog key. The proposal-local source prefix above was absent from the ledger. No new ingredient ID is proposed.

### Search behavior

`IngredientSearch.kt` normalizes the query and terms, prefers complete normalized word phrases contained in catalog terms, then falls back to partial substring matches. With the two proposed aliases:

- `rajgira flour` and `rajgira atta` each select only `ingredient-ref-amaranth-flour` under the current catalog terms.
- A shorter query `rajgira` also surfaces the flour row because it is a word phrase inside each alias. This behavior is not evidence for activating bare `rajgira` as an alias or assigning it to the grain row.
- A short query `atta` is less specific: it currently matches the general atta row, buckwheat flour, and finger-millet flour. With `rajgira atta`, it will also surface the amaranth-flour row. Use the qualified phrase for exact selection.
- `amaranth flour` already matches both generic and sprouted amaranth flour under phrase containment; the proposal does not change that result. The broader `amaranth` query also remains broad across product/plant-part references.

## Bundled recipe demand

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned with the repository's normalized search key across recipe text and ingredient-row fields. The scan covered `rajgira flour`, `rajgira atta`, bare `rajgira`, `amaranth flour`, `farine d'amarante`, and `amarante`.

- Recipe files with a candidate phrase: **0**.
- Ingredient rows with a candidate phrase: **0**.
- Direct ingredient links to `ingredient-ref-amaranth-flour`: **0**.

The alias proposal is supported by current retail naming, not by a recipe in the bundled corpus. No recipe link, ingredient row, amount, or instruction is proposed.

## Measurement, density, and substitution evidence

The Canadian `Rajgira Flour` listings show package weights such as 400 g; a current Canadian generic amaranth-flour listing shows 454 g. These are package masses, not household volume measures [S02–S03, S08]. No reviewed Rajgira product page supplies cups-per-mass or another recipe measure.

A peer-reviewed study of amaranth-flour fractions with different particle sizes reports bulk-density values spanning 0.35–0.76 g/mL and statistically significant differences among the tested fractions [S07]. These are sample- and method-specific laboratory observations, not a household cup conversion or a transferable default for the unspecified commercial Rajgira flour products. Keep `defaultDensity: null` and `unitMappings: []`; for future ledger integration, set `measurementState` to `researched_no_supported_value` and preserve the measured range only as research evidence, not runtime data.

One Canadian retailer's generic amaranth-flour page gives a 1:3 replacement instruction for amaranth and wheat/other grain flours and advises against yeast-required recipes [S08]. Its wording is product-specific and does not establish a directionally clear, generally valid substitution rule. The study in S07 examines defined amaranth particle fractions at controlled wheat-flour replacement levels for bread; its findings are not a universal home-baking ratio. Add no global or contextual substitution, form conversion, yield, or recipe-line substitution. For future ledger integration, `substitutionResearchState` can move to `researched_no_supported_substitute`; do not encode the retailer advice as a rule.

## Proposed integration delta

If this proposal is accepted for integration:

1. Append only `rajgira flour` and `rajgira atta` to `aliasesEn` on existing `ingredient-ref-amaranth-flour`.
2. Keep `nameEn`, `nameFr`, `aliasesFr`, category, `defaultDensity`, and `unitMappings` unchanged. Add no separate Rajgira reference, form, legacy identity, or recipe link.
3. Append sources S01–S08 and one accepted alias decision to the existing `ingredient-ref-amaranth-flour` ledger record, reusing its existing OQLF source `WP02-S28`. Record the new measurement and substitution research states above while keeping numeric catalog fields empty.
4. Preserve the prior hold on bare `rajgira` and `farine de rajgira`; do not add `rajgira` to the amaranth-grain row or add `rajgira millet`.
5. Leave WP02 A6 open.

No tests or emulator checks were run: this is proposal-only and changed no catalog data.

## Sources

All new web sources below were checked on 2026-10-12. Proposal-local source IDs are not ledger entries.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S01** | East India Pantry, [Rajgira Flour (Amaranth)](https://www.eastindiapantry.ca/products/amaranth-flour). Current Canadian retail page title pairs `Rajgira Flour` with `Amaranth`; its description says the flour is stone-ground from amaranth grains. | Retailer product description, not a standardized milling or species specification. At access, the store stated pickup only and no shipping option. |
| **WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S02** | Swadesh Supermarket, [Rajgira Flour 400g](https://www.swadesh.ca/products/rajgira-flour-400g). Current listing title uses the exact phrase; the product page describes it as finely milled amaranth flour and showed it in stock. | Retailer description; 400 g is package mass, not a volume mapping or recipe amount. |
| **WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S03** | Tezmart, Mississauga, [Asian Rajgira Flour Atta](https://tezmart.ca/product/asian-rajgira-flour-atta-112275). Current Canadian page says “Rajgira atta” is its word for flour and identifies the source as amaranth seeds; package weight is 400 g. | Retailer listing, not a grain-species or flour-composition standard. The package mass is not a household measure. |
| **WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S04** | Neelam Foodland Canada, [Rajgira Atta/Amaranth Flour 250 Gm](https://neelamfoodlandca.com/products/rajgira-atta-amaranth-flour-250-gm). Current Canadian listing title pairs the exact regional phrase with `Amaranth Flour`. | The page showed the item sold out at access. Product title supports wording only; no measurement or baking behavior is inferred. |
| **WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S05** | Food Safety and Standards Authority of India, [Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §2.4.23, PDF p. 18. Lists `Amaranthus (Chaulai or Rajgira)` and names *A. caudatus*, *A. cruentus*, and *A. hypochondriacus* under its whole/dehulled-millet standard. | Corroborates the regional name's amaranth context and its multi-species scope. It is an Indian grain standard, not a Canadian flour definition or a basis for a species-specific catalog row. |
| Existing source `WP02-S28` | Office québécois de la langue française, [amarante, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), checked again on 2026-10-12. OQLF prefers `amarante` and notes that its small seeds can be reduced to flour. | Supports the retained Québec French display `farine d'amarante`; it does not list Rajgira as a Québec French product term. |
| **WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S06** | Aliments du Québec / Pure Gaspésie, [Farine d'amarante biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-damarante-biologique). Current Québec product listing uses the French amarante flour name. | Product naming supports the existing display only; it does not establish a French Rajgira synonym. |
| **WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S07** | Ionica Coțovanu and Silvia Mironeasa, [“Impact of Different Amaranth Particle Sizes Addition Level on Wheat Flour Dough Rheology and Bread Features”](https://www.mdpi.com/2304-8158/10/7/1539), *Foods* 10(7), 1539 (2021). Reports amaranth-flour bulk-density values of 0.35–0.76 g/mL across tested particle-size fractions, with significant differences. | Laboratory flour fractions and protocol; does not give a household measure, Canadian product density, or universal substitution ratio. The study's controlled bread replacement trials do not define a general recipe rule. |
| **WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S08** | Ambrosia, [Organic Amaranth Flour](https://canada.ambrosia.ca/products/organicamaranth-flour). Current Canadian listing gives a 454 g package and product-specific preparation and replacement advice. | Generic amaranth flour, not a Rajgira-specific bag. The retailer's 1:3 wording is not sufficiently clear or generalizable to encode as a substitute or measure. |

**Existing ledger sources:** `WP02-S26` (SATAU bilingual product portfolio), `WP02-S28` (OQLF `amarante`), and `WP02-S30` (OQLF `amaranthe`) remain the existing evidence for the accepted amaranth-flour row and its spelling boundary. This review does not replace or weaken those decisions.

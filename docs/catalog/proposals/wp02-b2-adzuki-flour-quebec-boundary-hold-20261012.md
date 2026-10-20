# WP02 B2 adzuki flour — Québec naming and picker-boundary hold

- **Reviewed:** 2026-10-12.
- **Status:** Documentation hold recorded on 2026-10-12. The plan, roadmap, and hold README record the decision; no catalog or ledger data changed and no tests were needed for this documentation-only hold.
- **Scope:** Whether to add a distinct flour identity for food flour made from *Vigna angularis* seeds. This does not reopen the active whole-azuki-bean identity, its dried form, or the prepared anko recipe.
- **Source-ID prefix:** `WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012`; S01–S08 were checked against the live ledger and proposal corpus. No collision was found.

## Recommendation

**Hold catalog integration.** Manufacturer and primary-study sources establish adzuki flour as a real food ingredient, but they describe different starting materials and treatments: red or green unhusked beans milled by stone, roasted-bean flour, and flour used in study-specific biscuit formulations. These sources do not establish one Canadian consumer-product scope. The Canadian French evidence currently supports the whole food seed as `haricot adzuki` and `haricots rouges « adzuki » séchés`; it does not provide a Québec flour label or an authoritative flour term. [S01, S04–S07]

There is also a concrete picker boundary to resolve. The current query `adzuki bean` falls back to the active whole-bean row because its display is `adzuki beans`. Adding a flour search term `adzuki bean flour` would create a complete-phrase match for `adzuki bean`, and the search index returns complete-phrase matches before partial matches. That would replace the current whole-bean result with the flour result for a singular query. A French flour phrase built from `farine de haricot adzuki` would also make the existing `haricot adzuki` query return both rows. Do not make a new row or alias until the French name and these query outcomes are settled. [S01; live picker audit below]

This is a hold on catalog promotion, not a rejection of adzuki flour as a food product. Do not reserve an ingredient-reference ID or ledger candidate ID in this proposal.

## Candidate boundary and phrase disposition

If later promoted, the narrow candidate would be a food flour explicitly made by milling edible *Vigna angularis* seed. The available product evidence does not support merging that flour into the whole-pulse row: milling creates a flour product and belongs under `FLOUR_AND_STARCH`, not as a dried-bean form under `LEGUME_AND_PULSE`.

| Phrase or product | Disposition | Evidence boundary |
|---|---|---|
| `adzuki bean flour` / `azuki bean flour` | Keep unassigned for now. | Manufacturer and research sources use these English product descriptions, but there is no verified Canadian package or Québec French flour name. `adzuki bean flour` also conflicts with the whole-bean singular picker query. [S02–S04] |
| `red azuki bean flour` | Keep unassigned. | A manufacturer catalog names a red-seed flour and describes it as stone-milled from unhusked red azuki beans. That is one source-defined product, not evidence that all adzuki flour is red, unroasted, or milled with the seed coat. [S02] |
| `green azuki bean flour` | Keep separate and unresolved. | The same catalog names a green product, but gives no botanical or cultivar details that would settle whether this is comparable to the red product or to other green-gram flour products. Do not generalize the phrase to mung flour. [S02] |
| `roasted adzuki flour`, `steamed adzuki flour`, seed-coat powder, or adzuki “powder” | Do not alias to a generic flour identity. | Research sources describe roasted flour and processed powders; the seed-coat powder study concerns a separated fraction. Treatment and material fraction must remain explicit. [S03–S04] |
| `farine de haricot adzuki`, `farine d’adzuki`, `farine d’azuki` | Do not add. | These are plausible French renderings, not a Québec product label or a flour term established by the OQLF entry. The verified Québec term `haricot adzuki` names the seed, not its flour. [S01] |
| `red bean flour`, `sweet red bean flour`, `anko`, `adzuki paste`, or `adzuki starch` | Keep separate or unassigned. | `Red bean` is broader than *Vigna angularis*; anko is a prepared sweet paste, and no reviewed source establishes an adzuki starch product. Recipe 004 uses whole dried beans to make anko and does not call for flour. [S05, S08] |

No flour form is proposed. Red/green, roasted/unroasted, whole-seed/seed-coat, and steamed treatments are source or process distinctions; the reviewed evidence does not establish a shared form taxonomy for a Canadian catalog row.

## Proposal-time ownership and picker audit

The pre-integration snapshot below uses the app’s current search-key normalization: lowercase, Unicode NFKD and accent folding, explicit `œ`/`æ`/`ß` and ampersand folding, punctuation-to-space conversion, and whitespace collapse. It was captured before the later einkorn-berries and cusk additions. It checks active displays and aliases, form labels and match terms, and legacy candidate names and aliases. See the [hold README](../batches/wp02-b2-adzuki-flour-quebec-hold-20261012/README.md) for the current shared snapshot.

| Surface | Proposal-time snapshot | Exact adzuki-flour ownership |
|---|---:|---|
| Active ingredient references | 1,258; SHA-256 `fe5119d6027e9916aec60272233b4ce2f92f5e0efc26e769e720ef81689ac085` | None for `adzuki flour`, `adzuki bean flour`, `azuki flour`, `azuki bean flour`, `red/green adzuki bean flour`, `farine de haricot adzuki`, `farine d’adzuki`, or `farine d’azuki`. |
| Ingredient forms | 94; SHA-256 `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` | None for a flour phrase. `ingredient-form-azuki-beans-dried` owns `dried adzuki beans` and its dried-bean match terms. |
| Legacy import identities | 66; SHA-256 `bedef9b12dca5306ed035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` | No exact candidate-name or alias owner for the flour phrases above. |
| Research ledger | 1,567 records / 5,491 source entries / 4,529 distinct source IDs; SHA-256 `3e66158bfcbdc4d7b64175666b63997c1235d92623c144c03e21b44c868af515` | No adzuki-flour candidate record or exact flour-phrase owner. The existing `ingredient-ref-azuki-beans` record is for the verified whole-seed identity. |
| Manifest recipe corpus | 114 recipe files / 1,123 ingredient rows / 753,792 bytes; manifest-order concatenated SHA-256 `ea9d7b6bd14aafe822089052c27a73786a93e76c33b4863def3f44eabde92b9f` | No flour phrase match in any recipe file or ingredient row. |

The current active owner is `ingredient-ref-azuki-beans`: displays `adzuki beans / haricots adzuki`, French singular alias `haricot adzuki`, and English aliases `azuki bean` and `azuki beans`. Its category is `LEGUME_AND_PULSE`, density is `null`, and unit mappings are empty. The attached `ingredient-form-azuki-beans-dried` owns the dried whole-seed wording, not flour. The legacy file has no exact adzuki-flour candidate. The ledger contains the accepted whole-seed record and no flour record; `candidate-adzuki-flour`, `candidate-azuki-flour`, `ingredient-ref-adzuki-flour`, and `ingredient-ref-azuki-flour` are absent as record IDs. The source-ID prefix listed above is also absent from the ledger.

Current picker outcomes, confirmed against `IngredientReferenceSearchIndex`, are:

| Query | Current result |
|---|---|
| `adzuki`, `adzuki beans`, `azuki bean`, `azuki beans` | `adzuki beans` |
| `adzuki bean` | `adzuki beans` by partial-match fallback |
| `haricot adzuki`, `haricots adzuki`, `dried adzuki beans` | `adzuki beans` |
| `adzuki flour`, `adzuki bean flour`, `farine de haricot adzuki` | No result |

If `adzuki bean flour` were added to a new row, `adzuki bean` would become an exact phrase match and suppress the existing whole-bean result returned today by fallback. A French alias `farine de haricot adzuki` would share the contiguous phrase `haricot adzuki` with the whole-bean French alias, so that query would return both rows. A future review must choose the product’s French display and aliases together with the picker boundary; this proposal does not silently change the whole-bean row to compensate.

The full-corpus scan found one adzuki ingredient row: recipe `004#1`, `200 g dried azuki beans`, linked to `ingredient-ref-azuki-beans` with the dried-bean form. Recipe 004 makes sweet anko from dried beans and sugar; its 1:1 note is a source-specific bean-to-sugar weight ratio, not demand for flour or flour-substitution evidence. The complete ingredient-row and recipe-text scan found zero matches for all flour phrases in the table above, plus `adzuki powder` and `red bean flour`.

## Measurement, forms, and substitution limits

- **Household measures and density:** Unknown. Manufacturer catalog pack sizes (500 g, 1 kg, 5 kg, and 25 kg for listed products) are package formats, not cup/spoon weights or mass-per-volume values. Keep any future row’s density null and unit mappings empty unless a transferable source is found. [S02]
- **Processing forms:** None. Do not encode roasted, steamed, green-seed, red-seed, or seed-coat products as generic forms without a shared product definition. [S02–S04]
- **Conversion and yield:** None supported. Lab treatment conditions and flour formulation results are study-specific; no source gives a reusable bean-to-flour household yield or conversion. [S03–S04]
- **Substitution:** No general or contextual rule. A primary biscuit study tests adzuki flour within its own wheat-flour replacement formulations. Those experimental formulations do not establish a general replacement ratio for wheat flour, another pulse flour, or adzuki beans. Add no substitution rule. [S03]
- **Recipes:** The bundled corpus supports the whole dried-bean identity in recipe 004 only; it gives no flour demand. Add no recipe link or relink.

## Prior-work reconciliation

The open WP02 B2 checklist covers alternative flours and pulse-flour products. Recent reviews have considered pigeon-pea, horse-gram, and moth-bean flour separately; those decisions concern different pulse identities and do not resolve *Vigna angularis* flour. The existing WP03 adzuki identity and dried form remain the ownership records for the whole bean. The WP06 East Asian sweep identifies recipe 004 as an anko recipe made from dried azuki beans and sugar; it does not establish anko as an ingredient-row request or support a flour identity. No earlier WP02 proposal or batch was found that decides adzuki flour.

## Sources checked online on 2026-10-12

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012-S01** | Office québécois de la langue française, [haricot adzuki (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423445/haricot-adzuki). The entry gives French `haricot adzuki` and English `adzuki bean`; its contributor is Les Éditions Québec Amérique (2003). | Supports the whole-seed Québec French and English terms, not flour naming or a milling specification. This is not an OQLF flour term. |
| **WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012-S02** | Molino Bongiovanni, [English product catalogue (PDF)](https://www.molinobongiovanni.com/files/CatalogVer-1ENG.pdf), entries “Red Azuki Bean Flour” and “Green Azuki Bean Flour.” It describes each as made by stone-milling unhusked red or green adzuki beans and lists consumer and bulk package weights. | Manufacturer product evidence, not a Canadian or Québec product listing. The catalog does not provide a Latin name or a shared specification for red and green products. Pack weights are not kitchen measures. |
| **WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012-S03** | Vieira et al., [“Effects of frying, roasting and boiling on aroma profiles of adzuki beans … and potential of adzuki bean and millet flours to improve flavor and sensory characteristics of biscuits”](https://www.sciencedirect.com/science/article/pii/S0308814620317404), *Food Chemistry* (2021). Primary research names adzuki bean flour in biscuit formulations and compares processed-bean treatments. | Research formulation and sensory study; it does not set a market-wide flour process, consumer label, household measure, or general replacement ratio. |
| **WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012-S04** | Japan Society of Home Economics, [“Antioxidative Activity of Roasted Adzuki Bean Flour and its Application as Teaching Material…”](https://www.jstage.jst.go.jp/article/jhej/63/6/63_301/_article) (2012). Primary research explicitly studies roasted adzuki bean flour. | Supports one processed flour product and use, not a generic synonym or Québec label. |
| **WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012-S05** | Agriculture and Agri-Food Canada, [Analyse des tendances du secteur – ingrédients d’origine végétale à base de légumineuses au Royaume-Uni](https://agriculture.canada.ca/fr/commerce-international/rapports-guides/analyse-tendances-du-secteur-ingredients-dorigine-vegetale-base-legumineuses-royaume-uni). Uses the French commodity wording `haricots rouges « adzuki » séchés`. | Canadian federal French-language trade report, but its adzuki phrase identifies dried beans in a UK-market data table, not flour or Québec retail terminology. |
| **WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012-S06** | Agriculture and Agri-Food Canada, [Pulses? Answers!](https://publications.gc.ca/collections/collection_2016/aac-aafc/A15-12576-2016-eng.pdf), 2016. Lists adzuki beans among Canadian pulse products. | Supports commodity identity only; it does not name adzuki flour. |
| **WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012-S07** | Ziegler Organic, [Organic Pulses Flours](https://ziegler-organic.de/en/products/flours-and-brans/pulses-flours/). Lists adzuki bean flour among its pulse flours and gives consumer, catering, and industrial package sizes. | European manufacturer catalogue, not a Canadian/Québec product label; no exact French product name or flour process is given. |
| **WP02-B2-ADZUKI-FLOUR-QUEBEC-HOLD-20261012-S08** | T&T Supermarket Canada, [Shirakiku Canadian Adzuki Bean, 2 lb](https://www.tntsupermarket.com/eng/51319001-shirakiku-red-beans-canada.html). Current Canada-facing retail listing for whole red adzuki beans. | Whole-seed product listing only; it does not establish flour availability, French naming, or equivalence to a flour product. |

### Evidence not found

Targeted searches for `adzuki flour`, `adzuki bean flour`, `azuki flour`, `farine d’adzuki`, `farine d’azuki`, and `farine de haricot adzuki` did not locate a standalone Québec or Canadian flour package or an authoritative Québec French flour term. This is a bounded search result, not proof that no such product exists. The OQLF/GDT and AAFC sources establish the bean wording only. Reopen if a Canadian/Québec flour package or a food-terminology source supplies a French product name, botanical scope, and the seed treatment represented by the product.

**Final disposition: HOLD.** Keep the verified whole-azuki identity and its dried form unchanged. Add no flour reference, alias, candidate ID, ledger record, form, measurement, conversion, yield, recipe link, or substitution in this review.

# WP03 Section F — Turkish tarhana family boundary hold (R47, 2026-10-13)

## Review record

- **Scope:** Turkish tarhana as a regional cereal-based fermented product family, especially dry soup mixes and the distinct dried Maraş product. This review does not cover Greek trahanas or other cross-border relatives.
- **Open checklist:** the parent item for regionally significant cereal mixes and preprocessed grains remains open in the [live Section F plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
- **Status:** proposal only. No shared catalog, ledger, plan, roadmap, batch README, recipe, generated file, or application file was changed.
- **Recommendation:** keep the generic Turkish tarhana family unallocated. Official Turkish sources describe flour-based soup granules in some regions and a cracked-wheat/yogurt Maraş product dried in thin sheets and eaten in several ways, including as a snack or in soup. Current Canadian listings use `tarhana` for multiple soup mixes, while a Québec French product display was not verified. A generic row would make bare `tarhana` return one product identity without establishing which product family it represents.
- **Data limits:** add no active identity, alias, ledger candidate, form, recipe link, measure, density, unit mapping, conversion, cooking yield, or substitution.
- **Proposal-local source-ID prefix:** `WP03-F-TARHANA-R47-20261013-S` (S01–S05); a repository search found no previous use of this prefix.

## Why this is an uncovered candidate

The unchecked Section F parent includes regional cereal mixes and preprocessed grains. Exact scans for `tarhana`, `trahana`, `tarkhana`, and `tarhanasi` found no prior decision in the live plan or roadmap, proposal or batch archive, active ingredient references or forms, legacy-import candidates, research ledger, or the bundled recipe package. This candidate is separate from the reviewed Canarian gofio, Fregola Sarda, Tuo Zafi, and Bsissa decisions.

The Turkish Ministry of Culture and Tourism describes generic tarhana as fermented dough made with wheat flour, yogurt, vegetables, and spices, then dried and ground. Its Uşak specification describes one regional granulated product with wheat flour, full-fat yogurt, pepper, onion, tomato, and mint, fermented for at least 21 days; it also permits storage as dough [S01]. The same ministry describes Maraş Tarhanası as a distinct product made from cracked wheat and yogurt, dried thinly on a woven mat, and consumed semi-dried, dried as a snack, in soup, or in other preparations [S02]. The European Commission has entered the exact name *Maraş Tarhanası* as a protected geographical indication; the act preserves that Turkish name in both its English and French versions [S03]. These sources establish a family with regional product and state differences, not one transferable flour or cracked-wheat form.

## English and Québec French naming boundary

| Use | Evidence and boundary |
|---|---|
| **English product wording** | Canada-facing listings use `Ege Tarhana Soup`, `Hasiroglu Tarhana Soup – Maras Homemade Style`, and `Tarhana Soup mix`. Their product details identify dry soup products; the listings are retailer evidence for those specific products, not a uniform composition standard [S04]. |
| **Québec French wording** | No Québec-facing French retail label, OQLF entry, or TERMIUM entry for the dry product was verified. A French-language Canadian trademark journal retains `tarhana` unchanged in a goods list, but that is not a Québec ingredient-name recommendation or consumer label [S05]. The EU French act likewise preserves the protected proper name *Maraş Tarhanası*, but it does not establish a generic Québec French display [S03]. Do not approve `mélange à soupe de tarhana` or another descriptive translation without a Québec-facing product source. |
| **Regional product boundary** | Do not make `Uşak Tarhanası` or protected *Maraş Tarhanası* aliases for a generic dry soup mix. The official sources distinguish formulations and processing; Maraş sheets can also be eaten as snacks [S01–S03]. |
| **Spelling boundary** | The Canadian retailer tags one product with spelling variants, including `tarkhana` and `trahanas` [S04]. Those retailer search tags do not establish Turkish synonymy or a Québec display name. Do not add them as aliases. |

## Exact ownership and picker effects

At the pre-proposal snapshot, the bundled reference catalog contains **1,369 references**, the form catalog **100 forms**, the legacy-import file **64 candidates**, and the research ledger **1,699 records**. Exact spelling and family scans found no active reference, form, legacy candidate, or ledger record for tarhana. The complete manifest-listed recipe package was checked separately below. No candidate or source ID is being added to shared data in this hold.

| Current owner | Exact boundary | Effect of this hold |
|---|---|---|
| None for `tarhana`, `Uşak Tarhanası`, or `Maraş Tarhanası` | No active reference, attached form, legacy candidate, or ledger record owns these names. | Current picker search remains empty for these names; no ownership changes. |
| `ingredient-ref-cracked-wheat` — `cracked wheat / blé concassé` | Category `GRAIN_AND_CEREAL`; no aliases, forms, density, or unit mappings. | Cracked wheat is a named component of Maraş Tarhanası, not an identity or substitute for the fermented multi-ingredient product. |
| `ingredient-ref-bulgur` — `bulgur / boulgour` | Category `GRAIN_AND_CEREAL`; four dry grind forms (fine, medium, coarse, extra coarse), none with an active density or conversion. | Do not alias tarhana to bulgur or infer a form relation from the shared wheat base. |
| `ingredient-ref-all-purpose-flour` — `all-purpose flour / farine tout usage`; `ingredient-ref-whole-wheat-flour` — `whole-wheat flour / farine de blé entier` | Existing aliases are `ap flour`, `plain flour`, `farine`, `farine ordinaire`, and `entire wheat flour`; neither identity has an active density or unit mapping. | Flour is one source-specific component of some tarhana products, not a substitute for the fermented mix. |
| `ingredient-ref-plain-yogurt` — `plain yogurt / yogourt nature` | English alias `plain yoghurt`; no tarhana-related alias, density, mapping, or attached form. | Yogurt is a product component, not an owner of the finished mix. |
| Legacy `ingredient-ref-yogurt` — `yogurt / yogourt` | Unreviewed legacy-import candidate only; no tarhana term. | This legacy key does not own a tarhana product and is not changed. |

The static picker review follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9): it prefers complete normalized word phrases and then falls back to partial matching. No search change is proposed.

| Query | Current result | Projected effect if a generic row were added |
|---|---|---|
| `tarhana` | 0 | A row named `tarhana soup mix` would become the single result because the complete word `tarhana` occurs in its display term. That would route the bare family term to one soup-product identity even though official sources also document a distinct sheet/snack product. |
| `Uşak Tarhanası`, `Maraş Tarhanası` | 0 | These remain product-specific queries. Do not alias either to a generic row unless the selected identity explicitly represents that regional product and its supported form. |
| `trahana`, `tarkhana` | 0 | Keep unassigned; retailer spelling tags do not prove equivalence to Turkish tarhana. |

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across the complete serialized recipe JSON and ingredient fields for `tarhana`, `trahana`, `tarkhana`, and `tarhanasi`.

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Ingredient references to a tarhana identity: **0**.

The bundled corpus provides no demand that resolves the generic-versus-regional product boundary.

## Forms, measurements, and substitutions

- **Forms:** add none. Granulated soup powder, fermenting dough, semi-dried *firik*, dried sheets, and snack products are different documented product states or regional products. The evidence does not support treating them as global forms under one active identity [S01–S04].
- **Numeric limits:** Uşak's minimum 21-day fermentation period is a product-process specification, not a household measure or cooking-time value [S01]. Retail listings show package sizes such as 100 g and 500 g, and one product is marketed as four servings; these are product/package claims, not a mass-per-volume measure or reusable recipe amount [S04]. Keep density, unit mappings, and active measures empty.
- **Substitutions:** add no global or contextual rule between tarhana, cracked wheat, bulgur, flour, yogurt, other fermented cereal mixes, or snack sheets. Shared components do not provide a transferable ingredient ratio or cooking equivalence.

## Source register

Sources were checked online on 2026-10-13. Source IDs are local to this proposal and were not added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-F-TARHANA-R47-20261013-S01` | Republic of Türkiye Ministry of Culture and Tourism, [Uşak Tarhanası](https://www.kulturportali.gov.tr/portal/usak-tarhanasi). | Defines general tarhana as a fermented wheat-flour/yogurt/vegetable/spice dough that is dried and ground; gives the Uşak formula, granulated product state, and minimum 21-day fermentation. Official regional specification; it does not define every product sold as tarhana. |
| `WP03-F-TARHANA-R47-20261013-S02` | Republic of Türkiye Ministry of Culture and Tourism, [Maraş Tarhanası](https://www.kulturportali.gov.tr/portal/maras-tarhanasi). | Distinguishes generic flour-and-yogurt powder used for soup from Maraş Tarhanası made with cracked wheat and yogurt, dried thinly on a mat and consumed in several ways, including as a snack and in soup. Regional cultural-product source; it is not a Québec retail label. |
| `WP03-F-TARHANA-R47-20261013-S03` | European Commission, [Commission Implementing Regulation (EU) 2023/2706 — Maraş Tarhanası (PGI)](https://eur-lex.europa.eu/eli/reg_impl/2023/2706/oj/eng); [French version](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32023R2706). | The act, in force, registers the exact regional proper name *Maraş Tarhanası* as a PGI and preserves it in English and French. It confirms the named product's protected boundary, not a generic tarhana composition or Canadian naming convention. |
| `WP03-F-TARHANA-R47-20261013-S04` | Turkish Bazaar Canada, [Ege Tarhana Soup](https://www.turkishbazaar.ca/product/tarhana/) and [Hasiroglu Maraş-style Tarhana Soup](https://www.turkishbazaar.ca/product/hasiroglu-turkish-tarhana-soup/); related [Tarhana Soup mix listing](https://www.turkishbazaar.ca/product/tarhana-soup-toronto-canada/). | Current Canada-wide retailer pages use different English product titles for Ege, Maraş-style powder, and a generic `Tarhana Soup mix`; package listings include 500 g and 100 g/four-serving products. One page lists wheat-flour and milk-product allergens. Retailer listings establish product-specific Canadian names and packages, not a common recipe, full ingredient specification, density, or Québec French display. |
| `WP03-F-TARHANA-R47-20261013-S05` | Canadian Intellectual Property Office, [Journal des marques de commerce, vol. 68 no. 3470](https://publications.gc.ca/collections/collection_2021/opic-cipo/RG42-2-68-3470-fra.pdf), application 2,003,726. | A French-language goods list retains `tarhana` unchanged. The application itself was filed in English; this is limited evidence of Canadian French legal usage, not a Québec culinary term ruling or retail label. |

## Next action

Keep the generic Turkish tarhana family as an evidence-only hold. Reopen after a Québec-facing French product label and a manufacturer or official specification establish whether the requested identity is specifically dry soup powder or a broader product family. If a regional product is needed, review its exact name and state separately; do not alias it to cracked wheat or flour. Then repeat the exact owner, picker, and corpus checks before allocating any active row.

No tests were run because this is proposal-only research.

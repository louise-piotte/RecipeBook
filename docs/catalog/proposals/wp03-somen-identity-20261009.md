# WP03 Section G somen noodles identity proposal

- **Reviewed:** 2026-10-09
- **Status:** identity integrated on 2026-10-09; broader Section F/G review remains open
- **Owner:** WP03 identity research for one Japanese noodle identity
- **Scope owned:** plain somen as one ingredient identity, with an OQLF-supported fr-CA name and an English display.
- **Deferred:** hiyamugi; udon; soba; ramen; generic wheat or maize noodles; rice noodles and rice sticks; starch-defined glass noodles; egg noodles; shirataki/konjac noodles; Korean somyeon; yakisoba; regional somen styles as separate identities; instant noodles, prepared noodle dishes, and all other Section F/G candidates. Dry, boiled/cooked, and hand-stretched somen are documented states, but this packet adds no form IDs or state conversions. The broader Section F/G plan stays open.
- **Repository snapshot:** rechecked the canonical package at 412 ingredient references, 16 forms, 577 ledger records, and 114 bundled recipe JSON files with 1,123 ingredient rows. The Section G plan still lists somen as open; the workflow records udon as integrated on 2026-10-09. No somen reference, form, somen ledger record, legacy-import identity, or earlier somen-specific proposal exists. The live udon record mentions somen only as its distinct thin-noodle neighbor. No `ingredient-ref-somen-noodles` ID exists.
- **Research proposal:** completed with the source, collision, and recipe findings below. Coordinator integration is recorded after the acceptance checks.

## Candidate decision

Recommend one identity after acceptance review:

| Proposed ID | English display | fr-CA display | English aliases | fr-CA aliases | Category |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-somen-noodles` | `somen noodles` | `somen` | none | none | `GRAIN_AND_CEREAL` |

The OQLF entry `nouilles de blé` lists `somen` as a preferred French term and describes it as the thin Japanese noodle class. MAFF uses `Somen Noodles` in English and lists the product under grain products. Health Canada’s bilingual food record uses the French label `Pâtes, nouilles japonaises, somen, cuites` and the English `Pasta, Japanese noodles, somen, cooked`. This supports `somen` as the fr-CA display and `somen noodles` as the English display. No alias is needed: the bilingual search already indexes the French display `somen`.

Use `GRAIN_AND_CEREAL`, consistent with the current pasta, soba, udon, and ramen rows, and supported by MAFF’s grain-products category. This is a product-name identity, not a claim that all somen has one universal formulation. OQLF describes Japanese wheat noodles and, in some cases, maize noodles as grouped by calibre, calling the thin type somen and the thick type udon. MAFF’s regional Miwa somen example uses wheat flour, water, and salt; that example does not establish a universal ingredient list. Do not encode a 100% wheat, egg-free, gluten-free, or fixed-size claim.

Keep the identity separate from the current udon row: OQLF distinguishes thin somen from thick udon, and Japanese standards distinguish named dried classes by size. Keep it separate from soba, which OQLF defines as Japanese buckwheat noodles, and ramen, which OQLF defines as fine quick-cooking egg noodles made from wheat flour. Do not alias generic `wheat noodles`, `nouilles de blé`, `maize noodles`, `nouilles de maïs`, `thin noodles`, `nouilles minces`, `nouilles minces de blé`, or `nouilles minces de maïs`; these phrases describe broader ingredient or shape groups. Hiyamugi is separately classified in the cited dried-noodle standard. Do not activate `sōmen` or `soumen` as extra aliases; the search-key rules already fold the macron in `sōmen` to `somen`, while the alternate spelling `soumen` lacks support in the sources reviewed here.

Keep Japanese-script spellings such as `そうめん` and `素麺` out of the alias list: the current ingredient search key retains only Latin letters and digits, so those strings normalize to an empty key. Do not add `somyeon`, which is a different Korean term, or prepared soup/dish names.

## Forms and measurement findings

- **Supported cooked portion observations:** Health Canada’s Canadian Nutrient File serving-size record 4463 identifies `Pâtes, nouilles japonaises, somen, cuites` and lists 100 mL = 74.4 g, 125 mL = 93.0 g, and 250 mL = 186.0 g. These are usable as dated, source-specific cooked somen portion observations. Recommend `measurementState: researched_supported` only for these exact cooked-state measures if recorded as `portion_weight` observations. The page does not state a draining, packing, or measuring method; preserve that limitation and do not generalize the values to dry somen, hand-stretched products, brands, or all serving conditions.
- **Density and runtime conversion:** The Health Canada values are portion data, not a documented bulk-density study. Keep `defaultDensity` null, `unitMappings` empty, and no generic g/mL or cup conversion active. Do not infer values for volumes the source does not list.
- **Dry and cooked composition records:** MEXT’s 2023-supplemented food 01043 is a dried common-wheat `somen and hiyamugi` record, with composition reported per 100 g edible portion. MEXT’s food list has separate dry/boiled and hand-stretched dry/boiled entries, but groups somen with hiyamugi in those entries. The records support distinct state data and grain identity, but not a somen-only dry measure, density, or cooking yield.
- **Size standards:** MAFF’s table classifies dried somen under 1.3 mm diameter and dried hiyamugi at least 1.3 mm but under 1.7 mm; dried udon is at least 1.7 mm. The hand-stretched somen class has a different stated threshold. These are product-classification standards for named dry classes, not a universal measurement rule for fresh or cooked noodles.
- **Forms:** MAFF documents hand-pulled somen as dried noodles and served cooked in cold, warm, or fried dishes. MEXT separately records dried and boiled states. No bundled recipe ingredient line needs somen-specific state handling, so this proposal adds no forms, package yields, or dry-to-cooked conversion.

## Substitution findings

Kikkoman’s `Somen Noodles with Cherry Tomatoes` recipe lists 300 g somen noodles for four servings and adds `(may substitute spaghetti)` on that same ingredient line. Its directions boil the somen, cool it in ice water, drain it, then serve with cherry tomatoes, canned tuna, basil, soy sauce, and olive oil. This is a direct, one-recipe somen-to-spaghetti option; the source does not provide a separate quantity for spaghetti or revised cooking directions. The target `ingredient-ref-spaghetti` already exists in the live catalog.

Recommend `substitutionResearchState: researched_supported` for this source-scoped finding, but add no active runtime rule. Preserve the 300 g/four-serving context and target identity if the finding is later recorded. Do not generalize it to other sauces, soups, hot noodle dishes, wheat or maize noodles generally, udon, soba, ramen, or rice/starch noodles. No bundled recipe currently mentions somen, so no recipe-line substitution link is proposed.

## Exact-key and recipe audits

### Normalized-key collision audit

Audited all current reference and form search terms using `normalizeIngredientSearchKey`: lowercase, Unicode NFKD, ligature and accent folding, punctuation-to-space, and whitespace collapse. The proposed display/alias terms produce two distinct normalized keys:

| Candidate term | Normalized key | Current owners among 412 references and 16 forms |
| --- | --- | --- |
| `somen noodles` | `somen noodles` | none |
| `somen` | `somen` | none |

`somen` is the proposed French display; it has no current owner. The alternate `sōmen` normalizes to `somen`; it is not a separately activated alias. `nouilles somen`, `soumen`, `wheat noodles`, `nouilles de blé`, `nouilles minces de blé`, `maize noodles`, `nouilles minces de maïs`, `noodles`, and `nouilles` have no exact current owner and are not proposed aliases. The existing key `udon` belongs only to `ingredient-ref-udon-noodles`, `soba` to `ingredient-ref-soba-noodles`, `ramen` to `ingredient-ref-ramen-noodles`, `pasta` to `ingredient-ref-pasta`, and `spaghetti` to `ingredient-ref-spaghetti`. No proposed term collides with an existing reference/form term or with another proposed key. The proposed ID is absent from the seed, forms, ledger, and `docs/catalog/legacy-import-identities.v1.json`.

### Bundled recipe audit

Scanned all 114 recipe JSON files and all 1,123 `ingredients[]` rows across `originalText`, `ingredientName`, and `ingredientRefId`. Exact somen terms (`somen`, `sōmen`, `soumen`, `そうめん`, `素麺`) found zero matches in the ingredient rows and zero matches anywhere in the recipe JSON corpus. A broader `noodle`/`nouille` search also found zero ingredient-line matches. No recipe relinks, form-specific ingredient references, measurement conversion, or recipe-line substitution link is proposed.

## Recommended evidence states

- Identity: propose `ingredient-ref-somen-noodles`, `somen noodles / somen`, with `identityState: verified` after coordinator acceptance and the independent Québec terminology review that remains open for the broader catalog.
- Measurement: `researched_supported` for Health Canada’s three exact cooked-somen portion weights only. Preserve the source/version limitation; store no default density or active unit mapping.
- Substitution: `researched_supported` for the Kikkoman recipe’s somen-to-spaghetti option only. Record the dish, 300 g for four servings, and the absence of separate substitute instructions; activate no runtime rule.

## Sources and source-to-claim map

All listed sources were accessed 2026-10-09. Source IDs WP03-S215–WP03-S223 are proposal references only and have not been added to the shared ledger.

- **WP03-S215 — OQLF, [nouilles de blé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18699784/nouilles-de-ble)** (last updated 1997): lists `somen` as a preferred French term; says Japanese wheat or sometimes maize noodles are grouped by calibre as thin somen or thick udon; places the entry in food/pasta and names generic wheat/maize noodle terms. Primary Québec terminology and somen/udon/generic boundary source.
- **WP03-S216 — Japan MAFF, [Grain products — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kokurui.html)** (page publication date not shown): describes somen as the fine/thin Japanese noodle type; contrasts dried somen, hiyamugi, and udon standards; reports alternate hand-stretched thresholds and grain-product context. It supports product distinctions, not a universal composition or conversion.
- **WP03-S217 — Japan MAFF, [Miwa Somen Noodles, Hand-pulled Somen Noodles](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/miwa_somen_noodles_hand_pulled_somen_noodles.html)** (page publication date not shown): uses the English product name `Somen Noodles`, classifies the regional product as grain, and lists wheat flour, water, and salt. The page describes hand-pulled dried product and cooked uses; this is a named Miwa product example, not a universal formulation.
- **WP03-S218 — Health Canada, [Canadian Nutrient File serving portion, food code 4463](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4463&lang=fre)** (page modified 2019-03-01): bilingual record for cooked Japanese somen; lists 100 mL = 74.4 g, 125 mL = 93.0 g, and 250 mL = 186.0 g. Supports exact cooked portion observations only; no measure packing/draining procedure is stated and no generic density is inferred.
- **WP03-S219 — Japan MEXT, [Food Composition Database, dried somen and hiyamugi, item 01043](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01043_7)** (Japanese Food Composition Standard, 8th edition, supplement 2023): identifies a dried common-wheat somen/hiyamugi item with nutrition per 100 g edible portion. It does not isolate somen from hiyamugi and supplies no volume or density measure.
- **WP03-S220 — Japan MEXT, [2020 Food Composition Standard food list](https://www.mext.go.jp/content/20201225-mxt_kagsei-mext_01110_001.pdf)** (2020 edition): lists dry and boiled somen/hiyamugi and hand-stretched dry and boiled somen/hiyamugi entries separately. Supports state distinctions but not somen-only data or cooking yield.
- **WP03-S221 — OQLF, [nouilles de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037421/nouilles-de-sarrasin)** (last updated 1997): defines soba noodles as Japanese buckwheat noodles and supports keeping the current soba identity separate.
- **WP03-S222 — OQLF, [nouilles ramen](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529875/nouilles-ramen)** (last updated 2014): defines ramen as fine quick-cooking egg noodles made from wheat flour and supports keeping the current ramen identity separate.
- **WP03-S223 — Kikkoman Corporation, [Somen Noodles with Cherry Tomatoes](https://www.kikkoman.com/en/cookbook/recipe/00001264.html)** (publication date not shown): lists 300 g somen noodles for four servings and parenthetically permits spaghetti as a substitute in that same recipe. It supports only this recipe-scoped direction and amount context; it is not a general somen-to-spaghetti ratio or cooking-rule source.

## Recommended acceptance checks

- [x] Accept `somen noodles / somen` as one `GRAIN_AND_CEREAL` identity with no aliases; do not activate broad thin-wheat/maize phrases.
- [x] Keep the row separate from udon, hiyamugi, soba, ramen, generic wheat or maize noodles, and prepared noodle dishes.
- [x] Record only the three Health Canada cooked-somen portion observations with their 2019 source date and method limitation; keep `defaultDensity`, unit mappings, and runtime conversions empty.
- [x] Preserve the Kikkoman somen-to-spaghetti finding as recipe-scoped; activate no runtime substitution rule.
- [x] Add no forms or recipe links; repeat normalized-key and 114-recipe ingredient audits against the merge-time package and leave the rest of Section F/G open.

## Coordinator integration result

Accepted `ingredient-ref-somen-noodles` as `somen noodles / somen`, category `GRAIN_AND_CEREAL`, with no aliases; the French display supplies the `somen` search term. Added the three Health Canada cooked-portion observations as ledger evidence; no density, unit mapping, form, conversion, or yield is active. Recorded Kikkoman's spaghetti option as a supported source-scoped finding for that four-serving recipe, with no runtime rule or recipe-line link. The merge-time audit found no normalized-key collision against 412 references and 16 forms and no somen ingredient-line use among 114 bundled recipes / 1,123 ingredient rows. Package, build, and Pixel 9a verification details are in [`../batches/wp03-somen-identity.md`](../batches/wp03-somen-identity.md).

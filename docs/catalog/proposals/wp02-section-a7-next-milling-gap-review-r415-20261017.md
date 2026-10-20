# WP02 Section A7 R415: buckwheat grits identity

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This file changes no catalog JSON, ingredient forms, research ledger, plan, roadmap, recipes, generated files, or tests.
- **Open checklist:** WP02 Section A7 continues review of other grain meals and milling products at [the active plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Recent decisions:** R412 integrated identity-only `barley grits / gruau d'orge`. Keep the R406 unqualified-wheat-meal hold and R409 triticale-grits hold unchanged.
- **Adjacent buckwheat decisions:** R23 keeps generic `buckwheat meal` unresolved; R400 holds `buckwheat semolina / semoule de sarrasin`. This review concerns the separately named `buckwheat grits` product and does not reverse either disposition.
- **Proposal-local source IDs:** `WP02-A7-BUCKWHEAT-GRITS-R415-20261017-S01` through `S06`. These are not shared-ledger entries. The Statistics Canada NAPCS source already appears under `candidate-buckwheat-meal` and is reused under that existing source ID.
- **Scope:** Assess only whether `buckwheat grits` is a distinct, source-backed milling-product identity with a Québec-facing French name. Do not reclassify buckwheat meal, semolina, groats, hot cereal, flour, or kasha.

## Recommendation

**Add one identity-only reference as `buckwheat grits / gruau de sarrasin`.** Use category `GRAIN_AND_CEREAL` and leave both alias lists empty.

The identity is supported by a current Canadian manufacturer's bilingual ingredient declaration: Oakrun's 9 Grains English Muffins page uses `buckwheat grits`, and its French page for the same product uses `gruau de sarrasin` [S01–S02]. The Government of Canada's TERMIUM Plus has a Milling and Cereal Industries entry pairing those same terms [S03]. Current Statistics Canada NAPCS examples list buckwheat grits separately from buckwheat groats and buckwheat meal for human consumption [reused `WP02-A7-BUCKWHEAT-MEAL-20261013-S01`].

Aliments Trigone, a Québec buckwheat producer, sells a standalone product titled `Gruau de sarrasin biologique`. Its product-family page distinguishes whole, dehulled, and cracked buckwheat seed and says cracked seed produces a cooked gruau [S04–S05]. This supports retaining the dry cracked-grain identity separately from the active raw whole-groat identity. It does not define one universal hull state or particle size for every buckwheat-grits product.

Use `gruau de sarrasin` as a current product-attested French display, corroborated by federal terminology evidence. It is not presented as an OQLF-approved term or a unique French label across all buckwheat products. The picker query `gruau de sarrasin` will return both this row and the existing `buckwheat groats, raw / gruau de sarrasin cru` row. Keep the full labels and make no alias or identity merge; the source evidence uses the unqualified French product name for grits and the qualified form for raw groats.

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-buckwheat-grits` |
| Category | `GRAIN_AND_CEREAL` |
| English display | `buckwheat grits` |
| French display | `gruau de sarrasin` |
| English / French aliases | `[]` / `[]` |
| Forms | none |
| Default density / unit mappings | `null` / `[]` |
| Recipe links, measurements, conversions, yields, substitutions | none |

## Product boundary and neighboring decisions

| Neighbor | Boundary to retain |
|---|---|
| `ingredient-ref-raw-buckwheat-groats` — `buckwheat groats, raw / gruau de sarrasin cru` | Keep the active row for raw whole groats. The current French display is longer than the proposed grits display and remains unchanged. The shared phrase stem produces two picker results for the unqualified query `gruau de sarrasin`; it does not make the underlying products equivalent. |
| `ingredient-ref-roasted-buckwheat-groats-dry` — `buckwheat groats, roasted, dry / grains de sarrasin rôtis et secs` | Keep roasted, dry groats separate. Do not add `kasha` or roasted-groat wording to the grits row. |
| `ingredient-ref-creamy-buckwheat-hot-cereal` — `creamy buckwheat hot cereal / céréales chaudes crémeuses au sarrasin` | Keep the specifically marketed hot cereal distinct from generic grits. The active cereal is documented as freshly milled from raw groats; that product description does not make all grits aliases for it. |
| `ingredient-ref-buckwheat-flour` and related buckwheat flours | Keep flour and flour grades separate from coarsely processed grits. Do not add `buckwheat meal`, `buckwheat semolina`, `semoule de sarrasin`, or any flour name as an alias. |
| `candidate-buckwheat-meal` | Leave the R23 generic-meal hold unresolved. It covers sources using `buckwheat meal` both for a dark flour synonym and for a separately coarse-ground product. R415 does not settle that broad term. |
| Buckwheat semolina / `semoule de sarrasin` | Leave the R400 hold in place. R415 neither uses nor allocates `semoule de sarrasin`. |
| `ingredient-ref-kasha` | Keep the prepared buckwheat gruel separate from dry groats and grits. Do not add `kasha` or `kacha` as aliases. |
| `ingredient-ref-barley-grits`, R406 wheat-meal hold, and R409 triticale-grits hold | Keep all recent A7 decisions unchanged. The barley row is an adjacent precedent, not authority to expand any neighboring grain's names. |

Do not add bare `gruau`, `grits`, `buckwheat cereal`, `buckwheat groats`, or a generic `buckwheat meal` alias. The French single word `gruau` has several Québec search results and can refer to a prepared cereal dish; retain the complete grain-qualified phrase.

## Current catalog, form, legacy, and ledger audit

The read-only audit used the split bundled seed package and catalog snapshot present on 2026-10-17. Hashes identify the exact files reviewed.

| Store | Snapshot | Ownership finding |
|---|---:|---|
| Active ingredient references | 1,717 rows; SHA-256 `2abf8b087a9cef82dd30fa83843a47573687f6744a3c929f5b9f16ddcb411fc7` | No active English name or alias owns `buckwheat grits`, `buckwheat grit`, or `ingredient-ref-buckwheat-grits`. The only current reference that phrase-matches `gruau de sarrasin` is `ingredient-ref-raw-buckwheat-groats`, whose full French display is `gruau de sarrasin cru`. Neighboring active identities include buckwheat flour, raw and roasted groats, flakes, creamy hot cereal, sprouted buckwheat, and other flour products. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form label or match term contains buckwheat, sarrasin, or grits. No form is attached to the proposed identity. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No buckwheat, sarrasin, or grits candidate was found. |
| Research ledger | 2,076 records / 9,400 source entries / 7,963 distinct source IDs; SHA-256 `9f3158ae76f292424ab5f9ad165c981329a588d64b986feebd1fc485bca29f6e` | No `ingredient-ref-buckwheat-grits` or R415 source record exists. `candidate-buckwheat-meal` remains `needs_clarification`, with measurement `researched_no_supported_value` and substitution research `researched_no_supported_substitute`; it remains a separate candidate. Active groat and hot-cereal records have no observations, conversions, or grits-specific measures. |
| Recipe manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Every listed file exists and parses; the full bundle has 1,123 ingredient rows. The corpus fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. |

The static picker audit follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are preferred, and substring matching is used only when no complete phrase matches. Forms were included in the read-only projection. The proposed row has no aliases or forms.

| Query | Current result | Projected result |
|---|---|---|
| `buckwheat grits` | none | `ingredient-ref-buckwheat-grits` only |
| `buckwheat grit` | none | `ingredient-ref-buckwheat-grits` through substring fallback |
| `gruau de sarrasin` | `ingredient-ref-raw-buckwheat-groats` (`gruau de sarrasin cru`) | raw groats plus `ingredient-ref-buckwheat-grits`; preserve both as distinct choices |
| `gruau de sarrasin cru` | raw buckwheat groats | unchanged |
| `buckwheat groats` | raw and roasted buckwheat-groat references | unchanged |
| `buckwheat meal`; `buckwheat semolina`; `semoule de sarrasin` | none | none; R23 and R400 dispositions remain unchanged |
| `creamy buckwheat hot cereal` | creamy buckwheat hot cereal | unchanged |
| Broad `grits` | five results | six results, adding buckwheat grits |
| Broad `gruau` | ten results | eleven results, adding buckwheat grits |
| Broad `buckwheat`; `sarrasin` | thirteen; fourteen results | fourteen; fifteen results, respectively |

The proposal-local ID, filename, and source-ID prefix were absent from the package and catalog documents at review time. No form, legacy identity, recipe link, or exact English candidate owner would be replaced.

## Bundled recipe-demand audit

All **114** paths in `manifest.v1.json` were read and parsed, covering **1,123 ingredient rows**. I searched each full serialized recipe and each structured ingredient row after applying the same lowercase, accent-folding, punctuation, and whitespace normalization used by `IngredientSearch.kt`.

The scan included `buckwheat grits`, singular `buckwheat grit`, `buckwheat meal`, `buckwheat semolina`, `buckwheat groats`, `gruau de sarrasin`, `semoule de sarrasin`, `sarrasin concassé`, `buckwheat cereal`, `kasha`, `kacha`, and the broad words `buckwheat` and `sarrasin`. Results: **0 matching recipe files, 0 matching ingredient rows, and 0 links** to the proposed ID. No bundled recipe supplies a grits use-context, measure, preparation state, or substitution to attach.

## Measurements and substitutions

- Aliments Trigone's product-specific hot-cereal recipe uses `1/3 tasse` of its buckwheat gruau with `1 ¾ tasse` of water and simmers for 8–10 minutes [S06]. This is a cooking formula for one product, not a mass-volume observation, density, reusable cup mapping, or universal yield. Do not transfer its cooking ratio to other buckwheat-grits products.
- Oakrun reports nutrition per finished 57 g English muffin; it does not state the mass or amount of the buckwheat-grits component [S01–S02]. Trigone's 1 kg product size is a package mass, not a household measure [S04]. Neither belongs in reusable measurement fields.
- The active global and contextual substitution-rule files contain zero rules. Trigone calls its product an alternative to conventional oatmeal, but gives no general recipe replacement ratio or tested dish-specific interchangeability. Treat that statement as source-specific positioning; add no global form conversion or contextual substitution. The existing meal candidate's substitution state remains attached to that distinct candidate.
- No grits forms, default density, unit mappings, measurement observations, conversions, package yields, recipe links, or substitutions are proposed.

## Source register

Sources were checked on 2026-10-17. IDs below are local to this proposal unless explicitly marked reused; they are not added to the shared research ledger.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-BUCKWHEAT-GRITS-R415-20261017-S01` | Oakrun Farm Bakery, [9 Grains English Muffins](https://oakrun.com/english-muffins/9-grains-english-muffins/), ingredient declaration and product details. | Current Canada-available, Canadian-made product page lists `Buckwheat grits` in the ingredient declaration. The corresponding French product page is S02. | This is a composite muffin label, not a standalone grits package or particle-size specification. The finished muffin serving does not establish the grits amount. |
| `WP02-A7-BUCKWHEAT-GRITS-R415-20261017-S02` | Oakrun Farm Bakery, [Muffins anglais aux 9 graines](https://oakrun.com/muffins-anglais/muffins-anglais-aux-9-graines/?lang=fr), the French page for the same product. | The same ingredient declaration uses `gruau de sarrasin`; paired with S01, this is direct Canadian manufacturer evidence for the English/French names. | The page's broad product description calls the ingredient simply sarrasin. Neither page specifies its milling process or its contribution to the finished muffin. |
| `WP02-A7-BUCKWHEAT-GRITS-R415-20261017-S03` | Translation Bureau, TERMIUM Plus, [grits (English term record)](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=GRITS), record 4 dated 2003-03-31. | Under Milling and Cereal Industries, records `buckwheat grits` and `buckwheat cereal` as correct terms and gives French `gruau de sarrasin`. The broader page note describes grits as more coarsely ground than flour or meal. | The entry is federal terminology evidence, not an OQLF-preferred label or current product specification. Its general grind note does not define every buckwheat-grits product. |
| `WP02-A7-BUCKWHEAT-GRITS-R415-20261017-S04` | Aliments Trigone, [Gruau de sarrasin biologique 1 kg](https://alimentstrigone.com/products/gruau-de-sarrasin-biologique-1-kg), product title, description, SKU `056142007056`. | A current Québec producer sells a standalone dry product under the exact French name and directs users to a cooked-cereal recipe. | Product page does not give an English label or numerical milling specification; the 1 kg value is package mass only. |
| `WP02-A7-BUCKWHEAT-GRITS-R415-20261017-S05` | Aliments Trigone, [Sarrasin noir biologique](https://alimentstrigone.com/pages/sarrasin-noir-biologique), product-family and usage descriptions. | Distinguishes whole, dehulled, and cracked buckwheat seed; says cracked seed produces a cooked gruau, while whole dehulled seed can be used separately as kasha or a pilaf-style grain. This supports keeping grits separate from whole groats. | It gives no universal sieve, hull-retention, or particle-size standard and does not specify the exact preparation of every product sold as buckwheat grits. |
| `WP02-A7-BUCKWHEAT-GRITS-R415-20261017-S06` | Aliments Trigone, [Gruau de sarrasin — type céréale cuite](https://alimentstrigone.com/pages/gruau-de-sarrasin-type-cereale-cuite), recipe ingredients and preparation. | Shows one source-specific quantity and cooking method for the producer's `gruau de sarrasin biologique`. | The recipe's `1/3 tasse` is not paired with ingredient mass; cooking directions are not a reusable measure, yield, or substitution ratio. |
| **Reused:** `WP02-A7-BUCKWHEAT-MEAL-20261013-S01` | Statistics Canada, [NAPCS Canada 2022, class 1821294 examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022), page modified 2026-01-08. | Lists buckwheat grits, buckwheat groats, and buckwheat meal for human consumption separately in the same class. | Classification examples confirm separate named products but do not provide a process definition or French label. This source is already attached to `candidate-buckwheat-meal`; reuse it rather than duplicate the ledger source. |

## Disposition

Add identity-only `ingredient-ref-buckwheat-grits` as **`buckwheat grits / gruau de sarrasin`**, with category `GRAIN_AND_CEREAL` and empty alias lists. Preserve its distinction from raw and roasted groats, flour, hot cereal, prepared kasha, buckwheat meal, and buckwheat semolina. The French phrase will intentionally add a second result for the broad picker query `gruau de sarrasin`, while the qualified `gruau de sarrasin cru` query remains on raw groats alone. Add no forms, numeric data, recipe links, conversions, yields, or active substitutions. This is a documentation-only proposal; no software tests, build, emulator, or deployment checks were run.

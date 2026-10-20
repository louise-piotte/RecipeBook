# WP02 Section 04 B3 R118 — katakuriko alias for potato starch

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14; see the [batch README](../batches/wp02-b3-katakuriko-potato-starch-alias-integration-20261014/README.md). The worker changed only this proposal; root added the alias and bounded ledger evidence.
- **Open plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section 04 B3, line 2209: “Water-chestnut flour and other documented regional starches.”
- **Scope:** The current Japanese-market product name `katakuriko` as a lookup name for ordinary potato starch. This is an alias review, not a new ingredient identity.
- **Recommendation:** Add the romanized search alias `katakuriko` to both alias arrays on the existing `ingredient-ref-potato-starch` row. Keep its display `potato starch / fécule de pomme de terre`. Add no separate *Erythronium* starch identity, form, active measure, conversion, yield, recipe link, or global substitution rule.
- **Proposed source-ID prefix:** `WP02-B3-KATAKURIKO-ALIAS-R118-20261014`.

## Why this is an unfinished B3 lookup gap

The active catalog already has a verified potato-starch identity, but its current names and aliases do not include `katakuriko`. A review of the plan, proposal and batch archive, active references and forms, legacy candidates, and the complete research ledger found no prior local `katakuriko` decision, source ID, or exact owner. The prior potato-starch reviews established the extracted-starch identity and its Québec French names; they did not review this Japanese product term.

The reviewed current-market products identify katakuriko as potato starch. The name has a historical botanical connection to dogtooth violet starch, so the proposed alias is deliberately limited to the contemporary product meaning evidenced by current Japanese and Canadian sources. Do not use it to create or imply an *Erythronium* starch row.

## Evidence and Québec naming

- The Japanese Ministry of Education, Culture, Sports, Science and Technology (MEXT) food-composition reference says most market products labelled katakuriko are potato starch; it separately notes the older *Erythronium japonicum* source. This supports a modern-market alias while documenting the historical boundary. [S01]
- The Gishi manufacturer describes its current `片栗粉` products as potato starch and lists 200 g, 300 g, 500 g, and 1 kg packages. Its product page is manufacturer evidence for the product family and package sizes, not a kitchen measure. [S02]
- Canadian importer Ozawa lists `Gishi Katakuriko (Potato Starch), 500g`, item FL-2030, and gives both Toronto-area and Montréal-area offices. This directly attests the romanized name and potato-starch identity in a current Canadian supply listing. The 500 g figure is package net weight only. [S03]
- OQLF’s preferred Québec French display is `fécule de pomme de terre`; it also lists `fécule de pommes de terre` and the commonly used `amidon de pomme de terre` and plural variant. The active catalog already retains its preferred singular display and existing French aliases. [S04]
- Télé-Québec’s French mochi recipe uses `fécule de pomme de terre (katakuriko)` for dusting the work surface and rolling the mochi dough, and states that the potato starch can be replaced with cornstarch in this method. This supplies local French usage for the romanized alias and one source-scoped direction, potato starch to cornstarch; it gives no amount, ratio, or quantitative equivalence. [S05]

The matching romanized term is recommended in `aliasesEn` and `aliasesFr`: it appears in a Canadian English product listing and in a Québec French recipe. Do not add Japanese-script `片栗粉`; the current `IngredientSearch.kt` normalizer retains only ASCII letters and digits, so that query normalizes to empty rather than providing a usable exact search term.

## Exact ownership and picker effects

The active row currently reads `ingredient-ref-potato-starch`, `potato starch / fécule de pomme de terre`, category `FLOUR_AND_STARCH`, French aliases `amidon de pomme de terre`, `fécule de pommes de terre`, and `amidon de pommes de terre`, no English aliases, `defaultDensity: null`, and `unitMappings: []`. No ingredient form is linked to potato starch. No active reference, form, legacy candidate, or ledger record owns `katakuriko`.

The current picker code is `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`; it matches complete word phrases across displays and both alias arrays. The normalized query results are:

| Query | Current result | Result with proposed alias |
|---|---|---|
| `katakuriko` | None | `ingredient-ref-potato-starch` only |
| `potato starch` | `ingredient-ref-modified-potato-starch`, `ingredient-ref-potato-starch`, `ingredient-ref-sweet-potato-starch`, and `ingredient-ref-sweet-potato-starch-noodles` | Same four rows |
| `fécule de pomme de terre` | Ordinary and modified potato-starch rows | Same two rows |

The alias does not displace an existing term or change broader query behavior. Keep `potato flour` and French potato-flour wording on the separate whole-potato-flour identity; do not add them as starch aliases.

## Recipe demand and numeric evidence

The current manifest lists 114 recipe files. A manifest-ordered scan of 114 files and 1,123 ingredient rows found zero literal matches for `katakuriko`, `片栗粉`, `potato starch`, `fécule de pomme de terre`, or `amidon de pomme de terre`, and zero ingredient links to `ingredient-ref-potato-starch`. The bundled corpus creates no link or quantity demand. The Télé-Québec mochi recipe is an external Québec source and supports the alias and the bounded dusting use; it does not establish a bundled recipe association.

Numeric and functional findings remain source-specific:

- Ozawa’s 500 g pack and Gishi’s other package sizes are package weights, not volume conversions or yield data. [S02–S03]
- A Canadian retailer page for a 300 g Gishi potato-starch package reports nutrition “per serving (10 g).” This is one SKU’s published serving weight; the page does not provide a cup, spoon, or volume equivalent, and its inventory details may be stale. If retained, record it only as a ledger `portion_weight` observation with the package and source scope. Do not activate it as a reusable serving or mass-volume mapping. [S06]
- No reviewed source supports a default density, household mass-volume measure, conversion, or preparation yield for the starch. Keep the active density null and unit mappings empty.
- Télé-Québec gives no quantity for the dusting starch. Record only the source-supported direction from `ingredient-ref-potato-starch` to `ingredient-ref-cornstarch`, bounded to work-surface dusting and rolling in this mochi method. This is a qualitative, source-scoped replacement statement, not a tested quantitative equivalence: it provides no amount, ratio, or replacement quantity. Add no active rule and do not generalize this direction or infer the reverse direction for thickening, baking, frying, or other recipes. [S05]

The live global and contextual substitution-rule files contain zero rules; `package-yields.v1.json` contains one unrelated entry. No new runtime substitution rule or recipe line is proposed.

## Review snapshot and audited paths

Counts, file sizes, and SHA-256 values below are from the files read on 2026-10-14. The recipe-corpus fingerprint hashes each manifest-relative path, a NUL byte, the exact file bytes, and a trailing NUL byte in manifest order.

| Surface | Path | Current count and SHA-256 |
|---|---|---|
| Ingredient references | `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,462 references; 469,822 bytes; `d614067358aec2a95cdbe2f77a38f9ce04dd8f14450a783c8cf465eece93d529` |
| Ingredient forms | `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 105 forms; 78,794 bytes; `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| Research ledger | `docs/catalog/research-ledger.v1.json` | 1,803 records / 7,407 source entries / 6,285 distinct source IDs; 7,434,717 bytes; `e396d4bb1c0f32e728c58f20d870389ff6b5daf76f204f74b99577c077e322a3` |
| Legacy import identities | `docs/catalog/legacy-import-identities.v1.json` | 63 candidates; 15,042 bytes; `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Seed manifest | `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths; 12,011 bytes; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | `app/src/main/assets/seed/bundled-library/recipes/` | 114 files / 1,123 ingredient rows / 753,928 bytes; `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The existing ledger record `ingredient-ref-potato-starch` is `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it has 11 source entries, no measurement observations, and no substitution findings. This proposal does not change shared files.

## Proposed root integration steps

1. Add only `katakuriko` to both `aliasesEn` and `aliasesFr` on `ingredient-ref-potato-starch`. Preserve its bilingual display, existing French aliases, category, null density, and empty unit mappings. Do not add a separate identity or Japanese-script alias.
2. Append the source records below and an accepted alias decision to the existing `ingredient-ref-potato-starch` ledger record. Keep the 10 g item as a product-specific `portion_weight` observation only if preserving the Canadian retailer’s serving declaration; do not use it for runtime conversion.
3. Record one `researched_supported` qualitative substitution finding in `substitutionFindings`, directed from potato starch to cornstarch and scoped to surface dusting and rolling in that mochi method. Set the ledger `substitutionResearchState` to `researched_supported` only for this bounded source finding. Make clear that this is a source-stated replacement, not a tested or quantitative equivalence; include no amount or ratio. Add no `ruleId` or active substitution rule, and do not infer the reverse direction or generalize the finding to other methods.
4. Link this review and its batch README under the Section 04 B3 regional-starches checklist item. Keep that parent item open and do not add a bundled recipe link.

Root integrated the alias and bounded ledger evidence. Static package and ledger validation,
reference normalization, generated-index freshness, alias ownership, recipe-corpus, UTF-8/no-BOM,
local-link, and whitespace checks passed. No app or emulator tests were run because the integration
adds database JSON data under the updated `AGENTS.md` rule.

## Sources

All pages were accessed on 2026-10-14.

| ID | Source and bounded evidence |
|---|---|
| **WP02-B3-KATAKURIKO-ALIAS-R118-20261014-S01** | MEXT, [Notes on Foods, Chapter 3](https://www.mext.go.jp/component/english/__icsFiles/afieldfile/2017/12/20/1385123_Notes-on-food_r11.pdf), pp. 22–23. Distinguishes potato starch from dogtooth-violet starch and notes that most market products labelled katakuriko are actually potato starch. This is Japanese food-composition terminology, not Canadian retail evidence. |
| **WP02-B3-KATAKURIKO-ALIAS-R118-20261014-S02** | Maehara Flour Milling / Gishi, [Product information: 片栗粉](https://gishi.co.jp/home/item.asp?ct=23). Manufacturer lists several katakuriko packages and identifies the product as potato starch. The package weights do not establish household measures. |
| **WP02-B3-KATAKURIKO-ALIAS-R118-20261014-S03** | Ozawa Canada, [Gishi Katakuriko (Potato Starch), 500g](https://ozawa.ca/product/gishi-katakuriko-500g/), item FL-2030. Canadian supply listing with Toronto and Montréal office addresses; supports the current bilingual-market lookup name and potato-starch identity, not a volume measure. |
| **WP02-B3-KATAKURIKO-ALIAS-R118-20261014-S04** | Office québécois de la langue française, [fécule de pomme de terre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre). Gives the preferred Québec French name and potato-starch translation, with French variants. It does not itself mention katakuriko. |
| **WP02-B3-KATAKURIKO-ALIAS-R118-20261014-S05** | Télé-Québec Cuisinez, [Mochis à la crème glacée](https://cuisinez.telequebec.tv/recettes/6076/mochis-a-la-creme-glacee). Uses `fécule de pomme de terre (katakuriko)` for dusting and states that it can be replaced with cornstarch in this method. No amount or replacement ratio is given. |
| **WP02-B3-KATAKURIKO-ALIAS-R118-20261014-S06** | Hungry Ninja Canada, [Gishi Potato Starch 300g](https://hungry-ninja.ca/products/gishi-potato-starch-300g). The Canadian retailer page identifies the SKU as Hokkaido potato starch and reports a 10 g nutrition serving. Inventory details may be stale; this is one product-page serving statement, not a household measure or class-wide value. |
| **WP02-B3-KATAKURIKO-ALIAS-R118-20261014-S07** | Kikkoman Corporation, [Potato Starch / Katakuriko glossary](https://www.kikkoman.com/en/cookbook/glossary/katakuriko.html). Describes katakuriko as potato starch and discusses thickening and frying uses. General culinary guidance only; it supplies no transferable measure, yield, or substitution ratio. |

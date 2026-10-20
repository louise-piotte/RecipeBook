# WP02 Section A7 R465 — amaranth grits product boundary

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Reviewed and integrated on 2026-10-17 as a bounded documentation-only hold. The A7 checklist, roadmap, workflow, and [integration README](../batches/wp02-a7-amaranth-grits-hold-integration-r465-20261017/README.md) record the decision. No shared catalog, ledger, recipe, generated, or application data changed; no tests were run.
- **Open checklist:** WP02 Section A7 remains open for other grain meals and milling products at the [global plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Scope:** Determine whether the phrase `amaranth grits` identifies a separate food milling product or can be assigned to an existing amaranth identity. This is separate from R29's review of the retailer title `Amaranth Flour (Powder, Meal)`. R29 remains unchanged; this review does not reopen `amaranth meal` or assign `gruau d'amarante` or `semoule d'amarante`.
- **Proposal-local source-ID prefix:** `WP02-A7-AMARANTH-GRITS-R465-20261017`. This prefix and the target proposal path were unused before this draft. No shared source ID or ingredient ID is allocated.

## Recommendation

**Hold `amaranth grits` / `amaranth grit` unallocated.** Do not add a reference, alias, form, legacy candidate, or ledger candidate, and do not route either phrase to `ingredient-ref-amaranth-grain` or `ingredient-ref-amaranth-flour`.

Amarant Ukraine's current Ukrainian product page identifies code 025 as **Амарантова крупа без глютену 900 г (подрібнена)**, a crushed amaranth groats product, and says crushing makes it cook faster than whole grain [S01]. The supplier's English product-detail page for the same code still calls it **Amaranth grain gluten-free wholegrain 900g** [S02]. Its English category page uses **Amaranth groats (crushed)** for larger packages; a search-indexed rendering of the 900 g item calls it **Crushed Amaranth Grits** [S03]. The native-language product specification therefore supports a crushed product, but the supplier's English naming is inconsistent and no page gives a sieve, particle-size, or milling-grade boundary. None of these Ukrainian product pages establishes a Canadian/Québec product or a local French display.

The Canadian Food Inspection Agency's historical Table 1 lists sampled amaranth products as **flour, grain**, while listing grits for some other grains. Its samples came from local/regional retail in six cities, including Montréal, but the survey covered 2015–2018 and is neither a current retail census nor proof that Canadian amaranth grits do not exist [S04]. Current Québec sources reviewed include a manufacturer listing for whole-grain **amarante** and a local mill portfolio that lists amaranth flour separately from **gruau d'avoine nue**; neither supplies a product-matched amaranth-grits French name [S06–S07]. The Québec flour listing and OQLF's base term *amarante* support the existing flour and grain identities, not grits [reused S08–S09].

Do not substitute literal `gruau d'amarante`, `semoule d'amarante`, `amarante concassée`, or `grits d'amarante` for that missing product-matched evidence. OQLF's technical `gruau` entry belongs to malt crushing and describes technical grits; the other `gruau` entry names a cooked dish [reused S10–S11]. Neither establishes a Québec consumer product name for amaranth grits. R29's earlier hold on `gruau d'amarante` and `semoule d'amarante` remains unchanged.

| Candidate field | R465 disposition |
|---|---|
| English phrase | Keep `amaranth grits`, `amaranth grit`, `crushed amaranth grits`, `amaranth groats`, and `crushed amaranth groats` unassigned. |
| French display or alias | None proposed. Do not reuse `gruau d'amarante` or `semoule d'amarante`; those phrases were already held as unsupported translations in R29's distinct meal review. |
| Active reference / candidate ID | None proposed or reserved. `ingredient-ref-amaranth-grits` and `candidate-amaranth-grits` are currently unallocated. |
| Existing amaranth identities | Preserve grain, flour, flakes, greens, puffed amaranth, and sprouted flour owners unchanged. |
| Forms, default density, mappings, measures, conversion, yield, recipe links, substitutions | Add none. |

Reopen only if a Canadian/Québec source identifies this crushed product and establishes a product-matched French display alongside a stable English term (`grits` or `groats`). Do not map the supplier's crushed product to the existing whole-grain row, and do not infer a French name from the generic word `groats`.

## Current ownership and allocation audit

Read-only snapshot of the shared package on 2026-10-17. Counts and hashes describe the files inspected during this review.

| Store | Snapshot | Finding |
|---|---:|---|
| Active references | 1,749 rows; SHA-256 `5174eea2fca947e9a41cbcc5bde337f71a1d275ecd8b2d93ee96690ad3aa5731` | No active display or alias owns `amaranth grits`, `amaranth grit`, `crushed amaranth grits`, `amaranth groats`, `crushed amaranth groats`, or the candidate French phrases. The exact proposed ID `ingredient-ref-amaranth-grits` is unused. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No amaranth-grits phrase is a form label or match term; no form is attached to the active amaranth identities. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact amaranth-grits or amaranth-groats phrase or candidate ID is allocated. |
| Research ledger | 2,108 records / 9,601 source entries / 8,148 distinct source IDs / 6,861 distinct source URLs; SHA-256 `38d27727bb146da83692a09c68e4aa5e6a68981925f4f0b6638a6c56032bd3c4` | No exact grits/groats candidate or active owner record. The R465 prefix, `candidate-amaranth-grits`, and `ingredient-ref-amaranth-grits` are absent. The Amarantshop, CFIA, Ardent Mills, Gaspésie Gourmande, and Moulin Abénakis URLs reviewed for R465 are not in the ledger; the CFIA report is cited in the earlier R139 proposal as a proposal-local source. Existing Québec and OQLF source IDs are reused below instead of allocating duplicates. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Every listed path exists and parses. The corpus contains 1,123 ingredient rows and 753,988 recipe-file bytes; manifest-ordered fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. |

The current related owners are:

- `ingredient-ref-amaranth-grain` — `amaranth / amarante`; English aliases `ramdana`, `rajgira`; French alias `grains d'amarante`. It remains the whole-seed/grain identity, with null density and no unit mappings.
- `ingredient-ref-amaranth-flour` — `amaranth flour / farine d'amarante`; English aliases `rajgira flour`, `rajgira atta`, and `ramdana flour`. It has null density and no unit mappings.
- Other separate rows cover amaranth flakes, greens, puffed amaranth, and sprouted amaranth flour. None owns a grits phrase.
- `ingredient-ref-attieke`, barley grits, buckwheat grits, corn grits, hominy grits, and sorghum grits are separate active rows; none is an amaranth owner.

Archive review found no earlier focused `amaranth grits` or `amaranth groats` decision. The adjacent [R29 amaranth-meal review](wp02-a7-amaranth-meal-boundary-review-20261013-round29.md) held the ambiguous marketplace meal wording and unsupported French translations. R465 assesses the separately worded crushed-grain product candidate; it does not reopen R29 or change the prior French-term hold.

## Phrase-first picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, ligatures, punctuation, and spaces; prefers complete word-phrase matches; and falls back to substring matching only when no phrase result exists. Displays, aliases, and attached form terms were included.

| Query | Current result | R465 effect |
|---|---|---|
| `amaranth grits`; `amaranth grit`; `crushed amaranth grits`; `amaranth groats`; `crushed amaranth groats` | No result. | Remains unassigned; no redirect to whole amaranth grain or flour. |
| `gruau d'amarante`; `semoule d'amarante` | No result. | No French phrase is assigned. |
| `grits` | Six: attiéké (through `steamed cassava grits`), barley grits, buckwheat grits, corn grits, hominy grits, and sorghum grits. | Unchanged. A future English `amaranth grits` row would add a seventh result. |
| `grit` | One: sorghum grits, through its singular alias. | Unchanged. A plural-only `amaranth grits` name would not become a singular alias. |
| `groats`; `groat` | Six: canary seed groats, hulled barley (through `barley groats`), oat groats, raw buckwheat groats, roasted buckwheat groats, and spelt berries (through `spelt groats`). | Unchanged. Adding the source wording `amaranth groats` would broaden this generic search by one. |
| `amaranth`; `amarante` | Six: amaranth flakes, flour, grain, greens, puffed amaranth, and sprouted amaranth flour. | Unchanged. A future separate row with an English `amaranth grits` or `amaranth groats` term would add a seventh family result, but no product-matched French name is established. |

Adding any of these phrases to the whole-grain row would route a crushed product name to whole amaranth. Adding a new row or alias would broaden the corresponding `amaranth`, `grits`, or `groats` searches; the available product wording does not establish a stable bilingual catalog label. These are static query projections, not UI tests.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were read and parsed. The full serialized recipe JSON and each ingredient row were searched using the picker's lowercase, NFKD accent/ligature folding, punctuation normalization, and phrase normalization. The search covered `amaranth grits`, `amaranth grit`, `crushed amaranth grits`, `amaranth groats`, `amaranth groat`, `crushed amaranth groats`, `crushed amaranth`, `amaranth meal`, `amaranth flour`, `amaranth`, `amarante`, `farine d'amarante`, `grains d'amarante`, `gruau d'amarante`, and `semoule d'amarante`.

Results: **0 recipe-file hits, 0 ingredient-row hits, and 0 direct links** to an amaranth-grits ID. No bundled recipe requires a link, relink, form, amount, or substitution for this candidate.

## Forms, measurements, yields, and substitutions

- The Ukrainian product page specifies a 900 g package, which is package mass, not a household measure. It provides no particle-size range, sieve, volume-to-mass relation, or standardized milling specification [S01].
- The Ukrainian page gives product-specific cooking directions: water or milk at a stated 1:2 or 1:3 ratio, 5–10 minutes of simmering, and 2–3 minutes of resting [S01]. The ratio's units/basis are unstated, and it is one Ukrainian supplier's preparation guidance. Do not turn it into a general conversion, yield, or active measure. The page's 75–100 g daily health recommendation refers to porridge and does not define a dry-product serving basis [S01].
- Although the Ukrainian page identifies a crushed product, do not attach a `crushed` form to whole amaranth grain or define a same-ingredient conversion: the same product code's English detail page labels it wholegrain, and no source states a reusable form boundary [S01–S03].
- Do not transfer any amaranth-flour serving or baking advice to the grits candidate. R29's `1/8 cup (30 g)` observation and up-to-25% flour-replacement statement concern a specific finely milled amaranth flour product, not a crushed-grain product.
- No source provides a density, reusable household measure, volume-to-mass mapping, yield, or measured conversion for amaranth grits. Add none.
- No source validates replacing amaranth grits with whole amaranth, amaranth flour, amaranth meal, or another grain's grits. Add no global conversion, contextual substitution rule, recipe association, or recipe-line link.

## Source register

External pages were checked on 2026-10-17. S01–S07 IDs are local to this proposal and do not create ledger entries. Existing ledger sources are explicitly marked as reused.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **Proposal-local** `WP02-A7-AMARANTH-GRITS-R465-20261017-S01` | Amarant Ukraine, [Amaranth groats, crushed, 900 g, product code 025 (Ukrainian page)](https://amarantshop.com.ua/uk/amarantovaya-krupa/amarantovaya-krupa-900-gr.html). | Current manufacturer page titles the item `Амарантова крупа без глютену 900 г (подрібнена)`, identifies model 025, describes it as crushed and faster-cooking than whole grain, and gives product-specific preparation instructions. | The site serves Ukraine and does not establish Canada/Québec availability or a product-matched French name. It gives no sieve, particle-size, or milling-grade specification. The 900 g amount is package mass. |
| **Proposal-local** `WP02-A7-AMARANTH-GRITS-R465-20261017-S02` | Amarant Ukraine, [Amaranth grain gluten-free wholegrain 900 g, product code 025 (English page)](https://amarantshop.com.ua/en/amarantovaya-krupa/amarantovaya-krupa-900-gr.html). | English-localized detail for the same model 025 titles it wholegrain amaranth and discusses grain and “the groats from it.” It establishes the language-version conflict. | The English page is stale/cached relative to the current Ukrainian product page and should not override the current product details. Its generic `groats` wording does not itself define a crushed product. |
| **Proposal-local** `WP02-A7-AMARANTH-GRITS-R465-20261017-S03` | Amarant Ukraine, [Gluten-free amaranth grain category](https://amarantshop.com.ua/en/amarantovaya-krupa/), manufacturer category listing. | The accessed English page identifies 5 kg and 25 kg variants as `Amaranth groats ... (crushed)`; a search-indexed rendering of the 900 g listing has used `Crushed Amaranth Grits`. Supports a crushed product and illustrates unstable English labels across page versions. | The available English page copy is stale/inconsistent, and the indexed 900 g wording is not a stable product specification. No particle-size boundary or Canadian/Québec name is given. |
| **Proposal-local** `WP02-A7-AMARANTH-GRITS-R465-20261017-S04` | Canadian Food Inspection Agency, [Multi-Mycotoxins in Milled Grain Products and Grain-based Foods, 2015–2018](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/viruses-imported-frozen-scallops-0), Table 1. | CFIA says samples came from retail in six Canadian cities including Montréal. The amaranth row lists flour and grain; other rows explicitly include grits for some grains. | Historical targeted survey only. Its sample categories are not a current market census, product standard, or proof that amaranth grits are unavailable in Canada. The same report URL is cited in WP02 Section 04 B3 R139 S08; that earlier proposal source ID is proposal-local, not a ledger allocation. |
| **Proposal-local** `WP02-A7-AMARANTH-GRITS-R465-20261017-S05` | Ardent Mills, [Amaranth flour & grains](https://www.ardentmills.com/products/alternative-grains/gluten-free-ancient-grains/amaranth/), manufacturer product page. | Lists amaranth formats as custom multigrain blends, flours, and whole seeds. This is additional context for keeping the existing whole-seed and flour identities distinct. | U.S.-based commercial product overview, not a Canadian/Québec retail census. Its listed formats do not prove absence elsewhere or define the Ukrainian product. |
| **Proposal-local** `WP02-A7-AMARANTH-GRITS-R465-20261017-S06` | Gaspésie Gourmande, [La Minoterie des Anciens inc.](https://gaspesiegourmande.com/producteurs-transformateurs?id=498), current Québec producer portfolio. | Lists amaranth among the mill's flours and names `gruau d'avoine nue` separately. It supports the local amaranth-flour product and shows that this mill's `gruau` wording is specifically oat groats. | Regional producer directory/portfolio rather than a complete SKU list or product label; it cannot prove that no other Québec amaranth-grits product exists. |
| **Proposal-local** `WP02-A7-AMARANTH-GRITS-R465-20261017-S07` | Moulin Abénakis, [Amarante biologique en grains](https://moulinabenakis.com/products/amarante-grains-bio), Québec manufacturer product page. | Names a local whole-grain amaranth product `Amarante biologique en grains`, supporting the existing French wording for whole grain. | It names the whole product only; it neither names grits nor translates a crushed product. |
| **Reused — ledger** `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S06` | Aliments du Québec / Pure Gaspésie, [Farine d'amarante biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-damarante-biologique). | Québec food-directory listing names a local organic amaranth-flour product from La Minoterie des Anciens and supports the existing French flour wording. | Flour evidence only, not a grits product or translation. The page was available through the current search index, but a direct fetch was unavailable during this review; reuse the existing ledger source record without claiming a new direct-page verification. |
| **Reused — ledger** `WP03-S23` | Office québécois de la langue française, [amarante (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), entry 26503667. | Supports Québec French `amarante` for English `amaranth` and notes seeds can be milled into flour or used whole. | Names the plant/base ingredient, not a grits product or the compound `semoule d'amarante`. |
| **Reused — ledger** `WP03-BW-GROATS-QC-20261011-S01` | Office québécois de la langue française, [gruau (GDT), food/dish entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), updated 2002. | Defines Québec/Canada `gruau` as a cooked dish based on oat flakes and notes the dish sense can extend to other cereals. | Prepared-dish sense; not a dry amaranth grits product name. |
| **Reused — ledger** `WP03-BW-GROATS-QC-20261011-S02` | Office québécois de la langue française, [gruau (GDT), malt-crushing entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), dated 1983. | Records a technical milling sense with English `grits` and descriptions of fine/coarse grain fractions. | The entry is scoped to malt crushing and technical milling; it does not establish `gruau d'amarante` for a Québec consumer product. |

This recommendation is limited to the amaranth-grits candidate. It leaves the open A7 parent item and all earlier amaranth-grain, flour, and meal decisions unchanged.

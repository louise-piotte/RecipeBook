# WP03 Section F — `uruchimai` rice boundary review (R87)

## Review record

- **Reviewed:** 2026-10-13.
- **Open checklist:** `[ ] Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.` ([live plan, line 2814](../../RecipeBook-global-ingredient-catalog-plan.txt#L2814)).
- **Candidate:** Japanese `uruchimai` / `uruchi rice`, the ordinary non-glutinous rice named in contrast to `mochigome`.
- **Recommendation: Add two English-search aliases to the existing generic rice reference.** Append `uruchi rice` and `uruchimai` to `ingredient-ref-rice` (`rice / riz`); do not add a new row or French alias. The Government of Japan calls `uruchi rice` common Japanese rice when contrasting it with `mochigome`; MAFF separately distinguishes ordinary table rice from glutinous and brewing rice. Tiger attests `Uruchimai` as a spelling, but its page specifically describes short-grain rice, so the alias is only a search route and does not assert grain length, Japonica, or sushi use. Keep the integrated R86 `mochigome` alias unchanged.
- **Work boundary:** Proposal only. No shared catalog, ledger, checklist, roadmap, application code, generated file, or batch README was edited.

## Source-defined identity and Québec French boundary

The candidate is not a prepared cereal or rice form. MAFF distinguishes three rice types: `uruchi` (rice eaten as rice/table rice), glutinous `mochi`, and brewing rice [S02]. Its washoku guide treats rice grain length/type (Indica and Japonica) separately from the glutinous/non-glutinous distinction [S03]. The Government of Japan’s English-language botamochi feature directly calls `uruchi rice` “common Japanese rice” and contrasts it with `mochigome` (glutinous rice) [S08]. Together these sources support routing the common-rice term to the existing generic rice owner, which keeps glutinous rice as a separate identity; they do not establish that every `uruchi` rice is short-grain, Japonica, or a cultivar.

Tiger Corporation’s current English consumer guide writes **Uruchimai** and glosses it as “non-glutinous short-grain rice” [S01]. MAFF’s Hokkaido sekihan page also calls one ingredient **Uruchi rice** and contrasts it with glutinous rice [S04]. The Government of Japan source provides a second, broader English gloss, “common Japanese rice,” for `uruchi rice` [S08]. These sources support both spellings as lookup terms, while the Tiger page’s short-grain scope remains a limit on product equivalence. The 2026 MEXT food-composition record uses `うるち米` for **well-milled raw non-glutinous rice** [S05], a narrower product state than an all-state Japanese rice identity. The aliases route search to the existing `rice / riz` base and do not claim that all rice is uruchi rice.

The Québec-facing Mito page uses **riz uruchimai**, but describes it as a synonym for sushi rice and as a specific short-grain Japanese rice [S06]. That is direct local French wording from a sushi business, not a terminology ruling or a bilingual standalone-grain label. The Québec Food Directory separately lists **Riz Calrose à Sushi** and describes that SKU as medium-grain Calrose/Japonica rice [S07]. Keep those product/use descriptions out of aliases: add no French `riz uruchimai` or `riz à sushi` alias, and add no `Japanese rice`, `riz Japonica`, `non-glutinous rice`, `riz non gluant`, or `short-grain rice` alias. Preserve the existing Québec French display `riz`.

## Live ownership and archive audit

The post-R86 package has **1,418 references, 104 forms, 63 legacy candidates, and 1,757 research-ledger records**; the manifest contains **114 recipes and 1,123 ingredient rows** ([R86 integration README](../batches/wp02-wp03-wp04-r86-integration-20261013/README.md#L9)). Exact archive and live-data searches found no focused `uruchimai` / `uruchi rice` decision, active owner, legacy candidate, or ledger candidate. The R86 [mochigome proposal](wp03-section-f-mochigome-alias-review-r86-20261013.md) mentions `uruchi` only as the source’s contrast term and does not decide its ownership.

| Current owner | Current fields | R87 boundary |
|---|---|---|
| [`ingredient-ref-rice`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L13742) | `rice / riz`; English alias `chawal`; category `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []`. Its [ledger record](../research-ledger.v1.json#L90809) is verified, with measurement and substitution research still open. It has separate generic `dry` and `cooked` forms. | Correct search owner for the source-attested ordinary table-rice term because glutinous rice has a separate identity. Add only `uruchi rice` and `uruchimai` as English-search aliases; keep the bilingual display generic. |
| [`ingredient-ref-short-grain-rice`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L14995) | `short-grain rice / riz à grain court`; no aliases. | Grain length alone does not encode the non-glutinous class; do not attach `uruchimai` here. |
| [`ingredient-ref-medium-grain-rice`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L10078) and [`ingredient-ref-calrose-rice`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L2796) | Separate grain-length/variety owners. | Keep them distinct; the Québec sushi listing confirms Calrose may be medium grain. |
| [`ingredient-ref-glutinous-rice`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L6856) | `glutinous rice / riz gluant`, aliases include `mochigome`. | Preserve the R86 accepted identity and alias; `uruchimai` is its contrasting class, not an alias of this row. |
| Exact candidate | No active reference, form, legacy candidate, or prior ledger decision owns `uruchimai`, `uruchi rice`, or `uruchi-mai`. | No new row or candidate ledger record. Append only the two supported English-search aliases to `ingredient-ref-rice`; add no French alias. |

## Recipe demand

I searched all **114 manifest-listed recipe files and 1,123 ingredient rows** for `uruchimai`, `uruchi`, `uruchi rice`, `non-glutinous rice`, `non glutinous rice`, `riz uruchimai`, and `riz non gluant`. There were **zero matching recipe files and zero matching ingredient rows**. Generic rice recipe rows do not establish demand for this rice class. Add no recipe link or quantity.

## Picker projection

`IngredientSearch.kt` folds accents and punctuation, searches complete word phrases before its substring fallback, and indexes each reference’s display names and aliases ([picker, lines 9–20 and 23–44](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9)). A local static projection against current references and forms, followed by the proposed aliases on `ingredient-ref-rice`, gives:

| Query | Current result | After proposed aliases |
|---|---|---|
| `uruchimai`, `uruchi rice` | No results. | `ingredient-ref-rice` only. |
| `uruchi` | No result. | `ingredient-ref-rice` only by substring fallback. |
| `non-glutinous rice`, `riz uruchimai`, `riz non gluant` | No results. | No results; no broader English or French aliases are added. |
| `short-grain rice` / `riz à grain court` | `ingredient-ref-short-grain-rice` only. | Unchanged: `ingredient-ref-short-grain-rice` only. |
| `glutinous rice` | Five current grain/flour rows, including generic and black glutinous rice plus glutinous-rice flours. | Unchanged. |
| `rice` / `riz` | 56 / 51 rows, respectively. | Same 56 / 51 rows; the generic row was already present. |
| `sushi rice` / `riz à sushi` | No active result. | No active result. |

The exact Japanese terms route to the existing generic `rice / riz` display; no grain-length, sushi, or French claim is attached to the result. Keeping the aliases on the generic owner also avoids assigning a starch distinction to the short-grain row. The broad `rice` and `riz` result sets do not gain additional rows, and glutinous rice remains separately searchable.

## Identity, forms, measurements, conversion, yield, and substitution

| Dimension | Evidence limit and R87 action |
|---|---|
| **Identity** | MAFF and the Government of Japan support `uruchi rice` as ordinary table/common Japanese rice, distinguished from glutinous rice; Tiger attests `uruchimai` but describes short-grain rice. Map these spellings to the existing generic rice search owner without creating a new taxonomy row or claiming a short-grain/Japonica/sushi equivalence. |
| **French naming** | The only Québec `riz uruchimai` usage found is sushi-specific. Keep `riz` as the display and add no French alias. |
| **Forms** | `uruchimai` is a rice identity/class, not a cooked state. The generic rice row’s `dry` and `cooked` forms cannot be copied to a new class without a decision to allocate one. Add no form. |
| **Measurements and density** | MEXT item 01083 reports 100 g = 120 mL, 100 mL = 83 g, and 90–91% yield for its **raw, well-milled, non-glutinous rice** sample [S05]. Tiger says 1 go is about 150 g in its rice-cooker guide [S01]. These are source-specific data and do not establish a Canada/US cup mapping, a universal density, or values for brown/other milling states. Add no density or unit mapping. |
| **Conversion and yield** | MEXT’s yield note is for its food-composition sample, not a reusable raw-to-cooked conversion. No candidate-specific cooking expansion or package yield is adopted. Add no conversion or yield. |
| **Substitution** | MAFF’s Hokkaido sekihan page gives a 1:1 glutinous/Uruchi mixture for one version and explicitly says households vary the ratio [S04]. This is one prepared dish, not a general replacement ratio. Add no global or contextual substitution rule; the `ingredient-ref-rice` ledger state remains unchanged. |

## Exact prospective JSON delta

Append only these English-search aliases to the existing generic rice reference; keep all other fields unchanged:

```json
{
  "id": "ingredient-ref-rice",
  "aliasesEn": ["chawal", "uruchi rice", "uruchimai"]
}
```

Do not add a French alias, reference, form, ledger candidate, measure, conversion, yield, recipe link, or substitution. No tests or emulator checks apply to this proposal-only review; no app tests, Gradle tasks, emulator, or deployment were run.

For the existing `ingredient-ref-rice` research-ledger record, append the following four source records and one accepted decision. Keep `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched` unchanged; do not add a candidate record. These ledger sources support the English alias mapping only. Numeric, French terminology, and dish-specific boundaries remain documented in this proposal without changing ledger research states.

```json
[
  {
    "sourceId": "WP03-URUCHI-R87-20261013-S01",
    "url": "https://www.tiger-corporation.com/en/usa/magazine/weekly-tips/ricecooker2/",
    "title": "Tiger Corporation, How to Cook Delicious Rice: A Guide to the Basic Steps Using a Rice Cooker",
    "versionOrDate": "2026-04-03",
    "accessedOn": "2026-10-13",
    "locator": "Type and Freshness of Rice",
    "supports": "Attests the romanized spelling Uruchimai but describes it as non-glutinous short-grain rice; supports the spelling as a lookup term without establishing all uruchimai as short-grain.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP03-URUCHI-R87-20261013-S02",
    "url": "https://www.maff.go.jp/j/seisan/syoryu/kensa/kome/k_kikaku/k_kaisetsu/",
    "title": "Ministry of Agriculture, Forestry and Fisheries, Inspection terminology for rice",
    "accessedOn": "2026-10-13",
    "locator": "Types of paddy rice; uruchi, mochi, and brewing rice",
    "supports": "Classifies uruchi as rice eaten as rice/table rice and distinguishes it from glutinous mochi rice and brewing rice; supports routing ordinary-rice search wording to the generic rice owner, not a grain-length or preparation claim.",
    "sourceKind": "regional_authority"
  },
  {
    "sourceId": "WP03-URUCHI-R87-20261013-S04",
    "url": "https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/1072/index.html",
    "title": "Ministry of Agriculture, Forestry and Fisheries, Sekihan (Red rice), Hokkaido",
    "accessedOn": "2026-10-13",
    "locator": "Ingredients and preparation",
    "supports": "Uses the English ingredient name Uruchi rice and contrasts it with glutinous rice in one regional dish; its variable household ratio is not used as a substitution rule.",
    "sourceKind": "regional_authority"
  },
  {
    "sourceId": "WP03-URUCHI-R87-20261013-S08",
    "url": "https://www.gov-online.go.jp/video/cao/dl/public_html/gov/pdf/hlj/20140301/20140301all.pdf",
    "title": "Government of Japan, Government Online, Botamochi feature",
    "accessedOn": "2026-10-13",
    "locator": "Botamochi ingredient description",
    "supports": "Calls uruchi rice common Japanese rice and contrasts it with mochigome (glutinous rice); supports the English ordinary-rice search term, not a Canadian retail or Québec French name.",
    "sourceKind": "regional_authority"
  }
]
```

Append this decision to the same record’s `decisions` array:

```json
{
  "outcome": "accepted",
  "reason": "Add only uruchi rice and uruchimai as English-search aliases on the existing generic rice identity. Government of Japan and MAFF sources support uruchi rice as ordinary table/common Japanese rice distinct from glutinous rice; Tiger attests Uruchimai as a spelling but specifically describes short-grain rice. Route both queries to rice / riz without adding a new identity, French alias, or grain-length, Japonica, or sushi claim. Keep existing forms, numeric fields, measurement research state, and substitution research state unchanged; add no recipe link, conversion, yield, or substitution.",
  "sourceIds": [
    "WP03-URUCHI-R87-20261013-S01",
    "WP03-URUCHI-R87-20261013-S02",
    "WP03-URUCHI-R87-20261013-S04",
    "WP03-URUCHI-R87-20261013-S08"
  ]
}
```

The S08 URL is also cited by the R86 `mochigome` review under that rice record. This R87 use has its own source ID, which remains globally unique; reusing a primary source URL does not reuse its ledger ID.

## Sources

| ID | Source | What it supports and what it does not |
|---|---|---|
| `WP03-URUCHI-R87-20261013-S01` | Tiger Corporation, [How to Cook Delicious Rice: A Guide to the Basic Steps Using a Rice Cooker](https://www.tiger-corporation.com/en/usa/magazine/weekly-tips/ricecooker2/), 2026-04-03, “Type and Freshness of Rice” and measuring guidance. | Names `Uruchimai` and glosses it as non-glutinous short-grain rice. Its rice-cooker cup guidance is appliance/context-specific, not a Canadian recipe measure or a food-composition mapping. |
| `WP03-URUCHI-R87-20261013-S02` | MAFF, [Inspection terminology for rice](https://www.maff.go.jp/j/seisan/syoryu/kensa/kome/k_kikaku/k_kaisetsu/), section “Types of paddy rice.” | The Japanese official classification distinguishes `うるち` (uruchi), `もち` (glutinous), and brewing rice. It gives rice-type scope, not English or Québec French display wording. |
| `WP03-URUCHI-R87-20261013-S03` | MAFF, [Characteristics of Washoku](https://www.maff.go.jp/e/data/publish/attach/pdf/index-21.pdf), pp. 18–19, “Non-glutinous rice and glutinous rice.” | Separates Japonica/Indica from the non-glutinous/glutinous distinction and describes ordinary Japanese cooked rice use. It does not make all Japanese rice one short-grain SKU or provide Canadian terminology. |
| `WP03-URUCHI-R87-20261013-S04` | MAFF, [Sekihan (Red rice), Hokkaido](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/1072/index.html), ingredients and preparation. | Calls one component Uruchi rice, gives a 1:1 glutinous/Uruchi ratio for one recipe, and says the ratio varies by household. Not a generic substitution or yield source. |
| `WP03-URUCHI-R87-20261013-S05` | Ministry of Education, Culture, Sports, Science and Technology (MEXT), [Standard Tables of Food Composition in Japan, item 01083](https://fooddb.mext.go.jp/details/foodInfo.pl?ITEM_NO=1_01083_7&VIEW_POPUP=1). | Identifies `精白米/うるち米` as raw, well-milled, non-glutinous rice and reports 100 g = 120 mL, 100 mL = 83 g, and 90–91% yield. Those numeric observations remain specific to this food-composition sample. |
| `WP03-URUCHI-R87-20261013-S06` | Mito, [Tout savoir sur le riz à sushi](https://mito.ca/riz-sushi/), published 2025-07-21, “Qu’est-ce que le riz à sushi ?” | Uses Québec French `riz uruchimai`, but equates it with sushi rice/Japonica and describes a short-grain sushi use. This is a local culinary page, not an OQLF term decision or standalone product label; it does not settle the broader MAFF/MEXT scope. |
| `WP03-URUCHI-R87-20261013-S07` | Québec Food Directory, [Riz Calrose à Sushi](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8248531), product data updated 2026-07-08. | Lists a Québec product as Calrose/Japonica medium-grain rice for sushi and other Asian dishes, with Calrose rice as ingredient. The 45 g serving and 5 kg package are SKU records, not `uruchimai` measures. |
| `WP03-URUCHI-R87-20261013-S08` | Government of Japan, Government Online, [Botamochi feature](https://www.gov-online.go.jp/video/cao/dl/public_html/gov/pdf/hlj/20140301/20140301all.pdf), “Botamochi.” | Search-indexed English text explicitly says regular botamochi uses `uruchi rice (common Japanese rice)` and `mochigome (glutinous rice)`. This supports the ordinary-rice English term and its contrast with glutinous rice; direct PDF opening returned an internal error in the web reader, so it supplements the MAFF classification and is not a Canadian retail or Québec French source. |

## Static review record

Static checks passed on this revised proposal: all eight R87 source IDs are unique and have no collisions in the live ledger, proposal, batch, or bundled-data archives; all 18 Markdown links resolve locally or use HTTP(S), and all 10 local targets and line anchors resolve; the file is UTF-8 without a BOM or trailing whitespace and has no mojibake markers. The current reference, forms, ledger, legacy-candidate, manifest, and recipe JSON files parsed successfully; counts matched 1,418 / 104 / 1,757 / 63 / 114 / 1,123. The reference delta, four ledger source objects, and accepted-decision object parse as JSON. The proposed update appends only `uruchi rice` and `uruchimai` to `aliasesEn`, plus those four sources and one accepted decision to the existing rice ledger record; `identityState`, `measurementState`, and `substitutionResearchState` remain unchanged, and no candidate record is proposed. A static projection using the current picker matching rules returns only `ingredient-ref-rice` for `uruchimai`, `uruchi rice`, and `uruchi` after the aliases; short-grain and glutinous results are unchanged, `sushi rice` and French sushi/uruchimai queries remain unmatched, and broad `rice`/`riz` result counts remain 56/51. The primary source URLs in S01–S08 were checked; S08 is search-indexed and its PDF direct open returned an internal reader error. No app tests, Gradle tasks, emulator, or deployment were run.

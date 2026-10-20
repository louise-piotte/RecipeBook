# WP02 Section 04 A6 R162 — red sorghum grain and flour name coverage

## Review record

- **Reviewed:** 2026-10-16; current Canadian listings and source pages checked on this date.
- **Status:** Proposal only. This file changes no shared catalog JSON, ledger, generated code, recipes, plan, roadmap, or batch README.
- **Open checklist:** Continue the A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours in [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1469). R161 integrated dark buckwheat flour; the broad A6 parent remains open.
- **Scope:** Decide whether the exact English product names `red sorghum` and `red sorghum flour` should be searchable on the existing grain and flour references.
- **New reference IDs:** None proposed. The names belong on the existing sorghum-grain and sorghum-flour identities.
- **Proposal-local source IDs:** `WP02-A6-RED-SORGHUM-ALIASES-R162-20261016-S01` through `S06`. They have not been added to the shared ledger.

## Recommendation

**Add `red sorghum` as an English alias on `ingredient-ref-grain-sorghum`, and `red sorghum flour` as an English alias on `ingredient-ref-sorghum-flour`.** Add no French alias and create no red-sorghum-specific reference. Current Canadian listings use the grain-qualified phrase `Red Sorghum (Jowar)` for a grain product and name separate red and white sorghum flour products. A flour miller also describes its red sorghum flour as whole sorghum flour made from red sorghum grains. These names support two existing product classes with a shared red-grain qualifier [S01–S04].

The paired aliases preserve the picker choice for the shorter query `red sorghum`: it returns both the grain and the flour. The more specific query `red sorghum flour` returns only the flour. This avoids assigning the bare color-qualified grain name to flour alone. Do not add `red jowar`, `red jowar flour`, `red sorgho`, or `farine de sorgho rouge`; those exact bilingual product names are not established by current Québec-facing sources. Keep the French display `farine de sorgho` and the grain display `sorgho à graine` unchanged [S01, A1–A3].

Treat red as a product-name qualifier for the existing sorghum identities, not as evidence for a separately standardized cultivar, milling specification, French grade name, or transferable measure. FAO notes that grain-sorghum kernels can be red among other colors; it does not make red a distinct flour process or a measure of composition [S06]. The CFIA crop document identifies domesticated sorghum as *Sorghum bicolor* and describes grain and food uses, including flour [S05].

## Product and naming boundary

| Surface | Decision | Evidence boundary |
|---|---|---|
| `red sorghum` | Add as an English alias to `ingredient-ref-grain-sorghum`. | A current Ontario retailer lists `Red Sorghum (Jowar)` as an in-stock grain product. The listing supports the phrase and market category, not a particular cultivar or botanical line on the package [S01]. |
| `red sorghum flour` | Add as an English alias to `ingredient-ref-sorghum-flour`. | A Canadian importer lists separate red, white, and fermented sorghum-flour products; an Ontario retailer lists `Massa Red Sorghum Flour`; a miller lists `Red Sorghum Flour` made from red sorghum grains [S02–S04]. These support the product phrase, not a universal red-flour specification. |
| `sorghum flour` / `farine de sorgho` | Keep as the existing display pair on `ingredient-ref-sorghum-flour`. | Codex names sorghum flour as a product, and OQLF's preferred French crop term is `sorgho`; the current French display remains unchanged [A1, A3]. |
| `grain sorghum` / `sorgho à graine` | Keep as the existing display pair on `ingredient-ref-grain-sorghum`. | The grain reference remains separate from flour and other processed sorghum products [A2, A3]. |
| `red jowar` / `red jowar flour` | Do not add. | The current Canadian grain title presents `Jowar` in parentheses after `Red Sorghum`, but it does not attest these exact phrases. Do not construct extra aliases from that title [S01]. |
| `farine de sorgho rouge` / `red sorgho` | Do not add. | No current Québec product listing reviewed here uses these exact terms. Keep the current generic French display and aliases. |
| Fermented sorghum flour, sorghum grits, semolina, starch, puffed sorghum, and grain forms | Keep their current identities unchanged. | The importer lists fermented flour separately; the active catalog already separates grits, semolina, starch, and puffed grain. No source establishes a red-qualified equivalence to those products [S02, A4]. |

## Proposed alias delta

If accepted, change only the following alias arrays; preserve the other fields on both rows:

~~~json
{
  "id": "ingredient-ref-grain-sorghum",
  "aliasesEn": ["jowar whole", "guinea corn", "red sorghum"]
}
~~~

~~~json
{
  "id": "ingredient-ref-sorghum-flour",
  "aliasesEn": [
    "jowar flour",
    "jowar atta",
    "guinea corn flour",
    "sweet white sorghum flour",
    "red sorghum flour"
  ]
}
~~~

Keep both French alias arrays, displays, categories, `defaultDensity`, and `unitMappings` unchanged. Do not add a new reference or ledger candidate.

## Exact ownership, source-ID, and archive audit

The post-R161 package snapshot contains **1,537 ingredient references, 119 forms, 61 legacy-import candidates, and 1,882 research-ledger records**. The bundled manifest lists **114 recipes**.

Exact phrase ownership was checked across normalized reference IDs, English/French displays and aliases, every form field, legacy-candidate fields, and ledger record IDs. Normalization follows lowercase, Unicode NFKD/accent folding, punctuation-to-space conversion, and whitespace collapsing, as in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Key or surface | Current owner or result |
|---|---|
| `red sorghum`, `red sorghum flour`, `red jowar`, `red jowar flour`, `farine de sorgho rouge` | No exact active reference, form, legacy-candidate, or ledger-record owner. |
| `ingredient-ref-red-sorghum-flour`, `candidate-red-sorghum-flour` | No active reference, legacy-candidate, or ledger-record ID. Neither is proposed. |
| `ingredient-ref-grain-sorghum` | Existing grain row displayed as `grain sorghum / sorgho à graine`; current English aliases are `jowar whole` and `guinea corn`. |
| `ingredient-ref-sorghum-flour` | Existing flour row displayed as `sorghum flour / farine de sorgho`; current English aliases include `jowar flour`, `jowar atta`, `guinea corn flour`, and `sweet white sorghum flour`. The French alias `farine douce de sorgho blanc` remains unchanged. |
| Forms, package yields, and substitutions | No sorghum form or package yield exists. There are no active global or contextual substitution rules for sorghum products. |
| A6 archive | No prior A6 proposal or integration assigns `red sorghum` to the grain row or `red sorghum flour` to the flour row. R152 added the exact `sweet white sorghum flour` name to the existing flour identity; this proposal covers the separate red-qualified name. R158's `jowari flour` hold remains unchanged: its shorter phrase would have selected flour without a grain result, while this proposal pairs the red grain and flour aliases [A5–A6]. |
| Related archive mention | The R23 Section F sorghum-grits proposal cites Anson Mills listing African Red Sorghum Flour, grits, and meal as distinct products. That source supports the distinctions but did not add either red alias or decide A6 name ownership [A4]. |
| Proposal-local source IDs | The six IDs `WP02-A6-RED-SORGHUM-ALIASES-R162-20261016-S01` through `S06` are absent from the current ledger and the prior proposal/batch archive. Existing IDs A1–A3 are reused without reallocation. |

## Static picker projection

Projection follows the app's phrase-first search over each reference's displays and aliases. This is a static review; no runtime picker or emulator test was run.

| Query | Current result | Projected result if accepted |
|---|---|---|
| `red sorghum flour` | No result. | `ingredient-ref-sorghum-flour` only. |
| `red sorghum` | No result. | `ingredient-ref-grain-sorghum` and `ingredient-ref-sorghum-flour`. |
| `red` | 35 references. | 37 references, including both sorghum rows; the query remains a broad list. |
| `sorghum flour` | `ingredient-ref-sorghum-flour` only. | Unchanged. |
| `grain sorghum` | `ingredient-ref-grain-sorghum` only. | Unchanged. |
| `sorghum` | Six existing sorghum-related references. | Unchanged. |
| `farine de sorgho` | `ingredient-ref-sorghum-flour` only. | Unchanged. |
| `farine de sorgho rouge` | No result. | Unchanged; no French alias is proposed. |

## Manifest recipe demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned across recipe strings and ingredient-row fields for `red sorghum`, `red sorghum flour`, `red jowar`, `red jowar flour`, `farine de sorgho rouge`, and both existing sorghum reference IDs. There were **zero phrase hits in recipe files and zero candidate phrase hits in ingredient rows**. There is no candidate-specific recipe demand or recipe link to add.

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Add none. No sorghum forms are present in the package.
- **Measurements and density:** Add no measure, density, or unit mapping. Package masses are not kitchen measures. Green Star's recipe quantities belong to its named recipes and do not establish generic flour density. Keep the existing Westpoint 3 tbsp / 30 g label observation restricted to that named product; do not transfer it to red sorghum flour.
- **Conversions and yields:** Add none. The sources do not establish a general grain-to-flour milling yield or a home-cooking conversion.
- **Substitutions:** Add no substitution finding or rule. Green Star's red-flour recipes demonstrate its own recipes, not a tested replacement ratio. Keep the existing blocked substitution research on `ingredient-ref-sorghum-flour` unchanged.
- **Recipe links:** Add none; the manifest scan found no candidate demand.

## Proposed ledger delta

If accepted, attach the new source records and one accepted name decision to each existing ledger record. The grain record uses S01, S05, and S06; the flour record uses S02, S03, S04, S05, and S06. Reuse existing sources A1–A3 where helpful. Keep current measurement observations and the blocked sorghum-flour substitution finding unchanged. Add no measurement observations or substitution findings.

## Source register

| ID | Source and locator | Supports and limits |
|---|---|---|
| **S01 — WP02-A6-RED-SORGHUM-ALIASES-R162-20261016-S01** | TastyGrains, [Millets & Millet Products](https://www.tastygrain.ca/collections/millet-items), `Red Sorghum (Jowar)` listing; accessed 2026-10-16. | Current Ontario seller lists the grain product and an add-to-cart control. Its product name supports the exact phrase; no variety, package composition, or flour claim is inferred. |
| **S02 — WP02-A6-RED-SORGHUM-ALIASES-R162-20261016-S02** | Massa Industries Ltd. (Canada), [Products](https://www.massaindustries.com/products), dry-food listing; accessed 2026-10-16. | The Canadian importer/distributor lists Massa Red sorghum flour, Massa White sorghum flour, and Massa fermented sorghum flour separately. It supports market naming and product distinction, not detailed flour composition or a French label. |
| **S03 — WP02-A6-RED-SORGHUM-ALIASES-R162-20261016-S03** | JD Best Afro-Caribbean Variety Market, [Massa Red Sorghum Flour 1kg](https://www.jdbestmarket.com/product-page/massa-red-sorghum-flour-1kg); indexed product result checked 2026-10-16. | The live search result names the exact product and locates the retailer in Oshawa, Ontario. Direct page retrieval returned a browser cache miss; availability and details beyond the displayed listing are not used. |
| **S04 — WP02-A6-RED-SORGHUM-ALIASES-R162-20261016-S04** | Green Star Organic Milling, [Sorghum Flour Red](https://www.greenstarmilling.com/products/sorghum-flour-red); accessed 2026-10-16. | The miller calls its product red sorghum flour, says it is made from red sorghum grains, and describes the product as whole-grain and finely milled. Its recipe and package-format details are source-specific and not generic measures, substitutions, or claims about Massa's product. |
| **S05 — WP02-A6-RED-SORGHUM-ALIASES-R162-20261016-S05** | Canadian Food Inspection Agency, [The Biology of Sorghum bicolor](https://inspection.canada.ca/en/plant-varieties/plants-novel-traits/applicants/directive-94-08/biology-documents/sorghum-bicolor-moench); accessed 2026-10-16. | Identifies *Sorghum bicolor* and describes domesticated sorghum grain and flour food uses. It does not classify the retailer's red product or define a red-grain flour grade. |
| **S06 — WP02-A6-RED-SORGHUM-ALIASES-R162-20261016-S06** | FAO, [Sorghum and millets in human nutrition, introduction](https://www.fao.org/4/T0818E/T0818E01.htm); accessed 2026-10-16. | Describes grain sorghum kernels ranging through red and other colors. This supports treating red as a grain color descriptor, not as a separate species or universal milling process. |
| **A1 — WP02-S33 (existing source, reused without reallocation)** | Codex, [Standard for Sorghum Flour (CXS 173-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B173-1989%2FCXS_173f.pdf). | Supports the existing sorghum-flour product category and French name; no red-specific specification is inferred. |
| **A2 — WP02-A6-JOWAR-FLOUR-20261012-S01 (existing source, reused without reallocation)** | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), §2.4.18. | Defines Jowar flour as Sorghum flour milled from *Sorghum bicolor*; supports the existing grain/flour family relationship, not a red-specific process. |
| **A3 — WP02-A6-JOWAR-FLOUR-20261012-S03 (existing source, reused without reallocation)** | OQLF, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho). | Supports retaining the current Québec French base term `sorgho`; it does not establish `farine de sorgho rouge`. |
| **A4 — WP03-SORGHUM-GRITS-20261013-S05 (existing source, archive context only)** | Anson Mills, [Products](https://www.ansonmillsdirecttochefs.com/collections/all). | Current catalog lists African Red Sorghum Flour, Grits, and Meal as separate products. Its price per pound is wholesale pricing, not a kitchen measure. The R23 grits review cited it for the grits boundary; it did not allocate this proposal's aliases. |
| **A5 — R152 alias decision** | [Sweet white sorghum flour review](wp02-a6-next-regional-flour-gap-review-r152-20261015.md) and [R152 integration](../batches/wp02-wp03-wp04-r152-gap-review-integration-20261015/README.md). | Existing English/French aliases `sweet white sorghum flour` and `farine douce de sorgho blanc` remain unchanged. The present proposal covers only directly attested red-qualified names. |
| **A6 — R158 picker-boundary hold** | [Jowari flour review](wp02-a6-next-regional-flour-gap-review-r158-20261016-jowari-flour.md) and [R158 integration](../batches/wp02-wp03-wp04-r158-gap-review-integration-20261016/README.md). | The `jowari flour` alias remains held because bare `jowari` would select flour alone. This proposal pairs `red sorghum` on both grain and flour rows so the same shorter-query issue returns both options. |

No app, unit, instrumentation, emulator, deployment, or build tests were run. This is a proposal-only review; under the current `AGENTS.md` rule, implementation limited to adding alias data in database JSON does not require tests.

# WP02 A6 — Tartary buckwheat flour identity review (R75)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, recipe, generated file, or test was changed.
- **Open checklist item:** Section 04 A6, [the open regional-grain-flour review](../../RecipeBook-global-ingredient-catalog-plan.txt#L1334): “Continue the A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours; keep grain-level teff naming separate from the flour identity.”
- **Scope:** A species-qualified human-food flour made from Tartary buckwheat (*Fagopyrum tataricum*). This review does not reopen the generic or sprouted buckwheat-flour identities, buckwheat meal, toasted or malted buckwheat flour, whole buckwheat grain, or processed buckwheat products.
- **Proposed ID:** `ingredient-ref-tartary-buckwheat-flour`; no active reference, form, legacy candidate, or ledger record owns this identity.
- **Proposal-local source prefix:** `WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013`, S01–S09. The prefix was checked against the current ledger and proposal/batch archive before drafting.
- **Recommendation:** Integrate one identity-only `FLOUR_AND_STARCH` row. Keep forms, recipe links, active density, unit mappings, conversions, yields, and substitution rules empty.

## Decision

Add **`Tartary buckwheat flour / farine de sarrasin de Tartarie`** as a separate identity for flour made from *Fagopyrum tataricum*. Kew accepts *F. tataricum* as a species; TERMIUM Plus lists `Tartary buckwheat` and the Canadian French plant name `sarrasin de Tartarie`. A current Canada-locale listing offers 250 g of “Tartar buckwheat flour” and declares the product as 100% tartar buckwheat. A Québec farm identifies its green buckwheat as Tartary buckwheat and lists a green buckwheat flour product. This supports a bounded species-qualified flour identity. [S01, S03–S06]

Use the provisional fr-CA display **`farine de sarrasin de Tartarie`**. The French compound is used in a current French product page, the plant name is supported by the Canadian terminology record, and the Québec farm directly connects its flour product to `sarrasin vert (sarrasin de Tartarie)`. No OQLF entry for this species-qualified flour name was located; do not describe the display as OQLF-approved. [S02–S06]

Add only the exact product wording that improves qualified search: English alias **`Tartar buckwheat flour`**, French alias **`farine de sarrasin tartare`**, and Québec product alias **`farine de sarrasin vert biologique`**. The local French alias is the farm’s exact product heading; it is not generalized to all products called green buckwheat. Do not add `tartare` alone, `green buckwheat flour`, `bitter buckwheat flour`, `sarrasin vert` alone, bare `Tartary`, or Latin botanical names. [S01–S06]

This is a different **source species**, not merely another name for the generic flour. Keep the new row separate from `ingredient-ref-buckwheat-flour`; do not move or narrow that row’s existing aliases. Species is not a preparation form, so do not model the new row as a form of generic flour. Keep it distinct from `ingredient-ref-sprouted-buckwheat-flour`: sprouting is a process qualifier, and no reviewed source establishes that the current sprouted product is made from Tartary buckwheat. [S03–S04, S07]

## Current ownership and archive audit

Read-only snapshot of the shared worktree on 2026-10-13:

| Surface | Current owner or state | R75 decision |
|---|---|---|
| Active ingredient references | 1,398 references. `ingredient-ref-buckwheat-flour` is `buckwheat flour / farine de sarrasin`, category `FLOUR_AND_STARCH`, with English aliases `kuttu atta`, `kuttu ka atta`, `kuttu flour`, and `soba-ko`; density is null and unit mappings are empty. `ingredient-ref-sprouted-buckwheat-flour` is `sprouted buckwheat flour / farine de sarrasin germé`, with `germinated buckwheat flour` as its English alias; density is null and mappings are empty. | Preserve both rows exactly. The R75 row is a species-qualified product with no existing exact owner. Existing OQLF and Canadian product evidence for the generic row remains `WP02-S25`, `WP02-S26`, and `WP02-S31`; the kuttu and sprouted decisions remain separate. |
| Related active references and forms | Other buckwheat references cover flakes, raw groats, roasted dry groats, sprouted dry groats, puffed buckwheat, creamy hot cereal, and soba noodles. No active ingredient form mentions buckwheat, Tartary, *Fagopyrum*, or sarrasin. | Add no form or alias to these neighboring identities. |
| Legacy identities | 63 candidates; no Tartary-buckwheat-flour or *Fagopyrum tataricum* owner. | No legacy reservation or collision. |
| Research ledger | 1,734 records. The generic buckwheat-flour record is verified, while its measurement and substitution states remain `not_yet_researched`. No Tartary-flour record or unresolved candidate exists. | Add a distinct record only if the identity row is accepted. Keep the generic record unchanged. Record the sample-only bulk-density observation without activating it. |
| Proposal and batch archive | No prior Tartary-flour decision or source-prefix collision. The A6 `kuttu` review concerns aliases for generic buckwheat flour; the sprouted-flour integration covers a process-qualified flour; the malted and toasted flour reviews concern separate processing boundaries; the buckwheat-meal review concerns an ambiguous coarse product. Current R74 covers Bambara groundnut flour under B2, not buckwheat. | This is a new A6 species-qualified candidate, not a repeat of those decisions. Keep all broader A6 and WP02 B2/B3 checklists open. |
| Recipe package | The manifest lists 114 recipe files and the scan counted 1,123 ingredient rows. | Zero phrase hits for Tartary/Tartar buckwheat flour, *Fagopyrum tataricum*, `sarrasin de Tartarie`, `farine de sarrasin tartare`, `farine de sarrasin vert`, or the reviewed product headings. No bundled recipe demand, recipe link, or line relink is proposed. |

The checked local archive includes the [generic kuttu alias review](wp02-a6-kuttu-buckwheat-flour-alias-review-20261012.md), [sprouted buckwheat-flour identity review](wp02-a6-sprouted-buckwheat-flour-identity-review-20261012.md), [malted buckwheat-flour boundary review](wp02-a7-malted-buckwheat-flour-boundary-review-20261013-round35.md), [toasted buckwheat-flour boundary review](wp02-a7-toasted-buckwheat-flour-boundary-review-20261013-round46.md), [buckwheat-meal boundary review](wp02-a7-buckwheat-meal-boundary-review-20261013-round23.md), and the [R74 proposal](wp02-next-a-b-flour-review-r74-20261013.md). None assigns Tartary flour to an active identity or decides the proposed aliases.

## Picker and search boundary

The projection below uses the current complete-phrase search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including its accent/punctuation normalization and substring fallback.

| Query | Current result | With proposed row |
|---|---|---|
| `Tartary buckwheat flour`; `Tartar buckwheat flour`; `farine de sarrasin de Tartarie`; `farine de sarrasin tartare`; `farine de sarrasin vert`; `sarrasin de Tartarie` | No result | `ingredient-ref-tartary-buckwheat-flour` only |
| `buckwheat flour`; `farine de sarrasin` | Generic and sprouted buckwheat-flour rows | Generic, sprouted, and Tartary buckwheat-flour rows |
| `sprouted buckwheat flour`; `germinated buckwheat flour`; `farine de sarrasin germé` | Sprouted buckwheat-flour row only | Same sprouted row only |
| `tartar` | `ingredient-ref-cream-of-tartar` | `ingredient-ref-cream-of-tartar` and `ingredient-ref-tartary-buckwheat-flour` |
| `sarrasin` | Nine buckwheat/sarrasin-related rows | Those nine rows plus Tartary buckwheat flour |

The specific product phrases resolve to the new row; no existing row loses an exact result. Broad flour searches intentionally expose three distinct choices rather than making the species-qualified product replace the generic or sprouted flour. The exact Canadian alias `Tartar buckwheat flour` does broaden the one-word query `tartar` to two results, which is disclosed here so the picker tradeoff is explicit; the complete source phrase remains unique. If the alias is omitted in a later review, only that broad-query expansion changes.

## Forms, measurements, conversions, yield, and substitution

### Forms and identity

The target is flour made from a distinct buckwheat species, not whole Tartary grain, a new flour process, or an extracted starch. The Québec farm’s product phrase `farine de sarrasin vert biologique` is linked on the same farm site to its `sarrasin vert (sarrasin de Tartarie)` crop. It is retained as a product-specific search alias only; it does not establish a general botanical meaning for every use of “green buckwheat.” The experimental flour study uses stone, roller, ultrafine, and wet milling, and varies whether seed is dehulled before milling. These are experimental methods and feedstock choices, not a stable consumer form taxonomy. Add no forms. [S05–S07]

### Measurement and density

The Canadian retail listing gives a 250 g package, which is net package mass rather than a household measure. The French-language product listing gives nutrition values per 100 g but no cup or spoon conversion. A 2016 study reports **0.68 ± 0.00 g/mL** bulk density for flour from one Shimla B-1 cultivar (`n=3`); its method weighs 10 g into a measuring cylinder tapped 10–12 times. That is a study-specific, compacted bulk-density observation, not a fill-level or household-volume measure. Keep the value in the ledger only with its method and cultivar context; leave `defaultDensity` null and `unitMappings` empty. [S01–S02, S08]

### Conversion and yield

No reviewed source provides a Tartary-flour mass-per-cup, spoon weight, standardized volume mapping, or a flour-milling yield applicable to the proposed identity. The 250 g retail package is not a volume conversion or preparation yield. Add no conversion, mapping, or yield. [S01–S02, S08]

### Substitution

The French product page describes one suggested bread blend of **25% common buckwheat flour, 25% Tartary buckwheat flour, and 50% wheat flour**. This is one product-page formula, not a transferable replacement percentage for wheat flour, common buckwheat flour, or another recipe. Experimental Tartary-flour studies likewise use defined cultivars and processing conditions; they do not establish a universal exchange rule. Record the 25:25:50 blend only as a source-specific recipe observation and add no global or contextual substitution rule. [S02, S07]

## Exact future integration delta

If accepted, add one identity-only reference:

```json
{
  "id": "ingredient-ref-tartary-buckwheat-flour",
  "nameEn": "Tartary buckwheat flour",
  "nameFr": "farine de sarrasin de Tartarie",
  "aliasesEn": ["Tartar buckwheat flour"],
  "aliasesFr": ["farine de sarrasin tartare", "farine de sarrasin vert biologique"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "FLOUR_AND_STARCH"
}
```

Register the new identity and S01–S09 in the ingredient research ledger. Preserve the 0.68 ± 0.00 g/mL value only as the study-specific observation for cultivar Shimla B-1 and its tapped-cylinder method; preserve the 25:25:50 blend only as a source-specific bread formula. Set measurement research to `researched_no_supported_value` and substitution research to `blocked_pending_evidence`. Add no active density, unit mapping, form, recipe link, conversion, yield, or substitution. Leave both existing buckwheat-flour references unchanged and keep the A6 checklist open.

Under `AGENTS.md`, an eventual integration limited to adding database JSON data needs no tests or emulator verification. This is proposal-only work, so no app tests or emulator checks were run.

## Sources

The pages and article records below were checked online on 2026-10-13. Source IDs use `WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013`; all IDs S01–S09 are used in the decision text above.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S01** | Naturitas Canada, [Salud Viva — Tartar buckwheat flour, 250 g](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/wheat-flour/tartar-buckwheat-flour-250-g-salud-viva). Canada-locale listing displayed the product as in stock during review; gives the 250 g package, says the product is stone-ground, declares 100% tartar buckwheat, and uses the English product title `Tartar buckwheat flour`. | Retailer listing and supplier-provided product copy; not a Québec label or independent manufacturing specification. The 250 g size is not a household measure. |
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S02** | Naturitas France, [Salud Viva — Farine de sarrasin tartare, 250 g](https://www.naturitas.fr/p/alimentation/cereales-legumineuses-et-pates/farines/farine-de-ble/farine-de-sarrasin-tartare-250-g-salud-viva). Same SKU `LP-0205109` as S01; exact title `Farine de sarrasin tartare`, ingredient declaration `100% sarrasin tartare`, and one 25% common buckwheat / 25% Tartary / 50% wheat bread blend. | French-language consumer product evidence from the France locale, not proof of a Québec package or local stock. The bread formula is product-specific and provides no yield or general substitution rule. |
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S03** | Government of Canada Translation Bureau, [TERMIUM Plus: *Fagopyrum tataricum*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=8&i=&index=alr&lang=eng&sg_kp_wet=2126461&srchtxt=buckwheat). Lists English `tartary buckwheat` and `tartarian buckwheat` and French `sarrasin de Tartarie`, with the latter noted as the preferred common name in the Canadian Inventory of Weeds. | Canadian plant-name terminology, not a flour-label standard, OQLF ruling, or retail availability evidence. |
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S04** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Fagopyrum tataricum*](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A694553-1/general-information). Accepts *F. tataricum* as a species. | Taxonomic backbone; it does not define a food product, flour process, or common name. |
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S05** | Ferme Aquilon, [Notre histoire](https://fermeaquilon.com/our-services/). Identifies the farm as being in Sainte-Sabine, Chaudière-Appalaches; explicitly calls its green buckwheat `sarrasin de Tartarie` and says the local community uses its flour. | Direct Québec producer terminology and product-context evidence, not an independent terminology ruling or transferable specification for other products. |
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S06** | Ferme Aquilon, [Nos produits](https://fermeaquilon.com/home/). Lists the product heading `Farine de sarrasin vert biologique` and introduces its products as based on `Sarrasin de Tartarie`. | The product page does not print a Latin species name in the flour title or provide a package ingredient panel; the crop-to-product link is established with S05 on the same farm site. |
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S07** | Liu et al., [“Effect of milling method on the chemical composition and antioxidant capacity of Tartary buckwheat flour”](https://doi.org/10.1111/ijfs.13837), *International Journal of Food Science & Technology* 53 (2018), 2457–2464. Compares roller, stone, ultrafine, and wet milling; study samples include dehulled and whole-seed mill inputs and show processing-dependent flour properties. | One research setup and cultivar; does not establish commercial forms, standard measures, a universal density, or a general substitution. |
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S08** | Sindhu & Khatkar, [“Physicochemical and Functional Properties of Starch and Flour of Tartary Buckwheat (*F. tataricum*) Grains”](https://doi.org/10.17577/IJERTV5IS060432), *International Journal of Engineering Research & Technology* 5(6) (2016). Uses one Shimla B-1 cultivar and reports flour bulk density `0.68 ± 0.00 g/mL` (`n=3`); the method weighs 10 g in a measuring cylinder tapped 10–12 times. | Single laboratory cultivar and compacted-cylinder method. This is not a household cup value or a transferable default density. The study’s flour and isolated-starch values are kept separate. |
| **WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75-20261013-S09** | Centre de recherche sur les grains (CÉROM), [Opportunités de diversification des grandes cultures au Centre-du-Québec — rapport 2024 (PDF)](https://cerom.qc.ca/wp-content/uploads/2025/02/CEROM-CN-Rap2024.pdf). Uses the local phrase `sarrasin vert de Tartarie`; reports a market for black buckwheat rather than green Tartary buckwheat in both local and export markets. | Québec agronomic-market discussion, not a product label, sales-volume measure, or evidence of broad current demand for Tartary buckwheat. |

## Static review record

- Confirmed the target proposal path was unused before writing and the candidate ID/source prefix had no current ledger or archive collision.
- Read the current `AGENTS.md`, the exact open A6 checklist item, R74 and the earlier buckwheat flour reviews, plus the live reference, form, legacy-identity, and ledger data.
- Checked exact name/alias ownership and candidate IDs across active references, forms, legacy candidates, the ledger, and proposal/batch archives.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; found zero matches for the species-qualified product terms.
- Projected current and proposed search results from the repository search algorithm, including broad `buckwheat flour`, `farine de sarrasin`, `tartar`, and `sarrasin` queries.
- Rechecked the cited Canada/French retailer pages, Québec producer pages, TERMIUM, Kew, and research sources on 2026-10-13.
- Checked this proposal for UTF-8 without BOM, local-link targets, source-ID coverage, mojibake markers, and trailing whitespace. No tests or emulator checks were run.

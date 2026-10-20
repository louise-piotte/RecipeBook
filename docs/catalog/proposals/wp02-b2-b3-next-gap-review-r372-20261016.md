# WP02 B2/B3 next-gap review — precooked fava flour (R372)

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. This review creates this proposal file only; it does not edit the shared catalog or ledger JSON, plan, roadmap, batch README, code, recipes, or tests.
- **Scope:** One remaining WP02 alternative-flour processing state: source-named precooked fava flour under the existing fava-flour reference.
- **Recommendation:** Add one `precooked` ingredient form under `ingredient-ref-fava-bean-flour`. Keep it process-qualified, with a provisional Québec French display. Add no new ingredient reference, broad French synonym, measure, density, recipe link, conversion, yield, or substitution.
- **Proposed form ID:** `ingredient-form-fava-bean-flour-precooked`.
- **Proposed new source-ID prefix:** `WP02-B2-PRECOOKED-FAVA-FLOUR-R372-20261016`.

## Plan fit and decision

The candidate fits WP02's open instruction to preserve “raw versus pregelatinized/precooked product distinctions” in `docs/RecipeBook-global-ingredient-catalog-plan.txt`. It is a fava-flour product state in the alternative-flour scope; it does not reopen the recent pregelatinized waxy-maize, general pregelatinized-corn, or held tapioca-starch reviews.

Simpson Seeds currently lists separate **Raw Fava Flour** and **Precooked Fava Flour** products. The precooked product page says it is high-pressure extruded and names quick hydration, binding, and food-manufacturing applications. A French-language Protein Industries Canada release also describes Prairie Fava as supplying raw or precooked fava flour in a passage that identifies its pulses as gourganes. The evidence supports a bounded processing form under the existing fava-flour identity. It does not support a universal processing specification or an equivalence to a Québec retail product.

Use the following form proposal only:

```json
{
  "id": "ingredient-form-fava-bean-flour-precooked",
  "ingredientRefId": "ingredient-ref-fava-bean-flour",
  "formCode": "precooked",
  "labelFr": "farine de gourgane précuite",
  "labelEn": "precooked fava flour",
  "prepState": "precooked",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "État de produit commercial. Simpson Seeds décrit son produit comme précuit par extrusion à haute pression. La source n’établit aucune mesure ménagère, densité ni substitution.",
  "notesEn": "Commercial product state. Simpson Seeds describes its product as precooked by high-pressure extrusion. The source establishes no household measure, density, or substitution.",
  "updatedAt": "2026-10-16T00:00:00Z"
}
```

The English label follows Simpson Seeds' exact product title. The French label is a descriptive Québec construction: the existing flour uses `farine de gourgane`, and OQLF identifies `gourgane` as the preferred Québec/Canada term for *Vicia faba*. The exact phrase `farine de gourgane précuite` is not present on a reviewed product label, so keep this wording provisional and add no French alias.

The French Protein Industries Canada page uses `farine de fève crue ou précuite` in its Prairie Fava passage. Do not add `farine de fève précuite` as a match term: the app's phrase-first picker would then let the shorter `farine de fève` query match that new form and take precedence over the current fallback result for `ingredient-ref-faba-bean-flour` (`farine de féverole`). Preserve the Québec-specific `gourgane` boundary and leave the broader French phrase out of runtime search terms.

Do not attach the product's high-pressure extrusion detail to every precooked fava flour as a generic method. The source does not give a thermal schedule, ingredient declaration, cultivar, household availability, or ready-to-eat statement. Do not equate `precooked` with `pregelatinized`, chemically modified, or safely edible without further preparation.

## Current identity ownership

| Active owner | Current data and boundary |
|---|---|
| `ingredient-ref-fava-bean-flour` | `fava bean flour / farine de gourgane`; category `FLOUR_AND_STARCH`; aliases empty; no forms, density, or unit mappings. This is the proposed form owner. Keep the existing Cuisine Soleil `30 g per 1/4 cup` statement scoped to that product; do not apply it to the Simpson Seeds extruded product. |
| `ingredient-ref-faba-bean-flour` | `faba bean flour / farine de féverole`; aliases empty; no forms. Keep the separate Québec mill product and `farine de féverole` identity unchanged. |
| `ingredient-ref-fava-beans` | `fava beans / gourganes`; whole-pulse identity with existing whole-bean aliases. Keep it separate from both flour rows. |

The fava-flour ledger record already exists as `ingredient-ref-fava-bean-flour`, with identity verified, measurement state `researched_no_supported_value`, and substitution state `researched_no_supported_substitute`. If approved, append the new product evidence and bounded form decision under that existing record; do not create a parallel ingredient record. The existing Cuisine Soleil portion observation is product-specific. Simpson Seeds' nutrition panel and 1 MT packaging do not establish a reusable household measure, density, or mapping.

## Picker impact

`IngredientSearch.kt` normalizes accents and punctuation, returns complete word-phrase matches before substring fallback, and provides a form hint only when the complete query equals a form label or match term. The table is a static projection of current names and aliases plus the proposed form labels; no app picker was run.

| Query | Current result | Projected result | Form hint |
|---|---|---|---|
| `precooked fava flour` | None | `ingredient-ref-fava-bean-flour` | Yes, exact label |
| `precooked fava bean flour` | None | None | No; do not infer an unattested word variant |
| `fava bean flour` | `ingredient-ref-fava-bean-flour` | Same reference | No |
| `farine de gourgane précuite` | None | `ingredient-ref-fava-bean-flour` | Yes, exact label |
| `farine de gourgane` | `ingredient-ref-fava-bean-flour` | Same reference | No; the query does not specify the process state |
| `farine de fève` | `ingredient-ref-faba-bean-flour` via substring fallback | Same reference | No |
| `farine de fève précuite` | None | None | No; do not add the broad-source phrase as a match term |
| `gourgane` | Whole fava beans and fava bean flour | Same two references | No |

The proposed French label makes the specific Québec phrase searchable without changing `farine de fève` behavior. Adding the source's broader French wording as a form term would cause the picker to prefer the fava-flour form for `farine de fève`, replacing the current `farine de féverole` substring result. That collision is why the English product term and the Québec `gourgane` construction are the only proposed labels.

## Source evidence and limits

| ID | Source and URL | Evidence and limits |
|---|---|---|
| **S01 — new** `WP02-B2-PRECOOKED-FAVA-FLOUR-R372-20261016-S01` | Simpson Seeds, [Precooked Fava Flour](https://simpsonseeds.com/products/precooked-fava-flour/), accessed 2026-10-16. | Manufacturer page names the product, says it is high-pressure extruded, identifies its format as precooked, lists food applications, and states the ingredient is contract-milled for food manufacturers in 1 MT poly totes. It does not establish a Québec consumer package, exact botanical variety, complete process specification, household measure, or recipe replacement ratio. |
| **S02 — new** `WP02-B2-PRECOOKED-FAVA-FLOUR-R372-20261016-S02` | Simpson Seeds, [Raw Fava Flour](https://simpsonseeds.com/products/raw-fava-flour/), accessed 2026-10-16. | Sibling manufacturer page names a distinct raw product and lists its format as raw. It supports the supplier's raw/precooked product distinction, but does not prove identical lots, cultivars, milling specifications, or performance between the two products. |
| **S03 — new** `WP02-B2-PRECOOKED-FAVA-FLOUR-R372-20261016-S03` | Protein Industries Canada, [French-language release on Canadian food and ingredient companies](https://www.proteinindustriescanada.ca/fr/communiqu%C3%A9s-de-presse/innovation-driving-success-of-canadian-award-winning-women-led-food-and-ingredient-companies), published 2022, accessed 2026-10-16. | The French release says Prairie Fava supplies whole gourganes and `farine de fève crue ou précuite`. It supports a French-language Canadian fava/gourgane flour context and the raw/precooked distinction. It is an industry news release rather than a current product page, is not a Simpson Seeds listing, and does not define a Québec retail label. |
| **S04 — reused** existing source ID `WP02-B2-FAVA-FLOUR-20261011-S04` | OQLF, [gourgane (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351051/gourgane), accessed 2026-10-16; entry updated 2006. | OQLF identifies *Vicia faba* and marks `gourgane` preferred in Québec/Canada; it says `fève des marais` is less used in Québec. This supports the French plant term only, not the flour-process phrase. Reuse the existing source registration; do not add a duplicate ID or URL. |

The proposed new source IDs S01–S03 and their exact URLs had no owner in the live ledger or archived `docs/catalog` files at the review snapshot. Each new ID maps to one URL. S04 reuses its existing ID and exact URL. No source entries or ledger changes were made by this proposal.

## Exact-key ownership and recipe demand

At the read-only snapshot, the bundled package had **1,696 ingredient references**, **140 forms**, and **114 manifest-listed recipes / 1,123 ingredient rows**. The legacy-import identity file had **56 candidates**. The research ledger had **2,052 records**, **9,234 source entries**, **7,810 distinct source IDs**, and **6,533 distinct URLs**.

Exact and normalized ownership checks found no active reference, form, or legacy candidate owning the proposed form ID `ingredient-form-fava-bean-flour-precooked` or the full candidate phrases `precooked fava flour`, `precooked fava bean flour`, `farine de gourgane précuite`, or `farine de fève précuite`. Repository-wide exact-phrase checks found no earlier WP02 proposal, hold, integration, ledger candidate, or archived batch decision for precooked fava flour. The open generic process-distinction checklist is the only prior related plan item.

A manifest-ordered scan of all **114 recipe files** found no ingredient-row text containing `fava`, `faba`, `broad bean`, `gourgane`, `féverole`, `fève des marais`, `precooked`, or `pre-cooked`; it also found no ingredient-reference links to the existing fava-flour, faba-flour, or whole-fava-bean records. The corpus therefore creates no recipe demand, relink, measure, form application, or substitution.

Corpus snapshot fingerprint: **753,988 recipe-file bytes**; SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. The digest is calculated over each `recipeFiles` entry in manifest order as its relative path, a NUL byte, the file's exact bytes, and a NUL byte.

## Numeric and substitution boundary

Keep the form's density null and unit mappings empty. Simpson Seeds' 1 MT industrial packaging and per-100-g nutrition panel are not household portions or density observations. The existing Cuisine Soleil 30 g per 1/4 cup statement remains specific to that product and must not be reused for the extruded product. The manufacturer claims of hydration and binding are product-function descriptions, not tested recipe substitutions. No reviewed recipe or source supports a reusable substitution, conversion, yield, or recipe link.

This file is a documentation-only review. No shared JSON, plan, roadmap, recipe, code, test, build, emulator, or deployment action was performed.

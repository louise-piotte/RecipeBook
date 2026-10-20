# WP02 A6 roasted quinoa flour measurement and substitution review — R616 — 2026-10-18

## Review record

- **Reviewed and sources accessed:** 2026-10-18.
- **Status:** Accepted and integrated as R616. See the [integration README](../batches/wp02-a6-roasted-quinoa-flour-measure-substitution-integration-r616-20261018/README.md).
- **Scope:** Complete the open measurement and substitution evidence review for the existing `ingredient-ref-roasted-quinoa-flour`. The identity and bilingual name are fixed context from the earlier A6 identity and Québec wording reviews.
- **Plan anchor:** The WP02 Section A6 parent remains open at [the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1784). This proposal closes only the roasted-quinoa-flour evidence gap; the A6 parent stays open.
- **Roadmap:** R616 is recorded in `roadmap.md`; the broader flour/starch review remains open.
- **Source-ID audit:** The R616 filename, heading, finding ID, and new source-ID prefix were absent from the ledger and proposal/batch archive before this draft. The two article URLs and DOI strings were also absent from the ledger and proposal/batch archive. Reuse existing product and terminology sources where noted; do not mint a second ID for those pages.

## Bounded recommendation

The integration updates only the existing research-ledger record for `ingredient-ref-roasted-quinoa-flour`:

- Set `measurementState` to `researched_no_supported_value`. Keep `measurementObservations` empty because the reviewed flour quantities are research-formula amounts and the available product pages give no household portion, mass/volume pair, or density for the Québec product.
- Set `substitutionResearchState` to `researched_no_supported_substitute` for a reusable home-recipe replacement. Add one evidence-only finding to retain the two experimental formulation contexts and their limits.
- Keep `identityState: verified` and the active reference unchanged. No density, unit mapping, attached form, package yield, conversion, global substitution rule, contextual rule, or recipe-line substitution is supported.

The studies do contain baked-product trials using roasted quinoa flour. Their flour grades, experimental methods, formula percentages, and outcomes do not establish an interchangeable measure or a transferable home-recipe replacement for the specific Québec-mill product represented by this reference.

## Pre-integration catalog ownership and prior decisions

| Surface | Current owner/state | R616 treatment |
|---|---|---|
| Active reference | `ingredient-ref-roasted-quinoa-flour`, `roasted quinoa flour / farine de quinoa torréfiée`, category `FLOUR_AND_STARCH`; no aliases; `defaultDensity: null`; `unitMappings: []`. | Keep the verified identity, displays, and empty numeric fields. |
| Forms | No form is attached to this reference. Generic `ingredient-ref-quinoa` separately owns dry and cooked grain forms. | Add no form and do not transfer grain data. |
| Ledger | Before R616, identity was `verified`; `measurementState` and `substitutionResearchState` were both `not_yet_researched`; no observations or substitution findings existed. | The existing row now has the reviewed states, two new sources, and one bounded finding. |
| Rules and yields | No global or contextual substitution rule or package-yield record references this ID. | Add none. |
| Recipe links | No bundled recipe line references this ID. | Add none. |
| Naming review | The earlier Québec review retained the French display provisionally because the manufacturer’s pages did not fully disclose the roasting/milling sequence. That review remains the owner of the process-wording question. | Preserve the prior display decision; this evidence review does not reopen it. |

The earlier Hattai-ko functional-flour review already integrated this source-named product as a distinct identity, separate from generic quinoa flour. The separate French review kept the current display provisional. R616 addresses the still-empty measurement/substitution research states without duplicating those identity decisions. The A7 malted-quinoa-flour review covers a different candidate and does not resolve this record’s measurement or replacement evidence.

## Bilingual naming and search projection

The Québec mill’s current French product page names **Farine de Quinoa Torréfié** and its current English page names **Roasted Quinoa Flour**. Quinoa du Québec separately lists conventional and roasted `farine de quinoa`, suggests baking uses, and gives professional 20 or 25 kg formats. OQLF’s entry confirms masculine `quinoa` as the preferred Québec term and identifies it as a pseudocereal; it does not define a roasted-flour grade. These sources support the existing product boundary and Québec French context. The prior provisional wording remains unchanged.

Static search projection uses the normalization and complete-phrase-before-substring behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It includes reference names, aliases, and attached form terms.

| Query | Current results | R616 effect |
|---|---|---|
| `roasted quinoa flour`; `farine de quinoa torréfiée`; `quinoa torréfié`; `roasted quinoa` | Only `ingredient-ref-roasted-quinoa-flour`. | No name or alias is added; result stays the same. |
| `quinoa flour`; `farine de quinoa` | Five distinct rows: generic, roasted, black, red, and white quinoa flour. | Keep the qualified flour results distinct. |
| `quinoa` | Ten rows across whole-grain quinoa, colored quinoa, flour, flakes, and puffed quinoa. | No broad-query change. |

No alias or search term is proposed.

## Bundled recipe demand

Scanned all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows** for the reference ID and the English/French product names and spelling variants. There were **zero matching rows**. The bundled Quinoa Bites recipe references cooked whole quinoa, not quinoa flour, so it does not support a flour link, measure, or substitution.

## Product and Québec/Canadian French evidence

- The current [Les Moulins de Soulanges English page](https://moulinsdesoulanges.com/language/en/functional-ingredients-2/) and [French product page](https://moulinsdesoulanges.com/language/fr/farine-de-quinoa-torrefie/) identify the Québec mill’s roasted-quinoa flour and suggest bakery uses. The French page states qualitative viscosity and absorption performance, but gives no formula, amount, household measure, density, or unit conversion. Reuse existing target-row source IDs `WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S06`–`S08`; do not duplicate them.
- [Quinoa du Québec’s professional products page](https://quinoaquebec.com/nosproduitprofessionnel) uses the Québec French heading `Farine de quinoa`, separates conventional from `Torréfiée`, suggests bread, pasta, cookies, and crackers, and lists 20 or 25 kg professional formats. Existing source ID `WP03-QFLAKES-20261010-S06` already covers this URL and its flour section. This is local product and language evidence, not a household measure or package yield.
- The [OQLF entry for quinoa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa) gives preferred masculine `quinoa` and defines the food/botanical term. It does not set a flour-specific measure or roasted-flour technical name. The target ledger already owns OQLF grammar source `WP02-ROASTED-QC-REVIEW-20261011-S01` for the prior display analysis.

An Aliments du Québec search-index preview surfaced the Moulins product card [Farine de quinoa doux torréfiée](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-quinoa-doux-torrefiee), with a 20 kg format and the description `farine de quinoa préalablement torréfié`. Direct page retrieval returned a cache miss, so this preview is excluded from the proposed ledger evidence. Verify the product card or technical sheet directly before using it to revise the earlier process-wording review.

## Measurement evidence and limits

- Moulins’ bilingual product pages provide qualitative product performance and use suggestions, with no cup, spoon, serving mass, paired mass/volume, or density.
- Quinoa du Québec’s wholesale page gives 20 and 25 kg professional product formats. Those bulk formats do not establish a household serving or a recipe-measure conversion.
- Kaur and Kaur tested roasted quinoa flour in gluten-free baked goods at 5%, 10%, and 15% levels. Their abstract reports a 10% roasted-quinoa-flour, 45% rice-flour, 45% oat-flour blend as highly accepted in their tested cookies, cakes, muffins, pies, and tarts by a semi-trained panel of 10. The abstract reports no household volume/weight pair or mass-volume measure.
- Park, Maeda, and Morita report a 280 g total-flour bread formula and experimental RMRQ flour substitution at 10%, 20%, and 30% by weight. Those are amounts within one controlled breadmaker experiment using study-prepared RMRQ; the paper does not supply a cup mass, standardized serving, or measure for the Moulins product. Its farinograph water-absorption results describe experimental dough behavior, not ingredient density or a kitchen hydration conversion.

The study formulas are preserved as substitution context in the ledger finding, not as general measurement observations for the Québec-mill identity. Keep `measurementObservations: []`, `defaultDensity: null`, and `unitMappings: []`. Do not infer volume, density, or an interchangeable serving from a formula percentage or bulk package format.

## Substitution evidence and limits

- Kaur and Kaur report experimental use of roasted quinoa flour in a gluten-free flour blend. This identifies a tested formula context; it does not establish an individual flour-to-flour exchange rate for the Moulins product.
- Park et al. studied bread made with 10%, 20%, and 30% (w/w) study-prepared roller-milled/roasted quinoa flour replacing a hard-type commercial wheat flour. Increasing substitution reduced loaf volume; the study reports that lipase changed bread outcomes, with the 30% RMRQ case an exception to the reported loaf-volume improvement. The study’s source flour and process are not identified as the Moulins product.
- Neither study validates those percentages for ordinary home recipes, identifies a matching bundled recipe, or gives a transferable substitution amount across methods and flour roles. The Moulins page gives suggested uses and qualitative performance, not a replacement instruction.

Use `researched_no_supported_substitute` for a reusable home-recipe replacement. Record the source-bound study contexts and limits in one ledger finding. Add no global or contextual runtime rule; the existing rule model would require a supported product/form and bounded dish, role, and method scope.

## Integrated ledger delta

The integration appended the two source records below to the existing `ingredient-ref-roasted-quinoa-flour` record and applied these field values:

```json
{
  "measurementState": "researched_no_supported_value",
  "measurementObservations": [],
  "substitutionResearchState": "researched_no_supported_substitute",
  "substitutionFindings": [
    {
      "findingId": "roasted-quinoa-flour-no-reusable-home-measure-or-replacement-r616-20261018",
      "researchState": "researched_no_supported_substitute",
      "context": "Whether the Moulins de Soulanges roasted quinoa flour has a reusable home-recipe measure or a transferable flour-replacement instruction.",
      "basis": "The mill pages give qualitative absorption/performance claims and suggested uses, without a quantity. Kaur and Kaur tested 5%, 10%, and 15% roasted quinoa flour in gluten-free baked goods, with a 10% quinoa, 45% rice, 45% oat flour blend rated highly by a semi-trained panel of 10. Park et al. tested study-prepared RMRQ at 10%, 20%, and 30% (w/w) in one 280 g flour breadmaker formula; loaf volume decreased as substitution increased, and the RMRQ material was not identified as the Moulins product.",
      "expectedEffects": [
        "In Park et al.'s experimental bread formula, increasing the study-prepared RMRQ share reduced loaf volume; the reported lipase response varied by substitution level.",
        "Kaur and Kaur report high sensory acceptance for their tested 10% roasted-quinoa, 45% rice, 45% oat gluten-free blend; the result is formula- and panel-specific."
      ],
      "limitations": [
        "The tested flour materials and processing are not established as the Moulins de Soulanges product represented by this reference.",
        "Do not treat experimental blend percentages as general home-recipe replacements, a household measure, or a mass-volume conversion.",
        "Do not activate a global or contextual substitution rule or attach a recipe-line substitution; the bundled corpus has no matching quinoa-flour line."
      ],
      "sourceIds": [
        "WP02-A6-ROASTED-QUINOA-MEASURE-SUB-R616-20261018-S01",
        "WP02-A6-ROASTED-QUINOA-MEASURE-SUB-R616-20261018-S02"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record the completed research review on the existing verified Moulins-product row. The available study formulas do not establish a reusable household measure or a general home-recipe replacement for this source-bounded product; keep active numeric and substitution behavior unchanged.",
      "sourceIds": [
        "WP02-A6-ROASTED-QUINOA-MEASURE-SUB-R616-20261018-S01",
        "WP02-A6-ROASTED-QUINOA-MEASURE-SUB-R616-20261018-S02",
        "WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S06",
        "WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S07",
        "WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S08"
      ]
    }
  ]
}
```

Add these source objects once to the existing target row. The target row already contains product and OQLF sources; keep them as-is.

```json
[
  {
    "sourceId": "WP02-A6-ROASTED-QUINOA-MEASURE-SUB-R616-20261018-S01",
    "url": "https://journals.ansfoundation.org/index.php/jans/article/view/1552",
    "title": "Kaur, Sukhmandeep, and Navjot Kaur. Development and sensory evaluation of gluten free bakery products using quinoa (Chenopodium Quinoa) flour",
    "versionOrDate": "Journal of Applied and Natural Science 9(4), 2449–2455 (2017); DOI 10.31018/jans.v9i4.1552",
    "accessedOn": "2026-10-18",
    "locator": "Abstract: tested roasted quinoa flour levels, 10/45/45 gluten-free flour blend, and panel size.",
    "supports": "Primary article reports roasted quinoa flour tested at 5%, 10%, and 15% in gluten-free cookies, cakes, muffins, pies, and tarts. Its abstract reports high acceptance for a 10% roasted-quinoa, 45% rice, 45% oat flour blend in a semi-trained panel of 10. It gives no household flour measure or mass-volume conversion and does not identify the flour as the Moulins product.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP02-A6-ROASTED-QUINOA-MEASURE-SUB-R616-20261018-S02",
    "url": "https://www.jstage.jst.go.jp/article/jag/52/4/52_4_337/_pdf",
    "title": "Park, Sang Ha, Tomoko Maeda, and Naofumi Morita. Effect of Whole Quinoa Flours and Lipase on the Chemical, Rheological and Breadmaking Characteristics of Wheat Flour",
    "versionOrDate": "Journal of Applied Glycoscience 52(4), 337–343 (2005); DOI 10.5458/jag.52.337",
    "accessedOn": "2026-10-18",
    "locator": "Abstract; materials and methods; bread formula; Tables 3 and 4.",
    "supports": "Primary study compares stone-mortar quinoa flour and roller-milled/roasted quinoa flour (RMRQ) in bread. It reports 10%, 20%, and 30% (w/w) replacement levels, a 280 g total-flour breadmaker formula, decreasing loaf volume as quinoa substitution rose, and experimental farinograph water-absorption results. The RMRQ sample is sourced from imported Peruvian quinoa and is not identified as the Moulins product; the formula is not a household measure or general replacement instruction.",
    "sourceKind": "other"
  }
]
```

The research-state update is accepted for the existing record only. Keep all reference, form, recipe, conversion, package-yield, and substitution-rule JSON unchanged. The broad Section A6 parent remains open.

## Open risks

- The exact Moulins product page still does not disclose the roasting/milling sequence. The Aliments du Québec search preview may provide a useful product-specific description, but direct verification is needed before changing the previous French-process decision.
- The primary studies show that roasted quinoa flour has been tested in multiple formulas, but those samples and contexts do not match the source-bounded Québec product. Future recipe-specific guidance needs a product-matched formula and method.
- No consumer package, household measure, density, or current bundled recipe supports a reusable quantity or active substitution.

## Static checks performed

- Re-read `AGENTS.md`, `roadmap.md`, the open Section A6 plan entry, the active reference row, its ledger row, relevant forms/rules/yields, and prior A6/quinoa proposals before drafting.
- Confirmed the target reference’s names, empty aliases, `FLOUR_AND_STARCH` category, null density, empty unit mappings, zero attached forms, and pre-integration `not_yet_researched` ledger states; R616 changed only the reviewed evidence states.
- Projected bilingual and broad quinoa searches using the current Kotlin normalization and complete-phrase/substring behavior; recorded no proposed term or picker change.
- Parsed the manifest and scanned all 114 recipe files / 1,123 ingredient rows; found zero target ID/name matches.
- Confirmed zero target references in global rules, contextual rules, and package-yield records.
- Checked R616, the new source-ID prefix, DOI strings, and article URLs for existing ledger/proposal/batch collisions; none found. Confirmed the cited Quinoa du Québec URL is already registered as `WP03-QFLAKES-20261010-S06` and the existing Moulins/OQLF source IDs remain owned by the target row.
- Verified this Markdown document is UTF-8 without a BOM. No software tests, build, emulator run, or deployment were run; the shared change updates only a database JSON ledger record and catalog documentation under `AGENTS.md`. Integration checks are recorded in the [R616 integration README](../batches/wp02-a6-roasted-quinoa-flour-measure-substitution-integration-r616-20261018/README.md).

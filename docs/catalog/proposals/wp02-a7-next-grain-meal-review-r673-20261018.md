# WP02 Section A7 R673: roasted red rice flour measurement and substitution review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated in the shared research ledger; the A7 checklist, workflow, roadmap, and integration README record the result. No recipe, generated catalog, reference, form, yield, or rule changed.
- **Plan anchor:** The open Section A7 parent continues reviews of other grain meals and other malted/toasted flours ([plan, line 2094](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094)). The workflow still describes A7 as open while recording its existing grain-meal and flour identities ([workflow, lines 91–101](../ingredient-catalog-workflow.md#L91)); the latest roadmap A7 item, R666, likewise says the section remains open ([roadmap, line 88](../../../roadmap.md#L88)).
- **Candidate:** Existing **ingredient-ref-roasted-red-rice-flour**, a named roasted rice flour identity whose measurement and substitution research were **not_yet_researched** before R673.
- **Selection audit:** R666 cornmeal, R671 roasted corn flour, R659 roasted wheat flour, R663 roasted wheat malt flour, and the earlier A7 grain-meal/malt-flour candidates were excluded. No prior A7 proposal specifically reviewed this row's remaining measurement/substitution evidence. Earlier identity and Québec-display reviews, plus WP02 A6 R155's comparison to an unqualified red-rice-flour candidate, did not attach a formula amount or substitution finding to this existing row. The A7 malted-rice and toasted-glutinous-rice reviews concern different identities.

## Pre-integration record and picker/corpus snapshot

| Surface | Current state |
|---|---|
| Active reference | **ingredient-ref-roasted-red-rice-flour**, **roasted red rice flour / farine de riz rouge torréfiée**, category **FLOUR_AND_STARCH**; aliases are empty; **defaultDensity** is null; **unitMappings** is empty. Keep the current names and classification. |
| Research ledger | Identity **verified**; measurement and substitution states both **not_yet_researched**; no measurement observations or substitution findings. Existing sources include Niru's product page (**WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S07**) and shared current collection page (**WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S05**). |
| Forms, rules, and yields | No form references this ingredient. Both active substitution-rule files contain zero rules. The one package-yield record is unrelated; none references this ingredient. |
| Exact picker projection | **roasted red rice flour** and **farine de riz rouge torréfiée** each return only this row. |
| Nearby picker results | **red rice flour** and **farine de riz rouge** each return the generic red-rice-flour row and this roasted product. **red rice** returns red rice grain, red rice flakes, generic red rice flour, and roasted red rice flour. **rice flour** returns 12 distinct flour references. These results are appropriate; no alias change is proposed. |
| Bundled recipe benchmark | The manifest-listed bundle has 114 recipe files and 1,123 ingredient rows. None contains the target's English/French name, roasted-red-rice-flour wording, puttu/pittu, string-hopper, idiyappam, or kozhukattai terms, and none links the target ID. There is no bundled recipe demand or line to link. |

Picker projections follow the phrase-first normalization in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The recipe scan used the manifest-listed files.

## Evidence and limits

| Source and locator | Evidence and disposition |
|---|---|
| Niru Enterprise Inc., [Roasted Red Rice Flour](https://niru.com/product/roasted-red-rice-flour/), current product heading and description, package-size list (lines 4–10); existing ledger source **WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S07**, accessed 2026-10-18. | The Canadian manufacturer names a flour made from finely milled red rice, identifies pittu and string hoppers as common uses, and lists 1 kg, 2 kg, and 8 lb packages. It gives no recipe quantity, household volume, serving mass, density, measuring method, or replacement instruction. Package sizes are not kitchen measures or package yields. |
| Niru Enterprise Inc., [Rice & Flour collection](https://niru.com/product-category/rice/), current listing (lines 25–57); existing ledger source **WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S05**, accessed 2026-10-18. | The current collection lists Roasted Red Rice Flour separately from polished red rice, roasted mong flour, urid flour, and roasted urid flour. Reuse the existing source entry; do not duplicate it or transfer evidence from neighboring products. |
| Baku Kitchen, [String Hoppers](https://bakukitchen.com/string-hoppers/), page header/update and yield lines, dough ingredient list, directions, substitutions, and variations (lines 11–12, 20–24, 28–34, 61–69, 77–81; accessed 2026-10-18). Proposal-local source ID **WP02-A7-ROASTED-RED-RICE-FLOUR-R673-20261018-S01**. | This page identifies itself as updated September 2026. Its formula for about 20 nests lists 400 g roasted red rice flour, or white rice flour, and about 450 ml boiling water. The method uses hot water, pressing, and steaming; it says the white-flour version is paler and softer, while roasting affects water absorption and flavor. The page does not specify the white flour's roast state, a product/brand, or a weighing method. Preserve 400 g as this one formula's quantity. The stated alternative is a contextual lead, but its flour state conflicts with the page's later emphasis on roasted rice flour, so it does not support an active rule. |

The recipe page is a publisher-reported formula, not a controlled product comparison. Its 400 g amount is useful as a formula-specific observation only; it does not establish a household-volume conversion or density.

## Source and identifier ownership audit

- **WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S07** and its Niru product URL were owned by the target ledger record alone. The existing source was reused and its access date/locator refreshed; no duplicate entry was added.
- **WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S05** is shared across **candidate-roasted-mong-flour**, **candidate-roasted-white-rice-flour**, **ingredient-ref-roasted-red-rice-flour**, and **ingredient-ref-roasted-urid-flour**. The same collection URL is also cited on **ingredient-ref-urid-flour** under its own source ID. The shared source was refreshed on the target record without creating another Niru collection entry.
- The Baku Kitchen URL was absent from the live ledger and proposal archive. Its unique R673 source ID is now registered once on the target record.
- Earlier WP02 roasted-flour identity and French-display proposals cite Niru's same product page. WP02 A6 R155 cites the roasted row only as a distinct comparator to unqualified red rice flour. None is a source-owner collision or an earlier ledger measurement/substitution review of the roasted row.

## Integrated ledger changes

Applied a ledger-only measurement/substitution follow-up for the existing identity:

- Set **measurementState** to **researched_supported** and appended one observation for Baku Kitchen's 400 g String Hoppers formula. It is tied to that named formula and source; no cup weight, per-nest amount, density, conversion, or unit mapping was derived.
- Set **substitutionResearchState** to **blocked_pending_evidence** and appended a blocked finding for the one String Hoppers recipe's white-rice-flour alternative. The page does not establish whether that alternative is roasted, and it separately says roasting affects the dough. The finding is scoped to that hot-water dough, press, and steam method; no global or contextual substitution rule was activated.
- Refreshed and reused Niru source IDs S05 and S07; added the Baku recipe as one new source entry under the R673 ID.
- Kept the active reference names, empty aliases, category, null density, and empty mappings unchanged. No form, package yield, recipe link, active conversion, or active rule was added.
- The recipe's 400 g / about 450 ml ingredient list is not a mass-volume pair: the 450 ml quantity is water, not flour.

## Integrated ledger entries

New source entry:

    {
      "sourceId": "WP02-A7-ROASTED-RED-RICE-FLOUR-R673-20261018-S01",
      "url": "https://bakukitchen.com/string-hoppers/",
      "title": "Baku Kitchen, String Hoppers",
      "versionOrDate": "Updated September 2026",
      "accessedOn": "2026-10-18",
      "locator": "String Hoppers page header and update line; yield; dough ingredient list; directions; Substitutions and Variations",
      "supports": "The approximately 20-nest recipe lists 400 g roasted red rice flour or white rice flour and about 450 ml boiling water. It describes a hot-water dough, pressing and steaming, and differences in the white-flour result. It does not specify the white flour's roast state, a product brand, or a weighing method.",
      "sourceKind": "culinary_reference"
    }

Source-specific formula observation:

    {
      "observationId": "roasted-red-rice-flour-baku-string-hoppers-400-g-r673-20261018",
      "relationship": "portion_weight",
      "value": 400,
      "valueUnit": "g",
      "foodDescription": "Baku Kitchen's String Hoppers formula, roasted red rice flour as listed.",
      "foodState": "Unprepared flour before mixing; the page does not identify a manufacturer or describe the roasting/milling sequence.",
      "measurementMethod": "Published recipe quantity; the page states no separate weighing procedure.",
      "quantityBasis": "This approximately 20-nest formula only. Do not derive a per-nest amount, a mass-volume conversion, or a general measure.",
      "sourceQuantity": {
        "amount": 400,
        "unit": "g"
      },
      "observedMassG": 400,
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP02-A7-ROASTED-RED-RICE-FLOUR-R673-20261018-S01"
      ]
    }

Blocked contextual finding:

    {
      "findingId": "roasted-red-rice-flour-string-hoppers-white-rice-flour-r673-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "Baku Kitchen's approximately 20-nest String Hoppers formula: 400 g flour in a hot-water dough, pressed and steamed.",
      "basis": "The recipe lists white rice flour as an alternative to roasted red rice flour and describes a different color/texture result. Elsewhere the same page says roasted rice flour is needed and affects water absorption; it does not clarify whether the white alternative is roasted.",
      "limitations": [
        "Do not attach the alternative to generic white rice flour until its roast state is clarified.",
        "Do not infer a general rice-flour substitution, ratio, hydration adjustment, or rule for pittu, baking, or other dishes.",
        "Do not activate a global or contextual substitution rule from this single formula."
      ],
      "sourceIds": [
        "WP02-A7-ROASTED-RED-RICE-FLOUR-R673-20261018-S01"
      ]
    }

## Static acceptance checks reviewed during integration

- Confirmed only **ingredient-ref-roasted-red-rice-flour** changed in the ledger; its identity remains verified, measurement is **researched_supported**, and substitution is **blocked_pending_evidence**.
- The only new numeric observation is the formula-specific 400 g amount; no flour volume, inferred conversion, density, unit mapping, or package yield was added. Niru's 1 kg, 2 kg, and 8 lb pack sizes remain package descriptions, not kitchen measures.
- Recorded the Baku recipe's white-flour alternative only as blocked, scoped evidence; no active rule or substitution-rule file changed.
- Reused Niru sources S05/S07 without extra source entries; the Baku page is registered once under its new ID. Preserved the pre-existing shared use of S05 across its candidate records.
- Active reference, aliases, forms, package yields, recipe links, and picker projections remain unchanged. The 114-recipe / 1,123-row benchmark remains without a candidate match.
- Static package and ledger schema/custom validation, reference/source ownership, unique R673 identifier, manifest, generated-index, UTF-8/no-BOM, local-link, and whitespace checks passed.
- [AGENTS.md](../../../AGENTS.md) exempts database-JSON-only changes from software tests. No software tests, build, emulator, or deployment were run for this ledger-only data update.

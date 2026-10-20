# WP03 Section F R80 — puffed wild rice identity review

- **Date:** 2026-10-13.
- **Chosen open checklist item:** `[ ] Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.` ([live Section F checklist, line 2763](../../RecipeBook-global-ingredient-catalog-plan.txt#L2763)). The related Section F grain summary still marks “other puffed-grain candidates” for further scope review ([coverage table](../batches/plant-grains-cereals.md#L267)).
- **Recommendation:** Add identity-only `puffed wild rice / riz sauvage soufflé` as `ingredient-ref-puffed-wild-rice` in `GRAIN_AND_CEREAL`, with no aliases.
- **Scope:** A plain puffed preparation made from the ingredient sold as wild rice. The proposal does not name a botanical species, define a standardized process, or cover wild-rice blends, the wheat-based Wild Rice Sticks snack, or seasoned/coated cereals.

## Decision and product boundary

Artisan Tradition’s current first-party product pages provide the direct bilingual ingredient pair. Its English listing names a product **Wild Rice Sticks** and lists **Puffed wild rice** as one ingredient. The corresponding Québec French page lists **Riz sauvage soufflé** under **Ingrédients**, rather than only translating the snack’s product title [S01, S02]. Artisan Tradition describes itself as a food brand working with farmers and processors; it says most of its products are packed in its Québec factory [S03]. These are supplier attestations for an ingredient in a current listed product, not a claim that plain puffed wild rice is currently sold as a standalone package.

A Québec culinary source independently treats **riz sauvage soufflé** as a food preparation and supplies a home method: cook wild rice, dry it, and fry it until the grains puff. It calls the result cereal and suggests it as a snack, yogurt topping, or salad garnish [S04]. This supports a useful processed-grain identity in the catalog. It does not define a universal commercial puffing process or specify which *Zizania* species was used.

Keep this product separate from `ingredient-ref-puffed-rice` (`puffed rice / riz soufflé`). CFIA says wild rice is a grass and does not fall under the Canadian rice standard, while “wild rice” remains an appropriate common food name [CFIA source]. The OQLF entry pairs `wild rice` with `riz sauvage` [OQLF source]. This is enough to keep the wild-rice qualifier visible and avoid assigning it as an alias to the existing unqualified puffed-rice identity. The proposal makes no species-level assertion: CFIA says the common name may cover lake- or paddy-grown wild rice, and neither product source specifies taxonomy.

Treat **puffed wild rice** as a processed ingredient identity, not as a dry/cooked form of the existing wild-rice row. The active catalog already models puffed quinoa, millet, amaranth, sorghum, and rice as searchable grain-product identities. No additional `IngredientForm` is needed. Do not alias this row to `wild rice puffs`, `puffed rice`, `muri`, `murmura`, `rice cereal`, or any snack product.

## Ownership and archive audit

The read-only live snapshot contains **1,405 references, 104 forms, 63 legacy candidates, and 1,744 ledger records** ([reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json)). Exact-name and picker projections were checked using the normalization and phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Surface | Current owner or overlap | R80 result |
|---|---|---|
| Existing puffed rice | `ingredient-ref-puffed-rice` owns `puffed rice / riz soufflé`, with English aliases `muri` and `murmura`; it has no French aliases, forms, density, or unit mappings. Its generic names do not contain the contiguous qualified phrases `puffed wild rice` or `riz sauvage soufflé`. | Keep the generic row and its aliases unchanged. Do not transfer wild-rice wording to it. |
| Wild-rice identities | `ingredient-ref-wild-rice` owns `wild rice / riz sauvage`; `ingredient-ref-wild-rice-blend` owns `wild rice blend / mélange de riz sauvage`. Neither has aliases. | Keep plain wild rice and mixtures distinct; the puffed preparation is a third product choice. |
| Forms and legacy candidates | No current form label or match term owns either exact candidate phrase. The legacy file has no wild-rice or puffed-wild-rice candidate. | Add no form or legacy mapping. |
| Candidate ID and phrase ownership | No reference, form, legacy candidate, or ledger record owns `ingredient-ref-puffed-wild-rice`, `puffed wild rice`, or `riz sauvage soufflé`. The four new source IDs below are unused in the current ledger. | The proposed ID, names, and source IDs are collision-free in the checked snapshot. |
| Archive and prior decisions | No focused archived `puffed wild rice` or `riz sauvage soufflé` decision was found. The R79 puffed-brown-rice identity concerns brown *Oryza* rice; the R74 pearl-millet-flakes/Bajra Poha hold and prior cereal-mix reviews concern other products. | This is a distinct wild-rice preparation review. It does not reopen the R74–R79 decisions or any prior hold. |

## Bundled demand and picker boundary

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for `puffed wild rice`, `wild rice puffs`, `popped wild rice`, `riz sauvage soufflé`, the base wild-rice terms, and candidate/reference IDs. The bundled corpus contains **zero matching files, rows, or links**, including zero occurrences of the existing wild-rice references. No bundled recipe link is proposed. The Québec Bon pour toi recipe is external culinary demand; it is not a recipe from the bundled corpus.

The picker uses complete normalized word phrases across the reference and form names first, returning all references containing the phrase; only when there are no phrase matches does it fall back to substring matching. The following projection mirrors the current `IngredientSearch.kt` behavior and includes the proposed reference:

| Query | Current result | With proposed row |
|---|---|---|
| `puffed wild rice` | No result. | `ingredient-ref-puffed-wild-rice` — `puffed wild rice / riz sauvage soufflé`. |
| `riz sauvage soufflé` | No result. | `ingredient-ref-puffed-wild-rice` — `puffed wild rice / riz sauvage soufflé`. |
| `wild rice` | `ingredient-ref-wild-rice`; `ingredient-ref-wild-rice-blend`. | Those two plus `ingredient-ref-puffed-wild-rice`. The broad phrase remains a three-item family result. |
| `riz sauvage` | `ingredient-ref-wild-rice`; `ingredient-ref-wild-rice-blend`. | Those two plus `ingredient-ref-puffed-wild-rice`. |
| `puffed rice` | `ingredient-ref-puffed-rice` only. | Same generic puffed-rice result only. |
| `riz soufflé` | `ingredient-ref-puffed-rice` only. | Same generic puffed-rice result only. |

The broader wild-rice searches grow by one relevant product. The exact unqualified puffed-rice searches remain scoped to the current generic row, so wild rice will not be presented as ordinary puffed rice.

## Measurement, form, conversion, yield, and substitution limits

| Dimension | Evidence | Proposed handling |
|---|---|---|
| Product identity | The Québec supplier’s ingredient list names the product in both languages [S01, S02]. The Québec recipe describes making the puffed preparation from wild rice [S04]. | Add one identity-only `GRAIN_AND_CEREAL` row. Keep it distinct from plain wild rice, wild-rice blends, generic puffed rice, and finished Wild Rice Sticks. Do not infer species. |
| Ingredient form | Neither source proposes a base-grain state pair. Puffing is the identity-defining processing description, and other puffed grains already have separate identities. | Add no form under `ingredient-ref-wild-rice`; add no dry/cooked form or form conversion. |
| Quantity and measurement | Bon pour toi lists the recipe input as **½ cup / 125 mL / 85 g of dry wild rice**, plus **1¼ cups / 310 mL / 310 g water** [S04]. These quantities describe raw ingredients before cooking, drying, and frying; the supplier’s **250 g and 850 g** sizes are the finished wheat-based snack product, not puffed wild rice [S01, S02]. | Add no measurement observation to the puffed-wild-rice record. The raw-grain amount is not a portion of the finished ingredient. Do not derive a density from 85 g / 125 mL. Leave `defaultDensity` null and `unitMappings` empty. |
| Process and cooking yield | The recipe gives a 45-minute covered cook, about 2 hours of drying at 250 °F / 120 °C, and frying in roughly 1 in / 2.5 cm of oil at 400 °F / 205 °C for 5–10 seconds [S04]. It reports no final mass, volume, expansion ratio, or yield. | Treat timings, temperatures, and oil depth as recipe-method instructions only. Add no conversion, yield, or package yield. |
| Substitution | The reviewed product listing and Québec recipe provide no tested replacements or replacement amounts. Similar crunch/use does not establish equivalence with ordinary puffed rice or another puffed grain. | Add no global or contextual substitution rule. Keep `substitutionResearchState` as `not_yet_researched`; no substitution finding is added. |

## Exact future data delta

If accepted for integration, add exactly this identity-only reference to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-puffed-wild-rice",
  "nameEn": "puffed wild rice",
  "nameFr": "riz sauvage souffl\u00e9",
  "aliasesEn": [],
  "aliasesFr": [],
  "category": "GRAIN_AND_CEREAL",
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z"
}
```

Append this `ingredient_reference` record to `research-ledger.v1.json`; it has no `measurementObservations` or `substitutionFindings` because the source measurements are for the uncooked input grain and no substitute has been researched:

```json
{
  "recordId": "ingredient-ref-puffed-wild-rice",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-PUFF-WILD-RICE-R80-20261013-S01",
      "url": "https://www.artisan-tradition.ca/en/craquelins-croustilles-crackers-snacks",
      "title": "Artisan Tradition, Wild Rice Sticks",
      "accessedOn": "2026-10-13",
      "locator": "Wild Rice Sticks listing; sizes and ingredient panel",
      "supports": "The first-party English page lists Puffed wild rice as an ingredient of Wild Rice Sticks. The 250 g and 850 g sizes are for the finished mixed snack, not the puffed ingredient.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-PUFF-WILD-RICE-R80-20261013-S02",
      "url": "https://www.artisan-tradition.ca/craquelins-croustilles-crackers-snacks",
      "title": "Artisan Tradition, Craquelins / Croustilles",
      "accessedOn": "2026-10-13",
      "locator": "B\u00e2tons de riz sauvage listing; Ingr\u00e9dients panel",
      "supports": "The first-party Qu\u00e9bec French page lists Riz sauvage souffl\u00e9 as an ingredient of B\u00e2tons de riz sauvage. This is ingredient wording, not only a translated product title.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-PUFF-WILD-RICE-R80-20261013-S03",
      "url": "https://www.artisan-tradition.ca/en/%C3%A0-propos-about",
      "title": "Artisan Tradition, About us",
      "accessedOn": "2026-10-13",
      "locator": "Our Story and Fork to Table sections",
      "supports": "The company describes Artisan Tradition as a food brand working with farmers and processors and says most of its products are packed in its Qu\u00e9bec factory. This supports the supplier context, not production details for the wild-rice ingredient.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-PUFF-WILD-RICE-R80-20261013-S04",
      "url": "https://bonpourtoi.ca/recettes/riz-sauvage-souffle/",
      "title": "Bon pour toi, C\u00e9r\u00e9ales de riz sauvage souffl\u00e9 maison",
      "accessedOn": "2026-10-13",
      "locator": "Recipe name, ingredient list, and preparation steps",
      "supports": "A Qu\u00e9bec culinary source names the finished preparation riz sauvage souffl\u00e9 and describes cooking, drying, then frying wild rice until it puffs. Its ingredient quantities apply to the raw inputs; it gives no final puffed mass, volume, or yield.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-S12",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage",
      "title": "OQLF, riz sauvage",
      "versionOrDate": "Last updated 1985",
      "accessedOn": "2026-10-05",
      "locator": "Preferred term and English equivalent",
      "supports": "Directly pairs wild rice with riz sauvage as a distinct food grain.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-WILD-RICE-BLEND-20261011-S09",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products",
      "title": "Canadian Food Inspection Agency, grain and bakery product labelling guidance",
      "accessedOn": "2026-10-11",
      "locator": "Wild rice common-name section and distinction from the standardized rice category",
      "supports": "States that wild rice is a grass and does not fall under the standard for rice, while wild rice remains an appropriate common food name. It does not specify a wild-rice species or puffing process.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only puffed wild rice / riz sauvage souffl\u00e9 for the source-attested processed wild-rice ingredient. Keep wild-rice species unspecified and leave aliases, forms, measures, density, mappings, conversions, yields, recipe links, and substitutions empty.",
      "sourceIds": [
        "WP03-PUFF-WILD-RICE-R80-20261013-S01",
        "WP03-PUFF-WILD-RICE-R80-20261013-S02",
        "WP03-PUFF-WILD-RICE-R80-20261013-S04",
        "WP03-S12",
        "WP03-WILD-RICE-BLEND-20261011-S09"
      ]
    }
  ]
}
```

No `IngredientForm`, recipe link, active measure, default density, unit mapping, conversion, cooking yield, substitution rule, legacy candidate, or generated runtime logic is proposed. If the row is later integrated, regenerate the generated ingredient index from the canonical reference JSON as required by the catalog workflow; no app tests or emulator checks are needed for a database-JSON-only change under current `AGENTS.md`.

## Evidence and uncertainty

| Source ID | Source | What it supports and limits |
|---|---|---|
| `WP03-PUFF-WILD-RICE-R80-20261013-S01` | Artisan Tradition, [Wild Rice Sticks / Crunchy Sticks](https://www.artisan-tradition.ca/en/craquelins-croustilles-crackers-snacks). | First-party Canadian supplier page gives the English ingredient wording `Puffed wild rice`. The listed 250 g and 850 g formats belong to the finished snack, whose ingredient list also includes wheat flour, oil, salt, and turmeric. It does not establish a standalone puffed-rice package, species, or measure. |
| `WP03-PUFF-WILD-RICE-R80-20261013-S02` | Artisan Tradition, [Bâtons de riz sauvage](https://www.artisan-tradition.ca/craquelins-croustilles-crackers-snacks). | Matching Québec French page lists `Riz sauvage soufflé` in the ingredient panel. This directly attests the exact fr-CA ingredient wording; the listing does not state a species or ingredient amount. |
| `WP03-PUFF-WILD-RICE-R80-20261013-S03` | Artisan Tradition, [About us](https://www.artisan-tradition.ca/en/%C3%A0-propos-about). | The brand says it works with producers and that most of its products are packed in its Québec factory. It does not claim that this puffed-wild-rice ingredient is made in Québec. |
| `WP03-PUFF-WILD-RICE-R80-20261013-S04` | Bon pour toi, [Céréales de riz sauvage soufflé maison](https://bonpourtoi.ca/recettes/riz-sauvage-souffle/). | Current Québec recipe names the finished result, gives a preparation sequence and raw-input amounts, and suggests cereal/garnish uses. It does not identify a *Zizania* species or report the finished product's yield or amount. |
| `WP03-S12` (existing ledger source) | Office québécois de la langue française, [riz sauvage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage). | Direct Québec English/French name pair for the base wild-rice ingredient. It does not itself attest the puffed compound. |
| `WP03-WILD-RICE-BLEND-20261011-S09` (existing ledger source) | Canadian Food Inspection Agency, [grain and bakery product labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products). | Current Canadian labeling guidance says wild rice is a grass, outside the standard for rice, and an appropriate common name. It does not define puffed wild rice as a standard. |

The supplier listing plus Québec recipe support a useful, exact bilingual catalog name even though no standalone package, standardized manufacturing specification, or species was found. Keep those unknowns visible. The proposal adds only the identity and its evidence record; it does not make the snack product itself a catalog ingredient or treat the supplier package sizes as puffed-wild-rice quantities.

## Static review record

- Re-read current [`AGENTS.md`](../../../AGENTS.md), the live Section F checklist, the reference catalog, forms, legacy candidates, ledger, prior Section F proposals, and batch archive before choosing the gap.
- Checked exact bilingual phrase ownership, reference IDs, form terms, ledger source IDs, legacy candidates, and focused archive mentions. Confirmed no prior puffed-wild-rice allocation.
- Scanned all **114 manifest-listed recipe files / 1,123 ingredient rows**; the exact candidate and neighboring wild-rice terms had no bundled matches or links.
- Mirrored phrase-first and substring-fallback picker behavior from `IngredientSearch.kt` against the current catalog and the proposed row. Confirmed the query results above, including the broad wild-rice results and unchanged generic `puffed rice / riz soufflé` results.
- Rechecked the current Artisan Tradition English/French product pages and company page, the Québec culinary source, and the existing OQLF and CFIA sources. No source quantity was generalized.
- Static checks passed after writing: UTF-8 decodes without a BOM, the file ends with a newline, no trailing whitespace is present, and both fenced JSON deltas parse. All eight local Markdown links resolve, including the line anchors to plan line 2751 and the plant-grain coverage row at line 267. The four new source IDs are unused in the current ledger/archive; reused OQLF and CFIA source IDs are registered in the ledger. The supplier, Québec recipe, OQLF, and CFIA pages were opened during this review. This is proposal-only research: no tests or emulator were run.

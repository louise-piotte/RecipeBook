# WP02 B2 sweet blue lupin flour measurement and baking evidence review (R538)

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17. See the [R537–R539 integration README](../batches/wp02-wp03-wp04-r537-r539-gap-review-integration-20261017/README.md).
- **Open checklist:** WP02 B2, “Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours,” in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2612). The parent item remains open.
- **Record under review:** `ingredient-ref-sweet-blue-lupin-flour`, the existing species-scoped sweet blue lupin flour / farine de lupin à feuilles étroites identity for *Lupinus angustifolius*.
- **Source-ID prefix reserved for this proposal:** `WP02-B2-SWEET-BLUE-LUPIN-MEASURE-SUBSTITUTION-R538-20261017-S`.
- **Scope:** Review one product-specific nutrition-panel portion and one experimental wheat-bread formulation for the already integrated *L. angustifolius* flour. This does not reopen the French display or aliases.

## Recommendation

Integrate bounded evidence into the existing `ingredient-ref-sweet-blue-lupin-flour` research-ledger record only:

- Set `measurementState` to `researched_supported` and record Lupina's published serving as **1/4 cup (30 g)** for the named 1 lb product made from hulled kernels identified as Australian Sweet Lupin. Treat it as a product-specific nutrition-panel portion, not as a sample weighed by the retailer. Keep `defaultDensity: null`, `unitMappings: []`, and all reusable cup, tablespoon, and mass conversions unset. The listing gives no scoop/fill method, and its availability controls are ambiguous at review time.
- Set `substitutionResearchState` to `researched_supported` and record Pleming et al.'s *L. angustifolius* finding as one formula-specific bread study: commercial Australian sweet lupin flour was blended at 20:80 dry matter with a named Australian baker's flour, with separate gluten additions tested at 0%, 2%, 3.5%, and 5% of total flour weight in rapid and sponge-and-dough systems. Preserve the precise product and formula context. Add no `ruleId` and no active global or contextual substitution.
- Keep the active bilingual display, empty alias arrays, category, and picker results unchanged. Add no forms, recipe links, yields, densities, unit mappings, or active conversions.

`researched_supported` here records a published serving and a controlled bread formulation. It does not establish a standard household measure or a replacement ratio for arbitrary breads, cakes, cookies, pastry, or other recipe roles.

## Plan fit, archive, and identity boundary

The B2 checklist remains open after the completed chickpea, sweet white-lupin, yellow-pea, and partially defatted peanut research items. Sweet blue lupin is a separate open measurement/substitution gap on its existing *L. angustifolius* reference. R529 expressly reviewed the *L. albus* sweet white-lupin row and excluded sweet blue lupin; it must not be generalized across lupin species. The earlier identity and Québec wording decisions are retained in the [B2/B3 residual flour review](wp02-b2-b3-flour-starch-residual-review-20261010.md) and [lupin Québec display review](wp02-lupin-flour-quebec-display-review-20261011.md).

The identity boundaries remain:

- `ingredient-ref-sweet-blue-lupin-flour` — sweet blue lupin flour / farine de lupin à feuilles étroites, *L. angustifolius*.
- `ingredient-ref-sweet-lupin-flour` — sweet lupin flour / farine de lupin blanc, *L. albus*; R529's Ecoideas portion and durum-bread finding belong only to that row.
- `ingredient-ref-white-lupin-seeds` — whole white-lupin seeds; neither a flour identity nor the source for the serving or bread finding.
- Unqualified `lupin flour` and `farine de lupin` remain shared searches, not aliases for one species. Do not add bare `lupin bleu` or `Australian sweet lupin` as aliases.
- *L. mutabilis* tarwi flour remains a separate held identity, as documented in the [R179 boundary review](wp02-b2-tarwi-andean-lupin-flour-boundary-review-r179-20261016.md).

Health Canada's existing bilingual list names sweet blue lupin flour and farine de lupin à feuilles étroites ou lupin bleu with *L. angustifolius*. The existing OQLF and CFIA references corroborate the French species descriptor and distinguish blue lupin from white lupin. R538 retains the already reviewed Québec display `farine de lupin à feuilles étroites`; no new French term is proposed.

## Active record, ownership, and picker projection

At proposal review, the live reference was `ingredient-ref-sweet-blue-lupin-flour` (`FLOUR_AND_STARCH`), with `aliasesEn: []`, `aliasesFr: []`, `defaultDensity: null`, `unitMappings: []`, and no attached form. Its ledger states were identity `verified`, measurement `not_yet_researched`, and substitution `not_yet_researched`; integration added bounded evidence without changing the active reference. Its identity sources were already owned by IDs `WP02-B23-FLOUR-RESIDUAL-20261010-S01/S02` (Health Canada English/French), `WP02-LUPIN-QC-ROOT-20261011-S02` (OQLF), and `WP02-LUPIN-QC-ROOT-20261011-S03` (CFIA).

At proposal review, none of the three URLs below had a ledger owner and no R538 source ID collided with an existing ID. Integration registered S01–S03 on the existing *L. angustifolius* record. No earlier measurement/substitution review for this row was found.

Static projection from the current reference/form JSON using `IngredientSearch.kt`'s normalized complete-word-phrase search (then substring fallback):

| Query | Current result(s) | Proposed result(s) | Form hint |
|---|---|---|---|
| `sweet blue lupin flour` | `ingredient-ref-sweet-blue-lupin-flour` | Same | None |
| `farine de lupin à feuilles étroites` | `ingredient-ref-sweet-blue-lupin-flour` | Same | None |
| `lupin flour` | `ingredient-ref-sweet-blue-lupin-flour`; `ingredient-ref-sweet-lupin-flour` | Same two rows | None |
| `farine de lupin` | `ingredient-ref-sweet-blue-lupin-flour`; `ingredient-ref-sweet-lupin-flour` | Same two rows | None |
| `lupin bleu` | No result | No result | None; do not add as an alias |
| `Australian sweet lupin` | No result | No result | None; product wording is not added as an alias |
| `lupini` | `ingredient-ref-white-lupin-seeds` | Same | None; whole seeds remain distinct |

The exact, species-qualified names resolve to one flour each. Shared broad lupin queries intentionally show both flour rows. Since R538 changes only ledger research evidence, there is no picker or active form change.

## Measurement evidence and limits

Low Carb Canada's current product page is titled “Lupina - Lupin Flour - 1lb.” It identifies the ingredients as “100% Hulled Lupin Kernels (Australian Sweet Lupin)” and displays “Nutrition Facts 1/4 cup (30 g).” FSANZ's May 2015 report states that Australian sweet lupin refers to *Lupinus angustifolius* cultivated in Australia; this supports mapping the listed ingredient name to the existing species-scoped flour record. The retailer page identifies hulled kernels, but it does not report a cultivar, batch, particle-size range, spoon filling method, or an independent mass measurement.

At review time the page showed both “Notify me when this product is available” and an “Add to Cart” control. Treat stock status as ambiguous; the evidence is the published product-panel serving, not a claim of current availability. Do not divide or multiply the serving to create other measures, infer density, combine it with the *L. albus* observation, or transfer it to lupin seeds or other flour processes.

Proposed observation shape:

```json
{
  "observationId": "lupina-australian-sweet-lupin-flour-1-4-cup-30g-r538-20261017",
  "relationship": "portion_weight",
  "value": 30,
  "valueUnit": "g",
  "foodDescription": "Lupina Lupin Flour, 1 lb; listed ingredients are 100% hulled lupin kernels (Australian Sweet Lupin); product-specific nutrition-panel serving.",
  "evidenceKind": "published_portion",
  "sourceIds": ["WP02-B2-SWEET-BLUE-LUPIN-MEASURE-SUBSTITUTION-R538-20261017-S01"],
  "sourceQuantity": {"amount": 0.25, "unit": "cup"},
  "observedMassG": 30,
  "quantityBasis": "One serving printed as 1/4 cup (30 g) for this named product. No scoop/fill procedure or general flour conversion is stated.",
  "measurementMethod": "Canadian retailer product page reproduces the product Nutrition Facts serving; no mass-measurement procedure is given."
}
```

## Baking and substitution evidence

Pleming, Farahnaky, and Majzoobi (2021) tested commercial Australian sweet lupin flour (*L. angustifolius*) sourced from Western Australia against a commercial wheat baking flour (Perfection Bakers Flour, Allied Mills, Australia). The study prepared lupin/flour blends at a **20:80 dry-matter ratio**. In the lupin-enriched bread formulas it tested vital gluten additions of **0%, 2%, 3.5%, and 5% of total flour weight**, using rapid and sponge-and-dough processes. The abstract reports that 5% gluten improved average loaf volume by about 20% and crumb softness by 30–50% across the tested sources/methods, that *L. angustifolius* weakened the base-flour blend less than *L. albus*, and that sponge-and-dough was more suitable for lupin inclusion.

This is direct evidence for the use of *L. angustifolius* flour in the study's own experimental bread formulation. It is not a general 20% substitution recommendation: the tested flour source, Australian base flour, dry-matter formulation, added vital gluten, mixing, water absorption, fermentation/proofing, and baking processes are all bounded conditions. The study does not establish an equivalent result for a Canadian home recipe or the Lupina retail product, and it does not support an active recipe-level rule.

Proposed finding shape:

```json
{
  "findingId": "sweet-blue-lupin-flour-australian-bakers-flour-bread-pleming-r538-20261017",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-bread-flour",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-sweet-blue-lupin-flour",
      "roleInCompound": "20% of the dry-matter flour blend in the named study; study separately tested 0%, 2%, 3.5%, and 5% vital gluten by total flour weight. Formula-specific finding only; no general replacement ratio."
    }
  ],
  "context": "Pleming et al. tested commercial Australian sweet lupin flour (Lupinus angustifolius) from Western Australia in 20:80 dry-matter blends with Perfection Bakers Flour (Allied Mills, Australia). Bread was made by rapid and sponge-and-dough processes; the lupin-enriched formulas tested 0%, 2%, 3.5%, or 5% vital gluten relative to total flour weight.",
  "basis": "The primary study reports improved loaf volume and crumb softness as gluten was added, with a smaller weakening effect from L. angustifolius than L. albus and better inclusion results with sponge-and-dough than rapid processing.",
  "expectedEffects": [
    "Effects belong to the named experimental bread formula and commercial flour samples.",
    "The study supplies no reusable home recipe replacement rule."
  ],
  "limitations": [
    "One commercial Australian sweet-lupin flour source and one Australian commercial baker's flour base; not the Lupina product listed in the portion source.",
    "The 20:80 blend is a tested dry-matter formulation, not a general wheat-flour substitution ratio.",
    "Gluten additions and the two breadmaking methods are experimental conditions; do not translate them into a runtime or recipe-level instruction.",
    "Do not generalize to sweet white lupin (L. albus), other lupin species, non-bread roles, or other bread formulas."
  ],
  "sourceIds": ["WP02-B2-SWEET-BLUE-LUPIN-MEASURE-SUBSTITUTION-R538-20261017-S03"]
}
```

The integrated `fromIngredientRefId` identifies the bread-flour role only; the finding context retains the study’s exact Perfection Bakers Flour baseline. Do not interpret this ledger finding as a match to every product categorized as bread flour.

## Corpus demand and snapshot

The current manifest-ordered bundled corpus was scanned in full on 2026-10-17: **114 recipe JSON files / 1,123 ingredient rows**. A case-insensitive scan of every recipe JSON file and every ingredient row for `lupin`, `lupine`, `lupini`, `farine de lupin`, `sweet blue lupin`, and `sweet lupin` found **0 matching recipe files, 0 matching ingredient rows, and 0 links** to `ingredient-ref-sweet-blue-lupin-flour`. The candidate has no recipe-specific demand.

Snapshot at review time:

| Data | Count / SHA-256 |
|---|---|
| Ingredient references | 1,802 / `d84e245608dabe7f33b9507f7d17590f84e6b10af19f3dcacac1f1e8fb2e14b6` |
| Ingredient forms | 145 / `f24f5a06aec56d0d89a6d0c22d3453eca80239636d2db7ceb800a4a1ce01cc78` |
| Legacy import candidates | 56 |
| Research ledger | 2,160 records; 9,933 source entries; 8,406 distinct source IDs; 7,114 distinct URLs / `1b3956a7878fe7084805b7283857650a1368c825c45b6a08356c391ea9edd1e7` |
| Manifest | 114 recipes / `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 1,123 ingredient rows / `d870d4e10ea14513b63e36f522668d948df59f27e9b21882826885a549ac26cd` |

## Sources

| Proposed ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-B2-SWEET-BLUE-LUPIN-MEASURE-SUBSTITUTION-R538-20261017-S01` | Low Carb Canada, [Lupina - Lupin Flour - 1lb](https://www.lowcarbcanada.ca/collections/cooking/products/lopino-lupin-flour-1lb), product ingredient line and Nutrition Facts serving. | Product-specific 100% hulled lupin kernels (Australian Sweet Lupin) and 1/4 cup (30 g) panel serving. | Canadian retailer page, not a direct physical measurement; no fill method or species name; stock controls are ambiguous. FSANZ S02 supports the species term mapping. |
| `WP02-B2-SWEET-BLUE-LUPIN-MEASURE-SUBSTITUTION-R538-20261017-S02` | Food Standards Australia New Zealand, [Australian Sweet Lupin](https://www.foodstandards.gov.au/sites/default/files/science-data/monitoringnutrients/afcd/Documents/Industry%20Report%20-%20Australian%20Sweet%20Lupin.pdf), May 2015, p. 1, “Background.” | Defines Australian sweet lupin as *Lupinus angustifolius* cultivated in Australia. | Used only for species-name linkage. The report's nutrient analysis is not used as a flour measure; it describes grain samples and discloses that FSANZ did not collect, quality-check, or validate those samples. |
| `WP02-B2-SWEET-BLUE-LUPIN-MEASURE-SUBSTITUTION-R538-20261017-S03` | Pleming, Farahnaky & Majzoobi, [“Effects of bread making methods, lupin variety and gluten powder on the quality of bread enriched with high percentage of lupin flour”](https://ifst.onlinelibrary.wiley.com/doi/10.1111/ijfs.15323), *International Journal of Food Science & Technology* 56(12), 6707–6718 (2021), DOI [10.1111/ijfs.15323](https://doi.org/10.1111/ijfs.15323), “Materials and methods” and abstract. | Species, commercial flour sources, 20:80 dry-matter blends, gluten additions, bread methods, and reported formula-specific bread outcomes. | One controlled Australian study, not a transferable ratio or direct trial of the Lupina retail product. |

## Static checks

- Confirmed the target active reference has the recorded bilingual display, empty aliases, null density, empty unit mappings, and no attached form; confirmed its ledger measurement and substitution states are both still `not_yet_researched`.
- Checked current ledger and archive ownership for the proposed source IDs and URLs; no collisions or prior owners were found. Verified the adjacent R529 decision scopes itself to *L. albus* and explicitly excludes sweet blue lupin.
- Projected the listed queries from the current references/forms and the documented `IngredientSearch.kt` matching behavior. No picker change is proposed.
- Parsed every manifest-listed recipe file and ingredient row; counts, zero text hits, zero candidate links, and snapshot hashes are recorded above.
- This review creates one Markdown proposal only. No software tests, build, emulator, or deployment were run.

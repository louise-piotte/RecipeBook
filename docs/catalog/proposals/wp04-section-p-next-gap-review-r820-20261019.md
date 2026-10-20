# WP04 Section P R820 — raw calamari CNF portion review

- **Review date:** 2026-10-19.
- **Candidate:** Historical Health Canada Canadian Nutrient File (CNF) 2015 count portion for the existing `ingredient-ref-calamari`.
- **Recommendation:** Record one code- and edition-specific published `count_weight` observation: one raw, mixed-species squid is listed as 272.0 g under CNF 2015 Food Code 3125. Set only this ledger record's `measurementState` to `researched_supported` for the historical observation. Do not turn it into an identity-wide recipe measure or active conversion.
- **Write scope:** This proposal only. No catalog, ledger, recipe, plan, roadmap, workflow, or generated file was changed.

## Open checklist and boundary from prior work

The open WP04 Section P parent remains **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below”** in the [live plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8167). This review addresses a measurement-evidence gap on an existing generic squid/calamari identity, not a new species or product identity.

This evidence is distinct from the recent shellfish work: R808 integrated edible crab, R811 held Iceland cockle outside the active catalog, R814 recorded Clover Leaf canned-crab label portions, and R817 recorded Eastern-oyster CNF 2015 portions. Calamari already has a ring-cut form from R368, frozen squid-tube form from R539, and separate breaded-ring product identity from R470. None establishes the raw squid count portion below. The older holds for dried squid and calamari in marinara cover other product boundaries.

## Existing identity, terminology, and measurement state

The active reference is `ingredient-ref-calamari`, displayed `calamari / calmar`, with English alias `squid`, category `PROTEIN`, `defaultDensity: null`, and `unitMappings: []`. Its ledger record has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it has no measurement observations or substitution findings.

The identity and bilingual wording remain unchanged. The already-owned OQLF source `WP04-S38` supports Québec French `calmar` and English `squid`; the OQLF entry was last updated in 1998 and lists more than one squid genus. The active generic row is species-unspecified. The OQLF page also lists `encornet` as a privileged term, while separate OQLF sources already on this ledger record describe bait-specific or *Loligo*-scoped uses. Preserve the existing alias allocation in this measurement-only proposal; do not add another name or imply a species from the CNF record.

The current forms are `calamari rings / rondelles de calmar` (cut shape) and `frozen squid tubes / tubes de calmar congelés` (commercial frozen tube presentation; raw/cooked state unspecified). The breaded-ring product is a separate active ingredient reference. Neither form is a generic raw-squid state, and no form is proposed for this source observation.

## CNF 2015 evidence and limits

Health Canada's [CNF 2015 serving-size page, Food Code 3125](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3125) describes **“Mollusks, squid (calamari), mixed species, raw”** and gives the French source name **“Mollusques, calmar, espèces diverses, crues.”** Under available serving sizes it lists **1 squid = 272.0 g** and **total refuse 0%**. The page also lists a 100 g edible-portion baseline and a 90 g food-guide serving; neither is proposed as a kitchen measure.

The [2015 CNF Users' Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), section C, says the portion conversion weights are food-specific weights for the described portions and are weights of edible material without refuse. Record the exact code-level count as historical published evidence. Do not infer the squid's size, species, cleaning state, or whole-as-purchased weight: the serving page defines none of these, and “total refuse 0%” does not establish a generic squid yield. Do not derive a density or transferable count conversion from one food-code portion.

Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the 2026 CNF is published in relational CSV files and that the 2015 online search remains available as an interim access route while a more user-friendly 2026 viewer is developed. The linked 2026 [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) were not accessible through the available web reader. No CNF 2026 row-level finding is claimed: this proposal does not claim that Food Code 3125 or its portion continues in the 2026 release. Keep a later row-level check open.

## Exact proposed ledger delta

Append two sources to the existing `ingredient-ref-calamari` record. The exact serving-page URL has no current ledger owner. The 2015 Users' Guide URL is already cited on other records, including the R817 Eastern-oyster record; use a new record-specific source ID for this calamari evidence.

```json
[
  {
    "sourceId": "WP04-SECTIONP-CALAMARI-CNF-PORTION-R820-20261019-S01",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3125",
    "title": "Health Canada, Canadian Nutrient File 2015 serving size, Food Code 3125",
    "versionOrDate": "CNF 2015; page details modified 2019-03-01",
    "accessedOn": "2026-10-19",
    "locator": "English and French food descriptions; Food Code 3125; available serving size 1 squid = 272.0 g; total refuse 0%.",
    "supports": "Lists a raw, mixed-species squid food and the source-specific count portion 1 squid = 272.0 g. The page provides no size definition or weighing protocol.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP04-SECTIONP-CALAMARI-CNF-PORTION-R820-20261019-S02",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html",
    "title": "Health Canada, Canadian Nutrient File — Users Guide",
    "versionOrDate": "2015",
    "accessedOn": "2026-10-19",
    "locator": "Section C, Conversion factor file, Portion size conversion factors; especially the description of generic portion weights and edible material without refuse.",
    "supports": "Explains that CNF conversion-factor weights are food-specific weights for described portions and that the weights are for edible material without refuse.",
    "sourceKind": "food_composition"
  }
]
```

Append one observation and change only `measurementState` on this ledger record:

```json
{
  "observationId": "calamari-raw-cnf2015-one-squid-r820-20261019",
  "relationship": "count_weight",
  "value": 272.0,
  "valueUnit": "g",
  "foodDescription": "Mollusks, squid (calamari), mixed species, raw / Mollusques, calmar, espèces diverses, crues (CNF 2015 Food Code 3125).",
  "foodState": "Raw, mixed-species squid as described for CNF 2015 Food Code 3125; the page reports total refuse 0%.",
  "measurementMethod": "The CNF 2015 serving-size page lists 1 squid = 272.0 g. It states no squid size definition or weighing protocol.",
  "quantityBasis": "One count portion for this historical food-code entry. CNF 2015 describes conversion-factor weights as edible material without refuse. The entry does not identify species, size, cleaning state, or whole-as-purchased mass; do not infer a general count mapping or yield.",
  "sourceQuantity": { "amount": 1, "unit": "squid" },
  "observedMassG": 272.0,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP04-SECTIONP-CALAMARI-CNF-PORTION-R820-20261019-S01",
    "WP04-SECTIONP-CALAMARI-CNF-PORTION-R820-20261019-S02"
  ]
}
```

Set `measurementState` to `researched_supported` to reflect that a historical, source-specific count weight is published. Keep `identityState: verified` and `substitutionResearchState: not_yet_researched`. Do not add a form link, density, unit mapping, unit conversion, package/cooking yield, substitution finding, rule, recipe link, reference alias, or active picker measure. In particular, do not treat the CNF's 100 g baseline or 90 g food-guide serving as recipe portions, and do not attach this generic raw/mixed-species source to the cut-only calamari-rings form.

Append one `accepted` decision citing both new sources. State that the one-squid weight is retained only as a historical CNF 2015 Food Code 3125 observation, with no inference about species, size, cleaning, or current CNF 2026 values, and no active conversion or recipe link.

## Catalog, source ownership, and picker audit

The current snapshot contains **1,886 ingredient references** and **199 forms**. The generic calamari row and its two form rows have no measurement observation. The active search index keeps forms projected to their parent ingredient and checks a complete word phrase inside longer indexed terms before falling back to substring matching; exact form queries return their form-owning parent. The proposed delta is ledger-only, so every picker result below remains unchanged.

| Query | Current and projected result | Search detail |
|---|---|---|
| `squid` | `ingredient-ref-calamari` | Existing English alias; frozen-tube and ring-form terms also belong to this same parent. |
| `calamari`; `calmar` | `ingredient-ref-calamari`; `ingredient-ref-breaded-calamari-rings` | Phrase-first matching finds the query inside the breaded product's longer English/French display terms, so these broad queries remain multi-result. |
| `calamari rings`; `squid rings` | `ingredient-ref-calamari` with the ring-cut form | Exact form phrase resolves to its parent; the separate breaded identity is not returned by these unqualified exact ring-form queries. |
| `rings`; `rondelles` | `ingredient-ref-calamari`; `ingredient-ref-breaded-calamari-rings` | Broad subphrase search returns both the cut form and the breaded product. |
| `frozen squid` | `ingredient-ref-calamari` | The frozen-tube form projects to the generic parent. |
| `raw squid`; `one squid`; `272 g` | No result | None of these phrases is indexed; a ledger observation does not create aliases or picker terms. |
| `breaded calamari rings`; `rondelles de calmar panées` | `ingredient-ref-breaded-calamari-rings` | Exact prepared-product names remain on the separate breaded identity. |

The proposed source IDs and observation ID are absent from the live ledger and searched Section P proposal/batch archive. The serving-page URL is not owned elsewhere in the ledger; the guide URL is reused by other ledger records, so the source ID remains scoped to this calamari record. Reuse the existing OQLF `WP04-S38` only as the current terminology evidence; do not duplicate or alter it. There are eight global unit-conversion records and no calamari/squid/calmar match. Both active substitution-rule files contain zero rules.

## Recipe demand and substitution boundary

The read-only manifest scan parsed all **114 recipe files** and **1,123 ingredient rows**. The sole squid/calamari row is recipe 023, row 1: **140 g sliced calamari**, linked to `ingredient-ref-calamari` and `ingredient-form-calamari-rings`, with preparation `sliced into rings / tranché en rondelles`. It asks for a weighed ring-cut quantity, not one raw squid. The recipe's 140 g amount is not measured, explained, or replaced by the CNF portion in this proposal. No other bundled ingredient row requests raw squid or a squid count.

The CNF count source does not provide substitution evidence. Preserve `substitutionResearchState: not_yet_researched`, add no substitution finding or rule, and do not infer an equal replacement for calamari, squid tubes, calamari rings, or breaded calamari from this weight.

## Sources and static checks

| Source | Evidence used | Limits |
|---|---|---|
| Health Canada, [CNF 2015 serving size, Food Code 3125](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3125) | Raw, mixed-species squid food description; source French name; one squid = 272.0 g; total refuse 0%. Page details say modified 2019-03-01. | Historical 2015 record. No size, species, cleaning state, weighing protocol, or edible-yield method is stated. The listed count is not a generic whole-market squid conversion. |
| Health Canada, [CNF Users' Guide (2015)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) | Section C identifies weights as food-specific weights of described portions and says the weights are for edible material without refuse. | General interpretation of CNF conversion weights; it supplies no additional squid-size or measurement detail. |
| Health Canada, [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Says CNF 2026 relational CSV files are available and the CNF 2015 online search remains an interim access route. | Current 2026 row values are not claimed; the linked Food Name and Measure Weight Conversion CSVs could not be opened with the available web reader. |
| OQLF, [calmar (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar) | Existing ledger source `WP04-S38`; supports preferred Québec `calmar` and English `squid`. | Last updated 1998; lists multiple squid genera and a further privileged French term. It is terminology evidence, not CNF weight or product-state evidence. |

Static review parsed the active reference, form, ledger, manifest, and all manifest-listed recipe JSON read-only; confirmed the current parent/form ownership, zero existing calamari measurements, source-ID and observation-ID availability, eight unrelated unit conversions, no calamari substitution rules, picker query projection, and the single 140 g ring-cut recipe row. The ledger schema accepts a source-specific `count_weight` observation with the proposed fields. Only this proposal file is in scope for the review. No software tests, build, emulator run, or deployment were run. Under the current [`AGENTS.md`](../../../AGENTS.md) rule, no testing is needed if the eventual change only adds database JSON data; static validation is sufficient for that data-only integration.

## Recommendation

Accept one historical CNF 2015 published count-weight observation on `ingredient-ref-calamari`: one raw, mixed-species squid for Food Code 3125 at 272.0 g. Keep it traceable to that code and edition, and keep the uncertainty about size, species, cleaning, and current CNF 2026 rows explicit. Preserve all existing labels, aliases, forms, recipe lines, density and mappings, and substitution research state. This is source evidence for the generic reference's ledger only; it does not create a reusable count conversion or describe the 140 g ring-cut recipe.

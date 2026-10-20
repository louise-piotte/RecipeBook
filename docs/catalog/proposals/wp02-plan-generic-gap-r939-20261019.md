# WP02 plan generic gap R939: rye-germ fraction review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Accepted and integrated in the R939–R941 batch; see the integration README. The shared data now contains the identity-only rye-germ reference and its source-scoped evidence.
- **Open-plan anchor:** WP02 Section A7 remains open for review of other grain meals and milling products ([plan, A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Queue disposition:** Keep the named Anson Mills wheat-meal lead out of scope because further research on one commercial product adds no ingredient diversity. The plan already records this disposition. Any brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only roster work is out of scope for the same reason. This proposal selects one generic cereal fraction instead.
- **Selected gap:** The isolated rye-germ fraction, proposed as `rye germ / germe de seigle`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference. Use the OQLF bilingual term; add no aliases, forms, measurements, recipe links, conversions, yields, or substitutions.

## Recommendation and identity boundary

The primary cereal-germ study prepared germ from rye, assessed the preparations for potential use as food ingredients, and concluded that the preparations appeared suitable as alternatives to commercial mill germ. It separately notes that the rye and triticale germ lipids in its samples had a very high linolenic-acid content that could lead to oxidation problems. This supports a generic rye-grain fraction with food-ingredient potential, while leaving the sample composition and oxidation observation tied to the study. It does not establish common retail availability, a milling specification, routine household use, storage guidance, or a reusable recipe amount. [R939-S01]

Use `rye germ` for the rye-germ fraction described in that study. Keep it separate from rye grain, rye bran, rye meal, rye flours, rye flakes, sprouted rye grain or flour, and malted rye flour. The study's impact-milling preparation is not a general processing standard for every rye-germ product. Do not change existing rye, wheat-germ, oat-germ, barley-germ, toasted-corn-germ, or branded cereal rows. [R939-S01; WP03-S53]

OQLF's GDT has the exact bilingual term pair `germe de seigle / rye germ` in the processed-cereal-food and animal-feeding domains. Use `germe de seigle` as the Québec French display; the entry supports the name but does not establish a consumer product, human-food use, or measure. The human-food potential comes from the primary study, not from the OQLF terminology entry. Keep both alias arrays empty because the exact bilingual display terms already provide retrieval phrases. [R939-S02]

## Generic scope and nearby decisions

This is one generic grain-fraction review, not a cereal-germ roster assignment. No brand, product line, flavour family, SKU, or retailer variant was researched. The already-dispositioned Anson Mills named wheat-meal lead and the commercial-only Section F cereal-roster clauses remain out of scope because commercial-product counts do not add ingredient diversity. Preserve all existing branded entries and product-scoped evidence; do not transfer any product-specific claim or measure without a separate transferability review.

The active oat-germ and barley-germ identities are nearby but distinct source-grain fractions. The shared Barnes study directly covers rye as well as oats and barley; this proposal extends only the rye-germ candidate and does not reopen those decisions. The existing whole rye, bran, meal, flake, and flour identities remain unchanged. [R933, R936, R939-S01]

## Ownership and recipe-demand audit

Read-only audit of the shared repository on 2026-10-19:

| Surface | Current state | Proposed boundary |
| --- | --- | --- |
| Ingredient references | 1,958 references. No reference owns ID `ingredient-ref-rye-germ` or the exact phrases `rye germ`, `rye-germ`, or `germe de seigle`. Existing rye-related rows include rye grain, rye bran, rye meal, rye flakes, rye flour and flour types, whole rye flour, and sprouted rye flour. Existing germ rows include wheat germ, toasted corn germ, oat germ, and barley germ. | Add one rye-germ identity only. Do not edit, merge, or reclassify neighboring or branded rows. |
| Ingredient forms | 205 forms; no form label, match term, or ID owns the proposed phrases or ID. | Add no form or processing state. The evidence does not establish a consumer-facing form taxonomy. |
| Legacy identities | 55 candidates; no candidate owns the proposed ID or exact English/French phrases. | Do not promote or merge a legacy identity. |
| Research ledger | At review time, 2,363 records; no record owned the ID or exact English/French phrases. The Barnes paper was already represented by source ID `WP02-B2-OAT-GERM-R933-20261019-S01` on the oat-germ and barley-germ records. | Integration added the rye identity record and reused that source ID for rye-specific support rather than duplicating the URL. It also added the OQLF exact-term source and no measurement or formula findings. |
| Bundled recipes | All 114 manifest-listed recipe files and their serialized content and ingredient rows were scanned. No match for the proposed ID, `rye germ`, `rye-germ`, `rye embryo`, `germe de seigle`, or `germes de seigle`; zero matching recipe files and ingredient rows. | No recipe link or amount is justified by current bundled demand. |

The exact source-grain-qualified phrases are unowned in current references, forms, legacy identities, and standalone ledger records. Do not add bare `germ` / `germe`, `rye` / `seigle`, or `rye embryo` as aliases: they are unnecessary for exact retrieval and could blur grain, sprouting, and milling-fraction results. Existing broad rye and germ searches can continue to return their current distinct entries.

## Measurement and substitution limits

The primary study's nutrient analyses and oxidation observation describe its own prepared rye-germ sample. They do not establish a household quantity, cup weight, density, shelf-life rule, cooking yield, or universal composition. No reviewed source provides a reusable kitchen measure. The integration leaves `defaultDensity` null and `unitMappings` empty, with `measurementState: not_yet_researched`.

The food-ingredient suitability assessment is not a recipe substitution result. It gives no recipe, replacement direction, or proportion. The integration uses `substitutionResearchState: not_yet_researched` and adds no global or contextual substitution rule. Keep the study's oxidation caveat scoped to its rye-germ sample rather than turning it into general handling advice.

## Integrated identity-only data

The integration adds this reference:

```json
{
  "id": "ingredient-ref-rye-germ",
  "nameEn": "rye germ",
  "nameFr": "germe de seigle",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The integration creates one `ingredient_reference` ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It reuses `WP02-B2-OAT-GERM-R933-20261019-S01` for the Barnes URL with rye-sample-specific support and adds the OQLF `germe de seigle` source. It adds no forms, aliases, measurements, conversions, yields, recipe links, or substitution findings.

## Evidence and source limits

| Source ID | Source and support | Limit |
| --- | --- | --- |
| **Reused `WP02-B2-OAT-GERM-R933-20261019-S01`** | P. J. Barnes, [“Composition of cereal germ preparations”](https://pubmed.ncbi.nlm.nih.gov/7124118/), *Zeitschrift für Lebensmittel-Untersuchung und -Forschung* 174(6) (1982), 467–471; DOI [10.1007/BF01042727](https://doi.org/10.1007/BF01042727). The abstract says rye germ was prepared by impact milling, analyzed for nutrients in a preliminary assessment of food-ingredient potential, and judged alongside the other preparations as apparently suitable for food-ingredient applications. It specifically notes very high linolenic-acid content in the study's rye and triticale germ samples, which could lead to oxidation problems. | Primary research for a prepared rye-germ fraction and study-scoped food-ingredient potential. It does not establish market prevalence, a retail standard, home use, a recipe amount, storage conditions, or an active substitution. The lipid and oxidation statements are sample-specific. This URL is already recorded on oat-germ and barley-germ ledger records; reuse its existing source ID if integrating. |
| **R939-S02** | Office québécois de la langue française, GDT, [*germe de seigle*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487853/germe-de-seigle), entry authored by Marcello Piccioni (1965). Lists English `rye germ` and the domains `alimentation céréale traitée` and `zootechnie alimentation animale`. | Direct support for the bilingual term pair. The entry's animal-feeding domain and terminology record do not establish a current Canadian consumer product, human-food use, composition, processing standard, or measurement. |
| **Reused `WP03-S53`** | Office québécois de la langue française, GDT, [*seigle*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432764/seigle). Supports the base French term `seigle`, English `rye`, and says the word applies to the plant and its grain. | Supports the base grain term only; R939-S02 is the exact compound-term source. |
| **R933 and R936** | Existing [oat-germ review](./wp02-section-b2-b3-generic-gap-review-r933-20261019.md) and [barley-germ review](./wp02-plan-generic-gap-r936-20261019.md). | Neighboring generic cereal-fraction decisions. They do not establish rye-specific composition, French terminology, market prevalence, or measures. |

## Remaining uncertainty

1. The identity is research-supported as a prepared rye fraction with food-ingredient potential; the reviewed sources do not establish common retail availability or routine household use.
2. The exact OQLF bilingual term is supported, but its record includes both processed cereal foods and animal feeding and does not establish the current Canadian market.
3. The high-linolenic-acid and possible oxidation observations apply to the study sample; do not generalize them into shelf-life or handling guidance.
4. There is no bundled recipe demand, household measure, reusable density, or general substitution evidence.
5. Preserve existing branded rows and product-scoped evidence. No commercial roster was pursued because commercial-product counts do not add ingredient diversity.

No software tests were run; this catalog change only adds database JSON, consistent with `AGENTS.md`.

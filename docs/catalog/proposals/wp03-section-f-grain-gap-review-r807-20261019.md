# WP03 Section F R807 — Kiwicha grain terminology review

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only; no shared catalog, ledger, plan, roadmap, recipe, generated-index, or workflow file was changed.
- **Recommendation:** Add the single English search alias `kiwicha` to the existing `ingredient-ref-amaranth-grain` reference. Keep the display pair `amaranth / amarante`, all current French and English aliases, numeric fields, forms, and substitutions unchanged.
- **Scope:** The Quechua-derived English-market term for the edible grain of *Amaranthus caudatus*. This is an alias review of the existing edible-seed grain identity, not a new species reference, French display review, or flour/pop product review.

## Open gap and prior decision

Section F remains open for additional grain terminology. The live amaranth-grain row has no exact owner for `kiwicha`, while OQLF lists the term under the English translations of its edible-seed `amarante` entry. The earlier R168 work reviewed the French display and retained `amarante`; it also left `kiwicha` inactive. This proposal reopens only the separate English alias decision. Current Peru Ministry of Agrarian Development and Irrigation (MIDAGRI) product information now identifies Kiwicha as a commercial name for *A. caudatus* and explicitly lists a grain presentation. That helps distinguish this food-grain use from the botanical and planting-seed uses that appear in broad web searches.

The new evidence supports a narrow query alias, while leaving `amarante` as the preferred Québec French display. It does not show that `kiwicha` appears on a current Canadian or Québec food package; the term is supported by OQLF's English-translation field and by current Peru food-product evidence. No French `kiwicha` alias or new species-level row is warranted here.

## Identity and bilingual terminology evidence

| Source | Evidence and limits |
|---|---|
| Existing `WP03-S23`, Office québécois de la langue française, [GDT: amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), last updated 2009; reopened 2026-10-19. | The preferred French term is `amarante`; the definition identifies an edible-seed cereal and the note says its seeds can be used whole or milled. The English translations include `amaranth` and `kiwicha`; OQLF says `kiwicha` has some Anglo-American use and derives from Quechua. This is Québec bilingual terminology evidence, but the page does not present `kiwicha` as a French term or establish current Canadian package usage. Reuse the existing ledger source ID and URL; do not add a duplicate OQLF source record. |
| Proposal-local `WP03-KIWICHA-R807-20261019-S01`, Peru MIDAGRI / Agroideas, [Kiwicha](https://agroideas.gob.pe/project/kiwicha/), accessed 2026-10-19. | Names *Amaranthus caudatus* as the scientific name and `Kiwicha` as the commercial name. Product presentations include grain, flour, freeze-dried flour, and Kiwicha Pop; the page mentions soups, pancakes, and breads as uses. It supports a current Peruvian food-product term and grain presentation, not a Canadian/Québec retail name, a household measure, or a substitution. The page does not state a nutritional-table serving basis. |
| Proposal-local `WP03-KIWICHA-R807-20261019-S02`, Peru National Institute of Agrarian Innovation (INIA), [germplasm records](https://genebankperu.inia.gob.pe/consulta?type=2&var=5), accessed 2026-10-19. | The current germplasm listing labels accessions `Kiwicha`, family Amaranthaceae, *Amaranthus caudatus L.* This independently corroborates the name-to-species mapping, but is a germplasm database rather than evidence about retail food packaging or kitchen use. |
| Existing `WP03-AMARANTH-GRAIN-QC-R106-20261014-S04`, Ontario Ministry of Agriculture, Food and Rural Affairs, [grain amaranth profile](https://omafra.gov.on.ca/CropOp/fr/field_grain/spec_grains/gama.html). | The Ontario grain-amaranth profile identifies *A. caudatus*, *A. cruentus*, and *A. hypochondriacus* in its grain-amaranth group. It helps limit the alias: `kiwicha` is not a synonym for every species or every form in the genus. The source is not a current Québec retail listing or a claim that a particular unlabeled amaranth product is *A. caudatus*. Its existing ledger record is reused. |

The active French display remains the OQLF-supported `amarante`. Add no French alias such as `kiwicha` or `amarante queue de renard`; the latter is descriptive wording in the OQLF definition, not a French translation term established by this review. Add no `quihuicha` spelling, which was not established by the Québec terminology entry or the current official product sources reviewed here.

## Current catalog, ledger, and search audit

The live package contains **1,884 ingredient references** and **199 forms**. `ingredient-ref-amaranth-grain` is a `GRAIN_AND_CEREAL` reference displayed as `amaranth / amarante`. Its current aliases are French `grains d'amarante` and English `ramdana`, `rajgira`; `defaultDensity` is null and `unitMappings` is empty. No form is attached to the grain row. The six related active references are amaranth grain, flour, flakes, greens, puffed amaranth, and sprouted-amaranth flour. No exact normalized `kiwicha` owner exists in active reference names, aliases, or form labels/match terms.

The grain's ledger record is `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`; it has no measurement observations or substitution findings. Existing source IDs and the proposed source-ID prefix were checked. The two Peru URLs and both proposal-local IDs above are currently unowned; the OQLF URL is already recorded as `WP03-S23` on the grain row and related amaranth records.

Search behavior follows accent/punctuation normalization and phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Static projection from the live references and forms gives:

| Query | Current result | With the proposed alias |
|---|---|---|
| `kiwicha` | 0 results | `ingredient-ref-amaranth-grain` only |
| `amaranth` / `amarante` | The same 6 related references | Unchanged; still 6 |
| `grains d’amarante` | `ingredient-ref-amaranth-grain` only | Unchanged |
| `amaranth flour` | Amaranth flour and sprouted-amaranth flour | Unchanged |
| `kiwicha flour` | 0 results | Unchanged; no alias is added to a flour row |

The alias makes an OQLF-listed English query usable without changing the broad family queries or assigning `kiwicha` to flour, flakes, greens, or puffed grain. It does not imply that other grain-amaranth species are *A. caudatus*.

## Bundled recipe demand

The manifest lists **114 recipe files and 1,123 ingredient rows**. A complete scan of each manifest-listed recipe file for `kiwicha`, `quihuicha`, *Amaranthus caudatus*, `amaranth`, and `amarante` found no matching file text or ingredient row. No recipe link, relink, or recipe-specific substitution is warranted.

## Measurement, density, and substitution evidence

**Measurement and density:** The MIDAGRI page provides a nutritional table but no serving mass or household basis; the INIA records identify accessions rather than edible portions. Health Canada's current [Table of reference amounts](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html) gives a broad grain category reference amount of 45 g dry / 140 g cooked, with household measures chosen to match that weight. This is nutrition-label serving guidance for a food category, not a Kiwicha-specific cup mass, bulk density, dry-to-cooked conversion, or recipe yield. No product-specific `g/cup` or transferable density was verified. Preserve `defaultDensity: null`, empty unit mappings, and the existing `researched_no_supported_value` measurement state.

**Substitutions:** The official Peru food page describes culinary uses but recommends no substitute or replacement ratio. No source reviewed establishes a safe global grain-to-grain equivalence or a contextual replacement for a particular dish, role, or method. The global and contextual substitution-rule files have no active amaranth rule. Add no substitution finding or rule; preserve `substitutionResearchState: not_yet_researched` because this alias-only pass did not establish a recipe-scoped replacement.

## Exact proposed delta

If accepted, add only `kiwicha` to `aliasesEn` on `ingredient-ref-amaranth-grain`:

```json
{
  "id": "ingredient-ref-amaranth-grain",
  "nameFr": "amarante",
  "nameEn": "amaranth",
  "aliasesFr": ["grains d'amarante"],
  "aliasesEn": ["ramdana", "rajgira", "kiwicha"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

Reuse existing `WP03-S23` for OQLF. On acceptance, append only the two Peru sources under the existing grain ledger record and record the narrow alias decision. Keep all other references, forms, recipe data, measurements, and substitution behavior unchanged. The two proposed Peru IDs are unallocated proposal-local names; allocate them only if the root accepts this proposal.

## Verification record

- Read the project instructions, requirements, roadmap, Section F plan and packet, catalog workflow, current grain row, relevant amaranth ledger record, R106/R168 reviews, manifest recipe list, and search implementation.
- Audited exact active term ownership, ledger URL/source-ID ownership, static query projections, and every manifest-listed recipe file and ingredient row.
- No Gradle tests, builds, instrumentation, or emulator work were run. This proposal changes documentation only; if the accepted catalog follow-up only adds database JSON data, `AGENTS.md` says no testing or emulator verification is needed for that data-only change.

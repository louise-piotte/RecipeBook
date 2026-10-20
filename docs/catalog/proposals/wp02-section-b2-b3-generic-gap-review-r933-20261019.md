# WP02 Section B2/B3 R933: oat-germ fraction review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No catalog JSON, ledger, plan, roadmap, checklist, workflow, or batch file was changed.
- **Open-plan anchor:** WP02 Section B remains open for alternative flours and starches, including the B2 flour-family work and B3 starch families ([plan, Section B](../../RecipeBook-global-ingredient-catalog-plan.txt#L3096); [open B2 item](../../RecipeBook-global-ingredient-catalog-plan.txt#L3108); [open B3 item](../../RecipeBook-global-ingredient-catalog-plan.txt#L3484)). This review proposes one adjacent generic cereal milling fraction.
- **Selected gap:** The isolated oat-germ fraction, proposed as `oat germ / germe d’avoine`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference if accepted. Treat the French compound as provisional. Add no aliases, forms, measurements, recipe links, conversions, yields, or substitutions.

## Recommendation and identity boundary

The primary cereal-germ study prepared germ fractions from oats and four other cereals by impact milling and concluded that the preparations appeared suitable as food ingredients. That supports oat germ as a distinct generic grain fraction. It does not establish that oat germ is commonly available to home cooks or routinely separated in ordinary oat milling. A later oat-processing review says the oat groat is soft and is not easily separated into germ, endosperm, and bran fractions. Keep the proposal narrow: it is a source-grain-qualified fraction supported by food-ingredient research, not a claim of a standardized retail ingredient or ordinary household use. [R933-S01–S02]

Use `oat germ` for the isolated oat embryo fraction. Keep it separate from oat bran, oat flour, whole oat groats, whole-grain oat flour, sprouted or germinated oats, oat-germ oil, and extracted or concentrated oat components. The germ retained within a whole-grain oat is not a separate oat-germ ingredient. The study does not establish equivalence to wheat germ, toasted corn germ, or any other cereal germ beyond its limited comparison of composition and food-ingredient potential. [R933-S01–S03]

The OQLF supports `avoine` as the Québec French name for oat and `son d’avoine` as the distinct bran fraction; it does not list an exact term for oat germ. Propose `germe d’avoine` only as a transparent descriptive display, explicitly provisional pending Québec terminology review or a local human-food label. Keep both alias arrays empty. Reuse the existing ledger source `WP03-POATS-20261011-S05` for the OQLF base term if integrated; it supports `avoine`, not the proposed compound. Health Canada describes the germ as one of the grain’s parts and includes oats among cereal grains, but likewise does not establish a standalone oat-germ food name. [R933-S03–S05]

## Generic scope and nearby decisions

This review is for ingredient diversity, not a commercial-product roster. No brand, product line, flavour family, SKU, or retailer variant was researched. Existing branded oat-cereal references and their evidence remain unchanged. Any queued work limited to additional commercial products is out of scope because commercial-product counts do not add ingredient diversity; preserve existing entries and product-specific evidence without transferring them to this identity. The previously recorded out-of-scope disposition for additional research on Anson Mills’ named wheat meal remains closed and was not reopened here. [R890]

The earlier rice-germ boundary hold remains separate. Its human-food sources did not support standalone rice germ, while this proposal relies on a primary study that expressly prepared oat germ and assessed its potential as a food ingredient. Do not transfer the oat evidence or proposed naming to rice germ. [WP03-R60]

## Ownership, recipe demand, and picker audit

Read-only audit of the current package and proposal archive on 2026-10-19:

| Surface | Current state | Proposed boundary |
| --- | --- | --- |
| Ingredient references | 1,953 references. No reference owns `oat germ`, `germe d’avoine`, or the proposed ID. Existing oat references include oat bran, oat flour, oat groats, oat beverage, whole-grain oat flour, and sprouted rolled oats; existing wheat germ and toasted corn germ remain distinct. | Add one generic oat-germ identity only. Do not edit or merge any neighboring or branded row. |
| Ingredient forms | 204 forms; no exact oat-germ form or form hint. | Add no forms or processing states. The sources do not establish a stable consumer form taxonomy. |
| Legacy identities | 55 candidates; no proposed ID or exact English/French name. | No legacy promotion or merge. |
| Research ledger | 2,357 records; no oat-germ record or candidate. The OQLF oat source is already recorded as `WP03-POATS-20261011-S05`; the primary paper and oat-processing review do not appear to have existing oat-germ records. | If accepted, create only an identity record and reuse the OQLF source. Add no observations or findings. |
| Bundled recipes | All 114 manifest-listed recipes and 1,123 ingredient rows were scanned. No match for `oat germ`, `germe d’avoine`, `germe d'avoine`, `oat embryo`, or `germ fraction of oats`. | No recipe link or amount is justified by current bundled demand. |

The picker uses accent-normalized whole-word phrases before its partial-match fallback ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Static projection from current names and aliases:

| Query | Current results | With proposed display | Consequence |
| --- | ---: | ---: | --- |
| `oat germ` | 0 | 1 | Exact English phrase resolves to the new identity. |
| `germe d’avoine` / `germe d'avoine` | 0 | 1 | Accent and apostrophe normalization produce one exact French result. |
| `oat` | 9 | 10 | Adds one generic result; the broad query continues to show existing generic and branded oat entries. |
| `avoine` | 28 | 29 | Adds one generic result alongside existing oat forms, products, and brands. |
| `germ` | 2 | 3 | Returns wheat germ, toasted corn germ, and oat germ as distinct fractions. |
| `germe` | 9 | 10 | Adds the oat fraction; existing sprouted-oat terms remain separate. |

Do not add bare `germ`, `germe`, `oat`, `avoine`, or sprouting-related aliases. The source-grain-qualified displays already support exact retrieval and retain meaningful broad-search results.

## Measurements and substitution limits

The primary study reports compositional testing of its prepared germ samples; those sample measurements do not establish a household amount, density, cup weight, cooking yield, or universal nutritional profile. No source reviewed gives a transferable oat-germ measure or a recipe amount. Leave `defaultDensity` null and `unitMappings` empty. If the identity is integrated, use `measurementState: not_yet_researched` unless a separate measurement review supports a more specific state.

The study’s assessment that cereal germ preparations appeared suitable as food ingredients is not a recipe substitution rule. It does not test oat germ in a named home recipe or establish replacement for oat bran, oat flour, wheat germ, or another flour fraction. Add no global or contextual substitution rule; use `substitutionResearchState: not_yet_researched` pending a separate review.

## Proposed identity-only data

If accepted later, add one reference:

```json
{
  "id": "ingredient-ref-oat-germ",
  "nameEn": "oat germ",
  "nameFr": "germe d’avoine",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

If later integrated, create one `ingredient_reference` ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Mark the French display provisional. Add no forms, aliases, measurements, conversions, yields, recipe links, or substitution findings. This review itself changes only this proposal document.

## Evidence and source limits

| Source ID | Source and support | Limit |
| --- | --- | --- |
| **R933-S01** | P. J. Barnes, [“Composition of cereal germ preparations”](https://pubmed.ncbi.nlm.nih.gov/7124118/), *Zeitschrift für Lebensmittel-Untersuchung und -Forschung* 174(6) (1982), 467–471; DOI [10.1007/BF01042727](https://doi.org/10.1007/BF01042727). The abstract says germ preparations from oat, wheat, rye, triticale, and barley were produced using an impact mill and assessed for potential food-ingredient use. | Primary study and direct support for an oat-germ preparation. The preparation method, composition results, and comparison with commercial wheat germ are study-specific; the article gives no home-cooking amount, density, recipe, market standard, or transferable substitution. |
| **R933-S02** | E. A. Decker et al., [“Processing of oats and the impact of processing operations on nutrition and health benefits”](https://www.cambridge.org/core/journals/british-journal-of-nutrition/article/processing-of-oats-and-the-impact-of-processing-operations-on-nutrition-and-health-benefits/12103B74748A0B4FFD8ABC1B5699786F), *British Journal of Nutrition* 112(S2) (2014), S58–S64; DOI [10.1017/S000711451400227X](https://doi.org/10.1017/S000711451400227X). Describes the oat germ as a grain component and explains that oat groats are not easily separated into germ, endosperm, and bran. | Secondary processing review. Supports a process limitation, not prevalence of a standalone oat-germ ingredient. |
| **R933-S03 (reuse `WP03-POATS-20261011-S05`)** | Office québécois de la langue française, [*avoine* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432769/avoine). | Supports the Québec French base term `avoine`, English `oat`, and *Avena sativa*; does not attest `germe d’avoine`. |
| **R933-S04** | Office québécois de la langue française, [*son d’avoine* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18955166/son-davoine). | Defines `son d’avoine` as the oat grain’s outer layer and describes its use as cereal or an ingredient; used only to keep oat bran distinct from oat germ. |
| **R933-S05** | Health Canada, [*Grains entiers — les faits*](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire-canadien/ressources/recommendations-saine-alimentation/savourez-une-variete/grains-entiers/les-faits.html). | Supports the grain anatomy terms `son`, `endosperme`, and `germe` and includes oats among cereal grains; it does not name a standalone oat-germ product. |
| **R890** | Existing [generic grain-fraction scope review](./wp02-next-generic-grain-gap-review-r890-20261019.md). | Its prior disposition marks additional research on the named Anson Mills wheat-meal product out of scope because another commercial product would not add ingredient diversity. No product work from that review is reused here. |
| **WP03-R60** | Existing [rice-germ human-food boundary hold](./wp03-section-f-rice-germ-human-food-boundary-hold-20261013-r60.md). | Cited to preserve the separate rice-germ decision; it does not support oat germ or its terminology. |

## Remaining uncertainty

1. The oat-germ identity is supported as a research-prepared food-ingredient fraction, but the literature says oats are not easily separated into discrete germ, bran, and endosperm. No claim of a common consumer product or routine household use is made.
2. `Germe d’avoine` is descriptive French built from OQLF-supported `avoine`; the exact compound remains provisional pending Québec review.
3. No bundled recipe demand, household measure, reusable density, or general substitution is supported.
4. Preserve current branded oat-cereal rows and all product-scoped claims. Commercial brand, product-line, flavour-family, SKU, and retailer-variant rosters remain out of scope because commercial-product counts do not add ingredient diversity.

No software tests were run; this proposal does not modify software or catalog JSON.

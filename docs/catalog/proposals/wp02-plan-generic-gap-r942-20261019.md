# WP02 plan generic gap R942: triticale-germ fraction review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated. Root accepted the generic identity and added one reference and one research-ledger record; no forms, aliases, measures, recipe links, conversions, yields, or substitutions were added.
- **Open-plan anchors:** WP02 Section B remains open for alternative flours and starches ([plan, Section B](../../RecipeBook-global-ingredient-catalog-plan.txt#L3096); [open B2 flour families](../../RecipeBook-global-ingredient-catalog-plan.txt#L3108); [open B3 regional starches](../../RecipeBook-global-ingredient-catalog-plan.txt#L3569)). The broader A7 parent also remains open for other grain meals and milling products ([plan, A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). This review selects one generic cereal fraction adjacent to that flour-and-starch coverage.
- **Selected gap:** Triticale germ, proposed as `triticale germ / germe de triticale`.
- **Decision:** Add one identity-only `GRAIN_AND_CEREAL` reference. Keep the French compound provisional. Add no aliases, forms, measurements, recipe links, conversions, yields, or substitutions.

## Recommendation and identity boundary

Barnes prepared a triticale-germ fraction by impact milling and assessed cereal-germ preparations for potential use as food ingredients. The abstract says the preparations appeared suitable as alternatives to commercial mill germ, while noting that the study's rye and triticale germ samples had very high linolenic-acid content that could lead to oxidation problems. This supports a narrowly scoped, source-grain-qualified research fraction; it does not show that triticale germ is a standardized or commonly available household ingredient. [R942-S01]

Use `triticale germ` only for the germ fraction prepared from triticale grain in that study. Keep it separate from whole triticale grain, triticale bran, triticale flakes, triticale flour, the sprouted-triticale-grain candidate, and other cereal germs. The paper does not report a standardized purity or milling specification, so do not describe the proposed identity as an analytically pure embryo or infer equivalence with commercial wheat germ. Do not add broad `triticale`, `germ`, or `germe` aliases; those terms would overlap existing grain, milling, sprouting, and cereal-germ results.

OQLF lists `triticale` as the French and English term for the wheat–rye hybrid but marks it non-current; it does not attest `germe de triticale`. Keep that French compound as a transparent descriptive display only, explicitly provisional pending exact Québec terminology or a local human-food label. [R942-S02]

## Generic scope and nearby decisions

This review addresses generic cereal-fraction diversity. It does not pursue a brand, product line, flavour family, SKU, or retailer-variant roster: commercial-product counts do not add ingredient diversity. Preserve every existing branded row and its product-scoped evidence; do not merge or delete any identity without a separate transferability review.

The adjacent [oat-germ review](./wp02-section-b2-b3-generic-gap-review-r933-20261019.md), [barley-germ review](./wp02-plan-generic-gap-r936-20261019.md), and [rye-germ review](./wp02-plan-generic-gap-r939-20261019.md) use the same primary cereal-germ paper but select different source-grain fractions. Triticale is separately named in that paper and has no standalone germ identity here. Its mention in the rye-germ evidence about sample lipids is not a triticale-germ owner or a transferable measurement. The existing triticale grain, bran, flakes, flour, and sprouted-grain candidate stay unchanged.

## Ownership, recipe demand, and picker audit

Read-only audit of the current repository data on 2026-10-19:

| Surface | Current state | Proposed boundary |
| --- | --- | --- |
| Ingredient references | 1,961 references. No row owns `ingredient-ref-triticale-germ`, `triticale germ`, or `germe de triticale`. Existing triticale references are `ingredient-ref-triticale-grain`, `ingredient-ref-triticale-bran`, `ingredient-ref-triticale-flakes`, and `ingredient-ref-triticale-flour`; separate wheat-, oat-, barley-, and rye-germ identities also exist. | Add one triticale-germ identity only. Preserve all existing rows. |
| Ingredient forms | 205 forms; none owns the proposed ID or exact compound. | Add no form or process state. The study does not establish a consumer-facing form taxonomy. |
| Legacy identities | 55 candidates; no exact proposed ID or name. | No legacy promotion or merge. |
| Research ledger | 2,366 records; no standalone triticale-germ record or candidate. Existing triticale records cover grain, bran, flakes, flour, and a sprouted-grain candidate. The Barnes URL is already recorded on oat-, barley-, and rye-germ records under source ID `WP02-B2-OAT-GERM-R933-20261019-S01`; its triticale-sample mention is limited to the paper's oxidation observation. | Integration added one `ingredient_reference` record and reused the existing source IDs below. No measurement observations or substitution findings were added. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. No exact `triticale germ`, `triticale-germ`, `germe de triticale`, or `triticale embryo` match occurs in an ingredient row. | No recipe link or recipe amount is justified by current bundled demand. |

The proposed ID and exact name pair are unowned in active references, forms, legacy candidates, and standalone ledger records. The base term `triticale` already belongs to whole grain and overlaps several milling identities, so it should not be added as an alias. Keep any broad search behavior on the current triticale rows unchanged.

## Measurement and substitution limits

The primary study reports analyses of its prepared germ samples, not a transferable household measure. It supplies no cup weight, bulk density, kitchen conversion, cooking yield, package yield, or consumer preparation standard. Leave `defaultDensity` null and `unitMappings` empty. The accepted row uses `measurementState: not_yet_researched` unless separate culinary-measure evidence is reviewed.

The study's food-ingredient-potential statement does not establish a recipe role, replacement direction, proportion, or adjustment. Keep its composition and oxidation statements attached to the specific samples. Add no global or contextual substitution rule; use `substitutionResearchState: not_yet_researched` pending separate evidence.

## Proposed identity-only data

The integrated identity-only reference is:

```json
{
  "id": "ingredient-ref-triticale-germ",
  "nameEn": "triticale germ",
  "nameFr": "germe de triticale",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The integrated `ingredient_reference` ledger record uses `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Keep the French display marked provisional in the decision notes. Reuse the existing Barnes source ID `WP02-B2-OAT-GERM-R933-20261019-S01` for the exact PubMed URL, scoped to the paper's triticale sample and food-ingredient evaluation. Reuse `WP03-TRITICALE-FLAKES-20261012-S04` for OQLF's exact `triticale` term; it does not attest the compound `germe de triticale`. Add no forms, aliases, measurements, conversions, yields, recipe links, or substitution findings.

## Evidence and source limits

| Review source | Source and support | Limit |
| --- | --- | --- |
| **R942-S01; reuse `WP02-B2-OAT-GERM-R933-20261019-S01`** | P. J. Barnes, [“Composition of cereal germ preparations”](https://pubmed.ncbi.nlm.nih.gov/7124118/), *Zeitschrift für Lebensmittel-Untersuchung und -Forschung* 174(6) (1982), 467–471; DOI [10.1007/BF01042727](https://doi.org/10.1007/BF01042727). The abstract names triticale among the grains whose germ fractions were prepared by impact milling and evaluated for potential food-ingredient use. It notes high linolenic-acid content in the study's rye and triticale germ samples. | Primary research, reviewed here through its PubMed abstract. It supports a research-prepared triticale germ fraction, not current Canadian retail availability, routine household use, a standardized milling or purity specification, a recipe measure, storage advice, or a transferable composition/substitution claim. The oxidation note applies to the study samples. The exact URL and source ID already appear on oat-, barley-, and rye-germ ledger records. |
| **R942-S02; reuse `WP03-TRITICALE-FLAKES-20261012-S04`** | Office québécois de la langue française, [*triticale* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480832/triticale). Lists `triticale` as both French and English and defines it as a wheat–rye hybrid. | Supports only the base name. OQLF marks the term non-current and does not attest `germe de triticale`. The exact URL and source ID already appear on the triticale bran and flakes ledger records. |

## Remaining uncertainty

1. The triticale-germ identity is supported as a research-prepared cereal fraction with potential food-ingredient use, not as a standardized or commonly available home-cooking ingredient.
2. `Germe de triticale` is a provisional descriptive French compound; the reviewed Québec terminology source lists only the base term.
3. No bundled recipe demand, household measure, reusable density, or general substitution is supported.
4. Preserve existing branded rows and source-scoped claims. No commercial roster was pursued because additional product counts do not add ingredient diversity.

No software tests were run because this change adds ingredient database JSON under `AGENTS.md`. Static validation is recorded in the integration README.

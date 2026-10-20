# WP04 Section P anchovy identity integration

Integrated 2026-10-11 from the reviewed [anchovy identity proposal](../../proposals/wp04-section-p-anchovy-fish-identity-vs-paste-review-20261011.md). This batch adds one identity-only fish reference and its research-ledger record. It does not change recipes or application logic; the generated Kotlin reference index was refreshed from the canonical JSON.

## Catalog decision

- Added `ingredient-ref-anchovy`, displayed as `anchovy / anchois`, category `PROTEIN`, with only the English plural alias `anchovies`.
- Scoped the identity to the *Engraulidae* common-name group. OQLF supplies the Québec term and family name; CFIA guidance says family group names may be considered, while the Fish List query covered multiple species. The legacy Fish List query endpoint now returns HTTP 410, so this batch records the reviewed query and does not claim current endpoint availability.
- Kept the food-fish identity separate from `ingredient-ref-anchovy-paste`, which remains a `SAUCE_AND_CONDIMENT` product. No species-specific aliases, preparation forms, recipe links, measures, conversions, yields, or substitutions were added.
- The current bundled corpus has no anchovy recipe rows; the two fish-sauce rows remain linked to fish sauce.

## Sources

The research ledger records seven sources: [OQLF’s *anchois* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199027/anchois), [CFIA fish common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), the reviewed [CFIA Fish List query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Anchovy), [DFO’s Pacific anchovy profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/anchovy-anchois-fra.html), and three Canadian market examples. OQLF and CFIA support the bilingual family-level boundary; DFO’s profile applies to *Engraulis mordax* and is not generalized to imported products.

## Validation

- 1,011 ingredient references, 66 forms, 114 recipes, and 1,123 ingredient rows.
- 1,292 research-ledger records, 4,155 source entries, 3,403 distinct source IDs, and 8 unit conversions.
- Ingredient-reference normalization completed; `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- Generated catalog freshness check passed for 1,011 references.
- No tests were run because this batch adds database JSON only, as specified in `AGENTS.md`.

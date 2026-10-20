# WP02 Section A7 R867 — sorghum bran identity integration

Integrated 2026-10-19 from the [R867 proposal](../../proposals/wp02-generic-grain-cereal-milling-diversity-review-r867-20261019.md).

## Catalog change

Added one identity-only generic grain ingredient:

- `ingredient-ref-sorghum-bran` — `sorghum bran / son de sorgho`.
- Category: `GRAIN_AND_CEREAL`; aliases, density, and unit mappings are empty.
- Ledger identity is verified. Measurement and substitution research remain `not_yet_researched` with no observations or findings.
- No form, recipe link, measure, conversion, yield, or active substitution was added.

FAO AGROVOC lists `son de sorgho` as a source product of sorghum grain. FAO's processing chapter describes variable separated fractions, including fine bran and a coarser mixture containing germ and broken grain; no single grade or milling process is encoded. A 2024 primary study documents one fine black, tannin-rich sorghum-bran sample used in Chinese steamed bread. That sample, study formula, inclusion range, and outcome claims remain study-specific and were not transferred to the generic ingredient.

CFIA's common-name guidance says unqualified bran is understood as wheat bran and names other grain sources explicitly; that source is reused from the existing barley-bran evidence without changing it. OQLF defines the French base noun `son`, but its broader note discusses feed by-products and does not establish `son de sorgho` as a preferred Québec food label. The display remains provisional pending independent Québec French review. Feed materials, sorghum mill-feed, bran-enriched wholemeal flour, extracts, and branded formulations remain outside this identity.

The proposal's supplier-specific custom-milling page was excluded from generic evidence. It was not used to support general market availability, process, measurements, or performance.

## Scope and corpus review

- This is one generic milling fraction, not a brand or product-line roster. No brand, product-line, flavor, SKU, or retailer-only variants were researched or added.
- The cross-category queue review found no brand-only A7/B2 child assignment. Existing generic and branded rows and product-scoped evidence remain untouched; see the [generic-ingredient scope review](../generic-ingredient-scope-review-20261019/README.md).
- All 114 manifest-listed recipe files / 1,123 structured ingredient rows were scanned. No `sorghum bran`, `son de sorgho`, hyphenated form, or proposed ID was found; no recipe link was added.
- Existing sorghum grain, flour, grits, semolina, starch, puffed sorghum, and other cereal-bran identities were preserved.

## Sources

- [FAO AGROVOC, sorghum grain and source products](https://agrovoc.fao.org/browse/agrovoc/fr/page/c_7249) lists `son de sorgho`; this does not establish Québec terminology or food grade.
- [FAO, *Le sorgho et les mils dans la nutrition humaine*](https://www.fao.org/4/t0818f/T0818F07.htm) describes processing and variable bran fractions.
- [Zhang and Awika, 2024 study indexed in PubMed](https://pubmed.ncbi.nlm.nih.gov/39092915/) reports one sorghum-bran sample used in steamed bread; its recipe amounts and results remain sample-specific.
- [CFIA, grain and bakery product labelling](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), “Common name — Bran,” supports naming the non-wheat grain source. Existing source ID reused: `WP03-BARLEY-BRAN-20261013-R56-S03`.
- [OQLF, *son*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son) supports only the French base noun. Existing source ID reused: `WP03-BARLEY-BRAN-QC-R89-20261013-S01`.

FAO AGROVOC, the FAO chapter, and the primary study are registered on the new ledger row. Existing CFIA and OQLF source records were referenced without alteration. Product-specific study measurements and claims were kept out of the generic record.

## Validation snapshot

- Bundled package validation passed; package normalization and ingredient-reference normalization checks passed.
- Research-ledger JSON Schema validation passed.
- Generated Kotlin catalog is current at 1,899 references.
- Scoped ownership checks found one active sorghum-bran reference, one ledger record, no forms, no duplicate new source IDs, and no prior exact phrase owner. The AGROVOC URL is shared with the existing sorghum-grain record; no source record was reassigned.
- Recipe corpus remains 114 files / 1,123 ingredient rows with digest `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17`.
- UTF-8/no-BOM, bundled JSON encoding, local links and plan anchors, and scoped whitespace checks passed.
- Current catalog snapshot: 1,899 references / 201 forms / 114 recipes / 1,123 recipe ingredient rows; 2,307 ledger records / 10,882 source entries / 9,142 unique source IDs / 7,774 unique source URLs / 891 measurement observations / 370 substitution findings.
- No software tests, build, emulator, or deployment were run because the active change only adds database JSON data under `AGENTS.md`.

Section A7 remains open. The French display still needs independent Québec terminology review.

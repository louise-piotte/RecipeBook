# WP02 A6, WP03 Section F, and WP04 Section P integration (2026-10-12)

## Decisions

- **Jowar flour:** Added jowar flour as the only English alias on the existing sorghum flour / farine de sorgho reference. FSSAI names the paired Jowar Flour (Sorghum Flour) product from Sorghum bicolor, and a current Canadian mill uses the same pair. Kept bare jowar, jowar atta, and farine de jowar out; grain sorghum remains separate. Added four sources and the accepted alias decision to the existing ledger record. No recipe, form, measurement, conversion, yield, or substitution changed.
- **Chiwda/chivda:** Accepted the hold on bare chiwda/chivda as flattened-rice aliases and did not create a prepared-snack ingredient row. CSIR records a rice-flake synonym sense, while current Canadian recipe and retail examples use the same term family for prepared poha-based and cornflake-based snacks. Reused existing ledger source WP03-S93 and added seven sources plus the accepted hold decision to the existing poha record. No active reference, alias, form, recipe link, or numeric behavior changed.
- **Langoustine/scampi:** Promoted the held ingredient-ref-langoustine candidate in place to a verified, identity-only PROTEIN reference: French langoustine, English scampi, and French plural langoustines as an alias. CFIA species-linked names, OQLF terminology, and current Canadian supplier/retail wording support the bounded culinary identity. Kept Norway lobster, Dublin Bay prawn, langouste, lobster, shrimp/prawn, and French scampi outside. Added seven sources and the accepted decision to the existing ledger record. No recipe link, form, measurement, conversion, yield, or substitution changed.

All three reviews audited the full bundled package. There are no matching recipe mentions across 114 manifest-listed recipes or their 1,123 ingredient rows.

## Evidence

- Jowar flour: [FSSAI Chapter 2.4, section 2.4.18](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), [Puremill Canada](https://www.puremill.ca/products/puremill-jowar-flour), and [OQLF sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho).
- Chiwda/chivda: [CSIR-CFTRI cereal-flakes entry](https://www.csir.res.in/sites/default/files/2023-06/Compendium-of-Social-relevant-technologies-2.6.2021.pdf), [Club House Canada Poha Chivda](https://www.clubhouse.ca/fr-ca/recettes/collations/poha-chivda), and current [Loblaws French-Canadian cornflake chiwda listings](https://www.loblaws.ca/fr/search?search-bar=cornflakes+chivda).
- Langoustine/scampi: [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=f&q=Langoustine), [OQLF langoustine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198632/langoustine), and [Aliments Pearlmark](https://www.pearlmarkfoods.com/fr/nos-produits/langoustines).

Full source limits and term-by-term reasoning are in the [jowar proposal](../../proposals/wp02-a6-jowar-sorghum-flour-terminology-review-20261012.md), [chiwda/chivda proposal](../../proposals/wp03-section-f-chiwda-chivda-alias-boundary-review-20261012.md), and [langoustine proposal](../../proposals/wp04-section-p-langoustine-identity-boundary-review-20261012.md).

## Final package snapshot

Hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Final count/state | SHA-256 or digest |
| --- | ---: | --- |
| Ingredient references | 1,222; 108 GRAIN_AND_CEREAL | a912956b021d756b7e394e0a7f2e8daf6080f10ec07472aade584aaabe5b3b9e |
| Ingredient forms | 86 | 24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978 |
| Legacy import candidates | 66 | bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f |
| Research ledger | 1,522 records; 5,174 source entries; 4,237 distinct source IDs; 8 unit conversions | 7284dd1c15b93f24ab68f14d44a36d6aefed5f8e01ef50a7b73313f01d529adc |
| Seed manifest | 114 recipes | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 bytes | dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622 |
| Generated BundledIngredientCatalog.kt | 1,222 references | f944a0bd729531ff5fb68d33c4dbf528edbbad7e5ce53740b5a0c3368cb2a460 |

## Static verification

- Bundled seed package validation passed.
- Generated catalog freshness check passed at 1,222 references.
- Research-ledger schema validation passed with 1,522 records and zero errors.
- Normalized exact-key ownership passed: jowar flour has only the sorghum-flour alias owner; langoustine, langoustines, and scampi have only the new langoustine owner; chiwda/chivda remain unallocated.
- Full recipe audit found zero candidate-term hits; manifest and recipe corpus hashes are unchanged.
- UTF-8/no-BOM and scoped whitespace checks passed.
- No tests or emulator checks were run. The implementation changes only database JSON data and its generated catalog, so the current AGENTS.md rule waives testing.

The broader WP02 A6 flour sweep, Section F cereal review, and Section P seafood coverage remain open.

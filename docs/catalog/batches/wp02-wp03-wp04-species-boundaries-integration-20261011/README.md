# WP02, WP03, and WP04 identity-boundary integration — 2026-10-11

## Integrated decisions

- Added `black fonio flour / farine de fonio noir` as an identity-only `FLOUR_AND_STARCH` reference for flour made from *Digitaria iburua*. It is separate from black-fonio grain and the existing white-fonio flour identity. It has no aliases, forms, recipe links, measurements, conversions, yields, or substitutions. The French display is a transparent construction from the standardized Canadian species name; independent Québec product-wording review remains open. The reviewed 114-recipe corpus had no matching row.
- Added `crushed pineapple / ananas broyé` as a form under the existing pineapple reference and linked recipe 053#14. The line remains `1 cup crushed pineapple, drained`; its quantity and bilingual preparation are unchanged. The form does not encode canned status, packing liquid, drained mass, density, or a conversion.
- Recorded `candidate-wp04-salmon-species-scope` and `candidate-wp04-tuna-species-scope` as unresolved. Canadian labeling lists and Québec terminology distinguish multiple species, but recipe 077#10 says only `salmon fillets without skin` and recipe 111#1 says only `1 tuna steak`. The broad active references and recipe links remain unchanged; the source-specific Anova tuna observation remains on the generic tuna record.

## Evidence

- The 2025 *Journal of Cereal Science* paper names whole-grain flour from *Digitaria iburua* ([publisher record](https://www.sciencedirect.com/science/article/pii/S0733521025001493)); the 2010 *Food Microbiology* paper treats Acha and Iburu flours separately ([PubMed record](https://pubmed.ncbi.nlm.nih.gov/20832683/)). TERMIUM Plus supports Canadian English `black fonio` and French `fonio noir` as the species names; it does not establish a Québec flour label.
- OQLF records `ananas` / `pineapple` and *Ananas comosus* ([GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297104/ananas)). Dole Canada names `Crushed Pineapple in Juice` / `Ananas broyé dans du jus` on its [English](https://dolefoodservice.ca/products/crushed-pineapple-in-juice/) and [French](https://dolefoodservice.ca/fr/products/crushed-pineapple-in-juice/) product pages. CFIA lists pineapple by cut style, including crushed, and separately distinguishes packing media in its [food-product summary](https://inspection.canada.ca/en/food-labels/labelling/food-product-innovation/changes). These product pages support the form wording, not a claim about the recipe’s package state or drained amount.
- CFIA explains that the Fish List provides bilingual common names tied to species for Canadian labeling ([common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names)); OQLF entries define species-specific terms including [saumon coho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198950/saumon-coho), [saumon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198946/saumon-rouge), and [thon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge). These sources do not identify the taxa in the two recipes.

## WP04 cockle/coque boundary

The unqualified `cockle / coque` request remains an unresolved candidate, separate from the generic clam hold. OQLF’s food-mollusc entry pairs `coque / cockle` with *Clinocardium ciliatum*. CFIA assigns French `Coque` to both *C. ciliatum* (English `Hairy Cockle`) and *C. nuttallii* (English `Cockle`). A DFO Gulf survey distinguishes family-level unspecified cockles from *C. ciliatum* / `Iceland cockle` / `Coque d’Islande`. Current Clearwater and Montréal supplier pages use unqualified `coques` or `palourdes coques` without a binomial. The recipe corpus has no cockle/coque rows. The ledger records the hold only; no active reference or recipe link was added.

Sources: [OQLF, coque](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198883/coque), [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), [DFO Gulf mollusc survey](https://waves-vagues.dfo-mpo.gc.ca/Library/340859.pdf), [Clearwater Coques](https://www.clearwater.ca/fr/seafood-industry/clams/coques/), and [ProFishionals Palourdes](https://www.profishionals.ca/fr/clams).

## Validation

- Seed package: 1,024 references, 70 forms, 114 recipes, and 1,123 ingredient rows.
- Research ledger: 1,311 records, 4,246 source entries, 3,484 distinct source IDs, and 8 unit conversions.
- Full seed-package validation, reference normalization check, ledger schema validation, and generated-catalog freshness check passed. Relevant database JSON contains no BOM, mojibake, or raw non-ASCII bytes; French text is stored as explicit Unicode escapes.
- No tests or emulator run were performed because the change adds catalog data to database JSON, as directed by `AGENTS.md`.

## Artifact hashes

- `ingredient-references.v1.json`: `518d35b5e01a9d731b39f0c008ff69d4afd6c2f20bc1c3b3cbeb7ba027eeed1c`
- `ingredient-forms.v1.json`: `dacdc08a7735bb4426a444a6295cb11f7d92809a3153b76659250410a31d16ed`
- recipe 053: `a1ae39fd795942a3e5cce185fe1f5369c2c3ff78713f1a3bc3f0464e4fa39f31`
- `research-ledger.v1.json`: `a9437741c1f416e0c8f885092b49e2ff9d6117bf06671323549cb834f7147f9a`
- generated `BundledIngredientCatalog.kt`: `b8806a08736d5869a9cdeb4b190e808eb664196efb738bdc01ca55a1c887f91e`

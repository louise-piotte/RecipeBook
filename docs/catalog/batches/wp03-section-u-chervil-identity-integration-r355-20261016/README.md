# WP03 Section U R355 — chervil identity and fresh form integration

## Integrated data

Added one `HERB` reference, `ingredient-ref-chervil`, for culinary leaves of *Anthriscus cerefolium* (L.) Hoffm.:

- French display: `cerfeuil`
- English display: `chervil`
- Aliases: none
- Density and unit mappings: none

Added `ingredient-form-chervil-fresh` with labels `cerfeuil frais` / `fresh chervil`, `formCode` / `prepState` `fresh`, and no match-term aliases or density. The Québec retailer’s 10 g package supports the fresh product wording, not a reusable recipe measure.

Kept *Anthriscus sylvestris* (wild chervil / cerfeuil des bois), bulbous-rooted chervil (*Chaerophyllum bulbosum*), parsley, and herb mixtures separate. No measures, conversions, recipe links, yields, or substitutions were added; measurement and substitution research remain `not_yet_researched`.

## Evidence and limits

- The [OQLF GDT entry for cerfeuil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095314/cerfeuil) pairs French `cerfeuil` with English `chervil` and the botanical name *Anthriscus cerefolium* Hoffmann. It is terminology and identity evidence, not current market evidence.
- [Kew Plants of the World Online](https://powo.science.kew.org/taxon/837913-1) accepts *Anthriscus cerefolium* (L.) Hoffm. as the current name.
- Metro’s [fresh chervil listing](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/fines-herbes-fraiches/cerfeuil-frais/p/059749955799) uses `Cerfeuil frais` for a 10 g fresh-herb package. The package size is not a general recipe measure or an availability guarantee.
- Metro’s Québec-facing [cerfeuil page](https://www.metro.ca/produits-a-decouvrir/fruits-et-legumes/nos-fruits-legumes-et-fines-herbes/cerfeuil) describes the leaves and fresh use. It says chervil can replace parsley in some recipes; this contextual statement does not make the ingredients identical and no substitution rule was added.
- The [Herbier du Québec entry for anthrisque des bois](https://herbierduquebec.gouv.qc.ca/produit/anthrisque-des-bois/) assigns `cerfeuil des bois`, `wild chervil`, and `cow parsley` to *Anthriscus sylvestris*, a separate species.
- Kew’s [*Chaerophyllum* general information](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:30028190-2/general-information) describes bulbous-rooted chervil (*C. bulbosum*) as a root vegetable, outside the leafy *Anthriscus cerefolium* identity.

## Picker projection and recipe demand

| Query | Result after R355 |
|---|---|
| `cerfeuil`, `chervil` | `ingredient-ref-chervil` |
| `cerfeuil frais`, `fresh chervil` | `ingredient-ref-chervil` with the fresh-form hint |
| `cerfeuil des bois`, `wild chervil` | No result from the new row |
| `parsley` | Existing parsley rows only; chervil is excluded |
| `fines herbes` | No result from the new row |

The bundle contains 114 manifest-listed recipes and 1,123 ingredient rows. No chervil, cerfeuil, or botanical-name ingredient line matched. No recipe link or amount was added.

## Validation

- Bundled seed-package normalization and validation passed; the package now contains 1,692 references and 135 forms.
- The generated `BundledIngredientCatalog.kt` index is current at 1,692 references; ingredient-reference normalization is current.
- Research ledger schema and source-reference validation passed; the ledger now has 2,044 records with zero validation errors.
- Static picker projection, recipe-corpus scan, UTF-8/no-BOM, local-link, and whitespace checks passed.
- No software tests, build, emulator check, or deployment was run because this change only adds database JSON data under the updated `AGENTS.md` rule.

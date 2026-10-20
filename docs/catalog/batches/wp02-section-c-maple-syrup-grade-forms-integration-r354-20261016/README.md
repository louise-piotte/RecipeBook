# WP02 Section C R354 — maple-syrup colour-class forms

## Integrated data

Added four forms under the existing `ingredient-ref-maple-syrup` (`maple syrup / sirop d’érable`) reference:

| English class label | Québec French class label | Whole-product search terms |
|---|---|---|
| `Golden, Delicate Taste` | `Doré, goût délicat` | `golden maple syrup`; `sirop d’érable doré`; full class phrase |
| `Amber, Rich Taste` | `Ambré, goût riche` | `amber maple syrup`; `sirop d’érable ambré`; full class phrase |
| `Dark, Robust Taste` | `Foncé, goût robuste` | `dark maple syrup`; `sirop d’érable foncé`; full class phrase |
| `Very Dark, Strong Taste` | `Très foncé, goût prononcé` | `very dark maple syrup`; `sirop d’érable très foncé`; full class phrase |

The English and French class labels match the Canada Grade A class names. Match terms stay on the form records; the parent aliases remain empty. The existing golden syrup and dark corn syrup identities stay separate.

## Evidence and limits

- The CFIA’s [Canadian Grade Compendium: Volume 7 — Maple Syrup](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-7) defines Canada Grade A and Canada Processing Grade and lists the four bilingual colour classes. The table classifies syrup by light transmission; it does not provide grade-specific kitchen measures or density.
- [Érable du Québec’s classification page](https://erableduquebec.ca/produits/classes-de-sirop/) uses the exact French class labels and offers class-specific culinary guidance. This is flavour and use guidance, not a replacement ratio.
- [Maple from Canada](https://www.maplefromcanada.com/about/maple-classification/) uses the four English class names and consumer use descriptions.
- A [Québec producer listing](https://www.erablierejt.ca/produit/sirop-derable-gallon/) offers selectable Doré goût délicat and Ambré goût riche options. Its package details do not establish generic measures.
- One [Érable du Québec recipe](https://erableduquebec.ca/recettes/lait-a-lerable/) prefers very-dark syrup for a stronger flavour. That preference remains recipe-specific; it does not support a general grade-to-grade or cross-sweetener substitution.

## Picker projection and recipe demand

| Query | Result after R354 |
|---|---|
| `golden maple syrup`, `sirop d’érable doré` | `ingredient-ref-maple-syrup` with the Golden form hint |
| `amber maple syrup`, `sirop d’érable ambré` | `ingredient-ref-maple-syrup` with the Amber form hint |
| `dark maple syrup`, `sirop d’érable foncé` | `ingredient-ref-maple-syrup` with the Dark form hint |
| `very dark maple syrup`, `sirop d’érable très foncé` | `ingredient-ref-maple-syrup` with the Very Dark form hint |
| `golden syrup`, `sirop doré` | Existing golden-syrup reference only; full-product phrases remain distinct |
| `golden`, `doré` | Broad results include maple-syrup colour forms and unrelated existing rows; single-word queries do not produce a form hint |
| `Grade A maple syrup`, `Grade B maple syrup` | No result from these forms; no generic grade form or historical grade alias was added |

The corpus has three generic maple-syrup ingredient lines (recipes 001, 025, and 085), plus one optional sweetener note in recipe 065. None names a colour class. All generic links and amounts remain unchanged; no grade-specific recipe link or quantity was added.

## Validation

- Bundled seed-package normalization and validation passed; the package now contains 1,693 references and 139 forms.
- The generated `BundledIngredientCatalog.kt` index is current at 1,693 references; ingredient-reference normalization is current.
- Research-ledger schema and source-reference validation passed; the ledger now has 2,049 records with zero validation errors.
- Static picker projection, recipe-corpus scan, UTF-8/no-BOM, local-link, and whitespace checks passed.
- No software tests, build, emulator check, or deployment was run because this change only adds database JSON data under the updated `AGENTS.md` rule.

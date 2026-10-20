# WP04 Section P — yellow-croaker picker hold (R371, 2026-10-16)

## Integration record

- **Status:** Integrated as a documentation-only hold on 2026-10-16; see the [proposal](../../proposals/wp04-section-p-next-gap-review-r371-20261016.md).
- **Disposition:** Keep yellow croaker / *Larimichthys polyactis* outside active references, forms, legacy identities, and the research ledger.
- **Scope:** No database, recipe, picker, or substitution data changed.

## Evidence and decision

CFIA's Fish List names *Larimichthys polyactis* as `Yellow Croaker` and separately shows `Croaker / Courbine Jaune` for the same TSN. CFIA also assigns bare `Croaker` and `Courbine` to other fish taxa. The exact qualified terms have current Canadian and Québec retail uses, including a frozen PriceSmart listing and Uniking's French product catalogue, but those product pages do not establish a taxonomic crosswalk. The OQLF search did not find an exact `courbine jaune` entry; its `grand tambour` page notes that bare `courbine` was not retained for *Pogonias cromis* fish-product terminology, which is a limited caution rather than a ruling on yellow croaker.

The current picker would make bare `croaker` and `courbine` queries return the single hypothetical yellow-croaker row. The bundled recipe corpus contains no yellow-croaker demand. Keep the candidate unassigned until the picker can preserve the broader generic terms or recipe evidence defines a specific product.

## Picker, recipe, and numeric impact

- No reference, form, alias, candidate, ledger record, or recipe link was added.
- The manifest-ordered scan found no yellow-croaker, `courbine jaune`, or *Larimichthys polyactis* ingredient rows.
- Retail pack sizes and product descriptions do not establish a reusable measure, yield, density, conversion, or substitution.
- No cooking, curing, storage, or raw-consumption equivalence is inferred.

## Sources

- CFIA, [Fish List lookup for Yellow Croaker](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=yellow%20croaker) and [Croaker](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=croaker).
- PriceSmart Foods, [Frozen Fish](https://www.pricesmartfoods.com/categories/frozen-seafood/frozen-fish-id-30844), listing “Frozen - Yellow Croaker (150–250g), 800 Gram.”
- Walmart Canada, [Searay Yellow Croaker](https://www.walmart.ca/en/ip/Searay-Yellow-Croaker/6000198769828), listed as frozen and out of stock when reviewed.
- Uniking Enterprises, [French product catalogue](https://www.uniking.ca/fr/products), including `Filets de courbine jaune`, `Poisson courbine jaune entier`, and salted listings.
- OQLF, [GDT: grand tambour](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199003/grand-tambour), reused only as limited context for bare `courbine`.

## Validation

- Confirmed the candidate terms and ID were absent from active references, forms, legacy identities, the ledger, and the bundled recipe rows.
- Checked the projected search behavior against the existing `IngredientSearch.kt` phrase-matching logic and current names/forms.
- No software tests, Gradle tasks, emulator checks, or deployment were run because this hold adds no database JSON data or code.

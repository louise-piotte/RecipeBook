# WP05 monosodium glutamate identity integration

## Decision

Added identity-only `monosodium glutamate / glutamate monosodique`, with English alias `MSG` and
French aliases `GMS` and `glutamate de sodium`. Health Canada uses the bilingual name and abbreviations;
OQLF supports the French synonym. CFIA lists monosodium glutamate as a component that must be declared
in applicable preparations and mixtures, supporting the boundary between the ingredient and seasoning
or flavour-enhancer blends.

Kept broader glutamate, glutamic acid, other glutamate salts, soy sauce, yeast extracts, tomatoes,
cheeses, bouillon, seasoning mixtures, and branded flavour enhancers separate. A scan of the 114
bundled recipes found no direct matching phrase or ingredient line. Added no form, density, unit
mapping, recipe link, conversion, yield, or substitution.

Sources: [MSG identity review](../../proposals/wp05-msg-monosodium-glutamate-identity-review-20261011.md),
[Health Canada EN](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/food-additives/monosodium-glutamate-questions-answers.html),
[Health Canada FR](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/additifs-alimentaires/foire-questions-glutamate-monosodique.html),
[OQLF terminology](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17561263/glutamate-monosodique),
[CFIA ingredient declarations](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens).

## Files and verification

Updated the reference JSON, generated Kotlin search index, research ledger, global plan, and roadmap. The
package has 1,033 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,325
records / 4,330 source entries / 3,563 distinct source IDs.

Package normalization and validation, reference normalization, generated-index freshness, research-ledger
schema validation, exact alias collision and recipe-demand checks, UTF-8/no-BOM, whitespace, and scoped
`git diff --check` passed. No tests or emulator were needed for the database JSON addition.

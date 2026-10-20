# WP02 Section D peanut-butter chips identity integration — R298 — 2026-10-16

## Decision

Promoted the legacy candidate ID ingredient-ref-peanut-butter-chips as identity-only peanut butter chips / brisures au beurre d’arachides in CHOCOLATE_AND_CANDY. Added only the French alias brisures de beurre d’arachides. This is a shaped peanut-butter-flavoured baking inclusion, not chocolate, peanut spread, whole peanuts, or candy-shell Mini REESE'S PIECES. The catalog’s pure-chocolate-chip normalization rule does not apply.

No bundled recipe names the product, so no recipe link was added. Removed the promoted row from the legacy candidate list. The existing peanut-butter spread gained the OQLF-preferred plural alias beurre d’arachides while retaining its accepted singular display; the OQLF source was already recorded on that spread’s ledger record.

## Scoped evidence

The ledger records the current 270 g manufacturer package and two manufacturer-recipe paired portions of 1 3/4 cup/tasse = 300 g as source-specific observations. These do not become default measures, a density, a cup conversion, or a package-yield mapping. The fondue and muffin recipes give volume-only quantities; those amounts remain in source notes because the ledger has no volume-only portion relationship. The muffin page’s indexed variation mentions replacing the chips with pure semisweet chips but needs direct rechecking. The English cookie ingredient-line OR conflicts with its directions. The ledger records the substitution research as no supported active rule.

## Data changes

- app/src/main/assets/seed/bundled-library/ingredient-references.v1.json: promoted the peanut-butter-chips ID and added the plural French alias on the existing spread.
- docs/catalog/research-ledger.v1.json: converted the candidate record to an identity reference, registered eight new sources, recorded three source-specific observations and a no-rule substitution finding, and documented the alias addition on peanut butter.
- docs/catalog/legacy-import-identities.v1.json: removed the promoted candidate and updated the candidate count.
- app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt: regenerated the picker index from canonical seed JSON.
- docs/RecipeBook-global-ingredient-catalog-plan.txt and roadmap.md: recorded R298; broader Section D and Section I coverage remain open.

## Verification

Static seed-package normalization/validation, reference normalization, generated-index freshness, ledger schema and source ownership, legacy-candidate count, exact picker projection, 114-recipe/1,123-row corpus scan, UTF-8/no-BOM and escaped seed Unicode, local links, and scoped whitespace checks passed. Final totals: 1,667 references, 127 forms, 2,016 ledger records, 8,907 source entries, 7,544 distinct source IDs, and 6,305 distinct source URLs.

No software tests, builds, or emulator checks were run because this change updates bundled database JSON and the legacy candidate JSON plus catalog documentation, as directed by AGENTS.md.

## References

- [R298 proposal](../../proposals/wp02-section-d-peanut-butter-chips-identity-review-r298-20261016.md)
- [Hershey Canada: French CHIPITS catalog](https://www.hersheyland.ca/fr_ca/chipits)
- [Hershey Canada: S’mores cookies](https://www.hersheyland.ca/fr_ca/Recettes/biscuits-smores-moelleux-au-beurre-d-arachides.html)
- [Hershey Canada: Signature Fondue](https://www.hersheyland.ca/fr_ca/recettes/fondue-signature-hersheys-chipits.html)
- [Hershey Canada: Peanut Butter Chocolate Chip Cookies](https://www.hersheyland.ca/en_ca/recipes/peanut-butter-chocolate-chip-cookies-recipe.html)
- [Hershey Canada: Mini REESE’S PIECES baking inclusions](https://www.hersheyland.ca/fr_ca/produits/morceaux-de-friandises-au-beurre-darachides-hersheys-chipits-mini-reeses-pieces-pour-cuisson-sac-de-270-g.html)
- [OQLF GDT: beurre d’arachides](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360854/beurre-darachides)

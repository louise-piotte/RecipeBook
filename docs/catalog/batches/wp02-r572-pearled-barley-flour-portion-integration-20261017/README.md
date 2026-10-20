# WP02 Section A R572 — pearled-barley flour portion integration

Date: 2026-10-17

## Decision

Recorded GoBarley's published 1/4-cup (37 g) Table 1 entry as a pearled-grain-specific portion on the existing generic `ingredient-ref-barley-flour` ledger record. The table is adapted from USDA and footnotes the flour as made from pearled barley, but does not provide an exact USDA food entry, cup standard, filling method, or direct weighing procedure. The observation remains source-specific; it is not scaled to a cup, averaged with the historical USDA portion, or used to derive density.

Added the SLO Foods and bilingual Mayrand listings as evidence for the product boundary and current Québec wording. Reused GoBarley's existing R281 source ID on the generic record rather than minting a duplicate source ID or URL. The accepted identity decision keeps pearled-grain flour under `barley flour / farine d'orge`; no stable, separate Québec-facing product class was found.

The generic identity, `jau atta` alias, null default density, empty unit mappings, existing historical USDA portion, and laboratory density observation remain unchanged. No form, package yield, recipe link, conversion, or substitution rule was added. The whole-barley-flour record remains separate, and its substitution finding is unchanged.

## Sources

- [GoBarley, Health and Nutrition](https://gobarley.com/health-nutrition/), Table 1 and footnote 3: 1/4 cup (37 g), identified as flour made from pearled barley; the table is adapted from USDA.
- [SLO Foods / Buying Club BC, Barley Flour, Organic](https://buyingclubbc.com/product/barley-flour-5-kg-organic/): unqualified product title and description that it is stone-ground from pearled barley.
- [Mayrand, Barley Flour 10 kg](https://mayrand.ca/en/our-products/grocery/flour-semolina-and-breadcrumb/speciality-flour/farine-dorge-millbrooke-10474) and [Farine d'orge 10 kg](https://mayrand.ca/fr/nos-produits/epicerie/farine-semoule-et-chapelure/farine-de-specialite/farine-dorge-millbrooke-10474/): paired Québec retailer wording for the same Millbrooke SKU.
- Existing [OQLF farine d'orge entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge): preferred Québec term for the general identity.

## Files updated

- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R572 proposal and this integration README

## Verification

- Static seed-package validation and normalization checks passed.
- Research-ledger schema and source-reference validation passed; targeted checks confirmed the new observation, source ownership, and unchanged active reference/form data.
- UTF-8/no-BOM, local-link, final-newline, and scoped whitespace checks passed.
- No software tests, app build, emulator run, or deployment were run for this database-JSON-only update under `AGENTS.md`.

WP02 Section A remains open. See the [R572 proposal](../../proposals/wp02-next-gap-review-r572-20261017.md).

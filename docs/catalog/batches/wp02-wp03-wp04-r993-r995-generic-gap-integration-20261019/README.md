# R993–R995 generic ingredient gap integration

- **Integrated:** 2026-10-19.
- **Scope:** Three generic culinary identities across grain milling, produce, and seafood. The all-category rule in `AGENTS.md` was applied: brand, product-line, flavour, SKU, and retailer-variant rosters were not researched or expanded.
- **Data change:** Added three ingredient references and three ledger records. Forms and recipe links are unchanged. Added nine new source IDs, one source-scoped measurement observation, and one blocked substitution finding. Reused existing TERMIUM, La Milanaise, spelt-terminology, and R65 OQLF source identities only for their stated scopes.

## Decisions

- **R993 — Einkorn bran / son de petit épeautre:** Added an identity-only `GRAIN_AND_CEREAL` reference for the bran fraction of cultivated *Triticum monococcum*. Kept it distinct from wheat and spelt bran, einkorn flour and berries, and the unresolved wholegrain einkorn semolina candidate. The French compound remains provisional for Québec. Recorded the primary study's wheat-bread trial as `blocked_pending_evidence`; genotypes, laboratory milling, replacement level, flour, process, and outcomes remain study-specific. No reusable measure, alias, form, or active substitution was added. The named Anson Mills wheat-meal line remains out of scope because commercial-product counts do not add ingredient diversity.
- **R994 — Swiss chard stems / côtes de bette à carde:** Added a distinct `VEGETABLE_AND_AROMATIC` plant-part identity, not a form under whole Swiss chard. Preserved all whole-chard aliases. Kept UMass's `1 lb` fresh whole-chard to `2½ cups` separated stems as a ledger-only `edible_portion_yield` observation; the measured cut and cup-packing basis are unspecified. Added no density, mapping, reusable conversion, or substitution.
- **R995 — Fish cheeks / joues de poisson:** Added an identity-only `PROTEIN` fish-part reference with singular inflection aliases. Kept the Québec French display descriptive rather than claiming that OQLF standardized the compound. Preserved the Atlantic cod- and Atlantic halibut-cheek holds and all species-specific entries. No measurement, form, recipe link, conversion, yield, or substitution was added.

## Scope and preservation

The open-plan scan found no additional roster-only task. No existing reference was deleted, merged, or relabelled. Manufacturer evidence on einkorn bran supports only the French ingredient wording; its package and product details remain product-scoped. The einkorn study formula, Swiss-chard stem amount, and fish-cheek recipe quantities remain scoped to their respective sources. Existing branded entries and their evidence remain intact.

The proposal and source audits are recorded in [R993](../../proposals/wp02-a7-generic-gap-review-r993-20261019.md), [R994](../../proposals/wp03-section-k-generic-gap-review-r994-20261019.md), and [R995](../../proposals/wp04-section-p-generic-gap-review-r995-20261019.md).

## Static validation

- Ingredient reference count: **2,010**; form count: **205**; research-ledger record count: **2,416**.
- All three references have distinct IDs, valid category values, no density or unit mappings, and no forms or recipe links.
- The new ledger records pass the ledger JSON Schema. New source IDs, observation/finding source references, reused source identities, and candidate IDs were checked.
- The bundled seed package validates; the generated Kotlin ingredient index is current at 2,010 references.
- The recipe corpus remains 114 files / 1,123 ingredient rows; none of the three identities is linked to a recipe.
- JSON remains UTF-8 without BOM with French accents represented as Unicode escapes; proposal and batch documentation are UTF-8 without BOM. Scoped whitespace and local-link checks pass.
- No software tests, build, emulator check, or deployment were run. This batch only adds database JSON data and catalog documentation under the project rule in `AGENTS.md`.

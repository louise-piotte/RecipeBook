# R996–R998 generic ingredient gap integration

## Integrated identities

- **R996 — Emmer bran / son d’amidonnier:** Added identity-only `ingredient-ref-emmer-bran` in `GRAIN_AND_CEREAL` for the bran fraction of emmer (*Triticum turgidum* subsp. *dicoccum*). It remains separate from emmer grain, flour and semolina, wheat/spelt bran, and einkorn bran; the French compound is descriptive and provisional for Québec. The 2025 bread trial, its three genotypes, laboratory milling, 20% flour replacement, and formula-specific water adjustment remain source-scoped. No measure or active substitution was added. Further product-only research on the named Anson Mills wheat meal remains out of scope because commercial-product counts do not add ingredient diversity.
- **R997 — Roselle leaves / feuilles d’oseille de Guinée:** Added identity-only `ingredient-ref-roselle-leaves` in `VEGETABLE_AND_AROMATIC` for leaves of *Hibiscus sabdariffa* L. Kept the French wording descriptive and aliases leaf-qualified. Preserved the existing dried roselle calyx and common-sorrel identities. FAO, NParks, and IRD leaf-use statements remain within their cited contexts; no forms, measures, recipes, conversions, yields, or substitutions were added.
- **R998 — Fish collars / colliers de poisson:** Added identity-only `ingredient-ref-fish-collars` in `PROTEIN`, with only the reviewed singular French alias. Preserved the R526 salmon-collar/kama hold and the separate fish-head, cheek, bone, frame, trimming, skin, stock, and species identities. Recipe-specific counts, masses, temperatures, and preparation methods remain scoped to their sources; no reusable measurement, form, recipe link, conversion, yield, or active substitution was added.

## Scope and preservation

The all-category queue scan found no open checklist task whose sole deliverable was another commercial-product roster. The existing Section F cereal rosters and named Anson Mills lead remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded references were preserved; no entry was deleted, merged, or relabelled. Manufacturer and commercial publisher pages were used only where their evidence supported generic ingredient identity or source-scoped recipe context. Product-specific claims and measurements were not generalized.

## Static validation

- Added 3 generic ingredient references and 3 research-ledger records; there are no new ingredient forms or recipe links. Counts are now 2,013 references, 205 forms, and 2,419 ledger records.
- Added 9 new source IDs and reused existing terminology source IDs only for their narrow naming boundaries.
- Reference normalization, bundled-package validation and ledger-schema checks passed. The generated Kotlin index is current at 2,013 references. New reference/source ownership checks, UTF-8/no-BOM checks, recipe demand scan (114 recipes / 1,123 rows; zero new-name or ID hits), local links, and scoped whitespace checks passed.
- No software tests, builds, emulator checks, or deployment were run. These changes add database JSON and catalog documentation only, per `AGENTS.md`.

Proposal files: [R996](../../proposals/wp02-a7-generic-gap-review-r996-20261019.md), [R997](../../proposals/wp03-section-k-generic-gap-review-r997-20261019.md), and [R998](../../proposals/wp04-section-p-generic-gap-review-r998-20261019.md).

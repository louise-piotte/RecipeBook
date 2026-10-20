# WP04 Section P R658 integration — Yellowfin Sole identity

Integrated on 2026-10-18 after root review of the [R658 proposal](../../proposals/wp04-section-p-next-regional-fish-gap-review-r658-20261018.md).

## Decision

Added identity-only `yellowfin sole / sole à nageoires jaunes` for *Limanda aspera* as `ingredient-ref-yellowfin-sole`, category `PROTEIN`, with no aliases. CFIA's Fish List pairs TSN 172907 and *L. aspera* with “Yellowfin Sole.” Pearlmark's current English and French routes print the same binomial and matching product codes beside “Yellowfin Sole” / “Sole à nageoires jaunes.” This supports the supplier's paired bilingual identity, not OQLF normalization or current retail stock.

OQLF's `limande à queue jaune` is for *Limanda ferruginea* / yellowtail flounder, not *L. aspera*. That term and the broader CFIA `sole`, `flounder`, and `plie` wording remain out of aliases. The current picker keeps the species-neutral sole market group alongside the qualified species, and the bundle contains no candidate-specific recipe phrase.

Added one verified identity ledger record with four sources and one accepted decision. No forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions were added.

## Sources

- [CFIA Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSN 172907 rows: *L. aspera* / Yellowfin Sole; broader Sole and Flounder / Plie rows are also listed for multiple taxa.
- [Pearlmark Foods — Yellowfin Sole](https://www.pearlmarkfoods.com/our-products/yellowfin-sole): English display, binomial, product codes 00267, 00076, 00077, 00078, and Québec service-region listing.
- [Aliments Pearlmark — Sole à nageoires jaunes](https://www.pearlmarkfoods.com/fr/nos-produits/sole-a-nageoires-jaunes): matching French display, binomial, product codes, and Québec service-region listing.
- [OQLF GDT — limande à queue jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198645/limande-a-queue-jaune): preferred name for *L. ferruginea* and note that broad `sole` usage can confuse fish identities.

## Validation

Static package validation and normalizer checks passed; the generated index is current at 1,835 references. `validate_research_ledger()` passed with 2,208 records and zero errors. All four new source IDs have one owner; the generic CFIA endpoint has 43 scoped owners, and the other three URLs each have one. The exact canonical phrases have single owners, all five maintained Markdown files passed UTF-8/no-BOM, link, newline, and trailing-whitespace checks, and scoped `git diff --check` passed. No software tests, app build, emulator run, or deployment were needed for this database-JSON-only change under `AGENTS.md`.

# WP04 Section P gilthead-bream identity — R630 — 2026-10-18

## Accepted changes

Added identity-only `ingredient-ref-gilthead-bream` for *Sparus aurata*: English `gilthead bream`, French `dorade royale`, and the OQLF-attested English alias `gilthead sea bream`.

- The [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) row for TSN 647901 pairs *Sparus aurata* with `Gilthead Bream / Dorade Royale`.
- [OQLF's GDT entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199006/dorade-royale) identifies *S. aurata*, prefers Québec French `dorade royale`, and lists both English forms.
- The current Montréal [Poissonnerie La Mer listing](https://www.lamer.ca/products/dorade-royale-entiere) corroborates the local retail wording. It does not name a scientific species, so it supports market use and availability only.

The R604 `bream / brème` and `sea bream / dorade` multi-species groups remain separate. The new qualified species row appears beside them for broad searches. No bare `bream`, `brème`, `sea bream`, `dorade`, `porgy`, or scientific-name alias was added. No forms, recipe links, measures, density, mappings, package yields, conversions, or substitutions were added. No bundled recipe contains a matching term.

## Files

- Added the reference to `ingredient-references.v1.json` and the evidence record to `docs/catalog/research-ledger.v1.json`.
- Reused existing CFIA results, CFIA overview, and OQLF source IDs; added the new La Mer source under the R630 prefix.
- Updated the global catalog plan, roadmap, and workflow log.
- Review proposal: [`wp04-section-p-next-regional-fish-gap-review-r630-20261018.md`](../../proposals/wp04-section-p-next-regional-fish-gap-review-r630-20261018.md).

## Validation

The full seed package, generated reference index, and ledger schema/custom checks passed. Static ownership, picker projection, recipe corpus, and scoped UTF-8/link checks passed. No software tests were run because this change only adds database JSON data under `AGENTS.md`.

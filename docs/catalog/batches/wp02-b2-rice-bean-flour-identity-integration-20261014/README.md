# WP02 Section 04 B2 — rice-bean-flour identity integration

Reviewed and integrated 2026-10-14. The broader Section 04 B2/B3 flour and starch review remains
open.

## Decision

Added identity-only `rice bean flour / farine de haricot riz` for food flour made from *Vigna
umbellata*. The English spelling `ricebean flour` is the only alias. The French display is a
descriptive construction based on TERMIUM's whole-pulse name and remains provisional pending a
Québec flour-product label or terminology review.

Kept the flour separate from whole rice beans, rice flour, rice starch, bean protein isolate, and
composite rice-and-bean flours. The sources do not establish a standardized seed preparation or
commercial milling grade. No forms, density, unit mappings, measurements, recipe links, conversions,
yields, or active substitutions were added.

Recorded the 2026 pizza-base study's partial wheat-flour replacement result as one bounded research
finding. It concerns one tested formula and does not establish a reusable replacement ratio. The
bundle has no matching recipe demand.

## Integration and validation

- Added `ingredient-ref-rice-bean-flour` and one accepted research-ledger record with four source
  records and one formula-specific substitution finding.
- Updated the Section 04 checklist and roadmap, and refreshed the generated ingredient catalog.
- Current counts: 1,435 references, 105 forms, 1,775 ledger records, 63 legacy candidates, 114
  recipes, and 1,123 ingredient rows.
- Seed-package and reference normalization, ledger-schema validation, generated-index freshness,
  source ownership, picker projection, recipe scan, encoding, local links, and scoped whitespace
  checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the change only adds database
  JSON data and its generated catalog index.

See the detailed [review proposal](../../proposals/wp02-next-specialty-flour-starch-gap-review-r98-20261014.md).

## Sources

- The 2026 CFTRI [pizza-base study](https://onlinelibrary.wiley.com/doi/10.1002/cche.70069)
  explicitly uses rice bean flour in a *Vigna umbellata* formulation and reports tested partial
  replacement of whole wheat flour. The result stays formula-specific.
- The 2025 open-access [ricebean-flour methods study](https://iadns.onlinelibrary.wiley.com/doi/10.1002/fpf2.70024)
  describes flour made from cleaned green-variety seeds for laboratory extraction; its particle
  size and process do not define a universal commercial grade.
- The Philippine Intellectual Property Office's 2025 [ricebean-cookie utility model](https://onlineservices.ipophil.gov.ph/patgazette/IPASJournal/V28N2_UM_1st.pdf)
  names rice bean flour in a cookie composition, supporting food use but not a Québec product label.
- Government of Canada's [TERMIUM Plus record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=VIGNA+UMBELLATA)
  supports the bilingual names of the whole pulse only; it does not attest the flour compound.

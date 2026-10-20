# WP04 Section P R331 — sea-bass-family picker hold

Reviewed and integrated on 2026-10-16.

Kept *Lateolabrax japonicus* and *Diplectrum formosum* outside active references and the
research ledger. CFIA lists `Asian Seabass / Bar d'Asie` for the former and `Sand Seabass /
Serran De Sable` for the latter. Those accepted Canadian label pairs establish names for the
taxa, but do not resolve the Canadian retail products found in this review to either species.

The terminology boundary is material: OQLF assigns `Asian seabass` and `seabass` to
*Lates calcarifer* (barramundi). A Canadian supplier lists both Asian seabass and barramundi,
but provides no binomial for the seabass product. A Toronto menu calls `Suzuki` Japanese sea
bass, but also gives no species identification. The European Commission's `bar du Pacifique`
is a France-specific commercial designation and does not establish Québec French usage.
FAO supports *D. formosum* as Sand seabass / Serran de sable (alternate Sand perch), while
describing it as not commercially important in the region covered; no current Canadian or
Québec product source was found for that fish.

The current picker has 1,680 references and 129 forms. Its exact projection, using the two
CFIA display pairs as hypothetical rows without aliases or forms, is:

| Query | Current | Hypothetical pair | Reason |
|---|---:|---:|---|
| `sea bass` | 0 | 0 | Both English CFIA spellings use the single token `seabass`. |
| `seabass` | 0 | 2 | The two CFIA English display names match. |
| `bass` | 2 | 2 | Existing largemouth and smallmouth bass phrase matches remain. |
| `bar` | 38 | 1 | `Bar d'Asie` becomes an exact phrase and suppresses the existing substring fallback results; *D. formosum* has no supported `bar` name. |
| `bar d asie` | 0 | 1 | Species-qualified hypothetical match. |
| `serran de sable` | 0 | 1 | Species-qualified hypothetical match. |

The 114 manifest-listed recipe files contain 1,123 ingredient rows. A decoded-text scan
for both scientific names and the reviewed market names found no matching file or ingredient
row. No active identity, alias, form, measure, recipe link, conversion, yield, or substitution
was added. The existing R328 blackfin sea-bass hold and other Section P decisions remain
unchanged; the Section P parent stays open.

## Sources

- [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list)
  explains that the Fish List supplies Canadian-acceptable English and French fish names and
  scientific names/TSNs. The relevant [Asian Seabass search](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Asian%20Seabass)
  and [Sand Seabass search](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Sand%20Seabass)
  are the source rows for the paired names above.
- [OQLF GDT, barramundi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8349020/barramundi)
  identifies *Lates calcarifer*, prefers `barramundi` and `perche barramundi`, and lists `Asian
  seabass` and `seabass` as English terms for it.
- [European Commission, *Lateolabrax japonicus*](https://fish-commercial-names.ec.europa.eu/fish-names/species/lateolabrax-japonicus_en)
  lists `bar du Pacifique` for France; this is not Québec usage evidence.
- [FAO, Western Central Atlantic species guide](https://www.fao.org/4/y4161e/y4161e52.pdf)
  (entry on printed pp. 1338–1339) pairs *D. formosum* with `Sand seabass`, alternate `Sand
  perch`, and French `Serran de sable`, and notes its limited commercial importance in that
  region.
- [Uniking Enterprises Canada product list](https://www.uniking.ca/products) lists Asian
  Seabass and barramundi as separate products but gives no binomial for the seabass item.
- [Sushi Bar Maumi fresh-fish menu](https://www.sushibarmaumi.ca/today-s-fresh-fish) lists
  `Suzuki — Japanese sea bass`; it does not supply a binomial.

The source limits and the full term-by-term projection are retained in the
[R331 proposal](../../proposals/wp04-section-p-sea-bass-family-coverage-review-r331-20261016.md).
Static picker and corpus projections passed. No software tests were run because this was a
documentation-only decision and added no database JSON or application code.

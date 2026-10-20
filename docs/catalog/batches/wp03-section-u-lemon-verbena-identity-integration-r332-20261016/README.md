# WP03 Section U R332 — lemon-verbena identity

Reviewed and integrated on 2026-10-16.

Added one identity-only `HERB` reference for the culinary leaves of *Aloysia citrodora*:
`lemon verbena / verveine citronnelle`, with `verveine odorante` as a French alias because
OQLF records it as a term used in some contexts. Kew accepts *Aloysia citrodora* and records
*Lippia citrodora* as a synonym; OQLF's 1984 botanical entry uses the older spelling
*Lippia citriodora*. The English and French displays are supported by OQLF, and North Carolina
State Extension confirms that the leaves are used in tea and cooking.

No active reference, form, legacy candidate, or research-ledger record previously owned the
candidate. The manifest-listed bundle has 114 recipes and 1,123 ingredient rows, with no
matching lemon-verbena terms. No recipe link, form, density, unit mapping, reusable measure,
conversion, yield, or substitution was added. Measurement and substitution research remain
`not_yet_researched`.

The proposal's initial projection surfaced a bare-`citronnelle` singleton: the OQLF-supported
French display `verveine citronnelle` would match that query even though OQLF assigns bare
`citronnelle` to lemongrass. To preserve that Québec term allocation and avoid a misleading
singleton, integration also added the source-backed `citronnelle` French alias to the existing
lemongrass reference. The new lemon-verbena row itself does not have `citronnelle` as an explicit
alias. The picker projection mirrors the current phrase-first matching behavior:

| Query | Current | After R332 | Note |
|---|---|---|---|
| `lemon verbena` | none | lemon verbena only | Full English display. |
| `verveine citronnelle` | none | lemon verbena only | Full Québec French display. |
| `verveine odorante` | none | lemon verbena only | Source-backed contextual French alias. |
| `verveine` | lemongrass | lemongrass and lemon verbena | Both French displays contain this word; do not add it as an alias. |
| `citronnelle` | none | lemongrass and lemon verbena | Lemongrass owns the explicit OQLF-backed alias; the word also occurs in the French display for lemon verbena. |
| `Aloysia citrodora` / `Lippia citriodora` | none | none | Botanical names remain evidence, not picker aliases. |

The short-query ambiguity is kept visible as two results. Lemon balm, lemongrass, and lemon myrtle
remain separate identities. Lemon-verbena flowers,
prepared tisanes, extracts, essential oils, and fragrances are outside this identity.

## Sources

- [OQLF GDT, verveine citronnelle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8883204/verveine-citronnelle)
  gives preferred French `verveine citronnelle`, contextual `verveine odorante`, English
  `lemon verbena`, and Latin *Lippia citriodora*. Its old botanical note is not used as medical
  guidance or measurement evidence.
- [Kew Plants of the World Online, *Aloysia citrodora*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:1015994-1)
  accepts the species name and lists *Lippia citrodora* as a synonym. Kew's
  [*Lippia citrodora* entry](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:863572-1)
  confirms that synonym relationship.
- [North Carolina State Extension, Lemon Verbena](https://plants.ces.ncsu.edu/plants/aloysia-citriodora/common-name/lemon-verbena/)
  says the leaves are used in tea and cooking, including desserts, fruit salads, and jams. It
  supports culinary leaf identity but not a Québec retail name or kitchen measure.
- [OQLF GDT, citronnelle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408990/citronnelle)
  gives `citronnelle` as the preferred French term for *Cymbopogon citratus* and English
  `lemongrass`; this alias stays on the existing lemongrass identity so the short query returns
  both relevant rows.
- [WP03 R324 lemon-balm review](../../proposals/wp03-section-u-lemon-balm-identity-review-r324-20261016.md)
  had used the OQLF entry only to distinguish lemon balm from lemon verbena; it did not review
  or integrate this identity.

Static package, index, ledger, picker, corpus, encoding, and whitespace checks passed after
integration. Final totals are 1,681 references, 129 forms, and 2,029 ledger records. No software
tests were run because this change only updates database JSON data and its generated catalog
projection, with no application logic change.

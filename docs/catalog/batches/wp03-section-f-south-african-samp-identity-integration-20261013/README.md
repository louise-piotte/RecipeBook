# WP03 Section F South African samp identity — 2026-10-13

## Decision

Add identity-only `samp / samp` in `GRAIN_AND_CEREAL` for the named South African dry maize product.
The South African Department of Basic Education defines it as dried corn kernels pounded and
chopped until broken, but not ground as finely as mealie meal. South African grading rules list
samp separately from maize rice, maize grits, and maize flour. A Canadian retailer currently lists
Iwisa Samp, so the product name is relevant to the Canadian catalog.

The Québec French display `samp` is provisional: French-language reporting retains the product name,
but no Québec bilingual package or OQLF entry was found. Keep the descriptive gloss `maïs concassé`
out of aliases. Keep samp separate from cornmeal, ordinary and hominy grits, hominy corn, maize rice,
corn kernels, corn poha, arraw, Baddaz, and prepared `umngqusho` / samp-and-beans. Add no aliases,
forms, recipe links, density, unit mappings, conversion, yield, or substitution. The bundle contains
no samp recipe demand.

## Sources

- [South African Department of Basic Education — 2024 NSNP Food Specification Guidelines](https://www.education.gov.za/Portals/0/Documents/Publications/2024%20NSNP%20Food%20Specification%20Guidelines.pdf), §3.5.1: defines samp as dried maize kernels pounded and chopped until broken, but not as finely ground as mealie meal.
- [South African Government — Regulations for grading, packing and marking maize products](https://www.gov.za/sites/default/files/gcis_document/201601/39613pro3.pdf), regulation 3 and Annexure Table 1: treats samp, maize rice, maize grits, and maize flour as separate grades with separate granulation criteria.
- [South African Store — Iwisa Samp, 1 kg](https://southafricanstore.ca/products/iwiza-samp-1-kg): Canadian retail listing for the named product. The package size is SKU-specific and not a kitchen measure.
- [NWK Shop — Super White Samp, 10 kg](https://shop.nwk.co.za/products/super-white-samp-10kg): South African product listing describing coarsely stamped maize; its package size is product-specific.
- [Le Monde — “J’ai servi du baobab séché dans un dîner caritatif”](https://www.lemonde.fr/m-styles/article/2019/02/21/j-ai-servi-du-baobab-seche-dans-un-diner-caritatif_5426227_4497319.html): French-language caption retains `samp` and gives `maïs concassé` as a gloss, not a Québec terminology ruling.
- [OQLF — *semoule de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais): this existing term belongs to the cornmeal identity and covers multiple grinds; it does not specifically identify samp.

The source-by-source ownership, picker, recipe-demand, and numeric review is in the
[round 54 proposal](../../proposals/wp03-section-f-south-african-samp-boundary-hold-20261013-r54.md).

## Validation

- Added one active identity and one source-backed research-ledger record; aliases, forms, measurements, recipe links, and substitutions remain empty.
- Confirmed no exact prior active reference, form, legacy candidate, or ledger owner; `samp` now resolves only to the new identity.
- Confirmed zero matching recipe files and ingredient rows in the manifest-listed corpus.
- Package normalization, generated-index freshness, ledger validation, UTF-8/no-BOM, relative links, and scoped whitespace checks passed.
- No app tests or emulator checks were run because this change only adds database JSON data.

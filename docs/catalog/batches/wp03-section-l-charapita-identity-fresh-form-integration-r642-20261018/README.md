# WP03 Section L R642 — Charapita identity and fresh form

Integrated on 2026-10-18 after root review of the [R642 proposal](../../proposals/wp03-section-l-charapita-identity-review-r642-20261018.md).

## Catalog decision

- Added `ají charapita pepper / piment Charapita` as `ingredient-ref-aji-charapita-pepper` in `VEGETABLE_AND_AROMATIC`.
- Added only the PROMPERÚ English phrase `charapita chili` as an alias, plus one `fresh` form. French aliases and form match terms remain empty.
- Kept species, cultivar, fixed heat, and other product forms unresolved. PROMPERÚ and one INIA accession profile assign *Capsicum frutescens*, while other INIA Charapita accessions are listed as *C. chinense*.
- The French display `piment Charapita` is provisional, based on Semences Solana's Québec seed-product wording. No claim of Québec fresh-produce retail availability is made.
- The 114-recipe corpus has no matching demand. No measure, density, unit mapping, conversion, yield, recipe link, or substitution was added; measurement and substitution research remain open.

## Sources and validation

- [PROMPERÚ, Charapita chili profile](https://repositorio.promperu.gob.pe/bitstreams/b071160c-de48-44a7-a3cb-79828d98a184/download), printed p. 32, uses the exact English phrase and describes fresh, dried, and pickled presentations.
- [INIA, Catálogo de ajíes](https://repositorio.inia.gob.pe/bitstream/20.500.12955/88/3/Libreros-Catalogos_de_ajies.pdf) lists named *C. chinense* accessions; [INIA, Ajíes nativos peruanos](https://repositorio.inia.gob.pe/bitstreams/006b5660-0020-4134-a262-5062fb361f3f/download), pp. 120–121, lists Charapita Amarillo as *C. frutescens*.
- [Semences Solana](https://www.solanacom.com/piments.html) uses the local heading `Piment Charapita` for a seed listing.
- Static package normalization, generated-index freshness, ledger schema/source ownership, picker projection, and recipe-corpus checks passed. The final snapshot has 1,832 references, 161 forms, 2,203 ledger records, and 114 recipes / 1,123 ingredient rows.
- No software tests, build, emulator run, or deployment were needed for this database-JSON-only change under `AGENTS.md`.

Section L remains open.

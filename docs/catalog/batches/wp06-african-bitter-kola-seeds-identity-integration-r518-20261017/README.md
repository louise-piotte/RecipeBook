# WP06 African regional R518 integration — bitter kola seeds

- **Date:** 2026-10-17
- **Decision:** Add identity-only `bitter kola seeds / noix de bitter kola` for *Garcinia kola*, separate from the true kola species *Cola acuminata* and *C. nitida*.
- **Catalog ID:** `ingredient-ref-bitter-kola`
- **Category:** `NUT_SEED_AND_DRIED_FRUIT`
- **Aliases:** none. Keep `bitter cola`, `petit cola`, scientific-name wording, and other vernacular names out of the active picker. The French display is provisional local retailer wording, not a Québec terminology ruling.
- **Behavior:** no forms, density, unit mappings, measurements, recipe links, conversions, yields, or substitutions. Measurement research found no reusable value; substitution research remains unresearched.

## Evidence and boundary

The FAO's 1999 regional volume identifies *Garcinia kola* as bitter kola and reports that the product is eaten in the humid forest zone of West and Central Africa. Its market observations are based on 1995–96 Cameroon data and do not establish current prevalence or a kitchen measure. A 2026 survey of 152 respondents in South-South Nigeria reports non-medicinal seed consumption and fresh or dried seeds, with regional and self-report limitations. An Ottawa–Gatineau retailer lists “Noix de Bitter Kola” and describes the product as whole *Garcinia kola* nuts. That page supports local product wording only; it is not an independent botanical or Québec terminology authority.

The R373 true-kola row remains unchanged. “Bitter cola” is excluded because Kew's medicinal-name index associates that spelling with both *Cola nitida* and *Garcinia kola*. “Petit cola” is excluded because it would turn the broad `cola` query into a singleton exact match. No active picker alias or recipe demand was found for the other surveyed vernacular and scientific names.

Sources: [FAO, *Non-Wood Forest Products of Central Africa*](https://www.fao.org/4/x2161e/x2161e.pdf); [Purger et al., 2026 Nigeria survey](https://pmc.ncbi.nlm.nih.gov/articles/PMC13014730/); [All Market Ottawa–Gatineau listing](https://all-market.net/products/bitter-kola-150g?variant=46595336339644); [Kew POWO, *Garcinia kola*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:428024-1/general-information); [Kew MPNS, “Bitter cola”](https://mpns.science.kew.org/mpns-portal/drugDetail?drugName=Bitter+cola&filter=&fuzzy=true&nameType=all&query=coea).

## Picker and corpus results

The R518 phrase queries `bitter kola`, `bitter kola seeds`, and `noix de bitter kola` each return the new identity. `kola` returns both this row and true kola nuts; `kola nut`, `kola nuts`, and `noix de kola` still return only true kola nuts. The broad `cola` query remains at 14 partial matches, while `petit cola`, `bitter cola`, `Garcinia kola`, and `orogbo` remain unassigned. Generic `seeds` increases from 36 to 37, and `noix` from 30 to 31.

The full manifest scan found no candidate-specific mentions among 114 recipe files and 1,123 ingredient rows. Recipe corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

## Static validation and snapshot

At the R518 integration snapshot, before the later R516/R517 additions, the bundled package normalized without additional changes and validated successfully. The generated Kotlin ingredient index was refreshed and checked against 1,790 references. Ledger schema and source ownership validation found 2,147 records, 9,853 source entries, 8,340 distinct source IDs, and 7,050 distinct URLs, with no source ID mapped to multiple URLs. The reference catalog had 143 forms and 56 legacy candidates. Seed JSON remains UTF-8 without a BOM and uses ASCII escapes for non-ASCII data.

No software tests, build, emulator check, or deployment were run because this change only adds database JSON data under `AGENTS.md`. See the [R518 proposal](../../proposals/wp06-african-next-regional-review-r518-20261017.md). Broader African regional coverage remains open.

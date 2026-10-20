# WP06 African regional R521 integration — Matooke cooking bananas

- **Date:** 2026-10-17
- **Decision:** Promote the existing ledger-only candidate to an identity-only raw East African highland cooking-banana reference.
- **Catalog ID:** `ingredient-ref-east-african-highland-cooking-banana`
- **Display:** `East African highland cooking bananas (matooke)` / `banane matooke`
- **Category:** `FRUIT`
- **Aliases:** none. The Québec French display is provisional, based on a current local retailer title; it is not an OQLF or TERMIUM ruling.
- **Boundary:** Keep the prepared steamed-mashed food also called matooke, Gonja plantain, generic banana/banane, and green plantain terms distinct.
- **Behavior:** no forms, measures, mappings, density, conversions, yields, recipe links, or substitutions. Measurement research is `researched_no_supported_value`; substitution research remains `not_yet_researched`.

## Evidence and boundary

Uganda Gazette No. 79 (29 November 2024) publishes US 997:2023 for raw cooking banana (Matooke), *Musa* spp. (AAA-EAH), supplied to consumers. In the same standards listing, US 998:2023 covers Gonja plantain, *Musa* spp. (AAA-B), preserving the product boundary. The accessible [Gazette copy](https://archive.gazettes.africa/archive/ug/2024/ug-government-gazette-dated-2024-11-29-no-79.pdf) gives this evidence on pages 3008–3009. UNBS lists a newer 2026 schedule and catalogue, but the page and attachments could not be inspected; the older June 2025 schedule is treated as edition-specific, and no claim is made about later document contents.

A current Québec retailer lists “Carton Banane Ouganda Matooke” in its [French produce collection](https://alimentationtransbec.ca/collections/fruits-et-legumes) and identifies its [Québec City store](https://alimentationtransbec.ca/pages/magasin-quebec). This supports a local product title, not botanical identity or package weight. The picker display uses the core phrase “banane matooke” and omits “Ouganda” as a retailer descriptor. OQLF’s generic [banane entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane) and TERMIUM’s generic [BANANE VERTE entry](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frr&lang=fra&srchtxt=BANANE+VERTE) do not name Matooke; broader terms remain outside aliases.

Akankwasa et al. report that “Matooke” can refer both to East African highland cooking bananas and to the prepared staple. The source is now cited as *International Journal of Food Science & Technology*, 56(3), March 2021, pages 1124–1134, DOI 10.1111/ijfs.14813; the existing PMC source ID and URL were preserved. The study supports the crop-versus-dish boundary, not a pan-African naming standard or household measure. [Publisher record](https://academic.oup.com/ijfst/article/56/3/1124/7810867)

## Picker and corpus results

The static phrase-first projection adds the intended Matooke phrase without taking generic plantain or green-banana searches. The exact `banana` query stays with its current phrase matches, while `banane` gains the new fruit. The complete 114-file, 1,123-row manifest recipe scan found no candidate-specific demand. Corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

## Source ownership and static validation

Seven new source IDs and URLs were registered. The existing PMC source ID `WP06-AFRICA-GAP-20261010-S15` was retained with corrected journal citation metadata, and the already-owned OQLF source ID `WP03-FRUIT-OPEN-20261009-S27` was reused without changing its URL. All source IDs map to a single URL; the complete ledger audit found no ID-to-multiple-URL conflicts.

After integration the catalog contains 1,794 ingredient references, 143 forms, and 56 legacy candidates. The ledger contains 2,150 records, 9,874 source entries, 8,357 distinct source IDs, and 7,067 distinct URLs. Seed-package normalization and validation passed; the generated ingredient index is current at 1,794 references. Picker projection, full corpus scan, UTF-8/no-BOM, and scoped documentation checks were completed.

No software tests, build, emulator check, or deployment were run because this change only adds database JSON data under `AGENTS.md`. Broader African regional coverage remains open. See the [R521 proposal](../../proposals/wp06-african-next-regional-review-r521-20261017.md).

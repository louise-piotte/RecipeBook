# WP03/WP04/WP06 R494–R496 gap review integration

Integrated on 2026-10-17 after root review of [R494](../../proposals/wp03-section-f-next-gap-review-r494-20261017.md), [R495](../../proposals/wp04-section-p-next-seafood-review-r495-20261017.md), and [R496](../../proposals/wp06-african-next-regional-review-r496-20261017.md).

## Decisions

- **R494 — current Canadian Shreddies varieties:** resolved the R103 Original-only picker hold by adding three identity-only `GRAIN_AND_CEREAL` references for Original, Honey, and Cinnamon Vanilla. Post Canada currently presents these three varieties together and has corresponding English and French product pages. French retailer titles supply narrow additional aliases. This is a current Canadian lineup review, not a permanent or complete global family roster. The three products remain distinct from generic shredded wheat; no process equivalence is inferred.
- **R495 — canned Québec redfish:** added identity-only `canned Québec redfish / sébaste du Québec en conserve` as a species-neutral `PROTEIN` reference for the recurring Chasse-Marée prepared-product group. Three French producer products and paired Montréal retailer titles support the named group. The OQLF and MAPAQ evidence supports the local sébaste market group; seller wording such as “Atlantic redfish” is not used to assign a species. Keep this prepared-food identity separate from raw Québec redfish and species-specific redfish; it is not a global canned form.
- **R496 — African basil leaves:** added identity-only `African basil leaves / feuilles de basilic africain` for the edible leaves of *Ocimum gratissimum*, with English aliases `scent leaf` and `scent leaves`. Kew confirms the accepted species; a Benin field study and University of Benin repository study support the culinary leaf identity and name. Health Canada's French crop table separately lists *O. gratissimum* and ordinary *O. basilicum* leaves. The French display remains provisional pending Québec-specific terminology evidence. Keep ordinary basil, holy basil, Thai basil, other species, and non-leaf products distinct.

No forms, recipe links, densities, unit mappings, conversions, yields, reusable measures, or active substitution rules were added. R494 and R495 measurements remain `researched_no_supported_value`; substitution research remains `not_yet_researched`. R496 measurement and substitution research remain `not_yet_researched`. The recipe corpus has no candidate-specific demand. Section F, Section P, and broader African regional coverage remain open.

## Catalog and picker effects

- Active references: **1,777**, up from 1,772. Forms remain **143**; legacy-import candidates remain **56**.
- Ledger: **2,135 records**, **9,772 source entries**, **8,274 distinct source IDs**, and **6,987 distinct source URLs**. The batch added five records, 27 record-source entries, 20 new source IDs, and 20 previously unowned URLs. R494 reused three source IDs from its earlier R103 hold; those URLs had not previously been registered in the ledger. R495 reused existing OQLF, MAPAQ, CFIA, and Chasse-Marée source IDs, and R496 reused Health Canada source ID `WP03-FENUGREEK-FORMS-R350-20261016-S01`.
- **R494:** `Shreddies` and `Céréales Shreddies` each return all three products. Each qualified English/French product phrase returns one row. `cereal` / `céréales` increase from 53 / 49 to 56 / 52. `shredded wheat` / `blé filamenté` remain on their existing single generic identity.
- **R495:** `canned redfish` / `sébaste en conserve` each return the new row. `Québec redfish` / `sébaste du Québec` grow from one to two results. Broad `redfish` / `sébaste` queries grow from three to four results and remain multi-result. `Atlantic redfish` remains unowned; canned salmon is unchanged.
- **R496:** the qualified English and French names plus `scent leaf/leaves` each return the new row. `basil` / `basilic` grow from five to six results; `basil leaves` grows from one to two. Botanical and locally scoped names remain out of the aliases.
- The full manifest-ordered scan covered **114 recipe files** and **1,123 ingredient rows**, totaling **753,988 bytes**, with fingerprint `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. Candidate-specific phrase hits and direct recipe links: **0**.

## Validation

- `normalize_seed_ingredient_references.py` and its `--check` passed; the package now has **1,777 references**.
- `normalize_bundled_seed_package.py --check` and `--validate-only` passed.
- `generate_bundled_ingredient_catalog.py --check` passed; the generated Kotlin catalog contains **1,777 references**.
- The Draft 2020-12 research-ledger schema and semantic validator passed with **2,135 records and zero errors**. Each source ID maps to one URL; all 20 new source IDs map to 20 distinct URLs that had no previous URL owner. New observations, findings, and decisions cite sources on their record.
- Static phrase-first picker projections matched the effects above. The manifest-ordered recipe scan retained its reported fingerprint and found no candidate-specific demand.
- Seed JSON and ledger are UTF-8 without BOM; bundled seed JSON remains ASCII-escaped. Local links and scoped whitespace checks passed.
- No Gradle tests, builds, instrumentation, emulator checks, or deployment were run. The active catalog changes only add database JSON data, so the `AGENTS.md` rule says tests are not needed.

## Snapshot hashes

- Ingredient references: `4dd3657ce832719e3b5e2e9b57ad944ae70c447aa0e251dcbd30f2cc63d600fc`
- Ingredient forms (unchanged): `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6`
- Research ledger: `385f1ce9311edea025a65cd95b27f351b4fa329261c5e2825e6d2d7b40693e1e`
- Generated Kotlin catalog: `b53ab62d29243bdb7a78e5e936b8d354cf93069b27dc3e98448fdd6eee50430d`

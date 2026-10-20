# WP03 Section F: sorghum semolina (jowar rava) identity review

## Review record

- **Reviewed and sources accessed:** 2026-10-13.
- **Status:** Root accepted and integrated on 2026-10-13; see the batch README. Both source-qualified English aliases were included; the broad single-word `rava` query consequently finds this sorghum product. No app tests or emulator checks were needed for this database-JSON addition.
- **Open checklist:** The plan still has the broad Section F item for regionally significant cereal mixes and preprocessed grains at [line 2203](../../RecipeBook-global-ingredient-catalog-plan.txt#L2296). The already integrated corn-bran and rice-bran reviews are not reopened here.
- **Scope:** Dry sorghum semolina sold regionally as *jowar rava*. Do not extend the identity to sorghum flour, whole sorghum grain, sorghum grits/meal, flakes, puffed sorghum, instant mixes, or prepared dishes.
- **Source IDs:** `WP03-SORGHUM-SEMOLINA-20261013-S01` through `S10`; S01–S08 were absent from the proposal-time ledger snapshot, and root verified S09–S10 were absent before integration.

## Recommendation

Recommend one identity-only `GRAIN_AND_CEREAL` reference named **sorghum semolina / semoule de sorgho**. CSIR–CFTRI explicitly documents production of “Sorghum (Jowar) semolina (sooji/rava)” and says the product is made in different granulations [S01]. Canadian-facing storefront listings found at review time use **Jowar Rava** for a 500 g product and separately list **Jowar (Sorghum) Rava** and **Sorghum Rava (Semolina)** [S08–S09]. These sources establish a concrete processed-grain candidate; they do not establish one universal hull state, granulation, roasting/soaking process, measure, or recipe conversion.

Use **semoule de sorgho** as a clear Québec French display. Usito, a Québec French dictionary, includes “semoule de sorgho” in its sorgho entry, while OQLF gives **sorgho** as the preferred French base term and pairs it with English *sorghum* and *Sorghum bicolor* [S04–S05]. This is a descriptive bilingual display supported by Québec French usage, not a claim that OQLF has a dedicated term record for sorghum semolina.

| Proposed field | Recommendation | Evidence boundary |
| --- | --- | --- |
| ID | `ingredient-ref-sorghum-semolina` | Unallocated across active references, forms, legacy identities, and ledger record IDs in the snapshot below. |
| English display | **sorghum semolina** | CFTRI identifies a sorghum/jowar semolina product; Canadian storefront listings pair sorghum and semolina/rava wording. |
| Québec French display | **semoule de sorgho** | Attested in Usito; OQLF supports the base noun *sorgho*. This is not an OQLF ruling on a product standard. |
| English aliases | **jowar rava**; **sorghum rava** | Qualified product names occur in CFTRI and current Canadian-facing listings. Do not add unqualified `rava`, `rawa`, `sooji`, `suji`, or `semolina` as aliases. |
| French aliases | None | Keep *sorgo* and `gruau de sorgho` out of this row; see the Québec naming and boundary notes below. |
| Category | `GRAIN_AND_CEREAL` | This is a cereal product ground from sorghum, parallel to the catalog’s existing grain, flakes, and granule identities. |
| `defaultDensity` / `unitMappings` | `null` / `[]` | No reusable volume-to-mass evidence. |
| Forms, conversions, yields, recipe links, substitutions | None active | The sources do not establish catalog-wide process states, numeric behavior, recipe demand, or a measured substitute. |

## Product and naming boundaries

Codex’s sorghum-flour standard defines flour as finely comminuted endosperm and expressly excludes sorghum grits or meal from that standard [S03]. This supports keeping a coarse semolina/granule product distinct from the existing flour reference; it does **not** define semolina as identical to grits or meal. CFTRI’s sorghum-specific semolina process source supplies the positive product identity [S01].

Do not infer one grain preparation or particle-size form. CFTRI reports different granulations, and commercial listings vary in descriptions such as coarse-ground, whole-grain, or stone-ground. Those details describe particular technologies or SKUs; they do not justify generic `coarse`, `fine`, `whole-grain`, `roasted`, or `pre-soaked` forms. Keep sorghum semolina separate from:

| Existing or adjacent product | Boundary |
| --- | --- |
| Grain sorghum / `sorgho à graine` | Intact grain row; not a milled semolina synonym or form. |
| Sorghum flour / `farine de sorgho` | Existing flour identity. `jowar flour` is already an alias there; do not move it or add bare `jowar` to either row. |
| Puffed sorghum / `sorgho soufflé` | Ready-to-eat expanded grain, not semolina. |
| Sorghum flakes | A separate unresolved candidate; this review does not reopen it or treat flakes as semolina. |
| Sorghum grits / `gruau de sorgho` | Keep separate. OQLF and TERMIUM record this term for sorghum grit, and TERMIUM describes hulled sorghum seeds [S06–S07]. Although one retailer informally calls jowar rava “grain grits,” that alone does not establish equivalence. |
| Durum semolina / `semoule de blé dur`; remilled durum semolina | Existing wheat identities. Do not add bare `semolina`, `sooji`, or `rava` aliases that would imply these are interchangeable. |
| Rice idli rava and millet rava products | Separate cereal identities or held candidates. Do not generalize *rava* alone across grains. |
| Instant upma/idli mixes, cooked porridge, dosa/idli batter, or finished foods | Prepared products, not this dry single-grain ingredient. |

Usito also lists *sorgo* as the orthographic-reform spelling alongside *sorgho*. Keep the catalog display in the OQLF-preferred spelling **sorgho** and do not add `semoule de sorgo` as a French alias without a product-specific Québec source [S04–S05].

## Live ownership, picker, and recipe audit

The read-only snapshot below was taken on 2026-10-13. Counts and SHA-256 hashes describe exact current file bytes. The manifest-ordered recipe fingerprint hashes each relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Surface | Snapshot |
| --- | --- |
| Active ingredient references | 1,333 total; 145 in `GRAIN_AND_CEREAL`; SHA-256 `6e80317089b2bbd55991234e8dc9a880654d78355f463f6feebd809e7a0c1823` |
| Ingredient forms | 98; SHA-256 `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,641 records; 6,145 source entries; 5,158 distinct source IDs; SHA-256 `3a61c7a9d3ba0f871582221dfc993aae99eb9959c632215cc1e2c416212ed1e3` |
| Seed manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes; fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The exact-key check used the repository’s search normalization across reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs. No exact owner exists for `sorghum semolina`, `sorghum rava`, `jowar rava`, `jowar rawa`, `jowar semolina`, `semoule de sorgho`, `semoule de jowar`, `gruau de sorgho`, `sorghum grit(s)`, the proposed reference ID, or `candidate-sorghum-semolina`. No form or legacy candidate owns these phrases. The proposal-local source prefix was unused in the live ledger.

| Nearby live owner | Current identity and relevance |
| --- | --- |
| `ingredient-ref-grain-sorghum` | `grain sorghum / sorgho à graine`; French aliases `sorgho en grains` and `sorgho en grain`. |
| `ingredient-ref-sorghum-flour` | `sorghum flour / farine de sorgho`; English alias `jowar flour`. |
| `ingredient-ref-puffed-sorghum` | `puffed sorghum / sorgho soufflé`; aliases `popped sorghum` and `sorghum puffs`. |
| `ingredient-ref-durum-semolina` and `ingredient-ref-semola-rimacinata` | Existing wheat semolina identities. |
| `ingredient-ref-sankhal` | English display contains “broken millet semolina”; it is a separate millet product. |
| `candidate-sorghum-flakes` | Existing unresolved sorghum-flakes candidate; it does not own a semolina identity. |

The current picker implementation normalizes accents and punctuation, indexes reference names/aliases and form terms, then prefers phrase matches before substring fallback. The following is a static projection of that code with the proposed row; it is not an Android runtime test.

| Query | Current result | Projection with this proposal |
| --- | --- | --- |
| `sorghum semolina`, `jowar rava`, `sorghum rava` | No match | Proposed row only |
| `semoule de sorgho` | No match | Proposed row only |
| `jowar` | Sorghum flour | Sorghum flour and proposed semolina row; both are source-qualified sorghum products |
| `rava` | No match | Proposed row only because the qualified aliases contain the query word; this is a broad one-word match and could bias users who mean another grain’s rava |
| `semolina` | Durum semolina, remilled durum semolina, and Sankhal | The same three plus proposed sorghum semolina |
| `sorghum` / `sorgho` | Grain sorghum, sorghum flour, puffed sorghum | The same three plus proposed semolina |
| `gruau de sorgho`, `sorghum grits` | No match | Still no match; neither is an alias |

The qualified aliases are source-attested, but they make bare `rava` return the sorghum row under current phrase-first matching. If that broad result is considered misleading, omit both `rava` aliases until the picker can preserve the qualifier; the bilingual display remains searchable as `sorghum semolina / semoule de sorgho`. Do not add bare `rava`, `sooji`, or `semolina` aliases.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `sorghum semolina`, `sorghum rava`, `jowar rava`, `jowar rawa`, `jowar semolina`, `semoule de sorgho`, `semoule de jowar`, `sorghum grit(s)`, `sorghum meal`, and `gruau de sorgho`. The scan found **0 matching recipe files and 0 matching ingredient rows**. A separate broad `gruau` scan found two full-recipe text hits, in the prepared-oat recipes “Gruau au four à la friteuse à air” and “Gruau sans cuisson,” with **0 ingredient-row hits**; neither is sorghum. No bundled recipe link or recipe-specific product demand is supported.

## Measures, conversions, and substitution limits

Health Canada has published the 2026 Canadian Nutrient File as relational files, including Food Name and Measure Weight Conversion tables [S10]. On the access date, the Open Government Portal dataset page returned 403 and its direct Food Name and Measure Weight Conversion CSV links were not accessible through the research browser. The 2015 CNF web search is explicitly interim and not being updated [S10]. Therefore, exact CNF row inspection remains **blocked**; do not treat the failed downloads or the older page as proof that no sorghum-semolina row exists.

| Data area | Recommendation | Reason and limit |
| --- | --- | --- |
| Measurement state | Keep blocked pending direct CNF 2026 row review | The official file contents were not retrievable on 2026-10-13. Reopen only after exact food identity and measure-weight rows can be checked. |
| Retail package mass | Preserve only as product-specific source evidence | One Canadian-facing listing shows 500 g. A package net weight is not a serving, household measure, or recipe amount. |
| Default density and unit mappings | `null` / `[]` | No sorghum-rava-specific volume/mass pair or fill method is available. Do not borrow sorghum grain, flour, durum semolina, millet semolina, or grits values. |
| Forms and conversions | Add none | Different granulations and SKU processes do not support generic coarse/fine, roasted, soaked, dry-to-cooked, or grain-to-semolina conversions. No paired before/after mass or yield was found. |
| Recipe links | Add none | The full bundle contains no candidate-term line. |
| Substitutions | Add no global or contextual rule | Sources describe rava/semolina as usable in traditional dishes, but provide no validated amount-preserving recipe substitution. Similar use or a seller’s “alternative” claim is not an amount-qualified conversion. Keep sorghum semolina separate from wheat semolina, rice rava, and other millet ravas. |

## Source register

Sources were accessed or checked on 2026-10-13. IDs below are registered in the shared ledger under `ingredient-ref-sorghum-semolina`; OQLF and TERMIUM, and the two retailer pages, have separate source records.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-SORGHUM-SEMOLINA-20261013-S01` | CSIR–Central Food Technological Research Institute, [Production of Sorghum (Jowar) semolina (sooji / rava)](https://cftri.res.in/technologies/BP/ss.pdf), process sheet. | Primary food-technology source identifies sorghum/jowar semolina and describes different granulations. It does not establish one retail formulation, household measure, or universal process state. |
| `WP03-SORGHUM-SEMOLINA-20261013-S02` | CSIR–CFTRI, [Technology Update: New Technologies](https://cftri.res.in/PDF/TECH-UPDATE.pdf), item 9. | Official institute list independently names production of sorghum (jowar) semolina. No product formula or quantity is provided. |
| `WP03-SORGHUM-SEMOLINA-20261013-S03` | FAO/WHO Codex Alimentarius, [Standard for Sorghum Flour, CXS 173-1989](https://www.fao.org/input/download/standards/58/CXS_173e.pdf), scope and description; see the [current standards index](https://www.fao.org/fao-who-codexalimentarius/codex-texts/list-standards/en/?ids=91). | The flour standard defines sorghum flour and expressly excludes grits or meal from *Sorghum bicolor*. Supports the boundary from flour; it does not state that semolina, grits, and meal are interchangeable. Codex’s current standards index lists CXS 173-1989 with a 2023 modification. |
| `WP03-SORGHUM-SEMOLINA-20261013-S04` | Université de Sherbrooke, [Usito: sorgho ou sorgo](https://usito.usherbrooke.ca/d%C3%A9finitions/sorgho_ou_sorgo), updated 2026-06-19. | Québec French dictionary identifies *Sorghum bicolor* and uses the phrase `semoule de sorgho` in its examples. Supports a clear descriptive French display, not an OQLF product-name ruling. |
| `WP03-SORGHUM-SEMOLINA-20261013-S05` | Office québécois de la langue française, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho). | OQLF’s preferred French term is `sorgho`; it pairs English `sorghum` and Latin *Sorghum bicolor*. It supports the base noun, not the semolina compound. |
| `WP03-SORGHUM-SEMOLINA-20261013-S06` | OQLF, [gruau de sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18062438/gruau-de-sorgho). | Records `gruau de sorgho` as a sorghum-grit term. This is a boundary term, not an alias for rava/semolina. |
| `WP03-SORGHUM-SEMOLINA-20261013-S07` | TERMIUM Plus, [gruau / sorghum grit](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=27&i=&index=frw&lang=fra&sg_kp_wet=161864&srchtxt=GRUAU). | Describes hulled sorghum seeds under sorghum-grit terminology. The direct page fetch was unavailable during this review; indexed source text was used. |
| `WP03-SORGHUM-SEMOLINA-20261013-S08` | Distacart Canada, [Rava and Sooji collection](https://www.distacart.com/en-ca/collections/rava-and-sooji). | Canadian-facing listings use `Jowar (Sorghum) Rava` and `Sorghum Rava (Semolina)`. Supports retail naming only; no inventory or serving claim is made. |
| `WP03-SORGHUM-SEMOLINA-20261013-S09` | Silkrute Canada, [Organic Jowar Rava, 500 g](https://www.silkrute.ca/grocery/cooking/millets/s-siddhagiris-satvyk-the-health-re-store-organic-jowar-rava-500gm-unpolished-sorghum-millet-suji-stoneground-millet-rava-upma-jowar-millet-upma-rava-high-plant-protein-and-fiber-en/). | Uses `Jowar Rava` and sorghum wording. The 500 g package size is product-specific, not a serving or household measure; no stock or local Québec availability claim is made. |
| `WP03-SORGHUM-SEMOLINA-20261013-S10` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) and [CNF 2026 Open Government dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1). | Confirms CNF 2026’s Food Name and Measure Weight Conversion files are part of the current relational dataset. The dataset page and direct CSV routes were not retrievable on the access date; no food row or quantity is inferred. |

## Root disposition

Accepted and integrated on 2026-10-13 as identity-only `ingredient-ref-sorghum-semolina`, with English aliases `jowar rava` and `sorghum rava` and French display **semoule de sorgho**. The aliases remain source-qualified; the current picker does make bare `rava` find this row, which is an accurate match to a documented sorghum-rava product. Do not add unqualified `rava`, `rawa`, `sooji`, `suji`, or `semolina` aliases. Keep all measures, density, mappings, forms, conversions, yields, recipe links, and substitutions inactive. Measurement research remains blocked pending direct CNF 2026 row inspection. See the [integration README](../batches/wp03-section-f-sorghum-semolina-identity-integration-20261013/README.md).

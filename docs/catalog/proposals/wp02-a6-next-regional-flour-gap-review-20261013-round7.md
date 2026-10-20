# WP02 A6 Round 7: `quinua` alias for quinoa grain

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Reviewer proposal completed; root integrated the approved `quinua` English alias on the existing quinoa grain row. Root recorded the source evidence in the ledger; no new flour alias or identity was added.
- **Owner:** WP02 A6 regional-grain/flour review; root coordinator owns integration.
- **Scope:** Decide whether the English search key `quinua` belongs on the existing *Chenopodium quinoa* grain identity. This is one regional spelling alias, not a new identity or a flour alias.
- **Plan/archive:** The active [WP02 A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278) remains open. Searches of the current checklist, proposal/batch archive, and live seed found no prior `quinua` review or alias. This review does not reopen kodo/proso millet atta, Rajgira/Chaulai, Mandua, the `milo` boundary, or any earlier A6 flour packet.
- **Recommendation:** **Integrate one English alias:** `quinua` on `ingredient-ref-quinoa`. Keep French `quinoa`, both existing dry/cooked forms, all flour identities, and their numeric/substitution states unchanged.
- **Proposal-local source IDs:** `WP02-A6-QUINUA-GRAIN-ALIAS-20261013-R7-S01` through `S06`. All six were checked against current ledger source IDs and archived proposal/batch text before drafting; none was present. Existing source IDs reused for the measurement review are listed separately.

## Decision and exact ownership

TERMIUM Plus, the Government of Canada's terminology bank, lists `quinoa` and `quinua` as correct, standardized English terms for *Chenopodium quinoa* in botany, grain growing, and milling/cereal industries [S01]. The entry separately gives Québec French `quinoa` as the standardized masculine noun; OQLF's 2025 GDT record likewise uses `quinoa` for the plant and its edible seeds [existing source `WP02-A6-QAM-FLOUR-20261011-S01`]. This supports a narrow search alias on the existing grain row. It does not support a second ingredient identity or changing the French label.

| Normalized phrase | Owner / field | Decision and evidence boundary |
|---|---|---|
| `quinua` | Add to `aliasesEn` on `ingredient-ref-quinoa` (`quinoa / quinoa`, `GRAIN_AND_CEREAL`). | TERMIUM maps the exact English synonym to *Chenopodium quinoa* and marks it standardized [S01]. No active reference, form, or legacy candidate owns the normalized phrase. |
| `quinoa` | Keep on the existing grain and its current flour, flakes, puffed, and colour-qualified flour identities. | The broad query already returns eight distinct current products; this review changes none of them. |
| `quinua flour`, `harina de quinua`, `farine de quinua` | No new owner. | `quinua` is supported here as an English grain name. A current Toronto-facing listing pairs `Organic Quinoa Flour` with Spanish `harina de quinua organica`, but the page is a demo store that says orders will not be fulfilled; it is not evidence for an English `quinua flour` alias or a Québec French phrase [S03]. |
| `quinua real`, `Quinua Real` | No catalog owner. | CIPO has an active composite design mark `QUINUA REAL QUINOA & Design`; do not add the brand wording. The official term record still supports bare `quinua` as a standardized common name [S01, S02]. |
| `kinua`, `quínoa`, `quínua`, `arroz del Perú`, `Peruvian rice`, `Inca rice` | No owner proposed. | These are Spanish-only variants or other accepted terms in TERMIUM, outside this exact English alias decision. In particular, do not use rice nicknames for a pseudocereal. |
| `ingredient-ref-quinua` | No new reference ID. | `quinua` and `quinoa` are synonyms for the existing species-level grain identity, not separate ingredients. |

The exact proposed reference after integration would be:

```json
{
  "id": "ingredient-ref-quinoa",
  "nameEn": "quinoa",
  "nameFr": "quinoa",
  "aliasesEn": ["quinua"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

The snippet shows the resulting alias field, not a replacement object or a recommendation to rewrite the other fields. No new form, recipe link, identity, French alias, unit mapping, density, conversion, yield, package yield, or substitution rule is proposed.

## Current ownership and picker projection

The static projection follows `IngredientSearch.kt`: lowercase using `Locale.ROOT`, normalize Unicode with NFKD, remove combining marks, fold the supported ligatures, replace punctuation with spaces, prefer complete word-phrase matches, then use substring fallback. The audit covered all live reference names/aliases, form labels/match terms, and legacy candidate names/aliases.

| Query | Current picker result | Projected result after one alias |
|---|---|---|
| `quinua` | No result | `ingredient-ref-quinoa` (`quinoa`) only |
| `quinoa` | Eight rows: quinoa grain; quinoa flour; roasted quinoa flour; white, red, and black quinoa flour; quinoa flakes; puffed quinoa | Same eight rows |
| `quinua flour` | No result | No result |
| `harina de quinua` | No result | No result |
| `quinua real` | No result | No result |
| `quinoa flour` / `farine de quinoa` | Generic, roasted, white, red, and black quinoa-flour rows | Same five flour rows |
| `quinoa cooked` / `quinoa dry` | `ingredient-ref-quinoa` | Same grain row; the selected form is still resolved through the existing label, not through the new alias |

`ingredient-ref-quinoa` has the existing `ingredient-form-quinoa-dry` and `ingredient-form-quinoa-cooked` forms. A `quinua` query will identify the grain row but will not preselect a form; `quinua cooked` is not proposed as a form hint. The bare alias therefore remains distinct from flour, dry/cooked state, and the branded `Quinua Real` phrase.

Exact normalized `quinua` ownership is absent from the current 1,339 references, 98 forms, 64 legacy candidates, and ledger record IDs. The matching current owner for `quinoa` is `ingredient-ref-quinoa`; the generic flour remains `ingredient-ref-quinoa-flour`. An archive-wide case-insensitive search returned no earlier `quinua` proposal/batch decision. No new ingredient ID or legacy candidate is required.

## Québec French and product identity boundary

Keep the Québec display `quinoa` exactly as it is. OQLF's current GDT entry gives the Latin identity *Chenopodium quinoa*, identifies the edible seeds, and lists `quinoa` as the preferred masculine French term [existing source `WP02-A6-QAM-FLOUR-20261011-S01`]. TERMIUM's French record also standardizes `quinoa`, while its English record separately accepts `quinua` [S01]. Do not copy the Spanish spelling into `aliasesFr` or display it as Québec French.

Peru's 2025 INACAL standard names extruded flour made from *quinua* (*Chenopodium quinoa Willd.*); that is a process-qualified flour class, not a reason to attach bare `quinua` to a flour row [S04]. Peru's 2023 food-composition table also has a separate `Quinua, harina de` item [S05]. Both reinforce the grain/flour boundary; neither establishes an English `quinua flour` phrase for this catalog. The existing generic, roasted, white, red, and black quinoa flour references remain untouched.

## Measurement, density, and substitution limits

The alias proposal carries no numeric data. Keep the active quinoa grain density and unit mappings empty, and keep both dry/cooked form densities null. The existing `ingredient-ref-quinoa`, dry-form, cooked-form, and generic-flour ledger records retain `measurementState: not_yet_researched`; no measurement state is changed here.

Health Canada's currently accessible CNF item pages are the 2015 records. The source-specific values visible when checked were:

| CNF item | Source-reported values | Limit |
|---|---|---|
| Grains, quinoa, dry, code 4495 [existing source `WP03-S5`] | 100 mL = 71.9 g; 250 mL = 179.6 g; 1 serving = 20.0 g | Published 2015 dry-grain portions; the page gives no packing method. Do not turn them into a stable density or reusable measure. |
| Grains, quinoa, cooked, code 5917 [existing source `WP03-S5-COOKED-5917`] | 100 mL = 78.2 g; 125 mL = 97.7 g; 250 mL = 195.5 g | Published 2015 cooked-grain portions; the page gives no packing method or cooking yield. These existing values are recorded as source-specific observations, not active mappings. |
| Cooked quinoa, Health Canada 2008 booklet [existing source `WP03-QCM-20261012-S04`] | 125 mL = 73 g | A separate ready-to-eat household portion. It conflicts with the 2015 value at the same volume; do not average the sources or derive a generic conversion. |
| `Quinua, harina de`, Peru food table, version 2023 [S05] | Nutrient composition is reported per 100 g. | Composition is not a household measure, flour bulk density, or volume conversion. |

The existing dry/cooked forms and source-specific cooked observations remain as they are. The current Health Canada record notes that CNF 2026 is published as relational CSV files and that the 2015 online search remains an interim access path; item-level 2026 quinoa rows have not been inspected in this review [existing source `WP03-QCM-20261012-S05`]. Do not treat the 2015 numbers as a complete current conversion assessment.

The grain and form ledger records have no substitution findings, and both bundled substitution-rule files are empty. The target's `substitutionResearchState` remains `not_yet_researched`; that is an open research state, not a finding that quinoa has no substitutes. No grain-to-flour equivalence, flour replacement ratio, cooking-yield rule, or contextual substitution is inferred from the alias or the cited standards.

## Recipe demand

The complete split-package corpus was scanned in manifest order: all **114 recipe files** and all **1,123 ingredient rows**, including recipe text, row fields, and `ingredientRefId` / `ingredientFormId` links. Matching used the same lowercase, accent/punctuation-folded whole-phrase rules as the picker.

- `quinua`, `quinua flour`, `harina de quinua`, `quinua real`, and `kinua`: **0 recipe-file hits and 0 ingredient-row hits**.
- `quinoa`: **2 files** contain the term; one ingredient row directly links to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`: recipe `016`, “Bouchées de quinoa / Quinoa Bites,” `2 cups cooked quinoa`. A second recipe (`018`, Turkey Meatballs) mentions quinoa as an optional serving suggestion in bilingual prose but has no quinoa ingredient row or link.
- No recipe uses a quinoa-flour phrase or has a proposed `quinua` link. Do not relink, change recipe text, or infer quantity or form data.

## Source and finding ID collision audit

The six proposal-local source IDs below were checked against all 6,280 live source entries and archived proposal/batch text before use; none collided. Existing source IDs are cited as reused evidence, not reallocated. The target grain and forms have no current substitution finding; the ledger has 190 distinct finding IDs overall. **No new observation ID or substitution `findingId` is proposed**, so there is no numeric or substitution record to add as part of this alias-only decision.

| Source ID | Source and checked scope |
|---|---|
| **WP02-A6-QUINUA-GRAIN-ALIAS-20261013-R7-S01** | Government of Canada, Translation Bureau, [TERMIUM Plus: KINUA / *Chenopodium quinoa*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=esr&lang=eng&srchtxt=KINUA), English record dated 2016-04-26, page modified 2025-04-06. Lists `quinoa` as the standardized main English term and `quinua` as a correct standardized English synonym, says both are ISO-standardized terms, and identifies *Chenopodium quinoa*. Direct alias and taxon evidence. |
| Existing **WP02-A6-QAM-FLOUR-20261011-S01** | OQLF, [quinoa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa), GDT updated 2025. Supports the current French display, masculine agreement, edible-seed context, and species identity. Reused from the prior quinoa/amaranth flour review. |
| **WP02-A6-QUINUA-GRAIN-ALIAS-20261013-R7-S02** | Canadian Intellectual Property Office, [QUINUA REAL QUINOA & Design, registration 1733583](https://ised-isde.canada.ca/cipo/trademark-search/1733583?lang=eng), status checked 2026-10-13. The composite design mark is registered/active, includes the brand wording `QUINUA REAL`, and its goods list includes flour. Supports a bounded Canadian brand-search risk only; it does not make bare `quinua` a brand-only term or establish current sales. |
| **WP02-A6-QUINUA-GRAIN-ALIAS-20261013-R7-S03** | Vida Market Toronto, [Organic Quinoa Flour (harina de quinua organica)](https://vidamarketfoods.com/product/organic-quinoa-flour-harina-de-quinua-organica/), page checked 2026-10-13. Its product title and category pair an English flour name with a Spanish phrase. The page explicitly says this is a demo store and orders will not be fulfilled; do not claim availability, product composition, or a generic English alias from it. |
| **WP02-A6-QUINUA-GRAIN-ALIAS-20261013-R7-S04** | Peru's National Institute for Quality (INACAL), [NTP 011.457:2025, extruded flour of quinua](https://servicios.inacal.gob.pe/cidalerta/biblioteca-detalle.aspx?id=38744), second edition published 2025-10-01. Defines a process-qualified flour made from *quinua* (*Chenopodium quinoa Willd.*) for human consumption. Supports regional product boundary only; it supplies no household measure or catalog conversion. |
| **WP02-A6-QUINUA-GRAIN-ALIAS-20261013-R7-S05** | Peru National Institute of Health, [Peruvian Food Tables: Quinua, harina de](https://tablasperuanas.ins.gob.pe/node/482), code A58, version 2023. Identifies a cereal/derivative flour item and reports composition values; those values are not flour density or volume portions. |
| **WP02-A6-QUINUA-GRAIN-ALIAS-20261013-R7-S06** | Vida Market Toronto, [flour catalogue](https://vidamarketfoods.com/product-category/breads-bakery/flour/), page checked 2026-10-13. Lists `Organic Quinoa Flour (harina de quinua organica)` as in stock in the catalogue, but the linked product page identifies the site as a demo store that cannot fulfill orders. Included only to show the wording's Canadian-facing context, not current availability. |
| Existing **WP03-S5** | Health Canada, [CNF quinoa dry, code 4495](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495), checked 2026-10-13. Reuse the existing dry-state source ID for the label and source-specific 2015 portions; no active mapping is proposed. |
| Existing **WP03-S5-COOKED-5917** | Health Canada, [CNF quinoa cooked, code 5917](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5917), checked 2026-10-13. Reuse the distinct cooked-state source ID for the label and source-specific 2015 portions; no active mapping is proposed. |
| Existing **WP03-QCM-20261012-S04** and **WP03-QCM-20261012-S05** | Health Canada, [Nutrient Value of Some Common Foods (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html) and [Canadian Nutrient File information](https://www.canada.ca/en/health-canada/services/food-nutrition/nutrient-data/canadian-nutrient-file-about-us.html). Reuse for the separate 2008 household observation and the unresolved CNF 2026 item-level review. |

## Baseline snapshot and verification

Snapshot captured 2026-10-13 before writing this proposal. The corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, exact file bytes, and a final NUL byte. Source and finding totals count ledger entries / distinct identifiers as shown.

| Store | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,339 | `5779b779d58d428fbabd4c073ee4a303bdb5809af857300be35668c353c2df15` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,648 records; 6,280 source entries / 5,275 distinct source IDs; 339 observations; 190 findings | `e53281fb3b3e9338bd46d8bee02e4e685f21eb21c3282deb66e9f04ab8247c01` |
| Seed manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Static review covered the active A6 checklist and archive, live reference/form/legacy ownership, normalized picker projections, current source records, measurement and substitution state, ID collisions, and the full recipe corpus. No app, unit, instrumentation, emulator, or application tests were run; this is a proposal-only data review under the database-JSON-only testing rule in `AGENTS.md`.


## Root integration result (2026-10-13)

Added `quinua` to `ingredient-ref-quinoa.aliasesEn` only. The existing French display, dry/cooked forms, flour references, numeric states, and substitutions remain unchanged. The six proposal source records and an accepted alias decision are now on the quinoa ledger record. Static package validation, catalog-index checks, source/ID checks, and text integrity checks passed; no app or emulator tests were run because this was a database-JSON-only change. See [the round-seven integration batch](../batches/wp02-wp03-wp04-round7-gap-review-integration-20261013/README.md).

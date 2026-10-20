# WP06 African regional gap review R509 — West African kinkeliba leaves

- **Reviewed:** 2026-10-17
- **Recommendation:** Add one identity-only ingredient reference for dried kinkeliba leaves (*Combretum micranthum*) used to prepare the West African leaf infusion. Keep names narrow, no active measurements or substitutions, and no prepared-beverage identity.
- **Scope:** One open West African pantry/herb ingredient gap. This review does not claim to complete African cuisine coverage.

## Proposed identity

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-kinkeliba-leaves` |
| English display | `dried kinkeliba leaves` |
| Québec French display | `feuilles de kinkéliba séchées` (provisional descriptive wording) |
| Category | `HERB` |
| English aliases | None |
| French aliases | None |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms, conversions, yields, recipe links, active substitutions | None |

The identity covers the dried leaf ingredient sold and used for kinkeliba infusion/decoction. It excludes the prepared drink, fresh leaves, stems, bark, roots, fruit, seed, medicinal extracts, and branded or blended teas. The English display follows the Montréal-facing retailer's “Kinkeliba - Dried leaves” product wording. The French display combines TERMIUM Plus's Canadian French botanical term `kinkéliba` with the Québec retailer's French description of an infusion made from the leaves. No OQLF culinary term for this leaf product was found in targeted searches, so the display remains provisional and is not presented as an OQLF recommendation.

Keep scientific names in research records, consistent with the catalog workflow. Do not alias `bush tea`, which is too broad for a species-specific picker; do not alias `tea`, `thé`, `kinkeliba tea`, or `tisane de kinkéliba`, which refer to a prepared infusion rather than the dry leaf ingredient. The display terms already make the common name searchable, including accent-folded `kinkeliba` / `kinkéliba`, so no extra aliases are needed. PROTA's `vrai kinkéliba` is retained as source wording but not selected as an ingredient alias because the product-local sources use the shorter product name.

## Why this is a distinct unresolved gap

PROTA describes *C. micranthum* as widespread in the West African savanna zone, records `Kinkeliba` in English and `Vrai kinkéliba` in French, and documents leaf infusions as a widely used beverage. A primary Dakar food-use study explicitly identifies kinkeliba as a common local beverage made from dried *C. micranthum* leaves. Québec-facing evidence also exists: a Montréal retailer lists dried leaves in English, while a Montréal-based retailer uses `KINKÉLIBA` in French and describes the leaf infusion. This supports an edible/pantry ingredient identity, rather than an entry based only on botanical or medicinal use.

The live catalog has separate black tea, green tea, oolong tea, and matcha references, as well as other species-specific leaf products. Kinkeliba is not an alias for those items. The [R362 oolong decision](wp05-section-v-oolong-tea-identity-review-r362-20261016.md) reuses ISO's distinction that herbal infusions are outside the *Camellia sinensis* tea-type classification. This proposal treats kinkeliba as a dried herb ingredient, not as another type of black, green, or oolong tea.

Recent African integrations remain separate: R478 kuka powder, R481 dried Gnetum leaves, R484 grains of Selim, R487 ugu leaves, R490 shiro powder, R493 calabash nutmeg, R496 African basil leaves, R499 gboma leaves, R502 waterleaf, and R505 garden egg fruit. Kinkeliba is a different plant and product from each. See the [R504–R506 integration record](../batches/wp03-wp04-wp06-r504-r506-gap-review-integration-20261017/README.md) and the [R505 garden-egg review](wp06-african-next-regional-review-r505-20261017.md). Broader African regional coverage remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).

## Duplicate, archive, and source-ownership audit

Read-only checks covered the active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), picker search implementation, workflow, and WP06 proposal/batch archive. The live snapshot fingerprints are:

| Surface | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| Ingredient references | 1,785 rows | 582,837 | `2e4dfc405a3578d17400dd108296d37305651fd9626820ba1f1f7850606e8b9a` |
| Ingredient forms | 143 rows | 113,370 | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| Legacy candidates | 56 rows | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| Research ledger | 2,142 records; 9,829 source entries | 9,952,090 | `8fabf1c8e425815974a34db5434ad8d57507efb315948003dc189917e7289927` |
| Manifest | 114 paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Case-, accent-, and punctuation-normalized exact phrase checks found no active reference, form, or legacy owner for `dried kinkeliba leaves`, `kinkeliba leaves`, `kinkeliba`, `feuilles de kinkéliba séchées`, `feuilles de kinkéliba`, `kinkéliba`, `vrai kinkéliba`, `bush tea`, `kinkeliba tea`, `tisane de kinkéliba`, `Combretum micranthum`, `douté`, or `sekhaw`. The ledger, prior proposal/batch archive, and workflow also have no kinkeliba / *C. micranthum* record or earlier proposal. The proposed reference ID, R509 proposal path, and new source-ID prefix `WP06-AFRICA-KINKELIBA-R509-20261017-S` are not already present.

The current ledger has 8,317 distinct source IDs and 7,027 distinct URLs; its global audit found no source ID mapped to multiple URLs. Each new R509 ID S01–S06 below owns one URL that is not currently registered. Reuse `WP05-SECTION-V-OOLONG-TEA-R362-20261016-S01` for the existing ISO classification source if needed; it already owns one URL and must not be duplicated under R509. No shared ledger update is part of this proposal.

## Naming and boundary decisions

| Term | Decision | Reason |
|---|---|---|
| `dried kinkeliba leaves` | English display | Matches the Montréal-facing retail product and names the edible ingredient part. |
| `feuilles de kinkéliba séchées` | Provisional fr-CA display | A clear leaf-product wording grounded in TERMIUM's French `kinkéliba`, the retailer's French leaf-infusion description, and the Senegal study's dried leaves. No OQLF culinary-product ruling was located. |
| `kinkeliba`, `kinkéliba` | No separate alias needed | Both are already contained in the bilingual display terms and normalize to the same search key. |
| `vrai kinkéliba` | Keep in research only | PROTA records it as a French vernacular name; the local product source uses `Kinkéliba`, and the more specific leaf display avoids adding a plant-level phrase. |
| `bush tea` | Do not alias | Although PROTA lists it among English vernacular names, it can describe multiple unrelated African infusions and would be an overbroad search term. |
| `kinkeliba tea`, `thé de kinkéliba`, `tisane de kinkéliba` | Do not alias to the leaf reference | These name the prepared drink; the proposed record is for the dried leaves. A future beverage model would need its own scope. |
| `tea` / `thé` | Do not alias | These are broad tea-class terms with existing matches; herbal infusion is not a *Camellia sinensis* tea type. |
| *Combretum micranthum* | Research only | Taxonomic identification belongs in research artifacts under the current schema/workflow policy. |

No equivalence is proposed with black, green, or oolong tea, matcha, roselle calyces, baobab leaf powder, dried Gnetum leaves, or any other leaf/herbal product. No other regional name is assigned to this identity.

## Static picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent/punctuation folding, complete phrase matching before partial fallback, and reference plus form terms. Scientific names are not picker terms. This is a static projection, not a live UI test.

| Query | Current | With proposal |
|---|---:|---:|
| `kinkeliba`, `kinkéliba`, `dried kinkeliba leaves`, `kinkeliba leaves`, `feuilles de kinkéliba`, `feuilles de kinkéliba séchées` | 0 | 1: proposed leaf identity |
| *Combretum micranthum* | 0 | 0; scientific name stays research-only |
| `vrai kinkéliba`, `bush tea`, `kinkeliba tea`, `tisane de kinkéliba` | 0 | 0; intentionally unassigned to the dry leaf ingredient |
| `tea` | 3: black, green, and oolong tea | 3 |
| `thé` | 5: black tea, corn on the cob, green tea, matcha, oolong tea | 5 |

Broad `thé` currently includes the unrelated corn-on-the-cob result because accent folding maps it to the English word `the`. The proposal does not add `tea` or `thé`, so that existing projection is unchanged. The direct kinkeliba name queries resolve only to the proposed identity.

## Full manifest recipe audit

The manifest snapshot contains 114 recipe files, 1,123 ingredient rows, and 753,988 recipe-file bytes. Its fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`, computed in manifest order over each relative path, a NUL byte, exact file bytes, and a NUL byte.

The full files and ingredient-line fields were scanned for the candidate and boundary names, including the proposed English/French displays, `kinkeliba`, `kinkéliba`, `vrai kinkéliba`, `bush tea`, `kinkeliba tea`, `thé de kinkéliba`, `tisane de kinkéliba`, *Combretum micranthum*, `douté`, and `sekhaw`. There were zero candidate-related full-file hits and zero ingredient-row hits. The bundled recipes therefore provide no candidate-specific demand, measure, recipe link, or substitution context. No recipe edit or relink is proposed.

## Measurement and substitution review

Moussa et al.'s Dakar survey reports standardized infusion preparations based on separate household and vendor samples: 18 g dried leaves per 1 L water for the household method and 19.5 g per 1 L for the vendor method. The study interviewed 60 households and 60 vendors through non-probability sampling around Dakar markets. These are source-specific batch-recipe quantities; they are not a mass/volume measure of the dry leaf ingredient, density, serving-weight conversion, or broadly reusable preparation ratio. KAWĀLI's current product page separately suggests 3–4 leaves with 240 ml water, but does not define leaf size or give a weight; that direction is product-page-specific and cannot support count-to-mass mapping. Do not encode either recipe direction as a `MeasurementObservation`, unit mapping, default density, or runtime conversion; the current ledger schema has no ingredient-to-infusion batch-ratio relationship. Proposed ledger state: `measurementState: researched_no_supported_value`. If an integration records the study figures, preserve them as text in the source-scoped decision rationale with the Dakar/sample limitation, not as reusable numeric behavior.

No reviewed source establishes a general dry-leaf density, cup/spoon measure, leaf count weight, package yield, fresh-to-dried conversion, or tested substitute. The 30 g and 40 g retail pack sizes are listing-specific package weights, not kitchen measures. No generic black/green tea or other herb substitution is supported. Proposed ledger state: `substitutionResearchState: researched_no_supported_substitute`; add no substitution finding or active rule.

## Source register and URL ownership

Sources were checked on 2026-10-17. R509 source IDs are proposal-local until integration. Each source ID below is attached to exactly one URL; the existing ISO source is reused under its original ID.

| Source ID | Source and evidence | Limits and ownership |
|---|---|---|
| `WP06-AFRICA-KINKELIBA-R509-20261017-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Combretum micranthum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:170278-1/general-information). | Accepts the species and gives a West Tropical African native range. Taxonomy/range only; not culinary or Québec naming evidence. New, single URL. |
| `WP06-AFRICA-KINKELIBA-R509-20261017-S02` | PROTA / Pl@ntUse, [French *Combretum micranthum* account](https://plantuse.plantnet.org/fr/Combretum_micranthum_%28PROTA%29). | Lists French `vrai kinkéliba`, English `kinkeliba` and `bush tea`, West African distribution, and leaf-infusion/beverage use. The medicinal claims are not adopted. New, single URL. |
| `WP06-AFRICA-KINKELIBA-R509-20261017-S03` | Moussa, Diallo, Ndiaye & Sadji, “Évaluation des modes de préparation et de consommation de la tisane de kinkeliba et du café Touba consommés dans la ville de Dakar au Sénégal,” *African Journal of Food, Agriculture, Nutrition and Development* 17(4) (2017), pp. 12534–12546, DOI 10.18697/ajfand.80.15710, [journal-hosted PDF](https://www.ajfand.net/Volume17/No4/Moussa15710.pdf). | Primary food-use/preparation survey; identifies the leaf product and reports the source-specific standardized batch quantities cited above. Non-probability Dakar sample; does not establish a universal ratio or substitute. New, single URL. |
| `WP06-AFRICA-KINKELIBA-R509-20261017-S04` | Government of Canada, Translation Bureau, [TERMIUM Plus: KINKELIBA](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=1&index=frt&lang=eng&srchtxt=KINKELIBA). | Botanical entry associates *C. micranthum* with French `kinkéliba` and describes an infusion from dried leaves. English main entry is the Latin binomial, not an English culinary term. Federal terminology evidence, not an OQLF consumer-food ruling. New, single URL. |
| `WP06-AFRICA-KINKELIBA-R509-20261017-S05` | KAWĀLI, [Kinkeliba — Dried leaves 30 g](https://kawali-traditions.com/en/products/kinkeliba-feuilles-sechees-30g). | Montréal pickup listings, English product heading, species, leaf infusion, and a product-specific “3–4 leaves” / 240 ml instruction. Retail naming only; this is one listing, not market prevalence or a reusable measure. New, single URL. |
| `WP06-AFRICA-KINKELIBA-R509-20261017-S06` | Maad MTL, [KINKÉLIBA](https://maadmtl.com/fr-us/products/kinkeliba). | French Montréal retailer page names the product `Kinkéliba`, describes an infusion/decoction from the leaves, and lists Montréal/Gatineau points of sale. Product naming and leaf-use context only; page claims about health effects are not adopted. New, single URL. |
| `WP05-SECTION-V-OOLONG-TEA-R362-20261016-S01` (reuse existing) | ISO, [ISO 20715:2023 — Tea: Classification of tea types](https://www.iso.org/obp/ui?_escaped_fragment_=iso:std:iso:20715:ed-1:v1:en), §§1 and 3.14–3.17. | Supports keeping herbal infusions outside the *Camellia sinensis* tea-type classification. Already owns this URL in the R362 ledger record; do not create another source ID or URL entry. |

The direct source URL inventory above was checked against all 9,829 current ledger source entries. The six new URLs are unowned; the reused ISO URL retains its existing one-ID/one-URL owner. The global ledger source-ID→URL audit found zero IDs assigned to multiple URLs.

## Proposed ledger and integration boundary

If the coordinator accepts this recommendation, add one identity record for `ingredient-ref-kinkeliba-leaves` with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Add the six new source records S01–S06 and reuse the ISO record only if the tea-classification boundary is recorded. The decision can note the survey's two source-specific batch recipes but must state that they are not a reusable unit relation; add no `measurementObservations`, `unitConversions`, density, unit mappings, forms, yields, substitution findings, active rules, or recipe links. Keep the French display marked provisional until Québec terminology review.

**Integration status:** Integrated as an identity-only catalog entry and research-ledger record. The shared reference package now contains 1,786 references, and the generated Kotlin reference index is current. Seed-package/ledger validation and generated-index freshness checks passed. No software tests/build/emulator/deploy were run because the only application-data change adds database JSON, under `AGENTS.md`; see the [R509 integration README](../batches/wp06-african-kinkeliba-identity-integration-r509-20261017/README.md).

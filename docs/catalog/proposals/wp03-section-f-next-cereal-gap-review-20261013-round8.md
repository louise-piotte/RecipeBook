# WP03 Section F — maize arraw identity review (2026-10-13, round 8)

## Review record

- **Status:** Proposal only; root integration has not occurred.
- **Scope:** A distinct maize-based Senegalese *arraw* product, separate from the integrated millet *arraw* identity.
- **Open checklist:** The plan's “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” item remains open at [plan line 2259](../../RecipeBook-global-ingredient-catalog-plan.txt#L2352).
- **Recommendation:** Add identity-only `ingredient-ref-maize-arraw` as `arraw (corn granules) / arraw de maïs`. Add no aliases, forms, measures, density, mappings, observations, conversions, yields, recipe links, or substitution rules.

## Why this is a distinct open gap

The round-seven oats decision is integrated and unrelated. The integrated millet-*arraw* review explicitly says to keep maize *arraw* separate; it established `ingredient-ref-arraw` only for millet-derived granules. The plan repeats that boundary. Archive search found this exclusion but no focused maize-*arraw* review, proposal, ledger record, or batch. This round does not reopen millet *arraw*, rice or quinoa decisions, or the recently integrated oat work.

The current sources describe *arraw* as a product family that can use different plant bases. The candidate here is specifically maize based. CASA Industries' current cereal listing names `ARRAW DE MAÏS` separately from `ARRAW DE MIL`, as well as arraw products based on rice, cassava, fonio, banana, and potato. Do not generalize the proposed row to those products or make bare *arraw* an alias for a generic product family.

## Identity evidence and Québec French boundary

The IPAR Senegalese market study defines millet- or maize-based *arraw* separately from *thiéré*, *thiakry*, and the flour input *soungouf*: it describes *arraw* as small balls made by mixing the relevant millet or maize flour with water and rolling it. It identifies *fondé* and *lakh* as dishes made with *arraw*, not alternate ingredient names. The study also notes product-state variation across the wider rolled-grain market. Its account supports a maize-derived identity; it does not standardize one universal process, granule size, moisture state, or cooking behavior.

Current product evidence is consistent with that distinction. Manufacturer 2M Agroalimentaire calls a product `Arraw Maïs`, describes it as maize-based cereal ready to prepare as porridge, and identifies it as a distinct packaged item. CASA Industries lists maize arraw and millet arraw separately. Current Senegal retailer Sakanal separately lists `DIARRY ARRAW DE MAIS 400G`, `DIARRY ARRAW DE MIL 400G`, and `DIARRY BRISURE DE MAIS 400G`. Those listings support naming and product separation, not a standardized formula.

For Québec French, OQLF prefers *maïs* and gives Canadian English *corn*; it labels English *maize* as a United Kingdom term. OQLF does not define *arraw*. The proposed French display `arraw de maïs` is directly attested in Senegalese manufacturer and retailer naming and uses the Québec-preferred base word. It is a regional food name, not a claim that OQLF has approved the full compound or that a Québec maize-*arraw* retail label was located. The existing Montréal *granulés de mil (arraw)* listing is millet-specific and remains evidence only for that separate row. Do not add `arraw de blé d'Inde`, `corn arraw`, or `maize arraw` as aliases: no reviewed source uses those phrases as product labels.

Keep these identities distinct:

- Millet *arraw* remains `ingredient-ref-arraw`; millet flour / *soungouf* remains a flour input, not a form of *arraw*.
- *Thiéré* / millet couscous, *thiakry*, and *Sankhal* remain separate products. The study and current listings name them separately.
- Maize broken grain (`brisure de maïs`), cornmeal, corn flakes, corn poha, hominy corn, and hominy grits remain separate processed products.
- *Fondé* and *lakh* are prepared dishes, not *arraw* aliases.
- Other CASA-listed arraw variants (rice, cassava, fonio, banana, or potato) are outside this maize-only row.

## Exact proposed fields

| Field | Proposed value | Boundary |
|---|---|---|
| ID | `ingredient-ref-maize-arraw` | New identity for maize-based *arraw* only. |
| English display | `arraw (corn granules)` | Editorial English gloss following the existing millet-*arraw* display pattern; the source product wording is French. `corn` follows OQLF's English term for Canadian usage. |
| French display | `arraw de maïs` | Exact regional product wording; `maïs` has OQLF support as the base French term. The full food name is not an OQLF entry or a verified Québec retail label. |
| English aliases | `[]` | No reviewed English-language source attests an alternate product phrase. |
| French aliases | `[]` | The accentless retailer phrase `arraw de mais` normalizes to the display; no duplicate alias is needed. |
| Category | `GRAIN_AND_CEREAL` | A cereal-derived rolled-granule food. |
| Density / unit mappings | `null` / `[]` | No transferable volume-mass evidence. |
| Forms | None | Sources do not establish a uniform dry, fresh, frozen, or cooked state for this identity. |
| Recipe links | None | No bundled recipe demand. |

If root integrates a ledger record, the narrow proposed research states are `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. Do not create measurement observations or a substitution finding from the evidence summarized here.

## Current ownership and archive audit

The live audit covered 1,341 references, 98 forms and their match terms, 64 legacy candidates, all 1,650 research-ledger records, the current Section F checklist, and the archived proposals and batches.

| Surface | Current result |
|---|---|
| `ingredient-ref-arraw` | `arraw (millet granules) / granulés de mil (arraw)`; EN alias `millet arraw`; FR aliases `arraw de mil`, `arraw mil`; `GRAIN_AND_CEREAL`; null density; no unit mappings. It has no attached forms. |
| Maize-*arraw* candidate phrases | No exact normalized owner in active displays/aliases, form labels/match terms, or legacy candidates for `arraw de maïs`, `arraw de mais`, `arraw corn`, `corn arraw`, `maize arraw`, `arraw maize`, or `arraw (corn granules)`. |
| Nearby active products | Corn kernels, cornmeal, corn flakes, corn poha, hominy corn, and hominy grits have their own IDs and do not own a maize-*arraw* phrase. |
| Ledger | The only *arraw*-named ledger record is `ingredient-ref-arraw`; it documents the millet identity and explicitly preserves maize *arraw* as separate. No maize-*arraw* record exists. |
| Prior proposal/batch coverage | The integrated millet-*arraw* review and plan mention maize *arraw* only as an excluded boundary. No focused maize-*arraw* identity, alias, measure, or substitution decision was found. |
| Proposed ID | `ingredient-ref-maize-arraw` is absent from references, forms, legacy candidates, ledger record IDs, and archived documentation. |

## Picker projection

This is a static projection of the live data using the accent-folding normalizer and phrase-first / substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Reference aliases and form search terms were included. It is not runtime or emulator QA.

| Query | Current results | With proposed row | Decision |
|---|---|---|---|
| `arraw` | `ingredient-ref-arraw` | `ingredient-ref-arraw` — millet granules; `ingredient-ref-maize-arraw` — corn granules | Two distinct labeled choices; no bare `arraw` alias is added. |
| `arraw de maïs`; `arraw de mais` | None | `ingredient-ref-maize-arraw` only | Accent folding makes the accentless retailer spelling resolve to the French display. |
| `arraw corn`; `arraw (corn granules)` | None | `ingredient-ref-maize-arraw` only | The English display itself owns these ordered phrases. |
| `corn arraw`; `maize arraw`; `arraw maize` | None | None | No alternate English alias is source-attested. |
| `arraw de mil`; `arraw mil`; `millet arraw` | `ingredient-ref-arraw` only | Same millet row only | Existing millet terms remain attached to the millet product. |
| `corn` | 15 references, including corn kernels, cornmeal, corn flakes, corn poha, hominy corn, and other corn products | Same 15 plus `ingredient-ref-maize-arraw` (16 total) | Broad corn query adds one clearly qualified result. |
| `maïs` | 19 references | Same 19 plus `ingredient-ref-maize-arraw` (20 total) | Broad French corn query adds one qualified result. |
| `maize` | `ingredient-ref-corn-poha` | Same one result | No `maize` alias is added. |
| `sankhal`; `thiakry`; `thiéré`; `millet semolina` | Existing Sankhal, thiakry, thiéré, or Sankhal result as applicable | Unchanged | Adjacent millet products stay separate. |
| `cornmeal`; `corn flakes`; `hominy grits`; `maïs soufflé` | Their respective existing references | Unchanged | No grain processing or product-boundary collapse. |
| Explicit dry/cooked forms of maize arraw | No result | No result | No form is inferred. |

## Recipe-corpus demand

The whole-corpus scan parsed all **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and all string values in the serialized recipe JSON. It checked exact normalized phrases for *arraw*, `arraw de maïs` / `arraw de mais`, `arraw corn`, `corn arraw`, `maize arraw`, `arraw maize`, `arraw de mil`, `arraw mil`, `millet arraw`, `arraw de riz`, `arraw de manioc`, `arraw de fonio`, `arraw de patate`, `arraw de banane`, maize broken grain, and adjacent maize *thiakry* / *thiéré* / Sankhal phrases.

- **0 / 114 recipe files** contain any of those phrases.
- **0 / 1,123 ingredient rows** contain any of those phrases.
- No recipe links, quantities, forms, or recipe text should change.

External porridge uses in the regional sources establish culinary context; they are not demand from the bundled corpus.

## Measurements and substitutions, assessed separately

### Measurement and form limits

The sources provide product/package masses, not a household measure or conversion. Sakanal lists one 400 g retail item. The 2M page's product heading says `900g`, while its descriptive paragraph says 500 g; preserve that inconsistency as a source limitation rather than choosing either as a general product amount. Neither source provides a cup measure, recipe yield, serving count, measured granule bulk density, or paired dry/cooked weights. Do not create a package-weight observation, default measure, density, unit mapping, cooking yield, or volume conversion. Leave `defaultDensity: null` and `unitMappings: []`.

IPAR discusses fresh, dried, and frozen states for the wider range of secondary millet/maize products and describes *arraw* preparation from flour and water. That does not establish that all maize-*arraw* products share a particular state. Do not add dry, fresh, frozen, or cooked forms, or assume a uniform pre-cooking process from one manufacturer page.

### Substitution limits

None of the reviewed identity sources tests maize *arraw* as a replacement for cornmeal, corn grits, millet *arraw*, *thiakry*, or another ingredient. The fact that products are maize based or can be used for porridge is not a replacement instruction. Leave substitution research `not_yet_researched`; allocate no finding ID and add no global form conversion, contextual substitution rule, or recipe-line substitution link. This bounded review does not establish that no possible contextual substitute exists.

## Source register and ID-collision audit

The four new source IDs use prefix `WP03-MAIZE-ARRAW-R8-20261013-`. A search found zero occurrences of that prefix among the ledger's 5,293 distinct existing source IDs and zero occurrences in the proposal/batch archive's source-ID tokens. The exact 2M, CASA, Sakanal, and OQLF URLs below are absent from the live ledger and archived documents. Reuse the existing IPAR source ID rather than registering its URL again. The current Montréal millet-*arraw* source is also already registered; reuse it only for the narrow Québec millet-product boundary.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-MAIZE-ARRAW-R8-20261013-S01` | 2M Agroalimentaire, [Arraw Maïs](https://2m-agroalimentaire.com/arraw-mais), product title and description; checked 2026-10-13. | Manufacturer identifies maize-based cereal ready for porridge. Its product heading and description disagree on package size (900 g versus 500 g); neither number becomes a measure or general SKU amount. No ingredient list or standardized recipe is provided. |
| `WP03-MAIZE-ARRAW-R8-20261013-S02` | CASA Industries, [Céréales](https://casaindustries.sn/cereales/), current product list; checked 2026-10-13. | Manufacturer lists `ARRAW DE MAÏS` separately from `ARRAW DE MIL` and other plant-based arraw products. Product listing only; it does not provide a formula, granule specification, state, or measure. |
| `WP03-MAIZE-ARRAW-R8-20261013-S03` | Sakanal, [Produits locaux](https://sakanal.sn/fr/83-produits-locaux), current retail list, lines 733–764 and 1568–1595; checked 2026-10-13. | Current retailer separately lists DIARRY maize arraw, millet arraw, and maize broken grain. The listed 400 g amount is SKU/package mass only. |
| `WP03-MAIZE-ARRAW-R8-20261013-S04` | Office québécois de la langue française, [maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082788/mais); checked 2026-10-13. | Supports preferred French base term `maïs` and Canadian English `corn`; marks `maize` as United Kingdom usage. It does not define or approve the complete product name *arraw de maïs*. |
| Reuse `WP03-ARRAW-20261012-S04` | IPAR, [Analyse du marché des céréales locales (mil et maïs) au Sénégal](https://ipar.sn/wp-content/uploads/2024/08/Analyse-du-marche-des-cereales-locales-mil-et-mais-au-Senegal-Publie-le-27-janvier-2022.pdf), report pages 18–20. | Existing ledger source describes millet- or maize-based *arraw*, separately from *thiéré*, *thiakry*, *Sankal*, and *soungouf*. Reuse this entry; do not allocate a duplicate source ID or source URL. The report's data and process description are regional/study-specific, not a current universal product specification. |
| Reuse `WP03-ARRAW-20261012-S07` only for the boundary | Maad MTL, [Arraw (granulés de mil), 600 g](https://maadmtl.com/products/arraw-granules-de-mil); existing ledger source. | Montréal market evidence for the millet-specific French product wording only. It does not attest a Québec maize-*arraw* product. |

No new measurement observation ID or substitution finding ID is proposed. The proposed catalog ID and source IDs were checked for collision before drafting.

## Review-time baseline snapshot

Hashes are SHA-256 of exact file bytes. The recipe-corpus fingerprint hashes each manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte, in manifest order.

| Artifact | Review-time coverage | SHA-256 / fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,341 references; 429,818 bytes | `c59281b35053e251f419a57e82785dce2f09c2ae439238d5dfa37f8664d1163f` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,650 records; 6,301 source entries; 5,293 distinct source IDs; 341 measurement observations; 190 substitution findings; 6,271,366 bytes | `14a8d25a6303d08d88fb31a25ab127686873d607a36fe010745d03f909c4208d` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Disposition

**Recommend integrating one identity-only maize-*arraw* reference:** `ingredient-ref-maize-arraw`, `arraw (corn granules) / arraw de maïs`, in `GRAIN_AND_CEREAL`, with empty alias arrays, no forms, `defaultDensity: null`, and `unitMappings: []`. This closes a documented product boundary with current manufacturer and retail corroboration while keeping millet *arraw*, other cereal products, and other regional arraw variants distinct. The source evidence supports the identity and names independently of the numeric and substitution evidence; no transferable measure or substitution is established. This proposal-only review made no catalog, ledger, plan, checklist, roadmap, recipe, or application changes and ran no application or emulator tests.

## Root integration result

Integrated on 2026-10-13: added `ingredient-ref-maize-arraw` as an identity-only `GRAIN_AND_CEREAL` row with the proposed English/French displays, empty aliases, null density, and no unit mappings or forms. Added the four new sources and reused the existing IPAR source ID on its ledger record. Measurement research is `researched_no_supported_value`; substitution research remains `not_yet_researched`. No recipe links or active numeric behavior were added. Static package, generated-index, ledger, ownership/picker, recipe-corpus, and text checks passed. No app tests or emulator checks were run under the JSON-only database-data rule.

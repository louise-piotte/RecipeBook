# WP04 Section P R456 — lobster-claws product-identity review

- **Review and source-access date:** 2026-10-17.
- **Candidate:** the lobster claw cut sold as food, distinct from whole lobster, lobster tail, picked claw/knuckle meat, and crab claws.
- **Recommendation:** Add identity-only `lobster claws / pinces de homard` as `ingredient-ref-lobster-claws` in `PROTEIN`, with no aliases, forms, measures, conversions, yields, recipe links, or substitutions. Use the plural French display only. Keep the Metro SKU’s singular `pince de homard` wording as source evidence, not a search alias: under the current picker, that singular alias would make broad `pince` resolve to lobster claws alone and hide the existing crab-claws result.
- **Parent:** WP04 Section P remains open. This is a distinct cut-product review after the whole American-lobster identity and R452’s held lobster-tail boundary. It does not change the existing crab-claws identity.
- **Status:** Integrated on 2026-10-17; see [integration README](../batches/wp04-section-p-lobster-claws-identity-integration-r456-20261017/README.md).
- **Source IDs:** R456 S01–S05 are registered in the lobster-claws ledger record. Existing CFIA and MAPAQ source IDs are reused for their already represented URLs. Audit label: `WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-R01`.

## Why this is a distinct open product boundary

The active `ingredient-ref-lobster` row represents *Homarus americanus* as `American lobster / homard d’Amérique`; its aliases include broad `lobster / homard`. `ingredient-ref-european-lobster` is a separate species row. Neither has a claw form, and the earlier generic-lobster review expressly left claws, tail, meat, and paste out of aliases and forms. R452 separately reviewed American-lobster tail products and kept that cut unallocated because the phrase `lobster tail` collides with the Québec term for langouste. This review concerns the claw cut only and does not reopen that tail decision.

Québec’s MAPAQ crustacean sheet lists *Homarus americanus* product presentations including `Pinces et segments, partiellement ouverts` under frozen-raw and frozen-cooked headings, plus separate lobster-meat pack groups. CFIA’s Fish List pairs `Homarus americanus` with the Canadian common names `American Lobster / Homard Américain` and `Lobster / Homard`. These sources support a local lobster-claw product boundary and its Canadian context. They do not identify the species in every retailer SKU or establish one preparation state for all lobster claws. [Reused `WP04-LOBSTER-HOMARD-20261012-S07` and `WP04-LOBSTER-HOMARD-20261012-S01`]

OQLF’s crustaceology entry for `pince` defines it as a marketable anatomical part and lists lobster alongside snow crab, king crab, and other crabs. It supports the French cut noun and its crustacean scope, not a complete product name or recipe quantity. OQLF also has a separate homonymous entry for `pince de homard` meaning a limb deformity; that entry is not seafood terminology. Current Québec product wording supplies the food phrase `Pinces de homard`, so the proposal uses that plural as its French display and keeps the medical homonym out of the evidence chain. [S01, S03]

The cut must remain separate from picked claw/knuckle meat. The Montréal retailer La Mer lists `Lobster Meat (CK)` and describes shelled, frozen claw-and-knuckle meat, while Québec’s MAPAQ sheet also distinguishes shell-on claws/segments from lobster meat. Neither should be folded into the claw-cut identity. Keep lobster tails, whole lobster, lobster bodies, lobster meat, lobster paste, crab claws, crab legs, and imitation crab products distinct. [S05, reused `WP04-LOBSTER-HOMARD-20261012-S07`]

## Pre-integration ownership, archive, and allocation audit

This is the proposal-time snapshot, recorded before R455 and R456 were integrated. Its counts and hashes describe that baseline; the final R456 package counts are in the integration README.

The read-only snapshot before this proposal contains **1,742 ingredient references, 141 forms, 56 legacy candidates, and 2,101 research-ledger records**. The ledger has **9,564 source-entry occurrences, 8,113 distinct source IDs, and 6,826 distinct URLs**. The bundled manifest lists **114 recipe files and 1,123 structured ingredient rows**. Snapshot hashes:

| File | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `ebbac05ef2fba9098ef48eb3d201bcd49c1211ec283caca3c834817dda74302e` |
| `ingredient-forms.v1.json` | `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` |
| `legacy-import-identities.v1.json` | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | `4f1b33f941969e1a6ee7c0fa87354c573d46ce6f89bf7317908c6e8ccff0df32` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Normalized exact ownership was checked across reference names and aliases, form labels and match terms, legacy candidate names and aliases, ledger record IDs, proposal/batch archives, and source IDs. No exact owner exists for `lobster claws`, `lobster claw`, `pinces de homard`, or `pince de homard`; no reference/form/legacy/ledger owner exists for `ingredient-ref-lobster-claws`, `ingredient-form-lobster-claws`, or `candidate-lobster-claws`. The R456 proposal path and source-ID prefix were unallocated. The MAPAQ PDF URL is already in the ledger under lobster, crab-leg, and northern-shrimp evidence; reuse the lobster record’s existing `WP04-LOBSTER-HOMARD-20261012-S07` source ID for its lobster section. The CFIA Fish List URL is also already represented under `WP04-LOBSTER-HOMARD-20261012-S01`; reuse that ID for the same common-name boundary. Other proposed source URLs and new R456 IDs were not found in the current ledger.

| Current owner or nearby record | Existing boundary | R456 handling |
|---|---|---|
| `ingredient-ref-lobster` — `American lobster / homard d’Amérique` | *Homarus americanus* identity with broad `lobster` and `homard` aliases; no forms. | Keep the species identity and aliases unchanged; the cut is a separate product group. |
| `ingredient-ref-european-lobster` — `European lobster / homard européen` | Species-specific *Homarus gammarus* identity. | Keep separate; do not assign species to retail claw products unless the product source identifies it. |
| `ingredient-ref-crab-claws` — `crab claws / pinces de crabe` | Crab-specific anatomical-cut group, no aliases or forms. | Keep crab wording and identity unchanged. The broad picker terms `claw(s)` and `pince(s)` will remain multi-result after R456. |
| `ingredient-ref-crab` and its canned/Jumbo Lump forms | Crab meat and picked-meat presentations. | Do not map lobster claws or claw/knuckle meat to crab-meat forms. |
| R452 American-lobster-tail proposal and hold batch | Tail product remains unallocated because of the English/French `lobster tail`/langouste collision. | Preserve this hold; add no tail alias or tail form. |
| Prior generic-lobster review | Explicitly excludes claw products from the broad species identity’s aliases/forms. | Treat R456 as a cut-product identity review, not an expansion of the whole-lobster row. |
| Legacy candidates, other forms, and ledger records | No exact cut identity/form owner; prior product mentions and sources do not allocate a row. | Propose only `ingredient-ref-lobster-claws`; no legacy mapping or form ID. |

## Proposed bounded identity

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-lobster-claws` |
| Category | `PROTEIN` |
| English display | `lobster claws` |
| French display | `pinces de homard` |
| English aliases | none |
| French aliases | none |
| Scope | Edible lobster claw-cut products. Do not infer a species from listings that say only “lobster”; MAPAQ’s local product table is specifically for *Homarus americanus*. |
| Exclusions | Picked claw/knuckle meat, arms/legs sold with claws, lobster tails, whole lobster, lobster bodies, lobster paste, crab claws/legs, and imitation crab claw products. |

The source-backed singular seller wording `Lobster Claw / Pince de homard` is not added as an alias. The current search matches a complete phrase inside an alias before it falls back to partial substring matching. A singular `pince de homard` alias would therefore make query `pince` return only the hypothetical lobster row, even though `pince` currently returns the crab-claws row by substring. Keep the source phrase in the audit only; the proposed plural display preserves both exact plural cut searches and broad-query ambiguity.

## Picker projection

The projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): bilingual names and aliases are normalized, complete word phrases are preferred, and partial substring matching is used only if no complete phrase matches. The proposed row uses only the plural displays above.

| Query | Current result | With proposed row | Effect |
|---|---|---|---|
| `lobster claws` | none | `ingredient-ref-lobster-claws` | Exact product-group query becomes searchable. |
| `lobster claw` | none | `ingredient-ref-lobster-claws` | The current substring fallback finds this English singular inside the plural display. |
| `pinces de homard` | none | `ingredient-ref-lobster-claws` | Exact Québec French plural cut query becomes searchable. |
| `pince de homard` | none | none | Intentionally not indexed; adding this singular term would turn the broad `pince` query into a misleading singleton. |
| `lobster` / `homard` | American lobster and European lobster | American lobster, European lobster, and lobster claws | Broad queries remain multi-result. |
| `claw` / `claws` | crab claws for `claw` by fallback; crab claws for `claws` by phrase | crab claws and lobster claws | Broad cut noun remains ambiguous rather than selecting one crustacean. |
| `pince` / `pinces` | crab claws | crab claws and lobster claws | Broad French cut noun remains multi-result. |
| `crab claws` / `pinces de crabe` | crab claws | crab claws | Existing crab identity is unchanged. |
| `lobster tail`, `lobster meat`, `chair de homard`, `lobster claw meat` | none | none | Tail, meat, and picked claw/knuckle searches stay outside the proposed identity. |

## Bundled recipe demand

All **114 manifest-listed recipe JSON files and all 1,123 structured ingredient rows** were parsed. Full recipe JSON text and every ingredient row were scanned for `lobster claw(s)`, `lobster claws and arms`, `claw/knuckle lobster meat`, `pinces de homard`, `pince de homard`, `homard en pinces`, and related English/French cut wording. The scan found **zero matching files and zero matching ingredient rows**; no recipe line is linked to a lobster identity. The bundle supplies no recipe amount, species choice, claw state, serving role, or justification for a lobster-cut substitution. This is a complete-bundle finding only.

## Forms, measurements, yields, conversions, and substitutions

- **Forms:** Add none. MAPAQ lists both frozen-raw and frozen-cooked claw/segment products; Metro’s SKU is cooked/frozen; La Pantrée does not specify preparation state. These sources do not establish one universal form for the cut.
- **Measures and density:** Add no measurement observation, reusable count, density, unit mapping, or conversion. MAPAQ’s `4–6 oz / 6–9 oz` grades describe commercial claw/segment calibers; Metro’s approximately 300 g is one average-weight SKU; La Pantrée lists a 2 kg supplier package; Rock Harbour’s 454 g item combines claws and arms. None supplies a recipe portion, claw count per mass, volume conversion, or reusable product measure.
- **Yield:** Add no shelling, cooking, thawing, or meat-recovery yield. No reviewed source gives a general shell-to-meat ratio for lobster claws.
- **Substitutions:** Add no global or contextual rule between lobster claws and whole lobster, tails, lobster/claw-knuckle meat, crab claws, crab meat, or other seafood. The sources establish cut and product wording, not equivalent amounts, roles, or methods.
- **Ledger if accepted:** Create one `ingredient_reference` record for `ingredient-ref-lobster-claws`, with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Add no form record, package-yield record, conversion, recipe link, recipe-line substitution, or numeric behavior.

## Sources and limitations

New sources were accessed on 2026-10-17. External retail pages establish their own product titles and claims only. MAPAQ and CFIA support the Québec product context and Canadian species/name boundary, not the ingredients or taxon of every retail SKU.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S01** | Office québécois de la langue française, [`pince` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199041/pince), last updated 1998. | Defines `pince` as a marketable anatomical part and lists lobster, king crab, snow crab, and other crabs as principal species. It supports the cut noun only; it does not establish the full compound name, packaging, state, species of a SKU, or any culinary amount. The distinct GDT entry for `pince de homard` concerns a medical deformity and is deliberately not used as seafood-name evidence. |
| **WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S02** | Metro Québec, [`Pince de homard cuit surgelé`, item 226189](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/pince-de-homard-cuit-surgele/p/226189). | Current French indexed title and product number identify a Québec cooked/frozen lobster-claw listing; the current localized page redirects to English as `Frozen Cooked Lobster Claw` and shows an average 300 g. It was unavailable at the selected store when accessed. The page does not name a species or publish a reusable size/count/yield; the SKU’s average weight is not a recipe measure. |
| **WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S03** | La Pantrée, Thetford Mines, [`Poisson & Fruits de mer`](https://www.lapantree.ca/fr/la-viande/poisson-fruits-de-mer/), current inventory page. | Lists `Pinces de homard | 2kg` separately from `Chair de homard` and `Queues de homard`, supporting current Québec French product wording and distinct inventory groups. Availability may vary; the page does not identify species, preparation state, shell presentation, servings, or whether the 2 kg line is always stocked. It is not used for a measure or yield. |
| **WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S04** | J&F Seafood Corp. / Rock Harbour, [`Lobster Claws & Arms`](https://www.rockharbourseafood.ca/products/lobster), current Canadian product page. | Describes Canadian cooked/scored lobster claws and arms, lists ingredients as lobster, water, and salt, and displays a 454 g format. This is a combined claws-and-arms product with no species binomial, so it confirms a Canadian product family but does not broaden the proposed claw-only scope or support package measures. |
| **WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S05** | Poissonnerie La Mer (Montréal), [`Lobster Meat (CK) Frozen`](https://www.lamer.ca/en/products/chair-de-homard-ck-congelee), current product page. | Identifies Canadian frozen, shelled claw-and-knuckle meat, origin Nova Scotia, in one 454 g format. This is picked meat, not an intact claw product; its SKU format and description support the exclusion only and do not establish a claw measure, species binomial, or shelling yield. |
| **Reused `WP04-LOBSTER-HOMARD-20261012-S01`** | CFIA Fish List lookup, [`Homarus americanus`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). | Pairs *Homarus americanus* with accepted Canadian common names `American Lobster / Homard Américain` and `Lobster / Homard`. It is species/common-name evidence, not a claw-product standard; no species is inferred for a retailer SKU that does not identify it. |
| **Reused `WP04-LOBSTER-HOMARD-20261012-S07`** | MAPAQ, [`Les crustacés du Québec` (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf), American-lobster product section. | Places `Pinces et segments, partiellement ouverts` and separate claw/segment meat formats under the *Homarus americanus* Québec market section. Its commercial grades, pack sizes, and cooked-meat nutrition basis are not household amounts, recipe measures, or universal yields. No publication date is visible in the PDF. |
| **WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-R01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt), live references/forms/legacy candidates/research ledger, lobster and crab proposals/batches, `IngredientSearch.kt`, manifest, and all manifest-listed recipes. | Confirms the live snapshot, exact owners/allocations, picker projection, and complete 114-file / 1,123-row corpus scan. Repository evidence only; it does not extend the external sources’ claims. |

## Final disposition

**Accepted and integrated:** identity-only `lobster claws / pinces de homard` as `ingredient-ref-lobster-claws`, with no aliases. The Canadian product and MAPAQ evidence supports a cut-product group separate from whole lobster, tail, and picked meat; it does not assign a species to an unqualified retail product. The picker makes the plural English/French cut queries searchable and keeps broad `lobster / homard`, `claw(s)`, and `pince(s)` searches multi-result. The singular French retailer wording remains evidence-only because indexing it would make the broad `pince` query select lobster claws alone while suppressing crab claws. No forms, measures, recipe links, conversions, yields, or substitutions were added. The bundle has no matching demand. No software tests were run because this only adds database JSON data under the `AGENTS.md` rule. See the [integration README](../batches/wp04-section-p-lobster-claws-identity-integration-r456-20261017/README.md).

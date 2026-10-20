# WP04 Section P — Dungeness crab / crabe dormeur identity review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Species-identity review covering Québec naming, Canadian and Québec product evidence, exact ownership, picker projection, recipe demand, and source-scoped measurement/substitution findings.
- **Recommendation:** Integrate one identity-only `PROTEIN` reference for *Metacarcinus magister*: English **Dungeness crab**, Québec French **crabe dormeur**, with the French search aliases **crabe Dungeness** and **crabe de Dungeness**. Keep Latin names, broad `crab / crabe`, `Pacific crab / dormeur du Pacifique`, and crab-meat product phrases outside this row's aliases. Do not add product forms, density, unit mappings, active conversions/yields, recipe links, or substitution rules.
- **Scope:** A species identity only. This does not create a generic whole-crab row or a Dungeness-specific picked-meat identity.
- **Integration status:** Integrated on 2026-10-13 as an identity-only reference with two source-backed French phrase aliases. Source-specific retailer weights, serving portions, and whole-to-picked examples are retained in the ledger; no density, mapping, active yield, recipe link, or substitution rule was added.

## Why this is a distinct open Section P gap

The Section P parent remains open for crab and crayfish. The [generic-crab boundary review](wp04-section-p-generic-crab-identity-boundary-review-20261012.md) already mentions Dungeness crab as one species example and uses earlier market/fishery sources to explain why an unqualified `crab / crabe` row is too broad. That review does not assign a Dungeness reference, decide its bilingual display or aliases, inspect this species' current Québec product listing, or review Dungeness-specific picker impact, recipe demand, measures, and substitutions. This proposal addresses that separate species-level question and keeps the generic-crab hold intact.

Before drafting, the active references and aliases, forms and match terms, 64 legacy candidates, ledger records and source IDs, Section P checklist, proposal archive, and batch archive were searched. The only prior proposal/batch match is the generic-crab boundary review above. It treats Dungeness as a distinct example, not as an integrated identity or a separate Dungeness hold. No prior focused Dungeness proposal or integration batch was found.

## Bounded identity and product ownership

| Candidate ID | Category | English display | fr-CA display | English aliases | French aliases | Taxon |
|---|---|---|---|---|---|---|
| `ingredient-ref-dungeness-crab` | `PROTEIN` | **Dungeness crab** | **crabe dormeur** | None | **crabe Dungeness**; **crabe de Dungeness** | *Metacarcinus magister* (older name *Cancer magister*) |

The OQLF GDT entry identifies edible *Cancer magister*, gives **crabe dormeur** as the preferred Québec term, and pairs it with **Dungeness crab** in English. The current DFO species profile uses *Metacarcinus magister* and **crabe dormeur**. CFIA's Fish List gives the two scientific-name forms under the same TSN and marks the name transition as equally valid. Together these support one species identity, not two separate taxon rows. The Latin names remain evidence, not ingredient search aliases. [S01–S04; reused CFIA Fish List lookup noted below]

The French aliases are exact consumer-facing phrases in separate Canadian sources: a Montréal fishmonger uses **crabe Dungeness** for its live seasonal product, and Costco Canada's French consumer article calls it **crabe de Dungeness** parenthetically after **crabe dormeur**. The OQLF preferred term remains the display. These source-backed phrase aliases improve direct lookup without promoting bare `crabe` or making a generic claim about all crab. [S05, S08]

This row identifies the species. Retail listings separately show live crab, whole cooked in-shell crab, legs/clusters, and picked meat. Do not add those as global forms in this packet: they are different market product states, and there is no Dungeness recipe line to define the application's form boundaries. Do not alias `Dungeness crab meat` to this species row or relink the existing generic crab-meat line. [S05–S09]

Keep `Pacific crab` and `dormeur du Pacifique` out of aliases. CFIA lists them for the same species/TSN, but the selected Québec display is the OQLF-preferred **crabe dormeur**, and the reviewed local retailer uses Dungeness wording for its product. Do not add an unqualified `crab / crabe` alias or a separate generic whole-crab reference. The scientific names are not aliases.

## Prior-work and exact-ownership audit

The exact-key check followed [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD normalization, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. Active reference names/aliases, form labels/match terms, legacy candidate fields, and ledger record IDs/text were reviewed as separate ownership sources.

| Exact candidate key or ID | Active reference owner | Form owner | Legacy owner | Ledger record owner |
|---|---|---|---|---|
| `Dungeness crab` | None | None | None | None |
| `crabe dormeur` | None | None | None | None |
| `crabe Dungeness` | None | None | None | None |
| `crabe de Dungeness` | None | None | None | None |
| *Metacarcinus magister* / *Cancer magister* | None | None | None | None |
| `ingredient-ref-dungeness-crab` / `candidate-dungeness-crab` | None | None | None | None |
| `WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S01` through `-S10` | Not an ingredient key | Not applicable | Not applicable | Unallocated source IDs |

The live exact owners closest to this candidate remain:

| Existing record | Current owner | Boundary |
|---|---|---|
| `ingredient-ref-crab` | Displays `crab meat / chair de crabe`; no aliases; `PROTEIN` | Generic edible crab meat, with no species assignment. |
| `ingredient-form-crab-jumbo-lump` | Form under `ingredient-ref-crab`; label `jumbo lump crab meat / chair de crabe en gros morceaux (jumbo lump)` | Commercial grade of crab meat, not a species. Recipe 019#8 explicitly uses this form. |
| Separate whole-crab or Dungeness ledger candidate | None | The checklist's generic crab hold is not a species-specific Dungeness hold. |

The generic-crab proposal also searched `dungeness crab` and `crabe dormeur` as candidate terms, but found no exact active reference, form, or legacy owner and made no Dungeness allocation. No exact candidate ID or the new source-ID prefix appears in the current ledger, proposals, or batches. The reused CFIA lookup ID is not reissued below.

## Picker projection and alias boundary

This is a static projection of the active references and forms plus the proposed bilingual row and its two French aliases. It mirrors the phrase-first and substring-fallback behavior in `IngredientReferenceSearchIndex`; it is not an app test.

| Query | Current results | With the proposed row | Decision |
|---|---|---|---|
| `Dungeness crab` | None | Dungeness crab / crabe dormeur | English display match. |
| `crabe dormeur` | None | Dungeness crab / crabe dormeur | OQLF-preferred Québec display match. |
| `crabe Dungeness` | None | Dungeness crab / crabe dormeur | Exact local retailer phrase alias. |
| `crabe de Dungeness` | None | Dungeness crab / crabe dormeur | Exact Costco Canada French phrase alias. |
| `crab` | Crab meat / chair de crabe | Crab meat / chair de crabe; Dungeness crab / crabe dormeur | Exposes both the existing broad meat product and the named species. Do not add a bare `crab` alias. |
| `crabe` | Crab meat / chair de crabe | Crab meat / chair de crabe; Dungeness crab / crabe dormeur | Same two explicit choices; do not add a bare `crabe` alias. |
| `crab meat`, `chair de crabe`, `jumbo lump crab meat` | Crab meat / chair de crabe | Same existing crab-meat reference | Keep product identity and Jumbo Lump form separate from species identity. |
| `Dungeness crab meat` | None | None | No product-specific alias or row; do not infer a species-specific picked-meat identity. |
| *Metacarcinus magister*, *Cancer magister* | None | None | Scientific names establish identity but are not ordinary ingredient search terms. |
| `Pacific crab`, `dormeur du Pacifique` | None | None | Keep CFIA-listed alternatives inactive in the picker. |

The only broad-query change is that `crab` and `crabe` show one additional, clearly species-named option alongside the existing crab-meat result. This does not make Dungeness a generic crab synonym, and it does not alter the existing `crab meat`, `chair de crabe`, or Jumbo Lump match. The generic whole-crab row remains held as a separate unresolved boundary.

## Full bundled-recipe demand

The manifest-ordered corpus contains **114 recipe files and 1,123 ingredient rows**. All recipe JSON values and ingredient rows were scanned for `Dungeness`, `Dungeness crab`, `crabe dormeur`, `crabe Dungeness`, `crabe de Dungeness`, *Metacarcinus magister*, and *Cancer magister*.

**Result: zero candidate-term matches in the corpus and zero matching recipe files.** The nearby crab request is recipe 019#8: `1 lb jumbo lump crab meat`, already linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. It specifies crab meat and a grade, not Dungeness crab or any other species. Do not add a recipe link or relink the row. The recipe's Crab Balls title and ingredient group are prepared-dish labels, not further ingredient rows.

## Evidence dimensions kept separate

- **Identity:** Recommend one *Metacarcinus magister* reference in `PROTEIN`, with English `Dungeness crab` and Québec French `crabe dormeur`. *Cancer magister* is the older name for the same species, not another identity. [S01–S04]
- **Aliases:** Use only the two observed French phrase aliases `crabe Dungeness` and `crabe de Dungeness`; use no English aliases. Keep `Pacific crab`, `dormeur du Pacifique`, bare `crab / crabe`, Latin names, and `Dungeness crab meat` out of the aliases. [S01, S05, S08]
- **Forms/product states:** Do not add live, whole-cooked, shell-on, legs/clusters, or picked meat as active forms. Current listings show these distinct states but no recipe line defines a reusable form boundary. Keep generic crab meat and its Jumbo Lump grade intact. [S05–S09]
- **Measurements and yields:** Retailer estimates of `about 1.0 kg each` (T&T) and `about 2 lb` average whole crab (Caudle's) are individual product listings, not count-to-mass mappings. Oregon Commission advice reports an approximate 25% meat-to-shell ratio, a 2 lb whole crab yielding 1/2 lb picked meat, whole-cook 1 per serving, sections 1–2 per serving, and picked meat 1/4 lb per serving. Costco Canada's article reports 85 g as a nutrition serving, 907 g whole crab to 227 g meat for two, clusters at 227–340 g, and 2–3 clusters per person. These are source-scoped yield/portion observations, not a common household measure, default serving, or transferable active conversion. If the reference is integrated, retain observations with their source and product scope in the research ledger only; add no active conversion or package-yield record. [S06–S09]
- **Density and unit mappings:** No reviewed source measures a liquid volume or establishes a transferable density. Keep `defaultDensity: null` and `unitMappings: []`.
- **Substitutions:** Alaska Seafood Marketing Institute's 2012 leaflet says king, snow, or Dungeness crab can be used in the recipes included in that leaflet, while noting distinct flavor and texture. This is a limited recipe-set statement without a RecipeBook method, role, adjustment, or replacement ratio. Record it only as blocked pending recipe scope; do not add a global or contextual substitution rule. [S10]
- **Recipe links:** None. The full corpus has no Dungeness request; recipe 019#8 remains generic Jumbo Lump crab meat.

## Recommended integration delta

1. Add `ingredient-ref-dungeness-crab` as an identity-only `PROTEIN` reference: `nameEn: Dungeness crab`, `nameFr: crabe dormeur`, empty `aliasesEn`, and `aliasesFr: [crabe Dungeness, crabe de Dungeness]`.
2. Add a verified identity ledger record for *Metacarcinus magister*, citing the unique new source IDs below and the explicitly reused CFIA lookup. Keep `defaultDensity: null` and `unitMappings: []`.
3. Set measurement research to `researched_supported` only for the source-specific observations above; do not copy them into active catalog values. Set substitution research to `blocked_pending_evidence` and keep the source-scoped Alaska leaflet finding out of active rules.
4. Add no forms, recipe links, active measures, density, unit mappings, conversions, yields, package-yield record, or substitution rules. Keep `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump` unchanged, and do not create a generic whole-crab identity or a Dungeness picked-meat row.

## Sources and access limits

New source IDs use the prefix `WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2`; all ten were checked for exact-ID duplication against the live ledger, prior proposals, and batches before writing. Online sources were accessed on 2026-10-13.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S01** | Office québécois de la langue française, [GDT: crabe dormeur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198911/crabe-dormeur) | Gives preferred Québec term `crabe dormeur`, English `Dungeness crab`, and Latin *Cancer magister* in the edible-crustacean domain. Last updated 1998. Terminology/species-name evidence, not current supply. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S02** | Fisheries and Oceans Canada, [Dungeness crab species profile (French)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/dungeness-crab-crabe-dormeur-fra.html) | Current profile title pairs `Crabe dormeur` with *Metacarcinus magister*. Biological size/weight descriptions are not culinary portions or edible yield. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S03** | Fisheries and Oceans Canada, [Pacific crab-by-trap Integrated Fisheries Management Plan, 2026–2027 (French)](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-fra.html) | Current Pacific fishery source uses `crabe dormeur` and reports 2024 fishery context. Fishery scope does not establish nationwide consumer inventory or a recipe form. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S04** | CFIA, [Fish List and its naming purpose](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the list provides English/French common names and scientific names/TSNs for Canadian fish-product labeling. Naming guidance, not product approval, stock, or culinary equivalence. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S05** | Poissonnerie La Mer (Montréal), [Live Dungeness Crab product page](https://www.lamer.ca/en/products/crabe-dungeness-vivant) and [French crab collection](https://www.lamer.ca/en/collections/crabe) | The product image alt text says `Crabe Dungeness vivant`; the French collection says Dungeness crab is offered live in season. The page marked it `Hors saison / Sold out` at review. Supports local naming and seasonal product listing, not current stock or other product forms. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S06** | T&T listing through Instacart, [Live Dungeness Crab](https://www.instacart.ca/store/t-t/products/17887208-live-dungeness-crab-2-lb) | Current listing names live Dungeness crab, estimated at about 1.0 kg each and priced by kilogram. Store location and stock are marketplace-specific; the estimate is not a stable count/mass conversion or portion. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S07** | Caudle's Catch Seafood, [Whole Dungeness Crab](https://caudlescatchseafood.com/products/whole-dungeness-crab) | Lists whole cooked in-shell crab, average about 2 lb, product of Canada/USA; page says item is on backorder. This is one vendor's product description, not a general yield or current stock guarantee. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S08** | Costco Canada, [Crabes dormeurs](https://www.costco.ca/f/-/connection-fyt-dungeness-crabs-june-2023?langId=-25) | French article calls it `crabe dormeur (ou crabe de Dungeness)` and describes whole, legs-only, and cluster products, plus the listed source-specific portions/yield in the measurement section. Article URL dates to June 2023; consumer guidance and product availability are not current inventory or universal conversions. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S09** | Oregon Dungeness Crab Commission, [Cooking and serving](https://oregondungeness.org/cooking-and-serving/) | Reports approximate 25% meat-to-shell ratio, 2 lb whole to 1/2 lb picked, and serving guidance by whole-cooked, section, and picked-meat forms. Oregon consumer guidance is not a Québec portion rule or automatic active yield. |
| **WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S10** | Alaska Seafood Marketing Institute, [Alaska Crab & Easy Recipes (PDF)](https://www.alaskaseafood.org/wp-content/uploads/Crab_Leaflet_Final_0412.pdf) | States king, snow, or Dungeness crab can be used in the leaflet's own recipes while distinguishing flavor and texture. Published March 2012; Alaska marketing and recipe-set evidence only, without an adjustment or general substitution ratio. |

Reused prior source (not reissued as a new ID): `WP04-GENERIC-CRAB-20261012-S01`, CFIA [Fish List crab lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab), documented in the [generic-crab boundary proposal](wp04-section-p-generic-crab-identity-boundary-review-20261012.md). The lookup identifies TSN 98675 with *Cancer magister* and *Metacarcinus magister* as a scientific-name transition and includes Dungeness Crab / Crabe Dormeur among species-associated names. Its `Crab / Crabe` terms also occur across many taxa, so it supports keeping the species-specific row distinct from a generic crab claim. The result page was modified 2023-09-18.

## Review-time baseline snapshot and verification (before integration)

Counts and exact-byte SHA-256 hashes below describe the live worktree snapshot captured on **2026-10-13 before this proposal was written**. The recipe digest hashes each manifest-relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL in manifest order.

| Artifact | Count | Bytes | SHA-256 / digest |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,337 references | 428,373 | `c7bdd65a833d345292f6a480867267a72321cdce4f631018afb4040b9644c8ae` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,645 records; 6,206 source entries; 5,210 distinct source IDs | 6,169,335 | `f57a7dc26346beda9f850bc5f42a0da0c4c4385d8035c11c7113a1ab9e0c44ec` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `substitution-rules.v1.json` | 0 global rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 contextual rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `package-yields.v1.json` | 1 unrelated record | 853 | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |

Static review parsed the active references, forms, legacy candidates, ledger, manifest, recipe files, substitution files, and package-yield file; found no prior exact owner for the candidate names, ID, or new source IDs; reproduced the picker projection; and scanned all 114 recipe files and 1,123 ingredient rows with zero Dungeness-term hits. The only existing crab ingredient row found was recipe 019#8, still linked to generic crab meat and Jumbo Lump.

## Integration outcome

Added `ingredient-ref-dungeness-crab` with `Dungeness crab / crabe dormeur`, French aliases `crabe Dungeness` and `crabe de Dungeness`, and null active density/empty mappings. The ledger contains seven source-specific count, serving, and whole-to-picked observations, plus an ASMI recipe-scope substitution finding held as `blocked_pending_evidence`. Recipe 019#8 and the generic crab-meat identity/form are unchanged. Static package, generated-index, ledger, picker, ownership, recipe-corpus, UTF-8/no-BOM, and whitespace checks passed. No app tests or emulator checks were run because this update adds database JSON data only. See `docs/catalog/batches/wp02-wp03-wp04-proso-avalakki-dungeness-integration-20261013/README.md`.

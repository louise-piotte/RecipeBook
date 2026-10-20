# WP02 A6 round 12: Mabele / Amabele sorghum meal and flour boundary — 2026-10-13

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated as a ledger-only boundary hold. No active catalog, recipe, generated, or application file changed.
- **Owner:** WP02 A6 regional-grain-flour review. Root coordinator owns any shared-data integration.
- **Active checklist:** The broad A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours remains open at [the current plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278). The integrated round-eleven checkpoint confirms A6 remains open after Sajjalu; this review does not reopen any integrated alias or prior hold [current checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L11847).
- **Scope:** Decide whether South African regional names `mabele`, `amabele`, and flour-qualified variants can be allocated safely to the existing sorghum grain/flour identities. This review treats sorghum meal as a distinct unresolved product boundary; it does not propose a new meal identity or reopen A7.
- **Archive check:** Before drafting, the A6 checklist and proposal/batch archive through round eleven were reread. `mabele`, `amabele`, `mabela`, `mabele meal`, and `mabele flour` had no prior A6 review or active allocation. This is distinct from the integrated Guinea-corn and Jowar aliases, the held `milo flour` and `chaulai` terms, and the prior millet-grain/flour decisions.
- **Recommendation:** **Hold** `mabele`, `mabele meal`, `mabele flour`, `amabele`, `amabele flour`, and Canadian spelling `mabela` outside the active aliases in this A6 pass. Do not create a new reference, French name, form, or numeric behavior. Record the measured identity and picker risks in the existing sorghum and pearl-millet research records only if root chooses to integrate a ledger-only hold.
- **Proposal-local source IDs:** `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S01` through `S08`. Each was absent from the live ledger and catalog archive before drafting. No measurement-observation or substitution-finding ID is proposed.
- **A6 status:** Keep the broader checklist open. The `mabele meal` product question belongs in the separate A7 grain-meal review if resumed.

## Recommendation and evidence boundary

South African agricultural sources identify `mabele` and `amabele` with grain sorghum, *Sorghum bicolor*, and a government sorghum brochure says the whole grain is milled into flour [S01]. That supports the regional relationship at the crop level. It does **not** establish that each product called Mabele or Amabele is the same product class as the catalog's standardized sorghum flour.

The product evidence makes that distinction material. A South African government value-chain profile explicitly says **sorghum meal, also known as mabele**, is processed like maize meal through dry milling and used as a breakfast cereal [S02]. Research describes commercial Mabele as sorghum meal and distinguishes it from finer flour produced by remilling and sieving [S08]. Other research uses “Mabele Meal” as the name of a sorghum-based flour sample purchased in South Africa [S07]. Taken together, these sources show that the words can refer to a milled sorghum food product, but do not settle a consistent particle-size or regulatory boundary between meal and the existing `sorghum flour` row.

`Amabele` has a separate allocation problem: a South African government guide lists it among pearl-millet names, while government sorghum materials and a peer-reviewed regional survey also use it for sorghum [S01, S03–S04]. The survey explicitly pairs the same Zulu spelling with both pearl millet (*Pennisetum glaucum*) and sorghum (*Sorghum bicolor*). Do not choose one grain for the unqualified key and omit the other.

Current Canadian listings add useful market context but do not settle the alias. An Ontario retailer currently lists “Monati Super Mabela Porridge” in its Porridge & Cereals category; it uses the spelling **Mabela**, not `Mabele`, and the page itself does not give an ingredient declaration [S05]. A second Canadian store page calls a Monati product “Mabela Sorghum” but could not be retrieved from the web tool; its indexed title and summary are treated only as current Canadian-facing wording, not as a verified manufacturer statement [S06]. Neither is a Canadian or Québec label for “Mabele flour.”

**Hold all reviewed spellings for now.** A bare `mabele` alias on the grain row would cause a Mabele meal search to select whole grain sorghum; adding `mabele flour` to the flour row would claim that meal and standardized flour are interchangeable. The exact phrase `mabele meal` has no active catalog row. `Amabele` has overlapping crop usage, and no Québec source supplies a stable French display for any of these products. Do not translate the phrase mechanically as `farine de mabele` or `farine d’amabele`.

## Exact live ownership and fields

The live owner rows were checked after round-eleven integration. They remain:

| Reference | Current display and category | Current English aliases | Current French aliases | Active numeric/form fields |
|---|---|---|---|---|
| `ingredient-ref-grain-sorghum` | `grain sorghum / sorgho à graine`; `GRAIN_AND_CEREAL` | `jowar whole`, `guinea corn` | `sorgho en grains`, `sorgho en grain` | `defaultDensity: null`; `unitMappings: []`; no attached forms |
| `ingredient-ref-sorghum-flour` | `sorghum flour / farine de sorgho`; `FLOUR_AND_STARCH` | `jowar flour`, `jowar atta`, `guinea corn flour` | none | `defaultDensity: null`; `unitMappings: []`; no attached forms |
| `ingredient-ref-pearl-millet` | `pearl millet / millet perlé`; `GRAIN_AND_CEREAL` | `bajra`, `bajri`, `sajjalu` | none | `defaultDensity: null`; `unitMappings: []`; no attached forms |
| `ingredient-ref-pearl-millet-flour` | `pearl millet flour / farine de mil chandelle`; `FLOUR_AND_STARCH` | `bajra flour`, `bajri flour`, `sajjalu flour` | `farine de millet perlé` | `defaultDensity: null`; `unitMappings: []`; no attached forms |

No exact normalized owner exists for `mabele`, `mabele meal`, `mabele flour`, `amabele`, `amabele flour`, or `mabela` across active reference names/aliases, form IDs/labels/match terms, legacy-import candidate IDs/names/aliases, or research-ledger record IDs. The placeholder `ingredient-ref-sorghum-meal` is also unallocated and is **not** proposed as an A6 identity.

If root records this review in the ledger, preserve the existing row identities and add a source-backed **unresolved** decision only:

- On `ingredient-ref-grain-sorghum`, retain all current fields and document why bare `mabele` and `amabele` remain inactive.
- On `ingredient-ref-sorghum-flour`, retain all current fields and document why `mabele flour` and `amabele flour` remain inactive pending a meal/flour boundary and Québec term.
- On `ingredient-ref-pearl-millet`, retain all current fields and document the `amabele` cross-species collision.

Do not add any aliases, display changes, new reference or form IDs, recipe links, source-specific numeric observations, active measures, conversions, yields, or substitutions under this proposal.

## Exact normalized ownership and picker projection

The audit follows the app's current `normalizeIngredientSearchKey` and `IngredientReferenceSearchIndex`: lowercase, Unicode NFKD, accent/ligature folding, punctuation to spaces, then complete normalized word-phrase matching before substring fallback. The index includes names, aliases, and any attached form terms. The four target rows currently have no forms.

| Query | Normalized key | Current exact owner | Current picker result | Decision |
|---|---|---|---|---|
| `mabele` | `mabele` | none | no result | Hold; do not route a meal query to the grain row |
| `mabele meal` | `mabele meal` | none | no result | Hold; no active sorghum-meal owner exists |
| `mabele flour` | `mabele flour` | none | no result | Hold; the sources do not resolve meal versus standardized flour |
| `amabele` | `amabele` | none | no result | Hold; regional sources map the spelling to both pearl millet and sorghum |
| `amabele flour` | `amabele flour` | none | no result | Hold; no unique grain or Québec French product scope |
| `mabela` | `mabela` | none | no result | Do not normalize a Canadian product spelling into an unverified regional alias |
| `mabela porridge` | `mabela porridge` | none | no result | Retain as source-specific Canadian product wording |
| `grain sorghum` | `grain sorghum` | `ingredient-ref-grain-sorghum` | grain sorghum | Unchanged |
| `sorghum flour` | `sorghum flour` | `ingredient-ref-sorghum-flour` | sorghum flour | Unchanged |
| `pearl millet` | `pearl millet` | `ingredient-ref-pearl-millet` | pearl millet and pearl millet flour | Unchanged |

For clarity, these are the exact counterfactual picker results if the tempting aliases were activated; **they are not recommendations**:

| Counterfactual addition | Query | Result | Risk |
|---|---|---|---|
| `mabele` on sorghum grain | `mabele` | grain sorghum only | Would send users looking for the sourced Mabele meal product to an intact-grain identity |
| `mabele` on grain plus `mabele flour` on sorghum flour | `mabele` | grain sorghum and sorghum flour | Still omits the meal product and suggests a grain/flour selection instead |
| `mabele flour` on sorghum flour | `mabele flour` | sorghum flour only | Would overstate equivalence between variable meal products and standardized flour |
| `amabele` on either or both grain rows | `amabele` | one grain if allocated once; both grains if duplicated | A single allocation loses an attested sense; duplicate normalized ownership is not a safe catalog allocation |

The proposed projection is **no active owner and no result** for each candidate query listed above. It prevents a misleading singleton while the meal identity and term scope remain open.

## Identity, Québec French, and source-specific product boundaries

The source-grain mapping is not the main unresolved point for `mabele`: government and regional sources consistently connect it with *Sorghum bicolor* [S01–S02, S04]. The unresolved issue is what the picker should identify. Government classification and market sources distinguish grain, sorghum meal, grits, and flour as separate products; the 2020 value-chain report calls mabele a sorghum meal, while research describes fine and coarse product variants and remilling to finer flour [S02, S07–S08]. The A6 sorghum-flour identity therefore must not absorb `mabele` or `mabele meal` merely because each comes from sorghum.

For `amabele`, the cross-species source conflict prevents a stable, unique English owner. Do not duplicate the exact alias on both sorghum and pearl-millet rows, and do not choose either row based on capitalization or assumed language context.

The current Québec-facing product name remains `farine de sorgho`. OQLF's existing `sorgho` record and the current Québec listing `Farine de Sorgho` support retaining the established generic term; neither supplies `mabele` or `amabele` as a Québec food name [existing source `WP03-MILO-GRAIN-20261012-S01`; S07]. Do not add a French alias or alter any display. The page's 700 g size is package mass only.

## Measurement and substitution limits

Keep identity, numeric evidence, and substitutions separate.

- **Sorghum grain:** The live row has `defaultDensity: null`, no unit mappings, and no attached form. Its ledger includes CNF-code-specific observations of 100 mL = 81.2 g, 250 mL = 202.9 g, and one serving = 20 g for Health Canada's sorghum food code. These are grain-code observations, not Mabele meal values or conversions for a flour product. Do not transfer them.
- **Sorghum flour:** The live row has `defaultDensity: null`, no unit mappings, and no attached form. Its current ledger has one manufacturer-label observation for Westpoint Organic Sorghum Flour: 3 tbsp = 30 g. It is a named whole-grain flour serving with unspecified spoon fill/packing, not a density or meal conversion. The existing substitution finding is `blocked_pending_evidence`: the manufacturer gives qualitative use guidance but no replacement amount or tested ratio. Do not generalize either item to Mabele.
- **Pearl millet grain:** The live row has null default density, empty mappings, no form, and no measurement observations. Nothing from Mabele or Amabele sources supports adding a quantity.
- **Pearl millet flour:** The current ledger records a study-specific bulk density of 0.63 g/mL for a whole pearl-millet flour sample and one formula-specific blocked wheat-bread finding. Active density and unit mappings remain empty; the trial is not a reusable substitution ratio. Do not transfer either result to Amabele or sorghum products.
- **Mabele products:** Source descriptions do not give a transferable kitchen portion, measured bulk density, unit conversion, yield, or recipe-line quantity. Canadian `1 kg`/`2 kg` package sizes are package data, not household measures. Add no measurement observation, active conversion, form, or substitution rule.

Both active global and contextual substitution-rule JSON files contain zero rules. No source in this review supports a substitution involving Mabele, Amabele, sorghum flour, or pearl millet flour.

## Full recipe-corpus demand scan

The scan covered every recipe listed in the bundled manifest, the full serialized JSON for each file, every ingredient row, and direct links to the four live reference IDs. It checked `mabele`, `mabele meal`, `mabele flour`, `mabele thoro`, `amabele`, `amabele flour`, `mabela`, `mabela porridge`, `sorghum meal`, `sorghum flour`, the relevant French terms, and the target reference IDs.

- Manifest-listed recipe files scanned: **114**.
- Ingredient rows scanned: **1,123**.
- Recipe corpus bytes: **753,792**.
- Candidate phrase or target-ID hits: **0 files; 0 ingredient rows**.
- Direct links to grain sorghum, sorghum flour, pearl millet, or pearl millet flour: **0**.

No bundled recipe demand or recipe link is proposed. This is a coverage and boundary review, not a recipe-driven allocation.

## Source and identifier collision audit

The eight proposal-local source IDs below were checked against the live ledger's **5,340 distinct source IDs** and every current proposal/batch document before drafting; all eight had zero matches. They are proposal-local citations, not ledger records. Existing OQLF/Codex records are cited by their existing IDs and must not be registered again. No observation ID, substitution-finding ID, new ingredient ID, form ID, legacy candidate ID, or recipe-link ID is proposed; there is no numeric/finding identifier to collide.

| Source ID | Source and locator | What it supports / does not support |
|---|---|---|
| `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S01` | South African Department of Agriculture, Forestry and Fisheries, [Sorghum brochure](https://nda.gov.za/index.php/parliamentary-matters?download=1599%3Abrochure-sorghum&start=60), 2009, species/common-name and human-use sections. | Names grain sorghum, Mabele thoro, Amazinba, and Amabele; says whole grain is milled into flour. This is primary crop/use evidence, not a specification that mabele meal equals the catalog's flour grade. The direct PDF endpoint was not retrievable in the browser, so the source search record is retained as the locator. |
| `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S02` | South African Department of Agriculture, Land Reform and Rural Development, [A profile of the South African grain sorghum market value chain](https://old.dalrrd.gov.za/doaDev/sideMenu/Marketing/Annual%20Publications/Commodity%20Profiles/field%20crops/Grain%20Sorghum%20Market%20Value%20Chain%20Profile%202020.pdf), PDF pp. 5 and 14, especially lines 147–152 and 482–509 in the browser text view. | Government source says sorghum meal is also known as mabele, identifies it as a breakfast cereal, and describes its dry-milling process; it separately lists sorghum grits. Supports the meal/product boundary, not household measurements or equivalence to standardized sorghum flour. |
| `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S03` | South African Department of Agriculture, Forestry and Fisheries, [Production Guidelines: Indigenous Food Crops](https://old.dalrrd.gov.za/Portals/0/Brochures%20and%20Production%20guidelines/Production%20Guidelines%20Indigenous%20food%20crops.pdf), “Pearl millet (*Pennisetum glaucum*)” common-names section. | Government regional guide lists Amabele as a pearl-millet name and describes pearl millet products including ground flour. The page is agricultural guidance, not a Canadian label; it establishes a conflicting use of the exact spelling. The PDF endpoint timed out in the browser, so the source search record is retained as the locator. |
| `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S04` | Omotayo, Ndhlovu, Tshwene, and Aremu, [Utilization Pattern of Indigenous and Naturalized Plants among Some Selected Rural Households of North West Province, South Africa](https://doi.org/10.3390/plants9080953), *Plants* 9(8), 953 (2020), Table 2. | Peer-reviewed regional survey table maps Amabele to both pearl millet (*P. glaucum*) and sorghum (*S. bicolor*), and maps Mabele to sorghum. This supports the exact-key ambiguity; it is not a terminology standard. |
| `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S05` | Bokkies Biltong Inc., Barrie, Ontario, [Monati Super Mabela Porridge 2kg](https://www.bokkiesbiltong.com/products/monati-super-mabela-porridge-2kg), current product page checked 2026-10-13. | Canadian page shows “Mabela,” classifies it as “Porridge & Cereals,” lists it in stock, and processes orders in CAD. The page does not display an ingredient statement; it supports only this Canadian-facing product name/category, not an exact Mabele alias or composition. |
| `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S06` | South African Store Canada, [Monati Super Mabela Sorghum – 1 kg](https://southafricanstore.ca/products/monati-super-mabela-sorghum-1-kg), Canadian product listing indexed within the last two months. | Indexed product title/summary calls the item Mabela sorghum and a sorghum porridge/meal. The page returned a cache miss when opened; use as limited Canadian-facing wording only, not an independently verified current-stock or manufacturer-composition claim. |
| `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S07` | Mako Foods Exotik, Québec, [Farine de Sorgho (700 g)](https://www.makofoods.ca/products/farine-de-sorgho-700-g), current page checked 2026-10-13. | Québec retailer uses the existing generic French product name `Farine de Sorgho`; it does not use `mabele` or `amabele`. The listed 700 g is a package size, not a recipe measure. |
| `WP02-A6-MABELE-SORGHUM-BOUNDARY-20261013-R12-S08` | Wondimu et al., [Nutritional and Sensory Evaluation of Injera Prepared from Tef and *Eragrostis curvula* Flours with Sorghum Blends](https://pmc.ncbi.nlm.nih.gov/articles/PMC4951527/), *Journal of Food Research* (2016), “Plant materials.” | Researchers describe a locally purchased “sorghum-based flour Mabele Meal” used as a comparator. It supports that this phrase occurs for a particular South African sample; it does not define a universal particle-size class or a Canadian/Québec product name. |

Existing sources rechecked and cited without new IDs:

- **WP03-S22:** OQLF, [sorgho à graine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19001698/sorgho-a-graine), existing Québec display for grain sorghum.
- **WP02-S33:** Codex, [Norme pour la farine de sorgho (CXS 173-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B173-1989%2FCXS_173f.pdf), standardized sorghum-flour identity/French name.
- **WP03-S18:** OQLF, [millet perle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle), Québec pearl-millet grain display.
- **WP02-S34:** Codex, [Norme pour la farine de mil chandelle (CXS 170-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B170-1989%252FCXS_170f.pdf), standardized pearl-millet-flour identity/French name.
- **WP03-MILO-GRAIN-20261012-S01:** OQLF, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho), existing Québec generic sorghum wording; it does not supply a Mabele French name.

## Baseline snapshot

Captured from the shared working tree on 2026-10-13 after root integrated round eleven and before this proposal was written. Hashes cover exact file bytes. The recipe fingerprint uses manifest order and hashes each relative recipe path, a NUL byte, file bytes, and a trailing NUL byte.

| Surface | Current snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active plan | 936,362 bytes; A6 parent remains open | `d1844d8d42d8852d08cc6c2049d281f3369437955a6cb8574a9d157280b0a773` |
| Ingredient references | 1,343 rows; 430,576 bytes | `43c02ea1acdf0ff3cc2e47a6ac28a634f7fd08488e5a40b52b063d4663ff9a05` |
| Ingredient forms | 98 rows; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy-import candidates | 64 rows; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,654 records; 6,363 source occurrences; 5,340 distinct source IDs; 342 observations; 192 substitution findings; 6,330,103 bytes | `0c371c92e0ac81492d2f65020dd59235ee63f2b42f9c02e692cc0497958e5c22` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,343 references; 588,994 bytes | `34ba41f3731379d77c00cddf0e9d46356741f23097d4c7f4ca148a0fb35348d0` |
| Global substitution rules | 0 rules; 3 bytes | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitution rules | 0 rules; 3 bytes | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |

## Static review checks

Static review reproduced picker queries from the current JSON terms and `IngredientSearch.kt`, scanned reference/form/legacy/ledger exact ownership, checked source-ID uniqueness against the live ledger and archive, inspected source-scoped numeric/substitution records, and scanned the full manifest-listed recipe corpus. No app, unit, instrumentation, emulator, or application tests were run; this is a proposal-only review.

## Root integration result

Integrated by root on 2026-10-13 as unresolved, source-backed boundary decisions on `ingredient-ref-grain-sorghum`, `ingredient-ref-sorghum-flour`, and `ingredient-ref-pearl-millet`. Added the reviewed source records to those existing ledger rows only; all current displays, aliases, states, observations, findings, forms, measurements, recipe links, and substitution behavior remain unchanged. No new ingredient or form identity was created. The active A6 parent remains open. No app or emulator tests were run because this integration only adds research-ledger JSON data and documentation under the updated workspace rule.

# WP04 Section P R480 — lobster-meat product boundary review

- **Review and source-access date:** 2026-10-17.
- **Checklist:** Open WP04 Section P seafood coverage ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6172)); the Section P parent remains open.
- **Candidate:** shelled lobster meat / chair de homard, including one current cooked-frozen market presentation.
- **Recommendation:** Add an identity-only, species-neutral `PROTEIN` reference, `lobster meat / chair de homard`, with no aliases, and add one `cooked_frozen` form, `cooked frozen lobster meat / chair de homard cuite surgelée`. Keep this edible-meat product separate from whole American and European lobster, intact claws, the held lobster-tail cut, lobster paste, tomalley, roe, and imitation products.
- **Proposal-only status:** This file is the only proposed change. Root alone merges catalog, ledger, checklist, roadmap, manifest, or generated files. No tests, build, emulator, or deployment were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-LOBSTER-MEAT-R480-20261017-S01` through `S03`; audit label `WP04-SECTIONP-LOBSTER-MEAT-R480-20261017-R01`. Previously registered sources retain their existing IDs.

## Why this is a distinct, still-open boundary

The active American-lobster reference identifies *Homarus americanus* and owns the Canadian aliases `lobster / homard`; a separate reference identifies European lobster. The accepted generic-lobster review deliberately did not put `lobster meat` on the American-lobster row, and R452 and R456 kept meat outside their separate tail and intact-claw decisions. Those reviews named picked meat as a neighboring product, but none allocated a meat identity or form. R480 advances that separate boundary using current Québec retail and inventory evidence; it does not revise the American-lobster species row or the tail hold.

Current Québec-facing product listings distinguish edible meat from in-shell claws and tails. La Pantrée’s seafood inventory separately lists `Chair de homard`, `Pinces de homard`, and `Queues de homard`. Montréal fishmonger La Mer lists `Lobster Meat (CK) Frozen` and describes shelled claw-and-knuckle meat. Metro Québec lists a cooked-frozen Sogel item in French and English under product number **067534003402**; its ingredient panel identifies lobster meat, *Homarus americanus*, water, salt, and sodium tripolyphosphate. A separate Atlantic Star Metro listing uses `Cooked, Frozen Lobster Meat`. These sources support an edible-meat product identity and one cooked-frozen presentation. They do not support transferring a species, cut, formula, package amount, or preparation state to every lobster-meat item.

The current Canadian Standards of Identity, Volume 3, treats lobster meat as a product distinct from tomalley, lobster paste, and lobster cocktail. It excludes stomach, intestinal tract, gills, cartilage, shell particles, liver, and roe from lobster meat, and distinguishes cooked frozen from cooked unfrozen lobster meat. That supports the proposed product boundary and single form; it does not assign the candidate’s generic identity to one species or provide kitchen measures.

## Proposed bounded catalog delta

Add this reference:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-lobster-meat` |
| Category | `PROTEIN` |
| English display | `lobster meat` |
| French display | `chair de homard` |
| Aliases | None in either language |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Scope | Shelled, edible lobster meat as a commercial ingredient group, with no species or specific cut assigned |

Add one form under that reference:

| Field | Proposed value |
|---|---|
| ID | `ingredient-form-lobster-meat-cooked-frozen` |
| `formCode` / `prepState` | `cooked_frozen` / `cooked_frozen` |
| English label | `cooked frozen lobster meat` |
| French label | `chair de homard cuite surgelée` |
| Match terms | None; the paired display labels cover the reviewed phrases |
| Form density | `null` |

Do not add the product-specific Sogel species as an alias or species assignment for the generic meat identity. Do not add `lobster claw meat`, `claw and knuckle meat`, `American lobster meat`, or `European lobster meat` as aliases: those phrases either specify a cut or a species not shared by all reviewed listings. Keep lobster paste, tomalley, lobster cocktail, lobster spread, roe, and imitation lobster products as separate or unallocated products. Do not attach the new form to `ingredient-ref-lobster`; shell-free meat is the distinct product identity under review.

If accepted, create one research-ledger `ingredient_reference` record for `ingredient-ref-lobster-meat` with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Register S01–S03, reuse the source IDs listed below, and add no measurement observations or recipe-line links.

## Live ownership, source allocation, and archive audit

The workspace snapshot on 2026-10-17 contains **1,757 ingredient references**, **142 forms**, **56 legacy-import candidates**, and **2,116 research-ledger records** with **9,648 source entries**, **8,190 distinct source IDs**, and **6,903 distinct source URLs**. The bundled manifest lists **114 recipe files and 1,123 structured ingredient rows**.

| Surface | Current owner or overlap | R480 disposition |
|---|---|---|
| Active references | `ingredient-ref-lobster` is American lobster / homard d’Amérique; `ingredient-ref-european-lobster` is European lobster / homard européen; `ingredient-ref-lobster-claws` is lobster claws / pinces de homard. No active reference name or alias exactly owns `lobster meat` or `chair de homard`. | Add the separate meat-product reference. Keep all three existing identities unchanged. |
| Active forms | The lobster rows have no forms. No form label or match term exactly owns lobster-meat, chair-de-homard, cooked-frozen, or the proposed form ID. The workspace contains 142 forms. | Add only the cooked-frozen presentation under the meat-product identity. |
| Legacy candidates | Exact normalized-name and candidate-ID checks across all 56 candidates found no lobster-meat owner. | Add no legacy mapping. |
| Research ledger | `ingredient-ref-lobster-meat` and `candidate-lobster-meat` are unallocated. The phrases appear in adjacent lobster reviews as excluded-product wording, but there is no meat record or accepted decision. | Create only the proposed reference record if accepted; do not change the American-lobster record. |
| Numeric and substitution data | The package-yield file has one unrelated record; global and contextual substitution-rule files have no lobster entries. No lobster-meat form, mapping, density, or conversion is present. | Add no measure, density, mapping, package yield, conversion, or substitution. |
| Proposal and batch archive | The generic-lobster review, R452 tail review, and R456 claws review mention meat only as a distinct excluded product. No proposal or integration allocates lobster meat. R477 concerns smoked Greenland halibut and is unrelated. | Treat R480 as a new product boundary, not a reopening of prior decisions. |
| Proposed IDs and path | The R480 reference ID, form ID, candidate ID, source-ID prefix, and proposal path were checked against active data, ledger IDs, and proposal/batch archives; no exact allocation exists. | Keep all R480 IDs proposal-local until root review. |

The new Metro French and English Sogel URLs have no exact ledger URL owner. Their S01 and S02 IDs and the S03 source-ID prefix have no collision in the ledger or proposal/batch archive. Reuse existing source registrations for URLs already represented: La Pantrée under `WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S03`; La Mer under `WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S05`; and MAPAQ under `WP04-LOBSTER-HOMARD-20261012-S07`. The CFIA standard URL is already represented by `WP04-FRESH-SCALLOP-IDENTITY-20261012-S04` (sections 10–11) and `WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S05` (section 14). Reuse the former source ID with a new section 3 locator; do not mint another ID or URL registration for that CFIA page. [R01]

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the picker prefers complete normalized word phrases across reference names, aliases, and attached forms, then uses substring matching only when no phrase result exists. The proposal adds a standalone meat-product row with one attached bilingual form and no aliases.

| Query | Current result | With proposed delta | Effect |
|---|---|---|---|
| `lobster meat`; `chair de homard` | None | `lobster meat / chair de homard` | The plain edible-meat ingredient becomes searchable. |
| `cooked frozen lobster meat`; `chair de homard cuite surgelée` | None | `lobster meat / chair de homard`, with the cooked-frozen form hint on the exact form phrase | The current Québec product state is searchable without adding a second identity. |
| `lobster`; `homard` | American lobster, European lobster, and lobster claws | Those same three results plus lobster meat | Broad queries remain multiple-result searches. |
| `American lobster`; `homard d’Amérique` | American lobster | Unchanged | No species wording is assigned to the meat-product row. |
| `European lobster`; `homard européen` | European lobster | Unchanged | The species identity remains separate. |
| `lobster claws`; `pinces de homard` | Lobster claws | Unchanged | Intact claws remain distinct from shelled meat. |
| `lobster tail`; `queue de homard` | None | None | The held tail boundary is unaffected. |
| `lobster paste`; `pâté de homard`; `imitation lobster meat` | None | None | No paste, spread, tomalley, roe, or imitation terms are added. |

The generic `lobster` / `homard` query gains one clearly named product result beside the two species identities and intact claws. No new singleton is created for a species, cut, or tail query.

## Bundled recipe scan

The manifest-ordered audit parsed all **114 recipe files and 1,123 structured ingredient rows**. It scanned complete decoded recipe JSON and every ingredient row for `lobster meat`, `chair de homard`, `cooked frozen lobster meat`, `frozen cooked lobster meat`, `chair de homard cuite surgelée`, lobster/claw/knuckle wording, and adjacent American/European lobster and tail phrases. It found **zero matching recipe files and zero matching ingredient rows**. The manifest-ordered corpus is **753,988 bytes**, with digest `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` using each manifest-relative recipe path, a NUL separator, exact file bytes, and a trailing NUL. The bundled recipes provide no lobster-meat ingredient link, amount, preparation state, or replacement context. [R01]

## Numeric, form, and substitution boundaries

- **Form:** Add only the source-attested cooked-frozen presentation under the separate meat-product identity. Do not add generic raw, fresh, canned, thawed, or drained forms. Do not imply that every lobster meat item is cooked or frozen.
- **Package amounts:** Metro’s Sogel listing reports 320 g, its separate Atlantic Star listing reports 150 g, La Mer lists one 454 g CK package, and La Pantrée lists 6 × 300 g. These are product-specific formats; they are not recipe portions, household measures, edible yields, count-to-mass conversions, or interchangeable package yields. La Mer’s CK wording identifies its product’s claw-and-knuckle cut only.
- **Other numeric data:** Add no measurement observation, active measure, default or form density, unit mapping, volume conversion, serving size, cooking/freezing loss, thawing yield, or package-yield record. The CFIA storage temperatures are product-standard requirements, not conversion data.
- **Species and product states:** Sogel’s ingredient declaration identifies *H. americanus* for that SKU only. Do not assign it to the generic meat reference or to every product. Do not imply a species for La Pantrée’s inventory or for La Mer’s listing.
- **Substitutions:** Add no global or contextual rule among lobster meat, whole American or European lobster, intact claws, held tails, crab meat, langouste, lobster paste, or imitation lobster products. The sources establish product names and presentation boundaries, not equivalent dish roles, amounts, or method behavior. The bundled corpus contains no substitution context.

## Source register and evidence limits

New sources were accessed on **2026-10-17**. The Metro pages are two locales for one Sogel product number; they are not independent products. The Atlantic Star page is a second SKU from the same retailer. Store stock, prices, and package sizes can change. Previously registered sources are reused by their existing IDs rather than duplicated.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-LOBSTER-MEAT-R480-20261017-S01** | Metro Québec, [Sogel — Chair de homard cuite surgelée, product 067534003402](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/chair-de-homard-cuite-surgelee/p/067534003402). The current French listing shows 320 g and an ingredient panel naming chair de homard (*Homarus americanus*), water, salt, and sodium tripolyphosphate. | One Sogel SKU. It showed out of stock at the selected store when reviewed. Its species declaration is not transferred to all lobster-meat products; 320 g is a package size, not a recipe measure. |
| **WP04-SECTIONP-LOBSTER-MEAT-R480-20261017-S02** | Metro, [Sogel — Frozen Cooked Lobtser Meat, product 067534003402](https://api.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/shrimp-seafood/frozen-cooked-lobtser-meat/p/067534003402). Same product number and ingredient panel as S01; the English title labels the item frozen and cooked. | The retailer page title misspells “Lobster” as “Lobtser”; do not copy the typo into display text or match terms. Paired locale page for S01, not independent product evidence. |
| **WP04-SECTIONP-LOBSTER-MEAT-R480-20261017-S03** | Metro, [Atlantic Star — Cooked, Frozen Lobster Meat, product 676804013203](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/burgers-sticks/cooked-frozen-lobster-meat/p/676804013203). The current English product title supports the clean English form wording; the listing says Product of Canada, shows a 150 g package, and lists lobster, water, and salt. | A second Metro brand/SKU, not an independent retailer; it does not state a scientific species or a reusable amount. Stock depends on the selected store. |
| **Reused `WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S03`** | La Pantrée, [Poisson & Fruits de mer inventory](https://www.lapantree.ca/fr/la-viande/poisson-fruits-de-mer/). Lists `Chair de homard` separately from `Pinces de homard` and `Queues de homard`. | Availability varies; no species, state, servings, or transferable package yield is specified. Its listing corroborates the French product grouping only. |
| **Reused `WP04-SECTIONP-LOBSTER-CLAWS-R456-20261017-S05`** | Poissonnerie La Mer (Montréal), [Lobster Meat (CK) Frozen](https://www.lamer.ca/en/products/chair-de-homard-ck-congelee). Describes Canadian shelled frozen claw-and-knuckle meat from Nova Scotia and a 454 g format. | This product’s cut, origin, and format are SKU-specific; it does not establish the species or cut for the generic identity. |
| **Reused `WP04-LOBSTER-HOMARD-20261012-S07`** | MAPAQ, [Les crustacés du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf), American-lobster section. Lists meat formats separately from shell-on claws/segments and tails. | Québec industry-presentation context; processor formats and nutrition data are not kitchen measures, yields, or evidence for assigning a species to generic retail meat. |
| **Reused `WP04-FRESH-SCALLOP-IDENTITY-20261012-S04`** | CFIA, [Canadian Standards of Identity: Volume 3 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-3), amended 2024-12-18, section 3. Defines lobster meat’s excluded parts and separates cooked frozen from cooked unfrozen product. | Current incorporated product standard, not a Québec retail inventory survey, species assignment, consumer measure, or culinary substitution source. Reuse the registered URL and source ID with a section 3 locator. |
| **WP04-SECTIONP-LOBSTER-MEAT-R480-20261017-R01** | Read-only audit of WP04 Section P, live references/forms, legacy candidates, ledger/source ownership, package yields, global/contextual substitution files, lobster proposals and batch archive, picker behavior, and all manifest-listed recipes. | Repository-snapshot and recipe-corpus audit only; it adds no external product claim. |

## Disposition

**Recommend adding** `lobster meat / chair de homard` as a species-neutral `PROTEIN` identity with one `cooked frozen lobster meat / chair de homard cuite surgelée` form. Current Québec retailer pages and inventory separate shelled meat from claws and tails, and the current CFIA standard defines lobster meat separately from lobster paste and tomalley. Keep the Sogel SKU’s *H. americanus* ingredient declaration, all package amounts, and all cut details source-specific. Add no aliases, other forms, measures, mappings, conversions, yields, recipe links, or substitutions. Section P remains open.

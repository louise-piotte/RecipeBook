# WP04 Section P — European green crab / crabe vert food-product boundary

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Review of one regional crab identity and its current Canadian food-product boundary, including Québec naming, exact catalog ownership, picker projection, recipe demand, product forms, measurements, and substitution evidence.
- **Disposition:** Keep European green crab / `crabe vert` outside the active ingredient picker and research ledger for now. The species and Québec name are well supported, but current DFO food-use evidence is a conditional test case seeking interested parties, not an established retail or ready-to-cook product with a defined edible form.
- **Integration:** Accepted as a documentation-only hold by the catalog integration lead on 2026-10-13 after an independent source recheck. The plan checklist, roadmap, and batch README now record the decision.
- **Database scope:** No catalog JSON, ledger, generated file, recipe, or application code changed. No tests or emulator checks were run.

## Decision

The candidate is the species *Carcinus maenas*, named `crabe vert` in a Québec aquatic invasive-species identification guide and `European green crab` in federal English. Fisheries and Oceans Canada (DFO) also uses French `crabe européen` as an alternate name. DFO documents the species in Québec waters, including the Magdalen Islands, and distinguishes it from native rock crab and Jonah crab. The name and taxonomic boundary are therefore sufficiently clear for a species identity.

Do not create an active food-ingredient reference from that identity evidence alone. DFO's December 2025 New Brunswick announcement describes a controlled one-year commercial fishery pilot aimed at invasive-species control and lists bait, bioplastics, and soil enrichment among potential uses. A September 2026 Newfoundland and Labrador notice seeks expressions of interest for a separate test case involving frozen or crushed green crab for compost, shell derivatives, or food items for animals or humans. The notice says temporary licences would be provided only if there were sufficient interest and that licence details would follow. Its September 25 response deadline has passed, but the notice itself does not report a result, a permitted consumer-food product, a processor specification, or a current retail package.

This is a product-boundary hold, not a claim that the species is inedible or that any food use is prohibited. The reviewed official sources establish invasive-species control and possible future food use; they do not establish a current, identifiable Canadian human-food ingredient that the app should present as a selectable cooking ingredient. Keep the Section P shellfish and regional-seafood checklist open.

## Root integration result

The catalog integration lead independently reopened the Québec identification guide and the DFO Newfoundland and Labrador Public Notice PN26.008. The Québec guide directly pairs `Crabe vert`, *Carcinus maenas*, and `European green crab`. DFO's September 8, 2026 notice asks for expressions of interest in frozen and/or crushed green crab for composting, shell derivatives, or animal/human food; temporary control licences would be offered only if interest were sufficient, with later details to follow. The notice has no result, product specification, or consumer-market listing. The DFO 2026 Public Notices index still lists PN26.008 and contains no separate public result notice for the test case. The separate December 2025 New Brunswick pilot announcement identifies bait, bioplastics, and soil enrichment as potential uses. These sources support keeping the species outside the active picker until a defined human-food product is documented.

The hold is recorded in the Section P checklist, roadmap, and batch README. At the hold integration checkpoint, the snapshot had 1,382 references, 100 forms, 63 legacy candidates, and 1,713 ledger records. The current package has 1,383 references and 1,714 ledger records after a separate rye-bran identity was integrated; no green-crab reference, alias, form, ledger candidate, recipe link, measurement, yield, conversion, or substitution was added. This was a documentation-only change, so no app tests or emulator checks were run.

| Conditional future identity, if a defined human-food product is established | Candidate |
|---|---|
| Reference ID | `ingredient-ref-green-crab` — not allocated |
| Category | `PROTEIN`, if later approved as a human-food ingredient |
| English display | `European green crab` |
| Québec French display | `crabe vert` |
| Taxon | *Carcinus maenas* |
| Source-attested alternate search terms | `green crab`; `crabe européen` — not allocated as aliases |

Do not add a ledger candidate, legacy-import candidate, alias, form, density, unit mapping, conversion, yield, recipe link, or substitution rule in this proposal.

## Why this is a distinct open gap

The current Section P checklist remains open for “Mussel, clam, oyster, cockle, and remaining shellfish identities” and for regional fish and seafood. A focused search of the Section P plan, proposals, batch notes, active references and forms, legacy identities, and research ledger found no earlier European green crab, `crabe vert`, *Carcinus maenas*, or food-product-boundary review or allocation. This review does not reopen the existing generic crab-meat identity, blue crab, Dungeness crab, Jonah crab, imitation crab, or any earlier crab-picker decision.

The reviewed names point to a distinct species, but name clarity does not resolve whether the current invasive-species removal and processing initiatives yield a stable human-food product. The distinction is material to the picker: an active row would present the species as an ordinary ingredient even though the latest official food-use notice is conditional and product details remain unspecified.

## Exact ownership and current snapshot

The live package snapshot audited on 2026-10-13 contains **1,382 active ingredient references, 100 ingredient forms, 63 legacy-import candidates, and 1,713 research-ledger records**. Normalized exact-key checks across reference IDs, bilingual names and aliases; form IDs, labels and match terms; legacy IDs, names and aliases; and ledger record IDs found no owner for:

`ingredient-ref-green-crab`, `candidate-green-crab`, `European green crab`, `green crab`, `green crabs`, `crabe vert`, `crabes verts`, `crabe européen`, and `Carcinus maenas`.

The nearby crab identities are not species substitutes for this candidate:

| Current reference | EN / FR display | Boundary and picker role |
|---|---|---|
| `ingredient-ref-crab` | `crab meat / chair de crabe` | Generic edible crab meat; it has the separate `jumbo lump crab meat` form. It has no bare `crab` or `crabe` alias, density, or unit mapping. |
| `ingredient-ref-blue-crab` | `blue crab / crabe bleu` | Species-qualified crab identity. |
| `ingredient-ref-dungeness-crab` | `Dungeness crab / crabe dormeur` | Species-qualified crab identity; French aliases are `crabe Dungeness` and `crabe de Dungeness`. |
| `ingredient-ref-jonah-crab` | `Jonah crab / crabe nordique` | Species-qualified crab identity. |
| `ingredient-ref-crab-flavoured-pollock-flakes` | `crab-flavoured pollock flakes / goberge en flocons à saveur de crabe` | Pollock product with crab flavour; not crab meat. |

The broader normalized picker queries `crab` and `crabe` currently return those five references. None is an exact owner of the proposed name or taxon. The only bundled crab-meat recipe is recipe 019, whose `1 lb jumbo lump crab meat` row is linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`; it does not name a crab species.

No exact green-crab match was found in the prior Section P plan/proposal/batch archive or in the current catalog and ledger. The proposal-local source-ID prefix `WP04-P-GREEN-CRAB-BOUNDARY-20261013-R52` was also checked against the archive and ledger before use; it had no prior occurrence.

## Picker projection

This static projection follows the current normalization and complete-phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row uses only the proposed display pair and the source-attested terms `green crab` and `crabe européen`; it is not active. The taxonomic binomial is not proposed as a user-facing alias.

| Query | Current result | With hypothetical display and source-attested terms | Boundary |
|---|---|---|---|
| `European green crab` | None | European green crab / crabe vert only | Exact species-qualified English phrase. |
| `green crab` | None | European green crab / crabe vert only | Exact common-name phrase. |
| `crabe vert` | None | European green crab / crabe vert only | Exact Québec name. |
| `crabe européen` | None | European green crab / crabe vert only | DFO-attested French alternate name. |
| `Carcinus maenas` | None | None | Scientific names are identity evidence, not a proposed picker alias. |
| `crab` / `crabe` | Five crab-related references listed above | The same five plus the candidate | The candidate would add a sixth broad-query choice; neither query becomes a singleton. Do not add separate bare `crab` or `crabe` aliases. |
| `crab meat` / `chair de crabe` | Generic crab meat | Generic crab meat | The candidate's name does not match the existing edible-meat phrase; do not map it to the meat identity or its Jumbo Lump form. |

Even though the exact qualified phrases would be uniquely searchable, a picker result would imply a usable cooking ingredient. The current DFO notice does not define a human-food product state or establish that the planned test case proceeded. Keep the candidate out until the product boundary is supported.

## Bundled recipe demand

All **114** recipe paths in `manifest.v1.json`, all **1,123** ingredient rows, and the parsed recipe text were scanned for `European green crab`, `green crab`, `green crabs`, `crabe vert`, `crabes verts`, `crabe européen`, and *Carcinus maenas*, with case, accents, punctuation, and whitespace normalized.

**Result: zero matching recipe files and zero matching ingredient rows.** Recipe 019's generic Jumbo Lump crab-meat ingredient is not a species-specific green-crab request. There is no recipe link, form, preparation state, amount, yield, or recipe-scoped substitution supported by the bundle.

## Product forms, measurements, and substitutions

No active form, density, unit mapping, conversion, count-to-mass value, edible-portion yield, cooking yield, or package yield is proposed.

- The Québec identification guide's crab size range and DFO's biological descriptions are animal-identification data, not kitchen measures, edible yield, or a portion size.
- DFO's September 2026 notice describes a prospective frozen or crushed product for an experimental sale/test case. It does not define whether a human-food item would be whole, shell-on, picked meat, cooked, raw, or ready to cook; it gives no package size or processing specification.
- No source reviewed supplies a species-specific consumer measure or a transferable mass-volume observation. Do not infer a measure from generic crab meat, another crab species, or the physical size of the animal.
- The reviewed sources do not identify green crab as a tested replacement for blue crab, Dungeness crab, Jonah crab, or generic crab meat. Recipe 019 provides no species choice or substitution context. Add no global conversion or contextual substitution.

If a later source establishes a marketed human-food product, audit its exact species label and edible state before choosing a catalog display or form. Keep numerical behavior and substitutions unset unless that later evidence directly supports them.

## Revisit conditions

Reopen this hold if DFO, a Canadian regulator, or a current Canadian processor/retailer documents a human-food product that is available or approved for sale with a defined species and product state. Confirm the outcome and conditions of the DFO test case; the expression-of-interest notice alone is not evidence that a food product was produced or marketed.

Before any future allocation:

1. Recheck exact ownership in active references, forms, legacy identities, the ledger, current plan, and archive.
2. Preserve *Carcinus maenas* as the species boundary. Use only a product-attested human-food display; the reviewed terminology supports `European green crab / crabe vert`, and DFO also attests `crabe européen`.
3. Reproject `European green crab`, `green crab`, `crabe vert`, `crabe européen`, `crab`, `crabe`, `crab meat`, and `chair de crabe`; do not add bare `crab` or `crabe` aliases or equate the species with generic picked crab meat.
4. Require product-specific evidence for forms, measures, yields, conversions, and any substitution. Recheck the complete bundled recipe corpus before linking a recipe.

## Sources

Online sources were accessed on 2026-10-13. Source IDs are proposal-local and do not create ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-P-GREEN-CRAB-BOUNDARY-20261013-R52-S01` | Gouvernement du Québec, [Aidez-nous à détecter les espèces exotiques envahissantes fauniques aquatiques](https://cdn-contenu.quebec.ca/cdn-contenu/faune/documents/exotiques/carnet-identification-especes-aquatiques-envahissantes.pdf), p. 4, 2024 | Directly pairs `Crabe vert`, *Carcinus maenas*, and `European green crab`, and gives identification features. Québec species/naming evidence; not a food-product specification. |
| `WP04-P-GREEN-CRAB-BOUNDARY-20261013-R52-S02` | Fisheries and Oceans Canada, [Le crabe vert dans les eaux de Terre-Neuve](https://www.dfo-mpo.gc.ca/species-especes/publications/ais-eae/greencrab-crabevert/index-fra.html) | Identifies *Carcinus maenas*, gives `crabe européen` as an alternate French name, describes the species' small body size, and distinguishes it from native rock crab. Older biological/invasive-species information; no current commercial food label or measure. |
| `WP04-P-GREEN-CRAB-BOUNDARY-20261013-R52-S03` | Fisheries and Oceans Canada, [European Green Crab species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/europeangreencrab-crabevert-eng.html?wbdisable=true) | Reports observations around eastern Canada, including the Magdalen Islands, and areas to monitor along Québec's coast; identifies *C. maenas* and distinguishes native similar crab species. The profile describes an invasive species and management response, not human-food availability. |
| `WP04-P-GREEN-CRAB-BOUNDARY-20261013-R52-S04` | Government of Canada / Fisheries and Oceans Canada, [Commercial fishery pilot in Southwest New Brunswick](https://www.canada.ca/en/fisheries-oceans/news/2025/12/government-of-canada-launches-commercial-fishery-pilot-to-help-control-european-green-crab-in-southwest-new-brunswick.html), 2025-12-15 | Announces a one-year control fishery pilot anticipated to open in Spring 2026, with required licences and measures to reduce spread risk. Lists potential uses including lobster bait, bioplastics, and soil enrichment. It does not report a human-food product or confirm the pilot's later operating status. |
| `WP04-P-GREEN-CRAB-BOUNDARY-20261013-R52-S05` | Fisheries and Oceans Canada, Newfoundland and Labrador Region, [Public Notice PN26.008: Expressions of Interest for a European Green Crab test case](https://www.nfl.dfo-mpo.gc.ca/en/node/2916), issued 2026-09-08 | Seeks interest in frozen/crushed green crab for compost, shell derivatives, or food items for animals/humans. Says temporary control licences would follow only if interest were sufficient and that details would be issued later. The response deadline was 2026-09-25; this notice contains no result, food specification, or retail listing. A targeted search found no later official result before this review date. |
| `WP04-P-GREEN-CRAB-BOUNDARY-20261013-R52-S06` | Canadian Food Inspection Agency, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species) | Lists *Carcinus maenas* as `green crab` in a white spot disease susceptibility table. Supports the common English name; it is animal-health information, not food-label approval or consumer-market evidence. |
| `WP04-P-GREEN-CRAB-BOUNDARY-20261013-R52-S07` | Fisheries and Oceans Canada, [2026 Public Notices](https://www.nfl.dfo-mpo.gc.ca/en/Fisheries_Notices_2026) | Current DFO notice index still lists PN26.008 and shows no separate public outcome notice for the green-crab test case. It does not establish the outcome of any private correspondence or licensing activity. |

No app tests or emulator checks were run: this packet changes documentation only and does not modify database JSON, application code, recipes, or tests.

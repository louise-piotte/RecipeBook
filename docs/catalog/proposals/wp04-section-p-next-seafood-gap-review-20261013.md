# WP04 Section P — milkfish / chanos species identity review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only species identity, Canadian and Québec naming/product evidence, exact ownership, picker projection, and recipe-demand review.
- **Recommendation:** Integrate one identity-only `PROTEIN` reference for *Chanos chanos*: English **milkfish**, Québec French **chanos**, with no aliases. Keep `milk fish`, `bangus`, `bandeng`, `bandang`, and `poisson-lait` out of active search terms for the reasons below. Do not add forms, measures, density, unit mappings, conversions, yield, recipe links, or substitution rules.
- **Worktree scope at proposal authoring:** This proposal file only. The recommendation was integrated on 2026-10-13; see `docs/catalog/batches/wp02-wp03-wp04-alias-identity-integration-20261013/README.md`.

## Why this is an unfinished Section P gap

The Section P parent checklist remains open for finfish and regional fish ([plan, P](../../RecipeBook-global-ingredient-catalog-plan.txt#L3474)). Its current species-specific decisions do not allocate *Chanos chanos*. The exact candidate terms, active references and forms, all 64 legacy candidates, the research ledger, Section P proposals and batches, and earlier WP04 source registers were searched before this packet was written. No milkfish identity, hold, product-boundary decision, or prior source allocation was found. This review therefore concerns a distinct fish identity, not dairy milk, fish powder, fish balls, or a preservation product.

## Bounded identity recommendation

Integrate the following identity only:

| Candidate ID | Category | English display | fr-CA display | Species | Aliases |
|---|---|---|---|---|---|
| `ingredient-ref-milkfish` | `PROTEIN` | **milkfish** | **chanos** | *Chanos chanos* | None |

CFIA lists the exact taxon as **Milkfish / Chanos**, TSN 162838, family Chanidae. OQLF identifies the same edible fish species, normalizes **chanos** as the Québec French term, and gives **milkfish** in English. This supports the bilingual identity pair. OQLF’s note that the species has commercial potential in Québec is terminology context, not evidence of current supply; current Canadian and Québec-facing retailer catalogues provide separate, time-bounded product-listing evidence below.

Do not add `bangus` or `chanidé`: OQLF records them as terms used in some contexts and says they were not retained for Québec fish-product marketing. Do not add `poisson lait` / `poisson-lait`: OQLF explicitly discourages this calque, even though a current Metro French listing uses it for one SKU. Do not add `bandeng` or `bandang`: OQLF lists them among English translation terms, but no reviewed Canadian or Québec product listing uses them. Do not add `milk fish`: a current Canadian retailer uses the spaced spelling, but the current picker would make the new fish appear for broad one-word searches for both `milk` and `fish` (details below). Keep the scientific name as evidence, not a picker alias.

## Prior-work and exact-ownership audit

The ownership check followed the current normalization in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD normalization, fold `œ` / `æ` / `ß` and `&`, remove combining marks, normalize punctuation, and collapse spaces. The live reference names and aliases, form labels and match terms, legacy-candidate names and aliases, and ledger record IDs were checked independently. All candidate keys below were unowned in the pre-write snapshot:

| Candidate key or ID | Active reference owner | Form owner | Legacy owner | Ledger record owner |
|---|---|---|---|---|
| `milkfish` | None | None | None | None |
| `milk fish` | None | None | None | None |
| `chanos` | None | None | None | None |
| *Chanos chanos* | None | None | None | None |
| `bangus` / `chanidé` | None | None | None | None |
| `bandeng` / `bandang` | None | None | None | None |
| `poisson lait` / `poisson-lait` | None | None | None | None |
| `ingredient-ref-milkfish` / `candidate-milkfish` | None | None | None | None |
| `WP04-P-MILKFISH-IDENTITY-20261013-S01` through `-S06` | Not an ingredient key | Not applicable | Not applicable | Unallocated source IDs |

The repository search also found no earlier proposal or batch containing the candidate names, taxon, proposed ID, or source prefix. The current owner of generic `milk` remains the existing milk and dairy references; generic `fish` remains a broader query with four current results. Those broad query results are evaluated separately from exact field ownership below.

## Picker projection and alias boundary

The projection below statically mirrors the current phrase-first and substring-fallback behavior in `IngredientReferenceSearchIndex`, using the live references and forms plus a hypothetical alias-free row. It is not a runtime picker test. A complete word-phrase match wins; substring fallback runs only when there are no complete phrase results.

| Query | Current results | With `milkfish / chanos`, no aliases | Decision |
|---|---|---|---|
| `milkfish` | None | milkfish / chanos | Activate the English source-backed name. |
| `chanos` | None | milkfish / chanos | Activate the OQLF-preferred Québec name. |
| `milk fish` | None | None | Keep the spaced seller spelling inactive. The one-token display `milkfish` does not match the two-token phrase. |
| `milk` | Six references: coconut, evaporated, standard, chocolate, skim, and sweetened condensed milk | Same six | The one-token display does not add a dairy-search result. |
| `fish` | Four references: Bonga dried fish powder, fish balls, fish sauce, and fish stock | Same four | Those complete phrase results suppress substring fallback, so `milkfish` does not add a fifth result. |
| `poisson` | Seven fish-related references, including fish balls, fish sauce, fish stock, and regional fish condiments | Same seven | Do not add the OQLF-dispreferred `poisson-lait` retail phrase as an alias. |
| `bangus`, `bandeng`, `bandang`, `poisson-lait`, `poisson de lait` | None | None | Keep out of aliases for the source and market-scope reasons above. |

If `milk fish` were added as an alias, static projection gives 7 results for `milk` and 5 for `fish`, instead of the current 6 and 4. This would make an ordinary dairy search surface a fish identity. Retain the source-supported one-token English display; keep the market spelling in the evidence record rather than broadening picker behavior. The French display `chanos` also avoids promoting Metro’s discouraged calque.

## Current Canadian and Québec-facing product evidence

Two current retailer catalogues corroborate Canadian product naming. Metro has English and French listings under the same product number, **835747001986**, for Tasie **Frozen Milkfish / Poisson-lait surgelé**, 650 g. Save-On-Foods lists **Milk Fish - Frozen**, 700 g, product number **00269000000001**, and notes that average pack weight may vary. The Metro listing supports Québec-facing product presence; Save-On-Foods supplies current Canadian evidence for the spaced spelling. Neither retailer listing establishes a stable recipe amount, and Metro’s French product wording does not override OQLF’s preferred term. The Ontario seafood wholesaler Seafood Depot directly lists **Milkfish, *Chanos chanos*** as available whole, fresh and frozen, wild, and sourced from the USA and Thailand; this is corroborating Canadian seller and species evidence, not Québec inventory or evidence of Canadian harvest.

These listing observations do not justify active `whole`, `fresh`, `frozen`, or other catalog forms. They describe seller-specific offerings, not recipe-linked ingredient states with independent measurement or conversion evidence. Metro’s 650 g and Save-On-Foods’ 700 g are package listings, not serving weights, household measures, densities, or count-to-mass mappings. Save-On-Foods expressly notes variable pack weight.

## Full bundled-recipe demand

The manifest-ordered corpus contains **114 recipe files and 1,123 ingredient rows**. Every full recipe file and every ingredient row was scanned for `milkfish`, `milk fish`, `Chanos`, `Chanos chanos`, `bangus`, `bandeng`, `bandang`, `poisson lait`, `poisson-lait`, and `poisson de lait`. There were **zero candidate-term hits in recipe rows and zero matching recipe files**. No recipe link or relink is supported.

Nearby seafood requests remain separate: recipe 077 row 10 asks for 675 g skinless salmon fillets; recipe 111 row 1 asks for one tuna steak; recipe 019 row 8 asks for one pound of jumbo-lump crab meat; and recipe 023 row 1 asks for 140 g sliced calamari. Recipe 093 row 4 allows generic “cooked meat or seafood, to taste,” which does not select a fish species. Fish sauce in recipes 093 and 095 is a condiment. None establishes milkfish demand, a fish substitution, or a milkfish quantity.

## Evidence dimensions kept separate

- **Identity:** Supported for *Chanos chanos* by OQLF and the CFIA Fish List. Recommend a `PROTEIN` row with `milkfish / chanos` and no aliases.
- **Aliases and product wording:** Keep all alias arrays empty. OQLF directly supports `chanos` and `milkfish` as the preferred bilingual pair, distinguishes its contextual alternatives, and rejects `poisson lait`; retailer wording is recorded without automatically promoting every spelling to picker terms.
- **Forms:** Do not add forms. Current seller listings mention whole, fresh, and frozen offerings, but no recipe line requests a product state and no normalized form boundary was researched for catalog use.
- **Measurements and density:** Keep `defaultDensity` null and `unitMappings` empty. The 650 g and 700 g retailer values are package observations only. No Canadian Nutrient File portion or culinary measurement source was reviewed in this identity pass; set ledger measurement research to `not_yet_researched`, rather than recording an unsupported value or claiming a comprehensive no-value finding.
- **Conversions and yields:** Add none. No source supports volume-to-mass conversion, whole-to-edible yield, count conversion, or preparation-state yield for this identity.
- **Substitutions:** Keep global and contextual rules empty. Substitution research was not performed for this identity; set the ledger state to `not_yet_researched` and add no recipe-line substitution.
- **Recipe links:** Add none. The full corpus scan found no milkfish request.

## Recommended integration delta

1. Add `ingredient-ref-milkfish` as an identity-only `PROTEIN` reference: `nameEn: milkfish`, `nameFr: chanos`, empty `aliasesEn` and `aliasesFr`, `defaultDensity: null`, and empty `unitMappings`.
2. Add a verified identity ledger record scoped to *Chanos chanos*, supported by the unique source IDs below. Keep measurement and substitution research states `not_yet_researched`; add no measurement observations, conversions, forms, yields, recipe links, or substitution findings.
3. Preserve `milk fish`, `bangus`, `bandeng`, `bandang`, `poisson-lait`, and scientific nomenclature as inactive picker terms. Do not change any unrelated milk, fish, or seafood identity.

## Sources and access limits

Source IDs below are proposal-local and were not present in the ledger or earlier proposals/batches before this packet. All were checked for exact-ID duplication before writing. Online sources were reviewed on 2026-10-13.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-MILKFISH-IDENTITY-20261013-S01** | Office québécois de la langue française, [GDT: chanos](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199012/chanos) | Identifies edible *Chanos chanos*; gives normalized preferred French `chanos` and English `milkfish`; lists `bangus` and `chanidé` as terms not retained for Québec fish-product marketing; discourages `poisson lait`; lists `bandeng` and `bandang` among English translation terms. Last updated 2011. Terminology evidence, not current stock or market availability. |
| **WP04-P-MILKFISH-IDENTITY-20261013-S02** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Exact row: TSN 162838, *Chanos chanos*, Milkfish, Chanos, Chanidae. The full Fish List result page was retrieved; it reports modified date 2023-09-18. Accepted Canadian fish-label common-name and taxon evidence; not retail inventory or culinary equivalence. |
| **WP04-P-MILKFISH-IDENTITY-20261013-S03** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the Fish List provides acceptable Canadian English and French fish-label names and scientific names with TSNs. This establishes the role and limits of S02; it does not establish availability or product states. |
| **WP04-P-MILKFISH-IDENTITY-20261013-S04** | Seafood Depot, [Milkfish](https://www.seafooddepot.ca/product-milkfish2) | Direct Canadian seller listing names *Chanos chanos* and says the fish is available whole, fresh/frozen, and wild, with product origin USA/Thailand. Retrieved directly on 2026-10-13; the listing does not establish Quebec stock, current lot availability, consumer-facing Québec terminology, or recipe measures. |
| **WP04-P-MILKFISH-IDENTITY-20261013-S05** | Metro, [Frozen Milkfish](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-milkfish/p/835747001986) and [Poisson-lait surgelé](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/poisson-lait-surgele/p/835747001986) | Search-indexed bilingual listings captured within the previous three weeks name the same Tasie product number 835747001986 and 650 g package. Direct opens returned cache-miss errors. Retail page data may vary by location and time; package weight is not a portion, and the French title is not adopted against OQLF guidance. |
| **WP04-P-MILKFISH-IDENTITY-20261013-S06** | Save-On-Foods, [Milk Fish - Frozen](https://www.saveonfoods.com/sm/pickup/rsid/918/product/save-on-foods-milk-fish-id-00269000000001) | Search-indexed Canadian retailer listing captured within the previous month: “Milk Fish - Frozen,” 700 g, product 00269000000001; seller copy says average pack weight may vary and describes a whole fish. Direct open returned a cache-miss error. Supports one spaced spelling and one product listing only; it does not identify the taxon or establish a Quebec label, serving size, or general measurement. |

## Live baseline snapshot and verification

Counts and exact-byte SHA-256 hashes below describe the live shared worktree snapshot captured on 2026-10-13 before this proposal was written. The recipe digest hashes each manifest-relative path, a NUL byte, its exact file bytes, and a trailing NUL in manifest order.

| Artifact | Count | Bytes | SHA-256 / digest |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,336 references | 428,069 | `eac7ae7bb7910c493488c3141076f06ae618cad7f6053e7fc28ec39bebf96f3d` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,644 records; 6,186 source entries; 5,191 distinct source IDs | 6,147,670 | `30213f6ec9c4c382a9282a4045a96323e5e31ba344d64e0485db7f7e6e537225` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `substitution-rules.v1.json` | 0 global rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 contextual rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `package-yields.v1.json` | 1 unrelated record | 853 | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |

The reference set has zero non-null default densities and zero non-empty unit mappings. The single package-yield record is unrelated to milkfish. Static checks parsed the references, forms, legacy candidates, ledger, manifest, substitution files, and package-yield file; confirmed the exact keys and proposed source IDs are unallocated; reproduced the picker projection above; and scanned the complete recipe corpus with zero candidate-name hits. No app tests or emulator checks were run because this proposal-only change does not modify implementation or database JSON.

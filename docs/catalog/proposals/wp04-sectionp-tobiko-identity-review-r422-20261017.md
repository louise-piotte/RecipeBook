# WP04 Section P — tobiko identity review (R422)

- **Review date:** 2026-10-17.
- **Candidate:** tobiko, the named sushi-roe category associated with flying-fish roe.
- **Recommendation:** Add one identity-only PROTEIN reference, displayed as **tobiko / tobiko**, with **flying fish roe** and **œufs de poisson volant** as its only aliases. Keep the row category-scoped: supplier Tobikko SKUs vary, and some list both flying-fish and herring roe. Do not add a species, product-state, color, or seasoning claim.
- **Checklist:** The live Section P roe item still names tobiko at [plan line 7401](../../RecipeBook-global-ingredient-catalog-plan.txt#L7419). R419 integrated masago and explicitly left tobiko unallocated in the [R418–R420 integration record](../batches/wp02-wp04-wp06-r418-r420-gap-review-integration-20261017/README.md). This review follows the separate tobiko boundary; it does not reopen masago or any earlier roe decision.
- **Proposal-only:** This file is the sole proposed change. No shared catalog JSON, ledger, plan, roadmap, recipe, generated index, or other file was edited. No tests, build, emulator, or deployment were run.
- **Source IDs:** Proposal-local IDs use **WP04-SECTIONP-TOBIKO-R422-20261017-**. The ownership audit found no collision for this prefix or the proposed reference ID.

## Why this is the next unresolved boundary

The October 9 tobiko/masago packet proposed two distinct culinary identities but left both proposal-only because the bundled library had no roe lines ([prior packet](wp04-tobiko-masago-roe-boundary-review-20261009.md)). R419 has since integrated masago as an identity-only reference, while the active Section P checklist and R419 integration note still leave tobiko open. The old packet’s neighboring statements about tobiko are context only; this review makes the current tobiko allocation decision using a fresh live-catalog audit and current Canadian and Québec-facing product evidence.

The evidence now supports a bounded identity independently of bundled recipe demand. Azuma Foods Canada currently sells tobiko-named products with product-specific flying-fish roe declarations, and a current Pointe-Claire sushi menu lists Tobiko with the bilingual descriptions “Oeufs de poisson volant / Flying fish roe.” The Québec Office québécois de la langue française defines *poisson volant* and *exocet* as French names for members of the Exocoetidae family. The identity can therefore be represented with a qualified roe alias while leaving any particular species and branded formula unspecified. This mirrors R419’s identity-only treatment of masago; it does not extend any other roe decision.

## Proposed exact data delta

At integration, add this reference and no form, unit mapping, package yield, or recipe link:

~~~json
{
  "id": "ingredient-ref-tobiko",
  "nameFr": "tobiko",
  "nameEn": "tobiko",
  "aliasesFr": ["œufs de poisson volant"],
  "aliasesEn": ["flying fish roe"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
~~~

Add a verified research-ledger record under record ID **ingredient-ref-tobiko**, with measurement state **researched_no_supported_value**, substitution state **researched_no_supported_substitute**, the five source records S01–S05 below, no measurement observations, no substitution findings, and one accepted identity decision matching the scope above. Add no separate candidate record, because the proposed identity is supported. The ledger source IDs remain proposal-local until root review and integration.

Do not add Tobikko as an alias: current Azuma pages use it as a brand spelling, while the Québec menu and recipe-facing culinary name use Tobiko. Do not add caviar / caviar de poisson volant / caviar d’exocet, generic roe, fish eggs, exocet, poisson volant, colored variants, or flavor names as aliases. Although these words appear in some current product titles, caviar would broaden a distinct picker query and the fish-family names alone do not specify roe. Do not add a scientific-name alias or a single-species assignment.

Keep tobiko separate from the integrated masago/capelin-roe identity, salmon and trout roe, herring roe and salted kazunoko, bottarga, milt, roe-on-kelp, sea-urchin gonads/uni, and caviar. Those are boundaries only; R416, R413, R410, R42, and integrated roe decisions remain unchanged.

## Current evidence and limits

Azuma Foods Canada’s current Tobikko Red page identifies a 90 g product as Flying Fish Caviar “Red” / Caviar de exocet assaisonné “Rouge” and lists flying-fish caviar with seasoning. Its current Gold page instead lists flying-fish and herring caviar together. These are SKU-level declarations: they support the marketed Tobikko category and explain why the catalog should not promise that every product contains flying-fish roe alone. The Japanese Ministry of Agriculture, Forestry and Fisheries’ export-facility list also names frozen seasoned products as Tobikko and gives different listed flying-fish species for standard/red versus black Tobikko; that is product-specific evidence, not a universal taxonomic definition.

Katoreya Sushi’s 2026 menu for Pointe-Claire, Québec directly uses **Tobiko / Oeufs de poisson volant / Flying fish roe**. This supports the French alias in current local culinary use. OQLF’s *exocet* record pairs *exocet* and *poisson volant* with English *flying fish* and identifies the family Exocoetidae; it supports the French fish-family wording, not a standardized roe product label. The local menu supplies the latter wording.

These sources support a culinary-category identity, not a composition specification for every branded product. A recipe that names a particular color, flavor, Tobikko SKU, or blend would still need its own product label. No listed source establishes a universal preparation, salt level, preservation state, origin, species, package size, portion, or recipe substitution.

## Live ownership, prior decisions, and source audit

The current snapshot contains **1,721 active ingredient references**, **141 forms**, **56 legacy-import candidates**, and **2,080 research-ledger records**. The audit compared normalized bilingual reference names and aliases, form labels and match terms, and legacy IDs/names/aliases using the normalization rules in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Surface | Current owner or mention | R422 disposition |
|---|---|---|
| Active references and forms | No exact normalized owner for ingredient-ref-tobiko, tobiko, tobikko, flying fish roe, œufs de poisson volant, or the related French/English caviar phrases. No form label or match term owns these phrases. Masago remains the only active owner for capelin roe / œufs de capelan. | Add only the identity row above; do not attach a form to another fish or roe reference. |
| Whole-fish and neighboring roe references | The current picker has no flying-fish result. Separate references own masago, salmon roe, trout roe, bottarga, and milt. | Keep the named roe distinct from whole fish and all neighboring products. |
| Legacy candidates | No candidate ID, display name, or alias owns tobiko, Tobikko, flying fish roe, or œufs de poisson volant; candidate-tobiko is unallocated. | Add no legacy mapping. |
| Research ledger | No ingredient-ref-tobiko or candidate-tobiko record exists. Tobiko appears only as a neighboring-product boundary in the salmon-roe, sea-urchin-gonad, bottarga, and trout-roe records; none allocates it. None of S01–S05’s exact URLs already has a ledger source record. | Add one verified identity record and the five source entries at integration. Do not change the records that mention neighboring roe. |
| Plan and archive | The earlier October 9 tobiko/masago proposal is explicitly proposal-only; R419 integrated masago and says tobiko remains unallocated. No focused tobiko integration or hold exists. R416, R413, R410, and R42 address separate boundaries. | Decide only tobiko and leave the checklist open for the remaining roe products. |
| IDs and sources | No active or archived owner for ingredient-ref-tobiko or the prefix WP04-SECTIONP-TOBIKO-R422-20261017-. No source-URL collision was found for the five sources below. | Keep proposed ID/source entries unallocated pending root review. |

## Picker projection

The projection follows phrase-first matching and substring fallback in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses exactly the proposed names and aliases above.

| Query | Current results | With proposed row |
|---|---|---|
| tobiko; flying fish roe; œufs de poisson volant | No result | Tobiko only |
| flying fish; poisson volant | No result | Tobiko only |
| roe | Bottarga; milt; salmon roe; trout roe; masago | The same five plus Tobiko |
| fish roe | Bottarga | Bottarga; Tobiko, because “fish roe” is a phrase within the qualified alias “flying fish roe” |
| caviar | Finger lime; salmon roe; trout roe | Unchanged |
| masago; capelin roe; œufs de capelan | Masago | Unchanged |
| herring roe; ikura; œufs d’éperlan; tobikko; caviar de poisson volant | No result | Unchanged |

The new exact bilingual queries identify one row. The broad roe query grows from five to six, and the existing fish roe query gains the correctly qualified tobiko row. No caviar alias is proposed, so its existing three-result query remains unchanged. Masago stays distinct, and branded Tobikko remains unresolved as a global spelling alias.

## Manifest-listed recipe scan

The scan parsed all **114 recipe files** listed in the bundled manifest and all **1,123 structured ingredient rows**, and searched each complete recipe JSON file. It checked tobiko/Tobikko, flying-fish roe, flying fish caviar, œufs de poisson volant, caviar d’exocet, and neighboring roe terms including masago, capelin roe, fish roe, salmon roe, herring roe, ikura, and caviar. There are **zero matching recipe files**, **zero matching ingredient rows**, and no direct recipe-reference link for tobiko.

The ordered corpus digest is **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e** over **753,988 bytes**, hashing each manifest-relative recipe path, a NUL separator, the exact file bytes, and a trailing NUL separator. This is no demand in the current bundled manifest corpus; it says nothing about recipes outside the package.

## Measures and substitutions

Azuma’s 90 g Red package and the Gold/Black case sizes and frozen shelf-life statements describe named supplier SKUs. They are not a standard tobiko package size, recipe amount, reusable yield, or kitchen conversion. The Québec menu lists a per-piece sushi price but no roe quantity. No bundled recipe amount or product-specific serving measure exists. Leave density null, unit mappings empty, and package yields and measurement observations absent.

The current global and contextual substitution-rule files contain no tobiko rule. No reviewed source supplies a tested ratio or dish-scoped replacement among tobiko, masago, salmon/trout roe, herring roe, bottarga, milt, or another ingredient. Add no global or contextual rule, warning, recipe-line substitution link, conversion, or yield.

## Recommendation

**Add identity-only tobiko / tobiko** with only **flying fish roe** and **œufs de poisson volant** as aliases, under **ingredient-ref-tobiko** in category **PROTEIN**. The current Canadian supplier labels, Québec bilingual menu, OQLF fish-family terminology, and MAFF product list support this narrow name boundary. Keep SKU-specific blends, species, colors, seasonings, package information, and preparation states outside the global row. Make no recipe, measurement, conversion, yield, form, or substitution change; keep the broader Section P roe checklist open.

## Source register

Sources accessed or rechecked on 2026-10-17. These IDs are proposal-local and do not create shared ledger records.

| Source ID | Source | Evidence used and limits |
|---|---|---|
| **WP04-SECTIONP-TOBIKO-R422-20261017-S01** | Azuma Foods (Canada), [Tobikko Red (90g)](https://azumafoods.ca/products/tobikko-red-90g/) | Current Canadian manufacturer product page, product 63183. Names Tobikko Red / Flying Fish Caviar “Red” / Caviar de exocet assaisonné “Rouge” and lists flying-fish caviar with seasoning. The 90 g package and frozen shelf-life statement are SKU-specific; this does not establish a universal Tobiko formula. |
| **WP04-SECTIONP-TOBIKO-R422-20261017-S02** | Azuma Foods (Canada), [Tobikko Gold](https://azumafoods.ca/products/tobikko-gold/) | Current Canadian manufacturer product page, product 63194. Names a seasoned flying-fish-and-herring-caviar blend and lists both roe sources among its main ingredients. The blend and case details apply to this SKU only. |
| **WP04-SECTIONP-TOBIKO-R422-20261017-S03** | Katoreya Sushi, [2026 restaurant menu](https://katoreya-sushi.ca/wp-content/uploads/sites/575/2026/02/Katoreya_Menus_2026.pdf), Pointe-Claire, Québec, nigiri/sashimi section | The menu directly pairs Tobiko with “Oeufs de poisson volant / Flying fish roe.” Current local restaurant wording supports the qualified bilingual alias; it is not a package ingredient declaration. |
| **WP04-SECTIONP-TOBIKO-R422-20261017-S04** | Office québécois de la langue française, [GDT: exocet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198646/exocet) | Pairs French *exocet* and *poisson volant* with English *flying fish* and identifies the Exocoetidae family. Supports the French family term, not a roe-product designation or a single species. |
| **WP04-SECTIONP-TOBIKO-R422-20261017-S05** | Japan Ministry of Agriculture, Forestry and Fisheries, [approved export facilities and products, page 205](https://www.maff.go.jp/j/shokusan/hq/i-4/attach/pdf/yusyutu_shinsei_asia-841.pdf) | The official facility/product list names frozen seasoned flying-fish roe as Tobikko, Tobikko Red, and Tobikko Black, with different scientific names specified for variants. Supports product-specific source-fish diversity; it is not a universal rule for every product sold under the culinary name. |
| **WP04-SECTIONP-TOBIKO-R422-20261017-R01** | Current manifest, references, forms, legacy candidates, ledger, substitution files, package-yield file, IngredientSearch.kt, and manifest-listed recipes | Read-only ownership, source-ID, picker-projection, measure/substitution, and complete recipe-corpus audit for this proposal. Snapshot and digest are recorded above. |

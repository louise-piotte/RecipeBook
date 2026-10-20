# WP04 Section P — sole market-name gap review (R277)

- **Review and source-access date:** 2026-10-16.
- **Packet type:** Proposal-only Canadian/Québec fish naming, market-group, picker, ownership, recipe-demand, product, measurement, and substitution review.
- **Checklist item:** The open Section P finfish line at [plan line 5579](../../RecipeBook-global-ingredient-catalog-plan.txt#L5588) includes sole, flounder, and turbot.
- **Recommendation:** If the sole term is represented, use an identity-only, species-neutral market group whose bilingual display explicitly says it is a multi-species market name. Do not add a species-qualified common-sole row for the unqualified query: with the current picker, it would make bare sole resolve to *Solea solea* even though Québec sources and current Canadian retail evidence apply the same word to other fish.
- **Scope:** This review covers only the bare market name sole. It does not reopen generic flounder or turbot, or any already-reviewed flatfish species. The proposed group is a retailer-name scope, not a taxonomic group, species assignment, fillet form, or substitution class.
- **Status:** Accepted and integrated on 2026-10-16 as an identity-only multi-species market group, `ingredient-ref-sole-market-group`; see the [integration record](../batches/wp04-section-p-sole-market-group-integration-r277-20261016/README.md).
- **Worktree scope at proposal time:** The proposal-only review made no active reference, form, ledger entry, legacy candidate, recipe, plan, roadmap, generated-file, batch README, application-code, test, build, or emulator change. Root later integrated the accepted row and updated the shared plan and roadmap.

## Naming and market evidence

OQLF's current GDT entry identifies **sole commune / common sole** as *Solea solea*. Its note also says Québec uses the market name sole for other similar flatfish, including grey, red, and Canadian plies and yellowtail flounder. The entry's 2026 revision is a current Québec terminology source, but it does not turn those different taxa into one species or establish that every product titled sole is *S. solea*. [Reused source WP04-FINFISH-GAPS-20261010-S09]

OQLF's entry for **filet de plie** supplies the Québec food-product distinction: it describes Canadian-caught flatfish sold under the North American commercial name sole, lists grey sole/witch flounder, American plaice, winter flounder, and yellowtail flounder, and prefers **filet de plie** while marking **filet de sole** as discouraged. This is strong evidence that sole is used as a market label across taxa, and that filet de sole is not a suitable Québec-normalized alias for a generic catalog row. The entry is older, so it is used for terminology scope, not present-day inventory. [S01]

CFIA's guidance describes the Fish List as a species-linked source of accepted English and French fish names and says group names covering multiple species may be considered. That supports careful treatment of fish naming, but it does not make the species equivalent for recipes or substitutions. The older Fish List sole-query endpoint cited in the broad finfish packet could not be retrieved in this review, so this proposal does not rely on its result rows. [Reused source WP04-FINFISH-GAPS-20261010-S12]

Current Québec retail listings corroborate that the label is still used for products whose species is not necessarily common sole:

- Metro's listing **Filets de sole décongelés ou frais, format économique** identifies its product as *Limanda ferruginea* in the ingredient details, alongside the French label **Plie**; it gives Northwest Atlantic/Canada origin and wild bottom-trawl method. The page showed the product out of stock when reviewed. Its approximately five pieces per tray is a package-specific count, not a general count or serving. [S02]
- Mayrand lists **Filet de sole décongelé 300 g**, with an approximate 0.3 kg unit and stock at its Anjou store when reviewed; other listed stores showed “Bientôt disponible.” The page does not state a species, so it cannot support a species assignment or identify the product as *S. solea*. The unit weight belongs only to that SKU. [S03]

Together, the OQLF terminology and current retailer evidence support a multi-species market-name group for products sold under the unqualified word **sole**. They do not support attaching sole to American plaice, yellowtail flounder, any other single species, or all flatfish. The market group must say in its visible name that it is a multi-species market name. This is a deliberately descriptive label, not an OQLF-normalized term.

## Picker projection

The projection follows the live phrase-first and substring-fallback behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The picker displays the localized ingredient name, so the scope needs to appear in the display itself; a hidden note would not disambiguate a result.

| Query | Current projection | With the proposed multi-species market group | Boundary |
|---|---|---|---|
| **sole** | No fish identity. Substring fallback returns the unrelated rocoto-pepper form whose French label contains **soleil**. | One phrase-first result labelled **sole (market name used for multiple fish species)** / **sole (appellation commerciale utilisée pour plusieurs espèces de poissons)**. | The explicit qualifier tells the user the result does not select one fish taxon. |
| **common sole** / **sole commune** | No result. | No group result. | These are species-qualified terms and remain unallocated. |
| **Solea solea** | No result. | No group result. | Scientific identity stays separate from the market group. |
| **plie** | American plaice / plie canadienne. | Unchanged. | The group has no plie alias and its French display does not contain plie. |
| **flounder** | No fish identity. | Unchanged. | The group does not include flounder or assign the word to one species. |
| **turbot** | No new European-turbot result; Greenland halibut retains its current display and aliases. | Unchanged. | The group neither claims turbot nor changes the held European-turbot candidate. |
| **filet de sole** / **sole fillet** | No result. | No result. | Do not infer a global fillet form from one retailer SKU; OQLF prefers filet de plie in Québec. |

A species-qualified **common sole / sole commune** row by itself is not picker-safe: both displays contain the broad word sole, so the current picker would make that species the only fish result for a bare sole search. The supported French taxon name does not fix that collision. A market-group row can represent the unqualified search more safely only if the localized display remains explicit about its multi-species market-name scope; do not shorten it to bare **sole / sole**.

## Conditional catalog shape

This sketch is an integration recommendation only; it does not allocate an ID or change active data.

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-sole-market-group |
| Category | PROTEIN |
| English display | **sole (market name used for multiple fish species)** |
| fr-CA display | **sole (appellation commerciale utilisée pour plusieurs espèces de poissons)** |
| Aliases | None |
| Taxon | None. This is a market-name group, not a species or family-level assignment. |
| Forms, density, unit mappings | None |
| Recipe links, measures, yields, conversions, substitutions | None |

Keep **sole commune / common sole** and *Solea solea* outside the active catalog until a separate recipe or product request justifies a species row and a reviewed picker treatment. Do not add **filet de sole**, **plie**, **flounder**, **turbot**, species names, or scientific names as aliases to the group. Do not add sole to any species row. The label belongs to more than one taxon in Canadian/Québec fish nomenclature and product use.

## Recipe demand and numeric or substitution evidence

The scan covered all **114 manifest-listed recipe files** and **1,123 ingredient rows**, searching recipe text and ingredient fields for sole, common sole, sole commune, *Solea solea*, sole fillet, filet de sole, filet de plie, plie, flounder, yellowtail flounder, limande à queue jaune, and turbot. It found **zero matching files and zero matching ingredient rows**. There is no bundled recipe link or recipe-derived preparation state.

There are no active sole forms, density values, unit mappings, package yields, or substitution rules. The Metro piece count and Mayrand 0.3 kg unit are individual product observations only. They do not establish a per-fillet mass, household serving, edible yield, density, or conversion. No source establishes an interchangeable replacement amount among sole-labelled products or between this market group and any named flatfish. Keep all such behavior absent.

## Ownership and archive audit

The read-only pre-proposal snapshot contained **1,657 active references**, **125 forms**, **61 legacy-import candidates**, and **2,005 research-ledger records**. Exact ID checks found no owner for the proposed **ingredient-ref-sole-market-group** or for a common-sole candidate in active references, forms, legacy candidates, or ledger record IDs. Exact-name and alias checks found no active fish owner for sole, common sole, sole commune, *Solea solea*, sole fillet, or filet de sole. The active **American plaice / plie canadienne** row is a separate species identity, and the ledger has no generic sole candidate or market-group record. Historical references to these words in proposals and source descriptions are not allocated identity owners.

The current picker result for bare **sole** is an incidental substring match on the unrelated fresh/dried rocoto form because its French display contains **soleil**. It is not a fish-name owner. The proposed row ID is absent from active references, forms, legacy IDs, and ledger record IDs.

Prior decisions remain in force:

- The 2026-10-10 [finfish gaps review](wp04-finfish-gaps-20261010.md) held generic sole/flounder/turbot terms while advancing only species-scoped American plaice, channel catfish, and Pacific halibut. This review revisits only how to represent the sole market label as an explicitly qualified market group.
- The [yellowtail-flounder boundary review](wp04-section-p-next-seafood-batch-20261012.md) kept sole off the yellowtail species display and aliases because the label spans taxa.
- The [winter-flounder review](wp04-section-p-winter-flounder-identity-boundary-review-20261013-round16.md) keeps *Pseudopleuronectes americanus* held because a species row would make flounder look species-specific. Nothing here changes that hold or adds flounder to the proposed group.
- The [European-turbot review](wp04-section-p-european-turbot-picker-market-boundary-review-20261013-round27.md) keeps *Scophthalmus maximus* held because a species row would capture Québec's ambiguous turbot query. The active Greenland-halibut row remains separate.

**Source-ID and URL audit:** The new proposal prefix **WP04-SECTIONP-SOLE-MARKET-GAP-R277-20261016-** was absent from the research ledger and existing proposal/batch archive before this file was created. New source IDs S01–S03 below were also unused. Exact source records from the older finfish review are reused as **WP04-FINFISH-GAPS-20261010-S09** (OQLF common sole), **S12** (CFIA fish-name guidance), and **S14** (OQLF flatfish examples); no duplicate source IDs are minted for them. The old CFIA sole-query endpoint from that packet could not be retrieved here and is not relied on for the accepted decision. The new OQLF filet de plie, Metro SKU, and Mayrand SKU URLs had no exact source-URL match in the ledger or prior proposal/batch archive at this snapshot. At proposal time S01–S03 were proposal-local; root allocated them to the accepted ledger record during integration.

## Sources

Accessed 2026-10-16. Reused source IDs point to the exact prior sources in the linked finfish-gap review.

| Source ID | Source and evidence | Limit |
|---|---|---|
| **WP04-FINFISH-GAPS-20261010-S09 (reused)** | OQLF GDT, [sole commune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198945/sole-commune). Identifies *Solea solea* and documents Québec use of sole for other flatfish; updated 2026. | Terminology and taxonomy; does not map every sole-labelled product to a species. |
| **WP04-FINFISH-GAPS-20261010-S12 (reused)** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). Says fish sold or processed in Canada should use names listed for the species and that group names covering multiple species may be considered. | Regulatory naming guidance; it does not establish recipe or substitution behavior. |
| **WP04-FINFISH-GAPS-20261010-S14 (reused)** | OQLF GDT, [plie grise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198644/plie-grise), [plie rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198643/plie-rouge), and [limande à queue jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198645/limande-a-queue-jaune). Species-level French/English/taxon evidence and examples of flatfish marketed as sole. | Older entries; terminology, not present-day stock or product specifications. |
| **WP04-SECTIONP-SOLE-MARKET-GAP-R277-20261016-S01** | OQLF GDT, [filet de plie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298292/filet-de-plie). Documents the Québec commercial use of sole for several flatfish and prefers filet de plie over filet de sole. | Last updated 1984; used for naming distinctions, not current inventory. |
| **WP04-SECTIONP-SOLE-MARKET-GAP-R277-20261016-S02** | Metro, [Filets de sole décongelés ou frais, format économique](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/filets-de-sole-decongeles-ou-frais/p/239470), product 239470. The product details give *Limanda ferruginea*, French Plie, Canada/Northwest Atlantic origin, and about five pieces per tray. | Retailer product details are SKU-specific; the listing showed out of stock at review. The piece count is not a general portion or measure. |
| **WP04-SECTIONP-SOLE-MARKET-GAP-R277-20261016-S03** | Mayrand, [Filet de sole décongelé 300 g](https://mayrand.ca/fr/nos-produits/poissonnerie/poissons-a-larrivage/sole-filet-dcg-52959), product 52959. Current page gives an approximate 0.3 kg unit and showed Anjou in stock. | No species is named. The weight and availability are SKU/store-specific and are not a general measure. |

## Integration recommendation

Represent the unqualified Canadian/Québec market label only as an identity-only **multi-species market group**, with the scope encoded in the visible bilingual display proposed above. A species-qualified common-sole row is not safe for bare **sole** with the current picker because it would claim a broader market query as one species. Keep species names, broad plie/flounder/turbot terms, forms, numeric behavior, recipes, and substitutions unchanged. The parent Section P finfish checklist remains open.

Root integrated the identity-only reference and ledger record, checked the dedicated Section P item, and added the R277 roadmap record. The [integration README](../batches/wp04-section-p-sole-market-group-integration-r277-20261016/README.md) records the static checks and the final picker projection.

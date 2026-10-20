# WP04 Section P — spot prawn / crevette tachetée picker-boundary review (R95)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** species identity, Canadian and Québec naming, picker ownership, recipe demand, product-state, measurement, and substitution review.
- **Open checklist:** the shrimp/prawn line in the [live Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4683) remains open.
- **Candidate:** spot prawn / spot shrimp, *Pandalus platyceros* Brandt, 1851.
- **Recommendation:** hold the species outside active references and the research ledger until picker search can preserve the generic scope of `prawn`. Canadian and Québec sources establish the species, specific names, and current product use, but CFIA also assigns bare `Prawn` to several other shrimp taxa. A species row displayed as `spot prawn / crevette tachetée` would be the only result for a broad `prawn` query.
- **Shared-data effect:** none proposed. No reference, ledger record, alias, form, measure, recipe link, conversion, package yield, or substitution rule is added.
- **Tests:** none. This is proposal-only documentation and makes no app or database change.

## Why this is a distinct open candidate

The Section P plan keeps shrimp/prawn identities and product states open. Prior work has integrated Northern shrimp / `crevette nordique` (*Pandalus borealis*) and reviewed the generic shrimp/prawn boundary, dried shrimp, shrimp powder, Argentine red shrimp, black tiger shrimp, and whiteleg shrimp. None of those packets reviews *P. platyceros*; searches of the plan, proposal/batch archive, current references, forms, legacy identities, and research ledger found no focused spot-prawn decision or allocation.

This packet covers only the Pacific species *P. platyceros*. It does not reopen Northern shrimp, Argentine red shrimp, whiteleg shrimp, or black tiger shrimp. Keep the candidate distinct from other BC commercial shrimp, including coonstripe shrimp (*Pandalus danae*), humpback shrimp (*P. hypsinotus*), ocean shrimp (*P. jordani*), sidestripe shrimp (*Pandalopsis dispar*), and the mixed-species trawl catch. Also keep dried shrimp, shrimp pastes, and salted-fermented shrimp products separate.

## Identity and Canadian / Québec naming

Fisheries and Oceans Canada (DFO) directly identifies *Pandalus platyceros* as **crevette tachetée** in its French species profile. The English profile calls the species **prawn or spot shrimp**. DFO describes it as a BC Pacific species and the largest of seven commercial shrimp species in BC waters [S01–S02].

The CFIA Fish List links the target taxon to TSN 96979 and includes the English names `Shrimp`, `Spot Shrimp`, `Spot Prawn`, and `Prawn`. It pairs the target row's generic `Shrimp` entry with French `Crevette Tachée` and its generic `Prawn` entry with `Crevette`. The list also assigns the generic English `Prawn` and French `Crevette` to several other taxa, including *Pandalus borealis*, *P. jordani*, *P. montagui*, and *Pandalopsis dispar*. Other *Pandalus* rows also carry generic `Shrimp` names [S03]. CFIA's list is a Canadian food-labelling name source, not evidence that the species are interchangeable in recipes [S04].

DFO's French profile and current Québec-facing sources support **crevette tachetée** as readable French market wording. A targeted search of the OQLF GDT did not surface a focused entry for this species, so this proposal does not call the phrase OQLF-preferred. Montréal fishmonger La Mer currently lists a 227 g frozen BC product as `Crevette tâchetée congelée`; its product page describes the wild BC shrimp as frozen aboard without the head and in shell. The seller spells the modifier with a circumflex, but DFO and federal fishery sources use `tachetée`; retain the standard spelling in any future display [S06]. The current Westmount menu for Moku Bistro labels `Botan Ebi` as `crevette tachetée`, a Québec consumer/menu use of the phrase, but it gives no Latin name and does not by itself identify that serving as *P. platyceros* [S07].

For English, the specific common phrases `spot prawn` and `spot shrimp` both have Canadian Fish List support. Do not add bare `prawn`, `shrimp`, or `crevette` as aliases: those terms cover broader species or product groups. Do not add Latin names as search aliases.

## Current demand and product evidence

DFO's current 2026/2027 Pacific trap-fishery summary identifies spot prawn as the target species of the BC commercial prawn fishery. It reports that most of the catch comes from the Strait of Georgia and inside Vancouver Island, and that the fishery generally closes coastwide by the end of June [S05]. This supports an active, seasonal Canadian food fishery; it does not establish broad availability throughout Canada or Québec.

Québec market discovery is visible in two current sources: La Mer's frozen 227 g BC product and Moku Bistro's French menu term. A Canadian seafood supplier, SeaCore, identifies *P. platyceros*, wild-caught in BC, and lists live, headless shell-on frozen, and easy-peel frozen products with package and count variants [S08]. These sources establish a real product and a local search term, not a standard ingredient form or general market availability.

The full bundled recipe corpus has **no spot-prawn/spot-shrimp request**. External consumer recipe evidence does exist: Canadian Living's April 2016 four-serving Spot Prawn Scampi uses 450 g peeled and deveined spot prawns, and its recipe page suggests ASC-certified large shrimp as an off-season substitute. This is a dish-specific source and does not create demand in the app's 114 bundled recipes [S09]. No external search-volume measure was available; retailer/menu listings and a commercial fishery are treated as product and discovery signals, not quantified recipe demand.

## Current ownership and picker projection

The live package has **1,426 references and 105 forms**; the legacy-import file has 63 candidates; the research ledger has 1,766 records. The manifest lists 114 recipes and the corpus has 1,123 ingredient rows. No active reference, form, legacy candidate, or ledger record owns `spot prawn`, `spot shrimp`, `crevette tachetée`, *Pandalus platyceros*, or the prospective ID `ingredient-ref-spot-shrimp`.

Existing nearby rows remain distinct:

| Active reference | Relevant name | Scope |
|---|---|---|
| `ingredient-ref-northern-shrimp` | Northern shrimp / `crevette nordique` | *Pandalus borealis*; separate species and Québec market identity. |
| `ingredient-ref-dried-shrimp` | dried shrimp / `crevette séchée` | Preserved product; not this fresh/frozen species identity. |
| `ingredient-ref-saeu-jeot`, `ingredient-ref-kapi-shrimp-paste` | Salted-fermented shrimp and named shrimp paste | Condiment products, not shrimp meat. |

The projection follows the current phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). I compared the current references and forms with a conditional row displayed `spot prawn / crevette tachetée` and the specific English alias `spot shrimp`. This is static search projection, not a UI or emulator test.

| Query | Current result | With the conditional row | Interpretation |
|---|---|---|---|
| `spot prawn` | None | Candidate only | Specific English name resolves to the target taxon. |
| `spot shrimp` | None | Candidate only | Specific English synonym resolves to the target taxon. |
| `crevette tachetée` | None | Candidate only | DFO-supported French species phrase resolves to the target taxon. |
| `prawn` | None | Candidate only | Misleading singleton: CFIA applies generic `Prawn` to multiple shrimp taxa, including other Pandalidae. |
| `shrimp` | Dried shrimp; Northern shrimp; saeu-jeot | Same three plus candidate | Broad English query remains multi-result. |
| `crevette` | Dried shrimp; Northern shrimp | Same two plus candidate | Broad French query remains multi-result. |
| `crevettes` | Seven shrimp and shrimp-condiment references | Same seven | The candidate display and proposed singular French name add no plural alias. |
| `dried shrimp`; `northern shrimp` | Their existing single owners | Same owners | Existing product and species names are not captured. |

Changing the English display to `spot shrimp` and omitting `spot prawn` would avoid the `prawn` singleton, but it would leave the documented Canadian `spot prawn` name unsearchable. Adding `spot prawn` as an alias has the same broad-query effect as using it in the display. Keep both specific English names unallocated until search can preserve the generic `prawn` scope or show the shared-name choices.

## Bundled recipe demand

I scanned every manifest-listed recipe and all ingredient rows for `spot prawn`, `spot shrimp`, `crevette tachetée`, `crevette tachée`, *Pandalus platyceros*, `Botan Ebi`, and broad `shrimp`, `prawn`, and `crevette` wording. The scan found **zero matching files and zero matching ingredient rows across 114 files / 1,123 rows**. No recipe link, product-state choice, package conversion, or substitution can be derived from the bundle.

The optional recipe text `Cooked meat or seafood, to taste` remains generic and unlinked. It is not shrimp demand. The Canadian Living scampi recipe is separate editorial evidence: it uses 450 g for four servings and names an off-season large-shrimp alternative, but it does not authorize a general spot-prawn-to-shrimp rule or identify an ASC-certified replacement species [S09].

## Forms, quantities, and substitutions

- **Product states:** Québec retailer and Canadian supplier pages show distinct live, fresh/seasonal, frozen-at-sea, head-on, headless shell-on, and easy-peel presentations. These are seller- or product-specific. Add no live, fresh, raw, cooked, frozen, thawed, shell-on, headless, peeled, or deveined form under a species row.
- **Measures:** The Québec SKU's **227 g** and SeaCore package/count options remain product-specific. Canadian Living's **450 g** amount is tied to one four-serving scampi recipe. Health Canada's Canadian Nutrient File raw-shrimp entry (food code 3211) is explicitly for **mixed species** and records one large at 7 g, a 90 g food-guide serving, and 13% tail-and-shell refuse [S10]. Do not transfer these values to *P. platyceros*. Add no density, unit mapping, count-to-mass conversion, shell-removal yield, edible-yield default, or standard portion.
- **Substitution:** Canadian Living suggests ASC-certified large shrimp in place of spot prawns for that specific off-season scampi, with no separate replacement amount or species identified. Preserve it only as a source-specific culinary note; it does not establish a ratio or safe replacement in other dishes. Add no global or contextual substitution rule for spot prawns and no rule linking this species to Northern shrimp, whiteleg shrimp, Argentine red shrimp, dried shrimp, shrimp paste, or another shellfish.

## Recommendation

Keep *Pandalus platyceros* **outside active references and the research ledger** for now. DFO, CFIA, a Québec fishmonger, and a current Québec menu support its identity and names. However, the specific market name `spot prawn` contains the generic query `prawn`; under the current picker it would return this species alone even though CFIA assigns `Prawn` to multiple taxa. Using only `spot shrimp` would hide the Canadian `spot prawn` name, while adding it as an alias recreates the same false narrowing.

Revisit if search can retain shared common-name scope or another result model can keep `prawn` multi-choice while still exposing the qualified species. Keep the identity separate from *P. borealis* and other Pacific shrimp. Add no aliases, forms, measurements, recipe links, conversions, yields, or substitutions in this review. Section P remains open.

## Source register

Sources were accessed on 2026-10-14. IDs below are local to this proposal and were checked against the live ledger and proposal/batch archive before drafting; they are not ledger entries.

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S01` | Fisheries and Oceans Canada, [Crevette tachetée — French species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/prawn-crevette-tachetee-fra.html). Identifies *Pandalus platyceros* as `crevette tachetée`, describes its BC Pacific distribution and commercial context. | Species and French-name evidence, not Québec retail availability or an OQLF ruling. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S02` | Fisheries and Oceans Canada, [Prawn — English species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/prawn-crevette-tachetee-eng.html). Identifies *P. platyceros* as `prawn or spot shrimp`. | Species and English-name evidence; its generic page title `Prawn` should not be turned into a global catalog alias. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S03` | CFIA, [Fish List shrimp query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=shrimp&wbdisable=true). Lists TSN 96979 with `Shrimp / Crevette Tachée`, `Spot Shrimp`, `Spot Prawn`, and `Prawn / Crevette`; also shows other taxa sharing generic `Prawn`, `Shrimp`, or `Crevette`. | Canadian label-name/taxon evidence; the result page reports the list modified 2023-09-18 and does not establish recipe equivalence. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S04` | CFIA, [Common names for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). Explains the Canadian Fish List's role in fish-product common-name labelling. | Regulatory naming scope, not an ingredient taxonomy or measure source. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S05` | Fisheries and Oceans Canada, [Prawn and shrimp (Pandalus spp.) by trap — Pacific Region, 2026/2027](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/prawnshrimp-trap-crevette-casier-ifmp-pgip-sm-eng.html?wbdisable=true). Identifies spot prawn (*P. platyceros*) as the target species of the current BC trap fishery and describes its timing and distribution. | Fishery management evidence; not national retail prevalence, a standard form, or a household measure. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S06` | Poissonnerie La Mer, [Crevette tâchetée congelée (C.B.) — 227 g](https://www.lamer.ca/products/queue-crevette-tachetee-congele-c-b). Montréal-area Québec retailer listing; describes wild BC product, frozen aboard without the head and in shell. | Product page does not state the Latin name or an individual shrimp count. The circumflex spelling is retailer wording; use the government-supported spelling `tachetée`. The 227 g size is SKU-specific. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S07` | Moku Bistro, Westmount, [current French menu](https://mokubistro.com/fr/). Labels `Botan Ebi` as `crevette tachetée` in its sashimi menu. | Menu term and local discovery signal only; no scientific name, source product, or package quantity is given. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S08` | SeaCore Seafood Products, [Spot Prawns — *Pandalus platyceros*](https://www.seacoreseafood.com/product/Spot_Prawn). Identifies wild BC product, live and frozen presentations, headless shell-on or easy-peel options, 1 lb/227 g packs, and product-specific count ranges. | Supplier SKU and grade descriptions, not a universal measure, Québec retail survey, or recipe source. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S09` | Canadian Living, [Spot Prawn Scampi](https://www.canadianliving.com/food/lunch-and-dinner/recipe/spot-prawn-scampi), April 2016. Uses 450 g peeled/deveined spot prawns for four servings and suggests ASC-certified large shrimp during the off-season. | One source-specific recipe and replacement suggestion; it gives no replacement species or adjusted amount and is not bundled recipe demand. |
| `WP04-SECTIONP-SPOT-SHRIMP-R95-20261014-S10` | Health Canada, [Canadian Nutrient File serving portion 3211](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3211). Raw mixed-species shrimp: one large = 7 g, 90 g food-guide serving, 13% tail-and-shell refuse. | Mixed-species measure; no data here is specific to *P. platyceros*. |

## Static review record

- Re-read current `AGENTS.md`, `Requirements.md`, the open Section P checklist, domain `DESIGN.md`, the current catalog and ledger, and the neighboring shrimp proposals. Searched the proposal/batch archive and plan for the candidate and its scientific name; no focused spot-prawn review or prior decision was found.
- Parsed current reference, form, legacy-import, research-ledger, and manifest files. Confirmed 1,426 references, 105 forms, 63 legacy candidates, 1,766 ledger records, 114 recipe files, and 1,123 ingredient rows.
- Checked exact candidate terms and the prospective `ingredient-ref-spot-shrimp` ID across active references, forms, legacy candidates, and ledger records; found no existing owner. Checked the proposal-local source-ID prefix across the archive and ledger before use; no prior use was found.
- Reproduced phrase-first normalized query behavior against current reference and form terms, then projected the candidate display and `spot shrimp` synonym. The conditional `spot prawn` row would be the only result for `prawn`; `shrimp` and `crevette` remain multi-result.
- Scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows; found no candidate or broad shrimp/prawn/crevette matches.
- No app, Gradle, instrumentation, emulator, catalog, ledger, recipe, plan, roadmap, code, or generated-file changes were made. No application tests were run for this proposal-only review.

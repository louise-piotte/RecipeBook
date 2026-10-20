# WP04 Section P — Atlantic cod cheeks cut-form boundary review (round 65)

- **Review and source-access date:** 2026-10-13.
- **Disposition:** Hold Atlantic cod cheeks outside active references and forms for now. The cut is a source-backed Canadian and Québec food product, but there is no bundled recipe demand, and the current search index would make broad cheek/joue queries point to Atlantic cod alone.
- **Scope:** Atlantic cod (*Gadus morhua*) cheeks as a cut of the existing Atlantic cod identity. This review does not propose a generic fish-cheek identity or a form shared across species.
- **Proposal-only:** This file only. No catalog, forms, ledger, recipe, plan, roadmap, checklist, or code was changed. No tests or emulator checks were run.
- **New local source-ID prefix:** **WP04-SECTIONP-COD-CHEEKS-20261013-R65-**. No use of this prefix was found in the existing proposal, batch, roadmap, plan, or ledger snapshot before this file was created.

## Decision

Canadian sources document Atlantic cod cheeks as a real product and distinguish them from Atlantic cod tongues. Québec-facing pages also sell or list cod cheeks as food, including the French wording “Morue (joue)” and “Joues de morue.” These sources support researching one cut-form under the existing Atlantic cod reference, not creating a separate ingredient identity.

Keep the cut unallocated for now. OQLF standardizes **joue** for a commercializable fish part and names morue, flétan, baudroie, and raie among the commercial species to which the cut applies. It rejects **bajoue** for Québec fish-product marketing labels to avoid species confusion [S01]. If a single form were attached to Atlantic cod, the current phrase-first search would make singular and plural cheek/joue queries resolve to that one species, despite the documented broader cut scope. Qualified display wording alone does not prevent this: the search index also matches words and phrases contained inside a longer form label.

No bundled recipe requests cod cheeks, a cheek of cod, joues de morue, or the broader words cod or morue. Without a recipe need, there is no reason to activate a source-specific cut in a way that makes broad cut searches look species-unique. Revisit if a bundled recipe establishes need and the picker can preserve the broader species choice, or if separately verified cheek forms for the other species named by Québec terminology support showing multiple choices.

## Species and product boundary

Use Atlantic cod only for the narrow product supported by species-qualified evidence. The OQLF GDT pairs **morue de l’Atlantique** with **Atlantic Cod** and *Gadus morhua* [S02]. Seafood from Canada’s Atlantic-cod page identifies the same taxon and lists cheeks among frozen product forms [S03]. A Canadian wholesale supplier separately lists Atlantic cod cheeks and Atlantic cod tongues and identifies Atlantic cod as *Gadus morhua* [S06].

Do not extend this evidence to Pacific cod, Arctic cod, salt cod, Atlantic halibut cheeks, monkfish cheeks, skate cheeks, or generic fish cheeks. A Gaspésie fish seller lists cod cheeks and Atlantic-halibut cheeks as separate products, but its page does not give a scientific name for the cod item [S04]. The Québec retailer La mer à bord uses “Morue (joue)” and “Joues de morue,” but gives Gulf of St. Lawrence or North Atlantic provenance without identifying *Gadus morhua* [S05]. These local pages establish Québec food and French-wording context; they do not independently identify the Atlantic-cod taxon.

CFIA’s fish-label guidance says that, for a single fish species, the species name must be incorporated into the common name unless a prescribed standard applies; it gives “cod portions” as an example [S07]. This is regulatory labelling guidance for fish products, not a database rule or a species-specific decision for cheek cuts. It supports keeping any future label qualified by species rather than adopting a generic fish-cheek name.

## Archive, catalog, and ownership audit

The current Section P checklist still leaves fish powder, fish balls, surimi, and broader named-seafood work open. The round-31 cod-tongues review mentions that a supplier lists Atlantic cod tongues and cheeks separately, but explicitly excludes cheeks from its scope and does not decide whether to allocate them [P01]. No dedicated cod-cheek proposal or integration batch was found. The round-65 source prefix and this proposal path were clear before drafting; an existing WP02 A7 round-65 proposal is a different work item.

At the catalog snapshot reviewed, the seed contains **1,389 active references**, **100 ingredient forms**, **63 legacy candidates**, and **1,722 research-ledger records**. The active ingredient-ref-atlantic-cod is displayed as Atlantic cod / morue de l’Atlantique, has no aliases, has no attached forms, and has no default density or unit mappings.

Exact normalized searches of current reference names and aliases, form labels and match terms, legacy candidate names, and ledger records found no owner for:

- Atlantic cod cheek(s), cod cheek(s), cheeks of Atlantic cod
- joue(s) de morue, joue(s) de morue de l’Atlantique
- fish cheek(s) or cheek(s) de poisson

There is no active form attached to Atlantic cod and no exact candidate allocation in the legacy identities or research ledger. The round-31 cod-tongues proposal is the only archive hit for cod cheeks; it identifies cheeks as a neighboring cut, rather than reviewing or allocating them [P01].

## Exact search ownership and collision projection

The read-only projection follows IngredientSearch.kt: lowercase and normalize accents and punctuation, prefer complete word-phrase matches across reference names, aliases, and attached form labels/match terms, then fall back to substring matches. Forms return their parent reference. This is a data-level projection, not an app or runtime picker test.

| Query | Current result | Hypothetical result with one searchable Atlantic-cod-cheek form | Ownership consequence |
|---|---|---|---|
| Atlantic cod cheeks; cod cheeks; joues de morue; joues de morue de l’Atlantique | No result | Atlantic cod | The source-qualified cut would be attached to the existing Atlantic cod reference, not a new identity. Unqualified phrases would also resolve to that one parent because the search matches contained phrases. |
| cheek; cheeks; joue; joues | No result | Atlantic cod, if the expected singular/plural terms are searchable on the form | A single species would own queries that OQLF describes as applying to multiple commercial fish species. This is the blocking false-singleton effect. |
| cod | Five results: Arctic cod, Atlantic cod, Pacific cod, sablefish, and salt cod | The same five references | Forms do not create new reference rows; the broader cod result remains intact for this query. |
| morue | Five results: Arctic cod, Atlantic cod, Pacific cod, sablefish, and salt cod | The same five references | The broader French species/product query remains intact, though a more specific cheek phrase would narrow to Atlantic cod. |
| fish cheek(s); joue(s) de poisson | No result | No result if these generic terms are excluded | Do not add generic aliases to Atlantic cod. |

The proposed cut is not owned by a current reference or form. Bare cod and morue are already shared by five rows, so neither should be added as a standalone alias or new ingredient identity for cheeks. Bare cheek/joue terms are currently unowned; assigning the single Atlantic-cod form would therefore create, rather than resolve, a multi-species query boundary.

## Recipe demand and numeric evidence

The complete bundled-library audit read all **114 manifest-listed recipe files** and **1,123 ingredient rows**. It searched recipe JSON text and ingredient rows for Atlantic cod cheeks, cod cheek(s), joue(s) de morue, fish cheek(s), cheek(s), joue(s), cod, and morue. It found **zero matching files and zero matching ingredient rows**. No recipe link or serving amount is proposed. Québec vendor copy that says cod cheeks resemble scallop in texture is product description, not a recipe or replacement instruction [S05].

No reviewed source establishes a cheek-specific density, volume measure, count-to-mass mapping, per-cheek mass, standard portion, edible yield, frozen-to-thawed yield, cooking yield, or pack-to-recipe conversion. Seafood from Canada’s nutrition panel is per 100 g for Atlantic cod generally, not a cheek-specific density or kitchen measure [S03]. Supplier pack sizes shown for Atlantic cod are not identified as cheek-specific [S06]. Add no density, unit mapping, measure, conversion, yield, or package quantity.

No reviewed recipe or product source establishes a directed substitution between cheeks and cod fillet, cod tongues, halibut/monkfish/skate cheeks, scallops, fish balls, surimi, fish powder, crab, or another seafood at any amount or method. The vendor’s scallop comparison is sensory wording only. Add no global or contextual substitution rule and no recipe-line substitution.

## Integration sketch if the hold is later resolved

If a bundled recipe creates a need and search can preserve the species choice, represent the cut as one form under the existing ingredient-ref-atlantic-cod, not as a standalone ingredient reference:

- English display: **Atlantic cod cheeks**
- Québec French display: **joues de morue de l’Atlantique**
- Use a frozen state only if the integrating evidence remains limited to the species-qualified frozen-product source [S03]. Do not infer a fresh state from the local Gaspésie page’s unqualified cod listing [S04].
- Do not add **bajoue**, cod jowls, fish cheeks, fish cheek, cheek/joue as a generic alias, or another fish species as an owner.
- Add no density, unit mapping, recipe link, yield, conversion, or substitution without new cheek-specific evidence.

Because the current search index treats form labels as searchable terms, a single form cannot avoid broad cheek/joue hits simply by omitting generic aliases. Keep the form inactive until a safe multi-choice query behavior or independently supported additional species forms are available.

## Root integration outcome

Accepted the hold on 2026-10-13. Atlantic cod cheeks remain outside active references, forms, and the research ledger while a single form would make broad cheek/joue searches resolve to one species and the recipe bundle has no demand. See the [integration record](../batches/wp04-section-p-atlantic-cod-cheeks-picker-hold-integration-20261013/README.md). No tests were needed for this documentation-only decision.

## Source register

| ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-COD-CHEEKS-20261013-R65-S01** | Office québécois de la langue française, [joue (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199070/joue). | Preferred Québec term **joue**, English equivalent **cheek**; defines a commercializable anatomical part and names morue, flétan, baudroie, and raie as commercial species. Says **bajoue** was not retained for Québec fish-product marketing. Last updated 2012; terminology evidence, not current SKU availability or a taxonomic assertion about one cod product. |
| **WP04-SECTIONP-COD-CHEEKS-20261013-R65-S02** | Office québécois de la langue française, GDT entry authored by Faune et flore du pays (2024), [morue de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573546/morue-de-latlantique). | Pairs Atlantic Cod / morue de l’Atlantique with *Gadus morhua*. Species terminology and identity only; it does not describe cheek cuts. |
| **WP04-SECTIONP-COD-CHEEKS-20261013-R65-S03** | Seafood from Canada, [Morue, atlantique](https://seafoodfromcanada.ca/fr/seafood/morue-atlantique/), species and product-form sections. | Identifies *Gadus morhua* and lists joues among frozen product forms. A seafood marketing/trade page, not a regulator, a Québec retail label, a cheek-specific pack or measure, or proof of current inventory. The nutrition data is for the species generally. |
| **WP04-SECTIONP-COD-CHEEKS-20261013-R65-S04** | Pêcheries M.C. Gaspésie, [Products](https://pecheriesmcgaspesie.com/en/produits/), fresh/frozen fish section. | Québec Gaspésie seller lists cod cheeks as fresh and frozen, and separately lists Atlantic-halibut cheeks. It does not provide a scientific name for the cod item, a current on-hand inventory, a bilingual consumer label, or cheek-specific amounts. |
| **WP04-SECTIONP-COD-CHEEKS-20261013-R65-S05** | La mer à bord, [Morue (joue)](https://lamerabord.com/produits-poisson-fruits-de-mer-iles-de-la-madeleine/morue-joue). | Québec-facing French page uses **Morue (joue)** / **Joues de morue** and describes a filleted, frozen product from the Gulf of St. Lawrence or North Atlantic. The undated page does not identify *Gadus morhua*, give a package or recipe amount, or establish a tested scallop substitution. |
| **WP04-SECTIONP-COD-CHEEKS-20261013-R65-S06** | Kata Seafoods, [Atlantic Cod Supplier Canada](https://www.kataseafoods.com/seafoodproducts/atlanticcod), Atlantic Cod Cheeks and species sections. | First-party Canadian wholesale page lists Atlantic Cod Cheeks separately from Atlantic Cod Tongues and identifies Atlantic cod as *Gadus morhua*. Wholesale marketing evidence; not a Québec retail label, cheek-specific pack size, or exact cheek-state specification. |
| **WP04-SECTIONP-COD-CHEEKS-20261013-R65-S07** | Canadian Food Inspection Agency, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), overview and common-name guidance. | Defines fish to include parts/products and says that a single-species product common name generally includes the species name unless a prescribed standard applies. Regulatory labeling guidance; it does not establish that this cut is a specific standardized product. |
| **P01** | Existing proposal, [cod tongues cut and state boundary review (round 31)](wp04-section-p-cod-tongues-cut-form-boundary-review-20261013-round31.md), especially scope and source note S05. | Explicitly excludes cod cheeks from its decision while noting that one supplier lists cheeks separately from tongues. This is an archive boundary check, not a prior cheek-form disposition. |

## Next action

Keep Atlantic cod cheeks out of the active picker and ledger for now. Revisit after bundled recipe demand or a search change that can display broader cheek/joue choices alongside the species-qualified cut. Do not promote generic fish cheeks or infer a common cut form across fish species.

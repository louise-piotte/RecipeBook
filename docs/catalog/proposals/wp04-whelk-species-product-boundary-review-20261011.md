# WP04 Section P — Whelk species and product-boundary review

- **Packet type:** root-integrated candidate hold for identity, Québec/Canadian naming, and product boundaries.
- **Research date:** 2026-10-11.
- **Scope:** whelk as a food ingredient, including Canadian common-name listings, Québec terminology, the Québec fishery, recipe demand, and the separation of identity from measurements and substitutions.
- **Recommendation:** keep a generic active `whelk / buccin` reference held. If a future recipe or imported product explicitly identifies *Buccinum undatum*, a species-scoped bilingual candidate is viable: **waved whelk / buccin commun**. Do not assign that identity from an unqualified “whelk,” “buccin,” or “bourgot” line.
- **Write scope:** this report only. No shared catalog, ledger, plan, roadmap, recipe, generated file, code, or test was changed.

## Plan and prior-review context

The open WP04 Section P checklist names “sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood with verified names.” The [seafood coordinator review](wp04-seafood-coordinator-review-20261009.md) leaves those regional foods as future identity work. The [mollusk/shellfish boundary review](wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md) does not decide whelk; the [sea-urchin](wp04-sea-urchin-uni-quebec-product-boundary-review-20261011.md), [abalone](wp04-abalone-ormeau-species-product-boundary-review-20261011.md), and [sea-cucumber](wp04-sea-cucumber-species-product-boundary-review-20261011.md) reviews each keep it outside their bounded scopes. None is a whelk identity decision.

`Requirements.md` describes IngredientReference, IngredientForm, measurement mappings, and directed substitution rules as separate catalog concerns. This review follows that separation: evidence for a food name does not supply a recipe amount, form, conversion, yield, or substitute.

## Naming finding and identity disposition

The Canadian and Québec sources support a narrow name pair for the species that anchors Québec's commercial whelk fishery:

| Scope | English | Québec French | Evidence and limit |
|---|---|---|---|
| Species-scoped future candidate | **waved whelk** (*Buccinum undatum*) | **buccin commun** (*Buccinum undatum*) | DFO's English and French Québec fishery plans pair “waved whelk” and “buccin commun” with *B. undatum*. The CFIA Fish List also lists *B. undatum* as `Whelk / Buccin`. This pair is viable only when a recipe or product source identifies *B. undatum*. [S01, S03, S04] |
| Generic market word | `whelk` | `buccin` | Do not resolve either bare term to one species. CFIA uses whelk for multiple taxa, and OQLF's `buccin` entry notes more than one species in Québec catches. [S01, S02] |

Hold a generic active identity, aliases, forms, and recipe links. The evidence supports food use and an identifiable Québec fishery, but it does not make every market use of “whelk” refer to *B. undatum*. DFO says the Québec commercial fishery focuses mainly on that species while noting other *Buccinum* species in the Estuary and Gulf. OQLF's food-product entry gives `buccin` as the normalized Québec term, but its catch note includes *Buccinum undatum* and *Neptunea despecta tornata*. [S02–S04]

Do not add bare `whelk`, `buccin`, `bourgot`, or `escargot de mer` as global aliases. OQLF specifically says `bourgot` and `escargot de mer` were not retained for Québec fish-product marketing to avoid consumer-label confusion, even though DFO records `bourgot` as a local name. Do not use `sea snail`, `whelk meat`, `whelk eggs`, or a market region as a proxy for a species. [S02, S04]

The English/French species-scoped pair above is a future candidate, not an active row. If a recipe only says “whelk,” “buccin,” or “bourgot,” retain it unresolved unless its cited recipe source or supplied product identifies the intended species. Do not transfer the Québec fishery's dominant species to an unqualified imported or regional market term.

## Distinctions from adjacent catalog concepts

| Term or category | Evidence-backed boundary | Catalog consequence |
|---|---|---|
| Periwinkle / bigorneau | The CFIA Fish List lists *Littorina* as `Periwinkle / Bigorneau`, separately from whelk entries. [S01] | Keep periwinkle separate; do not cross-alias it to whelk or buccin. |
| Conch / conque | The Fish List lists *Lobatus gigas* as Pink/Queen Conch and Conch/Conque. It also uses English `Whelk` for genus *Busycon*, with French rows `Busycon` and `Conque`. These source labels overlap at the word level but do not make conch and *Buccinum* one identity. [S01] | Keep conch separate. Do not infer *Busycon*, *Lobatus*, or *Buccinum* from `conque` alone. |
| Abalone / ormeau | The Fish List lists *Haliotis* species and *Haliotis* spp. under abalone/ormeau names; those are separate from the listed Buccinidae taxa. [S01] | Keep abalone separate; no shared alias or substitution. |
| Other gastropods | The Fish List separately names *Colus stimpsoni* (`Stimpson's Whelk / Colus de Stimpson`), *Neptunea lyrata decemcostata* (`Ridged Whelk / Buccin`), and *Nucella lapillus* (`Dog Whelk / Pourpre atlantique`), in addition to *B. undatum*. [S01] | Do not flatten compound whelk names or `buccin` across these taxa. Preserve exact source scope if another species is later requested. |
| Generic shellfish / fruits de mer | CFIA includes whelks among examples that may belong to a seafood mix labelled `fruits de mer`; that is a broad product category, not a species name. [S06] | Do not alias whelk to generic shellfish, seafood, or fruits de mer. |

These source-specific common-name rows are not a taxonomic crosswalk for every global market use. No species assignment is inferred from a word shared across them.

## Active catalog, exact-key, ledger, and proposal audit

The live package snapshot was read on 2026-10-11. The exact-key audit covered reference display names and aliases, form labels and match terms, and legacy-candidate names and aliases. Search normalization mirrored `IngredientSearch.kt` (lowercase/NFKD, accent and ligature folding, punctuation-to-space, and whitespace collapse), including its whole-phrase then partial-match behavior.

| Artifact | Current scope/count | Exact normalized keys checked |
|---|---:|---|
| Active ingredient references | 942 | `whelk`, `waved whelk`, `common whelk`, `Buccinum undatum`, `Buccinum`, `buccin`, `buccin commun`, `bourgot`, `escargot de mer`, `sea snail`, `periwinkle`, `bigorneau`, `conch`, `conque`, `abalone`, `ormeau`, `shellfish`, and `fruits de mer` |
| Active ingredient forms | 53 | Same terms, against form labels and match terms |
| Legacy import candidates | 75 | Same terms, against candidate names and aliases |

Snapshot SHA-256 values over exact file bytes: manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; active references `99dd50dfaeca7ff39689aa5578db70cdfedefcb4aad73d4668ec2a9513205e46`; forms `540eba0619c98e5b8fed5a3e1e3c808dd7f9e511940b1271707c55d14daf987a`; legacy candidates `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0`; research ledger `cb176b4d3b838cee50d3e666a76c6dd0324ed78c4ffba8c5a853ddf1bae64a22`.

No checked term has an exact owner in active references, forms, or legacy candidates; the current ingredient search index returns no catalog result for those exact queries. There is no current catalog collision to resolve. The **source-level** naming collision is material, however: the CFIA list has bare `Whelk` entries for *Buccinum undatum* and *Busycon*, and uses whelk in compound names for *Colus stimpsoni*, *Neptunea lyrata decemcostata*, and *Nucella lapillus*. It uses `Buccin` for both *B. undatum* and *Neptunea lyrata decemcostata*. It separately lists *Littorina* periwinkle and *Lobatus gigas* conch. This is why an exact source/product species is required before linking a recipe.

The research ledger contains **1,207 records, 3,499 source entries, and 2,846 distinct source IDs**. It has adjacent candidate records for abalone, sea urchin, sea cucumber, clam, mussel, fresh oyster, scallop, cuttlefish, and octopus, but no whelk/buccin identity or source record. The prefix `WP04-WHELK-20261011-` was checked against the ledger and `docs/catalog`; it has no prior ID collision. This report uses proposal-local source IDs only and does not add ledger records.

## Manifest-listed recipe demand audit

The seed manifest lists **114 recipe files / 1,123 ingredient rows**. I checked every row's `originalText`, `ingredientName`, preparation, and notes, and searched the manifest-listed recipe content for the whelk names, *Buccinum*, `buccin`, `bourgot`, `bigorneau`, conch/conque, abalone/ormeau, and gastropod terms. No row specifies whelk, a whelk species, or a whelk product.

Two broader mentions do not establish whelk demand:

- Recipe **093**, row 4, says `Cooked meat or seafood, to taste`; its description and notes likewise leave the choice generic.
- Recipe **097** describes seafood as one possible Alfredo add-in in its notes; no species or seafood product is named.

Neither row supports a whelk identity or recipe link. Recipe-corpus digest for this snapshot: `9dbc9b8e17b860ecbb20bc67c218f344729630ee922a844af8fe9c13a30157e1` (manifest-listed recipe basenames sorted lexically, then NUL, exact file bytes, then NUL).

## Measurement, form, and substitution disposition

**Identity:** Keep generic whelk held. Preserve the future candidate `waved whelk / buccin commun` only for evidence that explicitly identifies *Buccinum undatum*. No active reference, aliases, forms, or recipe link are proposed.

**Measurement and forms:** Add no household measures, density, unit mapping, package yield, ingredient form, or raw/cooked relationship. The Québec commercial and fishery sources describe products and processing for their own market contexts; those observations do not define a recipe form or transferable kitchen conversion. No quantity is taken from those descriptions.

**Substitution:** Add no same-ingredient conversion or ingredient-to-ingredient substitution. Culinary placement among seafood does not establish a replacement rule. Keep whelk distinct from periwinkle, conch, abalone, other gastropods, and generic shellfish.

## Source register

All web sources below were accessed 2026-10-11. CFIA Fish List lookup results display a site data date of 2023-09-18; the lookup is a dynamic list, and its entries are cited by exact scientific-name search. Sources support identity and naming only unless a narrower use is stated.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP04-WHELK-20261011-S01** | Canadian Food Inspection Agency, [Fish List lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fplist.asp) and [lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). | Exact scientific-name lookups returned *Buccinum undatum* TSN 73795 as `Whelk / Buccin`; *Busycon* TSN 74070 as `Whelk / Busycon` and `Conque`; *Colus stimpsoni* as `Stimpson's Whelk / Colus de Stimpson`; *Neptunea lyrata decemcostata* as `Ridged Whelk / Buccin`; *Nucella lapillus* as `Dog Whelk / Pourpre atlantique`; *Littorina* as `Periwinkle / Bigorneau`; *Lobatus gigas* as conch/conque names; and *Haliotis* spp. as abalone/ormeau. This is a Canadian common-name list, not evidence that an unqualified recipe term identifies a listed species or product state. |
| **WP04-WHELK-20261011-S02** | Office québécois de la langue française, [buccin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198884/buccin), last updated 2012. | Normalized Québec food/fishery term `buccin`; English equivalents include `whelk`, `waved whelk`, and `common whelk`; the Latin field gives Buccinidae and notes *Buccinum undatum* plus *Neptunea despecta tornata* in catches. Says `bourgot` and `escargot de mer` were not retained for Québec fish-product marketing. Terminology entry, not proof that each common-name use denotes one species. |
| **WP04-WHELK-20261011-S03** | Fisheries and Oceans Canada, [Integrated Fisheries Management Plan for Whelk (*Buccinum undatum*), Areas 1–15](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/whelk-buccin/2025/index-eng.html), English version. | Says the Québec commercial fishery focuses on the waved whelk, *B. undatum*, and notes other *Buccinum* species in the Estuary and Gulf. Supports the English species-scoped candidate and Québec fishery context; not a generic market-name rule or kitchen-measure source. |
| **WP04-WHELK-20261011-S04** | Fisheries and Oceans Canada, [Plan de gestion intégrée de la pêche du Buccin (*Buccinum undatum*), zones 1 à 15](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/whelk-buccin/2025/index-fra.html), French version. | Uses `buccin commun` for *B. undatum* and notes `bourgot` as a Québec local name. Together with OQLF's naming note, supports `buccin commun` as a species-scoped candidate and disfavors `bourgot` as a Québec commercial display. The plan is fishery-specific, not a rule for all imported products. |
| **WP04-WHELK-20261011-S05** | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [Les mollusques du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf), p. 2. | Documents buccin as a Québec edible seafood product and presents the scientific heading at Buccinidae family level with English `Whelk`. It corroborates local food-market context but does not resolve a single species; no portions, package sizes, preparation, or processing are transferred into catalog behavior. |
| **WP04-WHELK-20261011-S06** | Canadian Food Inspection Agency, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), section “Labelling of seafood mix products.” | Lists whelks among examples of invertebrates in products that may be labelled `fruits de mer`; these are product-category rules, not an individual whelk ingredient name or synonym. |

## Coordinator disposition

1. Keep generic `whelk / buccin` out of the active reference catalog while no recipe or imported product identifies its species.
2. Retain the viable future name pair **waved whelk / buccin commun** only for a product or recipe that explicitly identifies *Buccinum undatum*. Do not link a bare `whelk`, `buccin`, `bourgot`, or `sea snail` line by assumed market usage.
3. Keep periwinkle, conch, abalone, other whelk-named gastropods, and generic shellfish/seafood as separate concepts; do not add cross-aliases.
4. Add no forms, household measures, density, conversion, yield, recipe link, or substitution rule from these sources.
5. Leave the broader WP04 Section P checklist open.

## Root integration outcome

Root independently rechecked the CFIA Fish List overlap, the OQLF `buccin` entry, and the English/French DFO fishery plans. The generic candidate is recorded as `candidate-whelk` with six namespaced source entries; it remains held because bare `whelk` and `buccin` span multiple source taxa and no recipe or supplied product identifies a species. The future pair `waved whelk / buccin commun` remains scoped to explicit `Buccinum undatum` evidence. No active row, alias, form, numeric behavior, recipe link, or substitution was added.

# WP04 Section P — sauger / doré noir identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only species identity, Québec naming, search-boundary, and recipe-demand review.
- **Disposition:** Propose one identity-only `PROTEIN` reference for sauger / doré noir, *Sander canadensis*. Keep aliases empty. Add no form, recipe link, measure, conversion, yield, density, or substitution.
- **Worktree scope:** this proposal file only. No canonical JSON, ledger, recipe, checklist, plan, roadmap, generated file, code, or test was changed.

## Bounded recommendation

| Candidate ID | Category | English display | fr-CA display | Aliases | Species scope |
|---|---|---|---|---|---|
| `ingredient-ref-sauger` | `PROTEIN` | **sauger** | **doré noir** | None | *Sander canadensis* |

The Government of Québec’s current fauna entry pairs **Sauger** with **Doré noir**, gives *Sander canadensis*, and identifies the fish as freshwater fauna found in Québec. It says the species is prized for its flesh and taste. CFIA’s Fish List independently records *S. canadensis* and lists fish-label names for that taxon. The accepted name in these current sources is *Sander canadensis*; the older *Stizostedion canadense* remains a synonym in taxonomic sources and is the name used in older DFO/OQLF material. Keep the old name in source evidence only.

This is a distinct species identity from the active walleye / doré jaune row, *Sander vitreus*. It is supported as fish intended for human food by Québec’s description of its flesh, CFIA’s fish-label naming scope, 2024 commercial freshwater landings, and a current Canadian wholesaler’s sauger-fillet listing. Those sources establish an identity and bounded fish-market context; they do not establish that any seller has stock available to every Québec consumer or that all products called sauger have a verified species-specific specification.

## Name, label, and product boundaries

- Use only the qualified display pair **sauger / doré noir**. OQLF’s *doré noir* entry places the term in the edible-fish domain and identifies it as the preferred normalized Québec term. That entry was last updated in 1998 and uses the older synonym *Stizostedion canadense*; the more current Government of Québec species page and CFIA/ITIS records supply the modern scientific name.
- CFIA’s Fish List is a Canadian fish-label nomenclature source: its overview says it supplies English and French common names acceptable for fish labelling and scientific names used for fish-import identification. For *S. canadensis*, its current result rows include `Sauger` with no French name, `Baby Pickerel / Doré Noir`, and `Sauger Pike` with no French name. These are source-listed names, not interchangeable catalog aliases or a claim that one product label satisfies every regulatory requirement.
- Québec’s species page lists `doré charbonnier` as another French name and `sand pickerel`, `sand pike`, `blue pike perch`, and `grey pike perch` as other English names. Do not activate these as aliases. The application’s phrase search would make an alias containing `pickerel` surface on an unqualified `pickerel` query, even though CFIA assigns `Pickerel / Doré Jaune` and `Yellow Pickerel` to the distinct walleye taxon *S. vitreus*. Similarly, `sand pike` or `sauger pike` would surface on the broad `pike` query, which currently finds northern pike. `doré charbonnier` would broaden an already shared `doré` search.
- Do not merge sauger with walleye because Québec describes them as similar or because one seller compares their culinary qualities. The Government of Québec documents diagnostic differences between doré noir and doré jaune, and CFIA assigns the two to different species. No catalog-level equivalence or substitution follows.
- Keep this species identity separate from product states such as whole, dressed, fillet, fresh, frozen, salted, cooked, or smoked fish. A retailer’s listing or the Fish List does not define a default form for the catalog.

## Section P and prior-work boundary

The Section P parent line in the plan remains open for finfish and regional fish. Its current checklist includes the integrated walleye, northern pike, yellow perch, and many later species-specific decisions, but does not name sauger / doré noir. The freshwater-finfish proposal, current Section P next-fish and next-finfish sweeps, all Section P proposals, and every catalog batch were checked. A case-folded repository search for `sauger`, `doré noir`, *Sander canadensis*, and *Stizostedion canadense* found no focused sauger proposal, hold, integration, or legacy allocation. The existing walleye / doré jaune row remains a distinct neighboring identity.

The full audit also searched canonical references and forms, legacy candidates, the research ledger, the plan, and the complete proposal and batch text trees. No term or identifier owner for this candidate was found in those sources. This review does not reopen any of the already reviewed or held Section P fish and seafood candidates.

## Live snapshot and exact-key ownership

Snapshot read from the live worktree on 2026-10-12. File hashes cover exact bytes. The recipe digest iterates `manifest.v1.json` in its stored `recipeFiles` order and hashes each relative path, a NUL byte, exact recipe bytes, and a NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,288 references | `d20bc95f97b8d78ee6709655f3321ff000925c135862fd15cbc52e7d85e473ad` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,596 records; 5,718 source entries; 4,743 distinct source IDs | `91c80a5c5fc283dbdea2b1e6bda350f0eb1caf08ca8e4a596bd0a99cd5e9ceb1` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe-file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The exact-key audit mirrors [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, fold ligatures and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. It checked active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs.

| Candidate key or relevant exact key | Exact owner in active references / forms / legacy candidates / ledger IDs | Decision |
|---|---|---|
| `sauger` | None | Proposed English display. |
| `doré noir` | None | Proposed fr-CA display. |
| `Sander canadensis`; `Stizostedion canadense` | None | Taxonomy belongs in proposal/ledger evidence, not as search aliases. |
| `ingredient-ref-sauger`; `candidate-sauger` | Neither identifier is allocated. | The proposed reference ID is available; no legacy candidate exists to promote. |
| `doré jaune` | `ingredient-ref-walleye` | Keep as the separate *S. vitreus* display. |
| `pickerel`; `sand pickerel`; `baby pickerel`; `sand pike`; `sauger pike`; `doré charbonnier` | No exact stored-name owner. | These source terms are deliberately not aliases; their partial-query behavior creates misleading broad searches. |

Current matcher results for single-word/phrase queries were computed against all 1,288 references and 98 forms. `sauger` and `doré noir` return no current catalog result; with the proposed display pair and no aliases, each would return the new row. `doré` and accent-folded `dore` currently return **golden syrup / sirop doré** and **walleye / doré jaune**; the proposed `doré noir` display would make those queries return three rows. `pickerel` currently returns no catalog row, while official fish-name sources apply pickerel wording to both sauger and walleye. `pike` currently returns northern pike; adding a sauger alias containing `pike` would surface sauger there. The displays preserve the distinct names without storing generic aliases.

The proposal-local source IDs `WP04-SAUGER-20261012-S01` through `S07` were checked absent from the live ledger and all existing proposal and batch files before assignment. No source entry is being reissued under a new ID.

## Full recipe-demand audit

All 114 manifest-listed recipes and all 1,123 ingredient rows were scanned, including each row’s ingredient name, original text, reference/form identifiers, and every parsed string in each complete recipe file. Normalized phrases included `sauger`, `doré noir`, `doré charbonnier`, *Sander canadensis*, *Stizostedion canadense*, `sand pickerel`, `baby pickerel`, `sand pike`, `sauger pike`, `blue pike perch`, and `grey pike perch`.

**Result: zero matching ingredient rows and zero matching recipe files.** The corpus provides no sauger recipe link, product state, recipe quantity, portion, conversion, yield, or species-specific substitution. The recommendation is a bounded Section P identity-coverage addition, not a demand-driven recipe relink.

## Measurements and substitutions

Québec’s biological description reports observed fish sizes and weights; DFO reports commercial landings in tonnes and landed values; a wholesaler lists a particular case of frozen fillets. None is a kitchen portion, edible-yield factor, density, or unit mapping. The retailer’s pack details stay product-specific and do not become an active measure. No recipe identifies sauger as equivalent to walleye or another fish. If accepted, leave `defaultDensity` null and `unitMappings` empty; add no form, measure observation, package yield, recipe link, conversion, or global/contextual substitution.

## Recommended proposal delta

1. Add `ingredient-ref-sauger` as `PROTEIN`, with English display `sauger`, fr-CA display `doré noir`, and empty `aliasesEn` and `aliasesFr`, scoped to *Sander canadensis* in its evidence.
2. Keep walleye / doré jaune (*S. vitreus*) separate. Do not add common-name or scientific-name aliases from source lists.
3. Record the fish-label, Québec-name, and market evidence only as identity sources. Do not turn landings, biological size, risk-group classification, or one vendor’s package details into recipe, safety, measure, or substitution behavior.
4. Leave the Section P parent line open; this packet does not complete the broader fish and seafood work.

## Sources

Sources were accessed on 2026-10-12. Proposal-local IDs are not live ledger additions.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SAUGER-20261012-S01** | Gouvernement du Québec, [Doré noir](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/dore-noir) | Current Québec species page pairs `Doré noir` with `Sauger`, gives *Sander canadensis*, lists other regional names, describes its flesh as prized for quality and taste, and distinguishes it from doré jaune. Biological size and weight are not culinary measures. |
| **WP04-SAUGER-20261012-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [current Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | The overview defines Fish List scope as English/French common names acceptable for fish labelling and scientific names for fish import identification. Its current *S. canadensis* rows include `Sauger`, `Baby Pickerel / Doré Noir`, and `Sauger Pike`; the same table assigns `Pickerel / Doré Jaune` and `Yellow Pickerel` to *S. vitreus*. The rows carry an environmental-contaminants risk-group flag; that is a species hazard classification, not a consumption advisory. Fish-label nomenclature only; it does not make every row a safe alias or specify a retail product. |
| **WP04-SAUGER-20261012-S03** | OQLF, [doré noir, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198869/dore-noir) | Identifies `doré noir` as the normalized preferred Québec term, English `sauger`, and the edible-fish domain. Last updated 1998; its Latin name is the older synonym, so current taxonomic spelling follows S01/S02/S04. |
| **WP04-SAUGER-20261012-S04** | Integrated Taxonomic Information System, [*Sander canadensis*, TSN 650171](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=650171) | Records *S. canadensis* as a valid species and *Stizostedion canadense* as a synonym; supports resolving older sources without retaining the synonym as an application alias. Taxonomy only. |
| **WP04-SAUGER-20261012-S05** | Fisheries and Oceans Canada, [Freshwater landings, 2024](https://www.dfo-mpo.gc.ca/stats/commercial/land-debarq/freshwater-eaudouce/2024-eng.htm) | The latest table lists sauger commercial freshwater landings by nominal live weight: Québec 2 tonnes / $9,000; Ontario 147 tonnes / $451,000; Canada 148 tonnes / $459,000. Page modified 2026-02-13. This is catch/value evidence, not a consumer-stock guarantee or a kitchen measure. |
| **WP04-SAUGER-20261012-S06** | Palengke Wholesale, [Canadian wild-caught freshwater fish listing](https://www.palengke.ca/collections/canadian-wild-caught-fresh-water-fish) | The current Canadian wholesaler catalogue lists a flash-frozen, wild-caught sauger-fillet case as IQF, with an 11 lb case and 4/6 oz fillet description. These are product-specific package details; the listing does not establish universal stock, Québec distribution, a standard retail label, or a recipe portion. |
| **WP04-SAUGER-20261012-S07** | Gouvernement du Québec, [Limits, possession and identification of fish](https://www.quebec.ca/tourisme-loisirs-sport/activites-sportives-et-de-plein-air/peche-sportive/limites-possession-identification) | Current sport-fishing rules say fish caught under sport fishing cannot be sold. This distinguishes recreational possession from the separately reported commercial landings; it does not change the identity proposal or authorize a product claim. |

## Remaining Section P work

The sauger identity review resolves only the *Sander canadensis* / sauger / doré noir naming gap. The broader Section P fish, shellfish, seafood, roe, and regional-protein checklist remains open. Existing species identities and held generic-name boundaries remain unchanged.

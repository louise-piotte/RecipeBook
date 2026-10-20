# WP03 Section K generic edible-flower gap review — tawny daylily buds (R988)

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog data, research ledger, legacy candidates, recipes, plan, roadmap, or tests were changed.
- **Scope:** One generic edible plant-part identity: flower buds of *Hemerocallis fulva*. No brand, product-line, flavour, commercial SKU, retailer-variant, or cultivar roster.
- **Plan anchor:** Section K leaves “other documented edible flowers” open ([catalog plan, line 6677](../../RecipeBook-global-ingredient-catalog-plan.txt#L6677)). The neighboring caution at [line 6765](../../RecipeBook-global-ingredient-catalog-plan.txt#L6765) also keeps plant identities and handling cautions bounded and excludes any foraging-identification guarantee.

## Recommendation

Recommend one identity-only reference for **tawny daylily flower buds (*Hemerocallis fulva*) / boutons floraux d’hémérocalle fauve (*Hemerocallis fulva*)**. North Carolina State Extension’s species page says the buds and flowers of *H. fulva* are edible. The Canadian VASCAN taxon record accepts *H. fulva* and lists both `tawny daylily` and Québec-recorded `hémérocalle fauve` for that species. These sources support a species- and part-qualified generic culinary identity. [S01–S02]

Use the French compound as descriptive wording built from the VASCAN species name; this review does not claim that it is an OQLF-standardized culinary term. Keep the identity strictly at *H. fulva* flower buds. The source-specific edible-part claim does not extend to other *Hemerocallis* species or hybrids, true lilies (*Lilium*), or the plant’s leaves, shoots, roots, open flowers, or dried-bud preparations. Do not add bare `daylily`, `lily`, `lis d’un jour`, `golden needles`, or generic `flower buds` aliases.

## Proposed minimal state

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-tawny-daylily-buds` |
| `nameEn` | `tawny daylily flower buds (Hemerocallis fulva)` |
| `nameFr` | `boutons floraux d’hémérocalle fauve (Hemerocallis fulva)` (descriptive, provisional) |
| `aliasesEn` / `aliasesFr` | `[]` / `[]` |
| `category` | `VEGETABLE_AND_AROMATIC` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| `updatedAt` | `2026-10-19T00:00:00Z` |
| Forms / recipe links | None |

If integrated, the ledger identity state may be `verified` from the species and edible-bud evidence in S01–S02. Keep `measurementState` and `substitutionResearchState` as `not_yet_researched`; use no `measurementObservations` or `substitutionFindings`. No form, measurement, conversion, yield, recipe link, safety threshold, or active substitution is proposed.

## Ownership and recipe demand

The live package snapshot contains **2,003 ingredient references**, **205 forms**, **2,408 research-ledger records**, and **55 legacy candidates**. Its manifest lists **114 recipe files** and **1,123 structured ingredient rows**.

| Surface | Finding |
|---|---|
| Active references and forms | No owner was found for the proposed ID, *Hemerocallis fulva*, tawny/orange daylily buds, or the French species and part terms. No related form exists. |
| Legacy candidates | No candidate matches the species, part, or proposed names. No legacy item is promoted or reused. |
| Research ledger and source URLs | No ledger record owns the candidate terms or any of the three source URLs below. The source-ID prefix `WP03-K-HEMEROCALLIS-FULVA-BUDS-R988-20261019` is unused. No existing record’s evidence is transferred. |
| Prior proposal and batch archive | Searches for the proposed names and taxon found no focused prior review or integration. This candidate is separate from existing borage, rose, nasturtium, hibiscus, calendula, elderflower, chive-blossom, garlic-chive-flower, dill-flower-head, and squash-blossom identities. |

All **114 manifest-listed recipes** and **1,123 structured ingredient rows** were checked for `daylily buds`, `day lily buds`, `tawny daylily`, `orange daylily`, *Hemerocallis fulva*, *Hemerocallis*, `hémérocalle fauve`, `hémérocalle`, `lis d’un jour`, `golden needles`, `dried lily buds`, and `aiguilles d’or`. The scan found **zero file hits and zero ingredient-row hits**. No recipe link or relink is proposed.

The Section K checklist asks for generic edible-flower diversity, not a commercial roster. No roster-only queue task was encountered at this anchor. The plan’s Broccolini mention is an alias/trademark exclusion, not a queued identity assignment. If a brand-, product-line-, flavour-, SKU-, cultivar-roster-, or retailer-variant-only task appears in this queue, mark it out of scope because **commercial-product counts do not add ingredient diversity**, and stop that line. No such research is pursued here. Preserve all existing branded entries and keep their product-scoped evidence and measurements on their current owners.

## Boundaries and evidence limits

The proposal’s identity scope is the edible flower bud of positively identified *H. fulva*. The North Carolina State Extension claim is species-specific; do not transfer it to the genus or to visually similar ornamental plants. VASCAN’s `lis d’un jour` synonym is not adopted because bare lily wording can blur the distinction from true lilies. The UQAC page in S03 discusses *Hemerocallis* sp. as a genus-level edible-flower topic; it is used only as local French part-wording context and does not supply species-specific edibility evidence for this proposal.

No reviewed source or bundled recipe establishes a transferable household portion, count-to-mass measure, density, yield, drying or rehydration conversion, substitution, or general handling or safety threshold. The UQAC page’s harvest-season and flavour descriptions remain limited to its *Hemerocallis* sp. teaching resource. No numeric data or preparation advice is transferred. This catalog identity is not a plant-identification, wild-harvesting, or food-safety guide; other species, hybrids, ornamental plants, and pesticide-exposed material remain outside this review.

No cultivar or variety information is used. No branded row, commercial product, or product-specific measurement is added, generalized, merged, or removed.

## Sources

All IDs below are proposal-local and unique; none is present in the live ledger.

| ID | Source and type | Claim supported and limits |
|---|---|---|
| `WP03-K-HEMEROCALLIS-FULVA-BUDS-R988-20261019-S01` | North Carolina State University Extension, [Hemerocallis fulva](https://plants.ces.ncsu.edu/plants/hemerocallis-fulva/) (`extension`); accessed 2026-10-19. | Species-specific page identifies *H. fulva* and states that its buds and flowers are edible. Use only the bud edibility and taxon match. Its unrelated horticultural details do not establish cultivar scope, Québec supply, a measure, or general safety advice. |
| `WP03-K-HEMEROCALLIS-FULVA-BUDS-R988-20261019-S02` | Canadensys, [Database of Vascular Plants of Canada (VASCAN): *Hemerocallis fulva*](https://data.canadensys.net/vascan/name/Hemerocallis%20fulva) (`other`); accessed 2026-10-19. | Lists *H. fulva* as an accepted species and gives the French name `hémérocalle fauve` and English `tawny daylily`; the record cites Québec occurrence. Taxonomy and vernacular names only; not culinary edibility, an OQLF ruling, or recipe evidence. The separate `lis d’un jour` name is excluded from aliases. |
| `WP03-K-HEMEROCALLIS-FULVA-BUDS-R988-20261019-S03` | Université du Québec à Chicoutimi, Forêt nourricière, [Hémérocalle, *Hemerocallis* sp.](https://www.uqac.ca/foretnourriciere/les-fleurs-comestibles/hemerocalle/) (`culinary_reference`); accessed 2026-10-19. | Uses the French words `hémérocalle` and `bouton de fleur` in a genus-level edible-flower teaching page. It supports the descriptive French part wording only. It does not identify its plants as *H. fulva*, so its culinary claims, season, and taste are not transferred to the species-specific row. |

## Disposition

Recommend one identity-only `VEGETABLE_AND_AROMATIC` reference for *Hemerocallis fulva* flower buds with the species-qualified displays above and empty alias arrays. Keep all other daylily taxa and plant parts unresolved. Preserve existing flower identities and branded rows. Add no forms, measures, conversions, yields, recipe links, safety conclusions, or active substitutions. Section K’s edible-flower review remains open.

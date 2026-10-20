# WP04 Section P R551 — Atlantic halibut cheeks picker-boundary review

- **Review and source-access date:** 2026-10-17.
- **Packet:** Finfish cut-form, bilingual naming, source-ID ownership, picker projection, bundle demand, package and measurement evidence, and substitution review.
- **Status:** Integrated as a documentation-only hold on 2026-10-17; see the [R549–R551 integration README](../batches/wp02-wp03-wp04-r549-r551-gap-review-integration-20261017/README.md). No catalog or ledger entry was added.
- **Candidate:** Atlantic halibut cheek cut under the existing `ingredient-ref-atlantic-halibut` reference.
- **Disposition:** **Hold the cut form outside active data for now.** Current Québec commercial and culinary sources support Atlantic halibut cheeks and the Québec French wording `joue(s) de flétan`. With the live picker, adding that species-qualified bilingual form would also make broad `cheek(s)` and `joue(s)` searches resolve to Atlantic halibut alone. The bundled recipe corpus has no halibut demand.

## Open checklist anchor and prior-work check

The open Section P parent at [plan line 6330](../../RecipeBook-global-ingredient-catalog-plan.txt#L6339) includes halibut and broader finfish coverage. Keep that parent open; this review resolves only the candidate cut boundary.

The exact prior-work check found no focused Atlantic-halibut-cheek disposition, allocated form ID, active reference, legacy candidate, or research-ledger record. The proposed form ID `ingredient-form-atlantic-halibut-cheeks` and the source-ID prefix below are unallocated in the reviewed snapshot.

- The [R65 Atlantic cod cheeks hold](wp04-section-p-atlantic-cod-cheeks-cut-form-boundary-review-20261013-round65.md) explicitly excludes Atlantic halibut cheeks from its decision. It notes that a Gaspésie fish seller lists cod cheeks and Atlantic-halibut cheeks separately. This R551 review takes up that excluded neighboring cut as its own candidate; it does not extend the cod decision to halibut.
- R65 reuses OQLF's `joue / cheek` terminology entry, which applies the fish cut across morue, flétan, baudroie, and raie. That source makes the generic-query collision relevant here, but it does not settle the product naming or picker disposition for one halibut species.
- The [R545 Atlantic halibut steak form](wp04-section-p-atlantic-halibut-steak-form-review-r545-20261017.md) is already integrated. It concerns a different cut, `Atlantic halibut steak / darne de flétan de l’Atlantique`, and keeps generic `darne` out of its match terms. It does not allocate cheek terminology.
- The [R548 rainbow-trout fillet hold](wp04-section-p-next-gap-review-r548-20261017.md) concerns another species and cut. R542's cutlassfish naming hold is also unrelated to this halibut cut.

## Species and product boundary

If the picker later supports this cut, keep it as a cut-only form under `ingredient-ref-atlantic-halibut`, not as a separate ingredient identity. The existing parent is `Atlantic halibut / flétan de l’Atlantique`, with French alias `flétan`; the parent identity ledger reuses OQLF and CFIA evidence for *Hippoglossus hippoglossus*. The 2026 Fisheries and Oceans Canada groundfish plan distinguishes Atlantic halibut (*Hippoglossus hippoglossus*) from Greenland halibut (*Reinhardtius hippoglossoides*). These identity sources do not establish a cheek product or a cut rule.

The Québec Office de la langue française (OQLF) defines `joue` as a commercializable fish part, prefers `joue` for Québec fish-product marketing, gives English `cheek`, and lists morue, flétan, baudroie, and raie among the species to which the cut may apply. OQLF says `bajoue` was not retained for Québec fish-product marketing to avoid consumer-label confusion. The entry is terminology evidence, last updated in 2012; it is not a taxonomic finding about a particular cheek product or proof of current stock.

Pêcherie Manicouagan's paired Québec-facing pages place French `Joue de flétan surgelée IQF` and English `IQF-frozen halibut cheeks` under its Atlantic Halibut product page. They list `2 x 5 lbs per case`. The paired language routes are two views of one distributor's product family, not independent product evidence. The page does not provide a Latin binomial, retail SKU, cheek count, individual mass, edible-yield basis, or current store inventory. The product listing supports a frozen case product; it does not establish that all halibut cheeks are frozen.

Pêcheries M.C. Gaspésie's current English product page lists fresh and frozen cheeks separately beneath its Atlantic halibut heading. It also states that selection changes with seasons and arrivals. This supports a Québec seller's species-qualified market grouping, but does not show a Latin binomial, exact French product label, cheek-specific amount, or real-time availability.

The Québec Maritime regional article published 2026-01-18 uses `ceviche de joues de flétan de l’Atlantique` and cautions readers not to confuse Atlantic halibut with Greenland halibut/turbot. It supports Québec culinary usage and species-qualified wording; it is editorial tourism material, not a retail listing, formal taxonomy source, or standardized recipe.

## Catalog, ledger, and source-ID ownership

Review-time read-only snapshot before R549–R551 integration, on 2026-10-17: **1,805 active ingredient references**, **148 ingredient forms**, **56 legacy candidates**, and **2,166 research-ledger records**. The ledger had 9,994 source entries, 8,449 distinct source IDs, and 7,141 distinct URLs. The manifest lists **114 recipe files** with **1,123 structured ingredient rows**.

The active parent `ingredient-ref-atlantic-halibut` has no English alias, has the French alias `flétan`, and has null default density and an empty `unitMappings` array. Its only attached form is the R545 Atlantic-halibut-steak form, with empty match-term arrays and null density. The identity ledger record has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; the steak-form record has `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`. No cheek-specific candidate or form record exists.

Exact normalized searches across active references and forms, the 56 legacy candidates, the research ledger, prior proposals and batches, and the plan found no owner for:

- `Atlantic halibut cheek(s)`, `halibut cheek(s)`, `cheek(s) of Atlantic halibut`;
- `joue(s) de flétan de l’Atlantique`, `joue(s) de flétan`;
- the proposed ID `ingredient-form-atlantic-halibut-cheeks`.

The new proposal-local source-ID prefix is **`WP04-SECTIONP-ATLANTIC-HALIBUT-CHEEKS-R551-20261017-`**. No use of the prefix was found in `docs/catalog` before drafting. Reuse existing IDs for already-owned evidence rather than assigning duplicate IDs: `WP04-FINFISH-ID-20261009-S04` for the Atlantic-halibut OQLF identity entry; `WP04-P-GREENLAND-HALIBUT-20261012-S04` for the DFO 2026 English plan; `WP04-SECTIONP-COD-CHEEKS-20261013-R65-S01` for OQLF's `joue / cheek` entry; and `WP04-SECTIONP-COD-CHEEKS-20261013-R65-S04` for the Gaspésie seller URL. The Manicouagan bilingual pages, Québec Maritime article, and Zeste recipe have no exact URL owner in the current ledger and receive proposal-local IDs in the source table. No source or ledger record is being added by this proposal.

## Picker projection and alias scope

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it searches reference and attached-form display labels and aliases by complete normalized word phrases first, then partial substring matches. A form label returns its parent reference; a form hint is shown only when the full form label is explicit in the query. Thus a species-qualified display label can still capture shorter generic cut terms.

| Query | Current result | Projection with a single bilingual Atlantic-halibut-cheek form | Effect |
|---|---|---|---|
| `Atlantic halibut` | Atlantic halibut | Atlantic halibut | Unchanged species-qualified query. |
| `halibut` | Atlantic, Greenland, Pacific, and smoked Greenland halibut | Same four | Broad English species family remains multi-result. |
| `flétan` | Atlantic, Greenland, Pacific, and smoked Greenland halibut | Same four | Broad French species family remains multi-result. |
| `Atlantic halibut cheeks`; `halibut cheeks`; `joues de flétan de l’Atlantique`; `joues de flétan` | No result | Atlantic halibut only | The form would resolve the full product name, but also narrow the less-qualified phrase. Only exact full labels would show the cut hint. |
| `cheek`; `cheeks`; `joue`; `joues` | No result | Atlantic halibut only | The bilingual label itself contains the generic cut terms; shorter singular forms also match by substring fallback. |
| `fish cheek`; `joues de poisson` | No result | No result, if generic match terms stay absent | Do not add generic aliases or match terms to the Atlantic parent. |

The live picker cannot represent this source-backed multi-species cut scope with one Atlantic-halibut form while keeping broad `cheek/joue` queries broad. Adding aliases would expand the same scope problem. Keep `bajoue`, bare `cheek(s)`, bare `joue(s)`, `fish cheek(s)`, and generic `joues de poisson` out of the active parent and form match terms.

## Recipe demand, package, and measurement evidence

The corpus audit read all **114 manifest-listed recipes** and **1,123 ingredient rows** and searched the full recipe documents for `halibut`, `flétan`, `cheek`, and `joue` terms. It found **zero matching files and zero matching rows**. There is no bundled recipe link or bundle-driven reason to activate the cut.

External source material documents product and recipe demand, but only within its own scope:

- Manicouagan's `2 x 5 lbs per case` is a supplier case-pack statement. It is not a serving, portion, cheek count, per-cheek mass, package-yield mapping, or recipe conversion.
- Zeste's recipe is labeled four portions and calls for four Atlantic-halibut cheeks at 100 g each, pan-seared for 1.5–2 minutes per side. The accessible page shows no publication date. Treat 100 g each and the cooking time as recipe-specific instructions, not as a standard unit mapping, required portion, or universal cooking rule. The page does not state a purchasing/edible-weight basis, trimming, skin/bone state, or cooking yield.
- Pêcheries M.C. Gaspésie distinguishes fresh and frozen product listings without quantities. Neither that page nor the regional article establishes a pack-to-recipe relationship.

No reviewed source supports a cheek-specific density, count-to-mass mapping, volume measure, reusable portion, edible yield, thawing or cooking yield, or conversion between fresh and frozen cheek products. Keep parent density and unit mappings unchanged; add no package-yield row, unit mapping, conversion, observation as an active measure, or recipe link.

## Substitution scope

No reviewed recipe or product source supports replacing Atlantic halibut cheeks with Atlantic-halibut steak, fillet, cod cheeks, Greenland or Pacific halibut, monkfish or skate cheeks, or another seafood at a stated amount and method. The current Greenland-halibut ledger record preserves a broad MAPAQ substitute note for Greenland halibut versus Atlantic halibut and other fish, but the ledger leaves it `blocked_pending_evidence` because the note supplies no recipe role, method, form-state pair, or replacement amount. Do not transfer that species-level note to the cheek cut. Add no form-to-form or contextual substitution rule and no recipe-line substitution.

## Bounded recommendation and integration

Hold Atlantic halibut cheeks outside active references, forms, and the research ledger. Do not create a separate identity, aliases, match terms, recipe link, active measurement, density, unit mapping, conversion, package yield, or substitution. The sources verify that a Québec-facing product and culinary usage exist; they do not justify making this one species the sole result for a generic fish cheek query, and the bundled library has no demand.

If the picker later supports a broad cheek/joue choice alongside species-qualified cuts, or focused recipe/import demand requires this form while preserving cut scope, reopen only the Atlantic-halibut-cheek form under `ingredient-ref-atlantic-halibut`. Keep the Section P finfish parent open. Root recorded the hold in the plan and roadmap; no catalog, ledger, recipe, or code change was made for R551.

## Sources and limits

Sources were accessed on 2026-10-17 unless their existing ledger/proposal records provide an earlier access date. Newly allocated IDs below remain proposal-local.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **Reused `WP04-FINFISH-ID-20261009-S04`** | OQLF, [flétan de l’Atlantique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198639/fletan-de-latlantique). | Supplies the Québec-preferred species name, English equivalent, short French name, and *Hippoglossus hippoglossus*. Identity evidence only; it does not establish cheeks as a cut or support measures. |
| **Reused `WP04-P-GREENLAND-HALIBUT-20261012-S04`** | Fisheries and Oceans Canada, [2026 Gulf of St. Lawrence Groundfish Integrated Fisheries Management Plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2026/groundfish-poisson-fond-4rst-3pn-4vn-eng.html), including the Atlantic-halibut and Greenland-halibut species listing. | Current Canadian source distinguishes *Hippoglossus hippoglossus* from *Reinhardtius hippoglossoides*. Fishery identity/management source; it does not establish cheek-product naming, retail availability, measures, or substitutions. The English URL is the URL owned by the existing ledger source ID. |
| **Reused `WP04-SECTIONP-COD-CHEEKS-20261013-R65-S01`** | OQLF, [joue (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199070/joue). | Prefers `joue` for Québec fish-product marketing, gives `cheek`, and lists morue, flétan, baudroie, and raie as commercial-scope species. Last updated 2012; terminology evidence, not a species-specific cut label or availability source. |
| `WP04-SECTIONP-ATLANTIC-HALIBUT-CHEEKS-R551-20261017-S01` | Pêcherie Manicouagan, [Flétan de l’Atlantique](https://manicouaganfisheries.com/fr/nos-produits/fletan-de-l-atlantique). | Lists `Joue de flétan surgelée IQF`, `2 x 5 lbs par caisse`, under the Atlantic-halibut page. Current Québec distributor product listing; it does not identify a Latin taxon, retail SKU, per-cheek mass, recipe amount, or current inventory. |
| `WP04-SECTIONP-ATLANTIC-HALIBUT-CHEEKS-R551-20261017-S02` | Pêcherie Manicouagan, [Atlantic Halibut](https://manicouaganfisheries.com/en/our-products/atlantic-halibut). | Paired English route for S01, listing `IQF-frozen halibut cheeks`, `2 x 5 lbs per case`. Same distributor/product family as S01, not independent product evidence. Case pack is not a reusable kitchen measure or package-yield mapping. |
| **Reused `WP04-SECTIONP-COD-CHEEKS-20261013-R65-S04`** | Pêcheries M.C. Gaspésie, [Products](https://pecheriesmcgaspesie.com/en/produits/), current fish listing. | Under Atlantic halibut, lists cheeks as fresh and frozen; the page says its selection changes with seasons and arrivals. It does not give scientific name, French product wording, cheek-specific amount, or real-time inventory. The exact URL is already archived in R65. |
| `WP04-SECTIONP-ATLANTIC-HALIBUT-CHEEKS-R551-20261017-S03` | Québec Maritime, [Au large des Îles de la Madeleine... une mer de saveurs!](https://www.quebecmaritime.ca/blogue/au-large-des-iles-de-la-madeleine-une-mer-de-saveurs), 2026-01-18. | Uses `ceviche de joues de flétan de l’Atlantique` and distinguishes it from Greenland halibut/turbot. Regional editorial usage, not a formal taxonomy source, current SKU, or standardized recipe. |
| `WP04-SECTIONP-ATLANTIC-HALIBUT-CHEEKS-R551-20261017-S04` | Zeste, [Joues de flétan aux algues](https://www.zeste.ca/recettes/joues-de-fletan-aux-algues), recipe by Daniel Vézina. | Four portions; four Atlantic-halibut cheeks of 100 g each; pan-sear 1.5–2 minutes per side. The page shows no publication date and is not bundled. Recipe-specific amount/method only, not a standard measure, product specification, edible-weight basis, yield, or substitution. |
| **R01 — repository audit** | Active references/forms, `legacy-import-identities.v1.json`, research ledger, package-yield and substitution files, Section P plan/proposal/batch archive, `IngredientSearch.kt`, and every manifest-listed recipe. | Workspace snapshot on 2026-10-17. Confirms exact current ownership, query projection, and zero bundle demand. No shared file was edited. |

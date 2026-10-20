# WP04 Section P — Atlantic cutlassfish / sabre picker hold (R542)

- **Review and source-access date:** 2026-10-17.
- **Candidate reviewed:** *Trichiurus lepturus* (one species-specific finfish candidate from the open Section P parent item).
- **Packet type:** Proposal-only species-identity, Canadian naming, picker-boundary, corpus, and product-measure review.
- **Disposition:** **Integrated hold** *T. lepturus* outside active references and the shared research ledger. OQLF maps Québec-preferred `sabre` to *T. lepturus* and pairs it with `Atlantic cutlassfish`, but the CFIA Fish List uses `sabre`, `cutlassfish`, `scabbardfish`, and `hairtail` across several fish taxa. A current Ontario seafood retailer also uses the exact English phrase `Atlantic Cutlassfish` for a product it lists as *Lepidopus xantusi*; ITIS treats that name as a junior synonym of *L. caudatus*, which CFIA lists separately. The app would return *T. lepturus* alone for `sabre`, `Atlantic cutlassfish`, and bare `cutlassfish` if a row were added. No unambiguous bilingual picker identity is supported while those exact-name collisions remain unresolved.
- **Scope:** Added the supported hold beneath the still-open Section P plan parent and recorded it in `roadmap.md`; no catalog or ledger JSON, legacy candidate, recipe, or code changed. This documentation-only hold needed no software tests, build, emulator check, or deployment. See the [R541–R542 integration README](../batches/wp03-wp04-r541-r542-gap-review-integration-20261017/README.md).

## Open parent item and prior-work boundary

The open Section P parent checklist still includes regional fish, alongside salmon, cod, pollock, halibut, sole, flounder, turbot, bass, bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, and bonito. The broader parent remains open in [`RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt) and `roadmap.md`.

A case-insensitive search of active references, forms, legacy candidates, the full research ledger, proposal and batch archives, the Section P plan/workflow, and bundled recipe JSON found no focused allocation or held decision for *Trichiurus lepturus*, `Atlantic cutlassfish`, `cutlassfish`, `scabbardfish`, `hairtail`, or `ribbon fish`. The proposed reference ID `ingredient-ref-atlantic-cutlassfish` and this R542 source-ID prefix are unallocated. The swordfish / espadon proposal mentions `poisson-sabre` only as a term not retained for *Xiphias gladius*; it does not review *T. lepturus* or decide its identity. [R01]

The Fresh Water Foods URL has prior shared-ledger ownership for a different product locator: R311 records its Indian Mackerel section under `WP04-SECTIONP-INDIAN-MACKEREL-R311-20261016-S02`. R252 also consulted the page for pomfret products. Those entries do not mention or decide the Ribbon Fish listing reviewed here; this proposal does not create a duplicate shared-ledger entry. [R01, S05]

## Species and name evidence

OQLF’s GDT entry is in edible fish terminology and identifies *Trichiurus lepturus* directly. It gives `sabre` as the preferred Québec French term and `Atlantic cutlassfish` as English. It also lists `scabbardfish` and `cutlassfish` among its English terms. The entry labels `poisson-sabre commun` as a France term and says `coutelas` and `poisson-sabre commun` were not retained by the Committee on Fish Products Terminology. These terms are not proposed as aliases. [S01]

CFIA describes its Fish List as a Canadian source of fish-label names linked to scientific names and Taxonomic Serial Numbers. It lists *T. lepturus* (TSN 172385) with `Cutlassfish / Sabre`, plus `Scabbardfish` and `Hairtail` rows. The same exact names are assigned to other listed taxa:

| CFIA taxon and TSN | Relevant English / French rows |
|---|---|
| *Aphanopus carbo* — 172389 | `Scabbardfish / Sabre`; `Black Scabbardfish / Sabre noir` |
| *Lepidopus caudatus* — 172391 | `Cutlassfish / Sabre`; `Scabbardfish / Sabre argenté`; `Hairtail` |
| *Lepturacanthus savala* — 551146 | `Cutlassfish / Poisson-sabre`; `Hairtail / Sabre` |
| *Trichiurus lepturus* — 172385 | `Cutlassfish / Sabre`; `Scabbardfish`; `Hairtail` |

The overlap is in accepted Canadian market-name words, not a claim that these fish are taxonomically or culinarily interchangeable. The Fish List does not support substitutions, recipe equivalence, or safety conclusions. [S02]

## Current Canadian product naming conflict

Seafood Depot in Vaughan, Ontario currently lists a whole, fresh “Belt Fish” product as *Lepidopus xantusi* and says it is also known as “Ribbonfish or Atlantic Cutlassfish.” ITIS identifies *L. xantusi* (TSN 172392) as an invalid junior synonym with valid name *Lepidopus caudatus*; the CFIA Fish List separately gives *L. caudatus* `Cutlassfish / Sabre` names. The exact English phrase `Atlantic Cutlassfish` therefore has current Canadian seller use on a product attached to a different scientific name than OQLF’s *T. lepturus* entry. This review does not reinterpret the seller’s product or treat the species as substitutes. [S02–S04]

Fresh Water Foods Inc., a Richmond Hill, Ontario importer/wholesaler, lists “Ribbon Fish” as *Trichiurus lepturus*. Its page lists whole-round fish and cut portions, with seller-specific size bands and packaging. It says retail pouches carry bilingual product names but does not display a French name for this item. This is current Canadian product/taxon evidence, but not a direct bilingual product label resolving the competing `Atlantic Cutlassfish` and `Ribbonfish` usages. [S05]

## Active ownership and archive audit

Snapshot read from the live workspace on 2026-10-17: **1,805 active references**, **146 forms**, **56 legacy candidates**, **2,164 ledger records / 9,957 source entries**, and **114 manifest-listed recipes / 1,123 ingredient rows**. The candidate binomial, proposed reference ID, English and French terms, and seller names have no active reference/form/legacy owner and no candidate-specific ledger record. The OQLF `sabre` URL and Seafood Depot belt-fish page are not already allocated in the ledger. The Fresh Water Foods URL is already present only under the unrelated R311 Indian-Mackerel product locator described above. The exact word `sabre` occurs incidentally in the swordfish terminology boundary record, not as a *T. lepturus* identity or allocation. [R01]

| Term checked | Active catalog owner now | Naming evidence / boundary |
|---|---|---|
| `Atlantic cutlassfish` | None | OQLF pairs it with *T. lepturus*; Seafood Depot uses the exact phrase for its *L. xantusi* / ITIS *L. caudatus* Belt Fish product. |
| `sabre` | None | OQLF prefers it for *T. lepturus* in Québec; CFIA also assigns the exact French name to *A. carbo*, *L. caudatus*, and *L. savala*. |
| `cutlassfish` | None | OQLF lists it for *T. lepturus*; CFIA lists it for *L. caudatus* and *L. savala* as well. |
| `scabbardfish`, `hairtail` | None | OQLF lists them for *T. lepturus*; CFIA uses them for multiple related but separate listed taxa. |
| `ribbon fish` / `ribbonfish` | None | Fresh Water Foods uses it for *T. lepturus*; Seafood Depot uses Ribbonfish for its separately named Belt Fish product. Do not activate as a taxon-specific alias. |
| *Trichiurus lepturus* | None | OQLF and CFIA provide species identity evidence, but scientific names are not proposed as picker aliases. |

## Picker projection

The projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the picker returns complete normalized word-phrase matches first, then uses substring matching only when no phrase matches. Current searches for all terms in the table return no result. The hypothetical row uses only the OQLF display pair `Atlantic cutlassfish / sabre`, with no aliases or forms. It is shown only to explain the hold; it is not an integration proposal.

| Query | Current picker | With hypothetical display pair | Decision effect |
|---|---|---|---|
| `Atlantic cutlassfish` | None | *T. lepturus* only | Exact phrase collides with Seafood Depot’s current Canadian use for its *L. xantusi* / ITIS *L. caudatus* product. |
| `sabre` | None | *T. lepturus* only | CFIA assigns the exact French word to four species, so a singleton would be misleading. |
| `cutlassfish` | None | *T. lepturus* only | The picker matches the one-word phrase inside `Atlantic cutlassfish`; CFIA lists the term for multiple species. |
| `scabbardfish` | None | None | Not added as an alias; CFIA and OQLF usage is not species-exclusive. |
| `hairtail` | None | None | Not added as an alias; CFIA uses it for multiple species. |
| `ribbon fish` / `ribbonfish` | None | None | No alias; current Canadian seller usage names more than one taxon. |
| `Trichiurus lepturus` | None | None | Scientific name stays out of picker terms. |

The specific English and Québec terms are individually supported for *T. lepturus*, but a new row would make broad and conflicting Canadian product names appear resolved to that species alone. Keep the entire identity outside active picker data until those terms can preserve their broader scope or a separate, genuinely unambiguous bilingual name is supported. [R01–S05]

## Full bundled recipe corpus

All **114 manifest-listed recipe JSON files** and all **1,123 `ingredients[]` rows** were scanned for the candidate binomial, OQLF/CFIA terms, the seller’s `Ribbon Fish` and `Belt Fish` names, the *Lepidopus* names, and adjacent spellings including `poisson-sabre`, `poisson sabre`, `poisson-sabre commun`, and `coutelas`. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe supplies a quantity, preparation, form, role, method, recipe link, or candidate-specific substitution. [R01]

## Forms, quantities, and substitution boundary

Fresh Water Foods lists whole-round fish and cut portions, seller-specific whole sizes of 700/1000 g, 4–5-inch and 7–8-inch portions, and packs of 10 kg, 10 × 2 lb, or 20 × 400 g. These are supplier product grades and cases, not recipe quantities or reusable household measures; the site does not establish a general conversion, density, edible yield, or recipe form for *T. lepturus*. Seafood Depot’s whole/fresh listing is for its separately identified Belt Fish item, not evidence for an app form under this candidate. Add no form, measure, unit mapping, density, conversion, yield, recipe link, or substitution. Do not infer safety, preparation equivalence, or species equivalence from the shared product names. [S03–S05]

## Bounded recommendation

**No active JSON patch is proposed.** Keep *Trichiurus lepturus* outside active references, aliases, forms, legacy identities, and the shared ledger. Do not allocate `sabre`, `Atlantic cutlassfish`, `cutlassfish`, `scabbardfish`, `hairtail`, `ribbon fish`, or `ribbonfish` as an alias. Keep seller package details source-scoped, and add no culinary or taxonomic equivalence rule. Revisit only when Canadian name ownership and bilingual product evidence support a distinct picker result without making a broad query resolve to one species.

## Sources

Sources were accessed 2026-10-17. IDs below are proposal-local unless noted; they are not new shared research-ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ATLANTIC-CUTLASSFISH-R542-20261017-S01** | Office québécois de la langue française, [GDT: sabre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198978/sabre) | Identifies the edible fish *Trichiurus lepturus*, prefers `sabre` in Québec, and pairs it with `Atlantic cutlassfish`; also lists the broader English terms `scabbardfish` and `cutlassfish`. It is terminology/identity evidence, not current product inventory or a measure. |
| **WP04-SECTIONP-ATLANTIC-CUTLASSFISH-R542-20261017-S02** | CFIA, [Fish List lookup for *T. lepturus*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=Trichiurus%20lepturus), [complete lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Links species names and TSNs to Canadian fish-label common names. The full lookup shows overlapping `Sabre`, `Cutlassfish`, `Scabbardfish`, and `Hairtail` terms across *A. carbo*, *L. caudatus*, *L. savala*, and *T. lepturus*. These are labeling names, not substitution or safety guidance. |
| **WP04-SECTIONP-ATLANTIC-CUTLASSFISH-R542-20261017-S03** | Seafood Depot, Vaughan, Ontario, [Belt Fish](https://www.seafooddepot.ca/product-beltfish) | Current Canadian product listing identifies Belt Fish as *Lepidopus xantusi*, calls it also Ribbonfish or Atlantic Cutlassfish, and offers it whole/fresh. Seller naming does not settle the conflicting taxonomic/name ownership for *T. lepturus*. |
| **WP04-SECTIONP-ATLANTIC-CUTLASSFISH-R542-20261017-S04** | Integrated Taxonomic Information System, [*Lepidopus xantusi*, TSN 172392](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=172392) | Records *L. xantusi* as an invalid junior synonym with valid name *Lepidopus caudatus*. Taxonomic status only; no inference about culinary interchangeability or the accuracy of a retailer’s product presentation. |
| **WP04-SECTIONP-ATLANTIC-CUTLASSFISH-R542-20261017-S05** | Fresh Water Foods Inc. (Richmond Hill, Ontario), [Tropical Fish products](https://freshwaterfood.ca/tropical-fish.html), Ribbon Fish section | Current supplier page identifies *T. lepturus*, whole-round fish and cut portions, with seller-specific sizes and packs. The page says its retail pouches carry bilingual names but does not display this item’s French product name. The URL already has a separate R311 ledger source ID scoped to Indian Mackerel; this review adds no duplicate ledger entry. |

**R01 — repository audit:** active references/forms, legacy candidates, ledger and source ownership, proposal/batch archives, plan/workflow, picker source, and complete bundled-recipe corpus were read from the workspace on 2026-10-17. No application tests were run because this is a proposal-only documentation review.

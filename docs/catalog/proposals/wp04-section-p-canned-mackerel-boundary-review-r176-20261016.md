# WP04 Section P — canned mackerel product-boundary review (R176)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** Canadian and Québec-facing canned mackerel market group / *maquereau en conserve*, including products marketed as mackerel and retailer-grouped jack-mackerel products.
- **Recommendation:** **Integrate** an identity-only canned-mackerel product group. Leave fish species, packing medium, package size, forms, aliases, and numeric or substitution behavior unspecified.
- **Scope:** One named preserved-finfish boundary under the open Section P preservation review. This review does not reopen canned tuna, sardines, salmon, or crab; smoked mackerel; the existing mackerel species identities; or horse-mackerel/chinchard naming.
- **Status:** Root integrated the identity-only product group on 2026-10-16. No tests were run; this round adds database JSON data and documentation under the updated `AGENTS.md` rule.
- **Proposal source labels:** `WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S01` through `S07`, plus audit ID `WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-R01`. S01 and S02 reuse existing CFIA ledger sources; S03–S07 are registered on the new record.

## Why this is a distinct open boundary

The [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5937) leaves canned fish product states open, while later checklist notes specifically call for continuing fish-powder, fish-ball, surimi, and regional-seafood coverage. Recent accepted product groups cover canned tuna, canned sardines, and canned salmon; R173 added canned crab meat as a form under the already-resolved crab-meat reference. None of those decisions establishes the identity or scope of canned mackerel.

The focused proposal and batch archive search found no earlier canned-mackerel review. The existing smoked-mackerel identity is a different preservation state and has no canned form. The evidence below shows Canadian/Québec retailers grouping canned products under the market wording “mackerel,” including products whose package titles say “jack mackerel.” CFIA’s list assigns those labels across distinct species and fish families. That distinction rules out a species assignment but does not prevent an identity-only product group: the row represents the marketed canned-food category, not a taxonomic identity or a package-label authorization. It remains separate from raw and smoked species rows.

## Current Canadian and Québec-facing evidence

| Evidence | What it supports | Limit |
|---|---|---|
| CFIA Fish List query for `Mackerel` [S01] | Canadian acceptable-name records include `Mackerel` for *Scomber* species and several named taxa, while `Jack Mackerel` is listed for multiple *Trachurus* species in the family Carangidae. | A fish-name list, not an identification of the fish inside any of the cited cans. The records show why bare `mackerel` and `jack mackerel` cannot be treated as one species identity. |
| CFIA fish-labelling guidance [S02] | The Fish List is the recommended source for acceptable Canadian fish common names and associates names with taxa; the guidance also describes drained-weight labelling conditions for mackerel products. | Regulatory labelling context; it does not resolve a product whose manufacturer or retailer page gives no binomial. |
| Provigo Québec listing [S03] | A current Québec French storefront lists `Ligo Maquereau en eau avec sel 425 g` in its canned-food category. This supports real local retail use of a canned-mackerel phrase and product. | The listing does not expose the fish’s scientific name or enough package information to decide whether it is a *Scomber*, *Trachurus*, or another taxon. Its 425 g package is SKU-specific. |
| Brunswick manufacturer page [S04] | Brunswick calls a product `Mackerel in Brine – 425g`; the ingredient line identifies `Jack Mackerel (FISH) (70.6%), Water, Salt`. Its sibling tomato-sauce product shows that packing liquid and recipe are variable. | The manufacturer does not provide the scientific name on this page, and CFIA assigns `Jack Mackerel` to more than one *Trachurus* taxon. The 425 g can, 70.6% fish declaration, ingredients, and any drained nutrition basis belong to this particular SKU. |
| OQLF GDT, `maquereau` [S05] | The Québec terminology record pairs French `maquereau` with English `mackerel` and cites *Scomber scombrus*. | It is not a canned-product entry and does not validate the French phrase as a universal label for products made from other taxa, including *Trachurus* products. |
| Walmart Canada’s canned-mackerel category [S07] | Its Canadian “Canned Mackerel” category groups products titled both `Mackerel` and `Jack Mackerel`, including brine and tomato-sauce presentations. | Retail navigation and product titles establish a market grouping, not the species or formulation of each can. Product availability and package details change. |

Together, the retailer category and Québec listing support an identity-only market group named `canned mackerel / maquereau en conserve`. The Ligo and Brunswick labels cannot be assumed to name the same fish, so leave species unassigned. Do not merge the product group into Atlantic/Pacific mackerel, narrow-barred or spotted Spanish mackerel, or the horse-mackerel/chinchard identity. Do not add `jack mackerel` as an alias or attach a canned form to any species row.

## Ownership and collision audit

A read-only exact/normalized-key check covered active reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs/terms for `canned mackerel`, `maquereau en conserve`, `mackerel in brine`, `maquereau en eau avec sel`, `Jack Mackerel`, and candidate IDs `ingredient-ref-canned-mackerel`, `ingredient-form-canned-mackerel`, and `candidate-canned-mackerel`. No exact owner was found in the current references, forms, legacy candidates, or ledger. The focused proposal and batch archive search found no prior canned-mackerel boundary review. These identifiers remain illustrative and are neither reserved nor allocated.

| Nearby current owner | Ownership and collision boundary |
|---|---|
| `ingredient-ref-atlantic-mackerel` | Atlantic species identity; do not attach canned, brined, or Jack-Mackerel product wording without species evidence. |
| `ingredient-ref-pacific-mackerel` | Pacific species identity; do not infer this species from generic canned mackerel wording. |
| `ingredient-ref-narrow-barred-spanish-mackerel` and `ingredient-ref-spotted-spanish-mackerel` | Separate species-qualified references, not owners of unqualified canned-mackerel product language. |
| `ingredient-ref-smoked-mackerel` | A species-neutral smoked finished-food group; it has no canned form and does not own water-, brine-, tomato-, or oil-packed products. |
| Horse-mackerel / chinchard identity | Separate market/taxon decision reviewed in R157. Brunswick’s “Jack Mackerel” wording is not a safe synonym for that one row because CFIA lists that market label against multiple taxa. |
| `ingredient-ref-gooseberry` | Its French display contains `groseille à maquereau`; this is a neighboring lexical match, not fish-product ownership. Preserve it unchanged. |

The source-ID prefix and source URLs in this proposal were checked against the live ledger and focused archive. S01 reuses the CFIA Fish List query already attached to the mackerel references, and S02 reuses the general CFIA fish-labelling source. The new S03–S07 IDs and URLs had no exact ledger owner before integration.

## Picker and recipe-demand impact

The current picker normalizes case, accents, and punctuation, prefers complete phrases, and uses substring fallback only when there are no phrase matches ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Current references include four species-qualified mackerel names and the smoked-mackerel market group. A `canned mackerel / maquereau en conserve` row adds one result to broad `mackerel`/`maquereau` searches while leaving fish species unresolved. Exact canned-product searches receive a useful product-group choice. No aliases or forms are attached, so the row does not claim that `Jack Mackerel` or a particular packing medium names the group.

The manifest-ordered recipe audit parsed all **114 recipe files** and **1,123 ingredient rows**. It searched complete recipe JSON and ingredient-row fields for `canned mackerel`, `canned jack mackerel`, `mackerel in brine`, `mackerel in water`, `maquereau en conserve`, `maquereau en eau`, and broad `maquereau`. It found **zero matching recipe files and zero matching ingredient rows**. No recipe amount, form, product identity, or link is attached; the product group is supported by Canadian and Québec market evidence rather than recipe demand. [R01]

## Numeric and substitution boundaries

- **Package and composition facts:** The 425 g package titles, Brunswick’s 70.6% fish ingredient declaration, and the manufacturer’s per-100-g-drained nutrition basis are separate SKU-level evidence. They do not define a universal can size, drained fraction, edible yield, or common composition for canned mackerel. Do not create a measure, package conversion, count mapping, or ledger observation from them.
- **Drained weight:** CFIA specifies a drained-weight label condition for mackerel or mackerel fillets in hermetically sealed containers prepared without added water, brine, or vinegar when the drained weight is below 80% of net quantity [S02]. That labelling rule is not a reusable kitchen conversion and does not apply as an inferred value to all packing media. Add no drained yield, density, unit mapping, or form-level numeric behavior.
- **Forms and preparations:** Current evidence shows brine/water with salt and tomato-sauce presentations. It does not establish one universal canned form across species, packing liquid, cut, skin/bone state, ready-to-eat claim, or drained status. Add no form under an existing raw species or smoked-mackerel row.
- **Substitutions:** No global or contextual substitution is supported among canned mackerel, raw Atlantic/Pacific mackerel, Spanish mackerel, horse mackerel, smoked mackerel, canned tuna, sardines, salmon, or another fish. The corpus has no relevant dish or method context; add no rule, warning, or recipe-line link.

## Proposed delta

Add identity-only `ingredient-ref-canned-mackerel` with display names `canned mackerel / maquereau en conserve`, category `PROTEIN`, empty alias arrays, null density, and no unit mappings. Record the bounded market identity and source evidence in the research ledger. Keep all species and smoked-mackerel references separate. Add no form, legacy mapping, measurement, conversion, yield, recipe link, or substitution; keep package, species, cut, and packing-medium details source-specific.

## Source register

Online pages were accessed on 2026-10-16 unless the page itself identifies a different date. Proposal-local IDs are provenance labels only.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S01 (reused source)** | CFIA, [Fish List search results for “Mackerel”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?c=&lang=e&q=Mackerel); existing ledger source ID `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06`. | Existing source on the active mackerel references. Canadian accepted-name records pair common fish names with taxa; the listing does not identify any cited retail product. |
| **WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S02 (reused source)** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish); existing ledger source ID `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`. | The Fish List is the recommended common-name source; lines on mackerel specify when a drained-weight declaration is required for hermetically sealed products. This does not set a generic drained conversion. |
| **WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S03** | Provigo Québec, [Ligo Maquereau en eau avec sel 425 g](https://www.provigo.ca/fr/alimentation/garde-manger/produits-en-conserve-et-marin-s/c/28187?page=10). | Current Québec French retail title, canned-food category placement, and SKU package title. No species binomial is exposed in the listing excerpt. |
| **WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S04** | Brunswick Seafood, [Mackerel in Brine – 425g](https://brunswick.ca/products/mackerel/brunswick-mackerel-in-brine-425g-2/). | Manufacturer names the product and gives ingredients `Jack Mackerel (FISH) (70.6%), Water, Salt`. No binomial; pack and composition details are specific to this product. |
| **WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S05** | OQLF, [GDT: maquereau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3297732/maquereau). | Québec French term and English equivalent; the record cites *Scomber scombrus*. It is not a generic translation ruling for every taxon sold under mackerel-family wording. |
| **WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S06** | Brunswick Seafood, [Mackerel in Tomato Sauce – 425g](https://brunswick.ca/products/mackerel/brunswick-mackerel-in-tomato-sauce-425g-2/). | Manufacturer’s adjacent product demonstrates that sauce preparation is another separate SKU. It does not establish equivalence with the brine product or a generic canned-mackerel form. |
| **WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S07** | Walmart Canada, [Canned Mackerel category](https://www.walmart.ca/en/c/kp/canned-mackerel). | Canadian retail category groups products titled both Mackerel and Jack Mackerel, including brine and tomato-sauce presentations. This supports the market group only; it does not identify fish species or establish a common formulation. |
| **WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5937), active references/forms, legacy candidates, research ledger, manifest-listed recipes, focused proposal/batch archive, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only normalized ownership, archive, picker, and corpus audit. The checked package contained 1,550 active references, 120 forms, 1,895 research-ledger records, and 114 recipes / 1,123 ingredient rows. Counts describe this repository snapshot only. |

## Final disposition

**Integrate** `ingredient-ref-canned-mackerel` as identity-only `canned mackerel / maquereau en conserve`, a market product group separate from raw, species-qualified, and smoked mackerel. The retailer category and Québec listing support the product wording; the fish list explains why no species is assigned. Add no aliases, forms, measures, package conversions, yields, recipe links, or substitutions. No bundled-recipe demand was found. No tests were run for this database JSON addition under `AGENTS.md`.

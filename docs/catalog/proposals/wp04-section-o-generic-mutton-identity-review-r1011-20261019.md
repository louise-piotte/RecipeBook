# WP04 Section O — generic mutton / mouton identity review (R1011)

- **Reviewed:** 2026-10-19.
- **Status:** Integrated into the bundled ingredient reference catalog and research ledger, with the review recorded in the R1011 integration README. No forms or recipe rows were changed.
- **Plan anchor:** The open Section O species checklist at [global catalog plan, line 7207](../../RecipeBook-global-ingredient-catalog-plan.txt#L7207), which lists lamb and mutton separately.
- **Candidate:** Generic mutton meat from ovine carcasses that do not meet the Canadian lamb maturity specifications.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **mutton / mouton**, with no aliases, forms, measurements, recipe links, or substitutions.
- **Scope:** Generic meat identity only. No brands, commercial products, product lines, flavours, SKUs, or retailer variants were researched.

## Identity and Québec terminology

The OQLF food-domain GDT entry gives **mouton** as the preferred French term and **mutton** as its English equivalent; its definitions include meat from sheep. The Canadian Food Inspection Agency (CFIA) meat-cuts manual defines lamb using the applicable ovine-carcass maturity characteristics and says meat from an ovine carcass that fails those lamb specifications is called **mutton**. Together these sources support a generic mutton-meat identity and distinguish it from the separately catalogued lamb identity. [R1011-S01–S02]

Use only the source-attested pair:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-mutton-meat` |
| Category | `PROTEIN` |
| English display | `mutton` |
| Québec French display | `mouton` |
| English aliases | None |
| French aliases | None |
| Default density / unit mappings | `null` / `[]` |

Do not add `lamb`, `sheep meat`, or `ovine meat` as aliases. The CFIA maturity boundary keeps lamb and mutton separate; an unqualified sheep-meat term could cover both. Do not copy the 75 g cooked lamb Food Guide portion to mutton: the cited Food Guide row is specifically labelled Lamb and supplies no mutton portion. No mutton measure was researched in this identity review.

## Current ownership and recipe-demand audit

The read-only audit covered the bundled references, forms, 55 legacy import identities, research ledger, and all manifest-listed recipes on 2026-10-19. It found no exact owner or candidate for `mutton`, `mouton`, `mutton meat`, `sheep meat`, `ovine meat`, or `ingredient-ref-mutton-meat`. The corpus contains 114 recipe files and 1,123 structured ingredient rows, with no mutton or mouton ingredient-row match. [R1011-R01]

Keep nearby identities and evidence separate:

| Current owner | Boundary |
|---|---|
| `ingredient-ref-lamb-meat` | Lamb remains a separate identity for ovine meat meeting Canadian lamb maturity criteria. Its 75 g cooked Food Guide observation applies only to the named lamb serving. |
| `ingredient-ref-common-lambs-quarters` and `ingredient-ref-lambs-lettuce` | These are plant identities containing the lexical token `lamb`; neither is mutton or an animal-protein identity. |
| `ingredient-ref-sheep-milk` | Sheep milk is dairy and does not support an alias or amount for sheep meat. |
| `ingredient-ref-charqui` | Regional dried-meat evidence remains attached to charqui and its named source; it does not establish a mutton alias or measurement. |
| `ingredient-ref-ground-beef` and recipe `078#3` | The publisher’s one-recipe ground-lamb option remains attached to ground beef. It is not mutton demand or a lamb/mutton substitution. |

No form, recipe link, package yield, unit conversion, or active substitution is supported. The identity can be added without changing or merging any existing row.

## Commercial-product scope

This review selected a generic animal-meat identity and did not research commercial rosters. Any queued line limited to a brand, product line, flavour family, SKU, or retailer variant remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-scoped evidence remain intact; no product-specific amount or claim is generalized.

## Source register

| Source ID | Source and locator | Support and limit |
|---|---|---|
| **R1011-S01** | Office québécois de la langue française, [mouton (GDT), food domain](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428311/mouton), updated 1983. | Gives `mouton` as the preferred French term, `mutton` as the English equivalent, and defines the meat sense. Its translation note distinguishes lamb from mutton by carcass characteristics. Terminology support; it does not supply a measure or culinary substitution. |
| **R1011-S02** | Canadian Food Inspection Agency, [Lamb — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/lamb), lamb definition and mutton note. | Says ovine meat that does not meet lamb maturity specifications is called mutton. Supports the Canadian meat-identity boundary, not a serving value, household measure, or replacement rule. |
| **R1011-R01** | Local read-only ownership and corpus audit, 2026-10-19. | Normalized exact-name scan across 2,024 references, 205 forms, 55 legacy candidates, and 2,430 ledger records; recipe scan across 114 files / 1,123 ingredient rows. No mutton identity or recipe line was found. |

## Recommendation

Add identity-only **mutton / mouton** in `PROTEIN`, separate from lamb. Leave aliases and numeric behavior empty, preserve the lamb portion observation and recipe 078#3, and add no forms, recipe links, conversions, yields, or substitutions. Section O remains open for its other generic meat identities, cuts, and portions.

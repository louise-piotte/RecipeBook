# WP03 Section M — generic dried-cherry boundary review (R925)

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only; no catalog JSON, ledger, legacy candidates, or recipe links changed.
- **Scope:** Whether the unqualified culinary term `dried cherries / cerises séchées` has a transferable identity alongside the existing dried sweet- and tart-cherry references. Brand, product-line, flavour, and retailer variants are out of scope.

## Recommendation

**Keep the unqualified dried-cherry term unassigned.** The current sources describe dried cherries as two types, sweet and tart, while the active catalog already represents those as distinct references. The general phrase does not choose either type, and no bundled recipe requests it. Do not add a generic identity, alias it to either subtype, or merge either subtype into the fresh `cherries` reference.

The Government of Canada Department of National Defence specification states that dried cherries are available in sweet and tart types. Its French edition expresses the distinction as `sucrées` and `acidulées`. The USDA Food Buying Guide labels its procurement row `Cherries, Red Tart, dried`, and the adjacent separate heading is for sweet cherries. USDA Agricultural Marketing Service's dated commodity specification uses `Dried Cherries` as a procurement heading but defines that purchase as Type I, pitted red tart cherries. These are useful evidence for the subtype boundary, not grounds to generalize a procurement specification into a universal definition.

## Current-state audit

| Surface | Read-only finding |
|---|---|
| Active references | `ingredient-ref-cherries` is the general cherry identity, with fresh/frozen and pitted search terms; `ingredient-ref-dried-sweet-cherries` is `dried sweet cherries / cerises douces séchées`; and `ingredient-ref-dried-tart-cherries` is `dried tart cherries / cerises séchées acidulées`, with English aliases `dried sour cherries` and `dried red tart cherries`. Preserved maraschino and glacé cherries remain separate. No active generic dried-cherry identity or alias exists. |
| Forms and numeric fields | The fresh/frozen cherry row has its existing pitted form. Neither dried subtype has a form, default density, or unit mapping. This review proposes no form or numeric behavior. Government procurement measurements, moisture limits, and pit tolerances remain scoped to their cited standards and products. |
| Ledger and prior decisions | Both dried subtype references have accepted identity decisions. The ledger already records that generic `dried cherries` remains unassigned because the government specification distinguishes sweet and tart types. The earlier dried-fruit reviews accepted the subtype references and English tart-cherry aliases without assigning the broad phrase. |
| Recipe corpus | A search of all bundled recipe files found no `dried cherries`, dried-cherry subtype, or French dried-cherry phrase. The corpus has 114 recipes and 1,123 ingredient rows; its cherry rows name generic pitted fresh/frozen cherries or maraschino cherries. No recipe link or amount change is proposed. |

## Evidence and limits

| Source | Support used | Limit |
|---|---|---|
| Government of Canada, Department of National Defence, [Food Quality Specifications: Dried Fruits (English PDF)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-eng.pdf), p. 3 | Says dried cherries are available in two types, sweet and tart. | Procurement specification; its moisture and preparation requirements are not general recipe measures or universal composition rules. |
| Ministère de la Défense nationale, [Spécifications sur la qualité des aliments : Fruits séchés (French PDF)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-fra.pdf), p. 3 | Describes the two types as `sucrées` and `acidulées`. | Supports the stated bilingual subtype split; it does not establish `cerises séchées` as a selectable subtype. |
| USDA Food and Nutrition Service, [Food Buying Guide, Fruits](https://foodbuyingguide.fns.usda.gov/files/Reports/USDA_FBG_Section3_FruitsYieldTable.pdf), printed pp. 3-14–3-15 | Lists a `Cherries, Red Tart, dried` row and later a separate `CHERRIES, SWEET` section. | Child-nutrition procurement classifications and portion/yield figures are not transferable measures for generic dried cherries. |
| USDA Agricultural Marketing Service, [Commodity Specification: Dried Fruit](https://www.ams.usda.gov/sites/default/files/media/CommoditySpecificationsforDriedFruit092017.pdf), p. 16 | Under `Dried Cherries`, specifies Type I, pitted red tart cherries. | A dated procurement specification. Its scoped product definition and technical requirements do not define every culinary use of the broad phrase. |
| U.S. International Trade Commission, [Dried Tart Cherries from Turkey](https://www.usitc.gov/publications/701_731/pub5014.pdf), pp. I-7–I-8 | Treats dried tart cherries as processed tart cherry and identifies tart cherry with *Prunus cerasus*, distinguishing sweet cherries. | Trade-investigation product scope; not a culinary equivalence or recipe-demand source. |
| OQLF, [cerise douce](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358079/cerise-douce) and [cerise acide](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358080/cerise-acide) | Supports the Québec French sweet/tart fruit terminology underlying the accepted dried-cherry displays. | Does not resolve the intended subtype when a recipe says only `dried cherries`. |

No amount, density, yield, moisture threshold, pit tolerance, or processing requirement is transferred from these sources into generic catalog behavior.

## Disposition

Preserve all existing cherry references, aliases, forms, category assignments, ledger decisions, measurements, and recipe links. Add no `ingredient-ref-dried-cherries`, no `dried cherries / cerises séchées` alias to the sweet- or tart-cherry reference, and no forms, measures, conversions, yields, or substitutions.

Reopen only if a recipe or explicit generic-library requirement requests dried cherries and gives enough context to select a subtype, or if new evidence establishes a stable, useful umbrella identity. Manufacturer evidence may support a generic claim when it applies beyond the named product; product-only measurements and claims stay scoped to that product. No brand or commercial-product roster was researched because commercial-product counts do not add ingredient diversity.

## Root integration decision

Held on 2026-10-19. Keep generic dried cherries unassigned, preserve the sweet/tart references, and add no catalog or ledger data. The source-defined subtype distinction and absence of recipe demand do not support a transferable generic owner. See the [R925 integration README](../batches/wp03-r925-generic-dried-cherries-hold-integration-20261019/README.md).

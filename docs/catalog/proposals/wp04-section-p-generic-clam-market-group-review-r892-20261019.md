# WP04 Section P — generic clam / palourde name-group review (R892)

- **Review date:** 2026-10-19.
- **Status:** Proposal only at drafting. Root independently rechecked the current CFIA result table and integrated the candidate in place on 2026-10-19; the original source limits and prior unresolved decision remain recorded.
- **Open plan anchors:** [Mussel, clam, oyster, cockle, and remaining shellfish identities](../../RecipeBook-global-ingredient-catalog-plan.txt#L8409) and [remaining animal protein and seafood coverage](../../RecipeBook-global-ingredient-catalog-plan.txt#L1011).
- **Existing candidate and hold:** `ingredient-ref-clam`, [ledger candidate](../research-ledger.v1.json#L54659), held in place at the [2026-10-12 integration](../batches/wp04-section-p-clam-hold-integration-20261012/README.md).
- **Recommendation:** Promote the existing candidate in place to one identity-only, visibly qualified label-name group: `clam (name used for multiple clam species) / palourde (nom utilisé pour plusieurs espèces de palourdes)`. This would represent only the repeated exact English/French label wording on multiple CFIA species rows. It is not a taxon, a statement that all clams share a culinary identity, or a claim of recipe interchangeability.

## Why reopen the hold

The earlier hold correctly rejected assigning bare `clam / palourde` to one species. OQLF reserves `palourde américaine` for its *Mercenaria mercenaria* entry and `mye` for *Mya arenaria*; each entry warns that broad terms are not retained for Québec fish-product commercialization. The old candidate therefore has a valid unresolved decision for a species-specific or unqualified culinary identity.

This proposal changes only the scope under consideration. The current CFIA Fish List query repeats the exact label pair `Clam / Palourde` across several taxa, including *Gari solida*, *Meretrix lyrata*, and *Protothaca thaca*. The current Canadian Nutrient File also has a deliberately mixed-species raw-clam food code. A visibly qualified name group records that narrow, source-backed shared label use while keeping the old species-resolution hold intact. CFIA labeling evidence does not authorize this catalog display, create a biological group, or establish shared flavor, preparation, safety, portion, yield, or substitution behavior.

The generic candidate adds a distinct bivalve food-search concept alongside the existing mussel, oyster, cockle, and scallop identities. Current picker searches for `clam`, `clams`, `palourde`, and `palourdes` return no active ingredient; the proposed qualified group would give those queries one clearly qualified result. The bundled corpus has no matching recipe demand, so no recipe behavior is proposed.

## Proposed data, if accepted later

Promote the existing ledger candidate ID rather than creating a duplicate:

```json
{
  "id": "ingredient-ref-clam",
  "nameEn": "clam (name used for multiple clam species)",
  "nameFr": "palourde (nom utilisé pour plusieurs espèces de palourdes)",
  "aliasesEn": ["clams"],
  "aliasesFr": ["palourdes"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The singular displays and plural aliases are qualified search labels for the repeated name group only. The French compound display is catalog-authored wording, not an OQLF-preferred term; obtain Québec review before treating it as terminology guidance.

If integrated, change the ledger record type to `ingredient_reference`, set identity to verified only for this bounded repeated-label scope, and append the new accepted decision and source citations. Preserve the earlier unresolved decision and the original source statements. Leave measurement and substitution states `not_yet_researched`.

Do not add a form, density, unit mapping, package relationship, conversion, yield, recipe link, or substitution. The CNF mixed-species entry reports 1 small clam = 9.0 g, 1 large clam = 20.0 g, 1 medium = 14.5 g, and 454 g with shell yielding 68.0 g after shell removal, among other portions. Those are tied to its CNF 2015 Food Code 3109 item and its described basis; none is proposed as a measure or yield for this broader name group.

## Evidence and source boundary

| Source ID | Source | Supports and limits |
|---|---|---|
| **R892-S01** | CFIA, [Fish List query for `clam`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=clam), checked 2026-10-19. | The query output repeats the exact `Clam / Palourde` pair on multiple species rows, including *Gari solida*, *Meretrix lyrata*, and *Protothaca thaca*. The result set also has species with narrower or different names; the proposal does not import all rows containing “clam.” The interactive query endpoint did not render directly, so the exact-query observation is retained with its access limitation. Label overlap is not a taxonomic or culinary-equivalence rule. |
| **R892-S02** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25; rechecked 2026-10-19. | Sections 4 and 5.2.2 state that Fish List names are species-linked Canadian labeling names and that group names covering multiple species may be considered in its process. This guidance does not approve the catalog display or establish use as a recipe category. |
| **R892-S03** | Health Canada, [CNF 2015 Food Code 3109 serving portions](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3109), rechecked 2026-10-19. | The bilingual food description is “Mollusks, clam, mixed species, raw / Mollusques, mye (palourde), espèces diverses, crues.” This shows a government food-composition record scoped to mixed species. Its individual portions and shell-removal figure are code-specific and are not transferred to the proposed identity. |
| **Integration recheck R892-S04** | CFIA, [current Fish List results table](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), checked by root on 2026-10-19. | The current official table independently shows the exact `Clam / Palourde` pair for *Gari solida*, *Meretrix lyrata*, and *Protothaca thaca*. It confirms repeated label usage only and does not establish a taxon, exhaustive membership, or culinary-equivalence rule. |
| **Reused `WP04-MOLLUSKS-20261009-S07`** | OQLF, [palourde américaine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198879/palourde-americaine), updated 2012; rechecked 2026-10-19. | Identifies *Mercenaria mercenaria* and gives `palourde américaine` as the preferred Québec term. Its note says `clam`, `coque`, and `mye` were not retained by the Québec committee for fish-product labeling. This is species-specific terminology evidence; it does not standardize the proposed compound display. |
| **Reused `WP04-MOLLUSKS-20261009-S08`** | OQLF, [mye (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198878/mye), updated 2012; rechecked 2026-10-19. | Identifies *Mya arenaria*, prefers `mye`, and lists `clam`, `coque`, `palourde`, and `quahog` as context-specific terms not retained for Québec commercial labeling of that species. It supports keeping the unqualified group visibly qualified and keeping `mye` off its aliases. |
| **R01 — repository audit** | Read-only review of current references, forms, legacy identities, research ledger, plan, manifest-listed recipe files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Supports the ownership, picker, and recipe-demand projections below only; it is not external culinary or terminology evidence. |

## Current ownership and picker projection

The reviewed snapshot has **1,918 active ingredient references**, **201 forms**, **56 legacy identities**, and **2,322 research-ledger records**. The ledger already contains candidate `ingredient-ref-clam` with `identityState: needs_clarification` and the original unresolved decision. There is no active reference, legacy identity, or form owning the normalized keys `clam`, `clams`, `palourde`, `palourdes`, either proposed qualified display, or this target ID. Thus the candidate can be advanced in place without displacing an active row or duplicating an ID.

Picker results use complete normalized phrase matching first, with substring fallback only when no phrase matches. A read-only projection from the current active catalog and forms gives:

| Query | Current active results | With proposed group | Boundary |
|---|---:|---:|---|
| `clam` / `clams` | 0 / 0 | 1 / 1 | One visibly qualified shared-label group; no species identity is implied. |
| `palourde` / `palourdes` | 0 / 0 | 1 / 1 | French search reaches the catalog-authored qualified group; independent Québec wording review remains open. |
| Full English or French qualified display | 0 | 1 each | Selects only the proposed group. |
| `mye` | 1 | 1 | Existing substring-fallback result is `myeolchi-jeot`; no alias or new result is added. |
| `coque` | 1 | 1 | Existing cockle name group remains separate; `coque` is not an alias here. |
| `hard shell clam`, `soft shell clam`, `palourde américaine` | 0 | 0 | Species-scoped names remain unassigned and are not folded into this group. |

Do not alias `mye`, `quahog`, `hard-shell clam`, `soft-shell clam`, `steamer clam`, `palourde américaine`, `palourde japonaise`, `coque`, `razor clam`, `couteau`, surf-clam or mactre names, or species names. The OQLF terms refer to species-specific contexts; `coque` already searches the separate cockle group; and the cited CFIA query contains narrower clam names with different French labels. Keep the existing species holds and every distinct bivalve identity untouched.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned, with accent folding and complete-word matching, for `clam`, `clams`, `palourde`, `palourdes`, `mye`, `quahog`, `cockle`, and `coque`. The scan found **zero matching files and zero matching ingredient rows**. No recipe link, form, amount, or substitution is inferred.

## No-transfer and scope boundaries

- This is a generic culinary-search identity review, not a brand, product-line, flavour-family, SKU, or retailer-variant roster. Such roster-only work is out of scope because commercial-product counts do not add ingredient diversity; no such research was pursued here.
- Preserve all existing branded entries and evidence. Do not delete, merge, or generalize a branded identity without a separate transferability review. This proposal transfers no product-specific claim.
- Keep the prior Clover Leaf clam-juice and baby-clam product hold, and all species-specific clam holds, unchanged. A product title, package size, ingredient panel, serving statement, or species name does not establish the generic group’s composition or measurements.
- Do not treat `clam / palourde` as one taxon or imply that every species in a CFIA result containing “clam” belongs to this exact-label group. The only membership basis proposed is repeated `Clam / Palourde` label wording in the reviewed result set.
- The CNF source remains tied to Food Code 3109; its small/medium/large portions, food-guide portion, refuse, and shell-removal value are not category-wide measures or yields. Measurement and substitution research for the proposed group remains open.
- The French display is a qualified search descriptor, not a formal Québec term. Keep `palourde américaine`, `mye`, and other species-specific names distinct; do not import the displayed French group wording into source claims.

## Files reviewed

`AGENTS.md`; the open Section P shellfish parent at [plan line 8409](../../RecipeBook-global-ingredient-catalog-plan.txt#L8409); the earlier [generic clam hold](../batches/wp04-section-p-clam-hold-integration-20261012/README.md); prior species-specific clam holds named there; the generic scope rule; active references and forms; legacy identities; the `ingredient-ref-clam` ledger record and its source entries; all manifest-listed recipes; and `IngredientSearch.kt`.

Root integrated the candidate in place, preserving the original unresolved decision and appending the bounded accepted decision. The database data change added only JSON plus its corresponding plan and research documentation. No software tests, build, emulator run, or deployment were performed under the JSON-only exception in `AGENTS.md`.

## Recommendation

Promote the held `ingredient-ref-clam` candidate in place only as `clam (name used for multiple clam species) / palourde (nom utilisé pour plusieurs espèces de palourdes)`, with the ordinary plural search inflections shown above. Preserve the old unresolved decision as the boundary against assigning unqualified clams to a single species. Keep forms, measurements, recipes, conversions, yields, and substitutions unchanged.

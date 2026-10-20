# WP04 Section P — stone crab / crabe caillou identity review (R99)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** market-group identity, Canadian / Québec naming, picker boundary, recipe demand, product-state, measurement, and substitution review.
- **Open checklist:** crab and remaining seafood work remains open in [Section P](../../RecipeBook-global-ingredient-catalog-plan.txt#L4749).
- **Candidate:** stone crab, *Menippe* spp. (CFIA market group; includes a separate *M. mercenaria* name row).
- **Decision:** integrated an identity-only market-group reference, `stone crab / crabe caillou`, category `PROTEIN`, with only `crabe de pierre` as a Québec retail wording alias. The row represents the CFIA `Menippe` spp. group; CFIA also lists the same bilingual names for *M. mercenaria*. Florida’s fishery page names *M. mercenaria* and *M. adina* under stone crab.
- **Shared-data effect:** added `ingredient-ref-stone-crab` and one seven-source ledger record; updated the Section P checklist, roadmap, generated catalog, and integration README. No forms, recipes, measurements, or substitution rules changed.
- **Tests:** no app tests or emulator checks were run because this change only adds database JSON data and its generated catalog index.

## Why this is a distinct open candidate

The live Section P checklist keeps crab work open. The crab subsection has already reviewed or integrated snow, blue, Jonah, Dungeness, rock, soft-shell, generic crab meat, and other crustacean identities, but it contains no stone-crab decision. A search of the current plan, the proposal and batch archive, active references and forms, legacy-import identities, and the research ledger found no existing owner or prior review for `stone crab`, `crabe caillou`, `crabe de pierre`, or *Menippe*.

This packet addresses only the Canadian-listed *Menippe* market group. It does not revisit generic crab meat, rock crab / `crabe commun`, Northern stone crab, crab-flavoured pollock, or the other crab checklist decisions.

## Identity and Canadian / Québec naming

The CFIA Fish List assigns **Stone crab / Crabe caillou** to *Menippe mercenaria* (TSN 98811) and separately to *Menippe* spp. (TSN 98810). The shared name therefore supports a market-group row, not a single-species row. CFIA describes the Fish List as the Canadian English/French common-name source for fish labelling and says the names listed for each fish species are the names to use for that species [S01, S02].

The distinction matters in the Florida supply chain: the Florida Fish and Wildlife Conservation Commission’s current commercial page is titled “Stone Crab: *Menippe mercenaria* or *Menippe adina*” [S07]. A Canadian wholesaler separately identifies its Stone Crab product as *M. mercenaria* [S06]. Those sources corroborate the market name and species scope; they do not justify assigning all stone crab to *M. mercenaria*.

OQLF’s relevant GDT entry is **crabe épineux / Northern stone crab**, updated in 1998 and identified as *Lithodes maia* [S03]. CFIA’s current crab lookup places *Lithodes maja* in a different family and lists it as Deepsea King Crab / `crabe épineux`, while placing *Menippe* in Menippidae [S01]. Do not use `crabe épineux`, `Northern stone crab`, `deep-sea king crab`, or `crabe royal de roche` as aliases for *Menippe*.

Metro Québec currently lists the same product number in French as “Pinces de crabe de pierre cuites surgelées” and in English as “Frozen Cooked Stone Crab Claws”; both listings show 680 g and currently report the item out of stock [S04, S05]. This is direct local retail evidence for the product wording `crabe de pierre`, but the page gives no scientific name. Keep that phrase as a search alias tied to this retail naming, not as a species-level or OQLF terminology claim. The CFIA display remains `crabe caillou`.

## Current ownership and picker projection

At the root integration review, the current bundled snapshot had **1,435 ingredient references, 105 forms, and 1,775 research-ledger records**. Before integration, no active reference, form, legacy candidate, ledger record, plan entry, proposal, or batch owned the candidate name, its Latin genus, or ID `ingredient-ref-stone-crab`.

The relevant active references are `ingredient-ref-blue-crab`, `ingredient-ref-crab` (crab meat), `ingredient-ref-crab-flavoured-pollock-flakes`, `ingredient-ref-dungeness-crab`, and `ingredient-ref-jonah-crab`. The only current crab form is jumbo-lump crab meat under `ingredient-ref-crab`; that form remains separate from stone-crab claws.

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized full word phrases across display names, aliases, and form terms are returned before substring fallback. The integrated row has no English aliases and keeps only the source-backed retail French alias `crabe de pierre`:

| Query | Before integration | After integration | Boundary |
|---|---|---|---|
| `stone crab` | None | `ingredient-ref-stone-crab` | Specific CFIA market name. |
| `crabe caillou` | None | `ingredient-ref-stone-crab` | CFIA French common name. |
| `crabe de pierre` | None | `ingredient-ref-stone-crab` | Search alias from Metro’s same-SKU Québec product wording; not an OQLF-preferred term. |
| `crab` / `crabe` | Five crab-related references | Six crab-related references | Broad searches remain multi-result; the new name does not take ownership of generic crab meat. |
| `crab meat` | `ingredient-ref-crab` | `ingredient-ref-crab` | Existing meat identity and jumbo-lump form stay distinct. |
| `Northern stone crab` / `crabe épineux` | None | None | The OQLF / CFIA *Lithodes* name is not added to *Menippe*. |

Do not add generic `crab`, `crabe`, `Florida stone crab`, `Gulf stone crab`, `crabe épineux`, or `crabe royal` aliases. The first two are already broad multi-result searches; the Florida and Gulf labels refer to species-specific source contexts; and the latter French name is assigned to a different family. Do not add a `crabe de pierre` form or assume that every French-language use of that phrase is the CFIA *Menippe* group.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files and 1,123 ingredient rows** for `stone crab`, `stone crab claws`, `crabe caillou`, `crabe de pierre`, `crabe épineux`, `Northern stone crab`, *Menippe*, *M. mercenaria*, *M. adina*, and the adjacent *Lithodes* names. There were **zero exact candidate hits**.

One bundled recipe has generic crab demand: recipe 019#8 requests `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. It does not select stone crab, claws, or a *Menippe* species. Do not relink it to this row or infer a recipe-specific preparation or substitution.

## Product states, measures, and substitutions

- **Product states:** Metro’s Québec SKU is sold as cooked, frozen claws. Seafood Depot, a Canadian supplier, lists *M. mercenaria* as claws or meat and fresh or frozen [S04–S06]. These pages establish distinct presentations but do not establish a shared *Menippe* form set. Add no claw, cooked, frozen, thawed, fresh, or meat form.
- **Measures:** Metro’s 680 g package is one retail SKU and has no claw count or edible-yield statement [S04, S05]. Florida’s legal minimum claw length is a fishery rule, not a recipe measure [S07]. Add no package mapping, count-to-mass conversion, density, serving size, or claw-meat yield.
- **Substitution:** The generic crab-meat recipe and market descriptions do not establish that cooked stone-crab claws can replace jumbo-lump crab meat, Dungeness, snow crab, or another crab in a particular dish or amount. Add no global or contextual substitution.

## Canonical data added

```json
{
  "id": "ingredient-ref-stone-crab",
  "nameEn": "stone crab",
  "nameFr": "crabe caillou",
  "aliasesEn": [],
  "aliasesFr": ["crabe de pierre"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN",
  "updatedAt": "2026-10-14T00:00:00Z"
}
```

The ledger records the identity as the **CFIA market group *Menippe* spp.**, with a note that CFIA also lists the same bilingual names for *M. mercenaria*. The Metro alias is retained only as documented Québec retail wording. No forms, measures, recipe links, conversions, yields, or substitutions were added.

## Source register

Sources were accessed on 2026-10-14. The source IDs were unique against the ledger and archive at review time and are now stored on the integrated ledger record.

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP04-SECTIONP-STONE-CRAB-R99-20261014-S01` | CFIA, [Fish List crab query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab), list modified 2023-09-18. Rows TSN 98811 and 98810 assign Stone crab / Crabe caillou to *M. mercenaria* and *Menippe* spp.; the same results list the distinct *Lithodes maja* / crabe épineux entry. | Canadian fish-label naming evidence, not proof of culinary interchangeability or species composition of the Metro SKU. |
| `WP04-SECTIONP-STONE-CRAB-R99-20261014-S02` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Explains the CFIA Fish List’s English/French labelling role. This is a naming source, not a recipe or culinary taxonomy guide. |
| `WP04-SECTIONP-STONE-CRAB-R99-20261014-S03` | OQLF GDT, [crabe épineux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198939/crabe-epineux), last updated 1998. Pairs the French term with Northern stone crab, deep-sea king crab, and *Lithodes maia*. | A different taxon from *Menippe*; its French name is not an alias for the proposed row. |
| `WP04-SECTIONP-STONE-CRAB-R99-20261014-S04` | Metro Québec, [Pinces de crabe de pierre cuites surgelées](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/pinces-de-crabe-de-pierre-cuites-surgelees/p/058973933757), product 058973933757. | Lists 680 g, cooked/frozen claws; the item was out of stock at review. No binomial, claw count, package composition, or cooking yield is given. |
| `WP04-SECTIONP-STONE-CRAB-R99-20261014-S05` | Metro Canada, [Frozen Cooked Stone Crab Claws](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-cooked-stone-crab-claws/p/058973933757), same product number. | Confirms the English wording for the same 680 g SKU; gives no scientific name and was out of stock at review. |
| `WP04-SECTIONP-STONE-CRAB-R99-20261014-S06` | Seafood Depot, [Stone Crab](https://www.seafooddepot.ca/product-stonecrab), Canadian supplier product page, accessed 2026-10-14. Identifies *M. mercenaria* and lists claws or meat, fresh/frozen, wild, with USA/Mexico origin. | Supplier product information scoped to *M. mercenaria*; it does not define all CFIA *Menippe* group products or Québec package wording. |
| `WP04-SECTIONP-STONE-CRAB-R99-20261014-S07` | Florida Fish and Wildlife Conservation Commission, [Stone Crab: *Menippe mercenaria* or *Menippe adina*](https://myfwc.com/fishing/saltwater/commercial/stone-crab/), current agency page accessed 2026-10-14. | Supports the Florida fishery’s multi-species market-group scope. Fishery sizes and rules are not household measures, Québec rules, or substitutions. |

## Static review record

- Re-read the current `AGENTS.md`, `Requirements.md`, open Section P crab checklist, current catalog/ledger/form/legacy files, the relevant design note, and neighboring crab reviews.
- Exact searches found no stone-crab decision or ownership in the plan, catalog, forms, legacy identities, ledger, proposals, or batches before integration. The proposed reference ID and seven source IDs were unused at baseline and are each now integrated once.
- Parsed the current package files at integration review and confirmed 1,435 references, 105 forms, 1,775 ledger records, 114 recipes, and 1,123 ingredient rows; after integration there are 1,436 references and 1,776 ledger records.
- Reproduced phrase-first picker results after integration. Specific `stone crab`, `crabe caillou`, and `crabe de pierre` queries select the new row; broad `crab` and `crabe` stay multi-result; the crab-meat row and OQLF/CFIA Northern stone-crab terms remain separate.
- Scanned all manifest-listed recipes and ingredient rows; no exact candidate demand appeared. The only crab recipe line remains the generic jumbo-lump crab-meat request.
- Checked proposal encoding, BOM, line endings, final newline, trailing whitespace, source-ID uniqueness, and local links after integration. Static package, ledger, generated-index, picker, recipe, and text checks passed. No app tests or emulator checks were run because this change only adds database JSON data and its generated catalog index.

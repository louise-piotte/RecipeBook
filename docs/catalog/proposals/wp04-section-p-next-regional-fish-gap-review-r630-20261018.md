# WP04 Section P — Gilthead bream identity reassessment (R630)

- **Status:** Accepted and integrated on 2026-10-18. Added one identity-only `Sparus aurata` reference and its research-ledger record; no recipe or numeric behavior changed.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** Section P's broad finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6495).
- **Candidate:** *Sparus aurata* (CFIA TSN 647901), gilthead bream / dorade royale.
- **Recommendation:** Add one identity-only `PROTEIN` reference with the qualified names `gilthead bream / dorade royale` and English alias `gilthead sea bream`. The alias is OQLF-attested and now yields a second result alongside the multi-species sea-bream group for a broad `sea bream` search.

## Why reconsider the earlier hold

The 2026-10-12 review held this species outside active data because the then-current picker would have returned gilthead bream as the only result for broad `bream` and `dorade` searches. [That hold](wp04-section-p-gilthead-bream-dorade-royale-picker-boundary-review-20261012.md) is now stale in one material respect: R604 integrated separate, visibly qualified multi-species groups for `bream / brème` and `sea bream / dorade`. A species row can now appear alongside those groups, preserving the distinction between a general market name and the *Sparus aurata* identity. R630 does not merge the three references or revise the accepted scope of either R604 group. [R604 proposal](wp04-section-p-bream-sea-bream-market-group-review-r604-20261018.md) · [R604 integration README](../batches/wp04-section-p-bream-sea-bream-market-group-integration-r604-20261018/README.md).

CFIA's Fish List pairs *S. aurata* with `Gilthead Bream / Dorade Royale`. OQLF identifies the same edible fish, prefers Québec French `dorade royale`, and lists English `gilthead bream` and `gilthead sea bream`. The latter is a safe search alias in the current catalog because `sea bream` already returns a multi-species group; adding the alias changes that query from one result to two distinct, visibly scoped results. OQLF also lists `porgy`, but CFIA applies that name to other taxa, so it is deliberately excluded. Do not add `daurade royale`, which OQLF says was not retained by the fish-product terminology committee. [S01–S03]

## Exact proposed catalog delta

Add one identity-only reference. Add no forms, recipe links, measurements, density, unit mappings, package yield, conversions, or substitutions.

```json
{
  "id": "ingredient-ref-gilthead-bream",
  "nameFr": "dorade royale",
  "nameEn": "gilthead bream",
  "aliasesFr": [],
  "aliasesEn": ["gilthead sea bream"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "PROTEIN"
}
```

The integration added a verified `ingredient_reference` ledger record under `ingredient-ref-gilthead-bream`, with `measurementState: researched_no_supported_value`, `substitutionResearchState: researched_no_supported_substitute`, and no `measurementObservations` or `substitutionFindings`. Its accepted decision limits the identity to *Sparus aurata*, keeps the generic bream and sea-bream market groups separate, and records that no numeric or substitution behavior is supported. It cites the reused CFIA and OQLF source IDs plus the new La Mer source ID below. No recipe links were added.

## Name, retail, and product limits

The OQLF GDT entry is specifically in edible-fish and ichthyology domains. It prefers `dorade royale`, associates it with *Sparus aurata*, and lists `gilthead bream` and `gilthead sea bream` in English. It lists `porgy` as an English term, but the CFIA Fish List applies that wording across multiple fish; it is not adopted as an alias. OQLF says `daurade royale` was not retained by its fish-product terminology committee, so that spelling remains out of search terms. [S02]

Poissonnerie La Mer's current Montréal online listing offers `Dorade royale - 500 gr`, describes a Mediterranean fish, gives Greece as origin, and offers seller-selected cleaned, whole, fillet, or steak cuts. The product page gives no scientific name; it supports current Québec market wording and product availability, not a taxonomic trace for an individual lot. Its minimum 500 g item size and seller-specific cut choices are not reusable recipe measures, default quantities, or catalog forms. No yield, density, unit conversion, or substitution follows from that page. [S03]

Keep the identity strictly species-scoped. Do not attach bare `bream`, `brème`, `sea bream`, `seabream`, `dorade`, `daurade`, or `porgy`; do not add the scientific name as a search alias. Keep generic market-name searches visibly multi-result instead of claiming that any one species exhausts them. The reference proposes no culinary equivalence or substitution with other bream, sea bream, porgy, or fish.

## Active ownership, picker behavior, and recipe demand

The read-only audit before integration covered the active ingredient references and forms, legacy import candidates, research ledger, current Section P plan, roadmap, relevant R604 and gilthead-bream proposal/batch records, picker implementation, and all manifest-listed recipes. That pre-integration snapshot contained **1,827 references, 156 forms, 56 legacy candidates, 2,198 ledger records, and 114 recipes with 1,123 ingredient rows**.

Before integration, no active reference, form, legacy candidate, or ledger record owned the proposed reference ID, *Sparus aurata*, `gilthead bream`, `gilthead sea bream`, or `dorade royale`. The earlier proposal documents the held name. Existing broad results belonged to the two R604 references. The table records the pre-integration query projection using the current [ingredient picker](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Before R630 | After adding the R630 row | Resulting scope |
|---|---|---|---|
| `gilthead bream` | No result | Gilthead bream | Species-specific identity. |
| `gilthead sea bream` | No result | Gilthead bream | OQLF-attested alias for the same species. |
| `dorade royale` | No result | Gilthead bream | OQLF-preferred Québec French name. |
| `bream` | Bream market group; sea-bream market group | Both groups; gilthead bream | Broad query still returns visibly separate choices. |
| `sea bream` | Sea-bream market group | Sea-bream market group; gilthead bream | The R604 multi-species group and named species both remain discoverable. |
| `dorade` | Sea-bream market group | Sea-bream market group; gilthead bream | Broad French query returns the group and qualified species. |
| `brème` | Bream market group | Bream market group | No change. |
| `daurade royale`, `porgy` | No result | No result | Rejected or cross-species wording remains inactive. |

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for `gilthead bream`, `gilthead sea bream`, `gilthead seabream`, *Sparus aurata*, `dorade royale`, `daurade royale`, `bream`, `brème`, `sea bream`, `seabream`, `porgy`, `dorade`, and `daurade`. There were **zero candidate-term matches in recipe files or ingredient rows**, and zero broad bream/dorade matches in ingredient rows. There is no candidate-specific recipe demand, recipe link, requested quantity, or source-backed substitution. No form or numeric behavior is proposed.

## Source-ID and URL ownership

The source audit found no ledger owner for the La Mer product URL or the new R630 source ID. Reuse existing IDs for CFIA and OQLF rather than allocating duplicate IDs for their already-recorded URLs. The exact CFIA results URL is shared by many ledger entries; `WP04-SECTIONP-BREAM-MARKET-GROUP-R604-20261018-S01` is the relevant existing owner and already covers the *S. aurata* row. `WP04-P-GILTHEAD-BREAM-20261012-S02` is the existing OQLF owner attached to the R604 sea-bream group.

| Source ID | Source and evidence | Ownership and limit |
|---|---|---|
| **Reused `WP04-SECTIONP-BREAM-MARKET-GROUP-R604-20261018-S01`** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), row TSN 647901, *Sparus aurata*, `Gilthead Bream / Dorade Royale`. | Already owned by R604 bream/sea-bream records and the R626 Mrigal group; reuse the exact ID and URL. This is Canadian fish-labelling-name evidence, not culinary equivalence. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), describing the list's English/French common-name and taxon information. | Existing overview source ID shared by multiple fish records; reuse it. It establishes the list's naming role, not product availability. |
| **Reused `WP04-P-GILTHEAD-BREAM-20261012-S02`** | OQLF, [GDT: dorade royale](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199006/dorade-royale), edible-fish and ichthyology entry for *S. aurata*. | Already owned by the R604 sea-bream group. The entry was last updated in 2011; it supports terminology, not current stock. |
| **New `WP04-SECTIONP-GILTHEAD-BREAM-R630-20261018-S01`** | Poissonnerie La Mer, [Dorade royale](https://www.lamer.ca/products/dorade-royale-entiere), current product page. | Before R630, no exact URL or source-ID owner was found in the ledger or earlier proposal/batch archive; this new ID is proposal-local. Québec retailer wording, seller-selected cuts, minimum item weight, and stated Greece origin only; no scientific name or lot traceability. |
| **R01** | Read-only repository audit of the active package, ledger, picker, recipe manifest, R604 integration, and earlier gilthead-bream hold. | Proposed ID and new source ID are unallocated; shared files were not changed. |

## Recommendation

**Add** the exact identity-only reference above. R604 resolved the old picker reason for holding *Sparus aurata*: broad `bream`, `sea bream`, and `dorade` queries now return both broader groups and a separately named species. Retain the R604 rows unchanged, keep the French display at OQLF's `dorade royale`, use only OQLF's `gilthead sea bream` as an English alias, and add no product-state or numeric behavior. The Section P parent checklist remains open.

The accepted data update passed seed-package, generated-index, ledger, source/alias ownership, recipe corpus, and scoped encoding/link validation. No software tests were run because the change only adds database JSON data under `AGENTS.md`.

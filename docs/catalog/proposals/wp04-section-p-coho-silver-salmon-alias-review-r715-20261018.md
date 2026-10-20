# WP04 Section P — coho “silver salmon” search alias review (R715)

- **Review and source-access date:** 2026-10-18.
- **Status:** Proposal only; no shared catalog or research-ledger records were changed.
- **Recommendation:** Add the English search alias `silver salmon` to the existing `ingredient-ref-coho-salmon`. Keep the canonical pair `coho salmon / saumon coho`; add no French alias, new identity, or form.
- **Open checklist:** Section P finfish and regional fish coverage remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6766).

## Scope and decision

This review resolves one English name gap on the accepted coho identity, *Oncorhynchus kisutch*. NOAA Fisheries currently identifies “Silver salmon” as a name for coho, FDA’s current Seafood List includes `Silver Salmon` among acceptable market names for *O. kisutch*, and OQLF lists `silver salmon` as an English term for its preferred Québec term `saumon coho`. Add only the full English phrase as a search alias. The picker will continue to display the canonical name `coho salmon / saumon coho`.

The earlier [R104 coho review](wp04-section-p-coho-salmon-identity-review-r104-20261014.md) intentionally left both `silver salmon` and `saumon argenté` out of the alias arrays because OQLF does not retain `saumon argenté` for Québec fish-product marketing. R715 revisits only the English search alias: a search term does not change the visible French or English canonical display. Preserve OQLF’s Québec naming decision by leaving `saumon argenté` unassigned. This also does not make a Canadian product-label claim from FDA’s U.S. guidance.

Do not add `medium red salmon`, `white salmon`, `hoopid salmon`, `blueback salmon`, or `blueback` from adjacent name sources. R124 and R105 document why the blueback terms require particular care across coho and other fish names; this review has no need to expand those boundaries.

## Exact proposed data

The existing reference remains `ingredient-ref-coho-salmon`, category `PROTEIN`, display `coho salmon / saumon coho`, with no forms, null density, and no unit mappings. If adopted, its proposed resulting name fields are:

```json
{
  "id": "ingredient-ref-coho-salmon",
  "nameEn": "coho salmon",
  "nameFr": "saumon coho",
  "aliasesEn": ["silver salmon"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "PROTEIN"
}
```

This is one alias on an existing identity. No reference, form, candidate, recipe-line, or ledger-record ID is proposed. Add no measure, density, mapping, form, package yield, conversion, recipe link, or substitution.

## Evidence

All source citation labels below are proposal-local. They are not new shared-ledger source IDs.

| Proposal-local ID | Source and observation | Limit |
|---|---|---|
| `WP04-SECTIONP-COHO-SILVER-ALIAS-R715-20261018-P01` | NOAA Fisheries, [Coho Salmon](https://www.fisheries.noaa.gov/species/coho-salmon), accessed 2026-10-18 and last updated 2026-06-29. The profile names *Oncorhynchus kisutch*, lists `Silver salmon` under “Also Known As,” and says coho are commonly called silver salmon. | U.S. federal species profile and common-name evidence; it does not establish Canadian fish-label rules, Québec retail use, or a product’s stock or origin. |
| `WP04-SECTIONP-COHO-SILVER-ALIAS-R715-20261018-P02` | U.S. FDA, [Seafood List — *Oncorhynchus kisutch*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Oncorhynchus_kisutch&set=SeafoodList), accessed 2026-10-18; the list is updated August 2026. The record names `Coho Salmon` as the common name and includes `Silver Salmon` among acceptable market names for this taxon. | U.S. interstate seafood naming guidance, not Canadian or Québec labeling authorization. Use as search evidence only. FDA also repeats the term among vernacular cross-references; the alias recommendation relies on the record’s separate acceptable-market-name field. |
| `WP04-SECTIONP-COHO-SILVER-ALIAS-R715-20261018-P03` | OQLF, [saumon coho, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198950/saumon-coho), accessed 2026-10-18; last updated 2012. OQLF identifies *O. kisutch*, prefers `saumon coho`, lists English `coho salmon` and `silver salmon`, and says `saumon argenté` was not retained for Québec fish-product marketing. | The page is already represented in the shared ledger. Its current coho source note does not record the English `silver salmon` translation explicitly; if integrated, update that existing parent source note in place rather than adding a duplicate URL/source record. The French marketing note remains controlling for the French display decision. |

The evidence supports the synonym-to-species search mapping, but not an alternate Québec French label, a Canadian `silver salmon` product label, or any claim about a specific salmon item.

## Current ownership and prior-review audit

Read the live seed references and forms, legacy-import identities, shared research ledger, Section P plan and roadmap entries, the R104 and R105 coho/salmon reviews, R124’s blueback-herring boundary, R709’s Atlantic-salmon whole-fish form, R712’s scrod terminology review, and their integration notes.

| Audit | Current result |
|---|---|
| Live package snapshot | 1,841 ingredient references, 174 forms, and 114 manifest-listed recipes. The shared ledger has 2,224 records, 10,433 source entries, 8,802 distinct source IDs, and 7,451 distinct source URLs; the legacy-import file has 56 candidates. |
| Existing coho owner | `ingredient-ref-coho-salmon` is `coho salmon / saumon coho`, category `PROTEIN`, with empty English and French alias arrays, no attached form, `defaultDensity: null`, and `unitMappings: []`. Its existing identity and recipe boundary remain unchanged. |
| Proposed phrase and aliases | No active reference name/alias, form label/match term, or legacy candidate owns the exact normalized phrase `silver salmon`. The phrase is absent from the current ledger text. It appears in the R104 proposal as an explicitly excluded term; R715 reopens only its English search-alias status. No other aliases are proposed. |
| Related source ownership | The exact OQLF URL is already owned in the ledger by `ingredient-ref-coho-salmon` as `WP04-SECTIONP-COHO-SALMON-R104-20261014-S01` and by `candidate-wp04-salmon-species-scope` as `WP04-SALMON-TUNA-BOUNDARY-20261011-S04`. Do not duplicate or reassign it; integration may amend the existing coho source note to capture the English translation observed here. The exact NOAA and FDA URLs above have no current ledger source owner. |
| R715 proposal allocation | The R715 filename, source-ID prefix, and P01–P03 labels had no prior repository occurrence at audit time. P01–P03 are proposal citations only; no active source IDs or ledger entries are allocated here. |
| Prior boundary | R104 chose the OQLF-preferred display and left `silver salmon` and `saumon argenté` out of aliases. R105 and R124 keep `blueback` scoped carefully because CFIA also uses `Blueback Salmon / Saumon Coho` for coho. R709 concerns an Atlantic-salmon form; R712 concerns `scrod` aliases for Atlantic cod and Haddock. None assigns the phrase `silver salmon`. |

## Picker projection

The projection follows the current phrase-first matcher in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases in a reference’s names and aliases are preferred, with substring fallback only when there are no phrase matches. The search result remains the existing reference; aliases do not replace the canonical display.

| Query | Current picker | With only `silver salmon` added to coho | Effect |
|---|---|---|---|
| `silver salmon` | No result | Coho salmon / saumon coho | Adds the directly supported full English synonym as a selectable coho result. |
| `coho salmon`; `saumon coho` | Coho salmon / saumon coho | Same | Existing canonical searches are unchanged. |
| `salmon`; `saumon` | The same 10 salmon references | Same 10 references | Broad salmon searches stay multi-result. |
| `salmon fillets`; `filet de saumon` | Generic salmon fillets | Same generic salmon fillets | Recipe-facing generic fillet search remains unchanged. |
| `silver` | Swiss chard | Coho salmon and Swiss chard | The broad one-word search becomes visibly multi-result rather than selecting one ingredient. |
| `saumon argenté` | No result | No result | OQLF’s non-retained Québec French term remains excluded. |
| `blueback salmon`; `medium red salmon`; `white salmon`; `hoopid salmon` | No result | No result | No adjacent or potentially confusing name is added. |

The 10 broad salmon results are Atlantic salmon, canned salmon, Chinook salmon, chum salmon, coho salmon, pink salmon, generic salmon fillets, salmon roe, smoked salmon, and sockeye salmon. No existing broad, French, or recipe-oriented result changes.

## Manifest recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were scanned. The scan inspected complete recipe-file text and parsed JSON strings and ingredient rows for `silver salmon`, `coho salmon`, `saumon coho`, `saumon argenté`, *Oncorhynchus kisutch*, and `ingredient-ref-coho-salmon`. It found **zero matching recipe files and zero matching ingredient rows**. The manifest-order raw recipe bytes total **754,048**, with SHA-256 `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`.

Recipe 077 row 10 remains the generic `salmon fillets` line and identifies no species. Keep it on `ingredient-ref-salmon-fillets-without-skin`; the English synonym does not establish coho demand or permit relinking.

## Bounded recommendation and evidence limits

**Add only `silver salmon` to `ingredient-ref-coho-salmon.aliasesEn`.** Keep the displayed names `coho salmon / saumon coho`, keep `aliasesFr` empty, and leave the existing identity source records and recipe links unchanged. NOAA and FDA support the species-level English synonym; OQLF supports that English term while preserving the single Québec French product display. FDA’s U.S. naming category is not Canadian label guidance, and the alias is not presented as a package label.

The bounded review establishes the source-backed search synonym but no specific Québec SKU or recipe using the phrase `silver salmon`. Add no `saumon argenté`, `blueback`, or other listed names; no form, measure, density, unit mapping, conversion, yield, recipe link, or substitution is supported. Section P remains open.

This is one proposal-only Markdown file. It does not change the seed package, shared ledger, generated index, plan, workflow, roadmap, recipes, or integration logs. No software tests, build, emulator check, or deployment were run.

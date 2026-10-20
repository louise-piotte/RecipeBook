# WP04 Section P — short mackerel / maquereau trapu identity review (R314)

- **Review and source-access date:** 2026-10-16.
- **Decision:** Add one identity-only `PROTEIN` reference for short mackerel (*Rastrelliger brachysoma*), displayed as **Short mackerel / maquereau trapu**. CFIA and OQLF map those names to this species; ITIS records `shortbodied mackerel` as an English common-name variant, and a current Canadian retailer listing uses the hyphenated `short-bodied mackerel` wording. Keep only those two spelling variants as English aliases. Leave French aliases and forms empty.
- **Picker boundary:** The proposed qualified phrase resolves to this row. The broad `mackerel` search remains multi-result (seven current rows to eight); broad `maquereau` remains multi-result (six to seven, including its existing gooseberry match). Do not add generic `mackerel` / `maquereau`, `Indo-Pacific mackerel`, `Hasa Hasa`, or `pla thu` aliases.
- **Scope:** One species identity, separate from R311 Indian mackerel (*R. kanagurta*) and the existing Atlantic/Pacific/Spanish mackerel and canned/smoked product groups. The Canadian retailer page concerns a dried product, but does not provide a binomial; its dried state and package amount are not transferred to this species row. No shared catalog, ledger, plan, checklist, roadmap, recipe, generated file, or application code was changed. No software tests, build, emulator check, or deployment was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SHORT-MACKEREL-R314-20261016-S01` through `S04`; `R01` is a repository audit label. These IDs are not allocated to the shared research ledger.

## Why this is an open Section P gap

The Section P parent remains open for mackerel and regional fish. The active catalog contains Atlantic, Pacific, Indian, narrow-barred Spanish, and spotted Spanish mackerel identities, plus separate canned and smoked mackerel product groups; it has no *R. brachysoma* reference. The only active *Rastrelliger* sibling is R311's Indian mackerel / `maquereau des Indes` (*R. kanagurta*). No exact identity owner or focused short-mackerel decision was found in active references, forms, legacy-import identities, the research ledger, Section P proposals or batches, or the plan. The proposed reference ID `ingredient-ref-short-mackerel` and R314 source-ID prefix are unallocated. R311 mentions *R. brachysoma* only as a sibling-species boundary, not as an assigned identity or prior decision. [R01]

## Species, names, and sibling boundary

CFIA's Fish List pairs TSN 172463, *Rastrelliger brachysoma*, with **Short Mackerel / Maquereau Trapu**. It separately lists *R. kanagurta* as **Indian Mackerel / Maquereau des Indes**, and lists the generic **Mackerel / Maquereau** name for that latter taxon. This supports the qualified short-mackerel name while leaving the broad pair out of the new row. [S01]

OQLF's GDT entry gives **maquereau trapu**, English **short mackerel**, and Latin *Rastrelliger brachysoma*; the entry attributes the terms to FAO (1995). ITIS independently lists the species as valid and records `short mackerel`, `shortbodied mackerel`, and `maquereau trapu`. Together, these sources support the bilingual display and both English spellings without genus-wide scope. [S02, S03]

| Candidate field or boundary | Recommendation |
|---|---|
| Proposed identity | Add `ingredient-ref-short-mackerel`, category `PROTEIN`, displayed **Short mackerel / maquereau trapu**, scoped to *R. brachysoma*. |
| English aliases | Add `shortbodied mackerel` (ITIS spelling) and `short-bodied mackerel` (hyphenated Canadian retail wording). These are spelling variants of the qualified name, not broad family terms. |
| French aliases | None. Use the exact OQLF/CFIA display `maquereau trapu`; do not copy `maquereau des Indes` or add generic `maquereau`. |
| R311 Indian mackerel | Preserve `Indian mackerel / maquereau des Indes` on *R. kanagurta*. Do not merge the two species or transfer the generic `Mackerel / Maquereau` label listed for that species. |
| Generic and regional wording | Do not add `mackerel`, `maquereau`, `Indo-Pacific mackerel`, `Hasa Hasa`, or `pla thu`. Current evidence does not establish those as globally safe synonyms for this catalog identity; a broad term would also obscure the existing species and prepared-product choices. |
| Product states and numeric data | Add no dried, frozen, whole, cleaned, or other form, density, household measure, unit mapping, conversion, or yield. The Canadian product listing's 100 g package and dried state are SKU-specific observations, not transferable recipe behavior. |
| Recipes and substitutions | Add no recipe link, global form conversion, recipe-line alternative, or contextual substitution. No bundled recipe or reviewed evidence supplies a directed replacement. |

## Canadian market evidence and limits

Save-On-Foods currently lists Sea Catch **Dried Mackerel (Hasa Hasa) Fish**, 100 g, and describes it as “dried short-bodied Mackerel fish.” This is Canadian retail evidence that the hyphenated short-bodied wording is used for a food product. The listing supplies neither a scientific name nor a Québec location or French package wording, so it does not establish that this particular SKU is *R. brachysoma* or available in Québec. The species assignment rests on the separate CFIA, OQLF, and ITIS name records; the product must not be treated as proof of a universal dried form. [S04]

No current Québec retailer/package listing that names *R. brachysoma* was verified in this bounded review. OQLF does provide the species-specific Québec French term, so the display is supported even though Québec retail stock and local package wording remain unconfirmed. The Save-On listing's 100 g amount describes a retail pack; it is not a recipe serving or reusable ingredient measure. [S02, S04]

## Exact ownership and picker projection

The ownership audit checked normalized exact names and aliases in the active references, attached form labels and match terms, legacy-import identities, and ledger records, plus the Section P plan, proposal, and batch history. No active row, legacy owner, ledger identity, or prior focused review covers `short mackerel`, `shortbodied mackerel`, `short-bodied mackerel`, `maquereau trapu`, or *R. brachysoma*. R311's active Indian-mackerel row remains the only *Rastrelliger* identity. [R01]

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are returned before partial-match fallback. Mackerel has no attached forms in the current catalog, so this projection uses reference displays and aliases.

| Query | Current picker | With proposed row | Boundary |
|---|---|---|---|
| `short mackerel` | None | Short mackerel only | Exact CFIA/OQLF English display. |
| `shortbodied mackerel` | None | Short mackerel only | ITIS common-name spelling. |
| `short-bodied mackerel` | None | Short mackerel only | Hyphenated spelling used by the Canadian retailer listing. |
| `maquereau trapu` | None | Short mackerel only | Exact CFIA/OQLF French display. |
| `mackerel` | Seven: Atlantic, canned, Indian, narrow-barred Spanish, Pacific, smoked, and spotted Spanish mackerel | Same seven plus short mackerel (eight total) | Broad English search remains multi-result. |
| `maquereau` | Six: Atlantic, canned, Indian, Pacific, and smoked mackerel, plus gooseberry / `groseille à maquereau` | Same six plus short mackerel (seven total) | Broad French search remains multi-result; the existing gooseberry match is unchanged. |
| `Indian mackerel` / `maquereau des Indes` | Indian mackerel only | Same | R311 ownership is unchanged. |
| `Indo-Pacific mackerel` | None | None | No alias is proposed. |
| `Rastrelliger brachysoma` | None | None | Scientific names are not picker aliases and remain unindexed. |

This is a static projection over current catalog terms and a candidate in memory; it does not modify shared data or constitute an app test. [R01]

## Bundled-recipe demand and substitutions

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**. It searched complete recipe JSON and ingredient-row text for `short mackerel`, both short-bodied spellings, `maquereau trapu`, *Rastrelliger brachysoma*, and *Rastrelliger*. It found zero matching files and zero matching ingredient rows. No recipe link, quantity, preparation state, or recipe-specific alternative is supported. [R01]

The bundled global and contextual substitution-rule files are both empty. No reviewed source provides a method-, dish-, direction-, and quantity-specific substitute for this species. Do not infer interchangeability with Indian, Atlantic, Pacific, Spanish, canned, or smoked mackerel from the shared family name or product category. Add no global or contextual rule. [R01]

## Source register

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SHORT-MACKEREL-R314-20261016-S01** | CFIA, [Fish List results for *Rastrelliger brachysoma*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s&q=Rastrelliger%20brachysoma), accessed 2026-10-16. | Lists TSN 172463 as *R. brachysoma* / **Short Mackerel / Maquereau Trapu**. The same current Fish List gives R311's sibling *R. kanagurta* as **Indian Mackerel / Maquereau des Indes** and separately lists **Mackerel / Maquereau** for that taxon. Canadian common-name evidence; not a retail listing, recipe identity, or substitution source. |
| **WP04-SECTIONP-SHORT-MACKEREL-R314-20261016-S02** | OQLF, [GDT: maquereau trapu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26524551/maquereau-trapu), accessed 2026-10-16. | Gives `maquereau trapu`, English `short mackerel`, and Latin *R. brachysoma*; attributes the terminology to FAO (1995). Supports the Québec French term and species boundary, not Québec product availability or current package wording. |
| **WP04-SECTIONP-SHORT-MACKEREL-R314-20261016-S03** | ITIS, [Report: *Rastrelliger brachysoma*](https://www.itis.gov/servlet/SingleRpt/SingleRpt?categories=All&search_credRating=all&search_kingdom=every&search_span=containing&search_topic=Scientific_Name&search_value=Rastrelliger+brachysoma&source=html), accessed 2026-10-16. | Lists the valid species' common names as `short mackerel`, `shortbodied mackerel`, and `maquereau trapu`. Supports the alternate English spelling; it is taxonomic evidence, not Canadian retail availability or legal labeling authority. |
| **WP04-SECTIONP-SHORT-MACKEREL-R314-20261016-S04** | Save-On-Foods, [Sea Catch — Dried Mackerel (Hasa Hasa) Fish](https://www.saveonfoods.com/sm/planning/rsid/4410/product/sea-catch-dried-mackerel-fish-00878052006451), accessed 2026-10-16. | Current online retailer listing for a 100 g product, described as dried short-bodied mackerel and commonly eaten fried with vinegar. It supplies no binomial and no Québec availability evidence; pack weight and dried state are product-specific. |
| **WP04-SECTIONP-SHORT-MACKEREL-R314-R01** | Read-only audit of the Section P checklist/plan, current [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), proposals, batches, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), manifest-listed recipes, substitution files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Exact ownership search, static picker projection, and recipe-corpus scan. Repository evidence only; proposal-local audit label, not a ledger source. |

## Final recommendation

**Recommend** one identity-only `PROTEIN` reference for **Short mackerel / maquereau trapu** (*Rastrelliger brachysoma*), with `short-bodied mackerel` and `shortbodied mackerel` as the only English aliases and no French aliases. Preserve R311's Indian-mackerel identity and keep broad family queries multi-result. Add no forms, reusable measurements, recipe links, conversions, yields, or substitutions. Species and bilingual names are directly supported; the Canadian product evidence corroborates market wording but not a binomial or Québec availability. This is the only R314 artifact; no software tests or emulator checks were run.

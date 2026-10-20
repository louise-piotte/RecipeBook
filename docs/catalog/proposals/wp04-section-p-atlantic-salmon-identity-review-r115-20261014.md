# WP04 Section P — Atlantic salmon species identity review (R115)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** Proposal-only Canadian/Québec identity, ownership, picker, recipe-demand, and numeric/form/substitution review.
- **Recommendation:** **Add one identity-only reference** for Atlantic salmon, *Salmo salar*, with English display `Atlantic salmon`, preferred Québec French display `saumon de l’Atlantique`, and the qualified French search alias `saumon atlantique`.
- **Scope:** This species-qualified row is distinct from the generic `salmon / saumon` market-group row held by R114. Keep the bare group hold and the existing `salmon fillets / filet de saumon` recipe reference unchanged. This proposal edits no catalog JSON, ledger, plan, roadmap, generated index, recipe, or runtime file. No tests or emulator checks were run.

## Species scope and Québec naming

The active [Section P finfish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4577) remains open. Five Pacific salmon identities and one recipe-facing generic salmon-fillets reference are active; there is no active Atlantic salmon identity.

Québec terminology and current product evidence support a species-qualified row. The OQLF GDT normalizes `saumon de l’Atlantique` for the edible fish and gives the English equivalent `Atlantic salmon` and Latin name *Salmo salar*. It notes that `saumon atlantique`, `ouananiche`, and `saumon de Gaspé` were not retained as consumer fish-product terms in its normalization. Current Canadian fish-name data and a Québec retailer listing also use the shorter qualified phrase `saumon atlantique`; keep that phrase as an internal search alias while displaying the OQLF-preferred wording. The alias remains species-qualified. Do not add bare `salmon` or `saumon` aliases, `ouananiche`, or `saumon de Gaspé`.

The Government of Québec identifies the species as *Salmo salar* and describes ouananiche as its freshwater-confined form. That life-history context does not make `ouananiche` a retail alias for the food-fish row. Metro’s Québec listing for `Filets de saumon Atlantique frais` gives *Salmo salar* and a Chilean origin, showing that “Atlantique” in this product name identifies the fish species rather than its harvest ocean.

R114 holds only the unqualified market-group identity. R114’s source review itself says CFIA assigns `Atlantic Salmon / Saumon` and `Salmon / Saumon Atlantique` to *S. salar*, and the active recipe row remains taxon-unspecified. The separate [R47 Québec semi-smoked Grizzly product review](wp04-section-p-gravlax-style-semi-smoked-salmon-product-boundary-review-20261013-round47.md) covers one prepared product containing Atlantic salmon; that prepared-product boundary did not add a base-species reference. Neither review allocates the proposed species ID or narrows recipe 077.

## Current catalog, forms, legacy, and ledger ownership

The live bundled package contains **1,456 active ingredient references** and **105 forms**; the legacy-import catalog has **63 candidates**; the research ledger has **1,796 records**.

| Active salmon reference | Scope | Aliases |
|---|---|---|
| `ingredient-ref-salmon-fillets-without-skin` | `salmon fillets / filet de saumon`, no species | None |
| `ingredient-ref-chinook-salmon` | *Oncorhynchus tshawytscha* | `king salmon`; `saumon royal` |
| `ingredient-ref-chum-salmon` | *O. keta* | `keta salmon` |
| `ingredient-ref-coho-salmon` | *O. kisutch* | None |
| `ingredient-ref-pink-salmon` | *O. gorbuscha* | None |
| `ingredient-ref-sockeye-salmon` | *O. nerka* | `red salmon`; `saumon sockeye` |

No active reference, form, or legacy candidate owns the exact normalized terms `Atlantic salmon`, `saumon de l’Atlantique`, `saumon atlantique`, `ouananiche`, or *Salmo salar*. No salmon form is attached to any active salmon reference. The proposed ID `ingredient-ref-atlantic-salmon` and R115 source-ID prefix were also unallocated when checked.

The related ledger owners are `candidate-wp04-salmon-species-scope`, which leaves only recipe 077’s unnamed species unresolved; `ingredient-ref-salmon-fillets-without-skin`, which remains unreviewed as a generic recipe ingredient; and the five accepted Pacific-salmon identity records. No record allocates *S. salar*. The current [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json) were checked for exact normalized ownership. The R114 group hold remains recorded in its [integration note](../batches/wp04-section-p-generic-salmon-group-boundary-hold-integration-20261014/README.md).

## Picker projection

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, punctuation, and spacing; complete word phrases across bilingual display names, aliases, and attached forms match before substring fallback. This static projection adds only the species row below. It is not a UI test.

| Query | Current matches | With proposed row | Picker effect |
|---|---:|---:|---|
| `Atlantic salmon` | 0 | 1 | Species-qualified English query selects the new row. |
| `saumon de l’Atlantique` | 0 | 1 | Preferred Québec French query selects the new row. |
| `saumon atlantique` | 0 | 1 | The sourced qualified search alias selects the new row. |
| `salmon` | 6 | 7 | Remains a multi-result list: five Pacific species, generic salmon fillets, and Atlantic salmon. |
| `saumon` | 6 | 7 | Same seven distinct product/species results; no bare group row is introduced. |
| `salmon fillets` | 1 | 1 | Stays on `ingredient-ref-salmon-fillets-without-skin`. |
| `filet de saumon` | 1 | 1 | Stays on `ingredient-ref-salmon-fillets-without-skin`. |
| `ouananiche` | 0 | 0 | Not added as an alias. |

The qualifier is visible on the proposed result, and each broad salmon query returns multiple explicit rows. This leaves the held group boundary legible while allowing users who search current Québec wording to select *S. salar*.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for Atlantic-salmon names, *Salmo salar*, salmon/saumon ingredient demand, and recipe links. There is **one** salmon ingredient row: recipe 077 row 10, `675 g salmon fillets without skin, cut into cubes`, linked to `ingredient-ref-salmon-fillets-without-skin`. No recipe names Atlantic salmon, *S. salar*, or ouananiche. Keep the row, link, and 675 g amount unchanged; it supplies no species selection.

## Numeric, form, and substitution limits

| Dimension | Evidence boundary | Proposal limit |
|---|---|---|
| Numeric | Recipe 077 uses 675 g in its own generic ingredient line. The Metro listing is product-specific and does not establish a transferable portion for the species. | Keep the 675 g line amount attached only to recipe 077. Add no portion, per-fillet weight, density, unit mapping, conversion, yield, or default quantity. |
| Form | The Metro listings describe particular fresh fillet products. No active form is attached to a salmon identity. | Add no fresh, frozen, boneless, raw, cooked, canned, smoked, or other form. Do not generalize SKU wording to every *S. salar* product. |
| Substitution | No reviewed source identifies a directional, recipe-context substitution to or from *S. salar*. R114’s external Keta-to-fresh-salmon pasta note does not identify the fresh fish species. The active global and contextual substitution-rule files contain no salmon rule. | Add no global or contextual substitution, ratio, warning, or recipe-line substitution link. |

No Pacific-salmon CNF observation is transferred to Atlantic salmon. The proposal adds **zero** forms, numeric values, mappings, conversions, yields, recipe links, or substitutions.

## Proposed identity-only row

For a later authorized data integration, use this identity shape:

```json
{
  "id": "ingredient-ref-atlantic-salmon",
  "nameEn": "Atlantic salmon",
  "nameFr": "saumon de l\u2019Atlantique",
  "aliasesEn": [],
  "aliasesFr": ["saumon atlantique"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN",
  "updatedAt": "2026-10-14T00:00:00Z"
}
```

This proposal does not perform that integration. Keep recipe 077 and the R114 generic-group hold unchanged.

## Sources

Online pages were accessed on **2026-10-14**, except where a source update date is stated. Source IDs are local to this proposal and are not ledger allocations.

| Source ID | Source and support | Limit |
|---|---|---|
| `WP04-SECTIONP-ATLANTIC-SALMON-R115-20261014-S01` | Office québécois de la langue française, [GDT — saumon de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198857/saumon-de-latlantique). Edible-fish domain; preferred term `saumon de l’Atlantique`, English `Atlantic salmon`, Latin *Salmo salar*; notes that the alternative `saumon atlantique` was not retained in normalized Québec fish-product marketing. Page last updated 2012. | Québec terminology authority; the update predates the current retailer listings. |
| `WP04-SECTIONP-ATLANTIC-SALMON-R115-20261014-S02` | Canadian Food Inspection Agency, [Fish List results for *Salmo salar*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Salmo%20salar) and [Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). The results show TSN 161996 *S. salar* with `Atlantic Salmon / Saumon` and `Salmon / Saumon Atlantique`; CFIA describes the list as acceptable English/French fish-label names paired to scientific names and TSNs. | Canadian fish-label common names; the bare pair does not decide the meaning of an unspecified recipe line. The guidance page lists a 2019-06-28 modification date. |
| `WP04-SECTIONP-ATLANTIC-SALMON-R115-20261014-S03` | Gouvernement du Québec, [Saumon atlantique](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/saumon-atlantique). Lists *Salmo salar*, English `Atlantic salmon`, other French names `saumon` and `ouananiche (forme confinée en eau douce)`, and distinguishes the freshwater-confined and anadromous forms. | Species profile, not a fish-product label or recipe substitution source. |
| `WP04-SECTIONP-ATLANTIC-SALMON-R115-20261014-S04` | Metro Québec, [Filets de saumon Atlantique frais, format économique, product 222357](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/saumons-truites-et-thons/filets-de-saumon-atlantique-frais/p/222357). Current listing title uses `saumon Atlantique` and identifies `(salmo salar)`; it gives Chilean provenance, so the name is species-qualified rather than a claim of Atlantic harvest origin. | One retailer SKU page; availability was shown as out of stock for the selected store and can change. It does not define a universal form or origin for the species. |

## Review checks

- Re-read the active Section P checklist, current reference/form/legacy/ledger ownership, [R114’s group hold](wp04-section-p-generic-salmon-market-group-review-r114-20261014.md) and integration note, [R113’s razor-clam review](wp04-section-p-atlantic-razor-clam-picker-boundary-review-r113-20261014.md), and the [R47 Atlantic salmon product-state review](wp04-section-p-gravlax-style-semi-smoked-salmon-product-boundary-review-20261013-round47.md).
- Reproduced the current phrase-first picker projection for the current references/forms plus the proposed alias, without changing the catalog.
- Scanned all manifest-listed recipe files and ingredient rows; only 077#10 uses salmon, and it remains generic.
- This is one proposal file only. No catalog, ledger, plan, roadmap, recipe, or runtime file was changed. No tests or emulator checks were run.

# WP04 Section P — coho salmon / saumon coho identity review (R104)

- **Review and source-access date:** 2026-10-14.
- **Scope:** Coho salmon, *Oncorhynchus kisutch* (CFIA TSN 161977).
- **Integrated result:** Added one identity-only `PROTEIN` reference as **coho salmon / saumon coho**, with empty alias arrays, no forms or active measures, and no recipe links, conversions, yields, or substitutions.
- **Recipe boundary:** Keep recipe 077 row 10 on the generic salmon-fillets reference. It names no salmon species.

## Candidate and prior decisions

The parent finfish item remains open in the [Section P catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4448). This is a distinct salmon taxon following the accepted [chum salmon R96](wp04-section-p-chum-salmon-identity-review-r96-20261014.md) and [pink salmon R103](wp04-section-p-pink-salmon-identity-review-r103-20261014.md) identities. It does not revisit the [Atlantic bluefin R101 hold](wp04-section-p-atlantic-bluefin-tuna-picker-boundary-hold-r101-20261014.md) or [yellowfin tuna R102](wp04-section-p-yellowfin-tuna-identity-review-r102-20261014.md).

The 2026-10-11 [generic salmon/tuna scope review](wp04-finfish-salmon-tuna-species-boundary-recheck-20261011.md) cites OQLF’s coho species wording to show why recipe 077 does not identify a species. It keeps that recipe line broad; it does not decide a coho reference, its picker names, or Québec product-state evidence. The R96 and R103 reviews likewise preserve recipe 077 while deciding separate chum and pink identities. The unresolved candidate-wp04-salmon-species-scope remains limited to the unnamed species in recipe 077 and does not block this separately sourced identity.

Current exact-key ownership checks found no coho identity in active references, forms, or legacy-import candidates, and no coho-specific ledger decision or prior proposal/batch. The existing generic salmon-scope ledger candidate is the only related ledger record. The proposed ID ingredient-ref-coho-salmon and R104 source-ID prefix were unallocated at review time.

Keep coho distinct from Atlantic salmon (*Salmo salar*), pink salmon (*O. gorbuscha*), chum salmon (*O. keta*), sockeye (*O. nerka*), Chinook (*O. tshawytscha*), trout, and salmon roe. Do not use coho wording to narrow the existing generic salmon-fillets row or its recipe link.

## Taxon and Québec / Canadian names

The Office québécois de la langue française (OQLF) lists **saumon coho** as the preferred Québec fish-product term, pairs it with English **coho salmon**, and identifies *Oncorhynchus kisutch*. Its entry was last updated in 2012, and the French term was normalized in April 1988. OQLF notes that **saumon argenté** is used in some contexts but was not retained for Québec fish-product marketing to avoid confusing consumer labels. Use the preferred bilingual pair as the two display names; do not add saumon argenté or silver salmon as aliases. [S01]

The Canadian Food Inspection Agency (CFIA) Fish List, modified **2023-09-18**, assigns TSN 161977 to *O. kisutch*. It lists **Coho Salmon / Saumon Coho Rouge Moyen** and **Blueback Salmon / Saumon Coho** for that taxon. The preferred OQLF wording provides a direct Québec display pair without multiplying alternate product-label names in the picker. The same Fish List puts pink, chum, sockeye, rainbow trout, and Chinook under distinct taxon rows, supporting the species boundary. [S02]

Fisheries and Oceans Canada (DFO) names coho salmon as *O. kisutch*, reports it in most coastal streams in British Columbia and in streams from California to Alaska, and distinguishes it from other Pacific salmon species. The regional Pacific salmon information page was modified **2019-12-10**. This is taxonomic and range context, not evidence about the origin or stock of a particular retail item. [S03]

## Québec product states, measures, and substitutions

Mayrand, a Québec food wholesaler, currently lists both **Saumon Coho filet frais** and **Filet de saumon coho surgelé**. Each is an approximately 1 kg seller SKU; the pages showed stock at several selected Québec stores when accessed on 2026-10-14, with store-specific differences. These listings establish current bilingual-market use of the coho name and fresh/frozen fillet presentations. Their per-item weights and inventory do not establish universal fillet measures or normalized catalog forms. [S04–S05]

Health Canada’s Canadian Nutrient File (CNF) has separate coho entries for different source states. The **2019-03-01** record for raw farmed coho (food code 3184) lists one fillet as 159 g, a 90 g Food Guide serving, and 65% refuse. The baked/broiled wild coho record (food code 3193) lists 57.5 g per 100 mL flaked, 143.7 g per 250 mL, a 75 g Food Guide serving, a 178 g half-fillet, and 65% refuse. These figures are tied to their named CNF states and portion conventions; they do not define a raw/frozen/fresh default, recipe measure, general density, or cooked yield. Keep density and unit mappings empty. [S06–S07]

The bundled recipes contain no coho-specific line and the reviewed sources offer no recipe-linked quantity or reusable substitution between coho, generic salmon, chum, pink, or another fish. Do not infer a coho-specific form or a global species-to-species substitution from retail fillet listings or CNF serving portions. Add no forms, measures, density, mappings, conversions, yields, or substitution rules.

## Ownership and recipe demand

The current worktree snapshot contains **1,445 ingredient references, 105 forms, 63 legacy-import candidates, and 1,785 research-ledger records**. The salmon-named active references are:

| Active reference | Display | Scope |
|---|---|---|
| ingredient-ref-salmon-fillets-without-skin | salmon fillets / filet de saumon | Generic recipe-facing row; no forms, aliases, density, or unit mappings. |
| ingredient-ref-chum-salmon | chum salmon / saumon kéta | *O. keta* identity; alias keta salmon; no forms or numeric mappings. |
| ingredient-ref-pink-salmon | pink salmon / saumon rose | *O. gorbuscha* identity; no aliases, forms, or numeric mappings. |

The full manifest-listed recipe corpus contains **114 files, 1,123 ingredient rows, and 753,928 recipe-file bytes**. A scan of every file and ingredient row for coho salmon, saumon coho, *O. kisutch*, blueback salmon, silver salmon, and saumon argenté found no candidate-specific matches. Its only salmon ingredient row is recipe 077 row 10: **675 g salmon fillets without skin, cut into cubes**, linked to ingredient-ref-salmon-fillets-without-skin. Preserve that quantity and generic reference.

## Picker projection

The projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, punctuation, and spacing; return complete word-phrase matches across reference names, aliases, and attached form terms before falling back to substring matches. The hypothetical row uses only the preferred display pair and no aliases.

| Search query | Current results | With proposed row | Boundary |
|---|---|---|---|
| coho salmon | None | coho salmon / saumon coho | Qualified English phrase selects the new identity. |
| saumon coho | None | coho salmon / saumon coho | Preferred Québec French phrase selects the same identity. |
| coho | White vinegar (substring fallback from its alcohol vinegar alias) | coho salmon / saumon coho | The new complete-word phrase takes precedence over the unrelated substring fallback. |
| salmon / saumon | Chum salmon; pink salmon; generic salmon fillets | Chum salmon; coho salmon; pink salmon; generic salmon fillets | Broad searches remain multi-result and preserve the generic row. |
| salmon fillets / filet de saumon | Generic salmon fillets | Generic salmon fillets | The recipe-facing product phrase remains on the generic row. |
| saumon argenté / silver salmon | None | None | OQLF does not retain these variants for Québec fish-product marketing. |
| blueback salmon | None | None | CFIA lists the term for *O. kisutch*; no extra alias is needed for the preferred coho display. |

The identity adds a fourth result to the broad salmon and saumon searches; it does not capture the generic fillet phrase or existing chum/pink terms. The one-word coho query also stops returning the unrelated white-vinegar substring result because the proposed display gives the picker a complete word-phrase match.

## Proposed canonical reference

This object is for root review only; no shared JSON was edited.

~~~json
{
  "id": "ingredient-ref-coho-salmon",
  "nameEn": "coho salmon",
  "nameFr": "saumon coho",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
~~~

## Sources

Online sources were checked on **2026-10-14**. Source IDs use the R104 prefix, which had no prior owner in the proposal or ledger archive at review time.

| Source ID | Source and source date | Evidence and limit |
|---|---|---|
| WP04-SECTIONP-COHO-SALMON-R104-20261014-S01 | OQLF, [saumon coho, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198950/saumon-coho), last updated 2012; preferred term normalized April 1988. | Preferred saumon coho / coho salmon pair and *O. kisutch*; records but does not retain saumon argenté for fish-product marketing. Québec terminology, not recipe-species evidence. |
| WP04-SECTIONP-COHO-SALMON-R104-20261014-S02 | CFIA, [Fish List coho query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=coho), modified 2023-09-18. | Assigns TSN 161977 to *O. kisutch* and lists Coho Salmon, Saumon Coho Rouge Moyen, Blueback Salmon, and Saumon Coho. Canadian fish common-name evidence. |
| WP04-SECTIONP-COHO-SALMON-R104-20261014-S03 | DFO, [Information about Pacific salmon](https://www.pac.dfo-mpo.gc.ca/fm-gp/salmon-saumon/facts-infos-eng.html), modified 2019-12-10. | Identifies coho as *O. kisutch* and gives its Pacific range; does not identify a retail item's origin or recipe taxon. |
| WP04-SECTIONP-COHO-SALMON-R104-20261014-S04 | Mayrand, [Saumon Coho filet frais, product 54964](https://mayrand.ca/fr/nos-produits/poissonnerie/saumon/saumon-coho-filet-frais-54964), accessed 2026-10-14; page copyright ©2025. | Québec listing for fresh coho fillet, approximately 1 kg, with store-level stock shown. Item-specific display and weight only. |
| WP04-SECTIONP-COHO-SALMON-R104-20261014-S05 | Mayrand, [Filet de saumon coho surgelé, product 54947](https://mayrand.ca/fr/nos-produits/poissonnerie/saumon/saumon-coho-filet-sgl-54947), accessed 2026-10-14; page copyright ©2025. | Québec listing for a frozen coho fillet, approximately 1 kg, with store-level stock shown. Item-specific state and package observation only. |
| WP04-SECTIONP-COHO-SALMON-R104-20261014-S06 | Health Canada, [CNF food code 3184: farmed raw coho](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3184), modified 2019-03-01. | Source-specific raw-farmed fillet, Food Guide serving, and refuse portions. Not a measure for all coho products. |
| WP04-SECTIONP-COHO-SALMON-R104-20261014-S07 | Health Canada, [CNF food code 3193: wild coho baked or broiled](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3193&lang=eng), modified 2019-03-01. | Source-specific cooked-flaked volume, half-fillet, Food Guide serving, and refuse portions. Not a raw density or cooking-yield rule. |

## Integration and static review status

Re-read the active Section P checklist, recent salmon identity decisions, current references/forms, legacy candidates, related ledger decisions, prior Section P proposals and batches, and the full manifest-listed recipe corpus. Root verified the OQLF, CFIA, DFO, Mayrand, and CNF sources and integrated the proposed reference plus seven sources and six CNF observations into the ledger. The phrase-first picker keeps qualified coho queries species-specific, broad salmon queries multi-result, and recipe 077#10 generic. Package normalization, package validation, ledger-schema validation, generated-index freshness, picker projection, corpus scan, and scoped whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because the active change adds database JSON data. See the [R104 integration record](../batches/wp04-section-p-coho-salmon-identity-integration-20261014/README.md).

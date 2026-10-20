# WP04 Section P — pink salmon / saumon rose identity review (R103)

- **Review and source-access date:** 2026-10-14.
- **Scope:** Pink salmon, *Oncorhynchus gorbuscha* (CFIA TSN 161975).
- **Recommendation:** Integrated by root on 2026-10-14 as one identity-only `PROTEIN` reference, **pink salmon / saumon rose**, with no aliases, forms, active measures, conversions, recipe links, yields, or substitutions.
- **Recipe boundary:** Keep the unqualified salmon fillets in recipe 077 linked to the existing generic salmon-fillets reference. The recipe does not name this species.

## Candidate and prior decisions

This is one species-level identity from the still-open Section P finfish item in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4446). It follows the distinct [chum salmon identity (R96)](wp04-section-p-chum-salmon-identity-review-r96-20261014.md), and does not reopen the [Atlantic bluefin picker hold (R101)](wp04-section-p-atlantic-bluefin-tuna-picker-boundary-hold-r101-20261014.md) or [yellowfin tuna identity (R102)](wp04-section-p-yellowfin-tuna-identity-review-r102-20261014.md). The [earlier salmon/tuna scope review](wp04-finfish-salmon-tuna-species-boundary-recheck-20261011.md) remains correct for recipe 077: it records that the generic recipe line does not choose a taxon. That unresolved recipe-specific boundary does not preclude a separately sourced pink-salmon identity.

The current active salmon references are the generic recipe-facing salmon fillets and the species-specific chum salmon row. There is no pink salmon reference, form, or exact legacy-import candidate. Exact normalized checks over active reference and form names/aliases, legacy names/aliases, and ledger IDs/decisions found no owner for pink salmon, saumon rose, *O. gorbuscha*, or ingredient-ref-pink-salmon. The only relevant ledger decision is candidate-wp04-salmon-species-scope, which remains unresolved specifically for the unnamed species in recipe 077; it does not record a pink-salmon identity. The R103 source-ID prefix was unallocated at review time.

Keep pink salmon distinct from chum/keta (*O. keta*), sockeye (*O. nerka*), coho (*O. kisutch*), Chinook (*O. tshawytscha*), Atlantic salmon (*Salmo salar*), trout, and salmon roe. Do not move any broad salmon query or recipe link to a single salmon taxon.

## Taxon and Québec / Canadian names

The Office québécois de la langue française (OQLF) entry pairs *Oncorhynchus gorbuscha* with English **pink salmon** and prefers French **saumon rose** for fish products. The entry, last updated in 2012, calls it a fish species with commercial potential in Québec. OQLF records **saumon à bosse** as a term used in some contexts but says it was not retained for Québec fish-product marketing, to avoid confusing consumer labels. Use only the preferred French display; do not add saumon à bosse or humpback salmon as picker aliases. [S01]

The Canadian Food Inspection Agency (CFIA) Fish List, modified **2023-09-18**, assigns TSN 161975 to *O. gorbuscha* and lists **Pacific Pink Salmon / Saumon Rose** and **Pink Salmon / Saumon Rose Du Pacifique**. The neighboring *O. keta* entries separately list chum salmon / saumon kéta and keta salmon. This supports a distinct pink-salmon identity and reinforces the boundary with the already-live chum row. The OQLF preferred pair is the clearer Québec-facing display; keep the CFIA variants out of the alias arrays to avoid multiplying names in the picker. [S02]

Fisheries and Oceans Canada (DFO) identifies pink salmon as *O. gorbuscha* and describes its Pacific range; the profile also notes introduced Great Lakes populations. Its profile was modified **2016-12-19**. Use this as taxonomic and geographic context only, not as evidence that a particular fish in a recipe or Québec store comes from a given stock or origin. [S03]

## Product states, measures, and substitution limits

Current Québec product listings support culinary-market use under the proposed name, but show more than one product state:

- Super C lists a French-language frozen pink-salmon fillet item, identifies *O. gorbuscha*, and shows 900 g for one SKU. A separate approximate 1,000 g listing also identifies the taxon. Both pages showed the selected product out of stock when accessed; they document item naming and package-specific presentation, not reliable current inventory or a universal frozen-fillet size. [S04–S05]
- Ocean’s identifies a Canadian-market wild pink-salmon canned product as *O. gorbuscha* and describes its whole fillet with skin and bones, plus salt. That is one manufacturer’s product specification. The page’s 55 g nutrition serving is not a recipe measure or a can conversion. [S06]

Health Canada’s Canadian Nutrient File (CNF) has separate entries for raw, cooked, and canned pink salmon. Its **2019-03-01** serving records list a 159 g half-fillet and a 90 g Food Guide serving for raw pink salmon (code 3221); 57.5 g per 100 mL flaked, 143.7 g per 250 mL, and a 75 g Food Guide serving for baked/broiled salmon (code 3159); and, for salted canned solids with bone and liquid only (code 3222), 63.4 g per 100 mL drained, 158.5 g per 250 mL, and 454 g per can. Those values belong to their named CNF states and portion conventions. They are not a shared density, household default, retail-can conversion, or cooked yield. No density or unit mapping is supported for the proposed reference. [S07–S09]

These sources do not establish a general form set or a safe, method-independent substitution between pink salmon, chum salmon, generic salmon fillets, or canned and raw fish. Product state and species remain separate questions. Add no forms, conversion, yield, substitution, or numeric behavior.

## Ownership and snapshot

The worktree snapshot used for the static review contains **1,444 ingredient references, 105 forms, 63 legacy-import candidates, and 1,784 research-ledger records**. The salmon-named active entries are:

| Active reference | Display | State |
|---|---|---|
| ingredient-ref-salmon-fillets-without-skin | salmon fillets / filet de saumon | Generic recipe-facing product; no forms, aliases, density, or unit mappings. |
| ingredient-ref-chum-salmon | chum salmon / saumon kéta | Species identity; English alias keta salmon; no forms or numeric mappings. |

The bundled recipe manifest contains **114 recipe files**. A full corpus scan found **1,123 ingredient rows** and **753,928 recipe-file bytes**. Candidate wording and taxon scans found no pink-salmon hits in recipe files or ingredient rows. The only salmon ingredient row is recipe 077 row 10: **675 g salmon fillets without skin, cut into cubes**, linked to ingredient-ref-salmon-fillets-without-skin. Preserve its amount and generic link. It provides no species, product label, source, frozen/canned state, or substitution evidence.

## Picker projection

The projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, punctuation, and spacing; return complete word-phrase matches over reference names, aliases, and attached form terms before falling back to substring matches. The hypothetical row uses only the two preferred display names and empty alias arrays.

| Search query | Current results | With proposed row | Boundary |
|---|---|---|---|
| pink salmon | None | pink salmon / saumon rose | Qualified English query selects the new identity. |
| saumon rose | None | pink salmon / saumon rose | Preferred Québec French query selects the same identity. |
| salmon / saumon | Generic salmon fillets; chum salmon | Generic salmon fillets; chum salmon; pink salmon | Broad searches become a deliberate multi-result list. |
| salmon fillets / filet de saumon | Generic salmon fillets | Generic salmon fillets | The recipe-facing product phrase remains on its generic row. |
| chum salmon / saumon kéta / keta salmon | Chum salmon | Chum salmon | Existing chum identity and alias are unaffected. |
| Pacific Pink Salmon / Saumon Rose Du Pacifique | None | None | CFIA-listed variants are omitted from aliases; users can search the preferred display. |
| humpback salmon / saumon à bosse | None | None | OQLF does not retain the French variant for Québec fish-product marketing. |

The proposed row adds one result to the broad salmon and saumon searches while preserving the generic salmon-fillets row. Do not add broad salmon aliases, Latin-name aliases, product-state aliases such as frozen salmon, or the disfavored humpback wording.

## Proposed canonical reference

This object is for root review only; no shared JSON was edited.

~~~json
{
  "id": "ingredient-ref-pink-salmon",
  "nameEn": "pink salmon",
  "nameFr": "saumon rose",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
~~~

## Sources

Online sources were checked on **2026-10-14**. Source IDs use the R103 prefix, which was unallocated in the proposal and ledger archive at review time.

| Source ID | Source and source date | Evidence and limit |
|---|---|---|
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S01 | OQLF, [saumon rose, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198947/saumon-rose), last updated 2012; preferred French term normalized April 1988. | Pairs preferred saumon rose with pink salmon and *O. gorbuscha*; rejects saumon à bosse for fish-product marketing. Québec terminology, not recipe species-selection evidence. |
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S02 | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Salmon), modified 2023-09-18. | Lists TSN 161975, *O. gorbuscha*, and the two bilingual pink-salmon name rows; neighboring chum rows distinguish *O. keta*. Canadian fish common-name evidence, not culinary equivalence. |
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S03 | DFO, [Pink Salmon species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pink-salmon-saumon-rose-eng.html), modified 2016-12-19. | Confirms the taxon, Pacific range, and introduced Great Lakes presence. Distribution does not identify retail origin or recipe species. |
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S04 | Super C, [Saumon rose surgelé, product 226751](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/saumon-rose-surgele/p/226751), accessed 2026-10-14. | Québec product page names frozen pink salmon, gives *O. gorbuscha*, an approximate 1,000 g item and North-East Pacific / Canada origin; selected product showed out of stock. SKU evidence only. |
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S05 | Super C, [Selection frozen pink-salmon fillet, 900 g](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/filet-de-saumon-rose-surgele/p/059749996488), accessed 2026-10-14. | French Québec retail name and a frozen 900 g package; selected product showed out of stock. Page does not establish a universal measure or current local availability. |
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S06 | Ocean’s, [Saumon rose sauvage](https://oceans.ca/fr/products/saumon-rose-sauvage/), accessed 2026-10-14; page copyright ©2026. | Identifies *O. gorbuscha* and describes one salted canned whole-fillet product with skin and bones. Its nutrition-serving display does not define recipe portions or can measures. |
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S07 | Health Canada, [CNF food code 3221: raw pink salmon](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3221), modified 2019-03-01. | Source-specific raw half-fillet, Food Guide portion, and refuse observations. Not transferable to other states. |
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S08 | Health Canada, [CNF food code 3159: baked or broiled pink salmon](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3159), modified 2019-03-01. | Source-specific cooked-flaked volume and Food Guide portion observations. Not a raw-fish density or cooking-yield rule. |
| WP04-SECTIONP-PINK-SALMON-R103-20261014-S09 | Health Canada, [CNF food code 3222: salted canned pink salmon](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3222), modified 2019-03-01. | Portion data for canned solids with bone and liquid; can size and drained-volume entry do not apply to all canned pink salmon. |

## Static review status


## Root integration (2026-10-14)

Added `ingredient-ref-pink-salmon` as identity-only `pink salmon / saumon rose`, with no aliases. Kept recipe 077#10 linked to generic `ingredient-ref-salmon-fillets-without-skin` and left the chum row unchanged. Added all nine source records, three decisions, and nine CNF food-code-specific portion observations to the ledger. Kept active measures, density, mappings, forms, recipe links, yields, and substitutions empty. The unqualified salmon picker query now returns generic fillets, chum salmon, and pink salmon; qualified results remain distinct.

Static package normalization/validation, ledger schema validation, generated-index freshness, picker projection, recipe corpus, and scoped documentation checks passed. No app, Gradle, instrumentation, or emulator tests were run because the only catalog change adds database JSON data.

See the [integration record](../batches/wp04-section-p-pink-salmon-identity-integration-20261014/README.md).

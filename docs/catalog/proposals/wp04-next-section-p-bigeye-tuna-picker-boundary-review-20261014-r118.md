# WP04 Section P R118 — *Thunnus obesus* / bigeye tuna picker-boundary review

- Review date: 2026-10-14.
- Status: Hold recorded by root on 2026-10-14; see the [batch README](../batches/wp04-section-p-bigeye-tuna-picker-hold-integration-20261014/README.md). The candidate remains outside active references and the ledger.

- **Bounded candidate:** *Thunnus obesus* (bigeye tuna / thon obèse).
- **Exact parent checklist item:** [Global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), Section P: “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.”
- **Recommendation:** Hold the species out of the active picker for now. The full names “bigeye tuna” and “thon obèse” are well supported and do not have current exact owners, but the active picker would also return the new row as the sole result for bare “bigeye”. Current CFIA common-name material uses “Bigeye” for other fish taxa as well. There is no catalog-wide representation of those names yet to make that broad query visibly ambiguous.
- **Review boundary:** This is a species identity and picker boundary review. It does not decide forms, recipes, nutrition, safety, or market equivalence among tuna products. Section P stays open.

## Why this is a new case

The prior [tuna-steak boundary review](wp04-tuna-steak-recipe-boundary-review-20261011.md) tested “bigeye tuna” as one of several possible interpretations of a generic recipe line; it did not recommend an identity, alias set, or picker behavior for *T. obesus*. The [R116 skipjack hold](wp04-next-section-p-finfish-gap-review-20261014-r1.md) and its [R117 paired integration](../batches/wp04-section-p-skipjack-pair-identity-integration-20261014/README.md) resolved the *Katsuwonus pelamis* / *Euthynnus lineatus* shared-name pair, not the separate *Thunnus obesus* identity. The current catalog has no exact *T. obesus* owner.

## Canadian and Québec name evidence

The live CFIA Fish List query for tuna identifies TSN 172428 as *Thunnus obesus*. After collapsing the repeated hazard rows, the query shows “Bigeye Tuna / Thon” and “Tuna / Thon Obèse”. The repeats reflect hazard categories, not different taxa or separate product forms. CFIA's common-name guidance describes the list as English and French common names recognized by legislation and/or by which fish are generally known; it is the current Canadian common-name reference used here, not an app identity schema.

The Government of Québec's current food-service guidance pairs *Thunnus obesus* with “Thon obèse / Bigeye tuna” in a narrow list of tuna exempt from the parasite-freezing requirement for certain raw or partly cooked food-service preparations. The page begins by warning that raw and partly cooked fish may carry parasites, bacteria, viruses, or toxins. The listed exemption concerns that parasite-freezing rule and requires the exact species to be documented; it does not establish general raw-consumption safety or remove other handling requirements.

The OQLF GDT entry for *thon ventru* links the English “bigeye tuna” and Latin *Thunnus obesus*, and gives “thon ventru”, “thon obèse”, and “patudo” as French preferred terms. The entry was last updated in 1983. Treat it as terminology history, not proof that all three terms are current Québec retail labels. A current Québec seafood supplier, Frandon, lists “THON OBÈSE” under its fresh fish offering. That supports local market wording but gives no scientific name, SKU, cut, package size, weight, or measure.

For a future identity-only row, the most defensible primary display pair is **Bigeye tuna / thon obèse**. Keep aliases empty initially. Do not promote CFIA's broader “Thon” row, the old GDT alternatives, or Spanish “patudo” to aliases without a separate picker and Québec market review.

### Source and law status

The current CFIA Fish List page reports a last-modified date of 2023-09-18. Its query rows and CFIA guidance support Canadian common-name lookup. They do not mean every name is independently prescribed by a species-specific statute.

The 2017 Canada Gazette Part I proposal contains a sealed-tuna name table with “Bigeye Tuna” and French “patudo / thon ventru” for *T. obesus*. That table is proposal-era material, not the current SFCR species-name table. Current SFCR §262(1)(b), in the consolidated text current to 2026-09-21, addresses the flesh-colour expression on hermetically sealed tuna labels. Do not cite §262 as a taxon/name crosswalk or use the 2017 proposal as current species-name law. The current CFIA list and its guidance are the appropriate Canadian common-name evidence for this catalog decision.

## Ownership snapshot and active picker effect

Counts below are the read-only proposal-time snapshot, after R117:

| Path | Current count | Exact *T. obesus* ownership |
|---|---:|---|
| [ingredient-references.v1.json](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,462 references | No exact owner for *Thunnus obesus*, “bigeye tuna”, “bigeye”, “thon obèse”, “thon ventru”, “patudo”, or proposed IDs ingredient-ref-thunnus-obesus / ingredient-ref-bigeye-tuna. |
| [ingredient-forms.v1.json](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 105 forms | No tuna/thon form and no exact candidate form owner. |
| [legacy-import-identities.v1.json](../legacy-import-identities.v1.json) | 63 candidates | No exact candidate name, alias, or binomial owner. |
| [research-ledger.v1.json](../research-ledger.v1.json) | 1,803 records | No exact identity record for this species or name set. A substring in an unrelated source URL is not an identity owner. |
| [manifest.v1.json](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) and listed recipe files | 114 recipe paths; 1,123 ingredient rows | One generic tuna recipe row; no species-specific *T. obesus* row. |

The manifest-listed recipe corpus fingerprint, using ordered path/NUL/exact-bytes/NUL, is **0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143**.

The eight active tuna-family references are:

| Reference ID | English / French display |
|---|---|
| ingredient-ref-tuna | tuna / thon |
| ingredient-ref-albacore-tuna | albacore tuna / germon |
| ingredient-ref-yellowfin-tuna | yellowfin tuna / thon à nageoires jaunes |
| ingredient-ref-atlantic-bluefin-tuna | Atlantic bluefin tuna / thon rouge de l’Atlantique |
| ingredient-ref-pacific-bluefin-tuna | Pacific bluefin tuna / thon rouge du Pacifique |
| ingredient-ref-southern-bluefin-tuna | Southern bluefin tuna / thon rouge du Sud |
| ingredient-ref-katsuwonus-pelamis | Skipjack tuna (Listao) / Thon listao (bonite à ventre rayé) |
| ingredient-ref-euthynnus-lineatus | Black skipjack tuna (Listao) / Thonine noire (thon) |

The current bilingual matcher in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches both display languages and aliases. It prefers complete word-phrase matches, then uses substring fallback. With a hypothetical alias-free row named “Bigeye tuna / thon obèse”, the projected picker results are:

| Query | Current result | Projected result |
|---|---:|---:|
| “bigeye tuna” | 0 | 1: *T. obesus* |
| “thon obèse” | 0 | 1: *T. obesus* |
| “bigeye” | 0 | 1: *T. obesus* |
| “tuna” | 8 | 9 |
| “thon” | 8 | 9 |
| “thon ventru”, “patudo”, *Thunnus obesus* | 0 | 0 |

The first two queries are species-qualified and map to the correct identity. The bare “bigeye” query is different: it is a complete word in the proposed display and therefore returns the sole row in the phrase-match pass. The English CFIA selector includes other names containing the unhyphenated token “Bigeye”, including “Bigeye”, “Bigeye Scad”, “Bigeye Sea Perch”, and “Bigeye Trevally”; CFIA result rows associate those names with taxa apart from *T. obesus*. Other nearby entries use the hyphenated spelling “Big-eye”; that spelling normalizes differently from “bigeye” in the app matcher. These are illustrative examples, not an exhaustive list. Since the active catalog does not represent that broader fish-name group, adding only *T. obesus* would make the bare query look uniquely owned.

No alias set can remove that one-row effect while “Bigeye tuna” remains the required display name. Keep the row held until the broader group is represented in the picker or the product explicitly accepts a singleton result for that broad query. Do not interpret a one-row search result as evidence that the source common name is taxonomically unique.

The CFIA examples include bare “Bigeye” for *Priacanthus* spp.; “Bigeye Scad” for *Selar crumenophthalmus*; “Bigeye Sea Perch” for *Helicolenus barathri*; “Bigeye Trevally” for *Caranx sexfasciatus*; and “Purple-spotted Bigeye” for *Priacanthus tayenus*. Other entries include the hyphenated “Big-eye Pollock” (*Gadus chalcogrammus*) and “Big-eye” (*Pollachius virens*). This is an illustrative collision audit, not an exhaustive inventory. The hyphenated spellings normalize to “big eye” in the app and therefore are not asserted to match the one-token query “bigeye”.

## Recipe demand and product-state boundary

The corpus contains no *T. obesus*, bigeye, thon obèse, thon ventru, or patudo recipe line. The only tuna ingredient is recipe 111, row 1, in [recipe 111](../../../app/src/main/assets/seed/bundled-library/recipes/111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.v1.json): “1 tuna steak”, linked to generic ingredient-ref-tuna, quantity 1 count. Keep it generic and unchanged. The supplier listing and the generic recipe do not justify attaching this recipe to *T. obesus*.

No source reviewed here defines a reusable *T. obesus* preparation state. Frandon's fresh-fish list does not specify a cut or package; the Québec safety page is regulatory food-service guidance, not a retail product specification. Do not create fresh, frozen, canned, drained, raw, cooked, or prepared forms from these pages. Do not infer equivalence from other tuna species or from a general “tuna” recipe.

## Measures, density, conversions, yield, and substitutions

No recipe or reviewed Canadian/Québec product source supplies a transferable amount for this species. The Health Canada 2015 CNF interface says that dataset is no longer being updated while a more user-friendly route to the 2026 dataset is being prepared. Generic canned-tuna entries and records for bluefin, yellowfin, or *K. pelamis* describe other foods and states; none is a default *T. obesus* serving, household measure, density, or yield. No species-specific volume-to-mass mapping or cooking yield was established.

If an identity is accepted later, leave default density null and unit mappings empty. Add no count-to-mass conversion, serving size, drained yield, or conversion rule. Add no global or contextual substitution between bigeye, generic tuna, yellowfin, albacore, bluefin, skipjack, or other fish. Add no recipe-line substitution link. CFIA hazard categories and Québec's narrow parasite-freezing exemption do not support any cooking, storage, curing, or raw-consumption equivalence.

## Recommendation and root integration steps

1. Keep *T. obesus* held outside the live ingredient-reference catalog and keep Section P open. Preserve the R117 skipjack pair as integrated.
2. When reviewing picker completeness, decide whether Section P will represent the other CFIA fish names that use bare “Bigeye” before adding this row. If the active picker is intended to return a single result for broad common words, document that product decision; this review does not silently assume it.
3. If root later approves the identity after the boundary is resolved, add only a PROTEIN reference with ID ingredient-ref-thunnus-obesus, English display “Bigeye tuna”, French display “thon obèse”, empty aliases, null default density, and empty unit mappings. First recheck the current shared files and source pages because this proposal is a dated snapshot.
4. Add source records to the research ledger only as part of an approved integration, retaining each source's scope limits below. Do not change recipe 111, create forms, or add numeric behavior or substitutions.

**Remaining reviewer question:** Should the active picker represent the broader unhyphenated “Bigeye” fish-name group before exposing *T. obesus*, or is a sole result for bare “bigeye” acceptable while “bigeye tuna” remains the precise display? This proposal recommends waiting for the first condition.

## Source register

Sources were checked on 2026-10-14. The CFIA Fish List's displayed data modification date is 2023-09-18; supplier availability can change.

| ID | Source and URL | Use and limit |
|---|---|---|
| **S01** | CFIA, [live Fish List query for tuna](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna) and [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | TSN 172428, *T. obesus*, and the English/French common-name rows. The result repeats rows for hazard categories; this review collapses those duplicates. Common-name evidence, not product-state or recipe evidence. |
| **S02** | CFIA, [English common-name selector](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpsel.asp?cbShowAll=on&cmbIn=e) and [live Fish List query for bigeye](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=bigeye) | Selector/query examples of other fish names using the unhyphenated “Bigeye” term. Examples are not exhaustive and do not mean those other species are represented in the app catalog. |
| **S03** | CFIA, [guidance on determining common names](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Canadian common-name framework and the status of the Fish List as names recognized by legislation and/or generally known. Not a direct app taxonomy rule. |
| **S04** | Inter-American Tropical Tuna Commission, [*Thunnus obesus* species page](https://www.iattc.org/en-US/Resources/Species/Detail/BET) | Fisheries identity, FAO species code BET, common name “Bigeye tuna”, and crew name “bigeye”; not Canadian retail naming or a household-measure source. |
| **S05** | Government of Québec, [Risques associés à la consommation de poisson et exigences](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson) | Current food-service guidance names *T. obesus* with “Thon obèse / Bigeye tuna” for a limited parasite-freezing exemption. It does not mean that all raw servings are safe or remove other controls. |
| **S06** | Office québécois de la langue française, [GDT: thon ventru](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488162/thon-ventru) | Connects the English name and Latin species to “thon ventru”, “thon obèse”, and “patudo”. Last updated 1983; not evidence that all variants are current local retail terms. |
| **S07** | Frandon Seafoods, [Produits](https://frandon.ca/produits/) | Current Québec supplier lists “THON OBÈSE” in its fresh-fish offering. No scientific name, SKU, cut, package size, or measure is given. |
| **S08** | Canada Gazette, [Part I proposed regulations, 2017-01-21](https://gazette.gc.ca/rp-pr/p1/2017/2017-01-21/pdf/g1-15103.pdf), and [current SFCR §262](https://laws-lois.justice.gc.ca/eng/regulations/SOR-2018-108/section-262.html?wbdisable=true) | The proposal included a narrower sealed-tuna table; §262 currently addresses tuna flesh-colour expressions in hermetically sealed packages. Do not treat the proposal table as current SFCR species-name law. |
| **S09** | Health Canada, [Canadian Nutrient File search by food](https://food-nutrition.canada.ca/cnf-fce/newSearch) | The page says its 2015 dataset is no longer updated and notes work toward a more user-friendly 2026 dataset. This review did not establish a *T. obesus*-specific serving or amount; generic or other-species CNF values are not transferred. |

## Static review record

Read the current AGENTS.md, Section P plan text, live catalog/form files, legacy identities, research ledger, manifest-listed recipe files, relevant prior proposals, and current matcher source. Recounted the live data and audited the recipe corpus. The hold was recorded in the plan and batch README; no database JSON changed. No app or emulator tests were run for this documentation-only hold.

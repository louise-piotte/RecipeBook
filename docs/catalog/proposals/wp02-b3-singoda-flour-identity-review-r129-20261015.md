# WP02 Section 04 B3 R129 — Singoda flour identity review

- **Reviewed:** 2026-10-15.
- **Status:** Integrated as an identity-only reference with a provisional fr-CA display; see the [R129 batch README](../batches/wp02-b3-singoda-flour-identity-integration-r129-20261015/README.md).
- **Checklist reference:** [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt), WP02 Section 04 B3, `[ ] Water-chestnut flour and other documented regional starches.` The checked child reviews already establish that whole-corm flour and extracted starch from *Eleocharis dulcis* are separate products and that the unqualified Canadian phrase `water chestnut flour` remains unresolved. This proposal advances only the separately named Singoda/*Trapa* flour branch; it does not reopen those boundaries or mark the parent checklist item complete.
- **Roadmap check at proposal handoff:** `roadmap.md` contained no Singoda-specific task; root added the R129 integration entry.
- **Proposal-local source-ID prefix:** `WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S`. Checked against all source IDs in the live research ledger and the proposal/batch archive before drafting; no collision found.
- **Scope at proposal handoff:** one source-qualified regional flour identity, its French display, picker ownership, and bounded measurement/substitution evidence. The root integration added one reference and ledger record, refreshed the generated ingredient catalog, and updated the plan, roadmap, and batch README. No forms, recipes, numeric behavior, or application logic changed.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **Singoda flour / farine de singoda**, scoped to the regional flour made from dried *Trapa* fruit/nuts. Keep the generic `water chestnut flour` candidate unresolved. Canadian product listings use “Singoda Flour”; Kew and Anand Agricultural University associate the regional name `singoda`/`shingoda` with *Trapa*; India’s National Agriculture Market (eNAM) defines its flour commodity as ground dried *Trapa* nuts; and a separate product listing describes Singoda flour as dried-ground *Trapa bispinosa*. Together these sources support the product-qualified Singoda identity without making every product labelled `water chestnut flour` a *Trapa* flour.

Use **`farine de singoda`** as a provisional fr-CA display. This is a concise, product-qualified rendering of the Ottawa retailer’s French title, `Farine Tit-Bit Singoda (farine de châtaigne d'eau)`. It is a reviewer-composed display, not an OQLF-preferred term. Keeping `singoda` in the display avoids activating the ambiguous unqualified phrase `farine de châtaigne d'eau`; the retailer’s exact parenthetical wording remains evidence only. Root accepted it provisionally after reviewing the Canadian French listing and finding no conflicting Québec food-product term.

Add the exact English search alias **`Singhare ka atta`**, the eNAM common product name for its *Trapa* dried-nut flour. Scope that alias to this source-qualified row only. Add no other aliases. In particular, do not add `water chestnut flour`, `Chinese water chestnut flour`, `farine de châtaigne d'eau`, `châtaigne d'eau`, `water caltrop flour`, `singhara flour`, or `singoda` as aliases. The canonical name already contains `Singoda`, so a `Singoda` query can find the row without a bare alias.

Do not add forms, density, unit mappings, conversion/yield rules, recipe links, or active substitutions. Flour is the identity here, not a preparation form of the vegetable or an extracted starch. Keep `defaultDensity` null and `unitMappings` empty. The listed 200 g and 400 g variants are package sizes, not recipe measures. The recipe corpus has no matching ingredient demand, and the available baking studies do not establish a reusable replacement ratio.

## Product and name boundary

| Candidate wording or material | Decision | Evidence boundary |
|---|---|---|
| `Singoda flour` | **Add as the English display name** for a regional *Trapa* flour identity. | Spice Divine’s Canadian title uses `Tit-Bit Singoda Flour`; Kew’s MPNS records `singoda` among names for *Trapa natans* var. *bispinosa*; AAU records Gujarati `shingoda` for *Trapa bispinosa*; eNAM defines a dried-*Trapa*-nut flour product. These sources jointly support the bounded product class. |
| `farine de singoda` | **Add as a provisional French display**, with the regional qualifier retained. | The Ottawa listing’s exact French title begins `Farine Tit-Bit Singoda` and includes the parenthetical `farine de châtaigne d'eau`. The proposed unbranded form preserves the Canadian French product wording while omitting the ambiguous common-name phrase. No Québec authority endorses this exact product term. |
| `Singhare ka atta` | **Add as one English-field alias** on this *Trapa* flour row. | eNAM calls its product “Singhare ka atta” and defines it from dried *Trapa bispinosa* or *T. quadrispinosa* nuts. It is a source-specific name for this row, not a universal alias for water-chestnut-labelled products. |
| `water chestnut flour` | **Hold as a generic identity and alias.** | Earlier work documents whole-corm *E. dulcis* flour, extracted *E. dulcis* corm starch, and dried-fruit *Trapa* flour under overlapping water-chestnut wording. This review adds only the Singoda/*Trapa* branch. |
| `farine de châtaigne d'eau`, `châtaigne d'eau`, `water chestnut`, or `water caltrop` | **Do not add to the new row as aliases.** | The Canadian retailer uses an unqualified French parenthetical, but it does not name the species or process. Current Québec flora terminology identifies *Trapa natans* as `châtaigne d’eau`; an older OQLF record uses the same French/English pairing for an edible Chinese-sedge tuber, and a separate OQLF water-caltrop entry associates English `water chestnut` with a different plant. These are not safe cross-product aliases. |
| Whole-corm *Eleocharis dulcis* flour or extracted *E. dulcis* starch | **Keep separate and unresolved.** | The prior primary-study review differentiates flour made by drying/milling corm slices from starch obtained by aqueous extraction. Nothing in this proposal assigns the generic phrase to either product. See the earlier water-chestnut boundary proposals linked below. |
| Extracted *Trapa* starch | **Keep separate.** | The eNAM commodity definition and the Canadian retail product identify flour; neither supports merging whole-ground flour with extracted starch. No starch row or form is proposed here. |

The cross-source match from the Canadian product title to the *Trapa* flour class is strong but not a manufacturer-confirmed ingredient declaration: Spice Divine says the flour is made from “water chestnuts” but does not name the botanical species, plant part, or milling process. Kew’s botanical name record and eNAM’s official commodity definition are what make a bounded Singoda/*Trapa* row preferable to a generic water-chestnut row. Do not assume every package carrying the generic phrase has this scope.

### Proposed reference delta

```json
{
  "id": "ingredient-ref-singoda-flour",
  "nameEn": "Singoda flour",
  "nameFr": "farine de singoda",
  "aliasesFr": [],
  "aliasesEn": ["Singhare ka atta"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

### Proposed research-ledger delta

The integration adds one `ingredient_reference` record for `ingredient-ref-singoda-flour` with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. It attaches source IDs S01–S12 below and records the accepted identity decision scoped to *Trapa* dried-fruit flour, with explicit exclusions for generic `water chestnut flour` and the *E. dulcis* corm products. No measurement observations, unit conversions, package yields, form records, or substitution rules were added. The existing `candidate-water-chestnut-flour` ledger record remains `needs_clarification` for the unresolved generic phrase.

## Live catalog, legacy, picker, and recipe audit

The live snapshot read on 2026-10-15 contains **1,477 ingredient references, 109 forms, 61 legacy-import candidates, 1,822 research-ledger records, 114 bundled recipe files, and 1,123 ingredient rows**. Relevant files were `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`, `ingredient-forms.v1.json`, `recipes/*.json`, `docs/catalog/legacy-import-identities.v1.json`, and `docs/catalog/research-ledger.v1.json`.

| Current owner or candidate | Current record | Result for this proposal |
|---|---|---|
| `ingredient-ref-water-chestnut` | `water chestnut / châtaigne d'eau`; category `VEGETABLE_AND_AROMATIC`; no aliases; null density; empty mappings. | Keep the edible vegetable separate. No form is attached. |
| `ingredient-ref-chestnut-flour` | `chestnut flour / farine de châtaigne`; category `FLOUR_AND_STARCH`; empty alias arrays. | Keep tree-chestnut flour separate. |
| `candidate-water-chestnut-flour` | Ledger candidate with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, `substitutionResearchState: researched_no_supported_substitute`. | Preserve the open generic-label candidate; do not convert it into the new product row. |
| `ingredient-ref-singoda-flour` | No active reference, form, legacy-candidate ID, or ledger-record ID. | The ID was available. `Singoda flour`, `farine de singoda`, and `Singhare ka atta` had no exact active reference or form owner and no legacy candidate owner before integration. |

### Picker effects

The audit followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which folds case, accents, and punctuation, prefers complete normalized word phrases, then falls back to substring matches. The picker displays the localized reference name; category is not shown in its result row. A read-only reproduction of that algorithm checked the following phrases before and after the proposed row:

| Query | Current result | Result with proposed names/alias | Decision |
|---|---|---|---|
| `Singoda flour`, `Singoda`, `farine de singoda` | No result | `ingredient-ref-singoda-flour` | Product-specific search terms. |
| `Singhare ka atta` | No active reference/form result | `ingredient-ref-singoda-flour` | Exact source-specific alias from eNAM, scoped to this row. |
| `water chestnut` | `ingredient-ref-water-chestnut` | Same vegetable only | No generic alias added. |
| `châtaigne d'eau` | `ingredient-ref-water-chestnut` | Same vegetable only | The new French display omits the ambiguous base phrase. |
| `water chestnut flour` | No result | No result | Deliberately remains unallocated across the documented product/process classes. |
| `farine de châtaigne d'eau` | No result | No result | The retail parenthetical is kept as evidence, not activated as a search name. |
| `chestnut flour`, `farine de châtaigne` | `ingredient-ref-chestnut-flour` | Same tree-chestnut flour only | No overlap with the proposed display or alias. |

The complete string scan of all 114 recipe files found **no matches** for `water chestnut`, `water chestnut flour`, `singoda`, `singhara`, `singhare ka atta`, `shingoda`, `châtaigne d’eau`, `farine de singoda`, `farine de châtaigne d’eau`, `Trapa`, or `Eleocharis dulcis`. No recipe line or demand link was added.

## Measurement and substitution audit

- **Density and unit mappings:** No reusable `g/ml` value or household-volume mapping is supported by the sources. The 200 g/400 g options on the Canadian listing are package sizes. eNAM's moisture and quality limits are commodity grading data, not density or a kitchen measure. Leave density null and mappings empty.
- **Forms and conversion:** This row is a flour identity. Do not create a `dried`, `ground`, or `cooked` form, and do not create a flour-to-starch conversion, *Trapa*-to-*Eleocharis* conversion, process yield, or preparation rule.
- **Substitution:** Spice Divine and other product pages list culinary uses such as rotis, puris, thickening, and baking; they do not supply transferable amounts or replacement ratios. Two prior primary cookie studies test *Trapa natans* flour in wheat-based cookie formulations, but their results are limited to those product lots and recipes. They do not establish a general flour replacement percentage, a substitution for extracted starch, or a replacement for corn or arrowroot starch. Keep active substitution rules absent.

## Prior decisions and non-duplication

This review does not repeat or reverse the prior generic hold. The following records already cover the unqualified phrase and the *E. dulcis* boundary:

- [`wp02-water-chestnut-flour-starch-boundary-20261009.md`](wp02-water-chestnut-flour-starch-boundary-20261009.md) rejects one global identity/alias and defers a *Trapa* product row while naming remains unresolved.
- [`wp02-water-chestnut-independent-review-20261009.md`](wp02-water-chestnut-independent-review-20261009.md) distinguishes *E. dulcis* corm flour, extracted *E. dulcis* starch, and *Trapa* dried-fruit flour; it rejects cross-product aliases.
- [`wp02-water-chestnut-kudzu-flour-review-20261010.md`](wp02-water-chestnut-kudzu-flour-review-20261010.md) reconfirms the generic Canadian label hold and reports no recipe demand.
- [`wp02-b2-b3-regional-starches-residual-gap-review-20261010.md`](wp02-b2-b3-regional-starches-residual-gap-review-20261010.md) also leaves the water-chestnut products source-distinct.
- [`../batches/baking-flours-starches.md`](../batches/baking-flours-starches.md), coordinator follow-up, keeps the unqualified Canadian wording unresolved.

The meaningful new evidence is the exact-name bridge: Kew MPNS and AAU associate `singoda`/`shingoda` with *Trapa*, while the product listing and eNAM describe flour. This supports a distinct regional-name row, not a broad alias and not a resolution of the older *E. dulcis* products.

## Source register

All sources were checked on **2026-10-15**. Source IDs use the R129-local prefix above; they were checked against the live ledger and proposal/batch archive. Any source access limitation is recorded in the final column.

| ID | Source and exact locator | Evidence and limits |
|---|---|---|
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S01** | Spice Divine, Canada, [“Farine Tit-Bit Singoda (farine de châtaigne d'eau)”](https://spicedivine.ca/fr/products/tit-bit-singoda-flour-400gm), product title and description; accessed 2026-10-15. | The French listing title is paired with English `Tit-Bit Singoda Flour (Water Chestnut Flour)`. Its French description says it is made from water chestnuts and names rotis, parathas, puris, breads, cakes, cookies, and desserts. It is an Ottawa retailer listing, not a Québec authority or a package ingredient statement; the listing showed out of stock at access. The web search index exposed the page text; direct page open returned a cache miss. Package options (200 g/400 g) are not recipe measures. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S02** | Spice Divine, [In Store Purchase & Pickup](https://spicedivine.ca/pages/in-store-purchase-pickup), “Pickup Location”; accessed 2026-10-15. | Identifies 1541 Merivale Road, Ottawa, Ontario, and pickup. Establishes the retailer is Canadian, but not Québec-based or normative for fr-CA terminology. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S03** | Anand Agricultural University, Krishi Vigyan Kendra Devataj, [“Integration of Water Chestnut with Fish Culture”](https://www.aau.in/college-menu/671/672), 2014–15 case-study section; accessed 2026-10-15. | Identifies *Trapa bispinosa*, gives regional names including Gujarati `shingoda`, and says Singhara flour is used in Indian festivals. Agricultural-university extension content; it is not a flour standard or verification of the Tit-Bit package. The page shell did not expose this older story in direct-open text; the university page's indexed text supplied the section. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S04** | Kew, Medicinal Plant Names Services, [*Trapa natans* var. *bispinosa*](https://mpns.science.kew.org/mpns-portal/plantDetail?dbs=wcsCmp&plantId=2870370), common-name list, entries `singoda` and `shingoda` sourced to the *Ayurvedic Pharmacopoeia of India*; accessed 2026-10-15. | Directly maps both spellings to the *Trapa* taxon. Kew's plant-name resource supports the botanical bridge; it does not by itself establish flour processing or Québec French. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S05** | India National Agriculture Market, [commodity specification list](https://enam.gov.in/web/assest/download/sul/238_commodity_list.pdf), item 228, `WATER CHESTNUT FLOUR`; accessed 2026-10-15. | Calls the product `Singhare ka atta` and defines it as obtained by grinding clean, sound, dried nuts of *Trapa bispinosa* or *T. quadrispinosa*. Official Indian commodity scope; not a global definition for every `water chestnut flour` label and not a Québec French name. The PDF extractor exposed only the document shell in this session; its indexed text exposed the full item definition, also documented in the prior water-chestnut proposals. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S06** | Kalustyan’s, [“Singoda Flour (Indian Dried Water Chestnut Flour)”](https://foodsofnations.com/products/singoda-flour), product description; accessed 2026-10-15. | Says Singoda flour is made from Indian dried-ground water chestnut (*Trapa bispinosa*) and describes thickening and batter uses. Product-level corroboration for the regional product class; it is a U.S. retailer's description, not an independent assay or Canadian label. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S07** | Gouvernement du Québec, [« Châtaigne d’eau »](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/flore/fiches-especes-floristiques/chataigne-eau), fields “Nom français,” “Nom anglais,” and “Nom scientifique”; accessed 2026-10-15. | Pairs *Trapa natans* with `châtaigne d’eau` and `water chestnut`. It is current Québec flora/invasive-species nomenclature, not a food-product name. Its plant-sale notice is not interpreted here as a legal determination about imported processed flour. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S08** | OQLF, [« châtaigne d'eau » — Chinese-sedge entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434646/chataigne-deau), definition and English terms; accessed 2026-10-15; entry last updated 1982. | Uses `châtaigne d'eau` for the edible tuber of the Chinese sedge and pairs it with English `water chestnut`. Old plant/vegetable terminology, not processed-flour naming; this legacy scope conflicts with using the bare name as a safe product alias. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S09** | OQLF, [« châtaigne d'eau » — water-caltrop entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19475118/chataigne-deau), English translation and associated terms; accessed 2026-10-15. | Separate plant-name record translates `châtaigne d'eau` as `water caltrop` and lists `water chestnut` as associated wording. Not a food product source; it reinforces the need to retain the `Singoda` qualifier. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S10** | Shafi et al., [“Wheat–water chestnut flour blends: effect of baking on antioxidant properties of cookies”](https://pmc.ncbi.nlm.nih.gov/articles/PMC5223262/), *Journal of Food Science and Technology* 53(12) (2016), methods and cookie results; source also summarized in the earlier water-chestnut boundary proposal. | Tests a specific dried *Trapa natans* flour lot in wheat-cookie formulations. It supports only recipe-specific use; no general replacement ratio or equivalence with starch is proposed. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S11** | Ud Din et al., [“Physicochemical, nutritional and organoleptic characteristics of cookies based on water chestnut (*Trapa natans*) and wheat”](https://www.sciencedirect.com/science/article/pii/S2772753X2400087X), *Food Chemistry Advances* 4 (2024), 100691, abstract and cookie-formulation results; source also summarized in the earlier boundary proposal. | Reports study-specific cookie formulations using *Trapa natans* flour. It does not establish an across-recipe substitution, density, household mapping, or conversion to extracted starch. |
| **WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S12** | Namaste Indian Supermarket, Mississauga, [“ZAIKA Singoda Flour 200g”](https://namastemississauga.ca/products/zaika-singoda-flour-200g/019cd868-0e33-7ff5-a18c-099d69280ff2), product title, description, and business address; accessed 2026-10-15. | A current Ontario listing names Singoda flour and describes it as a water-chestnut flour used in Indian dishes. The page identifies a Mississauga store; it does not state the botanical species, processing details, Québec French name, or recipe measure. |

## Integration decision

Root accepted the identity-only row with provisional fr-CA display `farine de singoda`. The Ottawa product page supplies French wording, and additional Ontario product listings confirm the regional English product name. No OQLF-preferred Québec product term was found; the French display remains explicitly provisional. The generic `water chestnut flour` candidate remains unresolved. Static package, reference-normalization, ledger, generated-index, picker, ownership, corpus, encoding, link, and whitespace checks passed. No tests were run because this change only adds database JSON data and refreshes the generated ingredient catalog.

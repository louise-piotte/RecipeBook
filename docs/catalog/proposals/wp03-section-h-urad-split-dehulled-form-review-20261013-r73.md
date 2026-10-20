# WP03 Section H — split and dehulled urad form review (R73)

- **Reviewed:** 2026-10-13
- **Status:** Integrated R73
- **Selected gap:** split, dehulled black gram (*Vigna mungo*) under the existing urad-bean reference
- **Checklist fit:** Section H leaves whole/split and hulled/unhulled distinctions open where meaningful, and leaves justified dry/cooked/processed forms open in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3502).
- **Scope:** one dried product form. No new pulse identity, recipe link, density, unit mapping, cooking yield, conversion, or substitution was added.
- **Proposal-local source IDs:** WP03-H-URAD-FORM-R73-20261013-S01 through S09; collision checked before drafting.

## Integrated disposition

Added one form under the existing `ingredient-ref-urad-beans` reference:

| Field | Integrated value |
|---|---|
| Form ID | `ingredient-form-urad-beans-split-dehulled` |
| Parent | `ingredient-ref-urad-beans` — `urad beans / haricots urd` |
| `formCode` | `split_dehulled` |
| `prepState` | `split_dehulled` |
| English label | `split, dehulled urad beans` |
| French label | `haricots urd fendus et décortiqués` — descriptive Québec French wording, not an asserted OQLF headword or exact package title |
| English match terms | `split huskless black matpe beans`; `split and dehusked black gram` |
| French match terms | `haricots matpe noirs écossés fendus` — from one Walmart French page for the same SKU whose English page specifies split, huskless black matpe beans |
| Density and unit mappings | `densityGPerMl: null`; no unit mappings |
| Recipe links | None |

The Canadian listings identify this as a sold pulse product; an Indian government study and commodity specification distinguish whole, split-with-husk, and split-without-hull states. That evidence supports a form under the current Vigna mungo identity. It does not make every product named `urad dal` split or dehulled. Keep bare `urad dal` and `black gram dal` off the form and leave the older whole-product usage intact. Walmart's Sitara page includes generic overview copy referring to mung beans alongside the selected SKU's specific `split huskless black matpe beans` wording. Treat the overview as non-specific page text; use the exact SKU title and ingredient wording only for the product form, and do not rely on that listing alone to establish the botanical identity. [S07]

The bundle has no urad ingredient line, so no recipe link was added. Package weights and processing moisture observations remain source-qualified. The ICAR-CIPHET report gives a bulk-density observation for its Rajasthan black-gram dal sample: **842 kg/m³ at 10% initial moisture** (Table 7, p. 59). That is a useful numeric observation for the report's sample, but it is not a value for this exact retail form: the report defines black-gram `dhuli dal` as a mixture of dehulled whole beans and dehulled splits (p. 28), and does not isolate the split-only portion in the density table. Its cylinder-fill, tapping, and weighing method (p. 17) is a laboratory bulk-density procedure, not a household measure. Therefore keep the observation source-qualified and add no density or unit mapping. No reviewed source establishes a matching household volume weight, cooking yield, or conversion between whole and split products. The integrated form research record marks measurement as `researched_no_supported_value` for this exact split-only form and substitution as `researched_no_supported_substitute`; the parent identity record remains unchanged. [S03]

## Novelty and ownership audit

The current seed package was scanned before drafting. It contains 1,395 ingredient references, 102 forms, 63 legacy candidates, and 1,730 research-ledger records.

| Area | Exact current ownership | R73 finding |
|---|---|---|
| Active reference | `ingredient-ref-urad-beans`, category `LEGUME_AND_PULSE`; EN `urad beans`, aliases `urad bean`, `urd`, `urd bean`, `black gram`; FR `haricots urd`, alias `haricot urd`; `defaultDensity` is null and `unitMappings` is empty. | Keep this species identity and its existing aliases. It is already distinct from *Vigna radiata* mung beans. |
| Active forms | The pre-integration audit found no form attached to `ingredient-ref-urad-beans` and no owner for this form ID or its exact state phrases. | R73 added the form under the existing parent, following the Desi-chickpea `split_dehulled` model. |
| Legacy candidates | The 63-row legacy file has no candidate name or alias containing urad, urd, black gram, matpe, or the proposed state-qualified phrases. | No legacy promotion or cleanup is needed. |
| Research ledger | The pre-integration ledger had one `ingredient_reference` record for `ingredient-ref-urad-beans`; its identity was verified, while measurement and substitution remained `not_yet_researched`. | R73 added a form record with exact-form measurement and substitution marked as researched with no supported value; the parent record is unchanged. |
| Name boundary | `black gram` is already an alias on the urad reference. `haricot mungo` remains associated with the active mung-bean reference because OQLF documents the French name for both *Vigna mungo* and *Vigna radiata*. | Do not add `urad dal`, `black gram dal`, `haricot mungo`, or unqualified `lentilles noires`. Use complete split/huskless phrases only. |

This is a new focused **form** review, not a reopening of the urad identity decision. The [regional-pulse review](wp03-h-regional-pulses-urd-cowpea-lupini-review-20261011.md) excluded bare `urad dal` and deferred the whole/split boundary until a dedicated review. No later Section H proposal or integration packet resolves this exact split/dehulled urad form. New Canadian product pages now state the form directly, and the government processing reference separates it from whole seed and split-with-husk products.

## Picker projection

Ingredient forms are indexed under their owning reference. Form labels and match terms add search phrases to that row, while an exact complete form phrase can produce a form hint; a base query still returns the same parent without asserting a preparation state. See [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L60).

With the integrated terms:

- `split huskless black matpe beans`, `split and dehusked black gram`, and the French Walmart SKU phrase would resolve to `ingredient-ref-urad-beans` with the split/dehulled form hint.
- The French display phrase `haricots urd fendus et décortiqués` also identifies the form.
- Base queries such as `urad beans`, `black gram`, and `haricots urd` would continue to resolve to the parent without a form hint.
- Bare `urad dal` and `black gram dal` would not be added as match terms. A prior Canadian listing calls a whole product `Heer Urad Dal (Entier)`, and the government commodity specification allows the broader `Urd Dal` class to be split with or without its husk.

The French Walmart wording is retained as a product-specific search phrase only; it is not used as the displayed French term or an OQLF ruling. No broad `dal`, `mung`, or `black lentil` search alias is introduced.

## Bundled recipe demand

A manifest scan covered all **114 recipe files and 1,123 ingredient rows**. It found zero rows linked to `ingredient-ref-urad-beans` and zero ingredient-row text matches for urad, urd, black gram, or matpe. The only current pulse-linked rows are the already-reviewed azuki, pinto, kidney-bean, and yellow-pea rows; none requests urad.

The retailer pages mention uses such as dals, idli, dosa, and vada, but those are product-use examples, not a bundled recipe line or a source-backed substitution ratio. Do not attach a recipe link or transfer a quantity from those examples.

## Québec and Canadian naming

**Naming confidence:** high for the existing French base term `haricots urd` as Canadian packaged-grain terminology, because CFIA lists packaged *Vigna mungo* grain as `haricot urd`. OQLF’s older `haricot mungo` entry documents English `urd`, `urd bean`, and `black gram` for *Vigna mungo*, but warns that French `haricot mungo` is used for both *V. mungo* and *V. radiata*. Keep the current `haricots urd` display and do not put `haricot mungo` on this row. [S01, S02]

Confidence is **medium** for the descriptive split/dehulled French form label. A Walmart Canada French page for Sitara’s 1.81 kg SKU says `Haricots Matpe Noirs Fendus Urad Fendu`; its ingredient text says `Haricots matpe noirs écossés fendus`. The English page for the same SKU says `Split huskless black matpe beans`. This is Canadian French retailer wording and product-scoped evidence, not a Québec terminology ruling; the item page reported out of stock when indexed. The full proposed French label combines CFIA’s `haricot urd` base with descriptive processing terms. [S07]

Current Canadian English product descriptions use `huskless split urad dal`, `split and dehusked black gram`, and `split huskless black matpe beans`. These support the physical product boundary. They do not establish that unqualified `urad dal` identifies only this form. [S05–S07]

## Numeric, conversion, and substitution evidence

Three Canadian listing snapshots show product-package quantities: Save-On Foods lists a 1-pound `Urad - Wash`; Swadesh lists a 4-pound `Reva Urad Dal Washed`; and the Walmart Sitara SKU is 1.81 kg. These are product-specific package weights, not household measures or a shared net quantity. Retail stock and descriptions can change. [S05–S07]

The Government of India eNAM specification defines `URD DAL SPLIT` as *Vigna mungo* split product “with or without husk”; its moisture maxima of 11%, 12%, and 14% vary by grade. These are grading limits, not a measurement of the cited retail SKUs and not recipe moisture or cooking data. [S04]

The Department of Consumer Affairs / ICAR-CIPHET report describes three black-gram products: whole grain (`sabut`), split grain with husk (`dal dara`), and split grain without hull (`dhuli dal`). Its milling workflow includes approximately 10% moisture at processing stages. It also reports bulk density of **842 kg/m³** for the Rajasthan black-gram dal sample at 10% initial moisture (Table 7, p. 59). Because the report defines `dhuli dal` as a mixture of dehulled whole grain and dehulled splits (p. 28), this is a sample-specific bulk-density observation for a broader mixed product. The study's cylinder method (p. 17) does not give a household cup measure, and the table does not isolate split-only kernels. Keep the value in the evidence record only; it cannot support this exact form's active density or unit mapping. The approximately 10% values are process/storage moisture conditions, not a kitchen moisture value or conversion. This proposal uses the retailer’s exact split-and-huskless description to scope the narrower form. [S03]

Health Canada’s CNF site says the 2026 file is published as relational downloads while its online serving-size tool remains the 2015 publication. No exact CNF serving-weight or measure-to-weight pair for split, dehulled *Vigna mungo* was established in the reviewed serving pages. Do not infer one from green mung beans (*Vigna radiata*), another pulse, or the 2026 dataset landing page. A later measurement review would need to identify an exact food code and matching form in the CNF 2026 measure-weight table. [S08, S09]

The source-specific density is not an edible-refuse calculation: the sample is already a milled dal, and the report supplies neither a refuse fraction nor paired gross/edible weights. Do not infer an edible-refuse adjustment. It also gives no conversion or substitution ratio between the mixed dal sample and this split-only retail product.

Therefore:

- Add no `densityGPerMl`, household unit mapping, cup/tablespoon weight, or package yield.
- Preserve each package size and each moisture threshold only as source-qualified evidence; do not combine them or generalize them.
- Add no cooking-time conversion, soaking/cooking yield, or split/dehulled-to-whole weight ratio.
- Add no substitution rule between whole urad, split/dehulled urad, split-with-husk urad, green mung beans, lentils, or chickpeas. The sources establish different products and uses, not quantity-preserving recipe interchangeability.

## Source table

| ID | Source and locator | Supports and limits |
|---|---|---|
| **WP03-H-URAD-FORM-R73-20261013-S01** | Office québécois de la langue française, [haricot mungo — *Vigna mungo* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo), accessed 2026-10-13; entry last updated 1991. | English `urd`, `urd bean`, and `black gram` for *V. mungo*; French `haricot mungo` ambiguity across *V. mungo* and *V. radiata*. Identity and terminology only, not a split/dehulled product label. |
| **WP03-H-URAD-FORM-R73-20261013-S02** | Canadian Food Inspection Agency, [new organic extension codes for seeds and grains — French](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme), packaged-grain code for `Haricots (Vigna mungo) (haricot urd)`, updated 2020-04-07. | Canadian bilingual product classification and French base name `haricot urd`; does not specify a culinary form. |
| **WP03-H-URAD-FORM-R73-20261013-S03** | Department of Consumer Affairs, Government of India; ICAR-CIPHET, [Development of Protocols for Shelf Life, Safe Storage, Milling Outturn and Indicative Norms for Procurement of Major Pulses](https://consumeraffairs.gov.in/public/upload/files/Final%20report%20OTR%20study_0_1732873721.pdf), 2021, pp. 17, 28, and 59; bulk-density method, black-gram milling SOP, and Table 7. | Distinguishes whole, split-with-husk, and split-without-hull black gram. Reports 842 kg/m³ for its Rajasthan black-gram dal sample at 10% initial moisture, but defines `dhuli dal` as a mixture of dehulled whole and split beans and does not isolate split-only density. Its controlled bulk-density method is not a household measure. No exact-form mapping or recipe substitution evidence. |
| **WP03-H-URAD-FORM-R73-20261013-S04** | National Agriculture Market (eNAM), Government of India, [commodity quality specifications](https://enam.gov.in/web/assest/download/sul/238_commodity_list.pdf), item 132, `URD DAL SPLIT`, accessed 2026-10-13. | Defines the commodity as *Vigna mungo* split, with or without husk, and gives grade-specific maximum moisture of 11%, 12%, or 14%. It does not select a husk state for the generic name or provide kitchen measures. |
| **WP03-H-URAD-FORM-R73-20261013-S05** | Save-On Foods, [Urad - Wash](https://www.saveonfoods.com/sm/pickup/rsid/990/product/urad-wash-id-454), product 454, indexed within the last month; listing says 1 pound and “Huskless split urad dal.” | Current Canadian retail product wording and package weight. The package mass is not a volume conversion or a universal measure. |
| **WP03-H-URAD-FORM-R73-20261013-S06** | Swadesh Supermarket, [Reva Urad Dal Washed 4 lb](https://www.swadesh.ca/collections/dals-pulses-1/products/reva-urad-dal-washed-4lb), indexed within the last two weeks; description says split and dehusked black gram and names dal, idli, dosa, and vada uses. | Canadian retailer corroboration for the split/dehulled state and product uses. Retailer text supplies no measured serving, yield, or substitution ratio. |
| **WP03-H-URAD-FORM-R73-20261013-S07** | Walmart Canada, [Sitara Split Black Matpe Beans Urad Split — English](https://www.walmart.ca/en/ip/Sitara-Split-Black-Matpe-Beans-Urad-Split/6000187054910) and [French listing](https://www.walmart.ca/fr/ip/Sitara-Haricots-Matpe-Noirs-Fendus-Urad-Fendu/6000187054910), same SKU 6000187054910 / UPC 628915082968; English indexed about four months ago, French page about one month ago. | English SKU-specific ingredients say “Split huskless black matpe beans”; French title and ingredient text support the integrated product-specific French match phrase. The page also contains generic overview copy referring to mung beans, so use the SKU-level wording for form only and not as independent species evidence. The 1.81 kg package is out of stock on the item page snapshot; use it for naming and scope only, not current availability or a kitchen quantity. |
| **WP03-H-URAD-FORM-R73-20261013-S08** | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), page details 2026-06-19. | States that CNF 2026 is published as relational files while the online tool remains a CNF 2015 access path. Dataset landing-page publication does not itself establish a form-specific measurement. |
| **WP03-H-URAD-FORM-R73-20261013-S09** | Health Canada, [CNF 2015 online search](https://aliments-nutrition.canada.ca/cnf-fce/newNutrientSearch?wbdisable=false), accessed 2026-10-13; page states it contains the 2015 CNF and is not being updated. | Version boundary for the online portion research. No reviewed serving page established a split/dehulled *Vigna mungo* portion; this does not claim that no relevant row exists in the downloadable CNF 2026 files. |

## Integrated disposition

Integration added only `ingredient-form-urad-beans-split-dehulled` and its form research-ledger record. Existing urad and mung references and all recipe rows remain unchanged. The form excludes bare `urad dal`, `black gram dal`, `haricot mungo`, and `black lentils`; no split-with-husk form, density, unit mapping, cooking yield, package yield, conversion, or substitution behavior was added. No app tests or emulator run were needed because the integration only adds database JSON data.

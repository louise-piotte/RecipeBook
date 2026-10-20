# WP03 Section F: Naturally Flavoured Honey Nut Cheerios family hold (R186)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog, ledger, recipe, checklist, roadmap, or generated data is changed here.
- **Open checklist:** Section F still requests regionally significant cereal-mix and preprocessed-grain coverage in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Candidate:** the Canadian ready-to-eat SKU titled **Naturally Flavoured Honey Nut Cheerios**.
- **Recommendation:** Hold the candidate outside active references, forms, legacy mappings, and the research ledger until the manufacturer-listed Honey Nut sibling is handled in the same picker decision. A single row would make the broad Honey Nut Cheerios query return only the standard-sugar product while the manufacturer also sells a distinct Lower Sugar product.

## Candidate scope and Québec naming evidence

General Mills Canada currently identifies the standard-sugar cereal in English as **Naturally Flavoured Honey Nut Cheerios** and in French as **Au miel et aux noix Saveurs naturelles Cheerios** [S01–S02]. Both are manufacturer SKU pages for the Canadian market. They identify a ready-to-eat cereal made with whole-grain oats, sugars including honey and golden syrup, corn starch, salt, oils, and other listed ingredients. The ingredient declaration has no proportions; it does not support formula links to oats, honey, almonds, corn starch, or other ingredient references.

The current Metro Québec listing calls the 430 g SKU **Céréales au miel et aux noix** and gives product code **065633132948** [S05]. The listing is currently indexed, but direct retrieval returned HTTP 403 in this review, so it is corroboration of Québec retail wording and SKU only. OQLF defines *céréales* as a prepared food made from processed cereal grains, often sweetened and flavoured, and lists *céréales à déjeuner* as a preferred term [S06]. This supports the product class word; it does not prescribe a translation of the branded product title. Keep the manufacturer's French title as the exact proposed display and do not treat the Metro title as an approved synonym.

The manufacturer presents a separate **Lower Sugar Naturally Flavoured Honey Nut Cheerios** product in English and **Cheerios au miel et aux noix Saveurs naturelles moins de sucre** in French [S03–S04]. The Canadian manufacturer pages describe the lower-sugar product as 50% lower in sugar than the original; the pages show 12 g versus 6 g sugar per 37 g serving. The variants have separate product pages and distinct declarations. Do not merge them, classify one as a form of the other, or infer equivalence from their shared oats and honey.

The [R180 Multi-Grain Cheerios review](wp03-section-f-multi-grain-cheerios-identity-review-r180-20261016.md) names Honey Nut as a neighboring Cheerios product but does not review its exact current titles, lower-sugar sibling, Québec display, recipe demand, or picker behavior. The R181 Oat Crunch review held a single flavor while two sibling SKUs were outside the catalog. No focused Honey Nut identity proposal or hold was found. This proposal addresses one open item in the still-active regional cereal/preprocessed-grain checklist; the adjacent product-family mention is not an earlier disposition of this candidate.

## Active ownership and source-register audit

The current shared snapshot after the R185 integrations contains **1,565 ingredient references**, **122 forms**, **61 legacy-import candidates**, and **1,910 research-ledger records**. The ledger has **8,215 source entries**, **7,015 distinct source IDs**, and **5,809 distinct source URLs**.

Exact normalized-key searches across active reference IDs, display names and aliases; form IDs, labels and match terms; legacy candidate strings; and every ledger record found no owner for the proposed ID, the two manufacturer titles, the Metro title, the broader Honey Nut Cheerios phrase, or product code 065633132948. The only active Cheerios references are Multi-Grain Cheerios and the separately named Strawberry Banana Cheerios. No Honey Nut form, recipe link, legacy allocation, or ledger identity is proposed while this hold stands.

The product-page, lower-sugar-page, and Metro URLs in S01–S05 below were not already registered in the ledger. The OQLF cereal entry is reused from existing ledger source ID WP03-BR10GC-20261014-S05. The English Cheerios product-list page is reused from existing ledger source ID WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03. Each source ID in the register below points to one URL; the two reused source IDs already have those URLs registered.

## Picker consequences

The live search normalizes accents and punctuation, returns complete word-phrase matches first, and uses substring matching only if there are no phrase matches [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). A static projection from the current reference and form data gives:

| Query | Current results | If only the standard-sugar candidate were added |
| --- | --- | --- |
| Naturally Flavoured Honey Nut Cheerios | 0 | 1 proposed row |
| Au miel et aux noix Saveurs naturelles Cheerios | 0 | 1 proposed row |
| Honey Nut Cheerios | 0 | 1 standard-sugar row, although a separate Lower Sugar SKU is currently listed by the manufacturer |
| au miel et aux noix | 0 | 1 standard-sugar row, although the French Lower Sugar title also contains this phrase |
| Cheerios | 2: Multi-Grain and Strawberry Banana | 3, including the standard-sugar SKU; the manufacturer product list has 17 current entries |
| cereal / céréales | 22 / 19 | unchanged; neither manufacturer display title contains these generic terms |
| Céréales au miel et aux noix | 0 | still 0 with the proposed manufacturer display and no aliases |

Keeping aliases empty would preserve the manufacturer's exact bilingual product titles, but it would not fix the family gap: broad English and French Honey Nut phrases would still resolve to only one catalog row. Adding Metro's title as an alias to this one SKU would create the same incomplete-family result and is not recommended. If the family is later integrated, review both Honey Nut SKUs together and test the full English and French family queries. The broader Cheerios result set is already intentionally partial; this hold is specifically about the direct Honey Nut family query.

## Bundled recipe-corpus demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for the candidate ID; the exact English and French manufacturer titles; the Metro product wording and code; and the broader phrases Honey Nut and miel et aux noix. The scan found **0 matching files and 0 matching ingredient rows**. No bundled recipe link or recipe-text change is supported.

## Measurement, density, forms, and substitution limits

- **Manufacturer serving:** The English and French product pages each give **1 cup / 1 tasse (37 g)** for the standard-sugar SKU [S01–S02]. This is a product-specific nutrition-label observation only. It does not establish a generic cereal measure, active unit mapping, or ingredient density.
- **Sibling serving:** The Lower Sugar pages also show 1 cup / 1 tasse (37 g) [S03–S04]. Do not transfer that observation to the standard-sugar row; the manufacturer treats the SKUs as separate products.
- **Package:** The manufacturer lists 292 g, 330 g, 430 g, 725 g, and 1.3 kg sizes; Metro currently lists a 430 g SKU [S01–S02, S05]. Package mass is not a recipe quantity, serving conversion, or yield.
- **Preparation and density:** Both are ready-to-eat cereals. The reviewed pages provide no dry-to-prepared yield or general volume-to-mass conversion. Keep density null, mappings empty, and forms absent.
- **Substitution:** The product pages say the cereal can be used in recipes but do not provide a tested, quantity-qualified exchange with the Lower Sugar sibling, other Cheerios products, or another cereal. The recipe corpus has no Honey Nut demand. Add no global or contextual substitution rule.

## Conditional reference and ledger shape

If the Honey Nut family is later accepted as a coordinated picker decision, the standard-sugar SKU could use this identity-only reference alongside a separately named Lower Sugar sibling:

    {
      "id": "ingredient-ref-naturally-flavoured-honey-nut-cheerios",
      "nameFr": "Au miel et aux noix Saveurs naturelles Cheerios",
      "nameEn": "Naturally Flavoured Honey Nut Cheerios",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "category": "GRAIN_AND_CEREAL"
    }

Under that future acceptance only, the standard-sugar ledger record could use record ID ingredient-ref-naturally-flavoured-honey-nut-cheerios, record type ingredient_reference, identityState verified, measurementState researched_supported, and substitutionResearchState researched_no_supported_substitute. Attach S01–S02 and one product-specific observation:

- Observation ID: WP03-HONEY-NUT-CHEERIOS-R186-M1-LABEL-1-CUP-37G
- Relationship: portion_weight; value: 37; valueUnit: g; sourceQuantity: 1 cup
- Food description: Naturally Flavoured Honey Nut Cheerios, Canadian manufacturer Nutrition Facts serving
- Food state: dry ready-to-eat cereal, as sold
- Measurement method: manufacturer Nutrition Facts serving-size label
- Quantity basis: SKU-specific nutrition serving only; not a reusable measure, density, or unit conversion
- Evidence kind: manufacturer_label; source IDs S01 and S02

The proposed ledger observation is not a measure assignment to an active ingredient reference. Keep substitution findings empty. Under the present hold, add no reference, ledger record, source entry, alias, form, or recipe link.

## Source register

Sources were checked online on 2026-10-16. New proposal-local IDs are not ledger additions. Source S06 and S07 cite exact URLs already registered under the existing source IDs named in the audit above.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| WP03-HONEY-NUT-CHEERIOS-R186-20261016-S01 | General Mills / Cheerios Canada, [Naturally Flavoured Honey Nut Cheerios](https://www.cheerios.ca/products/honey-nut-cheerios), product title, ingredients, size options, and Nutrition Facts serving. | Current Canadian English manufacturer SKU page. Supports the standard-sugar product identity, listed ingredients, 1 cup (37 g) label serving, package-size range, and distinction from a Lower Sugar SKU. |
| WP03-HONEY-NUT-CHEERIOS-R186-20261016-S02 | General Mills / Cheerios Canada, [Au miel et aux noix Saveurs naturelles Cheerios](https://www.cheerios.ca/fr-CA/products/au-miel-et-aux-noix-cheerios), French title, ingredients, package sizes, and nutrition panel. | Current Canadian French manufacturer page. Supports the proposed French display, product identity, and 1 tasse (37 g) serving. The product title is manufacturer wording, not an OQLF brand-name ruling. |
| WP03-HONEY-NUT-CHEERIOS-R186-20261016-S03 | General Mills / Cheerios Canada, [Lower Sugar Naturally Flavoured Honey Nut Cheerios](https://www.cheerios.ca/products/lower-sugar-naturally-flavoured-honey-nut-cheerios), separate product title, description, ingredients, and Nutrition Facts. | Current Canadian English manufacturer page establishes the distinct lower-sugar sibling and states it has 50% less sugar than the original. Its 1 cup (37 g) serving remains SKU-specific. |
| WP03-HONEY-NUT-CHEERIOS-R186-20261016-S04 | General Mills / Cheerios Canada, [Cheerios au miel et aux noix Saveurs naturelles moins de sucre](https://www.cheerios.ca/fr-CA/products/cheerios-au-miel-et-aux-noix-saveurs-naturelles-moins-de-sucre), French title, product description, ingredients, and nutrition panel. | Current Canadian French manufacturer page supports the lower-sugar sibling's separate French title and product distinction. It does not establish an alias for the standard-sugar product. |
| WP03-HONEY-NUT-CHEERIOS-R186-20261016-S05 | Metro Québec, [Céréales au miel et aux noix](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-au-miel-et-aux-noix/p/065633132948), current indexed listing. | Search-indexed Québec listing identifies the 430 g SKU and product code 065633132948 under this French product wording. Direct retrieval returned HTTP 403 in this review; use as secondary corroboration only, not as the sole naming or product-scope evidence. |
| WP03-BR10GC-20261014-S05 | Office québécois de la langue française, [céréales](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26571637/cereales), definition and preferred terms. | Reused existing ledger source ID. Supports the generic product class term céréales and its processed-grain scope; it does not translate the Honey Nut brand title. |
| WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03 | General Mills / Cheerios Canada, [Our Products](https://www.cheerios.ca/products), current English brand product list. | Reused existing ledger source ID. Lists the current Canadian product lineup, including Naturally Flavoured Honey Nut Cheerios, and reports 17 results. Supports product-family context, not identity equivalence. |

## Recommendation

**Hold Naturally Flavoured Honey Nut Cheerios outside the active catalog and research ledger until its Lower Sugar sibling can be considered in the same picker decision.** The Canadian manufacturer and Québec-facing French sources support the standard-sugar SKU and bilingual naming; the manufacturer also confirms a separately named lower-sugar version. With only one row, the current phrase-first picker would make the broad Honey Nut Cheerios query return one of two distinct products. The full recipe corpus has no demand. Keep the manufacturer serving, if later recorded, as a product-specific ledger observation only; add no reusable measure, density, form, alias, recipe link, conversion, yield, or substitution.

## Reopen conditions

- Reconsider when both current Honey Nut SKUs can be represented together with manufacturer-backed English and French names, or when picker behavior can show the family boundary without making either broad Honey Nut query a one-variant result.
- Recheck the titles and package listings if General Mills removes, renames, or reformulates either product.
- Add a reusable measure, density, form, preparation yield, recipe link, or substitution only if a source supplies direct evidence for that use or the bundled recipes create concrete demand.

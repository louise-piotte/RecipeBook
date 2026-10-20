# WP02 A6 R312 — generic millet flour measurement review

**Status:** proposal-only, prepared 2026-10-16

**Target:** existing reference ingredient-ref-millet-flour

**Scope:** measure evidence only

**Integration owner:** root

## Recommendation

Make a bounded ledger-only measurement update on the existing generic millet flour record. Preserve three source-reported portions as separate observations: the CNF 2015 food-code 6186 portions (250 mL = 125.7 g and 1 serving = 20.0 g) and the Québec-directory product-label serving for Cuisine Soleil millet flour, GTIN 851424000097 (1/4 cup = 52 g).

Recommend measurementState researched_no_supported_value: the exact reported portions are useful as source-scoped observations, but they do not establish a reusable universal cup mapping or default density for the catalog. Leave defaultDensity null and unitMappings empty. Do not calculate density from any pair, harmonize the CNF and product label, or infer a standard cup fill or convention. Leave identity fields, forms, cooking yield, recipes, conversions, and substitution research unchanged.

## Checklist scope and ownership

The open A6 parent item in docs/RecipeBook-global-ingredient-catalog-plan.txt, lines 1675–1676, asks for continued review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours, while keeping grain-level teff separate from flour identities. The nested generic millet flour identity item at lines 1837–1838 is already complete and explicitly says to add no numeric data. R312 is a separate measurement review of that existing record; it does not reopen or extend the identity decision.

The target reference and ledger record already exist. The current reference is millet flour / farine de millet, has no aliases, null default density, and no unit mappings. Its ledger record has identityState verified, measurementState not_yet_researched, substitutionResearchState not_yet_researched, three identity-context sources, zero measurement observations, and no substitution findings. There is no form linked to this reference.

Prior A6 flour-alias reviews cite CNF code 6186 and the Cuisine Soleil directory entry as comparators for species-qualified foxtail and pearl millet flour. Those proposals explicitly kept the generic portions off their species-specific rows. Their source IDs belong to the comparator rows; this review proposes new target-scoped source IDs rather than reusing those ledger entries. The original generic identity proposal and its OQLF terminology source remain the identity record's basis. No earlier proposal or plan item reviewed here owns a measurement decision on the generic millet-flour ledger row. The R312 source-ID prefix and target proposal path were absent before this proposal was written.

## Current data and picker boundaries

The live package snapshot used for this review contains 1,672 references, 127 forms, 114 manifest-listed recipes, and 1,123 ingredient rows. The ledger has 2,019 records and 8,954 source-entry occurrences.

The static picker projection, following IngredientSearch.kt phrase-first search behavior, returns six references for “millet flour”: finger, foxtail, kodo, generic, pearl, and proso millet flour. “Farine de millet” returns five: foxtail, kodo, generic, pearl, and proso millet flour. The generic phrase remains distinguishable within those result sets; this measurement-only proposal changes no picker terms or references.

A manifest-ordered scan of the 114 bundled recipe files found zero target-phrase text hits and zero ingredient references linked to ingredient-ref-millet-flour. The ordered corpus totals 753,928 bytes; fingerprint: 0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143. The scan is a bundled-corpus boundary check, not evidence that no user-created recipe may use millet flour.

## Portion evidence

### Health Canada CNF 2015

Health Canada's online serving-size interface is identified as the 2015 CNF publication; it says that interface will not be updated while Health Canada works toward a more user-friendly way to access the CNF 2026 dataset. Food code 6186 is explicitly named “Grains, millet, flour” / “Grains céréaliers, millet, farine.” The serving-portion page lists:

- 250 mL = 125.7 g.
- 1 serving = 20.0 g.

The page is modified 2019-03-01. These are edition-specific, source-reported portions for the generic CNF food description. The serving entry has no stated household volume. Do not convert these entries into a density, derive a cup value, or treat the CNF value as a measurement protocol for the Cuisine Soleil product.

Sources: [CNF food-code 6186 serving portions](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6186) and [Health Canada’s CNF search interface, identified as the 2015 publication](https://food-nutrition.canada.ca/cnf-fce/).

### Québec directory and manufacturer listing

The Québec Food Directory record for Cuisine Soleil, GTIN 851424000097, names the product Farine de Millet Biologique / Organic Millet Flour, describes a 1 kg stone-ground organic millet flour, and lists an ingredient declaration of organic millet flour. Its Nutrition Facts panel reports 1/4 cup (52 g); the additional information lists serving size 52 gr. The record does not identify a millet species. This is a product-label portion, not a general millet-flour volume conversion. The directory also displays a 1 kg package amount, which is package content and not a kitchen measure.

The displayed update date is inconsistent between available renderings of this same record. A fresh French indexed result shows “Dernière mise à jour : 2026-07-24”; the direct English page fetch in this review showed “Last updated: 2026-04-09” and was marked crawled three months ago. The exact product, GTIN, and portion values match. Retain the date discrepancy as a source limitation; use 2026-07-24 as the latest indexed update date, not as a claim that the fetched English rendering itself displayed that date. The directory page displays a GS1 logo and states MAPAQ is not responsible for the accuracy of published information, so preserve this as directory-hosted product-label evidence rather than independent lab measurement.

Cuisine Soleil's published product list separately displays “Farine de millet” and “100% farine de millet biologique.” This corroborates the Québec French wording and an unqualified millet flour product, but gives no measure. Its blend-construction guidance is not a general millet-flour substitution ratio and is not included in the ledger change. OQLF's existing millet entry remains the Québec terminology source already attached to the identity record; do not add a duplicate OQLF source.

Sources: [Québec Food Directory product record](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223769), [Cuisine Soleil product list](https://cuisinesoleil.com/produits/?product_view=list), and [OQLF, millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet).

### CNF 2026 retrieval limit

The official [Canadian Nutrient File, 2026 dataset record](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists Food Name and Measure Weight Conversion CSV resources. The record metadata surfaced in search results as modified 2026-10-04. In this review, opening the dataset landing page returned HTTP 403; opening the Food Name resource page returned HTTP 403; and direct access to the Food Name CSV and Measure Weight Conversion CSV was reported unavailable by the web tool. Targeted searches for “Grains, millet, flour” and food code 6186 did not surface row-level 2026 contents. A targeted repository filename search for CNF, Food Name, and Measure Weight Conversion files returned no matches. Therefore, this review does not claim that a CNF 2026 millet-flour row exists or does not exist, and it adds no 2026 CNF observation. The access finding is limited to those attempts.

## Proposed ledger delta

Add two target-scoped source entries:

| Source ID | Source and supported scope |
| --- | --- |
| WP02-A6-MILLET-FLOUR-MEASURE-R312-20261016-S01 | Health Canada, [CNF 2015 food code 6186 serving portions](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6186). Accessed 2026-10-16; version/date: CNF 2015, page modified 2019-03-01. Locator: code 6186 serving-size page. Supports 250 mL = 125.7 g and 1 serving = 20.0 g for “Grains, millet, flour.” Source kind: food_composition. |
| WP02-A6-MILLET-FLOUR-MEASURE-R312-20261016-S02 | Québec Food Directory, [Cuisine Soleil millet flour, GTIN 851424000097](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223769). Accessed 2026-10-16; latest French indexed update date 2026-07-24, while the direct English page view displayed 2026-04-09. Locator: product heading, GTIN, ingredient declaration, Nutrition Facts, and serving-size fields. Supports the product-specific 1/4 cup (52 g) label portion and separate 52 g serving-size declaration; the record does not specify millet species. Source kind: regional_authority. |

Add three separate measurement observations on ingredient-ref-millet-flour. Each has relationship portion_weight; no ingredientFormId:

| Observation ID | Food description | Source quantity | Reported mass | Source ID | Evidence kind and quantity basis |
| --- | --- | --- | --- | --- | --- |
| cnf-2015-millet-flour-6186-250ml-125-7g-r312-20261016 | Grains, millet, flour; CNF 2015 code 6186 | 250 ml | 125.7 g | WP02-A6-MILLET-FLOUR-MEASURE-R312-20261016-S01 | published_portion; exact CNF portion, not a calculated density |
| cnf-2015-millet-flour-6186-serving-20g-r312-20261016 | Grains, millet, flour; CNF 2015 code 6186 | 1 serving | 20.0 g | WP02-A6-MILLET-FLOUR-MEASURE-R312-20261016-S01 | published_portion; the source gives no volume for this serving |
| cuisine-soleil-millet-flour-851424000097-quarter-cup-52g-r312-20261016 | Cuisine Soleil Organic Millet Flour, GTIN 851424000097 | 0.25 cup | 52 g | WP02-A6-MILLET-FLOUR-MEASURE-R312-20261016-S02 | manufacturer_label; one SKU's product-label serving, with cup convention and filling method unspecified |

For each observation, record value/valueUnit as the reported mass in grams, observedMassG as the same reported mass, sourceQuantity as shown above, and the matching source ID. Preserve the source wording and keep every quantity basis source-specific. Do not add a calculation, observedVolumeMl for the 1/4-cup label, derived interval, or density value.

Set measurementState to researched_no_supported_value to record that a review found no reusable default density or general unit mapping. Append an accepted decision saying that the three exact portions are retained as source-scoped observations only. Keep defaultDensity null, unitMappings empty, aliases unchanged, and the generic record's identity decision unchanged. Keep substitutionResearchState not_yet_researched with no substitution finding; the manufacturer's blend-construction guidance is not treated as a substitution finding.

## Review limits

This is a proposal, not a shared-ledger or catalog edit. Do not update the A6 checklist, roadmap, reference JSON, package manifest, generated files, recipes, or integration README as part of R312. No software tests, builds, emulator checks, or deployment are needed or were run.


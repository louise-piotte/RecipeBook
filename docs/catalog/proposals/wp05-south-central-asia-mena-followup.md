# WP05 Section Y follow-up proposal

## Work-packet contract

- Input revision: 0caaef893ebd9e12443c62fdbbb6a5a328c53fc4 (branch main; live HEAD read before research).
- Owner: /root/wp05_south_central_mena (research proposal).
- Reviewer and integration owner: /root (coordinator).
- Scope: five additional South Asian / Middle Eastern pantry identities and compounds from checklist Section Y.
- Evidence accessed: 2026-10-08.
- Status: partially accepted on 2026-10-08; labneh, za'atar, amchur powder, and sumac are integrated. Mixed Pickles remains pending direct-source review; this does not complete Section Y or WP05. See `../batches/wp05-mena-labneh-spices.md`.
- Live-state check: canonical seed had 385 ingredient refs and 16 forms. Tahini, sweet mango chutney, mango pickle, and lime pickle are already integrated and excluded. None of the five active canonical names below were present. Sumac and za'atar exist as unreviewed legacy candidates with matching stable IDs; this proposal reuses those IDs and does not mint duplicates. Other three IDs below are absent from canonical and legacy candidate files.

Only IDs, names, aliases, categories, and boundaries are proposed. Numeric, density, conversion, and substitution values remain unavailable.

## Proposed candidates

| Stable ID and disposition | Proposed EN / fr-CA names | Aliases and identity/form boundary | Category proposal |
|---|---|---|---|
| ingredient-ref-labneh — new active identity; absent from canonical and legacy candidates | EN: labneh. fr-CA: labneh. | French and English alias `lebneh` is OQLF-supported. Canadian product pages use Labneh in both languages; OQLF defines it as concentrated yogurt, while products may be spread-like. Keep as a named Levantine cultured-dairy identity, distinct from plain yogurt and generic cream cheese. Do not assert one universal dairy base or moisture level. No form record is proposed. | DAIRY_AND_ALTERNATIVE accepted: OQLF places labneh under yogurt, and Canadian dairy sources list labneh as a dairy/yogurt product. This broad category does not assert one product texture or formulation. |
| ingredient-ref-zaatar — promote/enrich the existing unreviewed legacy candidate; do not mint a new ID | EN: za'atar. fr-CA: zaatar. | English and French terms are OQLF-supported. Canonical labels are EN `za'atar` and fr-CA `zaatar`; `zahtar` is active in both alias fields. OQLF also lists English `zaatar`, represented by the French canonical label rather than a duplicate cross-language alias. A composition-variable Middle Eastern spice blend, not sumac, sesame, thyme, oregano, or a synonym for any component. OQLF describes hyssop, sumac, and toasted sesame; notes thyme or oregano/thyme substitutions. A Quebec product example uses sesame, oregano, thyme, sumac, and salt, demonstrating blend variation. | Keep the legacy BAKING_AND_SPICE category. Taxonomy note: it is in the WP05 condiment checklist, but evidence classifies it as a dry spice/seasoning blend. |
| ingredient-ref-amchur — new active identity; absent from canonical and legacy candidates | EN: amchur powder. fr-CA: amchur (mangue) en poudre. | EN aliases supported by Canadian seller: `amchoor`, `aamchur`; fr-CA alias `amchoor` is supported by a Montreal retailer. The seller also lists dried/dry mango powder wording, but those broader phrases are not activated because searches for generic mango powder should not silently select this regional product. Do not add generic or sour mango powder. This is a dry spice/souring ingredient made from unripe green mango, not fresh or ripe mango, mango chutney, or a pickle. The seller mentions tamarind as a qualitative alternative but gives no comparable ratio or scoped rule; propose no substitution. | BAKING_AND_SPICE recommended, based on direct spice classification. Taxonomy note: checklist calls for regional souring agents, while the product is a dry mango ingredient rather than a sauce. |
| ingredient-ref-south-asian-mixed-pickle — new compound identity; absent from canonical and legacy candidates | EN: Mixed Pickles. fr-CA: Pickles mélangés. | No aliases proposed. The same Divya Canadian retail listing uses these bilingual product labels and lists mango, lime, carrot, ginger, mango/lime pastes, oil, salt, spices, water, and lemon juice. This is a composition-variable South Asian mixed pickle compound, not a form or alias of the already integrated mango pickle or lime pickle, nor generic North American mixed pickled vegetables. Do not add achar/achaar without evidence that the term has the same scope. | SAUCE_AND_CONDIMENT. Locale ambiguity: the Canadian retailer uses pickles in French for this named product; do not generalize that wording to other pickle types. |
| ingredient-ref-sumac — promote/enrich the existing unreviewed legacy candidate; do not mint a new ID | EN: sumac. fr-CA: sumac. | No aliases proposed. OQLF defines the culinary spice as aromatic purple powder from the berries of a Mediterranean shrub and notes its Middle Eastern use. Represent the ground edible spice only; distinguish it from ornamental/wild sumac, extracts, and sumac seasoning blends. Do not alias it to za'atar, which is a compound blend containing sumac. No separate ground form proposed because the supported identity itself is powder. | Keep the legacy BAKING_AND_SPICE category; OQLF classifies it as a spice/seasoning. |

### Existing and nearby identities to keep separate

- Existing plain yogurt stays separate from labneh; no yogurt alias or form conversion is proposed.
- Existing sesame seeds, olive oil, and any separately catalogued herbs/spices stay as components of za'atar, not blend aliases.
- Sumac and za'atar remain distinct despite OQLF documenting sumac as an ingredient in za'atar.
- Existing mango pickle and lime pickle remain separate from the mixed pickle compound, whose source product combines both with other ingredients.
- Tahini is already canonical and excluded; it is not an alias for za'atar, sumac, or mixed pickles.

## Source evidence

Direct source pages and titles, accessed 2026-10-08:

1. Office québécois de la langue française, GDT, “zaatar” — https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557705/zaatar
   - Preferred French terms zaatar and zahtar; English terms za'atar, zaatar, zahtar; definition and documented composition variability.
2. Metro, “Mélange d'assaisonnements Zaatar Knorr” — https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/epices/melange-d-assaisonnements-zaatar/p/068400001126
   - Canadian French product wording.
3. Metro, “Irrésistible Middle Eastern-Style Za'atar Seasoning Mix” — https://www.metro.ca/en/online-grocery/aisles/pantry/condiments-toppings/hot-chili-sauces/middle-eastern-style-za-atar-seasoning-mix/p/059749993425
   - Quebec-made product; its listed ingredients include sesame, oregano, thyme, sumac, and salt.
4. Office québécois de la langue française, GDT, “sumac” — https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17487318/sumac
   - English and French term, culinary powder definition, Middle Eastern use, and relation to zaatar.
5. Metro, “Sumac Passion d'épices” — https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/epices/sumac/p/693997030121
   - Canadian retail product name; corroborates use of sumac as a standalone culinary item.
6. Épices de cru, “Amchoor” (French, Montreal spice retailer) — https://epicesdecru.com/fr-ca/boutique/epices/amchoor
7. Spice Trekkers / Épices de cru, “Amchoor” (English) — https://spicetrekkers.com/en-ca/shop/spices/amchoor
   - Matched French/English vendor pages use Amchoor for dried green mango; French source describes its fruity acidity.
8. Épices Anatol, “Amchur (mangue) en poudre” — https://www.epicesanatol.com/fr/epices/amchur-poudre/
   - Montreal retailer’s exact French product label; description states that green mango is dried and reduced to powder for use as a spice.
9. Ameen Foods, “Amchur Powder” — https://ameenfoods.ca/products/amchur-powder-100g
   - Canadian seller’s product description identifies dried unripe mango, powder form, and spellings amchoor, aamchur, amchur powder, dried mango powder, and dry mango powder.
10. Metro, “Puck Labneh” (English) — https://www.metro.ca/en/online-grocery/aisles/dairy-eggs/deli-cheese/soft-fresh/labneh/p/060466173687
11. Metro, “Labneh Puck” (French) — https://www.metro.ca/epicerie-en-ligne/allees/produits-laitiers-et-oeufs/fromages-fins/fromages-a-pate-molle-et-frais/labneh/p/060466173687
   - Same Canadian product code and bilingual labneh label. The source describes Levantine use and lists cultured dairy ingredients.
12. Les Producteurs laitiers du Canada, “Khaas Labneh nature 9% M.G. 450g” — https://producteurslaitiersducanada.ca/fr/plaisirs-laitiers/repertoire-de-la-vache-bleue/khaas-labneh-nature-9-mg-450g
   - Canadian dairy product directory uses the French name Labneh and identifies the product as Canadian dairy.
13. Puck, “Labneh” — https://www.puckarabia.com/en/products/labneh/
   - Manufacturer describes Levantine use and its product’s concentrated cultured-milk formulation; treat that formulation as product-specific.
14. Metro, “Mixed Pickles Divya” (English) — https://www.metro.ca/en/online-grocery/aisles/pantry/condiments-toppings/pickles-antipasto/mixed-pickles/p/062781986317
15. Metro, “Divya Pickles mélangés” (French) — https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/pickles-melanges/p/062781986317
   - Same Canadian product code; ingredients show the multi-fruit/vegetable, spice, oil, and liquid compound boundary.

Source retrieval note: the OQLF and specialist-retailer pages opened directly. Metro pages returned 403 to the web open function, but the web index returned the source page text, product titles, ingredient lists, bilingual labels, and shared product codes. Re-open Metro pages during coordinator review before integration; no broader claims depend on those listings.

## Numeric fields and substitutions

No density, measurement, unit-conversion, package-yield, or substitution data is proposed for any candidate. Product package sizes are not ingredient conversions. No average, category default, or inferred conversion is used. For amchur, the seller’s qualitative “substitute for tamarind” language does not establish an exact form, recipe context, ratio, or validated directed rule, so the substitution remains unavailable.

## Coordinator review and integration results

- Re-read current references, forms, legacy candidates, and evidence records; `ingredient-ref-zaatar` and `ingredient-ref-sumac` were promoted in place, without duplicate IDs.
- Accepted the labneh dairy category based on OQLF's yogurt classification and Canadian dairy listings. Product texture and formulation remain variable.
- Retained OQLF-supported labels and aliases. `mango powder`, `dry/dried mango powder`, `sour mango powder`, and `achar/achaar` remain inactive.
- Audited the 114 bundled recipe files; no labneh, za'atar, sumac, or amchur ingredient-line mentions were found.
- Normalization, generated-index freshness, 9 Python package tests, 274 Android unit tests, and `git diff --check` passed. Details are in `../batches/wp05-mena-labneh-spices.md`.
- Mixed Pickles remains unintegrated because the cited Metro pages return 403 to direct fetch and the French compound label needs independent Québec French review. Broader Section Y remains open.
- Keep density, measurements, forms, package yields, conversions, and substitutions unavailable until exact scoped evidence is available.

## Acceptance status and unresolved points

This packet is pending coordinator review. The coordinator accepted four identities: labneh, za'atar, amchur powder, and sumac. Labneh is categorized under DAIRY_AND_ALTERNATIVE based on the OQLF yogurt classification and Canadian dairy sources; its product texture/formulation remains variable. Mixed Pickles remains pending because the cited Metro pages return 403 to direct fetch and the French compound name needs independent review. No universal blend formula, form, numeric conversion, or substitution is claimed. The packet is only partially accepted.
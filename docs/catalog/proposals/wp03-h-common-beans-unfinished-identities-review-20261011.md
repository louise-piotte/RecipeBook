# WP03 Section H — Common-bean unfinished identities review

- **Reviewed:** 2026-10-11
- **Status:** proposal only; root integration remains separate
- **Scope:** white/Navy, Great Northern, Cannellini, kidney, black, pinto, borlotti/cranberry, Lima/butter, flageolet, and fava beans. Audited active references and forms, ledger records, recipe rows, names and aliases, densities and mappings, package data, conversions, yields, and substitutions.
- **Write boundary:** this review changes only this proposal file. It does not edit shared seed data, the ledger, plan, roadmap, code, or tests.
- **Data-only testing rule:** no tests were run. The repository instruction says database JSON additions do not need tests; no shared JSON is changed here.

## Disposition

Keep Great Northern, Cannellini, and Navy as the three already integrated, distinct identity-only references. Promote the legacy generic white-bean candidate as a broad white common-bean identity, but do not give it the French alias “haricot blanc”: that exact phrase is already the active Navy alias “petit haricot blanc.” Verify the existing kidney-bean reference and represent its one source-backed recipe line as canned, rinsed, and drained beans. Keep black and pinto references distinct and keep their current product- or recipe-specific package evidence narrow. Add identity-only cranberry/borlotti, flageolet, and whole fava references. Retain Lima as already active and leave “butter bean(s)” out of its aliases because Québec terminology and Canadian retail usage conflict.

Do not add cross-bean substitutions, general canned yields, dry-to-cooked conversions, generic household measures, or default densities. Health Canada’s portion table supports exact volume/weight observations for canned red kidney beans, drained and rinsed. Record those portions in the ledger, but leave active form density null: recipe 034’s 540 mL denotes the can’s net contents, not a measured volume of drained solids.

## Current-state audit

| Checklist identity | Current seed / ledger state | Recipe and numeric evidence | Disposition |
|---|---|---|---|
| Generic white beans | No active reference. Legacy ledger candidate ingredient-ref-white-beans is unresolved and unreviewed. | No matching recipe line, form, mapping, or generic yield. CNF code 3385 describes raw generic white beans, not a measure for a selected white-bean class or canned/drained recipe line. | Promote the existing candidate to a broad identity-only white-bean category. |
| Navy | Active ingredient-ref-navy-beans, verified. Displays navy beans / haricots Navy; aliases navy bean, white pea bean(s), and petit haricot blanc. | No matching recipe line, form, density, mapping, or yield. | Keep as integrated; do not fold into generic white beans. |
| Great Northern | Active ingredient-ref-great-northern-beans, verified. | No recipe or active form. Prior review records published portions in the ledger only; the reference still has null default density and no unit mapping. | Keep as integrated and identity-only. |
| Cannellini | Active ingredient-ref-cannellini-beans, verified. | No recipe or active form. CNF white-bean measures are not Cannellini-specific. | Keep as integrated and identity-only. |
| Kidney | Active ingredient-ref-kidney-beans, but its ledger record is unreviewed and has no sources. | Recipe 034, row 9, says “540 ml kidney beans, rinsed and drained.” RICARDO identifies this as one 19 oz (540 ml) can, rinsed and drained. No form link or package amount is stored. | Verify the identity, add an exact canned/rinsed/drained form, attach it to row 034#9, and retain declared can size separately from drained solids. |
| Black | Active ingredient-ref-black-beans, verified; no aliases. One active form, ingredient-form-black-beans-canned-drained. | No recipe line. A separate S&W 15 oz package-yield record reports 425 g net and 240 g drained for that product and size. | Keep the class identity, form, and product-specific yield. Do not generalize its yield or add a risky singular alias. |
| Pinto | Active ingredient-ref-pinto-beans, verified; display pinto beans / haricots pinto. | Recipe 007#4 already has one can with liquid, package type CAN, and NET_CONTENTS basis. It has no declared can size or yield. | Preserve the recipe package record; add source-supported singular aliases only. Do not add a canned form or yield from this line. |
| Cranberry / borlotti | No active reference or ledger candidate. | No recipe line, form, or measure. | Add a new identity-only dry common-bean market class. |
| Lima / butter | Active ingredient-ref-lima-beans, verified; display lima beans / haricots de Lima. No aliases or forms. | No recipe line or numeric data. Existing candidate-fresh-shell-beans remains a separate unresolved broad concept. | Keep the Lima identity; do not globally alias the ambiguous phrase “butter bean(s).” |
| Flageolet | No active reference or candidate. | No recipe line, form, or measure. | Add a new identity-only common-bean seed class. |
| Whole fava / gourgane | No whole-bean reference. Active ingredient-ref-fava-bean-flour is a separate FLOUR_AND_STARCH identity. | No whole-bean recipe line, form, or measure. | Add a whole-seed fava identity, separate from flour. |

The seed recipe scan found no other matching bean rows. Recipe 034#9 and 007#4 are the only relevant lines. The current package-yield file has the S&W black-bean record only; it has no generic kidney, pinto, white, cranberry, Lima, flageolet, or fava yield.

## Names, aliases, and collision decisions

The search code prefers complete normalized word phrases, then falls back to substring matching. It does not normalize singular and plural forms. Exact aliases therefore need review against current displays, aliases, and forms.

| Term or phrase | Decision | Collision / evidence boundary |
|---|---|---|
| white bean / white beans | Use the generic English display “white beans” and the singular English alias “white bean.” | OQLF describes white bean as a category containing several varieties. Do not add white kidney bean(s), Great Northern, Navy, or Cannellini as aliases. |
| haricot blanc | Do not add to generic white beans. | Active Navy alias “petit haricot blanc” contains the exact two-word phrase. Keep the generic French display plural “haricots blancs” only. |
| white pea bean(s) and petit haricot blanc | Retain only on Navy. | Already source-reviewed and active; keep Navy distinct from generic white, Great Northern, Cannellini, and kidney. |
| white kidney bean(s) | Do not activate on Cannellini or generic white. | The prior Cannellini review records the search overlap with the active kidney identity. Preserve that alias boundary. |
| red kidney bean / haricot rouge | Add as narrow kidney aliases. | Exact OQLF terms. Do not alias broad “red beans” or dark/light red subclasses. |
| black bean / haricot noir | Do not add as aliases to black beans. | The active English identity “black bean sauce” owns the exact phrase “black bean”; the French singular can also be read as a different dark bean class. Retain existing plural displays and OQLF source evidence. |
| pinto bean / haricot pinto | Add as singular aliases to the current pinto displays. | OQLF identifies these singular terms and accepts current French plural “haricots pinto”; retain the current display. |
| Romano bean(s) / romano | Do not add as global cranberry-bean aliases. | StatCan and retailers use Romano for the dry cranberry class, but unqualified Romano also occurs for flat/pod bean products. Use the unambiguous local cranberry name and Borlotti alias. |
| butter bean(s) / haricots beurre | Do not add to Lima. | OQLF pairs English butter bean and French haricots beurre with yellow/wax beans of Phaseolus vulgaris. Some Canadian retailers call Phaseolus lunatus Lima beans butter beans. This is a real product-name collision, not a safe global synonym. |
| flageolet / haricot flageolet | Use as flageolet aliases. Exclude fayot. | OQLF gives both preferred French forms and English flageolet / flageolet bean; it describes fayot as European colloquial usage. |
| fava bean / broad bean / gourgane | Add as whole-fava aliases. | OQLF identifies Vicia faba, with Québec/Canadian gourgane and English broad bean / fava bean. Whole beans are separate from active fava flour. Searching fava bean or gourgane is expected to return whole-bean and flour references because the flour display contains the same phrase. |
| fève / féverole | Do not add as aliases to whole fava beans. | OQLF notes Québec fève is used broadly for common-bean pods; féverole has separate agricultural/seed contexts in the existing flour evidence. Qualified fève des marais is retained as an OQLF alias. |

## Proposed seed changes

These are proposed deltas only. New references belong in the existing ingredient-references.v1.json array, with defaultDensity null, unitMappings empty, and category LEGUME_AND_PULSE. The snippets escape accents as required for bundled database JSON.

### Promote the legacy generic white-bean candidate

Use the existing ID ingredient-ref-white-beans; do not create a second white-bean ID.

    {
      "id": "ingredient-ref-white-beans",
      "nameFr": "haricots blancs",
      "nameEn": "white beans",
      "aliasesFr": [],
      "aliasesEn": ["white bean"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-11T00:00:00Z",
      "category": "LEGUME_AND_PULSE"
    }

This is a broad common-bean white-seed category for unqualified white-bean wording, not a synonym row for every white-seeded variety. Do not create forms or numeric mappings from the generic CNF raw-white-bean record.

### Verify kidney identity and add its recipe-backed form

Update the existing kidney reference as follows:

    {
      "id": "ingredient-ref-kidney-beans",
      "nameFr": "haricots rouges",
      "nameEn": "kidney beans",
      "aliasesFr": ["haricot rouge"],
      "aliasesEn": ["red kidney bean"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-11T00:00:00Z",
      "category": "LEGUME_AND_PULSE"
    }

Add one form to ingredient-forms.v1.json:

    {
      "id": "ingredient-form-kidney-beans-canned-drained-rinsed",
      "ingredientRefId": "ingredient-ref-kidney-beans",
      "formCode": "canned_drained_rinsed",
      "labelFr": "haricots rouges en conserve, rinc\u00e9s et \u00e9goutt\u00e9s",
      "labelEn": "canned kidney beans, rinsed and drained",
      "prepState": "drained",
      "matchTermsFr": [
        "haricots rouges en conserve, rinc\u00e9s et \u00e9goutt\u00e9s",
        "haricots rouges rinc\u00e9s et \u00e9goutt\u00e9s"
      ],
      "matchTermsEn": [
        "canned kidney beans, rinsed and drained",
        "kidney beans, rinsed and drained"
      ],
      "densityGPerMl": null,
      "notesFr": "La recette indique une bo\u00eete de 540 ml, puis les haricots sont rinc\u00e9s et \u00e9goutt\u00e9s. Le volume net de la bo\u00eete n'est pas le volume des haricots \u00e9goutt\u00e9s.",
      "notesEn": "The recipe names a 540 ml can, then rinses and drains the beans. The can's declared net volume is not the volume of the drained beans.",
      "updatedAt": "2026-10-11T00:00:00Z"
    }

The form density stays null even though CNF publishes matching drained/rinsed portions. The only current recipe amount is a declared whole-can volume. Assigning an active density to this form could incorrectly treat the can's net volume as measured drained-bean volume.

### Add cranberry / borlotti beans

    {
      "id": "ingredient-ref-cranberry-beans",
      "nameFr": "haricots cranberry",
      "nameEn": "cranberry beans",
      "aliasesFr": ["haricots secs canneberge", "haricots borlotti"],
      "aliasesEn": ["borlotti beans"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-11T00:00:00Z",
      "category": "LEGUME_AND_PULSE"
    }

This is the dry cranberry market class of Phaseolus vulgaris. The 2026 Statistics Canada crop survey lists cranberry dry beans separately from black, Great Northern, kidney, pinto, and Navy classes; CFIA places cranberry beans in its Phaseolus vulgaris grain category. Québec product wording supports haricots cranberry and its Borlotti synonym. Do not add romano alone, generic fresh Romano beans, forms, or measurements.

### Add flageolet beans

    {
      "id": "ingredient-ref-flageolet-beans",
      "nameFr": "flageolets",
      "nameEn": "flageolet beans",
      "aliasesFr": ["flageolet", "haricot flageolet"],
      "aliasesEn": ["flageolet", "flageolet bean"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-11T00:00:00Z",
      "category": "LEGUME_AND_PULSE"
    }

The identity is a distinct bean-seed class of Phaseolus vulgaris. OQLF describes it as pale green, small, thin, and flattened and eaten as seed. Do not merge it into generic white beans or add the European colloquial fayot.

### Add whole fava beans / gourganes

    {
      "id": "ingredient-ref-fava-beans",
      "nameFr": "gourganes",
      "nameEn": "fava beans",
      "aliasesFr": ["gourgane", "f\u00e8ve des marais"],
      "aliasesEn": ["fava bean", "broad bean"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-11T00:00:00Z",
      "category": "LEGUME_AND_PULSE"
    }

OQLF identifies gourgane as Vicia faba and gives gourgane / fève des marais and broad bean / fava bean. Do not merge this with ingredient-ref-fava-bean-flour.

### Add only singular pinto aliases

Update the current pinto reference; keep the present display and all other fields:

    "aliasesFr": ["haricot pinto"],
    "aliasesEn": ["pinto bean"],
    "updatedAt": "2026-10-11T00:00:00Z"

OQLF lists haricot pinto and pinto bean and says the current admitted plural haricots pinto may be used. Do not change existing 007#4 package data.

### No seed-row change for the already-reviewed identities

- Great Northern, Cannellini, and Navy remain as integrated. Their existing displays, aliases, null densities, and empty unit mappings stand.
- Black remains unchanged, including its single canned-drained form. Do not add black bean because the active black-bean-sauce reference claims that exact English phrase.
- Lima remains unchanged. Do not add global butter-bean aliases or fresh/dry forms.
- No recipe currently requests the generic white, cranberry, flageolet, Lima, or fava forms.

## Recipe-row deltas

### Recipe 034#9 — kidney beans

Source: [RICARDO, Classic Beef Chili](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili), which specifies one 19 oz (540 ml) can of kidney beans, rinsed and drained.

Keep the existing original text, quantity, unit, and bilingual preparation. Add the form link and package metadata:

    "ingredientFormId": "ingredient-form-kidney-beans-canned-drained-rinsed",
    "packageAmount": {
      "count": 1,
      "packageType": "CAN",
      "declaredNetQuantity": 540,
      "declaredNetUnit": "ml",
      "requestedBasis": "DRAINED_MASS"
    }

The declared 540 ml is the source's full can size. DRAINED_MASS records the recipe's requested contents after rinsing/draining; it does not assert that the drained solids weigh 540 ml, and no matching package-yield record exists. Keep packingMedium unspecified. Do not create a package yield from the can size.

### Recipe 007#4 — pinto beans

Keep the accepted current package data unchanged:

    "quantity": 1,
    "unit": "can",
    "packageAmount": {
      "count": 1,
      "packageType": "CAN",
      "requestedBasis": "NET_CONTENTS"
    }

The source uses the whole can with liquid. Its size, brand, packing medium, mass, and drained amount remain unknown. The existing WP04 review explicitly rejects creating a canned-with-liquid form or yield from this one row.

### Other recipe rows

No new recipe links are proposed. The S&W black-bean product yield does not justify changing another bean row.

## Ledger deltas

Append the source objects listed in the source register below to the corresponding records. IDs below are proposal-local ledger source IDs.

| Record | Proposed ledger delta |
|---|---|
| ingredient-ref-white-beans | Convert recordType from candidate to ingredient_reference; set identityState verified; retain measurementState not_yet_researched and substitutionResearchState not_yet_researched; replace the unresolved legacy decision with an accepted identity decision supported by WP03-H-COMMONBEANS-20261011-S01–WP03-H-COMMONBEANS-20261011-S02. |
| ingredient-ref-kidney-beans | Set identityState verified, measurementState researched_supported, and retain substitutionResearchState not_yet_researched. Add WP03-H-COMMONBEANS-20261011-S03–WP03-H-COMMONBEANS-20261011-S05 and accepted decision. Add the three Health Canada portion-weight observations below to this reference, each linked to the proposed drained/rinsed form. Do not add a package-yield record. |
| ingredient-ref-cranberry-beans | Add a verified ingredient_reference record, measurement and substitution states not_yet_researched, sources WP03-H-COMMONBEANS-20261011-S06–WP03-H-COMMONBEANS-20261011-S10, and accepted identity decision. |
| ingredient-ref-flageolet-beans | Add a verified ingredient_reference record, measurement and substitution states not_yet_researched, source WP03-H-COMMONBEANS-20261011-S13, and accepted identity decision. |
| ingredient-ref-fava-beans | Add a verified ingredient_reference record, measurement and substitution states not_yet_researched, sources WP03-H-COMMONBEANS-20261011-S06 and WP03-H-COMMONBEANS-20261011-S14, and accepted identity decision. Keep active fava-flour ledger record unchanged. |
| ingredient-ref-pinto-beans | Keep identity verified and measurements/substitutions unchanged. If aliases are added, append an accepted decision referencing existing source WP03-H-S07. |
| ingredient-ref-lima-beans | Keep identity verified and numeric/substitution states unchanged. Append WP03-H-COMMONBEANS-20261011-S11–WP03-H-COMMONBEANS-20261011-S12 and a decision documenting why butter bean(s) is not activated as a global alias. |
| Black-bean reference and S&W package-yield record | No ledger delta. Retain existing identity and exact S&W 15 oz / 425 g net / 240 g drained record as product-specific. |
| Great Northern, Cannellini, Navy | No ledger delta; retain the accepted records from their linked integrated proposals. |

Add these observations to the kidney reference ledger record using the existing MeasurementObservation shape:

    [
      {
        "observationId": "health-canada-cnf-7085-kidney-beans-rinsed-drained-125ml",
        "relationship": "portion_weight",
        "ingredientFormId": "ingredient-form-kidney-beans-canned-drained-rinsed",
        "value": 83.5,
        "valueUnit": "g",
        "foodDescription": "Beans, kidney, red, canned, drained and rinsed — Health Canada CNF food code 7085",
        "foodState": "Canned, drained and rinsed.",
        "measurementMethod": "Health Canada CNF published serving-size pair.",
        "quantityBasis": "One published 125 ml portion of drained and rinsed beans; not the 540 ml can net contents.",
        "sourceQuantity": { "amount": 125, "unit": "ml" },
        "observedMassG": 83.5,
        "observedVolumeMl": 125,
        "evidenceKind": "published_portion",
        "sourceIds": ["WP03-H-COMMONBEANS-20261011-S05"]
      },
      {
        "observationId": "health-canada-cnf-7085-kidney-beans-rinsed-drained-175ml",
        "relationship": "portion_weight",
        "ingredientFormId": "ingredient-form-kidney-beans-canned-drained-rinsed",
        "value": 116.9,
        "valueUnit": "g",
        "foodDescription": "Beans, kidney, red, canned, drained and rinsed — Health Canada CNF food code 7085",
        "foodState": "Canned, drained and rinsed.",
        "measurementMethod": "Health Canada CNF published serving-size pair.",
        "quantityBasis": "One published 175 ml portion of drained and rinsed beans; not the 540 ml can net contents.",
        "sourceQuantity": { "amount": 175, "unit": "ml" },
        "observedMassG": 116.9,
        "observedVolumeMl": 175,
        "evidenceKind": "published_portion",
        "sourceIds": ["WP03-H-COMMONBEANS-20261011-S05"]
      },
      {
        "observationId": "health-canada-cnf-7085-kidney-beans-rinsed-drained-250ml",
        "relationship": "portion_weight",
        "ingredientFormId": "ingredient-form-kidney-beans-canned-drained-rinsed",
        "value": 166.9,
        "valueUnit": "g",
        "foodDescription": "Beans, kidney, red, canned, drained and rinsed — Health Canada CNF food code 7085",
        "foodState": "Canned, drained and rinsed.",
        "measurementMethod": "Health Canada CNF published serving-size pair.",
        "quantityBasis": "One published 250 ml portion of drained and rinsed beans; not the 540 ml can net contents.",
        "sourceQuantity": { "amount": 250, "unit": "ml" },
        "observedMassG": 166.9,
        "observedVolumeMl": 250,
        "evidenceKind": "published_portion",
        "sourceIds": ["WP03-H-COMMONBEANS-20261011-S05"]
      }
    ]

The three values are internally consistent at about 0.668 g/ml, but this review does not copy that ratio to active densityGPerMl. The observations are specific to Health Canada’s kidney-bean product and drained/rinsed state. The 540 ml recipe quantity is the can's net contents.

## Forms, densities, mappings, yields, conversions, and substitutions

- **Forms:** add only the kidney canned/rinsed/drained form required by recipe 034. Do not create generic dry, cooked, canned, or drained forms for other identities without a recipe or concrete conversion need.
- **Density:** leave all reference defaultDensity values null. Leave the kidney form densityGPerMl null because its current linked recipe carries the can's net volume. No supported active density is proposed for the remaining beans.
- **Mappings:** keep every new row's unitMappings empty. No source establishes a class- and form-specific household mapping for these recipes.
- **Package yields:** add no yield. Keep existing S&W black-bean 15 oz data product-specific. Pinto’s one can has unknown size and drained yield. Kidney’s source identifies a 540 ml can but gives no drained mass.
- **Conversions:** add no generic dry-to-cooked, canned-to-drained, or cross-bean conversion. CNF kidney portions are not a can-yield observation.
- **Substitutions:** add no global or contextual rule. Prior Cannellini and Great Northern reviews record only qualitative cooking interchangeability in limited contexts; this does not support universal form-to-form conversion ratios. No source here makes kidney, pinto, cranberry, Lima, flageolet, fava, or generic white beans interchangeable in all recipe roles.

## Source register

Online sources were checked on 2026-10-11. Source IDs prefixed WP03-H-COMMONBEANS-20261011 are new proposal-local ledger IDs; sources already recorded in prior bean reviews keep their existing IDs.

| Source ID | Source and locator | Supports | Limit |
|---|---|---|---|
| WP03-H-COMMONBEANS-20261011-S01 | Office québécois de la langue française, [haricot blanc, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296956/haricot-blanc), notes and preferred term. | Phaseolus vulgaris; white beans comprise many varieties; white kidney bean is one named member. | Does not make all white-bean varieties synonymous or prove the contents of a retail can. |
| WP03-H-COMMONBEANS-20261011-S02 | Metro Québec, [Selection Haricots blancs, 540 ml](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/haricots-et-legumineuses/haricots-blancs/p/059749929974), current product listing. | Québec retail uses generic French product title “Haricots blancs.” | Product-level retail naming; no class-specific variety, drained state, or household conversion. Direct retrieval was unavailable during this review; the indexed listing supplies the title and package size. |
| WP03-H-COMMONBEANS-20261011-S03 | Office québécois de la langue française, [haricot rouge, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296958/haricot-rouge), preferred term, English translation, and notes. | French haricot rouge, English red kidney bean, Phaseolus vulgaris; dark- and light-red kidney bean varieties. | Does not support broad red beans as an alias. |
| WP03-H-COMMONBEANS-20261011-S04 | RICARDO, [Classic Beef Chili](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili), ingredient list. | One 19 oz (540 ml) can of kidney beans, rinsed and drained. | No brand, drained mass, packing medium, or package yield. |
| WP03-H-COMMONBEANS-20261011-S05 | Health Canada, [Canadian Nutrient File serving portions, food code 7085](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=7085). | Kidney beans, canned, drained and rinsed: 125 ml = 83.5 g; 175 ml = 116.9 g; 250 ml = 166.9 g. | Portion weights for the exact listed state; not a can-yield record or evidence that 540 ml of can net contents is drained solids. |
| WP03-H-COMMONBEANS-20261011-S06 | Statistics Canada, [2026 Field Crop Survey — June, French](https://www.statcan.gc.ca/fr/programmes-statistiques/instrument/3401_Q2_V9), 2026 seeding crop list. | Separates dry cranberry beans from black, Great Northern, kidney, pinto, and Navy classes; lists faba beans/fava/gourgane separately. | Crop reporting nomenclature, not culinary forms, recipe measures, or substitution evidence. |
| WP03-H-COMMONBEANS-20261011-S07 | Canadian Food Inspection Agency, [Organic OGD extension codes for seeds and grains](https://inspection.canada.ca/en/food-labels/organic-products/import-requirements/organic-ogd-codes-seeds-amp-grains/new-ogd-extension-codes-organic-seeds-and-grai), bean grain codes. | Places cranberry bean in the packaged Phaseolus vulgaris grain grouping; separately identifies Lima/butter as Phaseolus lunatus and fava/horse bean as Vicia faba in organic crop codes. | Regulatory coding context; not a recipe-state taxonomy or alias instruction. |
| WP03-H-COMMONBEANS-20261011-S08 | Maturin, [Haribec — Haricots Cranberry (romano)](https://www.maturin.ca/index.php/produit/haribec/haricots-cranberry-romano/79/), product description. | Québec-producer product title and statement that cranberry/romano beans are also called Borlotti. | Product naming; does not establish generic measures, yields, or that romano alone is unambiguous. |
| WP03-H-COMMONBEANS-20261011-S09 | Aliments du Québec, [Les grains Haribec](https://alimentsduquebec.com/entreprises/les-grains-haribec), product list. | Québec supplier uses the product name “Haricots secs Cranberry.” | Product listing supports local wording, not a biological standard. |
| WP03-H-COMMONBEANS-20261011-S10 | Storehouse Foods, [Cranberry (Romano) Beans](https://storehousefoods.ca/products/romano-cranberry-beans), product name and description. | Canadian vendor calls the dry product cranberry/romano and identifies Borlotti as another name. | Vendor naming evidence only; keep Romano out of global aliases because it can name other bean products. |
| WP03-H-COMMONBEANS-20261011-S11 | Office québécois de la langue française, [haricot jaune, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296973/haricot-jaune), preferred terms and translations. | French plural haricots beurre; English wax bean and butter bean; species Phaseolus vulgaris. | Supports the competing wax-bean sense; does not equate wax beans with Lima beans. |
| WP03-H-COMMONBEANS-20261011-S12 | Walmart Canada, [Kasturi Gros Haricots de Lima / Haricots au Beurre](https://www.walmart.ca/fr/ip/Kasturi-Gros-Haricots-de-Lima-Haricots-au-Beurre-non-OGM-2-Lb/20PPQI48FFIT), product listing and ingredient declaration. | A Canadian retail seller also uses butter-bean wording for dried large Lima beans. | Product-specific retail naming, showing ambiguity rather than establishing a safe universal alias. |
| WP03-H-COMMONBEANS-20261011-S13 | Office québécois de la langue française, [flageolet, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083590/flageolet), definition, preferred terms, and translations. | French flageolet / haricot flageolet, English flageolet / flageolet bean, Phaseolus vulgaris; seed is pale green and eaten as grain. | Does not establish a recipe measure or justify European colloquial terms as Québec aliases. |
| WP03-H-COMMONBEANS-20261011-S14 | Office québécois de la langue française, [gourgane, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869159/gourgane), definition and translations. | Québec/Canada gourgane, Vicia faba, English broad bean / fava bean, plus qualified French fève des marais; notes some associated English names can refer to varieties not always matching gourgane. | Does not support unqualified French fève, féverole, or global equivalence for agricultural grades. |

Previously integrated bean sources remain in their current ledger records and proposals:

- Great Northern: proposal-local sources WP03-H-GN-20261011-S01–S08 in the [Great Northern review](wp03-great-northern-beans-quebec-identity-review-20261011.md).
- Cannellini: WP03-H-CANN-20261011-S01–S09 in the [Cannellini review](wp03-cannellini-beans-quebec-identity-review-20261011.md); its generic CNF white-bean source is not copied to Cannellini or any new active density.
- Navy: WP03-H-NAVY-20261011-S01–S06 in the [Navy review](wp03-navy-beans-quebec-identity-review-20261011.md).
- Pinto identity: existing ledger source WP03-H-S07, OQLF [haricot pinto](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083587/haricot-pinto). Package scope is in the [WP04 pinto can review](wp04-pinto-beans-package-count-basis-review-20261010.md).
- Black identity: existing ledger source WP03-H-S09-OQLF-BLACK-BEAN, OQLF [haricot noir](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350002/haricot-noir). Existing package record uses the [S&W 2016 product catalogue](https://swpremiumfood.com/wp-content/uploads/2017/02/SW-Catalogue_2016.pdf).
- Lima identity: existing ledger source WP03-H-S13-OQLF-LIMA-BEAN, OQLF [haricot de Lima](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296959/haricot-de-lima).
- Whole fava is distinct from the current fava-bean-flour ledger review and active reference.

## Plan integration recommendation and remaining gaps

After root integrates the proposed identity/form and ledger deltas:

- Keep the three existing checked subitems for Great Northern, Cannellini, and Navy unchanged.
- Check off the broader common-bean checklist only after generic white, kidney source/form handling, black, pinto alias review, cranberry, Lima/butter boundary, flageolet, and whole fava are represented as above.
- Keep candidate-fresh-shell-beans unresolved; this review does not support a global fresh-shell-bean identity.
- Keep unknowns explicit: no recipe demand for white, cranberry, Lima, flageolet, or fava; no generic bean densities or mappings; no kidney can drained yield; no pinto can size; no cross-bean substitution ratio.
- No test was run. This is a proposal-only review, and the updated repository rule excludes tests for database JSON additions.


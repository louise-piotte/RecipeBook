# WP03 Section M — mashed ripe banana form review

- **Reviewed:** 2026-10-11
- **Status:** recommendation integrated as one form and one exact recipe-line link. No reference identity, recipe text or quantity, measurement, conversion, yield, substitution, or code behavior changed.
- **Scope:** one existing banana reference, one exact mashed-ripe recipe line, and the Section M fruit-purée checklist. This does not review plantain ripeness or all commercial banana-purée products.

## Recommendation

Add one form under the existing ingredient-ref-banana: **mashed ripe bananas / purée de bananes mûres**, form code mashed_ripe, and link only recipe 073#10. The line already preserves the quantity, count unit, original wording, and bilingual preparation. The form would record that this recipe calls for ripe banana mashed before it is mixed into the batter.

This is a narrowly prepared fruit form, not a generic ripe or over-ripe maturity stage and not a separate identity for bottled or packaged banana purée. The Québec GDT result pairs purée de bananes mûres with English mashed ripe bananas; current Québec recipe guidance describes mashing bananas into purée for baking; and the linked publisher card names three very ripe bananas, mashed, for recipe 073. Those sources support the form and its bilingual label. They do not establish a maturity threshold, product composition for commercial purées, or a reusable measure.

Do not attach this form to recipe 001#3: that line calls for an over-ripe banana but does not separately name mashed banana as the ingredient. Keep very ripe, over-ripe, green/unripe banana, plantain maturity, and commercial banana-purée product scope otherwise unresolved. Add no new ingredient reference, alias, density, unit mapping, measurement, conversion, yield, recipe-text change, or substitution.

## Checklist location and prior-work reconciliation

The precise remaining checklist line is **Section M, “Juice, zest, peel, pulp, concentrate, purée, canned fruit in juice/syrup, jam, jelly, preserves, compote, and fruit butter as meaningful ingredients,”** at docs/RecipeBook-global-ingredient-catalog-plan.txt:2420–2421. Its nearby completed sub-items cover dried orange zest, citrus zest, and crushed pineapple at lines 2422–2433. The separate fruit qualifier line at 2434–2435 remains open. The generic fruit-stage line at 2384–2385 specifically names plantain ripeness and remains open; this proposal does not close it.

Prior decisions retained generic banana / banane, declined to infer ripeness forms, and left recipe 073#10 linked to the generic banana reference. The WP04 follow-up later rechecked that same row's count-to-mass question: its publisher source reports three very ripe mashed bananas as about 1 1/2 cups but gives no mass or weighing stage, so the measurement remains unresolved. This proposal reuses that exact publisher source only for the **mashed ripe form** and changes no measurement decision.

Other nearby fruit work stays with its existing owners:

- docs/catalog/proposals/wp02-section-d-fruit-product-boundary-review-20261010.md and its integration record cover the separate strawberry-purée identity and recipe 051#12's reduced preparation. They do not cover banana.
- The current package already carries ingredient-form-pineapple-crushed on 053#14, the pitted date/cherry forms on their exact lines, citrus-zest references, and distinct juice/jam/maraschino-cherry-juice identities. This packet does not reopen them.
- docs/catalog/proposals/wp03-section-m-open-fruit-followup-20261009.md treated banana and plantain as existing identities and deferred maturity forms; it did not have the later OQLF ripe-banana-purée term evidence used here. Its generic plantain-ripeness hold is unchanged.
- docs/catalog/proposals/wp04-residual-produce-counts-review-20261010.md, docs/catalog/proposals/wp04-wp12-produce-count-edible-portion-gap-review-20261010.md, and docs/catalog/proposals/wp04-next-banana-mashed-portion-gap-review-20261011.md address count/portion evidence, not catalog form identity.

## Live catalog, ledger, and collision audit

The read-only snapshot below was taken on 2026-10-11 during this review. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | SHA-256 |
|---|---:|---|
| ingredient-references.v1.json | 1,024 references | 518d35b5e01a9d731b39f0c008ff69d4afd6c2f20bc1c3b3cbeb7ba027eeed1c |
| ingredient-forms.v1.json | 70 forms | dacdc08a7735bb4426a444a6295cb11f7d92809a3153b76659250410a31d16ed |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 recipes; 1,123 ingredient rows | cde6bca6e7bd3b4e423eed903bd1680c2b869721fc59b283c4ed2a314c4584d8 |
| docs/catalog/research-ledger.v1.json | 1,313 records; 4,250 source entries; 3,488 distinct source IDs | a9437741c1f416e0c8f885092b49e2ff9d6117bf06671323549cb834f7147f9a |
| docs/catalog/legacy-import-identities.v1.json | 75 candidates | e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0 |

The active ingredient-ref-banana is a FRUIT reference named banana / banane, with only the French plural alias bananes, defaultDensity null, and no unit mappings. No existing form points to banana or plantain. The banana ledger record is verified for identity and blocked_pending_evidence for measurement; it already contains the generic OQLF banana evidence and the WP04 publisher/CNF count review. The legacy candidate file has no banana-purée candidate. A separate ledger candidate for East African highland cooking bananas remains a regional crop/prepared-staple boundary and is unrelated to this form.

The candidate ID ingredient-form-banana-mashed-ripe was absent from active references, forms, ledger record IDs, recipe form links, and legacy candidates. Exact normalized display/alias checks using the app's lowercase, NFKD/accent-folding, punctuation-to-space, and whitespace-collapsing search key found no current owner for purée de bananes mûres, mashed ripe bananas, bananes mûres écrasées, or very ripe bananas, mashed.

The broad banana query already covers the generic banana, banana-blossom, green-banana-flour, and green-plantain-flour entries, plus plantain banana by its English display. The full mashed-ripe phrase remains distinct. The active strawberry-purée and chestnut-purée identities remain separate full-phrase matches; neither owns the proposed banana phrase. Generic searches for purée or banana are intentionally broader and are not proposed as aliases.

## Exact recipe-row audit

All 114 manifest-listed recipes and 1,123 ingredient rows were searched across originalText, ingredientName, ingredientRefId, preparation, notes, and any form link. Direct banana and adjacent fruit-purée demand is:

| Row | Exact stored wording and qualifiers | Current link | Disposition |
|---|---|---|---|
| 001#3 | 1/2 large over-ripe banana; preparation over-ripe / très mûr; note says more brown spots mean sweeter | ingredient-ref-banana | Retain the existing row with no new form. Its line is an over-ripe whole-fruit request, and the linked source says all base ingredients are blended into the oats; it does not make this row a separately supplied mashed-banana ingredient. |
| 001#11 | extra banana slices on top (optional) | ingredient-ref-banana | Retain. Sliced topping is not demand for mashed ripe banana. |
| 073#10 | 3 bananas, mashed; preparation very ripe, mashed / très mûr, écrasé; stored amount 3, unit count | ingredient-ref-banana | **Proposed exact form link.** The linked publisher card says 3 very ripe bananas mashed (1 1/2 cups). Preserve the stored count and preparation; do not use the published volume as a conversion. |
| 051#12 | 1/2 cup reduced strawberry puree | ingredient-ref-strawberry-puree | Existing separate purée identity and reduced preparation. No banana or generic-purée relink. |
| 053#14 | 1 cup crushed pineapple, drained | ingredient-ref-pineapple; ingredient-form-pineapple-crushed | Crushed-pineapple form already integrated; no change. |
| 010#10 | 120 ml raspberry jam | ingredient-ref-raspberry-jam | Existing named preserve identity; no change. |
| 028#5, 067#6 | maraschino cherry juice | ingredient-ref-jus-du-pot-de-cerises-au-marasquin | Existing, distinct product identity; no change. |
| 007#5 | 5 g vinegar or lime juice | Unlinked | Mixed alternative does not establish an independent juice line; no change. |
| 111#5 | grouped fresh aromatics “and/or citrus zest” | Unlinked | Optional grouped note without a separate quantity or ingredient row; no new link. |

The wider scan also found the already reviewed lemon/lime juice and zest rows, pitted dates/cherries, canned diced tomatoes, fruit jam, dried fruit, and freeze-dried berries. No other bundled line names commercial banana purée. The relevant current fruit-product decisions are therefore distinguishable from this one-line mashed-banana form.

## Source evidence and limits

Sources were opened or searched on 2026-10-11. The exact publisher source for 073#10 is already recorded in the banana ledger record as WP04-NEXT-BANANA-MASHED-20261011-S01; it is reused rather than assigned a new identifier.

| Source ID | Source and support | Limit |
|---|---|---|
| WP03-M-BANANA-MASHED-PUREE-20261011-S01 | OQLF, [purée de bananes mûres (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18993648/puree-de-bananes-mures). The indexed GDT result gives the exact French term, English equivalent mashed ripe bananas, and food/processed-fruit domain. | The direct page fetch returned a cache-miss error; this review relies on the indexed entry fields for the term. It is terminology evidence, not a composition, maturity-threshold, or measurement standard. |
| WP03-M-BANANA-MASHED-PUREE-20261011-S02 | Recettes du Québec, [La banane](https://www.recettes.qc.ca/dossiers/thematiques-culinaires/dossier/la-banane). The French-language Québec cooking page says bananas are usually reduced to purée and incorporated into cookies, cakes, and muffins; it also uses bananes écrasées and discusses slightly over-ripe fruit. | Local culinary vocabulary and use only. Its approximate banana-volume note is not adopted as a general conversion; different recipes publish different fruit-to-volume amounts. |
| WP04-NEXT-BANANA-MASHED-20261011-S01 (existing ledger ID) | Preppy Kitchen, [Chocolate Chip Banana Bread](https://preppykitchen.com/chocolate-chip-banana-bread/), updated 2023-08-06. Its live recipe card names 3 very ripe bananas mashed (1 1/2 cups); the method mixes the mash into the batter. This directly corroborates bundled row 073#10. | The publisher reports volume but no mass or weighing stage. It does not establish a count conversion, density, or equivalence to commercial purée. |
| WP03-M-BANANA-MASHED-PUREE-20261011-S03 | Monin Canada, [Banana Purée](https://monin.ca/products/banana-fruit-puree). The Canadian product page identifies a commercial banana-purée product and lists sugar, banana purée, water, natural flavours, citric acid, and colour. | One brand and formulation only. It shows why a named commercial product cannot automatically be treated as the recipe's plain mashed bananas; it does not define all commercial banana purées. |

### No numeric behavior

The linked publisher's 1 1/2 cups is one recipe-specific volume for three very ripe bananas. Recettes du Québec gives a different rough banana-to-volume note, reinforcing that these are source-specific recipe quantities. Health Canada's generic raw mashed-banana portions do not qualify the ripe state or the publisher's measuring/weighing protocol; the WP04 ledger decision already leaves that gap unresolved. Record no portion observation, count or cup mapping, density, conversion, or yield from this form review.

## Proposed data snippets

These snippets are integration-ready proposals only. French text is escaped as it should appear in bundled database JSON.

### Form addition

~~~json
{
  "id": "ingredient-form-banana-mashed-ripe",
  "ingredientRefId": "ingredient-ref-banana",
  "formCode": "mashed_ripe",
  "labelFr": "pur\u00e9e de bananes m\u00fbres",
  "labelEn": "mashed ripe bananas",
  "prepState": "mashed",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Forme de bananes m\u00fbres \u00e9cras\u00e9es pour une recette, comme \u00e0 la ligne 073#10. Ne d\u00e9finit pas un seuil de maturit\u00e9 et ne d\u00e9signe pas une pur\u00e9e commerciale formul\u00e9e. Aucune mesure, densit\u00e9, conversion, relation de rendement ou substitution n\u2019est \u00e9tablie.",
  "notesEn": "Ripe bananas mashed for a recipe, as in line 073#10. This does not define a ripeness threshold or identify a formulated commercial puree. No measure, density, conversion, yield relationship, or substitution is established.",
  "updatedAt": "2026-10-11T00:00:00Z"
}
~~~

### Recipe row addition

Add only ingredientFormId to the existing row. Keep every other field, including the original text, quantity, unit, and bilingual preparation, as stored.

~~~json
{
  "id": "c5486a31-4047-4437-ad8b-14a6e776bdd5-ingredient-10",
  "originalText": "3 bananas, mashed",
  "ingredientName": "banana",
  "ingredientRefId": "ingredient-ref-banana",
  "ingredientFormId": "ingredient-form-banana-mashed-ripe",
  "quantity": 3,
  "unit": "count",
  "preparation": {
    "fr": "tr\u00e8s m\u00fbr, \u00e9cras\u00e9",
    "en": "very ripe, mashed"
  }
}
~~~

### Proposed form ledger record

Append this ingredient_form record if the form is accepted. The reused Preppy Kitchen source ID is already present in ingredient-ref-banana; repeated source use across related ledger records is intentional.

~~~json
{
  "recordId": "ingredient-form-banana-mashed-ripe",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-M-BANANA-MASHED-PUREE-20261011-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18993648/puree-de-bananes-mures",
      "title": "OQLF, pur\u00e9e de bananes m\u00fbres (GDT)",
      "accessedOn": "2026-10-11",
      "locator": "Indexed GDT term, English equivalent, and food/processed-fruit domain.",
      "supports": "The indexed GDT result pairs pur\u00e9e de bananes m\u00fbres with mashed ripe bananas. Terminology evidence only; the direct page fetch returned a cache-miss error, and no composition, maturity threshold, measure, or conversion is inferred.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-M-BANANA-MASHED-PUREE-20261011-S02",
      "url": "https://www.recettes.qc.ca/dossiers/thematiques-culinaires/dossier/la-banane-51",
      "title": "Recettes du Qu\u00e9bec, La banane",
      "accessedOn": "2026-10-11",
      "locator": "French culinary-use discussion of banana pur\u00e9e and bananes \u00e9cras\u00e9es in baking.",
      "supports": "Qu\u00e9bec culinary-language evidence that bananas are commonly mashed into pur\u00e9e for baking. The page's rough volume note is not imported as a general measure.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP04-NEXT-BANANA-MASHED-20261011-S01",
      "url": "https://preppykitchen.com/chocolate-chip-banana-bread/",
      "title": "Preppy Kitchen, Chocolate Chip Banana Bread",
      "accessedOn": "2026-10-11",
      "versionOrDate": "2023-08-06",
      "locator": "Live recipe card ingredient list and instructions.",
      "supports": "Lists three very ripe bananas mashed as 1 1/2 cups and mixes them into the batter; directly matches bundled recipe 073#10. No banana mass or weighing stage is given.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-M-BANANA-MASHED-PUREE-20261011-S03",
      "url": "https://monin.ca/products/banana-fruit-puree",
      "title": "Monin Canada, Banana Pur\u00e9e",
      "accessedOn": "2026-10-11",
      "locator": "Product description and ingredient list.",
      "supports": "One current Canadian commercial product lists sugar, banana pur\u00e9e, water, natural flavours, citric acid, and colour. This supports keeping formulated commercial product wording outside the recipe's plain mashed-banana form; it does not classify all banana-pur\u00e9e products.",
      "sourceKind": "manufacturer"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add only a mashed-ripe-banana form under the existing banana identity and link it to exact recipe 073#10. This records the source-defined mashed fruit preparation, not a generic ripe/over-ripe stage or a formulated commercial banana-puree product. Preserve the stored recipe text, count, unit, and preparation. Add no measure, conversion, density, yield, or substitution.",
      "sourceIds": [
        "WP03-M-BANANA-MASHED-PUREE-20261011-S01",
        "WP03-M-BANANA-MASHED-PUREE-20261011-S02",
        "WP04-NEXT-BANANA-MASHED-20261011-S01",
        "WP03-M-BANANA-MASHED-PUREE-20261011-S03"
      ]
    }
  ]
}
~~~

The existing ingredient-ref-banana record retains its current measurement state and decisions. Its blocked_pending_evidence state still applies to count-to-mass evidence; this form record adds no numeric observation. No candidate, form, or recipe text outside this exact scope is proposed.

## Encoding and scope limits

The proposal file is UTF-8 without BOM, with escaped French text in all proposed database JSON snippets. It does not claim that this form closes Section M's broader fruit-products sweep, validates a commercial banana-purée class, resolves banana or plantain maturity taxonomy, or supplies a recipe conversion.

## Coordinator integration

Added `ingredient-form-banana-mashed-ripe` under `ingredient-ref-banana` and linked only recipe
073#10. The authored line, count of 3, unit `count`, and bilingual `very ripe, mashed` preparation
are preserved. Recipe 001#3 remains without a form; the commercial Monin product remains outside the
plain mashed-fruit form. Reused the existing Preppy Kitchen source ID and added a verified form
ledger record with the Québec terminology, culinary-language, and product-boundary sources. Package,
ledger, reference-normalization, and generated-index validation passed; no tests were run because
this change only adds database JSON data under `AGENTS.md`. See the batch README for current counts
and fingerprints.

# WP03 Section L R137 — Habanero pepper identity review — 2026-10-15

- **Disposition:** propose a new `VEGETABLE_AND_AROMATIC` identity, **habanero pepper / piment habanero**, with narrow crop-qualified plural aliases. Add one fresh form and one whole-dehydrated form. Keep the separately marketed `piment antillais` wording out of aliases pending a clearer scope decision.
- **Quantity disposition:** record the current Québec retailer quantities as source context only. Metro's 40 g and Walmart's 60 g are product/package quantities; Mayrand's approximately 0.2 kg is one retailer purchase unit whose pepper count and weighing basis are unstated. Add no portion, per-pepper weight, reusable count mapping, density, or unit mapping.
- **Recipe and substitution disposition:** no matching bundled recipe demand and no general substitute or exchange ratio supported by the reviewed sources. Add no recipe link, recipe-line substitution, conversion, yield, or active substitution rule.
- **Scope:** resolves the unfinished fresh Habanero identity in the Section L pepper checklist. It does not assign a species, cultivar, fixed color, or heat value; model powder, paste, or sauce products; or generalize terms from a particular product.

## Checklist and prior-work context

The active plan still lists Habanero in the unfinished bell-pepper/fresh-chile group at [WP03 Section L](../../RecipeBook-global-ingredient-catalog-plan.txt#L4472). R136 integrated fresh-market Poblano and its fresh form, while leaving whole-dried Ancho structure unresolved; this proposal adds neither Ancho wording nor a Poblano relationship. The adjacent Section L checklist and the latest R136 record remain unchanged.

Earlier WP06 Andean work kept `ají habanero` out of ají Amarillo/Panca aliases because a SENASA export roster grouped it with other shipping names. That decision remains correct for that roster: this proposal relies on the separate OQLF Habanero entry and current Canadian Habanero retail products, and does not treat `ají habanero` as an alias or trade crosswalk. The active [Scotch Bonnet pepper](../../catalog/batches/wp06-caribbean-identities-integration-20261011/README.md) also remains a distinct identity. A Habanero product or ingredient is not thereby a Scotch Bonnet.

The project calls for bilingual searchable ingredient references, aliases, and separately modeled forms in [Requirements.md, IngredientReference and IngredientForm](../../../Requirements.md#L85). The narrow names below use the OQLF-preferred French term and current Canadian product wording; the proposal does not add general pepper or chile aliases.

## Ownership and corpus audit

The live package snapshot reviewed for this proposal contains 1,490 ingredient references and 110 forms; the legacy-import file contains 61 candidates. An exact normalized-name audit of active references and forms found no owner for `habanero pepper`, `habanero peppers`, `habanero`, `habaneros`, `piment habanero`, `piments habanero`, `piments habaneros`, `piment antillais`, or the proposed fresh/dried form labels. The legacy file has no Habanero mention or identity. Historical ledger mentions include the prior SENASA grouping, the pimenta-de-cheiro boundary, and Habanero listed as an ingredient in separate sauce products; none owns the proposed fresh Habanero identity. The proposed reference/form IDs and the R137 source-ID prefix are unused.

Every recipe path in the current bundled-library manifest was scanned through all string fields and ingredient rows for Habanero spellings, `piment antillais`, and Scotch Bonnet. The result was **zero matching strings and zero matching ingredient rows across 114 recipes / 1,123 ingredient rows**. No recipe line, source-specific recipe choice, substitution, or conversion is proposed.

## Names, aliases, and picker boundary

Use the canonical pair **`habanero pepper` / `piment habanero`**. OQLF lists those terms and its definition covers fresh, grilled, and dried uses. Metro's current French and English listings use `Piments habanero` / `Habanero Peppers` for the same product number 685750000151; Mayrand uses the Québec product title `Piments habanero`. These retailer listings corroborate the OQLF wording, not a botanical claim about every Habanero sold under the name.

Add only:

- French alias `habaneros`, the OQLF-listed plural noun.
- English alias `habanero peppers`, matching the Metro and Walmart product wording.

Do not add a redundant singular `habanero` alias: the canonical full phrases already match that single-word query under the current picker. Do not add `piments habanero` or `piments habaneros`, even though Québec listings use those product titles. In the current picker, either phrase would also make the bare `piments` query return this one identity; `piments` currently has no result. Canonical `piment habanero` and the qualified `habaneros` alias keep French searches useful without turning the bare plural into a Habanero-specific result.

OQLF also lists `piment antillais` on the Habanero entry. Keep it out of the proposed aliases for now: Metro and Mayrand label the specific retail item Habanero, while a Canadian pepper source uses `piment antillais` as a regional pepper term akin to both Habanero and Scotch Bonnet. This source does not establish a one-to-one synonym, and the catalog already has a separate Scotch Bonnet identity. Do not add `Scotch Bonnet`, `goat pepper`, `Jamaican pepper`, `hot pepper`, `piment fort`, generic `piment(s)` / `pepper(s)`, a color, a heat rating, or a Latin name as a Habanero alias. OQLF discourages writing Habanero with an ñ; the proposed spelling is `habanero`.

The current `IngredientReferenceSearchIndex` normalizes accents and punctuation, tries full word phrases before substring fallback, includes form labels and terms in reference search, and supplies a form hint only for an exact complete form term. A static projection against the live catalog produced:

| Query | Before | Proposed | Effect |
|---|---:|---:|---|
| `habanero pepper`, `piment habanero`, `habanero` | 0 | 1 | One Habanero result |
| `habaneros`, `habanero peppers` | 0 | 1 | One Habanero result through the qualified aliases |
| `fresh habanero pepper`, `piment habanero frais` | 0 | 1 | Habanero with the fresh-form hint |
| `dried habanero pepper`, `whole dried habanero pepper`, `piment habanero séché`, `piment habanero entier séché` | 0 | 1 | Habanero with the whole-dehydrated-form hint |
| `piments`, `piments habanero(s)`, `piment antillais`, `piments antillais` | 0 | 0 | No broad-plural or unresolved regional alias added |
| `pepper`, `peppers`, `piment` | 22 / 2 / 17 | 23 / 3 / 18 | Expected broad results grow by the named Habanero identity; each remains a multi-result search |
| `piment fort` / `poivron` | 2 / 1 | 2 / 1 | No unrelated broad-term collision |
| `Scotch Bonnet pepper` / `piment Scotch Bonnet` | 2 / 1 | 2 / 1 | Existing fresh-pepper and sauce results are unchanged |

These broad-query counts were recomputed against the 1,490-reference R136 catalog snapshot and the exact proposed Habanero row/forms. This is a static projection of the current Kotlin search rules, not an app test or a claim that the picker has been run against a modified package.

## Forms, quantities, and substitutions

Add two forms beneath the same named Habanero identity:

1. **Fresh** — Metro, Walmart, and Mayrand describe fresh Habanero produce; use `fresh` / `frais` as an explicit form hint.
2. **Whole dehydrated** — OQLF says Habanero is consumed dried, and current Canadian listings sell dried whole Habanero pepper pods/peppers under the Habanero name. Use `whole_dehydrated` / `dry`. Do not add `Red Caribbean`, a product brand, or color as an alias. The French form label is a transparent rendering of OQLF's `piment habanero` plus the documented process; the reviewed Canadian whole-dried product titles are English-only.

OQLF also mentions grilled use, but grilling is a cooking method, not a distinct ingredient form for this catalog. No powder, paste, sauce, preserved, or other prepared product form is added in this focused review.

The numeric product data do not support a reusable conversion:

- Metro's bilingual item 685750000151 displays 40 g. It was out of stock in the indexed result; this is a product listing/package quantity, not mass per pepper. The French and English pages are the same item.
- Walmart's bilingual product mirror/SKU 6000207537837 is titled 60 g. Its English page describes fresh hot peppers; the French 60 g page is an indexed mirror of the same SKU. This is a product/package quantity, not a per-pepper weight or an independent second product.
- Mayrand product 04710 says `unité (env. 0.2 kg)` and prices the unit by weight. The listing title is plural and does not state how many peppers comprise one purchase unit or how that estimate is derived. Preserve this as a retailer-specific purchase-unit statement in the source register only; do not interpret it as one pepper or a count weight.
- The dried whole product source gives a 2.2 lb case/package. That is a package size, not a pepper portion or whole-pod count.

No reviewed source supplies density, volume-to-mass behavior, portion size, a count mapping, a cooking yield, or a reusable unit conversion. Set measurement research to `researched_no_supported_value`; keep density and mappings null/empty and omit measurement observations.

The reviewed OQLF and retail sources contain usage descriptions but no Habanero replacement instruction or exchange ratio. Scotch Bonnet's separate identity, shared heat language, or a regional term is not substitution evidence. Set substitution research to `researched_no_supported_substitute`; add no global or contextual rule.

## Source register

| Source ID | Source and access | Evidence used and limits |
|---|---|---|
| `WP03-L-HABANERO-20261015-R137-S01` | Office québécois de la langue française, [piment habanero (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18049253/piment-habanero); opened directly; entry last updated 2023. | Gives French `piment habanero`, `habanero`, and `piment antillais`; English `habanero pepper` / `habanero`; plural `habaneros` and `piments habaneros`; says the pepper is consumed fresh, grilled, or dried; discourages the ñ spelling. Supports terminology and the fresh/dried food states, not a universal form conversion or a broader species claim. |
| `WP03-L-HABANERO-20261015-R137-S02` | Metro Québec, [Piments habanero, product 685750000151](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piments-habanero/p/685750000151); current search-indexed listing, crawled within the week; direct open returned HTTP 403. | French title `Piments habanero`, ingredient name `Piment habanero`, produce listing, and displayed 40 g / out-of-stock status. The displayed mass is not per pepper. |
| `WP03-L-HABANERO-20261015-R137-S03` | Metro, [Habanero Peppers, product 685750000151](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/habanero-peppers/p/685750000151); current search-indexed listing, crawled within the month; direct open returned HTTP 403. | English plural retail title and the same 40 g/product number as S02. This is the English mirror of the Metro product in S02, not a second weight observation. |
| `WP03-L-HABANERO-20261015-R137-S04` | Mayrand, [Piments habanero, product 04710](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/piment/piment-fort-habanero-04710); current French product page opened through Mayrand's live category listing. | Québec retail wording `Piments habanero`; one purchase unit shown as approximately 0.2 kg and priced by weight. The product page reported Brossard in stock at review time, with other stores marked coming soon. No pepper count, sampling method, or package contents are stated; not a per-pepper measurement. |
| `WP03-L-HABANERO-20261015-R137-S05` | Walmart Canada, [Peppers, Habanero, Your Fresh Market, 60 g](https://www.walmart.ca/en/ip/peppers-habanero-your-fresh-market/6000207537837); English page opened directly; current page defaulted to a Mississauga store. | Supports English Habanero plural wording, fresh hot-pepper description, refrigeration, and the 60 g package title. The package mass is not per pepper and the default store is not evidence of Québec stock. |
| `WP03-L-HABANERO-20261015-R137-S06` | Walmart Canada, [Piments habaneros Mon marché fraîcheur 60 g](https://www.walmart.ca/fr/ip/piments-habaneros-mon-march-fracheur/6000207537837?classType=REGULAR); current indexed page crawled within the week; direct open returned a cache miss. | French product title and 60 g package wording for the same SKU as S05. The index identifies it as fresh, but this is a localized mirror of S05, not an independent item or measurement. |
| `WP03-L-HABANERO-20261015-R137-S07` | Office québécois de la langue française, [piment Scotch Bonnet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037054/piment-scotch-bonnet); opened directly; entry last updated 1987. | Separately names French `piment Scotch Bonnet` and English `Scotch Bonnet pepper`. This supports retaining the active Scotch Bonnet identity separately; it does not list Habanero as its alias. |
| `WP03-L-HABANERO-20261015-R137-S08` | Twelfth Fire, [Martinique pepper products](https://twelfthfire.ca/collections/martinique); current indexed page crawled within the month; direct open returned a cache miss. | A Canadian pepper source calls `piment antillais` a local pepper akin to both Scotch Bonnet and Habanero. Use only to show that this regional term is not a reliable one-to-one retail synonym here; it does not override OQLF's terminology entry or establish taxonomy. |
| `WP03-L-HABANERO-20261015-R137-S09` | Prime Restaurant Supply Wholesale, [Fiery Farms Red Caribbean Habanero Dried Whole Pepper Pods](https://www.restaurantsupplywholesale.ca/products/fiery-farms-red-caribbean-habanero-dried-whole-pepper-pods-2-2-lb); indexed within two days of review; direct open returned a cache miss. | Canadian wholesale listing names a dried whole Habanero product and describes use whole, ground, or rehydrated. The 2.2 lb value is a package size. `Red Caribbean` belongs to this product title only and is not generalized. |
| `WP03-L-HABANERO-20261015-R137-S10` | Granville Island Spice Co., [Dried Habanero Peppers](https://www.granvilleislandspiceco.com/collections/chile/products/habanerodriedpkg); indexed within the week; direct open returned a cache miss. | Canadian spice retailer listing independently names a dried Habanero product. The index does not provide enough detail to establish a size, process beyond dried, or any recipe/measurement behavior. |
## Exact proposed JSON delta

The following are additive objects only. The `piment antillais` question is recorded as unresolved in the ledger; it is intentionally absent from the alias arrays. The numeric retailer-unit and package values remain source notes and are not ledger measurement observations.

### Addition to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-habanero-pepper",
  "nameFr": "piment habanero",
  "nameEn": "habanero pepper",
  "aliasesFr": ["habaneros"],
  "aliasesEn": ["habanero peppers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Additions to `ingredient-forms.v1.json`

```json
[
  {
    "id": "ingredient-form-habanero-pepper-fresh",
    "ingredientRefId": "ingredient-ref-habanero-pepper",
    "formCode": "fresh",
    "labelFr": "piment habanero frais",
    "labelEn": "fresh habanero pepper",
    "prepState": "fresh",
    "matchTermsFr": [],
    "matchTermsEn": [],
    "densityGPerMl": null,
    "notesFr": "La pr\u00e9sentation fra\u00eeche est appuy\u00e9e par les fiches de produits frais du Qu\u00e9bec. Aucune mesure r\u00e9utilisable n'est ajout\u00e9e.",
    "notesEn": "The fresh presentation is supported by fresh-produce listings. No reusable measure is added.",
    "updatedAt": "2026-10-15T00:00:00Z"
  },
  {
    "id": "ingredient-form-habanero-pepper-whole-dehydrated",
    "ingredientRefId": "ingredient-ref-habanero-pepper",
    "formCode": "whole_dehydrated",
    "labelFr": "piment habanero entier s\u00e9ch\u00e9",
    "labelEn": "whole dried habanero pepper",
    "prepState": "dry",
    "matchTermsFr": ["piment habanero s\u00e9ch\u00e9"],
    "matchTermsEn": ["dried habanero pepper"],
    "densityGPerMl": null,
    "notesFr": "L'entr\u00e9e de l'OQLF mentionne la consommation s\u00e9ch\u00e9e; des fournisseurs canadiens listent des Habaneros entiers s\u00e9ch\u00e9s. Aucun produit rouge ou carib\u00e9en particulier n'est g\u00e9n\u00e9ralis\u00e9.",
    "notesEn": "The OQLF entry notes dried use, and Canadian sellers list whole dried Habanero products. No particular red or Caribbean product is generalized.",
    "updatedAt": "2026-10-15T00:00:00Z"
  }
]
```

### Addition to `research-ledger.v1.json` `records`

```json
{
  "recordId": "ingredient-ref-habanero-pepper",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18049253/piment-habanero",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, piment habanero (GDT)",
      "versionOrDate": "Last updated 2023; rechecked 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Preferred terms, English equivalents, plural forms, definition, and notes on fresh, grilled, and dried use.",
      "supports": "Supports piment habanero / habanero pepper, the plural habaneros, and the listed fresh/dried food states. It also lists piment antillais, whose alias scope is held unresolved here.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S02",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piments-habanero/p/685750000151",
      "title": "Metro Qu\u00e9bec, Piments habanero, product 685750000151",
      "versionOrDate": "Current search-indexed listing; direct open returned HTTP 403",
      "accessedOn": "2026-10-15",
      "locator": "French title and ingredient name, produce aisle listing, displayed 40 g, and stock status.",
      "supports": "Supports the current French retail wording Piments habanero / Piment habanero. The 40 g quantity is a product/package listing, not a pepper weight.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S03",
      "url": "https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/habanero-peppers/p/685750000151",
      "title": "Metro, Habanero Peppers, product 685750000151",
      "versionOrDate": "Current search-indexed listing; direct open returned HTTP 403",
      "accessedOn": "2026-10-15",
      "locator": "English title, displayed 40 g, and product number matching the French Metro page.",
      "supports": "Supports the English plural retail wording Habanero Peppers. This is the same product as S02, not a second item or weight observation.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S04",
      "url": "https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/piment/piment-fort-habanero-04710",
      "title": "Mayrand, Piments habanero, product 04710",
      "versionOrDate": "Current French product page opened from the live Mayrand category listing",
      "accessedOn": "2026-10-15",
      "locator": "Product title, unit text approx. 0.2 kg, price-per-weight text, and store stock status.",
      "supports": "Supports Québec product wording and a retailer-specific approximate purchase-unit quantity. The page does not state how many peppers make the unit or how its mass is derived; do not treat it as one pepper or a general count weight.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S05",
      "url": "https://www.walmart.ca/en/ip/peppers-habanero-your-fresh-market/6000207537837",
      "title": "Walmart Canada, Peppers, Habanero, Your Fresh Market, 60 g",
      "versionOrDate": "Current product page; default store was Mississauga",
      "accessedOn": "2026-10-15",
      "locator": "Product title, fresh hot-pepper description, storage instructions, and SKU.",
      "supports": "Supports current Canadian English product wording and a fresh retail product. The 60 g is a package quantity and not a per-pepper measure or evidence of Quebec store stock.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S06",
      "url": "https://www.walmart.ca/fr/ip/piments-habaneros-mon-march-fracheur/6000207537837?classType=REGULAR",
      "title": "Walmart Canada, Piments habaneros Mon march\u00e9 fra\u00eecheur 60 g",
      "versionOrDate": "Current indexed French page; direct open returned a cache miss",
      "accessedOn": "2026-10-15",
      "locator": "French product title, fresh-pepper description, and 60 g package size for SKU 6000207537837.",
      "supports": "Supports a French plural market title. This is the localized mirror of S05, not an independent product or package-weight observation.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S07",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037054/piment-scotch-bonnet",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, piment Scotch Bonnet (GDT)",
      "versionOrDate": "Last updated 1987; rechecked 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Preferred French term and English translation.",
      "supports": "Confirms a separately named piment Scotch Bonnet / Scotch Bonnet pepper; it does not list Habanero as an alias.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S08",
      "url": "https://twelfthfire.ca/collections/martinique",
      "title": "Twelfth Fire, Martinique pepper products",
      "versionOrDate": "Current indexed page; direct open returned a cache miss",
      "accessedOn": "2026-10-15",
      "locator": "Regional product-language description of piment antillais.",
      "supports": "Uses piment antillais as a regional pepper term akin to both Habanero and Scotch Bonnet. This source does not establish a one-to-one synonym.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S09",
      "url": "https://www.restaurantsupplywholesale.ca/products/fiery-farms-red-caribbean-habanero-dried-whole-pepper-pods-2-2-lb",
      "title": "Prime Restaurant Supply Wholesale, Fiery Farms Red Caribbean Habanero Dried Whole Pepper Pods",
      "versionOrDate": "Current indexed Canadian wholesale listing; direct open returned a cache miss",
      "accessedOn": "2026-10-15",
      "locator": "Product title, whole-dried product description, package size, and use description.",
      "supports": "Supports the existence of a whole-dried product sold under the Habanero name. The 2.2 lb is a package size; Red Caribbean is product-specific wording and is not generalized.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HABANERO-20261015-R137-S10",
      "url": "https://www.granvilleislandspiceco.com/collections/chile/products/habanerodriedpkg",
      "title": "Granville Island Spice Co., Dried Habanero Peppers",
      "versionOrDate": "Current indexed Canadian retailer page; direct open returned a cache miss",
      "accessedOn": "2026-10-15",
      "locator": "Product title.",
      "supports": "Independently supports a dried Habanero retail presentation; no size, processing detail, or conversion is adopted.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "habanero-pepper-general-substitution-review-20261015",
      "researchState": "researched_no_supported_substitute",
      "fromIngredientRefId": "ingredient-ref-habanero-pepper",
      "context": "General substitution review for fresh or whole-dried Habanero pepper.",
      "basis": "The reviewed terminology and retail sources identify Habanero products but do not give a replacement instruction or exchange ratio. Related heat language and piment antillais wording are not general substitution evidence.",
      "limitations": [
        "Do not map Habanero to Scotch Bonnet or another hot pepper as a global synonym or substitution.",
        "No active global or contextual substitution rule is proposed."
      ],
      "sourceIds": [
        "WP03-L-HABANERO-20261015-R137-S01",
        "WP03-L-HABANERO-20261015-R137-S02",
        "WP03-L-HABANERO-20261015-R137-S04",
        "WP03-L-HABANERO-20261015-R137-S07",
        "WP03-L-HABANERO-20261015-R137-S08",
        "WP03-L-HABANERO-20261015-R137-S09"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add the named Habanero pepper / piment habanero identity with only the OQLF plural habaneros and current product-qualified English plural habanero peppers. Do not infer a species, cultivar, color, or fixed heat level.",
      "sourceIds": [
        "WP03-L-HABANERO-20261015-R137-S01",
        "WP03-L-HABANERO-20261015-R137-S02",
        "WP03-L-HABANERO-20261015-R137-S03",
        "WP03-L-HABANERO-20261015-R137-S05",
        "WP03-L-HABANERO-20261015-R137-S06"
      ]
    },
    {
      "outcome": "accepted",
      "reason": "Add fresh and whole-dehydrated forms under the same Habanero identity, supported by the OQLF use description and current Canadian fresh and whole-dried product listings. Keep powder, paste, sauce, and grilled preparation outside this proposal.",
      "sourceIds": [
        "WP03-L-HABANERO-20261015-R137-S01",
        "WP03-L-HABANERO-20261015-R137-S02",
        "WP03-L-HABANERO-20261015-R137-S04",
        "WP03-L-HABANERO-20261015-R137-S05",
        "WP03-L-HABANERO-20261015-R137-S06",
        "WP03-L-HABANERO-20261015-R137-S09",
        "WP03-L-HABANERO-20261015-R137-S10"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "OQLF lists piment antillais on the Habanero entry, but the current Canadian source uses this regional term as akin to both Habanero and Scotch Bonnet, while current Québec retail labels use Habanero. Keep the alias out until its intended one-to-one picker scope is independently resolved.",
      "sourceIds": [
        "WP03-L-HABANERO-20261015-R137-S01",
        "WP03-L-HABANERO-20261015-R137-S07",
        "WP03-L-HABANERO-20261015-R137-S08"
      ]
    },
    {
      "outcome": "accepted",
      "reason": "Mayrand's approximately 0.2 kg purchase unit and Metro/Walmart package masses do not establish pepper count, per-pepper mass, portion size, density, or a reusable unit mapping. Add no measurement observation or conversion.",
      "sourceIds": [
        "WP03-L-HABANERO-20261015-R137-S02",
        "WP03-L-HABANERO-20261015-R137-S03",
        "WP03-L-HABANERO-20261015-R137-S04",
        "WP03-L-HABANERO-20261015-R137-S05",
        "WP03-L-HABANERO-20261015-R137-S06",
        "WP03-L-HABANERO-20261015-R137-S09"
      ]
    },
    {
      "outcome": "accepted",
      "reason": "The reviewed sources provide no general replacement instruction or exchange ratio. Add no active substitution rule or recipe-line link.",
      "sourceIds": [
        "WP03-L-HABANERO-20261015-R137-S01",
        "WP03-L-HABANERO-20261015-R137-S02",
        "WP03-L-HABANERO-20261015-R137-S04",
        "WP03-L-HABANERO-20261015-R137-S07",
        "WP03-L-HABANERO-20261015-R137-S08",
        "WP03-L-HABANERO-20261015-R137-S09"
      ]
    }
  ]
}
```

## Audit notes

- Source IDs are unique within the checked live ledger and use a new R137 prefix.
- Proposed catalog IDs do not appear in the current references, forms, legacy candidates, or ledger.
- The static picker projection described above is based on the present `IngredientReferenceSearchIndex` rules and the exact proposed names/form terms. No app, Gradle, unit, instrumentation, emulator, or deployment test was run; this file is a proposal document and does not change database JSON.
- No shared catalog, ledger, plan, roadmap, generated index, or batch README was edited.

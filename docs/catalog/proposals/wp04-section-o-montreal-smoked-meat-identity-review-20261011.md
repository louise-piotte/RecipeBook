# WP04 Section O Montréal smoked meat identity review — 2026-10-11

- **Packet type:** proposal-only research. No shared seed JSON, ledger, recipe, code, test, plan, roadmap, or existing proposal was changed.
- **Scope:** the open Section O `smoked meat` item, its Québec French naming, product boundary, and nearby catalog identities.
- **Disposition:** add one narrowly named PROTEIN identity for Montréal smoked meat. Keep generic smoked or cured meat, pastrami, corned beef, and other named preserved meats separate. Add no recipe links, forms, measures, yields, conversions, or substitutions.
- **Pre-integration audit snapshot:** Rechecked 2026-10-11 after the anchovy batch and before this integration: 1,011 active ingredient references; 66 forms; 75 legacy-import candidates; 1,292 ledger records; 114 manifest-listed recipes and 1,123 ingredient rows.
- **Proposed source IDs:** `WP04-MSM-20261011-S01` through `WP04-MSM-20261011-S06`; no duplicate source ID was found in the ledger.

## Catalog, ledger, and recipe audit

In the pre-integration snapshot, exact normalized-key checks used the project search-key normalizer across active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. At that time there was no exact active, form, or legacy owner for `smoked meat`, `smoked-meat`, `Montreal smoked meat`, `Montreal-style smoked meat`, `viande fumée`, `viande fumée de Montréal`, `viande fumée style Montréal`, `smoked brisket`, `smoked beef`, `pastrami`, or `corned beef`; the proposed ID `ingredient-ref-montreal-smoked-meat` was unused. The ledger then had no smoked-meat record or candidate. This proposal was integrated in `docs/catalog/batches/wp04-section-o-montreal-smoked-meat-integration-20261011/README.md`.

Nearby active records are distinct products or ingredients: `ingredient-ref-ham` (ham / jambon), `ingredient-ref-bacon`, `ingredient-ref-pancetta`, `ingredient-ref-guanciale`, and `ingredient-ref-prosciutto`; `ingredient-ref-charqui` and `ingredient-ref-peruvian-amazonian-cecina` are source-scoped dried-meat identities. `ingredient-ref-liquid-smoke`, `ingredient-ref-smoked-paprika`, and `ingredient-ref-smoked-salt` are smoke flavour, spice, and salt ingredients, not meat products. The ledger's unresolved `ingredient-ref-salt-pork` and `ingredient-ref-jamon` candidates remain separate and do not supply smoked-meat aliases. No exact-name or alias collision was found.

The manifest-listed recipe corpus contains no matching text or ingredient row for Montréal smoked meat, generic smoked meat, pastrami, corned beef, or the French product labels reviewed here. The existing liquid-smoke row in recipe 105 and smoked-paprika rows in recipes 018 and 074 are separate ingredient requests. No recipe relink or recipe-text correction is proposed.

## Identity boundary and naming

The OQLF GDT entry defines `smoked meat` as beef brisket prepared by curing/salting, seasoning, cooking, and smoking, and identifies it as a Montréal specialty. It lists **smoked meat** and **smoked-meat** as the preferred French terms; it says an earlier attempt to establish *bœuf mariné* did not take hold. This supports a culturally specific product identity and makes `smoked meat` the Québec French display name. To keep the English display explicit about scope, use `Montreal smoked meat`.

Current Metro Québec listings corroborate French retail labels `viande fumée de Montréal` and `viande fumée style Montréal`. They are suitable source-attested aliases for this qualified identity, not replacements for the OQLF-preferred French display. The OQLF hyphenated spelling `smoked-meat` needs no separate alias because the project normalizer maps it to the same key as `smoked meat`. Do not add the generic alias `viande fumée`, `bœuf mariné`, or `poitrine de bœuf fumée`: those terms do not independently identify the Montréal product.

Keep this identity distinct from:

- **Pastrami:** OQLF describes a New York beef product made through similar stages, but with different cuts, more seasoning, less fat, and less smoke than Montréal smoked meat. It is not an alias.
- **Corned beef:** CFIA's Volume 7 separately names a cooked-and-cured product made from coarsely cut, pre-cooked boneless beef. That standardized product name does not make it Montréal smoked meat.
- **Generic smoked/cured meat:** CFIA defines preserved meat broadly across salting, pickling, drying, curing, smoking, and other permitted treatment. Treatment words alone do not establish this regional identity. CFIA also distinguishes products smoked with smoke from products with directly added smoke flavour.
- **Other pork and dried-meat identities:** ham, bacon, pancetta, guanciale, prosciutto, charqui, and Peruvian Amazon cecina have their own source-defined product boundaries. Shared meat or smoke terminology does not establish synonymy or interchangeability.

The OQLF definition supports a cooked, smoked, seasoned beef-brisket product after salting/curing. It does not establish a particular brisket subcut, cure chemistry, spice formula, smoking method, fat grade, serving temperature, package state, or ready-to-eat label. Retail ingredient lists are product-specific and cannot supply general composition. Do not infer any of those properties, cooking or storage safety, or a recipe substitution.

## Proposed exact reference JSON

Add one reference with no density or unit mappings:

```json
{
  "id": "ingredient-ref-montreal-smoked-meat",
  "nameFr": "smoked meat",
  "nameEn": "Montreal smoked meat",
  "aliasesFr": [
    "viande fum\u00e9e de Montr\u00e9al",
    "viande fum\u00e9e style Montr\u00e9al"
  ],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "PROTEIN"
}
```

The OQLF's borrowed French display `smoked meat` is itself the exact English term; the search index uses names in both languages, so a duplicate English alias is unnecessary and the seed normalizer removes it. Keep the separate English display qualified to avoid presenting the regional identity as any smoked meat. Do not add aliases for `smoked beef`, `smoked brisket`, `smoked pork`, `smoked turkey`, pastrami, corned beef, ham, bacon, charqui, cecina, or generic `smoked meat` process phrases outside the OQLF-named product.

## Proposed exact ledger record

Add one verified identity record. Leave measurement and substitution research open because no supported density, yield, package conversion, or interchangeability follows from the identity sources.

```json
{
  "recordId": "ingredient-ref-montreal-smoked-meat",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-MSM-20261011-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369658/smoked-meat",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, smoked meat (GDT)",
      "versionOrDate": "2008",
      "accessedOn": "2026-10-11",
      "locator": "Definition, note, and preferred French terms",
      "supports": "Defines smoked meat as beef brisket prepared in salting, seasoned, cooked, and smoked; identifies it as a Montr\u00e9al specialty; gives smoked meat and smoked-meat as preferred French terms and says b\u0153uf marin\u00e9 did not take hold.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-MSM-20261011-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369657/pastrami",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, pastrami (GDT)",
      "versionOrDate": "2000",
      "accessedOn": "2026-10-11",
      "locator": "Definition and note comparing pastrami with smoked meat",
      "supports": "Defines pastrami using beef shoulder or round and distinguishes it from smoked meat by cut and relative seasoning, fat, and smoke. Supports separation, not a conversion or synonym.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-MSM-20261011-S03",
      "url": "https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7",
      "title": "Canadian Food Inspection Agency, Canadian Standards of Identity: Volume 7 \u2013 Meat Products",
      "versionOrDate": "Last amended 2024-12-18",
      "accessedOn": "2026-10-11",
      "locator": "Interpretation, definition of preserved, and Table 2, Part A, item 22 (Corned Beef)",
      "supports": "Defines preserved meat broadly and separately specifies corned beef as cooked and cured, with coarsely cut pre-cooked boneless beef among its mandatory ingredients. The consulted Table 2 has no named Montreal smoked meat common name; this is a comparison, not a claim about every Canadian label.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-MSM-20261011-S04",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products",
      "title": "Canadian Food Inspection Agency, Labelling requirements for meat and poultry products",
      "accessedOn": "2026-10-11",
      "locator": "Common name; Products to which smoke or smoke flavour was added",
      "supports": "Describes common-name treatment for meat products and distinguishes naturally smoked, smoked, and smoke flavour declarations. Supports avoiding an inferred smoke process or treating smoke flavour as a smoked-meat identity.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-MSM-20261011-S05",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/charcuteries-et-plats-prepares/charcuteries/saucissons-et-viandes-fumees/viande-fumee-de-montreal/p/180509450640",
      "title": "Metro Qu\u00e9bec, Viande fum\u00e9e de Montr\u00e9al, Delicatessen Originals",
      "accessedOn": "2026-10-11",
      "locator": "Product title and listed ingredients",
      "supports": "Current retailer product title uses viande fum\u00e9e de Montr\u00e9al. Its 200 g package and ingredient declaration are one brand-specific product listing, not general identity, state, or yield evidence.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-MSM-20261011-S06",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/charcuteries-et-plats-prepares/charcuteries/saucissons-et-viandes-fumees",
      "title": "Metro Qu\u00e9bec, Saucissons et viandes fum\u00e9es",
      "accessedOn": "2026-10-11",
      "locator": "Product category listings for Viande fum\u00e9e style Montr\u00e9al and extra-maigre variants",
      "supports": "Shows current Quebec retail use of viande fum\u00e9e style Montr\u00e9al, including extra-maigre product wording. Supports these exact label aliases only; the fat descriptor and package variants are not added as identity forms.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one identity-only PROTEIN reference for the source-defined Montr\u00e9al smoked-meat specialty. Use smoked meat as the Qu\u00e9bec French display per OQLF and Montreal smoked meat as the scoped English display; add current retailer-attested French Montreal product labels as aliases. The hyphenated OQLF spelling normalizes to the display key and needs no duplicate alias. Keep generic smoked/cured meat, pastrami, corned beef, pork cured meats, smoke ingredients, charqui, and cecina separate. Recipe audit found no demand, so add no recipe links, forms, density, unit mappings, measurements, conversions, yields, substitutions, or safety implications.",
      "sourceIds": [
        "WP04-MSM-20261011-S01",
        "WP04-MSM-20261011-S02",
        "WP04-MSM-20261011-S03",
        "WP04-MSM-20261011-S04",
        "WP04-MSM-20261011-S05",
        "WP04-MSM-20261011-S06"
      ]
    }
  ]
}
```

## Evidence register and remaining gaps

| Source | Evidence and limit |
| --- | --- |
| [OQLF GDT, smoked meat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369658/smoked-meat) | Primary Québec terminology source. Defines the Montréal specialty, identifies beef brisket and the salted/seasoned/cooked/smoked preparation, and gives the preferred French forms. The hyphenated spelling is covered by the project normalizer as the same key. Its definition is not a commercial recipe, processing regulation, or food-safety rule. |
| [OQLF GDT, pastrami](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369657/pastrami) | Primary Québec terminology source differentiating the New York beef product from Montréal smoked meat. It explicitly cautions that the products share preparation stages yet differ in cut and product character. |
| [CFIA, Canadian Standards of Identity: Volume 7](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) | Current federal standard source. It separately describes corned beef and broad preservation terminology. The proposed row is based on OQLF's regional specialty term, not an assertion that Volume 7 defines its recipe or a prescribed common name for it. |
| [CFIA, meat and poultry product labelling](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products) | Primary federal labeling guidance distinguishes smoking from direct smoke-flavour addition and gives common-name guidance. It does not establish the smoking process for every product sold as Montreal smoked meat. |
| [Metro Québec, Viande fumée de Montréal](https://www.metro.ca/epicerie-en-ligne/allees/charcuteries-et-plats-prepares/charcuteries/saucissons-et-viandes-fumees/viande-fumee-de-montreal/p/180509450640), [Metro Québec, product category](https://www.metro.ca/epicerie-en-ligne/allees/charcuteries-et-plats-prepares/charcuteries/saucissons-et-viandes-fumees) | Current product and category listings corroborate the two proposed French retail label aliases. The product's listed ingredients, size, and any retailer descriptions apply only to those items and do not support general ratios, yields, density, fat grade, or ready-to-eat state. |

The bundled-library audit establishes no recipe demand, and the consulted sources establish no general measure, density, package yield, or substitution. Keep those unknowns open. In particular, do not infer that Montreal smoked meat is interchangeable with pastrami, corned beef, ham, or generic smoked beef, and do not infer a smoke method, process limits, storage, or safe-consumption conditions.

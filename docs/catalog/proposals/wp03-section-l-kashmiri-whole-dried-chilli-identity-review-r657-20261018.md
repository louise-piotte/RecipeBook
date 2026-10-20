# WP03 Section L: whole dried Kashmiri red chilli identity review (R657)

- **Reviewed:** 2026-10-18
- **Status:** Integrated on 2026-10-18 after root source, picker-boundary, and ownership review.
- **Scope:** The still-open Section L dried-chile candidate Kashmiri, bounded to the marketed whole dried red chilli; English and Québec-facing French naming; and boundaries with generic chilli powder, flakes, and the separately held Kashmiri chilli paste candidate.
- **Verification:** Primary-source review and static catalog, picker, ledger, and recipe-corpus checks. No software tests, build, emulator run, or deployment.

## Recommendation

Add one identity-only reference for the named whole dried product:

- English display: **whole dried Kashmiri red chilli pepper**
- French display: **piment rouge du Cachemire entier séché** (descriptive Canadian retailer wording, not an OQLF-approved Kashmiri term)
- English alias: **Kashmiri chilli whole**
- French aliases: **piment du Cachemire entier séché**, **piments du Cachemire entiers séchés**
- Category: **VEGETABLE_AND_AROMATIC**
- Density: null; unit mappings: empty
- Forms, recipe links, substitutions, and numeric observations: none

The Government of India’s Spices Board identifies Kashmiri Red Chilli as a spice associated with Jammu and Kashmir, and a separate Ministry of Commerce release lists Kashmiri chilli among India’s major chilli varieties for export. A current Canadian listing names a whole dried Kashmiri red chilli product and distinguishes its whole presentation from grinding it into powder. Together these support a source-named culinary identity for the whole dried product. They do not establish one cultivar, botanical species, fixed origin for all products sold under the name, or universal heat/color specifications. [S01–S04]

Codex defines dried chilli pepper as dried Capsicum fruit and distinguishes whole, crushed/flaked, and ground styles. It does not name Kashmiri as a Codex variety. Use it only to preserve the whole-versus-ground boundary; do not infer that the existing generic chili powder or red chili flakes are Kashmiri products. [S03, S04]

The French display follows the Canada-facing listing’s **piment rouge du Cachemire entier sec** title and its fuller product wording **piments du Cachemire entiers séchés**. OQLF’s GDT supplies the generic French term *piment chili* and English equivalents, but no Kashmiri-specific term. Keep the French display provisional and descriptive. [S05, S07]

## Plan and duplicate check

The current [WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6280) still lists Kashmiri within the open dried-chile sweep. R654 integrated the separate dried ñora identity; it did not review Kashmiri. The existing [WP06 South Asia review](wp06-south-asia-cuisine-gap-sweep-20261011.md#L76) holds **Kashmiri red-chilli paste** because its product boundary is unclear. This proposal concerns the whole dried pepper only and leaves that paste candidate unchanged. The WP06 Mexico/Central America dried-chile review covers its named A–G candidates, not Kashmiri. No focused WP03 whole-dried Kashmiri identity proposal or integration was found.

## Proposed catalog delta

One new reference only. The proposed ID is unoccupied in active references, forms, and the legacy candidate archive.

```json
{
  "id": "ingredient-ref-kashmiri-chili-pepper",
  "nameFr": "piment rouge du Cachemire entier s\u00e9ch\u00e9",
  "nameEn": "whole dried Kashmiri red chilli pepper",
  "aliasesFr": [
    "piment du Cachemire entier s\u00e9ch\u00e9",
    "piments du Cachemire entiers s\u00e9ch\u00e9s"
  ],
  "aliasesEn": ["Kashmiri chilli whole"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The English alias follows a Canadian retailer’s exact product-name order. The French plural follows the same listing’s product description; the singular alias is its grammatical singular. Accent-folded search handles Cachemire without a separate ASCII spelling. Do not add bare *Kashmiri Mirch*, *Kashmiri chilli powder*, generic *chilli*, *chili powder*, *piment rouge*, or *red pepper* aliases. Do not add a separate ingredient form: the proposed identity is limited to the market-named whole dried product and does not establish a parent fresh reference or a universal fresh-to-dried relationship.

## Proposed research-ledger delta

Add one `ingredient_reference` record keyed to the new reference. Identity is verified as a named culinary product; measurement and substitution research remain `not_yet_researched`. This exact proposed record has seven source entries and one accepted decision. No measurement observation, substitution finding, form, recipe link, or source-specific package amount is proposed.

```json
{
  "recordId": "ingredient-ref-kashmiri-chili-pepper",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-L-KASHMIRI-R657-20261018-S01",
      "url": "https://www.indianspices.com/sites/default/files/BSM%20SRINAGAR-%20SAFFRON-compressed.pdf",
      "title": "Spices Board India, Buyer Seller Meet for Saffron and Other Spices of Jammu & Kashmir",
      "versionOrDate": "2024-12-12",
      "accessedOn": "2026-10-18",
      "locator": "Page 1, Jammu and Kashmir spice overview.",
      "supports": "The Spices Board (Ministry of Commerce & Industry, Government of India) says Jammu and Kashmir is known for producing Kashmiri Red Chilli. This supports the government-used regional spice name; it does not specify a cultivar, botanical species, or a product's origin.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-KASHMIRI-R657-20261018-S02",
      "url": "https://www.pib.gov.in/newsite/PrintRelease.aspx?lang=2&reg=48&relid=81215",
      "title": "Press Information Bureau, Government of India, Export of Red Chillies",
      "versionOrDate": "2012-03-19",
      "accessedOn": "2026-10-18",
      "locator": "Opening statement listing major exported chilli varieties.",
      "supports": "The Ministry of Commerce & Industry lists Kashmiri chilli among major varieties of chilli exported from India. This is historical official trade naming, not evidence of current market share, whole/dried presentation, or a protected cultivar.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-KASHMIRI-R657-20261018-S03",
      "url": "https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+353-2022%2FCXS_353e.pdf",
      "title": "Codex Alimentarius, Standard for Dried or Dehydrated Chilli Pepper and Paprika, CXS 353-2022",
      "versionOrDate": "CXS 353-2022, amended 2025",
      "accessedOn": "2026-10-18",
      "locator": "Sections 2.1\u20132.2, product definition and styles.",
      "supports": "Defines dried or dehydrated chilli pepper as dried Capsicum fruit and lists whole, crushed/cracked/broken/flakes, and ground/powdered styles. The standard does not list Kashmiri as a named variety; this source supports only the whole-versus-ground product boundary.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-KASHMIRI-R657-20261018-S04",
      "url": "https://www.walmart.ca/en/ip/Global-Choice-Whole-Dry-Kashmiri-Red-Chilli-200g/1N6AS16WDW4W",
      "title": "Walmart Canada, Global Choice Whole Dry Kashmiri Red Chilli",
      "accessedOn": "2026-10-18",
      "locator": "Product title, description, food-form field, and seller disclaimer; SKU 1N6AS16WDW4W.",
      "supports": "The Canada-facing listing names a whole dried Kashmiri red chilli product, marks its food form as whole, and says the item can be used whole or ground into powder. It is sold by a marketplace seller and Walmart says seller-supplied information is not separately verified. The page's package-size wording is inconsistent; no size or quantity is used as a measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-KASHMIRI-R657-20261018-S05",
      "url": "https://www.walmart.ca/fr/ip/Global-Choice-Piment-Rouge-du-Cachemire-Entier-Sec-100-g/1N6AS16WDW4W",
      "title": "Walmart Canada, Global Choice Piment Rouge du Cachemire Entier Sec",
      "accessedOn": "2026-10-18",
      "locator": "French product title and product-description bullet for piments du Cachemire entiers s\u00e9ch\u00e9s; SKU 1N6AS16WDW4W.",
      "supports": "The French-language page supplies the descriptive title piment rouge du Cachemire entier sec and the phrase piments du Cachemire entiers s\u00e9ch\u00e9s for the same whole dried product as the English listing. The marketplace page disclaims independent verification of seller-supplied details; this is local product wording, not OQLF terminology approval.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-KASHMIRI-R657-20261018-S06",
      "url": "https://spicedivine.ca/products/oltymes-kashmiri-chilli-whole-100g",
      "title": "Spice Divine, Ol'tymes Kashmiri Chilli Whole 100g",
      "accessedOn": "2026-10-18",
      "locator": "Product title, description, and availability field.",
      "supports": "The Canadian seller names Ol'tymes Kashmiri Chilli Whole 100g and describes the item as whole Kashmiri chilli. The page currently shows sold out; it supports the narrow historical product-name alias only, not current availability, origin, heat, or formulation.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-KASHMIRI-R657-20261018-S07",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084717/piment-chili",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, piment chili (GDT)",
      "versionOrDate": "Last updated 2015",
      "accessedOn": "2026-10-18",
      "locator": "Definition, preferred French terms, and English equivalents.",
      "supports": "OQLF gives piment chili, chili, and chile as preferred French generic terms, and lists chilli pepper, chili pepper, and chile pepper in English. It describes generic fresh or dried use; it has no Kashmiri-specific term and does not validate the proposed named phrase.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one identity-only reference for the named whole dried Kashmiri red chilli product under the narrow product wording reviewed. Government sources support Kashmiri Red Chilli as a named spice/variety term; the Canadian English and French listings support the whole dried presentation and provisional product wording. Keep the whole dried product distinct from generic chili powder, red chili flakes, and the separately held Kashmiri red-chilli paste candidate. Do not infer botanical species, cultivar, origin for every product, generic heat/color behavior, measure, density, mapping, form, yield, conversion, recipe link, or substitution. Measurement and substitution research remain not_yet_researched.",
      "sourceIds": [
        "WP03-L-KASHMIRI-R657-20261018-S01",
        "WP03-L-KASHMIRI-R657-20261018-S02",
        "WP03-L-KASHMIRI-R657-20261018-S03",
        "WP03-L-KASHMIRI-R657-20261018-S04",
        "WP03-L-KASHMIRI-R657-20261018-S05",
        "WP03-L-KASHMIRI-R657-20261018-S06",
        "WP03-L-KASHMIRI-R657-20261018-S07"
      ]
    }
  ]
}
```

## Product boundaries and limits

- **Whole dried versus ground/powdered:** The Canadian English listing labels the product whole and describes grinding it as an available use. Codex treats whole and ground/powdered as distinct styles. Do not alias this reference to `ingredient-ref-chili-powder`, `ingredient-ref-red-chili-flakes`, hot paprika, or paprika; do not add a powder form or conversion. The powder-style Kashmiri products and naming remain separate scope for later review. [S03–S05]
- **Kashmiri chilli paste:** The held `candidate-kashmiri-red-chilli-paste` is an unresolved prepared product candidate, not an alias or form of this whole dried item. Leave its existing ledger record unchanged. [WP06 South Asia review, §Kashmiri red-chilli paste]
- **Species, cultivar, and origin:** The Spices Board and PIB sources use Kashmiri Red Chilli as a regional spice/variety name but do not establish a particular species or cultivar. A Canadian marketplace product label does not establish that every product bearing the name was grown in Kashmir. Store no Latin name, GI/protected status, supplier provenance, or origin restriction. [S01–S04]
- **Color and heat:** The listing’s color and heat wording is seller-provided product description; it is not a transferable specification. The identity includes “red” only as part of the reviewed market name. Do not store a heat scale or universal color behavior. [S04–S05]
- **Québec French:** OQLF provides the generic term *piment chili*, not a named Kashmiri equivalent. The proposed French display is a descriptive singular based on the Walmart Canada French listing, whose page disclaims independent verification of seller information. Treat it as provisional local market wording. [S05, S07]
- **Measurements and substitutions:** No package mass is a recipe measure, and no source establishes a reusable amount, density, unit mapping, dried-to-powder ratio, fresh-to-dried yield, or culinary substitute. Add none. [S04–S05]

## Ownership, picker, and recipe audit

Root review snapshot after R654, R658, and R660 integrations: **1,835 ingredient references**, **164 forms**, **56 legacy candidates**, **2,208 ledger records**, **10,323 source entries**, **8,718 distinct source IDs**, and **114 recipes / 1,123 ingredient rows**.

Exact normalized-name checks covered Kashmiri/Kashmir, Cachemire, Kashmiri chilli, Kashmiri Mirch, the proposed English and French displays/aliases, and Kashmiri powder terms. At the pre-integration snapshot, no proposed reference ID or exact active reference/form/legacy name owner was found. Root integration now allocates `ingredient-ref-kashmiri-chili-pepper` with the exact display and aliases above. The WP06 `candidate-kashmiri-red-chilli-paste` ledger record remains a separate held product boundary.

Before integration, the R657 source-ID prefix and all seven source IDs were unused. Six source URLs had no prior ledger owner. The Codex standard URL already appeared on the hot-paprika record as `WP05-HOT-PAPRIKA-R305-20261016-S01`, with a paprika-focused support summary; the R657 row uses a new source ID and whole-chilli style locator rather than reusing that narrower source entry. The OQLF `piment chili` page had no prior ledger entry; R654’s generic OQLF `piment` source is a different page and was not reused. After integration, all seven new source IDs have one owner; the Codex URL has two scoped owners, and each other R657 URL has one.

A static projection of the current phrase-first [ingredient picker](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) gives:

| Query | Pre-integration result | Integrated result |
|---|---:|---:|
| Kashmiri | 0 | 1: `ingredient-ref-kashmiri-chili-pepper` |
| Kashmiri chilli | 0 | 1: `ingredient-ref-kashmiri-chili-pepper` |
| Kashmiri chilli whole | 0 | 1: `ingredient-ref-kashmiri-chili-pepper` |
| whole dried Kashmiri red chilli | 0 | 1: `ingredient-ref-kashmiri-chili-pepper` |
| piment du Cachemire | 0 | 1: `ingredient-ref-kashmiri-chili-pepper` |
| piments du Cachemire entiers séchés | 0 | 1: `ingredient-ref-kashmiri-chili-pepper` |
| Kashmiri red chilli powder / Kashmiri Mirch | 0 | 0 |
| chili powder | 1: `ingredient-ref-chili-powder` | unchanged |
| red chili flakes | 1: `ingredient-ref-red-chili-flakes` | unchanged |
| pepper / piment | 38 / 31 | 39 / 32 |

The exact product aliases add one result for Kashmiri and Cachemire queries. The generic pepper and piment queries each gain one named pepper. No form is proposed, so no form hint is produced. The powder-specific phrase remains unmatched and does not route to the whole dried identity.

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned for Kashmiri, Kashmir, Cachemire, Kashmiri Mirch, and candidate whole-dried phrases: **zero candidate-specific hits**. The corpus has two adjacent but generic rows: `2 tbsp chili powder` in recipe 034 and `1 tbsp red chili flakes` in recipe 043. Neither names Kashmiri or supports this identity, a form, a recipe link, or a conversion. No recipe edits are proposed.

## Source register

The new source IDs are listed in the proposed ledger record above. Source claims are limited as described there.

| ID | Source | Evidence used and limits |
|---|---|---|
| S01 | Spices Board India, [Buyer Seller Meet for Saffron and Other Spices of Jammu & Kashmir](https://www.indianspices.com/sites/default/files/BSM%20SRINAGAR-%20SAFFRON-compressed.pdf), 2024, p. 1. | Government source calls Kashmiri Red Chilli a spice associated with Jammu and Kashmir. It does not specify cultivar, species, or the origin of products sold elsewhere. |
| S02 | Press Information Bureau, Government of India, [Export of Red Chillies](https://www.pib.gov.in/newsite/PrintRelease.aspx?lang=2&reg=48&relid=81215), 2012, opening statement. | Lists Kashmiri chilli among major export varieties. This is historical trade naming, not a current market or product-form study. |
| S03 | Codex Alimentarius, [Standard for Dried or Dehydrated Chilli Pepper and Paprika, CXS 353-2022](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+353-2022%2FCXS_353e.pdf), §§2.1–2.2; current standard list shows amendment through 2025. | Defines dried Capsicum chilli and distinguishes whole, crushed/flaked, and powdered styles. The direct PDF open returned 502 during this review; the official search-indexed text exposed these clauses. It does not name Kashmiri. |
| S04 | Walmart Canada, [Global Choice Whole Dry Kashmiri Red Chilli](https://www.walmart.ca/en/ip/Global-Choice-Whole-Dry-Kashmiri-Red-Chilli-200g/1N6AS16WDW4W), title, description, whole food-form field, and seller disclaimer. | Canada-facing product listing for a whole dried product; marketplace seller details are not independently verified by Walmart. Package-size wording is inconsistent and unused. |
| S05 | Walmart Canada, [Global Choice Piment Rouge du Cachemire Entier Sec](https://www.walmart.ca/fr/ip/Global-Choice-Piment-Rouge-du-Cachemire-Entier-Sec-100-g/1N6AS16WDW4W), French title and product description. | Same SKU as S04. Supports local French product wording only; the page disclaims independent verification of third-party seller details and is not an OQLF terminology ruling. |
| S06 | Spice Divine, [Ol'tymes Kashmiri Chilli Whole 100g](https://spicedivine.ca/products/oltymes-kashmiri-chilli-whole-100g), product title and description. | Supports the narrow English alias. The current listing shows sold out; no availability, origin, or general heat claim is used. |
| S07 | Office québécois de la langue française, [piment chili (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084717/piment-chili), updated 2015, definition and preferred terms. | Supports the generic term and its fresh/dried scope only. OQLF has no Kashmiri-specific term in this entry. |

## Proposal audit and root integration checks

- Re-read `AGENTS.md`, `Requirements.md`, `roadmap.md`, the current Section L checklist, the active reference and form files, the legacy archive, and nearby R654/WP06 proposals and ledger records.
- Confirmed the active ID/name/alias owners, source-ID and URL ownership, and exact proposed ledger status fields against the current package and ledger snapshot.
- Projected the listed picker queries from current reference/form search terms using the implementation’s phrase-first and substring fallback behavior.
- Read all 114 manifest-listed recipe files and counted 1,123 ingredient rows; found no Kashmiri candidate hits.
- The reviewer proposal and root integration README are UTF-8 without BOM. The reference JSON stores French accents with explicit Unicode escapes. No software tests, build, emulator run, or deployment were run for this database-JSON-only change.


## Root integration

Accepted the bounded whole-dried product identity. Added `ingredient-ref-kashmiri-chili-pepper` as `VEGETABLE_AND_AROMATIC`, with the reviewed English display and alias and the provisional descriptive Québec French display and aliases. The source naming does not establish a botanical species, cultivar, origin for every product, fixed heat/color specification, or OQLF-approved Kashmiri term. Kept whole dried Kashmiri chilli distinct from generic chili powder, red chili flakes, and the separately held Kashmiri paste candidate. No form, amount, density, mapping, conversion, yield, recipe link, or substitution was added.

The R657 ledger row has one accepted identity decision and seven sources. The Spice Divine source now points to its directly reviewed Ol'tymes product page; its sold-out status is not treated as availability evidence. See the [R657 integration README](../batches/wp03-section-l-kashmiri-whole-dried-chilli-identity-integration-r657-20261018/README.md).

## Root static validation

- Seed package validation and normalization checks passed; the generated index is current at 1,836 references.
- `validate_research_ledger()` passed with 2,209 records and zero errors. Seven new source IDs and the reference/ledger record IDs each have one owner. The Codex URL has two scoped ledger owners; the other six R657 URLs each have one.
- The manifest remains at 114 recipes / 1,123 ingredient rows; no candidate-specific recipe phrase or link was found. Exact proposed canonical names and aliases have no other active owners.
- Database JSON is UTF-8 without BOM and stores non-ASCII using explicit Unicode escapes. Maintained documentation passed UTF-8/no-BOM, link, newline, whitespace, and scoped `git diff --check` validation.

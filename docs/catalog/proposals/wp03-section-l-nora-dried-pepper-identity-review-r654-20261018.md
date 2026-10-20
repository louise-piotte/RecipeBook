# WP03 Section L: dried ñora pepper identity and naming boundary review (R654)

- **Reviewed:** 2026-10-18
- **Status:** Integrated on 2026-10-18 after root review.
- **Scope:** The open Section L dried-chile candidate ñora, its Québec-facing name, spelling variants, and boundaries with fresh Bola pepper, pimentón/paprika, choricero pepper, and ñora pulp.
- **Verification:** Source and static data checks only. No software tests, build, emulator run, or deployment.

## Recommendation

Add one identity-only reference for the named whole dried pepper:

- English display: **dried ñora pepper**
- French display: **piment ñora séché** (local Montréal usage; not an OQLF-approved named term)
- English aliases: **ñora peppers**, **nyora peppers**
- French aliases: **piments ñora**
- Category: **VEGETABLE_AND_AROMATIC**
- Density: null; unit mappings: empty
- Forms, recipe links, substitutions, and numeric observations: none

Murcia’s official tourism site says a fresh pimiento de bola is called ñora after drying, and identifies grinding it as the step that produces pimentón. This supports a named dried culinary product while keeping a generic fresh bell-pepper identity, a dried ñora pepper, and ground paprika/pimentón from becoming interchangeable. The scope is the source-named pepper product; do not encode a universal cultivar, botanical species, heat level, or fresh-to-dry conversion. [S01–S02]

The display pair preserves the Spanish product name and uses the exact French phrase **piment ñora séché** found in a Montréal retailer’s own recipe. This is evidence of Québec market language, not a terminology ruling. OQLF’s generic entry supports **piment** as the broad French term for the Capsicum fruit; the targeted OQLF search did not locate a ñora-specific entry. Keep the French label provisional and add no broader French alias. [S06–S08]

## Plan and duplicate check

The current [WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6270) explicitly lists ñora under its still-open dried-chile item. R651 resolved oil-packed sun-dried tomatoes; it did not touch this chile candidate. The current checklist and proposal/batch archive were searched for ñora, nora pepper, and nyora pepper. No focused ñora proposal, batch, active record, form, legacy candidate, or ledger identity record was found. The separate [WP06 Mexican dried-chile review](wp06-mexican-dried-chile-boundaries-20261009.md) concerns ancho, guajillo, pasilla, mulato, cascabel, árbol, chipotle, and morita; it does not review ñora.

## Integrated catalog delta

One new reference only. No ingredient-form row is proposed.

```json
{
  "id": "ingredient-ref-nora-pepper",
  "nameFr": "piment \u00f1ora s\u00e9ch\u00e9",
  "nameEn": "dried \u00f1ora pepper",
  "aliasesFr": ["piments \u00f1ora"],
  "aliasesEn": ["\u00f1ora peppers", "nyora peppers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The ID is unoccupied in the live catalog and legacy archive. Accent-folded search makes unaccented “nora” queries find the displayed ñora terms, so duplicate ASCII aliases are unnecessary. The plural and nyora aliases are limited to the reviewed retailer wording; do not add bare **pepper**, **piment**, **poivron**, **pimiento de bola**, **paprika**, **pimentón**, **piment choricero**, **Spanish pepper**, or generic chile terms.

Do not add a form beneath generic bell pepper: the official Murcia source’s Bola-to-ñora statement is a named local fresh-to-dry relationship, not evidence that any generic bell pepper dried at home becomes a catalog ñora. The candidate is an identity for the whole dried product, with the drying state stated in its labels. [S01]

## Integrated research-ledger delta

The ledger now contains one record keyed to the new reference. Identity is verified by the regional and product evidence. Measurement and substitution remain `not_yet_researched`: this identity review did not conduct a measurement study or a general substitution review. The product and recipe quantities in the sources, and the source-specific romesco comparison with ancho, do not establish reusable measurement or substitution behavior.

Add the nine R654 source entries below. Reuse the existing OQLF generic piment source entry, WP03-L-FRESNO-20261015-R144-S04, by source ID; its URL, locator, and source ownership already exist on the Fresno pepper record. Do not allocate a new source ID for that page.

~~~json
{
  "recordId": "ingredient-ref-nora-pepper",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S01",
      "url": "https://itrem.carm.es/es/ir_al_mercado/",
      "title": "Instituto de Turismo de la Región de Murcia, Ve al mercado",
      "accessedOn": "2026-10-18",
      "locator": "“Del pimiento al pimentón” and “Pimiento de bola y ñora” sections.",
      "supports": "Says pimiento de bola is called ñora when dried and that grinding ñora produces pimentón. Supports the Murcia culinary name and product-state boundary, not a universal Capsicum cultivar or fresh-to-dry rule.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S02",
      "url": "https://www.carm.es/web/pagina?IDCONTENIDO=835&IDTIPO=11&RASTRO=c%24m1185%2C34701",
      "title": "Región de Murcia, D.O. Pimentón de Murcia",
      "accessedOn": "2026-10-18",
      "locator": "Product definition.",
      "supports": "Defines Pimentón de Murcia as a ground product made from mature, fully red Bola peppers. Supports the powder boundary; does not establish a universal ñora processing specification.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S03",
      "url": "https://www.mapa.gob.es/ministerio/pags/biblioteca/revistas/pdf_DYC/DYC_2005_83_completa.pdf",
      "title": "Ministerio de Agricultura / Distribución y Consumo, Pimiento article, issue 83",
      "versionOrDate": "2005",
      "accessedOn": "2026-10-18",
      "locator": "Discussion of dried ñoras and pimiento choricero.",
      "supports": "Discusses dried ñoras in culinary use and distinguishes pimiento choricero from ñoras. This is trade-journal and culinary evidence, not an official identity or botanical standard.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S04",
      "url": "https://carmencita.com/wp-content/uploads/2021/02/carmencita-catalogue.pdf",
      "title": "Carmencita, Retail catalogue",
      "accessedOn": "2026-10-18",
      "locator": "“Nora Pepper” and “Sweet cristal pepper” product sections.",
      "supports": "Presents dried Nora pepper as a named product and lists Sweet Cristal pepper separately. Supports product naming, not a universal synonym, cultivar, or fixed heat claim.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S05",
      "url": "https://littlespainmarket.ca/products/dry-nora-peppers-la-barraca-110g",
      "title": "Little Spain Market Canada, Dry Ñora Peppers, La Barraca",
      "accessedOn": "2026-10-18",
      "locator": "Product title, package image “ÑORAS SECAS,” and description.",
      "supports": "The Canada-facing retailer uses Dry Ñora Peppers and identifies nyora peppers as an alternate name in this listing. The page showed the product sold out; this does not establish current stock or a universal synonym.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S06",
      "url": "https://lespanola.com/fr/blogs/recipes/authentic-seafood-paella-recipe",
      "title": "L’Española, Recette authentique de paella aux fruits de mer",
      "accessedOn": "2026-10-18",
      "locator": "French ingredient list and step 2.",
      "supports": "The Montréal retailer’s French recipe uses the exact phrase piment ñora séché and lists paprika separately. Supports local French product wording and this recipe’s use only, not a reusable measure or equivalence.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S07",
      "url": "https://lespanola.com/fr/blogs/flavours-of-spain/romesco-sauce-a-taste-of-catalonian-heritage",
      "title": "L’Española, Sauce Romesco : un avant-goût du patrimoine catalan",
      "accessedOn": "2026-10-18",
      "locator": "“Piments Ñora” section and recipe.",
      "supports": "Uses the plural piments ñora, describes whole dried peppers rehydrated for romesco, and distinguishes recovered pulp. Its dried-ancho comparison is specific to that sauce context and does not establish a general substitution.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S08",
      "url": "https://lespanola.com/products/jr-dried-red-pepper-pulp-135-g",
      "title": "L’Española, Ñora Pepper Pulp 135 g",
      "accessedOn": "2026-10-18",
      "locator": "Product description.",
      "supports": "Describes a prepared pulp made from dried ñora peppers after rehydrating, scraping, and puréeing; the page says it is similar to choricero, not the same product. This is a product-specific boundary, not a universal formulation.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-NORA-R654-20261018-S09",
      "url": "https://www.termcat.cat/ca/diccionaris-en-linia/184/fitxa/MTg5ODUyMw%3D%3D",
      "title": "TERMCAT, nyora",
      "accessedOn": "2026-10-18",
      "locator": "Spanish equivalent and definition.",
      "supports": "Records Catalan nyora with Spanish ñora as its equivalent and describes the pepper as very pungent. Corroborates the spelling but does not support a transferable fixed heat characterization.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-FRESNO-20261015-R144-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment",
      "title": "Office québécois de la langue française, piment (GDT)",
      "versionOrDate": "Last updated 1988",
      "accessedOn": "2026-10-15",
      "locator": "Preferred term and English/Latin translations.",
      "supports": "Supports piment as the general French term and pepper as the English translation only. It has no ñora-specific entry or French named-pepper term.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one identity-only reference for the whole dried ñora pepper under the source-attested names dried ñora pepper / piment ñora séché, with only the narrow ñora and nyora spelling aliases proposed in the catalog delta. Keep generic fresh bell pepper, ground pimentón/paprika, pimiento choricero, and prepared ñora pulp separate. The Québec French display is provisional local wording, not an OQLF-approved named term. Leave measurement and substitution research not_yet_researched and add no form, recipe link, numeric observation, density, unit mapping, conversion, yield, hydration ratio, or substitution finding.",
      "sourceIds": [
        "WP03-L-NORA-R654-20261018-S01",
        "WP03-L-NORA-R654-20261018-S02",
        "WP03-L-NORA-R654-20261018-S03",
        "WP03-L-NORA-R654-20261018-S04",
        "WP03-L-NORA-R654-20261018-S05",
        "WP03-L-NORA-R654-20261018-S06",
        "WP03-L-NORA-R654-20261018-S07",
        "WP03-L-NORA-R654-20261018-S08",
        "WP03-L-NORA-R654-20261018-S09",
        "WP03-L-FRESNO-20261015-R144-S04"
      ]
    }
  ]
}
~~~

## Product boundaries and limits

- **Fresh pimiento de bola:** The Murcia source uses ñora for its dried presentation. Keep the source-specific relationship as evidence only; do not alias fresh Bola, fresh bell pepper, or every dried bell pepper to this identity. [S01]
- **Pimentón / paprika:** The Murcia source describes grinding ñora to obtain pimentón. A separate protected-product page defines Pimentón de Murcia as a ground product from mature Bola peppers. Do not add a powder alias, equivalence, or conversion to the whole dried pepper. This review does not resolve every regional pimentón formulation. [S01–S02]
- **Pimiento choricero:** The MAPA-hosted trade source distinguishes it from ñoras, and L’Española’s Montréal ñora page describes ñora as similar to choricero, not identical. Keep choricero out of aliases. [S03, S08]
- **Ñora pulp and crushed/powder products:** The Montréal retailer describes its pulp as dried ñora peppers that were rehydrated, scraped, and puréed. Its French romesco article also lists whole rehydrated piments ñora separately from recovered pulp. These are product-specific preparations, not the whole dried reference. Add no pulp, crushed, powder, or sauce identity here. [S07–S08]
- **Nyora spelling and pungency:** A Canadian specialty-retailer product page calls its dry ñora peppers “nyora peppers,” which supports the narrow phrase aliases. TERMCAT records Catalan nyora as Spanish ñora but describes a small, very pungent pepper. Murcia-facing materials emphasize Bola and pimentón but do not establish a transferable heat level. Store no heat, sweetness, cultivar, or species claim. [S04, S09]
- **Substitution and quantities:** L’Española’s romesco article mentions dried ancho in that sauce context, and its paella recipe gives a source-specific ingredient quantity. Neither establishes a global substitution or reusable unit measure. No substitutions, recipe links, density, conversion, yield, hydration ratio, or measure are proposed. [S06–S07]

## Ownership, picker, and recipe audit

Pre-integration snapshot: 2026-10-18, after R656. The package contained **1,833 ingredient references**, **164 forms**, **56 legacy candidates**, **2,206 ledger records**, **10,306 source entries** across **8,703 distinct source IDs**, and **114 recipes / 1,123 ingredient rows**.

Exact normalized-name checks before integration covered ñora, ñoras, nora, nyora, ñora/nora/nyora pepper(s), dried ñora pepper(s), piment ñora séché, piments ñora, pimiento de bola, pimentón, and choricero phrases. No candidate phrase was owned by an active reference, a form label or match term, a legacy candidate, or a ledger identity. The proposed ID and source-ID prefix were unused. The nine new source URLs had no prior ledger owner; the OQLF generic piment entry was reused by reference under its existing R144 source ID.

A static projection of the current phrase-first [ingredient picker](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) gives:

| Query | Current result | With proposed row |
|---|---:|---:|
| ñora, nora, nyora, ñora pepper(s), dried ñora pepper, piment ñora, piments ñora, nyora peppers | 0 | 1: ingredient-ref-nora-pepper |
| pepper | 37 | 38, with the new named pepper |
| piment | 30 | 31, with the new French display |
| paprika | 4 | 4 |
| pimentón | 1: ingredient-ref-pimenton-de-la-vera | unchanged |
| bell pepper | 1: ingredient-ref-bell-pepper | unchanged |
| pimiento choricero | 0 | 0 |

No form phrase is added, so no form hint is produced. The broad English and French terms continue to return their existing broad sets; no generic alias is introduced.

I read every manifest-listed recipe file and scanned all **1,123 ingredient rows** for accent-folded ñora/nora/nyora and piment ñora candidate phrases. There were **zero candidate ingredient-row hits** in **114 recipes**. This is no demand in the current bundled corpus; it is not a claim about external recipes. No bundled recipe link or relabeling is proposed.

## Source register

The following new IDs were checked against the current research ledger and proposal/batch archive before use. Their prefix is unique. OQLF’s generic piment page is reused by reference as noted below.

| Source ID | Source and locator | Claim used and limits |
|---|---|---|
| WP03-L-NORA-R654-20261018-S01 | Instituto de Turismo de la Región de Murcia, [Ve al mercado](https://itrem.carm.es/es/ir_al_mercado/), “Del pimiento al pimentón” and “Pimiento de bola y ñora”; accessed 2026-10-18. | Says pimiento de bola is called ñora when dried and that grinding ñora produces pimentón. Official regional-tourism description; supports a Murcia culinary name/state boundary, not a universal Capsicum cultivar rule. |
| WP03-L-NORA-R654-20261018-S02 | Región de Murcia, [D.O. Pimentón de Murcia](https://www.carm.es/web/pagina?IDCONTENIDO=835&IDTIPO=11&RASTRO=c%24m1185%2C34701), product definition; accessed 2026-10-18. | Defines the protected product as ground fully red Bola peppers harvested mature, sound, clean, and dry. This is evidence for the powder product boundary, not a universal ñora recipe or processing specification. |
| WP03-L-NORA-R654-20261018-S03 | Ministerio de Agricultura / Distribución y Consumo, [Pimiento article, issue 83 (2005)](https://www.mapa.gob.es/ministerio/pags/biblioteca/revistas/pdf_DYC/DYC_2005_83_completa.pdf), dried presentation and pimiento choricero discussion; accessed 2026-10-18. | The MAPA-hosted trade-journal text discusses dried ñoras in stews and distinguishes pimiento choricero from ñoras. It is product/cuisine discussion, not an official identity or botanical standard. |
| WP03-L-NORA-R654-20261018-S04 | Carmencita, [Retail catalogue](https://carmencita.com/wp-content/uploads/2021/02/carmencita-catalogue.pdf), “Nora Pepper” and “Sweet cristal pepper” product sections; accessed 2026-10-18. | Manufacturer catalogue presents dried Nora pepper as a named product and lists Sweet Cristal pepper separately. Product-label evidence; no universal synonym, cultivar, or fixed heat is inferred. |
| WP03-L-NORA-R654-20261018-S05 | Little Spain Market Canada, [Dry Ñora Peppers. La Barraca, 110g](https://littlespainmarket.ca/products/dry-nora-peppers-la-barraca-110g), product title, package image “ÑORAS SECAS,” and description; accessed 2026-10-18. | Current Canada-facing product page supports the English dry-product wording and identifies nyora peppers as an alternate name in this listing. It is retailer evidence; the page showed the item sold out, so it does not establish current stock. |
| WP03-L-NORA-R654-20261018-S06 | L’Española, [Recette authentique de paella aux fruits de mer](https://lespanola.com/fr/blogs/recipes/authentic-seafood-paella-recipe), ingredient list and step 2; accessed 2026-10-18. | Montréal retailer’s French-language recipe uses the exact phrase piment ñora séché and lists paprika separately. It supports local wording and source-specific recipe use, not a reusable quantity or equivalence. |
| WP03-L-NORA-R654-20261018-S07 | L’Española, [Sauce Romesco : un avant-goût du patrimoine catalan](https://lespanola.com/fr/blogs/flavours-of-spain/romesco-sauce-a-taste-of-catalonian-heritage), “Piments Ñora” section and recipe; accessed 2026-10-18. | Montréal retailer uses plural piments ñora, describes whole dried peppers rehydrated for romesco, and keeps recovered pulp separate. Its dried-ancho comparison is romesco-specific and is not used as a global substitution. |
| WP03-L-NORA-R654-20261018-S08 | L’Española, [Ñora Pepper Pulp 135 g](https://lespanola.com/products/jr-dried-red-pepper-pulp-135-g), product description; accessed 2026-10-18. | Montréal retailer describes a prepared pulp made from dried ñora peppers after rehydrating, scraping, and puréeing; its page says it is similar to choricero, not the same product. This is a product-specific boundary, not a universal formulation. |
| WP03-L-NORA-R654-20261018-S09 | TERMCAT, [nyora](https://www.termcat.cat/ca/diccionaris-en-linia/184/fitxa/MTg5ODUyMw%3D%3D), Spanish equivalent and definition; accessed 2026-10-18. | Catalan terminology source records nyora / Spanish ñora, while its description calls it very pungent. This corroborates spelling but also cautions against encoding a fixed heat characterization. |
| Reused by reference: WP03-L-FRESNO-20261015-R144-S04 | Office québécois de la langue française, [piment (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment), preferred generic term and scope note; previously accessed 2026-10-15. | Supports the generic French noun piment / English pepper only. It does not provide a ñora-specific entry or validate the proposed named phrase. The existing source ID remains owned by R144. |

## Static checks

- Re-read AGENTS.md, the relevant ingredient-reference and form requirements, the Section L checklist and roadmap update, active references/forms, legacy archive, ledger, R651 and nearby proposals/batches.
- Before integration, confirmed exact candidate ownership, proposed ID availability, source-ID prefix uniqueness, URL ownership, picker projection, and recipe-row demand.
- Checked all 114 manifest recipe files and 1,123 ingredient rows; no ñora/nora/nyora candidate row matched.
- This proposal file is UTF-8 without BOM and contains no mojibake markers. The database JSON example uses explicit Unicode escapes as required for bundled database text.
- After integration, confirmed the new reference, ledger record, nine new source IDs, and all new source URLs each have one owner; the reused OQLF source keeps its matching bibliographic metadata and original R144 ownership. Package validation, generated-index freshness, ledger schema/custom validation, encoding, local-link, and scoped whitespace checks passed. No software tests, build, emulator run, or deployment were needed because the change adds database JSON data under `AGENTS.md`.


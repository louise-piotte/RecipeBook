# WP02 Section B: Fufu Flour, Blends, and Brazilian Cassava Granules Review

- **Reviewed:** 2026-10-11
- **Status:** proposal only; this is the only artifact created for this review.
- **Scope:** generic fufu/foufou flour and blends, narrower cassava or plantain fufu flour identities, and the unresolved source-named Brazilian tapioca granules. Existing gari/garri, attiéké, Placali, Pupuru, and Agbelima decisions are preserved.
- **Inputs reviewed:** `Requirements.md`; the open Section B item in `docs/RecipeBook-global-ingredient-catalog-plan.txt`; current references, forms, research ledger, legacy candidates, manifest-listed recipes, and related WP02 proposals/integration notes.
- **Source-ID prefix:** `WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S`. A repository search found no previous use.
- **Access date:** 2026-10-11.

## Recommendation

**Add one narrow, identity-only reference for Brazilian `tapioca granulada`. Hold generic fufu flour and all generic fufu-blend identities.** Brazil’s MAPA standard defines `tapioca granulada` as an irregular, polyhedral-granule subgroup of cassava-root tapioca and distinguishes it from the spherical subgroup `tapioca pérola / sagú artificial`. A current Yoki listing in Chambly identifies a cassava-made granulated-tapioca product in Portuguese and English; another Canadian retailer lists the same Portuguese product term and ingredient. This supports one source-named regional identity available in Québec and Canada. It does not support a universal cassava-granule alias or a recipe conversion. [S01–S04]

Use the fr-CA descriptive display **`tapioca granulé du Brésil`** and English display **`Brazilian tapioca granules`**, with source term `tapioca granulada` as the sole alias in each locale. The Québec distributor’s French `tapioca granulé` attests a usable French descriptive phrase, but that separate product listing gives no shape or composition; the Brazil qualifier and source-term alias keep the catalog row tied to the standardized subgroup. Do not use bare `tapioca`, `tapioca pearls`, `tapioca pérola`, or `sagú artificial` as aliases. [S01–S07]

**Hold generic `fufu flour`, `foufou flour`, `cassava fufu flour/powder`, and plantain/cocoyam/potato or other fufu blends.** Current Québec sellers list plantain fufu flour under both `fufu` and `foufou` French-facing spellings. The Tropiway manufacturer says its plantain and cocoyam fufu flours blend powders made from plantain, cocoyam, and cassava. Canadian listings also separate cassava fufu from cassava flour, while another listing labels cassava fufu as lafun. Primary studies distinguish the tested fufu flour from lafun and pupuru, but they do not define one global retail formula or resolve Canadian product labels. These sources establish real products and use; they do not yield a safe source-neutral identity or alias. [S08–S15]

There are **zero exact recipe-text or ingredient-row hits** for the candidate fufu or regional tapioca-granule terms in the current bundled recipes. Recipe demand therefore adds no basis for a fufu row, recipe link, or substitution. The Québec/Canadian listing for the Brazilian granule product is separate evidence of availability, not bundled recipe demand.

## Candidate dispositions

| Candidate | Disposition | Naming and boundary |
|---|---|---|
| Brazilian `tapioca granulada` | **Add one source-qualified identity.** | EN `Brazilian tapioca granules`; fr-CA `tapioca granulé du Brésil`; `tapioca granulada` alias in both locales. Limit the row to the MAPA subgroup of irregular polyhedral cassava-starch granules. French display is a transparent descriptive translation, not an OQLF ruling. [S01–S07] |
| Generic `fufu` / `foufou flour` or “fufu mix” | **Hold.** | Fufu is used for a prepared dough/food as well as flour products, and flour products use different roots and blends. Keep both French-facing spellings as source wording only; do not attach either as an alias to flour or a cooked dish. [S08–S13] |
| `cassava fufu flour`, `cassava fufu powder`, or `akpu` | **Hold.** | Retail sources use cassava-specific fufu wording, but do not agree on composition or process; at least one Canadian listing pairs `Cassava Fufu` with `(lafun)`, while primary research distinguishes tested fufu flour and lafun samples. Do not alias these terms to edible cassava flour, lafun, gari, Pupuru, or cooked fufu. Revisit only with a Québec/Canadian package or producer source that states product composition and process and supports a standalone fr-CA name. [S12–S16] |
| Plantain, cocoyam, potato, wheat, or other fufu flours/blends | **Hold generic identities.** | The current Québec listing says `farine de fufu plantain`; the manufacturer’s product line includes more than one root and blend. Do not normalize these to the active green plantain flour, yam flour, cassava flour, or each other. Preserve exact branded wording for a future recipe/package use case. [S08–S11] |
| Brazil `tapioca pérola` / `sagú artificial` | **Keep held as a separate candidate.** | MAPA defines this as irregular spherical cassava-tapioca granules; the active tapioca-pearl identity is OQLF-defined as a small soft ball made from tapioca starch. Do not merge these source-specific retail terms into the polyhedral `tapioca granulada` identity or add them as pearl aliases. [S01, S05, S06] |
| Generic cassava grits/semolina | **Do not add an umbrella row.** | `cassava grits` already resolves through the active attiéké alias `steamed cassava grits`; attiéké is made from fermented cassava pulp. Do not extend that alias to Brazilian starch granules, cassava flour, or semolina. [S18] |

## Exact proposed reference JSON

If accepted for integration, add only this row to the reference array:

```json
{
  "id": "ingredient-ref-brazil-tapioca-granulada",
  "nameFr": "tapioca granulé du Brésil",
  "nameEn": "Brazilian tapioca granules",
  "aliasesFr": ["tapioca granulada"],
  "aliasesEn": ["tapioca granulada"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

No fufu reference, fufu alias, granule form, measurement, conversion, yield, recipe link, or substitution rule is proposed. No separate generic `granulated tapioca` alias is added: although the Chambly listing uses those English words for Yoki’s item, the same English phrase appears on a separate Québec distributor item whose morphology and composition are not stated. The source-qualified English display `Brazilian tapioca granules` identifies the row, and the exact source term remains searchable through the alias. [S02, S03, S07]

## Exact proposed research-ledger record

This is proposal data only. It does not change `docs/catalog/research-ledger.v1.json`.

```json
{
  "recordId": "ingredient-ref-brazil-tapioca-granulada",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S01",
      "url": "https://sistemasweb.agricultura.gov.br/sislegis/action/detalhaAto.do?chave=1141329604&method=visualizarAtoPortalMapa",
      "title": "Brazil, MAPA, Instrução Normativa nº 23, de 14 de dezembro de 2005, Regulamento Técnico de Identidade e Qualidade dos Produtos Amiláceos Derivados da Raiz de Mandioca",
      "versionOrDate": "2005-12-14; published 2005-12-15",
      "accessedOn": "2026-10-11",
      "locator": "Annex, items 2.25–2.27 and 3.2.1–3.2.2.",
      "supports": "Defines cassava-root tapioca granules and distinguishes irregular polyhedral tapioca granulada from irregular spherical tapioca pérola or sagú artificial. Supports this source-specific ingredient identity and the pearl boundary; it does not establish a household measure, composition for every brand, conversion, or substitute.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S02",
      "url": "https://www.marchebresil.com/en/products/yoki-media-de-tapioca-granule-500g",
      "title": "Marché Brésil, Yoki Granulated Tapioca Media 500g",
      "accessedOn": "2026-10-11",
      "locator": "Product title, cassava description, add-to-cart and pickup listing for Chambly, Québec.",
      "supports": "A current Québec retailer lists Yoki granulated tapioca as a cassava-made product available for purchase and Chambly pickup. This establishes local commerce and English product wording, not MAPA granule shape or general Canadian demand.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S03",
      "url": "https://www.marchebresil.com/pt/products/yoki-media-de-tapioca-granule-500g",
      "title": "Marché Brésil, Tapioca Granulada Yoki Media 500g",
      "accessedOn": "2026-10-11",
      "locator": "Portuguese product title and description; cassava source; Chambly store pickup.",
      "supports": "The same Québec product listing uses the source-language name tapioca granulada and says it is made from cassava. Supports the exact source-term alias, not a universal shape claim.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S04",
      "url": "https://brazilianmarket.ca/products/tapioca-granulada-da-terrinha",
      "title": "Brazilian Market Toronto, Tapioca Granulada (DA TERRINHA)",
      "accessedOn": "2026-10-11",
      "locator": "Product title, 500 g presentation, ingredient declaration, in-stock indication, and Canadian delivery information.",
      "supports": "A second Canadian retailer publicly lists a 500 g product as Tapioca Granulada and declares tapioca granulada as its ingredient. Its page showed an in-stock flag but also a best-before date of 2026-09-23, so it supports Canadian product naming, not verified current inventory or granule morphology.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S05",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca",
      "title": "Office québécois de la langue française, tapioca (GDT)",
      "versionOrDate": "Updated 2025",
      "accessedOn": "2026-10-11",
      "locator": "Definition and notes on tapioca forms.",
      "supports": "Defines tapioca as manioc-derived food starch and notes powder, flakes, small balls, and pearls as forms. Supports keeping the broad family term tapioca separate from the narrower source-defined granule subgroup.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S06",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26578849/perle-de-tapioca",
      "title": "Office québécois de la langue française, perle de tapioca (GDT)",
      "versionOrDate": "Updated 2025",
      "accessedOn": "2026-10-11",
      "locator": "Definition, preferred French term, and English equivalents.",
      "supports": "Defines a tapioca pearl as a small soft ball made from tapioca starch and gives the preferred French term perle de tapioca. Supports keeping spherical pearl products distinct from MAPA’s irregular polyhedral granulated subgroup.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S07",
      "url": "https://www.dubeloiselle.ca/fr/catalogue/product/130127",
      "title": "Dubé Loiselle, TAPIOCA GRANULE S/G BERTHELET",
      "accessedOn": "2026-10-11",
      "locator": "French product title and details, 2.27 kg dry item in dessert-cream-to-cook category.",
      "supports": "Attests the French Québec-facing phrase tapioca granulé. The listing does not give the product’s composition or granule shape and is not treated as evidence that this item is the Brazilian MAPA subgroup.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept only the Brazil-standardized polyhedral cassava-tapioca granule identity as Brazilian tapioca granules / tapioca granulé du Brésil, retaining tapioca granulada as the source-term alias in both locales. Keep spherical tapioca pérola or sagú artificial separate from active tapioca pearls and do not generalize the alias to all tapioca or cassava granules. Leave measurements and substitutions unresearched; add no forms, recipe links, conversions, yields, or runtime rules.",
      "sourceIds": [
        "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S01",
        "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S02",
        "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S03",
        "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S04",
        "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S05",
        "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S06",
        "WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S07"
      ]
    }
  ]
}
```

No ledger record is proposed for the held fufu candidates.

## Current catalog, ledger, legacy, and proposal audit

The audited snapshot contains **1,016 ingredient references, 66 forms, 1,296 ledger records / 4,171 source entries, 75 legacy candidates, and 114 manifest recipes / 1,123 ingredient rows**.

| Search or boundary | Current result and decision |
|---|---|
| `fufu`, `foufou`, `fufu flour`, `cassava fufu flour`, `fufu powder`, `akpu`, and `fufu mix` | No active reference, form, legacy candidate, or exact recipe-text/ingredient-row hit. No dedicated fufu record exists in the ledger; contextual mentions remain attached to existing product records and prior reviews. |
| `tapioca granulada`, `tapioca granule`, `granulated tapioca`, `tapioca granulé(e)`, `cassava granules`, `cassava semolina`, and `semoule de manioc` | No active reference, form, legacy candidate, or exact recipe-text/ingredient-row hit. Proposed ID `ingredient-ref-brazil-tapioca-granulada` is not active or allocated. |
| `cassava grits` | Current reference search resolves through `steamed cassava grits` on active `ingredient-ref-attieke`. Keep that existing attiéké alias narrow. |
| `tapioca` | Current search finds active `ingredient-ref-tapioca-starch` and `ingredient-ref-tapioca-pearls`. Do not add bare `tapioca` as an alias. |
| `tapioca pearls` / `perle de tapioca` | Active `ingredient-ref-tapioca-pearls`; it remains distinct from tapioca starch and the proposed polyhedral granule product. |
| `cassava flour` | Active `ingredient-ref-cassava-flour` is `edible cassava flour / farine comestible de manioc`, a whole-root flour. Do not map fufu flour to it without a source-qualified process identity. |
| `cassava starch` | Current results include both Brazilian `polvilho azedo` and `polvilho doce`; do not introduce an unqualified cassava-starch alias. |
| `gari` / `garri` | Preserve active `ingredient-ref-gari` with only its existing English `garri` spelling alias. Codex defines gari as a processed cassava product. |
| `attiéké`, `placali`, `lafun`, and `pupuru` | Preserve the existing active source-named identities and their current aliases. No proposed alias links them to fufu flour or tapioca granules. |

The ledger already contains separate active records for gari, attiéké, lafun, Placali, Pupuru, tapioca starch, tapioca pearls, edible cassava flour, green plantain flour, and yam flour. The legacy file contains no candidate matching the reviewed fufu or granule phrases. No matching term occurs in the 66 current forms.

The relevant earlier decisions remain in place: `wp02-west-african-cassava-flour-products-review-20261010.md` held generic fufu flour/blends and other regional granules; `wp06-brazil-cassava-products-resolution-20261009.md` held Brazilian `tapioca granulada`, `tapioca pérola`, and `sagú artificial` out of generic aliases; `wp02-section-b-regional-starch-next-gap-review-20261010.md` integrated attiéké; `wp02-next-b2-b3-flour-starch-review-20261011.md` integrated Placali; and `wp02-section-b-pupuru-identity-quebec-boundary-review-20261010.md` integrated Pupuru. The separate `wp02-agbelima-quebec-identity-boundary-review-20261011.md` hold remains unchanged. This proposal narrows the earlier Brazil granule hold to one source-qualified identity and leaves all other holds intact.

## Bundled recipe demand

I scanned all string content in the **114 manifest-listed recipe JSON files** and each of their **1,123 ingredient rows** for normalized whole phrases. There were zero full-recipe and zero ingredient-row matches for:

`fufu`, `foufou`, `fufu flour`, `cassava fufu`, `cassava fufu flour`, `fufu powder`, `fufu mix`, `plantain fufu`, `akpu`, `tapioca granulada`, `tapioca granule`, `granulated tapioca`, `tapioca granulé`, `tapioca granulée`, `cassava granules`, `cassava grits`, `cassava semolina`, and `semoule de manioc`.

This is a current bundled-library demand scan, not evidence that the products lack external culinary use. No recipe links, package yields, household measures, or substitutions are proposed.

## Source register

All web sources were accessed **2026-10-11**. Merchant pages support current public naming and availability only. They do not establish standard composition or synonymy unless their product-specific statement says so.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **S01** | Brazil, MAPA, [Instrução Normativa nº 23, 14 December 2005](https://sistemasweb.agricultura.gov.br/sislegis/action/detalhaAto.do?chave=1141329604&method=visualizarAtoPortalMapa), Annex, items 2.25–2.27 and 3.2.1–3.2.2. | Official cassava-root starch-product standard. Defines `tapioca granulada` as irregular polyhedral granules and `tapioca pérola` / `sagú artificial` as irregular spherical granules. Supports identity and morphology boundaries, not a recipe measurement or universal retail composition. |
| **S02** | Marché Brésil, [Yoki Granulated Tapioca Media 500g](https://www.marchebresil.com/en/products/yoki-media-de-tapioca-granule-500g), product title, description, and Chambly pickup information. | Current Québec listing gives the English wording, says the product is made from cassava, and offers local pickup. Retailer copy does not describe shape. |
| **S03** | Marché Brésil, [Tapioca Granulada Yoki Media 500g](https://www.marchebresil.com/pt/products/yoki-media-de-tapioca-granule-500g), Portuguese title and product description. | Same Québec item retains the source term `tapioca granulada` and says it is made from cassava. Supports the exact source-term alias. |
| **S04** | Brazilian Market Toronto, [Tapioca Granulada (DA TERRINHA)](https://brazilianmarket.ca/products/tapioca-granulada-da-terrinha), product title, 500 g size, ingredient declaration, and delivery section. | Public Canadian listing states `INGREDIENTES: Tapioca granulada`. It displayed an in-stock flag but a best-before date of 2026-09-23, before this review date, so use it as naming evidence only, not verified current inventory or granule morphology. |
| **S05** | OQLF, [tapioca (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca), updated 2025, definition and notes. | Defines tapioca as manioc-derived food starch and notes several forms. Supports keeping broad tapioca separate from the narrower Brazilian granule subgroup. |
| **S06** | OQLF, [perle de tapioca (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26578849/perle-de-tapioca), updated 2025, definition and preferred term. | Defines a pearl as a small soft ball made from tapioca starch and prefers `perle de tapioca` in French. Supports the spherical-pearl boundary. |
| **S07** | Dubé Loiselle, [TAPIOCA GRANULE S/G BERTHELET](https://www.dubeloiselle.ca/fr/catalogue/product/130127), French title and product details. | Québec distributor uses `tapioca granulé` for a dry 2.27 kg product in the dessert-cream-to-cook category. It does not identify composition or shape; the wording supports a descriptive French rendering only, not identity with the MAPA subgroup. |
| **S08** | Tropical Foods Company / Tropiway, [Making Fufu](https://www.tropiway.com/making-fufu), product explanation. | Manufacturer says plantain, cocoyam, and cassava are processed into powders and blended to make its plantain and cocoyam fufu flours. This is a brand-specific formulation statement, not a universal fufu-flour composition. |
| **S09** | Marché Chemin-du-Roy, [Tropiway farine de fufu plantain 1 lb / 680 g](https://marchecheminduroy.com/en/product/tropiway-farine-de-fufu-plantain-1lbs-680g/), product listing and seller address. | Current Trois-Rivières retailer uses the French-facing product title and listed it in stock. It attests local wording for a branded plantain fufu product, not a general French term or ingredient formula. |
| **S10** | Marché LT Eben-Ezer, [Montréal grocery listing](https://www.marchelteben-ezer.com/), current product list and store address. | Lists `Farine de Foufou Plantain Tropiway 680g` and a separate `Fufu Cameroun` item. Supports French-facing spelling and local assortment; listing detail does not define either product’s composition or state. |
| **S11** | Afromarket, [Farines](https://afromarket.ca/index.php/categorie-produit/farines/), current French-language product category. | Lists Tropiway plantain and cocoyam fufu, Kotoko Fufu, yam flour, and a manioc-and-corn mix separately. Supports product-name and blend diversity, not equivalence among them. |
| **S12** | Awoyale et al., [Assessment of the potential industrial applications of commercial dried cassava products in Nigeria](https://link.springer.com/article/10.1007/s11694-016-9428-7), *Journal of Food Measurement and Characterization* (2017), results comparing dried fermented products. | Primary study analyzes fufu flour and lafun as separate dried fermented products and reports sample-specific functional-property differences. It does not define a global recipe, package formula, or Québec term. |
| **S13** | Shittu and Adedokun, [Comparative Evaluation of the Functional and Sensory Characteristics of Three Traditional Fermented Cassava Products](https://journal.funaab.edu.ng/index.php/JNSET/article/view/1113), *Journal of Natural Sciences Engineering and Technology* (2009), abstract. | Primary study compares fufu, lafun, and pupuru flours and cooked doughs; its conclusion is limited to the tested market/consumer setting. It supports preserving those names as separate candidates, not a universal no-substitution rule for every product. |
| **S14** | SMK African Foods, [SkipTheDishes catalogue](https://www.skipthedishes.com/smk-african-foods-inc-206), flour-and-grain list. | Canadian marketplace lists `Cassava Fufu` with the description “Cassava fufu flour” separately from `Cassava Flour`. It gives no formula or process and does not establish a Québec French display. |
| **S15** | Moriel’s Oasis Foods, [Cassava Fufu Flour](https://morielsoasis.ca/products/untitled-oct4_15-14), current product page. | Canadian seller describes a 100% pure-cassava `Cassava Fufu Flour` and nationwide shipping but marked the listing sold out when reviewed. Product-specific seller claims do not establish whether the flour is fermented or equivalent to another market’s cassava fufu. |
| **S16** | OQLF, [farine de manioc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc), terminology entry authored by AFNOR (1979). | Defines dry-ground manioc-root flour and gives English `manioc flour` / `cassava flour`. It does not identify fufu flour or its process; the active row remains explicitly `edible cassava flour / farine comestible de manioc`. |
| **S17** | OQLF, [fécule de manioc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc), terminology entry authored by AFNOR (1979). | Defines a wet-extracted manioc starch product. Supports keeping extracted starch distinct from whole-root flour and the proposed granules. |
| **S18** | Codex Alimentarius, [Standard for Gari (CXS 151)](https://www.fao.org/input/download/standards/49/CXS_151f.pdf), product definition and naming section. | Defines gari as its own processed cassava product and retains the name gari in French. Supports keeping the active gari/garri identity separate from fufu and tapioca granules. |
| **S19** | IITA and Common Fund for Commodities, [Successes and Challenges of Cassava Enterprises in West Africa](https://biblio.iita.org/documents/U09BkSanniSuccessesNothomDev.pdf-0afb108c7435725b6abe20aa58983638.pdf) (2009), cassava processing and utilization, attiéké paragraph. | Describes attiéké as fermented cassava pulp processed and steam-cooked into granules. Supports preserving the active attiéké boundary; no generic `cassava grits` alias is inferred. |

## Proposal boundary

This proposal does not modify the active reference JSON, ledger, forms, recipes, plan, roadmap, code, or tests. It recommends one source-qualified reference addition for later integration and leaves generic fufu flour/blends and remaining regional cassava granules held.

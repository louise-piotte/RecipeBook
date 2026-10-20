# WP05 Section V — oolong tea identity review (R362)

- **Reviewed:** 2026-10-16
- **Packet type:** Integrated as a documentation and database-JSON identity update; no app code or software tests changed.
- **Scope:** One dry *Camellia sinensis* tea type: oolong tea. This addresses the open Section V tea-types item only.
- **Prior state:** The 2026-10-12 coffee, tea, and powdered-beverage review held oolong pending stronger type-classification and Québec French naming evidence. ISO's published tea-type classification and Québec tea-shop product pages support this bounded identity; they do not settle every tea family or synonym or establish current retail inventory.

## Recommendation

Add one identity-only reference to complete the tea-type subitem:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-oolong-tea` |
| English display | `oolong tea` |
| Québec French display | `thé oolong` |
| Category | `OTHER` |
| English/French aliases | none |
| Default density and unit mappings | none |
| Forms, recipe links, conversions, yields, substitutions | none |

Keep oolong distinct from the existing black tea, green tea, and matcha references. ISO 20715:2023 classifies oolong tea as one of six types of tea made from *Camellia sinensis*, alongside black, green, white, dark, and yellow tea. This supports a type-level identity rather than attaching oolong to black or green tea or treating it as a matcha form [S01, S02].

Use `thé oolong` for the Québec French display. The Québec sellers' reviewed pages use that wording in category and product titles [S05, S06]. Do not copy the 1982 OQLF entry's dated `thé Oolang` spelling as an alias; it is useful historical context, not recent product-name evidence [S04]. Do not add `blue tea`, `thé bleu`, `wu long`, or `wulong` as aliases. ISO lists “blue tea” as a synonym within its classification, but the local product sources support the more direct `oolong` / `thé oolong` phrasing, and no recipe needs the broader alternate terms [S01, S05].

This is a dry tea ingredient identity. Do not create brewed tea as a form or infer a dry-leaf-to-beverage ratio, steeping time, temperature, yield, or density. The reviewed standards classify product types; the retail pages' serving and brewing material is not a cross-product conversion source. Do not propose substitution among oolong, black tea, green tea, matcha, or herbal infusions.

## Catalog, picker, and recipe audit

The canonical package currently contains 1,693 ingredient references, 139 ingredient forms, 114 manifest-listed recipe files, and 1,123 ingredient rows. The live package and legacy-import catalog have no exact `oolong tea`, `thé oolong`, `oolong`, `wu long`, `wulong`, `blue tea`, `thé bleu`, or `thé Oolang` owner. No active form or form match term owns these phrases. The research ledger has verified records for `ingredient-ref-black-tea`, `ingredient-ref-green-tea`, and `ingredient-ref-matcha`, but no oolong record or oolong source entry. The neighboring tea references have no density, mappings, or forms; the seed package has no active substitution rule for these products.

Ingredient search normalizes accents and punctuation, then prefers complete word phrases before partial matches. The exact queries `oolong tea`, `thé oolong`, and `oolong` currently return no owner. `tea` currently returns the black- and green-tea identities. `thé` returns black tea, green tea, and matcha, plus `corn on the cob`: accent folding normalizes the query to `the`, which appears as a complete word in that English display. Adding the proposed row would make `tea` return three identities and `thé` return five; the existing corn-on-the-cob false positive remains. Leave aliases empty rather than adding redundant short forms or broader variants.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for tea, oolong, wulong, and related ingredient wording. There are no tea or oolong ingredient rows. No recipe link, recipe-name correction, or quantity change is proposed. This identity would provide optional catalog coverage only; the evidence does not establish recipe demand.

The package has no Oolong-specific form, density, unit mapping, package yield, active conversion, or substitution. Neither the tea-type standards nor the local retailer pages establish a reusable dry quantity, brewed yield, or kitchen conversion. Keep all numeric and substitution behavior empty.

## Product and naming boundaries

- Include source-attested dry products sold as oolong tea, regardless of cultivar, origin, leaf shape, roast, or oxidation level. Do not create one reference per regional style or brand in this packet.
- Keep black tea, green tea, white tea, matcha, dark tea, and yellow tea as distinct tea types if and when each is reviewed. Do not infer that every tea seller's category scheme is a global taxonomy.
- Do not use `tea` / `thé` alone as an alias for oolong; tea is the broader *Camellia sinensis* product class.
- Do not alias herbal tea, tisane, rooibos, butterfly-pea infusion, or other non-*Camellia sinensis* infusions. ISO's classification explicitly excludes herbal and fruit infusions from this tea-type taxonomy [S01].
- Do not treat a prepared oolong beverage, bubble-tea drink, flavored blend, tea extract, or instant tea as the same product identity without exact source or recipe evidence.
- No recipe-level or generic substitution, culinary use ratio, density, measurement, preparation conversion, package yield, or form is supported.

## Sources

Proposal-local source IDs are provenance labels only; they are not shared research-ledger entries. Sources were accessed 2026-10-16. Standards and public authorities support the tea classification; Québec retailers support current local wording and the existence of products they list. Retail claims about health effects, quality, or brewing are not adopted.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTION-V-OOLONG-TEA-R362-20261016-S01` | ISO, [ISO 20715:2023 — Tea: Classification of tea types](https://www.iso.org/obp/ui?_escaped_fragment_=iso:std:iso:20715:ed-1:v1:en), especially introduction and §§1, 3.14–3.17. | Current international classification identifies six *Camellia sinensis* tea types, including oolong, and excludes herb and fruit infusions outside *C. sinensis*. It is a classification standard, not a Québec French naming ruling, recipe-measure source, or guarantee that every commercial product fits one retail label. It lists “blue tea” within the oolong terminology but does not make that a preferred Québec display. |
| `WP05-SECTION-V-OOLONG-TEA-R362-20261016-S02` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 17, §17.1.1. | Defines tea as dried leaves and buds of *Camellia sinensis* prepared by usual trade processes. It supports the dry-leaf parent class, but it does not name or define oolong separately. |
| `WP05-SECTION-V-OOLONG-TEA-R362-20261016-S03` | Taiwan Ministry of Agriculture, Tea and Beverage Research Station, [Production & Marketing Information System of Taiwan Premium Tea](https://teaquality.tbrs.gov.tw/en/index.php), “Taiwan Tea Industry.” | Lists green, Paochong, oolong, and black among tea types produced in Taiwan and describes oolong as a major Taiwanese tea type. It is regional government agriculture/marketing information, not a global classification or French terminology source. |
| `WP05-SECTION-V-OOLONG-TEA-R362-20261016-S04` | OQLF, [thé chinois (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299026/the-chinois), last updated 1982. | Historical Québec terminology entry describes oolong among Chinese tea groupings and uses the spelling `Oolang`. Its age, cuisine-specific framing, and outdated spelling mean it is not used to set the current display or comprehensive taxonomy. |
| `WP05-SECTION-V-OOLONG-TEA-R362-20261016-S05` | OTENTIK Maison de thé, Repentigny, [Thé Oolong collection](https://otentik.ca/collections/thes-oolong). | Québec retailer collection page uses `THÉ OOLONG`, shows multiple product names, and describes the type. Supports local French market wording and distinct retail grouping only. Retail health claims and the product-category description are not treated as regulatory, scientific, or universal definitions. |
| `WP05-SECTION-V-OOLONG-TEA-R362-20261016-S06` | Oolong Dragon, Québec City, [Thé Oolong vieillit de 20 ans de Taiwan](https://oolongdragon.ca/product/the-oolong-vieillit-de-20-ans-de-taiwan/). | The French-language product title and description use `thé Oolong` for a named item. The page is treated as a product-name snapshot, not evidence of current inventory, generic terminology authority, package measures, density, or conversions. |

## Integration record

- Added identity-only `oolong tea / thé oolong` as `ingredient-ref-oolong-tea` in `OTHER`, with no aliases, forms, measures, density, mappings, conversions, yields, recipe links, or substitutions. Recorded six source entries and an accepted identity decision in the research ledger; measurement and substitution states remain `not_yet_researched`.
- The 114-recipe / 1,123-row bundle has no tea or oolong ingredient demand. The exact candidate phrases now resolve to the new identity. Broad `tea` search returns three tea identities; accent-folded `thé` returns five identities, including the pre-existing `corn on the cob` false positive. No recipes were relinked.
- The Section V tea-types checklist and roadmap were updated. Generated catalog index was regenerated; bundled-package and ledger validators passed. No software tests were run because this change only adds database JSON data, as allowed by `AGENTS.md`.

This resolves one identity/name evidence gap. It does not reopen Section V acidity or preservation constraints.

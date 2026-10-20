# WP06 Europe — Gorgonzola PDO identity review (R471)

- **Reviewed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17. The shared reference catalog and research ledger now contain the accepted identity-only row; the generated picker index, Europe checklist, roadmap, workflow, and integration record were updated. No recipe files changed.
- **Snapshot:** Ownership, counts, picker behavior, and corpus results below describe the shared workspace read on 2026-10-17.
- **Scope:** One named Northern Italian blue cheese, **Gorgonzola PDO**. Keep it separate from the broad blue-cheese family and other named blue cheeses.
- **Proposed reference ID:** `ingredient-ref-gorgonzola-pdo`.
- **Proposed source-ID prefix:** `WP06-EUROPE-GORGONZOLA-R471-20261017`, with `S01`–`S08`. The proposed reference ID, source IDs, URLs, and target path were checked for collisions.

## Recommendation

**Add** one identity-only `CHEESE` reference for **`Gorgonzola AOP / Gorgonzola PDO`**. The European Commission's in-force product specification registers `Gorgonzola` as an Italian AOP/PDO cheese and defines the protected product boundary. The Consortium's current French and English product pages use the matching qualified names and distinguish the sweet and piquant product types. [S01–S03]

Current Canadian and Québec product listings use `Gorgonzola DOP`, `Fromage gorgonzola`, and `Gorgonzola Cheese`. A Montréal distributor lists a 200 g `Gorgonzola DOP` item, and Costco Business Centre's French page lists an Italian 350 g `Gorgonzola` item whose details identify it as DOP. These listings corroborate local naming and limited current retail/distributor presence; they are not an independent certification audit. Metro's paired `Fromage gorgonzola` / `Gorgonzola Cheese` listing does not identify PDO status, so those unqualified phrases are not aliases for this PDO-bounded row. [S04–S07]

The WP06 Europe coverage checklist remains open. Prior reviews name Gorgonzola as a separate named blue-cheese identity but did not allocate it. R417 and R446 already keep it distinct from Roquefort, Fourme d'Ambert, and generic blue cheese. This review does not reopen those completed reviews or the R453 grissino and R457 turrón holds. [Plan; R417; R446]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-gorgonzola-pdo",
  "nameFr": "Gorgonzola AOP",
  "nameEn": "Gorgonzola PDO",
  "aliasesFr": ["Gorgonzola DOP", "Gorgonzola doux", "Gorgonzola piquant"],
  "aliasesEn": ["Gorgonzola DOP", "Gorgonzola dolce", "Gorgonzola piccante"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

The displays follow the Consortium's French `Gorgonzola AOP` and English `Gorgonzola PDO` wording. `Gorgonzola DOP` is retained in both alias lists because that exact acronym appears in current Canadian listings explicitly identifying DOP status. The French style aliases follow the Consortium's `Gorgonzola doux` and `Gorgonzola piquant`; the English aliases preserve its Italian style names `Gorgonzola dolce` and `Gorgonzola piccante`. Do not add `Fromage gorgonzola` or `Gorgonzola Cheese`: Metro's product page uses those unqualified phrases but does not establish that its SKU is PDO. [S02–S07]

Do not add generic `blue cheese / bleu`, `blue-veined cheese / fromage persillé`, cow's-milk cheese, product brands, or nearby blue-cheese names as aliases. Do not create ingredient forms for `dolce` and `piccante`: the specification describes them as taste and maturation types of the same protected cheese, not transferable processing states. The identity term remains the registered name `Gorgonzola`. [S01–S03]

## Product and naming boundaries

The current product specification describes Gorgonzola as a blue-veined cheese made exclusively from whole pasteurized cow's milk. It defines the production area in the provinces of Piedmont and Lombardy and distinguishes the sweet (`dolce`) and piquant (`piccante`) wheel types, with their own maturation ranges. The official French document identifies the registered designation as an AOP; its English counterpart calls it a PDO. [S01]

Keep these identities and uses separate:

- **`ingredient-ref-blue-cheese` / `blue cheese / bleu`:** retain the broad category. Do not add it as an alias for Gorgonzola. The current picker has one owner for `blue cheese`; this review preserves it. The existing generic ledger record and OQLF source explicitly establish the broad category and can be reused rather than duplicated. [Existing source `WP04-Q-CHEESE-20261010-S16`]
- **Roquefort, Fourme d'Ambert, and other named blue cheeses:** remain separate. Shared blue veins or a broad retailer aisle do not establish ingredient identity or a substitution. R417 and R446 retain the same boundary. [R417; R446]
- **Canadian retail titles without protected-origin evidence:** Metro's paired pages title the same item `Fromage gorgonzola` / `Gorgonzola Cheese` and classify it with blue cheeses, but do not say it is PDO. Keep both titles outside this row's aliases so an unqualified retailer SKU does not become a PDO assertion. [S06–S07]
- **Québec retail products without protected-origin evidence:** Mayrand lists a Castello `Gorgonzola coupé 400 g` item in its blue-cheese aisle and currently shows stock at three of its four Québec stores. The page does not identify the protected designation; do not treat that SKU as verified PDO product or attach its package amount to this row. [S08]
- **Prepared products and recipe descriptions:** a blue-cheese sauce, flavored item, cheese board, or recipe mentioning Gorgonzola does not establish a new Gorgonzola form or substitute.

No OQLF Gorgonzola terminology entry was established in this bounded source check. The French display is therefore taken from the French Consortium product designation, and local wording is corroborated by Québec retailer pages; it is not presented as an OQLF-preferred term. The EU regulation establishes the PDO product, not Canadian labelling law. The Canadian listings are evidence of their own wording only and do not independently establish that every locally listed Gorgonzola-style item complies with the EU specification. [S01–S08]

## Live ownership and archive audit

Read-only workspace snapshot checked on 2026-10-17:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,751 | No Gorgonzola name, alias, or proposed ID owner exists. `ingredient-ref-blue-cheese` is exactly `bleu / blue cheese`, with empty aliases. The active Roquefort and Fourme d'Ambert references remain distinct. |
| Ingredient forms | 141 | No Gorgonzola form, label, or match term was found. |
| Legacy import candidates | 56 | No Gorgonzola candidate or proposed reference ID was found. |
| Research ledger | 2,110 records; 9,613 source entries; 8,160 distinct source IDs; 6,873 distinct source URLs; 8 unit conversions | No Gorgonzola identity record, proposed ID, R471 source prefix, or proposed URL is allocated. All eight source IDs and URLs below are free. The existing generic blue-cheese record documents the broad owner and its distinction from named varieties. |
| Active substitutions and package yields | 0 global rules; 0 contextual rules; 1 package yield | No Gorgonzola rule, yield, or reference-specific conversion exists; the existing yield is unrelated. |
| Proposal and batch archive | Existing catalog archive | No Gorgonzola reference allocation, prior dedicated Gorgonzola review, R471 prefix, or proposed URL exists. The name appears only as a separate unallocated example in the WP04 residual cheese review, R417 Roquefort review, and R446 Fourme d'Ambert review. The target path is unallocated. |

The audited live inputs include the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). The proposal/source-ID prefix and all source URLs were also scanned in the proposal and batch archive. The Europe coverage item remains open in the [regional checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L9334).

## Phrase-first picker projection

The projection follows accent-, punctuation-, and case-folded phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including current attached form terms. It uses the proposed displays and aliases above, with no proposed forms.

| Query | Current result | With proposed row |
|---|---|---|
| `Gorgonzola`; `Gorgonzola AOP`; `Gorgonzola PDO`; `Gorgonzola DOP` | No result | `ingredient-ref-gorgonzola-pdo` only |
| `Gorgonzola doux`; `Gorgonzola piquant`; `Gorgonzola dolce`; `Gorgonzola piccante` | No result | `ingredient-ref-gorgonzola-pdo` only for each exact style phrase |
| `blue cheese` | Generic `ingredient-ref-blue-cheese` only | Same generic row only |
| `bleu`; `blue` | Six; seven current matches respectively | Unchanged; neither token is introduced by the candidate |
| `cheese`; `fromage` | 15; 13 current matches respectively | Unchanged; neither broad term is added to the candidate |
| `Gorgonzola Cheese`; `Fromage gorgonzola` | No result | No result; Metro's unqualified listing does not establish PDO status and is deliberately not assigned to this row |
| `DOP`; `PDO`; `AOP` | 3; 7; 10 current matches respectively | 4; 8; 11. Each adds this qualified identity while retaining existing protected products. |
| `doux`; `dolce`; `piquant`; `piccante` | 6; 0; 0; 0 | 7; 1; 1; 1. The exact official style aliases add the Gorgonzola row to these taste-descriptor queries. |

Exact qualified Gorgonzola and style queries gain a dedicated result without changing the generic blue-cheese, `bleu`, `blue`, `cheese`, or `fromage` result sets. The unqualified Metro title queries remain unmatched because the source does not verify the protected origin. The qualifier and style queries broaden only by the explicitly named Gorgonzola identity. Do not add bare `blue`, `bleu`, `doux`, `dolce`, `piquant`, or `piccante` aliases beyond the phrase-bearing official style aliases shown above.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8 in manifest order. Complete decoded recipe text and the ingredient-row fields were checked for `Gorgonzola`, the AOP/PDO/DOP variants, `Gorgonzola doux/piquant/dolce/piccante`, `fromage gorgonzola`, `blue cheese`, and `fromage bleu`. The scan found **zero matching recipe files, zero matching ingredient rows, and zero candidate-linked recipe IDs**. A substring-only French `bleu` match is the `bleuets` example in an overnight-oats topping note, not blue cheese or a Gorgonzola ingredient line.

The manifest-order recipe corpus contains **753,988 bytes** and has fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashes the concatenated bytes.

## Forms, measurements, and substitutions

The specification's whole-wheel weights, shape, and minimum/maximum maturation periods are product-standard facts, not recipe measures, count-to-mass conversions, package yields, or kitchen forms. The official sweet and piquant styles reflect flavour and aging differences; sources reviewed here provide no common form-conversion relationship. [S01–S03]

The current Canadian listings show package-specific amounts: Macchi's 200 g `Gorgonzola DOP`, Costco's 350 g item, Metro's approximate 165 g cut piece, and Mayrand's approximate 400 g cut SKU. Metro's selected store listing currently reports out of stock. These are SKU or weighed-cut facts only, not reusable measures or density observations. Mayrand's Castello listing also does not confirm PDO status. [S04–S08]

If integrated, keep forms empty, `defaultDensity` null, and `unitMappings` empty. Add no measurement observation, conversion, package-yield rule, recipe link, or recipe-specific amount. No source reviewed provides a substitution ratio or dish-specific replacement rule. Keep global and contextual substitutions empty and leave `substitutionResearchState: not_yet_researched`; do not infer interchangeability with generic blue cheese, Roquefort, Fourme d'Ambert, or another named blue cheese. [S01–S08]

## Source register

The eight source IDs and exact URLs below were accessed or checked on 2026-10-17 and are now registered on the accepted Gorgonzola ledger record. Search-indexed retailer facts are identified as such where direct page retrieval was unavailable. Reuse the existing generic blue-cheese OQLF source under its current ID; do not duplicate it.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-GORGONZOLA-R471-20261017-S01` | European Commission, [Implementing Regulation (EU) 2017/1595, French official text and single document](https://eur-lex.europa.eu/legal-content/FR/TXT/PDF/?uri=CELEX%3A32017R1595), Annex, sections 1–3 and product specification. | Primary legal source for registered designation `Gorgonzola`, Italian AOP status, cheese class, whole pasteurized cow's milk, blue-veined product description, production region, wheel classes, dimensions, maturation ranges, and non-edible rind. Wheel standards and ageing periods are not culinary measures. EUR-Lex marks the act in force with no end date. |
| `WP06-EUROPE-GORGONZOLA-R471-20261017-S02` | Consorzio per la tutela del formaggio Gorgonzola, [French product page — Le Gorgonzola](https://fr.gorgonzola.com/le-gorgonzola/), product description and production section. | Current French Consortium wording for Gorgonzola AOP, `Gorgonzola doux` and `Gorgonzola piquant`, pasteurized milk from the origin area, selected cultures, and style-specific aging ranges. Producer-group source; not an independent Québec terminology ruling. |
| `WP06-EUROPE-GORGONZOLA-R471-20261017-S03` | Consorzio per la tutela del formaggio Gorgonzola, [English product page — The Gorgonzola](https://en.gorgonzola.com/the-gorgonzola/), product description and production section. | Current English Consortium wording for Gorgonzola PDO and the `Gorgonzola dolce` / `Gorgonzola piccante` styles. Supports the bilingual display and style aliases; not a Canadian regulatory source. |
| `WP06-EUROPE-GORGONZOLA-R471-20261017-S04` | Distributions Macchi Inc., [Commande rapide](https://macchiinc.com/commande-rapide/), current `Gorgonzola DOP 200g` item; Montréal address at 8532, 8e avenue. | Current Montréal distributor listing and exact DOP wording. The 200 g is package-specific; public listing does not prove consumer eligibility, store inventory, or independent PDO certification. |
| `WP06-EUROPE-GORGONZOLA-R471-20261017-S05` | Costco Business Centre Canada, [French Igor Gorgonzola 350 g listing](https://www.costcobusinesscentre.ca/p/-/igor-gorgonzola%2C-350-g/4201105112?langId=-25), item 1370247. | Current indexed Québec-facing product title `Igor - Gorgonzola`; details say `Gorgonzola DOP` and made in Italy. Page states delivery only to businesses in its designated delivery area and that availability can change. Direct page retrieval returned a cache miss during this review, so use its indexed page content for wording/listing context, not stock verification. |
| `WP06-EUROPE-GORGONZOLA-R471-20261017-S06` | Metro Canada, [French Fromage gorgonzola listing](https://www.metro.ca/epicerie-en-ligne/allees/produits-laitiers-et-oeufs/fromages-fins/fromages-bleus-et-roquefort/fromage-gorgonzola/p/239139), product 239139. | French-language product title and Canadian retail terminology. The selected-store context displayed Metro Devonshire and the listing reported the item out of stock; no Québec-specific stock is established. This listing does not identify the cheese as PDO, so its title is not added as an alias. The displayed approximately 165 g is an average for this retailer's cut piece only. |
| `WP06-EUROPE-GORGONZOLA-R471-20261017-S07` | Metro Canada, [English Gorgonzola Cheese listing](https://www.metro.ca/en/online-grocery/aisles/dairy-eggs/deli-cheese/blue-cheese-rocquefort/gorgonzola-cheese/p/239139), product 239139. | Paired English listing for the same Metro item, supporting exact title `Gorgonzola Cheese`. It shares the same stock and product-identity limits as S06 and is not an independent market observation or evidence of PDO status; do not add this phrase as an alias. |
| `WP06-EUROPE-GORGONZOLA-R471-20261017-S08` | Mayrand Québec, [Gorgonzola coupé 400 g](https://mayrand.ca/fr/nos-produits/produits-laitiers/fromage/fromage-bleu/fromage-bleu-gorgonzola-coupe-castello-08491), Castello item 08491. | Current page uses the Québec title `Gorgonzola coupé 400 g` and shows it in stock at Anjou, Brossard, and Saint-Jérôme while Laval is marked “Bientôt disponible.” The product is categorized as blue cheese but is not identified as Gorgonzola PDO; this is local naming and availability context, not protected-origin verification. The approximate 400 g cut package is SKU-specific. |
| Existing source `WP04-Q-CHEESE-20261010-S16` | Office québécois de la langue française, [GDT — bleu / blue cheese](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2073052/bleu), already recorded in the generic blue-cheese ledger record. | Reuse only for the broad Québec term and the generic-category boundary. It does not identify Gorgonzola or serve as the proposed display-name authority. |

## Disposition

Integrated one identity-only `CHEESE` row for **`Gorgonzola AOP / Gorgonzola PDO`**, with source-backed DOP and style aliases. `blue cheese / bleu`, Roquefort, Fourme d’Ambert, and other named cheeses remain separate choices. Exact qualified and style queries resolve to the new identity while generic blue-cheese and broad cheese queries remain unchanged. No forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions were added. The Europe-wide regional coverage checklist remains open.

Static package normalization, generated-index freshness, ledger schema and source ownership, picker projection, complete recipe scan, encoding, local links, and whitespace checks passed. No software tests, build, emulator run, or deployment were performed for this database-JSON addition under `AGENTS.md`.

Post-integration snapshot: 1,752 ingredient references / 141 forms; 2,111 ledger records / 9,621 source entries / 8,168 distinct source IDs / 6,881 distinct source URLs; 114 recipes / 1,123 ingredient rows.

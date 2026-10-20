# WP06 Europe — Taleggio PDO identity review (R423)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review creates only this proposal file; it does not change catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Snapshot:** Ownership, picker, and recipe-corpus findings describe the workspace read on 2026-10-17.
- **Scope:** One Northern Italian regional cheese identity: Taleggio PDO. Keep the protected product distinct from generic washed-rind cheese and the separately named Québec-made `Taleggio Localé` product.
- **Source-ID prefix:** `WP06-EUROPE-TALEGGIO-R423-20261017`. The proposed reference ID, source prefix, source URLs, and proposal path were checked for collisions.

## Recommendation

Add one identity-only `CHEESE` reference for **`Taleggio AOP / Taleggio PDO`**, with narrow French and English aliases for current Québec-facing product wording. The European Commission approved non-minor amendments to the protected product specification in 2022. Its single document reserves the name for a soft table cheese made from whole raw or pasteurized cow’s milk from the defined area in Lombardy, Piedmont, and Veneto, and specifies the product’s production and maturation area. [S01–S02]

Current Québec-facing sources use `Fromage Taleggio` and `Taleggio Cheese` for the same Mayrand item, while Fromagerie Hamel lists `Taleggio, A.O.P.` among its current store selection. These sources support the localized display and search wording. Mayrand currently marks this SKU “Bientôt disponible” at its listed Québec stores, and Hamel says store availability may vary; neither page proves current stock. [S03–S05]

The active global checklist remains open for **Western, Southern, Northern, Central, and Eastern Europe**, including cheese traditions. This one product review does not close any regional coverage item. [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9036)

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-taleggio",
  "nameFr": "Taleggio AOP",
  "nameEn": "Taleggio PDO",
  "aliasesFr": ["fromage Taleggio"],
  "aliasesEn": ["Taleggio cheese"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

The displays name the protected designation in each language; the aliases preserve the exact Canadian retailer titles. Do not add `Taleggio Localé`, `Taleggio-style`, generic `washed-rind cheese`, `soft cheese`, a brand, or an unqualified product description as aliases. Do not claim OQLF has normalized the French display: the wording here follows current Québec retail use and a Québec cheese shop’s `A.O.P.` listing. [S03–S06]

## Product and naming boundaries

The EU’s approved specification identifies **Taleggio** as a PDO. It is a soft table cheese made from whole raw or pasteurized cow’s milk, rennet, salt, and lactic starter cultures. The milk must come from cows reared in the defined area; the specification requires all production stages, including maturation, to take place within that area. The document defines the area by provinces in Lombardy, Piedmont, and Veneto. [S01–S02]

Keep adjacent products distinct:

- **`ingredient-ref-blue-cheese` / blue cheese / bleu:** a broad blue-cheese category, not Taleggio or an alias for the PDO.
- **Other named cheeses:** active Gruyère, Manchego, mozzarella, Parmesan, Roquefort, Tête de Moine, and burrata references remain separate identities. Similar use in a recipe or shared cheese category does not make them equivalent.
- **`Taleggio Localé`:** International Cheese Inc. currently lists this as a Québec, Italian-style, cow-milk, semi-soft, washed-rind cheese. Its Québec product wording is not an alias or evidence that it is the Italian PDO. Keep it separate; its own identity remains unallocated. [S06]
- **`Taleggio DOP`, `Taleggio AOP`, and PDO marks:** only the exact French and English spellings in the proposed row are used. Do not infer that every Canadian product page saying `Taleggio` identifies a certified PDO SKU; the Mayrand listing does not show an AOP/PDO mark. [S03–S05]

WP04’s [residual cheese review](wp04-cheese-dairy-residual-identity-review-20261010.md) discussed regional cooking cheeses as a broad open family but made no Taleggio-specific allocation. [R417](wp06-europe-next-regional-identity-review-r417-20261017.md) mentions Taleggio neither as a Roquefort alias nor as a prior identity decision. A targeted search of the current Europe proposals, archived proposals and batches, plan, roadmap, live reference data, forms, legacy candidates, and ledger found no previous dedicated Taleggio review or allocation. The Europe coverage checklist remains open. [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9036)

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,721 | No Taleggio name, alias, proposed reference ID, or `Taleggio Localé` owner. Nearby cheese references remain distinct. |
| Ingredient forms | 141 | No Taleggio form, label, or match term. |
| Legacy import candidates | 56 | No Taleggio or Taleggio Localé candidate. No legacy ID is available to reuse. |
| Research ledger | 2,080 records; 9,424 source entries; 8 unit conversions | No Taleggio record, exact source-ID prefix, or exact source-URL collision. No source identifies a Taleggio substitution or a reusable unit conversion. |
| Global/contextual substitutions and package yields | 0 global; 0 contextual; 1 package yield | No Taleggio rule or yield. The existing package-yield record is unrelated. |
| Proposal and batch archive | Current workspace snapshot | No dedicated Taleggio identity review or previous allocation. WP04’s regional-cheese language is a broad coverage note, not a Taleggio decision. The target path is unallocated. |

The audited live inputs are the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). The existing cheese rows for generic blue cheese, Gruyère, Manchego, mozzarella, Parmesan, Roquefort, Tête de Moine, and burrata are neighboring identities only; none owns Taleggio wording. Source IDs and URLs below are proposal-local and were absent from the live ledger when checked.

## Phrase-first picker projection

The projection follows case-, accent-, punctuation-, and space-normalized phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses the proposed displays and two narrow aliases above.

| Query | Current result | With proposed row |
|---|---|---|
| `Taleggio`; `Taleggio AOP`; `Taleggio PDO` | No result | `ingredient-ref-taleggio` only |
| `fromage Taleggio`; `Taleggio cheese` | No result | `ingredient-ref-taleggio` only |
| `cheese` | 14 results | 15, including Taleggio |
| `fromage` | 12 results | 13, including Taleggio |
| `blue cheese`; `bleu` | 1; 6 results | Unchanged; Taleggio is not added as an alias |
| `Taleggio Localé` | No result | No result; the separate Québec product is not an alias |

The exact `Taleggio` query will resolve to the PDO row under today’s catalog. The full `Taleggio Localé` phrase stays unresolved. If a distinct Québec-made reference is proposed later, recheck the short `Taleggio` query so users can see both identities rather than routing that phrase through a style alias.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan searched each full decoded recipe document and all ingredient-row fields—including source text, name, reference ID, and form ID—for `Taleggio`, `Taleggio AOP`, `Taleggio PDO`, `Taleggio DOP`, `fromage Taleggio`, `Taleggio cheese`, `Taleggio Localé`, and the proposed reference ID. It found **zero matching files, zero matching ingredient rows, and zero linked recipe IDs**.

This corpus snapshot totals **753,988 bytes** and has manifest-order fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative recipe path, a NUL byte, the lowercase SHA-256 digest of that file, and a newline, then hashes the concatenated bytes. The bundle supplies no Taleggio form, amount, recipe link, or substitution context.

## Forms, measurements, and substitutions

- The EU specification’s **1.5–2.5 kg** whole-cheese range at the end of the minimum maturation period and its **35-day** maturation requirement are product and process specifications, not kitchen measures. Do not use them for a default measure, form, or density. [S02]
- Mayrand lists an Auricchio **200 g** unit and a ten-unit case for SKU 15204. These are package details for that SKU, not a generic Taleggio mass or package-yield rule. Its current listing marks the item “Bientôt disponible” at the listed stores. [S03–S04]
- RICARDO’s sponsored Québec-facing arancini recipe lists **225 g Taleggio** in a batch yielding approximately 65 pieces. Keep this as that recipe’s ingredient quantity only; the page does not certify the exact cheese as PDO, define a serving amount, or establish a reusable conversion. It is not bundled-library demand. [S07]
- If a ledger identity record is created, set `measurementState` to `researched_no_supported_value`, keep `measurementObservations` empty, and retain the recipe amount in source evidence only. Set `defaultDensity` to null and `unitMappings` to empty; add no form, conversion, package yield, or recipe link.
- RICARDO’s recipe uses Taleggio with Parmesan, so co-use is not substitution evidence. The other reviewed identity and retail sources provide no replacement direction or ratio. Set `substitutionResearchState` to `not_yet_researched` and add no global/contextual substitution, inverse rule, or recipe-line link. [S07]

## Evidence gaps

- A targeted OQLF lookup did not provide a Taleggio cheese entry. The French display is therefore supported by current Québec retail and specialty-shop usage, not an OQLF terminology ruling.
- Mayrand’s product title is current, but the item currently shows “Bientôt disponible” at all listed Québec locations. Hamel lists the AOP product in a store selection and warns that stock varies. These are current naming sources, not evidence of province-wide or immediate availability.
- The Mayrand listing does not show a PDO mark; RICARDO’s recipe names Taleggio without an AOP/PDO qualifier and is sponsored content. Neither source alone demonstrates that the exact item in that page was PDO-certified. The EU specification and Hamel listing support the protected identity independently.
- `Taleggio Localé` is a current Québec product name with overlapping terminology. It is kept outside this row; its exact product-family coverage remains a separate future review if the catalog needs it.

## Source register

Sources were accessed on 2026-10-17. The proposed source IDs and exact URLs were checked against the live ledger; no duplicate source IDs or exact URL collisions were found.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-TALEGGIO-R423-20261017-S01` | European Commission, [Commission Implementing Regulation (EU) 2022/955](https://eur-lex.europa.eu/eli/reg_impl/2022/955/oj/eng), 14 June 2022. | Primary legal source approving non-minor amendments to the Taleggio PDO specification; the regulation is in force with no stated end date. |
| `WP06-EUROPE-TALEGGIO-R423-20261017-S02` | European Commission, [Official Journal C 72/10, amended Taleggio single document](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A52022XC0214%2802%29), §§ 1–4, 14 February 2022; amendment approved by S01. | Defines the protected name, cheese class and product, cow-milk origin, geography, production/maturation conditions, 35-day minimum, and 1.5–2.5 kg whole-cheese range. The weight and aging values are specification data, not recipe measures. |
| `WP06-EUROPE-TALEGGIO-R423-20261017-S03` | Mayrand, [Fromage Taleggio](https://mayrand.ca/fr/nos-produits/produits-laitiers/fromage/fromage-italien/fromage-taleggio-15204), item 15204, accessed 2026-10-17. | Current Québec French retailer title `Fromage Taleggio 200 g`, Auricchio brand, one 200 g unit and ten-unit case. The page says “Bientôt disponible” at its listed stores; package data and availability are SKU/store-specific. |
| `WP06-EUROPE-TALEGGIO-R423-20261017-S04` | Mayrand, [Italian cheese](https://mayrand.ca/en/our-products/cheese-and-dairy/cheese/italian-cheese?page=1), item 15204, accessed 2026-10-17. | Current English listing for the same Auricchio SKU as S03, titled `Taleggio Cheese 200 g`. Supports the English search wording; it is the same retailer and SKU, not independent product or measurement evidence. |
| `WP06-EUROPE-TALEGGIO-R423-20261017-S05` | Fromagerie Hamel, [Pâtes molles](https://www.fromageriehamel.com/produits/pates-molles/), accessed 2026-10-17. | Current Montréal specialty-shop page includes `Taleggio, A.O.P.` in its store selection and says availability varies by shop. Supports Québec-facing protected-name wording; not a guarantee of stock. |
| `WP06-EUROPE-TALEGGIO-R423-20261017-S06` | International Cheese Inc., [Taleggio Localé](https://internationalcheeseinc.com/product/taleggio-locale/), accessed 2026-10-17. | Current Canadian producer catalog names a distinct Québec `Taleggio Localé` and tags it `Quebec` and `Italian-style`. Supports keeping that local product outside PDO aliases; does not define the whole Canadian style market. |
| `WP06-EUROPE-TALEGGIO-R423-20261017-S07` | RICARDO, [Arancinis au fromage](https://www.ricardocuisine.com/recettes/5559-arancinis-au-fromage), ingredient list and yield, accessed 2026-10-17. | Québec-facing sponsored recipe lists 225 g `fromage Taleggio` in a batch yielding approximately 65 arancini. Supports one source-specific recipe amount and local French wording; it does not identify a certified PDO SKU, standard serving, or replacement. |

## Disposition

Proceed with one identity-only `CHEESE` row for **`Taleggio AOP / Taleggio PDO`**, with `fromage Taleggio` and `Taleggio cheese` as the only search aliases. Keep the Québec-made `Taleggio Localé`, generic washed-rind cheese, blue cheese, and other named cheeses separate. Add no forms, density, mappings, package yields, recipe links, conversions, or substitutions. Treat RICARDO’s 225 g as external recipe evidence only; do not convert it into reusable measurement behavior. Leave the Europe-wide coverage checkbox open.

No tests, build, emulator run, or deployment were performed because this is a proposal-only documentation change.

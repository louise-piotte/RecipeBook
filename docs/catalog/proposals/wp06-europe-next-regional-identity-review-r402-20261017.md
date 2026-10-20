# WP06 Section 05 — Comté cheese identity review (R402)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review changes only this proposal file; it does not change catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Scope:** One Eastern French cheese identity: Comté.
- **Source-ID prefix:** `WP06-EUROPE-COMTE-R402-20261017`. IDs below are proposal-local and were checked for collisions.

## Recommendation

Add one identity-only `CHEESE` reference for **`fromage Comté / Comté cheese`**, with one narrow French alias matching a Québec recipe's `fromage Comté AOP` wording. INAO identifies Comté as an AOP cheese produced in the Jura massif; the EU published an approved amendment to its product specification in May 2026. Current Québec retailer listings use the product name in French and English, and Québec-facing recipe pages call for Comté by name. [S01–S06]

The bundled library does not currently need this identity: its 114 manifest-listed recipe files and 1,123 ingredient rows have no Comté match. The Quebec-published recipe evidence is external demand, not a bundled recipe link. Keep the proposal narrow: add only the identity, with no forms, reusable measures, density, unit mappings, package yields, conversions, recipe links, or substitutions.

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-comte-cheese",
  "nameFr": "fromage Comt\u00e9",
  "nameEn": "Comt\u00e9 cheese",
  "aliasesFr": ["fromage Comt\u00e9 AOP"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

The French display follows current Québec retail and recipe wording; the English display makes the cheese identity explicit while retaining the protected product name. The single alias preserves a recipe-attested French qualifier; no broader geographic or cheese-class alias is proposed. Accent-folded picker search will also accept the retailer's unaccented English spelling `Comte`. No Comté form or reusable kitchen measure is supported or proposed.

## Product identity and Québec naming

INAO lists **Comté** as an AOP and places its production area in the Jura massif, principally in Doubs, Jura, and Ain. The European Commission's May 2026 publication identifies the updated product specification for the protected name. This supports a region-bounded cheese identity; it does not make Comté a synonym for generic hard cheese, Gruyère, Vacherin, or other cooked pressed-paste cheeses. Keep the active `ingredient-ref-gruyere` identity separate. [S01–S02]

Mayrand's current French catalog lists a Juraflore product as **`Fromage comté affiné`**; its English catalog lists the same product code as **`Comte Fine Cheese`**. These titles establish current Québec retail wording and an English-market spelling, not a general aging form or a reusable product size. Store the accented protected name in both displays and rely on existing accent-folded search for `Comte`. Do not add `affiné`, `fine cheese`, the brand, product code, or package wording as global aliases. [S03–S04]

Two Québec-facing recipe sources also use Comté by name. RICARDO's current recipe page calls for **fromage Comté AOP**; the page identifies its content as sponsored by Fromages d'Europe, so it supports an observed recipe use rather than editorial consensus. Metro's French recipe for stuffed conchiglioni calls for grated Comté and credits CNIEL. These recipe pages show external recipe use but do not establish universal amounts or a substitute. [S05–S06]

OQLF's accessible GDT entry for *comté* concerns a county, not cheese terminology. This review does not claim an OQLF-approved Québec cheese term; the proposed descriptive French name is grounded in the current local retailer and recipe usage above. [S07]

Keep these boundaries:

- **Gruyère:** a separate active cheese identity. A family resemblance or shared culinary role does not make Comté an alias or interchangeable product.
- **Vacherin and Tomme de Savoie:** distinct cheeses named alongside Comté in the reviewed recipes, not synonyms or global substitutions.
- **`Comté AOP`:** the Québec recipe's exact `fromage Comté AOP` wording supports one French search alias; it does not justify broader `AOP cheese`, `Jura cheese`, or generic aged-cheese aliases.
- **Retailer and producer labels:** Juraflore and the specific catalog titles stay as evidence, not global aliases.

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Live count | Finding |
|---|---:|---|
| Active ingredient references | 1,709 | No active name or alias owns `Comté`, `Comte`, `fromage Comté`, `Comté cheese`, `Comté AOP`, `fromage Comté AOP`, or `Juraflore`; no `ingredient-ref-comte-cheese` row. |
| Ingredient forms | 141 | No Comté label or match term. |
| Legacy import candidates | 56 | No Comté candidate or proposed reference ID. |
| Research ledger | 2,069 records | No Comté identity record, R402 source-ID prefix, proposed reference ID, or exact source-URL match. |
| Proposal and batch archives | — | No earlier Comté identity review or allocation. R393 brunost, R396 burrata, and R399 nduja remain distinct reviews. |

The scan checked normalized bilingual names and aliases, form labels and match terms, and legacy candidate text. All seven source URLs below were absent from the ledger before this proposal; the target proposal path and proposed reference ID were unallocated. The only nearby active identity is `ingredient-ref-gruyere` (`gruyère / gruyere`, with the English alias `gruyere cheese`); it does not own a Comté phrase. The Europe checklist remains open and is not changed here.

## Exact picker projection

The current picker uses normalized complete word-phrase matches before partial matches. Accent folding makes `Comte` and `Comté` equivalent for search while preserving the display text. [Implementation: `IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)

| Query | Current result | With proposed row |
|---|---|---|
| `Comté`; `Comte`; `fromage Comté`; `Comté cheese`; `Comté AOP`; `fromage Comté AOP` | No result | `ingredient-ref-comte-cheese` only |
| `AOP cheese`; `Jura cheese`; `aged cheese` | No Comté result | No Comté result; broad product descriptions are not aliases |
| `Gruyère`; `gruyere cheese` | `ingredient-ref-gruyere` | Same single result; no Comté alias is added to it |
| `Juraflore`; `Comte Fine Cheese`; `Fromage comté affiné` | No result | No result; retailer and brand titles remain evidence only |

## Recipe-demand and numeric boundary

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were scanned for Comté/Comte, `fromage Comté`, `Comté cheese`, `Comté AOP`, `Comté râpé`, and Juraflore wording, including full recipe text and ingredient objects. The scan found **zero matching bundle files, zero matching ingredient rows, and zero recipe links**. The manifest-order recipe fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`.

RICARDO and Metro provide external Québec-facing recipe uses, but their recipe-specific ingredient amounts do not establish a reusable measure, serving factor, density, yield, conversion, or package mapping. Neither source validates a substitute. No numeric or substitution data is proposed.

## Source register

Pages were accessed on 2026-10-17. Source IDs are proposal-local; source-ID prefix and URL checks found no collision in the live ledger or archives.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-COMTE-R402-20261017-S01` | INAO, [Comté](https://www.inao.gouv.fr/produit/comte-21935), product identity, AOP mark, and geographic-area section. | Official French origin-and-quality authority for the registered product and its Jura-area scope. Does not establish Québec terminology or retail availability. |
| `WP06-EUROPE-COMTE-R402-20261017-S02` | European Commission, [2026 approved Comté product-specification amendment](https://eur-lex.europa.eu/eli/C/2026/2773/oj/eng/pdf), Official Journal C/2026/2773, published 2026-05-13. | Primary EU publication for the current protected product name and specification. Its technical composition and package rules are not copied into the catalog proposal. |
| `WP06-EUROPE-COMTE-R402-20261017-S03` | Mayrand, [Fromage](https://mayrand.ca/fr/nos-produits/produits-laitiers/fromage), Juraflore item 14190, product title `Fromage comté affiné`. | Current Québec French retailer listing. Its brand, title adjective, and SKU details remain retailer-specific; listing does not prove province-wide stock. |
| `WP06-EUROPE-COMTE-R402-20261017-S04` | Mayrand, [Swiss, comte, gruyere cheese](https://mayrand.ca/en/our-products/cheese-and-dairy/cheese/swiss-comte-gruyere-cheese), Juraflore item 14190, title `Comte Fine Cheese`. | Current English retailer listing for the same item as S03. The spelling corroborates accent-folded search; it is not an independent product or measurement source. |
| `WP06-EUROPE-COMTE-R402-20261017-S05` | RICARDO, [Poulet et chou-fleur gratinés, kale et fromage bleu](https://www.ricardocuisine.com/recettes/10143-poulet-et-chou-fleur-gratines-kale-et-fromage-bleu), ingredient list. | Québec-facing recipe page names `fromage Comté AOP`; the page states that the recipe was created in collaboration with Fromages d'Europe and is sponsored content. Recipe use only. |
| `WP06-EUROPE-COMTE-R402-20261017-S06` | Metro, [Conchiglioni farcis aux fromages](https://www.metro.ca/recettes-et-occasions/recettes/conchiglioni-farcis-aux-fromages), ingredient and preparation sections; recipe credits CNIEL. | Québec-hosted French recipe calls for grated Comté alongside Tomme de Savoie. The page supports a named recipe use, not a reusable amount or substitute. |
| `WP06-EUROPE-COMTE-R402-20261017-S07` | Office québécois de la langue française, [comté (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357170/comte). | Bounded terminology check: this entry is for a county and has no cheese definition. It is explicitly not used as a Québec cheese-term authority. |

## Disposition

Proceed with one identity-only `CHEESE` row for **`fromage Comté / Comté cheese`** if accepted. The AOP's geographic scope, current Québec market wording, and published Québec recipe uses support this narrow allocation even though the bundled corpus currently has no Comté demand. Keep the bundle link, forms, further aliases, measurements, conversions, and substitutions empty. Leave the overall Europe checklist open.

No software tests, build, or emulator run were performed because this is a proposal-only documentation change.

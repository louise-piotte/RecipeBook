# WP06 Section 05 — Basque Espelette pepper powder identity review (R408)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review creates only this proposal file; it does not change shared catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Scope:** One Basque regional spice product: ground/powdered Piment d'Espelette, with a boundary against locally grown Gorria-type peppers.
- **Source-ID prefix:** `WP06-EUROPE-ESPELETTE-PEPPER-R408-20261017`. The prefix, proposed reference ID, and source URLs were checked for collisions.

## Recommendation

Add one identity-only `BAKING_AND_SPICE` reference for **`piment d'Espelette moulu / Espelette pepper powder`**. The EU's current product specification defines Piment d'Espelette as a protected designation of origin (PDO) tied to a defined Basque production area and identifies powder as one of its three presentations. Current Québec-facing sources use `piment d'Espelette moulu`; Canadian English retail and recipe sources use `Espelette pepper` and `Espelette pepper powder`. [S01–S06]

Keep this row to the **powder presentation**. The PDO also covers fresh whole peppers and strings, but those are outside this review. A Québec-grown `Piment Gorria` product is a related cultivar product, not the protected Basque PDO; the Gorria product listing and official PDO boundary must not be collapsed into one identity. [S02, S07]

The bundled corpus has no matching ingredient line. Add no recipe link, form, density, unit mapping, conversion, yield rule, or active substitution rule. If accepted, preserve the two Metro recipe-specific pinch quantities in the source evidence; neither has a mass or volume equivalent. A separate Metro recipe offers Espelette pepper or cayenne pepper “to taste” in one pizza formula. Record that source wording only: it does not establish a directional, tested, reusable rule or replacement ratio. [S04, S07]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-espelette-pepper-powder",
  "nameFr": "piment d'Espelette moulu",
  "nameEn": "Espelette pepper powder",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "BAKING_AND_SPICE"
}
```

The English and French displays are grounded in a Canadian English product title, a current Québec French retailer title, and Québec recipe wording. The shorter phrases `Espelette pepper` and `piment d'Espelette` remain discoverable within these displays through the current phrase-first search behavior, so no spelling, brand, or generic pepper aliases are needed. Do not add `Ezpeletako Biperra`: the official name covers the fresh, string, and powder presentations, while this proposal is limited to powder. No OQLF or TERMIUM preferred-term entry was found in the bounded naming search; the French display is presented as current Québec product usage, not an official terminology ruling.

## Identity and product boundaries

The European Commission's 2025 amendment identifies the protected name as **`Piment d'Espelette / Piment d'Espelette – Ezpeletako Biperra`**, a French PDO. It specifies *Capsicum annuum* from Gorria seed or a qualifying local varietal type and requires production from sowing through packaging to occur inside the defined area. The registered product appears fresh and whole, in strings, or as powder; the powder is ripened, dried, and ground. INAO identifies the appellation's area in the Basque part of the Pyrénées-Atlantiques and classifies the product as a spice. These sources support a regional product identity, not a generic name for every Gorria cultivar or ground red pepper. [S01–S02]

The proposed row is only for the ground spice as used in the Québec retail and recipe sources. It does not cover fresh whole Piment d'Espelette or strings of peppers. It also does not claim that every retail listing using the phrase without an explicit PDO mark has verified origin. The exact product-title wording supports Québec naming; the official specification supports the protected product boundary. [S02–S04]

Gourmande boutique currently lists a Québec-produced ground **Piment Gorria** product and explains its relationship to the Basque Gorria variety. Since the EU specification requires every production stage for the PDO to remain in the defined Basque area, the Québec product is not the PDO product. Keep `Piment Gorria`, `Gorria pepper`, and `Espelette-type` wording out of aliases. The seller's description is evidence of a related cultivar product in Québec, not evidence that it qualifies for the protected designation. [S02, S07]

Keep these neighbors distinct:

- **Cayenne pepper:** remains `ingredient-ref-cayenne-pepper`. One Metro recipe gives cayenne as an alternative in that recipe's pizza seasoning slot; it does not make Cayenne an Espelette alias or a general replacement. [S04]
- **Paprika, hot paprika, chili powder, and red chili flakes:** remain separate active spice identities. A shared red-pepper source or seasoning role does not establish product equivalence.
- **Piment Gorria grown in Québec:** remains outside this PDO powder row. Do not alias a locally grown cultivar product to the geographic designation.
- **R399 nduja and R405 soubressade/sobrasada:** remain distinct `PROTEIN` references. Their spicy or spreadable charcuterie identities do not become aliases or substitutes for this spice.
- **R402 Comté:** remains a separate `CHEESE` identity; its regional name and Québec recipe usage have no overlap with the pepper identity.
- **Prepared foods containing Espelette pepper:** a sausage, sauce, seasoned salt, or other composite product is not the pure spice identity.

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Live count | Finding |
|---|---:|---|
| Active ingredient references | 1,712 | No exact owner for `piment d'Espelette`, `piment d'Espelette moulu`, `piment d'Espelette en poudre`, `Espelette pepper`, `Espelette pepper powder`, `ground Espelette pepper`, `Ezpeletako Biperra`, `Piment Gorria`, or proposed ID `ingredient-ref-espelette-pepper-powder`. |
| Ingredient forms | 141 | No exact Espelette, Gorria, or proposed-ID form label or match term. |
| Legacy import candidates | 56 | No exact candidate or proposed reference ID. |
| Research ledger | 2,072 records; 9,372 source entries; 7,938 source IDs | No Espelette/Gorria identity record, proposed ID, R408 prefix, or exact collision for any source URL below. |
| Proposal and batch archives | 3,800 files | An archive text search found no earlier Espelette/Gorria proposal, batch, proposed ID, or R408 prefix. The target proposal path was unallocated. |

The exact-name and alias checks also covered all form labels and match terms and all legacy candidate names and aliases. The nearby live identities are `ingredient-ref-cayenne-pepper`, `ingredient-ref-hot-paprika`, `ingredient-ref-paprika`, `ingredient-ref-chili-powder`, and `ingredient-ref-red-chili-flakes`; none owns an Espelette phrase. The integrated `ingredient-ref-nduja`, `ingredient-ref-sobrasada`, and `ingredient-ref-comte-cheese` remain separate and own no proposed term. All eight source URLs below were absent from the live ledger before drafting. The Europe checklist remains open at [Section 05](../../RecipeBook-global-ingredient-catalog-plan.txt#L8871); this one review does not close regional coverage.

## Phrase-first picker projection

The projection follows the current accent- and punctuation-folding search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The names themselves contain the short bilingual phrases; no additional alias is needed.

| Query | Current result | With proposed row |
|---|---|---|
| `piment d'Espelette`; `piment d'Espelette moulu`; `Espelette pepper`; `Espelette pepper powder` | No exact result | `ingredient-ref-espelette-pepper-powder` only |
| `Ezpeletako Biperra`; `Piment Gorria`; `Gorria pepper` | No result | No result; the broad PDO name and Québec-grown cultivar product are not aliases for the powder-only row |
| `cayenne pepper` | `ingredient-ref-cayenne-pepper` only | Same single result; the recipe-local alternative does not change ownership |
| `paprika`; `hot paprika`; `chili powder` | Their existing separate references | Same separate results |

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan checked each decoded recipe and ingredient row for `piment d'Espelette`, `piment d'Espelette moulu`, `piment d'Espelette en poudre`, `Espelette pepper`, `Espelette pepper powder`, `ground Espelette pepper`, `Ezpeletako Biperra`, `Piment Gorria`, and `Gorria pepper`. It found **zero matching recipe files, zero matching ingredient rows, and zero recipe links**.

The manifest-order corpus fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. It hashes each manifest-relative recipe path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashes the concatenated bytes.

## Measurement and substitution disposition

Metro's *Blanc bleu belge aux saveurs espagnoles* recipe gives one **pincée** of piment d'Espelette in the meatball component and one in the îles flottantes component. Preserve both source quantities and their recipe roles in the source description and decision text, without adding measurement observations: the ledger schema requires `portion_weight` observations to carry a numeric result and unit, and no mass or volume equivalent is published here. Recording `1 pinch` as a portion weight would mislabel the source quantity. Do not derive a standardized pinch, density, unit mapping, or active conversion. The recipe does not identify the named spice as PDO; these quantities do not verify a certified SKU. Metro's Québec listing for a 62 g ground product and Favuzzi's Canadian PDO listing are SKU/package sizes, not kitchen measures or package-yield rules. Keep `measurementState` at `researched_no_supported_value`, `defaultDensity` null, and `unitMappings` empty. [S03, S05, S07]

Metro's *Thin Texan pizza* lists “Espelette pepper or cayenne pepper to taste.” This is a recipe-local optional choice, not a measured or independently tested replacement. Preserve the wording in the source description only. Do not add a global or contextual runtime rule, inverse/transitive rule, substitution finding, recipe-line link, or amount. Keep `substitutionResearchState` at `not_yet_researched` pending a focused review of any reusable or exact-formula replacement claim. Nduja, sobrasada, other sausages, paprika, chili powder, and generic red pepper products remain outside that statement. [S04]

## Source register

Sources were accessed on 2026-10-17. The source IDs are proposal-local and were checked against the live ledger and proposal/batch archive.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-ESPELETTE-PEPPER-R408-20261017-S01` | Institut national de l'origine et de la qualité (INAO), [Piment d'Espelette / Ezpeletako Biperra](https://www.inao.gouv.fr/produit/piment-despelette-ou-piment-despelette-ezpeletako-biperra-20184), product, spice, and geographic-area sections. | Official product and regional authority. Supports the AOP name, spice identity, and Basque geographic area. It is not Québec terminology or retail evidence. |
| `WP06-EUROPE-ESPELETTE-PEPPER-R408-20261017-S02` | European Commission, [Communication of approval of a standard amendment to the Piment d'Espelette PDO product specification](https://eur-lex.europa.eu/legal-content/EN/ALL/?uri=CELEX%3A52025XC04234), Official Journal C/2025/4234, 2025-08-01, single document sections 1, 3.2, and 3.4. | Current primary specification evidence for the PDO, *Capsicum annuum* varietal boundary, three presentations, and production-area requirement. PDO rules are not generalized to related non-PDO Gorria products. |
| `WP06-EUROPE-ESPELETTE-PEPPER-R408-20261017-S03` | Metro, [Piment d'Espelette moulu, 62 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/epices/piment-d-espelette-moulu/p/3162900031731), product title and package label. | Current Québec French product wording. The 62 g package is SKU-specific and does not establish a kitchen measure or prove every product under the name has PDO status. |
| `WP06-EUROPE-ESPELETTE-PEPPER-R408-20261017-S04` | Metro, [Thin Texan pizza](https://www.metro.ca/recettes-et-occasions/recettes/pizza-fine-a-la-texane), English version [Thin Texan pizza](https://www.metro.ca/en/recipes-occasions/recipes/thin-texan-pizza), ingredient and preparation sections. | One bilingual Metro recipe uses `piment d'Espelette` / `Espelette pepper` and lists it or cayenne to taste. The language pages are one recipe source, not independent confirmations; the option gives no quantity or replacement ratio. |
| `WP06-EUROPE-ESPELETTE-PEPPER-R408-20261017-S05` | Favuzzi, [Espelette pepper PDO](https://www.favuzzi.com/en/product/espelette-pepper-pdo-fa07011), product title and description. | Canadian retailer English naming for a PDO powder product, listed in a 40 g SKU. Its net package size is not a reusable measure. |
| `WP06-EUROPE-ESPELETTE-PEPPER-R408-20261017-S06` | Gourmande boutique / Épices de cru, [Piment Gorria](https://gourmandeboutique.com/products/piment-gorria-type-espelette), product title and origin description. | Québec retailer identifies its ground 40 g product as Québec-produced Gorria. Its association of the cultivar with Espelette does not override the PDO geographic production requirement or make this SKU a PDO product. |
| `WP06-EUROPE-ESPELETTE-PEPPER-R408-20261017-S07` | Metro, [Blanc bleu belge aux saveurs espagnoles (boulettes)](https://www.metro.ca/recettes-et-occasions/recettes/blanc-bleu-belge-aux-saveurs-espagnoles-boulettes), ingredient list, meatball and îles flottantes components. | Québec recipe source gives one pinch in each of two components. These are source-specific published quantities, not a mass/volume conversion or general pinch standard. |

## Disposition

Proceed with one identity-only `BAKING_AND_SPICE` row for **`piment d'Espelette moulu / Espelette pepper powder`** if accepted. Keep the proposed reference limited to the powder presentation; leave fresh whole peppers, strings, Québec-grown Gorria, and prepared products containing the pepper outside this row. Add no aliases, forms, recipe links, active numeric mappings, measurement observations, or runtime substitutions. Preserve the two source-specific pinch quantities in the recipe source evidence and keep the single Metro cayenne option confined to its recipe source. The overall Europe checklist remains open.

No software tests, builds, emulator runs, or deployment were performed because this is a proposal-only documentation change.

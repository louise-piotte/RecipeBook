# WP06 Europe — Ossau-Iraty PDO cheese identity review (R442)

- **Reviewed:** 2026-10-17.
- **Status:** The recommendation was accepted and integrated on 2026-10-17; see the [R440–R442 integration record](../batches/wp02-wp04-wp06-r440-r442-gap-review-integration-20261017/README.md). This file records the proposal as reviewed before integration.
- **Snapshot:** Ownership, picker behavior, and recipe-corpus findings below describe the live workspace read on 2026-10-17, including the integrated R423 Taleggio, R436 Pecorino Romano, and R439 San Marzano records.
- **Scope:** One protected French sheep-cheese identity within the still-open [WP06 Europe regional-coverage item](../../RecipeBook-global-ingredient-catalog-plan.txt#L9178). It is distinct from other Pyrenean and Basque products, generic sheep-milk cheese wording, the Pecorino family, and the previously reviewed European cheeses.
- **Source IDs:** `WP06-EUROPE-OSSAU-IRATY-R442-20261017-S01` through `S05` were allocated to the accepted ledger record. The reference ID and target path were clear at review time.

## Recommendation and exact proposed delta

Add one identity-only `CHEESE` reference for **`Ossau-Iraty AOP / Ossau-Iraty PDO`**. The registered name is `Ossau-Iraty`; the current European Commission document identifies it as a PDO cheese made only from non-standardized, rennetted ewe’s milk. The Commission approved the relevant non-minor specification amendment in Regulation (EU) 2017/136, which EUR-Lex currently marks in force. INAO’s current product page identifies the AOP as a sheep-milk cheese from the Basque Country and Béarn and says all production stages must occur in the strictly delimited territory. [S01–S03]

Current Québec retailer pages in French and English both list the product as **`Ossau-Iraty, A.O.P.`** Fromagerie Hamel says store stock and availability can vary. These pages support the local market spelling and bilingual search label; the paired translations are one retailer’s listing, not independent evidence. [S04–S05]

If accepted, add only this row:

```json
{
  "id": "ingredient-ref-ossau-iraty-pdo",
  "nameFr": "Ossau-Iraty AOP",
  "nameEn": "Ossau-Iraty PDO",
  "aliasesFr": ["Ossau-Iraty, A.O.P."],
  "aliasesEn": ["Ossau-Iraty, A.O.P."],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

The repeated A.O.P. alias preserves the current Québec shop’s exact product title in both language views. Keep the aliases limited to that qualified spelling. Do not add `fromage de brebis`, `sheep cheese`, `Basque cheese`, `Pyrénées cheese`, `P’tit Basque`, `Brebiou`, `Manchego`, `pecorino`, a brand, or a plain AOP/PDO mark as an alias. Do not route every sheep-milk cheese or every Basque/Pyrenean cheese to this protected identity. [S01, S04–S05]

| Surface | Proposed delta | Hold |
|---|---|---|
| Reference identity | One protected `CHEESE` reference for Ossau-Iraty PDO, using the bilingual displays and one exact market spelling alias shown above. | No generic sheep-cheese, Basque-cheese, Pyrenean-cheese, P’tit Basque, Brebiou, or Manchego alias. |
| Forms | None. | No raw, thermized, grated, diced, sliced, or aged form. The specification and retailer describe production and sale presentations; neither establishes a recipe conversion form. |
| Measurements | `defaultDensity: null`; `unitMappings: []`. If a ledger record is created, set `measurementState: researched_no_supported_value` and leave observations empty. | Do not turn whole-wheel dimensions or weights, minimum maturation periods, or a retailer’s selected-affinage description into a kitchen measure, density, mapping, portion weight, or package yield. |
| Recipes and yields | None. | The complete bundled corpus has no candidate-specific demand; add no recipe links or package yields. |
| Substitutions and conversions | None. If a ledger record is created, leave `substitutionResearchState: not_yet_researched`. | No substitution from sheep milk, generic pecorino, another Basque cheese, or another cheese; no unit conversion or inverse rule. |

## Product and naming boundaries

- **Protected identity:** the current registered name is `Ossau-Iraty`, a French PDO. The approved single document classifies it as cheese and describes it as made only from non-standardized, rennetted ewe’s milk. INAO’s current page identifies the territory as the Basque Country and Béarn and states that sheep birth and rearing, cheesemaking, and maturation occur inside the defined area. The 2016 Official Journal amendment document is used together with the Commission’s 2017 approval; the amendment publication alone is not treated as the approval. [S01–S03]
- **Québec naming:** Hamel’s current French and English pages use `Ossau-Iraty, A.O.P.` in their product selection lists. The same pages list P’tit Basque and Brebiou separately. This supports preserving their displayed product names as separate identities; it does not establish that every item called Basque cheese is or is not protected. The page’s stock note limits any availability claim. [S04–S05]
- **Existing sheep-milk identity:** `ingredient-ref-sheep-milk` is fluid `lait de brebis / sheep milk`, not cheese. It remains unchanged. [Current reference and ledger]
- **Other cheese identities:** retain `ingredient-ref-pecorino` as a broad pecorino family and `ingredient-ref-pecorino-romano-pdo` as the distinct R436 product. Keep the active Manchego, Roquefort, Taleggio, Tête de Moine, Comté, brunost, and other cheese identities separate. R408’s Espelette pepper is another Basque regional product but is a spice, not an overlapping cheese review. [Current references; R408, R417, R423, R436]
- **Candidate archive:** exact searches for `Ossau`, `Iraty`, `Ossau-Iraty`, and the proposed ID found no prior allocation in the current plan, proposal archive, integration batches, active catalog, legacy list, or ledger. The current open WP06 checklist item still covers European cheese traditions. The earlier reviewed R393–R439 candidates are separate identities, including R423 Taleggio, R436 Pecorino Romano, and R439 San Marzano tomatoes.

## Live ownership and archive audit

Read-only live snapshot taken on 2026-10-17:

| Surface | Live snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,733 | No active ID, display, or alias owns `Ossau`, `Iraty`, `Ossau-Iraty`, or `ingredient-ref-ossau-iraty-pdo`. The nearest related row is `ingredient-ref-sheep-milk`, a fluid-milk identity; generic `ingredient-ref-pecorino` and the integrated Pecorino Romano PDO row are separate cheese identities. |
| Ingredient forms | 141 | No Ossau-Iraty candidate form, label, match term, or proposed-ID owner. |
| Legacy import candidates | 56 | No Ossau-Iraty or proposed-ID candidate. |
| Research ledger | 2,092 records; 9,500 source entries; 8,050 distinct source IDs; 6,766 distinct source URLs; 8 unit conversions | No candidate term, proposed ID, R442 source-ID prefix, or exact collision with the five proposed source URLs. The active sheep-milk ledger record supports fluid sheep milk only; the pecorino-family decision explicitly treats named regional varieties separately. |
| Active rules and yields | 0 global substitutions; 0 contextual substitutions; 1 package-yield record | No candidate rule or yield; the sole yield record is unrelated. |
| Proposal and integration archive | Current workspace archive | No previous Ossau-Iraty review, proposal, batch, or allocation. R408 covers Espelette pepper; R423 Taleggio, R436 Pecorino Romano, and R439 San Marzano address distinct products. The proposed target path is unoccupied. |
| Proposed allocation | Checked before authoring | `ingredient-ref-ossau-iraty-pdo`, source prefix `WP06-EUROPE-OSSAU-IRATY-R442-20261017`, URLs S01–S05, and this proposal path are unallocated. |

The audited live files are [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). Proposed URLs and source IDs were checked against every current ledger source; no exact URL or ID collision was found.

## Phrase-first picker projection

The current picker normalizes accents and punctuation, then prefers complete normalized word phrases before substring matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The projection uses both proposed display names and the exact A.O.P. aliases, with no candidate forms.

| Query | Current result | With proposed row |
|---|---|---|
| `Ossau`; `Iraty`; `Ossau-Iraty`; `Ossau-Iraty AOP`; `Ossau-Iraty PDO`; `Ossau-Iraty, A.O.P.` | No result | `ingredient-ref-ossau-iraty-pdo` only |
| `AOP` | 6 protected-name results | Same 6 plus `ingredient-ref-ossau-iraty-pdo` (7 total) |
| `PDO` | 4 protected-name results | Same 4 plus `ingredient-ref-ossau-iraty-pdo` (5 total) |
| `A.O.P.` | No result | `ingredient-ref-ossau-iraty-pdo` only; this exact punctuation form is present in its proposed alias. |
| `Basque`; `Pyrénées` | No result | No result; no regional adjective alias is proposed. |
| `sheep`; `brebis` | `ingredient-ref-sheep-milk` only | Unchanged; this remains the fluid-milk reference. |
| `pecorino` | `ingredient-ref-pecorino` and `ingredient-ref-pecorino-romano-pdo` | Unchanged |
| `cheese` / `fromage` | 15 / 13 results | Unchanged; the proposed row has no generic cheese word. |

The protected proper name produces a single result for `Ossau` and `Iraty`. The AOP/PDO qualifier searches gain one cheese, while the broader sheep-milk, pecorino-family, and generic cheese queries keep their current ownership.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and all **1,123 structured ingredient rows** were read and parsed as UTF-8. The scan normalized text from every decoded recipe document and all ingredient-row fields, including source text, display name, reference ID, and form ID. It searched for `Ossau`, `Iraty`, `Ossau-Iraty`, punctuation and spacing variants, AOP/PDO/DOP-qualified spellings, and the proposed reference ID. It found **zero matching files, zero matching ingredient rows, and zero linked recipe IDs**.

The manifest-order corpus totals **753,988 bytes** and has fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative recipe path, a NUL byte, the lowercase SHA-256 digest of that file, and a newline, then hashes the concatenated bytes. No candidate-specific amount, form, recipe link, or substitution context is present in the bundled recipes.

## Forms, measurements, and substitutions

- The approved specification includes whole-cheese dimensions and weight ranges and minimum maturation periods that differ by wheel size. Those are protected-product standards and production constraints, not household measures, portion observations, package yields, density, or unit mappings. [S02–S03]
- Hamel’s page describes its own selected cheese as cave-aged; that retailer-specific selection description is not a universal product form or a measure. Its bilingual category pages provide no package amount or recipe quantity. [S04–S05]
- If integration creates a ledger record, set identity to `verified`, measurement to `researched_no_supported_value`, and substitution research to `not_yet_researched`; leave `measurementObservations` empty. Keep density null and unit mappings empty; add no form, global or contextual rule, package yield, or recipe-line substitution.
- Similar milk source, regional origin, texture, or shared use on a cheese board is not evidence of a recipe-specific replacement. No substitution relationship is proposed. [S01–S05]

## Evidence limits

- INAO is the current French official product overview and expressly notes that only the published legal texts have legal authority. S03 is the 2016 amendment publication; its relevant amendments were approved by S02. It is not cited alone as the act of approval. [S01–S03]
- The French and English Hamel pages are paired pages from one Montréal-area specialty retailer. They support the current bilingual market spelling, not independent market prevalence. Their availability note says store stock varies; no province-wide stock claim is made. [S04–S05]
- No OQLF terminology ruling is claimed. The French display is supported by the French INAO product page and current Québec retailer wording.
- The PDO wheel-size and maturation rules, and the retailer’s selected affinage description, do not establish kitchen measurements or conversions. No Québec or bundled recipe quantity was found.

## Source register

Sources were accessed on 2026-10-17. The proposed source IDs and exact URLs were checked against the live ledger; no duplicate source IDs or exact URL collisions were found.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-OSSAU-IRATY-R442-20261017-S01` | Institut national de l’origine et de la qualité (INAO), [Ossau-Iraty](https://www.inao.gouv.fr/produit/ossau-iraty-13705), current product, geographic-area, and regulatory sections. | Current official French overview supports the AOP designation, local ewe’s milk, cheese identity, Basque Country/Béarn origin, and all-stage territorial boundary. INAO states that published Journal texts, not the summary page, carry legal authority. |
| `WP06-EUROPE-OSSAU-IRATY-R442-20261017-S02` | European Commission, [Commission Implementing Regulation (EU) 2017/136](https://eur-lex.europa.eu/eli/reg_impl/2017/136/oj/eng), 16 January 2017. | Primary legal act approving the non-minor amendments for Ossau-Iraty PDO. EUR-Lex currently marks the act in force. It approves the amendment document cited as S03. |
| `WP06-EUROPE-OSSAU-IRATY-R442-20261017-S03` | European Commission, [Official Journal C 334/17, Ossau-Iraty amendment and single document](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A52016XC0910%2804%29), 10 September 2016, §§ 1–5; approved by S02. | Provides the registered name, PDO mark, cheese class, ewe’s-milk product description, territory, wheel specifications, and maturation requirements. Use the wheel and aging details only as product-standard evidence, not cooking measurements. |
| `WP06-EUROPE-OSSAU-IRATY-R442-20261017-S04` | Fromagerie Hamel, [Fromages de brebis](https://www.fromageriehamel.com/produits/fromages-de-brebis/), current French product page, Ossau-Iraty and in-store selection sections. | Current Québec French wording lists `Ossau-Iraty, A.O.P.`; Hamel notes store stock varies. Its product description and selection are retailer-specific, not a legal specification or independent market survey. |
| `WP06-EUROPE-OSSAU-IRATY-R442-20261017-S05` | Fromagerie Hamel, [Sheep cheeses](https://www.fromageriehamel.com/en/products/sheep-cheeses/), current English page, Ossau-Iraty and in-store selection sections. | Current English-language retailer page lists the same `Ossau-Iraty, A.O.P.` item. It is the paired page from S04, not independent market or measurement evidence; stock varies by store. |

## Disposition

Proceed with one identity-only `CHEESE` reference for **`Ossau-Iraty AOP / Ossau-Iraty PDO`**, using only the exact bilingual Québec shop spelling as an alias. Keep generic sheep milk, generic sheep cheeses, P’tit Basque, Brebiou, Manchego, pecorino, and other protected European cheeses separate. The complete bundled recipe corpus has no demand, and the specification and retailer pages do not support reusable measurements, forms, conversions, yields, or substitutions. Leave the Europe-wide checklist open for further regional coverage.

No tests, builds, emulator runs, or deployment were performed because this is a proposal-only documentation change.

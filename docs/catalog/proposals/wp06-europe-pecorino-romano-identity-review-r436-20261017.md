# WP06 Europe — Pecorino Romano PDO identity review (R436)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This file does not change shared catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Snapshot:** Ownership, picker behavior, and recipe-corpus findings describe the workspace read on 2026-10-17.
- **Scope:** One distinct Pecorino Romano PDO identity, whose protected production area spans Sardinia, Lazio, and Grosseto province, within the open WP06 Europe regional-coverage item. Keep it separate from the active generic pecorino family and other regional pecorino products.
- **Source-ID prefix:** `WP06-EUROPE-PECORINO-ROMANO-R436-20261017`. The proposed reference ID, new source IDs, URLs, and target path were checked for collisions. Reuse the existing OQLF source ID instead of creating a duplicate ledger entry.

## Recommendation

Add one identity-only `CHEESE` reference for **`Pecorino Romano AOP / Pecorino Romano PDO`**. The European Commission's current single document, approved 3 August 2026 and published 2 September 2026, identifies `Pecorino Romano` as a PDO, defines it as a hard cooked cheese made exclusively from fresh whole ewe's milk, and limits milk production, processing, and ripening to the specified area. That area is all of Sardinia, Lazio, and the province of Grosseto, not just the area around Rome. [S01–S02]

The OQLF describes `pecorino` as an acceptable French term and English equivalent, and lists `pecorino romano` as one regional variety in the wider family. [Existing source `WP04-Q-CHEESE-20261010-S13`] The current Official Journal's French text uses AOP. [S02] Montréal-area Marché TAU's French and English product pages both use `Pecorino Romano Dop`; a Québec-made Stefano Faita product page uses both `Pecorino Romano DOP` and `Pecorino romano AOP` in French product text. These support the bilingual display and narrow mark alias, but the composite sauce page does not define a standalone cheese formula or measure. [S03–S05]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-pecorino-romano-pdo",
  "nameFr": "Pecorino Romano AOP",
  "nameEn": "Pecorino Romano PDO",
  "aliasesFr": ["Pecorino Romano DOP"],
  "aliasesEn": ["Pecorino Romano DOP"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

Use the EU's exact protected product name with its French and English designation marks. The DOP alias is the exact wording on the Québec-facing Marché TAU product pages. Do not add bare `Romano`, `Romano cheese`, generic `pecorino`, `Pecorino Sardo`, `Pecorino Siciliano`, `Pecorino Toscano`, a brand, `Parmesan`, or an unqualified grating-cheese description as aliases. The existing generic pecorino row stays unchanged. [S01–S04]

## Product and naming boundaries

The EU's current standard amendment defines the protected product as hard cooked cheese made only from fresh whole sheep's milk. The milk production, processing, and ripening must take place in the defined area: Sardinia, Lazio, and Grosseto province. The designation covers the table and grating types, with distinct minimum maturation periods; the additional `Riserva` qualification has its own requirements. These are characteristics of this protected identity, not general attributes of all pecorino. [S01]

Keep adjacent identities and terms separate:

- **`ingredient-ref-pecorino` / pecorino:** the active broad Italian pressed sheep-milk cheese family remains unchanged. OQLF explicitly treats Romano, Sardo, Siciliano, and Toscano as varieties within the family, rather than synonyms for the unqualified family term. [Existing ledger record `WP04-Q-CHEESE-20261010-S13`]
- **Other named regional pecorino cheeses:** retain Sardo, Siciliano, and Toscano as separate names if reviewed in their own right. Do not route them to this PDO.
- **Unqualified `Romano`:** do not add this as an alias. A separate [WP03 bean review](wp03-h-common-beans-unfinished-identities-review-20261011.md) kept it out of cranberry-bean aliases because the word is not unambiguous across ingredient classes. The required protected name itself nevertheless contains `Romano`; the current search will return this cheese for a one-word `Romano` query.
- **Generic Romano-labelled products:** Mayrand lists `Romano blanc italien 500 g` under its `Pecorino` retail category but does not show a DOP mark. Keep that SKU wording and any generic Romano cheese separate; the listing does not establish PDO identity. [S06]
- **Other hard sheep cheeses and Parmesan:** shared milk source, texture, grating use, or a recipe pairing does not make them aliases or prove substitution.

The global Europe checklist remains open for Western, Southern, Northern, Central, and Eastern Europe, including cheese traditions. R423 Taleggio is integrated in the R421–R423 batch; R420 Modena balsamic, R417 Roquefort, R414 Tête de Moine, R411 La Vera paprika, R408 Espelette pepper, R405 sobrasada, R402 Comté, R399 nduja, R396 burrata, and R393 brunost are distinct completed reviews. The latest R424–R433 integrations cover other work packages, not this candidate. The WP04 residual cheese review established the generic pecorino family and explicitly kept its named regional varieties separate; no prior dedicated Pecorino Romano allocation was found. See the [open Europe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L9152) and [R421–R423 integration README](../batches/wp02-wp04-wp06-r421-r423-gap-review-integration-20261017/README.md).

## Live ownership and archive audit

Read-only workspace snapshot checked on 2026-10-17:

| Surface | Live snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,729 | `ingredient-ref-pecorino` owns only the generic bilingual `pecorino` term and has no aliases. No active ID, display, or alias owns `Pecorino Romano`, the proposed PDO-qualified names, or `ingredient-ref-pecorino-romano-pdo`. The separate Parmesan identity remains unchanged. |
| Ingredient forms | 141 | No pecorino or Romano form label or match term. |
| Legacy import candidates | 56 | No candidate for Pecorino Romano, the proposed ID, or its protected-name variants. |
| Research ledger | 2,088 records; 9,467 source entries; 8,024 distinct source IDs; 6,740 distinct source URLs; 8 unit conversions | The generic `ingredient-ref-pecorino` record reuses OQLF source `WP04-Q-CHEESE-20261010-S13` and states no general substitute was established. No Pecorino Romano record, R436 source-ID prefix, or exact URL collision was found. No candidate-specific conversion is recorded. |
| Active rules and yields | 0 global substitution rules; 0 contextual substitution rules; 1 package-yield record | No Pecorino Romano rule or yield exists. The sole package yield is unrelated. |
| Proposals and batches | Current workspace archive | WP04's broad cheese review names regional pecorino varieties as distinct; R423 and earlier Europe batches cover other identities. Searches found no dedicated Pecorino Romano review or allocation. The target proposal path was unallocated when checked. |

The audited data include the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). The current OQLF pecorino source is reused under its existing source ID; do not duplicate it if creating a new ledger record. New source IDs and URLs below were absent from the ledger when checked.

## Phrase-first picker projection

The projection follows normalized exact-word-phrase matching before substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It includes the two proposed display names and the DOP aliases above.

| Query | Current result | With proposed row |
|---|---|---|
| `Pecorino Romano`; `Pecorino Romano AOP`; `Pecorino Romano PDO`; `Pecorino Romano DOP` | No result | `ingredient-ref-pecorino-romano-pdo` only |
| `pecorino` | `ingredient-ref-pecorino` only | Generic pecorino plus `ingredient-ref-pecorino-romano-pdo` |
| `Romano` | No result | `ingredient-ref-pecorino-romano-pdo` only, because `Romano` is part of the official display name |
| `pecorino sardo`; `pecorino siciliano`; `pecorino toscano` | No result | No result; those regional names are not aliases |
| `parmesan` | `ingredient-ref-parmesan-cheese` only | Unchanged |
| `cheese` / `fromage` | 15 / 13 results | Unchanged; the proposed row has no generic cheese-term alias |

The standalone `Romano` result is an unavoidable picker effect of displaying the registered name with the current phrase-first search. Do not add `Romano` to either alias array. The known bean-name ambiguity is documented in the separate [WP03 bean review](wp03-h-common-beans-unfinished-identities-review-20261011.md); the current active ingredient list has no Romano bean owner.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** were parsed as UTF-8, and all **1,123 structured ingredient rows** were inspected. The full decoded documents and ingredient fields were searched for `Pecorino Romano`, `pecorino`, `Romano`, the PDO/AOP/DOP variants, and the proposed reference ID. The scan found **zero matching recipe files, zero matching ingredient rows, and zero linked recipe IDs**.

The manifest-order corpus contains **753,988 bytes** and fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative recipe path, a NUL byte, the lowercase SHA-256 digest of that file, and a newline, then hashes the concatenated bytes. There is no bundled recipe amount, form, or substitution context for this product.

## Forms, measurements, and substitutions

- The current PDO document gives whole-wheel dimensions and a **20–35 kg** whole-wheel range, along with five-month and eight-month minimum maturation periods for the table and grated types. These are product-standard and process details, not kitchen measures, portion weights, density, or volume conversions. Do not create a unit mapping from them. [S01]
- Marché TAU lists a **200 g** Pinna Formaggi item, and Mayrand lists an approximately **500 g** `Romano blanc italien` item. These are product-specific packages; Mayrand's page does not identify the item as PDO, and the Marché TAU page currently reports the DOP product as unavailable. Do not add reusable measurements, a package yield, or a form from these listings. [S03–S04, S06]
- If an identity ledger record is created, set `measurementState` to `researched_no_supported_value`, leave `measurementObservations` empty, keep `defaultDensity` null and `unitMappings` empty, and add no ingredient form or unit conversion.
- The generic pecorino record has no established global substitute, and neither the current PDO specification nor the product listings establishes a tested substitution direction or ratio for a recipe context. Add no global/contextual substitution, inverse rule, or recipe-line link. Keep Pecorino Romano substitution research `not_yet_researched` until a focused, source-supported context review exists. [S01, S03–S06]

## Evidence limits

- OQLF's 2020 article supports the generic bilingual term and names the Romano variety, but its regional parenthetical is not used to define the current PDO area. The 2026 EU product document is the authoritative current source for the complete protected area and product boundary.
- The Marché TAU and Mayrand pages are Québec-facing current product listings, but both show no present store availability. Mayrand's different, unqualified `Romano blanc italien` item is not evidence of PDO status.
- The Québec-made Stefano Faita page names Pecorino Romano AOP/DOP as an ingredient in a composite sauce. It supports Québec French wording, not a standalone cheese recipe quantity, formula, or substitution.
- No recipe demand exists in the bundled corpus. External retail package sizes and PDO whole-wheel standards do not fill that gap.

## Source register

Sources were accessed on 2026-10-17. The new source IDs and exact URLs were checked against the live ledger. The existing OQLF source ID is reused, not duplicated.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-PECORINO-ROMANO-R436-20261017-S01` | European Commission, [current Pecorino Romano PDO single document](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A52026XC04125), EU reference PDO-IT-0017-AM01 (approved 2026-08-03), Official Journal C/2026/4125, 2026-09-02, §§ 1–5. | Primary current source for the registered name and PDO status, cheese class, ewe's milk, protected geography, permitted product types, whole-wheel specifications, and maturation requirements. Wheel weights and maturation are not recipe measures. |
| `WP06-EUROPE-PECORINO-ROMANO-R436-20261017-S02` | European Commission, [French version of the current product document](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A52026XC04125), same Official Journal document, accessed 2026-10-17. | Confirms the French legal designation `AOP`, French cheese terminology, and the same product/geography boundary. It is the French-language version of S01, not independent evidence. |
| Existing source `WP04-Q-CHEESE-20261010-S13` | Office québécois de la langue française, [GDT — pecorino](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557727/pecorino), updated 2020; already recorded under `ingredient-ref-pecorino`. | Supports acceptable French `pecorino`, English `pecorino` / `pecorino cheese`, the sheep-milk family, and the distinction among named regional varieties. Its short regional note is not used instead of the current EU PDO geography. |
| `WP06-EUROPE-PECORINO-ROMANO-R436-20261017-S03` | Marché TAU, French page [Pinna Formaggi — Pecorino Romano DOP, 200 g](https://marchestau.com/pecorino-romano-dop-200g), product code 0801086100367, accessed 2026-10-17. | Montréal-area Québec retailer wording for the DOP product and one SKU's ingredient list. The page reports the item unavailable; it does not establish current stock or a reusable measure. |
| `WP06-EUROPE-PECORINO-ROMANO-R436-20261017-S04` | Marché TAU, [English product page for the same Pinna Formaggi SKU](https://marchestau.com/en/pecorino-romano-dop-200g), product code 0801086100367, accessed 2026-10-17. | Confirms the English-language listing uses the same `Pecorino Romano Dop` wording and product code as S03. This is the same retailer and SKU, not independent market or measurement evidence; page reports the item unavailable. |
| `WP06-EUROPE-PECORINO-ROMANO-R436-20261017-S05` | Les Aliments Faita, [Cacio e pepe](https://www.stefanofaita.com/produits/sauces/cacio-e-pepe/), French product description and ingredients, accessed 2026-10-17. | Québec-made sauce page uses `Pecorino Romano DOP` and `Fromage Pecorino romano AOP`; supports local French naming. The 9% composite-product ingredient listing does not establish a standalone cheese amount or conversion. |
| `WP06-EUROPE-PECORINO-ROMANO-R436-20261017-S06` | Mayrand, [Romano blanc italien 500 g](https://mayrand.ca/fr/nos-produits/produits-laitiers/fromage/parmesan/romano-italien-coupe-pecorino-17977), item 17977, accessed 2026-10-17. | Québec retailer lists a Romano-named product in the Pecorino category, with an approximate SKU-specific 500 g unit and no DOP mark; current page says “Bientôt disponible”. Use only as adjacent-market boundary evidence, not proof of PDO identity or a reusable measure. |

## Disposition

Proceed with one identity-only `CHEESE` row for **`Pecorino Romano AOP / Pecorino Romano PDO`**, with only the source-attested DOP mark variant in each alias array. Preserve the generic pecorino family, the named Sardo/Siciliano/Toscano varieties, generic Romano-labelled products, Parmesan, and other sheep cheeses as distinct. Record the picker side effect for one-word `Romano`; add no forms, density, mappings, measurements, conversions, recipe links, yields, or substitutions. Keep the WP06 Europe regional-coverage checkbox open.

No tests, build, emulator run, or deployment were performed because this is a proposal-only documentation change.

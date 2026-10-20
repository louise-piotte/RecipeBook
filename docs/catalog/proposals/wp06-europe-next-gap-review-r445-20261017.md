# WP06 Section 05 — Grana Padano PDO identity review (R445)

- **Reviewed:** 2026-10-17.
- **Status:** Root-reviewed and integrated on 2026-10-17; see the [R443–R445 integration README](../batches/wp02-wp04-wp06-r443-r445-next-gap-review-integration-20261017/README.md). No forms, recipe links, or runtime behavior were changed.
- **Scope:** One Northern Italian protected cheese identity within the still-open WP06 Europe regional-coverage item.
- **Source-ID prefix:** `WP06-EUROPE-GRANA-PADANO-R445-20261017`. The proposed reference ID, proposal path, prefix, and new source URLs were checked against the live workspace; no collision was found. Two existing Parmesan-boundary source IDs are explicitly reused below.

## Recommendation

Add one identity-only `CHEESE` reference for **`Grana Padano AOP / Grana Padano PDO`**, with empty alias arrays. The European Commission’s current published single document names `Grana Padano` as a PDO cheese and defines it as a hard, cooked-curd, slow-matured cheese made from raw, partially skimmed cow’s milk in the specified Italian production area. It can be sold as table cheese or grated. The current eAmbrosia register lists the designation as registered. [S01–S02]

Current Québec-facing Mayrand pages list the same Virgilio item (66181) in French as **`Grana Padano AOP 16 mois`** and in English as **`PDO Certified Grana Padano Cheese 16 Months`**. They support a clear local name for the protected product; they are paired language views of one retailer item, not independent market sources. A current Aubut listing uses **`Fromage parmesan grana padano`** for a Tre Stelle SKU inside its Parmesan category. That is useful evidence of local retail wording, but it does not turn Grana Padano into an alias for generic Parmesan or establish PDO status for that SKU. [S04–S06]

If accepted, integrate only the row below. Keep generic Parmesan and the named protected cheeses separate. The bundle has no matching demand: all 114 manifest-listed recipes and 1,123 ingredient rows were scanned. Add no forms, measures, density, unit mapping, package yield, recipe link, conversion, or substitution.

### Proposed catalog row

```json
{
  "id": "ingredient-ref-grana-padano-pdo",
  "nameFr": "Grana Padano AOP",
  "nameEn": "Grana Padano PDO",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

The Québec French display follows Mayrand’s current AOP label; the English display uses the corresponding PDO designation. The protected name itself remains searchable in both locales, so generic retail descriptions and age-qualified SKU titles are not needed as aliases.

## Identity and market boundary

- **Protected product:** the EU register records *Grana Padano* as a registered PDO in the cheese class. The approved single document describes a hard, cooked-curd, slow-matured cheese and bounds production and maturation to its defined Italian area. These rules identify the protected product; they are not a recipe form or measurement system. [S01–S02]
- **Québec market wording:** Mayrand currently labels item 66181 `Grana Padano AOP 16 mois` in French and `PDO Certified Grana Padano Cheese 16 Months` in English. The same item is shown at approximately 1 kg. These page titles and the package amount describe one retailer SKU; the paired pages are one source. Current stock indicators can vary by store and date. [S04–S05]
- **Additional Canadian naming:** Aubut’s French listing calls a Tre Stelle product `Fromage parmesan grana padano` and places it in its Parmesan category. Treat that retailer category and combined SKU title as market wording only. It neither establishes a synonym relationship nor verifies the PDO status of that specific item. [S06]
- **Consortium mark:** the Grana Padano Protection Consortium says PDO branding identifies the product on portions as well as wheels, and its origin marks distinguish the protected cheese. This is producer-organization guidance, not a substitute for the European Commission’s legal register and product document. [S03]

Keep these identities and phrases separate:

- **Generic Parmesan:** the live `ingredient-ref-parmesan-cheese` remains `parmesan / parmesan cheese`, with only `fromage parmesan` as its French alias. Reuse the existing OQLF and Commission sources for the generic Parmesan and Parmigiano Reggiano boundary; they do not make Grana Padano an alias. [WP04-Q-CHEESE-20261010-S12; WP04-Q-CHEESE-20261010-S29]
- **Parmigiano Reggiano:** a different protected cheese. The earlier WP04 source and decision already keep its PDO distinct from generic Parmesan. No active Parmigiano Reggiano reference was found, and none is proposed here.
- **Pecorino Romano PDO and other named cheeses:** the live Pecorino Romano PDO, Pecorino family, Comté, Taleggio, and Ossau-Iraty references stay separate by name and product identity. Shared hard-cheese or grated use is not an identity equivalence.
- **`parmesan grana padano`:** retain this exact retailer wording as source evidence only. Do not add `parmesan`, `fromage parmesan`, `Italian parmesan`, `Grana`, `grana cheese`, an age, brand, or product-size phrase as an alias.
- **Grated presentation:** the EU document recognizes grated Grana Padano as a protected presentation with region-specific grating and packaging rules. It does not justify a general recipe form in this catalog. No grated form is proposed without a recipe line or separate form requirement.

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Live count | Finding |
|---|---:|---|
| Active ingredient references | 1,736 | No `ingredient-ref-grana-padano-pdo` row or candidate wording in names or aliases. |
| Ingredient forms | 141 | No Grana Padano label, match term, or form owner. |
| Legacy import candidates | 56 | No Grana Padano candidate or proposed reference ID. |
| Research ledger | 2,095 records | No Grana Padano record, R445 prefix, proposed reference ID, or exact collision with the new source URLs. |
| Proposal and batch archives | Current workspace snapshot | No prior exact `Grana Padano` review, identity allocation, or integration record. |
| Proposed allocation | Checked before authoring | The ID, R445 source prefix, this target path, and S01–S06 URLs are unallocated. |

The focused audit checked bilingual active names and aliases, all form labels and match terms, legacy-candidate text, ledger records and source URLs, and exact candidate phrases in the proposal and batch archives. The nearest live identity is generic Parmesan, with no Grana Padano term; the other close records are the distinct R436 Pecorino Romano PDO, R423 Taleggio PDO, R442 Ossau-Iraty PDO, and R402 Comté cheese. R393 brunost, R396 burrata, R399 nduja, R405 soubressade, R408 Espelette pepper powder, R411 Pimentón de la Vera, R414 Tête de Moine, R417 Roquefort, R420 traditional Modena balsamic vinegar, and R439 San Marzano PDO tomatoes are also separate previously reviewed products. The Europe checklist still calls for Western, Southern, Northern, Central, and Eastern coverage and remains open. [Plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9178); [R440–R442 integration record](../batches/wp02-wp04-wp06-r440-r442-gap-review-integration-20261017/README.md)

## Exact picker projection

The current picker normalizes accents and punctuation, prefers full word-phrase matches, and falls back to substring matching. This projection adds only the two proposed display names and no aliases or forms. [Implementation: `IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)

| Query | Current result | With proposed row |
|---|---|---|
| `Grana Padano`; `Grana Padano AOP`; `Grana Padano PDO` | No result | `ingredient-ref-grana-padano-pdo` only |
| `grana` | `ingredient-ref-pomegranate`; `ingredient-ref-pomegranate-molasses` (substring matches) | `ingredient-ref-grana-padano-pdo` only (complete word match takes precedence) |
| `AOP` | 7 protected-name results | Same 7 plus `ingredient-ref-grana-padano-pdo` (8 total) |
| `PDO` | 5 protected-name results | Same 5 plus `ingredient-ref-grana-padano-pdo` (6 total) |
| `parmesan`; `fromage parmesan` | `ingredient-ref-parmesan-cheese` only | Unchanged; no Parmesan alias is added |
| `Pecorino Romano` | `ingredient-ref-pecorino-romano-pdo` only | Unchanged |
| `cheese`; `fromage` | 15 / 13 broad results | Unchanged; no generic cheese or fromage alias is proposed |

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan searched each decoded recipe document and every ingredient-row field for `Grana Padano`, `Grana-Padano`, `Padano`, `Grana Padano AOP`, `Grana Padano PDO`, and the proposed reference ID. It found **zero matching recipe files, zero matching ingredient rows, and zero recipe links**.

The manifest-order corpus contains **753,988 bytes** and has fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative path, a NUL byte, the lowercase SHA-256 digest of that recipe file, and a newline, then hashes the concatenated bytes. Current Québec retail evidence is external-market evidence only; it does not create a bundled recipe link or recipe measurement.

## Forms, measurements, and substitutions

- The EU product document’s **24–40 kg whole-wheel range**, production area, and aging requirements describe PDO standards. They are not household quantities, portions, yields, densities, or unit mappings. [S01]
- Mayrand’s approximately **1 kg** listing, its 16-month label, and Aubut’s approximately **1.8 kg** Tre Stelle SKU are product-specific retail facts. Do not store them as reusable measures, portion weights, package yields, or general aging forms. [S04–S06]
- If integrated, set `measurementState` to `researched_no_supported_value`, leave `measurementObservations` empty, retain `defaultDensity: null` and `unitMappings: []`, and add no form, conversion, recipe link, or package yield.
- No substitution research was performed for this identity. If integrated, use `substitutionResearchState: not_yet_researched`; add no global or contextual rule. Do not infer that Grana Padano can replace generic Parmesan, Parmigiano Reggiano, or Pecorino Romano from a shared cheese-board, grating, or pasta role.

## Source register

New sources were accessed on 2026-10-17. S01–S06 are proposal-local IDs; their prefix and URLs were checked against the live ledger and archive. The paired Mayrand pages are the same retailer item and are not counted as two independent market observations.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-GRANA-PADANO-R445-20261017-S01` | European Commission, [Official Journal C 263/23, amended Grana Padano single document](https://eur-lex.europa.eu/legal-content/EN/TXT/PDF/?uri=OJ%3AC%3A2022%3A263%3AFULL), 2022/C 263/09, §§ 1–4, 8 July 2022. | Primary EU publication of the approved single document: registered PDO name, cheese class, product description, production/geographic boundaries, and permitted grated presentation. Wheel specifications are not recipe measures. |
| `WP06-EUROPE-GRANA-PADANO-R445-20261017-S02` | European Commission, [eAmbrosia register: Grana Padano](https://ec.europa.eu/agriculture/eambrosia/geographical-indications-register/details/EUGI00000012993), PDO-IT-0011, current registered status. | Current official registration record. It confirms the protected name and cheese class; S01 supplies the detailed product boundary. |
| `WP06-EUROPE-GRANA-PADANO-R445-20261017-S03` | Grana Padano Protection Consortium, [How can you recognise the branding?](https://www.granapadano.it/en-en/the-art-of-craftsmanship/the-iconic-product/how-can-you-recognise-the-branding/), current packaging and origin-mark sections. | Producer-consortium explanation that PDO branding identifies portions and that origin marks identify compliant product. This is complementary institutional guidance, not the legal product specification. |
| `WP06-EUROPE-GRANA-PADANO-R445-20261017-S04` | Mayrand, [Grana Padano AOP 16 mois](https://mayrand.ca/fr/nos-produits/produits-laitiers/fromage/parmesan/grana-padano-16-mois-pointe-virgilio-66181), Virgilio item 66181, accessed 2026-10-17. | Current Québec French product title for the approximately 1 kg AOP-labelled SKU. Price, inventory status, age and package amount are item-specific and may change. |
| `WP06-EUROPE-GRANA-PADANO-R445-20261017-S05` | Mayrand, [PDO Certified Grana Padano Cheese 16 Months](https://mayrand.ca/en/our-products/cheese-and-dairy/cheese/parmesan-cheese/grana-padano-16-mois-pointe-virgilio-66181), Virgilio item 66181, accessed 2026-10-17. | English page for the same Mayrand SKU as S04. Supports the English PDO wording but is not an independent retailer, product, or package observation. |
| `WP06-EUROPE-GRANA-PADANO-R445-20261017-S06` | Aubut, [Fromage parmesan grana padano](https://www.aubut.ca/produits/details/fromage-parmesan-grana-padano-212), Tre Stelle item 212, accessed 2026-10-17. | Current Québec product-title evidence and retail-category context. The listing does not identify PDO certification; it is not used to establish protected status or as a synonym source. Its approximate 1.8 kg package remains SKU-specific. |
| Existing source reused: `WP04-Q-CHEESE-20261010-S12` | OQLF, [parmesan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2096149/parmesan), already attached to `ingredient-ref-parmesan-cheese` in the research ledger. | Reused only for the existing Québec generic-Parmesan naming boundary; it does not attest to Grana Padano. No duplicate source entry is proposed. |
| Existing source reused: `WP04-Q-CHEESE-20261010-S29` | European Commission, [Parmigiano Reggiano PDO specification](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A52018XC0413%2801%29), already attached to `ingredient-ref-parmesan-cheese` in the research ledger. | Reused only to keep the separately named Parmigiano Reggiano product outside this row. No duplicate source entry is proposed. |

## Disposition

Accepted: add one identity-only `CHEESE` reference for **`Grana Padano AOP / Grana Padano PDO`**, using the protected name and no aliases. Keep generic Parmesan and the other named European cheeses distinct. The market evidence supports local search naming, while the bundle has no matching demand and the available package facts do not support reusable measurements. Add no forms, numeric behavior, conversions, recipe links, package yields, or substitutions. Leave Europe-wide regional coverage open.

No tests, build, or emulator run were performed because the changes only add database JSON data and documentation.

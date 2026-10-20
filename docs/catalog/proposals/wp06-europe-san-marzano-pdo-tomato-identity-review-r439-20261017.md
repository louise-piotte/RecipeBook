# WP06 Europe — San Marzano PDO peeled-tomato identity review (R439)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. No shared catalog data, forms, research ledger, recipes, generated files, plan checklist, roadmap, or code were changed.
- **Snapshot:** Ownership, picker behavior, and recipe findings below describe the live workspace read on 2026-10-17, after the R434–R436 batch had been integrated.
- **Scope:** One protected Campania processed-tomato identity within the still-open WP06 Europe coverage item. This is distinct from R436 Pecorino Romano PDO and R423 Taleggio PDO, and from the other reviewed European products listed in the open checklist.
- **Source-ID prefix:** `WP06-EUROPE-SAN-MARZANO-R439-20261017`. The proposed reference ID, target path, prefix, and source URLs were checked against the live catalog, ledger, and proposal archive. The existing Mayrand marinara source is cited under its current source ID, not duplicated.

## Recommendation and exact delta

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for **`Tomates pelées San Marzano AOP / San Marzano PDO peeled tomatoes`**, representing the protected product `Pomodoro San Marzano dell'Agro Sarnese-Nocerino`. The Commission approved the amended registered name and product specification in 2019. The official product document defines production in the specified Campania area and processing into peeled tomatoes; the Campania regional page says the PDO covers `pelato` and `pelato a filetti` (peeled whole tomatoes and peeled strips), not every fresh San Marzano tomato or every product marketed with “San Marzano” wording. [S01–S03]

Current Québec-facing sources support French `Tomates pelées San Marzano` and `AOP`, and English `San Marzano` / `PDO peeled tomatoes`. Berchicci’s bilingual Mutti pages are the same 398 mL SKU and therefore one retailer/product observation, not two independent sources. Maison Jacynthe supplies a separate French-language Québec product listing. Metro separately lists a Canadian product as **“San Marzano Type Tomatoes”**; that style wording does not establish the protected PDO identity. [S04–S07]

If accepted, add only this reference:

```json
{
  "id": "ingredient-ref-pomodoro-san-marzano-pdo",
  "nameFr": "Tomates pelées San Marzano AOP",
  "nameEn": "San Marzano PDO peeled tomatoes",
  "aliasesFr": [
    "Pomodoro San Marzano dell'Agro Sarnese-Nocerino",
    "Tomates San Marzano D.O.P. pelées entières",
    "Tomates pelées San Marzano DOP"
  ],
  "aliasesEn": [
    "Pomodoro San Marzano dell'Agro Sarnese-Nocerino",
    "San Marzano D.O.P. whole peeled tomatoes",
    "San Marzano DOP peeled tomatoes"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The Italian registered name is the only alias that does not carry an English/French retail translation; the remaining aliases preserve local market wording and the alternate DOP spelling. Do not add a bare `San Marzano` alias, `San Marzano type`, fresh San Marzano tomatoes, Mutti/La Valle/other brands, tomato sauce, passata, or marinara as aliases. A proposed name necessarily makes the phrase `San Marzano` return this protected row; keep the AOP/PDO qualifier visible and do not automatically assign unqualified “San Marzano” recipe text to the PDO. [S01–S07]

| Surface | Proposed delta | Hold |
|---|---|---|
| Reference identity | One protected peeled-tomato identity as shown above. | No fresh-fruit identity, general “San Marzano type” identity, or product brand. |
| Ingredient forms | None. | No candidate-specific canned-whole, peeled-strip, or other form; the existing tomato forms remain attached to generic `ingredient-ref-tomatoes`. |
| Measurements | `defaultDensity: null`; `unitMappings: []`. If a ledger record is created, use `measurementState: researched_no_supported_value` and no observations. | Do not convert protected-product length, drained-weight percentage, or a retail can size into household measures, density, or yields. |
| Recipes and yields | None. | No recipe links, package yields, or ingredient-line edits; the full bundled corpus has no San Marzano demand. |
| Substitutions and conversions | None. If a ledger record is created, leave substitution research `not_yet_researched`. | No generic tomato-to-PDO rule, reverse rule, or recipe-line substitution. No candidate-specific unit conversion. |

## Product and naming boundaries

- **Protected product:** the full registered name is `Pomodoro San Marzano dell'Agro Sarnese-Nocerino`. Regulation (EU) 2019/1346 approves the non-minor amendment that corrected the registered name to its full spelling. The published Commission amendment document supplies product and geographic details, and that amendment was later approved by S01. [S01–S02]
- **Protected presentation:** the specification and Campania source limit the PDO product to processed `pelato` and `pelato a filetti`. The regional page describes the approved production area across 41 municipalities in the provinces of Salerno, Naples, and Avellino. It also permits certain product-specific additions, including salt, basil leaves, and San Marzano tomato juice/concentrate; those variations do not support one universal formula. [S02–S03]
- **Generic tomatoes:** keep `ingredient-ref-tomatoes` active with its current fresh/generic tomato identity and canned crushed, diced, and whole forms. Do not make those forms PDO forms or replace the generic row.
- **Other tomato products:** keep tomato sauce, tomato paste, tomato purée, passata, marinara, and tomato juice separate. A product using San Marzano tomatoes as an ingredient, such as the existing Mayrand marinara SKU, is not itself a San Marzano PDO tomato reference. [Existing ledger source `WP05-CSCR-20261010-S25`; S07]
- **“San Marzano type”:** do not route the Metro Canadian `San Marzano Type Tomatoes Packed in Purée` listing to this PDO row. The descriptor and Canadian origin do not establish the protected Campania product. [S07]
- **Other protected tomatoes:** the European PDO boundary here does not absorb other named tomato products or origins. No other protected tomato PDO is an alias or form of this identity.

The WP06 Europe checklist at [the open regional-coverage item](../../RecipeBook-global-ingredient-catalog-plan.txt#L9152) remains open. R393–R436 cover other discrete European identities, including R423 Taleggio and the integrated R434–R436 batch. The current checklist and archive search found no prior focused San Marzano review or allocation; one older occurrence is only the WP05 Mayrand marinara product title described above. See the [R421–R423 integration](../batches/wp02-wp04-wp06-r421-r423-gap-review-integration-20261017/README.md) and [R434–R436 integration](../batches/wp02-wp04-wp06-r434-r436-gap-review-integration-20261017/README.md).

## Live ownership and archive audit

Read-only live snapshot taken on 2026-10-17:

| Surface | Current state | Finding |
|---|---:|---|
| Active ingredient references | 1,731 | No active reference ID, display name, or alias owns `San Marzano`, `Pomodoro San Marzano`, `Sarnese-Nocerino`, or the proposed reference ID. The nearest row, `ingredient-ref-tomatoes`, is the generic `tomates / tomatoes` identity, category `VEGETABLE_AND_AROMATIC`; its aliases include generic crushed/whole tomato wording only. |
| Ingredient forms | 141 | No San Marzano or candidate-specific form label or match term. The generic tomato row has only `canned_crushed`, `canned_diced`, and `canned_whole`. |
| Legacy import candidates | 56 | No San Marzano or proposed-ID candidate. |
| Research ledger | 2,090 records; 9,483 source entries; 8,035 distinct source IDs; 6,751 distinct URLs; 8 unit conversions | No San Marzano tomato identity record, candidate source-ID prefix, or collision with the proposed source URLs. The only San Marzano occurrence is `WP05-CSCR-20261010-S25`, attached to `ingredient-ref-marinara-sauce`; its locator is a Mayrand sauce title/category and it supports the generic marinara display only. The generic tomato record has ten sources; none describes this PDO identity. |
| Active substitutions and yields | 0 global rules; 0 contextual rules; 1 package-yield record | No candidate rule or yield; the single yield is unrelated. |
| Proposal/archive search | Current workspace archive | No WP06 San Marzano or Sarnese-Nocerino review, batch, or allocation. The one phrase hit in the proposal archive is the earlier WP05 marinara boundary source. R423 and R436 cover different products. |
| Proposed allocation | Checked before authoring | `ingredient-ref-pomodoro-san-marzano-pdo`, the R439 source-ID prefix, planned URLs, and this target path were unallocated. |

The audited files are the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). Source-ID and URL collision checks were run against the current ledger. The existing WP05 source is reused by citation only; do not duplicate its ledger source entry.

## Phrase-first picker projection

The projection follows the normalized exact-word-phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including form labels and match terms. It uses the proposed display names and aliases above.

| Query | Current results | With proposed row |
|---|---|---|
| `Pomodoro San Marzano dell'Agro Sarnese-Nocerino`; `San Marzano PDO`; `San Marzano DOP`; `San Marzano AOP`; `Tomates pelées San Marzano AOP` | No result | Proposed PDO row only |
| `San Marzano`; `Pomodoro` | No result | Proposed PDO row only |
| `Tomates pelées`; `peeled tomatoes`; `whole peeled tomatoes` | No result | Proposed PDO row only |
| `tomatoes` | Cherry tomato, plum tomato, generic tomatoes (3) | Same 3 plus proposed PDO row (4) |
| `tomates` | Green tomato ketchup, passata, tomato juice, tomato paste, tomato purée, generic tomatoes (6) | Same 6 plus proposed PDO row (7) |
| `tomato` | 11 current tomato-related results | Unchanged at 11; existing exact-word matches suppress substring fallback |
| `tomate` | 6 current tomato-related results | Unchanged at 6 for the same phrase-first reason |
| `whole tomatoes`; `canned whole tomatoes` | Generic tomatoes only | Unchanged; candidate aliases do not claim these unqualified phrases |
| `DOP` | Pecorino Romano PDO and Traditional Balsamic Vinegar of Modena PDO | Same two plus proposed row (3) |
| `PDO` | Pecorino Romano, Taleggio, and Tête de Moine PDO rows (3) | Same three plus proposed row (4) |
| `AOP` | Comté, Pecorino Romano, Taleggio, Tête de Moine, and Modena balsamic rows (5) | Same five plus proposed row (6) |

The bare `San Marzano` search result is a meaningful picker side effect: the protected name itself contains that phrase, while local Canadian product listings also use unqualified or `San Marzano Type` wording. Do not add a broad alias or auto-link unqualified recipe text to the protected identity. The visible PDO/AOP name lets a user distinguish the proposed row from generic tomatoes. The broad `tomatoes` and `tomates` result counts also grow by one; these are expected consequences of the bilingual display names.

## Complete bundled-recipe demand scan

All **114 manifest-listed recipe JSON files** and all **1,123 structured ingredient rows** were parsed as UTF-8. The complete decoded recipe documents and every ingredient row were searched for the official Italian name, `San Marzano` spellings and PDO/AOP/DOP variants, peeled-product terms, and the proposed ID. The scan found **zero candidate-matching files, zero candidate-matching ingredient rows, and zero candidate-linked recipe IDs**.

For context, five generic tomato-product ingredient rows appear in five files: recipe 034 uses 798 ml canned diced tomatoes; recipe 078 uses 2 tbsp tomato paste; recipe 086 uses 156 ml tomato paste; recipe 090 uses 1 cup tomato sauce; and recipe 096 uses four large generic tomatoes. These remain linked to their current generic references and provide no San Marzano PDO demand or reason to relink.

The corpus snapshot totals **753,988 raw recipe-file bytes** and has manifest-order fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative recipe path, a NUL byte, the lowercase SHA-256 digest of that file, and a newline, then hashes the concatenated bytes. No bundled amount, form, or substitution context supports this candidate.

## Forms, measurements, and substitutions

- The product specification gives tomato dimensions, minimum drained-weight share, color, pH, and solids thresholds. These are product-standard attributes, not cooking-unit mappings, a sampled density, or a recipe-line amount. Do not use them for a reusable `g/ml` density or household conversion. [S02–S03]
- Berchicci’s Mutti SKU is **398 mL** and Maison Jacynthe’s La Valle SKU is **28 oz**. These are different retailer packages and product-specific amounts; neither establishes a reusable can yield or recipe measure. The retailers also list their own product ingredients and permitted additions, not a universal PDO formula. [S04–S06]
- No candidate-specific ingredient form is justified by the current recipe corpus. Keep the existing generic canned tomato forms under `ingredient-ref-tomatoes`; do not add a PDO form or attach generic form rows to the proposed reference without matching recipe demand.
- No source reviewed establishes a tested substitution direction or ratio between San Marzano PDO tomatoes and generic tomatoes, other peeled tomato products, paste, passata, or sauce. Add no global/contextual substitution, inverse rule, or recipe-line link; retain substitution research as `not_yet_researched` if a ledger record is created.

## Evidence limits and source register

Sources were accessed on 2026-10-17. New source IDs and URLs below were checked for collisions against the live ledger. Berchicci’s French and English pages describe the same SKU and count as one retailer/product observation. The official OJ amendment publication S02 is used for the specification text; S01 is the later approval that makes that amendment effective.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-SAN-MARZANO-R439-20261017-S01` | European Commission, [Commission Implementing Regulation (EU) 2019/1346](https://eur-lex.europa.eu/eli/reg_impl/2019/1346/oj/eng/pdf), 8 August 2019, Official Journal L 213, 14 August 2019. | Primary legal act approving the non-minor specification amendment and corrected registered name. EUR-Lex lists the act as in force. It confirms PDO status and approval but points to the published amendment for the technical product details. |
| `WP06-EUROPE-SAN-MARZANO-R439-20261017-S02` | European Commission, [Official Journal C 138/2 — amended single document](https://eur-lex.europa.eu/legal-content/EN/TXT/PDF/?uri=oj%3AJOC_2019_138_R_0002), 15 April 2019, §§ 1–5; amendment approved by S01. | Defines the protected designation, varieties, geographic area, and processing to `pelato` (peeled tomatoes), including the specified municipalities. Its product dimensions, processing criteria, and geography are not kitchen measurements. This is the amendment publication, not a separately updated later specification. |
| `WP06-EUROPE-SAN-MARZANO-R439-20261017-S03` | Regione Campania, [Pomodoro San Marzano dell'Agro Sarnese-Nocerino DOP](https://agricoltura.regione.campania.it/tipici/pomodoro_sanmarzano.html), product scope and area sections; page last updated 29 August 2019. | Regional government description says the PDO is exclusively peeled whole and peeled-strip product, identifies the area as 41 municipalities in Salerno, Naples, and Avellino, and lists permitted additions. It corroborates product scope; the Commission act/specification remains the legal authority. |
| `WP06-EUROPE-SAN-MARZANO-R439-20261017-S04` | Berchicci, [French Mutti Tomates San Marzano D.O.P. Pelées Entières 14oz](https://store.berchicci.ca/fr-ca/tomates-san-marzano-pel%C3%A9es-enti%C3%A8res-mutti), product title and description, accessed 2026-10-17. | Montréal retailer listing is currently in stock; French title uses D.O.P. and product text also says AOP. The stated format is one SKU’s 398 mL package and its listed ingredients. Not a general product formula, measure, or stock guarantee. |
| `WP06-EUROPE-SAN-MARZANO-R439-20261017-S05` | Berchicci, [English Mutti Whole Peeled San Marzano D.O.P. Tomatoes 14oz](https://store.berchicci.ca/tomatoes/mutti-whole-peeled-san-marzano-tomatoes), product title and description, accessed 2026-10-17. | English title uses PDO/D.O.P. wording and supports the English display. This is the same 398 mL Mutti product as S04, not independent package or market evidence. |
| `WP06-EUROPE-SAN-MARZANO-R439-20261017-S06` | Maison Jacynthe, [Tomates pelées — La Valle DOP San Marzano](https://maisonjacynthe.ca/products/tomates-pelees-la-valle-dop-san-marzano), accessed 2026-10-17. | Separate Québec French retailer product page uses `Tomates pelées`, `DOP`, `San Marzano`, and `AOP` in its description and shows a 28 oz product listing. Naming and package facts are listing-specific; the EU sources define protected status. |
| `WP06-EUROPE-SAN-MARZANO-R439-20261017-S07` | Metro Canada, [Primo San Marzano Type Tomatoes Packed in Purée](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/tomatoes-paste/san-marzano-type-tomatoes-packed-in-puree/p/055900004634), product number 055900004634, accessed 2026-10-17. | Canadian retailer calls this 796 mL product “San Marzano Type” and marks it Product of Canada. Supports keeping style wording separate from the Campania PDO; it is not proof of a PDO label, protected origin, or recipe measure. |
| Existing ledger source `WP05-CSCR-20261010-S25` | Mayrand, [Sauce marinara San Marzano](https://mayrand.ca/fr/nos-produits/epicerie/sauce/sauce-pour-pates/sauce-marinara-san-marzano-24812), French product title and category. | Existing Québec source for one marinara SKU attached to `ingredient-ref-marinara-sauce`. It does not define tomato identity or show PDO status. Reuse this source by reference; do not add it as an R439 tomato source. |

## Disposition

Proceed with one identity-only `VEGETABLE_AND_AROMATIC` row for **`Tomates pelées San Marzano AOP / San Marzano PDO peeled tomatoes`**, carrying only the official Italian name and qualified market-attested search phrases in its alias arrays. Preserve the generic tomato family, its canned forms, other processed tomato products, and unqualified `San Marzano Type` products as separate. The picker will add this result to generic plural tomato queries and resolve bare `San Marzano` to the protected row; retain the visible qualifiers and leave user assignment explicit. Add no forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions. Keep the WP06 Europe checklist open.

No tests, build, emulator run, or deployment were performed because this is proposal-only documentation work.

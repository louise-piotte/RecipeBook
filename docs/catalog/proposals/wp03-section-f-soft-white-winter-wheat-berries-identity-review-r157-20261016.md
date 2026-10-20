# WP03 Section F — soft white winter wheat berries (R157, 2026-10-16)

## Review record

- **Status:** Proposal only; no shared catalog, ledger, checklist, roadmap, recipe, or generated-index file was changed.
- **Scope:** Review the whole-kernel food product sold as soft white winter wheat berries, distinct from the season-unspecified soft-white wheat-berries row.
- **Recommendation:** Add identity-only **soft white winter wheat berries / grains de blé tendre blanc d'hiver** as a `GRAIN_AND_CEREAL` reference. Keep aliases, forms, measurements, density, unit mappings, conversions, yields, recipe links, and substitutions empty.
- **Proposed reference and ledger ID:** `ingredient-ref-soft-white-winter-wheat-berries`.
- **Source-ID prefix:** `WP03-SOFTWHITEWINTER-R157-20261016-S` (S01–S05). The proposed ID and source-ID prefix are unallocated in the current package and ledger.

## Candidate choice and product boundary

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L519) keeps broader grain and cereal identity coverage open. Recent handoffs R149–R156 cover Red Fife berries, red and black quinoa, and several named spring/winter wheat-berry products. The current `ingredient-ref-soft-white-wheat-berries` row covers a season-unspecified product. R154 explicitly declined to infer a season from its two reviewed seller listings. R155 later mentions soft white winter berries only as a neighboring product in a mill's collection, while reviewing soft red winter berries; neither handoff allocated or decided the soft-white-winter product. No focused proposal, hold, or current identity for this seasonal product was found in the proposal/batch archive, plan, roadmap, active references, forms, or ledger.

A current Ontario mill lists **Organic Soft White Winter Wheat Berries** as an unmilled whole-grain product, describes it as grown in Ontario and ready for home milling, and offers 1 kg, 2.5 kg, 10 kg, and 20 kg package options [S01]. The exact product title and whole-kernel description support a bounded food identity. Do not carry the seller's organic, non-GMO, origin, package-size, or baking-performance claims into the general catalog row.

The Canadian Grain Commission distinguishes the **Canada Eastern White Winter (CEWW)** class from the western soft-white-spring class and identifies CEWW as soft white winter wheat [S02–S03]. These official class sources establish that the seasonal qualifier denotes a distinct Canadian wheat class. They do **not** establish that the seller's product comes from a variety designated to CEWW or meets that class's grade. Keep the proposed row scoped to the seller-attested product name; do not infer cultivar, formal class, grade, origin, organic status, protein content, or baking performance for all products under it.

Keep this row distinct from:

- `soft white wheat berries / grains de blé tendre blanc`, whose current row has no season qualifier;
- hard white spring, hard red spring, hard red winter, soft red winter, Red Fife, durum, generic, and sprouted wheat berries;
- wheat flour, cracked wheat, bulgur, flakes, bran, germ, and prepared cereals; and
- planting seed, feed grain, or wheat included only as one component in a blend.

Do not add the season-unspecified wording `soft white wheat berries` or `grains de blé tendre blanc` as aliases. Those terms already belong to the broader row and should continue to reveal the distinction in the picker.

## French display and limits

Use **`grains de blé tendre blanc d'hiver`** provisionally. The Commission's current French CEWW designation uses `Blé blanc d'hiver, Est canadien`; its current English class page identifies CEWW as soft white winter wheat [S02–S03]. OQLF prefers `blé tendre` for soft wheat [S04]. Together, these sources support the components of the proposed phrase, but the full display is a source-informed construction, not an OQLF ruling or a verified Québec retail label. The reviewed seller page is English-only. Keep independent Québec terminology review open and do not add French aliases such as `blé blanc d'hiver`, `blé tendre`, or the season-unspecified `grains de blé tendre blanc`.

## Proposed ingredient-reference delta

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-soft-white-winter-wheat-berries",
  "nameEn": "soft white winter wheat berries",
  "nameFr": "grains de blé tendre blanc d'hiver",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Do not add an `IngredientForm`, legacy candidate, recipe link, or recipe-line edit.

## Exact ownership, ID, and picker audit

The current package contains **1,529 active references**, **119 forms**, **61 legacy candidates**, and **1,874 research-ledger records** with **7,944 source entries / 6,792 distinct source IDs**. The manifest lists **114 recipes** containing **1,123 structured ingredient rows**.

An accent-, case-, punctuation-, and ligature-normalized exact-key audit covered active reference names/aliases, form labels/match terms, and legacy-candidate names/aliases. It found no exact owner for `soft white winter wheat berries`, `soft white winter`, `grains de blé tendre blanc d'hiver`, or `blé tendre blanc d'hiver`. The existing exact owners are the broader `soft white wheat berries` and `grains de blé tendre blanc` terms on `ingredient-ref-soft-white-wheat-berries`; neither term is proposed as an alias. The proposed reference ID and `candidate-soft-white-winter-wheat-berries` are absent from reference, form, legacy, and ledger record IDs. The R157 source-ID prefix is absent from ledger source IDs.

Archive search found only adjacent mentions: R154's soft-white review discusses the difference between soft-white-spring and soft-white-winter classes but explicitly does not assign a season to its reviewed products; R155's product-collection source lists soft white winter berries as a sibling of the soft red winter product but does not decide its identity. No earlier focused soft-white-winter review, hold, candidate record, or ID allocation was found.

The projection follows current phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms. It appends the proposed row with only the two display names and no aliases:

| Query | Current results | With proposed row | Effect |
| --- | --- | --- | --- |
| `soft white winter wheat berries` | 0 | 1: proposed identity | Exact English product query resolves to the new row. |
| `grains de blé tendre blanc d'hiver` | 0 | 1: proposed identity | Exact provisional French display resolves to the new row. |
| `soft white winter` / `soft white winter wheat` | 0 / 0 | 1 / 1: proposed identity | The qualified seasonal product phrase resolves without aliases. |
| `soft white wheat berries` | `ingredient-ref-soft-white-wheat-berries` | unchanged | The season-unspecified display remains with the existing broader row. |
| `grains de blé tendre blanc` | `ingredient-ref-soft-white-wheat-berries` | existing row plus proposed row | The French base phrase becomes a visible broad choice because it is contained in the proposed display. |
| `soft white` | `ingredient-ref-soft-white-wheat-berries` | existing row plus proposed row | The broad English phrase gains the seasonal identity as an additional visible choice. |
| `soft white wheat` | `ingredient-ref-soft-white-wheat-berries` | unchanged | The shorter season-unspecified phrase does not resolve to the new seasonal row. |
| `wheat berries` | 9 identities | 10 identities | Adds the named soft-white-winter product beside the current generic and qualified choices. |
| `winter wheat berries` | Soft-red-winter and hard-red-winter berries | Those two plus proposed identity | Exposes the three distinct winter wheat-berry choices. |
| `soft red winter wheat berries` / `hard red winter wheat berries` | Their respective current identities | unchanged | R155 and R156 choices remain specific. |
| `hard white spring wheat berries` | Its current identity | unchanged | The spring product remains distinct. |

This is a static projection, not live picker QA. No broad or season-unspecified alias is added.

## Manifest recipe demand

Parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Scanned complete recipe JSON and each structured ingredient row for the English/French displays, seasonal and whole-kernel phrase variants, and both proposed IDs. There were **zero candidate-term file hits and zero ingredient-row hits**. No recipe is linked to the proposed identity, and no recipe link, relink, amount, form, or substitution is warranted.

## Forms, measures, conversions, and substitutions

- **Forms:** No form is attached to the existing season-unspecified soft-white-wheat-berries row or any wheat-berry reference. Add none; the proposed identity itself names the dry whole-kernel product.
- **Package sizes:** The mill's 1 kg, 2.5 kg, 10 kg, and 20 kg options are package formats, not recipe portions or household measures [S01].
- **Density and unit mappings:** No reusable cup-to-mass relation was found. Keep `defaultDensity` null and `unitMappings` empty. The Commission's 2025 CEWW report gives agricultural test-weight data for a grade aggregate; this is not a kitchen ingredient density and is not transferred to the proposed product [S05].
- **Conversions and yields:** No source provides a reusable dry-to-cooked conversion or cooking yield for this product. The current ledger has no wheat-specific unit conversion, and the package-yield file has no wheat entry. Add no conversion, cooking yield, or package yield.
- **Substitutions:** The global and contextual substitution files contain no active rules. The mill's home-milling and baking descriptions are not evidence for a tested replacement ratio or scoped recipe substitution. Add no global or contextual rule.
- **Recipe links:** None; the manifest scan found no candidate-term hit.

## Proposed research-ledger delta

If the identity is accepted, append one `ingredient_reference` record. It keeps all reusable measurement and substitution behavior empty and records the French display limitation.

```json
{
  "recordId": "ingredient-ref-soft-white-winter-wheat-berries",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-SOFTWHITEWINTER-R157-20261016-S01",
      "url": "https://1847.ca/product/soft-white-winter-wheat-berries/",
      "title": "1847 Stone Milling, Organic Soft White Winter Wheat Berries",
      "accessedOn": "2026-10-16",
      "locator": "Product heading, whole-grain and unmilled description, Ontario-grown statement, and package options.",
      "supports": "Currently lists soft white winter wheat berries as whole, unmilled food grain for home milling. It identifies this seller's product as Ontario-grown and displays package options. It does not identify a wheat variety, official Canadian class or grade, reusable measure, or Québec French product title; product qualifiers and package sizes are not generalized.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-SOFTWHITEWINTER-R157-20261016-S02",
      "url": "https://www.canada.ca/fr/commission-grains/services/systeme-qualite-grains/arretes/lvd-ble-ceww.html",
      "title": "Commission canadienne des grains, Blé blanc d'hiver, Est canadien (CEWW), arrêté 2026-09",
      "versionOrDate": "2026-09",
      "accessedOn": "2026-10-16",
      "locator": "Official French class name, designated varieties, and order effective for the 2026–2027 crop year.",
      "supports": "Establishes the current French name of the Canada Eastern White Winter class and its designated varieties. It supports the terminology and distinct class context, but does not assign the reviewed seller's product to CEWW or establish its variety, grade, or cultivar.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTWHITEWINTER-R157-20261016-S03",
      "url": "https://www.canada.ca/en/grain-commission/services/grain-quality-system/wheat-classes.html",
      "title": "Canadian Grain Commission, Canadian wheat classes",
      "versionOrDate": "Page details: 2026-08-24",
      "accessedOn": "2026-10-16",
      "locator": "Eastern wheat-class table, Canada Eastern White Winter (CEWW).",
      "supports": "Describes wheat classes as functional groupings associated with production regions and identifies CEWW as soft white winter wheat, distinct from soft-white-spring wheat. It establishes class nomenclature, not a class assignment for the seller product.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTWHITEWINTER-R157-20261016-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre",
      "title": "Office québécois de la langue française, blé tendre (GDT)",
      "versionOrDate": "Last updated 2019",
      "accessedOn": "2026-10-16",
      "locator": "Preferred term, definition, and English equivalent.",
      "supports": "Prefers blé tendre for soft wheat and describes its grain as white or red. It supports a French wording component only; it does not name soft white winter wheat berries or approve the proposed compound display.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTWHITEWINTER-R157-20261016-S05",
      "url": "https://www.grainscanada.gc.ca/en/grain-research/grain-harvest-export-quality/wheat/2025/harvest-quality-report-ceww-2025.html",
      "title": "Canadian Grain Commission, Quality of Canada Eastern White Winter wheat in 2025",
      "versionOrDate": "2025 crop; page modified 2025-10-22",
      "accessedOn": "2026-10-16",
      "locator": "Class description and 2025 CEWW grade-aggregate table, including test weight.",
      "supports": "Describes CEWW as a soft-white-winter class and reports 78 kg/hL test weight for its 2025 grade aggregate. This supports the class context only; the test weight is agricultural quality data, not a kitchen density or specification for the reviewed seller product.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only soft white winter wheat berries / grains de blé tendre blanc d'hiver for the current whole-kernel food product listed by an Ontario mill. The active soft-white-wheat-berries row is season-unspecified, and the new product name states winter; current Canadian Grain Commission sources distinguish the soft-white-winter class from the soft-white-spring class. The seller's product is not assigned to a designated variety, class, or grade. The French display is a source-informed construction, not an OQLF ruling or verified Québec product title; keep independent Québec review open. Add no aliases, forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP03-SOFTWHITEWINTER-R157-20261016-S01",
        "WP03-SOFTWHITEWINTER-R157-20261016-S02",
        "WP03-SOFTWHITEWINTER-R157-20261016-S03",
        "WP03-SOFTWHITEWINTER-R157-20261016-S04",
        "WP03-SOFTWHITEWINTER-R157-20261016-S05"
      ]
    }
  ]
}
```

## Source register and limits

Sources were checked online on 2026-10-16. Product listings and availability can change; claims remain limited to the cited page.

| Source ID | Source | Evidence used and limits |
| --- | --- | --- |
| `WP03-SOFTWHITEWINTER-R157-20261016-S01` | 1847 Stone Milling, [Organic Soft White Winter Wheat Berries](https://1847.ca/product/soft-white-winter-wheat-berries/). | Exact current product heading, unmilled whole-grain description, and Ontario-grown statement. The page offers multiple package sizes, which are not measures. It does not name a cultivar or formal Canadian class. |
| `WP03-SOFTWHITEWINTER-R157-20261016-S02` | Canadian Grain Commission, [Blé blanc d'hiver, Est canadien (CEWW), arrêté 2026-09](https://www.canada.ca/fr/commission-grains/services/systeme-qualite-grains/arretes/lvd-ble-ceww.html). | Current official French class name and designated varieties. It does not establish the seller's cultivar, grade, or CEWW assignment. |
| `WP03-SOFTWHITEWINTER-R157-20261016-S03` | Canadian Grain Commission, [Canadian wheat classes](https://www.canada.ca/en/grain-commission/services/grain-quality-system/wheat-classes.html). | Current class page identifies CEWW as soft white winter wheat and distinguishes it from spring classes. It does not assign the reviewed retail product to a formal class. |
| `WP03-SOFTWHITEWINTER-R157-20261016-S04` | OQLF, [blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre). | Preferred Québec term and English equivalent for soft wheat; the entry supports the base wording only, not the whole-kernel compound. |
| Existing archive evidence, not reallocated | R154's [soft-white-wheat-berries review](wp03-section-f-next-grain-gap-review-r154-20261015.md), especially its CGC class distinction; R155's already-ledgered 1847 [grain-berry collection source](wp03-section-f-next-grain-gap-review-r155-20261015.md#L144), which lists soft white winter as a neighboring product. | These were re-read to establish that the candidate had only been mentioned as context and had not received a focused identity decision or hold. Their prior source IDs remain with their existing records. |
| `WP03-SOFTWHITEWINTER-R157-20261016-S05` | Canadian Grain Commission, [Quality of Canada Eastern White Winter wheat in 2025](https://www.grainscanada.gc.ca/en/grain-research/grain-harvest-export-quality/wheat/2025/harvest-quality-report-ceww-2025.html). | Reports CEWW as a minor soft-wheat class and provides harvest-quality figures, including 78 kg/hL test weight for the 2025 grade aggregate. This is agricultural class data, not a kitchen density, conversion, or specification for the seller's food product. |

## Static review checks

- Re-read `AGENTS.md`, the active Section F checklist, and focused WP03 Section F proposals and integration records R149–R156 before candidate selection.
- Compared normalized proposed names and IDs against current references, forms, legacy candidates, ledger IDs, source IDs, and the proposal/batch archive. The R154 and R155 mentions are contextual only; no focused prior review, hold, or allocation exists.
- Reproduced the static phrase-first picker projection from current references/forms and the implementation in `IngredientSearch.kt`.
- Parsed all 114 manifest-listed recipe files and 1,123 ingredient rows; candidate terms had zero file or line hits.
- Checked current forms, package yields, conversions, and substitution files. No candidate-specific form, reusable measure, wheat conversion/yield, recipe link, or active substitution is supported.
- This remains proposal-only. No shared catalog, ledger, index, checklist, roadmap, README, or recipe was changed. No tests, Gradle tasks, emulator, app, or deployment checks were run.

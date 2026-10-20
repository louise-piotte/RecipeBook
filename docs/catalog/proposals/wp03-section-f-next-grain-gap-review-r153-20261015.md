# WP03 Section F — hard white spring wheat berries identity review (R153, 2026-10-15)

## Review record

- **Reviewed:** 2026-10-15.
- **Status:** Proposal only; no shared catalog, ledger, plan, roadmap, recipe, or generated-index edits.
- **Scope:** Decide whether whole hard white spring wheat kernels marketed as wheat berries merit a separate Section F identity from generic wheat berries, hard red spring wheat berries, soft white wheat products, and white whole-wheat flour.
- **Recommendation:** Accept an identity-only `GRAIN_AND_CEREAL` reference for **hard white spring wheat berries / grains de blé de force blanc de printemps**. Leave aliases, forms, recipe links, reusable measurements, conversions, yields, and substitutions empty.
- **Proposed reference ID:** `ingredient-ref-hard-white-spring-wheat-berries`.
- **Source-ID prefix:** `WP03-HWSW-R153-20261015-S` (S01–S07). The prefix and proposed reference ID were checked against the current package and ledger; neither is allocated.

## Candidate selection and prior work

Section F remains open for grain and cereal identity coverage. The focused handoff sequence most recently reviewed red Fife wheat berries (R149), red quinoa (R150), black quinoa (R151), and hard red spring wheat berries (R152). Each has since been integrated. R152's Storehouse collection review explicitly names hard white spring wheat berries as a neighboring product but does not review or assign it. Searches of the Section F checklist, plan, proposals, batches, roadmap, active references, forms, legacy candidates, and ledger found no prior focused review or hold for this hard-white-spring whole-grain product.

The current catalog already has generic wheat berries, durum wheat berries, sprouted wheat berries, Red Fife wheat berries, and the R152 hard red spring wheat berries row. It also has a separate white whole-wheat flour identity. These records cover different products or processing states; none identifies the current Canadian whole-kernel product sold under the exact title `Hard White Spring Wheat Berries`.

## Product identity and evidence boundary

The Canadian Grain Commission's current class materials distinguish Canada Western Hard White Spring (CWHWS) from Canada Prairie Spring White (CPSW) and Canada Western Soft White Spring (CWSWS). The 2026 CWHWS order lists ten eligible wheat varieties, so the class is not a single cultivar [S01–S03]. This regulatory classification supports the market-class boundary; it does not by itself establish a consumer product.

Storehouse Foods currently lists **Hard White Spring Wheat Berries**, identifies the product as grown in Alberta, and describes using the whole or cracked berries as cereal [S04]. This establishes a Canadian seller's whole-kernel food product and exact English wording. The listing says `No. 1 Grade` but does not identify a CWHWS class code or a registered variety; neither is inferred for the catalog. Its package choices and product claims remain seller-specific.

Limit the proposed identity to the whole-kernel food product marketed as hard white spring wheat berries. Do not assign a cultivar, formal grade, protein level, Canadian grain class, growing practice, or performance claim to every product with the display name. Keep it distinct from:

- generic `wheat berries / grains de blé entiers`;
- hard red spring, durum, Red Fife, and sprouted wheat berries;
- hard white wheat listings that do not state the season;
- Canada Prairie Spring White and soft white spring wheat classes;
- white whole-wheat flour and other milled flour products; and
- cracked wheat, which is a separately processed product, not a form demonstrated for this identity.

Expeditor Dry Goods currently lists Alberta-grown `Hard White Wheat Berries` without a season qualifier [S07]. This reinforces why the broader phrase is not an alias for the spring-qualified listing. The source does not show that its product is winter wheat; its season is simply unspecified.

## French naming boundary

Use **`grains de blé de force blanc de printemps`** as the proposed French display. The Canadian Grain Commission's current French terminology gives `blé de force blanc de printemps` for its hard-white-spring class, and its 2026 order uses the same wording in the official class name [S01–S02]. Adding `grains de` makes the proposed display explicit about the whole-kernel product and follows the catalog's existing `grains de blé entiers` wording.

This is a source-informed construction, not a Québec-validated retail label or an OQLF ruling for this product. The OQLF entry for `farine de blé de force` defines a flour made from grains of `blé de force`; it supports the local terminology component but is scoped to flour [S06]. No current Québec retail listing or OQLF entry for whole hard white spring wheat berries was found. Keep the proposed French display provisional for independent Québec terminology review.

Do not add `blé blanc de printemps` as an alias: the Canadian Grain Commission assigns that exact French class name to the distinct Canada Prairie Spring White (CPSW) class, while CWSWS is `blé tendre blanc de printemps` [S01, S03]. Keep bare `blé blanc`, `blé de force`, `grains de blé entiers`, and season-unspecified English `hard white wheat berries` off this row. The first two are broader; generic whole-grain wording belongs to the existing generic wheat-berries row.

## Proposed catalog reference delta

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-hard-white-spring-wheat-berries",
  "nameEn": "hard white spring wheat berries",
  "nameFr": "grains de blé de force blanc de printemps",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

No `IngredientForm`, recipe link, or legacy candidate is proposed.

## Exact ownership and picker projection

The live package snapshot contains **1,522 active references, 119 forms, 61 legacy candidates, 1,867 research-ledger records, and 114 manifest-listed recipes**. Accent-, case-, punctuation-, and ligature-normalized exact-key checks covered active reference names and aliases, form labels and match terms, legacy candidate names and aliases, ledger record IDs and strings, and the proposed ID. No exact owner was found for either proposed display, the proposed ID, or `candidate-hard-white-spring-wheat-berries`. The source-ID prefix was also absent from all ledger sources.

No exact match is already owned, but the broader query `hard white` currently matches the separate `white whole-wheat flour` row through its `hard white whole wheat flour` English alias. The table follows the current phrase-first behavior in `IngredientSearch.kt`, projecting current reference and form search terms with the proposed display appended and no aliases:

| Query | Current → proposed | Picker effect |
| --- | ---: | --- |
| `hard white spring wheat berries` | 0 → 1 | Finds the exact English product display. |
| `hard white spring wheat` | 0 → 1 | Finds the class-qualified English phrase in the display. |
| `grains de blé de force blanc de printemps` | 0 → 1 | Finds the exact proposed French display. |
| `blé de force blanc de printemps` | 0 → 1 | Finds the class-qualified French phrase in the display. |
| `hard white` | 1 → 2 | Adds the whole-grain choice beside `white whole-wheat flour`; the query remains visibly ambiguous. |
| `hard white whole wheat flour` | 1 → 1 | Remains on white whole-wheat flour. |
| `blé blanc` | 1 → 1 | Remains on the existing white whole-wheat flour; it is not added as an alias. |
| `blé blanc de printemps` | 0 → 0 | Does not misroute the distinct CPSW class wording to this row. |
| `hard white wheat berries` | 0 → 0 | Remains unresolved because it drops the season qualifier; no alias is proposed. |
| `wheat berries` | 5 → 6 | Adds hard white spring wheat among generic, durum, sprouted, Red Fife, and hard red spring wheat berries. |
| `grains de blé entiers` | 1 → 1 | Remains on the generic wheat-berries identity. |
| `hard red spring wheat berries` | 1 → 1 | Remains on the R152 identity. |
| `durum wheat berries` | 1 → 1 | Remains on the durum identity. |
| `Red Fife wheat berries` | 1 → 1 | Remains on the Red Fife identity. |

The broad `wheat` and `blé` queries remain family searches; they move from 49 to 50 and 52 to 53 results respectively. No search implementation or UI change is proposed.

## Bundled recipe demand

The canonical `manifest.v1.json` lists **114 recipe files and 1,123 structured ingredient rows**. The entire JSON text of all manifest-listed files and each structured ingredient row were scanned for normalized variants including `hard white spring wheat berries`, singular `hard white spring wheat berry`, `hard white spring wheat`, `hard white wheat berries`, `hard white wheat`, `hard white`, `white wheat berries`, `whole hard white wheat`, `grains de blé de force blanc de printemps`, `grain de blé de force blanc de printemps`, `blé de force blanc de printemps`, `blé blanc de printemps`, `blé blanc`, the proposed ID, and the corresponding legacy candidate key.

The scan found **zero candidate-term hits in recipe files and zero ingredient-row hits**. It also found no direct recipe links to `ingredient-ref-wheat-berries`, `ingredient-ref-durum-wheat-berries`, `ingredient-ref-red-fife-wheat-berries`, `ingredient-ref-sprouted-wheat-berries`, or `ingredient-ref-hard-red-spring-wheat-berries`. No recipe link, relink, recipe text edit, or substitution is proposed.

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Add none. The identity itself is the intact whole-kernel product. Storehouse's mention of whole or cracked berries as possible cereal uses does not establish a reusable `cracked` form; cracked wheat remains a separate processed product. Milling produces flour, also a separate identity.
- **Package quantities:** Storehouse shows 1 kg, 2.5 kg, 10 kg, and 20 kg options [S04]. These are package formats, not household measures, portions, or volume-to-mass observations.
- **Cooking and yield:** Storehouse mentions whole or cracked berries as cereal but provides no measured cooked yield or recipe-scale conversion on the reviewed page [S04]. Add no cooking yield or package yield.
- **Density and unit mappings:** No product-specific mass-volume evidence was found. Keep `defaultDensity` null and `unitMappings` empty. Do not transfer data from generic, durum, Red Fife, hard red spring, or sprouted wheat berries. The sprouted-wheat ledger has one product-specific 1/4 cup = 50 g observation, which does not apply to this unsprouted product.
- **Conversions:** The current research ledger has no wheat-specific unit conversion, and the bundled package-yield file has no wheat entry. Add no conversion or derived measure.
- **Substitutions:** The current global and contextual substitution-rule files contain no wheat substitution rule. The reviewed source's broad nutrition comparison of red and white wheat is not a tested culinary replacement or recipe-role rule. Add no global or contextual substitution and no recipe-line substitution link.

## Proposed research-ledger delta

If the identity is accepted, append one `ingredient_reference` record. Its states record the scope of this review; the empty arrays intentionally leave all reusable measures and substitution rules inactive.

```json
{
  "recordId": "ingredient-ref-hard-white-spring-wheat-berries",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-HWSW-R153-20261015-S01",
      "url": "https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/04-ble/classes-varietes.html",
      "title": "Commission canadienne des grains, Blé : Classes et variétés",
      "accessedOn": "2026-10-15",
      "locator": "Official wheat-class table rows for CWHWS, CPSW, and CWSWS.",
      "supports": "Gives the official French class names blé de force blanc de printemps de l’Ouest canadien, blé blanc de printemps Canada Prairie, and blé tendre blanc de printemps de l’Ouest canadien. Supports the French class distinction, not a consumer whole-berry label, OQLF ruling, or the assignment of the Storehouse product to a registered class.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-HWSW-R153-20261015-S02",
      "url": "https://www.grainscanada.gc.ca/fr/qualite-grains/listes-des-varietes-designees/2026/lvd-ble-cwhws.html",
      "title": "Commission canadienne des grains, Blé de force blanc de printemps, Ouest canadien (CWHWS), arrêté 2026-17",
      "versionOrDate": "Signed 2026-06-10; effective 2026-08-01 through 2027-07-31.",
      "accessedOn": "2026-10-15",
      "locator": "CWHWS class establishment and the ten varieties in the 2026 designation list.",
      "supports": "Establishes a current Canadian class with multiple designated varieties. It does not establish one cultivar, a consumer retail identity, or that a particular seller's No. 1 grade is a CWHWS grade.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-HWSW-R153-20261015-S03",
      "url": "https://www.grainscanada.gc.ca/en/grain-quality/grain-grading/wheat-classes.html",
      "title": "Canadian Grain Commission, Canadian wheat classes",
      "accessedOn": "2026-10-15",
      "locator": "Class descriptions for CWHWS, CPSW, and CWSWS and their stated end uses.",
      "supports": "Describes Canadian classes as grouped by functional characteristics and growing region; identifies hard white spring, white spring, and soft white spring as distinct classes. Class characteristics and flour/end-use descriptions do not establish a whole-kernel household measure or a retail product identity.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-HWSW-R153-20261015-S04",
      "url": "https://storehousefoods.ca/products/hard-white-wheat-berries-1",
      "title": "Storehouse Foods, Hard White Spring Wheat Berries",
      "accessedOn": "2026-10-15",
      "locator": "Product heading, Alberta origin statement, No. 1 Grade wording, package options, and whole/cracked-cereal use note.",
      "supports": "Lists a Canadian whole-kernel food product under the exact English title and identifies it as grown in Alberta. It does not give an OQLF/Québec French label, a CWHWS class code, a designated variety, a cooking ratio, or a measured yield. Package sizes and the seller's grade wording are not catalog measures or generalized specifications.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HWSW-R153-20261015-S05",
      "url": "https://storehousefoods.ca/collections/grains-cereals/wheat-berries",
      "title": "Storehouse Foods, Wheat Berries collection",
      "accessedOn": "2026-10-15",
      "locator": "Current collection product titles for hard white spring, hard red spring, soft white, Red Fife, and durum wheat berries.",
      "supports": "Shows this seller presenting the hard-white-spring item as a distinct product beside neighboring wheat-berry listings. It supports only this seller's catalog distinction, not an industry-wide product taxonomy.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HWSW-R153-20261015-S06",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force",
      "title": "Office québécois de la langue française, farine de blé de force (GDT)",
      "versionOrDate": "Last updated 2004.",
      "accessedOn": "2026-10-15",
      "locator": "Definition of farine de blé de force and its English equivalent hard wheat flour.",
      "supports": "The definition describes flour made from grains of blé de force. It supports the Québec terminology component blé de force only; it does not name hard white spring wheat berries, classify white or spring wheat, or approve the proposed compound display.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-HWSW-R153-20261015-S07",
      "url": "https://expeditordrygoods.com/products/hard-white-wheat-berries",
      "title": "Expeditor Dry Goods, Hard White Wheat Berries",
      "accessedOn": "2026-10-15",
      "locator": "Product title, Alberta-grown whole-grain description, and current shipping statement.",
      "supports": "Shows a Canadian seller using hard white wheat berries without a season qualifier. The page says the product is Alberta-grown and whole grain but does not identify it as spring wheat; it is used to bound terminology, not to establish an alias or the proposed product's identity. The page displayed Sale Coming soon when reviewed, so it is not evidence of current availability.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only hard white spring wheat berries / grains de blé de force blanc de printemps as the whole-kernel Canadian seller product listed by Storehouse. Keep its exact spring qualifier and separate it from generic wheat berries, other named wheat berries, white whole-wheat flour, Canada Prairie Spring White, and soft white spring wheat. The French display is constructed from current Canadian Grain Commission French class wording and the catalog's whole-grain noun pattern; it is not an OQLF ruling or verified Québec retail title. Add no aliases, forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions.",
      "sourceIds": [
        "WP03-HWSW-R153-20261015-S01",
        "WP03-HWSW-R153-20261015-S02",
        "WP03-HWSW-R153-20261015-S03",
        "WP03-HWSW-R153-20261015-S04",
        "WP03-HWSW-R153-20261015-S05",
        "WP03-HWSW-R153-20261015-S06",
        "WP03-HWSW-R153-20261015-S07"
      ]
    }
  ]
}
```

## Source register

Sources were checked on 2026-10-15. Current product pages and stock states can change; claims are limited to the named page and seller.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-HWSW-R153-20261015-S01` | Canadian Grain Commission, [Blé : Classes et variétés](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/04-ble/classes-varietes.html). | Official French class names distinguish hard white spring (CWHWS), Canada Prairie Spring White (CPSW), and soft white spring (CWSWS). The class list is not a consumer product label or OQLF ruling. |
| `WP03-HWSW-R153-20261015-S02` | Canadian Grain Commission, [Blé de force blanc de printemps, Ouest canadien (CWHWS), arrêté 2026-17](https://www.grainscanada.gc.ca/fr/qualite-grains/listes-des-varietes-designees/2026/lvd-ble-cwhws.html). | Current order signed 2026-06-10, effective for the 2026–2027 crop year, lists ten designated varieties. Establishes a class, not one cultivar, a whole-kernel retail item, or the seller's stated grade. |
| `WP03-HWSW-R153-20261015-S03` | Canadian Grain Commission, [Canadian wheat classes](https://www.grainscanada.gc.ca/en/grain-quality/grain-grading/wheat-classes.html). | Defines classes by functional characteristics and growing region and differentiates hard white spring, white spring, and soft white spring. Its milling and end-use descriptions do not give recipe measures or whole-grain retail identity. |
| `WP03-HWSW-R153-20261015-S04` | Storehouse Foods, [Hard White Spring Wheat Berries](https://storehousefoods.ca/products/hard-white-wheat-berries-1). | Current product page names the exact whole-berry product, says Product of Alberta, gives package choices, and mentions using whole or cracked berries as cereal. Its `No. 1 Grade` wording is not tied on-page to a CWHWS code or variety. Package weights are not measures; the page gives no measured cooking yield. |
| `WP03-HWSW-R153-20261015-S05` | Storehouse Foods, [Wheat Berries collection](https://storehousefoods.ca/collections/grains-cereals/wheat-berries). | Current collection presents hard white spring as a distinct item beside hard red spring, soft white, Red Fife, and durum berries. This is one seller's assortment, not an industry-wide standard. |
| `WP03-HWSW-R153-20261015-S06` | Office québécois de la langue française, [farine de blé de force (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force), last updated 2004. | Defines a flour made from grains of `blé de force` and gives `hard wheat flour`. Supports the Québec wording component only; it is not an entry for the whole-grain product. |
| `WP03-HWSW-R153-20261015-S07` | Expeditor Dry Goods, [Hard White Wheat Berries](https://expeditordrygoods.com/products/hard-white-wheat-berries). | Alberta-grown whole-grain product page uses hard white wheat berries without a season qualifier. It demonstrates why this broader phrase is not copied as an alias. The page showed `Sale Coming soon` when reviewed and does not confirm current availability or a spring class. |

## Static review checks

- Read `AGENTS.md`, the Section F plan/checklist, the R151 and R152 integration READMEs, and the focused R149–R152 Section F proposals before selecting the candidate.
- Checked the Section F archive and roadmap for earlier hard-white-spring reviews or holds; found only the incidental neighboring-product mention in R152.
- Parsed the live bundled references, forms, legacy candidates, ledger, substitution rules, package yields, and manifest. Checked exact normalized ownership for proposed names and ID and checked the source-ID prefix across ledger sources.
- Reproduced phrase-first picker projections from the current reference/form search terms, including the existing `hard white` overlap with white whole-wheat flour.
- Scanned the complete text and structured ingredient rows in all 114 manifest-listed recipe files; found no candidate-term or related whole-wheat-berry reference links among 1,123 rows.
- This is proposal-only work. No shared catalog files were changed, and no Gradle, unit, instrumentation, emulator, app, or deployment tests were run.

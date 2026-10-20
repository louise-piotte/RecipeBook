# WP03 Section F — soft white wheat berries identity review (R154, 2026-10-15)

## Review record

- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, recipe, or generated-index file was changed.
- **Scope:** Decide whether Canadian-market whole kernels listed as soft white wheat berries merit a separate Section F identity from generic wheat berries, named hard-white and hard-red spring wheat berries, and white whole-wheat flour.
- **Recommendation:** Add identity-only **soft white wheat berries / grains de blé tendre blanc** as a `GRAIN_AND_CEREAL` reference. Keep aliases, forms, recipe links, reusable measures, density, unit mappings, conversions, yields, and substitutions empty.
- **Proposed reference ID:** `ingredient-ref-soft-white-wheat-berries`.
- **Source-ID prefix:** `WP03-SOFTWHITE-R154-20261015-S` (S01–S05). Exact ID and prefix checks against the live package and ledger found no allocation.

## Candidate selection and prior work

The current Section F checklist in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L519) leaves broader grain and cereal identity coverage open. The recent focused grain handoff reviewed Red Fife wheat berries (R149), red quinoa (R150), black quinoa (R151), hard red spring wheat berries (R152), and hard white spring wheat berries (R153); each is now integrated. See the [R149 proposal](wp03-section-f-red-fife-wheat-berries-identity-review-r149-20261015.md) and [R149 integration](../batches/wp02-wp03-wp04-r149-gap-review-integration-20261015/README.md), [R150 proposal](wp03-section-f-next-grain-gap-review-r150-20261015.md) and [integration](../batches/wp02-wp03-wp04-r150-gap-review-integration-20261015/README.md), [R151 proposal](wp03-section-f-black-quinoa-grain-identity-review-r151-20261015.md) and [integration](../batches/wp02-wp03-wp04-r151-gap-review-integration-20261015/README.md), [R152 proposal](wp03-section-f-next-grain-gap-review-r152-20261015.md) and [integration](../batches/wp02-wp03-wp04-r152-gap-review-integration-20261015/README.md), and [R153 proposal](wp03-section-f-next-grain-gap-review-r153-20261015.md) and [integration](../batches/wp02-wp03-wp04-r153-gap-review-integration-20261015/README.md).

R153's Storehouse Foods collection lists a soft-white wheat-berry item beside hard white spring, hard red spring, Red Fife, and durum products. R153 scoped its decision to the hard-white-spring item; it did not decide the soft-white product's identity, season, Québec French wording, or catalog ownership. The focused Section F proposal/batch search found no earlier review or hold for the soft-white whole-kernel product. Earlier Section F references to soft wheat concern a component in a named couscous blend or flour terminology, not this standalone grain product.

## Identity boundary and French wording

Storehouse Foods lists **Soft White Wheat Berries**, calls the product `Product of Canada`, and states that it is whole wheat containing bran, germ, and endosperm [S04]. West Country Mills independently lists **Soft White Wheat Berries** and describes milling the berries or cooking them whole for dishes [S05]. These seller pages support a food-grade whole-kernel product identity. They do not identify a cultivar, crop season, Canadian Grain Commission class, or fixed protein specification. West Country Mills' page displayed “Sold out” when checked; the Storehouse listing showed package options but did not establish stock, so this review makes no availability claim.

Keep the candidate scoped to the exact market wording **soft white wheat berries**. Do not infer that the Storehouse item belongs to Canada Western Soft White Spring (CWSWS), or that either seller's product is spring or winter wheat. The Canadian Grain Commission describes classes by functional characteristics and growing region; its English page distinguishes soft white spring and soft white winter classes [S03]. Its French class list uses `blé tendre blanc de printemps` for the western CWSWS class and separately lists an eastern white-winter class [S02]. These official class names contextualize the product terminology; they do not assign either seller's product to a class or establish an edible whole-grain retail label.

Use **grains de blé tendre blanc** as a provisional French display. OQLF prefers `blé tendre` for soft wheat and describes its grain as white or red [S01]. The proposed plural whole-kernel phrase combines that Québec terminology with the Canadian Grain Commission's official soft-white French class wording and the existing catalog pattern `grains de blé entiers`. No exact Québec retail title for this whole-kernel product, OQLF ruling for the compound, or independent Québec terminology review was found. Treat the display as a source-informed construction, not an approved Québec label; leave independent Québec wording review open.

Keep this identity separate from:

- generic `wheat berries / grains de blé entiers`;
- hard white spring, hard red spring, durum, Red Fife, and sprouted wheat-berry products;
- soft-wheat and white whole-wheat flour products; and
- season-qualified products, cracked wheat, wheat germ, bran, flakes, and prepared cereals.

Do not add `soft wheat`, `white wheat`, `soft white wheat`, `soft white spring wheat berries`, `blé tendre`, `blé blanc`, or `blé blanc de printemps` as aliases. The first two broad class phrases are not an exact market-product name; `blé tendre` already retrieves multiple flour rows; and the Canadian Prairie Spring White class has distinct official wording. The two canonical displays already expose the exact product phrases through the current picker.

## Proposed ingredient-reference delta

If accepted, append only this identity row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-soft-white-wheat-berries",
  "nameEn": "soft white wheat berries",
  "nameFr": "grains de blé tendre blanc",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Do not add an `IngredientForm`, legacy candidate, recipe link, or recipe-line edit.

## Exact ownership and picker projection

The live snapshot contains **1,524 active references, 119 forms, 61 legacy candidates, 1,869 research-ledger records, and 114 manifest-listed recipes**. Accent-, case-, punctuation-, and ligature-normalized exact-key checks covered active reference names/aliases, form labels/match terms, legacy candidate IDs/names/aliases, ledger record IDs and string values, and the proposed ID. Neither proposed display has an exact owner. The proposed reference ID and `candidate-soft-white-wheat-berries` are absent from reference, form, legacy-candidate, and ledger record IDs. No source in the ledger owns the R154 source-ID prefix.

The projection below follows the current phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms, with the proposed reference appended using its two display names and no aliases. This is a static projection, not live picker QA.

| Query | Current results | With proposed row | Expected projection |
| --- | --- | --- | --- |
| `soft white wheat berries` | 0 | 1: `ingredient-ref-soft-white-wheat-berries` | Exact English product query resolves to the proposed identity. |
| `grains de blé tendre blanc` | 0 | 1: proposed identity | Exact provisional French display resolves to the proposed identity. |
| `soft white` / `white wheat berries` | 0 / 0 | 1 / 1: proposed identity | Both contiguous product phrases are found inside the canonical English display. |
| `soft wheat` | 11 flour identities | unchanged | No broad `soft wheat` alias is added; existing flour results remain as they are. |
| `blé tendre` | 11 flour identities | 12 results, adding the proposed identity | The broad Québec soft-wheat phrase remains a qualified choice among flour and whole-grain products. |
| `wheat berries` | 6 identities | 7 identities | Adds soft white beside generic, durum, sprouted, Red Fife, hard red spring, and hard white spring wheat berries. |
| `grains de blé entiers` | Generic wheat berries | unchanged | The generic French display remains on the generic identity. |
| `hard white spring wheat berries` / `hard red spring wheat berries` | The corresponding R153 / R152 identity | unchanged | Named hard spring products remain distinct. |
| `white whole-wheat flour` | `ingredient-ref-white-whole-wheat-flour` | unchanged | Flour-qualified query remains flour-only. |
| `blé blanc de printemps` | 0 | 0 | The distinct Canada Prairie Spring White class phrase does not resolve to this season-unspecified product. |

No alias is needed to make the exact product searchable. The broader `blé tendre` query already has 11 flour results; adding the canonical French display makes the whole-grain choice visible without making an unqualified French class term a stored alias.

## Manifest-wide recipe and ingredient-row scan

Parsed every recipe path listed in `manifest.v1.json`: **114 files and 1,123 structured ingredient rows**. The serialized recipe files and each ingredient row were scanned for `soft white wheat berries`, singular `soft white wheat berry`, `soft white wheat`, `soft white`, `soft wheat berries`, `soft wheat`, `white wheat berries`, `white wheat berry`, `grains de blé tendre blanc`, `grain de blé tendre blanc`, `blé tendre blanc`, `blé tendre`, `blé blanc tendre`, the proposed reference ID, and the corresponding legacy-candidate ID. The scan found **zero term hits in recipe files and zero ingredient-row hits**. No direct recipe links exist to the generic, durum, sprouted, Red Fife, hard red spring, or hard white spring wheat-berry rows. No recipe link, relink, or substitution link is proposed.

## Forms, measures, density, mappings, conversions, yields, and substitutions

- **Forms:** The current 119-row forms file has no wheat-berry form attached to the generic or named wheat-berry references. Add none; the proposed identity itself names the dry whole-kernel market product.
- **Package sizes:** Storehouse lists 2.5 kg, 10 kg, and 20 kg options; West Country Mills lists 2.5 kg, 5 kg, 10 kg, and 20 kg options [S04–S05]. These are supplier package formats, not recipe portions or household measures.
- **Density and unit mappings:** The generic wheat-berry and existing named wheat-berry references all have `defaultDensity: null` and `unitMappings: []`. Neither candidate source gives a cup-to-mass value. Keep the proposed density null and mappings empty; do not transfer the separate sprouted-wheat-berries retailer's `1/4 cup = 50 g` dry-serving observation, which is source- and product-specific.
- **Conversions and yields:** The ledger has no wheat-specific `unitConversion`; the active package-yield file has no wheat entry. Neither reviewed product page gives a measured cooking yield or a reusable grain-to-water ratio. Add no conversion, cooking yield, or package yield.
- **Substitutions:** The active global and contextual substitution files contain no rules. The sources describe milling, baking, and cooking uses but do not test or quantify replacement of another ingredient. Add no global or contextual substitution, and do not transfer qualitative claims from other wheat products.
- **Recipe links:** None; the manifest-wide scan found no matching structured line.

## Proposed research-ledger delta

If the identity is accepted, append this `ingredient_reference` record. It preserves the Québec wording limitation and leaves source-specific package sizes and qualitative claims inactive.

```json
{
  "recordId": "ingredient-ref-soft-white-wheat-berries",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-SOFTWHITE-R154-20261015-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre",
      "title": "Office québécois de la langue française, blé tendre (GDT)",
      "versionOrDate": "Last updated 2019",
      "accessedOn": "2026-10-15",
      "locator": "Definition, preferred terms, and English and Latin equivalents.",
      "supports": "OQLF maps blé tendre to soft wheat and describes the grain as white or red. It supports the Québec term component only; it does not name soft white wheat berries or approve the proposed whole-grain compound.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTWHITE-R154-20261015-S02",
      "url": "https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/04-ble/classes-varietes.html",
      "title": "Commission canadienne des grains, Blé : classes et variétés",
      "accessedOn": "2026-10-15",
      "locator": "Official French class table entries for Canada Western Soft White Spring (CWSWS) and Canada Eastern White Winter (CEWW).",
      "supports": "Uses blé tendre blanc de printemps for the western CWSWS class and lists a separate eastern white-winter class. The official class names inform French terminology but are not a Québec retail label, OQLF ruling, or assignment of either seller's product to a season or class.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTWHITE-R154-20261015-S03",
      "url": "https://grainscanada.gc.ca/en/grain-quality/grain-grading/wheat-classes.html",
      "title": "Canadian Grain Commission, Canadian wheat classes",
      "accessedOn": "2026-10-15",
      "locator": "Western CWSWS and eastern CEWW class descriptions and stated end uses.",
      "supports": "Defines Canadian classes by functional characteristics and growing region and distinguishes soft white spring from soft white winter wheat. These class descriptions do not establish that either seller's product belongs to a specific class or cultivar.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTWHITE-R154-20261015-S04",
      "url": "https://storehousefoods.ca/products/soft-white-wheat-berries",
      "title": "Storehouse Foods, Soft White Wheat Berries",
      "accessedOn": "2026-10-15",
      "locator": "Product heading, Product of Canada statement, whole-wheat description, and package-size options.",
      "supports": "Uses the exact English product title, identifies the listed product as Product of Canada, and states that the wheat is whole, containing bran, germ, and endosperm. It does not state a season, Canadian Grain Commission class, cultivar, or household measure; package sizes and qualitative protein claims are not generalized.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-SOFTWHITE-R154-20261015-S05",
      "url": "https://westcountrymills.com/products/soft-white-wheat-berries",
      "title": "West Country Mills, Soft White Wheat Berries",
      "accessedOn": "2026-10-15",
      "locator": "Product title, description of milling or cooking the berries whole, package-size options, and displayed availability.",
      "supports": "Independently uses the exact English product title and describes milling the berries or cooking them whole for dishes. The page displayed Sold out when checked. Its package sizes and qualitative claims about softness and lower protein are listing-specific and do not establish class, season, cultivar, a reusable measure, or current availability.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only soft white wheat berries / grains de blé tendre blanc as a whole-kernel food product. Canadian seller listings name the product, and the Storehouse listing identifies it as Product of Canada; neither reviewed product page states a season, cultivar, or Canadian Grain Commission class. The French display is a provisional source-informed construction from OQLF's blé tendre and the Commission's soft-white class wording, not an OQLF ruling or verified Québec product title. Keep independent Québec terminology review open. Add no aliases, forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP03-SOFTWHITE-R154-20261015-S01",
        "WP03-SOFTWHITE-R154-20261015-S02",
        "WP03-SOFTWHITE-R154-20261015-S03",
        "WP03-SOFTWHITE-R154-20261015-S04",
        "WP03-SOFTWHITE-R154-20261015-S05"
      ]
    }
  ]
}
```

## Source register and limits

Sources were opened on 2026-10-15. Seller listings and availability can change; product-specific claims stay limited to the cited page.

| Source ID | Source | Evidence used and limits |
| --- | --- | --- |
| `WP03-SOFTWHITE-R154-20261015-S01` | OQLF, [blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre). | Current Québec terminology source prefers `blé tendre` for soft wheat and describes grain color as white or red. It does not name a soft-white wheat-berry product or approve the proposed compound display. |
| `WP03-SOFTWHITE-R154-20261015-S02` | Canadian Grain Commission, [Blé : classes et variétés](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/04-ble/classes-varietes.html). | Official French class names include western `blé tendre blanc de printemps` (CWSWS) and a separate eastern white-winter class. Class names do not identify the reviewed retail product's season or class. |
| `WP03-SOFTWHITE-R154-20261015-S03` | Canadian Grain Commission, [Canadian wheat classes](https://grainscanada.gc.ca/en/grain-quality/grain-grading/wheat-classes.html). | Official English page distinguishes soft white spring and soft white winter classes and explains regional/function class grouping. It does not establish a particular cultivar or retail product identity. |
| `WP03-SOFTWHITE-R154-20261015-S04` | Storehouse Foods, [Soft White Wheat Berries](https://storehousefoods.ca/products/soft-white-wheat-berries). | Exact product title, Product of Canada statement, whole-wheat description, and supplier package sizes. Package quantities and qualitative protein wording are not recipes, measures, or universal properties. Stock was not established. |
| `WP03-SOFTWHITE-R154-20261015-S05` | West Country Mills, [Soft White Wheat Berries](https://westcountrymills.com/products/soft-white-wheat-berries). | Independent exact product title and whole-kernel cooking/milling description. The page showed Sold out on review; its package sizes and qualitative product claims are not active measures or generalized wheat specifications. |

## Static review checks

- Read [`AGENTS.md`](../../../AGENTS.md), the active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L519), and the R149–R153 Section F proposals and integration records before selection.
- Parsed the live references, forms, legacy candidates, ledger, manifest, recipe files, package-yield data, and active substitution data. Exact normalized displays, candidate/reference IDs, and the source-ID prefix have no current owner or collision.
- Reproduced phrase-first picker results from the live references/forms and the current search implementation. The full canonical English and provisional French queries are new; existing generic, hard-spring, flour-qualified, and broad wheat-family results remain bounded as shown above.
- Searched all **114 manifest-listed recipes**, all **1,123 structured ingredient rows**, and serialized recipe contents for the listed candidate phrases; found zero matches. Confirmed no wheat forms, active wheat density/mapping, wheat-specific unit conversion, package yield, or global/contextual substitution rule to transfer.
- This remains proposal-only. Under the repository's database-JSON-only rule, no tests, Gradle tasks, emulator, app, or deployment checks were run.

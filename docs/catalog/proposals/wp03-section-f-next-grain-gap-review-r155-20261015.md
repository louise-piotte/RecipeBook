# WP03 Section F — soft red winter wheat berries identity review (R155, 2026-10-15)

## Review record

- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, recipe, or generated-index file was changed.
- **Scope:** Decide whether whole-kernel food sold as soft red winter wheat berries merits an identity separate from generic and other named wheat berries, wheat flour, and processed wheat products.
- **Recommendation:** Add identity-only **soft red winter wheat berries / grains de blé tendre rouge d'hiver** as a `GRAIN_AND_CEREAL` reference. Keep aliases, forms, recipe links, density, unit mappings, conversions, yields, measures, and substitutions empty.
- **Proposed reference ID:** `ingredient-ref-soft-red-winter-wheat-berries`.
- **Source-ID prefix:** `WP03-SOFTRED-R155-20261015-S` (S01–S06). The ID and prefix are unallocated in the live package and ledger.

## Candidate selection and prior work

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L519) keeps broad grain and cereal identity review open. Recent proposals and integration notes R149–R154 cover Red Fife, red and black quinoa, hard red spring, hard white spring, and soft white wheat berries. R154's current whole-kernel listing and the 1847 grain collection both show named wheat-berry products, but the focused review did not decide soft red winter wheat berries. R152 also names hard red winter as a boundary from hard red spring; it does not review the soft-red-winter product.

The current 1847 Stone Milling grain collection lists **Organic Soft Red Winter Wheat Berries** as its own product, apart from soft white winter and hard red spring wheat berries [S04–S05]. A Canadian authorized retailer independently lists the same named product [S06]. A focused archive and exact-key search across Section F proposals, batch notes, the plan, roadmap, references, forms, legacy candidates, and ledger found no earlier focused review or hold for soft red winter wheat berries.

## Product identity and French wording

1847 Stone Milling's product page is titled **Organic Soft Red Winter Wheat Berries** and presents 2.5 kg, 10 kg, and 20 kg options [S04]. Its grain collection describes its grain berries as suitable for milling, sprouting, soups, salads, and porridge, and lists this product separately from soft-white and hard-red-spring products [S05]. Gratefully Restored's current 1847 collection also lists **Soft Red Winter Wheat - Organic Grain Berries** separately [S06]. These pages support a distinct whole-kernel food product under the source's exact English name. They do not establish a cultivar, grade, protein specification, or source-country claim for this product.

The 1847 product URL contains `soft-white` in its slug even though the live page heading reads `Organic Soft Red Winter Wheat Berries`; its grain collection independently lists soft red and soft white products as separate entries. This review relies on the visible product heading and collection entries, not the stale-looking slug. The linked manufacturer page gives no cultivar or formal grain-class assignment. In particular, do not infer that this product belongs to Canada's Eastern Soft Red Winter class (CESRW) merely because the product is sold by an Ontario mill: the Canadian Grain Commission defines classes using designated varieties, while the product page does not name a variety or class [S02–S03].

Use **`grains de blé tendre rouge d'hiver`** as a provisional French display. OQLF maps *blé tendre* to soft wheat and says the grain can be white or red [S01]. The Commission's current French class table uses *blé tendre rouge d'hiver* for the Eastern soft-red-winter class [S02]. Combining those source terms with the catalog's whole-kernel noun pattern yields a transparent display, not an OQLF ruling or a verified Québec product label. No current Québec retail title for this whole-kernel product was found; keep independent Québec terminology review open.

Keep this identity distinct from:

- generic `wheat berries / grains de blé entiers`;
- soft white, hard red spring, hard white spring, durum, Red Fife, and sprouted wheat berries;
- hard red winter wheat berries and soft-wheat or white whole-wheat flour products; and
- cracked wheat, wheat flakes, bran, germ, and prepared cereals.

Do not add `soft red`, `soft red wheat`, `soft red wheat berries`, `winter wheat berries`, `red winter wheat`, `blé tendre`, or `blé rouge d'hiver` as aliases. Those terms either remove a product qualifier or name a broader wheat class. The full English display and provisional French display already expose the exact candidate to the picker.

## Proposed ingredient-reference delta

If accepted, append only this identity row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-soft-red-winter-wheat-berries",
  "nameEn": "soft red winter wheat berries",
  "nameFr": "grains de blé tendre rouge d'hiver",
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

The live package contains **1,526 active references, 119 forms, 61 legacy candidates, 1,871 research-ledger records, and 114 manifest-listed recipes**. The ledger has 7,921 source entries and 6,772 distinct source IDs. Accent-, case-, punctuation-, and ligature-normalized exact-key checks covered reference names and aliases, form labels and match terms, legacy candidate names and aliases, ledger IDs and string values, and the proposed ID. Neither display has an exact owner. The proposed reference ID, `candidate-soft-red-winter-wheat-berries`, and R155 source-ID prefix are absent from the reference, form, legacy, and ledger ID spaces.

The projection follows current phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including form terms, with the proposed reference appended using only its two display names:

| Query | Current results | With proposed row | Expected picker effect |
| --- | --- | --- | --- |
| `soft red winter wheat berries` | 0 | 1: proposed identity | Exact English product query resolves to the new row. |
| `grains de blé tendre rouge d'hiver` | 0 | 1: proposed identity | Exact provisional French query resolves to the new row. |
| `soft red winter wheat` / `blé tendre rouge d'hiver` | 0 / 0 | 1 / 1: proposed identity | The qualified product phrase stays searchable without aliases. |
| `soft red` | 0 | 1: proposed identity | Finds the complete color-qualified phrase in the canonical name. |
| `soft wheat` | 11 flour identities | unchanged | No broad alias is added; existing flour results remain bounded. |
| `blé tendre` | 12 identities, including 11 flour rows and R154 soft-white berries | 13 identities, adding soft-red-winter berries | The broad soft-wheat query exposes both named berry choices alongside the existing flour choices. |
| `wheat berries` | 7 identities | 8 identities | Adds soft red winter beside generic, durum, sprouted, Red Fife, hard red spring, hard white spring, and soft white berries. |
| `soft white wheat berries` | R154 identity | unchanged | R154 remains separate. |
| `hard red spring wheat berries` / `hard white spring wheat berries` | Their respective identities | unchanged | The named spring products remain separate. |
| `white whole-wheat flour` | `ingredient-ref-white-whole-wheat-flour` | unchanged | The flour-qualified query remains flour-only. |

No alias is needed for the exact source product name. The broader `blé tendre` phrase remains a family query; the proposed display makes the whole-kernel option explicit without making a general term an alias.

## Manifest-wide recipe demand

Parsed all **114 files** listed by `manifest.v1.json` and all **1,123 structured ingredient rows**. The full serialized files and ingredient rows were scanned for `soft red winter wheat berries`, singular `soft red winter wheat berry`, `soft red winter wheat`, `soft red wheat berries`, `winter wheat berries`, `soft red`, `grains de blé tendre rouge d'hiver`, `grain de blé tendre rouge d'hiver`, `blé tendre rouge d'hiver`, the proposed reference ID, and the corresponding candidate ID. There were **zero phrase hits in recipe files and zero ingredient-row hits**. No recipe is linked to the existing generic, durum, sprouted, Red Fife, hard-red-spring, hard-white-spring, or soft-white wheat-berry references. No recipe link, relink, or substitution is proposed.

## Forms, numeric data, conversions, yields, and substitutions

- **Forms:** The live forms file has no form attached to the generic or named wheat-berry references. Add none; the proposed identity names an intact whole-kernel market product.
- **Package amounts:** 1847's options are 2.5 kg, 10 kg, and 20 kg [S04]. Those are product package sizes, not household measures, portions, or mass-volume observations.
- **Density and unit mappings:** Existing generic and named wheat-berry references have `defaultDensity: null` and `unitMappings: []`. The product sources give no cup-to-mass evidence. Keep the proposed density null and mappings empty; do not transfer values from another grain or wheat product.
- **Conversions and yields:** The ledger contains no wheat-specific unit conversion, and `package-yields.v1.json` has no wheat entry. The reviewed pages give no measured cooking yield or reusable cooking ratio. Add no conversion, cooking yield, or package-yield rule.
- **Substitutions:** The active global and contextual substitution-rule files are empty. Milling, cooking, and serving uses do not establish an equivalent substitute or replacement quantity. Add no global or contextual rule and no recipe-line substitution link.
- **Recipe links:** None; the manifest scan found no matching structured line.

## Proposed research-ledger delta

If the identity is accepted, append one `ingredient_reference` record. Its enum values are from the live ledger schema; the source-specific package listings and provisional French construction stay bounded in the source notes.

```json
{
  "recordId": "ingredient-ref-soft-red-winter-wheat-berries",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-SOFTRED-R155-20261015-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre",
      "title": "Office québécois de la langue française, blé tendre (GDT)",
      "versionOrDate": "Last updated 2019",
      "accessedOn": "2026-10-15",
      "locator": "Definition, preferred terms, and English equivalent.",
      "supports": "OQLF maps blé tendre to soft wheat and describes wheat grain as white or red. It supports the Québec terminology component only; it does not name soft red winter wheat berries or approve the proposed whole-kernel display.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTRED-R155-20261015-S02",
      "url": "https://grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html",
      "title": "Commission canadienne des grains, Classes de blé canadien",
      "accessedOn": "2026-10-15",
      "locator": "Eastern Canadian class table entry for Blé tendre rouge d’hiver (CESRW).",
      "supports": "Uses blé tendre rouge d’hiver as the French name of the Eastern soft-red-winter class and distinguishes it from Eastern hard-red-winter wheat. The table defines a regulated grain class, not the reviewed seller product's variety or class assignment, and is not a Québec retail label for wheat berries.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTRED-R155-20261015-S03",
      "url": "https://www.canada.ca/en/grain-commission/services/grain-quality-system/wheat-classes.html",
      "title": "Canadian Grain Commission, Canadian wheat classes",
      "versionOrDate": "Page details 2026-08-24",
      "accessedOn": "2026-10-15",
      "locator": "Eastern Canadian classes table and description of class grouping.",
      "supports": "Lists Canada Eastern Soft Red Winter (CESRW) as a distinct class and explains that Canadian wheat classes are grouped by functional characteristics and growing region. It does not identify a cultivar or establish that the 1847 product belongs to this class.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SOFTRED-R155-20261015-S04",
      "url": "https://1847.ca/product/organic-soft-white-winter-wheat-berries-2-5kg/",
      "title": "1847 Stone Milling, Organic Soft Red Winter Wheat Berries",
      "accessedOn": "2026-10-15",
      "locator": "Visible product heading, price and package options.",
      "supports": "The live product heading names Organic Soft Red Winter Wheat Berries and lists 2.5 kg, 10 kg, and 20 kg options. The URL slug contains soft-white, unlike the live heading; the product collection separately lists soft red and soft white items. Package sizes are not measures, and this page does not state a cultivar, growing origin, grade, or Canadian Grain Commission class.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-SOFTRED-R155-20261015-S05",
      "url": "https://1847.ca/product-category/berries-flour/",
      "title": "1847 Stone Milling, Organic Grain Berries",
      "accessedOn": "2026-10-15",
      "locator": "Product title list and general grain-berry use description.",
      "supports": "Lists Organic Soft Red Winter Wheat Berries separately from Organic Soft White Winter Wheat Berries and Organic Hard Red Spring Wheat Berries. Its general collection text describes milling, sprouting, soup, salad, and porridge uses for grain berries; it does not assign a variety, class, origin, cooking ratio, or measure to the soft-red product.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-SOFTRED-R155-20261015-S06",
      "url": "https://gratefullyrestored.ca/collections/1847-stone-milling-organic-grain-berries",
      "title": "Gratefully Restored, 1847 Stone Milling grain-berry collection",
      "accessedOn": "2026-10-15",
      "locator": "Retailer listing for Soft Red Winter Wheat - Organic Grain Berries, alongside hard red winter, soft white, hard red spring, and Red Fife products.",
      "supports": "A Canadian authorized retailer lists Soft Red Winter Wheat as an 1847 grain-berry product and keeps it separate from other named wheat-berry products. It supports Canadian-market product naming, not product origin, availability, a standardized class, or a reusable measure.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only soft red winter wheat berries / grains de blé tendre rouge d'hiver as a whole-kernel food product. The Canadian mill's current product heading and a Canadian retailer list this named product separately from soft white and hard red spring berries. The French display is a provisional construction informed by OQLF's blé tendre and the Canadian Grain Commission's soft-red-winter class wording; it is not an OQLF ruling or verified Québec retail label. Do not assign a variety, grade, origin, or formal grain class from the reviewed seller pages. Add no aliases, forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions; keep independent Québec terminology review open.",
      "sourceIds": [
        "WP03-SOFTRED-R155-20261015-S01",
        "WP03-SOFTRED-R155-20261015-S02",
        "WP03-SOFTRED-R155-20261015-S03",
        "WP03-SOFTRED-R155-20261015-S04",
        "WP03-SOFTRED-R155-20261015-S05",
        "WP03-SOFTRED-R155-20261015-S06"
      ]
    }
  ]
}
```

## Source register and limits

Sources were opened on 2026-10-15. Retail listings and availability may change; claims remain limited to the cited source.

| Source ID | Source | Evidence used and limits |
| --- | --- | --- |
| `WP03-SOFTRED-R155-20261015-S01` | OQLF, [blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre). | Prefers `blé tendre`, maps it to soft wheat, and describes white or red grain. It does not name this berry product or establish the compound display. |
| `WP03-SOFTRED-R155-20261015-S02` | Commission canadienne des grains, [Classes de blé canadien](https://grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html). | Gives `blé tendre rouge d'hiver` for the Eastern CESRW class and distinguishes it from hard red winter wheat. It does not assign the 1847 product to CESRW or provide a Québec consumer label. |
| `WP03-SOFTRED-R155-20261015-S03` | Canadian Grain Commission, [Canadian wheat classes](https://www.canada.ca/en/grain-commission/services/grain-quality-system/wheat-classes.html). | Separates Eastern soft red winter and hard red winter classes, and describes wheat classes as functional and regional groupings. Class data does not identify the product's variety or edible whole-kernel retail identity. |
| `WP03-SOFTRED-R155-20261015-S04` | 1847 Stone Milling, [Organic Soft Red Winter Wheat Berries](https://1847.ca/product/organic-soft-white-winter-wheat-berries-2-5kg/). | Current page heading gives the product name and package options. The URL slug says soft-white while the heading says soft-red; the separate collection and retailer listing corroborate the heading. Package sizes do not establish a measure, and the page does not assign origin, variety, grade, or formal class. |
| `WP03-SOFTRED-R155-20261015-S05` | 1847 Stone Milling, [Organic Grain Berries](https://1847.ca/product-category/berries-flour/). | Lists soft-red winter separately from soft-white winter and hard-red spring grain berries; general collection text describes food uses. It does not provide product-specific cooking instructions or a measured yield. |
| `WP03-SOFTRED-R155-20261015-S06` | Gratefully Restored, [1847 Stone Milling grain-berry collection](https://gratefullyrestored.ca/collections/1847-stone-milling-organic-grain-berries). | A Canadian authorized retailer lists the Soft Red Winter Wheat product among distinct wheat-berry offerings. Its listing is not evidence of product origin or a household measure. |

## Static review checks

- Read `AGENTS.md`, the active Section F checklist, the R149–R154 WP03 proposals and integration notes, and the live references, forms, legacy candidates, and ledger before choosing the candidate.
- Checked normalized exact ownership for both proposed displays, the reference and candidate IDs, and the R155 source-ID prefix. Confirmed no earlier soft-red-winter focused proposal or hold in the Section F archive, plan, or roadmap.
- Reproduced phrase-first picker projections from the current reference and form terms. Exact English and French searches are new; `wheat berries` gains one named product; broad `soft wheat` and `blé tendre` searches remain scoped as shown above.
- Parsed the manifest-listed recipe package, searched all 114 recipe files and 1,123 ingredient rows, and found no phrase hit or wheat-berry recipe link for this candidate.
- Reviewed forms, density, unit mappings, conversions, package yields, and active substitutions. No wheat-berry form, wheat conversion, wheat package yield, or active global/contextual wheat substitution was found. No Gradle, tests, emulator, app, or deployment checks were run; this is proposal-only documentation under the database-data test exception in `AGENTS.md`.

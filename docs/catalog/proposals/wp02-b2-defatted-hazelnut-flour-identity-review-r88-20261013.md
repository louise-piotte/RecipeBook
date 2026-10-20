# WP02 B2 — Defatted hazelnut flour identity review (R88)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. This is the only file written by this review.
- **Open checklist item:** Section 04, B2, line 1832: `[ ] Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours.` See the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1832).
- **Candidate:** Defatted hazelnut flour: hazelnut material after oil extraction, milled as a finished food flour. Some source labels call this specific ingredient a powder. This is a process-qualified boundary explicitly left outside the accepted ordinary hazelnut-flour row.
- **Source-ID prefix:** `WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013`. These IDs are proposal-local; no shared ledger record is changed by this review.
- **Snapshot:** 1,419 ingredient references, 104 forms, 1,758 research-ledger records, 63 legacy candidates, 114 bundled recipes, and 1,123 recipe ingredient rows. This is the post-R87, pre-R88 snapshot.

## Recommendation

**Integrate one identity-only `FLOUR_AND_STARCH` reference** for **defatted hazelnut flour / farine de noisette déshuilée**. Use the French display without aliases. A Québec retailer directly attests the display phrase in an ingredient declaration and describes the flour as a solid coproduct of oil extraction. A second Québec product declaration uses `poudre de noisette partiellement déshuilée`; do not add it as an alias because the live matcher would make the broader query `poudre de noisette` return only this defatted item. OQLF confirms the food term `noisette` and use of hazelnut powder, but does not distinguish ordinary powder from oil-removed powder. [S02–S04]

Bound this identity to hazelnut material with oil removed and then milled into a finished food flour. Some labels use `poudre` for this specific ingredient, but no generic powder alias is proposed. The product sources document mechanical pressing and milling as a marketed pathway; they do not establish a required extraction method, residual-oil threshold, roast level, skin state, protein level, or particle grade. Keep ordinary whole-ground hazelnut flour, whole hazelnuts, hazelnut meal without a specified process, hazelnut oil, butter, and protein concentrates separate. Treat unmilled press cake as an intermediate coproduct rather than this finished flour identity. [S01, S05]

This is an identity decision only. Add no forms, density, unit mappings, conversions, package yield, recipe links, or substitutions. The bundle has no hazelnut-flour ingredient lines and no demand for a defatted product. [live catalog and recipe scan]

## Product and Québec naming boundary

| Term or material | R88 decision | Evidence boundary |
|---|---|---|
| **Defatted hazelnut flour** | Add one separate food-flour identity. | Huilerie Beaujolaise sells a product titled `Farine de noisette déshuilée`; it describes extracting oil with a hydraulic press, then grinding and sifting the dry press cake. Carboor Harvest sells a hazelnut flour made as a coproduct of hazelnut-oil pressing and describes it as finely ground, defatted nuts. These are direct product sources, not a universal process or residual-fat standard. [S01, S05] |
| **`farine de noisette déshuilée`** | Use as the French display. | La Moisson’s Québec French ingredient declaration uses this exact phrase and describes the flour as the solid coproduct of oil extraction. This is local ingredient-label evidence, not a standalone flour package or OQLF ruling. [S02, S04] |
| **`poudre de noisette partiellement déshuilée`** | Do not add as an alias. | A Québec retailer’s hazelnut-crisp ingredient declaration uses the exact phrase and gives 12.4% as the share of the finished crisp’s ingredient formula. The phrase is a source-specific name for a composite product ingredient, not evidence that the broader `poudre de noisette` query uniquely means defatted flour. [S03] |
| **Ordinary `hazelnut flour` / `farine de noisette`** | Keep the current identity unchanged. | Sources use broad flour names for both whole-ground hazelnuts and oil-reduced material. A broad flour query should show both active product identities after the proposed row is added. Do not add a generic flour alias to either row. [S01, S05; prior hazelnut reviews] |
| **Hazelnut meal / `farine de noisette` without a process qualifier** | Keep meal unassigned. | The earlier meal review found that manufacturers and industry sources overlap the words *meal* and *flour*, while some suppliers distinguish grades. It concluded that there was no stable market-wide meal boundary. R88 does not reopen that decision. [prior hazelnut meal review] |
| **Hazelnut powder / `poudre de noisette`** | Leave the unqualified query unassigned. | OQLF notes that hazelnuts are consumed as nuts or in powder, including in pastry, without specifying whether the powder is oil-reduced. Adding the qualified composite-product phrase as an alias would make the matcher return only the new row for the broader phrase. [S03–S04] |
| Press cake, hazelnut oil, butter, and protein concentrate | Keep outside this row. | Press cake is the extraction coproduct before milling; oil and butter are distinct products; research-produced protein concentrates are not flour aliases. Do not attach a form or conversion between them. [S01–S02, S06] |

The French display is grounded in exact Québec retailer wording; it should be read as a source-bounded product label, not a standardized OQLF compound. No standalone defatted-hazelnut-flour package from a Québec retailer was verified. The English display is supported as the product class by direct commercial and research wording, while the ordinary English phrase remains intentionally broad in search. [S01–S06]

## Ownership and archive audit

The live ordinary owner is `ingredient-ref-hazelnut-flour`, displayed as `hazelnut flour / farine de noisette`, category `FLOUR_AND_STARCH`. It has no aliases, null density, and empty unit mappings. Its ledger record is identity-verified; measurement and substitution research remain `not_yet_researched`. Whole hazelnuts, hazelnut butter, hazelnut oil, and hazelnut spread have their own active rows. The only hazelnut form is `ingredient-form-hazelnuts-finely-chopped`, attached to whole hazelnuts. There is no active reference, form, legacy candidate, or ledger identity for defatted hazelnut flour or for the proposed ID. [live references, forms, ledger, and legacy candidates]

Related active oil-reduced flour references include defatted almond, coconut, poppy-seed, and tigernut flour plus partially defatted peanut flour. They are catalog precedents only and do not supply hazelnut composition or conversions. [live references]

The archive already contains the [ordinary hazelnut-flour identity review](wp02-hazelnut-flour-identity-review-20261010.md), which accepted `hazelnut flour / farine de noisette` and explicitly kept defatted flour outside its aliases, and the [hazelnut flour/meal boundary review](wp02-hazelnut-flour-meal-boundary-review-20261010.md), which retained that row and left meal unassigned. Both reviews reserve process-qualified products for later review; neither decided a separate defatted-hazelnut identity. No focused defatted-hazelnut proposal or integration batch was found. R87’s defatted-almond row and batch are a related precedent, not a duplicate. The candidate ID and R88 source-ID prefix have no active or archived collision.

## Picker projection

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, then prefers contiguous normalized word-phrase matches before substring fallback. The projection below applies that matcher to all live reference names and aliases, then to the proposed reference with empty alias lists.

| Query | Current result | Projected result | Boundary |
|---|---|---|---|
| `hazelnut flour` | `ingredient-ref-hazelnut-flour` | `ingredient-ref-hazelnut-flour`; `ingredient-ref-defatted-hazelnut-flour` | The broad English phrase appears in both product displays; users see ordinary and oil-reduced flour. |
| `farine de noisette` | `ingredient-ref-hazelnut-flour` | `ingredient-ref-hazelnut-flour`; `ingredient-ref-defatted-hazelnut-flour` | The unqualified French phrase appears in both displays; users see both flour identities. |
| `defatted hazelnut flour` | No result | `ingredient-ref-defatted-hazelnut-flour` | Exact qualified English wording selects only the proposed row. |
| `farine de noisette déshuilée` | No result | `ingredient-ref-defatted-hazelnut-flour` | Exact qualified French display selects only the proposed row. |
| `hazelnut` | Hazelnut butter, flour, oil, and spread with cocoa | Those four plus `ingredient-ref-defatted-hazelnut-flour` | Broad source-name search adds another hazelnut product. |
| `hazelnuts` | `ingredient-ref-hazelnuts` | `ingredient-ref-hazelnuts` | Whole-nut plural remains on the whole-food row. |
| `poudre de noisette` | No result | No result | Preserve the broad query: OQLF supports hazelnut powder generally, not a unique defatted product. |
| `poudre de noisette partiellement déshuilée` | No result | No result | Do not index the Québec crisp’s qualified ingredient phrase because its prefix would make the broad powder query a misleading singleton. The qualified `farine` display remains searchable. |
| `hazelnut meal` | No result | No result | Preserve the previous hold on unqualified meal. |

The matcher’s phrase-subsequence behavior makes a qualified alias affect shorter queries. Since `poudre de noisette` is not limited to defatted hazelnuts by OQLF or the checked Québec label, adding `poudre de noisette partiellement déshuilée` would surface one defatted row for a broader query without a corresponding ordinary-powder choice. R88 therefore keeps the exact local display but adds no powder alias. No picker code change is proposed.

## Recipe demand, numeric evidence, and substitutions

The full bundled corpus contains **114 recipes and 1,123 ingredient rows**. No row links to `ingredient-ref-hazelnut-flour`; no ingredient text contains hazelnut flour, defatted hazelnut flour, or the candidate French flour wording. The broader hazelnut matches are three lines in two recipes: `021` uses 60 g finely chopped whole hazelnuts; `031` uses hazelnut butter and whole hazelnuts in its hazelnut variation. These do not imply flour demand, and no recipe link is proposed.

The numeric evidence is product- or formula-specific:

- Huilerie Beaujolaise offers 500 g and 1 kg package sizes. These are retail pack amounts, not household measures, density, or conversions. Its suggested cookie formula uses 100 g hazelnut flour alongside 100 g wheat flour; its roughly 30% tart suggestion is guidance for that maker’s product and recipe, not a general substitution ratio. [S01]
- Carboor Harvest lists 500 g and 1 kg packs and reports 25.5% protein for its own hazelnut flour. The same page says it is made by pressing hazelnut oil and finely milling the coproduct. Its protein result describes one product, not a generic flour grade or residual-fat threshold. [S05]
- La Moisson’s crisp ingredient declaration assigns 12.4% to `poudre de noisette partiellement déshuilée` in that finished product’s formula. The number is not the flour’s residual oil, a portion, or a volume measure. [S03]
- No source provides reusable grams-per-volume, density, a household cup weight, a generic oil-removal yield, or a conversion from whole-ground flour/meal, press cake, or hazelnut oil to this flour. [S01–S06]

Do not add a flour form for the press-cake pathway, since oil removal and milling define the separate product identity and no reproducible transition measure is documented. Do not add a recipe substitution to wheat flour, ordinary hazelnut flour, hazelnut meal, or another nut flour. Manufacturer recipe statements remain product- and formulation-specific. No conversion, yield, density, or unit mapping is supported.

## Exact prospective JSON delta

Add one reference only, with no aliases:

```json
{
  "id": "ingredient-ref-defatted-hazelnut-flour",
  "nameFr": "farine de noisette d\u00e9shuil\u00e9e",
  "nameEn": "defatted hazelnut flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Append the following ledger record. It records identity evidence and reviewed-but-unsupported numeric/substitution data; it adds no unit conversion:

```json
{
  "recordId": "ingredient-ref-defatted-hazelnut-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S01",
      "url": "https://huilerie-beaujolaise.fr/fr/poudres-deshuilees/138-237-farine-de-noisette-deshuilee.html",
      "title": "Huilerie Beaujolaise, Farine de noisette d\u00e9shuil\u00e9e",
      "accessedOn": "2026-10-13",
      "locator": "Product description, package choices, cooking guidance, and manufacture section.",
      "supports": "Sells a hazelnut flour for pastry, describes crushing and heating hazelnuts, hydraulic pressing to extract oil, then fine grinding and sifting of the dry press cake. Package weights and the maker's recipe examples do not establish reusable measures or substitutions.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S02",
      "url": "https://lamoisson.com/collections/confitures-tartinades-beurres-jams-spreads-butters/products/beurre-de-noisette",
      "title": "La Moisson, Beurre de noisette",
      "accessedOn": "2026-10-13",
      "locator": "French ingredient declaration and explanation of the flour; current page text visible in search indexing, direct page open returned cache miss.",
      "supports": "The Qu\u00e9bec retailer names `farine de NOISETTE d\u00e9shuil\u00e9e` as an ingredient in hazelnut pur\u00e9e and describes the flour as the solid coproduct of oil extraction. This is local wording and process evidence, not a standalone flour package.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S03",
      "url": "https://lamoisson.com/products/tartine-craquantes-bio-noisettes",
      "title": "La Moisson, Tartine craquantes Bio \u2014 Noisettes",
      "accessedOn": "2026-10-13",
      "locator": "Ingredients and shipping section.",
      "supports": "The Qu\u00e9bec retailer's French ingredient declaration names `poudre de noisette partiellement d\u00e9shuil\u00e9e` at 12.4% of the composite crisp and offers Qu\u00e9bec delivery. The percentage is the share of that product formula, not flour composition or a measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083830/noisette",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, noisette (GDT)",
      "versionOrDate": "2020",
      "accessedOn": "2026-10-13",
      "locator": "Definition and notes, lines 18\u201328.",
      "supports": "Defines the food term `noisette`, pairs it with English `hazelnut`, and notes that hazelnuts are consumed as nuts or in powder in pastry. It does not attest a flour compound or distinguish defatted powder from ordinary hazelnut powder.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S05",
      "url": "https://www.carboorharvest.com.au/products/hazelnut-flour",
      "title": "Carboor Harvest, Hazelnut Flour (High Protein)",
      "accessedOn": "2026-10-13",
      "locator": "Product description, package sizes, and use suggestions.",
      "supports": "Manufacturer sells a food hazelnut flour made as a coproduct of hazelnut-oil pressing and finely milled; it describes the material as defatted/oil-reduced. Its 25.5% protein and 500 g/1 kg packages are specific to this product, not generic composition or household measures.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S06",
      "url": "https://pmc.ncbi.nlm.nih.gov/articles/PMC4325045/",
      "title": "Tatar, Tun\u00e7, and Kahyaoglu, Turkish Tombul hazelnut protein concentrates: functional and rheological properties",
      "versionOrDate": "2015",
      "accessedOn": "2026-10-13",
      "locator": "Abstract and materials/methods, preparation of defatted hazelnut flour.",
      "supports": "Primary research distinguishes defatted hazelnut flour from defatted hazelnut cake and describes a laboratory solvent-extraction preparation. It corroborates research use of a defatted flour term but does not establish a market specification or household recipe use.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add a separate identity-only defatted hazelnut flour reference for hazelnut material after oil removal and milling as food flour. Use the Qu\u00e9bec-attested display farine de noisette d\u00e9shuil\u00e9e, leave aliases empty to preserve the unqualified poudre de noisette query boundary, and add no forms, measures, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S01",
        "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S02",
        "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S03",
        "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S04",
        "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S05",
        "WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S06"
      ]
    }
  ]
}
```

## Source register

Sources were checked on 2026-10-13. Source IDs are local to this proposal and match those in the prospective ledger record.

| ID | Source and support | Limits |
|---|---|---|
| **WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S01** | Huilerie Beaujolaise, [Farine de noisette déshuilée](https://huilerie-beaujolaise.fr/fr/poudres-deshuilees/138-237-farine-de-noisette-deshuilee.html). Product listing calls it flour for pastry and describes hydraulic oil pressing, then fine milling and sifting of the press cake. | France-based standalone product. The 500 g / 1 kg packages and its recipe examples are not reusable measures or generic substitution advice. It does not provide a universal residual-oil limit. |
| **WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S02** | La Moisson, [Beurre de noisette](https://lamoisson.com/collections/confitures-tartinades-beurres-jams-spreads-butters/products/beurre-de-noisette). Québec French ingredient declaration uses `farine de NOISETTE déshuilée` and describes the flour as the solid coproduct of oil extraction. | The flour is an ingredient in hazelnut purée, not sold as a standalone flour on this page. Search indexing surfaced the relevant text; direct page open returned a cache miss. |
| **WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S03** | La Moisson, [Tartine craquantes Bio — Noisettes](https://lamoisson.com/products/tartine-craquantes-bio-noisettes). Québec French label says `poudre de noisette partiellement déshuilée` and lists 12.4% in the crisp formula; retailer lists delivery to Québec. | This is a composite food product. The percentage is its ingredient share, not residual oil or a flour measure. The qualified phrase is excluded from aliases because its prefix would capture broad `poudre de noisette`. |
| **WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S04** | OQLF, [noisette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083830/noisette). Defines the food noun, gives English *hazelnut*, and notes hazelnuts are consumed as nuts or powder in pastry. | Supports the base word only, not the complete flour name or a defatted/ordinary powder distinction. |
| **WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S05** | Carboor Harvest, [Hazelnut Flour (High Protein)](https://www.carboorharvest.com.au/products/hazelnut-flour). Manufacturer identifies an oil-pressing coproduct finely milled into food flour and describes it as defatted/oil-reduced. | Australia-facing product; 25.5% protein and 500 g / 1 kg package sizes are product-specific. The title's unqualified flour wording supports the overlap that makes broad queries return both rows. |
| **WP02-B2-DEFATTED-HAZELNUT-FLOUR-R88-20261013-S06** | Tatar, Tunç, and Kahyaoglu, [Turkish Tombul hazelnut protein concentrates: functional and rheological properties](https://doi.org/10.1007/s13197-013-1110-z), *Journal of Food Science and Technology* 52 (2015), 1024–1031. Separates defatted flour from cake and describes a laboratory preparation. | Research preparation uses solvent extraction and protein-concentrate experiments; it is not a commercial product specification, authorization, or recipe conversion. Direct PMC/PubMed page access was blocked by browser checks; the indexed article abstract and methods were reviewed. |

## Static review record

- Re-read current `AGENTS.md`, the exact open Section 04 B2 checklist line, current ingredient references/forms, ledger, legacy candidates, relevant hazelnut proposals and batch archive, current `IngredientSearch.kt`, and all bundled recipe files.
- Confirmed the post-R87 pre-R88 snapshot: 1,419 references, 104 forms, 1,758 ledger records, 63 legacy candidates, 114 recipe files, and 1,123 ingredient rows.
- Audited ordinary flour, whole hazelnut, butter, oil, spread, and existing defatted-flour owners; checked ID, alias, form, ledger, legacy, and proposal source-ID collisions. The proposed ID and R88 source-ID prefix are unused.
- Scanned all recipe ingredient lines and text. No existing hazelnut-flour links or defatted-hazelnut candidate lines were found; three broader hazelnut rows are whole hazelnuts and hazelnut butter.
- Projected picker results with the live contiguous word-phrase matcher, including the proposed row. Kept `poudre de noisette` and `poudre de noisette partiellement déshuilée` unmatched because the qualified phrase would create a misleading broad-query singleton and the earlier boundary review withheld unqualified powder terms.
- Checked current Huilerie Beaujolaise, La Moisson, Carboor Harvest, OQLF, and indexed primary research pages. Kept Québec ingredient wording distinct from standalone package evidence and OQLF authority.
- Static checks only: UTF-8 without BOM, final newline, no trailing whitespace or mojibake markers, parsed both JSON snippets, checked the reference row against the active row field shape and the ledger record against `research-ledger.schema.json`, confirmed proposal source IDs are unique and each maps to one register row, and checked local Markdown links and the opened/searched source URLs.
- No tests, Gradle, emulator, deployment, app code, or shared catalog/ledger/plan/roadmap files were changed.

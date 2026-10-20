# WP03 Section F — hard red winter wheat berries (R156, 2026-10-15)

## Review record

- **Status:** Proposal only; no shared catalog, ledger, checklist, roadmap, recipe, or generated-index file was changed.
- **Scope:** Review one unallocated wheat-berry market product within the still-open Section F grain/cereal identity coverage.
- **Recommendation:** Add identity-only **hard red winter wheat berries / grains de blé de force rouge d'hiver** as a `GRAIN_AND_CEREAL` reference. Keep aliases, forms, measurements, density, unit mappings, conversions, yields, recipe links, and substitutions empty.
- **Proposed reference and ledger ID:** `ingredient-ref-hard-red-winter-wheat-berries`.
- **Source-ID prefix:** `WP03-HARDREDWINTER-R156-20261015-S` (S01–S07). The proposed ID and prefix are unallocated in the current package and ledger.

## Candidate choice and identity boundary

Section F remains open for additional grain and cereal products. Recent reviews through R155 added Red Fife, hard-red-spring, hard-white-spring, soft-white, and soft-red-winter wheat berries. Hard red winter is mentioned as a neighboring product in R152 and R155, but no focused review or active identity for its whole-kernel product was found. Current Canadian food sellers list whole hard-red-winter wheat as a grain berry or whole seed, including an Ontario-grown offering; this gives the candidate a clearer product boundary than the previously held generic hominy, pozole-corn, and farro terms.

Limit the reference to intact, food-grade kernels sold as hard red winter wheat for cooking or home milling. A current Ontario retailer lists “Hard Red Winter Wheat Berries,” describes them as grain berries grown in Ontario, and offers 2.5 kg, 10 kg, and 20 kg packages [S04]. A flour mill sells a 2 kg package titled “Whole Seeds: Hard Red Winter Wheat” for home milling [S05]. Country Life separately lists a Montana-origin Wheat Montana product as hard red winter wheat berries [S06]. These listings support a real named food product, but do not show that every listed lot belongs to the same regulated class, variety, grade, or origin.

Keep it distinct from:

- generic `wheat berries / grains de blé entiers`;
- hard-red-spring, hard-white-spring, soft-white, soft-red-winter, Red Fife, durum, and sprouted wheat berries;
- wheat flour, cracked wheat, bulgur, wheat flakes, bran, germ, and prepared wheat cereals; and
- planting seed, feed grain, brewing grain, and products that include wheat only as one ingredient.

Do not infer cultivar, protein grade, organic status, Canadian Grain Commission class, or growing region from the proposed identity. The Ontario product page's country statement is limited to that seller's own product; it does not describe the separate U.S.-origin item [S04, S06].

## French display and limits

Use **`grains de blé de force rouge d'hiver`** provisionally. The Canadian Grain Commission's 2026 designation order names the Eastern Canadian class `Blé de force rouge d'hiver (CEHRW)` and lists varieties assigned to that class [S01]. The Commission's class term is regulated commodity nomenclature, not proof that the reviewed Ontario retail product has a designated variety or meets CEHRW grading. US Wheat Associates' French 2024 report also uses `blé de force rouge d'hiver` for the English market term “Hard Red Winter” [S02]. These sources support the phrase components, but no current Québec consumer package with the exact full French name was found; independent Québec wording review remains open.

Do **not** use `blé dur` as a translation or alias. OQLF defines `blé dur` as durum wheat (*Triticum turgidum* subsp. *durum*) and distinguishes it from soft wheat [S03]. The existing `durum wheat berries / blé dur` row already owns that French phrase. OQLF's `farine de blé de force` entry supports the Québec expression `blé de force` for hard wheat flour, but does not approve a whole-kernel display [S03]. Do not add short aliases such as `hard red winter`, `hard red wheat`, `winter wheat`, `blé de force`, `blé rouge d'hiver`, or `blé dur`; the full qualified display is sufficient and these shorter phrases broaden or blur the product boundary.

## Proposed ingredient-reference delta

If accepted, append only this row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-hard-red-winter-wheat-berries",
  "nameEn": "hard red winter wheat berries",
  "nameFr": "grains de blé de force rouge d'hiver",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Do not add an `IngredientForm`, legacy candidate, recipe link, or recipe-line edit.

## Exact ownership, IDs, and picker projection

The current package contains **1,528 active references**, **119 forms**, **61 legacy candidates**, and **1,873 research-ledger records** with **7,937 source entries / 6,785 distinct source IDs**. The manifest lists **114 recipe files** containing **1,123 ingredient rows**.

An accent-, case-, punctuation-, and ligature-normalized exact-key audit covered active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. It found no owner for `hard red winter wheat berries`, `hard red winter wheat`, `hard red winter`, `grains de blé de force rouge d'hiver`, `grain de blé de force rouge d'hiver`, or `blé de force rouge d'hiver`. The proposed reference ID is absent from references, forms, legacy IDs, and ledger record IDs. `candidate-hard-red-winter-wheat-berries` is absent from legacy and ledger IDs. The R156 source-ID prefix is absent from ledger source IDs. An archive search across Section F proposals, batch notes, the plan, and roadmap found no focused hard-red-winter-berries review or hold. Related mentions in R149, R152, and R155 do not allocate the identity or decide its product boundary.

The projection follows the current phrase-first ingredient search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms:

| Query | Current result(s) | With proposed row | Effect |
| --- | --- | --- | --- |
| `hard red winter wheat berries` | 0 | 1: proposed identity | Exact English product query becomes unique. |
| `grains de blé de force rouge d'hiver` | 0 | 1: proposed identity | Exact provisional French display becomes unique. |
| `hard red winter` | 0 | 1: proposed identity | The complete seasonal/color-qualified term resolves without aliases. |
| `hard red` | Hard-red-spring berries | Hard-red-spring and hard-red-winter berries | The shorter family phrase surfaces both distinct season-qualified choices. |
| `winter wheat berries` | Soft-red-winter berries | Soft-red-winter and hard-red-winter berries | Winter grain query keeps the two hardness classes distinct. |
| `wheat berries` | 8 identities | 9 identities | Adds one named product beside generic, durum, sprouted, Red Fife, hard-red-spring, hard-white-spring, soft-white, and soft-red-winter berries. |
| `hard red spring wheat berries` | Hard-red-spring berries | Unchanged | Existing spring product stays specific. |
| `soft red winter wheat berries` | Soft-red-winter berries | Unchanged | R155 product stays specific. |
| `durum wheat berries` | Durum wheat berries | Unchanged | No `blé dur` or `durum` alias is added. |
| `blé dur` | Four durum flour, semolina, and berry references | Unchanged | Existing French durum ownership stays intact. |

The exact bilingual displays do not overlap an active reference, form, or legacy phrase. No forms are attached to the current generic or named wheat-berry references, so no form-state behavior changes.

## Manifest recipe demand

Parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Searched full serialized recipe JSON and ingredient rows for the proposed English and French displays, singular/plural variants, `hard red winter wheat`, `hard red winter`, and the proposed ID. There were **zero file hits and zero ingredient-row hits**. No recipe is linked to the proposed identity, and no recipe link, relink, amount, form, or substitution is warranted.

## Measures, forms, yields, and substitutions

- **Package sizes:** The Ontario listing's 2.5 kg, 10 kg, and 20 kg options, Stone Bridge Flour's 2 kg package, and Country Life's 5 lb / 50 lb offerings are SKU or shipping packages, not household measures [S04–S06].
- **Density and unit mappings:** No reviewed food product provides a reusable cup-to-mass relation. The Canadian Grain Commission's 2024 CEHRW quality report reports 80.5 kg/hL test weight for a class-specific harvest sample; that is agricultural grading data for CEHRW, not an ingredient density for these seller products or a kitchen conversion [S07]. Leave density null and mappings empty.
- **Forms and yields:** Add no grain-to-flour form, sprouting form, cooking conversion, or yield. Milling and sprouting are separate product states, and no reusable dry-to-cooked result was found.
- **Substitution:** Country Life suggests using its product in place of rice or quinoa, but gives no tested amount, recipe role, or method limits [S06]. Keep this source-scoped qualitative advice inactive and add no global or contextual substitution.
- **Recipe links:** None; the bundled corpus has no candidate-term hit.

## Proposed research-ledger delta

If the identity is accepted, append one `ingredient_reference` record. The sources support the qualified whole-grain product and provisional French construction; they do not supply active numeric behavior.

```json
{
  "recordId": "ingredient-ref-hard-red-winter-wheat-berries",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-HARDREDWINTER-R156-20261015-S01",
      "url": "https://www.canada.ca/fr/commission-grains/services/systeme-qualite-grains/arretes/lvd-ble-cehrw.html",
      "title": "Commission canadienne des grains, Blé de force rouge d'hiver, Est canadien (CEHRW), arrêté 2026-07",
      "versionOrDate": "2026-07",
      "accessedOn": "2026-10-15",
      "locator": "Class name, introduction on designated varieties, and list of CEHRW varieties.",
      "supports": "Establishes the official French name for the Eastern Canadian hard-red-winter class and shows that the class comprises designated varieties. It supports French terminology and the market-class distinction, but does not assign the Ontario seller's product to CEHRW or establish its grade or cultivar.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-HARDREDWINTER-R156-20261015-S02",
      "url": "https://www.uswheat.org/wp-content/uploads/2024-USW-Crop-Quality-Report-French.pdf",
      "title": "U.S. Wheat Associates, 2024 rapport sur la qualité de la récolte du blé",
      "versionOrDate": "2024",
      "accessedOn": "2026-10-15",
      "locator": "Hard Red Winter section.",
      "supports": "Uses `blé de force rouge d'hiver` for the U.S. wheat-market term Hard Red Winter. This is technical French usage, not a Québec consumer label, OQLF ruling, or proof of the specific Canadian product's class.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HARDREDWINTER-R156-20261015-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force",
      "title": "Office québécois de la langue française, farine de blé de force (GDT)",
      "versionOrDate": "Last updated 2004",
      "accessedOn": "2026-10-15",
      "locator": "Definition, preferred term, and English equivalent.",
      "supports": "Defines `farine de blé de force` as flour made from grains of hard wheat and maps it to hard wheat flour. Supports the Québec French expression `blé de force` as a component only; it does not name or approve a whole-kernel display.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-HARDREDWINTER-R156-20261015-S04",
      "url": "https://gratefullyrestored.ca/products/hard-red-winter-wheat-organic-grain-berries-1847-stone-milling",
      "title": "Gratefully Restored, Hard Red Winter Wheat - Organic Grain Berries - 1847 Stone Milling",
      "accessedOn": "2026-10-15",
      "locator": "Product title and description, Ontario-grown statement, grain-berries type, and package-size options.",
      "supports": "Currently lists an Ontario-grown food product as Hard Red Winter Wheat Berries and offers 2.5 kg, 10 kg, and 20 kg packages. Supports a whole-kernel food identity and the English product name. Its page does not identify a wheat variety, official Canadian class, grade, or reusable measure; the package sizes remain product options.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HARDREDWINTER-R156-20261015-S05",
      "url": "https://www.stonebridgeflour.ca/product-page/whole-seeds-hard-red-winter-wheat",
      "title": "Stone Bridge Flour, Whole Seeds: Hard Red Winter Wheat",
      "accessedOn": "2026-10-15",
      "locator": "Product title, home-milling description, and 2 kg package listing.",
      "supports": "Lists whole hard-red-winter wheat seeds as a product for home milling and baked goods. Corroborates the food-grade whole-kernel product; the package weight is not a recipe measure, and no formal class or cultivar is stated.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HARDREDWINTER-R156-20261015-S06",
      "url": "https://www.countrylifefoods.ca/products/wheat-berries-hard-red-winter-wheat",
      "title": "Country Life Natural Foods, Wheat Berries, Hard Red, Winter Wheat, Wheat Montana",
      "accessedOn": "2026-10-15",
      "locator": "Product heading, ingredient statement, country-of-origin field, sizes, and seller use suggestions.",
      "supports": "Lists a Montana-origin Wheat Montana product as hard-red-winter wheat berries and describes food uses. Its 5 lb and 50 lb packages are commercial sizes. Its rice/quinoa replacement suggestion is qualitative seller advice without a tested ratio, role, or method scope.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HARDREDWINTER-R156-20261015-S07",
      "url": "https://grainscanada.gc.ca/en/grain-research/grain-harvest-export-quality/wheat/2024/canada-eastern-hard-red-winter/",
      "title": "Canadian Grain Commission, Quality of Canada Eastern Hard Red Winter wheat in 2024",
      "versionOrDate": "2024 crop",
      "accessedOn": "2026-10-15",
      "locator": "Class description and 2024 quality table, including test weight.",
      "supports": "Describes CEHRW as a class and reports 80.5 kg/hL test weight for the 2024 grade aggregate. This is class-specific agricultural quality data, not a household density or a value transferable to the reviewed food products; it is recorded here only to bound measurement interpretation.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only hard red winter wheat berries / grains de blé de force rouge d'hiver in GRAIN_AND_CEREAL for the whole-kernel food product currently named by Ontario sellers. Keep it separate from generic and other named wheat berries, flour, and durum wheat. The French display is provisional: the Canadian Grain Commission and a technical French market report support the wording components, but no current Québec consumer label with the full phrase was found and the seller product is not assigned to an official grain class. Do not use blé dur, which OQLF uses for durum wheat. Add no aliases, forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions; leave independent Québec wording review open.",
      "sourceIds": [
        "WP03-HARDREDWINTER-R156-20261015-S01",
        "WP03-HARDREDWINTER-R156-20261015-S02",
        "WP03-HARDREDWINTER-R156-20261015-S03",
        "WP03-HARDREDWINTER-R156-20261015-S04",
        "WP03-HARDREDWINTER-R156-20261015-S05",
        "WP03-HARDREDWINTER-R156-20261015-S06",
        "WP03-HARDREDWINTER-R156-20261015-S07"
      ]
    }
  ]
}
```

## Source register and static review checks

Sources were opened on 2026-10-15. Retail stock and package options can change; the proposal limits each claim to the cited page.

| Source | Evidence used and limits |
| --- | --- |
| Canadian Grain Commission, [Blé de force rouge d'hiver, Est canadien (CEHRW), 2026-07 designation order](https://www.canada.ca/fr/commission-grains/services/systeme-qualite-grains/arretes/lvd-ble-cehrw.html) | Official French regulated class name and designated varieties. Does not classify the reviewed retail item. |
| U.S. Wheat Associates, [2024 French crop-quality report](https://www.uswheat.org/wp-content/uploads/2024-USW-Crop-Quality-Report-French.pdf) | Uses `blé de force rouge d'hiver` for Hard Red Winter. Technical market terminology, not a Québec label or OQLF ruling. |
| OQLF, [farine de blé de force](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force) and [blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357379/ble-dur) | Supports the `blé de force` wording component and establishes that `blé dur` denotes durum wheat. Neither entry names hard-red-winter wheat berries. |
| Gratefully Restored, [Hard Red Winter Wheat - Organic Grain Berries](https://gratefullyrestored.ca/products/hard-red-winter-wheat-organic-grain-berries-1847-stone-milling) | Current listing says hard red winter wheat berries, grown in Ontario, and offers 2.5 kg, 10 kg, and 20 kg packages. No cultivar, formal class, or reusable measure. |
| Stone Bridge Flour, [Whole Seeds: Hard Red Winter Wheat](https://www.stonebridgeflour.ca/product-page/whole-seeds-hard-red-winter-wheat) | Whole seed sold for home milling, listed in a 2 kg package. Does not state a formal class or cultivar. |
| Country Life Natural Foods, [Wheat Berries, Hard Red, Winter Wheat, Wheat Montana](https://www.countrylifefoods.ca/products/wheat-berries-hard-red-winter-wheat) | Lists a Montana-origin food product. Supports the English product name; package sizes and qualitative rice/quinoa suggestion are not transferable recipe measures or substitution evidence. |
| Canadian Grain Commission, [Quality of Canada Eastern Hard Red Winter wheat in 2024](https://grainscanada.gc.ca/en/grain-research/grain-harvest-export-quality/wheat/2024/canada-eastern-hard-red-winter/) | Gives the Ontario CEHRW class context and 2024 test-weight data. The latter is agricultural grain-quality data, not a kitchen conversion, and does not describe every marketed product in this review. |

Static work completed for this proposal:

- Re-read the active Section F checklist, the R149–R155 WP03 proposals, and current references, forms, legacy candidates, ledger, and recipe manifest before selecting the candidate.
- Checked normalized exact ownership for the proposed names and French variants across references, forms, and legacy candidates; checked reference, candidate, ledger-record, and source-ID allocation; searched the proposal and batch archive, plan, and roadmap for prior focused review.
- Reproduced phrase-first picker results from the current catalog and attached form terms. The exact product phrases have no current owner; broad wheat-berry and winter-wheat queries gain a distinct row as shown above.
- Parsed all manifest-listed recipe files and structured ingredient rows. Candidate phrases and ID had zero full-file and ingredient-row hits.
- Reviewed product package amounts, relevant wheat-berry forms, and current ledger measure/substitution state. No transferable recipe measure, conversion, form, yield, or substitution is proposed.
- No Gradle, unit, instrumentation, emulator, app, or deployment checks were run. This is a proposal-only review; no database JSON was changed.

## Recommendation

Add one identity-only hard-red-winter wheat-berry reference with the provisional French display above, and keep independent Québec wording review open. The proposal does not allocate a catalog ID or add ledger sources; those changes belong in a later integration decision.

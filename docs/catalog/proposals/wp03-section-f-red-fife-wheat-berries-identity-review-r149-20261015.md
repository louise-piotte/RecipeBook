# WP03 Section F — Red Fife wheat berries identity review (R149, 2026-10-15)

## Review record

- **Reviewed:** 2026-10-15.
- **Status:** Proposal only; no shared catalog, ledger, plan, roadmap, recipe, or generated-index edits.
- **Scope:** Decide whether whole Red Fife wheat sold as an edible grain product merits a separate Section F identity from generic wheat berries and the existing whole/white Red Fife flour references.
- **Recommendation:** Accept an identity-only `GRAIN_AND_CEREAL` reference for **Red Fife wheat berries / grains de blé Red Fife**. Keep its full grain-specific names as the only search terms; do not add generic `Red Fife` or `wheat berries` aliases.
- **Proposed reference ID:** `ingredient-ref-red-fife-wheat-berries`.
- **Source-ID prefix:** `WP03-REDFIFE-BERRIES-R149-20261015-S` (S01–S06). This prefix and the proposed reference ID were checked against the current ledger and proposal/batch archive; neither is allocated.

## Identity boundary and recommendation

The candidate is whole, edible kernels sold as Red Fife wheat berries. Agriculture and Agri-Food Canada (AAFC) identifies Red Fife as wheat in its account of Canadian wheat breeding, and the federal *Handbook of Canadian Spring Wheat Varieties* lists Red Fife as a wheat variety and describes its kernels [S01–S02]. Current Canadian grain retailers sell the product as whole Red Fife wheat berries or whole-grain Red Fife wheat [S03–S04]. A Québec distributor's dated bilingual product list also names a Red Fife grain product from Céréales Charlevoix [S05]. Together, these sources support a named, whole-kernel food product within `GRAIN_AND_CEREAL`.

Use **Red Fife wheat berries / grains de blé Red Fife** as the proposed display pair. The English name follows current grain listings. The French display is a transparent, source-informed construction based on the catalog's existing *grains de blé entiers* wording and the older Québec distributor entry `GRAIN BLE ANCIEN ROUGE RED FIFE BIO`; it is not represented as an OQLF-preferred term or a currently verified Québec retail title. A Québec seed retailer also uses `blé – Red Fife`, but its listing is for planting seed, not an edible grain product [S06].

The reference is narrower than the generic wheat-berries identity and does not turn all wheat berries into Red Fife. The whole or white Red Fife flour rows remain separate: milling changes the ingredient product, and neither flour row is an alias or form of the whole grain. The new row makes no claim that every product sold under a Red Fife name has a verified cultivar purity, organic status, kernel grade, or milling/baking performance.

Do not add `Red Fife`, `Red Fife wheat`, `wheat berries`, `whole wheat`, or generic French grain terms as aliases. `Red Fife` already retrieves both Red Fife flour identities; leaving it broad lets the picker show the grain and both flour grades together. A grain-qualified exact name keeps the new result distinct from those rows and from generic wheat berries.

## Proposed JSON delta

### Ingredient reference

```json
{
  "id": "ingredient-ref-red-fife-wheat-berries",
  "nameEn": "Red Fife wheat berries",
  "nameFr": "grains de blé Red Fife",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

### Research-ledger record

Append this record to `docs/catalog/research-ledger.v1.json` only if the recommendation is accepted. The source IDs are new proposal-local IDs and are not presently in the shared ledger.

```json
{
  "recordId": "ingredient-ref-red-fife-wheat-berries",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-REDFIFE-BERRIES-R149-20261015-S01",
      "url": "https://agriculture.canada.ca/en/science/story-agricultural-science/scientific-achievements-agriculture/recipe-success-technology-collaboration-and-legacy-aafc-wheat-breeding",
      "title": "Agriculture and Agri-Food Canada, A recipe for success: Technology, collaboration and legacy in AAFC wheat breeding",
      "accessedOn": "2026-10-15",
      "locator": "Canadian wheat history and the Canadian Heritage Bread Wheat Panel.",
      "supports": "Identifies Red Fife as wheat planted in Ontario in 1842 and places it in Canada's wheat-breeding history. Supports the wheat identity and Canadian context, not a current food SKU or cultivar-purity claim.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-REDFIFE-BERRIES-R149-20261015-S02",
      "url": "https://publications.gc.ca/collections/collection_2014/aac-aafc/agrhist/A53-538-1956-eng.pdf",
      "title": "Fraser and Whiteside, Handbook of Canadian spring wheat varieties",
      "accessedOn": "2026-10-15",
      "locator": "Red Fife, C.A.N. 1515, pp. 32–33 of the PDF.",
      "supports": "Lists Red Fife as a wheat variety and describes its kernels as red and hard. This is a historical technical reference; its historical status and kernel description are not treated as a current grain grade or product specification.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-REDFIFE-BERRIES-R149-20261015-S03",
      "url": "https://storehousefoods.ca/products/organic-red-fife-berries",
      "title": "Storehouse Foods, Organic Red Fife Berries",
      "accessedOn": "2026-10-15",
      "locator": "Current product title, product-of-Canada statement, product description, and available package variants.",
      "supports": "Currently lists a Canadian product as Organic Red Fife Berries and describes the berries as whole Red Fife wheat. The 2.5 kg, 10 kg, and 20 kg options are package sizes. Its qualitative comparison with Hard Red Winter wheat is seller copy and does not establish a substitution ratio or rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-REDFIFE-BERRIES-R149-20261015-S04",
      "url": "https://www.fieldstoneorganics.ca/product/organic-whole-grain-red-fife-wheat/",
      "title": "Fieldstone Organics, Organic Whole Grain Red Fife Wheat",
      "accessedOn": "2026-10-15",
      "locator": "Current product description, cooking instructions, and use suggestions.",
      "supports": "Lists whole-grain Red Fife wheat as a food product and describes cooking, milling, and sprouting uses. Its 1-part-grain to 3-parts-water direction and 25–30 minute cook are product-specific instructions, not a generic conversion, yield, or household measure.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-REDFIFE-BERRIES-R149-20261015-S05",
      "url": "https://ventesrudolph.com/wp-content/uploads/2022/12/produits-2022-12-07.pdf",
      "title": "Ventes Rudolph, Liste de produits, 2022-12-07",
      "accessedOn": "2026-10-15",
      "locator": "PDF page 7, product code 7456: French and English distributor descriptions for a Céréales Charlevoix Red Fife grain product; 25 kg format.",
      "supports": "A Québec-facing distributor's 2022 list pairs `GRAIN BLE ANCIEN ROUGE RED FIFE BIO` with an English Red Fife wheat grain description. Supports historical local trade usage only; it does not prove current stock, a current consumer package, or a standard French display. The 25 kg entry is commercial package size, not a recipe measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-REDFIFE-BERRIES-R149-20261015-S06",
      "url": "https://semencesancestrales.com/semences/ble-red-fife/",
      "title": "Semences Ancestrales Québec, Blé – Red Fife",
      "accessedOn": "2026-10-15",
      "locator": "Current French product title and description; category and quantity identify planting seed.",
      "supports": "Uses `blé – Red Fife` for the variety in a Québec French listing. This item is seed for planting, not an edible-grain product; it supports the French variety name only and is not evidence for a food measure or food-market package.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only Red Fife wheat berries / grains de blé Red Fife in GRAIN_AND_CEREAL for the whole-kernel edible product named by current Canadian grain listings and the dated Québec bilingual distributor listing. Keep it separate from generic wheat berries, wheat flour, and the whole and white Red Fife flour references. The French display is a transparent, source-informed construction, not an OQLF ruling or current Québec retail title. Add no aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP03-REDFIFE-BERRIES-R149-20261015-S01",
        "WP03-REDFIFE-BERRIES-R149-20261015-S02",
        "WP03-REDFIFE-BERRIES-R149-20261015-S03",
        "WP03-REDFIFE-BERRIES-R149-20261015-S04",
        "WP03-REDFIFE-BERRIES-R149-20261015-S05",
        "WP03-REDFIFE-BERRIES-R149-20261015-S06"
      ]
    }
  ]
}
```

## Catalog ownership and picker projection

The read-only package snapshot contains **1,511 ingredient references**, **119 forms**, and **1,856 research-ledger records**. The active catalog includes generic `wheat berries / grains de blé entiers`, a separate `durum wheat berries` row, sprouted wheat berries, and the two Red Fife flour identities. It has no Red Fife wheat-berry reference or form. The candidate ID and both proposed exact displays have no current exact owner in active references or form labels/match terms; the ledger has no candidate or reference record for the proposed ID or exact product phrase. An archive search found no earlier focused Red Fife wheat-berry proposal or batch. The R147/R148 Red Fife work covers flour grades, not whole berries.

The projection below applies the current phrase-first search logic from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) to active reference and form terms. It is a static projection, not live picker QA.

| Query | Current phrase owner(s) | With proposed identity | Effect |
| --- | --- | --- | --- |
| `Red Fife wheat berries` | None | `ingredient-ref-red-fife-wheat-berries` | Exact English product query becomes unique. |
| `grains de blé Red Fife` | None | `ingredient-ref-red-fife-wheat-berries` | Exact proposed French display becomes unique. |
| `wheat berries` | `ingredient-ref-durum-wheat-berries`, `ingredient-ref-sprouted-wheat-berries`, `ingredient-ref-wheat-berries` | Those three plus `ingredient-ref-red-fife-wheat-berries` | Broad family query gains a fourth explicit product result. |
| `Red Fife` | `ingredient-ref-white-red-fife-flour`, `ingredient-ref-whole-red-fife-flour` | Those two plus `ingredient-ref-red-fife-wheat-berries` | The broad variety query exposes the grain and both flour grades together. |
| `Red Fife flour` | Both existing Red Fife flour references | Same two flour references | The new grain does not take ownership of a flour-qualified query. |
| `whole Red Fife flour` / `farine Red Fife entière` | `ingredient-ref-whole-red-fife-flour` | Same single reference | Existing whole-flour English and French queries remain specific. |

No `Red Fife`, generic wheat, generic wheat-berry, flour, or French generic alias is proposed. No new form is proposed, so no form hint can route a flour or grain query to a different product state.

## Recipe-corpus demand

The bundled manifest lists **114 recipe files** and the parsed files contain **1,123 ingredient rows**. A read-only search of all listed recipe JSON text and ingredient rows for `Red Fife`, `Red Fife wheat berries`, `Red Fife wheat`, `grains de blé Red Fife`, and the dated local label wording found **zero matching files and zero matching rows**. The corpus supports no recipe link, recipe-specific form, amount, or demonstrated demand for this item. Current Canadian retail listings establish market presence, not recipe demand or search volume.

## Measures, forms, and substitutions

- **Package weights:** Current listings offer multi-kilogram packages and the 2022 Québec distributor list records a 25 kg format. These are SKU or commercial package sizes, not serving sizes, household measures, densities, or volume-to-mass mappings.
- **Cooking:** Fieldstone gives a product-specific 1:3 grain-to-water direction and a 25–30 minute simmer. Do not generalize this direction into a cooking conversion or yield for all Red Fife or generic wheat berries.
- **Forms and yield:** Add no form or conversion. The proposed identity names the dry whole-kernel product; sources do not give a reusable dry-to-cooked yield.
- **Substitution:** Storehouse says its product can be used in place of modern Hard Red Winter wheat but gives no ratio, tested recipe, role, or method limits. Keep that qualitative seller statement source-scoped and add no global or contextual substitution.
- **Density and unit mappings:** Keep `defaultDensity` null and `unitMappings` empty. No source supports a reusable measure or density for the grain.
- **Recipe links:** None; no bundled recipe line matches the candidate.

## Sources

Sources were opened online on 2026-10-15. Product and package availability can change.

| Source ID | Source and locator | Evidence used and limits |
| --- | --- | --- |
| `WP03-REDFIFE-BERRIES-R149-20261015-S01` | AAFC, [A recipe for success: Technology, collaboration and legacy in AAFC wheat breeding](https://agriculture.canada.ca/en/science/story-agricultural-science/scientific-achievements-agriculture/recipe-success-technology-collaboration-and-legacy-aafc-wheat-breeding), section “Chronicling the past.” | Places Red Fife in Canadian wheat history and identifies it as wheat planted in Ontario in 1842. It is not a current product label or cultivar-purity specification. |
| `WP03-REDFIFE-BERRIES-R149-20261015-S02` | AAFC, Fraser and Whiteside, [Handbook of Canadian spring wheat varieties](https://publications.gc.ca/collections/collection_2014/aac-aafc/agrhist/A53-538-1956-eng.pdf), Red Fife (C.A.N. 1515), PDF pp. 32–33. | Historical technical source lists Red Fife as a spring wheat variety and describes the kernels. Its old status notes are not treated as current distribution or market evidence. |
| `WP03-REDFIFE-BERRIES-R149-20261015-S03` | Storehouse Foods, [Organic Red Fife Berries](https://storehousefoods.ca/products/organic-red-fife-berries). | Current Canadian retailer title says “Organic Red Fife Berries,” states “Product of Canada,” and describes whole Red Fife wheat berries. Its package variants are not recipe measures; its wheat-replacement sentence is an unquantified seller claim. |
| `WP03-REDFIFE-BERRIES-R149-20261015-S04` | Fieldstone Organics, [Organic Whole Grain Red Fife Wheat](https://www.fieldstoneorganics.ca/product/organic-whole-grain-red-fife-wheat/). | Current Canadian product page identifies whole-grain Red Fife wheat, gives culinary uses and a brand-specific cooking instruction. It does not establish a Québec French label or generic measure/yield. |
| `WP03-REDFIFE-BERRIES-R149-20261015-S05` | Ventes Rudolph, [Liste de produits](https://ventesrudolph.com/wp-content/uploads/2022/12/produits-2022-12-07.pdf), 2022-12-07, PDF p. 7. | Dated Montréal distributor list pairs French `GRAIN BLE ANCIEN ROUGE RED FIFE BIO (CER.CHARLEVOIX)` with English `GRAIN WHEAT ANCIEN ROUGE RED FIFE ORG` and lists 25 kg. Treat as historical Québec trade/name evidence only; it does not prove current stock or a canonical French display. |
| `WP03-REDFIFE-BERRIES-R149-20261015-S06` | Semences Ancestrales Québec, [Blé – Red Fife](https://semencesancestrales.com/semences/ble-red-fife/). | Current French seed listing supports the variety wording `blé – Red Fife`; it is for planting seed, not food grain. Used only as French-name context. |
| Existing `WP03-S57` | Department of National Defence, [Spécifications sur la qualité des aliments – Grain céréalier](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), SQA-24-17, “Grains de blé entiers.” | Already recorded on the generic wheat-berries ledger record. It supports the existing Québec French generic name and category context; it does not name Red Fife. No duplicate source record is proposed. |

## Static checks performed

- Re-read the active Section F plan, live reference and form files, the research ledger, and the Section F proposal/batch archive before choosing this candidate. The archive has Red Fife flour reviews (R147/R148) but no focused Red Fife wheat-berry review.
- Checked the proposed reference ID, exact displays, and source-ID prefix against active references/forms, ledger IDs/source IDs, and proposal/batch text. No exact owner or collision was found.
- Reproduced phrase-first picker projection using active reference/form terms and the current `IngredientSearch.kt` matching behavior. Exact English and French product queries currently have no owner and each would resolve to the proposed row. `wheat berries` expands from three to four results; `Red Fife` expands from the two existing flour rows to those two plus the grain. Flour-qualified queries remain with the two existing flour rows.
- Parsed all 114 manifest-listed recipe files and 1,123 ingredient rows; searched serialized recipe text and ingredient rows for the candidate names and got zero matches.
- No app, Android, emulator, or test-suite checks were run. This is a proposal-only review; no catalog data was changed.

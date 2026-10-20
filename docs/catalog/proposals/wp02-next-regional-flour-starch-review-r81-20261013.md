# WP02 B2 grape-seed flour review — R81

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. This review writes no shared catalog, form, ledger, checklist, roadmap, generated, or application file.
- **Open checklist item:** Section 04, B2, line 1832, “Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours” in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1832). Grape-seed flour is an additional, distinct seed-derived flour gap within that open alternative-flour coverage.
- **Candidate:** Food flour sold under the names `grape seed flour` / `grapeseed flour`; proposed Québec French display `farine de pépins de raisin`.
- **Snapshot:** The post-R80 catalog has 1,408 ingredient references, 104 forms, and 1,747 research-ledger records. The manifest-ordered recipe corpus has 114 recipes and 1,123 ingredient rows.
- **Archive and collision audit:** Exact searches for `grape seed flour`, `grapeseed flour`, `farine de pépins de raisin`, `farine de pepins de raisin`, `grape pomace flour`, and `grape seed meal` found no focused proposal or batch decision, active reference, form, legacy identity, or ledger candidate. The corresponding ID `ingredient-ref-grape-seed-flour` and source prefix `WP02-B2-GRAPE-SEED-FLOUR-R81-20261013` are unused.

## Recommendation

**Integrate one identity-only `FLOUR_AND_STARCH` reference** for `grape seed flour / farine de pépins de raisin`, with the narrowly source-attested English spelling alias `grapeseed flour`. Keep French aliases empty, `defaultDensity` null, and `unitMappings` empty. Add no ingredient form, recipe link, generic measure, conversion, yield, or substitution.

The candidate is a named human-food flour product, not an inference from the existence of grape seeds or an oil-press cake. Salute Santé’s current manufacturer page sells Chardonnay grapeseed flour and gives food-use directions; its manufacturer presentation says the oil-press cake is milled into grape-seed flour. The Naturitas Canada product page identifies a 400 g Ecoidees grape-seed flour made from seed cake after first cold pressing and lists use in bread dough and pizza. Its stock message currently says “will be in stock soon,” so it supports Canadian-facing product naming, not present availability. [S01–S03]

The row represents the marketed flour identity made from milled grape seeds. Sources do not establish one universal cultivar, residual-oil level, milling grade, or extraction process. The Canadian French phrase `farine de pépins de raisin` is directly attested by Second Harvest’s French-language article; OQLF supports the base lexical pair `pépin de raisin / grape seed`. The compound is therefore a **provisional Québec display**, not an OQLF ruling or a Québec product-label transcription. Keep French aliases empty. [S04–S05]

One process boundary remains material: the commercial manufacturer and product listing describe oil-pressed seed cake, while the Canadian French article says grape seeds are dried and milled after grape pressing for juice without specifying oil extraction. The article supports the French food name and use, but its short process description does not prove an independently marketed non-defatted flour. The EU feed-material catalogue separately defines grape-seed flour during oil extraction, un-deoiled seeds, and grape pomace; because it is a feed catalogue, use it only as a terminology/process boundary, not as a human-food standard. Do not claim all seed preparations are equivalent, add a “defatted” alias, or merge grape pomace flour into this row. [S04, S06]

The evidence is strong enough for the base product identity and exact picker phrase. I found no evidence requiring a hold. Keep source-specific pressing, cultivar, and grind details out of shared forms and aliases until a Québec human-food label or repeatable product specification supports a narrower subdivision.

## Identity and product boundaries

| Product or phrase | Decision | Evidence boundary |
|---|---|---|
| Grape-seed flour | Add one base `FLOUR_AND_STARCH` identity for the marketed food flour made from milled grape seeds. | Manufacturer and retail sources name the product as flour and describe food uses; the sources do not set universal fat, grind, or cultivar specifications. [S01–S03] |
| Chardonnay and Merlot grapeseed flours | Keep as maker-specific product variants within the base identity. | The manufacturer sells varietal products; no evidence supports catalog rows or aliases for grape cultivars. [S01–S02] |
| Oil-pressed grape-seed cake milled as flour | Included as the documented commercial process for the source products, without encoding that process as a universal form. | Manufacturer and Canadian retail listing describe oil extraction/press cake; no common residual-oil threshold is given. [S02–S03] |
| Seeds dried and milled after juice pressing | Do not create a second identity from the Canadian French article alone. | It attests the French product phrase and a seed-milling description, but does not say whether the seeds were previously oil-pressed or establish a distinct product specification. [S04] |
| Grape-seed oil | Keep on `ingredient-ref-grapeseed-oil`. Do not add flour as an alias or form. | The existing row identifies oil; the sources identify flour as a different product made from the seed material after processing. |
| Whole grape seeds or kernels | Keep separate from flour; add no seed-kernel alias to the flour row. | Milling changes the ingredient product; no active seed-kernel reference was found in the exact-name audit. |
| Grape pomace flour / grape-pomace meal | Keep unassigned and separate from seed flour. | “Pomace” may include skins, pulp, and seeds; the feed catalogue lists grape pulp/pomace separately. That source is not evidence for a human-food product recipe or a synonym. [S06] |
| Grape-seed extract, capsules, or supplement powder | Keep separate. | An extract or supplement preparation is not the flour sold for baking. No such phrase is added as an alias. |
| `grape flour`, `grape seed meal`, `farine de raisin`, or `farine de marc de raisin` | Do not add aliases. | These phrases can point to other grape parts or preparations and are not supported as synonyms for the proposed row. |

## Québec French and Canadian scope

Second Harvest’s Canadian French page uses the exact phrase **farine de pépins de raisin** for a food ingredient and says it can be used in baking and cooking. OQLF’s GDT entry identifies **pépin de raisin** as the French term for *grape seed*. Together they support the proposed French display as a clear descriptive compound. Neither source is a Québec package label, and OQLF does not define a flour product, so mark the display provisional and keep `aliasesFr` empty. [S04–S05]

The Naturitas Canada storefront provides Canadian-facing English evidence for a named human-food product, 400 g package, and bread/pizza use; at review it was not in stock. The Salute Santé manufacturer page and presentation independently support the product itself and its milling process. These sources establish a Canadian-facing food ingredient and English naming, not Québec retail availability or a bilingual packaged product. [S01–S03]

## Current ownership and picker boundary

The read-only audit covered the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [research ledger](../research-ledger.v1.json), [legacy import identities](../legacy-import-identities.v1.json), recipe corpus, open WP02 plan item, and prior B2/B3 proposals and batches.

| Current owner | Stored names and aliases | Scope |
|---|---|---|
| `ingredient-ref-grapeseed-oil` | `huile de pépins de raisin` / `grapeseed oil`; English alias `grape seed oil` | Oil, category `FAT_AND_OIL`. Preserve exact oil queries on this row. |
| `ingredient-ref-grape-juice` | `jus de raisin` / `grape juice`, plus concentrate/reconstituted variants | Grape juice. |
| `ingredient-ref-grapes` | `raisin` / `grapes` | Whole fruit. |
| `ingredient-ref-verjuice` | `verjus` / `verjuice`; English alias `sour grape juice` | Acidic juice from unripe grapes. |
| `ingredient-ref-dried-currants` | `raisins de Corinthe séchés` / `dried currants`; French alias `raisin de Corinthe` | Dried fruit. |

No exact flour name, proposed ID, or dedicated flour ledger record is currently owned. The proposed `grapeseed flour` spelling alias is supported by the manufacturer/storefront wording. No `grape seed`, `grapeseed`, `raisin`, or `pépins de raisin` alias is added; broad matches arise from the bilingual display name itself.

The projection below follows the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalization removes accents and punctuation, complete contiguous word phrases are preferred across results, then substring matching is used only if no phrase result exists. These are static projections from the current catalog plus the proposed row, not UI test results.

| Query | Current results | With proposed row | Boundary assessment |
|---|---|---|---|
| `grape seed flour` | No result | New flour row only | Exact English phrase remains unique. |
| `grapeseed flour` | No result | New flour row only | Full alternate spelling is supported by source wording and resolves to the same flour. |
| `farine de pépins de raisin` | No result | New flour row only | Exact provisional French display is unique. |
| `grape seed` | Grape-seed oil | Grape-seed oil + flour | Broad material query exposes both oil and flour. |
| `grapeseed` | Grape-seed oil | Grape-seed oil + flour | Broad joined spelling exposes both products. |
| `grape` | Grape juice, grape-seed oil, verjuice | Those three + flour | Broad family query adds the new grape-seed product. |
| `raisin` | Dried currants, grape juice, grapes, grape-seed oil | Those four + flour | French base-word query broadens through the display name. |
| `pépins de raisin` | Grape-seed oil | Grape-seed oil + flour | Broad seed-part query surfaces both products. |
| `grape seed oil` / `huile de pépins de raisin` | Grape-seed oil | Grape-seed oil only | Complete oil phrases remain unique; the new row gets no oil alias. |
| `grape pomace flour`, `grape flour`, `grape seed meal` | No result | No result | Unsupported broad/alternative preparations stay unmatched. |
| `grapes` | Whole grapes | Whole grapes | Exact plural query remains on the fruit row. |

The broader results for `grape`, `raisin`, and `pépins de raisin` are acceptable because these queries name the source fruit or seed part, not an exact product form. The complete flour and oil phrases provide the useful product boundary. Do not add aliases that would make “grape flour,” “grape seed meal,” or “grape pomace flour” resolve to seed flour.

## Bundled recipe demand

The current seed package has 114 manifest-listed recipe files and 1,123 ingredient rows. A full recipe-text and ingredient-row scan for `grape seed flour`, `grapeseed flour`, `farine de pépins de raisin`, `farine de pepins de raisin`, `grape pomace flour`, and `grape seed meal` found zero candidate mentions or ingredient-line hits. No recipe link, recipe relabeling, quantity, or form is proposed.

## Forms, numeric evidence, and substitution limits

- **Forms:** Add none. `Flour` is the identity’s product form. No source establishes reusable whole-seed, cold-pressed, defatted, cultivar, grind, or particle-size `IngredientForm` values.
- **Package quantity:** Naturitas lists one 400 g package. Package mass is not a cup/tablespoon measure or density. The page showed “will be in stock soon” at review. [S03]
- **Manufacturer baking directions:** Salute Santé says its Chardonnay grapeseed flour can be added at 1 tablespoon per 1 cup of flour or substituted at 10–30% in a favorite recipe. These are that maker’s product directions, not a validated generic density, conversion, or contextual substitution rule. Do not copy them into catalog mappings or substitution JSON. [S01]
- **Density and unit conversions:** No reviewed source gives a transferable g/mL, grams-per-cup, or mass-per-volume value with a reproducible food specification and method. Leave `defaultDensity` null and `unitMappings` empty.
- **Yield:** No reviewed source supports a general seed-to-flour milling yield, cooked yield, or edible-portion yield. Add none.
- **Substitution:** The manufacturer’s product-specific 10–30% direction is not generalized. No global flour conversion or directed ingredient substitution is proposed.

## Exact future JSON delta

Add one reference only:

```json
{
  "id": "ingredient-ref-grape-seed-flour",
  "nameEn": "grape seed flour",
  "nameFr": "farine de pépins de raisin",
  "aliasesEn": ["grapeseed flour"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Add this corresponding ledger record; it stores identity and evidence only, with no measurement observation or substitution finding:

```json
{
  "recordId": "ingredient-ref-grape-seed-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S01",
      "url": "https://shop.grapeseedoil.com/products/chardonnay-grapeseed-flour",
      "title": "Salute Santé!, Chardonnay Grapeseed Flour",
      "accessedOn": "2026-10-13",
      "locator": "Product description and baking directions.",
      "supports": "Manufacturer sells a named human-food grapeseed flour for baking and states a source-product direction of 1 tablespoon per 1 cup of flour or 10–30% substitution. These directions are not generalized.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S02",
      "url": "https://grapeseedoil.com/wp-content/uploads/2025/09/2025-Salute-Sante-Presentation.pdf",
      "title": "Salute Santé!, 2025 company presentation",
      "accessedOn": "2026-10-13",
      "locator": "PDF p. 3, oil pressing and flour production.",
      "supports": "Manufacturer states its press cake is milled into grape-seed flour; supports the marketed food product and this maker’s process, not a universal process specification.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S03",
      "url": "https://www.naturitas.ca/catalog/product/view/id/18568/",
      "title": "Naturitas Canada, ORGANIC grape seed flour 400 g (Ecoidees)",
      "accessedOn": "2026-10-13",
      "locator": "Product title, description, package size, status, and intake mode.",
      "supports": "Canadian-facing listing for a 400 g human-food grape-seed flour made from seed cake after first cold pressing; lists bread and pizza use. The page said the product would be in stock soon at review.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S04",
      "url": "https://www.secondharvest.ca/fr-ca/post/flour-power",
      "title": "Deuxième Récolte (Second Harvest), La puissance de la farine",
      "accessedOn": "2026-10-13",
      "locator": "Section “Farine de pépins de raisin”.",
      "supports": "Canadian French source uses the exact compound farine de pépins de raisin for a food ingredient and describes seeds dried and milled after grape pressing; it does not specify prior oil extraction or establish a Québec package label.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S05",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3695867/pepin-de-raisin",
      "title": "Office québécois de la langue française, pépin de raisin (GDT)",
      "accessedOn": "2026-10-13",
      "locator": "Term record; English equivalent.",
      "supports": "Supports the Québec French base term pépin de raisin and its English equivalent grape seed; it does not name a flour product.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S06",
      "url": "https://eur-lex.europa.eu/legal-content/FR/TXT/PDF/?uri=CELEX:02013R0068-20220724",
      "title": "European Commission, Catalogue of feed materials, Regulation (EU) No 68/2013, consolidated 2022-07-24",
      "accessedOn": "2026-10-13",
      "locator": "Entries 5.25.1–5.25.3: grape seeds, farine de pépins de raisin, and grape pulp/pomace.",
      "supports": "Separates un-deoiled grape seeds, flour obtained during oil extraction, and grape pomace in the animal-feed catalogue. Used only for product terminology/process boundaries, not as a human-food standard.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one identity-only grape seed flour / farine de pépins de raisin reference with the source-attested English spelling alias grapeseed flour. Keep the French display provisional, keep aliasesFr empty, and do not assert a universal cultivar, grind, fat-removal process, density, measure, yield, or substitution. Keep grape-seed oil and grape pomace products separate.",
      "sourceIds": [
        "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S01",
        "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S02",
        "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S03",
        "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S04",
        "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S05",
        "WP02-B2-GRAPE-SEED-FLOUR-R81-20261013-S06"
      ]
    }
  ]
}
```

## Source register

- **S01 — Salute Santé!, [Chardonnay Grapeseed Flour](https://shop.grapeseedoil.com/products/chardonnay-grapeseed-flour), accessed 2026-10-13.** Manufacturer product page for the human-food flour. Supports the exact product name and its stated baking directions. The page’s 1 tablespoon-per-1-cup and 10–30% directions remain specific to this product and are not catalog conversions or general substitution rules.
- **S02 — Salute Santé!, [2025 company presentation](https://grapeseedoil.com/wp-content/uploads/2025/09/2025-Salute-Sante-Presentation.pdf), accessed 2026-10-13.** Manufacturer PDF, p. 3. Says oil pressing leaves a press cake which the maker mills into grape-seed flour. Supports product identity and process for this maker, not universal residual-oil or grind values.
- **S03 — Naturitas Canada, [ORGANIC grape seed flour 400 g (Ecoidees)](https://www.naturitas.ca/catalog/product/view/id/18568/), accessed 2026-10-13.** Canadian storefront listing. Names the product, describes seed cake after first cold pressing, lists 400 g packaging and bread/pizza use, and at review stated “will be in stock soon.” It is Canadian-facing evidence, not a Québec availability claim.
- **S04 — Deuxième Récolte (Second Harvest), [La puissance de la farine](https://www.secondharvest.ca/fr-ca/post/flour-power), accessed 2026-10-13.** Canadian French article, section “Farine de pépins de raisin.” Supports the exact French compound and food use. Its process summary says grape seeds are dried and milled after juice pressing but does not specify oil extraction; it is not a Québec product label.
- **S05 — Office québécois de la langue française, [pépin de raisin | Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3695867/pepin-de-raisin), accessed 2026-10-13.** Supports the Québec French base term pépin de raisin and English grape seed. It does not define a flour product.
- **S06 — European Commission, [Regulation (EU) No 68/2013, consolidated feed-material catalogue](https://eur-lex.europa.eu/legal-content/FR/TXT/PDF/?uri=CELEX:02013R0068-20220724), accessed 2026-10-13.** Entries 5.25.1–5.25.3 distinguish un-deoiled grape seeds, flour obtained during oil extraction, and grape pulp/pomace. This is an animal-feed catalogue, cited only for terminology and process boundaries, not as a human-food standard.

## Static review record

- Re-read the current `AGENTS.md`, the open Section 04 WP02 B2 item, live references and forms, research ledger/schema, legacy identities, and relevant B2/B3 proposals and batches.
- Confirmed the post-R80 snapshot of 1,408 references, 104 forms, and 1,747 ledger records; confirmed 114 manifest-listed recipes and 1,123 ingredient rows.
- Searched the candidate names, French compound, pomace/meal variants, proposed reference ID, and R81 source prefix across active records and archive. No duplicate owner or prior focused decision was found.
- Scanned the full recipe JSON set and ingredient rows for the candidate terms; found no recipe demand.
- Projected each picker query from the current phrase-first matcher and proposed bilingual terms; verified that full flour queries are unique, exact oil queries stay unique, and broad grape/seed/raisin queries broaden as shown above.
- Rechecked cited manufacturer, Canadian storefront, Canadian French, OQLF, and EUR-Lex pages on 2026-10-13. Marked the French display provisional and kept the process/measure limits explicit.
- Static review only. No tests or emulator were run. No file other than this proposal was edited by this review.

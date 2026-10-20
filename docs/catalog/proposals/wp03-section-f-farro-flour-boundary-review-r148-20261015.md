# WP03 Section F R148 — Farro Flour Market-Class Boundary Review

Review date: 2026-10-15

## Review record

- **Status:** Research proposal only. No shared catalog, ledger, plan, roadmap, form, generated-index, or recipe files were changed.
- **Scope:** Decide whether a species-neutral flour product identity sold under the farro name belongs beside the R147 `farro grain / grains de farro` identity.
- **Plan context:** Section F keeps farro species and grain/flour boundaries open. R147 added the explicit, species-neutral grain-market class `ingredient-ref-farro-grain`; it did not resolve flour or the older `ingredient-ref-farro` candidate. This review treats flour as a separate product class.
- **Existing candidate:** `ingredient-ref-farro` remains a ledger `candidate` with `identityState: needs_clarification`, 15 source records, and four unresolved decisions. It represents unqualified farro across species and product contexts.
- **Recommendation:** Add one identity-only, species-neutral market-product reference: **`farro flour / farine de farro`**. Keep the existing candidate unresolved for bare `farro`; do not map the new row to emmer, spelt, or einkorn.

## Decision and identity boundary

Add `ingredient-ref-farro-flour` as a market name for flour products that are sold or described as farro flour. The sources show this product wording applied to emmer, spelt, einkorn, and a multi-species farro flour product. The catalog row represents the shared market product phrase and flour state; it does not assert that farro is one wheat species or that every flour from any of those species is marketed as farro flour.

The proposed displays are the exact English product phrase `farro flour` and the Québec-market-attested French phrase `farine de farro`. AB & CO essentiels currently lists `ÉPEAUTRE — Farine de farro / épeautre` on its Québec/Canada flour storefront. This is direct local product wording, not an OQLF ruling for a species-neutral French term. OQLF accepts *farro* under its *amidonnier* entry for *Triticum dicoccum*; TERMIUM separately records a broader ethnobotanical use covering einkorn, emmer, and spelt. These sources establish why the catalog row must remain separate from taxonomic identities.

Keep these existing identities distinct and unchanged:

- `ingredient-ref-emmer-flour` — `emmer flour / farine d'amidonnier`.
- `ingredient-ref-spelt-flour` — `spelt flour / farine d'épeautre`.
- `ingredient-ref-einkorn-flour` — `einkorn flour / farine de petit épeautre`.
- `ingredient-ref-farro-grain` — `farro grain / grains de farro`.
- `ingredient-ref-farro` — unresolved candidate for bare farro.

Do not add `farro` or species names as aliases. Do not add `épeautre`, `petit épeautre`, `engrain`, `amidonnier`, `emmer`, `spelt`, or `einkorn` as aliases. The phrase `farine de farro / épeautre` is attached to a Québec listing headed `ÉPEAUTRE`; that product context can be interpreted as spelt when the full item name is available, but the unqualified substring `farine de farro` is not a safe alias of the spelt-flour row. Likewise, a product that says `farro flour` and also identifies *Triticum dicoccum* or emmer can be linked to the emmer-flour identity in that product context without changing global aliases.

Keep semolina, meal, pasta, and prepared dishes outside this flour identity. Do not create whole, sifted, refined, or other milling-grade forms: current sources attach those details to individual products, and their grades do not define this market phrase. This identity is not a substitute for the three species-specific flour rows.

## Catalog, ledger, and corpus audit

The proposal-time snapshot has 1,508 active references, 119 forms, 1,853 ledger records, 7,799 source entries, 6,654 distinct source IDs, and 114 manifest-listed recipes containing 1,123 ingredient rows.

| Surface | Current result |
|---|---|
| Active references | `ingredient-ref-farro-grain` is the only active farro reference. The proposed ID `ingredient-ref-farro-flour` is unallocated. Exact normalized keys `farro flour` and `farine de farro` have no current reference owner. |
| Existing flour references | Emmer, spelt, and einkorn each have a separate `FLOUR_AND_STARCH` row, empty alias arrays, null `defaultDensity`, and empty `unitMappings`. Their IDs, displays, and data remain unchanged. |
| Forms | There are no farro, emmer, spelt, or einkorn flour forms in the 119-row forms file. No form is proposed. |
| Legacy identities | `docs/catalog/legacy-import-identities.v1.json` has no `ingredient-ref-farro-flour` ID or exact proposed bilingual display. |
| Research ledger | `ingredient-ref-farro` remains an unresolved candidate. R147 already has a separate accepted `ingredient-ref-farro-grain` record. No `ingredient-ref-farro-flour` record or R148 source ID exists. |
| Recipe corpus | All 114 recipe files listed by the package manifest and all 1,123 structured ingredient rows were scanned for `farro`, `farro flour`, `farine de farro`, emmer, spelt, einkorn, *épeautre*, *petit épeautre*, *amidonnier*, and *engrain*. There are zero matching recipe files and zero matching ingredient rows. No recipe link or relink is proposed. |

Adding the proposed row and one ledger record would produce 1,509 references, 119 forms, and 1,854 ledger records, with 10 new source entries and 6,664 distinct source IDs. The bundled manifest and recipe count would not change.

## Picker projection

The projection below follows the current bilingual phrase-first search in `IngredientSearch.kt`. It is a static projection, not an app or emulator test.

| Query | Current catalog | With proposed row | Effect |
|---|---|---|---|
| `farro` | `farro grain / grains de farro` | `farro grain / grains de farro`; `farro flour / farine de farro` | The current singleton result becomes two product-qualified results. The visible labels distinguish grain from flour. |
| `farro grain` | `farro grain / grains de farro` | Same | The explicit grain query remains a singleton. |
| `farro grains` | `farro grain / grains de farro` | Same | R147's English plural alias remains on the grain row. |
| `farro flour` | No result | `farro flour / farine de farro` | Exact English product phrase selects the flour row. |
| `grains de farro` | `farro grain / grains de farro` | Same | The French grain query remains a singleton. |
| `farine de farro` | No result | `farro flour / farine de farro` | Exact Québec-market French phrase selects the flour row. |
| `emmer flour`, `farine d'amidonnier` | Existing emmer-flour result | Same | Species-qualified emmer queries remain on the existing row. |
| `spelt flour`, `farine d'épeautre` | Existing spelt-flour result | Same | Species-qualified spelt queries remain on the existing row. |
| `einkorn flour`, `farine de petit épeautre` | Existing einkorn-flour result | Same | Species-qualified einkorn queries remain on the existing row. |
| `épeautre`, `petit épeautre`, `amidonnier` | Existing species-specific results | Same | No new taxonomic alias is introduced. |

The broad `farro` query will intentionally return two results after this addition. Adding the word `farro` to the three species-specific flour rows would return a wider set of flour matches and would turn product terminology into species aliases. The proposed class keeps the broad query readable through its explicit product labels while leaving the existing species search boundaries intact.

## Measurements, forms, and substitutions

- **Forms:** Add none. The proposed row is already flour-specific. Whole-grain, sifted, stone-ground, and other grades remain product-specific descriptions.
- **Density and unit mappings:** Keep `defaultDensity: null` and `unitMappings: []`. The 500 g and 1 kg packages shown by European sellers and the package options on mill pages are package quantities, not volume measures or ingredient densities. The Québec AB & CO listing does not state a household measure.
- **Conversions and yields:** Add none. No source gives a transferable mass-volume conversion, milling yield, or preparation yield for the species-neutral product class.
- **Substitutions:** Add no global or contextual rule. Arva's advice concerns its specific whole-emmer flour; it cannot be generalized to all farro flour. Product-specific baking recommendations do not establish a species-neutral conversion or validated recipe scope.
- **Recipes:** Add no recipe link; the bundled corpus has no matching demand.

## Proposed reference delta

Append this object to `ingredient-references.v1.json`; make no change to `ingredient-forms.v1.json`:

```json
{
  "id": "ingredient-ref-farro-flour",
  "nameEn": "farro flour",
  "nameFr": "farine de farro",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

No manifest change is needed. No existing reference, form, recipe, substitution, or conversion record is modified.

## Source register

The ten `WP03-FARRO-FLOUR-R148-20261015-S01` through `S10` IDs are new for this proposal. They were checked against the current ledger and proposal archive; none collides. Existing sources from earlier farro and flour reviews are not re-used as R148 IDs here, so the proposed ledger record is self-contained.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-FARRO-FLOUR-R148-20261015-S01` | OQLF, [amidonnier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier), 2019. | Lists *farro* among Québec French terms for *amidonnier* / *Triticum dicoccum*, and lists English *emmer*, *emmer wheat*, and *farro*. This is an emmer-specific terminology entry; it does not assign a flour grade or establish an exclusive species-wide definition of all market usage. |
| `WP03-FARRO-FLOUR-R148-20261015-S02` | Translation Bureau, [TERMIUM Plus: farro, Food Industries entry](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=2&i=&index=enb&lang=fra&sg_kp_wet=215052&srchtxt=EINKORN), record 1, 2022-03-10. | Describes *farro* as an ethnobotanical concept covering cultivated einkorn (*Triticum monococcum*), emmer (*T. dicoccon*), and spelt (*T. spelta*). Federal terminology evidence for broad species scope, not a flour specification. |
| `WP03-FARRO-FLOUR-R148-20261015-S03` | Department of National Defence, [Food Quality Specifications — Cereal Grain, SQA-24-06 (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf), §§36–39, pp. 4–5. | Describes emmer/farro, states that einkorn, emmer, and spelt are all called farro in some Italian usage, and mentions farro semolina. This is a Canadian procurement reference, not a universal botanical or milling standard. Semolina remains outside the proposed flour identity. |
| `WP03-FARRO-FLOUR-R148-20261015-S04` | AB & CO essentiels, [Québec/Canada flour storefront](https://abncoessentials.com/), current product listing. | The storefront identifies itself as artisanal flour for Québec/Canada and lists `ÉPEAUTRE — Farine de farro / épeautre`. This is direct local product-name evidence for the French display and a spelt-qualified farro-flour usage. The product detail page returned a cache miss in this review; the accessible storefront listing does not provide a botanical declaration, grade, or household measure. |
| `WP03-FARRO-FLOUR-R148-20261015-S05` | Arva Flour Mill, [Flour Guide](https://arvaflourmills.com/pages/flour-guide), Organic Whole Emmer entry. | The Ontario mill lists Organic Whole Emmer separately from spelt and einkorn flour and describes emmer as `rare ancient farro wheat`. This is maker wording for the emmer product, not proof that all farro flour is emmer. Product specifications and baking guidance are not imported. |
| `WP03-FARRO-FLOUR-R148-20261015-S06` | True Grain, [Organic BC Whole Emmer Flour](https://www.truegrain.ca/products/copy-of-organic-bc-whole-emmer-flour), product description and ingredient statement. | The BC mill says `Emmer (or Farro)` and declares stone-ground BC wholegrain emmer flour. This is direct Canadian producer evidence for an emmer flour marketed with farro wording; the whole-grain grade remains product-specific. |
| `WP03-FARRO-FLOUR-R148-20261015-S07` | Berchicci, Montréal, [Castel’Oro Casarecce Spelt Pasta](https://store.berchicci.ca/Castel-Oro-Casarecce-Spelt-Pasta-Casteloro), product description. | A Montréal retailer describes the pasta as made with `100% ... spelt (farro) flour`. This is Québec-market evidence for farro wording on spelt flour in a pasta product, not a standalone flour SKU or generic taxonomic equivalence. |
| `WP03-FARRO-FLOUR-R148-20261015-S08` | Poggio del Farro, [Organic Einkorn Spelt Flour](https://poggiodelfarro.com/en/products-organic-emmer/flour-organic-emmer/organic-einkorn-spelt-flour/), ingredients and product description. | The producer calls the flour `farro flour` and identifies its ingredient as whole-grain farro flour from *Triticum monococcum*. This directly supports einkorn as a species-specific use; the source is Italian, not a Canadian retail listing. |
| `WP03-FARRO-FLOUR-R148-20261015-S09` | Naturitas Canada, [Sapore di Sole Farro Flour](https://www.naturitas.ca/catalog/product/view/id/85263/), product listing. | The Canadian storefront page titles the item `Farro flour`, lists a 1 kg powder package, and says the product is no longer available. Its description calls it “Spelt flour of the precious Dicocco variety,” which mixes terms that do not establish a reliable taxonomic assignment. Use only as Canada-facing historical product-name evidence; import neither the package size nor its species/grade claim. Direct page retrieval returned a cache miss; the indexed listing was reviewed. |
| `WP03-FARRO-FLOUR-R148-20261015-S10` | Poggio del Farro, [2025 organic product certificate](https://wp.poggiodelfarro.com/wp-content/uploads/IT-BIO-009.380-0012195.2025.003-scad.-26.05.2028.pdf), product directory. | The certificate’s product directory lists `FARINA DI FARRO AI TRE FARRI (DICOCCO-MONOCOCCO-SPELTA)`, a farro flour product identified as a three-species blend of emmer, einkorn, and spelt. It supports a cross-species farro-flour market class while keeping that SKU’s blend composition product-specific. |

## Proposed research-ledger delta

Append this complete record to `docs/catalog/research-ledger.v1.json` under `records`. Leave the existing `ingredient-ref-farro` candidate untouched and unresolved; leave the R147 `ingredient-ref-farro-grain` record untouched.

```json
{
  "recordId": "ingredient-ref-farro-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier",
      "title": "Office québécois de la langue française (OQLF), amidonnier",
      "versionOrDate": "2019",
      "accessedOn": "2026-10-15",
      "locator": "Preferred terms, English translations, and Latin taxon",
      "supports": "Lists farro as a Québec French term for amidonnier / Triticum dicoccum and gives English emmer, emmer wheat, and farro. The entry supports an emmer-specific sense, not an exclusive definition of the market flour class.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S02",
      "url": "https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=2&i=&index=enb&lang=fra&sg_kp_wet=215052&srchtxt=EINKORN",
      "title": "Translation Bureau, TERMIUM Plus: farro, Food Industries entry",
      "versionOrDate": "2022-03-10",
      "accessedOn": "2026-10-15",
      "locator": "Record 1, Food Industries; farro definition/context",
      "supports": "Describes farro as an ethnobotanical concept spanning einkorn (Triticum monococcum), emmer (T. dicoccon), and spelt (T. spelta). This supports broad species scope, not a flour specification.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S03",
      "url": "https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf",
      "title": "Department of National Defence, Food Quality Specifications - Cereal Grain, SQA-24-06",
      "versionOrDate": "2018",
      "accessedOn": "2026-10-15",
      "locator": "Sections 36-39, pages 4-5",
      "supports": "Discusses emmer/farro, notes that einkorn, emmer, and spelt are all called farro in some Italian usage, and mentions farro semolina. This Canadian procurement reference documents variable scope; it is not a universal taxonomic or milling standard.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S04",
      "url": "https://abncoessentials.com/",
      "title": "AB & CO essentiels, Québec/Canada artisanal flour storefront",
      "accessedOn": "2026-10-15",
      "locator": "Current home-page product listing: ÉPEAUTRE — Farine de farro / épeautre",
      "supports": "The local flour storefront lists the exact French product phrase Farine de farro / épeautre under the ÉPEAUTRE product heading. This supports Québec product wording and a spelt-qualified use; the accessible listing does not give a botanical declaration, flour grade, or kitchen measure. The linked product detail returned a cache miss.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S05",
      "url": "https://arvaflourmills.com/pages/flour-guide",
      "title": "Arva Flour Mill, Flour Guide",
      "accessedOn": "2026-10-15",
      "locator": "Organic Whole Emmer entry and product lineup",
      "supports": "The Ontario mill separately lists emmer, spelt, and einkorn flours and describes Organic Whole Emmer as rare ancient farro wheat. This is product-specific emmer wording; its flour specifications and baking guidance are not generalized.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S06",
      "url": "https://www.truegrain.ca/products/copy-of-organic-bc-whole-emmer-flour",
      "title": "True Grain, Organic BC Whole Emmer Flour",
      "accessedOn": "2026-10-15",
      "locator": "Product description and ingredient statement",
      "supports": "The BC mill calls the crop Emmer (or Farro) and identifies the product ingredient as stone-ground BC wholegrain emmer flour. This supports emmer-specific product use; the whole-grain grade remains product-specific.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S07",
      "url": "https://store.berchicci.ca/Castel-Oro-Casarecce-Spelt-Pasta-Casteloro",
      "title": "Berchicci, Montréal, Castel’Oro Casarecce Spelt Pasta",
      "accessedOn": "2026-10-15",
      "locator": "Product description and flour statement",
      "supports": "The Montréal retailer describes its pasta as made with 100% spelt (farro) flour. This is local, spelt-qualified flour wording within a pasta product; it is not a standalone flour listing or species-neutral taxonomy.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S08",
      "url": "https://poggiodelfarro.com/en/products-organic-emmer/flour-organic-emmer/organic-einkorn-spelt-flour/",
      "title": "Poggio del Farro, Organic Einkorn Spelt Flour",
      "accessedOn": "2026-10-15",
      "locator": "Product description, ingredient statement, and Latin species",
      "supports": "The producer calls the product farro flour and identifies the ingredient as whole-grain farro flour from Triticum monococcum. This is direct evidence for einkorn-specific farro flour wording; the source is not Canadian.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S09",
      "url": "https://www.naturitas.ca/catalog/product/view/id/85263/",
      "title": "Naturitas Canada, Sapore di Sole Farro Flour",
      "accessedOn": "2026-10-15",
      "locator": "Indexed product listing, title, availability, package description, and ingredient text",
      "supports": "The Canada-facing listing uses the exact English title Farro flour and gives a 1 kg package, but marks the product no longer available. Its description says ‘Spelt flour of the precious Dicocco variety,’ mixing terms that do not establish a reliable taxonomic assignment. Use only as historical Canada-facing name evidence; direct retrieval returned a cache miss.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-FARRO-FLOUR-R148-20261015-S10",
      "url": "https://wp.poggiodelfarro.com/wp-content/uploads/IT-BIO-009.380-0012195.2025.003-scad.-26.05.2028.pdf",
      "title": "Poggio del Farro, 2025 organic product certificate",
      "versionOrDate": "2025; certificate expiry 2028-05-26",
      "accessedOn": "2026-10-15",
      "locator": "Product directory entry FARINA DI FARRO AI TRE FARRI",
      "supports": "Lists a farro flour product identified as a three-species blend: dicocco, monococco, and spelta. This supports a cross-species farro-flour market class while leaving the blend composition specific to that product.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept farro flour / farine de farro as an identity-only, species-neutral market product class. Canadian and Québec product sources use farro wording for emmer and spelt flour contexts; the producer and certificate evidence also use farro flour for einkorn and a three-species blend. The row represents only products sold or described as farro flour, not all flour made from those species. Keep the OQLF emmer sense and the distinct emmer, spelt, and einkorn identities intact. Do not add aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, or substitutions. The existing ingredient-ref-farro candidate remains unresolved for bare farro, and the R147 farro-grain identity remains a separate product class.",
      "sourceIds": [
        "WP03-FARRO-FLOUR-R148-20261015-S01",
        "WP03-FARRO-FLOUR-R148-20261015-S02",
        "WP03-FARRO-FLOUR-R148-20261015-S03",
        "WP03-FARRO-FLOUR-R148-20261015-S04",
        "WP03-FARRO-FLOUR-R148-20261015-S05",
        "WP03-FARRO-FLOUR-R148-20261015-S06",
        "WP03-FARRO-FLOUR-R148-20261015-S07",
        "WP03-FARRO-FLOUR-R148-20261015-S08",
        "WP03-FARRO-FLOUR-R148-20261015-S09",
        "WP03-FARRO-FLOUR-R148-20261015-S10"
      ]
    }
  ]
}
```

## Static checks performed

- Re-read `Requirements.md`, `AGENTS.md`, the current Section F plan entries, the active references and forms, the research ledger and schema, the legacy identity file, and the split-package manifest.
- Reproduced current ownership for the proposed ID and display phrases. `ingredient-ref-farro-flour`, `farro flour`, and `farine de farro` are unallocated; R147's `ingredient-ref-farro-grain` is the current active farro row, and `ingredient-ref-farro` remains the older candidate.
- Checked the new R148 source IDs against existing source IDs and proposal files; all ten are fresh and internally unique.
- Parsed all manifest-listed recipe JSON and counted ingredient rows; found 114 files, 1,123 rows, and no term hits in files or ingredient rows.
- Static picker projection follows the checked-in phrase-first/partial search implementation. No app, Gradle, instrumentation, or emulator tests were run because this is a research proposal for catalog data only.
- This file is UTF-8 without BOM. No source, catalog, ledger, generated output, plan, roadmap, or unrelated dirty file was changed.

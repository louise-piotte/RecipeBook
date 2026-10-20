# WP02 Section 04 B2 — canary seed flour identity review (R185, 2026-10-16)

- **Open checklist fit:** The Section 04 B alternative-flour checklist remains open. The Section F R63 canary-seed-groats review explicitly left flour as a separate product for later review; this proposal addresses that distinct, previously unreviewed B2 flour identity.
- **Candidate:** human-food whole-grain flour milled from glabrous, dehulled *Phalaris canariensis* seed.
- **Recommendation:** add one identity-only `FLOUR_AND_STARCH` reference for **canary seed flour / farine de graines d’alpiste des Canaries**. Keep the French display descriptive and provisional for Québec; the review found no Québec retail flour label or OQLF flour headword.
- **Proposed reference ID:** `ingredient-ref-canary-seed-flour`.
- **Proposal-local source-ID prefix:** `WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S` (S01–S04). The prefix and candidate ID are unallocated in the current catalog, ledger, legacy file, and proposal/batch archive.
- **Scope:** flour from the approved food-grade, hairless/glabrous brown or yellow canary-seed varieties, with the seed dehulled before milling. Exclude ordinary hairy bird-feed seed. Keep groats, flakes, meal, extracted starch, and treatment/particle-size variants distinct unless separately reviewed.

## Evidence and product boundary

Health Canada’s bilingual novel-food pages limit human-food use to glabrous brown or yellow canary seed and describe the dehulled grain as a whole-grain flour or other milled product. The French page also requires a wheat-allergy warning for products containing canary seed; this review makes no gluten-free or allergy-safety claim. The Canadian Grain Commission and Alpiste Canada distinguish flour from groats and flakes, and Alpiste Canada describes whole-grain flour produced by roller milling. These sources support a milled flour identity separate from the existing `ingredient-ref-canary-seed-groats` row. [WP03-CANARY-SEED-GROATS-R63-20261013-S01–S05]

Current Canadian evidence includes a product page for ALPISTE™ Flour that names a finely milled food-grade product made from Canadian-grown glabrous seed and identifies a 240 g package; the page was marked **sold out** when checked. Alpiste Canada’s supplier directory describes Canadian companies as currently supplying canary-seed products and lists an InfraReady Products flour/meal offering in Saskatoon, Saskatchewan. These establish a Canadian flour product family and supplier listing, not current retail stock in Québec. The product directory’s `raw or pre-cooked` and Alpiste Canada’s heat-treated/different-texture descriptions are process-specific variants, not enough to define general ingredient forms. [S01–S02; reused WP03-CANARY-SEED-GROATS-R63-20261013-S05]

## Bilingual wording

The OQLF GDT supports **alpiste des Canaries** as the Québec French botanical name for *Phalaris canariensis*; its entry is botanical, not a flour-product term. Santé Canada’s French page uses **graine d’alpiste des Canaries** for the crop and **farine complète / farine de grains entiers** for the approved dehulled-seed flour use. The proposed **farine de graines d’alpiste des Canaries** combines the locally supported species name with the source-supported product class in a clear, qualified phrase. It is a descriptive display, not an OQLF headword or a quoted Québec package label. Keep `aliasesFr` empty until a Québec flour label or stronger product-specific terminology source supports an alternate. [reused WP03-CANARY-SEED-GROATS-R63-20261013-S02, S04]

Keep **alpiste flour** as the sole English alias because it is the exact flour heading used by the Canadian producer. Do not add bare `alpiste`, `canary`, `canary grass`, `bird seed`, `canary meal`, or broad whole-grain-flour terms as aliases. The French display already includes the qualified OQLF species phrase; the English display already supplies `canary seed flour`.

## Ownership, taxonomy, and picker behavior

The read-only current snapshot contains **1,563 ingredient references, 122 forms, 61 legacy-import candidates, and 1,908 research-ledger records**. Exact ID, normalized phrase, and source-prefix checks found no flour owner in active references, forms, legacy candidates, or the ledger. The only active canary/alpiste identity is `ingredient-ref-canary-seed-groats` (`canary seed groats / grains mondés d’alpiste des Canaries`, `GRAIN_AND_CEREAL`). Its aliases are empty, density is null, unit mappings are empty, and it has no attached forms. The R63 groats record and all its data remain unchanged.

The proposed flour belongs in `FLOUR_AND_STARCH`; milling creates a distinct food product and is not a preparation form of groats. The candidate name, proposed French display, and `alpiste flour` alias have no exact normalized owner. Picker projections using the current `IngredientReferenceSearchIndex` phrase-first / substring-fallback behavior are:

| Query | Current result | With proposal | Assessment |
|---|---|---|---|
| `canary seed flour` | none | canary seed flour | Qualified English product query is specific. |
| `alpiste flour` | none | canary seed flour | Exact producer wording resolves to the flour. |
| `farine de graines d’alpiste des Canaries` | none | farine de graines d’alpiste des Canaries | Qualified French display resolves to the flour. |
| `canary seed` / `canary` | canary seed groats | canary seed groats; canary seed flour | Broad query displays both distinct products. |
| `alpiste` | canary seed groats | canary seed groats; canary seed flour | Broad species term displays both food-grade products. |
| `farine de graines` | three seed-flour references | those three plus canary seed flour | Already a multi-result phrase; the new qualified row does not make it a singleton. |
| `canary flour` | none | none | No unqualified alias is added. |

The new row therefore broadens only the short seed/species queries to show both related products. Keep the product-qualified names so users can select flour or groats deliberately. Do not transfer the bird-feed interpretation to either row.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across serialized recipe content for canary seed flour, canary flour, alpiste flour, *Phalaris canariensis*, and the proposed French wording. No recipe file or ingredient row matched. There is no bundled recipe link, measurement, or substitution demand to attach.

## Measures, density, and substitutions

- **Household measures:** No reviewed product or study source supplies a flour-specific cup/spoon mass with a household packing method. ALPISTE™’s 240 g package is a retail package size, not a recipe measure.
- **Density:** A 2025 study reports approximate bulk density of **about 0.6 g/mL** for its hydrothermally treated canary-seed flour and states that treatment did not change the reported value. The abstract does not expose the detailed bulk-density procedure or a household filling convention, and the flour treatment, sample, and particle size are research-specific. Record this as one study-only bulk-density observation if accepted; keep `defaultDensity` null and `unitMappings` empty. Do not turn 0.6 g/mL into a cup conversion. [S03]
- **Substitutions:** A Canadian research review reports formula-specific trials, including 25% canary-seed flour in commercial pan bread and 35% or 50% in tortillas. The tested formulas and processing conditions do not establish a universal home-recipe replacement ratio. Keep substitution research blocked pending recipe- and method-scoped evidence; add no global or contextual rule. Health Canada’s whole-seed sesame-use discussion does not apply to flour. [S04; reused WP03-CANARY-SEED-GROATS-R63-20261013-S01–S02]
- **Forms, yields, and conversions:** Add none. Do not promote raw/pre-cooked or heat-treated/texture product variants to general forms; no flour yield from groats or cooking yield is supported.

## Proposed ingredient-reference row

If accepted, add this row and no other reference/form/mapping data:

```json
{
  "id": "ingredient-ref-canary-seed-flour",
  "nameFr": "farine de graines d’alpiste des Canaries",
  "nameEn": "canary seed flour",
  "aliasesFr": [],
  "aliasesEn": ["alpiste flour"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

## Proposed research-ledger mapping

If accepted, append this `ingredient_reference` record. Reused R63 source IDs retain their existing single-URL ownership; the four R185 source IDs below are new and each maps to exactly one URL. The observation keeps the 2025 research value out of the active catalog. The blocked substitution finding documents formulation-specific evidence without encoding it as a reusable ratio.

```json
{
  "recordId": "ingredient-ref-canary-seed-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "blocked_pending_evidence",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S01",
      "url": "https://www.alpisteseeds.ca/products/alpiste-flour",
      "title": "ALPISTE Seeds, ALPISTE Flour",
      "accessedOn": "2026-10-16",
      "locator": "Product title and description; Canadian-grown food-grade flour, glabrous source, 240 g package, and stock status.",
      "supports": "Names a finely milled Canadian-grown human-food canary-seed flour from glabrous seed and a 240 g package. The listing was sold out at review. Package mass is not a kitchen measure or proof of current Québec retail availability.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S02",
      "url": "https://www.alpistecanada.ca/alpistesuppliers",
      "title": "Alpiste Canada, Alpiste Suppliers",
      "accessedOn": "2026-10-16",
      "locator": "InfraReady Products (1998) Ltd. supplier entry, Saskatoon, Saskatchewan.",
      "supports": "The supplier directory describes Canadian companies as currently supplying alpiste products and lists InfraReady as offering alpiste/canary-seed flour and meal, raw or pre-cooked. This supports a Canadian supplier/product-family boundary, not Québec retail stock, a retail package, or standardized ingredient forms.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S03",
      "url": "https://www.sciencedirect.com/science/article/pii/S2772753X25001108",
      "title": "Malunga et al., Exploration of the functional properties of hydrothermally treated Canary seed (Phalaris canariensis L.) flour for food applications, Food Chemistry Advances 7 (2025), 100994",
      "versionOrDate": "2025-06",
      "accessedOn": "2026-10-16",
      "locator": "Abstract: four hairless-seed samples were dehulled, steamed, dried, and milled; approximate bulk density result.",
      "supports": "Reports hydrothermally treated canary-seed flour bulk density of approximately 0.6 g/mL and states hydrothermal treatment did not change that value. The accessible abstract does not give the detailed density protocol or a household scoop convention; this is a study sample, not a retail default.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S04",
      "url": "https://www.cerealsgrains.org/publications/plexus/cfw/pastissues/2018/protectedpdfs/CFW-2018-5.pdf",
      "title": "Patterson et al., Glabrous Canary Seed: A Novel Food Ingredient, Cereal Foods World 63(5), 2018",
      "versionOrDate": "2018; DOI 10.1094/CFW-63-5-0194",
      "accessedOn": "2026-10-16",
      "locator": "Canadian product and food-use overview; flour trial descriptions for commercial pan bread and tortillas.",
      "supports": "Supports human-food flour from glabrous Canadian canary seed and describes formula-specific trials, including 25% replacement in a commercial pan-bread formula and 35%/50% in tortilla formulas. These are not a universal home-recipe replacement rule or active substitution ratio.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-CANARY-SEED-GROATS-R63-20261013-S01",
      "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/approved-products/glabrous-canary-seed-phalaris-canariensis.html",
      "title": "Health Canada, Glabrous canary seed (Phalaris canariensis L.)",
      "accessedOn": "2026-10-16",
      "locator": "Human-food assessment, flour/milled product uses, and wheat-allergy label caution.",
      "supports": "Limits the human-food assessment to glabrous brown/yellow varieties and describes dehulled grain as whole-grain flour or other milled products. Preserves a wheat-allergy label caution; does not establish a flour measure, density, or gluten/allergy claim for this catalog row.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-CANARY-SEED-GROATS-R63-20261013-S02",
      "url": "https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/produits-approuves/graine-alpiste-canaries-glabre-phalaris-canariensis.html",
      "title": "Santé Canada, La graine d’alpiste des Canaries glabre (Phalaris canariensis L.)",
      "accessedOn": "2026-10-16",
      "locator": "French human-food scope and terms for dehulled grain/flour; wheat-allergy label caution.",
      "supports": "Uses graine d’alpiste des Canaries for the species and farine complète / farine de grains entiers for flour use of dehulled glabrous seeds. Supports the descriptive French display components, not an exact Québec retail label or OQLF flour headword.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-CANARY-SEED-GROATS-R63-20261013-S03",
      "url": "https://grainscanada.gc.ca/fr/recherche-donnees/rapports-scientifiques/canaris/",
      "title": "Canadian Grain Commission, La graine à canaris : une céréale nouvelle développée dans les Prairies canadiennes",
      "versionOrDate": "2021-02-01",
      "accessedOn": "2026-10-16",
      "locator": "Food-ingredient discussion of groats, flour, and flakes.",
      "supports": "Describes dehulled food-grade seed and distinguishes flour and flakes from groats. It is a technical Canadian report, not a current Québec package label or household-measure source.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-CANARY-SEED-GROATS-R63-20261013-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17498891/alpiste-des-canaries",
      "title": "Office québécois de la langue française, alpiste des Canaries (GDT)",
      "accessedOn": "2026-10-16",
      "locator": "Botanical term and species definition for Phalaris canariensis.",
      "supports": "Supports alpiste des Canaries as the Québec French botanical name. It does not define an edible seed or flour product.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-CANARY-SEED-GROATS-R63-20261013-S05",
      "url": "https://www.alpistecanada.ca/products",
      "title": "Alpiste Canada, Alpiste Products",
      "accessedOn": "2026-10-16",
      "locator": "ALPISTE FLOUR heading, roller-milling description, flour grades/uses, and groat/flour distinction.",
      "supports": "A Canadian producer names Alpiste Flour, describes whole-grain flour made by roller milling, and notes heat-treated flours with different textures. Supports the flour identity and the exact English alias alpiste flour, not Québec French wording, a kitchen measure, or generic forms.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S03-bulk-density",
      "relationship": "bulk_density",
      "value": 0.6,
      "valueUnit": "g/mL",
      "foodDescription": "Canary-seed whole-grain flour made from dehulled hairless Phalaris canariensis seed, study sample.",
      "foodState": "Hydrothermally treated study flour; abstract describes seed samples as dehulled, steamed, dried, and milled.",
      "measurementMethod": "The paper abstract reports approximate bulk density of about 0.6 g/mL; its detailed bulk-density procedure is not available in the accessible abstract.",
      "quantityBasis": "Study-specific powder bulk density only; not a household cup measure, a raw-flour value, or a default for unspecified retail flour.",
      "evidenceKind": "measured",
      "sourceIds": ["WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S03"]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-general-flour-replacement",
      "researchState": "blocked_pending_evidence",
      "context": "Replacing wheat flour or another flour in general home recipes.",
      "basis": "The Canadian research review reports recipe-specific trials, including 25% canary-seed flour in a commercial pan-bread formula and 35% or 50% in tortilla formulas. Those formulas do not establish one transferable ratio or adjustment for arbitrary home recipes.",
      "limitations": [
        "Keep the published trial ratios attached to their named formulas; do not use them as a general replacement rule.",
        "The whole-seed sesame-use discussion does not apply to flour.",
        "No global or contextual substitution rule is supported for the active catalog."
      ],
      "sourceIds": ["WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S04", "WP03-CANARY-SEED-GROATS-R63-20261013-S01"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only canary seed flour / farine de graines d’alpiste des Canaries in FLOUR_AND_STARCH for whole-grain flour milled from glabrous, dehulled brown or yellow Phalaris canariensis intended for human food. Keep it separate from canary seed groats, flakes, meal, bird-feed seed, and extracted starch. The French display is descriptive and provisional for Québec; no Québec flour package name was found. Preserve Health Canada’s wheat-allergy caution without adding a gluten or allergy-safety claim. Keep the approximately 0.6 g/mL hydrothermal-study bulk-density result in the ledger only, with no default density or unit mapping; keep formula-specific flour trials out of active substitutions. Add no forms, yields, conversions, or recipe links.",
      "sourceIds": [
        "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S01",
        "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S02",
        "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S03",
        "WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S04",
        "WP03-CANARY-SEED-GROATS-R63-20261013-S01",
        "WP03-CANARY-SEED-GROATS-R63-20261013-S02",
        "WP03-CANARY-SEED-GROATS-R63-20261013-S03",
        "WP03-CANARY-SEED-GROATS-R63-20261013-S04",
        "WP03-CANARY-SEED-GROATS-R63-20261013-S05"
      ]
    }
  ]
}
```

## Reopen conditions

- Revisit the French display if a current Québec flour package, bilingual Québec retailer page, or product-specific OQLF terminology source establishes a preferred name.
- Revisit density or unit mappings only with a flour-specific mass/volume source that describes the product treatment, grind, and household fill/packing method. Do not promote the study bulk-density result to a default by itself.
- Revisit substitutions only with evidence that defines the recipe class, flour being replaced, ratio, preparation method, and any required liquid/process adjustments; preserve source-specific trials as observations unless they support a scoped rule.
- Revisit forms or a separate meal identity if Canadian consumer products define stable raw, pre-cooked, heat-treated, texture, or meal classes and Québec wording identifies those classes clearly.

## Sources checked 2026-10-16

Each source ID below maps to one URL. R185 IDs are new and unallocated. R63 IDs are reused as already registered, not reallocated.

| Source ID | Source and URL | Evidence boundary |
|---|---|---|
| **WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S01** | ALPISTE Seeds, [ALPISTE Flour](https://www.alpisteseeds.ca/products/alpiste-flour) | Canadian-grown, finely milled human-food flour from glabrous canary seed; page shows a 240 g package and was sold out at review. No household measure or Québec stock is established. |
| **WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S02** | Alpiste Canada, [Alpiste Suppliers](https://www.alpistecanada.ca/alpistesuppliers) | Current directory says Canadian companies supply alpiste and lists an InfraReady flour/meal offer in Saskatoon, raw or pre-cooked. Self-reported supplier directory, not Québec retail inventory or a form standard. |
| **WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S03** | Malunga et al., [Exploration of the functional properties of hydrothermally treated Canary seed flour](https://www.sciencedirect.com/science/article/pii/S2772753X25001108), Food Chemistry Advances 7 (2025), 100994 | Reports approximately 0.6 g/mL bulk density for hydrothermally treated study flour; accessible abstract does not expose its detailed bulk-density method or household packing convention. |
| **WP02-B2-CANARY-SEED-FLOUR-R185-20261016-S04** | Patterson et al., [Glabrous Canary Seed: A Novel Food Ingredient](https://www.cerealsgrains.org/publications/plexus/cfw/pastissues/2018/protectedpdfs/CFW-2018-5.pdf), Cereal Foods World 63(5) (2018), DOI 10.1094/CFW-63-5-0194 | Canadian human-food overview and formula-specific commercial pan-bread/tortilla trials; not a universal home-recipe replacement guide. |
| **WP03-CANARY-SEED-GROATS-R63-20261013-S01** (reused) | Health Canada, [Glabrous canary seed](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/approved-products/glabrous-canary-seed-phalaris-canariensis.html) | Human-food boundary, flour/milled products, and wheat-allergy caution. |
| **WP03-CANARY-SEED-GROATS-R63-20261013-S02** (reused) | Santé Canada, [La graine d’alpiste des Canaries glabre](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/produits-approuves/graine-alpiste-canaries-glabre-phalaris-canariensis.html) | French species and flour terms, dehulled-seed boundary, and wheat-allergy caution. |
| **WP03-CANARY-SEED-GROATS-R63-20261013-S03** (reused) | Canadian Grain Commission, [La graine à canaris : une céréale nouvelle développée dans les Prairies canadiennes](https://grainscanada.gc.ca/fr/recherche-donnees/rapports-scientifiques/canaris/) | Canadian technical distinction among groats, flour, and flakes; no kitchen measure. |
| **WP03-CANARY-SEED-GROATS-R63-20261013-S04** (reused) | OQLF, [alpiste des Canaries (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17498891/alpiste-des-canaries) | Québec French botanical name for the species; not a food-flour term. |
| **WP03-CANARY-SEED-GROATS-R63-20261013-S05** (reused) | Alpiste Canada, [Alpiste Products](https://www.alpistecanada.ca/products) | Canadian producer’s flour heading, whole-grain roller-milling process, and flour/groat distinction; no Québec French label or reusable measure. |

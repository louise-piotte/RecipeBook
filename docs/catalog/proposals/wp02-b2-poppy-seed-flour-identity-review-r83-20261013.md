# WP02 B2 poppy-seed flour identity review — R83

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. This review writes no shared catalog, forms, ledger, checklist, roadmap, generated, or application files.
- **Open checklist item:** Section 04, B2, line 1832: almond flour versus meal and the named alternative flours in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1832). Poppy-seed flour is an additional seed-derived product gap within that still-open coverage.
- **Candidate:** Marketed defatted poppy-seed press-cake flour. Proposed display: **defatted poppy seed flour / farine de pavot déshuilée**.
- **Snapshot:** The current live package contains 1,409 ingredient references and 104 forms; the ledger has 1,748 records and the legacy-import file has 63 candidates. The manifest lists 114 bundled recipes with 1,123 ingredient rows.
- **Archive and collision audit:** The active catalog and archive have no poppy-flour owner, form, legacy candidate, or flour-specific ledger record. Exact searches for poppy seed flour, defatted poppy seed flour, poppy flour, poppy seed meal, farine de pavot, tourteau de graines de pavot, the proposed reference ID, and this proposal's source-ID prefix found no earlier focused WP02 flour decision. The earlier [WP03 seed review](wp03-flax-hemp-poppy-seed-gap-review-20261010.md) covers culinary poppy seeds; the [WP03 paste review](wp03-nut-seed-paste-product-gap-review-20261010.md) covers poppy-seed filling. Neither reviews a press-cake flour identity. The [WP02 flax-meal review](wp02-b2-flax-meal-process-boundary-review-20261012.md) addresses flax only.

## Recommendation

**Integrate one identity-only FLOUR_AND_STARCH reference** for defatted poppy-seed flour, with no aliases, forms, recipe links, measures, density, conversion, yield, or substitution data.

The boundary is a marketed food flour made by pressing poppy seeds for oil, then drying and grinding the residual cake. Adal Terra sells a named French-language food product, describes it as delicately de-oiled, identifies poppy-seed cake as its ingredient, and gives bread and pastry uses. Proper Foods separately lists defatted poppy-seed protein flour and describes the oil-pressing, drying, and grinding process. These are actual food-ingredient/product sources, not an inference from the existence of whole seeds or oil cake alone. [S01–S02]

The row represents the defatted press-cake flour product class. It is a distinct ingredient identity, not an alias or reversible form of whole poppy seeds: pressing removes oil and the residual cake is milled into a baking ingredient. Keep plain ground whole seeds, oil, and composite poppy filling outside the row. Research flour samples and the maker's particular seed colors or press settings do not establish additional catalog identities. [S01–S04]

The Québec naming evidence has a clear limit. OQLF supports the food-seed term **graine de pavot**, its English equivalent **poppy seed**, and *Papaver somniferum*; it does not name flour. A Canadian French Club House label uses **Graines de pavot** for whole seeds only. Adal Terra's French product page attests **farine de pavot** and says it is déshuilée, but it is a French seller page, not a Québec or Canadian product label. Use **farine de pavot déshuilée** as a transparent, provisional Québec display, not as an OQLF-approved compound or evidence of a Canadian retail product. [S01, S05–S06]

Current Canadian and Québec source checks did not locate a standalone poppy-seed flour package or product listing. This is a limit of the reviewed sources, not proof that none is sold in Canada. The French product source plus OQLF's base seed term support a provisional bilingual catalog row; they do not establish Québec availability. Keep the English display qualified as defatted so the picker does not suggest that evidence covers every possible whole-seed grind.

## Identity and product boundaries

| Product or phrase | Decision | Evidence boundary |
|---|---|---|
| Defatted poppy-seed flour | Add one identity-only flour reference. | Actual French food-product listing and an independent ingredient supplier identify poppy-seed flour made from oil-press residue for food applications. This row is limited to that defatted press-cake product class. [S01–S02] |
| Poppy seeds / graines de pavot | Preserve the existing seed reference. | OQLF's culinary-seed entry and the Canadian French whole-seed package label do not describe flour. [S05–S06] |
| Plain ground poppy seeds, poppy seed meal, or full-fat seed flour | Do not assign these terms to the new row. | Grinding whole seeds without oil extraction could produce a different fat level and baking behavior. No source reviewed establishes these names as synonyms of the press-cake flour. [S01–S04] |
| Poppy-seed press cake / tourteau de graines de pavot | Treat as the documented production intermediate, not as a second finished ingredient row. | Adal Terra lists press cake as the flour's ingredient; Proper Foods describes the oil residue being dried and ground. The reviewed product pages do not establish a separate household-use cake product with recipe demand. [S01–S02] |
| Poppy-seed oil | Keep separate from both flour and seeds. | Oil is expressed during the process that produces the flour's press-cake material. Do not alias or model the oil as a form of the flour. [S01–S04] |
| Poppy-seed filling | Preserve the existing composite baking-product reference. | The current catalog already owns filling separately from whole seeds. Filling is not plain flour or press cake. |
| Poppy plant, poppy flower, coquelicot, or botanical poppy | Do not add aliases. | OQLF's food entry is specifically the seed used for human food; it does not make plant or flower terms food-flour synonyms. [S05] |
| White-, yellow-, or blue-seed press-cake flour | Keep as research sample variation, not separate identities. | The ACS study compares experimental press-cake samples by seed color; it does not establish consumer product boundaries or standard recipes for these colors. [S03] |

The proposed ID is ingredient-ref-defatted-poppy-seed-flour. No identifier collision or same-purpose row was found.

## Québec French and product market boundary

The displayed French wording retains the French seller's product phrase **farine de pavot**, with the explicitly stated processing qualifier **déshuilée**. OQLF independently supports **graine de pavot** as the Québec food/spice term and identifies the common culinary species *Papaver somniferum*. The full flour compound is not in that GDT entry, and the Canadian product page reviewed is for whole seeds. Accordingly, the FR display is useful and transparent, but provisional for Québec. Keep aliasesFr empty and do not describe it as a Québec label. [S01, S05–S06]

The flour product page and supplier page are outside Canada. No Canadian standalone flour package, Québec maker listing, or Canadian bilingual package was found in the checked sources. The proposal therefore supports a scoped food-product identity with a provisional French display; it does not claim local retail availability or French-language market standardization.

## Current ownership and picker boundary

The audit covered the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [research ledger](../research-ledger.v1.json), [legacy-import identities](../legacy-import-identities.v1.json), the complete bundled recipe corpus, and the WP02/WP03 proposal and batch archive.

| Current owner | Stored names and aliases | Scope |
|---|---|---|
| ingredient-ref-poppy-seeds | poppy seeds / graines de pavot; EN alias poppy seed; FR alias graine de pavot | Whole culinary seed; NUT_SEED_AND_DRIED_FRUIT; no form, density, or unit mapping. |
| ingredient-ref-poppy-seed-filling | poppy seed filling / garniture aux graines de pavot; FR alias garniture de graines de pavot | Composite baking product; BAKING_MIXIN_AND_PANTRY; no form, density, or unit mapping. |

No current form belongs to either row. No flour-specific record exists in the ledger or 63 legacy candidates. The proposed name contains the contiguous English phrase poppy seed flour and French phrase farine de pavot, so no alias is required.

Picker projections follow the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which normalizes accents and punctuation and returns complete contiguous word-phrase matches before partial matches. The table is a static projection over the current catalog plus the proposed row, not a UI test.

| Query | Current result IDs | Projected result IDs | Boundary |
|---|---|---|---|
| poppy seed flour | none | ingredient-ref-defatted-poppy-seed-flour | Exact product query resolves to the new qualified display only. |
| defatted poppy seed flour | none | ingredient-ref-defatted-poppy-seed-flour | Qualified English name is unique. |
| farine de pavot / farine de pavot déshuilée | none | ingredient-ref-defatted-poppy-seed-flour | Provisional French product phrase resolves to the new row only. |
| poppy seed | ingredient-ref-poppy-seed-filling; ingredient-ref-poppy-seeds | those two plus ingredient-ref-defatted-poppy-seed-flour | Broad seed-family query surfaces the seed, filling, and flour options. This breadth is intentional and does not make the products equivalent. |
| poppy / pavot | ingredient-ref-poppy-seed-filling; ingredient-ref-poppy-seeds | those two plus ingredient-ref-defatted-poppy-seed-flour | Broad family terms show the related options. |
| poppy seeds / graines de pavot | ingredient-ref-poppy-seeds; for French, also ingredient-ref-poppy-seed-filling | unchanged | Exact plural seed wording does not resolve to flour. |
| graine de pavot | ingredient-ref-poppy-seeds | unchanged | OQLF's singular seed term stays on the existing seed row. |
| poppy seed filling | ingredient-ref-poppy-seed-filling | unchanged | Exact composite-product phrase remains unique. |
| poppy flour; poppy seed meal; farine de graines de pavot; tourteau de graines de pavot | none | none | Do not activate broader, ground-seed, or intermediate-process phrases as aliases. |

The broad query results are acceptable because the visible display identifies each result as seed, filling, or defatted flour, while exact product phrases remain bounded. If later sources establish a distinct full-fat flour, add and project that identity separately instead of broadening this row.

## Bundled recipe demand

The manifest lists 114 recipes and 1,123 ingredient rows. A scan of the complete recipe JSON and ingredient rows for poppy-seed flour, defatted poppy flour, poppy flour, poppy seed meal, farine de pavot, farine de graines de pavot, and poppy-seed press-cake phrases found zero candidate mentions and zero ingredient-row hits. No recipe link, line change, or recipe-driven substitution is proposed.

## Forms, numeric evidence, and substitution limits

- **Forms:** Add none. This row identifies a finished food flour product. Do not attach it as a seed form or add sample-specific variants for press type, seed color, or grinding.
- **Package quantity:** Adal Terra lists a 500 g package. That is one product's package mass, not a serving, cup measure, unit mapping, density, or universal package yield. [S01]
- **Single-product composition:** Adal Terra's nutrition panel is for that 500 g seller SKU. Its per-100 g label values are not a general standard for all poppy-seed flour. [S01]
- **Research composition:** The 2026 ACS study reports cold-pressed press-cake samples with 9.72–10.59% residual fat, 33.70–37.45% protein, and 7.25–7.45% moisture. These are sample ranges for the study's white, yellow, and blue seed materials, not catalog defaults or universal specifications. The article says additional safety and food-matrix evaluation is needed, including residual alkaloid and antinutritional-factor assessment; it does not establish general approval or safety for arbitrary poppy flour. [S03]
- **Process variation:** The 2022 study explains that press method can change oil removal and resulting cake fat content. It evaluates press cake as a potential food ingredient, not a standardized consumer flour or household measure. [S04]
- **Density, volume, conversion, and yield:** No source gives a reusable mass-per-volume value, grams-per-cup measure, milling yield, or cooked yield for this bounded ingredient. Add none.
- **Substitution:** Food-use sources describe baking applications but do not establish a transferable replacement ratio. Do not substitute this flour for whole seeds, ordinary flour, or full-fat ground seeds by rule. Add no substitution finding or recipe link.

## Exact future JSON delta

Add one ingredient reference:

    {
      "id": "ingredient-ref-defatted-poppy-seed-flour",
      "nameEn": "defatted poppy seed flour",
      "nameFr": "farine de pavot déshuilée",
      "aliasesEn": [],
      "aliasesFr": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-13T00:00:00Z",
      "category": "FLOUR_AND_STARCH"
    }

Add this ledger record. It records the accepted identity and the reviewed limits, with no measurement observations or substitution findings:

    {
      "recordId": "ingredient-ref-defatted-poppy-seed-flour",
      "recordType": "ingredient_reference",
      "identityState": "verified",
      "measurementState": "researched_no_supported_value",
      "substitutionResearchState": "researched_no_supported_substitute",
      "sources": [
        {
          "sourceId": "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S01",
          "url": "https://adalterra.bio/farines/262-567-farine-bio-de-pavot.html",
          "title": "Adal Terra, Farine bio de pavot",
          "accessedOn": "2026-10-13",
          "locator": "Product description, ingredient declaration, package size, food uses, and nutrition panel.",
          "supports": "French seller markets a 500 g food flour described as delicately de-oiled, made from poppy-seed press cake, and suitable for bread and pastry. This is not a Québec or Canadian product label.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S02",
          "url": "https://www.properfoodsgroup.com/nut-seed-flours",
          "title": "Proper Foods ApS, Defatted Nut & Seed Protein Flours",
          "accessedOn": "2026-10-13",
          "locator": "Process description and product list entry POPPY SEED, DEFATTED, PROTEIN FLOUR.",
          "supports": "Ingredient supplier identifies defatted poppy-seed protein flour as a food ingredient. It describes oil pressing, then drying and grinding the residual material, with baking and other food applications. The supplier is Danish and does not establish Canadian availability.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S03",
          "url": "https://doi.org/10.1021/acsomega.6c09692",
          "title": "ACS Omega, Nutritional, Phytochemical, and Antioxidant Profiling of Cold-Pressed Oils and Press-Cake Byproducts from White, Yellow, and Blue Poppy (Papaver somniferum L.) Seeds",
          "versionOrDate": "2026-09-30",
          "accessedOn": "2026-10-13",
          "locator": "Study methods, proximate composition results, and conclusions on press-cake flours.",
          "supports": "Primary research characterizes sample-specific cold-pressed poppy-seed press-cake flours. Reports residual fat 9.72–10.59%, protein 33.70–37.45%, and moisture 7.25–7.45%; identifies further safety and food-matrix evaluation as needed.",
          "sourceKind": "food_composition"
        },
        {
          "sourceId": "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S04",
          "url": "https://pmc.ncbi.nlm.nih.gov/articles/PMC9562219/",
          "title": "Melo et al., Nutritional and Chemical Characterization of Poppy Seeds, Cold-Pressed Oil, and Cake: Poppy Cake as a High-Fibre and High-Protein Ingredient for Novel Food Production",
          "versionOrDate": "2022",
          "accessedOn": "2026-10-13",
          "locator": "Pressing methods and description of poppy cake as a partially defatted food-ingredient candidate.",
          "supports": "Primary research describes press cake as the residual product after cold pressing, notes that press method can change residual fat, and evaluates the cake as a potential food ingredient. It does not provide a reusable consumer-flour measure or standardized flour specification.",
          "sourceKind": "food_composition"
        },
        {
          "sourceId": "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S05",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095300/graine-de-pavot",
          "title": "Office québécois de la langue française, graine de pavot (GDT)",
          "accessedOn": "2026-10-13",
          "locator": "Food/spice domain, preferred French term, English equivalent, Latin name, and human-food note.",
          "supports": "Supports graine de pavot / poppy seed for culinary human food and gives Papaver somniferum. It does not name a flour product or approve the proposed French compound.",
          "sourceKind": "regional_authority"
        },
        {
          "sourceId": "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S06",
          "url": "https://www.clubhouseforchefs.ca/fr-ca/produits/club-house/graines-de-pavot-640-g",
          "title": "Club House pour les chefs, Graines de pavot 640 g",
          "accessedOn": "2026-10-13",
          "locator": "French Canadian product name, ingredient declaration, and product details.",
          "supports": "Canadian French whole-seed product label uses Graines de pavot and describes culinary uses. It supports the base seed wording only, not a flour name.",
          "sourceKind": "manufacturer"
        }
      ],
      "decisions": [
        {
          "outcome": "accepted",
          "reason": "Add one identity-only defatted poppy seed flour / farine de pavot déshuilée reference. The English qualifier bounds the supported press-cake product class; the French display is a transparent provisional Québec description, not a Québec package label or OQLF flour term. Keep both alias arrays empty, add no forms, measures, density, conversions, yields, recipe links, or substitutions, and keep whole seeds, oil, and filling separate.",
          "sourceIds": [
            "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S01",
            "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S02",
            "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S03",
            "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S04",
            "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S05",
            "WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S06"
          ]
        }
      ]
    }

The eventual integration delta is limited to the new ingredient-reference JSON row and matching research-ledger record shown above. It adds no app logic, form, recipe, generated code, or runtime behavior outside the data-driven picker. Under the current AGENTS.md rule, a change that only adds database JSON data needs no app tests; this proposal review itself runs no tests or emulator.

## Source register

All sources were checked on 2026-10-13. Source IDs are local to this proposal and are not yet in the shared ledger.

| ID | Source and direct support | Limits |
|---|---|---|
| **WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S01** | Adal Terra, [Farine bio de pavot](https://adalterra.bio/farines/262-567-farine-bio-de-pavot.html). Current French-language product page; names the human-food flour, calls it delicately de-oiled, identifies poppy-seed cake as the ingredient, gives bread/pastry uses, lists a 500 g package, and provides one seller SKU's nutrition panel. | French seller, not a Québec/Canadian package or proof of Canadian availability. Product values are SKU-specific. |
| **WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S02** | Proper Foods ApS, [Defatted Nut & Seed Protein Flours](https://www.properfoodsgroup.com/nut-seed-flours). Supplier lists poppy-seed defatted protein flour and describes pressing, drying, grinding, and food applications. | Danish B2B source; it does not establish a Canadian retail product or a universal fat-removal specification. |
| **WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S03** | ACS Omega, [Nutritional, Phytochemical, and Antioxidant Profiling of Cold-Pressed Oils and Press-Cake Byproducts from White, Yellow, and Blue Poppy Seeds](https://doi.org/10.1021/acsomega.6c09692), 2026-09-30. Primary research identifies *Papaver somniferum* press-cake flour samples and reports the bounded composition ranges above. | Experimental samples only. Composition is not a household measure, density, general product specification, safety clearance, or demonstrated recipe replacement. The article calls for further safety and food-matrix evaluation. |
| **WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S04** | Melo et al., [Nutritional and Chemical Characterization of Poppy Seeds, Cold-Pressed Oil, and Cake](https://pmc.ncbi.nlm.nih.gov/articles/PMC9562219/), 2022. Primary study describes cold-pressed cake as partially defatted and discusses press-method differences. | Research cake preparation and potential food ingredient; it is not a standard consumer flour, Québec label, or reusable quantity source. |
| **WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S05** | OQLF, [graine de pavot (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095300/graine-de-pavot). Québec terminology for the culinary seed, English equivalent, and Latin name. | Names the seed, not flour. Does not attest farine de pavot déshuilée. |
| **WP02-B2-POPPY-SEED-FLOUR-R83-20261013-S06** | Club House pour les chefs, [Graines de pavot 640 g](https://www.clubhouseforchefs.ca/fr-ca/produits/club-house/graines-de-pavot-640-g). Canadian French manufacturer product label for whole poppy seeds and culinary uses. | This is a whole-seed SKU, not flour; its package size and nutritional panel do not transfer to flour. |

## Static review record

- Re-read AGENTS.md, the live Section 04 B2 line, references, forms, ledger, legacy candidates, relevant proposals and batches, and current IngredientSearch.kt.
- Confirmed snapshot counts of 1,409 references, 104 forms, 1,748 ledger records, 63 legacy candidates, 114 recipe files, and 1,123 ingredient rows.
- Searched candidate names, French terms, proposed ID, and R83 source-ID prefix across the catalog, forms, legacy identities, ledger, proposal/batch archive, and recipe corpus; found no duplicate flour owner or review.
- Projected exact and broad English/French queries using the current phrase-first matcher. Confirmed exact whole-seed and filling queries stay on their existing rows.
- Rechecked the product, supplier, research, OQLF, and Canadian French whole-seed sources. Kept the missing Canadian/Québec flour listing, provisional FR compound, and sample-specific numeric limits explicit.
- Static checks only: UTF-8 without BOM, final newline, no trailing whitespace, JSON snippets parse and match the live schemas, all local Markdown links resolve, HTTPS source links are recorded, source IDs map one-to-one to the source register and JSON ledger block, and proposed IDs/prefix are collision-free.
- No Gradle, instrumentation, emulator, or app tests were run. Only this proposal file is created by this review.


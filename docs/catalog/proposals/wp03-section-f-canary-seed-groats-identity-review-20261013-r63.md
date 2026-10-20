# WP03 Section F — canary-seed groats identity review (R63, 2026-10-13)

## Review record

- **Status:** integrated as an identity-only catalog row and verified research-ledger record. See [`wp03-section-f-canary-seed-groats-identity-integration-20261013`](../batches/wp03-section-f-canary-seed-groats-identity-integration-20261013/README.md).
- **Scope:** dehulled groats from glabrous annual canary seed (*Phalaris canariensis*) intended for human food. Ordinary hairy cultivars sold as bird feed are outside the candidate.
- **Open checklist:** Section F still calls for regionally significant cereal mixes and preprocessed grains ([live plan, line 2681](../../RecipeBook-global-ingredient-catalog-plan.txt#L2681)). This is a new species/product review, separate from the recent rice-cereal and rice-germ decisions.
- **Recommendation:** accept one identity-only `GRAIN_AND_CEREAL` reference for **canary seed groats / grains mondés d’alpiste des Canaries**. Keep aliases, forms, measures, conversions, yields, recipe links, and substitutions empty.
- **Proposal-local source-ID prefix:** `WP03-CANARY-SEED-GROATS-R63-20261013-S` (S01–S05). No shared ledger source IDs are proposed.

## Why this is a distinct open candidate

The Section F cereal/preprocessed-grain checklist remains open. Searches of the active plan, roadmap, focused Section F proposal and batch archives, active reference catalog, forms, legacy candidates, ledger, and bundled recipes found no earlier canary-seed or *Phalaris canariensis* identity decision. The existing corpus includes other cereal grains and seed ingredients but does not allocate this Canadian cereal crop.

Health Canada assesses only glabrous (hairless-hull), dehulled brown and yellow varieties for human food. Its approval names groats and ingredient forms, while the Canadian producer Alpiste Canada separately lists **Whole Alpiste Seed (Groats)** and alpiste flour. These sources support a concrete edible cereal product, not a general row for canary bird feed or every seed sold under the canary-seed name [S01, S02, S05].

## Product boundary

| Neighbor or product | Boundary |
|---|---|
| Traditional hairy canary seed sold for birds | Exclude. Health Canada says the human-food assessment applies to glabrous-hull varieties; ordinary bird-feed cultivars are a different supply and handling scope [S01]. |
| Canary-seed flour | Keep as a separate milled product if reviewed later. Health Canada and Alpiste Canada list flour separately from whole groats [S01, S05]. Do not add flour as an alias or form here. |
| Canary-seed flakes, puffed products, or formulated cereal | Separate processed products. Their production and product identity are not established by the groat sources [S03, S05]. |
| Sesame seeds | Do not merge or alias. Health Canada mentions canary seed as a possible low-fat sesame replacement in breads/snacks; this is an application statement, not a tested recipe ratio or general equivalence [S01]. |
| Canary grass / *Phalaris arundinacea* | Keep separate. The OQLF entry names *alpiste des Canaries* for *Phalaris canariensis*; it does not cover reed canary grass [S04]. |

## Bilingual display and Québec French evidence

The proposed English display **canary seed groats** matches the Canadian producer's “Whole Alpiste Seed (Groats)” product heading and Health Canada's description of dehulled kernels as groats [S01, S05].

For French, Health Canada's bilingual food-approval page uses **graine d’alpiste des Canaries** for the crop and **grains mondés (gruaux)** for the dehulled food kernels. The proposed display **grains mondés d’alpiste des Canaries** combines those directly supported terms. The OQLF's Québec Grand dictionnaire terminologique entry records **alpiste des Canaries** for *Phalaris canariensis* in botany, with English **canary-grass** [S02, S04]. This supports the Québec French species name, while the proposed processed-food compound is not an OQLF headword and no Québec retail package label for the food-grade groats was located.

Do not add bare `alpiste`, `canary`, `graine`, `seed`, or `bird seed` as aliases. The French display itself contains the qualified OQLF species name. Do not use the French botanical name as evidence that ordinary birdseed is edible.

## Exact-key ownership and picker projection

The current snapshot contains **1,387 ingredient references**, **100 forms**, **63 legacy-import candidates**, and **1,720 ledger records**. Exact normalized searches found no owner for `canary seed`, `canary seed groats`, `glabrous canary seed`, `food-grade canary seed`, `Phalaris canariensis`, `graine d’alpiste des Canaries`, `grains mondés d’alpiste des Canaries`, `alpiste des Canaries`, or `graine à canaris` in reference names/aliases, form labels/match terms, legacy candidates, or formal ledger record IDs. Neither `ingredient-ref-canary-seed-groats` nor the source-ID prefix above is allocated. The same phrases were absent from earlier focused proposals and batch notes.

Static picker projection follows the current phrase-first, substring-fallback logic in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9). It is based on the current data files, not live picker QA.

| Query | Current results | If the proposed display pair were added |
|---|---:|---:|
| `canary seed groats` | 0 | 1 proposed row |
| `canary seed` | 0 | 1 proposed row |
| `grains mondés d’alpiste des Canaries` | 0 | 1 proposed row |
| `alpiste des Canaries` / `alpiste` | 0 | 1 proposed row |
| `seed` | 20 | 21, adding the proposed row |
| `bird seed` | 0 | 0; no bird-feed term is proposed |

Keep the proposed phrase-qualified names and empty aliases so the broad `seed` query only gains the one clearly named cereal product. The proposal would make a search for `alpiste` return the food-grade groat identity; users should not interpret that result as approval of pet-feed seed.

## Recipe-corpus demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across complete serialized recipe JSON and the `originalText`, `ingredientName`, and `ingredientRefId` fields. The scan covered `canary seed`, `canary seed groats`, `glabrous canary seed`, `dehulled canary seed`, `food-grade canary seed`, `canary grass`, *Phalaris canariensis*, `alpiste`, `alpiste des Canaries`, `graine d’alpiste des Canaries`, `graine à canaris`, and the proposed French display. It found **0 recipe files and 0 ingredient rows**. The candidate has no bundled recipe demand or recipe-line link.

## Proposed fields and limits

| Field | Proposed value or limit |
|---|---|
| Reference ID | `ingredient-ref-canary-seed-groats` |
| English display | `canary seed groats` |
| Québec French display | `grains mondés d’alpiste des Canaries` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | Empty in both languages. Do not add generic `canary seed`, `alpiste`, or bird-feed names as aliases; the displays already provide phrase search. |
| Forms | None. The reference names the dehulled groat product; no cooked or otherwise prepared form is supported here. Keep flour and flakes separate. |
| `defaultDensity` / `unitMappings` | `null` / empty. No reviewed source gives a household volume-to-mass value or transferable unit mapping. |
| Ledger research if accepted | Record identity as verified only for human-food glabrous, dehulled cultivars; record measurement research as no supported reusable value. Do not turn nutrient percentages, processing descriptions, or seed-grade data into kitchen quantities. |
| Substitutions | No active rule or recipe-line link. Health Canada's sesame-replacement statement supplies no ratio or tested recipe interchangeability; keep substitution research open. |
| Allergy wording | Preserve Health Canada's required wheat-allergy caution as a product-label limitation in research notes. Do not add a `wheat-free` claim or imply that gluten-free means wheat-allergy-safe [S01, S02]. |

No household measures, serving weights, density, unit mapping, cooking yield, or conversion were found. The producer's nutrient composition and the Canadian Grain Commission's grain-processing information describe product characteristics, not recipe quantities [S03, S05].

## Source register

Sources were checked online on 2026-10-13. These IDs are proposal-local only.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-CANARY-SEED-GROATS-R63-20261013-S01` | Health Canada, [Glabrous canary seed (*Phalaris canariensis* L.)](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/approved-products/glabrous-canary-seed-phalaris-canariensis.html) | Officially evaluates glabrous-hull brown/yellow varieties as cereal grain for human consumption; describes dehulled kernels (groats), intended ingredient uses, and wheat-allergy label caution. It does not establish current retail availability, recipe measures, or that ordinary hairy bird-feed varieties are edible. |
| `WP03-CANARY-SEED-GROATS-R63-20261013-S02` | Health Canada, [La graine d’alpiste des Canaries glabre (*Phalaris canariensis* L.)](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/produits-approuves/graine-alpiste-canaries-glabre-phalaris-canariensis.html) | The French approval uses `graine d’alpiste des Canaries`, `grains mondés (gruaux)`, and identifies the products as intended for human food. Supports the proposed French display terms in Canadian government French, but is not a Québec retail label or an OQLF ruling on the compound. |
| `WP03-CANARY-SEED-GROATS-R63-20261013-S03` | Canadian Grain Commission, [La graine à canaris : une céréale nouvelle développée dans les Prairies canadiennes](https://grainscanada.gc.ca/fr/recherche-donnees/rapports-scientifiques/canaris/) and [food-ingredient section](https://grainscanada.gc.ca/fr/recherche-donnees/rapports-scientifiques/canaris/statistiques.html) | French Canadian cereal-science pages use `graine à canaris` and describe dehulled kernels/groats, flour, and flakes. The article is from 2021 and is technical research, not a current package label, Québec-preferred product name, or household-measure source. |
| `WP03-CANARY-SEED-GROATS-R63-20261013-S04` | Office québécois de la langue française, [alpiste des Canaries (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17498891/alpiste-des-canaries) | Provides the Québec French botanical name `alpiste des Canaries` for the species. Its domain is botany and its English equivalent is `canary-grass`; it does not define a cereal product, edible seed, or groat. |
| `WP03-CANARY-SEED-GROATS-R63-20261013-S05` | Alpiste Canada, [Alpiste Products](https://www.alpistecanada.ca/products), sections “Whole Alpiste Seed (Groats)” and “Alpiste Flour” | Canadian producer distinguishes whole groats from flour, describes dehulling and food applications. This is a producer product-family page rather than a Québec retail label or full packaged-food label; it gives no package weight or kitchen measure. |

## Disposition

Accept the narrow identity **canary seed groats / grains mondés d’alpiste des Canaries** for glabrous, dehulled *Phalaris canariensis* intended for human consumption. Keep the bird-feed boundary explicit in the ledger, preserve the wheat-allergy caution without making a wheat-free claim, and add no aliases, forms, measures, conversions, yields, recipe links, or substitutions. Section F remains open. No app tests or emulator checks were run because the accepted change only adds database JSON data under `AGENTS.md`.

## Root integration outcome

Accepted `ingredient-ref-canary-seed-groats` as **canary seed groats / grains mondés d’alpiste des Canaries** in `GRAIN_AND_CEREAL`. The identity is restricted to glabrous, dehulled *Phalaris canariensis* intended for human food. Added no aliases, forms, density, unit mappings, measures, recipe links, conversions, yields, or substitutions. The ledger records the human-food boundary and Health Canada’s wheat-allergy labeling caution; it makes no gluten-free or wheat-allergy-safety claim. Measurement research is recorded as having no reusable value, and no recipe demand was found. Section F remains open.

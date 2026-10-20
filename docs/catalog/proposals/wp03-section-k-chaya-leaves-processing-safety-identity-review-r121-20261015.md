# WP03 Section K chaya-leaves identity and processing-safety review (R121)

- **Reviewed:** 2026-10-15
- **Review slot:** R121
- **Status:** Documentation-only hold integrated on 2026-10-15; see [the batch README](../batches/wp03-section-k-chaya-processing-caution-hold-integration-r121-20261015/README.md).
- **Scope:** One regional leaf-vegetable identity, chaya leaves.
- **Recommendation:** The evidence supports a distinct chaya-leaf identity, but hold it outside active references until a user-visible preparation caution can be preserved. Current `IngredientReference` data has no caution field. Sources consistently warn against raw leaves, while the cited preparation times and study conditions do not establish one catalog-wide cooking rule.
- **Proposed source-ID prefix:** `WP03-K-CHAYA-20261015-R121-S`; this prefix was absent from the ledger, proposal tree, and batch tree at review time.

## Open Section K item

This review addresses the continuing Section K checklist item in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt): continue the broader leafy-green and brassica sweep and review other regional greens discovered in independent sweeps. The latest Section K integration is R120 Mibuna; its row is distinct from the already integrated Mizuna, Tatsoi, Tokyo Bekana, and Komatsuna rows. See the [R120 batch README](../batches/wp03-section-k-mibuna-identity-integration-20261014/README.md).

Chaya is a named Mesoamerican leaf vegetable, distinct from true spinach, cassava leaves, and other catalogued greens. The identity question is unresolved in the active catalog and was not covered by the earlier WP03/WP06 regional-green proposals. This review does not close the broader Section K sweep.

## Repository audit and snapshot

I searched the active references and forms, legacy candidates, research ledger, WP03/WP06 proposals and batches, the Section K checklist, and every recipe path in the bundled package manifest for `chaya`, `chaya leaves`, `feuilles de chaya`, `Cnidoscolus aconitifolius`, `Cnidoscolus chayamansa`, `tree spinach`, `spinach tree`, `Mayan spinach`, `épinard maya`, `arbre à épinard`, and `manioc bâtard`. No exact active reference, form, legacy candidate, ledger record/source, earlier chaya proposal, or manifest-listed recipe text was found. One substring-only hit in an earlier WP06 proposal is the locality name `Chijichaya` in a Peruvian crop-process description, not an ingredient mention. The proposed candidate ID is also unassigned.

Snapshot before any integration:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,465 references | `10aa9175b7e087b42be48a2f3206fcaf5af711aaa19d88d7c612d36f7f5ae6e2` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | 63 candidates | `a704cf17c1e8e1ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `docs/catalog/research-ledger.v1.json` | 1,806 records / 7,444 source entries / 6,322 distinct source IDs | `d212466c3632657ee4677465c76b67cd8eb0ac9c30d0c3ade2c515328900237f` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f` |

The recipe-corpus digest is SHA-256 over each manifest-listed relative path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order. The complete recipe JSON scan found no `chaya`, `Cnidoscolus`, or reviewed alternative-name text.

## Identity supported by research; activation held

| Candidate ID | Category | EN display | Proposed fr-CA display | Aliases | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-chaya-leaves` | `VEGETABLE_AND_AROMATIC` | `chaya leaves` | `feuilles de chaya` | None | Chaya leaves identified as the culinary leaf product of accepted *Cnidoscolus aconitifolius* (including *C. chayamansa* under Kew's current synonymy). Do not extend to all *Cnidoscolus* species, stems, roots, medicinal preparations, or other plant parts. |

The names are a proposed borrowed fr-CA display, not an OQLF-standardized term or evidence of current Québec fresh-produce availability. French-language Yucatán food sources use *chaya* and *feuilles de chaya*. Agriculture and Agri-Food Canada's plant record lists French *manioc bâtard*, but that phrase is unsafe for this picker because `manioc` already searches several cassava and tapioca identities. A targeted OQLF and TERMIUM search did not surface a dedicated food-name entry; that is a limited negative search, not proof that no entry exists.

The shared catalog model can preserve the identity and names, but cannot preserve the critical preparation caution: `IngredientReference` has no warning or handling-note field in either the domain model or the full-library schema. The reviewed sources warn that raw leaves are unsafe and require cooking, but give different or sample-specific times. For that reason, **do not add this candidate to active references yet**. Revisit when a user-visible path can carry a source-bounded warning; do not encode an unverified generic cooking time as a form, conversion, or substitution rule.

## Picker boundary

Static query results below follow the search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized word-phrase matches are preferred, with substring matching only as a fallback. This is a source-code-equivalent simulation, not live picker QA.

| Query | Current result | If the held names were added | Decision |
|---|---|---|---|
| `chaya`, `chaya leaves` | 0 | One candidate: `ingredient-ref-chaya-leaves` | Safe exact identity terms. |
| `feuilles de chaya` | 0 | One candidate: `ingredient-ref-chaya-leaves` | Safe part-qualified French display. |
| `spinach` | 4: baby spinach, Komatsuna, Malabar spinach, water spinach | Remains 4 with the proposed names only | Do not add `tree spinach`, `spinach tree`, `Mayan spinach`, `épinard maya`, or `arbre à épinard`; each contains the broad spinach query and would add a different crop to it. |
| `manioc` | 4: cassava flour, cassava leaves, cassava root, tapioca starch | Remains 4 with the proposed names only | Do not add `manioc bâtard`; it would make the cassava-family query return chaya too. |
| `chaya mansa`, `chaya pica`, `tree spinach`, `manioc bâtard` | 0 exact active results | Remain unassigned | Do not activate localized cultivar, morphology, or alternate common-name terms from this review. |

The published ethnobotanical source reports local variation in chaya names and distinguishes local varietal terms. Those terms are not needed to find the base leaf ingredient and are not proposed as global aliases. Keep chaya separate from spinach, collards, amaranth greens, cassava leaves, and cassava root.

## Recipe demand and numeric behavior

The manifest-listed 114-recipe / 1,123-row bundled corpus has no chaya ingredient line or recipe-link demand. A current French-language Yucatán recipe page lists 16 chaya leaves for one dzotobichay recipe and suggests spinach or Swiss chard for that dish. Treat the count and replacement wording as source-specific recipe evidence only: they establish no reusable leaf count, mass, preparation yield, or global substitution. No form, density, unit mapping, conversion, yield, recipe link, or active substitution is proposed.

## Processing and evidence limits

The crop identity is well supported, and Kew currently treats *Cnidoscolus chayamansa* as a synonym under *C. aconitifolius* subsp. *aconitifolius*. The University of California Davis ethnobotany paper describes chaya leaves and young shoots as regional human food in Mesoamerica and reports fresh leaf sales in Yucatán at the time of its field study. That 2002 study is not current Canadian market evidence. This review did not verify an in-stock Québec fresh-leaf listing. A current Canadian-targeted Recetas Mexas page uses `chaya leaves` and suggests Amazon or Mexican/Latin American groceries as purchase routes, but it is a guide rather than a verified retailer SKU. A French Walmart.ca page is a third-party potted-plant listing and was out of stock when indexed, so it does not establish food retail supply.

UF/IFAS Extension says leaves are edible only when thoroughly cooked and toxic raw. A newer 2026 study reports a reduction after boiling one farm's sampled leaves for 15 minutes; that result does not set a universal preparation time across plants or recipes. The older Davis paper reports a 10–20 minute usual range in its Mesoamerican review, while the newer study evaluates one sample and one treatment. Keep only the source-bounded caution in this proposal and require an appropriately reviewed, visible handling message before activation. Do not present this catalog proposal as a foraging-identification guide.

## Sources reviewed on 2026-10-15

| Source ID | Source | Evidence used and limitation |
|---|---|---|
| `WP03-K-CHAYA-20261015-R121-S01` | Agriculture and Agri-Food Canada, [GRIN-Global-CA: *Cnidoscolus aconitifolius*](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=70189). | Canadian taxon record and common-name listings; identifies human food use as a vegetable. Lists `tree spinach` and French `manioc bâtard`, but does not establish Quebec retail usage or safe aliases for this picker. |
| `WP03-K-CHAYA-20261015-R121-S02` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Cnidoscolus aconitifolius*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:61821-2/general-information). | Current accepted taxon, Mexico-to-Central-America native range, and recorded food use. It does not define a Canadian commodity name or preparation method. |
| `WP03-K-CHAYA-20261015-R121-S03` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Cnidoscolus chayamansa*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:61834-2). | Current Kew treatment synonymizes this name with *C. aconitifolius* subsp. *aconitifolius*. This is a taxonomic treatment, not a claim that every regional plant called chaya belongs to that taxon. |
| `WP03-K-CHAYA-20261015-R121-S04` | Ross-Ibarra and Molina-Cruz, [“The Ethnobotany of Chaya (*Cnidoscolus aconitifolius* ssp. *aconitifolius*): A Nutritious Maya Vegetable”](https://rilab.ucdavis.edu/pdfs/Ross-Ibarra_Molina-Cruz-2002.pdf), *Economic Botany* 56 (2002), pp. 350–365. | Regional human-food evidence for leaves, markets, and cooked preparations; reports local name and variety variation. Its field evidence is old and geographically bounded, not a current Canadian availability or label survey. |
| `WP03-K-CHAYA-20261015-R121-S05` | University of Florida IFAS Extension, [Low-Maintenance Landscaping: Shrubs](https://blogs.ifas.ufl.edu/sarasotaco/2024/04/30/low-maintenance-landscaping-shrubs/), chaya entry. | Gives the species name and states that leaves are edible when thoroughly cooked and toxic raw; also notes sap irritation and stinging hairs on young stems. Horticultural extension guidance, not a Canadian food-safety standard or exact cooking-time specification. |
| `WP03-K-CHAYA-20261015-R121-S06` | Kuti and Kuti, [“Proximate composition and mineral content of two edible species of *Cnidoscolus* (tree spinach)”](https://pubmed.ncbi.nlm.nih.gov/10540979/), *Plant Foods for Human Nutrition* 53 (1999). | Peer-reviewed food study of raw and cooked leaf samples; its abstract states cooking is essential to inactivate cyanogenic glycosides. The studied samples do not establish a universal recipe or cooking duration. |
| `WP03-K-CHAYA-20261015-R121-S07` | Recetas Mexas, [Chaya: what it is](https://recetasmexas.com/fr/guide/chaya) and [Dzotobichay recipe](https://recetasmexas.com/fr/recette/dzotobichay), guide updated 2026-08-12 and recipe updated 2026-06-22. | Current French-language culinary usage of *chaya* / *feuilles de chaya*, and a recipe-specific 16-leaf amount and spinach/chard replacement suggestion. It is not Québec terminology evidence; the measure and substitution are not transferable. |
| `WP03-K-CHAYA-20261015-R121-S08` | Recetas Mexas, [Chaya leaves in Canada](https://recetasmexas.com/en-ca/products/hoja-de-chaya). | Current Canadian-targeted product guide uses `chaya leaves` and points readers to Amazon or Mexican/Latin American groceries. It is not a verified retailer SKU or Québec availability evidence. |
| `WP03-K-CHAYA-20261015-R121-S09` | Walmart Canada, [French marketplace listing for a chaya plant](https://www.walmart.ca/fr/ip/CHAYA-Plante-cnidoscolous-Aconitifolius-Arbre-Maya-pinard-Vari-t-Lobe-Profond-1/64O293R8J22V). | French-language Canadian marketplace spelling and plant listing; third-party seller, potted plant rather than fresh produce, and indexed as out of stock. It does not establish a standardized fr-CA name or current leaf availability. |
| `WP03-K-CHAYA-20261015-R121-S10` | Praditukrit et al., [“Impact of Boiling on Cyanogenic Detoxification and Nutrient Retention in *Cnidoscolus aconitifolius* (Chaya) Leaves”](https://pubmed.ncbi.nlm.nih.gov/42279813/), *Foods* 15(11), 2028 (2026), DOI 10.3390/foods15112028. | Reports raw and boiled chaya results for leaves sampled at one farm, with a 15-minute boiling treatment. Sample and method are study-specific and do not justify a shared cooking-time rule. |

## Recommendation and revisit condition

Keep the Section K item open. The candidate `chaya leaves / feuilles de chaya` has sufficient evidence for a distinct plant-part identity and safe, narrow picker terms, but the missing catalog-level warning field prevents preserving its central raw-leaf caution in the active picker. Revisit after the product can persist and present a reviewed handling warning. If that condition is met, use the candidate row above with empty alias arrays, no forms or numeric behavior, and no unsupported recipe or substitution links. Keep the French display provisional pending independent Québec terminology review.

The documentation-only hold was integrated on 2026-10-15. No catalog reference or ledger record was added; the checklist, roadmap, and batch README now record the hold. No app, Gradle, instrumentation, or emulator tests were run. The proposal's scoped static checks and the integration README provide the evidence and review boundary.

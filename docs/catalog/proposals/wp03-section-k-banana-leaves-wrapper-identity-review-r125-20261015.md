# WP03 Section K banana-leaf wrapper identity review (R125)

- **Reviewed:** 2026-10-15.
- **Status:** Integrated by root on 2026-10-15 as an identity-only reference and ledger entry. See the [R125 batch README](../batches/wp03-section-k-banana-leaves-wrapper-identity-integration-r125-20261015/README.md). The proposal's source snapshot below predates integration.
- **Scope:** Decide whether banana leaves used as food-contact wrappers need a distinct identity, and select narrow English / Québec-French names that do not collapse them into banana fruit, plantain, or banana blossom.
- **Recommendation:** Add one identity-only reference, `ingredient-ref-banana-leaves`, displayed as `banana leaves / feuilles de bananier`. Add `banana leaf`, `feuille de bananier`, and the current Québec retail variant `feuilles de banane` as aliases. Treat this as a wrapping leaf, not as an edible vegetable. Keep `banana`, `banane`, `plantain`, `banana blossom`, `fleur de bananier`, and generic `leaves` / `feuilles` out of the aliases.
- **Source-ID prefix:** `WP03-K-BANANA-LEAVES-IDENTITY-20261015-R125-S`; checked against the current research ledger and existing proposal/batch files before drafting.

## Unresolved Section K question

Section K of the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) still lists banana leaves among open culinary wrapping/aromatic leaves and explicitly cautions that not every wrapper is eaten. Pandan leaves are already owned by WP05. Curry leaves, banana leaves, corn husks, lotus leaves, and the broader Section K review remain separate checklist work.

The active catalog has `ingredient-ref-banana` for the fruit, `ingredient-ref-plantain` for plantain fruit, and `ingredient-ref-banana-blossom` for the flower. It has no banana-leaf identity or form. The existing banana-blossom ledger decision names banana leaf only as a separate plant part. The older stems/shoots/blossoms review says the leaf/wrapper question is separately scoped; it does not decide its naming or catalog treatment. No exact banana-leaf legacy candidate, focused proposal, or earlier integration was found.

## Proposed reference

| Field | Recommendation |
|---|---|
| Reference ID | `ingredient-ref-banana-leaves` |
| English display | `banana leaves` |
| Québec French display | `feuilles de bananier` |
| English aliases | `banana leaf` |
| French aliases | `feuille de bananier`; `feuilles de banane` |
| Category | `VEGETABLE_AND_AROMATIC`, as a plant part managed in Section K; this classification does not assert that the leaves are eaten |
| Default density | None |
| Unit mappings | None |

The Québec French display prefers `bananier` for the plant part. OQLF's GDT defines `banane` as the fruit and describes the plant as a bananier; it does not provide a dedicated culinary entry for the leaf. Current local product listings support both `feuilles de bananier` and `feuilles de banane`. Use the former as display and retain the latter as a retailer-attested search alias, not as a claim that OQLF standardized the leaf term. Keep Québec terminology review open.

## Evidence and limits

Banana leaves are documented as food-contact material: they wrap or line food during cooking and serving. The University of Hawaiʻi CTAHR describes these uses across tropical and subtropical cuisines [S02]. A 2021 Philippine Journal of Science study by University of the Philippines Diliman researchers documents banana (*Musa* sp.) leaves as a material for serving and wrapping raw and cooked foods in Metro Manila food service [S01]. These establish a distinct culinary role and plant part; neither source establishes that all banana cultivars or retail products have identical handling properties.

Current Québec-facing product evidence supports a locally findable identity and a French alias boundary. Mayrand lists **Feuilles de banane congelées 454 g** and showed stock at its Anjou and Brossard stores on the review date [S03]. Marché Afritibi lists **Feuilles de bananier**, describes wrapping foods for steaming or grilling, and explicitly says the leaves are not edible; that listing was out of stock when reviewed [S04]. The distinct title forms are useful market evidence, but the latter listing does not establish current availability or a standardized French term.

A federal Canadian French-language fish cookbook gives a concrete wrapper use: thawed frozen leaves are cut to six 12 × 10 inch pieces, wrapped around six whitefish fillets, and removed before eating; it explicitly says the leaves are not edible [S05]. A Québec recipe page also uses `feuilles de bananier` for shrimp packets and lists eight small leaves for eight packets [S06]. Both are recipe-specific. The Québec page labels the dish as four servings while dividing it into eight packets, so its count is not a general serving conversion. The Canadian cookbook's one-pound package and cut sizes do not establish a reusable leaf count or mass per leaf.

## Picker projection

The projection follows the app's accent-folding and complete-phrase-first search in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a source-code-equivalent static projection, not live picker QA.

| Query | Current results | With proposed row | Decision |
|---|---|---|---|
| `banana leaf`; `banana leaves` | 0 | 1: banana leaves | The qualified English phrases resolve directly to the leaf identity. |
| `feuille de bananier`; `feuilles de bananier` | 0 | 1: banana leaves | Keep the Québec display and its singular search form together. |
| `feuilles de banane` | 0 | 1: banana leaves | Add this exact Mayrand product wording as an alias. |
| `banana` | 6 references | 7, adding banana leaves | The broad English query already spans fruit, blossom, ketchup, flour/starch, and plantain; do not add bare `banana` as an alias. |
| `banane` | 5 references | 6, adding banana leaves | The broad French query already spans fruit, plantain, and banana products; the retailer alias adds one qualified leaf result. |
| `bananier` | 1: banana blossom | 2: banana blossom and banana leaves | The plant-part query becomes shared, while exact `fleur de bananier` and `feuille(s) de bananier` remain distinct. |
| `banana blossom`; `fleur de bananier` | 1: banana blossom | Unchanged | Preserve the existing blossom identity. |
| `plantain banana` | 1: plantain | Unchanged | Keep plantain fruit separate; do not add `plantain leaf` without source evidence that users apply that product term to this commodity. |
| `wrapper` | 4 packaged-wrapper references | Unchanged | Do not add generic `wrapper` or `food wrapper` aliases. |

The proposal intentionally accepts that broad `banana`, `banane`, and `bananier` searches include multiple plant parts or products. Complete phrases select the intended leaf row; broad parent terms must not be redirected to one of those parts.

## Bundle demand and recipe matches

I scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. No row contains banana leaf/leaves or `feuille(s) de banane` / `feuille(s) de bananier`, and none links to a banana-leaf reference. There is no direct bundled recipe demand and no recipe link to add.

The external Canadian and Québec recipes above demonstrate real wrapper use and local French phrasing, but their package sizes, leaf dimensions, and piece counts remain source-specific. They do not change the zero-match bundle finding.

## Alias, form, measurement, and substitution decisions

| Catalog behavior | Recommendation |
|---|---|
| Identity | Add one leaf identity separate from banana fruit, plantain fruit, and banana blossom. |
| English aliases | Add singular `banana leaf`; do not add bare `banana`, `plantain leaf`, `banana wrapper`, or a generic wrapper term. |
| French aliases | Add singular `feuille de bananier` and retailer wording `feuilles de banane`; do not add bare `banane`, `bananier`, or generic `feuille(s)`. |
| Forms | None. Frozen is the observed retail storage state; it does not identify a recipe-semantic leaf form in the reviewed evidence. |
| Density | None. The sources report packages, cut dimensions, and recipe-specific leaf counts, not a transferable volume-to-mass relation. |
| Unit mappings / conversions | None. A 454 g retail package, one 1 lb cookbook quantity, six specified cut pieces, and eight small Québec recipe leaves cannot be combined into a standard mapping. |
| Yield / count mapping | None. Leaf size, maturity, trimming, and pack count are not standardized in these records. |
| Substitution | None. No reviewed source supports replacing banana leaves with another ingredient or assigning a general wrapper substitution. |
| Recipe links | None; the bundled corpus has no matching row. |

## Source register

| Source ID | Source | Evidence used and limits |
|---|---|---|
| `WP03-K-BANANA-LEAVES-IDENTITY-20261015-R125-S01` | Luna and Recote, Philippine Journal of Science, [Knowledge and Practices in the Utilization of Banana (*Musa* sp.) Leaf as Food Contact Material in the Metropolitan Manila Foodservice Industry](https://philjournalsci.dost.gov.ph/knowledge-and-practices-in-the-utilization-of-banana-musa-sp-leaf-as-food-contact-material-in-the-metropolitan-manila-foodservice-industry/), 150(5), 2021, DOI 10.56899/150.05.01. | Primary study of food service in Metro Manila; identifies serving and wrapping uses. Its geographic scope and study design do not establish Québec market naming or universal handling guidance; the paper says the effectiveness of preparation methods needs further evaluation. |
| `WP03-K-BANANA-LEAVES-IDENTITY-20261015-R125-S02` | University of Hawaiʻi CTAHR Nutrition Center, [Banana](https://nutritioncenter.ctahr.hawaii.edu/pnh/cultural-awareness/resources/island-staple-foods/banana/). | Institutional extension page says banana leaves are used for cooking, wrapping, and serving in tropical and subtropical cuisines. Broad culinary context, not a product specification. |
| `WP03-K-BANANA-LEAVES-IDENTITY-20261015-R125-S03` | Mayrand, [Feuilles de banane congelées 454 g](https://mayrand.ca/fr/nos-produits/surgele/fruits-et-puree-surgeles/feuilles-de-banane-congelees-tio-jorge-36607). | Québec retailer product title, frozen 454 g package, and store inventory display for Anjou and Brossard checked on 2026-10-15. Retail package weight is not a leaf count, unit mapping, or leaf-level measure. |
| `WP03-K-BANANA-LEAVES-IDENTITY-20261015-R125-S04` | Marché Afritibi, [Feuilles de bananier](https://afritibi.com/produit/feuilles-bananier/). | Québec-facing listing uses the proposed display phrase, describes steaming/grilling as wrapper use, and says the leaves are not edible. The listing identifies frozen leaves but was out of stock at review; this supports terminology and role, not present availability. |
| `WP03-K-BANANA-LEAVES-IDENTITY-20261015-R125-S05` | Freshwater Fish Marketing Corporation, [Du lac à votre assiette](https://publications.gc.ca/collections/collection_2016/ocped-ffmc/CC194-1-2011-fra.pdf), p. 85 (printed page), recipe “Grand corégone grillé avec un chutney à la coriandre en feuilles de bananier.” | Canadian French-language recipe specifies 1 lb thawed frozen leaves, cut into six 12 × 10 inch pieces for six fish portions, and says the leaves are not edible. This is one recipe's package and cutting instruction, not a reusable count, yield, or mapping. |
| `WP03-K-BANANA-LEAVES-IDENTITY-20261015-R125-S06` | Recettes Gourmandes, [Crevettes en feuilles de bananier](https://recettesgourmandes.ca/recipe/crevettes-en-feuilles-de-bananier), created 2019-12-11. | Québec French-language recipe lists eight small leaves and forms eight shrimp packets. The page says four servings, so its packet count is recipe-specific and internally not a servings conversion; it is community recipe evidence, not a standard. |
| `WP03-K-BANANA-LEAVES-IDENTITY-20261015-R125-S07` | Office québécois de la langue française, [GDT: banane](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane), updated 1990. | Defines `banane` as the fruit of the bananier and describes the plant's large leaves. It supports separating the fruit name from the plant part, but does not establish a preferred culinary name for banana leaves. |

## Static review record

The read-only snapshot at the final review check on 2026-10-15 contained 1,471 active references, 105 forms, 63 legacy candidates, 1,812 ledger records / 7,492 source entries / 6,370 distinct source IDs, and 114 manifest-listed recipes / 1,123 ingredient rows. The manifest-ordered recipe-corpus digest was `75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f`.

| File | Snapshot SHA-256 |
|---|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `f0643394d82d01dd7a15b5aab28274994bab2d7cb0dceeb636e3259ebc72fec6` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `docs/catalog/research-ledger.v1.json` | `2df33a9919caa1d4285965831e4580364c89d4fee88e830fbba4047daed51ebf` |

The proposed ID and source-ID prefix were unused in active references, forms, legacy candidates, and ledger source IDs. Source-prefix ownership was also checked against existing proposal and batch files. Scoped static checks covered exact candidate ownership, picker projection, manifest recipe-row demand, UTF-8 without BOM, final newline, trailing whitespace, and the local Markdown link. No app, Gradle, instrumentation, emulator, or deployment tests were run; no shared data files were edited.

## Recommendation and revisit condition

Add `ingredient-ref-banana-leaves` as the single identity for banana-plant leaves used as food-contact wrappers, with display names `banana leaves / feuilles de bananier` and the narrow aliases above. This resolves the explicit Section K naming gap without conflating fruit, plantain, or blossom. Do not add numeric behavior or substitutions: the reviewed package and recipe quantities vary by source and leaf size, and the bundled library has no direct recipe demand.

This decision covers the banana-leaf identity only. Keep the broader wrapping/aromatic-leaf checklist, independent Québec terminology review, and other unresolved Section K work open.

## Integration disposition

Integrated identity-only `ingredient-ref-banana-leaves` as `banana leaves / feuilles de bananier`, with `banana leaf`, `feuille de bananier`, and `feuilles de banane` as narrow aliases. Keep the leaf as a wrapping plant part, separate from fruit, plantain, and blossom. No forms, density, measures, mappings, recipe links, conversions, yields, or substitutions were added. Package totals are 1,472 references, 105 forms, and 1,813 ledger records / 7,499 source entries / 6,377 distinct source IDs. See the [integration record](../batches/wp03-section-k-banana-leaves-wrapper-identity-integration-r125-20261015/README.md).

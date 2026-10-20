# WP03 Section K — grape-leaf identity review (R903)

**Status:** Integrated as identity-only data in the R902–R904 generic review batch.

**Reviewed:** 2026-10-19

**Plan anchor:** Section K leaves open review of wrapping and aromatic leaves with documented culinary roles ([catalog plan, Section K](../../RecipeBook-global-ingredient-catalog-plan.txt#L6604)). This proposal covers an edible leaf used as a food wrapper; it does not treat the wrapper leaves as interchangeable.

## Recommendation

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for **grape leaves / feuilles de vigne**, limited to food-grade leaves of cultivated grapevine, with *Vitis vinifera* as the directly documented taxon. The specific role is as a wrapper for filled preparations that are cooked. The OQLF describes a dolma as commonly made from a vine or cabbage leaf, filled and cooked; a University of Illinois Chicago heritage-garden page identifies grape (*V. vinifera*) leaves as food wrappers and describes blanching them to make them flexible; the generic identity is supported by these directly reviewed sources without relying on the inaccessible recipe page.

This adds an edible wrapper-leaf ingredient to the open plant-part sweep. It is distinct from the grape fruit and grape-derived juice, seed flour, seed oil, and verjuice already in the catalog. Keep grape leaves separate from cabbage leaves and the existing banana, lotus, pandan, and other wrapper identities. Do not infer that every wrapper is eaten, that every grape-family species is suitable, or that a prepared dish is an ingredient alias.

## Proposed data

```json
{
  "id": "ingredient-ref-grape-leaves",
  "nameEn": "grape leaves",
  "nameFr": "feuilles de vigne",
  "aliasesEn": ["grape leaf"],
  "aliasesFr": ["feuille de vigne"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The accepted identity-only ledger record has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It has no forms, recipe links, density, unit mapping, measure, conversion, yield, or substitution. The sources support leaves as a cooking wrapper; they do not establish an active fresh, brined, jarred, or cooked form.

## Identity and no-transfer boundary

| Identity or evidence | Treatment | Limit |
|---|---|---|
| `grape leaves` / `feuilles de vigne` | New plant-part identity | Food-grade leaves of cultivated grapevine; the cited university source names *Vitis vinifera*. Culinary use is as a wrapper prepared and cooked in the cited sources. This review does not extend the identity to every *Vitis* species or any plant merely called a vine. |
| `grape leaf` / `feuille de vigne` | Singular search aliases | Inflections of the display terms. Do not add bare `grape`, `grapes`, `vine`, or `vigne` aliases. |
| `ingredient-ref-grapes` (`grapes / raisin`) | Preserve unchanged | Fruit identity. Its OQLF evidence for `raisin` does not establish leaf identity or edible use. Do not merge leaves into the fruit row. |
| `ingredient-ref-grape-juice`, `ingredient-ref-verjuice` | Preserve unchanged | Juice and condiment identities. Their source terminology and properties do not transfer to leaves. |
| `ingredient-ref-grape-seed-flour`, `ingredient-ref-grapeseed-oil` | Preserve unchanged | Seed-derived foods. Product-specific and seed-fraction findings remain scoped to those ingredients. Do not reuse them as leaf evidence or transfer any product measurements. |
| Existing currant and sultana-raisin records mentioning *Vitis vinifera* | Preserve unchanged | Their taxonomic context concerns fruit, cultivars, or dried fruit. It does not establish the leaf ingredient's culinary role; the separate UIC page is used for that part-specific claim. |
| Dolma, dolmas, dolmadakia, sarma, and stuffed-grape-leaf dishes | Keep as prepared foods | OQLF's `feuille de vigne farcie` is a prepared-dish term. Do not add dish names as aliases, forms, or substitutes for the plain leaf ingredient. |
| Cabbage, banana, lotus, pandan, corn-husk, fig, and other wrapper leaves | Keep separate | Similar wrapping function does not establish identity or interchangeability. The task's explicit reminder that not all wrappers are eaten remains in force. |
| Raw leaves, brined/jarred leaves, and prepared products | Do not generalize | Sources describe blanching, soaking, and cooking in their own culinary contexts. This review proposes no raw-use claim, preservation form, jar specification, or equivalence between fresh and preserved leaves. |
| Brands, product lines, flavours, SKUs, and retailer variants | Out of scope | Commercial-product counts do not add ingredient diversity. No product roster or branded source is researched; all existing branded rows and their evidence remain untouched. |

An indexed RICARDO result appeared to list 50 leaves and a 500 g jar, with soaking and simmering directions, but the page could not be opened directly and these details were not verified or entered in the ledger. If accurate, they remain recipe-specific and establish no standard leaf count, package size, unit conversion, or preparation rule for grape leaves.

## Sources

The integrated ledger uses source IDs `R903-S01` and `R903-S02`. RICARDO was excluded from the ledger because its page could not be opened directly and the generic identity is supported by the two directly reviewed sources below.

| Source ID | Source | Supports and limits |
|---|---|---|
| `R903-S01` | Office québécois de la langue française, [GDT: *dolma*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502233/dolma), updated 2009; accessed 2026-10-19. | Defines the dish as commonly using a vine or cabbage leaf filled with rice or minced meat and herbs, then cooked. Lists `feuille de vigne farcie` as a term for the prepared dish. Supports Québec terminology and cooked-wrapper context, not the botanical species, a raw form, leaf measurements, or aliases for the dish. `sourceKind: regional_authority`. |
| `R903-S02` | University of Illinois Chicago Heritage Garden, [Grape (*Vitis vinifera*)](https://heritagegarden.uic.edu/grape-vitis-vinifera), accessed 2026-10-19. | Identifies the grape plant as *V. vinifera* and describes green leaves blanched for flexibility and culinary wrapping. Supports the scoped plant taxon and part use; does not establish transferability to other species, a household measure, or a general preservation method. `sourceKind: extension`. |

No manufacturer, branded-product, SKU, or retailer-variant source was used. No recipe or package measurements were transferred to generic grape leaves. The RICARDO result was not included in the ledger because direct page access failed; its source-specific claims are not relied on for the identity.

## Ownership, recipe demand, and picker projection

**Pre-integration ownership snapshot (2026-10-19).** The bundled catalog had 1,930 ingredient references and 201 forms; the research ledger had 2,333 records, 11,004 source entries, and 9,231 distinct source IDs. The legacy candidate file had 56 candidates. The manifest lists 114 recipes and 1,123 ingredient rows.

The active catalog contains `ingredient-ref-grapes` (`grapes / raisin`), `ingredient-ref-grape-juice`, `ingredient-ref-grape-seed-flour`, `ingredient-ref-grapeseed-oil`, and `ingredient-ref-verjuice`; none names leaves or carries a leaf alias. Exact phrase, ID, species/part, form, legacy-candidate, ledger, proposal, batch, and plan searches found no owner for `grape leaves`, `grape leaf`, `feuilles de vigne`, `feuille de vigne`, `ingredient-ref-grape-leaves`, or the R903 source-ID prefix. There is no matching form or legacy candidate. Before integration, the OQLF dolma and UIC source URLs were unowned; the integrated record now owns those two sources. No existing grape fruit, juice, seed, oil, or product-specific evidence was transferred; those identities and all existing branded references remain unchanged.

**Bundled recipe demand.** Full-text and structured-row scans of all 114 manifest-listed recipe files found no grape-leaf, vine-leaf, `feuille(s) de vigne`, dolma, dolmadakia, or sarma mention. No bundled recipe link or measure is proposed. The Québec RICARDO recipe and OQLF entry provide evidence outside the current bundled corpus; their recipe quantities and methods remain source-specific.

**Picker projection.** This is a static projection using the current normalized phrase/substring search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), not live picker QA.

| Query | Current result | With proposal | Effect |
|---|---|---|---|
| `grape` | Grape juice, grape-seed flour, grapeseed oil (through `grape seed oil`), and verjuice (through `sour grape juice`) | Those four plus grape leaves | The broad query gains a visibly part-qualified result. |
| `grapes` | Existing grape fruit | Unchanged | The fruit remains distinct from its leaves. |
| `grape leaf` / `grape leaves` | None | `ingredient-ref-grape-leaves` | Resolves the generic English leaf ingredient. |
| `feuille de vigne` / `feuilles de vigne` | None | `ingredient-ref-grape-leaves` | Resolves the French leaf identity. |
| `grape seed` | Grape-seed flour and grapeseed oil | Unchanged | Seed-derived ingredients remain separate. |
| `grape juice` | Grape juice and verjuice | Unchanged | Juice and condiment identities are not altered. |
| `dolma` / `dolmas` | None | None | Prepared dish terms are not leaf aliases. |

**Queue and scope review.** The open Section K line calls for documented culinary wrapping and aromatic leaves and cautions that not all wrappers are eaten. It is generic plant-part work, not a request for commercial products. The `Broccolini` mention elsewhere in Section K remains a trademark/alias exclusion, not a queued roster task. No Section K line limited to brand, product-line, flavour-family, SKU, or retailer-variant enumeration was found. Any roster-only line is out of scope because commercial-product counts do not add ingredient diversity; no such roster was pursued here.

## Remaining limits

- The proposed identity is for the source-supported culinary grapevine leaf, with *V. vinifera* as the directly documented taxon; it does not establish food use for all grape species or vines.
- The sources establish cooked wrapper use. They do not support raw consumption, a preserved form, a package-size standard, or a general cooking instruction. Direct access to RICARDO failed, so it was excluded; the generic identity is independently supported by OQLF and UIC evidence.
- No bundled recipe demand, reusable amount, density, unit mapping, conversion, yield, or generally applicable substitution is supported. Measurement and substitution research remain open.
- No existing ingredient, form, recipe, branded entry, or product-scoped evidence was merged, deleted, or generalized. Added only the generic grape-leaf reference and its two-source identity-only ledger record.

## Root integration review

- Root review opened the OQLF and UIC pages directly. OQLF supports the Québec term and cooked wrapper context; UIC directly identifies *Vitis vinifera* and describes grape leaves as an edible wrapper after blanching.
- The RICARDO page was not directly accessible, so its recipe amounts and method were not entered into the ledger. The generic ingredient identity does not depend on that page.
- Added `ingredient-ref-grape-leaves` as `VEGETABLE_AND_AROMATIC`, with only singular part-qualified aliases, null density, and no forms or mappings. Added ledger sources `R903-S01` and `R903-S02`; left measurement and substitution research open.
- No app tests, build, emulator, or deployment were run because this change only adds database JSON data under `AGENTS.md`. Static data and generated-catalog validation are recorded in the [R902–R904 integration README](../batches/wp02-wp03-wp04-r902-r904-generic-review-integration-20261019/README.md).

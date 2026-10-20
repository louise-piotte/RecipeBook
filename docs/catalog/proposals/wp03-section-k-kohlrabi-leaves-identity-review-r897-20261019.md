# WP03 Section K — kohlrabi leaves identity review (R897)

**Status:** Accepted and integrated on 2026-10-19. The proposal was reviewed and integrated into the bundled reference catalog and research ledger in the current R896–R898 batch.

**Reviewed:** 2026-10-19

**Root source recheck:** OQLF confirms the base `chou-rave / kohlrabi` name and taxon; Ricardo confirms `feuilles de chou-rave` and raw/cooked use; University of Minnesota and Iowa State Extension confirm culinary leaf/greens use. Cooking analogies and Iowa State storage directions remain source-specific.

**Plan anchor:** Section K's broader leafy-green and brassica sweep remains open ([catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6537)). The existing kohlrabi crop reference is recorded in the plan's root-vegetable history ([catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6501)); this proposal reviews its distinct culinary leaf part.

## Recommendation

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for **kohlrabi leaves / feuilles de chou-rave**, limited to the leaves of the kohlrabi crop, *Brassica oleracea* var. *gongylodes*. This is a useful leafy ingredient distinct from the existing kohlrabi enlarged stem/bulb identity. Current Québec culinary wording and university extension sources identify the leaves as food and describe raw or cooked use, including cooking them as greens.

The OQLF-owned base-crop source establishes the bilingual crop name and taxon, but says nothing about leaf edibility. A Québec culinary source supplies the exact French phrase and describes leaf use; University of Minnesota and Iowa State resources independently support food use and basic preparation. Matching the Québec article's common name to the OQLF-identified crop is an inference from the shared `chou-rave / kohlrabi` name, not a taxonomic assertion made by the article itself.

## Integrated data

```json
{
  "id": "ingredient-ref-kohlrabi-leaves",
  "nameEn": "kohlrabi leaves",
  "nameFr": "feuilles de chou-rave",
  "aliasesEn": ["kohlrabi leaf", "kohlrabi greens"],
  "aliasesFr": ["feuille de chou-rave"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The identity-only ledger record uses `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. No form, recipe link, density, unit mapping, measure, conversion, yield, or substitution was added.

## Identity and no-transfer boundary

| Identity or evidence | Treatment | Limit |
|---|---|---|
| `kohlrabi leaves` / `feuilles de chou-rave` | New plant-part identity | Leaves of *B. oleracea* var. *gongylodes* only. The French compound is attested in a Québec culinary source; the OQLF standardizes the base crop name, not this compound. |
| `kohlrabi leaf`, `kohlrabi greens`, `feuille de chou-rave` | Narrow search inflections | Part-qualified variants only. Do not add bare `greens`, `feuilles`, `kohlrabi`, or `chou-rave` aliases. |
| `ingredient-ref-kohlrabi` (`kohlrabi / chou-rave`, `VEGETABLE_AND_AROMATIC`) | Preserve unchanged | Its existing OQLF source establishes the crop name and taxon. It does not establish leaf use. Do not merge the leaf identity into the enlarged stem/bulb reference or transfer the reference's existing data as leaf evidence. |
| Kale, collards, spinach, turnip greens, cabbage leaves, and other *Brassica* leaves | Keep separate | Sources compare kohlrabi leaves to other greens as a cooking analogy. That wording does not establish identity equivalence, aliases, or substitutions. |
| Stems, enlarged stem/bulb, roots, flowers, seeds, sprouts, and other plant parts | Exclude from the leaf identity | The proposal covers leaves only and does not generalize edible-part claims across the crop or genus. |
| Harvest, size, storage, cooking, and nutrition details | Keep source-scoped | The Iowa State page's up-to-four-day leaf storage direction remains on that page. The Québec source's regional culinary context and the extension sources' comparisons do not establish a catalog form, reusable quantity, yield, conversion, or substitution. |
| Branded products, commercial lines, flavours, SKUs, and retailer variants | Out of scope | They do not add ingredient diversity. No commercial roster was researched or proposed; existing branded rows and evidence remain untouched. |

The sources' raw, cooked, and greens-style use descriptions do not establish separate raw/cooked forms or quantitative behavior. Ricardo's comparison to kale/collards and Minnesota's comparison to spinach remain source-specific preparation analogies, not substitution evidence.

## Sources

The source IDs below were proposal-local unless explicitly identified as an existing ledger source. Integration assigned the ledger IDs `WP03-K-KOHLRABI-LEAVES-R897-20261019-S01` through `S03`; `WP03J-S10` remains shared with the existing crop reference.

| Source ID | Source | Supports and limits |
|---|---|---|
| **Existing `WP03J-S10`** | Office québécois de la langue française, [GDT: *chou-rave*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296983/chou-rave), updated 1990; accessed 2026-10-19. | Already owned by the existing `ingredient-ref-kohlrabi` ledger record. Gives `chou-rave / kohlrabi` and *Brassica oleracea* var. *gongylodes*. It supports the crop name and taxon only, not leaf edibility or the compound `feuilles de chou-rave`. Reusing it here is limited to that reviewed taxonomic/name boundary. `sourceKind: regional_authority`. |
| `WP03-K-KOHLRABI-LEAVES-R897-20261019-S01` | Ricardo Cuisine, [5 faits sur le chou-rave](https://www.ricardocuisine.com/chroniques/l-ingredient/792-5-faits-sur-le-chou-rave), accessed 2026-10-19. | Uses the exact French phrase `feuilles de chou-rave`, says the leaves may be eaten raw or cooked, and describes cooking them as leafy vegetables. Supports Québec wording and generic culinary use. It gives no species name or quantity; matching its common crop name to the OQLF taxon is the inference stated above. Its cooking comparisons are not substitutions. `sourceKind: culinary_reference`. |
| `WP03-K-KOHLRABI-LEAVES-R897-20261019-S02` | University of Minnesota, Real Life, Good Food, [Kohlrabi](https://reallifegoodfood.umn.edu/vegetables/kohlrabi), accessed 2026-10-19. | Directs readers to separate and rinse leaves and describes using kohlrabi leaves similarly to spinach. Supports leaf-part identification and culinary use, not a substitution, measurement, or storage rule. `sourceKind: extension`. |
| `WP03-K-KOHLRABI-LEAVES-R897-20261019-S03` | Iowa State University Extension and Outreach, [Kohlrabi](https://spendsmart.extension.iastate.edu/produce-item/kohlrabi/), accessed 2026-10-19. | Separates the greens from the bulb and gives a stir-fry side-dish preparation. Its four-day leaf storage instruction and all bulb-specific dimensions, recipe directions, and nutrition values remain source-specific; none is transferred. `sourceKind: extension`. |

No manufacturer, branded-product, SKU, or retailer-variant evidence was used. No product measurement or claim is generalized to the ingredient.

## Ownership, recipe demand, and picker projection

**Pre-integration ownership snapshot (2026-10-19).** The bundled catalog has 1,924 ingredient references and 201 forms; the research ledger has 2,327 records, 10,979 source entries, and 9,216 distinct source IDs. The legacy candidate file has 56 entries. The manifest lists 114 recipes and 1,123 ingredient rows.

The only active reference for the crop name is `ingredient-ref-kohlrabi` (`kohlrabi / chou-rave`, category `VEGETABLE_AND_AROMATIC`); it has no aliases, forms, density, or unit mappings. Its ledger record cites only the existing OQLF source `WP03J-S10`. Pre-integration exact searches across active names and aliases, forms, legacy candidates, ledger records and source IDs, proposals, batches, and the plan found no owner for `kohlrabi leaves`, `kohlrabi greens`, `feuilles de chou-rave`, `ingredient-ref-kohlrabi-leaves`, or the proposed R897 source-ID prefix. The Minnesota, Iowa State, and Ricardo URLs were unowned before integration and are now recorded in the R897 ledger entry. Preserve the existing crop identity and its OQLF evidence; use the leaf evidence only for this part-specific proposal.

**Bundled recipe demand.** Full-text and structured-row scans of all 114 manifest-listed recipe files found no kohlrabi or `chou-rave` occurrence. There are no bundled leaf-specific lines, measures, or recipe links to preserve or add. The Québec and extension sources establish culinary use outside the bundled corpus; they do not provide a transferable RecipeBook amount.

**Picker projection.** This is a static projection using the current normalized phrase/substring search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), not live picker QA.

| Query | Pre-integration result | With proposal (now active) | Effect |
|---|---|---|---|
| `kohlrabi` / `chou-rave` | Existing crop identity | Existing crop identity plus kohlrabi leaves | Broad crop searches add a visibly part-qualified result. |
| `kohlrabi leaves` / `kohlrabi leaf` | None | `ingredient-ref-kohlrabi-leaves` | Resolves the specific edible part. |
| `kohlrabi greens` | None | `ingredient-ref-kohlrabi-leaves` | Source-attested, crop-qualified wording resolves to the same leaves. |
| `feuilles de chou-rave` / `feuille de chou-rave` | None | `ingredient-ref-kohlrabi-leaves` | Exact descriptive French part search resolves to the leaf identity. |
| Bare `greens`, `leaf` / `leaves`, or `chou` | Existing broad results, where present | Adds this visibly part-qualified identity | The display and source-attested aliases contain these words; they do not create a generic leaf, greens, or cabbage alias. |
| Bare `cabbage` | Existing broad results, where present | Unchanged | No cabbage alias is introduced. |

**Queue and scope review.** The open Section K items cover generic leafy-green/brassica diversity, documented edible plant parts, and other regional greens/shoots. They are not requests to enumerate commercial products. Broccolini remains an existing trademark/alias exclusion, not an assigned research item. No queued Section K line solely asks for a brand, product-line, flavour-family, SKU, or retailer-variant roster. Any roster-only task is out of scope because commercial-product counts do not add ingredient diversity. Existing branded references and product-specific evidence remain unchanged.

## Remaining limits

- The evidence supports kohlrabi leaves as an edible culinary part; it does not support all ages, all *Brassica* leaves, or general leaf-for-leaf substitution.
- The French display is directly attested in a Québec culinary source but is not a separate OQLF terminology ruling.
- No reusable amount, storage value, density, unit mapping, form, conversion, yield, recipe link, or substitution is proposed.


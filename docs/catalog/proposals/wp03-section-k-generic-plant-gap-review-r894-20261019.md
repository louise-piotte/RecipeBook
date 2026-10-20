# WP03 Section K — dill flower-head identity review (R894)

**Status:** Accepted and integrated on 2026-10-19. The review was proposal-only when submitted; root added the identity-only reference and ledger decision in the R893–R895 integration batch.

**Root source recheck:** OQLF supports `aneth` for *Anethum graveolens* and the botanical plant-part term `ombelle`; Minnesota Extension and NDSU Extension support whole dill flower heads/umbels as culinary pickling ingredients. The NDSU bean-recipe head count and Minnesota per-jar instruction remain source-specific.

**Reviewed:** 2026-10-19

**Plan anchor:** Section K remains open for further documented edible plant parts and other regional greens/shoots ([catalog plan, edible-flower checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6627); [regional greens and shoots](../../RecipeBook-global-ingredient-catalog-plan.txt#L6662)). This proposal adds no generic `edible flowers` identity.

## Recommendation

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for **dill flower heads / ombelles d’aneth**, limited to the whole umbel of correctly identified *Anethum graveolens* while it is still green and flexible, with flowers giving way to immature fruits/seeds. This is a distinct culinary plant part used in pickling. It does not represent dill foliage, mature dried dill seed, or every part of the plant.

The OQLF identifies *Anethum graveolens* as `aneth / dill`; the OQLF-hosted Université Laval botanical entry defines `ombelle / umbel`; University of Minnesota Extension describes the whole green, flexible dill flower head in pickles; and North Dakota State University Extension both defines the umbel as a flower head and includes fresh heads in a pickled-bean recipe. These sources support the plant, part, and generic culinary role. They do not establish a Québec retail-availability claim or a reusable amount.

## Proposed data

```json
{
  "id": "ingredient-ref-dill-flower-heads",
  "nameEn": "dill flower heads",
  "nameFr": "ombelles d’aneth",
  "aliasesEn": ["dill head", "dill heads"],
  "aliasesFr": ["ombelle d’aneth"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The French display and singular alias are descriptive compounds built from the OQLF-supported terms `aneth` and `ombelle`; this review did not find an OQLF culinary entry for the exact compound. Keep the French wording provisional pending independent Québec culinary-language review. If accepted, create one ledger identity record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Add no form, recipe link, density, unit mapping, measure, conversion, yield, or substitution.

## Identity and no-transfer boundary

| Evidence or term | Treatment | Limit |
|---|---|---|
| `dill flower heads` / `dill head(s)` | English display and aliases | Whole *A. graveolens* umbels used at the green/flexible stage described by Extension sources. The alias is supported by Extension use of “dill heads”; it does not include leaves or mature dried seed. |
| `ombelles d’aneth` / `ombelle d’aneth` | Descriptive Québec French display and singular alias | Combines the OQLF terms `aneth` and botanical `ombelle`. It is not presented as a standardized culinary compound or as wording attested in a Québec recipe. |
| `ingredient-ref-dill` (`aneth / dill`, `HERB`) | Preserve unchanged | This broad existing herb identity has no source or identity decision in its ledger record. This proposal does not redefine it as leaves, transfer its state, or merge flower heads into it. |
| `ingredient-ref-dill-seed` (`graines d’aneth / dill seed`, `BAKING_AND_SPICE`) | Preserve unchanged | CFIA evidence defines the separate seed ingredient as dried fruit. Its exact ground form, commercial listings, quantities, and other source-specific claims stay with that reference and its cited records. None is transferred to the proposed fresh head. |
| Leaves and stems | Exclude from the new identity | The Minnesota pickling instruction mentions leaves separately from the head. The proposed identity covers the umbel only; adjacent foliage or stem in a particular preparation does not broaden the ingredient. |
| Mature harvested seed, ground seed, or seed-containing spice products | Keep on the existing seed identity | The candidate is limited to a green, flexible head with immature seed. It does not make dried whole or ground seed a flower-head form, or establish equivalence or substitution between heads, leaves, and seed. |
| Pickles, brines, dill-flavored vinegar, spice mixtures, and preserved foods | Keep as preparations | A recipe’s inclusion of a head does not make the finished food or infused liquid a synonym, form, or property of dill flower heads. |
| Cultivars, products, brands, commercial lines, flavours, SKUs, and retailer variants | Out of scope | They do not add ingredient diversity. No commercial roster was researched or proposed. Existing branded identities and evidence remain untouched. |

The NDSU recipe lists 8–16 fresh heads for 4 lb of green or yellow beans; that amount and recipe context remain attached to that recipe. Minnesota Extension describes a whole head with leaves per jar and gives a green/flexible, partly seeded maturity state; that instruction remains its pickling context. Neither source establishes a general heads-per-recipe measure, unit mapping, density, yield, form, or substitution.

## Sources

The identifiers below are proposal-local and were checked against the current ledger. No shared ledger records or source IDs are assigned here.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP03-K-DILL-HEADS-R894-20261019-S01` | Office québécois de la langue française, [GDT: *aneth*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095226/aneth), updated 1982; accessed 2026-10-19. | Gives the French plant term `aneth`, English `dill`, and Latin *Anethum graveolens*. It establishes the base plant naming only; it does not name or establish culinary use of a flower head. `sourceKind: regional_authority`. |
| `WP03-K-DILL-HEADS-R894-20261019-S02` | Office québécois de la langue française, [GDT: *ombelle*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26576069/ombelle), based on Université Laval Herbier Louis-Marie, *Flore nordique du Québec et du Labrador*, vol. 5 (2024); accessed 2026-10-19. | Defines the French botanical term `ombelle` and pairs it with English `umbel`. Supports the descriptive plant-part wording, not a standardized culinary compound or food use. `sourceKind: regional_authority`. |
| `WP03-K-DILL-HEADS-R894-20261019-S03` | University of Minnesota Extension, [Growing dill in home gardens](https://extension.umn.edu/garden-and-home/yard-and-garden/gardening-in-minnesota/growing-dill), reviewed 2026; accessed 2026-10-19. | Identifies dill as *A. graveolens* and says dill pickles use a whole flower head with leaves while the head is green and flexible and seeds are not yet fully mature. Leaves are named separately and are not included in this identity. The per-jar instruction is recipe-context evidence only; it does not establish a general amount. `sourceKind: extension`. |
| `WP03-K-DILL-HEADS-R894-20261019-S04` | North Dakota State University Extension, [Field to Fork: Dill! (FN1934)](https://www.ndsu.edu/agriculture/sites/default/files/2024-04/fn1934.pdf), reviewed 2020; accessed 2026-10-19. | Defines an umbel as the flower head and notes culinary use of seed-bearing umbels. Its pickled-bean recipe specifies 8–16 fresh heads for 4 lb of beans. That ratio, processing method, and yield apply only to that recipe; the source does not establish a transferable measure, conversion, or safe canning rule for other recipes. `sourceKind: extension`. |

No manufacturer, branded-product, SKU, or retailer-variant evidence was used. No product-specific measure or claim is generalized to the generic ingredient.

## Ownership, recipe demand, and picker projection

**Proposal-time ownership snapshot (2026-10-19, before this integration).** The bundled catalog had 1,921 ingredient references and 201 forms; the research ledger had 2,324 records, 10,965 source entries, and 9,206 distinct source IDs. The bundled corpus had 114 manifest-listed recipes and 1,123 ingredient rows.

The only active ingredient references for the dill plant are `ingredient-ref-dill` (`aneth / dill`, category `HERB`) and `ingredient-ref-dill-seed` (`graines d’aneth / dill seed`, category `BAKING_AND_SPICE`). The latter has the separate form `ingredient-form-dill-seed-ground`. Exact phrase, ID, scientific-name, form, legacy-candidate, plan, proposal, batch, and ledger searches found no owner for `dill flower heads`, `dill head(s)`, `ombelle(s) d’aneth`, *A. graveolens* flower heads, or `ingredient-ref-dill-flower-heads`. The OQLF, Minnesota Extension, and NDSU source URLs and this R894 source-ID prefix have no existing ledger owner. The existing dill-seed record and its product-scoped sources remain unchanged; no seed or retailer evidence is transferred.

**Bundled recipe demand.** Two ingredient rows mention general dill: the optional fresh-aromatics row in recipe 111 and the fresh mint-and/or-dill row in recipe 113. Neither names flower heads or umbels; recipe 113’s 2 tbsp applies to the authored chopped fresh mint and/or dill line and cannot be transferred to flower heads. No head-specific recipe link is proposed. The NDSU pickled-bean recipe is external evidence of culinary demand, and its head count remains recipe-specific as described above.

**Picker projection.** This is a static projection using the current normalized phrase/substring search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), not live picker QA.

| Query | Current result | With proposal | Effect |
|---|---|---|---|
| `dill` / `aneth` | Dill, dill seed, and the existing canned Québec redfish row through its `Redfish with dill and mustard` / `Sébaste à l’aneth et moutarde` aliases | Those three plus dill flower heads | The existing prepared-product aliases remain unchanged; the new identity adds only the qualified plant-part result. |
| `dill head` / `dill heads` | None | `ingredient-ref-dill-flower-heads` | Resolves the pickling ingredient to the distinct whole-head identity. |
| `dill flower heads` | None | `ingredient-ref-dill-flower-heads` | Exact part-qualified result. |
| `ombelles d’aneth` / `ombelle d’aneth` | None | `ingredient-ref-dill-flower-heads` | Exact descriptive French part-qualified result. |
| `dill seed` / `graines d’aneth` | Existing seed identity | Unchanged | Seed wording and its ground form remain separate. |

**Queue and scope review.** The open Section K items describe generic leafy-green, edible-part, and regional-plant diversity. The Broccolini trademark mention remains an alias exclusion, not an assigned research task. No queued Section K line solely asks for a brand, product-line, flavour-family, SKU, or retailer-variant roster. Any such roster-only work is out of scope because commercial-product counts do not add ingredient diversity. This proposal preserves all existing branded entries and cited evidence; it does not reuse any product-specific claim.

## Remaining limits

- The culinary head is the whole umbel in the green/flexible, seed-developing state described by the sources. The source limits do not support treating detached flowers, mature seeds, or foliage as interchangeable.
- `ombelles d’aneth` is a transparent descriptive French compound, not a confirmed Québec culinary-market name. Keep it provisional until independently reviewed.
- The sources do not establish local availability, a household quantity, density, conversion, yield, reusable form, or general substitution. Measurement and substitution research remain open.
- The identity assumes correct plant identification; it is not a foraging or wild-plant safety guarantee.


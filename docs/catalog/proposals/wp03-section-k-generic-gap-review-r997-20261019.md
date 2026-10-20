# WP03 Section K: roselle leaves identity review (R997)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic leafy ingredient for leaves of *Hibiscus sabdariffa* L.
- **Scope:** Generic culinary ingredient diversity across ingredient types. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.
- **Plan anchor:** The Section K broad leafy-green, brassica, and plant-part sweep remains open ([catalog plan, Section K](../../RecipeBook-global-ingredient-catalog-plan.txt#L6558)).
- **Mutation scope:** Proposal only. No shared catalog, forms, ledger, plan, roadmap, generator output, recipes, or tests are changed.

## Recommendation

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for the leaves of *Hibiscus sabdariffa* L., displayed as **roselle leaves / feuilles d'oseille de Guinée**. FAO EcoCrop states that *H. sabdariffa* leaves and stalks are eaten as salad vegetables, potherbs, and seasoning; Singapore's NParks species page identifies edible leaves and describes young shoots in salads, soups, and other dishes; and the IRD Herbier de Guyane directly identifies the species' leaves as a sauce ingredient. These sources establish a generic leafy food identity, not retail availability or a universal preparation method. [S01–S03]

Keep the identity scoped to leaves. Do not include bare stalks, calyces, flowers, seeds, seed oil, drinks such as bissap, or other *Hibiscus* species. In particular, this is a separate plant-part identity from the existing dried roselle calyx ingredient. The French display derives the leaf phrase from OQLF's plant-level `oseille de Guinée` name; it is descriptive and does not claim that OQLF has standardized a leaf-product term. [S03; existing OQLF source WP03-FLOWERS-IDENTITIES-20261011-S07]

No measure, form, recipe link, unit mapping, density, yield, or substitution is proposed.

## Minimal proposed reference

```json
{
  "id": "ingredient-ref-roselle-leaves",
  "nameFr": "feuilles d'oseille de Guinée",
  "nameEn": "roselle leaves",
  "aliasesFr": ["feuille d'oseille de Guinée", "feuilles de roselle"],
  "aliasesEn": ["roselle leaf"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

These aliases keep the edible part explicit. Do not add bare `roselle`, `oseille de Guinée`, `sorrel`, `oseille`, `Jamaican sorrel`, or `hibiscus`; they can point to the whole plant, the existing common-sorrel identity, the dried calyx ingredient, a beverage, or other *Hibiscus* species. Do not add botanical names as picker aliases. `Gongura` and `gongura leaves` are not proposed: this review does not establish that regional name as a general alias for all roselle leaves.

## Identity ownership and nearby work

At the review snapshot, the bundled package has **2,010 active ingredient references**, **205 forms**, and **55 legacy candidates**; the ledger has **2,416 records**. Exact and normalized phrase scans covered reference IDs/names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, ledger record text, and nearby proposals. No active reference, form, or legacy candidate owns `ingredient-ref-roselle-leaves`, `roselle leaves`, `roselle leaf`, `feuilles d'oseille de Guinée`, `feuille d'oseille de Guinée`, `feuilles de roselle`, `Hibiscus sabdariffa leaves`, or `gongura`. The new source URLs and R997 source-ID prefix were absent from the ledger.

| Existing owner or evidence | Boundary to preserve |
|---|---|
| `ingredient-ref-roselle-calyces` — dried hibiscus calyces / calices d'hibiscus séchés | Existing identity is the dried calyx product. Its English alias `roselle calyces` remains calyx-qualified. Preserve the current row, retailer sources, and evidence; do not transfer or broaden any product-specific claims or measures to leaves. Its ledger measurement and substitution states remain `not_yet_researched`. |
| `ingredient-ref-common-sorrel` — common sorrel / oseille commune | OQLF identifies *Rumex acetosa* and supports active aliases `sorrel` and `oseille`. Keep those broad terms on common sorrel; roselle leaves use only leaf-qualified wording. |
| OQLF `oseille de Guinée` source, `WP03-FLOWERS-IDENTITIES-20261011-S07` | This source is already owned by the roselle-calyces record and gives the *H. sabdariffa* plant name. Reuse it only as a boundary/naming reference; do not move or duplicate its ledger source entry. |
| Prior roselle decisions | The [Section K edible-flower review](wp03-edible-flowers-identity-review-20261011.md) explicitly kept leaves outside the dried calyx identity. The [Caribbean cuisine gap sweep](wp06-caribbean-english-cuisine-gap-sweep-20261011.md) records the `sorrel` collision and does not assign a leafy roselle identity. This proposal fills that separate plant-part gap without revising either decision. |

The plan's Section K item remains a generic review of other regional greens and plant parts. No queued roster-only task was encountered in this lane. Any brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only item remains out of scope because commercial-product counts do not add ingredient diversity; existing branded entries remain untouched.

## Recipe and form audit

All **114 manifest-listed recipes** and **1,123 ingredient rows** were searched for the proposed ID and normalized forms of `roselle leaves`, `roselle leaf`, `feuilles de roselle`, `feuille de roselle`, `feuilles d'oseille de Guinée`, `feuille d'oseille de Guinée`, `Hibiscus sabdariffa`, `Hibiscus sabdariffa leaves`, `hibiscus leaves`, `roselle`, `roselle greens`, `Jamaican sorrel`, `sorrel leaves`, and `gongura`. There were **zero recipe-file hits and zero ingredient-row hits**. No bundled recipe link, row relink, or recipe quantity is proposed.

The **205 active forms**, both substitution-rule files, and package-yield data contain no roselle-leaf entry or rule. Do not create a form for raw, cooked, dried, chopped, or otherwise prepared leaves from descriptive cooking text. The species sources describe different culinary uses and preparations in their own contexts; they do not establish a shared catalog conversion or globally interchangeable form.

## Measurement and substitution research states

For a new ingredient-reference ledger record, recommend:

- `identityState: verified`;
- `measurementState: researched_no_supported_value`;
- `substitutionResearchState: not_yet_researched`;
- sources S01–S03, with no measurement observations or substitution findings.

The reviewed sources contain no recipe-ready mass, volume, count, or density for roselle leaves. EcoCrop's field-yield figure is an agricultural crop yield, not a kitchen portion or fresh-to-cooked conversion, and is excluded from measurements. NParks and IRD provide no kitchen quantities. No substitute search was performed, so do not record a no-substitute finding or activate a rule. No source-specific preparation detail or measure should be generalized beyond the source that reported it.

## Sources

New sources were accessed online on 2026-10-19. Their IDs are proposal-local and have not been written to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-K-ROSELLE-LEAVES-R997-20261019-S01` | FAO EcoCrop, [*Hibiscus sabdariffa* var. *sabdariffa*](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=6708), “Uses” and “Common names.” | Lists roselle and `oseille de Guinée`, names *H. sabdariffa*, and says its leaves and stalks can be eaten as salad vegetables, potherbs, and seasoning. The leaf-and-stalk wording is used only as generic food-use evidence; stalks are excluded from this proposed identity. Field-yield information is not a kitchen measure. |
| `WP03-K-ROSELLE-LEAVES-R997-20261019-S02` | National Parks Board Singapore, Flora Fauna Web, [*Hibiscus sabdariffa*](https://www.nparks.gov.sg/florafaunaweb/flora/2/0/2096), “Ethnobotanical Uses,” especially “Edible Plant Parts” and “Food (Fruit or Vegetable).” | Identifies edible leaves and describes young shoots as usable raw or cooked in salads, soups, and other dishes; separately describes calyx uses. This supports species and culinary context, not a Québec market name, measure, or universal preparation direction. Only the leaf identity is proposed. |
| `WP03-K-ROSELLE-LEAVES-R997-20261019-S03` | Institut de recherche pour le développement (IRD), Herbier de Guyane, [Oseille péyi](https://herbier-guyane.ird.fr/oseille-peyi/), “Nom scientifique” and “Utilisation — Des feuilles aux saveurs uniques.” | Names *H. sabdariffa* and says its leaves are used to season sauces. The page's Guyane name and culinary description are regional evidence, not a Québec terminology ruling or a general recipe instruction. |
| Existing `WP03-FLOWERS-IDENTITIES-20261011-S07` (owner retained) | OQLF, [GDT: oseille de Guinée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19471115/oseille-de-guinee), currently attached to `ingredient-ref-roselle-calyces`. | Supports the plant-level French name, associated `roselle`, and *H. sabdariffa*. It does not by itself name a leaf ingredient. Keep the existing ledger ownership and use it only for the naming boundary above. |

## Disposition

Recommend one generic, leaf-qualified *Hibiscus sabdariffa* identity. Preserve the existing dried roselle calyx and common-sorrel entries, aliases, source ownership, and evidence. Keep French wording descriptive, add no unqualified sorrel/oseille/hibiscus terms, and add no forms, measures, recipes, conversions, yields, or substitutions. Section K's broader generic plant-part sweep remains open.

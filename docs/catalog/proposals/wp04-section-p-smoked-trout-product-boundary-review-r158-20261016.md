# WP04 Section P — smoked trout product-boundary review (R158)

- **Reviewed / sources accessed:** 2026-10-16.
- **Recommendation:** Add identity-only `smoked trout / truite fumée` as `ingredient-ref-smoked-trout`, category `PROTEIN`, with no aliases.
- **Scope:** A finished-food market product group. It is not a trout species, a form attached to a raw-trout species, or a claim that every smoked-trout product uses one smoke method, species, storage state, cut, or ready-to-eat treatment.
- **Status:** Proposal-only. No shared catalog JSON, ledger, forms, recipes, plan, roadmap, README, or generated index was changed. No tests or builds were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01` through `S07`; repository audit ID `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-R01`. These are not shared-ledger allocations.

## Open checklist and prior-work boundary

The Section P parent still covers salmon, trout, and regional fish. Its separate preserved-fish item keeps generic smoke, salt-cure, drying, canning, packing, and fermentation states inactive unless a specific recipe or product warrants a narrower record. The [R157 integration](../batches/wp02-wp03-wp04-r157-gap-review-integration-20261016/README.md) resolves only horse mackerel / chinchard. The [R149 smoked-haddock review](wp04-section-p-smoked-haddock-product-identity-review-r149-20261015.md) accepts a distinct smoked product scoped to the existing haddock species; it does not cover trout. The broad [preserved-fish boundary review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) likewise does not decide a smoked-trout product identity.

A focused scan of the current proposal and batch archive, plan, and roadmap found no smoked-trout identity decision, hold, or allocation. This review concerns only the market product named smoked trout. It keeps the existing brook trout, lake trout, and rainbow trout species rows unchanged, and does not reopen smoked haddock, smoked salmon, trout spreads, trout pastries, or generic preservation forms.

## Québec naming, species scope, and product state

OQLF normalizes **truite arc-en-ciel** for *Oncorhynchus mykiss* and notes that rainbow trout is the Québec trout species raised commercially in aquaculture. Its separate entry describes **truite steelhead** as an anadromous variety of rainbow trout. These entries support the species names and show why a steelhead product listing should not be treated as evidence for a separate species row. They do not standardize `truite fumée` as a product term or assign every product called smoked trout to *O. mykiss*. [S01, S02]

Current Québec-facing sources directly use the product wording **truite fumée**. Fumoir Beira Nova in Saint-Eustache lists maple-and-pepper smoked trout as cold-smoked rainbow trout. Montréal fishmonger La Mer lists smoked steelhead trout that is filleted and cold-smoked on site. Ferme piscicole des Bobines lists sliced smoked trout and a separate hot-smoked trout fillet; it also distinguishes a prepared smoked-trout spread. Aliments du Québec lists a smoked-and-sliced trout product in 60 g and 120 g sizes, and a separate rainbow-trout hot-smoked fillet. Together these sources establish the food-product category and Québec French market usage. They also show product-specific differences in smoking temperature, cut, slicing, and preparation. [S03–S06]

Use `smoked trout / truite fumée` as an identity-only product group, not as a universal smoked form or a taxonomic identity. Keep the product identity separate from plain trout species and from separately named composite products such as smoked-trout spread or trout pastry. Do not add `rainbow trout`, `steelhead`, cold-smoked, hot-smoked, sliced, fillet, frozen, or ready-to-eat terms as aliases. The current sources do not establish those as universal attributes of the product group. This catalog display is a food-market name, not a representation that CFIA has authorized a single fish-label name for all products described as smoked trout. [S01–S07]

## Exact ownership and ID audit

At proposal handoff the live snapshot contained **1,530 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,875 research-ledger records / 7,949 source entries / 6,797 distinct source IDs**. The manifest lists **114 recipes / 1,123 ingredient rows**. Accent-, punctuation-, and case-normalized exact checks covered active reference names and aliases, form labels and match terms, legacy-candidate names and aliases, and ledger record strings.

| Candidate phrase or ID | Exact active owner | Allocation result |
|---|---|---|
| `smoked trout`; `smoked trout fillet`; `smoked rainbow trout`; `smoked steelhead trout`; `truite fumée`; `truite fumée à froid`; `truite arc-en-ciel fumée`; `cold smoked trout`; `hot smoked trout` | None in reference names/aliases, forms, legacy candidates, or ledger record terms. | No exact product reference or form exists. Do not attach the phrase to `ingredient-ref-rainbow-trout`, `ingredient-ref-brook-trout`, or `ingredient-ref-lake-trout`. |
| `ingredient-ref-smoked-trout`; `candidate-smoked-trout` | None in references, forms, legacy candidate IDs, or ledger record IDs. | Both prospective IDs are unallocated. The recommendation uses the reference ID only; no legacy candidate is proposed. |
| `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01`–`S07`; `…-R01` | No ledger source-ID or focused proposal/batch archive collision. | Source labels are unique to this proposal and remain proposal-local until integration. |
| Nearby product row `ingredient-ref-smoked-haddock` | Existing smoked-haddock product scoped to haddock / *Melanogrammus aeglefinus*. | Separate product and species scope; no trout term is owned. |

The R158 source-ID prefix and all eight proposed IDs were checked against the current ledger and focused archive before drafting. No ID is reserved under this proposal.

## Static picker projection

The projection mirrors the phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including reference names, aliases, and attached form terms. The hypothetical row uses only `smoked trout / truite fumée`, empty aliases, and no forms.

| Query | Current results | With proposed row | Impact |
|---|---|---|---|
| `smoked trout` | None | Smoked trout / truite fumée | The specific English product phrase finds the finished-product identity. |
| `truite fumée` | None | Smoked trout / truite fumée | The Québec-facing product phrase finds the same identity. |
| `trout` | Brook trout; lake trout; rainbow trout | Those three plus smoked trout | Still a multi-result query; the product row does not replace or alias a trout species. |
| `truite` | Brook trout; rainbow trout | Those two plus smoked trout | Still a multi-result query. The French name for lake trout is `touladi`, not a generic `truite` term. |
| `smoked` | Six existing results, including smoked haddock | Those six plus smoked trout | Remains broad and multi-result. |
| `fumée` | Three existing results | Those three plus smoked trout | Remains broad and multi-result. |
| `rainbow trout`; `truite arc-en-ciel` | Rainbow trout | Unchanged | The species-specific identity stays distinct. |
| `smoked rainbow trout`; `cold smoked trout`; `hot smoked trout`; `smoked fish`; `poisson fumé` | None | None | No species or process alias and no generic smoked-fish identity is added. |

## Manifest recipe scan

The manifest-ordered scan parsed all **114 recipe files** and all **1,123 structured ingredient rows**. It searched complete recipe JSON and ingredient-row values for `smoked trout`, `smoked trout fillet`, `smoked rainbow trout`, `smoked steelhead trout`, `truite fumée`, `truite fumée à froid`, `truite arc-en-ciel fumée`, `cold smoked trout`, `hot smoked trout`, `smoked fish`, and `poisson fumé`. It found **zero matching files and zero matching ingredient rows**. Separate broad `trout` and `truite` row searches also returned zero. No bundled recipe selects a species, smoke state, cut, amount, link, or substitution for this product. [R01]

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Add none. Sources distinguish cold-smoked trout, hot-smoked trout fillet, sliced product, and a separate smoked-trout spread. No single smoke method, cut, temperature, frozen/chilled state, or ready-to-eat treatment is established for the generic product identity. Do not add a `smoked` form to any raw trout species.
- **Measurements:** Use `defaultDensity: null` and `unitMappings: []`. The observed 60 g, 70 g, 85 g, 120 g, 200 g, 250 g, and 300 g quantities are vendor package variants, not reusable portions, piece weights, or household measures. No source supports a standard count-to-mass, mass-volume, or volume-to-mass mapping for smoked trout.
- **Conversions and yields:** Add none. No source establishes density, thawing conversion, edible yield, cooking yield, or package yield for the product group. Do not apply raw-trout nutrition or refuse figures to smoked products.
- **Substitutions:** Add no global or contextual substitution, amount, warning, or recipe-line link. Product and recipe evidence does not establish interchangeability between smoked and raw trout, hot- and cold-smoked products, smoked trout and smoked haddock, or smoked trout and smoked salmon.

## Proposed reference delta

```json
{
  "id": "ingredient-ref-smoked-trout",
  "nameEn": "smoked trout",
  "nameFr": "truite fum\u00e9e",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

No form, measurement observation, unit conversion, yield, recipe link, or substitution record is proposed.

## Proposed ledger delta

The accepted identity record should use the source register below and a single decision limited to the named finished-product group:

```json
{
  "recordId": "ingredient-ref-smoked-trout",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {"sourceId": "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01", "sourceKind": "regional_authority"},
    {"sourceId": "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S02", "sourceKind": "regional_authority"},
    {"sourceId": "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S03", "sourceKind": "other"},
    {"sourceId": "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S04", "sourceKind": "other"},
    {"sourceId": "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S05", "sourceKind": "other"},
    {"sourceId": "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S06", "sourceKind": "other"},
    {"sourceId": "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S07", "sourceKind": "regional_authority"}
  ],
  "decisions": [{
    "outcome": "accepted",
    "reason": "Add identity-only smoked trout / truite fumée as a finished-food market product group, separate from raw trout species and from smoked-trout spread or pastry. Current Québec producer and retailer listings support the bilingual product wording, while product-specific sources show cold-smoked and hot-smoked presentations, different cuts, and package sizes. Add no forms, measurements, conversions, yields, recipe links, or substitutions.",
    "sourceIds": [
      "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01",
      "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S02",
      "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S03",
      "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S04",
      "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S05",
      "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S06",
      "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S07"
    ]
  }]
}
```

The repository audit ID `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-R01` is proposal provenance and is not included as an external ledger source.

## Source register

Sources were accessed on 2026-10-16. IDs remain local to this proposal.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| **WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01** | Office québécois de la langue française, [GDT: truite arc-en-ciel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel), updated 2011. | Gives preferred Québec `truite arc-en-ciel`, English `rainbow trout`, and *Oncorhynchus mykiss* in edible-fish and ichthyology domains. Its note concerns Québec trout species and aquaculture; it does not say every smoked-trout product uses this species or standardize the smoked-product phrase. |
| **WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S02** | Office québécois de la langue française, [GDT: truite steelhead](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8409333/truite-steelhead), updated 1989. | Defines steelhead as a variety of rainbow trout and pairs `truite steelhead` with English `steelhead trout`. Terminology and biological scope only; it does not establish a universal product state. |
| **WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S03** | Fumoir Beira Nova, [Truite fumée à l’érable et aux poivres](https://www.beiranovafoods.ca/produit/truite-fumee-a-lerable-et-aux-poivres/), current product page; business address in Saint-Eustache, Québec. | Lists a Québec-made cold-smoked rainbow-trout product with maple syrup and pepper, sold in 85 g and 300 g package options. These identify one product and package sizes; they are not a general smoke method, measure, or species assignment for every smoked-trout listing. |
| **WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S04** | Ferme Piscicole des Bobines, [Nos produits](https://www.lesbobines.com/fr/produits/) and [Our products](https://www.lesbobines.com/en/products/), accessed 2026-10-16. | The Québec producer describes its trout as locally processed farmed product; lists sliced smoked trout in 70 g and 200 g formats, a separate hot-smoked trout fillet, and a separate 125 g smoked-trout spread. The page does not provide a species binomial for every listed product or support treating the spread as plain smoked trout. |
| **WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S05** | Aliments du Québec, [Smoked and sliced Trout (Refresh)](https://alimentsduquebec.com/en/certified-products/fish-and-seafood/smoked-and-sliced-trout-refresh), current product profile. | Lists a Grizzly smoked-and-sliced trout product as farmed fish, in 60 g and 120 g sizes, with IGA, Metro, and other distributors. Its related-product list separately names rainbow-trout hot-smoked fillet. Directory and product-market evidence, not a process definition, stock guarantee, species declaration for the main listing, or recipe measure. |
| **WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S06** | Poissonnerie La Mer, Montréal, [Smoked Trout](https://www.lamer.ca/en/products/truite-fumee-maison), current online listing. | Lists smoked Steelhead trout, never frozen, filleted and cold-smoked in-house, with whole 250 g and sliced 250 g options and next-day ordering. OQLF scopes steelhead as rainbow trout; the fishmonger’s method and portion are product-specific, not generic form or serving evidence. |
| **WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S07** | Canadian Food Inspection Agency, [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), modified 2019-06-28; accessed 2026-10-16. | Says the Fish List provides acceptable Canadian English/French fish-label common names, scientific names, and taxonomic serial numbers. This review does not claim that the catalog product-group display is itself one CFIA-approved species label, and the overview does not define smoked-trout processing states. |
| **WP04-SECTIONP-SMOKED-TROUT-R158-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4980), [preserved-fish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5757), [live references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), manifest-listed recipes, `IngredientSearch.kt`, and WP04 proposal/batch archive. | Read-only ownership, ID/source-ID, archive, picker, and recipe audit at 1,530 references, 119 forms, 61 legacy candidates, 1,875 ledger records / 7,949 source entries / 6,797 distinct source IDs, and 114 recipes / 1,123 ingredient rows. Repository snapshot only. |

## Final recommendation

**Accept** an identity-only `smoked trout / truite fumée` reference for the finished-food product group. The Québec term is directly attested by current Québec producers and retailers, and the exact phrases add a useful result while broader `trout` and `truite` searches remain multi-result. Keep species, hot/cold smoke method, cut, sliced state, storage state, spreads, and other preparations product-specific. Add no aliases, forms, measurements, density, mappings, conversions, yields, recipe links, or substitutions. No tests were run for this proposal-only documentation change.

# WP04 Section P — smoked mackerel product-boundary review (R167)

- **Reviewed / sources accessed:** 2026-10-16.
- **Recommendation:** Integrate identity-only `smoked mackerel / maquereau fumé` as `ingredient-ref-smoked-mackerel`, category `PROTEIN`, with no aliases or forms.
- **Scope:** The named smoked-fish market product group. It is not a mackerel species, a universal `smoked` form on a species, or a claim about every product's species, cut, seasoning, smoke temperature, storage, or readiness.
- **Status:** Proposal-only. No shared catalog JSON, legacy identity file, ledger, manifest, recipe, plan, roadmap, README, generated file, or code was changed. No tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S01` through `S09`; audit ID `WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-R01`. These IDs are not shared-ledger allocations.

## Why this is a distinct open gap

The [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5882) keeps smoked and other preserved fish/seafood product states open. The [broad preservation review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) holds universal preservation forms inactive unless a specific product is supported. The [mackerel species review](wp04-pollock-mackerel-species-boundary-review-20261009.md) scopes active raw-fish rows to species and omits bare `mackerel / maquereau`; the [R157 horse-mackerel review](wp04-section-p-horse-mackerel-chinchard-picker-boundary-review-r157-20261016.md) concerns a separate market-name/taxon boundary. Neither allocates smoked mackerel.

The archive has no focused `smoked mackerel / maquereau fumé` decision, hold, or row. R154–R166 do not decide this product. The [R158 smoked-trout](wp04-section-p-smoked-trout-product-boundary-review-r158-20261016.md) and [R159 smoked-mussels](wp04-section-p-smoked-mussels-product-boundary-review-r159-20261016.md) reviews concern different finished-food groups; they are precedents for keeping product identities separate from raw species and universal smoke forms, not decisions reopened here.

Current Québec producer and retailer pages repeatedly use the base product wording `maquereau fumé` and `smoked mackerel`. They also show why the catalog row must remain at the product-group level: the pages do not establish one scientific species or a universal cut, seasoning, smoke process, storage condition, or package quantity. The exact bilingual base term supports an identity-only row without assigning products to Atlantic, Pacific, or Spanish mackerel species.

## Bilingual naming, species, and process limits

OQLF's existing GDT entry pairs Québec `maquereau` with English `mackerel` and identifies *Scomber* sp.; the existing CFIA Fish List observation includes several mackerel taxa. The live catalog accordingly keeps Atlantic, Pacific, and Spanish mackerel identities distinct. These naming sources do not identify the species in the smoked-product listings. [Reused sources `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06` and `S07`]

Current sources include Atkins et Frères' hot-smoked mackerel fillets with several seasonings; a Québec seller's frozen `maquereau fumé cajun`; and Fumoir d'Antan products named `Maquereau fumé au poivre`, `Maquereau fumé d'Antan`, and English `Pepper Smoked Mackerel`. Les Pêcheries Gaspésiennes also list smoked mackerel fillets. These source-specific terms support the base product group, but do not support making `hot-smoked`, pepper, Cajun, `fillet`, frozen, or ready-to-eat wording global aliases or forms. No current source assigns a Latin name to the reviewed retail products.

Treat the proposed row as a searchable market-product identity. Keep the active species rows unchanged. Do not attach `smoked` to Atlantic, Pacific, or another mackerel species; do not add a generic smoked-fish identity; and do not include canned, oil-packed, water-packed, salted, dried, fermented, or jack-mackerel products in this decision. Keep storage and safe-use instructions product-specific; smoke wording alone does not establish that a product is ready to eat.

## Exact ownership and source-ID audit

The read-only snapshot used for this proposal contains **1,542 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,886 research-ledger records** with **8,050 source entries / 6,889 distinct source IDs / 5,687 distinct URLs**. The manifest contains **114 recipe files and 1,123 ingredient rows**.

Exact normalized-key checks followed `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase with `Locale.ROOT`, NFKD folding, accent/ligature/punctuation normalization, then whitespace collapse. Checks covered active reference names and aliases, form labels and match terms, legacy candidate IDs/names/aliases, and every string in ledger records, including record text, source IDs, and source URLs.

| Candidate phrase or ID | Live exact owner | Disposition |
|---|---|---|
| `smoked mackerel`; `smoked mackerels`; `smoked mackerel fillet(s)`; `pepper smoked mackerel`; `maquereau fumé`; `maquereaux fumés`; `filets de maquereau(x) fumé(s)`; `maquereau fumé au poivre`; `maquereau fumé cajun`; `maquereau fumé à chaud` | No exact active reference, form, legacy candidate, or ledger-record text owns these product phrases. | No smoked-mackerel product identity or form exists. Keep product-specific cut, spice, and hot-smoke phrases out of global aliases.
| `ingredient-ref-smoked-mackerel`; `candidate-smoked-mackerel` | No matching active reference, form, legacy ID, or ledger record ID. | The proposed reference ID is unallocated; no legacy candidate is proposed.
| `ingredient-ref-atlantic-mackerel` | `Atlantic mackerel / maquereau de l’Atlantique`, with no aliases, attached forms, density, or unit mappings. Existing identity evidence includes `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06` through `S09`. | Keep the species reference unchanged; do not assign the smoked products to it.
| `ingredient-ref-pacific-mackerel`; `ingredient-ref-spotted-spanish-mackerel`; `ingredient-ref-narrow-barred-spanish-mackerel` | Existing species-scoped identities; none has an attached form, density, or unit mapping. | Keep the species rows unchanged; do not infer any of these taxa from the product listings.
| `WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S01`–`S09`; audit `…-R01` | No exact source-ID collision in the ledger or the inspected proposal/batch archive. | New source labels remain proposal-local and unallocated.

The existing OQLF and CFIA Fish List URLs are already registered to mackerel species records: OQLF source `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S07` is attached to `ingredient-ref-atlantic-mackerel`; CFIA Fish List source `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06` is reused by the Atlantic, Pacific, and spotted Spanish mackerel records. The CFIA fish-labelling guidance URL is already registered under `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07`; it is reused only for the general product-state limit below. None of the new producer or retail URLs in the source register has an exact existing ledger URL owner.

## Picker projection

The projection mirrors phrase-first search over reference names, aliases, and attached forms in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row contains only `smoked mackerel / maquereau fumé`, with empty aliases and no forms.

| Query | Current results | With proposed row | Consequence |
|---|---|---|---|
| `smoked mackerel` | None | Smoked mackerel / maquereau fumé | Exact English product phrase becomes searchable.
| `maquereau fumé` | None | Smoked mackerel / maquereau fumé | Exact Québec-facing product phrase becomes searchable.
| `mackerel` | Atlantic, Pacific, narrow-barred Spanish, and spotted Spanish mackerel | Those four plus smoked mackerel | Remains a multi-result query and distinguishes species from the finished product.
| `maquereau` | Atlantic mackerel, Pacific mackerel, and gooseberry | Those three plus smoked mackerel | Remains multi-result; the gooseberry result already comes from `groseille à maquereau`.
| `Atlantic mackerel`; `maquereau de l’Atlantique` | Atlantic mackerel only | Unchanged | Qualified species queries remain exact.
| `smoked`; `fumé` | Eight and four results, respectively | Nine and five results | Both broad process searches remain multi-result.
| `maquereaux fumés`; `filets de maquereau fumé au poivre`; `maquereau fumé cajun`; `hot-smoked mackerel` | No result | No result | Do not alias plural, cut, seasoning, or one product's hot-smoke descriptor to the broad product group.

The proposed singular French display follows OQLF's normalized base name `maquereau` and the current retailer wording `maquereau fumé`. No plural alias is added: the current active species rows use singular `maquereau` terms, and an alias `maquereaux fumés` would make the broad plural query resolve only to this prepared product. Exact product variants remain separately bounded.

## Manifest recipe demand

The manifest-ordered audit parsed all **114 recipe files** and all **1,123 structured ingredient rows**, then scanned every decoded JSON string field and each ingredient-row value. Search terms included `smoked mackerel`, singular and plural variations, `pepper smoked mackerel`, `maquereau fumé`, `maquereaux fumés`, `maquereau fumé au poivre`, `filets de maquereau fumé`, `maquereau fumé cajun`, and broad `mackerel / maquereau`. It found **zero matching recipe files and zero matching ingredient rows**. No recipe role, amount, method, ingredient link, or substitution selects this product. [R01]

## Forms, numeric data, and substitutions

- **Forms:** All four active mackerel species references have no attached forms. Add no `smoked` form to any species row. The proposed finished-product identity is not a form and does not assert one universal smoke temperature, seasoning, cut, or storage state.
- **Density and unit mappings:** Existing Atlantic, Pacific, narrow-barred Spanish, and spotted Spanish mackerel references all have `defaultDensity: null` and `unitMappings: []`. Their ledger measurements remain unresearched for reusable kitchen quantities. No mackerel entry occurs in the global or contextual substitution-rule files or unit-conversion list. Set the proposed product row to null density and empty mappings.
- **Observed quantities:** Current pages show product-specific packages, including 150 g for an Atkins Cajun item, 180 g for Fumoir d'Antan pepper-smoked items, and the same 180 g SKU on Metro with product code `627843771470`. La Mer's collection tile lists its Fumoir d'Antan item as 150 g while its English and French detail pages say 180 g. Metro marked the item out of stock for its selected store when reviewed; that is not a general availability claim. These page- and SKU-specific values are not serving amounts, piece weights, household measures, densities, or conversion factors.
- **Conversions and yields:** Add no package conversion, draining rule, edible yield, curing/smoking loss, thawing conversion, or cooked yield. The product pages do not establish a matching raw weight or preparation yield. Do not transfer raw-species nutrition or portion observations to smoked mackerel.
- **Substitutions:** Add no global or contextual substitution, warning, amount, or recipe-line link. The corpus has no dish role or method to scope a replacement. No reviewed evidence establishes interchangeability among smoked mackerel, raw mackerel species, other smoked fish, canned/oil-packed mackerel, or another seafood product. CFIA's general fish-labelling guidance treats product condition and handling statements as product-specific; do not infer ready-to-eat or storage behavior from the proposed identity.

## Proposed delta

Add one identity-only `PROTEIN` reference:

```json
{
  "id": "ingredient-ref-smoked-mackerel",
  "nameEn": "smoked mackerel",
  "nameFr": "maquereau fum\u00e9",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

If accepted, add one verified ledger record `ingredient-ref-smoked-mackerel`, with measurement state `researched_no_supported_value`, substitution state `researched_no_supported_substitute`, the source IDs below plus reused mackerel naming sources, and an accepted decision limited to this finished-product group. Add no form, legacy identity, recipe link, conversion, measure, yield, or substitution record. Keep every new source ID proposal-local until integration.

## Source register

Online sources were accessed on 2026-10-16. New IDs below are proposal-local. Existing OQLF/CFIA IDs are cited as reused evidence and remain owned by their current ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S01** | Atkins et Frères, [official product overview](https://www.atkinsetfreres.com/). | Current producer page lists hot-smoked mackerel fillets and multiple sea-product lines. It supports the product group and one hot-smoked presentation, not all mackerel species or a universal process.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S02** | Atkins et Frères, [Filets de maquereau fumé — poivre de Malabar](https://www.atkinsetfreres.com/produits/filets-de-maquereau-fume-poivre-de-malabar-5). | Producer page says its mackerel comes from Québec maritime and describes light salting, Malabar pepper, herbs, lemon-pepper or Cajun seasoning, and hot smoking. No scientific species or reusable measure is given.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S03** | Les Pêcheries Gaspésiennes, [Produits](https://pecheriesgaspesiennes.com/produits/). | Current Gaspésie product page lists `filets de maquereau fumé` separately from smoked herring, cod, turbot, and trout. It does not identify species or state a package measure.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S04** | Les Poissonneries Odessa, [Maquereau fumé au poivre](https://odessapoissonnier.com/collections/odessa-anjou/products/maquereau-fume-au-poivre). | Current Montréal-region retailer page identifies a Fumoir d'Antan pepper-smoked product, 180 g, from the Îles-de-la-Madeleine. Seller package information only; no binomial or serving basis.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S05** | Maturin, [Poissons fumés du Québec](https://www.maturin.ca/categorie/poissonnerie/poissons-et-fruits-de-mer-prepares/poissons-fumes). | Current Québec marketplace listing includes Atkins et Frères `Maquereau fumé cajun`, frozen, 150 g. It shows one seasoned seller item and package size only.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S06** | Poissonnerie La Mer, [Maquereau fumé d'Antan](https://www.lamer.ca/products/maquereau-fume-poivres-180gr). | French product detail names the item `Maquereau fumé d'Antan`, describes pepper and the Îles-de-la-Madeleine recipe, and calls it frozen. The detail page says 180 g; the retailer's collection tile says 150 g (S08), so neither figure becomes a general measure.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S07** | Poissonnerie La Mer, [Pepper Smoked Mackerel](https://www.lamer.ca/en/products/maquereau-fume-poivres-180gr). | English detail-page title supplies `Pepper Smoked Mackerel`; the page says the product is frozen and displays 180 g. Product-specific wording and package metadata, not a species or preparation rule.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S08** | Poissonnerie La Mer, [Produits fumés](https://www.lamer.ca/collections/produits-fumes). | Current collection tile calls the Fumoir d'Antan item `Maquereau fumé d'Antan - 150 gr`, conflicting with the linked detail pages' 180 g. Treat the two page values as listing-specific and do not derive a measure.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S09** | Metro, [Filets de maquereau fumé au poivre Le Fumoir d'Antan, product 627843771470](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/filets-de-maquereau-fume-au-poivre/p/627843771470). | Retail page names pepper-smoked mackerel fillets and lists 180 g. It showed the selected item out of stock for the store view accessed; this is not a general market availability statement. It supplies no scientific species or reusable quantity.
| **Reused: WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06** | CFIA, [Fish List mackerel query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?c=&lang=e&q=Mackerel). | Existing species-ledger source; lists several mackerel taxa. Reused to keep product wording separate from species assignment.
| **Reused: WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S07** | OQLF GDT, [maquereau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198842/maquereau). | Existing source on the Atlantic-mackerel ledger record; supports Québec `maquereau`, English `mackerel`, and *Scomber* sp. It does not assign the smoked retail products to a species.
| **Reused: WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Existing source on the smoked-mussels ledger record; used only to avoid inferring a product's handling or readiness from a smoke descriptor.
| **WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-R01** | [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5882), prior Section P mackerel/product-state proposals, active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), [substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest-listed recipe files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Repository audit for exact-key ownership, source-ID/URL ownership, picker projection, recipe corpus, forms, quantities, density, mappings, conversions, and substitutions at the snapshot counts stated above.

## Final disposition

**Integrate** `ingredient-ref-smoked-mackerel` as the identity-only finished-food group `smoked mackerel / maquereau fumé`, with no aliases, forms, measures, recipe links, or substitutions. Current Québec producers and retailers use both base-language terms and distinguish the product from species-specific mackerel names. Keep species, smoke method, cut, seasoning, package, storage, and readiness details on their source-specific product pages; do not infer them from the proposed catalog identity.

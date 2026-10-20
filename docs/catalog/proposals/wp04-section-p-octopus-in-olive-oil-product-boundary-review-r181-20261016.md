# WP04 Section P — octopus in olive oil product-boundary review (R181)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** Canned octopus in olive oil; Québec-facing product wording includes *poulpe à l’huile d’olive*.
- **Recommendation:** **Add** identity-only finished-food market group `octopus in olive oil / poulpe à l’huile d’olive`, separate from generic octopus and other preparations.
- **Scope:** One clearly named preserved cephalopod product. This review does not add a general canned-octopus identity, an octopus form, an oil-packed form, or any brand-specific species, recipe, measure, or substitution behavior.
- **Proposal-local source IDs:** `WP04-SECTIONP-OCTOPUS-OLIVE-OIL-R181-20261016-S01` through `S04`, plus audit ID `WP04-SECTIONP-OCTOPUS-OLIVE-OIL-R181-20261016-R01`. Existing OQLF and CFIA sources are reused by their original IDs below.

## Product boundary and evidence

The open [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5957) tracks canned and packed seafood product states alongside smoked, salted, dried, and fermented products. This is a product-specific octopus boundary under that open item; it does not reopen the generic octopus identity or the prior dried-octopus hold.

The official Conservas de Cambados shop lists its *Pulpo en Aceite de Oliva OL-120 [GOURMET]* as octopus (*Octopus vulgaris*), olive oil, and salt; the manufacturer lists a 120 ml can format and 111 g net weight. Those details belong to this manufacturer’s SKU. Its Galician-sauce octopus is a separate product with additional ingredients and is not included in the proposed olive-oil identity. [S01]

Québec-facing retail evidence supports the product wording in French. The Canadian Solfarmers storefront has a French-language preserved-octopus collection with a currently listed *Poulpe à l’huile d’olive – Conservas de Cambados, 111 g*, separately from its *Poulpe à la sauce galicienne*. Montréal retailer Olive et Gourmando has also listed *Poulpe à l'huile d'olive Conservas de Cambados* and describes the item as a can of octopus preserved in olive oil. OQLF records *pieuvre* and *poulpe* as preferred French terms for the food mollusc corresponding to English *octopus*. [S02–S03; reused `WP04-MOLLUSKS-20261009-S11`]

A different Canadian tinned-octopus listing, La Narval’s octopus with garlic sauce, demonstrates why the proposed name must retain its oil qualifier and exclude sauced octopus. Its ingredients and product description identify a distinct prepared food. This review does not use that product as evidence for a common canned-octopus formula or as a synonym. [S04]

The evidence supports a recognizable named market product and an exact bilingual display pair. It does not establish one species, ingredient list, packing medium, cut, net amount, drained amount, or process for every octopus preserve. Keep all such claims attached to their documented supplier SKU. The proposed row is a finished-food market identity, not an assignment of the Cambados species to generic `octopus / pieuvre`.

## Ownership and collision audit

The read-only snapshot contained **1,558 active ingredient references**, **122 forms**, **61 legacy candidates**, and **1,903 research-ledger records / 8,164 source entries / 6,975 distinct source IDs / 5,771 distinct source URLs**. The bundled manifest lists **114 recipe files and 1,123 ingredient rows**.

Exact normalized-key checks covered reference names and aliases, form labels and match terms, legacy candidate names and aliases, ledger IDs and terms, candidate phrases, source IDs, and source URLs. No exact active, form, legacy, or ledger-term owner was found for `octopus in olive oil`, `poulpe à l’huile d’olive`, `canned octopus`, `tinned octopus`, or `octopus with garlic sauce`. No focused earlier proposal or batch decision was found for octopus in olive oil. The proposed ID `ingredient-ref-octopus-in-olive-oil` and R181 source-ID prefix are unallocated. The Cambados, Solfarmers, Olive et Gourmando, and La Narval URLs have no exact ledger URL owner. The OQLF URL and CFIA fish-labelling URL are reused with their existing source IDs, not re-registered. [R01]

| Nearby owner | Current boundary | Disposition |
|---|---|---|
| `ingredient-ref-octopus` — `octopus / pieuvre`, French alias `poulpe` | Generic edible octopus identity; no attached forms, default density, or unit mappings. | Keep unchanged. The market group is a specific prepared product, not a species or alias for all octopus. |
| Dried octopus proposal / hold | Earlier review leaves dried octopus outside active references pending a recipe that selects the product state. | Keep dried octopus separate; olive-oil canning does not resolve the dried-product hold. |
| `ingredient-ref-calamari` and `ingredient-ref-cuttlefish` | Squid/calamari and cuttlefish/seiche remain separate cephalopod identities. | Do not alias octopus to squid, calamari, or cuttlefish. |
| R160 calamari in marinara | A squid/calamari prepared-food review, not octopus. | No overlap; do not re-use its sauce or identity decision. |
| Smoked octopus or other tinned-octopus sauces | No active exact product owner was found. La Narval garlic-sauce octopus is evidence of a neighboring distinct SKU. | Do not add smoke, garlic sauce, Galician sauce, marinade, or a universal canned form to this row. |

### Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, prefers full word-phrase matches, and falls back to substring matches when no full phrase is found. With the proposed display pair and no aliases, `octopus in olive oil` / `poulpe à l’huile d’olive` would resolve to the new market group.

Broad `octopus` and `poulpe` searches would include both the new product and the existing generic identity. `pieuvre` would continue to return the generic row only because the proposed product display uses the source-attested French retail term `poulpe`. Keep the qualifiers intact; do not add aliases such as `canned octopus`, `tinned octopus`, `octopus`, `pieuvre`, `poulpe`, or bare `octopus in oil`, which would either duplicate generic terms or hide the product’s olive-oil boundary. [R01]

## Bundled-recipe demand

A read-only scan parsed every manifest-listed recipe: **114 files and 1,123 ingredient rows**. Complete recipe JSON and ingredient-row fields were searched for `octopus`, `pieuvre`, `poulpe`, `tako`, canned/tinned-octopus terms, olive-oil wording, and the bilingual product phrases. The scan found **zero matching recipe files and zero matching ingredient rows**. There is no recipe link, requested amount, method, or serving basis supporting a catalog measure or substitution. [R01]

## Numeric, form, and substitution limits

- **Product numeric facts:** The Cambados maker page gives this SKU’s 120 ml can format and 111 g net weight. The Canadian Solfarmers listing also identifies a 111 g retail package. Record these only as supplier-specific observations if the identity is integrated; do not create a 120 ml ingredient measure, generic can size, density, drained weight, or edible-yield value. The evidence does not establish a common package size across brands. [S01–S02]
- **Forms and process:** Do not attach `canned`, `in oil`, `cooked`, `sliced`, or `tentacles` as a reusable form under generic octopus. The proposed product identity itself preserves the specific market name. Do not infer commercial sterility, heat process, drained state, or readiness from the display wording alone.
- **Conversions and yields:** No raw-to-canned, drained-to-net, oil-to-edible-octopus, or package-to-recipe conversion is proposed. No generic octopus density or cooking yield is supported.
- **Substitutions:** No bundled recipe specifies a dish context or amount. Add no global or contextual substitution between this product, raw/frozen octopus, cooked octopus, dried octopus, garlic-sauce or Galician-sauce octopus, squid/calamari, cuttlefish, or another seafood product.

## Proposed delta

Add identity-only `ingredient-ref-octopus-in-olive-oil` in `PROTEIN`, with English display `octopus in olive oil`, French display `poulpe à l’huile d’olive`, and empty alias arrays. Record the bounded product identity and source register in the research ledger. Do not modify `ingredient-ref-octopus`; do not add forms, legacy mappings, measures, mappings, density, recipe links, conversions, yields, or substitutions. Keep *Octopus vulgaris*, 39.6% oil, the 120 ml can format, and 111 g net amount specific to the Conservas de Cambados OL-120 SKU.

## Source register

Pages were accessed on 2026-10-16 unless identified as a reused terminology/labeling source. Proposal-local IDs are provenance labels only and are not shared-ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-OCTOPUS-OLIVE-OIL-R181-20261016-S01** | Conservas de Cambados, [Pulpo en Aceite de Oliva OL-120 [GOURMET]](https://www.conservagourmet.com/es/pulpo/52-pulpo-en-aceite-de-oliva-ol-120-gourmet.html). | Manufacturer’s official product page identifies *Octopus vulgaris*, olive oil (39.6%), salt, 120 ml can format, and 111 g net weight for its SKU. Do not transfer these specifics to generic octopus or other products. |
| **WP04-SECTIONP-OCTOPUS-OLIVE-OIL-R181-20261016-S02** | Solfarmers Canada, [Conserves de poulpe collection](https://www.solfarmers.com/fr/collections/spanishoctopus) and [Gourmet Octopus in Olive Oil, 111 g](https://www.solfarmers.com/products/gourmet-octopus-in-olive-oil). | Canadian French-language seller lists the olive-oil product separately from Galician-sauce octopus and shows a 111 g product. Its listing supports market wording and availability, not a universal package or product formula. |
| **WP04-SECTIONP-OCTOPUS-OLIVE-OIL-R181-20261016-S03** | Olive et Gourmando, [Poulpe à l’huile d’olive Conservas de Cambados](https://oliveetgourmando.com/products/poulpe-a-lhuile-dolive-conservas-de-cambados). | Montréal retailer uses the French product title and describes octopus preserved in olive oil. The current page may show the SKU out of stock; it supports local terminology and product-boundary evidence, not current inventory. |
| **WP04-SECTIONP-OCTOPUS-OLIVE-OIL-R181-20261016-S04** | NaturaMarket Canada, [La Narval Tinned Seafood Octopus with Garlic Sauce, 72 g](https://naturamarket.ca/la-narval-tinned-seafood-octopus-with-garlic-sauce-72g.html). | Canadian retailer identifies a distinct tinned octopus product with garlic sauce and lists octopus, sunflower oil, and garlic. It is used only to preserve a neighboring preparation boundary. |
| **Reused `WP04-MOLLUSKS-20261009-S11`** | OQLF, [GDT: pieuvre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402783/pieuvre). | Lists `pieuvre` and `poulpe` as preferred French terms and English `octopus` in a food-mollusc entry. Its species detail does not assign one taxon to every product. |
| **Reused `WP04-DOYS-S04`** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Guidance distinguishes required product descriptors, package medium, process, and net-quantity facts. Used as boundary context; it does not establish this SKU’s process or measurements. |
| **WP04-SECTIONP-OCTOPUS-OLIVE-OIL-R181-20261016-R01** | Active references/forms, legacy candidates, research ledger, focused proposal/batch archive, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only ownership, source-ID/URL, picker, and recipe-corpus audit. No shared data was changed. |

## Final disposition

**Add** the narrow identity-only market group `octopus in olive oil / poulpe à l’huile d’olive`. The manufacturer provides a primary product specification, and current Canadian/Québec-facing sellers support the bilingual product wording. Keep the existing generic octopus identity unchanged and preserve garlic-sauce, Galician-sauce, dried, raw/frozen, and other product states as distinct. No bundled recipe demand was found; therefore add no aliases, forms, reusable measurements, conversions, yields, recipe links, or substitutions. Do not generalize the Cambados SKU’s species, ingredients, or package values.


## Root integration decision

**Add accepted.** Added identity-only `ingredient-ref-octopus-in-olive-oil` in `PROTEIN` with displays `octopus in olive oil / poulpe à l’huile d’olive` and empty aliases. Registered the manufacturer, Canadian, Montréal, and neighboring garlic-sauce sources in the ledger. Kept the Cambados taxon, ingredients, and package values SKU-specific; no forms, measures, mappings, recipe links, conversions, yields, or substitutions were added. The bundled corpus has no matching recipe demand.

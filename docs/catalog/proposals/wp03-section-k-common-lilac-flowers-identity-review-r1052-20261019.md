# WP03 Section K — common lilac flowers identity review (R1052)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic reference for **common lilac flowers / fleurs du lilas commun**, limited to culinary flowers of *Syringa vulgaris* L.
- **Plan anchor:** Section K remains open to documented edible flowers while prohibiting a generic `edible flowers` identity and cross-genus transfer ([open item, lines 6691–6692](../../RecipeBook-global-ingredient-catalog-plan.txt#L6691)).
- **Scope:** Generic culinary plant-part diversity. No brand, product-line, flavour-family, SKU, retailer-variant, or commercial-roster research is included.
- **Mutation scope:** Proposal only. This file is the only proposed change; the catalog, forms, ledger, recipes, plan, roadmap, and generated files remain untouched.

## Identity and plant-part boundary

The live Section K flower checklist calls for another documented edible-flower identity. The UQAC Forêt nourricière page is explicitly headed `Lilas commun, Syringa vulgaris`; under that taxon it identifies the flower as the harvest part and describes culinary uses for the flowers. Colorado State University Extension independently lists *Syringa vulgaris* in its edible-flower table. These sources support a species-bounded flower identity, not edible flowers generally or an edible-part claim across *Syringa*. [S01–S03]

Use **common lilac flowers / fleurs du lilas commun** as descriptive bilingual displays. Canadian VASCAN records `common lilac` / `lilas commun` as vernacular names for *S. vulgaris*; Québec sources use `lilas commun` and `fleurs de lilas` in culinary contexts. The French display is a transparent, provisional compound from those sources, not a claim that OQLF standardizes the full ingredient phrase. An OQLF result for [`lilas`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8488096/lilas) concerns the colour term and is not used as botanical or culinary evidence. Keep aliases empty rather than assigning the unqualified plant or genus name.

The proposed identity covers only the flower part of *S. vulgaris* when used as food. The sources do not establish a more exact edible floral structure (for example, petal-only versus whole florets or inflorescence), so do not encode one. Keep this distinct from the existing rose petals, calendula petals, tawny daylily buds, and all other edible-flower, leaf, fruit, and derived-preparation identities. Do not turn lilac syrup, liqueur, infused dairy, jelly, or other preparations into aliases or forms of this flower identity.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-common-lilac-flowers` |
| nameEn | `common lilac flowers` |
| nameFr | `fleurs du lilas commun` (descriptive; provisional pending independent Québec terminology review) |
| aliasesEn / aliasesFr | `[]` / `[]` |
| defaultDensity | `null` |
| unitMappings | `[]` |
| category | `VEGETABLE_AND_AROMATIC` |
| updatedAt | `2026-10-19T00:00:00Z` |

Add no form, reusable measure, density, unit mapping, conversion, yield, package yield, recipe link, or active substitution. If integrated, create one `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; do not add reusable measurement or substitution observations.

## Live ownership and demand audit

The refreshed package contains **2,058 active references**, **205 forms**, **2,463 research-ledger records**, and **55 legacy candidates**. The manifest contains **114 recipes** with **1,123 structured ingredient rows**. Exact-name, alias, ID, and term scans for `lilac`, `lilacs`, `lilas`, and *Syringa* found no candidate owner in references, forms, legacy candidates, ledger identity records, or bundled recipes.

| Surface | Current finding | Proposal effect |
|---|---|---|
| Active identity owners | No common-lilac or *Syringa* reference exists. Existing adjacent edible-part owners include banana blossom; black elderflowers; borage, butterfly-pea, chive, garlic-chive, dandelion, bee-balm, and moringa flowers; calendula and rose petals; dill flower heads; nasturtium and squash blossoms; dried roselle calyces; culinary lavender; and tawny daylily flower buds. | Add one *S. vulgaris*-flower identity only. Preserve every existing row, alias, and plant-part boundary. |
| Forms and source allocation | No lilac form, form match term, or form owner exists. The Colorado State Extension `Edible Flowers` URL is already cited under separate, part-specific source IDs on borage, chive, and garlic-chive flower ledger records. | If integrated, add a new source entry with a unique ID and a `Syringa vulgaris` table-row locator; do not edit or reuse the existing records' IDs, locators, or support text. |
| Ledger and legacy | No candidate-specific ledger or legacy record was found among the 2,463 ledger records and 55 legacy candidates. The UQAC, VASCAN, and Télé-Québec URLs below have no current ledger owner. | Keep all current source allocations unchanged; the source IDs below are proposal-local. |
| Bundled recipe demand | All 114 recipe files and 1,123 ingredient rows were scanned for lilac/lilas and *Syringa* terms; there are **0 matching files and 0 matching rows**. | Add no recipe link or infer recipe demand from external examples. |
| Open queue and scope | The selected open item is generic Section K edible-flower discovery. No brand- or roster-only task was found in this item. | Any queued task limited to commercial products or variants is out of scope because commercial-product counts do not add ingredient diversity; stop that line without researching it. Preserve existing branded entries and product-scoped evidence. |

No existing botanical, quantity, or use claim is transferred from other flowers. The proposal does not reopen any existing branded row or product-specific evidence.

## Numeric evidence and substitution limits

UQAC gives a local harvest window of mid-May to mid-June and describes the flowers as perfumed and bitter. Those observations remain specific to that Québec source and setting; do not create seasonality or sensory fields. Télé-Québec's homemade liqueur recipe uses 500 ml of freshly collected flowers with 500 ml neutral alcohol, added in two batches and steeped for 12 hours per batch. This is one infusion recipe, not a serving amount, density, flower-to-volume conversion, or reusable quantity. No numeric value is proposed for catalog behavior.

The sources describe flavoring, infusion, and other recipe uses, but identify no replacement ingredient, direction, ratio, or dish-role rule. There is no supported global or contextual substitution. Keep substitutions inactive. Product-specific and recipe-specific measurements remain attached only to their source contexts.

## Sources

Sources were reviewed on 2026-10-19. IDs below are proposal-local and have not been added to the shared ledger. The Colorado State Extension URL already has separately scoped entries for other flower owners; preserve them unchanged.

| ID | Source | What it supports; limits |
|---|---|---|
| `WP03-K-COMMON-LILAC-FLOWERS-R1052-20261019-S01` | Canadian VASCAN, [*Syringa vulgaris*](https://data.canadensys.net/vascan/name/Syringa%20vulgaris) | Accepts *S. vulgaris* and records the vernacular names `lilas commun`, `lilas vulgaire`, and `common lilac`. Supports the botanical name and bilingual plant naming, not culinary use or the flower-part compound. `sourceKind: other`. |
| `WP03-K-COMMON-LILAC-FLOWERS-R1052-20261019-S02` | Université du Québec à Chicoutimi, Forêt nourricière, [*Lilas commun, Syringa vulgaris*](https://www.uqac.ca/foretnourriciere/fines-herbes-epices-et-aromates/lilas/) | Names the species, identifies `fleur` as the part to harvest, and describes culinary uses for `fleurs de lilas`. It supports the French compound context and culinary identity, but does not standardize a full bilingual ingredient name or define a more exact floral structure. Its mid-May–mid-June timing, sensory description, and recipe ideas remain source-specific. `sourceKind: extension`. |
| `WP03-K-COMMON-LILAC-FLOWERS-R1052-20261019-S03` | Colorado State University Extension, [*Edible Flowers*](https://extension.colostate.edu/resource/edible-flowers/) | Peer-reviewed Table 2 includes *Syringa vulgaris* / lilac and says it candies well. Use only the lilac row for this candidate. The URL's existing borage/chive/garlic-chive entries retain their own part-specific locators and support; this proposed locator does not alter them. `sourceKind: extension`. |
| `WP03-K-COMMON-LILAC-FLOWERS-R1052-20261019-S04` | Télé-Québec, Cuisinez, [*Cocktail Lilas*](https://cuisinez.telequebec.tv/recettes/7472/cocktail-lilas) | The recipe uses the local phrase `fleurs de lilas` and a source-specific 500 ml flower-to-500 ml alcohol infusion in two 12-hour stages; its main ingredient list has one apparent `lias` typo, while the title and preparation use `lilas`. The recipe does not identify a species, so it supports Québec culinary wording and its own method/amount only, not *S. vulgaris* identity, a generic measure, or substitution. `sourceKind: culinary_reference`. |

## Disposition

Recommend one identity-only **common lilac flowers / fleurs du lilas commun** reference in `VEGETABLE_AND_AROMATIC`, restricted to flowers of *Syringa vulgaris*. Keep the French compound provisional, aliases empty, and all floral structure, measures, preparations, recipe links, and substitutions unmodeled. Preserve existing edible-flower owners and the CSU source allocations. No commercial roster work was pursued. No tests were run because this is proposal-only work.

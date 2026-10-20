# WP03 Section K — sweet violet flowers identity review (R1055)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic reference for **sweet violet flowers / fleurs de violette odorante**, bounded to flowers of *Viola odorata* L.
- **Plan anchor:** Section K remains open to documented edible flowers, while prohibiting a generic `edible flowers` identity and cross-species transfer ([open item, lines 6691–6692](../../RecipeBook-global-ingredient-catalog-plan.txt#L6691)). R1052 common lilac flowers and R1053 bettara-zuke are already integrated in the current snapshot ([current checkpoint, lines 24134–24139](../../RecipeBook-global-ingredient-catalog-plan.txt#L24134)).
- **Scope:** Generic culinary plant-part diversity across ingredient types. No brand, product-line, flavour-family, SKU, retailer-variant, or commercial-roster research is included.
- **Mutation scope:** Proposal only. This Markdown file is the only proposed change; shared catalog references, forms, ledger, recipes, plan, roadmap, and generated files remain unchanged.

## Identity and boundary

The open Section K item asks for more documented edible-flower identities, without creating a generic flower row. Canadian VASCAN accepts *Viola odorata* and records `sweet violet` / `violette odorante` as common names. North Carolina State Extension identifies the same species, lists its flowers as edible, and specifically describes candies made from its flowers. University of Maine Cooperative Extension independently lists `Violet / Viola odorata / Flowers` and gives candied and garnish uses. Together these support one flower-part identity for this species, not a claim about *Viola* generally. [S01–S03]

Use **sweet violet flowers / fleurs de violette odorante** as bilingual descriptive displays. The English display follows VASCAN's `sweet violet`; the French compound combines its Canadian French name with the source-attested flower part. No OQLF-standardized full ingredient compound or Québec culinary use source was found, so keep the French display provisional for independent Québec terminology review. Keep both alias arrays empty: do not add bare `violet`, `violette`, `Viola`, `pansy`, or other unqualified names.

Limit the identity to flowers of *V. odorata*. North Carolina State's broader statement that both leaves and flowers can be eaten does not authorize adding leaves to this identity; leaves remain a distinct part. Do not extend the claim to other violet species or hybrids, including *V. tricolor* or *V. ×wittrockiana* (pansies and Johnny-jump-ups), or to all of *Viola*. The sources do not establish a more exact edible floral structure, so do not restrict the row to petals or include an inflorescence/stem boundary. Candied violets are a preparation example, not a form or alias.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-sweet-violet-flowers` |
| nameEn | `sweet violet flowers` |
| nameFr | `fleurs de violette odorante` (descriptive; provisional pending Québec terminology review) |
| aliasesEn / aliasesFr | `[]` / `[]` |
| defaultDensity | `null` |
| unitMappings | `[]` |
| category | `VEGETABLE_AND_AROMATIC` |
| updatedAt | `2026-10-19T00:00:00Z` |

Add no form, reusable measure, density, unit mapping, conversion, yield, package yield, recipe link, or active substitution. If integrated, create one `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; add no measurement or substitution observations.

## Live ownership and recipe-demand audit

The refreshed package contains **2,060 active references**, **205 forms**, **2,465 research-ledger records**, and **55 legacy candidates**. The manifest contains **114 recipes** with **1,123 structured ingredient rows**. Exact scans for `Viola odorata`, `sweet violet`, `English violet`, `violette odorante`, and `fleurs de violette odorante` found no current identity, form, legacy, ledger, or bundled-recipe owner. The candidate ID and R1055 source-ID prefix are also unused.

| Surface | Current finding | Proposal effect |
|---|---|---|
| Active references | No sweet-violet or *V. odorata* identity exists. A broad word scan finds `violet` only inside the unrelated `Riceberry rice / riz violet Riceberry` display; it is a named rice identity, not a flower owner. Existing flower/part owners include banana blossom; black elderflowers; borage, butterfly-pea, bee-balm, chive, garlic-chive, dandelion, moringa, and common-lilac flowers; calendula and rose petals; dill flower heads; nasturtium and squash blossoms; dried roselle calyces; culinary lavender; and tawny daylily buds. | Add one *V. odorata*-flower row only. Preserve the Riceberry row and every current flower owner, alias, and evidence allocation. |
| Active forms | No candidate form or form match term exists. | Do not treat candied violet as a form; the reviewed sources give it only as a culinary preparation example. |
| Legacy candidates | No candidate name, alias, or ID matches the species or proposed part. | Do not revive or rewrite a legacy candidate. |
| Research ledger/source ownership | No candidate-specific record exists among the 2,465 records. The VASCAN, North Carolina State, and University of Maine URLs listed below have no current ledger owner. The commonly reused Colorado State `Edible Flowers` source has existing separate entries on borage, chive, garlic-chive, and common-lilac flower records; none is edited or reused here. | Keep all current source IDs, locators, and support text unchanged. The IDs below are proposal-local. |
| Bundled recipes | All 114 recipe files and 1,123 ingredient rows were scanned for the exact species and bilingual/common-name terms; there are **0 matching files and 0 matching rows**. | Add no recipe link or infer bundled demand from external examples. |
| Queue and scope | The selected open item is generic Section K edible-flower discovery; no commercial-only task is present in that item. | If a queued item only asks for brands, product lines, flavours, SKUs, retailer variants, or commercial rosters, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that line. No such research was pursued here. |

## Numeric and substitution limits

The reviewed sources provide no sweet-violet household portion, weight, volume, cup-packing basis, density, edible yield, reusable conversion, or recipe amount. North Carolina State's flower-size and petal-count descriptions are botanical morphology, not kitchen measurements. University of Maine lists several culinary uses but gives no quantity for violets. Do not convert or transfer any figures from other flowers or preparations.

No reviewed source identifies a replacement ingredient, direction, ratio, or dish-role rule for sweet violets. The University of Maine table's saffron-substitute note is attached to calendula, not violets, and must not transfer. Keep all global and contextual substitution behavior inactive.

## Sources

Sources were reviewed on 2026-10-19. IDs below are proposal-local and have not been added to the shared ledger.

| ID | Source | What it supports; limits |
|---|---|---|
| `WP03-K-SWEET-VIOLET-FLOWERS-R1055-20261019-S01` | Canadian VASCAN, [*Viola odorata* Linnaeus](https://data.canadensys.net/vascan/taxon/9500) | Accepts *V. odorata*, records `violette odorante`, `sweet violet`, and other names, and records the species in Québec. Supports the scientific and bilingual plant names, not culinary use or a flower-specific display. `sourceKind: other`. |
| `WP03-K-SWEET-VIOLET-FLOWERS-R1055-20261019-S02` | North Carolina State University Extension, [Common Violet — *Viola odorata*](https://plants.ces.ncsu.edu/plants/viola-odorata/common-name/common-violet/) | Identifies *V. odorata*, states that it is now grown mostly for edible flowers, lists leaves and flowers as edible, and describes candied violet flowers as made from this species. Use only the flower-specific support; the leaf statement does not broaden this row. It supplies no reusable kitchen amount or substitution. `sourceKind: extension`. |
| `WP03-K-SWEET-VIOLET-FLOWERS-R1055-20261019-S03` | University of Maine Cooperative Extension, [*Edible Flowers: Pretty in Your Garden and a Culinary Delight*](https://extension.umaine.edu/gardening/2012/06/05/maine-home-garden-news-june-2012/) | The table row gives `Violet / Viola odorata / Flowers`, a sweet/perfumed description, and candied or garnish uses for soups, desserts, punch, jams, and salads. This is general culinary guidance, not Québec usage, a specified flower structure, a measure, or a substitution. Other flower rows' measurements or replacement suggestions do not transfer. `sourceKind: extension`. |

## Disposition

Recommend one identity-only **sweet violet flowers / fleurs de violette odorante** reference in `VEGETABLE_AND_AROMATIC`, limited to *Viola odorata* flowers. Keep the French wording provisional, aliases empty, and flower structure, forms, measurements, recipes, conversions, yields, and substitutions unmodeled. Preserve all existing owners and source allocations. No roster-only queue item was encountered; no commercial variants were researched. No tests were run because this is proposal-only work.

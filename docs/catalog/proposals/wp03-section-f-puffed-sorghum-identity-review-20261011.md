# WP03 Section F: plain puffed sorghum identity review

## Packet record

- **Proposal cycle:** 2026-10-11.
- **Sources accessed:** 2026-10-11.
- **Status:** accepted and integrated on 2026-10-11; see `../batches/wp03-puffed-sorghum-identity-integration-20261011/README.md`.
- **Scope:** one remaining Section F product candidate: plain, single-grain puffed sorghum.
- **Disposition:** accept an identity-only candidate for `puffed sorghum / sorgho soufflé`, with the English aliases `popped sorghum` and `sorghum puffs`. Keep species/cultivar and all numeric data unassigned. This proposal excludes barnyard millet and Sikiya/crab finger, which have separate holds.

## Why this is a distinct open candidate

The current Section F checklist leaves “remaining puffed-grain candidates” open after integrating puffed wheat, quinoa, millet, and amaranth, as well as puffed rice in the earlier cereal work ([plan, Section F puffed-grain item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1530)). The focused prior proposals and integration notes reviewed here cover those grains, but no earlier WP03 proposal makes a puffed-sorghum decision. The plain puffed-sorghum candidate is therefore distinct from the already reviewed identities.

The live catalog already has `ingredient-ref-grain-sorghum` (`grain sorghum / sorgho à graine`) and `ingredient-ref-sorghum-flour` (`sorghum flour / farine de sorgho`). Neither row denotes an expanded, ready-to-eat grain product. Puffed sorghum belongs beside the other puffed-grain product identities; it should not be stored as a dry/cooked form of raw sorghum.

## Identity and product boundary

The proposal covers a plain grain product made by puffing or popping sorghum kernels. ICAR–Indian Institute of Millets Research describes sorghum puffs made by explosive/gun puffing dehulled grain and lists them separately from extruded snacks. Nu Life Market, a sorghum processor, sells popped white sorghum and organic popped white sorghum as kernel products. A Canadian retailer lists the same Yupik item in English as “Organic Puffed Sorghum” and in French as “Sorgho Soufflé Biologique.” These sources support the food product class; they do not establish that every supplier uses one process, hull state, variety, or species declaration.

| Candidate or query | Proposed decision | Boundary and evidence limit |
| --- | --- | --- |
| `puffed sorghum` | Accept as a separate `GRAIN_AND_CEREAL` identity candidate. | Plain sorghum kernels expanded/puffed as a ready-to-eat product. Keep separate from raw grain sorghum and sorghum flour. |
| `sorgho soufflé` | Accept as the fr-CA display. | This exact wording appears in a Canadian ingredient distributor's French Canada product-line page and in the French Walmart.ca title for the paired Yupik listing. OQLF supports the base word `sorgho`, but does not have a puffed-sorghum entry; describe the compound as source-attested Québec-facing product wording, not as an OQLF ruling. |
| `popped sorghum` | Accept as an English alias. | Nu Life Market uses this name for its plain popped kernel product. It does not establish that all popped products use Nu Life's process or white-grain specification. |
| `sorghum puffs` | Accept as an English alias. | ICAR–IIMR uses this name for individual expanded sorghum grains. Keep this phrase scoped to the plain grain product, not extruded puffs or mixed snacks. |
| `ingredient-ref-puffed-sorghum` | Proposed stable ID for integration review. | This ID is unused in the active package, forms, research ledger, and legacy candidates. It remains a proposal until the catalog owner integrates it. |
| Organic-qualified product wording | Do not add `organic` / `biologique` to canonical names or aliases. | Organic describes only some products, not the unqualified product class. The source listing's `biologique` is a package-level claim. |
| `sorgho éclaté`, `sorgho soufflé bio`, `soufflé de sorgho`, `puffed sorghum cereal`, and `puffed grain sorghum` | Do not add as aliases. | No need for these variants is established. Some add a process, organic, or cereal claim that is not a universal synonym in the reviewed product sources. |
| Species, cultivar, color, hull, or grain-grade qualifiers | Leave unassigned. | Nu Life's current page identifies its product as white sorghum, and its specification identifies organic white whole sorghum grain, but those are supplier-specific product attributes. The other technical and Canadian product sources do not establish a shared species/cultivar/hull specification for the broader identity. |
| Extruded sorghum snacks, seasoned/coated puffs, and mixed cereal products | Exclude from this identity. | ICAR–IIMR treats its gun-puffed grain and its separately extruded snacks as distinct products. Multi-ingredient or coated snacks require their own product scope. |

### Proposed catalog row

| Stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and numeric fields |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-puffed-sorghum` | `puffed sorghum` | `sorgho soufflé` | `popped sorghum`; `sorghum puffs` | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

Do not add `sorgho soufflé` again as an alias. Do not alias raw `sorghum`, `grain sorghum`, or a named sorghum variety to the puffed product.

## Recipe demand and collision audit

The audit used the repository's `normalize_search_key` behavior across active canonical names and aliases, form labels and match terms, ledger record strings and unit conversions, and legacy candidate names and aliases. It also read every manifest-listed recipe JSON file and each recipe's actual `ingredients` array.

The normalized-key candidate set included `puffed sorghum`, `puffed sorghum grain`, `sorghum puffs`, `sorghum puff`, `sorghum pops`, `popped sorghum`, `popped white sorghum`, `puffed grain sorghum`, `puffed sorghum cereal`, `sorgho soufflé` / `sorgho souffle`, `sorgho soufflé biologique`, `sorgho soufflé bio`, `sorgho éclaté` / `sorgho eclate`, `soufflé de sorgho`, `Sorghum bicolor`, and the proposed ID.

| Search scope | Result |
| --- | --- |
| Active package snapshot | 889 ingredient references, 48 forms, 114 manifest-listed recipes, and 1,123 ingredient rows. |
| Research/legacy snapshot | 1,139 research-ledger records and 77 legacy-import candidates. |
| Exact normalized collisions for proposed identity names/aliases and candidate ID | 0 across active references, forms, ledger strings, and legacy candidates. |
| Candidate-name hits in recipes | 0 of 114 recipe files and 0 of 1,123 ingredient rows. |
| Broad `sorghum` / `sorgho` hits in recipes | 0 recipe files and 0 ingredient rows. |
| Prior proposal phrase check | No prior WP03 proposal contains `puffed sorghum`, `sorghum puffs`, `popped sorghum`, or `sorgho soufflé` as a reviewed identity. |

Broad catalog searches for `sorghum` intentionally reach the adjacent active raw-grain and flour references. This is expected; the qualified proposed names have no exact key collision. The audit establishes no bundled demand and no exact duplicate key in this package snapshot. It does not test live picker ranking or claim exhaustive retail coverage.

## Measures, forms, conversions, yields, and substitutions

- **Measures and density:** add no household measure, default density, unit mapping, serving-mass conversion, or reference quantity. A 200 g retail package or a commercial bag size is package information, not a recipe measure.
- **Forms:** add no `IngredientForm`. Puffing defines the separate product identity in line with the existing puffed-grain identities; it does not justify a dry/cooked state model for raw sorghum.
- **Conversion and yield:** add no dry-to-puffed factor, mass/volume conversion, cooking yield, package yield, or puffing yield. ICAR–IIMR reports a source-specific puff/by-product yield for its equipment and process; the Nu Life specification reports its own product parameters. Neither supplies a general culinary conversion.
- **Nutrition and storage:** add no nutrition, moisture, shelf-life, or storage values. The ICAR publication and manufacturer specification describe particular products/processes; the Canadian marketplace listing reports the size and availability of one package. None of these values transfers to a generic ingredient identity.
- **Substitutions:** add no global or contextual substitution. A puffed sorghum product is not automatically interchangeable with popcorn, puffed rice, puffed quinoa, puffed millet, or extruded sorghum snacks.
- **Recipe links:** add none because the bundled corpus has no candidate hit.

## Acceptance checks for integration

1. Repeat the normalized-key collision audit against reference displays/aliases, form labels/match terms, ledger strings, and legacy candidates immediately before integration.
2. Repeat the manifest-wide full-JSON and ingredient-row searches; add no recipe link unless an actual recipe line requires this product.
3. If accepted, use only `puffed sorghum / sorgho soufflé`, the two source-attested English aliases, category `GRAIN_AND_CEREAL`, null density, and empty unit mappings.
4. Keep the row distinct from raw grain sorghum, sorghum flour, and all other puffed-grain identities. Keep extruded, seasoned, coated, and multigrain snacks outside its scope.
5. Keep species/cultivar, precise puffing method, hull state, organic status, density, measures, conversions, yields, and substitutions unset unless separately reviewed with evidence that applies beyond one supplier or product.

## Sources

The source IDs below were assigned for this proposal and accessed on 2026-10-11. S01–S04 and S06 are recorded on `ingredient-ref-puffed-sorghum`; S05 remains proposal-only and was not needed to establish the identity.

| Source ID | Source and locator | What it supports and its limits |
| --- | --- | --- |
| `WP03-PSORGHUM-20261011-S01` | ICAR–Indian Institute of Millets Research, *Technologies of Millet Value Added Products* (2016), [PDF](https://www.millets.res.in/technologies/Technologies_of_millet_value_added_products.pdf), printed p. 6 / PDF page 7, “Puffs from Sorghum”; see also the separate “Extruded Snacks” section on the next page. | Primary agricultural research institute's technical description: sorghum grain is expanded by explosive/gun puffing; dehulled grain is used in the described process; the product is ready to eat. The publication distinguishes this from an extruded snack. Its yield, by-product share, nutrient values, shelf life, and process are specific to its study/technology and are not adopted as generic catalog data. |
| `WP03-PSORGHUM-20261011-S02` | Nu Life Market, manufacturer, [Popped Sorghum](https://nulifemarket.com/glutenfree/popped/). | Current manufacturer page lists popped white sorghum and organic popped white sorghum, describes popped kernels made from its proprietary white sorghum, and states commercial snack/bar/blend applications. It supports `popped sorghum` as a product label and the plain-kernel boundary. It does not establish a shared botanical species, variety, hull state, or process across other suppliers. |
| `WP03-PSORGHUM-20261011-S03` | Nu Life Market, manufacturer, [Organic Popped Sorghum specification sheet](https://nulifemarket.com/wp-content/uploads/2020/06/Organic-Popped-Sorghum_Spec-Sheet.pdf), version 9, effective 2020-06-05. | Product specification identifies the ingredient composition as organic white whole sorghum grain and the label declaration as Organic Popped Sorghum. Its moisture, contaminant, package, storage, and shelf-life values are product-specific; none is promoted to the general identity or used as a measure, density, yield, or conversion. |
| `WP03-PSORGHUM-20261011-S04` | Dempsey Food, Canada product lines, [French page](https://www.dempseyfood.com/fr/products-lines-canada), Nu Life Market entry. | A Canada-facing ingredient distributor's French page states that Nu Life Market makes sorghum flours, bran, grains, and `sorgho soufflé`; the company page identifies Dempsey in Toronto. Supports the exact French product wording in a Canadian supply context, but it is not an OQLF recommendation, a detailed product specification, or a retail availability guarantee. |
| `WP03-PSORGHUM-20261011-S05` | Walmart Canada product listings for Yupik, [English: Organic Puffed Sorghum, 200 g](https://www.walmart.ca/en/ip/Yupik-Organic-Puffed-Sorghum-200g/1351K9CXB5V6) and [French: Sorgho Soufflé Biologique, 200 g](https://www.walmart.ca/fr/ip/Yupik-Sorgho-Souffl-Biologique-200-G/1351K9CXB5V6), same SKU `1351K9CXB5V6` and UPC `00805509310915`. | Current Canadian marketplace listings pair the English and French product titles for the same Yupik package; the French page describes grains popped over high heat. Both listings were marked out of stock when accessed. The page says some product details are supplied by vendors/marketplace sellers and are not individually verified, so use it for paired listing wording only, not as primary process or species evidence. |
| `WP03-PSORGHUM-20261011-S06` | Office québécois de la langue française, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho), updated 2010. | OQLF lists `sorgho` as a preferred French botanical term and pairs English `sorghum` with Latin *Sorghum bicolor* and *Sorghum vulgare*. It establishes the Québec French base noun, not the compound `sorgho soufflé`, a food-processing name, or a particular retail grain's species. |

## Unresolved and held decisions

The identity and bilingual display are sufficiently bounded for proposal acceptance, but the following remain unresolved and must not be inferred: a common species or cultivar across suppliers; whether every marketed product uses dehulled grain; equivalence between specific puffing methods; availability of the paired Yupik package; and any generic measure, density, conversion, yield, nutritional value, or substitution. `Sorgho soufflé` is directly attested Canadian French wording, but no reviewed OQLF record standardizes that compound. No recipe-corpus demand justifies adding a recipe link or quantitative data. These holds do not block a plain puffed-sorghum product identity, but they limit the row to the qualified generic display and its source-attested English aliases.

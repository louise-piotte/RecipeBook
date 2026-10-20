# WP02 B2/B3 Next Open Flour or Starch Boundary Review — Round 71

**Date:** 2026-10-13
**Status:** Integrated as identity-only `ingredient-ref-lima-bean-flour`; see [integration record](../batches/wp02-b2b3-lima-bean-flour-integration-20261013/README.md).
**Candidate:** Lima bean flour
**Disposition:** Add one identity-only `FLOUR_AND_STARCH` reference, with the Québec French display marked provisional. Do not activate measures, conversions, substitutions, forms, aliases, or recipe links.

## Decision

The candidate is a documented human-food flour made by milling dried, raw Lima beans. A bilingual milling-company catalogue describes its food uses and separately names it in English and French; a current US retail listing also offers single-ingredient Lima bean flour to consumers. OQLF supplies the Québec French base term *haricot de Lima*. Taken together, these support the product identity and a bounded bilingual display, although no Québec retail flour label was found.

Proposed row, subject to the integration owner’s review:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-lima-bean-flour` |
| Category | `FLOUR_AND_STARCH` |
| English display | `lima bean flour` |
| Québec French display | `farine de haricots de Lima` (**provisional**; exact French wording appears in the manufacturer catalogue, but no Québec flour product label was found) |
| English and French aliases | none |
| Default density | `null` |
| Unit mappings | `[]` |
| Forms, recipe links, yields, conversions, substitutions | none |

The identity covers flour made from Lima-bean seeds (*Phaseolus lunatus*), not generic bean flour or any particular hull, cultivar, germination, defatting, extraction, heat-treatment, or protein-concentrate specification. The manufacturer’s description says the flour is milled from dried, raw beans; that describes the milling input and does not establish that the flour is ready to eat raw. Adding an ingredient identity must not imply uncooked use. Do not attach a recipe or cooking instruction until a product-specific preparation method is supported.

## Scope and Québec naming confidence

OQLF’s GDT identifies *haricot de Lima* as the preferred French term and *Lima bean* as its English equivalent for *Phaseolus lunatus*. The French manufacturer catalogue uses the exact product name `farine de haricots de Lima`, and its English catalogue names `Lima bean flour`. These sources support the proposed compound wording; the GDT entry itself names the bean, not a flour product. The French wording is therefore a well-supported translation of an attested supplier product name, but its Québec-market status remains provisional.

The manufacturer catalogue gives a food-use context: increasing protein in dough, preparing legume creams, and enriching seitan. Its ingredient declaration is Lima beans. The Shipt listing for Mi Tierra’s 425 g consumer product likewise gives Lima beans as the sole ingredient. The latter is US retail evidence, not proof of Canadian or Québec distribution. No local flour listing or Québec package was located, so the proposal does not claim local availability.

Keep `butter bean flour`, generic `bean flour`, `farine de haricots`, and `farine de fèves` unassigned. The existing whole-bean ledger review rejected global `butter bean(s)` / `haricots beurre` aliases because sources use them ambiguously across Lima and wax-bean products. The app should not add those terms to either row as part of this proposal. Likewise, no claim is made that this is the same product as sprouted Lima flour, germinated flour, cooked-bean flour, isolated Lima starch, or Lima-bean protein concentrate.

## Ownership and review audit

The repository scan used the current working-tree snapshots below. Hashes are included to identify exactly what was reviewed in this shared, changing worktree.

| Source of ownership | Current result |
|---|---|
| Active ingredient references, [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,391 rows; SHA-256 `dc7f08dad674c7086b124c4d88140c4b3128decf7d414e2bddac933e4e700794`. The only Lima-specific active reference is `ingredient-ref-lima-beans` (`lima beans` / `haricots de Lima`), with empty aliases, null density, and empty unit mappings. There is no flour row. |
| Active forms, [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 100 forms; SHA-256 `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63`. No Lima form or flour form. |
| Legacy identities, [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) | 63 candidates; SHA-256 `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb`. No Lima-flour candidate or reserved legacy owner. |
| Research ledger, [`research-ledger.v1.json`](../research-ledger.v1.json) | 1,724 records; SHA-256 `06c9ee8d69704811a8273bbb4ec8cad1cb1a0b38913f3469006dc4f3f0cd7091`. The verified `ingredient-ref-lima-beans` record covers whole beans and the rejected butter-bean alias only; it is not a flour review. No Lima-flour record exists. A separate unresolved `candidate-fresh-shell-beans` concerns maturity and edible-part ambiguity, not milling flour. |
| Forms and substitution rules | No Lima-flour form, substitution, or contextual-substitution entry. The current whole-bean reference has no form or unit data. |
| Plan and batch archive | The current [`global catalog plan`](../../RecipeBook-global-ingredient-catalog-plan.txt) and [`baking flours and starches batch`](../batches/baking-flours-starches.md) leave broader B2/B3 work open. Exact searches for `lima bean flour`, `lima-bean flour`, and `farine de haricots de Lima` found no earlier candidate review, batch decision, or proposal. The plan separately records R70 barley starch and the oat-starch hold; neither is reopened here. Existing Hattai-ko/mugikogashi and roasted-gram reviews are also outside this candidate. |
| Proposal path | The requested path did not exist before this write. |

The proposal path is unique to R71. No active data or shared research record was edited.

## Picker ownership and projection

The projection was checked against the actual search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes accents and punctuation, prefers complete normalized word phrases, and then uses partial matching. The simulated candidate has no aliases.

| Query | Current result | Result with proposed row |
|---|---|---|
| `lima bean flour` | none | `ingredient-ref-lima-bean-flour` only |
| `farine de haricots de Lima` | none | `ingredient-ref-lima-bean-flour` only |
| `lima beans` | `ingredient-ref-lima-beans` | `ingredient-ref-lima-beans` only |
| `lima` | `ingredient-ref-lima-beans` | whole Lima beans and Lima bean flour |
| `haricots de Lima` | `ingredient-ref-lima-beans` | whole Lima beans and Lima bean flour |

This creates a useful specific product search without stealing the plural whole-bean search. The family queries `lima` and `haricots de Lima` become two-result queries, which is appropriate because they now name two distinct products. Do not add broad aliases that would make either identity silently stand in for the other.

## Bundled recipe demand

The manifest lists 114 recipe files. The current bundle snapshot contains 1,123 ingredient rows and has recipe-file fingerprint `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552` (sorted relative filename, NUL, file bytes, NUL). A scan of each row’s `originalText`, `ingredientName`, and `ingredientRefId` found:

- zero Lima bean, Lima flour, or `haricots de Lima` ingredient matches;
- zero generic `bean flour` or `farine de haricot` ingredient matches.

There is no bundled demand or recipe line to link. The product’s existence is sufficient for an ingredient identity under the plan; absence of recipe demand is not treated as evidence that the product does not exist.

## Numeric, conversion, and substitution evidence

### Measures and density

The manufacturer catalogue lists a 1 kg Lima-bean-flour package, and Shipt lists a 425 g Mi Tierra retail package. These are net package sizes, not cup, spoon, or other household-measure weights.

There is sample-specific bulk-density evidence, but it is not reusable for the proposed row:

- Ibeabuchi et al. (2019) studied an Enugu State `okpokoro` Lima-bean cultivar and compared dehulled with undehulled flour. Its table reports bulk density of `0.80 ± 0.02 g/mL` for dehulled flour and `0.88 ± 0.30 g/mL` for undehulled flour. The narrative elsewhere gives `0.82 g/mL` for the dehulled sample, so the article contains an internal table-versus-text discrepancy. The study does not establish that either sample matches the manufacturer’s flour, specify the household scoop convention, or provide a transferable mass per cup. Keep every value as a study observation only. [S4]
- A 2026 study reports water-holding capacity of `1.43–3.46 g/g` for Lima-bean flour and protein concentrate together. That is a laboratory functional property for two ingredient classes, not a volume density, recipe hydration rule, or unit conversion. [S5]

Therefore the proposal keeps `defaultDensity` null, adds no unit mappings, and defines no grams-per-cup, spoon weight, count weight, yield, or liquid replacement. The product source does not specify hull status, particle-size distribution, bulk packing, or a measure convention that would map the study values to this SKU.

### Substitution evidence

Food-formulation studies provide bounded percentages, not a universal replacement rule:

- Sobowale et al. (2021) tested Lima-bean flour processed by traditional and back-slopping steeping in wheat/sorghum composite breads at 0%, 2.5%, 5%, and 7.5%. The preferred formulation reported for the back-slopping treatment contained 2.5% Lima flour and 2.5% sorghum flour. The steeping method and complete composite formula are material to the result. [S6]
- Prathapan et al. (2024) tested Lima flour/emmer wheat cookie blends at 10%, 20%, 30%, 40%, and 50% Lima flour; the 30% replacement was rated most acceptable in that study. It does not establish an exchange rate for wheat recipes generally or for other flour products. [S7]

Neither result supports an ingredient-level directed substitution in RecipeBook. Add no substitution rule, replacement ratio, confidence, or recipe-line substitution link.

## Processing and uncooked-use boundary

The manufacturer describes flour milled from dried, raw Lima beans and gives cooked-food contexts, but does not say the flour is heat-treated or ready to eat. FDA guidance treats flour as a raw food and advises against eating raw flour, dough, or batter; EFSA’s current assessment says adequate preparation such as soaking and cooking deactivates bean lectins, while underprepared bean foods can cause illness. Those sources support a clear boundary: the identity describes a flour ingredient, not a ready-to-eat product. This proposal adds no recipe, raw-use claim, or heat-treatment specification. Any later recipe entry must give a complete cooked preparation supported by its own recipe source; no generic Lima-flour time or temperature is inferred here. [S8, S9]

This is not a product-specific safety determination for the Bongiovanni or Mi Tierra flour. The evidence packet does not establish the manufacturer’s microbial controls, bean pre-treatment, or label cooking instructions, so none is claimed.

## Recommendation and limits

**Add identity-only** `ingredient-ref-lima-bean-flour` under `FLOUR_AND_STARCH`, with `lima bean flour` as the English display and provisional `farine de haricots de Lima` as the Québec French display. Keep aliases empty; leave density null and mappings, forms, recipes, yields, conversions, and substitution rules empty. Preserve the existing whole-bean row unchanged.

This disposition recognizes a distinct food product supported by manufacturer and retail evidence. It does not say the product is locally stocked in Québec, establish a ready-to-eat state, standardize hull or milling scope, transfer sample measurements, or imply interchangeability with other bean flours. Revisit the French locale status if a Québec package or local bilingual retail listing becomes available.

## Sources

All links were checked on 2026-10-13. The cited studies are included for bounded evidence, not as catalog-ready conversion rules.

| ID | Source | Evidence used and limitation |
|---|---|---|
| S1 | [OQLF, *haricot de Lima* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296959/haricot-de-lima) | Québec French base name, English equivalent, and *Phaseolus lunatus*. It does not name flour. |
| S2 | [Molino Bongiovanni, French product catalogue](https://www.molinobongiovanni.com/files/ProductsCatalogVer1-FR.pdf), p. 13 | Exact `farine de haricots de Lima` product heading, Lima beans as ingredient, milling from dried/raw beans, and food-use examples. This is supplier wording, not a Québec label. |
| S3 | [Molino Bongiovanni, English product catalogue](https://www.molinobongiovanni.com/files/CatalogVer-1ENG.pdf), p. 13 | `Lima bean flour`, Lima beans as ingredient, stone milling from dried/raw beans, food-use examples, and a listed 1 kg package. The catalogue does not give a household measure or heat-treatment state. |
| S3a | [Shipt, Mi Tierra Lima Bean Flour, 425 g](https://www.shipt.com/up/mi-tierra-lima-bean-flour-425-g/b2c32550-e25a-11ee-b9e3-df45c97980e0) | Consumer retail evidence for the flour name, net package size, and Lima beans as the listed ingredient. It is US retail, not Québec availability; product data is retailer-supplied. |
| S4 | [Ibeabuchi et al. (2019), *Effect of Dehulling on Proximate Composition and Functional Properties of Lima Bean*, DOI 10.5539/jfr.v8n2p116](https://doi.org/10.5539/jfr.v8n2p116) | Enugu `okpokoro` dehulled/undehulled flour measurements; reports the bulk-density table values and has a conflicting dehulled value in the text. Sample-specific laboratory data only. |
| S5 | [Physicochemical, techno-functional, and nutritional characterization of food ingredients derived from lima bean (2026), DOI 10.1016/j.jafr.2026.102821](https://www.sciencedirect.com/science/article/pii/S2666154326001912) | Laboratory flour and protein-concentrate study; reports water-holding capacities together for both products. Not a household measure or pure-flour density. |
| S6 | [Sobowale et al. (2021), *Influence of traditional and back-slopping steeping methods on some quality attributes of lima bean-sorghum composite flour and its bread making potential*, DOI 10.1111/jfpp.15030](https://onlinelibrary.wiley.com/doi/10.1111/jfpp.15030) | Steeped Lima flour and sorghum in a bounded wheat-bread formulation; percentage findings are not general substitutions. |
| S7 | [Prathapan et al. (2024), *Development and Quality Evaluation of Cookies from Lima Bean and Emmer Wheat*, DOI 10.9734/air/2024/v25i61191](https://doi.org/10.9734/air/2024/v25i61191) | Specific emmer-wheat cookie blend trials; one selected percentage is not a general wheat-for-Lima exchange rule. |
| S8 | [US FDA, *Handling Flour Safely: What You Need to Know*](https://www.fda.gov/food/buy-store-serve-safe-food/handling-flour-safely-what-you-need-know) | General flour guidance: flour is raw and should not be eaten in uncooked dough/batter. Not specific to Lima flour or this supplier’s controls. |
| S9 | [EFSA (2026), *Risks for human health related to the presence of plant lectins in food*](https://www.efsa.europa.eu/en/plain-language-summary/risks-human-health-related-presence-plant-lectins-food) | Bean/legume lectin risk and adequate preparation scope; does not provide a Lima-flour cooking formula. |

## Static review record

- Confirmed the target path was clear before writing.
- Compared the active reference, forms, legacy identities, research ledger, B2/B3 plan and batch, and existing proposal/batch archive; no prior Lima-bean-flour owner or review was found.
- Simulated exact and broad picker queries from the repository search implementation.
- Scanned all 114 manifest recipe files and 1,123 ingredient rows.
- Checked external source pages and the PDF source locations cited above.
- No app tests or emulator checks were run because the changes add database JSON data.

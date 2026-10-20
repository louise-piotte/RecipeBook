# WP03 Section F — Tom Brown cereal-mix identity boundary hold (2026-10-13)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal-only. No active catalog, research-ledger, recipe, plan, roadmap, or generated file was changed.
- **Scope:** Whether the regional product name `Tom Brown` / `Tombrown` can own one bilingual dry cereal-mix ingredient reference.
- **Open checklist:** Section F still asks for regionally significant cereal mixes and preprocessed grains ([active plan, line 2307](../../RecipeBook-global-ingredient-catalog-plan.txt#L2400)).
- **Decision:** Keep Tom Brown unallocated in active references, forms, legacy candidates, and the shared ledger. Current evidence supports a regional family of roasted cereal and cereal-legume powders and porridges, but it does not establish one stable ingredient formula or a Québec French product display. Do not add a generic `Tom Brown` alias, candidate row, form, measurement, recipe link, or substitution.

## Why this is a distinct, still-open gap

The live checklist and proposal archive contain no prior Tom Brown identity, alias, or hold. The exact-name search covered `Tom Brown`, `Tombrown`, `Tom-Brown`, `Tom Brown flour`, `Tom Brown cereal`, `Tom Brown mix`, and `Tom Brown porridge` across the plan, roadmap, active references, forms, legacy identities, research ledger, proposals, batches, and bundled recipes. This review does not reopen the completed granola/muesli, wild-rice blend, Red River, millet-couscous, Sankhal, arraw, thiakry, flake, bran, quick-cooking-barley, or other Section F decisions. The nearby idli-rava, finger-millet-rava, misugaru, sorghum-couscous, Dalia, and polenta-taragna reviews remain at their recorded scopes.

Tom Brown is source-attested as a regional cereal powder and porridge, but available sources describe materially different products:

- FAO's Nigeria report calls Tom Brown a traditional multi-ingredient porridge preparation, also called *Garin Kunu*, and describes a powder using millet, soya, groundnut, and fish.
- Ghana's Ministry of Food and Agriculture lists multiple manufacturer-branded products using `Tom Brown`, including cereal-legume products, without publishing their formulas.
- Elssy Kess describes its own Tom Brown flour as a corn-soya mix. BLOOM's Ghana listing gives its own product's ingredients as roasted maize flour, soya flour, and groundnut powder.
- A Canadian-market listing from Moriels Oasis describes its product as roasted corn, millet, and groundnuts. A 2009 Canadian Trade-marks Journal entry records an applicant's product claim for breakfast cereal in the form of ground roasted corn called Tom Brown.

These records support regional and market relevance; they do not establish one universal product formula. They also span dry flour/powder, an ingredient used to prepare porridge, and the prepared porridge itself. Keep the specific product formulation and dish boundary unresolved. Do not map *Garin Kunu* globally to a dry Tom Brown mix; FAO's equivalence is regional and concerns a prepared porridge.

## Exact active ownership and picker/search effects

The review-time snapshot contains **1,362 active references**, **100 forms**, and **64 legacy candidates**. The normalized-key audit found no exact owner for the candidate terms in reference names/aliases, form labels/match terms, or legacy names/aliases. The live research ledger has no Tom Brown record or prior decision. Existing component references such as `ingredient-ref-corn-kernels`, `ingredient-ref-millet`, `ingredient-ref-soybeans`, and `ingredient-ref-peanuts` own those ingredients separately; none owns a cereal blend. The separately integrated cereal-blend references do not establish a formula or alias for Tom Brown.

The picker projection follows the phrase-first matching behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a static projection from the current seed, not live UI QA.

| Query | Current result | Effect if `Tom Brown` were added as a display or alias |
|---|---|---|
| `tom brown`, `tombrown`, `tom-brown`, `tom brown flour`, `tom brown cereal`, `tom brown mix`, `tom brown porridge` | No result | A qualified spelling would select the proposed row, but that alone would not resolve which product formula or regional sense it owns. |
| `tom` | 11 substring-fallback results, including Atlantic tomcod and tomato products | The `tom` token in a `Tom Brown` name would be an exact phrase match. Phrase-first search would return only the new row and suppress the current 11 results. |
| `brown` | 8 exact-phrase results, including brown rice and brown sugar | Would expand to 9 results. |
| `cereal` | 11 exact-phrase results | Unchanged if only `Tom Brown` were indexed; a descriptor containing `cereal` would add a result. |
| `cereal mix` | No result | A future descriptor could make it resolve to one candidate despite the unverified scope. |

The bare `tom` singleton effect makes the attractive short name unsafe under today's picker, independently of the unresolved formula and Québec French display. Keep the search results unchanged until the candidate has a bounded bilingual identity and the picker can preserve the intended qualifier.

## Recipe-demand audit

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across serialized recipe strings and each ingredient row's `originalText`, `ingredientName`, and `ingredientRefId`. Complete normalized phrases included `Tom Brown`, `Tombrown`, `Tom-Brown`, `Tom Brown flour`, `Tom Brown cereal`, `Tom Brown mix`, `Tom Brown porridge`, and `Garin Kunu`.

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Existing recipe links to a Tom Brown reference: **0**.

No bundled recipe demand, recipe edit, or reference link is proposed.

## Measurement, form, and substitution limits

- **Forms:** Add none. Sources refer to dry flour/powder and to prepared porridge, but they do not define one reusable form model across the different formulas. Keep the prepared dish outside an ingredient-form identity.
- **Measures and density:** Add no unit mapping, default density, mass-volume conversion, yield, serving, or package mapping. Elssy Kess's instruction of four tablespoons of its own Tom Brown flour with 500 ml water is a product-specific preparation, gives no mass for the flour, and does not state a tablespoon convention. The 400 g/1 kg and 1 kg values on other listings are package sizes; the nutrition basis of 100 g dry is not a household measure. Do not transfer these values between products.
- **Substitutions:** Add no global or contextual rule or recipe-line substitution. The sources establish use as porridge/flour blends, not a tested replacement ratio or method-specific interchangeability with millet, corn, soy, another cereal blend, or hot cereal.
- **Conditional ledger disposition:** If later integration records the hold, keep it as an unresolved candidate (for example, `candidate-tom-brown-cereal-mix`) with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. This proposal does not allocate that candidate ID or modify the ledger.

## Source register

Sources were checked online on 2026-10-13. New source IDs use the proposal-local prefix `WP03-TOM-BROWN-MIX-20261013-`; that prefix and the listed URLs were absent from the current ledger and proposal/batch archive at review time. These sources support the bounded hold only; none establishes a universal formula or approved Québec French display.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-TOM-BROWN-MIX-20261013-S01` | FAO, [Lutter contre la malnutrition et la pauvreté au Nigéria grâce au porridge Tom Brown](https://www.fao.org/gender/success-stories/success-stories-detail/not-a-person-but-a-porridge--tom-brown-fights-malnutrition-and-boosts-incomes-in-nigeria/fr), 2024-02-21. | Identifies Nigerian Tom Brown / *Garin Kunu* as a traditional multi-ingredient porridge and says the promoted powder uses local fish, millet, soya, and groundnut. Regional recipe evidence, not a universal Ghanaian or Québec product formula. |
| `WP03-TOM-BROWN-MIX-20261013-S02` | Ghana Ministry of Food and Agriculture, SRID, [Agriculture in Ghana: Facts & Figures 2024](https://srid.mofa.gov.gh/sites/default/files/2025-12/AGRICULTURE%20IN%20GHANA%20%28Facts%20%26%20Figures%29%202024.pdf), pp. 69–74. | Lists several maker/product names, including Yedent Tom Vita cereal-legume mixes (Tom Brown), Berne Foods Cereal Mix (Tom Brown), Anabia Millet Tom Brown, Cynland Tombrown, Adepa Foods Tom Brown, Forhon Tombrown, and B-Blend Tom Brown. This is a product directory; it does not give ingredient panels, formulas, or current availability. |
| `WP03-TOM-BROWN-MIX-20261013-S03` | 2SCALE / IFDC, [Stratégies marketing et de distribution efficaces orientées BdP](https://www.2scale.org/upload/1e32b6_2SCALE_book_FR_LR.pdf), pp. 120–126. | Describes Nigerian Inganci Tom Brown as a flour made from a cereal-and-legume porridge mix and records a Ghanaian Maisoyforte Tom Brown product. Program-market evidence, not a package specification or universal composition. |
| `WP03-TOM-BROWN-MIX-20261013-S04` | Elssy Kess / HomeFresh, [Tom Brown](https://elssykesshomefresh.org/tom-brown/), manufacturer product page. | The maker describes its own product as a corn-soya mix and gives a preparation of four tablespoons of flour with 500 ml water, cooked for five minutes. It gives no ingredient ratio or flour mass; do not convert this recipe into a general measure. |
| `WP03-TOM-BROWN-MIX-20261013-S05` | BLOOM Ghana, [Tom Brown (Roasted Maize Soya Cereal)](https://bloomghana.shop/products/tombrown-cereal), product listing. | The listing says its ingredients are roasted maize flour, soya flour, and groundnut powder; it lists 400 g and 1 kg packs and a nutrition basis per 100 g dry. These are this seller's product/pack details, not a standard formula, serving, or household measure. |
| `WP03-TOM-BROWN-MIX-20261013-S06` | Moriels Oasis Market, [Tom Brown](https://morielsoasis.ca/products/tom-brown), Canada storefront, checked 2026-10-13. | The listing describes a 1 kg product made from roasted grains including corn, millet, and groundnuts. It was marked sold out when checked. This supports Canadian-market naming and one product description only; it is not a Québec French label or full ingredient declaration. |
| `WP03-TOM-BROWN-MIX-20261013-S07` | Canadian Intellectual Property Office, [Journal des marques de commerce, 2 décembre 2009](https://www.ic.gc.ca/opic-cipo/tmj/fra/02Dec2009.pdf?edition=12-02&year=2009), p. 201, application 1,426,858. | The applicant described breakfast cereal in the nature of ground roasted corn as Tom Brown and claimed Canadian use since 1992. The journal is a historical applicant claim, not a current product label or regulatory definition. Its French goods text does not establish a Québec picker display. |

## Disposition and next action

Keep the Section F checklist open and leave the active catalog, forms, legacy identities, ledger, recipes, and generated search index unchanged. Reopen this candidate only after a current Québec/Canadian bilingual package or authoritative source establishes the intended dry product scope and its French display, or after a regional source provides a standardized composition that distinguishes it from the other source-attested Tom Brown products. At that point, audit the exact packaged product separately; do not promote a universal `Tom Brown` formula or alias from this family-level evidence.

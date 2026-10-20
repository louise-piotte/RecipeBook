# WP03 Section F R103 — Shreddies Original picker-boundary hold

Review date: 2026-10-14

Disposition: Held outside the active catalog on 2026-10-14; see [the batch record](../batches/wp03-section-f-shreddies-original-picker-hold-integration-20261014/README.md).

## Decision

Hold the bounded candidate **Shreddies Original / Shreddies Originale** outside the active ingredient catalog. Do not add an ingredient reference, alias, form, measurement, recipe link, conversion, yield, substitution, or ledger record in this proposal.

The Canadian manufacturer currently distinguishes Original, Honey, and Cinnamon Vanilla Shreddies. Its product pages support the English name `Shreddies Original`, the French title `Shreddies Originale`, and a whole-grain-wheat cereal identity [S01–S02]. A Québec Metro listing independently shows the cereal under a French-facing product title and gives its ingredients [S03]. These sources support a real Canadian cereal product, but the current recipe corpus does not request it, and the manufacturer's unqualified recipe wording does not specify which Shreddies variety is intended [S04–S05].

The live catalog already contains the broader `shredded wheat cereal / blé filamenté` identity. The manufacturer does not document enough processing detail here to establish that Shreddies Original is this same product class, so do not merge it or add either term as an alias. A separate Original-only row would create a more immediate picker problem: the query `Shreddies` would return Original as a singleton even though the same manufacturer lists other Shreddies variants. The current recipe corpus has no exact product line to resolve that broad query. Keep the product unallocated pending a recipe that explicitly identifies a variant or a picker design that can represent this brand family without silently selecting Original.

## Plan, ownership, and prior-review audit

The parent Section F checklist for regionally significant cereal mixes and preprocessed grains remains open at [plan line 2933](../../RecipeBook-global-ingredient-catalog-plan.txt#L2933). The live checklist includes the integrated R101 Weetabix identity immediately below Kashi GoActive and before the Bob's Red Mill and other cereal decisions [plan line 2942](../../RecipeBook-global-ingredient-catalog-plan.txt#L2942). The roadmap likewise records R101 and keeps Section F open [roadmap line 809](../../../roadmap.md#L809).

At this read-only audit, the package contains 1,440 ingredient references, 105 forms, 63 legacy import candidates, and 1,780 research-ledger records. Exact text scans found no owner for `Shreddies`, `Shreddies Original`, `Shreddies Originale`, or the possible ID `ingredient-ref-shreddies-original-cereal` in those four surfaces. The adjacent active `ingredient-ref-shredded-wheat-cereal` is named `shredded wheat cereal / blé filamenté` and has no aliases; it remains a related product class rather than an established Shreddies synonym.

The plan, roadmap, proposal archive, and batch archive contain no dedicated Shreddies identity decision. One earlier proposal mentions Shreddies only in a Post Canada brand-directory observation while reviewing Grape-Nuts [S06]; it did not review this product or allocate a source ID. Current active reviewers are assigned to unrelated WP02 seed-starch and WP04 seafood work; no overlapping Shreddies review was found.

## Identity and Québec naming boundary

| Item | Evidence-backed disposition |
| --- | --- |
| English product name | The manufacturer labels the bounded variety `Shreddies Original` [S01]. |
| Québec French product name | The manufacturer's Canadian French brand page labels it `Shreddies Originale` [S02]. Metro's French title is `Céréales de blé à grains entiers Format économique, Shreddies`; its 635 g package title is SKU-specific [S03]. |
| Product boundary | Keep Original separate from Honey and Cinnamon Vanilla. The manufacturer's French brand page names all three flavors, and its Cinnamon Vanilla page lists cinnamon and natural flavours in addition to whole-grain wheat and the shared cereal ingredients [S02, S07]. Do not make a single cereal identity for all flavor variants. |
| Relationship to shredded wheat | Do not merge with or alias to `shredded wheat cereal / blé filamenté`. The active term is supported as a cereal made from wheat formed into filaments; the reviewed Shreddies product pages describe a small square and whole-grain-wheat content but do not establish the same forming process [S01–S02, S08]. |
| Proposed aliases | None. In particular, do not add bare `Shreddies` or `céréales Shreddies`: both can refer to the brand line without specifying Original. Do not add `blé filamenté` or `shredded wheat` without process-equivalence evidence. |

If a later review resolves the picker-family issue and accepts this specific product, the narrow candidate fields would be:

```json
{
  "id": "ingredient-ref-shreddies-original-cereal",
  "nameEn": "Shreddies Original",
  "nameFr": "Shreddies Originale",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

This is a hypothetical identity sketch only; no reference or ledger row is proposed now.

## Picker projection

The static projection follows the current phrase-first, then substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) over the live references and forms. The hypothetical row above has only the manufacturer-backed names and no aliases.

| Query | Current results | With hypothetical Original row | Effect |
| --- | ---: | ---: | --- |
| `Shreddies` | 0 | 1 | Misleading singleton for the brand line, which includes three currently named flavors. |
| `Shreddies Original` | 0 | 1 | Correctly selects the English-named variety. |
| `Shreddies Originale` | 0 | 1 | Correctly selects the French-named variety. |
| `céréales Shreddies` | 0 | 0 | No broad brand alias is proposed; the official manufacturer recipe phrase remains unallocated. |
| `shredded wheat cereal` | 1 (`ingredient-ref-shredded-wheat-cereal`) | 1 | Existing generic cereal remains unchanged. |
| `shredded wheat` | 1 (`ingredient-ref-shredded-wheat-cereal`) | 1 | No brand alias is added. |
| `blé filamenté` | 1 (`ingredient-ref-shredded-wheat-cereal`) | 1 | Existing Québec French identity remains unchanged. |
| `cereal` / `céréales` | 17 / 13 | 17 / 13 | The exact proposed product titles do not add generic cereal terms. |
| `wheat` / `blé` | 44 / 47 | 44 / 47 | No broad wheat terms are added to the proposed names or aliases. |

The key collision is semantic rather than a duplicate normalized key: adding only Original would make a broad brand-line query look resolved. Adding Honey and Cinnamon Vanilla as separate rows would be a different, wider review and is not proposed here.

## Recipe demand, forms, measures, and substitutions

The bundled manifest lists 114 recipe files. A scan of all file text and all 1,123 structured ingredient rows for `Shreddies`, `Shreddies Original`, `Shreddies Originale`, `céréales Shreddies`, the possible reference ID, and shredded-wheat wording found **zero matching files, rows, or existing ingredient-reference links**.

Post Canada publishes recipes that call for Shreddies cereal, including 2½ cups (625 mL) crushed cereal in its butter-tart squares and a divided 3¾-cup quantity plus a count of 60 whole pieces in its no-bake peanut-butter squares [S04–S05]. These are external manufacturer recipes, not matches in the bundled library. They name the brand without stating a Shreddies flavor and provide no cereal mass; the crushed and whole-piece quantities do not support a reusable density or unit mapping.

- **Forms:** Add none. The source set does not establish a generic dry/cooked state or a recipe-linked crushed form. Flavor variants are separate products, not forms of one ingredient.
- **Density and unit mappings:** If this candidate is reconsidered, leave density `null` and mappings empty. The 440 g, 635 g, and 1.24 kg package sizes are package quantities, and the manufacturer recipe volumes lack mass equivalents [S01, S04–S05].
- **Substitutions:** Add no global or contextual substitution. No reviewed source gives a tested, quantity-qualified replacement between Shreddies, generic shredded-wheat cereal, wheat flakes, bran flakes, or another ready-to-eat cereal.
- **Recipe links:** None; no bundled recipe requests this product.

## Source register

Sources were checked online on **2026-10-14**. Proposal-local IDs below are not added to the shared research ledger.

| Source ID | Source and source date | Supports and limits |
| --- | --- | --- |
| `WP03-SHREDDIES-ORIGINAL-R103-20261014-S01` | Post Consumer Brands Canada, [Original Shreddies](https://www.postconsumerbrands.ca/brand/shreddies/original-shreddies/), current product page; page copyright 2026, accessed 2026-10-14. | Names the product `Shreddies Original`, lists 440 g, 635 g, and 1.24 kg packages, says it is prepared in Canada and made with 100% whole-grain wheat. It does not specify a grain-forming process or a reusable measure. |
| `WP03-SHREDDIES-ORIGINAL-R103-20261014-S02` | Post Consumer Brands Canada, [Shreddies — page française](https://www.postconsumerbrands.ca/fr-ca/marques/shreddies-fr/), current brand page; ©2026, accessed 2026-10-14. | Uses the product title `Shreddies Originale`, describes the cereal as a small square made from 100% whole-grain wheat, and names Original, Honey, and Cinnamon Vanilla flavors. It does not provide an ingredient list or process specification for Original. |
| `WP03-SHREDDIES-ORIGINAL-R103-20261014-S03` | Metro Québec, [Céréales de blé à grains entiers Format économique, Shreddies](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-ble-entier-format-familial/p/628154437062), product 628154437062; accessed 2026-10-14. | Provides Québec French-facing product wording, a 635 g package, and an ingredient statement beginning with whole-grain wheat. Product title, formulation, and package size are SKU evidence, not reusable ingredient data. |
| `WP03-SHREDDIES-ORIGINAL-R103-20261014-S04` | Post Consumer Brands Canada, [Carrés au beurre aux céréales Shreddies](https://www.postconsumerbrands.ca/fr-ca/recipe/carres-au-beurre-aux-cereales-shreddies/), manufacturer recipe page; accessed 2026-10-14. | Calls for 2½ cups (625 mL) Post Shreddies cereal crushed into fine crumbs. The recipe does not specify the flavor or give a cereal mass, so the amount is not generalized. |
| `WP03-SHREDDIES-ORIGINAL-R103-20261014-S05` | Post Consumer Brands Canada, [Carrés aux Shreddies et au beurre d’arachide sans cuisson](https://www.postconsumerbrands.ca/fr-ca/recipe/carres-aux-shreddies-et-au-beurre-darachide-sans-cuisson/), manufacturer recipe page; accessed 2026-10-14. | Uses 3¾ cups of Shreddies, including 60 whole cereal pieces at approximately ¾ cup. It does not specify the flavor or give a mass equivalent. |
| `WP03-SHREDDIES-ORIGINAL-R103-20261014-S06` | Prior WP03 review, [Original Grape-Nuts picker-boundary hold](wp03-next-open-section-f-grain-candidate-review-20261012.md), source register row for Post Canada's brand directory; reviewed 2026-10-12. | Mentions Shreddies only as a brand listed by Post Canada while reviewing Grape-Nuts. It is not a Shreddies identity decision or source allocation. |
| `WP03-SHREDDIES-ORIGINAL-R103-20261014-S07` | Post Consumer Brands Canada, [Shreddies Cannelle Vanille](https://www.postconsumerbrands.ca/fr-ca/marques/shreddies-fr/shreddies-cannelle-vanille/), current French product page; product page dated 2026-03-23, accessed 2026-10-14. | Names Cinnamon Vanilla separately and lists cinnamon and natural flavours in that product's ingredients. It confirms a flavor-specific product boundary but is not the Original formulation. |
| `WP03-SHREDDIES-ORIGINAL-R103-20261014-S08` | Usito, Université de Sherbrooke, [blé](https://usito.usherbrooke.ca/d%C3%A9finitions/bl%C3%A9), accessed 2026-10-14; also documented in the integrated generic shredded-wheat review. | Defines `blé filamenté` for wheat transformed into filaments and generally eaten as a breakfast cereal, distinguishing it from puffed wheat. It does not state that Shreddies is made by this process. |

## Static checks and limits

- Exact ownership check covered the proposed ID, English/French titles, and `Shreddies` phrase across 1,440 live references, 105 forms, 63 legacy candidates, and 1,780 ledger records; no exact owner was found.
- Scope check covered the current Section F plan, roadmap, prior proposal and batch archives, live references/forms/ledger/legacy identities, and current active-agent assignments. The only prior archive mention is the incidental Post directory statement in S06.
- Picker counts were statically reproduced from the current reference and form search terms using the `IngredientSearch.kt` phrase-first and substring-fallback rules. No emulator or UI check was run.
- The complete bundled scan covered all 114 manifest-listed recipe files and 1,123 ingredient rows; no Shreddies or candidate-ID matches were found.
- The proposal text was checked for UTF-8 without BOM, mojibake, trailing whitespace, source-ID uniqueness against the ledger, balanced code fences, and valid relative repository links.
- No app tests or emulator work were run. This is a documentation-only hold with no catalog or ledger data change.

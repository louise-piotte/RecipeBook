# WP03 Section F R494 — Shreddies family identity review (2026-10-17)

## Review record

- **Scope:** Reopen the Shreddies Original picker hold from R103 by reviewing the Canadian manufacturer's currently listed Original, Honey, and Cinnamon Vanilla products together.
- **Recommendation:** Add three separate identity-only `GRAIN_AND_CEREAL` references for the current Canadian Shreddies varieties, with manufacturer-supported English and French names and narrow current Québec retail-title aliases.
- **Status:** Proposal only. This file is the only intended change; no catalog, ledger, plan, roadmap, recipe, generated index, or test file was changed.
- **Plan fit:** Section F still has open identity and terminology coverage ([active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L552)). R103 explicitly held Original pending a family-wide picker review; this proposal addresses that condition without closing the broader Section F sweep ([R103 hold](wp03-section-f-shreddies-original-picker-hold-r103-20261014.md)).
- **Snapshot:** 1,772 active ingredient references (253 `GRAIN_AND_CEREAL`), 143 ingredient forms, 56 legacy candidates, 2,130 research-ledger records, 9,745 source entries, 8,254 distinct source IDs, and 6,967 distinct source URLs. The manifest contains 114 recipe files and 1,123 structured ingredient rows.

## Why this family review is distinct

R103 held `Shreddies Original / Shreddies Originale` because the broad `Shreddies` query would otherwise return Original as a singleton while Post Canada named Honey and Cinnamon Vanilla as sibling varieties. The current Post Canada English products page still names exactly those three varieties, and its current French pages provide product-specific French titles for each. Current Québec retailer listings corroborate French product wording for the three specific products.

This is a new family-level decision, not an integration of the former Original-only row. A three-row set makes the unqualified brand query return the three named choices. Scope the set to the three varieties currently listed on Post Canada's Canadian pages; do not claim that the family has never had other variants or that this lineup will remain unchanged.

## Proposed identity rows

| Stable ID | English display | Québec French display | English aliases | French aliases |
|---|---|---|---|---|
| `ingredient-ref-shreddies-original-cereal` | `Shreddies Original cereal` | `Céréales Shreddies Originale` | `Original Shreddies` | `Céréales Shreddies originales` |
| `ingredient-ref-shreddies-honey-cereal` | `Shreddies Honey cereal` | `Céréales Shreddies au miel` | `Honey Shreddies` | `Céréales Shreddies au miel de Post` |
| `ingredient-ref-shreddies-cinnamon-vanilla-cereal` | `Shreddies Cinnamon Vanilla cereal` | `Céréales Shreddies Cannelle Vanille` | None | `Céréale à saveur de cannelle et vanille, Shreddies` |

All three rows use category `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`. The generic `cereal` / `céréales` wording in the display names identifies the product class; each exact manufacturer variant name remains searchable as a phrase within its display name. Aliases are limited to manufacturer page-title variants or current Québec retailer titles shown in the source register.

The manufacturer describes Shreddies as whole-grain-wheat cereal squares. The three flavor names and their distinct product pages support three named finished-cereal identities, not three ingredient forms. Keep every variety separate from generic `shredded wheat cereal / blé filamenté`: R103 found no manufacturer evidence establishing equivalent forming processes. The shared wheat base is not a reason to merge them or add wheat, shredded-wheat, or `blé filamenté` aliases.

## Current ownership and archive audit

The read-only audit checked normalized names and aliases on active references, form labels and match terms, legacy candidates, ledger record IDs and text, the active plan and roadmap, and the proposal/batch archive. Normalization followed the app's NFKD/accent-folded, punctuation-folded, phrase-first search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Surface | Current finding |
|---|---|
| Active references | No exact owner for `Shreddies`, `Shreddies Original`, `Shreddies Originale`, `Shreddies Honey`, `Shreddies au miel`, `Shreddies Cinnamon Vanilla`, `Shreddies Cannelle Vanille`, the proposed French retail phrases, or any of the three proposed IDs. `ingredient-ref-shredded-wheat-cereal` remains a separate existing identity. |
| Forms | None of the proposed names or IDs is owned by the 143 active forms. No form is proposed. |
| Legacy identities | None of the terms or IDs is owned by the 56 legacy candidates. |
| Research ledger | No record, decision, or source entry contains a Shreddies identity, candidate ID, or the proposed variants. The source URLs below have no current ledger URL owner. The reused R103 source IDs are proposal-local and are not in the ledger because R103 was a hold. |
| Plan, roadmap, proposal and batch archive | R103 is the sole focused Shreddies decision: it holds Original pending this family check. No Shreddies family integration exists. R181's Oat Crunch hold is a separate family-picker precedent, not a Shreddies owner. |
| Proposed identifiers and source IDs | No earlier proposal or batch uses these three proposed ingredient IDs or the new `WP03-SHREDDIES-FAMILY-R494-20261017-S01` through `-S08` IDs; they are proposal-local here and remain unallocated in live data. Reuse the R103 IDs noted below for their exact URLs rather than minting another source ID for the same page. |

## Phrase-first picker projection

This is a static projection over current reference and form terms using the phrase-first matching rule in `IngredientSearch.kt`; it is not a live Android picker check. Counts use the live snapshot above and the proposed displays and aliases in this review.

| Query | Current results | With R494 | Effect |
|---|---:|---:|---|
| `Shreddies` | 0 | 3 | Returns Original, Honey, and Cinnamon Vanilla together instead of selecting one flavor implicitly. |
| `Shreddies Original` / `Original Shreddies` | 0 / 0 | 1 / 1 | Selects only the Original product. |
| `Shreddies Originale` / `Céréales Shreddies originales` | 0 / 0 | 1 / 1 | Selects only Original using manufacturer or Québec retail wording. |
| `Shreddies Honey` / `Honey Shreddies` | 0 / 0 | 1 / 1 | Selects only the Honey product. |
| `Shreddies au miel` / `Céréales Shreddies au miel de Post` | 0 / 0 | 1 / 1 | Selects only Honey using manufacturer or Québec retail wording. |
| `Shreddies Cinnamon Vanilla` / `Shreddies Cannelle Vanille` | 0 / 0 | 1 / 1 | Selects only Cinnamon Vanilla. |
| `Céréale à saveur de cannelle et vanille` | 0 | 1 | Selects only the current Metro-listed Cinnamon Vanilla product. |
| `Céréales Shreddies` | 0 | 3 | French family wording returns all three variants. |
| `cereal` / `céréales` | 53 / 49 | 56 / 52 | Each named product is included in the corresponding broad class query. |
| `shredded wheat` / `blé filamenté` | 1 / 1 | 1 / 1 | Existing generic shredded-wheat results are unchanged. |

Do not add bare `Shreddies` or `céréales Shreddies` as aliases to a single reference. The proposed displays already make either family query return all three siblings. Do not add generic `shredded wheat`, `whole wheat`, or translated process terms.

## Full bundled recipe-demand scan

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. It checked complete serialized recipe content and structured-row fields for `Shreddies`, each English and French variant name, the proposed French retailer titles, all proposed IDs, and related `shredded wheat cereal / blé filamenté` wording.

- Matching recipe files: **0**.
- Matching structured ingredient rows: **0**.
- Direct recipe links to any proposed Shreddies ID: **0**.
- Corpus bytes: **753,988**; manifest-ordered SHA-256: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

There is no bundled recipe evidence for selecting a variant, adding a recipe link, or adding a preparation form.

## Evidence states and numeric limits

If root accepts the three identities, propose one ledger record per ID with:

| Record IDs | `identityState` | `measurementState` | `substitutionResearchState` |
|---|---|---|---|
| `ingredient-ref-shreddies-original-cereal` | `verified` | `researched_no_supported_value` | `not_yet_researched` |
| `ingredient-ref-shreddies-honey-cereal` | `verified` | `researched_no_supported_value` | `not_yet_researched` |
| `ingredient-ref-shreddies-cinnamon-vanilla-cereal` | `verified` | `researched_no_supported_value` | `not_yet_researched` |

Attach each row's applicable manufacturer and retailer sources from the source register. No measurement observation is proposed. The reviewed sources give SKU package sizes (440 g, 635 g, 1.24 kg, and 420 g) only; these are package facts, not reusable kitchen measures, densities, unit mappings, or cooking yields. Do not convert external manufacturer recipe quantities from R103 into catalog measures: those recipes use unqualified Shreddies and do not identify a variant.

No substitution research is completed in this identity review. Add no forms, recipe links, active conversions, yields, density, unit mappings, or substitution rules. Do not infer interchangeability with generic shredded wheat, another Shreddies flavor, or another ready-to-eat cereal.

## Source register

Sources were checked on **2026-10-17**. Reused source IDs below retain their R103 identifiers and exact URLs; no new source ID should be assigned for those pages. New IDs remain proposal-local until root accepts an integration.

| Source ID / reuse | Source URL | Supports and limits |
|---|---|---|
| New `WP03-SHREDDIES-FAMILY-R494-20261017-S01` | Post Consumer Brands Canada, [Shreddies Cereal Products](https://www.postconsumerbrands.ca/brand/shreddies/products/). | Current Canadian manufacturer page names the Original, Honey, and Cinnamon Vanilla varieties together. It defines the family scope for this review, not a permanent or global product roster. |
| Reuse `WP03-SHREDDIES-ORIGINAL-R103-20261014-S01` | Post Consumer Brands Canada, [Original Shreddies](https://www.postconsumerbrands.ca/brand/shreddies/original-shreddies/). | Current English product page names `Shreddies Original`, describes the whole-grain-wheat cereal, and lists package options. The old R103 source ID is proposal-local and has no ledger owner. Package sizes are not measures. |
| Reuse `WP03-SHREDDIES-ORIGINAL-R103-20261014-S02` | Post Consumer Brands Canada, [Shreddies, page française](https://www.postconsumerbrands.ca/fr-ca/marques/shreddies-fr/). | Current Canadian French brand page names `Shreddies Originale` and lists Originale, miel, and Cannelle Vanille together. Reuse the exact existing R103 ID; this supports current French family naming. |
| New `WP03-SHREDDIES-FAMILY-R494-20261017-S02` | Post Consumer Brands Canada, [Shreddies Originale](https://www.postconsumerbrands.ca/fr-ca/marques/shreddies-fr/shreddies-originale/). | Current French product page gives the exact title `Shreddies Originale`, the 440 g, 635 g, and 1.24 kg package sizes, and the whole-grain-wheat cereal description. It supports product identity and French wording only. |
| New `WP03-SHREDDIES-FAMILY-R494-20261017-S03` | Post Consumer Brands Canada, [Honey Shreddies](https://www.postconsumerbrands.ca/brand/shreddies/honey-shreddies/). | Current English page's product heading is `Shreddies Honey` and lists 440 g and 635 g packages. It supports the separate Honey product, not a household measure. |
| New `WP03-SHREDDIES-FAMILY-R494-20261017-S04` | Post Consumer Brands Canada, [Shreddies au Miel](https://www.postconsumerbrands.ca/fr-ca/marques/shreddies-fr/shreddies-au-miel/). | Current Canadian French title and product page identify the Honey variety and list 440 g and 635 g packages. Supports the French display, not a general honey-cereal alias. |
| New `WP03-SHREDDIES-FAMILY-R494-20261017-S05` | Post Consumer Brands Canada, [Shreddies Cinnamon Vanilla](https://www.postconsumerbrands.ca/brand/shreddies/shreddies-cinnamon-vanilla/). | Current English page names this product separately and lists a 420 g package. Supports its identity, not package-to-measure conversion. |
| Reuse `WP03-SHREDDIES-ORIGINAL-R103-20261014-S07` | Post Consumer Brands Canada, [Shreddies Cannelle Vanille](https://www.postconsumerbrands.ca/fr-ca/marques/shreddies-fr/shreddies-cannelle-vanille/). | Current Canadian French product page gives the exact Cinnamon Vanilla title and lists its distinct ingredients. Reuse the R103 source ID and exact URL; it remains proposal-local, not ledger-owned. |
| New `WP03-SHREDDIES-FAMILY-R494-20261017-S06` | Mayrand Québec, [Céréales Shreddies originales](https://mayrand.ca/fr/nos-produits/epicerie/cereales-et-barre/cereales/cereales-shreddies-originales-16417). | Current Québec retailer title identifies the Original product; the page lists the 635 g package and UPC 628154437062. Package and UPC are product identifiers, not measures. |
| New `WP03-SHREDDIES-FAMILY-R494-20261017-S07` | Walmart Canada, [Céréales Shreddies au miel de Post, 440 g](https://www.walmart.ca/fr/ip/C-r-ales-Shreddies-au-miel-de-Post-format-de-vente-au-d-tail-440-nbsp-g/59EV21MPQKK0). | Current French-language Canadian retail listing uses the proposed Honey alias and distinguishes the honey-flavored product. Its 440 g package is SKU-specific. |
| New `WP03-SHREDDIES-FAMILY-R494-20261017-S08` | Metro Québec, [Céréale à saveur de cannelle et vanille, Shreddies, 420 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereale-a-saveur-de-cannelle-et-vanille/p/628154435907). | A recent Metro Québec listing uses the proposed Cinnamon Vanilla alias and item number 628154435907. Its indexed product content was available during this review; do not infer current local stock, and do not treat package size as a kitchen measure. |
| Reuse `WP03-SHREDDIES-ORIGINAL-R103-20261014-S04` and `-S05` | Post Consumer Brands Canada, [Carrés au beurre aux céréales Shreddies](https://www.postconsumerbrands.ca/fr-ca/recipe/carres-au-beurre-aux-cereales-shreddies/) and [Carrés aux Shreddies et au beurre d’arachide sans cuisson](https://www.postconsumerbrands.ca/fr-ca/recipe/carres-aux-shreddies-et-au-beurre-darachide-sans-cuisson/). | R103 records these manufacturer recipes as unqualified Shreddies uses. They do not identify a flavor or establish transferable product measurements; they are context for keeping the brand query multi-result. |

## Root-review recommendation

Accept the three separate identity-only rows as the family-level resolution of R103's exact picker hold. The current Canadian manufacturer pages enumerate the three supported varieties, and current Québec French sources name each product. Keep the review bounded to these named products, retain all three as separate search choices, and preserve the existing generic shredded-wheat identity without aliases or inferred process equivalence. Leave forms, measurements, conversions, yields, recipe links, and substitutions empty; Section F remains open.

This proposal changed documentation only. No tests, builds, emulator checks, or deployment were run.

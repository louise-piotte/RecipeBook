# WP03 Section F R762 — Post Shredded Wheat & Bran Spoon Size identity review

## Review record

- **Reviewed:** 2026-10-18.
- **Plan fit:** Section F leaves remaining product identity and terminology coverage open; its shredded-wheat entry explicitly keeps bran-added cereal separate from plain `shredded wheat cereal / blé filamenté` ([active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L855)). The broader checklist remains open ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)).
- **Candidate:** Post Shredded Wheat & Bran Spoon Size, the current Canadian bran-added spoon-size product.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, `ingredient-ref-post-shredded-wheat-bran-spoon-size`, using the current manufacturer’s English and French product titles and the Québec retailer description phrase `céréales Shredded Wheat & Bran`.
- **Boundary:** Keep this bran-added SKU distinct from the existing plain shredded-wheat cereal, bran flakes, wheat bran, and Post Shreddies. Add no forms, measures, conversions, package yield, recipe links, or substitutions.
- **Status:** Proposal only. No catalog, ledger, plan, roadmap, recipe, or generated data changed.
- **Snapshot:** 1,849 active references (282 `GRAIN_AND_CEREAL`), 185 forms, 56 legacy candidates, 2,243 ledger records (10,529 source entries; 8,885 distinct source IDs; 7,532 distinct URLs), and 114 manifest recipes / 1,123 structured ingredient rows.

## Why this is a distinct open gap

The 2026-10-12 plain shredded-wheat review already records Post’s Spoon Size Shredded Wheat & Bran as a separate variety and deliberately excludes it from the plain identity. That review did not add a bran-product identity or audit its current bilingual product pages, Québec retail wording, or product-specific picker effects ([review](wp03-section-f-shredded-wheat-cereal-identity-review-20261012.md), [integration note](../batches/wp03-section-f-shredded-wheat-cereal-integration-20261012/README.md)). This proposal resolves only that expressly separate product.

This candidate is also separate from R494’s Post Shreddies Original, Honey, and Cinnamon Vanilla family. Shreddies are a different cereal and R494 kept all three distinct from generic shredded wheat ([R494](wp03-section-f-next-gap-review-r494-20261017.md), [integration note](../batches/wp03-wp04-wp06-r494-r496-gap-review-integration-20261017/README.md)). It does not overlap R756’s whole-sorghum forms or R759’s Apple Cinnamon Cheerios identity ([R756](wp03-section-f-next-gap-review-r756-20261018.md), [R759](wp03-section-f-next-gap-review-r759-20261018.md)).

## Product identity and proposed names

Post Consumer Brands Canada currently lists the named product as **Post Shredded Wheat & Bran Spoon Size**, available in 525 g boxes and prepared in Canada [S01]. Its Canadian French product page gives the title **Shredded Wheat Spoon Size Wheat & Bran de Post** and the same package size [S02]. The French title is the manufacturer’s product wording; this review does not present it as an OQLF terminology ruling. The Québec Super C page title is **Céréales de blé de grains entiers avec fibres, Shredded Wheat**; its description uses the phrase **céréales Shredded Wheat & Bran** and identifies the 525 g Post item as product 628154011323, with whole-grain wheat and wheat bran in the product details [S03]. The page showed the item unavailable at its selected Aylmer store when checked; the description phrase supports a local search alias, not local stock.

| Field | Proposed value | Evidence and limit |
|---|---|---|
| Stable ID | `ingredient-ref-post-shredded-wheat-bran-spoon-size` | Unallocated in active references, forms, legacy candidates, ledger, plan, and archive. |
| `nameEn` | `Post Shredded Wheat & Bran Spoon Size` | Exact current English manufacturer product heading [S01]. |
| `nameFr` | `Shredded Wheat Spoon Size Wheat & Bran de Post` | Exact current Canadian French manufacturer product heading [S02]. |
| `aliasesEn` | `[]` | The English manufacturer heading is searchable as written. |
| `aliasesFr` | `["céréales Shredded Wheat & Bran"]` | Exact phrase from the product description on the current Québec retailer listing [S03]; retailer wording, not a terminology authority. |
| Category | `GRAIN_AND_CEREAL` | Finished ready-to-eat cereal product. |

Keep the product separate from:

| Neighbor | Current owner | Boundary |
|---|---|---|
| Plain shredded-wheat cereal / blé filamenté | `ingredient-ref-shredded-wheat-cereal` | The existing reference covers the plain cereal identity. Post names Spoon Size Shredded Wheat & Bran as a separate variety; its wheat-and-bran formulation is not a synonym or a form of the plain product [S01, S04]. |
| Wheat bran / son de blé and bran-flakes cereal / céréales de son en flocons | Their active ingredient references | Ingredient or flake cereal classes do not identify this finished wheat-and-bran biscuit cereal. |
| Post Shreddies | `ingredient-ref-shreddies-original-cereal`, `ingredient-ref-shreddies-honey-cereal`, `ingredient-ref-shreddies-cinnamon-vanilla-cereal` | Separate Post product family and cereal product; do not infer process equivalence from the shared word `Shreddies`. |

Do not interpret `Spoon Size` as a form or preparation state. The product page establishes a package variant, not a recipe conversion, portion, or yield. Its ingredient list does not provide proportions, so do not link or decompose it into wheat and bran references.

## Exact ownership and archive audit

The audit checked active reference names and aliases, form labels and match terms, the 56 legacy candidates, ledger records and source URLs, the active plan, roadmap, proposal/batch archive, and manifest-listed recipe files.

| Surface | Finding |
|---|---|
| Active references | No exact owner for the proposed stable ID, full English/French product titles, or Québec retailer description phrase. The broad phrase `shredded wheat` is already present on the plain cereal identity and is intentionally not proposed as an alias. |
| Forms | No matching form or form search term; no form is proposed. |
| Legacy candidates | No exact candidate ID or product title owner. |
| Research ledger | No dedicated bran-product identity record. The existing plain-cereal record’s family source mentions the bran-added variant only to distinguish it from the plain product. Reuse source ID `WP03-SHREDDED-WHEAT-20261012-S01` for family context if needed; do not create a second source entry for its already-owned URL. |
| Proposed source IDs and URLs | `WP03-SHREDDED-WHEAT-BRAN-R762-20261018-S01` through `S03` and the three product-page URLs below have no exact ledger or proposal-archive owner. The proposed reference ID is unallocated. |
| Prior decisions | The 2026-10-12 review is the only focused earlier decision mentioning this product, and it explicitly leaves the bran-added variety outside the plain identity. R494 is the separate Shreddies family review. No later R756 or R759 review covers this cereal. |

No shared source ID, reference ID, form ID, ledger record, or alias is allocated by this proposal.

## Static picker projection

This projection uses current reference/form search terms and the case-, accent-, and punctuation-folded, phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row adds only the proposed titles and French retailer phrase.

| Query | Current | With R762 | Effect |
|---|---:|---:|---|
| `Post Shredded Wheat & Bran Spoon Size` | 0 | 1 | Exact English product heading. |
| `Shredded Wheat Spoon Size Wheat & Bran de Post` | 0 | 1 | Exact French manufacturer heading. |
| `céréales Shredded Wheat & Bran` | 0 | 1 | Exact Québec retailer product-description phrase. |
| `shredded wheat` | 1 | 2 | Shows the plain cereal and the named bran-added product; the shared phrase is present in the product title, not added as an alias. |
| `shredded wheat cereal` | 1 | 1 | Remains on the existing plain cereal because phrase-first matching still finds that complete phrase. |
| `blé filamenté` | 1 | 1 | Remains on the existing plain cereal; no generic French process term is added to the new row. |
| `bran flakes` | 3 | 3 | Phrase-first results stay on the three existing bran-flake products. |
| `bran` | 14 | 15 | Broad partial search gains this named wheat-and-bran cereal. |
| `cereal` / `céréales` | 77 / 73 | 77 / 74 | The English count is unchanged; the French count gains the retailer phrase’s generic cereal word. |

These are static counts, not an Android picker test. The product-qualified phrases resolve to one row, while the expected broad `shredded wheat` query presents both the generic cereal and this named formulation.

## Bundled recipe demand

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. It searched raw recipe JSON and ingredient-row fields for the proposed stable ID; both product titles; the retailer phrase; and `Post Shredded Wheat`, `Shredded Wheat & Bran`, and `Shredded Wheat Spoon Size` variants. It found **0 matching recipe files and 0 matching ingredient rows**. Generic wheat, bran, or cereal ingredients do not establish demand for this finished SKU. Add no recipe link or recipe-text change.

## Numeric and substitution boundaries

- **Measurements:** No portion, serving, or label measurement is proposed. Manufacturer product pages identify the product and its 525 g package, but package net mass is not a recipe measure. Serving and transferable-measure research was out of scope and was not performed; no such measure is claimed.
- **Forms and conversions:** Add no forms, density, unit mappings, or active conversions. `Spoon Size` is part of the named product variant.
- **Yield and package size:** Record no package or cooking yield. The 525 g package is SKU context only.
- **Substitution:** No reviewed source recommends a tested replacement between this product, plain shredded wheat, bran flakes, or another cereal. Add no finding or runtime rule.
- **Recipe links:** The corpus scan found no demand, so add no link.

If accepted, create the identity-only reference with `defaultDensity: null` and `unitMappings: []`; keep the ledger’s identity verified, measurement research `not_yet_researched`, and substitution research `not_yet_researched`. Add no form, observation, conversion, yield, recipe link, or substitution finding.

## Source register

Sources accessed 2026-10-18. S01–S03 are proposal-local. S04 is an existing ledger source and is reused only for family context.

| Source | Source and locator | Evidence and limits |
|---|---|---|
| **S01** `WP03-SHREDDED-WHEAT-BRAN-R762-20261018-S01` | Post Consumer Brands Canada, [Original Wheat & Bran Spoon Size](https://www.postconsumerbrands.ca/brand/shredded-wheat/products/original-wheat-bran-spoon-size/). | Current English product page headings the item `Post Shredded Wheat & Bran Spoon Size`, lists 525 g boxes, and says it is prepared in Canada. Product identity and current manufacturer naming only. |
| **S02** `WP03-SHREDDED-WHEAT-BRAN-R762-20261018-S02` | Post Consumer Brands Canada, [L’original Spoon Size Wheat et Bran](https://www.postconsumerbrands.ca/fr-ca/marques/shredded-wheat-fr/produits/loriginal-spoon-size-wheat-et-bran/). | Current Canadian French product page headings the item `Shredded Wheat Spoon Size Wheat & Bran de Post`, lists 525 g boxes, and says it is prepared in Canada. This is manufacturer display wording, not an OQLF ruling. |
| **S03** `WP03-SHREDDED-WHEAT-BRAN-R762-20261018-S03` | Super C Québec, [Céréales de blé de grains entiers avec fibres, Shredded Wheat](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-de-ble-de-grains-entiers-avec-fibres/p/628154011323). | Current French product page title is `Céréales de blé de grains entiers avec fibres, Shredded Wheat`; its description calls the product `céréales Shredded Wheat & Bran`. The page identifies a 525 g Post product, product number 628154011323, and whole-grain wheat plus wheat bran. It showed unavailable at the selected Aylmer store; no stock or broad-availability claim is made. Supports the description phrase as a narrow local search alias only. |
| **S04 — reuse existing ledger source** `WP03-SHREDDED-WHEAT-20261012-S01` | Post Consumer Brands Canada, [Shredded Wheat Cereal](https://www.postconsumerbrands.ca/brand/shredded-wheat/). | Existing source owned by `ingredient-ref-shredded-wheat-cereal`. It lists plain products separately from Spoon Size Shredded Wheat & Bran. Reuse this source ID and URL if family context is attached; do not add a duplicate URL entry. |

## Review checks

- [x] Read current `AGENTS.md`, the active plan and roadmap, R756 and R759, the earlier plain shredded-wheat decision, R494’s separate Shreddies family review, and the relevant integration notes.
- [x] Opened current English and French Canadian manufacturer product pages and the Québec retailer page; verified the manufacturer product headings, the retailer page title and description phrase separately, the 525 g product, and the limited store-availability statement.
- [x] Checked the proposed ID, exact product titles, alias, form surface, legacy candidates, source IDs and URLs, ledger ownership, and earlier proposal/batch history. The only prior product mention is the existing plain-cereal boundary note.
- [x] Projected exact, generic, and neighboring queries against the current phrase-first picker behavior.
- [x] Scanned all 114 manifest-listed recipes and 1,123 structured ingredient rows; found no candidate-specific demand or direct link.
- **No software tests, build, emulator, or deployment were run.** This is a proposal-only documentation change; no database JSON or application code changed.

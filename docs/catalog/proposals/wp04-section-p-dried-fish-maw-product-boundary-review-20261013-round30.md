# WP04 Section P — dried fish maw product-boundary review (round 30)

- **Review and source-access date:** 2026-10-13.
- **Scope:** commercial dried fish maw / fish air bladder as a regional seafood product; exact active, form, legacy, ledger, picker, and bundled-recipe ownership.
- **Disposition:** Keep dried fish maw as a research-only candidate. Do not add an active row yet. Current Canadian retail and official terminology evidence support a real edible product, but an unqualified `fish maw` or `vessie natatoire` search would resolve to this dried product alone, while Québec sources also document a distinct Gaspesian cod-backbone preparation that includes the bladder. The bundle has no recipe demand to establish which meaning a user expects.
- **Worktree scope:** this proposal file only. No catalog, ledger, plan, roadmap, or recipe data changed. No tests were run.
- **New source-ID prefix:** `WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-`. It was absent from the proposal/archive and current ledger before this packet was drafted.

## Bounded candidate

The one product reviewed here is the edible fish air bladder sold dried in Canadian Asian-food retail. If later accepted, the narrow identity to reconsider is **dried fish maw / vessie natatoire séchée**. This is a product name for a dried organ; it is not a fish species, a universal dried-fish form, or a species-specific by-product. The reviewed Toronto listing does not identify a fish species, so do not infer Atlantic cod or another taxon from the product name or regional context.

Keep it separate from fish flesh and fillets; salt cod and stockfish; Bonga dried fish powder; anchovy powder; dried bonito flakes; fish balls; surimi paste and surimi shreds; fish stock and fish sauce; actual crab meat; and isinglass or other extracted fish-glue products. None is an alias, form, or supported substitute for this dried organ.

## Checklist and archive boundary

The active Section P checklist leaves fish powder, fish balls, and surimi open, along with the broader regional-seafood review. Prior decisions already cover active fish balls and Bonga dried fish powder, while generic fish powder, anchovy powder, fried fish-ball states, and Aquamar surimi shreds are held for their documented scope or picker reasons. The recent crab-flavoured pollock flakes proposal concerns a prepared pollock product, not this organ.

A targeted search of the active plan, roadmap, WP04 proposals and batches, live references, forms, legacy identities, and research ledger found no prior `fish maw`, `swim bladder`, `air bladder`, `fish bladder`, `vessie natatoire`, or `nauve` product-boundary decision. The exact candidate and the proposed future ID `ingredient-ref-dried-fish-maw` have no current allocation. The new source-ID prefix above is also unique in the checked archive.

## Current ownership and picker audit

The snapshot used the live search behavior in `IngredientSearch.kt`: normalize accents and punctuation, prefer complete word-phrase matches anywhere in a display or alias, then use substring fallback. A legacy-import candidate is not an active picker result.

| Live artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,363 references | 437,487 | `4c637d54d7bd6d02f0bbed6d6939a603bab9a4813da2136927c6afc3293d9b36` |
| `ingredient-forms.v1.json` | 100 forms | 74,742 | `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,690 records | 6,508,275 | `1bc3e3a45a96d901ed3dc72bd7ed62110eb51086916658f7772e5084a1b4e04a` |

Exact normalized checks found no active name/alias, form label/match term, legacy name, or ledger record keyed to `fish maw`, `dried fish maw`, `vessie natatoire`, `vessie natatoire séchée`, `swim bladder`, `air bladder`, `fish bladder`, `nauve`, or `nôve`. The research ledger contains no fish-maw candidate or source record.

| Search query | Current picker result | With a hypothetical `dried fish maw / vessie natatoire séchée` row |
|---|---|---|
| `fish maw`; `dried fish maw` | No result | The dried product row alone. The bare `fish maw` phrase matches inside its English display. |
| `vessie natatoire`; `vessie natatoire séchée` | No result | The dried product row alone. The bare anatomy phrase matches inside its French display. |
| `fish` | Bonga dried fish powder; fish balls; fish sauce; fish stock (4 rows) | Those four plus the dried-product row (5 rows). |
| `poisson` | Bagoong isda; Bonga powder; fish balls; fish sauce; fish stock; pla ra; prahok (7 rows) | Unchanged if the French display remains `vessie natatoire séchée` with no `poisson` alias. |
| `surimi`; `fish powder`; `poudre de poisson` | No generic active result for the unresolved product meanings; the specific Bonga row participates in its own phrase search | Unchanged; none is proposed as an alias. |

The first two rows of the table are the blocking picker issue. Adding the source-supported dried product now would silently route the unqualified French anatomy term and bare English product phrase to one preparation, with no active sibling result to show the user the boundary. Do not add broad aliases to the Bonga, pollock, cod, fish-ball, or surimi references to work around this.

## Recipe demand and product-state evidence

The full bundled-library audit read all **114** manifest-listed recipe files and **1,123** ingredient rows, and searched every recipe JSON text field for the exact candidate terms and related bladder/nauve spellings. It found **zero matching files and zero matching ingredient rows**. Manifest SHA-256 is `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; the manifest-ordered recipe corpus is 753,792 bytes with SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

There is external culinary use, but it does not resolve local recipe intent:

- Agriculture and Agri-Food Canada’s fish-and-seafood market report records a Chinese-market `Fish Maw` item as a 93 g product used for soup, stir-frying, or seasoning. This is a product example from the report’s China market research, not Québec recipe demand or a Canadian label [S07].
- Food Network’s LeeAnn Chin **Fish Maw Soup** recipe lists 2 oz of “processed fish maw (hot sandblasted)” for 4–5 servings. Its cook’s note distinguishes processed dried maw from hard, unprocessed dried maw that needs frying before soaking. This is a recipe-specific processed state; the amount cannot be carried over to an unspecified dried retail item [S08].
- Québec’s historical Gaspesian sources describe `nauve` / `nôve` as cod backbone with attached flesh and record the swim bladder as part of a simply boiled regional preparation. That is a distinct local product/use context, not evidence that a dried imported listing is fresh cod maw or the same recipe ingredient [S06].

## Measurement, yield, and substitution limits

The current Toronto retailer lists a medium dried fish-maw SKU as 454 g and in stock, but gives no fish species, ingredient declaration, piece count, or dried-to-soaked yield. The same retailer’s small SKU page titles the product 454 g while its embedded item metadata reports a different shipping weight; do not use that page to establish a package conversion. These retail sizes do not establish a usual recipe portion or density [S01].

Food Network’s 2 oz observation is limited to its specified hot-sandblasted processed product and four-to-five-serving soup. Its own directions make clear that dried product may require different preparation; no moisture gain, drained weight, or rehydration ratio is given. Do not create a density, cup measure, count mapping, package yield, rehydration conversion, or active recipe amount.

No reviewed source tests replacement between dried fish maw and fresh/cooked cod backbone or bladder, cod flesh, fish balls, surimi, imitation seafood, fish powder, stock, crab meat, or isinglass. Add no form, substitution rule, or recipe-line link.

## Source register

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-S01** | Shing Hing Food, Toronto, [Uncle Bill Dried Fish Maw (M), 454 g](https://www.shinghingfood.com/collections/fish-maw/products/ub-dried-fish-maw-m-bag-454g), product heading, SKU SM0086, stock status, and retailer footer. | Current Canadian retail evidence for the exact English dried-product wording and sale; the page says the seller is established in Toronto and ships within Canada. It provides no species or complete package label. Use only the M listing’s displayed 454 g as package text; do not infer portion, density, or rehydration yield. |
| **WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-S02** | CFIA, [Fish Maw recalled due to undeclared sulphites](https://recalls-rappels.canada.ca/en/alert-recall/fish-maw-recalled-due-undeclared-sulphites), summary and affected-products table, last updated 2023-08-01. | Official Canadian recall identifies a 9 kg retail/food-service item as `Fish Maw` and classifies it as fish and seafood. It does not state species, whether the item was dried, or a recipe use; it corroborates Canadian product naming, not the retail SKU’s composition. |
| **WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-S03** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Common name” and “Surimi” sections (especially lines 64–73 and 90–98); page crawled 2026-10-13. | Current Canadian guidance says fish includes parts, products, and by-products, and that a common name may be a generally known or descriptive name when no prescribed standard applies. Its surimi guidance separately distinguishes a fish-protein paste from finished products. It is a labeling rule, not a species or culinary crosswalk for fish maw. |
| **WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-S04** | CFIA, [Canadian Standards of Identity: Volume 3 – Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-3), last amended 2024-12-18; and [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 18, clauses 18.1.1–18.1.5. | The current retrieved texts contain no `fish maw` or `swim bladder` entry. Volume 18 distinguishes fish, prepared fish, preserved fish, and fish protein. This supports treating maw as an otherwise named/described fish product, not as one of those flesh or powder standards; absence from the standards is not a prohibition or a complete market-name survey. |
| **WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-S05** | Government of Canada, [Glossary of fisheries terms, English–French](https://publications.gc.ca/collections/collection_2014/tpsgc-pwgsc/S52-2-161-1978-fra.pdf), 1978, PDF p. 107, alphabetical entry “fish maw”: “the air bladder of a fish” / `vessie natatoire`. | Authoritative bilingual terminology evidence for the organ and a plausible French rendering. It is a 1978 terminology glossary, not a current Québec food label and not proof that all dried products share one preparation. |
| **WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-S06** | Jacques Rousseau, [“Ethnobotanique et ethnozoologie gaspésiennes”](https://www2.ville.montreal.qc.ca/jardin/archives/rousseau/publi/Ethnobotanique_et_ethnozoologie_gaspesiennes.pdf), *Archives de folklore* 3 (1948), pp. 51–64, cod (`morue`) culinary-use entry; Ville de Montréal Jardin botanique digital archive. | Records the Gaspesian `nauve` / `nôve` as cod backbone with attached flesh and membranes, and separately describes the bladder as used in a simply boiled dish. This is historic oral/ethnographic evidence for a distinct local use, not current retail availability or a modern standardized product definition. |
| **WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-S07** | Agriculture and Agri-Food Canada, [Sector Trend Analysis – Fish and seafood trends in China](https://agriculture.canada.ca/en/international-trade/market-intelligence/reports-and-guides/sector-trend-analysis-fish-and-seafood-trends-china), “Fish Maw” product-launch example, source data Mintel 2024. | A Canadian federal market report describes a 93 g Chinese-market product used for soup, stir-frying, or seasoning. The item example is dated May 2021 and does not establish local Canadian/Québec demand or product equivalence. |
| **WP04-SECTIONP-DRIED-FISH-MAW-20261013-R30-S08** | Food Network, [Fish Maw Soup](https://www.foodnetwork.com/recipes/fish-maw-soup-recipe-1938856), recipe credited to LeeAnn Chin, ingredient line, yield, directions, and cook’s note; copyright 2001. | Shows one use and one amount for hot-sandblasted processed fish maw and explicitly distinguishes hard unprocessed dried maw. It is not a Canadian/Québec demand source, and its 2 oz amount is not transferable to the current retailer product. |

## Next action

Keep the candidate unallocated. Revisit it if a bundled or Québec recipe explicitly calls for dried fish maw, or if the picker can show the dried commercial product alongside a separate unqualified or regional cod-bladder interpretation. At that point, verify a current bilingual Québec product or recipe name and repeat the exact query audit before deciding on an identity-only row. Do not add species aliases, forms, package measures, recipe links, or substitutions during that follow-up without source-specific evidence.

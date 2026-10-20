# WP04 Section P — lumpfish roe / caviar de lompe product-boundary review

**Reviewed:** 2026-10-12

**Recommendation:** Hold a species-qualified lumpfish-roe reference until a bundled recipe calls for it.

**Change status:** Root-reconciled as a documentation-only hold. No catalog or ledger allocation was made; see [`wp04-section-p-lumpfish-roe-caviar-hold-integration-20261012/README.md`](../batches/wp04-section-p-lumpfish-roe-caviar-hold-integration-20261012/README.md).

**Exact open checklist item:** `[ ] Roe, tobiko, masago, salmon roe, bottarga, and caviar where recipes call for them.` in the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L3694).

**Scope:** Marketed roe from *Cyclopterus lumpus*, sold in Québec as `œufs de lompe` / `caviar de lompe` and in Canada as `lumpfish roe` / `lumpfish caviar`. This is a distinct product from whole lumpfish. It is not a generic roe, caviar, or whole-fish identity.

## Decision

The product itself is well evidenced. OQLF normalizes Québec French `lompe` for *Cyclopterus lumpus*, CFIA lists the English/French fish-name pair `Lumpfish / Lompe`, and current Québec-facing listings sell the roe as `œufs de lompe` or `caviar de lompe`. Fisheries and Oceans Canada describes Atlantic Canadian fisheries as targeting females for roe marketed as caviar, with roe as the landed product. Current product pages distinguish lumpfish roe from tobiko, masago, salmon roe, bottarga, and sturgeon caviar.

That evidence supports a future product identity, but the bundled library does not call for it. The current roe checklist remains recipe-conditioned, and the full recipe scan found no lumpfish, roe, fish-egg, or caviar demand. Do not allocate an active reference or ledger candidate now. If a recipe later specifies this product, review `lumpfish roe / œufs de lompe` as a separate `PROTEIN` identity. Any alias should stay species-qualified, such as `lumpfish caviar` and `caviar de lompe`; do not add bare `roe`, `fish eggs`, or `caviar` as aliases.

This review does not revisit the whole-fish hold. The existing [lumpfish / lompe whole-fish review](wp04-section-p-lumpfish-lompe-identity-review-20261012.md) explicitly places roe and caviar outside its scope and says to assess them as a separate future product. The adjacent [tobiko/masago review](wp04-tobiko-masago-roe-boundary-review-20261009.md) distinguishes those products from salmon roe, caviar, bottarga, and sea-urchin roe, while the [bottarga recheck](wp04-bottarga-coordinator-recheck-20261009.md) defers generic roe products without recipe demand. Neither assigns a lumpfish-roe identity or evaluates the current Québec product pages and its live picker projection.

## Species, product, and Québec naming

- OQLF gives `lompe` as the normalized Québec name, English `lumpfish`, and Latin *Cyclopterus lumpus*. Its entry is in the edible-fish domain and notes commercial potential in Québec. The entry names the fish, not a processed roe product. [S01]
- CFIA’s Fish List lists TSN 167612, *Cyclopterus lumpus*, as `Lumpfish / Lompe`. The Fish List is naming guidance for the species; it does not name a roe SKU or attest to a specific product process. [S02]
- TERMIUM Plus’s terminology record for caviar substitutes describes fish roe prepared like caviar, notes that lumpfish is among the species used, and gives `caviar de lompe` as a species-qualified example. The record also describes a typical salt level and labeling practice; those are terminology-record observations, not a current product specification or a substitute for checking the applicable label rules. Do not transfer its general salt figure to an individual product. [S03]
- CFIA’s current common-name guidance says that where no prescribed common name applies, the name should be the one by which the food is generally known or a non-generic name that describes it. This general rule is consistent with retaining the fish qualifier in caviar wording; it does not independently approve the two retail product names reviewed here. [S04]
- Les Poissonneries Odessa’s current Québec-facing listing is titled `Œufs de lompe` and calls `caviar de lompe` another name for the product from *Cyclopterus lumpus*. It offers red and black variants in a 50 g refrigerated product and mentions sushi, verrines, and canapés. This is retailer evidence for its listed product and Québec wording, not a standard formula or independent species test. [S05]
- CaviarHub’s current Canadian-facing listing uses `Caviar de lompe noir` / `Black Lumpfish Caviar`, says its product is wild-caught in Iceland, salted and pasteurized, and lists 50 g jars. Its catalog places lumpfish roe in a separate product category from masago, tobiko, salmon roe, bottarga, and sturgeon caviar. These are seller and SKU claims; they do not establish that all lumpfish roe has the same color, origin, salt level, or processing. [S06]
- DFO’s 2024 assessment describes the Atlantic Canadian fishery as targeting female lumpfish for roe marketed as caviar; it says roe is the landed product and the carcass generally has little commercial value. Its fisheries scope does not establish consumer recipe use, Québec retail supply, or culinary measures. [S07]

The retail evidence covers a Québec fishmonger and a Canadian online seller that advertises Montreal service. It establishes a current regional market for the species-qualified roe product, not universal availability or a Canadian harvest origin for every package. One listing says “fresh” and refrigerated; the other describes salted, pasteurized product. Treat those as SKU-level states, not as a universal `fresh roe` or `pasteurized roe` form.

## Exact ownership and picker projection

The live active-reference, form, legacy-candidate, and ledger scan found no exact normalized owner for `lumpfish`, `lompe`, *Cyclopterus lumpus*, `lumpfish roe`, `lumpfish caviar`, `œufs de lompe`, `caviar de lompe`, `fish roe`, `fish eggs`, `roe`, or bare `caviar`. No `ingredient-ref-lumpfish-roe`, `candidate-lumpfish-roe`, or lumpfish-roe form ID is allocated.

The current picker projection was checked against `IngredientSearch.kt`: normalized complete word phrases take precedence across results, then substring matching is used only if no phrase matches. With a hypothetical row displayed as `lumpfish roe / œufs de lompe`, and only the species-qualified aliases `lumpfish caviar` / `caviar de lompe`, the results would be:

| Query | Current result | Projection with the hypothetical roe row | Match behavior / boundary |
|---|---|---|---|
| `lumpfish`, `lompe` | none | lumpfish roe only | Phrase inside the proposed display; a species-only query would surface the roe product, not whole-fish flesh. |
| `lumpfish roe`, `œufs de lompe`, `caviar de lompe` | none | lumpfish roe only | Full product-specific phrase. |
| `lumpfish caviar` | none | lumpfish roe only | Species-qualified alias. |
| `roe` | Greenland halibut / flétan du Groenland | lumpfish roe only | Current result is a substring false positive from `roe` inside `Groenland`; a proposed `roe` display phrase would match first and suppress that fallback. |
| `fish roe` | none | lumpfish roe only | Substring match within `lumpfish roe`, not an exact phrase. This is still too narrow to represent a generic roe category. |
| `fish eggs` | none | none | No such alias is proposed. |
| `caviar` | finger lime / lime caviar | finger lime plus lumpfish roe | `caviar de lompe` is supported as a qualified name, but this broad query would combine unrelated products. The display names would make the distinction visible. |
| `œufs` | eight egg identities | the same eight plus lumpfish roe | Broad French egg search; the product qualifier remains visible in the result. |

The exact source-backed terms do not have an active owner, but adding this identity would make a bare `lumpfish`, `lompe`, or `roe` search return a roe product. Do not imply that a whole fish, generic roe, or generic caviar identity has thereby been resolved.

## Recipe demand

A scan of every manifest-listed recipe JSON file covered **114 recipes and 1,123 ingredient rows**. It searched all recipe JSON string values, including titles, instructions, ingredient names, original ingredient text, preparation, and notes. It found zero mentions of `lumpfish`, `lompe`, *Cyclopterus lumpus*, `lumpfish roe`, `lumpfish caviar`, `œufs de lompe`, `caviar de lompe`, `roe`, `fish roe`, `fish eggs`, `caviar`, `ikura`, `salmon roe`, `masago`, or `tobiko`. No recipe link or recipe amount is supported.

The absence of recipe demand is the reason for the hold. The existing whole-fish recipe scan and generic roe review also report no roe recipe, but this packet independently scanned the current manifest and did not reuse their snapshot as evidence.

## Measures, forms, and substitutions

The current sellers list 50 g package sizes. CaviarHub gives a product-serving guide of 50 g for one to two people; Odessa gives a different recommended-person range depending on the product weight. These are seller-specific serving suggestions, not recipe quantities or a consistent household measure. Neither source provides a cup, spoon, or count-to-mass conversion. Keep density, unit mappings, active measures, and package yields unset.

Do not create red and black as separate forms or global aliases. The sources show color variants of one marketed species product, but do not establish a universal processing or culinary distinction. Do not encode `fresh`, `salted`, `pasteurized`, or refrigerated handling as a universal form from two retail pages. TERMIUM’s typical salt statement and DFO’s fishery round-weight factor are not product-specific recipe measures or yields.

No global or contextual substitution is supported. “Caviar” in a product name does not show that lumpfish roe can replace sturgeon caviar in an equal amount or with the same culinary result. The reviewed sources do not validate substitutions among lumpfish roe, salmon roe/ikura, capelin roe/masago, flying-fish roe/tobiko, bottarga/poutargue, sea-urchin roe/uni, or whole lumpfish. Add no substitution rule, warning, or recipe-line link.

## Live snapshot and audit

Snapshot read from the shared worktree on **2026-10-12**. File hashes are SHA-256 of exact bytes. The ordered recipe digest hashes each manifest-listed recipe basename in lexical order, followed by NUL, exact recipe-file bytes, then NUL.

| Surface | Count | Bytes | SHA-256 / digest |
|---|---:|---:|---|
| Active ingredient references | 1,327 | 425,002 | `63fa2719dabf943f2e25c9228123a93c59655a83c8bddccb22d3921b0887e225` |
| Ingredient forms | 98 | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy candidates | 64 | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,635 records / 6,065 source entries / 5,081 distinct source IDs / 8 conversions | 6,025,719 | `3ee094d992a4e33f69d89516cb455fab3cf8e593960912f26bc8b1c84adab835` |
| Seed manifest | 114 recipe files | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | 753,792 | `16688e6f2ebb97eb590cb27fb711af7a025872be7a837d56846765c2e3e1ebe6` |

The candidate IDs and source prefix `WP04-LOMPE-ROE-20261012-S` were checked against the current references, forms, legacy candidates, ledger, and proposal/batch archive before use. The IDs and prefix are unallocated; the seven source IDs below are proposal-local and unique within this file. No source ID was added to the live ledger.

## Source register

Sources were accessed on 2026-10-12. Source IDs are local to this proposal.

| ID | Source | Evidence used | Limit |
|---|---|---|---|
| **WP04-LOMPE-ROE-20261012-S01** | OQLF, [GDT: lompe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198845/lompe), updated 2011 | Preferred Québec term `lompe`, English `lumpfish`, and *Cyclopterus lumpus*; edible-fish domain and commercial potential in Québec. | Names the fish, not its roe product or current retail package. |
| **WP04-LOMPE-ROE-20261012-S02** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), list modified 2023-09-18 | TSN 167612, *Cyclopterus lumpus*, `Lumpfish / Lompe`. | Naming guidance for the fish species, not the commercial roe product. |
| **WP04-LOMPE-ROE-20261012-S03** | Government of Canada Translation Bureau, [TERMIUM Plus: succédané de caviar](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=SUCCEDANE+CAVIAR), record dated 2018-03-09 | Describes fish roe prepared as caviar, lists lumpfish among source species, gives `caviar de lompe` as a qualified example, and records typical salt and labeling terminology. | Terminology record, not a current regulatory determination or a specification for all products sold under this name. |
| **WP04-LOMPE-ROE-20261012-S04** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), section “Common name” | Says the common name must be generally known or non-generic and descriptive when no prescribed standard name applies. | General labelling guidance; does not specifically determine the legal name for lumpfish roe. |
| **WP04-LOMPE-ROE-20261012-S05** | Les Poissonneries Odessa, [Œufs de lompe frais](https://odessapoissonnier.com/collections/speciaux/products/oeufs-de-lompe-noir) | Current Québec-facing product title; page gives `caviar de lompe` as another name, identifies *C. lumpus*, and lists red/black options, a 50 g format, refrigeration, and uses. | Retailer page for its SKU; seller statements do not define all products or establish a universal portion. |
| **WP04-LOMPE-ROE-20261012-S06** | CaviarHub, [Caviar de lompe noir / Œufs de lompe noir](https://caviarhub.ca/fr/products/lumpfish-roe-black-caviar) and [Montreal roe selection](https://caviarhub.ca/fr/pages/montreal-caviar-esturgeon-oeufs-de-poisson-truffes) | Current Canadian-facing product name; seller describes Icelandic wild lumpfish roe, salting/pasteurization, 50 g jars, red/black variants, and markets separate tobiko, masago, salmon roe, bottarga, and sturgeon caviar products. | Marketplace/product copy and serving guidance are seller claims, not independent composition tests or universal formulations. |
| **WP04-LOMPE-ROE-20261012-S07** | Fisheries and Oceans Canada, [Recovery Potential Assessment of Common Lumpfish](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41230097.pdf), Research Document 2024/009, February 2024 | Describes female-targeted fisheries for roe marketed as caviar and reports roe as the landed product; also explains the fishery’s factor for estimating round-weight equivalents. | Fishery and landings context, not consumer-market coverage, edible yield, household measure, or recipe evidence. |

## Proposed future boundary (not an active change)

If a bundled recipe explicitly calls for this product, consider a separate identity-only reference:

```json
{
  "id": "ingredient-ref-lumpfish-roe",
  "nameEn": "lumpfish roe",
  "nameFr": "\u0153ufs de lompe",
  "aliasesEn": ["lumpfish caviar"],
  "aliasesFr": ["caviar de lompe"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "PROTEIN"
}
```

This remains a proposal for later recipe-led review. It would represent species-qualified roe only, not whole-fish flesh, sturgeon caviar, or a generic roe category. The present action is **no catalog or ledger allocation**. No app tests or emulator checks were run; this task only adds this proposal document.

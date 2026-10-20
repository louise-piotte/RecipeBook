# WP03 Section F — blue corn kernels identity review (R162)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog JSON, ledger, generated code, plan, roadmap, recipes, or batch README was changed.
- **Open checklist:** Continue Section F identity and terminology coverage; the current list still says other unresolved grain products remain open ([active Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L519)). R161's Chulpe review covered a different Andean maize product and did not review blue corn.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for dry, food-grade blue corn sold as whole kernels: **`blue corn kernels / grains de maïs bleu`**. Keep it separate from sweet corn, generic corn kernels, Chulpe corn, popcorn, hominy, cornmeal, grits, masa harina, and prepared blue-corn foods.
- **Prospective reference and ledger ID:** `ingredient-ref-blue-corn-kernels` (unallocated).
- **Proposal-local source IDs:** `WP03-BLUE-CORN-R162-20261016-S01` through `S04`; all are unallocated and must remain local until a root integration decision.

## Candidate boundary and naming

Blue corn is a food-grain market description, not one cultivar or a formal USDA color class. New Mexico State University's food-grade corn guide says food corn can be blue, but USDA's color classes are yellow, white, and mixed; it explicitly says there is no USDA color standard for blue corn [S02]. The University of Kentucky extension page also describes blue corn as a general term spanning corn varieties with blue or blue-and-white kernels, but that page is archived and is not needed for the recommendation [archived source not allocated]. The proposed row therefore records the named food product class, not a botanical variety, color tolerance, origin, grade, organic status, or non-GMO claim.

There is current Canada-based supplier evidence for the whole-kernel product. Allzone Trading, a Toronto/GTA supplier, lists non-GMO blue corn for food manufacturing and offers a **whole-kernel** grade alongside milling and nixtamalization lots [S01]. This is a quote-based B2B listing: origin, grade, crop year, price, and shipment details are confirmed per enquiry. It establishes a current food-use supply listing, not consumer-pack availability or a specific lot. A New Mexico State University regional guide describes blue corn as being dried, stored as grain, shelled, and ground as needed, and discusses the range of blue-corn kernel types and uses [S03]. That regional process context supports the dry whole-kernel scope without implying that all blue-corn varieties share one milling or cooking behavior.

Usito, a Québec French dictionary, has the exact lexical entry **`maïs bleu`** and describes its blue-violet kernels and Latin American culinary use [S04]. The proposed French display **`grains de maïs bleu`** is a transparent product construction from that Québec term plus the whole-kernel qualifier; it is not represented as a direct package title or OQLF ruling. The app matcher finds `maïs bleu` inside the display, so no duplicate French alias is needed.

The product is limited to **dry, food-grade, whole blue-corn kernels for human food use**. Exclude planting seed, decorative multi-colour corn, popcorn, fresh sweet corn, blue-corn flour/meal, tortillas and chips, nixtamalized products, and composite products such as pinole. Do not infer that a blue-corn kernel lot is equivalent to the existing Chulpe or white canjica products because each has its own named product boundary and processing context.

## Proposed reference delta

If accepted, add only this identity row:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-blue-corn-kernels` |
| English display | `blue corn kernels` |
| Québec French display | `grains de maïs bleu` (source-informed construction from Usito's `maïs bleu`) |
| English / French aliases | `[]` / `[]` |
| Category | `GRAIN_AND_CEREAL` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

No `ingredient-form` row is proposed. The identity itself is scoped to the dry whole-kernel product; the reviewed sources do not justify state mappings to fresh, cooked, nixtamalized, toasted, popped, or milled corn.

## Existing ownership, exact-key audit, and archive review

The current package snapshot is **1,537 ingredient references, 119 forms, 61 legacy candidates, 1,882 research-ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows**. Accent-, punctuation-, and case-normalized exact-key checks found no owner for the proposed reference ID, candidate key `candidate-blue-corn-kernels`, displays `blue corn kernels` or `grains de maïs bleu`, or terms `blue corn`, `maïs bleu`, and `whole blue corn`. No exact candidate phrase, ID, URL, or proposal source ID is allocated in the active ledger or reference/form/legacy data.

The proposal archive contains blue-corn references only as adjacent evidence for flour or pinole products: the WP06 black-corn-flour boundary reviews address ground Ecuadorian maize, while the WP03 pinole hold discusses a finished roasted-corn powder. Neither review establishes an identity for whole blue-corn kernels. The archive and plan contain no focused prior review, hold, accepted row, or source ownership for this whole-kernel product. The existing Chulpe review is not a duplicate: Chulpe is a named Andean corn type with its own spelling and toasting boundary.

| Existing neighbor | Current owner and treatment |
|---|---|
| Generic corn kernels | `ingredient-ref-corn-kernels`, `corn kernels / maïs`, currently `VEGETABLE_AND_AROMATIC`; leave unchanged. |
| Dried sweet corn kernels | `ingredient-ref-dried-sweet-corn-kernels`; keep sweet-corn identity distinct. |
| Chulpe corn | `ingredient-ref-chulpe-corn`; retain the R161 names and spelling aliases. |
| White canjica maize | `ingredient-ref-canjica-white-maize`; keep its degerminated white-maize product boundary. |
| Popcorn | `ingredient-ref-popcorn`; do not treat blue corn as popping corn or alias it to popcorn. |
| Hominy and ground corn products | Preserve whole hominy, hominy grits, ordinary corn grits, cornmeal, masa harina, and whole-kernel corn flour as separate processing products. |
| Blue corn foods | Blue-corn flour/meal, tortillas, chips, cereals, pinole, and other prepared or composite foods are outside this whole-kernel identity. |

No exact-key owner was found for the four proposed source URLs or `WP03-BLUE-CORN-R162-20261016-S01`–`S04`. The IDs are proposal-local; if integrated, register each source only on `ingredient-ref-blue-corn-kernels`.

## Picker projection

The static projection follows `IngredientReferenceSearchIndex` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it accent-folds and punctuation-folds queries, prefers complete phrase matches inside display/alias terms, and uses substring matching only when no phrase result exists. Adding the proposed display with no aliases produces these reference-result counts:

| Query | Current → proposed | Result |
|---|---:|---|
| `blue corn kernels` | 0 → 1 | Proposed identity only. |
| `blue corn` | 0 → 1 | Proposed identity only. |
| `grains de maïs bleu` | 0 → 1 | Proposed identity only. |
| `maïs bleu` | 0 → 1 | Proposed identity only. |
| `corn kernels` | 2 → 3 | Adds blue corn beside generic corn kernels and dried sweet corn kernels. |
| `corn` | 28 → 29 | Adds one qualified grain result to the broad corn search. |
| `maïs` | 30 → 31 | Adds one qualified grain result to the broad French maize search. |
| `cornmeal` | 1 → 1 | Remains on cornmeal. |
| `popcorn` | 1 → 1 | Remains on popcorn. |
| `Chulpe corn` | 1 → 1 | Remains on Chulpe corn. |
| `canjica white` | 1 → 1 | Remains on white canjica maize. |
| `hominy corn` | 1 → 1 | Remains on hominy corn. |
| `corn grits` | 1 → 1 | Remains on ordinary corn grits. |
| `blue cornmeal` | 0 → 0 | No flour/meal alias or row is introduced. |

The broad `corn kernels` query gains another qualified option by design. No generic corn or maize term is added as an alias, and no existing exact grain or milling query changes owner.

## Recipe demand, measurements, forms, and substitutions

Every manifest-listed recipe JSON file and all **1,123 structured ingredient rows** were searched for blue-corn and color-qualified maize wording, including `blue corn`, `blue maize`, `blue corn kernels`, `maïs bleu`, `grains de maïs bleu`, `maíz azul`, blue-corn flour/meal, and popcorn variants. There were **zero full-file string hits, zero ingredient-row hits, and no linked candidate ID**. No recipe link or relink is proposed.

No reusable kitchen measure or density is supported. Allzone's available 25 kg / 50 kg bags and bulk bags are commercial shipping presentations, not recipe quantities [S01]. NMSU's harvest/storage moisture figures and agricultural yield/quality data are not household measures and are not transferred [S02–S03]. No source reviewed a labeled consumer serving for a matching whole blue-corn-kernel SKU. Keep `defaultDensity: null`, `unitMappings: []`, `forms: []`, and measurement observations empty. Do not create a measure, conversion, cooking yield, or package-yield record.

No substitution source establishes a ratio or culinary context for replacing blue corn kernels with generic corn, Chulpe, dried sweet corn, popcorn, hominy, or a flour/meal product. Similar use in tortillas, snacks, or cornmeal does not establish interchangeability. Add no global or contextual substitution rule or recipe-line substitution link.

## Proposed research-ledger record

If the identity is integrated, add one `ingredient_reference` record with `recordId: ingredient-ref-blue-corn-kernels`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Add the four source records below, empty measurement observations and substitution findings, and one accepted decision naming this scoped identity. Do not create a separate candidate record.

## Source register

The IDs below are proposal-local and unallocated. Pages were checked on 2026-10-16; publication dates are retained where available.

| Local source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-BLUE-CORN-R162-20261016-S01` | Allzone Trading, [Non-GMO Blue Corn](https://allzonetrading.ca/supply/non-gmo-blue-corn), current Toronto/GTA supplier listing. | Lists food-use blue corn in `Grains & Cereals`, including a whole-kernel grade and separate masa/nixtamal and milling lots. The page is quote-based; origin, grade, crop year, package, and availability require confirmation. It supports a current Canadian supply listing, not consumer retail or a fixed lot specification. |
| `WP03-BLUE-CORN-R162-20261016-S02` | New Mexico State University Cooperative Extension, [Food-grade Corn for New Mexico, Guide H-260](https://pubs.nmsu.edu/_h/H260.pdf), July 2021, pp. 1–2. | States food-grade corn can be blue, gives the USDA yellow/white/mixed classes, and says no USDA color standard exists for blue corn. Describes food-use characteristics and specialty products. Supports a market color class, not one cultivar or a universal kernel specification. |
| `WP03-BLUE-CORN-R162-20261016-S03` | New Mexico State University Cooperative Extension, [Blue Corn Production and Marketing in New Mexico, Guide H-226](https://pubs.nmsu.edu/_h/H226/), revised March 2020, “Kernel Characteristics,” “Harvesting,” and “Blue Corn Products.” | Describes blue corn as dried, stored as grain, shelled, and ground as needed; notes kernel characteristics vary by variety and lists regional product uses. The source is specifically about New Mexico and does not establish one cultivar, universal process, household measure, or general culinary substitution. |
| `WP03-BLUE-CORN-R162-20261016-S04` | Usito, [maïs, subentry `maïs bleu`](https://usito.usherbrooke.ca/d%C3%A9finitions/ma%C3%AFs/lexies?v=ma%C3%AFs+d%E2%80%99ensilage), content updated 2026-06-03. | Defines `maïs bleu` as an older variety with blue-violet kernels used for a similarly colored flour in Latin American cooking. Supports the Québec French base term and color-qualified culinary identity; it does not establish the full constructed display `grains de maïs bleu` or a current Québec package title. |

## Review disposition

Recommend one identity-only whole-kernel reference with no aliases or numeric behavior. The evidence supports a current food-grade whole-kernel supply product, a regional dry-grain product boundary, and the Québec French base term `maïs bleu`. Keep the proposed French display identified as source-informed wording, and retain all generic, species/variety-qualified, prepared, milled, and popped corn identities unchanged.

# WP04 Section P — Finnan haddie / gades fumés naming and picker-boundary review (R164)

- **Reviewed / sources accessed:** 2026-10-16.
- **Candidate:** `Finnan haddie`, Québec French `gades fumés`, and the potentially different Canadian smoked-haddock product usage.
- **Recommendation:** **Hold** a Finnan-haddie / gades-fumés reference, form, alias, and dedicated ledger candidate. Keep the R149 `smoked haddock / aiglefin fumé` identity unchanged.
- **Scope:** The product-name and naming-boundary question only. This review does not reopen the accepted smoked-haddock identity, general smoked-fish form policy, canned `chicken haddie`, herring kippers, or any R162/R163 fish holds.
- **Status:** Proposal-only. No shared catalog JSON, research ledger, legacy identities, recipes, plan, roadmap, batch README, or generated source changed. No application or Android tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-FINNAN-HADDIE-R164-20261016-S01` through `S04`, plus audit ID `WP04-SECTIONP-FINNAN-HADDIE-R164-20261016-R01`. They are not shared-ledger allocations. Reused shared source IDs are identified below.

## Why this is a distinct open gap

The active [Section P preserved-fish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5860) remains open. R149 integrated the distinct identity `smoked haddock / aiglefin fumé`, while expressly leaving `Finnan haddie / gades fumés` outside that row because OQLF's entry describes a broader or canned product boundary. The accepted [R149 proposal](wp04-section-p-smoked-haddock-product-identity-review-r149-20261015.md) and [R149 integration README](../batches/wp02-wp03-wp04-r149-gap-review-integration-20261015/README.md) do not decide whether the English and French labels identify one stable product that merits its own active picker choice.

The archive contains earlier mentions of Finnan haddie in the finfish identity coordinator and the R149 scope note, but no standalone product-name or picker review. This review is limited to that unadjudicated name boundary. It does not revisit the blackfin tuna or Atlantic argentine evidence or decisions from R162 and R163.

## Naming and current market evidence

OQLF's GDT entry, last updated in 1983, maps English **Finnan haddie** to preferred Québec French **gades fumés**. It defines the French term as smoked haddock, cod, cusk, hake, pollock, or any mixture of those fish. Its note directs writers to a species-specific smoked-fish name when the product contains one species; it says `Finnan haddie` is a canned product name and warns against applying it to the split, opened, smoked, lightly salted haddock preparation described there. This is a strong Québec terminology boundary, but its age and lack of an identified current package mean it does not establish how every current Canadian seller uses the English phrase. [Reused OQLF source]

Current Canadian sellers and a federal culinary resource use the English term differently:

- Parks Canada's heritage recipe page calls **Finnan Haddie** a smoked-haddock dish and gives **1 lb / 450 g smoked haddock fillet** as the fish ingredient. The English and French pages both describe a dish, and the French version was modified 2024-04-23. This supports Canadian culinary use and an amount for that one recipe; it does not make the dish name a standardized Québec product label or define a general ingredient unit. [S01]
- Toronto smokehouse The Smoke Bloke titles a current frozen product **Cold Smoked Haddock (Finnan Haddie)** and says “Cold Smoked Haddock, aka Finnan Haddie.” It also says the item is intended for use as an ingredient and is too salty to eat as sold. This is clear current seller usage of the term for a single smoked-haddock item, but is one Ontario seller's description rather than a naming authority, product specification, or Québec French label. [S02]
- Vaughan seafood seller Seafood Depot lists **Smoked Finnan Haddie**, calls it frozen and smoked in Canada, and contrasts its taste with smoked haddock. The page prints `Melanogammus aeglefinus`, an apparent misspelling of the haddock binomial; that text is not reliable species verification. The page does not show a package label, exact composition, net quantity, or a canned state. It provides evidence of a seller's distinct product wording, not a general identity rule. [S03]
- Canadian distributor Seacore's current smoked-seafood list has separate entries for **Finnan Haddie Smoked** and **Haddock Smoked**. The list contains no product detail resolving whether they differ by fish cut, salting, smoke process, brand, or SKU. [S04]

CFIA's current fish-name guidance ties fish common names to species and says market names must not create a false or misleading impression; it also allows that group names covering multiple species may be considered. CFIA's fish-product labelling guidance treats descriptors such as smoked, split, filleted, minced, flaked, and packing medium as product information that may need to appear separately. Those policies provide relevant naming context, but they do not establish `Finnan haddie` or `gades fumés` as a catalog product class or resolve the difference between the OQLF definition and seller wording. Existing shared CFIA source IDs are reused. [Reused CFIA sources]

The evidence therefore establishes a real English market and culinary term, but not one stable identity suitable for this shared Québec-facing picker. The French term is explicitly plural and broader than a single species in OQLF's definition, while current sellers use `Finnan haddie` for a single smoked haddock product. A bilingual row pairing those terms would imply equivalence between scopes the evidence does not reconcile. Adding only an English row would leave the Quebec French product name unresolved. Adding `Finnan haddie` as an alias of smoked haddock would erase the documented mixed/canned boundary and overgeneralize individual seller usage.

## Local ownership and source-ID checks

The read-only snapshot contains **1,539 active ingredient references**, **119 forms**, **61 legacy-import candidates**, and **1,884 research-ledger records** with **8,023 source entries / 6,864 distinct source IDs**.

Exact normalized-key checks covered bilingual active reference names and aliases, form labels and match terms, legacy candidate IDs/names/aliases, and ledger record IDs. No exact owner was found for `Finnan haddie`, `Finnan haddies`, `Finnan`, `Finnan haddock`, `Smoked Finnan Haddie`, `gades fumés`, `gade fumé`, `miettes de gades`, `chicken haddie`, `Finnan Haddie en boîte`, `canned Finnan haddie`, or the candidate ID `ingredient-ref-finnan-haddie`. There is no dedicated Finnan-haddie or gades-fumés form, legacy candidate, or ledger record. The only relevant ledger mention is the existing verified `ingredient-ref-smoked-haddock` record's R149 source and decision note, which records the name as excluded scope; it does not allocate the candidate.

Neighboring active ownership is explicit:

| Active identity | Current display / aliases | Relationship to this review |
|---|---|---|
| `ingredient-ref-haddock` | `haddock / églefin`; French alias `aiglefin` | Species identity. No forms, density, or unit mappings. |
| `ingredient-ref-smoked-haddock` | `smoked haddock / aiglefin fumé`; no aliases | Accepted R149 product identity. No forms, density, or unit mappings. |

The proposal-local R164 source-ID prefix was absent from the live ledger and proposal/batch archive before drafting. The OQLF URL is already owned by `WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S01`; reuse that ID. The CFIA common-name guidance URL is already represented by `WP04-FINFISH-ID-20261009-S06`, and its fish-product labelling page by `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07`; reuse those IDs rather than adding duplicates. Parks Canada's bilingual recipe URLs and the three current seller URLs below had no exact URL owner in the ledger or proposal/batch archive. Their R164 source IDs remain local to this proposal and are not allocated.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, and punctuation; prefer a complete word phrase across reference names and aliases; then fall back to substring matching. Attached form search terms are also included, though neither active haddock identity has a form. The second result column is a **projection only**, using a hypothetical alias-free display `Finnan haddie / gades fumés`; it is not proposed data.

| Query | Current results | With hypothetical `Finnan haddie / gades fumés` | Consequence |
|---|---|---|---|
| `Finnan haddie`; `Finnan` | None | Hypothetical row only | The unqualified English term appears fully resolved despite conflicting source scopes. |
| `gades fumés`; `gades` | None | Hypothetical row only | A family/mixed-fish French term appears to identify one ordinary ingredient choice. |
| `smoked haddock`; `aiglefin fumé` | `ingredient-ref-smoked-haddock` | Same one result | The accepted species-specific product stays selected; do not add either as an alias to a Finnan row. |
| `haddock`; `aiglefin` | `ingredient-ref-haddock`; `ingredient-ref-smoked-haddock` | Same two results | The hypothetical bilingual display adds no information about whether a requested item is plain or smoked haddock. |
| `fumé` | `ingredient-ref-smoked-haddock`, `ingredient-ref-smoked-paprika`, `ingredient-ref-smoked-salt`, `ingredient-ref-smoked-tofu` | Same four plus the hypothetical row | The broad preparation query gains a product with no settled identity boundary. |
| `Finnan Haddie Smoked` | None | None | The catalog's phrase-first picker does not match a longer vendor title from a shorter display; an exact product alias would need its own scope review. |
| `chicken haddie`; `miettes de gades` | None | None | The hypothetical row does not resolve the adjacent canned product name. |

## Bundled recipe demand

The scan followed all **114 recipe paths** in the live manifest and parsed **1,123 ingredient rows** across **753,928 bytes** of recipe JSON. It checked every ingredient row and every string value in each complete parsed recipe, including bilingual names, source fields, directions, notes, and metadata. Normalized search terms included `Finnan haddie`, `Finnan`, `Finnan haddock`, `Finnan Haddie Smoked`, `Smoked Finnan Haddie`, `gades fumés`, `gade fumé`, `miettes de gades`, `chicken haddie`, `smoked haddock`, `aiglefin fumé`, `haddock fumé`, `haddock`, `églefin`, `aiglefin`, and the spelled/typo binomials. **There were zero full-file matches and zero ingredient-row matches.** No bundled recipe names Finnan haddie, requests smoked haddock, or chooses between canned/mixed and single-species smoked products. The Parks Canada recipe is external culinary context, not a bundled recipe link or user-demand observation.

## Forms, measurements, and substitutions

- **Forms:** Add none. OQLF distinguishes canned mixed/single-gadid wording from a split smoked haddock product, while current sellers call frozen, cold-smoked, and differently worded items Finnan haddie. These sources do not support a universal canned, frozen, fillet, salted, cold-smoked, cooked, or ready-to-eat form.
- **Measurements:** Add none. The current haddock and smoked-haddock references have `defaultDensity: null`, `unitMappings: []`, and no attached forms. The smoked-haddock ledger record has no measurement observations and records that no supported reusable value was found. Parks Canada's 1 lb / 450 g is one recipe's amount, with no serving count or species/product boundary that would make it a portion or conversion. The seller pages provide no reusable count-to-mass or package rule.
- **Substitutions:** Add no rule or warning. Current evidence does not resolve whether Finnan haddie is the same item as smoked haddock, a different smoked treatment, or a broader canned/mixed-fish product. The external Parks Canada recipe uses smoked haddock as one ingredient but does not test or quantify an alternative. Similar taste or culinary context cannot establish a global or contextual substitution.

## Recommendation and reopening conditions

**Hold `ingredient-ref-finnan-haddie`, `ingredient-ref-gades-fumes`, and any `candidate-finnan-haddie` record outside active references and the research ledger; do not reserve those IDs.** Keep `ingredient-ref-haddock` and the accepted `ingredient-ref-smoked-haddock` unchanged. Do not add an alias, form, measurement observation, conversion, yield, recipe link, or substitution.

Reopen if a current Québec-facing product source supplies its actual English/French package names and identifies whether it is a single species or a mixed gadid product, plus the preparation and storage state; or if a bundled recipe explicitly requests Finnan haddie and gives enough context to resolve that boundary. Then decide whether the requested food belongs under the existing smoked-haddock identity, merits a distinct product identity, or should remain a recipe dish name only.

## Sources

Online sources below were accessed on 2026-10-16 unless otherwise noted. Proposal-local IDs are provenance labels only. Reused source IDs remain attached to their existing ledger records.

| Source ID | Source | Support and limits |
|---|---|---|
| Reuse `WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S01` | OQLF, GDT, [gades fumés](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488227/gades-fumes), updated 1983. | Québec French term, English equivalent `Finnan haddie`, multiple-species or mixed definition, and the note distinguishing canned/mixed product wording from species-specific smoked fish. Terminology evidence; not a current package specification. |
| Reuse `WP04-FINFISH-ID-20261009-S06` | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names); [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Current official species-naming framework and Fish List context. Does not determine a preparation or validate the Finnan haddie market term. |
| Reuse `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07` | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Current fish-product labelling guidance treats form/style, packing medium, and condition descriptors such as `smoked` separately. It does not define Finnan haddie. |
| **WP04-SECTIONP-FINNAN-HADDIE-R164-20261016-S01** | Parks Canada, [Granny Canning’s Finnan Haddie](https://parks.canada.ca/culture/gourmand-gourmet/recette-recipe20); [French version](https://parcs.canada.ca/culture/gourmand-gourmet/recette-recipe20), modified 2024-04-23. | Calls Finnan haddie a smoked-haddock dish and gives one recipe using 1 lb / 450 g smoked haddock fillet. Recipe-level context only; not product naming authority, a universal serving, or a bundled recipe. |
| **WP04-SECTIONP-FINNAN-HADDIE-R164-20261016-S02** | The Smoke Bloke, Toronto, [Cold Smoked Haddock (Finnan Haddie)](https://www.thesmokebloke.ca/product-page/cold-smoked-haddock-finnan-haddie-ocean-wise-recommended). | Current frozen single-seller listing uses the two terms as equivalents; says it is intended as an ingredient and too salty for direct consumption. Seller usage, not a Québec naming rule or universal product specification. |
| **WP04-SECTIONP-FINNAN-HADDIE-R164-20261016-S03** | Seafood Depot, Vaughan, [Smoked Finnan Haddie](https://www.seafooddepot.ca/product-finnanhaddiesmoked2). | Current seller page presents a frozen Canadian-smoked item and a misspelled haddock binomial; product text contrasts it with smoked haddock. No label image, exact composition, package amount, or reliable taxonomic crosswalk. |
| **WP04-SECTIONP-FINNAN-HADDIE-R164-20261016-S04** | Seacore Seafood, [Smoked Fish and Smoked Seafood product list](https://www.seacoreseafood.com/productgroup/smoked-fish). | Current Canadian distributor list names Finnan Haddie Smoked and Haddock Smoked separately; it gives no product details to explain the distinction. |
| **WP04-SECTIONP-FINNAN-HADDIE-R164-20261016-R01** | [Active Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5860), R149 proposal/integration, active references and forms, legacy identities, research ledger, manifest-listed recipes, archive search, and picker code. | Read-only ownership, URL/source-ID, picker, recipe, forms/measurements/substitution, and archive audit at the snapshot counts stated above. |

## Final disposition

**Hold.** The local source gap is naming scope, not evidence that no such food exists: Québec's official term is defined as a canned/mixed gadid category, while current Canadian sellers use Finnan haddie for individual smoked-haddock products. No current Québec product label or bundled recipe resolves the conflict. Keep the R149 `smoked haddock / aiglefin fumé` choice and its evidence intact; allocate no Finnan-haddie or gades-fumés identity or ledger record.

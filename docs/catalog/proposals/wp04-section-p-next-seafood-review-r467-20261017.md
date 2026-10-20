# WP04 Section P R467 — shrimp-cracker identity and picker-boundary review

- **Review and online source-access date:** 2026-10-17.
- **Checklist:** [WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish”](../../RecipeBook-global-ingredient-catalog-plan.txt#L6792). The Section P parent remains open.
- **Candidate:** Marketed shrimp-cracker snacks, provisionally `shrimp crackers / craquelins de crevettes`.
- **Recommendation:** **Hold active allocation.** Canadian and Québec product listings support these product names, but adding the English display term would make broad `crackers` return only shrimp crackers in the current phrase-first picker. Other observed market phrases have their own broad-query and product-state costs. The 114-recipe bundle has no exact demand to justify that behavior now.
- **Scope boundary:** This is a distinct snack product, not a revisit of R459 generic breaded shrimp, R438 butterfly shrimp, R441 coconut butterfly shrimp, R444 popcorn shrimp, R448 shrimp tempura, or the recent crab and lobster product reviews. It does not allocate generic shrimp/prawn, a species, `cracker crumbs`, or a prepared seafood substitution.
- **Integration status:** Reviewed and integrated on 2026-10-17 as a documentation-only hold. The Section P checklist, roadmap, workflow, and [integration README](../batches/wp04-section-p-shrimp-crackers-hold-integration-r467-20261017/README.md) record the decision. No shared catalog, ledger, recipe, generated, or application data changed; no tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-S01` through `S07`; repository audit label `WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-R01`. All remain unallocated while the recommendation is a hold.

## Why this is a distinct open Section P gap

Recent Section P reviews address seafood proteins and meal preparations. Shrimp crackers are a separate snack product made with starch or flour and shrimp ingredients. Retail wording also varies between *crackers* and *chips*, and current product records distinguish fried or prefried products from an uncooked product. This review considers that product family without proposing that all those labels denote one interchangeable ingredient state.

The current Québec Metro listing uses `Craquelins de crevettes`; Poissonnerie Les Trois Pêcheurs uses `Chips aux crevettes`. Manufacturer and Canadian retailer listings use `Shrimp Crackers`, `Shrimp Chips`, or `Prawn Crackers`. These are useful observed phrases, but the evidence does not show that they are safe global aliases across all product states. [S01–S06]

This review is separate from the accepted R459 **breaded shrimp / crevettes panées** identity, which is a shrimp protein preparation, not a cracker snack. It also leaves the other recent product-specific shrimp identities, held tempura preparation, crab cake, crab claws, crab legs, and lobster claws unchanged. [R459; R438; R441; R444; R448; R432; R435; R450; R456]

The recent salmon-jerky boundary remains closed for this review. R169 explicitly excluded salmon jerky from its smoked-salmon decision; R463 later held `salmon jerky / jerky de saumon` because an active salmon-only row would make bare `jerky` return one species while R22's beef-jerky hold leaves that broad query unresolved. The current bundle has no exact salmon-jerky wording or query-specific demand. R467 does not reopen those decisions. [R169; R22; R463]

## Product evidence and wording limits

Metro’s Québec grocery listing shows the Nong Shim item under the French title **Craquelins de crevettes**, with a 75 g product record. Its selected item currently reports out of stock; the title and package observation do not establish local availability. The same retailer’s English page names **Shrimp Crackers**. A Québec fishmonger separately lists **Chips aux crevettes**, but the page says both “1 sac (45g)” and “sac de 200g”; do not use either number as a reliable package specification. [S01–S02]

Nongshim USA, the manufacturer’s official page, categorizes its **Shrimp Cracker** as a snack and lists wheat flour, starches, oils, shrimp, seasonings, and other ingredients for that product. Its exact recipe and formula are manufacturer- and SKU-specific. The Thai government’s Thai SELECT product page lists Manora fried shrimp chips in several packs and also an uncooked shrimp-chip product. A Toronto retailer’s current listing calls its Flower product **Un-fried Shrimp Crackers** and gives a 250 g package. These sources show that a ready-to-eat or prefried snack and a product sold uncooked both exist; they do not establish a universal preparation or conversion between them. [S03–S05]

A Canadian retailer page also titles a Manora listing **Uncooked Shrimp Chips (Prawn Crackers)**. Its brief description contains no preparation instructions or useful ingredient specification, and its displayed price information is anomalous. Use this source for the observed wording only; do not treat it as evidence that `prawn crackers` is interchangeable with every shrimp-cracker product or that a 500 g listing is a reusable measure. [S06]

The Canadian Food Inspection Agency recorded a 2025 recall for a specific Ny.Siok **Shrimp Crackers** product distributed in British Columbia. The notice is official evidence of the exact Canadian product name and its historical category as a snack, but it documents a recalled SKU and is not evidence of current availability. [S07]

Together, these sources support a product family worth tracking, with `shrimp crackers / craquelins de crevettes` as a plausible English/French display pair if the picker boundary is resolved. They do not support a universal recipe, seasoning, shrimp species, starch, package, uncooked/fried state, or storage rule. `Chips aux crevettes`, `shrimp chips`, and `prawn crackers` are source-observed product phrases, not aliases proposed for the active catalog.

## Exact ownership and source-allocation audit

The read-only audit covered current ingredient references and forms, legacy candidates, ledger records/source IDs/URLs and unit conversions, package yields, both substitution-rule files, recent Section P proposals and batches, picker behavior, and all manifest-listed recipes.

| Surface | Current state at audit | R467 disposition |
|---|---|---|
| Active references and forms | **1,749 references** and **141 forms**. No exact name or alias owns `shrimp cracker(s)`, `prawn cracker(s)`, `shrimp chip(s)`, `craquelin(s) de crevettes`, or `chips aux crevettes`; no form label or form search term owns them. The proposed `ingredient-ref-shrimp-crackers` ID is unused. | No reference, alias, form, or category is allocated. Do not add the candidate as a form under breaded shrimp or cracker crumbs. |
| Nearby owners | `ingredient-ref-breaded-shrimp` and `ingredient-ref-breaded-butterfly-shrimp` remain separate from the cracker snack. `ingredient-ref-cracker-crumbs` owns `cracker crumbs / chapelure de craquelins`; `ingredient-ref-graham-cracker-crumbs` owns Graham-cracker crumbs. No active row owns plain plural `crackers`. | Preserve each existing identity and alias set. Do not map a shrimp snack to either crumb ingredient. |
| Legacy identities | **56** legacy candidates; none owns the proposed product terms or `ingredient-ref-shrimp-crackers`. | Add no legacy candidate or mapping. |
| Research ledger and source allocation | **2,108 records**, **9,601 source entries**, **8,148 distinct source IDs**, and **6,861 distinct source URLs**. No exact product phrase, candidate record, or proposed reference ID is present. The proposed R467 source-ID prefix is unused in the ledger and proposal/batch archive. The S01–S07 URLs have no exact owner in the catalog research files. | Keep all new source IDs local to this proposal; add no record or source URL to the shared ledger. The counts are a repository snapshot and may change as other reviews integrate. |
| Numeric and substitution data | The ledger has **8 unit conversions**. The live package-yield file has **1 unrelated canned-black-bean yield**. Global and contextual substitution files have **0 rules** each. No shrimp-cracker density, mapping, conversion, yield, or substitution is recorded. | Add no measure, density, mapping, conversion, package yield, substitution observation, or rule. |

Exact-key checks also found no active `prawn` identity. R95’s spot-prawn boundary review explains why broad `prawn` should remain unallocated; adding `prawn crackers` as an alias would cause that query to return this single snack identity. This proposal keeps that broader species/name boundary untouched. [R95]

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word-phrase matching is tried first across reference names, aliases, and attached form terms; substring matching is only used when no phrase match exists. The hypothetical row below uses only `shrimp crackers / craquelins de crevettes` as display terms, with no aliases or forms. It is a projection, not an active-row recommendation.

| Query | Current result | With hypothetical display pair | Assessment |
|---|---|---|---|
| `shrimp crackers`; `craquelins de crevettes` | 0 | 1 shrimp-cracker result | Exact product wording would become searchable. |
| `crackers` | 0 | 1 shrimp-cracker result | **Blocking boundary:** a broad pantry query would resolve only to this seafood snack. |
| `cracker` | 2: cracker crumbs and Graham-cracker crumbs | 2, unchanged | The exact singular phrase results win before substring fallback sees the plural `crackers`. The picker does not treat singular and plural as the same word. |
| `craquelins` | 1: cracker crumbs | 2 | The French product term would join the existing crumb result. |
| `shrimp`; `crevettes` | 9; 13 | 10; 14 | Both broad searches remain multi-result but gain one snack. |
| `prawn` | 0 | 0 with no alias | Adding `prawn crackers` would turn this unresolved broad query into a one-item result. Do not add the alias. |
| `chips` | 7, all currently chocolate or baking-chip references | 7 with no alias | Adding `shrimp chips` or `chips aux crevettes` would make an unrelated seafood snack appear in that existing broad result set. Do not add those aliases. |

The exact product term is supported, but omitting broad aliases cannot avoid the `crackers` singleton because `crackers` is in the proposed English display name itself. An active row would therefore reduce the usefulness of an unresolved general pantry query without any recipe-driven need.

## Manifest recipe-demand scan

The audit parsed all **114 recipe files named in `manifest.v1.json`** and all **1,123 structured ingredient rows**. It searched every recipe JSON document and each ingredient row for `shrimp cracker(s)`, `prawn cracker(s)`, `shrimp chip(s)`, `craquelin(s) de crevettes`, and `chips aux crevettes`. It found **zero matching recipe files and zero matching ingredient rows**. No ingredient link, recipe amount, preparation request, or substitution is derived from the bundle.

The corpus contains generic “cooked meat or seafood” wording in Recipe 093 (fried rice) and generic “seafood” topping wording in Recipe 097 (Alfredo sauce); neither selects a shrimp cracker. Recipes 006, 026, and 081 use Graham-cracker crumbs, not shrimp crackers. These broad mentions do not create query-specific demand for this candidate.

## Forms, measures, conversions, yields, and substitutions

- **Preparation:** Product pages distinguish snack-ready/prefried shrimp crackers from an uncooked or un-fried product. They do not establish a shared cooking instruction, ready-to-eat state, or a defined conversion between those products. Do not add an `uncooked`, `fried`, `prefried`, or `ready-to-eat` form on an unallocated identity.
- **Measures and yields:** Observed packages are SKU-specific. Metro lists a 75 g Nong Shim item; the Toronto retailer lists one 250 g un-fried Flower item; the Québec fishmonger’s page conflicts between 45 g and 200 g; the Canadian Manora page’s 500 g title lacks corroborating label detail. These amounts do not establish a serving, count, household measure, density, general package size, or reusable yield. No package-yield record is proposed.
- **Conversions:** No source reports a density, volume-to-mass value, count-to-mass factor, or validated cooked-to-uncooked yield for this product family. Do not map `cup`, `piece`, or a package to grams or to another ingredient.
- **Substitutions:** No bundled recipe uses the candidate, and the product sources do not establish recipe-role equivalence. Do not substitute it for breaded shrimp, shrimp balls, plain crackers, cracker crumbs, or vice versa. Add no global same-ingredient conversion or contextual substitution rule.
- **Aliases:** Keep the source-specific names `shrimp chips`, `chips aux crevettes`, `prawn crackers`, and `uncooked shrimp chips` in this proposal only. Their observed use is not enough to merge different product states or to add aliases that would divert the broad picker queries `chips` or `prawn`.

## Source register

Sources were accessed online on 2026-10-17. Retail pages document their own listings and may change or show out-of-stock items. Manufacturer and government pages support the specific products or categories they describe, not a universal recipe or ingredient measure. New S01–S07 IDs remain proposal-local; no URL or source record has been allocated in the shared ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-S01** | Metro Québec, [Craquelins de crevettes, Bowl Noodle Soup](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/bretzels-batonnets-au-fromage-et-amuse-gueules/craquelins-de-crevettes/p/031146200122), product 031146200122. | Québec retailer listing supports the French product wording and a product-specific 75 g Nong Shim pack; the retrieved page says the item is out of stock. Use no availability, household-measure, or general package-size claim. |
| **WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-S02** | Poissonnerie Les Trois Pêcheurs, [Chips aux crevettes](https://www.troispecheurs.fish/produit/chips-aux-crevettes/). | Québec fishmonger page supports the exact title `Chips aux crevettes`. It contradicts itself on bag size (45 g versus 200 g); no weight or measure claim is made. |
| **WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-S03** | Nongshim USA, [Shrimp Cracker](https://nongshimusa.com/product-detail?pid=53). | Official manufacturer page categorizes the product as a snack, gives its product-specific ingredient list, and lists related flavored products. It is a US product page and not a Canadian package standard. |
| **WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-S04** | Department of International Trade Promotion, Thailand, Thai SELECT, [Manora product listing](https://thaiselect.com/products/detail/1827). | Government product page lists fried shrimp-chip packs and a separate “Uncooked Shrimp Chips (Light)” product. It demonstrates product-line variation, not cooking directions, shared yield, or Canadian availability. |
| **WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-S05** | Holland Store, Toronto, [Flower Kerupuk Small](https://hollandstore.ca/products/flower-kerupuk-small). | Current Toronto retailer page calls this product `Un-fried Shrimp Crackers`, gives its 250 g package and product-specific ingredients, and reports pickup availability. Those details apply only to this item. |
| **WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-S06** | NavaFresh, Canada, [Manora Uncooked Shrimp Chips (Prawn Crackers)](https://navafresh.ca/products/manora-uncooked-shrimp-chipsprawn-crackers777-500g). | Canadian listing title contains both `Uncooked Shrimp Chips` and `(Prawn Crackers)`. Its sparse description and anomalous displayed price are not used for package, ingredient, preparation, or availability claims. |
| **WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-S07** | Canadian Food Inspection Agency, [Various brands of crackers recalled due to undeclared egg](https://recalls-rappels.canada.ca/en/alert-recall/various-brands-crackers-recalled-due-undeclared-egg), issued 2025-08-01. | Official historical notice names Ny.Siok Shrimp Crackers, a 500 g SKU distributed in British Columbia, and places the recall under snack products. It concerns recalled product only and is not current availability evidence. |
| **WP04-SECTIONP-SHRIMP-CRACKERS-R467-20261017-R01** | Read-only repository audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6792), active references/forms, legacy candidates, ledger and source allocation, package-yield and substitution files, Section P proposals/batches, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and manifest-listed recipes. | Records exact ownership and ID/URL collision checks, the hypothetical picker projection, current catalog and ledger counts, and the scan of all 114 manifest files / 1,123 ingredient rows. Audit label only; no shared ledger record. |

## Final disposition

**Hold active allocation of shrimp crackers.** The product family has clear Canadian and Québec market evidence, but a `shrimp crackers / craquelins de crevettes` display pair would make broad `crackers` resolve to only one seafood snack. `prawn crackers` would make the currently unresolved broad `prawn` query a singleton; `shrimp chips` and `chips aux crevettes` would add a seafood snack to the existing broad `chips` results. The ready-to-eat/prefried and uncooked products also do not support a universal form conversion or yield, and the bundle has no exact query-specific demand.

Keep all R467 IDs proposal-local. Add no active reference, alias, form, measure, recipe link, conversion, package yield, or substitution. Revisit if the picker can preserve the broader pantry terms or an exact recipe request establishes which product state is needed. The separate R463 salmon-jerky hold remains unchanged: R169 excluded salmon jerky, R22 leaves bare `jerky` unresolved through the beef-jerky hold, and the recipe bundle has no exact salmon-jerky demand. Section P remains open.

## Internal records referenced

- [R169 smoked-salmon boundary review](wp04-section-p-smoked-salmon-product-boundary-review-r169-20261016.md)
- [R22 jerky picker-boundary review](wp04-section-o-jerky-gap-picker-boundary-review-20261013-round22.md)
- [R95 spot-prawn picker-boundary review](wp04-section-p-r95-spot-prawn-picker-boundary-review-20261014.md)
- [R463 salmon-jerky review](wp04-section-p-next-seafood-review-r463-20261017.md) and [integration record](../batches/wp04-section-p-salmon-jerky-hold-integration-r463-20261017/README.md)
- [R459 breaded-shrimp review](wp04-section-p-next-seafood-review-r459-20261017.md)

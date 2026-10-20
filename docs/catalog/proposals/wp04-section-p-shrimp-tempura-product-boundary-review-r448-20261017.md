# WP04 Section P R448 — shrimp tempura product-boundary review

- **Review and source-access date:** 2026-10-17.
- **Checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6742)). The parent remains open.
- **Candidate:** Commercial shrimp tempura, named in English as `shrimp tempura` or `tempura shrimp`, and in French as `tempura de crevettes` or `crevettes tempura`.
- **Recommendation:** **Hold this identity outside active references and the research ledger.** Current Canadian and Québec-facing sources establish a distinct prepared product, but adding any directly supported name would make the broad one-word `tempura` query select shrimp tempura alone. OQLF defines tempura across fish, seafood, and vegetables. The picker cannot preserve that broad meaning while also exposing this one seafood product. This is the same search boundary accepted for frozen tempura fish in R224.
- **Status:** Root-reviewed boundary hold; the decision is recorded in the [R448 integration README](../batches/wp04-section-p-shrimp-tempura-hold-integration-r448-20261017/README.md). No active reference or ledger entry was created. No tests were needed for this documentation-only hold.
- **Proposal-local source IDs:** `WP04-SECTIONP-SHRIMP-TEMPURA-R448-20261017-S01` through `S05`, plus audit ID `R01`. These are not ledger allocations. Reused sources are identified below.

## Candidate and scope

This review covers the separately named prepared product of shrimp in tempura batter. It does not reopen generic raw/cooked/frozen shrimp, shrimp species, the accepted breaded butterfly, coconut butterfly, or popcorn shrimp identities, shrimp balls, dried/canned shrimp, tempura fish, vegetable tempura, or home use of tempura batter.

Current Canadian sources use several closely related product names, including `Shrimp Tempura`, `Tempura Shrimp`, `Tempura de crevettes`, and `Crevettes tempura`. Québec-facing seller and grocery pages show the product as a retail seafood item. The sources support a distinct market product boundary, but do not establish a single formula, size, shrimp species, frozen or cooked state, tail condition, or cooking method that applies to all examples. [S01–S05]

If a future review reopens the candidate, a plausible bilingual display pair would be `shrimp tempura / tempura de crevettes`; other directly attested terms include `tempura shrimp` and `crevettes tempura`. These terms are listed here for review only. **This proposal allocates no reference, candidate ID, or alias.** Do not add bare `tempura`, bare `shrimp` / `crevette(s)`, `battered shrimp`, `breaded shrimp`, species names, or brand names as aliases.

## Ownership, overlap, and current snapshot

The audit checked the live reference and form names, aliases and match terms; legacy candidates; all research-ledger record and source text; package yields; global and contextual substitution rules; recent Section P proposals and batches; the plan; the live picker implementation; and every manifest-listed recipe.

| Surface | Current owner or audit result | R448 disposition |
|---|---|---|
| Section P checklist | The parent at plan line 6701 remains open. | Review one prepared-shrimp boundary only; leave the parent open. |
| Current catalog | 1,739 active references and 141 forms. No reference name, alias, form label, or form match term owns `shrimp tempura`, `tempura shrimp`, `ebi tempura`, `tempura de crevettes`, `crevettes tempura`, or `crevette tempura`. | No row or form is proposed. |
| Adjacent shrimp owners | Separate active identities exist for breaded butterfly shrimp (R438), coconut butterfly shrimp (R441), popcorn shrimp (R444), canned cocktail shrimp, dried shrimp, Northern shrimp, saeu-jeot, and shrimp balls; fermented shrimp condiments and pastes are also separately named. | Preserve those boundaries. None owns tempura shrimp. |
| Tempura boundary | The earlier R224 review held frozen tempura fish outside the catalog because a lone result would give the broad `tempura` query an incomplete meaning. It did not allocate a row or ledger candidate. | Apply the same search constraint to this distinct shrimp product. |
| Legacy and ledger | 56 legacy candidates; 2,098 ledger records, 9,533 source entries, 8,083 distinct source IDs, and 6,799 distinct source URLs. No exact shrimp-tempura identity, record, candidate, source ID prefix, or product-source URL was found. | Add no legacy mapping, candidate, or ledger record. |
| Numeric and rule files | The package-yield file has no shrimp-tempura entry; the global and contextual substitution-rule files have no active rules or shrimp-tempura observation. | Add no yield, form, measurement, conversion, or substitution. |
| Recent Section P R4xx reviews | R401 cod roe hold; R404 steamed monkfish liver; R407 salmon roe; R410 Nenu Dieune hold; R413 sujiko hold; R416 herring roe hold; R419 masago; R422 tobiko; R428 whole tilapia; R432 crab cake; R435 crab claws; R438 breaded butterfly shrimp; R441 coconut butterfly shrimp; R444 popcorn shrimp. | The roe, fish, and crab decisions do not own this product. R438, R441, and R444 explicitly keep tempura shrimp outside their reviewed products; none allocated it. |
| Allocation check | No R448 proposal path, hypothetical `ingredient-ref-shrimp-tempura`, source-prefix, or new-source URL collision was found. | Keep the candidate unallocated. New proposal source IDs S01–S05 remain local to this file. |

The current snapshot includes the accepted R444 popcorn-shrimp entry. The broad `shrimp` picker query currently returns eight identities, and `crevettes` returns twelve, including the accepted product and the distinct fermented-condiment identities.

## Picker projection

Projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which normalizes accents and punctuation, matches complete word phrases first, and then falls back to substring matching. For the hypothetical identity, the projection uses only source-attested qualified names such as `shrimp tempura / tempura de crevettes`, `tempura shrimp`, and `crevettes tempura`.

| Query | Current results | If a shrimp-tempura row were added | Review consequence |
|---|---:|---:|---|
| `tempura` | 0 | 1 — shrimp tempura only | An unqualified technique/dish query would appear to mean one prepared shrimp product. |
| `shrimp tempura`; `tempura shrimp` | 0 | 1 — proposed product | Exact qualified queries would be useful. |
| `tempura de crevettes`; `crevettes tempura` | 0 | 1 — proposed product | Both current French market phrasings would be searchable. |
| `ebi tempura` | 0 | 1 only if that manufacturer-specific phrase were later accepted as an alias | No alias is proposed now. |
| `shrimp` | 8 | 9 | Broad shrimp results gain one prepared-product identity. |
| `crevettes` | 12 | 13 | Broad French shrimp results gain one prepared-product identity. |
| `fish`; `poisson` | 12 each | Unchanged | A shrimp row does not own fish or poisson. |

The principal picker problem is the first row. OQLF’s definition includes tempura made with fish, seafood, or vegetables, and R224 already documents the analogous single-result problem for frozen tempura fish. Adding shrimp tempura alone would make the broad query just as incomplete. Adding both shrimp and the held fish product would still make the term appear to represent only those two seafood products, excluding vegetable tempura and other recipe uses. No catalog row is allocated until search can retain useful results for both the qualified product and the broad dish term.

## Full manifest recipe scan

All **114 manifest-listed recipe files and all 1,123 structured ingredient rows** were parsed. Full recipe JSON text and each ingredient row were checked for `tempura`, `shrimp tempura`, `tempura shrimp`, `ebi tempura`, `tempura de crevettes`, `crevettes tempura`, `crevette tempura`, `shrimp`, and `crevette(s)`. The scan found **zero matching files and zero matching ingredient rows** for every term. The recipe corpus supplies no demand, product choice, amount, or method for this identity. No recipe link or recipe-derived number is proposed.

## Species, forms, numbers, and substitutions

- **Species:** Do not assign a shrimp taxon. The product sources use shrimp without naming a species. CFIA common-name material shows that Canadian seafood common names are species-scoped in the Fish List; it does not establish a species for this prepared product. Reuse the cited CFIA source IDs below only for that naming boundary.
- **Forms and preparation:** No form is proposed. Retail examples include frozen oven-ready products and frozen tempura products whose manufacturers describe different packaging and preparation. The sources do not establish a shared raw/cooked, fried/pre-fried, tail-on/tail-off, frozen, or ready-to-cook state. The product name is not a reusable same-ingredient conversion form.
- **Numeric evidence:** Costco’s Canadian French listing gives one 1.15 kg SKU; Metro’s indexed English listing shows a separate 340 g item, while its indexed French listing shows a different 500 g item with a 31/40 grade. These are product-specific package observations, and the Metro product-detail pages did not open directly. Azuma Foods Canada’s notation `100 piece/25g/case` does not clearly state whether 25 g is per piece or a pack convention. Do not infer a count-to-mass conversion, yield, portion, density, package size, or unit mapping for a generic identity. Add no active numeric observation.
- **Substitution:** Add no global or contextual rule between shrimp tempura and plain shrimp, popcorn shrimp, either butterfly-shrimp product, tempura fish, fish sticks, seafood balls, vegetable tempura, or any other seafood. These product pages do not test recipe-role, quantity, or method equivalence.
- **Ledger if reconsidered:** The evidence would support identity research only, not current allocation. Do not create an ingredient-reference record, form, measurement or package-yield record, recipe-line link, conversion, or substitution record in this review.

## Sources and limitations

Sources were checked on 2026-10-17. Manufacturer pages support their own product naming and descriptions. Québec and Canadian seller pages support visible market terminology; they do not establish province-wide stock, a standard formula, or interchangeable preparation. No MAPAQ source is used because this is a prepared retail product review, not a claim about a Québec fishery, landing, or taxon.

| Source ID | Source | Evidence and limitations |
|---|---|---|
| `WP04-SECTIONP-SHRIMP-TEMPURA-R448-20261017-S01` | Metro Canada, [Frozen Shrimp Tempura](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/appetizers-hors-d-oeuvres/frozen-shrimp-tempura/p/059749920810), item 059749920810. | Indexed listing uses the product name and shows a 340 g item. Direct product-page access returned 403; its visible promotion text ended on 2026-09-09. Use only as indexed product-name/packaging evidence, not proof of current price, promotion, or selected-store availability. |
| `WP04-SECTIONP-SHRIMP-TEMPURA-R448-20261017-S02` | Metro Québec, [Crevettes tempura surgelées, format économique](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/crevettes-tempura/p/059749989978), item 059749989978. | Indexed French listing shows a 500 g, 31/40 item and uses `Crevettes tempura surgelées`. Direct page access returned 500. No price, inventory, or product formula is relied on; these details are not independently confirmed beyond the indexed listing. |
| `WP04-SECTIONP-SHRIMP-TEMPURA-R448-20261017-S03` | Costco Business Centre Canada, [Kirkland Signature — Crevettes Tempura](https://www.costcobusinesscentre.ca/p/-/kirkland-signature-tempura-shrimp-115-kg/100418068?langId=-25), item 1562720. | Current French-language Canadian product page gives `Crevettes Tempura`, a 1.15 kg package, oven-ready directions, soy dip, and keep-frozen instruction. Price and availability depend on the delivery area and may change; this is one SKU, not a general package or form specification. |
| `WP04-SECTIONP-SHRIMP-TEMPURA-R448-20261017-S04` | Azuma Foods (Canada) Co., Ltd., [Ebi Tempura](https://azumafoods.ca/products/ebi-tempura/). | Current Canadian manufacturer page lists `Ebi Tempura`, `Shrimp Tempura`, and `Tempura de crevettes`, and names shrimp and tempura batter among the main ingredients. Its case notation `100 piece/25g/case` is ambiguous and not used as a measure. It is manufacturer evidence, not a Québec retail availability survey. |
| `WP04-SECTIONP-SHRIMP-TEMPURA-R448-20261017-S05` | Aubut Food Distribution, [Frozen shrimp tempura — Aquastar](https://www.aubut.ca/en/products/details/frozen-shrimp-tempura-6032). | Directly accessible Québec distributor listing uses `Frozen shrimp tempura` and identifies Aquastar. The page links Laval and Montréal locations but does not expose a package amount or store inventory; no stock or measurement claim is made. |
| **Reused proposal-local `WP04-SECTIONP-FROZEN-TEMPURA-FISH-R224-20261016-S01`** | OQLF, [tempura (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359700/tempura), as cited in the R224 frozen-tempura-fish hold. | OQLF defines tempura as a dish of fish, seafood, or vegetables fried in batter and accepts `tempura` in French. Reused from the R224 proposal; that review is a documented source, not a ledger allocation. It defines the broad dish term, not shrimp-tempura product specifications. |
| **Reused ledger source `WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S03` and `WP04-ABALONE-20261011-S03`** | CFIA, [Fish List shrimp query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp) and [guidance on common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Reused CFIA references support species/common-name boundaries only. They do not identify the shrimp species in tempura products or define a prepared-food class. |
| `WP04-SECTIONP-SHRIMP-TEMPURA-R448-20261017-R01` | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6742), active references/forms, legacy candidates, research ledger and source URLs, package-yield and substitution files, Section P proposals/batches, `IngredientSearch.kt`, and all manifest-listed recipes. | Confirms the current repository snapshot, ownership and collision checks, picker projection, and full recipe scan. It is repository evidence, not an external product or terminology source. |

## Disposition and revisit condition

**Keep shrimp tempura unallocated.** Current Québec and Canadian evidence confirms a distinct product boundary and both English/French retail naming, but the live picker would make broad `tempura` resolve to one shrimp item. The accepted R224 tempura-fish hold documents the same incomplete-search problem, and the recipe corpus has no demand to justify taking that cost now.

Reopen only when the picker can return the exact shrimp-tempura candidate for qualified queries while keeping bare `tempura` useful for its wider fish, seafood, and vegetable meaning, or when a concrete recipe request and a reviewed search behavior provide that distinction. Until then add no identity, alias, form, active measurement, recipe link, package yield, conversion, or substitution. Section P remains open.

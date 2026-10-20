# WP03 Section F R476 — Foxtail millet flakes naming hold (2026-10-17)

## Review record

- **Candidate:** Plain foxtail millet flakes, a species-qualified processed grain product.
- **Open checklist fit:** Section F's remaining identity and terminology work is still open ([plan lines 552–553](../../RecipeBook-global-ingredient-catalog-plan.txt#L552)); the broader regional cereal-mix and preprocessed-grain review is also open ([plan line 14492](../../RecipeBook-global-ingredient-catalog-plan.txt#L14520)).
- **Recommendation:** Hold the candidate outside active references until a Québec French product name is established. Current retailer and supplier pages support the product class and English naming, but not the proposed French compound.
- **Precedent:** The related pearl-millet-flakes review R74 held for the same naming gap and explicitly rejected combining a species term with generic flake wording without product-matched Québec evidence ([R74](wp03-next-section-f-grain-review-r74-20261013.md)). This is a distinct foxtail-millet candidate, not a reopening of R74.
- **Prior checkpoint:** R473 reviewed Bob's Red Mill 5 Grain Hot Cereal, a separate packaged cereal blend ([R473](wp03-section-f-next-gap-review-r473-20261017.md)). R473 did not resolve this species-qualified flake candidate or close Section F.
- **Snapshot:** 1,755 ingredient references, 142 forms, 56 legacy candidates, 2,114 ledger records with 9,636 source entries, and 114 manifest-listed recipes / 1,123 ingredient rows. Manifest-ordered corpus digest: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. Counts describe the live workspace read on 2026-10-17.
- **Status:** This proposal changes no shared catalog JSON, ledger, plan, roadmap, workflow, generated file, recipe, or integration record. No software tests were run.

## Product evidence and naming gap

The product class is established by current listings:

- FreshOnTheGo Grocery, an Ontario retailer with a Scarborough address on the page, lists **Foxtail Flakes 500 gm** under its Millet Flakes section. The listing is English-only and supplies no ingredient panel or French product name [S01–S02].
- S & V Millets lists **Foxtail Millet Flakes (Poha)** and describes its own product as made from foxtail millet. Its page describes soaking, cooking, flattening, and drying, but this is one supplier's process description, not a universal specification [S03].
- TastyGrains lists **Foxtail Millet Flakes – NFS**, describes the product as made from foxtail millet, and shows a 500 g variant. Its indexed listing showed sold-out status when checked; that is not evidence of market-wide availability [S04].

The French components have related but incomplete support. OQLF maps *foxtail millet* / *Setaria italica* to the species term *millet d'Italie* and notes the bird-food association of *millet des oiseaux* [reused WP03-S175]. Existing Canadian/Québec material supports the generic flake wording *flocons de millet*, but the product-matched retail example is finger millet and the other evidence does not establish a foxtail-specific food label [reused WP03-MILLETFLAKES-QC-20261012-S02–S04]. Targeted searches for *flocons de millet d'Italie* did not find a Québec product label or terminology decision. This is a bounded search result, not proof that no such term exists.

The phrase *flocons de millet d'Italie* is a plausible construction, but it is not attested as a Québec food-product name. R74 explains why the catalog should not create a species-qualified flake display by joining a species name to generic *flocons de millet* evidence. R476 applies that same naming standard here. The Ontario and supplier pages add stronger foxtail-flake product evidence than R74 had for its pearl-millet candidate, but they do not resolve its French-language gap.

## Exact disposition

**Hold; approve no catalog delta.** Do not create or reserve an active reference such as **ingredient-ref-foxtail-millet-flakes**. Do not populate a French display from the unapproved phrase *flocons de millet d'Italie*. Keep the English retailer phrase *foxtail flakes* and the supplier's *poha* wording proposal-local; add no alias or ledger candidate while the bilingual identity is unresolved.

Keep these active rows unchanged:

| Neighbor | Current owner and state | Boundary |
|---|---|---|
| Generic millet flakes | **ingredient-ref-millet-flakes**, *millet flakes / flocons de millet*; no aliases or forms; density null and unit mappings empty. Ledger identity is verified; measurement and substitution research remain not yet researched. | Retain as the unqualified product identity. Do not add foxtail flakes or any other species-qualified flake phrase as an alias. |
| Whole foxtail millet | **ingredient-ref-foxtail-millet**, *foxtail millet / millet d'Italie*, with its existing source-backed English grain aliases; no forms, density, or unit mappings. Ledger identity is verified; measurement and substitution research remain not yet researched. | Keep the whole grain separate from its flakes. Do not add a processing form to the whole-grain row. |
| Foxtail millet flour | **ingredient-ref-foxtail-millet-flour**, *foxtail millet flour / farine de millet d'Italie*, with existing flour-qualified English aliases. | Keep the milled flour separate from flakes. |
| Foxtail millet rava | Existing ledger candidate **candidate-foxtail-millet-rava**, identity state needs clarification. | Rava / semolina evidence is not evidence for flakes; leave that candidate unchanged. |

The exact candidate ID, the English phrases *foxtail millet flakes* and *foxtail flakes*, the French phrase *flocons de millet d'Italie*, and close product phrases such as *foxtail millet poha*, *thinai flakes*, *kangani flakes*, *korra flakes*, and *navane flakes* have no exact owner in the active references, forms, legacy candidates, or ledger record IDs. The phrase scan of the proposal and batch archives found no focused foxtail-flakes decision. The related generic-flakes review, R74 pearl-millet-flakes hold, and the whole-foxtail grain/flour records are neighboring decisions, not owners of this product.

Existing naming evidence must be reused rather than duplicated:

- **WP03-S175** is the existing OQLF source for *millet des oiseaux* / *millet d'Italie* on the foxtail-grain records. It establishes the species terminology, not a flake product name.
- **WP03-MILLETFLAKES-QC-20261012-S02–S04** are already attached to the generic millet-flakes record and support generic Québec/French wording only. Their product and ingredient contexts do not establish a foxtail-specific French name.
- The R476 source-ID prefix **WP03-FOXTAIL-FLAKES-R476-20261017-S** and all four new source URLs in this proposal are absent from the shared ledger. Keep these sources proposal-local; do not add them to the live ledger for a held candidate.

## Picker and search effects

The current picker folds accents and punctuation and prefers complete word phrases before falling back to substring matching ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The table shows current results and a hypothetical static projection if a future review accepts a row with the displays *foxtail millet flakes / flocons de millet d'Italie* and the exact English alias *foxtail flakes*. R476 itself leaves all searches unchanged.

| Query | Current rows | Hypothetical rows | Boundary |
|---|---:|---:|---|
| *foxtail millet flakes* | 0 | 1 | Exact English product phrase. |
| *foxtail flakes* | 0 | 1 | Exact title used by the Ontario retailer; only consider as an English alias after the bilingual identity is resolved. |
| *flocons de millet d'Italie* | 0 | 1 | Depends on later Québec approval of the currently unsupported French compound. |
| *millet flakes* / *flocons de millet* | 1 / 1 | 2 / 2 | The generic row and a species-qualified row would both appear. |
| *foxtail millet* / *millet d'Italie* | 2 / 2 | 3 / 3 | The whole-grain and flour rows currently match; a flakes row would be an additional product. |
| *poha* | 3 | 3 if excluded; 4 if indexed | Current results are corn poha, flattened rice, and red-rice flakes. Do not index *poha*, *foxtail millet poha*, or the supplier title's “(Poha)” suffix, since phrase-first matching would add the flake row to the bare *poha* query. |
| *Foxtail Millet Flakes (Poha)* | 0 | 0 if suffix stays unindexed | Copying the supplier's full title would not match a future row with only the safe species-qualified phrase. |
| *thinai flakes* / *thinai* | 0 / 2 | 0 / 2 | Neither the reviewed flake listings nor this hold supports a new *thinai flakes* alias; keep the current grain and flour results. |

Do not add *flocons de millet* as a French alias: it is already the generic row's display and would collapse the species-specific product into that owner. A future approval of the candidate would need to accept the broader generic-query overlap and decide whether the exact English title alias is useful; that decision is not made here.

## Bundled recipe demand

The manifest-ordered scan covered all **114 recipe files** and **1,123 structured ingredient rows**, checking full serialized recipe content and ingredient-row fields for *foxtail millet flakes*, *foxtail flakes*, *foxtail millet poha*, *thinai flakes*, *kangani flakes*, *korra flakes*, *navane flakes*, *flocons de millet d'Italie*, generic millet-flake wording, and close foxtail terms. It found **zero matching files and zero matching ingredient rows**. The scan used corpus digest **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e**. There is no recipe link or recipe-text change to propose.

## Numeric, process, and substitution limits

- FreshOnTheGo and TastyGrains display 500 g packages. S & V's page lists 2 lb in its product heading but 1 kg in its additional-information field. These are package observations, and the S & V page is internally inconsistent; none is a serving, household measure, or conversion.
- No reviewed source supplies a foxtail-flake cup or spoon weight, reusable density, unit mapping, or verified volume-to-mass conversion. Add none.
- S & V describes its own soaking/cooking/flattening/drying sequence. This does not establish that every product shares a preparation method or one standardized dry/cooked state. Add no form, cooking yield, hydration ratio, or dry-to-cooked conversion.
- Supplier suggestions for breakfast, snacks, smoothies, and baking do not establish a tested, quantity-preserving substitution for rice poha, generic millet flakes, oats, or another cereal. Add no substitution finding, rule, or recipe-line link.

## Source register

Sources checked on 2026-10-17. New source IDs remain proposal-local because the disposition is a hold.

| Source ID | Source and evidence | Limit |
|---|---|---|
| **WP03-FOXTAIL-FLAKES-R476-20261017-S01** | FreshOnTheGo Grocery, [Foxtail Flakes 500 gm](https://www.freshonthegogrocery.ca/products/s-v-homemade-foxtail-flakes/10705000000924093). The retailer page names the product, places it in its Millet Flakes navigation, and gives its Scarborough, Ontario address. | English retailer wording only. It gives no French label, ingredient panel, or general process specification. No stock claim is inferred. |
| **WP03-FOXTAIL-FLAKES-R476-20261017-S02** | FreshOnTheGo Grocery, [Millet Flakes category](https://www.freshonthegogrocery.ca/categories/millet-flakes/10705000000442905). Lists Foxtail Flakes among multiple millet-flake products and lists separate pearl, kodo, little-millet, and rice-flake products. | Retail category evidence; the listing does not provide French wording or a shared processing specification. |
| **WP03-FOXTAIL-FLAKES-R476-20261017-S03** | S & V Millets, [Foxtail Millet Flakes (Poha)](https://svmillets.com/product/foxtail-millet-flakes/). Names the foxtail flake product, describes the supplier's process and uses, and calls it foxtail millet poha. | Supplier-specific wording and process; not Québec French terminology or a universal use/substitution. Its page gives 2 lb in one field and 1 kg in another; do not use either as a normalized measure. |
| **WP03-FOXTAIL-FLAKES-R476-20261017-S04** | TastyGrains, [Foxtail Millet Flakes – NFS](https://www.tastygrain.ca/products/foxtail-millet-flakes-nfs). The current indexed listing describes flakes made from foxtail millet and a 500 g variant. | Direct page retrieval returned a cache miss; indexed seller text only. The listing showed sold out and provides no Québec French product name or transferable numeric data. |
| Reused **WP03-S175** | OQLF, [millet des oiseaux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux). Identifies *Setaria italica*, English *foxtail millet*, and French *millet d'Italie*. | Species terminology, not a French name for edible flakes; OQLF notes the bird-food association of *millet des oiseaux*. Reuse the existing ledger source ID. |
| Reused **WP03-MILLETFLAKES-QC-20261012-S02–S04** | Existing Canadian/Québec generic-flake wording reviewed in the [millet-flakes proposal](wp03-section-f-millet-flakes-identity-review-20261012.md). | Supports *flocons de millet* as generic wording only; it does not attest *flocons de millet d'Italie*. Reuse the source IDs already on the generic millet-flakes record. |

## Reopen condition

Keep Section F and the regional cereal/preprocessed-grain checklist open. Reopen this candidate if a current Québec-facing bilingual product label identifies foxtail millet flakes in French, or an independent Québec terminology review approves a product-specific French name. Then repeat exact ownership, source-URL, picker, and full-corpus checks before deciding whether to add a separate identity. Until then, retain the current generic millet-flakes, whole foxtail millet, foxtail millet flour, and foxtail-rava candidate scopes unchanged.

# WP03 Section F: polenta taragna dry-mix boundary review (2026-10-12)

## Review record

- **Status:** Reviewed and held by root on 2026-10-12; see [hold integration record](../batches/wp03-section-f-polenta-taragna-dry-mix-hold-integration-20261012/README.md). No canonical catalog, ledger, recipe, generator, or application data changed; the plan and roadmap record the decision.
- **Scope:** One regional cereal product not found in the prior proposal/archive sweep: the dry corn-and-buckwheat blend marketed as *polenta taragna*, *taragna flour*, or *farine pour polenta taragna*. This review concerns the packaged dry blend only. It does not catalog the cooked polenta dish.
- **Plan item:** Section F still leaves regionally significant cereal mixes and preprocessed grains open ([plan, line 2111](../../RecipeBook-global-ingredient-catalog-plan.txt#L2204)). The generic cornmeal/grits/polenta boundary is separately reviewed and held in [the 2026-10-11 proposal](wp03-polenta-grits-product-boundary-review-20261011.md). Exact repository searches for `taragna` and `polenta taragna` found no previous candidate proposal, batch, checklist decision, or active recipe mention. This packet adds evidence about one bounded mix without reopening that generic decision.
- **Disposition:** Keep a source-backed candidate on hold for active catalog purposes. Product sources establish a dry mix in the source region and English Canadian retail listings, but no Québec French package name was found; OQLF's *polenta* entry defines the cooked dish. The unqualified picker query `polenta` would also select the narrow Taragna item if its market name were activated.

## Recommendation and product boundary

The sources support a distinct **dry corn-and-buckwheat blend intended for polenta taragna**. The official VisitBrembo regional portal describes the regional preparation as cornmeal and buckwheat flour enriched with cheese. Coop's Italian product page sells a 500 g mix of corn flour and buckwheat flour specifically for making polenta taragna. A French-language Italian mill catalogue also lists a product under *farine de maïs pour polenta taragna* and names both corn and buckwheat flours as ingredients.

This is enough to distinguish a packaged blend from either component flour. It does not establish a stable source-neutral recipe: one Coop SKU declares 70% corn flour and 30% buckwheat flour, while the mill catalogue describes a small quantity of buckwheat without giving a ratio. The regional recipe includes the prepared dish's water, cheese, butter, garlic, and herbs, which are not part of the dry mix identity.

The French catalog label *farine de maïs pour polenta taragna* is from an Italian producer's French-language catalogue, not a Québec package. OQLF supports *polenta* and *semoule de maïs* as Québec French terms, but defines polenta as the cooked dish made with corn semolina and liquid. The Canadian listings use English product wording and do not show a Québec French name. A literal descriptive display such as *mélange pour polenta taragna* is understandable, but remains an unverified Québec catalog name. I recommend no active bilingual name or aliases until a Québec-facing product label or terminology review establishes the French display.

| Product or phrase | Boundary and disposition |
|---|---|
| Packaged dry Taragna blend | Distinct candidate for a later `GRAIN_AND_CEREAL` identity; hold for Québec French naming and safe picker behavior. |
| Prepared polenta taragna | Regional cooked dish; do not add it as an ingredient reference or infer its full recipe from the dry mix. |
| Plain polenta / dry cornmeal | Keep the existing generic-polenta hold and `cornmeal / semoule de maïs` identity unchanged. The Taragna blend is not a cornmeal alias. |
| Buckwheat flour / `farine de sarrasin` | Keep the existing flour identity distinct; do not split the blend into two linked recipe ingredients or transfer its measurements to the component. |
| Cheese, butter, and seasonings | Dish ingredients, not ingredients in the Coop dry blend declaration. Keep them outside the candidate identity. |
| Instant and traditional products | Do not infer a universal cooking time or common formula. Individual products and regional preparations vary. |

## Exact ownership and archive audit

Current active names and aliases were checked with the repository's accent-, punctuation-, and case-folded search normalization. Exact normalized candidate phrases checked included `polenta taragna`, `polenta taragna mix`, `taragna polenta`, `taragna flour`, `taragna mix`, `corn and buckwheat polenta`, `farina per polenta taragna`, `farine pour polenta taragna`, `farine de maïs pour polenta taragna`, and `mélange pour polenta taragna`.

| Surface | Exact candidate ownership and relevant neighbors |
|---|---|
| Active references (1,285) | No exact Taragna candidate owner. `ingredient-ref-cornmeal` owns `cornmeal / semoule de maïs` and English alias `corn meal`. `ingredient-ref-buckwheat-flour` owns `buckwheat flour / farine de sarrasin`. `ingredient-ref-hominy-grits` and whole hominy remain separate products. |
| Active forms (97) | No exact candidate term, attached form, or match term. No Taragna form is present. |
| Legacy candidates (64) | No exact candidate name or alias. |
| Research ledger (1,592 records) | The existing exact record `ingredient-ref-polenta` is an unresolved generic-polenta candidate, based in part on OQLF and current Canadian product variability. No exact `taragna` or `polenta taragna` candidate record or source occurrence was found. The generic record is adjacent evidence, not ownership of this dry mix. |
| Proposal and batch archive | No previous `taragna` review was found. The generic polenta/grits proposal covers ordinary corn products and the general prepared-dish versus retail-label ambiguity; it does not review a corn-and-buckwheat blend. |

No active identifier is reserved. `ingredient-ref-polenta-taragna` is only a possible future identifier if the naming and picker issues are resolved.

## Live package and corpus snapshot

Snapshot rechecked from the live tree on 2026-10-12. File digests cover exact bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte, in manifest order.

| Artifact | Live count | SHA-256 or corpus fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,285 references; 123 `GRAIN_AND_CEREAL` | `632470bdd715bf0ce33156c5a8f50aa07300295f3a2922e220cae711c3b4dbe1` |
| `ingredient-forms.v1.json` | 97 forms | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,592 records; 5,686 source entries; 4,717 distinct source IDs | `de2b5e50edadd552d53782300fba8c0f464c17f1df4ecb43bd8765ae90ae1073` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe-file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Québec and Canadian naming evidence

- OQLF's Québec French *polenta* entry gives `polenta` as the preferred French and English term, but defines it as an Italian dish made from corn semolina cooked with liquid. It does not define Taragna or a dry packaged ingredient.
- OQLF's *semoule de maïs* entry defines the dry corn milling and says it can be fine, medium, or coarse and is used to prepare polenta. This supports the existing cornmeal neighbor, not the full mixed product.
- The Canadian Nonna's Pantry listing titles the item `Bertozzi - Stone Ground Polenta TARAGNA ... 500g` and describes a buckwheat-and-corn blend. Its page showed **sold out** when accessed. It attests Canadian-market English wording, not current stock or French naming.
- Mini Italia Canada has an indexed `Polenta Taragna (Yellow Corn & Buckwheat)` listing for a 500 g item, with the note `Product not available for online purchase`. Direct page retrieval returned a cache miss during this review, so this is a corroborating indexed listing only.
- A French-language product listing from Swiss retailer LAPA uses `Farine traditionnelle pour polenta taragna`; Molino Bongiovanni's Italian mill catalogue uses `Farine de maïs pour polenta taragna`. These establish French-language market phrasing outside Québec, not a fr-CA preferred name.
- Targeted searches of OQLF/TERMIUM for `taragna` and `polenta taragna` returned no terminology record. This is a bounded lookup, not proof that no Québécois speaker uses the borrowed name.

**Naming decision:** No active French display or French aliases are supported for the database yet. Retain source wording as evidence; do not promote *taragna*, *polenta taragna*, or a constructed French compound to active aliases. A later naming review can test a descriptive display such as `mélange pour polenta taragna` against a current Québec package or Québec terminology authority.

## Picker behavior

The live picker in [RecipeEditorScreen.kt](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt) uses `IngredientReferenceSearchIndex` from [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The index searches reference names, aliases, and attached form terms; it normalizes accents and punctuation, first returns terms containing the complete query phrase, and falls back to substring matching only when there are no phrase matches.

Current static behavior from the live terms:

| Query | Current picker result |
|---|---|
| `polenta`, `polenta taragna`, `taragna` | No active reference. The unresolved generic `ingredient-ref-polenta` ledger record is not in the picker. |
| `cornmeal`, `semoule de maïs` | `ingredient-ref-cornmeal`. |
| `buckwheat flour`, `farine de sarrasin` | `ingredient-ref-buckwheat-flour`. |

If a future active name or alias contains the market phrase `polenta taragna`, the normalized phrase matcher will also treat the shorter complete words `polenta` and `taragna` as matches. A static comparison using the current matcher returns the hypothetical Taragna row for each of `polenta taragna`, `taragna`, and bare `polenta`; there is no other active `polenta` result. This would make an unspecified `polenta` ingredient look like the Taragna mix, contrary to the existing generic-polenta hold. Do not add a `polenta taragna` alias, or an identity display containing that phrase, until the picker can preserve a user's qualification or a coordinator explicitly accepts that broad-query effect.

This is a source-code behavior audit, not an emulator observation. No app test or emulator check was run for this proposal-only task.

## Complete manifest recipe-demand scan

Every recipe file listed in the live manifest was parsed in manifest order. The scan normalized all string values in each full recipe JSON object and separately checked all ingredient rows, including original wording, ingredient name, reference ID, and other row text, for `polenta taragna`, `taragna`, `taragna flour`, `polenta`, the candidate English/French phrases above, and corn/buckwheat blend wording.

| Corpus measure | Result |
|---|---:|
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Full recipe files with a candidate or `polenta` mention | 0 |
| Matching ingredient rows | 0 |
| Rows linked to a Taragna or generic-polenta reference | 0 |

No bundled recipe demand, recipe-line link, amount, form selection, or substitution is supported.

## Measurement, formula, and substitution limits

| Source observation | Scope | Do not generalize to |
|---|---|---|
| Coop package: 500 g; declared ingredients 70% corn flour and 30% buckwheat flour | One Italian Coop product SKU. | A universal Taragna formula, serving size, or ingredient ratio. Molino Bongiovanni describes a smaller buckwheat proportion without stating a percentage. |
| Coop preparation: 500 g mix with 2 L water, cooked about 45 minutes | Instructions for that specific product; the label says to consume after cooking. | A mass-volume conversion, household measure, cooking yield, or rule for another brand or instant mix. |
| VisitBrembo regional recipe: 400 g flour blend for six servings, plus water, at least 300 g cheese, and 50 g butter; cooking at least 40–50 minutes | One prepared dish recipe and serving context. | A generic portion size, package serving, density, or dry-mix conversion. |
| Molino Bongiovanni catalogue suggests 60 minutes for its listed product | One product-specific cooking direction. | A generic cooking-time form or product equivalence. |

No source gives a neutral volume-to-mass measure or density for the blend. No source supports a substitution ratio between the blend and plain cornmeal, buckwheat flour, grits, hominy grits, or another polenta product. Do not create a form under either component reference: this is a multi-ingredient mix, not a preparation state of one ingredient. If the identity is accepted later, keep default density null, unit mappings empty, no forms or yields, and no substitution rules unless independent evidence supplies a scoped relationship.

## Source register

Sources were accessed on 2026-10-12. Proposal-local source IDs `WP03-TARAGNA-MIX-20261012-S01` through `S05` were checked absent from the live ledger. Existing OQLF records WP03-S143 and WP03-S144 are reused below rather than duplicated.

| Source ID | Source and URL | Supports and limits |
|---|---|---|
| `WP03-TARAGNA-MIX-20261012-S01` | VisitBrembo, official portal of Val Brembana, [Polenta taragna](https://www.visitbrembo.it/en/recipe/polenta-taragna/); accessed 2026-10-12. | Lines 18–24 describe the Bergamo/Valtellina regional cooked dish as cornmeal and buckwheat flour enriched with cheese. Lines 34–40 give one recipe's 400 g mix, water, cheese, butter, and servings. Supports regional identity and dish boundary; it does not give a neutral packaged-mix formula. |
| `WP03-TARAGNA-MIX-20261012-S02` | Coop Italia, [Polenta taragna 500 g](https://www.coop.it/il-prodotto-coop/coop/pasta-riso-e-farina/alimentari-confezionati/farina/polenta-taragna-500-g); accessed 2026-10-12. | Product page calls it a corn-and-buckwheat-flour mix for polenta taragna and declares 70% corn flour / 30% buckwheat flour. It lists a 500 g package, 500 g mix with 2 L water, about 45 minutes of cooking, and consumption after cooking. These are one SKU's composition and instructions, not generic measurements or a universal formula. |
| `WP03-TARAGNA-MIX-20261012-S03` | Molino Bongiovanni, French-language [Products Catalogue](https://www.molinobongiovanni.com/files/ProductsCatalogVer1-FR.pdf), pp. 29–30; accessed 2026-10-12. | Lists `FARINE DE MAÏS POUR POLENTA TARAGNA`, ingredients corn flour and buckwheat flour, describes it as a Valtellina/Bergamo/Brescia product, and gives a product-specific 60-minute cooking time. Supports French-language European phrasing and a second blend product; not Québec usage or a fixed percentage. |
| `WP03-TARAGNA-MIX-20261012-S04` | Nonna's Pantry, [Bertozzi Stone Ground Polenta Taragna, 500 g](https://nonnaspantry.ca/products/bertozzi-stone-ground-polenta-taragna-ffrom-valtellina-500g); accessed 2026-10-12. | Canadian retail listing title and description call the product Taragna flour / polenta Taragna and describe a hearty buckwheat-and-corn blend. The listing showed sold out. Supports Canadian-market English wording and blend identity only; no current availability, ratio, or Québec French name. |
| `WP03-TARAGNA-MIX-20261012-S05` | Mini Italia Canada, [Polenta Taragna (Yellow Corn & Buckwheat)](https://www.mini-italia.ca/en/product/polenta-taragna-yellow-corn-buckwheat); accessed 2026-10-12. | Search-indexed Canadian listing names a 500 g item and states it is not available for online purchase. Direct page retrieval returned a cache miss, so it is corroborating listing text only; no package label, stock, or French wording was independently confirmed. |
| Existing `WP03-S143` | OQLF, [polenta](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557111/polenta); source already in the generic-polenta ledger candidate. | Defines polenta as a cooked Italian dish made from corn semolina and liquid and gives the same preferred French and English term. Does not define a packaged dry polenta or Taragna mix. |
| Existing `WP03-S144` | OQLF, [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais); source already in the generic-polenta ledger candidate. | Defines dry-ground corn and supports fine, medium, and coarse cornmeal and its use in polenta. Does not define the corn-and-buckwheat blend. |
| Naming-search check | OQLF and TERMIUM targeted lookups for `taragna` and `polenta taragna`; accessed 2026-10-12. | No terminology entry was returned. This limited exact-term lookup cannot prove non-use in Québec. |

## Precise possible integration delta

**Current catalog delta: none.** Root recorded the hold in the plan and roadmap; no shared catalog, recipe, or ledger data changed. The proposal documents a possible future ledger-only record if the project later chooses to preserve a candidate with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; it was not added as part of this hold.

Do not add an active reference, aliases, forms, default density, unit mappings, measurement observations, conversions, yields, substitutions, or recipe links. Do not modify or merge `ingredient-ref-cornmeal`, `ingredient-ref-buckwheat-flour`, `ingredient-ref-hominy-grits`, or the unresolved generic `ingredient-ref-polenta` candidate. Reopen active naming only after a Québec-facing French package label or terminology decision is found and the coordinator resolves the picker behavior for broad `polenta` queries.

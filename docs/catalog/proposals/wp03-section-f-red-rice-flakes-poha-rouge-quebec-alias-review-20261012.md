# WP03 Section F — red-rice poha Québec French alias review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** proposal only; no shared catalog, ledger, plan, roadmap, code, or recipe data changed.
- **Scope:** one wording decision for the existing `ingredient-ref-red-rice-flakes` identity: whether the French-language Canadian retail phrase `poha rouge` should be a French search alias. This does not reopen the red-rice-flakes identity, replace its current provisional French display, or revisit other red-poha regional names.
- **Open plan context:** the Section F checklist still calls for regional cereal-mix, processed-cereal, preprocessed-grain, and Québec terminology coverage ([plan checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L9421)).
- **Related review:** the red-rice-flakes product-boundary review established the existing row and its product limits ([identity review](./wp03-section-f-red-rice-poha-product-boundary-review-20261012.md)). This file adds only a narrow follow-up on the French search wording.

## Recommendation

**Add `poha rouge` as one `aliasesFr` value on the existing `ingredient-ref-red-rice-flakes` reference.** Keep its English display `red rice flakes`, provisional French display `riz rouge aplati`, existing English alias `red rice poha`, and `GRAIN_AND_CEREAL` category unchanged. Do not add another ingredient reference.

The exact French phrase appears in a Canadian retailer's French product title and description for a red-rice-flake product. A second French-language Canadian listing labels a similar product `Riz rouge moyen Poha`; the existing Walmart Canada source also uses `Riz Rouge Poha` and `Riz Rouge Aplati`. Together these support `poha rouge` as a fr-CA retail search alias for this one red-rice product class. They do **not** make it an OQLF or TERMIUM preferred term. Keep `riz rouge aplati` as the current provisional display pending any separate formal terminology decision.

The proposed alias is deliberately narrower than the generic search wording. Do not add bare `poha`, `flocons de riz`, `flocons de riz rouge`, `riz aplati`, `riz battu`, or the source-specific names `Matta Aval` and `Sivappu Aval`. The generic phrase `flocons de riz (poha)` already identifies flattened rice, and separate active identities cover brown-rice flakes and corn poha. The cited French product evidence supports the exact alias `poha rouge`; it does not require a broader French translation or a new form.

## Québec and Canadian terminology evidence

- The Ottawa retailer Spice Divine uses the exact phrase **`poha rouge`** in its French title `Flocons de riz de l'Est (poha rouge) 500 g` and repeats it in the product description for the Eastern red rice flakes. The listing identifies the food as rice flakes/poha, so this supports the alias-to-identity relationship. It is a retailer label, not a terminology authority; the page was marked out of stock in the indexed listing, so no availability claim is made.
- Qualifirst's French-Canada storefront calls its product `Riz rouge moyen Poha 700 g`. The product copy identifies red poha rice as flattened rice. `Moyen` is part of this product's grade label and should not become a general alias or a red-specific form without separate evidence.
- Provigo's French product listing uses `Suraj Flocons de riz (Poha) 300 g` for generic poha, with no red-rice qualifier. This is current Canadian French evidence for the neighboring generic identity, not for the red row.
- The existing Walmart Canada fr-CA source (`WP03-RRPOHA-20261012-S02`) labels one product `Riz Rouge Poha / Matta Aval` and uses `Riz Rouge Aplati`. It supports the current provisional display and confirms that product-specific terms remain attached to a listing; it does not establish `Matta Aval` as a source-neutral synonym.
- The reviewed TERMIUM Plus `rice flake / flocon de riz` record places the term in milling and cereal industries and describes cooked rice grains or pieces shaped into flakes, then toasted and oven-dried. This terminology record concerns a cereal product and does not establish `flocon de riz` as a name for every flattened-rice/poha product. Keep the generic poha row and avoid broadening its French phrase onto this red-specific reference.
- The located OQLF GDT entry for `orzo` uses `grain de riz aplati` only to compare the shape of the pasta. It does not name poha or red rice flakes. A bounded GDT search for `poha`, `riz aplati`, and red-rice-flake wording did not surface a dedicated entry; this review therefore makes no claim that `poha rouge` or `riz rouge aplati` is officially preferred.

## Current ownership, forms, and picker audit

The live normalized-key audit used the package's `normalize_search_key` helper across active reference names and aliases, attached form labels and match terms, legacy candidate names and aliases, and ledger record IDs. Exact key ownership is distinct from a phrase search returning a longer name.

| Exact normalized key | Current owner or state |
| --- | --- |
| `red rice flakes`, `red rice poha`, `riz rouge aplati` | `ingredient-ref-red-rice-flakes` |
| `poha rouge` | No active reference, attached form, legacy candidate, or allocated ledger record ID. This is the one proposed alias. |
| `red rice`, `riz rouge` | `ingredient-ref-red-rice` — intact red rice |
| `rice flakes`, `flaked rice`, `beaten rice`, `flattened rice (poha)`, `riz aplati`, `riz battu`, `chiura` | `ingredient-ref-flattened-rice-poha` — generic flattened rice/poha |
| `brown rice flakes`, `flocons de riz brun` | `ingredient-ref-brown-rice-flakes` |
| `corn poha`, `poha de maïs`, and qualified maize-poha aliases | `ingredient-ref-corn-poha` |
| `roasted red rice flour`, `farine de riz rouge torréfiée` | `ingredient-ref-roasted-red-rice-flour` — flour, not flakes |
| `flocons de riz rouge` | No exact owner and no current picker result; no source in this review attests this compound as the red product's name. |

The target row is already active as `red rice flakes / riz rouge aplati`, category `GRAIN_AND_CEREAL`, with English alias `red rice poha`, no French aliases, `defaultDensity: null`, and `unitMappings: []`. It has **no attached forms**. The generic poha row has thin, medium, and thick commercial forms; those are not red-specific and do not transfer to the target.

In [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), `IngredientReferenceSearchIndex` first returns complete normalized word-phrase matches across reference and form terms, then falls back to substring matching when no phrase matches. The audit reproduced that source-code behavior; this is not live UI QA.

| Query | Current phrase-first result | Effect of proposed alias |
| --- | --- | --- |
| `poha rouge` | No result | One result: `ingredient-ref-red-rice-flakes` |
| `poha` | Generic flattened rice/poha, red rice flakes, and corn poha | Unchanged; these remain three qualified rows |
| `red rice` or `riz rouge` | Intact red rice, red rice flakes, and roasted red rice flour | Unchanged; the qualified names remain visible |
| `rice flakes` | Generic flattened rice/poha, brown rice flakes, and red rice flakes | Unchanged |
| `flocons de riz` | Generic flattened rice/poha and brown rice flakes | Unchanged; red rice flakes is not currently indexed by this phrase |
| `riz aplati` or `riz battu` | Generic flattened rice/poha | Unchanged; these exact aliases stay on the generic identity |

The current red-rice-flakes ledger record is `ingredient-ref-red-rice-flakes`, `recordType: ingredient_reference`, with `identityState: verified`. Its `measurementState` and `substitutionResearchState` remain `not_yet_researched`; this terminology proposal does not change either state. Its three existing product sources and accepted identity decision remain the ledger evidence. No candidate record is needed for an alias on an accepted reference.

## Recipe demand and data boundaries

All **114 manifest-listed bundled recipe files** and all **1,123 ingredient rows** were scanned for the candidate phrase set (`poha rouge`, red-rice-flake/poha spellings, `flocons de riz rouge`, and neighboring rice/poha wording). The scan found **zero matching recipe files and zero matching ingredient rows**. A separate reference-ID scan found **zero recipe lines linked to `ingredient-ref-red-rice-flakes`**. This is a search-demand result, not an instruction to create a recipe link.

Keep the data dimensions separate:

- **Identity and aliases:** keep the existing reference; propose only French alias `poha rouge`.
- **Forms:** none on the red-rice-flakes reference. Do not attach generic thin/medium/thick poha grades or infer that the French retailer's `moyen` label is a standardized form.
- **Measurements:** no household quantity or serving measure is supported. The listed 500 g and 700 g are package sizes; retailer rinse/soak instructions are product-specific and do not establish a transferable recipe measure.
- **Density and unit mappings:** retain `defaultDensity: null` and an empty `unitMappings` list. No mass-volume conversion is proposed.
- **Conversions and yields:** add none. No source here establishes a red-rice-to-flake conversion, dry-to-prepared ratio, hydration yield, or equivalence to generic poha grades.
- **Substitutions:** add no same-ingredient form conversion or contextual ingredient substitution. The current ledger still says substitution research is not yet researched; this review supplies no interchangeability evidence.
- **Recipe links:** add none. The complete bundled corpus has no matching line and no link to the target reference.

## Proposal-local source register

These source IDs are unique to this proposal and are **not** additions to the shared research ledger. Existing ledger source `WP03-RRPOHA-20261012-S02` is reused as identified above.

| Source ID | Source | Claim supported and limit |
| --- | --- | --- |
| `WP03-RRFLAKE-QC-ALIAS-20261012-S01` | Spice Divine, Ottawa, [Flocons de riz de l'Est (poha rouge) 500 g](https://spicedivine.ca/fr/products/easternriceflakes500gm). | French title and description use `poha rouge` for a red-rice-flake product. The listing was marked out of stock in the indexed page; it establishes wording, not availability or an official term. |
| `WP03-RRFLAKE-QC-ALIAS-20261012-S02` | Qualifirst, [Riz rouge moyen Poha 700 g Epigrain](https://odoo.qualifirst.com/fr_CA/food/rices/poha-medium-red-rice-m). | French storefront title pairs red rice and Poha; product copy identifies red poha as flattened rice. `Moyen` is product-grade wording only. The listed package size and preparation directions do not establish reusable measures or yields. |
| `WP03-RRFLAKE-QC-ALIAS-20261012-S03` | Provigo, [Aliments de l'Asie du Sud](https://www.provigo.ca/fr/alimentation/aliments-internationaux/aliments-de-l-asie-du-sud/c/58045). | Current French listing names generic `Suraj Flocons de riz (Poha) 300 g`; it does not specify red rice. Supports keeping generic flocons wording separate. |
| `WP03-RRFLAKE-QC-ALIAS-20261012-S04` | Government of Canada, TERMIUM Plus, [rice flake / flocon de riz](https://www.btb.termiumplus.gc.ca/tpv2source?fchrcrdnm=41&i=1&index=enb&lang=eng&rlang=fr&src_id=OCDE-1021999%2CSRCL37642002%2CSRCL37642004&srchtxt=UP+INCLUDING&titl=flocon+de+riz). | Official federal terminology record gives a cereal-industry context and describes cooked, shaped, toasted, oven-dried rice flakes. This does not define poha or establish the red-specific alias. |
| `WP03-RRFLAKE-QC-ALIAS-20261012-S05` | Office québécois de la langue française, [orzo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2094699/orzo). | The entry's `riz aplati` wording is a shape comparison for orzo. It does not name rice poha; no preferred red-poha term is inferred. |

## Live package snapshot

Snapshot counts and SHA-256 values were refreshed from the live package immediately before finalization on 2026-10-12.

| Snapshot item | Count | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1270 | `5eee521502de2d060c6276c2c4a4e8048d4d8ba7a1f413f73811832395932843` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy candidates | 65 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research-ledger records | 1578 | `c6c248fbcd60fa20a087d24ff6821e27a8bca61ebc4d21525a55d1c398ba6952` |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 | `d6fe5ed2456ceafbeff1086df459f86ef0f39af9c875f4f1cabac95e11148294` |
| Manifest | 1 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The recipe-corpus digest is SHA-256 over manifest-listed relative recipe paths and their current content hashes. The other hashes are of the named raw JSON files. Counts and hashes describe this read-only audit point; they are not versioning or integration claims.

## Disposition

Proceed with a one-alias proposal: add French alias `poha rouge` to the existing red-rice-flakes identity, leaving all shared data unchanged until an integration batch chooses to accept it. Keep the current provisional display and every forms, measures, mappings, conversions, yields, substitution, and recipe-link field unchanged. Section F's broader regional cereal and processed-grain checklist remains open.

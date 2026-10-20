# WP04 Section P — frozen whole octopus form review (R686)

- **Review and source-access date:** 2026-10-18.
- **Open checklist:** WP04 Section P seafood coverage remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6703).
- **Candidate:** Current Québec supplier listings for whole frozen octopus, including a source-identified *Octopus vulgaris* product.
- **Status:** Integrated. Added one frozen-whole form under the existing generic octopus reference and a form-level research-ledger record. The identity stays species-neutral; SKU-specific ingredients, species, grades, package amounts, and handling details remain in the source notes.
- **Integration record:** See the [R686–R687 integration README](../batches/wp04-wp06-r686-r687-review-integration-20261018/README.md). No app tests/build/emulator were run because the application change adds database JSON data under `AGENTS.md`.
- **Form ID:** **ingredient-form-octopus-frozen-whole**.
- **Source prefix:** **WP04-SECTIONP-OCTOPUS-WHOLE-FORM-R686-20261018-**; the three source IDs are now recorded on the form-level research-ledger entry.

## Boundary and prior work

The live catalog has generic **octopus / pieuvre** with French alias **poulpe**, plus the accepted cooked-tentacle form. Separate active references cover octopus in olive oil and in Galician sauce. These remain distinct from the candidate whole-frozen presentation.

The [generic octopus review](wp04-section-p-octopus-identity-gap-sweep-20261012.md) kept whole, frozen, dried, and other product descriptors off the identity row because it had no product-specific form decision. R474 later added a cooked-tentacle form from a distinct Metro SKU. R37 holds dried octopus, and R605 holds Ferma’s octopus roll because its composition and preparation are unknown and the French word *rouleau* would hide wrapper results. None of those decisions covers the current whole-frozen supplier product. This proposal does not reopen them.

The French and English Pêcheries Océanic pages list the same whole-octopus product family and identify its species as *Octopus vulgaris*. Its product page gives freezer storage instructions and a shelf life measured from freezing, supporting the frozen state. A Montréal fishmonger separately uses **pieuvre commune / poulpe commun** for *O. vulgaris* and says its product is available whole and cleaned, but the listing was out of stock when checked. Do not transfer that seller’s “cleaned” claim or stock status to the Pêcheries product. [S01–S03]

## Proposed form

Add only this form under the existing **ingredient-ref-octopus** owner:

| Field | Proposed value |
|---|---|
| ID | **ingredient-form-octopus-frozen-whole** |
| Parent | **ingredient-ref-octopus** |
| Form code / preparation state | **whole_frozen** / **frozen** |
| English / Québec French display | **frozen whole octopus** / **pieuvre entière surgelée** |
| Match terms | English: **whole octopus**; French: **pieuvre entière** |
| Density / unit mappings | None |

The names reuse the supplier’s exact “Whole Octopus” / “Pieuvre entière” wording, with the frozen state supported by its freezer-storage information. The row describes a searchable product presentation. It does not claim that all frozen octopus products are whole, that this product is raw or cooked, or that it is cleaned. The supplier lists *O. vulgaris* and a SKU-specific ingredient declaration including octopus, sodium citrate, citric acid, potassium carbonate, and salt. Keep those details in the evidence notes; do not assign the species or formula to generic octopus as a whole. [S01–S02]

Do not create a new species reference, species alias, stand-alone finished-food identity, generic **whole fish** alias, or match term for *Octopus vulgaris*, **pieuvre commune**, **poulpe commun**, **cleaned**, or the supplier’s grades.

## Current ownership and source audit

The proposal audit snapshot, before this integration, contained **1,838 active references**, **169 forms**, and **2,216 research-ledger records**.

| Candidate or owner | Current state |
|---|---|
| **ingredient-ref-octopus** | Active **PROTEIN** identity **octopus / pieuvre**, with **poulpe** as its French alias. It owns the broader ingredient; no species is assigned. |
| Attached octopus forms | Before integration, only **ingredient-form-octopus-cooked-tentacles** was present; the frozen-whole form is added by R686. |
| Nearby octopus products | **ingredient-ref-octopus-in-olive-oil** and **ingredient-ref-octopus-in-galician-sauce** remain separate prepared-food identities. |
| Exact candidate terms | No exact owner for **whole octopus**, **frozen whole octopus**, **pieuvre entière**, or **pieuvre entière surgelée** in live reference names/aliases, forms/match terms, legacy candidates, or ledger record IDs. |
| Proposed IDs and URLs | The proposed form ID, R686 source prefix, and three new product-page URLs are unowned in the active data and focused archive. |
| Reused source owners | CFIA Fish List source **WP04-OCTOPUS-IDENTITY-20261012-S01** and OQLF source **WP04-OCTOPUS-IDENTITY-20261012-S02** already belong to the generic octopus ledger record. Reuse those exact source IDs for the relevant name/species context; do not create duplicate allocations for their URLs. |

The supplier’s French and English pages are paired views of one product family, not independent evidence. The La Gambas listing is a separate Montréal seller page. None of these exact product-page URLs was present in the ledger or proposal/batch archive at review time.

## Picker projection

The read-only projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases win before substring fallback; an exact form query returns the parent reference and a form hint. The counterfactual adds only the form above.

| Query | Current result | With the form | Effect |
|---|---|---|---|
| **frozen whole octopus**; **whole octopus** | None | Generic octopus with the frozen-whole form hint | Exact product searches become findable. |
| **pieuvre entière surgelée**; **pieuvre entière** | None | Generic octopus with the frozen-whole form hint | Exact Québec French searches become findable. |
| **octopus** | Generic octopus, octopus in Galician sauce, octopus in olive oil | Same three references | No new identity or species choice. |
| **pieuvre** | Generic octopus | Same result | The form does not create another reference. |
| **poulpe** | Generic octopus, octopus in Galician sauce, octopus in olive oil | Same three references | Existing alias behavior remains unchanged. |
| **whole** | 38 references | 39 references | Adds generic octopus; the broad search remains multi-result. |
| **entière** | 9 references | 10 references | Adds generic octopus; the broad search remains multi-result. |
| **surgelée** | 3 references | 4 references | Adds generic octopus; the broad search remains multi-result. |

The exact product phrases resolve to the existing generic owner with a form hint. No unqualified octopus search collapses to a single species or product.

## Full recipe-demand audit

The manifest lists **114 recipe files and 1,123 ingredient rows**. I scanned all manifest-listed recipe JSON, including full decoded recipe text and each structured ingredient row, for the generic octopus terms, whole/frozen product wording, and the named species/product phrases: octopus, pieuvre, poulpe, *Octopus vulgaris*, whole octopus, frozen whole octopus, pieuvre entière, and pieuvre entière surgelée.

- Matching recipe files: **0**.
- Matching ingredient rows: **0**.
- Octopus-specific recipe links or amounts: **none**.

The generic “cooked meat or seafood” recipe choice does not identify octopus. No recipe link, preparation method, or quantity follows from the bundle. The full manifest-ordered recipe snapshot is 114 files / 1,123 rows / 754,048 bytes; its ordered file-content SHA-256 is **e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108**.

## Measurements and substitutions

The supplier’s size grades and case packing are specific to its listed products. La Gambas gives a different weight range for its own T4 listing, so the grade is not a reliable shared count-to-mass measure. Treat all printed grades and package amounts as product-specific; add no recipe quantity, density, volume measure, unit mapping, count conversion, edible yield, package yield, or cooking conversion.

No source or recipe supports replacing this whole-frozen product with cooked tentacles, dried octopus, octopus in oil or sauce, squid, cuttlefish, or another seafood in a stated dish role and amount. Add no global form conversion, contextual substitution, warning, or recipe-line substitution link. Keep the generic octopus ledger’s measurement and substitution research states unchanged.

## Source register

Sources were checked on 2026-10-18. New R686 source IDs are recorded on the form-level research-ledger entry.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-OCTOPUS-WHOLE-FORM-R686-20261018-S01** | Pêcheries Océanic, [Pieuvre entière de l’Espagne](https://pecheriesoceanic.com/produit/pieuvre-entiere-de-lespagne/). Lists **Octopus vulgaris**, whole-octopus grades, ingredients, individual tray packaging, and freezer storage. | Current supplier page, not a consumer recipe specification. Species, additives, size grades, origin, and package details apply to this product family only. Freezer storage confirms the frozen product state but not raw/cooked or cleaned condition. |
| **WP04-SECTIONP-OCTOPUS-WHOLE-FORM-R686-20261018-S02** | Pêcheries Océanic, [Whole Octopus from Spain](https://pecheriesoceanic.com/en/product/pieuvre-entiere-de-lespagne/), paired English view of S01. | Same supplier/product family, not independent evidence. Supports English “Whole Octopus” and the same SKU-specific details and frozen-storage information. |
| **WP04-SECTIONP-OCTOPUS-WHOLE-FORM-R686-20261018-S03** | Poissonnerie La Gambas, [Poulpe – Pieuvre](https://lagambas.ca/products/poulpe-pieuvre). Names “pieuvre commune ou poulpe commun (*Octopus vulgaris*)” and says its product is available whole and already cleaned. | Separate Montréal seller listing, out of stock at review. Supports local product wording and species identification only; its cleaned state, grade, origin, and amounts do not transfer to S01. |
| Reused **WP04-OCTOPUS-IDENTITY-20261012-S01** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSN 82603 / *O. vulgaris* rows. | Existing URL/source owner on **ingredient-ref-octopus**. Use the row-specific locator; the result supplies Canadian species-linked common names, not a form or recipe measure. |
| Reused **WP04-OCTOPUS-IDENTITY-20261012-S02** | OQLF, [pieuvre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402783/pieuvre). | Existing source owner on **ingredient-ref-octopus**. Supports Québec **pieuvre / poulpe** and English **octopus**; it is not a frozen-product source. |
| **WP04-SECTIONP-OCTOPUS-WHOLE-FORM-R686-20261018-R01** | Read-only audit of plan, archive, references/forms, legacy candidates, ledger source ownership, picker projection, and complete manifest recipe corpus. | Repository snapshot and static search projection only. |

## Recommendation

**Integrated:** Added only **ingredient-form-octopus-frozen-whole** under the existing **ingredient-ref-octopus**. The bilingual supplier pages and current Québec seller wording establish a real whole-octopus presentation; the product’s storage instructions establish that the supplier item is frozen. Keep the product’s *O. vulgaris* identification, additive declaration, cleaning status, grades, and package weights source-scoped. Add no new reference, alias, recipe link, reusable measure, conversion, yield, or substitution. Leave R680’s grouper market group and R683’s Atlantic-cod fillet hold unchanged.

The integrated JSON was statically validated as part of the bundled seed package and research ledger. No software tests/build/emulator were run because this change adds only database JSON data.

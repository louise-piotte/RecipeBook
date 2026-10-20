# WP04 Section P — Montréal Nenu Dieune mullet-roe product boundary (R410)

- **Review and source-access date:** 2026-10-17.
- **Candidate:** Poissonnerie La Gambas's Montréal listing, **Oeuf de Mulet (Nenu Dieune)**, a frozen roe product advertised for fish-and-rice dishes including Tieb.
- **Recommendation:** Hold this product outside active references, forms, legacy mappings, and the shared research ledger. The current Québec listing establishes a local product and use context, but its label does not establish a stable species or a general mullet-roe identity; its package-weight statements are unreconciled. No bundled recipe selects it.
- **Scope:** This is a focused review of the La Gambas roe SKU. It does not revisit whole striped mullet / mulet cabot, bottarga / poutargue, salmon or trout roe, tobiko, masago, cod roe, milt, ankimo, or other roe decisions.
- **Proposal-only status:** This file is the only proposed change. No shared catalog JSON, ledger, plan, roadmap, generated index, archive, recipe, or application code was edited. No software tests, build, emulator, or deployment was run.
- **Proposal-local source IDs:** New ID **WP04-SECTIONP-MULET-ROE-R410-20261017-S01** and audit label **WP04-SECTIONP-MULET-ROE-R410-20261017-R01**. Reused source IDs are identified in the source table; no shared source record is proposed.

## Why this is the next open product boundary

The [Section P roe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7398) remains open after the [R407 salmon-roe proposal](wp04-section-p-next-seafood-gap-review-r407-20261017.md) for distinct products beyond that decision. The earlier [tobiko/masago packet](wp04-tobiko-masago-roe-boundary-review-20261009.md) already assessed those two identities separately. [R129's striped-mullet review](wp04-section-p-striped-mullet-market-picker-review-r129-20261015.md) mentioned the La Gambas listing only to keep the roe product separate from whole striped mullet; it did not decide whether the roe itself has an active identity, review its current bilingual picker effect, or determine whether its listing supports measurements. This proposal takes up that distinct product only.

La Gambas currently offers the product in Montréal as **Oeuf de Mulet (Nenu Dieune)**. Its page says it is frozen, of Senegal (Atlantic) origin, and intended for fish-and-rice dishes including Tieb. The title says “Oeuf de Mulet,” while its description calls it “Oeuf de Poissons.” The listing provides no scientific name, ingredient declaration, or separate English product label. Its weight selector says **250 g**, while the description separately says **908 g, approximately 2 lb**, without clarifying how the weights map to variants. These are useful source-specific product facts, but they do not resolve whether this is a particular mullet species, a broader family-level roe product, or the seller's regional product name for fish roe. [Reused R129-S06]

OQLF's edible-fish entry treats **mulet** as the Mugilidae family and translates it as **mullet**, with multiple Atlantic species in its note. Its separate **mulet cabot / striped mullet** entry identifies *Mugil cephalus*. The La Gambas page does not identify that species, so do not transfer the whole-fish identity or taxonomy from R129. OQLF's **œufs / roe** entry names the marketable anatomical part and lists examples including shad, carp, whitefish, haddock, herring, salmon, sturgeon, and lumpfish; it does not establish **œufs de mulet** as a normalized roe-product name. [S01; reused R129-S02; reused R40-S03]

The active bottarga identity already represents a narrower processed product. OQLF and current Canadian retail evidence describe bottarga / poutargue as salted, pressed, dried roe; CaviarHub's Montréal-market listing names **poutargue (œufs de mulet gris)** and describes a salted, dried lobe. This is distinct from La Gambas's frozen fish-roe listing. Do not map the latter to bottarga, infer that it is raw or unsalted, or use the word “mullet” to assign it to the bottarga source's species. [Reused WP04-ROE-S06; reused WP04-BOT-CA-20261016-S03]

**Hold rationale:** One current Québec-facing SKU is enough to document the product and its local food use, but not enough to establish a general picker identity from the ambiguous wording. The bundle has no request for it, and a hypothetical row would become the only result for broad **mullet / mulet** searches while also adding a fifth item to the broad **roe** query. Keep the exact listing name as research context until a recipe and a matching package label identify the intended product more fully.

## Bilingual identity boundary

- The retailer's exact French title is **Oeuf de Mulet (Nenu Dieune)**. Its description switches to generic **Oeuf de Poissons**. Do not treat either phrase as an OQLF-normalized compound or assume **Nenu Dieune** is a global synonym.
- **Mullet roe / œufs de mulet** is a possible future descriptive bilingual display, built from source-attested components. It is not recommended for activation here: the source has no English product label, does not identify a species, and uses a singular French product title while OQLF's generic roe entry uses plural **œufs**.
- Do not add **Nenu Dieune**, **fish roe / œufs de poisson**, bare **roe**, **caviar**, **mullet / mulet**, **mulet cabot**, or *Mugil cephalus* as aliases or species links. The current generic fish-roe wording already appears in the bottarga display.
- Keep the frozen Senegal-origin item apart from whole mullet flesh, bottarga, and all other named roe products. “Frozen” and the origin are claims about this listing, not universal forms or species assignments.

## Live ownership, archive, and recipe audit

The live snapshot inspected here has **1,714 active ingredient references**, **141 forms**, **56 legacy candidates**, and **2,073 research-ledger records**. The seed manifest lists **114 recipe files**. The static audit compared bilingual reference names and aliases, attached form labels and match terms, legacy candidate names and aliases, and ledger record IDs and text.

| Term or record | Current owner | Disposition |
|---|---|---|
| **mullet roe**, **œufs de mulet**, **œuf de mulet**, **Nenu Dieune** | No exact active reference, form, or legacy candidate. No dedicated ledger record exists. | Keep the La Gambas SKU unallocated. Do not create an ID or candidate record. |
| **ingredient-ref-mullet-roe**, **candidate-mullet-roe** | No current allocation. | Reserve neither ID. |
| **roe** | Four live picker results: bottarga, milt, salmon roe, and trout roe. | A hypothetical mullet-roe row would make this a five-result query. |
| **fish roe**, **œufs de poisson** | The active bottarga display is the current result. | Leave generic wording with its current owner; do not alias this SKU to it. |
| **mullet**, **mulet** | No current picker result. | A hypothetical mullet-roe display would make each broad query return this roe product alone. |
| **bottarga / poutargue** | Active verified reference **ingredient-ref-bottarga**; its ledger scope is salted, pressed, dried roe. | Keep it distinct from the frozen La Gambas listing. |
| **R410 source prefix** | No R410 source ID was found in the live ledger or earlier proposal/batch archive. | Keep S01 and R01 local to this proposal. Reuse existing IDs for repeated URLs below. |

The archive review found the earlier R129 mention of the La Gambas product, but no focused Nenu Dieune / mullet-roe identity review. R129's decision concerns whole *Mugil cephalus* and says not to merge the roe listing into whole-fish flesh. That boundary remains unchanged. The current catalog already reflects R395 trout roe and R407 salmon roe; this proposal does not reopen either row or any other completed roe decision. [R01]

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**, checking complete recipe JSON and the structured ingredient rows for **mullet roe**, **mullet roes**, **œufs de mulet**, **œuf de mulet**, **Nenu Dieune**, **fish roe**, **fish eggs**, **œufs de poisson**, **œuf de poissons**, **mullet**, **mulet**, **bottarga**, **poutargue**, **ceebu jën**, **thieboudienne**, **thiebou dieune**, **Tieb**, **riz aux poissons**, and **rice with fish**. It found **zero matching files and zero matching rows**. No recipe link, amount, method, or role selects this product. [R01]

## Picker projection

This projection follows the current phrase-first then substring-fallback matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using current bilingual reference and form terms. The hypothetical row is only a comparison aid; its possible display would be **mullet roe / œufs de mulet**, with the retailer's singular **œuf de mulet** as a source-term variant. No row or alias is proposed.

| Query | Current picker result | Projection with the hypothetical row |
|---|---|---|
| **mullet roe**, **œufs de mulet**, **œuf de mulet** | None | One mullet-roe result |
| **Nenu Dieune** | None | None; no global alias is supported |
| **roe** | Bottarga; milt; salmon roe; trout roe | Same four plus the mullet-roe product |
| **fish roe**, **œufs de poisson** | Bottarga | Unchanged |
| **mullet**, **mulet** | None | The mullet-roe product alone |
| **bottarga**, **poutargue** | Bottarga | Unchanged |

Exact product wording would become searchable, but **mullet / mulet** would resolve to a roe product despite the source not identifying the fish species or supporting a general roe identity. Adding the row would also widen **roe** from four distinct results to five. The direct product terms and broad-query effects do not outweigh the unresolved product boundary in the absence of recipe demand.

## Measures, forms, and substitutions

- **Package:** The page currently exposes a 250 g weight option and separately states approximately 908 g / 2 lb without explaining how those values relate to its variants. Record neither as a package measure or observation. Do not infer a recipe portion, unit conversion, density, count weight, package yield, or serving yield.
- **Form and origin:** “Frozen” and “Senegal (Atlantic)” remain claims for this seller listing. Add no general frozen form, species, origin field, or relation to whole-mullet forms.
- **Substitution:** No reviewed source or bundled recipe tests replacing this product with bottarga, salmon/trout roe, tobiko, masago, cod roe, milt, or another ingredient. Add no global or contextual substitution rule, warning, or recipe-line substitution.
- **Runtime data:** Keep forms, unit mappings, active measures, conversions, yields, and substitutions absent. Since no ledger candidate is allocated, do not create measurement or substitution research-state records.

## Source register

Sources were checked or rechecked on 2026-10-17. Reused IDs identify sources already cited in the archive or ledger; proposal-local labels do not create shared-ledger records.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-MULET-ROE-R410-20261017-S01** | OQLF, [GDT: mulet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488148/mulet), edible-fish entry, updated 1983. | Uses **mulet / muge** for the Mugilidae family and gives English **mullet** with a note about various Atlantic species. It supports the broad name boundary, not the species or roe-product identity of the La Gambas SKU. |
| **Reused WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S06** | Poissonnerie La Gambas, [Oeuf de Mulet (Nenu Dieune)](https://lagambas.ca/products/oeuf-de-mulet-nenu-dieun), current product title, selector, description, origin, and use context; rechecked 2026-10-17. | Montréal-facing listing says frozen and for fish-and-rice dishes, gives Senegal (Atlantic) origin, and separately shows 250 g and approximately 908 g / 2 lb without explaining their relation. No binomial, ingredient declaration, or English product label is given. Product-page facts only. |
| **Reused WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S02** | OQLF, [GDT: mulet cabot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198990/mulet-cabot). | Gives **mulet cabot / striped mullet**, **grey mullet**, and *Mugil cephalus*. Supports keeping the species-specific whole-fish name separate; it does not identify the roe source. |
| **Reused WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S01** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [searchable Fish List](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp). | Canadian fish-label source with English/French common names linked to taxa. R129's checked results show mullet wording across more than one taxon; this does not identify the La Gambas roe species. |
| **Reused WP04-FINFISH-ID-20261009-S06** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Explains the Canadian fish common-name and Fish List scope. It does not decide the app's ingredient aliases or infer a species from an unqualified retailer title. |
| **Reused WP04-SECTIONP-MENTAIKO-20261013-R40-S03** | OQLF, [GDT: œufs de poisson](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435851/oeufs-de-poisson), preferred term and English equivalent. | Supports generic **œufs de poisson / fish roe**. The entry does not name mullet roe or Nenu Dieune. |
| **Reused WP04-BOT-CA-20261016-S03** | CaviarHub, [Poutargue italienne / Bottarga / Œufs de Mulet Gris](https://caviarhub.ca/fr/products/bottarga-grey-mullet-roe-dried), title and product details. | Current Canadian listing describes its product as salted, dried gray-mullet roe in a dense lobe. This supports the product-state boundary from frozen fish roe; it is not a universal definition of mullet roe. |
| **WP04-SECTIONP-MULET-ROE-R410-20261017-R01** | Current Section P plan, live references/forms, legacy candidates, research ledger, proposal/batch archive, IngredientSearch.kt, seed manifest, and all manifest-listed recipe files. | Read-only ownership, source-ID, picker-projection, and complete recipe-corpus audit against the snapshot above. It does not establish demand beyond the bundled recipe library. |

## Final disposition

**Hold the Nenu Dieune / Oeuf de Mulet listing as a source-specific, unallocated product.** Preserve its Montréal title, frozen state, origin, intended food context, and unreconciled package statements in this research proposal only. Do not create a general mullet-roe reference, alias, form, measure, candidate, ledger row, recipe link, or substitution. Reopen if a bundled recipe selects the product and a matching package label clarifies its species, product presentation, and usable quantity.

# WP04 Section P — surimi crab-stick product-boundary review (R387)

## Scope and recommendation

- **Review and source-access date:** 2026-10-17.
- **Open checklist:** Section P, “Fish powder, fish balls, and surimi”; the parent remains open.
- **Candidate:** The current Montréal retail listing `Dyna sea® Bâtonnets de surimi au crabe / Asian star® Crab Flavoured Surimi Sticks`.
- **Recommendation:** Keep this product-specific identity unallocated. Do not add a reference, alias, form, ledger candidate, recipe link, measure, conversion, yield, or substitution.
- **Boundary:** This review covers the stick-shaped crab-flavoured surimi product style only. It does not reopen generic fish powder, generic fish balls, or the unresolved identity of unqualified `surimi`, and it does not duplicate the held Aquamar surimi-shreds candidate or the active crab-flavoured pollock-flakes reference.

## Evidence and product scope

A1 Fish Market, a Montréal retailer, lists a specific Dyna Sea / Asian Star product under the paired wording `Bâtonnets de surimi au crabe / Crab Flavoured Surimi Sticks`. The product page was online when checked but marked sold out; its page does not expose an ingredient declaration. The English qualifier says *crab flavoured*, while the French title says *au crabe*. This is source-attested market wording for a named retail product, not evidence that the product contains crab meat, follows one universal formula, or is interchangeable with crab meat. [S01]

Aquamar's manufacturer page uses `Surimi Crab Sticks` for a trade product. This independently confirms a named stick-style surimi product, but the page is a commercial SKU page and does not establish that it is the same product as A1's Dyna Sea listing or provide a Québec consumer display. [S02]

Metro's Québec consumer article uses bare *surimi* for precooked, seasoned fish products and mentions *bâtonnets de surimi* as a snack. The article establishes local consumer use of the broad term, not a package-matched ingredient statement or an equivalence between paste and any one finished style. OQLF's GDT, by contrast, defines *surimi* as fish myofibrillar-protein paste with cryoprotectants, used notably to make imitation seafood, and gives *surimi* as the English equivalent too. These sources preserve the unresolved paste-versus-finished-product distinction. [reused Metro source `WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S06`; reused OQLF source `WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S01`]

CFIA guidance says finished products made from surimi use the generally known or a descriptive common name, with additional descriptors as appropriate; products that resemble crab or other seafood should be clearly identified as imitations. That guidance supports keeping the stick/product descriptor visible and keeping the product distinct from actual crab. It does not establish the A1 product's ingredients or assign a universal French name. [reused source `WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S05`]

## Live ownership and picker behavior

The live package contains **1,700 ingredient references**, **141 forms**, and **114 manifest-listed recipes** with **1,123 ingredient rows**.

| Wording or owner | Live state | Boundary |
|---|---|---|
| `surimi`, `surimi sticks`, `surimi crab sticks`, `crab-flavoured surimi sticks`, `bâton de surimi`, `bâtonnets de surimi`, and `bâtonnets de surimi au crabe` | No exact active name, alias, form term, or legacy-import identity was found for these phrases. | The stick product has no existing row to reuse. No ledger record specific to surimi sticks exists. |
| `candidate-surimi-product-boundary` | Existing ledger-only candidate in `needs_clarification`; it is not an active picker result. | Keep the bare term unresolved. The current candidate spans technical paste terminology and finished retail uses. |
| `ingredient-ref-crab-flavoured-pollock-flakes` | Active prepared-product reference for `crab-flavoured pollock flakes / goberge en flocons à saveur de crabe`; it has no surimi alias. | Keep this flake-style product distinct from the A1 stick-style listing. Do not transfer its pollock wording or any formulation to the stick product. |
| `ingredient-ref-fish-balls` | Active generic formed-fish-product reference `fish balls / boulettes de poisson`, with singular aliases only. | Sticks are not fish balls or an alias/form of them. |
| `ingredient-ref-crab` | Active actual-crab-meat reference `crab meat / chair de crabe`. | Keep the retailer's `crab flavoured / au crabe` product wording separate from actual crab meat. |
| `ingredient-ref-bonga-dried-fish-powder`, `ingredient-ref-dried-bonito`, and `ingredient-ref-fish-stock` | Active, separately scoped powder or stock references. | None is an owner, form, or substitute for surimi sticks. |

`IngredientSearch.kt` first returns every reference with a complete normalized word-phrase match across names, aliases, and attached form terms; it then falls back to substring matching. The current queries `surimi`, `surimi sticks`, `crab sticks`, `bâtonnets de surimi`, and `bâtonnets de surimi au crabe` have no result. If a stick row were added under either source-attested name, bare `surimi` would phrase-match that row and return it as the sole result, because the generic candidate is not active and no other active surimi product is indexed. This would make a product-style choice appear to answer the unresolved broad query. Hold the row until picker behavior can preserve a broad surimi choice alongside product-specific results, or a recipe requests this exact style and the intended query is unambiguous.

The current `crab` query already has species and actual-crab results. Do not add a broad `crab sticks`, `crab meat`, `imitation crab`, `similicrabe`, or unqualified `surimi` alias to the product; no such alias is needed to represent the seller's source wording, and those phrases would erase meaningful distinctions.

## Bundled recipe demand

The full scan covered all **114** recipe files named by `manifest.v1.json` and all **1,123** ingredient rows, including recipe JSON text. It found no match for `surimi`, surimi sticks, crab sticks, `bâtonnets de surimi`, or the reviewed A1 product name. Recipe 019, “Crab Balls,” names actual jumbo lump crab meat and is not a surimi-stick request. No recipe link is proposed.

## Measurement, form, and substitution limits

A1's listed package mass describes that retailer's package only. It is not a piece count, serving measure, density, mass-volume conversion, yield, or generic recipe quantity. Metro's consumer article discusses cooked retail surimi generally; it does not verify the cooking or storage state of the A1 SKU. Do not assign a frozen, refrigerated, cooked, ready-to-eat, or raw form to all surimi sticks based on a different product page.

No source or bundled recipe supports a substitution among surimi sticks, unqualified surimi paste, crab-flavoured pollock flakes, actual crab meat, fish balls, fish tofu, or other imitation-seafood products. Add no measure, form, mapping, conversion, yield, recipe link, or substitution.

## Reopen conditions

Revisit only if picker search can keep unqualified surimi useful while exposing multiple specific finished products, or if a bundled recipe requests a clearly named stick product. At that point, confirm the recipe-matched bilingual name and package ingredients before deciding whether the requested item is a crab-flavoured imitation product or another surimi stick. Do not infer species, crab content, allergen profile, storage state, or cooking readiness from the title alone.

## Source register

The A1 and Aquamar source IDs below are proposal-local and have not been added to the shared research ledger. Previously registered Metro, CFIA, and OQLF sources are explicitly marked as reused.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SURIMI-STICKS-R387-20261017-S01** | A1 Fish Market, [Dyna sea / Asian Star crab-flavoured surimi sticks](https://a1.fish/products/asian-star%C2%AE-batonnets-de-surimi-au-crabe-asian-star%C2%AE-crab-flavoured-surimi-sticks). | Montréal retailer page displays the paired French/English product title and product-specific package information; the page was marked sold out when checked and does not provide an ingredient panel. Its page lists Montréal-area locations. Used for Canadian/Québec product wording only. |
| **WP04-SECTIONP-SURIMI-STICKS-R387-20261017-S02** | Aquamar, [Surimi Crab Sticks — Seafarer trade product](https://aquamarseafood.com/product-trade/surimi-crab-sticks-kanimi-seafarer/). | Manufacturer product page names a Surimi Crab Sticks trade SKU. It is not the same identified Canadian retail package as S01 and has no Québec French consumer label; no SKU-specific details are generalized. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S06** *(reused)* | Metro, [Connaissez-vous le surimi?](https://www.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/connaissez-vous-surimi). | Québec consumer article uses `surimi` for precooked, seasoned fish products and mentions `bâtonnets de surimi`; this is market-language context, not a package specification. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S05** *(reused)* | CFIA, [Exigences en matière d'étiquetage pour le poisson et les produits de poisson](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/poisson), “Surimi.” | Current federal guidance distinguishes surimi paste from finished products and says descriptors should be used as appropriate; surimi products that imitate other seafood should be clearly identified as imitations. This is labeling guidance, not an ingredient decision for S01. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S01** *(reused)* | OQLF, [surimi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199047/surimi). | Defines the technical fish-protein paste and gives `surimi` as the preferred term in French and English; it does not identify the A1 finished retail product. |

This is a documentation-only evidence-backed hold. No shared catalog JSON, ledger, plan, roadmap, README, code, or test file was changed.

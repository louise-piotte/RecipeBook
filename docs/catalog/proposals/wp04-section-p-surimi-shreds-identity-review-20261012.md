# WP04 Section P — surimi shreds identity review

- **Reviewed / sources accessed:** 2026-10-12.
- **Disposition:** Hold the otherwise source-backed identity-only candidate `surimi shreds / râpé de surimi`, category `PROTEIN`, with no aliases or forms. The current picker would return this product for the bare query `surimi` while the generic `surimi` candidate remains unresolved.
- **Scope:** the exact bilingual Aquamar surimi-shreds product listed by Metro Québec, not generic surimi, raw surimi paste, imitation crab, fish balls, or fish cakes.
- **Root disposition:** No active reference is allocated. Preserve the bilingual product evidence in this proposal and revisit after the picker can show the unresolved generic result alongside the finished shreds product.
- **New source IDs:** `WP04-SURIMI-SHREDS-20261012-S01` and `S02`. They were checked against the live ledger, all proposal files, and batch notes; no collision was found. The Metro product page and OQLF/CFIA references already present in the prior surimi packet are reused under their existing source IDs.

## Recommendation

The sources support the specific finished product identity **surimi shreds / râpé de surimi** as a potential `PROTEIN` reference with no aliases. Metro lists the English and French names for a 227 g Aquamar product under the same product number, 605453810154 [existing source `WP04-FBSUR-RECHECK-20261011-S08`]. The page reported the product out of stock at the selected Metro store when checked; it still provides a paired Canadian retail name for a specific product listing. Aquamar's current U.S. and Canada retail page separately names Surimi Shreds as one of its finished seafood product styles, distinct from flakes and sticks [S01].

This is narrower than the existing held candidate `candidate-surimi-product-boundary`. OQLF uses unqualified `surimi` for fish-protein paste containing cryoprotectants, distinguishes `surimi brut` and `pâte de surimi`, and separately names finished imitation seafood [existing sources `WP04-FBSUR-20261011-S01`–`S04`]. Metro's product title identifies a retail shreds product, not the unqualified paste input. Metro's consumer article also describes retail surimi products as precooked and ready to eat, commonly made from pollock and whiting [S02]. That article is general market context, not a product specification for the Aquamar package; do not assign species, formula, or a universal ready-to-eat form from it.

The exact proposed catalog names are the retailer's paired displays `surimi shreds` and `râpé de surimi`. Do not alias the new row to unqualified `surimi`, `surimi paste`, `surimi brut`, `pâte de surimi`, `imitation crab`, `similicrabe`, actual crab meat, fish balls, or fish cakes. OQLF uses `similicrabe` for a crab-imitation product; the Aquamar listing does not specify that the shreds imitate crab, so the two names must remain distinct [existing `WP04-FBSUR-RECHECK-20261011-S09`].

Because the proposed displays contain `surimi`, the current picker treats bare `surimi` as a complete-phrase match and would return the shreds row alone. The unresolved generic candidate is not an active picker result. Hold the product row until search behavior preserves both the broad unresolved choice and the finished-product option; keeping the full qualifier visible does not resolve the picker ambiguity.

Prior reviews mention the same Metro listing as evidence that a Québec-market seller uses “surimi” in a finished-product name. They leave the generic word unresolved and do not allocate the exact bilingual shreds product to a separate active identity. This proposal records only that narrower product phrase; it does not reopen fish balls or change the generic-surimi hold.

## Live catalog, ledger, exact-name ownership, and recipe demand

The live bundled package read on 2026-10-12 has **1,246 ingredient references, 94 forms, 66 legacy candidates, and 114 manifest-listed recipes with 1,123 ingredient rows**. The research ledger has **1,552 records**.

| Current owner or candidate | Current state | Boundary for this proposal |
|---|---|---|
| `ingredient-ref-fish-balls` | `fish balls / boulettes de poisson`, category `PROTEIN`; only singular aliases `fish ball` and `boulette de poisson` | Retain as the formed-ball identity. Shredded surimi is not a fish-ball alias or form. |
| `candidate-surimi-product-boundary` | Ledger state `needs_clarification`; measurement state `researched_no_supported_value`; substitution state `researched_no_supported_substitute` | Keep unresolved for bare `surimi`, which is used for paste and for some finished products. This proposal does not allocate the bare term to the new row. |
| `ingredient-ref-crab` | `crab meat / chair de crabe`, category `PROTEIN` | Keep actual crab separate from surimi-based products and crab-imitation names. |
| Surimi shreds candidate | No active reference, form, or legacy exact owner for `surimi shreds`, `râpé de surimi`, or `surimi shred(s)` | The exact bilingual retail phrase can be represented as a narrow product identity, with no shorter aliases. |

Normalized exact-key checks for `surimi shreds`, `surimi shred`, `râpé de surimi`, `surimi seafood shreds`, and `Aquamar surimi shreds` found no owner among current reference names/aliases, form labels/match terms, or legacy identities. The exact keys for `fish balls`, `boulettes de poisson`, and `crab meat / chair de crabe` remain on their existing rows. Unqualified `surimi`, `surimi paste`, `surimi brut`, `pâte de surimi`, `imitation crab`, and `similicrabe` have no active reference owner; the generic surimi state remains with its ledger candidate, not a catalog row. No form is attached to fish balls or crab meat for these phrases.

A structured scan of all **114** manifest-listed recipe files found **zero** ingredient-row or recipe-text matches for `surimi shreds`, `râpé de surimi`, `surimi`, fish balls, or related French terms. Recipe 019 is titled “Crab Balls,” but its seafood ingredient is `1 lb jumbo lump crab meat`; it does not request surimi, surimi shreds, or fish balls. No recipe link is proposed.

## Product and name boundaries

| Product or wording | Source evidence and limit | Catalog treatment |
|---|---|---|
| **Surimi shreds / râpé de surimi** | Aquamar lists surimi shreds as a retail product style in its U.S./Canada channel [S01]. Metro Québec pairs `Surimi shreds` and `Râpé de surimi` on one Aquamar listing and product number [existing `WP04-FBSUR-RECHECK-20261011-S08`]. The product page does not disclose the package's ingredient declaration and reported it out of stock at the selected store. | Keep as an unallocated identity candidate until picker search preserves the generic query result. If later integrated, use only these paired names, with no aliases or form data. |
| **Generic surimi paste** | OQLF defines `surimi` as fish-protein paste with cryoprotectants; it separately defines `surimi brut` without additives and `pâte de surimi` as surimi mixed with additional ingredients for imitation-seafood manufacture [existing `WP04-FBSUR-20261011-S01`–`S03`]. | Retain the unresolved candidate. None of these paste terms is an alias or form of the finished shredded product. |
| **Imitation crab / similicrabe** | OQLF defines `similicrabe` as a surimi-based food imitating crab, and separately defines `simili-fruits de mer` as surimi-based imitation seafood [existing `WP04-FBSUR-RECHECK-20261011-S09` and `WP04-FBSUR-20261011-S04`]. Metro's shreds listing does not identify crab imitation or give ingredients. | Keep these names distinct. Do not alias `similicrabe` or `imitation crab` to the proposed row without product-specific evidence. |
| **Fish balls / boulettes de poisson** | The active row names a formed product; prior source reviews show that products called fish balls can use fish flesh or surimi paste, with varied recipes. | Keep the active identity, aliases, and source decision unchanged. No fish-ball-to-shreds relation or substitution is supported. |
| **Actual crab meat** | The live catalog has `crab meat / chair de crabe`; recipe 019's line names jumbo lump crab meat. | Keep actual crab distinct from surimi-derived products. No substitution or recipe relink. |
| **Pollock / goberge or whiting** | Metro's consumer article describes retail surimi generally as using pollock and whiting, but the Metro Aquamar shreds listing does not provide this SKU's ingredient list [S02]. | Do not assign a species or pollock/whiting alias to the proposed row. Biological identity remains separate from the generic retail product name. |

## Measurement and substitution limits

Add no density, unit mapping, cooking or preparation form, package yield, volume-to-mass conversion, recipe amount, or recipe link. Metro's 227 g net package listing and per-100 g retail price describe that package and its sale, not a recipe measure. The existing surimi ledger candidate already records no supported kitchen measurement.

Add no substitution between surimi shreds and raw surimi paste, imitation crab, actual crab meat, fish balls, fish cakes, or fish fillets. No bundled recipe provides a context, method, role, quantity, or outcome to support a directed replacement. Keep the existing surimi-candidate finding `researched_no_supported_substitute`; do not attach a global substitution to the new identity.

## Source register

New sources accessed 2026-10-12. Existing references are cited by their prior source IDs and are not registered again.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SURIMI-SHREDS-20261012-S01** | Aquamar, [U.S. & Canada Retail](https://aquamarseafood.com/u-s-canada-retail/). | Manufacturer identifies Surimi Shreds as one finished retail style alongside Surimi Flakes and Surimi Sticks for its U.S./Canada retail channel. It does not tie this whole product family to the Metro 227 g package, disclose that package's formula, or establish a French display. |
| **WP04-SURIMI-SHREDS-20261012-S02** | Metro, [Have You Heard of Surimi?](https://api.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/connaissez-vous-surimi). | Metro's consumer-facing article describes retail surimi generally as precooked fish, commonly pollock and whiting, seasoned to imitate crab or lobster and ready to eat. This supports consumer product-state context only; its species and statements are not assigned to the Aquamar shreds SKU. |

Existing sources reused: OQLF's [`surimi`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199047/surimi), [`surimi brut`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199046/surimi-brut), [`pâte de surimi`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199055/pate-de-surimi), and [`simili-fruits de mer`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199045/simili-fruits-de-mer) entries (`WP04-FBSUR-20261011-S01`–`S04`); CFIA's [fish-product labeling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) (`WP04-FBSUR-20261011-S13`); and the bilingual Metro listing ([English](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/lobster-crab-pollock/surimi-shreds/p/605453810154) / [French](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/rape-de-surimi/p/605453810154)) for `Surimi shreds / Râpé de surimi` (`WP04-FBSUR-RECHECK-20261011-S08`). The related [fish-balls/surimi product-boundary review](wp04-fish-balls-surimi-product-boundary-review-20261011.md) and [current-source reassessment](wp04-fish-balls-surimi-current-source-reassessment-20261011.md) remain the decisions for generic fish balls and unqualified surimi.

## Next open work

Keep the combined Section P fish-powder/fish-balls/surimi checklist open. The fish-ball identity remains integrated; the exact finished shreds product remains unallocated because the bare query would return it alone; generic `surimi` remains unresolved because the bare term spans paste and finished product states. Any later integration should wait for picker behavior that preserves both choices, use a recipe-specific name or source-attested product phrase, and keep biological species, package data, kitchen measurements, and substitution claims separate.

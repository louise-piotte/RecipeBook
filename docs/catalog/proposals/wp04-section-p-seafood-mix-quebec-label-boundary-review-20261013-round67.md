# WP04 Section P — frozen seafood medley / Québec label-boundary review (round 67)

- **Review and source-access date:** 2026-10-13.
- **Disposition:** Hold a generic frozen seafood-mix identity and any attached form outside the active catalog and research ledger. A Québec Metro listing documents one 360 g Anchor's Bay frozen seafood medley whose listed ingredients include squid, cooked mussel meat, shrimp, and octopus. The English title is `Frozen Seafood Medley`; the French listing calls it `Mélange de fruits de mer surgelés`. CFIA's Canadian fish-product guidance limits the French label `fruits de mer` to a specific all-invertebrate mix and identifies `produits de la mer` / `produits de la pêche` as possible wording when a mix also contains cephalopods or other marine products. The retailer listing is not the package label, so this review does not make a compliance finding. The exact product is out of stock on the listing when reviewed, and no bundled recipe requests it.
- **Scope:** One mixed, frozen retail seafood product and the naming boundary around its contents. This is not a generic seafood, shellfish, fish, cephalopod, soup, prepared-meal, surimi, fish-ball, or species identity.
- **Proposal-only:** This document only. No reference, form, legacy identity, ledger entry, recipe link, checklist item, roadmap item, or application code was changed. No app tests or emulator checks were run.
- **New proposal-local source-ID prefix:** `WP04-SECTIONP-SEAFOOD-MIX-20261013-R67-`. It was checked against proposal, batch, and live-ledger source IDs before drafting.

## Decision

Keep the candidate out of the active catalog. The reviewed Québec retailer listing is concrete enough to establish that a frozen mixed-seafood product has been sold through a Canadian retail channel, but it does not establish one stable product class for recipes. The online English and French titles map to one SKU, yet the ingredient list includes both molluscs and cephalopods. Under CFIA guidance, the French label `fruits de mer` is limited to mixes made entirely of the specified small marine invertebrates with a shell or carapace at harvest; a mix containing squid or octopus could instead use `produits de la mer` or `produits de la pêche`. OQLF likewise describes `fruit de mer` as a marine invertebrate and distinguishes its French scope from the broader English `seafood` category. [S01–S03]

The retailer's French online title is evidence of Québec-facing retail wording, but it does not show the product's principal display panel or prove what is printed on its package. Its ingredients list gives no species, proportions, shell-at-harvest status, origin, or product-specific culinary directions. The listing marks the product out of stock at review time. Do not infer a label violation, routine availability, a stable recipe blend, or a standardized culinary meaning from this page. [S01, S03]

Do not add `Frozen Seafood Medley / Mélange de fruits de mer surgelés` as an active identity, and do not add a generic `seafood mix` reference or frozen form to another seafood identity. A reference using the retailer title would make broad `seafood` and `fruits de mer` queries select this one SKU; using the CFIA-shaped phrase `mélange de produits de la mer` would similarly make the broad `produits de la mer` query select it alone. Those category searches do not specify the Anchor's Bay blend, and current picker search cannot express that ambiguity. No bundled recipe selects this SKU or its contents. [S01–S03]

## Plan and archive check

The active [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4432) leaves preserved fish and seafood product states open. It separately keeps fish powder, fish balls, surimi, and named seafood work open. This packet reviews only one frozen mixed product and its Québec label boundary.

The archive contains general mentions of seafood mixes, not a focused identity decision for the Anchor's Bay SKU or a frozen seafood medley. The [seafood coordinator review](wp04-seafood-coordinator-review-20261009.md) and [mollusk/cephalopod coordinator review](wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md) reuse CFIA's broad category guidance to keep `seafood` separate from `fruits de mer`; the [whelk](wp04-whelk-species-product-boundary-review-20261011.md) and [octopus](wp04-section-p-octopus-identity-gap-sweep-20261012.md) reviews also cite that guidance as a boundary around single ingredients. None decides whether a mixed frozen product has a safe picker identity. Earlier fish-ball, surimi, imitation-seafood, shellfish, and preserved-product decisions remain separate and are not reopened here.

Exact archive searches found no dedicated seafood-medley/frozen-seafood-mix proposal or batch, no review of product `663925101056`, and no previously assigned round-67 source prefix. Earlier references to CFIA's seafood-mix rule are general labeling evidence, not an allocation for this candidate.

## Exact ownership and picker projection

The live snapshot contains **1,389 active ingredient references**, **100 forms**, **63 legacy import identities**, and **1,722 research-ledger records**. The manifest lists **114 recipe files**. Exact normalized-key checks covered reference IDs, English/French names and aliases, form IDs, labels and match terms, legacy identities, and ledger record IDs.

| Candidate phrase or ID | Active reference | Form | Legacy identity | Ledger record |
|---|---|---|---|---|
| `seafood medley`; `frozen seafood medley`; `seafood mix`; `mixed seafood` | None | None | None | None |
| `mélange de fruits de mer`; `mélange de fruits de mer surgelés`; `mélange de produits de la mer`; `mélange de produits de la pêche` | None | None | None | None |
| `Anchor's Bay Frozen Seafood Medley`; `663925101056` | None | None | None | None |
| `ingredient-ref-seafood-medley`; `candidate-seafood-medley` | None | None | None | None |
| `WP04-SECTIONP-SEAFOOD-MIX-20261013-R67-S01`–`S02` | Not applicable | Not applicable | Not applicable | Unallocated; prefix checked |

The ledger and archive do contain CFIA source notes about seafood-mix naming under other candidates. Those source notes do not give a mixed-seafood ingredient identity an owner.

The projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are matched first across reference names, aliases, and attached forms, with substring fallback only if no phrase match exists. It is a static data projection, not a runtime picker test.

| Query | Current result | Conditional result if the retailer's bilingual title were activated | Effect |
|---|---|---|---|
| `frozen seafood medley` | None | Frozen Seafood Medley / Mélange de fruits de mer surgelés | Finds the exact listed product wording. |
| `mélange de fruits de mer surgelés` | None | Frozen Seafood Medley / Mélange de fruits de mer surgelés | Finds the French retailer wording, but also gives broad `fruits de mer` a single product result despite the listed cephalopods. |
| `seafood` | None | Frozen Seafood Medley / Mélange de fruits de mer surgelés | Makes a broad category query select this one SKU. |
| `produits de la mer` | None | None with the retailer title; one result if the display instead uses `mélange de produits de la mer surgelés` | Replacing the retail phrase with CFIA's possible label wording still makes a broad category query select one mix. |
| `fish`; `poisson` | Four references; seven references | Same current results | Neither candidate display contains these terms, so their existing phrase results remain unchanged. |

No alias-free display tested here resolves the product's category scope. Do not use generic `seafood`, `fruits de mer`, or `produits de la mer` as aliases for an individual mix. Do not use `surimi`, fish-ball, crab, shrimp, squid, octopus, or mussel names as aliases either.

## Bundled recipe demand

The live manifest contains **114 recipe files and 1,123 ingredient rows**. Scanning all manifest-listed recipe text and ingredient rows found no mention of the brand, SKU, `frozen seafood medley`, `seafood mix`, or the specific French product name. There are two files with only broad optional seafood wording:

- Recipe **093**, `Fried Rice`, has an unlinked row **093#4**, `Cooked meat or seafood, to taste`, and optional notes about leftover seafood. The row does not identify a frozen mix, product label, component, or species.
- Recipe **097**, `Alfredo Sauce`, says in an optional note that seafood can be an add-in. It does not contain a seafood ingredient row.

These are category-level suggestions, not demand for the Anchor's Bay product or a reusable mix identity. Add no recipe link or relink.

## Numeric and substitution scope

The only numeric product observation is the retailer's **360 g** package size. The page says the product is out of stock, and no serving suggestion or preparation yield is shown. The package weight is not a recipe amount, portion, density, household conversion, drained weight, or yield; do not transfer it to another seafood mix. The CFIA **100%** condition above is a Canadian French labeling boundary, not a recipe measurement.

No reviewed source establishes species composition percentages, an edible yield, raw-to-cooked or frozen-to-thawed loss, density, cup/spoon conversion, count-to-mass mapping, or cooking equivalence for this blend. No source or bundled recipe validates replacing it with a specific fish, shellfish, cephalopod, surimi, fish ball, or prepared seafood product at any ratio. Add no form, density, unit mapping, package yield, conversion, global substitution, contextual substitution, warning, or recipe-line substitution.

## Conditional integration sketch

Reopen only if a bundled recipe names a seafood mix and its exact package or formula can be checked. Before adding any row, establish the package's actual common name and full contents; select French wording that follows the product label and CFIA's seafood-mix boundary; and confirm that picker search can distinguish this mixed product from broad seafood-category queries. If those conditions are met, model only the recipe-selected product boundary with no species inferred and no alias for `seafood`, `fruits de mer`, or individual component species. Add no active form or numeric/conversion behavior without matched recipe/package evidence. Keep substitutions empty unless a recipe-scoped source supports a specific direction, role, and ratio.

## Sources and limits

Sources were reviewed on 2026-10-13. Source IDs are proposal-local except where explicitly marked reused.

| Source ID | Source | Evidence used | Limits |
|---|---|---|---|
| **WP04-SECTIONP-SEAFOOD-MIX-20261013-R67-S01** | Metro, [Anchor's Bay Frozen Seafood Medley, 360 g](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/shrimp-seafood/frozen-seafood-medley/p/663925101056) and [Mélange de fruits de mer surgelés](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/melange-de-fruits-de-mer-surgeles/p/663925101056), product `663925101056`. | Paired Canadian retailer pages name the same 360 g SKU. The English title is `Frozen Seafood Medley`; the French title is `Mélange de fruits de mer surgelés`. The listed ingredients are squid, cooked mussel meat, shrimp, and octopus; the page marks the product out of stock when reviewed. | Retailer catalog copy is time- and location-sensitive and is not a view of the principal display panel. It gives no scientific species, ingredient proportions, origin, or transferable recipe amount, and it does not establish current stock or a regulatory compliance finding. |
| **WP04-SECTIONP-SEAFOOD-MIX-20261013-R67-S02** | Office québécois de la langue française, [fruit de mer (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19052998/fruit-de-mer). | Defines `fruit de mer` as an edible marine invertebrate, notes the term is often used in the plural, and distinguishes the broader English `seafood` category, which includes fish. | Last updated 2014. General Québec terminology, not a product-specific bilingual name or current label assessment. Its notes describe common culinary usage; they do not replace CFIA's labeling guidance. |
| **Existing `WP04-DOYS-S04` (reused)** | Canadian Food Inspection Agency, [Labelling requirements for fish and fish products — seafood mix products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) and [French page](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/poisson). | The guide applies to fish and fish products sold or processed in Canada. It says a mix labelled `fruits de mer` in French must be composed 100% of the specified small edible marine invertebrates and excludes cephalopods; a mix that also includes squid, octopus, cuttlefish, or fish could use `produits de la mer` or `produits de la pêche`. | Date modified 2025-01-15. This is labeling guidance, not a regulator's finding on the Metro listing. No package image or complete label was reviewed, so no violation or final legal label is inferred. |

## Next action

Keep the generic frozen seafood-mix candidate unallocated. The product-specific retailer page supports a current Canadian retail listing but not a reusable ingredient identity, and no bundled recipe specifies the product. Revisit with an exact recipe/package and a picker path that preserves the distinction between a mixed product and broader `seafood` terminology.

## Root integration outcome

Accepted the hold on 2026-10-13. Metro lists one mixed product with squid and octopus under a French
`fruits de mer` title, while CFIA distinguishes that label scope and the broader alternatives; the
product page is not package-label evidence. A generic row would also make broad category searches
resolve to this one mix, and no recipe requests it. No catalog or research-ledger data changed. See
the [integration record](../batches/wp04-section-p-seafood-medley-boundary-hold-integration-20261013/README.md).
No tests were needed for this documentation-only decision.

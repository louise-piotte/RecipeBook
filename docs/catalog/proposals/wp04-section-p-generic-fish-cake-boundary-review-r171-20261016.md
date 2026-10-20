# WP04 Section P R171 — generic fish-cake identity boundary

- **Packet type:** proposal-only product-identity review.
- **Recommendation:** Hold a generic `fish cake` identity outside the active catalog, legacy identities, forms, and research ledger. Keep this review separate from the accepted fish-balls and fish-tofu rows and the held naruto-maki product.
- **Scope:** The broad English culinary/product wording `fish cake` and possible Québec French renderings. This does not decide any one species, recipe, regional cake, croquette, surimi cake, or prepared-food SKU.
- **Date:** 2026-10-16.
- **Source IDs:** New IDs S01–S02 below are proposal-local and unallocated. Existing CFIA and OQLF source IDs are reused as recorded below. No catalog or ledger data is proposed for integration.

## Decision

Keep generic fish cake / fish cakes unallocated until a bundled recipe or exact product request identifies the intended style. Québec evidence uses the English phrase for several seafood preparations: a local fishmonger lists trout, crab, salmon, catfish, and lobster fish cakes; a recent MAPAQ notice uses the label pair `Custard fish cake` / `gâteau poisson` for one recalled shop product. OQLF’s 2022 entry pairs English `fish cake` with `croquette de poisson`, `beignet de poisson`, and `galette de poisson`, but defines that entry as a particular fish, breadcrumb, and egg mixture shaped and fried. These names do not establish one shared formulation or a safe universal French display for every product sold as fish cake. [S01–S04]

Do not add `ingredient-ref-fish-cake`, a ledger candidate, aliases, or an attached form in this review. Do not use `fish cake` as an alias for fish balls, naruto maki, fish tofu, surimi, crab-flavoured pollock flakes, or any species. Keep the open Section P fish-product checklist open.

## Boundary and evidence

| Term/product | Disposition | Evidence and limit |
|---|---|---|
| Generic `fish cake` / `fish cakes` | Hold unallocated. | Current Québec merchant usage spans fish cakes named for different fish or shellfish. This does not show that those products share a preparation, recipe role, or bilingual name. [S02] |
| `croquette de poisson`, `beignet de poisson`, `galette de poisson` | Do not apply as universal aliases. | OQLF lists these as preferred French terms for its defined fish-cake/croquette preparation. The entry specifies a mixture of flaked fish, breadcrumbs, and egg, sometimes potato, shaped and fried; it does not standardize every formed seafood cake. [reused S04] |
| `Custard fish cake` / `gâteau poisson` | Keep as the exact wording of the MAPAQ notice’s recalled product only. | MAPAQ’s notice identifies one unitary product sold at one Longueuil shop. It is not a generic bilingual terminology ruling. Its label wording does not support adding `gâteau poisson` to another product or category. [S01] |
| Naruto maki / kamaboko | Keep the prior product-specific hold. | The prior review covers the steamed red-swirl fish-paste product and found a singleton-risk for broad `fish cake` and `maki` searches. This review does not reopen that product or turn it into a generic identity. [prior R38 review] |
| Fish balls / fish tofu | Keep their existing separate identities. | The active references are `ingredient-ref-fish-balls` and `ingredient-ref-fish-tofu`. The current evidence does not make round fish balls or fish tofu aliases, forms, or equivalents of cakes/croquettes. [S03–S04] |
| Surimi-based cakes and imitation seafood | Keep product-qualified wording separate. | CFIA says surimi products without a prescribed common name must use the generally known name with appropriate descriptors; imitation products must be made clear. A shared fish-paste base does not make distinct finished foods equivalent. [reused S03] |

CFIA’s current labeling guidance says that where no prescribed common name applies, a fish product must use the name by which it is generally known or a non-generic name describing it. Its surimi section specifically recommends suitable product descriptors and distinguishing imitations. The guidance supports keeping specific finished-product names precise; it does not establish `fish cake` as a single recipe identity. [reused S03]

## Live ownership and picker projection

The current active references, forms, legacy candidates, research ledger, source URLs, and Section P proposal/archive were checked on 2026-10-16. Search-key normalization follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD and accent folding, `œ`/`æ`/`ß` folding, punctuation-to-space, and collapsed whitespace. Search returns complete normalized word-phrase matches first and uses substring matching only when no phrase result exists.

| Normalized key | Live exact owner | Result |
|---|---|---|
| `fish cake`, `fish cakes`, `fishcake`, `fishcakes` | None | No exact active reference, form label/match term, legacy candidate, or ledger record ID. |
| `croquette de poisson`, `beignet de poisson`, `galette de poisson`, `gâteau de poisson`, `gâteau poisson` | None | No exact active reference, form label/match term, legacy candidate, or ledger record ID. MAPAQ’s one-SKU wording is source evidence, not an allocated key. |
| `fish ball`, `fish balls`, `boulette de poisson`, `boulettes de poisson` | `ingredient-ref-fish-balls` | Existing fish-balls reference and its singular aliases remain unchanged. |
| `fish tofu`, `tofu au poisson` | `ingredient-ref-fish-tofu` | Existing fish-tofu reference remains unchanged. |
| `naruto maki`, `kamaboko` | No active owner | The prior naruto-maki review remains a hold; no new decision is made for that product. |
| Proposed key `ingredient-ref-fish-cake` | Unallocated | This review recommends no active reference or proposal-local record ID. |

No fish-cake form is attached to any active reference. Nearby ledger records mention fish cakes as a distinct neighboring product, but none is a fish-cake identity or exact-key allocation. No legacy candidate owns a fish-cake term. The live owner for `fish ball` is not an owner for `fish cake`.

The static picker projection against the live 1,547 references and 119 forms returns:

| Query | Current result | Hypothetical broad row | Decision |
|---|---|---|---|
| `fish cake`, `fish cakes` | None | A row using those terms would be the sole result. | Do not create a singleton for a phrase used across distinct product styles. |
| `croquette de poisson`, `galette de poisson`, `beignet de poisson` | None | A row using OQLF’s defined set would be the sole result. | Keep the terms scoped to the OQLF-described preparation unless a recipe selects it. |
| `fish` | Five rows: Bonga powder, fish balls, fish sauce, fish stock, fish tofu | Six, adding the hypothetical fish-cake row | This would add a broad formed-food result without recipe demand. |
| `poisson` | Eight rows, including fish balls, fish tofu, fish sauces/pastes, and Bonga powder | Nine, adding the hypothetical row | A broad French search would gain another general result. |
| `fish ball`, `fish balls` | `ingredient-ref-fish-balls` | Unchanged if no fish-ball alias is added | Preserve the current formed-ball identity. |

The hypothetical projection is only an impact check; it is not a recommendation to create that row. The current picker does not return a fish-cake result for these terms.

## Bundled recipe demand

Every recipe listed in the live manifest was scanned: **114 recipe files and 1,123 ingredient rows**. Ingredient names, original ingredient text, reference/form IDs, localized ingredient fields, and all parsed recipe text were checked for `fish cake(s)`, `fishcake(s)`, `croquette de poisson`, `galette de poisson`, `beignet de poisson`, `gâteau poisson`, `gâteau de poisson`, `custard fish cake`, `naruto maki`, `kamaboko`, surimi cakes, and fish-ball wording. There were **zero matching ingredient rows and zero matching recipe files**. No recipe link, line-level model, preparation state, form, amount, or substitution can be inferred.

## Numeric, form, and substitution assessment

- **Forms:** Add none. The reviewed market examples differ by species and preparation, while the exact product state in any future recipe is unknown.
- **Measurements and conversions:** The recipe corpus supplies no fish-cake amount. MAPAQ gives a unitary pack description for its recalled SKU; local retailer package sizes, piece counts, or serving information would remain source-specific. No density, count-to-mass mapping, mass/volume conversion, edible yield, or cooking yield is supported.
- **Substitution:** No directed or contextual substitution is supported between fish cakes and fish balls, fish tofu, naruto maki, surimi products, fish fillets, crab products, or species-specific cakes. Shared fish content, shape, or merchandising category does not establish a recipe-tested ratio or equivalent cooking result.
- **Recipe links:** None. The 114-file corpus has no matching candidate line.

## Source ownership register

New IDs below were checked against the live ledger’s source IDs and URLs and the existing proposal/batch archive. They are unallocated because this packet recommends a hold. Previously recorded sources are explicitly reused instead of assigning duplicate IDs.

| Source ID | Source and URL | Evidence used and limit |
|---|---|---|
| **WP04-FISH-CAKE-R171-20261016-S01** *(proposal-local)* | MAPAQ via CNW, [Mise en garde — custard fish cake, Longueuil](https://www.newswire.ca/fr/news-releases/mise-en-garde-a-la-population-presence-non-declaree-de-ble-et-de-soya-dans-du-gateau-vendu-par-l-entreprise-marche-bento-kim-longueuil-812947230.html), 2026-10-01, notice reference 5804. | The ministry notice names one product `Custard fish cake` and gives the French label wording `gâteau poisson`; it reports a unitary pack sold only at Marché Bento Kim Longueuil. Used as a product-specific wording example, not as a generic fish-cake definition, translation ruling, or current availability claim. |
| **WP04-FISH-CAKE-R171-20261016-S02** *(proposal-local)* | Poissonnerie Du Cree, [Nos produits](https://www.poissonnerieducreek.com/nos-produits), current product-list page, lines 58–91. | The Québec fishmonger lists prepared `Fish cake` products for trout, crab, salmon, barbue, and lobster. Supports local use of a shared market phrase across differently qualified products; it does not provide recipes, exact formulas, package quantities, or a standardized French name. |
| **WP04-FBSUR-20261011-S12** *(reused from archived proposal; not a live-ledger allocation)* | OQLF, [croquette de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488990/croquette-de-poisson), updated 2022. | The GDT defines the specific fish/breadcrumb/egg preparation, lists `croquette de poisson`, `beignet de poisson`, and `galette de poisson` as preferred terms, and maps English `fish cake` / `fish croquette`. This source ID already appears for this exact URL in earlier fish-ball proposals; it is reused, not reallocated. |
| **WP04-FBSUR-20261011-S13** *(reused from live ledger)* | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), sections “Common name” and “Surimi.” | Existing live ledger source ID and exact URL. Current CFIA guidance explains when generally known or descriptive common names are needed for fish products and gives examples of appropriate descriptors for surimi-based products and imitations. It does not declare a universal fish-cake identity. |

The new R171 source-ID prefix was absent from the live ledger and archived proposal/batch files. The exact S01 and S02 URLs had no existing live ledger source owner at review time. The OQLF source ID and URL were verified against the earlier fish-ball proposal; the CFIA ID and URL were verified against the live ledger. No source record or URL has been added to shared data.

## Related decisions

- [Section P fish-balls/surimi boundary review](wp04-fish-balls-surimi-product-boundary-review-20261011.md) separates fish balls from cakes/croquettes and leaves generic surimi unresolved.
- [Fish-balls current-source reassessment](wp04-fish-balls-surimi-current-source-reassessment-20261011.md) retains the distinction and names cake/croquette products separately.
- [Naruto-maki product-boundary review](wp04-section-p-naruto-maki-product-boundary-review-20261013-round38.md) holds that exact steamed fish-paste product and records its broad `fish cake` search collision. R171 reviews the still-unresolved generic term only; it does not reopen that decision.
- [Active WP04 Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6041) remains open.

**Final recommendation: hold generic fish cake / fish cakes without catalog or ledger changes. Reopen only when a bundled recipe or exact product request supplies the intended style and enough context to choose a precise Québec French display.**

# WP04 Section P R683 — Atlantic cod fillet form boundary review

- **Review date:** 2026-10-18.
- **Plan anchor:** [WP04 Section P finfish item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6714).
- **Status:** Proposal-only review; no shared catalog, ledger, plan, workflow, or roadmap data changed.
- **Recommendation:** Hold a species-specific Atlantic-cod fillet form outside active data. Current product evidence supports the cut and Québec-facing French wording, but a single Atlantic form would make broad `fillet` and `cod fillet` searches return Atlantic cod alone. Revisit with paired Pacific-cod fillet evidence or picker behavior that preserves generic cut searches.

## Scope and prior-work check

This review covers one product/form gap under the still-open Section P finfish checklist: fillets sold as Atlantic cod, considered as a form beneath the existing Atlantic-cod identity. It does not add a species identity, assign a product state not stated for the SKU, or reopen the Pacific-cod identity. The existing grouper market-group boundary remains unchanged.

The archive contains no focused Atlantic-cod fillet-form review. Related decisions remain distinct: R560 integrated paired Atlantic- and Pacific-cod **loin** forms; R565 held an Atlantic-cod **centre-cut** form because `centre` and `coupe` would suppress broader picker results without paired Pacific evidence. Haddock-loin, cod-cheek, and cod-tongue reviews concern other cuts. The proposed form ID `ingredient-form-atlantic-cod-fillet` and R683 source-ID prefix were checked and are unallocated; the proposal filename was also free.

## Current catalog, ledger, and source ownership

The current snapshot has 1,838 references, 169 forms, and 2,216 research-ledger records. Relevant active rows are:

| Owner | Current state | Boundary |
|---|---|---|
| `ingredient-ref-atlantic-cod` | `Atlantic cod / morue de l’Atlantique`; no aliases; identity verified; parent measurement and substitution research remain `not_yet_researched`. | Keep its species identity and parent research states unchanged. |
| `ingredient-form-atlantic-cod-loin` | `Atlantic cod loin / longe de morue de l’Atlantique`; cut-specific measurement and substitution findings. | A loin is not a fillet; do not transfer its evidence or findings. |
| `ingredient-ref-pacific-cod` and `ingredient-form-pacific-cod-loin` | Separate Pacific-cod identity and loin form. | Do not assign an Atlantic-only form to generic cod fillets. |

No active reference, alias, form, or legacy identity owns the exact proposed Atlantic-cod fillet terms. The new High Liner and Pearlmark product URLs below have no existing ledger URL owner. Reuse the existing identity sources only for parent naming: OQLF source ID `WP04-FINFISH-ID-20261009-S02` is owned by `ingredient-ref-atlantic-cod` and `ingredient-form-atlantic-cod-loin`; CFIA source ID `WP04-FINFISH-ID-20261009-S07` has the same two exact owner rows. Neither source establishes a fillet measurement. Do not create duplicate ledger source entries for those URLs.

| Proposal-local source ID | Source and evidence | Limit |
|---|---|---|
| `WP04-SECTIONP-ATLANTIC-COD-FILLET-R683-20261018-S01` | High Liner Foodservice Canada, [Atlantic Cod Fillets, product 4826](https://www.highlinerfoodservice.com/en-CA/products/atlantic/d8cb1b5c-8165-487d-b30e-b77f7597c3e6/high-liner-foodservice-signature-3-x-68-kg-15-lb-2041-kg-45-lb-atlantic-cod-fillets-227-454-g-8-16-oz). The current product page title identifies Atlantic Cod Fillets and gives product code 4826, GTIN 10061763048262, 227–454 g / 8–16 oz fillets, and a 20.41 kg / 45 lb case configuration. Its ingredient declaration says `COD FISH FILLETS`. | One manufacturer SKU. The page description refers to “Atlantic Cod Loins,” inconsistent with the product title and ingredient declaration; rely on the named SKU and declaration for the product boundary, not that copied description. Do not infer that this SKU is frozen. |
| `WP04-SECTIONP-ATLANTIC-COD-FILLET-R683-20261018-S02` | High Liner, [French-language route for the same product UUID](https://www.highlinerfoodservice.com/fr/products/atlantic/d8cb1b5c-8165-487d-b30e-b77f7597c3e6/high-liner-foodservice-signature-3-x-68-kg-15-lb-2041-kg-45-lb-atlantic-cod-fillets-227-454-g-8-16-oz). The indexed French title uses `Filets de morue de l’Atlantique` and code 4826. | Same UUID, code, and SKU as S01; the language routes are paired views, not independent product or amount evidence. The French route was indexed but returned a cache miss on direct open. |
| `WP04-SECTIONP-ATLANTIC-COD-FILLET-R683-20261018-S03` | Aliments Pearlmark, [Morue de l’Atlantique](https://www.pearlmarkfoods.com/fr/nos-produits/morue-de-latlantique). The Québec-facing French page identifies *Gadus morhua*, lists service coverage including Québec, and describes three Iceland-origin SKUs as `Filets de morue surgelés séparément en mer`: 5–8 oz in a 3 × 20 lb case, and 8–16 oz in 1 × 10 lb and 2 × 20 lb cases. | The heading supplies the species context for these listings. Each size, origin, frozen state, and pack belongs to its listed SKU; none is a reusable portion or fillet standard. |
| `WP04-SECTIONP-ATLANTIC-COD-FILLET-R683-20261018-S04` | High Liner, [2026 French foodservice product guide](https://assets.contentstack.io/v3/assets/blt4f0d20e0e71d660d/blt1a9263728c7bbcce/6966cffe149b23000862408d/HL-ProductGuide-2026-CAN-FR-FF_%282%29.pdf). It lists `Filets de morue de l’Atlantique, surgelés individuellement`, product 3486, 6–8 oz, 10 lb. | A second SKU, not code 4826. Use it to corroborate Québec-facing French wording and the existence of a frozen product; do not pool its size or pack facts with S01/S02. |

The OQLF GDT entry [morue de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573546/morue-de-latlantique) identifies the Québec French species name, English `Atlantic Cod`, and *Gadus morhua*. CFIA’s existing [Cod Fish List query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Cod) gives the accepted Canadian naming context. Keep `morue de l’Atlantique` in the form label; do not add broader `morue`, `cod`, or France-oriented `cabillaud` aliases to the form.

## Recipe demand

I parsed every manifest-listed recipe: **114 recipe files and 1,123 ingredient rows**. The full-file and ingredient-row scan found zero matches for Atlantic/Pacific cod fillets, `cod fillet`, `filet(s) de morue`, or *Gadus morhua*. No recipe line, amount, method, or substitution can be linked to this product form. The manifest SHA-256 is `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; the manifest-ordered recipe-content digest is `0c7d87b2072bc9f3b00d613618792ad773f8b7f63b5b00d339d2e6f1ac31f669`.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases win over substring fallback, and a form match returns its parent reference. The hypothetical form uses the singular labels `Atlantic cod fillet / filet de morue de l’Atlantique`, with no extra aliases or match terms.

| Query | Current results | With hypothetical form | Effect |
|---|---|---|---|
| `Atlantic cod fillet`; `filet de morue de l’Atlantique` | None | Atlantic cod only | Qualified searches find the form and may show its exact-label form hint. |
| `cod fillet`; `filet de morue` | None | Atlantic cod only | Unqualified cut phrases appear to select one species, despite the separate Pacific-cod identity. |
| `fillet` | Seven substring results: anchovy fillets in oil, herring fillets in tomato sauce, Pangasius, salmon fillets, smoked herring fillets in oil, smoked sardine fillets, and tilapia fillets. | Atlantic cod only | The exact singular term moves into the phrase-first tier and suppresses all seven current results. |
| `filet` | Salmon fillets; tilapia fillets | Atlantic cod; salmon fillets; tilapia fillets | Adds one choice while retaining current phrase matches. |
| `fillets`; `filets` | Seven results each, including the same plural fish-fillets rows above. | Unchanged with singular labels | If plural source wording were added for discovery, these lists would each gain Atlantic cod; `cod fillets` and `filets de morue` would then be Atlantic-cod-only. |
| `cod`; `morue` | Seven results each, including Atlantic and Pacific cod, Arctic cod, salt cod, smoked cod, canned cod liver, and sablefish. | Unchanged | Broad species/product queries remain multi-result. |

This is an exact picker consequence of adding one form label, not just a theoretical concern: the generic singular English query would lose seven choices. A future paired Pacific-cod fillet form could preserve the generic `cod fillet` and `filet de morue` scope, but bare `fillet`/`filet` still needs projection review.

## Measurements, conversions, and substitutions

The sources list SKU-specific fillet-weight ranges and case amounts, not a standard mass per fillet, count per package, edible yield, or cooked yield. Pearlmark and High Liner list different ranges and case configurations. Add no density, unit mapping, reusable measure, package yield, or lb↔g conversion. No reviewed product source or recipe establishes a directed substitution between an Atlantic-cod fillet, Pacific-cod fillet, cod loin, haddock, or another fish at a specified amount and method. Keep the Atlantic-cod parent and loin-form research states unchanged; add no conversion, substitution rule, warning, or recipe-line link.

## Bounded recommendation

Keep the proposed `ingredient-form-atlantic-cod-fillet` outside active forms and the research ledger for now. Keep the product observations proposal-local, without allocating aliases or recipe links. Reopen only with a paired Pacific-cod fillet review or a picker change that prevents the generic `fillet` and `cod fillet` singleton effects. This proposal does not change the active grouper market group or any other shared source files.

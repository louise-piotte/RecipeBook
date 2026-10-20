# WP04 Section P R574 — Alaska pollock frozen-fillet hold

Date: 2026-10-17

## Decision

Keep the proposed frozen Alaska pollock fillet form outside active catalog data. Metro's English and French listings identify one product, item 226631, as frozen Alaska pollock fillets / filets de goberge de l'Alaska surgelés. The indexed snapshots give one tray and about 300 g average; direct product-page opens returned 403, so the evidence remains an indexed retail snapshot and does not establish current inventory beyond its selected-store notice.

The proposed labels create unsafe singleton searches under the current phrase-first picker: `pollock fillet`, `pollock fillets`, and `filets de goberge` would each return Alaska pollock alone. CFIA lists `Pollock` for both *Gadus chalcogrammus* and *Pollachius virens*, and current Québec retail evidence uses `Filets de goberge Atlantique frais` for the latter product group. Keep the generic query ambiguity visible until picker behavior can preserve the species distinction. The 300 g tray estimate remains SKU-specific and is not a per-fillet amount.

No matching bundled recipe demand was found. The proposed form ID and R574 source IDs remain in the proposal only. No active form, reference, alias, ledger record, measure, recipe link, conversion, yield, or substitution was added. Existing Alaska and Atlantic pollock identities remain unchanged.

## Sources

- [Metro, Frozen Alaska Pollock Fillets, item 226631](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-alaska-pollock-fillets/p/226631) and [French listing](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/filets-de-goberge-de-l-alaska-surgeles/p/226631): paired product title, taxon, and SKU-level tray estimate in indexed snapshots.
- [Supermarché PA fish department](https://www.supermarchepa.com/collections/all/fish-department?page=2&view=fr): current indexed wording `Filets de goberge Atlantique frais`, with listing-specific approximate package weight.
- [CFIA Fish List pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock): English `Pollock` is listed for Alaska and Atlantic pollock taxa.
- [OQLF, goberge de l'Alaska](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199004/goberge-de-lalaska): Québec French species name and English equivalents.
- [Sea Star Seafoods, Atlantic Pollock Fillets](https://seastarseafoods.com/?page_id=27): names *Pollachius virens* and distinguishes Alaska pollock.

## Files updated

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R574 proposal status and this integration README

## Verification

- Reproduced the phrase-first picker projection from `IngredientSearch.kt`; the generic phrase collisions and safe multi-result broad queries are documented in the proposal.
- Confirmed no candidate-specific recipe demand across the 114 manifest-listed recipes and 1,123 ingredient rows.
- UTF-8/no-BOM, local-link, final-newline, and scoped whitespace checks passed.
- No software tests, app build, emulator run, or deployment were needed for this documentation-only hold under `AGENTS.md`.

WP04 Section P remains open. See the [R574 proposal](../../proposals/wp04-section-p-next-gap-review-r574-20261017.md).

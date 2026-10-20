# WP02 follow-up: Québec name and boundary for extracted taro-corm starch

- **Reviewed/accessed:** 2026-10-10
- **Status:** Reviewed; the coordinator updated focused plan and roadmap tracking. The candidate remains unresolved, with no active reference, alias, recipe link, numeric data, or ledger change.
- **Scope:** Recheck the open request for an exact Québec French product name for starch extracted from *Colocasia esculenta* corms. This supplements, but does not replace, [`wp02-taro-corm-starch-boundary-review-20261010.md`](wp02-taro-corm-starch-boundary-review-20261010.md) and the earlier terminology recheck in [`wp02-b2-b3-next-residual-20261010.md`](wp02-b2-b3-next-residual-20261010.md).
- **Proposal-local source IDs:** `WP02-TARO-STARCH-QC-20261010-S01`–`S06`; checked against `docs/` and `app/` before use. These IDs are not research-ledger entries.

## Recommendation

**Keep the candidate unresolved and do not create a reference or alias.** The search confirms that French `amidon de taro à usage alimentaire` appears in an official OAPI trademark bulletin’s Nice class 30 goods description. That is a useful French-language commercial classification phrase, but it does not establish Québec usage or a Canadian food-product label. OQLF supplies the local plant name `taro` and a general distinction between `amidon` and context-specific `fécule`; neither entry names extracted taro starch. The exact Québec product name remains unsupported.

Retain `taro starch` as a source-attested English working name and keep `fécule de taro` as an unapproved descriptive construction. Do not choose between `fécule de taro` and `amidon de taro` as the fr-CA display, and do not activate either as an alias. Reopen only if an exact Québec/Canadian source identifies the isolated food starch product in French.

## Product boundary

The candidate means the separated starch fraction recovered from *C. esculenta* corms. Primary research treats taro flour and taro starch as separate products, while describing extraction as separating and washing starch granules from corm tissue. The starch source matters: the term `taro` is used inconsistently across aroids, and research documents starch extraction from distinct genera including *Colocasia*, *Xanthosoma*, *Alocasia*, and *Amorphophallus*. Therefore:

- Keep extracted *C. esculenta* corm starch distinct from active `ingredient-ref-taro` (fresh taro) and `ingredient-ref-taro-flour` (whole-corm flour). Do not merge them or treat starch as a form of the flour.
- Keep `ingredient-ref-malanga` separate. Do not generalize this candidate to cocoyam, malanga, dasheen, eddoe, amadumbe, or another aroid starch without a source that identifies the exact botanical input and product.
- Exclude whole-corm flour, unspecific taro/cocoyam powder, flavored or instant taro beverage powders, and starch from other taxa. Do not use bare `arrowroot` wording: the active arrow-root identity already has its own extracted-starch boundary.
- Add no form, density, unit mapping, conversion, yield, recipe link, or substitution. The current ledger candidate already records no supported measurement value and no supported substitute; no recipe demand was found.

## Québec/Canadian French evidence

| Source | What it establishes | Limit |
|---|---|---|
| OQLF, [`taro` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro) [S01] | The 1995 entry lists French `taro`, `colocase`, and `colocasie`, English `dasheen`, `taro`, and `old coco-yam`, and Latin *Colocasia esculenta*. | Plant/food terminology only; it does not name flour or isolated starch. |
| OQLF, [`amidon` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon) [S02] | Updated in 2026; gives `amidon` as the preferred general term and `fécule` as context-specific for starch in tubers or other underground plant organs. | Supports a linguistic inference for `fécule de taro`, not an attested product phrase or fr-CA label. |
| OAPI, [Bulletin officiel BOPI 13MQ/2025](https://oapi.int/wp-content/uploads/2025/07/BOPI_13MQ2025.pdf), p. 118 [S03] | A class 30 goods description includes `amidon de taro à usage alimentaire` and separately lists taro powder and taro flour terms. This confirms that the French phrase exists in a contemporary official commercial classification. | OAPI is regional to member states of the Bangui Agreement. A trademark goods list is not Québec terminology, Canadian labeling, or evidence that the described commercial item is *C. esculenta*. It does not close the local naming question. |
| Boahemaa et al., [“Physico-chemical and functional characterization of flour and starch of taro (*Colocasia esculenta*) for food applications”](https://doi.org/10.1016/j.foohum.2024.100245) [S04] | Primary study evaluates taro flour and starch as distinct products from two *C. esculenta* varieties. | Product identity evidence only; study properties do not establish a Québec name, kitchen measure, or substitution. The publisher abstract was accessible in search results; direct page access returned 403. |
| Karmakar, Chakraborty, and Roy, [“Assessment of yield and characterization of starch extracted using different methods from the corms of some aroids”](https://doi.org/10.1007/s44187-025-00588-z) [S05] | Open 2025 primary study names *Colocasia esculenta*, *Xanthosoma* sp., *Alocasia*, and *Amorphophallus* samples; describes filtering, washing, settling, and drying extracted starch separately from corm tissue. | Supports a narrow source boundary, not common-name equivalence or a Québec retail specification. |
| TERMIUM Plus, [French search for starch/potato terminology](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=STARCH+POTATO) [S06] | Targeted indexing searches did not surface an exact taro-starch term. | The direct query could not be fetched in this review (cache miss); no claim is made that TERMIUM has no such entry. |

Searches for `taro starch`, `fécule de taro`, `amidon de taro`, `colocase starch`, and `colocasie starch` did not surface a current Québec terminology entry or an exact Québec/Canadian food label for isolated taro-corm starch. Search results included machine-translation/example pages with the phrase `fécule de taro`, but without an authoritative Québec source or a traceable original product label; those pages are not naming evidence. This is a bounded search result, not proof that no such product is sold.

## Live package, ledger, and recipe check

Read-only snapshot of the live worktree on 2026-10-10:

| Surface | Current state | Decision implication |
|---|---|---|
| Active references (862 total) | `ingredient-ref-taro` = `taro / taro`; `ingredient-ref-taro-flour` = `taro flour / farine de taro`; `ingredient-ref-taro-leaves` = `taro leaves / feuilles de taro` (EN alias `luau leaves`); `ingredient-ref-malanga` = `malanga / malanga`; `ingredient-ref-arrowroot` has EN alias `arrowroot starch` and FR alias `fécule d'arrow-root`. No active reference owns `taro starch`, `fécule de taro`, or `amidon de taro`. | Keep fresh corm, whole-corm flour, leaves, malanga, arrow-root starch, and any future source-qualified taro starch distinct. No exact alias collision was found. |
| Ingredient forms (47 total) and legacy candidates (78 total) | No taro-starch label, match term, or exact candidate name/alias was found. | No form or legacy identity to promote. |
| Research ledger (1,107 records) | `candidate-taro-corm-starch` exists with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Its unresolved decision already says not to activate a reference until Québec/Canadian French naming is reviewed. No `ingredient-ref-taro-starch` record exists. | Preserve this unresolved candidate; the possible future reference ID is not active or reserved. |
| Bundled recipe manifest | 114 recipes / 1,123 ingredient rows; zero ingredient-line matches for taro-starch phrases or source variants, including `taro starch`, `taro corm starch`, `Colocasia esculenta starch`, `cocoyam starch`, `dasheen starch`, `fécule de taro`, and `amidon de taro`. | No current recipe demand, line link, or substitution supports integration. |

The active plan keeps the B4/B9 boundary hold at lines 1172–1176; line 5347 and the dated follow-up at line 5441 both leave exact Québec naming open. This proposal provides no basis to close those checklist items.

## Merge-ready disposition outline

If a future reviewer finds an exact Québec product source, review only that evidence before proposing integration. The eventual reference, if accepted, should be a separate `FLOUR_AND_STARCH` identity for the source-defined extracted product; the English working name may remain `taro starch`. Do not assign the fr-CA display or add aliases until the local product wording is confirmed. Keep alias, form, density, unit mapping, conversion, yield, and substitution arrays empty absent new evidence, and make no recipe links without a matching line. For this review, leave the ledger candidate unresolved and all catalog, recipe, numeric, and ledger data unchanged.

## Source access notes

All sources above were accessed on 2026-10-10. OQLF pages and the OAPI PDF opened directly; the Springer article was accessible in full text. The ScienceDirect publisher page for S04 returned 403, so its abstract was available only through the indexed result. The TERMIUM direct search returned a cache miss. No direct Québec or Canadian label for extracted taro starch was located. Web searches are not exhaustive.

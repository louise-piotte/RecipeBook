# WP06 R687 — wattleseed species and picker-boundary review

- **Date:** 2026-10-18
- **Status:** Integrated documentation-only hold. The existing wattleseed candidate remains unresolved and unchanged.
- **Plan anchor:** The open WP06 Australia, Aotearoa/New Zealand, Pacific, and regionally specific Indigenous-ingredient line at `docs/RecipeBook-global-ingredient-catalog-plan.txt:10434`.
- **Target:** The existing ledger-only `candidate-wattleseed`, specifically whether current evidence supports a bounded identity or form.

## Recommendation

Keep `candidate-wattleseed` unresolved. Do not add an active species-free wattleseed row, a separate *Acacia victoriae* row, a form, or aliases in this review.

Current producer pages support a concrete product: roasted and ground seeds identified as *Acacia victoriae*. Two suppliers label that taxon for their product. That evidence is enough to distinguish those SKUs, but it does not resolve the wider source name `wattleseed`. A 2021 Australian government-hosted industry risk plan reports that about 57 *Acacia* species are used for human food; the Australian Pesticides and Veterinary Medicines Authority’s current spice-commodity entry lists “Wattle seed” as *Acacia victoriae* “and other spp.” The named species is therefore one product within a broader source-named food group.

The current picker has no result for `wattleseed`. If an *A. victoriae* row displayed or aliased `wattleseed`, the bare query would become a singleton and narrow that broader term to one species. A species qualifier in the display would not change that behavior. Keep the candidate held until the catalog owner chooses a representation that preserves the trade term’s multi-species scope, or a source establishes that the intended product name is species-specific.

## Naming and Québec evidence

Targeted exact-term searches in the [OQLF Grand dictionnaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/) and [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?lang=fra) for `wattleseed` and `wattle seed` did not locate a verifiable Québec-preferred product term. Broader searches for French acacia-seed wording found a French-language product page on Copius.fr that uses `graines d’acacia (Wattleseed)` for an *A. victoriae* item. That is useful French-market terminology evidence, but it does not establish a Québec display or a Québec synonym for all *Acacia* seeds. A Canadian retailer’s current product page uses only the English name `Wattleseed`; the retailer is based in Calgary, the listing is out of stock, and it is not a Québec product label.

If reopened, retain `wattleseed` as a borrowed source name in French unless Québec product or terminology evidence supports another display. Do not adopt unqualified `graine(s) d’acacia` as an alias: it is broader than this culinary product and could point to other *Acacia* products. Keep botanical names as research evidence, not global aliases.

## Ownership and picker audit

Read-only audit covered the ingredient references and forms, legacy import identities, research ledger, prior WP06 proposals and integration README, and the current picker implementation in `IngredientSearch.kt`. Counts below are the R687 review snapshot before R686 was integrated.

| Artifact | R687 review snapshot and result |
|---|---|
| Active references / forms | 1,838 references / 169 forms. No exact display, alias, form label, or form match term for `wattleseed`, `wattle seed`, *Acacia victoriae*, or the French product wording. |
| Legacy candidates | 56 candidates; no exact matching candidate. |
| Research ledger | 2,216 records, including the existing unresolved `candidate-wattleseed`; its existing source IDs and URL ownership remain unchanged. |
| Exact neighboring owner | `ingredient-ref-acacia-gum` owns the current `acacia` query. Acacia gum is not an edible seed or a wattleseed synonym. |
| Picker projection | `wattleseed`, `wattle seed`, *Acacia victoriae*, and `graines d’acacia` currently return 0 active references. `acacia` currently returns only `ingredient-ref-acacia-gum`. A proposed row containing `wattleseed` would make that broad query return one *A. victoriae* item; adding the genus to its display would also make the generic `acacia` query include that item. |
| Forms and numeric behavior | No form can be assigned without an identity decision. The current products establish roasted/ground processing for named SKUs, not a general form taxonomy, household measure, density, unit mapping, conversion, yield, or substitution. |

No new reference ID is proposed. The existing candidate remains the sole ledger owner; this integration does not replace it or create a second candidate. See the [R686–R687 integration README](../batches/wp04-wp06-r686-r687-review-integration-20261018/README.md).

## Recipe-demand audit

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `wattleseed`, `wattle seed`, `wattle-seed`, *Acacia victoriae*, acacia-seed wording, and the relevant French descriptions. There were **zero full-file matches and zero ingredient-row matches**. The corpus totals 754,048 bytes; the manifest-ordered fingerprint (relative path, NUL, exact bytes, NUL per recipe) is `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362`. No recipe link or measurement/conversion/substitution demand is supported.

## Source-ID and URL ownership

The R687 proposal path, the `WP06-WATTLESEED-R687-20261018-S` prefix, and source IDs S01–S07 were absent from the proposal archive and live ledger before drafting. All seven new URLs below were unowned in the ledger and archive. The full live ledger audit found no source ID assigned to multiple URLs. Earlier WP06 source/decision pairs remain under their original IDs and are reused in the existing `candidate-wattleseed` record; no duplicate ID or URL is proposed.

| ID | Source and locator | Bounded claim and limit |
|---|---|---|
| `WP06-WATTLESEED-R687-20261018-S01` | Plant Health Australia Ltd, [Environmental Risk Mitigation Plan for Australian Acacia Species (v1.1, 2021)](https://www.agriculture.gov.au/sites/default/files/documents/environmental-risk-mitigation-plan-acacia.pdf), pp. 10–11, “Wattleseed industry.” | Government-funded industry risk plan reports roasted/ground culinary use and about 57 *Acacia* species used for human consumption. It is not a food identity standard or current retail label. |
| `WP06-WATTLESEED-R687-20261018-S02` | Australian Pesticides and Veterinary Medicines Authority, [Spices crop group](https://www.apvma.gov.au/crop-groups/spices), subgroup 028A, HS 3287. | Current commodity table names “Wattle seed” and lists *Acacia victoriae* “and other spp.” It is crop-group metadata, not a complete ingredient taxonomy. |
| `WP06-WATTLESEED-R687-20261018-S03` | Naturally Native, [Wattleseed (victoriae)](https://naturallynative.au/products/wattleseed), current product page. | In-stock product title and description specify 100% *A. victoriae*, roasted and ground, for culinary use. Supplier-specific product evidence only. |
| `WP06-WATTLESEED-R687-20261018-S04` | Natif Foods, [Roasted Wattleseed Grind](https://natif.com.au/products/a-wild-harvested-wattleseed-grind), current product page. | Product title, ingredient statement, and species identify roasted, finely ground *A. victoriae*. Supplier-specific evidence, not a definition for every wattleseed product. |
| `WP06-WATTLESEED-R687-20261018-S05` | The Spice Merchant, [Wattleseed](https://www.thespicemerchant.ca/product-page/wattleseed), current Canadian product page. | Uses the product title `Wattleseed` and describes a dried, roasted, crushed food ingredient. The page says the item is out of stock and does not specify its species. |
| `WP06-WATTLESEED-R687-20261018-S06` | The Spice Merchant, [About Us](https://www.thespicemerchant.ca/aboutus). | Gives the shop address in Calgary, Alberta; it does not provide a Québec French product label. |
| `WP06-WATTLESEED-R687-20261018-S07` | Copius, [Graines d’acacia (Wattleseed)](https://copius.fr/fr/i/wattleseed/), French product page. | French-language market wording for an *A. victoriae* product; this is not Québec terminology evidence. |

The prior WP06 Oceania baking and pantry sweeps documented the candidate, source-language name, historical species boundary, and absence of Québec terminology. R687 adds current, species-labelled supplier examples and a Canadian English listing. Those sources still do not make the bare picker term species-safe. No software tests or builds were run; this is a documentation-only hold with no database change.

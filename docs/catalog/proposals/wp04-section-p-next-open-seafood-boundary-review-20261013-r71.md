# WP04 Section P — orange roughy / hoplostète orange identity review

- **Review and source-access date:** 2026-10-13.
- **Status:** Integrated as identity-only `ingredient-ref-orange-roughy`; see [integration record](../batches/wp04-section-p-orange-roughy-identity-integration-20261013/README.md).
- **Packet type:** source-backed finfish identity, Québec French, exact ownership, picker, recipe-demand, and numeric-boundary review.
- **Recommendation:** **Add an identity-only reference** for *Hoplostethus atlanticus* as `orange roughy / hoplostète orange`, in `PROTEIN`. Add no aliases, forms, measures, recipe links, density, unit mappings, conversions, yields, or substitutions.

## Candidate and naming scope

| Prospective reference ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| `ingredient-ref-orange-roughy` | `PROTEIN` | `orange roughy` | `hoplostète orange` | *Hoplostethus atlanticus* | None |

Québec naming confidence is **high** for the proposed pair. OQLF’s GDT entry gives `hoplostète orange` as the preferred edible-fish term, translates it as `orange roughy`, and identifies *Hoplostethus atlanticus*. The entry says the name refers to a fish species with commercial potential in Québec; it was last updated in 2011, so that statement is not current market evidence. A current French-facing Québec retailer page uses the English product wording `Orange Roughy` for frozen fillets. Together, OQLF supports the French display and the retailer supports current local product wording, but neither implies that the English form is preferred in French.

The species mapping is independently supported by the CFIA Fish List: TSN 166139, *H. atlanticus*, English `Orange Roughy`, French `Hoplostète Orange`, family Trachichthyidae. The Québec retailer does not print a scientific name, so its particular SKU is not independently taxon-verified on that page; its product label is consistent with the OQLF and CFIA species-scoped name.

Keep the alternate labels out of this reference’s aliases. OQLF lists `hoplostète rouge` as a France term and says that term and `perche de mer néo-zélandaise` were not retained by the fish-product terminology committee. OQLF also lists English `deep sea perch`, but that would broaden generic `perch` searches. CFIA lists `Slimehead / Hoplostète rouge` against the same taxon; that regulatory label pairing does not establish Québec consumer usage. Do not infer New Zealand origin from a name, or use `orange roughy` to identify an unspecified deep-sea perch.

**Separate risk note:** CFIA marks its *H. atlanticus* rows “Subject to Environmental Contaminants.” That is a contaminant-handling flag, not the evidence for the species/name mapping. Separately, Health Canada currently lists orange roughy among the fish to eat less often because of mercury and gives combined consumption limits for that group. Those public-health amounts are not ingredient measures, recipe servings, density values, or conversion rules; they do not change the proposed name or taxon.

## Exact ownership and review status

The audit checked active reference names and aliases, form labels and match terms, legacy-import names and aliases, research-ledger record IDs/names/source IDs, the bundled recipe package, and proposal/batch archives. Search normalization follows `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD folding, accent removal, punctuation-to-space, and whitespace collapse.

| Candidate key or proposed ID | Active reference | Active form | Legacy candidate | Ledger | Proposal/batch archive |
|---|---|---|---|---|---|
| `ingredient-ref-orange-roughy` / `candidate-orange-roughy` | No ID or exact name/alias owner | No ID or exact label/match-term owner | No ID or exact name/alias owner | No record ID, exact name, or source-text owner | No prior focused orange-roughy review |
| `orange roughy` / `hoplostète orange` / *H. atlanticus* | No exact name, alias, or taxon string | None | None | None | No exact-name or taxon review found |
| `Slimehead` / `hoplostète rouge` | No exact owner; intentionally excluded from proposed aliases | None | None | No exact owner | No focused record found |
| `WP04-ORANGE-ROUGHY-20261013-R71-S01` through `S05` | No ID collision | No ID collision | No ID collision | No record/source-ID collision | No source-ID collision |

The live snapshot contains 1,391 active references, 100 forms, 63 legacy candidates, 1,724 ledger records, and 8 ledger unit conversions. The open Section P work remains broader than this one candidate; this review is distinct from the Round 70 clam-product boundary and the earlier fish-powder, fish-ball, surimi, and named-seafood reviews. The Section P plan and those preceding reviews remain the context for this narrow identity decision: [`RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt), [prior finfish gap sweep](wp04-section-p-next-finfish-gap-sweep-20261012.md), [prior Section P seafood review](wp04-next-open-section-p-seafood-candidate-review-20261012.md), and [Round 70 clam-product review](wp04-section-p-clam-product-state-boundary-review-20261013-round70.md).

## Picker projection

The projection adds one bilingual display-only row with empty alias and form lists. Complete normalized word-phrase matches take priority over substring fallback, as in the current picker implementation.

| Search | Current results | With proposed row | Reading |
|---|---:|---:|---|
| `orange roughy` | 0 | 1 | Exact English display match. |
| `hoplostète orange` / normalized `hoplostete orange` | 0 | 1 | Exact Québec French display match. |
| `roughy` | 0 | 1 | Exact word phrase within the English display. |
| `orange` | 7 | 8 | Adds one fish choice alongside the existing orange fruit, juice, peel/zest, mandarin, and orange-footed sea-cucumber results; it does not become a single-result fish answer. |
| `slimehead` / `hoplostète rouge` | 0 | 0 | No result because these alternative labels are not proposed aliases. |
| `fish` / `poisson` | 4 / 7 | 4 / 7 | No change; neither word is in the proposed displays. |

Current `orange` results are `bitter orange`, `candied orange peel`, `dried orange zest`, `mandarin`, `orange`, `orange-footed sea cucumber`, and `orange juice`. Adding this species creates a visibly mixed but still multiple-choice result set. Exact English and Québec French searches return only the proposed species row.

## Bundled recipe demand

The manifest lists 114 recipe files containing 1,123 ingredient rows. A normalized phrase scan of all manifest-listed recipe text and ingredient rows found **zero** matches for `orange roughy`, `hoplostète orange`, *Hoplostethus atlanticus*, `slimehead`, or the proposed IDs. No recipe link or relink is supported. The lack of bundled demand means no recipe-specific quantity, preparation state, or substitution scope can be inferred; it does not undermine the well-scoped identity and current Québec product listing.

## Numeric, conversion, and substitution boundaries

Capone Gourmet’s Québec product page describes frozen fillets as portioned at **200–230 g per fillet**. It offers this SKU in 2, 5, 10, and 20 lb formats, shown as 907 g, 2.27 kg, 4.54 kg, and 9.07 kg, and estimates approximately 4–5, 10–11, 20–22, and 40–45 fillets respectively. The retailer says count can vary with natural fish sizing. These are vendor-specific package and portion statements, not a generally transferable orange-roughy serving, a standardized count-to-weight mapping, or a recipe-line measure.

Health Canada’s mercury page currently identifies orange roughy among fish to eat less often and advises a combined maximum of 150 g/week for the general population, 150 g/month for specified women who are or may become pregnant or are breastfeeding, 125 g/month for children aged 5–11, and 75 g/month for children aged 1–4. The related Q&A clarifies the limits apply to the listed higher-mercury fish combined and says infants under 1 year should have less than 40 g/month of those fish. This is health guidance, not a default recipe portion or a conversion value; no such amounts should be stored as ingredient measurement data.

No reviewed source establishes a default edible portion, household-volume conversion, density, thaw/drained/cooked yield, package-to-recipe behavior, or substitution rule for this identity. Do not infer a substitute from the retailer’s description of firm, flaky flesh or from shared taxonomic or market categories.

## Proposed disposition

Add only the identity row `orange roughy / hoplostète orange` for *H. atlanticus* under `PROTEIN`, with no aliases, forms, or recipe links. This bounded pair is supported by the OQLF preferred Québec term and CFIA’s species-linked common-name row; current Québec retail evidence confirms a frozen-fillets product is marketed locally. The picker gives exact useful searches without collapsing a broad `orange` search to one result. Keep the CFIA contaminant flag and Health Canada mercury advice analytically separate from identity and from recipe measurement; the catalog row carries no health, quantity, or substitution data.

The identity and source-specific fillet/package observations are integrated in the bundled catalog and research ledger. No app tests or emulator checks were run because the changes add database JSON data.

## Sources

Sources were accessed on 2026-10-13.

| Source ID | Source | Evidence and limits |
|---|---|---|
| WP04-ORANGE-ROUGHY-20261013-R71-S01 | Office québécois de la langue française, [hoplostète orange (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199119/hoplostete-orange) | Preferred Québec term; English `orange roughy`; taxon *Hoplostethus atlanticus*; describes an edible fish species with commercial potential in Québec. Last updated 2011, so it is not current market-inventory evidence. It labels `hoplostète rouge` France and excludes that and `perche de mer néo-zélandaise` from the terminology committee’s retained terms. |
| WP04-ORANGE-ROUGHY-20261013-R71-S02 | Canadian Food Inspection Agency, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | The exact row maps TSN 166139, *H. atlanticus*, `Orange Roughy / Hoplostète Orange`, family Trachichthyidae. A second row lists `Slimehead / Hoplostète rouge` for that same taxon. Both rows have a separate “Subject to Environmental Contaminants” classification; this classification is not treated as naming evidence or a recipe quantity. |
| WP04-ORANGE-ROUGHY-20261013-R71-S03 | Capone Gourmet, [Orange Roughy en Filets Surgelés](https://caponegourmet.com/products/orange-roughy-filets-surgeles) | Current Québec-facing product listing and SKU-specific package/fillet claims: 200–230 g per filet; 2–20 lb packages with displayed metric equivalents and approximate filets per pack. The page does not state a Latin species, source fishery, standardized retail serving, or transferable conversion. |
| WP04-ORANGE-ROUGHY-20261013-R71-S04 | Health Canada, [Mercury in Fish](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/chemical-contaminants/environmental-contaminants/mercury/mercury-fish.html) | Current consumer guidance lists orange roughy among fish to eat less often and specifies amounts by population group. These are combined consumption limits for the listed fish, not ingredient or recipe measures. |
| WP04-ORANGE-ROUGHY-20261013-R71-S05 | Health Canada, [Mercury in Fish: Questions and Answers](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/chemical-contaminants/environmental-contaminants/mercury/mercury-fish-questions-answers.html) | Clarifies the listed fish limits are combined; provides the under-1-year guidance. Consumer health information only, not a cooking, portion-conversion, or substitution source. |

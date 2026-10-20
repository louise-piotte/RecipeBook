# WP04 Section P — frozen cuttlefish balls / boulettes de seiche surgelées (R215)

- **Review and source check date:** 2026-10-16.
- **Open checklist items:** fish powder, fish balls, and surimi; and sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood with verified names, in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Candidate:** the named frozen cuttlefish-ball retail product.
- **Disposition:** **Add one identity-only `PROTEIN` reference** with English display `frozen cuttlefish balls` and French display `boulettes de seiche surgelées`. Use only the source-attested singular forms as aliases. Keep it separate from raw cuttlefish, generic fish balls, shrimp balls, fish tofu, fish cakes, and surimi.
- **Data outcome:** Proposal only. No catalog, form, ledger, legacy-identity, recipe, plan, roadmap, generated, or test file changed.

## Scope and prior-work boundary

This is a narrow prepared-product decision. Super C and Metro list the same 180 g item as **Frozen Cuttlefish Ball / Boulette de seiche surgelée**, product 821964020305. A separate Montréal retailer also lists a 180 g product as “Fish and cuttlefish ball.” The available pages do not disclose ingredient percentages or identify a cuttlefish species. The proposed identity therefore records the buyer-facing product name only; it does not assert that cuttlefish is the product's sole seafood ingredient or assign a species.

The live `ingredient-ref-cuttlefish` row remains the unqualified mollusk identity `cuttlefish / seiche`. Its prior review explicitly kept prepared products separate and cited the Metro cuttlefish-ball SKU as product-name evidence, without allocating that finished product. The generic formed-product row `ingredient-ref-fish-balls` remains `fish balls / boulettes de poisson`, and `ingredient-ref-shrimp-balls` remains separate. Generic `surimi` and generic `fish powder` remain unresolved under their prior reviews; Bonga dried fish powder remains species/product-scoped. This proposal changes none of those decisions. The R211 scallop-roe hold is unrelated and remains unchanged.

## Proposed identity

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-cuttlefish-balls` |
| Category | `PROTEIN` |
| English display | **frozen cuttlefish balls** |
| Québec French display | **boulettes de seiche surgelées** |
| English aliases | `cuttlefish ball`; `frozen cuttlefish ball` |
| French aliases | `boulette de seiche`; `boulette de seiche surgelée` |
| Scope | A prepared seafood product sold under the frozen cuttlefish-ball name. No species, formula, cuttlefish proportion, cooking state, brand, or origin is generalized. |

The singular aliases are exact phrases in the retailer's paired product titles. The proposed displays pluralize that source-attested product name to represent the product group. Do not add `fish ball`, `fish balls`, `boulettes de poisson`, `fish and cuttlefish ball`, shrimp-flavoured variants, `surimi`, `squid`, `calamari`, `seiche` as an alias, or a species name. The compound retailer title “Fish and cuttlefish ball” is not copied as an alias because its wording may identify a mixed fish-and-cuttlefish product and would blur the existing fish-ball boundary.

The frozen qualifier belongs in the display because the reviewed Québec retail product is sold frozen. Do not create a generic frozen form or attach a form to `ingredient-ref-cuttlefish`: this is a formed prepared product, not a storage-state observation for plain cuttlefish.

## Live catalog, forms, legacy identities, and ledger audit

The live package currently has **1,595 ingredient references**, **122 forms**, and **114 manifest-listed recipes**. The legacy-import file has **61 candidates**; the research ledger has **1,940 records**.

| Existing owner/state | Current boundary |
|---|---|
| `ingredient-ref-cuttlefish` — verified, `cuttlefish / seiche`; no aliases or forms | Keep the raw/unqualified cuttlefish identity. Its ledger already owns the Metro French product page as `WP04-CUTTLEFISH-IDENTITY-20261012-S06`, which supports that a Québec retailer named a prepared product; it is not a separate ball-product identity. Reuse that source ID rather than registering the URL twice. |
| `ingredient-ref-fish-balls` — verified, `fish balls / boulettes de poisson`, with singular aliases; no forms | Keep the generic fish-based formed-product row and its aliases. Do not add a cuttlefish-ball phrase to this row. |
| `ingredient-ref-shrimp-balls` — verified, `shrimp balls / boulettes de crevettes`, with singular aliases; no forms | Keep separate from this cuttlefish-named retail product. |
| `ingredient-ref-fish-tofu` — verified, identity-only | No wording or form overlap; leave unchanged. |
| `candidate-surimi-product-boundary` — `needs_clarification` | Keep unqualified `surimi` unresolved; do not attach surimi names or a surimi form to this proposal. |
| `ingredient-ref-bonga-dried-fish-powder` — verified, identity-only | Keep Bonga-specific; no generic powder wording is added. |

The exact normalized keys for the proposed ID, displays, and aliases are unowned by current references, attached forms, and legacy identities. No dedicated cuttlefish-ball ledger record or legacy candidate exists. The only prior ledger ownership of the exact retail product URL is the existing cuttlefish identity record's Metro source `WP04-CUTTLEFISH-IDENTITY-20261012-S06`; it should remain there. The five new source IDs below and their URLs were checked against the live ledger and maintained catalog files and are proposal-local only. The OQLF `seiche` source remains owned by `ingredient-ref-cuttlefish` as `WP04-MOLLUSKS-20261009-S10` and is reused for the French base term, not duplicated.

## Phrase-first picker projection

The projection follows the phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using the proposed display terms and aliases. Counts below are current exact-phrase results and the hypothetical results with the row.

| Query | Current | With proposed row | Effect |
|---|---:|---:|---|
| `cuttlefish` | 1 | 2 | Shows plain cuttlefish and the prepared cuttlefish-ball product as separate choices. |
| `seiche` | 1 | 2 | Same distinction in French. |
| `cuttlefish ball` | 0 | 1 | Exact English product phrase selects the new row. |
| `frozen cuttlefish ball` | 0 | 1 | Exact source-title phrase selects the new row. |
| `boulette de seiche` | 0 | 1 | Exact French product phrase selects the new row. |
| `boulette de seiche surgelée` | 0 | 1 | Exact source-title phrase selects the new row. |
| `fish ball` / `fish balls` | 1 | 1 | The existing generic fish-ball row remains the only exact result; the `cuttlefish` token is not `fish`. |
| `boulette de poisson` / `boulettes de poisson` | 1 | 1 | The existing generic fish-ball row remains the only exact French result. |
| `surimi` | 0 | 0 | No term is added to the held generic-surimi candidate or a picker row. |

The broad `cuttlefish / seiche` expansion is intentional: the user sees the plain mollusk identity and a separately named prepared product. Do not add aliases that route the prepared product to generic fish-ball, surimi, squid, or species searches.

## Recipe demand, measurements, forms, and substitutions

A manifest-ordered scan read all **114** recipe files and **1,123** structured ingredient rows, checking full recipe JSON and ingredient rows for cuttlefish, seiche, the proposed ball-product phrases, generic fish-ball wording, surimi, generic fish powder, and Bonga wording. It found **zero** matches. No recipe link or relink is proposed.

Retailer pages show 180 g package listings for the named SKUs. Those values describe a package, not a ball count, standard recipe measure, density, conversion, or yield. One Canadian retailer listing says that its `Tasty - Fish and Cuttlefish Ball` product must be fully cooked before consumption; that is product-specific preparation text, not a general cooking state for every cuttlefish ball. Add no form, default density, unit mapping, measure, package yield, edible yield, conversion, or recipe amount.

No source or recipe supports replacing plain cuttlefish with the prepared ball product, or using it in place of fish balls, shrimp balls, fish tofu, fish cakes, surimi, actual crab, or another seafood. Add no global or contextual substitution, warning, or recipe-line substitution link.

## Sources

Online sources checked on 2026-10-16. New IDs are unique to this proposal and were not added to the shared ledger. The same-SKU Metro URL is cited under its existing source ID above.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CUTTLEFISH-BALL-R215-20261016-S01** | Super C Québec, [Boulette de seiche surgelée, 180 g](https://www.superc.ca/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/boulette-de-seiche-surgelee/p/821964020305) | Current product page gives the exact French name, 180 g package, and item 821964020305. The page reports the product seasonal/unavailable at the selected store; this is product-listing evidence, not a stock claim. |
| **WP04-SECTIONP-CUTTLEFISH-BALL-R215-20261016-S02** | Super C Canada, [Frozen Cuttlefish Ball, 180 g](https://www.superc.ca/en/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-cuttlefish-ball/p/821964020305) | English page for the same product number pairs the exact product name with the same 180 g package. It supplies no species or ingredient declaration. |
| **WP04-SECTIONP-CUTTLEFISH-BALL-R215-20261016-S03** | Food Basics Canada, [Frozen Cuttlefish Ball, 180 g](https://www.foodbasics.ca/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-cuttlefish-ball/p/821964020305) | Current indexed listing gives the same product number and 180 g size. This is another retailer page for the same SKU, not an independent formulation. |
| **WP04-SECTIONP-CUTTLEFISH-BALL-R215-20261016-S04** | PriceSmart Foods, [Tasty - Fish and Cuttlefish Ball, 180 g](https://www.pricesmartfoods.com/product/tasty-fish-and-cuttlefish-ball-00821964020305) | Canadian listing uses a compound product name and the UPC with a leading zero corresponding to 821964020305; it says frozen and fully cook before consumption. It does not disclose the formula, and its compound title is not proposed as an alias. |
| **WP04-SECTIONP-CUTTLEFISH-BALL-R215-20261016-S05** | Marché ShengTai, Montréal, [Fish and cuttlefish ball / 爽口牌墨鱼丸, 180 g](https://www.marcheshengtai.ca/Fish-and-cuttlefish-ball.html) | Separate retailer/product-code listing uses “Fish and cuttlefish ball” for a 180 g frozen product. It does not give a Québec French name, species, or ingredient percentages; it is corroborating market context only, not an alias source. |

Existing source IDs reused: `WP04-MOLLUSKS-20261009-S10` (OQLF, [`seiche`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198916/seiche)) supports the Québec French base term. `WP04-CUTTLEFISH-IDENTITY-20261012-S06` (Metro Québec, [Boulette de seiche surgelée](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/boulette-de-seiche-surgelee/p/821964020305)) is already owned by `ingredient-ref-cuttlefish` and is not duplicated.

## Remaining checklist status

This proposal covers one prepared-product candidate only. If accepted, add this narrow identity-only product and mark its specific candidate reviewed; keep the broader fish-powder/fish-balls/surimi and regional-seafood checklist items open. The generic fish-powder hold, Bonga-specific powder row, generic fish-ball identity, held surimi candidate, existing fish-tofu and shrimp-ball identities, and R211 scallop-roe decision remain unchanged.

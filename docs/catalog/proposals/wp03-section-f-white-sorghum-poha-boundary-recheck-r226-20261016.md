# WP03 Section F — white-sorghum poha boundary recheck (R226, 2026-10-16)

## Review record

- **Status:** Added current product and naming evidence to the existing unresolved `candidate-sorghum-flakes` ledger record. No active reference, alias, form, recipe link, measure, conversion, yield, or substitution was added.
- **Scope:** Recheck sorghum flakes using newly found Canadian listings for S&V white sorghum flakes (poha), while preserving the earlier distinction among instant flakes, ready-to-eat crisps, and rolled-and-dried flakes.
- **Recipe demand:** The manifest corpus has no sorghum or sorghum-flake ingredient demand.

## New evidence and product boundary

S&V Millets currently lists **White Sorghum Flakes (Poha)** and describes a specific process: soaking, cooking, flattening, and drying white sorghum. The manufacturer page also places it in its “Millet Flakes (Poha)” family. The direct page timed out in this review; its current indexed product content provided the title, process, and product context. The company lists a 647-area-code contact number, while an Ontario retailer lists the S&V item as a 2 lb product in stock at its Burlington address [S07–S08]. A Calgary seller independently describes the product as used like poha for upma, breakfast cereal, chivda, and porridge; its listing was out of stock when checked [S10].

This is a useful **narrow process-defined candidate**. It does not resolve the generic phrase `sorghum flakes`: the earlier GoGo Quinoa listing uses that phrase for instant porridge flakes, OM Foods describes a ready-to-eat crunchy cereal/snack product without specifying a flaking process, and CerealVeneta describes cleaned, rolled, and dried white-sorghum flakes [S03–S05, S07]. These examples should not be collapsed into one generic identity or made into forms of puffed sorghum.

The Canadian French-language Boulangerie Cannelle article says sorghum may be used as flour, whole grain, or flakes. This supports the French culinary wording *sorgho en flocons* in a general discussion, but it does not name the S&V product or establish a Québec retail label [S09]. The European product title *flocons de sorgho blanc* remains useful phrase evidence only; it is not Canadian or Québec product-name evidence [S05].

## Decision

Keep `candidate-sorghum-flakes` unresolved and unallocated. The new evidence separates S&V's cooked-and-flattened white-sorghum poha from the other reviewed sorghum-flake examples, but does not establish a product-matched Canadian French label or safe picker scope. Adding a single white-sorghum row under a broad flake title would make `sorghum flakes` resolve to that one process-specific product while other Canadian product scopes remain absent. Adding the word `poha` without a carefully reviewed display would also change an existing broad query that currently finds flattened rice.

Reopen for a narrow identity if a current Canadian/Québec French product label or authoritative Québec term supports the poha-style product and a paired picker review can return the intended sorghum product choices. Keep plain grain sorghum, sorghum flour, sorghum grits/semolina, cracked sorghum, puffed sorghum, and ready-to-eat sorghum crisps separate.

## Numeric and recipe boundaries

- The S&V 2 lb / 1 kg package listings are product package sizes, not household measures or recipe quantities [S07–S08].
- No reusable volume-to-mass relationship, cooking yield, dry-to-cooked conversion, or substitution is supported. Do not transfer the GoGo Quinoa product-specific serving to S&V poha.
- The full bundled recipe corpus has no matching sorghum or sorghum-flake row; add no recipe link.

## Ledger update

The existing `candidate-sorghum-flakes` record now includes four current-source entries (S07–S10), an updated access date and limits for the existing OM Foods source, and this later unresolved decision. The candidate state and existing measurement/substitution states remain unchanged. All new source IDs use the `WP03-SORGFLAKE-R226-20261016` namespace; the namespace was absent from the ledger and proposal/batch archive before this review.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-SORGFLAKE-R226-20261016-S07` | S&V Millets, [White Sorghum Flakes (Poha)](https://svmillets.com/product/white-sorghum-flakes/) | Manufacturer listing identifies the product as white sorghum flakes/poha and describes soaking, cooking, flattening, and drying. Direct retrieval timed out; product text was available through current indexed content. It does not supply a Québec French product name or a reusable measure. |
| `WP03-SORGFLAKE-R226-20261016-S08` | Indian Grocery Store Canada, [S&V White Sorghum Flakes](https://indiangrocerystore.ca/products/s-v-white-sorghum-flakes) | Current Ontario retail page lists a 2 lb SKU and in-stock status at review, with the retailer address in Burlington. It corroborates Canadian market presence and product title, not process or composition. |
| `WP03-SORGFLAKE-R226-20261016-S09` | Boulangerie Cannelle, [Le sorgho : la céréale qu'on mange depuis 5 000 ans et qu'on redécouvre](https://cannelleboulangerie.com/blogs/guide-sans-gluten/sorgho-cereale-ancienne-bienfaits) | French-language Canadian culinary article says sorghum can be used as flour, whole grain, or flakes. It supports general French culinary wording only, not a product-matched Québec label or S&V product identity. |
| `WP03-SORGFLAKE-R226-20261016-S10` | BuyNearby / Desi Indian Market Calgary, [S&V Millets White Sorghum Flakes](https://buynearby.store/product/sv-millets-white-sorghum-flakes-prod_695d573e5e3e33.41031954) | Calgary retail listing describes poha-like uses for upma, breakfast cereal, chivda, and porridge. The listing was out of stock at review and gives no French title, process specification, or reusable measure. |

The prior unresolved decision and its S01–S06 sources remain intact. No tests, emulator checks, or deployment were run; this update adds research-ledger JSON data and documentation only, under the updated `AGENTS.md` rule.

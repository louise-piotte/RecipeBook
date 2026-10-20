# WP05 — Lechon sauce identity review

- **Status:** Integrated as identity `ingredient-ref-lechon-sauce`.
- **Reviewed:** 2026-10-18.
- **Decision:** Add `lechon sauce / sauce léchon`, with search aliases `sarsa ng lechon` and `sauce pour lechon`.
- **Scope:** Represent the Filipino sauce category and Québec French wording. Do not impose a single recipe, require liver, or map the category to Mang Tomas or Mama Sita's products.

## Decision and boundaries

Philippine and Canadian evidence supports lechon sauce as a distinct sauce category. A Quezon City government page documents a liver-based restaurant sauce; Mama Sita's describes a commercial vinegar, cane-sugar, and spice blend; its Canadian retail counterpart Mang Tomas lists breadcrumbs and other ingredients. These examples establish that product formulations vary, so the catalog does not treat liver, breadcrumbs, or any one manufacturer's formula as universal.

A Québec Filipino restaurant menu uses the French phrase `sauce léchon maison` for its house-made accompaniment. A Canadian French trademark journal uses `sauce pour lechon` as a commercial category description. The display is descriptive and source-backed; no claim is made that OQLF has designated a preferred term.

The Tagalog name `sarsa ng lechon` is included as a bilingual search alias. Keep lechon sauce separate from toyomansi, banana ketchup, and spiced vinegar. Do not add broader aliases such as `all-purpose sauce`, `liver sauce`, or `sarsa`, which either overgeneralize or select only one formulation.

No matching ingredient line occurs in the 114 bundled recipes (1,123 ingredient rows). No forms, measures, density, conversions, yields, recipe links, or substitutions were added. Measurement and substitution research remain `not_yet_researched`.

## Ownership and source review

The active catalog had no lechon-sauce identity. The new row does not claim ownership of Mang Tomas or Mama Sita's named product identities. Product package sizes are not kitchen measures.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-LECHON-SAUCE-R614-S01** | Quezon City Government, [La Loma Lechon Area](https://quezoncity.gov.ph/place/la-loma-lechon-area/). | Identifies Ping Ping's trademark lechon sauce as liver-based; one local version, not a universal formula. |
| **WP05-LECHON-SAUCE-R614-S02** | Philippine Department of Health, East Avenue Medical Center, [2026 procurement list](https://eamc.doh.gov.ph/wp-content/uploads/2025/11/ib-c1-2026-pq-28.pdf). | Lists `Lechon Sauce, 1 kg/pouch` as a food-product category. The package size is not a measure and the listing does not specify ingredients. |
| **WP05-LECHON-SAUCE-R614-S03** | Mama Sita's, [Sarsa ng Lechon All Purpose Sauce product folio](https://exhibitor-manual-004.s3.ap-south-1.amazonaws.com/Production/exb_doc/2018/28911/MS_Product_Folio_Gulfood_01102024_lowres_3MB.pdf). | Lists regular and hot versions and describes a vinegar, cane-sugar, and spice blend. This is manufacturer-specific. |
| **WP05-LECHON-SAUCE-R614-S04** | Canadian Intellectual Property Office, [Journal des marques de commerce, Vol. 63 No. 3223](https://publications.gc.ca/collections/collection_2016/isde-ised/RG42-2-63-3223-fra.pdf). | Uses `sauce pour lechon` in Mama Sita's goods list and records Canadian use since 2010. This supports wording and market history, not a food standard. |
| **WP05-LECHON-SAUCE-R614-S05** | Metro Québec, [Sauce tout usage originale Mang Tomas](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/sauces-barbecue-et-marinades/sauce-tout-usage-originale/p/737964000455). | French retail listing and product-specific ingredient statement document a distinct commercial formulation; it is not generalized to the whole category. |
| **WP05-LECHON-SAUCE-R614-S06** | Skip Canada, [Kalapaw bilingual menu](https://www.skipthedishes.com/fr/kalapaw-boul-des-sources-e). | The Lechon Kawali listing uses `sauce léchon maison` in French and `homemade lechon sauce` in English, supporting the descriptive Québec display. |

## Static checks

Exact alias ownership, R614 source-ID and URL uniqueness, recipe-corpus demand, ledger schema, seed-package validation, generated-index freshness, UTF-8/no-BOM, local links, and scoped whitespace checks were reviewed. No app tests, builds, or emulator checks were run because this change only adds database JSON data and catalog documentation under the updated `AGENTS.md` rule.

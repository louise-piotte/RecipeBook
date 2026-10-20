# WP03 Section F R586 — Nature’s Path Superseeds & Grains oatmeal

Date: 2026-10-17

## Decision

Added `Superseeds & Grains instant oatmeal / Gruau d’avoine et de supergrains biologique en sachets` as identity-only `ingredient-ref-natures-path-superseeds-grains-oatmeal` in `GRAIN_AND_CEREAL`.

The Québec display comes from the local retailer's product title. Keep `Nature’s Path`, `Qi’a`, `Superfood`, and component ingredients out of aliases; keep the packaged blend separate from oats, buckwheat, seeds, and other components. The manufacturer's multipack and the Québec listing's six 38 g sachets are package details, not household measures. The bundle has no matching product or recipe link. Add no forms, density, unit mappings, recipe links, yields, conversions, or substitutions.

The phrase-first picker gives the distinctive `Superseeds & Grains` name one result. `oatmeal`, `gruau`, and `supergrains` remain broader result sets; `superfood oatmeal` remains unallocated. `gruau d’avoine` also finds the existing whole oat-groats identity, so the relevant distinction remains visible.

## Evidence

- Nature’s Path Canada, [Superseeds & Grains instant oatmeal](https://naturespath.com/en-ca/products/superseed-hot-oatmeal-np-ca): manufacturer identity and product-family details.
- Nature’s Path Canada, [French-Canadian product page](https://naturespath.com/fr-ca/products/superseeds-grains-superfood-oatmeal-228-g-boite): matching UPC and product route; manufacturer page wording is not used as the French display.
- Super C Québec, [Gruau d’avoine et de supergrains biologique en sachets](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/gruau-d-avoine-et-de-supergrains-biologique-en-sachets/p/058449154006): product-specific French title, UPC, package, and ingredient declaration. The existing source ID `WP03-AMARFLAKE-20261012-S02` remains owned by the amaranth-flakes record and is reused for this separate product-identity claim.
- Metro, [Gruau d’avoine supergrains en sachets Qi’a](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/gruau-d-avoine-supergrains-en-sachets/p/058449154006): corroborating product-code and Québec-title evidence; stock/package details remain SKU-specific.
- Nature’s Path Canada, [French oatmeal collection](https://naturespath.com/fr-ca/collections/gruau): family context and sibling Superfood product names.
- OQLF, [gruau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau): terminology context only; reused existing source ID `WP03-S27`.

See the [R586 proposal](../../proposals/wp03-section-f-next-gap-review-r586-20261017.md), the open [Section F cereal-mix checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4525), and the broader Section F work log at [plan line 14940](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14968). The broader Section F review remains open.

## Static verification

The package now has 1,810 ingredient references; the ledger has 2,180 records. The 114 manifest-listed recipes and 1,123 ingredient rows contain no matching product name, UPC, or reference link. Package and ledger validation, generated-index freshness, source ownership, phrase-first picker projection, UTF-8/no-BOM checks, local links, and scoped whitespace checks passed. No software tests, build, emulator check, or deployment were run because this integration only adds database JSON data and planning documentation under `AGENTS.md`.

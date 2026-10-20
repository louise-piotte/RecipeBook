# WP03 — Grape-Nuts picker-boundary hold (2026-10-12)

## Decision

Keep Original Grape-Nuts cereal out of the active catalog. The current picker matches complete
normalized word phrases within longer display terms, so an active `Grape-Nuts cereal` identity
would appear for broad `grape` and `nuts` searches even though the cereal contains neither. The
current Post Canada brand directory does not list Grape-Nuts, and the bundled recipes have no
demand. Do not create an active reference, aliases, a legacy candidate, or a ledger record.

The full manifest-listed bundle has 0 candidate hits across 114 recipes and 1,123 ingredient rows.
Historical Canadian and Québec French product wording supports documenting the product boundary,
but the manufacturer page is U.S.-audience material and the current Canadian directory does not
establish retail availability. Health Canada's 2008 French table records a product-specific
125 mL / 58 g observation; keep it as historical evidence only. Add no measure, density, mapping,
form, recipe link, conversion, yield, or substitution.

## Evidence reviewed

- Post's [current Original product page](https://www.grapenuts.com/product/the-original/) describes
  a whole-grain wheat-and-barley cereal, gives a 1/2 cup (58 g) serving, and states the website is
  intended for U.S. audiences.
- The [Post brand page](https://www.postconsumerbrands.com/brands/grape-nuts/) distinguishes Original
  cereal from Grape-Nuts Flakes and says the cereal contains neither grapes nor nuts.
- [Health Canada's French 2008 food table](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/saine-alimentation/donnees-nutritionnelles/tableau-2-pains-cereales-autres-produits-cerealiers-valeur-nutritive-quelques-aliments-usuels-2008.html)
  lists `Grape-Nuts, Post` at 125 mL / 58 g. This is a dated, product-specific observation.
- [Post Consumer Brands Canada's current brand directory](https://www.postconsumerbrands.ca/category/brands/)
  lists its Canadian brands but not Grape-Nuts; this is a directory observation, not proof that no
  retailer imports it.
- The proposal records the Canadian trademark, Québec French naming, and other product-history
  sources with their limits: [full WP03 review](../../proposals/wp03-next-open-section-f-grain-candidate-review-20261012.md).

## Reconciliation

This hold completes one named processed-cereal candidate review beneath the still-open Section F
regional-cereal/preprocessed-grain item. It does not close that checklist. The exact current picker
results, ownership audit, full recipe scan, and source limitations are recorded in the proposal.
Canonical JSON, recipe, ledger, generated code, and app behavior were unchanged. No app tests or
emulator checks were run; the reconciliation changed documentation only.

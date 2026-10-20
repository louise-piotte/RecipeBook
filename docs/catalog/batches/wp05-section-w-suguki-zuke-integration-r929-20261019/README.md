# WP05 Section W — suguki-zuke integration (R929)

## Decision

Add identity-only `suguki-zuke / suguki-zuke` for the named Kyoto salt-fermented preserve. Use the
borrowed name in fr-CA pending Québec-specific terminology evidence. Retain only the narrow English
aliases `sugukizuke` and `suguki pickles`. Keep fresh turnip, turnip greens, shibazuke, takuan, and
generic pickled radish distinct. Do not generalize the sources' process stages, temperatures, timing,
serving context, or component-part preparation into a form, measure, yield, or substitution.

## Cross-category scope

R929 selected one generic regional preserve; it did not research or add a brand, product line,
flavour, SKU, retailer variant, or commercial roster. Commercial-product counts do not add ingredient
diversity. Existing branded references and product-scoped evidence remain intact; no product-specific
value was transferred.

## Static validation

- Ingredient-reference normalization and bundled seed-package validation passed.
- Generated `BundledIngredientCatalog.kt` is current at 1,951 references.
- Counts: 1,951 ingredient references, 204 forms, and 2,355 research-ledger records; the bundled
  recipe corpus remains 114 recipes and 1,123 ingredient rows.
- Ledger schema, source ownership, and alias-collision checks passed through package validation.
- No software tests, build, emulator, or deployment were run because the app data change only adds
  database JSON under `AGENTS.md`.

## Sources

- [Japan MAFF, Kyo Tsukemono](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/kyo_tsukemono.html)
- [Japan MAFF, Sugukizuke — Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/4751/index.html)
- [Kyoto Prefecture, すぐき菜（すぐき）](https://www.pref.kyoto.jp/kyotootokuni-f/1228962211981.html)
- [Voyages à Kyoto, Gastronomie et boissons](https://kyoto.travel/fr/food-and-drink)
- [OQLF, navet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870711/navet)

## Proposal

- [R929 — suguki-zuke identity and boundary review](../../proposals/wp05-section-w-generic-gap-review-r929-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)

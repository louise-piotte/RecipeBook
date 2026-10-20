# WP03 Section K — bamboo leaves integration (R935)

## Decision

Add identity-only generic `bamboo leaves / feuilles de bambou` as a culinary wrapping plant part,
with singular aliases `bamboo leaf` and `feuille de bambou`. Keep the French wording descriptive;
OQLF supports the base `bambou` term but does not standardize the leaf compound.

The sources document bamboo leaves as zongzi wrappers. This catalog category records their
culinary role; it does not claim that the leaves are eaten. Keep them distinct from bamboo shoots,
fermented bamboo shoots, banana leaves, corn husks, lotus leaves, and grape leaves. The sources
provide no transferable amounts or preparation-state conversions. No form, measure, recipe link,
density, mapping, conversion, yield, or substitution was added.

## Cross-category scope

R935 adds a generic plant-part identity and researches no brand, product line, flavour, SKU, or
retailer roster. Commercial-product counts do not add ingredient diversity. Existing branded rows
and product-scoped evidence remain unchanged.

## Static validation

- Ingredient-reference normalization and bundled seed-package validation passed.
- Generated `BundledIngredientCatalog.kt` is current at 1,955 references.
- Counts: 1,955 ingredient references, 204 forms, and 2,359 research-ledger records; the bundled
  recipe corpus remains 114 recipes and 1,123 ingredient rows.
- Package validation covers research-ledger schema, source ownership, and alias collisions.
- No software tests, build, emulator, or deployment were run because the app change only adds
  database JSON under `AGENTS.md`.

## Sources

- [Singapore Food Agency, Rice Dumplings](https://www.sfa.gov.sg/food-safety-tips/food-risk-concerns/risk-at-a-glance/rice-dumplings)
- [Hunan Government Website, Miluo Zongzi](https://www.enghunan.gov.cn/hneng/Tourism/TourHunan/Yueyang_1/Dining_6/201606/t20160628_3076994.html)
- [Shanghai Municipal Government, L’art du zongzi fait main à Shanghai](https://french.shanghai.gov.cn/fr-Videos/20260611/c9fc9d10801c4749a56774a69ebd58b0.html)
- [OQLF, bambou (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8407157/bambou)

## Proposal

- [R935 — bamboo-leaf wrapper identity review](../../proposals/wp03-section-k-bamboo-leaves-generic-wrapper-review-r935-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)

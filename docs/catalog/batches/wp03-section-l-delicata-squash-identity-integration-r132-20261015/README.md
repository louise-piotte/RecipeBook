# WP03 Section L R132 — delicata squash identity

## Decision

Added identity-only `ingredient-ref-delicata-squash`, displayed as `delicata squash / courge Delicata`, with empty aliases. Current Québec produce sources use the bilingual product names and list Delicata separately from neighboring squash varieties. The broad `squash` and `courge` picker queries already return multiple products and remain broad; no unverified synonyms were added.

Recorded Metro product 4763's approximate 535 g average as one retailer-specific ledger estimate. Metro's French and English pages and the Super C page refer to the same product; this is not independent sample evidence. The estimate does not create a reusable count conversion, density, unit mapping, serving, or yield. Added no forms, recipe links, conversions, yields, or substitutions. The 114-recipe corpus has no matching demand, and the wider Section L checklist remains open.

Sources: [OQLF winter squash](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404009/courge-dhiver), [Aliments du Québec — Courge Delicata](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/courge-delicata-5), [Les Cultures de chez nous](https://www.cultures.ca/nos-produits/nos-courges), and [Super C product 4763](https://www.superc.ca/en/aisles/fruits-vegetables/vegetables/squash-pumpkin/delicata-squash/p/4763).

## Validation

Bundled-package validation and normalization checks, reference normalization, generated-index freshness, both JSON schemas, source-ID uniqueness, and scoped whitespace checks passed. A static picker projection resolves `delicata` and `courge délicata` to this row; broad `squash` and `courge` queries remain multi-result. The full manifest scan found zero candidate-term hits across 114 recipes / 1,123 ingredient rows. The package now has 1,483 references, 109 forms, and 61 legacy candidates; the research ledger has 1,828 records, 7,620 source entries, and 6,476 distinct source IDs. UTF-8/no-BOM and local-link checks passed.

No app, Gradle, unit, instrumentation, or emulator tests were run because this change adds database JSON data and refreshes its generated index. No recipe rows changed.

See the [proposal](../../proposals/wp03-section-l-delicata-squash-identity-review-20261015-r132.md) and [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).

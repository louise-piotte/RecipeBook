# WP03 / WP05 generic ingredient review integration — R922, R924, R926–R928

## Decisions

- **R922 — sea grapes:** Keep the unqualified *Caulerpa* candidate unresolved. The reviewed sources
  apply “sea grapes” to both *C. lentillifera* and *C. racemosa*, while OQLF’s `raisin de mer` names
  *Coccoloba uvifera*. The existing candidate remains intact with `identityState: needs_clarification`;
  its measurement and substitution research states now record that no transferable value or
  defensible replacement was found. No active ingredient reference was added.
- **R924 — shibazuke:** Confirm the existing `shibazuke` identity and English `shiba-zuke` spelling
  alias. Add no French descriptive alias, form, measurement, recipe link, or substitution. The existing
  row and evidence remain unchanged; Section W stays open.
- **R926 — crosne du Japon:** Add identity-only `Chinese artichoke / crosne du Japon` for edible
  *Stachys affinis* tubers, with OQLF-backed `Japanese artichoke`, `crosne`, and `crosnes` English
  aliases and French `crosne`. Keep it distinct from globe artichoke, Jerusalem artichoke, potato,
  and salsify; the broad English `artichoke` query will now include all three distinct identities.
- **R927 — Irish moss:** Add identity-only `Irish moss / mousse d’Irlande` for whole
  *Chondrus crispus*, with the scientific name as an exact search alias in both languages. Keep it
  distinct from carrageenan extracts and other seaweeds sold under ambiguous names such as “sea
  moss.” The French display `mousse d’Irlande` appears in short `mousse` searches; the full
  `pamplemousse` query remains unaffected.
- **R928 — dandelion flowers:** Add identity-only `dandelion flowers / fleurs de pissenlit` for the
  flowers of *Taraxacum officinale*, separate from the existing dandelion-greens identity and root
  uses. The ledger records the flower-wine replacement suggestion as blocked context because the
  source names no single replacement ingredient. Add no active substitution rule or reusable
  measurement.

## Cross-category scope

This review selected generic culinary identities and a generic sea-grape boundary. No brand,
product-line, flavour-family, SKU, or retailer-variant roster was researched. The active checklist
scan found no task whose sole deliverable is another commercial-product roster. If one is encountered,
mark it out of scope because commercial-product counts do not add ingredient diversity. Preserve
existing branded rows and their evidence; transfer product-only measurements or claims only after a
separate transferability review. Generic cereal coverage remains open.

Recipe-specific amounts and methods remain attached to their cited recipes. No product-specific
measurement was generalized. No recipes, forms, densities, unit mappings, conversions, yields, or
active substitutions were added.

## Static validation

- Ingredient references normalized; bundled seed package validation passed.
- Research-ledger schema, source ownership, reference ownership, and picker alias collision checks
  passed as part of package validation.
- Generated `BundledIngredientCatalog.kt` is current at 1,948 references.
- Counts: 1,948 ingredient references, 204 forms, 2,352 ledger records, and 114 bundled recipes /
  1,123 ingredient rows.
- UTF-8 without BOM and replacement-character checks passed for the edited JSON.
- No software tests, build, emulator, or deployment were run. The active app data changes only add
  database JSON; the other outcomes are documentation or ledger status updates.

## Proposals

- [R922 — sea-grape identity boundary](../../proposals/wp03-section-n-sea-grapes-identity-boundary-r922-20261019.md)
- [R924 — shibazuke identity recheck](../../proposals/wp05-section-w-shibazuke-identity-boundary-review-r924-20261019.md)
- [R926 — crosne du Japon identity](../../proposals/wp03-section-j-next-generic-root-tuber-review-r926-20261019.md)
- [R927 — Irish moss identity](../../proposals/wp03-section-n-next-generic-fungi-sea-vegetable-review-r927-20261019.md)
- [R928 — dandelion flowers identity](../../proposals/wp03-section-k-next-generic-leafy-produce-review-r928-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)

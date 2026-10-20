# WP03 Section U R338 — marjoram identity integration

Reviewed and integrated on 2026-10-16. Promoted the existing legacy candidate `ingredient-ref-marjoram` to one identity-only HERB reference for culinary *Origanum majorana*:

- Display: `marjoram / marjolaine`.
- English aliases: `sweet marjoram`, `knotted marjoram`.
- French alias: `grand origan`.

OQLF places `marjolaine` in the food, spice, and seasoning domain, defines it as an aromatic plant, lists the proposed English terms and French `grand origan`, and links the entry to *O. majorana*. Kew accepts the species and documents food use, including a Flora of Tropical East Africa note that it is widely cultivated as a culinary herb. OQLF describes marjolaine as a close relative of origan, not the same ingredient, so the active dried-oregano reference remains separate.

Before integration, the catalog had 1,684 active references, 129 forms, 58 legacy candidates, and 2,032 ledger records. The exact marjoram candidate existed only in the legacy list and as an unreviewed ledger candidate; no active identity or form owned its names. Root promoted the candidate and removed it from the legacy list, leaving 57 candidates. The ledger record is now an `ingredient_reference` with `identityState: verified`; measurement and substitution research remain `not_yet_researched`.

The phrase-first picker keeps full terms distinct while exposing the expected short French overlap:

| Query | After R338 |
|---|---|
| `marjoram`, `sweet marjoram`, `knotted marjoram` | marjoram / marjolaine only |
| `marjolaine`, `grand origan` | marjoram / marjolaine only |
| `origan` | marjoram / marjolaine and dried oregano |
| `origan séché` | dried oregano only |
| `oregano` | dried oregano only |
| *Origanum majorana*, *Majorana hortensis* | no result |

The `origan` query intentionally returns two rows, so it does not imply that marjoram and oregano are interchangeable. No recipe link is supported: the manifest scan found no marjoram terms among 114 recipes / 1,123 ingredient rows. No forms, measures, mappings, density, conversions, yields, or active substitutions were added.

The [proposal](../../proposals/wp03-section-u-marjoram-identity-review-r338-20261016.md) records the full ownership audit, sources, and limits. Static package, reference-normalization, generated-index, legacy-candidate, ledger, picker, corpus, encoding, local-link, and whitespace checks passed. The resulting catalog contains 1,685 references, 129 forms, 57 legacy candidates, and 2,032 ledger records. No software tests, builds, emulator checks, or deployment were run because the change adds database JSON data and its generated catalog projection under `AGENTS.md`.

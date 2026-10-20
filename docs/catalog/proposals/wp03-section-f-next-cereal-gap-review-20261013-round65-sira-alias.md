# WP03 Section F — `sira` flattened-rice alias review (2026-10-13, round 65)

## Disposition

Recommend adding only the English alias `sira` to the existing
`ingredient-ref-flattened-rice-poha` reference. This is a regional name for the existing plain
flattened-rice product, not a new grain identity or form. Keep the displays `flattened rice (poha)`
and `flocons de riz (poha)`, current aliases, grade forms, and numeric fields as they are.

The evidence supports the product identity and the spelling in Assam-context food sources. It does
not establish `sira` as a Québec French term, so do not add it to `aliasesFr`. Assam sources also use
the spelling `chira`, which is already an English alias on the same reference; preserve both
spellings rather than treating them as separate products or silently standardizing one away.

This file is proposal-only. No catalog JSON, ledger, roadmap, or checklist was edited for this
review. Section F remains open under the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt)
and [roadmap](../../../roadmap.md).

## Identity, process, and naming evidence

| ID | Source | Finding and limit |
|---|---|---|
| `WP03-SIRA-20261013-R65-S01` | Government of Assam, State Disaster Management Authority, [Guidelines for community kitchens at relief camps](https://sdmassam.nic.in/covid/Govt.%20of%20Assam%20Circular/guidelines_community_kitchens.pdf) | The indexed text lists “flattened rice (sira)” among dry foods for relief-camp kitchens, alongside rice and puffed rice. The PDF could not be opened by the browser during this review, so this is an official-source search-index excerpt; it supports the exact product-name pairing but gives no manufacturing detail. |
| `WP03-SIRA-20261013-R65-S02` | Assam Forest Department, [Annexure A](https://forest.assam.gov.in/sites/default/files/swf_utility_folder/departments/pccf_lipl_in_oid_4/latest/ANNEXURE-A.pdf), p. 2, item 53 | An institutional food-procurement table names “Flat Rice (Sira).” Its annual and daily procurement quantities are institutional supply figures, not household portions or conversion evidence. |
| `WP03-SIRA-20261013-R65-S03` | Assam Department of Sales Tax, [VAT page](https://tax.assam.gov.in/AssamTimsInfo/content/vat.html), item 54 | The page calls flattened or beaten rice “chira.” This corroborates the existing `chira` alias and shows spelling variation in Assam government sources; it does not establish that `sira` is the only or preferred spelling. |
| `WP03-SIRA-20261013-R65-S04` | Indian Institute of Food Processing Technology, Ministry of Food Processing Industries, [Handbook of Processing of Puffed & Flaked Rice](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/Rice-Based-Product-Handbook.pdf), pp. 16, 19–23 | The handbook describes flaked rice as a distinct rice product and gives general soaking/conditioning, roasting, flaking, grading, and packing steps. It lists several regional names but not `sira`; use it for product-class and process context, not as evidence for this alias or for one universal process. Its process and industrial grade figures do not yield a household conversion. |
| `WP03-SIRA-20261013-R65-S05` | Rani Brand, [Poha (Powa) Thin Cut (Flattened Rice), 14 oz](https://ranibrand.com/products/rani-poha-powa-thin-cut-flattened-rice-14oz-400g-all-natural-salt-free-vegan-no-colors-gluten-friendly-indian-origin-1) | This product page includes `sira` in its alternate-name list and describes its own poha as peeled rice flattened after parboiling. It is manufacturer/store evidence; the broad alternate-name list does not assign a language to each term or establish every product’s process. The 400 g figure is package size only. |
| `WP03-SIRA-20261013-R65-S06` | Provigo, [Aliments de l’Asie du Sud](https://www.provigo.ca/fr/alimentation/aliments-internationaux/aliments-de-l-asie-du-sud/c/58045) | The indexed Québec French listing displays “Suraj Flocons de riz (Poha) 300 g,” matching the current French display wording. The page is dynamic and the item was not independently confirmed in live stock; this supports retailer naming, not an OQLF recommendation. The 300 g figure is package size only. |
| `WP03-SIRA-20261013-R65-S07` | Assam Online Bazaar, [Malbhog Sira, 500 grams](https://assamonlinebazaar.com/p/malbhog-sira/) | One seller describes a qualified `Malbhog Sira` product as flattened flakes made from Malbhog Dhan. This is a product-specific listing, not evidence that the whole qualified phrase should be an alias or separate global identity. Keep that compound name out of this proposal. |

## Existing coverage and search ownership

The plan’s Section F notes that flattened rice (poha), common rice-flake synonyms, and thin,
medium, and thick poha grades are already integrated, while other regional terms remain open. The
active reference currently has the English aliases `beaten rice`, `flaked rice`, `rice flakes`,
`chiura`, `aval`, `atukulu`, `avalakki`, `chira`, and `chuda`; its French aliases remain `riz
aplati` and `riz battu`. Nearby archive decisions include the [chiura boundary
review](wp03-section-f-chiura-beaten-rice-alias-boundary-review-20261012.md), [aval
integration](../batches/wp03-section-f-aval-alias-integration-20261012/README.md), [chuda
integration](../batches/wp03-section-f-chuda-alias-integration-20261013/README.md), and [poha grade
forms](../batches/poha-thickness-synonyms-integration-20261010/README.md). They cover neighboring
terms, but no exact-word `sira` review was found.

Before this proposal was added, an exact and substring ownership audit found no `sira` match in
active reference terms, form labels or match terms, legacy identities, the research ledger, or the
proposal/batch archive. The proposed source-ID prefix `WP03-SIRA-20261013-R65-` also has no current
ledger collision. The current ingredient search checks complete normalized word phrases before
its substring fallback; the current catalog gives `sira` no result, and assigning that single alias
to the flattened-rice row would give it one exact owner. Do not add `sira` to another row or form.

## Recipe demand and numeric evidence

The current bundled corpus contains 114 recipe files and 1,123 ingredient rows. An exact-token scan
found no `sira` mention and no candidate phrases such as `sira doi`, `doi sira`, `sira gur`,
`sira poha`, or `flattened rice sira`. There is no recipe link or direct recipe demand for this
alias.

The existing reference has `defaultDensity: null` and no unit mappings. Its thin, medium, and thick
forms also have null densities. Keep all of those values and forms unchanged. The reference’s
ledger entry is currently `researched_supported` for measurements because it records one bounded
FAO/BBF Chirar Polao observation: 60 g (three fistfuls) for the complete formula for one 230 g
cooked bowl and two servings, using dry chira before soaking and cooking. That is not a per-serving
amount, general fistful conversion, or reusable measure for `sira`. Do not broaden it. The ledger
also keeps poha grade interchangeability `blocked_pending_evidence`; no form conversion or
substitution is supported here.

Neither institutional procurement amounts, manufacturing-process parameters, commercial grade
figures, nor the 300 g and 400 g package sizes support a household measure, density, conversion,
yield, or substitution. No numeric or substitution data should change.

## Integration sketch

For a later reviewed integration, append only `sira` to `aliasesEn` on
`ingredient-ref-flattened-rice-poha`, and append the accepted alias decision and sources S01–S07 to
that row’s existing ledger record. Retain both current displays, all current French aliases and
English aliases, the three existing poha grade forms, the recipe-specific Chirar Polao measurement
observation and its limits, null density fields, empty unit mappings, and blocked grade
interchangeability research. Add no new identity, form, recipe link, unit conversion, yield, or
substitution.

## Root integration outcome

Accepted on 2026-10-13 as an English alias only. Added `sira` to the existing flattened-rice `aliasesEn`
and recorded sources S01–S07 plus the accepted decision on its research-ledger record. The generated
catalog index is current; the [integration record](../batches/wp03-section-f-sira-alias-integration-20261013/README.md)
documents the scope and static checks. No app tests or emulator checks were run under the database-JSON rule.

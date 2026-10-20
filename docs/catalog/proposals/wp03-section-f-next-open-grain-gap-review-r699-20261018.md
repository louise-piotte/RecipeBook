# WP03 Section F R699: Lucky Charms cereal family boundary review

- **Reviewed:** 2026-10-18
- **Open Section F gap:** breakfast cereal forms, listed in the [WP03 packet's unresolved research gaps](../batches/plant-grains-cereals.md#L542).
- **Candidate:** the standard Canadian Lucky Charms frosted toasted oat cereal with marshmallows.
- **Recommendation:** **Hold** this one candidate outside active references until a Canadian Lucky Charms product-family picker decision is made. Do not add a generic cereal identity or a brand-family alias from this review.

## Ownership and scope check

The catalog has no active reference or legacy candidate for Lucky Charms, and the research ledger has no Lucky Charms record. No reference ID or shared source ownership has been allocated. The only archive hit is an incidental citation to a General Mills limited-edition announcement in the unrelated Cinnamon Toast Crunch family review; that review does not assess or allocate Lucky Charms.

The plan says to include meaningful culinary identities rather than every brand, and to distinguish branded products only when their composition or behavior justifies it. It also treats identity coverage separately from measurement and substitution coverage ([plan scope rules](../../RecipeBook-global-ingredient-catalog-plan.txt#L351), [brand rule](../../RecipeBook-global-ingredient-catalog-plan.txt#L1536)). Section F's packet keeps breakfast-cereal forms open and says to preserve exact packaged identity and composition rather than create a generic cereal-mix alias ([cereal-product boundary](../batches/plant-grains-cereals.md#L233), [regional/preprocessed products](../batches/plant-grains-cereals.md#L269)).

This product has a meaningful composition signal: the manufacturer describes the cereal as a named Lucky Charms product with marshmallow pieces, while the current Metro listing describes frosted oats with coloured marshmallows. That is enough to distinguish the exact finished product from oats, loose marshmallows, and generic cereal components. Lack of bundled recipe demand alone would not disqualify a meaningful identity. But the available sources do not establish the current Canadian product-family scope, and Metro lists a separately named Fruit Lucky Charms product. Adding just the standard SKU would make the broad `Lucky Charms` picker query appear to have one complete result when the brand has at least one separately listed cereal product. With no recipe demand to justify a one-SKU exception, retain the candidate as held pending that picker boundary decision.

### Candidate allocation if a later family review releases the hold

| Field | Proposal |
| --- | --- |
| Candidate ID | `ingredient-ref-lucky-charms-frosted-toasted-oat-cereal` — suggested only; **not reserved or allocated** while held |
| Category | `GRAIN_AND_CEREAL` |
| English display | `Lucky Charms Frosted Toasted Oat Cereal with Marshmallows` |
| French display | `Céréales givrées avec des guimauves Lucky Charms` — current Québec-market retailer wording; not an OQLF ruling |
| Aliases | None. Both proposed displays already include the brand and product class. Do not activate generic `cereal`, `breakfast cereal`, `oat cereal`, `marshmallow cereal`, or family-level aliases. |
| Forms and numeric behavior | None. Do not turn the 300 g retail package into a measure, density, unit mapping, conversion, or cooking yield. |
| Recipe links/substitutions | None. Keep the finished product separate from oats, marshmallows, other cereal components, and other Lucky Charms product variants. |

If the hold is released, represent the standard product once regardless of package size. Any separately marketed cereal variant would need its own evidence and identity decision; this proposal does not define or allocate those sibling rows.

## Evidence and proposal-local source allocations

The following IDs and URLs are unique to this proposal. Exact URL and source-ID searches found no existing owners in the research ledger, proposal archive, or batch archive. They are **proposal citations only** and have not been inserted into the shared ledger.

| Proposal source ID | Source and URL | Finding and limit |
| --- | --- | --- |
| `WP03-LUCKY-CHARMS-R699-20261018-S01` | General Mills Canada, [Lucky Charms™](https://www.generalmills.ca/our-food/brands/lucky-charms) | Current manufacturer brand page identifies Lucky Charms and shows its cereal with marshmallow pieces. It is a brand page, not a complete Canadian SKU roster or formula specification. Checked 2026-10-18. |
| `WP03-LUCKY-CHARMS-R699-20261018-S02` | Metro, [Frosted Toasted Oat Cereal with Marshmallows, Lucky Charms](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/family-cereals/frosted-toasted-oat-cereal-with-marshmallows/p/065633132122) | Current Canadian retailer listing identifies product 065633132122 as Lucky Charms cereal, 300 g, and describes frosted oats with coloured marshmallows. Its current ingredient panel is product-label evidence, not a permanent formula promise. Checked 2026-10-18. |
| `WP03-LUCKY-CHARMS-R699-20261018-S03` | Metro, [Céréales givrées avec des guimauves Lucky Charms](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-d-avoine-grillee-givrees-avec-des-guimauves/p/065633132122) | French-language listing for the same product number 065633132122 and 300 g package. Supports the proposed market-attested French title, not independent Québec editorial approval. Checked 2026-10-18; Metro's page may redirect to the English route. |
| `WP03-LUCKY-CHARMS-R699-20261018-S04` | Metro, [Céréales fruitées Lucky Charms](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-fruitees/p/065633150829) | Separate current Fruit Lucky Charms retailer listing, product 065633150829, 340 g. Used only to show the family-query boundary; it does not establish a complete Canadian lineup or support adding this sibling in R699. Checked 2026-10-18. |

## Recipe-demand and picker projection audit

- Searched the bundled manifest corpus (114 recipes / 1,123 ingredient rows) for `Lucky Charms`, `lucky-charms`, product number `065633132122`, and the exact English/French product wording. There are no matching recipe lines. This is a candidate-specific no-demand finding, not evidence that no user could ever request the product.
- The live ingredient-reference JSON, legacy-import identities, and ledger have no current owner for the brand or proposed title. Under the shared [ingredient search rules](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), current `Lucky Charms` and exact product-title queries therefore return no Lucky Charms reference.
- If only the proposed standard identity were added, `Lucky Charms`, `Frosted Toasted Oat Cereal with Marshmallows`, and `Céréales givrées avec des guimauves` would each project to that one row through its display names. That would make `Lucky Charms` look like a single-result brand family. The separate Fruit product above is already enough to show that this projection would be incomplete; the manufacturer brand page does not establish the full Canadian roster.
- Do not add a bare `Lucky Charms` alias to an otherwise narrower product row to conceal that family-scope gap. Review current Canadian manufacturer and retailer product listings together before deciding which distinct products should appear for the broad family query.

## Bounded disposition

Keep only the standard Canadian product as the held candidate; do not create an active row, ledger candidate, family alias, variant row, or package-size duplicate in R699. Reopen this exact candidate when a family-level picker review can establish the current Canadian roster and determine whether the standard product can be represented without presenting an incomplete `Lucky Charms` result set. Recipe demand is absent and supports keeping the scope narrow, but it is not being treated as a universal rule against source-backed branded cereal identities.

No catalog, ledger, packet, plan, or workflow files were changed. No tests, build, emulator, or deployment work was run; this is proposal-only research.

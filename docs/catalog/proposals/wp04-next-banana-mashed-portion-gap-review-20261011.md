# WP04 Proposal: Banana Mash Portion Gap Review

**Review date:** 2026-10-11

**Disposition:** Hold count-to-mass evidence for bundled recipe `073#10`. The linked publisher card exactly matches the recipe's three very ripe mashed bananas, but reports only a volume, not a mass. The available CNF mashed-banana mass-per-volume measure is not qualified for very-ripe fruit or tied to the publisher's weighing stage. No numeric ledger observation is supported from this source pair.

## Exact recipe-line audit

| Field | Bundled value |
|---|---|
| Recipe | `073`, *Chocolate Banana Bread*; source URL is [Preppy Kitchen](https://preppykitchen.com/chocolate-chip-banana-bread/). |
| Exact line | `073#10`, ingredient ID `c5486a31-4047-4437-ad8b-14a6e776bdd5-ingredient-10`: `3 bananas, mashed`; quantity `3`, unit `count`, reference `ingredient-ref-banana`, preparation `very ripe, mashed`. |
| Recipe method | The instructions add mashed bananas to the batter. The line has no fruit dimensions, measured mass, peel/weighing instruction, or indication whether any weight was recorded before or after mashing. |

## Publisher-page match and limits

Preppy Kitchen's linked recipe card lists **“3 very ripe bananas mashed (1 1/2 cups)”**. Its ingredient list gives gram amounts for several other ingredients but not the bananas. This is an exact match for the bundled count, ripeness, and mashed form, and it supports a source-reported **volume** for the publisher's recipe version. It does not publish a banana mass or state a weighing stage. The card's volume cannot be converted into a bundled count-to-mass observation from this source alone.

Health Canada's Canadian Nutrient File page for **Banana, raw / Banane, crue**, food code `1704`, lists `100 ml mashed = 95.1 g` and `250 ml mashed = 237.8 g`. It separately lists size-qualified whole-banana portions and 36% total refuse as skin. These are generic food-composition portions: the record does not identify very-ripe bananas, the publisher's exact fruit, or the stage at which the card's volume was measured. Multiplying the source-card volume by the CNF measure would create a derived estimate across that unresolved state and method boundary. This proposal does not do so.

| Dimension | Supported | Still unresolved |
|---|---|---|
| Count and recipe form | Three bananas, very ripe, mashed; the publisher also states 1 1/2 cups mashed. | The publisher gives no gram weight. |
| Edible versus purchase basis | Mashed banana is the recipe ingredient. CNF's weight portions are for edible banana and separately report skin refuse. | No source says when the publisher measured/weighed the fruit or documents a whole-fruit weight for these three bananas. Do not apply CNF's 36% refuse to the publisher's count or volume. |
| Fruit size and ripeness | Publisher calls the fruit very ripe. | No size or dimensions; CNF size-specific whole-fruit values do not identify these bananas. CNF's generic raw mashed measure does not specify ripeness. |
| Preparation/weighing stage | Both sources include mashed banana portions. | Neither establishes that the source card's volume and CNF's generic mashed portion share a measurement protocol or maturity state. No cooked batter or post-bake mass is reported. |

## Proposed ledger-only delta

- Add no `count_weight`, `portion_weight`, or other numeric measurement observation for `ingredient-ref-banana` from this review. Do not create an active count mapping, density, or conversion.
- If this gap is recorded in the ledger, add the two source citations below and one scoped unresolved decision under `ingredient-ref-banana`; set `measurementState` to `blocked_pending_evidence`. The decision should state that the linked recipe source confirms three very-ripe mashed bananas as 1 1/2 cups but gives no mass, while CNF's generic raw mashed-banana mass-per-volume figures do not establish a matching ripe-state or weighing basis.
- Leave the recipe quantity, unit, preparation, and ingredient reference unchanged. Do not scale CNF's size-specific whole-banana weights or derive a mass from the two-source volume comparison.

## Sources

Accessed 2026-10-11.

| Source ID | Source and locator | Claim and limit |
|---|---|---|
| `WP04-NEXT-BANANA-MASHED-20261011-S01` | Preppy Kitchen, [Chocolate Chip Banana Bread](https://preppykitchen.com/chocolate-chip-banana-bread/), updated 2023-08-06; recipe card ingredient list and instructions. | Lists three very ripe mashed bananas as 1 1/2 cups and adds the mash to batter. No banana mass or weighing stage is given. This is the directly linked publisher source for bundled `073#10`. |
| `WP04-NEXT-BANANA-MASHED-20261011-S02` | Health Canada, [Banana, raw / Banane, crue, CNF food code 1704](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1704), serving-size page. | Lists 100 ml mashed = 95.1 g, 250 ml mashed = 237.8 g, size-specific whole-fruit edible portions, and 36% refuse as skin. Does not qualify ripeness or identify the publisher's weighing/measurement stage; supports no direct numeric observation for this line. |

## Acceptance checks

1. Keep `073#10` at three bananas, count, with its very-ripe and mashed preparation.
2. Record no numeric mass, edible-portion yield, active mapping, or density from the publisher/CNF pair.
3. If recording the review, preserve the source citations and unresolved, source-scoped reason; do not imply CNF establishes a mass for the exact three recipe bananas.
4. Reconsider only if a source directly reports a mass for the same three very-ripe bananas or a measurement that establishes the matching ripe state and basis. Keep any reported volume distinct from mass.
5. This file is proposal-only. No canonical ledger, catalog, seed, plan, roadmap, code, or tests were changed; no tests were run.

## File checks

UTF-8 without BOM; no trailing whitespace. These checks apply to this proposal only.

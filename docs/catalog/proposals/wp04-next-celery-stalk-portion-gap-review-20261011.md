# WP04 Proposal: Celery Stalk Portion Gap Review

**Review date:** 2026-10-11

**Disposition:** Keep bundled `077#5` unresolved for count-to-mass. Its directly linked Ricardo source confirms one celery branch cut into small dice but gives no mass or stalk size. Existing CNF stalk weights remain valid source-specific observations for their stated lengths; none matches this line.

## Exact recipe-line audit

| Field | Bundled value |
|---|---|
| Recipe | `077`, *Salmon Pot Pie*; linked source is [RICARDO, Pâté au saumon style pot en pot de Ricardo](https://www.ricardocuisine.com/recettes/6174-pate-au-saumon-style-pot-en-pot-de-ricardo). |
| Exact line | `077#5`, ingredient ID `b8e3b67d-3a62-4e68-8842-457c86bbab5f-ingredient-5`: `1 celery stalk, cut into small dice`; quantity `1`, unit `count`, reference `ingredient-ref-celery`. No stalk size or trim instruction is stored. |
| Method | The source softens the leek and celery in butter before adding flour and liquids. The recipe gives no mass before or after cooking. |

## Direct source match and limits

The linked RICARDO ingredient list says **“1 branche de céleri, coupée en petits dés”**: one celery branch cut into small dice. It also gives gram amounts for several other ingredients, but not for celery. Its count and cut match bundled `077#5`; the page provides no stalk length, diameter, or mass. The page labels the recipe presentation as advertising content made by or for an advertiser, so this review treats it only as the directly linked recipe card, not as a general celery measurement authority.

Health Canada's CNF record for **Celery, raw / Céleri, cru**, food code `2386`, gives small stalk (13 cm) = 17 g, medium stalk (19–20 cm) = 40 g, and large stalk (28–31 cm) = 64 g; it separately reports 11% refuse as roots and trimmings. These published portions are size-qualified. The publisher does not identify which length its one branch represents or whether the stated quantity includes the trimmings represented in CNF refuse. CNF also lists diced-volume measures, but the publisher gives no diced volume. No value can be assigned without selecting an unsupported stalk size or converting an unmatched volume.

| Dimension | Supported | Unresolved |
|---|---|---|
| Count and cut | One celery branch/stalk, cut into small dice. | No dimension or weight for the counted stalk. |
| State and cooking | The amount is added before the source softens the celery in butter; CNF portions describe raw celery. | No cooked weight or cooking-yield measure is reported. Do not apply a raw stalk weight to the cooked ingredient. |
| Edible/purchase basis | CNF records 11% refuse as roots and trimmings. | The recipe does not state whether its branch was trimmed or weighed with those parts. Do not apply the refuse percentage to the recipe count. |

## Proposed ledger-only delta

- Add no `count_weight`, `portion_weight`, `edible_portion_yield`, or cooking-yield observation for bundled line `077#5` from this source review.
- If recording this review in the ledger, add the direct recipe source below and an unresolved decision scoped to `077#5` under `ingredient-ref-celery`. Keep `measurementState: researched_supported` because the reference already has valid CNF observations for size-specific stalk portions; the line-specific decision should say none matches an unspecified stalk.
- Retain the existing CNF observations and source ID `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S02` unchanged. Add no active count mapping, density, or recipe edit.

## Sources

Accessed 2026-10-11.

| Source ID | Source and locator | Claim and limit |
|---|---|---|
| `WP04-NEXT-CELERY-STALK-20261011-S01` | RICARDO, [Pâté au saumon style pot en pot de Ricardo](https://www.ricardocuisine.com/recettes/6174-pate-au-saumon-style-pot-en-pot-de-ricardo), ingredient list and method. | Lists one celery branch cut into small dice and softens it in butter. No stalk size, mass, trim basis, or cooked weight is given. The page identifies its presentation as advertising content. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S02` | Health Canada CNF, [Celery, raw / Céleri, cru, food code 2386](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2386), serving-size page. | Existing ledger source: small 13 cm = 17 g, medium 19–20 cm = 40 g, large 28–31 cm = 64 g; 11% refuse as roots and trimmings. Does not identify the size or trim basis of the publisher's one branch. |

## Acceptance checks

1. Keep `077#5` at one celery stalk, cut into small dice; do not choose a CNF size class.
2. Add no numeric observation for the recipe line, no conversion from diced volume, and no cooking-yield or refuse adjustment.
3. If integrating the audit, retain the existing size-specific CNF source observations and add only the source-scoped unresolved decision.
4. Resolve the line only with direct evidence of the matching stalk's size and edible/as-purchased basis, or a directly published mass for this recipe's celery branch.
5. This file is proposal-only. No canonical ledger, catalog, seed, plan, roadmap, code, or tests were changed; no tests were run.

## File checks

UTF-8 without BOM; no trailing whitespace. These checks apply to this proposal only.

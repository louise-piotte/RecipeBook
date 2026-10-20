# WP04 Proposal: Maraschino-Cherry Count Portion Review

**Review date:** 2026-10-10  
**Status:** Proposal-only; one exact source-specific portion candidate and one held recipe line.

## Scope and disposition

This packet selects the two count-like maraschino-cherry lines in the bundled recipe corpus as one coherent fruit-identity group. Both lines map to `ingredient-ref-cerises-au-marasquin`. USDA Standard Reference Release 28 (SR28) has an exact source record and a one-cherry count measure for *Maraschino cherries, canned, drained*. That portion matches the drained recipe line. Keep the second line held because its recipe text does not state that the cherries are drained.

Recommend only the exact source-specific published portion defined below. This proposal does not add a generic `item` conversion, density, or recipe edit. The SR28 record is from 2015 and describes a published edible portion, not market-size measurements or a current product sample.

## Recipe-line mappings

The ingredient rows were checked in the live bundled JSON on 2026-10-10.

| Recipe line ID | Recipe ingredient text | Amount / unit | Current mapping | Disposition |
| --- | --- | --- | --- | --- |
| `5719878d-25d9-40df-9f2c-8035a862f9e4-ingredient-7` | `16 maraschino cherries, drained and chopped` | 16 `item` | `ingredient-ref-cerises-au-marasquin` | Candidate: matches canned, drained maraschino cherries and the source’s one-cherry portion. Chopping is preparation, not a different source measure. |
| `4a10822e-551d-4738-b0c2-d7492fb5b86f-ingredient-8` | `18 maraschino cherries` | 18 `item` | `ingredient-ref-cerises-au-marasquin` | Hold: the recipe does not specify drained cherries, while the source food description does. Do not assume or add a drained state. |

## Exact candidate observation

Proposal-local source ID: `WP04-MARASCHINO-PORTION-20261010-S01`.

| Field | Exact proposed source-specific value |
| --- | --- |
| Relationship | `count_weight` |
| Evidence kind | `published_portion` |
| Food record | USDA SR28, NDB `09328`, *Maraschino cherries, canned, drained* |
| Published portion | `1 cherry (NLEA serving)` |
| Published edible weight | `5.0 g` |
| Refuse / edible basis | Record lists `0%` refuse; canned, drained product |
| Exact recipe demand | `5719878d-25d9-40df-9f2c-8035a862f9e4-ingredient-7` only |

The observation is exactly the one-cherry measure published for this food record. This proposal does not compute or store a 16-cherry total. The measure must remain tied to NDB `09328`, its canned/drained description, and the SR28 source; it does not establish a weight for cherries that retain syrup or brine, fresh cherries, other preserved cherries, or an unspecified item.

## Source and retrieval record

| Source ID | Official source and locator | Evidence / limits |
| --- | --- | --- |
| `WP04-MARASCHINO-PORTION-20261010-S01` | USDA ARS, [Standard Reference Release 28, Food Group 09: Fruits and Fruit Juices](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf#page=526), NDB `09328`; PDF pp. 525–526. | The record title is *Maraschino cherries, canned, drained* and lists 0% refuse (p. 525). Its common-measure entry is `Measure 1 = 5.0g: 1 cherry (NLEA serving)` (p. 526). The official PDF was readable on 2026-10-10. This is a USDA SR28 2015 published portion, not a current market-size observation. |

The record is an exact identity and count match for the drained line. No size qualifier is attached to the one-cherry measure. The undrained-unspecified recipe line remains held because a source-specific drained portion cannot establish the weight of an unqualified product retaining liquid.

## Current pre-integration snapshot

At review time, `ingredient-ref-cerises-au-marasquin` is a `FRUIT` reference with English name `maraschino cherries`, French name `cerises au marasquin`, alias `marasquino cherries`, `defaultDensity: null`, and `unitMappings: []`. It has no ingredient form. Its ledger record is `identityState: unreviewed`, `measurementState: not_yet_researched`, with no sources or decisions. The two recipe rows above are the only current count-like recipe demand mapped to this reference found in the corpus scan. The bundled corpus contains 114 recipes and 1,123 ingredient rows.

Snapshot hashes before integration of this proposal:

| Artifact | Bytes | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 242,893 | `086adb131bf0abf4df3b25be430878173ce51a8ac1bcb2191834b4b73b72a4b4` |
| `research-ledger.v1.json` | 2,179,459 | `f5d9274cd2172ea491df20679a0d273f31ecf684f715d8833e6458f7d3fa2289` |
| 114 recipe files, sorted relative paths / bytes | 750,593 combined | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

## Integration boundary

If independently accepted, add only the source-specific `published_portion` observation for one canned, drained maraschino cherry at 5.0 g, linked to source ID `WP04-MARASCHINO-PORTION-20261010-S01` and the matching drained recipe line. Keep the second recipe line held until its drainage state is established. Do not convert the source observation into a general `item` mapping or infer the recipe’s total weight.

No canonical seed, ledger, recipe, plan, roadmap, test, or code file was edited. No tests were run.

# WP07 — Common Baking Measurement Evidence

## Packet record

- **Owner:** WP07 measurement research agent (delegated packet)
- **Reviewer:** Pending; integration lead / measurement reviewer
- **Status:** `in_review`
- **Date:** 2026-10-05
- **Revision:** r2
- **Catalog baseline:** `0caaef8`; checked against the current `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- **Scope:** Source-published portion-weight observations for current baking identities: all-purpose flour, bread flour, cake flour, granulated sugar, packed brown sugar, icing sugar, cocoa powder, butter, and chocolate forms with a matching source description. No seed, schema, code, or plan changes are made in this packet.
- **Dependencies:** WP01 identity/evidence contract and stable current catalog IDs; WP02-WP06 identity batches remain pending in the workflow record. Numeric observations below are evidence candidates only until reviewer disposition.
- **Source access date:** 2026-10-05

## Evidence handling

The observations below reproduce the source's own volume, ounce, and gram columns. “Ounces” is the source chart's weight column, not fluid ounces. The chart labels the volume column but does not define cup capacity or a measurement system on this page. Cup observations therefore remain source-specific portion equivalences; they are not converted to millilitres, g/mL, or another cup convention. No values are averaged, scaled, or promoted to physical density.

The chart supplies food descriptions, values, and selected qualifiers, but does not give a weighing or filling protocol for each row. Where no method is stated, that absence is recorded as unknown. A separate King Arthur flour-method article is included as a separate approximate observation rather than used to retrofit a method onto the chart rows.

## Source-published observations

“Accepted” here means accepted into this evidence packet as a faithful source observation. It does not mean approved for the shared catalog or runtime.

| Record | Current catalog identity / disposition | Exact source food description | Original published equivalence | Method or basis stated by source | Source locator and limitations |
| --- | --- | --- | --- | --- | --- |
| KAB-IWC-01 | `ingredient-ref-all-purpose-flour`; product/chart observation, generic catalog applicability needs reviewer confirmation | “All-Purpose Flour” | 1 cup = 4 1/4 oz = 120 g | Ingredient Weight Chart row; row-specific fill/settling protocol not stated. | [S1], “All-Purpose Flour” row, chart line 232. The row links to King Arthur product material; do not assume every brand/formulation or cup convention is identical. |
| KAB-FLOUR-01 | `ingredient-ref-all-purpose-flour`; separate approximate, method-qualified observation | All-purpose flour | Around 120 g per cup | King Arthur recommends fluffing the flour, spooning it into the cup until overflowing, then leveling with a straight edge (“Fluff, Sprinkle, and Scrape”). | [S2], “How to measure flour with measuring cups,” article dated 2023-10-13, lines 238, 249-252. Value is explicitly approximate; do not collapse it into the exact chart observation. |
| KAB-IWC-02 | `ingredient-ref-bread-flour`; exact description-level candidate | “Bread Flour” | 1 cup = 4 1/4 oz = 120 g | Ingredient Weight Chart row; row-specific measuring protocol not stated. | [S1], “Bread Flour” row, chart line 269. The page does not state flour brand, sifting state, or cup capacity. |
| KAB-IWC-03 | `ingredient-ref-cake-flour`; product-limited candidate only | “Unbleached Cake Flour” | 1 cup = 4 1/4 oz = 120 g | Ingredient Weight Chart row; row links to a King Arthur product. No row-specific measuring protocol is stated. | [S1], “Unbleached Cake Flour” row, chart line 532. This does not establish a universal value for all cake flour, bleached cake flour, or another product. |
| KAB-IWC-04 | `ingredient-ref-granulated-sugar`; exact description-level candidate | “Sugar (granulated white)” | 1 cup = 7 oz = 198 g | Ingredient Weight Chart row; measuring/settling protocol not stated. | [S1], “Sugar (granulated white)” row, chart line 514. Cup capacity is unspecified on the page. |
| KAB-IWC-05 | `ingredient-ref-brown-sugar`; packed observation; source reports light and dark together | “Brown sugar (dark or light, packed)” | 1 cup = 7 1/2 oz = 213 g | Packing is explicit; firmness/packing procedure is not stated. | [S1], “Brown sugar (dark or light, packed)” row, chart line 275. The table does not publish separate light- and dark-brown values. |
| KAB-IWC-06 | `ingredient-ref-icing-sugar`; unsifted observation recorded in the ledger | “Confectioners' sugar (unsifted)” | 1 cup = 4 oz = 113 g | Unsifted is explicit; cup filling/settling method is not stated. | [S1], “Confectioners' sugar (unsifted)” row, chart line 328. Retain the unsifted qualifier; do not use this as a sifted-sugar observation. |
| KAB-IWC-07 | Held; no exact current-ID assignment | “Cocoa (unsweetened),” chart link targets Triple Cocoa Blend | 1/2 cup = 1 1/2 oz = 42 g | Ingredient Weight Chart row; no fill method or cup convention stated. The linked blend includes Dutch, natural, and black cocoa. | [S1], “Cocoa (unsweetened)” row, chart line 315; linked [Triple Cocoa Blend product](https://shop.kingarthurbaking.com/items/triple-cocoa-blend). Do not assign the blend to either split cocoa identity or scale the half-cup value. |
| KAB-IWC-08 | No exact current-ID assignment; generic butter observation, salt status unresolved | “Butter” | 8 tablespoons (1/2 cup) = 4 oz = 113 g | Ingredient Weight Chart row; salt status, temperature, and measuring method are not stated. | [S1], “Butter” row, chart line 279. The current mapped identity is unsalted butter; the source does not qualify salt status. Preserve the source's half-cup portion without scaling it. |
| KAB-IWC-09 | Product-linked bittersweet-chip evidence; no matching bittersweet-chip form exists | “Chocolate Chips,” chart link targets Guittard Bittersweet Chocolate Chips | 1 cup = 6 oz = 170 g | Ingredient Weight Chart row; chip size and filling method are not stated. | [S1], “Chocolate Chips” row, chart line 309; linked [Guittard bittersweet chocolate chips](https://shop.kingarthurbaking.com/items/guittard-bittersweet-chocolate-chips). Keep the source portion held; do not attach it to the bittersweet chocolate base identity or create a form from this source alone. |
| KAB-IWC-10 | `ingredient-ref-white-chocolate`; exact chocolate-type candidate with chip form retained in evidence | “White Chocolate Chips” | 1 cup = 6 oz = 170 g | Ingredient Weight Chart row; size, brand, formulation, and cup-filling method are not stated. | [S1], “White Chocolate Chips” row, chart line 543. The source identifies white chocolate but not a particular product or chip size. |
| KAB-IWC-11 | Chocolate type unresolved; mini-chip form does not resolve the base chocolate identity | “Mini chocolate chips” | 1 cup = 6 1/4 oz = 177 g | Ingredient Weight Chart row; chocolate type, brand, and cup-filling method are not stated. | [S1], “Mini chocolate chips” row, chart line 434. Keep distinct from the ordinary-chip observation; do not treat it as a universal chocolate-chip value. |
| KAB-IWC-12 | Chocolate type unresolved; retain as a chopped-form observation only | “Chocolate (chopped)” | 1 cup = 6 oz = 170 g | Ingredient Weight Chart row; chocolate type, chop size, brand, and cup-filling method are not stated. | [S1], “Chocolate (chopped)” row, chart line 308. This is not evidence for chips or for any one chocolate type. |
| KAB-IWC-13 | Chocolate type unresolved; retain as a chunk-form observation only | “Chocolate Chunks” | 1 cup = 6 oz = 170 g | Ingredient Weight Chart row; chocolate type, chunk size, brand, and cup-filling method are not stated. | [S1], “Chocolate Chunks” row, chart line 310. This is not evidence for chips or for any one chocolate type. |

## Unresolved gaps and catalog comparisons

At the initial catalog baseline (`0caaef8`), the seed contained the source-less draft factors below. They have since been removed from the active catalog; this historical comparison is retained to guide review and is not a statement of current seed values:

| Current ID | Historical draft factor at `0caaef8` | Packet evidence | Review gap |
| --- | ---: | --- | --- |
| `ingredient-ref-all-purpose-flour` | 120 g/cup | Chart row publishes 120 g/cup; the flour article says around 120 g/cup for its spoon-and-level technique. | Confirm the product-linked chart row is adequate for the generic identity and settle the cup convention/method scope. |
| `ingredient-ref-bread-flour` | 127 g/cup | Chart's generic “Bread Flour” row publishes 120 g/cup. | Resolve the 7 g difference by exact source/product/method match; do not average. |
| `ingredient-ref-cake-flour` | 113 g/cup | “Unbleached Cake Flour” product row publishes 120 g/cup. | The source is product-qualified and differs from the seed factor; obtain an exact match for the intended cake-flour identity or retain product-specific evidence only. |
| `ingredient-ref-granulated-sugar` | 200 g/cup | “Sugar (granulated white)” publishes 198 g/cup. | Resolve the 2 g difference by source and intended recipe convention; do not average. |
| `ingredient-ref-brown-sugar` | 220 g/cup | “Brown sugar (dark or light, packed)” publishes 213 g/cup. | Resolve the 7 g difference and retain packed/light-dark qualifiers. |
| `ingredient-ref-icing-sugar` | 120 g/cup | “Confectioners' sugar (unsifted)” publishes 113 g/cup. | Resolve the 7 g difference; current mapping does not state sifted status. |
| `ingredient-ref-unsweetened-cocoa-powder` and `ingredient-ref-dutch-process-cocoa-powder` | 85 g/cup each | “Cocoa (unsweetened)” publishes 1/2 cup = 42 g. | Source does not identify natural versus Dutch process; no catalog assignment or cup scaling is supported here. |
| `ingredient-ref-unsalted-butter` | 227 g/cup | “Butter” publishes 1/2 cup = 113 g. | Salt status is absent and published portion is half a cup; no scaling or unsalted assignment is made. |
| `ingredient-ref-semisweet-chocolate` | 170 g/cup | “Chocolate Chips” and “Chocolate Chunks” each publish 1 cup = 170 g; chopped chocolate has same published value. | Chocolate type and form do not match the semisweet base identity exactly. Numeric agreement does not validate the current factor. |
| `ingredient-ref-white-chocolate` | 170 g/cup | “White Chocolate Chips” publishes 1 cup = 170 g. | Chocolate type matches, but review whether the product/form observation may support the base identity's conversion and what qualifiers must remain. |

Additional open questions are cup capacity/system, flour brand and storage/form state, sugar filling procedure, cocoa processing, butter salt and temperature, and chocolate formulation/particle size. The chart itself warns that recipe pages may show different gram amounts due to rounding and similar factors; it advises following the particular recipe's published weight. This chart note is a limitation, not a license to merge recipe-specific values into this packet.

## Integration review snapshot (checked 2026-10-05)

- The seed has **no active ingredient-specific densities or unit mappings** (0 non-null default densities, 0 reference mappings). At the 2026-10-05 review snapshot, each of the 11 matching ingredient-reference ledger records was `blocked_pending_evidence` with `sources: []` and documented removal of source-less draft values. On 2026-10-06, two sources and their distinct portion observations were added only to granulated sugar; its measurement state remains blocked. Do not restore any historical factor from the comparison table as an active value.
- The ledger's `cup` unit conversion is explicitly the **U.S. cup** and is sourced to NIST. King Arthur's chart publishes “cup” but does not specify cup capacity/system. NIST therefore defines the app unit; it does not prove that the chart's source cup is the same measure. Keep all chart cup-weight observations source-qualified until this mapping is confirmed.
- **No packet value currently meets the full bar for activation as a generic ingredient mapping or density:** source food, measure definition, and units must all match the canonical identity/unit without dropping a qualifier.
- None of the packet values supports a physical `g/mL` density. The chart publishes ingredient portion weights for named volume portions; its ounce column is mass, not fluid volume.
- The strongest exact-description candidates for a reviewer to carry forward as non-active portion observations are generic “Bread Flour” (1 cup, 4 1/4 oz, 120 g), “Sugar (granulated white)” (1 cup, 7 oz, 198 g), “Brown sugar (dark or light, packed)” (1 cup, 7 1/2 oz, 213 g), and “Confectioners' sugar (unsifted)” (1 cup, 4 oz, 113 g). Their source values are direct, but no runtime mapping qualifies yet because the chart's cup system is unspecified and row-specific filling methods are absent. Keep packed/unsifted qualifiers.
- The all-purpose flour article separately supports **around** 120 g for the named fluff/spoon/level method. It remains approximate and its cup convention is not explicit. The cake-flour row is product-linked; cocoa process, butter salt status, and non-white chocolate type are unresolved. White chocolate chips are source-matched by chocolate type but remain a chip-form portion, not a generic white-chocolate conversion.
- At this snapshot, source observations had not yet been entered into the measurement ledger. The granulated-sugar observations were added in the dated update below; other packet observations remain packet-only until individually reviewed.

## Integration update (2026-10-06): granulated-sugar portion observations

Added two source-qualified, non-active `portion_weight` observations to the `ingredient-ref-granulated-sugar` ledger record: USDA SR28, “Sugars, granulated,” reports 1 cup = 200 g [S4]; King Arthur, “Sugar (granulated white),” reports 1 cup = 7 oz = 198 g [S1]. Neither source states the cup capacity or row-specific filling method. The two values remain separate and are not averaged. The ledger identity's `measurementState` remains `blocked_pending_evidence`; no density, active unit mapping, cup-to-mL conversion, or runtime conversion was added. Reviewer confirmation of cup compatibility and ingredient-scope remains open.

## Integration update (2026-10-10): cocoa and chocolate portions

Added source-specific portions to the evidence ledger and kept all runtime measurements inactive. The process-unspecified unsweetened-cocoa reference retains USDA SR28 NDB 19165 (1 source cup = 86 g; 1 source tablespoon = 5.4 g). The natural-cocoa reference now owns the exact Hershey Natural Unsweetened Cocoa label serving (1 tablespoon = 5 g) and King Arthur birthday-cake frosting amounts (1 1/4 cups = 106 g; lighter option 1 cup = 85 g). Dutch-process cocoa remains separate: USDA SR28 NDB 19166, explicitly alkali-processed, reports the same 86 g/cup and 5.4 g/tablespoon. The two NDB foods are not merged.

Semisweet chocolate-chip form observations now retain Callebaut SKU 209671's label serving (1 tablespoon = 14 g), its linked recipe/package portion (2 cups = 340 g semisweet or bittersweet chips), USDA SR28 NDB 19701 values for regular/large/mini chips (170/182/173 g per source cup), and historical USDA Home and Garden Bulletin 72 semisweet chips (168 g/cup). Milk chips (168 g/cup) and white chips (170 g/cup) from the historical table remain separate; the King Arthur white-chip row (170 g/cup) is also retained separately with product, size, cup, and fill method unstated. The FDA label guidance's 240 mL cup / 15 mL tablespoon / 5 mL teaspoon convention applies to nutrition labels only; it does not define the app's units or recipe/chart cups.

The King Arthur cocoa chart row's link is to a Dutch/natural/black cocoa blend, so its 42 g per half-cup remains held and unassigned. Its ordinary “Chocolate Chips” row links to Guittard bittersweet chips; because the catalog has no bittersweet-chip form, the 170 g/cup row remains held. The mini-chip chart row does not identify a chocolate type and remains unassigned. None of these values was scaled, averaged, converted to density, or activated as a unit mapping. Full source IDs, citations, per-observation qualifiers, and verification are in [the WP05/WP06/WP07 integration report](wp05-wp06-wp07-condiment-cocoa-evidence-integration-20261010/README.md) and [the WP07 proposal](../proposals/wp07-cocoa-chocolate-portion-evidence-review-20261010.md).

## Integration update (2026-10-12): icing-sugar portions

Added nine source-specific, non-active `portion_weight` observations to the existing
`ingredient-ref-icing-sugar` ledger record. King Arthur Baking reports 1 cup unsifted confectioners'
sugar = 113 g. Health Canada CNF 2015 Food Code 4319 reports 5 ml = 2.5 g, separate unsifted
100/125/250 ml portions (50.7/63.4/126.8 g), and separate sifted 100/125/250 ml portions
(42.3/52.8/105.7 g). Health Canada's 2008 Table 15 reports 5 ml = 3 g; retain it separately from
the CNF value. The source cup system and filling methods remain unspecified; no measures were
averaged or scaled, and no density or mapping was activated. The 2026 CNF package was listed
publicly, but its matching food/measure rows were not retrieved through the available route (403);
this is an access gap, not an absence finding. The ledger remains `blocked_pending_evidence`, with
active density null, unit mappings empty, and substitutions not yet researched. See the [WP07
integration note](wp07-icing-sugar-portion-integration-20261012/README.md) and [review proposal](../proposals/wp07-icing-sugar-portion-observations-review-20261012.md).

## Rejected or inapplicable evidence

- Existing seed factors were not accepted as source observations: the JSON records a number but not the measurement source, method, product, or basis needed by WP07.
- The King Arthur “Cocoa (unsweetened)” row was not assigned to either cocoa reference because its link is a Dutch/natural/black blend, not one exact current identity.
- The King Arthur “Chocolate Chips” row was not assigned to a base chocolate identity: its product link is bittersweet chips and the catalog has no matching form. Mini chips, chopped chocolate, and chunks also remain unassigned because their identity/form links are unresolved.
- Generic “Butter” was not assigned to `ingredient-ref-unsalted-butter`: the source omits salt status.
- “Unbleached Cake Flour” was not generalized to all cake flour. It remains a King Arthur product observation.
- No cup-to-mL conversion or g/mL density was derived because the chart does not define cup capacity and the observations are source-published portion weights.
- No half-cup value was scaled to a cup, and no source observations were averaged.

## Sources

- **[S1]** King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), live undated chart; accessed 2026-10-05. Locators are the named table rows and chart line numbers listed above. The page describes itself as a quick reference for volume, ounce, and gram equivalencies and recommends weighing ingredients. The cup system and row-specific measuring protocol are not defined on the page. It notes that recipe-site gram amounts may differ due to rounding and similar factors.
- **[S2]** Rossi Anastopoulo, King Arthur Baking, [How to measure flour the right way](https://www.kingarthurbaking.com/blog/2023/10/13/how-to-measure-flour), published 2023-10-13; accessed 2026-10-05. Locators: “If you fluff, scoop, and level” discussion and “How to measure flour with measuring cups.” It reports around 120 g for this technique, contrasts up to 160 g for more compacted flour, and describes fluffing, spooning into the cup until overflowing, and leveling. This is an approximate, technique-specific all-purpose-flour observation.
- **[S3]** NIST, [Guide to the SI, Appendix B.9: Factors for units listed by kind of quantity or field of science](https://www.nist.gov/pml/special-publication-811/nist-guide-si-appendix-b-conversion-factors/nist-guide-si-appendix-b9), accessed 2026-10-05. Locator: Volume table, “cup (U.S.)” row. This supports the current app's U.S.-cup unit definition only; it does not establish the cup convention used by [S1] or a food-specific portion weight.
- **[S4]** USDA Agricultural Research Service, [USDA National Nutrient Database for Standard Reference, Release 28, report SR28fg19](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg19.pdf), accessed 2026-10-06. Locator: p. 736, NDB No. 19335, “Sugars, granulated,” common-measures table, Measure 3 = 200 g for 1 cup. The table does not state cup capacity or a filling method for this row; this is a source-qualified portion observation only.

## Acceptance checks

- [x] Each numeric observation preserves the source food description and published amount/unit equivalence.
- [x] Source locator, URL/title, access date, basis, and material limitations are present for every observation.
- [x] Source-specific cup weights remain portion equivalences; no physical density, cup-to-mL value, average, or unstated scaling is introduced.
- [x] Identity, preparation, packing, and form mismatches are recorded as unresolved rather than silently generalized.
- [x] Historical baseline mappings are compared with the checked current seed; no value was reactivated or treated as verified.
- [x] The two published granulated-sugar values are recorded separately in the evidence ledger with source, food description, cup basis, and unknown convention/method retained; the runtime state remains blocked.
- [ ] Reviewer assigns final observation and catalog-mapping states, including disposition of the existing factors.
- [ ] Reviewer confirms whether the chosen cup convention can safely match the app's `cup` unit and whether any product-specific observations may support generic identities.
- [ ] WP07 broadens beyond this priority packet after exact identities and high-value source coverage are reviewed.

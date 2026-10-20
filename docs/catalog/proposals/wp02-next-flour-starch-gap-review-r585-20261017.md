# WP02 B3 R585 — pea-starch measurement and formulation evidence

- **Reviewed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17. The coordinator updated only the existing pea-starch ledger evidence, the relevant plan entries, this proposal, the roadmap, and the integration README; the active reference row is unchanged.
- **Scope:** Close one bounded evidence gap for the existing `ingredient-ref-pea-starch` row: kitchen-use measurement and source-specific replacement evidence for native pea starch. This does not reopen the accepted pea-starch identity or revisit the separate modified-pea-starch row.
- **Integration:** **Evidence-only.** Recorded the scoped Accu-Gel replacement guidance in the research ledger and marked kitchen-measure research as reviewed with no supported value. Added no reference, alias, form, density, unit mapping, recipe link, yield, conversion, or active substitution rule.
- **Plan anchor:** The open parent is `docs/RecipeBook-global-ingredient-catalog-plan.txt:15837`, `[ ] Continue broader WP02 B2/B3 flour and starch review.` The related B3 checklist parent remains open at line 3073: `[ ] Water-chestnut flour and other documented regional starches.` The existing pea-starch identity is recorded in the completed 2026-10-12 checklist entry near line 14923; its measurement and substitution follow-up was left open in the [identity proposal](wp02-b3-pea-starch-identity-review-20261012.md).

## Integrated disposition

Keep the live identity unchanged:

| Field | Existing value | R585 disposition |
|---|---|---|
| ID | `ingredient-ref-pea-starch` | Retain. |
| English display / alias | `pea starch`; `native pea starch` | Retain; add no alias. |
| Québec French display | `amidon de pois` | Retain. The independent terminology follow-up confirmed this wording. |
| French aliases | None | Keep empty; do not add `amidon natif de pois` or `fécule de pois`. |
| Category | `FLOUR_AND_STARCH` | Retain. |
| Forms | None | Add none. |
| `defaultDensity` / `unitMappings` | `null` / `[]` | Retain; no kitchen measure or transferable food-grade bulk density was established. |

The coordinator updated only the existing ledger record for `ingredient-ref-pea-starch`:

- Set `measurementState` to `researched_no_supported_value` for a generic cooking measure or density; leave `measurementObservations` empty. Roquette reports a density for a named pharmaceutical/nutraceutical powder, but the source does not establish a household food measure or a value representative of cooking-grade pea starch.
- Set `substitutionResearchState` to `researched_supported` and add one bounded finding for Nutri-Pea’s Accu-Gel product guidance. The finding may name the existing `ingredient-ref-rice-flour` and `ingredient-ref-potato-starch` references as replacement contexts, with no quantities, adjustments, or active `ruleId`. Make clear that the manufacturer does not provide a recipe-level ratio for the named rice-flour or potato-starch replacements, and that the evidence applies to its named product and gluten-free baked goods only.
- Add no supported ledger finding for a generic wheat-flour replacement. A primary noodle study reports 20% and 30% pea-starch replacement of wheat flour in one composite-noodle experiment, but the source is a product-specific experimental formula, not a household conversion or reusable baking rule. Preserve that boundary in this proposal’s evidence notes.
- Keep all recipe links, ingredient forms, mass-volume mappings, yields, and active substitution rules absent.

The positive manufacturer claims are retained as source-bounded ledger findings. The experimental noodle and low-fat bologna studies further show that performance depends on the target food and formula; neither supports a general flour-or-starch exchange rule. [Nutri-Pea](https://nutripea.com/products/accu-gel-pea-starch/), [Kim et al.](https://kiss.kstudy.com/Detail/Ar?key=1983741), [Pietrasik and Soladoye](https://doi.org/10.1016/j.meatsci.2020.108283)

## Existing ownership and picker effect

The live reference owns `pea starch / amidon de pois` and the English alias `native pea starch`. The separate `ingredient-ref-modified-pea-starch` row owns `modified pea starch / amidon de pois modifié`. R585 adds no name or alias, so the bilingual picker projection remains unchanged. The current complete-phrase-first search implementation is in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Query | Current result(s) | R585 effect |
|---|---|---|
| `pea starch` | Native/general pea starch and modified pea starch | None. |
| `amidon de pois` | Native/general pea starch and modified pea starch; the shorter phrase also occurs in the modified row | None. |
| `native pea starch` | Native/general pea starch only | None. |
| `amidon de pois modifié` | Modified pea starch only | None. |
| `pea flour` / `farine de pois` | Existing flour results | None. |

For fr-CA, retain the established display `amidon de pois`, supported by the existing [OQLF `amidon` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon) and the [Montréal SUE Foods French ingredient listing](https://suefoods.com/products/pagoda-brand-vermicelles-aux-haricots-lungkow). OQLF’s general distinction between *amidon* and *fécule* is not a pea-specific compound entry; the current display is already adjudicated in the [Québec terminology follow-up](wp02-b3-pea-starch-quebec-term-adjudication-20261012.md). No new French wording is proposed.

## Measurement and formulation evidence

**Kitchen measure and density.** The current [Nutri-Pea Accu-Gel page](https://nutripea.com/products/accu-gel-pea-starch/) describes its named Canadian-yellow-pea product as native and highly purified (>98.5% starch), but gives no spoon/cup mass, package-to-volume relation, or dry powder bulk density. The previously registered [Phlex Pea Starch page](https://phlexproteins.com/product/pea-starch) remains suitable for identity evidence only; its earlier review flagged internally unclear protein/nutrition fields, so no number from that page is used. The current [Roquette PEA STARCH N-735 technical page](https://www.roquette.com/health-pharma/pharmaceutical-product-catalog/pea-starch-n-735) reports bulk density 0.62 g/mL and tapped density 0.83 g/mL for a named very-fine powder used in pharmaceutical and nutraceutical dosage forms. Those are product- and use-specific bulk properties, not cup conversions or evidence for a grocery cooking ingredient.

One recent paper is also an exclusion, not a density source for the active row: Etti et al. identify the experimental Starlite input as pea carbohydrate-rich fraction with 65% starch, 12% protein, 12% moisture, and 2.5% ash. The fraction is not purified native pea starch, and the paper’s 45 mL density procedure is on incubated beverage samples. Do not transfer its reported values to the active reference. [Etti et al., 2026](https://onlinelibrary.wiley.com/doi/full/10.1002/star.70255)

**Replacement evidence.** Nutri-Pea says Accu-Gel can replace up to 50% of commonly used gluten-free starches and flours. It specifically describes using Accu-Gel in place of rice flour and potato starch in gluten-free muffins, cookies, and cakes, with improved texture and softness. The page gives neither the formulation nor an amount for each named replacement. Record this only as manufacturer guidance for the named product and baked-food context; do not calculate or encode a 1:1 ratio, 50% recipe quantity, or rule for all pea starch.

The primary Korean noodle study compared pea-starch/wheat-flour composites with 20% and 30% pea starch and judged 20% more suitable than 30% for the tested noodles. Its abstract describes a specific noodle formulation and reports changes in cooking loss and texture; it does not establish a replacement ratio for other wheat-flour recipes. Pietrasik and Soladoye tested native pea starches against modified corn starch in low-fat bologna. The paper reports the modified corn starch was more effective than pea starch in alleviating cook loss and related outcomes. These results reinforce product- and dish-specific behavior; they do not support general interchangeability. [Kim et al.](https://kiss.kstudy.com/Detail/Ar?key=1983741), [Pietrasik and Soladoye](https://doi.org/10.1016/j.meatsci.2020.108283)

## Bundled recipe demand

The current manifest lists **114 recipe files and 1,123 ingredient rows**. A read-only scan of every manifest-listed recipe JSON file found **zero** occurrences of `pea starch`, `native pea starch`, `amidon de pois`, `modified pea starch`, `amidon de pois modifié`, `ingredient-ref-pea-starch`, or `ingredient-ref-modified-pea-starch`. No recipe link or recipe-driven alias is proposed.

## Source ownership and reuse

The exact source-ID prefix `WP02-B3-PEA-STARCH-MEASURE-SUB-R585-20261017` and the new source URLs below were checked against `docs/` and the bundled seed package; no existing entries were found. Reuse existing identity and terminology evidence rather than adding duplicate source records: `WP02-B3-PEA-STARCH-IDENTITY-20261012-S02` (Phlex product identity), `WP02-B3-PEA-STARCH-IDENTITY-20261012-S04` (SUE Foods French label), and `WP02-B3-PEA-STARCH-QUEBEC-TERM-20261012-S01` (OQLF). The Accu-Gel product detail is a different URL from the previously recorded Nutri-Pea general product page.

| Proposed source ID | Source and direct evidence | Limit |
|---|---|---|
| `WP02-B3-PEA-STARCH-MEASURE-SUB-R585-20261017-S01` | Nutri-Pea, [Accu-Gel Pea Starch](https://nutripea.com/products/accu-gel-pea-starch/), current manufacturer page. Names a native, highly purified product and provides the bounded gluten-free bakery replacement claims described above. | One manufacturer product; no recipe formula, named-replacement ratio, spoon/cup mass, or dry density. |
| `WP02-B3-PEA-STARCH-MEASURE-SUB-R585-20261017-S02` | Kim, Yoon, and Kim, [A study on the noodle quality made from pea starch-wheat composite flour](https://kiss.kstudy.com/Detail/Ar?key=1983741), *Korean Journal of Food & Cookery Science* 18(6), 2002, 692–697. Primary study abstract reports the 20%/30% pea-starch noodle formulas and favors 20% within that experiment. | One noodle formula and study context; no general flour substitution or household conversion. |
| `WP02-B3-PEA-STARCH-MEASURE-SUB-R585-20261017-S03` | Pietrasik and Soladoye, [Use of native pea starches as an alternative to modified corn starch in low-fat bologna](https://doi.org/10.1016/j.meatsci.2020.108283), *Meat Science* 171 (2021), 108283. Primary food-formulation study. | Low-fat bologna only; modified corn starch performed better than pea starch in the reported outcomes. Not a general substitution or measure. |
| `WP02-B3-PEA-STARCH-MEASURE-SUB-R585-20261017-S04` | Roquette, [PEA STARCH N-735](https://www.roquette.com/health-pharma/pharmaceutical-product-catalog/pea-starch-n-735), current named product data. Reports 0.62 g/mL bulk and 0.83 g/mL tapped density for a fine pharmaceutical/nutraceutical starch powder. | Product data for pharmaceutical/nutraceutical applications; no kitchen measure and no basis for `defaultDensity` or a food unit mapping. |
| `WP02-B3-PEA-STARCH-MEASURE-SUB-R585-20261017-S05` | Etti et al., [Physicochemical Evaluation of Pretreated Fermented Pea Carbohydrate-Rich Fraction (PCRF) for Beverage Development](https://onlinelibrary.wiley.com/doi/full/10.1002/star.70255), *Starch – Stärke* 78(7), e70255, first published 2026-07-03. Identifies the 65%-starch, non-pure fraction and the sample context for its density method. | Experimental pea carbohydrate-rich fraction and hydrated fermented beverages; not a pure pea-starch powder or kitchen conversion source. |

## Validation performed

- Read `AGENTS.md`, `roadmap.md`, the open WP02 B2/B3 plan anchors, the active pea-starch ledger row, the current reference/form package, and prior pea-starch identity, Québec terminology, and modified-pea-starch proposals.
- Checked the source IDs and new direct URLs against `docs/` and bundled seed assets; the proposal path was new when researched.
- Read the picker’s complete-phrase-first implementation and verified the existing base/modified term ownership; R585 proposes no term changes.
- Scanned all 114 manifest-listed recipes and counted 1,123 ingredient rows; found zero relevant name, alias, or ID hits.
- Opened the manufacturer, primary-study, OQLF, and Québec retailer sources listed above on 2026-10-17. No software tests, Gradle tasks, builds, emulator checks, or deployment were run because the integration only changes database JSON evidence and planning documentation under `AGENTS.md`.

The integrated ledger records no supported general kitchen measure or density. It stores qualitative Accu-Gel replacement guidance separately for rice flour and potato starch in specified gluten-free baked goods, plus a no-supported finding for general wheat-flour replacement. The package recipe audit found no ingredient demand. The broader WP02 B2/B3 parents remain open; see the [R585 integration README](../batches/wp02-b3-pea-starch-measure-substitution-integration-r585-20261017/README.md).

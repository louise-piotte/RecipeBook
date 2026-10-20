# WP02 B3 R585 — pea-starch measure and substitution evidence

Date: 2026-10-17

## Decision

Kept the existing `pea starch / amidon de pois` identity, name, aliases, category, and empty forms unchanged. Completed its evidence-state review in `research-ledger.v1.json`:

- Marked generic kitchen-measure/density research as complete with no supported value. Roquette's 0.62 g/mL bulk and 0.83 g/mL tapped values are for a fine pharmaceutical/nutraceutical product; the 2026 PCRF paper measures a non-pure carbohydrate-rich fraction and incubated beverage formulations, not generic dry cooking pea starch.
- Recorded the Nutri-Pea Accu-Gel replacement claim separately for rice flour and potato starch in gluten-free muffins, cookies, and cakes. The qualitative manufacturer guidance has no named-pair amount or recipe ratio. No runtime rule was added.
- Recorded no general wheat-flour replacement. The noodle study's 20%/30% values concern one experimental composite-noodle formula; the bologna study concerns a low-fat meat formulation.
- Added no active density, unit mapping, measure, form, recipe link, package yield, conversion, cooking yield, or substitution rule. The bundled corpus has no pea-starch demand.

## Evidence

- Nutri-Pea, [Accu-Gel Pea Starch](https://nutripea.com/products/accu-gel-pea-starch/): product-specific native starch description and gluten-free baking guidance.
- Kim, Yoon, and Kim, [pea starch-wheat composite noodles](https://kiss.kstudy.com/Detail/Ar?key=1983741): primary study of 20% and 30% composite formulas.
- Pietrasik and Soladoye, [native pea starch in low-fat bologna](https://doi.org/10.1016/j.meatsci.2020.108283): primary meat-formulation study.
- Roquette, [PEA STARCH N-735](https://www.roquette.com/health-pharma/pharmaceutical-product-catalog/pea-starch-n-735): product-grade pharmaceutical/nutraceutical density data.
- Etti et al., [fermented pea carbohydrate-rich fraction](https://onlinelibrary.wiley.com/doi/full/10.1002/star.70255): non-pure PCRF input and incubated-sample measurement procedure.

See the [R585 proposal](../../proposals/wp02-next-flour-starch-gap-review-r585-20261017.md), the [open regional-starch checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3085), and the [broader B2/B3 review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L15900). Those broad parent tasks remain open for their other candidates.

## Static verification

The seed package and existing-reference normalization, generated-index freshness, research-ledger/schema/source-ID checks, source ownership, picker projection, no-demand recipe scan (114 files / 1,123 ingredient rows), UTF-8/no-BOM checks, local links, and scoped whitespace checks passed. No software tests, build, emulator check, or deployment were run because this integration only updates database JSON evidence and planning documentation under `AGENTS.md`.

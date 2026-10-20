# WP08 tapioca-starch substitution research — 2026-10-16

## Status and scope

Integrated as a single source-bounded ledger finding for the existing `ingredient-ref-tapioca-starch` record (`tapioca starch / fécule de manioc`). The review asks whether another ingredient can replace tapioca starch in a cooking role. It does not change identity, aliases, forms, measurements, density, mappings, conversions, recipes, or active substitution rules.

## Supported finding

Bob's Red Mill says cornstarch can replace tapioca starch when tapioca is used to thicken liquids. It warns that the ingredients are added at different stages: tapioca is commonly added near the end, while cornstarch can be added at the beginning. It also describes tapioca's finish as glossy and cornstarch's as matte. The article gives no quantity or recipe-tested ratio. The ledger therefore records a qualitative, one-way alternative for liquid thickening and leaves its replacement quantity blank. [Bob's Red Mill](https://www.bobsredmill.com/articles/5-tapioca-flour-substitutes-to-test-out)

Iowa State Extension distinguishes tapioca pearls, flakes or powders, and instant/minute granules, and cautions that the forms are not interchangeable. Its 2 tablespoons tapioca powder per 1 tablespoon cornstarch statement gives the opposite direction; its separate 1:1 statement applies to instant tapioca. Neither ratio is reversed or attached to this finding. [Iowa State Extension AnswerLine](https://blogs.extension.iastate.edu/answerline/tag/cornstarch-substitution/)

King Arthur's fruit-pie chart uses **quick-cooking tapioca**, with fruit-specific amounts and a clear, stippled, somewhat sticky result. It does not test extracted tapioca starch as a replacement for cornstarch or provide a general ratio. Those data remain outside the finding. [King Arthur Baking](https://www.kingarthurbaking.com/learn/guides/pie-thickener)

## Ledger disposition

- `substitutionResearchState` for `ingredient-ref-tapioca-starch` is now `researched_supported` for the documented scope.
- The finding is directional: `ingredient-ref-tapioca-starch` → `ingredient-ref-cornstarch`, only when tapioca starch is the thickener in a cooked liquid recipe.
- No amount, ratio, reverse direction, substitution rule, recipe-line link, or form conversion is added. Pearls, quick-cooking granules, and other tapioca products remain out of scope.
- Measurement research remains `not_yet_researched`; the reference retains null density and empty unit mappings.
- A full scan of the 114 manifest-listed recipe files and their 1,123 structured ingredient rows found no tapioca-starch phrase or reference ID demand.

The ledger stores three reviewed source entries. The supported finding cites the direct substitution guidance; the Extension and test-kitchen sources document form/direction boundaries. All source IDs use `WP08-TAPIOCA-STARCH-SUBSTITUTION-20261016-S01` through `S03`.

## Research notes

Queries included `tapioca starch substitute pie filling thickener site:kingarthurbaking.com`, `tapioca starch substitute cornstarch extension`, and `tapioca flour substitute thickener`. Pages were opened and checked on 2026-10-16. The evidence supports only the recorded cooking-liquid thickening use. It does not establish a general gluten-free baking/binding substitute or a numeric conversion.

## Verification

The research-ledger schema validator, source-ID linkage, UTF-8/no-BOM check, and `git diff --check` passed. No app, unit, instrumentation, emulator, deployment, build, or other tests were run because the change only adds database JSON research data under the updated `AGENTS.md` rule.

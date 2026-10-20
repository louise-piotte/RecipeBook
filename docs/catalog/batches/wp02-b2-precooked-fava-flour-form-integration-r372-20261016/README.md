# WP02 Section 04 B2/B3 — precooked fava flour form integration (R372)

## Change

Added `precooked fava flour / farine de gourgane précuite` as the `precooked` form of the existing `ingredient-ref-fava-bean-flour` reference. Its match-term arrays are empty, density is null, and it has no recipe link. The French form label is a provisional Québec description based on the existing `farine de gourgane` identity and OQLF’s plant term.

The source describes Simpson Seeds’ product as high-pressure extruded and sold for food manufacturing. That detail remains supplier-specific. The form does not imply pregelatinization, a universal process, or ready-to-eat use. Keep the separate `ingredient-ref-faba-bean-flour` and its `farine de féverole` wording distinct. Do not add `farine de fève précuite` as a form term because it would change the current phrase-first result for the shorter `farine de fève` query.

## Picker and recipe boundary

The static search projection returns the fava-flour reference with a form hint for the complete queries `precooked fava flour` and `farine de gourgane précuite`. `farine de gourgane` continues to resolve to the base identity without a form hint, and the shorter `farine de fève` result remains on faba-bean flour. The manifest-listed recipe corpus has no matching fava-flour or precooked-fava wording, so no recipe line changed.

The existing Cuisine Soleil statement of 30 g per 1/4 cup stays scoped to that product. Simpson Seeds’ industrial package and nutrition panel establish no household measure, density, conversion, or substitution. No active numeric behavior, recipe link, yield, or substitution was added.

## Sources and ledger

Added the Simpson Seeds precooked and raw product pages and the Protein Industries Canada French-language report to the existing fava-flour ledger record. Reused its already-registered OQLF `gourgane` source. The accepted decision records the source and process boundaries; no measure observation was added.

See the [R372 proposal](../../proposals/wp02-b2-b3-next-gap-review-r372-20261016.md).

## Verification

Bundled seed-package normalization, `--check`, and `--validate-only` passed. Research-ledger validation passed with 2,054 records. The generated ingredient catalog is current at 1,698 references. Static field/source ownership checks passed, and a manifest-ordered scan of all 114 recipe files found no candidate-term hits. The plan and roadmap links, UTF-8/no-BOM encoding, and scoped whitespace were checked. No software tests, Gradle tasks, emulator checks, or deployment were run because this change adds database JSON data under `AGENTS.md`.

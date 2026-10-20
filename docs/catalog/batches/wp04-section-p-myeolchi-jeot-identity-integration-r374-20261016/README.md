# WP04 Section P — myeolchi-jeot identity integration (R374)

## Change

Added identity-only `myeolchi-jeot (fermented salted anchovies) / myeolchi-jeot (anchois fermentés au sel)` as `ingredient-ref-myeolchi-jeot` in `SAUCE_AND_CONDIMENT`, with `myeolchijeot` as its only alias. The French parenthetical is a descriptive, provisional construction: OQLF supports `anchois` and `fermentation` as component terms but does not name this Korean product or approve the complete phrase.

Keep the new product separate from generic anchovy, dried anchovies, anchovy paste, fish sauce, `saeu-jeot`, broad `jeotgal`, and liquid `myeolchi-aekjeot`. Do not add broad anchovy or French `anchois` aliases, forms, recipe links, measures, density, mappings, conversions, yields, or substitutions.

## Picker and recipe boundary

The static search projection returns the new row for `myeolchi-jeot`, `myeolchi jeot`, `myeolchijeot`, `salted anchovies`, `fermented salted anchovies`, and the descriptive French phrase. Broad `anchovies` and `anchois` queries gain the named fermented product alongside their existing fish/prepared-product results; singular `anchovy` remains unchanged. The manifest-listed recipe corpus has no candidate-term hits, so no recipe link or relink was made.

The historical Korean recipes and the U.S. retailer’s 500 g package are source-specific. They do not establish a reusable measure, density, recipe substitution, or Canadian availability. No active numeric behavior or substitution rule was added.

## Sources and ledger

Added the Korean Traditional Knowledge Portal, indexed Wooltari USA listing, and Maangchi ingredient page as new sources. Reused the existing National Institute of Korean Language food-name table, Korean Food Code, and OQLF entries by their registered ledger IDs. The accepted decision preserves the distinction between fermented solids, generic fish sauce, and the liquid jeot extract. The French wording remains provisional for independent Québec review.

See the [R374 proposal](../../proposals/wp04-section-p-next-gap-review-r374-20261016.md).

## Verification

Bundled seed-package normalization, `--check`, and `--validate-only` passed. Research-ledger validation passed with 2,054 records. The generated ingredient catalog is current at 1,698 references. Static field/source ownership checks passed, and a manifest-ordered scan of all 114 recipe files found no candidate-term hits. The preserved-fish and fish-product checklist links, proposal links, UTF-8/no-BOM encoding, and scoped whitespace were checked. No software tests, Gradle tasks, emulator checks, or deployment were run because this change adds database JSON data under `AGENTS.md`.

# WP02 A6: Bajri flour alias integration

Added `bajri flour` to the English aliases of `ingredient-ref-pearl-millet-flour`. Also added `bajri` to the existing pearl-millet grain reference. The Ontario mill and Canadian retail listing pair Bajri Flour with pearl-millet flour; APEDA identifies Bajri as a Marathi and Gujarati name for pearl millet.

The grain alias preserves picker behavior: bare `bajri` returns both grain and flour, while `bajri flour` returns flour only. Existing `bajra` and `bajra flour` behavior is unchanged. The French display and alias remain `farine de mil chandelle` and `farine de millet perlé`. The flour row's existing study-specific bulk-density observation and blocked bread-substitution finding remain unchanged; no active density, mapping, form, conversion, yield, recipe link, or substitution rule was added. The 114-file bundled recipe corpus has no matching demand.

The live ownership audit, source register, and picker projection are in the [review record](../../proposals/wp02-a6-bajri-flour-alias-followup-review-20261013.md). Static seed-package, generated-index, ledger-schema, exact ownership, picker, corpus, UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data. WP02 A6 remains open.

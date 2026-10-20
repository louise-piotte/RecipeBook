# WP03 Section F sprouted-barley identity integration (2026-10-12)

Added identity-only `sprouted barley, dried / orge avec écorce germée séchée` as
`ingredient-ref-sprouted-barley` in `GRAIN_AND_CEREAL`. The exact French display is Malterie
Caux-Laflamme's Québec product wording for barley with hull that is germinated and dried. Keep it
distinct from unsprouted hulled, pearl, and pot barley; barley flakes and flours; malted barley and
malt products; live sprouts or grass; and composite products. Added no aliases, forms, measures,
density, unit mapping, package yield, conversion, recipe link, or active substitution rule.

Added seven source records and one identity decision to the research ledger. Everspring's supplier-wide
1:1 substitution statement is retained as a rejected source-specific candidate: it does not give a
mass/volume basis, barley-specific test, cooking context, dish role, or an unambiguous target among
the catalog's distinct barley identities. `substitutionResearchState` is
`researched_no_supported_substitute`; measurement research remains `not_yet_researched`.

The 114-file manifest corpus / 1,123 ingredient rows has no candidate or broader barley/orge demand;
no recipe link was added. The catalog has 1,314 ingredient references. The ledger has 1,622 records,
5,943 source entries, and 4,960 distinct source IDs.

Static package normalization and validation, reference normalization, generated-index freshness,
ledger schema validation, exact ownership, recipe-corpus scan, UTF-8/no-BOM, and scoped whitespace
checks passed. No app tests or emulator checks were run because this change only adds database JSON
data and regenerates its search index.

See the [round8 proposal](../../proposals/wp03-section-f-next-gap-review-20261012-round8.md) for
source limitations, naming boundaries, and the full candidate review.

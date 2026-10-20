# WP02 A6 R254 — Ragulu Alias Integration

- **Status:** Integrated two source-backed search aliases on existing finger-millet references.
- **Review date:** 2026-10-16.

## Integrated aliases

| Query term | Reference | Result |
|---|---|---|
| `ragulu` | Finger millet | Added to `aliasesEn`; the query returns grain and flour. |
| `ragulu pindi` | Finger-millet flour | Added to `aliasesEn`; the full phrase returns flour only. |

The grain remains `finger millet / éleusine cultivée`; the flour remains `finger millet flour / farine de ragi`.
No French aliases or display edits were made. Both references retain null density defaults and empty unit
mappings. No forms, reusable measures, conversions, yields, recipe links, or substitutions were added.
The existing source-specific flour-density observations and blocked wheat-replacement finding remain
unchanged. The broader `pindi` query now returns two distinct flour references: Kodo-millet flour and
finger-millet flour.

## Evidence and limits

The [R254 proposal](../../proposals/wp02-a6-gap-review-r254-20261016.md) records the source review,
ownership and picker audit, and recipe scan. The Indian Institute of Millets Research source is registered
on the grain record; the existing Akkadi Roots source record is reused and its locator/support text now
includes `Ragulu Pindi`. This regional alias decision does not claim Canadian prevalence or a French
equivalent. The bundle has 114 recipes and 1,123 ingredient rows, with no `ragulu`, `ragulu pindi`, or
`ragula pindi` text and no linked finger-millet grain or flour rows.

## Static checks

- Bundled seed package normalization and validation passed.
- Generated ingredient-catalog index freshness passed (1,648 references).
- Ledger schema validation passed; the new source ID and URL were unallocated before integration.
- Exact phrase ownership and picker projection were checked across active references and forms.
- Recipe corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- Totals: 1,648 references, 125 forms, and 1,996 ledger records / 8,722 source entries / 7,391
  distinct source IDs / 6,160 distinct URLs.

No software tests, emulator checks, or deployment were run because this batch only adds database JSON
data and its generated index. WP02 A6 regional-flour coverage remains open.

# WP02 / WP03 / WP04 round-nineteen gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — Panivaragu / Proso millet:** Added the closed English search alias `panivaragu`
  to existing `ingredient-ref-common-millet` and `panivaragu maavu` to existing
  `ingredient-ref-proso-millet-flour`. ICAR–IIMR maps spaced `Pani varagu` to Proso and
  distinguishes Kodo `Varagu`; a current IIMR chapter and Calgary local-store card support the
  closed grain spelling. Organic Mandya identifies `Panivaragu Maavu` on its current Proso Flour
  page. The Canada-locale Silkrute spelling is a stale indexed snapshot (`Mavu`) and is used only
  as limited corroboration. Kept spaced `pani varagu` and `pani varagu maavu` inactive because the
  phrase-first picker would make a bare `pani` query suppress four existing substring results.
  Preserved the Kodo `varagu` / `varagu maavu` aliases and all French, numeric, form, recipe-link,
  and substitution fields.
- **WP03 Section F — common millet:** Independently reviewed and accepted `panivaragu` on the
  existing *Panicum miliaceum* grain row. The closed spelling preserves the `pani` substring
  fallback; the four existing partial results remain visible. The flour alias adds Proso flour as
  a sixth result to the existing `pani` results without changing the match mode. Kept the OQLF
  French display `millet commun`; no French alias was added.
- **WP04 Section P — Pangasius:** Added identity-only group reference
  `ingredient-ref-pangasius-group` with `Pangasius / pangasius` displays and English alias `basa`.
  CFIA lists a *Pangasius* spp. group row; current Metro French and English routes pair pangasius
  and basa on the same Québec SKU. Kept species-specific names, broad catfish terms, frozen/fillet
  forms, and conservation status off the group. The *Pangasianodon gigas* CITES listing is not
  transferred. The corpus has no matching recipe demand.

## Shared data changes

The active reference package now has **1,346 references** and **98 forms**. The two Proso aliases
were added to existing references; Pangasius is the only new reference. No form, recipe link,
measurement, conversion, yield, or substitution was added. The generated read-only catalog index
was refreshed from the updated JSON data.

The research ledger now has **1,659 records**, **6,453 source entries**, **5,404 distinct source
IDs**, and **4,494 distinct URLs**. It retains **342 measurement observations** and **195
substitution findings**. Eleven new source IDs and URLs were registered; the existing Organic
Mandya source locator/support was expanded and the already-recorded CFIA common-name guidance
source was reused. The Pangasius decision preserves no species assignment or active numeric data.

The manifest-ordered recipe corpus remains **114 files / 1,123 ingredient rows**, with fingerprint
`7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Verification

- Bundled seed-package normalization and validation passed.
- Generated ingredient-catalog index freshness passed.
- Research-ledger JSON Schema validation passed.
- Focused source-ID / URL checks and picker projections passed for `pani`, `panivaragu`,
  `panivaragu maavu`, `pani varagu`, `varagu`, `varagu maavu`, `pangasius`, `basa`, `swai`, and
  broad `catfish` queries.
- The recipe corpus fingerprint, UTF-8 without BOM, local Markdown links, and changed-file
  whitespace checks passed.
- No app, unit, instrumentation, emulator, or other tests were run. This round only adds catalog
  data to database JSON files and refreshes the generated index; tests were not needed under the
  updated `AGENTS.md` rule.

See the [WP02 Panivaragu proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round19-panivaragu-proso.md),
[WP03 Panivaragu grain proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round19-panivaragu-grain-alias.md),
and [WP04 Pangasius proposal](../../proposals/wp04-section-p-pangasius-market-group-review-20261013-round19.md).
A6, Section F, and Section P remain open.

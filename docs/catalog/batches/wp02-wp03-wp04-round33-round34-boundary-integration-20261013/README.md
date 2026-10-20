# WP02/WP03/WP04 rounds 33–34 boundary integration

Reviewed 2026-10-13. Five unresolved candidates were added to the research ledger. No active
ingredient reference, alias, form, recipe link, measurement, density, unit mapping, conversion,
yield, substitution, generated index, or application code changed.

## Decisions

- **WP02 A7 — malted naked oat flour:** Keep `candidate-malted-naked-oat-flour` unresolved and
  unallocated. Hodmedod's 50 g alternative to malted wheat flour is one recipe-specific choice; it
  does not establish a standalone product specification or Québec French name. Keep it separate from
  Castle Oat 80 roasted oat malt flour, generic malt flour, plain oat flour, whole malted naked oats,
  and malted wheat flakes. See the
  [R33 proposal](../../proposals/wp02-a7-malted-naked-oat-flour-boundary-review-20261013-round33.md).
- **WP03 Section F — puttu podi family:** Keep `candidate-puttu-podi-family` unresolved. Government
  and technical sources establish a puttu-specific processed flour/powder, while Canadian listings
  distinguish multiple substrate-labelled products without one common product specification or
  Québec French display. Keep the prepared puttu dish and substrate flours separate. See the
  [R33 proposal](../../proposals/wp03-section-f-puttu-podi-family-boundary-hold-20261013-r33.md).
- **WP02 A7 — malted maize flour:** Keep `candidate-malted-maize-flour` unresolved. Research papers
  establish experimental products, not a stable Canadian or Québec consumer specification; OQLF
  supports the base term `farine de maïs` only. Keep plain, roasted, precooked, and nixtamalized corn
  flour distinct. See the
  [R34 proposal](../../proposals/wp02-a7-malted-maize-flour-boundary-review-20261013-round34.md).
- **WP03 Section F — foxtail millet rava:** Keep `candidate-foxtail-millet-rava` unresolved.
  ICAR–IIMR and Ontario retailer sources establish a processed-grain candidate and English product
  names, but no Québec French product display was verified. Keep intact grain, flour, finger-millet
  rava, rice rava, sorghum semolina, and Sankhal distinct. See the
  [R34 proposal](../../proposals/wp03-section-f-foxtail-millet-rava-french-name-hold-20261013-r34.md).
- **WP04 Section P — salmon roe:** Keep `candidate-salmon-roe` unresolved until a bundled recipe
  selects a product. OQLF supports `salmon roe / œufs de saumon`, but retailer listings vary in
  species, origin, and preparation. Bare `roe` currently falls back to Greenland halibut because
  `roe` is a substring of `Groenland`; adding the phrase `salmon roe` would make that query return
  salmon roe alone under phrase-first matching. Keep ikura, trout roe, tobiko, masago, lumpfish roe,
  bottarga, and caviar distinct. See the
  [R33 proposal](../../proposals/wp04-section-p-salmon-roe-ikura-product-boundary-review-20261013-round33.md).

The ledger now has five candidate records. Existing source IDs were reused when the same source and
claim were already recorded; new source entries retain proposal-local IDs for distinct source
locations. No recipe matched any of the five candidate families in the 114-file, 1,123-row bundle.

## Static checks

Static research-ledger schema/source-ID validation, active/form/legacy/ledger ownership checks,
picker projections, the recipe-corpus scan, UTF-8/no-BOM and proposal-link checks, and
`git diff --check` are recorded for this batch. No app, unit, instrumentation, emulator, or other
tests were run because this batch only adds database JSON candidate data and documentation under
the updated `AGENTS.md` rule.

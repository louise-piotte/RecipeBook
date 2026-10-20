# WP02 Section A7 R673 — roasted red rice flour ledger integration

Integrated 2026-10-18. Added one formula-specific quantity observation to the existing `ingredient-ref-roasted-red-rice-flour` ledger record, refreshed/reused its current Niru sources, and recorded one blocked contextual alternative. Active catalog data is unchanged.

## Integrated evidence

Baku Kitchen's [String Hoppers recipe](https://bakukitchen.com/string-hoppers/) is marked updated September 2026 and makes about 20 nests. It lists **400 g roasted red rice flour** (or white rice flour) and about 450 mL boiling water. The 400 g amount is recorded only for the roasted red rice flour as listed in this formula. The water amount is not a flour volume or mass-volume pair. No cup amount, per-nest quantity, density, conversion, or general measure was derived.

The same page lists white rice flour as an alternative, describes a different color/texture result, and says roasted rice flour is required because roasting affects water absorption and flavor. It does not clarify whether the alternative is roasted. The ledger therefore records the evidence as `blocked_pending_evidence`, scoped to this hot-water, pressed, steamed String Hoppers formula; it does not create an active global or contextual substitution rule.

Niru's [roasted red rice flour page](https://niru.com/product/roasted-red-rice-flour/) was rechecked: it identifies the product, lists pittu and string hoppers as uses, and gives 1 kg, 2 kg, and 8 lb package sizes. Those are package quantities, not household measures. Its [Rice & Flour collection](https://niru.com/product-category/rice/) still lists the neighboring products separately; its existing shared source ID was reused without a new source entry.

## Ledger change

- Existing record: `ingredient-ref-roasted-red-rice-flour`.
- Measurement state: `researched_supported`, with one `portion_weight` observation of 400 g for the named formula.
- Substitution state: `blocked_pending_evidence`, with one finding for the unclear white-rice-flour alternative.
- Niru source IDs S05/S07 were refreshed and reused. Baku Kitchen was registered once as `WP02-A7-ROASTED-RED-RICE-FLOUR-R673-20261018-S01`.
- No reference, alias, form, density, mapping, recipe link, package yield, active conversion, or substitution rule changed.
- The manifest-listed bundle remains 114 recipes / 1,123 ingredient rows with no matching target recipe.

## Validation

Static checks passed: package validation and normalization check; ingredient-reference normalizer and generated-index checks; ledger schema/custom validation; source-ID/URL ownership and decision-source resolution; picker projection and recipe corpus scan; UTF-8 without BOM; local links and scoped whitespace. The index remains current at 1,837 references. No software tests, build, emulator, or deployment were run because this update only adds database JSON data under [AGENTS.md](../../../../AGENTS.md).

## Final data snapshot

- 1,837 ingredient references and 167 forms
- 114 bundled recipes and 1,123 ingredient rows
- 2,213 ledger records / 10,364 source entries / 8,753 distinct source IDs / 7,402 unique URLs

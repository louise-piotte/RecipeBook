# WP03 Section L R670 — canned young jackfruit in brine form integration

Integrated 2026-10-18. The open Section L review established one exact commercial product: Cha’s canned young jackfruit in brine, sold under the manufacturer’s bilingual labels **Young Jackfruit In Brine / Jeune Fruit du Jacquier en Saumure**. The form is attached to the existing `ingredient-ref-jackfruit` identity. The active identity, aliases, category, density, and unit mappings remain unchanged.

## Accepted boundary and picker effect

The form is `ingredient-form-jackfruit-young-in-brine`, code `canned_with_liquid`, prep state `with_liquid`, with exact source-backed labels and no extra aliases. Its label causes the bare French picker query `jacquier` to return the generic jackfruit parent without a form hint. OQLF records `jacquier` as the tree name, but the picker has no tree identity. The exact Québec product phrase is accepted as written; no `jacquier` base alias or tree identity was added.

This is a named canned product, not a general green, unripe, or young maturity classification. Those generic maturity terms remain open, as do ripe jackfruit, seeds, and other processed products. The corpus scan found no jackfruit demand in the 114 bundled recipes or their 1,123 ingredient rows, so no recipe link, substitution, or relink was added.

The manufacturer and Québec listings show a 400 mL package. This is package volume only: no drained mass, generic can measure, density, mapping, conversion, or yield was established. An external manufacturer recipe’s one-can amount and rinse/drain/cook instructions remain local to that recipe. No global or contextual substitution was supported.

## Research ledger

Added `ingredient-form-jackfruit-young-in-brine` as one `ingredient_form` ledger record. It has a verified identity, `researched_no_supported_value` measurement state, `researched_no_supported_substitute` substitution state, eight source entries, and one accepted decision. It reuses the existing OQLF `jaque` source entry and adds R670 sources S01–S07 only under the form record. The generic jackfruit reference ledger record was left unchanged. Seven R670 source IDs are new; the CFIA standards URL is shared with existing records, so the catalog has 7 new unique source IDs and 6 new unique URLs.

## Sources

- [Cha’s Organics, Young Jackfruit In Brine](https://chasorganics.com/products/young-jackfruit) and [French product page](https://chasorganics.com/fr/products/young-jackfruit): bilingual product wording, can presentation, 400 mL package, and ingredients.
- [Metro Québec listing](https://www.metro.ca/epicerie-en-ligne/allees/epicerie-biologique/garde-manger/noix-graines-et-fruits-seches-bio/jeune-fruit-du-jacquier-biologique-en-saumure/p/806253310206) and [Satau distributor listing](https://satau.ca/fr/nos-produits/chas-organics/): matching French product name and Québec product distribution; stock state is not treated as a general availability guarantee.
- [OQLF, jaque](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297111/jaque): preferred fruit terminology and the tree/fruit boundary.
- [Cha’s Organics, ripe jackfruit](https://chasorganics.com/fr/products/sweet-jackfruit): a separately named product in pineapple juice, kept outside this form.
- [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0): generic canned-fruit boundary; no jackfruit-specific maturity or brine standard was found.
- [Cha’s Organics, Jackfruit “Fish” Fillet recipe](https://chasorganics.com/pages/jackfruit-fish-fillet): external product preparation only; not bundled recipe demand or a substitution source.

## Validation

Static checks passed after integration:

- Bundled seed package JSON validates and is already normalized.
- Ingredient reference normalizer and generated reference index report no pending changes; the index contains 1,837 references.
- Research ledger schema/custom validation reports 2,213 records and zero errors.
- Form and ledger IDs, source IDs/URLs, and decision source references were checked; the form owns the seven new R670 sources plus the reused OQLF source.
- Picker projections confirm exact English/French brine phrases show the form hint, while bare `jacquier` returns only the parent without a hint; green, unripe, and ripe phrases remain unmatched.
- The manifest-listed corpus contains 114 recipe files and 1,123 ingredient rows, with no jackfruit match.
- UTF-8 without BOM, explicit JSON escapes for accents, local documentation links, and scoped whitespace were checked.

No software tests, build, emulator, or deployment were run. This integration only adds database JSON data, which is exempt from testing by [AGENTS.md](../../../../AGENTS.md).

## Final data snapshot

- 1,837 ingredient references and 167 forms
- 114 bundled recipes and 1,123 ingredient rows
- 2,213 research-ledger records / 10,363 source entries / 8,752 distinct source IDs / 7,401 unique URLs

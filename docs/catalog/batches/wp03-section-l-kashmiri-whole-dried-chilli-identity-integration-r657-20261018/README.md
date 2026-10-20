# WP03 Section L R657 integration — whole dried Kashmiri red chilli identity

Integrated on 2026-10-18 after root review of the [R657 proposal](../../proposals/wp03-section-l-kashmiri-whole-dried-chilli-identity-review-r657-20261018.md).

## Decision

Added identity-only `whole dried Kashmiri red chilli pepper / piment rouge du Cachemire entier séché` as `ingredient-ref-kashmiri-chili-pepper`, category `VEGETABLE_AND_AROMATIC`. Added only the reviewed English alias `Kashmiri chilli whole` and French aliases `piment du Cachemire entier séché` and `piments du Cachemire entiers séchés`. The French display is descriptive Québec-facing product wording, not an OQLF-approved Kashmiri term.

The Government of India's Spices Board calls Kashmiri Red Chilli a spice associated with Jammu and Kashmir; the Ministry of Commerce lists Kashmiri chilli among exported varieties. Canadian English and French Global Choice listings name the same whole dried product and distinguish using it whole from grinding it. Codex distinguishes whole, crushed/flaked, and ground/powdered dried chilli styles; it does not define Kashmiri as a cultivar. Spice Divine's Ol'tymes listing supports the narrow English alias by title; its page shows sold out and is not used as availability evidence.

Keep the row distinct from generic chili powder, red chili flakes, and the separately held Kashmiri red-chilli paste candidate. The evidence does not establish one botanical species or cultivar, origin for all products, GI status, or general heat/color behavior. The bundle has no candidate-specific recipe phrase or link. No form, amount, density, mapping, conversion, yield, recipe link, or substitution was added.

Added one verified identity ledger row with seven source records and one accepted decision. Measurement and substitution research remain `not_yet_researched`.

## Sources

- [Spices Board India — Buyer Seller Meet for Saffron and Other Spices of Jammu & Kashmir](https://www.indianspices.com/sites/default/files/BSM%20SRINAGAR-%20SAFFRON-compressed.pdf), December 12, 2024, page 1.
- [Press Information Bureau, Government of India — Export of Red Chillies](https://www.pib.gov.in/newsite/PrintRelease.aspx?lang=2&reg=48&relid=81215), March 19, 2012.
- [Codex Alimentarius — Standard for Dried or Dehydrated Chilli Pepper and Paprika, CXS 353-2022](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+353-2022%2FCXS_353e.pdf), sections 2.1–2.2; official indexed text confirms whole, crushed/flaked, and ground styles.
- [Walmart Canada — Global Choice Whole Dry Kashmiri Red Chilli](https://www.walmart.ca/en/ip/Global-Choice-Whole-Dry-Kashmiri-Red-Chilli-200g/1N6AS16WDW4W). Its displayed title/package details are inconsistent; no size is used.
- [Walmart Canada — Piment Rouge du Cachemire Entier Sec](https://www.walmart.ca/fr/ip/Global-Choice-Piment-Rouge-du-Cachemire-Entier-Sec-100-g/1N6AS16WDW4W), same SKU as the English route. Marketplace seller information is not independently verified by Walmart.
- [Spice Divine — Ol'tymes Kashmiri Chilli Whole 100g](https://spicedivine.ca/products/oltymes-kashmiri-chilli-whole-100g). The page currently shows sold out; it supports the product-name alias only.
- [OQLF GDT — piment chili](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084717/piment-chili), generic fresh/dried terminology, not a Kashmiri-specific term.

## Validation

Static seed-package validation and normalization checks passed; the generated index is current at 1,836 references. `validate_research_ledger()` passed with 2,209 records and zero errors. Seven new source IDs and the target reference/ledger IDs have one owner each; the Codex URL now has two scoped owners, and the other six R657 URLs each have one. The manifest has 114 recipes and 1,123 ingredient rows with no candidate-specific match. Database JSON is UTF-8 without BOM with explicit Unicode escapes. Maintained docs passed UTF-8/no-BOM, local-link, newline, whitespace, and scoped `git diff --check` checks. No software tests, build, emulator run, or deployment were needed for this database-JSON-only change under `AGENTS.md`.

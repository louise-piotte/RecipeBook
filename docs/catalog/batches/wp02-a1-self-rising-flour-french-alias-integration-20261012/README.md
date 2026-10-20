# WP02 A1 — Self-rising flour French alias (2026-10-12)

## Decision

Added `farine préparée` as a French search alias on the existing
`ingredient-ref-self-rising-flour` row. Keep the canonical display `self-rising flour / farine à
levure` and the existing aliases. The OQLF still supports `farine à levure` as its preferred Québec
term and `farine autolevante` as a term used in some contexts.

The exact wording `Farine préparée` is the title of Ardent Mills Canada's French self-rising flour
page, paired with `Self-Rising Flour` on its matching English page. Mayrand also uses the phrase in a
Québec product title. These product sources support search coverage, not a universal formulation.
Do not add the longer Brodie XXX title, brand names, or package wording as general aliases.

No forms, measures, densities, unit mappings, recipe links, conversions, yields, or substitutions
were added. The existing compound replacement research remains unchanged.

## Sources

- OQLF, [`farine à levure` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17490878/farine-a-levure): preferred Québec term, contextual `farine autolevante`, English equivalents, and product definition.
- Ardent Mills Canada, [French `Farine préparée`](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/self-rising/) and [English `Self-Rising Flour`](https://ardentmills.ca/products/traditional-wheat/standard-flours/self-rising/): matching bilingual titles and descriptions of the supplier's flour, salt, and chemical-leavener blend.
- Mayrand, [Brodie XXX `Farine préparée pour gâteaux et pâtisseries`](https://mayrand.ca/fr/nos-produits/epicerie/farine-semoule-et-chapelure/farine-et-chapelure/farine-preparee-pour-gateaux-et-patisseries-25-kg-brodie-xxx-02831): Québec-market wording on a retailer product page; the full title and brand remain product-specific.

The ledger records these product sources as `WP02A1-S11` through `WP02A1-S13`. The identity and
OQLF evidence remain on the existing reference record.

## Static verification

- Reference normalization and generated-index freshness passed; the bundled seed package and
  research-ledger schema validation passed.
- Exact normalized phrase ownership was checked across active references, forms, legacy candidates,
  and ledger records. The 114-file, 1,123-row bundled recipe scan found no reviewed phrase or recipe
  line linked to this identity.
- Touched JSON is UTF-8 without BOM and stores French accents as explicit Unicode escapes. No tests or
  emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

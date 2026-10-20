# WP02/WP03/WP04 R216–R218 Gap Review Integration

Integrated 2026-10-16 after proposal review and source verification. This batch adds three
identity-only ingredient references and their research-ledger evidence. No recipe rows, forms,
active conversions, or application behavior were changed.

## Accepted catalog changes

- **R216 — soft red winter wheat flour / farine de blé rouge d’hiver tendre**
  (`ingredient-ref-soft-red-winter-wheat-flour`, `FLOUR_AND_STARCH`). The current [Farinart
  Québec product page](https://farinart.ca/fr/farinart-farines-integrales-agriculture-regeneratrice/)
  uses the French display, and its [English launch announcement](https://www.newswire.ca/news-releases/farinart-launches-a-new-range-of-100-local-whole-grain-bakery-flours-from-regenerative-agriculture-884771945.html)
  supports the English product phrase. The [earlier French announcement](https://www.newswire.ca/fr/news-releases/farinart-lance-une-nouvelle-gamme-de-farines-integrales-de-boulangerie-100-locales-issues-de-l-agriculture-regeneratrice-883487150.html)
  supports `farine de blé tendre rouge d'automne` as a narrow alias for the same Farinart product
  family. Keep the flour separate from whole berries, other culinary flour grades, and formal
  CESRW class assignment. [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre)
  supports only the generic soft-wheat terminology. Measurement and substitution research remain
  unsupported; Arva’s [1:1 Imperial Pastry guidance](https://arvaflourmills.com/pages/flour-guide)
  is product-specific.
- **R217 — plain Cheerios / Cheerios** (`ingredient-ref-cheerios-original`, `GRAIN_AND_CEREAL`).
  The [Canadian English](https://www.cheerios.ca/products/cheerios) and
  [French](https://www.cheerios.ca/fr-CA/products/cheerios) manufacturer pages use the same
  product title and list a 1 cup (27 g) Nutrition Facts serving. The observation stays tied to this
  SKU; aliases, formulas, forms, reusable measures, and substitutions were not added.
- **R218 — tilapia fillets / filets de tilapia** (`ingredient-ref-tilapia-fillets`, `PROTEIN`).
  Keep the row species-neutral and add the singular French alias `filet de tilapia`, which the
  singular [Metro Québec fresh-fillet title](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/filet-de-tilapia-frais/p/216858)
  directly supports. The English/frozen Metro listings and Québec retailer search evidence support
  the fresh/frozen market group. [CFIA’s Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list)
  confirms that multiple species share the broad tilapia name. Keep the Nile-tilapia candidate
  unallocated. Retail, CNF, and external recipe quantities remain source-specific observations; no
  reusable measures, density, conversions, yields, or substitutions were added.

The R217 and R218 proposals reused existing product-list, OQLF, and CFIA source IDs. The R216
proposal received one additional source ID for the Arva Flour Guide’s specific Imperial Pastry
substitution locator; its URL was already represented under a different spelt-specific source ID.
The R218 proposal was corrected during review to include the singular French alias and its picker
result.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py` completed successfully.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py` generated the catalog
  index with 1,614 references.
- The research-ledger JSON Schema passed for 1,959 records. The whole-ledger audit found 8,530
  source entries, 7,247 distinct source IDs, and 6,024 distinct URLs, with no source-ID URL
  conflicts or unresolved citations.
- The three new reference IDs, category values, aliases, null densities, empty unit mappings,
  evidence records, and source links were checked. The recipe corpus remains 114 files / 1,123
  ingredient rows.
- No software tests or emulator checks were run because this batch only adds database JSON data and
  documentation, as allowed by `AGENTS.md`.

Proposals: [R216 flour review](../../proposals/wp02-a6-or-section-a-gap-review-r216-20261016.md),
[R217 Cheerios review](../../proposals/wp03-section-f-next-cereal-gap-review-r217-20261016.md),
[R218 tilapia review](../../proposals/wp04-section-p-next-seafood-gap-review-r218-20261016.md).
The parent flour, cereal, and finfish checklist items remain open for other gaps.

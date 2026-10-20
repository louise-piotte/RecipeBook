# WP03 Section K R868 — celtuce identity integration

Integrated 2026-10-19 from the [R868 proposal](../../proposals/wp03-generic-produce-diversity-review-r868-20261019.md).

## Catalog change

Added one identity-only generic reference:

- `ingredient-ref-celtuce` — English `celtuce`; Québec French `laitue asperge`.
- English aliases: `asparagus lettuce`, `stem lettuce`; French aliases: none.
- Category: `VEGETABLE_AND_AROMATIC`; density and unit mappings remain empty.
- No form, preparation default, recipe link, measurement, conversion, yield, or substitution was added. The ledger keeps measurement and substitution research `not_yet_researched`.

OQLF identifies `laitue asperge` as its preferred French term and lists the English names. OMAFRA describes the peeled stem as used raw or cooked; UC Davis describes celtuce as a lettuce type primarily consumed for its stem and notes that its leaves can also be eaten. The older OQLF cross claim and varietal labels were not adopted as catalog taxonomy. OMAFRA crop dates, spacing, temperatures, and storage values remain agronomic observations.

The exact English aliases create a documented broad-query overlap: `asparagus` and `asperge` now return the existing asparagus and yardlong-bean candidates plus celtuce. `lettuce` returns celtuce, leaf lettuce, lettuce, romaine lettuce, and sea lettuce; `laitue` returns those celtuce/lettuce identities plus nori. Fully qualified `celtuce`, `laitue asperge`, `asparagus lettuce`, and `stem lettuce` each resolve only to celtuce. Existing asparagus, yardlong-bean, lettuce, sea-lettuce, and nori entries and their evidence were preserved without edits or transfers.

The broad-query results are lexical candidates, not equivalence claims. The source-attested alias `asparagus lettuce` was retained for exact-name search; a later picker review may revise it independently if the extra broad-query candidate proves confusing.

## Scope and recipe review

- This adds a generic ingredient identity, not a cultivar or commercial-product roster. No brand, product-line, flavor, or retailer-only variant was researched or added.
- The cross-category queue review found no open item whose only purpose was a product roster. The Section K Broccolini mention remains an existing trademark/alias exclusion, not a research task; see the [generic-ingredient scope review](../generic-ingredient-scope-review-20261019/README.md).
- All 114 manifest-listed recipe files / 1,123 ingredient rows were scanned. No celtuce, asparagus-lettuce, stem-lettuce, `laitue asperge`, or varietal-name text was found; no recipe link was added.
- No existing branded row or product-scoped value was deleted, merged, or generalized.

## Sources

- [OQLF, *laitue asperge*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082775/laitue-asperge), last updated 1991.
- [Ontario Ministry of Agriculture, Food and Rural Affairs, Celtuce](https://www.omafra.gov.on.ca/CropOp/en/spec_veg/other_spec_veg/celt.html), last modified 2012-10-17.
- [Ontario Ministry of Agriculture, Food and Rural Affairs, Laitue-céleri](https://www.omafra.gov.on.ca/CropOp/fr/spec_veg/leafy_veg/celt.html), last modified 2012-10-17.
- [University of California, Davis, Celtuce](https://plantbreeding.ucdavis.edu/celtuce), last updated 2026-04-10.

All four sources are registered on `ingredient-ref-celtuce` in the research ledger. The OMAFRA pages support generic crop identity and culinary use; no product-specific measurements were transferred.

## Validation snapshot

- Bundled package validation passed; package normalization and ingredient-reference normalization checks passed.
- Research-ledger JSON Schema validation passed.
- Generated Kotlin catalog is current at 1,898 references.
- Scoped ownership and source checks found one active celtuce reference, one ledger record, no forms, no duplicate R868 source IDs, no duplicate R868 URLs, and no pre-existing exact phrase owner.
- Picker-query projection and the manifest-listed recipe scan are recorded above. Recipe corpus digest: `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17`.
- UTF-8/no-BOM, explicit bundled JSON Unicode handling, local links and anchors, and scoped whitespace checks passed.
- Current catalog snapshot: 1,898 references / 201 forms / 114 recipes / 1,123 recipe ingredient rows; 2,306 ledger records / 10,877 source entries / 9,139 unique source IDs / 7,772 unique source URLs / 891 measurement observations / 370 substitution findings.
- File hashes: `ingredient-references.v1.json` `bf2a29701b267b760a23b408b250e9cbc4cd712bacb7b60b924ccf4634b7efd4`; `ingredient-forms.v1.json` `5784488eba2effc1e99e29e4ab3f3143256a25c6cb327344099e045c1b85cf0e`; `research-ledger.v1.json` `401fbbdf1f99dba4345405e6fa3ecff30a2cca63d0c8d00cb6151218d7d35ec1`.
- No software tests, build, emulator, or deployment were run because the active change only adds database JSON data under `AGENTS.md`.

Section K remains open for further generic produce gaps and Québec terminology review.

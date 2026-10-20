# R887–R889 generic ingredient gap integration

Integrated 2026-10-19. These reviews add a grain milling fraction, a culinary plant part, and a qualified multi-species label-name group. All three were selected for generic ingredient identity coverage; none expands a commercial product roster.

## Accepted changes

- **R887 — spelt bran:** added identity-only generic `spelt bran / son d’épeautre` for the edible bran fraction milled from spelt grain. Keep it distinct from wheat and other cereal brans, spelt flour, and spelt grain. The Québec food-directory page supports the generic milling relationship, wording, and culinary uses; its named product, organic claim, seller, retailer list, and 250 g package do not become catalog properties. The fine/coarse fractions and analytical results in the studies remain study-specific. The French compound is locally attested but is not presented as a separate OQLF terminology ruling.
- **R888 — coriander roots:** added identity-only `coriander roots / racines de coriandre` for culinary roots of *Coriandrum sativum*. Keep leaves, seeds, stems, Vietnamese coriander, and culantro separate. OQLF supports the plant identity and base term, UW–Madison Extension supports culinary root use, and Télé-Québec supports the Québec French phrase. The recipe’s five-root amount and crushing instruction stay recipe-specific; the compound is not presented as an OQLF-standardized term.
- **R889 — shrimp name group:** added the visibly qualified identity `shrimp (name used for multiple shrimp species) / crevette (nom utilisé pour plusieurs espèces de crevettes)` for the exact repeated CFIA label pair across multiple taxa. This is a label-name group, not a taxon or a claim of culinary interchangeability. Keep species-specific, prepared, preserved, and condiment references separate. Preserve the earlier fresh-shrimp/prawn hold; do not activate `prawn` as an alias.

The three records are identity-only. They have null density and no unit mappings. No forms, measurements, recipe links, conversions, yields, or substitutions were added; measurement and substitution research remain `not_yet_researched`.

## Cross-category scope disposition

The open plan and roadmap were rechecked across all ingredient types. No queued checklist item solely asks for a commercial brand, product-line, flavour-family, SKU, or retailer-variant roster. Such work remains out of scope because commercial-product counts do not add ingredient diversity. The Anson Mills named wheat-meal follow-up remains out of scope under R875 for the same reason; preserve its R605 history and all existing branded entries. Manufacturer and product-directory pages remain evidence for generic ingredients only where their claims generalize; product-specific quantities and other claims remain tied to the named product.

No existing reference, form, candidate, source record, or product-specific measurement was deleted, merged, or generalized.

## Static validation

- Canonical package: **1,918 ingredient references**, **201 forms**, **114 manifest-listed recipes**, and **1,123 structured ingredient rows**. Seed package validation and normalization checks passed; the generated Kotlin catalog is current at 1,918 references.
- Research ledger: **2,322 records**, **10,953 source entries**, **9,195 distinct source IDs**, **7,818 distinct URLs**, and **8 unit conversions**. `validate_research_ledger()` reports zero errors.
- Static picker projection: `spelt bran` and `son d’épeautre` select the new identity; broad `spelt`, `épeautre`, and `bran` searches each gain one result. Coriander-root phrases select the new identity; broad `coriander`, `coriandre`, and `cilantro` searches remain multi-result. The qualified shrimp group is found by its complete English and French names; `shrimp`, `shrimps`, `crevette`, and `crevettes` each gain one result. `prawn` and `prawns` remain unassigned. Dried shrimp, Northern shrimp, and Kapi retain their existing results.
- A normalized whole-word scan found **0 matching files and 0 matching ingredient rows** across the 114 bundled recipes for the three target identities. No recipe links were added.
- New reference and source ownership, retained candidate/source history, escaped Unicode in bundled JSON, UTF-8 without BOM, mojibake markers, local links, plan anchors, and scoped whitespace were checked.
- No software tests, build, emulator, or deployment were run. The active catalog changes only add database JSON data, under `AGENTS.md`.

## Files

- Proposals: [R887 spelt bran](../../proposals/wp02-a7-generic-spelt-bran-milling-identity-review-r887-20261019.md), [R888 coriander root](../../proposals/wp03-section-u-coriander-root-identity-review-r888-20261019.md), [R889 shrimp name group](../../proposals/wp04-section-p-generic-shrimp-market-group-review-r889-20261019.md).
- Shared data: `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`, `docs/catalog/research-ledger.v1.json`, and generated `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`.
- Checklists and scope notes: `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `roadmap.md`, `docs/catalog/ingredient-catalog-workflow.md`, and `docs/catalog/batches/generic-ingredient-scope-review-20261019/README.md`.

Sections A7, U, and P remain open for generic ingredient coverage and terminology review.

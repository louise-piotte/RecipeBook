# WP02 / WP03 / WP04 round-five gap-review integration

- Date: 2026-10-13.
- Scope: source-backed A6 flour aliases, a qualified whole-sorghum alias, and a blue-crab species identity.
- Proposal-only reviewers did not modify shared catalog data. Root reviewed each proposal and integrated the decisions below.
- No app, unit, instrumentation, emulator, or application tests were run because these changes add database JSON data, as directed in AGENTS.md.

## Integrated decisions

### WP02 A6: Mandua

Added mandua to the existing finger-millet grain English aliases and mandua flour / mandua ka atta to finger-millet flour. The Government of India’s FSSAI standard calls finger millet “Ragi or Mandua” and separately defines ragi flour from dried mature grains of Eleusine coracana. Himachal Pradesh Agriculture and India’s Department of Science and Technology support the regional name; APEDA lists Mandua Flour; Canadian-facing product copy supports the two qualified flour phrases. The Canadian listings are not treated as current-stock evidence.

The picker returns grain and flour for bare mandua; the two qualified flour queries return flour only. French displays stay unchanged. The four study-specific bulk-density observations and blocked wheat-replacement finding remain unchanged; default density is null and mappings are empty. The 114-recipe / 1,123-row scan found no candidate phrase or target-reference links.

Sources: [FSSAI cereal standard](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), [Himachal Pradesh Agriculture](https://agriculture.hp.gov.in/en/finger-millet/), [Government of India DST](https://dst.gov.in/millet-de-huller-brings-fortunes-through-value-added-products-rural-uttarakhand), [APEDA Himachal catalogue](https://apeda.gov.in/milletportal/files/HP_Millet_Value_Added_Products_Catalogue.pdf).

### WP03 Section F: Whole jowar

Added only jowar whole to grain sorghum. India’s 2024 rules identify Sorghum (Jowar) among whole or dehulled millets intended for direct human consumption; an Ontario retailer uses the exact qualified title and describes whole sorghum grains. The exact jowar whole query returns grain sorghum alone. Bare jowar offers labeled grain, flour, and semolina choices; jowar flour and jowar rava keep their existing owners. Existing source-specific grain observations remain unchanged.

Sources: [Government of India 2024 Gazette](https://egazette.gov.in/WriteReadData/2024/256218.pdf), [Swadesh Jowar Whole](https://www.swadesh.ca/products/jowar-whole-sorghum-per-lb).

### WP04 Section P: Blue crab

Added identity-only blue crab / crabe bleu for Callinectes sapidus, with no aliases, forms, measures, density, mappings, recipe links, or substitutions. OQLF directly pairs the preferred Québec French term with English blue crab and the scientific name. CFIA confirms the taxon-specific names and distinguishes blue swimming crab (Portunus pelagicus); DFO independently uses Crabe bleu / Callinectes sapidus. Broad crab and crabe searches remain multiple-choice alongside generic crab meat and Dungeness crab. The current Super C listing does not disclose a scientific species, so its 454 g package amount remains SKU-specific and is not attached.

Sources: [OQLF GDT: crabe bleu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198912/crabe-bleu), [CFIA Fish List crab query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab), [CFIA Fish List scope](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), [DFO 2025 crab identification guide](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-12-2025-fra.pdf).

The recipe scan found no blue-crab wording in 114 bundled recipes and 1,123 ingredient rows; recipe 019 remains generic Jumbo Lump crab meat linked to the existing crab-meat reference and form.

## Static validation

Package normalization/validation and generated Kotlin catalog freshness passed. The research ledger conforms to its JSON Schema. Focused picker projections and alias/record assertions passed, the full recipe demand scan remained unchanged, and edited files pass UTF-8 without BOM, mojibake, whitespace, and scoped diff checks. No app or emulator tests were run for this database-JSON-only update.

The A6, Section F, and Section P checklists remain open for further source-backed candidates.

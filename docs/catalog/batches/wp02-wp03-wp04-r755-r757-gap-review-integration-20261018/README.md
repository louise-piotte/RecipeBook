# WP02/WP03/WP04 R755–R757 gap-review integration — 2026-10-18

## Integrated decisions

- **R755 — Job’s-tears flour measurement:** Added a product-specific `portion_weight` observation for Natural Blue’s Greenmax-Adlay Powder listing: 2 unspecified spoons are approximately 30 g when prepared as a beverage. The generic measurement state is now `researched_no_supported_value`; the spoon size is not normalized, density remains null, aliases/forms remain unchanged, and substitution research remains open. The wild-adlay study’s inconsistent density units were not adopted.
- **R756 — whole grain sorghum forms and yield:** Added `whole_dry` and `whole_cooked` forms under the existing grain-sorghum reference. Recorded USDA FNS’s approximate one-pound dry-volume portion and dry-to-cooked volume yield on the corresponding form ledger records. No density, active measure, unit mapping, dry-to-cooked converter, or recipe instruction was added. The state-unspecified CNF 2015 portions remain on the parent, and the CNF 2026 row join remains open.
- **R757 — rainbow trout:** Added one `fresh_whole` form under the existing *Oncorhynchus mykiss* reference. Metro’s English and French pages are the same SKU (208107); its selected-location stock, average weight, provenance, and aquaculture method stay SKU-specific. The pages do not state head, gutting, or scaling condition. R548’s rainbow-trout fillet hold remains intact.

## Package snapshot

- Ingredient references: **1,848**; ingredient forms: **184**.
- Research ledger: **2,241 records**, **10,519 source entries**, **8,876 distinct source IDs**, and **7,523 distinct source URLs**.
- Bundled recipes: **114 files** and **1,123 structured ingredient rows**. No R755 Job’s-tears/adlay, R756 sorghum, or R757 rainbow-trout phrase appears in the recipe corpus.

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; the static check validates normalized package data and the full seed/ledger schemas.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed for **1,848 references**; no reference identity or generated-index change was needed.
- New form, observation, and source IDs were checked for collisions. New source IDs resolve consistently to their cited URLs; the USDA source is shared by the two related form ledger records, and existing OQLF identity source `WP04-FINFISH-FOLLOWUP-20261009-S01` is reused without changing ownership.
- Picker projection: all four exact R756 whole/dry or whole/cooked English/French form labels resolve to the existing grain-sorghum reference. Broad `sorghum` / `sorgho` searches are unchanged. The fresh-whole rainbow-trout labels resolve to the existing trout reference; `rainbow trout` / `truite arc-en-ciel`, broad `trout` / `truite`, and `whole fish` / `poisson entier` results are unchanged. `whole` changes 49→50, `entiers` 10→11, `cooked` 13→14, `cuit` 10→11, `entière` 12→13, and `fresh whole` 7→8; these remain multi-result searches.
- Recipe corpus scan: 114 manifest-listed files / 1,123 structured rows; no target ingredient references or phrase hits for the three reviews.
- Database JSON was serialized as ASCII with Unicode escapes, without a BOM. Local proposal links and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were performed. The integrated catalog changes only add database JSON data, which the current `AGENTS.md` exempts from testing; the roadmap and plan record the research decisions.

## Review records

- [R755 — Job’s-tears flour measurement review](../../proposals/wp02-a6-next-gap-review-r755-20261018.md)
- [R756 — whole sorghum form and yield review](../../proposals/wp03-section-f-next-gap-review-r756-20261018.md)
- [R757 — fresh-whole rainbow-trout form review](../../proposals/wp04-section-p-next-open-gap-review-r757-20261018.md)

## Primary sources rechecked

- Natural Blue Marketing, [Greenmax-Adlay Powder](https://www.naturalblue.com.my/usr/product.aspx?id=33&pgid=4); Kew Science, [Medicinal Plant Names Services: adlay](https://mpns.science.kew.org/mpns-portal/drugDetail?drugName=adlay); Ahmad et al., [wild adlay accessions study](https://www.sciencedirect.com/science/article/pii/S2590157524003055).
- USDA Food and Nutrition Service, [Food Buying Guide for Child Nutrition Programs, Section 4: Grains](https://foodbuyingguide.fns.usda.gov/files/Reports/USDA_FBG_Section4_Grains_YieldTable.pdf); Codex Alimentarius, [Norme Codex pour le sorgho en grains](https://www.fao.org/input/download/standards/57/CXS_172f.pdf).
- Metro, [Fresh Whole Rainbow Trout](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/whole-fish/fresh-whole-rainbow-trout/p/208107) and [Truite arc-en-ciel entière fraîche](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-entiers/truite-arc-en-ciel-entiere-fraiche/p/208107); OQLF, [truite arc-en-ciel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel).

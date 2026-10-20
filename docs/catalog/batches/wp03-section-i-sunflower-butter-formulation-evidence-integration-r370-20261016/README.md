# WP03 Section I — sunflower-seed-butter terminology and formulation evidence (R370, 2026-10-16)

## Integration record

- **Status:** Integrated on 2026-10-16; see the [proposal](../../proposals/wp03-section-i-next-gap-review-r370-20261016.md).
- **Change:** Added the English alias `sunflower butter` and French alias `beurre de tournesol` to the existing `ingredient-ref-sunflower-seed-butter` reference. Added five new sources and three source-specific portion observations to its research-ledger row.
- **Scope:** Kept the existing bilingual display, `FAT_AND_OIL` category, no-form state, whole-seed and oil identities, null default density, empty unit mappings, and unresearched substitution state. No recipe or substitution link was added.

## Evidence and decision

USDA Agricultural Research Service uses “sunflower butter” for a spread developed from sunflower seeds. Maison Jacynthe's Québec listing names its product “beurre de tournesol biologique,” supporting the French alias as attested retail wording. OQLF supports the separate seed term `graine de tournesol`; it does not name prepared seed butter.

The reviewed product formulas differ. SunButter Canada No Sugar Added lists roasted sunflower seeds and salt with 0 g added sugars per serving; its Original product lists roasted sunflower seeds, sugar, and salt with 3 g added sugars per serving. Maison Jacynthe's listing identifies an organic product made with dry-roasted sunflower seeds and sunflower oil, without added salt, sugar, or hydrogenated oil. Existing Nuts to You sources document another SKU-specific dry-roasted-seed-and-oil formula. These records describe individual products and do not define one generic butter formula or a form split.

Health Canada's CNF food code 2529 lists 15 mL = 16.2 g, 30 mL = 32.4 g, and 100 mL = 108.1 g. The ledger stores these as published `portion_weight` observations only. They do not activate a general density, mapping, or conversion.

## Picker and recipe impact

- The new aliases resolve to `ingredient-ref-sunflower-seed-butter`.
- Existing search overlap between the butter display and `graines de tournesol` remains: that query matches both the butter and whole-seed identities.
- The bundled recipe corpus has no matching sunflower-butter line, so no recipe link changed.
- Substitution research remains `not_yet_researched`; the sources do not establish a general replacement ratio or safe culinary interchange.

## Sources

- USDA Agricultural Research Service, [Sunflower Butter](https://www.ars.usda.gov/is/br/sunbutter/sunbutter.pdf), November 2010.
- SunButter Canada, [No Sugar Added SunButter](https://sunbutter.com/products/canadian-no-sugar-added-sunbutter%C2%AE-sunflower-butter) and [Original SunButter](https://sunbutter.com/products/canadian-original-sunbutter%C2%AE-sunflower-butter); both product pages showed sold out when reviewed.
- Maison Jacynthe, [Beurre de tournesol biologique](https://maisonjacynthe.ca/products/beurre-de-tournesol-bio-500g).
- Health Canada, [Canadian Nutrient File serving portions, food code 2529](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2529).
- Reused Nuts to You sources `WP03-PASTE-PRODUCT-20261010-S04` and `WP03-PASTE-PRODUCT-20261010-S09`; reused OQLF [GDT: graine de tournesol](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015064/graine-de-tournesol).

## Validation

- Confirmed the five new source IDs and URLs were unused and retained the existing Nuts to You source registrations.
- Checked the reported portions against the CNF page; the ledger holds them as observations without activating density or mappings.
- Confirmed the alias values, owner identity, and no-recipe/no-substitution boundary in the bundled data and proposal.
- No software tests, Gradle tasks, emulator checks, or deployment were run because this change adds database JSON data and related documentation under `AGENTS.md`.

# WP05 Section S animal fats, shortening, and margarine integration

- Date: 2026-10-12
- Status: bounded identity tranche integrated; goose/chicken fats, baking spreads, and spray products remain open.
- Review packet: [animal fats and spreads boundary review](../../proposals/wp05-section-s-animal-fats-spreads-gap-review-20261012.md).

## Integrated decisions

Added identity-only `lard / saindoux`, `leaf lard / saindoux de panne`, `rendered pork fat / graisse de porc fondue`, `beef suet / suif de bœuf`, `edible tallow / suif comestible`, and `rendered duck fat / gras de canard fondu` under `FAT_AND_OIL`. Added `suif alimentaire` only as a French alias for edible tallow. Promoted the existing `ingredient-ref-shortening` candidate to `vegetable shortening / shortening végétal` using its stable ID. Verified the existing margarine reference and retained all six recipe links.

Kept lard distinct from leaf lard and rendered pork fat; beef suet distinct from rendered edible tallow; rendered duck fat distinct from other poultry fats; and vegetable shortening distinct from margarine and generic baking spreads. The one `oil spray` ingredient row remains unlinked because it identifies neither its oil source nor product delivery format. Goose fat, chicken fat, generic poultry fat, baking spreads, and generic shortening/grease wording remain held for focused review.

No recipe rows or links changed. No forms, density, unit mappings, measurements, package yields, conversions, or substitutions were added. The six margarine rows remain linked at `009#1`, `015#3`, `047#5`, `052#5`, `069#5`, and `103#5`; `033#8` remains the only ingredient row saying `oil spray` and remains unlinked.

## Evidence

The [OQLF saindoux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408998/saindoux), [leaf-lard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8890114/saindoux-de-panne), [beef-suet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432970/suif-de-boeuf), and [edible-tallow](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410404/suif-comestible) entries support the Québec French names and distinctions. The [Canadian Food Compositional Standards, Volume 8](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) defines lard, leaf lard, suet, shortening, and margarine. [Codex CXS 211-1999](https://www.fao.org/fao-who-codexalimentarius/codex-texts/list-standards/en/?ds=247) distinguishes lard, rendered pork fat, and edible tallow; the paired English and French versions are recorded as separate ledger source entries to keep each entry tied to one URL. OQLF's [graisse alimentaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/24198175/graisse-alimentaire) entry cautions against an unqualified French shortening alias. Bilingual Crisco Canada product pages and Mayrand's Québec listing support the vegetable-shortening wording. Canards du Lac Brome's bilingual product pages support only the species-qualified rendered-duck-fat name.

## Data checks

The package now contains 1,148 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy-import candidate file contains 68 candidates. The research ledger contains 1,442 records / 4,814 source entries / 3,934 distinct source IDs / 8 unit conversions.

Static package and ledger validation, normalization, generated-index freshness, exact phrase ownership, recipe-demand/link checks, UTF-8/no-BOM checks, and scoped whitespace checks passed. No tests or emulator checks were run because this change only updates database JSON data under `AGENTS.md`.

# WP05 Section V vinegar and acid-product integration

- Date: 2026-10-12
- Status: a bounded identity tranche is integrated; broader Section V remains open.
- Review packet: [vinegar and acid-product gap review](../../proposals/wp05-section-v-vinegar-acid-gap-review-20261012.md).

## Integrated decisions

- Kept the active white-vinegar and apple-cider-vinegar IDs. Added only reviewed aliases: white vinegar gained `spirit vinegar`, `alcohol vinegar`, `grain vinegar`, `vinaigre blanc distillé`, `vinaigre d’alcool`, and `vinaigre de grain`; apple cider vinegar gained `apple vinegar` and `ACV`. Existing names and aliases remain. The short English phrase `distilled vinegar` was not added because the reviewed sources attest `distilled white vinegar` and separately list spirit, alcohol, white, and grain vinegar.
- Promoted the existing IDs for red-wine vinegar / vinaigre de vin rouge, white-wine vinegar / vinaigre de vin blanc, and balsamic vinegar / vinaigre balsamique. Kept them distinct from one another and from distilled white vinegar; unqualified `wine vinegar` remains unassigned.
- Added identity-only malt vinegar / vinaigre de malt, coconut vinegar / vinaigre de noix de coco, and cane vinegar / vinaigre de canne. `sugar cane vinegar` is the only added alias. Coconut-water, coconut-sap, mixed, and regional/spiced products remain separate or unresolved.
- Recorded the generic vinegar / verjus boundary in the existing ledger. No acidic-juice identity was merged into vinegar.
- Kept all five audited vinegar-related recipe rows unchanged, including both generic vinegar lines, both white-vinegar lines, and the unlinked vinegar-or-lime alternative. No forms, density, unit mappings, measurements, package yields, conversions, preservation instructions, or substitutions were added.

## Evidence

- CFIA, [Canadian Food Compositional Standards, Volume 16](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §§16.1.1–16.1.5, supports separate wine, spirit/alcohol/white/grain, malt, and cider/apple classes. CFIA, [AIRS update — vinegar classifications (French page)](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/vegetaux-produits-vegetaux/sari/mises-jour-acia-sari-2024-12-02), supports the Canadian French product labels used here.
- OQLF, [vinaigre de cidre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17559980/vinaigre-de-cidre), [vinaigre de malt](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095428/vinaigre-de-malt), and [vinaigre balsamique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522907/vinaigre-balsamique), supports Québec terminology. Metro Québec's [specialty oils and vinegars listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/huiles-et-vinaigres/huiles-et-vinaigres-de-specialite) supports local red/white wine-vinegar names and separates balsamic vinegar from glaze.
- NutriAsia / Silver Swan's [vinegar product category](https://nutriasia.com/product_category/vinegar/) and the Philippine Statistics Authority's [commodity classification](https://psa.gov.ph/classification/pscc/heading/22.09) support cane and coconut-source product boundaries. The sources distinguish coconut-water, coconut-sap, mixed, and spiced products; those are not all aliases for the general coconut-vinegar row.
- Justice Canada, [Food and Drug Regulations B.19.001](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.19.001.html), defines vinegar by acetous fermentation; OQLF's [verjus entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503324/verjus) supports the separate acidic-juice boundary. Neither is used to create a measurement, preservation claim, or substitution.

## Data checks

The bundle contains 1,121 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy-candidate file has 71 entries. The ledger contains 1,418 records / 4,736 source entries / 3,876 distinct source IDs / 8 unit conversions.

Package validation and normalization, generated catalog freshness, ledger-schema validation, exact phrase ownership, forms/legacy collision checks, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No unit tests, instrumentation tests, or emulator run were performed because this change only updates database JSON data, consistent with `AGENTS.md`.

Section V remains open for sherry vinegar, unqualified wine vinegar, other fruit/palm and source-specific coconut vinegars, acidic non-vinegar products, forms/measurements, and independent Québec terminology review.

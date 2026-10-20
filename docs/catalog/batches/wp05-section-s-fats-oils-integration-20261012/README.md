# WP05 Section S fats and oils integration

- Date: 2026-10-12
- Status: a bounded identity tranche is integrated; the broader Section S plan remains open.
- Review packet: [fats and oils gap review](../../proposals/wp05-section-s-fats-oils-gap-review-20261012.md).

## Integrated decisions

- Added extra-virgin olive oil / huile d’olive vierge extra, separate from generic olive oil.
- Added canola oil / huile de canola; corn oil / huile de maïs, with French alias huile de germes de maïs; soybean oil / huile de soya, with bounded OQLF variants; and sunflower oil / huile de tournesol, with the two OQLF English seed-oil variants.
- Promoted the existing peanut-oil ID and added only arachis oil and groundnut oil English aliases. The broad phrase nut oil remains excluded.
- Added generic sesame oil / huile de sésame. Kept it distinct from toasted sesame oil / huile de sésame grillé.
- Removed canola oil, huile de canola, neutral oil, oil, and huile from generic vegetable oil. The display names remain generic and the recipe lines that name an option remain linked generically.
- Removed generic sesame oil ownership from toasted sesame oil and changed its French display to toasted-specific wording.
- Relinked only the two recipe rows that explicitly say extra-virgin olive oil and the one unqualified sesame-oil row. Preserved original wording, notes, quantities, and units.

The seven other unqualified olive-oil lines remain on generic olive oil. The other seven vegetable-oil lines remain generic; neither a note permitting canola nor a recipe that says “canola or vegetable oil” selects canola. The explicit toasted-sesame line remains toasted. No other oils, animal fats, oil sprays, or recipe rows were linked.

No forms, density, unit mappings, measurements, package yields, conversions, or substitutions were added.

## Evidence

- CFIA, [Labelling requirements for fats and oils](https://inspection.canada.ca/en/food-labels/labelling/industry/fats-and-oils): single-source oil naming, multi-source vegetable oil, and extra-virgin olive-oil designation.
- OQLF, [extra-virgin olive oil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430717/huile-dolive-vierge-extra), [canola oil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870887/huile-de-canola), [corn oil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413228/huile-de-mais), [soybean oil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083839/huile-de-soya), [sunflower oil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413238/huile-de-tournesol), [peanut oil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413219/huile-darachide), and [sesame oil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413479/huile-de-sesame).
- Kadoya Sesame Mills, [Sesame Facts](https://www.kadoya.com/english/facts/), and Maison Orphée, [Huile de sésame grillé vierge](https://maisonorphee.com/products/huile-de-sesame-grille-vierge), support keeping roasted and unqualified sesame-oil wording distinct. Product details do not establish a universal sesame-oil taxonomy.

No identity or labeling source was used to infer recipe interchangeability or numeric behavior.

## Data checks

The package contains 1,115 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy candidate file has 74 candidates. The ledger contains 1,415 records / 4,712 source entries / 3,866 distinct source IDs / 8 unit conversions.

Package validation and normalization checks, generated catalog freshness, ledger-schema validation, active phrase ownership, forms/legacy collision checks for the added oils, and exact recipe-line relink checks passed. No unit tests, instrumentation tests, or emulator run were performed because this change only updates database catalog JSON data, consistent with AGENTS.md.

Section S remains open for additional named oils, toasted/untoasted products, regional oils, animal fats, shortening, spreads, infused oils, cooking spray, and product-state behavior.

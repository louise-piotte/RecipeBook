# WP02 B2 R306 — yellow pea flour measurement and substitution

## Decision

Recorded one Cuisine Soleil manufacturer-specific amount for yellow pea flour: **1/4 cup (30 g)**.
The source page describes the amount in a protein statement and does not specify a scoop or filling
method. The observation stays on `ingredient-ref-yellow-pea-flour` as a manufacturer-specific
published portion. It does not establish a reusable density, a generic cup conversion, or a mass for
the volume-only flour quantity in Pulse Canada's blueberry-lemon quick bread.

Reviewed substitution evidence does not support a reusable direct replacement rule for the
unqualified identity:

- Cuisine Soleil recommends combining three flour components and presents yellow pea flour as one
  component.
- The pulse-industry gluten-free guide's one-to-one replacement is a combined yellow-pea-flour,
  tapioca-starch, and white-rice-flour blend.
- The industry baking guide uses precooked yellow pea flour in fixed bakery formulas at specified
  baker's percentages.
- The controlled wheat-bread study tests raw and roasted yellow split-pea flour at specified
  flour-basis levels and reports formula-dependent effects.

The ledger therefore records an evidence-only `researched_no_supported_substitute` finding with no
replacement, rule ID, recipe-line link, or active substitution rule. The ingredient reference,
aliases, forms, recipe links, density, unit mappings, conversions, and recipes remain unchanged.

## Sources

- Cuisine Soleil / Moulin A. Coutu, [Créez votre farine](https://cuisinesoleil.com/creez-votre-farine/), dated 2023-02-07. Reports 7 g protein per 1/4 cup (30 g) yellow pea flour and recommends a three-component flour blend.
- Pulse Canada, [Cooking with Pulses: Beans, Peas, Lentils & Chickpeas](https://ontariobeans.on.ca/wp-content/uploads/2020/06/PC_cooking_with_pulses_web-ready_spreads.pdf), p. 36, Blueberry Lemon Quick Bread. Lists 3/4 cup (185 mL) yellow pea flour for 12 servings, without its mass.
- USA Dry Pea & Lentil Council, [Baking Guide for Pulse Ingredients](https://usapulses.org/wp-content/uploads/2025/10/USA-Pulse-Flour-Brochure.pdf). Its fixed Pea Whole Wheat Hearth Bread and Pea Pan Bread formulas use precooked yellow pea flour at 5% and 30% baker's percentage.
- USA Dry Pea & Lentil Council / American Pulse Association, [Baking with Pulse Flours for Flavor and Functionality](https://usapulses.org/wp-content/uploads/2025/10/Baking-with-Pulse-Flours.pdf), p. 4. Describes one part yellow pea flour, one part tapioca starch, and one part white rice flour as a combined 1:1 replacement for traditional gluten flours.
- Kotsiou et al., [Impact of Roasted Yellow Split Pea Flour on Dough Rheology and Quality of Fortified Wheat Breads](https://pmc.ncbi.nlm.nih.gov/articles/PMC8391420/), *Foods* 10(8), 1832 (2021), DOI 10.3390/foods10081832. Tests raw and roasted yellow split-pea flour at 10%, 15%, and 20% flour-basis levels in wheat bread.

See the [R306 source review](../../proposals/wp02-b2-yellow-pea-flour-measure-substitution-review-r306-20261016.md) for the picker and corpus boundaries.

## Data checks

- Added five unique, record-local research sources, one manufacturer-specific portion observation, and one evidence-only no-supported-substitute finding.
- Confirmed the R306 sources and the manufacturer portion against their cited pages and documents.
- Kept active catalog and recipe data unchanged.
- No software tests, builds, emulator checks, or deployment were run because this integration only adds research data to the JSON database and plan notes under the current `AGENTS.md` rule.

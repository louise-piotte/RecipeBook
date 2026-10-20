# WP02 B3 R591 — sweet-potato-starch measurement evidence

Date: 2026-10-17

## Decision

Added six source-specific observations to the existing `ingredient-ref-sweet-potato-starch` research-ledger record:

- Three bulk-density measurements for white-, orange-, and purple-fleshed laboratory isolates in the 2026 Sabah study: 0.67, 0.71, and 0.73 g/mL.
- Three WhatToCookToday household portions: 1 US cup = 130 g, 1 US tablespoon = 8 g, and 1 US teaspoon = 3 g.

Kept each sample, portion, and method separate. The ledger measurement state is `researched_no_supported_value` for a generally transferable kitchen measure or default density. The reference retains `defaultDensity: null` and `unitMappings: []`. Substitution research remains `not_yet_researched`; no form, conversion, recipe link, yield, or substitution was added.

## Evidence

- Lim Hooi Yin et al., [“Physicochemical and functional characterisation of starches from sweet potato varieties grown in Sabah, Malaysia”](https://doi.org/10.37349/eff.2026.1010159), *Exploration of Foods and Foodomics* 4 (2026), 1010159: reports separate bulk densities for three laboratory starch isolates. Five grams were gently filled in a graduated cylinder without tapping; the paper reports mean ± SD and n=3 for each. These are not retail-product or kitchen values.
- Marvellina, [Grams to Cups Conversion (No Sifting)](https://whattocooktoday.com/grams-to-cups-conversion-no-sifting.html): reports the three US household portions for an unbranded sweet-potato starch and describes the cup and spoon methods. The observations remain publisher-specific and do not create an active mass-volume conversion.
- The existing OQLF source continues to support the FR-CA display `fécule de patate douce` and the extracted-starch identity; the existing `amidon de patate douce` alias is unchanged.

See the [R591 proposal](../../proposals/wp02-b3-sweet-potato-starch-measurement-review-r591-20261017.md), the [B3 starch checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3042), and the broader [B2/B3 review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L15900). Both broader tasks remain open.

## Static verification

Database JSON is valid and formatted as UTF-8 with escaped non-ASCII text. Schema, package, source ownership, generated-index freshness, recipe-corpus boundary, local-link, and scoped whitespace checks passed. No application tests, build, emulator check, or deployment were needed because this change only adds database JSON data and tracking documentation under `AGENTS.md`.

# WP05 Section V — acidity and preservation constraints

- **Date:** 2026-10-12
- **Status:** recipe-row and evidence audit complete; product/application constraint remains open.
- **Scope:** current vinegar, lemon-juice, and lime-juice references and the acid-related bundled recipe rows.

## Finding

The audit covered all 15 acid-related rows across the 114-recipe bundle: 8 lemon-juice rows, 2 lime-juice rows, 4 linked generic/white-vinegar rows, and the unlinked `vinegar or lime juice` alternative. None identifies an exact product with measured acidity, pH, or titratable acidity. Two stored recipe rows no longer match their current source pages, another source could not be fetched, and recipe 095 has no source URL; no recipe text or quantity was revised.

Canadian standards define vinegar as 4.1%–12.3% acetic acid and set minimum acidity for named lemon and lime juice using a different basis: 5.0 and 5.5 g/100 mL, respectively, calculated as anhydrous citric acid at 20°C. Same-fruit reconstituted juice must comply with its named-juice standard. These are legal class specifications, not measured values for the recipe products or an equivalence between products. Farm Boy’s current page identifies one white-vinegar SKU as 5% acetic acid by volume; none of the bundled rows names that product. Do not generalize its number.

Do not infer preservation suitability from ingredient names, amounts, legal minima, or general product-use claims. Health Canada requires current tested home-canning recipes and says not to change ingredient amounts or processing conditions. This audit adds no preservation instructions or recipe substitutions.

## Data effects and next evidence

- No catalog references, forms, aliases, recipe rows, or links changed.
- No acidity value, conversion, measurement default, or substitution rule was added or restored.
- Record an acidity constraint only when the exact recipe product, source measurement basis, and intended application are established. Preservation suitability requires tested, process-specific evidence.
- The research-ledger states for existing blocked draft rules remain unchanged; they are not active runtime rules.

## Current review snapshot

- 1,190 ingredient references / 86 forms / 66 legacy candidates.
- 114 manifest-listed recipes / 1,123 ingredient rows; 15 acid-related rows reviewed.
- 1,491 research-ledger records / 4,983 source entries / 4,066 distinct source IDs / 8 unit conversions; ledger SHA-256: `e014f19fdf72353f16ef99adff433ce131eaeef7feafbe2c0e067a659802a914`.
- Recipe-corpus SHA-256: `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`.

## Sources and handoff

See the [proposal packet](../../proposals/wp05-section-v-acidity-preservation-constraints-review-20261012.md) for the complete row and source tables. The [Canadian Food and Drug Regulations](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.19.001.html) specify the legal vinegar class range; [CFIA standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) give separate lemon/lime juice class requirements. Farm Boy’s [white-vinegar page](https://www.farmboy.ca/products/farm-boy-pure-white-vinegar-4-l/) provides a single product-specific label value. The [Health Canada home-canning guidance](https://www.canada.ca/en/health-canada/services/general-food-safety-tips/home-canning-safety.html) requires tested recipes and exact process conditions.

This was a documentation-only audit. No tests or emulator checks were needed.

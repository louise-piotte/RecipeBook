# WP07 distilled-water density evidence integration

Added two direct, sample-specific NIST density readings to the existing `ingredient-ref-water` ledger record. The paper reports distilled water degassed by boiling, measured at 20.000 °C ± 0.001 °C: **0.9982028 ± 8.3×10⁻⁷ g/cm³** before the oil measurements and **0.9982004 ± 1.5×10⁻⁶ g/cm³** afterward. The same sample was remeasured; the values remain separate and are not averaged.

These are water calibration checks in a NIST study of DEHS oil. The sample is not generic recipe water, and the paper does not state pressure for the water readings. USGS guidance notes that temperature and dissolved substances affect water density. No household-water default, unit mapping, or recipe conversion was activated; the active water reference keeps density null and unit mappings empty. Recipe quantities and temperature wording are unchanged.

Ledger validation passed with 1,613 records and zero errors. UTF-8/no-BOM and scoped whitespace checks passed. No app tests or emulator checks were run because this update only adds database JSON data under `AGENTS.md`.

Sources: [proposal and recipe audit](../../proposals/wp07-water-distilled-density-evidence-review-20261012.md), [NIST-authored measurement paper](https://tsapps.nist.gov/publication/get_pdf.cfm?pub_id=900223), [USGS water-density guidance](https://www.usgs.gov/water-science-school/science/water-density).

# WP07 source-unit and derived-calculation audit

Audited the current research ledger on 2026-10-14 for source-unit preservation, the eight registered unit factors, and every interval marked as derived.

## Findings

- The ledger has 435 measurement observations: 417 scalar observations with a `valueUnit` and 18 interval observations with 19 intervals. All numeric outputs retain a unit. Source-reported intervals retain their reported text, and each derived interval has a calculation record. Quantity descriptors such as `large egg`, `can`, and `g picked meat` remain source-qualified instead of being treated as generic convertible units.
- All nine derived egg ranges match the extrema of their recorded source-value lists and the cited tables. The UK report labels these measurements as averages and documents its medium/large size bands and the limited use of eggs below the nominal large threshold. The US study reports six commercial-brand means, not individual-egg ranges.
- Existing source caveats remain recorded with the observations: the UK collection-date summary conflicts with several detail-sheet dates, while the US paper does not define the table's ± statistic in the accessible text and its sample counts do not reconcile between methods and Table 1. Neither caveat changes the extrema calculated from the printed means; uncertainty terms were not folded into the ranges.

| Observation | Recomputed range |
| --- | ---: |
| UK medium shell-on whole egg | 58.2–60.5 g |
| UK large shell-on whole egg | 64.0–67.6 g |
| UK medium raw white | 34.4–37.5 g |
| UK large raw white | 39.1–42.7 g |
| UK medium raw yolk | 14.1–15.7 g |
| UK large raw yolk | 15.7–17.7 g |
| US shell-on whole egg | 59.6–62.4 g |
| US raw albumen | 30.3–35.5 g |
| US raw yolk | 14.9–21.4 g |

- All eight generic unit-conversion factors match NIST Appendix B.9 at the published precision. The ounce and pound rows use avoirdupois mass; the cup and fluid-ounce rows use US volume measures. These factors do not supply ingredient densities or convert source-specific recipe portions.

| From | To | Factor |
| --- | --- | ---: |
| kg | g | 1000 |
| oz | g | 28.34952 |
| lb | g | 453.5924 |
| l | ml | 1000 |
| tsp | ml | 4.928922 |
| tbsp | ml | 14.78676 |
| cup | ml | 236.5882 |
| fl oz | ml | 29.57353 |

## Sources

- [NIST Guide to the SI, Appendix B.9](https://www.nist.gov/pml/special-publication-811/nist-guide-si-appendix-b-conversion-factors/nist-guide-si-appendix-b9)
- [UK Department of Health, *Nutrient analysis of eggs: Sampling report*](https://assets.publishing.service.gov.uk/media/5a7aa918ed915d71db8b19bf/Nutrient_analysis_of_eggs_Sampling_Report.pdf), Tables 1–2
- [Hisasaga, Griffin, and Tarrant, *Survey of egg quality in commercially available table eggs*](https://pmc.ncbi.nlm.nih.gov/articles/PMC7705037/), Table 2; [publisher DOI](https://doi.org/10.1016/j.psj.2020.09.049)

## Static validation

- A calculation audit recomputed all nine extrema from the lists stored in each observation; zero mismatches.
- Research-ledger schema and semantic validation passed: 1,796 records, zero errors.
- No ingredient-specific density, count mapping, or source-portion conversion was activated by this review. The separate WP07 gap checklist remains open.

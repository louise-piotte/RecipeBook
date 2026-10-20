# WP02/WP03/WP05 identity-only integration — 2026-10-12

## Decision

Integrated six evidence-backed ingredient identities after root review of the separate proposal packets:

| Stable ID | English / Québec French display | Category | Evidence boundary |
| --- | --- | --- | --- |
| `ingredient-ref-kodo-millet-flour` | kodo millet flour / farine de millet kodo | `FLOUR_AND_STARCH` | Species-qualified flour; distinct from kodo grain and generic millet flour. |
| `ingredient-ref-proso-millet-flour` | proso millet flour / farine de millet commun | `FLOUR_AND_STARCH` | Species-qualified flour; distinct from common-millet grain and generic millet flour. |
| `ingredient-ref-foxtail-millet-flour` | foxtail millet flour / farine de millet d'Italie | `FLOUR_AND_STARCH` | Species-qualified flour; French compound uses OQLF's grain term, not an OQLF flour entry. |
| `ingredient-ref-black-sesame-paste` | black sesame paste / pâte de sésame noir | `SAUCE_AND_CONDIMENT` | Plain paste from ground black sesame; colour-qualified `black sesame butter` / `beurre de sésame noir` aliases only. |
| `ingredient-ref-green-curry-paste` | Thai green curry paste / pâte de cari vert thaï | `SAUCE_AND_CONDIMENT` | Distinct from generic and red curry paste, curry powder, green chili paste, and finished curry sauce. |
| `ingredient-ref-thai-sweet-chili-sauce` | Thai sweet chili sauce / sauce chili douce de type thaïlandais | `SAUCE_AND_CONDIMENT` | Bottled Thai-style sweet chili condiment; distinct from sriracha, sambal, generic chili paste, and sweet-and-sour sauce. |

The separate proposal packets hold little-millet flour because its French name/species scope is unresolved and keep generic sesame paste held. No broad aliases were added. The French compounds are descriptive/current Québec or Canadian usage; no unsupported OQLF standardization claim was introduced.

All six references are identity-only. Measurement and substitution research remains `not_yet_researched`. No forms, densities, unit mappings, recipe links, measurements, package/cooking yields, conversions, or substitutions were added. No bundled recipe ingredient line matched the six proposed products.

## Evidence and review packets

- [A6 regional millet flours proposal](../../proposals/wp02-a6-next-regional-millet-flours-review-20261012.md)
- [Black sesame paste boundary proposal](../../proposals/wp03-section-i-black-sesame-paste-boundary-review-20261012.md)
- [Thai curry paste and sweet chili proposal](../../proposals/wp05-section-x-green-curry-paste-sweet-chili-review-20261012.md)

Each packet includes its product sources, bilingual wording review, collision scan, recipe-demand scan, and explicit evidence limits. Root rechecked key product and Québec language sources before integration.

## Snapshot and validation

- Package: **1,101 references**, **79 forms**, **114 recipes**, and **1,123 ingredient rows**.
- Ledger: **1,401 records**, **4,668 source entries**, **3,827 distinct source IDs**, and **8 unit conversions**.
- Seed-package normalization/validation passed; package normalization reported zero changed parts.
- Ingredient-reference normalization completed; the generated Kotlin catalog is current at 1,101 references.
- Research-ledger validation passed with zero errors.
- Exact normalized English/French display and alias ownership, source-ID, recipe-demand, UTF-8/no-BOM, and scoped whitespace audits passed.
- No unit tests, instrumentation tests, or emulator checks were run. This is a database JSON data addition under the current `AGENTS.md` exemption.

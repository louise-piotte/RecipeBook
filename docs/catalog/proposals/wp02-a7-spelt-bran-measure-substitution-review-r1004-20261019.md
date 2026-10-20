# WP02 Section A7 R1004: spelt-bran measurement and substitution review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated in the [R1004–R1006 batch](../batches/wp02-wp03-wp04-r1004-r1006-generic-gap-integration-20261019/README.md). This file preserves the evidence and limits recorded when the proposal was drafted.
- **Open-plan anchor:** Section A7 remains open for other grain meals and milling products ([catalog plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** The existing generic `spelt bran / son d’épeautre` identity still has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched` in the live ledger.
- **Recommendation:** Preserve the verified identity and bilingual displays. If accepted, update only the ledger measurement and substitution research states and add two proposal-scoped primary-study sources plus one blocked, source-scoped cookie finding. Keep aliases, measures, density, mappings, forms, recipe links, conversions, yields, and active substitution rules unchanged or empty.
- **Scope:** Generic ingredient evidence only. This review did not investigate brand, product-line, flavour-family, SKU, or retailer variants. Any roster-only task remains out of scope because commercial-product counts do not add ingredient diversity.

## Identity boundary and live state

The active identity is the edible bran fraction obtained by milling spelt grain (*Triticum aestivum* subsp. *spelta*). Keep it separate from generic wheat bran and other source-grain brans; spelt flour, whole-spelt flour, whole spelt grain, spelt flakes, and the adherent hull/glumes; and bran-rich wholegrain flour. Retain the current English display `spelt bran`, Québec French display `son d’épeautre`, empty English and French alias arrays, `defaultDensity: null`, empty `unitMappings`, and category `GRAIN_AND_CEREAL`.

The existing R887 identity decision is preserved. Its sources establish the milling identity and local name, but intentionally did not settle measurement or substitution. This proposal adds no separate identity, alias, form, or picker term.

Read-only live state on 2026-10-19:

| Surface | State | R1004 disposition |
|---|---:|---|
| Ingredient references | 2,019 | The existing `ingredient-ref-spelt-bran` row is the single exact identity owner. Preserve it. |
| Ingredient forms | 205 | No spelt-bran form or grade exists. Add none. |
| Legacy import identities | 55 candidates | No spelt-bran candidate or alias needs promotion. |
| Research ledger | 2,425 records | The verified record has measurement and substitution states `not_yet_researched`, no measurement observations, and no substitution findings. The two new study URLs/DOIs are not already owned in the ledger. |
| Bundled rules | No target match | Neither global nor contextual substitution rules mention spelt bran. Add no rule. |
| Bundled recipes | 114 files / 1,123 ingredient rows | No recipe demand or recipe-line context supports a measure or direct substitution link. |

The live row’s R887 sources and decision remain untouched. The new study sources below are attached only to this spelt-bran follow-up if it is integrated; no source claim is moved from wheat bran or any other ingredient.

## Measurement review

The bounded search did not find a supported household portion, dry-volume/mass pair, or transferable cup density for generic spelt bran. The 2018 study reports **water-holding capacity 2.98 ± 0.07 g/g**, **water-retention capacity 1.68 ± 0.02 g/g**, **swelling capacity 5.19 ± 0.01 mL/g**, and **oil-binding capacity 1.73 ± 0.01 g/g** for its tested spelt-bran sample. These are laboratory functional-property results under the study’s methods, not loose bulk density, a serving, or a kitchen volume conversion. Keep all four figures as source context only; do not encode them as measurement observations, density, mappings, or recipe hydration guidance.

The same study tested wheat-flour dough blends with **5%, 10%, and 15%** spelt bran in a Mixolab. Its water-absorption readings were **59.50 ± 0.03%, 61.50 ± 0.00%, and 62.78 ± 0.04%**, respectively, versus **55.9 ± 0.00%** for the study’s wheat-flour control. These instrumented dough results describe the studied sample and test protocol; they do not give grams of added water for a household recipe.

If integrated, set `measurementState` to **`researched_no_supported_value`** and leave `measurementObservations: []`, `defaultDensity: null`, and `unitMappings: []`. Keep the hydration figures in the source description only. Do not reinterpret a swelling or water-binding ratio as loose-bran density.

## Substitution review

One primary cookie study replaced wheat flour with its spelt-bran sample at **5%, 10%, and 15%** in a single controlled formula. The spelt-bran cookies had specific volumes of **256.28 ± 10.39**, **224.74 ± 7.39**, and **211.44 ± 11.65 cm³/100 g** at those levels. Overall acceptability was **70.17 ± 2.81%**, **71.08 ± 2.67%**, and **69.33 ± 3.19%**, respectively, compared with **80.67 ± 3.81%** for the control. The article marks the spelt-bran sensory results as statistically different from the control at *p* = 0.05. These are results for that study’s flour and spelt-bran samples, cookie method, and sensory panel; they do not establish a recommended replacement level for home cookies or other recipes.

The 2018 dough study also tested 5%, 10%, and 15% flour replacement in a Mixolab protocol, but its instrumented properties are not a home-recipe recommendation. Neither paper supplies transferable context such as a household role, matched recipe amount and method, broadly applicable adjustment, or an independently validated replacement rule. The recipe corpus contains no spelt-bran line to link.

If integrated, set `substitutionResearchState` to **`blocked_pending_evidence`** and append at most one finding with no `replacements`. Keep the observed percentages, sensory results, and dough properties attached to the studies and samples. Add no global rule, contextual rule, recipe-line link, water adjustment, or generic substitute recommendation.

## Recipe-demand scan

The read-only scan parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**, searching the full serialized recipe text for `ingredient-ref-spelt-bran`, `spelt bran`, `spelt-bran`, `son d’épeautre`, `son d'epeautre`, `son d epeautre`, `Triticum aestivum subsp. spelta`, and `spelt bran flour`. It found **zero** recipe files and **zero** ingredient-row matches. No recipe link, recipe edit, or demand-driven measure is supported.

## Search log and sources

Bounded searches completed on 2026-10-19:

| Query | Finding |
|---|---|
| `"spelt bran" "cup" grams OR volume-to-mass OR density` | No primary or authoritative consumer source established a dry cup/gram pair or reusable volume conversion for generic spelt bran. |
| `"spelt bran" density volume g mL food` | Found laboratory swelling/hydration results, but no loose bulk density or consumer measure applicable to the generic row. |
| `"son d’épeautre" tasse grammes` | No Québec household-measure source found. |
| `"spelt bran" wheat flour replacement cookie study` | Found the primary controlled-cookie study below; its tested percentages and outcomes remain formula/sample-specific. |
| `"spelt bran" Mixolab water absorption dough study` | Found the primary Mixolab study below; its hydration and dough metrics are instrument-specific. |

| Source ID (proposal-local) | Source and locator | Evidence and limit |
|---|---|---|
| `WP02-A7-SPELT-BRAN-MEASURE-SUB-R1004-20261019-S01` | Lauková et al., [“Thermo-mechanical properties of dough enriched with wheat bran from different wheat variety”](https://doi.org/10.5219/888), *Potravinarstvo Slovak Journal of Food Sciences* 12(1) (2018), 202–208. Methods; Table 1; Table 2; results/discussion. | Primary food-science study. Table 1 reports the sample-specific spelt-bran hydration/functional values above; methods describe laboratory water-holding, retention, swelling, and oil-binding tests. Tables 1–2 test 5%, 10%, and 15% spelt bran in wheat dough and report Mixolab properties. These are neither household portions nor a transferable hydration adjustment or substitution recommendation. Keep all numeric claims limited to that sample and protocol. |
| `WP02-A7-SPELT-BRAN-MEASURE-SUB-R1004-20261019-S02` | Lauková et al., [“Potential of bran from various wheat variety for cookies production”](https://doi.org/10.1515/acs-2016-0016), *Acta Chimica Slovaca* 9(2) (2016), 95–99. Methods; Tables 2–3; conclusion. | Primary cookie study. It replaces wheat flour with a spelt-bran sample at 5%, 10%, and 15%, with the exact spelt-cookie volume and acceptability figures summarized above. The results are specific to that formula, flour and bran samples, baking method, and panel; the authors’ general conclusion about 5% refers to bran supplementation overall and is not assigned as a spelt-bran catalog rule. |
| Reused `WP02A4-SP-S01` | OQLF, [GDT: épeautre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre), existing source on the spelt identity record. | Retain existing crop-term and taxon support. This review does not add an OQLF source or claim that OQLF reviewed measurements or substitutions. |

At proposal drafting, the new source IDs were local and neither DOI was already present in the live ledger. The R1004 integration registered both studies on the existing spelt-bran ledger record. They record bounded research findings, not commercial variants. Existing R887 source ownership and claims remain unchanged; its identity sources are not treated as evidence for measurements or substitutions here.

## Proposed minimal ledger delta

If accepted, update only `ingredient-ref-spelt-bran`:

- `measurementState`: `researched_no_supported_value`
- `substitutionResearchState`: `blocked_pending_evidence`
- Append the two source entries above, retaining each study's exact method and sample limits.
- Keep `measurementObservations: []`; the reported functional properties are not household measures or density observations.
- Append one `blocked_pending_evidence` cookie finding with `replacements: []`, naming the study context and preserving all percentages and outcomes as study-specific.
- Append a decision that keeps the active identity, names, aliases, null density, mappings, forms, and recipe links unchanged.

Proposed finding ID: `spelt-bran-cookie-replacement-trial-r1004-20261019`. Its context should say that one study tested its spelt-bran sample replacing wheat-flour mass in its controlled cookie formula at 5%, 10%, and 15%. Its basis may retain the table values above, but it must say that those results do not support a reusable home-recipe ratio. Limitations should state that the study sample and formula are not shown to represent generic spelt bran; only one cookie system and one study panel were tested; the formula's outcomes are not transferable to other baked goods; and there is no bundled recipe demand or recipe-line match.

Do not add a `Replacement`, default density, mass-density or bulk-density observation, portion-weight observation, form, conversion, yield, global/contextual substitution, recipe annotation, or alias. Preserve the verified identity and all existing branded records without renaming, merging, deleting, or evidence transfer.

## Integration validation needed

If the coordinator accepts the ledger-only proposal, validate the exact source IDs and URL ownership, ledger schema, state/findings consistency, package integrity, alias-collision/identity preservation, UTF-8 without BOM, and `git diff --check`. Re-scan the recipe manifest to confirm zero target links. No software tests, build, emulator run, or deployment are indicated for this proposal-only research; database-only JSON additions are exempt from tests under `AGENTS.md`.

The evidence-only update is safe to integrate if the numerical claims remain attached to their cited study samples and test formulas, and no generic measure or active substitution rule is inferred. Independent Québec French wording is not reopened; `son d’épeautre` and the identity row remain unchanged.

# WP05 Section W R956 generic preserved-food gap review: khalpi

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity and boundary review. No shared catalog, ledger, plan, roadmap, or checklist files were changed.
- **Plan anchor:** Section W leaves “further documented regional preserves” open at [the global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10351), after the integrated R950 sinki and R953 gundruk identities.
- **Recommendation:** Add one identity-only `khalpi` reference in `SAUCE_AND_CONDIMENT`. Use `khalpi` in both English and fr-CA, with the French borrowed display explicitly provisional. The source-attested English spelling variant `khaipi` may be an English alias; do not add a descriptive French alias or general cucumber-pickle aliases.
- **Scope:** This review covers one named generic Himalayan fermented-cucumber food. Brand, product-line, flavour-family, SKU, and retailer-variant rosters are out of scope because commercial-product counts do not add ingredient diversity. No such roster was researched. Preserve all existing rows and evidence; no merge, deletion, or evidence transfer is proposed.

## Current ownership and source-ID audit

At the audit snapshot, the bundled seed contains **1,972 ingredient references and 205 forms**, the legacy-import file contains **55 candidates**, and the research ledger contains **2,377 records**. Exact and spelling-variant searches for `khalpi`, `khaipi`, `khalpi ko achar`, `fermented cucumber`, and the proposed ID `ingredient-ref-khalpi` found no owner in active reference names or aliases, form labels or match terms, or legacy candidates. No dedicated khalpi ledger record or R956 source-ID prefix exists.

The term `khalpi` appears contextually in the active `ingredient-ref-gundruk` record because the R953 comparative study names gundruk, sinki, and khalpi as separate Himalayan ferments. That is not a khalpi owner. The study’s current source ID, `WP05-SECTIONW-GUNDRUK-R953-20261019-S02`, remains assigned to gundruk’s review; R956 registers the same paper under a new unique source ID for khalpi’s claim rather than moving or reusing that ledger entry. The existing sinki sources and record also remain unchanged.

| Nearby active identity | Current scope | Boundary retained for khalpi |
|---|---|---|
| `ingredient-ref-cucumber` — `cucumber / concombre` | Fresh cucumber. | Khalpi is a named prepared fermented food, not a raw-cucumber alias or form. |
| `ingredient-ref-bread-and-butter-pickle` — `bread and butter pickle / cornichons sucrés` | A specific sweet cucumber pickle already used by a recipe. | Keep the existing identity and recipe link; the named Himalayan ferment is not its alias or form. |
| Generic pickled cucumber | No generic active owner; the earlier preserved-condiment demand review held this broad class. | This proposal does not create a catch-all cucumber pickle row or alias khalpi to generic pickles. It adds only the source-defined named ferment. |
| `ingredient-ref-gundruk` and `ingredient-ref-sinki` | Named Himalayan fermented leafy-vegetable and radish foods, respectively, with source-bounded regional variation. | Keep their names separate. Khalpi is independently described as a cucumber ferment; do not merge the rows or imply interchangeability. |
| `ingredient-ref-fermented-bamboo-shoots` | Fermented bamboo-shoot preserve class. | Different substrate and named food; no alias or form relation. |
| `ingredient-ref-pickled-mustard-greens`, `ingredient-ref-takana-zuke`, and other named preserves | Other vegetable substrates and regional preparations. | Keep each existing identity and its evidence intact. No broad preserved-vegetable synonym is proposed. |

R953 named khalpi as a nearby cucumber ferment but explicitly did not assess or add it. The current scan confirms its identity remains unowned. The plan’s broader regional-preserve checklist remains open; this proposal addresses only khalpi and does not close that checklist.

## Recipe-demand check

All **114** bundled recipe JSON files and **1,123** ingredient rows were scanned, including full serialized recipe text. The bounded query set (`khalpi`, `khaipi`, `khalpi ko achar`, `fermented cucumber`, `Himalayan cucumber pickle`, `khalpi pickle`, and `cucumber ferment`) returned no recipe hits. This lexical check does not establish that no recipe could use the food, but it supplies no direct bundled demand. No recipe link or recipe-derived measure is proposed. Raw cucumber wording and the already-linked bread-and-butter-pickle line are not evidence of khalpi demand.

## Identity and evidence limits

Tamang and Tamang’s primary fermentation study identifies khalpi as a fermented cucumber product prepared and consumed in the Himalayas. This is direct support for a distinct named generic food identity and for separating it from gundruk’s leafy-vegetable identity. The study investigates microbial changes during fermentation; its experimental cultures, timings, and results are not proposed as a universal khalpi process or catalog measurement. [S01]

A second primary Eastern Himalayan study describes “khalpi or khaipi” as a fermented cucumber product commonly consumed by Brahmin Nepalis in Sikkim, and separately analyses khalpi samples alongside gundruk, sinki, and inziangsang. This supports `khaipi` as a source-attested English spelling variant and the named-food boundary. Its description of mature cucumber, sun-drying, bamboo fermentation, season, and pickle use is bounded to the studied Sikkim practice; those details do not establish a mandatory formula, container, process duration, seasoning, or form for all khalpi. [S02]

The evidence supports adding the named food while keeping the broader generic cucumber-pickle class unresolved. It does not support making every fermented cucumber `khalpi`, or treating all cucumber pickle methods as equivalent. Do not add `fermented cucumber`, `pickled cucumber`, `cucumber pickle`, or `khalpi ko achar` as aliases: the first three are broader descriptors, while the last is a dish/use phrase rather than an established ingredient synonym.

Targeted OQLF searches did not surface a Québec-specific French term for khalpi. Use the source-attested regional name unchanged in `nameFr`, marked provisional; do not invent a French translation. The English variant `khaipi` is not added to French aliases. No manufacturer, retailer, or product-specific evidence is needed for this generic identity.

## Proposed minimal data and ledger states

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-khalpi` |
| `nameEn` | `khalpi` |
| `nameFr` | `khalpi` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `khaipi` (source-attested spelling variant only) |
| French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, measurements, conversions, yields, substitutions | None |

Proposed ledger state: `recordType: ingredient_reference`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, keyed by `ingredient-ref-khalpi`. Keep all source-specific method details and experimental observations in the evidence notes; add no numeric defaults, forms, conversions, yields, or substitution rules. Retain the provisional French-language boundary in the identity decision. No existing branded row or evidence is transferred, merged, or deleted.

## Source register

Sources were reviewed online on 2026-10-19. The R953 source ID for the shared 2005 comparative article remains with gundruk; the R956 ID below records its separate khalpi claim without reassignment.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-KHALPI-R956-20261019-S01` | Buddhiman Tamang and Jyoti Prakash Tamang, [“In situ fermentation dynamics during production of gundruk and khalpi, ethnic fermented vegetable products of the Himalayas”](https://pmc.ncbi.nlm.nih.gov/articles/PMC3396415/), *Indian Journal of Microbiology* 50(Suppl 1), 2010, abstract. | Primary study identifies khalpi as a fermented cucumber product consumed in the Himalayas. Its microbial and laboratory results are study-specific and do not set a generic fermentation process. |
| `WP05-SECTIONW-KHALPI-R956-20261019-S02` | Jyoti P. Tamang et al., [“Identification of predominant lactic acid bacteria isolated from traditionally fermented vegetable products of the Eastern Himalayas”](https://doi.org/10.1016/j.ijfoodmicro.2005.04.024), *International Journal of Food Microbiology* 105(3), 2005, article preview and abstract. | Primary study calls the product `khalpi` or `khaipi`, identifies cucumber as its substrate, places the described use in Sikkim, and analyzes it separately from gundruk and sinki. Its studied household method and use are not a universal product specification. |

**Disposition:** Propose one identity-only `khalpi` reference and the single source-attested English spelling alias `khaipi`; keep the borrowed fr-CA display provisional and the generic pickled-cucumber class outside this decision. No roster-only commercial task was pursued because product counts do not add ingredient diversity. No software tests were run for this proposal-only document.

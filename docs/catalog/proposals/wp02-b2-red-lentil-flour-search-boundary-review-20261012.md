# WP02 B2 red lentil flour identity and search-boundary review

- **Date:** 2026-10-12
- **Status:** Proposal only; no shared catalog, ledger, roadmap, checklist, recipe, or generated file was changed.
- **Scope:** One color-qualified pulse-flour candidate, red lentil flour. This extends the open WP02 B2/B3 flour review and does not reopen the completed red-lentil whole-food or green-lentil-flour decisions.
- **Recommendation:** **Hold catalog integration pending a picker-search fix or an independently supported disambiguation.** Current Canadian sources support a distinct red lentil flour identity and the bilingual labels below. However, adding the English display `red lentil flour` to the current catalog would change the bare `red lentil` query from the whole-pulse reference to flour alone. The current picker prioritizes complete word-phrase matches over substring fallback, so this is a real selection collision rather than a missing-name issue.

## Candidate, if the search boundary is resolved

| Proposed field | Value |
|---|---|
| Candidate ID (not reserved) | `ingredient-ref-red-lentil-flour` |
| English display | `red lentil flour` |
| French display | `farine de lentilles rouges` |
| Category | `FLOUR_AND_STARCH` |
| Aliases | None |

The Canadian mill Ardent Mills lists red lentils and red lentil flour as distinct product formats and says lentil flour is produced by milling the seed [S01]. Tootsi lists a standalone bilingual product as `organic red lentil flour` / `farine de lentilles rouges biologiques` and identifies its ingredient as red lentils [S02]. Catelli's current French product page lists `Farine de lentilles rouges` as the single ingredient in its red-lentil pasta [S03]. Simpson Seeds independently lists raw and precooked red lentil flour as pulse-flour product names [S04]. Together these sources support an unqualified flour identity with the proposed English and French displays. They do not establish that every product shares a raw, precooked, organic, or other processing state.

## Current package and exact ownership

Read-only snapshot of the working tree on 2026-10-12:

| Surface | Current state |
|---|---|
| Active ingredient references | 1,244 |
| Ingredient forms | 94 |
| Research-ledger records / source entries | 1,550 / 5,371 |
| Legacy-import candidates | 66 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |
| Manifest-ordered recipe bytes / fingerprint | 753,736 bytes / `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

The candidate ID is absent from active references, forms, legacy candidates, and ledger record IDs. The exact normalized phrases `red lentil flour`, `farine de lentilles rouges`, `farine de lentille rouge`, `organic red lentil flour`, and `farine de lentilles rouges biologiques` have no exact owner in current references, forms, or legacy candidates. The existing `ingredient-ref-green-lentil-flour` remains verified with empty alias arrays, null density, and no unit mappings. The whole-food `ingredient-ref-red-lentils` remains a separate `LEGUME_AND_PULSE` reference displayed as `red lentils / lentilles rouges`; this proposal makes no change to that recent identity or its open preparation-state boundaries.

The exact-phrase audit follows `normalizeIngredientSearchKey` and the search ordering in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`:

| Query | Current result | Effect if the proposed row is added as written |
|---|---|---|
| `red lentil flour` | No result | Exact phrase returns the proposed flour row. |
| `farine de lentilles rouges` | No result | Exact phrase returns the proposed flour row. |
| `lentilles rouges` | `ingredient-ref-red-lentils` | Exact phrase returns both the whole pulse and flour row; the French plural remains available as a disambiguating query. |
| `lentil flour` | `ingredient-ref-green-lentil-flour` | Phrase search returns green and red flour; the shared phrase is not an alias or equivalence. |
| `farine de lentilles` | `ingredient-ref-green-lentil-flour` | Phrase search returns green and red flour; keep this generic phrase out of both alias lists. |
| `red lentil` | `ingredient-ref-red-lentils` through substring fallback | The proposed display creates a complete phrase match, which suppresses fallback and returns only red lentil flour. The intended whole-pulse result disappears. |

The last row is the integration blocker. A safe follow-up must preserve the whole-pulse result for a bare `red lentil` query while also exposing the flour identity. Do not add an unsupported `red lentil` alias to the whole-food row as a workaround; resolve this through source-backed disambiguation or search behavior, then re-check the picker results. Until then, the candidate remains unallocated.

## Recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched. Whole-file and ingredient-row scans found zero normalized phrase hits for `red lentil flour`, `red lentils flour`, `farine de lentilles rouges`, `farine de lentille rouge`, `lentil flour`, `farine de lentilles`, `lentilles rouges farine`, `lentilles rouges (corail)`, and the organic product wording. No row is linked to `ingredient-ref-red-lentils`, and no red-lentil flour recipe line or relink is supported. The corpus provides no numeric or substitution demand for this candidate.

## Alias, identity, and numeric boundaries

- Keep red lentil flour separate from whole red lentils and green lentil flour. Do not merge it into generic lentil flour or add `lentil flour` / `farine de lentilles` as aliases.
- Do not assign the French form `farine de lentilles rouges biologiques` or English `organic red lentil flour` globally; those modifiers belong to Tootsi's named product [S02].
- Do not add `lentilles corail`, generic `farine de lentille`, or other red-lentil forms as aliases. The current whole-food red-lentil review leaves processing distinctions unresolved.
- Simpson's product family names both raw and precooked red lentil flour [S04], but its `Raw Red Lentil Flour` page calls the product finely milled from Canadian red lentils and then lists its format as `Precooked` [S05]. This page-level conflict is not a basis for an alias, preparation form, or separate catalog identity.
- Tootsi's product-specific nutrition panel gives `1/4 cup (30 g)` for its organic SKU [S02]. Catelli's `85 g` nutrition portion is for finished pasta, not loose flour [S03]. Neither is a general flour mass-volume mapping or density. Simpson's per-100-g nutrition values are not a household measure [S05]. Leave `defaultDensity` null and `unitMappings` empty if later integrated.
- Add no ingredient form, measurement, conversion, yield, recipe link, or global/contextual substitution. Product application statements do not establish a replacement ratio.

## Source register

The five proposal-local IDs below use prefix `WP02-B2-RED-LENTIL-FLOUR-20261012`. Before drafting, this prefix and all five IDs were absent from the current ledger and existing proposal files. The source pages were checked online on 2026-10-12.

| Source ID | Exact source and evidence | Limits |
|---|---|---|
| **WP02-B2-RED-LENTIL-FLOUR-20261012-S01** | Ardent Mills Canada, [Red & Green Lentils & Flour](https://ardentmills.ca/products/pulses/red-green-lentil-flour/). Lists red and green whole lentils separately from green and red lentil flour; says flour is produced by milling the seed. The page identifies Ardent Mills as a commercial supplier. | Supports the milling identity and red/green flour distinction. Commercial format availability is not consumer demand or a generic recipe measure. |
| **WP02-B2-RED-LENTIL-FLOUR-20261012-S02** | Tootsi, [Organic red lentil flour product 31521](https://tootsi.com/us/Product/ProductPrint/31521). Bilingual standalone product label `organic red lentil flour` / `farine de lentilles rouges biologiques`; ingredient declaration is red lentils. The page also reports a product weight of 44.1 lb and a `1/4 cup (30 g)` nutrition serving. | Direct Canadian bilingual label evidence for this SKU only. Do not turn the organic modifier, package weight, or serving into generic catalog aliases or conversions. |
| **WP02-B2-RED-LENTIL-FLOUR-20261012-S03** | Catelli, [Rotini aux lentilles rouges](https://www.catelli.ca/fr/pastas/rotini-aux-lentilles-rouges-de-catelli/). Current French product page lists `Farine de lentilles rouges` as the pasta's ingredient. | Confirms the exact French ingredient wording in a finished pasta. Its 85 g nutrition portion is pasta, not loose flour. |
| **WP02-B2-RED-LENTIL-FLOUR-20261012-S04** | Simpson Seeds, [Pulse Flour](https://simpsonseeds.com/our-products/pulse-ingredients/). Current Canadian mill product-family page lists `Precooked Red Lentil Flour` and `Raw Red Lentil Flour` separately and describes supplying pulse flours to manufacturers. | Establishes market use of the qualified product names, not a common raw/precooked preparation or a generic display alias. |
| **WP02-B2-RED-LENTIL-FLOUR-20261012-S05** | Simpson Seeds, [Raw Red Lentil Flour](https://simpsonseeds.com/products/red-lentil-flour-raw/). Product description says finely milled from Canadian red lentils; its properties list the format as `Precooked`. | The source's product-state fields conflict. Do not infer generic process, a form, measurement, or substitution from it. |

## Checks and remaining gap

- Read `AGENTS.md`, the global catalog plan, `roadmap.md`, the current references/forms/ledger/legacy files, and the recent WP02 B2/B3 proposals before selecting this candidate. The broader B2/B3 review remains open.
- Audited all active names and aliases, form labels and match terms, legacy names and aliases, candidate ID ownership, the existing green-flour ledger row, recipe demand, and the current app search behavior.
- Confirmed the proposal-local source-ID prefix does not collide with prior source IDs. The IDs are unique within this source register.
- Proposal file only: no JSON-only integration or code change was made, so no tests were run.
- **Next useful gap:** preserve the whole red-lentil result when a query is a complete phrase inside a more specific flour display. Once the search boundary has a source-backed, reviewable resolution, re-run the exact query set above before adding the identity-only row. The broader WP02 B2/B3 review remains open.

# WP02 B2 yellow lentil flour search-boundary review

- **Date:** 2026-10-12
- **Status:** Reviewed; root disposition is a documentation-only hold. No shared catalog or ledger data was added.
- **Scope:** One still-open WP02 B2 flour candidate: yellow lentil flour. This does not reopen the held whole-yellow-lentil label or the recent red-lentil-flour and green-pea-flour reviews.
- **Recommendation:** **Hold catalog integration pending a picker boundary for bare yellow-lentil searches.** Canadian sources support a distinct yellow-lentil-flour product and current Montréal retail wording supports the French phrase below. With the current search algorithm, adding the source-backed display names would make “lentilles jaunes,” the held French whole-food wording, and the bare singular query “yellow lentil” return flour alone. The English plural “yellow lentils” would still return no result because the matcher does not stem singular and plural. Whole yellow lentils remain unassigned because that broad food label does not yet have a stable product boundary. Do not make the flour row a substitute owner for the held French query.

## Candidate if the picker boundary is resolved

| Field | Proposed value |
|---|---|
| Candidate ID (not reserved) | ingredient-ref-yellow-lentil-flour |
| English display | yellow lentil flour |
| Québec French display | farine de lentilles jaunes |
| Category | FLOUR_AND_STARCH |
| Aliases | None |

The open WP02 B alternative-flour/starch umbrella includes lentil flour. The 2026-10-10 residual review accepted green lentil flour and excluded yellow lentil flour only as an alias of that green row; it did not adjudicate a separate yellow-flour identity. No dedicated yellow-lentil-flour proposal was found in the proposal queue. The current plan now records separate holds for red lentil flour and green pea flour. This review leaves those decisions unchanged.

## Naming and product boundaries

Simpson Seeds, a Saskatchewan pulse mill supplying manufacturers across Canada, currently lists “Raw Yellow Lentil Flour” and describes milling Canadian yellow lentils [S01]. Avena Foods’ Canadian pulse-flour line separately lists whole green lentil flour, decorticated yellow lentil flour, whole red lentil flour, and decorticated red lentil flour [S02]. Health Canada’s English non-novel list names yellow lentil flour made from yellow lentils [S03]. Its French counterpart uses the exact federal wording “Farine de lentilles jaune” [S04]. A current French-language listing from Montréal retailer Berchicci describes Vita Sana yellow-lentil pasta as made with one ingredient, “farine de lentilles jaunes biologique” [S05].

For a future identity, “yellow lentil flour / farine de lentilles jaunes” is the clearest scoped pair found. The Québec wording is product-label evidence, not an OQLF or TERMIUM ruling. Santé Canada’s singular “jaune” is retained as a source spelling, not promoted as the preferred Québec display. Health Canada’s list concerns novelty status only; it explicitly says listed ingredients did not undergo a Health Canada food-safety assessment [S03–S04].

Keep this flour distinct from whole yellow lentils, the generic lentils row, accepted green lentil flour, red lentils, yellow pea flour, and any split-pea flour. Do not alias it to generic lentil flour or farine de lentilles. Avena and Ingredion document yellow-flour products made from decorticated/dehulled or split material [S02, S06]; Simpson’s page calls its product “Raw” but lists its format as “Precooked” [S01]. These product-specific descriptions do not establish one shared processing state. Do not add raw, precooked, split, dehulled, or decorticated as aliases or forms, and do not attach an unqualified whole-yellow-lentil name to the flour.

## Current package and exact ownership

Read-only working-tree snapshot on 2026-10-12:

| Surface | Current state |
|---|---|
| Active ingredient references | 1,245 rows; SHA-256 8f4d5b55068cfc624e8d6e931f6829866b0b38fe1c837cf49ea16d106f6027fe |
| Ingredient forms | 94 rows; SHA-256 55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b |
| Research ledger | 1,552 records / 5,388 source entries / 4,426 distinct source IDs; SHA-256 fe176bd87e25dc1faa1206a658e7968593a4de6102ad8fb6222aefc9ae7a5f8b |
| Legacy import candidates | 66 rows; SHA-256 bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows; manifest-ordered fingerprint 3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3 |

The candidate ID is absent from active references, forms, legacy candidates, and ledger record IDs. The normalized exact display phrases “yellow lentil flour” and “farine de lentilles jaunes” have no exact owner in active names/aliases, forms, or legacy candidates. No lentil-flour form or match term exists. The existing ingredient-ref-green-lentil-flour row has no aliases, null density, and empty unit mappings; it is the only current result for the broader phrases “lentil flour” and “farine de lentilles.” The whole-food ingredient-ref-lentils row remains generic, while active green, French-green, red, and black Beluga rows retain their own names. None owns “yellow lentils” or “lentilles jaunes.”

The ledger has no yellow-lentil-flour record. Its ingredient-ref-lentils record retains the broad generic identity and a rejected decision to keep unqualified yellow lentils / lentilles jaunes out of active references because color does not settle the type or split/dehulled boundary. The accepted ingredient-ref-green-lentil-flour record remains identity-verified; measurement and substitution research are still marked not_yet_researched.

The exact search audit follows normalization and phrase-first behavior in app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt. It uses NFKD and accent folding, compares complete consecutive word phrases first, and uses substring fallback only when no complete phrase is found:

| Query | Current picker result | If this candidate were added with the names above |
|---|---|---|
| yellow lentil flour | No result | Proposed flour row |
| farine de lentilles jaunes | No result | Proposed flour row |
| yellow lentil | No result | Proposed flour row, because the complete phrase occurs inside its English display |
| lentilles jaunes | No result | Proposed flour row, because the complete phrase occurs inside its French display |
| yellow lentils | No result | Still no result; the matcher does not stem singular and plural |
| farine de lentilles jaune | No result | Proposed flour row through substring fallback from the plural display |
| lentil flour | Green lentil flour | Green and yellow lentil flour |
| farine de lentilles | Green lentil flour | Green and yellow lentil flour |

The collision with the held French whole-food phrase is the integration blocker; the English singular query also risks suggesting that the whole-food class has an owner. The prior whole-food review explicitly left yellow lentils / lentilles jaunes unassigned. Do not work around this by adding a generic lentil alias, an alias on the green-flour row, or an unsupported whole-yellow-lentil reference.

The proposed source-ID prefix is WP02-B2-YELLOW-LENTIL-FLOUR-20261012. Before drafting, the prefix and S01–S06 were absent from every existing proposal and ledger source ID, and the six IDs are distinct within this proposal.

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned using the app’s normalized word-phrase rules. Whole-file and ingredient-row scans found zero hits for yellow lentil flour, yellow lentils flour, farine de lentilles jaunes, farine de lentilles jaune, organic yellow lentil flour, farine de lentilles jaunes biologiques, decorticated yellow lentil flour, yellow lentil, yellow lentils, lentilles jaunes, lentille jaune, lentil flour, or farine de lentilles. No recipe line is linked to ingredient-ref-green-lentil-flour, ingredient-ref-lentils, or ingredient-ref-red-lentils. The bundled corpus therefore gives no demand for a new flour row, relink, measurement, form, or substitution.

## Numeric and substitution limits

- Simpson reports product-specific industrial limits including moisture at a maximum of 12%, protein at a minimum of 20%, a custom particle size, a 1 MT tote format, and nutrition per 100 g. Its own page’s “Raw” title conflicts with its “Precooked” format field [S01]. These specifications are not household measures or generic properties.
- Ingredion’s HOMECRAFT Pulse 2101 specification concerns a named product made from dehulled split yellow-lentil cotyledons. Its moisture maximum of 13%, minimum protein of 20% on a dry basis, and minimum starch of 40% on a dry basis apply to that product only [S06].
- Neither commercial specification supplies a transferable cup-to-mass value, density, or recipe portion. Keep defaultDensity null and unitMappings empty if a row is later accepted. Do not add numerical data from these specifications to the catalog.
- Supplier application claims such as thickening, pasta, or baking use do not establish an ingredient substitution or ratio. Add no forms, conversions, yields, recipe links, or global/contextual substitutions. Measurement and substitution research remain open.

## Source register

The source pages below were checked online on 2026-10-12. These proposal-local source IDs were checked against the current ledger and prior proposal files before writing.

| Source ID | Source and evidence | Limit |
|---|---|---|
| WP02-B2-YELLOW-LENTIL-FLOUR-20261012-S01 | Simpson Seeds, [Raw Yellow Lentil Flour](https://simpsonseeds.com/products/raw-yellow-lentil-flour/). Current Canadian mill product page: names the flour and says it is finely milled from Canadian yellow lentils; identifies the company as supplying food manufacturers across Canada. | Product page’s “Raw” name conflicts with the “Precooked” format field. Industrial packaging, nutrition, and specification data do not establish a household conversion or common process. |
| WP02-B2-YELLOW-LENTIL-FLOUR-20261012-S02 | Avena Foods, [Pulse Flour Ingredients](https://www.avenafoods.com/products/pulses-and-pulse-ingredients/flours/). Current product list distinguishes whole green, decorticated yellow, whole red, and decorticated red lentil flour; the page describes dry milling of whole, split, and decorticated pulses. | Supports distinct commercial product/process labels, not a global alias or one preparation state for every yellow lentil flour. |
| WP02-B2-YELLOW-LENTIL-FLOUR-20261012-S03 | Health Canada, [List of non-novel determinations for food and food ingredients](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html), 2014-11-15 entry. Names yellow lentils (Lens culinaris) flour and describes flour made from yellow lentils. | Naming and identity support only. The list says these foods did not undergo a Health Canada safety assessment and concerns novelty status. |
| WP02-B2-YELLOW-LENTIL-FLOUR-20261012-S04 | Santé Canada, [Liste des déterminations d’aliments et d’ingrédients alimentaires qui ne sont pas nouveaux](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html), 2014-11-15 entry. Names “Farine de lentilles jaune (Lens culinaris)” and describes flour made from yellow lentils. | Federal source wording is preserved as attested, not claimed as the Québec preferred term; novelty status is not a safety assessment. |
| WP02-B2-YELLOW-LENTIL-FLOUR-20261012-S05 | Berchicci, Montréal, [Sans gluten product listing](https://store.berchicci.ca/fr-ca/sans-gluten?limit=75&order=DESC&sort=pd.name). Current Vita Sana yellow-lentil-pasta listing says it has one ingredient, farine de lentilles jaunes biologique. The store identifies its location in Montréal, Québec. | Finished pasta label supports Québec retail wording, not an independent loose-flour SKU, generic organic attribute, or conversion. |
| WP02-B2-YELLOW-LENTIL-FLOUR-20261012-S06 | Ingredion, [HOMECRAFT Pulse 2101 Flour technical specification](https://www.ingredion.com/content/dam/ingredion/technical-documents/na/HOMECRAFT%20Pulse%202101%20Flour%20-%2037102F00%20Technical%20Specification.pdf). Defines this product as flour milled from dehulled split cotyledons of yellow lentils. | Process and numeric specifications apply to this named industrial product only. They do not establish the state or density of all yellow lentil flour. |

## Checks and remaining gap

- Read AGENTS.md, the global ingredient-catalog plan, roadmap.md, active references and forms, the ledger, legacy candidates, and current/recent WP02 B2/B3 proposals before selecting this candidate.
- Audited exact active/form/legacy/ledger ownership, source-ID uniqueness, the whole-yellow-lentil hold, current picker matching, and all bundled recipe files/ingredient rows.
- Proposal file only. Shared JSON, generated Kotlin, plan, roadmap, and checklist were not changed. No tests were run.
- **Next useful gap:** add or revise picker behavior so an exact flour query remains useful without turning the unresolved bare yellow-lentil phrase into a flour-only result. Re-run the query matrix above before allocating the candidate ID. Keep whole yellow lentils unassigned until a source-backed class and process boundary is established.

## Root disposition — 2026-10-12

Keep `yellow lentil flour / farine de lentilles jaunes` unallocated. The source-backed product name does not resolve the broader whole-food identity, and the current phrase-first search would return the flour alone for both `yellow lentil` and `lentilles jaunes`. Leave the proposed reference ID unreserved and do not add a flour alias to the green-lentil or generic-lentil rows. The hold is recorded in [the integration checkpoint](../batches/wp02-b2-yellow-lentil-flour-search-hold-integration-20261012/README.md), the global plan, and the roadmap. No catalog JSON, research-ledger record, recipe link, form, measurement, or substitution data was added; no tests or emulator checks were run.

The ownership snapshot above predates the same-day red-rice-flakes catalog integration, which added one unrelated reference and one ledger record. The red-rice-flakes row does not own any yellow-lentil phrase and does not change this hold.

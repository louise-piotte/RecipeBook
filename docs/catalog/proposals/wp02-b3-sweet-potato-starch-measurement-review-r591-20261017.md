# WP02 B3 R591 — sweet-potato-starch measurement evidence review

- **Reviewed:** 2026-10-17.
- **Status:** Integrated into the research ledger and catalog review log. Six source-specific observations were added; no active density, mapping, conversion, form, recipe link, yield, or substitution was added. See the [integration README](../batches/wp02-b3-sweet-potato-starch-measurement-integration-r591-20261017/README.md).
- **Scope:** Kitchen-measure and bulk-density evidence for the existing `ingredient-ref-sweet-potato-starch` identity. This is a bounded measurement review, separate from R585 pea-starch research, R588 cornstarch portions, sweet-potato-starch noodles, and whole-root sweet-potato flour.
- **Open plan anchors:** The B3 checklist item `[ ] Cassava flour, tapioca starch, sweet/sour tapioca starch or polvilho, potato flour, potato starch, arrowroot, kudzu/kuzu, and sweet-potato starch.` remains unchecked at [line 3042](../../RecipeBook-global-ingredient-catalog-plan.txt#L3042). The broader `[ ] Continue broader WP02 B2/B3 flour and starch review.` remains open at [line 15872](../../RecipeBook-global-ingredient-catalog-plan.txt#L15900); R585 is checked below it at line 15856. R588 is recorded as complete at line 20532.
- **Recommendation:** **Evidence-only add** six source-bounded measurement observations to the existing sweet-potato-starch ledger record: three laboratory untapped bulk densities from a 2026 primary food study and three US household portions from one recipe publisher’s stated measurement method. Set `measurementState` to `researched_no_supported_value` for a generally transferable kitchen measure or default density, because the observations remain tied to three laboratory isolates and one publisher’s unbranded starch sample. Keep `defaultDensity: null` and `unitMappings: []`. Do not add a form, active conversion, yield, recipe link, or substitution finding.

## Current identity and review boundary

The active catalog row is `ingredient-ref-sweet-potato-starch`, displayed as `sweet potato starch / fécule de patate douce`, with the existing French alias `amidon de patate douce`, category `FLOUR_AND_STARCH`, null default density, and no unit mappings. The ledger identity is verified; measurement and substitution research are `not_yet_researched`; there are no measurement observations or substitution findings. No ingredient form or active global/contextual substitution rule references this row.

The active neighboring identities remain separate: `ingredient-ref-sweet-potato` for the whole root, `ingredient-ref-sweet-potato-flour` for whole-root flour, and `ingredient-ref-sweet-potato-starch-noodles` for finished noodles. The 2026 study’s wet-extracted native starch is relevant to the existing extracted-starch identity, but its variety-specific powder measurements do not define a retail product form.

## Proposed evidence-only observations

If accepted, append the following rows to the existing sweet-potato-starch record. Preserve each source’s named sample and method. Do not average values, calculate a density from a cup portion, or copy any value to active unit mappings or the default density.

| Proposed observation ID | Source row and value | What the row represents | Boundary |
|---|---|---|---|
| `sweet-potato-starch-sabah-white-bulk-density-r591-20261017` | White-fleshed sweet-potato starch: `0.67 g/mL` (reported mean ± SD `0.00`, n=3). [S01] | Bulk density for a laboratory wet-extracted Sabah isolate made from white-fleshed roots. | Five grams were gently filled into a graduated cylinder without tapping; this is untapped powder bulk density, not a cup conversion or a retail product value. |
| `sweet-potato-starch-sabah-orange-bulk-density-r591-20261017` | Orange-fleshed sweet-potato starch: `0.71 g/mL` (reported mean ± SD `0.00`, n=3). [S01] | Bulk density for a separate laboratory isolate made from orange-fleshed roots. | Same untapped graduated-cylinder method; retain the variety and sample context. |
| `sweet-potato-starch-sabah-purple-bulk-density-r591-20261017` | Purple-fleshed sweet-potato starch: `0.73 g/mL` (reported mean ± SD `0.03`, n=3). [S01] | Bulk density for a separate laboratory isolate made from purple-fleshed roots. | Same untapped graduated-cylinder method; this is not a transferable kitchen density. |
| `sweet-potato-starch-whattocooktoday-us-cup-r591-20261017` | Sweet potato starch: `1 US cup = 130 g`. [S02] | The author’s household portion for the publisher’s unbranded sweet-potato-starch row. | The page says US cups and describes fluffing/stirring, spooning into a dry measure, lightly shaking, overflowing, and levelling without sifting. Preserve this publisher-specific method. |
| `sweet-potato-starch-whattocooktoday-us-tbsp-r591-20261017` | Sweet potato starch: `1 US tbsp = 8 g`. [S02] | The same publisher’s level direct-scoop tablespoon portion. | The page says tablespoons are filled directly and levelled; do not derive this from its cup row. |
| `sweet-potato-starch-whattocooktoday-us-tsp-r591-20261017` | Sweet potato starch: `1 US tsp = 3 g`. [S02] | The same publisher’s level direct-scoop teaspoon portion. | The page says teaspoons are filled directly and levelled; do not derive this from its cup or tablespoon row. |

The primary study reports significant differences among the varieties in bulk density. It extracted each variety separately by wet milling, dried starch at 55°C for 24 hours, ground and sieved the material to 500 µm, then measured 5 g gently filled into a graduated cylinder without tapping. The paper’s three values therefore describe distinct fine-powder study samples; they are not measurement-method equivalents of the recipe publisher’s kitchen portions. [S01]

The publisher says the conversion table comes from measuring flours and starches used in its Asian recipes with US measuring cups and a digital scale. The page was last updated June 29, 2020; it describes a no-sifting spoon-and-level method for dry cup measures and direct scoop-and-level for tablespoon and teaspoon measures. It supplies three sweet-potato-starch values only: one cup, one tablespoon, and one teaspoon. It does not name a brand, variety, or starch supplier. [S02]

For ledger representation, use `relationship: bulk_density` and `valueUnit: g/mL` for S01. For S02, use `relationship: portion_weight`, `evidenceKind: published_portion`, `valueUnit: g`, and `sourceQuantity` conventions `US customary` for each stated cup/spoon measure. Keep the original values and methods separate. The built-in `cup` and `tbsp` units use US customary volume factors, but that unit-level match does not make one publisher’s measurements an established default for every sweet-potato starch product.

## Source boundaries and non-findings

- **Product listings:** The current [Sungiven Foods listing](https://www.sungivenfoods.ca/product/ontrue-sweet-potato-starch/) shows Ontrue 454 g; a [Superwafer / Chaoji listing](https://www.chaoji.ca/en/product/5435/sweet-potato-starch), crawled about eight months before review, showed a generic sweet-potato-starch item at 400 g. These are package net masses only, not servings, cup weights, scoop measures, or densities. Sungiven’s page has a likely typo in its “100%swt potato starch” bullet, so only its product title and listed pack size are relied on. Chaoji marks the product image as illustrative; neither page gives a kitchen measure. These pages do not warrant measurement observations.
- **Related starch:** King Arthur’s current ingredient chart gives `potato starch` as 1 cup = 152 g, but has no sweet-potato-starch row. Reuse its existing source ID `WP07-KAB-IWC` for this boundary only; do not transfer ordinary potato-starch data to extracted sweet-potato starch. [King Arthur Baking](https://www.kingarthurbaking.com/learn/ingredient-weight-chart)
- **Unverified converter:** A generic converter page lists 125 g per cup for sweet-potato starch but does not identify a product sample, a measurement method, or a cup convention for that row. It is not a primary measurement source, so do not register it, average it with S02, or use it to adjust any proposed observation. [GtoCups](https://gtocups.com/cups-to-grams/)
- **No active value:** The study’s cylinder densities and the publisher’s household measures remain ledger-only observations. Do not calculate one from another or set `defaultDensity`, `unitMappings`, a mass-volume conversion, or a yield. The packaging quantities are not measurements of a kitchen volume.
- **Substitution:** Neither source tests sweet-potato starch as a replacement for another ingredient. The study measures starch properties and gelation; the publisher’s table reports portions only. Keep `substitutionResearchState: not_yet_researched` and record no supported or rejected replacement, ingredient form conversion, or active substitution rule.

## FR-CA wording, picker ownership, and forms

Keep all current names unchanged. OQLF’s GDT gives the Québec French display `fécule de patate douce`, the English equivalent `sweet potato starch`, and defines it as industrial starch obtained by wet extraction from *Ipomoea batatas* tuberous roots. Reuse the existing OQLF source ID `WP02-RSG-20261010-S04`; it already owns the exact same URL on this ledger record. Preserve the existing Canadian-label alias `amidon de patate douce`; add no alias, form, or candidate ID.

The picker uses complete word-phrase matches and then substring matching. With no term edits, results stay as they are: `sweet potato starch` and `fécule de patate douce` can return both the extracted-starch row and the longer sweet-potato-starch-noodle name; `amidon de patate douce` resolves to the extracted-starch row; `sweet potato flour` and `farine de patate douce` remain with the separate whole-root flour. This review creates no new picker path.

No `IngredientForm` is attached to the extracted-starch row. Do not add dry/raw/precooked forms based on these sources: the studied samples and household measures do not establish a distinct same-ingredient recipe state. Keep sweet-potato-starch noodles and whole-root flour separate.

## Bundled recipe demand

A manifest-ordered scan covered all **114** bundled recipe files and **1,123** ingredient rows. It found **zero** lines linked to the sweet-potato starch, flour, or noodle references; zero ingredient-line hits or full-recipe-text hits for the specific starch, flour, and noodle names; and no starch-measure demand. The corpus does contain two whole-root sweet-potato lines: 2 small sweet potatoes in “African Peanut Stew” and 1 sweet potato in “Habitant Pea Soup,” both linked to `ingredient-ref-sweet-potato`. Those root quantities do not support an extracted-starch portion, density, form, or recipe link.

## Source ownership audit and register

No existing R591 proposal or batch, source ID prefix, observation ID, or exact source URL was found in the research ledger or proposal/batch archive. The candidate and exact French display/alias remain owned by the existing active reference and ledger record; no new candidate identity is proposed.

| ID / reuse | Source and support | Source boundary |
|---|---|---|
| **WP02-B3-SWEETPOTATO-STARCH-MEASURE-R591-20261017-S01** (new) | Lim Hooi Yin et al., [“Physicochemical and functional characterisation of starches from sweet potato varieties grown in Sabah, Malaysia”](https://doi.org/10.37349/eff.2026.1010159), *Exploration of Foods and Foodomics* 4 (2026), 1010159; published June 8, 2026. Primary article, accessed 2026-10-17. | Reports the three variety-specific bulk densities and the 5 g untapped-cylinder method. It is a controlled study of lab isolates, not a brand package or household serving convention. Proposed as `direct_measurement` evidence. |
| **WP02-B3-SWEETPOTATO-STARCH-MEASURE-R591-20261017-S02** (new) | Marvellina, [Grams to Cups Conversion (No Sifting)](https://whattocooktoday.com/grams-to-cups-conversion-no-sifting.html), updated June 29, 2020; accessed 2026-10-17. | Publisher reports its own scale measurements and the three method-specific US portions. Unbranded starch; one household measurement source. Proposed as `test_kitchen` evidence. |
| Reuse **WP02-RSG-20261010-S04** | OQLF, [fécule de patate douce (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287217/fecule-de-patate-douce). | Existing exact source URL and ID support the FR-CA display and extracted-starch identity only; no measurement. Do not append a duplicate source record. |
| Reuse **WP07-KAB-IWC** | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart). | Existing exact URL and ID support only the distinction between ordinary potato starch and the unlisted sweet-potato-starch row. No measurement is assigned to the candidate. |
| Not assigned an ID | Sungiven Foods and Superwafer / Chaoji product pages linked above. | Current Canadian retail package listings only; no ingredient-measure evidence is proposed for the ledger. |
| Excluded; no ID proposed | GtoCups conversion page linked above. | Generic web converter with no documented row method or product sample; not used as primary measurement evidence. |

## Review checks

- [x] Read `AGENTS.md`, `roadmap.md`, the open B3 checklist, and the broader WP02 B2/B3 plan parent, including completed R585 and R588 entries.
- [x] Confirmed the active reference, FR-CA display and alias, category, current ledger states, empty measurement/substitution findings, no attached forms, and no active substitution rule.
- [x] Checked exact phrase ownership and the existing picker behavior against the current ingredient-search implementation; no catalog wording changes are proposed.
- [x] Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; found no linked demand or phrase matches.
- [x] Audited source URLs and IDs: new IDs S01–S02 and the R591 observation IDs are unallocated; the OQLF and King Arthur URLs retain and reuse their existing source IDs.
- [x] Reviewed the current primary paper, the publisher’s measurement-method page, Québec terminology, and Canadian product listings. Package net masses and potato-starch values are excluded from candidate measurement observations.
- [x] Confirmed the proposal filename is unique and the proposal is the only file this review creates.

The accepted evidence and decision are now in `docs/catalog/research-ledger.v1.json`. No application code changed. Database-JSON-only additions required no app tests, build, emulator run, or deployment under `AGENTS.md`.

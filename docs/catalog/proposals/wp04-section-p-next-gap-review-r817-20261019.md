# WP04 Section P R817 — Eastern oyster CNF portion evidence

- **Review date:** 2026-10-19.
- **Candidate:** Historical Health Canada CNF portion weights for the existing `ingredient-ref-eastern-oyster` (*Crassostrea virginica*).
- **Recommendation:** Record seven edition- and food-code-specific CNF 2015 portion observations on the existing ledger record: six medium raw oysters at 84.0 g for each of wild and farmed entries, plus the listed volume portions for each entry. Set only this record's `measurementState` to `researched_supported` for these historical observations. Keep the CNF 2026 row review open.
- **Write scope:** This proposal only. No shared catalog, ledger, plan, roadmap, recipe, or generated file was changed.

## Open checklist and distinction from recent work

The open WP04 Section P parent remains **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below”** in the [live plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8157). This review fills a measurement-evidence gap under the already integrated Eastern oyster identity. It does not add another oyster identity or resolve generic fresh oyster.

Recent work is separate: R808 integrated an edible-crab identity; R811 held Iceland cockle / `coque d’Islande` outside the active picker; and R814 recorded two Clover Leaf canned-crab label portions. The R130, R131, R137, and R139 oyster decisions cover Pacific, Eastern, Kumamoto, and European flat oyster identities; none records an Eastern-oyster measurement. The earlier generic fresh-oyster hold remains in force. R817 only records food-code-specific CNF 2015 evidence for the existing Eastern row.

## Live catalog, ledger, and form audit

The current bundled package has **1,886 active ingredient references** and **199 forms**. The ledger has **2,294 records** and **10,765 source entries** after the R812–R814 integration.

| Item | Current state | R817 scope |
|---|---|---|
| `ingredient-ref-eastern-oyster` | `Eastern oyster / huître de l’Est`; aliases are `Eastern oysters`, `American oyster(s)`, `Atlantic oyster(s)`, `huîtres de l’Est`, and `huître(s) de l’Atlantique`; category `PROTEIN`. | Preserve all names and aliases. The CNF's older French food-name wording is source text, not a Québec display or alias proposal. |
| Eastern-oyster forms | No active form is attached to this reference. | Add no `raw`, wild, or farmed form. Keep the existing reference identity as the observation owner and name source state in each observation. |
| Eastern-oyster numeric catalog fields | `defaultDensity: null`; `unitMappings: []`. | Leave both unchanged. Do not promote any CNF source portions into an active conversion, density, or runtime measure. |
| Eastern-oyster ledger record | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: researched_no_supported_substitute`; eight existing R131 identity sources; zero measurement observations and zero substitution findings. | Add only the proposed historical observations, their source entries, and an accepted measurement decision. Preserve identity and substitution states. |
| Generic fresh oyster | Existing `ingredient-ref-fresh-oyster` remains a `candidate` with `identityState: needs_clarification`. | Keep the generic hold unchanged; do not attach the food codes to unqualified `oyster / huître`. |

The current active substitution-rule files contain no rules. The Eastern-oyster ledger already records `researched_no_supported_substitute`; no reviewed source or bundled recipe supports substituting Eastern oyster for Pacific, Kumamoto, European flat, dried oyster, oyster sauce, or a mushroom product. Keep the substitution state and all recipe-line links unchanged.

## CNF 2015 evidence and interpretation

Health Canada's 2015 serving pages publish a count portion for two raw Eastern-oyster records:

| CNF 2015 food code | Source food name | Published count portion | Refuse shown separately | R817 treatment |
|---|---|---:|---:|---|
| **3118** | `Mollusks, oyster, eastern (blue point), wild, raw`; French source name `Mollusques, huître, atlantique, sauvage, crue`. | **6 medium = 84.0 g** | Total refuse 46%. | Record as a wild/raw, source-specific `count_weight` observation. |
| **3191** | `Mollusks, oyster, eastern (blue point), farmed, raw`; French source name `Mollusques, huître, américaine (de l'est), élevage, crue`. | **6 medium = 84.0 g** | Total refuse 20%. | Record as a farmed/raw, source-specific `count_weight` observation. |

The CNF 2015 user guide says that conversion-factor weights are weights of edible material **without refuse**. The 84.0 g values therefore describe edible portions for the listed counts, not shell-on or as-purchased mass. The page's refuse percentages are separate inedible-portion fields; do not use them to calculate shell-on weight or an edible-yield ratio. CNF does not define the physical size range for “medium” oysters or describe a weighing protocol. Do not average the two equal count values, generalize them to every Eastern-oyster product, or infer a count-to-gross-shell mass.

The two food-code descriptions identify the source records by the common phrase “eastern (blue point)” and production status, not by binomial. The mapping to the already verified Eastern-oyster identity is a common-name crosswalk from the source wording, supported by the existing R131 species evidence; it is not a new taxonomic claim from CNF. The older CNF French strings remain evidence labels only. Preserve the existing DFO/OQLF-backed Québec display `huître de l’Est` and its existing source-qualified aliases; do not add `huître atlantique`, `huître américaine`, `blue point`, or CNF terminology as catalog aliases.

Both CNF pages also show volume portions. R817's proposed delta below retains those exact page portions as source-specific observations, but it does **not** derive or add `defaultDensity`, a unit mapping, or any active app conversion. The listed 100/125/250 mL values differ between the wild and farmed rows, so neither set is an identity-wide density and the two production categories must remain separate.

## Current CNF 2026 edition and access limit

Health Canada's current [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the CNF 2026 relational CSV release is available and that the CNF 2015 online search remains as an interim way to access the older edition while a more user-friendly 2026 viewer is developed. The [Open Government 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=2) lists the Food Name, Measure Weight Conversion, Measure Name, and Measure Type resources; its search-indexed record reports a data update of 2026-10-04.

The current 2026 [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv), along with their portal resource pages, could not be opened through the available web reader; direct opens returned inaccessible/403 responses. No 2026 row-level finding is claimed: this review does not claim that codes 3118/3191 continue, disappear, or carry forward the same measures in the new edition. The 2015 observations below remain explicitly edition-specific, with a 2026 row recheck open.

To close that follow-up later, retrieve the current 2026 files and join exact raw Eastern-oyster Food Name rows to Measure Weight Conversion, Measure Name, and Measure Type. Confirm the measure labels, weights, and food-code scope in the 2026 documentation before adding or replacing any 2026 observations. Keep the 2015 evidence separately traceable if the current file differs.

## Exact proposed ledger delta

Append three sources to `ingredient-ref-eastern-oyster`: `WP04-SECTIONP-EASTERN-OYSTER-CNF-PORTIONS-R817-20261019-S01` and `S02` are the unowned exact 2015 serving-page URLs; `S03` is a record-specific citation to the 2015 users' guide for the edible-portion interpretation. Add the seven observations below. Set `measurementState` to `researched_supported` because historical, source-specific measures are documented; do not set any identity-wide or active numeric behavior.

| Observation ID | Relationship | Source quantity | Reported mass | Food-code scope |
|---|---|---:|---:|---|
| `eastern-oyster-wild-raw-cnf2015-100ml-r817-20261019` | `portion_weight` | 100 mL | 104.8 g | 3118, wild raw |
| `eastern-oyster-wild-raw-cnf2015-125ml-r817-20261019` | `portion_weight` | 125 mL | 131.0 g | 3118, wild raw |
| `eastern-oyster-wild-raw-cnf2015-250ml-r817-20261019` | `portion_weight` | 250 mL | 262.0 g | 3118, wild raw |
| `eastern-oyster-wild-raw-cnf2015-six-medium-r817-20261019` | `count_weight` | 6 medium oysters | 84.0 g | 3118, wild raw |
| `eastern-oyster-farmed-raw-cnf2015-100ml-r817-20261019` | `portion_weight` | 100 mL | 98.9 g | 3191, farmed raw |
| `eastern-oyster-farmed-raw-cnf2015-250ml-r817-20261019` | `portion_weight` | 250 mL | 247.3 g | 3191, farmed raw |
| `eastern-oyster-farmed-raw-cnf2015-six-medium-r817-20261019` | `count_weight` | 6 medium oysters | 84.0 g | 3191, farmed raw |

For each observation, use `evidenceKind: published_portion`, `valueUnit: g`, the listed mass in both `value` and `observedMassG`, and the source volume in `observedVolumeMl` for the five volume observations. Leave `ingredientFormId` unset. Set `foodDescription` to the complete CNF 2015 English food name plus food code, `foodState` to raw and wild/farmed as appropriate, `measurementMethod` to the exact CNF page's published serving portion with no stated weighing protocol, and `quantityBasis` to the source-specific edible portion without refuse. For count rows, use `sourceQuantity` amount 6, unit `medium oysters`, and state that the source gives no size definition. Attach S01 or S02 and S03 to the matching observation. The seven observations remain separate from each other; none supplies a generic density, app cup equivalence, shell-on yield, or reusable conversion.

Do not record `100 grams of edible portion = 100 grams` as a kitchen portion. Do not turn `1 food guide serving = 90 g` into a recipe serving observation; it is a standardized food-guide serving. Do not encode the refuse percentages as count weights or yields. Add one `accepted` measurement decision that says these are CNF 2015 code-scoped published portions only and leaves CNF 2026 inspection open. Make no reference, form, recipe, package-yield, substitution, or rule change.

## Picker projection and subphrase audit

`IngredientSearch.kt` searches complete normalized phrases inside longer indexed reference/form terms before falling back to substring matching. R817 changes ledger evidence only, so the current result sets below are also the projected results after this proposal; the table includes broad and subphrase queries.

| Query | Current / projected results | Effect |
|---|---|---|
| `oyster` | 9: dried oyster, Eastern oyster, European flat oyster, king oyster mushroom, Kumamoto oyster, oyster mushroom, oyster sauce, Pacific oyster, vegan oyster sauce. | Broad query stays multi-result. |
| `oysters` | 4: dried, Eastern, Kumamoto, and Pacific oyster. | Plural search stays multi-result. |
| `huître` | 7: dried, Eastern, European flat, Kumamoto, Pacific, oyster mushroom, and oyster sauce. | Broad French query stays multi-result. |
| `huîtres` | 6: dried, Eastern, Kumamoto, Pacific, oyster sauce, and vegan oyster sauce. | French plural stays multi-result. |
| `oyster sauce` | 2: oyster sauce and vegan oyster sauce. | Phrase inside a longer term keeps the plant alternative visible. |
| `Atlantic` | 15 results, including Eastern oyster among fish and other seafood. | Broad subphrase is not treated as an Eastern-oyster-only query. |
| `Eastern oyster`, `American oyster`, `Atlantic oyster`, `huître de l’Est`, or `huître de l’Atlantique` | Eastern oyster / huître de l’Est only. | Existing qualified names continue to identify the species. |
| `fresh oyster` | No result. | Generic fresh-oyster hold stays unresolved. |

Do not add `oyster`, `oysters`, `huître`, `huîtres`, `Atlantic`, or `blue point` as aliases. The bilingual species terms remain those already owned by `ingredient-ref-eastern-oyster`.

## Manifest recipe demand and substitutions

The complete bundled manifest lists **114 recipe files** and **1,123 ingredient rows**. All files, full recipe text, ingredient rows, and reference links were scanned for oyster/huître terms, Eastern/American/Atlantic oyster wording, `Malpeque`/`Malpèque`, and *Crassostrea virginica*. Result: **zero matching recipe files, zero matching ingredient rows, and zero links to `ingredient-ref-eastern-oyster`**. No bundled recipe demands a count, mass, volume, form, or species-specific oyster substitution. Do not add recipe links or transfer a quantity from another shellfish.

Substitution review remains separate from the measurement observations. The wild and farmed CNF rows are food-composition categories, not evidence that one can replace the other in a recipe; no source provides a recipe method, role, tested swap, or adjustment. Preserve `researched_no_supported_substitute`, add no finding or global/contextual rule, and do not infer equivalence with other oyster species or dried/processed oyster products.

## Source register and ownership limits

Sources accessed or checked 2026-10-19. Proposed S01–S03 are unique source IDs for the existing Eastern-oyster ledger record; the current 2026 resource links below are contextual freshness evidence and do not support an oyster row value.

| ID / URL | Evidence and limit | Current exact URL ownership |
|---|---|---|
| **WP04-SECTIONP-EASTERN-OYSTER-CNF-PORTIONS-R817-20261019-S01** — Health Canada, [CNF 2015 Food Code 3118, wild raw Eastern (blue point) oyster](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3118). | Page lists 100 mL = 104.8 g, 125 mL = 131.0 g, 250 mL = 262.0 g, 6 medium = 84.0 g, and 46% total refuse. It is an older source entry; its page detail date is 2019-03-01. | No exact serving-page URL owner in the ledger or focused Section P archive. |
| **WP04-SECTIONP-EASTERN-OYSTER-CNF-PORTIONS-R817-20261019-S02** — Health Canada, [CNF 2015 Food Code 3191, farmed raw Eastern (blue point) oyster](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3191). | Page lists 100 mL = 98.9 g, 250 mL = 247.3 g, 6 medium = 84.0 g, and 20% total refuse. It is an older source entry; its page detail date is 2019-03-01. | No exact serving-page URL owner in the ledger or focused Section P archive. |
| **WP04-SECTIONP-EASTERN-OYSTER-CNF-PORTIONS-R817-20261019-S03** — Health Canada, [Canadian Nutrient File Users' Guide (2015)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), “Conversion factor file” and “Refuse amount file.” | Says conversion-factor weights are for edible portions without refuse and defines refuse as inedible material. It supports interpreting 84 g as edible mass, but it is the 2015 guide and does not verify the new 2026 dataset. | URL is already cited on pearl-barley and egg ledger records, including R310-S02; use a new unique R817 source ID if the guide is attached to this record. |
| Context — Health Canada, [CNF 2026 overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Confirms the 2026 relational CSV release and describes the 2015 online search as interim access. It has no Eastern-oyster row values. | Exact URL is already used by other CNF source records; no new ledger source is required for this review. |
| Context — Open Government Portal, [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=2), including [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Official current file listing, last updated 2026-10-04 in the indexed dataset record. Direct resource/CSV opens failed in the available web reader; this review makes no row-content claim. | Measure Weight Conversion URL is already cited for unrelated CNF 2026 ingredient rows, including serrano pepper and grains, with row-specific locators. No Eastern-oyster row owner was found. |

The proposed R817 source prefix and seven observation IDs were checked for collisions in the ledger and Section P proposal/batch archive; no collision was found. No new 2026 source ID or oyster 2026 measurement is proposed because no row contents were verified.

## Static review and testing disposition

- Read `AGENTS.md`, `Requirements.md`, `roadmap.md`, the open Section P checklist, the ingredient catalog workflow, the prior oyster decisions, R808, R811, R814, current references/forms/ledger, manifest, recipe corpus, and `IngredientSearch.kt`.
- Parsed current reference, form, ledger, manifest, and recipe JSON read-only. Confirmed the Eastern-oyster reference, ledger state, absence of attached forms or active numeric values, and source ownership counts above.
- Reproduced the production phrase-first picker projection from the current catalog, including broad `oyster`, plural/French queries, and subphrases `oyster sauce` and `Atlantic`.
- Scanned all 114 manifest-listed recipe files, 1,123 ingredient rows, full recipe text, and exact Eastern-oyster reference links; found no recipe demand.
- No catalog or ledger integration, app test, build, emulator run, or deployment was performed. If accepted implementation remains limited to additions in database JSON files, the current `AGENTS.md` explicitly says no testing is needed; static package/ledger validation is sufficient for that data-only change.

## Recommendation

Add seven CNF 2015 source-specific published portion observations to `ingredient-ref-eastern-oyster`, with no active form, density, unit mapping, recipe link, yield, or substitution. Keep the R131 bilingual labels and the generic fresh-oyster hold unchanged. Keep direct inspection of the current CNF 2026 Food Name and measure rows as a separate open follow-up; the 2015 observations do not claim that the current edition carries the same codes or values.

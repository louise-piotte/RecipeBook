# WP02 B2 — yellow pea flour measurement and substitution review (R306)

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, generated file, recipe, batch README, or test file was changed.
- **Open checklist item:** Section 04, B2, [global catalog plan line 2307](../../RecipeBook-global-ingredient-catalog-plan.txt#L2307), which keeps the alternative-flour review open.
- **Record under review:** `ingredient-ref-yellow-pea-flour`, the verified `yellow pea flour / farine de pois jaune` identity.
- **Source-ID prefix:** `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S`. The prefix was checked against the current ledger and proposal/batch archive; no prior owner was found.
- **Scope:** Measurement and substitution evidence for yellow pea flour only. R302's green-lentil-flour review is separate; its findings are not transferred here.

## Recommendation

Record one product-specific manufacturer portion observation for Cuisine Soleil's yellow pea flour: the maker's flour-blend page gives **¼ cup (30 g)** as the serving quantity for its yellow pea flour. Set `measurementState` to `researched_supported`, but keep `defaultDensity` null and `unitMappings` empty. This is a published serving for one named product, not a measured bulk density or a general cup-to-mass rule. The other recipe source reviewed gives yellow pea flour by volume without a flour mass, so it cannot extend that observation to other products.

Set `substitutionResearchState` to `researched_no_supported_substitute` for a reusable rule on the current unqualified identity. Cuisine Soleil suggests yellow pea flour as one component of a three-flour custom mix; a pulse-industry guide's 1:1 gluten-free recommendation is for a three-part flour-and-starch blend; and the published baking formulas use precooked flour in specified products. The primary wheat-bread study tests raw and roasted yellow split-pea flour at defined flour-basis levels and reports level-dependent results. These are formula-specific directions, not a validated replacement percentage for plain yellow pea flour across recipe types.

During a later integration, add the one `portion_weight` observation to the existing ledger record and add the source-specific substitution finding with no `replacements` and no `ruleId`. Make no changes to the active identity, aliases, forms, recipe links, conversion data, substitution rules, or recipes. Keep the B2 checklist open.

## Ownership, corpus, and picker boundaries

The active reference row has the exact display names `yellow pea flour / farine de pois jaune`, empty English and French alias arrays, no attached forms, `defaultDensity: null`, and `unitMappings: []`. The existing ledger record is `identityState: verified` with both `measurementState` and `substitutionResearchState` set to `not_yet_researched`. Its identity sources are already owned by that record. The target ID is not present in the legacy-import identity list. The earlier identity-only decision is documented in the [residual flour proposal](wp02-b2-b3-flour-starch-residual-review-20261010.md); this review does not reopen it.

The manifest-ordered package contains 114 recipes and 1,123 ingredient rows. A scan found no yellow-pea-flour, pea-flour, or French flour phrase in an ingredient row. Recipe 105 contains one nearby but distinct ingredient: 2 cups of dried yellow peas linked to `ingredient-ref-yellow-peas` and its whole-dried form. It supplies no flour demand, link, measure, or substitution.

The current picker uses exact word-phrase matches before substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The following projection was checked without changing the catalog:

| Query | Current result |
|---|---|
| `yellow pea flour` | Yellow pea flour only |
| `farine de pois jaune` | Yellow pea flour only |
| `yellow pea` | Yellow pea flour only; its display contains this phrase |
| `yellow peas` | Dried yellow peas only |
| `pea flour` | Yellow pea flour only; the embedded words occur in its display name |
| `pois jaune` | Yellow pea flour and yellow split peas |
| `farine de pois` | Five current flour identities, including yellow pea flour |

Keep aliases empty. In particular, do not add generic `pea flour` or `farine de pois` aliases. This proposal does not alter the existing short-query boundary or create a picker change.

## Proposed ledger disposition

| Field | Proposed value | Scope |
|---|---|---|
| `identityState` | `verified` | Retain unchanged. |
| `measurementState` | `researched_supported` | One Cuisine Soleil product-specific serving observation is supported; this does not authorize reusable mappings. |
| `measurementObservations` | One `portion_weight` observation | Cuisine Soleil: source quantity ¼ cup; published mass 30 g; evidence kind `manufacturer_label`; food description scoped to its organic yellow pea flour. |
| `substitutionResearchState` | `researched_no_supported_substitute` | No reusable direct substitute rule is supported for this identity. |
| `substitutionFindings` | One finding with no replacements or rule ID | Preserve the maker blend guidance, industry formulations, and primary bread trials as contextual evidence, with their product and formula limits. |
| Active reference, forms, rules, and recipes | No change | Keep density null, mappings empty, no added form or recipe link, and no active substitution/conversion rule. |

Proposed measurement observation:

- `observationId`: `yellow-pea-flour-cuisine-soleil-quarter-cup-serving-r306-20261016`.
- `relationship`: `portion_weight`; `sourceQuantity`: 0.25 cup (the maker's displayed ¼-cup serving); `value`: 30 g.
- `foodDescription`: Cuisine Soleil organic yellow pea flour; `evidenceKind`: `manufacturer_label`; `sourceIds`: `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S01`.

Proposed substitution finding:

- `findingId`: `yellow-pea-flour-no-general-substitution-r306-20261016`.
- `researchState`: `researched_no_supported_substitute`; `replacements`: `[]`; omit `ruleId`.
- Link the finding to sources S01, S03, S04, and S05. State that the maker's advice describes a multi-flour blend, the guides concern a three-part gluten-free blend or fixed precooked-flour formulas, and the study is limited to specified yellow split-pea-flour wheat breads. None establishes a general standalone-flour replacement.

Do not derive a cup density from the ¼-cup serving. The manufacturer does not provide a filling/leveling method or a bulk-density measurement. The source observation should preserve the serving as published rather than normalize it to 1 cup. Do not store the flour-only volumes from the cookbook as mass observations: those recipes do not report the yellow-pea-flour ingredient mass, and a finished serving's mass is not the flour's mass.

## Evidence interpretation and limits

| Evidence | What it supports | What it does not support |
|---|---|---|
| Cuisine Soleil's current manufacturer guidance | A ¼-cup (30 g) serving for its yellow pea flour; a custom flour mix that uses yellow pea flour at 15–50% alongside an oat, millet, or brown-rice base and hemp or flax flour. | A generic mass-per-cup or density, a universal wheat-flour replacement, or a finished recipe outcome for every mix. The page describes a blend component, not a pure-flour 1:1 swap. |
| Pulse Canada's *Cooking with Pulses* cookbook | Its Blueberry Lemon Quick Bread uses ¾ cup (185 mL) yellow pea flour for a 12-serving loaf; other printed formulas also specify yellow pea flour by volume. | A flour mass for those volumes. The stated finished serving weights cannot be assigned to the yellow pea flour portion. |
| USA Dry Pea & Lentil Council baking guide | Baker's-percentage formulations use precooked yellow pea flour in multiple products; for example, 5% in a whole-wheat hearth bread and 30% in a pan bread, each with other specified ingredients and process steps. | A direct substitution rate for ordinary yellow pea flour in an arbitrary bread, let alone cakes, cookies, sauces, or other roles. The guide names a precooked ingredient and fixed formulations. |
| USA Dry Pea & Lentil Council / American Pulse Association gluten-free guide | A gluten-free replacement blend composed of one part pulse flour (yellow pea flour is an option), one part tapioca starch, and one part white rice flour, presented as a 1:1 replacement for traditional gluten flour. | A 1:1 substitution by yellow pea flour alone, or an individual-ingredient rule independent of the other two blend components. |
| Kotsiou et al. primary study | Raw and roasted yellow split-pea flours were tested at 10–20% flour-basis replacement in wheat bread; the tested levels and processing states produced different dough and bread effects. | A general kitchen ratio. The trials are for wheat bread and specified raw/roasted split-pea flour, not every retail yellow pea flour or recipe role. |

Together, the evidence supports one product-specific published portion and several deliberately bounded formulas. It does not justify runtime behavior. Keep global conversions, unit mappings, form conversions, and contextual substitutions empty for this row.

## Source register

Sources were checked online on 2026-10-16. New R306 source IDs use the reserved prefix above. The Cuisine Soleil product page remains identified by its existing target-row source ID `WP02-B23-FLOUR-RESIDUAL-20261010-S05-FR`; it supports the current French product name and product identity, while R306's serving observation comes from the separate maker guidance page below.

| Source ID | Source and direct support | Limits |
|---|---|---|
| `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S01` | Cuisine Soleil / Moulin A. Coutu, [Créez votre farine](https://cuisinesoleil.com/creez-votre-farine/), page dated 2023-02-07. Identifies yellow pea flour in the maker's mix-building guide and states its protein portion as ¼ cup (30 g). The same page describes its suggested custom-mix steps, including a 15–50% yellow-pea-flour component. | Manufacturer guidance for its flour and suggested custom mixes. It does not state a scoop/fill method, bulk density, or direct wheat-flour replacement outcome. The blend ranges are not a universal formula for every use. |
| `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S02` | Pulse Canada, [*Cooking with Pulses: Beans, Peas, Lentils & Chickpeas*](https://ontariobeans.on.ca/wp-content/uploads/2020/06/PC_cooking_with_pulses_web-ready_spreads.pdf), p. 36, “Blueberry Lemon Quick Bread.” The document identifies Pulse Canada as its publisher and gives ¾ cup (185 mL) yellow pea flour for 12 servings. | Recipe ingredient volume only. No gram weight is given for that flour; serving mass is the finished bread portion. The Ontario Bean Growers site hosts the PDF. |
| `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S03` | USA Dry Pea & Lentil Council, [*Baking Guide for Pulse Ingredients*](https://usapulses.org/wp-content/uploads/2025/10/USA-Pulse-Flour-Brochure.pdf), formula tables for “Pea Whole Wheat Hearth Bread” and “Pea Pan Bread.” The tables state Baker's percentages for precooked yellow pea flour, including 5% and 30%, respectively. | Fixed bakery formulations using precooked flour, defined bases, added ingredients, and process conditions; not a transferable home-baking substitution rule. |
| `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S04` | USA Dry Pea & Lentil Council / American Pulse Association, [*Baking with Pulse Flours for Flavor and Functionality*](https://usapulses.org/wp-content/uploads/2025/10/Baking-with-Pulse-Flours.pdf), p. 4. Recommends a one-to-one blend of one part chickpea, lentil, or yellow pea flour, one part tapioca starch, and one part white rice flour to replace traditional gluten flours in gluten-free baking. | The replacement is the combined three-part blend. It does not recommend replacing flour with yellow pea flour alone. |
| `WP02-B2-YELLOW-PEA-FLOUR-MEASURE-SUBSTITUTION-R306-20261016-S05` | Kotsiou et al., [“Impact of Roasted Yellow Split Pea Flour on Dough Rheology and Quality of Fortified Wheat Breads”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8391420/), *Foods* 10(8), 1832 (2021), [DOI 10.3390/foods10081832](https://doi.org/10.3390/foods10081832). The primary study tests raw and roasted yellow split-pea flour in wheat bread at 10%, 15%, and 20% flour-basis levels; it reports level- and process-dependent changes in dough and bread quality. | Experimental wheat-bread formulations and specified flour processing. It does not establish a general replacement ratio or apply to all product forms and recipe roles. |

## Static review record

- Re-read `AGENTS.md`, the open WP02 Section 04 B2 plan item, roadmap progress, the existing identity proposal, current references/forms/ledger, ledger schema, legacy identities, current picker code, and the manifest-listed recipes.
- Confirmed the target reference/ledger ownership and absence of matching legacy candidates or attached forms. Checked the R306 prefix against the current ledger and proposal/batch archive before assigning S01–S05.
- Scanned 114 manifest-listed recipes and 1,123 ingredient rows: no flour phrase or link; the only yellow-pea ingredient line is the dried-whole-pea line in recipe 105.
- Reconstructed the listed picker results from the current phrase-first implementation. No search names or aliases are proposed for change.
- Confirmed the manufacturer serving, cookbook, industry guides, and primary-study source online. Checked local links and proposal encoding, newline, and whitespace after writing.
- No software tests, build, emulator, or deployment were run. This proposal does not edit catalog JSON or application code. No file outside this proposal was changed.

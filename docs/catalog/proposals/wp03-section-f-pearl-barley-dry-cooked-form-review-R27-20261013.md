# WP03 Section F — pearl-barley dry/cooked form review (R27, 2026-10-13)

## Review record

- **Status:** Proposal only; no catalog, ledger, roadmap, checklist, batch, recipe, or application files changed.
- **Exact open checklist item:** [Section F, dry/cooked forms for remaining grains](../../RecipeBook-global-ingredient-catalog-plan.txt#L2419): “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated. Cooking yield is a separate quantity relation.”
- **Scope:** State forms on the existing `ingredient-ref-pearl-barley` identity, including bilingual naming, source-specific portion evidence, current phrase ownership, recipe demand, and limits on reusable measurements and substitutions.
- **Recommendation:** Add `ingredient-form-pearl-barley-dry` and `ingredient-form-pearl-barley-cooked` with no match terms and null form densities. Keep the reference’s density null and unit mappings empty. Add no active portions, conversions, cooking yield, substitutions, or recipe links. Keep the measurement review open until the CNF 2026 food and measure-weight rows are directly checked.

## Why this is an open form decision

The active catalog already has a verified pearl-barley product identity, but it has no attached forms. The [grain/cereal catalog overview](../batches/plant-grains-cereals.md) and the prior [Section F identity-only integration](wp03-section-f-residual-grain-identities-review-20261010.md) leave pearl barley without a dry/cooked state allocation. The focused reviews of barley flakes, pot barley, quick-cooking barley, and cream of barley cereal address different product or processing boundaries; none decides forms for pearl barley. The broader [generic rice, quinoa, and oat-bran state-form packet](../batches/rice-quinoa-oat-bran-state-forms.md) explicitly avoids applying generic grain forms to every named rice product, so it does not settle this named barley identity.

This is a state distinction within one existing product: OQLF defines pearl barley as barley grains stripped of both envelopes and polished. Health Canada's CNF separately describes pearled barley in dry and cooked states. A cooked state therefore does not create a second barley product identity or erase the pearl-processing boundary. Attach the forms only to the pearl-barley reference; do not extend them to hulled barley, pot barley, quick-cooking barley, barley flakes, or other barley products.

## Bilingual form decision

OQLF directly pairs English **pearl barley** with Québec French **orge perlé**. It also says that *orge* is masculine in *orge perlé*, despite being feminine in most other uses. The CNF 2015 pages use the exact bilingual state descriptors “Grains, barley, pearled, dry / Grains céréaliers, orge, perlé, sec” and “Grains, barley, pearled, cooked / Grains céréaliers, orge, perlé, cuit.” The proposed concise catalog labels combine the OQLF-preferred product term with those source-attested state words; the masculine agreement yields **sec** and **cuit**.

| Proposed form ID | Code / state | English label | fr-CA label | Match terms | Form density |
|---|---|---|---|---|---|
| `ingredient-form-pearl-barley-dry` | `dry` / `dry` | `pearl barley, dry` | `orge perlé, sec` | None | `null` |
| `ingredient-form-pearl-barley-cooked` | `cooked` / `cooked` | `pearl barley, cooked` | `orge perlé, cuit` | None | `null` |

Use form notes consistent with the existing state forms: “Dry/cooked form; no density, conversion, or cooking-yield relation is established.” / “Forme sèche/cuite; aucune densité, conversion ou relation de rendement à la cuisson n'est établie.” Do not add `dry`, `cooked`, `sec`, or `cuit` as reference aliases or as broad form match terms. The complete bilingual labels are sufficient to identify a state without claiming that a state word alone identifies pearl barley.

## Product, process, and phrase boundaries

OQLF supports the existing product name and defines the pearl-polishing process. Other current barley rows remain distinct product identities: hulled barley / *orge mondé*, pot barley / *orge en pot*, and quick-cooking barley / *orge à cuisson rapide*. The [pot-barley terminology review](wp03-pot-barley-quebec-french-name-resolution-20261011.md) documents the separate product and the French crosswalk problem; the [quick-cooking-barley review](wp03-section-f-quick-cooking-barley-identity-review-20261012.md) treats a pre-cooked-then-dried commercial product as a separate identity. Neither is an alias or state form of pearl barley.

The live reference is `ingredient-ref-pearl-barley`, displayed as `pearl barley / orge perlé`, with the existing English alias `jau`, category `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`. It has no forms. The nearest active barley rows remain separate, including hulled barley, pot barley, barley couscous, barley flakes, cream of barley cereal, quick-cooking barley, sprouted barley, puffed barley, and distinct barley flours. No identity or alias change is proposed.

The current [picker search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds case, accents, punctuation, and spacing, finds complete word phrases across reference and attached-form terms, and reports a form hint only for a complete normalized form term. Static phrase ownership against the live references, forms, and the 64 legacy import candidates found:

| Query | Current owner | With the proposed forms |
|---|---|---|
| `pearl barley` / `orge perlé` | `ingredient-ref-pearl-barley` | Same reference; no state hint because the query does not contain a complete form label. |
| `jau` | `ingredient-ref-pearl-barley` | Same reference; the alias does not infer dry or cooked state. |
| `pearl barley, dry` / `orge perlé, sec` | No exact current state phrase or form owner | The pearl-barley reference, with the dry form hint for a complete label query. |
| `pearl barley, cooked` / `orge perlé, cuit` | No exact current state phrase or form owner | The pearl-barley reference, with the cooked form hint for a complete label query. |
| `barley` / `orge` | Multiple qualified barley rows | Still multiple rows; this proposal adds no broad alias. |

These are static projections from catalog data and the search code, not runtime picker results.

## Full bundled-recipe audit

I parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. I searched serialized recipe text and ingredient fields for `pearl barley`, `pearled barley`, dry/cooked English variants, `orge perlé` and its accent-folded form, state-qualified French phrases, the exact token `jau`, and the proposed reference and form IDs.

| Audit result | Count |
|---|---:|
| Recipe files with a candidate phrase | 0 / 114 |
| Matching structured ingredient rows | 0 / 1,123 |
| Direct links to the pearl-barley reference or either proposed form | 0 |

The bundled recipes provide no pearl-barley demand. The recommendation rests on the checklist's measurement/state coverage and source-backed state labels; it does not claim a recipe need. No recipe link or text change is proposed.

## Portions, density, and cooking yield

Health Canada's accessible CNF serving-size pages are for the **2015 CNF online**. They were modified on 2019-03-01 and should be treated as publication-specific historical observations:

| CNF 2015 record | Source-reported values |
|---|---|
| Food code 4411, pearled barley, dry | 100 mL = 84.5 g; 250 mL = 211.3 g; “amount to make 125 mL” = 23.8 g. |
| Food code 4486, pearled barley, cooked | 100 mL = 66.4 g; 125 mL = 82.9 g; 250 mL = 165.9 g. |

These values are not promoted to a reusable mapping. Health Canada's [2015 CNF Users Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes portion conversion factors as food-specific weights used to calculate nutrients for described portions and notes that generic portion weights can differ from local market products. It describes a separate yield file for cooked-from-raw or moisture-gain observations, but that does not establish that every serving-page field is a general cooking yield. In particular, preserve the dry page's exact “amount to make” field as source wording; the source page does not state a preparation protocol there. Do not convert it into a dry-to-cooked ratio or package yield.

Health Canada now says CNF 2026 is published as relational CSV files and that the 2015 online search remains available as an interim measure. The Open Government Portal lists 2026 Food Name and Measure Weight Conversion resources, but the dataset and direct CSV opens returned 403 through the available browser. No 2026 pearl-barley row, code, portion, or weight was verified. This access limit is not evidence that such a row is absent. Keep the current ledger `measurementState: not_yet_researched` unchanged until those current rows are retrieved and interpreted.

No `defaultDensity`, form `densityGPerMl`, `unitMappings`, or active measurement observations are proposed. Even the old CNF weights are source-, food-code-, state-, and edition-specific; they do not establish a reusable mass-volume rule for general household measures.

## Cooking and substitution evidence

Alberta Health Services gives a general home-cooking direction of 1 cup (250 mL) pearl or pot barley with 3 cups water for 40 minutes. A Signature Select pearled-barley package gives a product-specific method of 1 cup grain with 2½ cups water for 45 minutes and notes that altitude, water hardness, and product moisture may change cooking time. These sources illustrate that cooking instructions depend on the source or product; neither reports a general prepared yield. They do not justify a universal cooking ratio, time, dry-to-cooked quantity transform, or form substitution rule.

No reviewed source provides a tested equivalence between dry and cooked recipe quantities or a safe replacement amount for pearl barley versus hulled barley, pot barley, or another grain. No global or contextual substitution is proposed. Keep the substitution research state unchanged in the live ledger; the proposal adds no substitution behavior.

## Source register

Sources were checked on 2026-10-13. The source IDs below are local to this proposal, except for the already-recorded OQLF source `WP03-S16`, which is reused rather than duplicated.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-S16` (existing) | Office québécois de la langue française, [orge perlé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358518/orge-perle). | Directly pairs *pearl barley* with *orge perlé*, defines the polished product, and states that *orge perlé* is masculine. It does not address cooked-state forms or measurements. |
| `WP03-PBARLEY-FORMS-R27-20261013-S01` | Health Canada, [CNF 2015 pearled barley, dry, food code 4411](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411). | Gives the bilingual dry-state descriptor and exact source-specific portion entries, including “amount to make 125 mL.” The page is the 2015 online file, modified 2019-03-01; it does not define a reusable conversion or general cooking yield. |
| `WP03-PBARLEY-FORMS-R27-20261013-S02` | Health Canada, [CNF 2015 pearled barley, cooked, food code 4486](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4486). | Gives the bilingual cooked-state descriptor and the 100, 125, and 250 mL portion weights listed above. The page is the 2015 online file, modified 2019-03-01; no packing method is stated. |
| `WP03-PBARLEY-FORMS-R27-20261013-S03` | Health Canada, [Canadian Nutrient File — Users Guide (2015)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), “Conversion factor file” and “Yield amount file.” | Describes food-specific portion weights used for nutrient calculations and distinguishes yield observations from cooking-by-calculation. Its guidance applies to the 2015 CNF edition. |
| `WP03-PBARLEY-FORMS-R27-20261013-S04` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Says CNF 2026 is published as relational CSVs and the 2015 online access remains interim. It establishes the edition context, not pearl barley's 2026 measurements. |
| `WP03-PBARLEY-FORMS-R27-20261013-S05` | Open Government Portal, [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1), [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | The indexed dataset listing exposes the current resource names and update metadata. Opening the dataset or CSV contents returned 403 through the available browser, so no 2026 pearl-barley rows are claimed. |
| `WP03-PBARLEY-FORMS-R27-20261013-S06` | Alberta Health Services, [Try a New Whole Grain](https://www.albertahealthservices.ca/nutrition/Page14677.aspx), barley section. | Distinguishes hulled, hull-less, pot, and pearled products; gives one general pearl/pot cooking direction. It gives no cooked yield and does not establish a universal method. |
| `WP03-PBARLEY-FORMS-R27-20261013-S07` | Signature Select, [Pearled Barley product instructions](https://smartlabel.labelinsight.com/product/4869521/other/instructions), UPC 021130501106. | Gives one package's 1 cup grain / 2½ cups water / 45-minute method and notes product/environment variation. This is product-specific instruction, not a generic yield or conversion. |

## Static review and disposition

- Re-read `AGENTS.md`, the ingredient/form and conversion requirements, the exact open Section F checklist, the current pearl-barley catalog and ledger records, prior grain-state batch, and relevant barley proposals. No prior focused proposal or active ID resolves pearl-barley dry/cooked forms.
- Checked all 1,355 live reference IDs and aliases, all 98 form IDs/labels/match terms, and 64 legacy candidates. The reference already owns `pearl barley`, `orge perlé`, and `jau`; exact dry/cooked phrases and proposed form IDs are unowned.
- Scanned every recipe file in the manifest and all structured ingredient rows as described above. No app tests, unit tests, instrumentation tests, or emulator checks were run; this is proposal-only documentation, and `AGENTS.md` says database-JSON-only additions do not require tests.
- Checked the written proposal for UTF-8 decoding, no BOM, valid local links, a final newline, and trailing whitespace.

**Disposition:** Recommend only two bilingual state forms on the existing pearl-barley identity. Keep density, mappings, portions, conversions, yields, substitutions, and recipe links inactive. Keep measurement research open pending CNF 2026 row-level inspection. This proposal does not close the Section F checklist or change any shared catalog, ledger, recipe, plan, roadmap, or batch file.

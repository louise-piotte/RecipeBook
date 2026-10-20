# WP02 / WP03 / WP04 R549–R551 gap-review integration

Integrated on 2026-10-17. This batch records one bounded malted-barley-flour measurement and
substitution review, five CNF 2026 wild-rice portions, and one Atlantic-halibut-cheek picker hold.
The broader WP02 Section A, WP03 Section F, and WP04 Section P parents remain open.

## R549 — malted barley flour

Updated the existing `ingredient-ref-malted-barley-flour` ledger record to
`measurementState: researched_no_supported_value` and
`substitutionResearchState: researched_no_supported_substitute`. Added Aslam et al.'s 2023 bread
study as source `WP02-A4-MBF-SUB-R549-20261017-S01` and the evidence-only finding
`malted-barley-flour-no-general-wheat-substitute-r549-20261017`.

The finding preserves the authors' conditional recommendation of 5% for acceptable bread when
proper malting, dough development, and baking protocols are followed. It stays limited to that
study's custom-malted flour, formula, and process. No general home-recipe replacement amount, active
substitution rule, measurement observation, density, form, mapping, conversion, or recipe link was
added. The study is [available from Frontiers](https://doi.org/10.3389/fsufs.2023.1230374).

Refreshed existing CFIA source `WP02-S111` to record the 0.50% composition allowances for specified
standardized white and whole-wheat flours; these are not direct recipe replacement ratios. Refreshed
both existing Arva source entries `WP02-S112` and `WP02-S113` in place on the malted- and
roasted-barley records. The English page's 600 g package and diastatic offering are directly
retrievable. The French route was not directly retrievable during root review; its indexed 700 g
heading remains lower-confidence product context and is not treated as a measure or yield.

See the [R549 proposal](../../proposals/wp02-next-gap-review-r549-20261017.md) and the earlier
[malted-barley-flour identity record](../malted-barley-flour-identity.md).

## R550 — dry and cooked wild rice

Added two ledger records for the dry and cooked forms that already exist in the ingredient-form
package. This fills the missing form-level ledger coverage; the package and picker remain unchanged.
Added eight Food Code-specific CNF 2026 CSV sources and five separate `portion_weight` observations:

- Food Code 4449, dry wild rice: 100 mL = 67.625 g and 250 mL = 169.062 g.
- Food Code 4450, cooked wild rice: 100 mL = 69.315 g, 125 mL = 86.644 g, and 250 mL = 173.288 g.

CNF 2015 evidence remains separate. The 45 g and 140 g mass-only rows and refuse rows were excluded;
the dry-row `amount to make 125ml = 32.5` Yield entry remains uninterpreted. No density, reusable
mapping, conversion, dry-to-cooked yield, recipe link, or substitution was added. The parent wild-rice
identity state remains unchanged.

See the [R550 proposal](../../proposals/wp03-section-f-next-gap-review-r550-20261017.md).

## R551 — Atlantic halibut cheeks

Kept the proposed Atlantic-halibut-cheek form outside active data. OQLF defines `joue` as a
commercializable fish part and lists flétan among its species; Québec supplier pages separately list
halibut cheeks under Atlantic halibut. The proposed species-qualified form would also make broad
`cheek(s)` and `joue(s)` picker searches resolve to Atlantic halibut alone, and the bundled recipe
corpus has no halibut demand. No catalog or ledger entry was added. See [OQLF's terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199070/joue),
[Pêcherie Manicouagan's bilingual product pages](https://manicouaganfisheries.com/fr/nos-produits/fletan-de-l-atlantique),
and the [R551 proposal](../../proposals/wp04-section-p-next-gap-review-r551-20261017.md).

The Section P checklist records this hold separately from the Atlantic-cod-cheek hold and the
integrated Atlantic-halibut-steak form. No recipe or code changed.

## Validation

- `validate_research_ledger()` accepted **2,168 records** with **0 schema/source errors**.
- The ledger contains **10,011 source entries**, **8,458 distinct source IDs**, and **7,142 distinct
  source URLs**.
- Static assertions confirmed the R549 evidence states/finding, the two R550 form records, all five
  observation values, and the four code-specific source references on each observation.
- The ledger round-trips with stable formatting, UTF-8 without BOM, explicit JSON Unicode escapes,
  and a final newline. `git diff --check` passed on the integrated files.
- No software tests, Android build, emulator run, or deployment were performed. The application data
  change only adds research-ledger JSON data, which is exempt from testing under `AGENTS.md`; R551 is
  documentation-only.

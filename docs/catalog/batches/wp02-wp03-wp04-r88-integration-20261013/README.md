# WP02/WP03/WP04 R88 catalog integration (2026-10-13)

## Decisions integrated

- **WP02 B2 — defatted hazelnut flour:** Added identity-only `defatted hazelnut flour / farine de noisette déshuilée` in `FLOUR_AND_STARCH`, with both alias arrays empty. The French display is attested in a Québec ingredient declaration; no standalone Québec flour package or OQLF compound entry was found. Kept the ordinary flour row unchanged and the unqualified powder and meal terms unassigned. Added no forms, measures, conversions, yields, recipe links, or substitutions.
- **WP03 Section F — hulless barley:** Added English aliases `hulless barley` and `naked barley` and the Canadian grain-class French alias `orge à grains nus` to the existing whole-kernel `hulled barley / orge mondé` reference. The alias routes a hulless type query to the existing food-ready whole-kernel identity; it does not imply a mechanical dehulling process. Kept `orge nue` and `orge entière` out of aliases because they conflict with the sprouted-malted barley and whole-barley-flour boundaries. Added no row, form, measure, conversion, yield, recipe link, or substitution.
- **WP04 Section P — Atlantic butterfish:** Held *Peprilus triacanthus* outside active references, forms, and the research ledger. CFIA assigns `Butterfish / Stromaté` to five *Peprilus* taxa, and a Québec menu listing does not identify the fish species. No catalog or ledger data changed for this documentation-only hold.

The active catalog contains **1,420 ingredient references, 104 forms, and 1,759 research-ledger records**. Twelve source records were integrated: six for the new hazelnut reference and six on the existing hulled-barley ledger record. The manifest still contains **114 recipes and 1,123 ingredient rows**; none matches the R88 candidates.

Picker projections show that `hazelnut flour` and `farine de noisette` return both flour identities, while their qualified defatted phrases select only the new row. Unqualified `poudre de noisette` and its qualified composite-product phrase remain unassigned. `hulless barley`, `naked barley`, and `orge à grains nus` select only hulled barley; broad `barley` and `orge` counts remain 17 each. `orge nue` remains unmatched, and `pearl barley` and `pot barley` keep their existing owners. `butterfish` and `stromaté` remain unmatched.

## Static validation

Passed:

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` (includes research-ledger schema validation)
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Reference and ledger record ID uniqueness; all 12 R88 source IDs occur exactly once on their assigned record
- Picker projections for both hazelnut-flour identities, the unassigned powder queries, hulless-barley aliases, adjacent barley owners, unchanged broad barley/orge counts, and held butterfish terms
- Scan of all 114 bundled recipes and 1,123 ingredient rows; zero R88 candidate-term matches
- UTF-8 without BOM, escaped Unicode in database JSON, final newlines, no trailing whitespace or mojibake, and local Markdown links/line anchors
- Scoped `git diff --check`

No app tests, Gradle tasks, emulator runs, or deployment were performed. The application-data changes only add database JSON data under the updated `AGENTS.md` rule; the butterfish review is a documentation-only hold.

See the [defatted hazelnut flour proposal](../../proposals/wp02-b2-defatted-hazelnut-flour-identity-review-r88-20261013.md), the [hulless barley proposal](../../proposals/wp03-section-f-next-grain-review-r88-20261013.md), and the [butterfish picker-boundary proposal](../../proposals/wp04-section-p-butterfish-stromatee-picker-boundary-review-r88-20261013.md).

# WP03 Section F Dalia product boundary integration

- **Date:** 2026-10-12.
- **Outcome:** Added eight product and terminology sources plus one accepted boundary decision to the existing `ingredient-ref-cracked-wheat` research-ledger record.
- **Catalog effect:** No reference, alias, form, recipe link, measurement observation, density, unit mapping, package yield, conversion, or substitution changed. The record remains `measurementState: not_yet_researched`.
- **Identity boundary:** Canadian retailer listings use `Cracked Wheat Dalia` and one Québec-facing listing uses `blé concassé (dalia)`. Fortinos describes its Suraj product as whole wheat that is coarsely ground. CFIA defines crushed/coarse-ground wheat separately from cracked wheat, which it defines as wheat cracked or cut into angular fragments. The product listing's 40 g serving was therefore kept as source evidence, not assigned to the current cracked-wheat identity.
- **Alias boundary:** No Dalia or Dallia aliases were activated. The qualified listing titles would make a bare `dalia` picker query return cracked wheat under the current substring matching behavior. Other reviewed listings use Dalia for split chickpeas and multigrain products, so the bare term remains ambiguous. Fada and Bulgur #3 marketplace crosswalks remain unaccepted.
- **Recipe and ownership audit:** No candidate phrase matched any of the 114 manifest-listed recipes or 1,123 ingredient rows. Normalized target names had no exact owner among active references, forms, or legacy candidates. All eight added source IDs were unique.

## Snapshot after integration

| Artifact | Count | SHA-256 or corpus fingerprint |
| --- | ---: | --- |
| [Ingredient references](../../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,233 | `0a0336b7429232a4a48eb344c266d8e5ba94aa587047186c2bd56b6af62b6e0d` |
| [Ingredient forms](../../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| [Legacy candidates](../../legacy-import-identities.v1.json) | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| [Research ledger](../../research-ledger.v1.json) | 1,531 records; 5,271 source entries; 4,313 distinct source IDs | `d665f791e7f6077054ce3bcc2e0b6aeb2434b346703b62e74257aa9fde8edbdd` |
| [Generated Kotlin catalog](../../../../app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt) | 1,233 | `3b7d7141bcc3692b255e2e37b0b5c9d5de6bbbe49c53036eb89553e682d57795` |
| [Manifest](../../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 752,993 bytes | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

## Static validation

- Bundled-package validation and normalization checks passed.
- Reference normalization, generated-catalog freshness, and research-ledger schema/semantic validation passed.
- Exact normalized ownership, source-ID uniqueness for the eight additions, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds research data to a database JSON file, as directed by `AGENTS.md`.

## Sources and review record

The source register and accepted decision are in [the proposal](../../proposals/wp03-section-f-regional-cereal-mixes-residual-gap-sweep-20261012.md). Key source pages include [Fortinos' Suraj Cracked Wheat Dalia listing](https://www.fortinos.ca/en/cracked-wheat-dalia/p/21068371_EA), which reports a 40 g serving and describes the product as coarsely ground, and [CFIA's Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), which distinguishes cracked wheat from crushed/coarse-ground wheat.

The completed subreview is recorded under the still-open [regional cereal mix and preprocessed grain checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt). Broader WP03 Section F coverage remains open.

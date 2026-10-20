# WP02 fine-crystal sugar form integration — 2026-10-11

## Scope and decision

Reviewed the open WP02 Section C `superfine/caster sugar` item against the live seed and Québec terminology sources. Added `ingredient-form-granulated-sugar-fine-grain` under the existing `ingredient-ref-granulated-sugar` identity. The form represents crystal size only; no separate sugar identity or brand-independent product equivalence is asserted.

The form keeps the existing bilingual identity `granulated sugar / sucre granulé`. Its display labels are `superfine granulated sugar / sucre très fin`, with sourced search terms for `caster sugar`, `castor sugar`, `superfine sugar`, `super-fine sugar`, `sucre semoule`, `sucre-semoule`, `sucre superfin`, and `sucre extra fin`.

The Québec GDT identifies `sucre semoule` as the preferred French term for English `caster sugar`/`castor sugar`. It defines the product by fine grinding and sifting and notes that Canadian products sold as `sucre superfin`, `sucre de fruit`, `poudre de fruit`, `sucre en poudre`, and `sucre à dissolution instantanée` can be used as substitutes; it also notes that some sources distinguish `sucre semoule` from `sucre en poudre`. The Canadian Sugar Institute describes `sucre très fin` as the smallest crystal class among granulated sugars and lists overlapping market names. British Sugar likewise describes caster and screened sugars as particle-size products whose finer crystals help dissolving and mixing. These sources support a fine-crystal form and cautious search matching, not universal formulation equivalence.

The form deliberately excludes `fruit sugar`, `fruit powder`, `powdered sugar`, and `sucre en poudre` from its match terms. Those expressions can be ambiguous or retrieve the existing icing-sugar identity. No recipe rows changed, and the broader sugar checklist remains open.

## Evidence ledger

The form record in `docs/catalog/research-ledger.v1.json` has three sources:

- **WP02-CASTER-SUGAR-20261011-S01:** Office québécois de la langue française, [sucre semoule | GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870994/sucre-semoule), 2002 terminology record, accessed 2026-10-11. Supports the preferred French and English names, definition, usage, and the caution around Canadian substitute labels.
- **WP02-CASTER-SUGAR-20261011-S02:** British Sugar, [Our range of sugars](https://www.britishsugar.co.uk/sugar-products/our-range-of-sugars), accessed 2026-10-11. Manufacturer evidence for caster/screened crystal-size classes and the dissolving/mixing role of finer crystals.
- **WP02-CASTER-SUGAR-20261011-S03:** Canadian Sugar Institute, [Les types de sucre au Canada](https://sugar.ca/sugar-basics/types-of-sugar?lang=fr), accessed 2026-10-11. Supports the local `sucre très fin` label, its finer-crystal class, common uses, and overlapping market terminology; it does not give particle-size thresholds or universal equivalences.

No density, unit mapping, portion observation, conversion, cooking yield, or substitution finding was added. The form ledger state leaves measurement and substitution work not yet researched.

## Package and regression coverage

- Bundled package: **912 references, 49 forms, 114 recipes, and 1,123 ingredient rows**.
- Research ledger: **1,169 records, 3,099 source entries, and 2,504 distinct source IDs**.
- `BundledSeedPackageTest.fineCrystalSugarUsesGranulatedIdentityAndKeepsIcingSugarSeparate` verifies bilingual queries resolve to the granulated-sugar identity and the fine-grain form hint, while powdered sugar remains attached to icing sugar.
- `test_fine_crystal_sugar_form_has_scoped_search_and_no_numeric_claims` pins the form's exact match terms, blank density, and source-backed ledger state.
- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: **78 tests passed**.
- `:app:testDebugUnitTest`: **393 tests passed, 0 skipped, 0 failed, 0 errors**.
- Package normalization, ingredient-reference normalization, generated-catalog freshness, and research-ledger validation passed.
- Seed and changed source files were checked as UTF-8 without BOM. The seed normalizer preserves the required explicit Unicode escapes.

## Pixel 9a / Android 16 QA

The app was installed and launched on a disposable Pixel 9a / API 36 AVD clone (`emulator-5560`). The connected instrumentation suite completed **37 tests, 2 skipped, 0 failed**. The repository deployment script also completed its `test` and `:app:assembleDebug` steps, installed the APK, and started `MainActivity`.

In the live picker, English `caster sugar` showed `granulated sugar` with the `superfine granulated sugar` form row. French `sucre semoule` showed `sucre granulé` with the `sucre très fin` form row. Selecting the French form returned to the editor with `sucre granulé` as the identity and `sucre très fin` as its form hint. The unsaved draft was discarded; the French library screen returned to **Toutes les recettes (114)**.

Screenshots: [English caster-sugar results](screenshots/picker-en-caster-sugar.png) and [French sucre-semoule results](screenshots/picker-fr-sucre-semoule.png).

The owner AVD userdata SHA-256 remained `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997`; the disposable clone began from the same image and was the only AVD used for installation and app data changes.

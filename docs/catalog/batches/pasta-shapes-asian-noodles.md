# WP03 Section G pasta shapes and Asian noodles

- **Reviewed:** 2026-10-07
- **Status:** three identity-only products integrated; independent Québec French terminology review is complete for these labels and aliases, while broader culinary and category review remains open.
- **Owner:** WP03 identity research; WP10 catalog integration lead for canonical IDs, seed merge, and validation.
- **Reviewers:** source review completed; independent bilingual Québec culinary review pending.
- **Dependencies:** completed Phase 0 repository audit; Section G generic pasta identity; canonical seed and generated-index workflow.
- **Scope:** one pasta shape and two starch-defined noodle products. This packet does not infer dry/fresh/cooked forms, universal composition, densities, measurements, yields, conversions, substitutions, or recipe links.

## Acceptance checks

- [x] Use authoritative source terminology and keep product senses distinct.
- [x] Add only exact bilingual identities with source-supported localized spelling.
- [x] Keep broad rice noodles, rice sticks, and generic glass noodles outside the accepted rows.
- [x] Leave all measurement, form, yield, conversion, and substitution data unset.
- [x] Audit all bundled recipes and normalized catalog-key collisions before adding rows.
- [x] Complete independent Québec French terminology review of the three labels and active aliases; broader culinary review remains open.
- [ ] Continue the remaining Section G candidate sweep.

## Integrated references

| ID | English | fr-CA | Aliases | Category | Identity boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-spaghetti` | spaghetti | spaghetti | FR: `spaghettis` | `GRAIN_AND_CEREAL` | Long, round-section pasta shape. Keep separate from the prepared-dish sense and from other shapes; no dry/fresh or composition claim. |
| `ingredient-ref-rice-vermicelli` | rice vermicelli | vermicelle de riz | FR: `vermicelles de riz` | `GRAIN_AND_CEREAL` | Rice-flour pasta in very thin, long, translucent threads. Do not equate with broad rice noodles or rice sticks. |
| `ingredient-ref-bean-thread-cellophane-noodles` | bean thread cellophane noodles | nouilles à base de farine de haricot mungo | None | `LEGUME_AND_PULSE` | Mung-bean-flour noodle product; distinct from rice vermicelli and unqualified glass noodles. |

The OQLF food-product entry defines *spaghetti* as long pasta with a round cross-section, shaped like a fine rod about two millimetres in diameter. It gives *spaghetti* in both languages and states the French plural is *spaghettis*. OQLF has a separate entry for the prepared dish, also named *spaghetti*; the catalog row follows only the pasta-product sense. Barilla Canada's French product page independently treats it as a long pasta shape and identifies one durum-semolina retail product. The seed does not encode that product's composition as universal.

OQLF defines *vermicelle de riz* as an Asian pasta made from rice flour and formed into very thin, long, translucent threads. It gives *rice vermicelli* as the English term and explicitly permits the French singular or plural. Only these exact French forms are active; bare *vermicelles* remains broad and may also find decorative sprinkles.

OQLF provides a separate English–French pair for bean-thread cellophane noodles made from mung-bean flour. The chosen display uses its most explicit French preferred term, *nouilles à base de farine de haricot mungo*. Other French terms in the entry were not activated as aliases. The row is categorized as `LEGUME_AND_PULSE` because its defining base is mung bean flour; it remains a noodle product identity, not a new mung-bean flour identity.

## Unresolved neighboring candidates

- **Rice noodles / nouilles de riz:** OQLF mentions rice noodles in a broader Chinese-noodle entry that spans wheat, rice, soy, and other bases. It does not provide a dedicated product entry establishing the English–Québec French pair or a stable boundary from rice vermicelli, flat rice noodles, and rice sticks. A ledger candidate remains unresolved; it is not an alias for rice vermicelli.
- **Rice sticks and flat rice noodles:** remain open pending a stable Québec French product boundary across retail and culinary usage.
- **Glass noodles:** remain open as a generic name. Do not map them automatically to mung-bean noodles or rice vermicelli.
- **Other pasta shapes and composition/state distinctions:** orzo, macaroni, spaghetti-type variants, dried/fresh pasta, egg pasta, whole-wheat pasta, and gluten-free pasta remain for separate review. No product matrix is inferred.
- **Generic noodles / nouilles:** keep unassigned, consistent with the generic-pasta checkpoint; do not add either as a pasta alias.

## Recipe and collision audit

All 114 bundled recipe JSON files were scanned. No recipe ingredient line requests spaghetti, rice vermicelli, or bean-thread cellophane noodles; no recipe was relinked. The only related existing recipe text is a serving instruction to serve beef Stroganov with rice or noodles and a cookie instruction mentioning decorative *vermicelles*.

Normalized exact-key audit found each accepted English and French label owned by only its intended reference. `spaghetti` and French `spaghettis` resolve to `ingredient-ref-spaghetti`; `rice vermicelli`, `vermicelle de riz`, and `vermicelles de riz` resolve to `ingredient-ref-rice-vermicelli`; the bean-thread English and French labels resolve to `ingredient-ref-bean-thread-cellophane-noodles`. Exact queries for `rice noodles`, `nouilles de riz`, `rice sticks`, and `glass noodles` remain unassigned. The shorter query `vermicelles` can return both rice vermicelli and decorative sprinkles, so the picker check uses the qualified label.

## Sources

- **WP03-S158 — OQLF, [spaghetti (pâte alimentaire)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350753/spaghetti):** product-domain definition, bilingual term, and French plural.
- **WP03-S159 — OQLF, [spaghetti (mets)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350754/spaghetti):** separate prepared-dish sense; used to disambiguate scope.
- **WP03-S160 — Barilla Canada, [Spaghetti](https://www.barilla.com/fr-ca/produits/pates/bo%C3%AEte-bleue-classique/spaghetti):** Canadian retail product page identifies spaghetti as a long pasta shape and describes one durum-semolina product.
- **WP03-S161 — OQLF, [vermicelle de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8370358/vermicelle-de-riz):** exact English–Québec French term pair and rice-flour/thread definition.
- **WP03-S162 — OQLF, [nouilles à base de farine de haricot mungo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18045583/nouilles-a-base-de-farine-de-haricot-mungo):** exact English bean-thread cellophane noodle term, French terminology, and mung-bean-flour boundary.
- **WP03-S163 — OQLF, [pâtes alimentaires chinoises](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298986/pates-alimentaires-chinoises):** supports the unresolved boundary among noodle products from different bases and the variable English scope of *noodles*.

## Verification record

Verified on 2026-10-07 with the isolated Pixel 9a AVD (`emulator-5556`, Android 16 / API 36). The package normalizer and generated-index freshness checks passed; 9 Python seed-package tests passed; 263 Android unit tests passed; connected instrumentation ran 29 cases with 27 passed, 2 environment-gated skips, and 0 failures. `tools/deploy_to_pixel9a_emulator.sh` completed the full Gradle `test` task, assembled the debug APK, installed it, and launched the app. The instrumentation runner removed the app-under-test package afterward, so the tested APK was reinstalled on the same isolated AVD for manual picker checks.

In English app mode, exact searches for `spaghetti`, `rice vermicelli`, and `bean thread cellophane noodles` each returned exactly one result. In French app mode, the picker displayed `spaghetti`, `vermicelle de riz`, and `nouilles à base de farine de haricot mungo` for those same product searches. Unit tests also verify the French plural aliases and exact French-label lookup. No result was selected and no recipe was saved; the app returned to the 114-recipe French home screen. The original AVD (`emulator-5554`) still has no `app.recipebook` package installed.

Pixel screenshots and SHA-256:

- [English spaghetti picker](pixel9a-pasta-spaghetti-picker-en.png) — `9f5b00e0faed9ed20f447ac9a4990df4b775d1a5a28ef73c9d26eb4f7c54f13d`
- [French spaghetti picker](pixel9a-spaghetti-picker-fr-ca.png) — `4f84e6be94789f2f335ac426495e9e33ac194e73271dda00901ca0ec42810118`
- [English rice-vermicelli picker](pixel9a-rice-vermicelli-picker-en.png) — `ce4f0b964c2f8876778bfa1002db41b807836e85349c555c4e2af97d2ba1c2e5`
- [French rice-vermicelli picker](pixel9a-rice-vermicelli-picker-fr-ca.png) — `910fb8c7a026b5a77e778730f5dc80249f7a4f66bb297926de6d2f7789250cd2`
- [English bean-thread picker](pixel9a-bean-thread-cellophane-picker-en.png) — `f928140b9852fa10a04d92e6080063a4391a8f728eb7dc071a1b8d06aa317097`
- [French bean-thread picker](pixel9a-bean-thread-cellophane-picker-fr-ca.png) — `e8d1a59baf8d5528e88a6f80d97e6edf5cbfbe7a464182b3e3afcb35b27d959f`

Final artifact hashes:

- Ingredient references (367 rows): `1e8eef7ae38abbfd84c4cb8e6b5bd8e6768267e3d8d84639323079656e7fc75d`
- Generated Kotlin catalog: `f18dfca94b5f64c2c78aae8f9c6c0e3c499197693c5097c85493fa6351dd2d63`
- Research ledger (537 records): `7f04e189c290c5fb6171ad5d898965eafc3202662b9ea06b355ddee93a5d6b11`
- Debug APK: `172fa83c88f8fe5700e58dd14d4dc312b423932ec6f3c32c8bfad078ef53faa1`

The final seed/package normalizer, generated-index check, Python package tests, UTF-8/no-BOM and mojibake scan, and `git diff --check` passed. Identity implementation is complete for these three rows; independent Québec French culinary review and the rest of Sections F and G remain open.

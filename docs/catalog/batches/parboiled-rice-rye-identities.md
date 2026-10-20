# WP03 Parboiled Rice and Rye Identities

- **Owner:** WP03 plant-food researcher; WP10 integration lead
- **Reviewers:** Luna max identity and artifact reviews completed; independent bilingual Québec French culinary review — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add the source-backed parboiled-rice processing identity and broad rye grain identity. Review bilingual names, exact-key collisions, distinction from cooked rice and rye flour, recipe use, and picker behavior. Measurements, yields, forms, and substitutions remain separate.

## Identity decisions

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-parboiled-rice` | parboiled rice / riz étuvé | None | `GRAIN_AND_CEREAL`. OQLF supplies the direct bilingual name pair. Codex defines parboiling across husked and milled rice classes; the OQLF entry's older process description is not used to narrow that standard definition. Keep it distinct from cooked rice, unqualified rice, grain-length classes, and instant-rice wording [WP03-S49–S52]. |
| `ingredient-ref-rye-grain` | rye / seigle | None | `GRAIN_AND_CEREAL`. OQLF states that *seigle* names both the plant and its grain, and the federal grain-use schedules corroborate the category. Keep separate from rye flour; the reviewed sources do not establish `rye berries` as the product name [WP03-S53–S55]. |

Both rows are identity-only. They have empty aliases, null density, empty unit mappings, and no forms, conversions, yields, measurement observations, or substitutions.

## Withheld terms and search behavior

- Do not activate `Converted rice`: OQLF identifies it as a trademark associated with parboiled rice [WP03-S49].
- Do not activate contextual `riz précuit`, instant-rice wording, grain-length terms, or unqualified `rice` / `riz` as parboiled-rice aliases. The CNF product example has additional white, long-grain, and dry qualifiers; its serving values were not imported [WP03-S52].
- Do not activate `rye berries` or `grain de seigle`; the reviewed sources support the broad grain name *rye / seigle* but not those product labels [WP03-S53–S55].
- Keep `ingredient-ref-rye-flour` distinct. The English `rye` and French `seigle` searches intentionally return both rye grain and rye flour; the full French `farine de seigle` query returns only rye flour.
- The independent packet audit also found that OQLF recognizes Québec French *kacha / kasha* for a gruel made from roasted buckwheat. This identifies a prepared dish, not an established same-identity alias for dry roasted buckwheat groats, so the alias remains withheld [WP03-S15, S56]. The unresolved boundary is recorded as `ingredient-ref-kasha` in the evidence ledger; it is not an active catalog reference.

## Source register

- **WP03-S49 — OQLF, *riz étuvé*:** [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488742/riz-etuve). Gives preferred French *riz étuvé* and English *parboiled rice*. It lists *riz précuit* only as contextual wording and marks `Converted rice` as a trademark. Its 1988 process wording is used for naming context; Codex supplies the rice product-class definition adopted in this packet.
- **WP03-S50 — Codex Standard for Rice CXS 198-1995 (English):** [standard](https://www.fao.org/input/download/standards/61/CXS_198e.pdf), section 2.1.1.4. Defines parboiled rice as husked or milled rice soaked and heat-treated, then dried. Used for product boundary only.
- **WP03-S51 — Codex Standard for Rice CXS 198-1995 (French):** [norme](https://www.fao.org/input/download/standards/61/CXS_198f.pdf), section 2.1.1.4. Confirms the same processing definition in French.
- **WP03-S52 — Health Canada CNF, white long-grain parboiled rice, dry:** [food code 4472](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4472). Gives the bilingual label *white long-grain parboiled rice, dry / riz blanc, grain long, étuvé, sec*. Used for wording only; no serving or volume values were imported.
- **WP03-S53 — OQLF, *seigle*:** [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432764/seigle). Gives the direct English term *rye* and says *seigle* designates the plant and its grain.
- **WP03-S54 — Safe Food for Canadians Regulations, Schedule 1 (English):** [grain-use schedule](https://laws-lois.justice.gc.ca/eng/regulations/SOR-2018-108/page-24.html). Lists rye among foods used as grain; used for category placement only.
- **WP03-S55 — Règlement sur la salubrité des aliments au Canada, annexe 1 (français):** [annexe sur les aliments utilisés comme grain](https://laws-lois.justice.gc.ca/fra/reglements/DORS-2018-108/page-24.html). Lists *seigle*; used for category placement only.
- **WP03-S56 — OQLF, *kacha / kasha*:** [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506505/kacha). Gives the Québec terms *kacha / kasha* and English *kasha*, defining the food as a gruel made from roasted buckwheat. This supports the prepared-dish term but not equivalence to dry roasted buckwheat groats.

## Catalog and recipe audit

The pre-integration seed had 340 references and the evidence ledger had 495 records. No exact normalized English or French name/alias key or stable-ID collision was found for either new row. Existing `ingredient-ref-rye-flour` remains unchanged. The 114 bundled recipe files were scanned for parboiled-rice and rye terms in their serialized data; no match was found and no recipe changed.

The final split package has 342 ingredient references (SHA-256 `a5442958af6f356b3e7a985b7a5ac99aeec948c7abaaeb66683e7544033f8f7e`) and 114 recipes. The evidence ledger has 498 records (SHA-256 `3a6c3e5d64e9e21e70c0f891b3be456bed984b3e775c7991692351b48bf555bf`), including an unresolved kasha-versus-dry-groats candidate note.

## Verification record

- The generated Kotlin catalog is fresh. Both additions retain empty aliases and null/empty numeric data.
- All 246 Android unit tests passed; all 9 Python seed-package tests passed. Seed normalization, bundled-package normalization and validation, generated-index freshness, and `git diff --check` passed.
- The deployed Pixel 9a picker showed one `parboiled rice` result in English and one `riz étuvé` result for accent-folded French search. It showed separate `rye` and `rye flour` results in English and `seigle` and `farine de seigle` in French.
- The first emulator install failed with 421 MB free on `/data`. Uninstalling the emulator app freed space and allowed the deploy script to complete. This cleared emulator-local app data; the app reseeded and returned to the French home screen with all 114 recipes. No repository recipe or user data was changed by the probe, and the blank draft was discarded.
- Screenshots: [English parboiled rice](pixel9a-parboiled-rice-picker-en.png), [English rye choices](pixel9a-rye-picker-en.png), [fr-CA riz étuvé](pixel9a-parboiled-rice-picker-fr-ca.png), [fr-CA seigle choices](pixel9a-rye-picker-fr-ca.png), and [restored 114-recipe home](pixel9a-parboiled-rice-rye-home-fr-ca-114.png).
- Independent bilingual Québec French review and the broader Section F identity sweep remain open. Dry/cooked rice, quinoa, and oat-bran allocation remains blocked on the WP01 form-versus-identity decision; this batch does not resolve that modeling question.

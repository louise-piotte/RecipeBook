# WP02 Section D R329 — Dark-chocolate percentage qualifier

Reviewed and integrated on 2026-10-16.

Kept the existing `ingredient-ref-dark-chocolate` identity generic and changed its French display from `chocolat 70%` to the OQLF-supported `chocolat noir`; its English display remains `dark chocolate`. Removed the now-duplicate French alias. The existing `dark chocolate chips` alias and attached chips form remain unchanged.

Recipe 102 already preserves `225 g 70% dark chocolate, chopped` as original text and `70 %, haché / 70%, chopped` in its bilingual preparation fields. This is one recipe-specific qualifier. RICARDO lists the same 225 g (8 oz) amount and about 32 bites on a page identified as advertiser-created content. No value was transferred to the generic ingredient. Recipe 031’s author-permitted alternatives remain formula-scoped.

No reference or form density, unit mapping, reusable measure, new form, conversion, recipe-line edit, or active substitution was added. The existing ledger measurement state remains `blocked_pending_evidence`; the ledger now records the naming and source-boundary evidence.

Sources checked include the [OQLF GDT entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18052604/chocolat-noir), which pairs French `chocolat noir` with English `dark chocolate`; [CFIA chocolate labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/confectionery-chocolate-and-snacks), which lists dark chocolate as a standardized common name and permits a factual cacao percentage statement; the [RICARDO recipe](https://www.ricardocuisine.com/recettes/3769-saucissons-de-chocolat); and [Cooking With Ayeh's Chocolate Dates](https://cookingwithayeh.com/chocolate-dates/), used only for its recipe-specific chocolate options.

The [R329 proposal](../../proposals/wp02-next-specialist-baking-identity-review-r329-20261016.md) contains the ownership, demand, and picker audit.

Static seed-package validation and normalization, ingredient-reference normalization, generated-index freshness, and research-ledger schema/semantic validation passed. Picker projection keeps `dark chocolate`, `chocolat noir`, and chip phrases at one result; it returns no result for generic `chocolat 70%` or `70% dark chocolate`. The bundled recipes remain unchanged. No software tests, builds, emulator checks, or deployment were run because this update only changes database JSON data and catalog documentation under `AGENTS.md`.

Section D remains open.

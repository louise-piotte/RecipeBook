# WP03 Section I R364 — pine-nut French plural alias

Added only `pignons de pin` to `ingredient-ref-pine-nuts.aliasesFr`. OQLF recognizes `pignon` and `noix de pin` as pine-seed terms; the Government of Québec uses `pignons de pin` and `noix de pin`; a Canadian marketplace listing uses the exact qualified plural phrase. The seller listing is terminology evidence only and does not establish species or current inventory.

Kept singular `pignon`, `pigne`, and `pignoles` off the whole-kernel row. The picker continues to route singular `pignon` and `pignon de pin` to the separate pine-nut-butter identity; the plural `pignons` and `pignons de pin` resolve to whole pine nuts. Recipe 102#8 remains unchanged. The marketplace’s 1/4 cup (30 g) serving is not a transferable conversion, and Ricardo’s optional recipe-specific alternatives do not establish a general substitution. No form, density, mapping, yield, recipe link, or substitution was added. Section I remains open.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: one French alias on the existing pine-nut reference.
- `docs/catalog/research-ledger.v1.json`: added the Canadian marketplace source and an accepted alias decision to the existing reference record; reused the already-registered OQLF and Government of Québec source IDs.
- Generated `BundledIngredientCatalog.kt` from the canonical reference JSON.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` and `roadmap.md`: recorded R364 while keeping the broader Section I checklist open.
- The [R364 proposal](../../proposals/wp03-section-i-next-gap-review-r364-20261016.md): marked integrated.

## Sources

- OQLF, [GDT: pignon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon).
- Government of Québec, [Pignons de pins](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/salubrite-aliments-domicile/preparation-aliments-cuisson-securitaires/precautions-manipule-aliments/pignons-de-pins).
- Walmart Canada, [NOW Foods Real Food Pignons de Pin Biologiques Crus](https://www.walmart.ca/fr/ip/NOW-Foods-NOW-Real-Food-Pignons-de-Pin-Biologiques-Crus-8-oz/42RK51A8WI1F). This is a third-party marketplace listing snapshot.
- RICARDO, [Saucissons de chocolat](https://www.ricardocuisine.com/recettes/3769-saucissons-de-chocolat), for recipe 102#8’s optional pine-nut line and recipe-specific alternatives only.

## Validation

- Seed reference normalization, bundled-package normalization/validation, generated-index freshness, and research-ledger schema/semantic validation passed.
- Static picker projection confirmed `pignons` and `pignons de pin` resolve to whole pine nuts; singular `pignon` and `pignon de pin` remain with pine-nut butter.
- Confirmed recipe 102#8 remains linked to `ingredient-ref-pine-nuts`; no recipe data changed.
- UTF-8 without BOM, local links, source-ID uniqueness, and `git diff --check` passed for the scoped files.
- No software tests, build, emulator check, or deployment was run because this only adds database JSON data under `AGENTS.md`.

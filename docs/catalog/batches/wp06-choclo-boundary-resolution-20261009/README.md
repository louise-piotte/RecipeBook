# WP06 South American choclo boundary resolution — 2026-10-09

## Coordinator decision

Defer a new identity and a global `choclo` alias. Treat it as a source-language term whose supplied ingredient state must be established by the recipe or product source:

- When the measured/supplied input is an intact ear, use the existing `ingredient-ref-corn-on-the-cob` reference and retain the recipe's kernel-removal preparation.
- When the ingredient is explicitly detached whole kernels, use the existing `ingredient-ref-corn-kernels` reference.
- Keep bare `choclo`, ground/grated green maize, and other unclear inputs unresolved. Do not infer sweet corn or a conversion from ear count to kernel mass/volume.

No catalog, ledger, form, recipe, or generated-index changes were made. No recipe relinking is proposed.

## Evidence and limits

Chile's [Centro de Documentación de Bienes Patrimoniales](https://www.cdbp.gob.cl/noticias/los-ingredientes-de-la-cocina-chilena-tradicional) calls choclo a tender maize ear while also describing its fresh ground use in humitas. Peru INIA's [traditional maize use booklet](https://repositorio.inia.gob.pe/items/88ee183c-e723-40c9-b3c2-af7a81714976) documents fresh immature grain and multiple whole-kernel, ground, and grated preparations. Peru Travel's [Papa a la Huancaína recipe](https://www.peru.travel/gastronomia/es/recetas/entradas/papa-a-la-huancaina.html) explicitly lists boiled `granos de choclo`. The Argentine government's [NEA recipe collection](https://www.argentina.gob.ar/sites/default/files/2020/09/pnpa_-_2021_-_recetario_nea.pdf) counts ears before removing and blending or grating kernels. These examples support conditional handling by input state, not a universal synonym relation.

For the explicit physical-state controls, OQLF gives `épi de maïs` / `corn-cob` for an ear and `maïs en grains` / `kernel corn` for kernels. These terms do not translate bare `choclo` in every context.

The detailed claims, scanned phrases, source locators, and evidence limits are in the [resolution proposal](../../proposals/wp06-choclo-resolution-20261009.md), which was reviewed against the earlier [choclo/corn boundary packet](../../proposals/wp06-choclo-corn-boundary-review-20261009.md).

## Audit snapshot

The 2026-10-09 exact-key and phrase audit found no choclo-family owner in 487 active references, 18 forms, or 99 legacy candidates, and no matching phrase in 114 bundled recipes / 1,123 ingredient rows. The active ear and kernel references remain the physical-state controls; neither has an unconditional choclo alias. The scan used 49 surface phrases and 48 normalized keys. No recipe text or reference links were changed.

Because this decision only records an unresolved identity boundary and adds no catalog value, it requires no seed-package, generated-index, or app-test changes.

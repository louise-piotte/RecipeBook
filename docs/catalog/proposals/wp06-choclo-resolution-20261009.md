# WP06 resolution: South American `choclo` product boundary

- **Reviewed:** 2026-10-09
- **Status:** source-grounded proposal only. This file is the only artifact changed by this review.
- **Recommendation:** **defer a catalog identity and global alias for bare `choclo`; accept source-scoped handling by explicit ingredient state.** The sources establish `choclo` as fresh or immature maize and often as a tender ear, but documented recipes and technical descriptions also use the term for its detached or ground green kernels. They do not establish one cultivar or a stable one-to-one English/fr-CA catalog name. Use the existing corn-on-the-cob identity when the ingredient is explicitly an intact ear, and corn kernels when explicitly detached whole kernels are the input. Keep unqualified, ground, or grated `choclo` unresolved unless the source and preparation identify the ingredient state.
- **Scope:** reconciles the open row in `wp06-south-american-cuisine-gap-sweep-20261009.md` and the earlier review `wp06-choclo-corn-boundary-review-20261009.md`. This packet does not edit either document, the live catalog, ledger, recipes, forms, tests, plan, roadmap, or generated files.

## Resolution

| Source wording and preparation context | Recommended catalog treatment | English / fr-CA wording | Limit |
|---|---|---|---|
| `choclo` is explicitly an intact tender ear, including ears counted as the ingredient and then stripped of kernels during the recipe | Map to existing `ingredient-ref-corn-on-the-cob` when the intact ear is the measured/supplied input; keep kernel removal or other preparation in recipe instructions | Existing `corn on the cob` / `maïs en épis`; OQLF's preferred ear term is `épi de maïs`, translated as `corn-cob` | Describes the physical input ear. It does not make `choclo` a global alias or imply that the finished dish serves a cob intact. |
| Explicit detached whole kernels, such as `granos de choclo` or a source that says kernels are already removed | Map to existing `ingredient-ref-corn-kernels` when whole kernels are the ingredient input | `corn kernels` / OQLF `maïs en grains` (`kernel corn`) | The source must establish kernels as the supplied ingredient. Cooking them does not by itself establish a catalog form. |
| Green kernels are explicitly grated, milled, blended, or ground as the ingredient product, without the intact ear being the measured input | Keep the source preparation explicit; do not force a match to the whole-ear or whole-kernel row | Describe the operation from the source; retain `choclo` as a quoted/source term if needed, with a short gloss | No live form represents ground/grated immature maize, and the sources give no common milling specification. |
| The source says only `choclo`, `choclos`, or a fresh/tender maize phrase without identifying the ingredient state | Defer pending context; do not link automatically to either corn row | Preserve `choclo` in source context. No single EN or fr-CA replacement is established for this unqualified use. | Do not infer a cob, kernels, sweet corn, or a variety. |

This resolves the earlier packet's product boundary without adding a new identity. The Chilean heritage source gives a regional definition of `choclo` as the tender maize ear and records recipes using whole fresh ears, kernels, and crushed maize. Peru's national agricultural-use booklet ties `choclo` to immature green/fresh maize grain and records many varieties and whole, ground, and grated uses. Argentina's INTA separates fresh-use `choclo` into Andean amylaceous/dentate and sweet/extra-sweet types. Together these sources show a real maturity and culinary-use class but not a single cultivar, product presentation, or settled catalog referent. [WP06-CHOCLO-RESOLUTION-20261009-S01–S03]

The Peru Travel recipe independently illustrates a source-scoped kernel use: it specifies boiled `granos de choclo` as a cup measure and serves them as accompaniment. The Argentine government recipe collection, by contrast, counts `choclos` and then removes kernels from their husked ears before blending or grating. These recipe contexts support conditional resolution by ingredient state; they do not establish a general ear-to-kernel conversion. [WP06-CHOCLO-RESOLUTION-20261009-S05–S06]

## Identity, variety, and alias boundary

- The reviewed sources identify maize as *Zea mays*. They do not define `choclo` as a separate botanical species or one named cultivar. Peru INIA explicitly records the green/fresh use across multiple named varieties. Argentina INTA says its fresh-consumption `choclo` includes both Andean amylaceous/dentate and sweet/extra-sweet types. Do not create a variety-level row, and do not equate bare `choclo` with sweet corn. [WP06-CHOCLO-RESOLUTION-20261009-S01–S04]
- `Choclo` is a source-language term. Do not add `choclo`, `choclos`, `maíz choclo`, `choclo tierno`, `choclo fresco`, or `choclo dulce` as unconditional EN or fr-CA aliases to either existing corn reference. The named `choclo dulce` in the Chilean agricultural story refers to a particular sweet, tender product; it cannot support replacing regional `choclo` generally with `sweet corn` / `maïs doux`. [WP06-CHOCLO-RESOLUTION-20261009-S04]
- For explicit ears, use the existing display wording `corn on the cob` / `maïs en épis`; OQLF records preferred `épi de maïs` and English `corn-cob`. For explicit loose kernels, use `corn kernels`; OQLF gives `maïs en grains` / `kernel corn`. These are presentation-specific Québec terminology controls, not translations of bare `choclo`, and no display or alias change is proposed. [WP06-CHOCLO-RESOLUTION-20261009-S07–S08]
- `Tender maize`, `immature maize`, `maïs tendre`, and `maïs immature` may serve as explanatory glosses where useful, but the reviewed Québec terminology records do not establish them as preferred catalog equivalents for `choclo`. `Fresh corn` / `maïs frais` alone also fails to specify whether the ingredient is an ear or detached kernels. Keep any such wording source-scoped and out of the alias arrays.
- Do not add a `fresh`, `tender`, `boiled`, `grated`, `ground`, or `blended` corn form in this proposal. The evidence distinguishes maturity, physical presentation, and recipe preparation but does not settle the catalog boundary for a form or establish a shared processing specification. No density, household measure, unit mapping, yield, substitution, or ear-to-kernel conversion is proposed.

## Exact collision and recipe audit

The live-package audit was rerun on 2026-10-09. It replicated `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ`/`æ`/`ß`, expand `&` to `and`, remove combining marks, map remaining non-ASCII-alphanumeric runs to spaces, and collapse whitespace. It checked exact normalized-key equality and whole-token phrase matching across active reference names/aliases, form labels/match terms, and legacy candidate names/aliases. The recipe scan checked every string field in each recipe file and every string field of all ingredient rows. `Oca`-like substring matches are not counted; phrases must match full normalized words.

The audit query set contains **49 source, product, translation, and rejected-equivalence phrases and 48 distinct normalized keys** (`maíz tierno` and `maiz tierno` normalize to one key): `choclo`, `choclos`, `choclo tierno`, `choclo fresco`, `choclo dulce`, `maíz choclo`, `maíz en choclo`, `mazorca de choclo`, `choclo en mazorca`, `choclo en grano`, `choclo desgranado`, `granos de choclo`, `grano de choclo`, `granos del choclo`, `grano del choclo`, `choclo pelado`, `choclo sancochado`, `maíz choclo fresco`, `maíz amiláceo choclo`, `maíz fresco`, `maíz verde`, `maíz tierno`, `maiz tierno`, `maíz dulce`, `sweet corn`, `maïs doux`, `mazorca tierna de maíz`, `mazorca tierna`, `mazorca de maíz`, `grano verde`, `maíz para consumo fresco`, `fresh choclo`, `choclo corn`, `tender corn`, `fresh maize`, `fresh corn`, `fresh corn kernels`, `immature maize`, `immature corn`, `maíz fresco en grano`, `maíz tierno en grano`, `maïs choclo`, `épi de choclo`, `grains de choclo`, `maïs frais`, `maïs tendre`, `maïs en grains frais`, `grains de maïs frais`, and `épi de maïs frais`. The `sweet corn` / `maïs doux` phrases were included as rejected broad-equivalence controls.

| Live surface | Scanned | Exact normalized-key owners | Whole-phrase owners / hits |
|---|---:|---:|---:|
| Active ingredient references | 487 references | 0 | 0 |
| Ingredient forms | 18 forms | 0 | 0 |
| Legacy import candidates | 99 candidates | 0 | 0 |
| Recipe ingredient rows | 1,123 rows across 114 files | — | 0 matching rows |
| Recipe file text | 114 files | — | 0 matching files |

The existing rows are useful physical-state controls and are not candidate-name collisions:

| Existing reference | Current EN / fr display | Current forms | Recipe link on this snapshot |
|---|---|---|---|
| `ingredient-ref-corn-on-the-cob` | `corn on the cob` / `maïs en épis` | None | 1 row: recipe 044, ingredient 7, `2 ears corn on the cob` |
| `ingredient-ref-corn-kernels` | `corn kernels` / `maïs` | None | 1 row: recipe 078, ingredient 15, `1/2 cup frozen corn kernels` |

No candidate phrase occurs in the current recipe corpus. The 18 forms include no corn form. The two control recipe rows show that the live catalog and corpus already distinguish whole ears from kernels, but do not model tender/fresh maturity or ground green maize. No recipe relink is proposed.

| Live artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 487 references | 152,843 | `de40604fe47b36f504b59febe5f6473dcbae59818e0a9c289764954688d8db48` |
| `ingredient-forms.v1.json` | 18 forms | 11,851 | `ee299dbe8f4a2349a16c495b37ac6ee4830a128fdceffd91f3bf2001f1e10617` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 99 candidates | 23,450 | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | 749,713 aggregate bytes | `8198a3f1da906817b464ecd7cbcdc7b5e4f2a6de5cb9fef80b7174a9c7277ff3` |

The recipe-corpus digest hashes each manifest-relative path, a NUL byte, the exact recipe-file bytes, and a NUL byte, in manifest order. These values identify only the scanned live snapshot.

## Source register

Sources were accessed on 2026-10-09. The unique, proposal-local source-ID prefix for this resolution is `WP06-CHOCLO-RESOLUTION-20261009-S`; it is distinct from the earlier `WP06-CHOCLO-CORN-20261009-S` prefix and has not been added to the shared research ledger. Claims below are limited to the cited source and stated context.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP06-CHOCLO-RESOLUTION-20261009-S01** | Centro de Documentación de Bienes Patrimoniales, Servicio Nacional del Patrimonio Cultural (Chile), [“Los ingredientes de la cocina chilena tradicional”](https://www.cdbp.gob.cl/noticias/los-ingredientes-de-la-cocina-chilena-tradicional), 2024-09-27, passages on choclo, porotos granados, and humitas. | Defines choclo as the tender maize ear used in much of South America; identifies maize as *Zea mays*; describes `granos de choclo`, crushed maize, and fresh choclos ground for humitas. A Chilean heritage explainer, not a complete pan-South-American market standard. |
| **WP06-CHOCLO-RESOLUTION-20261009-S02** | Instituto Nacional de Innovación Agraria (Peru), *Utilización tradicional del maíz en las comunidades del Perú* (2008), section “Formas de consumo del grano,” [repository record](https://repositorio.inia.gob.pe/items/88ee183c-e723-40c9-b3c2-af7a81714976), [PDF](https://repositorio.inia.gob.pe/server/api/core/bitstreams/8e055e96-b36e-4cd1-942b-2e8d127f727e/content). | Separates green/fresh immature grain from dry/mature grain; describes choclo as green grain of a boiled ear, records many varieties, and separately documents whole green kernels and ground/grated kernels. It documents Peruvian use, not a universal definition. |
| **WP06-CHOCLO-RESOLUTION-20261009-S03** | Instituto Nacional de Tecnología Agropecuaria (Argentina), [*El cultivo del maíz*](https://repositorio.inta.gob.ar/bitstream/handle/20.500.12123/23588/INTA_CIAP_InstitutodeInvestigaci%C3%B3nAnimaldelChacoSemi%C3%A1rido_Ger%C3%B3nimo_G%C3%B3mez_L_El_cultivo_del_ma%C3%ADz.pdf?isAllowed=y&sequence=2), p. 2, “¿Qué maíz conviene sembrar?”. | Treats choclo as fresh-consumption maize and distinguishes Andean amylaceous/dentate from sweet/extra-sweet types, with different cooking behavior. Regional crop guidance, not a universal consumer vocabulary. |
| **WP06-CHOCLO-RESOLUTION-20261009-S04** | Instituto de Desarrollo Agropecuario (Chile), [“Estrella Pérez y Francisco Cárcamo llevan más de ocho años produciendo choclos dulces en la Patagonia”](https://www.indap.gob.cl/noticias/estrella-perez-y-francisco-carcamo-llevan-mas-de-ocho-anos-produciendo-choclos-dulces-en), 2024-08-05. | Calls a specific sweet, tender product `choclo dulce` / `maíz tierno` and reports fresh, boiled, roasted, and salad use. Evidence for this producer's product, not all choclo. |
| **WP06-CHOCLO-RESOLUTION-20261009-S05** | Programa Nacional Primeros Años, Secretaría Nacional de Niñez, Adolescencia y Familia (Argentina), [*Recetario: Recetas del Noreste argentino — NEA*](https://www.argentina.gob.ar/sites/default/files/2020/09/pnpa_-_2021_-_recetario_nea.pdf) (2021), Corrientes “Mutuka” and Formosa “Chipa guazú.” | Counts choclo by ears, then grates/blends its kernels or removes kernels from husked ears and blends them. Family-recipe evidence for preparation and ingredient state, not a product standard. |
| **WP06-CHOCLO-RESOLUTION-20261009-S06** | Perú Travel, [“Papa a la Huancaína”](https://www.peru.travel/gastronomia/es/recetas/entradas/papa-a-la-huancaina.html), ingredient list and service instruction. | Specifies boiled `granos de choclo` by volume and serves them alongside the dish. One tourism recipe; it demonstrates an explicit kernel use, not a general meaning of choclo. |
| **WP06-CHOCLO-RESOLUTION-20261009-S07** | Office québécois de la langue française, [*épi de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10437655/epi-de-mais), Grand dictionnaire terminologique. | Gives preferred fr-CA `épi de maïs` and English `corn-cob`. Terminology evidence for an ear only. |
| **WP06-CHOCLO-RESOLUTION-20261009-S08** | Office québécois de la langue française, [*maïs en grains*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18057878/mais-en-grains), Grand dictionnaire terminologique. | Gives preferred fr-CA `maïs en grains` and English `kernel corn`; notes sweet maize can be sold in kernels. Terminology evidence for kernels only, not a synonym for bare choclo. |

## Remaining limit

The evidence resolves the open question to **a source-scoped product/use class, not a new globally named catalog identity**. It supports conditional use of the two existing physical-state identities when the ingredient state is explicit. It does not establish one universal ear/kernel boundary for bare `choclo`, an accepted fr-CA equivalent for that bare source term, or a standard form for ground/grated green maize. Keep those cases deferred until the recipe or product source identifies the actual input and terminology.

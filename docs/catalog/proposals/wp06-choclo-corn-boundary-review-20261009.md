# WP06 South American choclo and corn boundary review

- **Reviewed:** 2026-10-09
- **Status:** coordinator resolution recorded at `../batches/wp06-choclo-boundary-resolution-20261009/README.md`; bare `choclo` remains unresolved, with conditional handling only when the supplied input state is explicit. No catalog or ledger changes were made.
- **Recommendation:** **defer bare `choclo` as unresolved.** South American sources support fresh, immature maize as a food-use class, but `choclo` names different physical presentations in trade specifications and recipes: an intact ear, detached kernels, or kernels to be removed and processed. The sources do not establish one variety or one unambiguous English/fr-CA ingredient identity. Do not add a new identity or a global alias for `choclo`.
- **Scope:** regional product and culinary use, English and fr-CA wording, aliases and product boundaries, and exact normalized catalog/form/legacy/recipe audit.

## Decision and conditional mapping

| Source context | Safe catalog handling | English / fr-CA wording | Boundary |
|---|---|---|---|
| An intact fresh ear is specified or counted as an ear, e.g. a dozen `choclos`, before kernels are removed | Use existing `ingredient-ref-corn-on-the-cob` only if that is the recipe's ingredient state | `corn on the cob` / current display `maïs en épis`; OQLF's preferred term is `épi de maïs` | This maps the physical ear, not every use of `choclo`. |
| Detached whole kernels are explicitly specified as `granos de choclo` or equivalent | Use existing `ingredient-ref-corn-kernels` only if kernels are the ingredient supplied | `corn kernels` / current display `maïs`; OQLF gives `kernel corn` / `maïs en grains` | Do not add `choclo` or `granos de choclo` as an unconditional alias. |
| The source says only `choclo`, or only establishes tender/fresh maize without saying whether the ingredient is an ear or kernels | Leave unresolved pending recipe/product context | No single EN or fr-CA replacement established | Do not guess `corn on the cob`, `corn kernels`, or `sweet corn`. |
| Recipe method grates, cuts, or blends kernels from an ear | Keep the starting ingredient and preparation explicit in the recipe | Translate from the physical ingredient and method | This use does not establish a new universally named form or a fixed ear-to-kernel conversion. |

The sources distinguish maize harvested green/immature for fresh consumption from dry, mature grain. They also show more than one type of maize used as `choclo`: Argentine INTA describes fresh-consumption Andean amylaceous/dentate maize as well as sweet and extra-sweet types; Chilean INDAP uses `choclo dulce` for a particular tender, sweet product. This supports a fresh-use maturity class, but not one botanical variety or a universal equation of `choclo` with `sweet corn`. The evidence is not enough to establish a new catalog identity with one stable English/fr-CA product name and a single physical scope. [WP06-CHOCLO-CORN-20261009-S01–S06]

`Choclo` is a Spanish source term and should not be placed in the catalog's EN or FR alias arrays. Do not use `maïs doux` / `sweet corn` as a global translation: the reviewed regional technical source includes both amylaceous/dentate and sweet types. `Fresh corn` / `maïs frais` describes the maturity context more closely but still leaves the ear-versus-kernel presentation unstated. Use the source's physical form when known, and preserve the source wording in recipe context when it is not.

## Food-use and product evidence

| Region and source evidence | What it establishes | Limits |
|---|---|---|
| **Peru:** INIA's traditional-use booklet separates green/fresh immature grain from dry/mature grain. It describes `choclo` as green grain from a boiled ear and records use across many local maize varieties. It separately describes whole green kernels in salad and green kernels ground or grated for pastel de choclo. [S01] | `Choclo` is tied to immature/fresh maize, while the prepared food may be kernels on or removed from the ear, and may be ground or grated. It is not one named cultivar. | A technical overview of recorded Peruvian practices; it does not define all South American or retail uses. |
| **Peru:** A SEACE procurement specification sells `choclo` by the unit and defines it as *Zea mays L. amilácea* in an immature/tender state for direct human consumption. The specification evaluates the `mazorca` (ear), including freshness, husk, and tender kernels. [S02] | In this commercial specification, the commodity is a whole ear with attached tender kernels, not a loose-kernel product. | A specific Peruvian amylaceous-maize purchasing specification and grade; it does not define all uses of the word or all cultivars. |
| **Northeast Argentina:** The national `Recetario NEA` lists a dozen `choclo` for Corrientes' `Mutuka`; the directions grate or blend its kernels. A Formosa chipa guazú recipe lists six `choclos` and cuts the kernels from the ears. [S03] | Recipe quantities use `choclo` for whole ears that are later processed into kernels. | A public recipe collection of local family recipes, not a product standard. |
| **Buenos Aires:** A city-government recipe gives “a handful of `granos de choclo` (or half a `choclo`).” [S04] | In this recipe, detached kernels and a portion of an ear are alternative ingredient measures, demonstrating that context controls the physical referent. | One local recipe's substitution; it supplies no general conversion ratio or identity rule. |
| **Argentina:** INTA classifies maize for fresh consumption as `choclo` and lists Andean amylaceous/dentate and sweet/extra-sweet types. The source says Andean types are more suited to regional cooking than sweet types for some preparations. [S05] | `Choclo` is a fresh-use class that can cover different maize types, not a specific sweet-corn variety. | Regional agricultural guidance, not a universal botanical or market taxonomy. |
| **Chile:** INDAP reports a specific `choclo dulce`, also called `maíz tierno`, with tender, sweet kernels and fresh, boiled, roasted, and salad uses. [S06] | `Choclo` can denote sweet/tender maize in this particular Chilean production context. | A story about one producer's sweet product; it cannot be generalized to all regional `choclo`. |

Taken together, the sources establish fresh/immature maize food use and an ear-to-kernel relationship, but not a single ingredient row for every occurrence of `choclo`. They establish no cultivar-level identity that would justify a variety-specific row. They also give no general density, household measure, unit mapping, conversion, yield, substitution, or recipe quantity for the candidate. Leave these unmodeled.

## English and Québec French terms; alias boundaries

- For an explicitly intact ear, the live catalog already names `corn on the cob / maïs en épis`. OQLF's terminology record prefers `épi de maïs` and gives English `corn-cob`. This is terminology support for the physical ear only. [WP06-CHOCLO-CORN-20261009-S07]
- For explicitly detached kernels, the live row is `corn kernels / maïs`. OQLF records `maïs en grains` and English `kernel corn`, and notes that sweet maize is also sold in kernels. The OQLF term is useful fr-CA wording for that explicit physical presentation; it does not show that bare `choclo` always means kernels. No alias or display change is proposed here. [WP06-CHOCLO-CORN-20261009-S08]
- Do not assign `choclo`, `choclos`, `maíz choclo`, `choclo tierno`, or `choclo fresco` as an English or French alias. Do not assign `sweet corn` / `maïs doux` globally; the INTA source documents non-sweet fresh-use maize as well. Do not add `fresh corn` / `maïs frais` as aliases for either existing row, since those terms do not specify whether the ingredient is an ear or detached kernels.
- Fresh, boiled, roasted, grated, or blended are preparation and maturity contexts in the consulted recipes. No corn form is currently defined in the package, and this review does not propose a new form or imply a measured conversion between ear and kernel presentations.

## Exact catalog and recipe audit

The audit replicated the app's `normalizeIngredientSearchKey`: lowercase with `Locale.ROOT`, apply Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace non-alphanumeric characters with spaces, then trim and collapse whitespace. It checked whole normalized word phrases in active reference names and aliases, form labels and match terms, legacy candidate fields, every recipe ingredient-row string field, and every recipe string field. The candidate set below has 35 source/product/translation phrases and 34 distinct normalized keys (`maíz tierno` and `maiz tierno` normalize identically).

| Candidate phrase set | Active reference owners | Form owners | Legacy owners | Recipe ingredient rows with a hit | Recipe files with any hit |
|---|---:|---:|---:|---:|---:|
| `choclo`, `choclos`, `choclo tierno`, `choclo fresco`, `maíz choclo`, `maíz en choclo`, `mazorca de choclo`, `choclo en mazorca`, `choclo en grano`, `choclo desgranado`, `granos de choclo`, `grano de choclo`, `choclo pelado`, `choclo sancochado`, `maíz choclo fresco`, `maíz amiláceo choclo`, `maíz fresco`, `maíz verde`, `maíz tierno`, `maiz tierno`, `fresh choclo`, `choclo corn`, `tender corn`, `fresh maize`, `fresh corn kernels`, `immature maize`, `immature corn`, `maïs choclo`, `épi de choclo`, `grains de choclo`, `maïs frais`, `maïs tendre`, `maïs en grains frais`, `grains de maïs frais`, `épi de maïs frais` | 0 | 0 | 0 | 0 / 1,123 | 0 / 114 |

All 480 active references, 17 forms, 99 legacy candidates, 114 manifest-listed recipes, and 1,123 recipe ingredient rows were scanned. There is no corn-related form in the forms file. No candidate phrase has an exact normalized owner or whole-phrase hit in the names, aliases, form labels/match terms, or legacy candidates, and no phrase occurs in recipe ingredient rows or other recipe text.

The relevant existing rows are separate controls rather than candidate collisions:

| Existing ID | Current bilingual display | Other package data | Current recipe links |
|---|---|---|---|
| `ingredient-ref-corn-on-the-cob` | `corn on the cob / maïs en épis` | No aliases; null density; no unit mappings | 1 row: `recipes/044-pis-de-mais-corn-on-the-cob-e9dfacc1-69f7-47cf-9f4e-c5c79508162f.v1.json`, ingredient row 7, `2 ears corn on the cob` |
| `ingredient-ref-corn-kernels` | `corn kernels / maïs` | No aliases; null density; no unit mappings | 1 row: `recipes/078-pate-chinois-shepherd-s-pie-d356eec5-b3c4-4e22-b943-63900317e569.v1.json`, ingredient row 15, `1/2 cup frozen corn kernels` |

The exact French display `maïs` belongs to `ingredient-ref-corn-kernels`. The OQLF control phrases `épi de maïs` / `corn-cob` and `maïs en grains` / `kernel corn` distinguish the two physical presentations, but are not currently aliases in the live references. The corpus contains no `choclo` hit and requires no link changes on this snapshot.

| Live artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 480 references | `640e66a6172020ace27f10ba267dbc8fbad467be73a51a517c7cb64e42077459` |
| `ingredient-forms.v1.json` | 17 forms | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fce8f2d15` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `8198a3f1da906817b464ecd7cbcdc7b5e4f2a6de5cb9fef80b7174a9c7277ff3` |

The recipe corpus digest hashes each manifest-relative path, a NUL byte, exact file bytes, and a NUL byte in manifest order. The source-ID prefix `WP06-CHOCLO-CORN-20261009-S` and possible candidate ID `ingredient-ref-choclo` were searched repository-wide before drafting and had no prior matches. Proposal source IDs below are unique to this file and have not been added to the shared ledger.

## Source register

Sources were accessed on 2026-10-09. Claims are limited to the cited passage and evidence limits in each row.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP06-CHOCLO-CORN-20261009-S01** | Instituto Nacional de Innovación Agraria (Peru), *Utilización tradicional del maíz en las comunidades del Perú* (2008), section “Formas de consumo del grano,” [repository record](https://repositorio.inia.gob.pe/items/88ee183c-e723-40c9-b3c2-af7a81714976), [PDF](https://repositorio.inia.gob.pe/server/api/core/bitstreams/8e055e96-b36e-4cd1-942b-2e8d127f727e/content). | Distinguishes green/fresh immature grain from dry/mature grain; describes choclo and records whole, ground, and grated green-kernel preparations across named varieties and localities. A regional technical overview, not a universal definition. |
| **WP06-CHOCLO-CORN-20261009-S02** | Sistema Electrónico de Contrataciones del Estado (Peru), [“Ficha técnica aprobada: Choclo categoría extra o primera”](https://prod4.seace.gob.pe/documentos/documentos/FichaSubInv/475441330rad7DD92.pdf), pp. 1–2, product definition and ear requirements. | Defines the specified good as tender/immature *Zea mays* L. amilácea for direct human consumption; unit measure and quality conditions describe the whole ear and attached kernels. It is a specific grade and maize type, not a universal semantic rule for choclo. |
| **WP06-CHOCLO-CORN-20261009-S03** | Programa Nacional Primeros Años, Argentina, [*Recetario: Recetas del Noreste argentino (NEA)*](https://www.argentina.gob.ar/sites/default/files/2020/09/pnpa_-_2021_-_recetario_nea.pdf) (2021), Corrientes “Mutuka (Torta de choclo)” and Formosa “Chipa guazú” recipe entries. | Lists choclo by ear-count and then grates/blends or cuts kernels from the ears. A public family-recipe collection; not a commodity standard or conversion guide. |
| **WP06-CHOCLO-CORN-20261009-S04** | Gobierno de la Ciudad Autónoma de Buenos Aires, [“¡Celebrá el 9 de Julio cocinando en familia con Experimento Cocina!”](https://buenosaires.gob.ar/gcaba_historico/noticias/celebra-el-9-de-julio-cocinando-en-familia-con-experimento-cocina), Carbonara ingredient list. | Lists one handful of `granos de choclo` or half a `choclo`. Shows contextual presentation alternatives in this recipe only; no general measure conversion follows. |
| **WP06-CHOCLO-CORN-20261009-S05** | Instituto Nacional de Tecnología Agropecuaria (Argentina), [*El cultivo del maíz*](https://repositorio.inta.gob.ar/bitstream/handle/20.500.12123/23588/INTA_CIAP_InstitutodeInvestigaci%C3%B3nAnimaldelChacoSemi%C3%A1rido_Ger%C3%B3nimo_G%C3%B3mez_L_El_cultivo_del_ma%C3%ADz.pdf?isAllowed=y&sequence=2), section “¿Qué maíz conviene sembrar?” (p. 2). | Describes fresh-consumption maize as choclo and distinguishes Andean amylaceous/dentate types from sweet/extra-sweet types. Agricultural guidance for a regional context; not a standard naming every South American maize. |
| **WP06-CHOCLO-CORN-20261009-S06** | Instituto de Desarrollo Agropecuario (Chile), [“Estrella Pérez y Francisco Cárcamo llevan más de ocho años produciendo choclos dulces en la Patagonia”](https://www.indap.gob.cl/noticias/estrella-perez-y-francisco-carcamo-llevan-mas-de-ocho-anos-produciendo-choclos-dulces-en), 2024-08-05. | Describes this producer's sweet choclo as `maíz tierno`, with fresh, boiled, roasted, and salad uses. Supports one sweet tender product; does not define all choclo. |
| **WP06-CHOCLO-CORN-20261009-S07** | Office québécois de la langue française, [*épi de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10437655/epi-de-mais), terminology record. | Gives preferred French `épi de maïs` and English `corn-cob` for the ear. Terminology evidence for the intact ear, not for bare choclo. |
| **WP06-CHOCLO-CORN-20261009-S08** | Office québécois de la langue française, [*maïs en grains*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18057878/mais-en-grains), terminology record and note. | Gives preferred French `maïs en grains` and English `kernel corn`; notes sweet maize is sold in kernels, canned or natural. Terminology evidence for kernel presentation; it does not establish a choclo synonym. |

## Remaining limit

The source record supports explicit mapping by physical presentation, not a single global mapping for `choclo`. A future identity for fresh/immature maize would require a clearly bounded product definition and confirmed EN/fr-CA name, with ear and kernel presentations modeled explicitly if needed. This review establishes neither a variety-specific identity nor that product boundary; keep bare `choclo`, its aliases, and any such fresh-corn identity deferred.

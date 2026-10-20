# WP06 Peruvian queso fresco serrano boundary review

- **Reviewed:** 2026-10-09
- **Status:** Integrated as `ingredient-ref-queso-fresco-serrano`; coordinator evidence and verification are recorded in [`docs/catalog/batches/wp06-queso-fresco-serrano-identity-20261009/README.md`](../batches/wp06-queso-fresco-serrano-identity-20261009/README.md). The 481-reference scan below is the pre-integration snapshot.
- **Recommendation:** **accept a separate, source-named `CHEESE` identity** for `queso fresco serrano`, with the Spanish name retained in both EN and fr-CA pending Québec review. Do not alias it to `cheese curds / fromage en grains`, `fromage frais`, or another cheese. Multiple Peruvian regional culinary and product sources use the name, and a government procurement schedule assigns it a separate item code from `queso fresco de vaca`. The evidence supports a narrowly source-named product identity, not a single composition or process specification.
- **Scope:** Peruvian name and culinary/product context, fresh-cheese boundary, English and Québec French wording, comparison with active cheese identities and prior WP04 work, and exact catalog/form/legacy/recipe audit.

## Candidate disposition

| Proposed ID | Decision and category | English display | Proposed fr-CA display | Alias and data decision |
|---|---|---|---|---|
| `ingredient-ref-queso-fresco-serrano` | **Accept**, `CHEESE`, as a source-named Peruvian regional product | `queso fresco serrano` | `queso fresco serrano` (retain the source name; Québec wording remains provisional) | No aliases. Keep `defaultDensity: null`, `unitMappings: []`; add no forms, yields, conversions, substitutions, or recipe links. |

This accepts the repeated product name as a distinct catalog identity while leaving its precise style open. The sources locate the name in Peruvian food and procurement contexts but do not establish that every product called `queso fresco serrano` has the same milk species, fat level, coagulation method, texture, moisture, salt content, or geographic origin. Do not translate it to `Andean cheese`, `fresh serrano cheese`, or `fromage frais serrano` as if any were a verified product name. Retain the Spanish source name in both locale fields until a Québec reviewer confirms a localized description.

The evidence is broader than one recipe: Peruvian sources name `queso fresco serrano` in a Huancaína recipe and in Cajamarca's caldo verde and Arequipa's chupe de camarones; PROMPERÚ identifies it as a local Canta product; and an official procurement schedule gives it its own item code. These sources support a source-named food identity, but they are not a denomination-of-origin or production standard. The exact product remains source-bounded and unqualified beyond its name. [WP06-QUESO-FRESCO-SERRANO-20261009-S03–S07]

## Product and culinary evidence

| Evidence | What it supports | Limits |
|---|---|---|
| Peru's DIGESA sanitary standard defines `queso fresco` as a coagulated product based on pasteurized milk, unaged, and ready for consumption soon after manufacture. The 2017 dairy regulation gives different fresh-cheese fat classes and a minimum moisture criterion. [S01–S02] | `Fresco` is a nonmatured cheese category in Peruvian regulation, rather than a synonym for a particular Canadian cheese. | These are general fresh-cheese rules, not a technical definition of the `serrano` modifier or proof that all regional products use one formula. No regulatory values are proposed for the catalog. |
| Perú Travel's `Papa a la Huancaína` recipe lists 200 g of `queso fresco serrano`, which is blended with sautéed onion, ají, milk, and oil into a smooth sauce. [S03] | Shows the source name and one specific recipe role. | One recipe does not establish a universal composition, texture, or substitute. |
| INEI's 2012 regional-food booklet lists 400 g grated `queso fresco serrano` in Cajamarca's caldo verde recipe; it adds part of the cheese to the soup and serves the rest with it. [S04] | Independent regional culinary use and a grated/cooked context. | Recipe evidence only; its one quantity is not a general measurement or conversion. |
| MINCETUR's tourism inventory for Arequipa's chupe de camarones describes `queso fresco serrano` wrapped in `suncho` and identifies the cheese as part of the local dish. [S05] | Arequipa culinary and presentation context, distinct from the Huancaína sauce recipe. | A regional tourism inventory's culinary description, not a manufacturing specification. |
| PROMPERÚ's Canta guide calls `queso fresco serrano` a local product and a symbol of Canta alongside wood-fired wheat bread. [S06] | Product-name use outside a single recipe and a specific Peruvian locality. | Tourism material; the site notes its travel content may draw on local business submissions and does not certify composition or quality. |
| A Peruvian government procurement schedule lists `QUESO FRESCO SERRANO` under item code `095400090051`, separately from `QUESO FRESCO DE VACA` under code `095400090011`. [S07] | Confirms a separately named procurement item. | Procurement coding does not explain the product difference or prescribe ingredients, process, or quality. It is not enough to add `queso fresco de vaca` as an alias or a product attribute. |

A product listing from one Jauja producer describes its own `queso fresco serrano` as made with pasteurized cow's milk and having a soft paste. This is useful only as a producer-specific example; it does not establish the species or texture for the wider source-named identity. No product-specific measurements, density, unit mapping, yield, or substitution are carried forward. [S10]

## English, fr-CA, and cheese boundaries

- **Retain `queso fresco serrano` in both locale fields.** Targeted OQLF and Canadian product searches did not locate a Québec French or English name for this specific Peruvian product. Keeping the source name avoids inventing a translation; the fr-CA display remains provisional pending Québec review.
- **Do not map it to `fromage frais`.** OQLF defines `fromage frais` as a soft, unaged, unfermented cheese, typically coagulated with lactic ferments. Peruvian regulation supports the unaged fresh-cheese category but the reviewed sources do not establish the candidate's fermentation method, texture, or water content needed to equate it with that narrower Québec terminology entry. OQLF lists `fromage frais` and `fromage blanc` as Québec French terms and also lists those terms in its English translation field; it does not give `queso fresco serrano` as a synonym. [S09]
- **Keep it separate from `cheese curds / fromage en grains`.** The active curd identity is grounded in the existing WP04 ledger record `WP04-S25`: OQLF defines the North American product as unaged, rubbery, generally cheddar-style cheese pieces. The Peruvian sources describe a named fresh cheese used grated, blended, crumbled, or wrapped for regional dishes; none documents the Québec curd texture or cheddar-style product. Shared nonaging alone is not an alias rule.
- **Keep it separate from `queso andino`.** INACAL's regional-cheese standard describes `queso andino` as a separately named product with a minimum 21-day maturation requirement. That evidence does not define `queso fresco serrano` and points away from using `queso andino` as a synonym. [S08]
- Do not add aliases `queso fresco`, `queso serrano`, `queso fresco de vaca`, `Andean fresh cheese`, `fresh serrano cheese`, `fromage frais`, or `fromage en grains`. Bare `queso fresco` is broader than the source-named candidate; `serrano` alone is not safely product-specific.

## Comparison with active catalog and WP04 work

The live catalog has eight active `CHEESE` references and no generic fresh-cheese identity. The relevant active product is `ingredient-ref-cheese-curds` (`cheese curds / fromage en grains`); its OQLF evidence is recorded as `WP04-S25`, and the WP04 workflow identifies cheese curds and skim milk as the two integrated WP04 dairy identities. No other reviewed WP04 proposal defines a Peruvian fresh-cheese crosswalk. Keep the candidate separate from curds and from all existing aged, named, or spreadable cheeses.

| Active identity | EN / fr-CA display | Recipe rows linked |
|---|---|---:|
| `ingredient-ref-cheddar-cheese` | `cheddar cheese / fromage cheddar` | 2 |
| `ingredient-ref-cheese-curds` | `cheese curds / fromage en grains` | 0 |
| `ingredient-ref-cream-cheese` | `cream cheese / fromage à la crème` | 3 |
| `ingredient-ref-gruyere` | `gruyere / gruyère` | 1 |
| `ingredient-ref-manchego-cheese` | `manchego cheese / fromage manchego` | 1 |
| `ingredient-ref-mascarpone` | `mascarpone / fromage mascarpone` | 1 |
| `ingredient-ref-mozzarella` | `mozzarella / mozzarella` | 1 |
| `ingredient-ref-parmesan-cheese` | `parmesan cheese / fromage parmesan` | 3 |

The forms file has no cheese forms. The active cheese rows have no density or unit mapping values; the candidate should likewise receive none. The only live row relevant to the Québec fresh-curd boundary has no recipe links, so the corpus shows no existing cheese-curd recipe being reclassified.

## Exact catalog and recipe audit

The audit reproduced the app's `normalizeIngredientSearchKey`: lowercase with `Locale.ROOT`, apply Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace non-alphanumeric runs with spaces, then trim and collapse whitespace. It checked whole normalized word phrases against reference names and aliases, form labels and match terms, all legacy-candidate fields, all recipe ingredient-row string fields, and all other recipe string fields. The 23 scanned candidate and adjacent-boundary phrases produced 23 distinct normalized keys.

| Candidate and boundary phrases scanned | Active reference owners | Form owners | Legacy owners | Recipe ingredient rows with a hit | Recipe files with any hit |
|---|---:|---:|---:|---:|---:|
| `queso fresco serrano`, `quesos frescos serranos`, `queso serrano`, `quesos serranos`, `queso serrano peruano`, `queso fresco andino`, `queso andino`, `queso fresco de la sierra`, `queso fresco de vaca`, `queso fresco`, `serrano cheese`, `fresh serrano cheese`, `Andean fresh cheese`, `fresh highland cheese`, `highland fresh cheese`, `fresh cheese from the Andes`, `fromage frais serrano`, `fromage frais andin`, `fromage frais des Andes`, `fromage frais des hautes terres`, `fromage frais des régions andines`, `fromage serrano`, `fromage frais` | 0 | 0 | 0 | 0 / 1,123 | 0 / 114 |

The pre-integration audit scanned 481 active references, 17 forms, 99 legacy candidates, 114 manifest-listed recipe files, and all 1,123 recipe ingredient rows. No candidate phrase has a normalized name/alias owner, form owner, or legacy owner. No candidate phrase occurs in recipe ingredient rows or other recipe text. The candidate ID `ingredient-ref-queso-fresco-serrano` was absent from the reference and legacy files at that snapshot. No recipe link change is indicated.

The boundary control terms `cheese curds` and `fromage en grains` each resolve only to the active `ingredient-ref-cheese-curds`; they are not candidate aliases. The other active cheese owners and recipe-link counts are listed above. The active row `ingredient-ref-cheese-curds` has empty aliases, null density, no unit mappings, no form, and no linked recipe row.

| Live artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 481 references | `0279b730ce312b11048fe93237f93558b116318e9fb231d6b93173b6dc9e7be8` |
| `ingredient-forms.v1.json` | 17 forms | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `8198a3f1da906817b464ecd7cbcdc7b5e4f2a6de5cb9fef80b7174a9c7277ff3` |

The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe file bytes, and a NUL byte in manifest order. The source-ID prefix `WP06-QUESO-FRESCO-SERRANO-20261009-S` and proposed ID `ingredient-ref-queso-fresco-serrano` were searched repository-wide before drafting and had no prior matches. Source IDs below are unique to this proposal; the existing WP04 source `WP04-S25` is cross-referenced without assigning it a duplicate ID.

## Source register

Sources were accessed on 2026-10-09. Claims are limited to the records and passages described below.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP06-QUESO-FRESCO-SERRANO-20261009-S01** | Ministerio de Salud / DIGESA, [NTS No. 192-MINSA/DIGESA-2022](https://www.digesa.minsa.gob.pe/NormasLegales/Normas/RM_807-2022-MINSA.pdf), glossary definition 28, `Queso fresco`. | Defines fresh cheese as coagulated from pasteurized milk, unaged, and ready for consumption soon after manufacture, under the cited Peruvian technical standard. This is the broad category definition, not a specification for the serrano product. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S02** | Peru, [Decreto Supremo No. 007-2017-MINAGRI, Reglamento de la Leche y Productos Lácteos](https://www.digesa.minsa.gob.pe/NormasLegales/Normas/DS_7_2017-MINAGRI.pdf), Chapter VI, Articles 18–19. | Establishes technical and sanitary specifications for `queso fresco`; Article 18 has separate fat classes and moisture requirement. It does not identify `queso fresco serrano` or its exact composition. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S03** | Perú Travel, [“Papa a la Huancaína” recipe](https://www.peru.travel/gastronomia/es/recetas/entradas/papa-a-la-huancaina.html), ingredients and preparation. | Names 200 g `queso fresco serrano` and blends it with onion, ají, milk, and oil. One recipe only. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S04** | Instituto Nacional de Estadística e Informática (INEI), [*Perú: Consumo per cápita de los principales alimentos, 2008–2009*](https://www1.inei.gob.pe/media/MenuRecursivo/publicaciones_digitales/Est/Lib1028/Libro.pdf), published 2012, regional recipe section, Cajamarca `Caldo verde` (printed p. 94). | Lists 400 g grated `queso fresco serrano`, used in and served with the soup. National regional-food collection; recipe amount is not a general measurement. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S05** | Ministerio de Comercio Exterior y Turismo (MINCETUR), [“Chupe de camarones,” tourist-resource inventory record 12037](https://consultasenlinea.mincetur.gob.pe/fichaInventario/index.aspx?cod_Ficha=12037), Arequipa description. | Describes `queso fresco serrano` in the Arequipa dish and says it is wrapped in `suncho`. Regional culinary inventory, not a manufacturing standard. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S06** | PROMPERÚ, [“Visita Canta: aire puro, paisajes andinos y encanto natural cerca de Lima”](https://target2.promperu.gob.pe/blog-viajero/lima/visita-canta-aire-puro-paisajes-andinos-y-encanto-natural-cerca-de-lima), 2025-06-10, Canta gastronomy section. | Calls `queso fresco serrano` a local product and symbol of Canta. The site's notice says travel content may be based on information provided by tourism businesses; it is product-name/context evidence, not a composition specification. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S07** | Ministerio de Economía y Finanzas (Peru), [2025 multiyear needs schedule](https://cdn.www.gob.pe/uploads/document/file/7498957/6379439-cuadro-multianual-de-necesidades-2025.pdf), dairy items. | Lists `QUESO FRESCO SERRANO` as item `095400090051` and `QUESO FRESCO DE VACA` as item `095400090011`, both by kilogram. Procurement classification establishes separate item names only, not why their products differ. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S08** | Instituto Nacional de Calidad (INACAL), [“Queso andino: Inacal define requisitos de calidad para los quesos regionales”](https://www.gob.pe/institucion/inacal/noticias/1235459-queso-andino-inacal-define-requisitos-de-calidad-para-los-quesos-regionales), 2025-08-28, NTP 105.004:2024 summary. | Describes the separately named `queso andino` standard, including minimum 21-day maturation. Used to reject an alias with fresh cheese; it is not evidence about the serrano product itself. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S09** | Office québécois de la langue française, [*fromage frais*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532916/fromage-frais), definition and terminology. | Defines a soft, unaged, nonfermented cheese and notes lactic-ferment coagulation; lists `fromage frais` and `fromage blanc` as French terms. The reviewed Peruvian evidence does not establish equivalence to this product. |
| **WP06-QUESO-FRESCO-SERRANO-20261009-S10** | Grupo Horccap SAC, [“Queso fresco serrano” product listing](https://www.b2peru.pe/es/product/4854/queso-fresco-serrano), Jauja, Peru. | One producer listing says its product is made with pasteurized cow's milk and has a soft paste. Seller-provided product description; it is not generalized to all products bearing the source name. |

The active curd row's Québec terminology evidence is already held in the shared ledger as `WP04-S25` (OQLF, [*fromage en grains*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2093361/fromage-en-grains)); it defines the specific North American curd product and is cited here as prior WP04 work, not a new source record.

## Remaining limits

The proposal accepts a source-named Peruvian cheese identity without asserting that regional recipes or producers share one formula. English and Québec French retain the Spanish product name because no verified translation or Canadian market term was found. Confirm fr-CA wording with a Québec reviewer before integration; keep aliases, forms, measurements, conversions, yields, and substitutions empty until a source establishes them.

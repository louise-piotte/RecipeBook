# WP06 guascas culinary identity and botanical-boundary review

- **Reviewed:** 2026-10-09
- **Status:** integrated as `ingredient-ref-guascas`; see the coordinator batch at `../batches/wp06-guascas-identity-20261009/README.md`. The 484-reference audit snapshot below predates integration.
- **Recommendation:** **accept a distinct culinary identity named `guascas`, without assigning it to one botanical species.** The evidence supports a Colombian ajiaco seasoning identity and a stable source-name label, while authoritative Colombian sources apply the name to two currently accepted *Galinsoga* species.
- **Scope:** botanical/common-name evidence; Colombian food use; English and provisional fr-CA display; catalog, form, legacy, and recipe collision audit.

## Candidate identity

| Proposed ID | English display | Provisional fr-CA display | Category | Alias and limits |
|---|---|---|---|---|
| `ingredient-ref-guascas` | `guascas` | `guascas` | `HERB` | `guasca` as the source-attested singular form. Retain the Spanish culinary name in both locales rather than inventing a translation. Do not assign a species or add botanical/common plant aliases. Add no forms; keep `defaultDensity: null` and `unitMappings: []`; add no measurements, conversions, yields, substitutions, or recipe links. |

For EN, retain the source name `guascas` rather than asserting an English translation. `Guascas` remains provisional in fr-CA because this review did not find a Québec culinary term for the ingredient. Agriculture and Agri-Food Canada lists `small-flowered galinsoga` in English (Canada) and `galinsoga à petites fleurs` in French (Canada) for *G. parviflora*; those are botanical common names for one species, not a food-name crosswalk that covers the conflicting *G. quadriradiata* assignment. The Colombian sources support both `Guasca` and `Guascas` as culinary/common-name forms, so use singular `guasca` only as a narrow, source-backed alias. Do not add `Galinsoga`, either Latin species name, `albahaca silvestre`, `gallant soldier`, `quickweed`, `potato weed`, or the Canadian species names as ingredient aliases: the reviewed sources do not establish them as equivalent culinary labels across both botanical identifications.

## Botanical identity and food-use evidence

The strongest direct food-use source is the Jardín Botánico de Bogotá and Cabildo Indígena Muisca de Bosa publication *Memorias, cultivos y sabores* (2023). Its `Guascas` entry identifies *Galinsoga parviflora* Cav., describes its use to season ajiaco, and marks leaves, flowers, and stems as usable plant parts. The entry supports the food identity and one local botanical identification; it is a community-knowledge publication, not a universal product or taxonomic standard. [WP06-GUASCAS-20261009-S01]

A Colombian Ministry of Culture botanical monograph identifies *Galinsoga quadriradiata* R. y P. as popularly known as `guasca` and states that this is the same species used as a condiment to flavor potato ajiaco. The book concerns plant leaves used for wrapping foods and does not specify an ingredient-grade product or preparation. Its species attribution conflicts with the JBB/Cabildo source. [WP06-GUASCAS-20261009-S02]

The Jardín Botánico de Bogotá herbarium has a Bogotá specimen determined as *G. parviflora* with the vernacular label `Guasca`; its record links `Albahaca silvestre`, `Guasca`, and `Guascas` as common names. The JBB common-name platform specifically matches `Guascas` to *G. parviflora*. Separately, Kew’s Plants of the World Online currently treats both *G. parviflora* and *G. quadriradiata* as accepted species. Thus the discrepancy cannot be dismissed as a spelling variant or a synonym under the consulted taxonomy. [WP06-GUASCAS-20261009-S03–S05]

Portal Bogotá’s 2022 recipe from a winning Plaza Distrital de Mercado cook lists `Guascas` among the ajiaco ingredients but gives no species identification. This independently supports the source-name culinary use, not a general recipe specification. [WP06-GUASCAS-20261009-S06]

**Boundary:** accept the named Colombian seasoning herb at the culinary level, as `guascas`. Classify it as `HERB`, matching its documented leaf/flower/stem seasoning use and the active source-named seasoning herbs. Do not assert that every ingredient sold or used under this name is *G. parviflora* or *G. quadriradiata*. The reviewed evidence does not define whether the taxa are regional alternatives, a source-identification disagreement, or distinct ingredient products. It supports no transfer of fresh/dried states, leaf/stem ratios, handling rules, unit values, density, substitutions, or a recipe link.

## Neighboring active herb identities

These rows are useful category and collision controls, not proposed synonyms. The Colombian ajiaco recipe lists guascas separately from cilantro, while current catalog rows already keep regional herbs such as huacatay, epazote, jambu, and culantro distinct.

| Active reference | EN / fr-CA display | Category | Linked recipe rows | Boundary for guascas |
|---|---|---|---:|---|
| `ingredient-ref-cilantro` | `cilantro / coriandre fraîche` | `HERB` | 1 | The ajiaco source lists cilantro separately; do not alias guascas to cilantro or coriander. |
| `ingredient-ref-epazote` | `epazote / epazote` | `HERB` | 0 | Separate source-named herb; no common name or botanical equivalence. |
| `ingredient-ref-jambu` | `jambu / jambu` | `HERB` | 0 | Separate Amazonian herb; no common name or botanical equivalence. |
| `ingredient-ref-culantro` | `culantro / chicória-do-Pará` | `HERB` | 0 | Separate *Eryngium foetidum* identity; no alias to guascas. |
| `ingredient-ref-huacatay` | `huacatay / huacatay` | `VEGETABLE_AND_AROMATIC` | 0 | Separate Andean aromatic identity; the shared regional-herb role does not support a merge. |

`HERB` is the closest existing classification for guascas’ documented seasoning role. This category choice does not infer a species or a transferable culinary substitute.

## Exact catalog and recipe audit

The audit used the app’s `normalizeIngredientSearchKey` behavior: lowercase, Unicode NFKD, fold `œ/æ/ß` and `&`, remove combining marks, convert non-alphanumeric characters to spaces, and collapse whitespace. The current package snapshot is 484 ingredient references and 18 forms; the legacy-import file has 99 candidates. The current research ledger has 651 records, 940 source entries, and 826 distinct source IDs. The manifest lists 114 recipes containing 1,123 ingredient rows.

| Candidate phrase set | Active references | Forms | Legacy candidates | Recipe ingredient rows | All recipe text fields |
|---|---:|---:|---:|---:|---:|
| `guasca`, `guascas`, `Galinsoga`, `Galinsoga parviflora`, `Galinsoga quadriradiata`, `G. parviflora`, `G. quadriradiata`, `albahaca silvestre`, `wild basil`, `gallant soldier`, `gallant soldiers`, `quickweed`, `quick weed`, `potato weed`, `small-flower galinsoga`, `small-flowered galinsoga`, `ciliate galinsoga`, `galinsoga à petites fleurs`, `herbe guasca`, `herbe de guasca` (20 distinct normalized keys) | 0 exact/phrase owners | 0 exact/phrase owners | 0 exact/phrase owners | 0 of 1,123 hits | 0 of 114 recipes hits |

All 114 manifest-listed recipe files were parsed; each ingredient row was checked using its string fields, and all nested string fields in each recipe were checked. The candidate ID `ingredient-ref-guascas`, both locale labels, the alias `guasca`, and all eight proposed source IDs are absent from the current catalog/ledger. The original South American gap-sweep packet mentions guascas as an open ajiaco ingredient lead; it does not register an ingredient identity or the new source-ID prefix. No recipe needs relinking.

Snapshot SHA-256 values for reproducibility:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 484 references | `9f5f96bfc9c9e13b9347f2e1a410e05c75357384586b04bce45dbdc3ce3c0b23` |
| `ingredient-forms.v1.json` | 18 forms | `ee299dbe8f4a2349a16c495b37ac6ee4830a128fdceffd91f3bf2001f1e10617` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 651 records | `559954ed9afd499b2fd73e4d3cd9e5bcfcf0c14f0428f1fa043c8ad1626e7f51` |
| `legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Manifest-ordered recipe corpus | 114 files / 1,123 rows | `8198a3f1da906817b464ecd7cbcdc7b5e4f2a6de5cb9fef80b7174a9c7277ff3` |

The recipe-corpus digest was computed by hashing each manifest-relative recipe path, a NUL byte, the exact file bytes, and a NUL byte in manifest order. The prefix `WP06-GUASCAS-20261009-S` was searched across the repository and has no matches outside this proposal; IDs S01–S08 below are unique proposal references only and are not registered in the shared ledger.

## Source register

All pages were accessed 2026-10-09. The sources support only the claims and limits stated here.

| ID | Source and locator | Support and evidence limits |
|---|---|---|
| **WP06-GUASCAS-20261009-S01** | Cabildo Indígena Muisca de Bosa and Jardín Botánico de Bogotá José Celestino Mutis, [*Memorias, cultivos y sabores: (Agro)biodiversidad y agroecología desde los conocimientos ancestrales de la Comunidad Muisca de Bosa*](https://jbb.gov.co/documentos/publicaciones/Memorias_cultivos_y_sabores.pdf), 2023, entry `Guascas`. | Identifies *Galinsoga parviflora* Cav.; describes seasoning ajiaco; labels the food/condiment use and lists leaf, flower, and stem. Community-knowledge context; not a product specification or exhaustive taxonomic ruling. |
| **WP06-GUASCAS-20261009-S02** | Santiago Díaz Piedrahita, Ministerio de Cultura de Colombia, [*Las hojas de las plantas como envoltura de alimentos*](https://mng.mincultura.gov.co/Sitios/patrimonio/bibliotecas-de-cocinas/tomos/tomo12.pdf), Biblioteca Básica de Cocinas Tradicionales de Colombia, vol. 12, 2nd ed. (2012), Asteraceae section, entry *Galinsoga quadriradiata*. | Calls the species `guasca` and says it is used to season potato ajiaco. The book’s subject is plant leaves used as food wrapping; it does not define the market product, edible parts for this use, or handling. |
| **WP06-GUASCAS-20261009-S03** | Jardín Botánico de Bogotá, [Virtual Herbarium specimen 15082](https://herbario.jbb.gov.co/especimen/22268), determined 2016; collected in Bogotá on 2016-05-19. | Botanical specimen record for *G. parviflora* with vernacular label `Guasca`; the JBB platform also links `Guascas`. A specimen/name record, not culinary evidence. |
| **WP06-GUASCAS-20261009-S04** | Jardín Botánico de Bogotá, [Common Names of Bogotá Plants platform: *Galinsoga parviflora*](https://nombrescomunes.jbb.gov.co/site/combinacion?q=1078). | Lists `Guascas` for *G. parviflora* and cites local botanical and ethnobotanical sources. The related herbarium specimen records `Guasca`; this supports the singular/plural source-name variant but does not settle the conflicting *G. quadriradiata* assignment. |
| **WP06-GUASCAS-20261009-S05** | Royal Botanic Gardens, Kew, Plants of the World Online, [*Galinsoga parviflora*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:208554-1/general-information) and [*G. quadriradiata*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:208557-1). | Accepts both species; the *G. parviflora* record reports Colombian vernacular `guasca/guascas` and food use. Taxonomic/common-name reference; it does not identify the exact plant used in every ajiaco or support food-product aliases. |
| **WP06-GUASCAS-20261009-S06** | Ministerio de Relaciones Exteriores de Colombia, [*Catálogo Bibliográfico Recetas Colombia*](https://www.cancilleria.gov.co/libros/CatalogoBibliograficoRecetasColombia.pdf), Andean region, “Ajiaco Bogotano,” p. 44. | Lists a large bunch of guascas leaves, adds half during cooking, and adds the remainder five minutes before serving. This is one recipe’s ingredient and timing, not a general quantity or handling rule. |
| **WP06-GUASCAS-20261009-S07** | Portal Bogotá, [“Haz tu ajiaco navideño con la receta de Alby, cocinera en la plaza 20 de Julio”](https://bogota.gov.co/mi-ciudad/desarrollo-economico/como-hacer-un-ajiaco-en-navidad-receta-de-cocinera-del-20-de-julio), 2022-12-16, ingredient list. | A Bogotá market cook’s ajiaco lists `Guascas`; no species or product state is specified. One cook’s recipe is not a universal formula or botanical identification. |
| **WP06-GUASCAS-20261009-S08** | Agriculture and Agri-Food Canada, [GRIN-Global-CA: *Galinsoga parviflora* Cav.](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=104241), common-name fields. | Lists `small-flowered galinsoga` in English (Canada) and `galinsoga à petites fleurs` in French (Canada) for *G. parviflora*. These are botanical names for one species, not Québec food terminology or evidence that guascas always denotes that species. |

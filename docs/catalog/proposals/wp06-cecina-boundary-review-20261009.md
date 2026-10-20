# WP06 cecina boundary review — 2026-10-09

Status: Integrated as `ingredient-ref-peruvian-amazonian-cecina`; see the [coordinator identity batch](../batches/wp06-cecina-identity-20261009/README.md). The live-package scan below records the 480-reference pre-integration snapshot.

## Recommendation

**Accept one source-named, Peru-Amazon-qualified ingredient identity at the regional family level. Defer species-specific variants and process forms.** The reviewed Peruvian sources converge on cecina as a dried and smoked preserved-meat family used in Amazonian cooking, especially with tacacho. They also explicitly say that the meat species, seasonings, and smoking method vary across the Peruvian jungle. A family-level identity is therefore defensible; a single pork-only technical definition is not.

Proposed catalog row:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-peruvian-amazonian-cecina` |
| EN display | `Peruvian Amazon cecina (smoked, dried meat)` |
| fr-CA display | `cecina de l’Amazonie péruvienne (viande séchée et fumée)` |
| Category | `PROTEIN` |
| Aliases | none |

The source word `cecina` remains in both labels. The regional qualifier is part of the proposed catalog scope, not a protected geographic designation or a claim that every Amazonian preparation follows one standard. English and French descriptions in parentheses are explanatory label text, not aliases or exact quotations.

The stable scope supported here is: **Peruvian Amazonian dried-and-smoked preserved meat used as an ingredient in regional dishes.** Pork is the common contemporary tacacho pairing in the consulted culinary sources, but it must not be encoded as invariant because the regional source explicitly reports other meat species. Do not add forms, density, unit mappings, measurements, conversions, substitutions, package yields, or recipe links from this evidence. No current bundled recipe uses cecina.

## Boundary with integrated charqui

The active catalog already contains `ingredient-ref-charqui`, displayed as `charqui (dried salted camelid meat)` / `charqui (viande de camélidé séchée et salée)` in `PROTEIN`, with no aliases. Its integration is documented in the [charqui identity batch](../batches/wp06-charqui-identity-20261009/README.md) and the South American sweep’s existing source IDs `WP06-SOUTHAM-20261009-S50–S52`.

The cecina evidence describes an Amazonian family whose common preservation signal is smoking plus drying and whose animal species can vary. The cited Peruvian charqui specification instead scopes that product to salted, dried or dehydrated alpaca, llama, or hybrid camelid meat. Keep the identities separate by region and source definition; do not map `cecina` to `charqui`, `charque`, or `jerky`. OQLF’s broader language entry places charqui among dried meats and notes it may be smoked, so technique words alone do not establish synonymy. The proposed region-qualified label prevents this catalog entry from claiming to represent every product called cecina elsewhere.

## Evidence and limits

| Source ID | Source and locator | What it supports / limit |
| --- | --- | --- |
| `WP06-CECINA-20261009-S01` | CONCYTEC, [“La ciencia de cocinar”](https://clubescyt.concytec.gob.pe/ciencia-cocina/ciencia-de-cocinar), “La cecina,” no publication date shown. | Directly describes selva cecina as dried and smoked meat traditionally used to preserve meat, and says Peruvian jungle varieties differ by animal species, seasonings, and smoking method. This is a government science-education resource, not a technical specification. |
| `WP06-CECINA-20261009-S02` | PROMPERÚ / Peru Travel, [“¡Deliciosos! Estos son los mejores potajes de la Amazonía peruana”](https://www.peru.travel/es/inspirate/estos-son-los-mejores-potajes-de-la-amazonia-peruana), 2020-07-06, “Tacacho con cecina.” | Describes cecina as traditionally smoked Amazonian meat and places it in tacacho. It does not specify the animal species. The page is tourism promotion rather than a product standard. |
| `WP06-CECINA-20261009-S03` | PROMPERÚ / Peru Travel, [“Amazonian Cuisine”](https://www.peru.travel/gastronomy/en/peruvian-cuisine/amazonian-cuisine.html), regional overview, no publication date shown. | Describes tacacho as often served with pork cracklings or dried pork. Useful English culinary context, but the sentence does not explicitly define cecina or establish a single cecina species. |
| `WP06-CECINA-20261009-S04` | PROMPERÚ / Peru Travel, [“Cuisine de l’Amazonie”](https://www.peru.travel/gastronomie/fr/cuisine-peruvienne/cuisine-de-l-amazonie.html), French regional overview, no publication date shown. | Retains `cecina` and glosses it as `viande séchée` with tacacho. This supports retaining the source name in fr-CA; the generic gloss is not a cecina-specific alias. |
| `WP06-CECINA-20261009-S05` | PROMPERÚ / Peru Travel, [“Peru conquers Canada and awakens the world: a destination that has it all”](https://www.peru.travel/news/peru-conquers-canada-and-awakens-the-world-a-destination-that-has-it-all), 2025-06-18, Iquitos food section. | For an English-speaking Canadian audience, describes Iquitos “Tacacho with Cecina” as served with `cecina (smoked pork)`. Supports a common pork preparation and the English food name, not the whole regional family. It is a tourism page, not a Québec terminology authority. |
| `WP06-CECINA-20261009-S06` | MINCETUR, [“Cecina con tacacho”](https://consultasenlinea.mincetur.gob.pe/fichaInventario/index.aspx?cod_Ficha=3065), inventory record 3065, Ucayali / Coronel Portillo / Callería. | A government regional tourism inventory calls the cecina smoked pork and describes frying it for tacacho. It documents one local dish and preparation, not all Peruvian Amazonian cecina. |
| `WP06-CECINA-20261009-S07` | Universidad Nacional Intercultural de la Amazonía, Lozano Vásquez and Gabancho Osores, [*Influencia del tiempo de ahumado y especie Forestal combustible en el olor y sabor de la Cecina de cerdo… de la Provincia de Coronel Portillo*](https://repositorio.unia.edu.pe/items/15cfa91d-0f45-42f0-9a36-51e94cbf2eca), 2014, abstract. | Regional agroindustrial thesis studies pork cecina in Pucallpa using local fuelwood and different smoke times; its abstract says producer smoke times were not standardized. This is a local pork study, not a national definition. |
| `WP06-CECINA-20261009-S08` | Instituto Nacional de Salud del Niño–San Borja, [*Catálogo de insumos – Servicio de Nutrición*](https://portal.insnsb.gob.pe/logistica/app/1/CATALOGO%20DE%20INSUMOS%20-%20SERVICIO%20DE%20NUTRICION.pdf), printed p. 84 / PDF p. 83, item SND-EMB 007. | Defines that institution’s cecina procurement item as boneless pork that is cured, dried, and smoked, presented in thin sheets. It is an institutional purchasing specification, not evidence of a nationwide legal product standard. |
| `WP06-CECINA-20261009-S09` | Office québécois de la langue française, [“viande séchée”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544703/viande-sechee), updated 2018. | Supports `viande séchée` as a broad fr-CA term for dried meat and explicitly lists charqui as an example. This makes it unsuitable as a cecina-specific alias. |
| `WP06-CECINA-20261009-S10` | Office québécois de la langue française, [“charqui”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542161/charqui), updated 2016. | Records `charqui` and `charque` as French terms and `jerky` / `charqui` as English terms; its general definition is broader than the active Peru-specific camelid identity. Do not reuse those terms as cecina aliases. |
| `WP06-CECINA-20261009-S11` | Argentina, [Joint Resolution 15/2023 amending the Argentine Food Code](https://www.argentina.gob.ar/normativa/nacional/resoluci%C3%B3n-15-2023-383467/texto), Arts. 289 and 292, published 2023-05-10. | Outside Peru’s jurisdiction, it defines cecina across pork, beef, and other edible species using salting and air, sun, smoke, or another approved drying method, and defines charqui separately. This is comparative evidence that the unqualified Spanish product name has country-specific scope; it does not define Peruvian cecina. |
| `WP06-CECINA-20261009-S12` | INACAL, [“Trámites y servicios”](https://www.gob.pe/institucion/inacal/tramites-y-servicios), virtual NTP reading-room link. | INACAL’s NTP collection is accessed through its reading-room service. This review’s accessible, targeted searches did not locate a cecina-specific NTP text. That is not proof none exists; the standards collection was not exhaustively searched through that service. |

### English and fr-CA terms

The English display keeps `cecina`, which is the term used by Peru Travel’s English page for the Peruvian Amazon dish. `Peruvian Amazon` is an added scope qualifier; `(smoked, dried meat)` describes the shared source-supported preservation family without fixing species. The French Peru Travel page also retains `cecina`, while OQLF supports only the broader category `viande séchée` in the consulted entry. I found no cecina-specific OQLF GDT entry in this targeted search; that observation is limited to this review and is not an exhaustive terminology clearance.

Do not add aliases `dried meat`, `dried pork`, `smoked pork`, `smoked meat`, `cured meat`, `viande séchée`, or `viande fumée`: these describe broader ingredient or process classes, and some are not species-stable across the regional family. Do not add `charqui`, `charque`, or `jerky`; these are separate source-named dried-meat identities and the live charqui row is already qualified to camelid meat. Do not import other country or regional products under the unqualified token `cecina`; this proposal is deliberately limited to the Peruvian Amazonian food-use family. No cross-language aliases are recommended.

## Exact live-package audit

The source-ID prefix `WP06-CECINA-20261009-S` was checked before writing against all files under `docs/catalog/proposals`, all files under `docs/catalog/batches`, and `docs/catalog/research-ledger.v1.json`; there were zero matches. This proposal assigns IDs `S01`–`S12` under that unique prefix.

The catalog scan used the project normalizer `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` and exact normalized-key equality across all 480 active ingredient references (English/French names and aliases), all 17 forms (labels and match terms), and all 99 `legacy-import-identities.v1.json` candidates (names and aliases) before coordinator integration. Queries were: `cecina`; `Peruvian cecina`; `Peruvian Amazonian cecina`; `Amazonian cecina (Peru)`; `cecina peruana`; `cecina amazónica`; `cecina amazónica peruana`; `cecina de la Amazonía peruana`; `cecina de l’Amazonie péruvienne`; `cecina ahumada`; `cecina de cerdo`; `cecina de chancho`; `smoked pork`; `dried pork`; `smoked meat`; `dried meat`; `cured meat`; `viande séchée`; `viande fumée`; `Cecina de León`; `Mexican cecina`; `charqui`; `charque`; `jerky`; `charqui (dried salted camelid meat)`; `charqui (viande de camélidé séchée et salée)`; and `dried salted camelid meat`. At that snapshot there were no exact owners for any cecina or proposed-name key. The two full charqui display strings each matched only the expected `ingredient-ref-charqui` name. The standalone query `charqui` had no exact key owner because the canonical name is qualified; the live charqui record is retained as the boundary comparator above.

The recipe scan followed every `recipeFiles` path in the live manifest and counted every `ingredients[]` row in each JSON file. It recursively read string fields in each ingredient row, normalized the combined row text, and checked the same 27 query phrases at word boundaries. Result: **114 recipe files, 1,123 ingredient rows, zero matches**. The recipe files total 749,713 bytes; the manifest-order aggregate (path, NUL, per-file SHA-256, newline) is `e80d97c204558cb88e7a773c04b59742c116f595f10970c6785d25714a7e5397`.

Audit snapshot hashes:

| File | SHA-256 |
| --- | --- |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `640e66a6172020ace27f10ba267dbc8fbad467be73a51a517c7cb64e42077459` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |

This is an exact-key and recipe-text audit, not a fuzzy collision or retail availability search.
The coordinator integrated the family identity without aliases, forms, numeric data, conversions,
substitutions, package yields, or recipe links. See the coordinator's batch for the post-integration
catalog snapshot, tests, and Pixel 9a picker evidence.

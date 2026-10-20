# WP06 guarana product-boundary review — 2026-10-09

**Status:** Integrated as `ingredient-ref-guarana-seed` with `ingredient-form-guarana-seed-powder`; coordinator evidence and verification are recorded in [`docs/catalog/batches/wp06-guarana-identity-20261009/README.md`](../batches/wp06-guarana-identity-20261009/README.md). The 481-reference and 17-form scans below are the pre-integration snapshot.

## Recommendation

**Accept one narrowly scoped guarana-seed identity and one simple powder form. Defer the other products in the family.** The primary Brazilian product standard distinguishes dried whole seed product (`guaraná em grão`), ground seed powder (`guaraná em pó`), and smoked agglomerated sticks (`guaraná em bastão`). Food-use and agricultural sources confirm that seed processing also yields roasted seed (`guaraná em rama`), extracts, syrups, soluble powder, and beverages. The names therefore do not establish one interchangeable recipe ingredient.

Proposed reference, if the coordinator chooses to integrate it:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-guarana-seed` |
| EN display | `guarana seed` |
| fr-CA display | `graine de guarana` |
| Category | `NUT_SEED_AND_DRIED_FRUIT` |
| Reference aliases | `guarana seeds` (EN); `graines de guarana` (fr-CA) |
| Density / unit mappings | None |

The row is about the seed-derived food ingredient, not the whole fruit, a named beverage, or every commercial product made from guarana. For a form row, accept only the straightforward ground seed product:

| Form | EN display | fr-CA display | Candidate match terms |
| --- | --- | --- | --- |
| `powdered` | `guarana seed powder` | `poudre de graines de guarana` | EN: `guarana powder`, `ground guarana`; fr-CA: `guarana en poudre`, `poudre de guarana`; source wording: `guaraná em pó` |

The French labels are transparent descriptions, not claims that OQLF has standardized them. Canada.ca and TERMIUM use the spelling `guarana` without an acute accent in English and French; Brazilian sources use Portuguese `guaraná`. Do not add bare `guarana`/`guaraná` as a reference alias in the proposed row: Brazilian rules require the group and type after the product name, and the bare word may be used for several seed products, extracts, syrups, and beverages.

The powder form is limited to ground guarana seed/kernel. It does not include soluble guarana powder made by extracting seed and spray-drying with maltodextrin. Do not add a roast state, density, unit mapping, dose, conversion, substitution, package yield, or recipe link. Sources provide no general quantity relationship among the products.

## Product-family boundary

| Source wording / product | Evidence-supported boundary | Proposed handling |
| --- | --- | --- |
| Fruit | MAPA defines `guaraná em grão` as a product obtained from mature guarana fruit after removal of the pericarp and aril, followed by cleaning and dehydration. The commercial ingredient discussed in the standard is the remaining seed material, not the intact fruit. | Do not alias the fruit, pulp, or aril to the seed identity. The reviewed sources establish the processing boundary; they do not prove that no local use of aril or fruit pulp exists. A distinct fruit product would need direct food-use evidence. |
| Whole dried seed / `guaraná em grão` | MAPA defines this as the mature-fruit product after the pericarp and aril are removed, then cleaned and dehydrated. | This is the reference’s base ingredient scope. It is not a recipe conversion claim. |
| Powder / `guaraná em pó` | MAPA defines powder as finely crushed, ground, or pounded amêndoa (seed kernel). Embrapa describes roasted seeds finely ground for beverages, ice cream, creams, and other foods. The standard permits limited seed-coat material according to product grade, so the catalog should not encode a stricter universal purity claim. | Accept as the one simple form of the seed identity. Keep roast state unspecified. |
| Roasted whole seed / `guaraná em rama` | Embrapa describes `em rama` as roasted seeds used to produce guarana syrups and extracts. It is a processed whole-seed product and is not identical to the standard’s generic cleaned, dehydrated `em grão`. | Defer a separate form until a recipe or product-specific use requires it. Do not use `em rama` as an alias for raw/dried seed or powder. |
| Stick / `guaraná em bastão` | MAPA defines it as crushed or pounded seed kernel agglomerated into a cylindrical stick and smoked. Embrapa adds that water is used to make a paste, which is molded and subjected to prolonged smoking/dehydration; it is normally grated before use. The Sateré-Mawé product `pão de waraná` has a specific traditional and geographic context under the Andirá-Marau denomination of origin. | Defer as a separate processed identity if later needed. Do not model it as a powder form or alias. Do not generalize `pão de waraná` or `waraná` beyond the named source context. |
| Extract | The Ministry of Health and Embrapa list extracts among seed-derived products. A separate Embrapa soluble-powder process extracts dried seed and adds maltodextrin before spray drying. Health Canada’s French ingredient page says more information is needed to determine whether a given guarana seed extract has a history of use as a food ingredient; it notes that preparation and use matter. | Defer a generic extract identity. Extracts may differ in concentration and composition; do not map them to powder or assign a conversion. The Health Canada note is about its ingredient review context, not a universal claim about all conventional foods. |
| Soluble powder | Embrapa’s 1997 process makes an extract from dried seed, adds 30% maltodextrin, and spray-dries it. This is not the same product as finely ground seed powder in the MAPA standard. | Defer as a separate processed product; do not alias it to the simple powder form. |
| Syrup / `xarope de guaraná` | Regional-food and Embrapa sources list syrup as a seed-derived product. Under Brazil’s current beverage framework, `xarope` is a non-carbonated water-based beverage with a minimum sugar concentration; MAPA lists the syrup product standard separately from guarana seed product. | Defer as a separate syrup/beverage identity if a recipe needs it. Do not model as a seed form, sweetener conversion, or synonym of extract. |
| Prepared beverage | Brazil’s current decree distinguishes a `refresco` made by diluting plant juice, pulp, extract, or edible plant parts in water and a carbonated `refrigerante` made from juice, pulp, or plant extract dissolved in water. These are finished beverage classes. | Out of scope for the seed reference. A recipe that uses a measured beverage would need its own explicitly named beverage ingredient, not a guarana-seed alias. |

The scope is Brazil/Amazonian guarana seed use as supported by the consulted sources. MAPA’s standard names *Paullinia cupana* and *P. cupana* var. *sorbilis*; the Andirá-Marau DO material specifies *P. cupana* var. *sorbilis* for its Sateré-Mawé product. The proposed display name does not assert that a particular variety or geographic origin applies to every guarana product.

## English and fr-CA wording

The Government of Canada’s English and French caffeine pages use `guarana` / `guarana` for a flavouring or extract context. The French Health Canada ingredient page uses `extrait de graines de guarana`. TERMIUM Plus record 49 (dated 2002-08-27) lists `guarana` as a correct English term and as a correct masculine French noun. Its older definition describes a dried seed paste and its note discusses UK product uses; it is useful evidence for the word and French gender, not a current taxonomy of product forms or a Québec culinary-use claim. [S08–S10]

Targeted OQLF searches for `guarana` and `guaraná` did not surface a guarana food-product term. The relevant OQLF GDT `caféine` entry lists `guaranine` only as a **désuet** contextual synonym for caffeine. TERMIUM also has that old caffeine synonym, separate from its `guarana` record. Neither use makes `guaranine` an ingredient alias. OQLF explains that GDT search defaults to term fields and can be widened to full text; this bounded search result is not proof that no related OQLF material exists. [S10–S12]

Recommended labels `guarana seed` and `graine de guarana` keep the source name and identify the part used. `guarana` without `seed` / `graine` can remain a family or botanical name in prose but should not be a broad alias that collapses powder, sticks, extracts, syrup, or beverages. The proposed form labels are descriptive; they are not represented as OQLF-approved equivalents. Retain Portuguese names such as `guaraná em pó` in source notes or match-term handling only where the input language is intentionally supported.

## Live package and exact-scan audit

Pre-integration snapshot read from the shared worktree on 2026-10-09. Hashes cover exact file bytes. The recipe aggregate is computed in `manifest.recipeFiles` order by appending each relative path, a NUL byte, that recipe file’s lowercase SHA-256 hex digest, and a newline, then hashing the combined bytes.

| Artifact | Current count | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 481 references | 151,010 | `0279b730ce312b11048fe93237f93558b116318e9fb231d6b93173b6dc9e7be8` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 17 forms | 11,164 | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| `docs/catalog/legacy-import-identities.v1.json` | 99 candidates | 23,450 | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe JSON files | 114 files; 1,123 ingredient rows | 749,713 aggregate bytes | `e80d97c204558cb88e7a773c04b59742c116f595f10970c6785d25714a7e5397` |

### Normalized collision scan

The exact-key scan indexed active reference English/French display names and aliases (1,452 searchable values), form labels and match terms (67 values), and legacy candidate names and aliases (198 values): 1,717 values across 1,557 distinct normalized keys. Candidate phrases were compared by exact normalized-key equality, not fuzzy, stemming, translation, or semantic matching. Normalization followed `tools/seed_package/bundled_seed_package.py::normalize_search_key`: Unicode NFKD, case-folding, `œ`→`oe`, `æ`→`ae`, `ß`→`ss`, combining-mark removal, punctuation-to-space conversion, ampersand expansion, and whitespace collapse.

The 63 source/candidate phrases below reduce to 39 unique normalized keys. **There were zero exact-key collisions** in active references, forms, or legacy candidates. The proposed reference ID `ingredient-ref-guarana-seed` and form ID `ingredient-form-guarana-seed-powder` are also absent from those three collections.

```text
guaraná; guarana; guaraná seed; guarana seed; guaraná seeds; guarana seeds;
Brazilian guarana seed; Brazilian guaraná seed; graines de guarana; graine de guaraná;
guaraná em grão; guarana em grao; guaraná em pó; guarana em po;
guaraná powder; guarana powder; powdered guaraná; powdered guarana;
ground guaraná seed; ground guarana seed; poudre de guarana; guaraná en poudre;
guarana en poudre; guaraná em bastão; guarana em bastao; guaraná stick; guarana stick;
pão de guaraná; pao de guarana; pão de waraná; pao de warana; waraná; warana;
guaraná em rama; guarana em rama; guaraná extract; guarana extract;
guarana seed extract; extrait de graines de guarana; xarope de guaraná;
xarope de guarana; guaraná syrup; guarana syrup; syrup of guarana; sirop de guarana;
guarana soda; guaraná soda; guarana beverage; guaraná beverage; guarana drink;
guaraná drink; Paullinia cupana; Paullinia cupana var sorbilis; guaranine; guaranina;
guaraná stick powder; guarana fruit; guaraná fruit; guarana fruit pulp;
polpa de guaraná; arilo de guarana; guarana extract syrup; guaraná extract syrup
```

### Recipe scan

All strings in all 114 manifest-listed recipe JSON files were scanned, including all 1,123 ingredient rows. Text was normalized with the same key function; candidate phrases were checked as whole normalized token sequences with word boundaries. The scan returned **zero guarana-family hits** across the recipe JSON corpus. This is a corpus inventory result, not evidence that guarana products are uncommon outside this bundled library.

### Source-ID prefix

This review uses the unique prefix `WP06-GUARANA-20261009-S`. A recursive scan of existing `docs/catalog` Markdown, JSON, and text files found no prior occurrence of the prefix. The live ledger has 647 records, 912 source entries, and 799 distinct source IDs; none uses this prefix.

## Evidence register

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP06-GUARANA-20261009-S01` | MAPA, [Portaria MAPA nº 70/1982](https://sistemasweb.agricultura.gov.br/sislegis/action/detalhaAto.do?chave=305705907&method=visualizarAtoPortalMapa), sections 3.7–3.13 and 4.1–4.2. | Primary product standard. Defines `em grão`, `em bastão`, and `em pó` as distinct presentation groups; distinguishes fruit processing from seed/kernel products. It is a Brazilian product standard, not a recipe-use standard or Canadian product rule. |
| `WP06-GUARANA-20261009-S02` | MAPA, [Produtos de origem vegetal padronizados e referências normativas](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/registro-importacao-e-exportacao-1/registro/registro-de-estabelecimentos/padroes-aplicaveis-as-bebidas), published 2026-06-19, updated 2026-08-20; entries `Guaraná` and `Xarope`, and entries for `Refresco` / `Refrigerante`. | Current MAPA index lists Guaraná under Portaria 70/1982 and syrup/refrescos/refrigerantes separately under current beverage rules. MAPA cautions that the table reproduces a source spreadsheet and that users should check amendments or repeals before applying a standard. |
| `WP06-GUARANA-20261009-S03` | Brazil, [Decreto nº 12.709/2025](https://www.planalto.gov.br/ccivil_03/_ato2023-2026/2025/decreto/d12709.htm), arts. 32, 35, and 38. | Defines `refresco`, carbonated `refrigerante`, and `xarope` as beverage categories; Article 38 defines syrup as a non-carbonated water-based beverage with a minimum sugar concentration. Supports keeping finished beverage products distinct from seed and powder. |
| `WP06-GUARANA-20261009-S04` | INPI/MAPA, [Denominação de Origem Terra Indígena Andirá-Marau certificate](https://www.gov.br/inpi/pt-br/servicos/indicacoes-geograficas/arquivos/certificados-de-ig/certificado_br412016000005-2_terra-indigena-andira-marau.pdf/%40%40download/file), product rules art. 2 and MAPA technical note, pp. 32–34 of the source pagination. | Describes Sateré-Mawé waraná production and consumption, dried seed, powder, and `pão de waraná` / bastão; identifies the specific DO product and geographic/cultural scope. Do not generalize its protected-product terminology or process as the definition of every Brazilian guarana product. |
| `WP06-GUARANA-20261009-S05` | Brazil Ministry of Health, [Alimentos regionais brasileiros, 2nd ed.](https://bvsms.saude.gov.br/bvs/publicacoes/alimentos_regionais_brasileiros_2ed.pdf), 2015, `Guaraná` entry, p. 53, culinary-use section. | Identifies the Amazonian food and says processing the seed yields powder, sticks, extracts, and syrups. Regional-food overview; does not make these products compositionally interchangeable. |
| `WP06-GUARANA-20261009-S06` | Embrapa Amazônia Ocidental, [Cultura do guaranazeiro no Amazonas, 4th ed.](https://www.infoteca.cnptia.embrapa.br/bitstream/doc/678408/1/SistemaProdGuarana.pdf), 2005, “Comercialização,” pp. 29–30 (PDF pp. 13–14). | Explains stick processing, `em rama` roasted seeds, and ground powder uses in drinks and foods. Regional production guide; its descriptions are not universal recipe conversions or current legal requirements. |
| `WP06-GUARANA-20261009-S07` | Nazaré, R. F. R. de, Embrapa-CPATU, [Processamento de guaraná em pó solúvel](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/375895/1/CPATUDoc95.pdf), 1997, Documentos 95. | Documents extraction from dried seed, maltodextrin addition, and spray-drying for soluble powder. One industrial process demonstrates why soluble powder should not be conflated with ground seed powder; it is not a universal soluble-powder specification. |
| `WP06-GUARANA-20261009-S08` | Health Canada, [Caffeine in Foods](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/food-additives/caffeine-foods.html) and [La caféine dans les aliments](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/additifs-alimentaires/cafeine-aliments.html), “About” sections. | Government of Canada English and French use `guarana` in a flavouring/extract context. Supports the unaccented local spelling, not a specific seed-powder equivalency or OQLF endorsement. |
| `WP06-GUARANA-20261009-S09` | Health Canada, [Information sur l’utilisation de certains ingrédients dans les aliments, y compris les aliments supplémentés](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-supplementes/liste-ingredients-autorisees-aliments/information-ingredients-aliments.html), row `Extrait de graines de guarana` and related notes. | Uses the phrase `extrait de graines de guarana` and says more information is needed about a particular extract’s food-use history; preparation and use may affect classification. This page addresses supplemental-ingredient review, not all conventional food uses. |
| `WP06-GUARANA-20261009-S10` | Office québécois de la langue française, [caféine, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869332/cafeine), terms used in some contexts. | Lists `guaranine` as a dated/obsolete contextual synonym for caffeine. It does not identify guarana as a food-form alias. |
| `WP06-GUARANA-20261009-S11` | TERMIUM Plus, [guarana, record 49](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=55&i=&index=enb&lang=eng&sg_kp_wet=107543&srchtxt=BRAZILIAN), record dated 2002-08-27. | Marks English `guarana` and French masculine `guarana` as correct terms, but gives an older dried-paste definition and a UK-use note. Useful for the word and gender only; not a current Canadian form taxonomy or a Québec culinary-use survey. |
| `WP06-GUARANA-20261009-S12` | Office québécois de la langue française, [Vitrine linguistique FAQ](https://vitrinelinguistique.oqlf.gouv.qc.ca/a-propos-de-la-vitrine-linguistique/foire-aux-questions), search-method section. | Explains that GDT search defaults to terminology fields and can be widened to full text. Documents the limits of a targeted no-result search; it cannot establish non-existence of a term. |

## Disposition summary

- **Accept:** one `guarana seed` reference and the directly ground `guarana seed powder` form, with the labels above and no quantity/conversion metadata.
- **Defer:** a roasted whole-seed `em rama` form; a separate stick / `pão de guaraná` identity; extracts; soluble powder; syrup; and beverage identities. Each is a documented product but has a distinct process or finished-product composition.
- **Exclude as aliases:** whole fruit or aril, `guaraná em bastão`, `pão de waraná`, `guaraná em rama`, extracts, syrup, beverages, and `guaranine`.
- **Recipe action:** none. The current 114-recipe package has no matching guarana text.
- **Open evidence gap:** no reviewed source established a culinary use for the intact fruit/aril as an ingredient; this review does not claim such use is absent.

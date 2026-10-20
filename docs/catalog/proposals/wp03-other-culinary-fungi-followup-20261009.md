# WP03 Section N follow-up — other culinary fungi

- **Reviewed:** 2026-10-09
- **Status:** proposal only. This is the only file created for this task; no seed data, ledger, plan, roadmap, code, tests, or existing proposal files were changed.
- **Scope:** the six remaining named mushroom groups after king oyster, enoki, maitake, culinary truffle, shiitake, oyster, chanterelle, and morel were integrated: shimeji, porcini, wood ear, snow fungus, straw mushroom, and lion’s mane. Bunashimeji is considered only as a narrowly bounded product within the ambiguous shimeji group. Huitlacoche is noted as adjacent work already covered by the fungi/sea-vegetable coordinator packet.
- **Recommendation:** propose identity-only rows for bunashimeji, Auricularia wood ear, *Tremella fuciformis* sold as snow fungus, *Volvariella volvacea* sold as straw mushroom, and *Hericium erinaceus* sold as lion’s mane. Hold unqualified shimeji and porcini pending exact product and Québec French naming review. Do not propose forms, measurements, conversions, yields, substitutions, recipe links, or safety claims.
- **Plan state:** Section N remains open.

## Refreshed package snapshot

These values were recomputed from exact working-tree bytes while preparing this proposal. File SHA-256 values cover the complete file bytes. The manifest-ordered recipe digest hashes each manifest-relative path, a NUL byte, the exact recipe-file bytes, and another NUL byte, in manifest order.

| Artifact | Count or state | SHA-256 or digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 631 references | `8935fb3c03acc994f0127d59a2a44c580e93260db8367229c0d9cdb9975dbfe0` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `docs/catalog/research-ledger.v1.json` | 801 records; 1,321 source entries; 1,119 distinct source IDs | `99448ddaf0ac44ef0b34130634eead1132e41a90ce0f69cada0f60e6a66cba2e` |
| `docs/catalog/legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

## Repository and recipe audit

I checked the current ingredient references and forms, all research-ledger record IDs, the legacy candidate file, the Section N checklist, the prior mushroom identity packets, and every ingredient row and string field in the 114 manifest-listed recipes. Search phrase checks follow `normalizeIngredientSearchKey`: lowercase, NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. I checked complete normalized phrases first and the app’s partial-match fallback second.

| Area | Current finding | Effect |
|---|---|---|
| Active identities | The package contains the generic mushroom and candy-cap rows plus the eight integrated named identities listed in the scope. None of the open candidate IDs or their exact bilingual terms is active. Seafood `dried oyster` and the oyster sauces remain separate from oyster mushroom. | Keep the integrated identities intact; propose only the open identities below. |
| Forms | None of the 33 forms names the open fungi or a corresponding product state. | No form or conversion work is proposed. |
| Research ledger | The ledger has 801 records. None of the proposed or held candidate IDs below is a ledger record ID. | Keep source IDs local to this proposal; do not update the shared ledger. |
| Legacy candidates | The file has 86 candidates and no target candidate ID. It still contains the duplicate generic `ingredient-ref-mushrooms` and a separate oyster-sauce row. | Do not reactivate the generic duplicate or treat oyster sauce as a fungus identity. |
| Recipe ingredient rows | No row contains shimeji, bunashimeji, porcini, wood ear, snow fungus, straw mushroom, lion’s mane, or their proposed French displays. | The bundled recipes provide no line-level basis for new named links. |

The only mushroom ingredient rows are:

| Recipe line | Exact source text | Current reference | What it identifies |
|---|---|---|---|
| 037#7 | `1 lb white mushrooms, sliced` | `ingredient-ref-mushroom` | Generic white mushrooms; no species or market class. |
| 037#12 | `extra sauteed mushrooms, to taste` | `ingredient-ref-mushroom` | Generic optional add-in; no named fungus. |
| 089#3 | `1/2 box mushrooms` | `ingredient-ref-mushroom` | Generic mushroom package fraction; package content is unspecified. |
| 100#2 | `7 g ground dried candy cap mushrooms` | `ingredient-ref-ground-dried-candy-cap-mushrooms` | Existing separate candy-cap ingredient, outside this follow-up. |

Other recipe text contains decorative meringue mushrooms (021), optional generic mushrooms in notes (085 and 097), and chocolate truffle confectionery (057 and 112). Those are not ingredient-line demand for these candidates. No candidate relink is indicated.

The candidate IDs below were checked against the 631 active references, 86 legacy candidates, and 801 ledger record IDs. None is present in those stores. The new source-ID prefix `WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S` was searched repository-wide before drafting and had no prior match. Source IDs S01–S12 are unique within this proposal and remain proposal-local.

## Proposed identity-only decisions

The catalog’s existing `VEGETABLE_AND_AROMATIC` category is a product taxonomy choice. If an identity is accepted, use that category; it is not a botanical classification. These recommendations add no scientific-name field to the catalog. Taxa below are scope evidence only.

| Proposal ID | Recommendation | English display | fr-CA display | Aliases proposed | Narrow identity boundary |
|---|---|---|---|---|---|
| `ingredient-ref-bunashimeji-mushroom` | Recommend | `bunashimeji mushroom` | `bunashimeji` | None | Only the product named Bunashimeji and identified in Canadian regulatory tables as *Hypsizygus marmoreus*. Do not add bare `shimeji`, `bunapi`, or a species claim for all shimeji products. [S01–S03] |
| `ingredient-ref-shimeji-mushroom` | Hold | — | — | — | Health Canada lists Bunashimeji (*H. marmoreus*) separately from Shimeji (*Tricholoma conglobatum*); Codex commodity material also uses shimeji for another taxon/group. The bare market name does not identify one stable product boundary. [S01–S03] |
| `ingredient-ref-porcini-mushroom` | Hold | — | — | — | Canadian import nomenclature identifies porcini as *Boletus edulis*, but OQLF’s French `bolet`/`cèpe` scope includes a broader group. A Québec commercial report discusses `cèpe de Bordeaux` and `porcini` through regional naming; it does not establish one preferred fr-CA display for a labeled *B. edulis* product. Do not alias broad `bolet` or `cèpe` to porcini. [S04–S05, S12] |
| `ingredient-ref-wood-ear-mushroom` | Recommend, genus-level | `wood ear mushroom` | `champignon noir` | None | Use only for the culinary Auricularia market product. Keep the species unset unless a product label names it. The English/French display pairing is an inference from separate OQLF entries: one maps `wood ear` to `oreille-de-Judas`; another prefers `champignon noir` and defines it in *Auricularia*. Do not add `oreille-de-Judas` as an alias or assign every wood-ear product to one species. [S06–S08] |
| `ingredient-ref-snow-fungus` | Recommend | `snow fungus` | `trémelle blanche` | None | Scope to products identified as *Tremella fuciformis*. A Montréal retailer pairs the English market name with that binomial; Health Canada’s English/French tables list white jelly fungi / trémelle blanche with the same binomial. Do not add `white wood ear` or a generic `white fungus` alias. [S01–S02, S10] |
| `ingredient-ref-straw-mushroom` | Recommend | `straw mushroom` | `volvaire asiatique` | None | Scope to *Volvariella volvacea*. Codex assigns straw mushroom to that species; Health Canada’s French crop table assigns `volvaire asiatique` to the same binomial. This bilingual mapping is a cross-source inference via the shared scientific name. Do not add `Chinese mushroom` as an alias. [S01–S03] |
| `ingredient-ref-lions-mane-mushroom` | Recommend | `lion’s mane mushroom` | `hydne hérisson` | None | Scope to the culinary fruiting body of *Hericium erinaceus*. Health Canada lists the species under `Pom Pom` / `hydne hérisson`; Québec producer listings use `hydne hérisson`, and a Québec seller pairs it with `Lion’s Mane`. Keep mycelium, extracts, and supplements outside this ingredient identity. [S01–S02, S09–S11] |

The recommended displays use the most specific Canadian or Québec evidence found for this pass. The label `trémelle blanche` comes from Health Canada’s French crop table rather than an OQLF preferred-term entry; `bunashimeji` and `volvaire asiatique` likewise come from the Canadian French table. These are proposal terms for review, not new active aliases.

### Adjacent culinary fungus

Huitlacoche is the one adjacent culinary-fungus candidate already bounded in the [WP03 fungi and sea-vegetable coordinator review](wp03-fungi-seaweed-coordinator-review-20261009.md): a distinct food identity scoped there to young *Ustilago maydis* galls on maize. This follow-up does not duplicate that candidate or propose another adjacent fungus. No huitlacoche ingredient row appears in the current bundle.

## Source register

Sources were checked on 2026-10-09. Source IDs are local to this proposal; none was added to the research ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S01** | Health Canada, [Residue Chemistry Crop Groups — English](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html). | Edible-fungi list gives Bunashimeji / *H. marmoreus*, Chinese mushroom / *V. volvacea*, Pom Pom / *H. erinaceus*, Shimeji / *T. conglobatum*, and White jelly fungi / *T. fuciformis*. A regulatory crop table, not a current retail synonym authority. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S02** | Health Canada, [Groupes de cultures et propriétés chimiques de leurs résidus — français](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html). | French crop terms include `Bunashimeji`, `Volvaire asiatique` / *V. volvacea*, `Hydne hérisson` / *H. erinaceus*, `Shimeji` / *T. conglobatum*, and `Trémelle blanche` / *T. fuciformis*. Regulatory naming evidence; no recipe measures or product-state mappings. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S03** | Codex Alimentarius, [Classification of Foods and Animal Feeds, CXA 4-1989](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ar/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXA%2B4-1989%252FCXA_004e.pdf). | Commodity names include Straw mushroom / *V. volvacea*, Wood ears mushroom / *Auricularia polytricha*, and Shimeji under a different taxonomic treatment. This is a commodity classification and its taxonomic labels may be dated. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S04** | OQLF, [bolet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296987/bolet). | Lists English `porcini mushroom` and Latin *Boletus edulis*, while French `bolet` and `cèpe` cover a wider edible group; its note mentions cèpe de Bordeaux and cèpe bronzé. Terminology and scope evidence, not a product label pairing. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S05** | Québec Agrireseau, [Analyse de commercialisation des champignons forestiers sauvages à potentiel commercial](https://www.agrireseau.net/documents/Document_118788.pdf). | Québec commercial report identifies bolet comestible / cèpe as *B. edulis* and discusses `cèpe de Bordeaux` and `porcini` as regional terms. It does not establish a preferred Québec retail label for every porcini product. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S06** | OQLF, [champignon noir (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489350/champignon-noir). | Québec French preferred term `champignon noir`; the entry identifies the food as genus *Auricularia* and notes `oreille de bois` among its common French names. It does not assign one species. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S07** | OQLF GDT, [oreille-de-Judas](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423451/oreille-de-judas), authored by Les Éditions Québec Amérique inc. | Maps `wood ear` to `oreille-de-Judas`. Partner-authored terminology entry; it does not establish that this French name applies across all Auricularia products. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S08** | Wu et al., [Species clarification of cultivated Auricularia “Heimuer”](https://doi.org/10.11646/phytotaxa.186.5.1), 2014. | Shows that cultivated “Heimuer” is distinct from *A. auricula-judae*. Supports leaving a species unset when the culinary market label is broad; not a bilingual naming source. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S09** | Aliments du Québec, [Hydne hérisson déshydraté](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/hydne-herisson-deshydrate). | Québec producer listing uses `hydne hérisson` for a culinary mushroom product. The listing does not identify all products bearing lion’s-mane names or establish supplement/product equivalence. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S10** | Mycoboutique, Montréal, [Dried Snow Fungus (*Tremella fuciformis*)](https://mycoboutique.ca/products/snow-fungus-tremella-fuciformis). | Local retail label pairs Snow Fungus with *T. fuciformis* and lists English market synonyms. Retail source, not French terminology authority; its dried presentation does not justify a form or conversion entry. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S11** | MycoQuébec, [*Hericium erinaceus*](https://www.mycoquebec.org/scripts/fiche_pdf.php?dest=D&tag=Hericium+erinaceus). | Québec mycological database names *H. erinaceus* `hydne hérisson`. Taxon and French-name evidence, not a rule that every Hericium species is lion’s mane. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S12** | Innovation, Science and Economic Development Canada, [Canadian Importers Database: dried mushrooms and truffles](https://ised-isde.canada.ca/app/ixb/cid-bdic/productReportHS10.html?hsCode=0712391100). | Canadian import classification explicitly names porcini as *Boletus edulis*. Supports the narrow English/taxon boundary, not a Québec French display decision. |
| **WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S13** | Les 400 pieds de champignon, [Fresh mushrooms](https://les400piedsdechampignon.com/en/collections/champignons-frais). | Montréal-region grower’s fresh-mushroom listing includes `Lion’s Mane Mushrooms`; supports the English culinary market name without assigning every market product to one taxon. |

## Review decision

An integration owner can review the five recommended identity rows against the package’s current normalization and alias policy. Keep broad shimeji and porcini on hold until product-specific naming is resolved. Keep Section N open for these remaining decisions, prepared forms, sea vegetables, and other fungal work. No tests were run because this assignment was proposal-only.

## Coordinator integration disposition

Integrated the five proposed identities: Bunashimeji, genus-level wood ear / `champignon noir`, snow fungus / `trémelle blanche`, straw mushroom / `volvaire asiatique`, and lion’s mane / `hydne hérisson`. The lion’s-mane identity is kept at the culinary market-name level: *Hericium erinaceus* is one supported referent, not a universal assignment to all products carrying that English name. Broad shimeji and porcini remain unresolved. No recipe links, forms, measurements, conversions, yields, or substitutions were added. See the linked integration README for the accepted rows and verification.

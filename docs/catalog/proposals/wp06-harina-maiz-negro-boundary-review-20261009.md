# WP06 — Ecuadorian harina de maíz negro boundary review

- **Reviewed:** 2026-10-09
- **Status:** Coordinator reviewed. The source term denotes a flour ingredient, not colada morada or another prepared compound; active identity remains **deferred** until product/milling scope is established. No catalog row, alias, form, or recipe link was added.
- **Scope:** Compare Ecuadorian *harina de maíz negro* with generic corn flour, cornmeal, black/purple maize, hominy grits, and active seed-package rows. Audit exact normalized keys and all manifest-listed recipes.
- **New source-ID prefix:** `WP06-MAIZNEGRO-20261009-S`. Checked against the current proposal and ledger files; no prior IDs with this prefix were found.

## Recommendation

Resolve the product-form question as **ingredient flour, not prepared compound**. Ecuador’s INIAP describes flour from its black/purple maize for colada morada, and the Latacunga municipal marketplace lists *harina de maíz negro* as a standalone product from a mill. The finished *colada morada* is the compound beverage made with that flour and other ingredients.

Keep the separate catalog identity decision **unresolved**. INIAP connects *maíz negro* and *maíz morado* at the crop/variety level, but the sources do not establish that every product sold as *harina de maíz negro* is made from the same variety or specify its particle size, whole-kernel versus degerminated milling, or other processing. Those details are needed to decide whether this is a distinct flour identity or an Ecuadorian color-variety specification of the current generic corn-flour row.

For coordinator review, retain the source term and consider these provisional display descriptions:

- **EN:** *Ecuadorian black corn flour*
- **fr-CA:** *farine de maïs noir de l’Équateur* — provisional

INIAP also uses *maíz morado* for the black/purple maize. Treat that as a related Ecuadorian source wording, not as proof of equivalence with purple-corn products from other countries. If the candidate is later accepted, a tentative category is `FLOUR_AND_STARCH`. No alias, form, measurement, substitution, or recipe link is proposed now.

## Evidence and product boundary

| Evidence | What it supports | What it does not establish |
| --- | --- | --- |
| INIAP’s technical sheet identifies *maíz morado* as *Zea mays L.* with a dark, nearly black ear, noting that some localities call it *maíz negro*. It discusses anthocyanins and Ecuadorian collections. [New source S01](https://repositorio.iniap.gob.ec/items/b7938798-b44d-4a2c-9632-04e749ae970e) | The source names *negro* and *morado* for a locally grown purple/black maize; this is a maize type/variety distinction within *Zea mays*, not another crop. | It does not show that all Ecuadorian black-maize flour comes from one cultivar or define a flour specification. |
| INIAP’s release note for INIAP-199 “Racimo de Uva” says this dark-purple/black maize is suited to flour used for traditional colada morada and chicha morada. [New source S02](https://www.iniap.gob.ec/liberacion-de-nueva-variedad-de-maiz-iniap-199-racimo-de-uva-se-realizo-en-chimborazo/) | Confirms a real Ecuadorian maize variety and a flour use; it supports treating the flour as a source-named ingredient candidate. | This is variety-specific promotion, not a standard requiring every product to use INIAP-199 or an authoritative description of commercial milling. |
| INIAP’s 2016 maize recipe book says purple-maize flour is especially used for colada morada and separately mentions germinated-maize flour for chicha. [New source S03](https://repositorio.iniap.gob.ec/bitstreams/3d1138b4-192d-4185-9b15-fe987d513e80/download) | Supports flour as an ingredient distinct from a prepared beverage and distinguishes a separately germinated-flour use. | It does not provide a complete product label, milling grade, whole-kernel/degermination status, or a universal recipe. |
| Ecuador Travel describes *colada morada* as a thick purple drink based on black-corn flour and chopped fruit, associated with the Day of the Dead. This is existing source `WP06-SOUTHAM-20261009-S07`. | Confirms the flour is a component of a compound beverage, not the beverage itself. | Tourism copy is not a flour specification. The source record is reused by ID; no duplicate is added. |
| The Municipio de Latacunga marketplace lists “HARINA DE MAIZ NEGRO” as a product sold by Molinos San Carlos. [New source S04](https://xn--suea-iqa.latacunga.gob.ec/producto/harina-de-maiz-negro/) | Evidence that the exact name is used for a standalone market product in Ecuador. | The listing gives no ingredient statement, variety, package size, processing, or particle-size description. It is not a regulatory product definition. |

The cited INIAP material supports black/purple maize as a source crop and a flour made from it. It does not establish a special Ecuadorian milling process. The claim that the candidate is a simple flour rests on the source name, INIAP’s description of flour use, and the seller listing; no available product label confirms whether additives are present.

## Comparison with the active corn identities

| Product or concept | Active row / source boundary | Disposition for this candidate |
| --- | --- | --- |
| Fine maize flour / corn flour | OQLF’s 2025 GDT entry defines *farine de maïs* as a fine powder of milled maize and gives EN *corn flour*. It notes that the flour is typically yellow, not invariably so. [New source S05](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais) The active row `ingredient-ref-whole-kernel-corn-flour` has FR display `farine de maïs` and EN display `whole-kernel corn flour`. | Likely broad product family, but the Ecuadorian source does not say whether it is whole-kernel or otherwise milled. Do not merge or alias yet. The unqualified FR wording `farine de maïs` already belongs to the active whole-kernel row. |
| Cornmeal / corn meal | OQLF’s GDT uses *semoule de maïs* for dry-ground maize, from fine to coarse. The active row is `ingredient-ref-cornmeal` (FR `semoule de maïs`; EN `cornmeal`; alias `corn meal`). | Source calls the candidate *harina* (flour), but gives no granularity. Do not alias it to cornmeal or infer a particle-size match. |
| Hominy grits | Active row `ingredient-ref-hominy-grits` (FR `gruau de maïs`). | No source says the Ecuadorian flour is hominy/alkali-treated maize or a grits product. Keep separate. |
| Precooked corn flour | Active row `ingredient-ref-precooked-corn-flour` (FR `farine de maïs précuite`). Ecuador’s INEN draft `PRTE-241` cites NTE INEN 2051 for maize flour and NTE INEN 1737 for precooked maize flour. [New source S06](https://www.normalizacion.gob.ec/buzon/reglamentos/PRTE-241.pdf) | The cited document is a draft, not an operative regulation. It shows that precooked flour is a separately named product category in that draft; no reviewed source says this candidate is precooked. Do not alias. |
| Roasted corn flour | Active row `ingredient-ref-roasted-corn-flour` (FR `farine de maïs torréfiée`). | No reviewed source says the candidate is roasted. Do not alias. |
| Black/purple corn as a crop | INIAP describes Ecuadorian *maíz morado/negro* and the specific INIAP-199 variety. | Supports the source crop but not equivalence to Peruvian purple-corn products, other regional colored maize, or extracted purple-corn pigments. Do not add cross-country aliases. |
| Finished colada morada | Ecuador Travel identifies this as a thick prepared beverage based on black-corn flour, fruit, and other components. | Compound recipe/breadth category; keep distinct from the flour ingredient. |

The accessible Ecuadorian INEN document located for this pass is a draft that references general maize-flour standards; it does not define a special “black maize flour” product. The full current text of NTE INEN 2051 was not located in the freely accessible official pages reviewed. Do not infer a distinct standard grade, de-germination practice, or particle size from the standard’s title alone.

## Decisions for coordinator review

| Item | Decision | Proposed handling |
| --- | --- | --- |
| *Harina de maíz negro* as an ingredient rather than colada morada | **Accept** | Treat it as a flour ingredient candidate. The beverage is the compound product; the flour is one of its inputs. |
| *Maíz negro* / *maíz morado* within the Ecuadorian candidate | **Accept provisionally as related local wording** | INIAP ties the names together for a purple maize variety whose ear appears nearly black. Do not generalize this relationship to every country’s purple-corn products. |
| Separate active identity versus existing whole-kernel corn flour / generic fine corn flour | **Unresolved; defer activation** | Product origin/color and colada use are supported, but current sources do not bound milling method, whole-kernel status, particle size, or common commercial composition. Do not merge or create a form/alias until these are clarified. |
| Alias to cornmeal, hominy grits, roasted corn flour, or precooked corn flour | **Defer / do not alias** | Their active rows designate other grain sizes or processing states. No source demonstrates those properties for *harina de maíz negro*. |
| Alias to generic purple corn flour, purple maize, or pigment products from other countries | **Defer / do not alias** | Similar color and *Zea mays* origin do not establish the same cultivar, product form, or processing. |
| EN and fr-CA displays | **Provisional** | Use *Ecuadorian black corn flour* / *farine de maïs noir de l’Équateur*. OQLF supports the base term *farine de maïs*; no Québec-specific color/product entry was located. |
| Forms, density, measurements, conversion, substitution | **Defer** | No exact product-specific measurement or substitution evidence was reviewed. Do not transfer cornmeal, whole-kernel flour, hominy-grits, roasted-flour, or precooked-flour data. |
| Recipe relinking | **No action** | Exact candidate and comparator scans found no matching ingredient rows in the bundled package. |

## Exact normalized-key and recipe audit

Audit snapshot: 2026-10-09, using `tools/seed_package/bundled_seed_package.py::normalize_search_key`. The function applies Unicode NFKD, case folding, accent/ligature folding, punctuation-to-space normalization, and trimming.

- Ingredient references: **484**, source-file SHA-256 `9f5f96bfc9c9e13b9347f2e1a410e05c75357384586b04bce45dbdc3ce3c0b23`.
- Ingredient forms: **18**, source-file SHA-256 `ee299dbe8f4a2349a16c495b37ac6ee4830a128fdceffd91f3bf2001f1e10617`.
- Legacy identity candidates: **99**, file SHA-256 `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b`.
- Manifest: **114** recipe files, SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- All recipe JSON content in manifest order, hashed from relative path, NUL, per-file SHA-256 hex, and newline: `e80d97c204558cb88e7a773c04b59742c116f595f10970c6785d25714a7e5397`.

The exact-key query included *harina de maíz negro/morado*, *maíz negro/morado*, *black corn*, *black maize*, *purple corn*, *purple maize*, their English flour phrases, *farine de maïs noir/violet*, *maïs noir/violet*, and exact comparison terms. Surface spellings in the table are normalized before comparison. Results:

| Queried term (surface spelling; exact key normalized before matching) | Exact current owner |
| --- | --- |
| `harina de maíz negro`, `harina de maíz morado`, `maíz negro`, `maíz morado`, `black corn`, `black maize`, `purple corn`, `purple maize`, `black corn flour`, `black maize flour`, `purple corn flour`, `purple maize flour`, `farine de maïs noir`, `farine de maïs violet`, `maïs noir`, `maïs violet` | No exact active reference, form, or legacy owner |
| `semoule de maïs`, `cornmeal`, `corn meal` | Active `ingredient-ref-cornmeal` |
| `gruau de maïs`, `hominy grits` | Active `ingredient-ref-hominy-grits` |
| `farine de maïs`, `whole-kernel corn flour` | Active `ingredient-ref-whole-kernel-corn-flour` |
| `farine de maïs précuite`, `precooked corn flour` | Active `ingredient-ref-precooked-corn-flour` |
| `farine de maïs torréfiée`, `roasted corn flour` | Active `ingredient-ref-roasted-corn-flour` |
| `corn` | Legacy-only `ingredient-ref-corn`; no active generic `corn` key |

No scanned candidate or comparator key has an exact form match. The near-neighbor table above lists exact regional/product names only; the active corn-kernel and corn-on-the-cob references remain more specific and are not aliases of the flour candidate.

All **1,123 ingredient rows** in the **114 manifest-listed recipe files** were searched across every string field, including original text, ingredient name, reference ID, notes, and preparation. Whole-term phrase queries covered the candidate’s Spanish flour and crop names, English black/purple corn and maize names with and without “flour,” the French color-specific terms, and the exact comparison names *cornmeal*, *corn meal*, *semoule de maïs*, *corn flour*, *farine de maïs*, *whole-kernel corn flour*, *hominy grits*, *precooked corn flour*, and *roasted corn flour*. **Zero candidate rows and zero comparator rows matched.** Generic corn-related recipe mentions, if any, were not treated as evidence for the source-named candidate.

## Source register and limits

### New source IDs

| ID | Source and claim scope |
| --- | --- |
| `WP06-MAIZNEGRO-20261009-S01` | INIAP, *Ficha técnica de la variedad de Maíz Negro INIAP-199 “Racimo de Uva”*, 2016. [Repository item](https://repositorio.iniap.gob.ec/items/b7938798-b44d-4a2c-9632-04e749ae970e). Supports *maíz morado/negro* and *Zea mays L.* at the variety/crop level. |
| `WP06-MAIZNEGRO-20261009-S02` | INIAP, “Liberación de nueva variedad de maíz INIAP-199 ‘Racimo de uva’,” 2016. [Article](https://www.iniap.gob.ec/liberacion-de-nueva-variedad-de-maiz-iniap-199-racimo-de-uva-se-realizo-en-chimborazo/). Supports flour use in colada morada and chicha morada for the named variety. |
| `WP06-MAIZNEGRO-20261009-S03` | INIAP, *El despertar gastronómico del maíz: Recetario*, 2016. [Repository PDF](https://repositorio.iniap.gob.ec/bitstreams/3d1138b4-192d-4185-9b15-fe987d513e80/download). Supports flour of purple maize for colada morada and separate germinated-maize flour for chicha. |
| `WP06-MAIZNEGRO-20261009-S04` | Municipio de Latacunga marketplace, “HARINA DE MAIZ NEGRO,” listing under Molinos San Carlos. [Product page](https://xn--suea-iqa.latacunga.gob.ec/producto/harina-de-maiz-negro/). Market-name evidence only; no product specification. |
| `WP06-MAIZNEGRO-20261009-S05` | OQLF, GDT, “farine de maïs,” updated 2025. [Entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais). Supports fr-CA generic flour terminology and EN *corn flour*; not a color-specific Ecuadorian label. |
| `WP06-MAIZNEGRO-20261009-S06` | Ecuador Servicio Ecuatoriano de Normalización, draft `PRTE INEN 241`, *Harina de trigo y harina de maíz*. [Official draft PDF](https://www.normalizacion.gob.ec/buzon/reglamentos/PRTE-241.pdf). Cites NTE INEN 2051 for maize flour and NTE INEN 1737 for precooked maize flour; draft, not operative regulation or black-maize specification. |

### Existing source reused by ID only

- `WP06-SOUTHAM-20261009-S07` is documented in [the South American cuisine gap sweep](wp06-south-american-cuisine-gap-sweep-20261009.md) and links Ecuador Travel’s *What to Eat – Gastronomía* page. It supports the colada morada compound-beverage context; the source record is not duplicated.

### Query log and evidence limits

Queries included: `site:repositorio.iniap.gob.ec maíz negro harina`; `site:iniap.gob.ec maíz negro harina Ecuador`; `site:normalizacion.gob.ec “NTE INEN 2051” harina`; `site:normalizacion.gob.ec “maíz negro” harina`; `site:vitrinelinguistique.oqlf.gouv.qc.ca farine de maïs`; `site:vitrinelinguistique.oqlf.gouv.qc.ca maïs noir farine`; and searches for Ecuadorian *harina de maíz negro* product listings. No official black-maize flour specification or OQLF color-specific entry surfaced in the bounded search. This is not proof that no such specification, product label, or regional Québec usage exists.

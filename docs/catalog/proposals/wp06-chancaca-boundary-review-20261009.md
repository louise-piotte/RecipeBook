# WP06 — Chilean chancaca product-boundary review

- **Reviewed:** 2026-10-09
- **Status:** Integrated as `ingredient-ref-chilean-chancaca`; coordinator evidence and verification are recorded in [`docs/catalog/batches/wp06-chilean-chancaca-identity-20261009/README.md`](../batches/wp06-chilean-chancaca-identity-20261009/README.md). The 481-reference and 17-form audit below is the pre-integration snapshot.
- **Scope:** Assess the Chilean product name *chancaca* against active panela, piloncillo, and rapadura identities; check national food definitions and fr-CA naming; scan exact package keys and recipe rows.
- **New source-ID prefix:** `WP06-CHANCACA-20261009-S`. Checked against the current proposal and ledger files; no prior IDs with this prefix were found.

## Recommendation

**Accept a Chile-qualified chancaca sweetener identity**, tentatively in `SUGAR_AND_SWEETENER`, distinct in the catalog from panela, piloncillo, rapadura, cane jaggery/gur, and generic brown sugar. The Chilean Reglamento Sanitario de los Alimentos (RSA) gives chancaca a specific legal product definition and composition limits. The Argentine food code uses the same name for a mascabado product in tablet or totora-wrapped form, so the display should preserve the Chile scope.

- **EN display:** *Chilean chancaca*
- **fr-CA display:** *chancaca chilienne* — **provisional** pending Québec terminology review; preserve the source name rather than translating it as generic brown or unrefined sugar.
- Keep the Chilean term *chancaca* searchable only as the source name of this region-qualified candidate. Do not alias it to another country’s cane sweetener or make it a family-wide synonym.

This is a country-scoped naming decision, not a finding that chancaca has a unique process or composition across Latin America. Chile’s legal definition itself allows either sugarcane or sugar-beet juice. The reviewed sources show overlapping concentrated-sugar processes among these named products, but no national definition establishes cross-market synonymy.

## Product boundary and standards evidence

| Product/name in source | Source definition or scope | Catalog implication |
| --- | --- | --- |
| **Chancaca, Chile** | Chile’s current consolidated RSA, Article 382, defines the product as made by concentrating and crystallizing purified juice from sugarcane **or sugar beet**. It sets a minimum of 80% sucrose and maxima of 1% water-insoluble matter, 1.2% ash, and 6% moisture. This is a Chilean food regulation, not a claim that every retail product labeled chancaca follows one recipe. [New source S01](https://www.bcn.cl/leychile/navegar?idNorma=71271) | Supports a Chile-qualified sweetener identity and country-specific legal boundary. Do not assume cane origin when the regulation also permits beet. |
| **Chancaca, Argentina** | The current Argentina.gob.ar copy of Código Alimentario Argentino (CAA), Chapter X, places chancaca under Article 771’s unrefined sugar provisions and describes it as mascabado sugar presented in tablets or wrapped in totora as *mazos* or *lulos*. The clause cites Resolution 3363/1979; the chapter file is updated through 2025-11. [New source S02](https://www.argentina.gob.ar/sites/default/files/capitulo_x_azucarados_actualiz_2025-11.pdf) | Demonstrates that the unqualified regional name has jurisdiction-specific scope and presentation. Do not use the Argentine definition as a substitute for Chile’s RSA definition. |
| **Chancaca, regional Spanish usage** | ASALE’s *Diccionario de americanismos* records a broad sense for unrefined cane sugar solidified in a prism or truncated cone across several countries, including Chile, and a separate Chilean sense for a sauce prepared from chancaca, water, and flavorings. [New source S03](https://www.asale.org/damer/chancaca) | Useful lexical evidence of both regional overlap and a Chilean prepared-sauce sense; not a technical equivalence standard. |
| **Panela** | WP02’s Colombia INVIMA source defines panela from extracted and evaporated sugarcane juice (reused source `WP02-C-S03`). Peru’s INACAL CID catalog separately lists NTP 207.200:2013, *Panela granulada. Definiciones y requisitos*, for panela intended for human consumption and industrial use; only the catalog record was reviewed. [New source S04](https://www.inacal.gob.pe/repositorioaps/data/1/1/1/jer/catalogoespecializado/files/NAVIDAD.pdf) | Shows nationally named panela specifications, including a granulated product. The available catalog record does not compare panela directly with Chilean chancaca. |
| **Piloncillo** | WP02’s Mexico Diario Oficial source describes piloncillo as a product made from 100% sugarcane juice, in block or granulated form (reused source `WP02-C-S05`). | Keep the active piloncillo identity separate; no cross-alias follows from shared cane-juice concentration. |
| **Rapadura** | WP02’s Brazil ANVISA source defines rapadura as a solid concentrated sugarcane-juice product and distinguishes it from liquid melado (reused source `WP02-C-S09`). | Keep the active rapadura identity separate; solid presentation and process overlap do not establish equivalence. |

The historical Colombia Codex work proposal groups several regional names, including chancaca, within a proposed panela standard. WP02 source `WP02-C-S04` already records the evidence limit: it was a proposal, not an adopted global synonym standard. This packet reuses that source by ID and does not register a duplicate.

The standards support a narrow conclusion: Chile has a separately named and regulated product that merits its own searchable, Chile-qualified identity. They do **not** prove that every chancaca product is chemically or technologically distinct from every panela, piloncillo, or rapadura product. Keep the catalog identities separate because the available product definitions are jurisdiction-specific and do not establish interchangeable names or recipe behavior.

## Culinary use and fr-CA naming

The Chile Travel culinary article already recorded as `WP06-SOUTHAM-20261009-S16` describes sweet chancaca sauce served with sopaipillas. ASALE separately records the Chilean sauce sense as chancaca prepared with water and flavorings. These are use and lexical observations, not a standardized syrup formula. Treat *salsa/baño de chancaca* as a prepared recipe component if it is encountered; do not model it as a liquid form or alias of solid chancaca without a recipe-specific product definition.

A Montréal retailer’s French-language product page lists a 200 g Chile-imported product as *Chancaca Deliciosa*, preserving the source name in local commerce (new source S05). This is one retail label, not Québec terminology authority. Targeted searches of OQLF terminology pages for *chancaca*, *panela*, *piloncillo*, and *rapadura* did not locate an entry. That absence is limited search evidence, not proof that no established Québec usage exists. Keep *chancaca chilienne* provisional; the retailer’s unchanged label supports retaining *chancaca* rather than inventing a French equivalent.

## Decisions for coordinator review

| Item | Decision | Proposed handling |
| --- | --- | --- |
| Chile-defined chancaca | **Accept** | Add as a separate, region-qualified `SUGAR_AND_SWEETENER` identity, proposed EN *Chilean chancaca* and provisional fr-CA *chancaca chilienne*. Preserve the source term. |
| Alias to panela | **Defer / do not alias** | Colombia and Peru have panela-specific national evidence; no direct comparative standard or source establishes that the Chilean legal product is an alias for panela. |
| Alias to piloncillo | **Defer / do not alias** | Mexico’s product specification is cane-juice-based and defines block or granulated presentations; it does not authorize a chancaca cross-name. |
| Alias to rapadura | **Defer / do not alias** | Brazil’s standard defines a separate solid cane-juice product. Similar concentration and solid form are insufficient evidence for a cross-alias. |
| Alias to cane jaggery/gur, muscovado, demerara, turbinado, brown sugar, or generic “unrefined sugar” | **Defer / do not alias** | The WP02 boundaries remain in force. Do not infer equivalence from color, sweetness, shared cane origin, or the historical Codex proposal. |
| Cane-origin vs. beet-origin chancaca | **Defer as a split** | Chile RSA Article 382 covers both feedstocks under one name. The reviewed material does not support separate identities or a retail distinction. |
| *Salsa/baño de chancaca* or chancaca syrup | **Defer as a separate prepared product** | Evidence supports a sauce use, not a standardized ingredient, recipe formula, liquid form, or synonym for the solid sweetener. |
| Québec French display | **Accept provisionally** | Use *chancaca chilienne* until independent Québec review; preserve the source name. The Montréal listing is market evidence only. |
| Density, package yield, unit mapping, and substitutions | **Defer** | No source reviewed supplies a validated measure, density, yield, or replacement ratio for a specified chancaca product and preparation. Do not transfer panela, piloncillo, rapadura, molasses, or brown-sugar values. |
| Recipe relinking | **No action** | The exact audit found no chancaca or comparator-name hits in bundled ingredient rows. |

## Exact live-package audit

Pre-integration audit snapshot: 2026-10-09, using the then-live `app/src/main/assets/seed/bundled-library` manifest and `tools/seed_package/bundled_seed_package.py::normalize_search_key`. The key function applies Unicode NFKD, case folding, accent/ligature folding, punctuation-to-space normalization, and trimming.

- Active ingredient references: **481**; file SHA-256 `0279b730ce312b11048fe93237f93558b116318e9fb231d6b93173b6dc9e7be8`.
- Active ingredient forms: **17**; file SHA-256 `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15`.
- Legacy identity candidates: **99**; file SHA-256 `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b`.
- Manifest lists **114** recipe JSON files; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Recipe-content aggregate SHA-256, computed in manifest order from each relative path, NUL, per-file SHA-256 hex, and newline: `e80d97c204558cb88e7a773c04b59742c116f595f10970c6785d25714a7e5397`.

The pre-integration exact catalog/form/legacy key scan included *chancaca*, Chile qualifiers, *chancaca sugar/syrup/sauce*, *salsa de chancaca*, *sucre de chancaca*, and the comparator names. Exact current owners at that snapshot were:

| Exact normalized key | Exact owner |
| --- | --- |
| *panela* | Active `ingredient-ref-panela` (French and English display names) |
| *piloncillo* | Active `ingredient-ref-piloncillo` (French and English display names) |
| *rapadura* | Active `ingredient-ref-rapadura` (French and English display names) |
| *cane jaggery*, *cane gur*, *gur de canne* | Active `ingredient-ref-cane-jaggery` |
| *brown sugar*, *dark brown sugar*, *light brown sugar* | Active `ingredient-ref-brown-sugar` |
| *granulated sugar*, *sugar*, *sucre* | Active `ingredient-ref-granulated-sugar`; *sugar* and *sucre* also occur on legacy `ingredient-ref-sugar` |
| *molasses* | Legacy `ingredient-ref-molasses`; this is not an active generic molasses identity |

No exact key for *chancaca* or its scanned EN/fr-CA qualifiers/sauce/syrup phrases exists in the active references, forms, or legacy candidates. No comparator regional name has an exact form match. The related exact owners above are not proposed as aliases.

All **1,123 ingredient rows** in the **114 manifest-listed recipe files** were searched across every string field in each row, including original text, ingredient name, reference ID, notes, and preparation. The whole-term scan covered chancaca and its tested country/language/sauce/syrup phrases plus panela, piloncillo, rapadura, cane jaggery/gur, muscovado, demerara, turbinado, kokuto, panocha, papelón, raspadura, and tapa de dulce. **Zero regional-name row hits** were found. Generic *sugar* and *brown sugar* mentions were excluded from that result; they are existing recipe ingredients and do not indicate chancaca use.

## Evidence limits and source register

The Chile RSA is a national food regulation; the Argentina CAA is a separate jurisdictional code. Neither document proves the composition of every product sold under a regional name. ASALE is authoritative for recorded regional Spanish senses, not technical specifications. The INACAL source is an official catalog record, not the full NTP text. The Chile Travel article is culinary tourism material, and S05 is a single retailer listing. No source reviewed gives a cross-standard laboratory comparison, equivalent form specification, household-measure conversion, or substitution ratio.

### New sources

| ID | Source and claim scope |
| --- | --- |
| `WP06-CHANCACA-20261009-S01` | Chile, Ministerio de Salud, Decreto 977, *Reglamento Sanitario de los Alimentos*, current consolidated Ley Chile page, Article 382. [Official text](https://www.bcn.cl/leychile/navegar?idNorma=71271). Supports Chilean definition and composition limits. |
| `WP06-CHANCACA-20261009-S02` | Argentina, *Código Alimentario Argentino*, Chapter X, updated 2025-11, Article 771 chancaca clause citing Resolution 3363/1979. [Official chapter PDF](https://www.argentina.gob.ar/sites/default/files/capitulo_x_azucarados_actualiz_2025-11.pdf); [CAA index](https://www.argentina.gob.ar/anmat/codigoalimentario). Supports Argentina-specific name and presentation. |
| `WP06-CHANCACA-20261009-S03` | ASALE, *Diccionario de americanismos*, entry “chancaca.” [Entry](https://www.asale.org/damer/chancaca). Supports recorded regional sugar and Chilean sauce senses; not a product standard. |
| `WP06-CHANCACA-20261009-S04` | Peru, INACAL Centro de Información y Documentación, specialized catalog, entry for NTP 207.200:2013, *Panela granulada. Definiciones y requisitos*. [Official catalog PDF](https://www.inacal.gob.pe/repositorioaps/data/1/1/1/jer/catalogoespecializado/files/NAVIDAD.pdf). Supports the standard’s listed title and scope only. |
| `WP06-CHANCACA-20261009-S05` | Tikitikiti Montréal, French-language product page, “Chancaca Deliciosa 200 g,” identified as imported from Chile. [Retail page](https://tikitikiti.com/fr/products/chancaca-deliciosa-250gr). One local label; not Québec terminology authority. |

### Existing sources reused by ID only

- `WP02-C-S03`, `WP02-C-S04`, `WP02-C-S05`, and `WP02-C-S09` are documented in [WP02 Section C](wp02-cane-sweeteners-boundary-review-20261009.md). Their source records are not duplicated.
- `WP02-C-S12` supplies Québec retail wording for panela; `WP02-C-S20` supplies French retail wording for rapadura outside Québec. Neither establishes chancaca equivalence or a Québec French term.
- `WP06-SOUTHAM-20261009-S16` is documented in [the South American cuisine gap sweep](wp06-south-american-cuisine-gap-sweep-20261009.md) and links the Chile Travel culinary article used for sopaipilla/chancaca context. Its source record is not duplicated.

### Query log

Queries included: `site:bcn.cl/leychile Decreto 977 chancaca artículo 382`; `site:ecommerce.inn.cl chancaca`; `site:inn.cl chancaca norma producto azúcar`; `site:argentina.gob.ar/anmat/codigoalimentario chancaca`; `site:inacal.gob.pe NTP 207.200 panela granulada`; `site:vitrinelinguistique.oqlf.gouv.qc.ca chancaca`; and targeted OQLF searches for *panela*, *piloncillo*, and *rapadura*. No chancaca-specific NCh product standard or OQLF terminology entry surfaced in these bounded searches; that is not proof none exists.

# WP02 Section C — golden syrup / sirop doré identity review

- **Reviewed:** 2026-10-11
- **Status:** proposal authored by WP02; root independently reviewed and integrated the identity-only row.
- **Plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section C, open syrup/molasses checklist at lines 1395–1396.
- **Scope:** the sugar-refining syrup sold/called golden syrup; current Canadian and Québec naming; boundaries from golden corn syrup, corn/glucose syrup, invert sugar, maple syrup, molasses and treacle; bundled recipe demand and evidence for measures or substitutions.

## Recommendation

**Accept a separate, identity-only `golden syrup / sirop doré` reference.** The Canadian Food Compositional Standards give “refined sugar syrup,” “refiners’ syrup,” and “golden syrup” one standard product class: syrup made from syrup originating in sugar refining, which may be hydrolyzed. A current Canadian manufacturer sells Rogers Golden Syrup from blended refinery cane syrups and calls it *sirop doré Rogers* on its French site. This is enough to distinguish the product from the catalog’s current corn, glucose, invert, maple, and blackstrap molasses references.

Proposed fields for coordinator review:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-golden-syrup` |
| Category | `SUGAR_AND_SWEETENER` |
| English display | `golden syrup` |
| fr-CA display | `sirop doré` |
| English aliases | `refined sugar syrup`; `refiners' syrup` |
| French aliases | `sirop de sucre raffiné`; `sirop de raffineur`; `mélasse claire`; `mélasse légère` |
| Forms, density, unit mappings | None; leave null/empty |
| Recipe links and substitutions | None |

The English and French standard co-names are directly supported by CFIA [S01–S02]. OQLF lists *mélasse claire* and *mélasse légère* as preferred Québec French terms for the English concept *golden syrup* [S03]. Keep unqualified `molasses` / `mélasse`, `treacle`, and grade- or market-scoped English expressions out of the alias set. The OQLF French terms should not be read as resolving generic molasses: CFIA treats golden syrup and molasses products under separate standards, and the legacy generic molasses candidate remains unresolved.

## Live repository audit

Snapshot rechecked against the live package on 2026-10-11:

- Active package: 936 ingredient references and 52 forms.
- Recipe manifest: 114 recipe files; all 1,123 ingredient rows scanned.
- Legacy import file: 75 candidates.
- Research ledger: 1,201 records.
- The Section C syrup/molasses row remains unchecked.

The exact-key audit used the repository normalization in `tools/seed_package/bundled_seed_package.py` (`normalize_search_key`: case folding, accent/ligature folding, punctuation-to-space normalization). No exact normalized key for `golden syrup`, `sirop doré`, `refined sugar syrup`, `refiners' syrup`, `sirop de sucre raffiné`, `sirop de raffineur`, `mélasse claire`, `mélasse légère`, `golden corn syrup`, `sirop de maïs doré`, or `treacle` is owned by an active reference, form label/match term, or legacy candidate. The no-match result is consistent with the app phrase search: `golden syrup` does not occur as a consecutive phrase in `golden corn syrup`, and `sirop doré` does not occur as a consecutive phrase in `sirop de maïs doré`.

Relevant current owners and holds:

| Current owner | State | Boundary relevance |
| --- | --- | --- |
| `ingredient-ref-corn-syrup` — corn syrup / sirop de maïs | Active | Keep separate; the CFIA French label guidance names corn syrup and golden/refiners’ syrup separately [S02]. |
| `ingredient-ref-dark-corn-syrup` — dark corn syrup / sirop de maïs foncé | Active | Separate product; one exact corpus row is noted below. |
| `ingredient-ref-glucose-syrup` — glucose syrup / sirop de glucose | Active | CFIA defines glucose syrup as concentrated saccharides from incomplete starch hydrolysis, separately from the sugar-refining syrup class [S01]. |
| `ingredient-ref-invert-sugar` and `ingredient-ref-liquid-invert-sugar` | Active | Keep distinct. Golden syrup may be hydrolyzed, but the standard defines invert sugar by hydrolysis; it does not make the names equivalent [S01]. |
| `ingredient-ref-maple-syrup` — maple syrup / sirop d’érable | Active | Keep separate; the maple standard defines it by exclusive concentration of maple sap or dilution/solution of a maple product [S06]. |
| `ingredient-ref-blackstrap-molasses` — blackstrap molasses / mélasse verte | Active | Keep separate from golden syrup and from the unresolved generic candidate. |
| `ingredient-ref-pomegranate-molasses` — pomegranate molasses / mélasse de grenade | Active | Separate sauce/condiment identity; the shared word `molasses` does not make it a sugar-refining syrup. |
| `ingredient-ref-molasses` — molasses / mélasse | Legacy candidate, unreviewed | Exact owner of generic molasses wording only. Do not promote it to golden syrup, a grade, or an alias. |

No target reference/form/candidate owns the exact golden-syrup keys. Existing ledger research does contain earlier source observations, but no dedicated golden-syrup identity record: CFIA standard/label observations are attached to prior syrup records, the OQLF golden-syrup terminology is attached to the held generic molasses candidate, and the Le Creuset recipe observation is attached to dark corn syrup. The new source-ID prefix `WP02-C-GS-20261011-S` had no collision in the 1,201 live ledger records.

### Recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were searched by normalized phrase across `originalText` and `ingredientName`. **There are zero exact ingredient rows for golden syrup, sirop doré, refiners’ syrup, refined sugar syrup, treacle, golden corn syrup, molasses, or mélasse.** The only adjacent syrup/molasses-boundary row found is:

| Recipe line | Current link | Disposition |
| --- | --- | --- |
| `recipes/109-tarte-aux-pacanes-pecan-pie-02721958-323d-47a4-96df-d383ae0994ff.v1.json`, ingredient 3: `1/3 cup dark corn syrup` | `ingredient-ref-dark-corn-syrup` | Keep as dark corn syrup; it is not golden-syrup demand. |

The corpus therefore supplies no reason to create a recipe link, form, or substitution rule for golden syrup.

## Product boundary: source facts and proposed interpretation

| Source facts | Proposed interpretation (inference) |
| --- | --- |
| CFIA standard 15.1.7 names refined sugar syrup, refiners’ syrup, and golden syrup together; describes the food as made from syrup originating in sugar refining; sets maximum moisture and sulphated-ash levels and permits hydrolysis [S01]. | A refinery-origin syrup with optional hydrolysis is a product identity, not a generic synonym for every invert syrup, molasses, or sweet syrup. The standard supports identity, not a single brand recipe or exact sugar profile. |
| The same Canadian standard defines invert sugar separately by partial or complete sugar hydrolysis and liquid invert sugar as a solution of invert sugar; it defines glucose syrup through starch hydrolysis [S01]. | Do not alias golden syrup to active invert sugar, liquid invert sugar, glucose syrup, or corn syrup. Chemical/process overlap in some golden-syrup products is not evidence of catalog synonymy. |
| CFIA distinguishes fancy molasses (evaporated cane juice with no prior sugar extraction), table molasses (liquid food from raw/refined sugar manufacture), and refiners’/blackstrap/cooking molasses (residual liquid from sugar manufacture) [S01]. | Do not map golden syrup to generic molasses or any of these named molasses classes. The related words “refiners’ syrup” and “refiners’ molasses” denote distinct named classes in the standard. |
| CFIA French ingredient-label guidance lists *sirop doré* and *sirop de sucre raffiné / sirop de raffineur* separately from *sirop de maïs doré*, *sirop de maïs*, *sirop de glucose*, and *mélasse*. Its illustrative golden-corn-syrup ingredients are glucose, water, refiners’ syrup, salt, and vanillin [S02]. | Golden corn syrup is a distinct blended product name, not an alias for golden syrup. Do not alias the proposed reference to the active corn or glucose syrup references. The example formula is one label illustration, not a universal golden-corn-syrup formula. |
| OQLF’s 2024 entry identifies *mélasse claire* and *mélasse légère* as preferred terms and gives *golden syrup* as the English term; its definition describes an amber, caramel-flavoured product after the first sugar extraction. It marks *light treacle* as UK and also lists *first molasses* and *light molasses* [S03]. | Use the preferred French terms as exact aliases, alongside the official Canadian label name *sirop doré*. Do not activate *light treacle*, *first molasses*, or *light molasses* globally: their market/grade scope is not captured by the catalog alias fields, and generic molasses remains unresolved. |
| Rogers/Lantic describes Rogers Golden Syrup as made from selected blended refinery cane syrups, says it is preferred over corn syrups and other liquid sweeteners, offers a 750 mL bottle, and states Western Canada availability. Its French page calls the same product *Sirop doré Rogers* [S04–S05]. | Current primary Canadian product evidence supports *golden syrup / sirop doré* and a cane-refinery product example. “Preferred over” is manufacturer positioning, not a substitution ratio. Western Canada availability does not establish Québec shelf availability or a universal composition. |
| Lyle’s describes its own golden syrup as “light treacle,” a sugarcane-refining by-product and an inverted sugar syrup with caramel flavour; Lyle’s separately lists Golden Syrup and Black Treacle products [S07–S08]. | This confirms one UK manufacturer’s product and its own terminology. It does not make unqualified `treacle`, `light treacle`, or `black treacle` a global alias, nor does the brand description override Canadian product-class boundaries. |
| Canada’s maple standard defines maple syrup by exclusive concentration of maple sap or dilution/solution of a maple product [S06]. | Do not merge golden syrup with maple syrup. Canadian standard identity is source-bounded to maple products. |

## Measures, packages, conversions, yield, and substitution

- **Package evidence:** Rogers/Lantic currently lists a 750 mL bottle and Western Canada availability [S04–S05]. This is a product/package listing, not a mass–volume pair or a package-yield relationship. Lyle’s current product page is for a 454 g bottle [S07]; that brand-specific net mass is not a volume conversion and should not be transferred to Rogers or a generic golden-syrup reference.
- **Recipe measure:** Le Creuset Canada’s French recipe lists `1 c. à soupe de golden syrup (sirop de sucre inverti) ou de sirop de maïs foncé` for one crunchy honeycomb topping [S09]. This is a single recipe’s stated volume amount and alternative; the page supplies no paired mass. Preserve its parenthetical as source wording, not as an alias for active invert sugar.
- **Substitution:** The same Le Creuset line supports only a recipe-scoped alternative between golden syrup and dark corn syrup for that topping, at the same listed 1 tablespoon amount. Do not create a global/context-free substitution rule. Rogers’ marketing comparison to corn syrup is not substitution evidence.
- **Conversion and yield:** No reviewed source gives a golden-syrup mass per spoon/cup, density, conversion, cooking yield, package-to-recipe yield, or general replacement ratio. Do not borrow the Health Canada values for corn syrup, dark corn syrup, or maple syrup, or a density from another brand/product.

## Proposed integration boundary

1. Add one identity-only candidate/reference with the fields proposed above after coordinator review.
2. Keep it separate from corn syrup, dark corn syrup, glucose syrup, invert sugar, liquid invert sugar, maple syrup, all molasses references/candidates, and treacle.
3. Keep the generic legacy molasses candidate unresolved. OQLF-supported *mélasse claire* / *mélasse légère* can be aliases for this exact golden-syrup identity, but do not add generic *mélasse*.
4. Add no form, density, unit mapping, package yield, recipe link, conversion, or global substitution. If recipe 109 remains the only relevant corpus row, it stays linked to dark corn syrup.
5. Treat the Le Creuset option as an exact recipe-source observation only; its `sirop de sucre inverti` parenthetical does not revise the identity boundary.

## Source register and locators

Accessed 2026-10-11. `S01–S03` and `S09` were already represented in the ledger under older WP02-C-SYR source IDs; their current pages were rechecked. New local citation IDs below are proposal locators only and do not add ledger records.

| ID | Source and locator | Claim supported; limits |
| --- | --- | --- |
| S01 (existing `WP02-C-SYR-20261009-S01`) | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 15, sections 15.1.3–15.1.4, 15.1.7–15.1.12. | Official Canadian product classes and compositional limits for golden/refiners’ syrup, invert sugar, molasses classes, and glucose syrup. It does not specify one retail golden-syrup formula. |
| S02 (existing `WP02-C-SYR-20261009-S02`) | CFIA, [Liste d’ingrédients et allergènes sur les étiquettes des aliments](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/liste-dingredients-allergenes), section C and example for a prepackaged *sirop de maïs doré*. | Canadian French common-name list and one illustrative golden-corn-syrup ingredient list. It is labeling guidance/example, not a formula standard for every product. |
| S03 (existing `WP02-C-SYR-20261009-S04`) | OQLF, [mélasse claire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296894/melasse-claire), 2024 entry: definition, preferred terms, and English terms. | Québec terminology and direct *golden syrup* mapping. The entry also lists region-/grade-scoped English terms; those are not proposed as global aliases. |
| S04 (`WP02-C-GS-20261011-S01`) | Rogers & Lantic Sugar, [Rogers Golden Syrup](https://lanticrogers.com/en/products/rogers-golden-syrup/), product description and “Available Formats” (750 mL; Western Canada). | Current Canadian maker’s refinery-cane-syrup product description and package size/market. No ingredient panel or mass-per-volume value on the page. |
| S05 (`WP02-C-GS-20261011-S02`) | Rogers et Lantic Sucre, [Sirop doré Rogers](https://lanticrogers.com/fr/products/sirop-dore-rogers/), product name, description, and “Formats disponibles” (750 mL; Ouest du Canada). | Current manufacturer’s French Canadian-facing product naming and same product description/package. It does not establish Québec retail availability. |
| S06 (`WP02-C-GS-20261011-S03`) | CFIA, [Canadian Standards of Identity: Volume 6 — Maple Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-6), section 1. | Maple syrup is obtained exclusively by concentrating maple sap or by dilution/solution of a maple product in potable water; supports a separate botanical/source boundary. |
| S07 (`WP02-C-GS-20261011-S04`) | Lyle’s, [Golden Syrup Bottle 454g](https://www.lylesgoldensyrup.com/product/lyles-golden-syrup-bottle-454g/), “What is Golden Syrup?” and product title. | One current brand’s cane-refinery origin, inversion description, flavour characterization, light-treacle wording, and package net mass. Brand-specific, not universal. |
| S08 (existing `WP02-C-SYR-20261009-S11`) | Lyle’s, [Our Products](https://www.lylesgoldensyrup.com/our-products/) and [Golden Syrup FAQ](https://www.lylesgoldensyrup.com/faq/). | Separately marketed Golden Syrup and Treacle/Black Treacle products; golden syrup made during sugarcane refining. Supports boundary, not a global treacle definition. |
| S09 (existing `WP02-C-SYR-20261009-S13`) | Le Creuset Canada, [Muffins au caramel à garniture croquante](https://www.lecreuset.ca/fr_CA/muffins-au-caramel-a-garniture-croquante/LCRCA-0084.html), “Garniture croquante” ingredient list. | One line gives 1 tbsp golden syrup or dark corn syrup and parenthetically calls it *sirop de sucre inverti*. One recipe only; no paired mass or universal synonym/substitution. |

### Search record

Targeted searches included CFIA’s current English/French standards and label guidance; OQLF’s *mélasse claire* record; the Rogers/Lantic English and French product pages; Lyle’s official product page and product range; CFIA’s maple standard; and the Le Creuset Canada recipe. The review did not use general-purpose recipe blogs or user-generated sources for identity or conversion claims.

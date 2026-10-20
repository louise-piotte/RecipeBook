# WP02 Section C — malt syrup and rice-malt boundary review

- **Round:** R349
- **Reviewed:** 2026-10-16
- **Status:** Integrated as a documentation-only boundary hold; see the [R349 integration README](../batches/wp02-section-c-malt-syrup-picker-hold-integration-r349-20261016/README.md). No shared catalog or ledger data changed.
- **Scope:** unqualified malt syrup; barley malt syrup / malted barley syrup; malt extract and malt flour boundaries; rice malt syrup / brown rice malt syrup; Korean jocheong; Japanese amazake and koji-derived products.
- **Plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section C, “Light/dark corn syrup, glucose syrup, golden syrup, invert sugar, treacle, regular/fancy molasses, blackstrap molasses, malt syrup, and rice syrup.” The broad Section C item remains open.

## Recommendation

**Do not activate any new malt-syrup or rice-malt identity or alias in this round.** The evidence supports a real, searchable *qualified barley malt syrup* product class, but the terms around it do not define one stable formula or a safe set of global aliases. Generic `malt syrup / sirop de malt` can refer to barley-, wheat-, or rice-based products. Canadian product evidence uses `malted barley syrup` for both a barley-only sweetener and compound/upcycled syrups containing other grain materials. The phrase-first picker would also make an alias such as `barley malt syrup / sirop de malt d’orge` appear for the broader queries `malt syrup / sirop de malt`.

Keep `rice malt syrup` and `brown rice malt syrup` unassigned as well. The wording is applied to a rice-only brown-rice syrup by one producer and to rice-plus-barley-malt ingredients by others. A Canadian Korean-market listing separately sells a rice-and-malt product as `Rice Syrup`; a Korean rice-industry product listing calls one such item `Rice Jocheong`. These do not support aliases to the existing `brown rice syrup` reference.

This is an activation hold, not a claim that the products do not exist. If a recipe later requests a specific product, the strongest future candidate is a bounded barley malt syrup identity tied to the recipe’s exact wording and product evidence. Keep generic `malt syrup`, `malted barley syrup`, `barley malt syrup`, and their French variants separate until picker results can preserve that scope. Keep rice-malt terms separate from brown rice syrup and jocheong until an exact recipe or product target resolves the intended product.

## Current catalog, ownership, and recipe audit

The live bundled reference catalog contains 1,690 references and 132 forms. Related active rows include:

| Active owner | Current record and boundary |
| --- | --- |
| `ingredient-ref-malt-flour` | `malt flour / farine maltée`, alias `malted cereal flour`, category `FLOUR_AND_STARCH`. This is a milled malted-grain product. Its ledger decision keeps cereal-specific malt flours, malt extract, and malt syrup separate. |
| `ingredient-ref-malted-barley-flour` | `malted barley flour / farine d’orge maltée`, alias `malt barley flour`, category `FLOUR_AND_STARCH`. Keep separate from malt syrup and extract. |
| `ingredient-ref-brown-rice-syrup` | `brown rice syrup / sirop de riz brun`, category `SUGAR_AND_SWEETENER`, with no aliases, default density, or unit mappings. Its verified ledger record explicitly leaves generic rice syrup, brown rice malt syrup, malt syrup, jocheong, amazake, and koji products separate or unresolved. |
| `ingredient-ref-glucose-syrup` | `glucose syrup / sirop de glucose`, category `SUGAR_AND_SWEETENER`. It is not an alias target for malt syrup or rice-malt syrup. |
| `ingredient-ref-amazake` | Shared display `amazake`, category `OTHER`; its ledger describes a beverage product. |
| `ingredient-ref-shio-koji` | `shio koji`, with `salt koji / koji au sel` aliases, category `SAUCE_AND_CONDIMENT`. The salted condiment remains distinct from rice koji, amazake, and syrups. |

The syrup and molasses boundaries also remain in place: active `golden syrup / sirop doré`, `blackstrap molasses / mélasse verte`, and `fancy molasses / mélasse de fantaisie`; pomegranate molasses is a condiment. Generic `molasses / mélasse` remains a legacy-only, unresolved candidate with no active generic row. The R346 treacle review retains its hold and did not add aliases to golden syrup or blackstrap molasses. No malt-syrup term is an alias on these rows.

No exact legacy-import candidate remains for `malt syrup`, `malted barley syrup`, `barley malt syrup`, `malt extract`, `rice malt syrup`, `brown rice malt syrup`, `rice syrup`, or `jocheong`. The existing `brown rice syrup` identity has already been promoted from its legacy candidate. Existing source ownership is in the ledger for brown rice syrup (`WP02-C-BRS-20261011-S01a` through `S13`), generic malt flour (`WP02-MALT-FLOUR-IDENTITY-20261010-S01` through `S03`), malted barley flour (`WP02-S110` through `S113`), amazake (`WP05-JP-PANTRY-20261010-S04`), and shio koji (`WP05-SHIOKOJI-IDENTITY-20261010-S01` through `S06`). No ledger record assigns a global identity or alias to the in-scope malt-syrup terms. The earlier malt-extract coordinator recheck is proposal-only and also recommended leaving generic malt syrup unresolved.

All 114 bundled recipe files and 1,123 ingredient rows were scanned for `malt syrup`, `malted barley syrup`, `barley malt syrup`, `malt extract`, `malt flour`, `brown rice syrup`, `brown rice malt syrup`, `rice malt syrup`, `rice syrup`, `jocheong`, `amazake`, `koji syrup`, `mizuame`, and `yeotgireum`. No recipe JSON matched those terms. No recipe link or recipe-driven promotion is proposed.

## Canadian and Québec naming evidence

The names below support candidate search vocabulary, with clear limits on what each source establishes:

| Term | Supported claim | Limit |
| --- | --- | --- |
| `malt syrup / sirop de malt` | OQLF’s GDT entry prefers Québec French `sirop de malt` and gives English `malt syrup`. TERMIUM’s food-industry record says the source grain is usually barley but may be wheat or rice. | OQLF’s entry was last updated in 1964 and does not define composition. TERMIUM establishes a broader cereal range, not a single global formula. |
| `barley malt syrup / sirop de malt d’orge` | TERMIUM has a separate bilingual record for this qualified product term and gives a sweetener/cooking use description. Eden Foods currently labels a syrup `Barley Malt Syrup`; its manufacturer page lists organic sprouted barley and water. Well.ca’s Canadian French product listing calls the item `Sirop de malt d’orge biologique`. | The Eden composition is one product formula. TERMIUM terminology does not establish that every syrup with a barley-malt name is pure barley and water. |
| `malted barley syrup / sirop d’orge maltée` | CFIA’s current ingredient-name examples separately list `malted barley syrup` and `malt syrup`; the French list separately includes `sirop d’orge maltée` and `sirop de malt`. A Canadian Country Harvest bagel ingredient declaration names `malted barley syrup (corn, malted barley)`. | CFIA presents naming examples, not definitions. The local bagel declaration documents a compound ingredient in one food, not a universal stand-alone syrup formula. |
| Malt extract | OQLF defines `extrait de malt / malt extract` as a malt-wort concentrate obtained before fermentation and notes liquid and powder presentations. CFIA’s bread standard separately names malt syrup, malt extract, and malt flour as permitted additions. | The Canadian sources do not define malt syrup and malt extract as interchangeable. Terra Bioindustries uses both “malted barley extract” and “barley malt syrup” wording for its particular upcycled product, which documents product-level overlap rather than a universal synonym rule. |
| Rice-malt naming | Ceres Organics sells `Organic Brown Rice Malt Syrup`; its current manufacturer page describes a brown-rice syrup and lists certified organic rice at 100%. Coles’ `Organic Rice Malt Syrup` listing says the product ingredient is 100% organic brown rice syrup. | These retail/manufacturer examples support a rice-only use of the qualified phrase, not an unqualified `rice malt syrup` alias. |
| Brown rice malt syrup with barley malt | TerraSana’s 2025 manufacturer catalogue declares `brown rice malt syrup (brown rice + BARLEY malt)` in a cracker ingredient list. | A compound-ingredient declaration does not define all products carrying the term; it establishes that the wording can include barley malt. |
| Korean rice syrup / jocheong | The Canadian K Mart lists Chung Jung One `Rice Syrup`, describes rice fermentation/saccharification, and lists rice, malt, and water. Korea Rice Food Industry’s Rice Show lists one `Rice Jocheong (grain syrup)` product as rice 94%, malt 5.9%, enzyme 0.1%. | One retail SKU and one exhibitor product do not define all rice syrup or jocheong. The Canadian listing is product evidence, not a Québec terminology ruling. |
| Amazake and koji syrups | Japan MAFF describes amazake as a beverage family with rice-koji and sake-lees types. The existing Kojiro/Moryzae ledger source describes named fermented syrups made with rice koji, rice, herbs, and fruit. | These support separation from generic rice syrup. They do not establish a sweetener conversion or a generic koji-syrup identity. |

### Source register

Sources were accessed on 2026-10-16. IDs below are local to this proposal and were not added to the shared ledger.

| Source ID | Source and URL | Specific use and scope |
| --- | --- | --- |
| `WP02-C-MALT-R349-S01` | OQLF, [sirop de malt](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10491445/sirop-de-malt) | Supports the preferred Québec French term and English equivalent only; the record has no composition definition. |
| `WP02-C-MALT-R349-S02` | Government of Canada Translation Bureau, [TERMIUM Plus search for barley malt syrup](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enr&lang=eng&srchtxt=BARLEY+MALT+SYRUP) | Displays separate records for `barley malt syrup / sirop de malt d’orge` and `malt syrup / sirop de malt`. The generic entry says grains are usually barley but may also be wheat or rice. Record dates shown are 2010-06-14 and 2007-01-04; terminology, not a current composition standard. |
| `WP02-C-MALT-R349-S03` | CFIA, [List of ingredients and allergens on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens) | Annex 1B separately lists malt syrup, malted barley extract, malted barley syrup, rice syrup, and brown rice syrup as sweetening-agent ingredient-name examples. The page does not define their compositions. |
| `WP02-C-MALT-R349-S04` | CFIA, [Liste d’ingrédients et allergènes sur les étiquettes des aliments](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/liste-dingredients-allergenes) | Annex 1B separately lists `sirop d’orge maltée`, `sirop de malt`, `sirop de riz`, and `sirop de riz brun`. These are French ingredient-name examples, not a Québec terminology ruling or formula standard. |
| `WP02-C-MALT-R349-S05` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 12, 12.2.1(f) | Permits bread to contain malt syrup, malt extract, or malt flour as separate names. This provision does not define those ingredients or equate them. |
| `WP02-C-MALT-R349-S06` | OQLF, [extrait de malt](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086260/extrait-de-malt) | Defines malt extract as a malt-wort concentrate before fermentation and records liquid or powder presentations. It does not define malt syrup. |
| `WP02-C-MALT-R349-S07` | Eden Foods, [Barley Malt Syrup organic](https://store.edenfoods.com/barley-malt-syrup-organic/) | Manufacturer product title, ingredient declaration (organic sprouted barley and water), process summary, 560 g package, and product-specific use notes. The product’s package and use data are not generic defaults. |
| `WP02-C-MALT-R349-S08` | Well.ca, [Eden Organic Barley Malt Syrup — French listing](https://well.ca/fr/produits/eden-organic-barley-malt-syrup_18381.html) | Current Canadian retailer uses `Sirop de malt d’orge biologique`, gives 566 g package and organic sprouted barley/water ingredients. Retail translation and product details are product-specific. |
| `WP02-C-MALT-R349-S09` | Galleria Online Mall, [Country Harvest Everything Bagel UPC 063400138247](https://www.galleriasm.com/Category/ProductDetailView?BrandNo=&LangCode=&prodBarcode=063400138247) | Canadian retailer ingredient declaration names malted barley syrup with corn and malted barley as components. This is one compound ingredient declaration. |
| `WP02-C-MALT-R349-S10` | Terra Bioindustries, [TERRA Malt Health Canada review](https://terrabioindustries.com/2026/01/12/first-upcycled-barley-malt-extract-receives-health-canada-review/) and [Recyclose product data sheet](https://expoproduction.thefoodtech.com/wp-content/themes/summit-expo/directorio/assets/fichas/17eb5615-b50a-42cb-81bb-1c31e81fb4cf.pdf) | The company calls TERRA Malt an upcycled malted-barley extract and also refers to its barley malt syrup. Its 2024 supplier sheet describes a syrup from fractionated spent grain with ingredients over 80% barley and under 20% wheat/corn/rice. This is a particular B2B product, not a universal standard. |
| `WP02-C-MALT-R349-S11` | Ceres Organics, [Organic Brown Rice Malt Syrup](https://products.ceresorganics.com.au/Baking/Baking-Supplies/Sugar-and-Sweeteners/12171-Organic-Brown-Rice-Malt-Syrup-400g/) | Current manufacturer page gives the compound product name, describes it as brown rice syrup made by culturing rice, lists certified organic rice 100%, and gives a 400 g package / 20 g serving. Its ratios and serving size are not general values. |
| `WP02-C-MALT-R349-S12` | TerraSana, [2025 product catalogue](https://download.terrasana.nl/B2B_brochures/ENG/TerraSana_Catalog_EXP_2025_Digital.pdf) | Product catalogue ingredient statement qualifies one brown-rice-malt-syrup component as brown rice plus barley malt. This does not establish a universal syrup formula. |
| `WP02-C-MALT-R349-S13` | Coles, [Organic Rice Malt Syrup](https://www.coles.com.au/product/coles-organic-rice-malt-syrup-500g-2896131) | Retail product name and declared ingredient `100% Organic Brown Rice Syrup`; Australian retail evidence, not Canadian naming authority. |
| `WP02-C-MALT-R349-S14` | Korea Rice Food Industry / Rice Show, [Rice Jocheong (grain syrup)](https://riceshow.or.kr/html/info/productView.php?lang=eng&no=368) | One exhibitor lists rice 94%, malt 5.9%, enzyme 0.1%, names its product Rice Jocheong, and describes barley-sprout saccharification. A product listing, not a definition of all jocheong. |
| `WP02-C-MALT-R349-S15` | The K Mart Canada, [Chung Jung One Rice Syrup 1.2 kg](https://www.thekmart.ca/en/products/%EC%B2%AD%EC%A0%95%EC%9B%90-%EC%A1%B0%EC%B2%AD%EC%8C%80%EC%97%BF-1-2kg) | Canadian retailer’s current listing names the item Rice Syrup, describes Korean rice fermentation/saccharification, and lists rice, malt, and purified water. It is one imported product listing and currently shows sold out. |
| `WP02-C-MALT-R349-S16` | Japan MAFF, [Beverages — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/inryou.html) | Identifies amazake as a beverage and distinguishes rice-koji and sake-lees types. It does not define a syrup or substitution. |
| `WP02-C-MALT-R349-S17` | Kojiro / Moryzae, [Official product store](https://ko-jiro.com/) | Existing brown-rice-syrup ledger source for the branded fermented-syrup family using rice koji, rice, herbs, and fruit; product-specific. |

## Picker behavior and alias ownership

The search implementation in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, punctuation, and spacing. It first returns references whose name or alias contains the complete query phrase; substring matching runs only when no phrase result exists. The reference and form catalog has no locale, market, or product-source qualifier, so a global alias cannot express that one wording belongs only to one supplier or region.

Read-only matching against the live reference and form catalog gives:

| Query | Current result |
| --- | --- |
| `malt syrup`; `sirop de malt`; `malted barley syrup`; `barley malt syrup`; `malt extract`; `extrait de malt` | No result. |
| `rice malt syrup`; `brown rice malt syrup`; `jocheong` | No result. |
| `rice syrup`; `sirop de riz` | `ingredient-ref-brown-rice-syrup`, because the phrase is contained in the qualified active name. This is the existing behavior recorded in the brown-rice-syrup ledger decision. |
| `malt flour` | Six active malt-flour references: generic malt flour, light caramelized barley malt flour, malted spelt flour, roasted barley malt flour, roasted oat malt flour, and roasted wheat malt flour. This existing broad result set is a reason to keep new syrup labels out of generic `malt` and flour aliases. |
| `molasses` | `ingredient-ref-blackstrap-molasses`, `ingredient-ref-fancy-molasses`, and `ingredient-ref-pomegranate-molasses`. |

Hypothetical alias effects are material to this decision:

- Adding `barley malt syrup` or `sirop de malt d’orge` as a name or alias would make the generic phrase query `malt syrup` or `sirop de malt` return a barley-qualified row. It would silently resolve the broader term toward barley.
- Adding `brown rice malt syrup` as an alias to `ingredient-ref-brown-rice-syrup` would make `rice malt syrup` return a rice-only brown-rice identity even though other products use rice plus barley malt.
- Adding a generic rice-syrup row would create overlap with the existing brown-rice result for `rice syrup / sirop de riz` queries. The current catalog has no rank or market filter to choose the intended source.

Therefore keep these exact name claims distinct: `malt syrup / sirop de malt`; `barley malt syrup / sirop de malt d’orge`; `malted barley syrup / sirop d’orge maltée`; `malt extract / extrait de malt`; and `malt flour / farine maltée`. Keep `rice malt syrup`, `brown rice malt syrup`, `rice syrup`, `brown rice syrup`, and `jocheong` separate as well. No alias from any of them should point to the active malt-flour, malted-barley-flour, brown-rice-syrup, glucose-syrup, golden-syrup, blackstrap, fancy-molasses, amazake, or shio-koji rows.

## Numeric, form, and substitution limits

No default density, volume-to-mass conversion, spoon/cup weight, unit mapping, package yield, form conversion, or cross-product substitution is supported. The source examples differ by grain and process, and some include cereal blends or upcycled spent grain. They do not provide a shared solids level, water content, enzyme activity, or standardized recipe behavior.

Eden publishes specific sugar/liquid replacement instructions and product package information for its own barley syrup; Ceres publishes a 20 g serving for its 100%-rice product; Rice Show lists the composition and package sizes for one jocheong. Retain those observations as source-specific evidence only. Do not transfer them to other malt syrups, malt extracts, generic rice syrup, brown rice syrup, or jocheong. Do not infer syrup-to-sugar, syrup-to-molasses, malt extract-to-syrup, barley-to-rice syrup, or amazake-to-syrup substitutions.

## Coordinator implementation note

Keep the live catalog and source ledger unchanged in this round. Keep the broad Section C checklist open. Preserve the active brown-rice-syrup, glucose-syrup, golden-syrup, blackstrap, fancy-molasses, malt-flour, cereal-specific malt-flour, amazake, and shio-koji records as they stand. Reopen the qualified barley candidate only when a specific recipe/product needs it or when picker design can keep `malt syrup / sirop de malt` from resolving automatically to barley. Reopen rice-malt/jocheong naming against an exact recipe or package and a Québec French display decision. Add no forms, numeric defaults, recipe links, or substitutions from this review.


## Integration notes

- Kept generic malt syrup, barley-qualified syrup terms, rice-malt syrup, generic rice syrup, and jocheong out of active identities and aliases. The existing brown-rice-syrup, malt-flour, extract, molasses, golden-syrup, amazake, and shio-koji boundaries remain unchanged.
- Root independently rechecked the OQLF/TERMIUM naming distinction, CFIA’s separate label examples, the Canadian Eden barley-syrup product listing, the Canadian Chung Jung One rice-syrup declaration, Ceres’ rice-only brown-rice-malt syrup, and the Rice Show jocheong product. These source-specific formulas do not establish a shared global class or safe broad alias under the current phrase matcher.
- No identity, alias, form, measurement, recipe link, conversion, yield, or substitution was added. No software tests were needed for this documentation-only decision.

# WP03 Section G wrappers coordinator review

- **Reviewed:** 2026-10-09
- **Status:** proposal-only; no seed, recipe, or ledger changes. Section G remains open.
- **Checklist item:** `Wonton, gyoza, dumpling, spring-roll, rice-paper, and egg-roll wrappers.`
- **Source-ID prefix checked:** `WP03-WRAPPERS-20261009-S01`–`S16`; no existing use was found in the ledger or catalog proposal/batch documents before this report.

## Recommendation

Defer all wrapper rows and aliases until a bundled recipe line or another explicit catalog requirement identifies the product. The current bundled corpus has no wrapper ingredient line. The evidence does establish one important future boundary: rice-paper sheets and wheat-flour pastry sheets sold for spring rolls are different products. The unqualified phrase `spring-roll wrapper` covers both usages in Québec terminology and retail listings, so it must not become an alias for either one.

Do not add a generic `wrapper(s)` identity. Keep wonton, gyoza, dumpling, spring-roll pastry, rice-paper, and egg-roll labels as separate candidates pending a recipe/source-specific mapping. Manufacturers sometimes sell separate named styles and sometimes describe one wrapper as usable for several dumpling dishes. That cross-use does not establish one-to-one product identity or a global substitution.

## Live audit

The snapshot was read on 2026-10-09. Hashes below identify the exact audited files.

| Live artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 509 references | 161,286 | `074c4381a10e397cbb289cb732b989496eb826e377a494f1451b7546e9777083` |
| `ingredient-forms.v1.json` | 32 forms | 21,671 | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `manifest.v1.json` | 114 recipe files | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 689 records; 1,119 source entries; 935 distinct source IDs | 1,253,287 | `e7f3afcaa8ac751c594e1cdf264cea6e4d8c10ea5b4e41f66050977d7bdccd9a` |
| `legacy-import-identities.v1.json` | 97 candidates | 22,991 | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |

The 114 manifest-listed recipe files contain 1,123 ingredient rows and 749,857 JSON bytes. Their ordered corpus digest is `31139675c0a2f37863a57e2e45e8df203b0255b11e12cf54f1df944cdd426890`, computed by hashing each manifest path, a NUL byte, the exact recipe-file bytes, and another NUL byte in manifest order.

The normalized search audit mirrors `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace non-ASCII alphanumeric runs with spaces, then collapse whitespace. Active-reference searches included bilingual names and aliases plus each attached form's labels and match terms. Complete normalized phrase matching was checked before the app's substring fallback.

There were no active reference or form owners for the wrapper phrases: `wonton`, `won ton`, `wantan`, `gyoza`, `dumpling wrapper/skin`, `spring roll wrapper`, `egg roll wrapper`, `rice paper wrapper`, `rice wrapper/sheet`, `feuille(s) de riz`, `papier de riz`, `galette(s) pour rouleaux de printemps`, or the related Québec product terms. The broad query `nem` has no exact owner, but substring fallback currently finds `ingredient-ref-old-bay-seasoning` and `ingredient-ref-trinidadian-green-seasoning` because `nem` is inside `seasoning`. OQLF defines *nem* as a prepared Vietnamese roll term, not as a wrapper; do not add it as a wrapper alias.

The legacy candidate names and aliases have no exact wrapper-term matches. The ledger has no wrapper-product record. Its lone exact `dumpling` mention in this search scope is the MAFF `Kushi-dango` recipe cited by `ingredient-ref-glutinous-rice-flour`; that source describes rice-flour dumplings, not dumpling wrappers. It does not create a wrapper identity collision.

Every manifest-listed ingredient row was checked in both `ingredientName` and `originalText`, with the same normalized phrase-boundary logic. **RecipeBook demand: zero matching rows across the 114 scanned recipes.** The audit included the English/French wrapper terms above and `lumpia`, `banh trang`, and `nem`; no recipe was relinked or changed.

## Candidate labels and alias boundaries

The labels below are source-backed candidates for later use, not active catalog displays or approved aliases. Where the reviewed sources do not establish a stable Québec French wrapper label, the French field remains unassigned.

| Product candidate | English label evidence | fr-CA label evidence | Alias/boundary recommendation |
|---|---|---|---|
| Rice-paper wrapper sheets | `rice paper` / `rice paper wrappers` in Canadian retail and manufacturer product listings | Prefer candidate display `feuilles de riz` (MITO and Télé-Québec); local retail also uses `papier de riz` and `galettes pour rouleaux de printemps` | If a recipe calls for rice-paper sheets, consider aliases `papier de riz` and `galettes pour rouleaux de printemps`. Do not add bare `galettes de riz` without confirming context; it can read as rice cakes. Do not alias unqualified `spring-roll wrappers` or wheat pastry terms. |
| Wonton wrappers | `wonton wrappers`; manufacturers also use `wonton skin` | Candidate display `pâtes à wonton` (Nouilles Wing's exact product heading: `Pâtes à Won Ton - épaisseur mince`); local retail uses `enveloppes à wonton` and `enveloppes pour wonton` | If a recipe names this product, consider the source spelling `pâtes à won ton` and the two local envelope phrases as same-product aliases after source/package review. OQLF's `wonton`/`wantan` and spelling variants name the prepared dish; do not add bare `wantan`, `wuntun`, or `ravioli chinois` as wrapper aliases. |
| Gyoza wrappers | `gyoza wrappers`; some manufacturers say `gyoza skins` | Candidate display `feuilles pour gyoza` appears on a Québec-market product page | Keep distinct from generic dumpling and wonton wrappers. OQLF's `gyoza` and `ravioli japonais` name a prepared dish, not wrapper sheets; do not alias `ravioli japonais`. |
| Dumpling wrappers | `dumpling wrappers` is a manufacturer product label | No stable fr-CA wrapper label was established in the reviewed Québec sources | Leave the French display and aliases open. OQLF notes *dumpling* is a generic term for different stuffed Asian dishes; it does not define wrapper products. Do not use `dumpling wrapper` as an alias for gyoza or wonton wrappers. |
| Spring-roll pastry sheets | `spring roll pastry` and `spring roll wrappers` appear on manufacturer/retailer product listings | Local labels include `feuilles de rouleaux de printemps` and `pâte à rouleaux de printemps`; Metro lists the former wording for one frozen wheat-flour pastry SKU | Treat this candidate as the wheat pastry product only when the recipe/source makes that product clear. Do not collapse it with rice-paper wrappers, and do not set a global `spring-roll wrapper` alias: OQLF and Québec retail use spring-roll wording for both rice sheets and wheat pastry. |
| Egg-roll wrappers | `egg roll wrapper` is a distinct manufacturer/retail product label | Canadian retail uses `pâte pour rouleaux aux œufs` | Keep separate from spring-roll pastry and other wrapper styles. The retailer phrase is usage evidence, not an OQLF terminology ruling; retain no aliases until a recipe or package specifies the intended product. |

The source map in the next section distinguishes terminology evidence from product-specific examples. Product forms such as fresh/frozen, round/square, thin/thick, and brand-specific formulations should not be added from this review. They need to match a real recipe/source and should not be inferred from the broad product family.

## Evidence map and limitations

| ID | Source | Supports | Limitation |
|---|---|---|---|
| S01 | [OQLF, *wonton*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557347/wonton) | Québec preferred terms `wonton` and `wantan`; definition is a filled, cooked dish. | Does not name the wrapper sheet. Do not transfer its dish terms automatically to wrapper aliases. |
| S02 | [OQLF, *gyoza*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557606/gyoza) | `gyoza` and `ravioli japonais` are preferred names for the prepared Japanese dish; *dumpling* is a broader term used in some contexts. | Not a wrapper terminology entry; it cannot resolve product equivalence among gyoza, wonton, and dumpling sheets. |
| S03 | [OQLF, *jiaozi*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522955/jiaozi) | `jiaozi`, `jaozi`, `ravioli chinois`, and `ravioli pékinois` name a prepared Chinese dish; *dumpling* can be generic. | Dish names only. They are not wrapper aliases. |
| S04 | [OQLF, *rouleau de printemps*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502859/rouleau-de-printemps) | A spring roll may be made with either a rice galette or wheat dough; the Chinese and Vietnamese versions vary, especially in the dough. `Rouleau printanier` is identified as chiefly Québec usage. | The definition concerns the prepared roll; it expressly leaves wrapper material ambiguous. |
| S05 | [OQLF, *rouleau impérial*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502857/rouleau-imperial) | `rouleau impérial`, `pâté impérial`, and `nem` are names for a prepared Vietnamese dish made with a rice galette; OQLF says *nem* and *pâté impérial* are mainly used in European French. | Prepared-food labels only. None names the rice sheet itself. |
| S06 | [Metro, Spring Home frozen spring-roll sheets](https://api.metro.ca/epicerie-en-ligne/allees/produits-surgeles/boulangerie/tartes-et-patisseries/feuilles-de-rouleaux-de-printemps-surgelee/p/8888003215209) | Local product name `Feuilles de rouleaux de printemps surgelée`; the listed ingredients for this SKU include wheat flour, water, coconut oil, and salt. The English listing is `Frozen Spring Roll Wrappers`. | One SKU's listing, not a universal formula or mapping. Metro advises checking current package labels. No measurement or conversion is inferred from its package size. |
| S07 | [MITO Sushi, *Feuilles de riz*](https://mito.ca/produit/feuilles-de-riz/) | Québec-market French display `feuilles de riz`; this product lists water, rice, tapioca starch, and salt and describes use for rolls. | One product listing; do not generalize its ingredient formula to every rice-paper brand. |
| S08 | [Télé-Québec, shrimp spring-roll recipe](https://cuisinez.telequebec.tv/recettes/6965/rouleaux-de-printemps-aux-crevettes) | Québec recipe uses the ingredient term `feuilles de riz`; its recipe specifies 16 sheets of 23 cm for that particular batch. | External recipe evidence, not bundled demand. Its quantity and diameter are recipe-scoped only, not a sheet-to-mass conversion or universal serving rule. |
| S09 | [Nouilles Wing Ltée., *Pâtes à Won Ton - épaisseur mince*](https://www.wingnoodles.com/fr/produits/pates/pates-a-won-ton-epaisseur-mince-400g.php) | Montréal supplier's exact French product name and a product-size qualifier. | A single supplier's thin wonton product; not a generic wrapper definition or a basis for a form or conversion. |
| S10 | [Your Independent Grocer, French product search for wonton wraps](https://www.yourindependentgrocer.ca/fr/search?search-bar=wonton+wraps) | Canadian French retail labels include `Enveloppes à wonton`, `Enveloppes pour Wonton`, `Enveloppes Pour Ravioli Chinoise`, `Pâte pour rouleaux aux œufs`, `Pâte à rouleaux de printemps`, `Galettes pour Rouleaux de Printemps`, and `Papier de riz`. The result list presents these as separate products. | Retailer/search wording is usage evidence, not an official terminology decision. The page can change and does not establish that similarly named items are interchangeable. |
| S11 | [SUE Foods, *Feuilles pour gyoza*](https://suefoods.com/products/myojo-feuilles-pour-gyoza) | Québec-market product wording `feuilles pour gyoza`; its package lists enriched wheat flour, water, and other ingredients. | One product; the flour list and any package quantity do not establish universal gyoza composition or measurement mapping. |
| S12 | [Metro, *Gyozas (bouchées wonton)* recipe](https://www.metro.ca/recettes-et-occasions/recettes/gyozas-bouchees-wonton) | A Québec recipe uses `pâtes à wonton` in one gyoza preparation, demonstrating a source-specific cross-use. | One recipe only. It does not establish that all gyoza and wonton wrappers are the same product or support a general substitution. |
| S13 | [Wonton Food, wrapper product range](https://www.wontonfood.com/en/products/wrappers/) and [catalog](https://www.wontonfood.com/documents/48/WontonFood_ProductCatalog.pdf) | This manufacturer's product lineup distinguishes wonton, dumpling, egg-roll, and spring-roll wrapper products, with catalog SKUs for some styles. | One manufacturer's naming and assortment, not a universal taxonomy. SKU or pack data are not kitchen conversions. |
| S14 | [Wonton Food, Shanghai dumpling wrapper](https://www.wontonfood.com/en/products/wrappers/shanghai-dumpling-wrapper/) | Its dumpling wrapper is marketed for several filled preparations, including gyoza and potstickers, while thickness options are sold. | Supports cross-use for this product only. Do not turn it into a dumpling-to-gyoza identity alias or substitution rule. |
| S15 | [Tee Yih Jia, Spring Home product range](https://tyjfood.com/Brands/Spring-Roll-Pastry) and [brand listing](https://www.tyjfood.com/) | Manufacturer separately lists spring-roll pastry, spring-roll pastry with egg, wonton skin, and gyoza skin products. | Brand-specific product naming; no universal egg-content rule or cross-brand identity is inferred. |
| S16 | [Canadian Trademarks Journal, French goods description](https://publications.gc.ca/collections/collection_2022/opic-cipo/RG42-2-69-3535-fra.pdf) | The applicant's goods list includes `feuilles de pâte à raviolis de type gyozas`, a documented French description for that product class. | Applicant-provided trademark wording, not a terminology ruling or preferred OQLF term; it is not promoted to a display or alias. |

The grocery source for S10 is a Canadian bilingual retailer listing. Its product labels establish observed market wording only. The OQLF GDT sources above remain the terminology authority for the prepared dishes; none of the consulted OQLF entries defines these wrapper products.

## Measurements and substitutions

This review activates no density, mass/volume mapping, sheet-count conversion, package yield, dilution, or substitution. The Télé-Québec recipe's 16 sheets at 23 cm and the listed package sizes are source-local observations only. No source establishes a generic sheet weight or a reliable count-to-mass/volume value. The OQLF's mention of rice galettes and wheat dough in different spring-roll traditions is a description of product variation, not proof that one can replace the other in a recipe. The Metro gyoza recipe is one source-specific use of wonton pastry, not a universal substitution rule.

## Coordinator tasks

1. Keep the Section G checklist item open; do not claim Section G completion or integrate rows from this report alone.
2. When recipe demand arises, preserve the source's exact wrapper name and determine whether it calls for rice-based sheets or wheat-flour pastry. Keep rice-paper sheets distinct from wheat spring-roll pastry.
3. For a future wonton or gyoza identity, use the product-specific labels in the table as candidates and ask Québec French review to confirm the chosen display and any aliases. Keep `wonton/wantan`, `gyoza/ravioli japonais`, `jiaozi/ravioli chinois`, and *nem* dish terms out of wrapper aliases unless a wrapper package itself explicitly supplies that label.
4. Do not merge generic dumpling, wonton, and gyoza wrappers based on filled-dish categories or one recipe's cross-use. Do not equate rice paper with spring-roll or egg-roll pastry based on purpose alone.
5. Recheck recipes, active names/forms, and legacy IDs at integration time. Add only source-supported fields needed by the actual recipe; leave measurements and substitutions unset unless separately supported for the exact product and context.

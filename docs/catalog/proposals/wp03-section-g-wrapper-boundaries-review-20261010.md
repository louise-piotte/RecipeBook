# WP03 Section G wrapper boundaries review

- **Reviewed:** 2026-10-10
- **Status:** coordinator accepted five bounded identity-only candidates on 2026-10-10 and integrated them. The generic dumpling-wrapper and unqualified spring-roll holds remain. See [`wp03-section-g-wrappers-integration-20261010`](../batches/wp03-section-g-wrappers-integration-20261010/README.md).
- **Checklist:** `G Pasta noodles wrappers breads and pastry components` → `Wonton, gyoza, dumpling, spring-roll, rice-paper, and egg-roll wrappers.` (plan line 1569).
- **Prior packet:** [WP03 wrappers coordinator review](wp03-wrappers-coordinator-review-20261009.md). This refreshes its live snapshot and adds product and Québec-market evidence; it does not reopen the broad holds for generic wrapper or unqualified spring-roll names.
- **Source IDs:** `WP03-WRAPPERS-20261010-S01`–`S14` are new to this proposal and were checked against the current ledger.

## Recommendation

The coordinator accepted and integrated five **bounded identity-only references** with the exact displays and cautious aliases below: edible rice-paper sheets, wonton wrappers, gyoza wrappers, wheat spring-roll pastry, and egg-roll wrappers. The product labels, local French usage, and manufacturing listings support distinguishing these named products. The bundled RecipeBook corpus still has no wrapper demand, so no recipes were linked and no measurements or behavior were added. The broader Section G work remains open.

Keep **generic dumpling wrappers** held: manufacturers sell broad dumpling-sheet products and may market one sheet for gyoza, potstickers, and other filled preparations, while no stable Québec French wrapper display was established. Keep the unqualified English `spring-roll wrapper` and French `pâte à rouleaux de printemps` out of aliases: OQLF describes the prepared roll as using either a rice galette or wheat dough, and local retail uses spring-roll wording for both. Do not create one generic `wrapper(s)` identity.

No merge is recommended. Keep each accepted candidate separate from generic pasta, rice grain, rice flour, and other wrapper candidates. A brand's cross-use or one recipe's choice of sheet is not evidence that two product identities are equivalent or globally substitutable.

## Live catalog, ledger, and recipe audit

Snapshot read on 2026-10-10. The wrapper-specific portion of the previous review was based on 509 references and 32 forms; the current package is materially newer.

| Artifact | Current state | SHA-256 |
|---|---:|---|
| [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 862 active references | `5155166ab2c33edfca487cf00cb1c0f1cec2bd4d526305d78b9b57841770a3d2` |
| [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 47 forms | `7676316bf4e3b0ba6972b6c0759f0a86156428f03a2e86730ff6b986756ff3ce` |
| [`research-ledger.v1.json`](../research-ledger.v1.json) | 1,107 records; no wrapper-product record | `1680d71a1afa0cbb18560f20cfab6a16c412874eb1181844fe333d94c71858f6` |
| [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) | 78 candidates; no exact wrapper-term match | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |

### Exact IDs and normalized-key checks

All 862 current reference IDs and their English/French displays and aliases were searched; all 47 form labels and match terms were searched; all 78 legacy candidate names and aliases and all 1,107 ledger records were checked. The current adjacent identities manually reviewed were:

- `ingredient-ref-pasta` — `pasta / pâtes alimentaires` (French alias `pâte alimentaire`)
- `ingredient-ref-rice` — `rice / riz`
- `ingredient-ref-rice-flour` — `rice flour / farine de riz`
- `ingredient-ref-white-rice-flour` — `white rice flour / farine de riz blanc`
- `ingredient-ref-glutinous-rice-flour` — `glutinous rice flour / farine de riz gluant`
- `ingredient-ref-rice-vermicelli` — `rice vermicelli / vermicelle de riz`
- `ingredient-ref-puffed-rice` — `puffed rice / riz soufflé`
- `ingredient-ref-rice-cereal` — `crispy rice cereal / céréales de riz croustillantes`
- `ingredient-ref-old-bay-seasoning` and `ingredient-ref-trinidadian-green-seasoning` — unrelated French aliases that receive the substring query `nem` because `nem` occurs inside `assaisonnement`.

No exact normalized key belongs to a wrapper candidate or proposed alias. No wrapper candidate ID is active, in the form set, or in the ledger: `ingredient-ref-rice-paper-wrapper`, `ingredient-ref-wonton-wrapper`, `ingredient-ref-gyoza-wrapper`, `ingredient-ref-wheat-spring-roll-pastry`, and `ingredient-ref-egg-roll-wrapper` are all absent. No generic dumpling-wrapper ID is proposed. The `nem` substring false matches are the only wrapper-query collision found; do not create a `nem` wrapper alias.

### Recipe demand

The 114 manifest-listed recipes contain 1,123 ingredient rows (751,813 bytes; ordered recipe-corpus digest `073a9b7f1b15aaa167a2fdfdb58d66fe52bc006d71f832ba859406b04f24d633`). Phrase-boundary matching was run over all file text and over every ingredient row's `originalText`, `ingredientName`, and `ingredientRefId` for the wrapper names and variants discussed here. **There are zero matching recipe files and zero matching ingredient rows.** No local line, recipe relink, form, or recipe-line substitution is proposed.

Two Québec-published recipes show real-world ingredient wording outside this bundle. Télé-Québec's *Soupe wonton* ingredient line is `2 paquets de 400 g de pâtes à wonton du commerce`; its method later says `Dans une pâte à wonton, déposer environ 1 c. à thé de farce`. Télé-Québec's shrimp spring-roll recipe lists `16 feuilles de riz de 23 cm (9 po) de diamètre`. These are source-specific recipe lines, not RecipeBook demand, generic portion conversions, or evidence for matching rice and wheat sheets.

## Candidate identities and alias boundaries

IDs below are proposed identifiers only. If later integrated, use the existing `GRAIN_AND_CEREAL` category used for `ingredient-ref-pasta`, unless the catalog coordinator selects a more fitting existing category.

| Recommendation | Candidate ID and English display | Proposed fr-CA display | Proposed aliases and exclusions |
|---|---|---|---|
| **Accept candidate** | `ingredient-ref-rice-paper-wrapper` — `rice-paper sheets` | `feuilles de riz` | EN: `rice paper`, `rice paper sheets`, `rice paper wrappers`. FR: `feuille de riz`; `galettes de riz pour rouleaux de printemps`; `galettes pour rouleaux de printemps`; `papier de riz` may be retained as a market-search alias only if the coordinator accepts its ambiguity. Do **not** add bare `galette de riz` or unqualified `spring-roll wrapper`. |
| **Accept candidate** | `ingredient-ref-wonton-wrapper` — `wonton wrappers` | `pâtes à wonton` | EN: `wonton skin`, `wonton skins`. FR: `pâte à wonton`; `pâtes à won ton`; `feuilles pour wonton`. Do not alias bare `wonton`, `wantan`, `wuntun`, `ravioli chinois`, or generic `dumpling`; OQLF defines wonton/wantan as the filled cooked dish, not the wrapper sheet. |
| **Accept candidate** | `ingredient-ref-gyoza-wrapper` — `gyoza wrappers` | `feuilles pour gyoza` | EN: `gyoza skin`, `gyoza skins`. Keep the local display phrase as the only proposed FR label for now. Do not alias bare `gyoza`, `ravioli japonais`, or generic `dumpling`; these name the prepared food family, not necessarily the wrapper. |
| **Accept qualified candidate** | `ingredient-ref-wheat-spring-roll-pastry` — `wheat spring-roll pastry` | `pâte de blé pour rouleaux de printemps` | EN alias: `spring roll pastry` (manufacturer product name). No bare `spring-roll wrapper` alias. Keep FR `pâte à rouleaux de printemps` and `feuilles de rouleaux de printemps` out of aliases unless a recipe or package establishes the wheat product: those phrases alone do not disambiguate it from rice paper. The proposed qualified FR display is descriptive; the sources support local `pâte à rouleaux de printemps` but do not establish the full qualified phrase as an official term. |
| **Accept candidate** | `ingredient-ref-egg-roll-wrapper` — `egg-roll wrappers` | `pâte pour rouleaux aux œufs` | EN: `egg roll skins`. FR candidate alias: `pâtes à egg rolls` (local Québec grocery inventory). Do not alias to spring-roll pastry or to prepared `rouleaux impériaux`/`pâtés impériaux`; no universal egg content is inferred from the English product name. |
| **Hold** | No ID — generic `dumpling wrappers/skins` | Unassigned | No accepted aliases. A manufacturer uses the name for a broad Shanghai-style wrapper usable across filled dishes, including gyoza. Current evidence does not establish a single fr-CA display, a unique composition, or a one-to-one relation with wonton/gyoza sheets. Do not map it to one of the accepted candidates. |

### Product boundary and picker behavior

- **Rice-paper sheets vs wheat spring-roll pastry:** Both can be used for rolls called spring rolls, but they are different sheet products. A Québec MITO product and a Loblaws Blue Dragon product identify rice/tapioca-based, moisten-before-use sheets. Metro's Spring Home product is explicitly a wheat-flour sheet. Preserve that boundary even when a recipe names only the prepared roll.
- **Wonton vs gyoza vs generic dumpling wrappers:** Québec usage supports the displays `pâtes à wonton` and `feuilles pour gyoza`. Manufacturer ranges list different named lines, while Metro's gyoza recipe uses wonton wrappers and Wonton Food markets one Shanghai dumpling sheet for several dumpling styles. This supports separate source-named candidates and broad cross-use, not synonym aliases or a global substitution.
- **Wheat spring-roll pastry vs egg-roll wrappers:** A Canadian bilingual retailer currently lists `Pâte à rouleaux de printemps` and `Pâte pour rouleaux aux œufs` as separate products; a manufacturer also maintains separate product lines. Keep the named categories apart, and do not infer universal wheat percentage, egg content, thickness, shape, or cooking equivalence from one brand.
- **Dish names remain dish names:** OQLF's entries for wonton, gyoza, jiaozi, spring rolls, and imperial rolls define filled prepared foods. Do not borrow `wantan`, `ravioli chinois`, `ravioli japonais`, `jiaozi`, `nem`, `rouleau impérial`, or `pâté impérial` as wrapper aliases without an exact package or recipe label for the sheets.

## Measurements, forms, and substitutions

Keep measurements, density, unit mappings, package yield, sheet-count conversions, forms, cooking yields, and substitution rules **unknown/not proposed** for all wrapper candidates. Product pages and recipes contain package counts, serving examples, and sheet sizes, but those values belong to specific products or recipes. Do not generalize them. Do not add fresh/frozen, thin/thick, round/square, or egg-containing forms from brand lineups alone.

The Metro *Gyozas (Potstickers)* recipe uses one package of wonton wrappers for a gyoza preparation. That is one recipe's source-specific cross-use only; it gives no generic wrapper equivalence or amount conversion. No global or contextual substitution is supportable from the consulted sources.

## Focused future picker fixtures

These are proposal acceptance fixtures only; no tests were run or added.

1. `rice paper` and `feuilles de riz` resolve only to `ingredient-ref-rice-paper-wrapper`; `pâte de blé pour rouleaux de printemps` resolves only to `ingredient-ref-wheat-spring-roll-pastry`.
2. `galettes pour rouleaux de printemps` may resolve to the rice-sheet candidate only if accepted as the market alias; bare `spring roll wrapper` and bare `pâte à rouleaux de printemps` must not map to just one of the rice/wheat candidates.
3. `pâtes à wonton`, `pâtes à won ton`, and `wonton skin` resolve to the wonton candidate; `wantan`, `ravioli chinois`, and `dumpling wrapper` do not become wrapper aliases.
4. `feuilles pour gyoza` and `gyoza skin` resolve to the gyoza candidate; `ravioli japonais` and generic `dumpling wrapper` remain outside it.
5. `pâte pour rouleaux aux œufs` and `egg roll skin` resolve to the egg-roll candidate; spring-roll names remain separate.
6. No candidate resolves from a quantity alone, and no sheet-count/mass/volume conversion, form, yield, or substitution appears in the catalog.

## Remaining Section G work

This proposal closes only the five accepted wrapper identities; it does not complete Section G. The generic dumpling wrapper and unqualified spring-roll terms remain unresolved, as does the broader plan:

- dried/fresh, egg, whole-wheat, gluten-free, shape-specific pasta distinctions and forms with distinct culinary behavior;
- corn/wheat tortillas, pita, lavash, naan, roti, paratha, injera, flatbread, rolls, sandwich/sourdough bread, and regional breads;
- fresh/dry breadcrumbs, panko, cracker and graham crumbs, matzo meal, bread cubes, and croutons;
- puff/rough puff pastry, phyllo, kataifi, shortcrust, pie shells, pizza and biscuit dough, and bought choux preparations;
- rice cakes, Korean tteok, Chinese niangao, comparable prepared starches, and pasta dry/fresh/cooked distinctions without a universal grams-per-cup value.

## Sources and source-access notes

All sources below were accessed on **2026-10-10**. OQLF terminology entries are authoritative for the French names of the prepared dishes; they do not prescribe wrapper terms. Product names and ingredients are manufacturer/retailer evidence and should not be generalized beyond the named item.

| ID | Source and claim supported | Access limit |
|---|---|---|
| WP03-WRAPPERS-20261010-S01 | Office québécois de la langue française, [*wonton*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557347/wonton), GDT. Preferred dish terms `wonton`/`wantan`; definition is a filled dish. | Directly opened. It does not name wrappers. |
| WP03-WRAPPERS-20261010-S02 | OQLF, [*gyoza*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557606/gyoza), GDT. `gyoza`/`ravioli japonais` name the prepared dish; `dumpling` is broader. | Directly opened. It does not name wrappers. |
| WP03-WRAPPERS-20261010-S03 | OQLF, [*jiaozi*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522955/jiaozi), GDT. `jiaozi`, `ravioli chinois` and `ravioli pékinois` name filled dishes; `dumpling` is used generically for Asian filled foods. | Directly opened. It does not name wrappers. |
| WP03-WRAPPERS-20261010-S04 | OQLF, [*rouleau de printemps*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502859/rouleau-de-printemps), GDT. The prepared food may be made with a rice galette or wheat dough; notes variation between Chinese and Vietnamese versions. | Directly opened; updated 2010. It defines the dish, not wrappers. |
| WP03-WRAPPERS-20261010-S05 | OQLF, [*rouleau impérial*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502857/rouleau-imperial), GDT. `nem`, `rouleau impérial`, and `pâté impérial` name a prepared Vietnamese dish made with rice galette. | Directly opened; updated 2010. Not wrapper nomenclature. |
| WP03-WRAPPERS-20261010-S06 | Télé-Québec, [*Soupe wonton*](https://cuisinez.telequebec.tv/recettes/6552/soupe-wonton). Uses `pâtes à wonton du commerce` in the ingredient list and `pâte à wonton` in the method. | Directly opened; external recipe, not bundled demand. Its package amount is not generalized. |
| WP03-WRAPPERS-20261010-S07 | Télé-Québec, [*Rouleaux de printemps aux crevettes*](https://cuisinez.telequebec.tv/recettes/6965/rouleaux-de-printemps-aux-crevettes). Uses `feuilles de riz`; recipe specifies 16 sheets of 23 cm. | Directly opened; external recipe, not bundled demand. Sheet size is recipe-specific. |
| WP03-WRAPPERS-20261010-S08 | MITO Sushi, [*Feuilles de riz*](https://mito.ca/produit/feuilles-de-riz/). Québec-market product display, water/rice/tapioca starch/salt ingredients, and wetting/rolling directions; page says sold in participating Québec IGA stores. | Directly opened. One product listing, not a universal formulation. |
| WP03-WRAPPERS-20261010-S09 | Loblaws, [Blue Dragon *Galettes pour rouleaux de printemps*](https://www.loblaws.ca/fr/galettes-pour-rouleaux-de-printemps/p/20189688_EA?source=nspt). Product description calls them rice-paper sheets; French ingredients list rice flour, tapioca starch, water, and salt. | Directly opened. Retail SKU listing; retailer cautions that ingredients can change. |
| WP03-WRAPPERS-20261010-S10 | Metro, [Spring Home *Feuilles de rouleaux de printemps surgelée*](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/boulangerie/tartes-et-patisseries/feuilles-de-rouleaux-de-printemps-surgelee/p/8888003215209). French display and listed wheat flour (48%), water, copra oil, and salt for this SKU. | Current indexed product page; source search rendered product text. One SKU, not a general recipe or conversion rule. |
| WP03-WRAPPERS-20261010-S11 | Loblaws, [French search for spring-roll pastry](https://www.loblaws.ca/fr/search?search-bar=spring+roll+pastry). Lists Tee Yih Jia `Pâte à rouleaux de printemps` and Wing's `Pâte pour rouleaux aux œufs` as different products. | Search page opened; individual Tee Yih Jia/Wing's product links returned cache-miss. Canadian bilingual retailer listing, not Québec-specific terminology authority. |
| WP03-WRAPPERS-20261010-S12 | Chanhda, [Québec Asian-grocery inventory](https://www.chanhda.ca/epicerie.php). Québec City seller lists `Galettes de riz pour rouleaux de printemps`, `Pâtes à rouleaux impériaux`, `Pâtes à won ton`, and `Pâtes à egg rolls`. | Directly opened. Inventory wording, not formal lexicographic guidance or package composition. |
| WP03-WRAPPERS-20261010-S13 | Poissonnerie La Mer, [Québec specialty grocery selection](https://www.lamer.ca/collections/epicerie-fine/sushi). Lists `Feuilles pour Wonton` and `Feuilles pour Gyoza`. | Directly opened. Product titles only; the package ingredients are not shown. |
| WP03-WRAPPERS-20261010-S14 | Tee Yih Jia, [Spring Home product page](https://tyjfood.com/Brands/Spring-Roll-Pastry) and [brand/product range](https://tyjfood.com/Brands). Manufacturer separately lists spring-roll pastry, wonton skin, and gyoza skin lines; spring pastry page shows regular and egg-added variants. | Directly opened. Manufacturer's product naming and SKU range only; formulations are not provided on these pages. |
| WP03-WRAPPERS-20261010-S15 | Wonton Food, [wrapper range](https://www.wontonfood.com/en/products/wrappers/), [wonton wrapper](https://www.wontonfood.com/en/products/wrappers/wonton-wrapper/), [spring-roll wrapper](https://wontonfood.com/en/products/wrappers/spring-roll-wrapper/), [egg-roll wrapper](https://www.wontonfood.com/en/products/wrappers/egg-roll-wrapper/), and [Shanghai dumpling wrapper](https://www.wontonfood.com/en/products/wrappers/shanghai-dumpling-wrapper/). Lists separate named lines; product pages call the first three wheat products (and flag egg for those particular SKUs); Shanghai dumpling text describes cross-use across gyoza and other filled preparations. | Wonton, spring-roll, and egg-roll pages/range directly opened. Shanghai dumpling page timed out; its search-indexed product text was accessible. Product-specific composition is not generalized. |
| WP03-WRAPPERS-20261010-S16 | Translation Bureau, [TERMIUM Plus `rice paper` record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=PAPEL+ARROZ). The indexed record concerns paper made from tree pith or young bamboo, not the edible wrapper product. | Search result only; direct page returned cache-miss. Used only as a reason not to treat `papier de riz` as an OQLF-approved food term. |
| WP03-WRAPPERS-20261010-S17 | Metro, [*Gyozas (Potstickers)*](https://www.metro.ca/recettes-et-occasions/recettes/gyozas-bouchees-wonton). One recipe uses wonton wrappers in a gyoza preparation. | Directly opened via redirect to the English version. One recipe only; no general substitution or identity merger follows. |

The source-access limits are confined to the individual pages noted above. No source establishes a universal sheet composition, weight, count conversion, yield, or interchangeable wrapper family.

# WP03 Section G: bought pastry and dough boundaries

**Status:** proposal only; no catalog, ledger, plan, roadmap, code, or test files were changed.  
**Snapshot date:** 2026-10-11.  
**Scope:** puff pastry and rough puff; phyllo/filo; kataifi; shortcrust and pie shells; pizza dough; American biscuit dough; bought choux paste and unfilled choux shells.

## Recommendation

Create or retain separate ingredient identities according to the table below. Treat names that denote the same dough as aliases; do not merge products just because they are all pastry or can sometimes serve a similar recipe purpose. Do not add forms, package-yield rules, ingredient-specific unit conversions, or substitutions in this review. The available recipe lines and product listings do not establish reusable mappings.

| Group | Identity and alias decision | Forms, measures, yield, conversions, substitutions | Unresolved before implementation |
|---|---|---|---|
| **Classic puff pastry** | Add a candidate identity `puff pastry` / `pâte feuilletée`. OQLF also records English *flaky pastry* and French *feuilletage*; treat these as aliases where the surrounding context is clearly the dough. “Puff pastry sheets” is a package presentation, not another identity. Keep butter, margarine, and mixed-fat recipes as product/formulation descriptors, not identities. | No forms or package conversion. A 400 g Québec-market sheet product and a Québec manufacturer’s butter/margarine options are examples, not universal weights or composition. No generic yield or substitution. | Whether the eventual catalog needs a structured fat/composition attribute; no bundled recipe currently calls for bought puff pastry. |
| **Rough puff / blitz puff** | Do **not** alias to classic puff pastry and do not create a bought-product row yet. Treat rough puff as a distinct preparation method/ingredient concept if a bundled or cataloged product later requires it. | No form, measure, yield, conversion, or substitution rule. King Arthur’s recipe says its own rough-puff formula can be used for recipes calling for rough puff, homemade puff, or purchased frozen puff sheets; that is recipe-specific guidance, not a global conversion rule. | No evidence found of a bought rough-puff item in the bundle or of a Québec retail product sold under that name. Determine later whether the catalog represents rough puff as a separate identity or as a recipe method when there is actual demand. |
| **Phyllo / filo** | Add one candidate identity `phyllo pastry` / `pâte filo`. Alias *filo*, *phyllo dough*, *filo dough*, and *pâte phyllo*; these are documented variants for the same thin-sheet dough. Keep it separate from puff pastry. | No forms or sheet-count-to-mass conversion. A Metro 454 g listing is product-specific. No generic yield or substitution. | Whether later data needs a sheet-count measure; no recipe in the 114-file bundle uses it. |
| **Kataifi / knafi** | Add a separate candidate identity `kataifi dough` / `pâte kataifi`. *Kataifi pastry* and source-attested *knafi pastry* may be aliases. Do not alias generic shredded pastry or phyllo: the Québec supplier describes kataifi as shredded while listing it separately from phyllo. | No forms for raw, toasted/dry, nests, or prepared kunafa mix in this pass; those may be distinct product states or products. No conversion among bulk, dry, or nest packages, no generic yield, and no substitutions. Supplier pack sizes are SKU-specific. | Decide whether toasted kataifi, nests, and prepared kunafa mix deserve separate identities/forms only if recipes need them; the present bundle has no use. |
| **Shortcrust / pâte brisée** | Add a candidate identity `shortcrust pastry` / `pâte brisée`, distinct from both puff pastry and the existing general `pie crust` identity. Do not alias *pâte sablée* (shortbread dough) or use *pâte à foncer* as an unrestricted synonym; OQLF marks the latter as context-dependent. | No forms or mass-per-shell rule. No yield, conversion, or substitution to puff/phyllo/pie shells. | No explicit shortcrust/pâte brisée line occurs in the bundle. Confirm desired French display and whether future recipes need the more specific pastry type. |
| **Pie crust / pie shell** | Retain existing `ingredient-ref-pie-crust` (`pie crust` / `pâte à tarte`). Add `pie shell` as a candidate alias for the existing identity. OQLF’s *croûte à tarte congelée* / *fond de tarte congelé* specifically describes a frozen unbaked shell; do not add these as unqualified aliases that erase the frozen/unbaked condition. Keep shortcrust as a separate candidate. | Do not add forms now: current rows mix raw crust with extra top dough, a prebaked shell, and unspecified crusts. Preserve each recipe’s count/size/state wording. No general mass, yield, conversion, or substitution. The IGA 1 kg package of four bottoms and tops is one product listing only. Health Canada’s 21 g reference amount is for nutrition labelling, not a shell weight or recipe yield. | Pie-crust identity remains `unreviewed`, measurement remains `blocked_pending_evidence`, and substitution research remains `not_yet_researched` in the live ledger. Resolve shell-state modeling and package evidence in the planned broader pie-crust review; do not infer a universal five-inch shell mass. |
| **Pizza dough** | Add a candidate identity `pizza dough` / `pâte à pizza`. Keep it separate from baked/parbaked pizza crusts and prepared pizza bases. | No forms or conversions. Metro’s 700 g product is an exact listing, not a default package size. Recipe 076 is a homemade dough formula, not evidence of a bought dough yield. No substitutions. | No bundled line calls for a bought dough; determine packaging/yield only if a recipe requires it. |
| **American biscuit dough** | Add a candidate identity for U.S.-style baking-powder/soda quick-bread biscuit dough. Keep separate from cookie dough, baked biscuits, scones, and biscuit mix. Leave the canonical French display and aliases unresolved; do not alias the ambiguous *pâte à biscuits*. Rich Products uses *pâte à petits pains ronds divisée à la mode du Sud* for its specific Southern-style product, not as a general catalog name. | No forms, measures, conversion, yield, or substitutions. Rich’s 168-count 3.25 oz and 216-count 2.2 oz packages are SKU-specific. Recipe 049 makes biscuits from ingredients and does not use bought biscuit dough. | Obtain Québec usage evidence for a concise French display before implementation. Confirm whether any recipe intends American quick-bread biscuits rather than cookies or another product. |
| **Bought choux paste and shells** | Keep raw `pâte à choux` distinct from ready-made shells; no bought raw-paste identity is justified by the bundle or sources reviewed. If product demand arises, create separate identities for unfilled cream-puff shells and unfilled éclair shells. Do not cross-alias those shells, raw paste, or filled cream puffs/éclairs. Rich’s French shell labels are product-specific evidence only. | No forms, conversions, or substitutions. A supplier’s 60-count cream-puff shell and 72-count éclair shell at 1.02 oz each are exact wholesale SKUs, not general piece weights or yields. | No bundle line uses bought paste or shells. Verify local availability and French names if a future recipe requires them; do not infer that a raw dough definition proves a bought product exists. |

## Bundled recipe audit

The manifest contains 114 recipe files with 1,123 ingredient rows. A search of all manifest-listed ingredient references and the current catalog names/aliases found six rows linked to `ingredient-ref-pie-crust`; no row calls for bought puff pastry, rough puff, phyllo/filo, kataifi, shortcrust by name, pizza dough, biscuit dough, raw bought choux paste, cream-puff shells, or éclair shells.

| Recipe | Current pie-crust use | Boundary note |
|---|---|---|
| 077 Salmon Pot Pie | Enough for four individual 5-inch pies with tops and bottoms; unquantified | Dough requirement is a recipe-level description, not a package yield or mass. |
| 089 Mushroom & Ham Quiche #8 | Four individual 5-inch crusts | No mass or bought-product specification. |
| 106 Blueberry Pie #1 | One raw 5-inch crust plus extra dough for a top | Keep shell and extra dough wording together; no conversion. |
| 107 French Silk Pie #1 | One prebaked, cooled 5-inch shell | Explicitly a baked shell, not raw dough. |
| 108 Raspberry Pie #1 | One raw 5-inch crust plus extra dough for a top | Keep shell and extra dough wording together; no conversion. |
| 109 Pecan Pie #1 | One raw 5-inch crust | No mass or package specification. |

Related homemade recipes do not create bought-input demand: recipes 002 and 041 are pie-crust formulas, 076 is a pizza-dough formula, 080 is a puff-pastry formula, and 049 prepares biscuits from ingredients. They should not be normalized as purchased product lines.

## Existing catalog, forms, units, and ledger boundary

- Only `ingredient-ref-pie-crust` owns an exact normalized name/alias match among the target terms. Its English name is `pie crust`, French name is `pâte à tarte`, it has no aliases or forms, and its category is `BAKING_MIXIN_AND_PANTRY`.
- No exact active owner or legacy candidate was found for the other target phrases. Substring matches are false positives: `choux` matches Brussels sprouts, `puff` matches puffed cereals, and `pastry` appears in flour names. Do not use substring matches to merge identities.
- The current package has 61 ingredient forms, one package-yield record (black beans), 30 units, and zero active global or contextual substitution rules. General unit conversions exist; this proposal finds no ingredient-specific density, unit mapping, package-yield, or substitution data for these pastry/dough candidates.
- Pie-crust source observations include nutrition reference data and product/recipe size evidence, but no activated measurement mapping. Keep the existing pie-crust ledger states unchanged. The Health Canada 21 g value is a nutrition-labelling reference amount that explicitly groups pie crust, phyllo, and puff pastry sheets; it is not evidence that these are the same ingredient or that a full shell weighs 21 g.

## Evidence and source-to-claim limits

The catalog decisions use terminology sources for naming and product listings for the exact product features they show. A supplier SKU demonstrates that a product or package exists in that supplier’s range; it does not establish a generic package measure, yield, Québec household term, or substitution. Recipe formulas demonstrate a preparation, not a bought ingredient. Nutrition reference amounts are not recipe quantities.

| ID | Source and supported claim | Limit |
|---|---|---|
| S01 | [OQLF, pâte feuilletée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429641/pate-feuilletee): French term and English equivalents *flaky pastry* / *puff pastry*. | Terminology entry; does not establish current retail composition or package size. |
| S02 | [King Arthur Baking, Rough Puff Pastry](https://www.kingarthurbaking.com/recipes/rough-puff-pastry-recipe): rough/blitz puff differs in method; its recipe gives 939 g yield and states its own use cases. | One recipe and test-kitchen guidance; not a general bought-product conversion or substitution rule. |
| S03 | [PUFFCO](https://puffco.ca/en/): Québec manufacturer offers frozen puff pastry in butter, margarine, or mixed-fat formulations. | Manufacturer range; not a universal definition or ingredient-level composition attribute. |
| S04 | [Super C / Selection, Frozen Rolled Puff Pastry Sheets](https://www.superc.ca/en/aisles/frozen/meals-sides/chicken-turkey-meals/frozen-rolled-puff-pastry-sheets/p/059749950275): 400 g product listing marked as made in Québec. | One listed SKU; does not state a general sheet count or conversion. |
| S05 | [OQLF, pâte filo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8972938/pate-filo): *pâte filo*, *pâte phyllo*, *filo*, *phyllo* and English variants denote thin dough sheets. | Terminology entry; does not support merging with puff pastry. |
| S06 | [Metro, Frozen Phyllo Pastry](https://www.metro.ca/en/online-grocery/aisles/frozen/bakery/pie-shells-dough/frozen-phyllo-pastry/p/059749896290): 454 g product listing and ingredient panel. | One product; marketing copy is not a synonym source for puff pastry. |
| S07 | [Produits de Pâtisserie Orientale, food-service products](https://www.myphyllo.com/fr/food-service-products): separately lists bulk kataifi, phyllo/fillo, roasted/dry kataifi, nests, and prepared kunafa mix; bulk kataifi shown as 4 × 5 lb. | Supplier-specific names, states, and pack sizes only. |
| S08 | [Québec Tasty / PLMA 2024 supplier brochure](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/relations-internationales/Representations/Chicago/publications/en/BR-brochure-participants-PLMA-2024.pdf): local supplier describes kataifi (knafi) as shredded dough and phyllo as thin sheets. | Supplier brochure, not a formal terminology ruling. |
| S09 | [OQLF, pâte brisée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898104/pate-brisee): *pâte brisée* corresponds to shortcrust pastry and is differentiated by preparation from feuilletage. | Terminology entry; does not establish that every pie shell is shortcrust. |
| S10 | [OQLF, pâte sablée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037277/pate-sablee): shortbread dough terminology. | Supports keeping it distinct; does not specify all commercial products. |
| S11 | [OQLF, croûte à tarte congelée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497741/croute-a-tarte-congelee): frozen unbaked pie shell and *fond de tarte congelé*. | The frozen/unbaked qualifier is part of the term; not an alias for every pie crust. |
| S12 | [IGA, 4 bottoms and tops pie dough](https://www.iga.net/fr/produit/pate-a-tarte4-dessus-fond-de-tarte/00000_000000006505902604): a 1 kg listing with four bottoms and tops. | One product listing; not a shell mass, generic package yield, or confirmed Québec-origin claim. |
| S13 | [Health Canada, Table of Reference Amounts for Food, item A.23](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html): 21 g nutrition reference amount for pie crust, including phyllo and puff pastry sheets. | Nutrition-labelling reference only; not an identity, serving-to-recipe mapping, or shell weight. |
| S14 | [OQLF, pâte à pizza](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544314/pate-a-pizza): preferred French term *pâte à pizza* for pizza dough. | Terminology entry; does not cover baked crust/base equivalence. |
| S15 | [Metro, Fresh 2 Go Original Pizza Dough](https://www.metro.ca/en/online-grocery/aisles/bread-bakery-products/tortillas-flat-breads/pizza-dough-bases/original-pizza-dough/p/059749877749): 700 g product listing. | One SKU; not a generic dough yield. |
| S16 | [TERMIUM Plus, baking powder biscuit](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=BAKING+POWDER+BISCUIT): U.S. biscuit is a small quick bread leavened with baking powder or soda. | Defines the English food concept; does not settle the best Québec French catalog label. |
| S17 | [Rich Products Canada, Biscuit Dough](https://richproducts.ca/products/biscuits-bagels-pretzels/biscuits-dough/): frozen biscuit rounds and product-specific French label; 168-count 3.25 oz and 216-count 2.2 oz products. | Wholesale product SKUs and manufacturer wording only. |
| S18 | [Rich Products Canada, Everyday Cookie Dough](https://richproducts.ca/products/cookies/cookie-dough-everyday/): French label uses *pâte ordinaire à biscuits* for cookie dough. | Supports avoiding an ambiguous cookie-dough alias; not a biscuit-dough terminology standard. |
| S19 | [OQLF, pâte à choux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355161/pate-a-choux): raw mixture terminology and English variants including choux pastry/paste/dough. | Defines raw paste, not bought-product availability or ready-made shells. |
| S20 | [Rich Products Canada, Éclairs and Cream Puffs](https://richproducts.ca/products/eclairs-cream-puffs/): separate frozen unfilled cream-puff and éclair shells; listed 60- and 72-count SKUs at 1.02 oz each with French labels. | Wholesale SKU evidence only; not universal weights or Québec-preferred generic names. |
| S21 | [Gastronomia, ready-to-fill tart shells](https://gastronomia.ca/en/catalogue/ready-to-fill-tart-shells/): supplier listing for a 33 mm ready-to-fill mini choux pastry product. | One supplier product; does not establish broad retail availability or equivalence to raw choux paste. |

## Snapshot counts and checks

Counts and hashes below describe the live bundle and catalog read for this review, not proposed post-change state.

| Source | Live count / size | SHA-256 |
|---|---:|---|
| Ingredient references | 975 / 308,791 bytes | `5e8cf46dabb4b122a2c2897fc6a3f3d75e07c3795bfbf68a3db71bd748c8002d` |
| Ingredient forms | 61 / 44,158 bytes | `6e7ab1fd8d247c63138f1c281aed2f3afd67f40412f79defe64146dbc82fb053` |
| Package yields | 1 / 853 bytes | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Units | 30 / 5,447 bytes | `6f6e3afc8b2c12fe9120dbcf453d1e675fee596fa754f93cfead040a7ba8c8e4` |
| Global substitutions | 0 / 3 bytes | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitutions | 0 / 3 bytes | same as global substitutions |
| Bundled manifest | 114 recipes / 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe files | 114 / 1,123 ingredient rows / 752,054 bytes | ordered corpus hash below |
| Research ledger | 1,250 records / 3,952 source entries / 3,955,970 bytes | `c4273b046374384a76313e37bedf8c641d9875130e376ff0b785431aeef80339` |
| Legacy candidates | 75 / 17,900 bytes | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |

Ordered recipe corpus SHA-256: `c64f6e485babbb757bb3502f696fadcab4804cbb8cfa6af7961c7efde9ddb017` (manifest path, NUL, exact file bytes, NUL, in manifest order).

Review checks completed:

- Read `AGENTS.md`, the active catalog plan and workflow, Section G checklist, live references/forms/units/yields/substitution files, research ledger, legacy candidates, manifest, and all 114 recipe files.
- Audited recipe ingredient references and normalized current catalog names/aliases for exact target-term owners; treated substring-only matches as false positives.
- Verified the requested scope remains an unchecked Section G item. No shared catalog/ledger, plan, roadmap, code, or test file was edited.
- This is a proposal document only. No tests, build, or emulator run was needed or performed.
- Final file checks passed: UTF-8 decode succeeds, no BOM is present, the file ends with a newline, all nine recommendation groups are present, all 21 source rows have direct links, and the unresolved-items column is present.

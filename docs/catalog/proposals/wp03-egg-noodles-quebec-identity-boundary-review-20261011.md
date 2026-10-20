# WP03 Section G egg-noodle identity boundary review

- **Reviewed:** 2026-10-11
- **Recommendation:** add one identity-only finished noodle reference, **egg noodles / nouilles aux œufs**, in GRAIN_AND_CEREAL. Do not store **nouilles aux oeufs** as an alias: accent/ligature-folded search treats it as the same key as the display. Keep egg noodles distinct from generic pasta and ramen; do not infer any form, measurement, yield, conversion, recipe link, or substitution.
- **Scope:** review the open Section G egg-noodle item against current Canadian and Québec French/English names, live catalog neighbors, existing candidates, and recipe demand. Proposal only; no shared catalog, ledger, plan, roadmap, README, code, or test files were changed.

## Live catalog and recipe audit

Snapshot checked on 2026-10-11:

| Artifact | Count or result |
| --- | ---: |
| Active ingredient references | 966 |
| Ingredient forms | 53 |
| Research-ledger records | 1,238 |
| Legacy import candidates | 75 |
| Bundled recipe files | 114 |
| Bundled ingredient rows | 1,123 |

No active reference or form names egg noodles, egg pasta, or nouilles aux œufs. There is no egg-noodle-specific ledger or legacy-import candidate. The open generic candidate **ingredient-ref-noodles** remains unresolved: its only bundled mention is serving advice, “rice or noodles,” in Beef Stroganov; it is not an ingredient row. The open **candidate-alkaline-wheat-noodles** concerns a process/product boundary with ramen, not egg content. **ingredient-ref-rice-noodles** also remains unresolved and separate.

Relevant active identities:

| Neighbor | Current catalog entry | Boundary |
| --- | --- | --- |
| Generic pasta | **pasta / pâtes alimentaires**; French alias **pâte alimentaire** | Broad product identity. OQLF allows flour or semolina with water or eggs and separately describes fresh and dry types. Egg content alone does not turn this broad entry into an egg-noodle identity. |
| Ramen | **ramen noodles / nouilles ramen**; bilingual alias **ramen** | Keep this named noodle style separate. OQLF’s 2014 entry calls ramen egg noodles, but current Canadian manufacturer catalogs sell ramen products with egg and no egg. |
| Other noodle products | Separate active rows for soba, somen, udon, hiyamugi, rice vermicelli, mung-bean threads, sweet-potato-starch noodles, and shirataki | No entry is an egg-noodle alias. |
| Egg-roll wrapper | **egg-roll wrappers / pâte pour rouleaux aux œufs** | A wrapper containing the word “egg”; not a noodle or alias. |

Across the 1,123 ingredient rows, there are zero egg-noodle, ramen, pasta, or noodle product lines, and zero lines assigned to an active noodle or pasta reference. There is one generic English serving-instruction mention of “rice or noodles.” A French search hit for *ramener* is the verb “to bring to a boil,” not ramen. Recipe demand therefore does not drive this recommendation.

## Name and product boundary

The current Canadian Food and Drug Regulations supply a direct bilingual name pair: **egg noodles / nouilles aux oeufs**. Section B.13.051 regulates use of “egg noodles” and related egg-pasta names, requiring at least four percent egg-yolk solids on a dry basis for products sold under those designations. This is a legal product-name composition criterion, not a kitchen measure or recipe quantity. The French regulation uses plain “oeufs”; OQLF and current Québec product listings use the ligature spelling “œufs.” [S01–S02]

Québec-facing evidence supports **nouilles aux œufs** as ordinary product wording. The Québec food directory lists **Blue Dragon Nouilles aux Œufs Moyennes 6 Nids 300 g**, gives wheat flour, water, egg yolks, and salt, and identifies the same GTIN as the English product name **Blue Dragon Medium Egg Noodles 6 Nests 300 g**. A current Provigo French product page and Loblaws English page use **Sans Nom Nouilles aux œufs moyennes** / **No Name Medium Egg Noodles** for the same item number, 20313361002_EA. These are product-specific listings, not a universal recipe or state specification. [S03–S04]

OQLF’s 1982 *nouilles chinoises* entry explicitly pairs “nouilles aux œufs” with “egg noodles,” but describes the Chinese-style subset as fine and quick-cooking. It also warns that English “noodles” can be generic or specific and that Québec French *nouilles* does not mean generic *pâtes alimentaires*. Use this as Québec terminology corroboration, not as a definition of every egg-noodle product. [S05]

### Proposed identity

| Field | Proposal |
| --- | --- |
| English display | **egg noodles** |
| Québec French display | **nouilles aux œufs** |
| English aliases | None |
| French aliases | None. Accent/ligature-folded search matches the official regulatory spelling **nouilles aux oeufs** to the display term. |
| Category | GRAIN_AND_CEREAL |
| Scope | Finished noodle products explicitly named or labelled egg noodles / nouilles aux œufs. The label does not assert one universal grain, egg ingredient form, noodle width, or storage state. |

Do not add **egg pasta / pâtes alimentaires aux œufs** as aliases: those broader words can describe other pasta shapes such as egg pappardelle, while Canadian law separately names egg macaroni, egg spaghetti, egg noodles, and egg alimentary pastes. Keep **fine**, **medium**, **broad**, and **extra broad** as product/shape modifiers, not aliases or separate identities. Do not attach generic **noodles / nouilles**, **Chinese noodles / nouilles chinoises**, **ramen**, **instant noodles**, **kansui**, or egg-roll wrappers to this row.

## Egg, ramen, kansui, and product state

OQLF’s older ramen entry defines ramen as fine, quick-cooking egg noodles made from wheat flour, and lists **nouilles ramen / ramen**. That description supports local nomenclature but is too narrow to impose egg as a required ingredient on all current ramen products. Canadian manufacturer Hon’s 2025 catalog lists separate products named **Premium Ramen Noodles with Egg** and **Premium Ramen Noodles No Egg**. Sun Noodle describes its basic ramen as wheat flour, water, salt, and kansui, and its current high-fibre ramen ingredient panel lists sodium and potassium carbonates without listing egg. Taken together, current product evidence shows that egg presence and the ramen identity cross-cut; neither term should alias the other. [S06–S08]

Kansui is an alkaline ingredient/process used in some ramen products, not an egg ingredient or an egg-noodle name. The British Columbia Buy BC listing for a Canadian plant-based ramen maker says the product is 100% plant based and identifies kansui as what makes ramen noodles distinctive. This corroborates a Canadian ramen/kansui example but does not make all ramen formulations identical. Do not infer an alkaline-noodle identity from egg presence or attach **kansui** as an egg-noodle alias. [S09]

Product state also remains separate. OQLF treats fresh pasta and dried pasta as types within the broad pasta class. Current listings show particular egg-noodle items made with dried egg yolk; Hon’s Canadian manufacturer lists egg-containing Wonton thin noodles with cooler/freezer shelf-life guidance. Those examples show that the unqualified egg-noodle label does not determine dry, fresh, cooked, or frozen state. Keep those states out of the reference and do not use an item-specific package size or cooking direction as a general form or conversion. [S03–S04, S10–S11]

No density, household measure, unit mapping, cooking yield, package-to-recipe conversion, or substitution was found for egg noodles. The Québec listings’ 300 g and 340 g values are package sizes; the directory’s four-minute instruction is for one product. The federal four-percent dry-basis requirement is a legal composition threshold only. None supports recipe quantity or replacing pasta, ramen, or another noodle.

## Sources

All sources were accessed **2026-10-11**. Retail assortment, price, stock, and retailer-generated descriptions may change; each listing supports only its named product.

- **WP03-EGGNOODLES-20261011-S01 — Government of Canada, Food and Drug Regulations, B.13.051 (English).** [Current section](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.%2C_c._870/section-B.13.051.html?wbdisable=true). The page reports regulations current to 2026-09-03. Names “egg noodles” in the standard and sets a dry-basis egg-yolk-solids criterion; it does not prescribe a kitchen measure or establish a recipe substitution.
- **WP03-EGGNOODLES-20261011-S02 — Government of Canada, Règlement sur les aliments et drogues, B.13.051 (French).** [Current French text](https://laws-lois.justice.gc.ca/fra/reglements/c.r.c.%2C_ch._870/TexteComplet.html). The page reports the codification current to 2026-09-03. Uses “nouilles aux oeufs” and separately names other egg alimentary pastes. The statutory spelling omits the œ ligature.
- **WP03-EGGNOODLES-20261011-S03 — Répertoire des aliments québécois.** [Blue Dragon Nouilles aux Œufs Moyennes 6 Nids 300 g](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207787). Québec government product record; lists GTIN 672774106204, the English title “Blue Dragon Medium Egg Noodles 6 Nests 300 g,” the French product description, and wheat flour, water, egg yolks, and salt.
- **WP03-EGGNOODLES-20261011-S04 — Loblaw grocery pages.** [Provigo French product listing](https://www.provigo.ca/fr/nouilles-aux-ufs-moyennes/p/20313361002_EA) and [Loblaws English product listing](https://www.loblaws.ca/en/medium-egg-noodles/p/20313361002_EA). Both use item number 20313361002_EA for the No Name / Sans Nom 340 g medium egg noodles; the listings say the noodles are made with dried egg yolks. Retail titles and item data may change.
- **WP03-EGGNOODLES-20261011-S05 — Office québécois de la langue française.** [nouilles chinoises (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489317/nouilles-chinoises), last updated 1982. Its note explicitly pairs **nouilles aux œufs** and “egg noodles,” describes fine Chinese-style noodles, and distinguishes generic English “noodles” from Québec French *nouilles*. The note is old and does not define all current products.
- **WP03-EGGNOODLES-20261011-S06 — Office québécois de la langue française.** [nouilles ramen (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529875/nouilles-ramen), last updated 2014. Defines ramen as fine quick-cooking wheat egg noodles and lists **nouilles ramen / ramen** and English **ramen noodles / ramen**. It does not discuss kansui or every current product formulation.
- **WP03-EGGNOODLES-20261011-S07 — Hon’s Asian Comfort Food.** [Foodservice catalog, April 2025, flour-noodle and ramen sections](https://hons.ca/wp-content/uploads/2025/08/Foodservice-Catalog_2025-Apr_CA-3.pdf). Canadian manufacturer catalog distinguishes **Premium Ramen Noodles with Egg** (item 1811) from **Premium Ramen Noodles No Egg** (item 9048). Product names establish the manufacturer’s marketed distinction; the catalog is not an ingredient-panel analysis.
- **WP03-EGGNOODLES-20261011-S08 — Sun Noodle.** [The building blocks of ramen](https://sunnoodle.com/our-process/) and [High Fiber Paitan Ramen ingredients](https://sunnoodle.com/products/high-fiber-paitan-ramen/). Manufacturer process page names wheat flour, water, salt, and kansui for its basic ramen; the product panel lists carbonate ingredients and does not list egg. This is one manufacturer’s formulation evidence, not a universal ramen standard.
- **WP03-EGGNOODLES-20261011-S09 — Buy BC / The Plant Based Workshop.** [Plant-Based Ramen Noodles: Vegan](https://buybc.gov.bc.ca/product/plant-based-ramen-noodles-vegan/). British Columbia producer listing says the ramen is 100% plant based and names kansui as distinctive; it supports an example only.
- **WP03-EGGNOODLES-20261011-S10 — Office québécois de la langue française.** [pâte alimentaire (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870035/pate-alimentaire), last updated 2017. Defines pasta broadly as flour or semolina with water or eggs and distinguishes fresh and dry pasta; it does not say those broad terms are aliases for egg noodles.
- **WP03-EGGNOODLES-20261011-S11 — Hon’s Asian Comfort Food.** [Wonton Thin Noodles](https://hons.ca/products/hons/flour-noodles/wonton-thin-noodles/). Canadian manufacturer product page lists liquid egg white and whole egg, plus cooler/freezer shelf-life information. Direct page access was blocked by an anti-bot check; product details were available in its indexed page result. It is evidence about that named product only, not all egg noodles.

## Disposition

Add identity-only **egg noodles / nouilles aux œufs** without stored aliases. Accent/ligature-folded search matches the statutory **nouilles aux oeufs** spelling to the display. Do not attach the entry to the active ramen or broad pasta identity, and do not map ramen or kansui into egg noodles. Keep the broad Section G review of egg pasta, fresh/dry pasta, and other pasta forms open; this proposal resolves only the dedicated egg-noodle product boundary. Leave recipe links, forms, measurements, conversions, yields, and substitutions empty.

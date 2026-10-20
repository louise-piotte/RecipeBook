# WP03 Section I — black sesame paste product-boundary review

- **Reviewed:** 2026-10-12
- **Status:** Proposal only. This packet changes no catalog JSON, ledger, recipe, plan, roadmap, code, or test file.
- **Scope:** One colour-qualified sesame product: plain black sesame paste and the matching black-sesame-butter product wording. This follow-up revisits only the held black-sesame candidate from earlier WP03 reviews.
- **Excluded:** The Oct. 11 melon-seed regional-kernel review; the integrated pistachio-butter identity; whole sesame seeds and seed forms; tahini; Chinese sesame paste; generic sesame paste; black-sesame soup or dessert mixes; and any other already integrated seed or butter identity.

## Recommendation

Accept one identity-only candidate for **black sesame paste / pâte de sésame noir**, with **black sesame butter** and **beurre de sésame noir** as colour-qualified product-name aliases, limited to plain paste made by grinding black sesame seeds. The alias pair is supported by manufacturer product naming and a Québec retailer’s current local wording. It does not mean that every product called a sesame butter or sesame paste has the same seed state or composition.

| Proposed field | Value |
| --- | --- |
| Stable ID | `ingredient-ref-black-sesame-paste` |
| English display | `black sesame paste` |
| Provisional fr-CA display | `pâte de sésame noir` |
| EN alias | `black sesame butter` |
| FR alias | `beurre de sésame noir` |
| Category | `SAUCE_AND_CONDIMENT` |

Keep only a paste whose only intentional ingredient is black sesame seed in this proposed identity. The sources show roasted black seed in several products, but do not establish roasting or hull state as universal; retain those qualifiers on the product or recipe line. A paste blend with sugar, starch, rice, water, or other ingredients is outside this scope. The identity is separate from the whole-seed reference and from the current tahini and Chinese-sesame-paste identities. [S01–S07]

The French display is a provisional Québec-market label, not an OQLF ruling. Télé-Québec uses **pâte de sésame noir** in a Québec recipe, and a retailer in Saint-Jean-sur-Richelieu uses **beurre de sésame noir** for a sesame-only product. OQLF’s entry for unqualified **beurre de sésame** is the existing tahini term; keep that unqualified phrase on `ingredient-ref-tahini`. [S04–S06]

Do not add a recipe link, form, density, unit mapping, package yield, conversion, or substitution. The Québec recipe’s 45 ml quantity is an external, recipe-specific amount and is not a product conversion or a bundled-library link. [S05]

## Product boundary

Direct product sources show a stable, narrowly scoped paste class: black sesame seeds ground into a smooth or kneaded paste. Kowa describes a Japanese-made product as cleaned, roasted, and made into 100% pure sesame paste; San-Iku describes its product as 100% kneaded paste made from roasted black sesame; Eden lists whole black sesame seeds as the sole ingredient and describes its roasted seeds as ground into a smooth butter/paste. These sources support the plain, single-ingredient product scope, not a universal roasting, hull, or texture specification. [S01–S03]

The names **black sesame paste** and **black sesame butter** both occur for ground black sesame products. Eden lists its black-sesame butter separately from its tahini, whose product description specifies hulled sesame, and says its butter uses whole/unhulled black seed. This is one producer’s product distinction. It supports keeping the current unqualified tahini row separate and avoiding a global sesame-butter crosswalk; it does not prove that all brands use the same taxonomy. [S02, S06]

Keep these boundaries:

- **Black sesame seeds:** Keep `ingredient-ref-black-sesame-seeds` for whole seeds. Do not add paste terms to that row or create a `ground` form under the seed identity.
- **Tahini / `beurre de sésame`:** Preserve the current `ingredient-ref-tahini`. OQLF defines it as paste made from ground sesame seeds, but its entry does not settle black-seed colour, hull state, or all regional paste products. Do not alias `tahini`, `tahin`, `tahina`, or unqualified `beurre de sésame` to this candidate. [S06]
- **Chinese sesame paste:** Preserve `ingredient-ref-chinese-sesame-paste` as its separate style-qualified product. Do not merge products based on dark colour, Asian origin, or similar use. The current identity is not a generic parent for all black sesame pastes. [S08]
- **Sweetened black-sesame products and soup mixes:** Keep outside. A seller’s product listed as “Black Sesame Paste” includes black sesame, sugar, modified starch, and glutinous rice; this is a different compound product from the proposed single-ingredient paste. [S07]
- **Black sesame soup, porridge, drinks, confectionery fillings, pralines, and sauces:** Keep outside unless a future review identifies an exact purchasable product and its ingredient scope. A paste used in a recipe does not make the finished dish or compound product an alias.
- **`black tahini`, generic `sesame paste`, and `sesame butter`:** Do not add these aliases. They are broader or source-variable names and would undo the existing product boundaries.

No formula, serving size, density, household measure, package yield, or substitution can be transferred from the reviewed retail products. A product-specific ingredient list and label amount remain source evidence only.

## Independent Québec French wording review

| Evidence | Wording shown | What it supports | Limit |
| --- | --- | --- | --- |
| Télé-Québec Cuisinez recipe **Houmous à l’ail noir** | `45 ml (3 c. à soupe) de pâte de sésame noir` | Direct Québec French use of the proposed display phrase in a recipe ingredient line. | The recipe does not identify a brand, ingredient list, roast, hull state, or preparation method for its paste. Its amount is not bundled-recipe demand or a conversion. [S05] |
| Pot-Étique, Saint-Jean-sur-Richelieu, Québec | Current category title `Beurre de sésame noir en Vrac`; item listing says its ingredient is organic black sesame. | Québec retailer wording for a black-sesame product; supports the colour-qualified FR alias. | The item-detail catalogue page is older than the current category listing. Neither page is an OQLF decision; the listings do not state roast or hull state. [S04] |
| OQLF, GDT `beurre de sésame` | Definition: paste made from ground sesame seeds; preferred terms include `beurre de sésame`, `tahini`, `tahin`, and `tahina`. | Québec terminology for the existing generic tahini identity and support for keeping unqualified `beurre de sésame` there. | The entry does not name black sesame paste or prescribe the modifier `noir`. It is not evidence that the colour-qualified term is official. [S06] |

**Display decision:** use provisional `pâte de sésame noir` because it is the exact Québec recipe ingredient wording; retain `beurre de sésame noir` only as a colour-qualified, locally attested product alias. Do not represent either as an OQLF-approved black-sesame term. The modifier **noir** is necessary to keep the term distinct from OQLF’s unqualified tahini wording.

## Live catalog and recipe-demand audit

Read-only snapshot on 2026-10-12:

| Artifact | Live count or state |
| --- | ---: |
| Ingredient references | 1,095 |
| Ingredient forms | 79 |
| Legacy import candidates | 75 |
| Research-ledger records | 1,395 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

Relevant active references are `ingredient-ref-sesame-seeds`, `ingredient-ref-black-sesame-seeds`, `ingredient-ref-white-sesame-seeds`, `ingredient-ref-tahini`, `ingredient-ref-chinese-sesame-paste`, and `ingredient-ref-toasted-sesame-oil`. The only sesame seed forms are the existing toasted generic and toasted white-seed forms; none is a paste form. The catalog already includes `ingredient-ref-pistachio-butter`, which is outside this packet.

The proposed ID and the exact English/French display and alias keys have no owner in active references, forms, or legacy candidates. The ledger has the existing `candidate-generic-sesame-paste` in `needs_clarification`; this proposal does not resolve or relabel that broader candidate. The exact proposed ID and this packet’s source-ID prefix were absent from the inspected live files and prior proposals at review time.

All 114 manifest-listed recipe JSON files and their 1,123 ingredient rows were scanned across complete file text and ingredient rows for `black sesame paste`, `black sesame butter`, `black tahini`, `sesame paste`, `sesame butter`, `pâte de sésame noir`, `beurre de sésame noir`, `pâte de sésame`, `beurre de sésame`, `tahini`, `Chinese sesame paste`, and `pâte de sésame à la chinoise`. The scan found **zero matching bundled files, zero matching ingredient rows, and zero candidate recipe links**.

Five unrelated sesame rows were found: recipe `066#9` and `105#10` use sesame oil; `066#10` uses toasted white sesame seeds; `072#13` uses toasted sesame seeds; and `111#5` uses plain sesame seeds. Preserve those existing links and forms. Télé-Québec’s external black-garlic-hummus recipe is one Québec recipe use of the exact French product phrase, but it is not in the bundled corpus and cannot be linked here. [S05]

## Source register

Packet-local source IDs below are not research-ledger IDs. Pages were accessed on 2026-10-12.

| ID | Direct source | Claim and limit |
| --- | --- | --- |
| **S01** | Kowa American Corporation, [Black Sesame Paste Smooth](https://kowachemical.com/products/black-sesame-paste-smooth/). | Product page describes a Japanese-made paste from cleaned, washed, roasted sesame, made into 100% pure sesame paste; distinguishes its flavour from white sesame paste. Supports the plain paste product and this supplier’s process, not a universal roast or hull rule. |
| **S02** | Eden Foods, [Black Sesame Butter, organic, roasted](https://store.edenfoods.com/black-sesame-butter-organic-roasted/). | Manufacturer lists whole black sesame as its sole ingredient and says it is dry-roasted and ground into paste/butter. Its page distinguishes its whole-seed butter from its hulled sesame tahini. Supports this product and the source-specific boundary only. |
| **S03** | San-Iku Foods, [Black Sesame Paste](https://san-iku.co.jp/item/02580) (Japanese manufacturer page). | Manufacturer says its product is a 100% sesame paste made by grinding black sesame; the listed ingredient is roasted black sesame. Supports a second direct pure-paste example, not a Québec display or universal processing rule. |
| **S04** | Pot-Étique, Saint-Jean-sur-Richelieu, Québec, [current “Préparé au Québec” listing](https://potetique.com/boutique/product-category/prepare-au-quebec/) and [item catalogue listing](https://potetique.com/boutique/fr/tous-c81/?page=2), `Beurre de sésame noir`. | The current category uses the exact colour-qualified French product name; the older item catalogue page lists organic black sesame as its ingredient. Supports local wording and that product listing’s ingredient statement, not current stock or a universal formula. Neither page is an official terminology source; neither specifies roast or hull state. |
| **S05** | Télé-Québec Cuisinez, [Houmous à l’ail noir](https://cuisinez.telequebec.tv/recettes/7796/houmous-a-lail-noir), ingredient list. | Uses `pâte de sésame noir` at 45 ml (3 tablespoons) in one Québec recipe. Direct French wording and external recipe demand only; no product formulation or catalog measure is inferred. |
| **S06** | Office québécois de la langue française, [GDT: beurre de sésame](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360025/beurre-de-sesame). | Defines the generic term as paste made from ground sesame seeds and lists tahini, tahin, and tahina as preferred terms. Does not establish a black-sesame display or a crosswalk to every sesame paste. |
| **S07** | CH Mercury Trading, [Black Sesame Paste](https://www.chmercury.com.tw/brand-abc/0/detail-a3d284a0-26fe-11f0-9816-998f89754a30). | Product labelled “Black Sesame Paste” lists black sesame, sugar, modified starch, and glutinous rice. Used only to exclude a composite instant soup/dessert product from the proposed single-ingredient paste identity. |
| **S08** | WP05, [East Asian fermented-sesame identity resolution](wp05-east-asian-fermented-sesame-identity-resolution-20261010.md). | Existing project review accepts the style-qualified Chinese sesame-paste identity and holds generic sesame paste. Project context only, not independent product or language evidence. |

## Proposed integration shape

If the coordinator accepts this proposal, add only:

- `ingredient-ref-black-sesame-paste`
- English display `black sesame paste`; French display `pâte de sésame noir`
- EN alias `black sesame butter`; FR alias `beurre de sésame noir`
- Category `SAUCE_AND_CONDIMENT`
- No forms, density, unit mappings, recipe links, package yields, conversions, or substitutions

Keep the existing whole-seed, tahini, Chinese sesame paste, and generic unresolved sesame-paste records unchanged. Section I remains open; this review covers only the black-sesame paste/butter boundary.

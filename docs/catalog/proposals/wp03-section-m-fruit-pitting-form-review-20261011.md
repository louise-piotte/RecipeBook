# WP03 Section M — fruit pitting forms and source-specific portions

**Review date:** 2026-10-11  
**Disposition:** accept pitted-only forms for generic dates, Medjool dates, and cherries. Preserve recipe wording and quantities. Do not add pitting yields or active conversions.

## Corpus demand

| Recipe line | Existing reference | Exact bundled wording | Scope |
|---|---|---|---|
| 024#1 | `ingredient-ref-medjool-dates` | `425 g Medjool dates, pitted and chopped` | Medjool; chopped state remains recipe-specific. |
| 029#1 | `ingredient-ref-cherries` | `460 g pitted cherries, fresh or frozen` | Generic cherries; both fresh and frozen are permitted. |
| 058#2 | `ingredient-ref-dates` | `1 1/4 cups dates, pitted and chopped` | Generic dates; the line does not say dried or name a variety. |

The separate Medjool count recipe 031#1 says `20 Medjool dates`; its publisher method removes the pit. It remains a count line with no inferred mass.

## Evidence and scope

| Source | Supports | Does not support |
|---|---|---|
| [OQLF, *dénoyauté*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18947492/denoyaute) | Québec French adjective `dénoyauté`, English `pitted`, and explicit examples including cherries and dates. | A variety, pitting yield, or weight conversion. |
| [Aliments du Québec, *Dattes entières dénoyautées*](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/dattes-entieres-denoyautees) | A Québec product name and listing for whole pitted dates. The source classifies the product as dried fruit. | The unspecified generic-date recipe’s drying state, a date variety, or a generic portion. |
| [MAPAQ, Organic Pitted Deglett Dates — Prana](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201959) | A current Québec-directory product explicitly named pitted Deglett dates. | Generalization from Deglett to Medjool or all dates. The listing’s five-unit / 40 g serving was not imported. |
| [RICARDO, *Carré aux dattes (le meilleur)*](https://www.ricardocuisine.com/recettes/5263-carre-aux-dattes-le-meilleur) | Its French ingredient line specifies 425 g (2½ cups) Medjool-type dates, pitted and chopped, lightly packed. | A general cup weight, density, or conversion. The line’s dried-date fallback is not an alias or substitution rule. |
| [Cooking With Ayeh, *Chocolate Dates (3 Flavors)*](https://cookingwithayeh.com/chocolate-dates/) | Twenty Medjool dates and a method directing the cook to remove each pit. | A size class or total mass. |
| [Baking With Butter, *Cherry Cake Filling*](https://bakingwithbutter.com/cherry-cake-filling/#mv-creation-197-jtr) | 460 g (1 lb) fresh or frozen pitted cherries in one recipe. | Whether fresh fruit is weighed before or after pitting, or whether frozen cherries are thawed or drained. |

## Accepted data

Add three `pitted` preparation forms:

- `ingredient-form-dates-pitted` under `ingredient-ref-dates`, with `dattes dénoyautées / pitted dates`.
- `ingredient-form-medjool-dates-pitted` under `ingredient-ref-medjool-dates`, with `dattes Medjool dénoyautées / pitted Medjool dates`.
- `ingredient-form-cherries-pitted` under `ingredient-ref-cherries`, with `cerises dénoyautées / pitted cherries`.

The forms record pit removal only. Chopping, light packing, and fresh/frozen state stay in the exact recipe line or preparation. The generic dates form does not add a dried state, variety, size, or edible-portion basis. The existing USDA SR28 observation of one pitted Medjool date = 24 g is now explicitly associated with the pitted Medjool form; its source-specific value and limitations are unchanged.

Two published-recipe portions are recorded only in the research ledger:

- RICARDO’s Medjool line: 425 g / 2½ cups, pitted, chopped, lightly packed.
- Baking With Butter’s cherry line: 460 g / 1 lb, pitted, fresh or frozen.

Both are source-specific recipe portions, not reusable conversions. No active density, unit mapping, pitting yield, package yield, recipe link, or substitution was added. The bundle’s recipe files and all three original ingredient lines remain unchanged.

## Files

- Canonical forms: `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- Research evidence and observations: `docs/catalog/research-ledger.v1.json`
- Integration record: `docs/catalog/batches/wp03-section-m-fruit-pitting-form-integration-20261011/README.md`


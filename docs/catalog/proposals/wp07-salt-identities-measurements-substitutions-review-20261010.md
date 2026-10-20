# WP07 salt identities, measurements, and substitutions — 2026-10-10

**Status:** Integrated into the bundled catalog and research ledger.

## Decision

Keep plain salt as the generic salt identity and add distinct identities for table salt, fine and
coarse sea salt, kosher salt, fleur de sel, flaky sea salt, kala namak, and smoked salt. Preserve
grain size, source, production, and use distinctions. Do not treat kosher salt and coarse sea salt
as the same product, or fleur de sel as generic flaky sea salt.

The old generic salt aliases `table salt`, `kosher salt`, and `fine salt` in English, plus `sel
kasher` and `sel fin` in French, are removed from the generic row. Only exact, reviewed product names
are assigned to the new identities. The unqualified terms `fine salt`, `coarse salt`, `black salt`,
and `sel noir` remain unassigned because they do not identify one reviewed product class safely.

## Search and corpus review

Reviewed direct searches and source pages for table salt, kosher salt, fine/coarse sea salt, fleur de
sel, flaked sea salt, kala namak, smoked salt, tablespoon weights, and salt-type substitutions.
Searches included “King Arthur kosher salt table salt substitution,” “site:selwindsor.com gros sel
casher,” “sel de mer fin,” “gros sel de mer Québec,” “fleur de sel OQLF,” “kala namak product
Canada,” and “sel fumé Québec.” Exact labels and measurements were then checked against the current
active reference and alias index.

All 114 manifest-listed recipes were scanned for named salt phrases. The exact product lines are
three kosher-salt lines (Pinwheel Cookies, Breakfast Casserole, African Peanut Stew) and one flaky
sea-salt topping line (Chocolate Dates). Those four lines now point to their exact references. The
line “2 tbsp coarse salt” in Pork Rub remains attached to generic salt: the recipe does not say sea,
kosher, or another source/type. Unqualified salt lines remain generic.

## Accepted identities

| Reference | English / French display | Evidence and boundary |
|---|---|---|
| `ingredient-ref-salt` | salt / sel | Generic recipe wording only. Product-specific aliases were removed. |
| `ingredient-ref-table-salt` | table salt / sel de table | King Arthur distinguishes standard-grain table salt; Windsor Québec labels its iodized fine-crystal product *sel de table*. Iodized status is not generalized. |
| `ingredient-ref-fine-sea-salt` | fine sea salt / sel de mer fin | Vancouver Island Sea Salt and Mayrand list fine sea salt separately from flake and coarse products. |
| `ingredient-ref-coarse-sea-salt` | coarse sea salt / gros sel de mer | Mayrand Québec lists a *gros sel de mer* product. Grain size is not a source or certification. |
| `ingredient-ref-kosher-salt` | kosher salt / gros sel casher | Windsor Québec uses *gros sel casher* and describes compact flakes and coarse grain. Brand-specific volume weights remain distinct. |
| `ingredient-ref-fleur-de-sel` | fleur de sel / fleur de sel | OQLF defines the French term as fine crystals hand-harvested from salt-pan surfaces; a Canadian producer sells it as finishing salt. Keep separate from generic flakes. |
| `ingredient-ref-flaky-sea-salt` | flaky sea salt / sel de mer en flocons | King Arthur describes large crunchy sea-salt flakes as a topping and cautions against mixing them into doughs/batters; a Canadian producer lists flake and fine sea salt separately. |
| `ingredient-ref-kala-namak` | kala namak / kala namak | The European Commission identifies kala namak as Himalayan black salt and an Indian-Pakistani specialty; a Canadian food retailer sells a product labeled Black Salt (Kala Namak). Bare “black salt” is not an alias. |
| `ingredient-ref-smoked-salt` | smoked salt / sel fumé | OQLF gives *sel fumé* and *sel de fumage* for salt impregnated with wood smoke; a Québec maker describes a cold-smoked sea-salt product. Do not generalize to all flavored salts. |

The catalog uses `gros sel casher` for Quebec French, `sel de table` for table salt, `sel de mer en
flocons` for flaky sea salt, and `gros sel de mer` for coarse sea salt. No unreviewed French spelling
variant was added merely to preserve an old broad alias.

## Measurement observations

The ledger retains source-qualified bulk-density observations only. No salt received an active
default density or unit mapping because the values are product-, brand-, or method-sensitive.

- King Arthur's ingredient chart reports 18 g per tablespoon of table salt, 16 g per tablespoon of
  Morton’s kosher salt, and 8 g per tablespoon of Diamond Crystal kosher salt.
- UC Master Food Preserver's 2025 article measured two-tablespoon scoops, leveled with a knife, on a
  calibrated kitchen scale (±0.02 g). Its separate results are 16.9 g/tbsp for Diamond Crystal
  Granulated Salt, 8.2 g/tbsp for Diamond Crystal Kosher Salt Flakes, 9.8 g/tbsp for Maldon Sea Salt
  Flakes, 10.3 g/tbsp for San Francisco Salt Co. Fleur de Sel, and 15.8 g/tbsp for Baleine Fine Sea
  Salt.
- These are not averaged or turned into runtime mappings. UCANR documents a 2.3-fold range across
  the sampled salts and warns that the wrong salt volume can undermine fermentation. No value is
  generalized to coarse sea salt, all brands, or all preparations.

## Directional substitution findings

The ledger records bounded findings, without runtime rules:

- For a King Arthur recipe written for table salt, King Arthur says one tablespoon of table salt is
  approximately one tablespoon of Morton’s kosher salt, while Diamond Crystal kosher salt uses
  twice the called-for volume. By weight, use the same gram amount. These are separate brand-specific
  directions and do not apply to other recipe standards or preservation.
- For bread dough, King Arthur Bread 101 says salt types can be used in bread, equal by weight; by
  volume, one level teaspoon of finely ground table salt corresponds to one heaping teaspoon of
  coarse kosher salt. This supports the separately recorded kosher-to-table direction in that
  bread context.
- For generic salt in yeast bread, the same source supports table or kosher salt by equal weight.
  None of these directions is activated at runtime because brand, spoon fill, and use context cannot
  be represented safely by the current generic rule.
- Do not carry any of these findings into pickling, curing, or fermentation, and do not infer a
  general substitute for fleur de sel, flaky salt, fine/coarse sea salt, kala namak, or smoked salt.

## Source register

| ID | Source | Supports |
|---|---|---|
| `WP07-SALT-20261010-S01` | [King Arthur Baking, Is there a best salt for baking?](https://www.kingarthurbaking.com/blog/2021/06/17/kosher-salt-best-salts-for-baking) | Separates table, kosher, sea, and flaky sea salts; describes brand-specific kosher volume guidance and the finishing use/limits of flaky sea salt. |
| `WP07-SALT-20261010-S02` | [King Arthur Baking, Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) | Publishes tablespoon weights for table salt, Morton’s kosher salt, and Diamond Crystal kosher salt. |
| `WP07-SALT-20261010-S03` | [Sel Windsor, Gros sel casher Windsor](https://selwindsor.com/produit-cuisine/gros-sel-cascher-windsor/) | Quebec French product name, coarse grain, compact flakes, and culinary uses for one kosher-certified product. |
| `WP07-SALT-20261010-S04` | [Sel Windsor, Sel de table iodé Windsor](https://selwindsor.com/produit-cuisine/sel-de-table-iode-windsor/) | Quebec French table-salt label and fine, uniform crystals for the named iodized product. |
| `WP07-SALT-20261010-S05` | [Vancouver Island Sea Salt, French catalog](https://canadianseasalt.com/fr) | Canadian product terms `sel de mer en flocons` and `sel de mer fin`, listed as separate products. |
| `WP07-SALT-20261010-S06` | [Mayrand, Gros sel de mer](https://mayrand.ca/fr/nos-produits/epicerie/epice-sel-et-poivre/sel/sel-de-mer-gros-deltasal-36599) | Quebec retail listing for coarse sea salt and adjacent fine sea-salt products. |
| `WP07-SALT-20261010-S07` | [OQLF, fleur de sel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350274/fleur-de-sel) | Quebec French term and definition. |
| `WP07-SALT-20261010-S08` | [Salt Spring Sea Salt, Canadian Fleur de Sel](https://www.saltspringseasalt.com/) | Canadian production and finishing-salt use of fleur de sel. |
| `WP07-SALT-20261010-S09` | [UC Master Food Preserver, Salt, the Only Rock We Eat! (May 2025)](https://ucanr.edu/program/uc-master-food-preserver/article/salt-only-rock-we-eat-may-2025) | Measured sample, method, brand/product weights, and fermentation caution. |
| `WP07-SALT-20261010-S10` | [European Commission, Kala Namak conclusion](https://food.ec.europa.eu/document/download/ed38ebed-ca42-4789-ab61-7c009ecde457_en) | Identifies kala namak as Himalayan black salt, a rock salt, and an Indian-Pakistani specialty. |
| `WP07-SALT-20261010-S11` | [Ameen Foods, Black Salt Powder / Kala Namak](https://ameenfoods.ca/products/black-salt-powder) | Canadian food retail product labeled Black Salt (Kala Namak). |
| `WP07-SALT-20261010-S12` | [OQLF, sel de fumage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17097492/sel-de-fumage) | Quebec French term and synonym `sel fumé`; definition is salt impregnated with wood smoke. |
| `WP07-SALT-20261010-S13` | [Alcyon, Sel à la Brise Fumée](https://alcyonsel.com/products/sel-a-la-brise-fumee) | Quebec product uses sea salt cold-smoked at Îles-de-la-Madeleine; source-specific product and process. |
| `WP07-SALT-20261010-S14` | [King Arthur Baking, Bread 101](https://shop.kingarthurbaking.com/content/class-pdfs/Bread101_February2025.pdf) | Bread-context salt choices; equal weights and the level-table/heaping-kosher teaspoon comparison. |

## Integration limits

No ingredient forms, density mappings, substitutions rules, or changes to unqualified recipe salt
lines were added. The broader research plan still needs measurements for additional salt products,
and substitution reviews outside the bounded bread and King Arthur baking contexts.

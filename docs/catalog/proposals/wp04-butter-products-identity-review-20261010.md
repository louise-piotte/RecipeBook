# WP04 butter-products identity review — 2026-10-10

**Status:** Reviewed and integrated by the coordinator on 2026-10-10; outcome recorded below.

**Scope:** Section Q butter products: salted and unsalted butter, cultured butter, ghee, clarified butter, and browned butter. The half-salted boundary is included because the active catalog currently aliases `beurre demi-sel` to salted butter and one bundled line explicitly asks for semi-salted butter.

## Snapshot and current catalog

The live seed package was reviewed on 2026-10-10: 842 active ingredient references, 47 ingredient forms, 78 legacy import candidates, 1,082 research-ledger records, and 114 bundled recipes with 1,123 ingredient lines. These counts are a snapshot of the concurrent workspace, not an integration claim.

| Current identity | Active bilingual names and aliases | Catalog values and boundary |
|---|---|---|
| `ingredient-ref-unsalted-butter` | `unsalted butter` / `beurre non salé`; EN alias `butter`; FR aliases `beurre`, `beurre doux` | `FAT_AND_OIL`; no active density or unit mapping. Retain. The `beurre doux` alias denotes sweet-cream butter with no added salt in OQLF usage; do not expand it to cultured butter. |
| `ingredient-ref-salted-butter` | `salted butter` / `beurre salé`; FR alias `beurre demi-sel` | `FAT_AND_OIL`; no active density or unit mapping. Retain salted butter, but remove the `beurre demi-sel` alias during a later catalog integration because Québec terminology distinguishes the lightly salted product from salted butter. |
| `ingredient-ref-ghee` | `ghee` / `beurre de ghee`; EN alias `ghee butter` | `FAT_AND_OIL`; no active density or unit mapping. Retain the existing source-backed identity and prior decision to keep it distinct from plain butter, niter kibbeh, and generic clarified-butter wording. |

There is no active butter form for culture, clarification, or browning. The legacy file has no exact candidate for semi-salted, cultured, clarified, or browned butter; the nearby `butterscotch chips`, `natural peanut butter`, and `peanut-butter chips` candidates are different products. The ledger already contains the unsalted-butter portion and one-way substitution findings, a source-empty salted-butter record, and the verified ghee identity. It has no separate cultured-butter, clarified-butter, browned-butter, or half-salted-butter identity record.

## Exact bundled recipe demand

The 114 current recipe files and all 1,123 ingredient lines were checked. Existing links remain unchanged.

- **Unsalted butter:** 68 linked lines: 60 explicitly say `unsalted butter`; 8 say only `butter` and are linked to the unsalted identity (`034#3`, `037#2`, `070#13`, `086#2`, `092#2`, `097#2`, `099#1`, `100#5`).
- **Salted butter:** 3 linked lines: two explicit lines (`039#8`, `064#2`) and `081#5`, whose exact text is `1 cup melted butter` although its active link is salted butter.
- **Unlinked butter:** six exact lines: `024#10` `170 g semi-salted butter, softened`; `026#2` `3/4 cup butter, melted`; `058#3` `57 g butter, softened`; `058#14` `128 g butter`; `071#1` `1/2 cup butter, softened`; and `072#15` `Melted butter`.
- **Cultured, ghee, clarified, or browned butter:** zero ingredient-line matches. The only whole-recipe text hit is `094`'s source name “Browned Butter Blondie”; that recipe's actual ingredient lines call for unsalted butter and its method does not brown it. It is not browned-butter demand.

The semi-salted row at `024#10` is the one exact line that supports a missing identity candidate. No recipe relink or other recipe edit is proposed in this packet.

## Product-boundary findings and coordinator dispositions

| Product / candidate wording | Evidence-based boundary | Proposed disposition |
|---|---|---|
| **Unsalted butter** — `unsalted butter` / `beurre non salé`; current `beurre doux` alias | OQLF pairs `beurre non salé` with `unsalted butter` and describes `beurre doux` as sweet-cream butter with no salt added. The Canadian butter standard sets a minimum of 80% milk fat and permits milk solids, bacterial culture, and salt. “Unsalted” is not evidence that a butter was cultured or that every unqualified butter line is unsalted. | Retain the active identity and the prior generic `butter` matching behavior. Keep `beurre doux` within its sweet-cream sense; do not reuse it for cultured butter. Avoid a new global interpretation of all unqualified butter lines. |
| **Salted butter** — `salted butter` / `beurre salé` | OQLF recognizes this as a product name distinct from `beurre demi-sel`. The Canadian butter standard does not define a single universal salt percentage for all salted retail butter. | Retain the active identity. Remove its erroneous `beurre demi-sel` alias when the catalog is next integrated. Do not add a general sodium or salt value. |
| **Half-salted / semi-salted butter** — candidate canonical EN `half-salted butter`, FR `beurre demi-sel`; recipe wording `semi-salted butter` | OQLF defines `beurre demi-sel` as only lightly salted, in contrast to both `beurre doux` and `beurre salé`, and supplies English `half-salted butter`. Natrel's Québec product page uses `Half-Salted Butter`; the bundled recipe independently uses `semi-salted butter`. A current Maxi listing says its Sans Nom demi-sel product has 40% less sodium than that brand's salted butter. The OQLF entry and retailer comparison establish a product distinction, not a Canadian-wide salt threshold. | Propose new `ingredient-ref-half-salted-butter` in `FAT_AND_OIL`, with English alias `semi-salted butter`. Remove `beurre demi-sel` from `ingredient-ref-salted-butter` and make it the French canonical name for this candidate. The exact `024#10` line is a recipe-demand match for future coordinator integration. Do not assign a salt percentage or a universal nutrition value. |
| **Cultured butter** — `cultured butter` / `beurre de culture` | OQLF defines it as butter made by churning cream acidified with lactic bacteria and describes a lightly acid flavor. CFIA uses the bilingual label qualifier `Cultured` / `de culture` when the cream was prepared with bacterial culture. Culture is permitted within the Canadian butter standard rather than defining a new fat threshold, and Canada Grade 1 flavor guidance describes cultured butter as slightly acidulous. Salt status is a separate product attribute; the label rules do not support mapping cultured butter to unsalted butter or to `beurre doux`. | Treat this as a distinct named butter product when an exact recipe or product link requires it, but do not add an active reference or form now: the bundled corpus has no ingredient demand, and the reviewed sources do not establish one universal salt/fat formulation for the cultured category. Do not alias it to unsalted butter, ghee, or `beurre doux`. |
| **Ghee** — existing `ghee` / `beurre de ghee` | The prior WP06 review verified the Québec bilingual name and retained ghee as distinct from plain butter, niter kibbeh, and generic clarified-butter wording. Canadian guidance places ghee and butter oil/clarified butter in the same high-fat compositional standard, but that does not make every recipe use of “clarified butter” a ghee instruction. No bundled line asks for ghee. | Retain existing `ingredient-ref-ghee` and its current names. Do not add clarified-butter aliases or substitutions to it from the standard alone. |
| **Clarified butter / butter oil** — `butter oil or clarified butter` / `huile de beurre ou beurre clarifié` | The Canadian identity standard defines this product by removal of most water and non-fat solids: at least 99.3% milk fat and at most 0.5% water. The same standard names anhydrous butter oil separately (at least 99.8% milk fat and at most 0.1% water). A Québec food-directory listing names one Laiterie Chagnon product “Clarified Butter Ghee,” which is evidence of a product-specific paired label, not a universal synonym rule. | Keep generic clarified-butter wording unresolved and distinct from the existing ghee identity, consistent with the prior WP06 decision. Do not create a second active reference or an alias without an exact recipe/product context; no bundled recipe line currently needs either. |
| **Browned butter** — `brown butter` / `beurre noisette` | OQLF defines `beurre noisette` as melted butter heated until light chestnut color and a toasted-hazelnut aroma; it notes that lactose and proteins caramelize. King Arthur's process description says water evaporates while milk solids brown, and those browned solids remain in the preparation. That retained-solid, flavor-bearing preparation is not clarified butter, whose standard removes most non-fat solids. | Classify as a prepared butter form if future recipe demand appears, not as a new base-fat identity. Hold activation now because the corpus has no browned-butter ingredient or method. Do not alias `beurre noisette` to active `ingredient-ref-hazelnut-butter` (`beurre de noisette`); preserve the lexical distinction and review picker collisions if a form is later added. |

## Measurement, edible portion, and substitution disposition

- The unsalted-butter record already contains Health Canada's Canadian Nutrient File portions for Food code 92: 15 mL = 14.4 g, 100 mL = 95.9 g, 250 mL = 239.9 g, and 1 stick = 113.5 g. The source does not describe its measuring method or define a portable “stick.” The prior WP07 review accepted those as source-qualified portions only; it did not set density or unit mappings because a Canadian 250 mL cup also differs from the app's 236.5882 mL cup. This proposal does not duplicate or broaden that finding.
- The reviewed product listings contain serving declarations, not globally transferable conversions: Natrel half-salted butter lists nutrition per 10 g, and the Laiterie Chagnon clarified-butter/ghee product is listed per 1 tbsp (13 g). Keep these values product-specific. No general density, tablespoon-to-mass mapping, package yield, or preparation yield is supported for salted, half-salted, cultured, clarified, ghee, or browned butter.
- Butter has no inedible portion to model in these ingredient lines. The unsalted CNF record reports 0% refuse; do not treat that as a newly reviewed observation for the other butter products.
- The prior WP08 finding permits only one directional, source-bounded recommendation: in a King Arthur recipe that calls for unsalted butter, use the same amount of salted butter and reduce added salt by 1/4 teaspoon per 8 tablespoons of butter. It remains ledger-only because the adjustment cannot be represented with the current substitution rule and the source does not quantify every salted product. Do not reverse it or extend it to half-salted, cultured, clarified, ghee, browned butter, or unrelated recipes.
- No source-backed directional substitution is established for cultured butter, half-salted butter, clarified butter, ghee, or browned butter. Browning and clarification change the water/solids profile and flavor; any recipe-specific replacement would require an exact test or source.

## Source manifest

All external sources below were accessed 2026-10-10. The proposal-local source-ID prefix `WP04-BUTTER-PRODUCTS-20261010-S` was collision-checked against the current research ledger and catalog documents before drafting.

| ID | Source | Supports and limits |
|---|---|---|
| `WP04-BUTTER-PRODUCTS-20261010-S01` | Office québécois de la langue française, [beurre de culture](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2096119/beurre-de-culture) | Preferred Québec French and English terms; defines the product as lightly acidic butter made from cream acidified with lactic bacteria. |
| `WP04-BUTTER-PRODUCTS-20261010-S02` | Canadian Food Inspection Agency, [Use of whey cream in butter production](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy/whey-cream) | Restates the Canadian butter composition standard: at least 80% milk fat, with milk solids, bacterial culture, and salt permitted. This is a regulatory composition boundary, not an exact salt level for retail products. |
| `WP04-BUTTER-PRODUCTS-20261010-S03` | Canadian Food Inspection Agency, [Labelling requirements for dairy products](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy), “Additional terms” table | Bilingual `Cultured` / `de culture`, `Unsalted` / `non salé`, and `Salted` / `salé` wording and their cited conditions for butter products. Labelling conditions are not a full recipe interchange rule. |
| `WP04-BUTTER-PRODUCTS-20261010-S04` | Canadian Food Inspection Agency, [Canadian Grade Compendium: Volume 4 — Dairy Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-4), butter grade requirements | Grade Canada 1 cultured butter has a “slightly acidulous” typical/desirable flavor. This is a grade quality description, not a universal acidity or taste measurement. |
| `WP04-BUTTER-PRODUCTS-20261010-S05` | Office québécois de la langue française, [beurre demi-sel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18061927/beurre-demi-sel) | Preferred Québec French and English `half-salted butter`; defines it as only lightly salted, distinct from unsalted/sweet butter and salted butter. No general Canadian salt threshold is inferred. |
| `WP04-BUTTER-PRODUCTS-20261010-S06` | Natrel, [Half-Salted Butter](https://www.natrel.ca/en/products/butters/half-salted-butter) | Canadian/Québec product wording and product-specific composition: cream and salt; nutrition panel per 2 teaspoons (10 g). The product page is evidence for this SKU, not all half-salted butter. |
| `WP04-BUTTER-PRODUCTS-20261010-S07` | Office québécois de la langue française, [beurre salé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299254/beurre-sale) | Preferred French name and English `salted butter`; the older descriptive note is not used to assign a current Canadian numeric salt content. |
| `WP04-BUTTER-PRODUCTS-20261010-S08` | Office québécois de la langue française, [beurre non salé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2494540/beurre-non-sale) | Québec French and English pairing for unsalted butter. |
| `WP04-BUTTER-PRODUCTS-20261010-S09` | Office québécois de la langue française, [beurre doux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2096116/beurre-doux) | Describes sweet butter as made from sweet cream with no salt added. The source's product definition is narrower than a synonym for every unflavored or cultured butter. |
| `WP04-BUTTER-PRODUCTS-20261010-S10` | Canadian Food Inspection Agency, [Canadian Standards of Identity: Volume 1 — Dairy Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-1) and [French text](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-1?wbdisable=false), sections 39–40 | Bilingual identity name and numeric composition for butter oil/clarified butter and anhydrous butter oil. Ghee's prior identity evidence and scope remain in the WP06 South Asian review. |
| `WP04-BUTTER-PRODUCTS-20261010-S11` | Québec Répertoire des aliments québécois, Laiterie Chagnon, [Clarified Butter Ghee](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202838) | One locally listed product pairs “clarified butter” and “ghee” in its name. It reports a 1 tbsp (13 g) nutrition serving and uses manufacturer marketing language; neither establishes universal synonymy or product-wide density/function. |
| `WP04-BUTTER-PRODUCTS-20261010-S12` | Office québécois de la langue française, [beurre noisette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557043/beurre-noisette) | Preferred French preparation name and English terms including `brown butter`; defines heating and color/aroma endpoint and notes caramelization of lactose/proteins. |
| `WP04-BUTTER-PRODUCTS-20261010-S13` | King Arthur Baking, [How to make brown butter](https://www.kingarthurbaking.com/blog/2020/01/08/brown-butter) | Explains water evaporation and browning of milk solids, which remain in brown butter and contribute toasted flavor. One culinary reference; not a recipe-specific substitution test. |
| `WP04-BUTTER-PRODUCTS-20261010-S14` | Maxi Québec, [Sans Nom Beurre demi-sel](https://www.maxi.ca/fr/beurre-demi-sel/p/20316543001_EA) | Retailer states its demi-sel SKU has 40% less sodium than its Sans Nom salted butter SKU. This is a brand/product comparison, not a category-level nutrient claim. |

## Existing research kept in scope

- [WP07 unsalted-butter portion evidence review](wp07-unsalted-butter-portion-evidence-review-20261010.md) contains the accepted source-qualified CNF portion observations; this packet neither repeats them as new findings nor adds density/mapping data.
- [WP08 unsalted-to-salted butter context review](wp08-unsalted-salted-butter-context-review-20261010.md) contains the accepted one-way, King Arthur recipe-context salt adjustment. No reverse or broader substitution is proposed.
- The existing WP06 South Asian review provides the accepted ghee identity and its separation from generic clarified butter wording. This packet keeps that identity and does not duplicate its ghee sources or revise that decision.

## Acceptance checks for later integration

1. Keep salted butter, unsalted butter, and ghee as their existing distinct identities.
2. Remove `beurre demi-sel` from the salted-butter aliases and create the half-salted identity only with a coordinator-approved integration that accounts for exact line `024#10`.
3. Keep cultured butter documented as a distinct named product candidate; no active row or form is needed without exact recipe demand.
4. Keep generic clarified butter unresolved and separate from ghee. Do not infer that the Québec product listing makes the names global aliases.
5. Keep browned butter as a possible butter form, not a base identity; preserve the `beurre noisette` / `beurre de noisette` distinction.
6. Add no density, unit mapping, conversion, package yield, or new substitution rule from this proposal.

## Coordinator integration outcome — 2026-10-10

- Added `ingredient-ref-half-salted-butter` as `half-salted butter` / `beurre demi-sel`, with the
  source-attested English alias `semi-salted butter`; linked only recipe 024's exact semi-salted
  butter line and retained its wording, amount, unit, and preparation.
- Removed `beurre demi-sel` from the salted-butter aliases. Existing unsalted butter and ghee names
  remain intact; the `beurre doux` boundary is recorded as sweet-cream butter without added salt.
- Recorded cultured butter as a distinct held product, generic clarified butter as separate from
  ghee, and browned butter as an inactive prepared-form candidate. None has bundled ingredient-line
  demand; no active row/form, measurement, density, mapping, conversion, yield, or substitution was
  added for them.
- Added 14 source records to the research ledger. Product-specific label and serving evidence stays
  source-scoped. See
  [`batches/wp04-butter-products-integration-20261010/README.md`](../batches/wp04-butter-products-integration-20261010/README.md)
  for package verification and the exact changed-data summary.

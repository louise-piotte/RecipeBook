# WP03 Section F: cream-of-wheat hot-cereal identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No shared catalog, ledger, recipe, roadmap, plan, generated, or test file changed.
- **Scope:** Plain, dry wheat hot cereal sold in Québec as *crème de blé*, a distinct open preprocessed-grain item under Section F's regional cereal and preprocessed-grain checklist ([plan, line 1955](../../RecipeBook-global-ingredient-catalog-plan.txt#L2048)).
- **Recommendation:** Accept one identity-only reference as **`cream of wheat hot cereal / crème de blé`**. Keep it separate from wheat farina or semolina as milling ingredients, whole-wheat meal, cooked cereal, and rice hot cereals. Add no aliases, forms, measures, mappings, conversions, yields, recipe links, or substitutions.
- **Prior-review check:** The 2026-10-12 wheat-flake and residual-grains reviews do not cover this product. The existing cream-of-rice hot-cereal review uses Cream of Wheat as a comparison and reuses one RICARDO source, but does not allocate a wheat-cereal identity. The separate brown-rice-farina review explicitly keeps brown-rice farina apart; it is not reopened here.

## Candidate identity and scope

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-cream-of-wheat-hot-cereal` |
| English display | `cream of wheat hot cereal` |
| Québec French display | `crème de blé` |
| English aliases | none |
| French aliases | none |
| Category | `GRAIN_AND_CEREAL` |
| Default density / unit mappings | `null` / `[]` |

The proposed identity is a plain, dry, wheat-based hot breakfast cereal sold under the Québec product name *crème de blé*. Manufacturer descriptions identify a ground-wheat cereal intended to be cooked with water or milk. Canadian French product wording and Québec culinary usage attest *crème de blé* for this hot-cereal product. This is a product identity, not a claim that every product has one milling grade, formula, fortification, cooking time, or wheat fraction.

The Canadian Cream of Wheat product pages are evidence for this product class, not a proposal to store a brand or SKU as a separate ingredient. Their Original products list wheat farina or wheat flour plus defatted wheat germ and mineral ingredients. Bob's Red Mill Canada's French page and RICARDO use *crème de blé* for a wheat hot cereal. Those differences keep product formulations and processes source-specific.

## Product and terminology boundaries

| Candidate or wording | Disposition | Boundary |
|---|---|---|
| `cream of wheat hot cereal / crème de blé` | **Accept for identity-only integration.** | Plain, dry wheat hot-cereal product attested in Canadian French product wording and Québec culinary usage. Keep the English display explicit about hot cereal. The French display is locally attested; it is not presented as an OQLF-standardized compound. |
| `wheat farina`, `farina`, `wheat semolina`, `semolina`, `semoule de blé`, `semoule de blé tendre`, `semoule de blé dur` | **Do not add as aliases.** | These terms name wheat milling products or broader source-specific ingredients. OQLF's existing `semoule de blé tendre` entry maps to wheat farina / semolina in a wheat-milling context [existing source `WP03-IDLI-RAVA-20261012-S07`]. A hot-cereal product may contain or be made from such ingredients, but that does not make the dry cereal identity equivalent to each milling product. |
| `Cream of Wheat®` and manufacturer product names | **Use only as source evidence.** | Manufacturer pages use the registered product styling and offer several products. Do not add the brand, preparation-time variant, product formula, package, or fortification as an alias or general catalog property. |
| Instant, flavored, multigrain, or prepared cereal | **Exclude.** | The recommendation covers the plain dry hot-cereal product. It does not create a form matrix for original, instant, flavored, or mixed-grain products and does not identify a cooked bowl or recipe dish. |
| `cream of rice hot cereal / crème de riz`, rice farina, congee | **Keep separate.** | The existing rice identities describe different grain products or prepared food. The existing cream-of-rice review does not imply a wheat alias or shared form. |
| Cooked dishes also called *crème de blé* | **Do not link or merge.** | The reused RICARDO Québec article calls the boxed hot cereal *crème de blé* and separately reports a cooked wheat-and-turkey Iranian dish, *halyme*, also described with those words. The ingredient reference remains scoped to the dry grocery cereal; the wording is not a cooked-dish identity or recipe link. |

## Current-package and ownership audit

The snapshot was read from the live split seed package and ledger on 2026-10-12. Search-key checks used the repository's `normalize_search_key` behavior (case folding, accent and ligature folding, then punctuation normalization).

| Artifact | Current state at review |
|---|---|
| Ingredient references | 1,244; SHA-256 `5290188e986484d117873083b9b70ce9482adc494c70d78510a4f83e9a92df0b` |
| Ingredient forms | 93; SHA-256 `de4c25d0fd3c20e6f0c2bc4d1695d031b31df9820174ab57ac44073818ff2400` |
| Legacy import candidates | 66; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,549 records, 5,369 source entries, 4,409 distinct source IDs; SHA-256 `ff256ccbf3daaa7acf6eaf47e7057ff446c8e0e24b532129f65aa9ded4553157` |
| Recipe manifest / corpus | 114 listed files and 1,123 ingredient rows; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; ordered-corpus fingerprint `0387806ac8990880968c0da7344185b9c8f452449ca13d2a0b83ab30fdfbdc3b` |

The audit found no exact normalized owner in active reference names or aliases, forms, legacy candidates, or ledger record IDs for `cream of wheat hot cereal`, `cream of wheat cereal`, `cream of wheat`, `wheat hot cereal`, `wheat farina hot cereal`, `wheat farina`, `farina`, `crème de blé`, `céréales chaudes au blé`, `céréales chaudes au blé crémeux`, `semoule de blé`, or `semolina`. The proposed active and candidate IDs are absent from references, legacy candidates, and ledger records. No exact cream-of-wheat label or form exists among the 93 forms.

The text `cream of wheat` appears in one adjacent ledger record, `ingredient-ref-cream-of-rice-hot-cereal`, as product-comparison/source wording; it is not a wheat identity or candidate. Broad substring searches for `farina` and `semolina` can encounter the existing Italian wheat-flour aliases and durum/remilled-semolina references. Keep those broader terms out of this row's aliases.

Every manifest-listed recipe file was scanned across its text and ingredient rows for the candidate names and adjacent wheat-cereal terms. There were **0 matching recipe files and 0 matching ingredient rows**. No recipe link or recipe-text change is proposed.

Proposal-local source IDs `WP03-CREAM-WHEAT-HOT-CEREAL-20261012-S01` through `S04` were checked absent from the 4,409 live source IDs. The two contextual sources named by existing IDs below are reused, not re-registered.

## Measurements, forms, and substitutions

- Add no `IngredientForm`; the hot-cereal product identity already names the dry product. The available cooking directions describe individual products and do not establish a reusable dry/cooked form or cooking yield.
- Keep `defaultDensity` null, `unitMappings` empty, and add no measurement observation. A retailer's package size and Bob's Red Mill's product-specific serving declaration are not transferable to a general hot-cereal measure, density, or conversion.
- Add no package yield, mass-volume mapping, water ratio, or dry-to-cooked yield.
- Add no substitution. Manufacturer marketing and recipe suggestions provide no general amount equivalence to oats, semolina, rice cereal, or another grain product.
- Add no recipe-line link. The current 114-recipe corpus has no matching line.

## Source register

Pages were checked on 2026-10-12. Product-specific ingredients, package details, preparation directions, and serving values are not generalized.

| Source ID | Source and locator | Supported claim and limit |
|---|---|---|
| `WP03-CREAM-WHEAT-HOT-CEREAL-20261012-S01` | Cream of Wheat Canada, [Original 3 Minute](https://creamofwheat.ca/product/original-3-minute/), product description and ingredients. | Manufacturer calls this a ground-wheat hot cereal and lists wheat farina, defatted wheat germ, disodium phosphate, and ferric orthophosphate. Supports the English product class and one plain product formulation, not a generic ingredient formula or universal process. |
| `WP03-CREAM-WHEAT-HOT-CEREAL-20261012-S02` | Cream of Wheat Canada, [Originale 3 minutes](https://creamofwheat.ca/fr_ca/product/original-3-minute/), French description and ingredients. | Manufacturer uses `céréales chaudes Cream of Wheat` and describes ground wheat; its French ingredient panel names wheat flour and defatted wheat germ. Supports French-language Canadian product context, not the independent Québec display by itself. |
| `WP03-CREAM-WHEAT-HOT-CEREAL-20261012-S03` | Metro Québec, [Crème de blé, céréales chaudes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/cereales-chaudes/p/072400011597), French search-index title and current product page. | The indexed French listing gives `Crème de blé` under `Céréales chaudes`; direct access on 2026-10-12 redirects to Metro's English `Cream of Wheat Hot Cereal` page, whose ingredients list wheat farina and defatted wheat germ. Use it as Québec retail/product-class context, not as independent live French-page confirmation or a universal formula. |
| `WP03-CREAM-WHEAT-HOT-CEREAL-20261012-S04` | Bob's Red Mill Canada, [Céréales chaudes au blé crémeux](https://www.bobsredmill.ca/produit/cereales-chaudes-au-ble-cremeux), product description and ingredients. | Canadian French manufacturer page calls this hot wheat cereal and says it is also known as `semoule de blé` and `crème de blé`; describes one finely granulated durum-wheat product. Supports local product wording and shows why the milling term is not a safe global alias. Its serving value and composition are product-specific. |
| Existing `WP03-CORCEREAL-20261012-S04` | RICARDO, [Des céréales chaudes au petit déjeuner](https://www.ricardocuisine.com/chroniques/a-votre-sante/39-des-cereales-chaudes-au-petit-dejeuner), sections “Le riz” and “La crème de blé”. | Québec culinary source uses `crème de blé` for a grocery hot cereal, distinguishes cream of rice and congee, and also describes a cooked dish with the same words. Reused from the cream-of-rice ledger entry; supports local wording and the dish boundary, not a product specification or measure. |
| Existing `WP03-IDLI-RAVA-20261012-S07` | OQLF, [GDT: semoule de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432749/semoule-de-ble-tendre). | Existing ledger source for the held idli-rava review maps the wheat-milling term to `farina` / `spring wheat semolina`. Reuse it to keep the hot-cereal product separate from milling identities; it does not establish the display `crème de blé`. |

## Recommendation and remaining work

**Accept `ingredient-ref-cream-of-wheat-hot-cereal` as one identity-only `GRAIN_AND_CEREAL` reference with the displays `cream of wheat hot cereal / crème de blé`.** The English product class is source-attested and the Québec French display appears in Canadian French product wording and Québec culinary usage. Keep both alias arrays empty, preserve the distinction from farina/semolina milling products and cooked dishes, and add no numeric or substitution behavior.

This proposal does not close Section F. Continue the open regional and preprocessed-grain checklist, independent Québec terminology review, and dry/cooked form decisions only where recipe or measurement evidence warrants them. Do not reopen recent Section F reviews as part of this item.

# WP03 Section F: baby rice cereal identity review (2026-10-13)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal; not integrated.
- **Scope:** One Canadian packaged infant cereal product class, sold dry and based on rice, reviewed as a product identity rather than as plain rice flour or adult breakfast cereal.
- **Recommendation:** Add identity-only `GRAIN_AND_CEREAL` reference **`baby rice cereal / céréales de riz pour bébés`**. Add no aliases, forms, measurements, density, mappings, recipe links, conversions, yields, or substitutions.
- **Checklist location:** The live plan leaves [“Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” open](../../RecipeBook-global-ingredient-catalog-plan.txt#L2681).
- **Prior-review boundary:** The integrated crispy-rice-cereal review explicitly keeps infant rice cereal out of that row's aliases. The cream-of-rice hot-cereal review likewise names infant cereal as a separate excluded neighbor. Neither review establishes an infant-cereal identity, its bilingual display, or its own picker behavior. This proposal addresses that excluded product class without reopening either decision.

## Package snapshot at proposal review

Counts and digests describe the workspace at review time, before any integration. File digests are SHA-256 over exact bytes. The recipe-corpus digest hashes each manifest-relative path, NUL byte, exact recipe bytes, and trailing NUL byte in manifest order.

| Artifact | Current count/state | SHA-256 or corpus digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,385 references | `958ace3a9625b653a39c7666233c07bea2d476de26ccd66ed88ceed0f83ad5c0` |
| `ingredient-forms.v1.json` | 100 forms | `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63` |
| `legacy-import-identities.v1.json` | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `research-ledger.v1.json` | 1,718 records; 8 unit conversions | `25ec1a32f278de43cf6c84e8ad20359b485e569ab0132c343de2805b304de421` |
| `manifest.v1.json` | 114 listed recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,806 recipe-file bytes | `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552` |

## Product boundary and recommendation

Canadian manufacturer pages identify a packaged rice-based cereal for babies and provide matching English and French wording. The French page uses **`céréales de riz pour bébés`** in both the product title and description; Metro's Québec grocery listing uses the same term for its Gerber Step 1 listing. The Institut national de santé publique du Québec describes iron-fortified baby cereals as a distinct complementary-food category and notes that product formulations and preparation differ: some cereals contain milk powder and take water, while others can be mixed with breast milk or infant formula [S01–S04]. These sources support a separate product identity and a directly attested Québec French display. They do not establish one universal ingredient formula or preparation method.

One current Nestlé GERBER SKU lists rice flour, milk powder, oils, probiotic culture, vitamins, and iron; it is therefore not represented as pure rice flour or as a single-ingredient rice product. Its page gives product-specific package, portion, and preparation details. Another listed organic rice-cereal SKU says to add milk. Treat those details as evidence about those packages only; do not infer catalog-wide measures, yield, or form conversions. The older CFIA survey independently recognizes infant cereal labelled as rice within the Canadian food market, but is used only for product-class context, not current formulation or market prevalence [S05].

| Proposed field | Recommendation |
| --- | --- |
| ID | `ingredient-ref-baby-rice-cereal` |
| English display | `baby rice cereal` |
| Québec French display | `céréales de riz pour bébés` |
| Category | `GRAIN_AND_CEREAL` |
| English and French aliases | None |
| Scope | Packaged infant cereal sold dry before reconstitution and marketed as rice-based. Product formulas may include milk, oils, cultures, vitamins, minerals, and other ingredients in addition to rice. |
| Forms and numeric data | None. No ingredient forms, density, unit mappings, reusable serving measure, mixing ratio, dry-to-prepared conversion, or yield. |
| Recipe links and substitutions | None. |

Keep this identity distinct from `rice flour / farine de riz`, plain `rice / riz`, adult `cream of rice hot cereal / crème de riz`, and `crispy rice cereal / céréales de riz croustillantes`. Exclude multi-grain or fruit-added baby cereals, infant rice-and-fruit blends, prepared rice porridge/congee, and any specific brand or formulation from this base identity. The proposed French display follows the current Canadian manufacturer and Québec retailer wording; it is not claimed as an OQLF-preferred term.

### Product-specific numeric and form limits

The current GERBER English page gives 5 tablespoons (28 g) and approximately 90 mL water for one listed product. The French page identifies its 227 g package and the same product's 5 c. à soupe (28 g) and 90 mL instructions. Its other listed organic rice-cereal SKU says “add milk.” These are package-specific examples, not shared catalog values. They do not support a default spoon measure, grams-per-spoon density, universal addition-liquid choice, hydration ratio, reconstituted form, yield, or substitution. Do not transfer any such value to the proposed reference or to a recipe.

## Ownership, picker, and recipe audit

The audit checked normalized candidate phrases and the proposed key across active reference names and aliases, form labels and match terms, all legacy import candidates, serialized research-ledger records, and every manifest-listed recipe and ingredient row. It also reviewed the current search implementation in `IngredientSearch.kt`, which matches complete normalized word phrases in reference names, aliases, and attached form terms before falling back to partial matching.

| Search surface | Result |
| --- | --- |
| Active reference names and aliases | No exact owner for `baby rice cereal`, `infant rice cereal`, `rice cereal for babies`, or `céréales de riz pour bébés`. `ingredient-ref-rice-cereal` owns only `crispy rice cereal / céréales de riz croustillantes` for this phrase family. The proposed ID is absent. |
| Ingredient forms | No form label or match term for the candidate; no forms are attached to the existing crispy-cereal row. |
| Legacy import candidates | No exact owner among 63 candidates. `candidate-baby-rice-cereal` is unallocated. |
| Research ledger | No dedicated record or candidate ID. Its only `infant rice cereal` mention is the existing crispy-cereal decision that excludes infant cereal from that row's aliases. The proposed reference ID and proposal-local source IDs below are unallocated. |
| Current picker: `baby rice cereal` / `céréales de riz pour bébés` | No current result. With the proposed display names, each qualified phrase resolves to the new identity. |
| Current picker: `rice cereal` / `céréales de riz` | Each currently returns only `ingredient-ref-rice-cereal`. With the proposed identity, each broad phrase returns both the crispy product and the infant product. Do not add the generic phrases as aliases to either row. |
| Recipe corpus | No baby- or infant-specific match across 114 files and 1,123 ingredient rows. The sole broad `rice cereal` recipe match is recipe 040, whose ingredient is `6 cups crispy rice cereal` and remains linked to the crispy row. No recipe link or quantity change is justified. |

The two-result broad-query effect is intentional: the names describe different products, and a user searching the unqualified phrase would see both rather than have the infant product hidden under the crispy-cereal identity. The specific names distinguish them. There is no current recipe demand, so this identity adds no recipe-specific behavior or measurement data.

## Remaining Section F scope

This proposal covers only the infant rice-cereal identity omitted from the adjacent crispy-cereal and cream-of-rice decisions. It does not repeat recent rice-germ, sprouted-triticale, or bran reviews; nor does it reopen already reviewed or held cereal candidates elsewhere in Section F. The broader regional cereal-mix and preprocessed-grain checklist remains open for separate evidence-backed reviews.

## Proposal-local source register

These IDs are local to this proposal and were checked absent from the shared ledger before drafting. URLs were also checked absent from its source register. Sources were reviewed on 2026-10-13.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-BABYRICE-20261013-S01` | Nestlé FamilyNes Canada, [GERBER infant rice cereal](https://www.nestlefamilynes.ca/gerber-rice-cereal), product title and details. | Current English product page calls it infant/baby rice cereal, describes a rice-grain-based baby cereal sold for mixing with water, and provides one package's ingredients, 5 tbsp (28 g) serving, and approximate 90 mL preparation instruction. Composition and numbers are SKU-specific; the page says product information can change. |
| `WP03-BABYRICE-20261013-S02` | Nestlé FamilyNes Canada (French), [Céréales de riz pour bébés GERBER](https://www.nestlefamilynes.ca/fr/cereales-bebes-cereales-riz), product title, description, ingredients, and preparation. | Directly attests the French display `céréales de riz pour bébés`; gives a 227 g Step 1 package, 5 c. à soupe (28 g), 90 mL water, and a listed formula containing more than rice flour. Also links an organic rice-cereal variant prepared with milk. These details do not generalize across products. |
| `WP03-BABYRICE-20261013-S03` | Metro Québec, [Céréales de riz pour bébés, Étape 1](https://www.metro.ca/epicerie-en-ligne/allees/bebe/nourriture-et-preparations/nourriture-seche/cereales-de-riz-pour-bebes/p/065000138085), product title and listing snippet. | Local retail listing independently uses the exact French wording and identifies a 227 g infant cereal SKU. The page returned HTTP 403 when opened during review, so the listing snippet supports naming and product context only; no current stock or price claim is made. |
| `WP03-BABYRICE-20261013-S04` | Institut national de santé publique du Québec, [Produits céréaliers — Mieux vivre avec notre enfant](https://www.inspq.qc.ca/mieux-vivre/enfant/alimentation/aliments/produits-cerealiers), updated 2026-02-17, lines 32–46. | Québec public-health source treats iron-fortified baby cereals as an early-food category, distinguishes single-grain from later mixed or added-food products, and notes that some products contain milk powder and are prepared with water. Supports local food-use and the need to avoid a universal formula or preparation rule; this proposal does not restate its feeding guidance. |
| `WP03-BABYRICE-20261013-S05` | Canadian Food Inspection Agency, [Food Safety Action Plan targeted survey: mycotoxins in selected foods](https://publications.gc.ca/collections/collection_2024/acia-cfia/A104-525-2011-eng.pdf), pp. 11 and 16, “Infant Cereals.” | The 2011 survey treats infant cereals as a separate Canadian grain-product category and reports rice-labelled examples among sampled cereals. Its age and labelling observations are historical and do not establish current products, formulations, nutrition, or prevalence. |

## Review disposition

**Accepted and integrated as identity-only `baby rice cereal / céréales de riz pour bébés`.** The Canadian manufacturer supplies direct bilingual product terminology, Québec public-health material confirms this is a distinct local food-use category, and a Québec retail listing corroborates the French display. The active crispy-cereal row has no ownership claim on the infant product, and the exact query now has its own result. SKU-specific measures remain excluded; broad aliases, forms, reusable measures, recipe links, conversions, yields, and substitutions remain empty. The shared research ledger records the identity and the unsupported reusable-measure/substitution findings. See the [integration record](../batches/wp03-section-f-baby-rice-cereal-identity-integration-20261013/README.md).

No tests were run because this change only adds database JSON data, per `AGENTS.md`.

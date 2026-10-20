# WP03 Section F R77 — Mighty Tasty hot cereal identity review

## Review record

- **Reviewed:** 2026-10-13; source pages checked on this date.
- **Status:** proposal only. No shared catalog, ledger, recipe, checklist, roadmap, generated, integration, or application file was changed.
- **Chosen open checklist item:** “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” ([live Section F plan, line 2743](../../RecipeBook-global-ingredient-catalog-plan.txt#L2743)).
- **Scope:** Bob’s Red Mill Mighty Tasty Hot Cereal, sold as a dry, freshly milled four-grain hot-cereal product. This does not create identities for its component grains, the cooked porridge, other Bob’s Red Mill blends, or generic hot cereal.
- **Recommendation:** integrate one identity-only `GRAIN_AND_CEREAL` reference. Use the product’s English manufacturer title and its Canadian French product wording; add no aliases, forms, numeric mappings, recipe links, conversions, yields, or substitutions.

## Product identity and boundaries

Bob’s Red Mill’s current English product page calls this product **Mighty Tasty Hot Cereal** and lists whole-grain brown rice, corn, whole-grain sorghum, and whole-grain buckwheat. The Canadian French page calls it **Céréales chaudes savoureuses** and lists the corresponding four grains. A French Canadian retail title also retains the product name *Mighty Tasty*. These sources support one named dry cereal blend, not a new identity for any component or a general formula for other multigrain cereals.

The proposed French display retains the manufacturer’s current Canadian French product wording and adds the trademark in parentheses to keep the brand-specific identity clear. This is descriptive Canadian French product naming, not an OQLF-approved term. OQLF’s general *céréales* entry supports the category word but does not name this product.

| Neighbor | Keep separate because |
|---|---|
| Brown rice, corn, grain sorghum, and buckwheat references | They are the product’s components, not aliases or ingredient forms of the branded mixture. |
| Cream of rice, cream of wheat, cream of barley, and creamy buckwheat hot cereals | They are separate grain-specific cereal products. Similar hot-breakfast use does not establish a shared identity or substitution. |
| Original Red River cereal, Red River 7 Grain Hot Cereal, Sunny Boy cereal, and Rogers Ancient Grain Blend Porridge Oats | Each is a separately named blend with its own product scope. The recent [R76 Rogers review](./wp03-section-f-rogers-ancient-grain-porridge-blend-identity-review-r76-20261013.md) does not cover this product. |
| Prepared porridge | Cooking instructions describe one use of the dry blend; they do not make the cooked dish the catalog identity. |

## Exact future reference delta

If accepted, add exactly one active reference row:

    {
      "id": "ingredient-ref-mighty-tasty-hot-cereal",
      "nameFr": "Céréales chaudes savoureuses (Mighty Tasty)",
      "nameEn": "Mighty Tasty hot cereal",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-13T00:00:00Z",
      "category": "GRAIN_AND_CEREAL"
    }

Do not add a form or recipe-line link. If the reference is integrated, attach its evidence to a new ledger record with record ID `ingredient-ref-mighty-tasty-hot-cereal`, identity state `verified`, measurement state `researched_no_supported_value`, and substitution state `researched_no_supported_substitute`. Preserve product-specific serving and preparation observations only as source-qualified evidence. Do not copy the product formula into component aliases or create runtime component decomposition.

## Ownership, archive, and picker audit

The read-only snapshot for this review was:

| Artifact | Snapshot | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,401 | `0f02864ed658121df8683f29565515a305ed3700701f08fa3d9de0f59e091631` |
| Ingredient forms | 104 | `4190dc88d9dc7914b3ef5a497d9c4f50def881ade9c0348d37faec3f02a63798` |
| Legacy import candidates | 63 | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Research ledger | 1,739 | `a391effe0beb0bb0c188ffdfc0d2a0bdb914ade3107208f28d845106c37da336` |
| Recipe manifest | 114 paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Normalized ownership checks found no exact active reference, form, legacy candidate, or ledger record for `Mighty Tasty`, `Mighty Tasty hot cereal`, `Céréales chaudes savoureuses`, the proposed reference ID, or the R77 source-ID prefix. A repository-wide search of the current plan, proposals, and batch archive found no earlier focused Mighty Tasty identity decision. This is separate from the accepted Rogers and Red River blend rows.

The closest active owners are the separate hot-cereal references listed above. The product components remain owned by `ingredient-ref-brown-rice`, `ingredient-ref-corn-kernels`, `ingredient-ref-grain-sorghum`, and the buckwheat grain and product references. None receives an alias or form from this proposal.

Picker results were statically projected from the current bilingual reference/form data using the phrase-first matching rules in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L28):

| Query | Current result | With proposed row | Boundary |
|---|---|---|---|
| `Mighty Tasty` | None | Mighty Tasty hot cereal | Product-specific lookup. |
| `Mighty Tasty hot cereal` | None | Mighty Tasty hot cereal | Exact product-name lookup. |
| `céréales chaudes savoureuses` | None | Mighty Tasty hot cereal | Exact French product-display lookup after accent folding. |
| `hot cereal` | 6 current hot-cereal rows | Same 6 plus this row | Expected broad category query; the row is not given a generic hot-cereal alias. |
| `céréales chaudes` | 3 current rows | Same 3 plus this row | Expected broad French category query; no general French alias is added. |
| `sorghum` / `sorgho` | 5 current sorghum rows | Unchanged | Component terms are not aliases, so the blend does not appear as a sorghum species or product. |
| `brown rice` / `riz brun` | 5 current rows | Unchanged | Component terms remain owned by rice references. |
| `buckwheat` / `sarrasin` | 9 / 10 current rows | Unchanged | Component terms remain owned by buckwheat references. |
| `gluten free` / `sans gluten` | Existing gluten-free pasta row | Unchanged | The manufacturer’s gluten-free claim is not added as a searchable alias or filter. |

## Recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned in serialized recipe text and ingredient-row fields for the candidate name, French title variants, and proposed ID. **Result: 0 matching files, 0 matching rows, and 0 recipe links.** No bundled recipe can be linked to this identity.

External manufacturer recipes demonstrate that the product is used as a recipe ingredient, but their quantities stay source-specific. Bob’s Red Mill’s Mighty Tasty Muffins page calls for 2 tablespoons. Its preparation page gives product instructions using 1 cup cereal with 3¼ cups water for a four-serving stovetop preparation; it also gives a 1-cup-to-3-cup multi-cooker method and a ¼-cup-to-¾-cup single-serving microwave method. These are different product-specific preparation methods, not reusable conversion or yield rules.

## Identity, forms, and numeric evidence limits

| Dimension | Finding | Proposal treatment |
|---|---|---|
| **Identity** | Current manufacturer pages identify one dry branded four-grain product. | Add the single product-specific identity row above. Do not add a generic multi-grain cereal identity. |
| **Forms** | The blend is sold dry and used dry in the external muffin recipe. Cooking makes a prepared dish. | Add no ingredient form; neither the product listing nor one recipe requires a reusable dry/cooked conversion graph. |
| **Measurements** | Current manufacturer English and French pages state a serving of ¼ cup (48 g). A secondary archived label page marks an older package and shows ¼ cup (40 g). | Keep both as dated, source-specific observations only. Do not set a default density or unit mapping. The older record is not evidence for the current package. |
| **Conversion** | The label serving pairs one product-specific volume and mass; the source does not specify a cup convention or a measured bulk-density method. | No conversion or general mass-volume mapping. |
| **Yield** | The manufacturer’s cooking directions vary by method and give servings for those instructions. | No dry-to-cooked yield; do not generalize the method ratios or serving output. |
| **Substitution** | No reviewed source establishes a transferable replacement for another grain, hot cereal, or cereal blend. | Add no global or contextual substitution rule. |

## Source register

Source IDs below are local to this proposal. They were checked against the current ledger before drafting; the proposed R77 prefix is unused.

| Source ID | Direct source | Supports and limits |
|---|---|---|
| `WP03-MIGHTYTASTY-R77-20261013-S01` | Bob’s Red Mill, [Mighty Tasty Hot Cereal](https://www.bobsredmill.com/product/gf-mighty-tasty-hot-cereal), current English product page. | Names the product and lists whole-grain brown rice, corn, whole-grain sorghum, and whole-grain buckwheat. Reports ¼ cup (48 g) as the current serving. Its product description and serving do not define a general cereal blend, household conversion, or substitution. |
| `WP03-MIGHTYTASTY-R77-20261013-S02` | Bob’s Red Mill Canada, [Céréales chaudes savoureuses](https://www.bobsredmill.ca/produit/gf-mighty-tasty-hot-cereal), current French-language product page. | Supplies the manufacturer’s Canadian French title and matching four-grain ingredient list; reports the same ¼ cup (48 g) serving. This is product wording, not an OQLF-approved name. |
| `WP03-MIGHTYTASTY-R77-20261013-S03` | Bob’s Red Mill, [Basic Preparation Instructions for Gluten Free Mighty Tasty Hot Cereal](https://www.bobsredmill.com/recipes/how-to-make/basic-preparation-instructions-for-gluten-free-mighty-tasty-hot-cereal). | Says the instructions are printed on the label and gives separate stovetop, multi-cooker, and microwave methods, amounts, and serving counts. These are product-specific instructions, not a transferable conversion or yield. |
| `WP03-MIGHTYTASTY-R77-20261013-S04` | Bob’s Red Mill, [Mighty Tasty Muffins](https://www.bobsredmill.com/recipes/how-to-make/mighty-tasty-muffins). | Calls for 2 tablespoons of the cereal in one muffin formulation. It does not establish a reusable measure, recipe-library link, or substitution rule. |
| `WP03-MIGHTYTASTY-R77-20261013-S05` | Bob’s Red Mill, [Canadian Product List 2025, pp. 28–29](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-Product-List-2025/28-29/). | Lists “Cereal, Mighty Tasty Hot” / “Céréales chaudes franchement délicieuses,” product number P101122 and the four ingredients. Its French translation differs from the current French product page; the proposal keeps the current page title and does not treat the variation as an alias. Search-indexed text was available, but direct PDF-page retrieval returned a cache miss during review. |
| `WP03-MIGHTYTASTY-R77-20261013-S06` | Well.ca, [French product listing](https://well.ca/fr/produits/bobs-red-mill-gluten-free-mighty_276422.html). | Gives the French-language retail title “Les céréales chaudes sans gluten Mighty Tasty de Bob’s Red Mill” and the same four ingredients. It supports Canadian French product wording, not an OQLF ruling or a Québec-only availability claim. Direct retrieval returned 403; indexed page text was reviewed. |
| `WP03-MIGHTYTASTY-R77-20261013-S07` | Office québécois de la langue française, [GDT: céréales](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26571637/cereales). | Supports the general Québec French category word *céréales* and describes cereal foods in whole, ground, cracked, or flaked forms. It does not name this branded hot cereal. |
| `WP03-MIGHTYTASTY-R77-20261013-S08` | Adonis, [Bob’s Red Mill Gluten Free Mighty Tasty Hot Cereal](https://livraison.groupeadonis.ca/store/adonis/products/24724785-bob-s-red-mill-gluten-free-mighty-tasty-hot-cereal-680-g). | Current retailer listing identifies the 680 g product. It supports a Canadian retail SKU, not a French display name or package measurement. |
| `WP03-MIGHTYTASTY-R77-20261013-S09` | Environmental Working Group, [Food Scores label record](https://www.ewg.org/foodscores/products/039978111166-BobsRedMillMightyTastyHotCerealMightyTasty/). | Secondary archived package data reports ¼ cup (40 g) and marks the product record older. Used only to flag a historical numeric discrepancy; it is not used to select a current measurement. |

## Static review record

- Re-read current `AGENTS.md`, the open Section F checklist line, current reference/form/legacy/ledger data, the recipe manifest, and the proposal/batch archive. The project rule says no testing is needed when a change only adds database JSON data; no tests or emulator were run for this proposal-only review.
- Checked exact candidate names, proposed reference ID, source-ID prefix, normalized ownership, and nearby cereal/component rows against active references, forms, legacy candidates, ledger, and archive.
- Projected picker queries from current search implementation and current active data; included expected broad hot-cereal results and component-term boundaries.
- Scanned all 114 manifest recipe files and all 1,123 ingredient rows; found no candidate demand or recipe link.
- Checked the manufacturer’s English and Canadian French product pages, preparation instructions, recipe, Canadian product list, French retailer wording, Québec terminology entry, Québec-chain product listing, and older label evidence. Recorded retrieval limits and the product-list translation variation above.
- No external data, shared files, or application files were edited. Final static checks after saving: UTF-8 decode without BOM, final newline, no trailing spaces/tabs, no mojibake markers, valid local Markdown targets, and clean proposal-scoped whitespace check.

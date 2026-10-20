# WP03 Section F R76: Rogers Ancient Grain Blend Porridge Oats

## Review record

- **Reviewed:** 2026-10-13.
- **Recommendation:** add one identity-only, product-specific `GRAIN_AND_CEREAL` reference for Rogers Ancient Grain Blend Porridge Oats. The French display uses the Canadian French retail title. Add no aliases, forms, active measures, density, unit mappings, recipe links, conversions, cooking yields, or substitutions.
- **Open checklist:** the plan continues to call for regional cereal mixes and preprocessed grains ([Section F, line 2736](../../RecipeBook-global-ingredient-catalog-plan.txt#L2736)). This review covers one current Canadian cereal blend and does not close the checklist.
- **Scope:** Rogers's dry, uncooked nine-component cereal blend, as named by its manufacturer. This is not a generic “ancient grains” identity, a generic porridge identity, or a synonym for multigrain flakes.
- **Proposal-only boundary:** no reference, form, ledger record, recipe, checklist, roadmap, generated file, or application file was changed. The IDs below are proposal-local and are not yet registered in the research ledger.

## Product identity and Québec French wording

The current Rogers Foods product page names **Rogers Ancient Grain Blend Porridge Oats**, describes a dry blend of large-flake oats, rye flakes, barley flakes, spelt flakes, Kamut flakes, oat bran, millet, flaxseed, and quinoa flakes, and says the product is intended to be cooked before eating [S01]. Rogers's September 2025 newsletter also shows the product and a bilingual package ingredient panel with the same nine components [S02]. Together these support one source-bounded, branded cereal identity. They do not establish a universal formula for “ancient grain” blends.

The Canadian French Walmart listing titles the product **Avoine porridge et grains anciens Rogers** [S03]. A Québec recipe uses **grain anciens Rogers** as an ingredient phrase [S04]. These are direct French-market and Québec recipe attestations, not an OQLF ruling. Use the retailer's exact product title for the proposed French display and keep the brand qualifier. The OQLF defines *gruau*/*porridge* as the prepared cooked dish and says this sense can extend to dishes made from other cereals; that does not name the dry blend [S07]. Do not use *gruau* as a dry-product synonym.

Rogers's January 2023 FAQ lists the ancient-grain blend without rye flakes, while its current product page and 2025 newsletter list rye flakes [S01, S02, S08]. Treat the later product-page and package evidence as the current component description. Do not encode a fixed composition or component ratios in the ingredient reference; the older FAQ demonstrates that component lists can differ across manufacturer materials.

## Product boundaries

Keep this item separate from:

- `ingredient-ref-multigrain-flakes` (`multigrain flakes / flocons multigrains`, English alias `multi-grain flakes`), which covers loose blends of cereal flakes. The Rogers blend also contains oat bran, whole millet, and flaxseed, and is sold as a named hot-cereal/baking blend.
- The component references `ingredient-ref-rolled-oats`, `ingredient-ref-rye-flakes`, `ingredient-ref-barley-flakes`, `ingredient-ref-spelt-flakes`, `ingredient-ref-khorasan-flakes`, `ingredient-ref-oat-bran`, `ingredient-ref-millet-flakes`, and `ingredient-ref-quinoa-flakes`. Their names remain separate; no recipe-line decomposition or inferred ingredient ratios are proposed.
- Rogers's Healthy Grain Porridge Oats and Steel Cut Oat Blend Porridge Oats, as well as Red River cereal, Red River 7-grain cereal, and Sunny Boy cereal. Shared brand, “porridge,” or breakfast use does not make the products equivalent.
- The existing Red River 7-grain hot cereal and generic multigrain-flakes references. The current Section F decisions remain unchanged ([multigrain flakes integration](../batches/wp03-section-f-multigrain-flakes-identity-integration-20261012/README.md), [Red River cereal review](./wp03-section-f-next-gap-review-20261012-round3.md)).

The proposed identity is the named dry product only. It does not represent prepared porridge or a fixed generic “ancient-grain” mixture. `Kamut` is retained only as a component name in source evidence; this proposal does not add it as an alias to Khorasan flakes or another grain reference.

## Current ownership and archive audit

Read-only counts from the current split package on 2026-10-13: 1,399 ingredient references, 104 forms, 63 legacy-import candidates, 1,737 research-ledger records, and 114 recipes listed by the live package manifest.

| Candidate phrase or field | Current owner / state |
|---|---|
| `Rogers Ancient Grain Blend Porridge Oats`; `Avoine porridge et grains anciens Rogers`; `grains anciens Rogers`; proposed ID `ingredient-ref-rogers-ancient-grain-blend-porridge-oats` | No exact active reference, form, legacy candidate, or ledger record ID. No prior focused proposal or batch review was found for this Rogers blend. |
| `ancient grain` / `ancient grains` | No active display or alias owner. The ledger has an incidental “Bon Matin Ancient Grains bread” source title under the distinct rye-flakes record (`WP03-RYE-FLAKES-20261011-S02`); that composite bread does not own or identify the Rogers product. |
| `ingredient-ref-multigrain-flakes` | Existing owner: `multigrain flakes / flocons multigrains`; English alias `multi-grain flakes`; no French alias. Keep it distinct and unchanged. |
| Individual cereal components | Each has its own active identity listed above; no current identity owns the full Rogers blend. |
| Ingredient forms | No form, label, or match term refers to the Rogers blend, ancient grains, or porridge oats. No form should be created for the cooked dish. |
| Ledger source IDs | `WP03-R76-20261013-S01` through `S08` were checked absent; they are local to this proposal. |

The audit checked normalized exact names and aliases in the active reference, form, and legacy files, plus the ledger, proposals, batches, current Section F plan, and bundle. Broad component terms such as `oats`, `avoine`, `grain`, and `céréales` intentionally have multiple unrelated owners and are not proposed as aliases.

## Picker boundary

`IngredientSearch.kt` normalizes case, accents, and punctuation, returns complete word-phrase matches first, then uses substring fallback. The following is a static projection of that source behavior, not a live picker or emulator test. It assumes the single proposed display pair below and empty alias arrays.

| Query | Current result | With proposed row |
|---|---|---|
| `Rogers Ancient Grain Blend Porridge Oats` | none | `ingredient-ref-rogers-ancient-grain-blend-porridge-oats` |
| `Avoine porridge et grains anciens Rogers` | none | `ingredient-ref-rogers-ancient-grain-blend-porridge-oats` |
| `ancient grain`; `grains anciens` | none | Rogers blend |
| `ancient grains` | none | none; do not add this broad plural alias |
| `porridge` | none | Rogers blend; the full result label retains the brand and blend qualifier |
| `oats` | 6 references | 7 references, including Rogers blend |
| `avoine` | 10 references | 11 references, including Rogers blend |
| `grain` | 10 references | 11 references, including Rogers blend |
| `multigrain flakes`; `flocons multigrains` | `ingredient-ref-multigrain-flakes` | unchanged; the Rogers row is not an alias or form of multigrain flakes |

Do not add `ancient grains`, `porridge`, `oats`, or component names as aliases. The exact display pair is sufficient for product search; broader aliases would make this one brand-specific mix stand for a wider cereal class.

## Bundled and external recipe demand

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for the exact English/French product names, Rogers blend variants, and proposed stable ID. The scan found **0 matching files and 0 matching ingredient rows**. No recipe link or relinking is proposed.

There is source-specific external recipe use:

- Rogers's own Oatmeal & Chickpea Cookies recipe calls for **3 cups** of the exact ancient-grain blend [S06]. This is one manufacturer's recipe amount, not a general measure or baking substitution.
- A Québec bread recipe calls for **1/2 cup “grain anciens Rogers” or flakes of rye, barley, spelt, millet, etc.** [S04]. This supports Québec culinary use and phrasing, but its listed alternatives are not evidence of a global or contextual substitution rule.

These external examples support the product's culinary relevance. They do not create bundled demand, a recipe-line association, or a transferable replacement rule.

## Measurements, forms, conversion, yield, and substitution

| Topic | Evidence and limit | Proposed active data |
|---|---|---|
| Identity | Current maker page and 2025 package image support a dry, uncooked mixed-grain cereal product intended to be cooked before eating [S01, S02]. | One identity-only reference. Do not create a prepared-porridge reference or a component formula. |
| Forms | Cooking directions describe preparation of this product, not a reusable ingredient form boundary. The dry mix is the reference identity; a cooked bowl is a prepared dish. | No `IngredientForm`. |
| Measurement | A current Canadian retail listing reports `1/4 cup (40 g)` as the nutrition-label serving for its 750 g SKU [S05]. It is one product's declared serving, not a general measure for other cereal blends. | Keep the value as source-specific evidence only. No active measure. |
| Conversion | The serving pair does not define a bulk density, fill method, or general cup-to-mass conversion. | `defaultDensity: null`; `unitMappings: []`. |
| Cooking direction and yield | Rogers directs `1 cup (250 mL)` blend with `2 cups (500 mL)` water and reports a 3-cup prepared yield; its microwave direction uses `1/3 cup (80 mL)` blend with `2/3 cup (160 mL)` water [S01]. These are product-specific instructions and method-dependent prepared amounts, not a general dry/cooked conversion. | No conversion, package-yield record, or active cooking-yield rule. Preserve the values only in the source record if later integrated. |
| Other recipe quantity | The Québec bread recipe's 1/2 cup and Rogers cookie recipe's 3 cups are recipe-specific amounts [S04, S06]. | No recipe links or reusable measure. |
| Substitution | The Québec bread recipe lists other flakes after “or,” but gives no comparative method, dose adjustment, or outcome; Rogers does not establish a general replacement for oats or other grains. | No global or contextual substitution, and no recipe-line substitution link. |

## Exact future integration delta

If accepted, add exactly one row to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-rogers-ancient-grain-blend-porridge-oats",
  "nameFr": "Avoine porridge et grains anciens Rogers",
  "nameEn": "Rogers ancient grain blend porridge oats",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

No change is proposed to `ingredient-forms.v1.json`, recipe JSON, `package-yields.v1.json`, unit conversions, global/contextual substitution JSON, generated code, or application code. A later integration should add one accepted identity record to `docs/catalog/research-ledger.v1.json`, with sources `S01`–`S08`; record the serving and cooking directions as source-scoped evidence only, with no reusable measurement observation, conversion, or substitution finding. No ledger or shared catalog file was changed for this proposal.

## Source register

Sources were checked on 2026-10-13. IDs below are proposal-local and have not been added to the shared ledger.

| Source ID | Source and locator | What it supports and its limit |
|---|---|---|
| `WP03-R76-20261013-S01` | Rogers Foods, [Rogers Ancient Grain Blend Porridge Oats](https://rogersfoods.com/shop/retail-products/porridge-oats-ancient-grains/), product description and cooking instructions. | Current manufacturer source identifies the dry blend, its nine listed components, intended cooked use, stovetop and microwave directions, and the product-specific 3-cup preparation yield. It gives no component ratios, universal cereal formula, or transferable ingredient conversion. |
| `WP03-R76-20261013-S02` | Rogers Foods, [September 2025 newsletter](https://rogersfoods.com/wp-content/uploads/2025/08/Rogers-Foods-Newsletter-Sept-2025.pdf), PDF p. 14, product image and English/French ingredient panel. | Manufacturer publication shows the 750 g product package and bilingual ingredient panel, including the nine components. It does not establish a Québec-preferred French product name or component ratios. |
| `WP03-R76-20261013-S03` | Walmart Canada (French), [Avoine porridge et grains anciens Rogers](https://www.walmart.ca/fr/ip/Avoine-porridge-et-grains-anciens-Rogers/6000197051964), listing title and ingredient section. | Search-indexed French retail listing provides this exact French product title and component wording. Direct page retrieval returned a cache miss during this review; this is retail title evidence, not an OQLF decision or verified Québec stock location. |
| `WP03-R76-20261013-S04` | Recettes du Québec, [Pain multigrain (sans robot boulanger)](https://www.recettes.qc.ca/recettes/recette/pain-multigrains-sans-robot-boulanger), ingredient list and method. | Québec recipe lists `1/2 tasse grain anciens Rogers` or other named cereal flakes in bread, then uses the phrase `les grains anciens`. Supports local recipe wording and one recipe amount; it does not establish the Rogers formula or transferable substitutions. |
| `WP03-R76-20261013-S05` | Loblaws (French), [Gros flocons avoine grains anciens, Rogers, 750 g](https://www.loblaws.ca/fr/gros-flocons-avoine-grains-anciens/p/20718427_EA), nutrition and ingredient sections. | Canadian French-language listing for SKU `20718427_EA` reports a `1/4 cup (40 g)` serving and the nine components. The page warns that its information can change and advises checking the package; its serving is SKU-specific. The observed listing location was Loblaws Baseline Road in Ottawa, not Québec. |
| `WP03-R76-20261013-S06` | Rogers Foods, [Oatmeal & Chickpea Cookies](https://rogersfoods.com/recipe/oatmeal-chickpea-cookies/), ingredient list and preparation. | Manufacturer recipe calls for 3 cups of `ROGERS PORRIDGE OATS ANCIENT GRAIN BLEND` and processes/cooks the mixture into cookies. This is one external recipe amount, not a standard measure or substitution ratio. |
| `WP03-R76-20261013-S07` | Office québécois de la langue française, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), definition and preferred terms. | Supports *gruau* as the Québec term for the cooked dish and notes that its sense can extend to dishes made from other cereals. It does not name the dry Rogers blend. |
| `WP03-R76-20261013-S08` | Rogers Foods, [What is the difference between the 3 flavours of ROGERS Porridge Oats?](https://rogersfoods.com/ufaq/what-is-the-difference-between-the-3-flavours-of-rogers-porridge-oats/), dated 2023-01-11. | Distinguishes the ancient-grain product from the Healthy Grain and Steel Cut Oat Blend products. Its ancient-grain component list omits rye flakes; use it as a historical product-family comparison, not as the current formula over the 2025 package and current product page. |

## Review checks

- Re-read the current `AGENTS.md`, exact live Section F checklist, reference/form/ledger files, relevant plant-grains checklist, and proposal/batch archive.
- Rechecked exact ownership in current active references, forms, legacy candidates, ledger IDs, and archived decisions; inspected current search source; statically projected the picker queries above.
- Scanned all manifest-listed recipes and ingredient rows for product names and ID.
- Verified source pages for product scope, Québec French usage, and numeric evidence limits. No tests or emulator checks were run: this is proposal-only research, and `AGENTS.md` says JSON-database-only additions require no testing.
- Final static checks after saving: UTF-8 without BOM, final newline, no trailing whitespace or tabs, valid local Markdown targets, and clean `git diff --check` for this proposal file.

# WP03 Section F — Cranberry Almond Crunch cereal identity review (R262, 2026-10-16)

## Review record

- **Status:** Integrated on 2026-10-16 as `ingredient-ref-cranberry-almond-crunch-cereal`; see the [integration README](../batches/wp03-section-f-cranberry-almond-crunch-cereal-integration-r262-20261016/README.md).
- **Scope:** One current Canadian ready-to-eat cereal product sold as `Cranberry Almond Crunch`. This review does not add a generic cereal or granola alias, and does not extend the Post family, Vector family, or any other cereal product family.
- **Checklist context:** Section F remains open for further grain and cereal coverage ([active checklist, line 528](../../RecipeBook-global-ingredient-catalog-plan.txt#L528)). The recent R251 Vector review covered that separate six-product family ([R251 proposal](wp03-section-f-vector-cereal-family-identity-review-r251-20261016.md)); R259 rechecked Québec terminology for the already integrated puffed-rice identity ([R259 proposal](wp03-section-f-next-gap-review-r259-20261016.md)). Neither allocates this product.
- **Archive separation:** The completed Sona Masoori review R255, the precooked-durum hold R247, the Vector family R251, and the puffed-rice terminology recheck R259 are separate decisions. No focused review or owner for `Cranberry Almond Crunch` was found in the active plan, roadmap, reference catalog, research ledger, or proposal and batch archive.
- **Recommendation:** **Add one identity-only cereal reference** as `Cranberry Almond Crunch cereal / céréales canneberges et amandes croquantes`, using the current Canadian manufacturer product titles with the generic product class made explicit.
- **Integrated ID:** `ingredient-ref-cranberry-almond-crunch-cereal`.
- **Integrated catalog effect:** Added one row to `GRAIN_AND_CEREAL` with empty aliases, no forms, `defaultDensity: null`, and `unitMappings: []`. The manufacturer name `Post` is not a display prefix or alias; it is not part of the manufacturer's English/French product headings and a bare maker-name search is broader than this product.
- **Measurement and use limits:** The Maxi Québec listing reports one product serving of 1 cup (66 g), and Post's French recipe uses 1 cup in a cereal crumble. If these are recorded, keep them as source-specific observations; do not add a reusable cup mapping, density, conversion, yield, or substitution.
- **Snapshot:** 1,652 active ingredient references, 125 forms, 2,000 research-ledger records, and 114 manifest-listed recipes with 1,123 structured ingredient rows after integration. These are read-only snapshot counts and may change as concurrent batches integrate.
- **Source IDs:** `WP03-POST-CAC-R262-20261016-S01` through `S04` were proposal-local and are now registered on this ledger record.

## Identity and Québec wording

Post Consumer Brands Canada's current English product page names the cereal **Cranberry Almond Crunch** and describes it as a cereal made with crisp multigrain flakes, cranberries, and almonds. Its Canadian French page names the same product **Canneberges et amandes croquantes** and describes multigrain flakes, cranberries, and almonds. The two pages show the matching formula: whole-grain wheat, rice, sugars, whole-grain rolled oats, dried cranberries, degermed corn meal, almonds, and minor ingredients. Both identify the cereal as prepared in Canada, from domestic and imported ingredients [WP03-POST-CAC-R262-20261016-S01, WP03-POST-CAC-R262-20261016-S02].

Maxi Québec lists the corresponding product as **Post Céréales canneberges et amandes croquantes**, product number `21648190_EA`, in a 380 g package. Its product description confirms that the cereal contains dried cranberries, almonds, and multigrain flakes and clusters; the listing is marked prepared in Canada [WP03-POST-CAC-R262-20261016-S03]. The manufacturer and local-retailer wording support the French display. This is product-label evidence, not an OQLF ruling.

Treat this as the named, mixed ready-to-eat cereal. It is not the generic `granola / granola` identity, the generic `multigrain flakes / flocons multigrains` identity, or its dried-cranberry, almond, oat, rice, wheat, or corn components. The retailer's mention of granola clusters describes one part of the cereal; it does not make the product a generic granola or support a `granola` alias. Do not turn ingredient-list terms into aliases.

## Proposed reference boundary

| Field | Proposed value | Limit |
|---|---|---|
| ID | `ingredient-ref-cranberry-almond-crunch-cereal` | Unallocated until integration. |
| English display | `Cranberry Almond Crunch cereal` | Uses the manufacturer's exact product name and its description as cereal. |
| fr-CA display | `céréales canneberges et amandes croquantes` | Uses the manufacturer's French product title and Maxi's localized cereal wording. |
| Category | `GRAIN_AND_CEREAL` | A dry, packaged, ready-to-eat multi-grain cereal product. |
| Aliases | None | Keep `Post`, `Cranberry Almond`, `cranberry cereal`, and component names out. The product title already supplies its specific search phrase. |
| Forms | None | The reference itself identifies the packaged cereal product. |
| Density and unit mappings | Null and empty | A product serving is not a reusable measure or density. |
| Recipe links, conversions, yields, substitutions | None | The evidence does not establish a bundle recipe link or general culinary replacement. |

Post lists 380 g, 1.1 kg, and 1.4 kg package sizes on the manufacturer pages [WP03-POST-CAC-R262-20261016-S01, WP03-POST-CAC-R262-20261016-S02]. These are package presentations, not recipe measures or separate ingredient identities. Maxi's 1 cup (66 g) serving belongs to its listed 380 g product, while Post's French recipe uses 1 cup in a particular fruit crumble [WP03-POST-CAC-R262-20261016-S03, WP03-POST-CAC-R262-20261016-S04]. Neither source gives a general conversion for all cereal products or for other package formulations.

## Ownership and archive audit

Normalized exact-key checks over active reference names and aliases, attached form labels and match terms, candidate record IDs, and legacy-import identities found no owner for `Cranberry Almond Crunch`, `Cranberry Almond Crunch cereal`, `Canneberges et amandes croquantes`, or `céréales canneberges et amandes croquantes`. No reference, form, recipe link, or ledger candidate currently carries the proposed ID. The four source IDs and URLs below were also checked absent from the ledger before drafting.

| Current neighbor | Existing ownership | Boundary |
|---|---|---|
| `ingredient-ref-granola` | `granola / granola` | Keep the cereal's granola clusters as product description, not an alias to generic granola. |
| `ingredient-ref-multigrain-flakes` | `multigrain flakes / flocons multigrains` | The branded cereal is a composite finished product, not only its flakes. |
| `ingredient-ref-cranberries` and `ingredient-ref-dried-cranberries` | Fresh and dried fruit identities | The cereal's cranberry ingredient is a component, not a synonym for the finished cereal. |
| `ingredient-ref-almonds` | Almond identity | Do not alias the cereal to almonds or add almond terms as aliases. |
| `ingredient-ref-cheerios-oat-crunch-almond`, Special K Vanilla Almond, and Vector granola rows | Separate branded cereal products | Almond/crunch wording alone is too broad; retain the full product name. |

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it folds accents and punctuation, prefers complete word-phrase matches, and uses substring matching only when no phrase match exists. Forms are included in the current ownership and query audit. No live Android picker QA is claimed.

| Query | Current result | With the proposed row | Interpretation |
|---|---|---|---|
| `Cranberry Almond Crunch cereal` | No result | Proposed row only | Exact English display. |
| `Cranberry Almond Crunch` | No result | Proposed row only | Manufacturer's full product name remains searchable without a synonym alias. |
| `céréales canneberges et amandes croquantes` | No result | Proposed row only | Exact normalized French display. |
| `canneberges et amandes croquantes` | No result | Proposed row only | The French product name resolves independently of its class prefix. |
| `cranberry` | `ingredient-ref-cranberry-beans` | That row plus the proposed cereal | Keep this short, component-overlapping query multi-result. |
| `canneberges` | `ingredient-ref-cranberries`, `ingredient-ref-dried-cranberries` | Those two plus the proposed cereal | Fruit-name query remains broad and returns the cereal only by its full title token. |
| `almond` / `amandes` | 10 English / 6 French rows | 11 English / 7 French rows | Existing ingredient and cereal results remain; do not add component aliases. |
| `cereal` / `céréales` | 43 English / 39 French rows | 44 English / 40 French rows | Broad category searches grow by one. |
| `granola` | Generic granola and three Vector granola products | Unchanged | The proposed name and aliases do not claim generic granola. |
| `Post` | One unrelated substring-fallback result | Unchanged | Do not add the manufacturer name or imply a complete Post-family listing. |

## Bundled recipe demand

All 114 manifest-listed recipe files and their 1,123 structured ingredient rows were scanned for the product names, localized forms, product ID, and close title variants. No exact product mention or ingredient link was found. A few recipes use fresh or dried cranberries as fruit; these are unrelated to the cereal identity and keep their current cranberry references.

Post's separate Canadian French recipe, *Crumble aux fruits et aux céréales Canneberges et amandes croquantes*, names the cereal as an ingredient and uses 1 cup for that topping [WP03-POST-CAC-R262-20261016-S04]. This confirms a culinary use outside the bundled library, but it does not create a bundled recipe demand or a product-wide measure.

## Unresolved follow-up

The manufacturer and Québec retailer provide current French product wording and a clear identity boundary, so the row is integrated. Independent human Québec-language approval and the broader Section F review remain open. This work makes no claim about Post's full cereal lineup.

## Source register

Sources were checked online on **2026-10-16**. The source IDs below were collision-checked while proposal-local and are now registered on the integrated research-ledger record.

| ID | Source | Evidence and limits |
|---|---|---|
| `WP03-POST-CAC-R262-20261016-S01` | Post Consumer Brands Canada, [Cranberry Almond Crunch](https://www.postconsumerbrands.ca/brand/cranberry-almond-crunch/cranberry-almond-crunch/). | Current English manufacturer product page; checked 2026-10-16 and page shows a 2026-03-23 update. Names the product, lists 380 g, 1.1 kg, and 1.4 kg boxes, describes it as cereal, and gives its current ingredient panel. Manufacturer notes that package information takes precedence and formulas can change. |
| `WP03-POST-CAC-R262-20261016-S02` | Post Consumer Brands Canada, [Canneberges et amandes croquantes](https://www.postconsumerbrands.ca/fr-ca/marques/canneberges-et-amandes-croquantes/canneberges-et-amandes-croquantes/). | Current Canadian French manufacturer product page; checked 2026-10-16 and page shows a 2026-03-23 update. Provides the French product title, matching package formats and formula, and Canadian-preparation statement. Supports this product wording, not an OQLF ruling or permanent formula. |
| `WP03-POST-CAC-R262-20261016-S03` | Maxi Québec, [Post Céréales canneberges et amandes croquantes, 380 g](https://www.maxi.ca/fr/c-r-ales-canneberges-et-amandes-croquantes/p/21648190_EA). | Current Québec retailer listing, product number `21648190_EA`, title, package size, formula, and 1 cup (66 g) serving. The page reported out of stock at the selected Laval Laurentides store when checked; this is not evidence of general availability. Retailer portion data are approximate and product-specific. |
| `WP03-POST-CAC-R262-20261016-S04` | Post Consumer Brands Canada, [Crumble aux fruits et aux céréales Canneberges et amandes croquantes](https://www.postconsumerbrands.ca/fr-ca/recipe/crumble-aux-fruits-et-aux-cereales-canneberges-et-amandes-croquantes/). | Manufacturer recipe names the cereal and calls for 1 cup in a fruit crumble. This is one recipe-specific use, not a general cereal conversion or bundled RecipeBook line. No publication date is shown; checked 2026-10-16. |

## Disposition

**Integrated one identity-only `GRAIN_AND_CEREAL` row for `Cranberry Almond Crunch cereal / céréales canneberges et amandes croquantes`.** Kept aliases, forms, density, unit mappings, recipe links, conversions, yields, and substitutions empty. Recorded package sizes and the Maxi 1 cup (66 g) serving as source-specific observations only. The Section F checklist, plan integration log, and roadmap now record this decision.

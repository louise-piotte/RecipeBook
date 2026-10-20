# WP03 Section F: Frosted Flakes less-sugar multigrain cereal identity review (R179)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No catalog reference, ledger record, alias, form, recipe link, or runtime data is changed here.
- **Open checklist:** Section F leaves regional cereal mixes and preprocessed grains open in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3513).
- **Candidate:** the Canadian-market finished ready-to-eat cereal titled **Kellogg's Frosted Flakes Less Sugar Multigrain Cereal**, currently sold in a 338 g package.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference as **`Kellogg's Frosted Flakes Less Sugar Multigrain Cereal / Céréales Kellogg's Frosted Flakes Multigrains Moins de sucre`**. Allocate `ingredient-ref-frosted-flakes-less-sugar-multigrain`. Keep aliases empty and keep the product distinct from generic multigrain flakes, bran-flakes cereal, corn flakes, and other Frosted Flakes variants. Add no reusable measure, density, mapping, form, recipe link, yield, conversion, or substitution.

## Identity and naming boundary

WK Kellogg Co Canada currently lists this as a separate finished Frosted Flakes product in both its English and Canadian French storefronts. The French page is regionalized to Québec and lists Metro Québec, Provigo, Maxi, Voilà, and Super C among the retailer options. It provides the exact French product title **Céréales Kellogg's Frosted Flakes® Multigrains Moins de sucre** and says it contains 50% less sugar than the original product. The manufacturer lists whole-grain wheat, rice, wheat bran, sugar and other ingredients. The 338 g package is the current displayed size [S01–S02].

The candidate is a formulated, ready-to-eat branded cereal product. It is not a generic mixture of dry cereal flakes: its ingredient list includes sweeteners, salt, flavouring, a stabilizer, and added vitamins/minerals, and the manufacturer describes a Frosted Flakes cereal with a multigrain variation. Do not decompose it into or alias it to the active `multigrain flakes`, `bran flakes cereal`, `corn flakes`, or wheat and rice grain references. Do not imply that the product has an unspecified or universal multigrain formula; use only this named product identity.

Use the exact current manufacturer titles as the bilingual displays. This is Canadian manufacturer wording with an explicit Québec retailer route, not an OQLF ruling on the compound title. The French phrase `céréales multigrains` is source-attested here for this product, but it should not become an alias for generic multigrain flakes. Keep aliases empty, including unqualified `Frosted Flakes`, `multigrain cereal`, `céréales multigrains`, and `Frosted Flakes cereal`: the product title already supplies a fully qualified route, while shorter names would blur product type or variant boundaries as more cereal references are added.

| Neighbor | Existing or proposed owner | Boundary |
|---|---|---|
| `multigrain flakes / flocons multigrains` | `ingredient-ref-multigrain-flakes` | A dry loose blend of cereal-grain flakes, not this formulated ready-to-eat cereal. |
| `bran flakes cereal / céréales de son en flocons` | `ingredient-ref-bran-flakes-cereal` | Generic cereal made from bran flakes; it does not own this Frosted Flakes product. |
| `corn flakes / flocons de maïs` | `ingredient-ref-corn-flakes` | Separate corn-flake ingredient identity. The candidate's disclosed formula is multi-ingredient and includes wheat, rice, and wheat bran. |
| Original and other Frosted Flakes variants | No exact active reference for the brand family or these variants | Keep the less-sugar multigrain product bounded to the complete manufacturer title. Do not treat it as a base Frosted Flakes identity or as a proxy for the original, strawberry, or cookies-and-crème products. |

## Ownership, source, and picker audit

The live working-tree snapshot contains 1,555 active references, 122 ingredient forms, 61 legacy-import candidates, and 1,900 research-ledger records with 8,155 registered source entries. Exact normalized searches across active displays and aliases, forms and their match terms, and legacy names and aliases found no owner for the proposed stable ID, full English or French title, the exact less-sugar multigrain variant, or SKU `059724103887`. The ledger has no candidate for this product or its SKU. It does already contain one broader WK Kellogg French brand-page citation under the earlier multigrain-flakes research; that record only notes finished Frosted Flakes multigrain cereal as a sibling boundary. This proposal does not duplicate that source ID or claim that the earlier mention decided this product identity.

The SKU-specific manufacturer URL and Metro product URL below were checked against the ledger and proposal archive. Neither URL is registered in the ledger. The proposal-local source IDs `WP03-FFLS-MULTIGRAIN-20261016-S01` through `S03` were checked absent from the research ledger and proposal archive before drafting. Existing active entries that may appear for broad family terms include branded hot cereals, Kashi GoActive, Weetabix, Red River, Sunny Boy, generic flakes, and the separate multigrain-flakes identity; none owns the full candidate titles.

Using the current phrase-first normalized picker behavior, the exact query **`Frosted Flakes Less Sugar Multigrain Cereal`** is not currently owned; with the recommended full title it would match the proposed reference. `Frosted Flakes` would also return the new product because the full display contains that phrase, so it would be a broad brand-family query rather than proof of equivalence to the original cereal. `multigrain` / `multigrains` would return both this product and the separate `ingredient-ref-multigrain-flakes`, which is an appropriate distinction between finished cereal and loose flake blend. Broad `cereal` / `céréales` queries already return multiple cereal products and would add this row to those family results. Keep the aliases empty so no shorter term is newly promoted.

## Bundled recipe demand

The complete current manifest corpus was scanned in manifest order: **114 recipe files and 1,123 ingredient rows**. The full serialized recipe files and ingredient rows were searched for the exact English/French candidate titles and variants, `Frosted Flakes`, `Frosted Flakes cereal`, `céréales Kellogg's`, `multigrain cereal`, `multigrains moins de sucre`, `059724103887`, and related less-sugar product wording. The scan found **0 matching recipe files and 0 matching ingredient rows**. No recipe link or recipe edit is proposed.

## Numeric, preparation, and substitution limits

- **Nutrition serving:** The manufacturer's comparison reports 7 g sugar per 41 g serving for this SKU and compares it with 14 g sugar per 38 g of the original cereal [S01]. These are product-specific nutrition-comparison bases, not a general serving recommendation, reusable cereal portion, or cup-weight conversion. If later recorded, retain them only as SKU- and claim-specific observations.
- **Package amount:** The manufacturer's 338 g size and Metro Québec's 338 g product listing [S02–S03] are package facts. They do not establish a recipe amount, package yield, or household measure.
- **Forms and density:** The product is sold ready to eat and has no preparation directions supporting a form conversion. Add no `IngredientForm`, density, or unit mapping.
- **Conversions and yields:** No dry-to-cooked relation or recipe yield is indicated. Do not infer a volume-to-mass relation from the package or nutrition claim.
- **Substitutions:** No source gives a tested, quantity-qualified replacement rule for original Frosted Flakes, bran flakes, corn flakes, multigrain flakes, or another cereal. Add no global or contextual substitution.

## Source register

Sources accessed on 2026-10-16. These IDs are local to this proposal and are not ledger additions.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-FFLS-MULTIGRAIN-20261016-S01` | WK Kellogg Co Canada, [Kellogg's Frosted Flakes Less Sugar Multigrain Cereal](https://www.wkkellogg.ca/en/products/frosted-flakes-multigrain-cereal-less-sugar), product title, description, pack size, ingredient list, and nutrition comparison. | Current manufacturer page identifies the named Canadian product, calls out its multigrain variation and 50% less sugar claim, gives the 338 g package, the 7 g per 41 g / 14 g per 38 g comparison, and lists whole-grain wheat, rice, sugars, wheat bran, and other ingredients. It is evidence for this SKU only; no general formulation, measure, or substitution is inferred. |
| `WP03-FFLS-MULTIGRAIN-20261016-S02` | WK Kellogg Co Canada, [Céréales Kellogg's Frosted Flakes Multigrains Moins de sucre](https://www.wkkellogg.ca/fr/produits/frosted-flakes-multigrain-cereal-less-sugar), French product title, description, ingredients, Québec region, retailer list, and package size. | Current Canadian French manufacturer page provides the exact French product wording and ingredient list, lists Québec among its regions, and includes Metro Québec, Provigo, Maxi, Voilà, and Super C as retailer options. The phrasing is commercial product wording, not an OQLF terminology entry. Its product claims and 338 g size remain SKU-specific. |
| `WP03-FFLS-MULTIGRAIN-20261016-S03` | Metro Québec, [Céréales multigrains réduit en sucre, Frosted Flakes, 338 g](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-multigrainsreduit-en-sucre/p/059724103887), product title and package size. | Québec retailer listing supports local retail naming and availability context for the 338 g product. Its title is a retailer display variant, not a terminology ruling; the package amount is not a reusable measure. The direct page was unavailable to the browser during review, so it corroborates rather than leads the recommendation. |
| Reused `WP03-MFLAKES-20261012-S06` | WK Kellogg Co Canada, [Frosted Flakes French brand page](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/frosted-flakes) and English brand page. | Already registered on the multigrain-flakes research record. The page's product list documents Frosted Flakes Multigrains Moins de sucre as a finished branded cereal distinct from loose multigrain flakes. Reused as prior-boundary context only; no duplicate ID is proposed. |

## Recommendation

**Add the identity-only branded product reference `ingredient-ref-frosted-flakes-less-sugar-multigrain` as `Kellogg's Frosted Flakes Less Sugar Multigrain Cereal / Céréales Kellogg's Frosted Flakes Multigrains Moins de sucre`.** Current Canada manufacturer pages provide matching English and French names, a product ingredient statement, and an explicit Québec retail route. Keep aliases empty, preserve the product-specific less-sugar qualifier, and separate this ready-to-eat formulation from generic multigrain flakes, bran flakes cereal, corn flakes, and other Frosted Flakes variants. Do not add reusable measurements, forms, conversions, yields, recipe links, or substitutions. Section F's wider cereal-mix and preprocessed-grain review remains open.

## Root integration disposition

Accepted on 2026-10-16. Added the identity-only `GRAIN_AND_CEREAL` reference with empty aliases, null density, and empty unit mappings. The manufacturer’s 41 g nutrition-claim basis is retained only as a product-specific ledger observation; it is not an active measure. No recipe link or substitution was added. See the [R179 integration record](../batches/wp02-wp03-wp04-r179-gap-review-integration-20261016/README.md).

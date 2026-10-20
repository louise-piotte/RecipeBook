# WP03 Section F: wild-rice blend identity and boundary review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Integrated on 2026-10-11 as an identity-only reference. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.
- **Checklist scope:** one unresolved rice-product candidate under the Section F grain and cereal coverage review: a plain wild-rice blend.
- **Recommendation:** accept an identity-only `GRAIN_AND_CEREAL` reference with English display `wild rice blend` and French display `mélange de riz sauvage`. Add no aliases, forms, recipe links, density, unit mappings, conversions, yields, or substitutions. Keep the blend distinct from pure wild rice and ordinary cultivated rice. The French display is attested in Canadian and Québec retail wording; it is not presented as an OQLF-approved compound term.

## Open item and prior coverage

The active plan still leaves “regionally significant cereal mixes and preprocessed grains” open at [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L1720). The [plant-grains checklist](../batches/plant-grains-cereals.md) records wild-rice blends as unresolved in its rice coverage. The prior residual cereal review addresses granola and muesli and explicitly leaves other cuisine-specific mixes open; no earlier proposal in the Section F packet set reviews this wild-rice product class. This packet covers plain dry rice blends containing wild rice only. It does not reopen the existing pure wild-rice, rice grain-length, milling, or cooked-rice identities.

## Live package and exact-key audit

The audit read the current split package and all manifest-listed recipes. Candidate-key comparison used the repository's `normalize_search_key` behavior across active reference names and aliases, form labels and match terms, research-ledger strings, legacy candidates, and recipe lines.

| Live surface | Current result |
| --- | --- |
| Active ingredient references | 905 references. `ingredient-ref-wild-rice` is the only exact `wild rice` / `riz sauvage` reference; it has no aliases, null density, and empty unit mappings. There is no exact active key for `wild rice blend`, `wild rice mixture`, `mélange de riz sauvage`, or their reviewed spelling variants. |
| Nearby rice identities | `ingredient-ref-rice` (`rice / riz`) owns generic dry and cooked forms. `ingredient-ref-wild-rice` is separate; named brown, long-grain, parboiled, black, and other rice products have their own rows. No active wild-rice-blend reference or form exists. |
| Ingredient forms | 48 forms. None belongs to `ingredient-ref-wild-rice` or matches the proposed blend terms. Do not transfer generic-rice or white-rice dry/cooked forms to a blend whose components and cooking behavior vary. |
| Research ledger | 1,159 records. It contains an accepted identity record for pure `ingredient-ref-wild-rice`, but no blend candidate or blend decision. |
| Legacy candidates | 77 candidates; no exact blend candidate or alias. |
| Bundled recipe demand | 114 recipes and 1,123 ingredient rows. **Zero** exact blend-name rows and **zero** broader `wild` / `sauvage` ingredient rows. No line needs a recipe link, state form, measure, or substitution. |

Exact pure-wild-rice keys resolve to `ingredient-ref-wild-rice`; searches that drop “blend” can therefore return the pure ingredient. Keep `wild rice` and `riz sauvage` exclusive to that row. Broad `rice` / `riz` searches also cover many separate active rice references. A normalized search for the full blend wording avoids those exact-key collisions.

## Product identity and bilingual terminology

Manufacturer and retail sources identify a real plain dry product class, while showing that component ratios and rice varieties are product-specific. Lundberg's current `Wild Blend Rice` contains long-grain brown rice, sweet brown rice, wild rice, Wehani red rice, and black rice. Floating Leaf uses `Wild Rice Blend` for a different multi-rice mixture. Dainty's `Long Grain and Wild Rice Blend` is specifically parboiled long-grain rice with wild rice. These establish the English product wording and a useful boundary; none establishes one universal recipe for the blend.

Québec French evidence includes the current La Moisson title `Mélange de Riz Sauvage et de Riz Brun à Grains Entiers Wild Blend`, with an ingredient list for that Lundberg product and delivery to Québec. A current French Canadian Costco listing uses `Mélange De Riz Sauvages` and its description calls the item `mélange de riz sauvage`. These are product-page labels, not a terminology ruling. Dainty's French product page uses the more specific `Mélange de riz à grains longs et riz sauvage`, supporting that longer wording for its particular long-grain blend only.

| Term or boundary | Disposition | Evidence and limit |
| --- | --- | --- |
| English display | `wild rice blend` | Exact product-class wording on Floating Leaf's Canadian manufacturer page. `Wild Blend Rice` and `Long Grain and Wild Rice Blend` are also source-attested product names, but the former is brand wording and the latter specifies a particular rice base. |
| Québec French display | `mélange de riz sauvage` | Exact wording in the French Canadian Costco product description and within the full title of a Québec retailer listing. A Dainty Québec-market product uses the more specific `mélange de riz à grains longs et riz sauvage`. The simpler display is retail-attested, not OQLF-approved. |
| Identity scope | Plain, dry mixture of wild rice with one or more other edible rice grains | A mixture is not pure wild rice and is not identical to generic `rice / riz`. Keep the blend separate from other products that add seasoning, vegetables, legumes, or ready-to-eat components. |
| Pure wild rice boundary | Retain `wild rice / riz sauvage` as a separate active identity | OQLF pairs `wild rice` with `riz sauvage`; CFIA says wild rice is a grass outside the rice standard but that `wild rice / riz sauvage` is its common name. OMAFRA identifies northern wild rice as *Zizania palustris*. These sources support the ingredient boundary; they do not name a blend formula. |
| Aliases | None | Do not add `Wild Blend` (brand wording), `long grain and wild rice blend` (one product subclass), `mélange de riz à grains longs et riz sauvage`, `mélange de riz sauvage et de riz brun`, `medley de riz sauvage`, or procurement wording `riz sauvage à grains longs` as global aliases. They are brand-specific, composition-specific, inconsistent, or otherwise too broad for this class. |

One French Canadian retailer listing titles Lundberg's mixture `Riz sauvage Lundberg` while its description identifies a multi-rice blend. This is a useful title/search collision signal, but the component list, not the shortened title alone, establishes the blend scope. Keep `Riz sauvage` exclusive to the pure reference and do not use the retailer shorthand as the blend display.

## Forms, quantities, recipes, and substitutions

| Data area | Disposition |
| --- | --- |
| Forms | Add none. The candidate is a packaged dry mixture; a cooked state is a preparation state, and the bundled recipe package has no line requiring it. Do not attach the generic rice dry/cooked forms to this product class. |
| Density and unit mappings | Leave unset. Package weights such as Lundberg 454 g, Floating Leaf 400 g or 1.5 kg, and Costco's 2 × 1.5 kg are package-specific quantities, not mass-per-cup observations. |
| Measures and conversions | Add none. Floating Leaf and Dainty publish product-specific rice-to-water ratios; the recipes and the blends differ. Those ratios do not establish a general cup-to-gram, dry-to-cooked, or brand-to-brand conversion. |
| Yields | Add no yield relation. Dainty's French recipe line says `1 tasse` of its blend, `cuit et frais`, and then `Donne 2 tasses de riz cuit`; it does not clearly state whether the first cup is dry input or cooked rice. Treat it as ambiguous, product-specific recipe wording, not a generic yield. Lundberg and Floating Leaf also publish different cooking times and directions. |
| Substitutions | Add no global or contextual rule for replacing pure wild rice, ordinary rice, or another blend. The product formulas and cooking behavior differ, and no bundled recipe requests a substitution. |
| Bundled recipe links | Add none. Exact and broad wild-rice searches returned no bundled recipe ingredient rows. External product recipes establish use of named blends but do not authorize relinking this package. |

## Source register

Sources were checked on 2026-10-11 unless the page states its own older update date.

| Ref | Source | Use and limits |
| --- | --- | --- |
| S01 | [Floating Leaf Fine Foods, Wild Rice Blend](https://eatwildrice.ca/products/wild-rice-blend-2) | Canadian manufacturer page gives the exact English product name and identifies one branded blend. Its published 1 cup to 1¾ cups water ratio and 25-minute cook are product-specific, not generic conversion or yield data. |
| S02 | [Floating Leaf Fine Foods, ingredient listings](https://eatwildrice.ca/pages/ingredients) | Manufacturer lists multiple rice-only blends with different component sets, including Wild Rice Blend and Basmati Brown & Wild Rice. This supports formula variability and the rice-only scope; it does not establish a standard blend formula. |
| S03 | [Lundberg Family Farms, Wild Blend Rice](https://www.lundberg.com/products/lundberg-wild-blend-rice-1lb) | Current manufacturer page names and describes Wild Blend Rice and lists its five ingredients. Its 1 cup rice to 1¾ cups liquid, 45-minute cooking and 10-minute rest apply to that product only; the page says it ships only to the contiguous United States. |
| S04 | [La Moisson, Mélange de Riz Sauvage et de Riz Brun à Grains Entiers Wild Blend](https://lamoisson.com/products/melange-de-riz-sauvage-et-de-riz-brun-a-grains-entiers-wild-blend) | Québec retailer page supplies the exact French product title, the ingredient list for the Lundberg blend, a 454 g package, and Québec delivery information. It supports Québec market wording for this product, not a universal formula or measurement. |
| S05 | [Costco Canada, Floating Leaf – Mélange De Riz Sauvages](https://www.costco.ca/p/-/floating-leaf-wild-rice-blend-2-x-15-kg/100765642?langId=-25) | Current Canadian French listing calls the item a `mélange de riz sauvage` and describes it as a rice mixture. The product page's prose contains a possibly inconsistent extra Riceberry mention, so it supports French market wording and blend status only; the composition should be taken from a physical ingredient panel or manufacturer record. |
| S06 | [Dainty, Long Grain and Wild Rice Blend](https://dainty.ca/product/long-grain-rice-and-wild-rice-blend/) and [French product page](https://dainty.ca/fr/produits/melange-de-riz-a-grains-longs-et-riz-sauvage/) | Manufacturer source identifies its product as parboiled long-grain and wild rice and supplies the longer French product wording. It lists a 1:2 rice-to-water ratio for this product only and says the brand is available in Québec; it does not establish that all blends use parboiled rice or the same name. |
| S07 | [Dainty, Salade de riz](https://dainty.ca/fr/recettes/salade-de-riz/) | Manufacturer recipe uses Dainty's named blend and says `1 tasse` of the blend, `cuit et frais`, `donne 2 tasses de riz cuit`. The dry/cooked basis of the first amount is unclear, so no yield is inferred. It is outside the bundled RecipeBook corpus. |
| S08 | [OQLF, riz sauvage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage) | Direct Québec terminology pair `wild rice / riz sauvage`; the 1985 definition says it may be mixed with brown rice. Supports the pure ingredient name, not the proposed blend name or formula. |
| S09 | [CFIA, Labelling and composition requirements for grain and bakery products — Wild rice](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products) | Current federal guidance explains wild rice is a grass outside the rice standard and confirms `wild rice` as its common name. It does not define wild-rice blends. |
| S10 | [Ontario Ministry of Agriculture, Food and Rural Affairs, wild rice](https://www.omafra.gov.on.ca/CropOp/fr/field_grain/spec_grains/wiri.html) | Identifies northern wild rice as *Zizania palustris* and distinguishes it from cultivated white rice; page last updated in 2012. Used for botanical/product boundary only. |
| S11 | [Well.ca, Riz sauvage Lundberg](https://well.ca/fr/produits/lundberg-wild-blend-rice_84044.html) | French Canadian retailer listing uses the shortened title `Riz sauvage Lundberg` while the indexed description and ingredients identify a multi-rice mixture. Direct fetch returned a cache miss during this review, so use it only as a secondary title-collision signal, not as primary composition or terminology authority. |

## Decision

**Integrated `wild rice blend / mélange de riz sauvage` as a distinct identity-only reference** under `GRAIN_AND_CEREAL`, scoped to a plain dry rice mixture containing wild rice and other rice grains. Current English manufacturer evidence and Québec/French Canadian product listings support the bilingual product wording, while the composition evidence shows why it cannot alias to pure wild rice or generic rice. No formula, brand name, form, density, measure, conversion, yield, recipe link, or substitution was added. The row retains only the documented simple French display; longer product-specific phrases and procurement wording are not aliases. Verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).

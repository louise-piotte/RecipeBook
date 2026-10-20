# WP04 Section P R565 — Atlantic cod centre-cut form boundary review

- **Review date:** 2026-10-17.
- **Plan anchor:** [WP04 Section P finfish item, lines 6351–6352](../../RecipeBook-global-ingredient-catalog-plan.txt#L6360).
- **Status:** Integrated hold on 2026-10-17. The plan records the bounded picker hold; no catalog or ledger data was added. See the [R565 integration README](../batches/wp04-r565-cod-centre-cut-hold-integration-20261017/README.md).
- **Disposition:** **Hold an Atlantic-cod centre-cut form outside active data.** High Liner currently documents a centre cut as distinct from a loin, with a paired English/French product record. However, the form label would make the generic picker queries `centre` and `coupe` return Atlantic cod alone, replacing broader existing results. No matching bundle demand or paired Pacific-cod centre-cut evidence was found. Keep this narrow cut review separate from the integrated R560 cod-loin forms and leave the Section P finfish parent open.

## Scope and prior-work check

The open plan item covers broad finfish coverage; the completed subitems include a Trichiurus naming hold, an Atlantic-halibut steak form, several picker holds, and the paired Atlantic/Pacific cod-loin forms. R565 reviews only the manufacturer-named **Atlantic cod centre cut** product/form boundary. It does not reopen those earlier decisions or attempt to resolve the full cod or fish-cut family.

- [R560](wp04-section-p-next-gap-review-r560-20261017.md) added species-qualified Atlantic- and Pacific-cod loin forms. R565’s High Liner centre-cut product is a different cut class; its source UUID and product code differ from the 3269 loin SKU used by R560. Do not reuse the R560 product IDs or measurements.
- [R557](wp04-section-p-next-gap-review-r557-20261017.md) held swordfish steak because a broad picker phrase would produce an unsafe singleton. R565 applies the same current picker audit to a different cut and different collision: `centre` and `coupe` would suppress existing results.
- [R554](wp04-section-p-next-gap-review-r554-20261017.md) held Haddock loins / longes d’aiglefin because plural bare-cut queries would return Haddock alone. R565 does not add Haddock terms or revisit that hold.
- [R545](wp04-section-p-atlantic-halibut-steak-form-review-r545-20261017.md) added the species-qualified Atlantic-halibut steak form. R565 makes no general claim about whether every species-qualified cut should be added; this product label has its own observed broad-query effects.
- The catalog and ledger contain no centre-cut form ID or ledger record. Proposed ID `ingredient-form-atlantic-cod-centre-cut` is unallocated. No earlier Section P proposal reviewing Atlantic-cod centre cuts was found.

## Current catalog and ledger ownership

The read-only workspace snapshot contained **1,805 active ingredient references, 150 active forms, and 2,171 research-ledger records**. Relevant current owners are:

| Owner | Current state | R565 boundary |
|---|---|---|
| `ingredient-ref-atlantic-cod` | `Atlantic cod / morue de l’Atlantique`; no aliases; null default density; empty unit mappings. Its ledger record is identity-verified; parent measurement and substitution states remain `not_yet_researched`. Existing identity sources are `WP04-FINFISH-ID-20261009-S02`, `S06`, and `S07`. | Keep the parent and its research states unchanged. Reuse these species/common-name sources only for parent identity; they do not define centre cuts. |
| `ingredient-form-atlantic-cod-loin` | Existing R560 form `Atlantic cod loin / longe de morue de l’Atlantique`, `loin_cut`, empty match terms, null density. Its ledger record has cut-scoped no-supported-value and no-supported-substitute findings. | Keep distinct. High Liner says its centre cut is thinner than the loin and typically shorter and wider. Do not attach centre-cut evidence or weights to the loin record. |
| `ingredient-ref-pacific-cod` and `ingredient-form-pacific-cod-loin` | Existing Pacific-cod identity and R560 loin form; the Metro 244982 listing is a frozen Pacific cod loin portion. | Do not treat that SKU as a Pacific centre cut or as evidence for a paired centre-cut form. |

The High Liner centre-cut English and French URLs, product UUID, product code, and GTIN were not found in the active ledger. The proposal-local IDs below are not allocated catalog source IDs. The English and French routes point to the **same UUID and SKU**, so they are paired language views, not independent product observations. The separate 2026 product-guide listing for code 6129 is another SKU and is not pooled with code 6128.

## Product and cut evidence

Keep product evidence separate from parent species identity and from reusable culinary measurements.

| Proposal-local source ID | Source and evidence | Exact scope and limit |
|---|---|---|
| `WP04-SECTIONP-COD-CENTRE-CUT-R565-20261017-S01` | High Liner Foodservice Canada, [English product page, Atlantic Cod Centre Cuts](https://www.highlinerfoodservice.com/en-CA/products/atlantic/e7b1b127-5035-4e70-bbb2-ff9b72f5d011/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-centre-cuts-approx-85-g-3-oz). It identifies product code **6128**, GTIN **10061763061285**, and a title quantity of **4.54 kg / 10 lb**, approximately **85 g / 3 oz**. The description says the centre cut comes from the centre of the fish, is thinner than the loin, and is typically shorter and wider. It says the SKU is individually quick frozen. | One manufacturer SKU. The current indexed page was crawled the week of review; direct page opening returned a cache miss. The approximate nutrition serving is about one piece (85 g), not a standard centre-cut mass, exact piece count, edible yield, recipe portion, or substitution ratio. The listed 4.54 kg title amount and 5.22 kg gross-weight field are different fields and do not establish a package yield. Frozen state is SKU-specific. |
| `WP04-SECTIONP-COD-CENTRE-CUT-R565-20261017-S02` | High Liner Foodservice Canada, [French route for the same product UUID](https://www.highlinerfoodservice.com/fr/products/atlantic/e7b1b127-5035-4e70-bbb2-ff9b72f5d011/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-centre-cuts-approx-85-g-3-oz). The title uses `Coupes du centre de morue de l’Atlantique surgelées séparément`; indexed specifications also show code **6128** and GTIN **10061763061285**. | Paired French-language view of S01, not a second SKU. Direct page opening returned a cache miss; use the indexed page for paired product wording and code cross-check only. Its about-one-piece (85 g) serving is the same SKU observation as S01. |
| `WP04-SECTIONP-COD-CENTRE-CUT-R565-20261017-S03` | High Liner Foodservice, [2026 French product guide](https://assets.contentstack.io/v3/assets/blt4f0d20e0e71d660d/blt1a9263728c7bbcce/6966cffe149b23000862408d/HL-ProductGuide-2026-CAN-FR-FF_%282%29.pdf). Its Atlantic-cod section lists centre cuts **6128, 3 oz, 10 lb** and **6129, 4 oz, 10 lb**, separately from Atlantic cod loins **3268, 3269, 3270, and 8337**. | Manufacturer assortment evidence. The guide confirms separate product codes and cut names; its two centre-cut lines are not one product or a general serving standard. Do not transfer the 85 g observation from SKU 6128 to 6129, to all centre cuts, or to the loin form. |

The manufacturer pages pair the English `Atlantic Cod Centre Cuts` and French `Coupes du centre de morue de l’Atlantique` terms for code 6128, but they do not publish a scientific name on the product page. Existing OQLF/CFIA sources establish the parent `Atlantic cod / morue de l’Atlantique` naming and species context; do not treat the product page as independent taxonomic evidence. The French product wording is manufacturer usage, not an OQLF fish-cut standard. The terminology search returned OQLF `coupe du centre` entries for beef cuts; those do not define a fish cut.

The indexed pages and the 2026 manufacturer guide provide no matching Pacific-cod centre-cut SKU. R560’s [Metro product 244982 sources](wp04-section-p-next-gap-review-r560-20261017.md) instead describe a Pacific-cod **loin portion**. That is evidence for its own product/loin boundary, not a centre cut. This review did not establish that no Pacific-cod centre-cut product exists anywhere; it found no paired example in the searched current High Liner and Québec-facing Metro material.

## Picker projection and search boundary

The projection follows the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior: normalized complete word phrases are matched before substring fallback, and a form is returned as its parent reference. A query exactly equal to a form label may show the form hint; a contained word or shorter phrase does not. For the impact check, the hypothetical labels were `Atlantic cod centre cut` and `coupe du centre de morue de l’Atlantique`, with no match terms. The form is **not** active; “after” below is a read-only projection only.

| Query | Current result | Hypothetical result with proposed form | Effect |
|---|---|---|---|
| `Atlantic cod centre cut` | None | Atlantic cod, exact form label | The fully qualified query would work as intended. |
| `coupe du centre de morue de l’Atlantique` | None | Atlantic cod, exact form label | The fully qualified French query would work as intended. |
| `centre cut`; `coupe du centre` | None | Atlantic cod only | A generic cut phrase becomes a singleton. The shorter phrase does not show the exact form hint. |
| `centre` | Nine results: apple, broth, grape, grapefruit, lemon, lime, monk-fruit, orange, and pineapple juices/concentrates. | Atlantic cod only | Complete-word matching on the new label would take precedence over current substring-fallback hits in French `concentré` terms, suppressing all nine. |
| `coupe` | Three results: kkakdugi, leaf lettuce, and steel-cut oats. | Atlantic cod only | The new French label would become an exact word-phrase hit and suppress those broader results. |
| `cod centre cut` | None | Atlantic cod only | Useful species-plus-cut discovery would be provided, but without balancing either broad bare-cut query or existing picker results. |
| `Pacific cod centre cut` | None | None | No Pacific centre-cut form is supported by the reviewed evidence. |

These outcomes are produced by the label words themselves; empty match-term arrays would not prevent the broad-query collisions. Adding an English synonym `center cut` would create a further species-only result and is not proposed. A generic fish-centre-cut identity or a Pacific form cannot be inferred from this one Atlantic SKU.

## Recipe demand, measures, and substitutions

The read-only corpus scan checked every manifest-listed recipe: **114 recipe files and 1,123 structured ingredient rows**. It found zero rows containing cod/morue or centre-cut / coupe-du-centre wording. No recipe link or candidate-specific demand supports adding this cut now.

The product’s approximately 85 g “about one piece” serving, 4.54 kg title amount, and 5.22 kg gross-weight field remain separate SKU facts. They establish no reusable mass per centre cut, precise package count, piece-count mapping, package yield, density, cooking yield, or lb↔g mapping. Code 6129 is separately listed as a 4 oz centre-cut SKU in the manufacturer guide; its amount is not evidence for code 6128 or a shared cut standard.

No source or bundled recipe establishes a directed replacement among Atlantic cod centre cuts, Atlantic or Pacific cod loins, other cod cuts, or other fish. The manufacturer’s shape/thickness comparison is product-description evidence, not a tested ratio, common cooking time, recipe role, method, or adjustment. Do not add a form conversion, contextual substitution, warning, or recipe-line substitution. Keep the parent Atlantic-cod measurement and substitution states unchanged; do not inherit R560’s loin-specific findings.

## Bounded recommendation

Keep `ingredient-form-atlantic-cod-centre-cut` and all centre-cut aliases out of active data and the research ledger for this review. The plan records this bounded hold: the manufacturer supports a distinct bilingual cut name for Atlantic cod SKU 6128, but the present picker would replace existing `centre` and `coupe` result sets with Atlantic cod alone, and the bundle has no matching demand. Preserve the integrated Atlantic/Pacific cod-loin forms and the existing parent aliases, densities, mappings, measurement states, and substitutions.

Reopen the form only after picker behavior can retain broad results while exposing the cut, or after a product-backed cut set supports a useful non-singleton selection. The reviewed manufacturer assortment and local retailer search are not exhaustive evidence that no such product or recipe exists elsewhere. Keep the broader Section P finfish item open.

## Source ownership and evidence limits

The three R565 IDs below are proposal-local and unallocated in the shared ledger. S01/S02 are language routes for the same High Liner UUID; S03 is a distinct manufacturer guide URL, not a second SKU measurement record. Reuse the existing Atlantic-cod parent source IDs for identity context; do not duplicate their URLs. The current R560 High Liner loin and Metro Pacific-loin sources remain owned by their existing form records and do not support a centre-cut amount or substitution.

| Source ID | Source | Use and limits |
|---|---|---|
| Reuse `WP04-FINFISH-ID-20261009-S02`, `S06`, and `S07` | Existing OQLF/GDT and CFIA fish-common-name sources for Atlantic cod. | Parent identity / bilingual naming context only. They do not describe centre cuts. |
| `WP04-SECTIONP-COD-CENTRE-CUT-R565-20261017-S01` | [High Liner English product page, code 6128](https://www.highlinerfoodservice.com/en-CA/products/atlantic/e7b1b127-5035-4e70-bbb2-ff9b72f5d011/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-centre-cuts-approx-85-g-3-oz). | Current indexed manufacturer page reports product code, GTIN, cut description, pack/title and serving details. Direct open was a cache miss. One SKU only. |
| `WP04-SECTIONP-COD-CENTRE-CUT-R565-20261017-S02` | [High Liner French route, same UUID and code 6128](https://www.highlinerfoodservice.com/fr/products/atlantic/e7b1b127-5035-4e70-bbb2-ff9b72f5d011/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-centre-cuts-approx-85-g-3-oz). | Indexed French title/code/GTIN corroborate the bilingual route. Direct open was a cache miss; same SKU as S01, not independent amount evidence. |
| `WP04-SECTIONP-COD-CENTRE-CUT-R565-20261017-S03` | [High Liner 2026 French product guide](https://assets.contentstack.io/v3/assets/blt4f0d20e0e71d660d/blt1a9263728c7bbcce/6966cffe149b23000862408d/HL-ProductGuide-2026-CAN-FR-FF_%282%29.pdf). | Lists Atlantic cod centre-cut and loin codes as separate products. Guide amounts and pack sizes are product-code-specific and do not establish a reusable form measure. Direct PDF open returned a cache miss; indexed text was available. |
| Reuse `WP04-SECTIONP-COD-LOIN-R560-20261017-S01`–`S03` and R554 S04 | Existing High Liner English/French loin routes and Metro English/French Pacific-cod loin routes, tracked in R560. | Comparison only: different product UUIDs/SKUs and a different cut. Do not duplicate their source URLs under R565 IDs or move their package facts. |
| R01 — repository audit (not a catalog source ID) | Current active references, forms, research ledger, Section P plan, R554/R557/R560 proposals, `IngredientSearch.kt`, and every manifest-listed recipe. | Proposal-time snapshot on 2026-10-17. Confirms current owner/state, no centre-cut form or route ownership in the ledger, picker projection, and zero bundle demand. Root later added only the bounded plan/roadmap hold; no catalog or ledger data changed. See the [integration README](../batches/wp04-r565-cod-centre-cut-hold-integration-20261017/README.md). |

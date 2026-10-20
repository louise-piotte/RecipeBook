# WP04 Section P — canned tuna in broth and oil form review (R805)

- **Review and source-access date:** 2026-10-19.
- **Open checklist:** [Section P fish and seafood preservation forms, line 8385](../../RecipeBook-global-ingredient-catalog-plan.txt#L8403). The checklist remains open.
- **Recommendation:** Add one canned-tuna-in-broth-and-oil form under the existing `ingredient-ref-canned-tuna` parent.
- **Scope:** A generic packing-medium form for canned tuna products explicitly marketed as being in broth and oil. This is a form, not a brand or species identity. Keep species, cut, formula, ratio, package and drained amount product-specific.
- **Status:** Proposal only. No shared catalog/ledger JSON, checklist, workflow, roadmap, batch README, or integration README was changed. No software tests, build, emulator, or deployment were run.
- **Proposal-local identifiers:** Proposed form ID `ingredient-form-canned-tuna-in-broth-and-oil`; new source IDs `WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-S03` through `-S08`; audit label `WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-R01`. All are unallocated. Existing R168 source IDs S01 and S02 are reused with their current ownership.

## Why this is the next distinct open gap

The open Section P checklist still calls for review of canned fish and packing-medium forms. R168 created the species-neutral `canned tuna / thon en conserve` market parent and recorded that its products vary in medium, but added no forms. R790 added only the water-packed form. The just-integrated [R800–R802 batch](../batches/wp02-wp03-wp04-r800-r802-gap-review-integration-20261019/README.md) added canned tuna in olive oil; R802 explicitly keeps oil-and-broth products separate from olive-oil-only tuna. The active tuna parent now has separate water and olive-oil forms, but no broth-and-oil form. See the [R168 review](wp04-section-p-canned-tuna-product-boundary-review-r168-20261016.md), [R790 review](wp04-section-p-next-open-gap-review-r790-20261019.md), and [R802 review](wp04-section-p-canned-tuna-in-olive-oil-form-review-r802-20261019.md).

R168’s parent-owned English and French Clover Leaf catalog sources already show broth-and-oil products in the current canned-tuna family; that is prior product-family evidence, not an allocated form. R790 left broth-and-oil packing for separate review, and R802 did not absorb it into its olive-oil row. The current manufacturer pages now provide paired English and French product evidence for two distinct tuna variants, and Metro’s current Québec listings use matching French terms. No earlier dedicated broth-and-oil form review or integration was found. This proposal resolves only the specific combined medium.

## Current product evidence and limits

| Source | Evidence relevant to the form | Limit |
|---|---|---|
| Clover Leaf English [Tuna catalog](https://www.cloverleaf.ca/en/product/tuna/) [reused R168-S01] | The current manufacturer catalog lists both **Solid White Tuna, Albacore in Broth and Oil** and **Chunk Light Tuna, Yellowfin in Broth and Oil** among its canned-tuna products. | This catalog supports the named product family, not one tuna species, cut, ingredient formula, ratio, or package amount. Reuse the parent-owned source ID and URL. |
| Clover Leaf French [Thon catalog](https://www.cloverleaf.ca/fr/produit/thon/) [reused R168-S02] | The current French catalog lists **Thon blanc entier CLOVER LEAF®, Germon – bouillon de légumes et huile** and **Thon pâle en morceaux Clover Leaf, à nageoires jaunes dans bouillon et huile**. | Product wording varies between the two titles. Reuse the parent-owned source ID and URL; do not treat either full product title as a universal label. |
| Clover Leaf English [Solid White Tuna, Albacore in Broth and Oil](https://www.cloverleaf.ca/en/products/solid-white-tuna-albacore-in-broth-and-oil/) [S03] | The product page directly names canned albacore in broth and oil and describes a blend of vegetable broth and sunflower oil. | The product’s albacore species, solid presentation, ingredients and 75/25 broth-to-oil description apply to this SKU only. Its displayed drained nutrition basis is not a generic portion or yield. |
| Clover Leaf English [Chunk Light Tuna, Yellowfin in Broth and Oil](https://www.cloverleaf.ca/en/products/chunk-light-tuna-yellowfin-in-broth-and-oil/) [S04] | The page directly names a second canned product in broth and oil, made with yellowfin and chunk presentation. It describes a vegetable-broth/sunflower-oil blend. | Its yellowfin species, chunk presentation, ingredients and 72/28 description are SKU-specific; they are not shared form data. The page’s nutrition serving is not a generic measure. |
| Clover Leaf French [Thon blanc entier CLOVER LEAF®, Germon – bouillon de légumes et huile](https://www.cloverleaf.ca/fr/produits/thon-blanc-entier-clover-leaf-germon-bouillon-de-legumes-et-huile/) [S05] | The French product page directly supports the French broth-and-oil wording and describes the albacore product’s own vegetable-broth/oil blend. | Its `germon`, whole/solid presentation, ingredient list and formulation remain product-specific. It does not establish a universal French commodity name or measure. |
| Clover Leaf French [Thon pâle en morceaux Clover Leaf, à nageoires jaunes dans bouillon et huile](https://www.cloverleaf.ca/fr/produits/thon-pale-en-morceaux-clover-leaf-a-nageoires-jaunes-dans-bouillon-et-huile/) [S06] | The French page names a second tuna product `dans bouillon et huile` and describes it as canned in vegetable broth and vegetable oil. | Yellowfin, chunk presentation, ingredients and the page’s 72/28 blend remain specific to that SKU. Its serving basis does not transfer. |
| Metro Québec [Thon pâle à nageoires jaunes en morceaux dans bouillon et huile](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-pale-a-nageoires-jaunes-en-morceaux-dans-bouillon-et-huile/p/061362433219) [S07] | The current indexed Québec listing uses the French product title and displays its own ingredients and product number. | Direct opening returned HTTP 403 in this review. Use the indexed listing only for the item title and product-specific ingredient text; do not claim stock or availability. Its package amount is SKU-specific. |
| Metro Québec [Thon blanc germon entier dans bouillon et huile](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-blanc-germon-entier-dans-bouillon-et-huile/p/061362432106) [S08] | A second current indexed Québec listing pairs the French `bouillon et huile` phrase with a separate albacore product. | Direct opening returned HTTP 403. The listing is product-title and SKU-specific evidence only; its ingredients and package are not common form data. |

The two manufacturer product pairs establish that the combined packing-medium name occurs with different tuna species and presentations. They do **not** establish a shared broth recipe: one page describes a 75/25 vegetable-broth/sunflower-oil blend and the other 72/28. The proposed French display below is a clear descriptive app label formed from the active parent and the source wording. It is not represented as an OQLF-standardized name or a regulatory common name.

## Proposed form-only delta

If accepted, add one form under the current canned-tuna parent:

| Field | Proposed value |
|---|---|
| ID | `ingredient-form-canned-tuna-in-broth-and-oil` |
| Parent | `ingredient-ref-canned-tuna` |
| `formCode` | `canned_in_broth_and_oil` |
| English label | `canned tuna in broth and oil` |
| French label | `thon en conserve dans le bouillon et l’huile` |
| `prepState` | `canned_in_broth_and_oil` |
| English match terms | `tuna in broth and oil` |
| French match terms | `thon dans bouillon et huile` |
| Density | `null` |

The match terms use the concise manufacturer/retailer phrases. Do not add a new reference, a parent alias, the brand name, either product’s species or cut, `tuna in broth` / `thon dans le bouillon` as a separate match term, a water/oil/vegetable-broth alias, or a phrase implying one common formula. Keep the R790 water form and R802 olive-oil form unchanged.

This form represents tuna explicitly marketed in the combined broth-and-oil medium. It does not say the broth is always vegetable broth, the oil is always sunflower oil, the blend has one ratio, or the fish is always albacore or yellowfin. Keep plain water, olive-oil-only, oil-only products with another oil, broth-only, separately seasoned tuna, canned bonito, tuna salad/ready meals, and tuna pouches distinct. Do not attach the form to a species row.

If integrated, create a form-level ledger record with `recordType: ingredient_form`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Use S03–S08 and reuse R168-S01/S02 as family context without changing their source IDs or parent ownership. Add no measurement observation, density, unit mapping, conversion, yield, recipe link or substitution finding. Keep blend ratios, ingredient lists, product numbers, package weights and nutrition servings source-only.

## Exact ownership and archive audit

The post-R800–R802 package snapshot contains **1,883 ingredient references, 198 forms, 56 legacy candidates, 2,290 research-ledger records, 114 manifest-listed recipes, and 1,123 structured ingredient rows**.

| Exact owner or key checked | Current owner/result | Boundary |
|---|---|---|
| `ingredient-ref-canned-tuna` | Active `canned tuna / thon en conserve` parent. Its R168 ledger record remains parent-owned. | Keep the market parent and its source ownership unchanged. |
| `ingredient-form-canned-tuna-in-water` | Active water-packed form under the canned-tuna parent. | Keep separate; no water-to-broth conversion or substitution is proposed. |
| `ingredient-form-canned-tuna-in-olive-oil` | Active olive-oil form under the canned-tuna parent, added in R802. | Keep separate; the combined medium is not an olive-oil-only product. |
| Proposed `ingredient-form-canned-tuna-in-broth-and-oil`, form code, labels and match terms | No exact active reference/form, legacy candidate, or ledger record owns the proposed ID or complete phrase pair. | Proposal-local only; one form under the active parent. |
| `ingredient-ref-broth`, stock/bouillon references and related pantry identities | Existing separate broth, stock and bouillon references; none identifies canned tuna in broth and oil. | Do not reuse a broth ingredient identity for the canned fish product. Broad `broth`/`bouillon` searches remain multi-result. |
| Clover Leaf tuna family catalog URLs | The overall English/French tuna catalog URLs are already owned by `ingredient-ref-canned-tuna` as `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01` and `-S02`. R802-S01/S02 point to different olive-oil-specific catalog URLs. | Reuse the existing R168 S01/S02 as parent family context. Do not register the overall tuna catalog URLs again or move their source entries. |
| Direct Clover Leaf product pages S03–S06 and Metro Québec listing URLs S07–S08 | No exact URL owner in the active ledger or earlier proposal/batch archive. | Add each new URL only once if the form is later integrated. Direct Metro access was blocked; this limit is recorded above. |
| R805 source-ID prefix and audit label | No exact occurrence in the current ledger or the pre-existing proposal/batch archive. | All proposed R805 source IDs remain unallocated outside this proposal. |

Archive review found no prior dedicated canned-tuna-in-broth-and-oil form proposal or integration. R168 names broth/oil as one of several canned-tuna product presentations but created no form. R790 explicitly leaves the combined medium outside its water-only form. R802 adds olive oil only and explicitly says broth-and-oil products remain separate. The R800–R802 integration README contains no broth-and-oil form decision. Those are neighboring boundaries and historical mentions, not duplicate allocations.

## Picker impact

Projection follows the current phrase-first search and complete-form-hint rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The form adds no reference row. A complete proposed label or match term selects the form hint. Shorter terms can return the parent without a hint, so they do not assert that broth-only tuna is the combined broth-and-oil form.

| Query | Before | With proposed form | Effect |
|---|---|---|---|
| `canned tuna in broth and oil` | No result | `ingredient-ref-canned-tuna` with proposed form hint | Exact English display is selectable. |
| `tuna in broth and oil` | No result | `ingredient-ref-canned-tuna` with proposed form hint | Exact English family phrase is selectable. |
| `thon en conserve dans le bouillon et l’huile` | No result | `ingredient-ref-canned-tuna` with proposed form hint | Exact French display is selectable. |
| `thon dans bouillon et huile` | No result | `ingredient-ref-canned-tuna` with proposed form hint | Exact source-backed French match term is selectable. |
| `canned tuna in broth`; `tuna in broth`; `thon en conserve dans le bouillon` | No result | Canned-tuna parent, without a form hint | These are partial phrases inside the combined form label. The picker must not treat them as the full combined medium. |
| `broth`; `bouillon` | 5; 10 references | 6; 11 references, respectively | Both broad searches stay multi-result; the canned-tuna parent is an additional result without a form hint. |
| `broth and oil`; `bouillon et huile` | No result | Canned-tuna parent, without a form hint | A medium fragment finds the parent; the complete bilingual form phrase is needed for its hint. |
| `canned tuna`; `thon en conserve` | One canned-tuna parent each | Same one parent, no form hint | Parent searches remain unchanged. |
| `tuna`; `thon` | 9 references each | Same 9 each | No species identity or new reference is added. |
| `canned tuna in water`; `canned tuna in olive oil` | Existing water-form and olive-oil-form hints | Same existing results and hints | R790 and R802 choices remain distinct and unchanged. |

## Bundled recipe corpus

The manifest contains **114 recipes and 1,123 structured ingredient rows**. A read-only scan of every manifest-listed recipe found no canned-tuna, broth-and-oil tuna, or French phrase match and no row linked to `ingredient-ref-canned-tuna`. Recipe 111’s `tuna steak` is linked to the raw/unspecified tuna identity and is not canned tuna. Add no recipe link, recipe row, amount, method, or substitution. Manufacturer-site recipes using the Clover Leaf product are not part of the bundled user recipe corpus.

## Measures, scope and substitutions

- **Formula and species:** The paired pages name albacore and yellowfin products, with solid and chunk presentations and different blend ratios. Do not transfer either species, cut, oil, broth composition, or percentage to this form.
- **Packages and amounts:** Product-page and Metro package sizes and drained nutrition servings are SKU-specific. Add no reusable package measure, drained amount, density, conversion, or yield.
- **Preparation boundary:** Keep broth-and-oil distinct from broth-only, water, olive-oil-only, other oils, seasoned products, canned bonito, and ready-to-eat tuna salads or pouches.
- **Substitutions:** Neither the bundled recipes nor these product pages establish an equal-amount replacement between this form, canned tuna in water or olive oil, other tuna products, canned bonito, or other seafood. Add no global or contextual substitution, warning, or recipe-line substitution.

## Source register

Manufacturer pages were directly opened on 2026-10-19. Metro product pages returned HTTP 403 to direct opening; their indexed Québec listings were current during this review and are used only for product-title and product-specific listing evidence. R805 source IDs are proposal-local and unallocated. The overall `Tuna / Thon` catalog URLs remain parent-owned under `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01/S02`. R802’s `WP04-SECTIONP-CANNED-TUNA-OLIVE-OIL-FORM-R802-20261019-S01/S02` source entries point to separate olive-oil-specific catalog URLs. This proposal allocates no additional IDs for either catalog family.

| Source ID | Source and evidence | Ownership / limit |
|---|---|---|
| **Reused `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01`** | Clover Leaf, [Tuna product catalog](https://www.cloverleaf.ca/en/product/tuna/). | Existing parent-owned English catalog; currently lists albacore solid and yellowfin chunk products in broth and oil. Reuse its URL and ID. |
| **Reused `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S02`** | Clover Leaf, [Thon product catalog](https://www.cloverleaf.ca/fr/produit/thon/). | Existing parent-owned French catalog; lists the paired albacore and yellowfin products. Reuse its URL and ID. |
| **`WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-S03`** | Clover Leaf, [Solid White Tuna, Albacore in Broth and Oil](https://www.cloverleaf.ca/en/products/solid-white-tuna-albacore-in-broth-and-oil/). | New manufacturer URL; product title, medium and product-specific species/cut/formula. No generic measure. |
| **`WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-S04`** | Clover Leaf, [Chunk Light Tuna, Yellowfin in Broth and Oil](https://www.cloverleaf.ca/en/products/chunk-light-tuna-yellowfin-in-broth-and-oil/). | New manufacturer URL; second species/cut with the same marketed medium; formula and nutrition basis remain SKU-specific. |
| **`WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-S05`** | Clover Leaf, [Thon blanc entier CLOVER LEAF®, Germon – bouillon de légumes et huile](https://www.cloverleaf.ca/fr/produits/thon-blanc-entier-clover-leaf-germon-bouillon-de-legumes-et-huile/). | New French manufacturer URL; product-specific French name and albacore product description, not a universal label or formula. |
| **`WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-S06`** | Clover Leaf, [Thon pâle en morceaux Clover Leaf, à nageoires jaunes dans bouillon et huile](https://www.cloverleaf.ca/fr/produits/thon-pale-en-morceaux-clover-leaf-a-nageoires-jaunes-dans-bouillon-et-huile/). | New French manufacturer URL; product-specific French wording, yellowfin, chunk cut and formulation. |
| **`WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-S07`** | Metro Québec, [Thon pâle à nageoires jaunes en morceaux dans bouillon et huile](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-pale-a-nageoires-jaunes-en-morceaux-dans-bouillon-et-huile/p/061362433219). | New retailer URL; indexed listing supports the Québec product title and item wording. Direct opening returned 403; no availability claim. |
| **`WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-S08`** | Metro Québec, [Thon blanc germon entier dans bouillon et huile](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-blanc-germon-entier-dans-bouillon-et-huile/p/061362432106). | New retailer URL; indexed listing supports a second Québec product title. Direct opening returned 403; species/package information remains product-specific. |
| **`WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-R01`** | Read-only audit of the open Section P checklist, R800–R802 integration, active references/forms/legacy candidates/ledger sources, prior proposals/batches, `IngredientSearch.kt`, and all manifest-listed recipes/ingredient rows. | Proposal-local repository audit label; not a shared source or allocated record. Supports ownership, picker, and corpus statements above. |

## Final disposition

**Recommend integrating** one generic packing-medium form `canned tuna in broth and oil / thon en conserve dans le bouillon et l’huile` beneath `ingredient-ref-canned-tuna`. The manufacturer’s paired product pages establish the same explicit medium across two species and cuts, while current Québec retail wording supports local French relevance. Keep the form scoped to the combined marketed medium; do not transfer either SKU’s species, cut, formula, ratio, package or drained amount. Add no measure, density, conversion, yield, recipe link or substitution. Preserve the separate water and olive-oil forms and leave the full Section P checklist open.

## Integration status

**Integrated** on 2026-10-19 as `ingredient-form-canned-tuna-in-broth-and-oil` under `ingredient-ref-canned-tuna`. The form reuses parent-owned sources `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01/S02` and allocates `WP04-SECTIONP-CANNED-TUNA-BROTH-OIL-FORM-R805-20261019-S03` through `-S08` for the product-specific Clover Leaf and Metro pages. No measurement, density, mapping, conversion, yield, recipe link, or substitution was added; the existing water and olive-oil forms remain separate.

Static package/ledger validation, generated-index freshness, ownership, picker, corpus, encoding, link, and whitespace checks are recorded in the [R803–R805 integration README](../batches/wp02-wp03-wp04-r803-r805-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because this adds database JSON data under `AGENTS.md`.

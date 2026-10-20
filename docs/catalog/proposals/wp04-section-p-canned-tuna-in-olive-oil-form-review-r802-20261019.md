# WP04 Section P — canned tuna in olive oil form review (R802)

- **Review and source-access date:** 2026-10-19.
- **Open checklist:** [Section P fish and seafood preservation forms, line 8381](../../RecipeBook-global-ingredient-catalog-plan.txt#L8399), which includes oil-packed forms. The R802 child is checked in the plan; the broader preservation review remains open.
- **Recommendation:** Add one olive-oil-specific canned-tuna form under existing `ingredient-ref-canned-tuna`, proposed as `ingredient-form-canned-tuna-in-olive-oil`.
- **Scope:** Products explicitly marketed as canned tuna in olive oil. Keep this as a packing-medium form under the canned-tuna market group; do not assign a species, cut, flavor, formula, can amount, drained portion, or draining instruction from any one product.
- **Status:** Integrated on 2026-10-19 as `ingredient-form-canned-tuna-in-olive-oil`; ledger record uses the same ID. Shared sources S01–S04 were allocated, and the existing R168 Metro source was reused. No software tests, build, emulator, or deployment were run because this change only adds database JSON data under `AGENTS.md`.
- **Shared identifiers:** Form and ledger record `ingredient-form-canned-tuna-in-olive-oil`; sources `WP04-SECTIONP-CANNED-TUNA-OLIVE-OIL-FORM-R802-20261019-S01` through `-S04`. The audit label `WP04-SECTIONP-CANNED-TUNA-OLIVE-OIL-FORM-R802-20261019-R01` remains proposal-local.

## Why this is a distinct open gap

The current Section P preservation checklist names canned, oil-packed, and water-packed fish/seafood forms. R168 added the market-group identity `canned tuna / thon en conserve` but left packing medium product-specific. R790 then added only `canned tuna in water / thon en conserve dans l’eau` as a form and explicitly left tuna in oil or broth outside that change. R793 added the separate canned-salmon-in-water form. The completed R797–R799 integration added canned mackerel in tomato sauce as a finished-product identity; it does not cover tuna packing media. See the [R168 proposal](wp04-section-p-canned-tuna-product-boundary-review-r168-20261016.md), [R790 proposal](wp04-section-p-next-open-gap-review-r790-20261019.md), [R793 proposal](wp04-section-p-canned-salmon-in-water-form-review-r793-20261019.md), and [R797–R799 integration README](../batches/wp02-wp03-wp04-r797-r799-gap-review-integration-20261019/README.md).

Current Clover Leaf manufacturer pages show a distinct plain olive-oil canned-tuna line in English and French, alongside a separately chili-qualified product. Its direct product pages identify a specific skipjack product and its own presentation, ingredients, package, nutrition basis, and no-drain instruction. Metro Québec’s existing R168 source also names an olive-oil tuna listing. Together these establish a usable oil-medium form and a Québec-facing French phrase, while leaving those SKU details product-specific. The form proposed here is specifically **in olive oil**; it does not turn broth-and-oil products into olive-oil-only products or claim that all canned-tuna species share this presentation. [S01–S04; reused R168-S06]

## Current product evidence and limits

| Source | Evidence relevant to this form | Limit |
|---|---|---|
| Clover Leaf English [Tuna in Olive Oil catalogue](https://www.cloverleaf.ca/en/product/tuna-in-olive-oil/) [S01] | The manufacturer presents a current **Tuna in Olive Oil** category with plain **Flaked Light Tuna in Olive Oil** and **Solid Light Tuna – In Olive Oil**, as well as a separate chili-pepper tri-pack. The products are canned seafood. | The catalog is a manufacturer’s current product range, not evidence of one tuna species, cut, ingredient list, package size, or handling instruction shared by all products. The chili product is not used to establish the plain form’s product composition. |
| Clover Leaf French [Thon dans l’huile d’olive catalogue](https://www.cloverleaf.ca/fr/produit/thon-dans-lhuile-dolive/) [S02] | The manufacturer’s French category is **Thon dans l’huile d’olive** and separately lists plain light-tuna products and a product with chili. This supports the short Québec-facing search phrase and flavor boundary. | It does not standardize the longer app label or establish species, cut, formula, package, draining, or preparation behavior across the listed products. |
| Clover Leaf English [Flaked Light Tuna in Olive Oil](https://www.cloverleaf.ca/en/products/flaked-light-tuna-in-olive-oil/) [S03] | The product page names a current canned flaked-light-tuna product, states that it is skipjack, and lists skipjack, olive oil, and sea salt. It explicitly calls out this SKU’s can and nutrition basis and says the oil need not be drained. | Species, flaked cut, ingredients, 142 g can, 1/3-can (55 g) label serving, and no-drain wording apply to this SKU only; none transfers to the form. |
| Clover Leaf French [Thon pâle émietté dans l’huile d’olive](https://www.cloverleaf.ca/fr/produits/thon-pale-emiette-dans-lhuile-dolive/) [S04] | The paired French product page uses **Thon pâle émietté dans l’huile d’olive**, identifies skipjack, and lists olive oil and sea salt. It directly corroborates the French medium wording on a Canadian manufacturer page. | The same SKU-specific limits apply. Its net package, nutrition serving, named species and cut, and no-drain statement are not generic tuna-form data. |
| Metro Québec, [Selection Thon pâle entier dans l’huile d’olive](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-pale-entier-dans-l-huile-d-olive/p/059749933957) [reused R168-S06] | The existing parent-owned source names a Québec retailer product **Thon pâle entier dans l’huile d’olive** and lists skipjack, olive oil, and salt. The current indexed item preview repeats that title and ingredients. | Reuse R168-S06 and its URL; do not add a duplicate source. The live page returned a cache miss/403 on direct open in this review, so the preview is used only for product wording and its own ingredient statement, not availability. Its 85 g package is SKU-specific. |

The English and French form labels below are descriptive catalog labels built from the active parent `canned tuna / thon en conserve` and the manufacturer’s exact olive-oil phrases. The manufacturer’s shorter English and French category names are retained as source-backed form match terms. These are picker labels, not a claim that the app wording is a regulatory or OQLF-standardized commodity name.

## Proposed form-only delta

If accepted, add one form under the existing canned-tuna parent:

| Field | Proposed value |
|---|---|
| ID | `ingredient-form-canned-tuna-in-olive-oil` |
| Parent | `ingredient-ref-canned-tuna` |
| `formCode` | `canned_in_olive_oil` |
| English label | `canned tuna in olive oil` |
| French label | `thon en conserve dans l’huile d’olive` |
| `prepState` | `canned_in_olive_oil` |
| English match terms | `tuna in olive oil` |
| French match terms | `thon dans l’huile d’olive` |
| Density | `null` |

The match terms reproduce the exact manufacturer category phrases **Tuna in Olive Oil** and **Thon dans l’huile d’olive**. Do not add a reference, parent alias, product-brand alias, separate generic `canned tuna in oil` / `thon en conserve dans l’huile` match term, or a match term for a particular species or cut. The query `thon en conserve dans l’huile` is contained in the longer display label, so it returns the canned-tuna parent without a form hint. The exact manufacturer phrase `thon dans l’huile d’olive` is a form match term and selects the olive-oil form hint. Keep the existing water-packed form unchanged.

The proposed row represents only canned tuna marketed in olive oil. It does not say that the tuna must be skipjack, flaked, solid, or any other cut. It does not absorb separately named chili, jalapeño, chipotle, tomato, or other seasoned products as a plain product identity; the medium alone does not resolve their flavor. It also excludes products explicitly packed in broth and oil, water, or another medium, canned bonito, tuna salad or ready-meal kits, and pouch tuna. No manufacturer proportion, recipe, or nutrition value is shared by the proposed form.

For the form-level ledger record, use `recordType: ingredient_form`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Cite S01–S04 and reuse the parent’s existing R168-S06 source entry. Add no measurement observation, substitution finding, density, unit mapping, conversion, yield, or recipe link. In particular, keep the official product pages’ 85 g/142 g can sizes, 65 g drained serving, 55 g nutrition serving, and no-drain instruction source-only; they describe different named products and bases.

## Exact ownership and archive audit

The read-only snapshot after R799 integration contains **1,882 ingredient references, 197 forms, 56 legacy candidates, 2,288 ledger records, 114 manifest-listed recipes, and 1,123 structured ingredient rows**. The active reference is the species-neutral canned-tuna market group, and the existing canned-tuna form is the water-packed form from R790.

| Exact owner or key checked | Current owner/result | Boundary |
|---|---|---|
| `ingredient-ref-canned-tuna` | Active `canned tuna / thon en conserve`, category `PROTEIN`; its parent ledger record is verified and has researched-no-supported-value measurement/substitution states. | Keep this parent and its existing source ownership unchanged. |
| `ingredient-form-canned-tuna-in-water` | Active form under `ingredient-ref-canned-tuna`, `canned_in_water`, `canned tuna in water / thon en conserve dans l’eau`; its own verified ledger row is `researched_no_supported_value` and `researched_no_supported_substitute`. | Keep it separate; R802 adds only an olive-oil form. |
| `ingredient-form-canned-tuna-in-olive-oil`, proposed labels, match terms, and form code | No exact active form/reference name or alias, legacy candidate, or ledger-record owner. No exact allocation was found in focused Section P proposals/batches. | One proposed form ID; not an existing catalog value or reserved shared ID. |
| `ingredient-ref-olive-oil`; `ingredient-ref-extra-virgin-olive-oil`; `ingredient-ref-octopus-in-olive-oil` | Active pantry-oil references and a distinct octopus product identity. | Do not reclassify canned tuna as an olive-oil ingredient or reuse the octopus identity. Their presence means the broad `olive oil` picker query remains multi-result. |
| `ingredient-ref-katsuwonus-pelamis` and other tuna species | Active species identities, distinct from the canned-tuna product group. The reviewed manufacturer products name skipjack only. | Do not assign skipjack or another species to the proposed form or modify species rows. |
| R168 Metro source `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S06` | Already owned by `ingredient-ref-canned-tuna`; URL is the Québec Selection listing above. | Reuse this exact source ID and URL. Do not duplicate or move its owner. |
| New Clover Leaf S01–S04 URLs and R802 source prefix | No exact URL/source-ID owner in the current ledger or proposal/batch archive. | Register each new URL once only if the form is later integrated. R802 IDs remain unallocated. |

The focused history check found no earlier dedicated review or integration for a canned-tuna-in-olive-oil form. R168 explicitly listed `canned tuna in oil` and `tuna in olive oil` among phrases without an exact owner, then declined to add medium phrases as aliases or forms; this proposal resolves only the better-supported olive-oil phrase as a form. R790 reviewed tuna in water and explicitly left oil/broth products for separate work. R793 concerns canned salmon in water, while R799 covers the distinct canned-mackerel-in-tomato-sauce identity. The nearby R694 sardines-in-olive-oil hold concerns a different fish/product boundary; its smoked-sardine ambiguity is not transferable to tuna.

## Picker impact

Projection uses the current phrase-first matching and form-hint rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The proposed form adds only its two labels and two exact source-backed match terms; it does not create a reference row.

| Query | Before | With proposed form | Effect |
|---|---|---|---|
| `canned tuna in olive oil` | No result | `ingredient-ref-canned-tuna` with the proposed form hint | Exact English form query becomes selectable. |
| `tuna in olive oil` | No result | `ingredient-ref-canned-tuna` with the proposed form hint | Matches the manufacturer’s English family phrase. |
| `thon en conserve dans l’huile d’olive` | No result | `ingredient-ref-canned-tuna` with the proposed form hint | Exact French display query becomes selectable. |
| `thon dans l’huile d’olive` | No result | `ingredient-ref-canned-tuna` with the proposed form hint | Matches the manufacturer’s French family phrase. |
| `canned tuna`; `thon en conserve` | One result each: canned-tuna parent | Same parent, without selecting a form | Parent searches stay unchanged. |
| `tuna`; `thon` | 9 references each | Same 9 references each | No new identity or species result. |
| `olive oil`; `huile d’olive` | 3 references each, including the oil identities and octopus in olive oil | Those 3 plus canned-tuna parent: 4 each | Both remain multi-result. The parent is found through its form terms, but these short queries do not attach a form hint. |
| `thon en conserve dans l’huile` | No result | Canned-tuna parent, without form hint | This phrase is a prefix of the longer French display label; the complete olive-oil phrase is needed to select the form. |
| `canned tuna in oil` | No result | No result | Do not generalize the evidence for olive oil into every oil type. |
| `tuna in broth and oil` | No result | No result | Do not claim the distinct broth-and-oil products as olive-oil-only. |

## Bundled recipe corpus

The manifest lists **114** recipe JSON files and **1,123** structured ingredient rows. A read-only manifest-ordered scan found no complete recipe or ingredient-row match for canned tuna in olive oil, tuna in olive oil, or the reviewed French phrases, and no canned-tuna ingredient row. Recipe 111 has `1 tuna steak` linked to `ingredient-ref-tuna`; a separate row requests extra-virgin olive oil. It is not canned tuna and supplies no oil-packed tuna use, measure, method, or substitution context. Add no recipe link or ingredient-row change.

## Measures, species, and substitutions

- **Package and nutrition amounts:** The official pages show different source-specific packages and nutrition servings; Metro’s listing also has its own net package amount. Do not treat these as a common can size, drained yield, portion, or culinary measure. Add no observation, conversion, mapping, or yield.
- **Species and cut:** The pages identify skipjack in their named products, but do not establish skipjack as a universal property of canned tuna in olive oil. Keep species and solid/flaked presentation out of the form label and terms.
- **Oil and preparation boundary:** This proposal names olive oil specifically. Do not transfer the product title or state to water-packed tuna, broth-and-oil tuna, tuna packed in another oil, seasoned tuna products, ready meals, or pouches. Do not infer whether the oil should be drained from any product except its own label.
- **Substitutions:** No bundled recipe or source supports an equal-amount substitution between the form, water-packed tuna, broth-and-oil tuna, another tuna species/cut, canned bonito, or another fish. Add no global or contextual substitution, warning, or recipe-line link.

## Source register

Manufacturer pages were checked directly on 2026-10-19. R802 source IDs S01–S04 are allocated to the form ledger row. Reused R168-S06 retains its existing URL and parent ownership; it is also cited from the form record.

| Source ID | Source and evidence | Ownership / limit |
|---|---|---|
| **`WP04-SECTIONP-CANNED-TUNA-OLIVE-OIL-FORM-R802-20261019-S01`** | Clover Leaf, [Tuna in Olive Oil](https://www.cloverleaf.ca/en/product/tuna-in-olive-oil/) product catalogue. | New manufacturer URL. Lists plain flaked and solid products plus a separately chili-qualified tri-pack. Supports English market-family wording and boundary only; not species or common package/formula data. |
| **`WP04-SECTIONP-CANNED-TUNA-OLIVE-OIL-FORM-R802-20261019-S02`** | Clover Leaf, [Thon dans l’huile d’olive](https://www.cloverleaf.ca/fr/produit/thon-dans-lhuile-dolive/) product catalogue. | New manufacturer URL. Lists plain French olive-oil products plus a chili-qualified product; supports the exact French match term and flavor boundary. Does not establish a common formula or all-SKU scope. |
| **`WP04-SECTIONP-CANNED-TUNA-OLIVE-OIL-FORM-R802-20261019-S03`** | Clover Leaf, [Flaked Light Tuna in Olive Oil](https://www.cloverleaf.ca/en/products/flaked-light-tuna-in-olive-oil/). | New manufacturer URL. Direct page names the olive-oil canned product and its skipjack ingredient. The species, flaked cut, ingredients, can size, nutrition serving, and no-drain wording remain SKU-specific. |
| **`WP04-SECTIONP-CANNED-TUNA-OLIVE-OIL-FORM-R802-20261019-S04`** | Clover Leaf, [Thon pâle émietté dans l’huile d’olive](https://www.cloverleaf.ca/fr/produits/thon-pale-emiette-dans-lhuile-dolive/). | New manufacturer URL. Direct French product page supports Québec-facing wording and its own ingredient declaration; does not support a generic species, cut, measure, or draining instruction. |
| **Reused `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S06`** | Metro Québec, [Selection Thon pâle entier dans l’huile d’olive](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-pale-entier-dans-l-huile-d-olive/p/059749933957). | Existing owner: `ingredient-ref-canned-tuna`. Reuse the same source ID and URL; Metro’s direct page access was blocked by 403/cache miss during this pass. Search-result detail supports the title and ingredient list only. |
| **`WP04-SECTIONP-CANNED-TUNA-OLIVE-OIL-FORM-R802-20261019-R01`** | Read-only audit of the Section P checklist, live references/forms/legacy candidates/ledger/source ownership, R168/R790/R793/R799 decisions, `IngredientSearch.kt`, and all manifest-listed recipe JSON and ingredient rows. | Proposal-local audit label only; not an external source or a shared record ID. Supports the ownership, picker, and recipe-corpus statements above. |

## Final disposition

**Integrated** one `canned tuna in olive oil / thon en conserve dans l’huile d’olive` form under `ingredient-ref-canned-tuna`, with the exact manufacturer category match terms above. This is a specific missing packing-medium form after R790’s water-only addition. Keep it distinct from water, broth-and-oil, other oils, seasoned product variants, and canned mackerel in tomato sauce. Add no species assignment, package or kitchen measure, density, unit mapping, conversion, yield, recipe link, or substitution. The recipe bundle has no matching demand, and all amounts and handling directions remain product-specific.

# WP03 Section L — canned whole tomatoes form review

- **Reviewed:** 2026-10-15
- **Status:** integrated after coordinator review; see the [R128 integration record](../batches/wp03-section-l-canned-whole-tomatoes-form-integration-r128-20261015/README.md).
- **Scope:** one unresolved tomato presentation: whole tomatoes in a sealed canned product.
- **Recommendation:** add one `canned_whole` form under the existing generic `ingredient-ref-tomatoes`. Do not add a new whole-tomato reference, density, conversion, package yield, or global substitution. Keep the broader Section L checklist open.

## Exact open checklist and scope boundary

The active checklist is [`docs/RecipeBook-global-ingredient-catalog-plan.txt:9119`](../../RecipeBook-global-ingredient-catalog-plan.txt#L9182):

> [ ] Continue the Section L produce checklist, including unresolved tomato products, eggplant types,
>     kabocha/delicata, the gourds/okra boundary, and broader pepper review.

The related [`roadmap.md:286`](../../../roadmap.md#L286) still records the Section L produce follow-up as open. Requirements [`FR-7`](../../../Requirements.md#L375) calls for an exhaustive bilingual searchable ingredient reference list with aliases and linkable recipe lines. This review resolves only the catalog search/form boundary for canned whole tomatoes; it does not close the parent checklist.

“Whole” here is the canned presentation of a tomato product, not a cultivar identity and not a claim that fresh whole tomatoes require a separate reference. Do not activate the old `ingredient-ref-whole-tomatoes` legacy candidate as a second ingredient identity. Tomato paste and sauce remain separate identities; puree/pulp, passata, crushed, diced, sun-dried, and oil-packed products are outside this proposal.

## Audit snapshot and method

The live split seed package read for this proposal contained 1,476 ingredient references, 107 forms, and 114 manifest-listed recipes. SHA-256 at review time:

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,476 | `29e37608c1cc358dac5188798c18341076e262d9a3c7d17b0637d167f4a693b7` |
| `ingredient-forms.v1.json` | 107 | `5d44b5f05c77df422396ba6f4de7b2284aa6426d2f2a2c508070f8f9e50008b2` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/research-ledger.v1.json` | 1,819 records; 7,533 source entries; 6,406 distinct source IDs | `43c13ecd89d4818f292ccfb3d2a9ad35567c95b98ea57ee1527c36f11a8e0870` |

The recipe audit read every manifest-listed recipe and all 1,123 ingredient rows. The catalog audit read all active references and forms, the research ledger, the legacy-candidate archive, relevant prior proposals/batches, and the picker implementation in `IngredientSearch.kt`. Before drafting this file, I scanned the ledger and all catalog proposals/batches/archive documents for the proposed `WP03-L-TOMATO-WHOLE-20261015-S01`–`S10` IDs; none were already assigned. Existing CFIA IDs are cited under their original IDs and are not reissued here.

## Existing catalog, ledger, and prior-review boundary

The active generic row is `ingredient-ref-tomatoes` (`tomates` / `tomatoes`), with aliases `grosses tomates`, `tomate`, and `tomato`; density is null and mappings are empty. Cherry and plum tomato identities are separate. Tomato juice, paste, sauce, passata, ketchup, and green-tomato ketchup are also separate active products. No new identity or alias is needed for the proposed form.

The only active tomato form is `ingredient-form-tomatoes-canned-diced`. Its exact labels are `tomates en dés en conserve` / `canned diced tomatoes`; its match terms include broad `tomates en conserve` / `canned tomatoes` and narrower `tomates en dés` / `diced tomatoes`. It already represents recipe `034#8`; this proposal does not edit or replace that form.

Ledger boundaries:

- The existing canned-diced form record is verified but has no measurement or substitution research yet; its original evidence is `WP03-TC-20261009-S04` and `WP03-TC-20261009-S05`.
- The generic tomato record already has a CNF 2026 observation of **182 g for one raw red-ripe whole tomato, 7.6 cm diameter**. This is a source-specific raw count portion. It is excluded from this canned-product review and must not be transferred to canned tomatoes or read as a general density/conversion.
- The inactive legacy file contains `ingredient-ref-whole-tomatoes` (`tomates entières` / `whole tomatoes`) as an unreviewed candidate. It has a source-less ledger candidate record. `ingredient-ref-crushed-tomatoes` and `ingredient-ref-diced-tomatoes` are also legacy candidates. These are not active picker identities.

Prior work checked:

- [`wp03-tomato-cucurbit-coordinator-review-20261009.md`](wp03-tomato-cucurbit-coordinator-review-20261009.md) recommended forms under generic tomatoes and said not to add whole/crushed forms without a direct product or recipe need. This review supplies a Canadian direct-product example for whole tomatoes and fresh product-category evidence; it does not propose a cross-product mapping.
- [`wp03-tomato-cucurbit-identity-integration-20261009/README.md`](../batches/wp03-tomato-cucurbit-identity-integration-20261009/README.md) integrated the exact canned-diced form for recipe 034#8 and left whole/crushed/puree/passata/sun-dried/oil-packed products open.
- The WP04 tomato-paste package proposal and WP05 cooking-sauce/passata and ketchup proposals/batches were checked. They cover paste package wording, sauce/passata, and ketchup respectively; none resolves canned whole tomatoes. The optional diced-tomato text in recipe 090 is specific to that sauce recipe and is not a whole-tomato substitute rule.

## Bundled recipe demand

There are five tomato-related ingredient rows in the full bundled corpus; none names canned whole tomatoes.

| Recipe row | Current line and link | Relevance |
|---|---|---|
| `034#8` | `798 ml canned diced tomatoes`; generic tomato + `ingredient-form-tomatoes-canned-diced` | Exact diced canned state is already modeled. |
| `078#12` | `2 tbsp tomato paste`; tomato-paste identity | Outside this form. |
| `086#12` | `156 ml tomato paste`; tomato-paste identity | Outside this form; volume is not a mass/density observation. |
| `090#1` | `1 cup tomato sauce`; tomato-sauce identity | Outside this form. The recipe-specific optional diced alternative does not establish a global substitution. |
| `096#1` | `4 large tomatoes, diced`; generic tomato, no canned form | The line does not say canned; no canning state is inferred. |

This proposal adds no recipe link. The justification is the still-open Section L product checklist plus Canadian regulatory/market evidence, not direct bundled-recipe demand. This corpus audit is limited to the currently bundled 114 recipes.

## Current picker behavior and projected form hint

`IngredientSearch.kt` normalizes case, accents, ligatures, and punctuation; an exact form phrase takes priority, then complete word-phrase matches across references and forms, then a substring fallback. A form hint is returned only if the full query exactly matches one form term under that reference.

Current behavior for canned whole phrases is no result: `whole tomatoes`, `whole canned tomatoes`, `canned whole tomatoes`, `tomates entières`, and `tomates entières en conserve` do not match an active reference/form. Broad `canned tomatoes` and `tomates en conserve` return generic tomatoes with the canned-diced hint, even though those phrases alone do not say diced.

With the proposed form terms below, the projection is:

| Query | Projected result | Form hint |
|---|---|---|
| `canned whole tomatoes`, `whole canned tomatoes` | `ingredient-ref-tomatoes` | `ingredient-form-tomatoes-canned-whole` |
| `whole tomatoes` | `ingredient-ref-tomatoes` | none; the query does not specify canned state |
| `tomates entières en conserve` | `ingredient-ref-tomatoes` | `ingredient-form-tomatoes-canned-whole` |
| `tomates entières` | `ingredient-ref-tomatoes` | none; the query does not specify canned state |
| `canned tomatoes`, `tomates en conserve` | `ingredient-ref-tomatoes` | none: both canned-diced and canned-whole forms share the broad phrase |
| `tomato`, `tomate`, `tomates` | Existing result set | unchanged; the added form belongs to the same generic reference |

The broad terms are intentionally shared with the current diced form. That changes the exact canned hint from an unjustified diced hint to an ambiguous/no hint while preserving the generic tomato result. The specific whole phrases provide the exact form hint. The form does not create a duplicate picker identity.

## Evidence and limits

All new sources below were accessed on **2026-10-15**. The two existing CFIA sources were rechecked on that date but retain their original ledger IDs and original `accessedOn` date of 2026-10-09.

| Proposal-local ID | Source and locator | Supports; does not support |
|---|---|---|
| **WP03-L-TOMATO-WHOLE-20261015-S01** | CFIA, [Canadian Grade Compendium, Volume 3](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-3), §47. | Names whole, whole-and-pieces, wedges, sliced, diced, and chopped tomatoes in hermetically sealed packages. Defines “whole” separately from “almost whole.” This is a regulatory grade/presentation source, not a recipe conversion and not a claim that every whole-tomato product is graded “Canada Fancy Whole.” |
| **WP03-L-TOMATO-WHOLE-20261015-S02** | Health Canada, [Eight canned foods to keep on hand](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/eight-canned-foods-keep-hand.html), “Tomatoes” (page details 2026-03-31). | Explicitly discusses crushed, diced, or whole canned tomatoes in the context of quick tomato sauce. It describes use context, not interchangeability, equal amounts, or a substitution rule. |
| **WP03-L-TOMATO-WHOLE-20261015-S03** | Conagra Brands Canada, [Aylmer tomatoes](https://www.conagrabrands.ca/en/brands/aylmer), product headings for whole, diced, and crushed tomatoes. | A Canadian manufacturer markets separate whole, diced, and crushed products, with 796 mL sizes shown. Product/brand range evidence, not a universal formula or package-mass source. |
| **WP03-L-TOMATO-WHOLE-20261015-S04** | Metro, [Aylmer Whole Tomatoes, product 058807665502](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/tomatoes-paste/whole-tomatoes/p/058807665502). | Canadian retailer lists a whole-tomato product, 796 mL, Product of Canada, and a declared ingredient list. A net volume, 125 mL nutrition serving, and ingredient list do not state net mass, bulk density, drained yield, or mass/volume conversion. |
| **WP03-L-TOMATO-WHOLE-20261015-S05** | Metro Québec French listing, [Tomates entières Aylmer](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/tomates-et-pates-de-tomates/tomates-entieres/p/058807665502), same product number. | The French listing/search record names `Tomates entières Aylmer`, 796 mL, code 058807665502. Direct page retrieval redirected to the English page during this review; the French indexed listing supports the displayed wording, but its full French page could not be inspected directly. |
| **WP03-L-TOMATO-WHOLE-20261015-S06** | OQLF, GDT, [conserve](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8875582/conserve). | Supports the Québec French term `conserve` / `aliment en conserve` for canned food generally. It is not tomato-specific and does not independently prescribe the entire compound label. |
| **WP03-L-TOMATO-WHOLE-20261015-S07** | RICARDO, [Tomates entières en conserve](https://www.ricardocuisine.com/recettes/9021-tomates-entieres-en-conserve). | Supplies the exact Québec-facing French wording `tomates entières en conserve` in a home-canning recipe. It is recipe content, not a commercial product standard; its jar quantities are not used as density, yield, or conversion evidence. |
| **WP03-L-TOMATO-WHOLE-20261015-S08** | Canadian Living, [Homemade Bolognese Sauce](https://www.canadianliving.com/food/dressings-sauces/recipe/homemade-bolognese-sauce), published 2023-01-16. | One recipe uses canned whole plum tomatoes and hand-crushes them; it also lists a separate can of crushed tomatoes. This is a recipe-specific handling example, scoped to plum tomatoes, not proof that whole and crushed products are globally interchangeable. |
| **WP03-L-TOMATO-WHOLE-20261015-S09** | RICARDO, [Salsa mexicaine traditionnelle](https://www.ricardocuisine.com/recettes/64-salsa-mexicaine-traditionnelle). | In this salsa only, the recipe permits canned Italian tomatoes when fresh Italian tomatoes are out of season and prefers fresh when available. The recipe is scoped to Italian tomatoes and adjusts its own seasoning; it does not justify a generic canned-whole-to-fresh substitution. |
| **WP03-L-TOMATO-WHOLE-20261015-S10** | Health Canada, [Home canning safety](https://www.canada.ca/en/health-canada/services/general-food-safety-tips/home-canning-safety.html). | Warns that changing ingredients in tested home-preservation recipes can change safety/processing. This is a preservation-safety boundary, not guidance for substituting tomatoes in ordinary cooking. |

Existing source IDs reused for identity/form boundaries (not proposal-local IDs):

- **WP03-TC-20261009-S04**, CFIA, [Normes d’identité canadiennes, Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), §§31–37; original access 2026-10-09, rechecked 2026-10-15. Section 31 groups heat-processed tomato products with whole, almost whole, large pieces, wedges, slices, diced, and chopped presentations, while §§34–37 separately describe purée, pulp, paste, and concentrated paste. It supports the product/form boundary, not kitchen density or conversion.
- **WP03-TC-20261009-S05**, CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 10 §§10.2.4–10.2.8; original access 2026-10-09, rechecked 2026-10-15. It keeps canned tomatoes, purée, pulp, and paste separate; regulatory composition/solids criteria are not a kitchen density or substitution ratio.

## Preparation, measures, and substitutes

The named state is `canned_whole`: a whole tomato presentation in a canned/heat-processed tomato product. CFIA describes whole separately from almost whole; the active catalog does not need an `almost_whole` alias or form to represent this proposal. Do not add `peeled`, `packed in juice`, salt-level, cultivar, or brand as universal properties; those depend on a product or recipe.

No numeric value is supported. The product pages' 796 mL package label and 125 mL nutrition serving do not supply corresponding mass. The raw CNF 182 g count observation applies only to a raw red-ripe tomato of the stated diameter. Add no density, unit mapping, can-to-ml rule, package yield, drained-solids conversion, or count weight.

No global substitute is supported. The recipe examples in S08 and S09 show that cooks may crush whole canned plum/Italian tomatoes for one dish or use canned Italian tomatoes for fresh Italian tomatoes in one seasonal salsa context. They preserve method, cultivar, dish, and seasoning conditions and cannot be transferred to an arbitrary recipe line. Do not activate whole-to-crushed, whole-to-diced, canned-to-fresh, or fresh-to-canned rules. Do not apply S10's preservation-safety requirements as ordinary cooking advice.

## Decision and exact proposed JSON delta

**Add** `ingredient-form-tomatoes-canned-whole` under the existing generic tomato reference. The Canadian standard defines whole as a presentation within canned processed tomatoes, current Canadian retail/manufacturer sources show the product, and Québec-facing usage supports the exact French display. The currently missing picker result is useful for this explicit open checklist item. The whole identity is not promoted from the legacy file; it is represented as the form of the already active tomato ingredient. The coordinator keeps unqualified `whole tomatoes` / `tomates entières` on the generic tomato reference so those searches do not imply that the user meant a canned product.

The accepted form object in `ingredient-forms.v1.json` (Unicode escapes shown for the French text, per bundled JSON convention) is:

```json
{
  "id": "ingredient-form-tomatoes-canned-whole",
  "ingredientRefId": "ingredient-ref-tomatoes",
  "formCode": "canned_whole",
  "labelFr": "tomates enti\u00e8res en conserve",
  "labelEn": "canned whole tomatoes",
  "prepState": "canned_whole",
  "matchTermsFr": [
    "tomates en conserve"
  ],
  "matchTermsEn": [
    "canned tomatoes",
    "whole canned tomatoes"
  ],
  "densityGPerMl": null,
  "notesFr": "Forme de pr\u00e9sentation enti\u00e8re d'un produit de tomates transform\u00e9 en conserve. Les normes canadiennes distinguent tomate enti\u00e8re et tomate presque enti\u00e8re; cette forme ne pr\u00e9cise pas la marque, la vari\u00e9t\u00e9 ni le liquide d'emballage. Aucune densit\u00e9, conversion, mesure de rendement ou substitution n'est \u00e9tablie.",
  "notesEn": "Whole presentation of a canned processed tomato product. Canadian standards distinguish whole from almost whole tomatoes; this form does not specify brand, cultivar, or packing liquid. No density, conversion, yield measure, or substitution is established.",
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

The accepted ledger record adds no measurement observation and records that research found no supported global substitute. Proposal-local source IDs are used exactly as assigned above; the two prior CFIA IDs remain their existing IDs.

```json
{
  "recordId": "ingredient-form-tomatoes-canned-whole",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S01","url":"https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-3","title":"Canadian Food Inspection Agency, Canadian Grade Compendium, Volume 3","accessedOn":"2026-10-15","locator":"Section 47, whole and almost-whole tomatoes in hermetically sealed packages.","supports":"Defines whole and almost whole as separate tomato presentations and lists the whole presentation in a sealed-package grade section; it is not a kitchen measure or universal product formula.","sourceKind":"regional_authority"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S02","url":"https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/eight-canned-foods-keep-hand.html","title":"Health Canada, Eight canned foods to keep on hand","versionOrDate":"Page details 2026-03-31","accessedOn":"2026-10-15","locator":"Tomatoes section.","supports":"Mentions crushed, diced, and whole canned tomatoes in quick-sauce context; does not establish that they are interchangeable.","sourceKind":"regional_authority"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S03","url":"https://www.conagrabrands.ca/en/brands/aylmer","title":"Conagra Brands Canada, Aylmer tomatoes","accessedOn":"2026-10-15","locator":"Separate product headings for Aylmer Whole Tomatoes, Diced Tomatoes, and Crushed Tomatoes; sizes shown.","supports":"Canadian manufacturer market evidence for separately named whole, diced, and crushed products. Product range only; no generic formula or mass-volume conversion.","sourceKind":"manufacturer"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S04","url":"https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/tomatoes-paste/whole-tomatoes/p/058807665502","title":"Metro, Aylmer Whole Tomatoes","accessedOn":"2026-10-15","locator":"Product 058807665502, product title, declared package size, and ingredient list.","supports":"One Canadian retail whole-tomato canned product listing at 796 mL. Does not give net mass, density, or drained yield.","sourceKind":"other"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S05","url":"https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/tomates-et-pates-de-tomates/tomates-entieres/p/058807665502","title":"Metro Québec, Tomates entières Aylmer","accessedOn":"2026-10-15","locator":"French indexed product listing for code 058807665502; direct open redirected to English page.","supports":"Québec French product listing uses Tomates entières for the same 796 mL SKU; the French page's full content was not directly available in this review.","sourceKind":"other"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S06","url":"https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8875582/conserve","title":"Office québécois de la langue française, conserve (GDT)","accessedOn":"2026-10-15","locator":"French term and definition for conserve / aliment en conserve.","supports":"Supports the Québec French canned-food vocabulary generally, not a tomato-specific compound term.","sourceKind":"regional_authority"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S07","url":"https://www.ricardocuisine.com/recettes/9021-tomates-entieres-en-conserve","title":"RICARDO, Tomates entières en conserve","accessedOn":"2026-10-15","locator":"Recipe title and home-canning method.","supports":"Exact Québec-facing French wording in a recipe; not a commercial product specification, density, or transferable package yield.","sourceKind":"culinary_reference"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S08","url":"https://www.canadianliving.com/food/dressings-sauces/recipe/homemade-bolognese-sauce","title":"Canadian Living, Homemade Bolognese Sauce","versionOrDate":"2023-01-16","accessedOn":"2026-10-15","locator":"Ingredient list and method for canned whole plum tomatoes and crushed tomatoes.","supports":"One recipe hand-crushes canned whole plum tomatoes and separately lists canned crushed tomatoes; not a global substitution.","sourceKind":"culinary_reference"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S09","url":"https://www.ricardocuisine.com/recettes/64-salsa-mexicaine-traditionnelle","title":"RICARDO, Salsa mexicaine traditionnelle","accessedOn":"2026-10-15","locator":"Recipe note on canned Italian tomatoes as an off-season alternative to fresh Italian tomatoes.","supports":"One dish-specific, variety-scoped canned/fresh option; the recipe prefers fresh tomatoes and does not establish a generic conversion.","sourceKind":"culinary_reference"},
    {"sourceId":"WP03-L-TOMATO-WHOLE-20261015-S10","url":"https://www.canada.ca/en/health-canada/services/general-food-safety-tips/home-canning-safety.html","title":"Health Canada, Home canning safety","accessedOn":"2026-10-15","locator":"Instructions on tested home-canning recipes and ingredient changes.","supports":"Warns that changing ingredients in home-preservation recipes can affect safety/processing; it is not everyday cooking substitution advice.","sourceKind":"regional_authority"},
    {"sourceId":"WP03-TC-20261009-S04","url":"https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4","title":"Agence canadienne d’inspection des aliments, Normes d’identité canadiennes, Volume 4","accessedOn":"2026-10-09","locator":"Sections 31–37, tomato product standard and presentations; rechecked 2026-10-15.","supports":"Places whole and cut presentations under the heat-processed tomato product standard and separates purée, pulp, paste, and concentrated paste; no kitchen conversion.","sourceKind":"regional_authority"},
    {"sourceId":"WP03-TC-20261009-S05","url":"https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0","title":"Canadian Food Inspection Agency, Canadian Food Compositional Standards","accessedOn":"2026-10-09","locator":"Volume 10, sections 10.2.4–10.2.8; rechecked 2026-10-15.","supports":"Separates canned tomatoes, purée, pulp, and paste; regulatory composition criteria are not kitchen densities or substitution ratios.","sourceKind":"regional_authority"}
  ],
  "substitutionFindings": [
    {
      "findingId": "ingredient-form-tomatoes-canned-whole-substitution-review-20261015",
      "researchState": "researched_no_supported_substitute",
      "fromIngredientRefId": "ingredient-ref-tomatoes",
      "fromFormId": "ingredient-form-tomatoes-canned-whole",
      "replacements": [],
      "context": "Global culinary substitution review for canned whole tomatoes; recipe-specific whole/crushed and canned/fresh usages were inspected separately.",
      "basis": "Health Canada describes whole, crushed, and diced canned tomatoes as useful in related sauce contexts but gives no exchange rule. The reviewed recipes retain dish, tomato-type, method, or seasonal conditions.",
      "limitations": ["No global canned-whole-to-crushed, canned-whole-to-diced, or canned-to-fresh rule is established.","Home-canning preservation substitutions require tested-recipe safety guidance and are outside ordinary culinary substitution."],
      "sourceIds": ["WP03-L-TOMATO-WHOLE-20261015-S02","WP03-L-TOMATO-WHOLE-20261015-S08","WP03-L-TOMATO-WHOLE-20261015-S09","WP03-L-TOMATO-WHOLE-20261015-S10"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add canned whole as a presentation form under generic tomatoes. Canadian product standards and Canadian/Québec product naming support the boundary and bilingual labels. Keep broad canned phrases ambiguous with canned diced; add no measure, mapping, yield, conversion, or global substitution.",
      "sourceIds": ["WP03-L-TOMATO-WHOLE-20261015-S01","WP03-L-TOMATO-WHOLE-20261015-S03","WP03-L-TOMATO-WHOLE-20261015-S04","WP03-L-TOMATO-WHOLE-20261015-S05","WP03-L-TOMATO-WHOLE-20261015-S07","WP03-TC-20261009-S04","WP03-TC-20261009-S05"]
    }
  ]
}
```

The coordinator marked the inactive `ingredient-ref-whole-tomatoes` ledger candidate as merged into this form and removed that obsolete reference candidate from `legacy-import-identities.v1.json`; it is not an active standalone reference. Keep `ingredient-ref-crushed-tomatoes` and `ingredient-ref-diced-tomatoes` pending their own decisions. No bundled recipe row or recipe index changed.

## Coordinator picker decision

The matcher returns a unique exact form phrase as a form hint. Because `whole tomatoes` and `tomates entières` do not state that the product is canned, the coordinator placed those phrases on the generic tomato reference and removed them from the form's match terms. They return the generic identity without a form hint. Explicit canned-whole terms still select the form. Broad `canned tomatoes` / `tomates en conserve` terms remain shared with the canned-diced form and therefore produce no unique form hint.

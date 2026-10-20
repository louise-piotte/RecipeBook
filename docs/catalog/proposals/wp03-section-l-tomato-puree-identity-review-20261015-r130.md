# WP03 Section L — tomato purée product review

- **Reviewed:** 2026-10-15
- **Status:** accepted and integrated into the shared ingredient references and research ledger; no recipe or form data changed. Database JSON additions require no tests under the current `AGENTS.md` rule.
- **Scope:** the still-open tomato-purée product item after canned diced, canned whole, and canned crushed tomatoes.
- **Accepted decision:** add one identity-only reference for `tomato purée / purée de tomates`. Keep passata, tomato pulp, paste, sauce, and canned tomato cuts separate. Add no form, measurement, mapping, recipe link, yield, conversion, or substitution.

## Open checklist and decision boundary

The exact Section L checklist remains open at [`docs/RecipeBook-global-ingredient-catalog-plan.txt:9147`](../../RecipeBook-global-ingredient-catalog-plan.txt#L9210):

> [ ] Continue the Section L produce checklist, including unresolved tomato products, eggplant types,
>     kabocha/delicata, the gourds/okra boundary, and broader pepper review.

The roadmap also leaves the Section L produce sweep open at [`roadmap.md:286`](../../../roadmap.md#L286). Requirements [`FR-7`](../../../Requirements.md#L375) asks for searchable bilingual ingredient references and linkable recipe lines. This review resolves only the tomato-purée product item; the Section L checklist itself remains open.

OQLF's preferred Québec French term is `purée de tomates`; its English terms are `tomato purée` and `tomato puree`. The Canadian standards treat tomato purée as a named processed-tomato product, separately from canned whole/cut tomatoes, tomato pulp, tomato paste, and concentrated paste. A current Canadian foodservice supplier also markets a canned product with the exact bilingual names `Canned Tomato Purée` and `Purée de tomates en conserve`. These sources support a separate product identity, not a new form under fresh generic tomatoes.

The active passata identity remains separate. One manufacturer's general passata page also describes that specific product as tomato purée, so this proposal does **not** claim that all market uses of “tomato purée” are disjoint from passata. Do not add `passata` or plain `coulis` as aliases to the proposed identity, and do not treat the source-specific descriptor as a universal crosswalk.

## Audit snapshot and method

At the proposal snapshot, the split bundled package contained 1,477 references, 109 forms, and 114 manifest-listed recipes. The research ledger contained 1,822 records, 7,571 source entries, and 6,429 distinct source IDs; the legacy archive contained 61 candidates.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,477 | `5cd5bbff3e386b4f3340ba1c29d1a6909bfdc5a319990cdbcdc618b137e5d325` |
| `ingredient-forms.v1.json` | 109 | `68ce05d92d023878c8453da7c6e70add04e90e3ccd43703cc6665c6c61ee42ab` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 1,822 records | `9d4e53676741668c6e5341c782350561fd36b8f99dc77c36a78283bbc0ebf310` |
| `legacy-import-identities.v1.json` | 61 candidates | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |

The review inspected the live ingredient-reference and form arrays, all tomato-related ledger records, legacy candidates, the Section L checklist, the earlier WP03 tomato coordinator review and integration, R128/R129 whole/crushed proposal and integration records, the WP05 passata review and integration, the WP04 tomato-paste review and package integration, the picker search implementation, and all 114 manifest recipe files / 1,123 ingredient rows. No active reference, form, or legacy candidate currently owns `tomato purée` / `purée de tomates`; `ingredient-ref-passata` is active and remains a neighboring product. The proposed R130 source IDs `WP03-L-TOMATO-PUREE-20261015-R130-S01`–`S05` were absent from the ledger, proposals, batches, and legacy archive before this file was written. Earlier IDs for OQLF and CFIA are reused as noted below.

## Current catalog and prior decisions

Current tomato product references include:

- `ingredient-ref-tomatoes` — `tomates / tomatoes`, with no default density and no unit mappings. Its active ledger holds a 182 g source-specific portion for a raw red-ripe whole tomato of 7.6 cm diameter; that value is unrelated to purée and is not reused.
- `ingredient-ref-tomato-paste` — `pâte de tomates / tomato paste`.
- `ingredient-ref-tomato-sauce` — `sauce tomate / tomato sauce`, with its measurement state blocked pending sourced evidence.
- `ingredient-ref-passata` — `coulis de tomates (passata) / passata`, identity verified but no form, measurements, conversions, yields, substitutions, or recipe links.
- `ingredient-ref-tomato-juice` — `jus de tomates / tomato juice`.
- Separate cherry and plum tomato references, plus distinct ketchup references.

The active forms under generic tomatoes are `ingredient-form-tomatoes-canned-diced`, `ingredient-form-tomatoes-canned-whole`, and `ingredient-form-tomatoes-canned-crushed`. They cover specific canned presentations, not tomato purée. No tomato-purée legacy row exists; the remaining `ingredient-ref-diced-tomatoes` legacy item is already covered by the canned-diced form and is outside this review.

Prior reviews and integration records checked:

- [`wp03-tomato-cucurbit-coordinator-review-20261009.md`](wp03-tomato-cucurbit-coordinator-review-20261009.md) lists tomato purée as a separate open product, cites OQLF and CFIA, and recommends an identity or expressly named form according to the product/form boundary. It says not to alias purée to paste, pulp, sauce, or passata and records no bundled tomato-purée recipe demand.
- [`wp03-tomato-cucurbit-identity-integration-20261009/README.md`](../batches/wp03-tomato-cucurbit-identity-integration-20261009/README.md) left purée and passata products open while resolving tomato paste separately.
- [`wp03-section-l-tomato-product-gap-review-20261015-r128.md`](wp03-section-l-tomato-product-gap-review-20261015-r128.md) and the [R128 canned-whole integration](../batches/wp03-section-l-canned-whole-tomatoes-form-integration-r128-20261015/README.md) added the canned-whole form and kept processed tomato products separate.
- [`wp03-section-l-canned-crushed-tomatoes-review-20261015-r129.md`](wp03-section-l-canned-crushed-tomatoes-review-20261015-r129.md) and the [R129 canned-crushed integration](../batches/wp03-section-l-canned-crushed-tomatoes-form-integration-r129-20261015/README.md) added the canned-crushed form, explicitly leaving purée and passata distinct.
- [`wp05-cooking-sauces-exact-recipe-demand-review-20261010.md`](wp05-cooking-sauces-exact-recipe-demand-review-20261010.md) and its integration accept passata as an identity named from Canadian product evidence. They keep it separate from purée, pulp, paste, sauce, and diced tomatoes; plain `coulis` is too broad to use as a passata alias.
- [`wp04-tomato-paste-recipe-package-amount-review-20261010.md`](wp04-tomato-paste-recipe-package-amount-review-20261010.md) and the package-amount integration concern a recipe-specific tomato-paste can only. They do not resolve tomato purée.

No prior proposal or batch found in the catalog tree reviews or integrates this exact tomato-purée identity.

## Bundled recipe-demand audit

Every manifest-listed recipe was parsed and every ingredient row scanned: **114 recipes, 1,123 rows**. There are five tomato-related rows and no tomato-purée or passata line:

| Row | Ingredient text | Current link | Finding |
|---|---|---|---|
| `034#8` | `798 ml canned diced tomatoes` | Generic tomatoes + `ingredient-form-tomatoes-canned-diced` | Existing canned-diced form; no purée. |
| `078#12` | `2 tbsp tomato paste` | Tomato-paste reference | Separate product. |
| `086#12` | `156 ml tomato paste` | Tomato-paste reference | Separate product and an existing recipe-specific package fact. |
| `090#1` | `1 cup tomato sauce` | Tomato-sauce reference | Separate product; its optional diced-tomato note remains recipe-local. |
| `096#1` | `4 large tomatoes, diced` | Generic tomatoes | Fresh-tomato wording; no preserved or puréed state is inferred. |

Other corpus lines contain strawberry or mango purée wording but are not tomato demand and remain linked to their fruit identities. The Canadian retail recipe cited below uses tomato purée and canned diced tomatoes in one soup, but does not propose an exchange between them. This identity addition is supported by the open catalog product sweep and standardized/Canadian product naming, not by bundled recipe frequency.

## Picker behavior and projected results

`IngredientSearch.kt` indexes reference names/aliases and attached form labels/terms. It checks an exact normalized form phrase first, then a complete word phrase, then a substring; a form hint is returned only for one exact form term.

Current searches:

| Query | Current result | Form hint |
|---|---|---|
| `tomato puree`, `tomato purée`, `purée de tomates`, `purée de tomates en conserve` | No result | None |
| `passata`, `coulis de tomates (passata)` | `ingredient-ref-passata` | None |
| `tomato paste` / `pâte de tomates` | `ingredient-ref-tomato-paste` | None |
| `tomato sauce` / `sauce tomate` | `ingredient-ref-tomato-sauce` | None |

With the proposed reference, the English and French purée phrases (including the canned aliases) return `ingredient-ref-tomato-puree`, with no form hint because the product is modeled as its own standardized reference. `passata` continues to return `ingredient-ref-passata`; no passata/coulis alias is added to purée. Broad `tomato` search gains the new tomato product among its existing product results. The proposal does not alter whole, crushed, or diced picker behavior.

## Evidence and limits

New sources were accessed or rechecked on 2026-10-15. Existing source IDs are marked reused and are not assigned again.

| Source ID | Evidence | Supports; limit |
|---|---|---|
| **WP03-TC-20261009-S07** *(reused from the WP03 coordinator proposal)* | Office québécois de la langue française, [purée de tomates (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17023077/puree-de-tomates), last updated 2015; rechecked 2026-10-15. | Preferred Québec French `purée de tomates`; English terms `tomato purée` and `tomato puree`. Defines a semi-liquid culinary preparation of cooked tomatoes, drained and passed through a sieve. It is terminology and preparation evidence, not a density or product-label standard. |
| **WP03-TC-20261009-S04** *(reused from the tomato integration)* | CFIA, [Normes d’identité canadiennes, Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), §§31 and 34–37; original access 2026-10-09, rechecked 2026-10-15. | Section 31 covers canned heat-processed tomato cuts; §§34–37 separately name purée, pulp, paste, and concentrated paste. §34 requires at least 12% tomato solids for tomato purée. It is product-class evidence, not a recipe conversion. |
| **WP03-TC-20261009-S05** *(reused from the tomato integration)* | CFIA, [Canadian Food Compositional Standards, Volume 10](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §10.2.8; original access 2026-10-09, rechecked 2026-10-15. | Defines tomato purée as made from sound, whole ripe tomatoes with skins and seeds removed, concentrated to a specific-gravity threshold, and possibly containing salt. The standard’s threshold is not a general spoon/cup density, a mass-volume mapping, or permission to set `defaultDensity`. |
| **WP03-L-TOMATO-PUREE-20261015-R130-S01** | Saputo Food Service, [Purée de tomates en conserve](https://www.saputofoodservice.ca/fr-ca/autres-produits/tomates/puree-de-tomates-en-conserve). | Current Canadian foodservice product page names Belvario `Purée de tomates en conserve`, product code 3350, in 6 × 2.84 L cans. This verifies one product and exact French label; it does not establish household package norms, mass, density, or a universal formula. |
| **WP03-L-TOMATO-PUREE-20261015-R130-S02** | Saputo Foodservice, [Canned Tomato Purée](https://www.saputofoodservice.ca/en/other-products/tomatoes/canned-tomato-puree). | English page names the corresponding Belvario `Canned Tomato Purée` product, code 3350, and describes it as pulpy purée made from vine-ripened tomatoes. This is one supplier’s product naming and description, not a universal formulation or measured density. |
| **WP03-L-TOMATO-PUREE-20261015-R130-S03** | Mutti Canada, [Products](https://mutti-parma.com/can-en/products/). | The Canadian product catalogue labels `Passata / Strained Tomatoes` as a product group separate from Polpa/finely chopped tomatoes, tomato paste, peeled tomatoes, and sauces. It does not define the Canadian CFIA class of tomato purée. |
| **WP03-L-TOMATO-PUREE-20261015-R130-S04** | Mutti, [Passata](https://mutti-parma.com/products/passata/). | This manufacturer’s page uses `Tomato Puree` as a heading/description for its passata product. It demonstrates source-specific descriptive overlap; it does not prove that all passata meets the Canadian standard for tomato purée or that all tomato purée is passata. No alias/crosswalk is inferred. |
| **WP03-L-TOMATO-PUREE-20261015-R130-S05** | Metro, [Soupe aux tomates](https://www.metro.ca/recettes-et-occasions/recettes/soupe-aux-tomates), dated 2013-08-06. | One Québec recipe lists 60 mL `purée de tomates en conserve` and separately 796 mL canned diced tomatoes. The recipe uses each at a different step; this is contextual usage only, not an equal-measure or substitution rule. |

### Measurement and substitution boundary

The CFIA tomato-purée specific-gravity criterion is a regulatory concentration property. Do not turn it into a general mass/volume conversion, `defaultDensity`, or density for an arbitrary spooned, packed, canned, or bottled purée. Saputo’s 2.84 L package is volume-only and not paired with mass. No ingredient unit mapping, density, package yield, drained amount, recipe conversion, or measurement observation is proposed.

No global or contextual substitution is supported by the reviewed sources. Metro’s soup recipe uses canned purée alongside diced tomatoes; it does not say they replace one another. The passata product examples establish a naming/description relationship for particular brands, not a general replacement. Keep tomato purée separate from passata, tomato pulp, paste, sauce, whole/diced/crushed canned tomatoes, fresh tomatoes, and tomato-chili sauce; do not activate any cross-product substitute.

The new R130 source-ID scan found no prior assignment in the current ledger, proposals, batches, or legacy archive. OQLF ID `WP03-TC-20261009-S07` was already assigned in the coordinator proposal; CFIA IDs `WP03-TC-20261009-S04` and `WP03-TC-20261009-S05` are in the ledger. All three are reused with their existing IDs.

## Decision and exact proposed delta

**Add** `ingredient-ref-tomato-puree` as a separate `VEGETABLE_AND_AROMATIC` identity for the standardized tomato-purée product. This follows the original Section L coordinator recommendation and the established split between canned tomato cut forms and separately named processed tomato products. Keep the exact bilingual labels from OQLF, and use the Canadian supplier’s canned wording only as a search alias. Keep passata separate; the source-specific Mutti use of `Tomato Puree` does not justify aliasing or equating the two product terms universally.

Integrated reference (Unicode escapes shown for French text to match the bundled JSON convention):

```json
{
  "id": "ingredient-ref-tomato-puree",
  "nameFr": "pur\u00e9e de tomates",
  "nameEn": "tomato pur\u00e9e",
  "aliasesFr": [
    "pur\u00e9e de tomates en conserve"
  ],
  "aliasesEn": [
    "canned tomato puree"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Integrated research record. It has no measurement observations, active mappings, forms, recipe links, or substitution findings:

```json
{
  "recordId": "ingredient-ref-tomato-puree",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {"sourceId":"WP03-TC-20261009-S07","url":"https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17023077/puree-de-tomates","title":"Office québécois de la langue française, purée de tomates (GDT)","versionOrDate":"Last updated 2015; rechecked 2026-10-15","accessedOn":"2026-10-09","locator":"Preferred French term, English terms, and culinary definition.","supports":"Supports purée de tomates / tomato purée / tomato puree and cooked, drained, sieved preparation; not density or an exact commercial formulation.","sourceKind":"regional_authority"},
    {"sourceId":"WP03-TC-20261009-S04","url":"https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4","title":"Agence canadienne d’inspection des aliments, Normes d’identité canadiennes, Volume 4","accessedOn":"2026-10-09","locator":"Sections 31 and 34–37; rechecked 2026-10-15.","supports":"Separates canned tomato cuts from purée, pulp, paste, and concentrated paste; gives a tomato-solids criterion for purée, not a recipe conversion.","sourceKind":"regional_authority"},
    {"sourceId":"WP03-TC-20261009-S05","url":"https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0","title":"Canadian Food Inspection Agency, Canadian Food Compositional Standards","accessedOn":"2026-10-09","locator":"Volume 10, section 10.2.8; rechecked 2026-10-15.","supports":"Defines tomato purée as a standardized product made from whole ripe tomatoes with skins and seeds removed and concentrated to a specific-gravity criterion; this is not a generic kitchen density.","sourceKind":"regional_authority"},
    {"sourceId":"WP03-L-TOMATO-PUREE-20261015-R130-S01","url":"https://www.saputofoodservice.ca/fr-ca/autres-produits/tomates/puree-de-tomates-en-conserve","title":"Saputo Food Service, Purée de tomates en conserve","accessedOn":"2026-10-15","locator":"Belvario product code 3350, French product title, 6 x 2.84 L can pack.","supports":"One current Canadian foodservice product uses the exact French canned-purée name; package volume is not a mass or density.","sourceKind":"manufacturer"},
    {"sourceId":"WP03-L-TOMATO-PUREE-20261015-R130-S02","url":"https://www.saputofoodservice.ca/en/other-products/tomatoes/canned-tomato-puree","title":"Saputo Foodservice, Canned Tomato Purée","accessedOn":"2026-10-15","locator":"Belvario product code 3350, English product title and product description.","supports":"The same Canadian supplier publishes the corresponding English product name and describes one pulpy tomato purée; not a universal formula or density.","sourceKind":"manufacturer"},
    {"sourceId":"WP03-L-TOMATO-PUREE-20261015-R130-S03","url":"https://mutti-parma.com/can-en/products/","title":"Mutti Canada, Products","accessedOn":"2026-10-15","locator":"Product categories for Passata / Strained Tomatoes, Polpa / finely chopped tomatoes, tomato paste, peeled tomatoes, and sauces.","supports":"Shows one Canadian brand distinguishes its named passata and other tomato product groups; it does not define CFIA tomato purée.","sourceKind":"manufacturer"},
    {"sourceId":"WP03-L-TOMATO-PUREE-20261015-R130-S04","url":"https://mutti-parma.com/products/passata/","title":"Mutti, Passata","accessedOn":"2026-10-15","locator":"Passata page title and Tomato Puree heading/description.","supports":"Shows one manufacturer uses tomato puree descriptively for its passata product; no universal equivalence is inferred.","sourceKind":"manufacturer"},
    {"sourceId":"WP03-L-TOMATO-PUREE-20261015-R130-S05","url":"https://www.metro.ca/recettes-et-occasions/recettes/soupe-aux-tomates","title":"Metro, Soupe aux tomates","versionOrDate":"2013-08-06","accessedOn":"2026-10-15","locator":"Ingredient list and method: canned tomato purée and canned diced tomatoes are listed and used separately.","supports":"One recipe-context product use; not a substitute or volume conversion.","sourceKind":"culinary_reference"}
  ],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add tomato purée / purée de tomates as a separate standardized processed-tomato identity. The CFIA product standard and OQLF term support the identity; a current Canadian supplier supports the exact canned product wording. Keep passata and other tomato products distinct, and add no measurements, mappings, forms, recipe links, or substitutions.",
      "sourceIds": ["WP03-TC-20261009-S07","WP03-TC-20261009-S04","WP03-TC-20261009-S05","WP03-L-TOMATO-PUREE-20261015-R130-S01","WP03-L-TOMATO-PUREE-20261015-R130-S02","WP03-L-TOMATO-PUREE-20261015-R130-S03","WP03-L-TOMATO-PUREE-20261015-R130-S04","WP03-L-TOMATO-PUREE-20261015-R130-S05"]
    }
  ]
}
```

## Remaining open question

The standardized Canadian tomato-purée identity has strong Québec and Canadian product-name support, but the term `tomato purée` can also appear as a description of a named passata product. This proposal adds no passata alias and does not claim every product marketed as passata falls outside the CFIA tomato-purée standard. A future product-specific review would be needed before creating a generic passata/purée equivalence or substitution.

# WP03 Section L — canned crushed tomatoes review

- **Reviewed:** 2026-10-15
- **Status:** integrated after coordinator review; see the [R129 integration record](../batches/wp03-section-l-canned-crushed-tomatoes-form-integration-r129-20261015/README.md). No tests were run.
- **Scope:** the inactive legacy `ingredient-ref-crushed-tomatoes` candidate.
- **Recommendation:** resolve the candidate into a `canned_crushed` presentation form under the active generic tomato reference. Keep it out of the active reference list as a separate ingredient. Add no numerical data or cross-form substitution.

## Checklist and boundaries

The exact open item is [`docs/RecipeBook-global-ingredient-catalog-plan.txt:9119`](../../RecipeBook-global-ingredient-catalog-plan.txt#L9182):

> [ ] Continue the Section L produce checklist, including unresolved tomato products, eggplant types,
>     kabocha/delicata, the gourds/okra boundary, and broader pepper review.

The roadmap still records the Section L produce follow-up as open at [`roadmap.md:286`](../../../roadmap.md#L286). Requirements [`FR-7`](../../../Requirements.md#L375) calls for searchable bilingual ingredient references and aliases, with ingredient lines linkable to references. This proposal resolves one tomato product presentation only; the parent checklist remains open.

“Crushed tomatoes” is a market and culinary presentation name for tomatoes, not a different botanical identity. The proposed form is specifically the canned product supported by current Canadian retail/product sources. It does not claim a regulated technical cut definition: CFIA’s canned-tomato standards enumerate whole, almost whole, whole-and-pieces, wedges, sliced, diced, and chopped, but do not define a “crushed” cut. Do not equate it with chopped, diced, tomato pulp/purée, tomato paste, or tomato-chili sauce.

## Audit snapshot and method

At review time, the live split package held 1,477 references, 108 forms, and 114 manifest-listed recipes. The catalog ledger held 1,821 records, 7,557 source entries, and 6,425 distinct source IDs. Relevant package hashes were:

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,477 | `be5e44ac438990e2956e9704017978f197b475cb4b3f655e65dd716cc7a37655` |
| `ingredient-forms.v1.json` | 108 | `295474eebb2c9d38deb5c87c1e198bbdd47a873e2527be09230537f131e9c07c` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 1,821 records | `2599edc34809f8e433e28c570fbdc720d4ab2a53074a22b1f8b70c7f21200c82` |

The audit read the active tomato reference and forms, all tomato-related ledger records, the crushed and diced legacy candidates, the whole-tomato R128 proposal/integration, the earlier WP03 coordinator review and integration, the tomato-paste and cooking-sauce/passata reviews, the picker search implementation, and every manifest-listed recipe row. Before drafting, I scanned the ledger, proposals, batches, and legacy archive for `WP03-L-TOMATO-CRUSHED-20261015-R129-S01`–`S04`; none was already assigned. Prior evidence IDs named below are reused under their existing IDs and are not reissued.

## Tomato catalog and candidate state at review time

The current active parent is `ingredient-ref-tomatoes` (`tomates` / `tomatoes`). Its current search aliases include `tomate`, `tomato`, `tomates entières`, and `whole tomatoes`; it has no default density and no unit mappings. Cherry and plum tomatoes remain separate identities, as do tomato juice, paste, sauce, passata, ketchup, and green-tomato ketchup.

Two tomato forms are now active under the generic parent:

| Form | Labels | Broad search terms | Boundary |
|---|---|---|---|
| `ingredient-form-tomatoes-canned-diced` | `tomates en dés en conserve` / `canned diced tomatoes` | `tomates en conserve` / `canned tomatoes` | Existing diced form linked to recipe `034#8`; do not alter it. Evidence IDs are `WP03-TC-20261009-S04` and `WP03-TC-20261009-S05`. |
| `ingredient-form-tomatoes-canned-whole` | `tomates entières en conserve` / `canned whole tomatoes` | `tomates en conserve` / `canned tomatoes` | Integrated in R128. Its unqualified `tomates entières` / `whole tomatoes` terms are on the generic reference and do not produce a canned-whole hint. |

The legacy file still has `ingredient-ref-crushed-tomatoes` (`tomates broyées` / `crushed tomatoes`), category `VEGETABLE_AND_AROMATIC`, review state `unreviewed`. Its ledger candidate record has no sources and says to reconcile the identity and aliases before acceptance. It is inactive: it is not a picker row and has no recipe links. `ingredient-ref-diced-tomatoes` is another unreviewed candidate; this review does not resolve it separately because the exact canned-diced form is already active.

The active tomato ledger carries one CNF 2026 observation: 182 g for one raw red-ripe whole tomato of 7.6 cm diameter. It is not a canned-product measure and is excluded. The R128 canned-whole record has no measurement observations and no global replacement. Do not transfer its findings or the raw count value to crushed tomatoes.

Prior review checked:

- [`wp03-tomato-cucurbit-coordinator-review-20261009.md`](wp03-tomato-cucurbit-coordinator-review-20261009.md) recommends forms under the generic tomato identity and says to wait for direct product or recipe support before adding whole/crushed forms. Current product evidence now supplies that product support for crushed tomatoes.
- [`wp03-section-l-tomato-product-gap-review-20261015-r128.md`](wp03-section-l-tomato-product-gap-review-20261015-r128.md) and [`wp03-section-l-canned-whole-tomatoes-form-integration-r128-20261015/README.md`](../batches/wp03-section-l-canned-whole-tomatoes-form-integration-r128-20261015/README.md) resolved whole tomatoes as a form, removed the old whole-reference candidate, and left crushed/diced legacy candidates for separate decisions.
- The original tomato/cucurbit integration keeps tomato paste, sauce, and passata distinct. The WP04 paste package proposal concerns package wording, and the WP05 sauce/passata/ketchup proposals do not model crushed tomatoes.

## Bundled recipe-demand audit

All 114 manifest-listed recipes and 1,123 ingredient rows were scanned. There are five tomato-related lines and **no crushed-tomato line**:

| Row | Ingredient line | Current link | Finding |
|---|---|---|---|
| `034#8` | `798 ml canned diced tomatoes` | Generic tomatoes + `ingredient-form-tomatoes-canned-diced` | Diced form already represented; no crushed state. |
| `078#12` | `2 tbsp tomato paste` | Tomato-paste reference | Separate product. |
| `086#12` | `156 ml tomato paste` | Tomato-paste reference | Separate product; volume is not a conversion observation. |
| `090#1` | `1 cup tomato sauce` | Tomato-sauce reference | Separate product. A recipe-specific optional diced-tomato note is not a global crushed/diced rule. |
| `096#1` | `4 large tomatoes, diced` | Generic tomatoes | Does not say canned or crushed; no preserved state is inferred. |

The corpus does not demand a crushed form or recipe link. The addition is based on the explicitly open Section L product sweep and consistent Canadian product/terminology evidence, not a recipe-count claim. A reviewed external Canadian Living Bolognese recipe hand-crushes canned whole plum tomatoes and separately lists a can of crushed tomatoes; that example does not establish that the products are globally interchangeable.

## Picker behavior and proposed projection

`IngredientSearch.kt` folds case, accents, ligatures, and punctuation. Exact form phrases are checked first; then complete word phrases match across reference and form terms, with substring fallback last. A form hint is returned only when the complete query matches a unique form term.

Pre-integration behavior:

| Query | Current result | Hint |
|---|---|---|
| `crushed tomatoes`, `crushed tomato`, `tomates broyées`, `tomate broyée` | No result | None |
| `canned crushed tomatoes`, `crushed canned tomatoes`, `tomates broyées en conserve` | No result | None |
| `canned tomatoes`, `tomates en conserve` | `ingredient-ref-tomatoes` | None: the existing diced and whole forms share each broad term |
| `canned whole tomatoes`, `tomates entières en conserve` | `ingredient-ref-tomatoes` | `ingredient-form-tomatoes-canned-whole` |

With the accepted form, explicit canned-crushed phrases return `ingredient-ref-tomatoes` with `ingredient-form-tomatoes-canned-crushed`. Unqualified `crushed tomatoes` / `tomates broyées` will return the same generic reference without a form hint, because the matcher sees those phrases inside the canonical form labels but the proposal does not make them exact form terms. Broad `canned tomatoes` / `tomates en conserve` remain ambiguous among three forms and return no form hint. Existing whole and diced query behavior is preserved.

## Evidence and limits

New sources below were accessed 2026-10-15. Sources marked “reused” already exist in the ledger and are cited with their original IDs.

| Source ID | Evidence | Supports; limit |
|---|---|---|
| **WP03-L-TOMATO-CRUSHED-20261015-R129-S01** | Government of Canada Translation Bureau, [TERMIUM Plus, crushed tomato](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esr&lang=fra&srchtxt=JITOMATES+TRITURADOS), record dated 2012-06-19. | Lists English `crushed tomato` / keyword `crushed tomatoes` and French `tomate broyée` / keyword `tomates broyées` in food industries and cooking. The record is terminology evidence, not a canned-product standard; direct opening returned a cache miss, so the indexed record text was used. |
| **WP03-L-TOMATO-CRUSHED-20261015-R129-S02** | Metro Québec, [Tomates broyées Aylmer](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/tomates-et-pates-de-tomates/tomates-broyees/p/058807656104), product 058807656104. | French retail listing names `Tomates broyées`, gives 796 mL, and describes the product as canned. The French page search index was available; direct retrieval returned 403. The listing’s product-of-Canada badge conflicts with Conagra’s note that Aylmer crushed tomatoes are grown in California; this review does not rely on origin claims. |
| **WP03-L-TOMATO-CRUSHED-20261015-R129-S03** | Metro, [Crushed Tomatoes Aylmer](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/tomatoes-paste/crushed-tomatoes/p/058807656104), same product 058807656104. | English listing uses `Crushed Tomatoes` in the canned/jarred aisle and corresponds to the French listing. The indexed listing gave the title and SKU; direct retrieval returned 403. Package volume is not a net mass or density. |
| **WP03-L-TOMATO-CRUSHED-20261015-R129-S04** | ILIOS Foods, [2026 grocery catalogue](https://fr.iliosfoods.ca/_files/ugd/7a4ac1_5fbfe6e609ab4310b481cac160c57337.pdf), p. 29. | Separately lists ILIOS `Tomates broyées / Crushed Tomatoes` (4026IT) beside whole peeled and diced tomatoes, all with commercial 796 mL pack presentations. The PDF search index supplied the page entry; direct opening exceeded the web tool’s file-size limit. It is product-catalogue evidence, not a technical particle-size or composition standard. |
| **WP03-L-TOMATO-WHOLE-20261015-S03** *(reused)* | Conagra Brands Canada, [Aylmer tomatoes](https://www.conagrabrands.ca/en/brands/aylmer), manufacturer product headings. | Names Aylmer Crushed Tomatoes separately from diced and whole tomatoes and lists 796 mL. The manufacturer says Aylmer crushed tomatoes are grown in California; no formula, density, or mass conversion is inferred. |
| **WP03-L-TOMATO-WHOLE-20261015-S02** *(reused)* | Health Canada, [Eight canned foods to keep on hand](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/eight-canned-foods-keep-hand.html), “Tomatoes.” | Mentions crushed, diced, and whole canned tomatoes as useful for quick tomato sauce. It does not state that they are interchangeable or provide equal measures. |
| **WP03-L-TOMATO-WHOLE-20261015-S08** *(reused)* | Canadian Living, [Homemade Bolognese Sauce](https://www.canadianliving.com/food/dressings-sauces/recipe/homemade-bolognese-sauce), 2023-01-16. | One recipe hand-crushes whole canned plum tomatoes and separately lists crushed tomatoes. It is a recipe-specific method, not an equivalence rule. |
| **WP03-L-TOMATO-WHOLE-20261015-S01** *(reused)* | CFIA, [Canadian Grade Compendium, Volume 3](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-3), §47; rechecked 2026-10-15. | Lists whole, whole-and-pieces, wedges, sliced, diced, and chopped tomatoes in hermetically sealed packages; it does not name “crushed” in this enumerated section. A grade standard, not evidence that crushed equals chopped. |
| **WP03-TC-20261009-S04** *(reused)* | CFIA, [Normes d’identité canadiennes, Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), §§31–39; rechecked 2026-10-15. | §31 names whole, almost whole, large pieces, wedges, slices, diced, and chopped tomatoes; it does not define crushed tomatoes. §39 mentions tomatoes that are chopped or crushed only within the separate tomato chili-sauce product. This does not make “crushed tomatoes” tomato chili sauce. |
| **WP03-TC-20261009-S05** *(reused)* | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 10 §§10.2.4–10.2.8; rechecked 2026-10-15. | Keeps canned tomatoes separate from tomato purée, pulp, and paste. Regulatory composition criteria do not establish crushed-tomato density, texture, yield, or substitution. |

The source-ID uniqueness scan found none of the four new R129 IDs in the current ledger or catalog proposal/batch/archive tree before this file was written. All referenced R128/TC IDs are pre-existing ledger sources and were not assigned new IDs.

## Decision and exact proposed deltas

**Add** `ingredient-form-tomatoes-canned-crushed` under `ingredient-ref-tomatoes`, and resolve the legacy candidate as merged into that form. This is a catalog presentation, not a new ingredient identity: the label and bilingual terminology are supported by Canadian product offerings, the crushed candidate matches the same tomato product family, and the active whole/diced forms establish the appropriate form-level representation. The absence of a formal CFIA “crushed” cut definition limits the claim to commercial product naming; it does not justify mapping crushed to chopped or diced.

The generic tomato reference after integration has the following object. The added unqualified English/French phrases are searchable on the generic identity without suggesting canned state or returning an exact form hint:

```json
{
  "id": "ingredient-ref-tomatoes",
  "nameFr": "tomates",
  "nameEn": "tomatoes",
  "aliasesFr": [
    "grosses tomates",
    "tomate",
    "tomate broy\u00e9e",
    "tomates broy\u00e9es",
    "tomates enti\u00e8res"
  ],
  "aliasesEn": [
    "crushed tomato",
    "crushed tomatoes",
    "tomato",
    "whole tomatoes"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The accepted new form is below. Its unqualified label phrases intentionally remain absent from `matchTerms*`; the picker finds them through the form label, but only an explicit canned phrase gives a canned-crushed form hint.

```json
{
  "id": "ingredient-form-tomatoes-canned-crushed",
  "ingredientRefId": "ingredient-ref-tomatoes",
  "formCode": "canned_crushed",
  "labelFr": "tomates broy\u00e9es en conserve",
  "labelEn": "canned crushed tomatoes",
  "prepState": "canned_crushed",
  "matchTermsFr": [
    "tomates en conserve",
    "tomate broy\u00e9e en conserve"
  ],
  "matchTermsEn": [
    "canned tomatoes",
    "crushed canned tomatoes",
    "canned crushed tomato"
  ],
  "densityGPerMl": null,
  "notesFr": "Forme commerciale de tomates broy\u00e9es en conserve. Les sources canadiennes consult\u00e9es confirment ce nom de produit, mais la norme canadienne des pr\u00e9sentations de tomates ne d\u00e9finit pas une coupe \u00ab broy\u00e9e \u00bb. Ne pas l'assimiler aux tomates hach\u00e9es, en d\u00e9s, \u00e0 la pulpe, \u00e0 la pur\u00e9e ou \u00e0 la sauce chili. Aucune densit\u00e9, conversion, mesure de rendement ou substitution n'est \u00e9tablie.",
  "notesEn": "Commercial canned crushed-tomato presentation. Canadian sources confirm the product name, but the Canadian tomato-presentation standard does not define a crushed cut. Do not equate it with chopped, diced, tomato pulp, pur\u00e9e, or tomato chili sauce. No density, conversion, yield measure, or substitution is established.",
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

The accepted evidence record has no measurement observations and records no supported global substitution. Existing CFIA and R128 source IDs below are reused without reassignment.

```json
{
  "recordId": "ingredient-form-tomatoes-canned-crushed",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-L-TOMATO-CRUSHED-20261015-R129-S01",
      "url": "https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esr&lang=fra&srchtxt=JITOMATES+TRITURADOS",
      "title": "Government of Canada Translation Bureau, TERMIUM Plus, crushed tomato",
      "versionOrDate": "Record dated 2012-06-19",
      "accessedOn": "2026-10-15",
      "locator": "Food Industries / Cooking and Gastronomy entry: crushed tomato(s), tomate broy\u00e9e, tomates broy\u00e9es.",
      "supports": "Supports the English/French term pair for crushed tomatoes; does not establish that every crushed-tomato product is canned or a regulated cut.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-TOMATO-CRUSHED-20261015-R129-S02",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/tomates-et-pates-de-tomates/tomates-broyees/p/058807656104",
      "title": "Metro Qu\u00e9bec, Tomates broy\u00e9es Aylmer",
      "accessedOn": "2026-10-15",
      "locator": "French indexed product title, SKU 058807656104, 796 mL listing, canned product description; direct retrieval returned 403.",
      "supports": "One Canadian retail canned tomato product named tomates broy\u00e9es; supports commercial presentation and bilingual display, not mass, density, or origin.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-TOMATO-CRUSHED-20261015-R129-S03",
      "url": "https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/tomatoes-paste/crushed-tomatoes/p/058807656104",
      "title": "Metro, Crushed Tomatoes Aylmer",
      "accessedOn": "2026-10-15",
      "locator": "English indexed product title and SKU 058807656104 in Canned & Jarred; direct retrieval returned 403.",
      "supports": "English product name and match to the French retail SKU. Does not provide product mass or density.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-TOMATO-CRUSHED-20261015-R129-S04",
      "url": "https://fr.iliosfoods.ca/_files/ugd/7a4ac1_5fbfe6e609ab4310b481cac160c57337.pdf",
      "title": "ILIOS Foods, Grocery Catalogue 2026",
      "accessedOn": "2026-10-15",
      "locator": "Page 29, ILIOS 4026IT, Tomates broy\u00e9es / Crushed Tomatoes, 24 x 796 mL; product listing alongside whole peeled and diced tomatoes.",
      "supports": "A second Canadian commercial catalogue independently lists crushed tomatoes as a distinct bilingual product presentation; catalogue presentation only, not technical particle size or composition.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-L-TOMATO-WHOLE-20261015-S01",
      "url": "https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-3",
      "title": "Canadian Food Inspection Agency, Canadian Grade Compendium, Volume 3",
      "accessedOn": "2026-10-15",
      "locator": "Section 47, sealed-package tomato grade presentations.",
      "supports": "Lists whole, whole-and-pieces, wedges, sliced, diced, and chopped presentations but does not define crushed as one of these cuts.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-TC-20261009-S04",
      "url": "https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4",
      "title": "Agence canadienne d\u2019inspection des aliments, Normes d\u2019identit\u00e9 canadiennes, Volume 4",
      "accessedOn": "2026-10-09",
      "locator": "Sections 31 and 39; rechecked 2026-10-15.",
      "supports": "Section 31 enumerates tomato product presentations and omits crushed; section 39's chopped/crushed language is inside a distinct tomato chili sauce standard.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-TC-20261009-S05",
      "url": "https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0",
      "title": "Canadian Food Inspection Agency, Canadian Food Compositional Standards",
      "accessedOn": "2026-10-09",
      "locator": "Volume 10, sections 10.2.4\u201310.2.8; rechecked 2026-10-15.",
      "supports": "Keeps canned tomatoes separate from tomato pur\u00e9e, pulp, and paste; provides no crushed-tomato measurement or substitution.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-TOMATO-WHOLE-20261015-S02",
      "url": "https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/eight-canned-foods-keep-hand.html",
      "title": "Health Canada, Eight canned foods to keep on hand",
      "versionOrDate": "Page details 2026-03-31",
      "accessedOn": "2026-10-15",
      "locator": "Tomatoes section.",
      "supports": "Discusses crushed, diced, and whole canned tomatoes in tomato-sauce use context without an exchange rule.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-TOMATO-WHOLE-20261015-S03",
      "url": "https://www.conagrabrands.ca/en/brands/aylmer",
      "title": "Conagra Brands Canada, Aylmer tomatoes",
      "accessedOn": "2026-10-15",
      "locator": "Aylmer Crushed Tomatoes heading and 796 mL size; manufacturer note about tomato origin.",
      "supports": "Manufacturer names a crushed product separately from diced and whole products; does not define a universal formula or mass conversion.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-L-TOMATO-WHOLE-20261015-S08",
      "url": "https://www.canadianliving.com/food/dressings-sauces/recipe/homemade-bolognese-sauce",
      "title": "Canadian Living, Homemade Bolognese Sauce",
      "versionOrDate": "2023-01-16",
      "accessedOn": "2026-10-15",
      "locator": "Ingredient list and method for canned whole plum tomatoes and canned crushed tomatoes.",
      "supports": "One recipe hand-crushes whole canned plum tomatoes and separately lists canned crushed tomatoes; not a global substitution.",
      "sourceKind": "culinary_reference"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "ingredient-form-tomatoes-canned-crushed-substitution-review-20261015",
      "researchState": "researched_no_supported_substitute",
      "fromIngredientRefId": "ingredient-ref-tomatoes",
      "fromFormId": "ingredient-form-tomatoes-canned-crushed",
      "replacements": [],
      "context": "Global cooking substitution review for canned crushed tomatoes; canned whole and diced presentations and fresh-tomato wording were checked separately.",
      "basis": "Health Canada's canned-tomato use context does not give an exchange rule. The reviewed recipe example hand-crushes canned whole plum tomatoes and separately lists crushed tomatoes, preserving dish and tomato-type context.",
      "limitations": [
        "No global crushed-to-whole, crushed-to-diced, or crushed-to-fresh substitution is established.",
        "Do not equate the commercial crushed presentation with CFIA's chopped cut or with pur\u00e9e, pulp, paste, or tomato chili sauce."
      ],
      "sourceIds": [
        "WP03-L-TOMATO-WHOLE-20261015-S02",
        "WP03-L-TOMATO-WHOLE-20261015-S08",
        "WP03-TC-20261009-S04",
        "WP03-TC-20261009-S05"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Resolve the legacy crushed-tomatoes candidate as a canned commercial presentation form under generic tomatoes. Canadian product and terminology sources support the bilingual product name, while CFIA standards do not define a crushed cut. Keep it separate from diced/whole form hints and from pur\u00e9e/pulp/paste/sauce. Add no density, conversion, yield, or substitution.",
      "sourceIds": [
        "WP03-L-TOMATO-CRUSHED-20261015-R129-S01",
        "WP03-L-TOMATO-CRUSHED-20261015-R129-S02",
        "WP03-L-TOMATO-CRUSHED-20261015-R129-S03",
        "WP03-L-TOMATO-CRUSHED-20261015-R129-S04",
        "WP03-L-TOMATO-WHOLE-20261015-S03",
        "WP03-TC-20261009-S04",
        "WP03-TC-20261009-S05"
      ]
    }
  ]
}
```

Coordinator integration kept the legacy ledger candidate as a historical `candidate` record with `identityState: "merged"`, preserved its earlier unresolved decision, and appended a `merged` decision pointing `ingredient-ref-crushed-tomatoes` to `ingredient-form-tomatoes-canned-crushed`. The old reference candidate was removed from `legacy-import-identities.v1.json`; no new `ingredient-ref-crushed-tomatoes` row or recipe change was made.

## Coordinator decision

The coordinator accepted the commercial product presentation even though CFIA does not define “crushed” as a listed tomato cut. The catalog can represent a source-backed market form without asserting a regulated cut. The notes explicitly keep it separate from chopped, diced, whole, purée, pulp, paste, and tomato-chili sauce.

# WP03 Section L R134 — Thai eggplant identity review — 2026-10-15

- **Status:** proposal only; no shared catalog JSON, ledger, checklist, roadmap, or generated file was changed.
- **Decision:** add identity-only **Thai eggplant / aubergine thaïe**, narrowly tied to Metro product 3090. Keep the retailer’s exact French spelling `aubergine thaï` as one French alias; add no English aliases.
- **Numeric scope:** Metro and Food Basics display a selected 60 g quantity, not an average per eggplant. Health Canada’s count and cup weights describe generic raw eggplant, not this subtype. Add no measurement observation, density, mapping, yield, or conversion.
- **Substitution scope:** keep one publisher’s Thai-green-curry option as a dish-scoped ledger finding only. Add no active global or contextual rule and no recipe-line link.
- **Forms:** add no form. Reviewed item pages identify fresh eggplant; their curry/stir-fry uses are not ingredient forms.

## Checklist and requirements

The active global catalog plan, Section L at [`docs/RecipeBook-global-ingredient-catalog-plan.txt:4397`](../../RecipeBook-global-ingredient-catalog-plan.txt#L4418), still leaves the produce checklist open and says eggplant subtypes remained open pending product-specific bilingual names. Its adjacent completion note says the later integrations handled kabocha and Delicata. The roadmap records R131 kabocha, R132 Delicata, and R133 Chinese eggplant as integrated; none closes the remaining subtype work.

The 2026-10-09 Section L coordinator review deferred subtype identities until a recipe or bilingual product label identified a type. The 2026-10-11 WP06 Southeast Asia review kept Thai eggplant as a cuisine-qualified recipe variant of generic eggplant and said to revisit it if local market terminology established a stable identity. This review revisits that narrow hold because Metro now has a bilingual product listing for item 3090. The result is one retailer-labeled product identity, not a decision on every Thai, Japanese, Indian, Italian, or Asian eggplant.

Requirements.md FR-3 and FR-7 call for bilingual searchable ingredient names and aliases. The proposal uses a Quebec French culinary form and the exact retailer label, while keeping broader and unverified phrases out of the alias arrays. No unit mapping or density is added without subtype-specific evidence.

## Current catalog, ledger, legacy, archive, and recipe audit

Read-only workspace snapshot on 2026-10-15:

- **Active catalog:** 1,486 ingredient references and 109 forms.
- **Research ledger:** 1,831 records, 7,638 source entries, and 6,494 distinct source IDs.
- **Legacy candidates:** 61 entries; declared and actual counts agree.
- **Bundled recipe corpus:** 114 manifest-listed recipes and 1,123 ingredient rows.

The live catalog has generic `eggplant / aubergine` (`ingredient-ref-eggplant`) with empty alias arrays, null default density, and no unit mappings. R133 has since added identity-only `Chinese eggplant / aubergine chinoise` as `ingredient-ref-chinese-eggplant`; its product-specific Metro evidence and dish-scoped grilled-recipe finding do not decide Thai eggplant. No Thai eggplant reference, form, ledger record, or legacy candidate exists. The proposed reference ID and R134 source-ID prefix are unused in the active references, forms, ledger, legacy candidates, proposals, and batches.

The earlier WP03 coordinator proposal said to wait for product-specific bilingual labels. The WP06 sweep named `aubergines thaïe` in a Télé-Québec recipe but kept it as an external recipe variant because there was not yet local product evidence. Neither record established a retail item or measurement. Metro item 3090 now supplies the missing product-label evidence. Its bilingual pages are two language versions of the same listing, not independent products or measurement samples.

All 114 manifest-listed recipe files and all 1,123 ingredient objects were scanned across their full fields, including original text, canonical name, reference ID, preparation, and notes, for eggplant/aubergine and Chinese, Japanese, Thai, and related subtype wording. There were **zero matches**, so the corpus has no generic or subtype-specific eggplant row and no Thai-eggplant recipe link is proposed. The manifest-order corpus digest was `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`.

## Bilingual name and product boundary

Metro’s current indexed French and English product pages use **Aubergine thaï / Thai Eggplant**, both with product number 3090. Both descriptions call the item small and round, often pale green or white-striped. The bilingual Quebec menu at Chez Tao uses `aubergine thaïe` in French and `thai eggplant` in English for a curry ingredient. Propose the French display **aubergine thaïe**, using the French culinary spelling found in that bilingual Quebec source, and retain Metro’s exact `aubergine thaï` product title as the one French alias. The English display **Thai eggplant** matches Metro directly, so no English alias is needed.

The OQLF’s `aubergine` entry (last updated 1990) gives the general French/English pair and says Thai varieties include several shapes: very small grape-like clusters, small green/white types, and larger orange-red types. Its breadth is wider than Metro item 3090’s current description. Use OQLF for the Quebec base term and the fact that Thai varieties are not one uniform shape; use Metro’s current bilingual item name for this identity. The reviewed sources do not establish a species, cultivar, or universal taxonomy for product 3090, so none is assigned.

Keep aliases limited to the exact bilingual product phrase and the retailer’s French spelling:

- **Add:** `aubergine thaï` as a French alias for Metro’s exact title. `aubergine thaïe` and `Thai eggplant` are the canonical displays.
- **Do not add:** bare `eggplant` / `aubergine` as aliases; they remain generic and return multiple results.
- **Do not add:** `Asian eggplant`, `aubergine d’Asie`, or bare `Thai` / `thaï`; these are broader cuisine or regional phrases.
- **Do not add:** `aubergine thaïlandaise` as an alias. A Quebec gardening article uses it in a general varietal description, while OQLF lists several Thai varieties; it could broaden the product identity beyond Metro’s named item.
- **Do not add:** `pea eggplant`, `aubergine japonaise`, or `aubergine chinoise`. OQLF distinguishes multiple Thai forms; Japanese and Chinese eggplant are separate names, and Chinese eggplant already has its own active reference.

The picker projection below reproduces the live `IngredientReferenceSearchIndex` behavior in `IngredientSearch.kt`: lowercase and accent folding, complete phrase matches first, and substring matching only if no complete phrase matches. It is a static projection, not a runtime or UI test.

| Query | Current results | With proposed reference |
|---|---:|---:|
| `Thai eggplant` | 0 | 1 — `ingredient-ref-thai-eggplant` |
| `aubergine thaïe` | 0 | 1 — `ingredient-ref-thai-eggplant` |
| Metro spelling `aubergine thaï` | 0 | 1 — `ingredient-ref-thai-eggplant` |
| generic `eggplant` | 2 — general + Chinese | 3 — general + Chinese + Thai |
| generic `aubergine` | 2 — general + Chinese | 3 — general + Chinese + Thai |
| `Thai` / `thaï` | 5 | 6 — Thai-labeled rows remain a multi-result search |
| `Chinese eggplant` / `aubergine chinoise` | 1 — Chinese eggplant | 1 — unchanged |
| `Japanese eggplant` / `aubergine japonaise` | 0 | 0 |
| `pea eggplant` / `Asian eggplant` | 0 | 0 |
| `aubergine thaïlandaise` | 0 | 0 |

The exact bilingual names return only the new row. Broad eggplant and Thai queries remain multi-result; the proposal does not make a broad query resolve to the subtype alone.

## Evidence register

Sources were reviewed on 2026-10-15. Product stock, price, selector state, and search-index freshness can change; no current stock or price claim is used. The Metro and Food Basics pages were available through indexed page content, but direct retrieval was limited as recorded below.

| ID | Source | Evidence and limitation |
|---|---|---|
| **WP03-L-THAI-EGGPLANT-20261015-R134-S01** | Office québécois de la langue française, [aubergine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297068/aubergine) | Gives Quebec French `aubergine`, English `eggplant`, and notes Chinese, Japanese, and Thai varieties. Last updated in 1990. Its note describes multiple Thai shapes and colours; it is terminology and boundary evidence, not a current product label or evidence that Metro item 3090 has one species or cultivar. |
| **WP03-L-THAI-EGGPLANT-20261015-R134-S02** | Metro Québec, [Aubergine thaï, product 3090](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/legumes-exotiques/aubergine-thai/p/3090) | Search-indexed French product title, number, ingredient label, and description identify a small round pale-green or white-striped item. The page was indexed about one month before review; direct opening returned a cache miss. The displayed `60 g` is a selected quantity, not an “average per item” statement. |
| **WP03-L-THAI-EGGPLANT-20261015-R134-S03** | Metro Canada, [Thai Eggplant, product 3090](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/exotic-vegetables/thai-eggplant/p/3090) | Search-indexed English title and matching description identify product 3090 as Thai Eggplant. Direct opening returned HTTP 403. This is the English page for the same Metro item as S02, not an independent product or sample. |
| **WP03-L-THAI-EGGPLANT-20261015-R134-S04** | Food Basics, [Thai Eggplant, product 3090](https://www.foodbasics.ca/aisles/fruits-vegetables/vegetables/exotic-vegetables/thai-eggplant/p/3090) | Search-indexed Canadian listing uses the same product number/title and displays `$0.40 / 60 g` alongside `$6.59/kg`; direct opening returned HTTP 403. The 60 g is the displayed selected/price quantity, not a per-item average. Its matching item number, image, and copied description make this a corroborating banner listing, not an independent weight sample. |
| **WP03-L-THAI-EGGPLANT-20261015-R134-S05** | Chez Tao, [bilingual food menu PDF](https://cheztao.ca/wp-content/uploads/2024/08/2024-08-CHEZ-TAO-BOUFFE.pdf) | Quebec restaurant menu pairs French `aubergine thaïe` and English `thai eggplant` in its tofu green curry. The menu supports local culinary spelling and usage; it gives no quantity or substitution. PDF page 1, lines 39–41; English counterpart on page 2, lines 167–169. |
| **WP03-L-THAI-EGGPLANT-20261015-R134-S06** | Jardin de l’oiseau moqueur, [L’Aubergine](https://jardindom.ca/2023/02/25/laubergine/) | Quebec gardening community article calls a small, round, green type `aubergine thaïlandaise`. It supports regional descriptive usage only; it is not a current retail label, botanical standard, or support for a broader alias. |
| **WP03-L-THAI-EGGPLANT-20261015-R134-S07** | Feasting at Home, [Thai Green Curry](https://www.feastingathome.com/thai-green-curry/) | Recipe author says Thai or Japanese eggplant works in this curry and suggests regular globe eggplant in a pinch. The ingredient list itself names one Japanese eggplant; no equivalent Thai or globe quantity is given. This supports one dish-scoped direction only, not a general ratio or active rule. |
| **WP03-L-THAI-EGGPLANT-20261015-R134-S08** | deSIAMCuisine, [Thai ingredients to substitute when cooking overseas](https://siam.recipes/blogs/news/which-ingredients-to-substitute-when-cooking-thai-food-overseas) | Thai-cuisine supplier article suggests long aubergine or purple eggplant in curries and stir-fries. It gives no ratio and uses broad replacement terms; it is not sufficient for a general identity-to-identity rule or a Quebec-specific recommendation. |
| **WP03-L-THAI-EGGPLANT-20261015-R134-S09** | Health Canada, [Canadian Nutrient File serving sizes, food code 2088](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2088) | Generic `Eggplant (aubergine, brinjal), raw / Aubergine, crue` lists cup weights and one peeled/unpeeled eggplant weights of 458 g / 548 g. The page is dated 2019 and does not identify Thai eggplant; none of these values is transferred to item 3090. |

## Numeric, form, substitution, and recipe audit

- **No reusable measure:** Metro item 3090’s pages display a 60 g selected quantity. Food Basics shows the same selected/price quantity with a per-kilogram price; neither page calls it one eggplant or reports an average item weight. Do not store 60 g as a count weight, portion, density, mapping, or yield.
- **Generic CNF numbers do not transfer:** Health Canada CNF food code 2088 reports generic raw aubergine serving masses, including 548 g for one unpeeled eggplant, but the entry is not type-qualified. The size and appearance in Metro item 3090 are specific to its listing, so generic CNF measures do not establish a Thai-item measure.
- **No form:** the retail pages describe fresh eggplant. The Chez Tao menu places it in a curry; that dish use is not a separate preserved or preparation form.
- **One dish-scoped substitution direction:** Feasting at Home's Thai green curry article permits regular globe eggplant in that recipe while noting Thai and Japanese options. It gives no replacement amount, and the displayed ingredient list calls for one Japanese eggplant. Retain the observation in the ledger with no quantity; add no global or contextual substitution rule and no recipe-line substitution link.
- **No general substitute rule:** deSIAMCuisine gives a second broad curry/stir-fry recommendation for long or purple eggplant, but no ratio or precise source-reference mapping. The previous Metro Chinese-versus-regular choice applies only to its named grilled-eggplant recipe and does not transfer to Thai eggplant.
- **No bundled demand:** zero eggplant/aubergine matches occur in all 1,123 ingredient rows. No recipe link, form, conversion, yield, reusable measure, or active substitution is proposed.

## Proposed exact delta

Add one bilingual identity-only reference and one corresponding evidence-ledger record. The ledger's substitution finding stays limited to Feasting at Home's named Thai green curry; no active rule or recipe-line link is created. Add no form or measurement observation.

```json
{
  "ingredientReference": {
    "id": "ingredient-ref-thai-eggplant",
    "nameFr": "aubergine thaïe",
    "nameEn": "Thai eggplant",
    "aliasesFr": ["aubergine thaï"],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-15T00:00:00Z",
    "category": "VEGETABLE_AND_AROMATIC"
  },
  "ledgerRecord": {
    "recordId": "ingredient-ref-thai-eggplant",
    "recordType": "ingredient_reference",
    "identityState": "verified",
    "measurementState": "researched_no_supported_value",
    "substitutionResearchState": "researched_supported",
    "sources": [
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S01",
        "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297068/aubergine",
        "title": "Office québécois de la langue française, aubergine (GDT)",
        "versionOrDate": "Last updated 1990; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "French and English terms; French note on Chinese, Japanese, and Thai varieties.",
        "supports": "Supports the Quebec base terms aubergine / eggplant and notes multiple Thai varieties. Its broad and older variety description is not a current product label or a taxonomic identification of Metro item 3090.",
        "sourceKind": "regional_authority"
      },
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S02",
        "url": "https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/legumes-exotiques/aubergine-thai/p/3090",
        "title": "Metro Québec, Aubergine thaï, product 3090",
        "versionOrDate": "French page search-indexed about one month before review; direct opening returned a cache miss",
        "accessedOn": "2026-10-15",
        "locator": "French product title, number, ingredient label, description, and selected quantity.",
        "supports": "The indexed French listing calls product 3090 Aubergine thaï and describes a small, round, pale-green or white-striped product. The displayed 60 g is a selected quantity, not an average item mass.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S03",
        "url": "https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/exotic-vegetables/thai-eggplant/p/3090",
        "title": "Metro Canada, Thai Eggplant, product 3090",
        "versionOrDate": "English page search-indexed about one month before review; direct opening returned HTTP 403",
        "accessedOn": "2026-10-15",
        "locator": "English product title, number, matching description, and selected quantity.",
        "supports": "The indexed English listing calls the same Metro product 3090 Thai Eggplant and gives the matching small, round, pale-green or white-striped description. This is the English version of S02, not independent product evidence or a second measurement.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S04",
        "url": "https://www.foodbasics.ca/aisles/fruits-vegetables/vegetables/exotic-vegetables/thai-eggplant/p/3090",
        "title": "Food Basics, Thai Eggplant, product 3090",
        "versionOrDate": "Page search-indexed about two weeks before review; direct opening returned HTTP 403",
        "accessedOn": "2026-10-15",
        "locator": "Indexed English product title, product number, item selector, and price per weight.",
        "supports": "The listing repeats product 3090 and displays a selected 60 g quantity at $0.40 / 60 g and $6.59/kg. This is not stated as one eggplant's mass; the matching item number, image, and description are not an independent weight sample.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S05",
        "url": "https://cheztao.ca/wp-content/uploads/2024/08/2024-08-CHEZ-TAO-BOUFFE.pdf",
        "title": "Chez Tao, bilingual food menu",
        "versionOrDate": "2024-08 menu PDF; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Page 1, tofu green curry ingredient line; page 2 English counterpart.",
        "supports": "A Quebec bilingual menu pairs aubergine thaïe / thai eggplant as a curry ingredient. It supports local wording but does not supply a quantity, measure, or substitution.",
        "sourceKind": "culinary_reference"
      },
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S06",
        "url": "https://jardindom.ca/2023/02/25/laubergine/",
        "title": "Jardin de l’oiseau moqueur, L’Aubergine",
        "versionOrDate": "Quebec gardening-community article; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Varieties section, Thai eggplant description.",
        "supports": "Uses aubergine thaïlandaise for a small, rounded, green type. This is regional descriptive wording, not a retail label, species standard, or basis for a broad alias.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S07",
        "url": "https://www.feastingathome.com/thai-green-curry/",
        "title": "Feasting at Home, Thai Green Curry Recipe",
        "versionOrDate": "Published 2025-05-13; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Eggplant note and ingredient list.",
        "supports": "The author says Thai or Japanese eggplant works in this curry or regular globe eggplant can be used in a pinch. Its ingredient list names one Japanese eggplant and gives no equivalent Thai or globe quantity.",
        "sourceKind": "culinary_reference"
      },
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S08",
        "url": "https://siam.recipes/blogs/news/which-ingredients-to-substitute-when-cooking-thai-food-overseas",
        "title": "deSIAMCuisine, Thai ingredients to substitute when cooking overseas",
        "accessedOn": "2026-10-15",
        "locator": "Thai eggplant section.",
        "supports": "Suggests long aubergine or purple eggplant for curries and stir-fries, without a ratio or precise catalog identity. This broad culinary suggestion does not support a global substitution rule.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-THAI-EGGPLANT-20261015-R134-S09",
        "url": "https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2088",
        "title": "Health Canada, Canadian Nutrient File, raw eggplant serving sizes, food code 2088",
        "versionOrDate": "Page dated 2019-03-01; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Bilingual food name and available generic raw-eggplant serving sizes.",
        "supports": "Generic raw aubergine measures include one peeled/unpeeled eggplant at 458 g / 548 g and several cup weights. The entry does not identify Thai eggplant, so those measures are not transferred to the proposed subtype.",
        "sourceKind": "food_composition"
      }
    ],
    "substitutionFindings": [
      {
        "findingId": "wp03-thai-eggplant-feasting-home-green-curry-option-20261015",
        "researchState": "researched_supported",
        "fromIngredientRefId": "ingredient-ref-thai-eggplant",
        "replacements": [
          {
            "ingredientRefId": "ingredient-ref-eggplant",
            "roleInCompound": "Regular globe eggplant mentioned as an option for this named Thai green curry."
          }
        ],
        "context": "Only Feasting at Home’s Thai Green Curry recipe.",
        "basis": "The author says Thai or Japanese eggplant works in this curry and regular globe eggplant can be used in a pinch. The ingredient list names one Japanese eggplant; the source gives no equivalent amount for Thai or globe eggplant.",
        "limitations": [
          "This is one publisher recipe, not a Quebec or Canadian standard.",
          "Do not generalize it to other recipes, methods, eggplant types, or a count/weight conversion.",
          "No active global or contextual substitution rule or recipe-line link is proposed."
        ],
        "sourceIds": ["WP03-L-THAI-EGGPLANT-20261015-R134-S07"]
      }
    ],
    "decisions": [
      {
        "outcome": "accepted",
        "reason": "Add identity-only Thai eggplant / aubergine thaïe, tied to current Metro product 3090 and corroborated by a Quebec bilingual menu. Keep only the source-attested Metro spelling aubergine thaï as a French alias; do not infer a species or cultivar taxonomy.",
        "sourceIds": [
          "WP03-L-THAI-EGGPLANT-20261015-R134-S01",
          "WP03-L-THAI-EGGPLANT-20261015-R134-S02",
          "WP03-L-THAI-EGGPLANT-20261015-R134-S03",
          "WP03-L-THAI-EGGPLANT-20261015-R134-S05"
        ]
      },
      {
        "outcome": "accepted",
        "reason": "Do not add a reusable measure. Metro/Food Basics’ selected 60 g amount is not one eggplant's stated mass, and Health Canada’s count/cup measures are for generic raw eggplant, not this subtype.",
        "sourceIds": [
          "WP03-L-THAI-EGGPLANT-20261015-R134-S02",
          "WP03-L-THAI-EGGPLANT-20261015-R134-S03",
          "WP03-L-THAI-EGGPLANT-20261015-R134-S04",
          "WP03-L-THAI-EGGPLANT-20261015-R134-S09"
        ]
      },
      {
        "outcome": "accepted",
        "reason": "Record Feasting at Home’s Thai-green-curry replacement suggestion as one dish-scoped ledger finding only. Do not add a global/contextual rule, quantity, or recipe-line link; deSIAMCuisine’s broad curry/stir-fry wording likewise has no ratio or exact replacement identity.",
        "sourceIds": [
          "WP03-L-THAI-EGGPLANT-20261015-R134-S07",
          "WP03-L-THAI-EGGPLANT-20261015-R134-S08"
        ]
      }
    ]
  }
}
```

## Validation and limitations

- Confirmed the proposed reference ID and all nine R134 source IDs have no collisions in active references, forms, ledger records, legacy candidates, existing proposals, or batch files.
- The picker projection returns one item for each qualified bilingual phrase; generic eggplant/aubergine becomes a three-result search after the proposed row, and broad Thai/thaï becomes a six-result search. Chinese eggplant remains its existing single exact result.
- The 114-file / 1,123-row corpus scan found no eggplant/aubergine ingredient lines; no recipe link or form is proposed.
- Metro and Food Basics product content was accessed through search indexing because direct page opening returned cache miss or HTTP 403. The 60 g selector is not represented as a weight per eggplant. Health Canada measures remain generic and subtype-unqualified.
- One external recipe supports only a Thai-green-curry replacement suggestion; it supplies no Thai-specific amount. No active substitution is proposed.
- No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. This is proposal-only research; the project instruction says database-JSON-only additions do not need testing.

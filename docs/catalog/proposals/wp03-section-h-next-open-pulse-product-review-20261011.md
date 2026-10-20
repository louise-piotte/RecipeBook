# WP03 Section H — next open pulse/product-form review

- **Reviewed:** 2026-10-11
- **Status:** reviewed and integrated; one form link was added to recipe `007#4`
- **Selected gap:** pinto beans canned with liquid, linked only to recipe `007#4`
- **Research scope:** the agent review produced this report only; root integration added the reviewed form, recipe link, ledger record, and checklist entry.
- **Testing:** no tests or emulator were run under the current `AGENTS.md` data-only rule.

## Recommendation

Add one pinto-bean form, `ingredient-form-pinto-beans-canned-with-liquid`, and link it to the existing recipe row `007#4`. Keep the recipe’s current `packageAmount` (`1 CAN`, requested basis `NET_CONTENTS`) and every other field unchanged. The exact recipe source uses the whole can with its liquid; a current Canadian Unico pinto product is sold in 540 mL, and Metro’s English and French pages for the same product number list water among its ingredients. This is enough to classify the recipe’s stated product form, while leaving the recipe’s brand, can size, packing medium, mass, and yield unknown.

This advances only the held `canned with liquid` case within Section H’s form checklist. It does not close that checklist item or Section H. Add no density, unit mapping, package yield, conversion, substitution, or aquafaba identity.

## Checklist location and reconciliation with prior work

The global plan leaves the following Section H items open at [lines 2137–2141](../../RecipeBook-global-ingredient-catalog-plan.txt#L2230):

- `[ ] Whole/split and hulled/unhulled distinctions where meaningful.`
- `[ ] Dry, soaked, cooked, canned drained, canned with liquid, puréed/refried, and fermented forms as justified.`
- `[ ] Aquafaba and other bean cooking liquids as separate ingredients where used; never confuse them with the bean itself.`

The proposed pinto form is one substantiated instance under the second item. Keep the item open for the other pulse classes and states.

Prior work already established the pinto identity and its name: the active reference is `ingredient-ref-pinto-beans`, with `pinto beans / haricots pinto` and the OQLF-supported singular aliases `pinto bean / haricot pinto`. No identity change is proposed.

The [WP03 common-bean review](wp03-h-common-beans-unfinished-identities-review-20261011.md#L199) and accepted [WP04 pinto package review](wp04-pinto-beans-package-count-basis-review-20261010.md) both left `007#4` without a form. At that time, the reviewed evidence was the recipe line alone; the WP04 packet explicitly said not to infer a canned-with-liquid form, product size, or yield from that line. This packet reopens only that held form question because current product evidence now corroborates a commercially available canned pinto product whose listed ingredients include water. It preserves the earlier limit that the specific recipe can is unidentified.

Other completed forms remain out of scope: black beans canned/drained; chickpeas canned/drained and dried; Desi chickpeas split/dehulled and roasted split/dehulled; and kidney beans canned/rinsed/drained. The frozen peas-and-carrots mixture is an integrated, separate mixed-vegetable identity on `078#14`; it is not a pulse form. The reviewed dried azuki and dried yellow-pea recipe rows remain unchanged. No previous work is being duplicated.

## Pre-integration catalog, legacy, ledger, and name-collision audit

Snapshot taken on 2026-10-11 after the bracken-starch ledger update and before root's pinto-form integration:

| Area | Current state | Proposed-candidate audit |
|---|---|---|
| Active references | 1,029 rows; 42 are `LEGUME_AND_PULSE`. | `ingredient-ref-pinto-beans` exists, verified and distinct. No new identity is needed. |
| Active forms | 71 total; six attach to pulse references. | No form currently attaches to pinto beans. `ingredient-form-pinto-beans-canned-with-liquid` is unused. |
| Legacy candidates | 75 rows. | No legacy candidate contains or names pinto beans or a pinto canned-with-liquid product. |
| Research ledger | 1,319 records. | The only pinto record is `ingredient-ref-pinto-beans`, `ingredient_reference`, identity `verified`, measurement and substitution states `not_yet_researched`, with source `WP03-H-S07` (OQLF). No pinto form record exists yet. The form record and source IDs below were unused before integration. |
| Active pinto names | EN `pinto beans`, alias `pinto bean`; FR `haricots pinto`, alias `haricot pinto`. Density is null and unit mappings are empty. | Exact proposed names `canned pinto beans with liquid` / `haricots pinto en conserve, avec le liquide` and their specific match phrases have no exact collision in active reference names/aliases, active form labels/match terms, or legacy candidate names/aliases. The base phrase `pinto beans` remains owned by the active reference. |
| Recipe links and measurements | `007#4` links only to the pinto reference and has a package amount. | Add only `ingredientFormId`. Retain count 1, package type CAN, and requested basis NET_CONTENTS. No pinto package-yield record or general pinto measurement exists. |

The active reference and form counts include root’s frozen-peas-and-carrots integration. Candidate ID, exact bilingual names, and source IDs were rechecked against the live files before this report was written.

## Full recipe-corpus scan and exact row audit

The manifest contains **114 recipe files and 1,123 ingredient rows**. A whole-corpus scan for bean, pea, lentil, chickpea/garbanzo, edamame, soybean, azuki, pinto, kidney, split-pea, aquafaba, lupin/lupini, and pulse wording found five directly relevant rows:

| Row | Current ingredient wording and link | Disposition |
|---|---|---|
| `004#1` | `200 g dried azuki beans`; `ingredient-ref-azuki-beans`; English/French preparation `dried / séché`. | Existing azuki identity demand; no change in this pinto packet. |
| `007#4` | `1 can pinto beans with liquid`; `ingredient-ref-pinto-beans`; quantity 1, unit `can`; prep `with liquid / avec le liquide`; package count 1, type CAN, basis NET_CONTENTS. | Exact candidate. Add only the proposed pinto canned-with-liquid form link. |
| `034#9` | `540 ml kidney beans, rinsed and drained`; linked to `ingredient-form-kidney-beans-canned-drained-rinsed`; package amount 1 CAN, declared net 540 ml, basis DRAINED_MASS. | Already-form-linked kidney line; no change. |
| `078#14` | `1 cup frozen peas and carrots`; linked to `ingredient-ref-frozen-peas-and-carrots`. | Integrated frozen mixed-vegetable identity; exclude from pulse-form work. |
| `105#1` | `2 cups dried yellow peas`; `ingredient-ref-yellow-peas`. | Existing yellow-pea identity; no whole/split qualifier or pinto relevance. |

No other manifest row contains the searched pulse terms. Recipe 007 is the only exact pinto demand in the corpus.

## Integrated catalog and recipe changes

Root added the following form to `ingredient-forms.v1.json`:

```json
{
  "id": "ingredient-form-pinto-beans-canned-with-liquid",
  "ingredientRefId": "ingredient-ref-pinto-beans",
  "formCode": "canned_with_liquid",
  "labelFr": "haricots pinto en conserve, avec le liquide",
  "labelEn": "canned pinto beans with liquid",
  "prepState": "with_liquid",
  "matchTermsFr": [
    "haricots pinto en conserve, avec le liquide",
    "haricots pinto avec le liquide"
  ],
  "matchTermsEn": [
    "canned pinto beans with liquid",
    "pinto beans with liquid"
  ],
  "densityGPerMl": null,
  "notesFr": "La recette 007#4 demande la boîte entière avec son liquide. Une fiche canadienne actuelle pour les haricots pinto Unico de 540 mL indique de l’eau parmi les ingrédients. La marque, le format et le milieu de conditionnement de la boîte utilisée dans cette recette ne sont pas établis.",
  "notesEn": "Recipe 007#4 uses the whole can with its liquid. A current Canadian listing for Unico 540 mL pinto beans lists water among the ingredients. The brand, size, and packing medium of the can used in this recipe are not established.",
  "updatedAt": "2026-10-11T00:00:00Z"
}
```

Root added the form link to row `007#4` only:

```json
{
  "id": "4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-4",
  "originalText": "1 can pinto beans with liquid",
  "ingredientName": "pinto beans",
  "ingredientRefId": "ingredient-ref-pinto-beans",
  "ingredientFormId": "ingredient-form-pinto-beans-canned-with-liquid",
  "quantity": 1,
  "unit": "can",
  "preparation": {"fr": "avec le liquide", "en": "with liquid"},
  "packageAmount": {
    "count": 1,
    "packageType": "CAN",
    "requestedBasis": "NET_CONTENTS"
  }
}
```

This did not change `ingredient-ref-pinto-beans`, the source recipe text, quantity, package basis, or any amount. The form is descriptive of the recipe’s specified state; it does not assert that the recipe uses Unico or a 540 mL can.

## Integrated ledger record

Root appended one `ingredient_form` record and preserved the existing pinto reference record and its measurement state. The product-specific 540 mL observation below is not a transferable can size for row `007#4`, so no package amount or yield was inferred from it.

```json
{
  "recordId": "ingredient-form-pinto-beans-canned-with-liquid",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-H-PINTO-WITH-LIQUID-20261011-S01",
      "url": "https://www.ethanchlebowski.com/cooking-techniques-recipes/mexican-inspired-bento-box-lunch",
      "title": "Ethan Chlebowski, Mexican Inspired Bento Box Lunch",
      "accessedOn": "2026-10-11",
      "versionOrDate": "2023-02-05",
      "locator": "Refried Beans ingredient list and method",
      "supports": "The ingredient list specifies one can of pinto beans; the method says to add the whole can with the liquid. It supports the state used in this exact recipe, but gives no brand, SKU, can size, packing-medium type, or bean mass.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-H-PINTO-WITH-LIQUID-20261011-S02",
      "url": "https://www.unico.ca/nproducts.php?id=185",
      "title": "Unico, Pinto Beans",
      "accessedOn": "2026-10-11",
      "locator": "Product heading and availability; bilingual Nutrition Facts / Valeur nutritive",
      "supports": "The official product page lists Unico pinto beans available in 540 mL and shows bilingual nutrition information. It does not publish an ingredient list or identify the product used by recipe 007.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-H-PINTO-WITH-LIQUID-20261011-S03",
      "url": "https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/beans-legumes/pinto-beans/p/067800002832",
      "title": "Metro, Unico Pinto Beans 540 mL",
      "accessedOn": "2026-10-11",
      "locator": "Product number 067800002832; 540 mL listing; Ingredients",
      "supports": "The current English retail listing identifies a Canadian 540 mL Unico pinto product, product number 067800002832, and lists pinto beans and water among the ingredients. It does not establish that this SKU is used in recipe 007 or that the recipe’s unspecified liquid is water.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-H-PINTO-WITH-LIQUID-20261011-S04",
      "url": "https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/haricots-et-legumineuses/haricots-pinto/p/067800002832",
      "title": "Metro, Haricots pinto Unico 540 mL",
      "accessedOn": "2026-10-11",
      "locator": "Same product number 067800002832; French product title and ingredients",
      "supports": "The French view of the same current retail product identifies haricots pinto Unico 540 mL and lists haricots pinto and eau among the ingredients. This is the same retailer/SKU as S03, not an independent second product; it does not identify the recipe’s product or its packing medium.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add a pinto-bean canned-with-liquid form and link it only to recipe 007#4. The exact recipe source uses the whole can with liquid, and current Canadian bilingual listings establish that this product form exists. Do not infer the recipe can’s brand, SKU, size, packing medium, bean mass, or yield. Add no density, unit mapping, conversion, package-yield record, or substitution.",
      "sourceIds": [
        "WP03-H-PINTO-WITH-LIQUID-20261011-S01",
        "WP03-H-PINTO-WITH-LIQUID-20261011-S02",
        "WP03-H-PINTO-WITH-LIQUID-20261011-S03",
        "WP03-H-PINTO-WITH-LIQUID-20261011-S04"
      ]
    }
  ]
}
```

The CFIA’s [current common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) states that consumer-prepackaged food common names must appear in English and French. That general labeling rule is context only; the product-specific bilingual evidence is the same-code Metro English/French listing, while the existing OQLF source establishes the French pinto name. The two Metro pages are two locale views of one seller’s listing, not independent product corroboration.

## Evidence boundary and limits

- **Exact recipe demand:** Chlebowski’s ingredient list says “1 can of pinto beans”; its method says to add the whole can “with the liquid.” The live bundled line already stores `with liquid / avec le liquide` and a one-can `NET_CONTENTS` package amount.
- **Product evidence:** Unico’s official page lists a 540 mL pinto product and bilingual nutrition information. Metro’s current English/French pages use the same product number and list water / eau as an ingredient. The retailer currently marks it as a Canadian product. These sources show a current product example, not the brand or SKU in the recipe.
- **Product wording:** Keep the existing OQLF-supported `pinto beans / haricots pinto` identity. The proposed form labels describe the recipe’s added liquid state; they are not presented as a quoted retail package name.
- **Measurements:** Do not transfer 540 mL to recipe `007#4`. The recipe does not name a size or SKU. No source supplies can net contents for this line, drained mass, bean-to-liquid ratio, density, household measure, or post-simmer/mash yield. Leave `packingMedium` unspecified.
- **Other forms:** This packet does not add drained, soaked, cooked, or refried forms. The method’s simmering and mashing are recipe operations, and there is no measured output or reason to create a second form for this row.
- **Aquafaba and substitution:** The recipe uses bean liquid with the beans; it does not use the liquid separately. No aquafaba reference, form conversion, cross-pulse substitution, or ratio is proposed.

## Source review

| Source | Use and limit |
|---|---|
| [Ethan Chlebowski, Mexican Inspired Bento Box Lunch](https://www.ethanchlebowski.com/cooking-techniques-recipes/mexican-inspired-bento-box-lunch) | Current author page; ingredient list and refried-bean method. Direct support for exact `007#4` state only. It identifies no package size or brand. |
| [Unico, Pinto Beans](https://www.unico.ca/nproducts.php?id=185) | Official product page; lists 540 mL availability and bilingual nutrition information. It does not expose ingredients in the page text or identify the recipe product. |
| [Metro, Unico Pinto Beans 540 mL](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/beans-legumes/pinto-beans/p/067800002832) and [Metro, Haricots pinto Unico 540 mL](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/haricots-et-legumineuses/haricots-pinto/p/067800002832) | Current English and French views of product number `067800002832`; same 540 mL product and ingredient list with water / eau. Retailer data, subject to supplier updates; does not identify the recipe’s can or prove its liquid is water. |
| [OQLF, haricot pinto](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083587/haricot-pinto) | Existing source `WP03-H-S07` on the pinto reference; supports the base English/French pinto terminology. No canned form or measurement evidence. |
| [CFIA, Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) | Current authoritative context on English/French common-name requirements for consumer prepackaged products. General rule only; it does not itself establish pinto product contents. |

The root integration changed only the form, the linked recipe row, the research ledger, and documentation. No tests or emulator were run under the current data-only rule.

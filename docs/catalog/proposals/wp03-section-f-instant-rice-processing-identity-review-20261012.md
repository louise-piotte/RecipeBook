# WP03 Section F proposal: instant rice as a separate processing identity

**Review date:** 2026-10-12  
**Scope:** one bounded identity decision for plain, quick-cooking rice  
**Disposition:** accepted and integrated by root as one identity-only reference; no forms, measurements, conversions, yields, recipe links, or substitutions were added.

## Recommendation

Integrate **`quick-cooking rice / riz à cuisson rapide`** as a `GRAIN_AND_CEREAL` reference, with the source-supported aliases **`instant rice`** and **`riz instantané`**. This display pair follows current Canadian product wording; the bilingual federal rice specification uses the instant-rice pair for the same bounded process. Scope it to plain rice that is fully cooked and dehydrated after milling, then sold dry for fast final preparation. The specification distinguishes it from parboiled rice.

Keep this as one processing identity across rice types. Do not create instant-white, instant-brown, instant-basmati, or instant-long-grain rows; do not alias parboiled/converted rice, `riz précuit`, branded “Minute Rice,” or fully cooked microwave cups. The source evidence establishes identity and bilingual names, but not a general conversion or recipe substitution.

## Why this is a distinct open Section F candidate

The live Section F checklist leaves “other unresolved grain products” open. Its nearby completed decisions keep instant, flavoured, and composite products separate from hot cereals, while the 2026-10-10 residual rice audit only records that a query for `instant rice` introduces no new match. The existing parboiled-rice integration likewise explicitly excludes instant-rice wording from its aliases. These are boundaries, not a focused decision on whether instant rice merits its own identity.

I searched all proposal and batch text, active references and forms, the 64 legacy candidates, the 1,593-record research ledger, the plan, and the bundled manifest for `instant rice`, `quick-cooking rice`, `quick cooking rice`, `riz instantané`, `riz à cuisson rapide`, and `riz précuit`. No dedicated instant-rice proposal or active ownership exists. One residual-audit row mentions the unresolved phrase; the parboiled batch names it as an excluded alias. Neither establishes a separate instant-rice identity.

## Identity, names, and boundaries

The federal Department of National Defence rice specification describes instant rice as white or brown rice that has been completely cooked and dehydrated after milling; its French table calls it `riz précuit (riz instantané)`. It describes parboiled rice separately as soaked and steamed before milling, a process that hardens the grain without cooking it. This is a product-processing distinction, not a grain-length or milling-colour class.

Minute Rice Canada describes its quick-cook product as pre-cooked and dried. Its Canadian French site uses `riz instantané … à cuisson rapide` and lists `riz blanc à grains longs à cuisson rapide`, whole-grain brown, basmati, and jasmine quick-cook products. A Québec grocery listing independently uses `riz blanc à grains longs à cuisson rapide`. This evidence supports the proposed EN/FR names without importing a brand or a grain-type matrix.

| Keep within this identity | Keep separate or inactive |
| --- | --- |
| Plain instant rice sold dry after cooking and dehydration | Ordinary dry rice and its existing dry/cooked forms |
| `quick-cooking rice`; `instant rice` | Parboiled/converted rice (`ingredient-ref-parboiled-rice`); do not use `riz précuit` as an alias because it is ambiguous in the reviewed rice materials |
| `riz à cuisson rapide`; `riz instantané` | White/brown, grain-length, basmati, jasmine, and other rice varieties as separate attributes; do not create compound rows or aliases |
| Any plain rice variety supported by the generic process identity | Fully cooked, seasoned, pouch, or microwave-cup rice, including ready-to-serve cups; these are prepared products with different moisture/ingredient states |
|  | `Minute Rice`, `Minute`, `minute rice`, and other trademarks or product-line wording |
|  | Flavoured/composite products, rice cereal, rice flour, rice flakes, and prepared rice dishes |

### Integrated catalog delta

The active catalog contains this reference:

```json
{
  "id": "ingredient-ref-instant-rice",
  "nameFr": "riz à cuisson rapide",
  "nameEn": "quick-cooking rice",
  "aliasesFr": ["riz instantané"],
  "aliasesEn": ["instant rice"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

No form row was added. The ingredient is a processed product identity; attaching a generic `dry` form would not encode a supported conversion or make it equivalent to raw milled rice. `precooked rice / riz précuit`, `Minute Rice`, shortened “quick rice,” specific rice varieties, and other aliases remain inactive.

## Exact live ownership and pre-integration snapshot

As of 2026-10-12, the live owner of the generic ingredient is `ingredient-ref-rice` (`rice / riz`), with `ingredient-form-rice-dry` and `ingredient-form-rice-cooked`. Other relevant identities include `ingredient-ref-white-rice` (`white rice / riz blanchi`, with dry and cooked forms), `ingredient-ref-parboiled-rice` (`parboiled rice / riz étuvé`), and the separate long-, medium-, and short-grain rice references. None contains an instant/quick-cook alias. There is no active instant-rice reference or form, no matching legacy candidate, and no ledger record for this identity. The recipe owners below remain assigned to their existing references and forms.

| Live file | Count / coverage | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,286 references | `d1beaa8f10bab6f322aff6c4994c7badc61761706916c8d324b8cd13d889aec2` |
| `ingredient-forms.v1.json` | 97 forms | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| `manifest.v1.json` | 114 manifest-listed recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 64 candidates; no instant-rice match | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,593 records; no instant-rice identity record | `ecc7df79b2f3b32b1f8d58bcc81cfb109e76f47def60c7cde38e21b640dda863` |

The complete manifest recipe corpus is 753,792 raw bytes and 1,123 ingredient rows. Its digest is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`, computed as SHA-256 over each manifest-listed relative recipe path, a NUL byte, its raw file bytes, and a trailing NUL byte, in manifest order.

## Picker behavior and search impact

The recipe ingredient picker constructs `IngredientReferenceSearchIndex` from the active references and forms (`RecipeEditorScreen.kt`, `IngredientSearch.kt`). Search lowercases, folds accents and punctuation, prefers a complete word phrase, then falls back to substring matching. Forms contribute their labels and match terms to reference results, but a form hint is selected only for an explicit full form phrase. I replayed those rules against the live snapshot; no application or emulator tests were run for this proposal-only review.

| Query | Current matches | With proposed row | Result |
| --- | ---: | ---: | --- |
| `instant rice` | 0 | 1 | Exact candidate phrase |
| `quick-cooking rice` / `quick cooking rice` | 0 | 1 | Hyphen folds to the same candidate phrase |
| `riz instantané` | 0 | 1 | Exact candidate French phrase |
| `riz à cuisson rapide` | 0 | 1 | Accent-folded candidate French phrase |
| `rice` | 47 | 48 | Broad result list grows by one |
| `riz` | 43 | 44 | Broad result list grows by one |
| `instant` | 3 | 4 | Candidate joins instant coffee, instant oats, and instant yeast |
| `quick` | 2 | 3 | Candidate joins quick oats and instant yeast |

The exact proposed phrases are unowned now. The broad `rice` and `riz` queries already return many different rice products and related pantry references; the added result is expected for an ingredient picker, but should not become an alias on generic rice or parboiled rice. With no forms, the proposed row produces no form hint.

## Full bundled recipe-demand scan

I scanned every manifest-listed recipe’s full bilingual text and all 1,123 ingredient rows for `instant rice`, quick-cook/cooking rice, `Minute Rice`, precooked/pre-cooked rice, `riz instantané`, `riz à cuisson rapide`, and `riz précuit`. There are **zero direct candidate mentions or ingredient rows**. The corpus’s complete rice/riz ingredient-row results are below; none supports instant-rice demand:

| Recipe file / title | Ingredient line | Current ownership |
| --- | --- | --- |
| `040-croustillant-chocolate-et-noix-chocolate-nutty-crisp-798352ab-d4ad-4e5d-9c90-f0484609bca2.v1.json` — Chocolate Nutty Crisp / Croustillant au chocolat et aux noix | `6 cups crispy rice cereal` | `ingredient-ref-rice-cereal`; cereal, not rice grain |
| `066-korean-soy-marinated-jammy-eggs-e0a437cb-da80-4fd5-954d-87caf3b299e7.v1.json` — Korean Soy-Marinated Jammy Eggs / Œufs mollets marinés à la sauce soya à la coréenne | `Cooked white rice, for serving` | `ingredient-ref-white-rice` + `ingredient-form-white-rice-cooked` |
| `086-poulet-au-beurre-butter-chicken-1d0098bc-da72-40b3-ab68-d128d7ba0c3c.v1.json` — Butter Chicken / Poulet au beurre | `cooked rice, for serving` | `ingredient-ref-rice` + `ingredient-form-rice-cooked` |
| `090-ragout-aux-arachides-africain-african-peanut-stew-89f89f5e-4afc-4e3a-b37f-e7841ac24ff8.v1.json` — African Peanut Stew / Ragoût aux arachides africain | `cooked rice, for serving` | `ingredient-ref-rice` + `ingredient-form-rice-cooked` |
| `093-riz-frit-fried-rice-2a2a7481-b5dc-45a5-9733-e3885d682131.v1.json` — Fried Rice / Riz frit | `1/3 cup cooked rice` | `ingredient-ref-rice` + `ingredient-form-rice-cooked` |

The `1/3 cup` in the fried-rice recipe is a single cooked-rice recipe quantity. It neither identifies instant rice nor defines a dry-to-cooked ratio. The other four rows also provide no instant-rice amount or product specification.

## Measurement, conversion, and substitution limits

- Add no density, cup/spoon-to-mass mapping, unit mapping, serving mass, cooked yield, or dry-to-cooked ratio. The federal specification defines process and product scope, not household measures.
- Minute Rice’s five-minute preparation claim, package sizes, and package-specific directions describe that manufacturer’s product/SKUs. Do not generalize them to other instant-rice brands or encode a time, water ratio, or package yield.
- Add no conversion between instant rice and ordinary dry rice, white rice, brown rice, or parboiled rice. Similar grain types do not establish a process/form conversion or yield.
- Add no substitution rule. No bundled recipe calls for instant rice, and no reviewed source gives a general replacement ratio or method for using it in a recipe written for conventional rice.
- Do not equate dried instant rice with shelf-stable ready-to-serve cups/pouches. The reviewed Canadian products distinguish quick-cook dried rice from fully cooked, microwave-ready products.

## Source register

All sources accessed 2026-10-12. Government specifications and manufacturer/retailer pages support the bounded identity and terminology; their scope limits are stated per source.

| ID | Source | Supports and limits |
| --- | --- | --- |
| `WP03-IRICE-20261012-S01` | Department of National Defence, [Food Quality Specifications — Food Purchased by Federal Government Departments: Rice (FQS-22)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf), 2018-04-01, §§3–4 and rice-type table. | Defines instant rice as white or brown rice cooked and dehydrated before packaging; separately describes the parboiled/converted process. This is a federal purchasing specification, not a current consumer-label regulation or a full manufacturing standard. It gives no general household measurement or substitution. |
| `WP03-IRICE-20261012-S02` | Department of National Defence, French [Spécifications de la qualité des aliments — aliments achetés par les ministères fédéraux : Riz (FQS-22)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf), 2018, table “Type de riz / Caractéristiques.” | Uses `Riz précuit (riz instantané)` for white or brown rice fully cooked and dehydrated after milling. Supports the French identity term and process; the ambiguous standalone phrase `riz précuit` is therefore not proposed as an alias. Same federal procurement scope as S01. |
| `WP03-IRICE-20261012-S03` | Minute Rice Canada, [Quick Cook Long Grain White](https://www.minuterice.ca/products/instant-long-grain-white-rice/), product description, preparation, and ingredient list. | Current Canadian product page calls the SKU “Quick Cook Long Grain White,” lists pre-cooked rice as its ingredient, and describes a five-minute preparation. The page is a brand-specific example, not a universal cooking rule, density, or product definition. |
| `WP03-IRICE-20261012-S04` | Minute Rice Canada, French [À propos de nous](https://www.minuterice.ca/fr/a-propos-de-nous/), paragraph describing quick-cook rice and cups. | Uses `riz à cuisson rapide` and `riz instantané Minute Rice`; describes quick-cook rice as precooked and dried, and separately describes microwave cups. Supports Canadian French wording and the dry/cup boundary for this brand; not an independent terminology standard. |
| `WP03-IRICE-20261012-S05` | Minute Rice Canada, French [Produits](https://www.minuterice.ca/fr/produits/), category headings and product list. | Separates `Coupes` from `Cuisson Rapide` and lists quick-cook white long-grain, whole-grain brown, basmati, and jasmine products. This supports the Canadian product class and confirms that grain types should not be multiplied into separate instant identities; manufacturer taxonomy only. |
| `WP03-IRICE-20261012-S06` | Maxi Québec, French [Riz blanc à grains longs à cuisson rapide Minute Rice, 700 g](https://www.maxi.ca/fr/riz-blanc-grains-longs-cuisson-rapide/p/20310858_EA?source=sptd). | Search-indexed current listing title/description corroborates Québec retail wording and a Canadian grocery SKU. Direct page retrieval failed during this review; do not use it for current stock or package claims. |
| `WP03-IRICE-20261012-S07` | Metro, [Minute Rice Ready-to-Serve Basmati Rice](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/plats-d-acccompagnements/accompagnement-a-base-de-pomme-de-terre-et-riz/riz-basmati-pret-a-servir/p/059100008614). | Canadian retailer page identifies a fully cooked, one-minute ready-to-serve cup with water, rice, oil, salt, and lecithin. The French URL redirects to English content. Supports keeping prepared cups distinct; no general availability or recipe conversion is inferred. |

## Evidence limits and final delta

No direct OQLF or TERMIUM entry for instant rice was located in this review. The bilingual federal specification gives an explicit EN/FR process name, and Canadian manufacturer plus Québec-market retail wording independently support `quick-cooking rice / riz à cuisson rapide`. The evidence is sufficient for a narrow identity-only reference; it does not settle a universal technical standard for every instant-rice product.

**Integrated delta:** `ingredient-ref-instant-rice` is active with `quick-cooking rice / riz à cuisson rapide`, aliases `instant rice / riz instantané`, category `GRAIN_AND_CEREAL`, null density, and empty unit mappings. Its ledger record stores the seven reviewed sources, no-supported-value measurement state, no-supported-substitute finding, and accepted identity decision. No form, recipe link, conversion, yield, density value, or substitution rule was added. The checklist and roadmap entry are in the [integration batch README](../batches/wp03-section-f-instant-rice-identity-integration-20261012/README.md).

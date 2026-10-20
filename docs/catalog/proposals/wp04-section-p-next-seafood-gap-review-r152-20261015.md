# WP04 Section P — Shirasu identity review (R152)

- **Reviewed / sources accessed:** 2026-10-15.
- **Recommendation:** Add identity-only **shirasu / shirasu** as **ingredient-ref-shirasu**, category **PROTEIN**. Use the source product name in both display languages; add only the source-backed English aliases **boiled shirasu** and **Japanese whitebait**.
- **Identity scope:** A Japanese market product class of small immature fish sold as shirasu, not one fish species. Canadian listings identify frozen, cooked Japanese whitebait as shirasu. Keep the identity separate from the New Zealand multi-species whitebait product and the active anchovy and sardine species rows. Do not turn raw, boiled/dried, mildly dried, semi-dried, or sheet-dried presentations into forms here.
- **Status at proposal handoff:** This is the only artifact written for R152. No shared reference/form JSON, legacy identity, ledger, recipe, generated source, plan, roadmap, or archive file was changed. No Gradle, test, emulator, app, or deployment work was run.
- **Proposed source IDs:** **WP04-SECTIONP-SHIRASU-R152-20261015-S01** through **S06**. All six were absent from the live ledger and proposal/batch archive before drafting.

## Why this is the next unfinished candidate

The active [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) leaves both regional fish and preserved-fish/product-state work open. Shirasu is a currently marketed Japanese seafood product with Canadian retail listings and a clear product-class distinction from the active fish species. The R151 scallop review is excluded; the focused search across the current proposal and integration archive found no prior shirasu, chirimen-jako, or shirasu-product review, hold, or integration. Earlier uses of `whitebait` are boundary mentions concerning the separate New Zealand whitebait and smelt decisions, not a shirasu review.

The live catalog at handoff has **1,520 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,865 ledger records / 7,875 source entries / 6,730 distinct source IDs**. No active reference, form, legacy candidate, or ledger record owns `ingredient-ref-shirasu`, `shirasu`, `boiled shirasu`, `Japanese whitebait`, `chirimen-jako`, `chirimen`, `shirasuboshi`, `sardine fry`, `baby sardine`, or `baby anchovy`. The only exact active `whitebait` owner is `ingredient-ref-new-zealand-whitebait`; related but distinct active records are `ingredient-ref-anchovy`, `ingredient-ref-anchovy-paste`, `ingredient-ref-pacific-sardine`, and `ingredient-ref-european-pilchard`. No exact shirasu or chirimen phrase is owned by a form, legacy candidate, or earlier proposal/batch. No proposed source-ID collision was found.

## Canadian and Québec wording, product, and taxon boundary

Current Canadian sellers use **shirasu** on Japanese seafood products. JFoodie lists **Komatsu Shirasu Whitebait Fish 1KG**, identifies Japan as origin and frozen as the storage state, and describes the fish as Japanese whitebait (Shirasu), fully cooked and ready to eat after thawing. The seller offers delivery in the Greater Toronto Area and other Ontario cities. Suzuya in Burnaby currently lists **Kanemo Kamaage Shirasu** and states “whitebait, young anchovy”; its product text also says “fried,” so this review uses that page as evidence of the Canadian product wording only, not as a verified preparation method. Fukuya Foods in Richmond lists **Awaji Island Boiled Shirasu** as a 200 g item, but the page showed it sold out when reviewed. These listings establish Canadian market usage, not continuous stock or Québec availability. [S03–S05]

The Ministry of Agriculture, Forestry and Fisheries describes chirimen-jako as “sardine fry and other immature white fish boiled with salt and dried,” and says that it is called **shirasu** in the Kanto region. Japan’s MEXT food-composition notes treat whitebait as a product group and distinguish raw whitebait, boiled-and-dried shirasuboshi, mild-dried and semi-dried products, and tatamiiwashi sheets; the notes discuss Japanese anchovy and Japanese pilchard among the fish involved. This evidence supports a regional market product class, not an identity for *Engraulis japonicus*, *Sardinops melanostictus*, or another one taxon. [S01–S02]

No Québec retail listing or OQLF entry for **shirasu** was found in this bounded search. OQLF translates English **whitebait** as **blanchaille**, but its entry describes that word as derogatory for small fish of little food or fishing value and also as fish used for bait. I therefore do not use `blanchaille` as a food name. Retaining **shirasu** in the French display is a conservative borrowed product label present in Canadian product wording; it is not presented as an OQLF-normalized term. No French aliases are proposed. [S03–S06]

Keep `Japanese anchovy`, `young anchovy`, `baby anchovy`, `sardine fry`, `baby sardine`, and the species names off this row: the official Japanese material spans more than one fish group, and a Canadian retailer’s descriptive “young anchovy” label does not assign a taxon. Keep `chirimen-jako`, `shirasuboshi`, `mild dried`, `semi-dried`, `tatamiiwashi`, and raw/fresh preparation wording out of the alias and form lists. MAFF uses the shirasu/chirimen-jako names regionally, while MEXT distinguishes several products and states; merging all of these under aliases or forms would erase those boundaries. The proposed `Japanese whitebait` alias is the exact qualified Canadian retailer wording and does not make the unqualified `whitebait` phrase a synonym for this row.

## Exact ownership and picker projection

The picker normalizes accents and punctuation, matches complete word phrases across bilingual reference names, aliases, and form terms, then falls back to substring matching ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The projection adds only the proposed display and aliases.

| Query | Current results | With proposed row | Projection |
|---|---:|---:|---|
| **shirasu** | 0 | 1 | Finds the Japanese market product name. |
| **boiled shirasu** | 0 | 1 | Finds the Canadian retailer’s exact product wording. |
| **Japanese whitebait** | 0 | 1 | Finds the qualified Canadian product phrase. |
| **whitebait** | 1 | 2 | Remains a multi-result search across New Zealand whitebait and shirasu; no bare `whitebait` alias is added. |
| **anchovy** | 2 | 2 | The existing anchovy and anchovy-paste results remain unchanged. |
| **young anchovy / Japanese anchovy / baby anchovy** | 0 | 0 | Source descriptions are not promoted to taxonomic aliases. |
| **sardine** | 2 | 2 | Existing European pilchard and Pacific sardine results remain unchanged. |
| **sardine fry / baby sardine / chirimen-jako / shirasuboshi** | 0 | 0 | Nearby product or taxon terms remain unassigned. |

The exact owned English phrase `whitebait` stays on `ingredient-ref-new-zealand-whitebait`; its French display remains `whitebait de Nouvelle-Zélande`. `ingredient-ref-anchovy`, `ingredient-ref-anchovy-paste`, `ingredient-ref-pacific-sardine`, and `ingredient-ref-european-pilchard` retain their present names and aliases. No form term or legacy candidate owns any proposed shirasu phrase. The proposed aliases create qualified paths to the new row while preserving broad picker choices.

## Bundled-recipe demand

The complete scan parsed all **114** manifest-listed recipe files and **1,123** ingredient rows. It searched the full recipe JSON and ingredient rows for shirasu, boiled shirasu, Japanese whitebait, whitebait, chirimen/chirimen-jako, shirasuboshi, sardine fry, baby sardine, baby anchovy, and young/Japanese anchovy wording. **No candidate-term hit was found.** No recipe link or recipe-line change is proposed.

## Forms, measures, and substitutions

The 1 kg JFoodie package and the Fukuya 200 g SKU are retailer-specific net package amounts, not kitchen measures or portion weights. The MAFF at-home example uses 2 teaspoons of the seasoned composite **chirimen-sansho**, not 2 teaspoons of plain shirasu. No source establishes a reusable volume, piece count, density, cooking yield, or package-to-recipe conversion for shirasu. Use **defaultDensity: null** and **unitMappings: []**; add no measurement observation, form, conversion, package yield, recipe link, or substitution.

No reviewed source or bundled recipe establishes an interchangeable quantity between shirasu and anchovy, sardine, New Zealand whitebait, or another seafood. Record substitution research as **researched_no_supported_substitute**; add no global conversion, contextual substitution, or recipe-line link.

## Proposed reference delta

~~~json
{
  "id": "ingredient-ref-shirasu",
  "nameEn": "shirasu",
  "nameFr": "shirasu",
  "aliasesEn": [
    "boiled shirasu",
    "Japanese whitebait"
  ],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
~~~

No ingredient form, measure, conversion, yield, recipe link, or substitution rule is proposed.

## Proposed ledger delta

~~~json
{
  "recordId": "ingredient-ref-shirasu",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-SHIRASU-R152-20261015-S01",
      "url": "https://www.maff.go.jp/e/policies/market/dento_syoku/menu/tirimen_sansyo.html",
      "title": "Japan Ministry of Agriculture, Forestry and Fisheries, Chirimen Sansho | Traditional Foods in Japan",
      "versionOrDate": "Current page retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Product overview; History and culture; the linked at-home Chirimen hiyayakko recipe.",
      "supports": "Defines chirimen-jako, called shirasu in the Kanto region, as sardine fry and other immature white fish boiled with salt and dried. This supports the regional market name and product-class boundary, not one species. The linked dish uses 2 teaspoons of seasoned chirimen-sansho, not plain shirasu, so that amount is not a reusable measure.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SHIRASU-R152-20261015-S02",
      "url": "https://www.mext.go.jp/component/english/__icsFiles/afieldfile/2017/12/20/1385123_Notes-on-food_r11.pdf",
      "title": "Japan Ministry of Education, Culture, Sports, Science and Technology, Notes on Foods (Chapter 3)",
      "versionOrDate": "2015 composition-table notes; accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Chapter 3, sardines/whitebait, PDF pages 140–142; entries and notes for raw whitebait, shirasuboshi, mild-dried, semi-dried, and tatamiiwashi.",
      "supports": "Treats whitebait as a product group, distinguishes raw and several dried presentations, and describes Japanese anchovy and Japanese pilchard in relation to small-fry products. This supports keeping the identity species-neutral and not collapsing preparation states into active forms.",
      "sourceKind": "food_composition"
    },
    {
      "sourceId": "WP04-SECTIONP-SHIRASU-R152-20261015-S03",
      "url": "https://jfoodie.ca/products/komatsu-shirasu-whitebait-fish-1kg",
      "title": "JFoodie, Komatsu Shirasu Whitebait Fish 1KG",
      "versionOrDate": "Current Canadian retailer page retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Product title and details: Japan origin, frozen, 1 kg net weight, Japanese whitebait (Shirasu), fully cooked and ready to eat after thawing.",
      "supports": "Current Canadian retailer wording supports shirasu and the qualified English alias Japanese whitebait. The frozen state, cooked state, and 1 kg package are specific to this listed SKU and are not a reusable ingredient form or kitchen measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-SHIRASU-R152-20261015-S04",
      "url": "https://suzuya.ecwid.com/Kanemo-Kamaage-Shirasu-p598920816",
      "title": "Suzuya Japanese Market, Kanemo Kamaage Shirasu",
      "versionOrDate": "Current retailer listing retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Product title, Burnaby business address, displayed stock count, and product description.",
      "supports": "A Canadian retailer lists the Japanese market name Kanemo Kamaage Shirasu and parenthetically describes it as whitebait/young anchovy. The page’s additional word fried is not used to establish the processing state or a species identity.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-SHIRASU-R152-20261015-S05",
      "url": "https://fukuya.ca/products/boiled-shirasu",
      "title": "Fukuya Foods, Awaji Island Boiled Shirasu",
      "versionOrDate": "Current Canadian retailer page retrieved 2026-10-15; page showed sold out",
      "accessedOn": "2026-10-15",
      "locator": "Product title, description of boiling soon after landing, 200 g size, and availability status.",
      "supports": "Supports the exact retail phrase boiled shirasu and a Canadian Japanese-seafood product example. Its 200 g package and boiled state are SKU-specific; the item was sold out when reviewed and is not evidence of continuous stock.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-SHIRASU-R152-20261015-S06",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8883127/blanchaille",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, GDT, blanchaille",
      "versionOrDate": "Last updated 1984; accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Definition and English translations for blanchaille / whitebait.",
      "supports": "Lists blanchaille as a translation of whitebait, but defines it as a derogatory term for small fish of little food/fishing value and as a small white fish often used as bait. This does not support blanchaille as a Québec culinary display for shirasu; the proposed French display retains the Japanese product name.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only shirasu / shirasu as a source-bounded Japanese market product class, with the exact Canadian retailer phrases boiled shirasu and Japanese whitebait. MAFF describes the relevant immature-fish product group without fixing one species; MEXT distinguishes the raw, boiled/dried, and other dried presentations. Keep bare whitebait on the existing New Zealand whitebait row, where the proposed qualified alias intentionally makes whitebait a two-result picker query. Keep species phrases, chirimen-jako, shirasuboshi, and state-specific forms out of the new row. The bundle has no matching demand. Retail package weights and the seasoned chirimen-sansho recipe quantity do not establish a reusable measure, conversion, yield, recipe link, or substitution.",
      "sourceIds": [
        "WP04-SECTIONP-SHIRASU-R152-20261015-S01",
        "WP04-SECTIONP-SHIRASU-R152-20261015-S02",
        "WP04-SECTIONP-SHIRASU-R152-20261015-S03",
        "WP04-SECTIONP-SHIRASU-R152-20261015-S04",
        "WP04-SECTIONP-SHIRASU-R152-20261015-S05",
        "WP04-SECTIONP-SHIRASU-R152-20261015-S06"
      ]
    }
  ]
}
~~~

No measurement observation or substitution finding is proposed. The 1 kg and 200 g retail package facts remain SKU-specific source evidence only.

## Root integration disposition (R152)

Accepted and added identity-only `shirasu / shirasu` with the qualified English aliases `boiled
shirasu` and `Japanese whitebait`. Bare `whitebait` remains on New Zealand whitebait. No French
aliases, forms, reusable measures, recipe links, conversions, yields, or substitutions were added.
See the [R152 integration README](../batches/wp02-wp03-wp04-r152-gap-review-integration-20261015/README.md).

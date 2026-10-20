# WP02 Section 04 A6 R151 — Brown Teff Flour Identity Review

## Review record

- **Reviewed and sources accessed:** 2026-10-15.
- **Status at proposal handoff:** Proposal only. The reviewer changed no catalog, form, legacy, ledger, recipe, checklist, roadmap, or generated data.
- **Root disposition:** Accepted and integrated in R151 on 2026-10-15; the shared reference, ledger, checklist, roadmap, and generated index now contain the approved row.
- **Scope:** One unallocated Canadian flour-market name: **Brown Teff Flour**, separately listed from Ivory Teff Flour by an Ontario maker.
- **Open checklist item:** [WP02 Section 04 A6, “Continue the A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours”](../../RecipeBook-global-ingredient-catalog-plan.txt#L1399).
- **Source-ID prefix:** WP02-A6-BROWN-TEFF-FLOUR-R151-20261015-S (S01–S04).

## Recommendation

**Accept one identity-only reference for “brown teff flour / farine de teff brun,” scoped to the source-attested Canadian flour-market name.** Ontario Made lists Berhan Grains’ 1 lb Brown Teff Flour as a product made in Ontario, with separate Brown Teff Grain and Ivory Teff Flour listings [S01]. A Food and Beverage Ontario profile says Berhan cold-stone-mills imported teff on demand in Barrie and identifies brown and ivory teff grains as source materials [S02]. This supports a distinct named product in the Canadian market. It does not establish a universal teff color taxonomy, a botanical variety, a different milling method, or equivalence among every product called brown teff flour.

Use “farine de teff brun” as a concise French catalog display. A French-language Canadian flour listing describes a whole-grain teff flour as made from “teff brun à grains entiers” [S03], and a Huntingdon, Québec bakery lists “teff brun” within a flour-ingredient declaration [S04]. These sources support the Québec/Canadian wording components, but neither is a standalone Québec flour package titled exactly “farine de teff brun,” and no OQLF ruling for this color-qualified flour name was found. The display is a source-informed catalog rendering, not a claimed exact product label or preferred-term ruling.

Add no aliases. Keep the existing generic teff flour, ivory teff flour, and teff grain rows separate. Add no form, density, unit mapping, conversion, recipe link, or substitution.

The [R150 ivory-teff review](wp02-a6-next-regional-flour-gap-review-r150-20261015.md) names Brown Teff Flour only as a sibling product and explicitly says it did not assess whether that sibling merited its own catalog identity. A full-text archive search found no earlier focused brown-teff-flour review or disposition. R149 reviewed wild-rice flour, a separate grain and product. This R151 packet makes the deferred Brown Teff Flour question its sole scope.

## Product and identity boundary

| Candidate or nearby identity | Recommendation | Evidence boundary |
|---|---|---|
| Brown teff flour / farine de teff brun | **Add** as an identity-only FLOUR_AND_STARCH reference. | Berhan’s current Ontario Made product listing names Brown Teff Flour separately from Ivory Teff Flour. The French display is supported by French-language flour and flour-ingredient contexts, not by a standalone Québec bag title [S01–S04]. |
| Generic teff flour / farine de teff | Keep on ingredient-ref-teff-flour. | The general flour identity remains useful for unqualified products; do not add “brown” as an alias to that row. |
| Ivory teff flour / farine de teff ivoire | Keep on ingredient-ref-ivory-teff-flour. | This separate Canadian flour-market name was integrated after R150. Keep it distinct from the Brown Teff Flour product. |
| Teff grain / teff d’Abyssinie | Keep on ingredient-ref-teff-grain. | Grain and flour remain separate. Do not add “brown teff” or “teff brun” to the grain row from this flour review. |
| Whole-grain teff flour | Keep the whole-grain qualifier source-specific. | Walmart Canada’s French listing is for a whole-grain teff flour described as made from brown teff. It does not establish that every Brown Teff Flour product is whole-grain [S03]. |
| Multigrain flour blends and finished breads | Keep separate from this single-grain flour identity. | The Québec bakery source is a finished bread whose mixed-flour ingredient declaration includes teff brun; its 650 g is the finished bread size, not teff flour [S04]. |
| Malted, sprouted, roasted, or other processed teff flours | Keep outside this identity. | This review concerns only the plain source-named Brown Teff Flour product. The existing malted-teff hold remains a distinct, experimental process candidate. |

## Proposed reference JSON delta

This is the complete proposed reference object. No existing row should be edited.

    {
      "id": "ingredient-ref-brown-teff-flour",
      "nameFr": "farine de teff brun",
      "nameEn": "brown teff flour",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-15T00:00:00Z",
      "category": "FLOUR_AND_STARCH"
    }

The proposed French display intentionally does not include “à grains entiers”: that qualifier belongs to the Walmart product listing and is not established for Berhan’s separately named Brown Teff Flour. No regional spelling, Latin name, brand, or broad color synonym is added as an alias.

## Canadian and Québec source review

| Source | Locator and evidence | What it supports and does not support |
|---|---|---|
| **S01 — Ontario Made, [1 lb. Brown Teff Flour — Berhan Grains Inc](https://supportontariomade.ca/explore-products/1-lb-brown-teff-flour)** | Product heading and description; “Proudly made in Ontario by”; sibling listings. Accessed 2026-10-15. | Exact Canadian product name “1 lb. Brown Teff Flour”; the page says it is made in Ontario and lists Brown Teff Grain, Ivory Teff Flour, and a 5 lb Brown Teff Flour listing separately. Its suggested uses and flavor descriptions are seller guidance, not a universal process, taxonomy, measurement, or substitution. The 1 lb amount is a package size. |
| **S02 — Food and Beverage Ontario, [Berhan: Celebrating Ethiopian & Eritrean Culture with Teff](https://foodandbeverageontario.ca/foodtalks/celebrating-ethiopian-eritrean-culture-with-teff/)** | Profile of Berhan Grains; teff sourcing, brown and ivory grain, and its Barrie, Ontario milling operation. Accessed 2026-10-15. | Corroborates that Berhan’s brown and ivory products are teff-based and that its flour is milled on demand in Ontario. It does not establish a standardized color class, botanical variety, or French product label. |
| **S03 — Walmart Canada, [Goodeats Farine de Teff à Grains Entiers, 600 g](https://www.walmart.ca/fr/ip/Goodeats-Farine-de-Teff-Grains-Entiers-600-g/1PUVSCBZ0VLO?classType=REGULAR)** | French listing title and item details; the indexed listing says “Fait de teff brun à grains entiers,” shows a current price and Add to Cart control, and names Pilling Foods Inc as seller. Accessed 2026-10-15; direct page open returned a cache miss. | Canadian French product wording directly links teff brun with a flour product. It is a whole-grain teff flour listing, not evidence of the exact standalone title “farine de teff brun,” a Québec-specific preference, or Berhan’s product specification. The 600 g is net package weight, not a kitchen measure. |
| **S04 — Wheatless Wonder, [Le Moelleux](https://wheatlesswonder.com/fr/boutique/le-moelleux/)** | Current French product page for a 650 g finished bread from the Huntingdon, Québec bakery; ingredient declaration reads “farine de (sorgho, pois chiche-gourgane, teff brun).” Accessed 2026-10-15; the indexed product page was available, while a direct page open returned an internal fetch error. | Québec food-market use of “teff brun” within a flour-ingredient list. It is a mixed-flour bread, not a standalone teff-flour package or exact title. Its 650 g is finished-product weight and does not state the teff-flour amount. |
| **Existing R150 source IDs, reused:** WP02-A6-IVORY-TEFF-FLOUR-R150-20261015-S01 and S02 | Ontario Made’s Ivory Teff Flour sibling listing and Berhan manufacturer listing, already registered for the R150 teff-market review. | Rechecked as corroboration for the separate Brown/Ivory product family. Do not duplicate those URLs under new ledger source IDs. |

## Live catalog, archive, exact ownership, and picker audit

At proposal handoff, the read-only snapshot contained **1,517 ingredient references, 119 ingredient forms, 61 legacy-import candidates, and 1,862 research-ledger records**. The manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Finding |
|---|---|
| Active references | ingredient-ref-teff-flour owns “teff flour / farine de teff”; ingredient-ref-teff-grain owns “teff / teff d’Abyssinie” plus the existing French search aliases “tef” and “graines de teff”; ingredient-ref-ivory-teff-flour owns “ivory teff flour / farine de teff ivoire.” At proposal handoff, no active reference owned Brown Teff Flour or the proposed French display. |
| Forms | No form, form label, or form match term is teff-related. No flour form or process state is proposed. |
| Legacy identities | At proposal handoff, no legacy candidate owned the proposed reference ID or exact normalized phrases “brown teff flour,” “farine de teff brun,” or “teff brun.” |
| Research ledger | The generic teff flour, teff grain, ivory-teff-flour, and unrelated puffed-teff candidate records are present. At proposal handoff, no record ID existed for ingredient-ref-brown-teff-flour or candidate-brown-teff-flour. R150’s ivory-flour record mentions Brown Teff Flour as a sibling comparator, but contains no Brown-flour identity decision. |
| Proposal and batch archive | R150 is the only focused A6 archive packet that mentions Brown Teff Flour; it explicitly deferred the identity decision. Searches found no previous focused “farine de teff brun” review, Brown Teff Flour hold, or corresponding integration. The candidate ID and R151 source-ID prefix are unused. |
| Exact normalized phrase ownership | The proposed ID ingredient-ref-brown-teff-flour and proposed display terms “brown teff flour” and “farine de teff brun” had no exact owner at proposal handoff across reference names/aliases, form labels/match terms, legacy names/aliases, or ledger record IDs. Existing broader owners remain ingredient-ref-teff-flour for “teff flour / farine de teff,” ingredient-ref-ivory-teff-flour for the ivory-qualified terms, and ingredient-ref-teff-grain for the grain. |
| Recipe corpus | The 114 manifest-listed JSON recipe files and 1,123 ingredient rows were searched for Brown Teff Flour wording, “farine de teff brun,” “teff brun,” the generic teff-flour terms, and the proposed ID. There are zero lexical hits, zero ingredient-row hits, and zero direct links to the existing teff grain or flour references. No bundled recipe demand or recipe link is proposed. |

The static picker projection applies the phrase-first and partial-match behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses the existing reference/form data plus the proposed displays with empty aliases; it is a package projection, not a runtime picker test.

| Query | Before proposal | After proposal | Effect |
|---|---:|---:|---|
| “brown teff flour” | 0 | 1 | Finds only ingredient-ref-brown-teff-flour. |
| “farine de teff brun” | 0 | 1 | Finds only the proposed Brown Teff Flour row. |
| “teff brun” | 0 | 1 | Finds the proposed row through its French display. |
| “brown teff” | 0 | 1 | Finds the proposed row through its English display. |
| “teff flour” | 2 | 3 | Adds Brown Teff Flour beside generic and ivory teff flour. |
| “farine de teff” | 2 | 3 | Adds Brown Teff Flour beside generic and ivory teff flour. |
| “teff” | 3 | 4 | Adds Brown Teff Flour beside teff grain, generic teff flour, and ivory teff flour. |
| “teff d’Abyssinie” | 1 | 1 | Remains exclusive to the teff-grain reference. |

## Measures and substitutions

- Berhan’s Ontario Made page lists 1 lb and 5 lb Brown Teff Flour products [S01]. Those are package masses, not household measures or paired mass-volume observations.
- Walmart’s 600 g flour package and Wheatless Wonder’s 650 g finished loaf are not measures of teff flour used in a recipe [S03–S04].
- No Brown Teff Flour source reviewed here provides a cup/spoon-to-mass quantity, bulk density, unit mapping, cooking yield, or conversion. Keep defaultDensity null and unitMappings empty.
- Berhan’s listed uses include injera, breads, brownies, muffins, and pancakes, but the reviewed listing gives no replacement ratio [S01]. The formula advice and 1/4 cup (35 g) serving on Bob’s Red Mill’s generic Teff Flour product, cited in the existing [malted-teff boundary review](wp02-a7-malted-teff-flour-boundary-review-20261013-round37.md), are tied to that maker’s unqualified product. They do not identify Brown Teff Flour and are not transferred.
- No source establishes a reusable global or contextual substitution for brown teff flour. Add no substitution rule, recipe-line link, or yield.

## Proposal-local static checks

After writing, verify that this file is UTF-8 without BOM, has no trailing whitespace or mojibake, its proposed JSON delta parses, its local Markdown links resolve, and it is the only file changed for this task. No Gradle, test, emulator, app, or deployment checks are in scope.


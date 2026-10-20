# WP03 Section F — Black quinoa grain identity review (R151, 2026-10-15)

- **Status at proposal handoff:** Proposal only; the reviewer changed no shared catalog, ledger, checklist, roadmap, recipe, or generated-index data.
- **Root disposition:** Accepted and integrated in R151 on 2026-10-15; the shared reference, ledger, checklist, roadmap, and generated index now contain the approved row and source-specific evidence.
- **Open checklist:** The broad Section F identity and terminology review remains open; its current checklist leaves “other unresolved grain products” in scope. This is a whole-grain product review, not a new flour, form, or cereal-mix review ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L519)).
- **Scope:** Review black quinoa sold as an intact edible grain, separately from generic quinoa, black quinoa flour, and mixed-colour quinoa products.
- **Recommendation:** Add identity-only **black quinoa / quinoa noir** as a `GRAIN_AND_CEREAL` reference. Keep aliases, forms, active measures, density, unit mappings, conversions, cooking yields, recipe links, and active substitutions empty.
- **Source-ID prefix:** `WP03-BLACKQUINOA-R151-20261015-S` (S01–S07). The proposed reference ID and source prefix were checked against the current active package, forms, legacy candidates, ledger, and proposal/batch archive; neither is allocated.

## Gap and live package

The Section F parent remains open. No earlier proposal or integration packet was found that reviews **black quinoa as a standalone whole-grain product**. The nearby records cover different scopes:

- WP02 A6 reviewed white, red, and black **quinoa flours**, including `black quinoa flour / farine de quinoa noir`; it did not review intact black quinoa grain.
- R150 integrated **red quinoa / quinoa rouge** as a separate grain identity. Its black-quinoa mentions concern a tricolour product boundary; R150 did not review black-only quinoa as a standalone grain.
- Existing references for quinoa flakes, puffed quinoa, generic quinoa, and red/white/tricolour product mixes remain separate products.

At proposal handoff, the live package contained **1,517 ingredient references, 119 forms, 1,862 ledger records, and 114 manifest-listed recipes**. Relevant active rows are:

| Active identity | Category | Boundary |
| --- | --- | --- |
| `ingredient-ref-quinoa` — `quinoa / quinoa` | `GRAIN_AND_CEREAL` | Generic quinoa, with the existing dry and cooked forms. |
| `ingredient-ref-black-quinoa-flour` — `black quinoa flour / farine de quinoa noir` | `FLOUR_AND_STARCH` | Milling product; it is not intact grain. |
| `ingredient-ref-red-quinoa` — `red quinoa / quinoa rouge` | `GRAIN_AND_CEREAL` | Separate colour-qualified grain product integrated at R150. |
| `ingredient-ref-quinoa-flakes`, `ingredient-ref-puffed-quinoa` | `GRAIN_AND_CEREAL` | Flattened and puffed products, respectively. |
| `ingredient-ref-quinoa-flour`, `ingredient-ref-roasted-quinoa-flour`, `ingredient-ref-white-quinoa-flour` | `FLOUR_AND_STARCH` | Other named milling products. |

No active reference represents black quinoa grain. The proposed row describes a marketed colour-qualified grain product; it does not claim a separate species, cultivar, origin, or universal cooking property.

## Product identity and Québec French display

Current Québec product listings establish both the standalone product and the French display **quinoa noir**. Pot-Étique, a bulk-food retailer in Saint-Jean-sur-Richelieu, lists `Quinoa noir biologique - 100gr` and gives the ingredient as `Quinoa royal noir biologique` [S02, S03]. Its Tootsi item is listed as available when checked. Épices Anatol's Montréal grain catalogue lists `Quinoa noir biologique` alongside separate generic, red, three-colour, and flake quinoa products [S04, S05]. The independent Canadian Ambrosia listing titles a 454 g product `Organic Black Quinoa` and lists only organic black quinoa as its ingredient [S06]. Together, these sources support the plain English and Québec French displays without carrying over brand, organic, package-size, or origin claims.

OQLF identifies *quinoa* as a masculine noun and describes its edible seeds as those of *Chenopodium quinoa*; it also classifies quinoa as a pseudocereal [S01]. The Québec product listings directly attest `quinoa noir`, with masculine agreement. This is evidence for current local wording, not a claim that OQLF has approved the full colour-qualified compound as a separate preferred term. Keep the classification consistent with the existing `quinoa` row (`GRAIN_AND_CEREAL`).

Keep this identity separate from:

- generic quinoa and its current dry/cooked forms;
- black quinoa flour and the other quinoa flours;
- red quinoa, which is a distinct current grain product;
- tricolour quinoa, a mixture whose listed ingredients include white, red, and black quinoa; and
- quinoa flakes or puffed quinoa.

Do not add `royal`, `organic`, `Tootsi`, `black quinoa flour`, or mixture names as aliases. Do not imply that a black-quinoa ingredient line means tricolour quinoa.

## Proposed reference

If accepted, add this identity-only row to the bundled references:

```json
{
  "id": "ingredient-ref-black-quinoa",
  "nameFr": "quinoa noir",
  "nameEn": "black quinoa",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Do not add forms. The existing dry and cooked quinoa forms remain attached only to the generic quinoa row; the current bundle has no black-quinoa recipe line or source-established generic dry-to-cooked conversion/yield.

## Exact ownership and picker impact

At proposal handoff, the accent-, case-, punctuation-, and ligature-normalized exact-key audit covered all active reference names and aliases, all form labels and match terms, every legacy-candidate name and alias, and ledger record IDs. Neither `black quinoa` nor `quinoa noir` has an exact current owner. The longer exact terms `black quinoa flour` and `farine de quinoa noir` are owned by `ingredient-ref-black-quinoa-flour`. No form or legacy candidate owns the proposed phrases or ID; no black-quinoa-grain ledger record or candidate ID exists. At proposal handoff, the proposed ID `ingredient-ref-black-quinoa` and the R151 source-ID prefix had no collision.

The projection below follows `IngredientReferenceSearchIndex` complete-word-phrase matching, with substring fallback only when no complete phrase matches. The proposed row uses only its two display names:

| Query | Current results | With proposed row | Expected picker behavior |
| --- | --- | --- | --- |
| `black quinoa` | `ingredient-ref-black-quinoa-flour` | black-quinoa flour and black-quinoa grain | Colour-qualified query offers both clearly named product states. |
| `quinoa noir` | `ingredient-ref-black-quinoa-flour` | black-quinoa flour and black-quinoa grain | French query offers flour and intact grain. |
| `black quinoa flour` | black-quinoa flour | unchanged | Flour-qualified query stays flour-only. |
| `farine de quinoa noir` | black-quinoa flour | unchanged | Flour-qualified French query stays flour-only. |
| `quinoa` | 9 quinoa-family references | 10 references | Broad family query gains the new grain choice. |
| `quinoa rouge` / `red quinoa` | red quinoa grain and red quinoa flour | unchanged | Existing red-grain/flour distinction is preserved. |
| `quinoa flakes` | quinoa flakes | unchanged | Flakes remain separate. |

The short black-quinoa query intentionally becomes a choice between grain and flour. No alias is proposed that would broaden or obscure this distinction.

## Bundled recipe demand

All **114 manifest-listed recipe files** and their **1,123 ingredient rows** were scanned for `black quinoa`, `quinoa noir`, `quinoa royal noir`, `black quinoa grain`, `quinoa noir en grains`, and the proposed ID. The scan found **zero matching files and zero matching ingredient rows**. Recipe 016 has the only structured quinoa ingredient line, `2 cups cooked quinoa`, already linked to generic `ingredient-ref-quinoa` and its cooked form. Recipe 018 mentions generic quinoa in a serving suggestion; neither recipe creates black-quinoa demand or warrants relinking.

## Measures and substitutions

- Pot-Étique's product model text reads `0211 Vrac avec service - Apportez vos contenants. Pot 1L=775gr` [S02]. This is a retailer- and container-specific pairing for its one-litre pot. If retained, it merits only a source-specific ledger `bulk_density` observation of the reported 775 g per 1 L pot; the listing gives no standardized filling or packing protocol and no repeat or independent measurement. Do not promote it to `defaultDensity` or a reusable unit mapping.
- Pot-Étique reports a **42 g nutrition-label serving** for its Tootsi product. This is a source- and product-specific portion, not a cup measure, count, density, or reusable mass-volume mapping [S02]. If the row is integrated, preserve it only as a ledger `portion_weight` observation for that Tootsi listing.
- The Pot-Étique preparation direction uses 250 ml (one stated cup) of quinoa with 440 ml (1¾ cups) water and a 15-minute simmer [S02]. It is product-specific cooking guidance, not an ingredient conversion or cooking-yield relation.
- A Québec recipe gives `200 g (1 cup)` black quinoa for its named tabbouleh [S07]. It is one recipe-published paired amount without a stated cup convention or fill method; retain it, if desired, only as a source-specific ledger observation. Do not turn it into active density, a general cup-to-mass mapping, or a generic portion.
- The generic quinoa forms have null densities and no unit mappings; their notes say no dry/cooked conversion or cooking yield is established. Do not copy those forms or infer a color-specific cooking yield.
- The recipe source says red quinoa may be used instead of black quinoa in that particular tabbouleh and cooked the same way [S07]. This supports only that named recipe's optional alternative, not a global or generally applicable contextual substitution. If retained, record it as a source-scoped substitution finding; do not add an active rule. The active global and contextual substitution-rule files contain no quinoa rule, and no bundled recipe line can be linked.

No source-specific amount, preparation direction, or one-recipe alternative is proposed as reusable active behavior. In particular, the one-litre pot pairing remains only a retailer/container-specific ledger observation, not a reusable ingredient density.

## Source register

Sources were checked on 2026-10-15. Product availability may change; all claims remain limited to the cited product or source.

| Source ID | Source | Evidence used and limits |
| --- | --- | --- |
| `WP03-BLACKQUINOA-R151-20261015-S01` | Office québécois de la langue française (OQLF), [quinoa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa), updated 2025. | Identifies *quinoa* as masculine and names *Chenopodium quinoa*; describes the seeds consumed as food and classifies quinoa as a pseudocereal. Supports the base French noun, gender, and existing catalog category, not a colour-specific product or cultivar. |
| `WP03-BLACKQUINOA-R151-20261015-S02` | Pot-Étique, [Quinoa noir biologique - 100gr](https://potetique.com/boutique/fr/tootsi/quinoa-royal-noir-bio-100gr-p179/), current French product listing. | Titles a Tootsi black-quinoa product, lists `Quinoa royal noir biologique` as the ingredient, shows it available, and displays the model text `0211 Vrac avec service - Apportez vos contenants. Pot 1L=775gr`, a 42 g nutrition serving, and package-specific preparation instructions. The Québec retailer location is confirmed by [its contact page](https://potetique.com/boutique/contact/). The pot pairing and 42 g portion remain separate, product/listing-specific ledger observations; neither supports a reusable density or measure. Brand, certification, origin, and cooking directions are not generalized. |
| `WP03-BLACKQUINOA-R151-20261015-S03` | Pot-Étique, [bulk-food store page](https://potetique.com/boutique/), current retailer information. | Identifies the retailer as a bulk-food shop in Saint-Jean-sur-Richelieu, Québec. It locates S02 in the Québec market; it says nothing about where the quinoa is grown. |
| `WP03-BLACKQUINOA-R151-20261015-S04` | Épices Anatol, [Grains](https://www.epicesanatol.com/fr/grains/), current French product-category page. | Lists separate black, red, three-colour, generic, and flaked quinoa products. Supports current Québec-facing French market wording and separation of the black-only product from mixed and processed products. It does not publish a black-quinoa package specification or measure. |
| `WP03-BLACKQUINOA-R151-20261015-S05` | Épices Anatol, [À propos](https://www.epicesanatol.com/fr/a-propos-de-nous/), current retailer information. | Identifies the retailer and address in Montréal's Petite Italie. Supports treating S04 as Québec-market evidence, not a claim about production origin. |
| `WP03-BLACKQUINOA-R151-20261015-S06` | Ambrosia Canada, [Organic Black Quinoa](https://canada.ambrosia.ca/products/organic-black-quinoa-1), current Canadian product page. | Titles a 454 g product `Organic Black Quinoa`, lists only organic black quinoa as its ingredient, and reports store availability in Ontario when checked. Supports the English single-grain product name; package size, organic status, and availability are not part of the proposed display. |
| `WP03-BLACKQUINOA-R151-20261015-S07` | ELLE Québec, [Taboulé de quinoa aux pois chiches et au halloumi épicés](https://www.ellequebec.com/style-de-vie/foodie/taboule-de-quinoa-aux-pois-chiches-et-au-halloumi-epices), 2021-04-01. | The recipe lists 200 g (1 cup) black quinoa and says red quinoa can be used instead and cooked the same way. These are recipe-specific amount and replacement notes, not a generic measure, cooking yield, or broad substitution rule. |

## Static review checks

- Read the current Section F checklist, the R150 and R149 proposal/integration records, earlier quinoa-flour proposals, and the relevant proposal/batch archive before selecting this candidate.
- Parsed the live reference, forms, legacy-candidate, ledger, and manifest-backed recipe data. Confirmed exact normalized ownership, proposed ID/source-prefix uniqueness, and no prior focused black-quinoa-grain review.
- Reproduced the current picker projection with the `IngredientReferenceSearchIndex` phrase-first behavior and the two proposed display names.
- Searched all 114 manifest-listed recipe files, all 1,123 ingredient rows, and serialized recipe contents; black-quinoa demand is zero.
- Reviewed current quinoa forms and active substitution files. Identified source-specific portions and one recipe-specific optional alternative, with no reusable active measure or substitution rule.
- At proposal handoff, this remained proposal-only. No Gradle, tests, emulator, app, or deployment checks were run.

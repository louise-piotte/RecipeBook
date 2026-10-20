# WP03 Section L R667 — Fresh tomato form review — 2026-10-18

- **Status:** Accepted and integrated in the R666–R669 coverage batch. Added the fresh form under generic tomatoes and linked only recipe 096#1.
- **Recommendation:** Add one fresh-market form under the existing generic tomato reference. Do not create a new tomato identity.
- **Boundary:** Use the explicit bilingual phrase “fresh tomatoes / tomates fraîches” only on the form. Keep existing generic aliases unchanged, and do not treat variety, size, or cutting as part of this form.
- **Numeric behavior:** No density, measure, unit mapping, conversion, package yield, or substitution is supported for generic use. Keep the existing source-specific raw-tomato portion and the pizza-sauce recipe’s canned alternative local to their sources.
- **Recipe boundary:** Recipe 096#1 is explicitly a fresh-tomato choice in its source context, where canned diced tomatoes are only a fallback. That one line is linked to the fresh form, preserving its wording, count, and diced preparation. Do not infer fresh from other ingredient lines alone.
- **Testing:** No software tests, build, emulator run, or deployment were performed because the accepted change only adds database JSON data, under AGENTS.md. Static package, ledger, picker, recipe-link, and encoding checks are recorded in the integration README.

## Why this is an open Section L item

The Section L parent checklist still names fresh, cherry, plum, canned, processed, and dried tomato products as identities/forms. Its R648 and R651 children now resolve sun-dried and oil-packed sun-dried presentations. The active package already has canned-diced, canned-whole, canned-crushed, sun-dried, and sun-dried-packed-in-oil forms under the generic tomato reference, plus separate cherry, plum, paste, purée, passata, sauce, juice, and other tomato-related identities. There is no fresh form. The R130 purée decision and the active passata identity remain separate from this review.

This proposal addresses only the open fresh-market product state under generic tomatoes. It does not reopen the other tomato forms or identities, and it does not make all tomato varieties, cuts, or recipe lines fresh by default.

See the [Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6142), [R648 proposal](wp03-section-l-sun-dried-tomato-form-review-r648-20261018.md) and [integration record](../batches/wp03-section-l-sun-dried-tomato-form-integration-r648-20261018/README.md), and [R651 proposal](wp03-section-l-oil-packed-tomato-form-review-r651-20261018.md) and [integration record](../batches/wp03-section-l-oil-packed-tomato-form-integration-r651-20261018/README.md).

## Current state and ownership audit

The live bundled reference and form arrays contained 1,837 references and 164 forms when checked. The package manifest listed 114 recipes. The tomato reference is **ingredient-ref-tomatoes**, displayed as **tomates / tomatoes**, categorized as **VEGETABLE_AND_AROMATIC**, with null default density and no unit mappings.

| Surface | Current owner and proposed treatment |
|---|---|
| Generic tomato reference | It owns the existing aliases: French “grosses tomates”, “tomate”, “tomate broyée”, “tomates broyées”, and “tomates entières”; English “crushed tomato”, “crushed tomatoes”, “tomato”, and “whole tomatoes”. Keep these aliases, category, default density, and mappings unchanged. |
| Tomato forms | Existing forms are canned diced, canned whole, canned crushed, sun-dried, and sun-dried packed in oil. No form currently owns the explicit fresh state or fresh-qualified bilingual phrases. Add only proposed ID **ingredient-form-tomatoes-fresh** under **ingredient-ref-tomatoes**. |
| Other tomato identities | Cherry and plum tomato, San Marzano PDO, paste, purée, passata, sauce, juice, ketchup, and prepared tomato products remain separate. Do not move or duplicate their aliases. |
| Legacy archive | The read-only archive search found no fresh-tomato candidate, alias, or proposed form ID to promote. |
| Research ledger | The generic tomato record already owns OQLF source **WP03-TC-20261009-S01** for “tomate / tomato” and a CNF portion observation for one raw, red-ripe whole tomato measuring 7.6 cm and weighing 182 g. Keep that observation on its existing record and qualifiers; do not turn it into a generic fresh-tomato measure. No fresh-form ledger record exists. |
| Proposed IDs | **ingredient-form-tomatoes-fresh** and new source IDs **WP03-L-TOMATO-FRESH-20261018-R667-S01** through **S05** were absent from the active catalog, archive, and ledger. Reuse the existing OQLF source ID instead of duplicating it. |

The open wording “tomate fraîche / fresh tomato” is a product-state description of the existing botanical ingredient, not evidence for a second identity. Existing catalog forms already use the fresh state code under produce references. Keep the new form attached to the generic tomato reference only.

## Evidence and Québec naming

The current CFIA fresh-fruit-and-vegetable labelling guide treats fresh produce as its own product category and separately discusses minimally processed fresh produce such as cut or chopped items. Its common-name guidance allows the generally known food name. It supports the product-state boundary, but it does not prescribe “fresh tomato” as a catalog alias, measure, or product formula. [S01]

Québec grower Savoura’s current manufacturer page lists its tomato products under “Tomates Savoura” and shows beefsteak, tomatoes on the vine, cocktail tomatoes, cherry tomatoes, and loose or packaged offerings. This confirms a current Québec fresh-market tomato range. It does not make the varieties aliases of generic tomatoes or establish a measure. [S02]

The French-language Walmart Canada fresh-tomato category is indexed as “Achetez des tomates fraîches en ligne à bas prix”; its result shows tomato retail listings. The corresponding English category is indexed as “Fresh tomatoes.” Direct opening of the French retail page redirected to a verification page during this review, so its current indexed title and product snippets support the exact label but not detailed product claims. [S03–S04]

The OQLF GDT entry **WP03-TC-20261009-S01** gives the base pair “tomate / tomato” and notes raw and cooked uses. It does not prescribe the compound “tomates fraîches”; this review reuses it only for the base identity. The fresh-qualified display is supported by current Québec retail wording and the French recipe source below.

Le Coup de Grâce’s current Québec pizza-sauce page says its preferred choice is ripe fresh tomatoes and presents canned diced tomatoes as a dépannage option. The ingredient list says four large tomatoes, cut into cubes. This directly supports fresh as the intended product state for that recipe; the page’s roughly 796 mL can-to-four-tomatoes comparison is specific to its pizza sauce and is not a general yield, conversion, or substitution. [S05]

Use the form labels **tomates fraîches / fresh tomatoes**, with the singular full phrases **tomate fraîche / fresh tomato** as form match terms. Do not add “tomatoes” or “tomate” again as fresh aliases, since they already belong to the generic identity. Do not add cherry, plum, Italian, Roma, San Marzano, beefsteak, greenhouse, field, large, ripe, diced, chopped, or peeled terms to the generic fresh form. The sources describe varieties and recipe preparation, not generic aliases or additional catalog states.

## Recipe demand and line boundary

A scan of all 114 manifest-listed recipe files and 1,123 ingredient rows found five tomato-related ingredient rows:

| Recipe row | Current wording and link | Proposed treatment |
|---|---|---|
| 034#8 | “798 ml canned diced tomatoes”; generic tomato ref with the canned-diced form | Keep unchanged. |
| 078#12 | “2 tbsp tomato paste”; separate tomato-paste ref | Keep unchanged. |
| 086#12 | “156 ml tomato paste”; separate tomato-paste ref | Keep unchanged. |
| 090#1 | “1 cup tomato sauce”; separate tomato-sauce ref | Keep unchanged. |
| 096#1 | “4 large tomatoes, diced”; generic tomato ref, no form link | Add only the proposed fresh-form link. Its ingredient wording by itself does not say “fresh”; the source context explicitly says fresh ripe tomatoes are preferred and canned diced tomatoes are a fallback. Keep the original text, count, and “large, diced” preparation. |

No other bundled ingredient row explicitly needs the fresh form. The external recipe page supports the row 096 contextual link only; it does not license applying fresh to every unqualified tomato row. The 182 g CNF observation is limited to its specified red-ripe whole tomato size. The pizza-sauce canned fallback and R128’s variety- and dish-scoped fresh/canned note remain local findings. Do not add a global fresh-to-canned rule, recipe substitution, or conversion.

## Picker projection

The projection follows the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized bilingual terms for each form are searchable through their owning reference, full word phrases are matched before substring fallback, and a form hint appears only when the complete query equals one form term. These projections compare the live 1,837-reference / 164-form snapshot with one proposed form:

| Query | Before → after | Exact result and effect |
|---|---:|---|
| “tomato” | 12 → 12 | Unchanged IDs: ingredient-ref-canned-sardines-in-tomato-sauce, ingredient-ref-cherry-tomato, ingredient-ref-goya-sofrito-tomato-cooking-base, ingredient-ref-green-tomato-ketchup, ingredient-ref-herring-fillets-in-tomato-sauce, ingredient-ref-ketchup, ingredient-ref-plum-tomato, ingredient-ref-tomato-juice, ingredient-ref-tomato-paste, ingredient-ref-tomato-puree, ingredient-ref-tomato-sauce, ingredient-ref-tomatoes. |
| “tomatoes” | 4 → 4 | Unchanged IDs: ingredient-ref-cherry-tomato, ingredient-ref-plum-tomato, ingredient-ref-pomodoro-san-marzano-pdo, ingredient-ref-tomatoes. |
| “tomate” | 7 → 7 | Unchanged IDs: ingredient-ref-canned-sardines-in-tomato-sauce, ingredient-ref-cherry-tomato, ingredient-ref-goya-sofrito-tomato-cooking-base, ingredient-ref-herring-fillets-in-tomato-sauce, ingredient-ref-plum-tomato, ingredient-ref-tomato-sauce, ingredient-ref-tomatoes. |
| “tomates” | 7 → 7 | Unchanged IDs: ingredient-ref-green-tomato-ketchup, ingredient-ref-passata, ingredient-ref-pomodoro-san-marzano-pdo, ingredient-ref-tomato-juice, ingredient-ref-tomato-paste, ingredient-ref-tomato-puree, ingredient-ref-tomatoes. |
| “fresh tomato”, “fresh tomatoes”, “tomate fraîche”, “tomates fraîches” | 0 each → 1 each | Each returns only ingredient-ref-tomatoes with ingredient-form-tomatoes-fresh as the exact form hint. |
| “fresh” | 30 → 31 | Adds ingredient-ref-tomatoes to the existing broad fresh-term result set because the new form contains the explicit word “fresh”. |
| “fresh tomatoes diced” | 0 → 0 | No result: “diced” is recipe preparation, not part of the form label or match terms. |
| “canned tomatoes” | 1 → 1 | Still returns only ingredient-ref-tomatoes, with no form hint because canned diced, whole, and crushed forms share the broad phrase. |

The exact generic search sets stay unchanged. The new form makes a user’s explicit fresh phrase selectable without making singular/plural generic tomato queries return additional identities. Cherry and plum identities remain distinct; generic fresh wording does not add fresh aliases to those variety rows.

## Proposed data snippet

If accepted, add one object to the bundled ingredient-forms JSON:

    {
      "id": "ingredient-form-tomatoes-fresh",
      "ingredientRefId": "ingredient-ref-tomatoes",
      "formCode": "fresh",
      "labelFr": "tomates fra\u00eeches",
      "labelEn": "fresh tomatoes",
      "prepState": "fresh",
      "matchTermsFr": ["tomate fra\u00eeche"],
      "matchTermsEn": ["fresh tomato"],
      "densityGPerMl": null,
      "notesFr": "Forme de tomates vendues fra\u00eeches. L\u2019\u00e9tat frais ne pr\u00e9cise pas la vari\u00e9t\u00e9, la taille, la maturit\u00e9, l\u2019origine ou la coupe; la pr\u00e9paration reste distincte. Aucune densit\u00e9, mesure, conversion ou substitution g\u00e9n\u00e9rale n\u2019est \u00e9tablie.",
      "notesEn": "Fresh-market tomato form. Fresh state does not specify variety, size, ripeness, origin, or cut; preparation remains separate. No general density, measure, conversion, or substitution is established.",
      "updatedAt": "2026-10-18T00:00:00Z"
    }

For recipe 096#1, the only proposed recipe JSON change is to add the property **ingredientFormId** with value **ingredient-form-tomatoes-fresh** to that existing ingredient object. Preserve **originalText**, quantity, unit, ingredient reference, and preparation.

If current Québec label evidence cannot be reverified at integration, hold the fresh-qualified form match terms rather than adding broad aliases to the generic tomato reference. No other state or numeric claim depends on those terms.

## Source register and ownership

New source IDs below are proposed for the fresh-form ledger record. The existing OQLF source remains owned by the generic tomato record and should be referenced by ID, not copied as a new ledger source.

| Proposed source ID | Source and locator | Bounded support |
|---|---|---|
| WP03-L-TOMATO-FRESH-20261018-R667-S01 | Canadian Food Inspection Agency, [Labelling requirements for fresh fruits or vegetables](https://inspection.canada.ca/en/food-labels/labelling/industry/fresh-fruits-vegetables), accessed 2026-10-18; “Overview,” “Common name,” “Grade name,” and Table 1, including minimally processed produce and field/greenhouse tomato size designation. | Fresh produce is a distinct regulatory category and cut/chopped produce is treated as minimally processed fresh produce. This is state-boundary context, not a tomato alias, kitchen measure, or form formula. |
| WP03-L-TOMATO-FRESH-20261018-R667-S02 | Savoura, [Tomates Savoura](https://savoura.com/marques/tomates-savoura/), current Québec manufacturer page, accessed 2026-10-18; product listings for beefsteak, tomatoes on the vine, cocktail, cherry, and four-count tomatoes. | Confirms a current Québec fresh-market range and retail packaging examples. Does not support merging varieties, aliasing their names, or adding measures. |
| WP03-L-TOMATO-FRESH-20261018-R667-S03 | Walmart Canada, [French fresh-tomato category](https://www.walmart.ca/fr/browse/epicerie/fruits-et-legumes-frais/legumes-frais/tomates/10019_6000194327370_6000194327412_6000202948377), indexed title “Achetez des tomates fraîches en ligne à bas prix”; accessed 2026-10-18. Search result included tomato retail products; direct page opening redirected to a verification page. | Supports the exact current Québec-facing retail category phrase “tomates fraîches.” Detailed listing content was not treated as directly verified. |
| WP03-L-TOMATO-FRESH-20261018-R667-S04 | Walmart Canada, [English fresh-tomato category](https://www.walmart.ca/en/browse/grocery/fruits-vegetables/fresh-vegetables/tomatoes/10019_6000194327370_6000194327412_6000202948377), indexed as “Fresh tomatoes”; accessed 2026-10-18. | Supports the English display used for the matching Canadian retail category. Retail wording only; no product composition or measure is inferred. |
| WP03-L-TOMATO-FRESH-20261018-R667-S05 | Le Coup de Grâce, [La meilleure sauce à pizza maison italienne](https://lecoupdegrace.ca/recette/sauce-a-pizza-maison/), current Québec recipe page, accessed 2026-10-18; tips on fresh tomatoes and canned diced fallback, ingredient list, and tomato FAQ. | Supports fresh state for recipe 096#1 in source context. Its 796 mL-to-about-four-large-tomatoes comparison belongs to this pizza sauce only; it does not establish a reusable amount or general substitute. |
| Reuse WP03-TC-20261009-S01 | OQLF, [GDT: tomate](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082628/tomate); owned by the generic tomato record; “Terme privilégié” and English term, last updated 1991. | Supports the existing base pair “tomate / tomato” and raw/cooked use. It does not establish the fresh-qualified compound phrase. |
| Reuse WP04-WP12-CNF-2026-PRODUCE-20261011-TOMATO | Health Canada, [Canadian Nutrient File 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109); owned by the generic tomato record; Food_Code 2460, Measure_Code 1298, Measure Type 6, and the matching measure-weight row. | Records one large whole raw red-ripe year-round-average tomato, 7.6 cm diameter, as 182 g. The observation remains source- and size-qualified; recipe 096 says “large” without diameter or cultivar, so do not assign this mass to that line or to the fresh form generally. |

No source is used to claim a generic fresh-tomato weight, volume, density, preparation, or substitution. The existing CNF 182 g observation stays source-specific on the generic tomato ledger record. The integrated ledger owner is record ID **ingredient-form-tomatoes-fresh**, record type **ingredient_form**, identity state **verified**, measurement state **not_yet_researched**, and substitution research state **not_yet_researched**.

## Static acceptance checks reviewed during integration

- Confirm the proposed form ID is unique, belongs to ingredient-ref-tomatoes, and uses the existing fresh form/preparation state codes.
- Confirm source IDs S01–S05 are unique in the ledger and preserve the existing OQLF source ownership.
- Keep the generic reference aliases, category, null density, and empty unit mappings unchanged; do not create a separate tomato identity.
- Validate the bundled package and ledger, and regenerate/check the catalog index for freshness.
- Recompute the exact picker projections above, including the four generic query sets and the single added result for “fresh”.
- Link only recipe 096#1 if the source-context boundary is accepted; preserve its line text, quantity, unit, and diced preparation. Keep 034#8 canned-diced and the paste/sauce rows unchanged.
- Keep the raw CNF portion and the pizza-sauce fallback source-specific. Add no generic measure, density, mapping, package yield, conversion, or substitution.
- Store French accents and apostrophe symbols as explicit Unicode escapes in bundled JSON; check UTF-8/no BOM, local proposal links, and scoped whitespace.
- No software tests, build, emulator run, or deployment are required for this database-JSON-only integration.


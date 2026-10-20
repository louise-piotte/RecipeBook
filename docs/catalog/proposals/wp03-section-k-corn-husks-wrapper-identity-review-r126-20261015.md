# WP03 Section K corn-husk wrapper identity review (R126)

- **Reviewed:** 2026-10-15.
- **Status:** Integrated on 2026-10-15 as an identity-only reference and one dried form. See the [integration README](../batches/wp03-section-k-corn-husks-wrapper-identity-integration-r126-20261015/README.md).
- **Scope:** Decide whether corn husks used to wrap tamales need a distinct ingredient identity and whether the dried product state should be represented as a form. Select narrow English and Québec-French picker terms.
- **Recommendation:** Add `ingredient-ref-corn-husks`, displayed as `corn husks / enveloppes de maïs`, with singular and source-attested `feuille(s) de maïs` aliases. Add one `dried` form for the commercial dried tamale-wrapper product. Do not make corn husks aliases of corn kernels, corn on the cob, banana leaves, or generic wrappers. Leave densities, mappings, recipe links, and substitutions empty.
- **Source-ID prefix:** `WP03-K-CORN-HUSKS-IDENTITY-20261015-R126-S`; checked against the current ledger and proposal/batch files before drafting.

## Unresolved Section K question

The [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) still lists corn husks among open culinary wrapping and aromatic leaves, and cautions that not all wrappers are eaten. The R125 banana-leaf proposal and integration handled a separate plant part; they do not resolve corn husks. No active corn-husk reference or form, legacy candidate, focused proposal, or ledger decision was found. Current identities for corn kernels, corn on the cob, corn flour, cornmeal, and corn starch describe different ingredients or preparations and do not cover the outer leaves of an ear.

At the final inventory refresh during this review, the package contained 1,473 ingredient references, 105 forms, and 1,814 ledger records (7,506 source entries / 6,384 distinct source IDs). This was the proposal snapshot before integration.

## Proposed catalog entry

| Field | Recommendation |
|---|---|
| Reference ID | `ingredient-ref-corn-husks` |
| English display | `corn husks` |
| Québec-French display | `enveloppes de maïs` |
| English aliases | `corn husk` |
| French aliases | `enveloppe de maïs`; `feuille de maïs`; `feuilles de maïs` |
| Category | `VEGETABLE_AND_AROMATIC`, as a plant-part reference in Section K. This internal category does not claim that the wrapper is eaten. |
| Default density | None |
| Unit mappings | None |

Add this one useful form under the reference:

| Form field | Recommendation |
|---|---|
| Form ID / code | `ingredient-form-corn-husks-dried` / `dried` |
| English label | `dried corn husks` |
| Québec-French label | `enveloppes de maïs séchées` |
| English match term | `dried corn husk` |
| French match terms | `enveloppe de maïs séchée`; `feuille de maïs séchée`; `feuilles de maïs séchées` |
| Preparation state | `dry` |
| Density | None |

The form identifies a source-attested dried wrapper product, which is soaked before use. Keep an unqualified corn-husk reference as the base identity; do not create a separate “fresh husks” reference. The Québec recipe evidence below uses leaves still attached to fresh ears, but the bundle has no such line that needs a fresh-state hint. Do not infer a fresh-to-dried conversion or yield.

## Evidence and limits

The French-language page for Montréal’s Marché Andes describes tamales from Colombia, El Salvador, and Peru wrapped in banana leaves, then separately describes Mexican tamales wrapped in corn leaves and steamed. It gives the venue address as 436 Bélanger Est, Montréal [S02]. This is direct local-market evidence for the food use, the French phrase `feuilles de maïs`, and the distinction from banana leaves. It is a restaurant menu, not evidence that a package of raw husks is currently in stock.

Quesada’s Canadian French guide calls the wrappers `enveloppes de maïs` and also uses `feuilles de maïs`. It says they are soaked in hot water until flexible, the masa is spread on the leaves, and the wrappers are removed before eating [S03]. This supports the display wording and wrapper role; it is corporate culinary guidance, not a Quebec retailer listing or a botanical standard. RICARDO’s Québec French recipe describes keeping the leaves intact on eight ears, removing the corn, soaking the leaves, and spreading the masa on the inside of the `enveloppes de maïs`; its accompanying note also uses `feuilles de maïs` [S04]. That page labels the recipe content as advertising rather than editorial, so treat it as one recipe instance and terminology evidence only. Its eight ears and eight portions do not establish a reusable count conversion.

New Mexico State University Cooperative Extension explicitly identifies one pound of `hojas (dried corn husks)`, says the item can be purchased at local markets, and instructs cooks to soak it in hot water before spreading masa on the husks and steaming the tamales [S01]. This supports a distinct dried form and its preparation role. The recipe’s one-pound quantity and yield of about six dozen medium tamales are tied to that formula and do not establish a general mass-per-husk, package yield, serving conversion, or density. The market reference is to New Mexico, not current Quebec availability.

The terminology sources do not establish an OQLF ruling for the exact plant-part name. Use `enveloppes de maïs` as a clear Québec-French display supported by Canadian French culinary use, retain the local Montréal wording `feuille(s) de maïs` as aliases, and do not claim either phrase is the single standardized term.

## Picker projection

The projection follows the app’s accent-folding and complete-word-phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a static projection over the 1,473-reference / 105-form proposal snapshot, not live picker QA.

| Query | Current results | With proposal | Picker effect |
|---|---:|---:|---|
| `corn husk`; `corn husks` | 0 | 1: corn husks | Both qualified English phrases select the proposed identity. |
| `dried corn husks` | 0 | 1: corn husks, with `dried` form hint | Retains the product state without creating a second identity. |
| `enveloppe(s) de maïs`; `feuille(s) de maïs` | 0 | 1: corn husks | The Canadian and local French phrases resolve to the same plant part. |
| `enveloppe(s) de maïs séchée(s)`; `feuille(s) de maïs séchée(s)` | 0 | 1: corn husks, with `dried` form hint | The complete phrase identifies the dried wrapper state. |
| `corn` | 26 | 27 | Broad English search gains one choice among corn kernels, on-the-cob corn, flour, meal, starch, oil, and other corn products. |
| `maïs` | 28 | 29 | Broad French search gains one choice among corn foods and preparations. |
| `feuille`; `feuilles` | 5; 30 | 6; 31 | French broad leaf searches gain one result; the `de maïs` phrases keep the proposed aliases qualified. |
| `maize` | 4 | 4 | No `maize husk` alias is proposed, so the existing maize set stays unchanged. |
| `banana leaf`; `feuille de bananier` | 1 each | 1 each | Existing banana-leaf identity remains separate. |

Do not add bare `corn`, `maïs`, `leaf/leaves`, or `feuille(s)`, nor generic `tamale wrapper`, `food wrapper`, `husks`, `cosses de maïs`, or `pelures de maïs`. Broad terms would match many existing ingredients or blur edible corn, husk plant parts, and wrappers made from other leaves. The active alias set does not need `maize husk`: the reviewed English culinary sources use `corn husk`, and the qualified bilingual terms already give a direct path to the item.

## Bundle demand and recipe matches

I scanned all 114 manifest-listed recipe files and their 1,123 ingredient rows. No recipe title or ingredient row mentions corn husks, maize husks, `enveloppe(s) de maïs`, `feuille(s) de maïs`, or tamales, and no row links to a corn-husk identity. There is no direct bundled recipe demand or recipe link to add.

The local restaurant menu and external recipes show culinary use outside the bundle. They do not justify a count, volume, mass, conversion, or substitution rule in the absence of a matching bundle line and transferable evidence.

## Alias, form, measurement, and substitution decisions

| Catalog behavior | Recommendation |
|---|---|
| Identity | Add one corn-husk plant-part identity, separate from corn kernels/on-the-cob corn and from banana leaves. |
| Aliases | Use `corn husk`; `enveloppe de maïs`; and source-attested `feuille de maïs` / `feuilles de maïs`. Keep generic corn, husks, leaves, and wrapper terms out. |
| Form | Add only the `dried` form, with narrow complete bilingual terms. Leave the unqualified reference as the base identity; no separate fresh identity or fresh form is needed for the current bundle. |
| Density / volume-to-mass | None. The one-pound extension-recipe quantity is not a general volume measure or mass per leaf. |
| Unit mapping / count | None. No source establishes a standard count per ear, package, mass, or tamale. |
| Yield / conversion | None. Do not convert fresh attached husks to dried husks or generalize the one-pound / six-dozen recipe ratio. |
| Substitution | None. Do not map corn husks to banana leaves. Marché Andes documents different wrapper choices by tamale tradition; it does not establish interchangeability. |
| Recipe links | None; the bundled corpus has no matching row. |

## Source register

| Source ID | Source | Evidence used and limits |
|---|---|---|
| `WP03-K-CORN-HUSKS-IDENTITY-20261015-R126-S01` | New Mexico State University Cooperative Extension, Bernalillo County, [Tamales](https://bernalilloextension.nmsu.edu/documents/tamale-recipe.pdf). | Calls for one pound of dried corn husks available at local markets, instructs soaking and wrapping, and reports about six dozen tamales from the recipe. Primary university extension guidance; local market and recipe quantity are New Mexico/formula-specific, not Quebec availability or a reusable conversion. |
| `WP03-K-CORN-HUSKS-IDENTITY-20261015-R126-S02` | Marché Andes, Montréal, [Restaurant](https://www.marcheandes.com/restaurant/). | Current French-language local menu distinguishes Latin American tamales wrapped in banana leaves from Mexican tamales wrapped in corn leaves and steamed; address shown as 436 Bélanger Est, Montréal. Primary local culinary-market evidence, not a raw-husk retail listing. |
| `WP03-K-CORN-HUSKS-IDENTITY-20261015-R126-S03` | Quesada, [Tout sur les tamales](https://quesada.ca/fr/tout-sur-les-tamales/), published 2022-01-07. | Canadian French uses `enveloppes de maïs` and `feuilles de maïs`, describes hot-water soaking, and says wrappers are removed before eating. Corporate guide, not an OQLF terminology ruling or product-availability listing. |
| `WP03-K-CORN-HUSKS-IDENTITY-20261015-R126-S04` | RICARDO, [Tamales aux crevettes](https://www.ricardocuisine.com/recettes/3287-tamales-aux-crevettes). | Québec French recipe preserves leaves on corn ears, soaks them, and uses them to enclose masa/filling; the page states the material was advertising and not editorial. Recipe-specific handling and eight-ear quantity only; no general unit mapping. |

## Static checks

- Confirmed the candidate has no exact active reference, form, legacy-candidate row, or earlier focused proposal; the `WP03-K-CORN-HUSKS-IDENTITY-20261015-R126-S` prefix did not exist in the ledger or reviewed proposal/batch files.
- Confirmed the 114-recipe / 1,123-row bundle scan and picker counts against the proposal-time reference/form snapshot; no shared catalog or ledger values changed during the review.
- Checked the four linked source pages for the cited names and wrapper use. Each source’s role and limits are recorded above.
- No app, Gradle, unit, instrumentation, emulator, or deployment tests were run; integration only adds database JSON data under the updated AGENTS.md rule.


## Integration disposition

Accepted and integrated as identity-only corn husks / enveloppes de maïs with the reviewed narrow aliases and one dried wrapper form. The active row is separate from corn kernels/on-the-cob corn and banana leaves. The NMSU one-pound quantity and approximate six-dozen recipe yield remain formula-specific; no density, measure, unit mapping, count conversion, fresh-to-dried conversion, yield conversion, recipe link, or substitution was added. The evidence supports the dried state but does not establish a current Canadian/Québec retail listing. Four external sources are recorded on the ingredient identity; the form record reuses three state/label sources. See the [integration README](../batches/wp03-section-k-corn-husks-wrapper-identity-integration-r126-20261015/README.md).

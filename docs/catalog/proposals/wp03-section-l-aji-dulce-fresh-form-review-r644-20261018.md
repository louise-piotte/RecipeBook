# WP03 Section L R644 — Puerto Rican ají dulce fresh-form review — 2026-10-18

- **Status:** Accepted and integrated on 2026-10-18 with one fresh form under the existing ají dulce identity.
- **Recommendation:** Add one `fresh` form to the existing Puerto Rican `ají dulce pepper / piment ají dulce` identity.
- **Boundary:** Keep the current names and aliases unchanged. Do not add a second identity, dried or processed forms, measures, conversions, recipe links, or substitutions.
- **Testing:** No software tests, build, emulator run, or deployment were performed. This proposal changes documentation only; `AGENTS.md` also exempts database-JSON-only additions from software testing.

## Why this is a distinct open item

Section L remains open for Latin American and regional chile review beyond ají amarillo, ají panca, rocoto, ají limo (R639), and Charapita (R642). This proposal addresses a separate form gap under the already active Puerto Rican ají dulce identity. It does not reopen R629 jalapeño, R632 serrano, R636 Scotch bonnet, R639 ají limo, or R642 Charapita. The broader fresh-chile list and the dried-chile, chile-powder, and fresh-versus-processed boundaries remain open in the [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6151) and [regional chile checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6222).

Requirements [FR-7](../../../Requirements.md#L375) calls for searchable French and English ingredient references. Since this active identity already has a provisional French label, the bounded change is to add its documented fresh state without changing either display name or activating uncertain synonyms.

## Current ownership and ID audit

The read-only snapshot on 2026-10-18 contains **1,832 active references, 161 forms, 56 legacy candidates, and 2,203 research-ledger records with 10,281 source entries**. The manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Current owner and proposed treatment |
|---|---|
| Active identity | `ingredient-ref-aji-dulce-pepper` is the existing verified row: FR `piment ají dulce`, EN `ají dulce pepper`, no aliases, category `VEGETABLE_AND_AROMATIC`. Keep its ID, labels, aliases, category, density, and unit mappings unchanged. |
| Forms | No form is currently attached to this reference. No active form owns `fresh ají dulce pepper` or `piment ají dulce frais`. Add only `ingredient-form-aji-dulce-pepper-fresh` under the existing reference. |
| Legacy archive | The 56-candidate legacy archive has no exact ají dulce / ajicito candidate to promote. No legacy row is changed. |
| Research ledger | The active reference already has a verified identity record with the 2022 UPR landrace paper, Puerto Rico government procurement notice, and a Government of Canada terminology record. Keep that record and its prior decision intact; if integrated, attach the three R644 sources below to this same record rather than creating a duplicate identity record. Its measurement and substitution states remain `not_yet_researched`. |
| Exact terms and IDs | Accent-folded `ají dulce pepper` / `piment ají dulce` are already owned by the active reference. The proposed form labels and form ID have no active, legacy, or ledger owner. `WP03-L-AJI-DULCE-FRESH-20261018-R644-S01` through `S03` are absent from the current ledger and catalog proposal/batch archive. |

Prior identity decisions explicitly keep `ajicito`, `ají cachucha`, and `ají gustoso` out of aliases and do not infer pungency, taxonomy, substitutions, forms, or numeric behavior. Preserve those limits. The Québec seed listing's wording `Poivron – Habanero Doux Aji Dulce` and its `Ajicito` claim are product-specific seed language; they do not justify changing the current provisional display or importing those phrases as general aliases.

## Evidence and Québec naming

The University of Puerto Rico journal article describes Puerto Rican sweet pepper, identified there as ají dulce, as commonly used fresh as a condiment. It says the fresh fruit seasons cooked foods and sauces, whether whole or cut. This directly supports a `fresh` state for the existing Puerto Rican culinary identity. The paper also studies hot-air and freeze-drying as preservation processes; that processing study alone does not establish a generic retail or culinary dried form, so this proposal adds no processed form. The official journal PDF was discoverable with its article text in search, but direct PDF opening returned 403 during this review; no processing measurements are used. [S01]

Québec public broadcaster Télé-Québec has a recipe for empanadas with a salsita that lists `piment Aji Dulce`, finely chopped, among the ingredients. Its preparation says to mix the salsa ingredients in a bowl and does not include a cooking step for the salsa. This supports local recipe use and gives a fresh-state inference from the uncooked preparation; the recipe does not explicitly label the pepper “fresh.” Its stated one-pepper quantity for six portions and 300 ml salsa yield remain recipe-specific and are not catalog measures. [S02]

Semences Ancestrales Québec lists `Poivron – Habanero Doux Aji Dulce` as a seed product and says it is also called `Ajicito`. This documents a Québec seller’s naming but not a produce-market standard or an official terminology ruling. Retain the existing provisional French display `piment ají dulce`; do not add `poivron`, `habanero doux`, or `ajicito` as catalog aliases on this evidence. [S03]

The proposed French form label composes the current provisional identity label with the masculine adjective `frais`; it does not assert that OQLF has standardized the term. The English label likewise retains the source name. No species, cultivar, heat level, color, or cross-country equivalence is asserted.

## Recipe demand and picker effects

Every manifest-listed recipe and all **1,123 ingredient rows** were scanned across recipe text and row fields. There are no normalized hits for `ají dulce`, `ají dulce pepper`, `piment ají dulce`, `ajicito`, `ají cachucha`, `ají gustoso`, `sweet chili pepper`, or either proposed fresh-form label. The Québec Télé-Québec recipe above is external evidence, not a bundled recipe to link or edit.

The picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes accents and punctuation, searches form labels under their owning reference, and prefers whole-word phrases before substring fallback. Counts below use the current 1,832-reference / 161-form snapshot and only the proposed form labels.

| Query | Before | After | Effect |
|---|---:|---:|---|
| `fresh ají dulce pepper` | 0 | 1 | Returns the existing ají dulce reference and matches its fresh form. |
| `piment ají dulce frais` | 0 | 1 | Returns the same reference and matches its fresh form. |
| `ají dulce pepper`, `piment ají dulce`, `ají dulce` | 1 each | 1 each | Existing identity searches stay stable. |
| `aji` / `ají` | 5 each | 5 each | No new identity or alias is introduced. |
| `piment`, `pepper`, `chili` | 30 / 37 / 12 | 30 / 37 / 12 | Broad existing result sets stay stable. |
| `fresh` / `frais` | 29 / 24 | 30 / 25 | Each state search gains the one new form-owning reference. |
| `piments`, `ajicito`, `ají cachucha`, `ají gustoso` | 0 each | 0 each | Generic plural and unresolved regional synonyms remain outside the picker. |

## Exact proposed JSON delta

Add one object to `ingredient-forms.v1.json`; do not change `ingredient-references.v1.json` or recipe rows:

```json
{
  "id": "ingredient-form-aji-dulce-pepper-fresh",
  "ingredientRefId": "ingredient-ref-aji-dulce-pepper",
  "formCode": "fresh",
  "labelFr": "piment aj\u00ed dulce frais",
  "labelEn": "fresh aj\u00ed dulce pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "L\u2019usage frais est document\u00e9; aucune mesure g\u00e9n\u00e9rale ni densit\u00e9 n\u2019est \u00e9tablie.",
  "notesEn": "Fresh use is documented; no generic measure or density is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Keep both match-term arrays empty so that only the proposed bilingual labels add form matches. Do not add the source-specific one-pepper recipe amount, the 300 ml salsa yield, a generic measure, density, unit mapping, package yield, conversion, substitution, recipe link, or recipe edit.

## Source register — checked 2026-10-18

| Source ID | Primary source and locator | Supports and limits |
|---|---|---|
| `WP03-L-AJI-DULCE-FRESH-20261018-R644-S01` | University of Puerto Rico, *Journal of Agriculture of the University of Puerto Rico*, M. A. González et al., “Freeze-Drying of Sweet Peppers,” vol. 54, no. 1 (1970), pp. 133–148, [official journal PDF](https://revistas.upr.edu/index.php/jaupr/article/download/11119/9403), DOI [10.46429/jaupr.v54i1.11119](https://doi.org/10.46429/jaupr.v54i1.11119), introduction. | Directly documents fresh culinary use of Puerto Rican ají dulce. Its processing experiments are not generalized to a catalog dried form or numeric behavior. Official PDF text was indexed but direct opening returned 403 in this review. |
| `WP03-L-AJI-DULCE-FRESH-20261018-R644-S02` | Télé-Québec, Cuisinez, [Empanadas de carne mechada (bœuf effiloché)](https://cuisinez.telequebec.tv/recettes/6463/empanadas-de-carne-mechada-buf-effiloche), “Pour la salsita” ingredient list and preparation, current page checked 2026-10-18. | Uses the name `piment Aji Dulce` in an uncooked salsa. Supports Québec recipe wording and a fresh-state inference, not an explicit freshness statement or a general pepper measure. |
| `WP03-L-AJI-DULCE-FRESH-20261018-R644-S03` | Semences Ancestrales Québec, [Poivron – Habanero Doux Aji Dulce](https://semencesancestrales.com/semences/poivron-habanero-doux-aji-dulce/), seed-product title and description, current page checked 2026-10-18. | Supports only the seller’s Québec seed-label wording and its use of `Ajicito`; does not establish a general produce name, alias equivalence, or official French terminology. |

## Remaining open scope and checks

This proposal fills only the missing fresh form under an existing identity. The wider Section L regional identity review remains open, along with fresh-chile candidate coverage, dried chile and chile powder identities, and the boundary among fresh, dried, smoked, puréed, seasoning, and sauce products. Ají dulce aliases, naming, heat, taxonomy, other forms, and numeric behavior remain unresolved unless supported in a separate review.

Static checks completed: active reference/form and ledger ownership inspection; unique form/source-ID checks; picker-count projection; scan of all 114 manifest recipes and 1,123 ingredient rows. No app tests, build, emulator, or deployment were run.

## Root integration review

- Confirmed the University of Puerto Rico article's indexed official PDF text directly states that Puerto Rican ají dulce is used fresh; Télé-Québec names it in a salsa mixed without cooking. The source-specific amount and batch yield remain unmodeled.
- Added one fresh form with no match terms to the existing identity. Kept the existing names, aliases, category, density, and unit mappings unchanged; appended three source records and one bounded decision to the existing ledger record.
- Static package, generated-index, ledger-schema, ownership, picker-projection, recipe-corpus, encoding, local-link, and scoped-whitespace checks passed. No software tests were run because this change adds database JSON data under `AGENTS.md`.

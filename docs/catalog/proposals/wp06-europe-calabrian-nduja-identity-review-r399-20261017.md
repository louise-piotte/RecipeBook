# WP06 Section 05 — Calabrian nduja identity review (R399)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review changes no catalog JSON, forms, research ledger, recipes, generated files, global plan, workflow, or roadmap.
- **Scope:** One Southern Italian charcuterie identity: *nduja*.
- **Source-ID prefix:** `WP06-EUROPE-CALABRIA-NDUJA-R399-20261017`. IDs below are proposal-local and were checked for collisions.

## Recommendation

Add one identity-only `PROTEIN` reference displayed as **`nduja / nduja`**, with empty alias arrays. Use the same borrowed ingredient name in both languages: a current Québec retailer uses `Nduja` in both its French and English product titles. The retailer adds French `salami épicé à tartiner` and English `spicy spreadable salami` as product descriptions; no OQLF or TERMIUM preferred-term entry was located in this review, so those descriptions should not be presented as standardized Québec terminology or activated as broad aliases. [S01–S03]

The Calabria regional government describes nduja as a soft, very spicy Calabrian salame, traditionally associated with Spilinga while noting similar products are also made or found elsewhere in Calabria. This supports a regional food identity, not a single Spilinga-only formula, protected designation, or universal production standard. [S04]

Add no forms, measures, density, unit mappings, package yields, conversions, recipe links, or substitutions. The full manifest-listed recipe corpus has no matching nduja demand.

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-nduja",
  "nameFr": "nduja",
  "nameEn": "nduja",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
```

The shared name is directly present in both Québec-facing product titles. Keeping the retailer's generic salami descriptions out of the displays and aliases avoids making a search for bare `salami` resolve to this one specialized product while no general salami identity exists.

## Product and naming boundaries

The reviewed sources support a soft, spreadable and spicy Calabrian salame identity. One Canadian seller describes a particular Madeo item as a pork-and-Calabrian-chili spread; that producer-specific composition must not be applied to every product sold as nduja. The Québec Mayrand listing gives a 250 g Golosini SKU but does not identify its production region or ingredient formulation. Keep those source scopes separate. [S02–S04]

Keep these names and neighboring products outside the proposed alias arrays:

- **`nduja di Spilinga`:** the regional-government source names Spilinga as the main production area but also describes similar nduja products elsewhere in Calabria. Do not assign a Spilinga origin to the Québec Mayrand SKU or treat this geographic wording as a universal alias. No protected-status claim is made here. [S04]
- **`salami`, `saucisson`, and generic sausages:** descriptive category wording on the Mayrand SKU is not a synonym for every salami or sausage. The active catalog has breakfast sausage and merguez references, but no generic salami identity. Keep those references separate.
- **`andouille`:** the government document includes an etymological aside, but that does not establish a Québec ingredient synonym. Do not alias or merge French andouille with nduja.
- **Pepperoni, merguez, breakfast sausage, chili paste, and hot-pepper products:** a shared meat or heat component does not establish equivalent product identity, recipe role, or quantity.
- **Producer, brand, and product variants:** do not add `Golosini`, `Madeo`, `Nobile`, or other SKU/brand terms as global aliases.

## Québec-facing bilingual naming

Mayrand's current bilingual pages identify the same product code, **31662**, as `Salami épicé à tartiner Nduja` in French and `Nduja Spicy Spreadable Salami` in English. Both pages list the product as available at several Québec stores at the time accessed. These are current market-label observations, not proof of province-wide stock or a terminology ruling. Use the shared headword **`nduja`** for both catalog displays; retain the paired descriptive wording as evidence only. [S01–S03]

No relevant OQLF or TERMIUM preferred-term result was found for `nduja` in this bounded naming check. Do not claim that the borrowed form or either descriptive phrase is officially standardized in Québec French.

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Live count | Finding |
|---|---:|---|
| Active ingredient references | 1,706 | No `ingredient-ref-nduja` row or exact owner for `nduja`, `nduja calabrese`, `nduja di Spilinga`, or the proposed bilingual display. `ingredient-ref-gianduja-nut-chocolate` contains the character string `nduja` inside `gianduja`, but does not own that whole-word phrase. |
| Ingredient forms | 141 | No nduja, Calabrian salami, or spreadable-salami form label or match term. |
| Legacy import candidates | 56 | No nduja-family candidate or proposed reference ID. |
| Research ledger | 2,066 records; 9,336 source entries | No exact nduja identity/source record; no R399 prefix or source-URL collision. |
| Manifest-listed bundled recipes | 114 files; 1,123 ingredient rows | No nduja match or recipe line to link; full scan follows. |

The live related meat references found are `ingredient-ref-breakfast-sausage` (`breakfast sausage / saucisse à déjeuner`) and `ingredient-ref-merguez-sausage` (`merguez sausage / merguez`). Neither owns nduja or generic salami. Proposal and batch Markdown archives contain no prior nduja review or integration. All four proposal source URLs below and the target R399 proposal path were unallocated before this file was written.

The open global plan item remains **“Western, Southern, Northern, Central, and Eastern Europe; include breads, pastry, charcuterie, pickles, and cheese traditions.”** ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8758)) This is one product review only; it does not sample the whole region or close any part of Europe-wide coverage. R393 brunost and R396 burrata address separate cheese identities and remain unchanged.

## Exact picker projection

The projection uses the current bilingual search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word-phrase matches take priority over partial substring matches.

| Query | Current result | With proposed row |
|---|---|---|
| `nduja` | `ingredient-ref-gianduja-nut-chocolate` through partial substring fallback | `ingredient-ref-nduja` only through whole-word phrase matching; the false-positive partial Gianduja result is suppressed |
| `gianduja` / `gianduia` | `ingredient-ref-gianduja-nut-chocolate` | Same single chocolate result |
| `salami`; `spicy spreadable salami`; `salami épicé à tartiner` | No result | No result; generic retailer descriptors are not searchable aliases |
| `nduja di Spilinga`; `nduja calabrese` | No result | No result; no source-specific origin or descriptive alias is activated |
| `merguez`; `breakfast sausage`; `saucisse à déjeuner` | Their existing references | Same existing references |

The display remains discoverable by the exact shared name while preserving the existing chocolate identity and avoiding a new singleton result for broad `salami` searches.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and all **1,123 structured ingredient rows** were parsed as UTF-8. The search covered each complete decoded recipe and each ingredient object, including original text, ingredient name, reference ID, and form ID. It included `nduja`, apostrophe and curly-apostrophe spellings, `nduja di Spilinga`, `nduja calabrese`, the current Mayrand English and French titles, `spicy spreadable salami`, `salami épicé à tartiner`, `Calabrian spreadable salami`, and `andouille calabraise`. The scan found **zero matching recipe files, zero matching ingredient rows, and zero recipe links**.

The manifest-order fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. It was computed by hashing each manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashing the concatenated bytes.

## Numeric, form, and substitution boundaries

- Mayrand's **250 g** amount and approximate **0.25 kg** are one retailer SKU's package listing. Berchicci separately lists a particular Madeo format as **250 g**. Neither is a household measure, portion standard, count-weight factor, yield, or density. [S01–S03]
- The sources describe spreadable products but also identify specific package and producer variants. No shared preparation-state taxonomy or recipe requires an active form. Add no form, density, unit mapping, conversion, or package-yield rule.
- The regional and seller pages give serving/use ideas, including spreading on bread and adding to sauces or pasta; none validates replacing nduja with another sausage, salami, chili product, or pepper paste. Add no global or contextual substitution and no recipe-line substitution link.

## Source register

Pages were accessed on 2026-10-17. Each source ID is proposal-local; the IDs and URLs were absent from the live ledger before drafting.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-CALABRIA-NDUJA-R399-20261017-S01` | Mayrand, [Salami épicé à tartiner Nduja 250 g](https://mayrand.ca/fr/nos-produits/charcuterie/prosciutto/nduja-golosini-31662), product code 31662, accessed 2026-10-17. | Current Québec French product-title wording and retailer package size. The page lists store-level availability; it does not give a producer origin or formula, and availability can change. |
| `WP06-EUROPE-CALABRIA-NDUJA-R399-20261017-S02` | Mayrand, [Nduja Spicy Spreadable Salami 250 g](https://mayrand.ca/en/our-products/deli/prosciutto/nduja-golosini-31662), product code 31662, accessed 2026-10-17. | English title for the same Mayrand item as S01. It is the same SKU, not an independent source or measurement. |
| `WP06-EUROPE-CALABRIA-NDUJA-R399-20261017-S03` | Berchicci, [Madeo ’Nduja Nobile Calabrese](https://store.berchicci.ca/Madeo-Nduja-Nobile-Calabrese), accessed 2026-10-17. | Montréal retailer page for a specific Madeo Calabrian pork-and-chili spread; lists its 250 g format and in-stock state. Its product description and format are SKU-specific, not a universal recipe or measure. |
| `WP06-EUROPE-CALABRIA-NDUJA-R399-20261017-S04` | Regione Calabria, *Piano Regionale di Sviluppo Turistico Sostenibile della Regione Calabria 2023–2025*, [PDF](https://www.regione.calabria.it/wp-content/uploads/2023/05/dgr-n.-190-del-28.04.2023.pdf), pp. 71–72 (PDF pp. 74–75), accessed 2026-10-17. | Official regional plan calls nduja a typical soft, very spicy Calabrian salame and describes its Spilinga association alongside similar products found across Calabria. The excerpt references a 2008 regional food-travel publication and is not a technical specification, protected-name register, or universal composition. |

## Disposition

Proceed with one identity-only `PROTEIN` row for **`nduja / nduja`** if accepted. Keep the Québec retail descriptors in the evidence record, not as generic aliases; preserve salami/sausage neighbors, Spilinga-specific wording, and pepper products as separate boundaries. Leave measures, forms, recipe links, substitutions, and the broad Europe checklist unchanged. This proposal changes only this Markdown file; no software tests are required or were run.

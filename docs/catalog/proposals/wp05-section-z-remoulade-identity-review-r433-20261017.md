# WP05 Section Z — remoulade identity review (R433)

- **Packet type:** proposal only; no shared catalog data, ledger, plan, roadmap, recipe, README, generated index, or test files are changed.
- **Scope:** one still-open WP05 Section Z sauce/condiment identity: remoulade. Audit covers active references and forms, legacy candidates, ledger ownership, picker projection, and every recipe path in the bundled manifest.
- **Prepared and source-access date:** 2026-10-17.
- **Disposition:** recommend one identity-only `remoulade / sauce rémoulade` reference. Keep it separate from tartar sauce, mayonnaise, aioli, and horseradish products.

## Recommendation and exact delta

The OQLF Grand dictionnaire terminologique gives **sauce rémoulade** and **rémoulade** as preferred French terms and **remoulade** as the English term. Its entry classifies the item as a sauce and describes a strongly mustard-seasoned mayonnaise with chopped garnishes. A current Québec restaurant menu uses *sauce rémoulade* for a burger condiment; a Québec City restaurant listing pairs *Rémoulade* with *Remoulade Sauce*. This supports a useful generic condiment identity and the narrowly attested alternate English phrase, but does not establish a formula shared by all remoulades. [S01–S03]

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-remoulade` |
| `nameEn` | `remoulade` |
| `nameFr` | `sauce rémoulade` |
| `aliasesEn` | `["remoulade sauce"]` |
| `aliasesFr` | `["rémoulade"]` |
| `category` | `SAUCE_AND_CONDIMENT` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| `updatedAt` | `2026-10-17T00:00:00Z` |

If accepted, add one ledger record for `ingredient-ref-remoulade` with `identityState=verified`, `measurementState=researched_no_supported_value`, and `substitutionResearchState=not_yet_researched`. Attach S01–S03 as identity and name evidence. Add no measurement observation, form, unit conversion, package yield, recipe link, or substitution finding/rule. The menu listings provide no reusable mass or volume quantity; their ingredient descriptions are restaurant-specific. No replacement ingredient or ratio was researched, so substitution research stays not yet researched.

## Open checklist, ownership, and prior decisions

The WP05 Section Z checklist in `docs/RecipeBook-global-ingredient-catalog-plan.txt` still lists remoulade among its open sauce and condiment identities. R429 integrated tartar sauce as `ingredient-ref-tartar-sauce` and explicitly kept remoulade separate. R430 aioli and R426 prepared horseradish are now active rows in the current package; they are not candidates in this review.

Current package snapshot: **1,727 active references, 141 forms, 56 legacy-import candidates, 2,086 ledger records, and 9,461 ledger source entries** (8,018 unique source IDs and 6,734 unique URLs). No active reference, form, legacy candidate, or ledger identity owns `remoulade`, `rémoulade`, or `ingredient-ref-remoulade`. The only current ledger text mentioning remoulade is the R429 tartar-sauce decision that explicitly keeps the two identities separate. The proposed source-ID prefix `WP05-REMOULADE-R433-20261017` and target filename were checked against the current catalog documentation and ledger; no collision was found.

| Current owner | Existing identity and terms | Boundary for this proposal |
|---|---|---|
| `ingredient-ref-tartar-sauce` | `tartar sauce / sauce tartare`; English alias `tartare sauce` | Separate named condiment. Do not alias remoulade to it or map one to the other. |
| `ingredient-ref-mayo` | `mayonnaise / mayonnaise`; `mayo` alias in both languages | Remoulade may be mayonnaise-based, but the base ingredient is not a synonym or substitute identity. |
| `ingredient-ref-aioli` | `aioli / aïoli`; French alias `ailloli` | Separate named sauce. Do not add garlic, aioli, or aïoli aliases to remoulade. |
| `ingredient-ref-prepared-horseradish` | `prepared horseradish / raifort préparé` | Separate condiment; no horseradish or raifort alias. The fresh root is separately owned by `ingredient-ref-horseradish`. |
| `ingredient-ref-toum` | `toum / sauce toum` | Separate garlic sauce; no Toum or generic garlic-sauce alias. |

The R429 and R430 ledger decisions preserve these adjacent identities; they are not remoulade evidence or ownership. No alias is proposed for qualified styles such as Creole remoulade, for celery remoulade as a dish/preparation, or for generic mayonnaise-based sauces. The OQLF entry is the language and sauce-identity authority; its last-update field is 1972, so current Québec menu usage is included as a contemporary cross-check rather than treating that old definition as a universal product formula.

## Picker projection

The projection follows `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: it folds accents and punctuation, matches complete word phrases first, then uses substring fallback. Projected results add only the proposed row; no active ref or form is changed.

| Query | Current result | Projected result |
|---|---|---|
| `remoulade`; `rémoulade`; `sauce rémoulade`; `sauce remoulade`; `remoulade sauce` | none | `ingredient-ref-remoulade` |
| `sauce` | 44 references | 45 references; adds `ingredient-ref-remoulade` to an already broad query |
| `sauce tartare`; `tartar sauce`; `tartare sauce` | `ingredient-ref-tartar-sauce` | unchanged |
| `tartar` | `ingredient-ref-cream-of-tartar`, `ingredient-ref-tartar-sauce`, `ingredient-ref-tartary-buckwheat-flour` | unchanged |
| `tartare` | `ingredient-ref-tartar-sauce`, `ingredient-ref-tartary-buckwheat-flour` | unchanged |
| `mayonnaise`; `mayo` | `ingredient-ref-mayo` | unchanged |
| `aioli`; `aïoli` | `ingredient-ref-aioli` | unchanged |
| `prepared horseradish`; `raifort préparé` | `ingredient-ref-prepared-horseradish` | unchanged |
| `céleri rémoulade`; `celeriac remoulade` | none | none; the qualified dish phrase does not match the sauce name |

Accent folding means the OQLF French spelling remains searchable without accents; the stored French display keeps its accent. Exact tartar-sauce phrases continue to resolve to their existing identity. Broad `tartar` and `tartare` searches are already ambiguous because they also find cream of tartar and Tartary buckwheat flour; this proposal does not change those results.

## Full bundled recipe scan

The current manifest lists **114 recipe files** with **1,123 ingredient rows**. I recursively parsed every manifest-listed file and scanned the serialized JSON and ingredient-row values for `remoulade`, `rémoulade`, `tartar`, `tartare`, `aioli`, `aïoli`, `horseradish`, and `raifort`. There is no remoulade, aioli, or horseradish ingredient demand and no candidate row to link. The only two ingredient-row matches are unrelated cream of tartar:

| Recipe and row | Existing content and owner |
|---|---|
| 021, Bûche de Noël / Yule Log, ingredient 15 | `1/16 tsp cream of tartar`; remains linked to `ingredient-ref-cream-of-tartar`. |
| 068, Chocolate Mousse, ingredient 4 | `1/2 tsp cream of tartar`; remains linked to `ingredient-ref-cream-of-tartar`. |

Leave both authored rows, quantities, and links unchanged. The corpus does not support a remoulade recipe-line link, form, yield, measurement, or substitution.

## Evidence limits and implementation boundary

OQLF gives the core French and English names and classifies rémoulade as a sauce. Le Chic Shack’s current Québec menu uses *sauce rémoulade* on a grilled-chicken burger and *rémoulade* in a salad listing. The Frite Alors! Québec City online ordering entry lists *Rémoulade / Remoulade Sauce* and describes that restaurant's version with mayonnaise, Dijon mustard, and tarragon. These current uses support the proposed display and narrowly observed English alias. The OQLF definition and menu examples differ in wording and detail, which is a reason to add only the named identity and not store a canonical ingredient formula. [S01–S03]

Implement only the reference and identity-ledger record described above if accepted. Keep tartar sauce, mayonnaise, aioli, prepared horseradish, fresh horseradish, Toum, and any qualified or dish-style remoulade terms separate. Leave recipe data untouched and leave measurement and substitution behavior inactive.

## Sources accessed 2026-10-17

| ID | Source and locator | Support and limits |
|---|---|---|
| **WP05-REMOULADE-R433-20261017-S01** | Office québécois de la langue française, Grand dictionnaire terminologique, [sauce rémoulade](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8488634/sauce-remoulade), preferred French terms, English term, definition; last updated 1972. | Gives preferred French terms *sauce rémoulade* and *rémoulade*, English *remoulade*, and classifies it as a sauce. Its historical definition is one terminology entry, not a universal commercial recipe or measurement standard. |
| **WP05-REMOULADE-R433-20261017-S02** | Le Chic Shack, [Menu](https://www.lechicshack.ca/menu), current burger and salad entries. | A Québec restaurant's current menu uses *sauce rémoulade* for its grilled-chicken burger and *rémoulade* in a salad. This supports local usage, not a standardized product formula. |
| **WP05-REMOULADE-R433-20261017-S03** | Frite Alors! Crémazie O, Québec City, [online ordering menu](https://order.online/en-CA/store/frite-alors-cr-mazie-o-831284), Sauce Mayo section, item *Rémoulade / Remoulade Sauce*. | The Québec City listing pairs these French and English item labels and gives this restaurant's description (mayo, Dijon mustard, tarragon). This supports the narrow English alias and a product-specific sauce description only; it gives no reusable mass or volume measure. |

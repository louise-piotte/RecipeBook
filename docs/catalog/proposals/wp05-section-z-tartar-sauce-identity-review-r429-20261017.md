# WP05 Section Z — tartar sauce identity review (R429)

- **Packet type:** proposal only; this file is the only intended change in this review.
- **Scope:** one still-open everyday condiment identity, reviewed against the active reference catalog, forms, legacy candidates, evidence ledger, picker behavior, and every manifest-listed recipe.
- **Prepared and source-access date:** 2026-10-17.
- **Disposition:** add one identity-only row for the Quebec- and Canada-facing condiment term supported by the Office québécois de la langue française (OQLF) and current Canadian product evidence.

## Recommendation

Add a generic condiment identity with English display **tartar sauce** and Quebec French display **sauce tartare**. OQLF explicitly gives sauce tartare as its preferred French term and lists tartar sauce and tartare sauce as English terms. A current Heinz Canada pair uses those English and French product names for the same product identifier. A Québec producer listing also titles its product Sauce tartare, while describing that particular product as “sauce de type tartare.” These sources support the identity and the French display, but do not establish one universal formula for every product. [S01–S04]

Use the existing category SAUCE_AND_CONDIMENT. Add only the English alias tartare sauce, which OQLF lists as an English term. Keep French aliases empty: sauce tartare is already the OQLF-preferred French display, and the isolated product description sauce de type tartare is not promoted as a general synonym. Do not alias mayonnaise, aioli, remoulade, prepared horseradish, cream of tartar, Tartary buckwheat flour, tartaric acid, or raw tartare dishes to this row.

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-tartar-sauce |
| nameEn | tartar sauce |
| nameFr | sauce tartare |
| aliasesEn | [tartare sauce] |
| aliasesFr | [] |
| category | SAUCE_AND_CONDIMENT |
| defaultDensity | null |
| unitMappings | [] |
| updatedAt | 2026-10-17T00:00:00Z |

Add one evidence-ledger record for ingredient-ref-tartar-sauce with identityState verified, measurementState researched_no_supported_value, and substitutionResearchState not_yet_researched. Attach S01–S04 as identity and terminology/product evidence. Add no measurement observations, form, conversion, package yield, recipe link, or active substitution. The 30 mL serving on the Heinz label is volume-only; neither it nor the Québec 350 mL package listing supports a mass, density, or reusable volume-to-mass mapping. [S02–S04]

## Open checklist and identity ownership

The WP05 Section Z checklist in docs/RecipeBook-global-ingredient-catalog-plan.txt still groups tartar sauce with ketchup, mustards, mayonnaise, aioli, remoulade, horseradish sauce, Worcestershire, brown sauce, steak sauce, and barbecue sauces. The exact line remains open. Earlier Section Z notes recorded tartar sauce as unowned and without exact bundled ingredient demand; R426 has since added prepared horseradish as its own identity. This proposal advances only tartar sauce and does not close the wider checklist.

The active package currently has 1,724 ingredient references and 141 forms. No active reference has the exact identity or terms tartar sauce, tartare sauce, or sauce tartare. The nearby owners and boundaries are:

| Current reference | Existing names or relevant terms | Boundary |
|---|---|---|
| ingredient-ref-cream-of-tartar | cream of tartar / crème de tartre | Baking ingredient; not a sauce. |
| ingredient-ref-tartary-buckwheat-flour | Tartary buckwheat flour / farine de sarrasin de Tartarie; English alias Tartar buckwheat flour; French alias farine de sarrasin tartare | Species-qualified flour; its existing broad tartar/tartare search hits must remain visible. |
| ingredient-ref-mayo | mayonnaise / mayonnaise; mayo in both alias lists | Plain mayonnaise remains a separate ingredient. |
| ingredient-ref-horseradish | horseradish / raifort | Fresh root. |
| ingredient-ref-prepared-horseradish | prepared horseradish / raifort préparé | R426 condiment identity; distinct from tartar sauce. |

There is no active tartar-sauce form. The legacy import file has 56 candidates and no matching tartar sauce, tartare sauce, sauce tartare, or remoulade candidate. The current evidence ledger has 2,083 records, 9,446 source entries, 8,005 unique source IDs, and 6,721 unique source URLs. It has no record for ingredient-ref-tartar-sauce and no record about a generic sauce tartare identity. A ledger record for frozen breaded fish sticks mentions an external recipe for homemade tartar sauce; that is source-context text, not a sauce identity or a bundled recipe link. The existing cream-of-tartar ledger record is chemically and culinarily separate.

The four proposed source IDs WP05-TARTAR-SAUCE-R429-20261017-S01 through S04 were searched against current ledger and catalog documentation; no collision was found.

## Picker projection

Picker behavior was projected from IngredientReferenceSearchIndex in app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt. It prefers normalized complete word phrases and then falls back to substring matching. Results below use the current active reference order, with the proposed row appended.

| Query | Current result(s) | Projected result(s) |
|---|---|---|
| tartar sauce | none | ingredient-ref-tartar-sauce |
| tartare sauce | none | ingredient-ref-tartar-sauce |
| sauce tartare | none | ingredient-ref-tartar-sauce |
| tartar | ingredient-ref-cream-of-tartar; ingredient-ref-tartary-buckwheat-flour | those two, plus ingredient-ref-tartar-sauce |
| tartare | ingredient-ref-tartary-buckwheat-flour | ingredient-ref-tartary-buckwheat-flour; ingredient-ref-tartar-sauce |
| Tartar buckwheat flour | ingredient-ref-tartary-buckwheat-flour | unchanged: ingredient-ref-tartary-buckwheat-flour |
| farine de sarrasin tartare | ingredient-ref-tartary-buckwheat-flour | unchanged: ingredient-ref-tartary-buckwheat-flour |
| cream of tartar | ingredient-ref-cream-of-tartar | unchanged: ingredient-ref-cream-of-tartar |
| mayonnaise; mayo | ingredient-ref-mayo | unchanged: ingredient-ref-mayo |
| aioli; remoulade | none | none |

The broad single-word tartar query will have three results after addition because the word also occurs in cream of tartar and the flour alias Tartar buckwheat flour. Broad tartare will have two results because Tartary buckwheat flour already has the alias farine de sarrasin tartare. Exact sauce phrases stay unambiguous. Do not add a bare tartar or tartare alias, or alter the flour’s existing terminology to reduce these broad-query results.

## Complete bundled-recipe scan

The manifest lists 114 recipe files with 1,123 ingredient rows. I scanned all ingredient originalText and ingredientName values for tartar sauce, tartare sauce, sauce tartare, tartar, tartare, remoulade, and aioli. There are no exact tartar-sauce, remoulade, or aioli ingredient rows and no candidate recipe links to add.

The broad tartar/tartare token scan returns only two unrelated cream-of-tartar rows:

| Recipe and ingredient row | Existing ingredient reference |
|---|---|
| 021 Bûche de Noël / Yule Log, ingredient 15: 1/16 tsp cream of tartar | ingredient-ref-cream-of-tartar |
| 068 Chocolate Mousse, ingredient 4: 1/2 tsp cream of tartar | ingredient-ref-cream-of-tartar |

These are not tartar sauce demand. Keep their current authored quantities and links unchanged. An external fish-stick recipe in the ledger uses homemade tartar sauce, but it is not one of the bundled recipes.

## Measures, forms, and substitutions

The bilingual Heinz Canada page pair identifies a 354 mL product and a serving of 2 tbsp / 30 mL. It does not give the serving mass. Aliments du Québec lists another product at 350 mL and does not give a mass. Product package volume, a volume-only portion, or nutrition values for one commercial recipe do not justify a catalog-wide density or volume-to-mass mapping. Therefore:

- Keep defaultDensity null and unitMappings empty.
- Record no measurement observation.
- Add no form or form conversion.
- Keep substitutionResearchState not_yet_researched and add no substitution finding or rule.
- Add no package yield or recipe-line link.

The measurement state is researched_no_supported_value because the reviewed Canadian product-label evidence does not support a reusable value. The substitution state remains not_yet_researched because this review did not research replacement ingredients or ratios.

## Evidence limits and implementation recommendation

OQLF provides the strongest naming evidence and defines its entry as mayonnaise seasoned with capers, pickles, shallots, and herbs; it also notes variation in the mayonnaise and mustard. The Québec-listed producer describes its own Sauce tartare as made from house mustard and relish. This supports recognizing sauce tartare as a retail condiment name while cautioning against storing a universal ingredient formula. The product phrase sauce de type tartare is specific to that listing and should not become a French alias. [S01, S04]

Implement only the one identity row and one ledger record described above. Keep mayonnaise, aioli, remoulade, prepared horseradish, cream of tartar, Tartary buckwheat flour, tartaric acid, and steak tartare separate. Preserve existing flour aliases. Leave the remaining WP05 Section Z sauces open for their own evidence and boundary review.

## Sources accessed 2026-10-17

| ID | Source and locator | Support and limits |
|---|---|---|
| **WP05-TARTAR-SAUCE-R429-20261017-S01** | Office québécois de la langue française, Grand dictionnaire terminologique, [sauce tartare](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502351/sauce-tartare), preferred term, English terms, definition, and note; updated 2009. | Preferred French term is sauce tartare. English terms include tartar sauce and tartare sauce. Defines a mayonnaise sauce with capers, pickles, shallots, and herbs and notes possible variation. Terminology evidence; it does not establish one commercial formula. |
| **WP05-TARTAR-SAUCE-R429-20261017-S02** | Heinz Canada, [Tartar Sauce](https://www.kraftheinz.com/en-CA/heinz/products/00057000002824-tartar-sauce), product title, serving, package, and ingredient information. | Current Canadian English product page for identifier 00057000002824. Lists 354 mL and a 2 tbsp (30 mL) serving. The serving has no mass; product ingredients and formulation are SKU-specific. |
| **WP05-TARTAR-SAUCE-R429-20261017-S03** | Heinz Canada, [Sauce tartare](https://www.kraftheinz.com/fr-CA/heinz/produits/00057000002824-sauce-tartare), product title and details for the same 00057000002824 identifier. | Paired French product page uses Sauce tartare for the same Canadian product. Also lists 354 mL and 2 tbsp (30 mL). Confirms current Quebec-French product wording, not a general formulation or mass measure. |
| **WP05-TARTAR-SAUCE-R429-20261017-S04** | Aliments du Québec, [Sauce tartare](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/sauce-tartare), product name, format, producer description, and retail listing. | Québec-facing product is titled Sauce tartare, format 350 mL. Its description calls it sauce de type tartare and says it is based on the producer’s mustard and relish. This is one producer’s product description, not a generic French alias or universal recipe. |

## Snapshot

Counts and SHA-256 values below describe the live workspace snapshot reviewed on 2026-10-17. For the recipe corpus digest, recipe basenames are sorted lexically and each basename, NUL byte, exact file bytes, and NUL byte are hashed in sequence.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| ingredient-references.v1.json | 1,724 references | 0e87a17da1c00e4384c2f59c25d9ef8b3ce5da9fcf1a605d4c1d61848b6726a3 |
| ingredient-forms.v1.json | 141 forms; no matching tartar-sauce form | 2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed |
| research-ledger.v1.json | 2,083 records; 9,446 source entries | d43135bf0d80c72fe8a1fa067aae4f101ecf0f1abf6be47bb223a86cf62518f1 |
| legacy-import-identities.v1.json | 56 candidates; no matching candidate | 8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe JSON set | 114 files; 1,123 ingredient rows | e8bc3c3f49274719d3307dab241227458e2492f12c47506eaf7fdcb214bb533c |

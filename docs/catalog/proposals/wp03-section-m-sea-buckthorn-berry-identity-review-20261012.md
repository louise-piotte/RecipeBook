# WP03 Section M: sea-buckthorn berry identity review — 2026-10-12

- **Disposition:** recommend an identity-only `FRUIT` reference for **sea buckthorn berry / argouse**.
- **Scope:** edible fruit of *Hippophae rhamnoides*, including the whole berries sold fresh or frozen. Keep leaf, juice, pulp, seed oil, powder, flour, jam, jelly, sorbet, tea, and composite products separate.
- **Status:** Root-integrated. The identity-only fruit row and source-backed ledger decision were added as proposed; see [`wp03-sea-buckthorn-berry-identity-integration-20261012/README.md`](../batches/wp03-sea-buckthorn-berry-identity-integration-20261012/README.md).

## Evidence and recommendation

OQLF’s Grand dictionnaire terminologique has a fruit-domain entry for **argouse**. It defines it as the yellow-orange, acidic fruit of the argousier and gives **argouse** and **baie d’argousier** as preferred Québec French terms. Its English terms include **sea buckthorn berry**, **sea buckthorn**, **seaberry**, and **seaberry fruit**. OQLF’s companion plant entry identifies the argousier as *Hippophae rhamnoides*. This is direct Québec terminology and species evidence for the fruit identity. [S01–S02]

UQAC describes the fruit as edible and grown in the Québec context, notes its acidic taste, and gives culinary uses such as jam, jelly, coulis, and desserts. Aliments du Québec lists a Lac-Brome producer’s frozen sea-buckthorn berries separately from that producer’s juice, pulp, powder, leaf tea, and sorbet. A Montréal retailer likewise lists individually frozen berries as a standalone product and identifies them as a Québec product. These sources support an identity for the fruit while drawing a useful boundary around processed products. [S03–S05]

No current catalog record, form, legacy candidate, ledger identity, or archived proposal owns the candidate. The exact English and French searches would each return the proposed identity alone. Generic `berry` / `baie` searches are already multi-result and would simply gain another fruit result. The full bundled recipe scan found no candidate phrase or ingredient link. I recommend adding the identity with no recipe link, form, measurement, conversion, yield, or substitution data.

**Open-checklist fit:** the plan still leaves the Section M/N/P product and species identity work open (including independent Québec terminology review; see the Section M/N/P follow-up entries around lines 6874–6932 of `docs/RecipeBook-global-ingredient-catalog-plan.txt`). Sea-buckthorn fruit is not named as a completed item or in an earlier proposal. This bounded M identity review contributes one source-backed candidate to that umbrella work; it does not close the broader checklist.

## Proposed identity and boundaries

| Field | Proposed value |
|---|---|
| Candidate ID | `ingredient-ref-sea-buckthorn-berry` |
| Category | `FRUIT` |
| English display | `sea buckthorn berry` |
| Québec French display | `argouse` |
| English aliases | `sea buckthorn`; `sea buckthorn berries`; `seaberry`; `seaberry fruit` |
| French aliases | `baie d’argousier`; `baies d’argousier`; `argouses` |
| Density / unit mappings | none |
| Forms | none |
| Recipe links | none |
| Measurement, conversion, yield, or substitution data | none |

Keep the identity scoped to the edible fruit of *Hippophae rhamnoides*. Do not use a botanical plant name as a synonym for its separate edible parts or processed products. Specifically:

- keep argousier leaves and leaf tea outside the fruit identity;
- keep pressed juice, pulp/pomace, seed oil, and dried powder/flour as distinct products;
- keep jam, jelly, sorbet, kombucha, syrups, and mixed products separate;
- do not alias generic sea-buckthorn wording to cranberries, currants, gooseberries, lemon, or other tart fruit.

The aliases above are limited to OQLF-attested English fruit terms and Québec fruit-product wording. Do not add the scientific name as a picker alias. Keep `sea buckthorn oil`, `argousier oil`, and seed/pulp-oil wording out of the fruit row.

## Ownership and live package snapshot

Snapshot captured 2026-10-12 from the live workspace package and refreshed after concurrent catalog and ledger edits:

| File / corpus | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,278 references | `6c317cf05e4238f61d6f06b649d788105ea3354380cf6f9d15be37110dbb4f32` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,586 records; 5,635 source entries | `40095815e773c21f354d117a4df0ff64618b9379a5595f0d56e2140e4fde399b` |
| Manifest-listed recipe corpus | 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The corpus fingerprint is SHA-256 over each manifest-listed recipe path, a NUL byte, its raw file bytes, and a NUL byte, in manifest order. The reference, forms, manifest, legacy, and ledger hashes are raw-file SHA-256 values.

Normalized exact-key checks found no active reference, form, legacy candidate, or ledger record ID for `sea buckthorn berry`, `sea buckthorn berries`, `sea buckthorn`, `seaberry`, `seaberry fruit`, `argouse`, `argouses`, `argousier`, `baie d’argousier`, `baies d’argousier`, or *Hippophae rhamnoides*. A pre-review search of the proposal and batch archive found no earlier sea-buckthorn/argouse identity review, integration, or hold.

Nearby active fruit identities remain separate:

| Current owner | Current scope | Boundary |
|---|---|---|
| `ingredient-ref-haskap-berry` | haskap berry / camerise | Distinct fruit; no shared aliases. |
| `ingredient-ref-maqui-berry` | maqui berry (*Aristotelia chilensis*) / maqui du Chili | Distinct species and fruit. |
| `ingredient-ref-saskatoon-berry` | Saskatoon berry / amélanche | Distinct fruit. |
| `ingredient-ref-dried-wolfberry` | dried wolfberry / baie du lyciet séchée | A separate dried fruit and French phrase; not argouse. |
| `ingredient-ref-cranberries` | cranberries / canneberges | Keep sour-tart culinary role out of aliases or substitution claims. |

There is no active sea-buckthorn oil, juice, pulp, powder, flour, jam, jelly, or leaf-tea identity in this snapshot. The Québec product sources name them separately; future product identities should not be folded into this berry row.

## Actual picker behavior

The recipe editor’s picker constructs `IngredientReferenceSearchIndex` from all active references and forms (`app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt`, `IngredientPickerDialog`). `IngredientSearch.kt` normalizes case, accents, compatibility characters, and punctuation, prefers complete word-phrase matches, then falls back to substring matches. The picker presents a result list; it does not infer ingredient equivalence from a shared fruit family or taste.

Static query comparison using the live implementation and proposed display/alias terms:

| Query | Live result before proposal | Result with proposed row | Reading |
|---|---|---|---|
| `sea buckthorn berry` | no result | `ingredient-ref-sea-buckthorn-berry` | Exact English display resolves to the candidate alone. |
| `sea buckthorn berries` | no result | `ingredient-ref-sea-buckthorn-berry` | Exact product plural resolves to the candidate alone. |
| `argouse` | no result | `ingredient-ref-sea-buckthorn-berry` | OQLF French fruit name resolves to the candidate alone. |
| `baies d’argousier` | no result | `ingredient-ref-sea-buckthorn-berry` | Québec product wording resolves to the candidate alone. |
| `sea buckthorn` | no result | `ingredient-ref-sea-buckthorn-berry` | OQLF-attested English fruit term resolves to the fruit row. |
| `argousier` | no result | `ingredient-ref-sea-buckthorn-berry` | Matches the word inside the supported `baie(s) d’argousier` terms. |
| `sea buckthorn oil` | no result | no result | Longer oil query does not resolve to the berry identity. |
| `berry` | 3 fruit results | those 3 plus the candidate | Remains a multi-result family query. |
| `berries` | 4 ingredient results | those 4 plus the candidate | Remains a multi-result query that also finds wheat-berry identities. |
| `baie` | 2 results | those 2 plus the candidate | Remains broad in French. |
| `baies` | 1 result | that result plus the candidate | Remains broad in French. |

The candidate should not be linked to the existing tart-fruit references. Its supported `sea buckthorn` alias makes that exact food query useful; the broader `berry` / `baie` queries continue to return a list rather than a unique or forced selection.

## Full bundled recipe-demand scan

Read all 114 recipe files listed by the current package manifest: **1,123 ingredient rows**. The scan checked ingredient display/original text, reference and form IDs, preparation/notes, all parsed recipe strings, and the complete file text for `sea buckthorn berry/berries`, `sea-buckthorn`, `seaberry`, `argouse/argouses`, `argousier`, `baie(s) d’argousier`, *Hippophae rhamnoides*, and adjacent juice/oil/pulp/powder wording.

| Candidate / related wording | Bundled result |
|---|---:|
| Sea-buckthorn / argouse fruit names and scientific name | 0 rows |
| Sea-buckthorn juice, pulp, oil, powder/flour, preserves, or leaf products | 0 rows |
| Candidate-linked recipe rows | 0 |

The scan does find unrelated generic berry recipes, including blueberry, strawberry, raspberry, and cranberry rows. They are already linked to their own references and provide no sea-buckthorn demand. No relinking, ingredient-line rewrite, quantity inference, or recipe substitution follows from this review.

## Numeric and substitution limits

- A Montréal retailer’s listing offers the frozen Québec berries in **500 g, 1 kg, and 2 kg** packages; the product was marked out of stock when accessed. These are retailer package options, not berry counts, recipe measures, or availability guarantees. [S05]
- A Québec fruit-and-vegetable information page describes **125 mL (½ cup)** as one fruit serving. It provides no matching mass, variety, packing method, or recipe conversion. Keep it as a serving statement only; do not create a density, volume-to-mass map, or standard serving conversion. [S06]
- The local product page recommends using the fruit in desserts and sauces and says it can replace lemon juice in cocktails. It gives no replacement amount or tested recipe ratio. That product-specific suggestion does not justify a general or contextual substitution rule. [S05]
- OQLF and UQAC describe the berries as acidic/tart; that sensory similarity alone does not support replacing cranberries, currants, lemon, or other tart fruit. Add no directed substitution or recipe substitution link.
- Keep measurement and substitution research `not_yet_researched`; add no default measure, density, edible-yield, freezing/thawing conversion, unit mapping, or conversion. A future recipe-specific quantity may be recorded only with its source and exact product/state.

## Integrated identity

The root integration added exactly one identity-only active reference:

```json
{
  "id": "ingredient-ref-sea-buckthorn-berry",
  "nameEn": "sea buckthorn berry",
  "nameFr": "argouse",
  "aliasesEn": ["sea buckthorn", "sea buckthorn berries", "seaberry", "seaberry fruit"],
  "aliasesFr": ["baie d'argousier", "baies d'argousier", "argouses"],
  "category": "FRUIT",
  "defaultDensity": null,
  "unitMappings": []
}
```

The `ingredient_reference` ledger record attaches sources S01–S06 and records the accepted species/fruit and product boundary. Measurement and substitution research remain unresearched. No legacy candidate, form, numeric observation, recipe link, conversion, yield, or substitution rule was added. Existing fruit references and recipe rows remain unchanged.

## Source register

Accessed 2026-10-12 unless otherwise stated.

| ID | Source | Use and limit |
|---|---|---|
| **S01** | Office québécois de la langue française, [*argouse* — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26556697/argouse), updated 2019. | Fruit-domain definition; preferred French `argouse` and `baie d’argousier`; English `sea buckthorn berry`, `sea buckthorn`, `seaberry`, and `seaberry fruit`. Direct Québec terminology evidence. |
| **S02** | Office québécois de la langue française, [*argousier* — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357878/argousier), updated 2004. | Defines the shrub as *Hippophae rhamnoides* and describes edible yellow-orange fruit; supports species identity, not a separate culinary alias set for leaves or oils. |
| **S03** | Université du Québec à Chicoutimi, [*Argousier, Hippophae rhamnoides*](https://www.uqac.ca/foretnourriciere/les-fruitiers/argousier/). | Québec educational source identifies the fruit, harvest season, acidity, and possible fruit uses; culinary context, not a product standard or conversion table. |
| **S04** | Aliments du Québec, [*Les Argousiers du Lac Brome Inc.*](https://alimentsduquebec.com/entreprises/les-argousiers-du-lac-brome-inc). | Québec producer listing distinguishes frozen berries from cold-pressed juice, pulp, powder, leaf tea, and sorbet; direct local product-boundary evidence. |
| **S05** | Racines boréales, Montréal, [*Baies d’argousier biologiques surgelées individuellement*](https://racinesboreales.ca/products/baies-dargousier-congelees-individuellement). | Québec product listing identifies individual frozen berries, 500 g/1 kg/2 kg package options, food uses, small edible seeds, and a cocktail lemon-juice replacement suggestion without a ratio. Marked out of stock at access; do not generalize package or usage statements. |
| **S06** | Mouvement J’aime les fruits et légumes, [*Baie d’argousier*](https://www.jaimefruitsetlegumes.ca/fr/aliments/baie-dargousier/). | Québec consumer nutrition page gives 125 mL (½ cup) as one fruit serving and describes culinary uses and processed forms. Secondary serving guidance only; no mass conversion or recipe-equivalence claim. |


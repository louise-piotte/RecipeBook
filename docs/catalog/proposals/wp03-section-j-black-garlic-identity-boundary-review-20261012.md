# WP03 Section J: black garlic identity and product-boundary review — 2026-10-12

- **Disposition:** recommend an identity-only `VEGETABLE_AND_AROMATIC` reference for **black garlic / ail noir**.
- **Scope:** the named black-garlic ingredient, including whole bulbs and cloves. Keep plain garlic, garlic paste, black-garlic paste, black-garlic powder, black-garlic salt, and other composites or preparations distinct.
- **Status:** root-reconciled. The identity was integrated as proposed; see [`wp03-black-garlic-identity-integration-20261012/README.md`](../batches/wp03-black-garlic-identity-integration-20261012/README.md).

## Evidence and recommendation

The OQLF Grand dictionnaire terminologique gives the preferred Québec French term **ail noir**, pairs it with English **black garlic**, and defines it as garlic that has undergone a Maillard reaction. It identifies the resulting charcoal colour and slightly tangy, sweet taste; its note describes the humidity and 50–70 °C conditions associated with that reaction. This is unusually direct terminology and identity evidence for a Québec ingredient candidate. It does not establish a standard commercial recipe or a culinary conversion. [S01]

Québec producers and retailers sell the exact named product. A Montérégie producer describes locally grown garlic transformed by stewing, while an Île d’Orléans producer separately lists bulbs, paste, powder, and salt products. Mayrand lists a Québec-produced 100 g bulb product. These sources support a useful base identity and show why the named prepared products should remain out of its aliases. Producer descriptions differ in process; the OQLF definition is the terminology anchor, not a claim that every producer uses one standardized treatment. [S02–S04]

The exact bilingual display phrases are not currently owned, broad garlic searches already return multiple ingredients, and adding the qualified phrase will create a distinct result without making it the sole result for `garlic` / `ail`. The complete bundled recipe scan found no black-garlic row or phrase. I recommend adding the identity for catalog coverage, with no recipe link or numeric behavior.

## Proposed identity and boundaries

| Field | Proposed value |
|---|---|
| Candidate ID | `ingredient-ref-black-garlic` |
| Category | `VEGETABLE_AND_AROMATIC` |
| English display | `black garlic` |
| Québec French display | `ail noir` |
| English aliases | none |
| French aliases | none |
| Density / unit mappings | none |
| Forms | none |
| Recipe links | none |
| Measurement, conversion, yield, or substitution data | none |

Keep the definition at the ingredient level: garlic identified as black garlic / ail noir. Whole bulbs and cloves are directly attested retail forms. Do not let this identity absorb or claim equivalence with:

- ordinary fresh garlic (`ingredient-ref-garlic`), garlic powder, garlic salt, or garlic scapes;
- black-garlic paste, black-garlic powder, or black-garlic salt, which Québec product listings name separately;
- black-garlic honey, oils, seasoning blends, or other products with added ingredients;
- roasted garlic, garlic confit, or a garlic cultivar merely described as dark/black.

Do not store `aged garlic`, `fermented garlic`, `black garlic cloves`, `bulbe d’ail noir`, or other variants as aliases in this pass. OQLF supports the exact bilingual pair; the local product examples are enough to show the product class but do not establish all of these as stable, unqualified aliases. In particular, retailer text calls one maker’s process fermentation, while OQLF describes the defining reaction as Maillard. The general identity should not encode a universal fermentation claim.

## Ownership and live package snapshot

Snapshot captured 2026-10-12 from the live workspace package:

| File / corpus | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,277 references | `35f1b3b98527b87d15648c9722af9a968e4b160e2b19714d8de66612bbd8d076` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,585 records; 5,630 source entries | `d75f02fafc1cfd015d10148a9e15c5862b438d190e4c3e8fa0cbc41313ceec97` |
| Manifest-listed recipe corpus | 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The corpus fingerprint is SHA-256 over each manifest-listed recipe path, a NUL byte, its raw file bytes, and a NUL byte, in manifest order. The reference, forms, manifest, legacy, and ledger hashes are raw-file SHA-256 values.

Normalized exact-key checks found no active-reference, form, legacy-candidate, or ledger-record owner for `black garlic`, `ail noir`, `black garlic bulb(s)`, `black garlic clove(s)`, `gousse(s) d’ail noir`, or the proposed ID. The proposal archive has no prior black-garlic identity review or hold; the only existing ledger mentions are incidental citations to a Télé-Québec black-garlic hummus recipe inside the black-sesame-paste and black-sesame-seed research records.

Relevant existing ownership is adjacent, not interchangeable:

| Current owner | Current scope / relevant name | Boundary |
|---|---|---|
| `ingredient-ref-garlic` | `garlic / ail`; aliases `garlic cloves` and `gousse d’ail` | Keep as unqualified ordinary garlic; do not add black garlic as its alias or link its raw-clove observation to black garlic. |
| `ingredient-ref-garlic-powder` | `garlic powder / poudre d’ail` | Keep dried powder separate. |
| `ingredient-ref-garlic-salt` | `garlic salt / sel d’ail` | Keep the salt blend separate. |
| `ingredient-ref-garlic-scape` | `garlic scape / fleur d’ail` | Keep the edible stem/flower stalk separate from the bulb. |
| `ingredient-ref-garlic-infused-oil` | garlic-infused oil | Keep the oil product separate. |
| `ingredient-ref-ginger-garlic-paste` | ginger-garlic paste | Keep the combined paste separate. |
| `ingredient-ref-toum` | toum; French alias `sauce libanaise à l’ail (toum)` | Keep the prepared garlic emulsion separate. |
| `ingredient-ref-chinese-chives` | Chinese chives; English alias `garlic chives` | Alias names a different Allium vegetable, not a garlic product. |

No candidate form, active reference, legacy candidate, or ledger record already owns the proposed exact bilingual phrases. The ledger’s two incidental black-garlic mentions do not allocate the ingredient or establish a prior decision.

## Actual picker behavior

The recipe editor’s picker constructs `IngredientReferenceSearchIndex` from all active references and forms (`app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt`, `IngredientPickerDialog`). `IngredientSearch.kt` normalizes case, accents, compatibility characters, and punctuation, prefers complete word-phrase matches, then falls back to substring matches. The picker presents a result list; its search does not infer ingredient equivalence from shared words.

Static query comparison using that implementation and the current reference/form terms:

| Query | Live result before proposal | Result with the proposed row | Reading |
|---|---|---|---|
| `black garlic` | no result | `ingredient-ref-black-garlic` | Exact English display resolves to the candidate alone. |
| `ail noir` | no result | `ingredient-ref-black-garlic` | Exact Québec French display resolves to the candidate alone. |
| `garlic` | 7 results | those 7 plus `ingredient-ref-black-garlic` | Broad; plain garlic, powders, salt, scapes, infused oil, combined paste, and garlic-chive wording stay separate results. |
| `ail` | 7 results | those 7 plus `ingredient-ref-black-garlic` | Broad French search; it does not select the new row automatically. |
| `black` | 24 results | those 24 plus `ingredient-ref-black-garlic` | Broad colour word remains ambiguous. |
| `noir` | 15 results | those 15 plus `ingredient-ref-black-garlic` | Broad colour word remains ambiguous. |
| `black garlic paste` | no result | no result | Paste is not an alias or form on this identity. |
| `pâte d’ail noir` | no result | no result | French paste product stays unallocated by this candidate. |
| `garlic cloves` | `ingredient-ref-garlic` | `ingredient-ref-garlic` | Existing ordinary-garlic alias remains exact; black garlic does not claim it. |

No aliases should be added to the generic garlic row. The exact qualified queries already supply the intended route without making black garlic a false answer to a generic garlic-clove line.

## Full bundled recipe-demand scan

Read all 114 recipe files named by the current package manifest: **1,123 ingredient rows**. The scan checked ingredient display/original text, ingredient-reference and form IDs, parsed recipe strings, and complete file text for the normalized phrases `black garlic`, `ail noir`, black-garlic bulbs/cloves, and black-garlic paste/powder/salt variants in English and French.

| Candidate / neighboring wording | Bundled result |
|---|---:|
| `black garlic`, `ail noir`, black-garlic bulbs/cloves | 0 rows |
| black-garlic paste, powder, salt, or French equivalents | 0 rows |
| Rows currently linked to plain `ingredient-ref-garlic` | 15 rows in recipes 007, 018, 034, 037, 066, 078, 085, 086, 090, 096, 097, 101, 104, 105, and 113 |
| Rows mentioning or linked to garlic powder | 8 rows in recipes 042, 043, 044, 074, 078, 082, 084, and 087 |
| Garlic-salt row | 1 row in recipe 019 |

The neighboring garlic rows are not black-garlic demand. Preserve all 24 existing garlic-related rows and their current links and text. There is no relink, ingredient-line rewrite, quantity inference, or recipe substitution to make.

## Numeric and substitution limits

- Mayrand’s Québec listing gives one **100 g** package of black-garlic bulbs; BALSAÏ lists 100 g and 500 g bulb products. These are package quantities, not a bulb mass, clove count, or recipe conversion. [S03–S04]
- Télé-Québec’s external *Houmous à l’ail noir* uses **2 crushed black-garlic cloves** and separately names black-sesame paste. It proves a Québec cooking use, not a bundled RecipeBook demand; the clove size and mass are not stated. Do not convert the two-clove recipe amount or attach it to the plain-garlic 3 g/clove ledger observation. [S05]
- OQLF’s 50–70 °C note describes the processing conditions that produce the Maillard reaction. It is not a recipe cooking temperature, product storage recommendation, measure, or unit mapping. [S01]
- No source supports density, cup/spoon mass, bulb/clove count-to-mass, drained or edible yield, generic conversion, or substitution. Do not treat raw garlic, roasted garlic, garlic paste, or garlic powder as interchangeable with black garlic. Flavor and texture descriptions are not a transferable substitution rule.
- At integration, keep measurement and substitution research `not_yet_researched`; do not activate any numeric or conversion value. The external source examples can remain identity evidence only.

## Integrated identity

The root integration added exactly one identity-only active reference:

```json
{
  "id": "ingredient-ref-black-garlic",
  "nameEn": "black garlic",
  "nameFr": "ail noir",
  "aliasesEn": [],
  "aliasesFr": [],
  "category": "VEGETABLE_AND_AROMATIC",
  "defaultDensity": null,
  "unitMappings": []
}
```

The `ingredient_reference` ledger record attaches sources S01–S05 and records the accepted bulb/clove product scope. Measurement and substitution research remain unresearched. No legacy candidate, form, numeric observation, recipe link, conversion, yield, or substitution rule was added. The existing garlic reference and the 24 garlic-related recipe rows remain unchanged.

## Source register

Accessed 2026-10-12 unless otherwise stated.

| ID | Source | Use and limit |
|---|---|---|
| **S01** | Office québécois de la langue française, [*ail noir* — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544773/ail-noir), updated 2018. | Preferred Québec term `ail noir`; exact English equivalent `black garlic`; defines treated garlic by Maillard reaction. Its 50–70 °C / humidity note describes production conditions, not recipe measurements. |
| **S02** | Ail en noir et blanc, [Produits](https://www.ailnoiretblanc.ca/produits/). | Québec producer at Saint-Pie describes a product called `AIL NOIR NON PELÉ`, with ingredient `ail vieilli`, and says it is used sliced, chopped, puréed, in sauce or vinaigrette, or dehydrated to powder. This is one producer’s product and naming, not a universal set of forms or process specification. |
| **S03** | BALSAÏ BIO, [Produits](https://www.balsai.ca/produits/). | Île d’Orléans producer page lists `Ail Noir en bulbe` (100 g and 500 g), `Pâte d’Ail Noir`, `Poudre d’Ail Noir`, and `Sel d’Ail Noir` separately. Product titles and package sizes are source-specific; the distinctions support the boundary, not measures. |
| **S04** | Mayrand, [*Ail noir biologique 100 g*](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/ail/ail-noir-biologique-bulbe-balsai-27580). | Québec retailer listing for Balsaï’s 100 g product. It describes dark, soft cloves and one producer’s seawater/fermentation process; its formulation/process statement is SKU-specific and conflicts in terminology with the OQLF’s Maillard definition, so do not generalize the word fermentation. |
| **S05** | Télé-Québec Cuisinez, [*Houmous à l’ail noir*](https://cuisinez.telequebec.tv/recettes/7796/houmous-a-lail-noir). | Québec recipe lists two crushed black-garlic cloves and black-sesame paste. External recipe use only; no clove mass or bundled demand. |


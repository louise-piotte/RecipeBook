# WP02 A4 — brown rice flour `complet` Québec naming review (R115)

**Reviewed:** 2026-10-14
**Status:** Proposal only.
**Scope:** Decide whether Québec French `farine de riz complet` and the product wording `farine de riz brun complet` belong to the active brown-rice-flour reference or represent another flour identity.

## Recommendation

**Add the two French search aliases `farine de riz complet` and `farine de riz brun complet` to the existing `ingredient-ref-brown-rice-flour` reference. Do not create a separate complete-rice-flour identity.** Keep the display `brown rice flour / farine de riz brun` and all English aliases unchanged.

The first alias is a bounded terminology inference: a current Québec manufacturer calls the source grain `riz brun` and `riz complet` interchangeably on its brown-rice-flour product page; current Québec and Canadian French product pages also use `farine de riz brun complet` for flour made from brown rice. This supports the shorter phrase as a useful picker alias on the existing brown-grain flour row. It does not establish `farine de riz complet` as an OQLF-preferred display or as the only Canadian French label. The second alias records the directly attested full compound product name.

This is a synonym and search-coverage decision only. It does not change the white/brown flour identity boundary, make the family-level `farine de riz` term brown-specific, or equate rice flour with rice starch. The active [WP02 A4 source-grade item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1909) already keeps white and brown rice flour separate. Its [verification notes](../../RecipeBook-global-ingredient-catalog-plan.txt#L7565) leave independent Québec French approval open. This review does not reopen the recent [WP03 `riz complet` grain-alias review](wp03-section-f-brown-rice-riz-complet-quebec-alias-review-20261012.md), which assigned only bare `riz complet` to the brown-rice grain row and kept flour separate.

| Field | Proposed state |
|---|---|
| Reference | Existing `ingredient-ref-brown-rice-flour` |
| English display / aliases | `brown rice flour`; no new English alias |
| French display | Keep `farine de riz brun` |
| French aliases | Add `farine de riz complet` and `farine de riz brun complet` |
| Category | Keep `FLOUR_AND_STARCH` |
| Separate identity | None |
| Forms, measures, density, mappings, conversions, yields, recipe links, substitutions | No additions |

## Evidence boundary

The Office québécois de la langue française defines `farine de riz` as finely milled rice and says it can come from white or brown rice. That supports the existing unqualified family-level row and the need to preserve the source-grain qualifier. It does not itself list `farine de riz complet` as a preferred term. The current Québec Cuisine Soleil product page names its product `Farine de riz brun` and says `Le riz brun aussi appelé riz cargo, ou riz complet`; it defines that grain by removal of the hull while retaining bran and germ. A separate Québec manufacturer, Cuisine l’Angélique, uses the product heading `Farine de riz brun complet` and its ingredient declaration says `farine de riz brun biologique`. QUeen Milling’s French Canadian product page uses `Farine de riz brun complet superfine` and identifies brown rice as the ingredient. These sources describe the same bran-retaining brown-rice flour class, not another starch or a third rice source grade.

The recommendation is an **alias inference** from those direct source statements, not an OQLF ruling. Keep the current display `farine de riz brun`; do not promote `farine de riz complet` to the canonical French name. Do not add `farine de riz entier`, `farine de riz intégral`, English `whole grain brown rice flour`, or supplier qualifiers such as `superfine`, `biologique`, and `sans gluten` without separate evidence that they are useful generic aliases. Keep the existing distinct white-rice, glutinous-rice, roasted-red-rice, and rice-starch references.

## Current ownership and picker projection

The current package snapshot contains **1,456 active references**, **105 ingredient forms**, **1,796 research-ledger records**, and **63 legacy-import candidates**. The manifest lists **114 recipes**. `ingredient-ref-brown-rice-flour` is `brown rice flour / farine de riz brun`, has empty alias arrays, `defaultDensity: null`, and empty `unitMappings`. It is a verified identity in the research ledger; its measurement and substitution states are both `not_yet_researched`. It has no attached form. The neighboring family-level `ingredient-ref-rice-flour` is `rice flour / farine de riz` and remains unaliased; white rice flour, glutinous rice flour, and rice starch are separately represented.

The exact-phrase audit compared displays and aliases in the [ingredient-reference file](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), form labels and match terms in the [form file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), candidates in the [legacy-import inventory](../legacy-import-identities.v1.json), and IDs in the [research ledger](../research-ledger.v1.json).

| Phrase | Current exact owner | Proposed ownership |
|---|---|---|
| `farine de riz complet` | None in references, forms, legacy candidates, or ledger IDs | `ingredient-ref-brown-rice-flour` French alias |
| `farine de riz brun complet` | None in references, forms, legacy candidates, or ledger IDs | `ingredient-ref-brown-rice-flour` French alias |
| `farine de riz brun` / `brown rice flour` | `ingredient-ref-brown-rice-flour` display keys | Unchanged |
| `farine de riz` / `rice flour` | `ingredient-ref-rice-flour` display keys; phrase search also returns qualified rice flours | Unchanged; family-level |
| `riz complet` | `ingredient-ref-brown-rice` French alias | Still owned by brown rice; phrase search also finds brown-rice flour through the proposed longer alias |
| `amidon de riz` / `rice starch` | `ingredient-ref-rice-starch` display keys | Unchanged; separate extracted starch product |

The [picker](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, returns complete word-phrase matches first, then tries substring matches. The following is a static projection from current references/forms under that rule, not a runtime picker test.

| Query | Current result | With proposed aliases |
|---|---|---|
| `farine de riz complet` | None | Brown rice flour only |
| `farine de riz brun complet` | None | Brown rice flour only |
| `farine de riz brun`; `brown rice flour` | Brown rice flour only | Unchanged |
| `riz complet` | Brown rice grain only | Brown rice grain and brown rice flour |
| `riz brun` | Brown rice, flakes, flour, syrup, puffed brown rice, and sprouted brown rice | Unchanged |
| `farine de riz`; `rice flour` | Seven rice-flour references, including the family row and qualified products | Same seven references |
| `farine de riz blanc`; `white rice flour` | White rice flour only | Unchanged |
| `riz complet rouge` | None | None; the red qualifier is not stripped |

The added alias makes an unqualified `riz complet` query return one more related choice, the flour. This follows the existing behavior for `riz brun`, which already returns the grain and qualified brown-rice products. The fully qualified flour phrase still returns only the flour row.

## Recipe demand

I scanned every path in the current [seed manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all 114 recipe files, and all **1,123 structured ingredient rows**. The scan covered full recipe JSON text and each ingredient object, including names, original wording, preparation, notes, reference IDs, and form IDs.

| Query family | Recipe files with a hit | Ingredient rows with a hit |
|---|---:|---:|
| `brown rice flour` / `farine de riz brun` | 0 / 114 | 0 / 1,123 |
| `farine de riz complet` / `farine de riz brun complet` | 0 / 114 | 0 / 1,123 |
| `whole grain brown rice flour` / `wholegrain brown rice flour` | 0 / 114 | 0 / 1,123 |
| `rice flour` / `farine de riz` | 0 / 114 | 0 / 1,123 |

No bundled row links to `ingredient-ref-brown-rice-flour`. No recipe link, recipe-specific amount, or recipe-driven substitution supports this naming change.

## Forms, measurements, and substitutions

- **Forms:** The brown-rice-flour reference has no attached forms. Add none. `Brown`/`complete` is a source-grain term within the same flour identity, not a dry/cooked state or an extra processing form.
- **Density and unit mappings:** Keep `defaultDensity: null` and `unitMappings: []`. The current ledger does not establish a reusable flour density or mapping.
- **Source-specific portions:** The Québec Food Directory lists one La Milanaise brown-rice-flour SKU at **1/3 cup (60 g)** and one Cuisine Soleil SKU at **1/4 cup (31 g)**. These are product-specific serving statements with no common fill method and are not mutually transferable. Do not convert them into a default density, unit mapping, or recipe measure. The current ledger state remains `not_yet_researched` for catalog measurements.
- **Conversions and yields:** No brown-rice-flour conversion, dry/cooked yield, or equivalence with white/glutinous rice flour or rice starch is established. Add none.
- **Substitutions:** The [Cuisine l’Angélique product page](https://www.cuisinelangelique.com/fr/produits/farine-riz-brun-sans-gluten) describes its flour as a substitute for wheat flour in gluten-free baking and breading but gives no general amount or formula. Cuisine Soleil gives product guidance for building one custom multi-flour blend; it is not a direct replacement ratio. The live [global](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json) and [contextual](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json) substitution files contain no brown-rice-flour rule. Keep substitution research and active rules unchanged.

## Source register

All sources below were accessed on **2026-10-14**. Proposal-local IDs are used for this review only; no ledger records or source entries are changed by this proposal.

| ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A4-BROWN-RICE-FLOUR-R115-S01` | OQLF, [GDT: farine de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), updated 2025; definition, note, and preferred term. | Defines the family term and says the flour can come from white or brown rice. It does not list `farine de riz complet` as a preferred grade term. |
| `WP02-A4-BROWN-RICE-FLOUR-R115-S02` | Cuisine Soleil, [Farine de riz brun](https://cuisinesoleil.com/produit/farine-de-riz-brun/), current French product page; product heading, ingredients, and “Le riz brun c’est quoi ?” section. | Names a current brown-rice flour product and says brown rice is also called `riz complet`; defines the bran-retaining grain distinction. Supports the terminology bridge, not an OQLF preference or a measurement. |
| `WP02-A4-BROWN-RICE-FLOUR-R115-S03` | Cuisine l’Angélique, [Farine de riz brun complet](https://www.cuisinelangelique.com/fr/produits/farine-riz-brun-sans-gluten), current French product page; heading, product description, and ingredient declaration. | Directly uses `farine de riz brun complet` for a Québec flour product and lists organic brown rice flour as its ingredient. Product guidance is specific to its SKU. |
| `WP02-A4-BROWN-RICE-FLOUR-R115-S04` | QUeen Milling, [Farine de riz brun complet superfine sans gluten](https://www.queenmilling.ca/fr/products/gluten-free-wholegrain-brown-rice-flour-superfine-1), French Canadian product page; heading, description, and ingredient image. | Uses the compound French name for flour made from brown rice and explicitly retains bran, germ, and endosperm. The page showed its variants as unavailable at review time; it supports naming/composition, not current stock or a market-wide grade standard. |
| `WP02-A4-BROWN-RICE-FLOUR-R115-S05` | MAPAQ / Répertoire des aliments québécois, [La Milanaise, Farine de riz brun entière biologique](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204185), product name, description, ingredient declaration, and serving field. | A Québec directory record describes flour made from organic brown rice and lists that SKU at 1/3 cup (60 g). One record only; the serving is not a general measure or density. |
| `WP02-A4-BROWN-RICE-FLOUR-R115-S06` | MAPAQ / Répertoire des aliments québécois, [Cuisine Soleil, Organic Gluten Free Brown Rice Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223778), product name, ingredient declaration, and serving field; last updated 2026-07-24. | A second Québec product record lists organic brown rice flour at 1/4 cup (31 g). This is a separate SKU-specific serving statement, not a transferable mapping. |

## Disposition

For a later integration, add only the two French aliases to `ingredient-ref-brown-rice-flour`; keep its display, source-grade identity, English aliases, category, forms, numeric fields, and substitution behavior as described above. Do not add a separate `farine de riz complet` identity or fold this term into the generic family row. No shared seed JSON, ledger, plan, roadmap, generated index, or runtime file was changed; no tests or emulator checks were run.

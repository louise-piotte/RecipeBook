# WP02 Section G pita and lavash identity boundary review — 2026-10-10

- **Packet type:** proposal-only source review; no canonical catalog or recipe changes made.
- **Scope:** pita bread and lavash bread as ingredient identities; generic flatbread wording; pita chips and lavash crackers as adjacent, distinct products.
- **Disposition:** recommend two separate, identity-only references for `pita bread / pain pita` and `lavash bread / pain lavash`. The bundled corpus has no exact demand to relink. Keep pita chips, lavash crackers, and generic `flatbread` wording out of either bread identity's aliases; no form, measurement, conversion, yield, or substitution is supported here.
- **Online source access date:** 2026-10-10.

## Checklist mapping

The active [Section G checklist](../../../docs/RecipeBook-global-ingredient-catalog-plan.txt), line 1592, leaves “Corn/wheat tortillas, pita, lavash, naan, roti, paratha, injera, flatbread, bread rolls, sandwich bread, sourdough bread, and regional breads used as ingredients” open. This packet addresses only pita and lavash. It does not close the broad checklist line or decide the other bread families.

## Live snapshot and audit method

Snapshot read on 2026-10-10. The manifest lists 114 recipe files. Each ingredient row was checked for `originalText`, `ingredientName`, and `ingredientRefId`; all recipe metadata fields were also scanned for the target spellings. Search terms included pita/pitas, pitta/pittas, lavash/lavashes, flatbread/flat breads, `pain pita`, `pain pitta`, `pain lavash`, `pain plat`, `pita chips`, `pita crackers`, `croustilles pita`, and `lavash crackers`. The full-file scan found no related ingredient-row or metadata matches. The corpus digest below is SHA-256 over each manifest-relative recipe path, a NUL byte, and that file's raw bytes, concatenated in manifest order.

| Artifact | Current count | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| [Seed manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe files | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| [Ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 872 references | 274,909 | `4af290779e837b1e3562296bcbde3928c7079e7c0e94a9a30372f88e58f1307c` |
| [Ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 48 forms; no pita/lavash match | 33,483 | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| [Research ledger](../research-ledger.v1.json) | 1,118 records; no pita/lavash record | 2,860,034 | `17b9c3db25ff6ed280a914c7432084e29b799f73c182d588ebe2601932252fcc` |
| [Legacy identity candidates](../legacy-import-identities.v1.json) | 78 candidates; no pita/lavash candidate | 18,736 | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipe corpus | 1,123 ingredient rows; 751,959 recipe-file bytes; 0 target rows | — | Ordered digest `009a0dbd340a3e85e8a6809bc19e871f911b110357b127d55f7eb50c0cbf1055` |

The active references and aliases, all form labels/match terms, all legacy candidates, and all research-ledger records were searched for the same target terms and normalized names. No existing exact owner or ID was found for `pita`, `pitta`, `pita bread`, `pain pita`, `lavash`, `lavash bread`, `pain lavash`, `flatbread`, `flat bread`, `pain plat`, `pita chips`, or `croustilles pita`.

## Exact bundled recipe demand

| Result | Recipe rows and line IDs | Action |
| --- | --- | --- |
| Pita / pitta / pita bread / pain pita | None in the 1,123 ingredient rows | No recipe relink or line-level alias inference. |
| Lavash / lavash bread / pain lavash | None in the 1,123 ingredient rows | No recipe relink or line-level alias inference. |
| Generic flatbread / flat bread / pain plat | None in the 1,123 ingredient rows | Do not create an umbrella alias or relink. |
| Pita chips / croustilles pita / pita crackers / lavash crackers | None in the 1,123 ingredient rows | No snack/cracker reference or recipe action in this packet. |

There are no exact recipe row IDs to enumerate. This is identity coverage prompted by the still-open Section G scope, not bundled recipe demand.

## Current identity, alias, and collision check

No current active reference or form uses pita, pitta, lavash, or generic flatbread wording. The adjacent IDs checked are distinct product families and should not absorb either proposed bread:

| Current ID | Current name or scope | Boundary |
| --- | --- | --- |
| `ingredient-ref-brioche-bread` | `brioche bread` / `pain brioche` | Retain as brioche; not an alias for all bread. |
| `ingredient-ref-bread-flour` | `bread flour` / `farine à pain` | Flour identity, not a ready-to-use bread. |
| `ingredient-ref-breadcrumbs` | `bread crumbs` / `chapelure` | Crumb product; no bread-slice identity implied. |
| `ingredient-ref-panko`, `ingredient-ref-cracker-crumbs`, `ingredient-ref-matzo-meal`, `ingredient-ref-croutons` | Named crumb, cracker, meal, or toasted-bread products | Keep as separate processed products; none is a pita/lavash alias. |
| `ingredient-ref-rice-paper-wrapper`, `ingredient-ref-wonton-wrapper`, `ingredient-ref-gyoza-wrapper`, `ingredient-ref-wheat-spring-roll-pastry`, `ingredient-ref-egg-roll-wrapper` | Already integrated wrapper identities | Keep wrappers separate from bread products; no wrapper alias is proposed. |
| Legacy `ingredient-ref-bread-crumbs` | `bread crumbs` / `chapelure` | Adjacent legacy breadcrumb candidate only; its reconciliation is outside this scope. |

No active or legacy ID collision exists for proposed `ingredient-ref-pita-bread` or `ingredient-ref-lavash-bread`. There are no related active forms or form-match terms. No pita/lavash ledger record exists to merge or supersede.

## Proposed dispositions and fr-CA names

| Target | Decision / proposed ID | English display / aliases | fr-CA display / aliases | Boundary |
| --- | --- | --- | --- | --- |
| Pita bread | **Integrate identity-only** as `ingredient-ref-pita-bread`; category `BAKING_MIXIN_AND_PANTRY` is consistent with the active brioche and bakery-product references. | Display: `pita bread`. No extra aliases. | Display: `pain pita`. No extra aliases. | Québec product listings use `pain pita`; the English name `pita bread` is used by a Canadian bakery. The display phrases already contain the searchable term `pita`; do not add the ambiguous short alias `pita` or Belgium-associated `pitta`. |
| Lavash bread | **Integrate identity-only** as `ingredient-ref-lavash-bread`; category `BAKING_MIXIN_AND_PANTRY`. | Display: `lavash bread`. No extra aliases. | Display: `pain lavash`. No extra aliases. | French UNESCO wording identifies lavash as a traditional thin bread; Canadian product sources attest `pain lavash` and `Lavash pain mince`. `lavash` is already in both display phrases, so no duplicate alias is needed. Do not alias generic `flatbread` / `pain plat` or the separate cracker product. |

These are two separate named bread products, not forms or aliases of each other. Product variation is intentionally left open: sources describe regional and manufacturer-specific variation, and the corpus contains no line to anchor a narrower recipe state. Keep pocketed/pocketless, mini/large, white/whole-wheat, fresh/dried, and crisp/cracker states out of the reference forms until a bounded use case is reviewed. No density, unit mapping, weight, portion conversion, conversion, yield, or substitution is proposed.

## Product boundaries and picker caveats

- **Pita chips are separate from pita bread.** OQLF defines *croustilles pita* as chips based on pita bread and gives English *pita chips*. Treat it as a distinct prepared snack if a future recipe needs it; do not add it as a pita alias or activate a separate row now without demand.
- **Lavash crackers are separate from lavash bread.** Canadian manufacturer Ozery lists *Craquelins lavash* in its French catalog and describes the English `Lavash Crackers` as crackers. Do not infer a crisp/dry lavash form or alias these crackers to the bread.
- **Flatbread is a broad category, not a synonym.** The checklist groups pita, lavash, naan, roti, paratha, injera, and generic flatbread as neighboring work. Keep `flatbread`, `flat bread`, and `pain plat` out of both alias arrays; any future generic flatbread identity needs its own scope review.
- **Search results remain suggestions.** [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case and accents, then matches display names, aliases, and form terms by phrase and partial text; the recipe picker ([`RecipeEditorScreen.kt`](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt)) presents selectable results. A query such as `pita` will match the proposed `pita bread` / `pain pita` display, and a future separate pita-chip identity could appear beside it. This is not automatic assignment. Broad aliases such as `bread` or `flatbread` would create unnecessarily wide suggestions, so omit them.

## Merge-ready outline

1. Add `ingredient-ref-pita-bread` with `nameEn: "pita bread"`, `nameFr: "pain pita"`, empty alias arrays, null density, empty unit mappings, and category `BAKING_MIXIN_AND_PANTRY`.
2. Add `ingredient-ref-lavash-bread` with `nameEn: "lavash bread"`, `nameFr: "pain lavash"`, empty alias arrays, null density, empty unit mappings, and category `BAKING_MIXIN_AND_PANTRY`.
3. Add identity-only ledger records with terminology/identity evidence cited below; leave measurement and substitution research not yet researched. Do not add forms or conversions.
4. Relink no bundled recipe rows; the exact target scan found none. Leave the broad Section G bread checklist open.
5. Keep `pita chips / croustilles pita`, `lavash crackers / craquelins lavash`, and generic `flatbread / pain plat` outside these identities and aliases.

## Sources and access limits

| ID | Source and supported claim | Access date and limits |
| --- | --- | --- |
| **S01** | Office québécois de la langue française, [*pita* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8367691/pita). Lists French terms `pita`, `pitta`, `pain pita`, and related sandwich terms; notes *pitta* is especially attested in Belgium. Its definition is a filled sandwich, not a stand-alone bread entry, so the bread identity label is corroborated with product sources below. | Opened 2026-10-10. Terminology evidence only; the definition does not settle a bread-only alias. |
| **S02** | Aliments du Québec, [*Pain pita blanc* — Produits Andalos](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/pain-pita-blanc) and [*Pain Pita Blanc* — Sanabel](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/pain-pita-blanc-2). Both use the exact Québec product label `Pain pita blanc`; the listings identify their Québec manufacturers and retail availability. | Opened 2026-10-10. Product naming and local market evidence, not a generic manufacturing specification. |
| **S03** | Cedar Bakery, [Pita Bread supplier/product page](https://www.cedarbakery.ca/). A Canadian bakery describes soft pita bread and supplies branded/private-label pita products for grocery and foodservice. | Opened 2026-10-10. Manufacturer-specific product language; no cross-product recipe conversions. |
| **S04** | UNESCO Intangible Cultural Heritage, [*Lavash, the preparation, meaning and appearance of traditional bread as an expression of culture in Armenia* — English](https://ich.unesco.org/en/RL/le-lavash-preparation-signification-et-aspect-du-pain-traditionnel-en-tant-qu-expression-culturelle-en-armenie-00985) and [French](https://ich.unesco.org/fr/RL/le-lavash-preparation-signification-et-aspect-du-pain-traditionnel-en-tant-qu-expression-culturelle-en-armenie-00985). The French entry says “Le lavash est un pain traditionnel fin”; the English record likewise describes lavash as traditional thin bread. | Search result content read 2026-10-10. Direct page opening triggered a browser verification challenge; use only the indexed official wording, not unreviewed page details. The cultural description is Armenian-specific and does not define every commercial lavash variant. |
| **S05** | Super C, [*Lavash pain mince* — Gugo](https://www.superc.ca/allees/pains-et-patisseries/tortillas-et-pains-plats/pains-plats-et-naan/lavash-pain-mince/p/797153446631), product 797153446631. The Québec retailer lists a French-language `Lavash pain mince` product in its flatbread/naan shelf category. | Search-indexed product result read 2026-10-10; direct page fetch returned HTTP 403. The indexed listing supports the local product wording only; product details and current store availability were not independently inspected. |
| **S06** | Canadian Intellectual Property Office, [2017 Trade-marks Journal, Vol. 64, No. 3277, p. 652](https://www.ic.gc.ca/opic-cipo/tmj/eng/16Aug2017_fr.pdf?edition=08-16&year=2017), application 1,804,776, Ozery's Pita Break Inc. The published French goods/services text uses `pain pita` and `pain lavash` separately and also lists `pain plat`. | Opened 2026-10-10. This is a trademark goods description, not an OQLF recommendation or product standard; use as corroboration that the proposed French phrases are attested in Canada. |
| **S07** | Ozery Bakery, [French Canadian product catalog](https://ozerybakery.com/ca-fr/nos-produits/), [Mini-Pitas — nature](https://ozerybakery.com/ca-fr/nos-produits/mini-pitas-nature/), and [Craquelins lavash — épeautre biologique](https://ozerybakery.com/ca-fr/nos-produits/%C3%A9peautre-biologique/). The manufacturer separately labels a pita bread item `Mini-Pitas` and its snack product `Craquelins lavash`; the latter page describes cracker use. | Opened 2026-10-10. Manufacturer-specific product distinction, not a global recipe or form rule. |
| **S08** | Office québécois de la langue française, [*croustilles pita* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17035589/croustilles-pita). Defines them as chips based on pita bread and gives English `pita chips`. | Opened 2026-10-10. Direct Québec terminology evidence for keeping chips separate from the bread identity. |

An OQLF/TERMIUM query pass did not find a dedicated Québec terminology entry for lavash bread. This is a search limit, not evidence that the term is absent from Québec usage. The local Super C listing, Canadian French-language manufacturer wording, UNESCO French entry, and CIPO journal provide the narrower attestations used here. No source supports numeric measures, densities, substitutions, or universal product-state equivalence.

## Remaining Section G work

This proposal does not modify canonical files or close the checklist. Corn/wheat tortillas, naan, roti, paratha, injera, generic flatbread, rolls, sandwich bread, sourdough, and other regional breads remain open, as do the separate puff-pastry, cracker/crumb, wrapper, and prepared-starch lines. The accepted identity recommendations above are limited to two proposed references and zero recipe links.

## Integration outcome

Integrated on 2026-10-10 as identity-only `ingredient-ref-pita-bread` (`pita bread / pain pita`)
and `ingredient-ref-lavash-bread` (`lavash bread / pain lavash`). Both have empty alias lists, null
density, and no unit mappings, forms, or recipe links. Pita chips, lavash crackers, and generic
flatbread remain separate. See the
[catalog product-boundary batch report](../batches/catalog-product-boundary-followup-20261010/README.md).

# WP03 Section F R174 — Québec oat-rice product and hulless-oat boundary review (2026-10-16)

**Recommendation:** Add only `hulless oats` as an English alias and `avoine nue` as a French alias to the existing `ingredient-ref-oat-groats` row. Keep the manufacturer's and retailer's product-title terms `Organic Oat Rice` and `Riz d'avoine biologique` out of aliases because the current picker would also return oat groats for bare `rice` and `riz` searches. Do not create a separate rice, cereal-mix, brand, or cooked-form identity.

This is a Québec whole-grain product-name gap under the still-open [Section F regional cereal-mix and preprocessed-grain review](../../RecipeBook-global-ingredient-catalog-plan.txt#L3503). It is distinct from the 10 Grain Hot Cereal blend, R173 Bob's Red Mill 8 Grain Hot Cereal, and R172's Aurora polenta-roll boundary. The three reviews cover different products and scopes ([10 Grain integration](../batches/wp03-section-f-bobs-red-mill-10-grain-hot-cereal-integration-20261014/README.md), [R173 integration](../batches/wp02-wp03-wp04-r173-gap-review-integration-20261016/README.md), [R172 integration](../batches/wp02-wp03-wp04-r172-gap-review-integration-20261016/README.md)).

## Product and ingredient boundary

Les Belles Récoltes de Charlevoix sells a Québec-grown organic oat kernel under the French product title **Riz d'avoine biologique**; its English Lufa listing calls the corresponding product **Organic Oat Rice** [S01–S03]. Aliments du Québec describes the product as `Avoine nue biologique en amande`. Maturin's listing calls it whole oat, says it cooks like rice, and declares `Avoine nue biologique` as its ingredient [S04]. Together, these sources identify an unprepared whole oat kernel. “Rice” describes the product's culinary analogy and title; the ingredient is oats, not rice.

The Canadian Grain Commission defines hulless oats as oats whose loose hulls are usually removed at harvest and defines groats as oat kernels without hulls [S05]. The local listing's whole-kernel wording supports mapping this food product to the existing whole-kernel oat-groats identity. This does not settle cultivar, agricultural grade, or the processing history of every hulless-oat product. TERMIUM Plus lists `hulless oat`/`naked oat` and French `avoine nue` for the plant entry *Avena nuda* [reused S08]; that terminology entry alone is not a food-product definition. Here the Québec product description supplies the food context for `avoine nue`.

The MAPAQ project list, dated 2026-03-31, separately names a project to develop three flavours of precooked oat rice [S06]. It establishes a development project, not a marketed SKU, finished-product specification, or the current 500 g whole-kernel product's cooked state. Keep any precooked product identity or form out of this review unless a current product source defines it.

## Exact proposed delta

Keep the existing row and its bilingual display. If adopted, add only the two technically supported ingredient-name aliases below:

| Field | Current | Proposed |
|---|---|---|
| ID | `ingredient-ref-oat-groats` | Unchanged |
| English display | `oat groats` | Unchanged |
| French display | `gruau d'avoine entier` | Unchanged |
| English aliases | `[]` | [`hulless oats`] |
| French aliases | `[]` | [`avoine nue`] |
| Category | `GRAIN_AND_CEREAL` | Unchanged |
| Default density / unit mappings | `null` / `[]` | Unchanged |
| Forms, measures, recipe links, substitutions | None | None |

Do not add `oat rice`, `Organic Oat Rice`, `riz d'avoine`, or `Riz d'avoine biologique` as aliases. Do not add `naked oats`: TERMIUM's entry is plant terminology and the reviewed English food listing uses the analogical product title, not `naked oats`. Do not add the product's 500 g package size, the 5 kg or 12 × 500 g Maturin package options, or any cooking instruction as a measure, density, conversion, yield, or substitution.

## Ownership and archive audit

The live bundled package snapshot has **1,549 references and 120 forms**. `ingredient-ref-oat-groats` currently has no aliases, no attached form, a null default density, and empty unit mappings. Normalized exact-key scans of active names and aliases, form labels and match terms, and the **61** legacy-import identities found no exact owner for `hulless oats`, `avoine nue`, `oat rice`, `Organic Oat Rice`, `riz d'avoine`, or `Riz d'avoine biologique`. The existing exact owner for `oat groats / gruau d'avoine entier` remains `ingredient-ref-oat-groats`; generic `rice / riz` remains separately owned.

The **1,894-record** ledger has no `candidate-oat-rice` record or exact candidate for these product-title terms. The oat records are separate: oat groats, puffed oats, dry oat meal, and malted naked-oat flour. In particular, the prior [puffed-oats hold](./wp03-section-f-next-gap-review-20261011-puffed-oats.md) concerns a puffed product, while the [malted naked-oat flour review](./wp02-a7-malted-naked-oat-flour-boundary-review-20261013-round33.md) concerns flour. Reuse its TERMIUM source `WP03-POATS-20261011-S08` only for the plant-name evidence; neither prior candidate is reopened here. The [R109 oat-groats French-display review](./wp03-section-f-oat-groats-quebec-display-review-r109-20261014.md) retained the display and empty aliases based on then-reviewed evidence. The current local ingredient listing supplies new food-context evidence for the narrow `avoine nue` alias; this proposal does not revisit R109's display decision or the ambiguous `amande(s) d'avoine complète(s)` wording.

No focused `oat rice` / `riz d'avoine` review was found in the proposal and batch archive. The exact source IDs `WP03-OAT-RICE-R174-20261016-S01` through `S06` and the six product/technical URLs below were absent from the ledger and prior proposal/batch files at review time. They are proposal-local and remain unallocated until root integration.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9): case and accent folding, punctuation-to-space normalization, complete word-phrase matching first, then substring fallback. It uses all current reference and form terms; it is not runtime picker QA.

| Query | Current | With only `hulless oats` and `avoine nue` | If both bilingual product titles were also aliases |
|---|---|---|---|
| `hulless oats` | 0 | `ingredient-ref-oat-groats` | Same |
| `avoine nue` | 0 | `ingredient-ref-oat-groats` | Same |
| `oat groats` / `gruau d'avoine entier` | 1 / 1 | Same | Same |
| `oat rice` / `Organic Oat Rice` | 0 / 0 | 0 / 0 | 1 / 1 |
| `riz d'avoine` / `Riz d'avoine biologique` | 0 / 0 | 0 / 0 | 1 / 1 |
| bare `rice` / `riz` | 66 / 61 | 66 / 61 | 67 / 62 |
| broad `oats` / `avoine` | 7 / 11 | 8 / 11 | 8 / 11 |

The proposed aliases make the source-backed whole-grain terms resolve to the existing oat-groats row without changing rice-query results. Adding product titles would make those exact titles searchable but insert an oat-groats result into each broad rice query; the returned row would still display `oat groats / gruau d'avoine entier`. Revisit the titles if search behavior can preserve their qualifiers during bare `rice` and `riz` searches, or if root accepts the broader results.

## Recipe-corpus demand

The manifest lists **114 recipe files and 1,123 structured ingredient rows**. A full-file and ingredient-row scan for the product titles, `oat rice`, `riz d'avoine`, `avoine nue`, `hulless oats`, `naked oats`, and oat-groats wording found **zero matches**. There are also **zero direct links** to `ingredient-ref-oat-groats` in the bundled recipe corpus. This is regional catalog coverage, not a recipe relink or demand-backed form addition.

## Quantities, forms, and substitutions

- Treat 500 g, 5 kg, and 12 × 500 g only as package quantities tied to the cited listings. None is a household amount or density observation.
- “Cooks like rice” describes preparation analogy; it does not establish a rice-to-oat replacement ratio, cooking yield, or a global or contextual substitution rule.
- Add no cooked, precooked, puffed, milled, or other form. The MAPAQ project listing does not establish a current precooked SKU or product specification.
- Keep `defaultDensity` null and `unitMappings` empty. Add no recipe link, conversion, yield, or substitution finding.

## Sources

New IDs below are proposal-local and unallocated. Existing TERMIUM source `WP03-POATS-20261011-S08` is reused from the ledger rather than reissued.

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP03-OAT-RICE-R174-20261016-S01` | Aliments du Québec, [Riz d'avoine biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/riz-davoine-biologique), checked 2026-10-16. Names Les Belles Récoltes de Charlevoix's Québec product and describes it as `Avoine nue biologique en amande`; lists a 500 g format. | Product/market wording and package size, not a terminology ruling, species determination, household measure, or density. |
| `WP03-OAT-RICE-R174-20261016-S02` | Lufa Farms Marketplace, [Les Belles Récoltes de Charlevoix — English page](https://montreal.lufa.com/en/marketplace/partner/les-belles-recoltes-de-charlevoix-699), checked 2026-10-16. Lists `Organic Oat Rice`, 500 g. | Retail title and package listing; no ingredient-panel or hull-processing specification. Availability is not generalized. |
| `WP03-OAT-RICE-R174-20261016-S03` | Marché des Fermes Lufa, [Les Belles Récoltes de Charlevoix — French page](https://montreal.lufa.com/fr/marche/partenaire/les-belles-recoltes-de-charlevoix-699), checked 2026-10-16. Lists `Riz d'avoine biologique`, 500 g. | Retail title and package listing; not a terminology ruling or kitchen conversion. Availability is not generalized. |
| `WP03-OAT-RICE-R174-20261016-S04` | Maturin, [12x Riz d'avoine bio (format économique)](https://www.maturin.ca/index.php/produit/les-belles-recoltes-de-charlevoix/12x-riz-davoine-bio-format-economique/15185/), checked 2026-10-16. Identifies whole oat cooked like rice, gives `Avoine nue biologique` as the ingredient, and lists 500 g, 5 kg, and 12 × 500 g package formats. | Retailer product description, not a recipe, measure, standardized cooking method, or reusable yield. Package options remain source-specific. |
| `WP03-OAT-RICE-R174-20261016-S05` | Canadian Grain Commission, [Oats: Grading factors](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/07-oats/grading-factors.html), checked 2026-10-16, `Hulled and hulless` section. Defines hulless oats and groats. | Grain-grading definitions support the kernel boundary; they do not define Québec consumer preference or the exact processing history of the retail product. |
| `WP03-OAT-RICE-R174-20261016-S06` | MAPAQ, [Programme Alimentation Santé funded-project list](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/programmes/alimentation-sante/LI_projets-finances-PAS_MAPAQ.pdf), information current to 2026-03-31, p. 3. Lists Les Belles Récoltes de Charlevoix's development project for three flavours of precooked oat rice. | Project intent only; does not establish completion, a current commercial SKU, ingredients, processing specification, cooking behavior, or recipe measure. |
| Reused `WP03-POATS-20261011-S08` | Translation Bureau, TERMIUM Plus, [Avena desnuda / naked oat](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=AVENA+DESNUDA), record dated 2021-06-14. Lists `naked oat`, `hull-less oat`, `hulless oat`, and French `avoine nue` for *Avena nuda*. | Plant terminology; it does not define a food product by itself. The local Aliments du Québec/Maturin listings provide the food context used in this proposal. |

## Disposition

Recommend adding only `hulless oats` and `avoine nue` as aliases on the existing oat-groats reference. Keep the rice-style commercial titles and every numeric or preparation behavior source-scoped and inactive. The Section F parent review remains open for other regional cereal mixes and preprocessed grains. This proposal changes no shared catalog JSON, generated Kotlin, ledger, roadmap, plan checklist, or batch README; root owns any integration and checklist update.

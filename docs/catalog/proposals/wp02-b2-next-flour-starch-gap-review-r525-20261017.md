# WP02 B2 next flour/starch gap review — precooked chickpea flour (R525)

- **Reviewed:** 2026-10-17.
- **Status:** Accepted and integrated on 2026-10-17. Root added the proposed form and its source-specific research record; see the [integration README](../batches/wp02-b2-precooked-chickpea-flour-form-integration-r525-20261017/README.md).
- **Scope:** One product form under the existing generic chickpea-flour reference: Canadian supplier-listed precooked chickpea flour.
- **Recommendation:** Integrate one `precooked` form under `ingredient-ref-chickpea-flour`. Keep it distinct from raw, roasted/chana-sattu, and pregelatinized products. Use a descriptive, provisional Québec French display and no match-term aliases.
- **Proposed form ID:** `ingredient-form-chickpea-flour-precooked`.
- **New source-ID prefix:** `WP02-B2-PRECOOKED-CHICKPEA-FLOUR-R525-20261017`.

## Plan fit and decision

The open WP02 B2 checklist still covers alternative flours, including chickpea/besan flour, at [the B2 parent item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2612). The base chickpea-flour identity, its product-specific portion research, and its bounded Besan aliases were already handled in the [R284 review](wp02-b2-chickpea-flour-measurement-substitution-review-r284-20261016.md) and [R319 review](wp02-b2-besan-gram-flour-alias-boundary-review-r319-20261016.md). This proposal addresses a different gap: a named commercial processing state absent from the current forms attached to that reference.

Simpson Seeds, a pulse-flour mill in Moose Jaw, Saskatchewan, currently lists **Precooked Chickpea Flour** and **Raw Chickpea Flour** as separate products. The precooked item is explicitly marked `Format Precooked`; the raw item is marked `Format Raw`. The supplier says it serves food manufacturers across Canada. A French-language pulse-flour supplier separately markets *farine de pois chiche précuite* and *farine de pois chiche prégélatinisée* as distinct products. Together these sources support the bounded `precooked` product form without implying that precooked means pregelatinized or that every chickpea flour has a known heat-treatment specification.

Use this form proposal only:

```json
{
  "id": "ingredient-form-chickpea-flour-precooked",
  "ingredientRefId": "ingredient-ref-chickpea-flour",
  "formCode": "precooked",
  "labelFr": "farine de pois chiche précuite",
  "labelEn": "precooked chickpea flour",
  "prepState": "precooked",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "État de produit commercial attesté par des farines de pois chiche vendues comme précuites. Le libellé français est descriptif et provisoire pour le Québec. Simpson Seeds ne précise pas le procédé thermique; ne pas assimiler ce produit à une farine prégélatinisée ou prête à manger. Aucune mesure ménagère ni densité propre au produit Simpson n’est établie; aucune substitution générale n’est étayée.",
  "notesEn": "Commercial product state attested by chickpea flours sold as precooked. The French label is descriptive and provisional for Québec. Simpson Seeds does not specify the thermal process; do not equate this product with pregelatinized or ready-to-eat flour. No household measure or density is established for the Simpson product; no general substitution is supported.",
  "updatedAt": "2026-10-17T00:00:00Z"
}
```

The English display follows Simpson Seeds’ exact product title. The French wording combines the current Canadian term *farine de pois chiche* with the French-language product wording *précuite*. OQLF supports *pois chiche* as the Québec term for *Cicer arietinum*; its entry does not decide the flour compound or the processing adjective. No current Québec-market label for precooked chickpea flour was found, so keep the French display provisional and add no French alias.

Do not add `pre-cooked chickpea flour`, `instant chickpea flour`, `pregelatinized chickpea flour`, `farine de pois chiches précuite`, or `farine de pois chiche prégélatinisée` as match terms. The hyphenated English and plural French wording surfaced on a retailer site shipping this Turkish product from Turkey; it does not establish Canadian or Québec search wording. Simpson’s `instant hydration` and application claims describe product performance, not the product name `instant flour`. Armada’s French page treats precooked and pregelatinized as separate offerings, so those terms must not become aliases for one another.

## Current identity ownership

| Active owner | Current data and boundary |
|---|---|
| `ingredient-ref-chickpea-flour` | `chickpea flour / farine de pois chiche`; category `FLOUR_AND_STARCH`; current aliases are `farine de pois chiches`, `farine de besan`, `besan`, `besan flour`, and `gram flour`; no forms, density, or unit mappings. This is the proposed form owner. The generic identity and aliases are not changed. |
| `ingredient-ref-desi-chickpea-flour` | `Desi chickpea flour / farine de pois chiches Desi`, with only the existing English alias `desi besan`; no forms. Keep this source-qualified product separate. |
| `ingredient-ref-chana-sattu` | `chana sattu / farine de sattu`, including the existing roasted-grain aliases. It is a roasted product, not the precooked milling product reviewed here. |
| `ingredient-ref-chickpeas` | Whole chickpea identity with its own dried/canned forms. Do not attach the flour state to whole chickpeas. |
| `ingredient-ref-fava-bean-flour` | Already owns the R372 `precooked` fava-flour form. Keep that species-specific form and the chickpea form on their respective references. |


## Picker impact

`IngredientSearch.kt` accent-folds and normalizes punctuation, returns complete word-phrase matches before substring fallback, and supplies a form hint only when the query equals a complete form label or match term. The following is a static projection of the current references/forms and the proposed form; no app picker was run.

| Query | Current result | Projected result | Form hint |
|---|---|---|---|
| `precooked chickpea flour` | None | `ingredient-ref-chickpea-flour` | Yes, exact English label |
| `farine de pois chiche précuite` (also accent-folded `... precuite`) | None | `ingredient-ref-chickpea-flour` | Yes, exact French label |
| `pre-cooked chickpea flour` | None | None | No; no hyphenated alias proposed |
| `raw chickpea flour` | None | None | No; the raw sibling product is not a proposed form |
| `farine de pois chiche` | `ingredient-ref-chickpea-flour` | Same reference | No; process is not specified |
| `farine de pois chiches` | Generic chickpea flour, Desi chickpea flour, and chana sattu | Same three references | No |
| `chickpea flour` | Generic chickpea flour, Desi chickpea flour, and chana sattu | Same three references | No |
| `besan` | Generic and Desi chickpea flour | Same two references | No |
| `gram flour` | Generic chickpea flour and chana sattu | Same two references | No |
| `instant chickpea flour` / `pregelatinized chickpea flour` | None | None | No; do not infer synonyms from use claims |
| `precooked` / `précuite` | Existing precooked fava flour, corn flour, and fonio results as applicable | Same results plus generic chickpea flour | No; these are broad single-word queries |

The exact product phrases select only the existing generic identity and show a form hint. The unqualified base names keep their current result sets. A search for the broad process word `precooked` or `précuite` gains the chickpea-flour row alongside existing process-qualified products; no alias is added to widen that effect.

## Source evidence and limits

| ID | Source and URL | Evidence and limits |
|---|---|---|
| **S01 — new** `WP02-B2-PRECOOKED-CHICKPEA-FLOUR-R525-20261017-S01` | Simpson Seeds, [Precooked Chickpea Flour](https://simpsonseeds.com/products/precooked-chickpea-flour/), accessed 2026-10-17. | Product title and description; `Format Precooked`; applications and packaging; supplier location and service region (product page, properties and food-applications sections, and manufacturer contact section). Supports the exact English product/form term and a Canadian supplier listing. It does not disclose the thermal schedule, cultivar, a retail Québec product, household measure, density, or recipe replacement ratio. Hydration, binding, and application claims are not substitution rules. Its per-100-g nutrition panel is not a volume-to-mass measure. |
| **S02 — new** `WP02-B2-PRECOOKED-CHICKPEA-FLOUR-R525-20261017-S02` | Simpson Seeds, [Raw Chickpea Flour](https://simpsonseeds.com/products/raw-chickpea-flour/), accessed 2026-10-17. | Sibling product title and `Format Raw` (product description and properties section). Supports the supplier’s raw/precooked product distinction, but not that the two products share a lot, cultivar, formulation, particle size, or performance. It does not support adding a raw form in this review. |
| **S03 — reused** `WP02-B2-RED-LENTIL-FLOUR-20261012-S04` | Simpson Seeds, [Pulse Flour](https://simpsonseeds.com/our-products/pulse-ingredients/), accessed 2026-10-17. | The live product list now places `Precooked Chickpea Flour` and `Raw Chickpea Flour` as separate entries and identifies the mill in Moose Jaw, Saskatchewan. This exact URL and source ID already appear in the [2026-10-12 red-lentil-flour review](wp02-b2-red-lentil-flour-search-boundary-review-20261012.md) for its red-lentil listings; reuse that ID here for the current chickpea listings rather than issuing a duplicate URL registration. The current page supplies no process specification or numeric conversion evidence. |
| **S04 — new** `WP02-B2-PRECOOKED-CHICKPEA-FLOUR-R525-20261017-S04` | Armada Ingredients, [Farine de pois chiche — fournisseur industriel](https://armadaingredients.com/fr/produits/farine-de-pois-chiche), accessed 2026-10-17. | Product range entries `Farine de pois chiche précuite` (AG-PC-CPF) and `Farine de pois chiche prégélatinisée` (AG-PG-CPF) use distinct French product terms. This is a French-language B2B supplier page from Türkiye, not Québec terminology authority or a Canadian product match; use it to corroborate the lexical distinction only. Its stated hydrothermal treatment is not attributed to Simpson Seeds. |
| **S05 — new, assessed but not activated as aliases** `WP02-B2-PRECOOKED-CHICKPEA-FLOUR-R525-20261017-S05` | Grandbazaarist, [Naturelka Farine de pois chiches précuite, 250 g](https://www.grandbazaarist.com/fr/naturelka-pre-cooked-chickpea-flour-250-g-8-8oz/), accessed 2026-10-17. | Retail title and product details use plural French `farine de pois chiches précuite` and identify a 250 g Naturelka product of Turkish origin shipped from Türkiye. This supports that wording for this imported SKU, not Québec/Canadian naming or a household volume measure. It is not added as a search alias. |
| **S06 — new** `WP02-B2-PRECOOKED-CHICKPEA-FLOUR-R525-20261017-S06` | Dogruer et al., [Formulation of Gluten-Free Cookies Utilizing Chickpea, Carob, and Hazelnut Flours through Mixture Design](https://www.mdpi.com/2304-8158/12/19/3689), *Foods* 12(19):3689 (2023), accessed 2026-10-17. | Methods §2.1 identifies the pre-cooked chickpea flour as sourced from Naturelka, Türkiye; §2.2.2 and Table 2 report bulk density **0.70 ± 0.00 g/mL** for that tested flour. This is a sample-specific laboratory bulk-density result, not a household cup measure or Simpson Seeds product density. The study’s mixed-flour cookie formulations are recipe-specific and provide no reusable replacement rule. |
| **S07 — reused** `WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S03` | OQLF, [pois chiche (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche), updated 2026, accessed 2026-10-17. | OQLF gives the preferred Québec term `pois chiche`, English `chickpea`, and Latin *Cicer arietinum*. Supports the plant term used in the French display, not the flour compound or processing state. Reuse the registered source ID and URL; do not duplicate it. |
| **Existing sources reused in context** `WP02-S26`, `WP02-S29` | Satau / Cuisine Soleil, [bilingual product portfolio](https://satau.ca/medias/documents/portfolios/Portfolio-gammes-Satau-EN-2023-06-12.pdf); Health Canada, [non-novel food ingredient determinations](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html). | Already registered under `ingredient-ref-chickpea-flour`. The Canadian bilingual product portfolio uses `farine de pois chiche`; Health Canada uses `Farine de pois chiche`. These support the local base-flour wording only, not the new process adjective. Keep their existing source IDs; do not register duplicate source entries. |

New IDs S01, S02, S04, S05, and S06 and their exact URLs were not found in the current research ledger or existing catalog proposal/batch files at this review snapshot. S03 reuses the source ID and URL already cited in the red-lentil-flour proposal; S07 and the existing Canadian French base-term sources are reused under registered IDs. No source registration or ledger edit was made.

## Exact-key ownership and recipe demand

At the read-only final-review snapshot, the bundled package contained **1,797 ingredient references** (SHA-256 `bb380278585b32b2785b8b1bad1907b5f1b1b3903ef32ad5c5c345a849f11923`) and **143 forms** (SHA-256 `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6`). The legacy-import file contained **56 candidates** (SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720`). The research ledger contained **2,153 records** and **9,893 source entries** (SHA-256 `0d0180c44121b82fc769730b2399dac6f5cb0493db324e615efea1758b20d3a1`).

Exact and normalized searches of active references, forms, legacy candidates, the research ledger, and current catalog proposal/batch Markdown found no owner or prior decision for `ingredient-form-chickpea-flour-precooked`, `precooked chickpea flour`, `pre-cooked chickpea flour`, `farine de pois chiche précuite`, or `farine de pois chiches précuite`. Available git history searches found no prior occurrence of the proposed form ID, English base phrase, or singular French phrase. No `docs/catalog/archive` directory is present. [R372](../batches/wp02-b2-precooked-fava-flour-form-integration-r372-20261016/README.md) is the separate fava-flour `precooked` form; [R381](../batches/wp02-b2-b3-pregelatinized-sorghum-flour-hold-integration-r381-20261016/README.md) holds a sorghum-flour `pregelatinized` product over its Québec naming gap. Neither owns this chickpea-flour form or phrase.

A manifest-ordered scan read all **114 recipe files**, covering **1,123 structured ingredient rows** and **753,988 recipe-file bytes**. Accent- and punctuation-normalized file and ingredient-row searches for the candidate phrases, raw/precooked chickpea flour, the existing chickpea-flour names (`chickpea flour`, `garbanzo flour`, `besan`, `gram flour`, `farine de pois chiche(s)`), and pregelatinized wording found **zero candidate phrase hits**. There are also **zero direct ingredient-reference links** to the generic chickpea-flour, Desi chickpea-flour, or chana-sattu references. Thus the bundled corpus provides no demand, form application, measure, recipe relink, or substitution for this processing state.

Corpus fingerprint: SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`, calculated over each manifest-listed recipe path in order as the relative path, a NUL byte, exact file bytes, and a NUL byte.

## Numeric and substitution boundary

Keep `densityGPerMl` null and do not add unit mappings or portion observations. Simpson Seeds gives industrial package sizes and a per-100-g nutrition panel, neither of which establishes a volume measure or bulk density. Dogruer et al. report laboratory bulk density of **0.70 ± 0.00 g/mL** for a Naturelka pre-cooked flour sample. If retained in the ledger, store it only as a product-specific `bulk_density` observation with the sample source and method limits; do not attach it to the proposed form or use it as a kitchen packing conversion because the tested product is not Simpson’s, and the method citation does not establish a household fill convention. The existing R284 1/4 cup (30 g) observations belong to the named Cuisine Soleil and Bob’s Red Mill products and must not be transferred to this precooked product. No reviewed source provides a product-matched household measure or a transferable density for Simpson Seeds’ flour.

Keep all substitution and conversion data empty. Simpson Seeds’ hydration, thickening, binding, and application statements describe the product’s functions; they do not establish a target flour, recipe formula, replacement percentage, or adjustment. Dogruer et al.’s flour blend trials are limited to their tested cookie formulations. The R284 chickpea-flour studies and manufacturer guidance remain product- or recipe-specific and do not establish a reusable ratio for precooked flour. No bundled recipe uses this candidate, so no contextual substitution or same-ingredient form conversion is supported.

The [R525 integration](../batches/wp02-b2-precooked-chickpea-flour-form-integration-r525-20261017/README.md) added the `precooked` form and source-specific Naturelka bulk-density observation to the research ledger, while keeping active density, aliases, unit mappings, and substitutions empty. Plan, workflow, and roadmap entries now record the completed review. No software tests, build, emulator run, or deployment were performed for this database-JSON update under `AGENTS.md`.

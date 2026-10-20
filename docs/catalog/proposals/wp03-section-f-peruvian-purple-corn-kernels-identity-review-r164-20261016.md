# WP03 Section F — Peruvian purple corn kernels identity review (R164)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog JSON, ledger, generated code, active plan, roadmap, recipe, or batch README was changed.
- **Checklist:** The active [Section F identity checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L519) still leaves other unresolved grain products open; the [regional cereal-mix and preprocessed-grain item](../../RecipeBook-global-ingredient-catalog-plan.txt#L3438) also remains open. This review selects one whole-grain maize product after R162 blue corn kernels and R163 white corn kernels. It does not reopen either accepted row.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for dry, food-grade whole kernels sold as Peruvian purple corn: **`Peruvian purple corn kernels / grains de maïs mauve péruvien`**.
- **Prospective reference ID:** `ingredient-ref-peruvian-purple-corn-kernels` (unallocated).
- **Proposal-local source IDs:** `WP03-PURPLE-CORN-R164-20261016-S01` through `S06`; all are unallocated.

## Identity boundary and naming

The proposed identity is limited to **dry whole maize kernels marketed as Peruvian purple corn / Peruvian `maíz morado` for human food use**. It records a source-named food-grain market product, not one cultivar, a color-purity threshold, a universal definition of purple maize, a geographic appellation, or a nutritional claim. Peru's INIA describes `maíz morado` as *Zea mays* with purple color in the grain and reports commercial/export sample types separately as grain, flour, and crushed corncob [S01–S02]. A current Canadian seller lists a dry purple-corn product under `Maiz Morado`, describes whole kernels, and identifies Peru as origin [S03].

The Québec French display uses local culinary wording: Khuya, a Québec Peruvian-food service, describes chicha morada as a pineapple-and-`maïs mauve` drink [S05]. Canada's French-language Canada–Colombia tariff schedule separately names `maïs mauve (Zea mays amilacea cv. morado)` [S04]. Those sources support `maïs mauve` as French wording, but the tariff entry is trade nomenclature, not a Québec package label or a botanical ruling, and Khuya's menu describes a prepared beverage rather than a kernel SKU. The full display `grains de maïs mauve péruvien` is therefore an evidence-informed product construction, not an OQLF term or exact local package title. No Québec French whole-kernel product label was located.

Keep this row scoped to the Peru-sourced whole-grain product. Do not imply that all purple, violet, or nearly black maize from other countries has the same cultivar, crop identity, or product specification. The earlier [Ecuadorian black-corn-flour review](wp06-black-corn-flour-boundary-review-20261009.md) and [harina de maíz negro boundary review](wp06-harina-maiz-negro-boundary-review-20261009.md) concern flour and explicitly leave cross-country equivalence unestablished; this review neither reopens nor aliases those flour decisions. Canadian purple popcorn listings describe a separate popping product, not Peruvian `maíz morado` [S06].

Exclude planting seed, fresh or sweet corn, purple popcorn, ornamental or multi-colour maize, corn flour/meal, purple-corn pigment or extract, cob/corncob products, hominy, and prepared foods such as chicha morada. Do not add `maíz morado` as a bare Spanish alias: the archive has documented that similarly worded black/purple maize in Ecuador does not by itself establish equivalence to products in other countries. `purple corn` remains searchable as a phrase within the English display; `maïs mauve` remains searchable within the French display.

## Proposed reference delta

If accepted, add only this identity row:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-peruvian-purple-corn-kernels` |
| English display | `Peruvian purple corn kernels` |
| Québec French display | `grains de maïs mauve péruvien` (evidence-informed construction; not an exact Québec kernel-package title) |
| English / French aliases | `[]` / `[]` |
| Category | `GRAIN_AND_CEREAL` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

No form is proposed. Sources distinguish grain from flour and cob but do not provide a validated dry/cooked form mapping or reusable kitchen conversion.

## Current ownership, archive, and normalized-key audit

The live package snapshot contains **1,539 ingredient references** ([reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)), **119 forms** ([form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)), **61 legacy-import candidates** ([legacy identities](../legacy-import-identities.v1.json)), and **1,884 research-ledger records** ([research ledger](../research-ledger.v1.json)). The ledger has **8,023 source entries, 6,864 distinct source IDs, and 5,662 distinct URLs**. Exact normalized-key checks covered the proposed ID and candidate key, displays, relevant color/Spanish terms, reference names and aliases, form labels and match terms, legacy names and aliases, and ledger record IDs. No exact current owner was found for `ingredient-ref-peruvian-purple-corn-kernels`, `candidate-peruvian-purple-corn-kernels`, `Peruvian purple corn kernels`, `purple corn kernels`, `purple corn`, `maíz morado`, `maiz morado`, `grains de maïs mauve`, or `maïs mauve`. The shorter `maïs` and `corn` terms have many existing owners and are treated only as broad-query behavior, not exact-key conflicts.

The active catalog already contains generic `corn kernels / maïs`, dried sweet corn kernels, R162 `blue corn kernels / grains de maïs bleu`, R163 `white corn kernels / grains de maïs blanc`, and separate Chulpe, white canjica, popcorn, hominy, grits, meal, flour, bran, germ, and processed-corn identities. Preserve all of them. The full Section F and proposal archive was searched for purple whole-kernel maize; the only close purple-maize reviews are the Ecuadorian flour-boundary decisions linked above. No prior whole-kernel Peruvian purple-corn identity, active candidate, hold, or integrated row was found. The [R162 blue-kernel proposal](wp03-section-f-blue-corn-kernels-identity-review-r162-20261016.md) and [R163 white-kernel proposal](wp03-section-f-white-corn-kernels-identity-review-r163-20261016.md) concern different color classes and are not changed.

All six URLs in the source register below have no exact URL owner in the active ledger. The six proposal-local source IDs are also unallocated in the ledger and archive. No source entry is reused, and this proposal does not allocate any ID or URL in shared data.

## Picker projection

The static projection applies the phrase-first, accent- and punctuation-folded search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) to current references and forms. It adds the proposed bilingual display with no aliases or forms:

| Query | Current → proposed | Result |
|---|---:|---|
| `Peruvian purple corn kernels` | 0 → 1 | Proposed identity only. |
| `purple corn kernels` / `purple corn` | 0 / 0 → 1 / 1 | Proposed identity only. |
| `grains de maïs mauve péruvien` / `grains de maïs mauve` | 0 / 0 → 1 / 1 | Proposed identity only. |
| `maïs mauve` | 0 → 1 | Proposed identity only. |
| `maiz morado` / `maíz morado` | 0 / 0 → 0 / 0 | No bare Spanish alias is proposed; this preserves the cross-country boundary. |
| `corn kernels` | 4 → 5 | Adds the Peru-qualified row beside generic, dried-sweet, blue, and white corn-kernel results. |
| `corn` | 30 → 31 | Adds one qualified result to the broad English maize search. |
| `maïs` | 32 → 33 | Adds one qualified result to the broad French maize search. |
| `grains de maïs` | 2 → 3 | Adds it beside the existing blue- and white-kernel rows. |
| `mauve` | 2 → 1 | Current substring fallback returns marshmallow creme and marshmallows; after the addition, the complete-word match in the French display takes precedence and returns the new corn row alone. `guimauve` still returns its marshmallow owner. |
| `maize` | 4 → 4 | Unchanged; no unqualified maize alias is added. |
| `blue corn kernels` / `white corn kernels` | 1 / 1 → 1 / 1 | R162 and R163 exact owners remain unchanged. |
| `canjica white` / `maïs blanc` | 1 / 2 → 1 / 2 | The canjica and white-kernel results remain unchanged. |
| `popcorn` / `hominy corn` / `corn grits` / `cornmeal` | 1 / 1 / 1 / 1 → 1 / 1 / 1 / 1 | Existing prepared and milled-product owners remain unchanged. |

The one-word `mauve` behavior is disclosed because complete-word matches outrank the old substring results. It gives the color query its direct French corn result; users can continue to find the marshmallow products with `guimauve` / `guimauves` or their full names. No generic `corn`, `maize`, `maïs`, or bare Spanish alias is introduced.

## Recipe demand, measurements, forms, and substitutions

All **114 recipe files named by the bundled-library manifest** and all **1,123 structured ingredient rows** were scanned, including all string fields, for `purple corn`, `purple maize`, `Peruvian purple corn`, `purple corn kernels`, `maíz morado` / `maiz morado`, `grains de maïs mauve`, `maïs mauve`, `maïs violet`, Peruvian variants, and `chicha morada`. The scan found **zero candidate-term hits in complete recipe files, zero candidate-term ingredient-row hits, and no linked candidate ID**. The recipe corpus provides no evidence for a recipe link or for a form/state relationship.

Do not add a measure, density, mapping, form, or cooking yield. A Canadian product page title says 1.3 kg while its body says each pack contains 425 g; the page is currently on backorder, so neither quantity is treated as reliable reusable measurement evidence [S03]. Peru's INIA research and trade pages discuss agricultural grain production and export sample types, not kitchen portions [S01–S02]. The product page's suggested uses do not establish a serving measure.

Do not add a substitution or recipe-line link. The sources do not validate an amount or scope for replacing this dry product with generic yellow/white maize, blue maize, sweet corn, popcorn, Chulpe, canjica, hominy, a milled product, or a cob/pigment product. Sharing the species *Zea mays* or an occasional use in a drink or stew does not establish interchangeability.

## Proposed ledger disposition

If integrated, create one `ingredient_reference` record keyed `ingredient-ref-peruvian-purple-corn-kernels`, with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Register the six sources below and one accepted decision for the bounded Peruvian dry-kernel market product. Leave aliases, measurement observations, substitution findings, forms, density, and unit mappings empty. Do not create a separate candidate record or attach the Ecuadorian flour sources as if they established product equivalence.

## Source register

The source IDs are proposal-local and unallocated. Sources were checked on 2026-10-16. Dynamic retail inventory and seller-specific package descriptions are recorded only as current page observations.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP03-PURPLE-CORN-R164-20261016-S01** | Instituto Nacional de Innovación Agraria (Peru), [Innovación para la Agroexportación](https://www.inia.gob.pe/innovacion-agroexportacion/), current page, section “Servicios especializados para agroexportación.” | Says INIA has processed export-certificate requests for `maíz morado` samples in three separately named types: `grano`, `harina`, and `coronta triturada`. This is strong product-form separation; the page is institutional export context, not a consumer specification or proof that every sample is dried/whole. |
| **WP03-PURPLE-CORN-R164-20261016-S02** | INIA / Universidad Nacional de Trujillo researchers, [Cultivo de maíz morado (*Zea mays* L.) en zona altoandina de Perú](https://repositorio.inia.gob.pe/items/860bddfc-e2ef-4e15-8891-76dc053931f8), 2020, abstract. | Identifies Peruvian `maíz morado` as *Zea mays* and reports purple coloration in the grain and other plant parts, with multiple cultivars evaluated. Supports a crop/colored-grain distinction; it is agricultural research and does not define a uniform commercial cultivar or kitchen property. |
| **WP03-PURPLE-CORN-R164-20261016-S03** | Sombrero Latin Foods, [Dry Purple Corn 1.3 Kg | Maiz Morado | Del Campo](https://sombrerolatinfoods.ca/products/dry-purple-corn-1-3kgr-maiz-morado-by-del-campo), current Canadian retailer page. | Describes Peru-sourced dry purple corn sold as `Maiz Morado` and as kernels, with food uses. The page was on backorder. Its title says 1.3 kg while the body says 425 g per pack; no package measure is transferred. It is a seller description, not a technical standard. |
| **WP03-PURPLE-CORN-R164-20261016-S04** | Global Affairs Canada, [Canada–Colombia Free Trade Agreement: Tariff Rate Quotas, Annex](https://www.international.gc.ca/trade-commerce/trade-agreements-accords-commerciaux/agr-acc/colombia-colombie/fta-ale/annex-218-annexe.aspx?lang=fra), French text, tariff item 10059040. | Uses the French designation `Maïs mauve (Zea mays amilacea cv. morado)`. Supports the exact French color term and a recognized maize classification phrase; this tariff schedule is trade nomenclature for the agreement, not a Québec consumer label or a broad botanical equivalence ruling. |
| **WP03-PURPLE-CORN-R164-20261016-S05** | Khuya, [L’expérience Khuya](https://khuya.ca/produit/lexperience-khuya/), current Québec menu. | Identifies Khuya as a Québec-based Peruvian-food service and describes its chicha morada drink as pineapple juice with `maïs mauve`. Supports local French culinary wording and Peruvian context, not a standalone kernel product title, formula, or measurement. |
| **WP03-PURPLE-CORN-R164-20261016-S06** | Well.ca, [Purplesful Snacking Purple Kernel Sea Salt Popcorn](https://well.ca/products/purplesful-snacking-popcorn-grains-violets-sel-de-mer_220303.html), current Canadian retailer page. | Distinguishes a Canadian product made from purple-kernel popcorn corn and sold as a prepared popcorn snack. Used only to exclude purple popping corn from the proposed non-popping Peruvian dry-kernel row; no ingredient identity or measure is transferred. |

## Review disposition

Recommend one identity-only `GRAIN_AND_CEREAL` row for Peruvian dry whole purple-corn kernels. The evidence connects a named Peruvian purple-grain crop, separately exported grain/flour/cob forms, a current Canadian retail product, and French `maïs mauve` terminology found in both an official Canadian trade schedule and local Québec culinary use. Preserve the local-term, species, cultivar, and availability limits stated above; keep aliases, forms, numeric data, recipe links, and substitutions empty. This proposal makes no database JSON change, so no app or Android tests are requested under the updated `AGENTS.md` rule.

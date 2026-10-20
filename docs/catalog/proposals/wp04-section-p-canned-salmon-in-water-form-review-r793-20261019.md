# WP04 Section P — water-packed canned salmon form review (R793)

- **Review and source-access date:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. Root accepted one bilingual canned-salmon-in-water form and one product-specific drained-serving observation.
- **Integration record:** [R791–R793 batch README](../batches/wp02-wp03-wp04-r791-r793-gap-review-integration-20261019/README.md).
- **Open checklist gap:** [Section P preservation checklist, line 8375](../../RecipeBook-global-ingredient-catalog-plan.txt#L8393): “Smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented fish/seafood forms.” This proposal advances only one explicitly water-packed canned-salmon form; the checklist is not edited here.
- **Recommendation:** Add one `canned_in_water` form beneath existing `ingredient-ref-canned-salmon`. Keep salmon species, presentation, ingredients, package size, drained basis, and any handling instruction product-specific.
- **Scope:** The species-neutral canned-salmon product group `canned salmon / saumon en conserve`, integrated by R172. This is a form-qualified picker choice, not a new identity or salmon species.
- **Proposal-local IDs:** Proposed form ID `ingredient-form-canned-salmon-in-water`; new source IDs `WP04-SECTIONP-CANNED-SALMON-WATER-FORM-R793-20261019-S01` and `-S02`; observation ID `canned-salmon-water-form-cloverleaf-pink-salmon-half-can-drained-r793-20261019`; audit ID `WP04-SECTIONP-CANNED-SALMON-WATER-FORM-R793-20261019-R01`. All remain unallocated pending integration.

## Why this is a distinct open form

R172 added `ingredient-ref-canned-salmon` as the identity-only product group `canned salmon / saumon en conserve`, with empty aliases and no forms. It kept species, presentation, packing medium, drained state, and package quantity product-specific. The broad preservation review declined universal canned forms, but did not decide the explicitly water-packed slice of the existing canned-salmon group. R790 resolved only canned tuna in water beneath the separate canned-tuna parent; it did not assign a canned-salmon form. The open preservation checklist therefore supports this separate, single-form review without reopening either parent identity. See the [R172 canned-salmon proposal](wp04-section-p-canned-salmon-product-boundary-review-r172-20261016.md), [R172 integration record](../batches/wp02-wp03-wp04-r172-gap-review-integration-20261016/README.md), and [R790 water-packed canned-tuna proposal](wp04-section-p-next-open-gap-review-r790-20261019.md).

The live read-only snapshot contains **1,876 ingredient references, 196 forms, 56 legacy candidates, and 2,281 research-ledger records**. `ingredient-ref-canned-salmon` is active as a `PROTEIN` reference with the bilingual names above, no aliases, null default density, empty unit mappings, and no attached forms. Its parent ledger record remains identity-verified, with no supported generic measure and no supported substitute. The proposed form ID and exact bilingual label pair have no current form, reference, legacy-candidate, or ledger-record owner.

## Product and species boundary

The current FAO/WHO Codex Standard for Canned Salmon (CXS 3-1981), amended in 2026, defines canned salmon across seven named species, permits salt, water, salmon oil, and/or other edible oils as added ingredients, and says the packing medium forms part of the food name. This supports treating an explicitly named water-packing qualifier as a meaningful product boundary. It is an international product standard, not Canadian law, a Canadian package claim, or evidence that all salmon species or canned-salmon products are packed in water. The existing R172 parent source ID `WP04-SECTIONP-CANNED-SALMON-R172-20261016-S01` already owns the exact Codex URL; reuse that parent evidence by reference and do not duplicate or move its source record. [Reused R172 S01]

Clover Leaf's current English product page says its wild Pacific pink salmon is packed in water and canned as medium-size pieces or “chunks”; it names *Oncorhynchus gorbuscha*, lists pink salmon, water, and salt, and gives a Nutrition Facts serving of `1/2 can drained (55 g)`. The corresponding current French product page describes pink salmon in 142 g cans, says it is `emballé dans de l’eau`, identifies *O. gorbuscha* and the salmon/water/salt ingredients, and displays the same drained nutrition basis. The pages do not expose a shared cross-language SKU identifier; treat them as matching language-specific product evidence, not as two independent products or portion observations. Together they demonstrate a current Canadian product marketed in water, while supporting only the stated pink-salmon product scope, chunk/flaked presentation, ingredient list, can amount, and nutrition portion.

Use the transparent descriptive form labels **canned salmon in water / saumon en conserve dans l’eau**. The English wording reflects the manufacturer's direct packing-medium statement; the French wording combines the existing Québec French parent name with the directly attested `emballé dans de l’eau` qualifier. It is a descriptive picker label, not an OQLF ruling or a claim that the manufacturer prints this exact combined phrase. Do not assign pink salmon, *O. gorbuscha*, chunks, salt, 142 g, skin/bone status, or drained state to the generic form. Do not imply every canned-salmon species or SKU has this form.

Keep this form distinct from canned salmon packed in oil or broth, the R172 pink-salmon item described as packed in its own juice, smoked or seasoned salmon, salmon salad/pâté, pouch products, raw salmon, and salmon species identities. The words `water`, `eau`, or `in water` must not be added as standalone aliases or match terms; only the complete bilingual form label is proposed. Do not infer that a user should drain the product from the phrase `in water`.

## Exact-key, active-data, and source-ownership audit

The ownership audit compared normalized bilingual active reference names/aliases, form labels and match terms, legacy candidate fields, ledger record IDs/source IDs/URLs, and focused proposal/batch archives. The picker check follows phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Key or owner | Live result | Disposition |
|---|---|---|
| `ingredient-ref-canned-salmon` | Existing active `canned salmon / saumon en conserve`, `PROTEIN`, no aliases or attached forms. Its current parent ledger row owns R172's canned-salmon identity sources. | Keep the identity, aliases, category, numeric fields, and parent evidence unchanged. |
| `ingredient-form-canned-salmon-in-water`; `canned salmon in water`; `saumon en conserve dans l’eau` | No exact active form ID, bilingual form term, reference term, legacy-candidate term, or ledger record ID. | Propose once as a form under the canned-salmon parent. Add no independent ingredient identity or aliases. |
| R172 Codex source `WP04-SECTIONP-CANNED-SALMON-R172-20261016-S01` | Existing source ID and Codex URL are owned by the canned-salmon parent. | Reuse as parent-scope context only; do not duplicate its URL or reassign its owner. |
| R172 maker sources `WP04-SECTIONP-CANNED-SALMON-R172-20261016-S03` and `-S04` | Existing English pink-salmon product and French pink-salmon maker sources are owned by the parent. The English S03 page already says its named product is packed in water; the older French S04 page describes a distinct `packed in its own juices` product. | Preserve both source owners and their different product claims. The newly verified paired URLs below are distinct routes; no source is transferred. |
| R793 form source IDs and URLs | New prefix is absent from the ledger. The exact Clover Leaf URLs below are not owned in the current ledger and were not found in focused prior proposal/batch files. | Keep the two new source IDs proposal-local pending integration; cite the already parent-owned Codex source only as reused evidence. |
| Proposed R793 form, observation, and proposal path | No existing ID/path owner; target proposal path was free before this write. | Unique proposal-local IDs and path. |

No exact prior proposal or integration record for a canned-salmon-in-water form was found. R172 explicitly left canned salmon without forms; R790 covers canned tuna only. This proposal does not copy R790's tuna-specific products, species, observations, or source IDs.

## Proposed picker projection

Only the complete bilingual form labels are added as terms under the existing reference; no aliases or extra match terms are proposed. A complete label match returns the same canned-salmon reference and supplies its explicit form hint. Shorter contained phrases can find the parent without asserting that the user chose the form.

| Query | Current results | With proposed form | Effect |
|---|---:|---:|---|
| `canned salmon in water` | 0 | 1: `ingredient-ref-canned-salmon` | Exact English form label selects the canned-salmon parent with the water-packed form hint. |
| `saumon en conserve dans l’eau` | 0 | 1: `ingredient-ref-canned-salmon` | Exact descriptive French form label selects the same parent with the form hint; accent folding is unchanged. |
| `salmon in water` | 0 | 1 | Finds the parent through the contained phrase; this shorter query is not the complete form label and does not select a form hint. |
| `canned salmon`; `saumon en conserve` | 1 each | 1 each | Existing exact parent-name queries stay unchanged and do not select the water-packed form. |
| `salmon`; `saumon` | 10 each | 10 each | Existing broad salmon searches remain multi-result; the form adds no separate identity. |
| `pink salmon`; `saumon rose` | 1 each | 1 each | Existing species identities stay unchanged; the generic form does not claim pink salmon. |
| `water`; `eau` | 14; 17 | 15; 18 | Each broad term gains the canned-salmon parent and remains multi-result. No standalone match term is added. |
| `in water`; `dans l’eau` | 1; 2 | 2; 3 | Broad packing-medium phrases gain the parent and remain multi-result; only full bilingual labels give the exact form hint. |
| `canned`; `en conserve` | 19; 18 | 19; 18 | Existing broad preservation-query counts stay unchanged because the canned-salmon parent already matches them. |

## Measurement and substitution evidence

The manufacturer's English and French product pages display `1/2 can drained (55 g)` for their corresponding pink-salmon products. The pages do not provide a shared cross-language SKU identifier, so retain one source-specific published portion observation from English page S01; the French page is not a second product or independent observation. Do not derive a full-can drained mass, can-to-mass conversion, generic half-can amount, drained yield, package yield, cup measure, density, or unit mapping. The French page's 142 g amount is the net amount for that listed SKU, not the observed drained portion or a reusable size.

| Proposed observation ID | Named product and source statement | Record only as |
|---|---|---|
| `canned-salmon-water-form-cloverleaf-pink-salmon-half-can-drained-r793-20261019` | Clover Leaf wild Pacific pink salmon; Nutrition Facts serving `1/2 can drained (55 g)`. The French page repeats this label for the paired product page. | One manufacturer-label `portion_weight` observation: source quantity 0.5 can; observed mass 55 g. Product-specific only; no transferable measure, conversion, or yield. |

The product pages give no culinary substitution ratio, and the bundled corpus supplies no canned-salmon recipe or method context. They do not support replacing water-packed salmon with oil- or broth-packed salmon, the maker's own-juice product, smoked salmon, raw salmon, another salmon species, or another fish. Add no active form conversion, global or contextual substitution finding/rule, warning, recipe-line substitution, yield, or recipe link. If integrated, use `identityState: verified` and `measurementState: researched_no_supported_value` on a new form-level evidence row, retain `substitutionResearchState: not_yet_researched`, and leave its substitution findings empty. Keep the R172 parent ledger record unchanged.

## Bundled recipe demand

The current manifest lists **114 recipe files and 1,123 structured ingredient rows**. I scanned every manifest-listed recipe JSON string and ingredient row for the canned-salmon parent, canned salmon and water-packed wording in both languages, and the proposed labels. There are no canned-salmon/product-form hits and no row linked to `ingredient-ref-canned-salmon`. The only salmon ingredient row is recipe 077, `Salmon Pot Pie`: `675 g salmon fillets without skin, cut into cubes`, linked to `ingredient-ref-salmon-fillets-without-skin`. It is a raw fillet line, not canned salmon, and remains unchanged. The bundle therefore provides no recipe amount, handling instruction, or substitution context for this form; add no recipe link.

## Proposed active-data delta

If accepted, add exactly this one form under the existing canned-salmon parent. The notes constrain the form to explicit water packing and keep the source product's species and presentation out of reusable catalog claims.

```json
{
  "id": "ingredient-form-canned-salmon-in-water",
  "ingredientRefId": "ingredient-ref-canned-salmon",
  "formCode": "canned_in_water",
  "labelFr": "saumon en conserve dans l’eau",
  "labelEn": "canned salmon in water",
  "prepState": "canned_in_water",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Forme de saumon en conserve explicitement emballé dans l’eau. La source actuelle décrit un seul produit de saumon rose du Pacifique; elle n’établit pas d’espèce, de coupe, d’ingrédients, de taille de boîte, d’état égoutté ou de directive d’égouttage communs. Aucune mesure générique, densité, conversion, relation de rendement ou substitution n’est établie.",
  "notesEn": "Canned-salmon form explicitly packed in water. The current source describes one Pacific pink-salmon product; it does not establish a shared species, cut, ingredient list, can size, drained state, or draining instruction. No generic measure, density, conversion, yield relationship, or substitution is established.",
  "updatedAt": "2026-10-19T00:00:00Z"
}
```

No parent alias, new reference, legacy mapping, measurement mapping, package yield, form conversion, substitution rule, or recipe change is proposed. If accepted, add a separate form-level ledger row for the source IDs and source-specific observation above; do not amend or duplicate the existing canned-salmon parent record or its R172 sources.

## Source register

The two manufacturer pages were opened directly on **2026-10-19**. R793 source IDs/URLs below remain proposal-local and were not found in the current ledger or prior focused proposal/batch archive. The Codex source is explicitly reused from the parent record, not reallocated to this proposal's form ledger row.

| Source ID | Primary source and locator | Evidence used and limits |
|---|---|---|
| **WP04-SECTIONP-CANNED-SALMON-WATER-FORM-R793-20261019-S01** | Clover Leaf, [Skinless Boneless Pink Salmon](https://www.cloverleaf.ca/en/products/skinless-boneless-pink-salmon/), product description, ingredients, and Nutrition Facts. | Current Canadian manufacturer page says this wild Pacific pink salmon is packed in water, identifies *Oncorhynchus gorbuscha*, lists water and salt, and gives its own `1/2 can drained (55 g)` serving. The product's species, chunk presentation, ingredients, and serving are SKU-specific; the page is not evidence that all canned salmon is water-packed or that this nutrition serving is reusable. |
| **WP04-SECTIONP-CANNED-SALMON-WATER-FORM-R793-20261019-S02** | Clover Leaf, [Saumon rose émietté – peau et arêtes retirées](https://www.cloverleaf.ca/fr/produits/saumon-rose-emiette-peau-et-aretes-retirees/), product description, ingredients, and Nutrition Facts. | Current French manufacturer page describes a corresponding pink-salmon product in a 142 g can as packed in water; identifies *Oncorhynchus gorbuscha*; and lists salmon, water, and salt. It displays the same `1/2 can drained (55 g)` nutrition text as S01, but the pages do not expose a cross-language SKU ID; treat this as one source-scoped portion observation, not independent measure evidence. |
| **Reused `WP04-SECTIONP-CANNED-SALMON-R172-20261016-S01`** | FAO/WHO Codex Alimentarius, [Standard for Canned Salmon, CXS 3-1981](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B3-1981%252FCXS_003e.pdf), current standard amended 2026, §§2 and 7. | Existing parent-owned source. Defines canned salmon across seven named species; permits water among possible added ingredients; and says packing medium forms part of the food name. It is an international standard, not Canadian law or SKU-specific proof. Do not duplicate its URL or change its owner. |
| **WP04-SECTIONP-CANNED-SALMON-WATER-FORM-R793-20261019-R01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L8393), R172/R790 proposals and batch records, active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest-listed recipe files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Proposal-local audit only. Supports exact-key, source-ID/URL ownership, picker projection, product/form boundaries, and recipe-demand review; it is not a ledger source record. |

## Bounded recommendation

Propose only `ingredient-form-canned-salmon-in-water` under the existing `ingredient-ref-canned-salmon`, with the complete label pair and no extra aliases or match terms. Direct current manufacturer evidence supports one water-packed *O. gorbuscha* product, while Codex defines canned-salmon scope and recognizes water as a packing-medium dimension. The evidence does not assign water packing to all species/products, and the label nutrition portion remains product-specific. Keep species, product presentation, formulation, package amount, drained basis, substitutions, and recipe behavior outside the generic form. Preserve R172 parent source ownership; leave the broader Section P preservation checklist open. No software tests, build, emulator, or deployment were run; this proposal changes no application code or shared database JSON.

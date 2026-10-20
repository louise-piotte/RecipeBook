# WP04 Section P R474 — cooked octopus tentacles form review

- **Review and source-access date:** 2026-10-17.
- **Checklist:** Open WP04 Section P octopus and regional-seafood coverage ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7229)); the broader Section P parent remains open.
- **Candidate:** A retail product of cooked octopus tentacles, listed in English and French by Metro Québec under the same product number.
- **Recommendation:** Add one **catalog form** under the existing `ingredient-ref-octopus`: `cooked octopus tentacles / tentacules de pieuvre cuits`. Keep the existing `PROTEIN` category, generic octopus identity, and separate canned products unchanged. Do not assign a species or infer that the current seller's previously frozen state applies to every product.
- **Proposal-only status:** This is the only proposed file change. No shared reference/form JSON, ledger, generated catalog, recipe, plan, roadmap, workflow, integration record, tests, or application code was changed.
- **Repository snapshot:** Counts and ownership results below are from the live workspace read on 2026-10-17, before any R474 integration.
- **Proposal-local source IDs:** `WP04-SECTIONP-OCTOPUS-TENTACLES-FORM-R474-20261017-S01` through `S03`; audit label `WP04-SECTIONP-OCTOPUS-TENTACLES-FORM-R474-20261017-R01`. Existing OQLF evidence is reused by its registered ID.

## Why this is a new, bounded form decision

The current generic octopus identity is `octopus / pieuvre`, with `poulpe` as its only French alias. The accepted [octopus-in-olive-oil review R181](wp04-section-p-octopus-in-olive-oil-product-boundary-review-r181-20261016.md) explicitly did not add a cooked, sliced, or tentacle form to generic octopus because its evidence was a canned oil-packed product. The later [Galician-sauce identity R233](wp04-section-p-octopus-galician-sauce-product-boundary-review-r233-20261016.md) also concerns a multi-ingredient preserved product. Neither review allocates the plain cooked-tentacle item considered here.

New evidence identifies a Québec retail SKU, product number **244396**, with paired English and French pages: “Previously Frozen Cooked Octopus Tentacules” / “Tentacules de pieuvre cuits décongelés.” OQLF separately records `tentacule / tentacle` as the name of a marketable anatomical part and names octopus and squid among its principal species. Together, these sources support the cut and cooked state as a searchable form of the existing octopus ingredient. They do not support a new species, a generic prepared-food identity, or equivalence with the canned octopus products.

This packet revisits R181's explicit exclusion only because that earlier review covered a different, oil-packed product and the current Metro listing now supplies a direct bilingual cooked-tentacle SKU. The recommendation is limited to an octopus form; it does not change the R181 or R233 product identities.

## Proposed catalog delta

Add only this form under `ingredient-ref-octopus`:

```json
{
  "id": "ingredient-form-octopus-cooked-tentacles",
  "ingredientRefId": "ingredient-ref-octopus",
  "formCode": "cooked_tentacles",
  "labelEn": "cooked octopus tentacles",
  "labelFr": "tentacules de pieuvre cuits",
  "prepState": "cooked",
  "matchTermsEn": ["previously frozen cooked octopus tentacles"],
  "matchTermsFr": ["tentacules de pieuvre cuits décongelés"],
  "densityGPerMl": null,
  "notesEn": "A cooked-tentacle form supported by Metro Québec product 244396. Previously frozen/thawed describes that seller's SKU only. No species, household measure, conversion, yield, or substitution is established.",
  "notesFr": "Forme de tentacules de pieuvre cuits appuyée par le produit Metro Québec 244396. La congélation antérieure et la décongélation décrivent uniquement ce produit. Aucune espèce, mesure ménagère, conversion, relation de rendement ou substitution n’est établie.",
  "updatedAt": "2026-10-17T00:00:00Z"
}
```

Keep the form on generic octopus rather than creating an ingredient reference: the documented difference is the same cephalopod cut, cooked and sold without a sauce named in the product title. The Metro page's indexed content does not expose its ingredient panel, so do not infer a universal single-ingredient formula. Do not add `tentacles` / `tentacules` as free aliases; retain the octopus-qualified display and product-title match terms above.

At integration, attach the three new source entries to the existing `ingredient-ref-octopus` research-ledger record. The current record's `measurementState` and `substitutionResearchState` are both `not_yet_researched`; keep both unchanged. This review did not establish a reusable measure or a recipe-scoped replacement study. No reference row, legacy mapping, recipe link, package-yield row, active measure, density, unit mapping, conversion, or substitution rule is proposed. A scoped search of the live package-yield and global/contextual substitution-rule files found no octopus-specific entries.

## Ownership, source allocation, and recipe audit

The snapshot contains **1,753 ingredient references**, **141 forms**, **56 legacy candidates**, and **2,112 research-ledger records** with **9,624 source entries**. No exact active reference, form, or legacy candidate owns `cooked octopus tentacles`, `tentacules de pieuvre cuits`, or the two retailer-title variants. The existing generic owner remains `ingredient-ref-octopus`; the only adjacent active octopus product owners are `ingredient-ref-octopus-in-olive-oil` and `ingredient-ref-octopus-in-galician-sauce`. The generic octopus record has no attached forms, active measure, density, or unit mapping. No proposed form ID, source-ID prefix, or Metro product URL has an exact owner in the current ledger or focused proposal/batch archive. [R01]

Reuse OQLF's existing `WP04-OCTOPUS-IDENTITY-20261012-S02` source ID for the generic `pieuvre / octopus` term if cited at integration. OQLF's `tentacule / tentacle` URL and the two Metro product URLs are new to the ledger/archive and receive the R474-local IDs above. Do not duplicate the existing generic-term source under a new ID.

The static picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including its word-phrase matching and exact-form hint behavior:

| Query | Current result | With the proposed form |
|---|---|---|
| `cooked octopus tentacles`; `previously frozen cooked octopus tentacles` | None | `octopus / pieuvre`, with the cooked-tentacles form hint for the exact form phrases |
| `tentacules de pieuvre cuits`; `tentacules de pieuvre cuits décongelés` | None | `octopus / pieuvre`, with the cooked-tentacles form hint for the exact form phrases |
| `octopus` | Generic octopus; octopus in Galician sauce; octopus in olive oil | Same three references; no extra identity result |
| `pieuvre` | Generic octopus | Same generic reference |
| `poulpe` | Generic octopus; octopus in Galician sauce; octopus in olive oil | Same three references |
| `tentacles`; `tentacules` | None | Generic octopus, because those words occur in the qualified form label |

The last row is a real broad-query effect: OQLF notes that commercially marketed tentacles principally concern both octopus and squid. The proposal adds no unqualified alias, but the form label itself makes `tentacles` / `tentacules` searchable under current picker behavior. The exact octopus-qualified phrases remain clear, and the result is the existing generic reference with a form hint rather than a new standalone octopus identity.

A manifest-ordered scan parsed all **114 recipe files and 1,123 ingredient rows**, checking full recipe JSON and ingredient-row fields for octopus/pieuvre/poulpe, the proposed bilingual labels, tentacle wording, and the Metro product descriptors. It found **zero matching recipe files and zero matching ingredient rows**. The ordered-corpus digest is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` (**753,988 recipe-file bytes**). No recipe link, recipe amount, cooking method, or contextual substitution can be inferred from the bundled library. [R01]

## Measurements, forms, and substitutions

- **Form:** Add only `cooked_tentacles` under generic octopus. The Metro item is described as cooked, previously frozen, and thawed. Preserve the freezer/thaw wording as a SKU-specific match phrase and note; do not make it part of a general octopus storage rule or imply raw-to-cooked conversion.
- **Package amount:** Metro says the tray contains **150 g on average**. This applies to that seller's product listing only. It is not a portion recommendation, piece count, household measure, edible yield, cooking yield, or transferable package mapping; add no measurement observation, unit mapping, or package-yield row.
- **Other numeric behavior:** Keep `defaultDensity`, form density, and unit mappings empty/null. No source supports a mass-volume relationship, count-to-mass mapping, or comparison with raw, dried, oil-packed, or sauced octopus.
- **Substitutions:** No recipe in the bundle provides a dish role or replacement context. Add no form-to-form or ingredient-to-ingredient rule between this form and raw octopus, octopus in oil or sauce, dried octopus, calamari, cuttlefish, or another seafood. Leave substitution research `not_yet_researched`.

## Source register and limits

Sources were accessed on **2026-10-17**. The two Metro pages identify the same retailer SKU, not two independent products. Both show the SKU as out of stock when checked; this confirms the listed Québec product and its bilingual naming, not current availability. Metro returned HTTP 403 to direct page opening in the research tool, so the product title, product number, tray amount, and out-of-stock state were checked in the current indexed page content. The retailer page does not expose a readable ingredient panel in that content.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-OCTOPUS-TENTACLES-FORM-R474-20261017-S01** | Office québécois de la langue française, [tentacule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199040/tentacule), updated 1998. Prefers `tentacule`, gives English `tentacle`, and identifies it as a marketable anatomical part, principally for octopus and squid. | Terminology/cut-part evidence only; it does not specify a cooked product or endorse one species for an unqualified tentacle query. |
| **WP04-SECTIONP-OCTOPUS-TENTACLES-FORM-R474-20261017-S02** | Metro, [Previously Frozen Cooked Octopus Tentacules, product 244396](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/previously-frozen-cooked-octopus-tentacules/p/244396). The current indexed page labels the item cooked and previously frozen, says an average tray contains 150 g, and shows the SKU out of stock. | One retailer SKU and product title; no species or readable ingredient panel. The tray mass is not a recipe measure or yield. Direct page opening returned HTTP 403 in the research tool. |
| **WP04-SECTIONP-OCTOPUS-TENTACLES-FORM-R474-20261017-S03** | Metro Québec, [Tentacules de pieuvre cuits décongelés, product 244396](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/tentacules-de-pieuvre-cuits-decongeles/p/244396). Same product number and average 150 g tray wording in the French listing. | Paired retailer page for S02 rather than independent product evidence; also showed out of stock and returned HTTP 403 to direct page opening. Does not establish broad availability or a reusable quantity. |
| **Reused `WP04-OCTOPUS-IDENTITY-20261012-S02`** | OQLF, [pieuvre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402783/pieuvre). Supports Québec French `pieuvre` and English `octopus` for the generic food-mollusc identity. | Generic name evidence; it does not name cooked tentacles. Reuse the ledger source ID and URL. |
| **WP04-SECTIONP-OCTOPUS-TENTACLES-FORM-R474-20261017-R01** | Read-only audit of current references/forms, legacy candidates, ledger/source ownership, the R181/R233 octopus decisions, picker projection, manifest, and all 114 recipes. | Repository-snapshot audit only; no shared data or software tests changed. |

## Disposition

**Recommend adding** the single cooked-tentacles form beneath `ingredient-ref-octopus`. Its bilingual phrase pair is supported by a current Québec retailer's same-SKU English/French pages and OQLF terminology for the marketable cut; the evidence is narrow, so the form carries no species, product-wide thawing, numeric conversion, yield, recipe, or substitution claim. The unqualified `tentacles` search effect is documented for root review. No shared catalog, ledger, plan, roadmap, generated file, recipe, application code, or test was changed in this proposal-only review.

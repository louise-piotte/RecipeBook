# WP04 Section P R754 — fresh-whole Atlantic halibut form review — 2026-10-18

- **Review date:** 2026-10-18.
- **Status:** Integrated 2026-10-18; one `fresh_whole` form and its form-level ledger record were added.
- **Checklist fit:** The open Section P finfish parent still names halibut in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6888). The latest [R749–R751 workflow checkpoint](../ingredient-catalog-workflow.md#L3075) records a whole-Walleye form; the [roadmap checkpoint](../../../roadmap.md#L1496) keeps Sections A6, F, and P open. R754 reviews a distinct product presentation under the already allocated Atlantic-halibut identity. It does not repeat R751’s Walleye work or reopen Atlantic-halibut steak/cheek decisions.
- **Candidate:** One `fresh_whole` form under `ingredient-ref-atlantic-halibut` (*Hippoglossus hippoglossus*).
- **Recommendation:** **Integrate** `fresh whole Atlantic halibut / flétan de l’Atlantique frais entier` as a species-qualified form with no match terms. Pêcherie Manicouagan’s current bilingual product pages explicitly list the Atlantic-halibut product as whole and fresh or frozen. The supplier’s format is shown without the head; retain that as supplier-specific context, not a generalized preparation state. The pages establish the supplier’s offered format, not a live inventory or Québec retail stock claim.

## Current catalog, ledger, and ownership

Before R754 integration, the active reference `ingredient-ref-atlantic-halibut` was displayed as **Atlantic halibut / flétan de l’Atlantique**, with French alias `flétan`; it had the species-qualified `ingredient-form-atlantic-halibut-steak` (`steak_cut`) and no whole-fish form. The research ledger already owned the Atlantic-halibut identity source `WP04-FINFISH-ID-20261009-S04` (OQLF); reuse it for the bilingual species/name pairing rather than duplicating the record. Earlier [R545 steak](wp04-section-p-atlantic-halibut-steak-form-review-r545-20261017.md) and [R551 cheeks](wp04-section-p-next-gap-review-r551-20261017.md) reviews concern different cuts and do not decide this whole-fish presentation.

Snapshot at proposal time after R751: **1,848 ingredient references / 180 forms**, **2,237 ledger records / 10,503 source entries**, and **114 recipes / 1,123 ingredient rows**. At proposal drafting, the proposed form ID `ingredient-form-atlantic-halibut-fresh-whole`, source IDs `WP04-SECTIONP-ATLANTIC-HALIBUT-FRESH-WHOLE-R754-20261018-S01` and `S02`, and both supplier URLs below had no exact owner in the live catalog, ledger, proposal archive, or batch archive. Integration now allocates the new form ID and source IDs to the form-level ledger record. The existing OQLF source ID remains owned by the Atlantic-halibut identity and is reused.

## Evidence and scope

| Source / proposed owner | Supports | Limits and use |
|---|---|---|
| **Proposed source ID** `WP04-SECTIONP-ATLANTIC-HALIBUT-FRESH-WHOLE-R754-20261018-S01` — Pêcherie Manicouagan, [Atlantic halibut](https://purmer.ca/en/our-products/atlantic-halibut), accessed 2026-10-18. At proposal drafting, the URL and ID were unowned in the ledger and archive. | The current supplier page names Atlantic halibut and says its offered format is “Whole; fresh or frozen (without the head).” This directly supports a fresh-plus-whole product format for the named fish. | This is a supplier format page, not a dated inventory feed or a named retail SKU. It notes an April–September fishing season; accessed on 2026-10-18, the page does not establish that fresh product is in stock. It also does not establish a particular outlet or Québec consumer delivery. The whole format is without the head, but the page does not specify gutting, scaling, skin, or bones. Its per-fish size bands are commercial product grades, not recipe portions or reusable measures. |
| **Proposed source ID** `WP04-SECTIONP-ATLANTIC-HALIBUT-FRESH-WHOLE-R754-20261018-S02` — Pêcherie Manicouagan, [Flétan de l’Atlantique](https://pecheriemanicouagan.com/fr/nos-produits/fletan-de-l-atlantique), accessed 2026-10-18. At proposal drafting, the URL and ID were unowned in the ledger and archive. | The French page names `flétan de l’Atlantique` and lists “Entier, frais ou surgelé (sans la tête),” the paired supplier-format evidence for the same product. | This is the same supplier and product page in French, not an independent second supplier. It does not establish current stock or a general market standard. The “sans la tête” qualifier stays supplier-specific. |
| **Reused source ID** `WP04-FINFISH-ID-20261009-S04` — OQLF, [flétan de l’Atlantique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198639/fletan-de-latlantique), already owned by `ingredient-ref-atlantic-halibut`. | Pairs the Québec-normalized name `flétan de l’Atlantique`, English `Atlantic halibut`, and *Hippoglossus hippoglossus*. Reuse only for the existing identity and display-name boundary. | Terminology and taxon evidence, not evidence of whole/fresh product format. Do not create a duplicate OQLF ledger source. |

The proposed English and French form labels compose the existing species-qualified identity with the supplier’s fresh/whole state. They are catalog display labels, not claimed verbatim product titles. French `frais entier` agrees with masculine `flétan`. The supplier’s “without the head / sans la tête” presentation is not generalized to all Atlantic halibut forms.

## Integrated catalog and ledger delta

Add one form to `ingredient-forms.v1.json` under the existing Atlantic-halibut reference:

```json
{
  "id": "ingredient-form-atlantic-halibut-fresh-whole",
  "ingredientRefId": "ingredient-ref-atlantic-halibut",
  "formCode": "fresh_whole",
  "labelFr": "flétan de l’Atlantique frais entier",
  "labelEn": "fresh whole Atlantic halibut",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Présentation de flétan de l’Atlantique entier frais offerte par Pêcherie Manicouagan. La page du fournisseur précise que son format entier est sans la tête; ne pas généraliser cet état à tous les produits. Elle ne précise pas si le poisson est vidé, écaillé, avec peau ou avec arêtes. Aucune mesure, densité, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Fresh whole Atlantic-halibut presentation offered by Pêcherie Manicouagan. The supplier page says its whole format is without the head; do not generalize that state to all products. It does not state whether the fish is gutted, scaled, skin-on, or bone-in. No measure, density, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Integration added one `ingredient_form` ledger record owned by `ingredient-form-atlantic-halibut-fresh-whole`, with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It includes sources S01 and S02 plus the reused identity source ID above. Do not create an identity, alias, broad form match term, numeric observation, unit mapping, density, conversion, recipe link, yield, or substitution. Keep the source’s per-fish weight bands and headless qualifier in source context only.

## Picker projection

The projection follows the current [phrase-first, substring-fallback matcher](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), with accent folding. A full query matching a complete form label also supplies its form hint. Counts below compare current data with the one proposed form and no new match terms.

| Query | Current | With form | Effect |
|---|---:|---:|---|
| `fresh whole Atlantic halibut` | 0 | 1 | The exact English form label selects the existing Atlantic-halibut reference and supplies the form hint. |
| `flétan de l’Atlantique frais entier` | 0 | 1 | The accent-folded exact French label selects the same reference and supplies the form hint. |
| `whole Atlantic halibut` | 0 | 1 | Phrase matching reaches the same reference, but this shorter query is not an exact full-label form hint. |
| `frais entier`; `fresh whole` | 4; 6 | 5; 7 | Each broad state phrase gains Atlantic halibut and remains multi-result. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Both remain with the existing Whole tilapia result; the proposed label adds neither generic phrase. |
| `halibut`; `flétan` | 4; 4 | 4; 4 | Existing broad species-name results are unchanged. |
| `fish`; `poisson` | 18; 13 | 18; 13 | General fish queries are unchanged. |
| `fresh`; `frais`; `whole`; `entier` | 37; 29; 43; 22 | 38; 30; 44; 23 | Broad state queries gain one result each and remain multi-result. |
| `whole halibut`; `flétan entier` | 0; 0 | 0; 0 | No less-qualified phrase is assigned to Atlantic halibut; no broad match terms are added. |

The full bilingual form stays searchable while generic whole-fish and halibut searches retain their current scope.

## Recipe corpus, amounts, and substitutions

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**, including row text, ingredient names, reference IDs, and form IDs. Candidate phrases `Atlantic halibut`, `flétan de l’Atlantique`, *Hippoglossus hippoglossus*, both proposed labels, `whole halibut`, and `flétan entier` produced **zero matching recipe files and zero ingredient rows**. There is no linked recipe or recipe-backed amount, cooking method, or role for this form.

The supplier’s per-fish pound bands describe its commercial size grades. They are not recipe portions, package yields, edible yields, or a basis for volume conversion. No density, measure, yield relationship, or substitution is supported here. Do not infer equivalence with Atlantic-halibut steaks, Atlantic/Pacific/Greenland halibut cuts, cod, or generic white fish.

## Static review checks

- Re-read the current `AGENTS.md`, the open Section P plan parent, roadmap checkpoint, and the R749–R751 workflow checkpoint. R754 is separate from R751’s whole-Walleye form and the existing Atlantic-halibut steak form.
- Inspected current Atlantic-halibut references/forms, the parent and steak ledger owners, exact ID/URL ownership, proposal/batch archive, and picker implementation. At proposal time, the proposed form ID, S01/S02 source IDs, and English/French supplier URLs were unowned; OQLF S04 was already owned by the parent identity.
- Opened the current supplier pages in English and French and the OQLF identity entry. The paired supplier pages explicitly state the whole/fresh combination and headless limitation; OQLF supports only the identity/name mapping.
- Completed the current-picker projection and the 114-file / 1,123-row corpus scan above. Confirmed proposal-local relative links resolve, Markdown is UTF-8 without BOM, and the new-file whitespace check is clean.
- During proposal review, no catalog JSON or application code was changed. Integration added only database JSON; no software tests, build, emulator, or deployment were run under the current `AGENTS.md` rule.

The integrated outcome adds one fresh-whole product form under the existing Atlantic-halibut identity. The broader Section P finfish and regional-fish parent remains open.


## Integration result

The proposed form and form-level ledger record were added as scoped above. The supplier’s headless presentation remains supplier-specific, and OQLF source `WP04-FINFISH-ID-20261009-S04` is reused without changing its existing identity record. See the [R752–R754 integration README](../batches/wp02-wp03-wp04-r752-r754-gap-review-integration-20261018/README.md).

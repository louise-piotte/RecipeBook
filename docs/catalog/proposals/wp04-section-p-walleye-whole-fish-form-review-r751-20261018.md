# WP04 Section P R751 — whole Walleye form review

- **Review date:** 2026-10-18.
- **Status:** Integrated in the [R749–R751 batch record](../batches/wp02-wp03-wp04-r749-r751-gap-review-integration-20261018/README.md).
- **Checklist fit:** The Section P finfish and regional-fish parent remains open at the [active plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6858). The current [R746–R748 checkpoint](../ingredient-catalog-workflow.md#L3066) added a fresh-whole form to Northern pike; this review selects a distinct whole-fish product under the existing Walleye identity.
- **Candidate:** One `whole_fish` form under `ingredient-ref-walleye` for *Sander vitreus*.
- **Recommendation:** Add **whole walleye / doré jaune entier** as a whole-fish presentation form. A current Daily Seafood product page lists “Pickerel - Lake Erie Jumbo Whole” and states that pickerel is also known as Walleye. The item is offered as a specific cleaned-and-scaled product; the source does not say whether it is fresh or frozen. Keep temperature state, product cleaning details, weight, and availability out of the reusable form.

## Current state and candidate ownership

The accepted reference is `ingredient-ref-walleye`, displayed as **walleye / doré jaune**, category `PROTEIN`, with no aliases, density, unit mappings, or attached forms. Its identity ledger record is verified and already owns `WP04-FRESHWATER-FINFISH-20261010-S01` (OQLF) and `WP04-FRESHWATER-FINFISH-20261010-S02` (Gouvernement du Québec), plus a CFIA pollock query source that distinguishes Walleye Pollock. The current catalog has **1,848 references and 179 forms**; the ledger has **2,236 records, 10,496 source entries, 8,858 distinct source IDs, and 7,505 distinct URLs**.

The proposed form ID `ingredient-form-walleye-whole-fish` and source ID `WP04-SECTIONP-WALLEYE-WHOLE-FORM-R751-20261018-S01` are unallocated in the current catalog, ledger, and archive. No exact Daily Seafood product URL owner was found in the live ledger or proposal/batch archive. The walleye identity itself is already owned; R751 proposes no new identity or alias.

## Evidence and ownership

| Source / owner | Supports | Limits and R751 use |
|---|---|---|
| **Proposed source ID** `WP04-SECTIONP-WALLEYE-WHOLE-FORM-R751-20261018-S01` — Daily Seafood, [Pickerel - Lake Erie Jumbo Whole (3–5 lb)](https://shop.dailyseafood.ca/products/60ecbc35230b9f003248acee/pickerel-lake-erie-jumbo-whole-3-5-lbs), accessed 2026-10-18. No exact URL or ID owner was found in the current ledger or archive. | The current retailer page title names a whole Pickerel product; its description explicitly says “Pickerel, also known as, Walleye.” The listing shows an add-to-cart control and identifies Lake Erie, Ontario as the origin. It directly supports a whole-fish Walleye product presentation for this supplier. | The page gives no binomial and no fresh/frozen state. It describes this specific product as cleaned and scaled; those states are not generalized to the form. Its `3–5 lbs`, selected `5 lb`, and variable checkout-weight wording are SKU details, not a standard measure, serving, or yield. The listing does not establish Québec stock or delivery. |
| Existing source `WP04-FRESHWATER-FINFISH-20261010-S01` — OQLF GDT, [doré jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198870/dore-jaune), owned by `ingredient-ref-walleye`. | OQLF’s edible-fish entry normalizes `doré jaune` and pairs it with English `walleye`; it lists `pickerel` among English terms used in that context. Reuse this identity source. | Terminology evidence only; it does not establish the retailer’s whole-fish product. Do not copy its older scientific-name synonym into the form record or create another source entry. |
| Existing source `WP04-FRESHWATER-FINFISH-20261010-S02` — Gouvernement du Québec, [Doré jaune](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/dore-jaune), owned by `ingredient-ref-walleye`. | The current Québec species page pairs `Doré jaune / Walleye` with *Sander vitreus*. Reuse it for current taxon identity and French display context. | Biological profile, not retail-form evidence or a kitchen measure. Do not duplicate its source object. |

The English display uses the active species-qualified name `walleye`, not the retailer’s unqualified `pickerel` product title. The French display composes the existing OQLF-preferred identity with masculine `entier`. The retailer does not print a French title, so `doré jaune entier` is not attributed to that listing. Keep `pickerel`, `whole pickerel`, and broad `whole fish / poisson entier` out of new aliases and match terms.

## Integrated delta

Added one `whole_fish` form under `ingredient-ref-walleye` and one form-level research record owned by the form ID. The record reuses the two existing identity source IDs and adds one R751 product source. No match terms were added.

```json
{
  "id": "ingredient-form-walleye-whole-fish",
  "ingredientRefId": "ingredient-ref-walleye",
  "formCode": "whole_fish",
  "labelFr": "doré jaune entier",
  "labelEn": "whole walleye",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Présentation entière de doré jaune offerte dans un produit précis d’un détaillant ontarien. La page décrit cet article comme nettoyé et écaillé, mais ne précise pas s’il est frais ou surgelé; ces attributs ne sont pas généralisés à la forme. Aucune mesure, densité, conversion, relation de rendement ou substitution n’est établie.",
  "notesEn": "Whole-walleye presentation listed in one specific Ontario retailer product. That item is described as cleaned and scaled, but its fresh or frozen state is unstated; those attributes are not generalized to the form. No measure, density, conversion, yield relationship, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

The seller’s `3–5 lb` title range and `5 lb` cart selection are source-specific product weight details. Do not copy them as a serving, kitchen measure, package yield, edible yield, or cooking yield. No bundled recipe uses Walleye, and no reviewed source establishes a form conversion or directed substitution to another fish. Add no amount, measurement observation, density, mapping, conversion, yield, recipe link, or substitution.

## Picker projection

The projection follows the current [phrase-first, substring-fallback matcher](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including accent folding and form hints only for an exact full form label. With only the proposed bilingual labels:

| Query | Current results | With form | Effect |
|---|---:|---:|---|
| `whole walleye` | 0 | 1 | Exact English label selects Walleye and supplies the whole-fish form hint. |
| `doré jaune entier` | 0 | 1 | Exact French label selects the same parent and supplies the form hint. |
| `walleye`; `doré jaune` | 1; 1 | 1; 1 | Current identity results are unchanged. |
| `pickerel`; `whole pickerel` | 0; 0 | 0; 0 | Do not turn the retailer’s product wording into a global alias. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish searches continue to return Whole tilapia only. |
| `whole`; `entier` | 47; 21 | 48; 22 | Each broad state query gains Walleye and remains multi-result. |
| `fresh whole`; `frais entier` | 6; 4 | 6; 4 | The form does not claim a temperature state. |
| `fish`; `poisson` | 18; 14 | 18; 14 | General fish queries are unchanged. |

The full English and French product phrases become selectable without changing the Walleye identity result, generic whole-fish result, or ambiguous `pickerel` search.

## Recipe corpus and numeric evidence

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**, checking full recipe JSON and the ingredient names, original text, reference IDs, and form IDs. Candidate phrases `walleye`, `doré jaune`, *Sander vitreus*, `whole walleye`, `whole pickerel`, and `doré jaune entier` produced **zero matching recipe files and zero ingredient rows**. The bundle provides no Walleye quantity, recipe method, role, or line link to support numeric or substitution behavior.

## Static review and scope

- Re-read the current `AGENTS.md`, the open Section P finfish parent, the current roadmap entry, and R746–R748 plan/workflow/integration checkpoints. The latest checkpoint integrates Northern pike’s fresh-whole form; this proposal targets the separate existing Walleye identity and does not add a fresh/frozen state.
- Inspected current Walleye reference/forms, ledger row and source owners, legacy candidates, proposal/batch archive, and current picker code. Verified the proposed form ID, R751 source ID, and retailer URL are unallocated.
- Opened the current Daily Seafood product page, OQLF GDT entry, and current Québec species profile. The supplier names the product Walleye in its own description; OQLF and Québec sources support the bilingual species identity. The page does not state fresh/frozen, a binomial, or Québec availability.
- Completed the 114-file / 1,123-row corpus scan and picker projection above. Confirmed all local relative links resolve, the Markdown is UTF-8 without BOM, and the new-file whitespace check is clean.
- No software tests, build, emulator, or deployment were run because the only shared catalog change adds database JSON data under `AGENTS.md`; no application code changed.

This review covers only a whole-fish presentation under the existing Walleye identity. The broader Section P finfish and regional-fish checklist remains open.

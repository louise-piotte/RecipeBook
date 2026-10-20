# WP03 Section L R636 — Scotch Bonnet fresh-market form review

- **Status:** Accepted and integrated. See the [R636 integration README](../batches/wp03-section-l-scotch-bonnet-fresh-integration-r636-20261018/README.md).
- **Disposition:** Keep the already verified `ingredient-ref-scotch-bonnet-pepper` and add one `fresh` form under that reference. Add no aliases and create no second identity.
- **Scope:** This form represents fresh-market Scotch Bonnet pepper. The separate pepper-sauce identity remains separate; no sauce, green, curry, dried, pickled, or canned form is proposed.
- **Limits:** Do not generalize species, cultivar, color, growing origin, grade, size, or heat. Add no density, unit mapping, package yield, measurement, conversion, substitution, or recipe link.
- **Testing:** No software tests, builds, or emulator checks were needed; the change only adds database JSON data, as allowed by `AGENTS.md`.

## Why this is the next distinct Section L gap

The parent **Bell peppers and fresh chiles** item remains open in [WP03 Section L](../../RecipeBook-global-ingredient-catalog-plan.txt#L6135). R629 integrated the jalapeño fresh form and R632 integrated the Serrano fresh form. The other named entries have focused additions or documented holds. Scotch Bonnet is separately named in the plan and has an active, verified pepper identity, but it had no fresh form before R636. The [WP06 Caribbean identity integration](../batches/wp06-caribbean-identities-integration-20261011/README.md) explicitly added no product forms; the later [WP05 Scotch Bonnet sauce review](wp05-scotch-bonnet-hot-sauce-quebec-boundary-review-20261011.md) keeps fresh Scotch Bonnet pepper outside the sauce identity and also added no forms. Neither is a fresh-form review.

This review adds only the missing state form to the existing pepper identity. It does not reopen that identity’s names or boundaries. Before R636 integration, the package had **1,828 active references and 158 forms**; R636 adds one form.

## Active ownership and archive audit

| Surface | Current finding | R636 proposal |
|---|---|---|
| Pepper reference | `ingredient-ref-scotch-bonnet-pepper` is `piment Scotch Bonnet / Scotch Bonnet pepper`, category `VEGETABLE_AND_AROMATIC`, with no aliases, null default density, and no unit mappings. Its identity is already verified in the research ledger. | Keep the reference, display names, category, aliases, and numeric fields unchanged. |
| Sauce reference | `ingredient-ref-scotch-bonnet-pepper-sauce` is the separate `sauce au piment fort Scotch Bonnet / Scotch Bonnet pepper sauce` row. Its existing English aliases are product-sauce terms only. | Do not add pepper or fresh-form phrases to the sauce row, and do not add sauce phrases to the pepper. |
| Forms and IDs | Before R636, no form was attached to the pepper reference. `ingredient-form-scotch-bonnet-pepper-fresh` is now its sole form, with no match terms. | Keep only this form, with no match terms. |
| Research ledger | The existing pepper record remains `identityState: verified`, with measurement and substitution research both `not_yet_researched`. It records the OQLF term evidence (`WP06-CAR-TERMS-20261011-S01`), Jamaica Ministry fresh-produce standard (`WP06-CAR-EN-GAP-20261011-S25`), and the R636 CFIA source and accepted fresh-form decision. | Keep the existing identity and research states; add no separate form record, measurement observation, or substitution finding. |
| Aliases | The OQLF-attested bilingual names are already the reference’s canonical displays. `piment antillais` is unresolved against Habanero in the [R137 review](wp03-section-l-habanero-pepper-identity-review-r137-20261015.md). | Add no aliases, including `piment antillais`, `goat pepper`, `pimento`, color terms, or sauce terms. |
| Source IDs | The R636 source ID was unowned before integration and is now attached to the existing Scotch Bonnet pepper ledger record. The CFIA report URL is reused in other pepper reviews, including R632, with separate source IDs and row-specific locators. | Keep the new ID only for the Scotch Bonnet-specific CFIA locator; do not repurpose another pepper’s source record. |

The archive check covered the integrated [R632 Serrano form](wp03-section-l-next-fresh-chile-gap-review-r632-20261018.md), R629 jalapeño work, the [WP06 Caribbean identities](../batches/wp06-caribbean-identities-integration-20261011/README.md), and the [WP05 Scotch Bonnet sauce decision](wp05-scotch-bonnet-hot-sauce-quebec-boundary-review-20261011.md). R632 is a separate ingredient. WP06 already establishes the Scotch Bonnet pepper identity; R636 only fills the missing fresh-form representation.

## Evidence and bounded state

OQLF’s GDT entry gives the preferred French term `piment Scotch Bonnet` and the English term `Scotch Bonnet pepper`. This is already recorded in the pepper identity’s ledger under `WP06-CAR-TERMS-20261011-S01`; it supports the current canonical names, so no alias or display change is needed. The entry describes a pepper but is not the fresh-market state evidence. [Existing source]

Jamaica’s Ministry of Agriculture Produce Grading Manual explicitly scopes its Scotch Bonnet specification to **fresh Scotch Bonnet pepper** and describes minimum requirements for the fresh produce. This primary produce standard is already recorded under `WP06-CAR-EN-GAP-20261011-S25`. Its grade, dimensions, and growing claims are not transferred into this catalog form. [Existing source]

The CFIA’s 2026 final report is a current Canadian retail study of whole fresh hot peppers. It includes Québec City and Montréal among the sampling locations; Table 5 separately lists `Piment Scotch Bonnet` with 32 samples. This confirms a fresh-market Scotch Bonnet product class in Canadian retail, without establishing a cultivar, a general pepper weight, or fixed color or heat. [S01]

Together, the existing bilingual terminology and fresh-produce standard plus the current CFIA retail classification support a narrowly named fresh form. Keep green and curry sauces, dried whole or powdered peppers, and preserved products outside it. No inference is made from product sauce listings to fresh-pepper aliases.

## Recipe demand

Every manifest-listed recipe was scanned: **114 recipe files and 1,123 ingredient rows**. The full-file and ingredient-row scans returned **zero** mentions of `Scotch Bonnet` or `piment antillais`. Add no recipe link, recipe-scoped finding, or substitution. This is a checklist gap with sufficient fresh-market evidence, not a response to bundled recipe demand.

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized terms, phrase-first matching, attached form labels included in reference search, and form hints available only for an exact full label. No aliases change.

| Query | Before R636 | Integrated | Effect |
|---|---:|---:|---|
| `Scotch Bonnet` | 2 | 2 | Continues to return the pepper and separate sauce. |
| `Scotch Bonnet pepper` | 2 | 2 | Continues to return the pepper and sauce because the sauce display contains this phrase. |
| `piment Scotch Bonnet` | 1 | 1 | Existing precise French pepper name is unchanged. |
| `Scotch Bonnet pepper sauce` | 1 | 1 | Remains the sauce result. |
| `fresh Scotch Bonnet pepper` | 0 | 1 | New English fresh-form phrase returns the pepper reference. |
| `piment Scotch Bonnet frais` | 0 | 1 | New French fresh-form phrase returns the pepper reference. |
| `green Scotch Bonnet pepper` | 0 | 0 | No green-product alias or form is added. |
| `pepper` / `piment` | 35 / 28 | 35 / 28 | Existing broad results do not change because the pepper already owns both base terms. |
| `fresh` / `frais` | 26 / 21 | 27 / 22 | Broad state-term results gain the one fresh-form owner and remain multi-result. |

## Integrated JSON delta

This is the single object added to `ingredient-forms.v1.json`. Both reference rows, all alias arrays, and the sauce identity are unchanged.

```json
{
  "id": "ingredient-form-scotch-bonnet-pepper-fresh",
  "ingredientRefId": "ingredient-ref-scotch-bonnet-pepper",
  "formCode": "fresh",
  "labelFr": "piment Scotch Bonnet frais",
  "labelEn": "fresh Scotch Bonnet pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Les sources appuient la pr\u00e9sentation fra\u00eeche; aucune mesure g\u00e9n\u00e9rale ou densit\u00e9 n'est \u00e9tablie.",
  "notesEn": "Sources support the fresh-market form; no general measure or density is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

R636 S01 and one `accepted` decision for this fresh form were added to the existing `ingredient-ref-scotch-bonnet-pepper` ledger record. The OQLF and Jamaica Ministry source IDs noted above remain attached. `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched` are unchanged; no separate form ledger record, measurement observation, or substitution finding was added.

## Source register

`WP03-L-SCOTCH-BONNET-20261018-R636-S01` is now recorded on the existing Scotch Bonnet pepper ledger row.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-L-SCOTCH-BONNET-20261018-R636-S01` | Canadian Food Inspection Agency, [2026 final report: whole fresh hot peppers sold at retail in Canada](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), accessed 2026-10-18; pp. 3–4 and Table 5, p. 8. | The study concerns whole fresh retail hot peppers, includes Québec and Montréal collection cities, and lists `Piment Scotch Bonnet` with 32 samples. It supports a fresh-market form but not species, cultivar, grade, general amount, color, or fixed heat. `sourceKind: other`. |

Existing sources reused without duplicate records:

- `WP06-CAR-TERMS-20261011-S01` — OQLF GDT, [piment Scotch Bonnet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037054/piment-scotch-bonnet); preferred French/English term pair.
- `WP06-CAR-EN-GAP-20261011-S25` — Jamaica Ministry of Agriculture, [Produce Grading Manual](https://tradeportal.moa.gov.jm/static/files/Produce-Grading-Manual.pdf); fresh Scotch Bonnet pepper produce specification. Its species and grade details are not added to this proposal’s catalog data.

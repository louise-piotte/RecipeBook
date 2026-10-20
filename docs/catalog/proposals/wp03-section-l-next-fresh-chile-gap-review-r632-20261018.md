# WP03 Section L R632 — Serrano fresh-market form and picker-boundary review

- **Status:** Accepted and integrated on 2026-10-18. See the [R632 integration README](../batches/wp03-section-l-serrano-fresh-integration-r632-20261018/README.md).
- **Disposition:** Keep the active `ingredient-ref-serrano-pepper`; add one fresh-market form and the source-attested English plural alias `serrano peppers`. Leave French aliases empty. Do not create another Serrano identity.
- **Scope:** The fresh form represents a whole fresh-market Serrano pepper. It does not cover dried, smoked, pickled, canned, ground, or otherwise preserved products.
- **Limits:** Do not infer a species, cultivar, origin, size, color, or fixed heat. Add no density, unit mapping, package yield, count conversion, measurement observation, substitution, or recipe form link. Preserve the separate WP04 raw-count observation and its unresolved medium-pepper match.
- **Testing:** None. This is proposal-only documentation; no software tests, builds, or emulator checks were run.

## Checklist, prior-review, and ownership audit

The global plan still has the parent item **Bell peppers and fresh chiles** open at [Section L](../../RecipeBook-global-ingredient-catalog-plan.txt#L6130). R625 integrated the generic bell-pepper identity, and R629 integrated the jalapeño fresh form. The plan has focused subitems for several other named varieties, but no focused WP03 Serrano identity/form decision. The [R625 proposal](wp03-section-l-bell-pepper-identity-review-r625-20261018.md) addresses only generic bell pepper. The [R629 proposal](wp03-section-l-next-fresh-chile-gap-review-r629-20261018.md) addresses jalapeño, not Serrano. The [R144 Fresno proposal](wp03-section-l-next-fresh-chile-review-r144-20261015.md) mentions Serrano as a neighboring product and in its query-collision scan, but does not review the active Serrano identity or its missing form. Earlier [WP04 Serrano count reviews](wp04-recipe066-serrano-pepper-count-portion-review-20261011.md) concern only one source-specific raw count and the unresolved publisher size; they do not cover the WP03 name/form boundary.

The read-only snapshot on 2026-10-18 has **1,828 active references and 157 forms**. The manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Current finding | Proposed treatment |
|---|---|---|
| Active identity | `ingredient-ref-serrano-pepper` is `piment serrano / serrano pepper`, category `VEGETABLE_AND_AROMATIC`, with empty alias arrays, null default density, and no unit mappings. | Keep this ID, category, and canonical names. Update the reference date only for the proposed English alias. |
| Forms | No form is attached to the Serrano reference. `ingredient-form-serrano-pepper-fresh` is unused. | Add only this fresh form. |
| Exact terms | No active reference or form owns `serrano peppers`, `fresh serrano pepper`, or `piment serrano frais`. | Add `serrano peppers` as the only alias; put the two explicit fresh phrases in the fresh-form labels. |
| French plural boundary | Metro Québec’s indexed listing title is `Piments serrano`, but the picker matches a query word against any word in an alias. Adding `piments serrano` would make bare `piments` return one Serrano row, while it currently returns zero. | Keep `piments serrano` as source evidence only; leave `aliasesFr` empty. This follows the existing Fresno decision to keep a plural retail phrase out when it would turn broad `piments` into a singleton. |
| Neighboring owner | `ingredient-ref-queso-fresco-serrano` is a separate `CHEESE` identity. The query `serrano` currently returns both this cheese and Serrano pepper. | Preserve both identities. Add no bare `serrano` alias and do not merge or cross-link the cheese. |
| Research ledger | The existing `ingredient-ref-serrano-pepper` record is `identityState: unreviewed`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. It already holds the WP04 USDA/CNF portions and unresolved medium-size finding. | Attach the new identity/form evidence and mark identity verified if accepted. Preserve all WP04 sources, decisions, and the source-specific 6.1 g observation unchanged. Reuse existing source `WP04-RESIDUAL-PRODUCE-COUNT-20261010-S03` for Health Canada’s bilingual raw-food name; do not duplicate it. |
| Legacy and IDs | The legacy list has no Serrano candidate. The proposed fresh-form ID and R632 source-ID prefix are unused in the active package, ledger, and proposal/archive search. | Add no second reference or legacy promotion. Use the proposal-local source IDs below only if accepted. |

## Evidence and identity boundary

The CFIA’s 2026 final report concerns **whole fresh hot peppers sold at retail in Canada**. It lists Québec and Montréal among its collection cities; Table 5 classifies `Piment Serrano` separately and reports 34 samples. This is evidence of a named Canadian fresh-market product type, not a botanical standard or a complete market census. [S01]

Health Canada’s existing CNF food-code 4858 record names the raw food `Pepper, serrano, raw / Piment, serrano, cru`. This independently supports the existing English and French base names and a raw state. The page also contains published measures; none is imported or changed here. [Existing source `WP04-RESIDUAL-PRODUCE-COUNT-20261010-S03`]

Metro’s current indexed paired Québec/English produce listings use the titles `Piments serrano` and `Serrano Peppers` for the same product number, 685750000182. The Québec page says the pepper can be used fresh, chopped in salsa, marinated, or dried; the English page similarly describes fresh use and drying. This corroborates local market wording and the fresh-market form. Metro’s product package is 60 g, which is product-specific and is not a pepper weight or reusable measure. Direct opening of both retailer pages returned HTTP 403 during this review; their current indexed page content was available. [S02, S03]

No Serrano-specific OQLF entry was found in the scoped terminology search, so this proposal does not describe `piment serrano` as OQLF-preferred wording. The existing French display is retained because Health Canada’s CNF uses that French food name and the Québec retail listing supplies local usage. Do not add `piment fort`, `piments`, `serrano` alone, or a species/cultivar term. A retailer’s descriptions of red/green color and dried use do not justify color, heat, or processed-product forms.

## Recipe demand and measurement boundary

The full manifest-listed recipe corpus was scanned: **114 recipe files / 1,123 ingredient rows**. Only recipe **066**, ingredient row **4**, contains the Serrano ingredient: `1 serrano pepper, thinly sliced`, already linked to `ingredient-ref-serrano-pepper`. The recipe marks it optional and adds the slices to an uncooked marinade, but its bundled ingredient line does not explicitly say `fresh`. Keep its reference, quantity, unit, notes, and optional status unchanged; do not link this line to the fresh form.

The existing WP04 ledger observation for one raw Serrano pepper = 6.1 g remains source-specific. The matching publisher source says one medium pepper, while the CNF/USDA count measure lacks a size qualifier. Preserve that unresolved medium-pepper comparison and add no generalized portion, `item` mapping, or weight from Metro’s 60 g package.

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent/punctuation normalization, complete phrase matches before substring fallback, reference results including attached form labels, and no plural stemming. It adds the proposed alias and fresh form to the current catalog snapshot; the counts are reference results, not form counts.

| Query | Current | Projected | Effect |
|---|---:|---:|---|
| `serrano` | 2 | 2 | Still returns Serrano pepper and the distinct `queso fresco serrano` cheese. |
| `serrano pepper` | 1 | 1 | Existing precise English phrase is unchanged. |
| `serrano peppers` | 0 | 1 | New exact English plural alias resolves to Serrano pepper. |
| `piment serrano` | 1 | 1 | Existing precise French phrase is unchanged. |
| `piment serrano frais` | 0 | 1 | New French fresh-form phrase resolves to Serrano pepper. |
| `fresh serrano pepper` | 0 | 1 | New English fresh-form phrase resolves to Serrano pepper. |
| `piments serrano` | 0 | 0 | French retailer plural is deliberately not stored because its `piments` token would create a false singleton. |
| `piments` | 0 | 0 | Kept unresolved as a generic plural query. |
| `piment` | 28 | 28 | Existing broad French search is unchanged. |
| `pepper` | 35 | 35 | Existing broad English search is unchanged. |
| `peppers` | 12 | 13 | Gains the English plural alias but remains broad and multi-result. |

## Integrated catalog JSON delta

Update the existing reference’s English aliases only; preserve its French aliases, canonical names, category, null density, and empty mappings.

### Existing row in `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-serrano-pepper",
  "nameFr": "piment serrano",
  "nameEn": "serrano pepper",
  "aliasesFr": [],
  "aliasesEn": ["serrano peppers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Addition to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-serrano-pepper-fresh",
  "ingredientRefId": "ingredient-ref-serrano-pepper",
  "formCode": "fresh",
  "labelFr": "piment serrano frais",
  "labelEn": "fresh serrano pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Les sources appuient la pr\u00e9sentation fra\u00eeche; aucune mesure g\u00e9n\u00e9rale ou densit\u00e9 n'est \u00e9tablie.",
  "notesEn": "Sources support the fresh-market form; no general measure or density is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

The accepted integration appends the listed source evidence to the existing Serrano ledger record and adds one `accepted` identity decision using the R632 source IDs plus the existing CNF source ID. It sets `identityState` to `verified`; `measurementState`, `substitutionResearchState`, prior decisions, and `measurementObservations` remain unchanged. No ledger record or measurement observation was added.

## Source register

New proposal-local IDs use `WP03-L-SERRANO-20261018-R632-S`; a search of the current ledger and proposal/archive found no IDs with this prefix. The CFIA PDF URL is already used for other named-pepper rows, each with a different source ID and locator; this adds a Serrano-specific locator and does not repurpose those rows.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-L-SERRANO-20261018-R632-S01` | Canadian Food Inspection Agency, [2026 final report: whole fresh hot peppers sold at retail in Canada](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), accessed 2026-10-18; PDF pp. 3–4 and Table 5, p. 8. | The study covers whole fresh hot-pepper retail samples, includes Québec and Montréal collection locations, and lists `Piment Serrano` as 34 samples. This is fresh-market product-type evidence, not cultivar, species, measure, or full-market prevalence evidence. `sourceKind: other`. |
| `WP03-L-SERRANO-20261018-R632-S02` | Metro Québec, [Piments serrano](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piments-serrano/p/685750000182), current indexed listing, accessed 2026-10-18; product 685750000182. | Supports Québec produce title `Piments serrano` and the listing’s explicit fresh use. The 60 g package is not generalized. Direct open returned HTTP 403; indexed page content was available. `sourceKind: other`. |
| `WP03-L-SERRANO-20261018-R632-S03` | Metro Canada, [Serrano Peppers](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/serrano-peppers/p/685750000182), current indexed listing, accessed 2026-10-18; product 685750000182. | Same product number as the Québec listing; supports the exact English plural alias and fresh-market context. The 60 g package is not generalized. Direct open returned HTTP 403; indexed page content was available. `sourceKind: other`. |

Existing Health Canada evidence remains `WP04-RESIDUAL-PRODUCE-COUNT-20261010-S03` in the same Serrano record: food code 4858, `Pepper, serrano, raw / Piment, serrano, cru`. It supports the bilingual base names; its source-specific count evidence remains unchanged and is not reused as a generic measure.

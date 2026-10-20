# WP03 Section F: No. 5 half-cuts bulgur form review (R690)

- **Reviewed:** 2026-10-18
- **Status:** Integrated on 2026-10-18. The No. 5 form and form-level evidence are recorded in the [R689–R691 integration README](../batches/wp02-wp03-wp04-r689-r691-gap-review-integration-20261018/README.md).
- **Scope:** Resolve the still-open No. 5 half-cuts grain-size class under the existing bulgur identity. This does not reopen fine, medium, coarse, or No. 4 extra-coarse forms.

## Recommendation

**Add one dry form** under the existing `ingredient-ref-bulgur`. The Canadian federal bilingual specification names a separate No. 5 `Half Cuts / extra large grind` class and French `mouture très grossière`; Sunnyland’s 2024 product catalog and current cooking guide independently list a distinct `#5 Half Cut` bulgur product apart from its `#4 Extra Coarse` product. These sources support one exact, label-bounded form. They do not define a shared particle-size threshold or a cross-brand grade conversion.

The integrated display uses the federal French descriptor. It is source-backed wording, not a claim that this exact phrase is established on a Québec retail package or preferred by OQLF for the grind class. Keep the federal document’s statement that North American bulgur has four sizes alongside its separate No. 5 entry as an unresolved scope wrinkle; the integration does not claim that No. 5 is a universal fifth grade.

**Open-item check:** Before integration, the [Section F plan entry](../../RecipeBook-global-ingredient-catalog-plan.txt#L4319) listed the four existing forms and left generic “very coarse” and No. 5 half-cuts unassigned. R690 closes the No. 5-specific gap; generic very-coarse wording remains open and the broader Section F checklist remains unfinished.

## Accepted form

| Field | Integrated value |
|---|---|
| `id` | `ingredient-form-bulgur-no-5-half-cuts` |
| `ingredientRefId` | `ingredient-ref-bulgur` |
| `formCode` | `half_cuts_grind` |
| `labelEn` | `No. 5 half-cuts bulgur` |
| `labelFr` | `boulgour no 5, mouture très grossière` |
| `prepState` | `dry` |
| `matchTermsEn` | `No. 5 half cuts`; `half cut grind bulgur` |
| `matchTermsFr` | `boulgour no 5`; `mouture très grossière` |
| `densityGPerMl` | `null` |

The English match terms are limited to the federal/manufacturer wording for the No. 5 half-cuts class. The French terms use the federal class wording. Do not add generic `very coarse bulgur` / `boulgour très grossier`, `extra coarse`, `extra extra coarse`, `extra large grind` by itself, or standalone `#5` as match terms. Do not add aliases to the parent reference.

## Grain-size boundary and evidence

The federal cereal-grain specification describes bulgur as processed wheat grain sorted by particle size. It separately names No. 3 `Coarse / gros`, No. 4 `Extra coarse / extra gros`, and No. 5 `Half Cuts / extra large grind` with French `mouture très grossière`. In the same section it says that North American bulgur is produced in four particle sizes, Nos. 1–4, before listing No. 5. Preserve that inconsistency rather than inferring a universal five-grade scale.

Sunnyland’s product catalog, last revised November 2024, lists `#4 Extra Coarse Traditional Bulgur` and `#5 Half Cuts Traditional Bulgur` as separate products. Its current cooking guide also gives separate preparation directions for #4 and #5. The manufacturer calls both products an “extra-large grind” in its catalog, so that phrase alone cannot identify No. 5 and is excluded from the match terms. The integrated distinction is the exact **No. 5 half-cuts name**, not a claim about a measured size ordering or common threshold relative to No. 4.

Use `boulgour` as the established Québec base term and retain the federal No. 5 wording `mouture très grossière` for this form. The reviewed sources did not establish a Québec retail label for No. 5 half-cuts. Do not translate `Half Cuts` as `demi-coupes` or assert that this full French display is an OQLF term.

### Source register and ownership

| Source ID | Source | Evidence and limits |
|---|---|---|
| Reuse `WP02-BULGUR-COARSE-QUEBEC-20261010-S01` and `S02` | Department of National Defence, [French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf) and [English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf) *Food Quality Specifications: Cereal Grain*, SQA/FQS-24-03, §§19–27 (2018). | The existing ledger sources are attached to the bulgur coarse-form records. They directly pair No. 5 with `Half Cuts / extra large grind` and `mouture très grossière`, while also containing the four-sizes/No. 5 inconsistency. Reuse these source IDs and URLs; do not create duplicate ledger source entries. |
| `WP03-R690-BULGUR-NO5-20261018-S01` | Sunnyland Mills, [2024 Product Catalog](https://sunnylandmills.com/wp-content/uploads/2024/11/SM10163-ProductCatalog_4.2.pdf), “Specific Grind Sizes” and “Traditional Bulgur,” pp. 3, 5. | Lists separate `#4 Extra Coarse` and `#5 Half Cut` products, including the #5 bagged product. The manufacturer’s classification is not a Canadian or Québec grade standard. Its “extra-large grind” description applies to both #4 and #5 and is not used alone as a match term. |
| `WP03-R690-BULGUR-NO5-20261018-S02` | Sunnyland Mills, [Bulgur Wheat Cooking Guide](https://sunnylandmills.com/bulgur-wheat-cooking-guide/), sections `#4 Extra Coarse Grind Traditional Bulgur` and `#5 Half Cuts Traditional Bulgur`; accessed 2026-10-18. | Current manufacturer page keeps the #4 and #5 product names and directions separate. The water ratios and cooking times are product-specific instructions; they do not establish a general conversion, measure, cooking-yield factor, or cross-brand rule. |
| Reuse `WP02-BULGUR-COARSE-QUEBEC-20261010-S03` | OQLF, [*boulgour* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502438/boulgour). | This existing source is on the bulgur identity and coarse-form ledger records. It supports the Québec French base identity `boulgour`; it does not name or classify grind grades. Reuse the source ID rather than adding another record for the same URL. |

The accepted form is now active as `ingredient-form-bulgur-no-5-half-cuts` under `ingredient-ref-bulgur` (`bulgur / boulgour`, `GRAIN_AND_CEREAL`); the four earlier dry grind forms remain intact. `ingredient-ref-cracked-wheat` (`cracked wheat / blé concassé`) remains separate. The two R690 source IDs and Sunnyland URLs were allocated to the new form record; the federal and OQLF source IDs are reused with their existing URLs.

## Recipe demand and picker projection

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `bulgur`, `boulgour`, spelling variants, `half cut(s)`, `No. 5`, `extra large grind`, `very coarse`, and the integrated French wording. There are **no full-file or ingredient-line hits**. Do not add a recipe link, measurement, density, conversion, cooking yield, or substitution.

The read-only projection follows `IngredientSearch.kt`: form labels and match terms are searched on their parent reference, and a form hint is returned only when the query exactly equals that form’s label or a match term. The “Current result” column preserves the pre-integration behavior; “Integrated result” shows the active catalog after R690.

| Query | Current result | Integrated result |
|---|---|---|
| `bulgur` / `boulgour` | `ingredient-ref-bulgur`, no form hint | Same owner, no form hint. |
| `coarse bulgur` / `boulgour gros` | Bulgur with the No. 3 coarse form hint | Unchanged. |
| `extra coarse bulgur` / `boulgour extra gros` | Bulgur with the No. 4 extra-coarse form hint | Unchanged. |
| `No. 5 half-cuts bulgur`; `No. 5 half cuts`; `half cut grind bulgur` | No result | Bulgur with the No. 5 form hint. |
| `boulgour no 5, mouture très grossière`; `boulgour no 5`; `mouture très grossière` | No result | Bulgur with the No. 5 form hint. |
| `very coarse bulgur`; `boulgour très grossier`; `extra large grind` | No result | Still no result. These remain unassigned because the sources do not establish an exact crosswalk. |
| `blé concassé` | `ingredient-ref-cracked-wheat` only | Unchanged; do not alias it to bulgur. |

The addition broadens only explicit No. 5 half-cuts queries. Generic bulgur searches continue to return the one existing identity, with no implicit grade selected.

## Integration disposition

- Added the dry No. 5 form to `ingredient-forms.v1.json` and the form-level research ledger, reusing the federal and OQLF sources and adding the two Sunnyland sources.
- Kept measurement and substitution states at no supported value/substitute; product cooking directions were not turned into a general measure or cooking rule.
- Added no recipe links, recipe edits, parent aliases, No. 4 mapping, generic very-coarse mapping, or cracked-wheat crosswalk.
- Static package, ledger, generated-index, source-ownership, encoding, and form checks passed. No software tests were run for this database-JSON-only addition under `AGENTS.md`. See the [R689–R691 integration README](../batches/wp02-wp03-wp04-r689-r691-gap-review-integration-20261018/README.md).

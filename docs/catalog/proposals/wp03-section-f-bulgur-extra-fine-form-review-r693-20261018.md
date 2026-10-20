# WP03 Section F R693 — extra-fine bulgur form review (2026-10-18)

- **Status:** Integrated on 2026-10-18. Added the bounded dry extra-fine form and form-level research under `ingredient-ref-bulgur`; no numeric or substitution behavior was added. See the [R692–R694 integration README](../batches/wp02-wp03-wp04-r692-r694-gap-review-integration-20261018/README.md).
- **Plan anchor:** Open Section F grain coverage and bulgur-by-grind item in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4289).
- **Scope:** Assess the dry product class marketed as extra-fine bulgur under the existing bulgur identity. This is separate from R690’s No. 5 half-cuts form and from the existing fine-grind form.

## Recommendation

**Add one label-bounded dry form** under `ingredient-ref-bulgur`, with the bilingual labels `extra fine bulgur / boulgour extra fin`. The manufacturer distinguishes extra fine from fine, the class is sold by a Montréal-area Québec retailer, and a Montréal grocery listing directly pairs the French and English names. Keep the form defined by the marketed label. Do not assert one shared particle-size threshold or map it to a numbered grade.

### Proposed form delta

| Field | Proposed value |
|---|---|
| `id` | `ingredient-form-bulgur-extra-fine-grind` |
| `ingredientRefId` | `ingredient-ref-bulgur` |
| `formCode` | `extra_fine_grind` |
| `labelEn` | `extra fine bulgur` |
| `labelFr` | `boulgour extra fin` |
| `prepState` | `dry` |
| `matchTermsEn` | `Duru extra fine bulgur` |
| `matchTermsFr` | empty |
| `densityGPerMl` | `null` |

Keep aliases on `ingredient-ref-bulgur` empty. Do not add `#0`, `No. 0`, `fine bulgur`, `boulgour fin`, `coarse flour`, or `blé concassé` as this form’s terms. Keep `ingredient-ref-cracked-wheat` separate.

## Exact grain-size boundary

Duru’s current manufacturer page identifies **Extra Fine Bulgur** as smaller than Duru’s Fine Bulgur and its smallest yellow-bulgur size. Duru’s official size table gives extra fine as 0.5–1.6 mm and fine as 0.5–2.5 mm. Those ranges overlap, and they are Duru-specific specifications rather than a standard for all bulgur. They support a distinct product class as labeled; they do not supply a universal cutoff or a size test for other brands.

Sunnyland’s 2024 product catalog separately lists `#0 Extra Fine` and `#1 Fine`; it describes its #0 product as a coarse flour for breads and soups. Duru does not number its extra-fine class in the reviewed sources. Do not infer that Duru extra fine equals Sunnyland #0, federal No. 1, or any other producer’s grade.

The [OQLF entry for *boulgour*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502438/boulgour) supports the Québec French base name only; it does not classify grind sizes. A Montréal grocery marketplace listing directly pairs `Boulgour Extra Fin (1000g)` with `Extra Fine Bulgur (1000g)`. This supports that Québec French product wording, but it is a retailer listing rather than a manufacturer specification and gives no grade number or particle dimension.

## Pre-integration owner and projected picker effect

At the proposal snapshot, the active owner was `ingredient-ref-bulgur` (`bulgur / boulgour`, `GRAIN_AND_CEREAL`) with no parent aliases. Its dry forms were fine, medium, coarse, extra-coarse, and R690 No. 5 half-cuts. The extra-fine form ID was absent from active references, forms, and ledger records; no new reference or candidate ID was needed.

The read-only projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): attached form labels and match terms search the parent reference, and a form hint is returned only for an exact normalized label or match term.

| Query | Before integration | After integration |
|---|---|---|
| `bulgur` / `boulgour` | Bulgur, no form hint | Unchanged. |
| `fine bulgur` / `boulgour fin` | Bulgur with the fine form hint | Unchanged; neither query becomes extra-fine. |
| `extra fine bulgur` / `boulgour extra fin` | No result | Bulgur with the proposed extra-fine form hint. |
| `Duru extra fine bulgur` | No result | Bulgur with the proposed extra-fine form hint. |
| `#0 extra fine bulgur` | No result | Still no result; the source-specific number is not assigned. |
| `No. 5 half cuts bulgur` | Bulgur with the R690 half-cuts form hint | Unchanged. |

## Bundled recipe demand

Scanned all **114 manifest-listed recipe files**, **1,123 ingredient rows**, and **754,048 bytes**. There are no full-file or ingredient-line hits for `bulgur`, `boulgour`, `extra fine`, `extra fin`, `#0`, `No. 0`, or Duru extra-fine wording, and no recipe row links to `ingredient-ref-bulgur`. Add no recipe link or quantity.

The Duru page’s 60 g nutrition serving is a product-label mass, not a household volume or reusable conversion. Do not add a measure, density, unit mapping, conversion, cooking yield, or substitution from it.

## Sources and ownership

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-R693-BULGUR-EXTRA-FINE-20261018-S01` | Duru Bulgur, [Extra Fine Bulgur](https://durubulgur.com/en/brand/extra-fine-bulgur), accessed 2026-10-18. | Current manufacturer page distinguishes extra fine from fine and describes its uses and available package sizes. It does not give a universal particle-size threshold or a numbered grade. |
| `WP03-R693-BULGUR-EXTRA-FINE-20261018-S02` | Duru Bulgur, [official product catalog](https://www.durubulgur.com/docs/duru-urun-katalogu-en.pdf), “Sizes of Bulgur,” p. 13. | Brand-specific extra-fine 0.5–1.6 mm and fine 0.5–2.5 mm ranges; ranges overlap. Use only to define Duru’s class, not a global size boundary. |
| Reuse `WP03-R690-BULGUR-NO5-20261018-S01` | Sunnyland Mills, [2024 Product Catalog](https://sunnylandmills.com/wp-content/uploads/2024/11/SM10163-ProductCatalog_4.2.pdf), pp. 3, 5. | Same source ID and URL already belong to R690’s No. 5 form. Reuse them; do not register a second source. The catalog lists No. 0 extra fine separately and describes its coarse-flour use, not an equivalence to Duru. |
| `WP03-R693-BULGUR-EXTRA-FINE-20261018-S03` | Epicure Market, [Duru Extra Fine Bulgur 1 kg](https://shopepicure.ca/products/duru-extra-fine-bulgur-1kg), accessed 2026-10-18. | Current retailer product page gives the Duru product title and 1 kg package. |
| `WP03-R693-BULGUR-EXTRA-FINE-20261018-S04` | Epicure Market, [Québec locations](https://shopepicure.ca/pages/our-locations), accessed 2026-10-18. | Retailer lists Montréal, Côte-Saint-Luc, and Pointe-Claire stores. This establishes Québec-market context for S03; the Duru product page itself is English-only. |
| Reuse `WP03-SECTION-F-BULGUR-QC-DISPLAY-20261011-S06` from the [earlier Québec bulgur display review](wp03-section-f-bulgur-grade-quebec-display-review-20261011.md). | Supermarché Orkida, [Montréal grocery listing on Uber Eats](https://www.ubereats.com/ca/store/supermarche-orkida/YhOlu13JV8Sbo4o23ju_yA). | The reviewed Montréal menu now also lists the paired French and English extra-fine product title. Use the existing source ID/URL, not a duplicate. It does not specify brand, grade number, or particle size. |
| Reuse `WP02-BULGUR-COARSE-QUEBEC-20261010-S03` | OQLF, [*boulgour* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502438/boulgour). | Existing source supports the base Québec French ingredient name, not the grind modifier. Reuse the existing source ID/URL. |

Before integration, the proposal path, R693 source IDs S01–S04, and proposed form ID were unallocated. The integration adds the form and ledger record, reuses Sunnyland/OQLF evidence, and records the reviewed Orkida wording without duplicating its source URL. See the batch README for the resulting source ownership and validation details.

## Bounded integration checklist

- Add only the proposed dry form under `ingredient-ref-bulgur`; keep the parent reference and existing fine/medium/coarse/extra-coarse/No. 5 forms unchanged.
- Record the form as a marketed extra-fine class with no universal particle-size cutoff and no number-grade mapping.
- Keep density null and add no measure, mappings, conversions, yield, recipe link, substitution, or crosswalk to cracked wheat.
- Preserve the exact picker boundary shown above; do not add short `fine`, `#0`, or `No. 0` terms.

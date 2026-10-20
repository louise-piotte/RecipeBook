# WP05 Section T asafoetida identity integration — R294 — 2026-10-16

## Decision

Added identity-only `ingredient-ref-asafoetida` as **asafoetida / ase fétide** in `BAKING_AND_SPICE`, with English aliases `hing` and `asafetida`. No French aliases were needed. Compounded products sold as hing or asafoetida powder remain separate from the generic ingredient identity; no powder form or powder-qualified alias was added.

The reference has no density or unit mapping. No form, measure, conversion, yield, recipe link, or active substitution was added. The ledger records the identity sources, source-specific product limits, and a no-supported-substitution finding. The existing Silk Road chaat-masala source is reused under its original ID and remains owned by that prior research record. No matching ingredient demand was found in 114 bundled recipes and 1,123 ingredient rows.

## Evidence and source ownership

- OQLF's GDT pairs Québec French **ase fétide** with English **asafoetida** in the spice domain.
- Kew accepts *Ferula assa-foetida* L.; this does not establish the species of every commercial product.
- FDA lists `asafetida` and `hing` as names for asafetida gum. This supports spelling and alias selection, not Canadian regulatory guidance.
- Current Walmart Canada and Metro Québec listings show carrier-containing products sold under hing/asafoetida powder wording. Their formulations are product-specific and do not define a generic powder form.
- The existing chaat-masala source documents asafoetida in one named blend only; it does not establish recipe demand or a general formula.

## Data changes

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added one identity-only reference with the narrow English aliases.
- `docs/catalog/research-ledger.v1.json`: added one reference record, five new source IDs, one reused source ID, and one no-supported-substitution finding. No measurement observation was added.
- `BundledIngredientCatalog.kt`: regenerated the picker index from the bundled JSON.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: checked the asafoetida subtask while leaving the broader Section T task open.
- `roadmap.md`: recorded the completed review and validation.

## Verification

Static package normalization/validation, reference normalization, generated-index freshness, ledger schema and source ownership, picker projection, corpus scan, UTF-8/no-BOM, explicit Unicode-escape, local-link, and scoped whitespace checks passed. At R294 integration: 1,664 references, 127 forms, 2,014 ledger records, 8,884 source entries, 7,521 distinct source IDs, and 6,282 distinct URLs; the corpus remains 114 recipes and 1,123 ingredient rows.

No software tests, builds, or emulator checks were run because this change only adds database JSON data and its generated index, as directed by `AGENTS.md`.

## References

- [R294 proposal](../../proposals/wp05-section-t-asafoetida-identity-review-r294-20261016.md)
- [OQLF GDT: ase fétide](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3499893/ase-fetide)
- [Kew: *Ferula assa-foetida*](https://powo.science.kew.org/taxon/842190-1)
- [FDA: Asafetida, gum](https://www.hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=ASAFETIDAGUM&set=FoodSubstances)
- [Metro Québec: Tata Masala](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/sauces-et-assaisonnements-en-sachet/epices-masala/p/8904043902777)
- [Walmart Canada: MTR HING](https://www.walmart.ca/en/ip/MTR-HING/64CDNH35U0EF)
- [The Silk Road Spice Merchant: Chaat Masala](https://silkroadspices.ca/collections/spice-blends/products/chaat-masala)

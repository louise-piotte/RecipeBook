# WP05 Section T — Hot paprika identity review (R305)

- **Packet type:** ingredient identity, product boundary, French display, picker, recipe-demand, measurement, and substitution review.
- **Prepared and source-access date:** 2026-10-16.
- **Plan target:** Section T paprika, cayenne, chile flakes, and chile powders.
- **Status:** integrated on 2026-10-16 by promoting the held ledger ID `ingredient-ref-hot-paprika`.
- **Source IDs:** `WP05-HOT-PAPRIKA-R305-20261016-S01` through `S07`. New source IDs and URLs were checked against the research ledger and proposal archive.

## Recommendation

Promote one identity-only reference for ground hot paprika. The Codex standard lists paprika and hot paprika as paprika products made from *Capsicum annuum* and *C. frutescens*, and treats ground paprika separately from ground chilli pepper [S01]. ISO 7540:2020 specifies ground sweet and hot paprika and explicitly excludes ground chillies and other *Capsicum* species [S02]. This supports a distinct commercial spice identity without claiming one cultivar or heat level.

| Field | Value |
|---|---|
| ID | `ingredient-ref-hot-paprika` (promote existing candidate) |
| Category | `BAKING_AND_SPICE` |
| English display | `hot paprika` |
| English aliases | none |
| French display | `paprika fort` |
| French aliases | `poudre de paprika fort`; `paprika épicé broyé` |
| Density and unit mappings | none |
| Forms, yields, conversions, recipe links, active substitutions | none |

The Canadian Bulk Barn product page labels the item **Hot Paprika / Paprika fort**, gives the ingredient as hot paprika, and shows the same product under French navigation [S03]. CFIA’s Canadian ground-spice survey records single-spice samples named “Poudre de paprika fort” and “Paprika épicé broyé,” supporting these narrow French search aliases [S04]. A Canadian French-language wholesaler catalog lists Paprika Fort separately from Paprika Fumé [S05]. The French display follows observed Canadian product wording; it is not presented as an OQLF terminology ruling.

### Identity and picker boundaries

Keep this reference distinct from generic paprika, smoked paprika, cayenne pepper, red chili flakes, and chili powder. Codex and ISO distinguish ground hot paprika from ground chilli products [S01–S02]. Illinois Extension describes sweet, hot, and smoked paprika as different types and warns that substituting one type for another changes the intended result [S06]. Do not alias “Hungarian paprika,” whose heat can vary, or “smoked hot paprika,” which adds a smoked style qualifier. The CFIA-only wording “Paprika fort style hongrois” is not generalized to all hot paprika [S04].

Before integration, the canonical seed had generic and smoked paprika, cayenne, red chili flakes, and chili powder, but no hot-paprika reference. The research ledger held `ingredient-ref-hot-paprika` as an unreviewed legacy candidate. No bundled recipe ingredient row uses hot paprika or the proposed French variants; generic and smoked paprika lines remain as written.

### Measurements and substitutions

No hot-paprika-specific household mass or density is supported. Bulk Barn’s 100 g nutrition-label basis is not a recipe measure [S03], and the CFIA survey is an allergen/gluten sampling study, not a portion-weight study [S04]. A general-purpose converter asserts 2.3 g per teaspoon for sweet, smoked, and hot paprika but gives no measurement method or product-specific evidence; that figure is not adopted [S07]. Keep density null and unit mappings empty; the ledger marks measurement research `researched_no_supported_value` with no observations.

Illinois Extension says cayenne pepper may work when hot paprika is unavailable, but supplies no amount, recipe, role, or method for that suggestion [S06]. Record this as blocked evidence only (`blocked_pending_evidence`) with no replacement amount, active rule, or recipe-line link. No other substitution was supported by the reviewed sources.

### Corpus and picker audit

The 114 manifest-listed recipes and 1,123 ingredient rows were scanned for `hot paprika`, `paprika fort`, `poudre de paprika fort`, `paprika épicé broyé`, and compound hot/smoked wording. No exact hot-paprika demand was found, so no recipe was linked or relinked.

After integration, each display and alias phrase resolves uniquely to the new reference in the picker projection. No form, mapping, measurement, conversion, yield, or active substitution was introduced.

## Source register

| Source ID | Source and evidence | Limit |
|---|---|---|
| **WP05-HOT-PAPRIKA-R305-20261016-S01** | Codex Alimentarius, [Standard for Dried or Dehydrated Chilli Pepper and Paprika, CXS 353-2022](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+353-2022%2FCXS_353e.pdf), §2.1–2.2 and Table 1. Names “Paprika, hot paprika” and *C. annuum* / *C. frutescens*, and separately defines ground paprika and ground chilli pepper. | Commodity identity standard; does not define a consumer synonym list, heat scale, or household measure. |
| **WP05-HOT-PAPRIKA-R305-20261016-S02** | International Organization for Standardization, [ISO 7540:2020](https://www.iso.org/standard/70871.html), official standard abstract. Specifies ground sweet and hot paprika and excludes ground chillies and other *Capsicum* species. | Abstract only; full standard is not available on the public page. |
| **WP05-HOT-PAPRIKA-R305-20261016-S03** | Bulk Barn, [Hot Paprika / Paprika fort](https://www.bulkbarn.ca/fr/products/all/hot-paprika-2245), product 002245. The bilingual page names the product, gives its ingredient as hot paprika/paprika fort, and lists a 100 g nutrition-label serving basis. | Canadian retailer product listing; 100 g is not a recipe portion or conversion, and inventory varies by store. |
| **WP05-HOT-PAPRIKA-R305-20261016-S04** | Canadian Food Inspection Agency, [Undeclared allergens and gluten in ground spices and herbs (2020–2021)](https://inspection.canada.ca/sites/default/files/documents/2025-03/2020-2021-undeclared-allergens-gluten-in-ground-spices-herbs-fra.pdf), French report, PDF p. 6. Lists “Poudre de paprika fort,” “Paprika épicé broyé,” and “Paprika fort style hongrois” as separate single-spice sample descriptions. | Sample label wording, not a terminology recommendation; survey purpose is allergen/gluten surveillance, not culinary measurement. |
| **WP05-HOT-PAPRIKA-R305-20261016-S05** | Shashi Foods, [French product catalog](https://www.shashifoods.com/wp-content/uploads/2023/03/Shashi-Catalog-FR-2023-Web-PDF.pdf), p. 41. Lists Paprika Fort, Paprika Fumé, Paprika Espagnol, and Paprika Hongrois separately. | Canadian supplier catalog; product names and case sizes do not establish Québec household usage or measures. |
| **WP05-HOT-PAPRIKA-R305-20261016-S06** | University of Illinois Extension, [“Sweet, Hot, or Smoked Paprika?”](https://extension.illinois.edu/blogs/simply-nutritious-quick-and-delicious/2020-02-28-sweet-hot-or-smoked-paprika), lines 93–96. Describes distinct styles and says cayenne may work when hot paprika is unavailable. | Qualitative cooking advice only; gives no replacement quantity or recipe-specific scope. |
| **WP05-HOT-PAPRIKA-R305-20261016-S07** | Cooking Converter, [Paprika Measurement Converter](https://www.cookingconverter.com/measurements/paprika). Claims approximately 2.3 g/tsp across sweet, smoked, and hot paprika. | No measurement method, tested product, or primary measurement citation is provided; not adopted as a catalog measure. |

## Disposition

Promote the held legacy candidate to identity-only `hot paprika / paprika fort` in `BAKING_AND_SPICE`, retaining only the two CFIA-attested French labels as aliases. Keep sweet/generic paprika, smoked paprika, cayenne, chile flakes, and chile powders distinct. Preserve the generic converter’s number as rejected context, not numeric behavior. Record the qualitative cayenne suggestion as blocked; add no active substitutions, forms, measures, mappings, recipe links, conversions, or yields. The broader checklist item remains open for its other identities and evidence.

## Integration record

Promoted the held candidate in place, added one ingredient reference, and appended seven sources and two decisions to its ledger record. No recipe rows, forms, conversions, measurement observations, or active substitution rules were added.

Static reference normalization, package/schema validation, generated-index freshness, source-ID/URL ownership, picker uniqueness, corpus scan, seed escape/UTF-8 checks, local links, and scoped whitespace checks passed. No software tests, builds, or emulator checks were run because this change only adds database JSON data, under `AGENTS.md`.

# WP02 Section A7 R975: corn germ identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, or checklist data was changed.
- **Open-plan anchor:** Section A7 remains open for review of other grain meals and milling products ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Selected gap:** The separated, full-fat **corn germ** fraction for human-food use, before oil extraction and before intentional toasting.
- **Recommendation:** If accepted, add one identity-only `GRAIN_AND_CEREAL` reference for `corn germ / germe de maïs`. Keep the French display provisional. Do not add aliases, forms, measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Preserve all existing rows and their source-specific evidence.

## Candidate identity and boundary

Corn germ is the embryo fraction separated from maize kernels during milling. This proposal covers full-fat germ as a distinct human-food ingredient before oil extraction. Food research documents it as a material that can be prepared for food use; this review does not claim common household use, Canadian retail availability, a standard grade, or a universal milling specification.

Keep the proposed identity separate from:

- `ingredient-ref-toasted-corn-germ`: the existing toasted ingredient, with its existing Quebec French label evidence. The R95 decision explicitly kept unheated corn germ outside that row. Do not rename it, merge it, or transfer its toasted-product evidence.
- `ingredient-ref-defatted-corn-germ-flour`: the existing flour made from defatted germ. Its flour identity, measurements research, and food-formula evidence do not transfer to full-fat germ.
- `ingredient-ref-corn-oil`: extracted oil, which owns the OQLF-backed alias `huile de germes de maïs`. Do not move or copy that alias.
- Corn-germ meal/cake after oil extraction, feed-grade meal, corn germ protein or other extracts, and composite foods containing a germ ingredient.
- Corn bran, corn flour, corn grits, cornmeal, hominy grits, and degermed maize products.

The proposed identity is limited to the separated germ itself. It excludes oil-extracted meals and any ingredient that includes other kernel fractions. Do not generalize composition, nutritional claims, heat treatment, stabilization, flavour, or shelf-life findings across those materials.

## Québec naming and picker boundary

The English display `corn germ` is the generic name used by the reviewed food-science literature. The proposed French display `germe de maïs` is a transparent, provisional construction, not an OQLF-approved human-food name. Existing terminology sources give limited support only:

- OQLF's existing `huile de maïs` record lists `huile de germes de maïs`, but it names the oil. Its existing source ID, `WP05-OIL-INT-20261012-S04`, remains owned by `ingredient-ref-corn-oil` and is not duplicated or transferred.
- The Quebec French ingredient wording `germe de maïs grillé` is already documented on the toasted-germ record under R95 sources S03–S04. It supports the French base phrase in a toasted context only; it does not directly attest the proposed unqualified ingredient.

No aliases are proposed. The existing English displays already contain `corn germ` within `toasted corn germ` and `defatted corn germ flour`; if the new plain identity is accepted, broad searches should retain all three visibly qualified rows. The plain French query will also surface the existing toasted row. Do not add the oil's longer alias or any unqualified variants to the new row.

## Current ownership and recipe-demand audit

Read-only scan of the live split seed package and research ledger on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | 1,992 references. No exact `ingredient-ref-corn-germ` ID or standalone `corn germ / germe de maïs` identity exists. Related owners are `ingredient-ref-toasted-corn-germ`, `ingredient-ref-defatted-corn-germ-flour`, and `ingredient-ref-corn-oil`; their displays/alias boundaries are listed above. | If accepted, add one new identity. Preserve those three rows, their source ownership, and every product-specific claim. |
| Ingredient forms | 205 forms. No form is attached to a proposed corn-germ ID or owns the unqualified candidate phrase. | Add no form. The sources do not establish a transferable form set for household recipes. |
| Legacy import identities | 55 candidates. No exact candidate ID or normalized unqualified corn-germ identity was found. | No legacy promotion, resolution, or alias transfer is proposed. |
| Research ledger | 2,397 records. There is no standalone `ingredient-ref-corn-germ` record. Existing related source owners are corn oil, toasted corn germ, and defatted corn-germ flour; the R95 and R948 records must remain intact. | Create a separate identity record only if accepted. Reuse no source IDs from the neighboring rows as evidence for the proposed identity. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 structured ingredient rows were scanned. Exact and normalized searches for `corn germ`, `maize germ`, `full-fat maize germ`, `whole corn germ`, `germe de maïs`, and the proposed ID found zero recipe-file matches and zero ingredient-row matches. | No bundled demand, quantity, or recipe link supports the addition. |
| Proposal and batch archive | [R95](wp03-section-f-r95-toasted-corn-germ-identity-review-20261014.md) reviewed toasted corn germ and expressly left unheated germ outside that processed identity. [R948](wp02-generic-gap-r948-20261019.md) reviewed defatted corn-germ flour. No focused review or active row for standalone full-fat corn germ was found. | Review only the distinct, generic germ identity; do not reopen either earlier decision or transfer evidence between them. |
| Proposed source IDs and URLs | `WP02-A7-CORN-GERM-R975-20261019-S01` through `S06`, and their exact URLs below, were not found in the live ledger. The proposed R975 path is unassigned. | The new research IDs are proposal-local and have not been added to the shared ledger. |

The proposal is identity-driven, not recipe-demand-driven. The absence of bundled demand means no recipe link or recipe-derived quantity should be added.

## Evidence and limits

| Proposal-local source | Evidence and limits |
|---|---|
| **S01.** Debora Giordano, Francesca Vanara, Amedeo Reyneri, and Massimo Blandino, [“Effect of dry-heat treatments on the nutritional value of maize germ”](https://doi.org/10.1111/ijfs.13228), *International Journal of Food Science & Technology* 51(11) (2016), 2468–2473. | The study identifies full-fat maize germ as a milling by-product and evaluates dry-heat treatments used to reduce spoilage risk. Supports a distinct full-fat germ material. The treatment combinations and measured composition are specific to the study; they are not home-processing instructions, a standard grade, a storage rule, or a recipe measure. |
| **S02.** H. W. Gardner, G. E. Inglett, W. L. Deatherage, W. F. Kwolek, and R. A. Anderson, [“Food products from corn germ: Evaluation as a food supplement after roll-cooking”](https://doi.org/10.1111/j.1365-2621.1971.tb15150.x), *Journal of Food Science* 36(4) (1971), 640–644; bibliographic record at [FAO AGRIS](https://agris.fao.org/search/en/providers/122535/records/65de15fd4c5aef494fd9c7af). | The primary study makes a cooked flake from full-fat corn germ and assesses its use as a food supplement. Supports human-food use of the germ fraction. Roll temperature, temper moisture, storage observations, flavour, and flake properties belong to that study and are not transferable instructions or measurements. |
| **S03.** Thalli Satyanarayana Deepak and Padmanabhan Appukuttan Jayadeep, [“Prospects of Maize (Corn) Wet Milling By-Products as a Source of Functional Food Ingredients and Nutraceuticals”](https://hrcak.srce.hr/en/clanak/398162), *Food Technology and Biotechnology* 60(1) (2022), 109–120, DOI [10.17113/ftb.60.01.22.7340](https://doi.org/10.17113/ftb.60.01.22.7340). | This review describes recovery of the germ during wet milling, then purification and sale for human consumption; it distinguishes residual germ meal used in livestock feed. Supports the human-food identity boundary, not household use or equivalence among all wet- and dry-milling streams. |
| **S04.** FAO/INFOODS, [Density Database, Version 2](https://www.fao.org/4/ap815e/ap815e.pdf), entry `Corn/maize, germ flour`. | Lists a 0.56 g/mL density for **germ flour**, without enough identity detail to apply it to the proposed separated full-fat germ. It is not a household measure for whole germ and is not activated or transferred. |
| **S05.** [“Application of *Saccharomyces cerevisiae* fermented whole corn germ flour in bread premixes and loaf bread: nutritional, technological, and sensory properties”](https://doi.org/10.1016/j.ijgfs.2026.101452), *International Journal of Gastronomy and Food Science* 43 (2026), 101452. | The study tests 0%, 7.5%, 15%, 22.5%, and 30% replacement of wheat flour with fermented whole corn-germ flour and reports acceptable bread quality through 15% under its conditions. Fermentation, flour preparation, blend levels, results, and finished bread are study-specific; they do not establish a general substitution rule for separated corn germ or generic flour. |
| **S06.** Sukreeti Sharma, Gagandeep Kaur Sidhu, E Kiranmai, and K Rajeshwari, [“Changes in physico-chemical quality characteristics of maize germ during storage”](https://www.chemijournal.com/archives/2018/vol6issue4/PartO/6-4-44-647.pdf), *International Journal of Chemical Studies* 6(4) (2018), 811–816. | Reports engineering properties for maize germ separated from PMH 1 kernels with a developed degermer and dried to 4% moisture (wet basis). Its bulk density, 388.84 ± 1.36 kg/m³, characterizes that prepared sample; it is not a household volume conversion or a general value for culinary corn germ. |

The exact source IDs above are proposal-local. Existing OQLF and R95 source records were reviewed for terminology context without creating duplicate source records or moving their ownership. No manufacturer or retailer product page was used to define the proposed generic identity.

## Measurement and substitution review

- **Measurement:** Searches found no supported household measure or transferable kitchen density for separated full-fat corn germ. S06 reports a bulk density of 388.84 ± 1.36 kg/m³ for a PMH 1 maize-germ sample separated with a developed degermer and dried to 4% moisture; those sample-preparation conditions and the engineering measurement do not establish a recipe conversion or a general culinary value. The FAO/INFOODS value in S04 is for germ flour, not whole germ. If integrated, use `researched_no_supported_value`; add no measurement observation, form, unit mapping, default density, conversion, cooking yield, or package yield.
- **Substitution:** S02 prepares a cooked corn-germ flake, and S05 studies a fermented germ flour in specific bread formulas. Neither establishes that whole corn germ replaces another recipe ingredient, nor gives a transferable ratio, method adjustment, or contextual scope. If integrated, use `blocked_pending_evidence`; add no substitution finding, global or contextual rule, or recipe-line substitution link. Keep all experimental proportions and outcomes with their cited studies.

## Proposed minimal state if accepted

Add only:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-corn-germ` |
| English display | `corn germ` |
| French display | `germe de maïs` (provisional descriptive construction) |
| Category | `GRAIN_AND_CEREAL` |
| English/French aliases | Empty |
| Default density / unit mappings | `null` / empty |
| Forms, recipe links, conversions, yields, active rules | None |
| Proposed research states | Identity verified; measurement `researched_no_supported_value`; substitution `blocked_pending_evidence` |

Keep the existing toasted-germ, defatted-germ-flour, corn-oil, corn-bran, and other maize rows unchanged. Do not transfer product-specific measurements, names, or claims without a separate review of whether each identity and its evidence are genuinely transferable.

## Cross-category queue scope

The A7 checklist repeats the named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead while its status is already out of scope ([plan, line 2301](../../RecipeBook-global-ingredient-catalog-plan.txt#L2301)). Do not research or expand that commercial product: commercial-product counts do not add ingredient diversity. Preserve the historical [R605 record](wp02-a7-next-grain-meal-gap-review-r605-20261018.md) and existing evidence. No brand, product-line, flavour-family, SKU, or retailer-variant roster was pursued for R975.

## Proposal checks

- Recounted live data: 1,992 ingredient references, 205 forms, 55 legacy candidates, 2,397 ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows.
- Audited normalized name and ID ownership across references, aliases, forms, legacy candidates, ledger records, recipe files, recipe rows, prior proposals, batches, plan, and roadmap; no standalone full-fat corn-germ identity or demand was found.
- Checked the six proposal-local source IDs and exact URLs against current ledger ownership; all are unallocated. Preserved the OQLF source's existing corn-oil ownership and R95/R948 evidence boundaries.
- No software tests, build, emulator run, or deployment were performed because this is proposal-only work.

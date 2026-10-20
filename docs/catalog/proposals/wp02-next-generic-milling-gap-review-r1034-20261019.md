# WP02 Section A7 R1034: rye bran flour identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This review changes only this Markdown proposal; it does not edit shared catalog JSON, the research ledger, plan, roadmap, recipes, generated files, or tests.
- **Open-plan anchor:** WP02 Section A7 remains open for other grain meals and milling products, including the unresolved generic wheat-meal candidate ([catalog plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** Generic culinary **rye bran flour**, a rye milling fraction named in a human-food bread study and distinct from the existing rye bran identity.
- **Recommendation:** Add one identity-only **FLOUR_AND_STARCH** reference, **rye bran flour / farine de son de seigle**. Keep the French compound descriptive and provisional for Québec. Add no aliases, forms, reusable measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. Do not research or add brands, product lines, flavours, SKUs, or retailer variants. Commercial-product counts do not add ingredient diversity.

## Identity boundary and bilingual naming

Rosén et al. use the exact ingredient name **rye bran flour** in a rye-bran bread formula in a primary human-food study. This supports culinary use of the named ingredient, but the study does not define its manufacturing method, particle-size threshold, composition, or retail grade. [S01]

A primary rye-milling study separates bran from shorts and endosperm flour fractions and evaluates the sensory characteristics of the fractions and breads made with them. It supports keeping the rye bran fraction distinct from rye flour and shorts, but its cultivar, mill streams, yield, bread formula, and results do not define a universal milling specification. [S02]

Use **farine de son de seigle** only as a descriptive, provisional French display. The existing rye-bran row uses **son de seigle**; the Canadian Food Inspection Agency requires the grain source to be named when bran is not wheat bran, but does not prescribe this exact flour compound. No exact Québec-preferred term for **rye bran flour** was found in this review. Reuse the existing rye-bran sources only for their narrow terminology claims; do not move or broaden their source ownership. [reused S03–S04]

Keep the proposed row limited to the generic source-named ingredient. The studies do not establish that every ground rye bran, rye-bran powder, or bran-containing rye flour is the same milling product. Do not define a sieve-size cutoff, a fixed bran percentage, or a universal milling or recovery method.

Keep it separate from:

- **ingredient-ref-rye-bran — rye bran / son de seigle.** This is the existing unqualified rye-bran milling identity. Preserve its name, aliases, source ownership, and research states. Do not add **rye bran flour**, **ground rye bran**, or **rye-bran powder** as aliases.
- **ingredient-ref-rye-flour**, **ingredient-ref-whole-rye-flour**, and the light, medium, dark, and malted rye-flour identities. Those are rye-kernel flour classes or grades, not a flour made from the bran fraction.
- **ingredient-ref-rye-meal — rye meal / gruau de seigle**, including its current meal and pumpernickel aliases; **cracked rye**, rye grain, rye berries, rye flakes, and **rye germ**. Preserve their names and evidence. Do not assign this candidate the existing owners’ wording.
- Rye shorts and other rye milling streams discussed in S02. Keep the study’s fraction distinctions source-scoped; this proposal adds no shorts identity or alias.
- Composite or prepared foods containing rye bran, including sourdoughs, breads, and cereals.

## Ownership and recipe-demand audit

Read-only audit of the live package and catalog files on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,041** active references. No exact owner or alias was found for ID **ingredient-ref-rye-bran-flour**, English **rye bran flour**, or French **farine de son de seigle**. Nearby owners include rye bran, rye flour grades, rye meal, rye germ, cracked rye, rye grain, berries, and flakes. | The proposed exact identity is unowned. Preserve all current rye references and aliases. |
| Ingredient forms | **205** forms. No form owns the proposed ID or exact candidate name; the existing rye-bran row also has no form. | Add no form. This proposal is a separately named milling ingredient, not a preparation or cooking-state form. |
| Research ledger | **2,446** records. No exact rye-bran-flour record or alias was found; neither R1034 source ID nor either new primary-study URL below is already in the ledger. The existing **ingredient-ref-rye-bran** record is identity-verified with measurement **researched_no_supported_value** and substitution **researched_no_supported_substitute**; it has no measurement observations or substitution findings. | If accepted, create a separate record with new source IDs. Preserve the existing rye-bran record and do not transfer its state or source claims to the proposed flour. |
| Existing rye-bran evidence | The existing row has seven sources, including CFIA English and French labeling guidance, rye-milling research, and one Québec-facing French ingredient-list example. A named one-ingredient rye-bran product has an approximate **13 g** serving claim; a combined rye-flour product listing gives **1/4 cup (30 g)** without the rye-bran component proportion. These are source-specific claims already attached to rye bran; the latter amount cannot be assigned to bran. | Keep both claims and the existing **son de seigle** wording on the current rye-bran owner, with their original limits. Neither provides a measure for rye bran flour. No brand or product research was done for R1034. |
| Legacy import identities | **55** candidates. No exact candidate wording or proposed ID was found. | No legacy promotion, merge, or alias transfer is proposed. |
| Bundled recipes | Scanned all **114** manifest-listed recipe files and **1,123** ingredient rows. No file or ingredient row matched the proposed ID, **rye bran flour**, **rye-bran flour**, or **farine de son de seigle**. The scan also found no rye-bran wording in the current recipe bundle. | There is no bundled recipe demand, recipe quantity, or recipe link supporting the addition. |
| Forms, substitutions, and yields | No candidate-specific active form, global or contextual substitution, package-yield entry, density, or unit mapping was found. | Add none. Keep all active behavior for adjacent rye identities unchanged. |
| Proposal/source history | No earlier proposal owns the exact candidate wording or proposed ID. The R1034 source-ID prefix and the two primary-study URLs below are not present in the archive or ledger. | Use proposal-local source IDs. Preserve earlier rye-bran, rye-meal, rye-flour, and rye-grits reviews. |

The proposed identity is distinct by its source-named bran-flour wording, but the reviewed papers do not show a standardized grade. Keep that boundary explicit and do not broaden the entry to all ground rye bran.

## Numeric and substitution limits

The reviewed papers do not establish a reusable household measure, density, unit mapping, conversion, cooking yield, or general recipe instruction for rye bran flour.

- S01 lists **487 g rye bran flour** in one rye-bran bread formula. This is a recipe-formula amount, not a household portion, generic measure, or reusable flour-to-bran conversion.
- S02 tests rye milling fractions in bread using a **20%** replacement level. This is specific to the paper’s cultivar, mill fractions, bread formula, and sensory evaluation; it is not a general rye-bran-flour substitution rule.
- The exact-name measure search did not find a reliable generic cup weight or density for rye bran flour. Rye-flour measures, whole-rye flour grades, and the rye-bran source-specific quantities listed in the ownership audit belong to other owners and must not be transferred.

If accepted, set measurement research to **researched_no_supported_value** and substitution research to **blocked_pending_evidence**. Keep density null and unit mappings empty. The study formulas support culinary use but do not establish a general replacement rule or a sufficiently bounded contextual substitution. Add no measurement observation, forms, recipe links, conversions, yields, or active substitutions.

## Source register

The two new study IDs below are proposal-local. Reused CFIA and Québec wording sources remain attached to the existing rye-bran ledger record; this review does not add or move ledger sources.

| Source | Source and locator | What it supports and limits |
|---|---|---|
| **S01 / WP02-A7-RYE-BRAN-FLOUR-R1034-20261019-S01** | Rosén et al., [“Endosperm and whole grain rye breads are characterized by low post-prandial insulin response and a beneficial blood glucose profile”](https://doi.org/10.1186/1475-2891-8-42), *Nutrition Journal* 8, 42 (2009), methods and bread formula; DOI 10.1186/1475-2891-8-42. | Primary human-food study that names rye bran flour in a bread formula. Its ingredients, amount, method, and physiological outcomes apply only to that study; they do not establish a generic measure, density, standard milling grade, or substitution ratio. |
| **S02 / WP02-A7-RYE-BRAN-FLOUR-R1034-20261019-S02** | Heiniö et al., [“Milling fractionation of rye produces different sensory profiles of both flour and bread”](https://doi.org/10.1016/S0023-6438(03)00063-X), *LWT – Food Science and Technology* 36(6) (2003), 577–583; DOI 10.1016/S0023-6438(03)00063-X. | Primary milling and food study that distinguishes rye bran from shorts and endosperm flour streams and tests rye fractions in bread. Its cultivar, milling streams, bread formula, and results are source-specific, not a universal rye-bran-flour definition or substitution rule. |
| **Reused S03 / WP03-RYE-BRAN-20261013-R58-S01 and S02** | Canadian Food Inspection Agency, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products) and [Exigences d’étiquetage et de composition pour les céréales et les produits de boulangerie](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie), bran labeling sections. Current owner: **ingredient-ref-rye-bran**. | The English and French pages say another grain source must be named when bran is not wheat bran. They support explicit rye qualification only; they do not establish **farine de son de seigle** as a preferred Québec term or define rye bran flour. |
| **Reused S04 / WP03-RYE-BRAN-20261013-R58-S05** | Marché Tau, [existing French ingredient-list entry](https://marchestau.com/pain-croustillant-mutligrains-250gr). Current owner: **ingredient-ref-rye-bran**. | It supports the base wording **son de seigle** in that existing ingredient-list context only. It does not attest the standalone flour compound or establish a component quantity. Keep it attached to its current owner. |

## Commercial queue scope

The A7 history’s named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead is product-only. Mark it **out of scope** and stop that line because another commercial-product count does not add ingredient diversity. Preserve the historical wheat-meal review, unresolved generic wheat-meal question, existing branded rows, and each row’s product-specific evidence. No brand, product-line, flavour-family, SKU, or retailer-variant research was performed for R1034.

## Proposed minimal data

If accepted, add only this reference row:

| Field | Proposed value |
|---|---|
| ID | **ingredient-ref-rye-bran-flour** |
| English display | **rye bran flour** |
| French display | **farine de son de seigle** — descriptive and provisional for Québec |
| Category | **FLOUR_AND_STARCH** |
| English/French aliases | Empty |
| Default density / unit mappings | **null** / empty |
| Forms, reusable measurements, recipe links, conversions, yields, active substitutions | None |
| Proposed ledger states | Identity **verified**; measurement **researched_no_supported_value**; substitution **blocked_pending_evidence** |

This adds one generic rye milling identity with a direct human-food use and a separately documented bran milling fraction. Keep the French compound provisional, preserve existing rye-bran measurements and claims on their current owner, and do not encode study amounts as reusable data. This file is proposal-only; no tests or builds were run.

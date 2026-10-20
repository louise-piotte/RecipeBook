# WP03 Section H — canned black-eyed peas with liquid form review (R72)

- **Reviewed:** 2026-10-13
- **Status:** integrated in [the R72 batch record](../batches/wp03-section-h-canned-black-eyed-peas-form-integration-20261013/README.md)
- **Selected gap:** the canned, undrained form of the existing black-eyed-pea / cowpea identity
- **Checklist fit:** Section H leaves pulse forms open for review where justified; the source plan still marks whole/split/seed-coat distinctions and dry, cooked, canned, and drained forms open. See the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3496).
- **Review scope:** one form under `ingredient-ref-black-eyed-peas`. This review adds one form under the existing pulse identity; it does not change recipe files or add a recipe link.
- **Source-ID disposition:** `S01`–`S06` were collision-checked before drafting and registered in the active research ledger as part of R72 integration.

## Recommendation

Add one form under `ingredient-ref-black-eyed-peas`:

| Field | Proposed value |
|---|---|
| Form ID | `ingredient-form-black-eyed-peas-canned-with-liquid` |
| Parent | `ingredient-ref-black-eyed-peas` — `black-eyed peas / doliques à œil noir` |
| `formCode` | `canned_with_liquid` |
| `prepState` | `with_liquid` |
| English label | `canned black-eyed peas with liquid` |
| French label | `doliques à œil noir en conserve, avec le liquide` — a descriptive form label, not a quoted retail package phrase |
| English match terms | `canned black-eyed peas` |
| French match terms | `pois à œil noir en conserve` |
| Density and unit mappings | `densityGPerMl: null`; no unit mappings |
| Recipe links | None |

Current Canadian product evidence and the Canadian Nutrient File (CNF) identify this as a real canned product state, and the source distinguishes its contents from a later drained-and-rinsed state. The bundle has no black-eyed-pea ingredient line, so do not add a recipe link. Keep canned/drained/rinsed as a separate state for a later review that has a concrete need; do not apply this CNF record to drained beans.

The integrated form carries source-qualified CNF portion observations in the research ledger. Preserve each mL-to-gram pair as an observation on CNF food code 3284. Do not turn the ratios into density or active unit mappings, scale them to a retail can, or apply them to drained/rinsed beans. No cooking yield or substitution rule is supported.

The integrated form ledger record marks measurement as `researched_supported` for these code-specific observations. Keep substitution behavior inactive: the federal guide gives only qualitative texture/readiness context, with no quantity-bearing rule for this form.

## Novelty and ownership audit

The live package was scanned before writing. It contains 1,393 ingredient references, 101 forms, and 42 `LEGUME_AND_PULSE` references, 10 of which have forms. The legacy list has 63 candidates; the research ledger has 1,727 records.

| Area | Exact current ownership | R72 finding |
|---|---|---|
| Active reference | `ingredient-ref-black-eyed-peas`, category `LEGUME_AND_PULSE`; EN `black-eyed peas`, aliases `cowpea`, `cow pea`, `cowpeas`, `cow peas`, `blackeye pea`, `black-eyed bean`, `blackeye bean`; FR `doliques à œil noir`, alias `haricot à œil noir`. `defaultDensity` is `null`; `unitMappings` is empty. | Keep the existing identity and aliases. They are already supported by the OQLF and the previous regional-pulse review. |
| Active forms | No forms are attached to `ingredient-ref-black-eyed-peas`. No active form owns the exact proposed ID or the state-qualified terms `canned black-eyed peas` / `pois à œil noir en conserve`. | Proposed form ID is unused. Keep all canned qualifiers on this parent’s form, not on a new ingredient row. |
| Legacy candidates | None names or aliases black-eyed peas, black-eyed beans, cowpeas, or a canned black-eyed-pea product. | No promotion or legacy cleanup is needed. |
| Research ledger before integration | One `ingredient_reference` record exists for `ingredient-ref-black-eyed-peas`; identity is `verified`, measurement is `not_yet_researched`, and substitution is `not_yet_researched`. Its sources are the existing OQLF and CFIA identity evidence. | No form record, CNF 3284 source, or measurement observation existed at review time. R72 integration added the form record, six source entries, and four source-specific observations; the reference-level measurement status remains unchanged. |
| Name collision | The base phrases remain owned by the active reference. The complete state-qualified English and French retailer phrases have no exact active reference, form, or legacy owner. | Keep the parent name broad. Put only canned phrases on the proposed form. |

This is a new **form** review, not a reopening of the black-eyed-pea identity decision. The [regional-pulse review](wp03-h-regional-pulses-urd-cowpea-lupini-review-20261011.md) resolved species and aliases but explicitly left forms unmodeled. The [residual form corpus audit](wp03-h-pulse-form-residual-corpus-audit-20261011.md) found no other pulse form demand beyond the rows it resolved; neither packet had the current Québec canned-product listing and CNF 3284 evidence assembled here.

## Picker projection

The search index groups forms under their existing ingredient reference. It adds each form label and match term to that reference’s search terms, but does not create another picker identity. The exact full normalized form phrase can return a form hint; a base query such as `black-eyed peas` continues to resolve the parent without asserting a canned state. See [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L63).

With the proposed terms, `canned black-eyed peas` and the current retailer phrase `pois à œil noir en conserve` would resolve to the existing black-eyed-pea row and identify the canned-with-liquid form. The form label would make the liquid state visible. A query for `black-eyed peas` or `doliques à œil noir` would continue to return the same parent without a form hint. The form’s `canned_with_liquid` / `with_liquid` values follow the active pinto form convention; the existing `canned_drained` and `canned_drained_rinsed` forms show that draining is modeled separately.

## Bundled recipe demand

A manifest scan covered all **114 recipe files and 1,123 ingredient rows**. It found zero whole-recipe-text matches for `black-eyed`, `black eyed`, `blackeye`, `cowpea`, `cow pea`, `doliques à œil noir`, `dolique à œil noir`, `haricot à œil noir`, or `pois à œil noir`, and zero ingredient rows linked to `ingredient-ref-black-eyed-peas`.

The four current pulse-linked rows already have exact forms:

| Row | Current ingredient | Existing form |
|---|---|---|
| `004#1` | `200 g dried azuki beans` | `ingredient-form-azuki-beans-dried` |
| `007#4` | `1 can pinto beans with liquid` | `ingredient-form-pinto-beans-canned-with-liquid` |
| `034#9` | `540 ml kidney beans, rinsed and drained` | `ingredient-form-kidney-beans-canned-drained-rinsed` |
| `105#1` | `2 cups dried yellow peas` | `ingredient-form-yellow-peas-whole-dried` |

These rows do not create black-eyed-pea demand. The frozen peas-and-carrots line belongs to its mixed-vegetable reference. The R71 frozen-shelled edamame form is also outside this candidate. The proposed form therefore has **no bundled recipe link**; product availability supports a picker form on its own.

## Québec French and product scope

OQLF lists `dolique à œil noir` and `haricot à œil noir` as preferred French terms for the *Vigna unguiculata* food identity and lists `black-eyed pea`, `cow pea`, and `cowpea` among the English terms. This supports the existing French reference display and keeps the pulse separate from garden peas and black beans. The entry was last updated in 1991, so its role here is terminology and identity rather than current retail availability. [S01]

Canadian French retailer wording corroborates the grocery name:

**Québec French naming confidence:** high for the base term (`dolique à œil noir` / `doliques à œil noir`) because OQLF supplies the preferred term and a Loblaws French listing uses it. Confidence is medium for the state-qualified form label: retailer listings use `pois à œil noir en conserve` and `Doliques à œil noir`, while `avec le liquide` is a descriptive extension supported by the ingredients and CNF wording rather than an exact package phrase.

- Walmart’s French page is headed `Pois à œil noir, Great Value`; its product description uses `pois à œil noir en conserve` and says to drain and rinse before serving. The ingredients are `Pois à œil noir, eau, sel, EDTA disodique`. [S02]
- Loblaws’ French canned-bean listing uses `Sans Nom Doliques à œil noir 540 ml`. [S03]

These are two retailer wording examples, with prices and availability subject to change. The Loblaws page was returned as a web-indexed category listing crawled about a year before this review, so it supports terminology only, not availability today. Walmart’s French phrase `pois à œil noir en conserve` is a product-page description rather than an OQLF-preferred term. The proposed label preserves OQLF’s base term and adds a descriptive canned/liquid qualifier. No Québec package phrase exactly equivalent to `avec le liquide` was found; the scope comes from the ingredient statement and CNF description, not an asserted verbatim product label.

Walmart’s English listing confirms the same current canned product, Canadian manufacture from domestic and imported ingredients, and ingredients `Black-eyed peas, water, salt, disodium EDTA`. Its product description says the can should be drained and rinsed before serving. This supports a package state containing liquid and distinguishes it from the later drained/rinsed state; it does not identify a bundle recipe or a generic recipe instruction. [S04]

## Numeric, conversion, and substitution evidence

Health Canada CNF food code **3284** is explicitly `Black-eyed peas (cowpeas, crowder, southern), common, mature seeds, canned, plain, solids and liquid`; the French title says `Haricots à oeil noir (dolique), communs, grains mûrs, conserve, nature, solides et liquide`. Its serving-size page gives: [S05]

| CNF source quantity | Source-observed weight |
|---:|---:|
| 100 mL | 101.4 g |
| 125 mL | 126.8 g |
| 175 mL | 177.5 g |
| 250 mL | 253.6 g |

CNF also lists `total refuse 0%` for this coded item. The source page’s metadata says it was modified 2019-03-01; it remains accessible as Health Canada’s serving-size record, but these figures are not a 2026 retail can assay. If preserved, classify them as **source-specific serving-weight observations for CNF 3284, canned plain, solids and liquid**. The values do not establish a general density: preserve the source mL units and individual rounded weights, add no `g/ml` value or app unit mapping, and do not convert a can’s 540 mL net contents to bean mass. The 0% refuse value belongs to the CNF item as coded; it does not mean that the packing liquid cannot be drained, and it must not be applied to a drained form.

The CNF code is an exact source match for the proposed canned-with-liquid state, not for canned/drained/rinsed beans. Walmart explicitly treats draining/rinsing as a preparation step after opening. No reviewed source provides drained mass, solids-to-liquid ratio, a drained volume weight, a can-to-drained yield, or a dry-to-canned/cooked conversion.

The federal food-purchase guide describes canned pulses as precooked and ready to use, while noting they may be softer than dried, soaked, then cooked pulses. That is qualitative preparation context, not a black-eyed-pea substitution ratio or a direction to replace a particular recipe line. No cross-pulse or dry-to-canned substitution rule is proposed. [S06]

## Source table

| ID | Source and locator | Supports and limits |
|---|---|---|
| **WP03-H-BLACKEYE-CAN-R72-20261013-S01** | Office québécois de la langue française, [dolique à œil noir (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082985/dolique-a-oeil-noir), accessed 2026-10-13; entry last updated 1991. | Preferred French terms, English equivalents, and *Vigna unguiculata*. Identity/terminology only, not canned-state wording. |
| **WP03-H-BLACKEYE-CAN-R72-20261013-S02** | Walmart Canada, [Pois à œil noir, Great Value — French page](https://www.walmart.ca/fr/ip/Pois-il-noir-Great-Value/10275357), accessed 2026-10-13; product description, ingredient list, and can handling. | Current French product wording `pois à œil noir en conserve`, peas/water/salt/EDTA ingredient statement, and drain/rinse direction. Retailer product information can change and is not a general measurement source. |
| **WP03-H-BLACKEYE-CAN-R72-20261013-S03** | Loblaws Québec, [canned beans listing](https://www.loblaws.ca/fr/fr/alimentation/garde-manger/produits-en-conserve-et-marin-s/haricots-en-conserve/c/29882), accessed 2026-10-13; web index reports crawling it about a year before review; listing for `Sans Nom Doliques à œil noir 540 ml`. | Retailer French wording and declared package volume. Indexed/dynamic listing; 540 mL is not drained bean volume or mass and the page does not establish availability today. |
| **WP03-H-BLACKEYE-CAN-R72-20261013-S04** | Walmart Canada, [Great Value Black-Eyed Peas — English page](https://www.walmart.ca/en/ip/Great-Value-Black-Eyed-Peas/10275357), accessed 2026-10-13; product description, contents, and specifications. | Current canned product; ingredients include water; says drain/rinse before serving and identifies Canadian manufacture from domestic/imported ingredients. Same product as S02, not independent product corroboration. |
| **WP03-H-BLACKEYE-CAN-R72-20261013-S05** | Health Canada, [CNF serving portion, food code 3284](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3284), accessed 2026-10-13; English/French food description, serving weights, refuse, and page metadata. | Exact canned, plain, solids-and-liquid CNF item and source-specific values in the table. Page metadata reports modified 2019-03-01. Does not establish a current retail product’s drained mass or can yield. |
| **WP03-H-BLACKEYE-CAN-R72-20261013-S06** | Department of National Defence, [Food Quality Specifications — Legumes, English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-23-2018-eng.pdf), pp. 1–3, dated 2018-04-01; [French edition](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-23-2018-fra.pdf), pp. 2–3. | Separates canned black-eyed peas from dried black-eyed peas and gives qualitative canned-pulse preparation/texture context. Procurement specification, not a household conversion or substitution formula. |

## Integrated scope

Added only `ingredient-form-black-eyed-peas-canned-with-liquid` to the active forms file and a form ledger record with the four CNF source observations. The parent identity, its existing aliases, and recipe files remain unchanged. No recipe row was linked; no canned/drained/rinsed form, density, unit mapping, 540 mL package yield, or substitution rule was added. The seed package was normalized and the generated ingredient catalog refreshed. No app tests or emulator checks were run under the database-JSON-only rule.

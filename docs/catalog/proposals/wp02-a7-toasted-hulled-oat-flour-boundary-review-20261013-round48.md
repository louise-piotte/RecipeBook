# WP02 A7 R48: toasted hulled oat flour boundary review

**Disposition: hold, unallocated.** CerealVeneta's English page names **Toasted hulled oat flour** and describes an oat-flour semi-finished product that is gently heat-treated and milled with liquid nitrogen [S01]. Its French product page is indexed as **Farine d’avoine décortiquée toastée** and describes `torréfaction douce` [S02]. These are source-specific bilingual names, but the pages do not establish Canadian or Québec availability or a Québec product display. The product sheet requires company details. Keep this product out of active references and do not merge it into the existing Québec-mill thermal-grade candidate. No shared catalog, ledger, plan, roadmap, or integration README was changed.

## Candidate and archive check

This review covers CerealVeneta's specific product title **Toasted hulled oat flour / Farine d’avoine décortiquée toastée**. It is not the Castle Oat 80 **roasted oat malt flour** accepted as an oat-malt identity, and it is not Les Moulins de Soulanges' **Pregelatinized Oat Flour / Farine d’Avoine Prégélatinisé** page, whose body also uses roasted-oat wording while its title specifies pregelatinized flour [S05, S06]. The latter remains a separate ledger-only `candidate-oat-flour-thermal-grade` because its process/name conflict is unresolved. Do not merge these products or infer a shared process from their general oat-flour wording.

The exact candidate phrases and variants `toasted hulled oat flour`, `hulled oat flour`, `toasted oat flour`, `oat flour, toasted`, `farine d’avoine décortiquée toastée`, `farine d’avoine décortiquée torréfiée`, `farine d’avoine toastée`, and `farine d’avoine torréfiée` were checked against current references, forms, legacy-import identities, ledger keys, the open A7 plan, and prior proposals. No exact product owner, legacy identity, or exact ledger candidate exists. Prior documentation does include the broader Moulins thermal-grade hold and the separate Castle Oat 80 identity; neither reviewed this CerealVeneta hulled-oat product. No prior R48 file or source-ID-prefix collision was found.

## English and Québec French boundary

CerealVeneta's English title explicitly includes `hulled`, while its French product title is `Farine d’avoine décortiquée toastée` [S01, S02]. The French page's body also uses `farine d’avoine décortiquée et torréfiée`; retain the title as the source display and do not add the body wording as an alias. The English page says the flour is intended for plant beverages and bakery products, and describes heat treatment and milling with liquid nitrogen [S01]. The public pages do not give a grain specification, the proportion of oat components retained, or a Canadian product label.

The OQLF GDT supports the base Québec French name `farine d’avoine` and defines oat flour as flour ground from oat kernels, whole or otherwise [S03]. It does not establish a Québec name for this toasted product or make `décortiquée`, `toastée`, and `torréfiée` interchangeable for its display. OQLF's separate `avoine découpée` term means steel-cut oats, kernels cut into pieces; do not use it as an alias for hulled oats [S04].

The Québec-mill oat product remains a separate unresolved case. Les Moulins de Soulanges currently titles its bilingual pages `Pregelatinized Oat Flour / Farine d’Avoine Prégélatinisé`, while the page body calls the product roasted oat flour [S05, S06]. Those pages do not mention CerealVeneta, hulled oats, or the liquid-nitrogen milling process. Keep `candidate-oat-flour-thermal-grade` limited to that naming conflict. No Québec retail product or terminology source for CerealVeneta's exact hulled-and-toasted product was found in this review.

## Current ownership and picker implications

The current package snapshot has 1,369 active references and 100 forms; the legacy-import file has 64 candidates and the research ledger has 1,699 records. No active term, form term, legacy candidate, or ledger key exactly owns the product-specific candidate phrases. Relevant current owners are:

| Current owner | Exact current names | Boundary and data |
| --- | --- | --- |
| `ingredient-ref-oat-flour` | `oat flour` / `farine d’avoine` | Generic oat flour; no aliases, density, unit mappings, or attached form. |
| `ingredient-ref-oat-groats` | `oat groats` / `gruau d’avoine entier` | Whole hulled oat kernels, not a toasted flour. |
| `ingredient-ref-scottish-oatmeal` | `Scottish oatmeal` / `gruau écossais`; aliases `Scotch oatmeal`, `Scottish oats` | Narrow coarse meal identity, not a toasted flour. |
| `ingredient-ref-roasted-oat-malt-flour` | `roasted oat malt flour` / `farine de malt d’avoine torréfiée` | Castle Oat 80 product; malted-oat identity, not ordinary toasted hulled oat flour. |
| `candidate-oat-flour-thermal-grade` (ledger only) | Moulins thermal-grade candidate | Holds the separate Québec page's pregelatinized/roasted wording conflict; not a picker row and not this CerealVeneta product. |

`IngredientSearch.kt` first matches complete normalized word phrases within reference/form terms, then falls back to substring matching. The exact English and French candidate queries currently return no results. With a hypothetical identity using only the source titles, `toasted hulled oat flour`, `hulled oat flour`, and `farine d’avoine décortiquée toastée` would select it. Broad `oat flour` and `farine d’avoine` would then return both the existing generic flour and the new row. The shorter phrase `toasted oat flour` would still return no result because `hulled` interrupts the phrase; do not add it as an alias. Likewise, do not add `farine d’avoine torréfiée` from the page body as a Québec alias. Holding the candidate leaves all picker results unchanged.

## Bundled recipe demand

I scanned all 114 manifest-listed recipe files and 1,123 ingredient rows, including complete file text and ingredient reference IDs. The candidate's English/French titles and listed variants had no recipe-text or ingredient-row hits. No recipe row links to `ingredient-ref-oat-flour`, `ingredient-ref-oat-groats`, `ingredient-ref-scottish-oatmeal`, or `ingredient-ref-roasted-oat-malt-flour`. The bundle has no oat-flour recipe line or demand for a new identity or recipe link.

## Measurement and substitution limits

The manufacturer mentions plant beverages and bakery applications but provides no recipe quantities, household measure, density, unit mapping, yield, or numeric process setting on the public page [S01, S02]. The product sheet is gated behind a form requesting company and email details [S01]. Do not infer a liquid-to-flour ratio from the plant-beverage use case or transfer measurements from generic oat flour, Scottish oatmeal, oat groats, the Castle oat-malt product, or the separate Moulins product.

No exact-form recipe or controlled source establishes substitution between this product and generic oat flour, roasted oat malt flour, rolled oats, or Scottish oatmeal. Add no form, measure, density, mapping, conversion, yield, recipe link, or substitution.

## Source register

| Source ID | Source and locator | What it supports | Limits |
| --- | --- | --- | --- |
| `WP02-A7-TOASTED-HULLED-OAT-FLOUR-20261013-R48-S01` | CerealVeneta, [Toasted hulled oat flour](https://cerealveneta.it/en/semi-finished/toasted-hulled-oat-flour/), product title and description, lines 51–59; application sections, lines 60–82; product-sheet form, lines 102–110. | Exact English product title; oat flour is gently heat-treated and milled with liquid nitrogen; stated uses include plant beverages and bakery products. | Italian B2B manufacturer page, identifies itself as a semi-finished product; no Canadian/Québec market, ingredient statement, detailed hull/grind specification, temperature/time process parameters, household measure, density, or substitution. Product-sheet download asks for company and email. |
| `WP02-A7-TOASTED-HULLED-OAT-FLOUR-20261013-R48-S02` | CerealVeneta, [Farine d’avoine décortiquée toastée](https://cerealveneta.it/fr/semi-finis/farine-davoine-decortiquee-toastee/), indexed product title and description; indexed page last crawled three months before this review. | Source French title and wording about gentle roasting, milling with liquid nitrogen, and plant-beverage use. | Direct page fetch returned a cache miss during this review; the indexed manufacturer page is not a Québec label or OQLF ruling, and it does not provide a consumer product sheet or numeric culinary data. The body also uses `torréfiée`; this review does not adopt that as a Québec alias. |
| `WP02-A7-TOASTED-HULLED-OAT-FLOUR-20261013-R48-S03` | OQLF, [farine d’avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497598/farine-davoine), definition and preferred term, lines 19–54; last updated 2017. | Supports Québec French `farine d’avoine` for flour ground from oat kernels, whole or otherwise, with English equivalents `oatmeal` and `oat flour`. | Does not define hulled or toasted oat flour or a process-specific Québec display. |
| `WP02-A7-TOASTED-HULLED-OAT-FLOUR-20261013-R48-S04` | OQLF, [avoine découpée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26574686/avoine-decoupee), definition and preferred term, lines 19–54; last updated 2024. | Defines `avoine découpée` as steel-cut oat kernels, supporting separation from the manufacturer's `avoine décortiquée` wording. | Concerns cut whole kernels, not hulled oats or a flour product. |
| `WP02-A7-TOASTED-HULLED-OAT-FLOUR-20261013-R48-S05` | Les Moulins de Soulanges, [Pregelatinized Oat Flour](https://moulinsdesoulanges.com/language/en/pregelatinized-oat-flour/), title and body, lines 83–127; Québec address at lines 149–156. | Current Québec-mill page titles its product pregelatinized oat flour but also uses roasted-oat wording in its body. | Does not name hulled oats or CerealVeneta's flour; its separate title/body conflict remains unresolved and is not evidence of product equivalence. |
| `WP02-A7-TOASTED-HULLED-OAT-FLOUR-20261013-R48-S06` | Les Moulins de Soulanges, [Farine d’Avoine Prégélatinisé](https://moulinsdesoulanges.com/language/fr/farine-davoine-pregelatinise/), title and body, lines 82–109; Québec address at lines 131–138. | Current Québec French page title and its separate use of `Farine d’Avoine Torréfiée` in the body. | Does not name hulled oats or CerealVeneta's product; source wording conflict does not establish a synonym for the candidate. |

## Next action

Reopen this exact product only if a current Canadian/Québec supplier or bilingual package establishes its local product display and a product sheet clarifies the oat input and process. Until then, keep it unallocated and do not add a new active reference, alias, ledger candidate, form, numeric value, recipe link, conversion, yield, or substitution. If later accepted, keep it separate from the generic Moulins thermal-grade hold and Castle Oat 80; research measurements only if an exact recipe or product specification supports them.

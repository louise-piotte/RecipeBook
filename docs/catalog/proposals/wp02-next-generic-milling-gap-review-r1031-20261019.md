# WP02 Section A7 R1031: wheat bran flour identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This review changes only this Markdown proposal; it does not edit shared catalog JSON, the research ledger, plan, roadmap, recipes, generated files, or tests.
- **Open-plan anchor:** WP02 Section A7 remains open for “other grain meals (including the unresolved wheat-meal candidate) and milling products” ([catalog plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** Generic culinary **wheat bran flour**, distinct from the recently integrated barley bran flour and the existing unqualified wheat bran.
- **Recommendation:** Add one identity-only **FLOUR_AND_STARCH** reference, **wheat bran flour / farine de son de blé**. The exact bilingual name is supported by OQLF. Add no aliases, forms, reusable measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. Do not research or add brands, product lines, flavours, SKUs, or retailer variants. Commercial-product counts do not add ingredient diversity.

## Identity boundary and bilingual naming

OQLF’s Grand dictionnaire terminologique records **farine de son de blé** as the preferred French term and **wheat bran flour** as its English equivalent in the food/flour domain. This supports both proposed display names directly; the French display does not need to be provisional. The entry supplies terminology, not a milling specification or a claim that every ground-wheat-bran product has one universal particle size. [S01]

The Canadian Grain Commission describes a laboratory wheat-milling flow in which a rotary sifter separates “bran flour” from residual bran. Khalid, Manthey, and Simsek also study centrifugal milling of wheat bran to produce fine bran flour. Those sources show that “bran flour” is used for bran-related milling material, but they describe different process contexts and do not establish a shared grade or physical cutoff. A food study uses crushed wheat bran powder in steamed buns. Together these sources support a generic human-food milling identity named in Québec terminology while leaving its exact production method and granularity unspecified. [S02–S04]

Keep the proposed row limited to this source-named ingredient identity. Do not define a sieve size, a percentage of endosperm, a universal recovery process, or an equivalence rule for every product called bran flour or bran powder.

Keep it separate from:

- **ingredient-ref-wheat-bran — wheat bran / son de blé.** This is the existing unqualified bran identity. Preserve its name, source ownership, observations, and recipe-specific substitution finding. Do not add **wheat bran flour**, **ground wheat bran**, or **wheat bran powder** as aliases to it.
- **ingredient-ref-barley-bran-flour — barley bran flour / farine de son d’orge**, added at R1028, and the existing oat, corn, rice, and Tartary-buckwheat bran-flour identities. These remain grain-specific references; none of their measures, findings, or source claims transfer to wheat bran flour. See the [R1025 oat bran flour proposal](wp02-next-generic-milling-gap-review-r1025-20261019.md) and [R1028 barley bran flour proposal](wp02-next-generic-milling-gap-review-r1028-20261019.md).
- Wheat flour and whole-wheat flour identities, which are wheat-kernel flour rather than a flour made from the bran fraction.
- Species-qualified bran identities such as einkorn, emmer, Khorasan, and spelt bran; wheat germ; bran-germ mixtures; middlings; and composite or formulated foods containing bran. Preserve their names and evidence. Do not claim mutually exclusive boundaries under every milling convention.

The OQLF term supports **farine de son de blé** as the preferred French display. Keep both alias arrays empty: the exact English/French pair is already established, while the sources do not justify broader synonyms or process-based aliases. In particular, do not merge the exact French compound into the existing **son de blé** reference.

## Ownership and recipe-demand audit

Read-only audit of the live package and catalog files on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,041** active references. No exact owner or alias was found for the ID **ingredient-ref-wheat-bran-flour**, English **wheat bran flour**, or French **farine de son de blé**. Existing nearby identities include wheat bran, Khorasan bran, and cereal-specific bran flours including barley, oat, corn, rice, and Tartary buckwheat. | A new exact identity is unowned. Preserve all current rows, aliases, names, and evidence. |
| Ingredient forms | **205** forms. No form owns the proposed ID or exact candidate name; the existing wheat-bran row also has no form. | Add no form. The proposal is a separately named milling identity, not a cooking-state form. |
| Research ledger | **2,446** records. No exact candidate record, R1031 source ID, or reviewed source URL below was found. The existing **ingredient-ref-wheat-bran** record is identity-verified with measurement and substitution states **researched_supported**; it owns five sources and three source-bounded measure observations. Its only substitution finding is an optional bran-or-germ line in one named pancake recipe. | If accepted, create a separate record and source IDs. Preserve all wheat-bran evidence and keep the existing one-recipe finding on wheat bran. Do not copy its state, observations, or substitution finding to the proposed flour. |
| Existing wheat-bran evidence | King Arthur’s general chart lists wheat bran at **1/2 cup = 32 g**; its Banana Pancakes list optional wheat bran at **1/4 cup = 16 g** or wheat germ at **1/4 cup = 28 g**; Bob’s Red Mill lists **1/4 cup = 13 g** for its named Wheat Bran product. The existing ledger explicitly limits the recipe alternative to that recipe and the manufacturer amount to that product. | Preserve these three observations on wheat bran with their current source limits. None measures wheat bran flour. The OQLF record for **son de blé** and the Canadian French product list also remain on the existing wheat-bran owner. |
| Legacy import identities | **55** candidates. No exact English/French wording or proposed ID was found. | No legacy promotion, merge, or alias transfer is proposed. |
| Bundled recipes | Scanned all **114** manifest-listed recipe files and **1,123** ingredient rows. No file or ingredient row matched the candidate ID, **wheat bran flour**, **farine de son de blé**, or spelling variants. The scan also found no wheat-bran term in the current recipe bundle. | There is no bundled recipe demand, recipe quantity, or recipe link supporting this row. |
| Forms, substitutions, and yields | No candidate-specific active form, global or contextual substitution, package-yield entry, density, or unit mapping was found. | Add none. Keep all active behavior for adjacent ingredients unchanged. |
| Proposal/source history | The R1031 source-ID prefix and the four source URLs below are not already in the proposal archive or ledger. Existing R1025 oat bran flour and R1028 barley bran flour reviews do not own this wheat identity. | Use proposal-local source IDs. Preserve those adjacent proposals and their evidence. |

The source-specific measurements and the pancake substitution on the wheat-bran row remain unchanged; their inclusion here documents the ownership boundary only.

## Numeric and substitution limits

No reusable household mass-volume measure, density, unit mapping, conversion, cooking yield, or general recipe instruction for wheat bran flour was found in the reviewed sources or the targeted exact-name measure search.

- The Canadian Grain Commission reports a **74% flour extraction rate** kept constant for its wheat-line evaluation. This is the laboratory mill’s flour extraction setting, not a wheat-bran-flour yield or kitchen measurement. [S02]
- Khalid et al. tested bran tempering levels of **10%–16%**, rotor speeds of **6,000–15,000 rpm**, and feed rates of **6–12 g/min**. Their reported **52%–59%** fine-particle fraction under selected settings is specific to their milling setup and samples. These are not recipe measures, a general particle-size threshold, or a catalog yield. [S03]
- Tian et al. sieved crushed wheat bran at **80, 120, and 200 mesh** and added the resulting powder to steamed-bun flour at **10%, 20%, and 30%**. The reported sensory outcome for a particular 10%/200-mesh sample applies only to that study. These mesh sizes and formula additions do not establish a universal flour grade or replacement ratio. [S04]
- The wheat-bran chart and recipe weights and Bob’s Red Mill label amount listed in the ownership audit belong to unqualified wheat bran or that named commercial product. Keep each on its current owner; do not transfer any of them to wheat bran flour.

If accepted, set measurement research to **researched_no_supported_value**, keep density null and unit mappings empty, and add no reusable measurement observation. Set substitution research to **blocked_pending_evidence**: the food studies show particular additions/formulas, but they do not establish a reusable global rule or sufficiently bounded contextual substitution. Keep study proportions and outcomes attached only to their source contexts; add no forms, recipe links, conversions, yields, or active rules.

## Source register

The source IDs below are proposal-local. No shared ledger record is added by this review.

| Source | Source and locator | What it supports and limits |
|---|---|---|
| **S01 / WP02-A7-WHEAT-BRAN-FLOUR-R1031-20261019-S01** | Office québécois de la langue française, [farine de son de blé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497465/farine-de-son-de-ble), preferred term, English equivalent, and domain; last updated 1984. | Directly supports the exact French preferred term **farine de son de blé**, English equivalent **wheat bran flour**, and food/flour domain. It does not define processing, particle size, composition, household measure, or substitution behavior. |
| **S02 / WP02-A7-WHEAT-BRAN-FLOUR-R1031-20261019-S02** | Canadian Grain Commission, [Milling for quality evaluation of new wheat lines](https://www.canada.ca/en/grain-commission/services/science/research-papers-reports/milling-evaluation-new-wheat-lines.html), lab-milling flow and extraction-rate description. | Describes a rotary sifter separating bran flour from residual bran. Its 74% flour extraction rate is held constant for wheat-line comparison and is not a bran-flour yield or measure. This government milling source supports the milling vocabulary and context only. |
| **S03 / WP02-A7-WHEAT-BRAN-FLOUR-R1031-20261019-S03** | Khalid, Manthey, and Simsek, [“Centrifugal milling of wheat bran”](https://doi.org/10.1002/cche.10037), *Cereal Chemistry* 95(2) (2018), 330–341, abstract; DOI 10.1002/cche.10037. | Primary milling study that investigates producing fine bran flour from wheat bran and reports experiment-specific processing settings and particle fractions. These parameters and results do not define a universal ingredient grade, home process, measure, or yield. |
| **S04 / WP02-A7-WHEAT-BRAN-FLOUR-R1031-20261019-S04** | Tian et al., [“Effect of different particle size and amount of bran flour on the quality and nutritional components of steamed bran”](https://www.spgykj.com/en/article/doi/10.13386/j.issn1002-0306.2015.17.011), *Science and Technology of Food Industry* (2015), 17:96–99, abstract; DOI 10.13386/j.issn1002-0306.2015.17.011. | Primary food study using crushed wheat bran powder in steamed buns. Its sieves, additions, sample results, and formula are study-specific. It supports human-food use of ground wheat bran, not a standard grind, household measure, or general replacement ratio. |

## Commercial queue scope

The named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead in the A7 history is product-only. Mark it **out of scope** and stop that line because another commercial-product count does not add ingredient diversity. Preserve the historical review and existing branded entries with their own product-scoped evidence. The unresolved generic wheat-meal question remains separate and is not resolved here. No brand, product-line, flavour-family, SKU, or retailer-variant research was performed for R1031.

## Proposed minimal data

If accepted, add only this reference row:

| Field | Proposed value |
|---|---|
| ID | **ingredient-ref-wheat-bran-flour** |
| English display | **wheat bran flour** |
| French display | **farine de son de blé** — OQLF preferred term |
| Category | **FLOUR_AND_STARCH** |
| English/French aliases | Empty |
| Default density / unit mappings | **null** / empty |
| Forms, reusable measurements, recipe links, conversions, yields, active substitutions | None |
| Proposed ledger states | Identity **verified**; measurement **researched_no_supported_value**; substitution **blocked_pending_evidence** |

This adds one generic wheat milling identity with exact bilingual Québec terminology and documented food use. Keep it distinct from unqualified wheat bran and preserve all existing source-specific values on their current owners. This file is proposal-only; no tests or builds were run.

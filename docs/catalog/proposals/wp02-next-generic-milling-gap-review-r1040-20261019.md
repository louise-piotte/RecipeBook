# WP02 Section A7 — next generic milling gap review (R1040)

**Date:** 2026-10-19  
**Disposition:** Bounded hold for generic sorghum meal. Proposal only; this review changes this Markdown file only. No catalog JSON, ledger, plan, roadmap, recipe, or generated file was edited, and no tests were run.

## Candidate and decision

Review the unresolved, generic **sorghum meal** candidate already present in the ledger. It is a crop-qualified culinary term and FAO documents its use in porridge, but the general milling description does not establish one transferable boundary distinct from the active sorghum flour, grits, and semolina identities. The existing Québec French terms are also already owned by those adjacent references. Keep the existing `candidate-sorghum-meal` ledger record unresolved; add no active reference, alias, form, source ownership transfer, recipe link, measurement, or substitution.

The open-plan anchor is [WP02 Section A7, other grain meals and milling products](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290). The plan has already marked the named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead out of scope; generic wheat meal remains a separate unresolved question. This review does not reopen the Anson Mills product lead.

## Identity and bilingual boundary

FAO’s general processing chapter says dry cereal milling usually produces “meal (coarse or fine flour)” and describes reducing the edible grain fraction to coarse grits or fine flour. It also describes bran/offal removal and multiple milling routes. This establishes a broad milling use for meal, but not a stable consumer definition that distinguishes this candidate from the active sorghum-flour, sorghum-grits, and sorghum-semolina references. The processing source is already owned by the active sorghum-grits ledger record as `WP03-SORGHUM-GRITS-20261013-S03`; preserve it there and do not transfer its claim or ownership. [S02]

FAO’s recipe annex independently names dry sorghum meal in fermented bogobe and gives sorghum-meal formulas for non-fermented bogobe. This is direct generic human-food use. The recipe terms and formulas support use of the phrase; they do not define a universal grain preparation, particle-size cutoff, regional label, or standardized product. [S01]

The active English/French ownership around the candidate is:

- `ingredient-ref-sorghum-flour`: **sorghum flour / farine de sorgho**;
- `ingredient-ref-sorghum-grits`: **sorghum grits / gruau de sorgho**;
- `ingredient-ref-sorghum-semolina`: **sorghum semolina / semoule de sorgho**;
- `ingredient-ref-sorghum-bran`: **sorghum bran / son de sorgho**;
- `ingredient-ref-sorghum-starch`: **sorghum starch / amidon de sorgho**; and
- `ingredient-ref-grain-sorghum`: **grain sorghum / sorgho à graine**.

The OQLF base-crop entry supports **sorgho** for sorghum. Its `gruau de sorgho` terminology is already attached to the active grits identity (current ledger source `WP03-SORGHUM-GRITS-20261013-S01`); it must not be reassigned to meal. The active semolina identity owns `semoule de sorgho`. The Codex sorghum-flour standard, already recorded under `WP02-S33`, expressly excludes grits and meal from its flour standard; that exclusion keeps the standard’s scope narrow but does not provide a meal specification or a Québec meal name. [S03–S05]

No exact, non-duplicative Québec French display for generic sorghum meal is established by these sources. Do not invent a new French term or alias. Keep the candidate separate from whole sorghum, bran, starch, flour, grits, and semolina while its own consumer-facing milling and French boundaries remain unresolved.

## Live ownership and recipe-demand audit

Read-only audit of the bundled package and catalog ledger on 2026-10-19:

| Surface | Current state | R1040 finding and handling |
|---|---:|---|
| Ingredient references | **2,046** | No active `sorghum meal` reference, ID, or exact English/French alias. Preserve all adjacent owners listed above, plus `ingredient-ref-puffed-sorghum` (**puffed sorghum / sorgho soufflé**). |
| Ingredient forms | **205** | No sorghum-meal form. Sorghum forms belong to `ingredient-ref-grain-sorghum`; do not transfer them. |
| Research ledger | **2,451 records** | Exact existing record `candidate-sorghum-meal` has `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. It has five existing sources and an unresolved decision. Keep that record and its sources unchanged; add no duplicate candidate or source in this proposal. |
| Legacy import identities | **55 candidates** | No sorghum meal wording, sorghum-related candidate, or proposed meal ID was found. No legacy promotion or alias transfer. |
| Recipe corpus | **114 files / 1,123 ingredient lines** | No meal/`gruau de sorgho`/`semoule de sorgho` hit and no sorghum wording in any bundled recipe. No recipe demand, amount, or link supports adding the candidate. |
| Forms, substitutions, package yields | **0 global rules / 0 contextual rules / 1 yield record** | No meal-specific form, substitution, or yield. The one existing package-yield row is not sorghum-related. Add none. |

The existing candidate’s five source IDs are `WP02-A7-SORGHUM-MEAL-20261013-R54-S01` through `S05`. The FAO annex used here is new proposal-local evidence only; the existing candidate record is not changed.

## Numeric and substitution limits

FAO’s non-fermented bogobe recipe gives about **250 g sorghum meal** with about **1 litre water**; a second Botswana bogobe formula lists **300 g coarsely ground dehulled sorghum meal** with **1,500–1,800 ml water**. These are formula quantities for their respective recipes, not household portions, package weights, cup weights, a generic density, or interchangeable ratios. The fermented bogobe method specifies water but no mass of meal. Keep every amount and texture preference attached to its cited recipe only. [S01]

No generic household measure, density, unit mapping, dry-to-cooked conversion, preparation yield, or measure-transfer evidence was found. Preserve the existing candidate state `researched_no_supported_value`; add no measurement observation or package yield. FAO’s dish methods do not establish substitution between sorghum meal and flour, grits, semolina, whole sorghum, or another grain. Preserve `researched_no_supported_substitute`; add no global or contextual substitution rule or recipe-line substitution link.

## Commercial-only queue and evidence scope

The existing R54 candidate includes two Nu Life Market manufacturer product pages (`S01–S02`) and a Dempsey distributor product-line page (`S03`). Mark these product-only leads **out of scope for R1040**: counts of commercial products, grind options, brands, and distributor listings do not add generic ingredient diversity. Stop that product line here. Preserve all three existing ledger sources and their product-specific claims on `candidate-sorghum-meal`; do not generalize their product grinds, ingredient preparation, package sizes, measures, or performance claims.

The candidate’s existing Statistics Canada tariff source (`S04`) is a customs classification, not a consumer milling specification or kitchen measure. Its existing Québec supplier-list source (`S05`) is not a meal-specific generic term source and is not pursued here. Preserve both sources and their original scope. The separately queued Anson Mills named wheat-meal product lead is also out of scope because commercial-product counts do not add ingredient diversity; preserve its historical evidence and do not research it further.

## Minimal proposal

**Hold.** Make no shared catalog or ledger data change. Retain `candidate-sorghum-meal` and its five existing source records exactly as they are. Add no active reference, French display, alias, form, density, unit mapping, observation, recipe link, conversion, yield, or substitution.

Reopen only if generic evidence establishes a durable, food-facing meal boundary distinguishable from the existing sorghum flour/grits/semolina owners and a non-conflicting Québec French name. The open-plan A7 review otherwise remains open.

## Sources

| Source | Locator | Claim used and limits |
|---|---|---|
| **S01 / proposal-local `WP02-A7-R1040-S01`** — FAO, *Sorghum and millets in human nutrition*, [Annex: Some recipes based on sorghum and millets](https://www.fao.org/4/t0818e/t0818e0k.htm). | Bogobe recipes, especially lines 95–121. | Names sorghum meal as a food ingredient in fermented and non-fermented bogobe; provides recipe-specific amounts and handling only. Does not establish a general measure or a universal meal grade. |
| **S02 / existing `WP03-SORGHUM-GRITS-20261013-S03`** — FAO, *Sorghum and millets in human nutrition*, [Chapter 3: Processing](https://www.fao.org/4/T0818e/T0818E09.HTM). | Traditional and industrial milling; see especially the meal/coarse-or-fine-flour description and grain-fraction processing. | Generic milling breadth and variability. This remains attached to the sorghum-grits record; no source or claim is moved. |
| **S03 / existing `WP03-SORGHUM-GRITS-20261013-S01`** — OQLF, [gruau de sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18062438/gruau-de-sorgho). | Processed cereal terminology record. | Supports the currently owned French wording only; the existing row owns it as sorghum grits. It is not transferred to meal. |
| **S04 / existing `WP03-MILO-GRAIN-20261012-S01`** — OQLF, [sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho). | Preferred French crop term and English equivalent. | Supports the base crop name, not a meal compound. Keep the source under its existing grain owner. |
| **S05 / existing `WP02-S33`** — Codex Alimentarius, [Standard for Sorghum Flour CXS 173-1989](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+173-1989%2FCXS_173f.pdf). | Product definition and standard scope. | Defines the scope of sorghum flour and excludes meal/grits from that standard. Does not define meal or supply a kitchen measure. Keep this source under the sorghum-flour owner. |
| Existing `WP02-A7-SORGHUM-MEAL-20261013-R54-S04` — Statistics Canada, [Customs Tariff 2025, Section II: Vegetable Products](https://www150.statcan.gc.ca/n1/pub/65-209-x/2025001/section2-eng.htm). | Chapter 11, heading 11.03 cereal table and note 3. | Existing source classifies groats and meal as fragmented cereal products for tariff purposes. It is not a consumer milling standard. Preserve it on the unresolved candidate. |

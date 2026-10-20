# WP02 Section A7 R1083 — barley meal add-vs-hold review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated. The recommendation was accepted: the existing candidate remains unresolved and inactive, with the two new historical recipe sources and an updated boundary decision recorded in the ledger.
- **Plan context:** Section A7 remains open for other grain meals and milling products, including the unresolved wheat-meal candidate ([plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Candidate:** The existing `candidate-barley-meal`, not a newly selected gap. This review completes one bounded add-vs-hold assessment; it does not search for another ingredient.
- **Scope:** Determine whether primary culinary evidence supports a transferable generic barley-meal identity and whether the existing boundary and Québec French wording can support an active row.

## Recommendation

**Keep `candidate-barley-meal` unresolved and inactive.** The evidence now establishes generic human culinary use: a 1905 cookbook uses fresh barley meal for griddle cakes, and a Manx recipe corpus transcribes a barley-meal bonnag recipe. The current U.S. eCFR also gives a specific milling definition for barley meal within a soluble-fiber health-claim rule. These sources close the question of whether the term has ever named a human food ingredient; they do not establish one transferable contemporary catalog class distinct from whole barley flour and barley grits, or a supported Québec French display.

Existing A7 evidence also records different Canadian product-specific uses: one named whole-barley meal is described as crushed and ground across a fine-to-coarse range, while one steel-cut barley product calls cross-cut pieces “barley meal or grits.” Keep those statements limited to their cited products. The generic historical recipes and claim-rule definition do not resolve that boundary or make either product’s meaning transferable.

For Québec French, the OQLF directly pairs `farine d’orge` with `barley flour`; that term is already owned by the active barley-flour row. `farine d’orge entière`, `gruau d’orge`, and `semoule d’orge` are also already owned by distinct barley rows. No reviewed source establishes a standalone Québec French display for barley meal. Do not promote `orge moulue` or any other descriptive construction to a preferred term or alias without direct terminology or standalone-product evidence.

This is a boundary hold, not a finding that barley meal lacks generic culinary use. Reopen only if a broadly applicable source distinguishes a ground meal class from whole barley flour and grits, and a Québec-facing source supports a French display that does not collide with existing references. Preserve the existing candidate and every source-specific record until that review.

## Evidence and limits

| Source | Exact locator | What it supports | Limits |
| --- | --- | --- | --- |
| [*The Home Cook Book* (1905), FoodNet Archive](https://thefoodarchives.com/archive/homecookbook00newy/page/133) | Digital page 133; “Barley Scones” (printed page 241), original pane. The archive displays the 1905 date and says its original pane preserves the source text. | A generic recipe uses “fresh barley meal” in a griddle-cake preparation. This is direct historical human-food use, not a brand, research sample, or product roster. | The recipe gives no milling definition, grind specification, or Québec French name. Its formula and preparation remain specific to that recipe; no amount, method, or result becomes a reusable measure, form, conversion, or cooking rule. |
| [Manx Dishes, corpus transcription](https://corpus.gaelg.im/Browse/Manx-Dishes) | Section identified as pp. 172–203; entry “BONNAG ARRAN OARN / BARLEY MEAL BONNAG,” contributor Miss M. Callow, Ramsey; corpus lines 204–214. | The bilingual corpus transcription lists barley meal in a generic baked bonnag recipe and describes making two or three loaves. It independently confirms human culinary use in another recipe context. | The page is a corpus transcription with an English rendering, not a Québec terminology source or milling specification. The displayed source metadata does not establish a publication date. Keep its formula, quantity, and method attached to this recipe only. |
| [U.S. eCFR, 21 CFR §101.81](https://www.ecfr.gov/current/title-21/chapter-I/subchapter-B/part-101/subpart-E/section-101.81) | §101.81(c)(2)(ii)(A)(5), especially paragraphs (5) and the definitions at lines 149–153 of the current page. The already-owned ledger source is `WP02-A7-BARLEY-MEAL-R984-20261019-S01`. | In the U.S. soluble-fiber health-claim rule, barley meal is defined as unsifted, ground barley grain without separation of bran, germ, and endosperm; sieved barley meal is separately defined. | This is a claim-specific regulatory definition, not a general consumer or Québec milling standard. The section’s fiber eligibility thresholds and health-claim conditions do not become ingredient composition, nutrition, or health claims. It supplies no particle-size threshold and does not resolve overlap with whole barley flour. Do not duplicate its existing ledger source record. |
| [OQLF, `farine d’orge` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge) | Preferred term and English translation; GDT record last updated 1982. Existing candidate source: `WP02-A7-BARLEY-MEAL-20261011-S09`. | Confirms the active Québec French term `farine d’orge` for English `barley flour`. | It does not name barley meal. Do not transfer this term to meal or treat the record as a barley-meal definition. |

The cookbook/corpus sources establish recipe use, not standardized milling grades. Their source IDs are `WP02-A7-BARLEY-MEAL-R1083-S01` and `WP02-A7-BARLEY-MEAL-R1083-S02`. No study-specific formulas, product measurements, processing protocols, or product claims are generalized.

## Ownership and duplicate audit

Read-only audit of the current split seed, research ledger, legacy list, recipe package, and prior candidate reviews:

| Store | Current snapshot | Ownership finding |
| --- | ---: | --- |
| Ingredient references | 2,072 | No `ingredient-ref-barley-meal`, `barley meal` alias, or `orge moulue` owner. Preserve the adjacent rows: `ingredient-ref-barley-flour` (`barley flour / farine d’orge`), `ingredient-ref-whole-barley-flour` (`whole barley flour / farine d’orge entière`), `ingredient-ref-barley-grits` (`barley grits / gruau d’orge`), `ingredient-ref-barley-semolina` (`barley semolina / semoule d’orge`), and `ingredient-ref-barley-middlings` (`barley middlings / fraction intermédiaire de mouture d’orge`). Barley bran, bran flour, malted/roasted barley flours, grain, and cereal rows also remain distinct. |
| Ingredient forms | 205 | No barley-meal or `orge moulue` form, label, or match term. Do not repurpose a form owned by another barley identity. |
| Research ledger | 2,477 records | One existing owner: `candidate-barley-meal`, with `identityState: needs_clarification`, measurement and substitution states `not_yet_researched`, and its existing source-specific history preserved. Integration appended two historical culinary sources and one unresolved boundary decision. No additional ledger identity for barley meal was found. |
| Legacy import identities | 55 candidates | No exact `barley meal`, `whole grain barley meal`, or `orge moulue` candidate. |
| Bundled recipes | 114 files / 1,123 ingredient rows | No exact candidate ingredient-line demand for `barley meal`, `whole grain barley meal`, `orge moulue`, `gruau d’orge`, or `semoule d’orge`. Do not create a recipe link or infer a recipe substitution. |

The existing ledger’s Ontario mill, steel-cut barley, and retailer records remain evidence for their named products or listings only; commercial-product counts do not add ingredient diversity. No new commercial-product, brand, product-line, flavour, SKU, retailer-variant, or roster research was performed. The named Anson Mills wheat-meal lead remains out of scope for that reason. Preserve existing branded rows and review transferability separately before reusing product-specific claims or measurements.

## Integrated state

| Field or store | Proposal |
| --- | --- |
| Existing candidate | Retain `candidate-barley-meal` as `needs_clarification`; historical recipe evidence supports generic culinary use but does not close identity granularity or Québec French display. |
| Active reference | None. Do not add `ingredient-ref-barley-meal` yet. |
| Names and aliases | Add none. Do not use `farine d’orge`, `farine d’orge entière`, `gruau d’orge`, or `semoule d’orge` for meal. Treat `orge moulue` as unverified descriptive wording, not an approved Québec display. |
| Forms and behavior | No forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions. Keep all existing measurement and substitution states unchanged. |
| Existing evidence | Preserve prior product-scoped sources and decisions; append the two historical recipe sources and an unresolved decision. Do not merge or generalize product-scoped evidence. |

## Test disposition

No software tests were run or needed. Integration only added research evidence and a decision to an existing database JSON record; `AGENTS.md` waives testing for database-JSON-only data additions. The proposal and batch documentation received encoding, link, and whitespace checks.

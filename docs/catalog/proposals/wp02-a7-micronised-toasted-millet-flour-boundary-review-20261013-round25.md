# WP02 Section A7 — Micronised Toasted Millet Flour Boundary Review (R25)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No catalog, ledger, plan, roadmap, recipe, generated-index, or code file was changed.
- **Scope:** The manufacturer-named product *micronised toasted millet flour*. This review follows R24’s malted spelt flour review and addresses an unreviewed heat-treated millet-flour product under the open A7 review of malted and toasted flour identities ([A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1435); [R24 review](wp02-a7-malted-spelt-flour-quebec-name-boundary-review-20261013-round24.md)). It does not reopen regional millet flour aliases, existing species-qualified millet flours, or the generic millet-flour reference.
- **Proposal-local source IDs:** `WP02-A7-TOASTED-MILLET-FLOUR-20261013-R25-S01` through `S04`. These identify sources for this proposal only; they are not research-ledger entries.

## Recommendation

| Candidate | Disposition | Proposed boundary |
|---|---|---|
| Micronised toasted millet flour | **Add as a ledger-only unresolved candidate; keep it out of the active catalog.** | Candidate ID: `candidate-micronised-toasted-millet-flour`. CerealVeneta names a heat-treated, subsequently cryo-milled product made from dehulled millet and describes it as a semi-finished ingredient for bakery and pasta formulations. The page does not identify the millet species or establish a Québec French product name. |
| Generic toasted millet flour | **Do not add as an alias or separate active row.** | The product page title is qualified by `micronised`, and the product is a defined industrial semi-finished material. The broader phrase could cover other species and other toasting/milling processes. |
| Québec French display and aliases | **Unresolved; add none.** | OQLF supports `millet` as a generic Québec French term that groups multiple species; current Canadian French product evidence uses `farine de millet` for ordinary flour. I found no Québec/Canadian French product label for this toasted material. Do not invent `farine de millet torréfiée`, `farine de millet grillée`, or another process-qualified alias. |

If later Québec terminology review establishes a usable French name and confirms the consumer/product scope, evaluate a separate `FLOUR_AND_STARCH` identity. Keep it distinct from ordinary millet flour and from species-qualified flours. Do not transfer the current manufacturer’s product name to all toasted millet flour.

## Why this is an unreviewed A7 gap

The A7 checklist leaves other malted/toasted flour identities open. The R24 malted-spelt review evaluated a different cereal-specific malted product and did not cover millet. My archive search found no focused proposal for micronised/toasted millet flour or an active source record for this exact candidate. Recent A6 reviews of millet flour names cover grain species and regional flour aliases; they do not decide whether heat-treated, cryo-milled flour should be a separate product identity. The existing toasted/roasted flour rows are source-named cereal products and do not establish a generic toasted-millet name.

This is a narrow product-boundary review, not a request to complete A7. The unqualified wheat-meal, barley-meal, dry-oat-meal, toasted-rye, and other prior A7 holds remain as recorded in their respective reviews.

## Product and Québec French evidence

CerealVeneta’s product page is titled **“Micronised toasted millet flour.”** The manufacturer says the product is obtained by heat treatment followed by cryo-milling of dehulled millet. It labels the material a semi-finished product and describes use in bakery and pasta formulations, including gluten-free applications. It also describes thickening functionality and calls it an alternative to rice or corn flour [S01]. These details support the existence of a named processed flour product. They do not establish a household flour grade, a millet species, a universal toasting protocol, or equivalence to every product called toasted millet flour.

OQLF lists `millet`, `mil`, and `petit mil` as French terms and explicitly notes that unqualified `millet` can group multiple species [S02]. This supports the generic base word, but the entry does not name a toasted or micronised flour product. A current Shawinigan retailer lists ordinary millet flour as `Farine de millet bio` and `Organic millet flour`; its ingredients identify organic millet without a toasting qualifier [S03]. Celiac Canada’s product finder likewise lists Canadian Cuisine Soleil products as `Farine de Millet` [S04]. Neither source supports a French name for the CerealVeneta product or a process alias.

The manufacturer’s English term should therefore remain documentary evidence only. A literal translation is not enough to set a Québec display: `torréfiée` and `grillée` would both add an unverified product term, while `micronisée` would introduce another unverified descriptor. Do not translate the product title into an active alias before Québec review.

## Live catalog and picker boundary

Read-only snapshot: **1,352 active references**, **98 forms**, **64 legacy candidates**, and **1,671 research-ledger records**. The active generic row is `ingredient-ref-millet-flour` (`millet flour / farine de millet`). Other relevant flour rows include finger, foxtail, kodo, pearl, and proso millet flour; millet grain and other millet products remain separate.

Exact normalized lookups found no current active reference, form, legacy candidate, or ledger record for:

- `micronised toasted millet flour`;
- `micronized toasted millet flour`;
- `toasted millet flour`;
- `farine de millet torréfiée`; or
- `farine de millet grillée`.

The proposed candidate ID is unused. The source phrase does not belong to the ordinary `ingredient-ref-millet-flour` row. Search projections use the app’s complete normalized word-phrase matching before substring fallback ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Current reference-search results are:

| Query | Current results | Boundary |
|---|---|---|
| `micronised toasted millet flour`; `toasted millet flour` | None | The full manufacturer title would be a distinct result if a future active row were justified. Do not put the shorter phrase on the generic flour row. |
| `millet flour` | Six rows: generic, finger, foxtail, kodo, pearl, and proso millet flour | A future separate row would add a seventh choice. This broad query should remain species/product discovery, not a forced mapping to the toasted product. |
| `farine de millet` | Five rows: generic, foxtail, kodo, pearl, and proso millet flour | No French result for the candidate is proposed. A future French product name would expand this already multi-result query. |
| `millet` | Eighteen millet-related references | The base query is already broad; no bare `millet` alias is proposed. |
| `farine de millet d'Italie` | Foxtail millet flour only | Keep existing species-qualified French wording unchanged. |
| `farine de millet commun` | Common millet and proso millet flour | Keep the existing species-qualified result set unchanged. |

These are static projections from the current reference names and aliases, not emulator screenshots. No picker code change is proposed. A French candidate display cannot be projected responsibly until the term is validated.

## Bundled recipe demand

The complete manifest-listed recipe corpus contains **114 files** and **1,123 ingredient rows**. I searched ingredient-row `originalText`, `ingredientName`, `preparation`, and `notes`, plus the serialized recipe files, for the manufacturer title, its US spelling, `toasted millet flour`, plausible French process phrases, and generic `millet flour / farine de millet`. The scan found **zero matching ingredient rows and zero recipe files** for these flour phrases. There is no bundled demand, recipe link, or line amount to carry forward.

The manifest-order corpus fingerprint is **SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`** (relative recipe path, NUL byte, exact file bytes, trailing NUL byte). This is a point-in-time snapshot.

## Numeric, form, and substitution boundaries

- Add no form, density, unit mapping, measurement observation, mass-volume conversion, cooking yield, package yield, or default amount. The manufacturer page supplies no household measure or transferable quantity.
- Add no global or contextual substitution rule or recipe-line link. The manufacturer’s statement that this material can be an alternative to rice or corn flour is product-marketing/application guidance, not a tested recipe ratio or a context-specific substitution finding.
- Do not transfer observations from generic or species-qualified millet-flour records. They concern different sources or products and do not measure this heat-treated, cryo-milled material.
- No ingredient forms are currently attached to the active millet references; related active references have null default density and empty unit mappings.

## Exact disposition

1. Keep `candidate-micronised-toasted-millet-flour` out of active references pending a Québec French name and local product-scope review.
2. Do not add `toasted millet flour` as an alias to generic millet flour, species-specific millet flour, toasted/roasted quinoa flour, or any other row.
3. Keep `micronised` as part of the documentary product title only. The manufacturer page does not establish that all toasted millet flour is micronised, or that this industrial product is interchangeable with home-toasted flour.
4. Add no French alias or translated display yet. In particular, do not activate `farine de millet torréfiée` or `farine de millet grillée` without Québec review.
5. Add no forms, numeric behavior, substitutions, or recipe links.

## Proposal-local source register

Sources were checked on **2026-10-13**. IDs in this table are local to this review.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP02-A7-TOASTED-MILLET-FLOUR-20261013-R25-S01` | CerealVeneta, [Micronised toasted millet flour](https://cerealveneta.it/en/semi-finished/micronised-toasted-millet-flour/). | Manufacturer product title; says dehulled millet is heat-treated and then cryo-milled; identifies the product as a semi-finished material for bakery/pasta uses. No species, Québec French name, household measure, or universal product specification is supplied. |
| `WP02-A7-TOASTED-MILLET-FLOUR-20261013-R25-S02` | Office québécois de la langue française, [millet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet). | Lists `millet`, `mil`, and `petit mil`; explains that unqualified `millet` can group multiple species. It does not define the product or a toasted-flour compound. |
| `WP02-A7-TOASTED-MILLET-FLOUR-20261013-R25-S03` | Grand'Mère Nature, [Farine de millet bio 1 kg](https://www.grandmerenature.com/produit/15294-farine-de-millet-bio-1kg). | Current Shawinigan retailer title pairs `Farine de millet bio` with `Organic millet flour`; ingredients say organic millet. No species or toasted treatment is specified. |
| `WP02-A7-TOASTED-MILLET-FLOUR-20261013-R25-S04` | Celiac Canada, [Gluten-Free Product Finder](https://www.celiac.ca/gf-product-finder/), Cuisine Soleil listings. | Lists Canadian Cuisine Soleil packages as `Farine de Millet` with product identifiers. Supports Canadian French base-flour wording only; it is not a toasted-product label or terminology ruling. |

This proposal-only review does not edit the shared catalog, research ledger, plan, roadmap, recipe data, generated index, or application code. No tests or emulator checks were run for this document-only review.

## Coordinator decision

**Accepted as an unresolved ledger-only candidate.** The active catalog and picker remain unchanged because the manufacturer’s product is species-unspecified industrial semi-finished flour and no Québec French product name is supported. The candidate and four source records are now in `docs/catalog/research-ledger.v1.json`; no measures, forms, conversions, recipe links, yields, or substitutions were added.

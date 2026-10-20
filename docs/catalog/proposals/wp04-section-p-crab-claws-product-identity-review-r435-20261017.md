# WP04 Section P R435 — crab-claw product identity review

- **Review and online source-access date:** 2026-10-17.
- **Checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717)).
- **Scope:** Decide whether the marketed edible crab-claw cut has a catalog identity distinct from generic crab meat and named crab species. Review current names, ownership, picker effects, and every manifest-listed recipe. This does not reopen crab meat, crab species, crab cake, imitation crab, or the generic whole-crab hold.
- **Recommendation:** Add one identity-only `PROTEIN` reference, **crab claws / pinces de crabe**, for intact edible claw products across crab species. Keep species and retail preparation details product-specific. Add no aliases, form, recipe link, numeric behavior, yield, conversion, or substitution.
- **Proposal-only status:** This review creates only this proposal file; it does not modify shared catalog JSON, the ledger, plan, roadmap, generated index, recipes, or application files. No tests, build, emulator, or deployment was run for this review.
- **Proposal-local source IDs:** `WP04-SECTIONP-CRAB-CLAWS-R435-20261017-S01` through `S05`, plus audit label `WP04-SECTIONP-CRAB-CLAWS-R435-20261017-R01`. Existing CFIA and product sources from prior crab packets are cross-referenced under their original IDs, not reissued.

## Proposed delta

Current Québec and Canadian listings use the crab-claw product name for claws from more than one crab market group. The DFO species guide independently describes Jonah crab as having two large claws and says the species is commercially fished in eastern Canada. This supports a species-neutral market cut while keeping the taxon of each listed product unassigned unless its own source names it. The suggested identity is not whole crab and does not mean picked claw meat. [S01–S04; reused `WP04-P-JONAH-CRAB-20261013-R28-S06`, `WP04-SECTIONP-STONE-CRAB-R99-20261014-S04`–`S05`, and `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S06`]

```json
{
  "id": "ingredient-ref-crab-claws",
  "nameFr": "pinces de crabe",
  "nameEn": "crab claws",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

The plural displays reflect the attested Québec and English retail product names. Do not add singular `pince de crabe` as a French alias: OQLF’s indexed entry for `simili-pince de crabe` defines an imitation made from surimi. Keep `simili-pince de crabe / imitation crab claw`, `crab-claw meat`, picked crab meat, crab legs, and crab sections outside this identity. This proposal does not add a French synonym for an English term by literal translation. [S05]

## Why this is distinct from prior Section P crab work

R432 added `crab cake / croquette de crabe`, a prepared mixture. It does not cover a claw sold as a seafood ingredient. The earlier generic-crab review held a second bare `crab / crabe` identity, while retaining `crab meat / chair de crabe`; this proposal introduces neither bare name nor a whole-crab row.

Prior species reviews cite individual claw products as market evidence but do not allocate a shared claw-cut identity:

- R28 records a Metro Jonah-crab claw SKU identified as *Cancer borealis*; the page’s 454 g package and sold-out state are product-specific.
- R99 records Metro’s cooked, frozen stone-crab claws; the listed SKU supplies no binomial.
- R4 records Metro’s “Pattes et pinces de crabe royal cuites”; the retailer item supplies no species.
- The current Capone Gourmet listing offers Québec snow-crab claws, and La Mer’s current Montréal collection distinguishes snow crab, royal crab, Dungeness crab, blue crab meat, and other products.

Those are distinct crab species or retailer SKUs. Taken together with current claw-name evidence, they support a narrow cut-level identity; they do not assign a species to the proposed row. The shell-on whole-claw scope also keeps it separate from the prior Metro wild crab-claw-meat source, which is a species-identified picked-meat product with its own 227 g SKU. [reused R28-S06; reused R99-S04–S05; reused R4-S06; S01–S03; ledger source `WP04-SECTIONP-BLUE-SWIMMING-CRAB-IDENTITY-20261013-R6-S01`]

## Current ownership and snapshot audit

The live workspace snapshot contains **1,729 ingredient references, 141 forms, 56 legacy candidates, and 2,088 research-ledger records**. The manifest lists **114 recipe files and 1,123 ingredient rows**. These counts were read from the current files for this review.

Normalized exact phrase ownership was checked across bilingual reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs. The proposed `ingredient-ref-crab-claws` and `candidate-crab-claws` IDs, the exact English and French display keys, and the R435 source-ID prefix are unallocated. Prior ledger source notes that mention individual crab-claw products are evidence records, not a reference/form owner for this market cut.

| Current owner or nearby record | Current boundary | Proposed handling |
|---|---|---|
| `ingredient-ref-crab` — `crab meat / chair de crabe` | Broad species-unspecified edible crab meat; active forms are `canned crab meat` and `jumbo lump crab meat`. Recipe 019#8 explicitly requests the Jumbo Lump form. | Keep unchanged. Do not make claws a form of picked crab meat or move the recipe line. |
| `ingredient-ref-crab-cake` — `crab cake / croquette de crabe` | Prepared crab mixture, added at R432. | Keep separate from intact crab claws. |
| Blue, Dungeness, Jonah, Northern stone, and stone crab references | Species or market-group identities, with their own bilingual displays. No active claw form is attached to any of them. | Keep each species result and alias set unchanged; do not assign the generic claw row to any taxon. |
| `ingredient-ref-crab-flavoured-pollock-flakes` | Pollock product with crab flavour. | Keep separate from actual crab claws. |
| `ingredient-form-crab-canned`; `ingredient-form-crab-jumbo-lump` | Canned and Jumbo Lump crab-meat states/grade under `ingredient-ref-crab`. | Keep both unchanged; neither represents whole claws. |
| Prior Jonah, stone-crab, and royal-crab claw source records | Product-specific evidence in R28, R99, and R4; no `crab claws / pinces de crabe` identity allocation. | Reuse these existing source IDs only as evidence; do not duplicate their SKU facts as general measurements. |
| Prior Metro wild crab-claw meat source | 227 g picked claw-meat product identified as *Portunus pelagicus*; source is in the ledger under R6-S01. | Keep picked claw meat out of the proposed shell-on claw identity. |
| Legacy candidates and other exact owners | No exact reference, form, legacy, or ledger-record-ID owner for the proposed display or ID. | Add only the proposed identity if accepted; no legacy mapping is proposed. |

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which uses complete normalized phrase matching before substring fallback across names, aliases, and attached forms. It was evaluated against the live names and forms, then the proposed row above.

| Query | Current result | With proposed row |
|---|---|---|
| `crab claws` | None | `ingredient-ref-crab-claws` only |
| `crab claw` | None | `ingredient-ref-crab-claws` only, by the existing substring fallback to the plural display |
| `pinces de crabe` | None | `ingredient-ref-crab-claws` only |
| `pince de crabe` | None | Still none; no singular alias is proposed because OQLF documents the singular compound in its surimi-imitation term |
| `crab` / `crabe` | Eight results: blue crab, crab meat, crab-flavoured pollock flakes, Dungeness crab, Jonah crab, Northern stone crab, stone crab, and crab cake | The same eight plus crab claws; both remain multi-result queries |
| `crab meat`; `chair de crabe`; `jumbo lump crab meat` | `ingredient-ref-crab`, with the Jumbo Lump form where explicit | Unchanged |
| `crab cake`; `croquette de crabe` | `ingredient-ref-crab-cake` | Unchanged |
| `crab claw meat`; `crab legs`; `pattes de crabe`; `simili-pince de crabe` | No result | Still no result; these terms are not aliases |

The exact generic cut queries become searchable without collapsing broad crab searches or altering species-qualified product terms. Search for the full phrases `Jonah crab claws` or `stone crab claws` still returns no result because the current reference model does not store species-plus-cut combinations; adding those as aliases would make a multi-species product row appear taxon-specific. Keep those phrases unresolved until a recipe or a specific product-selection need justifies such identities.

## Manifest recipe-demand scan

All **114 manifest-listed recipe files and 1,123 ingredient rows** were parsed. Full recipe JSON text and ingredient rows were scanned for `crab claws`, `crab claw`, `pinces de crabe`, `pince de crabe`, `claw meat`, crab legs, claws paired with species terms, and French/English crab-cut variants. The scan found **zero matching files and zero matching ingredient rows** for the proposed claw identity or cut.

Recipe 019 is the only bundled crab-ingredient request: row **#8** is `1 lb jumbo lump crab meat`, already linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. Its title and instructions concern crab balls, and its source URL mentions crab-cake bites; neither establishes crab claws. Do not relink the row, create a recipe link, or infer an amount for claws.

## Forms, measurements, yields, conversions, and substitutions

- **Forms:** Add none. The market evidence includes frozen, cooked/frozen, and ready-to-cook-or-eat product listings, but these details differ by SKU and do not establish a universal state for crab claws. Do not attach `cooked`, `frozen`, or `shell-on` forms to the generic identity.
- **Measures and density:** Add no measurement observation, reusable count, default density, unit mapping, or conversion. Capone’s 5 lb/10 lb/30 lb options, Walmart’s old Jonah-claw listing, Metro’s 454 g/680 g/approximately 400 g SKUs, and the Metro 227 g picked-claw-meat product are product-specific package records. They do not establish a recipe portion, number of claws per mass, shell-to-meat yield, or volume conversion. [S01, reused R28-S06, reused R99-S04–S05, reused R4-S06, ledger source R6-S01]
- **Yield:** Add no edible, cooking, thawing, or shelling yield. DFO’s biological descriptions of claws and crab sizes are not culinary yields. The older DFO stone-crab factory shelling trial cited in R100 is species- and process-specific, not a home-preparation conversion for this row.
- **Substitutions:** Add no global or contextual rule. No reviewed source or bundled recipe supports a quantity- and method-qualified substitution between intact crab claws, crab meat, crab cakes, crab-flavoured pollock, or imitation crab claw.
- **Ledger if accepted:** Create one `ingredient_reference` record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. The proposed identity does not change the ledger state for crab meat or any crab species. No package-yield record, conversion row, form record, recipe-line substitution, or recipe link is proposed.

## Sources and limits

New sources were accessed on 2026-10-17. Retail and seller pages establish their listed product names and SKU claims only. The CFIA and DFO sources support Canadian species/name boundaries; they do not define a generic crab-claw product standard or a consumer recipe equivalence.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-CRAB-CLAWS-R435-20261017-S01** | Capone Gourmet, [Pinces de crabe des neiges IQF — Québec](https://caponegourmet.com/products/pinces-de-crabes-des-neiges-capone-gourmet). | Current Québec seller listing uses `pinces de crabe des neiges`; page says the item is IQF and offers 5 lb, 10 lb, and 30 lb package options, with ready-to-cook/eat varying by format. Product name and listed pack options are seller/SKU-specific; no species binomial, claw count, or edible yield is supplied. |
| **WP04-SECTIONP-CRAB-CLAWS-R435-20261017-S02** | Poissonnerie La Mer (Montréal), [Crabe vivant, frais ou congelé](https://www.lamer.ca/collections/crabe). | Current Montréal seafood collection distinguishes snow-crab sections/leg meat, royal-crab products, Dungeness crab, soft-shell crab, and a blue-crab picked-meat product described with `(pinces)`. It demonstrates distinct product names and states; the picked-meat listing is not evidence for an intact claw identity. No universal measure or species mapping is inferred. |
| **WP04-SECTIONP-CRAB-CLAWS-R435-20261017-S03** | Walmart Canada, [Jonah Crab Claws](https://www.walmart.ca/en/ip/jonah-crab-claws/6000200192101). | The live product page names a Jonah-claw SKU, identifies *Cancer borealis* and salt in its ingredient list, and says fully cooked and frozen. It currently shows out of stock. Page details are supplied for that product only and do not establish current general availability, a Québec French label, or a reusable amount. |
| **WP04-SECTIONP-CRAB-CLAWS-R435-20261017-S04** | Fisheries and Oceans Canada, [Identification guide for crabs of Eastern Canada](https://www.dfo-mpo.gc.ca/species-especes/publications/ais-eae/identification-crabs-crabes-ec/index-eng.html), 2024. | Identifies Jonah crab as *Cancer borealis*, describes its two large claws, and notes commercial fishing in eastern Canada. It is species/anatomy/fishery evidence, not a recipe measure, product-state definition, or Québec inventory claim. |
| **WP04-SECTIONP-CRAB-CLAWS-R435-20261017-S05** | Office québécois de la langue française, [simili-pince de crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199049/simili-pince-de-crabe), last updated 1998. | Defines a surimi-based imitation of peeled crab-claw meat and gives English `imitation crab claw`. Supports keeping the imitation product separate and explains why the unqualified singular French phrase is not proposed as an alias. It does not establish a name for generic intact claws. |
| **Reused `WP04-GENERIC-CRAB-20261012-S01`** | CFIA, [Fish List lookup for crab](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab), modified 2023-09-18. | Applies `Crab / Crabe` across multiple taxa and lists additional species-qualified names. This is Canadian species/common-name evidence, not a cut-name or product-form standard. |
| **Reused `WP04-P-JONAH-CRAB-20261013-R28-S06`** | Metro, [Frozen Jonah crab claws, product 731149112377](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-jonah-crab-claws/p/731149112377). | Product entry names *Cancer borealis* and salt and lists a 454 g frozen item; it was out of stock when checked on 2026-10-13. Use only as one SKU-specific English/ingredient example. |
| **Reused `WP04-SECTIONP-STONE-CRAB-R99-20261014-S04` and `S05`** | Metro Québec/Canada, [Pinces de crabe de pierre cuites surgelées](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/pinces-de-crabe-de-pierre-cuites-surgelees/p/058973933757) / [Frozen Cooked Stone Crab Claws](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-cooked-stone-crab-claws/p/058973933757). | Paired retailer names for one 680 g frozen/cooked SKU. No species binomial or claw count is given, and it was out of stock at the prior review. This does not supply a general measure or the proposed row’s species. |
| **Reused `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S06`** | Metro, [Pattes et pinces de crabe royal cuites, product 248545](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/pattes-et-pinces-de-crabe-royal-cuites/p/248545). | Current index result at prior review showed cooked royal-crab legs/claws and approximately 400 g. The product did not identify a binomial, so no king-crab species is assigned here. |
| **Ledger source `WP04-SECTIONP-BLUE-SWIMMING-CRAB-IDENTITY-20261013-R6-S01`** | Metro, [Aqua Star wild crab-claw-meat product 731149113954](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/lobster-crab-pollock/wild-crab-claw-meat/p/731149113954). | An English/French retailer product listing for 227 g picked claw meat, identified as *Portunus pelagicus*. Keep it separate from intact claws; package amount and localized name are SKU-specific. |
| **WP04-SECTIONP-CRAB-CLAWS-R435-20261017-R01** | Current [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt), live references/forms/legacy candidates/research ledger, focused crab proposals and batches, `IngredientSearch.kt`, manifest, and manifest-listed recipe corpus. | Read-only exact-key and ID/source-prefix audit; current picker projection; full 114-file / 1,123-row recipe scan; and catalog-state snapshot described above. It is repository evidence and does not extend product claims beyond the cited sources. |

## Final disposition and unresolved needs

**Recommend adding identity-only `crab claws / pinces de crabe`** with the exact display-only delta above. The current retailer examples span species and product states but converge on a recognizable claw-cut product. Preserve whole claws as distinct from picked claw meat, crab meat, and crab cakes; do not infer a species, state, measure, yield, or substitute.

The bundle has no candidate-specific demand, and the unqualified singular French phrase is intentionally unresolved because of the OQLF imitation term. Reopen singular and species-plus-cut query handling if a bundled recipe or import requires those phrases. No catalog or ledger update is made by this proposal.

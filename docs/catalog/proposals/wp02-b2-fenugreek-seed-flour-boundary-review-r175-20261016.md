# WP02 B2 R175 — Fenugreek seed flour product boundary hold

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. This file is the sole change; no catalog JSON, ledger, plan, roadmap, code, or generated file was edited.
- **Scope:** Candidate flour made by milling fenugreek (*Trigonella foenum-graecum*) seeds. This is a new B2 seed-flour discovery candidate, distinct from R174's Chinese water-chestnut starch review and prior WP02 proposal/batch records.
- **Proposal-local source IDs:** `WP02-B2-FENUGREEK-SEED-FLOUR-R175-20261016-S01` through `S06`. They are provenance labels only and are not shared-ledger records.

## Recommendation

**Hold an active flour identity and all aliases.** Primary food-science papers document experimental fenugreek seed flour, but current Canadian evidence found in this review identifies fenugreek seed as whole seed or as spice/powder, not a standalone food flour. The Canada-facing “fenugreek seed flour” listing found describes an herbal tea/infusion product, so it does not establish a general culinary flour. OQLF supports `fenugrec` for the plant/seed term but does not attest a flour product phrase. The descriptive French `farine de graines de fenugrec` is not adopted as a display. [S01–S06]

Keep `fenugreek flour`, `methi flour`, and `farine de graines de fenugrec` as research/search phrases only. Do not add a reference, alias, form, or ledger candidate from this evidence. Reopen if a current Canadian or Québec food product identifies a culinary flour made from fenugreek seed and supports a product-specific French display.

## Ownership and picker audit

The live reference catalog has distinct `ingredient-ref-fenugreek-seeds` and `ingredient-ref-fenugreek-leaves` rows. `methi` is already a broad search term in the herb/leaf family; do not transfer it to a flour row. No active reference, form, or legacy identity owns fenugreek flour. No existing proposal or batch decision specifically reviews fenugreek seed flour. The research ledger contains records for fenugreek seeds and leaves but no flour candidate. Proposal-local source prefix and exact source URLs in this register were checked against the ledger and focused proposal/batch archive; no ownership collision was found.

`IngredientSearch.kt` matches complete phrases appearing within display names and aliases. Activating `fenugreek seed flour` would introduce a `fenugreek` query collision with the seed and leaf rows, while `methi flour` could collide with broad methi results if used as a phrase alias. No picker change is proposed.

## Recipe demand and numeric boundaries

A manifest-ordered scan of all 114 bundled recipe files / 1,123 ingredient rows found no matches for `fenugreek flour`, `methi flour`, `farine de graines de fenugrec`, or *Trigonella foenum-graecum*, and no recipe link to a candidate flour identity. This corpus result is bounded to the bundled package.

The research papers study experimental flour and food fortification; they do not provide a transferable household measure, bulk density, conversion, preparation yield, or universally supported recipe substitution. Experimental flour inclusion rates are formulation-specific and are not adopted. No forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions are proposed.

## Sources

Accessed 2026-10-16. IDs are proposal-local and unallocated.

| ID | Source | Supports and limits |
|---|---|---|
| **WP02-B2-FENUGREEK-SEED-FLOUR-R175-20261016-S01** | Yadav et al., [“Effect of processing techniques on nutritional composition and antioxidant activity of fenugreek (*Trigonella foenum-graecum*) seed flour”](https://pmc.ncbi.nlm.nih.gov/articles/PMC4325032/), *Journal of Food Science and Technology* (2015). | Primary study identifies processed seed flour and compares experimental processing treatments. It establishes research material, not a Canadian consumer product, French label, or generic retail standard. |
| **WP02-B2-FENUGREEK-SEED-FLOUR-R175-20261016-S02** | India Spices Board, [Fenugreek spice profile](https://www.indianspices.com/indianspices/spice-catalog/fenugreek.html). | Authoritative commodity terminology for fenugreek seed and plant parts; does not identify a seed-flour food product. |
| **WP02-B2-FENUGREEK-SEED-FLOUR-R175-20261016-S03** | Office québécois de la langue française, [GDT: fenugrec](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095264/fenugrec). | Supports Québec French `fenugrec` terminology for fenugreek; no flour compound or product-specific French name is established. |
| **WP02-B2-FENUGREEK-SEED-FLOUR-R175-20261016-S04** | Ameen Foods Canada, [Fenugreek Powder — ground methi seed](https://ameenfoods.ca/products/fenugreek-powder). | Current Canadian product page identifies fenugreek powder as ground methi seed and discusses spice use. It supports availability of seed powder as a spice, not a culinary flour class or interchangeability with experimental flour. |
| **WP02-B2-FENUGREEK-SEED-FLOUR-R175-20261016-S05** | Naturitas Canada, [Fenugreek seed flour, Solime, 100 g](https://www.naturitas.ca/catalog/product/view/id/110327/). | Canada-facing listing calls its item seed flour but describes it as an herbal tea/infusion for preparation, not a general baking/cooking flour. Its wording cannot be generalized to a standalone culinary flour identity. |
| **WP02-B2-FENUGREEK-SEED-FLOUR-R175-20261016-S06** | Project audit: active ingredient references and forms, legacy identity map, research ledger, `IngredientSearch.kt`, manifest-listed recipes, and focused proposal/batch archive. | Read-only ownership, normalized-term, picker-collision, recipe-corpus, and archive audit for this proposal. Shared files were not changed. |

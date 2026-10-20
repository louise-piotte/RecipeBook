# R546–R548 gap review integration — 2026-10-17

## Scope and disposition

Root reviewed and integrated three proposal-only catalog reviews. The WP02 Section A4 and WP03 Section F parents remain open. R548 is a deliberate hold and creates no catalog or ledger entry.

- **R546 — generic rice-flour family:** recorded the absence of a supported family-wide measure and general wheat-flour replacement on the existing ingredient-ref-rice-flour ledger record. Product serving observations and formula-specific studies remain on their existing white- and brown-rice rows.
- **R547 — common millet:** added ingredient-form-common-millet-dry under ingredient-ref-common-millet; recorded separate CNF 2015 and 2026 Food Code 4491 observations for 100 mL and 250 mL portions.
- **R548 — rainbow trout:** held ingredient-form-rainbow-trout-fillet-cut outside active data. With the current phrase matcher, adding the natural species-qualified labels would also make generic trout fillet / filet de truite queries return rainbow trout alone. No bundled recipe demand was found.

## R546: rice-flour family evidence

The ingredient-ref-rice-flour ledger record now has measurementState=researched_no_supported_value and substitutionResearchState=researched_no_supported_substitute. It reuses seven source records already owned by the generic, white, and brown rice-flour rows. The family row has no measurement observation. Its no-general-wheat-substitute finding cites the OQLF family scope and the white- and brown-rice studies; tested percentages and hydration effects remain formula-specific.

The ingredient reference, aliases, density, unit mappings, forms, recipes, conversions, yields, and active rules are unchanged. Existing product-specific servings remain on their source-grade rows.

## R547: dry common millet and published portions

Added one form with the bilingual labels common millet, dry / millet commun, sec, formCode=dry, prepState=dry, empty match-term arrays, and null density. Its ledger record has four portion_weight observations:

| CNF edition | Food Code 4491 portion |
|---|---:|
| 2015 | 100 mL = 84.5 g |
| 2015 | 250 mL = 211.3 g |
| 2026, Measure 341 | 100 mL = 84.531 g |
| 2026, Measure 415 | 250 mL = 211.327 g |

The five CNF 2026 joined rows were all accounted for. The 45 g mass-only row and total-refuse row are excluded; the type-9 amount to make 125ml value (46.04) remains uninterpreted. The 2015 amount to make 125ml value (46.0 g) also remains uninterpreted. The published portions do not establish a fill method, density, reusable conversion, cooking yield, or substitution.

## R548: picker boundary hold

The candidate form remains unallocated. The current matcher searches complete phrases in form labels, so the candidate's natural labels would match the species-qualified queries and the shorter generic cut phrases. Broad trout / truite queries remain multi-result, and no trout line occurs in the 114 manifest-listed recipe files or 1,123 ingredient rows.

Root's source recheck confirmed OQLF's preferred truite arc-en-ciel, its English rainbow trout equivalent, and Oncorhynchus mykiss. Aliments du Québec lists a Québec-produced Filet de truite arc-en-ciel sans arêtes; Metro also lists fresh rainbow-trout fillets and identifies O. mykiss. Metro's proposed SKU 223344 pages returned 403 during the root recheck, so those exact product details are not relied on in this integration. Product pages support naming only, not a generic portion, fillet weight, or conversion.

## Checklist and verification

The plan contains checked child items beneath the still-open WP02 Section A, WP03 dry-versus-cooked grain, and WP04 Section P parents. Static package, ledger/source, encoding, plan, and link checks are recorded after integration. No Android tests, build, emulator check, or deployment will be run because the active application changes are database JSON data only; the R548 change is documentation only.

Sources and review notes are in the [R546 proposal](../../proposals/wp02-next-gap-review-r546-20261017.md), [R547 proposal](../../proposals/wp03-section-f-next-gap-review-r547-20261017.md), and [R548 proposal](../../proposals/wp04-section-p-next-gap-review-r548-20261017.md).

Root's independent R548 source recheck:
- [OQLF, truite arc-en-ciel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel)
- [Metro, Fresh Rainbow Trout Fillets](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/salmon-trout-tuna/fresh-rainbow-trout-fillets/p/242414)
- [Aliments du Québec, Filet de truite arc-en-ciel sans arêtes](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/filet-de-truite-arc-en-ciel-sans-aretes)

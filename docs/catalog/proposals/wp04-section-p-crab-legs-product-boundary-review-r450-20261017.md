# WP04 Section P R450 — crab-leg product identity review

- **Review and source-access date:** 2026-10-17.
- **Checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6751)). The parent remains open.
- **Candidate:** Marketed edible crab legs, the cut-level product named in English as `crab leg(s)` and in French as `patte(s) de crabe`.
- **Recommendation:** Add one identity-only `PROTEIN` reference, **crab legs / pattes de crabe**, for the intact leg cut as an ingredient. Add only the singular forms `crab leg` and `patte de crabe` as aliases, matching OQLF terminology. Do not map species-qualified leg products, crab sections/clusters, picked leg meat, or claws into this identity.
- **Scope:** The row identifies the leg as a marketable crab part. It does not identify any crab taxon or imply that all crab products contain the same leg count, shell state, cooking state, or meat yield. A snow-crab `section`/cluster is a distinct commercial assembly of five legs attached to the shoulder; it is not an alias for this row.
- **Status:** Integrated on 2026-10-17 after root review; see
  `docs/catalog/batches/wp04-section-p-crab-legs-identity-integration-r450-20261017/README.md`.
- **Proposal-local source IDs:** `WP04-SECTIONP-CRAB-LEGS-R450-20261017-S01` through `S07`; audit label `WP04-SECTIONP-CRAB-LEGS-R450-20261017-R01`. These are not ledger allocations. Existing evidence is reused by its original source ID below.

## Proposed delta

OQLF gives the direct bilingual terminology pair `patte de crabe / crab leg`, describes a crab patte as a marketable anatomical part, and identifies snow crab and king crab as the main species addressed by that entry. Current Québec-market evidence separately advertises snow-crab leg products and king-crab legs. Together, those sources support a narrowly cut-based identity without assigning a species. [S01–S02, S05–S07; reused R435-S02 and R3-S07]

```json
{
  "id": "ingredient-ref-crab-legs",
  "nameFr": "pattes de crabe",
  "nameEn": "crab legs",
  "aliasesFr": ["patte de crabe"],
  "aliasesEn": ["crab leg"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Do not add `snow crab leg(s)`, `patte(s) de crabe des neiges`, `king crab legs`, or `pattes de crabe royal` as aliases. Those phrases name a species-qualified product and would silently assign it to a species-neutral cut row while the separate snow-crab identity remains held. Do not add `section`, `snow crab section`, `cluster`, `bouquet de pattes de crabe`, or `paquet de pattes de crabe`: OQLF defines the snow-crab section/cluster as five legs attached to the shoulder, and its preferred `bouquet`/`paquet` terms identify that cluster product. Keep picked leg meat and mixed leg/claw meat distinct from an intact leg. [S02–S04]

## Why this is distinct from prior crab work

- **Generic crab meat:** `ingredient-ref-crab` is `crab meat / chair de crabe`; it has `canned crab meat` and `jumbo lump crab meat` forms. These are picked meat states/grades, not intact legs. Recipe 019#8 requests `1 lb jumbo lump crab meat` and remains linked there.
- **Crab cake:** `ingredient-ref-crab-cake` is the prepared crab mixture added in R432. It is not a leg cut.
- **Crab claws:** R435 added `ingredient-ref-crab-claws` for `crab claws / pinces de crabe`; its proposal explicitly left crab legs and sections outside that row. That scope note is evidence of a gap, not an ownership allocation. Keep intact claws separate from legs.
- **Species rows and holds:** Active blue, Dungeness, Jonah, Northern stone, and stone-crab references identify taxa; none owns a generic leg cut. The generic whole-crab and snow-crab reviews remain holds. CFIA lists `Crab / Crabe` for multiple taxa, and the snow-crab hold documents the multiple accepted snow-crab labels in the Fish List. This proposal adds only unqualified cut names, no species names or species-qualified aliases, and does not reopen either hold.
- **Other recent Section P reviews:** R401, R404, R407, R410, R413, R416, R419, R422, R428, R432, R435, R438, R441, R444, and R448 address roe, fish, crab cake/claws, shrimp preparations, or shrimp tempura. None allocates crab legs. In particular, R435 and the R440–R442 batch integrate R441 coconut butterfly shrimp, while the R443–R445 batch integrates R444 popcorn shrimp; both batches preserve separate seafood product boundaries. R448 remains a shrimp-tempura hold. R446/R447 condiment work and the WP02/WP06 R4xx work do not overlap this candidate.

## Ownership and snapshot audit

The pre-integration workspace snapshot used for this review contains **1,740 ingredient references, 141 forms, 56 legacy candidates, and 2,099 research-ledger records** with **9,543 source entries, 8,093 distinct source IDs, and 6,809 distinct URLs**. The manifest lists **114 recipe files and 1,123 ingredient rows**. These counts were read from the current files before R449 and R450 were integrated.

Normalized exact phrases and proposed IDs were checked across bilingual reference names and aliases, form labels and match terms, legacy candidates, ledger record IDs, and all source records. There is no owner for `ingredient-ref-crab-legs`, `candidate-crab-legs`, `ingredient-form-crab-legs`, `crab leg(s)`, or `patte(s) de crabe`. Existing source notes mention snow-crab sections and leg meat, and R435 states that legs are outside the claw row; neither is an identity/form owner. The `R450` proposal path and source-ID prefix are unallocated. The MAPAQ PDF URL is already in the ledger under lobster/shrimp-specific locators, so S05 uses a new proposal-local source ID for its crab-specific pages rather than treating that URL as new. The La Mer collection and CFIA lookup are reused under their existing source IDs.

| Current owner or nearby record | Existing boundary | R450 handling |
|---|---|---|
| `ingredient-ref-crab` and its two forms | Picked crab meat, including canned meat and Jumbo Lump grade. | Keep unchanged; do not attach legs as a form or relink recipe 019#8. |
| `ingredient-ref-crab-cake` | Prepared crab mixture (R432). | Keep separate. |
| `ingredient-ref-crab-claws` | Intact edible claws (R435). | Keep separate; do not add leg aliases or combine the two cuts. |
| Blue, Dungeness, Jonah, Northern stone, and stone crab references | Species/market-group identities. | Leave displays and aliases unchanged; do not attach the cut to one taxon. |
| Generic crab and snow crab holds | Avoid assigning broad or ambiguous species names through the phrase-first picker. | Do not add `crab`, `snow crab`, or species-qualified leg aliases. |
| Legacy candidates, package yields, substitutions, source IDs | No exact candidate owner; no crab-leg yield or conversion entry; no crab-leg substitution rule. | Add no legacy mapping, yield, form, measurement, or substitution rule. |

## Picker projection

Projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which accent-folds search terms, prefers complete word-phrase matches, and then falls back to substring matching. The “with row” column uses only the JSON delta above.

| Query | Current result | With proposed row |
|---|---|---|
| `crab legs`; `crab leg` | None | `ingredient-ref-crab-legs` only |
| `pattes de crabe`; `patte de crabe` | None | `ingredient-ref-crab-legs` only |
| `crab`; `crabe` | Nine results: blue crab, crab meat, crab cake, crab claws, crab-flavoured pollock flakes, Dungeness crab, Jonah crab, Northern stone crab, and stone crab. | The same nine plus crab legs; both broad queries remain multi-result. |
| `crab meat`; `chair de crabe`; `jumbo lump crab meat` | `ingredient-ref-crab`, with the existing Jumbo Lump form on the explicit query. | Unchanged. |
| `crab claws`; `pinces de crabe` | `ingredient-ref-crab-claws` | Unchanged. |
| `snow crab legs`; `pattes de crabe des neiges`; `king crab legs`; `pattes de crabe royal` | No result | Still no result; species-qualified phrases are not aliases. |
| `crab section`; `section de crabe`; `cluster`; `bouquet de pattes de crabe`; `paquet de pattes de crabe` | No result | Still no result; a snow-crab section/cluster is a separate assembly, not the generic leg identity. |

The accepted crab-claws row already makes broad `crab` and `crabe` searches return multiple results, so adding one more unqualified cut does not make either query resolve to a single product. Species-qualified phrases intentionally remain unresolved until search can represent a taxon plus cut without assigning one crab species to a generic cut row.

## Full manifest recipe scan

All **114 manifest-listed recipe files and all 1,123 structured ingredient rows** were parsed. Full recipe JSON text and ingredient rows were scanned for `crab leg(s)`, `crab legs`, `patte(s) de crabe`, species-qualified leg phrases, `crab section(s)`, `section(s) de crabe`, and snow-crab cluster terms. The scan found **zero matching files and zero matching ingredient rows** for the proposed cut or its excluded section/cluster variants.

Recipe 019 is the only bundled recipe with a crab ingredient: row **#8** is `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. Its other ingredient rows carry a `Crab balls` group label, but no other row is a crab ingredient. Do not move row #8, infer a leg-meat substitute, add a recipe link, or derive a leg quantity from that recipe.

## Forms, measurements, yields, conversions, and substitutions

- **Forms:** Add none. The sources show fresh, frozen, cooked, shelled, mixed-meat, sectioned, and other product presentations. Those describe particular species, product assemblies, or seller items; none is a universal state conversion for this cut.
- **Measures and density:** Add no measurement observation, reusable count, default density, unit mapping, or conversion. La Mer’s individual product options, Metro’s 680 g snow-crab listing, and MAPAQ’s processor grades and package formats are seller or industry product data, not recipe portions or a count-to-mass rule. No yield is inferred from package weights.
- **Section/cluster boundary:** MAPAQ lists snow crab in commercial sections, claws, and picked-meat formats. OQLF describes a section as five legs attached to an `épaule`. That anatomical/product assembly distinction does not support a generic unit mapping or a five-leg recipe measure for every crab-leg product.
- **Yield:** Add no cooking, thawing, shelling, or edible-meat yield. No source supports a reusable shell-to-meat factor for the species-neutral row.
- **Substitutions:** Add no global or contextual substitution. The sources do not establish quantitative or method-qualified equivalence among crab legs, crab claws, picked crab meat, crab cakes, imitation products, lobster, or other seafood.
- **Ledger if accepted:** Create one `ingredient_reference` record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. No form, package-yield record, conversion row, recipe-line substitution, or recipe link is proposed.

## Sources and limits

OQLF pages provide terminology, not current inventory or universal culinary usage. MAPAQ’s official Québec crustacean sheet describes the snow-crab industry’s product categories and pack formats; the document does not show a publication date, and its commercial measures are not recipe standards. CFIA common-name evidence is taxonomic labeling information, not a cut-name standard. Retail pages establish only their seller’s product wording and any item-specific claims; price, inventory, species attribution, and package details can change or be SKU-specific.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S01** | Office québécois de la langue française, [patte de crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435848/patte-de-crabe), updated 1983. | Directly gives the preferred French term `patte de crabe` and English `crab leg`. It supports the singular aliases, not a particular species, state, portion, or current market claim. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S02** | Office québécois de la langue française, [patte (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199065/patte), updated 1998. | Defines a crab patte as a marketable anatomical part and lists snow crab and king crab as the principal species in scope. It says snow-crab legs are generally sold as a `section`, composed of five legs attached to part of the underside of the body. It is terminology/anatomy evidence, not a recipe measure. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S03** | Office québécois de la langue française, [section (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199044/section), updated 1998. | Defines the marketable snow-crab `section` as five legs attached to the shoulder. Supports keeping this assembly distinct from a generic leg identity; it does not establish a universal recipe unit. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S04** | Office québécois de la langue française, [bouquet de pattes de crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18060893/bouquet-de-pattes-de-crabe), updated 1987. | Gives `bouquet de pattes de crabe` and `paquet de pattes de crabe` for English `snow crab cluster`. This is a cluster product term, not an alias for a crab leg. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S05** | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [Les crustacés du Québec (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf), crab section, pp. 4–5. | Identifies Québec snow crab and shows commercial presentations including frozen sections, claws, shelled leg meat, mixed leg/salad meat, and meat with shoulders/claws. The listed commercial grades, pack sizes, and nutrition basis are not household quantities, transferable measures, or yields. No publication date is visible in the PDF. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S06** | Poissonnerie La Mer (Montréal), [Alaskan King Crab Leg (6/9)](https://www.lamer.ca/en/products/patte-crabe-royal), current product page. | Page title is `King Crab Legs`; its item description says cooked/frozen and instructs the buyer to thaw and shuck. It does not provide a scientific taxon, so no species is assigned. Package options and the page’s product-specific size claims are not reused as measures or conversions. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S07** | Metro Québec, [Patte de crabe des neiges, item 840152300098](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/patte-de-crabe-des-neiges/p/840152300098). | Current indexed French listing displays `Patte de crabe des neiges`, item 840152300098, and 680 g. Direct page retrieval returned 403; rely only on the indexed product title/SKU, not on price, inventory, ingredients, or product contents. The item-specific weight is not a recipe measure. |
| **Reused `WP04-GENERIC-CRAB-20261012-S01`** | CFIA, [Fish List lookup for crab](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab), modified 2023-09-18. | Lists 80 results, including broad `Crab / Crabe` common names across multiple taxa and crab-specific names. Supports avoiding a species assignment for the cut row; it does not define a crab-leg product. |
| **Reused `WP04-SECTIONP-CRAB-CLAWS-R435-20261017-S02`** | Poissonnerie La Mer (Montréal), [Crabe vivant, frais ou congelé collection](https://www.lamer.ca/collections/crabe), current Québec-market page. | The collection describes snow crab as available frozen in legs or meat and lists king-crab legs, snow-crab section products, and snow-crab leg meat separately. Product stock and listing details can change; reuse only for these product-name/category distinctions. |
| **Reused `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S07`** | Metro, [Frozen king-crab legs and claws, item 731149112292](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/crabe-royal-pattes-et-pinces-surgelees/p/731149112292), R3 proposal source. | The indexed seller title joins legs and claws for a 500 g frozen item, without a species binomial; direct retrieval previously returned 403. It is mixed-product naming evidence only, not a measure or standalone leg sample. |
| **Reused `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S06`** | Metro, [Pattes et pinces de crabe royal cuites, item 248545](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/pattes-et-pinces-de-crabe-royal-cuites/p/248545), R4 proposal source. | The indexed retailer name joins legs and claws and showed approximately 400 g at the prior review; direct retrieval was unavailable. This is a species-qualified, mixed-cut product listing, not a generic identity or reusable number. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-R01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6751), live references/forms/legacy candidates/research ledger, source URL and ID inventory, crab proposals and batches, picker implementation, package-yield/substitution files, manifest, and all recipe files. | Confirms the current snapshot, exact ownership and allocation checks, picker projection, and 114-file/1,123-row scan. It is repository evidence and does not extend external source claims. |

## Final disposition and integration recommendation

Accepted and integrated as identity-only `crab legs / pattes de crabe` with the exact display and singular aliases above. The Québec terminology source recognizes the leg as a marketable crab part, while current local retail evidence shows the cut sold across snow-crab and king-crab markets. The identity remains species-neutral and distinct from claws, picked leg meat, crab meat, prepared crab cakes, and snow-crab sections/clusters.

The bundle contains no leg-specific demand. No form, measurement, density, conversion, yield, recipe link, or substitution rule was added. The generic-crab and snow-crab holds remain unchanged. See the integration README for final counts and static validation results.

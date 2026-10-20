# WP04 Section P — sturgeon caviar / caviar d’esturgeon product-boundary review (round 34)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** product-identity, Canadian and Québec naming, exact ownership, picker, recipe-demand, and numeric-evidence review; integrated as a documentation-only hold.
- **Recommendation:** Hold a sturgeon-caviar reference until a bundled recipe selects the product. Keep it distinct from other fish roe and finger-lime “caviar”; add no active row, alias, form, measurement, recipe link, conversion, yield, or substitution now.
- **Write scope:** This proposal, the Section P checklist and progress record, the active roadmap, and a batch README. No shared catalog JSON, research ledger, recipe, or code file changed.
- **Integration:** The completed review is recorded under the open roe/caviar checklist item; sturgeon caviar remains outside the catalog and ledger pending recipe demand.

## Open gap and bounded decision

The live [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4220) still has the parent item “Roe, tobiko, masago, salmon roe, bottarga, and caviar where recipes call for them.” Its salmon-roe, bottarga, and lumpfish-roe reviews leave sturgeon caviar as a distinct neighboring product, without allocating an identity or reviewing this product’s own Québec naming and picker effect. This packet advances only the sturgeon-caviar boundary; it does not reopen those decisions or the separate fish-powder, fish-ball, and surimi work.

The bounded candidate is the salted roe product sold as **sturgeon caviar / caviar d’esturgeon**. OQLF defines *caviar* as preserved, salted fish eggs, particularly sturgeon, and says products made from other fish are qualified by the fish name. A current Québec retailer uses *caviar d’esturgeon* and lists several sturgeon caviars alongside salmon, trout, and other fish caviars; a Canadian producer calls its product Canadian sturgeon caviar. These support the candidate bilingual wording as current commercial usage, but the exact pair is not an OQLF headword pair. [S01–S03]

Do not infer one sturgeon species, origin, farming status, grade, colour, or curing specification. The Canadian producer lists farmed shortnose sturgeon and wild Atlantic sturgeon products separately; the Québec retailer offers additional market names such as Oscietra, Siberian, and Beluga. Those observations support a broad sturgeon-roe product boundary, not a species identity or a universal formulation. Keep salmon/trout/lumpfish roe, tobiko, masago, bottarga, sea-urchin roe, whole sturgeon, and finger lime separate. [S02–S04]

The corpus contains no sturgeon-caviar recipe demand, and a hypothetical row would add a second result for the already broad `caviar` query. Keep the candidate unallocated until a bundled recipe names it. Do not use bare `caviar`, `caviar noir`, `black caviar`, `roe`, fish-species names, or other roe products as aliases. The OQLF terminology entry documents general usage; it does not establish every one of those phrases as a safe product-specific alias. [S01]

## Prior work and exact ownership

The [salmon-roe review](wp04-section-p-salmon-roe-ikura-product-boundary-review-20261013-round33.md), [lumpfish-roe review](wp04-section-p-lumpfish-roe-caviar-product-boundary-review-20261012.md), [tobiko/masago review](wp04-tobiko-masago-roe-boundary-review-20261009.md), and [bottarga recheck](wp04-bottarga-coordinator-recheck-20261009.md) distinguish caviar or sturgeon caviar as a neighboring product, but do not assign this candidate an active identity. Their broader no-demand findings do not replace the current ownership, picker, and manifest scan below.

Exact checks covered active reference names and aliases, every form label and match term, legacy candidate names and aliases, ledger record IDs, and the proposal-local source prefix. The live snapshot contained **1,365 active references, 100 forms, 64 legacy candidates, and 1,699 ledger records** at integration time.

| Candidate term or ID | Active reference / form owner | Legacy owner | Ledger owner |
|---|---|---|---|
| `sturgeon caviar`; `caviar d’esturgeon`; `sturgeon roe`; `œufs d’esturgeon` | None | None | None |
| `caviar noir`; `black caviar`; `fish roe`; `fish eggs` | No exact candidate owner | None | No exact sturgeon-caviar candidate |
| `ingredient-ref-sturgeon-caviar`; `candidate-sturgeon-caviar` | None | None | None |
| `WP04-SECTIONP-STURGEON-CAVIAR-20261013-R34-S…` | Not applicable | Not applicable | Unallocated; prefix checked against the live catalog archive |

The active reference `ingredient-ref-finger-lime` is displayed as **finger lime / lime caviar** and has French alias `citron-caviar`; it is the current `caviar` query result, not an owner of sturgeon caviar. The active `ingredient-ref-greenland-halibut` is displayed as **Greenland halibut / flétan du Groenland**; `roe` currently reaches it only through `roe` being a substring of `Groenland` in the fallback search. The only roe-related ledger record ID found was `candidate-salmon-roe`, which is not an allocation for this candidate.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are tried first, then substring fallback. It compares the live 1,365 references plus 100 forms with one hypothetical display-only row **sturgeon caviar / caviar d’esturgeon**, without aliases or forms. The candidate is not active.

| Query | Current result | Hypothetical result | Picker effect |
|---|---|---|---|
| `sturgeon caviar` | None | Sturgeon caviar / caviar d’esturgeon | Exact product phrase becomes a singleton. |
| `caviar d’esturgeon` | None | Sturgeon caviar / caviar d’esturgeon | Exact Québec French product phrase becomes a singleton. |
| `sturgeon` | None | Sturgeon caviar / caviar d’esturgeon | A broad fish-name query would also surface the roe product; the result remains explicitly qualified. |
| `caviar` | Finger lime / lime caviar | Finger lime plus sturgeon caviar | The generic query expands to two visibly different products. |
| `roe` | Greenland halibut / flétan du Groenland via substring fallback | Greenland halibut / flétan du Groenland | Unchanged because the candidate display has no `roe` term. |
| `sturgeon roe`; `œufs d’esturgeon`; `caviar noir`; `black caviar` | None | None | No corresponding alias or form is proposed. |

The exact candidate query would be useful if a recipe selected this product. The bare `caviar` query would combine a citrus fruit and a fish product; no bundled recipe currently requires the new result. Keep the row out of the picker pending recipe demand and exact product context.

## Bundled recipe demand

The live manifest lists **114 recipe files and 1,123 ingredient rows**. The scan covered each manifest-listed parsed recipe document and all ingredient-row fields, including `ingredientName`, `originalText`, and reference/form identifiers. Normalized search covered `sturgeon caviar`, `caviar d’esturgeon`, `sturgeon roe`, `œufs d’esturgeon`, generic `caviar`, `roe`, `fish roe`, `fish eggs`, `Acipenser`, and nearby sturgeon-caviar market terms including `Ossetra`, `Oscietra`, `Beluga`, and `Sevruga`. It found **zero matching recipe files and zero matching ingredient rows**. No recipe link or recipe amount is supported.

## Measures, numeric limits, and substitutions

Maison Fayard’s current Oscietra product page identifies one seller SKU as 96% roe from *Acipenser gueldenstaedtii* plus salt, with French origin. Its options label 10 g for 1 person, 30 g for 3, 50 g for 5, and 100 g for 10 as “Tasting” sizes. These are product- and seller-specific packaging/serving labels, not recipe evidence or a universal portion. Acadian Sturgeon and Caviar Inc. lists 30–1,800 g tins for both its farmed shortnose and wild Atlantic caviar products; those are package sizes, not servings or yields. [S03–S04]

Health Canada’s older *Nutrient Value of Some Common Foods* table has a broad “Caviar, black or red” entry of **15 mL = 16 g**. It names no sturgeon species or exact formulation and cannot establish density or a conversion for this candidate. No reviewed source gives an exact-candidate density, household measure, package yield, or recipe-specific amount. Keep density unset and unit mappings empty. [S05]

No reviewed source or bundled recipe establishes an equal-amount substitution among sturgeon caviar, salmon/trout/lumpfish roe, tobiko, masago, bottarga, sea-urchin roe, or finger lime. These products differ in source and product form; do not infer a species relationship or substitute rule from the shared “caviar” wording. Add no global or contextual substitution rule and no recipe-line substitution link.

## Recommended next action

Leave the sturgeon-caviar candidate unallocated and keep the Section P parent item open. Revisit when a bundled recipe explicitly selects sturgeon caviar and provides enough surrounding context to distinguish it from other roe or a citrus “caviar” ingredient. Then review that recipe line and its matching package label together, decide whether the candidate deserves an active row, and rerun the picker projection before adding any aliases or numeric data.

## Source register

Sources were accessed on 2026-10-13. Source IDs are local to this proposal.

| ID | Source | Evidence used | Limit |
|---|---|---|---|
| **WP04-SECTIONP-STURGEON-CAVIAR-20261013-R34-S01** | Office québécois de la langue française, [GDT: caviar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428361/caviar), entry last updated 1983; “Définition,” “Note,” “Termes privilégiés,” and English “Termes.” | Defines caviar as preserved (salted) fish eggs, particularly sturgeon; says other fish caviars are qualified by fish name; lists `caviar`, `caviar noir`, `caviar`, `caviare`, and `black caviar`. | Official Québec terminology, but old and general; not a modern legal standard, a species identification, a formulation, or proof that all listed variants are safe aliases for this catalog row. |
| **WP04-SECTIONP-STURGEON-CAVIAR-20261013-R34-S02** | Poissonnerie La Mer, [Caviars collection](https://www.lamer.ca/collections/caviars), heading “Caviars d’esturgeon de première qualité” and collection description; [Caviar Acadian Emerald product page](https://www.lamer.ca/products/caviar-acadian-green), product description. | The collection currently uses `caviars d’esturgeon`, identifies Québec, New Brunswick, and British Columbia product origins, and distinguishes salmon, trout, and other fish caviars in the same assortment. The product page uses singular `caviar d’esturgeon` for one shortnose-sturgeon SKU. | Retailer category and product copy; the SKU page may not reflect current stock and does not define one species, processing method, or universal product. |
| **WP04-SECTIONP-STURGEON-CAVIAR-20261013-R34-S03** | Acadian Sturgeon and Caviar Inc., [Products](https://www.acadian-sturgeon.com/products/), sections “STOCKING MATERIAL” and “STURGEON & CAVIAR.” | Canadian producer lists Atlantic sturgeon (*Acipenser oxyrinchus*) and shortnose sturgeon (*A. brevirostrum*), separates farmed shortnose from wild Atlantic caviar, and gives package options from 30 to 1,800 g. | Producer product descriptions and packaging; not an independent species assessment, household portion, or recipe measure. |
| **WP04-SECTIONP-STURGEON-CAVIAR-20261013-R34-S04** | Maison Fayard, [Oscietra Caviar](https://www.maisonfayard.ca/en/products/caviar-oscietre), “Ingredients,” “Origin,” and weight/serving variants. | One Québec-available product page identifies 96% *Acipenser gueldenstaedtii* roe and salt, French origin, and 10/30/50/100 g options labelled for 1/3/5/10 people. | One exact seller SKU and its tasting labels; not a universal portion, density, or formulation. |
| **WP04-SECTIONP-STURGEON-CAVIAR-20261013-R34-S05** | Health Canada, [Nutrient Value of Some Common Foods](https://publications.gc.ca/collection_2009/sc-hc/H164-49-2008E.pdf), p. 34, “Caviar, black or red.” | Gives a volume/weight observation of 15 mL and 16 g for the broad table entry. | 2008-era generic black-or-red data; no species or product formulation. Excluded from the candidate’s density or unit mapping. |

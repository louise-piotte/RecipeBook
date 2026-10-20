# WP04 Section P — herring rollmops product-boundary review (round 45)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only Canadian/Québec product naming, active ownership, picker, bundled-recipe demand, and numeric/substitution review.
- **Recommendation:** Hold herring rollmops outside active references and forms until a bundled recipe requests the product. Add no active identity, alias, form, measure, density, unit mapping, recipe link, conversion, yield, or substitution now.
- **Write scope:** This proposal file only. No shared catalog, ledger, checklist, roadmap, recipe, code, or batch README was changed. No tests were run.
- **New source-ID prefix:** `WP04-SECTIONP-HERRING-ROLLMOPS-20261013-R45-`. The prefix was absent from the live ledger and checked archive before this packet; the source IDs below remain local to this proposal.

## Bounded gap and decision

The live [preserved-fish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207) leaves exact preserved seafood products open. The broader [preservation-state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) kept generic fish-preservation forms inactive without an exact recipe or product request. This packet reviews one named product boundary not decided there or in the adjacent [Fumoir d’Antan smoked-scallop review](wp04-section-p-fumoir-dantan-smoked-scallop-product-boundary-review-20261013-round44.md): **herring rollmops**.

Québec terminology identifies *rollmops* as a vinegar-marinated herring fillet rolled around a pickle. Feature Foods currently lists a Canadian-market product titled **Herring Rollmops** and describes its marinated, boneless herring fillets rolled around dill pickles with onion in a tangy sauce. A Québec-facing French retail listing calls the product **Rollmop de hareng**. This supports a recognizable prepared product with a boundary from plain herring and generic marinated herring. It does not identify the herring species in the Feature Foods SKU or prove that every rollmops product has the same preparation. [S01–S04]

Keep this product unallocated until a bundled recipe selects it. If a recipe later calls for rollmops, resolve the exact recipe wording and whether it means a ready-to-serve rolled product or a home-preparation ingredient. The live catalog has only species-qualified Atlantic and Pacific herring references, not a generic herring owner; the current sources do not justify assigning this product to either species. Do not extend the Feature Foods details to other producers or all pickled herring products.

## Naming and product boundary

| Wording or evidence | What it supports | Limit |
|---|---|---|
| **Herring Rollmops** | Feature Foods' current English product title. Its page describes boneless, skin-on, marinated herring fillets rolled around dill pickles, with onion and a tangy sauce. [S03] | A named maker's finished product. The page does not give a scientific species or show that other makers use the same formulation. |
| **rollmops** | OQLF's preferred Québec French term, masculine noun, for a marinated herring fillet rolled around a pickle. It lists English equivalents `rollmop`, `rollmops`, and `rollmop herring`. [S01] | The OQLF definition establishes the culinary term, not the contents or taxon of an individual retail package. |
| **Rollmop de hareng** | Current French-language Your Independent Grocer listing for a Feature Foods 320 g product. [S04] | Retail wording for one product listing; the page is not a Québec retailer and does not identify the fish species. |
| **Hareng mariné / pickled herring** | Broader product wording used for multiple herring preparations. TERMIUM distinguishes rollmops from marinated herring pieces and other named herring products. [S02] | Do not use these broad phrases as aliases for rollmops or infer that every pickled herring item is rolled around a pickle. |

Keep herring rollmops separate from Atlantic or Pacific herring as raw species identities, unrolled pickled herring fillets, smoked herring, and salted herring roe such as kazunoko. The Feature Foods ingredient list includes herring, dill pickles, onion, water, sugar, vinegar, salt, and spices; this is a composite prepared product, not a plain-fish synonym. Its catch-area statement names the Gulf of St. Lawrence and North Atlantic, but not a biological species. [S03]

## Exact ownership audit

The live package contains **1,370 ingredient references**, **100 forms**, **64 legacy candidates**, and **1,700 research-ledger records** with **6,651 source entries / 5,575 distinct source IDs**. The ownership audit checked normalized exact terms across active display names and aliases, form labels and match terms, legacy candidate names and aliases, ledger record text and source IDs, and the proposal/archive and current plan.

| Exact term or owner | Current owner and effect |
|---|---|
| `ingredient-ref-atlantic-herring` | Active `PROTEIN` reference **Atlantic herring / hareng de l’Atlantique**. No aliases or attached forms. Its species identity does not establish the species of the Feature Foods rollmops. |
| `ingredient-ref-pacific-herring` | Active `PROTEIN` reference **Pacific herring / hareng du Pacifique**. No aliases or attached forms. Its species identity does not establish the species of the Feature Foods rollmops. |
| `rollmops`; `rollmop`; `herring rollmops`; `rollmop herring`; `rollmop de hareng`; `hareng mariné`; `pickled herring` | No exact active reference, form, legacy candidate, or dedicated ledger product candidate owns these keys. The ledger has separate Atlantic- and Pacific-herring identity records only. |
| Generic herring | No active generic `herring / hareng` reference exists. The two current species-specific herring references are the only exact owners for the English `herring` and French `hareng` queries. |

The exact term and source-prefix scans found no prior rollmops-specific Section P proposal or source-ID collision. Kazunoko's separate salted-roe hold remains unchanged; it does not own whole herring or prepared rollmops. No ledger candidate or source record is created by this proposal.

## Picker/search projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, fold `œ`/`æ`/`ß` and `&`, remove combining marks, normalize punctuation and spaces, prefer complete word-phrase matches, and use substring matching only if there are no phrase matches.

For impact analysis only, the hypothetical product row uses English display **Herring rollmops**, Québec French display **rollmops**, English alias `rollmop herring`, and French retail alias `rollmop de hareng`. It adds no generic `pickled herring` or `hareng mariné` alias. This is not a request to integrate the row.

| Query | Current results | With hypothetical row |
|---|---|---|
| `herring` | Atlantic herring; Pacific herring | The same two plus herring rollmops |
| `hareng` | Atlantic herring; Pacific herring | The same two plus herring rollmops |
| `rollmops`; `rollmop`; `herring rollmops`; `rollmop de hareng` | No result | Herring rollmops only |
| `pickled herring`; `hareng mariné` | No result | No result; the proposed terms do not equate all pickled herring with rollmops |
| `herring roe` | No result | No result; rollmops would not absorb kazunoko or other roe |

A row would add a third result to both broad herring searches and make the exact product phrase searchable, while leaving broader pickled-herring wording unresolved. With no recipe demand, keep the active picker unchanged.

## Bundled recipe demand

The full manifest-listed corpus contains **114 recipe files and 1,123 ingredient rows**. Every complete UTF-8 recipe document and every ingredient row was scanned for `rollmops`, `rollmop`, `herring`, `hareng`, `pickled herring`, `hareng mariné`, and related product phrases. The scan found **zero matching recipe files and zero matching ingredient rows**. No bundled recipe link, preparation role, or product-quantity requirement supports this identity. [R01]

An external *Seafood from Canada* recipe prepares rollmops from herring fillets, salt, brine, vinegar, wine, spices, and onion, and states a yield of three 500 ml jars. This is an external home-preparation recipe, not a bundled recipe and not the ready-to-serve Feature Foods retail product. Its listed `12 (60 g)` fillet quantity does not specify whether the mass applies per fillet or to the group. Do not use those details as a retail-product serving, mass conversion, or catalog measure. [S05]

## Numeric and substitution limits

The current French-language retailer listing shows a **320 g** Feature Foods package. That is package quantity evidence only. The manufacturer product page identifies a UPC and ingredients but gives no net weight, drained weight, household volume, or serving mass. The retailer nutrition display's `0 g` portion label is malformed/inapplicable as a portion and supplies no serving standard. Do not infer one fillet's mass, a number of rollmops per package, a density, or a volume-to-mass mapping from the package listing. [S03–S04]

The external three-jar home recipe is a different source-specific preparation, not a conversion or yield observation for the retail item. No reviewed source or bundled recipe compares rollmops with plain herring, unrolled marinated herring, smoked herring, salted fish, or kazunoko as substitutes. Add no global form conversion, contextual substitution, warning, recipe-line substitution, package yield, drained yield, or cooking yield.

## Next action

Keep herring rollmops outside active references and forms, and leave the Section P preservation item open. Revisit when a bundled recipe names rollmops or another exact ready-to-serve herring product. Then compare the recipe wording with a current package, determine whether the needed identity is rollmops or a different marinated herring preparation, and verify species only from product-specific evidence. Do not attach this product to an Atlantic- or Pacific-herring species on catch-area wording alone.

## Source register

Online sources were checked on 2026-10-13. New source IDs are local to this proposal and are not ledger entries.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-HERRING-ROLLMOPS-20261013-R45-S01** | Office québécois de la langue française, [GDT: rollmops](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26500049/rollmops), preferred term, definition, and English equivalents; updated 2016. | Supports Québec French `rollmops` and the defining herring-fillet / vinegar / pickle boundary. It does not establish any manufacturer's ingredient list, fish species, amount, or recipe substitution. |
| **WP04-SECTIONP-HERRING-ROLLMOPS-20261013-R45-S02** | Government of Canada, TERMIUM Plus, [hareng mariné search record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=HARENG+MARINE), record 1 `rollmops`, English and French definitions. | Identifies `rollmops` as a distinct marinated herring preparation and differentiates it from cut-lunch pieces and named herring styles. Terminology evidence, not a current Canadian package label. |
| **WP04-SECTIONP-HERRING-ROLLMOPS-20261013-R45-S03** | Feature Foods International, [Herring Rollmops](https://featurefoods.ca/products/0-herring-rollmops), title, UPC `063723120110`, product description, catch area, ingredients, shelf-life line. | Current manufacturer page describes its ready-to-serve rolled herring product, its ingredients, catch area, and refrigeration. It gives no scientific species, net weight, portion, density, or product-wide rollmops specification. |
| **WP04-SECTIONP-HERRING-ROLLMOPS-20261013-R45-S04** | Your Independent Grocer, [Feature Foods Rollmop de hareng, 320 g](https://www.yourindependentgrocer.ca/fr/rollmop-de-hareng/p/20764945_EA?source=nspt), product title, bilingual-store listing, package size and availability. | Supports one Canadian retailer's French product wording and 320 g package. The listing shown was for an Ontario store, not a Québec shop; its `0 g` nutrition portion display is not serving evidence. |
| **WP04-SECTIONP-HERRING-ROLLMOPS-20261013-R45-S05** | Seafood from Canada, [Rollmops: Herring in Spiced Vinegar](https://seafoodfromcanada.ca/recipe/rollmops-herring-in-spiced-vinegar/), ingredient list, jar yield, and method. | A Canadian external recipe demonstrates home preparation from herring fillets and states three 500 ml jars. Its unclear `12 (60 g)` line and differing homemade marinade do not establish a portion, product equivalence, or conversion for the retail SKU. |
| **WP04-SECTIONP-HERRING-ROLLMOPS-20261013-R45-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), and archive/plan exact-key scan. | Static ownership and corpus audit: 1,370 references, 100 forms, 64 legacy candidates, 1,700 ledger records, and 114 recipes / 1,123 ingredient rows. No exact rollmops owner or recipe match. |

The proposal assigns source IDs S01–S05 and corpus-audit ID R01 under the unique R45 prefix. No shared catalog, ledger, checklist, roadmap, recipe, code, or batch file was changed.

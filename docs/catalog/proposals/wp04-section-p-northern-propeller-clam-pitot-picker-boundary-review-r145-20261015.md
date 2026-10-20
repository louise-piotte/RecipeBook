# WP04 Section P — Northern propeller clam / pitot picker-boundary review (R145)

- **Review date:** 2026-10-15.
- **Open checklist item:** “Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below” in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5377).
- **Candidate:** Northern propeller clam / **pitot**, *Cyrtodaria siliqua*.
- **Disposition:** **Hold this species row outside active references and the research ledger.** OQLF and Canadian sources establish the species-qualified English and Québec French names, and a Canadian seafood-export directory lists frozen raw or blanched meats in both its English and French pages. However, the English display necessarily contains generic `clam`; a row would make that broad query return one species while the generic clam candidate remains unresolved. The recipe bundle has no matching ingredient demand.
- **Data outcome:** No catalog, form, ledger, legacy-identity, recipe-link, numeric, plan, roadmap, or generated data changed. This proposal-only review required no tests.

## Scope and prior-work boundary

This review covers *Cyrtodaria siliqua* specifically. Exact searches of the Section P plan and proposal/batch archive, current ingredient references and forms, research ledger, and legacy-import identities found no prior focused *C. siliqua* review or allocation. The existing unresolved `ingredient-ref-clam` candidate and generic-clam hold discuss broad clam terminology, but do not name or decide the pitot identity. [R143](wp04-section-p-atlantic-surf-clam-picker-boundary-review-r143-20261015.md) reviewed Atlantic surf clam (*Spisula solidissima*), and [R144](wp04-section-p-next-shellfish-identity-gap-review-r144-20261015.md) reviewed Greenland cockle (*Serripes groenlandicus*); this is a separate bivalve. Section P remains open.

At the review snapshot, the bundled catalog has 1,501 ingredient references and 118 forms; no live reference, form, legacy mapping, or ledger record uses *Cyrtodaria siliqua*, `pitot`, `pitot nordique`, `northern propeller clam`, or `Banks clam`. Preserve the existing unresolved [generic-clam ledger candidate](../research-ledger.v1.json) without creating a separate species record.

## Identity and Québec/Canadian naming

ITIS recognizes *Cyrtodaria siliqua* (TSN 81763) as a valid species and lists `northern propellerclam` as an English common name. CFIA uses the same binomial and TSN. OQLF’s GDT entry, updated in 2012, gives the Québec preferred term **pitot**, explicitly pairs it with *C. siliqua*, and gives **Banks clam** and **northern propeller clam** as English terms. The entry says **couteau de Banks** is used in some contexts but was not retained by Québec’s fishing-products terminology committee. Use **pitot** as the French display; do not use `couteau de Banks` as a catalog alias.

CFIA lists **Clam / Pitot** for *C. siliqua* and separately lists **Northern Propeller Clam** without French. This is Canadian label evidence, not the Québec naming authority. Fisheries and Oceans Canada’s offshore-clam plan uses **pitot** and says pitots may also be called **couteaux de Banks**. For Québec display and aliases, follow OQLF’s distinction and keep the rejected wording out.

The Canadian Seafood from Canada export-directory page lists the species as **Clams, Northern Propeller (Mirugai)** and gives frozen raw or blanched meats. Its French page lists the same binomial under **Couteau de Banks (Mirugai)** and gives the same product forms. The forms agree across the two pages, but the French page uses wording OQLF did not retain as Québec’s standardized consumer-facing fish-product term. This is Canadian export-category evidence, not a named retailer SKU or proof of current Québec shelf stock. DFO’s 2020 offshore-clam plan describes pitot as retainable, non-quota bycatch. DFO’s 2024 fishery update says the fishery moved to 100% retention of northern propeller clam in August 2021 and reports landings through 2023. This is evidence of Canadian harvest and retained food product, not a harvest prohibition or a directed fishery; it does not establish retail availability in Québec. The hold is not based on an inference that no Canadian food product exists.

## Current ownership and picker projection

The projection follows phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). References are searchable through their bilingual display names and aliases, plus attached form terms; the scientific name is not a distinct searchable field. The hypothetical row uses the useful bilingual display **Northern propeller clam / pitot**, with supported query aliases **Banks clam** (OQLF) and **pitot nordique** (Québec culinary-education source), and no forms. This is only a picker projection, not an activation proposal.

| Query | Current results | With the hypothetical display-only row | Consequence |
|---|---:|---:|---|
| `Northern propeller clam` | 0 | 1 | Species-qualified English choice. |
| `pitot` | 0 | 1 | OQLF-preferred Québec French choice. |
| `pitot nordique` | 0 | 1 | Québec culinary-education source’s culinary name; a possible query alias. |
| `Banks clam` | 0 | 1 | OQLF English equivalent; a possible query alias. |
| `clam` | 0 | 1 | Would make one clam species appear to resolve the generic clam query. |
| `Cyrtodaria siliqua` | 0 | 0 | The scientific name is not a searchable field in this reference schema. |
| `couteau de Banks` | 0 | 0 | Excluded under OQLF’s note that this term was not retained for Québec fishing-product terminology. |

Every supported English species name contains `clam`; removing the broad term from aliases cannot remove it from the English display name. A Latin-only display would not be a useful bilingual culinary identity. Keep the species outside the active picker until the generic clam scope can be represented without making this one species appear to be the complete clam choice.

## Recipe demand, product forms, and numeric/substitution limits

The scan followed all **114** recipe paths in the bundled [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), parsed all **1,123** `ingredients[]` rows, and inspected only `ingredientName` and `originalText`. It did not count titles, instructions, notes, or other JSON text. Case, accents, punctuation, and whitespace were normalized. Terms covered *Cyrtodaria siliqua*, northern propeller clam, propeller clam, Banks clam, pitot, pitot nordique, pitot du plateau néo-écossais, pitot du banc Banquereau, couteau de Banks, Mirugai, and clam. Result: **0 matching ingredient rows in 0 recipe files**.

The Seafood from Canada English and French listings both give frozen raw or blanched meats, without package amounts. Do not create forms while the species row is held outside the picker. DFO’s 2020 plan reports the then-generalized 5.5 factor. The most recent specific DFO update located in this review supersedes it for the 2023 fishery: **3.84** applies to blanched pitot siphon to convert landed product weight to whole-animal round weight for offshore-fishery monitoring. This is a fisheries quota-control factor, not a culinary yield or serving conversion, and should not be added to recipe data. DFO’s shell-length and biological figures are for identification and fisheries management, not recipe measures. No source reviewed provides a reusable culinary edible weight, serving amount, density, package conversion, unit mapping, or cooking yield. No recipe or source supports a substitution between pitot and another clam or seafood. Add no forms, culinary numeric values, or substitution rules.

## Source register

Sources were accessed on 2026-10-15 unless a source-specific date is stated. Source IDs are local to this proposal and were not added to the ledger.

| Source ID | Direct source and locator | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-NORTHERN-PROPELLER-CLAM-R145-20261015-S01` | ITIS, [*Cyrtodaria siliqua* report, TSN 81763](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=0081763), taxonomy and nomenclature. | Lists valid current standing and common English `northern propellerclam`; taxonomy evidence, not Québec consumer wording. |
| `WP04-SECTIONP-NORTHERN-PROPELLER-CLAM-R145-20261015-S02` | OQLF, [pitot, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199082/pitot), updated 2012; zoology/malacology and edible mollusc. | Preferred Québec term **pitot**, Latin *Cyrtodaria siliqua*, English **Banks clam** and **northern propeller clam**. Says **couteau de Banks** was not retained by the fishing-products terminology committee. |
| `WP04-SECTIONP-NORTHERN-PROPELLER-CLAM-R145-20261015-S03` | CFIA, [Fish List lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSN 81763; accessed 2026-10-15 (page footer says data modified 2023-09-18). | Lists `Clam / Pitot` and `Northern Propeller Clam` with no French for the latter. Canadian labeling evidence; not a Québec preference decision. |
| `WP04-SECTIONP-NORTHERN-PROPELLER-CLAM-R145-20261015-S04` | Fisheries and Oceans Canada, [Offshore clam management plan, French](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/clams-palourdes/2020/offshore-hauturieres-fra.html), Introduction, §2.1.2, §2.7, §4.3, and §7.1.1. | Identifies pitot as *Cyrtodaria siliqua*, says the fishery retains it as non-quota bycatch, and records the former generalized 5.5 fishery-monitoring factor. The 2020 plan predates the 2023 species-specific factor documented by S06; neither value is a recipe measure. |
| `WP04-SECTIONP-NORTHERN-PROPELLER-CLAM-R145-20261015-S05` | Seafood from Canada, [Other Species Exports (English)](https://seafoodfromcanada.ca/seafood/other-species/), “Clams, Northern Propeller (Mirugai),” *Cyrtodaria siliqua*; [Autres espèces (French)](https://seafoodfromcanada.ca/fr/seafood/autres-especes/), “Couteau de Banks (Mirugai),” same binomial. | Both language pages list frozen raw or blanched meats. Establishes a species-specific Canadian export-directory product listing, but the pages do not identify a retail SKU or prove Québec stock. The French heading does not replace OQLF’s preferred Québec term **pitot**. |
| `WP04-SECTIONP-NORTHERN-PROPELLER-CLAM-R145-20261015-S06` | Fisheries and Oceans Canada, [Stock Status Update of Arctic Surfclam on Banquereau and Grand Bank to the End of the 2023 Fishing Season](https://publications.gc.ca/collections/collection_2025/mpo-dfo/fs70-7/Fs70-7-2024-038-eng.pdf), Maritimes Region Science Response 2024/038, pp. 3 and 12–13. | Identifies northern propeller clam as *Cyrtodaria siliqua*, states the species moved to 100% retention in August 2021, reports landings through 2023, and documents 3.84 for blanched siphon to round weight in the 2023 fishery. This supports Canadian harvest/retention and the latest specific fisheries-monitoring factor located, not Québec retail availability or a culinary conversion. |
| `WP04-SECTIONP-NORTHERN-PROPELLER-CLAM-R145-20261015-S07` | De l’eau à la bouche, [Pitot nordique](https://deleaualabouche.ca/especes/pitot-nordique/), “Nom” and “Nom en cuisine” sections. | A Québec culinary-education page pairs **pitot nordique** with *C. siliqua* and uses it as the culinary name; it also describes onboard blanching and freezing, but is not a seller/SKU. OQLF’s standardized Québec display remains **pitot**. |

## Recommendation and data delta

Hold *Cyrtodaria siliqua* outside active references, forms, legacy mappings, and the research ledger for this pass. Preserve the unresolved `ingredient-ref-clam` candidate. Revisit if the picker can keep broad `clam` searches from appearing complete while a single species row is active, or a recipe requires a deliberately species-qualified choice. The Canadian export directory supports frozen raw/blanched meats as product forms, but it does not provide a retail SKU or culinary quantity; re-evaluate forms only if a species row is later activated.

**Exact proposed data delta: none.** Add zero ingredient references, aliases, forms, ledger records or sources, legacy identities, recipe links, measures, unit mappings, conversions, yields, and substitutions. Section P remains open.

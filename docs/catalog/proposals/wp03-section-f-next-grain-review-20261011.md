# WP03 Section F Barnyard Millet Identity and Québec Naming Hold

## Packet record

- **Reviewed and accessed:** 2026-10-11.
- **Status:** proposal only. This packet changes no canonical catalog, ledger, recipe, plan, checklist, roadmap, package, or test file.
- **Scope:** one still-unrepresented Section F product class, barnyard millet, with a narrow audit of its food-grain identity and Québec French display name.
- **Disposition:** keep the candidate on hold. The English food-grain name is supported, but the cited standards and agriculture sources do not agree on the species scope, and no Québec food label establishes one French display for that scope.
- **Snapshot audited:** 888 active references, 48 forms, 114 manifest-listed recipes with 1,123 ingredient rows, 1,138 ledger records, and 77 legacy candidates.

This review excludes identities or boundaries already covered in the October 10–11 work: little millet, brown-top millet, puffed wheat, dried sweet corn, ordinary corn grits, farro, white rice, rye berries, kodo millet, pearl millet and its flour, pot/Scotch barley, sushi rice, pearled hominy, pozole corn, buckwheat and quinoa flakes, puffed amaranth/millet/quinoa, barley flakes, granola/muesli, and the other reviewed grain/cereal products. It does not reopen those decisions.

## Why this is a distinct remaining candidate

The live Section F checklist still leaves its species-level millet review open. The active catalog contains generic `millet / millet` plus common, finger, foxtail, kodo, pearl, and puffed millet identities; it has no barnyard-millet reference. No earlier WP03 proposal makes a barnyard-millet identity or naming decision. The October 10 little-millet packet mentions barnyard millet only as a neighboring crop in a Health Canada crop-group list; that is not a review of the food product. The brown-top and little-millet packets remain separate holds.

The name is present in food-product evidence. FSSAI's group standard applies to whole or dehulled millets and lists barnyard millet, while a current Canadian product page sells a packaged grain under the English name `Barnyard Millet`. The evidence is enough to keep the candidate in the open Section F set, but not enough to choose one species set and one Québec French picker name.

## Identity and naming decisions

| Candidate or wording | Proposed decision | Evidence boundary |
| --- | --- | --- |
| `barnyard millet` | Retain as the English research-candidate name; do not create an active row yet. | FSSAI uses this name for a whole/dehulled millet food-standard class, ICAR uses it for cultivated food-grain species, and a Canadian seller uses it on a human-food grain product. These sources do not identify one shared species scope. |
| `ingredient-ref-barnyard-millet` | Do not allocate yet. | The proposed future key is only a placeholder for review. The record should not be created until its species scope and fr-CA display are settled. |
| fr-CA display | **Unresolved; add none.** | OQLF's `millet` entry is generic. Québec agricultural sources use `millet japonais` for *Echinochloa frumentacea*, while FAO uses that French name for *E. esculenta*. ICAR distinguishes those as Indian and Japanese barnyard millets. Neither Québec agricultural usage nor the international food/crop naming resolves a French food label for the broader barnyard class. |
| `millet japonais` / `millet du Japon` | Do not use as the display or alias for this candidate. | The expression is species-sensitive and differs across sources: Québec crop sources associate it with *E. frumentacea*; FAO associates it with *E. esculenta*. It is not an unambiguous French equivalent of the candidate class. |
| `millet`, `mil`, `petit mil` | Keep on their existing broader identity/terminology boundary; do not attach them to this candidate. | OQLF treats these as generic millet terms. The earlier little-millet review explicitly withholds `petit mil` because Québec usage also reaches other millet species. |
| `Samakechawal`, `Sawa`, `Sanwa`, `Jhangora`, `Kuthiraivali`, `Odalu`, and related regional names | Do not add as global aliases. | They are regional names in the Indian food/agriculture sources or names on a particular retail product. They are not Québec French terms, and no source establishes them as broadly interchangeable catalog search terms. |
| Whole/dehulled human-food grain | Candidate scope if later accepted. | The identity would cover food-grade whole kernels sold for human consumption, including a dehulled product only when its label supports that claim. Keep flour, flakes, porridge mixes, prepared dishes, seed, forage, bird feed, and weeds outside this identity. |

### Species scope remains unresolved

The official FSSAI amendment lists `Barnyard Millet (Samakechawal or Sanwa or Jhangora)` as *Echinochloa crus-galli* and *E. colona* within its whole/dehulled millet standard. ICAR–IIMR's 2025 manual describes barnyard millet as including Indian *E. frumentacea* and Japanese *E. esculenta*; it discusses grain as a food and distinguishes the species. Health Canada's PMRA crop-group table separately lists `Millet, barnyard (*E. frumentacea*)`.

These records support a real grain/crop concept, but the reviewed sources do not provide a taxonomic crosswalk showing whether the standard's species are synonyms, historical usages, or a different scope from the cultivated species in the agricultural sources. Do not silently equate them, narrow the food label to one species, or broaden the catalog identity to every *Echinochloa* grain. The Canadian retail label does not print a botanical name.

## Recipe demand and collision audit

The audit read all 114 manifest-listed recipe files and their 1,123 ingredient rows. Terms were case-folded, NFKD-normalized, accent/ligature-folded, and punctuation-normalized using the repository's `normalize_search_key` behavior. The full recipe JSON strings and ingredient-row strings were checked for:

`barnyard millet`, `barnyard`, `millet japonais`, `millet du Japon`, `Japanese millet`, `Indian barnyard millet`, `Japanese barnyard millet`, `Echinochloa frumentacea`, `Echinochloa esculenta`, `Echinochloa crus-galli`, `Echinochloa colona`, `Kuthiraivali`, `Sawa`, `Sanwa`, `Jhangora`, and `Samakechawal`.

- **Recipe-file hits:** 0.
- **Ingredient-row hits:** 0.
- **Exact normalized-key collisions:** none among active reference names/aliases, form labels/match terms, legacy candidate names/aliases, or ledger text for the terms above.
- **Candidate ID:** no active reference, form, legacy, or ledger record uses `ingredient-ref-barnyard-millet`.
- **Nearby active references:** `ingredient-ref-millet`, `ingredient-ref-common-millet`, `ingredient-ref-finger-millet`, `ingredient-ref-foxtail-millet`, `ingredient-ref-kodo-millet`, `ingredient-ref-pearl-millet`, and `ingredient-ref-puffed-millet` remain separate. Their presence is not an exact-key collision with `barnyard millet`.

The broad query `millet` already reaches multiple generic and species/process references. Keep that expected broad-query overlap separate from exact identity collisions. If a row is ever approved, test that its qualified English and French displays identify only the reviewed product scope, while generic `millet` continues to expose the wider millet set. This audit covers the bundled corpus and current catalog snapshot only; it does not claim live picker execution or exhaustive retail coverage.

## Measures, forms, conversions, yields, and substitutions

- **Measures and density:** add no default density, volume mapping, serving mass, or conversion. The Canadian product page's 500 g package size establishes a package presentation only. FSSAI quality limits and crop/agronomy figures are not household measures.
- **Forms:** add no ingredient form. The food standard's whole/dehulled scope is a product boundary, not evidence for dry/cooked recipe forms. No bundled recipe requests a barnyard-millet state.
- **Cooking yield and conversion:** add no dry-to-cooked yield or mass/volume conversion. An agriculture source's statement that the grain is cooked like rice describes a preparation use; it does not supply an amount or transferable ratio.
- **Substitutions:** add no global or contextual substitution rule. Similar preparation or a retailer's serving suggestions do not establish interchangeability with rice, quinoa, or another millet.
- **Ledger state if research later resumes:** keep identity clarification open; measurements and substitutions remain unresearched unless a source addresses those questions directly. No ledger edit is proposed here.

## Source register

These source IDs are local to this proposal and were not added to the shared ledger. Sources were accessed on 2026-10-11.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-BARNYARD-20261011-S01` | Food Safety and Standards Authority of India, [Food Safety and Standards (Food Products Standards and Food Additives) Second Amendment Regulations, 2023](https://www.fssai.gov.in/upload/notifications/2023/02/63fdb05adf62csample.pdf), Gazette text, regulation 2.4.6(23), pp. 34–35. | Primary food-standard source. The group standard applies to whole or dehulled millets and lists barnyard millet with the names Samakechawal/Sanwa/Jhangora and species *E. crus-galli* and *E. colona*. It establishes a human-food standard class, not Québec wording, culinary measures, or a mapping to the species used in the other sources. |
| `WP03-BARNYARD-20261011-S02` | FSSAI, [FoSCoS standard-product list](https://fcstraining.fssai.gov.in/standard-product), category 06.1, `Millets`, standard 2.4.6(23), dated 2023-07-09. | Current official registry entry confirms the millets standard is represented under whole, broken, or flaked grain. It is registry metadata and does not resolve the taxonomy or French naming. |
| `WP03-BARNYARD-20261011-S03` | ICAR–Indian Institute of Millets Research, [Good Agricultural Practices Manual for Sustainable Millets Production in India](https://www.millets.res.in/pub/2026/GAP-English.pdf), 2025 edition, ch. 9, “Barnyard millet.” | Primary agricultural institute source. Describes barnyard millet food-grain use and distinguishes Indian *E. frumentacea* from Japanese *E. esculenta*. It does not establish a Canadian/Québec label or reconcile the FSSAI species list. |
| `WP03-BARNYARD-20261011-S04` | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), cereal-grain crop group 15-21E. | Canadian PMRA crop classification lists `Millet, barnyard (*E. frumentacea*)`. The page explains these groups support maximum-residue-limit extrapolation; it is taxonomic/agricultural context, not a food-label or consumer naming source. |
| `WP03-BARNYARD-20261011-S05` | Shastha Canada, [Barnyard Millet grains 500 g](https://shasthacanada.com/products/barnyard-millet), product details. | Current Canadian human-food product page names the packaged grain `Barnyard Millet` and identifies it as processed, unpolished, and hulled; it also lists regional names. It does not provide a botanical species, Québec French name, general measure, or density. The package weight is not a recipe measure. |
| `WP03-BARNYARD-20261011-S06` | Office québécois de la langue française, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), updated 2010. | Québec terminology source lists `millet`, `mil`, and `petit mil` and explains that `millet` is generic across species. It does not name barnyard millet or establish a species-specific food display. |
| `WP03-BARNYARD-20261011-S07` | FAO, [À propos de l’Année internationale du mil 2023](https://www.fao.org/millets-2023/about/fr), `Millet japonais` entry. | French-language international food/crop source pairs `millet japonais` with *E. esculenta*. It is not a Québec term recommendation; it demonstrates that the French name is species-sensitive. |
| `WP03-BARNYARD-20261011-S08` | AgriRéseau, [Cultures de couverture pour les vignobles du Québec](https://www.agrireseau.net/documents/Document_109377.pdf), 2023, “Millet japonais,” pp. 30–31. | Québec agricultural guide uses `millet japonais / Japanese millet` for *E. frumentacea* as a cover crop. This is local crop terminology, not a human-food product label, and differs in species association from FAO's entry. |
| `WP03-BARNYARD-20261011-S09` | CCDMD, [Millet japonais (Japanese Millet)](https://monde.ccdmd.qc.ca/ressource/?id=110928), Montréal Botanical Garden image, 2017. | Québec educational/botanical source labels a Montréal plant *E. frumentacea* “Millet japonais.” It corroborates local botanical usage only; it is not a food-grain or picker-name source. |

## Acceptance checks for a future decision

1. Reconcile the food-standard and agricultural species scopes with direct primary sources; do not assert synonymy from this packet.
2. Find a Québec human-food label or Québec terminology source that identifies the selected product scope in French. Decide whether the final row is one species or a clearly bounded market class; do not use `millet japonais` for the broad class without resolving its species-specific usage.
3. If accepted, use category `GRAIN_AND_CEREAL`, an exact bilingual display supported for that scope, and only aliases shown to be useful and unambiguous. Keep `millet`, `mil`, `petit mil`, and unsupported regional names out of the row.
4. Preserve separate identities for generic millet, other millet species, flour, puffed millet, seed/forage, and prepared grain products.
5. Add no forms, recipe links, densities, unit mappings, measures, yields, conversions, or substitutions unless separate evidence supports each field.
6. Re-run the normalized-key collision and full manifest recipe scan against the integration-time package.

## Review disposition

**Hold barnyard millet as an unallocated Section F candidate.** The food-grain concept and English marketed name are supported, but the consulted primary sources differ on species scope and the available Québec French expression `millet japonais` is not a stable match for the broader food class. No bundled recipe demands it. Do not change the catalog, research ledger, recipes, measures, forms, or substitutions from this proposal.

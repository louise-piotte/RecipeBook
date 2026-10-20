# WP04 Section P — Northern shrimp / crevette nordique identity review

- **Review date:** 2026-10-13.
- **Packet type:** proposal-only identity and product-boundary review.
- **Checklist target:** `docs/RecipeBook-global-ingredient-catalog-plan.txt:4329` — “Shrimp/prawn by meaningful preparation; crab and crayfish.”
- **Status:** recommends identity-only integration for Northern shrimp / *Pandalus borealis*; no shared catalog, ledger, checklist, roadmap, recipe, code, generated file, or test was changed.

## Recommendation

Add one narrowly named protein identity for **Northern shrimp / crevette nordique**, scoped to *Pandalus borealis* (CFIA TSN 96967). Use reference ID `ingredient-ref-northern-shrimp`, category `PROTEIN`, display names `Northern shrimp` and `crevette nordique`, no English aliases, and the French search alias `crevettes nordiques`. Keep the scientific name out of picker aliases. Add no form, recipe link, measure, density, unit mapping, conversion, yield, or substitution.

This is a species-scoped Québec seafood name supported by MAPAQ, the CFIA Fish List, and current Canadian supplier and Québec retail pages. It does not settle the broader fresh-shrimp/prawn question. The exact qualified queries are currently absent. Generic searches already return multiple distinct products, and they remain multi-result with the proposed species-scoped row.

OQLF’s 2012 entry cautions that some commercial arrivals sold as `crevette nordique` can mix *P. borealis* with *P. montagui*, with *P. borealis* accounting for 95% of captures. Retain that limitation in the ledger if integrated. The row should represent the locally established, species-scoped identity evidenced by MAPAQ and taxon-identified product pages; do not automatically map an arbitrary “shrimp,” “prawn,” or mixed/unspecified shipment to it.

## Open item and archive check

The exact Section P parent item remains open at plan line 4329. Its completed children include:

- The generic fresh shrimp/prawn review held a global identity because the bundle had no specific request and broad searches overlapped existing products ([proposal](wp04-fresh-shrimp-prawn-boundary-review-20261009.md)).
- The shrimp-powder review held a powder identity/form because the reviewed products ranged from ground dried shrimp to compound products, and the bundle had no demand ([proposal](wp04-section-p-shrimp-powder-product-boundary-review-20261013-round13.md)).
- The generic whole-crab review kept a separate whole-crab row held because the active crab-meat row already covers the relevant recipe wording.
- The snow-crab review left *Chionoecetes opilio* unallocated because unqualified label names span multiple taxa.
- The Argentine-red-shrimp review held *Pleoticus muelleri* because `red shrimp` / `crevette rouge` could falsely look species-resolved in picker results ([R68 proposal](wp04-section-p-argentine-red-shrimp-identity-boundary-review-20261013-round68.md), [R68 integration record](../batches/wp04-section-p-argentine-red-shrimp-picker-hold-integration-20261013/README.md)).

None of those packets decides a dedicated Northern-shrimp identity. The generic-shrimp packet cites OQLF’s entry only as a boundary example; the Argentine-shrimp packet mentions northern shrimp only in a list of unsubstantiated substitutions. The current R71–R73 Section P packets cover orange roughy, Acadian redfish, and beaked redfish. No WP02 flour or WP03 grain decision is involved.

## Identity and Québec naming scope

OQLF’s generic `crevette` entry gives `shrimp` as the English equivalent and marks generic `prawn` as United Kingdom usage. Those terms do not, by themselves, identify a species or one preparation. OQLF’s separate `crevette nordique` entry names *Pandalus borealis* and lists market-specific English translations, but it also records the mixed-arrival caveat above. It says `crevette rose`, `crevette de Matane`, and `crevette de Sept-Îles` were not retained for Québec seafood marketing to avoid label confusion [reused `WP04-FRESH-SHRIMP-20261009-S01` and `WP04-FRESH-SHRIMP-20261009-S02`].

MAPAQ’s Québec crustacean guide pairs *Pandalus borealis* with `Northern shrimp` and uses `crevette nordique` as the French species/product heading. MAPAQ’s 2025 sector portrait likewise identifies `la crevette nordique` as *Pandalus borealis* in its biology section. The guide is useful as Québec species and product evidence; its market-size and package tables are not generic ingredient specifications [S01–S02].

CFIA’s Fish List associates TSN 96967 with *P. borealis*. It lists `Northern Shrimp`, `Crevette Nordique Du Canada`, `Cold Water Shrimp`, and other common names for this taxon. Its separate *P. montagui* entries also include broad `Shrimp`, `Deep Water Shrimp`, and `Cold Water Shrimp` wording. The list therefore supports the taxon-linked name set but also shows why broad and alternate names should not be copied as aliases. It is Canadian fish-label evidence, not a recipe taxonomy or preparation guide; the list reports a modified date of 2023-09-18 [S03].

Two current market pages directly reinforce the Québec name-to-taxon link: Aliments Pearlmark’s bilingual seafood page is titled `Crevettes nordiques` and specifies *Pandalus borealis*; Poissonnerie La Mer’s current Québec listing says `Crevette nordique entière (Pandalus Borealis)` and describes its particular item as cooked and frozen onboard [S05–S06]. These pages support local display wording and species context. The La Mer description is SKU-specific; neither page establishes that every product using an alternate market name is the same species.

Fisheries and Oceans Canada’s 2026/27 management page sets separate figures for *P. borealis* and *P. montagui* by zone, including a *P. montagui* bycatch limit in zone 4. This is current fishery-management evidence of a species boundary only; quota and bycatch numbers do not establish a culinary measure, retail availability, or substitution [S04].

**Naming scope:** use the Québec-preferred singular French display `crevette nordique`. The plural alias is supported by current Canadian foodservice and Québec retail product wording. Do not add `prawn`, `northern prawn`, `pink shrimp`, `cold water shrimp`, `deep water shrimp`, `crevette boréale`, `crevette d’eau froide`, `crevette rose`, `crevette de Matane`, `crevette de Sept-Îles`, `crevette nordique du Canada`, or the Latin binomial as aliases. Several are broad, overlapping, rejected, nonpreferred, or market-specific terms; their source appearances do not establish safe global picker equivalence.

## Current catalog ownership and picker ambiguity

The live bundled package contains 1,396 ingredient references and 103 forms. The live research ledger contains 1,732 records. There is no active display or alias for `Northern shrimp`, `crevette nordique`, `crevettes nordiques`, or *Pandalus borealis*; no `ingredient-ref-northern-shrimp` or `candidate-northern-shrimp` allocation; and no attached shrimp form owns any of the proposed identity terms. The following are the current nearby owners:

| Current reference | Current display and aliases | Boundary |
|---|---|---|
| `ingredient-ref-dried-shrimp` (`PROTEIN`) | `dried shrimp` / `crevette séchée`; aliases `dried shrimps` / `crevettes séchées` | Preserved dried product; not a fresh or species-specific shrimp alias. No attached form. |
| `ingredient-ref-saeu-jeot` (`SAUCE_AND_CONDIMENT`) | `saeu-jeot (salted shrimp)` / `saeu-jeot (crevettes coréennes fermentées au sel)`; English alias `saeujeot` | Salted, fermented Korean condiment; not shrimp meat. No attached form. |
| `ingredient-ref-kapi-shrimp-paste` (`SAUCE_AND_CONDIMENT`) | `kapi` / `pâte de crevettes Kapi`; no aliases | Named paste/condiment; not shrimp meat. No attached form. |
| `ingredient-ref-bagoong-alamang` (`SAUCE_AND_CONDIMENT`) | `bagoong alamang` / `bagoong alamang (condiment philippin aux crevettes fermentées)`; no aliases | Fermented condiment; it owns a `crevettes` phrase through its French display only. No attached form. |
| `ingredient-ref-belacan` (`SAUCE_AND_CONDIMENT`) | `belacan` / `belacan (pâte de crevettes fermentée malaisienne)`; aliases `belachan` in both languages | Fermented paste; it owns a `crevettes` phrase through its French display. No attached form. |
| `ingredient-ref-terasi` (`SAUCE_AND_CONDIMENT`) | `terasi` / `terasi (pâte de crevettes fermentée indonésienne)`; aliases `terasi udang` in both languages | Fermented paste; it owns a `crevettes` phrase through its French display. No attached form. |

The exact candidate ID, its binomial, and the new R74 source-ID prefix were checked against live references, forms, ledger, proposals, and batch records. No collision existed before this proposal. The OQLF source IDs above are reused without reassignment.

`IngredientReferenceSearchIndex` first returns complete normalized word-phrase matches, then tries substring matches only if no full-phrase match exists. A static projection using its current matching behavior gives:

| Query | Current result count | With proposed row | Picker effect |
|---|---:|---:|---|
| `Northern shrimp` | 0 | 1 | Selects the new qualified identity. |
| `crevette nordique` / `crevettes nordiques` | 0 | 1 | Singular display and attested plural French alias select the same row. |
| `shrimp` | 2 | 3 | Dried shrimp and saeu-jeot remain beside Northern shrimp. |
| `crevette` | 1 | 2 | Dried shrimp and Northern shrimp remain distinct. |
| `crevettes` | 6 | 7 | Bagoong alamang, belacan, dried shrimp, Kapi, saeu-jeot, terasi, and Northern shrimp remain separate. |
| `prawn`, `northern prawn`, `pink shrimp`, `cold water shrimp`, `deep water shrimp`, `crevette rose`, `crevette de Matane`, `Pandalus borealis` | 0 | 0 | No broad, overlapping, or scientific-name alias is added. |

The short generic queries already return multiple distinct entries, and remain multi-result after the proposal. They will not silently resolve to this species alone. As with any product name, a recipe line explicitly saying `crevette nordique` is still not proof that an unlabeled mixed commercial arrival contains only *P. borealis*; preserve OQLF’s caveat and do not rewrite generic recipe lines.

## Bundled recipe demand

The manifest lists 114 complete recipe files with 1,123 ingredient rows (1,097 rows have a nonempty `ingredientRefId`). A case-insensitive scan of all recipe JSON text and ingredient rows found zero occurrences of `Northern shrimp`, `crevette nordique`, `crevettes nordiques`, *Pandalus borealis*, `shrimp`, `prawn`, `crevette`, or `crevettes`. The corpus supplies no specific recipe demand, recipe link, quantity, preparation, or substitution for this identity. A generic “seafood” phrase does not establish shrimp demand.

## Forms, measurements, conversions, yields, and substitutions

The sources establish multiple product axes but not a canonical recipe form. MAPAQ’s guide and La Mer’s item identify cooked products; the La Mer item is whole and frozen onboard. Pearlmark lists separately frozen product grades but does not establish a universal raw/cooked state. Fresh/raw, cooked, frozen, thawed, peeled, whole, and brined are not interchangeable identity names. Add no form now.

The numeric observations are source-bounded and do not justify active ingredient data:

- MAPAQ gives whole-animal length **5–13 cm** and weight **3–15 g** at catch. These are biological size ranges, not recipe-piece weights or a count-to-mass conversion.
- MAPAQ reports **90–400 peeled shrimp per 454 g**, depending on size. That broad range is size-dependent and cannot define one serving, edible yield, or reusable conversion. The same guide lists commercial grades and pack sizes; these remain product and assortment details.
- The guide’s nutrition panel gives **125 mL (75 g cooked meat)** as a nutrition serving. It is not an established household volume mapping, ingredient density, or recipe conversion.
- Pearlmark lists grades including **90–125/lb**, **125–175/lb**, and **500–800/lb**, with SKU-specific **4 × 5 lb** or **12 × 1 lb** packs. La Mer’s current listing is **80/100 – 1 lb**. These label grades and pack weights belong to particular products; their count basis and physical state do not establish a universal unit mapping.
- DFO’s 2026/27 total allowable catch and bycatch limits are fishery-management quantities, not food package weights or edible yields.

No reviewed source provides a transferable raw-to-cooked, shell-on-to-peeled, frozen-to-thawed, count-to-mass, or drained-yield relationship. No density or unit conversion is supported. No recipe or source defines a safe directed substitution between Northern shrimp and generic shrimp, dried shrimp, shrimp paste, another *Pandalus* species, prawns, crab, fish, or seafood at a specified method and quantity. Add no conversion, yield, or substitution rule.

## Proposed integration payload

If accepted, add only this identity record to the reference catalog and an identity decision/source record to the research ledger:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-northern-shrimp` |
| Category | `PROTEIN` |
| English display | `Northern shrimp` |
| French display | `crevette nordique` |
| English aliases | `[]` |
| French aliases | `["crevettes nordiques"]` |
| Scientific scope | *Pandalus borealis* (CFIA TSN 96967); note the OQLF mixed-arrival caveat |
| Forms, measures, links, conversions, yields, substitutions | None |

This remains a proposal, so no JSON or ledger row has been written. If the accepted implementation only adds database JSON data, current `AGENTS.md` says no tests are needed; no app tests or emulator run are part of this proposal-only review.

## Sources

Sources were opened and checked on 2026-10-13. The two OQLF IDs are already registered in the generic fresh-shrimp proposal and are reused here without changing their source records.

| Source ID | Source and supported claim | Evidence limit |
|---|---|---|
| **Reused `WP04-FRESH-SHRIMP-20261009-S01`** | OQLF GDT, [crevette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198913/crevette): preferred Québec generic French term; English `shrimp`; `prawn` marked United Kingdom usage. | Generic terminology only; not a species or product-state decision. Last updated 1998. |
| **Reused `WP04-FRESH-SHRIMP-20261009-S02`** | OQLF GDT, [crevette nordique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199098/crevette-nordique): Québec preferred term, *P. borealis*, English market translations, the mixed-arrival note, and unretained Québec market terms. | Last updated 2012. The mixed-arrival caveat means some shipments may include *P. montagui*; alternate terms are not copied as aliases. |
| **WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S01** | MAPAQ, [Portrait-diagnostic sectoriel de l’industrie de la crevette nordique au Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/agriculture/types-de-productions/ED_portrait_diagnostic_industrie_crevette_nordique_MAPAQ.pdf): identifies Northern shrimp as *Pandalus borealis*; covers 2019–2024 and states that 2024 transformation data were unavailable. | Sector/fishery/market report; not a recipe measure, source of current store inventory, or food-preparation conversion. |
| **WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S02** | MAPAQ, [Les crustacés du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf): pairs *P. borealis* with `Northern shrimp`, uses `crevette nordique`, and provides biological size, product-grade, and nutrition-serving examples. | Government species/product reference; numeric entries remain biological, nutritional, or commercial observations rather than universal recipe mappings. |
| **WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S03** | CFIA, [Fish List shrimp query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp): associates TSN 96967 / *P. borealis* with species-linked English and French common-name entries; its *P. montagui* entries expose broad-name overlap. | Canadian fish-label list, modified 2023-09-18; not a culinary taxonomy, and individual bilingual name rows do not establish every English/French pair as a direct translation. |
| **WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S04** | Fisheries and Oceans Canada, [Northern shrimp fishing decisions for 2026/27, zones 4–7](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-24-fra.html): reports current *P. borealis* TAC figures and a separate *P. montagui* bycatch limit. | Management scope only; not product identity for a retail SKU, food availability, measurement, yield, or substitution evidence. |
| **WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S05** | Aliments Pearlmark, [Crevettes nordiques](https://www.pearlmarkfoods.com/fr/nos-produits/crevettes-nordiques): current Canadian foodservice page pairs the plural French product name with *P. borealis* and gives frozen count grades and package formats. | Supplier product range; grades and pack sizes are product-specific and not recipe conversions. |
| **WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S06** | Poissonnerie La Mer, [Crevettes Borealis de la Baie d’Ungava 80/100 – 1 lb](https://www.lamer.ca/products/crevettes-borealis-de-la-baie-dungava-80-100-1-lb): current Québec listing names whole `crevette nordique (Pandalus Borealis)`, cooked and frozen onboard, with an 80/100 product grade and 1 lb package. | One product page and SKU; not a species-wide measure, edible-yield claim, or general availability statement. |

## Review checks

- Exact open checklist wording and prior Section P proposal/batch archive reviewed; no dedicated Northern-shrimp decision found.
- Live reference, form, ledger, recipe manifest, recipe corpus, and picker matching behavior inspected.
- Source-ID prefix was collision-free before this proposal; OQLF source IDs are reused, not reassigned.
- Proposal recommendations keep identity, forms, measurements, conversions, yield, and substitutions separate.
- Static UTF-8, no-BOM, mojibake, local-link-target, trailing-whitespace, and no-index diff whitespace checks passed on this proposal only. No test or emulator run was needed for this proposal-only packet.

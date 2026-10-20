# WP04 Section P — Weakfish / acoupa royal picker-boundary review

- **Review date:** 2026-10-13
- **Packet type:** Regional finfish identity, Canadian and Québec name ownership, picker projection, recipe demand, product evidence, and measurement boundary.
- **Candidate:** Weakfish, *Cynoscion regalis* (CFIA TSN 169241); Québec French **acoupa royal**.
- **Recommendation:** Hold outside the active picker. The qualified French name is well supported, but CFIA assigns the same unqualified English name **Weakfish** to *C. regalis* and *C. acoupa*. A hypothetical `weakfish / acoupa royal` row would make the broad `weakfish` query return this species alone. The broader French query `acoupa` has a similar collision across CFIA-listed fish. The bundled recipes have no matching demand, and current Canadian product evidence using “weakfish” identifies a different taxon.
- **Disposition:** Root accepted the picker hold on 2026-10-13. The reference and ledger remain unchanged; the plan, roadmap, and batch archive now record the hold.
- **Source access date:** 2026-10-13.

## Selection and ownership

At proposal time, Section P kept named and regional fish coverage open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), and there was no dedicated weakfish allocation or hold. Root has since recorded the accepted hold in the plan, roadmap, and batch archive. The live reference and form catalogs, legacy candidate file, and research ledger still have no weakfish allocation. Before this review, the only prior mentions in the archive were in the Atlantic-croaker proposal: a TERMIUM name-overlap note and an excluded-substitute list. Neither resolves weakfish ownership or makes a separate weakfish decision. References to `sea trout` and `truite de mer` in the brook-trout review concern a salmonid naming boundary, and `croaker` in Atlantic-croaker and black-drum work is not weakfish ownership.

The proposal-time snapshot, taken before the same-day sorghum integration, contained **1,333 references, 98 forms, 64 legacy candidates, 1,641 ledger records, and 8 unit-conversion records**. A case-insensitive scan of their full JSON text found no exact owner for `weakfish`, `Cynoscion regalis`, `acoupa royal`, or `squeteague`. The subsequent unrelated sorghum addition brought the live counts to 1,334 references and 1,642 ledger records; those terms remain unallocated. No reference, form, legacy candidate, or ledger identity row is assigned to *C. regalis*. No other Section P decision is reopened here.

## Name and taxon boundary

The CFIA Fish List assigns TSN 169241 and *Cynoscion regalis* the pair **Weakfish / Acoupa Royal**. It also assigns **Weakfish / Acoupa Toeroe** to *C. acoupa* (TSN 169242), alongside **Acoupa weakfish / Acoupa Toeroe**. Other related rows include **Peruvian Weakfish / Acoupa du Pérou** (*C. analis*), **Cachema Weakfish / Acoupa cachème** (*C. phoxocephalus*), **Striped Weakfish / Acoupa rayé** (*C. striatus*), and **Green Weakfish / Acoupa cambucu** (*C. virescens*). The Fish List also assigns **King Weakfish / Acoupa Chasseur** to *Macrodon ancylodon* (TSN 169334). These are different fish taxa, not forms of *C. regalis* [S01]. CFIA says the Fish List provides Canadian fish-label names by species and that only names listed for a species should be used for that species [S02].

The Québec GDT supports **acoupa royal** as the preferred French term for the edible fish *C. regalis* and gives English **weakfish**. It says the species has commercial potential in Québec, which is terminology evidence rather than proof of current stock or retail availability. The same entry lists `sea trout` and `squeteague` among English terms and expressly discourages French **truite de mer** when used for this fish, calling it a calque of `sea trout` [S03]. TERMIUM also lists `croaker` as an English term for *C. regalis* and notes its use for Atlantic croaker (*Micropogonias undulatus*); it flags `sea trout` as a name also used for brook trout [S04].

| Term | Evidence and picker disposition |
|---|---|
| `acoupa royal` | OQLF’s preferred Québec French name and CFIA’s species-paired French name. The complete phrase is specific in this review; it could be considered as a qualified French display or search term if the picker can preserve the other name choices. It is not activated in this hold proposal. |
| `weakfish` | CFIA uses this same unqualified English name for *C. regalis* and *C. acoupa*. Keep it out of any active single-species display or alias until the picker can represent that collision. |
| `acoupa` | Appears across several CFIA-listed species names. Do not treat it as a synonym for *C. regalis* or add it as a bare alias. |
| `squeteague` | Listed as an English term by OQLF, but it does not resolve the CFIA collision and has no bundled recipe demand. Do not add it as an active alias. |
| `sea trout` / `truite de mer` | The English term is shared with other fish names; OQLF expressly advises against `truite de mer` for this Québec fish. Add neither as an alias. |
| `croaker` | TERMIUM lists the term for *C. regalis* and for *M. undulatus*. Keep it out of aliases; the latter species is already held separately in the Atlantic-croaker review. |
| `gray/grey weakfish`, `gray trout`, and related variants | Broader terminology sources record these variants, but they are not needed to express the Québec identity and do not repair the unqualified-name collision. Add no aliases. |

## Current picker projection

The projection follows the current phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): reference displays, aliases, and attached form terms are normalized; a complete phrase match wins over partial matching. No application or emulator check was run.

| Query | Current picker | Hypothetical `weakfish / acoupa royal` row, no aliases | Meaning |
|---|---|---|---|
| `weakfish` | No result | Weakfish / acoupa royal | A single result would conceal the second CFIA taxon carrying the same unqualified name. |
| `acoupa royal` | No result | Weakfish / acoupa royal | The full Québec phrase is species-qualified. |
| `acoupa` | No result | Weakfish / acoupa royal | The broad French word would appear to select one fish, though CFIA uses it across different taxa. |
| `Cynoscion regalis` | No result | No result | The scientific name is not a proposed picker alias. |
| `squeteague`, `sea trout`, `truite de mer`, `croaker` | No result | No result | None is added as an alias; some are expressly shared or discouraged. |

The full French phrase `acoupa royal` is therefore safe as a qualified name, while unqualified `weakfish` and `acoupa` are not safe single-result queries. A display such as `weakfish (C. regalis)` would still match the broad `weakfish` query and would not solve the problem. Do not invent an English qualifier such as `Atlantic weakfish`; the reviewed Canadian and Québec sources do not establish it as the candidate’s common name.

## Canadian product evidence and regional scope

An active Canadian seller, Inter-Canada Fisheries, lists **King Weakfish (Bangamary)** as a whole, frozen, Brazil-origin 44 lb product. The page showed it as sold out on access. CFIA maps **King Weakfish / Acoupa Chasseur** to *Macrodon ancylodon*, not *C. regalis* [S01, S07]. The FDA Seafood List separately recognizes *M. ancylodon* as “Weakfish or Bangamary” / “King Weakfish or Weakfish,” corroborating how the English market word can point to another taxon [S08]. The package title and 44 lb case quantity are not evidence for a *C. regalis* product, an edible portion, or a recipe measure.

No current Canadian or Québec retail listing identifying *C. regalis* by scientific name or by the qualified pair `weakfish / acoupa royal` was found in this review. This is a search result, not proof of unavailability. OQLF’s commercial-potential note is not current inventory. DFO’s Atlantic-fish reference documents the species name and describes it as a warm-water fish reaching the region only as occasional strays; that source is historical and should not be read as a current availability finding [S05]. The Atlantic States Marine Fisheries Commission gives the broader contemporary range as Nova Scotia to southeastern Florida and says the species is more common between New York and North Carolina [S06]. Neither range statement supplies a Canadian product name or availability.

## Bundled recipe audit

The read-only corpus scan followed the current manifest in order and inspected all string values and every ingredient row in **114 recipe files / 1,123 ingredient rows** (753,792 bytes; concatenated recipe-file SHA-256 `ea9d7b6bd14aafe822089052c27a73786a93e76c33b4863def3f44eabde92b9f`). Whole-phrase searches covered `weakfish`, `weak fish`, `Cynoscion regalis`, `C. regalis`, `Cynoscion acoupa`, `acoupa royal`, `acoupa`, `acoupa toeroe`, `acoupa weakfish`, `acoupa chasseur`, `acoupa du Pérou`, `acoupa cachème`, `acoupa rayé`, `acoupa cambucu`, `squeteague`, `sea trout`, `truite de mer`, `gray/grey weakfish`, `gray/grey trout`, `croaker`, `Atlantic croaker`, `King Weakfish`, `Macrodon ancylodon`, `Peruvian Weakfish`, `Cachema Weakfish`, `Striped Weakfish`, and `Green Weakfish`. Results were **0 / 114 recipe files** and **0 / 1,123 ingredient rows**. Recipe demand does not support an active row, measurement, form, or substitution.

## Measurements, forms, and substitutions

Health Canada’s accessible 2015 CNF serving page contains food code 3161, **“Fish, seatrout (weakfish), mixed species, baked or broiled”** / **“Poisson, truite saumonée, espèces diverses, au four ou grillée.”** It reports 100 g edible portion = 100 g, 100 ml flaked = 57.5 g, 250 ml = 143.7 g, a 75 g Food Guide serving, one fillet = 186 g, and 65% total refuse [S09]. This is cooked, mixed-species data, not a *C. regalis* observation; none of those values transfers to this candidate. Health Canada says the 2015 online CNF remains an interim access path while the 2026 relational CNF files are available [S10, S11]. The downloadable 2026 files were not row-queryable through this review, so no candidate-specific 2026 measure was verified.

No candidate-specific fish form, serving mass, density, or unit mapping is established. Add no form or active numeric behavior; the seller’s package mass is a commercial case size only. The bundled global and contextual substitution-rule files currently contain **0 rules each**. No bundled recipe or reviewed source supports *C. regalis* as a global or contextual substitute for Atlantic croaker, another drum/croaker, generic white fish, or another finfish. Add no substitution, cooking-yield, preservation, raw-consumption, storage, or safety equivalence.

## Source register

Sources accessed 2026-10-13. Links below are used for the claims stated above; older source dates and retrieval limits are noted.

| ID | Source | Use and limits |
|---|---|---|
| S01 | CFIA, [Fish List lookup for “Weakfish”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Weakfish) and [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Lookup results list *C. regalis* as Weakfish / Acoupa Royal, *C. acoupa* as Weakfish / Acoupa Toeroe and Acoupa weakfish / Acoupa Toeroe, and other compound `weakfish` rows; they also list *M. ancylodon* as King Weakfish / Acoupa Chasseur. The legacy lookup page was modified 2023-09-18. This supports Canadian common-name allocation, not retail inventory. |
| S02 | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Says only the common names listed for a fish species should be used as names for that species. Modified 2023-09-25. |
| S03 | OQLF, [acoupa royal, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198960/acoupa-royal) | Supports French preferred term `acoupa royal`, English `weakfish`, *C. regalis*, and cautions against `truite de mer` for this fish. Updated 2011; commercial-potential wording is not current product evidence. |
| S04 | Government of Canada, TERMIUM Plus, [fish terminology lookup for croaker](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=CROAKER) | Lists weakfish synonyms including `croaker` and records the cross-species use of `croaker` for *M. undulatus* and `sea trout` for *S. fontinalis*. Terminology only; no product or recipe measure. |
| S05 | Fisheries and Oceans Canada, [Poissons de la côte atlantique du Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/110180_P2.pdf) | Historical species reference pairs `acoupa royal` / `weakfish` with *C. regalis* and characterizes the regional occurrence as occasional strays. It does not establish present supply. |
| S06 | Atlantic States Marine Fisheries Commission, [Weakfish](https://asmfc.org/species/weakfish/) | Current regional authority gives the Atlantic range and says the species is more common from New York to North Carolina. It is not Canadian retail evidence. |
| S07 | Inter-Canada Fisheries, [King Weakfish (Bangamary), whole frozen, Brazil, 44 lb](https://www.intercanadafisheries.com/products/king-weakfish-bangamary-3-6ppb-whole-frozen-brazil-nw-44-lb) | Current Canadian seller product page; showed sold out. It establishes a separate market product label/package, not *C. regalis* or an ingredient measure. |
| S08 | U.S. FDA, [Seafood List: *Macrodon ancylodon*](https://www.hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Macrodon_ancylodon&set=SeafoodList) | Identifies King Weakfish / Weakfish with *M. ancylodon*. Corroborating U.S. naming evidence; CFIA is the Canadian authority for this review. |
| S09 | Health Canada, [2015 CNF serving-size record, food code 3161](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3161) | Mixed-species cooked fish record with the displayed portion/refuse values above; not an exact-species measurement. Page modified 2019-03-01. |
| S10 | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Describes CNF and states 2015 online remains available as an interim measure while the 2026 dataset is provided. Page dated 2026-06-19. |
| S11 | Open Government Portal / Health Canada, [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1) | The 2026 relational dataset page links Food Name and Measure Weight Conversion files. Their candidate-level rows were not searchable in this review; no absence claim is made from the inaccessible CSV preview/download. |

## Root disposition

Accepted the hold on 2026-10-13. Keep *Cynoscion regalis* unallocated in the shared picker. Retain **acoupa royal** as the source-supported qualified Québec name for a future disambiguated entry. Activate no English or French aliases, forms, measurements, density, mapping, recipe link, or substitution. The CFIA collision on `weakfish` and broad `acoupa`, plus zero recipe demand, do not support a single-species row under current picker behavior. Section P remains open. See the [hold integration README](../batches/wp04-section-p-weakfish-acoupa-royal-picker-hold-integration-20261013/README.md).

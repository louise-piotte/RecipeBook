# WP02 Section 04 B3 R139 — pearl millet starch product-boundary hold

- **Reviewed:** 2026-10-15.
- **Status:** proposal only; no shared catalog, form, ledger, checklist, roadmap, batch, or generated file was changed.
- **Checklist:** WP02 Section 04 B3, `[ ] Water-chestnut flour and other documented regional starches.` The parent remains open after R138. This review selects a distinct, previously unallocated candidate: starch isolated from pearl millet grain. It does not revisit the earlier integrated or held B3 identities, including the R136 tigernut, R137 *Artocarpus camansi*, and R138 jackfruit-seed decisions.
- **Scope:** research-documented starch separated from pearl millet (*Pennisetum glaucum* and synonyms used in the cited studies), distinct from whole pearl-millet grain, pearl-millet flour, and modified starch samples. This review does not claim a Canadian pantry product or a standardized consumer grade.
- **Proposal-local source-ID prefix:** `WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S`. The candidate phrase, possible ID `ingredient-ref-pearl-millet-starch`, and source prefix were checked against the live references, forms, ledger, legacy identities, plan, proposal archive, batch archive, and recipe corpus; no focused prior decision or ID/source-prefix owner was found.

## Recommendation

**Hold; no active catalog or ledger delta.** Primary food-science studies establish that pearl-millet grain can be wet-processed to isolate a starch fraction and that researchers test the isolated material in food formulations. The reviewed current Canadian and Québec-facing product evidence establishes pearl-millet flour, generic millet flour, and pearl-millet grain, but not a standalone human-food pearl-millet-starch product. OQLF supports the Québec terms `amidon` and `millet perlé` separately, but does not attest a product-specific term such as `amidon de millet perlé`. The transparent compound is therefore only a working description, not an approved Québec display.

If future local product or terminology evidence supports an identity, the likely category is `FLOUR_AND_STARCH`, separate from the current pearl-millet grain and flour rows. Do not reserve `ingredient-ref-pearl-millet-starch` or add a candidate ledger record now. Do not add forms, aliases, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions.

## Product and Québec terminology boundary

| Material or phrase | Treatment | Evidence boundary |
|---|---|---|
| Pearl-millet grain | Keep on the existing `ingredient-ref-pearl-millet` identity. | OQLF supports `millet perlé` as a Québec plant/crop term and identifies the related taxon names. Grain identity is not an extracted-starch product name. [S01] |
| Pearl-millet flour | Keep on the existing `ingredient-ref-pearl-millet-flour` identity, displayed `pearl millet flour / farine de mil chandelle`. | Codex and current Canadian product pages distinguish flour made by milling whole grain. A Québec food-directory blend lists generic `millet flour`; it does not identify the species as pearl millet or list isolated pearl-millet starch. [S05–S07] |
| Starch isolated from pearl millet grain | Keep as an unallocated research candidate. | Primary studies distinguish isolated starch from the starting flour and characterize native and modified samples. This establishes a research material, not a Canadian/Québec consumer product identity or commercial grade. [S03–S04] |
| `pearl millet starch` / `amidon de millet perlé` | Keep both outside active names and aliases for now. | The English phrase is used in primary research. `Amidon de millet perlé` combines OQLF’s general starch term with its pearl-millet plant term, but no reviewed OQLF entry or Québec product label uses that complete starch phrase. [S01–S04] |
| `fécule de millet perlé` | Do not adopt. | OQLF says `fécule` more specifically names starch in tubers or underground plant organs; pearl millet is a cereal grain. Use of `amidon` would be more consistent if a future Québec product term is established. [S02] |
| `bajra starch`, `bajri starch`, `kambu starch`, `sajje starch` | Keep unassigned. | The reviewed Canadian product and terminology sources support grain/flour names, not these starch-qualified products. Do not derive a starch alias from a grain or flour alias. [S05–S08] |
| Native, modified, or resistant pearl-millet starch | Do not create separate rows or forms from laboratory treatments. | The cited studies use native and experimentally modified samples, but no source reviewed here establishes an active Canadian retail grade or a stable consumer-facing process taxonomy for pearl-millet starch. [S04] |

The primary isolation procedures begin with ground grain or flour, then use wet separation, sieving, centrifuging/settling, washing, and drying to recover a starch fraction. This is a separate product boundary from whole-grain flour. Laboratory recovery conditions do not establish a household extraction method, food-label specification, or pantry-product availability. [S03–S05]

## Canadian/Québec product scope

The current product evidence found in this pass points to adjacent products rather than a standalone starch package:

- Puremill Canada currently lists `Puremill Bajri Flour (Pearl Millet Flour)` made from 100% pearl-millet grains and identifies Ontario in-store milling locations. This is local Canadian flour evidence, not starch availability. Package weights are not kitchen measures. [S07]
- The Québec Food Directory product `Gluten-free all purpose flour 2 kg`, from a Montréal company, lists `tapioca starch`, `sorghum flour`, `millet flour`, `potato starch`, oat flour, and xanthan gum. It keeps the ingredients separate, but its generic millet flour is not species-qualified and it does not identify a pearl-millet-starch product. Its whole-blend `1 for 1 cup` preparation statement does not apply to any ingredient in the blend. [S06]
- CFIA’s 2015–2018 retail survey sampled products in six Canadian cities, including Montréal. Its millet category listed flakes, flour, grains, and grits, not starch. This is historical survey coverage, not a current market census and not proof that no standalone product exists. [S08]
- Targeted current searches on 2026-10-15 for `pearl millet starch`, `bajra starch`, `bajri starch`, `amidon de millet perlé`, `amidon de mil chandelle`, and French variants found research material and grain/flour listings but no Canadian or Québec standalone human-food product label or supplier page. This bounded search result is limited evidence of non-discovery, not proof of nonexistence. [S09]

## Live catalog, ledger, picker, archive, and recipe audit

The read-only working-tree snapshot contained **1,493 ingredient references, 113 forms, 1,838 research-ledger records, 61 legacy-import candidates, 114 manifest-listed recipes, and 1,123 recipe ingredient rows**. These are the files inspected on 2026-10-15 in a shared worktree.

| Surface | Finding |
|---|---|
| Active references | `ingredient-ref-pearl-millet` is `pearl millet / millet perlé` (`GRAIN_AND_CEREAL`) with English aliases `bajra`, `bajri`, `sajjalu`, `kambu`, and `sajje`. `ingredient-ref-pearl-millet-flour` is `pearl millet flour / farine de mil chandelle` (`FLOUR_AND_STARCH`) with English aliases `bajra flour`, `bajri flour`, `sajjalu flour`, `kambu flour`, `sajje hittu`, and French alias `farine de millet perlé`. Neither row owns a starch-specific name. |
| Active forms | No pearl-millet grain, flour, or starch form exists in the 113 live form rows. No form describes extracted starch. |
| Research ledger | The grain record is verified with measurement and substitution research not yet researched; the flour record is verified with separate flour measurement research and substitution research blocked pending evidence. No pearl-millet-starch record or decision exists. Do not transfer the flour’s measurement observations or the generic millet-flour cup observation to an isolated starch. |
| Legacy-import identities | No exact pearl-millet-starch candidate, alias, or ID owner was found among 61 candidates. |
| Proposal and batch archive | Full-text searches for `pearl millet starch`, `bajra starch`, `bajri starch`, `amidon de millet perlé`, `amidon de mil chandelle`, and `ingredient-ref-pearl-millet-starch` found no focused prior starch identity or hold. The recent sorghum-starch identity and the other B3 product decisions concern different source materials. This is a bounded archive search. |
| Recipe corpus | Scanned all 114 manifest-listed recipe JSON files and 1,123 ingredient lines. Searches for `pearl millet starch`, `millet starch`, `bajra starch`, `bajri starch`, `amidon de millet perlé`, `amidon de mil chandelle`, `pearl millet`, `pearl millet flour`, `millet perlé`, and `bajra` found zero recipe-text and ingredient-line hits. No bundled demand or recipe link supports allocation. |
| Open checklist | Section 04 B3 remains open. This review adds no completion mark and does not reopen prior decisions. |

The picker projection below follows `IngredientReferenceSearchIndex`: normalized complete word phrases are preferred, followed by partial matches. It is a static projection from current JSON and the documented search logic, not an app test.

| Query | Current result | If a future identity were approved as `pearl millet starch / amidon de millet perlé` with no aliases |
|---|---|---|
| `pearl millet starch` | No result | The proposed row only |
| `millet starch` | No result | The proposed row only; the phrase occurs in the English display |
| `amidon de millet perlé` | No result | The proposed row only; this French compound is not validated by this review |
| `pearl millet` | Pearl-millet grain and pearl-millet flour (2 rows) | Both current rows plus the proposed starch row (3 rows) |
| `millet perlé` | Pearl-millet grain and pearl-millet flour (2 rows). The flour's French alias `farine de millet perlé` contains this complete word phrase, so both rows match. | Both current rows plus the hypothetical starch row whose French display is `amidon de millet perlé` (3 rows). |
| `bajra` / `bajri` | Pearl-millet grain and pearl-millet flour (2 rows each) | Unchanged if no aliases are added |
| `bajra starch` / `bajri starch` | No result | Still no result unless unsupported aliases are introduced; do not introduce them from grain/flour names |
| `farine de mil chandelle` | Pearl-millet flour only | Unchanged; do not place flour wording on a starch row |
| `millet` | 20 current reference rows | 21 rows, including the hypothetical starch row, because `millet` occurs as a complete word in both proposed display names |

Do not alias bare `bajra`, `bajri`, `mil`, `millet`, `petit mil`, `millet perlé`, `farine de mil chandelle`, or `farine de millet perlé` to a starch candidate. Those terms either describe the crop/grain or already return grain/flour choices. A future species-qualified starch identity must keep its full display visible in the picker.

## Numeric, form, and substitution evidence

- **Lab extraction yields:** Suma and Urooj report isolated-starch yields of 34.5 and 39.4 g/100 g for two named pearl-millet cultivars, using a study-specific wet-separation protocol. Another primary study reports 53.1% recovery on a net-flour basis for its sample. These disagree in part because cultivar, starting material, and methods differ; they are extraction-research results, not kitchen yields or ingredient conversion factors. Do not store a reusable yield. [S03–S04]
- **Density and measures:** A pearl-millet-starch paper reports laboratory density, but its table labels the unit `g/mm³`, a dimensional rendering that is not suitable for converting or reinterpreting as `g/mL`. Other study quantities are analysis or process ratios. No reliable household bulk density, cup/spoon mass, package serving, or volume-to-mass mapping was established. Do not add density or unit mappings. [S04]
- **Form:** The isolated and dried samples do not establish a user-facing form family or a form-to-form conversion. Add no forms.
- **Substitution:** A primary extruded-snack study formulated one product with 85.09% pearl-millet flour, 14.91% pearl-millet starch, and 17.80% moisture under specified extrusion conditions. It reports an industrially processed flour/starch blend and discusses the material as a potential alternative starch source; it does not validate replacing corn, potato, or another starch in a household recipe at a general ratio. Add no active substitution rule. [S05]
- **Recipe demand:** None in the bundled library. Research formulations do not create a bundled recipe line, recipe link, or reusable kitchen substitution. [S05, S10]

## Exact proposed delta

**No JSON delta.** Hold the candidate outside the active catalog and ledger until a current Canadian or Québec standalone human-food product source and product-specific Québec French wording establish a stable product identity. Do not reserve an ID, create a ledger candidate, or add names, aliases, forms, numeric data, recipe links, or substitutions.

No tests were run. This proposal-only review did not change database JSON; the project instructions also waive tests for changes limited to database JSON additions.

## Source register

Sources were checked on 2026-10-15. The IDs below are local to this proposal and are not ledger records.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S01** | Office québécois de la langue française, [*millet perle* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle), updated 2010. | Preferred Québec plant terms include `millet perle`, `millet à chandelle`, `petit mil`, and `mil`; the English term is `pearl millet`, with Latin names including *Pennisetum glaucum*. Supports crop terminology, not a starch product name. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S02** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Prefers general French `amidon`; says `fécule` more specifically names starch in tubers or underground organs. This supports the general noun only, not `amidon de millet perlé` as a product compound. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S03** | Florence Suma and Asna Urooj, [“Isolation and Characterization of Starch from Pearl Millet (*Pennisetum typhoidium*) Flours”](https://doi.org/10.1080/10942912.2014.981640), *International Journal of Food Properties* 18 (2015), 2675–2687. | Primary study separately examines flour and isolated starch from two cultivars and reports starch yields of 34.5 and 39.4 g/100 g. Supports a laboratory product distinction; yields and functional results are cultivar/method-specific, not kitchen quantities, commercial grades, or a general replacement rule. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S04** | S. Balasubramanian, R. Sharma, J. Kaur, and N. Bhardwaj, [“Characterization of Modified Pearl Millet (*Pennisetum typhoides*) Starch”](https://pmc.ncbi.nlm.nih.gov/articles/PMC3907649/), *Journal of Food Science and Technology* 51(2) (2014), 294–300. | Primary study isolates native starch and creates hydrothermal, acid, and enzyme-modified experimental samples. It reports 53.1% recovery on net-flour basis. Its bulk-density table is rendered in `g/mm³`; do not normalize that value or adopt it as a usable kitchen density. Laboratory processes and modifications do not establish consumer product grades. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S05** | Isha Kaushik and R. B. Grewal, [“Optimization of Extrusion Variables for the Development of RTE Snacks by Incorporation of Pearl Millet Starch”](https://doi.org/10.20546/ijcmas.2017.607.194), *International Journal of Current Microbiology and Applied Sciences* 6(7) (2017), 1607–1617. | Primary industrial-style extruded snack experiment with a specific 85.09% pearl-millet-flour / 14.91% starch / 17.80% moisture formulation. This is a process- and formulation-specific food application, not a household conversion or cross-starch replacement ratio. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S06** | Gouvernement du Québec, [Québec Food Directory, *Gluten-free all purpose flour 2 kg*](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202592), product record updated 2025-10-29. | Montréal company product sheet lists generic `millet flour` separately from tapioca and potato starch; its formulation is a blend. It does not identify pearl millet or an isolated millet-starch product. Its cup-for-cup instruction applies to the composite blend only. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S07** | Puremill Canada, [*Puremill Bajri Flour*](https://www.puremill.ca/products/puremill-bajri-flour), current product page. | Names `Bajri Flour (Pearl Millet Flour)`, says it is made from 100% pearl-millet grains, and lists Ontario milling locations. Establishes current Canadian flour wording and product boundary, not starch availability. Package sizes are not recipe measures. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S08** | Canadian Food Inspection Agency, [*Multi-Mycotoxins in Milled Grain Products and Grain-based Foods — April 1, 2015 to March 31, 2018*](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/viruses-imported-frozen-scallops-0), “What did we sample,” Table 1. | The historical national retail survey includes Montréal and lists millet flakes, flour, grains, and grits among the sampled product classes; it does not list millet starch. Historical survey scope only—not a current market census, species identification, or proof of no product sale. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S09** | Bounded current Canada/Québec product search, reviewed 2026-10-15, exact terms listed in “Canadian/Québec product scope.” | Search results included research and grain/flour products but no standalone Canadian/Québec pearl-millet-starch human-food label or supplier page. Search non-discovery is limited evidence, not proof of absence. |
| **WP02-SECTION-04-B3-PEARL-MILLET-STARCH-R139-20261015-S10** | Local repository audit: live `ingredient-references.v1.json`, `ingredient-forms.v1.json`, `manifest.v1.json`, research ledger, legacy identities, plan, proposal/batch archive, `IngredientSearch.kt`, and all manifest-listed recipes. | Supports the current ownership, picker projection, archive overlap check, counts, and recipe-demand scan. Not external product or terminology evidence. |

## Reconsideration notes

1. Reopen only when a current Canadian/Québec product or supplier source identifies standalone human-food pearl-millet starch and an independent Québec terminology review supports its product-specific French display.
2. If that evidence arrives, first recheck exact-key ownership and picker behavior. Keep `bajra`, `bajri`, `sajjalu`, `kambu`, `sajje`, `mil`, `petit mil`, and flour terms off the starch row unless a product source directly supports a qualified starch phrase and the resulting broad-query behavior is accepted.
3. Require separate evidence for each measure, form, density, conversion, yield, recipe link, and substitution rule. Do not promote research recovery, table density, or the extruded-snack formula into reusable kitchen data.
4. Keep WP02 Section 04 B3 open. This no-delta proposal does not close the water-chestnut and regional-starch parent.

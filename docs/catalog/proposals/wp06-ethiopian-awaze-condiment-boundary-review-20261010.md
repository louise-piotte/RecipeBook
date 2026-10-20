# WP06 Section Z — Ethiopian awaze condiment boundary review

- **Date:** 2026-10-10
- **Status:** Proposal only. Recommend adding one Ethiopian `awaze` identity; keep Eritrean attribution open pending direct regional evidence. No shared catalog, ledger, plan, roadmap, recipe, code, or test changes are made.
- **Scope:** The named awaze condiment and directly adjacent terms. Niter kibbeh was integrated in the earlier African tranche and is not re-proposed here.
- **Decision owner:** Catalog coordinator. Recheck the live package before integration.

## Recommendation

Add one identity-only `SAUCE_AND_CONDIMENT` reference for Ethiopian **awaze**. Independent Ethiopian culinary training and food-science sources use the name for a prepared condiment, while the Québec OLO/Dispensaire profile lists `Awaze` separately from `Berbéré` and describes it as a condiment. Sources vary in whether they present it as a dip, sauce, or paste, and food-science work reports household formulation variability. That variation supports a named condiment family; it does not establish one recipe, a fixed fermentation state, or a universal texture.

Suggested record, subject to coordinator review:

| Field | Proposal | Evidence and limit |
|---|---|---|
| ID | `ingredient-ref-awaze` | No active or legacy ID collision in the package snapshot below; recheck before integration. |
| Category | `SAUCE_AND_CONDIMENT` | Source-defined prepared condiment, distinct from dry spice blends. |
| English display | `awaze` | Source name; no regional qualifier beyond Ethiopia is asserted. |
| fr-CA display | `awaze` | A Québec institutional culinary/nutrition profile uses this headword and describes it as a condiment / `pâte épicée`. Retain the borrowed form. No direct OQLF/TERMIUM entry was located; keep localization review provisional. |
| English aliases | `awaze sauce`; `awaze paste` | Both source-attested phrasings that retain the named headword. They are search phrases, not claims that every awaze has one texture. |
| French aliases | None | `pâte épicée` is a generic description, not a safe global alias. |
| Forms and numeric data | None | No form, density, unit mapping, measurement, conversion, or yield is supported for the identity. |

The previous African sweep held awaze because one training recipe did not define a product-wide identity. This review adds direct Québec terminology evidence and peer-reviewed Ethiopian product research. The sources support the source-named condiment family independently of a standard recipe. They do **not** support making berbere, a particular pepper paste, or a particular dip preparation equivalent to awaze in all contexts.

## Product boundary and adjacent names

| Term or product | Finding | Disposition |
|---|---|---|
| **Awaze** | Ethiopian sources name a prepared condiment used with foods; the Québec profile calls it a condiment / spicy paste. A peer-reviewed Ethiopian study describes a fermented paste and reports variation among household preparations. | Add one Ethiopian condiment identity. Treat the cited preparations as examples of a variable product family, not as required ingredients, process, texture, or use. |
| **Berbere** | Already active as `ingredient-ref-berbere` in `BAKING_AND_SPICE`, with `berbere powder` as its English alias. The Québec profile lists it separately from awaze, and the Ministry training module uses the awaze heading for a distinct dip preparation. | Keep as a separate spice-blend identity. Do not alias `berbere`, `berbere powder`, or `berbere paste` to awaze. A particular preparation using berbere does not establish a universal equivalence. |
| **Eritrean awaze** | The core institutional and peer-reviewed sources reviewed here describe Ethiopian use. A Toronto restaurant page uses `Awaze Sauce` within a page about Ethiopian and Eritrean spices, but does not assign that sauce specifically to Eritrean practice. | Hold the Eritrean country attribution. Do not generalize the Ethiopia sources to an Eritrean product or spelling without direct Eritrean culinary, institutional, or academic evidence. |
| **`awazie`, `awaziya`, `awazé`** | No reviewed high-quality source establishes these as stable spellings for the condiment. | Do not add spelling aliases. Preserve source spellings in future recipe-specific evidence. |
| **`awaze tibs`** | Names a prepared meat dish in recipe and menu sources, rather than another name for the condiment. | Keep as a dish/use phrase, not an awaze alias or separate condiment identity. |
| **Generic descriptions** (`hot sauce`, `pepper sauce`, `red pepper paste`, `Ethiopian hot sauce`, `Ethiopian chili dip`) | These describe broader sauce or paste classes and do not uniquely identify the source-named condiment. | Do not activate as aliases. |
| **Niter kibbeh** | Already integrated as `ingredient-ref-niter-kibbeh` in `FAT_AND_OIL`. | No new identity or review is proposed. It is not an awaze alias. |

## Live package audit

Snapshot read on 2026-10-10. The exact search check follows `IngredientSearch.kt`: normalize bilingual reference and form terms, return contiguous phrase matches first, then fall back to substring matching. The active ingredient-reference file has 708 rows (SHA-256 `ef3acf8ab40b61060edcf3cfffa1f4fd7765488d17a6feb9dccac78a3464671c`); the form file has 34 rows (SHA-256 `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938`). The manifest-ordered recipe corpus has 114 files and 1,123 ingredient records (SHA-256 `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629`). These snapshot values will become stale as shared work continues.

No active or legacy entry owns `ingredient-ref-awaze` or an exact normalized awaze spelling. The search results for relevant probes were:

| Query | Current result |
|---|---|
| `awaze`, `awazie`, `awaze sauce`, `awaze paste` | No result |
| `Ethiopian hot sauce`, `Ethiopian pepper sauce`, `hot sauce`, `red pepper paste`, `berbere paste` | No result |
| `pepper sauce` | `ingredient-ref-shito` only; its display includes “Ghanaian pepper sauce.” Do not add this generic phrase to awaze. |
| `berbere` | `ingredient-ref-berbere` only |
| `niter kibbeh` | Existing `ingredient-ref-niter-kibbeh` only |

All 114 manifest-listed recipes and 1,123 ingredient records were scanned. There are **zero** occurrences of `awaze`, `awazie`, `berbere`, `niter kibbeh`, `Ethiopian`, or `Eritrean` in recipe JSON. Thus there is no current bundled recipe demand or recipe link for awaze; this proposal fills a catalog identity gap only.

## Forms, measurements, and substitutions

No form, density, unit mapping, package value, measurement, conversion, substitution, or recipe link is proposed. The cited food-science papers study product preparation and quality, not a catalog-wide conversion or substitute. No recipe composition, amount, process instruction, or substitution is inferred from them.

## Sources

Sources were accessed on 2026-10-10. Proposal-local IDs below are for citation within this review; this proposal does not add or alter ledger rows.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP06-AWAZE-20261010-S01** | Ethiopian Ministry of Labor and Skills, [*Preparing Ethiopian Cereal and Vegetable Dishes*](https://library.dbpolytech.edu.et/Resource/ICT/Prepare%20Ethiopian%20Cereal%20and%20Vegetable%20Dishes%20.pdf), training module, December 2022, §1.5 (printed pp. 42–43) | Names `Awaze` in a section on Ethiopian dips and identifies the example as an Ethiopian chili dip. This establishes a source-named prepared condiment, not a national recipe or standard. |
| **WP06-AWAZE-20261010-S02** | Kefale et al., [“Optimization of spicy red pepper paste (Awaze) formulation by D-optimal mixture design”](https://pmc.ncbi.nlm.nih.gov/articles/PMC10916596/), *Food Science & Nutrition* (2024), DOI 10.1002/fsn3.3874 | Ethiopian Institute of Agricultural Research and Bahir Dar University authors describe Awaze as a fermented paste and report that household preparations vary. Supports the product identity and family-level variability; the experimental formulation is not adopted as a standard. |
| **WP06-AWAZE-20261010-S03** | Kefale et al., [“Effect of packaging materials and storage temperature on the shelf stability of Awaze paste”](https://www.frontiersin.org/journals/nutrition/articles/10.3389/fnut.2024.1503328/full), *Frontiers in Nutrition* (published 2025), DOI 10.3389/fnut.2024.1503328 | Describes Awaze as a fermented sauce used in rural Ethiopian households and identifies the study’s regional source context. This is corroboration from a related research group, not an independent national product survey; no storage or safety guidance is inferred. |
| **WP06-AWAZE-20261010-S04** | Fondation OLO and Dispensaire diététique de Montréal, [*Profils alimentaires — Afrique de l’Est*](https://stage.fondationolo.ca/wp-content/uploads/2017/11/fondation-olo-profils-alimentaires-afrique-est.pdf), 2017, Ethiopia glossary, p. 36 | Québec French-language culinary/nutrition material lists `Awaze` as a condiment and describes it as a spicy paste, separately from `Berbéré`; it also notes that glossary usage can vary between families. Supports `awaze` as the fr-CA borrowed display and the Awaze/Berbéré boundary. It is not a terminology-board ruling or evidence of one standard formulation. |
| **WP06-AWAZE-20261010-S05** | Selam Restaurant & Lounge, [“Our unique spices and sauces”](https://selamrestaurant.ca/spices-sauces/), Toronto | The restaurant frames its spice selection in Ethiopian/Eritrean terms and uses the heading `Awaze Sauce`. Supports an English menu/product phrase in Canadian diaspora use. The page does not distinguish whether its awaze is specifically Ethiopian, Eritrean, or shared, so it does not establish Eritrean-wide scope. |

## Next actions

1. At integration, reread the live package and repeat the active-reference, form, legacy-ID, normalized-search, and full-manifest recipe scans.
2. If accepted, add only `ingredient-ref-awaze` as `SAUCE_AND_CONDIMENT`; retain `awaze` in both locale displays and the two narrow English phrases `awaze sauce` and `awaze paste`. Keep the fr-CA borrowed label flagged for independent localization review.
3. Keep generic sauce/paste phrases and unsupported spelling variants out of aliases. Do not attach recipe, form, numeric, or substitution data.
4. Resolve Eritrean country attribution in a later packet only if direct Eritrean evidence establishes it. This proposal does not close the broader WP06 Section 05 or Section Z coverage.

# WP02 B2/B3 residual regional flour and starch review

- **Batch:** `WP02-B23-RESIDUAL-20261010`
- **Date:** 2026-10-10
- **Status:** Proposal only. No catalog, ledger, recipe, test, plan, or roadmap changes are included in this review.
- **Decision:** Keep the existing broad arrow-root starch identity and propose food-product label aliases with their evidence limits. Keep all water-chestnut flour/starch candidates on hold: available sources establish multiple distinct *Eleocharis* and *Trapa* products, but do not establish safe shared names or Québec French displays. Do not add new regional-starch rows or numeric behavior in this batch.

## Audit snapshot

The read-only review used the active checklist in `docs/RecipeBook-global-ingredient-catalog-plan.txt`, the B2/B3 batch notes, current seed references/forms, current proposal and batch files, the research ledger, legacy candidates, and the live bundled recipe corpus. Snapshot values below describe the workspace as inspected on 2026-10-10; the workspace already contained concurrent work in progress.

| Surface | Snapshot |
|---|---|
| Catalog references | 751 rows; SHA-256 `801584a93190b050d7c6cc9736f520520e6fb8d0765a034f952dac8c2368b4c5` |
| Forms | 34 rows; SHA-256 `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research ledger | 956 records / 1,932 source entries / 1,565 distinct source IDs; SHA-256 `27ac5cccde7cb0234e5b386dcd18ecc0759eea6bbfec5f325ec57ba389042191` |
| Legacy candidates | 82 rows; SHA-256 `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| Seed-package manifest | SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Live recipe corpus | 114 recipes / 1,123 ingredient rows; fingerprint `0ad0509ff9a3df3c7f3899e3304f94c9ac814efa347fe1cdface1d5883304b1d` |

The recipe fingerprint was recalculated over manifest-ordered recipe files using each manifest-relative path, a NUL separator, exact file bytes, and a trailing NUL. It is a point-in-time live-worktree fingerprint; older proposal notes describe a different corpus snapshot.

The exact phrase audit used the app's current normalization behavior (case folding, diacritic folding, and punctuation/space normalization). It found one active recipe line that names arrowroot as an alternative, but no water-chestnut flour or starch lines. No proposed water-chestnut product phrase currently resolves to a seed reference, form, or legacy candidate. The existing tree-chestnut flour row is a collision hazard for the short phrase `chestnut flour`; preserve that identity and never use the short phrase as a water-chestnut alias.

The proposed source IDs `WP02-B23-RESIDUAL-20261010-S01` through `WP02-B23-RESIDUAL-20261010-S17` were checked against existing source IDs; no collisions were found.

## 1. Arrow-root: retain one extracted-starch identity

The current row is `ingredient-ref-arrowroot`, displayed as `arrowroot / arrow-root`, category `FLOUR_AND_STARCH`, with no aliases, density, or unit mappings. OQLF's food-starch entry selects French `arrow-root`, gives English `arrowroot starch` and `arrowroot`, and says commercial arrow-root may be extracted from different tropical plants. Bob's Red Mill calls its extracted starch both “Arrowroot Starch” and “Arrowroot Flour”; a Canadian retail listing titled “Gluten Free Arrowroot Flour” identifies its ingredient as `ARROWROOT STARCH`. India's eNAM standard also defines “arrowroot powder” as separated, purified starch. These support a product-label alias family for food-grade extracted starch; they do not establish one botanical source for every label. [S01, S03–S06]

| Field | Recommendation | Evidence limit / boundary |
|---|---|---|
| Keep ID and names | `ingredient-ref-arrowroot`; EN `arrowroot`; FR `arrow-root`; category `FLOUR_AND_STARCH`. | Do not narrow the general commercial identity to *Maranta arundinacea*. OQLF says the commercial starch may come from several tropical species. |
| Proposed EN aliases | `arrowroot starch`; `arrowroot flour`; `arrowroot powder`. | `arrowroot starch` is the OQLF English term; `arrowroot flour` is used for a Canadian retail food product whose ingredient is arrowroot starch; eNAM defines arrowroot powder as purified starch. Treat these only as food-ingredient labels. |
| Proposed FR aliases | `farine d’arrow-root`; `fécule d’arrow-root`. | Metro’s French product listing uses the first in its title and the second for the ingredient; both name the same extracted starch product. Retain OQLF’s `arrow-root` as the preferred display name. |
| Exclude / hold | `marante`, `fécule de marante`, `Japanese arrowroot`, `kudzu`, `tapioca`, generic cassava/manioc starch, and unspecified “root flour.” | OQLF distinguishes broad commercial arrow-root from maranta starch. “Japanese arrowroot” overlaps the distinct kudzu/kuzu class; tapioca is cassava-derived and is not an arrowroot alias. |
| Separate product boundary | Do not create a whole-root or whole-rhizome flour row from the retail word `flour`. | The cited food products labeled flour/powder are extracted, purified starch, not ground whole root. A source that actually identifies whole-plant material would require a separate review. |

### Arrow-root measurements and recipe use

Keep `defaultDensity` null and `unitMappings` empty. Bob's Red Mill's own chart reports `1/4 cup = 36 g` and `1 cup = 144 g` for its Arrowroot Starch. This is a single-brand cup-to-mass observation, not a transferable density or a generic catalog mapping; the chart does not provide a packing method or a direct g/mL density. Preserve it only as a source-scoped observation if the ledger needs it. [S05]

Bob's Red Mill recommends its product as a 1:1 cornstarch replacement for sauces, stews, and soups, with a cool-water slurry; it warns that prolonged high-temperature cooking can break down thickening and that milk-based cream sauces may curdle. That is bounded manufacturer guidance, not a universal conversion or a safe global substitution rule. Keep the global substitution model unchanged. [S04]

Active recipe-line audit:

- Recipe 029 has one line, `2 tbsp cornstarch or arrowroot`, linked to cornstarch, with an English note `or arrowroot` and French note `ou marante`. The line is an explicit recipe-level alternative, not an alias or a global rule.
- Its source, Baking With Butter's [Cherry Cake Filling](https://bakingwithbutter.com/cherry-cake-filling/), currently lists 2½ tablespoons of cornstarch or arrowroot and boils the filling. The bundled line says 2 tablespoons. Treat this as a source/seed quantity drift for a later recipe-specific review; do not derive a normalized mass or silently adjust the line here. The article includes a reader comment reporting an undesirable texture after trying arrowroot; that anecdote is not authoritative evidence against the recipe's stated option. [S08]
- The French note `marante` is not a safe alias for the broad arrow-root row. If that recipe is revisited, review the line's localized wording separately; this proposal does not edit it.

## 2. Water chestnut: hold four source-distinct products

“Water chestnut” cannot safely identify one flour/starch material. Food sources use it for both the edible corm of *Eleocharis* and the fruit/kernel of *Trapa*. Primary studies distinguish *Eleocharis dulcis* whole-corm flour from extracted corm starch using different preparation steps. Indian commodity guidance defines water-chestnut flour as ground dried *Trapa* nuts. Primary food-science research separately extracts starch from *Trapa bispinosa* kernels; another 2026 study reports an extraction process for *Trapa natans*. These are evidence for distinct product candidates, not interchangeable ingredient records. [S09, S13–S15]

The following English and French strings are **working descriptors for review only**, not approved display names or aliases. In particular, `Chinese water chestnut` is unsafe as a disambiguator: it is used for *Eleocharis* food products and appears among Kew's common names for *Trapa natans* var. *bispinosa*. Québec sources also pair `châtaigne d’eau` with both a Chinese-sedge entry and water caltrop/*Trapa* in different records; the 1982 OQLF entry spells its botanical name `Elcocharis tuberosa` [sic], while the current Québec flora page uses `châtaigne d’eau` for *Trapa natans*. This spelling discrepancy is another reason to keep the botanical mapping under review. A botanical/food-use review is needed before any French display name or broad alias is activated. [S10–S12, S16]

| Distinct product candidate | Source-backed product boundary | Exact bilingual working descriptor (not accepted catalog copy) | Decision |
|---|---|---|---|
| Whole-corm flour, *Eleocharis dulcis* | Corm is peeled, sliced, dried, milled, and sieved; it is not purified starch. | EN `Eleocharis dulcis corm flour`; FR `farine de cormes d’Eleocharis dulcis`. | Hold: no safe short bilingual common name established. |
| Extracted corm starch, *Eleocharis dulcis* | Corm is wet-ground, filtered, settled, dried, milled, and sieved to isolate starch; distinct from corm flour. | EN `Eleocharis dulcis corm starch`; FR `fécule de cormes d’Eleocharis dulcis`. | Hold: species-qualified descriptive wording needs Québec review. |
| Whole dried-fruit flour, *Trapa* spp. | eNAM describes water-chestnut flour as ground dried nuts of *Trapa bispinosa* or *T. quadrispinosa* and gives `Singhare ka atta`. Do not collapse this into *Eleocharis* corm flour. | EN `Trapa dried-fruit flour (Singhare ka atta)`; FR `farine de fruits séchés de Trapa (Singhare ka atta)`. | Hold: source supports product in a regional commodity standard, but no Québec French food name or stable species scope was found. |
| Extracted fruit/kernel starch, *Trapa* spp. | A 2024 study peels *T. bispinosa* kernels and uses wet grinding, sieving, and centrifugation to collect starch; Kew records *T. bispinosa* as a synonym of *T. natans* var. *bispinosa*. A 2026 *T. natans* study separately reports starch extraction. Neither supports treating whole-fruit flour as starch. | EN `Trapa fruit starch`; FR `amidon extrait de fruits de Trapa`. | Hold: the French descriptor and species scope need independent review; do not activate `water caltrop starch` as a broad cross-species synonym. |

### Water-chestnut measurements, forms, and substitutions

- No water-chestnut candidate has an active recipe line, catalog form, legacy row, or usable kitchen conversion in this snapshot. Do not add a `RecipeIngredientForm`, `defaultDensity`, `unitMappings`, household measure, or substitution edge.
- Borah et al. report one extracted *T. bispinosa* starch sample's bulk density as `0.65 ± 0.04 g/mL`, tapped density as `0.97 ± 0.12 g/mL`, and true density as `1.43 ± 0.22 g/mL`. These are three distinct laboratory material tests on that sample, not a kitchen bulk-density default, package conversion, or value transferable to the other three candidates. If retained, store as separate source-qualified observations with method and product identity. [S14]
- The extraction studies' yields, solvent ratios, soaking/alkali conditions, and kernel/flour composition are process or laboratory measurements; they are not recipe-line quantities, volume conversions, or substitution ratios. No culinary substitution evidence supports one of these products replacing another or replacing a common starch/flour generally. [S09, S13–S15]
- Do not alias any of `water chestnut flour`, `water chestnut starch`, `Chinese water chestnut flour/starch`, `water caltrop flour/starch`, `châtaigne d’eau`, `Singhara atta`, `Singhare ka atta`, or `singhara` across these candidates. Some are common names or regional product terms, but without organ/species context they collide across *Eleocharis* and *Trapa*. Keep `chestnut flour` reserved for the existing tree-chestnut reference.

## 3. Other B2/B3 regional entries to carry forward unchanged

This residual review found no evidence to revise the identity-only decisions already proposed for other regional starches. Their open terminology flags remain open; do not infer measurements, forms, or substitutions from the identity sources.

| Current ref | Current proposal/status | Carry-forward boundary |
|---|---|---|
| `ingredient-ref-kudzu-starch` | `kudzu starch / kouzou`; candidate alias `kuzu starch`; botanical scope still needs clarification. | Keep separate from arrow-root. Do not alias `Japanese arrowroot` to either row. |
| `ingredient-ref-sweet-potato-starch` | `sweet potato starch / fécule de patate douce`; identity evidence is strong. | Keep distinct from whole sweet potato and whole-root flour. |
| `ingredient-ref-mung-bean-starch` | `mung bean starch / amidon de haricot mungo`; French product wording remains provisional. | Keep distinct from whole mung beans, mung-bean flour, and finished bean-thread noodles. |
| `ingredient-ref-lotus-root-starch` | `lotus root starch / amidon de racine de lotus`; French display remains provisional. | Keep distinct from lotus-root vegetable and from unverified lotus-root flour/powder. |
| Brazilian `polvilho doce` / `polvilho azedo`; palm-sago flour/pearls; tapioca pearls | Existing source-bounded identities in prior work. | Do not reopen or create generic cassava/tapioca/sago cross-aliases here. |

The plan's B2/B3 checklist remains open after this review. Water-chestnut taxonomy and Québec naming need a dedicated decision; arrow-root alias integration should wait for the catalog's normal review; remaining B2/B3 coverage is not complete by resolving this residual set.

## Collision and source-ID audit

| Candidate phrase set | Exact active catalog/form/legacy collision result | Recipe/corpus result |
|---|---|---|
| `arrowroot`, `arrow-root` | Both resolve to `ingredient-ref-arrowroot`. `arrowroot starch`, `arrowroot flour`, `arrowroot powder`, `fécule d’arrow-root`, `farine d’arrow-root`, `marante`, `Japanese arrowroot`, and `kudzu starch` do not currently resolve through the seed search index. | One explicit alternative line in Recipe 029; it links to cornstarch and its French note says `ou marante`. No other current recipe mentions were found. |
| `water chestnut`, `châtaigne d’eau` | Both resolve only to the existing whole-vegetable `ingredient-ref-water-chestnut`; none of the flour/starch candidate phrases resolves. | No water-chestnut flour/starch recipe lines found. |
| `water caltrop`, `water caltrop flour/starch`, `Trapa natans starch`, `Trapa starch`, `Singhara ka atta`, `Singhare ka atta`, `amidon de Trapa`, *Eleocharis*-qualified French descriptors | No exact match in the 751 current refs, 34 forms, or 82 legacy candidates. | No active line found. |
| `chestnut flour`, `farine de châtaigne` | Resolve to existing tree-chestnut flour, not water chestnut. | Preserve as a separate nut-flour identity. |

No catalog/ledger source ID, proposed reference ID, or source-prefix collision was found for the candidate terms. Do not create IDs until product scope and bilingual names are approved.

## Source register

All links were accessed 2026-10-10. Source IDs use the unique prefix `WP02-B23-RESIDUAL-20261010`.

- **S01** — [OQLF, “arrow-root” (Grand dictionnaire terminologique)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522596/arrow-root). Preferred French name, English terms, food-starch definition, and note that commercial arrow-root may come from multiple tropical species.
- **S02** — [U.S. FDA, CPG Sec. 578.100, “Starches—Common or Usual Names”](https://www.fda.gov/regulatory-information/search-fda-guidance-documents/cpg-sec-578100-starches-common-or-usual-names). U.S. labeling guidance distinguishes *Maranta arundinacea* arrowroot from similar starches from other plants. Used only as a naming caution, not as a Canadian legal conclusion.
- **S03** — [India eNAM, Raw Arrowroot Powder specification](https://enam.gov.in/web/docs/221_commodity_list.pdf). Defines arrowroot powder as separated and purified starch from rhizomes of named plants; regional standard, not a Canadian naming rule.
- **S04** — [Bob’s Red Mill, “All About Starches”](https://www.bobsredmill.com/articles/all-about-starches). Brand-specific statement that arrowroot starch is also called arrowroot flour, processing description, and bounded thickening guidance.
- **S05** — [Bob’s Red Mill, “Flour Weight Chart”](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart). Brand-specific Arrowroot Starch cup-to-gram values.
- **S06** — [Metro Canada, Bob’s Red Mill Gluten Free Arrowroot Flour](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-d-arrow-root-sans-gluten/p/039978335050). Canadian French food retail listing titled `Farine d’arrow-root sans gluten`; the French ingredient list says `Fécule d’arrow-root`. The English listing titles it Arrowroot Flour and gives `ARROWROOT STARCH` as the ingredient.
- **S07** — [Good n’ Natural, Arrowroot Powder](https://goodandnatural.ca/good-n-natural-arrowroot-powder/). Canadian retailer's food product listing describing arrowroot powder as a culinary starch. Secondary retail evidence for the English product label.
- **S08** — [Baking With Butter, “Cherry Cake Filling”](https://bakingwithbutter.com/cherry-cake-filling/). Current recipe option/source text; its present quantity differs from bundled Recipe 029.
- **S09** — [Panid Rujirapisit, “Chemical Composition and Some Physicochemical Properties of Chinese Water Chestnut (*Eleocharis dulcis* Trin.) Flour and Starch” (2005 proceedings PDF)](https://www.thaiscience.info/Article%20for%20ThaiScience/Article/2/10029953.pdf). Distinguishes *Eleocharis dulcis* corm flour processing from extracted starch processing.
- **S10** — [OQLF, “châtaigne d’eau” (Chinese sedge entry)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434646/chataigne-deau). 1982 Québec record for the edible Chinese-sedge tuber, with source spelling `Elcocharis tuberosa` [sic]; do not normalize that botanical spelling or treat the unqualified French name as a food-starch name.
- **S11** — [OQLF, “châtaigne d’eau” (water-caltrop entry)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19475118/chataigne-deau). Pairs the French plant name with English `water caltrop` and associated `water chestnut`.
- **S12** — [Gouvernement du Québec, “Châtaigne d’eau”](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/flore/fiches-especes-floristiques/chataigne-eau). Current flora page pairs the name with *Trapa natans*. Its conservation/legal notice is not interpreted here as a food-product determination.
- **S13** — [India eNAM, Water Chestnut Flour specification (commodity-list PDF, item 228)](https://enam.gov.in/web/assest/download/sul/238_commodity_list.pdf). Defines regional flour from ground dried *Trapa* nuts and gives `Singhare ka atta`.
- **S14** — [Borah et al. (2024), “Optimization of water chestnut (*Trapa bispinosa*) starch…”](https://pubs.rsc.org/en/content/articlehtml/2024/fb/d4fb00101j), *Sustainable Food Technology* 2, 837–848, DOI [10.1039/D4FB00101J](https://doi.org/10.1039/D4FB00101J). Primary study extracts starch from peeled *Trapa bispinosa* kernels; reports sample-specific bulk, tapped, and true density results.
- **S15** — [Vietnam Journal of Agriculture and Environment (2026), “Optimization of the starch extraction process from water caltrop (*Trapa natans*)…”](https://tapchikhoahoc.nnmt.net.vn/index.php/vjae/article/view/2957), published 2026-07-25, DOI [10.71254/nmj5dj82](https://doi.org/10.71254/nmj5dj82). Primary extraction study; process/yield is not a culinary measure. The source's translated common-name wording does not establish a Québec product name.
- **S16** — [Kew, Plants of the World Online, *Trapa natans* var. *bispinosa*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:77098653-1/general-information). Lists *Trapa bispinosa* among synonyms and includes `Chinese water chestnuts`, `singhara nut`, and `singara` among common names; shows why the unqualified English term is ambiguous.
- **S17** — [Kew, Plants of the World Online, *Trapa bispinosa*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:431561-1). Taxonomic reference records the name as a synonym of *Trapa natans* var. *bispinosa*.

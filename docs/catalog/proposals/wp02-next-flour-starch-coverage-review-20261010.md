# WP02 B2/B3 — Xanthosoma corm flour and starch naming review

- **Reviewed:** 2026-10-10
- **Status:** Root reviewed the packet and recorded separate held candidate records in the research ledger. No canonical ingredient-reference, form, recipe, numeric conversion, or substitution data was added.
- **Scope:** Whole-corm flour from *Xanthosoma sagittifolium* (the OQLF-defined malanga), plus a separate genus-level extracted-starch sample identified only as *Xanthosoma* sp. This is a species-qualified flour follow-up to, not a reopening of, the accepted *Colocasia esculenta* taro-flour identity or the held *Colocasia* taro-starch name.
- **Source IDs:** `WP02-XANTHOSOMA-CORM-PRODUCTS-20261010-S01` through `S08`; these IDs and the corresponding citations are recorded on the two held candidate records in `docs/catalog/research-ledger.v1.json`.

## Recommendation

The evidence supports whole-corm flour made from *X. sagittifolium*. Separate research supports an extracted-starch sample identified only as *Xanthosoma* sp.; it does not establish *X. sagittifolium* starch specifically. **Keep both product candidates out of the canonical catalog for now because their exact Québec French product names are not established well enough, and retain the starch candidate at genus-level scope.** The English flour name `malanga flour` is directly attested. OQLF gives the Québec French base name `malanga` for *X. sagittifolium*, and a Québec marketplace lists a flour as `Farine de macabo (colocase-malanga)`, but that mixed listing does not identify its botanical ingredient. It is not enough to validate `farine de malanga` as the exact Québec product name. [S01, S05–S06]

| Candidate product | Working wording for reviewer only | Disposition and boundary |
|---|---|---|
| Whole-corm flour from *X. sagittifolium* | EN `malanga flour`; proposed fr-CA `farine de malanga` | **Hold canonical addition pending independent Québec French review or an unambiguous Québec product label.** If the name is confirmed, consider `ingredient-ref-malanga-flour` in `FLOUR_AND_STARCH`. Define it as dried, milled edible corm material, retaining the corm’s non-starch material. Keep separate from *Colocasia* taro flour and isolated malanga starch. No aliases are established. |
| Starch isolated from a corm identified as *Xanthosoma* sp. | Working label only: `Xanthosoma corm starch`; no French display proposed | **Hold.** The extraction study does not identify its sampled Xanthosoma to species, and the reviewed sources do not establish a Québec food-product name. Do not label it `malanga starch`, create a row, or reserve an ID from this proposal. Keep it separate from whole-corm flour, *Colocasia* taro starch, and arrow-root. |

The French compounds above are working constructions from the OQLF-preferred base term, not OQLF-approved ingredient headwords. `macabo` should not be made a global alias: OQLF marks it as a context term for a neighboring species in Cameroon, while a Cameroonian dissertation uses it for *X. sagittifolium*. That conflict, alongside the ambiguous Québec retail listing, makes `farine de macabo` unsafe as an unqualified species-level catalog name. [S01, S04–S06]

## Identity and product boundary

OQLF identifies `malanga` with *Xanthosoma sagittifolium* and lists `yautia`, `chou des Caraïbes`, and `chou caraïbe` as preferred French terms. The page defines the corm-bearing plant; it does not define flour or starch products. It lists `macabo` only in a context note for a neighboring species in Cameroon. [S01]

Primary food-science research treats *X. sagittifolium* flour and *Colocasia esculenta* flour as separately produced materials and reports differences in composition and physical/functional properties. A second primary study directly labels its product `malanga flour (*X. sagittifolium*)` and describes making it from peeled, sliced corms that are dried, milled, and sifted. These sources support a narrow whole-corm flour identity, not synonymy with taro flour or any extracted starch. [S02–S03]

A Cameroonian university dissertation identifies macabo as *X. sagittifolium* and documents a French product phrase `farine de macabo` made by drying and grinding corms. This is useful regional French evidence, but it is not Québec terminology authority; it also conflicts with OQLF’s context note about `macabo`. The current Québec marketplace title `Farine de macabo (colocase-malanga), 680 g` combines names associated with different aroid boundaries and exposes no ingredient panel or botanical source. Do not use it to assign `macabo` or `colocase` to a species-specific flour. [S04–S06]

The reviewed extraction study isolates starch from a sample identified only as *Xanthosoma* sp. Flour and isolated starch therefore remain distinct products; this genus-level sample does not establish a species-specific *X. sagittifolium* starch identity, a market-wide French product name, or an alias of flour. The accepted taro-flour and held taro-starch work is scoped to *Colocasia esculenta*. Do not broaden either decision to *Xanthosoma* based on shared vernaculars such as `taro`, `cocoyam`, or `malanga`. [S02, S08]

## Live catalog and recipe audit

The snapshot inspected for this packet contains **887 active ingredient references, 48 forms, 1,132 research-ledger records, 77 legacy candidates, and 114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Finding | Consequence |
|---|---|---|
| Active references | `ingredient-ref-malanga` is `malanga / malanga` in `VEGETABLE_AND_AROMATIC`; `ingredient-ref-taro-flour` is `taro flour / farine de taro` in `FLOUR_AND_STARCH`. No `ingredient-ref-malanga-flour` exists. | Keep the fresh corm, *Colocasia* flour, whole-corm *Xanthosoma* flour, and any extracted starch separate. Bare `malanga` is not a flour alias. |
| Forms | No form is linked to `ingredient-ref-malanga` or `ingredient-ref-taro-flour`; no form label or match term names malanga flour or starch. | Add no form or preparation-state mapping. |
| Legacy candidates and ledger | No legacy candidate or existing decision owns `malanga flour`, `farine de malanga`, `malanga starch`, or a candidate ID. The existing malanga ledger record verifies only the vegetable identity and says measurement/substitution work has not been researched. | No legacy promotion or existing flour/starch decision to reuse. Keep this review’s source IDs proposal-local. |
| Recipe corpus | A normalized whole-phrase scan of every string field and ingredient line in all 114 manifest-listed files found **zero** matches for `malanga flour`, `farine de malanga`, `farine de macabo`, `Xanthosoma flour`, `cocoyam flour`, `tannia flour`, `yautia flour`, `malanga starch`, and French starch variants. | No recipe link, relink, or recipe-specific measurement is supported by current demand. |

## Measurements and substitutions

- The 2007 comparative study reports laboratory relative-density and functional-property differences for its *Xanthosoma* flour sample. These results are sample and method specific; they are not a household cup weight, `g/ml` default density, or unit mapping. The 2021 study’s test dispersion, autoclaving, freeze-drying, and resistant-starch results are experimental processing data, not kitchen measures. Do not add active density, unit mappings, yield, or conversion observations from these values. [S02–S03]
- The manufacturer product page lists package sizes for its white-malanga flour but no volume-to-mass conversion or unambiguous species. Package size is not a density observation. [S07]
- A manufacturer’s broad statement that a product can replace other flours and research formulations using flour or extracted starch do not supply a generally valid replacement direction or ratio. Add no global or contextual substitution rule, including flour-for-flour, flour-for-starch, or malanga-for-cornstarch. [S03, S07–S08]

## Exact no-op boundaries

- Do not add `cocoyam flour`, `new cocoyam flour`, `taro flour`, `taro de montaña flour`, `macabo flour`, `farine de macabo`, `colocase flour`, `farine de colocase`, `dasheen flour`, `yautia flour`, `chou des Caraïbes flour`, `arrowleaf flour`, or `elephant ear flour` as aliases. These terms either span multiple aroids or lack product-level Québec evidence. OQLF’s `yautia` and Caribbean-cabbage terms name the plant, not this flour product. [S01, S05–S06]
- Do not merge whole-corm flour with isolated starch, starch-containing corm powder, instant/flavored powders, leaf flour, or products from another Xanthosoma species.
- Do not add forms, densities, unit mappings, recipe links, conversions, package yields, substitutions, or ledger measurements.
- Do not change the existing malanga vegetable row, *Colocasia* taro-flour row, taro-starch hold, recipe corpus, roadmap, or checklist in this proposal.

## Acceptance checks for any later integration

1. Have an independent Québec terminology reviewer confirm whether `farine de malanga` is an acceptable fr-CA ingredient display, or provide an exact Québec package/product label that identifies *X. sagittifolium*.
2. If flour is accepted, use only `malanga flour / farine de malanga` (or the reviewed Québec name), category `FLOUR_AND_STARCH`, null density, empty unit mappings, and no aliases. Do not use `macabo` or broad aroid terms without separate source-qualified review.
3. Keep extracted Xanthosoma starch held until the sampled species/product scope and exact Québec product term are independently confirmed; do not use the genus-level study as evidence for *X. sagittifolium* specifically.
4. Confirm the new identity in an exact EN/fr-CA catalog search while the broader `malanga` query may return both the vegetable and flour. Preserve zero recipe relinks and zero numeric or substitution behavior unless separately supported.

## Source register

Sources accessed 2026-10-10. These IDs are unique to this proposal and are not additions to the research ledger.

| ID | Source and evidence limit |
|---|---|
| **S01** | Office québécois de la langue française, [malanga (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/42924/malanga), updated 2009. Gives preferred French `malanga`, `yautia`, `chou des Caraïbes`, `chou caraïbe`; identifies *Xanthosoma sagittifolium*; lists `macabo` only in a context note for a neighboring Cameroon species. Names the plant, not its flour or starch. |
| **S02** | E. E. Pérez et al., [“Production and Characterization of *Xanthosoma sagittifolium* and *Colocasia esculenta* Flours”](https://doi.org/10.1111/j.1750-3841.2007.00420.x), *Journal of Food Science* 72(6) (2007), S367–S372. Primary comparative study of flours made from the edible portions of both taxa; reports species/sample differences including laboratory relative density. No kitchen measure or substitution ratio is reported in the abstract. |
| **S03** | [“Physicochemical Characterization of Resistant Starch Type-III (RS3) Obtained by Autoclaving Malanga (*Xanthosoma sagittifolium*) Flour and Corn Starch”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8271965/), *Molecules* 26(13) (2021), 4006. Primary study explicitly identifies malanga flour from *X. sagittifolium* corms and describes slicing, drying, milling, and sifting. Its autoclaving/corn-starch treatment is a laboratory process, not a culinary substitution rule. |
| **S04** | University of Yaoundé I, [“Effet des mycorhizes sur la croissance du macabo (*Xanthosoma sagittifolium*)”](https://dicames.online/jspui/bitstream/20.500.12177/5287/1/ENS_2016_mem_0150.pdf), 2016 dissertation, pp. 10–11. Identifies macabo with *X. sagittifolium* and describes making `farine de macabo` by drying and grinding. Regional thesis evidence, not a Québec naming authority or product standard. |
| **S05** | Melus-Mart, [Farine de macabo (colocase-malanga), 680 g](https://www.melus.ca/shop/farine-de-macabo-colocase-malanga-680-g-1858), current Québec marketplace product listing. Attests the exact local listing phrase only; the accessible page does not identify the botanical ingredient. |
| **S06** | Melus-Mart, [Québec marketplace home page](https://www.melus.ca/). Identifies its main store as Mirabel, Québec and states delivery throughout Québec and Canada. This establishes local-market context for S05, not the product’s species. |
| **S07** | Vimor Group, [White Malanga Flour](https://vimor-group.com/en/project/white-malanga-flour/), current manufacturer page. Describes a powdered food from dehydrated and ground white malanga and lists 100% white malanga as ingredients; does not specify a Latin species or Québec French name. Package sizes are not volume conversions. |
| **S08** | Karmakar, Chakraborty, and Roy, [“Assessment of yield and characterization of starch extracted using different methods from the corms of some aroids in North Bengal region of India”](https://doi.org/10.1007/s44187-025-00588-z), *Discover Food* 5 (2025), article 290. Primary extraction study includes *Xanthosoma* and *Colocasia* taxa and documents separate corm-starch products. Extraction yields and lab properties do not establish a Québec label, kitchen measure, or culinary replacement ratio. |

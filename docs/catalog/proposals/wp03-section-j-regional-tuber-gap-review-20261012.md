# WP03 Section J — regional root and tuber gap review

- **Reviewed:** 2026-10-12
- **Status:** Proposal only. This review writes only this file; it does not edit catalog or ledger data, recipe files, the checklist, roadmap, workflow, or integration reports.
- **Scope:** Remaining named regional root/tuber questions around arrowhead, eddoe, malanga, true yam, and taro products. This is a bounded gap review, not a completion pass for Section J.
- **Source IDs:** `WP03J-REGIONAL-TUBER-GAP-20261012-S01`–`S12`; proposal-local only, not ledger records.

## Recommendations

| Name or boundary | Recommendation | Identity / alias boundary |
|---|---|---|
| **Arrowhead / wapato** | **Keep the generic candidate held.** | Food-use evidence supports more than one *Sagittaria* species under arrowhead names. TERMIUM gives a species-specific bilingual name pair for *S. latifolia* (`broadleaf arrowhead` / `sagittaire à larges feuilles`) and notes that `wapato` is also used for *S. cuneata*. USDA sources document food use for *S. latifolia* and for the distinct Chinese *S. sagittifolia*, but the Canadian arrowhead listings found in this pass were ornamental live plants, not food products. Do not add unqualified `arrowhead`, `wapato`, `duck potato`, `Indian potato`, or `Chinese arrowhead` as a catalog alias. Keep `arrowroot` on its existing ingredient identity. If a future source establishes a Canadian food product, scope it to the named species and product. [S04–S07, S12] |
| **Eddoe / eddo / arvi** | **Reaffirm the existing hold; add no row or taro alias.** | A current Ontario retail listing sells “Eddoe (Arvi),” but does not identify a botanical source. FAO describes eddoe and dasheen as rough *Colocasia esculenta* corm types and warns the names are applied inconsistently, with intermediate forms. A 2024 market study likewise found “eddoe” labels did not reliably track cultivar morphology. Keep `eddoe`, `eddo`, `arvi`, and `dasheen` out of aliases until a Canadian product specification supports the intended product scope. [S01, S08–S11] |
| **Taro and taro products** | **Retain the active product boundaries.** | Keep fresh taro corm (`ingredient-ref-taro`), whole-corm `taro flour / farine de taro`, and `taro leaves / feuilles de taro` separate. Keep extracted *Colocasia esculenta* corm starch held as `candidate-taro-corm-starch`; the existing Québec product-name review found no exact Canadian French label for that separated starch. Do not map flour, starch, leaves, or prepared/flavoured powders to the fresh corm. Keep `cocoyam` out of taro aliases because its usage can span *Colocasia* and *Xanthosoma*. [S01, S08, prior WP02 taro-starch reviews] |
| **Malanga / yautía** | **Keep `ingredient-ref-malanga` distinct; defer the existing alias proposal to its current owner.** | OQLF identifies malanga as *Xanthosoma sagittifolium*, calls the tubers edible, and lists French `yautia` and `chou des Caraïbes` plus English `yautia`, `tannia`, and other terms. The active row currently uses `malanga / malanga` without aliases. The WP06 Spanish-Caribbean proposal already considers Dominican `yautía` as a country-qualified alias for this row; do not duplicate that proposal here or broaden it to all Caribbean uses. Keep malanga distinct from *Colocasia* taro and *Dioscorea* yam. OQLF notes `macabo` as a name for a neighboring species in Cameroon; do not add it to the malanga aliases. [S02; prior WP06 Spanish-Caribbean proposal] |
| **True yam / igname** | **Retain the active genus-level identity; add no broad aliases.** | OQLF identifies `igname` with *Dioscorea* and warns that North American `yam` is often applied to sweet-potato varieties. Keep `ingredient-ref-yam` (`true yam / igname`) separate from `sweet potato / patate douce` and from the prepared `ube halaya` spread. Do not use an unqualified `yam` alias to resolve that regional ambiguity or map named processed yam products to the root. The separate yam-flour row remains distinct; isolated yam starch is already held as `candidate-yam-starch`. [S03; prior WP02 root-flour and yam-starch reviews] |

No new active reference, alias, form, measurement, conversion, yield, substitution, or recipe link is recommended by this review. The prior WP03 decision to leave `dasheen`, `eddoe`, and broad `cocoyam` wording out of default aliases remains appropriate given the mixed cultivar and market usage described by the agricultural sources. OQLF's taro entry does list `dasheen` and `old coco-yam` as English terms for *C. esculenta*; this is terminology evidence, but it does not settle whether a current Canadian retail item called `dasheen` refers to the whole species or to a particular corm type.

## Scope and prior-work reconciliation

The [active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), Section J, says to review additional documented regional tubers beyond arracacha, oca, ulluco, and mashua. Those four are already integrated. Earlier WP03 work also integrated jicama, lotus root, burdock, water chestnut, bamboo shoots, hearts of palm, the common root vegetables, and selected alliums/aromatics. They are excluded from this proposal to avoid repeating resolved identities.

This review checked the remaining Section J follow-ups and related product decisions in:

- [WP03 Section J onion/root follow-up](wp03-section-j-onion-root-followup-20261009.md), which already held eddoe and generic arrowhead and carried forward the Andean tuber proposal.
- [WP03 regional roots and shoots integration](../batches/plant-regional-roots-shoots.md), which explicitly left arrowhead open.
- [WP03/WP04 regional identity integration](../batches/wp03-wp04-regional-identity-integration-20261009/README.md), which added taro, malanga, and true yam as distinct identities.
- [WP06 Andean tuber integration](../batches/wp06-andean-tubers-identities-integration-20261010/README.md), which added oca, ulluco, and mashua.
- [WP06 Spanish-speaking Caribbean gap sweep](wp06-caribbean-spanish-cuisine-gap-sweep-20261011.md), which already proposes a country-qualified Dominican `yautía` alias for active `ingredient-ref-malanga`.
- [WP02 root flour and starch reviews](../batches/wp02-wp03-wp04-held-candidates-onion-count-integration-20261010/README.md), which hold malanga-corm flour, and [the taro-starch product-name review](wp02-taro-corm-starch-exact-quebec-product-name-review-20261011.md), which holds extracted taro-corm starch.

The currently active generic identities and product splits are not new candidates here. The proposal does not reopen the separately reviewed ube halaya product identity or the existing potato, sweet-potato, cassava, arracacha, oca, ulluco, and mashua rows.

## Repository and recipe scan

Read-only scan of the current shared tree:

| Surface | Snapshot |
|---|---:|
| `ingredient-references.v1.json` | 1,103 references; SHA-256 `4af607f6f11bffa1a2a458397a41eb5e717f0362e174f1f0ef1df4cfeaa27964` |
| `ingredient-forms.v1.json` | 79 forms; SHA-256 `e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419` |
| `legacy-import-identities.v1.json` | 75 candidates |
| Seed manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 recipes / 1,123 ingredient rows; path-and-file fingerprint `a4bdbf9cbc8109425656770cbe968639949adf8d089d39bbf46cd0ab5d97f552` |

The recipe fingerprint hashes each manifest-relative path, a NUL byte, the exact recipe-file SHA-256 hex digest, and a newline in manifest order.

I used the repository's `normalize_search_key` for exact-name ownership checks across active reference names/aliases, form labels/match terms, and legacy names/aliases. `arrowhead`, `broadleaf arrowhead`, `wapato`, `duck potato`, `Indian potato`, `eddoe`, `eddo`, `arvi`, `dasheen`, `cocoyam`, `yautia`, and `yautía` have no exact active-reference, form, or legacy owner. Existing owners include `ingredient-ref-taro` (`taro / taro`), `ingredient-ref-malanga` (`malanga / malanga`), and `ingredient-ref-yam` (`true yam / igname`). The exact term `arrowroot` remains owned by its existing `ingredient-ref-arrowroot` row and is not equivalent to arrowhead. No form is attached to those three root references. The research ledger already has `candidate-malanga-corm-flour`, `candidate-taro-corm-starch`, and `candidate-yam-starch`, all at `needs_clarification`; these product candidates are not recreated here.

I scanned every manifest-listed recipe JSON file, every ingredient row, and normalized whole-phrase matches for the candidate and boundary terms. None of the arrowhead, eddoe/arvi/dasheen/cocoyam, malanga/yautía, taro, or true-yam terms matched recipe text or ingredient rows. The active potato-related links found were `037#8` and `077#1` to generic potato, `078#16` to Russet potato, and `090#13` plus `105#5` to sweet potato. No recipe is linked to taro, malanga, or true yam in this corpus. This is a bundled-recipe coverage result, not evidence of broader market demand.

## Product and naming boundaries

### Arrowhead

“Arrowhead” is used for multiple aquatic *Sagittaria* species, and the relevant food products should not be collapsed by the English common name. TERMIUM's Government of Canada record identifies *Sagittaria latifolia* as `broadleaf arrowhead` and gives the French plant names `sagittaire à larges feuilles` and `sagittaire latifoliée`; it notes that `wapato` is also used for *S. cuneata*. OQLF describes `sagittaire` as a genus and notes that its species are commonly called arrowheads in English. [S04–S05]

USDA NRCS documents *S. latifolia* tubers as a food source and describes historical cooking uses. USDA APHIS separately reports Chinese food use and importation for *S. sagittifolia*, while also noting food use of *S. latifolia*. Those are separate species-level food contexts, not proof of one generic arrowhead ingredient. [S06–S07]

The Ontario GardenTap listing names *S. latifolia* “Arrowhead,” “Duck Potato,” and “Wapato,” but lists it as an aquatic garden plant sold in containers. It is not a fresh-food product label. No current Québec or Canadian food-grocery label for a species-identified *Sagittaria* tuber was located in this bounded search. Therefore, do not create an unqualified ingredient row based on botanical terminology or historical food use alone. If a later Canadian food-product source supports an identity, use its species-qualified product name and keep shared names out of aliases unless that source resolves them.

### Eddoe, taro, and malanga

OQLF's `taro` entry maps the Québec French terms `taro`, `colocase`, and `colocasie` to *Colocasia esculenta*. It lists `taro`, `dasheen`, and `old coco-yam` as English terms. OQLF's `malanga` entry instead identifies *Xanthosoma sagittifolium* and explicitly describes its food tubers. The entries support keeping the active taro and malanga roots separate. [S01–S02]

FAO describes eddoe as a rough *Colocasia* type with a relatively small central corm and larger cormels, and dasheen as a type with a larger central corm. The same source warns that these labels are not applied consistently and that intermediate forms occur. Current Kew taxonomy lists *Colocasia antiquorum* as a synonym of *C. esculenta*, though Kew notes that an alternative authority accepts *C. antiquorum*. A 2024 ethnobotanical market study found the “eddoe” market name did not reliably correspond to the observed corm/cultivar grouping and that corm size also varied with growth conditions and maturity. [S08–S10]

The current Ontario Swadesh Supermarket page sells `Eddoe (Arvi)`. Its page identifies the store as located in Stoney Creek, Ontario, and describes the item as a root vegetable resembling taro, but provides no botanical name, French product term, or classification specification. This is evidence that the English retail word is in Canadian use; it does not settle which *Colocasia* cultivar group the product represents or whether `arvi` is a synonym in all Canadian usage. [S11]

For malanga, OQLF lists several French and English terms, including `yautia`, but the current active row has no aliases. Since the WP06 Spanish-Caribbean packet already addresses a Dominican `yautía` alias candidate, that alias decision stays with that proposal's owner. Do not copy OQLF's full regional vocabulary into default aliases without checking how each term is used in Canadian food labels and against neighboring aroid identities. In particular, keep unqualified `cocoyam` out of both active rows: FAO documents its use for both *Colocasia* and *Xanthosoma* in West Africa. [S02, S08]

### True yam and separated products

OQLF identifies `igname` with genus *Dioscorea* and notes its distinction from sweet potatoes, despite the North American use of `yam` for some *Ipomoea batatas* products. The active `true yam / igname` row already captures this boundary. The separate `yam flour / farine d’igname` row represents a milled product; the held `candidate-yam-starch` is for isolated starch. They should not be aliased together. [S03; existing WP02 yam-flour and yam-starch reviews]

The active taro products also remain separate by plant part and processing: corm, leaves, whole-corm flour, and candidate isolated starch. No source in this review justifies one replacing another or supplies a recipe conversion, yield, or measurement. The same applies to fresh malanga and its held whole-corm-flour candidate. [S01–S03; prior WP02 candidate reviews]

## Evidence register

All web sources below were accessed on 2026-10-12. Claims are limited to the source scope described here.

| Source ID | Source and URL | Evidence and limits |
|---|---|---|
| **S01** | Office québécois de la langue française, [*taro* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro). | Names French `taro`, `colocase`, `colocasie`, English `taro`, `dasheen`, `old coco-yam`, and *Colocasia esculenta*. Terminology for the plant/food, not a current retail product specification. |
| **S02** | Office québécois de la langue française, [*malanga* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/42924/malanga). | Identifies *Xanthosoma sagittifolium*, edible tubers, French `malanga`, `yautia`, `chou des Caraïbes`, and English variants. Says `macabo` is used for a neighboring species in Cameroon. Terminology entry last updated 2009. |
| **S03** | Office québécois de la langue française, [*igname* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082772/igname). | Maps `igname` to English `yam` and Latin *Dioscorea*; explicitly discusses North American confusion with sweet potato. Does not define isolated yam starch or flour. |
| **S04** | Office québécois de la langue française, [*sagittaire* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869641/sagittaire). | Gives `sagittaire` for the genus *Sagittaria* and notes the common English `arrowhead` name for its species. Botanical terminology, not a food-product name. |
| **S05** | Translation Bureau, Government of Canada, [TERMIUM Plus: *Sagittaria latifolia*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=SAGITTAIRE+LATIFOLIEE). | Pairs *S. latifolia* with English `broadleaf arrowhead`, `broad-leaf arrowhead`, `duck potato`, and `wapato`, and French `sagittaire à larges feuilles` / `sagittaire latifoliée`; warns `wapato` is also used for *S. cuneata*. Plant-name record, not Canadian retail naming. |
| **S06** | USDA Natural Resources Conservation Service, [*Culturally Significant Plants*](https://www.nrcs.usda.gov/plantmaterials/kspmcpu9871.pdf), section “Broadleaf Arrowhead.” | Identifies *S. latifolia*, lists common names, and documents tubers as an important food source for Indigenous peoples with historical cooking uses. U.S. cultural/agriculture publication; not current Canadian retail evidence or preparation guidance. |
| **S07** | USDA Animal and Plant Health Inspection Service, [*Weed Risk Assessment for Sagittaria sagittifolia*](https://www.aphis.usda.gov/sites/default/files/sagittaria-sagittifolia-wra.pdf), 2020. | Documents *S. sagittifolia* as a Chinese food tuber imported to U.S. markets and notes food use of distinct *S. latifolia*. U.S. assessment; supports species separation, not Canadian product labels. |
| **S08** | FAO, [*Traditional post-harvest technology of perishable tropical staples*, Chapter 5](https://www.fao.org/4/x5045e/x5045E07.htm), “The aroid root crops.” | Describes *Colocasia* and *Xanthosoma* as important food crops; discusses rough eddoe/dasheen groups, intermediate forms, inconsistent label use, and the cross-genus use of `cocoyam`. Older global post-harvest source, not a present-day Canadian market standard. |
| **S09** | Royal Botanic Gardens, Kew, Plants of the World Online, [*Colocasia antiquorum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:86580-1). | Current Kew backbone treats the name as a synonym of *C. esculenta* while acknowledging an alternative taxonomy. Taxonomy does not resolve the retail meaning of `eddoe`. |
| **S10** | Fang, Matthews, Grimaldi et al., [“The Invisible Tropical Tuber Crop: Edible Aroids (Araceae) Sold as ‘Tajer’ in the Netherlands”](https://link.springer.com/article/10.1007/s12231-024-09624-y), *Economic Botany* 79 (2025; published online 2024). | Primary market/ethnobotanical study reports that eddoe and dasheen labels did not reliably track observed cultivar groups and that corm size varies with maturity and environmental conditions. Dutch market, not Canadian prevalence. |
| **S11** | Swadesh Supermarket, [“Eddoe (Arvi) Per lb”](https://www.swadesh.ca/products/eddoe-per-lb). | Current Ontario retail page (Stoney Creek) names the item `Eddoe (Arvi)` and describes a taro-like root vegetable. It provides no species identification or French name; evidence for the retail words only. |
| **S12** | GardenTap, [“Arrowhead” (*Sagittaria latifolia*)](https://www.gardentap.ca/products/sagittaria-latifolia-arrowhead). | Current Ontario nursery listing pairs “Arrowhead,” “Duck Potato,” and “Wapato” with *S. latifolia*, but sells container plants for water gardens, not food. Canadian common-name evidence only. |

## Limitations

- OQLF's taro and igname entries were last updated in 1995 and 1991; the malanga entry was last updated in 2009. They support Québec terminology but do not measure current store-label prevalence.
- The FAO source and USDA NRCS cultural publication document agricultural and historical food uses. They do not show that those products are currently sold as ingredients in Québec.
- The Dutch 2024 eddoe study is useful for testing label stability but does not describe Canadian retail supply.
- The Ontario Eddoe listing provides no botanical identity; the Ontario Arrowhead listing is explicitly an ornamental plant item.
- This review found no bundled demand for the unresolved terms. The 114-recipe corpus is not a market survey.
- No measurement, conversion, yield, or substitution evidence was assessed or activated.

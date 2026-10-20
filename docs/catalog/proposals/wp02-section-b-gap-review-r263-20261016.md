# WP02 Section B R263 — winged-bean flour identity review

- **Reviewed:** 2026-10-16.
- **Status:** Integrated as an identity-only reference; see the [R263 integration record](../batches/wp02-section-b-winged-bean-flour-integration-r263-20261016/README.md).
- **Plan fit:** One unreviewed seed-derived flour within the still-open Section 04, B alternative-flour/starch coverage. It is distinct from the active mature-seed identity `ingredient-ref-winged-beans`; this proposal does not close the broader Section B checklist.
- **Source IDs:** Proposal S01–S02 reuse the registered TERMIUM and Gaia source IDs shown below. Proposal S03–S08 were allocated to the shared research ledger during integration.

## Recommendation

**Add an identity-only `FLOUR_AND_STARCH` reference for flour milled from dried mature seeds of *Psophocarpus tetragonolobus*.** Proposed displays are **`winged bean flour / farine de haricot ailé`**. Treat the French display as a clear, provisional construction from a Canadian bilingual seed listing’s *winged bean / haricot ailé* name; it is not a verified Québec flour-package label. Keep both alias arrays empty. Add no forms, density, unit mappings, kitchen measures, recipe links, conversions, yields, or substitutions.

The name and product concept have unusually direct Canadian support for this bounded gap: Gaia Organic Seeds in Ottawa lists the species bilingually and says in both languages that the dried seeds are edible and used for flour. The Ecological Farmers Association of Ontario’s 2024 garden-sign PDF independently repeats the mature-seed flour use. These are seed/growing sources, not a Canadian packaged-flour listing. Primary food studies separately document winged-bean flour and flour/wheat blends. This is enough to support an identity row while leaving commercial product availability and the Québec product label explicitly provisional. [S01–S06]

Use **`haricot ailé`** as the French base term. Do not use or alias **`farine de pois carré`**: an older French article title uses that wording, but the OQLF assigns `pois carré` to field-pea/common-vetch wording (*Pisum arvense*). The OQLF entry does not discuss *Psophocarpus*, so this review treats the shared wording as a collision warning rather than deciding which plant name is universally correct. The existing whole-seed `pois carré` alias is outside this proposal and is not changed here. [S01, S07–S08]

## Proposed reference boundary

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-winged-bean-flour` |
| Category | `FLOUR_AND_STARCH` |
| English display | `winged bean flour` |
| French display | `farine de haricot ailé` — provisional descriptive construction, pending a Québec flour-label or terminology review |
| Aliases | `aliasesEn: []`; `aliasesFr: []` |
| Scope | Flour milled from dried mature seeds of *Psophocarpus tetragonolobus*, with dehulling, heat treatment, and fat-removal state unspecified |
| Forms / density / mappings | None; `defaultDensity: null`, `unitMappings: []` |
| Recipe links / substitutions | None |

Keep this identity separate from the whole mature seeds, immature pods, leaves, and tubers of the plant. Do not imply that protein concentrates/isolates, isolated starch, defatted flour, or composite flours are interchangeable forms of this generic flour. The reviewed studies prepare different raw, heat-treated, whole/dehulled, full-fat, or defatted samples; they do not establish a consistent retail form taxonomy. [S03–S06]

## Ownership, picker, and recipe audit

The current working-tree snapshot has **1,653 ingredient references**, **125 forms**, **61 legacy-import candidates**, and **2,001 research-ledger records**. The bundled manifest lists **114 recipes**. A manifest-ordered scan found **1,123 ingredient rows**, no winged-bean/flour phrase in any recipe, and no line linked to `ingredient-ref-winged-beans`.

| Surface | Finding |
|---|---|
| Active reference | `ingredient-ref-winged-beans` is `winged beans / haricots ailés`, category `LEGUME_AND_PULSE`; it has English aliases `winged bean`, `wing bean`, `four-angle bean` and French aliases `haricot ailé`, `haricot dragon`, `pois carré`. Density and unit mappings are empty. No flour identity or exact flour-term owner exists. |
| Forms | No form is attached to `ingredient-ref-winged-beans`; no flour form owns the proposed names. |
| Legacy imports and ledger | No winged-bean flour candidate or flour record was found. The R263 ID/source-ID prefix is unused. The TERMIUM and Gaia URLs already belong to `ingredient-ref-winged-beans` as `WP03-H-REGIONAL-PULSES-20261011-S20A` and `...-S20B`; cite them here as reused sources only. |
| Archive and plan | No focused WP02 winged-bean flour proposal or batch record was found. The broad Section B parent remains open; prior whole-pulse work established the seed row but did not decide flour. |
| Picker projection | `IngredientSearch.kt` uses complete phrase matching before substring fallback. With the proposed displays and no aliases, `winged bean flour` and `farine de haricot ailé` each resolve to the proposed flour. The shorter singular queries `winged bean` and `haricot ailé` would return both the flour and whole-seed rows, an understandable related-product overlap. The existing `pois carré` query remains on the whole-seed row; the flour does not amplify that OQLF collision. Do not add generic `bean flour`, `wing bean flour`, or `farine de pois carré` aliases. |
| Bundled recipes | No candidate phrase or linked winged-bean row was found in the 114-file, 1,123-row recipe corpus. No recipe link or relabeling is proposed. |

**Read-only snapshot hashes:** references `621a6cfc6cd79da890da06532c7e69d587399c3d9494708f8eae166cadb420ce`; forms `84b36ddc7d3604255f81b5d4d2f58a5fc260f732b307b57d037bbd9b832e4ff9`; ledger `73bd1fa4feb2188298e1c38251aa8a59dbe213871cd6d49cf90182743b1a9c49`; legacy candidates `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14`; plan `b811e9564b7dd88155b6232244864baa31ca972fcaf10512d5559764c5916185`. These values describe the review snapshot only; recheck ownership before integration.

## Measurements and substitution evidence

- **No active measure or density.** Narayana and Narasinga Rao report raw winged-bean flour water- and fat-absorption capacities of 2.1 g/g and 1.4 g/g; heat processing changes those functional capacities. These are laboratory absorption results, not bulk density, cup weight, or a mass/volume mapping. [S04]
- **No reusable substitution rule.** Rahayu’s bread experiment used a modified flour process and 0%, 6%, 12%, and 18% blends with strong wheat flour. Its sensory finding at 12% and colour/texture findings at 18% are specific to that preparation and bread formula. Kailasapathy and colleagues likewise studied full-fat flour in wheat-bread formulations. None gives a general replacement ratio for arbitrary recipes. [S05–S06]
- No package quantity, household measure, milling grade, yield, or recipe-specific need was found. If an identity ledger entry is later added, keep `measurementState` and `substitutionResearchState` as `not_yet_researched`; these studies do not warrant active measurement or substitution evidence.

## Source register

Sources checked 2026-10-16. At proposal stage these IDs were local. Integration reused the existing TERMIUM and Gaia ledger IDs for S01–S02 and registered S03–S08; see the integration README for the active source IDs.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP02-B2-WINGED-BEAN-FLOUR-R263-20261016-S01** | Government of Canada, TERMIUM Plus, [*Psophocarpus tetragonolobus*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?consrv_suppr=1590647&fchrcrdnm=&i=1&index=enb&lang=eng&srchtxt=CAS+SYNONYM). Reused ledger source `WP03-H-REGIONAL-PULSES-20261011-S20A`. | Supports English `winged bean` and French `haricot ailé`, `haricot dragon`, and `pois carré`; distinguishes the species and notes that asparagus-pea/bean names can refer to other species. It names the plant, not its flour. |
| **WP02-B2-WINGED-BEAN-FLOUR-R263-20261016-S02** | Gaia Organic Seeds Canada, [Winged Bean](https://gaiaorganics.ca/product/winged-bean/). Reused ledger source `WP03-H-REGIONAL-PULSES-20261011-S20B`. | Current Ottawa seed listing names *P. tetragonolobus* as `Winged Bean / Haricot Ailé` and says in English and French that dried seeds are edible/used for flour. The page sells seeds, not a flour product; its food-use statement is not a flour specification. |
| **WP02-B2-WINGED-BEAN-FLOUR-R263-20261016-S03** | Ecological Farmers Association of Ontario, [Demo Garden Signs 2024](https://efao.ca/wp-content/uploads/Demo-Garden-Signs-2024.pdf), p. 39. | Names winged bean as *P. tetragonolobus*, identifies Gaia Organic Seeds in Ottawa as seed grower, and says dried seeds are edible and used for flour. This garden reference is not a retail flour label or processing standard. |
| **WP02-B2-WINGED-BEAN-FLOUR-R263-20261016-S04** | K. Narayana and M. S. Narasinga Rao, [“Functional Properties of Raw and Heat Processed Winged Bean (*Psophocarpus tetragonolobus*) Flour”](https://doi.org/10.1111/j.1365-2621.1982.tb04976.x), *Journal of Food Science* 47(5) (1982), 1534–1538. | Primary study compares raw and heat-processed flour and reports absorption capacities. These functional measurements are not kitchen conversions; study samples do not define retail forms. |
| **WP02-B2-WINGED-BEAN-FLOUR-R263-20261016-S05** | R. D. Rahayu, [“Pemanfaatan tepung biji kecipir sebagai bahan pencampur roti tawar”](https://agris.fao.org/search/en/providers/123819/records/6473617653aa8c89630b2560), *Majalah Biam* 5(16) (1988), pp. 14–16, 21–22; English abstract indexed by FAO AGRIS. | Primary bread study’s indexed abstract describes a modified flour process and 0/6/12/18% flour blends. Findings are specific to the stated strong-wheat, straight-dough bread formula; the indexed abstract is not a Canadian package or general substitution guide. |
| **WP02-B2-WINGED-BEAN-FLOUR-R263-20261016-S06** | K. Kailasapathy, P. Perera, and J. H. MacNeil, [“Improved Nutritional Value in Wheat Bread by Fortification with Full-Fat Winged Bean Flour”](https://doi.org/10.1111/j.1365-2621.1985.tb10567.x), *Journal of Food Science* 50(6) (1985), 1693–1696. | Primary study compares full-fat flour and fortified breads over tested formula levels. Its bread results do not establish generic flour substitution or a kitchen measure. |
| **WP02-B2-WINGED-BEAN-FLOUR-R263-20261016-S07** | INIST/PASCAL, [“Baking studies with winged bean ... flour-wheat flour blends”](https://pascal-francis.inist.fr/vibad/index.php?action=getRecordDetail&idt=8472829&lang=en), *Journal of Food Science* 50(6) (1985), 1672–1675. | Bibliographic record gives the French title `farine de pois carré`. This is academic article wording, not a Québec retail term; it is not proposed for the catalog. |
| **WP02-B2-WINGED-BEAN-FLOUR-R263-20261016-S08** | Office québécois de la langue française, [*pois des champs* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8876749/pois-des-champs). | OQLF lists `pois carré` as a common name for *Pisum arvense* field pea/common vetch. The entry does not cover *Psophocarpus* or flour; it supports avoiding this potentially ambiguous phrase in the proposed French flour display. |

## Limits and next review

Targeted Canadian web searches for `winged bean flour Canada`, Canadian-domain flour listings, and *Psophocarpus tetragonolobus* flour surfaced research and Canadian seed listings, not a species-identified packaged flour. The search was bounded and does not establish market-wide absence. Gaia and EFAO establish Canadian seed-growing and stated culinary flour use, not a standardized or currently marketed Canadian flour. No OQLF flour term or product-matched Québec flour label was found. If a current Québec label appears, review whether it uses `farine de haricot ailé` or another name before treating the provisional French display as settled.

The name review also surfaced a separate, out-of-scope issue: TERMIUM supports `pois carré` for winged bean while OQLF uses it for *Pisum arvense*. The R263 integration leaves the existing whole-seed alias unchanged pending separate adjudication. Static package, generated-index, ledger, ownership, picker, recipe-corpus, encoding, link, and whitespace checks passed. No software tests or emulator checks were run because the change only adds database JSON data and documentation under `AGENTS.md`.

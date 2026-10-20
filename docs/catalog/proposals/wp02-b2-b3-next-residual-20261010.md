# WP02 B2/B3 next residual — *Colocasia esculenta* corm starch

- **Reviewed:** 2026-10-10
- **Status:** Proposal only. This review creates no catalog, ledger, recipe, test, plan, or roadmap changes.
- **Coverage:** One narrow residual adjacent to B3 and the B9 whole-root-flour/extracted-starch boundary: starch isolated from *Colocasia esculenta* corms. It does not reopen the arrowroot/water-chestnut review, the kudzu, sweet-potato, mung-bean, and lotus-root starch decisions, the Brazilian `polvilho doce` / `polvilho azedo` products, or the pulse/nut flour review.
- **Source IDs:** `WP02-B23-NEXT-RESIDUAL-20261010-S01` through `S07`. The prefix was checked against `docs/` and `app/`; these IDs are proposal-local, not ledger records.

## Recommendation

**Keep extracted taro-corm starch on hold as a new catalog identity until its fr-CA product name receives independent Québec review.** Food-science research establishes the distinct product class and *Colocasia esculenta* source. It does not establish a Québec retail name. OQLF supplies the Québec base term `taro` and explains the relationship between `amidon` and `fécule`, but the targeted OQLF search found no exact term for taro starch.

| Candidate product | Working bilingual wording for review only | Disposition and exact boundary |
|---|---|---|
| Starch extracted from *Colocasia esculenta* corms | EN `taro starch`; provisional descriptive fr-CA `fécule de taro` | **Hold.** If the name is independently accepted later, consider `ingredient-ref-taro-starch` in `FLOUR_AND_STARCH`. Neither the ID nor either display is reserved or approved by this proposal. Define the product as an isolated starch fraction from *C. esculenta* corms; exclude whole-corm flour/meal, fresh taro, starch-containing taro flour, unspecified taro powder, and products from other aroid species. No aliases. |
| `amadumbe starch` | Retain only as source wording when a source identifies this product | **Do not create a separate row or global alias.** South African agricultural material uses `amadumbe` for *C. esculenta* and also calls *Xanthosoma sagittifolium* “new amadumbe”; the primary starch literature is specifically about *C. esculenta*. Without package-level species evidence and Québec naming, do not let `amadumbe` or `cocoyam starch` broaden the proposed source boundary. |

The French descriptor is an inference for review, not an OQLF-equivalent term. OQLF lists `taro`, `colocase`, and `colocasie` for *C. esculenta*. Its current entry on `amidon` says `fécule` is more specific for starch in tubers or underground plant organs, which makes `fécule de taro` a transparent descriptive construction. It does not approve that compound as a taro-starch name. The separate product name `farine de taro` is already active for whole-corm flour and must not be reused for isolated starch. [S01–S02]

## Identity and product boundary

Primary food-science studies treat taro flour and taro starch as separate samples/products. One study evaluates flour and starch from two *C. esculenta* varieties; another names Lipu taro flour and starch separately and describes the starch as the isolated fraction with non-starch material removed. A 2024 university-journal study specifically examines extracted starch from white and purple *C. esculenta* varieties. Together these support a narrow source/product candidate, not a general equivalence among taro root, flour, powder, and starch. [S03–S05]

Do not extend this candidate to `cocoyam starch` without the botanical source: technical literature uses “cocoyam” for more than one edible aroid, including *Colocasia esculenta* and *Xanthosoma sagittifolium*. Do not merge `amadumbe starch` globally; the South African government source distinguishes *C. esculenta* amadumbe from “new amadumbe” (*Xanthosoma sagittifolium*), while the reviewed starch study uses only identified *Colocasia* material. [S06–S07]

The held candidate is not a starch-source-neutral form. Do not include native, modified, pregelatinized, instant, or precooked states unless a future source names both the taro source and the exact product state. The active whole-taro and taro-flour rows remain separate; their existing scope is not changed here.

## Québécois French naming review

- OQLF’s GDT entry prefers `taro`, `colocase`, and `colocasie` and identifies *Colocasia esculenta*. It covers the food plant, not an extracted starch product. [S01]
- OQLF’s `amidon` entry, updated in 2026, explains that `fécule` more specifically names starch from tubers or other underground organs. This supports `fécule de taro` only as a provisional, descriptive construction. The entry does not list that compound or pair it with English `taro starch`. [S02]
- Targeted searches of the OQLF Vitrine/GDT and Canadian/Québec product listings for `taro starch`, `amidon de taro`, and `fécule de taro` did not locate an exact Québec headword or standalone starch label. Search results for `farine de taro` concern flour and do not close this naming gap.
- Therefore, do not activate `amidon de taro`, `fécule de taro`, `fécule de colocase`, `fécule de colocasie`, or `colocasia starch` as displays or aliases. The first two may be revisited in bilingual review; none is accepted here.

## Measurement, form, and substitution boundaries

The cited papers report laboratory composition, extraction, and functional-property findings. Those measurements are tied to particular varieties, samples, and methods; they are not kitchen measures, package directions, or recipe mass/volume conversions. This review imports no numeric value, density, cup weight, unit mapping, yield, or conversion. It creates no `IngredientForm`, including for native or modified starch.

No reviewed source establishes a general culinary replacement ratio between taro starch and cornstarch, potato starch, tapioca starch, arrowroot, another root starch, or taro flour. Do not create global or contextual substitution rules. Measurement and substitution research remain unresolved for this candidate.

## Recipe demand and live catalog audit

The read-only scan covered every manifest-listed recipe file and each ingredient row: **114 recipes and 1,123 ingredient rows**. It searched recipe JSON strings and line content for `taro starch`, `taro corm starch`, `Colocasia esculenta starch`, `Colocasia starch`, `dasheen starch`, `cocoyam starch`, `amadumbe starch`, `amidon de taro`, `fécule de taro`, `amidon/fécule de colocase`, `taro flour`, `farine de taro`, and taro powder/pearl variants. It found **zero candidate phrase matches** in recipe text and **zero ingredient-line matches**. No recipe link, relink, measurement, or substitution is justified by current bundled demand.

Exact normalized phrase checks across active reference names/aliases, form labels/match terms, and legacy candidate names/aliases found no owner for the starch candidate phrases or the proposed ID. Related active records are:

| Surface | Current result | Boundary |
|---|---|---|
| Active references | `ingredient-ref-taro` is `taro / taro` in `VEGETABLE_AND_AROMATIC`; `ingredient-ref-taro-flour` is `taro flour / farine de taro` in `FLOUR_AND_STARCH`. Neither has aliases or a starch display. | Keep fresh corm, whole-corm flour, and extracted starch distinct. Bare `taro` is not an alias for the flour or a future starch record. |
| Forms | No current form is linked to either taro reference; no form label or match term names taro starch. | Add no form. |
| Legacy candidates | No exact candidate name or alias matches the starch phrases. | No legacy identity should be promoted from this review. |
| Research ledger | No `ingredient-ref-taro-starch` decision exists. The sole phrase hit for “taro starch” is the accepted taro-flour decision’s explicit exclusion of extracted starch; the active taro and taro-flour records mark measurement and substitution research `not_yet_researched`. | The earlier flour decision names this boundary but does not review a starch identity or bilingual starch name; this proposal addresses only that gap. |

## Reconciliation with earlier WP02 work

- `wp02-regional-root-flour-boundaries-20261010.md` accepts *C. esculenta* taro flour and explicitly excludes extracted taro starch. This packet follows that single excluded product boundary; it does not revise the flour decision.
- `wp02-regional-starches-open-gap-review-20261010.md` covers kudzu/kuzu, sweet-potato, mung-bean, lotus-root, and native/pregelatinized distinctions. Those decisions remain unchanged.
- `wp02-b2-b3-regional-starches-residual-gap-review-20261010.md` covers arrowroot and water-chestnut products. This packet does not reopen either.
- `wp02-west-african-cassava-flour-products-review-20261010.md` keeps generic fufu/flour blends, amala/elubo, and other source-ambiguous granules held. This packet does not reassess them.
- The active B3 and B9 checklist items remain open. A terminology hold for this one taro-starch candidate does not complete either plan item.

## Pre-proposal snapshot

Read-only point-in-time snapshot from the shared workspace on 2026-10-10, before this proposal was created. The recipe fingerprint hashes manifest-ordered paths and exact file bytes, with NUL separators. These values describe the inspected worktree, including concurrent work.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references, `ingredient-references.v1.json` | 795 | `ba56d62f2f1e8a0b7cef04714eaca075fbacde76bfeb7020927aa6fe9b08f6fb` |
| Ingredient forms, `ingredient-forms.v1.json` | 36 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Legacy import candidates, `legacy-import-identities.v1.json` | 81 | `2749996a0cb7e19a5646a42ac4045e40f50ea792395a42e970c500bfe3dd1503` |
| Research ledger, `research-ledger.v1.json` | 1,021 records; 2,183 source entries; 1,765 distinct source IDs | `936cd1e2ce2867ae360f7ec6842248b214118193493819a08686f920e9d64f8e` |
| Seed manifest, `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 recipes / 1,123 ingredient rows | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |
| Active global catalog plan | — | `eb8714ab316f0d97e3e834bc72036654a952d8c3abca3575e143813b0e333854` |

## Source register

All web sources were accessed on 2026-10-10. Sources support identity or terminology boundaries only; their lab results are not catalog numbers.

| ID | Source and evidence limit |
|---|---|
| **S01** | Office québécois de la langue française, [taro (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro), updated 1995. Lists French `taro`, `colocase`, and `colocasie`, English `dasheen`, `taro`, and `old coco-yam`, and Latin *Colocasia esculenta*. It names the plant/food, not flour or isolated starch. |
| **S02** | OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Defines starch and explains that `fécule` more specifically names starch from tubers or other underground organs. It supports the lexical reasoning behind the provisional phrase `fécule de taro`, not an exact taro-starch term. |
| **S03** | Boahemaa et al., [“Physico-chemical and functional characterization of flour and starch of taro (*Colocasia esculenta*) for food applications”](https://doi.org/10.1016/j.foohum.2024.100245), *Food and Humanity* 2 (2024), 100245. Primary study evaluating flour and starch as separate samples from two taro varieties; its variety-specific lab properties are not recipe conversions. |
| **S04** | Tu et al., [“Physicochemical and digestive properties of Lipu taro (*Colocasia esculenta*) flour and starch”](https://academic.oup.com/ijfst/article/58/3/1444/7808052), *International Journal of Food Science & Technology* 58 (2023), 1444–1454. Primary study names the flour and starch separately and describes removal of non-starch substances to obtain starch; measured composition is sample/method-specific. |
| **S05** | Trujillo-Ccanahuire et al., [“Starch from *Colocasia esculenta* … of purple and white varieties”](https://revistas.unal.edu.co/index.php/refame/article/view/111574), *Revista Facultad Nacional de Agronomía Medellín* 77(3) (2024), 10887–10897. Primary study explicitly concerns starch extraction from two *C. esculenta* varieties. Its thermal and functional measurements are laboratory results, not cooking directions or household measures. |
| **S06** | South Africa Department of Agriculture, [Amadumbe brochure](https://www.nda.gov.za/phocadownloadpap/Brochures_and_Production_Guidelines/Brochure%20Amadumbe%202010.pdf) (2010). Identifies amadumbe as *Colocasia esculenta* and distinguishes it from “new amadumbe,” *Xanthosoma sagittifolium*. Regional plant-name evidence, not a Québec food-label term. |
| **S07** | Naidoo et al., [“In vitro digestibility and some physicochemical properties of starch from wild and cultivated amadumbe corms”](https://doi.org/10.1016/j.carbpol.2015.02.066), *Carbohydrate Polymers* 125 (2015), 9–15. Primary study examines isolated starch from wild and cultivated amadumbe identified as *C. esculenta*. It does not make `amadumbe starch` a Québec market name or universal alias. |
| **S08** | OAPI, [BOPI 13MQ/2025](https://oapi.int/wp-content/uploads/2025/07/BOPI_13MQ2025.pdf), p. 118. A goods-class description includes `amidon de taro à usage alimentaire`, confirming a French technical/commercial classification phrase. This is not Québec terminology or a Québec retail/product label, so it cannot satisfy the local-name requirement by itself. |

## Coordinator terminology recheck — 2026-10-10

A fresh targeted search of current OQLF terminology, Québec/Canadian retail results, and official French-language product classifications found no exact Québec product label for starch isolated from taro corms. OQLF's taro entry names the plant/food, while its `amidon` entry explains `fécule` as a context-specific term for underground-organ starch; neither entry names taro starch as a product. OAPI's `amidon de taro à usage alimentaire` is useful French-language evidence but is region-specific to the Bangui Agreement classification. It does not convert the provisional `fécule de taro` construction into an approved fr-CA name. [S01–S02, S08]

The current bundled recipes contain no direct taro-starch product phrase. The active catalog has separate `taro / taro`, `taro flour / farine de taro`, and `taro leaves / feuilles de taro` identities, with no starch reference, form, or matching legacy candidate. Keep extracted starch held; add no alias to taro flour and activate no density, measure, conversion, or substitution. Reopen only if an exact Québec product source resolves the display name.

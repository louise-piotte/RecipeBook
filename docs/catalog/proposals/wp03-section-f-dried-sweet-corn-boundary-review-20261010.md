# WP03 Section F dried sweet corn boundary review

- **Reviewed:** 2026-10-10
- **Status:** reviewed; the coordinator updated the checklist and roadmap. No seed, recipe, ledger, code, or test file changed.
- **Scope:** the open Section F dried-sweet-corn item only. Pearled hominy and pozole corn are explicitly out of scope.

## Recommendation

Accept a bounded product concept for research purposes: edible dried kernels from sweet corn, with air-drying and freeze-drying both documented. Do not integrate a catalog row yet. No bundled recipe asks for this ingredient, and the reviewed Québec authorities establish *maïs sucré* / *maïs doux* but do not attest an exact name for its dried-kernel product.

If later integrated after Québec terminology review, consider a separate identity rather than an alias or form of generic `corn kernels / maïs`. Candidate displays are `dried sweet corn kernels` / `grains de maïs sucré séchés`; both are scoped to kernels and the French compound remains provisional. No aliases are proposed for activation now.

## Checklist and prior-review mapping

The active plan's open row at [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt), lines 1437–1445, groups dried sweet corn with grits, polenta, hominy candidates, and remaining puffed grains. This packet addresses only the dried-sweet-corn entry. The current Section F status in [`roadmap.md`](../../../roadmap.md) still lists broader Section F coverage as open.

The earlier [residual gap audit](wp03-section-f-residual-gap-audit-20261010.md) deferred dried sweet corn because it had no established product boundary or Québec label and no recipe demand. This review updates only the product-boundary finding: sources now support a dried sweet-corn-kernel product distinct from mature field corn, but they do not resolve exact Québec naming or justify integration. The [pozole/pearled-hominy review](wp03-section-f-pozole-corn-boundary-review-20261010.md) and [`hominy-boundary-review.md`](../batches/hominy-boundary-review.md) remain unchanged; this evidence does not reopen their holds.

## Live catalog, ledger, and recipe audit

The current split seed contains 862 ingredient references and 47 forms; the research ledger contains 1,107 records; the bundled corpus contains 114 recipe files. No corn- or hominy-named ingredient form was present. The following exact current IDs were checked in the seed and ledger:

| Current ID | Current state | Boundary disposition |
| --- | --- | --- |
| `ingredient-ref-corn-kernels` | Active: `corn kernels / maïs`; category `VEGETABLE_AND_AROMATIC`; aliases empty; density null; unit mappings empty | Keep as the broad kernel identity. Do not use `dried sweet corn` as an alias: it specifies sweet-corn type and a dehydrated product state. |
| `ingredient-ref-corn-on-the-cob` | Active: `corn on the cob / maïs en épis`; aliases empty | Keep separate by physical presentation. |
| `ingredient-ref-corn-flakes` | Active: `corn flakes / flocons de maïs` | Keep separate as a processed cereal product. |
| `ingredient-ref-popcorn` | Active: `popcorn / maïs soufflé` | Keep separate as the expanded product of popping corn; do not merge dried sweet corn into it. |
| `ingredient-ref-hominy-corn` | Active: `hominy corn / maïs lessivé`; identity verified; aliases empty; density null; unit mappings empty | Keep separate. OQLF defines it as a processed product from mature dry kernels held in preservative liquid and notes alkaline treatment. This is not plain dried sweet corn. |
| `ingredient-ref-hominy-grits` | Active: `hominy grits / gruau de maïs`; aliases empty | Keep separate as a ground product; this review does not change the existing distinction from whole kernels. |
| `ingredient-ref-cornmeal` | Active: `cornmeal / semoule de maïs`; English alias `corn meal` | Keep separate as a milled product. |
| `ingredient-ref-masa-harina` | Active: `masa harina / farine de maïs nixtamalisée` | Keep separate as a nixtamalized flour. |
| `ingredient-ref-precooked-corn-flour` | Active: `precooked corn flour / farine de maïs précuite` | Keep separate as flour. |
| `ingredient-ref-roasted-corn-flour` | Active: `roasted corn flour / farine de maïs torréfiée` | Keep separate as flour. |
| `ingredient-ref-whole-kernel-corn-flour` | Active: `whole-kernel corn flour / farine de maïs` | Keep separate as flour; the shared word *kernel* does not make it a whole-kernel ingredient. |
| `ingredient-ref-corn-syrup`, `ingredient-ref-dark-corn-syrup`, `ingredient-ref-cornstarch` | Active syrup and starch products | Outside this identity; no merge or alias. |
| `ingredient-ref-corn` | Ledger-only legacy candidate, `identityState: unreviewed`, no sources | Leave untouched; it is an older broad candidate, not an active dried-corn reference. |
| `ingredient-ref-pearled-hominy`, `ingredient-ref-pozole-corn` | Ledger candidates, both `needs_clarification` | Leave their existing holds untouched. This review supplies no new evidence about either product boundary or its French name. |

No exact normalized display or alias collision was found for `dried sweet corn`, `dried sweet corn kernels`, `dehydrated sweet corn`, `freeze-dried sweet corn`, `maïs sucré séché`, `maïs doux séché`, or `grains de maïs sucré séchés`. Candidate ID `ingredient-ref-dried-sweet-corn-kernels` is absent from both the active seed and ledger. This exact-key check is not a picker/UI search test. Keep bare `maïs` and `corn kernels` out of the candidate alias set because they already resolve to the broad active kernel reference.

### Recipe demand

A recursive scan of ingredient text and other recipe text across all 114 current recipe JSON files found zero matches for dried, dehydrated, or freeze-dried sweet corn and the French equivalents searched. Nearby kernel demand is limited to recipe 078, `1/2 cup frozen corn kernels`, linked to `ingredient-ref-corn-kernels`; it does not request a dry product. Recipe 044 requests `2 ears corn on the cob`. Other corn ingredient lines are corn syrup or dark corn syrup in recipes 040, 057, and 109. None supports a dried-kernel link, amount, state form, or substitution.

## Product boundary and merge decisions

| Decision | Recommendation | Evidence boundary |
| --- | --- | --- |
| Accept as a research-level product concept | Dried kernels of sweet corn intended for food use; air-dried and freeze-dried products are documented. A U.S. CBP ruling specifically describes freeze-dried sweet corn kernels as whole. | This supports a bounded identity concept, not recipe demand, Quebec-market prevalence, or a general dry-corn identity. |
| Hold catalog integration | No row, form, alias, measurement, or recipe link now. Await explicit Québec French review and a future recipe or catalog need. | The exact French compound is a transparent proposal, not a quoted OQLF/TERMIUM food term for the dried product. |
| Reject merge into `ingredient-ref-corn-kernels` | Do not make `dried sweet corn` or `dried sweet corn kernels` aliases of broad `corn kernels / maïs`, and do not silently add a dry form there. | The candidate specifies sweet-corn type and a dried-kernel product; the active row is broad, currently used for frozen kernels, and has no form model. There is no source-backed conversion relationship. |
| Reject merge into adjacent corn products | Keep it separate from corn on the cob, popcorn, corn flakes, cornmeal, hominy grits, hominy corn, masa harina, corn flours, and pozole corn. | Those rows describe a different physical product, processing class, or preparation boundary. In particular, the already integrated hominy row is alkali-treated and held in liquid; the pozole and pearled-hominy holds remain out of scope. |

If a later integration is approved, the existing corn-kernel category `VEGETABLE_AND_AROMATIC` is the most consistent initial category: Québec terminology treats sweet corn as a food vegetable, and the existing broad kernel row already uses it. The source evidence does not support creating an extra sweet-corn cultivar matrix, color variants, or separate air-dried/freeze-dried forms.

### Proposed bilingual displays and alias disposition

| Field | Proposal | Disposition |
| --- | --- | --- |
| English display | `dried sweet corn kernels` | Candidate display only; the whole-kernel scope follows product evidence. |
| fr-CA display | `grains de maïs sucré séchés` | Candidate wording only; it composes OQLF's preferred `maïs sucré` with the documented kernel presentation, but the exact phrase is not attested by a Québec food-term source. |
| English aliases | None activated. `dehydrated sweet corn` and `freeze-dried sweet corn` are source-used process descriptions, but the first is broader than the freeze-dried product and the second is process-specific. | Keep out pending a product/use review. |
| French aliases | None activated. `maïs doux` is an approved base-term variant in TERMIUM, but an exact dried-product phrase such as `maïs doux séché` was not verified as Québec terminology. | Keep out pending Québec review. |
| Rejected broad aliases | `corn`, `corn kernels`, `maïs`, `maïs en grains`, `dried corn`, `maïs séché`, `maïs en grains séchés` | These omit the sweet-corn qualifier or may encompass mature field corn; `maïs` and `corn kernels` already have an active broad reference. |

## Measurement and substitution disposition

Leave every measurement and substitution value unknown / not researched. If an eventual reference is created, start with `defaultDensity: null` and `unitMappings: []`; add no form density, cup weight, dry-to-rehydrated ratio, yield, or conversion. The 1979 research abstract compares product restoration and drying methods but does not provide a generally reusable kitchen ratio in the accessible abstract. The one frozen-corn recipe quantity is not evidence for dry corn.

Do not propose substitutions between dried sweet corn and frozen/fresh kernels, hominy, popcorn, or other corn products. The sources describe distinct products and preparation states but provide no safe general recipe-line substitution ratio. Leave substitution research `not_yet_researched`.

## Focused fixtures if this research is integrated later

- A positive exact-query fixture for `dried sweet corn kernels` should select only a future dried-sweet-corn row; after Québec review, test the accepted French label independently.
- Negative boundary fixtures should confirm `corn kernels` and `frozen corn kernels` still resolve to `ingredient-ref-corn-kernels`; `corn on the cob`, `popcorn`, `corn flakes`, `hominy corn`, `hominy grits`, `cornmeal`, and `masa harina` remain separate identities.
- Do not make `dried corn`, `maïs séché`, or `maïs en grains séchés` a global alias. Test that an unqualified dried-corn phrase does not falsely select sweet corn unless the recipe or package states that qualifier.
- Keep a fixture asserting no implied density, conversion, yield, rehydration ratio, or substitution is added when an identity-only row is eventually created.
- Do not link recipe 078's frozen kernels or recipe 044's cobs to any future dried-kernel row.

## Sources

All online sources below were accessed on 2026-10-10. Sources directly establish the sweet-corn class and dried product evidence; the exact fr-CA dried-product compound remains unverified.

| Source ID | Source | Supports / does not support |
| --- | --- | --- |
| `WP03-DSC-20261010-S01` | CFIA, [Biology of Zea mays L. (maize), French edition](https://inspection.canada.ca/fr/protection-vegetaux/varietes-vegetales/caracteres-nouveaux/demandeurs/directive-94-08/documents-biologie/zea-mays-lmais), §2 table “Caractéristiques des types de maïs” | Names *maïs sucré* as a corn type and explains its higher sugar-to-starch composition and relevant genetic mutations. Supports the type boundary; it is not a food-product naming standard for dried kernels. |
| `WP03-DSC-20261010-S02` | OQLF, [maïs sucré](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082787/mais-sucre), preferred term, English equivalent, and note | Direct Québec authority for `maïs sucré / sweet corn`; notes fresh ears and canned kernels. It does not state a dried-kernel term; the entry was last updated in 1991. |
| `WP03-DSC-20261010-S03` | OQLF, [maïs en grains](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18057878/mais-en-grains), note and English equivalent | Supports `maïs en grains / kernel corn` and says sweet corn is also sold in kernels. It does not supply the dried product name or establish `maïs en grains` as an alias for a dried-sweet-corn identity. |
| `WP03-DSC-20261010-S04` | Government of Canada Translation Bureau, [TERMIUM Plus sweet corn record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=esw&lang=eng&srchtxt=MAIZ+DULCE), 2016-01-21 record | Lists standardized `maïs sucré` and `maïs doux` for `sweet corn`. Supports the base term family only, not the full dried-product compounds. |
| `WP03-DSC-20261010-S05` | U.S. Customs and Border Protection, [NY N052803, freeze-dried fruits and vegetables](https://www.customsmobile.com/rulings/docview?doc_id=N052803&highlight=N052803), 2009-03-10 | The ruling describes freeze-dried sweet-corn kernels as whole and classifies them as a dried vegetable. The issuing authority is CBP; the accessible full text was retrieved from a mirror. The official [CROSS record](https://rulings.cbp.gov/ruling/N052803) reports that the ruling document is unavailable, so the official site did not supply a readable full-text copy in this review. |
| `WP03-DSC-20261010-S06` | F. A. Tischer et al., [“Dehydrated Sweet Corn Quality,” Canadian Institute of Food Science and Technology Journal 12(1), 1979, pp. 1–6](https://doi.org/10.1016/S0315-5463(79)73028-8) | Primary study abstract reports acceptable air-dried and freeze-dried sweet-corn products, and compares their quality/restoration. Full text was not accessible in the reviewed session; no detailed method, ratios, or measurements are inferred. |
| `WP03-DSC-20261010-S07` | Commercial dehydrator, [Dehydrated Corn](https://www.commercialdehydrators.ca/dehydrating-recipes/dehydrated-corn), product/recipe description | A Canadian commercial equipment seller describes drying sweet-corn kernels. Retail/recipe-level corroboration only; not used to set a canonical term, identity, conversion, or quantity. |

## Source-access limits and outcome

- OQLF and TERMIUM accessible records establish the Québec/Canadian base name *maïs sucré* / *maïs doux*, but neither reviewed record names dried sweet corn.
- The CBP ruling text is available through a mirror; the official CROSS page was reachable but says its ruling document is unavailable. The mirror reproduces a government-issued ruling, not an independent technical study.
- Only the abstract of the 1979 primary study was accessible. It establishes that both air-dried and freeze-dried sweet corn have been produced but does not yield usable conversion figures.
- The Canadian commercial source confirms one dehydration method in culinary-facing wording, but it cannot establish broad recipe demand or preferred Québec naming.

**Outcome:** retain the aggregate Section F checklist as open. Record the dried-sweet-corn concept as bounded at the research level; keep catalog integration, exact fr-CA naming, aliases, forms, measurements, substitutions, and recipe links on hold.

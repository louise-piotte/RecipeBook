# WP03 Section F R91 — plain puffed einkorn product and Québec naming hold (2026-10-14)

## Review record

- **Reviewed:** 2026-10-14.
- **Integration status:** Documentation-only hold integrated 2026-10-14; no shared catalog or ledger data changed.
- **Candidate:** plain, ready-to-eat puffed einkorn, *Triticum monococcum* subsp. *monococcum*.
- **Plan location:** The open Section F checkbox is “Grits, polenta, pearled hominy, pozole corn, dried sweet corn, and remaining puffed-grain candidates” ([live plan, line 2737](../../RecipeBook-global-ingredient-catalog-plan.txt#L2737); [Section F packet, checklist row 267](../batches/plant-grains-cereals.md#L267)).
- **Recommendation: hold bilingual catalog integration pending a Québec-facing French product name.** Manufacturer and seller evidence confirms plain puffed einkorn exists, and terminology authorities identify einkorn as a grain distinct from spelt. The reviewed evidence does not establish a current Canadian/Québec label for this puffed product or an authoritative Québec compound name. Do not infer `épeautre soufflé`: that exact Québec-facing phrase is already owned by puffed spelt. Keep candidate product evidence in this proposal only.
- **Work boundary:** No catalog, form, research-ledger, recipe, conversion, yield, substitution, generated-index, or code file changed. Root integrated the review in the plan and roadmap and added a batch README. No app tests or Gradle/emulator work was run because the integration was documentation-only.

## Why this is a distinct open candidate

The Section F checklist leaves “remaining puffed-grain candidates” open after naming several integrated puffed products. The existing Section F archive includes focused decisions for puffed spelt, puffed teff, puffed sorghum, puffed barley, and other puffed grains. I checked the active plan, packet, prior Section F proposals, and current source files for `puffed einkorn`, `puffed einkorn wheat`, `einkorn puffs`, `popped einkorn`, `engrain soufflé`, and `petit épeautre soufflé`; no earlier focused decision for puffed einkorn was found. This is separate from R90’s `tef` spelling alias, R89’s barley-bran terminology review, and the puffed-spelt identity review.

A plain puffed einkorn product is species-qualified and processed. The sources below establish that product class, but they do not supply the local French naming evidence that supported the existing `puffed spelt / épeautre soufflé` display or the `puffed sorghum / sorgho soufflé` display. It should not be folded into the generic puffed-wheat row while that terminology gap remains open.

## Product and terminology evidence

Soligrano, a Polish manufacturer, lists **BIO Puffed einkorn** as a ready-to-eat product with the ingredient `Organic puffed einkorn` [R91-S01]. The page presents one plain product, not a puffed-grain mixture. Country Life Natural Foods, a US seller listing the Country Gourmet Foods product, distinguishes plain Puffed Einkorn (ingredient: Puffed Einkorn) from maple and honey versions with added syrup or honey and coconut oil [R91-S02]. These pages support a plain single-grain product identity; neither is a Canadian/Québec market label.

A peer-reviewed 2016 food-science study examines gun-puffed einkorn identified as *Triticum monococcum* subsp. *monococcum* separately from bread wheat. It supports the processing and species boundary, but studies technological and compositional properties rather than Québec naming, home-cooking use, or household measures [R91-S04]. Jovial’s manufacturer page also names an einkorn cereal-puff product, but its ingredient list adds sugar, honey, and sunflower oil. Keep that composite SKU out of the proposed plain-grain scope [R91-S03].

TERMIUM Plus’s existing [EINKORN entry](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=EINKORN) pairs *Triticum monococcum* with French `petit épeautre` and `engrain` [WP03-EINKORN-BERRIES-20261012-S04]. The CFIA’s [cereal-crop inspection procedure](https://inspection.canada.ca/en/plant-health/seeds/seed-inspection-procedures/cereal-crops), already recorded on the einkorn-berry row, distinguishes einkorn, emmer, and spelt in a seed-inspection context; it is not a consumer-food naming rule [WP03-EINKORN-BERRIES-20261012-S05]. La Milanaise’s Québec [flour product listing](https://lamilanaise.com/produits/farine-de-petit-epeautre-entiere-biologique/) uses `farine de petit épeautre` for einkorn flour, which corroborates local use of the base species name but does not name a puffed product [WP02A4-EI-S01]. No reviewed Québec or Canadian source labels plain puffed einkorn in French.

The OQLF’s [food-term entry for `épeautre`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354126/epeautre) pairs that French word with English `spelt`; its [botanical entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre) identifies *Triticum aestivum* subsp. *spelta* [WP03-PUFSPELT-20261011-S01–S02]. Metro’s [indexed Québec French ingredient listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/muesli-au-chocolat-noir/p/814930010646) for a mixed muesli displays `ÉPEAUTRE SOUFFLÉ (BLÉ)` [WP03-PUFSPELT-20261011-S08]. Its source record notes that the listing was out of stock and the page returned 403 during review, so it supports ingredient wording only, not availability or an OQLF ruling. That phrase belongs to the active puffed-spelt reference and must not be reused for einkorn. `petit épeautre soufflé`, `grains de petit épeautre soufflés`, and `engrain soufflé` are understandable constructions, but no reviewed Canadian product label or Québec terminology authority attests them for this product. Do not manufacture a French display from the base term alone. Keep `farro` out as well: TERMIUM’s [farro entry](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=EINKORN) records it as spanning einkorn, emmer, and spelt, rather than as an einkorn-specific product name [WP03-S71].

Targeted searches on 2026-10-14 for `"puffed einkorn" Canada`, `"einkorn puffs" Canada`, `"puffed einkorn wheat"`, and `"petit épeautre soufflé" Québec Canada` surfaced US and European products but no Québec/Canadian puffed-einkorn label. This search is not exhaustive and does not prove no local product exists; it records the limit of the evidence reviewed for this proposal.

## Live catalog, legacy, and picker ownership

The read-only live snapshot contains **1,421 ingredient references, 104 forms, 63 legacy-import candidates, and 1,760 research-ledger records**. The manifest lists **114 recipe files and 1,123 ingredient rows**. The ledger also has 8 unit conversions; the active global and contextual substitution-rule files contain 0 rules each, and the one package-yield record is unrelated to einkorn.

Exact searches of active reference displays/aliases, form labels/match terms, legacy candidates, and ledger record IDs/decisions found no owner or prior candidate for `puffed einkorn`, `einkorn puffs`, `puffed einkorn wheat`, `engrain soufflé`, `petit épeautre soufflé`, or `grains de petit épeautre soufflés`. No `ingredient-ref-puffed-einkorn`, `ingredient-form-…einkorn…`, or `candidate-puffed-einkorn` record exists. The only relevant active identities and ledger states are:

| Active owner | Current fields and adjacent scope | Current ledger state |
| --- | --- | --- |
| [`ingredient-ref-einkorn-berries`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L5612) | `einkorn berries / grains de petit épeautre`, `GRAIN_AND_CEREAL`; empty aliases, `defaultDensity: null`, `unitMappings: []`; no attached form. | `verified`; `researched_no_supported_value`; substitution `not_yet_researched`. |
| [`ingredient-ref-einkorn-flour`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L5623) | `einkorn flour / farine de petit épeautre`, `FLOUR_AND_STARCH`; empty aliases, `defaultDensity: null`, `unitMappings: []`; no attached form. | `verified`; measurement and substitution `not_yet_researched`. |
| [`ingredient-ref-puffed-spelt`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L13018) | `puffed spelt / épeautre soufflé`; English alias `spelt puffs`; no French aliases, density, mappings, or attached form. | `verified`; `researched_no_supported_value`; substitution `not_yet_researched`. |
| `ingredient-ref-puffed-wheat` | `puffed wheat / blé soufflé`; no aliases, no density or mappings. | Separate general puffed-wheat identity with a brand-specific historical portion observation; that value is not transferable to einkorn. |

The picker’s complete normalized word-phrase match precedes substring fallback ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L23)). A read-only projection reproducing this logic gives:

| Query | Current result |
| --- | --- |
| `puffed einkorn`, `puffed einkorn cereal`, `einkorn puffs` | No result. |
| `einkorn` | `ingredient-ref-einkorn-berries` and `ingredient-ref-einkorn-flour`. |
| `einkorn berries`; `einkorn flour` | The corresponding single identity only. |
| `petit épeautre` | Einkorn berries and einkorn flour. |
| `grains de petit épeautre` | Einkorn berries only. |
| `petit épeautre soufflé`; `engrain soufflé` | No result. |
| `épeautre soufflé`; `puffed spelt`; `spelt puffs` | `ingredient-ref-puffed-spelt` only. |
| `puffed wheat` | `ingredient-ref-puffed-wheat` only. |
| Broad `puffed` | 13 current puffed-product/form owners. |

Adding a separate puffed-einkorn identity later would make broad `einkorn` searches return a third product identity and broad `puffed` searches return a fourteenth result. The specific English phrase is currently unowned. Any future bilingual row should remain separate from puffed spelt and generic puffed wheat; do not transfer `épeautre soufflé`, `spelt puffs`, `farro`, or a generic grain alias to it. A later identity row would match the packet’s neighboring puffed-product pattern better than adding a form to einkorn berries, but this proposal does not recommend either change.

## Recipe demand

I scanned the full JSON text and ingredient rows of all **114 manifest-listed recipes / 1,123 rows** for `puffed einkorn`, `puffed einkorn wheat`, `puffed einkorn cereal`, `einkorn puff`, `einkorn puffs`, `puffed small spelt`, `petit épeautre soufflé`, `grains de petit épeautre soufflés`, `engrain soufflé`, and the related `épeautre soufflé` / puffed-spelt terms. The scan found **0 matching recipe files, 0 matching ingredient rows, and 0 direct recipe links** to the einkorn-berry, einkorn-flour, or puffed-spelt references. There is no recipe-driven French term or measure to resolve for this candidate.

## Measurement and substitution boundary

Soligrano reports a 100 g package with five servings and lists nutrition per 20 g. That is a **product-specific mass-only serving**, with no volume stated [R91-S01]. Country Life gives 10 oz package selections for its US products, not a household measure [R91-S02]. Jovial reports 1 cup (40 g) for its sweetened, oil-containing puffed-einkorn cereal [R91-S03]; this volume and mass apply only to that composite SKU and cannot establish a measure or density for plain puffed einkorn. The study’s puffing results are laboratory/technology evidence, not a kitchen conversion [R91-S04]. None supports a reusable density, volume-to-mass mapping, dry-to-puffed yield, recipe measure, or cooking conversion. Do not transfer data from einkorn berries, spelt puffs, or generic puffed wheat.

Soligrano calls its product a substitute for croutons or other puffs in dishes, but gives no amount, preparation method, or tested dish-specific ratio [R91-S01]. This is qualitative product-use guidance, not an app substitution rule. No global form conversion or contextual ingredient substitution is proposed.

## Exact proposed JSON and ledger delta

**Hold; no live data delta.** Keep the current references and forms exactly as they are. Do not add an active reference, alias, form, default density, unit mapping, measurement observation, conversion, package yield, recipe link, global substitution, or contextual substitution. Do not create a ledger candidate while the Québec-facing French product identity remains unresolved. The R91 source IDs below are proposal-local evidence labels only; they are not appended to the shared ledger. Reuse the cited existing source IDs above rather than duplicating those sources.

Reopen this candidate if a current Canadian/Québec producer, retailer, or authoritative terminology source pairs a plain puffed *Triticum monococcum* product with a French consumer-facing name. Then re-run exact ownership and picker checks before choosing a display or alias.

## Source register

The following R91 IDs are local to this proposal and are not live-ledger source records:

| Proposal source ID | Source and scope |
| --- | --- |
| `WP03-PUFFED-EINKORN-R91-20261014-S01` | Soligrano, [BIO Puffed einkorn](https://soligrano.pl/en/product/puffed-bio-einkorn/), accessed 2026-10-14. Manufacturer product page; plain organic puffed einkorn, ready-to-eat uses, 100 g pack, five servings / 20 g portion. Not Canadian or Québec terminology evidence; portion is mass-only and SKU-specific. |
| `WP03-PUFFED-EINKORN-R91-20261014-S02` | Country Life Natural Foods / Country Gourmet Foods, [Puffed Einkorn Cereals](https://countrylifefoods.com/products/puffed-kamut-organic-copy), accessed 2026-10-14. US seller’s page separates the single-ingredient plain SKU from maple and honey variants and lists origin USA-OH. Not evidence of Canadian availability or Québec naming. |
| `WP03-PUFFED-EINKORN-R91-20261014-S03` | Jovial Foods, [Organic Einkorn Cereal Puffs](https://jovialfoods.com/products/org-wg-einkorn-puffed-cereal-with-honey-198g-x-9), accessed 2026-10-14. Manufacturer page for a sweetened composite product; it lists puffed einkorn, sugar, honey, and sunflower oil and reports a SKU-specific 1 cup (40 g) portion. Not a plain-grain measure. |
| `WP03-PUFFED-EINKORN-R91-20261014-S04` | Hidalgo, Scuppa, and Brandolini, [Technological quality and chemical composition of puffed grains from einkorn and bread wheat](https://doi.org/10.1016/j.lwt.2015.12.068), *LWT—Food Science and Technology* 68 (2016), 541–548. Primary study identifies puffed einkorn as *Triticum monococcum* subsp. *monococcum* and compares it with bread wheat; it does not establish Québec naming, household measures, or substitutions. |

Existing source IDs reused for the boundary review: `WP03-EINKORN-BERRIES-20261012-S04` (TERMIUM, *Triticum monococcum* naming), `WP03-EINKORN-BERRIES-20261012-S05` (CFIA seed-inspection distinction), `WP03-S71` (TERMIUM, unqualified farro scope), `WP02A4-EI-S01` (La Milanaise Québec einkorn-flour wording), `WP03-PUFSPELT-20261011-S01–S02` (OQLF spelt terminology), and `WP03-PUFSPELT-20261011-S08` (Metro Québec ingredient wording). They remain attached to their existing ledger records; no duplicate entries are proposed.

## Static review performed

- Read current `AGENTS.md`, `Requirements.md`, the Section F checklist in the active plan and grain packet, latest roadmap entries, and the R88/R89/R90 and relevant puffed-grain proposal archive.
- Parsed the live ingredient-reference, form, legacy-import, research-ledger, substitution-rule, package-yield, and manifest JSON with Python; checked relevant IDs, fields, source ownership, forms, and measurement/conversion/rule counts.
- Searched the plan and proposal archive for prior puffed-einkorn decisions and exact candidate phrases.
- Reproduced the picker’s phrase-first, normalized matching over live references and forms; scanned every manifest-listed recipe file and ingredient row for the candidate and adjacent product terms.
- Checked the cited terminology and product sources online on 2026-10-14. No local Canadian/Québec puffed-einkorn French label was found in the targeted search; that search was not exhaustive.
- No app tests, Gradle tasks, instrumentation, emulator, or deployment were run. This is a proposal-only review; no database JSON was changed, and the updated data-only `AGENTS.md` rule requires no tests for JSON-only additions.

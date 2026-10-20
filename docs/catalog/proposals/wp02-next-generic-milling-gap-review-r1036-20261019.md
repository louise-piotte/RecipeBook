# WP02 Section A7 — next generic milling gap review (R1036)

**Date:** 2026-10-19  
**Disposition:** Propose one identity-only generic milling entry for review. This is proposal-only; no catalog, ledger, plan, roadmap, recipe, or generated file was changed.

## Candidate

Propose **kodo millet bran-rich fraction** as a distinct, study-defined milling ingredient. Its direct human-food evidence is a primary study that prepared a kodo fraction and used it in a muffin formulation. The study defines the material narrowly: after dehulling kodo grain, the bran-rich fraction contained **true bran, broken grain, and husk**; that mixture was ground, sieved, and stabilized before use. It is therefore not interchangeable as an identity with pure kodo bran, kodo millet flour, whole kodo grain, or isolated husk.

The proposed English display is `kodo millet bran-rich fraction`. A provisional, descriptive French display is `fraction de mouture riche en son de millet kodo`. TERMIUM Plus standardizes French `kodo` for *Paspalum scrobiculatum* in a cereal-grain context; it does not provide this full milling-fraction phrase. The French compound should remain explicitly provisional and must not be represented as an OQLF-preferred term. The OQLF explains that unqualified *millet* can group several species, so retaining the crop qualifier is useful.

## Source-backed boundary

The primary food-use source is Barbhai, Hymavathi, and Kuna, “Quality assessment of nutri-cereal bran rich fraction enriched buns and muffins,” *Journal of Food Science and Technology* 59(6) (2022), 2231–2242, [doi:10.1007/s13197-021-05236-9](https://doi.org/10.1007/s13197-021-05236-9), [full text](https://pmc.ncbi.nlm.nih.gov/articles/PMC9114229/). Its materials and methods identify kodo as *Paspalum scrobiculatum*, describe the fraction as true bran plus broken grain and husk, and report its use in flour mixtures for muffins. The evidence supports this generic fraction and one human-food use; it does not establish a universal milling standard, retail grade, or household handling behavior.

The current kodo grain record already cites [TERMIUM Plus, *Paspalum scrobiculatum*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=KODO) as `WP03-KODO-20261010-S05`; that source supports the crop name and French base term only. The current kodo grain record also cites [FAO Ecocrop](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=1630) as `WP03-KODO-20261010-S02` for kodo grain uses including flour. Preserve both references on their existing owner records. Neither supports transferring any flour measure or behavior to the proposed bran-rich fraction.

Keep the proposed identity separate from:

- whole kodo millet and generic kodo millet flour;
- pure kodo bran, which this study did not prepare as the test ingredient;
- husk and broken grain as separate fractions;
- mixed millet bran-rich fractions from other species; and
- any extracted or isolated fibre, laboratory fraction, or study-specific preparation details.

The experiment used locally procured grain, a stone abrasive mini-dehuller, grinding, a 60-mesh sieve, and microwave stabilization. These methods describe the study sample only; do not make them required universal preparation instructions. No brand, product line, SKU, retailer, or commercial roster was researched or used.

## Live catalog and ownership audit

Audit performed against the current bundled package and catalog ledger on 2026-10-19:

| Area | Live state | R1036 result |
|---|---:|---|
| Ingredient references | 2,046 | No exact kodo bran-rich-fraction reference. The adjacent identities are `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour`; preserve both. |
| Ingredient forms | 205 | No kodo bran-rich-fraction form or form conversion. |
| Research ledger | 2,451 records | No kodo bran-rich-fraction record. The existing kodo grain and kodo flour records remain their respective owners; keep their sources, flour measurements, and flour substitution evidence scoped there. |
| Legacy import identities | 55 | No exact candidate or alias. |
| Substitution rules | 0 global, 0 contextual | No rule for this candidate; propose none. |
| Package yields | 1 | No kodo package yield; propose none. |
| Bundled recipes | 114 files / 1,123 ingredient lines | No kodo ingredient line, candidate name, or candidate ID; no current recipe demand or recipe link. |

Exact candidate name/ID searches returned no owner in references, forms, ledger, legacy identities, or recipes. The active kodo grain and flour identities are nearby ownership only and are not duplicates of this milling fraction.

## Numeric and substitution evidence

The study blended its kodo bran-rich fraction into refined wheat flour at 0%, 10%, 15%, 20%, 25%, and 30%. Its K30 muffin was the highest tested kodo-fraction level; the paper describes the tested kodo muffins' overall acceptability as not significantly different. These figures belong to that study's defined mixture and recipe. They are not a general home-baking substitution limit, do not define a flour equivalence, and do not support a reusable recipe rule.

The study supplies no household mass or volume portion, cup weight, consumer density, or unit conversion for the fraction. Lab functional-property measurements on its flour mixtures are not ingredient densities or transferable water-adjustment amounts. Recommend `measurementState: researched_no_supported_value`, with no measurement observations, default density, unit mappings, or forms.

The study supports a source-specific formula using the fraction alongside refined wheat flour; it does not establish general interchangeability or a safe proportion for arbitrary dishes. Recommend `substitutionResearchState: blocked_pending_evidence`, with no active global or contextual substitution rule and no substitution link on a recipe line.

## Minimal proposed data

If accepted for integration, add only the following generic reference and one supporting ledger record:

```json
{
  "id": "ingredient-ref-kodo-millet-bran-rich-fraction",
  "nameEn": "kodo millet bran-rich fraction",
  "nameFr": "fraction de mouture riche en son de millet kodo",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL",
  "updatedAt": "2026-10-19T00:00:00Z"
}
```

The French display is provisional. For the ledger, create an identity-only record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`. Add one generic study source record, proposed source ID `WP02-A7-R1036-S01`, for the Barbhai et al. paper above. Do not add a form, alias, measurement observation, density, unit mapping, recipe link, package yield, conversion, or active substitution.

## Queue scope

The plan's named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead is **out of scope**: a commercial-product count does not add ingredient diversity. Stop that product-only line here. Preserve its historical R605 evidence and existing rows; the generic wheat-meal question remains unresolved and is not decided by this review.

## Sources

- Barbhai, M. D., T. V. Hymavathi, and A. Kuna. “Quality assessment of nutri-cereal bran rich fraction enriched buns and muffins.” *Journal of Food Science and Technology* 59(6) (2022): 2231–2242. [DOI](https://doi.org/10.1007/s13197-021-05236-9) · [Full text and methods](https://pmc.ncbi.nlm.nih.gov/articles/PMC9114229/).
- Translation Bureau, Public Services and Procurement Canada. TERMIUM Plus, *Paspalum scrobiculatum* (2016-03-11). [Record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=KODO). Existing ledger source ID `WP03-KODO-20261010-S05`; retain under the existing kodo-grain owner.
- Food and Agriculture Organization of the United Nations. Ecocrop crop record, *Paspalum scrobiculatum*. [Record](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=1630). Existing ledger source ID `WP03-KODO-20261010-S02`; retain under the existing kodo-grain owner.
- Office québécois de la langue française. GDT, *millet*. [Record](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet). Supports species-qualified wording because *millet* can refer to multiple species; it does not attest the proposed full French milling compound.

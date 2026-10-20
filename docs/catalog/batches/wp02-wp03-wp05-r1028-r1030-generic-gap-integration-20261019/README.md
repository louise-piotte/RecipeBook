# WP02/WP03/WP05 R1028–R1030 generic ingredient integration

## Scope and disposition

On 2026-10-19, the three reviews continued generic culinary ingredient coverage across milling, produce plant parts, and prepared foods. No brand, product line, flavour family, SKU, or retailer-variant roster was researched or added. Existing branded references and their evidence remain intact.

| Review | Integrated identity | Boundary and evidence limits |
|---|---|---|
| [R1028 proposal](../../proposals/wp02-next-generic-milling-gap-review-r1028-20261019.md) | `barley bran flour / farine de son d’orge` (`ingredient-ref-barley-bran-flour`, `FLOUR_AND_STARCH`) | Distinct from barley bran, barley grain flour, and other cereal bran flours. Bread formula levels and the 30 g clinical diet dose remain tied to their studies. No reusable measure, form, recipe link, conversion, yield, or active substitution was added. French display is descriptive and provisional. |
| [R1029 proposal](../../proposals/wp03-section-k-moringa-flowers-identity-review-r1029-20261019.md) | `moringa flowers / fleurs de moringa` (`ingredient-ref-moringa-flowers`, `VEGETABLE_AND_AROMATIC`) | Limited to culinary flowers of *Moringa oleifera*. Kept separate from moringa leaves and pods and other species. Leaf and pod amounts in the cited treatise were not transferred. No forms, measures, recipe links, conversions, yields, or substitutions were added. |
| [R1030 proposal](../../proposals/wp05-next-generic-pantry-gap-review-r1030-20261019.md) | `pa-kimchi / pa-kimchi (kimchi à l’oignon vert)` (`ingredient-ref-pa-kimchi`, `SAUCE_AND_CONDIMENT`), with source-supported alias `green onion kimchi` | Kept separate from generic kimchi, other named kimchi types, and raw alliums. The Korea.net 10 g crab-soup amount is one recipe-scoped published-portion observation; it is not a reusable measure. No form, recipe link, conversion, yield, or active substitution was added. French display is descriptive and provisional. |

Manufacturer, institutional, and research sources were used only for claims supported beyond a named product or within their stated study context. For example, the barley-bran-flour percentages and diet dose were not generalized to barley bran flour as a whole; no manufacturer-specific data was used to create a generic row.

## Queued brand-specific work reviewed

The pending item asking for further independent Québec bilingual approval of the already-modeled Mochiko and Shiratamako displays is now marked out of scope in the catalog plan. It concerns terminology for named commercial products, not a generic ingredient-diversity gap. Preserve both existing entries, their evidence, and their provisional displays; do not delete or merge them. Generic rice-flour coverage remains open. The previously dispositioned Section F commercial cereal rosters and named Anson Mills wheat-meal lead also remain out of scope because commercial-product counts do not add ingredient diversity.

## Validation snapshot

Static data checks passed after integration:

- 2,041 ingredient references, 205 forms, and 2,446 research-ledger records.
- 11,440 source entries across 9,605 distinct source IDs; no source ID/URL conflicts.
- 55 legacy candidates, 114 manifest recipes, and 1,123 structured ingredient rows.
- All three new reference and ledger records are unique; recipe-demand search returned no bundled recipe matches for the new identities or aliases.
- Pa-kimchi has one source-scoped 10 g observation. Barley bran flour and moringa flowers have no measurement observations.
- Bundled seed package normalization and validation, ingredient-reference normalization, generated-index freshness, ledger validation, UTF-8/no-BOM checks, and scoped whitespace checks passed.

No software tests, build, emulator run, or deployment were performed because the app data change only adds database JSON, as allowed by `AGENTS.md`.

## Source overview

- Barley bran flour identity and bounded study context: Choi, [“Effect of Barley Bran Flour Addition on the Quality of Bread”](https://www.kci.go.kr/kciportal/ci/sereArticleSearch/ciSereArtiView.kci?sereArticleSearchBean.artiId=ART001102997); Lupton et al., [“Barley bran flour accelerates gastrointestinal transit time”](https://pubmed.ncbi.nlm.nih.gov/8393033/). The Santé Canada and OQLF terminology sources are reused only for their support of `son d’orge` and `son`.
- Moringa flower identity and culinary use: OQLF, [moringa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17019213/moringa); Tamil Nadu Agricultural University, [*Advances in Production of Moringa*](https://agritech.tnau.ac.in/horticulture/pdf/Moringa%20English%20book.pdf); Kew, [*Moringa oleifera*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:584736-1/general-information); and the Pacific Community, [*De la couleur dans nos assiettes !*](https://www.service-public.pf/dsp/wp-content/uploads/sites/12/2023/04/De-la-couleur-dans-nos-assiettes.pdf).
- Pa-kimchi identity and its single recipe-specific amount: Korea.net, [“Converted to kimchi”](https://www.korea.net/NewsFocus/People/view?articleId=122386) and [“Kimchi crab meat soup”](https://www.korea.net/NewsFocus/Culture/view?articleId=199994&pageIndex=1). OQLF [oignon vert (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083674/oignon-vert) supports the general French term, not a standardized pa-kimchi name.

See also the [all-category scope review](../generic-ingredient-scope-review-20261019/README.md) and the updated [catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).

# WP05 Section S — regional oils and product-boundary gap review

- **Review date:** 2026-10-12
- **Disposition:** proposal only; recommend a bounded identity-only tranche
- **Scope:** remaining named plant/seed oils and coconut/palm product boundaries after the 2026-10-12 Section S integration
- **Not in scope:** animal fats, shortening, margarine/spreads, infused oils, cooking sprays, measurements, conversions, or substitutions

## Recommendation

After the recently integrated WP05 tranche, add seven new `FAT_AND_OIL` identities:

1. walnut oil / huile de noix
2. hazelnut oil / huile de noisette
3. pumpkin-seed oil / huile de graines de citrouille
4. safflower oil / huile de carthame
5. rice-bran oil / huile de riz
6. virgin coconut oil / huile de noix de coco vierge
7. palm-kernel oil / huile de palmiste

Keep the current generic coconut-oil identity for source text that says only “coconut oil.” Create no recipe links in this tranche: none of the 1,123 ingredient rows names one of these seven products. Add no forms, quantities, density, unit mappings, conversions, yields, or substitutions.

Hold a general `refined coconut oil` identity and any mapping from `refined` to `deodorized`. The Québec product evidence distinguishes a marketed deodorized product from virgin coconut oil, but its French page's ingredient statement conflicts with its own product title and process description. The 2026 Codex Committee on Fats and Oils also did not start proposed new work to add virgin coconut oil to CXS 210 because the distinction and parameters needed further clarification [S11–S12]. This leaves enough evidence to retain the exact named `virgin coconut oil` market identity, but not to collapse “refined,” “deodorized,” and “virgin” into one global crosswalk.

## Repository audit and prior decisions

I read the current [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [roadmap](../../../roadmap.md), live split seed package, legacy-candidate file, research ledger, the prior [WP05 Section S proposal](wp05-section-s-fats-oils-gap-review-20261012.md), the [2026-10-12 WP05 integration report](../batches/wp05-section-s-fats-oils-integration-20261012/README.md), and the related WP03/WP06 decisions below.

The live snapshot inspected on 2026-10-12 contains **1,121 active references, 79 forms, 71 legacy candidates, 1,418 research-ledger records, and 114 recipes / 1,123 ingredient rows**. Candidate phrases were accent-, punctuation-, case-, and whitespace-normalized, then checked against active reference display names and aliases, form terms, and legacy candidate names/aliases. The seven suggested IDs below are absent from active references, forms, legacy candidates, and ledger record IDs. There is no exact active/form/legacy phrase owner for the proposed terms or aliases. The only exact target-family active owners are the already-integrated mustard-oil row and the already-integrated `groundnut oil` alias.

| Existing owner or decision | Live state | Carry-forward boundary |
| --- | --- | --- |
| Generic coconut oil | Active `ingredient-ref-coconut-oil` — `coconut oil / huile de coco` | Keep for unqualified wording. Do not give its generic phrase to virgin, refined, or deodorized coconut oil. |
| Crude palm oil | Active `ingredient-ref-crude-palm-oil` — `crude palm oil (azeite de dendê) / huile de palme brute (azeite de dendê)` | Preserve the current crude, fruit-pulp product. Palm-kernel oil is a different fruit part and needs its own identity. |
| Mustard oil | Active `ingredient-ref-mustard-oil` — `mustard oil / huile de moutarde`, with EN alias `mustard seed oil` | Already integrated in WP06; do not add a duplicate or assign generic mustard wording. Keep it separate from mustard seeds and mustard greens. |
| Peanut oil | Active `ingredient-ref-peanut-oil` — `peanut oil / huile d'arachide`, with EN aliases `arachis oil` and `groundnut oil` | Preserve the accepted oil alias. Do not broaden to bare `groundnut` or to groundnut paste. |
| Red-palm and groundnut-paste boundary | WP06 review remains in force | No global `red palm oil`, `red oil`, `zomi/dzomi/amidze`, or `groundnut paste` mapping was accepted. A future exact source may be reviewed in context; this packet does not reopen the decision. |
| Pumpkin products | Active `ingredient-ref-pumpkin-squash-seeds` and `ingredient-ref-pumpkin-seed-butter` | Oil is a distinct product. This does not broaden the whole-seed row's aliases; see the WP03 pumpkin-seed/pepitas boundary review. |
| Walnut and hazelnut products | Active walnut-butter and hazelnut-butter identities | Keep the pressed oils distinct from kernels and butters. |
| Avocado oil | Legacy `ingredient-ref-avocado-oil`, still unreviewed | No duplicate or reactivation proposed here. |
| Generic vegetable-oil wording | Existing WP05 integration removed `canola oil`, `huile de canola`, `neutral oil`, `oil`, and `huile` from the generic row | This review does not reassign generic wording or revisit the source-specific canola boundary. Keep the integration report's exact recipe dispositions. |

The [prior WP05 proposal](wp05-section-s-fats-oils-gap-review-20261012.md) recommended and documented the tranche integrated on 2026-10-12; this packet reviews its remaining held regional and product-state candidates. The [WP06 crude-palm batch](../batches/wp06-crude-palm-oil-identity-20261009/README.md) and [WP06 red-palm/groundnut boundary review](wp06-section-z-groundnut-palm-boundary-20261010.md) already establish the palm-fruit/kernel and source-local red-palm/groundnut-paste decisions. The [WP06 South Asian sweep](wp06-south-asia-cuisine-gap-sweep-20261011.md) records mustard oil as covered. The [WP03 pumpkin-seed review](wp03-pumpkin-seeds-pepitas-boundary-review-20261010.md) keeps the whole-seed identity separate from oil and warns against broadening its seed aliases.

## Recipe-demand scan

I scanned `originalText`, `ingredientName`, and reference IDs for every ingredient row in all 114 manifest-listed recipes. Exact normalized searches for the proposed oils and named state terms returned **zero ingredient-line matches**. Current related oil/fat line counts are:

| Current line wording | Rows | Implication for this review |
| --- | ---: | --- |
| Olive oil, unqualified | 7 | No relation to the proposed identities. |
| Extra-virgin olive oil | 2 | Already linked by the previous WP05 integration; unchanged. |
| Vegetable oil | 9 | Keep generic; no source can be inferred from an option or note. |
| Sesame oil, unqualified | 1 | Already linked by the previous WP05 integration; unchanged. |
| Toasted sesame oil | 1 | Keep on the existing toasted identity. |
| Coconut oil, unqualified | 1 | Keep on active `ingredient-ref-coconut-oil`; the line does not specify virgin/refined/deodorized. |
| Margarine | 6 | Outside this focused plant-oil tranche. |
| Oil spray | 1 | Source and formulation remain unspecified; no link proposed. |

The nine unqualified olive-oil rows and nine generic vegetable-oil rows are totals by current ingredient name, while the two extra-virgin olive-oil rows are separate. No walnut, hazelnut, pumpkin-seed, safflower, rice-bran, virgin/refined/deodorized coconut, palm-kernel, mustard, or red-palm recipe line warrants a new link. The corpus scan supports catalog coverage only, not assumptions about which oil a recipe could substitute.

## Proposed identities and alias boundaries

| Candidate ID | Proposed EN / fr-CA display | Proposed aliases | Identity and boundary decision |
| --- | --- | --- | --- |
| `ingredient-ref-walnut-oil` | `walnut oil / huile de noix` | None | OQLF gives the direct English/French pair and defines the oil from English walnuts [S01]. A Québec manufacturer sells a more specific Grenoble walnut oil made from roasted walnuts; use it only as product evidence. Do not add `huile de noix de Grenoble` / `Grenoble walnut oil` as universal aliases, and do not make roasting part of the global identity [S02]. Keep separate from walnut kernels and walnut butter. |
| `ingredient-ref-hazelnut-oil` | `hazelnut oil / huile de noisette` | None | Québec manufacturer product names give this direct bilingual pair and identify hazelnuts as the ingredient [S04]. The OQLF-hosted AFNOR entry pairs `huile de noisette` with the broad English `nut oil`; do **not** add `nut oil`, which can collide with walnut and other nut oils. One maker's roasted-hazelnut process is not a global state qualifier [S03–S04]. |
| `ingredient-ref-pumpkin-seed-oil` | `pumpkin seed oil / huile de graines de citrouille` | FR: `huile de pépins de courge`; `huile de graines de courge` | Canadian product pages use `pumpkin seed oil` and these French phrases for the same culinary product; a Québec retailer lists it for salads/pasta and gives `huile de pépins de courge` as the ingredient [S05–S06]. Scope is seed-derived oil, not pumpkin flesh, whole seeds, seed butter, or bare `pumpkin oil` / `huile de courge`. These are oil-reference aliases supported by product wording; they do not alter the separate WP03 whole-seed alias boundary. Do not add toasted/cold-pressed wording as a global alias. |
| `ingredient-ref-safflower-oil` | `safflower oil / huile de carthame` | EN: `safflower seed oil`; `safflowerseed oil`; `carthamus oil`; `kurdee oil` | OQLF provides the preferred fr-CA / English pair and lists the English variants; Codex CXS 210 independently uses the seed-oil name and bracketed synonyms [S07, S10]. Do not add context-specific `huile de safre`. Hold high-oleic safflower oil as a separately qualified product rather than an alias to generic safflower oil; no recipe demands it. |
| `ingredient-ref-rice-bran-oil` | `rice bran oil / huile de riz` | EN: `rice oil` | OQLF pairs `huile de riz` with `rice oil` and `rice bran oil`; Codex defines rice bran oil as derived from rice bran and explicitly lists rice oil as the synonym [S08, S10]. Prefer Codex for the source-part definition because the older OQLF entry's extraction wording is imprecise. Keep distinct from rice grain, rice flour, and any standalone bran identity. |
| `ingredient-ref-virgin-coconut-oil` | `virgin coconut oil / huile de noix de coco vierge` | None | A Québec manufacturer offers a separately named, culinary virgin product in both languages [S11]. Keep the active unqualified coconut-oil row unchanged. Do not add `unrefined`, `refined`, `deodorized`, `cold-pressed`, or `copra oil` as aliases. Codex's 2026 report records that the proposed VCO standard needed further differentiation work and that CCFO29 did not start new work; the source supports this as a cautious product-name identity, not a claim that Codex recognizes a separate named-oil standard [S12]. |
| `ingredient-ref-palm-kernel-oil` | `palm kernel oil / huile de palmiste` | None | OQLF's 2026 entry provides the fr-CA term and direct English pair. Its hyphenated English spelling is only a punctuation variant of the display name, so no redundant alias is needed. Codex distinguishes palm-kernel oil from palm oil by fruit part and separately defines palm-kernel olein/stearin fractions [S09–S10]. Keep distinct from active crude palm oil, unqualified palm oil, red palm oil, and all palm fractions. Do not add acronym `PKO` or use a palm-oil alias. |

Every row is identity-only in category `FAT_AND_OIL`. Source-specific product methods, nutrition claims, temperatures, measurements, and culinary recommendations are not catalog data in this proposal.

## Held and already-covered candidates

| Candidate | Disposition | Boundary / next action |
| --- | --- | --- |
| Refined coconut oil | Hold; no identity or alias | No verified Québec source in this packet establishes a stable generic `refined` class. Do not assume that `refined` and `deodorized` mean the same product. |
| Deodorized coconut oil | Hold; no identity or alias | Maison Orphée's French product page titles the oil deodorized and describes steam deodorization, but its ingredient statement says virgin coconut oil. The English page's product/ingredient text says deodorized. Resolve that bilingual label conflict before allocating an identity [S11]. |
| Toasted pumpkin-seed oil | Hold as a process-qualified candidate | A Canadian retailer lists a toasted Styrian pumpkin-seed oil separately. This supports treating toasted as meaningful product wording, not as an alias for unqualified seed oil; no bundled recipe asks for it [S13]. |
| High-oleic safflower oil | Hold as a qualified product | Codex lists it separately from ordinary safflower seed oil. No recipe demand or source-backed Québec display was established here [S10]. |
| Red palm oil / red oil / zomi, dzomi, amidze | Already reviewed; keep WP06 hold | Preserve WP06's source-local decision; do not alias these terms to crude palm oil without an exact source establishing fruit part and processing state. |
| Groundnut oil | Already covered | Keep as an EN alias on peanut oil. Do not broaden to generic groundnut or groundnut paste; the WP06 paste decision remains source- and product-state-specific. |
| Mustard oil | Already covered | Keep active `ingredient-ref-mustard-oil` and its current alias. Do not mint a duplicate or broaden to mustard seed, greens, or prepared mustard. |
| Palm olein/stearin and palm-kernel olein/stearin | Hold as separate fractions | Codex names these as fractions of their corresponding oils. This identity-only tranche does not add fraction rows or map them to either oil [S10]. |
| Animal fats, shortening, margarine/spreads, infused oils, and cooking sprays | Remain open in Section S | Retain the plan's remaining checklist; review these separately with their own source and recipe-demand evidence. |

## Source manifest

External sources were accessed on 2026-10-12. Québec manufacturers and retailers establish local product wording and food-market presence only for the exact products on their pages. OQLF entries support terminology, while Codex supports named-oil source and product-part boundaries. None of these sources proves recipe interchangeability or numeric catalog behavior.

| Source ID | Source and direct URL | Use and limitation |
| --- | --- | --- |
| **WP05-REGIONAL-OILS-STATE-20261012-S01** | Office québécois de la langue française, [huile de noix](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8433503/huile-de-noix) | Direct food-oil term pair `huile de noix / walnut oil`; definition mentions oil from English walnuts. |
| **WP05-REGIONAL-OILS-STATE-20261012-S02** | La Maison Orphée, [Huile de Noix de Grenoble](https://maisonorphee.com/products/huile-de-noix-de-grenoble) and [Grenoble Walnut Oil](https://maisonorphee.com/en/products/grenoble-walnut-oil) | Bilingual Québec-market culinary product page; its Grenoble origin and roasted-walnut process are product-specific, not generic aliases. |
| **WP05-REGIONAL-OILS-STATE-20261012-S03** | OQLF / AFNOR, [huile de noisette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3695888/huile-de-noisette) | Supports the French term in the edible oils domain. Its English translation `nut oil` is too broad for an alias decision here. |
| **WP05-REGIONAL-OILS-STATE-20261012-S04** | La Maison Orphée, [Huile de Noisette](https://maisonorphee.com/collections/tous-nos-produits/products/huile-de-noisette) and [Hazelnut Oil](https://maisonorphee.com/en/collections/nos-coups-de-coeur/products/huile-de-noisette) | Bilingual product labels and ingredient identify hazelnuts; the supplier's roasted-seed preparation is product-specific. |
| **WP05-REGIONAL-OILS-STATE-20261012-S05** | La Moisson, [Huile de graines de citrouille / Pumpkin seed oil](https://lamoisson.com/products/huile-de-graines-de-citrouille-pumpkin-seed-oil) | Québec retailer listing names the product, provides the ingredient phrase `huile de pépins de courge`, and places it in food use. The page notes that product information may be outdated or inaccurate, so the terminology was checked against a Canadian producer as well. |
| **WP05-REGIONAL-OILS-STATE-20261012-S06** | Purepress Oils, [French pumpkin-seed-oil product page](https://purepressoils.com/fr/products/pumpkin-seed-oil) and [English product page](https://purepressoils.com/products/pumpkin-seed-oil) | Canadian producer page identifies culinary pumpkin-seed oil and uses `huile de graines de courge` / `huile de pépins de courge` in French. Its pressing and seed-source details describe its product only. |
| **WP05-REGIONAL-OILS-STATE-20261012-S07** | OQLF, [huile de carthame](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8878264/huile-de-carthame) | Preferred Québec term and English terms `safflower oil`, `safflowerseed oil`, `carthamus oil`, `kurdee oil`; `huile de safre` is marked as used in some contexts. The page's comparison to sunflower is not used as a substitution rule. |
| **WP05-REGIONAL-OILS-STATE-20261012-S08** | OQLF, [huile de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410164/huile-de-riz) | Supplies `huile de riz`, `rice oil`, and `rice bran oil` terminology. Its older extraction definition is not used for product-source adjudication. |
| **WP05-REGIONAL-OILS-STATE-20261012-S09** | OQLF, [huile de palmiste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084454/huile-de-palmiste) | 2026 food-oil entry defines palmiste as the kernel within oil-palm fruit and gives English `palm kernel oil` and variants. |
| **WP05-REGIONAL-OILS-STATE-20261012-S10** | FAO/WHO Codex Alimentarius, [CXS 210-1999, Standard for Named Vegetable Oils](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+210-1999%2FCXS_210e.pdf) | Current standard (listed as modified in 2024) defines the named source oils and synonyms, including rice bran/rice oil, safflower synonyms, palm kernel vs palm mesocarp, and separate oil fractions. It is used for identity boundaries, not for substitutions. |
| **WP05-REGIONAL-OILS-STATE-20261012-S11** | La Maison Orphée, [virgin coconut oil (FR)](https://maisonorphee.com/products/huile-de-noix-de-coco-vierge-bio-2-0), [virgin coconut oil (EN)](https://maisonorphee.com/en/collections/coconut-oil/products/organic-virgin-coconut-oil-2-0), [deodorized coconut oil (FR)](https://maisonorphee.com/products/huile-de-noix-de-coco-desodorisee-bio-2-0), and [deodorized coconut oil (EN)](https://maisonorphee.com/en/collections/coconut-oil/products/cold-pressed-organic-deodorized-coconut-oil-2-0) | Québec manufacturer's bilingual market terms and product distinction. The French deodorized page's ingredient statement conflicts with its title/process; do not infer that it defines generic refined coconut oil. |
| **WP05-REGIONAL-OILS-STATE-20261012-S12** | FAO/WHO Codex Alimentarius, [CCFO29 Final Report, REP26/FO](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FMeetings%252FCX-709-29%252FFinal%252520report%252FREP26_FOe.pdf) | Paras. 145–149 record that CCFO29 did not start proposed work to include VCO in CXS 210 because further differentiation and clarification were needed. This is a standardization status, not a denial that producers market a named VCO product. |
| **WP05-REGIONAL-OILS-STATE-20261012-S13** | Well.ca, [La Tourangelle Toasted Pumpkin Seed Oil](https://well.ca/fr/produits/la-tourangelle-toasted-pumpkin-seed_142176.html) | Canadian retail example for a separately worded toasted seed oil; supports holding the process-qualified phrase out of generic aliases, not a universal process taxonomy. |

## Limitations and next review

This proposal is a source-backed catalog candidate list, not a full survey of all regional oils or Québec grocery labels. No recipe line demands the proposed oils, and several sources describe one producer's or retailer's specific products. Keep product-specific roasting, deodorization, pressing, refining, origin, and taste statements out of global aliases unless an exact recipe or a later identity review justifies them. Review the seven proposed bilingual identities and the coconut boundary before integration; keep the remaining Section S checklist open.

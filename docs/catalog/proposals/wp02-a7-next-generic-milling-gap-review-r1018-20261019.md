# WP02 Section A7 R1018: rice bran flour identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, research ledger, manifest, plan, roadmap, recipe, or integration file was changed.
- **Open-plan anchor:** Section A7 remains open for “other grain meals (including the unresolved wheat-meal candidate) and milling products” ([plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** Generic human-food **rice bran flour**, a rice-bran milling ingredient directly named in a primary baking study.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference for **rice bran flour / farine de son de riz**. The French compound is descriptive and provisional for Québec. Keep it separate from rice bran, defatted rice bran, rice-bran oil, and rice-kernel flour. Add no aliases, forms, measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. No brand, product-line, flavour-family, SKU, or retailer roster was researched.

## Identity and boundary

Rice bran flour is a human-food ingredient made from the bran fraction of rice and used as a flour or powder ingredient. Bultum et al. directly call their food-study ingredient “full fat rice bran flour” and use it in bread and biscuits; Lee separately studies “rice bran powder” in white bread [S01–S02]. These papers support a culinary milling identity beyond the existing unqualified bran entry. They do not establish one universal grind, fat state, stabilization method, or composition for all rice bran flour.

Keep the candidate distinct from:

- **ingredient-ref-rice-bran**, the active generic `rice bran / son de riz` identity for the bran milling fraction without a flour qualifier. Do not treat all bran as flour or move its evidence to the new candidate.
- **ingredient-ref-defatted-rice-bran**, the active oil-extraction-qualified bran identity. Defatting is not a flour alias or form, and the candidate does not absorb that row.
- **ingredient-ref-rice-bran-oil**, the active `rice bran oil / huile de riz` entry, with English alias `rice oil`.
- **ingredient-ref-rice-flour** and the other rice-kernel flour entries. Those name flour milled from rice grain, not the bran fraction.
- Rice starch, isolated rice-bran fibre or protein, rice-bran extracts, feed-grade fractions, and composite foods that include rice bran.

The display **rice bran flour** is supported by the exact English phrase in S01. Do not qualify the generic row as full-fat: S01’s flour was full-fat and microwave-stabilized, while S02 does not report the powder’s fat state in its abstract. Those are source-specific details, not a universal definition. The phrase **rice bran powder** in S02 is useful related culinary terminology, but its abstract does not define its milling grade or establish a stable synonym across processing and fat states. Keep it unallocated rather than adding it as an alias. Do not create separate rows for “full-fat,” stabilized, particle-size, or other study-only variants.

For French, propose **farine de son de riz** as a transparent descriptive compound, not as an OQLF-approved term. OQLF’s current entry gives **farine de riz** for a fine powder of ground rice grains, while the existing rice-bran evidence and CFIA’s bilingual bran guidance support **son de riz** and naming the grain source [S04–S06]. Those references support the components and source-qualified wording, but none attests the exact compound for rice-bran flour. Keep both alias arrays empty pending independent Québec review.

## Exact-name, alias, form, ledger, and legacy ownership

Read-only repository audit on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,029** active references. No exact normalized name or alias owns `rice bran flour`, `rice bran powder`, `full fat rice bran flour`, `farine de son de riz`, `poudre de son de riz`, or `son de riz moulu`. Nearby owners are `ingredient-ref-rice-bran` (`rice bran / son de riz`), `ingredient-ref-defatted-rice-bran` (`defatted rice bran / son de riz dégraissé`), `ingredient-ref-rice-bran-oil` (`rice bran oil / huile de riz`; English alias `rice oil`), `ingredient-ref-rice-flour` (`rice flour / farine de riz`), and `ingredient-ref-wild-rice-bran` (`wild rice bran / son de riz sauvage`). | The candidate phrases have no exact owner. Add only the qualified bran-flour identity if accepted. Keep all adjacent rows, aliases, and source evidence unchanged. A broad `rice bran` or `son de riz` query may continue to return multiple distinct bran identities. |
| Ingredient forms | **205** forms. None is attached to the rice-bran, defatted-rice-bran, rice-bran-oil, or rice-flour rows. | Add no form. Flour is the proposed milling identity; stabilization and fat state remain source details, not established reusable forms here. |
| Legacy import identities | **55** candidates. No exact rice-bran-flour or proposed French compound match was found. | No legacy merge or promotion is supported. |
| Research ledger | **2,434** records. The existing `ingredient-ref-rice-bran` record is verified, has measurement state `researched_no_supported_value`, and substitution state `blocked_pending_evidence`. The `ingredient-ref-defatted-rice-bran` record has the same measurement and substitution states. Neither record owns the candidate’s exact name or the two primary-study DOI/URLs in S01–S02. | If accepted, create a separate identity record in a later integration. Keep existing source ownership and related bran findings in place; do not transfer their values or findings. |
| Bundled recipes | **114** manifest-listed recipes and **1,123** ingredient rows. A normalized scan of all recipe JSON strings and ingredient-line fields for `rice bran flour`, `farine de son de riz`, `rice bran powder`, `powdered rice bran`, `rice bran`, and `son de riz` found **0 matching recipe files and 0 matching ingredient rows**. | No bundled recipe demand, linked line, or recipe quantity supports adding a recipe link or value. |
| Proposal history | No prior proposal owns the candidate name, aliases, or R1018 review ID. Earlier A7 proposals cover defatted rice bran and Tartary-buckwheat bran flour as separate milling identities. | This is a new milling candidate; preserve those decisions and their evidence. |

The existing rice-bran ledger entry includes a **2 tbsp (15 g)** observation for one Westpoint Naturals stabilized retail product and a manufacturer suggestion to replace part of all-purpose flour with that product in muffins or cakes. Both remain specific to that labelled product and its suggested context; neither establishes a measure, density, or substitution for generic rice bran flour. The existing defatted-bran studies and blocked substitution finding likewise remain on that ingredient. See the [rice bran review](wp03-section-f-rice-bran-identity-review-20261013.md) and [defatted rice bran review](wp02-a7-generic-grain-gap-review-r972-20261019.md); preserve their ledger ownership and all branded entries.

## Forms, measurements, and substitution

The papers give experimental recipe-formulation levels, not household measures or general conversions. S01 used microwave-stabilized full-fat rice bran flour at 5%, 10%, 15%, and 20% in bread trials and 5%, 10%, 15%, 20%, 25%, and 30% in biscuit trials; it reports acceptable physicochemical and sensory outcomes up to 10% for bread and 20% for biscuits under that study’s formulations. S02 tested rice bran powder at 0%, 5%, 10%, 15%, and 20% in one white-bread study and reports that the 15% formulation did not show a decisive difference in consumer acceptance. These percentages describe those specific test formulas only. They are not a reusable substitution ratio, baking recommendation, measure, density, or unit mapping.

No reviewed source supplies a transferable household volume-to-mass value, bulk density, or general yield for rice bran flour. S01’s stabilization, sample origin, wheat-flour blends, and bread/biscuit outcomes remain limited to that study; S02 does not establish the powder’s fat state or milling specification. If integrated, record measurement research as `researched_no_supported_value`, add no measurement observation, and leave density null and unit mappings empty.

The studies demonstrate experimental inclusion in particular baked goods, but do not establish a general replacement target, dish-independent scope, method adjustment, or recipe-line rule. If integrated, keep substitution research `blocked_pending_evidence`; add no active global or contextual substitution, form conversion, yield, or recipe link. Do not transfer the existing Westpoint suggestion or defatted-bran formula findings.

## Source register and limits

Proposal-local sources below are for this review packet only; this proposal-only task does not add them to the shared research ledger.

| Source | Source and locator | Evidence and limit |
|---|---|---|
| **S01** | Bultum, Emire & Wolde, [“Influence of full fat rice bran from Ethiopian rice milling industries on nutritional qualities, physicochemical and sensory properties of bread and biscuits”](https://link.springer.com/article/10.1007/s11694-020-00472-7), *Journal of Food Measurement and Characterization* 14 (2020), 2253–2261, DOI [10.1007/s11694-020-00472-7](https://doi.org/10.1007/s11694-020-00472-7), abstract. | Directly names full-fat rice bran flour, describes microwave stabilization, and reports bread/biscuit formulations. The sample, stabilization, tested percentages, measurements, and outcomes are study-specific; the abstract does not supply a general flour grade, household measure, density, or transferable recipe rule. |
| **S02** | Lee, [“Quality Characteristics of Bread with Rice Bran Powder”](https://www.kci.go.kr/kciportal/landing/article.kci?arti_id=ART002461781), *Culinary Science & Hospitality Research* 25(4) (2019), 63–71, DOI [10.20878/cshr.2019.25.4.007](https://doi.org/10.20878/cshr.2019.25.4.007), article abstract. | Directly names rice bran powder as an ingredient in a white-bread study. Its tested levels and reported acceptance are limited to that formulation. The abstract does not define fat state, grind, equivalence to every rice-bran flour, or a general replacement amount. |
| **S03** | FAO, [Rice in Human Nutrition — Rice bran and rice-bran oil](https://www.fao.org/4/t0567e/t0567e0k.htm), section “Rice bran and rice-bran oil.” | Authoritative background says stabilized full-fat rice bran is used in breakfast cereals, snacks, and bakery products and summarizes older baked-food applications. It supports general human-food context for rice bran, not the candidate’s flour grade, terminology, measure, or a transferable percentage. |
| **S04** | Canadian Food Inspection Agency, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products?wbdisable=true), “Bran.” | Says that non-wheat bran names must identify the source grain. This supports source-qualified construction but is not a specific rice-bran-flour standard. This source is also already linked from the existing rice-bran review. |
| **S05** | Agence canadienne d’inspection des aliments, [Exigences d’étiquetage et de composition pour les céréales et les produits de boulangerie](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie), section « Son ». | French counterpart says that when bran comes from another cereal, the cereal source must be named. It supports « son de riz » as a transparent construction, not a specific ruling for « farine de son de riz ». This source is also already linked from the existing rice-bran review. |
| **S06** | Office québécois de la langue française, [farine de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), GDT, updated 2025. | Defines the preferred term « farine de riz » as a fine powder of ground rice grains. It supports the French flour component only; its definition concerns milled rice grain and must not be transferred to bran or treated as approval of the compound « farine de son de riz ». |

## Cross-category queue scope

The named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead remains a commercial-product-only line and is out of scope because commercial-product counts do not add ingredient diversity. Stop that line; preserve its historical R605 hold ([plan, line 22142](../../RecipeBook-global-ingredient-catalog-plan.txt#L22142); [R605 proposal](wp03-section-f-next-grain-gap-review-r605-20261018.md)), existing branded rows, and all product-scoped evidence. The separate generic wheat-meal candidate remains unresolved and is not part of this review. No commercial roster, retailer variant, or product-only value is transferred to the proposed rice-bran-flour identity.

## Proposed minimal state and decision

If accepted, add only this identity:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-rice-bran-flour` |
| English display | `rice bran flour` |
| French display | `farine de son de riz` (descriptive; provisional for Québec) |
| Category | `FLOUR_AND_STARCH` |
| English/French aliases | Empty |
| Default density / unit mappings | `null` / empty |
| Forms, measurements, recipe links, conversions, yields, active substitutions | None |
| Proposed research states | Identity verified; measurement `researched_no_supported_value`; substitution `blocked_pending_evidence` |

Recommend adding this identity-only milling product because primary food studies directly name rice bran flour and rice bran powder as ingredients in human-food baking applications, while the active catalog has no exact owner for the flour phrase. Keep the French compound provisional and the powder phrase unassigned until equivalence is established. The bundled recipe corpus provides no current demand, and the reviewed evidence supports no reusable measurements or substitution behavior. No tests or builds were run because this task changes only a proposal document.

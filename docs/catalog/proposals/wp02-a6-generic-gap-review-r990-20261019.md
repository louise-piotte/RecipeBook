# WP02 Section 04 A6 R990: dark buckwheat flour rusk-trial evidence review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog JSON, research ledger, plan, roadmap, recipe, generated file, or test was changed.
- **Open-plan anchor:** WP02 Section 04 A6 remains open for buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours ([plan, line 1873](../../RecipeBook-global-ingredient-catalog-plan.txt#L1873)).
- **Selected evidence gap:** Source-scoped substitution evidence for the existing `ingredient-ref-dark-buckwheat-flour` reference.
- **Distinct from nearby work:** R161 established the Québec display `dark buckwheat flour / farine grise de sarrasin`; R236 and R241 handled light and whole buckwheat flour identities; R758 reviewed generic buckwheat flour. This proposal adds no identity and does not transfer R758’s generic-flour findings to the dark row.

## Recommendation

Keep the verified identity, display names, empty alias arrays, and reference fields unchanged. Append one primary-study source and one formula-scoped substitution finding to the existing dark-buckwheat-flour ledger record, then set the record-level `substitutionResearchState` to `blocked_pending_evidence`.

Bondarenko et al. tested one named commercial Ukrainian flour sample described as dark buckwheat flour in a yeast-leavened wheat-bread formula intended for drying into rusks. The study replaced wheat-flour mass with 15%, 20%, or 25% dark flour. It reports that the 20% and 25% treatments reduced bread volume and porosity in that formula, and concludes that 15% was the maximum amount for its tested product. The paper reports dough moisture shares of 42.5%, 43.0%, and 43.6% for the 15%, 20%, and 25% dark-flour blends, respectively, and attributes the increasing moisture share to the flour's water-absorbing capacity. Preserve these as study-specific observations only. They do not establish a recommended replacement level or hydration adjustment for the Québec dark-flour identity or for dark buckwheat flour as a category.

The study defines its named commercial sample as flour milled from peeled buckwheat grain after hydrothermal steam processing. That source-specific preparation is not established as equivalent to the locally named Québec `farine grise de sarrasin` product, and it is not a general process specification. The finding must state that boundary directly. Do not research brand variants or create an active rule, recipe-line link, substitution ratio, or general home-baking advice.

The online search below found formula-specific evidence but no transferable dark/gray-buckwheat-flour replacement guidance. The schema lists `researched_no_supported_substitute` and `blocked_pending_evidence` as separate states; A6 precedents R749 and R740 use the blocked state when an experimental flour or formula cannot be matched to the catalog row. Use record-level `blocked_pending_evidence` here because the study reports a replacement ratio for its own named sample and formula while equivalence to the catalog identity remains unresolved. The individual study finding is also `blocked_pending_evidence`. The unresolved question is evidence transfer to the row, not whether the paper reports a formula result. Keep the claim source-scoped until evidence establishes whether that flour class transfers.

The study is not measurement evidence for RecipeBook. Its reported dough moisture, flour-moisture percentage, flour-replacement amounts, and baked-product mass/volume measures do not pair a kitchen volume with flour mass or report a transferable flour density. Keep `measurementState: researched_no_supported_value`, `defaultDensity: null`, and `unitMappings: []`; add no measurement observation.

## Scope and naming boundary

This review concerns one generic milling class in the open A6 grain-flour work. It does not pursue a brand, product-line, flavour-family, SKU, retailer-variant, or cultivar roster; commercial-product counts do not add ingredient diversity. Preserve every existing branded reference and keep all source-specific claims attached to their source.

Keep the active names `dark buckwheat flour` and `farine grise de sarrasin` unchanged, with no aliases. In particular, do not add `farine de sarrasin foncée`, `whole buckwheat flour`, `light buckwheat flour`, `green buckwheat flour`, `buckwheat meal`, or process words as aliases. R161 records those as distinct, source-specific or unresolved boundaries. The new paper does not attest Québec French terminology and does not change identity status.

## Current ownership and source audit

Read-only audit of the current repository snapshot on 2026-10-19:

| Store | Current state | R990 boundary |
|---|---|---|
| Ingredient references | 2,005 active references. `ingredient-ref-dark-buckwheat-flour` is the only reference containing either exact target display phrase: `dark buckwheat flour / farine grise de sarrasin`. It is category `FLOUR_AND_STARCH`, with empty aliases, null density, and empty unit mappings. Nearby rows remain separate: generic, light, whole, sprouted, and Tartary buckwheat flour. | Keep all reference rows and their exact names/aliases unchanged. No merge or new identity. |
| Ingredient forms | 205 forms; none has a buckwheat/sarrasin label or match term. | Add no form. |
| Legacy import identities | 55 candidates; none owns the dark-flour ID or exact English/French names. | Add no legacy identity. |
| Research ledger | 2,411 records. The dark-flour record is `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; it has no measurement observations or substitution findings. The proposed source ID, URL, and finding ID are unused. | Append the single source and blocked finding below. Keep identity and measurement states unchanged. |
| Existing substitution and package data | No global or contextual substitution rules are present. No package-yield row belongs to the dark-flour reference. | Add no rule, yield, or recipe-line substitution. |
| Existing naming sources | R161 source IDs `WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S01` and `-S02` own the current English and Québec French product wording. Existing OQLF source `WP02-S31` supports the generic `buckwheat flour / farine de sarrasin` pair only. | Reuse these records only for the current name boundary; do not duplicate them or use them to generalize the study result. |

The study URL and DOI do not occur in the current ledger or proposal/batch archive. The online-search page URLs also have no current ledger owners; register only the Bondarenko study as a new ledger source, and keep the other pages as this proposal's search audit. Generic buckwheat substitution research in R758 concerns `ingredient-ref-buckwheat-flour` and a different whole-flour bread study; its results remain on that generic row. No R758 source or result is transferred here.

## Recipe-demand scan

The current bundled manifest lists **114 recipe files**. A read-only scan covered every manifest-listed JSON file, all **1,123 structured ingredient rows**, and every string field in the full recipe JSON. Exact case-insensitive search terms were `ingredient-ref-dark-buckwheat-flour`, `dark buckwheat flour`, `dark buckwheat`, `gray buckwheat flour`, `grey buckwheat flour`, `farine grise de sarrasin`, `farine grise du sarrasin`, `farine grise sarrasin`, `buckwheat flour`, `farine de sarrasin`, and `sarrasin noir`. There were **zero** target-ID references, ingredient-row matches, or full-text matches. No recipe link or recipe edit is supported.

## Evidence and limits

### Online substitution-evidence search

On 2026-10-19, the bounded search used these exact queries:

1. `"dark buckwheat flour" substitution baking study`
2. `"dark buckwheat flour" wheat flour replacement formula`
3. `"gray buckwheat flour" bread substitution study`
4. `"farine grise de sarrasin" substitution recette`

The reviewed pages and their relevance are:

| Page reviewed | Type and locator | Result for this generic identity |
|---|---|---|
| [Bondarenko et al., “Study of the influence of buckwheat flour and flax seeds on consumption properties of long-stored bakery products”](https://media.neliti.com/media/publications/297414-study-of-the-influence-of-buckwheat-flou-3edb0c2f.pdf) | Primary study PDF; §2, Table 1, Table 3, and conclusion, journal pp. 9–16. | Directly tests one hydrothermally processed, peeled-grain sample at 15%, 20%, and 25% wheat-flour-mass replacement in the study's bread-for-rusks formula. It does not show that this preparation is equivalent to the Québec product or establish a category-level rule. Keep as the source-scoped finding below. |
| [Psodorov et al., “Determining the content of wheat and buckwheat flour in bread using GC-MS system and multivariate analysis”](https://www.researchgate.net/publication/277609927_Determining_the_content_of_wheat_and_buckwheat_flour_in_bread_using_GC-MS_system_and_multivariate_analysis) | Primary short communication; introduction and Materials and Methods, pp. 179–181. | Uses a named commercial dark-flour sample in experimental breads at 0–100% mass levels to validate an analytical method for estimating flour content. This is a sample-specific analytical series, not replacement advice; its sample cannot be generalized to the catalog class. No commercial roster was researched. |
| [Filipčev et al., “Impact of buckwheat flour granulation and supplementation level on the quality of composite wheat/buckwheat ginger-nut-type biscuits”](https://www.itjfs.com/index.php/ijfs/article/download/13/pdf_3/1717) | Primary study PDF; pp. 496–498, Materials and Methods, and conclusion on p. 503. | Tests wholegrain flour described by coarse/fine granulation at 30%, 40%, and 50% in one ginger-nut biscuit formula. It does not identify a dark/gray flour class and cannot supply a rule for this identity. |
| [Good Food Cooking School, “Whole-Grain, Gluten-Free Flours Guide”](https://cdn.goodfoodcookingschool.com/2022/03/03145031/GlutenFreeFloursGuide.pdf) | Secondary cooking guide PDF; buckwheat flour section, p. 7. | Describes dark flour as unhulled and suggests teff for dark color in a blend, without an amount or like-for-like substitution method. This is qualitative color advice for a blend, not evidence for a reusable ingredient replacement. |
| [Iowa State University Extension AnswerLine, “Meet the Flours – Non-Wheat Flours”](https://blogs.extension.iastate.edu/answerline/2021/12/07/meet-the-flours-alternative-flours/) | Extension article; grain-based gluten-free flour table, lines 23–30. | Gives a generic buckwheat suggestion to replace one quarter of flour in combination, but does not distinguish dark/gray from other buckwheat flour or specify a matching flour state. Do not assign that statement to this identity. |

Across these queries and pages, no other reviewed source established a replacement amount, matching role, or adjustment that transfers to the catalog's dark/gray buckwheat flour. The exact study result remains useful only as evidence for its named sample and formula. The schema permits a finding with `researchState: blocked_pending_evidence` and no `replacements`; prior A6 records use that state when an experimental flour or formulation cannot be matched to the active identity. The record-level state stays blocked for the same unresolved applicability. Do not mark the finding `researched_supported`, do not create `replacements`, and do not add an active global or contextual rule.

### Independent research-state assessment

| Dimension | Current state | R990 assessment and disposition |
|---|---|---|
| Identity and names | Identity is `verified`; current displays are `dark buckwheat flour / farine grise de sarrasin`. | Retain identity, names, aliases, and reference data unchanged. The study does not establish Québec naming or identity equivalence. |
| Measurement and density | `measurementState: researched_no_supported_value`; `defaultDensity: null`; `unitMappings: []`; no target observations. | Keep this state. No reviewed source pairs a household volume with flour mass or reports a transferable flour density; dough moisture, formula mass replacement, and baked-product volume do not create a kitchen measure. |
| Same-ingredient form conversion | No target form, global conversion, or package yield. | No same-ingredient conversion or yield is supported. |
| Contextual ingredient substitution | Current record is `researched_no_supported_substitute`, with no findings or active rules. | On integration, change record state to `blocked_pending_evidence` and append one study-specific `blocked_pending_evidence` finding. The source's named sample and rusk-oriented bread formula cannot yet be mapped to this catalog identity; no replacement pair or reusable rule is supported. |
| Recipe-line substitution | Zero target-ID or name matches across the 114-recipe corpus. | Add no recipe link or substitution annotation. |

### Source ownership and supported claims

| Source ID | Source type, URL, and locator | Supports | Limits |
|---|---|---|---|
| **Proposed `WP02-A6-DARK-BUCKWHEAT-SUB-R990-20261019-S01`** | Bondarenko et al., “Study of the influence of buckwheat flour and flax seeds on consumption properties of long-stored bakery products,” *EUREKA: Life Sciences* (2019), no. 4, DOI [10.21303/2504-5695.2019.00973](https://doi.org/10.21303/2504-5695.2019.00973); [full-text PDF](https://media.neliti.com/media/publications/297414-study-of-the-influence-of-buckwheat-flou-3edb0c2f.pdf). Primary food-science study; proposed `sourceKind: other` because the ledger enum has no primary-study value. Locator: abstract; §2, Table 1, and the dark-flour process description (journal pp. 9–12); §3 and Table 3 (pp. 13–14); conclusion (p. 16). | Describes one named commercial dark-buckwheat-flour sample made from peeled grain after hydrothermal steam processing. In one yeast-leavened wheat-bread base formula, it tests 15%, 20%, and 25% replacement of wheat-flour mass. The article reports lower bread volume and porosity at 20% and 25% and identifies 15% as the maximum within this rusk-oriented formula. | One named sample and one preparation; no equivalence to the Québec product in R161, no general dark-flour process standard, and no validated replacement amount for other recipes. The reported percentages, dough-moisture shares, sample moisture, and outcome are not transferable to the active product or to the dark-flour category. No cup measure or flour density is reported. |
| **Existing `WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S01`** | Aliments Trigone, [English product catalogue](https://en.alimentstrigone.com/collections/all); current R161 owner. Locator: dark buckwheat flour T60 listing and Québec business address. | Owns the English wording used by the existing identity. | A local product listing; the package sizes and product description do not validate the study formula or establish a transferable flour class. |
| **Existing `WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S02`** | Aliments Trigone / Horizon Nature, [French buckwheat catalogue](https://alimentstrigone.com/collections/sarrasin-noir-biologique); current R161 owner. Locator: `farine grise de sarrasin` listings and separately named pale and whole flours. | Owns the current Québec French display and adjacent product boundaries. | Supports naming only; it does not report the study's hydrothermal process or recipe trial. |
| **Existing `WP02-S31`** | OQLF, [farine de sarrasin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin); current source owner on the buckwheat records. Locator: preferred term and English translation. | Supports the generic base pair `farine de sarrasin / buckwheat flour`. | Does not attest `farine grise de sarrasin` or support any recipe claim. Reuse only for the existing generic naming boundary. |

## Proposed minimal ledger delta

This proposal modifies only the existing ledger record if accepted. Preserve the active ingredient reference, all R161 naming sources and decisions, and the current measurement state. Append one source, one blocked finding, and one decision:

```json
{
  "recordId": "ingredient-ref-dark-buckwheat-flour",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-DARK-BUCKWHEAT-SUB-R990-20261019-S01",
      "url": "https://media.neliti.com/media/publications/297414-study-of-the-influence-of-buckwheat-flou-3edb0c2f.pdf",
      "title": "Bondarenko et al., Study of the influence of buckwheat flour and flax seeds on consumption properties of long-stored bakery products",
      "versionOrDate": "EUREKA: Life Sciences (2019), no. 4; DOI 10.21303/2504-5695.2019.00973",
      "accessedOn": "2026-10-19",
      "locator": "Abstract; §2, Table 1, and dark-flour process description (journal pp. 9–12); §3 and Table 3 (pp. 13–14); conclusion (p. 16).",
      "supports": "A primary study describes one dark-buckwheat-flour preparation from peeled grain after hydrothermal steam processing and tests it at 15%, 20%, and 25% replacement of wheat-flour mass in one yeast-leavened bread formula intended for rusk production. Within that formula, the paper identifies 15% as the maximum level and reports lower volume and porosity at 20% and 25%. Keep all amounts and results study-specific; the paper does not establish equivalence to the Québec product or a general substitution level.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "dark-buckwheat-flour-rusk-trial-replacement-r990-20261019",
      "researchState": "blocked_pending_evidence",
      "context": "One study's hydrothermally processed dark-buckwheat-flour sample replacing wheat-flour mass in its yeast-leavened bread formula for rusk production.",
      "basis": "The study tested 15%, 20%, and 25% replacement. It reports lower bread volume and porosity for the 20% and 25% dark-flour treatments and concludes that 15% was the maximum amount for its tested product. Dough moisture share varied with the flour blend. This records only that paper's named commercial sample and formula.",
      "limitations": [
        "The study's process and sample are not established as equivalent to the Québec `farine grise de sarrasin` product owned by this reference.",
        "The results do not establish a recommended percentage, upper limit, hydration adjustment, or substitution rule for dark buckwheat flour as a category or for other recipes.",
        "The replacement percentages and dough-moisture shares are formula-specific evidence, not ingredient measures, density observations, or unit mappings.",
        "No matching bundled recipe provides a recipe role, amount, or method for a recipe-specific link."
      ],
      "sourceIds": ["WP02-A6-DARK-BUCKWHEAT-SUB-R990-20261019-S01"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record the 2019 rusk-oriented bread trial as a source-scoped finding only. Keep the active dark buckwheat flour identity, bilingual display, empty aliases, and measurement state unchanged. Mark substitution research blocked because the study's sample/process is not transferable to the Québec product and its one formula does not support a reusable rule. Add no active substitution, measure, density, mapping, form, recipe link, or yield.",
      "sourceIds": ["WP02-A6-DARK-BUCKWHEAT-SUB-R990-20261019-S01"]
    }
  ]
}
```

Do not add `fromIngredientRefId`, `replacements`, a global or contextual rule, a recipe-line link, any new alias, or measurement observation. The broader A6 review remains open.

No build or tests were run because this is a proposal-only change.

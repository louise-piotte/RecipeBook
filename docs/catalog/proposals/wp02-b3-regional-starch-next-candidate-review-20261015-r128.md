# WP02 Section 04 B3 R128 — native buckwheat starch identity review

- **Reviewed:** 2026-10-15.
- **Status:** Accepted identity-only addition integrated; see the [R128 batch README](../batches/wp02-b3-native-buckwheat-starch-identity-integration-r128-20261015/README.md).
- **Checklist reference:** WP02 Section 04 B3, under “B Alternative flours starches and regional starch products”: `[ ] Water-chestnut flour and other documented regional starches.` The water-chestnut decision is closed; this review selects a different, previously unallocated starch candidate.
- **Scope:** Native buckwheat starch used as a food ingredient, including the starch sediment used for Korean *memilmuk*. This does not reopen buckwheat flour, meal, flakes, groats, noodles, modified buckwheat starch, or any recently reviewed B3 candidate.
- **Proposal-local source-ID prefix:** `WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S`. Checked against the active research ledger and WP02 proposal/batch archive before drafting; no collision found.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **native buckwheat starch / amidon de sarrasin natif**. Use the exact native-qualified English name from the Canadian patent application. The French display is supported by the exact compound in a French-language patent publication, OQLF’s preferred `sarrasin`, and OQLF’s current preferred general term `amidon` for starch. Keep it provisional because no current Québec package label or product-specific OQLF headword was found.

Add no aliases. The English and French canonical names already let the picker match the shorter complete phrases `buckwheat starch` and `amidon de sarrasin`. Do not add `buckwheat flour`, `farine de sarrasin`, `blé noir`, `fécule de sarrasin`, `buckwheat starch powder`, or *memilmuk* as aliases. The first two belong to flour, the first is not the plant’s OQLF preferred French term, and the remaining terms were not established as labels for this isolated starch product; *memilmuk* is the finished jelly.

Keep density null, unit mappings empty, and forms, package yields, conversions, recipe links, and active substitution rules absent. Record no general culinary substitute. The Canadian patent discusses native starch in cereal-dough formulations, including a flour-replacement use, but its process and dough-specific composition do not provide a transferable home-cooking ratio. The Korean study adds mung-bean starch to buckwheat jelly formulations to change sensory properties; it does not establish a general replacement.

### Proposed reference delta

```json
{
  "id": "ingredient-ref-native-buckwheat-starch",
  "nameEn": "native buckwheat starch",
  "nameFr": "amidon de sarrasin natif",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

### Proposed research-ledger delta

Add `ingredient-ref-native-buckwheat-starch` as one `ingredient_reference` record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Attach sources S01–S09 and the bounded no-general-substitute finding below. Add no measurement observations or unit conversions. The substitution state is scoped to a general kitchen replacement; retain the patent and jelly-study limitations in the ledger rather than activating a runtime rule.

```json
{
  "recordId": "ingredient-ref-native-buckwheat-starch",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S01",
      "url": "https://encykorea.aks.ac.kr/Article/E0068021",
      "title": "Academy of Korean Studies, Encyclopedia of Korean Culture: 메밀묵 (memilmuk)",
      "accessedOn": "2026-10-15",
      "locator": "Definition and preparation method for buckwheat muk.",
      "supports": "Describes a traditional set jelly made from the settled starch fraction of ground buckwheat; the method soaks, grinds, filters, decants, and cooks the starch sediment. It does not specify a botanical species, starch purity, package, or amount.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S02",
      "url": "https://patents.google.com/patent/CA3110421A1/en",
      "title": "Roquette Frères, Canadian patent application CA3110421A1, Use of clean label native buckwheat starch",
      "accessedOn": "2026-10-15",
      "locator": "Description of native buckwheat-starch extraction, granular state, and food-formulation uses.",
      "supports": "Names native buckwheat starch and describes aqueous extraction from buckwheat flour or groats, separation from fibre and protein, drying, and cereal-dough applications. It is a patent application, not a current consumer product listing or kitchen conversion.",
      "sourceKind": "other",
      "versionOrDate": "Published 2020-03-19"
    },
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889520/sarrasin",
      "title": "Office québécois de la langue française, sarrasin (GDT)",
      "accessedOn": "2026-10-15",
      "locator": "Preferred French term and English translation.",
      "supports": "Pairs preferred Québec French sarrasin with English buckwheat.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Last updated 1982"
    },
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin",
      "title": "Office québécois de la langue française, farine de sarrasin (GDT)",
      "accessedOn": "2026-10-15",
      "locator": "Preferred Québec French flour name and English translation.",
      "supports": "Pairs farine de sarrasin with buckwheat flour, supporting the separate flour boundary; it does not name starch.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Last updated 1984"
    },
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S05",
      "url": "https://grainsduquebec.ca/nos-grains/sarrasin",
      "title": "Grains du Québec, Sarrasin",
      "accessedOn": "2026-10-15",
      "locator": "Current Québec production context and named food formats.",
      "supports": "Names whole grain, flakes, semolina, flour, and noodles as buckwheat food formats and reports 2025 Québec production; no starch product is listed.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S06",
      "url": "https://pmc.ncbi.nlm.nih.gov/articles/PMC6525693/",
      "title": "Sindhu, Devi, and Khatkar, Physicochemical, thermal and structural properties of heat moisture treated common buckwheat starches",
      "accessedOn": "2026-10-15",
      "locator": "Journal of Food Science and Technology 56 (2019), DOI 10.1007/s13197-019-03725-6; abstract and results.",
      "supports": "Studies isolated common-buckwheat starch and reports functional, pasting, structural, thermal, and gel-property changes under heat-moisture treatment.",
      "sourceKind": "other",
      "versionOrDate": "2019"
    },
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S07",
      "url": "https://doi.org/10.3390/foods10112860",
      "title": "Kwon, Ryu, and Ju, Sensory Attributes of Buckwheat Jelly (Memilmuk) with Mung Bean Starch Added to Improve Texture and Taste",
      "accessedOn": "2026-10-15",
      "locator": "Foods 10(11) (2021), article 2860; experimental jelly formulations.",
      "supports": "Evaluates buckwheat-jelly formulations with mung-bean-starch additions; this is not a general replacement comparison.",
      "sourceKind": "other",
      "versionOrDate": "2021"
    },
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S08",
      "url": "https://patents.google.com/patent/WO2021136728A1/fr",
      "title": "Roquette Frères, WIPO patent publication WO2021136728A1, Utilisation d'un mélange d'amidons dans un produit laitier",
      "accessedOn": "2026-10-15",
      "locator": "French abstract and description; exact phrase amidon de sarrasin natif.",
      "supports": "Provides French technical-language evidence for amidon de sarrasin natif and its use in a starch mixture for a dairy product; it does not establish Québec retail wording or a home-cooking substitution.",
      "sourceKind": "other",
      "versionOrDate": "Published 2021"
    },
    {
      "sourceId": "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S09",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon",
      "title": "Office québécois de la langue française, amidon (GDT)",
      "accessedOn": "2026-10-15",
      "locator": "Preferred term and note distinguishing amidon from fécule.",
      "supports": "The current GDT entry prefers amidon and says fécule is more specific to starch in plant tubers and underground organs. This supports amidon for buckwheat seed starch, but does not define a buckwheat-starch product name.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Last updated 2026"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [
    {
      "findingId": "ingredient-ref-native-buckwheat-starch-no-general-substitute-r128",
      "researchState": "researched_no_supported_substitute",
      "context": "General household replacement for native buckwheat starch in buckwheat jelly, baking, or sauce thickening.",
      "basis": "The Canadian patent discusses native buckwheat starch in cereal-dough formulations, including flour-replacement use, but does not provide a transferable household ratio. The Korean jelly study adds mung-bean starch to buckwheat-jelly formulations rather than establishing a general exchange.",
      "limitations": [
        "Do not generalize patent dough percentages to a home recipe or use them as an ingredient conversion.",
        "Do not treat the mung-bean-starch addition in one jelly study as a substitution rule.",
        "No recipe-specific use in the bundled library supports a contextual rule."
      ],
      "sourceIds": ["WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S02", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S07"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add a separate identity for native buckwheat starch. OQLF supports the preferred French noun amidon for this seed-derived starch; a French patent uses the exact compound amidon de sarrasin natif. Keep the display provisional because no current Québec package label was found. Source-specific industrial dough use and mung-bean additions to one Korean jelly study do not support a reusable kitchen substitute, density, or unit mapping.",
      "sourceIds": ["WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S01", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S02", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S03", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S04", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S05", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S06", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S07", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S08", "WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S09"]
    }
  ]
}
```

## Identity, names, and market boundary

The Academy of Korean Studies’ *Encyclopedia of Korean Culture* describes *memilmuk* as a set jelly made from buckwheat sediment. Its preparation soaks and grinds buckwheat, filters the slurry, decants the upper water, and cooks the settled buckwheat starch until thick; cooling sets the jelly. This is a direct traditional food use of buckwheat starch and distinguishes the ingredient from whole-grain buckwheat and flour. The source does not state a botanical species, starch purity, a dried retail product, or a reproducible amount. [S01]

Canadian application CA3110421A1 names **native buckwheat starch** as a food ingredient. It describes aqueous extraction from buckwheat flour or groats, separation of starch from fibre and protein fractions, and drying. The application states that the recovered starch is not gelatinized and remains granular. It presents uses in cereal-product dough, including biscuits. This supports the product identity and English name, but a patent application is not a current Canadian or Québec retail listing and does not establish consumer availability. [S02]

OQLF gives `sarrasin` as the preferred Québec French term corresponding to English `buckwheat`; its separate preferred flour name is `farine de sarrasin`. OQLF's 2026 `amidon` entry prefers that term for starch generally and reserves `fécule` more specifically for starch in tubers and underground plant parts. The French patent uses the exact compound `amidon de sarrasin natif`. Independent review accepts that as a provisional fr-CA display for buckwheat seed starch; no current Québec package label or product-specific OQLF entry was found. [S03–S04, S08–S09]

Grains du Québec reports current Québec buckwheat production and lists whole grain, flakes, semolina, flour, and noodles as food forms. The page supports local source-grain terminology and context; it does not identify a local buckwheat-starch product. A bounded search of Canadian and Québec-facing retail and food-sector sources found no current standalone package or exact Québec starch label. That search result does not establish that none is sold. [S05]

## Forms, numbers, and substitutions

- **Forms:** Add none. “Native” is part of the source-defined ingredient class; it is not a recipe preparation state. Sindhu et al. found that heat-moisture treatment changes common-buckwheat starch’s functional, pasting, structural, thermal, and gel properties. Do not turn that laboratory treatment into a form on this row or alias modified buckwheat starch to it. [S06]
- **Density and mappings:** None supported. The patent’s percent-of-dough formulations are industrial product formulas, not a household cup-to-mass pair or bulk-density measurement. The Korean encyclopedia gives no quantity. Keep `defaultDensity` null and `unitMappings` empty. [S01–S02]
- **Substitutions:** No reusable replacement is supported. The patent’s flour-replacement use is specific to its cereal dough and process. Kwon et al. studied mung-bean-starch additions to buckwheat jelly, not a general exchange of buckwheat and mung-bean starch. Do not add a rule or recipe-line substitution. [S02, S07]
- **Recipe demand:** None in the bundled corpus. The 114 recipe files and 1,123 ingredient rows contain no English/French candidate phrase or *memilmuk* text; no recipe link or relink is proposed.

## Catalog, picker, and archive audit

At the review snapshot, the split seed package contains 1,476 ingredient references and 107 forms. Exact-name/normalized-key review found no active reference or form for `ingredient-ref-native-buckwheat-starch`, `buckwheat starch`, `native buckwheat starch`, `amidon de sarrasin`, or `amidon de sarrasin natif`. The legacy import-identity list, ledger record IDs/names, and WP02 proposal/batch archive have no decision for native buckwheat starch. Related buckwheat identities and decisions remain separate: active buckwheat flour, sprouted buckwheat flour, Tartary buckwheat flour, flakes, groats, puffed buckwheat, and soba noodles; the ledger’s `candidate-buckwheat-meal` concerns an unresolved milling boundary, not starch. No source IDs in the proposal-local prefix were present before drafting.

`IngredientReferenceSearchIndex` in `IngredientSearch.kt` normalizes accents, punctuation, and spacing; it returns complete normalized word-phrase matches before falling back to substring matches. `IngredientPickerDialog` in `RecipeEditorScreen.kt` uses this index over reference names, aliases, and attached form terms. With the proposed canonical names and no aliases, the static projection is:

| Query | Current result(s) | With proposed row | Effect |
|---|---|---|---|
| `buckwheat starch` | None | Native buckwheat starch | Adds the direct English phrase. |
| `native buckwheat starch` | None | Native buckwheat starch | Adds the Canadian patent wording. |
| `amidon de sarrasin` | None | Native buckwheat starch | Adds the shorter French phrase contained in the canonical display. |
| `amidon de sarrasin natif` | None | Native buckwheat starch | Adds the proposed French display. |
| `buckwheat flour`; `farine de sarrasin` | Existing buckwheat, sprouted-buckwheat, and Tartary-buckwheat flour rows | Same rows | Flour searches remain on flour identities. |
| `blé noir` | None | None | No unsupported alias is introduced. |
| `buckwheat` | Nine buckwheat-related references | The same nine plus native buckwheat starch | Broad search gains the expected related ingredient. |
| `sarrasin` | Ten buckwheat-related references | The same ten plus native buckwheat starch | Broad search gains the expected related ingredient. |

The proposed names are unique at the exact normalized-key level. No form, legacy identity, or current catalog row becomes an unintended exact owner. Broad `buckwheat` and `sarrasin` searches already span the related grain/flour/noodle families; this one specific starch identity is an additional expected result, not a claim that those products are equivalent.

## Evidence register

Pages were checked online on 2026-10-15. These proposal-local source IDs are not ledger additions until the proposal is accepted.

| ID | Source and direct support | Limit |
|---|---|---|
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S01** | Academy of Korean Studies, [*Encyclopedia of Korean Culture*: 메밀묵 (*memilmuk*)](https://encykorea.aks.ac.kr/Article/E0068021). Defines buckwheat muk as a set food made from the settled starch fraction of ground buckwheat and describes the traditional extraction/cooking process. | Authoritative Korean cultural reference, not a Canadian product label; it does not specify species, starch purity, a packaged state, or quantities. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S02** | Canadian patent application CA3110421A1, Roquette Frères, [*Use of clean label native buckwheat starch*](https://patents.google.com/patent/CA3110421A1/en), published 2020-03-19. Names native buckwheat starch, describes its wet extraction and granular non-gelatinized state, and gives food-formulation uses. | A patent application and claimed industrial process, not proof of a product currently sold in Canada/Québec. Its formulation percentages do not establish a household measure or transferable flour-replacement ratio. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S03** | Office québécois de la langue française, [*sarrasin* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889520/sarrasin). Preferred French term paired with English `buckwheat`. | Names the plant/food source, not starch or a starch package. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S04** | Office québécois de la langue française, [*farine de sarrasin* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin). Preferred Québec French flour name paired with English `buckwheat flour`. | Supports the separate flour boundary; it does not name buckwheat starch. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S05** | Grains du Québec, [*Sarrasin*](https://grainsduquebec.ca/nos-grains/sarrasin). Current Québec grain-sector page names common food formats and reports 2025 Québec buckwheat production. | No starch form/package is listed; the page is not an exhaustive inventory of local products. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S06** | Sindhu, Devi, and Khatkar, [“Physicochemical, thermal and structural properties of heat moisture treated common buckwheat starches”](https://pmc.ncbi.nlm.nih.gov/articles/PMC6525693/), *Journal of Food Science and Technology* 56 (2019), DOI [10.1007/s13197-019-03725-6](https://doi.org/10.1007/s13197-019-03725-6). Studies isolated common-buckwheat starch and shows properties change under heat-moisture treatment. | Laboratory treatment and characterization; not a kitchen form, quantity, density, or product substitution. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S07** | Kwon, Ryu, and Ju, [“Sensory Attributes of Buckwheat Jelly (Memilmuk) with Mung Bean Starch Added to Improve Texture and Taste”](https://doi.org/10.3390/foods10112860), *Foods* 10(11) (2021), article 2860. Evaluates buckwheat jelly formulations with mung-bean-starch additions. | One experimental jelly formula; addition to change texture/taste does not establish general substitution or an exchange ratio. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S08** | Roquette Frères, [WIPO patent publication WO2021136728A1 (French)](https://patents.google.com/patent/WO2021136728A1/fr), *Utilisation d'un mélange d'amidons dans un produit laitier*. Uses the exact technical phrase `amidon de sarrasin natif` for buckwheat starch in a starch mixture. | Patent terminology and a dairy-product formulation, not Québec retail evidence or a household substitution. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S09** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), last updated 2026. Prefers `amidon` for starch generally and says `fécule` more specifically names starch in tubers or underground plant parts. | Supports the fr-CA noun for a seed-derived starch; it does not define the exact buckwheat-starch product phrase or establish a local package label. |

## Independent Québec terminology review

Accepted **`amidon de sarrasin natif`** as the provisional fr-CA display. OQLF's preferred general starch term `amidon`, preferred plant term `sarrasin`, and the exact phrase in the French patent support this construction. The name remains provisional because no current Québec package label or product-specific OQLF headword was found. No French alias or numeric behavior was added.

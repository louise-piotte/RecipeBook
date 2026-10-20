# WP02 Section 04 B2 — Kersting’s groundnut flour identity review (R103)

- **Reviewed:** 2026-10-14.
- **Status:** Integrated 2026-10-14; see [the batch record](../batches/wp02-b2-kerstings-groundnut-flour-identity-integration-20261014/README.md).
- **Checklist scope:** The open [Section 04 B2 alternative-flour item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1838) includes pulse flours. This review covers only flour made from Kersting’s groundnut (*Macrotyloma geocarpum*), not other WP02 candidates.
- **Source-ID prefix:** `WP02-B2-KERSTING-FLOUR-R103-20261014`. The IDs were proposal-local at review and were allocated to the accepted ledger record during integration.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference for **Kersting’s groundnut flour / farine de lentille de terre**. The French display is descriptive and provisional for Québec. Keep density, mappings, forms, recipe links, conversions, yields, and active substitutions empty.

## Identity boundary and naming

Kew accepts *Macrotyloma geocarpum* and lists *Kerstingiella geocarpa* as a synonym. PROTA’s French species profile names the food seed `lentille de terre` and says dry seeds are made into flour for cakes and other dishes. A food-use review and primary studies independently document the flour in porridge, cakes, steamed pastes, and composite flour products. Together they support a distinct human-food flour identity, separate from the live whole-pulse row. [S01–S05]

Keep the proposed flour separate from the active whole seed **Kersting’s groundnut / lentille de terre** (`ingredient-ref-kerstings-groundnut`). Also keep it separate from Bambara groundnut flour, peanut flour, *Macrotyloma uniflorum* (horse gram) flour, isolated starch, defatted flour, protein concentrates or isolates, and composite foods such as rice-cassava-Kersting flour blends. The reviewed studies use differing soaking, cooking, dehulling, drying, grinding, and sieving steps; those study methods do not establish standardized catalog forms. [S03–S07]

| Field | Proposed value | Evidence and limit |
|---|---|---|
| English display | **Kersting’s groundnut flour** | Source-used name for flour of the accepted *M. geocarpum* food seed. [S03–S06] |
| English alias | **Kersting groundnut flour** | Search spelling formed from the live whole-seed row’s source-attested alias `Kersting groundnut`, with the flour qualifier. It lets the unpunctuated query return both related identities under the current picker normalization. |
| English alias | **Kersting’s groundnut seed flour** | Source-attested phrase in the crop-use review and primary food study; retained as a flour-specific phrase. [S03–S04] |
| French display | **farine de lentille de terre** | Descriptive, provisional Québec construction from PROTA’s French name `lentille de terre` for this species. PROTA directly documents the dry-seed-to-flour use, but no OQLF flour headword or Québec flour package was found. [S02] |
| French aliases | None | Keep bare `lentille de terre` on the active whole-seed row; it is already contained in the proposed French display, so phrase search can show seed and flour without copying a seed-only alias. |
| Do not alias | `ground bean flour`, `groundnut flour`, `Kersting flour`, `farine de lentille`, `farine de pois de terre`, `farine de voandzou` | These are broad, incomplete, or unsupported as flour-specific names. In particular, `ground bean` and `lentille de terre` are already whole-pulse terms; only the source-supported complete flour names should identify the candidate. |

If integrated, the proposed reference is:

```json
{
  "id": "ingredient-ref-kerstings-groundnut-flour",
  "nameEn": "Kersting’s groundnut flour",
  "nameFr": "farine de lentille de terre",
  "aliasesEn": [
    "Kersting groundnut flour",
    "Kersting’s groundnut seed flour"
  ],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The French wording is descriptive and remains provisional; it is not presented as an OQLF decision or a Québec retail label.

## Existing ownership and archive review

At the audit snapshot, the live package contained **1,440 ingredient references** and **105 forms**; the research ledger contained **1,780 records**, and the legacy-import file contained **63 candidates**. The manifest listed **114 recipes**. The only active Kersting identity is `ingredient-ref-kerstings-groundnut`, displayed as `Kersting’s groundnut / lentille de terre`, with English aliases `Kersting groundnut` and `ground bean`, category `LEGUME_AND_PULSE`, null density, and empty unit mappings. It has no flour form. The live reference catalog also contains a separate Bambara groundnut flour row for *Vigna subterranea*; that is a different species and product. [S08]

Exact-name and ID scans across live references, forms, legacy candidates, ledger records, and the WP02 proposal/batch archive found no existing `ingredient-ref-kerstings-groundnut-flour` owner or earlier WP02 flour decision for *M. geocarpum*. The accepted whole-pulse review covers only the seed; it does not decide flour. The current R101–R102 B3 starch additions concern other plant species, and no source or ownership is shared with this B2 candidate. [S08–S09]

## Picker projection

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, and punctuation, prefers complete word-phrase matches, and falls back to substring matches only when there is no phrase match. I replayed those rules against the current reference terms and the proposed display and aliases:

| Query | Current result | With proposed identity | Effect |
|---|---|---|---|
| `Kersting’s groundnut` | Whole-seed Kersting row | Whole seed and proposed flour | The flour display contains the source-qualified seed name; both related choices appear. |
| `Kersting groundnut` | Whole-seed Kersting row | Whole seed and proposed flour | The proposed unpunctuated alias closes the current possessive-normalization gap without changing the whole-seed owner. |
| `groundnut flour` | Bambara groundnut flour | Bambara flour and proposed Kersting flour | Both species-qualified flour identities remain visible; the query is not narrowed to one groundnut species. |
| `farine de lentille de terre` | No result | Proposed flour only | Exact provisional French product phrase. |
| `lentille de terre` | Whole-seed Kersting row | Whole seed and proposed flour | The French seed phrase is contained in the flour display; no French alias is needed. |
| `groundnut` | Bambara beans, Bambara groundnut flour, Kersting whole seed, peanut oil | Those four plus proposed Kersting flour | Broad search gains one relevant product and retains all prior results. |
| `ground bean` | Whole-seed Kersting row | Whole-seed Kersting row | No broad `ground bean flour` alias is added. |
| `lentille` | Whole-seed Kersting row | Whole seed and proposed flour | The existing phrase-first behavior already returns the Kersting seed for this broad French query; the proposal adds the related flour but does not change the current matching rule. |
| `Kersting’s groundnut seed flour` | No result | Proposed flour only | Source-attested full flour phrase. |

The scientific taxon stays in the evidence, not as a picker alias. This keeps the row discoverable using its food name while preserving the live whole-pulse and Bambara identities.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files** and their **1,123 ingredient rows**, including full recipe text, line names, and ingredient-reference IDs. Searches covered `Kersting`, `Kersting groundnut flour`, `Kersting’s groundnut seed flour`, `ground bean flour`, `Macrotyloma geocarpum`, `Kerstingiella geocarpa`, `lentille de terre`, and the proposed French flour phrase. The scan found **zero candidate mentions, zero matching ingredient rows, and zero links to the whole-seed Kersting row**. There is no bundled recipe line to link, relink, or use to choose a flour process or measure.

## Measures, forms, and substitution evidence

- **Density and household measures:** No reviewed source establishes a reusable g/mL density, grams per cup or spoon, or household measure for plain Kersting flour. Awolu et al. report **0.805 g/cm³** for one optimized *composite* flour of 58% rice, 33% cassava, and 9% Kersting groundnut flour. That is not the density of the individual flour. Other functional-property measurements are tied to their own sample and method. Keep `defaultDensity` null and `unitMappings` empty. [S06–S07]
- **Forms and process:** Add no `IngredientForm`. Research distinguishes whole flour, chemically defatted flour, protein concentrate/isolate, and isolated starch; these are separate product/material scopes. Soaking, parboiling, dehulling, drying, and sieve size vary by study and are not established catalog-wide flour forms. Keep defatted flour and isolates outside this identity unless a later product-specific review supports them. [S04–S07]
- **Substitution:** A 2011 study uses dehulled Kersting seed flour at 10–40% in one maize-ogi weaning-food formula and discusses 30% within that study’s formulation. A 2015 optimized snack uses a 58:33:9 rice-cassava-Kersting composite blend. These are recipe/formulation-specific results, not general replacement ratios for maize, rice, cassava, wheat, or other flours. Add no global, contextual, or recipe-line substitution. [S04, S06]
- **Conversions, yields, and recipe links:** Add none. A study’s flour preparation, composite blend, lab bulk density, and isolated-starch yield do not establish reusable kitchen conversions or a culinary yield.

## Source register

Online sources were checked on **2026-10-14**. Publication dates are stated where the source provides them.

| Source ID | Source and direct link | Finding and limit |
|---|---|---|
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Macrotyloma geocarpum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:505864-1/general-information); current taxonomic backbone includes the 2026 World Checklist of Vascular Plants. | Accepts *M. geocarpum* and lists the older name *Kerstingiella geocarpa*. Taxonomy source, not a flour product standard. |
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S02** | PROTA, [*Macrotyloma geocarpum*](https://plantuse.plantnet.org/fr/Macrotyloma_geocarpum_%28PROTA%29), French crop profile, n.d.; accessed 2026-10-14. | Uses French `lentille de terre` and English `Kersting’s groundnut`; says dry seeds are transformed into flour for galettes and other foods. Does not name a Québec commercial product or prescribe a standardized flour process. |
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S03** | Mathieu Anatole Tele Ayenan and Vincent A. Ezin, [“Potential of Kersting’s groundnut (*Macrotyloma geocarpum*) and prospects for its promotion”](https://link.springer.com/article/10.1186/s40066-016-0058-4), *Agriculture & Food Security* 5, article 10, published 2016-07-01. | Review documents flour in porridge, cakes, steamed pastes, and composite foods. Useful food-use synthesis; not a Canadian retail specification. |
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S04** | M. O. Aremu et al., [“Development and Nutritional Quality Evaluation of Kersting’s Groundnut-Ogi for African Weaning Diet”](https://scialert.net/fulltext/?doi=ajft.2011.1021.1033), *American Journal of Food Technology* 6 (2011), pp. 1021–1033; published 2011-12-12. | Primary study prepares dehulled seed flour and tests it in a maize-ogi formula; methods use a 0.25 mm screen and formula substitution levels of 10, 20, 30, and 40%. This is not a milling standard or transferable substitute rule. |
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S05** | A. V. Ikujenlola, O. R. Osungbade, and S. O. Gbadamosi, [“Bioactive and chemical properties of Kersting’s groundnut proteins”](https://doi.org/10.1016/j.fhfh.2021.100043), *Food Hydrocolloids for Health* 2, 100043 (2022). | Primary research distinguishes whole flour, defatted flour, protein concentrate, isolate, and hydrolysates from dried seed. It supports the product boundary; the laboratory products and process do not set catalog forms or household measures. |
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S06** | O. O. Awolu et al., [“Optimization of the extrusion process for the production of ready-to-eat snack from rice, cassava and Kersting’s groundnut composite flours”](https://doi.org/10.1016/j.lwt.2015.05.025), *LWT - Food Science and Technology* 64(1) (2015), pp. 18–24; bibliographic record and abstract at [FAO AGRIS](https://agris.fao.org/search/fr/records/65df66956eef00c2cea2a221). | Primary composite-snack study reports an optimized 58:33:9 rice-cassava-Kersting blend and 0.805 g/cm³ bulk density for the blend. Neither value describes pure Kersting flour or a household volume measure. |
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S07** | A. F. Akinsola and E. T. Akintayo, [“Chemical Composition, Functional and Pasting Properties of Kersting’s Groundnut (*Kerstingiella geocarpa*) Flour and Starch”](https://iiste.org/Journals/index.php/FSQM/article/view/58747), *Food Science and Quality Management* 115 (2022); published 2022-05-31. | Primary study treats flour and isolated seed starch as separate materials and reports a study-specific 34% starch yield. Supports keeping the proposed flour separate from starch; yield is not a recipe conversion or household extraction yield. |
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S08** | Current live package: [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json), and [`research-ledger.v1.json`](../research-ledger.v1.json). | Snapshot ownership audit for the active whole seed, forms, legacy candidates, ledger records, and proposed ID. Repository evidence only. |
| **WP02-B2-KERSTING-FLOUR-R103-20261014-S09** | Earlier [WP03 regional-pulse identity review](wp03-h-regional-pulses-urd-cowpea-lupini-review-20261011.md) and [WP02 Bambara-flour integration review](wp02-next-a-b-flour-review-r74-20261013.md). | Confirms the whole-seed `Kersting groundnut` alias and distinguishes the already integrated *Vigna subterranea* Bambara flour. Neither allocates *M. geocarpum* flour. |

## Static review record

Read current `AGENTS.md`, `Requirements.md`, the open B2 checklist, the current roadmap state, relevant WP02 proposals/batches, active references/forms/legacy/ledger, and the bundled recipe corpus. Checked the exact candidate ID and names across those ownership sources; no current flour owner or previous WP02 flour decision was found. Simulated current and proposed picker results with the `IngredientSearch.kt` phrase-first rules and scanned the full recipe bundle as described above. Verified the proposal has a unique source-ID prefix, UTF-8 without BOM, a final newline, no trailing whitespace, and valid local and HTTPS links. `git diff --check -- docs/catalog/proposals/wp02-next-specialty-flour-starch-gap-review-r103-20261014.md` passed.

No app tests, Gradle tasks, instrumentation, emulator checks, or deployment were run for the database-JSON-only integration.

This proposal covers one B2 flour identity only. The rest of Section 04 B2/B3 remains open.

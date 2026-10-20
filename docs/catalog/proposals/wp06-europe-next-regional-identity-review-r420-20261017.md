# WP06 Europe — Traditional Balsamic Vinegar of Modena PDO identity review (R420)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review creates only this proposal file; it does not change shared catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Snapshot:** Ownership, picker behavior, and corpus results below describe the workspace read on 2026-10-17.
- **Scope:** One Italian regional condiment identity: **Aceto balsamico tradizionale di Modena DOP**. Keep the Modena PDO separate from generic balsamic vinegar, the Modena PGI, and the distinct Reggio Emilia PDO.
- **Source-ID prefix:** `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017`. The proposed reference ID, prefix, source URLs, and target path were checked for collisions.

## Recommendation

If accepted, add one identity-only `SAUCE_AND_CONDIMENT` reference for **`vinaigre balsamique traditionnel de Modène AOP / Traditional balsamic vinegar of Modena DOP`**. The Italian Ministry of Agriculture's currently listed production specification restricts the PDO name to a product made from specified grapes grown in the province of Modena, using cooked grape must and the prescribed fermentation and barrel-aging process. The specification requires at least 12 years of maturation and aging, and requires production, aging, and bottling in Modena. [S01–S02]

Current Canadian Costco product pages provide the same product title in French and English for a certified 25-year PDO item. These titles support Québec-facing display wording; they do not establish a universal cooking quantity or a generic definition. [S05–S06] OQLF supports the underlying Québec French and English terms `vinaigre balsamique / balsamic vinegar` and notes the distinction between industrial and traditional balsamic vinegar. Reuse the existing OQLF source rather than adding it again. [S07]

The existing `ingredient-ref-balsamic-vinegar` already represents the unqualified product class. Its accepted ledger decision explicitly leaves protected and regional subtypes outside that generic row. R420 proposes one such subtype within the Modena PDO boundary; it does not reopen or change the generic identity. [S07; existing ledger record]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-traditional-balsamic-vinegar-of-modena",
  "nameFr": "vinaigre balsamique traditionnel de Modène AOP",
  "nameEn": "Traditional balsamic vinegar of Modena DOP",
  "aliasesFr": ["vinaigre balsamique traditionnel de Modène DOP"],
  "aliasesEn": ["Aceto balsamico tradizionale di Modena"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "SAUCE_AND_CONDIMENT"
}
```

Use the exact Italian PDO designation as the sole English search alias. Do not add `balsamic vinegar`, `vinaigre balsamique`, `traditional balsamic vinegar`, `aceto balsamico`, `Aceto Balsamico di Modena`, `Modena balsamic vinegar`, `balsamic glaze`, or `balsamic reduction` as aliases. The generic terms already belong to the broader balsamic identity, the unqualified “traditional” wording can also point to Reggio Emilia, and the plain Modena name can refer to a different protected product. [S01–S04, S07]

## Product and naming boundaries

The Italian Ministry's listed production specification reserves **Aceto balsamico tradizionale di Modena** for products meeting its PDO requirements. It describes grape must from specified grape varieties grown in the traditional territory of Modena; cooking of the must; alcoholic and acetic fermentation; successive transfers through marked casks of different sizes and local wood types; and at least 12 years of maturation, aging, and refinement. It allows the label `extra vecchio` for qualifying product aged at least 25 years. This age wording is a permitted qualification, not a separate ingredient identity or alias. [S01–S03]

Keep adjacent products separate:

- **`ingredient-ref-balsamic-vinegar` / `balsamic vinegar / vinaigre balsamique`:** the existing broad identity remains unchanged. Generic searches should continue to offer it alongside the Modena PDO row.
- **`Aceto Balsamico di Modena` PGI:** this is a separate protected name. The European Commission's 2023 amendment decision explicitly describes the PGI and Traditional Balsamic Vinegar of Modena PDO as distinct products made from different raw materials and by different production methods. Do not add the PGI name as an alias here. [S04]
- **Traditional Balsamic Vinegar of Reggio Emilia PDO:** the Italian Ministry's specification index lists it separately from the Modena PDO. Do not make one Modena identity stand in for Reggio Emilia or add `traditional balsamic vinegar` as an unqualified alias. [S01]
- **Glazes, reductions, creams, flavored balsamic products, and condiments containing balsamic vinegar:** retain their prepared-product boundaries; do not merge them into this PDO.

The category, naming, and general regional coverage remain open in the [WP06 Europe plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L9004). The integrated R417 Roquefort identity is unrelated and remains unchanged.

## Live ownership and archive audit

Read-only workspace snapshot checked on 2026-10-17:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,719 | No exact owner for the Italian PDO name, the proposed bilingual titles, or `ingredient-ref-traditional-balsamic-vinegar-of-modena`. The nearby `ingredient-ref-balsamic-vinegar` row remains generic and has no regional or traditional alias. |
| Ingredient forms | 141 | No balsamic, Modena, PDO, or candidate-specific form label or match term. |
| Legacy import candidates | 56 | No candidate for the Modena traditional PDO or proposed reference ID. The existing generic balsamic row is already active. |
| Research ledger | 2,078 records; 9,411 source entries; 8 unit conversions | No Modena traditional-PDO identity record, R420 source-prefix collision, or collision for the new source URLs below. The current generic balsamic record has three sources and says to keep protected/regional subtypes outside that unqualified row. Reuse its OQLF source `WP05-VINEGAR-INT-20261012-S06`; do not duplicate it. |
| Active substitution and package-yield data | 0 global rules; 0 contextual rules; 1 package yield | No candidate-related substitution, unit conversion, or yield. The single package yield is for canned black beans. |
| Proposal and batch archive | 2,725 Markdown files | A phrase, proposed-ID, source-prefix, and target-path scan found no dedicated Modena traditional-vinegar review or allocation. The generic vinegar review is the prior boundary decision, not a review of this PDO. |

The audited live inputs include the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). The existing [generic balsamic record](../research-ledger.v1.json#L25383) and [vinegar identity review](wp05-section-v-vinegar-acid-gap-review-20261012.md) document the current owner and boundary. All six new source URLs and the proposed source prefix were absent from the ledger; the existing OQLF source is deliberately reused under its current source ID. The target proposal path and candidate ID were unallocated.

## Phrase-first picker projection

The projection follows the accent-, punctuation-, and case-folding phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It includes the proposed bilingual titles and Italian alias above.

| Query | Current result | With proposed row |
|---|---|---|
| `Aceto balsamico tradizionale di Modena` | No result | `ingredient-ref-traditional-balsamic-vinegar-of-modena` only |
| `Traditional balsamic vinegar of Modena DOP`; `vinaigre balsamique traditionnel de Modène AOP`; `vinaigre balsamique traditionnel de Modène DOP` | No result | The proposed row only |
| `balsamic vinegar`; `vinaigre balsamique`; `balsamic` | `ingredient-ref-balsamic-vinegar` only | The generic row plus the Modena PDO row |
| `balsamic vinegar of Modena` | No result | The proposed row only; its visible name retains the `traditional` and `DOP` qualifiers |
| `Modena`; `Modène` | No result | The proposed row only |
| `Aceto Balsamico di Modena` | No result | No result; the separate PGI name is not an alias |
| `traditional balsamic vinegar`; `traditional balsamic` | No result | The Modena PDO row; no Reggio Emilia row is currently modeled, so the visible Modena qualifier must be retained |

The common generic phrases `balsamic vinegar` and `vinaigre balsamique` intentionally return both the generic row and the regional PDO row. Do not add broad aliases that would make the PDO row appear to own all balsamic vinegar. The explicit `Aceto Balsamico di Modena` PGI query remains unallocated.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan checked each full decoded recipe document and its ingredient rows for the official Italian name and spelling variants, the proposed bilingual names, the Modena PDO and PGI phrases, generic balsamic-vinegar wording, and the proposed reference ID. It found **zero matching recipe files, zero matching ingredient rows, and zero recipe links**. No bundled amount, form, or recipe-specific substitution supports this candidate.

The manifest-order corpus contains **753,988 bytes** and fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative path, a NUL byte, the lowercase SHA-256 digest of that recipe file, and a newline, then hashes the concatenated bytes.

## Forms, measurements, and substitutions

The PDO specification gives a minimum analytical density of **1.240 at 20 °C** and allows specified 10, 20, or 40 cL containers; Costco's current 25-year SKU is packaged in 100 mL. These are an analytical threshold and protected-product/SKU packaging details, not a measured representative density, kitchen-volume conversion, recipe amount, or package yield. Do not use `1.240` as `defaultDensity`; it is a specification minimum, not a sample value. [S02–S03, S05–S06]

If integrated, keep `forms` empty, `defaultDensity` null, and `unitMappings` empty. Add no measurement observation, package-yield rule, conversion, or recipe link. The identity review supports `measurementState: researched_no_supported_value` if a ledger record is created. The Consortium's use guidance and the retailer's serving suggestions do not establish a tested substitute or a recipe-context rule. Add no global or contextual substitution, inverse rule, or recipe-line link; leave substitution research at `not_yet_researched` until recipe-specific evidence supports a focused review. [S03, S05–S06]

## Source register

Sources were accessed on 2026-10-17. The six new source IDs and URLs were checked against the live ledger; the existing OQLF source remains under its existing ID.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017-S01` | Italian Ministry of Agriculture, Food Sovereignty and Forests (MASAF), [DOP/IGP product-specification index](https://www.masaf.gov.it/flex/cm/pages/ServeBLOB.php/L/IT/IDPagina/3345), section 1.8, accessed 2026-10-17. | Current ministry index lists separate product-specification documents for `Aceto Balsamico Tradizionale di Modena DOP`, `Aceto Balsamico Tradizionale di Reggio Emilia DOP`, and `Aceto Balsamico di Modena`. Supports their separate official catalog entries; the linked Modena PDF supplies the production requirements. |
| `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017-S02` | MASAF, [production specification for Aceto balsamico tradizionale di Modena](https://www.masaf.gov.it/flex/cm/pages/ServeAttachment.php/L/IT/D/3%252F7%252F2%252FD.1177bd227185c4fa4790/P/BLOB:ID=3345/E/pdf?mode=download), Articles 1–8; published 2000 and currently listed by MASAF, accessed 2026-10-17. | Primary product-boundary source for the protected name, province of origin, grape must, process, 12-year minimum, analytical characteristics, bottling, permitted package sizes, and label rules. The density figure is a minimum analytical threshold; container capacities are regulated packages, not kitchen measures. |
| `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017-S03` | Consorzio Tutela Aceto Balsamico Tradizionale di Modena, [English product specifications](https://www.balsamicotradizionale.it/en/the-product-specifications/), Articles 5–8, accessed 2026-10-17. | Current English-language copy of the PDO specification confirms the English product title, Modena production/aging/bottling boundary, minimum 12 years, permitted `Extra Vecchio` wording, density threshold, packaging, and label rules. The national specification remains the primary legal text. |
| `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017-S04` | European Commission, [Implementing Regulation (EU) 2023/512](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32023R0512), recital 14, in force; accessed 2026-10-17. | States that the Modena PGI and Traditional Balsamic Vinegar of Modena PDO use different raw materials and production methods and remain distinct. This is a comparison source for the PGI amendment, not the PDO specification. |
| `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017-S05` | Costco Canada, [French product page — Andrea Milano, Vinaigre balsamique traditionnel de Modène DOP, 25 ans, 100 ml](https://www.costco.ca/p/-/andrea-milano-traditional-balsamic-vinegar-of-modena-dop-25-years-100-ml/4000412941?langId=-25), item 2000414, accessed 2026-10-17. | Current Canadian French product title uses DOP and the French product details also use AOP for the same certified 25-year SKU; use AOP for the French display and retain the qualified DOP wording as an alias. The 100 mL volume is this package's size, not a reusable recipe measure or universal package yield. |
| `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017-S06` | Costco Canada, [English product page — Andrea Milano Traditional Balsamic Vinegar of Modena DOP, 25 Years, 100 ml](https://www.costco.ca/p/-/andrea-milano-traditional-balsamic-vinegar-of-modena-dop-25-years-100-ml/4000412941), same item 2000414, accessed 2026-10-17. | Confirms the English Québec-facing product title and the same certified SKU and package amount as S05; not an independent product or measurement source. |
| Existing source `WP05-VINEGAR-INT-20261012-S06` | Office québécois de la langue française, [GDT — vinaigre balsamique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522907/vinaigre-balsamique), last updated 2013; already recorded in the research ledger. | Supports `vinaigre balsamique / balsamic vinegar` and distinguishes traditional from industrial balsamic aging. Reuse the existing entry and do not create a duplicate R420 source. |

## Disposition

Proceed with one identity-only `SAUCE_AND_CONDIMENT` row for **Traditional Balsamic Vinegar of Modena PDO / vinaigre balsamique traditionnel de Modène AOP**, with the official Italian name as its sole alias. Keep the generic balsamic identity, Modena PGI, Reggio Emilia PDO, glazes, reductions, and flavored products separate. Retain no forms, reusable measures, conversions, package yields, recipe links, or substitutions. The Europe-wide regional coverage item remains open.

No software tests, build, emulator run, or deployment were performed because this is a proposal-only documentation change.

# WP03 Section F — soft red wheat berries identity review (R159, 2026-10-16)

## Review record

- **Status:** Proposal only. No shared catalog JSON, ledger, generated index, checklist, roadmap, integration README, or recipe was changed.
- **Scope:** Determine whether an unseasoned market product labelled soft red wheat berries has a bounded whole-kernel food identity separate from the existing winter-specific and generic wheat-berry rows.
- **Recommendation:** **Accept an identity-only** `soft red wheat berries / grains de blé tendre rouge` reference in `GRAIN_AND_CEREAL`. Treat this as the seller's unqualified whole-kernel product name, not a formal Canadian wheat class. Keep aliases, forms, density, unit mappings, measures, conversions, yields, recipe links, and substitutions empty. Leave independent Québec review of the provisional French display open.
- **Proposed reference and ledger ID:** `ingredient-ref-soft-red-wheat-berries`.
- **Proposal-local source-ID prefix:** `WP03-SRWB-R159-20261016-S` (S01–S06). The ID and prefix were absent from the active package, ledger, and proposal/archive search at review time.

## Candidate selection and prior work

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L519) keeps broad grain and cereal identity coverage open. The recent wheat-berry sequence includes Red Fife, hard red spring, hard white spring, soft white, soft red winter, hard red winter, and soft white winter products [R152–R157].

R155 added `soft red winter wheat berries / grains de blé tendre rouge d'hiver` and explicitly rejected the unqualified English phrase `soft red wheat berries` as an alias on that narrower row. This proposal does not revisit that alias decision. Fresh Acres now lists **Organic Soft Red Wheat Berries** as a standalone whole-kernel product and lists **Organic Hard Spring Red Wheat Berries** separately [S01–S02]. The unqualified title is a new market-product boundary; the reviewed page does not say whether its kernels are spring or winter wheat. Keep that season unresolved rather than mapping it to the winter row or inferring a formal class.

The active catalog has analogous season-unspecified and winter-specific soft-white berry rows. Those precedents support preserving the seller's exact unqualified soft-red title as its own picker identity, while keeping the winter row separate. This proposal does not claim the two products are agronomically disjoint in every market.

## Product boundary and naming

Fresh Acres describes its item as whole, cleaned soft red wheat berries grown in Canada; it says the kernels can be milled at home or cooked whole for salads, side dishes, and cereal [S01]. The grain collection lists this item apart from its hard-spring red wheat berries [S02]. These pages establish the seller's named whole-kernel food product. They do not assign the item to a wheat season, cultivar, grade, protein class, or Canadian Grain Commission class. The page's organic certification and Canada/New Lowell production statements remain source-specific and are not part of the proposed identity.

Keep the proposed row separate from generic `wheat berries / grains de blé entiers`, `soft red winter wheat berries`, hard-red spring or winter berries, soft-white berries, durum berries, and flour, cracked, sprouted, or prepared cereal products. Do not add broader aliases such as `soft red`, `soft red wheat`, `soft wheat berries`, `blé tendre`, or `blé tendre rouge`; the complete source-backed product phrase is already in the display name, while those shorter phrases can match a wider set of wheat products.

Use **`grains de blé tendre rouge`** only as a provisional French display. OQLF's *blé tendre* entry maps the term to *soft wheat* and describes its grain as white or reddish, but does not name whole soft-red wheat berries [S03]. The Canadian Grain Commission uses *blé tendre rouge d'hiver* for its Eastern soft-red-winter class; its class definitions and designated-variety rules do not assign Fresh Acres' product to that class [S04–S05]. A current Québec mill announcement uses *farine de blé tendre rouge d'automne* for a flour made from Québec-grown grain, supporting phrase components only [S06]. Targeted searches for a Québec whole-kernel product listing with this wording did not surface one; this is a bounded search gap, not evidence that no local term exists. Keep independent Québec terminology review open and do not present the proposed display as an OQLF ruling or verified Québec retail name.

Fresh Acres' detailed product page showed the item as sold out on the access date, while its collection card still displayed a price. Availability is volatile and is not used as identity evidence [S01–S02].

## Proposed ingredient-reference delta

If accepted, append only this row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-soft-red-wheat-berries",
  "nameEn": "soft red wheat berries",
  "nameFr": "grains de blé tendre rouge",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Do not add a form, legacy-import candidate, recipe link, or recipe-line edit. If an integration policy requires an established agronomic class rather than a source-specific market name, hold the identity instead of assigning it to the existing winter row; the current sources do not establish that class relationship.

## Exact ownership and identifier audit

The current snapshot has **1,531 active references, 119 forms, 61 legacy candidates, and 1,876 research-ledger records** containing **7,966 source entries / 6,814 distinct source IDs**. Accent-, case-, punctuation-, ligature-, and spacing-normalized exact-key review covered reference names and aliases, form labels and match terms, and legacy-candidate names and aliases.

| Candidate term | Exact current owner | Notes |
| --- | --- | --- |
| `soft red wheat berries`, `soft red wheat berry`, `soft red wheat` | None | These exact keys are unallocated. |
| `soft red` | None as a stored exact key | Phrase search currently returns the winter-specific row because the words occur within its display name. |
| `grains de blé tendre rouge`, `blé tendre rouge` | None as a stored exact key | Phrase search currently returns the winter-specific row as a longer phrase. |
| `soft red winter wheat berries` | `ingredient-ref-soft-red-winter-wheat-berries` | Keep this qualified identity unchanged. |
| `grains de blé tendre rouge d'hiver` | `ingredient-ref-soft-red-winter-wheat-berries` | Keep this qualified French display unchanged. |
| `wheat berries` / `grains de blé entiers` | `ingredient-ref-wheat-berries` | Generic wheat-berry row remains unchanged. |

No exact candidate term is owned by a form or legacy candidate. The proposed `ingredient-ref-soft-red-wheat-berries` ID is absent from active reference, form, legacy, and ledger record IDs. No new candidate ID is proposed. Ledger text hits for the season-specific phrase belong to the existing R155 winter-wheat record; generic `wheat berries` occurs in other grain records and is not an owner of the unqualified candidate. The R159 source-ID prefix has no current-ledger or archive collision.

## Static picker projection

This projection applies current accent-folding and phrase-first contiguous-word behavior from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), with a hypothetical row using only the two proposed display names. It is static analysis, not live picker QA.

| Query | Current results | With proposed row | Expected effect |
| --- | --- | --- | --- |
| `soft red wheat berries` | 0 | 1: proposed row | Exact source-backed English product phrase resolves. |
| `soft red wheat` | 0 | 1: proposed row | The qualified English phrase resolves without an alias. |
| `soft red` | 1: winter row | 2: winter + proposed rows | Shows both the seasonal product and the unqualified market label. |
| `soft red winter wheat berries` | 1: winter row | unchanged | The season-qualified query remains on the existing row. |
| `grains de blé tendre rouge` / `blé tendre rouge` | 1: winter row for each | 2: winter + proposed rows for each | The broader French phrase exposes both options; the proposed construction is not claimed as verified Québec wording. |
| `grains de blé tendre rouge d'hiver` | 1: winter row | unchanged | The full winter phrase remains unambiguous. |
| `blé tendre` | 14 wheat/flour results | 15 | Adds the provisional whole-kernel option to the broader soft-wheat phrase. |
| `wheat berries` | 10 wheat-berry results | 11 | Adds this unqualified seller-named product. |
| `soft wheat berries` | 0 | 0 | No synonym alias is proposed. |

The wider `soft red` and French red-soft-wheat queries deliberately show two product options. No alias should cause those broad phrases to resolve to either row alone.

## Manifest-wide recipe demand

Parsed all **114 files** listed by `manifest.v1.json` and all **1,123 structured ingredient rows**. Scanned each complete recipe JSON file and each ingredient row for `soft red wheat berries`, singular `soft red wheat berry`, `soft red wheat`, `soft red`, `soft red winter wheat berries`, French red/soft-wheat phrase variants, the proposed reference ID, and a candidate ID placeholder. Results: **zero candidate-term recipe-file hits and zero ingredient-row hits**. No link, relink, amount, or substitution is proposed.

## Forms, measures, conversions, yields, and substitutions

- **Forms:** No wheat-berry form is attached to the current generic or named wheat-berry references, and the forms catalog has no exact candidate term. This proposed identity names intact whole kernels; add no form.
- **Package sizes:** Fresh Acres lists 4.54 kg and 11.34 kg package options [S01]. They are SKU package sizes, not household measures, mass-volume observations, or cooking yields.
- **Density and unit mappings:** The candidate has no measurements in the ledger. The existing wheat-berry rows have no supported candidate-specific kitchen density or unit mapping. Keep `defaultDensity: null` and `unitMappings: []`; do not transfer values from the winter row or another grain.
- **Conversions and yields:** The research ledger contains eight unit conversions and none mentions wheat or grain. The package-yield file contains one unrelated canned-black-bean entry. The source's home-milling and whole-kernel cooking uses provide no reusable volume ratio, cooking ratio, or measured yield. Add none.
- **Substitutions:** The existing R155 winter-wheat record has empty measurement observations and substitution findings, with no supported value/substitute states for that specific product. Do not transfer that research status as product evidence. The global and contextual substitution-rule files are empty, and these sources provide no equivalent grain or replacement quantity. Add no rule or recipe-line substitution.

## Proposed research-ledger delta

If the row is accepted, add one `ingredient_reference` record keyed to the proposed reference ID. The source entries are proposal-local; they are not yet added to the active ledger.

```json
{
  "recordId": "ingredient-ref-soft-red-wheat-berries",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-SRWB-R159-20261016-S01",
      "url": "https://freshacres.ca/products/organic-soft-red-wheat-berries",
      "title": "Fresh Acres, Organic Soft Red Wheat Berries",
      "accessedOn": "2026-10-16",
      "locator": "Product heading, description, uses, current stock indicator, and package sizes.",
      "supports": "Names whole, cleaned soft red wheat berries grown in Canada and describes home milling or cooking whole. Lists 4.54 kg and 11.34 kg package sizes; the detail page currently shows sold out. It does not name a season, cultivar, grade, or formal Canadian Grain Commission class.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-SRWB-R159-20261016-S02",
      "url": "https://freshacres.ca/collections/grains",
      "title": "Fresh Acres, Organic Grains",
      "accessedOn": "2026-10-16",
      "locator": "Current product-card list for Organic Soft Red Wheat Berries and Organic Hard Spring Red Wheat Berries.",
      "supports": "Lists soft red and hard spring red wheat berries as separate whole-grain products. The collection card showed a price while the detail page displayed sold-out status; stock is volatile and not part of the identity decision.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-SRWB-R159-20261016-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre",
      "title": "Office québécois de la langue française, blé tendre (GDT)",
      "versionOrDate": "Last updated 2019",
      "accessedOn": "2026-10-16",
      "locator": "Definition, preferred terms, and English translation.",
      "supports": "Maps blé tendre to soft wheat, describes the grain as white or reddish, and lists blé tendre as a preferred term. It does not name soft-red wheat berries or approve the proposed whole-kernel compound.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SRWB-R159-20261016-S04",
      "url": "https://grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html",
      "title": "Canadian Grain Commission, Classes de blé canadien",
      "accessedOn": "2026-10-16",
      "locator": "Introduction to class assignment and the Eastern soft-red-winter class table.",
      "supports": "Explains that Canadian classes are based on designated varieties and region and lists Blé tendre rouge d'hiver de l'Est canadien (CESRW). This formal class table does not identify or classify the Fresh Acres product.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SRWB-R159-20261016-S05",
      "url": "https://www.grainscanada.gc.ca/fr/qualite-grains/listes-des-varietes-designees/2026/lvd-ble-cesrw.html",
      "title": "Canadian Grain Commission, Blé tendre rouge d'hiver, Est canadien (CESRW), 2026 designated-variety order",
      "versionOrDate": "2026 order 2026-08; decision dated 2026-06-10",
      "accessedOn": "2026-10-16",
      "locator": "Order introduction and named CESRW varieties.",
      "supports": "States that the class is defined through designated grain varieties and lists varieties belonging to CESRW. It supports the boundary against assigning a winter class without variety evidence; it is not a food-product label.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SRWB-R159-20261016-S06",
      "url": "https://www.newswire.ca/fr/news-releases/farinart-lance-une-nouvelle-gamme-de-farines-integrales-de-boulangerie-100-locales-issues-de-l-agriculture-regeneratrice-883487150.html",
      "title": "Farinart Inc. via CNW, new 100% local whole-grain flour range",
      "versionOrDate": "2026-04-21 press release",
      "accessedOn": "2026-10-16",
      "locator": "Description of Farinart's Québec-grown flour range, including farine de blé tendre rouge d'automne.",
      "supports": "A Québec milling company names a red soft-wheat autumn flour made from Québec-grown grain. This supports regional phrase components only; it is flour, not a whole-kernel product name or exact equivalent.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only soft red wheat berries / grains de blé tendre rouge for the unqualified whole-kernel market product listed by Fresh Acres. The source describes intact kernels for home milling or cooking whole and lists it separately from hard spring red wheat berries. The reviewed source does not assign a season, cultivar, grade, or formal grain class; do not map this row to soft red winter wheat berries. The French display is a source-informed construction, not a verified Québec whole-kernel label or OQLF ruling. Add no aliases, forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions; keep Québec terminology review open.",
      "sourceIds": [
        "WP03-SRWB-R159-20261016-S01",
        "WP03-SRWB-R159-20261016-S02",
        "WP03-SRWB-R159-20261016-S03",
        "WP03-SRWB-R159-20261016-S04",
        "WP03-SRWB-R159-20261016-S05",
        "WP03-SRWB-R159-20261016-S06"
      ]
    }
  ]
}
```

## Source register and limits

Sources were checked online on 2026-10-16. Product pages and availability may change; claims are limited to the cited pages.

| Source ID | Source | Evidence used and limits |
| --- | --- | --- |
| `WP03-SRWB-R159-20261016-S01` | Fresh Acres, [Organic Soft Red Wheat Berries](https://freshacres.ca/products/organic-soft-red-wheat-berries). | Product heading and description name whole, cleaned soft red wheat berries grown in Canada and describe milling/cooking uses. The page lists 4.54 kg and 11.34 kg packages and currently shows sold out. It does not identify a season, cultivar, grade, or formal grain class. |
| `WP03-SRWB-R159-20261016-S02` | Fresh Acres, [Organic Grains](https://freshacres.ca/collections/grains). | Lists Organic Soft Red Wheat Berries and Organic Hard Spring Red Wheat Berries as separate whole-grain product entries. The collection card showed a price while the product page displayed sold-out status; availability is inconsistent/volatile and is not part of the identity decision. |
| `WP03-SRWB-R159-20261016-S03` | Office québécois de la langue française, [blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre). | Updated 2019; maps *blé tendre* to English *soft wheat*, describes grain as white or reddish, and lists *blé tendre* as a preferred term. The entry does not name soft-red wheat berries or approve the proposed compound. |
| `WP03-SRWB-R159-20261016-S04` | Canadian Grain Commission, [Classes de blé canadien](https://grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html). | Defines classes by designated varieties and region and lists `Blé tendre rouge d'hiver de l'Est canadien (CESRW)`. This is a formal class reference; it does not identify Fresh Acres' variety or classify its product. |
| `WP03-SRWB-R159-20261016-S05` | Canadian Grain Commission, [Blé tendre rouge d'hiver, Est canadien (CESRW), 2026 designated-variety order](https://www.grainscanada.gc.ca/fr/qualite-grains/listes-des-varietes-designees/2026/lvd-ble-cesrw.html). | Current order describes the class as defined through designated varieties under the Canada Grain Act and identifies varieties belonging to CESRW. It supports the boundary against inferring a winter class without variety evidence; it is not a food-product label. |
| `WP03-SRWB-R159-20261016-S06` | Farinart Inc. via CNW, [new 100% local whole-grain flour range](https://www.newswire.ca/fr/news-releases/farinart-lance-une-nouvelle-gamme-de-farines-integrales-de-boulangerie-100-locales-issues-de-l-agriculture-regeneratrice-883487150.html). | Québec company announcement dated 2026-04-21 names a `farine de blé tendre rouge d'automne` made with Québec-grown grain. This supports regional phrase components only; it is flour and not a whole-kernel product name or exact equivalent. |

## Static review checks

- Read the active Section F checklist, R157 and R158 integration READMEs, R154–R157 wheat-berry proposals, current catalog, legacy candidates, and research ledger before selection.
- Confirmed the proposed ID is unallocated, the new display terms have no exact owner in references, forms, or legacy candidates, and the existing ledger evidence remains on the winter-specific row; confirmed no source-ID collision in the current ledger/archive.
- Reproduced representative phrase-first picker projections from the live reference/form data and `IngredientSearch.kt` behavior.
- Parsed all 114 manifest-listed recipes and all 1,123 structured ingredient rows; no candidate-term demand was found.
- Reviewed forms, density/mapping fields, ledger conversions and candidate observations, package yields, and both substitution-rule files; no reusable numeric or substitution data supports this identity.
- This proposal changes only this Markdown file. No tests, builds, emulator, or deployment checks were run.

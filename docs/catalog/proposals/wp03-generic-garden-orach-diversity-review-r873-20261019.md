# WP03 Section K generic produce diversity review — garden orach — R873

**Status:** Integrated on 2026-10-19; see the [R871/R873 integration README](../batches/wp03-wp04-r871-r873-generic-identity-integration-20261019/README.md).

**Reviewed:** 2026-10-19

**Plan anchors:** [The broader Section K lettuce and leafy-green sweep](../../RecipeBook-global-ingredient-catalog-plan.txt#L6517) and the open [other regional greens and shoots item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6622).

## Recommendation

Add one identity-only generic leafy vegetable reference for **garden orach / arroche des jardins**, scoped to *Atriplex hortensis*. Sources identify the leaves as food, used in salads or cooked. Keep this plant distinct from spinach, other *Atriplex* species, and other spinach-named greens. This is a generic culinary ingredient identity, separate from the R862 common purslane, R865 tomato pulp, R868 celtuce, and R870 chive-blossom reviews.

The OQLF supplies a Québec French and English term set, the Latin name, and historical culinary context. University of Tennessee Extension and the Royal Horticultural Society independently identify *A. hortensis* as an edible leafy crop. The 2023 Gazette officielle du Québec field-vegetable list cross-references `arroche` with *Atriplex hortensis*. None of these sources establishes current Québec grocery availability, recipe demand, or a standard household measure.

## Why this is an open generic gap

Section K still has an open item for other regional greens and shoots. The current active references, forms, legacy candidates, and research ledger have no exact owner for `garden orach`, `orach`, `orache`, `arroche`, or *Atriplex hortensis*. No existing row or evidence was merged, renamed, or transferred for this proposal.

The manifest-listed recipe scan found no matching ingredient wording. This is an absence in the current bundled catalog and recipe corpus only; it is not evidence that orach is unavailable in Québec or unused elsewhere.

The cross-category queue review found no open task whose sole purpose is expanding a brand, product line, flavor, or retailer roster. The Section K `Broccolini` mention remains an existing trademark alias exclusion, not a queued task, and is out of scope: commercial-product counts do not add ingredient diversity. No branded or retailer-specific product research was pursued. Existing branded references and product-scoped evidence remain untouched. See the [R869–R870 scope review](../batches/wp03-wp04-r869-r870-generic-identity-integration-20261019/README.md).

## Bilingual names and identity boundary

| Term | Proposed treatment | Evidence and limit |
|---|---|---|
| `garden orach` | English display | OQLF English term; Tennessee Extension identifies `Orach` as *Atriplex hortensis*. The crop-qualified display avoids relying on the broader `mountain spinach` wording. |
| `arroche des jardins` | French display | OQLF-listed preferred French term. The OQLF entry dates to 1990; its age is a terminology limitation, not a claim about current usage frequency. |
| `garden orache`, `orach`, `orache` | English aliases | OQLF lists all three terms; RHS uses `garden orache` as the plant profile name and lists `orache` as a common name. |
| `arroche` | French alias | OQLF lists it as a preferred term; the 2023 Québec field-vegetable list pairs `Arroche` with *Atriplex hortensis*. The Gazette crosswalk supports the local crop name, not a language ruling or market-availability claim. |
| `mountain spinach`, `French spinach`, `red mountain spinach` | Do not add as aliases | Sources attest these common names, but they contain broad spinach wording that can misdirect searches to existing spinach identities. They are unnecessary beside the crop-qualified names. |
| `bonne-dame`, `Belle-Dame` and other plant-part or variety names | Do not add as aliases | OQLF discusses `arroche bonne-dame` as a commonly used variety. Do not turn that variety wording into a second identity or a generic alias. |

The proposed identity covers the leafy culinary use of *Atriplex hortensis*. It does not claim that all *Atriplex* species or all plant parts are edible. OQLF's comparison to spinach describes preparation; it does not establish a global ingredient substitution. Keep spinach (*Spinacia*), Malabar spinach, water spinach, New Zealand spinach, common purslane, and other greens distinct. The existing spinach, Malabar spinach, water spinach, and komatsuna rows and their evidence remain unchanged.

## Exact proposed data

### Active reference

```json
{
  "id": "ingredient-ref-garden-orach",
  "nameEn": "garden orach",
  "nameFr": "arroche des jardins",
  "aliasesEn": [
    "garden orache",
    "orach",
    "orache"
  ],
  "aliasesFr": [
    "arroche"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

This is identity-only. Add no forms, preparation defaults, recipe links, measurements, density, unit mappings, conversions, yields, or substitutions. If accepted, mark identity evidence verified while keeping `measurementState` and `substitutionResearchState` as `not_yet_researched`; record no measurement observations or substitution findings. Do not reuse spinach amounts or methods as transferable values.

## Proposed research sources

The source IDs below are proposal-local and were checked against the current ledger and proposal/batch archive before this file was created.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-K-GARDEN-ORACH-R873-20261019-S01` | Office québécois de la langue française, [GDT: *arroche*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083841/arroche), last updated 1990; accessed 2026-10-19. | Food-domain entry pairs *arroche* with *Atriplex hortensis*, lists `arroche des jardins`, `orach`, `orache`, `garden orach`, and `garden orache`, and describes the leaves as prepared like spinach or used in soups. Its date limits claims about contemporary usage. Its spinach comparison does not establish ingredient equivalence or substitution. |
| `WP03-K-GARDEN-ORACH-R873-20261019-S02` | University of Tennessee Extension, [Leafy Crops for the Tennessee Vegetable Garden](https://uthort.tennessee.edu/wp-content/uploads/sites/228/2023/11/D68.pdf), March 2019; accessed 2026-10-19. | Names orach as *Atriplex hortensis* and says it can be eaten in salad mixes or cooked. Its cultivation schedule, harvest days, spacing, and storage guidance are crop-management observations, not recipe measures or reusable kitchen conversions. `Mountain or French spinach` wording is not activated as an alias. |
| `WP03-K-GARDEN-ORACH-R873-20261019-S03` | Royal Horticultural Society, [*Atriplex hortensis* — garden orache](https://www.rhs.org.uk/plants/84645/atriplex-hortensis/details), accessed 2026-10-19. | Identifies the plant as *A. hortensis*, uses `garden orache`, and describes young tender leaves as edible in spinach-like use. Only the plant-name and leaf-use statements support this proposal; nursery links, growing dimensions, and other horticultural details are not used for ingredient claims. |
| `WP03-K-GARDEN-ORACH-R873-20261019-S04` | Éditeur officiel du Québec, [Gazette officielle du Québec, 27 December 2023](https://www.publicationsduquebec.gouv.qc.ca/fileadmin/gazette/pdf_encrypte/gaz_entiere/2352-F.pdf), Annex I field-vegetable list; accessed 2026-10-19. | Lists `Arroche — Atriplex hortensis`. This supports a current Québec commodity-name/species crosswalk only; it is not an OQLF terminology ruling, culinary-use source, or evidence of retail availability. |

No manufacturer or retailer evidence, branded product claim, or product-specific measurement is used or transferred.

## Ownership, picker, and recipe checks

Post-R872 snapshot checked 2026-10-19 before this proposal was written:

| File or corpus | Current size | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,902 references | `76af3ef7952eb2536df58e342399a2472a6135b16d76eb9d6a3d320ce42dd2ed` |
| `ingredient-forms.v1.json` | 201 forms | `5784488eba2effc1e99e29e4ab3f3143256a25c6cb327344099e045c1b85cf0e` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,310 records | `986ed1f745c2ebc525a72ed176f8d070a7c21d8248560dc21fff265c4696ea90` |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows | All listed recipe text scanned |

Case-insensitive text checks across active references, forms and match terms, legacy candidates, ledger records, and proposal/batch files found no occurrence of `orach`, `orache`, `arroche`, `Atriplex hortensis`, `garden orach`, `ingredient-ref-garden-orach`, or the proposed R873 source-ID prefix before this file was added. The existing spinach-family terms do appear in the active catalog, which is why the proposed aliases omit `mountain spinach` and `French spinach`. The row has no density or mappings, and does not alter existing picker terms.

The 114 manifest-listed recipes were checked for `orach`, `orache`, `arroche`, *Atriplex hortensis*, and `garden orach`; no recipe file or ingredient row matched. No recipe reference or link is proposed.

## Unresolved risks

- OQLF's term entry is authoritative Québec evidence but dates to 1990. The 2023 Gazette crosswalk corroborates `arroche` as a Québec crop name, but does not establish present-day recipe usage or a preferred French display. Independent Québec terminology review could still adjust the display or alias set.
- The horticultural and extension sources establish edible-leaf use but do not establish current Québec grocery availability. This proposal makes no availability claim.
- `Mountain spinach` and `French spinach` are source-attested names but remain excluded to avoid broad spinach-search collisions. Exact qualified orach terms are preferred.
- No recipe demand, household measure, density, yield, conversion, or generally safe substitute was established. Measurement and substitution research remain open.
- The Section K caution about wild or processing-sensitive plants and the absence of a foraging-identification guarantee remain in force. This proposal is specific to the named garden crop *Atriplex hortensis*.

Integrated on 2026-10-19 with the [R871/R873 batch](../batches/wp03-wp04-r871-r873-generic-identity-integration-20261019/README.md). No software tests were run because the change adds database JSON data under `AGENTS.md`.

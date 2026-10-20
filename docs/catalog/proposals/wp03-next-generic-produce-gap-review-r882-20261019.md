# WP03 generic produce gap review — chayote shoots — R882

**Status:** Proposal only; no catalog or ledger integration has been made.

**Reviewed:** 2026-10-19

**Plan anchors:** The open Section K item for [other regional greens and shoots](../../RecipeBook-global-ingredient-catalog-plan.txt#L6646), the current [WP03 workflow status](../ingredient-catalog-workflow.md#L409), and the [cross-category generic-ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md).

## Recommendation

Add one identity-only generic produce reference for **chayote shoots / pousses de chayotte**, scoped to tender culinary shoots of *Sechium edule*. Keep this edible part separate from the existing chayote fruit identity, separately harvested mature leaves, the tuberous root, whole vines, and the plant's non-food uses. It is a crop-part distinction within generic culinary produce coverage, not a request to enumerate commercial products.

The Office québécois de la langue française identifies the plant as *Sechium edule*, prefers the French plant/fruit term `chayotte`, and says that young shoots are used as food. University of Florida IFAS describes the tender shoots as used in soups and stir-fried dishes; Singapore's NParks records stir-fried young shoots in Malaysian Highlands food use. A peer-reviewed chayote review also identifies tender shoots as vegetable greens. These sources support a distinct culinary plant-part identity; they do not establish Québec retail availability or a standardized compound French name. [S01–S04]

## Why this is an open generic gap

Section K's open parent explicitly invites other regional greens and shoots. The active catalog has a generic `chayote / chayotte` reference for the fruit/crop, but no separate chayote-shoot reference, form, alias, or recipe link. The OQLF page used for that crop term also mentions young shoots as food; the gap is that the catalog does not currently model this edible part separately. The current catalog has generic pea shoots and bamboo shoots as comparable part-qualified identities.

The cross-category queue review found no open task solely for a commercial roster. The Section K Broccolini mention is already classified as an alias exclusion, not a queued task. No product-, brand-, line-, flavour-, SKU-, or retailer-variant research was pursued. If such a roster-only task is encountered later, it is out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and their product-bound evidence remain untouched. [Scope review]

## Bilingual name and identity boundary

| Term | Proposed treatment | Evidence and limit |
|---|---|---|
| `chayote shoots` | English display | University extension and the cited peer-reviewed article use `chayote` for *Sechium edule* and describe its tender shoots as edible vegetable greens. The display names the edible part directly. |
| `pousses de chayotte` | Provisional fr-CA display | Descriptive compound built from OQLF's preferred `chayotte` and its food-use description of young shoots. OQLF does not standardize this exact plant-part compound; keep the display open to independent Québec review. |
| Other aliases | None proposed | OQLF lists `chayote` and rare `chaïote` as plant/fruit term variants, but those short terms are already associated with the existing chayote identity and do not independently name its shoots. Do not add broad plant, fruit, regional, cultivar, or botanical-name aliases to the new row. |

The identity covers tender shoots harvested and used as greens. Sources vary in whether they discuss leaves alongside shoots; this proposal does not make mature leaves part of the shoot identity. Do not include the edible fruit, tuberous root, entire vine, flower, ornamental use, or propagation shoots. Do not encode *Sechium edule* as a picker alias.

## Exact proposed data

If accepted, add one reference:

```json
{
  "id": "ingredient-ref-chayote-shoots",
  "nameEn": "chayote shoots",
  "nameFr": "pousses de chayotte",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

This is identity-only. Add no forms, recipe links, household measures, density, unit mappings, conversions, yields, substitutions, or safety claims. If integrated, record identity evidence on the new reference and leave `measurementState` and `substitutionResearchState` as `not_yet_researched`. The crop and recipe descriptions contain no transferable kitchen measure; crop-production and product amounts are excluded.

## Research sources

The source IDs below are proposal-local and were checked against the active ledger and proposal/archive before this file was created.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-K-CHAYOTE-SHOOTS-R882-20261019-S01` | Office québécois de la langue française, [GDT: *chayotte*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26558714/chayotte), updated 2021; accessed 2026-10-19. | Identifies *Sechium edule*, lists preferred French `chayotte`, `chayote`, and rare `chaïote`, and English `chayote`; its note says young shoots, leaves, and roots are used as food. Supports the species/part boundary and base French name, not the exact compound `pousses de chayotte`, contemporary retail availability, or a kitchen measure. |
| `WP03-K-CHAYOTE-SHOOTS-R882-20261019-S02` | Yuheng Qiu and Guodong Liu, University of Florida IFAS Extension, [*Chayote—A Potential Vegetable Crop for Florida*](https://ask.ifas.ufl.edu/publication/HS1454), accessed 2026-10-19. | Identifies chayote as *Sechium edule* and states that young tender leaves are eaten and that shoots are stewed in soups or stir-fried. The proposal uses only the generic culinary-use statements; the page's crop-management, fruit-size, yield, storage, and other measurements are not applied to shoots or generalized. |
| `WP03-K-CHAYOTE-SHOOTS-R882-20261019-S03` | National Parks Board, Singapore, [*Sechium edule*](https://www.nparks.gov.sg/florafaunaweb/flora/5/9/5957), accessed 2026-10-19. | Names the species and records edible leaves and storage organs as other edible parts; its food-use note says young shoots are stir-fried in the Malaysian Highlands. This is bounded regional-use evidence, not a Québec display, market-availability claim, general preparation requirement, or measure. |
| `WP03-K-CHAYOTE-SHOOTS-R882-20261019-S04` | Louis H. Aung, Amelia Ball, and Mosbah Kushad, [“Developmental and nutritional aspects of chayote (*Sechium edule*, Cucurbitaceae)”](https://doi.org/10.1007/BF02860483), *Economic Botany* 44(2) (1990), 157–164; abstract in Illinois Experts, accessed 2026-10-19. | Peer-reviewed abstract identifies tender shoots as vegetable greens, distinct from the fruit, vines used ornamentally or as fodder, and edible underground roots. Supports ingredient-part identity only; no quantity or conversion is taken from the study. |

All evidence concerns the generic crop and its parts. No manufacturer or retailer evidence, commercial product claim, or product-specific measurement is used or transferred.

## Ownership, picker, and recipe checks

Static audit snapshot before this proposal was created (2026-10-19):

| File or corpus | Size | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,909 references | `319ae44c5e960793e1e1b0a92c98d3b660d66113d5403994d571b83b08cff42a` |
| `ingredient-forms.v1.json` | 201 forms | `5784488eba2effc1e99e29e4ab3f3143256a25c6cb327344099e045c1b85cf0e` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,315 records | `8a87a091084fc4306626b08a10156e931c44156a829cc5e0f5a11080019fe4c1` |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows | Corpus digest `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17` |

An exact normalized-name check across active reference names and aliases, form labels and match terms, and legacy candidates found no owner for `chayote shoots` or `pousses de chayotte`. The proposed reference ID and source-ID prefix were absent from the current active references, forms, legacy file, ledger, and proposal/archive before this file was created. The current active chayote row is `ingredient-ref-chayote`, with English display `chayote`, French display `chayotte`, and the French alias `chaïote`; that fruit/crop entry is retained unchanged. A ledger text scan found no separate chayote-shoot record. The current canonical recipe corpus has no chayote or chayote-shoot ingredient text, so it supplies no bundled recipe demand and no recipe link is proposed.

The picker projection was computed from the app's current normalized word-phrase-first, substring-fallback behavior in `IngredientSearch.kt`:

| Query | Current result | With proposed row |
|---|---|---|
| `chayote shoots` | No result | `ingredient-ref-chayote-shoots` only |
| `pousses de chayotte` | No result | `ingredient-ref-chayote-shoots` only |
| `chayote` | Existing `ingredient-ref-chayote` | Existing chayote plus chayote shoots |
| `chayotte` | Existing `ingredient-ref-chayote` | Existing chayote plus chayote shoots |
| `chaïote` | Existing `ingredient-ref-chayote` | Existing chayote only |

The two broader queries expand because they are complete word matches inside the new part-qualified names. Both displayed results remain explicit, and the new identity adds no short `chayote` or `chayotte` alias. This is a static projection, not an app test or device check.

## Risks and limits

- The French display is descriptive rather than an OQLF-standardized compound; retain it as provisional until independent Québec review.
- A search for unqualified `chayote` or `chayotte` will show both the existing fruit/crop row and the new shoot row. The terms are not merged, and neither row gains the other's aliases.
- The cited sources establish culinary use in their described settings, not current Québec market availability or a universal shoot preparation. No safety, nutritional, measurement, yield, conversion, or substitution claim is inferred.
- The Section K foraging caution remains in force. This identity applies to positively identified, food-grown *Sechium edule*; it is not a wild-plant identification or edibility guarantee.

## Data delta and completion state

**Proposed delta:** one new identity-only `VEGETABLE_AND_AROMATIC` reference plus identity-source records under that new ID if integration is approved. No changes to the existing chayote fruit row, forms, recipes, measurements, or substitution data. No product amounts are generalized.

**This review:** proposal file only. No shared catalog, research ledger, checklist, roadmap, or batch file was changed. No software tests, build, emulator, or deployment were run.

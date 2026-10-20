# WP03 Section L generic produce diversity review — ivy gourd — R885

**Status:** Proposal only; no shared catalog, research ledger, recipe, plan, roadmap, workflow, or batch file was changed.

**Reviewed:** 2026-10-19

**Plan anchors:** The [A–Z checklist is a minimum discovery map](../../RecipeBook-global-ingredient-catalog-plan.txt#L344), and [Section L covers fruiting vegetables and gourds](../../RecipeBook-global-ingredient-catalog-plan.txt#L6700). The open [Section L gourd coverage item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6763) does not list ivy gourd; treat this as a documented generic omission under the still-open plant-food sweep, not as completion of Section L.

## Recommendation

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for **ivy gourd / courge lierre**, identified as *Coccinia grandis*. Scope the culinary identity to its young green fruit used as a vegetable. Keep its leaves and shoots, ripe fruit, and preserved or dried preparations outside this reference until separately reviewed.

This is a generic crop identity, not a commercial product or variant. JIRCAS and PROSEA independently document the species and the culinary use of its young fruits. Kew treats *Coccinia grandis* as an accepted species used for food. The French phrase `courge lierre` appears in a Health Canada natural-health-product ingredient monograph; use it only as source-attested French wording, provisionally, because the monograph does not establish a Québec culinary-market label. No source establishes current Québec retail availability or demand in the bundled recipes.

Keep this identity distinct from snake gourd (*Trichosanthes cucumerina*), pointed gourd (*T. dioica*), bitter melon, bottle gourd, ridge gourd, and winter melon. The word `gourd` alone is already a broad multi-result picker query. Do not add broad names such as `small gourd`, `petite courge`, `scarlet gourd`, or `scarlet-fruited gourd` as aliases; their wider wording is unnecessary for the species-bounded identity. Do not add `tindora` or other regional names without a separate source and picker review.

## Why this is a generic gap

Section L remains open for fruiting vegetables and gourds. Its open list includes several distinct gourd crops, but not *Coccinia grandis*. The global plan explicitly treats the A–Z list as a discovery minimum and allows reviewed omissions to be added. This proposal adds one species-bounded edible crop with documented culinary use; it does not enumerate brands, product lines, flavours, SKUs, or retailer variants.

The cross-category scope review found no open task whose sole purpose is expanding a commercial roster. Any brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only queue item remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-scoped evidence remain preserved. No such product research was pursued for this proposal; see the [generic-ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md).

## Identity and name boundary

| Term | Proposed treatment | Evidence and limit |
|---|---|---|
| `ivy gourd fruit (Coccinia grandis)` | English display | JIRCAS, PROSEA, and Kew use `ivy gourd` for this species. `fruit` makes the represented plant part explicit. |
| `fruit de courge lierre (Coccinia grandis)` | Provisional French display | Health Canada’s French NHP monograph pairs `courge lierre` with *C. grandis* and the fruit part. The compound part label is descriptive; the monograph does not establish an OQLF-standardized culinary term or contemporary Québec produce-market wording. |
| `ivy gourd`, `courge lierre` | Search through display names; no duplicate aliases | Both source-backed base names remain searchable within the part-qualified displays. |
| `small gourd`, `little gourd`, `scarlet gourd`, `scarlet-fruited gourd`, `petite courge`, `tindora`, and `tindola` | Do not add as aliases | These terms are unnecessary or insufficiently bounded for the proposed Québec-facing picker identity. Their omission keeps broad gourd searches multi-result and avoids adding regional wording without a separate review. |

The identity applies to young green fruits of *Coccinia grandis* used as a vegetable. Sources also describe edible shoots/leaves and uses of ripe fruit; those are different plant parts or maturity/use states and are not included here. Do not infer that all cultivars or wild forms share one preparation, flavour, safety profile, or culinary behaviour. Keep unrelated gourd crops, and recipe-specific replacement advice, separate.

## Exact proposed data

If approved for integration, add one identity-only reference:

```json
{
  "id": "ingredient-ref-ivy-gourd",
  "nameFr": "fruit de courge lierre (Coccinia grandis)",
  "nameEn": "ivy gourd fruit (Coccinia grandis)",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The names search the scientific species string as well as the common names. Add no forms, measurement observations, household measures, density, unit mappings, package yields, conversions, substitutions, or recipe links. If integrated, record generic identity sources under the new reference; keep the NHP source’s purpose and scope explicit. Do not copy source nutrition values, crop yields, preparation quantities, or medicinal doses into ingredient data.

## Source register

Source IDs are local to this proposal and were checked against the current ledger and proposal/archive before this file was created.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-L-IVY-GOURD-R885-20261019-S01` | Japan International Research Center for Agricultural Sciences (JIRCAS), [*Coccinia grandis* (L.) Voigt](https://www.jircas.go.jp/en/database/thaivege/032), accessed 2026-10-19. | Identifies the accepted botanical name and English common names `ivy gourd` and `scarlet-fruited gourd`. Describes young green fruits as a soup ingredient and documents tender shoots as a vegetable. Regional food-use evidence only; it does not establish Québec market availability, a French culinary label, or a transferable amount or preparation rule. Its medicinal-use notes are not used. |
| `WP03-L-IVY-GOURD-R885-20261019-S02` | PROSEA, [*Coccinia grandis* (L.) Voigt, Plant Resources of South-East Asia No. 8: Vegetables](https://prosea.prota4u.org/view.aspx?id=2162), accessed 2026-10-19. | Names `ivy gourd`, `small gourd`, and `scarlet gourd`; documents young fruits in soups and curries and separately discusses ripe fruit, young shoots, and leaves. Only the species identity and qualitative young-fruit culinary use support this proposal. Its market, composition, yield, and other numeric observations are not transferred. Its statement about wild-form bitterness is not used to make a safety or universal-preparation claim. |
| `WP03-L-IVY-GOURD-R885-20261019-S03` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Coccinia grandis* (L.) Voigt](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:291972-1/general-information), accessed 2026-10-19. | Treats *C. grandis* as an accepted species, records `ivy gourd` among common names, and classifies it as used for food. It supports taxonomic and broad food-identity boundaries, not a particular edible part, recipe, market label, or preparation. |
| `WP03-L-IVY-GOURD-R885-20261019-S04` | Health Canada, Natural Health Products Ingredients Database, [Antioxidants monograph, French](https://webprod.hc-sc.gc.ca/nhpid-bdipsn/dbImages/mono_antioxydants_francais.pdf), p. 15, accessed 2026-10-19. | Lists *Coccinia grandis*, `courge lierre` and `petite courge`, the fruit part, and fresh/dry preparations in an NHP ingredient-name table. It supports only the bounded French common name and plant-part wording used here. It is not culinary-use, Québec retail, food-safety, dosage, or household-measure evidence; NHP preparations and quantities are not adopted. |

No manufacturer or retailer source was needed. No product-specific amounts or claims were generalized.

## Ownership, picker, and recipe checks

Read-only snapshot before this proposal was created (2026-10-19):

| File or corpus | Current size | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,912 references | `7277d6d1a15f1a841fd7d662d42c62f6000d91e7cc54d871fd8053db96d72917` |
| `ingredient-forms.v1.json` | 201 forms | `5784488eba2effc1e99e29e4ab3f3143256a25c6cb327344099e045c1b85cf0e` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,317 records | `54cd2bfe016f32ae1c0737dd78ea7785ac2d6a31bd6f43913ca64d56f2415a9a` |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows | Corpus digest `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17` |

Exact normalized-term checks across active reference names/aliases, form labels/match terms, legacy-candidate content, and ledger identity/name fields found no current owner for `ivy gourd`, `courge lierre`, *Coccinia grandis*, `scarlet gourd`, `scarlet-fruited gourd`, `small gourd`, `little gourd`, `tindora`, or `tindola`. A case-insensitive project catalog/archive scan found no prior R885 source prefix or proposed `ingredient-ref-ivy-gourd` identity. No existing reference or evidence was changed or transferred.

The manifest-listed corpus was scanned across recipe string fields for the same candidate names and spelling variants. It contains **zero matching recipe files and zero matching ingredient rows**. This is no matching demand in the current bundled corpus; it does not imply lack of culinary use elsewhere. No recipe link is proposed.

The picker projection follows the app’s normalized word-phrase-first, substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a static projection, not an app test:

| Query | Current result | With proposed row |
|---|---|---|
| `ivy gourd`; `ivy gourd fruit` | No result | `ingredient-ref-ivy-gourd` only |
| `courge lierre`; `fruit de courge lierre` | No result | `ingredient-ref-ivy-gourd` only |
| `Coccinia grandis` | No result | `ingredient-ref-ivy-gourd` only |
| `gourd` | Five existing gourd references | Those five plus `ingredient-ref-ivy-gourd` |
| `courge` | Twelve existing results | Those twelve plus `ingredient-ref-ivy-gourd` |
| `small gourd`; `scarlet gourd`; `tindora` | No result | No result; these terms are not aliases |

The broad `gourd` and `courge` searches remain visibly multi-result. Adding the species-qualified term creates no singleton result for an unqualified regional or crop-family term.

## Risks and limits

- `courge lierre` is a source-attested French common name, but the supporting Health Canada table is for NHP ingredients. Keep the display provisional pending independent Québec culinary terminology review; do not claim OQLF approval or current retail usage.
- No Québec availability or bundled recipe demand was found. The proposal supports generic culinary diversity, not a claim that the ingredient is common locally.
- The sources distinguish immature fruit from edible shoots/leaves and describe other ripe-fruit uses. Do not attach those parts or states to this identity without separate review.
- Published composition, crop-yield, nutritional, preparation, and medicinal figures are outside the recommendation. No amount, density, conversion, yield, form, safety claim, or substitution is inferred.
- The existing Section L gourd crops and their names remain distinct. No commercial product rosters were researched; any roster-only work is out of scope because commercial-product counts do not add ingredient diversity.

## Data delta and completion state

**Recommended delta if integrated:** one new identity-only `VEGETABLE_AND_AROMATIC` reference, `ingredient-ref-ivy-gourd`, with empty aliases, null density, and no unit mappings. Its identity scope is the young green fruit of *Coccinia grandis* used as a vegetable. No forms, recipe links, measures, conversions, yields, or substitutions.

**This review:** this proposal file only. No shared JSON, ledger, checklist, roadmap, workflow, or batch file was modified. The Section L plan remains open. No software tests, build, emulator, or deployment were run.

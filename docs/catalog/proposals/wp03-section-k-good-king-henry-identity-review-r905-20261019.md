# WP03 Section K R905 — Good King Henry leafy-green identity review

**Status:** Integrated as identity-only data.

**Reviewed:** 2026-10-19

**Plan anchor:** Section K remains open for other regional greens and shoots ([global catalog plan, line 6670](../../RecipeBook-global-ingredient-catalog-plan.txt#L6670)). This review adds one generic leafy culinary identity.

## Decision

Add `Good King Henry / ansérine Bon-Henri` as `ingredient-ref-good-king-henry` in `VEGETABLE_AND_AROMATIC`, for the leafy culinary use of *Blitum bonus-henricus*. OQLF supplies the English and Québec French common names under the historical botanical name *Chenopodium bonus-henricus*. Kew currently accepts *Blitum bonus-henricus* and lists the OQLF name's binomial as a synonym. RHS describes the plant as an edible perennial and documents culinary leaf use.

Use only source-supported narrow aliases `Good-Henry` and `bon-henri`. OQLF also lists `arroche Bon-Henri`, but that phrase is omitted because substring search would broaden the existing `arroche` query for garden orach. Do not alias `wild spinach`: OQLF explicitly says it is used for several *Chenopodium* plants, including both *C. album* and *C. bonus-henricus*. Leave broad names such as `goosefoot`, `fat hen`, and the taxonomic names out of aliases. Keep the identity separate from spinach, garden orach, and other goosefoot greens.

Li and Savage report oxalate measurements for their sampled leaves, stems, and buds and report a boiling result for a mixed sample. Keep those results and the authors' dietary interpretation study-scoped. They do not establish a general composition value, a universal intake amount, a safety conclusion for all ingredient use, or a transferable cooking instruction. No safety or preparation behavior is added to the active data.

## Data added

```json
{
  "id": "ingredient-ref-good-king-henry",
  "nameEn": "Good King Henry",
  "nameFr": "ans\u00e9rine Bon-Henri",
  "aliasesEn": ["Good-Henry"],
  "aliasesFr": ["bon-henri"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The ledger record is `ingredient_reference`, `identityState: verified`, with measurement and substitution research left `not_yet_researched`. It adds no forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions.

## Identity and evidence boundaries

| Term or evidence | Treatment | Limit |
|---|---|---|
| `Good King Henry` / `ansérine Bon-Henri` | Generic leafy-green identity for *Blitum bonus-henricus* | OQLF uses the historical synonym *Chenopodium bonus-henricus*; Kew connects it to the currently accepted name. The taxonomy relationship does not transfer properties from quinoa, lamb's-quarters, or other relatives. |
| `Good-Henry`, `bon-henri` | Narrow aliases listed by OQLF | OQLF also lists `arroche Bon-Henri`, but it is omitted because substring matching would broaden the existing garden-orach `arroche` query. |
| `wild spinach` | Do not add as an alias | OQLF defines it as a name used for multiple plants in *Chenopodium*, including more than one species. |
| `goosefoot`, `fat hen`, botanical names | Do not add as aliases | Broad or taxonomic wording is not needed for culinary search and risks crossing species or non-culinary queries. |
| Oxalate measurements and boiling observation | Retain as source-scoped research context | Li and Savage's sample composition, plant-part sizes, measured results, and two-minute boiling condition are not active composition values, dietary guidance, safety limits, or a general recipe method. |
| Other leafy greens | Preserve as separate identities | Do not merge into spinach, garden orach, amaranth greens, lamb's-quarters, or another goosefoot based on family relationship or spinach-like use. |

## Sources

The ledger uses source IDs `WP03-SECTIONK-GOOD-KING-HENRY-R905-20261019-S01` through `S04`, all accessed 2026-10-19.

| Source ID | Source | Supports and limits |
|---|---|---|
| S01 | Office québécois de la langue française, [GDT: *ansérine Bon-Henri*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083842/anserine-bon-henri), updated 1990. | Lists `ansérine Bon-Henri`, `bon-henri`, and `arroche Bon-Henri`, English `Good King Henry`, and *Chenopodium bonus-henricus*. Explicitly marks `wild spinach` as a name for several *Chenopodium* plants. This is terminology evidence, not culinary-use evidence. |
| S02 | Royal Botanic Gardens, Kew, [Plants of the World Online: *Blitum bonus-henricus*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:30117327-2). | Accepts *Blitum bonus-henricus*, lists *Chenopodium bonus-henricus* as a synonym, and records introduction into Québec. Taxonomy/distribution only; no culinary-use or retail claim. |
| S03 | Royal Horticultural Society, [*Chenopodium bonus-henricus* / Good King Henry](https://www.rhs.org.uk/plants/3722/chenopodium-bonus-henricus/details). | Identifies the historical binomial with Good King Henry and describes an edible perennial with culinary leaf use. RHS cultivation and harvest advice is not generalized into a RecipeBook handling rule. |
| S04 | Li and Savage, [“Oxalate Content of the Herb Good-King-Henry, *Blitum bonus-henricus*”](https://pubmed.ncbi.nlm.nih.gov/28231194/), *Foods* 4(2), published 2015-05-12. | Reports analytical results for the studied leaves, stems, and buds, including differences by leaf size and an observed effect of boiling one mixed sample. The reported results and author interpretation stay scoped to those study materials and conditions; no active composition, intake, safety, or cooking rule is inferred. |

No manufacturer, brand, SKU, retailer variant, or package measurement was researched or added.

## Ownership, demand, and picker behavior

Before integration, no active reference, form, legacy candidate, or ledger identity owned `Good King Henry`, `Good-Henry`, `ansérine Bon-Henri`, or `arroche Bon-Henri`. No source-ID or exact-URL owner was found for the four sources. Full-text and ingredient-row scans of the 114 manifest-listed recipes found no Good King Henry or *Blitum bonus-henricus* demand; no recipe link or amount is added.

The static phrase-first/substring picker projection is recorded in the [R905 integration README](../batches/wp03-section-k-good-king-henry-identity-integration-r905-20261019/README.md). Broad or ambiguous synonyms remain outside the aliases.

## Cross-category scope review

This is generic plant-food coverage, not a commercial product expansion. A fresh open-checklist scan found no new brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task. The two Section F cereal-roster clauses remain out of scope because commercial-product counts do not add ingredient diversity; generic cereal coverage remains open. Further Anson Mills named-wheat-meal research remains out of scope under the earlier R875 disposition. Existing branded rows and product-specific evidence were preserved; no product measurement or claim was transferred. See the [cross-category scope review](../batches/generic-ingredient-scope-review-20261019/README.md).

## Root integration review

- Directly reviewed OQLF, Kew POWO, RHS, and the PubMed article record. OQLF's shared `wild spinach` scope was retained as an alias exclusion; the scientific name update was reconciled through Kew's synonym list.
- Added the identity-only reference and its four-source ledger record. Kept the oxalate results study-scoped and left measurement/substitution research open.
- No software tests, build, emulator, or deployment were run because the active catalog change only adds database JSON under `AGENTS.md`. Static data and documentation checks are recorded in the [integration README](../batches/wp03-section-k-good-king-henry-identity-integration-r905-20261019/README.md).

# WP03 Section K — lamb’s lettuce / mâche identity review (R976)

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, workflow, or roadmap data was changed.
- **Disposition:** Recommend one identity-only generic leafy vegetable, lamb’s lettuce / mâche.
- **Plan anchor:** Section K leaves the broader leafy-green and brassica sweep open ([catalog plan, lines 6555–6562](../../RecipeBook-global-ingredient-catalog-plan.txt#L6555)) and calls for other regional greens found in independent sweeps ([line 6711](../../RecipeBook-global-ingredient-catalog-plan.txt#L6711)).
- **Scope:** Culinary mâche commonly named *Valerianella locusta* in food and horticultural sources. No brand, product-line, cultivar, flavour-family, SKU, or retailer-variant roster was researched.

## Recommendation

Add `ingredient-ref-lambs-lettuce` as an identity-only `VEGETABLE_AND_AROMATIC` reference for the edible leaves of cultivated mâche. The OQLF’s Québec GDT entry uses `mâche` and `mâche commune`, gives English `lamb’s lettuce` and `corn salad`, and describes the crop as consumed raw or cooked. Utah State University Extension independently identifies lamb’s lettuce as *Valerianella locusta* and describes its edible leaves as a salad vegetable. The 2023 *Gazette officielle du Québec* lists `Mâche` and includes *V. locusta* in its species crosswalk. [S01–S03]

Use **lamb’s lettuce / mâche** as the display pair. Add only OQLF-supported names that improve exact crop lookup: French aliases `mâche commune` and `doucette`, and English alias `corn salad`. The source’s hyphenated `corn-salad` needs no separate alias because ingredient search normalizes punctuation. Do not add scientific names as picker aliases. [S01, S04]

Scope the identity to the cultivated culinary crop commonly referred to as *Valerianella locusta*. OQLF also lists *Valerianella olitoria* and *Valerianella locusta* var. *olitoria*; Kew’s current Plants of the World Online backbone accepts *Valeriana locusta* and lists both *Valerianella locusta* and *Valerianella olitoria* combinations under its synonyms. Preserve that taxonomic naming difference in the evidence rather than treating the names as separate ingredients. The Québec Gazette’s broader `Valerianella spp.` row also mentions Italian mâche (*Valerianella eriocarpa*); this proposal does not extend the identity to other species or to the whole genus. [S01, S03–S04]

Keep mâche distinct from lettuce, spinach, garden cress, watercress, garden orach, endive, escarole, and radicchio. Its salad use or OQLF’s spinach comparison does not make it a lettuce or spinach alias. Do not infer a separate raw/cooked form from descriptions of both preparations.

## Proposed minimal data

```json
{
  "id": "ingredient-ref-lambs-lettuce",
  "nameEn": "lamb’s lettuce",
  "nameFr": "mâche",
  "aliasesEn": ["corn salad"],
  "aliasesFr": ["mâche commune", "doucette"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The alias `corn salad` is directly listed by OQLF and does not collide with a current reference or form. Do not add `corn-salad` separately; punctuation normalization already folds it to the same search key. Accent normalization likewise makes a separate unaccented `mache` alias unnecessary. [S01]

## Ownership and bundled recipe demand

Read-only live package snapshot on 2026-10-19:

| Surface | Live count | Candidate ownership result |
|---|---:|---|
| Ingredient references | 1,992 | No owner for the proposed ID, bilingual displays, or reviewed name variants |
| Ingredient forms | 205 | No matching label, alias, or match-term owner |
| Legacy import candidates | 55 | No matching ID, name, or alias |
| Research-ledger records | 2,397 | No mâche identity record or candidate. The Gazette PDF has a separately scoped p. 385 garden-orach source record; it is not mâche evidence. |
| Manifest-listed recipes / structured ingredient rows | 114 / 1,123 | No matching full-recipe text or ingredient-row mention |

Accent- and punctuation-normalized exact scans covered `lamb’s lettuce`, `lamb's lettuce`, `lambs lettuce`, `mâche`, `mâche commune`, `doucette`, `corn salad`, `corn-salad`, *Valerianella locusta*, *Valerianella olitoria*, and *Valeriana locusta*. No active reference, form, legacy candidate, ledger record, or prior proposal owns these names or the candidate ID. The 2,179 Markdown files in `docs/catalog/proposals` were checked for these terms and the proposed ID; no focused prior mâche review was found. At scan time, the proposed R976 source-ID prefix was absent from the live ledger and the pre-existing proposal archive.

Nearby identities to preserve:

| Existing identity | Boundary |
|---|---|
| `ingredient-ref-lettuce`, `ingredient-ref-leaf-lettuce`, and `ingredient-ref-romaine-lettuce` | Mâche is a separate leafy crop, not a lettuce type or lettuce form. |
| `ingredient-ref-baby-spinach` | OQLF’s preparation comparison and broad replacement statement do not merge mâche with spinach. |
| `ingredient-ref-garden-cress` and `ingredient-ref-watercress` | Keep *Valerianella* separate from the distinct cress and watercress crops. |
| `ingredient-ref-garden-orach`, `ingredient-ref-escarole`, and `ingredient-ref-radicchio` | Preserve their crop identities and source evidence; none owns mâche terminology. |

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for the display names, aliases, accent/punctuation variants, and scientific names above. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe link, relink, amount, or recipe-specific note is proposed. The identity gap is supported by Québec terminology and external culinary evidence, not by demand in this bundled snapshot.

The same Québec Gazette PDF used below is already recorded on `ingredient-ref-garden-orach` as `WP03-K-GARDEN-ORACH-R873-20261019-S04`, with a separate locator for the garden-orach row on p. 385. Keep that source record unchanged. If this proposal is integrated, add a distinct source record with its own p. 390 `Mâche` locator; do not transfer or broaden the existing garden-orach evidence.

## Measurement, form, and substitution limits

The reviewed sources provide no kitchen amount, household portion, count-to-mass relation, density, reusable conversion, or preparation yield for mâche. OQLF’s plant-height description and Utah State’s seed-depth, sowing-window, and harvest-timing details are horticultural information, not ingredient measurements. Keep `defaultDensity` null, `unitMappings` empty, and forms and measurement observations empty. Do not infer a `raw` or `cooked` form from the general preparation descriptions. [S01–S02]

OQLF says mâche can replace spinach in most recipes. This is a broad, source-specific direction from mâche to spinach; it names no dish role, cooking method, form, ratio, or adjustment. If integrated, preserve the statement only in a `blocked_pending_evidence` substitution finding tied to S01. Add no accepted replacement, active contextual rule, or recipe-line link. [S01]

If accepted, use `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`. Keep measurement observations empty and add no forms, active unit mappings, conversions, yields, recipe links, or substitutions.

## Sources

Sources were reviewed online on 2026-10-19. IDs below are proposal-local and have not been added to the shared ledger.

| Source ID | Source | Supported claim and limits |
|---|---|---|
| `WP03-K-LAMBS-LETTUCE-R976-20261019-S01` | Office québécois de la langue française, [GDT: mâche commune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296905/mache-commune), updated 1991. | Supports the Québec French names `mâche`, `mâche commune`, and `doucette`; English `lamb’s lettuce` and `corn salad`; the listed *Valerianella* names; culinary use raw or cooked; and the broad spinach replacement statement. Its plant-height and culinary advice are not a kitchen measure or a scoped runtime substitution. The entry is old terminology evidence, not a current retail survey. This URL has no current ledger owner. |
| `WP03-K-LAMBS-LETTUCE-R976-20261019-S02` | Utah State University Extension, [How to Grow Lamb’s Lettuce in Your Garden](https://extension.usu.edu/yardandgarden/research/lambs-lettuce-in-the-garden). | Identifies lamb’s lettuce as *Valerianella locusta* and describes it as a cool-season vegetable grown for edible leaves used in salads. Its sowing depth, dates, and harvest guidance are cultivation data, not recipe amounts, kitchen conversions, or a Québec terminology ruling. This URL has no current ledger owner. |
| `WP03-K-LAMBS-LETTUCE-R976-20261019-S03` | *Gazette officielle du Québec*, [27 December 2023 issue (PDF)](https://www.publicationsduquebec.gouv.qc.ca/fileadmin/gazette/pdf_encrypte/gaz_entiere/2352-F.pdf), Appendix I, p. 6325 (PDF page 390). | Lists `Mâche` and names *Valerianella locusta*, alongside a separate Italian mâche entry (*V. eriocarpa*). Supports a Québec crop-name/species crosswalk; it does not standardize the app display, establish a cooking method, or justify broadening to every *Valerianella* species. The PDF URL already has a separately scoped ledger source on the garden-orach record; retain that page-385 record and locator unchanged. |
| `WP03-K-LAMBS-LETTUCE-R976-20261019-S04` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Valeriana locusta* L.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:859937-1). | Current Kew backbone accepts *Valeriana locusta* and lists *Valerianella locusta* and *V. olitoria* among its synonyms. Supports the taxonomic naming note only; it is not evidence of a culinary use, Québec name, or measure. This URL has no current ledger owner. |

## Queue scope and disposition

The open Section K work is generic leafy-green, brassica, and regional produce coverage. The Broccolini mention in the checklist is an alias exclusion, not an assigned product-roster task. No brand-, product-line-, cultivar-, flavour-family-, SKU-, or retailer-variant-only task was encountered in the Section K queue. Any such roster-only work is out of scope because commercial-product counts do not add ingredient diversity; stop that line without researching it. Existing branded entries and product-scoped evidence remain untouched.

Recommend one identity-only `VEGETABLE_AND_AROMATIC` reference, **lamb’s lettuce / mâche**, scoped to the culinary crop commonly known in food sources as *Valerianella locusta* and handled taxonomically as noted above. Add only the OQLF-supported aliases listed in the proposed row. Preserve the existing garden-orach source record and nearby leafy-green identities. Keep the broad spinach replacement claim blocked, and add no form, measurement, recipe link, conversion, yield, or active substitution. Section K’s broader sweep remains open.

This is proposal-only work. No software tests, builds, emulator checks, or deployments were run.

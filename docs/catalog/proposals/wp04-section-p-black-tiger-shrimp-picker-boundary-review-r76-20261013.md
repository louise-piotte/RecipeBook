# WP04 Section P — black tiger shrimp picker-boundary review (R76)

- **Review and source-access date:** 2026-10-13.
- **Status:** Proposal only. No catalog, ledger, checklist, roadmap, batch, generated file, recipe, or application code was edited.
- **Open checklist line:** [Shrimp/prawn by meaningful preparation; crab and crayfish](../../RecipeBook-global-ingredient-catalog-plan.txt#L4362).
- **Candidate:** Black tiger shrimp / *Penaeus monodon*, a species-specific shrimp product.
- **Recommendation:** Hold active allocation because the current picker would resolve the unqualified phrases `tiger shrimp` and `crevette tigrée` to this one species, while the CFIA Fish List assigns both phrases across *P. monodon* and green tiger prawn (*P. semisulcatus*). Keep the exact qualified candidate and Québec product evidence for a later search-boundary review.
- **Source IDs:** `WP04-SECTIONP-BLACK-TIGER-SHRIMP-R76-20261013-S01` through `S05`, local to this proposal.

## Candidate and scope

The Section P shrimp/prawn line remains open after the R74 Northern shrimp integration, the existing generic fresh shrimp/prawn hold, and the review of shrimp powder. This proposal examines only black tiger shrimp (*Penaeus monodon*). It does not reopen Northern shrimp (*Pandalus borealis*), the held Argentine red shrimp (*Pleoticus muelleri*), dried shrimp, shrimp pastes, fish powder, fish balls, surimi, or katsuobushi powder.

The name is not a new generic shrimp identity. OQLF’s species entry maps `crevette tigrée` to *P. monodon* and lists `black tiger shrimp`, `tiger shrimp`, and `giant tiger prawn` as English terms [S01]. The current CFIA Fish List provides a more complicated Canadian naming picture: its *P. monodon* rows include `Black Tiger Shrimp`, `Tiger Shrimp`, `Prawn`, and French `Crevette Tigrée Noire` / `Crevette Tigrée`; its *P. semisulcatus* rows also include `Tiger Shrimp` and `Prawn / Crevette Tigrée` [S02]. The Fish List reports a 2023-09-18 modification date. This is a common-name overlap between two taxa, not a reason to merge their identities.

The candidate has Québec product evidence. Capone Gourmet’s Québec delivery listing is titled `Crevettes Tigrées Crues P&D – Black Tiger` and describes raw, peeled, deveined, IQF product; its page says it delivers across Québec [S04]. A second Québec retailer lists `Crevette géante tigrée` as a 908 g product [S05]. The latter phrase is not the OQLF preferred term: OQLF says `crevette géante tigrée` was not retained for Québec fish-product marketing [S01]. Neither seller page states the Latin name, so the seller pages support local wording and product scope, while OQLF and CFIA supply the taxon crosswalk.

## Québec French and species boundary

Use the OQLF entry as Québec terminology evidence. It identifies the preferred French term `crevette tigrée`, the species *Penaeus monodon*, and English `black tiger shrimp`; it also says the alternative `crevette géante tigrée` was not retained for consumer fish-product labelling [S01]. TERMIUM Plus independently records *P. monodon* with `black tiger shrimp` as a recommended trade name and `crevette tigrée` as the standardized French term [S03]. These references support a bilingual species candidate, but they do not erase the CFIA list’s overlapping `Tiger Shrimp` / `Crevette Tigrée` rows for *P. semisulcatus* [S02].

The Québec seller uses the fuller consumer wording `crevettes tigrées noires` alongside `Black Tiger` [S04]. The conditional integration sketch below uses singular `crevette tigrée noire` as a species-qualified French display, with the seller’s plural wording as its only French alias. Treat that display as market-attested, not as OQLF’s preferred term. Do not use `crevette géante tigrée`, `crevette tigrée` as an alias, `tiger shrimp` as an alias, or `giant tiger prawn` as an alias. The last three names either occur across taxa in the CFIA list or would expose an unqualified query to the current phrase matcher.

## Current ownership and archive audit

The current snapshot contains 1,399 active references, 104 forms, 63 legacy candidates, 1,737 research-ledger records, 8 ledger unit conversions, 114 manifest-listed recipes, and 1,123 ingredient rows.

| Current owner or boundary | Live data | Treatment here |
|---|---|---|
| `ingredient-ref-northern-shrimp` (`PROTEIN`) | `Northern shrimp` / `crevette nordique`; French alias `crevettes nordiques`; null default density; no unit mappings. | Keep distinct by species. No shared aliases or forms. |
| `ingredient-ref-dried-shrimp` (`PROTEIN`) | `dried shrimp` / `crevette séchée`; plural aliases in both languages; null density; no unit mappings. | Keep the dried product separate from raw/frozen black tiger product. |
| `ingredient-ref-saeu-jeot` and `ingredient-ref-kapi-shrimp-paste` | Named salted-fermented shrimp and shrimp-paste products in `SAUCE_AND_CONDIMENT`. | Do not broaden these products to shrimp meat or use them as aliases. |
| `ingredient-ref-fish-balls`, `ingredient-ref-bonga-dried-fish-powder` | Active fish-ball identity and Bonga-specific fish-powder identity. | No terms, forms, or substitutions added for these unrelated products. |
| Prospective `ingredient-ref-black-tiger-shrimp` / *P. monodon* | No active reference, form, legacy identity, or ledger record found. The source-ID prefix is absent from the live ledger and proposal/batch archive. | Conditional candidate only; this proposal recommends no current allocation. |

No form is attached to the active shrimp identities checked above. The R74 Northern shrimp entry is a different species and already has its own Québec display and alias. The previous [generic shrimp/prawn boundary review](wp04-fresh-shrimp-prawn-boundary-review-20261009.md) held only the global unqualified identity; it did not decide *P. monodon*. The [Argentine red shrimp hold](wp04-section-p-argentine-red-shrimp-identity-boundary-review-20261013-round68.md) concerns *P. muelleri* and its `red shrimp` subphrase. An archive search found no focused black-tiger / *P. monodon* allocation or review; the older generic shrimp review mentions tiger prawn only as an animal-health-source example.

The live recipe scan found no candidate phrase or *P. monodon* hit in the 114 recipes / 1,123 ingredient rows. No recipe asks for black tiger shrimp, tiger shrimp, tiger prawn, `crevette tigrée`, or the species. The bundle provides no reason to link a line, choose a product state, or add measurement or substitution behavior.

## Picker projection and hold reason

The projection mirrors the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) phrase-first matching: any complete query phrase contained within a name or alias is returned before substring fallback. The hypothetical row uses the conditional values below and adds no English aliases.

| Query | Current result | If the candidate row were added | Boundary |
|---|---|---|---|
| `black tiger shrimp` | No result | `ingredient-ref-black-tiger-shrimp` | Full English qualifier identifies the candidate. |
| `crevette tigrée noire` | No result | `ingredient-ref-black-tiger-shrimp` | Full French qualifier identifies the candidate. |
| `crevettes tigrées noires` | No result | `ingredient-ref-black-tiger-shrimp` | The Québec seller’s plural product wording. |
| `tiger shrimp` | No result | `ingredient-ref-black-tiger-shrimp` alone | Misleading singleton: CFIA lists `Tiger Shrimp` for *P. monodon* and *P. semisulcatus* [S02]. |
| `crevette tigrée` | No result | `ingredient-ref-black-tiger-shrimp` alone | Misleading singleton: CFIA lists `Prawn / Crevette Tigrée` for both taxa [S02]. |
| `shrimp` | Dried shrimp; saeu-jeot; Northern shrimp | Those three plus black tiger shrimp | Broad query gains a fourth distinct product/species result. |
| `crevette` | Dried shrimp; Northern shrimp | Those two plus black tiger shrimp | Broad query gains a third species/product result. |
| `crevettes` | Seven shrimp or shrimp-condiment results | Those seven plus black tiger shrimp | Broad plural query gains a result through the proposed French plural alias. |
| `prawn`, `giant tiger prawn` | No result | No result | Deliberately unindexed: adding the full synonym would also make bare `prawn` a singleton for *P. monodon*. |
| `dried shrimp`, `northern shrimp` | Their existing single owners | Same owners | No capture of the existing products. |
| `fish powder`, `fish balls`, `surimi` | Bonga powder; fish balls; no result | Same results | The earlier Section P boundaries stay unchanged. |

The qualified searches would work, but the matcher would also strip the distinguishing words in practice: `tiger shrimp` would select only *P. monodon* even though CFIA assigns it to two taxa, and `crevette tigrée` would select only *P. monodon* despite the same Canadian overlap. Empty aliases cannot prevent those partial phrases because they are inside the display names. Hold the row until search can preserve the full qualifier or the relevant species results can be represented together. Do not add another species or modify the matcher in this proposal.

## Product state and numeric evidence limits

- **Identity:** The prospective row is specifically *Penaeus monodon*, supported by OQLF and the species-linked CFIA Fish List [S01, S02]. It is separate from Northern shrimp, Argentine red shrimp, green tiger prawn, dried shrimp, and shrimp-paste condiments.
- **Product wording and state:** Capone Gourmet describes its listing as raw, peeled, deveined, and frozen IQF [S04]. Chicoine lists a raw/uncooked `Crevette géante tigrée` product [S05]. These describe seller SKUs; they do not establish a universal fresh, raw, frozen, peeled, or deveined form.
- **Measurements:** Capone lists package choices of 454 g and 907 g and size labels from 6/8 through 31/40 [S04]. Chicoine lists one 908 g SKU, approximately 16–24 pieces, and an 8/12-per-pound grade [S05]. These are seller-specific package and size observations; neither source defines a reusable household amount or species-wide count-to-mass conversion. No density, unit mapping, measure, edible yield, or cooking yield is supported.
- **Forms and conversion:** Add no forms and no raw/cooked, frozen/thawed, or peeled/shell-on conversion. The sellers describe different product presentations, not one universal form relation.
- **Substitution:** Add no substitution to Northern shrimp, dried shrimp, Argentine red shrimp, fish balls, surimi, fish powder, or other shellfish. The reviewed sources provide no quantity- and method-based interchangeable use.

## Conditional future JSON delta

If a later search review resolves the subphrase collision, the species-only reference to reconsider is:

```json
{
  "id": "ingredient-ref-black-tiger-shrimp",
  "nameFr": "crevette tigrée noire",
  "nameEn": "black tiger shrimp",
  "aliasesFr": ["crevettes tigrées noires"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

The corresponding accepted ledger record would use `recordId: ingredient-ref-black-tiger-shrimp`, `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`, with the proposal’s applicable sources and one accepted decision. Keep `measurementObservations`, `forms`, `unitConversions`, recipe links, yields, and substitutions empty. This proposal itself recommends no reference or ledger record now.

## Source register and limits

Sources were accessed on 2026-10-13. Source IDs are local to this proposal; no shared source records were created.

| ID | Source and locator | Evidence used | Evidence limit |
|---|---|---|---|
| **WP04-SECTIONP-BLACK-TIGER-SHRIMP-R76-20261013-S01** | Office québécois de la langue française, [crevette tigrée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199097/crevette-tigree). | Gives preferred Québec term `crevette tigrée`, English equivalents including `black tiger shrimp`, and *Penaeus monodon*. | Last updated 2012. OQLF’s entry is species terminology; it does not establish the species of a retailer SKU. It does not resolve the CFIA common-name overlap for *P. semisulcatus*. |
| **WP04-SECTIONP-BLACK-TIGER-SHRIMP-R76-20261013-S02** | CFIA, [Fish List shrimp query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=f&q=shrimp). | Shows *P. monodon* with `Black Tiger Shrimp`, `Tiger Shrimp`, and French `Crevette Tigrée Noire` / `Crevette Tigrée`; shows *P. semisulcatus* with `Tiger Shrimp` and `Prawn / Crevette Tigrée`. | Dynamic Canadian common-name list; page reports modification date 2023-09-18. Its same-term/two-taxa entries are the picker hold evidence, not a product-lot identification. |
| **WP04-SECTIONP-BLACK-TIGER-SHRIMP-R76-20261013-S03** | Government of Canada, TERMIUM Plus, [TIGER SHRIMP](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=TIGER+SHRIMP). | Entry for *P. monodon* lists `black tiger shrimp`, `tiger shrimp`, and `giant tiger prawn`; its observations identify the recommended trade term and Québec-standardized French `crevette tigrée`. | Terminology record, not a retail package or a way to resolve the CFIA overlap in current picker results. |
| **WP04-SECTIONP-BLACK-TIGER-SHRIMP-R76-20261013-S04** | Capone Gourmet, [Crevettes Tigrées Crues P&D – Black Tiger](https://caponegourmet.com/products/crevettes-tigrees-crues-pd-black-tiger). | Québec seller pairs `Crevettes Tigrées Noires` with `Black Tiger`; describes raw, peeled/deveined, frozen IQF product and lists package choices/size labels. | Seller listing does not provide a Latin name or independently verify that every selected size/package has the same species or composition. Package and grades are SKU-specific. |
| **WP04-SECTIONP-BLACK-TIGER-SHRIMP-R76-20261013-S05** | Viandes Chicoine, [Crevette géante tigrée](https://www.viandeschicoine.ca/nos-produits/le-poisson/crevette-geante-tigree/). | Québec retailer lists a 908 g product, approximate piece count and 8/12-per-pound grade; describes it as uncooked. | Seller page gives no Latin species and uses `crevette géante tigrée`, which OQLF says was not retained as the Québec fish-product term. The numbers describe that listing only. |

## Static review checks

- Rechecked current `AGENTS.md`, the open checklist line, active reference and form files, legacy candidates, research ledger, and the proposal/batch archive before selecting the candidate.
- Recounted the current package and ledger; checked exact owner, form, legacy, candidate-ID, and source-prefix collisions.
- Scanned all 114 manifest-listed recipes / 1,123 ingredient rows for the candidate names, taxon, and relevant shrimp terms; no matching row or full-file hit was found.
- Projected the table’s queries against the current `IngredientSearch.kt` phrase-first behavior using the conditional reference only; this is static analysis, not a runtime picker or emulator check.
- No tests or emulator were run for this proposal-only research. The project instructions also exempt changes limited to new database JSON data from testing.
- Verified this proposal as strict UTF-8 without BOM, with no mojibake or trailing whitespace and with a final newline; local Markdown links and the checklist line anchor were checked after writing. No other file is part of this R76 change.

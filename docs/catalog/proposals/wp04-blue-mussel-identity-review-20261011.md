# WP04 Section P — blue mussel identity review

- **Packet type:** species identity and search-boundary review; integrated.
- **Review date:** 2026-10-11.
- **Scope:** a species-scoped *Mytilus edulis* / blue mussel identity under the open mollusk checklist item. This review does not assign a generic “mussel” recipe or product to that species.
- **Disposition:** integrate an identity-only blue-mussel reference. Keep the existing generic mussel candidate unresolved and separate.

## Recommendation

Add a distinct active reference for *Mytilus edulis*. OQLF's food-mollusc entry identifies *moule* as its preferred Québec French commercial name and pairs it with English **blue mussel** and the Latin name *Mytilus edulis*. Fisheries and Oceans Canada says blue mussel is the single mussel species harvested in Canada. A current Metro product listing also names PEI Blue Mussels and gives *Mytilus edulis*, while Québec sources use **moule bleue** for the same binomial. This is enough to support the specific identity and a concrete Canadian product target, even though the bundled recipes do not request mussels.

Keep the reference explicitly species-scoped. Do not add bare `mussel`, `mussels`, `moules`, `mouque`, `moucle`, `edible mussel`, or the scientific name as search aliases. OQLF lists `moule bleue` as a term used in some contexts but says it is not its normalized commercial label; the current CFIA Fish List, MAPAQ material, and product listings also use it for this species. It can be retained as a **search alias only**, while `moule` remains the preferred French display. The English plural `blue mussels` is supported by current Canadian product wording. Do not map a recipe line that says only “mussels” to this reference.

This proposal does not add a form for fresh, frozen, brined, canned, or smoked mussels. Those products are mentioned by Québec sources, but the bundle has no target recipe or package-state request to resolve. Add no density, unit mapping, measure, yield, conversion, recipe link, or substitution.

## Proposed identity-only reference JSON

```json
{
  "id": "ingredient-ref-blue-mussel",
  "nameFr": "moule",
  "nameEn": "blue mussel",
  "aliasesFr": [
    "moule bleue",
    "moules bleues"
  ],
  "aliasesEn": [
    "blue mussels"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "PROTEIN"
}
```

`moule bleue` and its plural are search aliases, not the preferred Québec display. The scientific name belongs in the evidence/ledger record, not in the user-facing alias list. Keep `ingredient-ref-mussel` as a separate unresolved candidate for the unqualified term; do not reuse its generic scope as the new row ID.

## Catalog, candidate, and recipe audit

At this review snapshot, the active bundle contains **1,030 ingredient references / 72 forms**; the legacy import file contains **75 candidates**. Exact normalized-key checks found no owner in active reference names/aliases, form labels/match terms, or legacy candidate names/aliases for `blue mussel`, `blue mussels`, `mussel`, `mussels`, `edible mussel`, `moule`, `moules`, `moule bleue`, `moules bleues`, `mouque`, `moucle`, or `Mytilus edulis`. French `semoule` rows are not exact `moule` collisions: the ingredient search first checks complete word phrases, so the proposed `moule` term wins as a phrase instead of falling through to the old substring match.

The ledger has the existing held candidate `ingredient-ref-mussel`, with two source entries from the 2026-10-09 shellfish review. No separate blue-mussel record or `WP04-BLUE-MUSSEL-20261011-` source IDs exist. The old candidate says that multiple mussel species are harvested in Canada; the targeted DFO page now reviewed says the following **single** species of mussel is harvested and names *Mytilus edulis*. This changes the evidence for a species-scoped Canadian identity, but does not make every generic or imported mussel request equivalent to blue mussel. If this proposal is integrated, keep the generic candidate's scope unresolved and append new, uniquely identified evidence rather than turning it into a generic active row.

I scanned all **114 bundled recipe files / 1,123 ingredient rows**. There are **0 exact ingredient-row hits** for blue mussel, mussel, moule, or *Mytilus edulis*. French `moule` occurs in some instruction text as a baking pan, not as a food ingredient. The bundle therefore supplies no recipe demand and no basis for linking a generic mussel line.

Prior-proposal audit found the broad [2026-10-09 mollusk boundary review](wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md), which held generic mussel pending a recipe or product target and cited the DFO bivalve page. No prior proposal separately reviewed the species-scoped blue-mussel row or these exact aliases. The present product and species evidence supports resolving that narrower identity while preserving the broader generic boundary.

### Search behavior note

The ingredient index accepts complete word phrases inside a longer term. A bare English query `mussel` can therefore match the words in the stored name `blue mussel`; that behavior is not a stored generic alias or permission to link an unqualified recipe. If the product requirement is that a bare query must not surface this species row, that requires a search-scope change outside this identity-only proposal. The JSON itself does not claim a generic mussel identity.

## Naming and market evidence

| Evidence | Finding | Limit |
|---|---|---|
| **S01 — OQLF, [`moule` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198877/moule)** | In the food-mollusc domain, gives preferred Québec term `moule`, English `blue mussel` (also lists `edible mussel`), and Latin *Mytilus edulis*. It says the name denotes a fishery species with commercial potential in Québec. | The entry's note says `moule bleue`, `moucle`, and `mouque` were not retained for Québec commercial fish-product labeling. Do not display those as preferred labels or broaden them to other species. |
| **S02 — Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm)** | Under “Mussels,” says the single species harvested is Blue mussel (*Mytilus edulis*); it notes Atlantic and Pacific coasts and farming in the Maritimes. | This is a Canadian harvested-species identification page, not a statement that every mussel sold in Canada or named in a recipe is *M. edulis*. The page date is 2021-06-09. |
| **S03 — CFIA, [Fish List result for Blue](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue&wbdisable=true)** | Current search result lists TSN 79454, *Mytilus edulis*, **Blue Mussel / Moule Bleue**. CFIA's [Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) describes the list as common-name guidance for Canadian fish labeling. | This differs from OQLF's older note that `moule bleue` was not retained for commercial labeling. Use OQLF's preferred `moule` as the French display; the CFIA result supports `moule bleue` only as an attested species-specific search term here. It is not a reason to add bare `moule` as a generic alias—the display is species-scoped by OQLF. |
| **S04 — Gouvernement du Québec, [Aquaculture](https://www.mapaq.gouv.qc.ca/fr/Peche/aquaculture/Pages/Aquaculture.aspx) and [La mytiliculture](https://www.mapaq.gouv.qc.ca/SiteCollectionDocuments/Pecheetaquaculturecommerciales/Mytiliculture.pdf)** | The current MAPAQ page, last updated 2026-04-14, lists `moule bleue` among Québec's cultivated marine species. The linked mytiliculture factsheet identifies the blue mussel as *Mytilus edulis*. | Supports Québec species and market context, not a preferred display over OQLF, a recipe link, or package-state conversions. |
| **S05 — Metro, [PEI Blue Mussels](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/mussels-clams/pei-blue-mussels/p/208326) / [French listing](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/moules-et-palourdes/moules-bleue-de-l-ile-du-prince-edouard/p/208326)** | The same product number 208326 is titled PEI Blue Mussels in English and “Moules bleue de l'Île-du-Prince-Édouard” in French; both listing snippets identify *Mytilus edulis* and Northwest Atlantic, Canada. | The retailer pages returned 403 on direct open; the indexed product listing was available during this review. Retail names and availability can change. Its French title also has a number/agreement typo, so it is not the display-string source. |
| **S06 — CFIA, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species)** | Lists *Mytilus edulis* as blue mussel and *Mytilus galloprovincialis* as Mediterranean mussel. | CFIA expressly says these common names are for aquatic-animal-health purposes and do not replace the Fish List. Use only as a reminder that “mussel” is not globally species-specific, not as consumer-label evidence. |

## Integration boundary

1. Add only the species-scoped `ingredient-ref-blue-mussel` row above, with no recipe links or measurement behavior.
2. Keep `moule` as the preferred Québec French display. Permit `moule bleue` / `moules bleues` and `blue mussels` only as search aliases for this *M. edulis* identity; do not add generic standalone `mussel(s)` / `moules` aliases or unscoped taxonomic terms.
3. Preserve the generic `ingredient-ref-mussel` candidate as unresolved. Do not link a generic recipe or product line to this species without explicit species or product evidence.
4. Leave other shellfish and Section P gaps open. This review resolves only the blue-mussel species identity.

## Coordinator integration checkpoint — 2026-10-11

- Added `ingredient-ref-blue-mussel` as an identity-only reference and generated its catalog index entry.
- Added six source entries and an accepted identity decision to the new ledger record. Added DFO, CFIA Fish List, and CFIA species-list evidence to the existing generic `ingredient-ref-mussel` candidate, whose state remains `needs_clarification`.
- Kept all recipe links and measurement/substitution behavior unchanged. The new row has no forms or unit mappings.
- The package now has 1,031 references, 72 forms, 114 recipes, and 1,123 ingredient rows. The ledger has 1,322 records, 4,308 source entries, and 3,541 distinct source IDs.
- Package/ledger validation, normalization, generated-index freshness, collision/demand, encoding, and whitespace checks passed. No tests or emulator were run because this change adds database JSON data only under `AGENTS.md`.
- Integration record: [`../batches/wp04-blue-mussel-identity-integration-20261011/README.md`](../batches/wp04-blue-mussel-identity-integration-20261011/README.md).

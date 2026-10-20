# WP03 Section K — okra-leaf identity review (R982)

Reviewed 2026-10-19. Proposal only; no catalog, ledger, recipe, plan, roadmap, or generated files were changed.

## Recommendation

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for the edible leaves of *Abelmoschus esculentus*: **okra leaves / feuilles de gombo**. This is a distinct plant-part ingredient from the existing `okra / gombo` identity, whose accepted scope is the immature edible pod. North Carolina State Extension describes the leaves as edible and says they may be cooked or eaten raw; PROSEA says okra leaves are sometimes used as spinach; the FAO West African table lists `Okra, leaves / Gombo, feuilles` separately from okra fruit and identifies the species. [S02–S04]

Keep the scope to food-use leaves of *A. esculentus*. Do not include the pods, flowers, seeds, stems, dried leaf products, or leaves of related *Abelmoschus* species. Do not alias `spinach` based on PROSEA's comparison, or infer interchangeability from that wording. Leave aliases empty: the existing `okra / gombo` names and its `bhendi`, `bamia`, `ochro`, and `ochros` aliases remain owned by the pod identity; none is transferred to leaves without part-specific evidence. The French display is a descriptive, part-qualified compound supported by the FAO bilingual food name, not a separate OQLF terminology ruling. [S01, S04]

## Proposed minimal reference state

```json
{
  "id": "ingredient-ref-okra-leaves",
  "nameFr": "feuilles de gombo",
  "nameEn": "okra leaves",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

If accepted, create one `ingredient_reference` ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, using only the new proposal-local source records below. Add no form, measurement observation, density, unit mapping, conversion, yield, recipe link, or substitution rule. The source food-composition figures are not household measures, and the boiled-leaf row is not a conversion or a proposed form.

## Ownership and boundaries

The current working-tree catalog contains 1,998 ingredient references, 205 forms, 55 legacy candidates, and 2,403 research-ledger records. The active identity is `ingredient-ref-okra` (`okra / gombo`) in `VEGETABLE_AND_AROMATIC`; its accepted ledger decision explicitly scopes it to immature edible pods. Its owned evidence remains on that row: OQLF (`WP03-L-GOURDS-OKRA-IDENTITY-20261009-S16`), OMAFRA (`...-S17`, `...-S18`), and the Trinidad and Tobago crop-name and recipe sources (`WP06-CAR-EN-GAP-20261011-S04`, `...-S05`, `...-S26`). Those records support the current pod identity and aliases, not the leaf identity. Preserve the row, aliases, and source ownership unchanged.

Exact and case/accent-normalized scans across active reference IDs, displays and aliases; forms and match terms; legacy candidate content; ledger record IDs and source IDs; and the proposal/batch archive found no owner for `ingredient-ref-okra-leaves`, `okra leaves`, `feuilles de gombo`, or the proposed R982 source-ID prefix. No okra-leaf form or legacy candidate exists. The existing broad `okra / gombo` wording must stay on the current pod row; the new displays remain part-qualified, with no broad aliases.

The proposed sources concern the generic plant and plant part, not a commercial product. No brand, product-line, flavour-family, cultivar-roster, SKU, or retailer-variant research was conducted. If a queue item limited to such a roster is encountered, it is out of scope because **commercial-product counts do not add ingredient diversity**; stop that research line. The Section F commercial cereal rosters and named Anson Mills wheat-meal lead remain out of scope for that reason. Preserve all existing branded rows and keep product-specific evidence scoped; this proposal transfers none.

## Bundled recipe demand

All 114 manifest-listed recipe files and their 1,123 structured ingredient rows were scanned for `okra`, `gombo`, `okra leaves`, `feuilles de gombo`, and *Abelmoschus esculentus*. There were zero matching recipe files and zero matching ingredient rows. No recipe link, relink, quantity, or substitution is proposed; the identity is supported by the open generic leafy-greens and regional-greens sweep, not by bundled recipe demand.

## Sources and limits

These IDs are unique to this proposal and were absent from the shared ledger and proposal archive at review time. Online sources were accessed 2026-10-19.

| ID | Source | What it supports and what it does not support |
|---|---|---|
| `WP03-K-OKRA-LEAVES-R982-20261019-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Abelmoschus esculentus* (L.) Moench](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:558006-1/general-information) | Supports the accepted species and the botanical boundary for the proposed leaves. Kew's account chiefly describes edible immature fruit; that fruit evidence is not transferred to leaves. |
| `WP03-K-OKRA-LEAVES-R982-20261019-S02` | North Carolina State University Extension, [*Abelmoschus esculentus*](https://plants.ces.ncsu.edu/plants/abelmoschus-esculentus/) | Identifies the species and states that its leaves are edible and may be cooked or eaten raw. Its horticultural instructions, cultivar notes, and other plant-part descriptions do not establish a household measure or a universal handling rule. |
| `WP03-K-OKRA-LEAVES-R982-20261019-S03` | PROSEA, [*Abelmoschus esculentus* (L.) Moench, Plant Resources of South-East Asia No. 8: Vegetables](https://prosea.prota4u.org/view.aspx?id=2130) (1993) | States that the leaves are sometimes used as spinach or cattle feed. This supports a regional leaf-use identity only; the spinach comparison is not a synonym or substitution, and no amount or common preparation is generalized. |
| `WP03-K-OKRA-LEAVES-R982-20261019-S04` | FAO/INFOODS, [West African Food Composition Table / Table de composition des aliments d'Afrique de l'Ouest](https://www.fao.org/4/i2698b/i2698b00.pdf), p. 34, food codes `04_004` and `04_041` | Lists raw and boiled okra leaves separately from okra fruit, pairs English `Okra, leaves` with French `Gombo, feuilles`, and names *Abelmoschus esculentus* (also shown with the synonym *Hibiscus esculentus*). Use only the name, species, and plant-part distinction. Do not import composition values, the source-specific boiled state, or a cooked-to-raw conversion. This URL is already cited by ledger source `WP03-S37` for black fonio on p. 19; that source ID and its fonio locator stay there. This proposal uses a new, leaf-specific source ID and locator; no fonio evidence is transferred. |

## Disposition

Recommend only the identity-only `okra leaves / feuilles de gombo` reference above, with empty alias arrays and no forms or numeric behavior. Keep it distinct from the existing immature-pod identity, preserve all current rows and evidence, and leave measures and substitutions unresearched. Section K's broader leafy-green and regional-green sweep remains open.

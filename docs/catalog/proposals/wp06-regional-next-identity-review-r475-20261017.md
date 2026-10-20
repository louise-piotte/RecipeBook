# WP06 Madagascar Voatsiperifery pepper identity review

- **Date:** 2026-10-17
- **Status:** Proposal only; no shared catalog, ledger, plan, or roadmap edits made.
- **Scope:** One Madagascar regional spice identity under the still-open African cuisine-coverage item in Section 05. This is distinct from R390 pinhão and the recent European protected-product reviews.
- **Recommendation:** Accept a source-named, identity-only `Voatsiperifery pepper` row, displayed as `Voatsiperifery pepper` / `poivre Voatsiperifery`, with no aliases. Keep the culinary product identity separate from an asserted botanical species.

## Open-plan fit and prior-work boundary

Section 05 still lists North, West, Central, East, and Southern African coverage as open. Its earlier bounded six-region sweep integrated eight reviewed identities but left the wider Africa item open. Madagascar is a distinct island food region within that open African review; this single spice does not close the checklist. The immediately recent Ethiopian koseret packet concerns a herb and does not duplicate this Madagascar pepper.

The active references, ingredient forms, legacy identities, research ledger, and proposal archive were searched for `voatsiperifery`, `voatsipérifery`, `tsiperifery`, `tsiperiféry`, `Piper borbonense`, and the descriptive names below. No active or archived owner for this culinary identity was found. This review does not reopen generic pepper boundaries or make voatsiperifery an alias of black pepper.

## Live package snapshot

Counts and hashes were refreshed from the shared worktree on 2026-10-17 before drafting. Hashes cover exact file bytes. The recipe aggregate follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, its exact recipe file bytes, and a NUL byte.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,753 references | 570,732 | `fbbf9ea0c6cbbb506527168ddfbde3a2d393e70bde40c2afd6a838b51863a59d` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 141 forms | 111,459 | `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` |
| `docs/catalog/legacy-import-identities.v1.json` | 56 candidates | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `docs/catalog/research-ledger.v1.json` | 2,112 records; 9,624 source entries; 8,171 distinct source IDs | 9,839,530 | `176ab7fef52b156ccfa1d5a979102b8bed025ffe1569a9130951074a926d1d58` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe JSON aggregate | 114 files; 1,123 ingredient rows | — | `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

The proposed reference ID `ingredient-ref-voatsiperifery-pepper`, proposal-local source-ID prefix `WP06-MADAGASCAR-VOATSIPERIFERY-R475-20261017-S`, and target proposal path were absent from the catalog, forms, legacy IDs, ledger, and proposal archive at audit time. None of the seven exact source URLs below has an existing source entry in the ledger. Recheck ownership and URLs at any later integration.

## Candidate identity and boundaries

| Candidate reference ID | Proposed English / fr-CA display | Category | Alias recommendation |
|---|---|---|---|
| `ingredient-ref-voatsiperifery-pepper` | `Voatsiperifery pepper` / `poivre Voatsiperifery` | `BAKING_AND_SPICE` | No aliases. Keep `aliasesEn` and `aliasesFr` empty. |

The French display is attested by a Québec chef’s recipe wording, and a Montréal spice retailer lists Voatsiperifery products bilingually for Canadian customers. The borrowed Malagasy product name is clearer than a broader translated description. It is market evidence, not an OQLF terminology ruling.

Do not attach a species name to the row. CIRAD distinguishes `voatsiperifery` (the peppercorn/fruit) from `tsiperifery` (the vine). A FOFIFA/Université d’Antananarivo thesis documents multiple morphotypes and unresolved taxonomic assignments; 2018 peer-reviewed taxonomy work says newly described Malagasy Piper species may contribute to the commercial spice. A 2025 phytochemical paper treats a Madagascar *Piper borbonense* sample as voatsipérifery but also says berry identity is difficult to secure. Together these support the source-named food identity while leaving botanical scope out of global aliases.

| Query or boundary | Live ownership or evidence | Disposition |
|---|---|---|
| `Voatsiperifery`, `Voatsiperifery pepper`, `poivre Voatsiperifery` | No exact active reference, form, legacy, ledger candidate, or proposal owner. | Add the new identity with only the two display terms. These become exact phrase searches. |
| `tsiperifery` | No active owner. CIRAD distinguishes the vine name from the fruit name. | Keep out of aliases; it may refer to the plant rather than the ingredient. |
| `Piper borbonense` | No active owner. Research and trade sources associate the name with this species, while the identity of commercial berries is not consistently settled. | Keep as provenance/taxonomic discussion, not as a culinary alias or a hard species assertion. |
| `Piper malgassicum`, `Piper tsarasotrae` | No active owner. A peer-reviewed 2018 paper reports these Malagasy species may contribute to the marketed voatsiperifery pepper. | Keep out of aliases; they are not established synonyms for every product sold under the culinary name. |
| `poivre sauvage de Madagascar`, `wild pepper from Madagascar`, `Madagascar wild pepper` | No exact catalog owner, but these are descriptive names used across source contexts where the trade identity may be mixed. | Hold from aliases to avoid a broad or taxonomically uncertain match. |
| `black pepper` / `poivre noir` | Active `ingredient-ref-black-pepper` has `pepper` and `poivre` aliases and is used by many bundled recipe lines. | Keep black pepper (*Piper nigrum*) separate. One external recipe’s optional alternative does not establish identity or broad interchangeability. |
| `Voatsiperifery Noir/Black`, `Voatsiperifery Blanc/White`, `Voatsiperifery Pourpre/Purple` | Montréal retailer currently lists three color-labelled Voatsiperifery products. | Keep these product qualifiers outside global aliases and forms; the listing does not establish one uniform processing or botanical relationship. |

The picker normalizes accents and prefers complete word phrases before partial matches. Current exact probes return zero results for `voatsiperifery`, `Voatsiperifery pepper`, and `poivre Voatsiperifery`. The bare `pepper` query currently returns 32 references and would return 33 after this row; `poivre` currently returns 9 and would return 10. These broad-query additions follow from the proposed display names. `wild pepper from Madagascar` remains unmatched because it is intentionally not an alias.

## Proposed data changes

Add one identity-only reference row:

```json
{
  "id": "ingredient-ref-voatsiperifery-pepper",
  "nameFr": "poivre Voatsiperifery",
  "nameEn": "Voatsiperifery pepper",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "BAKING_AND_SPICE"
}
```

For the research ledger, add one `ingredient_reference` record with identity `verified`. Keep measurement status at `researched_no_supported_value` for a reusable kitchen value: EKL Export reports a 450–550 g/L bulk-density range for its whole dried berries, but does not state a measurement or packing method; its 25/50 kg bags are exporter packaging. Preserve that range only in the source explanation if useful; do not activate `defaultDensity`, a unit mapping, or a generic conversion. The Québec recipe below gives one recipe-specific quantity, 1/2 tablespoon ground pepper for a sauce serving four, which is not a reusable mass or density measure.

The same Québec recipe explicitly offers black pepper in that one beef-sauce recipe. If retained in the ledger, scope this as one supported contextual finding from `ingredient-ref-voatsiperifery-pepper` to `ingredient-ref-black-pepper`, with no `ruleId` and a limitation that the evidence applies only to the published sauce. Add no active substitution rule. No forms, recipe links, package yields, conversions, or other active measurement data are proposed.

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned, including full serialized recipe text, with case- and accent-insensitive probes for `Voatsiperifery`, `Tsiperifery`, *Piper borbonense*, `poivre sauvage de Madagascar`, and `wild pepper from Madagascar`. There were zero full-recipe hits and zero ingredient-line hits. No bundled recipe link or row change is proposed.

Separately, a Québec chef recipe uses `1/2 c. à table de poivre Voatsiperifery moulu (ou poivre noir)` in a sauce for four servings. This supports the fr-CA name and one dish-specific optional substitute only. Do not import its amount as a reusable measure or generalize black pepper as a universal replacement.

## Sources and limits

Sources were checked on 2026-10-17. The proposal-local source IDs below are not in the shared research ledger.

| ID | Source and locator | Claim used and limit |
|---|---|---|
| **WP06-MADAGASCAR-VOATSIPERIFERY-R475-20261017-S01** | Harizoly Razafimandimby, Université d’Antananarivo / FOFIFA, [doctoral thesis on the diversity of Tsiperifery (*Piper* spp.)](https://www.fofifa.mg/wp-content/uploads/2021/01/Th%C3%A8seVF_Rharizoly_EDGRND_compressed.pdf), 2017; summary pp. iii–iv, taxonomy pp. 18–19, 79–80 and 150–151. | Uses `Tsiperifery` / `poivre sauvage de Madagascar` for a commercial and traditional spice; reports four morphotypes, ambiguity linking the name to one or more species, and a need for further taxonomic revision. It is a Malagasy research thesis, not a current retail specification. |
| **WP06-MADAGASCAR-VOATSIPERIFERY-R475-20261017-S02** | Palchetti et al., [“Two new Malagasy species of genus *Piper* L. … and their phylogenetic position”](https://doi.org/10.3906/bot-1712-2), *Turkish Journal of Botany* 42 (2018): 610–622. | Describes *P. malgassicum* and *P. tsarasotrae* and reports they contribute to local voatsiperifery pepper, probably mixed with *P. borbonense*. Supports keeping the product name separate from a species alias. |
| **WP06-MADAGASCAR-VOATSIPERIFERY-R475-20261017-S03** | Serino et al., [“Analytically Unsupervised Metabolomic Profile of the Premium Malagasy Pepper Voatsipérifery (*Piper borbonense*)”](https://pubmed.ncbi.nlm.nih.gov/40215346/), *Journal of Agricultural and Food Chemistry* 73 (2025): 9854–9866. | Uses Madagascar-origin *P. borbonense* berries known locally as voatsipérifery, while stating that securing berry identity is difficult. Supports the association but does not establish that all trade lots share this species. |
| **WP06-MADAGASCAR-VOATSIPERIFERY-R475-20261017-S04** | CIRAD, [“On the trail of the world’s best pepper”](https://www.cirad.fr/en/cirad-news/news/2024/voatsiperifery-a-wild-pepper-from-madagascar), 4 March 2024. | Describes dried voatsiperifery peppercorns from Madagascar and distinguishes `voatsiperifery` (fruit) from `tsiperifery` (plant); it states no valid scientific name was available as of its publication. This predates the 2025 metabolomic paper and is used for culinary naming and context, not current species status. |
| **WP06-MADAGASCAR-VOATSIPERIFERY-R475-20261017-S05** | Montréal retailer BeSpices, [bilingual online spice shop](https://www.bespices.com/shop), current product list and shipping policy. | Lists Noir/Black, Blanc/White, and Pourpre/Purple Voatsiperifery products and provides Québec/Canadian shipping terms; the storefront is at 4160 rue Saint-Denis. Supports current Canadian bilingual product naming, not the species or common processing relationship among colors. |
| **WP06-MADAGASCAR-VOATSIPERIFERY-R475-20261017-S06** | Recettes-de-chefs.ca, [Laurent Godbout’s bavette recipe with Voatsiperifery pepper sauce](https://recettes-de-chefs.ca/laurent-godbout/bavette-de-boeuf-farcie-aux-champignons-aligot-au-blackburn-et-sauce-au-poivre-voatsiperifery/), ingredient list. | Uses the French wording `poivre Voatsiperifery moulu` and lists 1/2 tablespoon or black pepper in this sauce for four. Recipe-specific quantity and alternative only; not a general conversion or substitute rule. |
| **WP06-MADAGASCAR-VOATSIPERIFERY-R475-20261017-S07** | EKL Export, [Wild Pepper (Voatsiperifery) product datasheet](https://ekl-export.mg/wp-content/uploads/2025/08/product-datasheet-EKL-EXPORT.pdf), 2025. | Names whole dried berries, gives 450–550 g/L bulk density, and lists 25/50 kg packages. Measurement method and packing basis are unspecified; retain only as source-specific evidence and do not generalize. |

## Next actions

1. Coordinator: decide whether to add `ingredient-ref-voatsiperifery-pepper` as an identity-only `BAKING_AND_SPICE` row with the displays above and empty aliases.
2. If accepted, add proposal source evidence to the ledger, keep the taxonomy boundary explicit, and decide whether to preserve the one recipe-specific black-pepper option as a scoped finding without an active rule.
3. Keep the exporter density range, color-labelled retail products, scientific names, and descriptive “wild pepper” names out of active defaults and aliases unless later evidence supports a tighter reusable boundary.
4. Continue the still-open African cuisine-coverage review; this identity does not close Section 05.

This deliverable is proposal documentation only. No tests, build, emulator, or deployment checks were run.

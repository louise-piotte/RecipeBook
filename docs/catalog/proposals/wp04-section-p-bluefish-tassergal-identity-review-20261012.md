# WP04 Section P — Bluefish / tassergal identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only species identity, naming, exact-key, recipe-demand, measurement, substitution, and picker-boundary review.
- **Disposition:** propose one identity-only PROTEIN reference for bluefish / tassergal (*Pomatomus saltatrix*). Add no aliases, form, recipe link, density, unit mapping, yield, conversion, or substitution.
- **Worktree scope:** root integrated this review into the shared catalog and evidence ledger; see the batch README for exact data changes and static validation.

## Bounded decision

| Candidate ID | Category | English display | fr-CA display | Aliases | Species |
|---|---|---|---|---|---|
| `ingredient-ref-bluefish` | `PROTEIN` | **bluefish** | **tassergal** | None | *Pomatomus saltatrix* |

OQLF gives **tassergal** as the Québec French term for this edible fish, pairs it with English **bluefish**, and identifies *Pomatomus saltatrix*. The CFIA Fish List independently returns the same species and English/French common-name pair. This supports one species-scoped reference. The candidate is not a generic blue-coloured fish, a snapper, or a preparation state.

If accepted, the active reference row should remain identity-only:

~~~json
{
  "id": "ingredient-ref-bluefish",
  "nameFr": "tassergal",
  "nameEn": "bluefish",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "PROTEIN"
}
~~~

No alias is needed to establish the accepted bilingual name pair. In particular, do not add **snapper**: DFO’s Atlantic fish atlas notes that juvenile bluefish may be called “snappers,” while the unqualified market name can refer to other fish and is a separate held boundary in Section P. Keep fish products and states such as whole fish, fillet, frozen, smoked, salted, and cooked outside this species identity.

## Section P status and prior-work boundary

The current Section P checklist still leaves finfish and regional seafood coverage open. Existing Section P integration and hold decisions cover many fish and seafood identities, but none of the current live references, forms, legacy candidates, ledger records, proposals, or batches owns or proposes this bluefish/tassergal identity. This is a distinct species candidate; it does not reopen the held generic snapper decision or any other fish-product boundary.

The review-time exact-key audit used the repository ingredient search normalization (Unicode normalization, case and accent folding, punctuation-to-space, and whitespace collapse). Before integration it found no exact owner for `bluefish`, `blue fish`, `tassergal`, *Pomatomus saltatrix*, `Pomatomidae`, `snapper`, `snappers`, `blue runner`, `ingredient-ref-bluefish`, or `candidate-bluefish` among active reference names/aliases, form labels/match terms, legacy candidate names/aliases, or ledger record IDs. The proposal-local source ID range `WP04-SECTIONP-BLUEFISH-20261012-S01` through `S06` was then unallocated; root recorded the sources on `ingredient-ref-bluefish` during integration.

Snapshot read from the live worktree before this proposal was written on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus digest iterates manifest-listed recipe paths in manifest order and hashes each relative path, a NUL byte, the exact file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,248 references | `ff463caf37891f5ec56b27c739a6ee7c97ac17e5f6fbe6fe0b49eaa5d76905d8` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,555 records | `afbc8dcf991e21a3a1e6527f43a1df8a1b9739041d07c6f29a71622004b4d896` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

The full phrase `bluefish` is suitable as the display; do not add shorter aliases such as `blue` or `fish`, which would broaden searches beyond this species. This audit establishes no exact-key collision; it does not claim that partial picker searches for short fragments are exclusive.

## Bundled recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. The audit searched full recipe JSON text and ingredient-row values for `bluefish`, `blue fish`, `tassergal`, *Pomatomus saltatrix*, `Pomatomidae`, `snapper`, `snappers`, and `blue runner`. It found **zero matching recipe files and zero matching ingredient rows**. Nearby seafood entries such as crab, salmon, fish sauce, and tuna do not name or imply bluefish. No recipe link or recipe-specific amount is supported by the bundled corpus.

## Measurement, density, and substitution limits

- NOAA Fisheries’ “Blackened Bluefish with Tropical Salsa” recipe calls for one 4-ounce bluefish fillet per person and gives a pan-cooking time of about two minutes per side. This is one recipe-specific amount and method. The page does not establish a general serving rule, count-to-weight conversion, raw/cooked basis, or a product yield.
- Health Canada’s general reference-amount table gives 125 g raw / 100 g cooked for a broad class of marine and freshwater animals without sauce. This is nutrition-labelling context, not a bluefish-specific recipe measure or a raw-to-cooked conversion.
- No reviewed source supports a transferable bluefish density, volumetric mapping, edible yield, package yield, or standardized fillet weight. Keep `defaultDensity` null and `unitMappings` empty; do not encode the NOAA recipe amount as a default conversion.
- The reviewed identity and recipe sources do not establish a safe global or dish-scoped substitute for bluefish, or a reciprocal substitution from another species. No source-backed substitution rule is proposed. Do not infer equivalence from bluefish being used as a fillet or from general “fish” wording.

## Recommended integration delta

1. Add `ingredient-ref-bluefish` as a `PROTEIN` reference with English display `bluefish`, Québec French display `tassergal`, and no aliases.
2. Add a verified identity ledger record for *Pomatomus saltatrix* with the six sources below. Keep measurement and substitution behavior unset or marked according to the ledger’s existing no-supported-data convention.
3. Add no recipe link, form, measurement conversion, density, yield, package data, or substitution. Keep `snapper` and other species/product identities separate.

## Sources

Sources were accessed or rechecked on 2026-10-12. The records below support the stated identity and evidence limits; source-specific recipe or labelling amounts must not be generalized.

| Source ID | Primary / authoritative source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BLUEFISH-20261012-S01** | OQLF, [tassergal (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198905/tassergal) | In zoology/ichthyology and edible-fish contexts, gives the Québec term **tassergal**, English **bluefish**, and *Pomatomus saltatrix*. The entry describes the fish as having commercial potential in Québec; it does not establish current retail availability, recipe demand, or product state. Last updated 1998. |
| **WP04-SECTIONP-BLUEFISH-20261012-S02** | CFIA, [Fish List query for *Pomatomus saltatrix*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue&wbdisable=true) | The Fish List result identifies taxonomic serial number 168559, *P. saltatrix*, English **Bluefish**, French **Tassergal**, family Pomatomidae, and a histamine hazard grouping. This supports Canadian fish-name/species identity only; the hazard grouping is not encoded as recipe or handling advice. Fish List modification date shown: 2023-09-18. |
| **WP04-SECTIONP-BLUEFISH-20261012-S03** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Canadian labeling role of the Fish List and its species-linked common names. It does not establish recipe intent or culinary interchangeability. |
| **WP04-SECTIONP-BLUEFISH-20261012-S04** | Fisheries and Oceans Canada, [Atlantic fish atlas, bluefish entry (PDF)](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/40899019_Part2.pdf) | Identifies Bluefish / Tassergal as *P. saltatrix* in the Canadian Atlantic and notes the occasional “snapper” name for juveniles. The latter is a reason to keep `snapper` out as an alias, not a general synonym. Biological and regional context, not culinary conversion evidence. |
| **WP04-SECTIONP-BLUEFISH-20261012-S05** | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html) | Current table’s generic “marine and fresh water animals without sauce” category lists 125 g raw / 100 g cooked. This broad labelling reference does not define a bluefish serving, density, or recipe conversion. |
| **WP04-SECTIONP-BLUEFISH-20261012-S06** | NOAA Fisheries, [Main dish recipes — Blackened Bluefish with Tropical Salsa](https://www.fisheries.noaa.gov/insight/main-dish-recipes) | Recipe calls for a 4-ounce bluefish fillet per person and describes cooking it for about two minutes per side. One U.S. recipe observation only; it does not provide a generalized conversion, product yield, or substitute. |

No tests or emulator checks were run for this proposal-only review.

# WP04 Section P Greenland-halibut identity integration

Integrated on 2026-10-12 after the bounded [identity review](../../proposals/wp04-section-p-greenland-halibut-identity-review-20261012.md).

## Change

- Added `ingredient-ref-greenland-halibut` as `Greenland halibut / flétan du Groenland` (*Reinhardtius hippoglossoides*), category `PROTEIN`.
- Added only the French search alias `flétan noir`; English aliases remain empty. Kept `defaultDensity` null and `unitMappings` empty.
- Added six ledger sources and an accepted identity decision.
- Preserved CNF food 3013’s `1/2 fillet = 204.0 g` and `1 food guide serving = 90.0 g` as source-specific `portion_weight` observations. The page also reports 64% total refuse; this does not establish a generalized edible basis or yield.
- Recorded MAPAQ’s qualitative substitute note as `blocked_pending_evidence`; it names no recipe role, cooking method, product-state match, or replacement quantity. No substitution rule was added.
- Added no forms, package yields, active measures, unit mappings, conversions, recipe links, or recipe edits.

## Evidence and boundaries

- [OQLF, flétan du Groenland (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland) identifies the species and gives `flétan du Groenland` and `flétan noir` as preferred Québec French terms. It says *turbot* and *turbot du Groenland* were not retained for Québec fish-product labeling and reserves specialized *turbot* for European *Scophthalmus maximus*.
- The [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) lookup for [*Reinhardtius hippoglossoides*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&lang=e&q=Reinhardtius+hippoglossoides) maps the taxon to `Greenland halibut / flétan du Groenland` and lists `flétan noir` for the species. The OQLF Québec consumer-name distinction controls the alias boundary.
- DFO’s [English species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/greenland-halibut-fletan-groenland-eng.html), [French species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/greenland-halibut-fletan-groenland-fra.html), and [2026 Gulf groundfish plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2026/groundfish-poisson-fond-4rst-3pn-4vn-eng.html) confirm the taxon and keep Greenland and Atlantic halibut separate.
- [Health Canada CNF food 3013](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3013) supports the two exact, source-specific portions and the separate refuse figure.
- [MAPAQ’s 2009 fish brochure](https://www.mapaq.gouv.qc.ca/fr/Publications/Poissonsfond.pdf) names the species and describes several commercial product states. Its whole-fish dimensions and package-size classes are not recipe portions or active forms. Its broad substitute statement lacks enough scope to create a global or contextual rule.

## Picker and recipe audit

Before integration, `Greenland halibut`, `flétan du Groenland`, and `flétan noir` returned no rows; `halibut` and `flétan` returned Atlantic and Pacific halibut. After integration:

- Each qualified English or French query returns only the Greenland-halibut row.
- `halibut` and `flétan` return three separate rows: Atlantic, Pacific, and Greenland halibut.
- `turbot`, `Greenland turbot`, and *Reinhardtius hippoglossoides* remain without picker results from this row.

The complete 114-file, 1,123-row manifest-listed recipe corpus contains no candidate species phrases or target links. No recipe changed.

## Static verification

- Reference normalization, bundled package normalization and validation, and generated-index freshness — passed.
- Research-ledger JSON Schema validation — passed; six new source IDs are unique and attached to the new record, and both observations cite the CNF source on that record.
- Exact ownership, picker boundaries, full recipe scan, UTF-8/no-BOM, escaped-JSON, and scoped whitespace checks — passed.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Post-integration snapshot

| Surface | State | Bytes | SHA-256 / digest |
|---|---:|---:|---|
| Ingredient references | 1,272 | 407,321 | `2b94176589510c344eedf318a03659005a7ab8883e755f79c6fb2b933bfc0e56` |
| Ingredient forms | 94 | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy-import candidates | 65 | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research ledger | 1,580 records; 5,591 source entries; 4,627 distinct source IDs; 8 conversions | 5,470,716 | `0ce7c077364b57ac61626932bc40c766c29f829d07a284a9dbd3c93be797a7e3` |
| Seed manifest | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,272 references | 557,520 | `aeabed47aa25137f2fe88587b857028576be7f62b61c33efe16f0df4b6348487` |

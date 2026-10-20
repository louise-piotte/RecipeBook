# WP04 Section P — Greenland halibut / flétan du Groenland identity review

- **Review date:** 2026-10-12.
- **Packet type:** Canadian/Québec species identity, terminology, ownership, picker, recipe-demand, and numeric-evidence review with integration record.
- **Decision:** integrated one species-scoped, identity-only `PROTEIN` reference for Greenland halibut / `flétan du Groenland` (*Reinhardtius hippoglossoides*), with `flétan noir` as its sole French search alias. “Turbot” expressions remain outside the alias set. CNF portions are stored only as source-specific ledger observations; no active forms, default measure, density, unit mapping, conversion, yield, substitution rule, or recipe link was added.
- **Integration record:** [WP04 Section P Greenland-halibut integration](../batches/wp04-section-p-greenland-halibut-identity-integration-20261012/README.md).

## Bounded identity decision

| Candidate ID | Category | English display | fr-CA display | English aliases | French aliases | Taxon |
|---|---|---|---|---|---|---|
| `ingredient-ref-greenland-halibut` | `PROTEIN` | Greenland halibut | flétan du Groenland | None | flétan noir | *Reinhardtius hippoglossoides* |

The CFIA Fish List pairs *R. hippoglossoides* with the English name `Greenland halibut` and French `flétan du Groenland`; it also lists `flétan noir` for this species. OQLF normalizes `flétan du Groenland` and includes `flétan noir` among its preferred terms. DFO’s bilingual species profile and current Gulf of St. Lawrence groundfish plan independently identify the same taxon and French name. These sources support the species-scoped identity and the one French alias. They do not support merging this fish with Atlantic or Pacific halibut. [S01–S04]

Do not use `turbot`, `Greenland turbot`, `turbot du Groenland`, `turbot de Terre-Neuve`, `Newfoundland turbot`, or `American turbot` as aliases. CFIA’s Fish List carries several of these names under this taxon, and DFO records the historical Canadian trade usage. OQLF says Québec fish-market use of `turbot` for this species was not retained for consumer fish-product naming, and specialized French nomenclature reserves `turbot` for European turbot (*Scophthalmus maximus*). Because the picker matches a shorter query inside a longer alias, adding a qualified “turbot” phrase would also make a bare `turbot` query return this species. Keep the broad trade term unresolved until search can represent its competing scopes. [S01, S02, S04]

Keep `flétan de l’Atlantique` and `flétan du Pacifique` as distinct identities. Omit bare English `halibut` and French `flétan` as stored aliases; each is already a broad picker query over several species. Omit Latin *Reinhardtius hippoglossoides* from aliases because the scientific name identifies the taxon but is not an ordinary ingredient name. OQLF’s `flétan noir commun` is marked France/Europe and is not added. [S01–S03]

## Prior-work fit and exact ownership

Section P continues to leave named finfish and species-sensitive regional terminology open. The coordinator packet already used the Greenland halibut source to keep it separate from Atlantic halibut, and the October 10 finfish gaps review kept generic `turbot` unresolved while stating any future row must be species-qualified. Those are useful boundary findings, not a prior Greenland-halibut allocation or a focused review of its row, aliases, recipe demand, and numeric limits. The active plan, proposal archive, and batch archive contain no Greenland-halibut integration or hold proposal. This species-qualified row follows the prior turbot boundary without activating generic `turbot`. [S01; prior reviews: `wp04-finfish-identity-coordinator-review-20261009.md`, `wp04-finfish-gaps-20261010.md`]

The pre-integration ownership audit applied the live picker normalization (lowercase, Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace punctuation with spaces, then trim/collapse whitespace) to active names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger IDs/strings. No exact owner existed for `Greenland halibut`, `flétan du Groenland`, `flétan noir`, the qualified turbot phrases, or *R. hippoglossoides* in active references, forms, legacy candidates, or ledger records.

The pre-integration snapshot below includes the immediately preceding triticale-flour integration. File hashes are SHA-256 over exact bytes. The recipe digest walks `manifest.v1.json` in its stored order and hashes each relative path, a NUL byte, exact recipe-file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,271 references | `e816b31e04190a7ecba3dbf4a26c185734994d7ca37cf0cd2b8f700d08a636ef` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,579 records; 5,585 source entries; 4,621 distinct source IDs | `44982093e310a53c60ea398bfda92d9380132209f99915c1a01ad233b1696330` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The nearest active identities are:

- `ingredient-ref-atlantic-halibut`: `Atlantic halibut / flétan de l’Atlantique`, with French alias `flétan`.
- `ingredient-ref-pacific-halibut`: `Pacific halibut / flétan du Pacifique`, no aliases.

The active catalog has no Greenland-halibut-specific form. The only current ledger halibut records are the verified Atlantic and Pacific identities; neither owns *R. hippoglossoides*. The legacy file has no exact Greenland-halibut candidate or alias. A new ID is therefore available without replacing or relinking an existing owner.

## Live picker behavior

`IngredientReferenceSearchIndex` searches active bilingual display names, aliases, and attached form terms. It folds accents and punctuation, prefers complete word-phrase matches, then falls back to substring matching.

| Query | Before integration | After integration |
|---|---|---|
| `Greenland halibut` | None | Greenland halibut |
| `flétan du Groenland` | None | Greenland halibut |
| `flétan noir` | None | Greenland halibut |
| `halibut` | Atlantic halibut; Pacific halibut | Atlantic; Pacific; Greenland halibut |
| `flétan` | Atlantic halibut; Pacific halibut | Atlantic; Pacific; Greenland halibut |
| `turbot` / `Greenland turbot` | None | None |
| `Reinhardtius hippoglossoides` | None | None |

The full names and French alias resolve to one species identity. The shorter `halibut` and `flétan` searches expose three separate species rows, preserving the choices instead of assigning a generic line to one species. The turbot terms remain absent because the Québec consumer-label boundary is explicit and the current phrase picker cannot suppress the bare trade query when a longer alias contains it.

## Full bundled-recipe demand audit

The scan read all 114 recipe files in manifest order and all 1,123 `ingredients[]` rows. It checked parsed recipe strings and row content for `Greenland halibut`, `flétan du Groenland`, `flétan noir`, the relevant qualified turbot names, and *Reinhardtius hippoglossoides*.

**Result: zero candidate-name matches in the recipe corpus and zero matching ingredient rows.** The current adjacent species-linked fish lines remain recipe 077 row 10 (skinless salmon fillets) and recipe 111 row 1 (one tuna steak). Recipe 093’s generic “cooked meat or seafood” choice is not species evidence. None creates a Greenland-halibut recipe link, form, or recipe-derived measure.

## Forms, measurements, conversions, and substitutions

Evidence is separated by source scope; none of these values becomes a catalog default.

- **Aliases:** French `flétan noir` only. English aliases: none. Keep `turbot`, qualified turbot phrases, `black halibut`, bare `halibut` / `flétan`, and the Latin name out of stored aliases.
- **Forms:** no active form is proposed. MAPAQ’s 2009 Québec processor brochure describes fresh or frozen fillets, whole eviscerated fish, “dentelle,” head/carcass, and smoked product. This is useful product-state evidence, not a recipe request or a universal form model. Keep any later form review scoped to an exact product and preservation state. [S06]
- **Measurements:** Health Canada’s Canadian Nutrient File food 3013, “Fish, halibut, Greenland (turbot), raw,” records `1/2 fillet = 204.0 g`, a `90 g` Food Guide serving, and `64%` total refuse. The two portions are retained only as source-specific ledger observations, not as a default household portion, edible-yield rule, or conversion. The refuse percentage does not establish a generalized edible basis. MAPAQ’s mean fish length and whole-fish weight are biological/product profile observations, not recipe amounts. [S05, S06]
- **Density and unit mappings:** none; leave `defaultDensity` null and `unitMappings` empty.
- **Conversions and yields:** none. Do not generalize CNF’s half-fillet mass or refuse percentage to other cuts, packages, cooked fish, frozen fish, or recipe portions.
- **Substitutions:** MAPAQ describes Greenland halibut as a good substitute for Atlantic halibut, sole, haddock, cod, and plaice. The integration records this as blocked pending evidence because it supplies no recipe method, role, preparation-state pair, or replacement quantity; no substitution rule was added. [S06]
- **Recipe links:** none; no bundled recipe asks for this species.

## Integration result

1. Added `ingredient-ref-greenland-halibut` in `PROTEIN` with English display `Greenland halibut`, fr-CA display `flétan du Groenland`, French alias `flétan noir`, and no English aliases.
2. Added six source entries and an accepted identity decision. Kept CNF's two portions as observations for its raw food code and recorded MAPAQ's broad substitution statement as blocked pending recipe and quantity scope.
3. Kept `defaultDensity` null, `unitMappings` empty, forms absent, and conversions, yields, substitution rules, and recipe links absent.
4. Kept Atlantic halibut, Pacific halibut, and European turbot as separate identities. No `turbot` phrase was added to this row.

## Sources

Sources were accessed on 2026-10-12. The six proposal-local source IDs were absent from the pre-integration ledger and have now been added to the new reference record.

| Source ID | Primary source | Evidence and limits |
|---|---|---|
| `WP04-P-GREENLAND-HALIBUT-20261012-S01` | Office québécois de la langue française, [flétan du Groenland (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland) | Identifies *R. hippoglossoides*; normalizes `flétan du Groenland`; lists `flétan noir`; explains that Québec fish-product terminology does not retain `turbot` or `turbot du Groenland` for this species and distinguishes European turbot. Entry last updated 2012. |
| `WP04-P-GREENLAND-HALIBUT-20261012-S02` | Canadian Food Inspection Agency, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&lang=e&q=Reinhardtius+hippoglossoides) | Fish List maps TSN 172930 and *R. hippoglossoides* to `Greenland halibut / flétan du Groenland`, and includes `flétan noir` and other market names for this species. CFIA describes this list as acceptable English/French fish-label names linked to scientific names; database last modified 2023-09-18. |
| `WP04-P-GREENLAND-HALIBUT-20261012-S03` | Fisheries and Oceans Canada, [English species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/greenland-halibut-fletan-groenland-eng.html) and [French species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/greenland-halibut-fletan-groenland-fra.html) | Identifies the Latin taxon and uses `Greenland halibut` / `flétan noir - flétan du Groenland`; distinguishes the fish from Atlantic halibut. Biological lengths and weights are not edible yields or recipe measures. |
| `WP04-P-GREENLAND-HALIBUT-20261012-S04` | Fisheries and Oceans Canada, [2026 Gulf of St. Lawrence Groundfish Integrated Fisheries Management Plan, Annex L](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2026/groundfish-poisson-fond-4rst-3pn-4vn-eng.html) and [French edition](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2026/groundfish-poisson-fond-4rst-3pn-4vn-fra.html) | Annex L (May 2024) identifies *R. hippoglossoides* as a Gulf fishery and reports that a fresh Greenland-halibut market developed in the mid-1970s. Supports Canadian food-market context; landings, quota, and stock metrics are not consumer portions or ingredient measures. |
| `WP04-P-GREENLAND-HALIBUT-20261012-S05` | Health Canada, [Canadian Nutrient File food 3013: raw Greenland halibut serving sizes](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3013) | Records 204.0 g per half fillet, a 90 g Food Guide serving, and 64% refuse for this specific raw CNF food. The entry is a source-specific observation, not an active catalog default. Page modified 2019-03-01. |
| `WP04-P-GREENLAND-HALIBUT-20261012-S06` | Québec Ministère de l’Agriculture, des Pêcheries et de l’Alimentation, [Poissons de fond et pélagiques du Québec](https://www.mapaq.gouv.qc.ca/fr/Publications/Poissonsfond.pdf), publication 09-0019 (2009), Greenland-halibut page | Describes processor product states and package-size ranges, a 50–55 cm / 1–1.5 kg average whole-fish profile, and broad possible fish substitutions. None has recipe context or enough scope/quantity to create active forms, measures, yields, or substitution rules. |

No recipe files, active forms, active measurements, conversion or substitution rules, or tests were changed. The reference, research ledger, generated index, plan, roadmap, and batch README were updated as recorded above.

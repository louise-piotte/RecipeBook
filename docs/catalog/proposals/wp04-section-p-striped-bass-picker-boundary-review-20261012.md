# WP04 Section P — striped bass / bar d’Amérique picker-boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only species identity, Québec naming, catalog-ownership, and picker-boundary review.
- **Disposition:** **Hold** *Morone saxatilis* outside the active catalog and research ledger. CFIA and OQLF support the species identity and the food-name pair `striped bass / bar d’Amérique`, but the current picker would return this one species row for bare `bass` and `bar` searches. Keep those generic searches unresolved until the picker can preserve that boundary.
- **Worktree scope:** this proposal file only. No catalog JSON, form JSON, legacy candidate, ledger, recipe, plan, roadmap, generated code, or test was changed. No tests or emulator checks were run.

## Candidate and scope

This review selects one still-unreviewed Section P species: striped bass, *Morone saxatilis*. Earlier finfish-gap material held generic sea-bass/bream names and mentioned black sea bass (*Centropristis striata*) as a possible future species review. Striped bass is a different taxon in Moronidae; it is not an alias, product state, or substitute for black sea bass, European sea bass, or other fish called bass. A repository-wide proposal and batch search found no earlier striped-bass or *M. saxatilis* review.

The species identity itself is well supported. This hold concerns what users would get when they search the broader words contained in the only supported bilingual food-name pair. The hold does not claim that the species is unavailable or that no future species-level reference can be added.

## Refreshed ownership and demand audit

This inventory was read before drafting. Hashes are SHA-256 over exact file bytes. The recipe-corpus digest hashes each manifest-listed relative path, a NUL byte, the recipe file’s exact bytes, and a NUL byte, in manifest order.

| Artifact | Current size | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,255 references | `d05f2d2ef59a9862ab5cbe69501e857f5ee7dfe0747e88284447b64d1e1fdcf8` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `docs/catalog/legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `docs/catalog/research-ledger.v1.json` | 1,564 records | `fefdb8d64fd00372f35fbcb29b79211221b7f439d280233ac5af05be94b1b157` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

The exact candidate ID `ingredient-ref-striped-bass`, the legacy candidate ID `candidate-striped-bass`, and the proposal-local source prefix `WP04-STRIPED-BASS-BOUNDARY-20261012` are unused. Normalized exact-name and scientific-name searches found zero owners for `striped bass`, `bar d’Amérique`, `bar d'Amérique`, `bar rayé`, *Morone saxatilis*, and the obsolete scientific synonym *Roccus saxatilis* in:

- active reference display names and aliases;
- every form label and match term;
- legacy candidate names and aliases; and
- ledger record IDs and evidence.

No matching active reference exists to own a form. All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned across their stored text for the species name pair and scientific names; there were **zero exact phrase hits**. No recipe link or recipe-specific measure is supported.

## Taxon and Québec naming evidence

The proposed display pair, if reconsidered, is **striped bass / bar d’Amérique**, with no added aliases. OQLF’s entry is in both the edible-fish terminology domain and the zoology/ichthyology domain. It prefers `bar d’Amérique`, pairs it with English `striped bass`, and identifies *Morone saxatilis*. CFIA’s Fish List gives the same species and the English/French pair `Striped Bass / Bar d’Amérique` for Canadian fish-label naming.

The Québec government wildlife profile uses `bar rayé`, gives `Striped bass` and *Morone saxatilis*, and reports separate Québec populations in the St. Lawrence and southern Gulf of St. Lawrence. That ecological name is useful for identifying the species locally, but it does not override the food-name boundary: OQLF says `bar rayé`, `bar de mer`, and `loup de mer` were not retained by the Fish Products Terminology Committee. Do not add `bar rayé` as a food alias. Likewise, do not add `bar`, `bass`, `rockfish`, `striper`, `striper bass`, `linesides`, or `linesider`; these are broad or less controlled search terms and do not preserve the qualified food identity. OQLF also lists *Roccus saxatilis* as obsolete; it is not an alias.

The species-level name does not identify a population, location of catch, aquaculture source, or permission to harvest. Québec and DFO materials describe population-specific management and current recreational rules. A species identity must not be read as a claim that every fish sold under this name came from a legally harvestable population or source.

## Picker phrase boundary and hold rationale

`IngredientSearch.kt` normalizes accents and punctuation, then matches a complete query phrase anywhere inside a display name or alias before it falls back to substring matching. A simulation using only the supported display pair produces these results for a hypothetical new row:

| Query | Hypothetical result | Boundary |
|---|---|---|
| `striped bass` | this species | Exact English food name. |
| `bar d’Amérique` | this species | Exact normalized Québec food name. |
| `bass` | this species alone | A bare token from the English display would appear species-specific in the current catalog. |
| `bar` | this species alone | A bare token from the Québec display would appear species-specific in the current catalog. |
| `bar rayé` | no result | Omitted because it is not the OQLF-retained food-product name. |
| `sea bass` / `black sea bass` | no result | Not aliases; the generic sea-bass boundary and *C. striata* remain separate. |

The exact bilingual names are suitable, but adding them now would make two broader queries resolve to the sole current result for a species-qualified row. This is the same kind of unresolved generic-versus-species picker risk already documented for other Section P holds. Keep the species unallocated until the picker can preserve the generic choice or a separate broad identity is supported. Do not work around the behavior by adding `bar`, `bass`, or other aliases.

## English / fr-CA source limits

- **English:** CFIA and OQLF support `striped bass` as the species name. The Québec wildlife profile lists additional English labels, but this review does not adopt them as catalog aliases because they are less specific or are not established as Canadian fish-product names.
- **fr-CA:** OQLF’s retained food-product term is `bar d’Amérique`; CFIA independently uses the same French name for labeling. The Québec wildlife profile’s `bar rayé` is a valid local species-profile name, but OQLF explicitly reports it as not retained for fish products. The catalog should not use it as the food display or alias unless future Québec product evidence changes that scope.
- **Market limit:** OQLF describes the species as having commercial potential in Québec. That statement is not proof of current Québec retail availability. DFO’s Canadian aquaculture listing places the species in Nova Scotia; it is not evidence of an available Québec product or of harvest legality for a specific population.

## Forms, amounts, and substitutions

Health Canada’s 2015 online CNF record for raw striped bass, food code 2987, reports one fillet as 159.0 g, a 90 g Food Guide serving, and 65% total refuse. These are source-specific observations. The CNF page is an older 2015 online record; the 90 g figure is a nutrition-guide serving, the single-fillet weight is not a universal fillet weight, and the refuse percentage is not a cooked yield. Do not activate these as a default amount, edible-yield rule, density, unit mapping, or count conversion. No current form, cut, preservation state, package amount, or preparation equivalent was established here.

No recipe requests striped bass, and no source reviewed establishes a directed recipe substitution. Do not create a global or contextual substitution to black sea bass, European sea bass, another bass, or another finfish. Do not infer cooking, raw-consumption, curing, storage, or safety equivalence from related names or culinary similarity.

## Sources

Sources were accessed 2026-10-12. Source IDs below are proposal-local only; they are not live ledger entries.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-STRIPED-BASS-BOUNDARY-20261012-S01** | OQLF, [bar d’Amérique, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198930/bar-damerique) | Preferred Québec fish-product term, English `striped bass`, taxon *Morone saxatilis*, and the note that `bar rayé`, `bar de mer`, and `loup de mer` were not retained by the fish-products terminology committee. Last updated 2011; naming evidence, not current retail availability. |
| **WP04-STRIPED-BASS-BOUNDARY-20261012-S02** | CFIA, [Fish List: Striped Bass query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Striped%20Bass) | Lists *Morone saxatilis* with `Striped Bass / Bar d’Amérique`. This is accepted Canadian labeling terminology, not a recipe equivalence or catch-source rule. |
| **WP04-STRIPED-BASS-BOUNDARY-20261012-S03** | Gouvernement du Québec, [Bar rayé species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/bar-raye) | Pairs local `bar rayé`, English `striped bass`, and *M. saxatilis*; describes two Québec populations and the species’ wildlife ecology. It does not establish a food-product display, current commercial supply, or universal harvest permission. |
| **WP04-STRIPED-BASS-BOUNDARY-20261012-S04** | DFO Gulf Region, [Bar rayé](https://www.glf.dfo-mpo.gc.ca/fr/Striped_Bass-Bar_raye) | Current species-specific 2026 recreational plan and notices for the southern Gulf population; the page was modified 2026-10-11. It demonstrates population- and season-specific management, not a general commercial sourcing rule. |
| **WP04-STRIPED-BASS-BOUNDARY-20261012-S05** | Fisheries and Oceans Canada, [Canadian aquaculture species list](https://www.dfo-mpo.gc.ca/aquaculture/farmed-elevage/listing-fra.htm) | Lists `Bar rayé / Morone saxatilis` for Nova Scotia. A national species listing does not prove current Québec retail availability or source-specific commercial authorization. |
| **WP04-STRIPED-BASS-BOUNDARY-20261012-S06** | Health Canada, [CNF serving size, food code 2987](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2987) | Older 2015 online CNF page for raw striped bass; reports 159.0 g per fillet, a 90 g Food Guide serving, and 65% total refuse. Keep as a bounded observation only; it is not a default or yield. |
| **WP04-STRIPED-BASS-BOUNDARY-20261012-S07** | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Distinguishes the 2015 online interface from the newer 2026 CNF release. This review does not claim that the old serving observation is a current universal measurement. |

## Recommendation

**Hold** `ingredient-ref-striped-bass` outside the active reference catalog and ledger. The bilingual food identity is sufficiently verified for future consideration, but an active species-only row would capture the currently unresolved generic queries `bass` and `bar` as single results. Revisit after picker semantics preserve a generic option or after the relevant broader identities and result distinctions are resolved. If later accepted, use `striped bass / bar d’Amérique`, add no aliases by default, keep the row identity-only, and add no recipe link, form, default amount, density, conversion, yield, or substitution from this review.

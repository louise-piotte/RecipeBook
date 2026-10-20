# WP04 Section P — burbot / lotte identity integration (2026-10-12)

## Decision

Added identity-only `burbot / lotte` as `ingredient-ref-burbot` in `PROTEIN`, scoped to *Lota lota*.
The English and Québec French display names are the only search terms; no aliases were added. Keep
freshwater burbot distinct from marine cod species, Alaska pollock, tomcod, monkfish / baudroie,
American eel, and other finfish. No forms, density, unit mappings, recipe links, conversions, yields,
or substitutions were added.

Health Canada lists `Burbot (loche), raw` at 90 g. That value is preserved only as a source-specific
nutrition-table portion observation in the research ledger. It is not an active recipe measure,
household measure, count mapping, density, or yield. Québec's species-profile size observations are
biological data and were not added as kitchen measures.

## Evidence and boundaries

- OQLF places `lotte` in Québec ichthyology and edible-fish terminology, prefers the term, and pairs it
  with English `burbot` and Latin *Lota lota*. It notes that `lotte` often names monkfish / baudroie
  in France and that `loche` was not retained by the fish-product terminology committee.
- CFIA's Fish List pairs Burbot and Lotte with *Lota lota*. Its other reported names are not adopted
  as Québec consumer aliases.
- The Gouvernement du Québec profile pairs Lotte / Burbot with *Lota lota* and identifies the species
  as a Québec freshwater fish.
- Health Canada's 2008 fish table lists a 90 g measure and weight for raw burbot. The value stays
  source-specific in the ledger.
- The *Freshwater Fish Marketing Act* lists several other burbot names, including Fresh Water Cod,
  ling, maria, eelpout, and lawyer. These names are excluded from aliases: cod terms risk merging
  different active fish, while the other names are unnecessary for the Québec display.

The exact-name and ID preflight found no previous active reference, form, legacy candidate, ledger
record, or source-ID owner for the candidate. After integration, exact `burbot` and `lotte` picker
queries each return this one reference. The broader `cod` query continues to return its existing
multiple fish identities; no cod-qualified alias was added.

## Sources

| Source IDs | Source | Limits |
| --- | --- | --- |
| `WP04-SECTIONP-BURBOT-IDENTITY-20261012-S01` | [CFIA Fish List search for Burbot](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Burbot) | Name and taxon evidence; other listed names are not automatically Québec aliases. |
| `WP04-SECTIONP-BURBOT-IDENTITY-20261012-S02` | [OQLF, lotte (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198860/lotte) | Québec term, English and Latin equivalents, and the loche / France-usage boundary. |
| `WP04-SECTIONP-BURBOT-IDENTITY-20261012-S03` | [Gouvernement du Québec, Lotte](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/lotte) | Québec species identity and habitat; biological sizes are not culinary measures. |
| `WP04-SECTIONP-BURBOT-IDENTITY-20261012-S04` | [Health Canada, Nutrient Value of Some Common Foods](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-8-fish-shellfish-nutrient-value-some-common-foods-2008.html) | Raw-burbot 90 g nutrition-table portion only. |
| `WP04-SECTIONP-BURBOT-IDENTITY-20261012-S05` | [Freshwater Fish Marketing Act, Schedule](https://laws-lois.justice.gc.ca/eng/acts/F-13/section-sched231154.html) | Burbot taxon and reported names; no Québec alias or culinary-equivalence inference. |

## Recipe and package snapshot

The complete manifest-listed recipe corpus was rescanned after integration. It contains 114 files and
1,123 ingredient rows, with no burbot, lotte, taxon, or related candidate-term hits. No recipe rows
were changed.

Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a
NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,268 references | 405,931 | `3fae7e91bb0dcd82c08a80372ef28ee113a43c55b017f01c245cd2c3f9ec09e4` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,576 records; 5,556 source entries; 4,592 distinct source IDs | 5,433,071 | `2866cd4f170d57f156bf2476ffeeb6fbd1773963a6f5d10de10bd80c6e13a7a1` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,268 references | 555,726 | `1eabf4f29ea18e52fc7cf36fa98a046943dd6dc90f8818fbe9bbfabfe64b7c3a` |

## Static validation

- Reference normalization, generated-index freshness, and bundled seed-package validation passed.
- Research-ledger validation passed with 1,576 records and zero errors.
- Exact-name ownership and picker-query review passed; all five new source IDs belong to the burbot
  ledger record.
- The full manifest recipe scan found no candidate phrase hits.
- JSON files are UTF-8 without BOM and store non-ASCII text as explicit Unicode escapes;
  `git diff --check` passed.
- No app, unit, instrumentation, emulator, or deployment tests were run because this change only adds
  database JSON data, as allowed by `AGENTS.md`.

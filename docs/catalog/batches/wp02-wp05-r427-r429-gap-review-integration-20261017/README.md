# WP02 / WP05 R427 and R429 gap-review integration

**Date:** 2026-10-17
**Scope:** WP02 Section D white-wafer boundary; WP05 Section Z tartar-sauce identity.

## Integrated decisions

- **R427 — white wafers:** Hold both the source-specific “Barry Callebaut white wafers / pastilles blanc” phrase and a generic chocolate-wafer form outside active catalog data. Tootsi gives a bilingual distributor title, but no manufacturer formula or product-code crosswalk ties that item to Save-On's separately listed white wafers. The retailer's composition makes compound coating plausible for its own listing, but does not prove the distributor item's composition. Keep the candidate wording out of white chocolate and compound coating. Broad `wafer` / `gaufrette` searches continue to resolve only to Graham crumbs. No reference, alias, form, ledger record, recipe edit, measurement, yield, or substitution was added. See the [R427 proposal](../../proposals/wp02-section-d-white-wafers-product-boundary-review-r427-20261017.md).
- **R429 — tartar sauce:** Add identity-only `tartar sauce / sauce tartare` as `ingredient-ref-tartar-sauce`, category `SAUCE_AND_CONDIMENT`, with `tartare sauce` as its only alias. OQLF identifies `sauce tartare` as the preferred French term and lists both English forms; Heinz's current Canadian English and French pages share one product identifier, and a Québec product listing independently uses the French name. Keep French aliases empty and keep the producer-specific wording `sauce de type tartare` out of the global aliases. Keep mayonnaise, aioli, remoulade, prepared horseradish, cream of tartar, Tartary buckwheat flour, and raw tartare dishes separate. See the [R429 proposal](../../proposals/wp05-section-z-tartar-sauce-identity-review-r429-20261017.md).
- Heinz's 30 mL portion and the Québec product's 350 mL package are volume-only observations. The new ledger record has four identity/name sources, no measurement observations, `measurementState=researched_no_supported_value`, and `substitutionResearchState=not_yet_researched`. No density, unit mapping, form, recipe link, package yield, or substitution was added.

## Corpus and picker review

The manifest lists 114 recipe files and 1,123 ingredient rows. A full serialized-text scan found no wafer, pastille, or gaufrette wording. The broad `tartar` / `tartare` scan found only two recipe ingredient rows, both already linked to cream of tartar (recipes 021 and 068); their quantities, links, and instructions remain unchanged. No bundled recipe requests tartar sauce, remoulade, or aioli.

Picker projection using the current normalization and phrase-first matching rules:

| Query | Projected result |
|---|---|
| `tartar sauce`, `tartare sauce`, `sauce tartare` | `ingredient-ref-tartar-sauce` only |
| `tartar` | cream of tartar; Tartary buckwheat flour; tartar sauce |
| `tartare` | Tartary buckwheat flour; tartar sauce |
| `Tartar buckwheat flour`, `farine de sarrasin tartare` | Tartary buckwheat flour only |
| `cream of tartar` | cream of tartar only |
| `mayonnaise`, `mayo` | mayonnaise only |
| `aioli`, `remoulade` | no result |
| `wafer`, `gaufrette` | Graham cracker crumbs only |
| `white wafers`, `white chocolate wafers`, `pastilles blanc` | no result |

## Validation

- Bundled seed package normalization and validation check passed.
- Ingredient-reference normalization check passed.
- Generated ingredient index freshness check passed at 1,725 references.
- Research-ledger schema and source-ID integrity validation passed through the bundled package validator. The ledger now has 2,084 records, 9,450 source entries, 8,009 distinct source IDs, and 6,725 distinct URLs.
- UTF-8 without BOM, escaped Unicode in bundled seed JSON, proposal and README local links, and scoped whitespace checks passed.
- No app tests, builds, emulator checks, or deployment were run. R429 adds only database JSON data and documentation; R427 is a documentation-only hold, consistent with `AGENTS.md`.

The active sauce checklist remains open for the other sauces and condiment identities. Section D's broader chocolate-form review also remains open.

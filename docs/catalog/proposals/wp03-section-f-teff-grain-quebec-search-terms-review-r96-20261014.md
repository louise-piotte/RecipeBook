# WP03 Section F: teff grain Québec naming and search-term review (R96)

Review date: 2026-10-14
Status: integrated by root on 2026-10-14

## Decision

Add the French search alias `graines de teff` to the existing `ingredient-ref-teff-grain` reference. Retain its current canonical names, English `teff` and French `teff d'Abyssinie`, and retain the existing French alias `tef`. Do not add the market wording to the separate teff-flour reference.

This is a narrow search-term addition for a Québec-facing whole-grain product phrase. It does not create another identity or settle teff's culinary state. TERMIUM Plus calls both `teff` and `teff d'Abyssinie` correct, normalized French terms; the CFIA French cereal list uses `teff d'Abyssinie`; and the current French listing from Montreal-based Yupik uses `GRAINES DE TEFF` for whole seeds [S02–S05]. The retailer's wording supports a useful alias, while the Canadian authorities support retaining the established display.

The previous R90 review integrated `tef` as a French alias and expressly left the independent Québec display review pending. This packet makes a separate source-based recommendation on current local product wording. It is not a human Québec-locale sign-off; if the checklist requires that specific human review, that step remains open.

## Identity and boundary

The candidate is edible whole-grain teff, the cereal identified in TERMIUM and CFIA under *Eragrostis tef* / *Eragrostis abyssinica*. CFIA places it under cereals, and Yupik identifies its listed product as whole seeds with the ingredient `Graines de teff` [S02–S04]. The scope is the unprocessed grain/seed sold as a food ingredient.

Keep these adjacent items separate:

- `ingredient-ref-teff-flour` / `farine de teff` is the milled product. Do not add `graines de teff`, `tef`, or bare `teff` as flour aliases.
- Injera is a prepared bread, not a grain form or a synonym for teff.
- No alias is proposed for forage, grass, or unqualified botanical terms beyond the existing identity's accepted scope.

## Live ownership and picker projection

The live reference is `ingredient-ref-teff-grain`: `teff` / `teff d'Abyssinie`, French alias `tef`, category `GRAIN_AND_CEREAL`, null density, and no unit mappings. The separate flour reference is `ingredient-ref-teff-flour`: `teff flour` / `farine de teff`, category `FLOUR_AND_STARCH`, also with null density and no unit mappings. No legacy import candidate owns `teff`, `tef`, or `teff d'Abyssinie`. The research ledger already has verified grain and flour records; this proposal does not add or edit ledger entries.

The picker uses normalized complete-phrase matching before substring fallback (`IngredientSearch.kt`). A read-only projection over the live reference and form terms gives:

| Query | Current result | Result after the proposed alias |
|---|---|---|
| `teff` | Teff grain and teff flour. The grain's English display is an exact phrase; `teff` also occurs as a phrase within `teff flour`. | Unchanged; this remains a broad query. |
| `tef` | Teff grain only. | Unchanged. |
| `teff d'Abyssinie` (straight or curly apostrophe) | Teff grain only. | Unchanged. |
| `farine de teff` | Teff flour only. | Unchanged. |
| `graines de teff` | No result. | Teff grain only, as a complete phrase. |

There are no active forms attached to either teff reference, so no form terms create additional collisions. The proposed plural phrase comes directly from the local product title and ingredient statement; it does not imply a new processed form.

## Recipe demand and numeric data

The manifest-ordered bundled corpus has 114 recipe files and 1,123 ingredient rows. A full-text scan of every listed file and ingredient row found zero hits for `teff`, `tef`, `teff d'Abyssinie`, `Eragrostis`, or `graines de teff`. The recipe corpus therefore creates no measure, form, conversion, or substitution demand for this candidate.

No teff grain forms or substitution rules are attached in the live seed data. Keep them absent. Yupik's nutrition panel states a product-specific portion of 1/8 cup (30 g) for SKU P20075 [S04]; this is one retailer product label, not a generic grain measure or density. Do not add it to active unit mappings, density, or conversion data. No source reviewed here establishes an equivalence between grain and flour or a substitute for either.

## Proposed catalog delta

On `ingredient-ref-teff-grain`, add exactly this French alias:

```json
"aliasesFr": ["tef", "graines de teff"]
```

Keep `nameFr`, `nameEn`, `aliasesEn`, category, `defaultDensity`, `unitMappings`, the teff-flour reference, all forms, and all substitution data as they are. Do not add a new ingredient ID, recipe link, serving measure, package measure, or yield.

## Sources

Sources were opened on 2026-10-14. The dated authority and product records below support only the claims stated in their scope column.

| ID | Source and date | Support and limits |
|---|---|---|
| WP03-TEFF-QC-SEARCH-R96-20261014-S01 | Office québécois de la langue française, [GDT: `tef`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef), entry authored by Conseil international de la langue française (1974); accessed 2026-10-14. | Defines the cereal and says `tef` is non-current but its spelling is recommended. This supports the existing search alias; it does not establish current consumer-label preference. |
| WP03-TEFF-QC-SEARCH-R96-20261014-S02 | Translation Bureau, [TERMIUM Plus: *Eragrostis tef*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=ERAGROSTIS+TEF), fiche dated 2016-03-14, database page modified 2026-08-18; accessed 2026-10-14. | Identifies *Eragrostis abyssinica* and *E. tef*; lists French `tef` as correct and `teff` / `teff d'Abyssinie` as correct, normalized terms. Supports retaining the existing display and keeping grain separate from flour. It is federal terminology, not a Québec retail preference survey. |
| WP03-TEFF-QC-SEARCH-R96-20261014-S03 | Canadian Food Inspection Agency, [Liste de grains et grandes cultures](https://inspection.canada.ca/fr/protection-vegetaux/grains-grandes-cultures/liste-grains-grandes-cultures), modified 2015-04-02; accessed 2026-10-14. | Under `Céréales`, lists `Eragrostis (= Poa) abyssinica / Teff d'Abyssinie`. Supports the established French cereal label and category, but is an older crop list rather than a current consumer standard. |
| WP03-TEFF-QC-SEARCH-R96-20261014-S04 | Yupik, [Graines de teff, SKU P20075](https://yupik.com/fr/teff-seeds-p20075), current French product page accessed 2026-10-14. | Product title is `GRAINES DE TEFF`; ingredient list says `Graines de teff`, and the description calls them whole seeds. The page shows a SKU-specific 1/8 tasse (30 g) nutrition portion; it does not establish generic density or measure data. |
| WP03-TEFF-QC-SEARCH-R96-20261014-S05 | Yupik, [Contact](https://yupik.com/fr/contact) and [À propos](https://yupik.com/fr/a-propos), accessed 2026-10-14. | Lists Yupik's Montreal address and describes the company as based in Canada. This establishes the product page as Québec-facing local retail evidence; it does not show that the teff itself is grown or processed in Québec. |

## Review limits and checks

- This packet is specific to teff grain's Québec French display/search wording. It does not review teff flour terminology, puffed teff, teff flakes, grain preparation states, or other Section F candidates.
- No independent human-language sign-off was obtained. The source-based recommendation is to retain the normalized display and add one exact local product phrase for search.
- Static audit confirmed the target path was unused before writing; the proposed source IDs are unique in `docs/catalog`; live reference/form/legacy/ledger ownership and picker matches were inspected; and all 114 manifest-listed recipes / 1,123 ingredient rows were scanned.
- The proposal was checked for UTF-8 without BOM, mojibake markers, trailing whitespace, and a final newline. No app, Gradle, emulator, or other tests were run; this is proposal-only work, and AGENTS.md waives testing for JSON-only database additions.

## Root integration (2026-10-14)

Accepted the exact French alias `graines de teff` on `ingredient-ref-teff-grain`, alongside the existing `tef` alias. Kept `teff d'Abyssinie` and `teff` as the French and English displays, respectively, and left the teff-flour identity, forms, numeric fields, recipe links, and substitutions unchanged. Added the five R96 source records and an accepted alias decision to the existing grain ledger record. The independent human Québec display review remains open.

The static picker projection confirms `graines de teff` returns only teff grain; `teff` still returns grain and flour; `tef` and `teff d'Abyssinie` return grain; and `farine de teff` returns flour. The 114-recipe / 1,123-row corpus has no teff demand. Reference normalization, package normalization/validation, ledger schema validation, and generated-index freshness checks passed. No tests or emulator checks were run for this database-JSON-only change.

See the [integration record](../batches/wp03-section-f-teff-grain-search-alias-integration-20261014/README.md).

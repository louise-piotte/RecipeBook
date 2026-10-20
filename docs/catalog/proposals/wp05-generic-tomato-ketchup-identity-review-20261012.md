# WP05 generic tomato ketchup identity review

Date: 2026-10-12
Scope: Section Z generic ketchup identity, Québec French display, and English search aliases.

## Decision

Retain the existing `ingredient-ref-ketchup` identity as generic tomato ketchup, displayed as `ketchup` in both languages. Add these English aliases from Canadian terminology and identity sources: `catsup`, `catchup`, `katsup`, `tomato catsup`, and `tomato ketchup`. Keep French aliases empty: OQLF identifies `ketchup` as the preferred Québec French term and says `ketchup aux tomates` is unnecessary.

Keep banana ketchup, fruit ketchup, and green-tomato ketchup as separate qualified identities. Phrase search can return more than one relevant item for `catsup` (generic ketchup and banana catsup) or `tomato ketchup` (generic tomato ketchup and green tomato ketchup); their complete names preserve the distinction.

No forms, measurements, recipe links, conversions, yields, or substitutions are added. Existing recipe links for unqualified `ketchup` remain on this generic identity.

## Evidence

- The [OQLF Grand dictionnaire terminologique entry for ketchup](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2077493/ketchup), last updated in 1994, defines the usual product as a tomato sauce mixture, names `ketchup` as the preferred French term, and says a tomato qualifier is unnecessary in French because tomato ketchup is the common type. It says other types such as fruit ketchup should be qualified. Its English translations include `ketchup`, `tomato ketchup`, and `tomato catsup`; associated English terms include `catsup`, `catchup`, and `katsup`.
- The current [CFIA Canadian Standards of Identity, Volume 4](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-4), last amended 2024-12-18, section 38 names `Tomato Catsup`, `Catsup`, `Tomato Ketchup`, and `Ketchup` for the same standardized food.
- The [French CFIA Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), section 38, gives the corresponding French names `catsup de tomates`, `catsup`, `ketchup de tomates`, and `ketchup`.
- CFIA's [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) explains that standardized names may be synonyms and describes permitted spelling variants of `catsup` under CFCS section 10.2.9.

## Catalog and recipe audit

- The existing identity has no aliases or numeric data. Its canonical French and English displays are both `ketchup`.
- Three bundled recipe rows request unqualified ketchup and already point to this reference: recipes 034, 074, and 101. No recipe text or link changes are needed.
- The active banana ketchup row already uses `banana catsup`; keeping the new bare `catsup` alias may therefore produce a useful two-result search. `tomato ketchup` can also match the qualified green-tomato ketchup identity because its full name contains that phrase.
- No measurement or substitution evidence was assessed for activation. Density and unit mappings remain empty; measurement research stays blocked pending evidence and substitutions remain not yet researched.

## Proposed integration

Add the five English aliases above to `ingredient-ref-ketchup`, update its timestamp, mark identity research verified, and record the sources and accepted boundary decision in `docs/catalog/research-ledger.v1.json`. Leave recipe, form, conversion, yield, and substitution data untouched.

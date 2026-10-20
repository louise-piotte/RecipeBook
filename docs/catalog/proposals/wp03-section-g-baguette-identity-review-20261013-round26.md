# WP03 Section G: baguette identity review

**Status:** Integrated as identity-only `ingredient-ref-baguette`; see the [R26 integration record](../batches/wp02-wp03-wp04-round26-gap-review-integration-20261013/README.md).

**Snapshot date:** 2026-10-13.
**Scope:** the plain French-style baguette as a prepared bread identity, its Québec French naming, and its boundary from generic bread rolls and other breads.

## Recommendation

**Add an identity-only `baguette / baguette` reference** in `BAKING_MIXIN_AND_PANTRY`. The OQLF entry treats *baguette* as a named bread and gives *french stick* as its English equivalent. For search, use the English aliases `baguettes`, `French baguette`, `French baguettes`, `French stick`, `French sticks`, `long French stick`, and `long French sticks`; retain the French display `baguette`, with `baguettes`, `baguette française`, `baguettes françaises`, and `pain baguette` as French search aliases. OQLF supports `french stick` and `long french stick`; Metro Québec listings attest `French Baguette` / `Baguette française`, and a Metro recipe uses `pain baguette` [S01–S05]. Do not add the broad alias `French bread`.

Keep the identity scoped to the French-style long loaf. Do not collapse it into generic `bread roll / petit pain`, sandwich bread, brioche, sourdough bread, flatbread, or croutons. Retail names such as `Baguette calabrese` and `Baguette ciabatta` retain their stated style qualifiers; this proposal does not classify those products as aliases of the plain baguette. Do not create a distinct identity for `baguette au levain` based only on a fermentation qualifier.

Add no forms, density, unit mappings, package yields, measurements, recipe links, conversions, or substitutions. Retail package weights and whole-baguette recipe quantities are source-specific and do not establish a reusable count or mass mapping.

## Current picker ownership and collision audit

The live `ingredient-references.v1.json` contains 1,353 references. Accent- and punctuation-folded exact matching found no active owner for `baguette`, `baguettes`, `baguette française`, `baguettes françaises`, `French baguette`, `French baguettes`, `French stick`, `French sticks`, `long French stick`, `long French sticks`, or `pain baguette`. The 64-record `legacy-import-identities.v1.json` candidate set also has no exact owner for those strings.

The closest existing bread references are:

| Existing reference | Current picker labels | Boundary |
|---|---|---|
| `ingredient-ref-bread-roll` | `bread roll / petit pain`; plural aliases only | Generic small rolls; the OQLF baguette definition is a long loaf. Do not make either name an alias of the other. |
| `ingredient-ref-brioche-bread` | `brioche bread / pain brioche` | A named bread type; its identity does not cover baguette. |
| `ingredient-ref-sandwich-bread` | `sandwich bread / pain de mie` | A sliced loaf product, distinct from baguette. |
| `ingredient-ref-sourdough-bread` | `sourdough bread / pain au levain` | Fermentation descriptor identity; do not turn a baguette made with levain into a general alias or form here. |
| `ingredient-ref-flatbread` | `flatbread / pain plat` | Flatbread family; shape and product class differ. |

The exact-name audit found no picker collision, so no existing row should be relinked or broadened as part of this candidate. Keep style-qualified products such as `Baguette calabrese` and `Baguette ciabatta` out of its aliases.

## Recipe-corpus demand

The bundled corpus has 114 recipe JSON files and 1,123 ingredient rows. A case-insensitive full-file scan found **zero** occurrences of `baguette`, `French stick`, or `pain baguette`, including ingredient lines. There is no bundled line to link, and no recipe-level measurement demand to justify forms or conversions. The addition would be coverage for a named, source-backed bread identity, not a response to current bundled-recipe frequency.

Québec publisher examples do show actual recipe use: Metro's croque-monsieur recipe names a baguette as the sandwich bread, and its bruschetta recipe uses baguette slices as the base that is toasted into croûtons. These examples support treating the bread as a recipe ingredient while keeping it distinct from the prepared croûtons; they do not establish a package or serving conversion.

## Evidence and limits

| ID | Source and support | Limit |
|---|---|---|
| `WP03-G-BAGUETTE-20261013-R26-S01` | Office québécois de la langue française, [*baguette*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887670/baguette). Gives preferred French term `baguette`, defines the bread as a long golden loaf, and lists English `french stick` with associated `long french stick`. Supports the bilingual identity and its boundary from a small generic roll. | Terminology entry last updated in 1983; it does not define every modern product sold with `baguette` in its name or establish recipe measurements. |
| `WP03-G-BAGUETTE-20261013-R26-S02` | Metro Québec, [*Baguettes* grocery category](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-frais-et-baguettes/baguettes). Lists current French-market products including `Baguette française` and `Baguette calabrese`, supporting local product availability and the need to retain explicit style qualifiers. | Dynamic retailer category; item availability and SKU weights are not universal identity or conversion data. |
| `WP03-G-BAGUETTE-20261013-R26-S03` | Metro, [*Croque-monsieur aux poireaux et au jambon sur pain baguette*](https://www.metro.ca/recettes-et-occasions/recettes/croque-monsieur-aux-poireaux-et-au-jambon-sur-pain-baguette). Its ingredient list names one baguette and uses it as the sandwich bread. | One publisher recipe; count is not a generic mass or package yield. |
| `WP03-G-BAGUETTE-20261013-R26-S04` | Metro, [*Bruschetta fraises, concombre et herbes*](https://www.metro.ca/recettes-et-occasions/recettes/bruschetta-fraises-concombre-et-herbes). Its ingredient list calls for a baguette, then the instructions slice and toast it for the bruschetta base. | One publisher recipe; the resulting croûtons are a prepared use, not an alias or form of the unprepared baguette. |
| `WP03-G-BAGUETTE-20261013-R26-S05` | Metro, [*Baguettes* English grocery category](https://www.metro.ca/en/online-grocery/aisles/bread-bakery-products/freshly-baked-bread-baguettes/baguettes). Lists `Première Moisson French Baguette` and separate style-qualified products such as `Authentic Italian Calabrese Baguette`. | Dynamic retailer listings attest local English product wording and show that some products carry distinct style qualifiers; SKU titles and weights are not universal identity or conversion evidence. |

## Review checks

- Checked Section G and the R21–R25 WP03 Section G reviews; no earlier proposal or active reference is dedicated to baguette identity.
- Matched the candidate phrases against all active picker labels and legacy import candidates; exact owner count is zero.
- Scanned all 114 bundled recipe JSON files and their 1,123 ingredient rows for direct baguette wording; no matches were found.
- No app, unit, instrumentation, or emulator tests were run because this update only adds database JSON data and derived catalog content under `AGENTS.md`.

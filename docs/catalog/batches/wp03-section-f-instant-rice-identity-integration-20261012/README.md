# WP03 Section F — instant rice identity integration (2026-10-12)

## Decision

Added identity-only `quick-cooking rice / riz à cuisson rapide` as
`ingredient-ref-instant-rice` in `GRAIN_AND_CEREAL`, with aliases `instant rice / riz instantané`.
Federal English and French rice specifications define instant rice as cooked and dehydrated and
distinguish it from parboiled rice. Current Minute Rice Canada pages use the selected Canadian
English and Québec French product wording. The manufacturer also separates dry quick-cook products
from ready-to-serve microwave cups.

Keep ambiguous `riz précuit`, Minute Rice brand wording, ordinary/parboiled rice, grain varieties,
flavoured products, and fully cooked cups or pouches separate. The full manifest-listed recipe corpus
has no candidate mentions or matching ingredient rows. No forms, measures, density, unit mappings,
recipe links, conversions, yields, or substitutions were added. The ledger records seven sources,
researched-no-supported-value measurement status, a no-supported-substitute finding, and the accepted
identity decision.

## Evidence and review

See the [source-backed review proposal](../../proposals/wp03-section-f-instant-rice-processing-identity-review-20261012.md)
for current ownership, projected picker behavior, all rice-related recipe rows, source limits, and
the pre-integration snapshot.

Key sources:

- Department of National Defence, [Food Quality Specifications: Rice (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf) and [Riz (French)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf), which define the product-processing distinction and bilingual instant-rice wording.
- Minute Rice Canada, [Quick Cook Long Grain White](https://www.minuterice.ca/products/instant-long-grain-white-rice/) and the French [À propos de nous](https://www.minuterice.ca/fr/a-propos-de-nous/) and [Produits](https://www.minuterice.ca/fr/produits/) pages, which support the Canadian product names and dry/cup boundary.
- Maxi Québec, [Riz blanc à grains longs à cuisson rapide](https://www.maxi.ca/fr/riz-blanc-grains-longs-cuisson-rapide/p/20310858_EA?source=sptd), a search-indexed retail title whose direct page retrieval failed during review.
- Metro, [Ready-to-Serve Basmati Rice](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/plats-d-acccompagnements/accompagnement-a-base-de-pomme-de-terre-et-riz/riz-basmati-pret-a-servir/p/059100008614), which identifies a fully cooked cup as a separate prepared product.

## Static validation

- Bundled seed package validation passed at 1,287 references, 97 forms, and 114 recipe files.
- Reference normalization and generated Kotlin catalog checks passed; the generated index contains 1,287 references.
- Research ledger validation passed with 1,594 records, 5,699 source entries, 4,730 distinct source IDs, and 8 unit conversions.
- Exact phrase ownership found one active owner for each adopted display/alias and no form or legacy owner. The excluded `riz précuit` and `Minute Rice` phrases remain unassigned.
- The 114-file, 1,123-row recipe corpus has zero matching mentions; its digest is unchanged.
- UTF-8 without BOM, escaped JSON Unicode, and scoped whitespace checks passed.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Post-integration fingerprints

| Artifact | SHA-256 |
| --- | --- |
| Ingredient references (1,287) | `15879a535316a33ab879e76ae3aa92edb3bc9213063568f7bb8ebbb5add2ba0b` |
| Research ledger (1,594 records) | `a48e2010a9d8c3aed9de5cbbe50c899b8409a0c28d989e5814eae6ac553205d4` |
| Ingredient forms (97) | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| Manifest | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

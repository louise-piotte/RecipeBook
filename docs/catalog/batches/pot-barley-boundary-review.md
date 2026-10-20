# WP03 pot barley product-boundary review

- **Owner:** WP03 grain identity research and integration
- **Reviewed:** 2026-10-07
- **Status:** 2026-10-07 hold, superseded by the 2026-10-11 source-backed picker-name follow-up below.
- **Scope:** the 2026-10-07 review distinguished pot/Scotch barley from pearl and hulled barley and withheld an active reference pending a usable French display.
- **Recipe audit:** all 114 bundled recipes were scanned; none names barley.

## Decision

Pot barley / Scotch barley is a distinct processing candidate from hulled barley. Federal food specifications and a Canadian mill describe pot barley as dehulled and lightly polished, retaining some of the bran. Hulled barley has only the inedible outer hull removed, leaving the bran layer intact. Pearl barley is more heavily polished. The English product boundary is supported.

At the 2026-10-07 review, the French picker name was unresolved. Federal purchasing material and Canadian supplier catalogs paired *pot barley* with *orge mondé*. OQLF gives *orge mondé* as the established name for hulled barley, and TERMIUM groups *pot barley*, *hulled barley*, and *Scotch barley* under *orge mondé / orge mondée*. The hold avoided activating the colliding French alias or merging the English products.

At that checkpoint, no English or French aliases, measurements, forms, densities, unit mappings, conversions, yields, or substitutions were active. The candidate and its evidence are recorded in `research-ledger.v1.json`.

## Follow-up: picker-name resolution (2026-10-11)

The subsequent review promoted `ingredient-ref-pot-barley` as identity-only `pot barley / orge en pot`.
Current Canadian French retail listings use *orge en pot* as a product title, while paired Metro pages
also show that *orge mondé* remains ambiguous for the same UPC and cannot serve as a unique alias.
Keep only the federal-specification-paired English alias `Scotch barley`; add no French aliases,
recipe links, forms, measurements, conversions, yields, or substitutions. Independent Québec bilingual
approval was pending at that review. See [`wp03-pot-barley-quebec-french-name-resolution-20261011.md`](../proposals/wp03-pot-barley-quebec-french-name-resolution-20261011.md).

## Independent Québec wording review (2026-10-18)

R702 approved `orge en pot` as a clear, market-attested picker display, without presenting it as an
OQLF-preferred term. The review keeps the French alias list empty and preserves `orge mondé` for
hulled barley and `orge perlé` for pearl barley. It found no pot-barley ingredient-line demand in the
114-recipe bundle. See the
[`R702 proposal`](../proposals/wp03-section-f-pot-barley-quebec-display-review-r702-20261018.md).

## Sources

- **WP03-S81 — Department of National Defence, [Food Quality Specifications: Grains (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf):** FQS 24-01 separates pearl, Scotch/pot, and hulled barley and describes the processing distinction.
- **WP03-S82 — Ministère de la Défense nationale, [Spécifications de qualité des aliments : céréales (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf):** corresponding French federal food-purchasing specification; its terminology does not supply an unambiguous current Québec picker name for the distinct processes.
- **WP03-S83 — Nith River Milling, [Barley Products](https://www.nithriver.ca/barley):** defines pot barley as dehulled and lightly polished to remove some, but not all, of the outer bran; distinguishes milling/dehulled barley, which retains the bran layer.
- **WP03-S84 — TERMIUM Plus, [Scotch barley](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enw&lang=fra&srchtxt=SCOTCH+BARLEY):** current grain-growing terminology groups pot, hulled, and Scotch barley under French *orge mondé / orge mondée* and defines the French term by removing the first hull. This documents the naming conflict; it does not establish product equivalence.
- **WP03-S85 — Johnvince Foods, [Product Catalogue 2024](https://johnvince.com/wp-content/uploads/2025/11/JVF-CATALOGUE-2024.pdf):** lists *Pot Barley / Orge mondé* and separately *Pearl Barley / Orge perlé*.
- **WP03-S32 — OQLF, [orge mondé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358517/orge-monde):** pairs *hulled barley / orge mondé* and defines removal of the outer hull.

## Follow-up

- Keep the R702-approved market-attested display `orge en pot`; do not describe it as OQLF-preferred or add it as a French alias.
- Keep pot/Scotch barley distinct from pearl and hulled barley.
- Continue the remaining Section F candidates and identity/form review.

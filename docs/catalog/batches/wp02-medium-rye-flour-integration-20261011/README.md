# WP02 Section A medium rye flour integration

Integrated the medium-rye recommendation from the [product-boundary review](../../proposals/wp02-medium-dark-rye-product-boundary-review-20261011.md) after the independent [Québec French wording review](../../proposals/wp02-medium-rye-quebec-wording-independent-review-20261011.md) accepted the bilingual display.

## Integrated identity

Added identity-only **medium rye flour / farine de seigle moyenne** as ingredient-ref-medium-rye-flour in FLOUR_AND_STARCH, with no aliases, forms, recipe links, measurements, conversions, yields, or substitutions.

Canadian milling and baking sources name medium rye as a grade between lighter and darker products. Their descriptions do not establish one universal ash, extraction, bran, germ, or protein threshold, so the catalog stores only the named market grade. TERMIUM and a federal bilingual bakery glossary support the French display; the reviewer found no direct Québec mill package label and did not claim OQLF approval. See [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esb&lang=fra&srchtxt=HARINA+CENTENO+MEDIO) and the [federal bilingual glossary](https://publications.gc.ca/collections/collection_2012/tpsgc-pwgsc/S52-4-8-3.pdf).

The general dark-rye identity remains held. Current product names are locally attested, but supplier definitions vary between whole-grain flour and other milling scopes. Keep dark rye separate from whole rye flour, rye meal, and pumpernickel meal. No rye recipe line or whole-recipe mention was found in the current bundled corpus.

## Validation

- Bundled package validation passed.
- Generated ingredient-catalog freshness check passed at 1,081 references.
- Ingredient-reference JSON is ASCII-escaped UTF-8 without BOM.
- No tests or emulator run: this batch only adds database JSON data and updates its documentation.

## Snapshot

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,081 | 3a381c9d6293786ddf26f8f9dcff3688400caebace60c293175797b67a7a87ab |
| Ingredient forms | 79 | e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419 |
| Research ledger | 1,380 records; 4,572 source entries; 3,742 distinct source IDs | 951867ea3e6f3d035d484d84234dd223996080e5c74b27422193be5f040c2258 |
| Recipe corpus | 114 files; 1,123 ingredient rows | 5d3ac3f9b0ea87ee42539255594754b782b4c0f99cf3dea7277fe096c7737425 |
| Generated Kotlin index | 1,081 references | 4f1fbc2a12d1b67daeaf7fac0303a414b127d29043a6d2aaa688d5465cfed393 |

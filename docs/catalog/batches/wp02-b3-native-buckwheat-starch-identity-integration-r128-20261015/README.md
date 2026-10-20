# WP02 Section 04 B3 — native buckwheat starch integration (R128)

Integrated one identity-only **native buckwheat starch / amidon de sarrasin natif** reference. Keep
it distinct from buckwheat flour, meal, flakes, groats, noodles, and modified buckwheat starch. The
French display is provisional: OQLF's preferred `amidon` and `sarrasin` terms and a French patent's
exact compound support the wording, but no current Québec package label or product-specific OQLF
headword was found.

The Korean *memilmuk* source documents a traditional set jelly made from buckwheat starch sediment;
the Canadian patent documents isolated native buckwheat starch as a food ingredient. Neither gives a
reusable household quantity or density. The patent's cereal-dough formulations and a study adding
mung-bean starch to buckwheat jelly do not support a general kitchen substitution. The recipe bundle
has no matching demand.

Added `ingredient-ref-native-buckwheat-starch` and one accepted research-ledger record with nine
sources, including the independent Québec terminology review. Aliases remain empty. No forms,
measurements, mappings, recipe links, conversions, yields, or active substitutions were added. The
existing buckwheat flour and all related buckwheat rows remain unchanged.

No unit, instrumentation, Gradle, emulator, or other tests were run because this change only adds
database JSON data and refreshes its generated search index. Static package, ledger, reference
normalization, generated-index, source-ID, picker, recipe-corpus, encoding, link, and whitespace
validation results are recorded below.

## Integration checks

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` — bundled package
  and research ledger are valid.
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check` — package is already
  normalized.
- `python3 -B tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — references
  are already normalized.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated
  Kotlin search index is current at 1,477 references.
- The nine R128 source IDs are unique within the ledger record and have no other ledger owner. The
  new row has empty aliases, null density, no unit mappings or forms, and the phrase-first picker
  projection leaves flour queries on flour identities.
- The manifest-listed 114 recipe files were searched for the English/French starch names and
  *memilmuk*; no matches were found. The bundled recipe count and 1,123 ingredient rows are unchanged.
- UTF-8/no-BOM and explicit-escape checks passed for database JSON. Links and trailing whitespace
  were checked in the proposal, README, and updated global plan/roadmap records.

After this integration the package contains 1,477 references and 107 forms. The ledger contains
1,820 records, 7,542 source entries, and 6,415 distinct source IDs.

See the detailed [R128 proposal](../../proposals/wp02-b3-regional-starch-next-candidate-review-20261015-r128.md).

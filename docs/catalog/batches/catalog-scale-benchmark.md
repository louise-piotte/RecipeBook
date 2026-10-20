# Catalog scale benchmark

Date: 2026-10-06

## Device and profile

The benchmark ran on the Pixel 9a Android 16 / API 36 emulator (`emulator-5554`) using
`CatalogScaleBenchmarkTest`. Its synthetic catalog contains 10,000 ingredient references, 5,000
forms, 10,000 global form-substitution rules, 10,000 contextual rules, and a 40-line recipe. The
profile is a stress case; the repository does not define a numeric final catalog size.

The test verifies an exact reference alias query, an exact form query, a mid-word substring query,
and resolution of every recipe line. Its generated substitution rules intentionally do not match
the source forms, so the expected suggestion set is empty. Search uses four warm-ups and 20 measured
queries per path. Reference-map construction uses 10 samples. The resolver is built once and reused
across the 40 lines.

## Measurements

| Operation | Before indexes/caching | Indexed/reused |
| --- | ---: | ---: |
| Search mean | 810.97 ms | Exact phrase: 0.040 ms; partial: 5.76 ms |
| Search p95 | 1,340.92 ms | Exact phrase: 0.051 ms; partial: 6.68 ms |
| Reference map build mean | 1.13 ms | 1.40 ms |
| Resolve 40 detail lines | 299.57 ms | Resolver build: 24.33 ms; resolve 40 lines: 1.90 ms |

Building the search index for the stress profile took 1,212.04 ms. It is retained once for the
current immutable reference/form snapshot. Search results use exact attached-form lookup, indexed
word candidates for complete phrases, and a scan of already-normalized terms for partial substrings.
The resolver builds reference/form/rule maps and groups rules by source once per recipe/detail
snapshot.

## Correctness and invalidation

- Unit coverage verifies exact form priority, broad word search, mid-word partial matching, and
  form hints.
- Rebuilding the search index after an ingredient identity changes returns the new identity; the
  old immutable index continues to represent its original snapshot.
- Compose callers key the search index by the active reference/form lists. Recipe detail keys the
  resolver by recipe, tags, references, and substitution catalog.
- The on-device benchmark asserts one expected result for each search path and resolves all 40
  lines without suggestions under this profile.

## Limits and next step

These timings establish that repeated full normalization and per-line resolver reconstruction were
costly for this stress profile, and that snapshot reuse makes phrase search and detail resolution
small. Partial matching remains a normalized-term scan and measured 6.68 ms p95 on this device.
The one-time 1.21 s index build is visible at 10,000 references; reassess where it runs if the
intended catalog approaches this size. This profile does not establish a final maximum population,
and the final intended-population benchmark remains open until that target is defined.

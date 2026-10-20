# WP03 Section F: sorghum semolina identity integration

Added identity-only `ingredient-ref-sorghum-semolina` as **sorghum semolina / semoule de sorgho** in `GRAIN_AND_CEREAL`, with English aliases `jowar rava` and `sorghum rava`. Both aliases are source-qualified. Current token search also makes a bare `rava` query return this row; this is an attested sorghum-rava product name, and no unqualified `rava`, `rawa`, `sooji`, `suji`, or `semolina` alias was added.

The new identity stays separate from intact grain sorghum, sorghum flour, puffed sorghum, unresolved sorghum flakes, sorghum grits, durum semolina, other millet ravas, and prepared foods. No recipe line matched the candidate phrases in the 114-recipe / 1,123-row corpus. Keep `defaultDensity` null, `unitMappings` empty, forms and conversions absent, and recipe links, yields, and substitutions inactive. Measurement research remains `blocked_pending_evidence`: CNF 2026 Food Name and Measure Weight Conversion files were listed, but their dataset page and direct CSV routes were unavailable during review. Do not infer that the food row is absent.

Static package normalization, generated-index freshness, research-ledger schema validation, source-ID ownership, recipe corpus scan, UTF-8/no-BOM and escaped-Unicode checks, and scoped `git diff --check` passed. No app tests or emulator checks were run because this update only adds database JSON data and documentation. Section F remains open.

See the [identity review and source register](../../proposals/wp03-section-f-sorghum-semolina-jowar-rava-identity-review-20261013.md).

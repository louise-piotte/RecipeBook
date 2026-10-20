# WP02 A6 — Korra foxtail millet aliases

Integrated on 2026-10-13 as a searchability update to two existing identities:

- Added `korra` to the English aliases for `foxtail millet / millet d'Italie`.
- Added `korra flour` to the English aliases for `foxtail millet flour / farine de millet d'Italie`.

FSSAI lists Telugu `Korra` under foxtail millet (*Setaria italica*). ICAR–Indian Institute of Millets Research pairs `Foxtail Millet/Korra` and names `Korra flour`; a Canada-facing marketplace listing also pairs Korra with its foxtail-millet-flour product. The listing supports search wording, not a Québec French name or a reusable measurement. [FSSAI](https://fssai.gov.in/upload/EATRIGHTINDIA/Standards.pdf), [ICAR–IIMR Technologies at a Glance](https://www.millets.res.in/technologies/Technologies_at_glance.pdf), [Silkrute Canada product listing](https://www.silkrute.ca/grocery/cooking/flour/product-130613/)

The French displays and empty French alias arrays remain unchanged. `Korra pindi`, `Korra atta`, other transliterations, `farine de Korra`, and the brown-top millet names `Korale` / `Andukorralu` remain inactive. The flour row retains `defaultDensity: null`, `unitMappings: []`, its existing source-scoped measurement observations, and blocked substitution research. No forms, recipe links, measures, conversions, yields, or substitutions were added.

Static picker projection: `korra flour` returns the foxtail-millet-flour row alone; `korra` returns both grain and flour. The broader `millet flour` query continues to return the generic, finger-, foxtail-, kodo-, pearl-, and proso-millet-flour identities. The manifest-listed recipe corpus has no Korra-related text or ingredient-row matches (114 files, 1,123 rows).

The ledger adds three sources across the two existing records: `WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S01` through `S03`. Identity, measurement, and substitution states are unchanged. Static package normalization, generated-index freshness, ledger schema validation, ownership/picker projection, corpus, encoding, and scoped whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data and its generated search index.

Post-integration snapshot: 1,336 active references (SHA-256 `eac7ae7bb7910c493488c3141076f06ae618cad7f6053e7fc28ec39bebf96f3d`); 1,644 ledger records, 6,186 source entries, and 5,191 distinct source IDs (SHA-256 `30213f6ec9c4c382a9282a4045a96323e5e31ba344d64e0485db7f7e6e537225`); the generated Kotlin index contains 1,336 references. WP02 A6 remains open.

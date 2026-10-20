# Catalog gap decisions — 2026-10-16 integration

## Decision

Integrated 16 reviewed identity candidates and updated the existing peanut-butter identity/evidence record. This batch changes no recipe rows, ingredient forms, conversions, package yields, or substitution rules. All new references have `defaultDensity: null` and empty `unitMappings`.

| Reference | Category | Source review |
|---|---|---|
| `ingredient-ref-white-spelt-flour` | `FLOUR_AND_STARCH` | [R209 white spelt flour](../../proposals/wp02-section-a-white-spelt-flour-identity-review-r209-20261016.md) |
| `ingredient-ref-precooked-fonio` | `GRAIN_AND_CEREAL` | [R210 precooked fonio](../../proposals/wp03-section-f-precooked-fonio-grain-identity-review-r210-20261016.md) |
| `ingredient-ref-sambal-bajak` | `SAUCE_AND_CONDIMENT` | [R214 sambal bajak spelling](../../proposals/wp05-section-x-sambal-bajak-spelling-review-R214-20261016.md) |
| `ingredient-ref-cuttlefish-balls` | `PROTEIN` | [R215 frozen cuttlefish balls](../../proposals/wp04-section-p-frozen-cuttlefish-balls-product-identity-review-r215-20261016.md) |
| `ingredient-ref-bottarga` | `PROTEIN` | [Bottarga identity boundary](../../proposals/wp04-bottarga-identity-boundary-20261009.md) |
| `ingredient-ref-rakkyo` | `SAUCE_AND_CONDIMENT` | [Rakkyo](../../proposals/wp05-east-asian-rakkyo-preserve-identity-review-20261016.md) |
| `ingredient-ref-fukujinzuke` | `SAUCE_AND_CONDIMENT` | [Fukujinzuke](../../proposals/wp05-east-asian-fukujinzuke-preserve-identity-review-20261016.md) |
| `ingredient-ref-mei-gan-cai` | `SAUCE_AND_CONDIMENT` | [Mei gan cai](../../proposals/wp05-east-asian-mei-gan-cai-preserve-identity-review-20261016.md) |
| `ingredient-ref-shibazuke` | `SAUCE_AND_CONDIMENT` | [Shibazuke](../../proposals/wp05-east-asian-shibazuke-preserve-identity-review-20261016.md) |
| `ingredient-ref-kuli-kuli` | `OTHER` | [Kuli-kuli](../../proposals/wp06-west-african-kuli-kuli-identity-review-20261016.md) |
| `ingredient-ref-korarima` | `BAKING_AND_SPICE` | [Korarima](../../proposals/wp06-ethiopian-korarima-identity-review-20261016.md) |
| `ingredient-ref-koseret` | `HERB` | [Koseret](../../proposals/wp06-ethiopian-koseret-herb-identity-review-20261016.md) |
| `ingredient-ref-quail-meat` | `PROTEIN` | [Quail meat](../../proposals/wp04-section-o-quail-meat-identity-review-20261016.md) |
| `ingredient-ref-chicken-thigh` | `PROTEIN` | [Chicken thigh cut boundary](../../proposals/wp04-section-o-chicken-thigh-cut-boundary-review-20261016.md) |
| `ingredient-ref-narazuke` | `SAUCE_AND_CONDIMENT` | [Nara-zuke](../../proposals/wp05-east-asian-narazuke-preserve-identity-review-20261016.md) |
| `ingredient-ref-prekese-pods` | `BAKING_AND_SPICE` | [Prekese pods](../../proposals/wp06-african-prekese-spice-identity-review-20261016.md) |

### Evidence states and boundaries

- White spelt flour has `researched_no_supported_value` measurement state and `blocked_pending_evidence` substitution research. Precooked fonio has `researched_no_supported_value` and `researched_no_supported_substitute` states.
- Frozen cuttlefish balls have no reusable measure or supported substitute. Bottarga measurement research found no supported value; its one NOAA recipe option remains too contextual to generalize as a catalog substitution.
- Other identity-only additions have measurement and substitution research marked `not_yet_researched`; their identity evidence does not imply numeric or replacement behavior.
- Rakkyo, fukujinzuke, mei gan cai, shibazuke, and Nara-zuke remain separate preserves. The East Asian and broader WP05/WP06 checklists remain open.
- Kuli-kuli remains distinct from peanuts, peanut butter, and groundnut intermediate products. Korarima remains distinct from Asian cardamom and grains of paradise. Koseret's unresolved taxonomic boundary remains documented.
- Quail meat is qualified as quail; chicken thigh uses the reviewed `haut de cuisse de poulet` display and preserves the CFIA/OQLF wording discrepancy. No broader cut aliases were added.
- The prekese French display `gousses de prekese` remains provisional. Source-local regional names and `gousses d’ésèse` were not promoted to universal aliases.
- R211 scallop roe/corail and R212 okara flour remain outside the active catalog and evidence ledger. The prior chuno/tunta and citrus terminology reviews made no shared catalog changes.
- The earlier bottarga coordinator hold deferred a row until a bundled roe recipe selected it. This hold is superseded by the accepted identity review: OQLF/TERMIUM terminology and current Canadian retail evidence establish a bounded Québec-facing product identity independently of bundled recipe demand. Keep broad Section P roe coverage open and retain the proposal's raw-roe, karasumi, tobiko, masago, ikura, and caviar boundaries.

### Peanut butter update

The existing `ingredient-ref-peanut-butter` keeps its ID, category, French display, aliases, and active density/mapping values; its English aliases now also include `creamy peanut butter` and `natural creamy peanut butter`. The ledger identity state is `verified`. The existing USDA SR28 observation remains unchanged, and two Kraft product portions are recorded as source-specific published observations: 1 tbsp = 15 g for the 2 kg Smooth Peanut Butter SKU and 1 tbsp = 15 g for the 750 g Only Peanuts All Natural Smooth Peanut Butter SKU. Neither value activates a general density or unit conversion. No recipe was edited.

### Source handling

The ledger gained 16 ingredient records and 103 source entries, including 93 source IDs that were new to the live ledger and 10 source IDs reused from existing records. Reused source IDs retain their canonical URLs. The Indonesia Travel / Ministry of Tourism source `WP05-SAMBAL-OELEK-20261011-S05` was refreshed in place and reused for sambal bajak after its 2026-10-16 direct review; its ID and URL did not change. The OQLF `poutargue` source is now registered as `WP04-ROE-S06`. Kuli-kuli's OQLF arachide source record is limited to that page and does not claim the separate peanut-butter page.

## Static validation

- The bundled seed package passed normalization check and validation-only mode.
- The generated Kotlin ingredient index was regenerated from the canonical JSON references and passed its freshness check.
- Ledger JSON Schema, batch source-ID/URL ownership, exact-key collisions, escaped-Unicode serialization, UTF-8 without BOM, and manifest-listed recipe corpus checks were reviewed.
- The bundle remains at 114 recipe files and 1,123 ingredient rows; no recipe data changed.
- No software tests, builds, emulator checks, or deployment were run. The change only adds or updates database JSON data, under the current `AGENTS.md` rule.

At integration time, a repository-wide ledger audit found four source IDs attached to multiple URLs (`WP03-S24`, `WP03-S5`, `WP03-S3`, and `WP03-TC-20261009-S05`) and six dangling decision source IDs. A follow-up cleanup split the three CNF dry/cooked page IDs, standardized the CFIA URL, registered the missing yeast and cabbage evidence, and corrected a truncated Pacific-herring observation citation. The whole-ledger source-ID/URL and citation checks now pass; see the [ledger integrity cleanup](ledger-integrity-cleanup-20261016/README.md).

Snapshot after integration: 1,611 ingredient references, 122 forms, 61 legacy-import candidates, and 1,956 ledger records / 8,491 source entries / 7,221 distinct source IDs. WP02 Sections A/F, WP03 Sections F/I, WP04 Sections O/P, WP05 Section X, and WP06 regional coverage remain open beyond the candidate-specific decisions recorded here.

Snapshot hashes: reference JSON `bf4f6eeca4690f793a6a0653ac3a94ed18d290175f79b9918eb915007c0e0cd6`; research ledger `13d70338acc6a3306977986131775a78252205785fe85d228d1125ca00513ff1`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; manifest-ordered recipe corpus `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`.

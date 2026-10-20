# WP02 Section A7 R454: Canadian farina-product alias review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17 after root review; see the integration record at
  `docs/catalog/batches/wp02-a7-farina-alias-integration-r454-20261017/README.md`.
- **Open checklist:** WP02 Section A7 remains open for other grain meals and milling products ([plan, current A7 item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004)).
- **Scope:** Review the exact bilingual Ardent Mills Canada product wording `Farina Flour / Farine Farina` against the already active `spring wheat semolina / semoule de blé tendre` reference. This does not reopen the held generic aliases `farina`, `wheat farina`, or `whole grain wheat farina` from earlier A7 reviews.
- **Source IDs:** `WP02-A7-FARINA-ALIASES-R454-20261017-S01` and `S02` are registered in the spring-wheat-semolina research-ledger record. Existing OQLF and Prairie Flour Mills source IDs are reused below.

## Recommendation

Add two narrowly scoped search aliases to the existing row `ingredient-ref-spring-wheat-semolina`:

| Field | Proposed value |
|---|---|
| Existing canonical identity | `spring wheat semolina / semoule de blé tendre` |
| Existing category | `FLOUR_AND_STARCH` |
| English alias to add | `farina flour` |
| French alias to add | `farine farina` |
| New reference or candidate ID | None |
| Other aliases | None |
| Forms, measures, density, unit mappings, conversions, yields, recipe links, substitutions | None |

Ardent Mills Canada currently titles its English product page **Farina Flour** and its French page **Farine Farina**. Both pages describe a coarse, granular product made from purified endosperm of Canadian hard red spring wheat, for slow-cooking breakfast cereals and specialty breads [S01–S02]. The OQLF’s wheat-milling entry makes `semoule de blé tendre` the preferred French term and lists both `farina` and `spring wheat semolina` as English terms [reused `WP03-IDLI-RAVA-20261012-S07`]. Ardent’s documented grain and milling fraction fit the existing spring-wheat-semolina identity; a duplicate reference is not justified.

Keep the canonical display pair unchanged. Treat the exact Ardent wording as product-name aliases, not as permission to add bare `farina`, generic `farine`, `wheat farina`, `whole grain wheat farina`, `Wheatlets`, `semolina`, or `semoule` as aliases. The current picker will also return this row for the one-word query `farina` because it matches words inside aliases; that expands the existing four-result query to five results. This is a known search side effect of the exact phrase alias, not a proposal to make every product called *farina* equivalent.

## Current-state and ownership audit

The read-only audit used the current split seed package and its current manifest:

| Store | Current snapshot | Exact ownership finding |
|---|---:|---|
| Ingredient references | 1,742 rows; SHA-256 `a628756c04a5eac9edc4e60e349f5fab4eb8b5a293a440ea2d1c6a4b5854527a` | `ingredient-ref-spring-wheat-semolina` owns the canonical pair and has empty aliases. No reference has the exact alias `farina flour` or `farine farina`. Four Italian type-flour rows own their specific `farina di grano tenero tipo 0/00/1/2` aliases; none owns the Ardent product wording. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form label or match term owns either proposed phrase. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact candidate name or alias owns either proposed phrase. |
| Research ledger | 2,101 records, 9,562 source entries, 8 unit-conversion records; SHA-256 `04d107602f3df7bd7345793366c3d838b18207a679e22cf4b4231304cb36bbc3` | The active spring-wheat-semolina ledger record already contains the Prairie mill source and reused OQLF source. There is no Ardent Farina product source or dedicated alias decision. No candidate or new ID is proposed. |
| Recipe manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Every path exists and parses. The full corpus fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`; recipe results are below. |

The archive check found no earlier review or integration of the exact Ardent page titles `Farina Flour` and `Farine Farina`. R394 added the existing spring-wheat-semolina identity and explicitly excluded the broad alias `farina` because the picker already returns four Italian flour-grade rows. R454 adds the separately attested, exact two-word manufacturer labels only and records their search effect. R451 concerns wheat groats and does not overlap this milling-product alias boundary.

## Exact picker projection

The projection applies `IngredientSearch.kt`: normalized whole-word phrases are preferred, followed by substring fallback. It uses the current names, aliases, and form terms and then adds only the two proposed aliases to `ingredient-ref-spring-wheat-semolina`.

| Query | Current results | Projected results |
|---|---|---|
| `farina flour` | None | `ingredient-ref-spring-wheat-semolina` |
| `farine farina` | None | `ingredient-ref-spring-wheat-semolina` |
| `farina` | 4: Italian type 0, 00, 1, and 2 soft-wheat flours | The same four plus `spring wheat semolina` (5 total) |
| `farina di grano tenero tipo 0` | `ingredient-ref-italian-type-0-flour` | Unchanged |
| `spring wheat semolina` | `ingredient-ref-spring-wheat-semolina` | Unchanged |
| `semoule de blé tendre` | `ingredient-ref-spring-wheat-semolina` | Unchanged |
| `semolina` | 7: barley, durum, emmer, Sankhal, remilled durum, sorghum, and spring wheat semolina | Unchanged |
| `semoule de blé` | 4: durum, emmer, remilled durum, and spring wheat semolina | Unchanged |
| `wheat farina` | None | None; no such alias is proposed |
| `farine` | 170 broad French flour matches | 171; the new source-exact French alias adds the spring-wheat row |

The broad `farina` and `farine` results are an intentional consequence of the app’s substring-capable picker. The integration reviewer accepted this limited effect because the manufacturer phrases describe the existing identity and OQLF independently lists `farina` as an English term for `semoule de blé tendre`. The stored aliases remain the exact two-word supplier titles; no bare `farina` or generic `farine` alias is stored.

## Complete manifest recipe scan

All **114** files named by the current manifest were parsed, covering **1,123 ingredient rows**. The scan checked every complete decoded recipe JSON and every complete structured ingredient row, using lowercase, accent/ligature folding, punctuation normalization, whitespace collapse, and word-boundary phrase matching.

The candidate and neighbor phrases searched were `farina flour`, `farine farina`, `farina`, `spring wheat semolina`, `semoule de blé tendre`, `wheat semolina`, `wheat farina`, `whole grain wheat farina`, `semolina`, `semoule de blé`, `durum semolina`, and `whole wheat meal`. Results: **0 matching recipe files and 0 matching ingredient rows** for all listed milling phrases. The general query word `farine` is not counted as candidate demand because it is a broad word matching unrelated flour ingredients. No recipe link, relink, or recipe edit is proposed.

## Product boundary, numeric limits, forms, and substitutions

- The Ardent pages describe a grain-specific, coarse granular endosperm product; they do not provide a sieve cutoff, separate coarse/fine grades, or a reusable form label. Do not create an ingredient form from the descriptive phrase alone.
- Ardent lists a 20 kg bag, bulk, tote, and maximum moisture of 15% [S01–S02]. These are industrial availability/specification details, not household measures, mass-volume conversions, or densities. The older OQLF definition gives a 13.5% moisture limit for its terminology class [reused `WP03-IDLI-RAVA-20261012-S07`]; Ardent’s upper specification does not reveal a tested batch value or establish compliance with that limit. Import neither percentage as catalog data.
- Ardent lists slow-cooking breakfast cereal and specialty breads as applications. It provides no recipe amount, ratio, volume measure, preparation yield, or substitution claim. Add no measurement, unit mapping, conversion, yield, or active substitution.
- The identity remains distinct from `durum semolina / semoule de blé dur`, remilled durum semolina, `whole wheat meal / farine de blé entier brute`, ordinary wheat flour, and prepared cream-of-wheat cereal. Ardent’s purified-endosperm description does not make it whole-wheat meal or flour.
- Product-level alias evidence is not bundled-recipe demand: the complete manifest scan found none.

## Evidence limits and source register

Ardent Mills is a current Canadian commercial mill source, but this is an industrial product page and Ardent says it does not sell directly to home bakers. The two bilingual pages establish exact supplier wording and grain/process context, not current consumer retail availability or general naming practice across Canada. `Farine Farina` is retained only as the exact French page title; it is not presented as an OQLF-preferred term. OQLF’s terminology record dates to 1982 and provides the strongest French classification, but it is not a contemporary retail survey. The 15% maximum on Ardent’s page and OQLF’s 13.5% definition do not establish an actual product moisture value.

| Source ID | Source and locator | Supports | Limit |
|---|---|---|---|
| **Proposal-local** `WP02-A7-FARINA-ALIASES-R454-20261017-S01` | Ardent Mills Canada, [Farina Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/farina/), accessed 2026-10-17. | Exact English product title; coarse granular purified endosperm of Canadian hard red spring wheat; slow-cooking cereal and specialty-bread applications; 20 kg/bulk/tote and 15% maximum-moisture listing. | Commercial supplier page, not a home-consumer retail listing; does not give exact particle size, forms, measures, or batch moisture. |
| **Proposal-local** `WP02-A7-FARINA-ALIASES-R454-20261017-S02` | Ardent Mills Canada, [Farine Farina](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/farina/), accessed 2026-10-17. | Exact French product-page title and matching Canadian hard-red-spring-wheat endosperm description. | Exact manufacturer wording, not a language-authority ruling or proof of broader Québec usage; industrial page, not retail availability. |
| **Reused — ledger** `WP03-IDLI-RAVA-20261012-S07` | OQLF, [GDT: semoule de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432749/semoule-de-ble-tendre), preferred term, definition, English translations; accessed 2026-10-17. | Preferred French term `semoule de blé tendre`; English terms include `farina` and `spring wheat semolina`; terminology boundary excludes durum. | Entry last updated 1982; does not identify the Ardent SKU or certify its moisture specification. Reuse the existing ledger source ID. |
| **Reused — ledger** `WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S01` | Prairie Flour Mills, [Products](https://prairieflour.com/products/), Wheat Semolina entry. | Existing product owner: wheat semolina milled from Canadian Red Spring Wheat endosperm, offered in coarse/fine granulation. | Separate Canadian mill product description; it does not mention Ardent’s exact Farina page titles. Reuse the existing source ID. |

## Disposition

Integrated only `farina flour` in English aliases and `farine farina` in French aliases on `ingredient-ref-spring-wheat-semolina`. Kept `spring wheat semolina / semoule de blé tendre` as the canonical display, added no new identity or ledger candidate, and preserved all numeric, form, conversion, recipe-link, yield, and substitution fields. Bare `farina` and all other broad or unverified terms remain off the stored aliases. No software tests or emulator checks were run because the change only adds database JSON data under `AGENTS.md`.

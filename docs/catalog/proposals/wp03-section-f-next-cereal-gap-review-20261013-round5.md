# WP03 Section F — Whole jowar alias review (2026-10-13, round 5)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated on 2026-10-13; see the integration record at the end of this proposal.
- **Scope:** Decide whether the source-qualified Canadian product wording `jowar whole` should be an English search alias on the existing grain-sorghum reference.
- **Recommendation:** Add only `jowar whole` to `ingredient-ref-grain-sorghum.aliasesEn`. Do not store bare `jowar`, add a French alias, create another identity, or add forms or numeric behavior.
- **Proposal-local source IDs:** `WP03-JOWAR-GRAIN-ALIAS-20261013-R5-S01` and `WP03-JOWAR-GRAIN-ALIAS-20261013-R5-S02`. Both were absent from the live ledger and proposal/batch archive at this snapshot.

## Recommendation and exact proposed fields

India's final 2024 Millets Grading and Marking Rules explicitly include whole or dehulled sorghum intended for human consumption and identify the crop as “Sorghum (Jowar),” *Sorghum bicolor* [S01]. A current Ontario retailer lists the exact product title “Jowar Whole (Sorghum)” and describes it as whole sorghum grains [S02]. Together these sources support a narrowly qualified product name for the existing grain identity.

| Field | Proposed disposition |
| --- | --- |
| Existing owner | `ingredient-ref-grain-sorghum` |
| English display | Keep `grain sorghum` |
| Québec French display | Keep `sorgho à graine` |
| English aliases | Add only `jowar whole` |
| French aliases | Keep `sorgho en grains` and `sorgho en grain`; add none |
| Category | Keep `GRAIN_AND_CEREAL` |
| Default density / unit mappings | Keep `null` / `[]` |
| New identity, form, or legacy candidate | None |
| Recipe links or edits | None |
| Form conversion, measure, density, yield, or substitution | None |

Do not store bare `jowar`. The picker will nevertheless return the grain row for a bare `jowar` query after adding `jowar whole`, because it matches complete query words within longer names. That expands today's two-result menu to three distinct, plainly labeled products: grain sorghum, sorghum flour, and sorghum semolina. The exact query `jowar whole` returns only grain sorghum; `jowar flour` and `jowar rava` continue to select their existing flour and semolina identities. With these result labels, the three-result menu is a clear product choice rather than an unqualified single result.

## Source scope and identity boundary

The official Indian rules are primary, regional food-grain evidence: Rule 1(3) applies to whole or dehulled millets for direct human consumption and names “Sorghum (Jowar),” *Sorghum bicolor*. The Swadesh listing supplies the exact Latin-script Canadian retail wording and describes whole sorghum grains. It was indexed as in stock on 2026-10-13 and lists Ontario locations in Stoney Creek, Hamilton, and Burlington. Its page title's `Per lb` wording is retail sale/pricing context, not a household measure.

The proposed alias is for intact sorghum grain at the existing generic grain identity. It does not transfer a whole/dehulled form distinction from the regulation into RecipeBook's form model. Do not add `jowar grain`, `jowar grains`, `whole jowar`, color-qualified Jowar, or regional spellings such as `jowari`, `jwari`, or `juar` from this evidence packet. Keep flour and semolina separate: the 2026-10-12 WP02 A6 review added only `jowar flour` to `ingredient-ref-sorghum-flour`, and the 2026-10-13 Section F semolina review added `jowar rava` to `ingredient-ref-sorghum-semolina`.

No French Jowar product name is supported. Retain the OQLF-backed Québec display `sorgho à graine` and the already accepted French search aliases. Do not transliterate `jowar` into a French alias or replace the display. The concurrent WP02 A6 round-five review of `mandua` / `mandua flour` concerns finger millet (*Eleusine coracana*); this sorghum grain alias has separate identity, terms, and source IDs.

## Prior-review and archive audit

The active Section F checklist and cereal archive were re-read before selecting this phrase. The current plan and [plant/grains/cereals checklist](../batches/plant-grains-cereals.md) say regional names such as jowar require cuisine/source scope. This packet supplies that scope for one exact whole-grain listing; it does not settle all regional sorghum terminology.

| Prior record | Existing decision | Why this review is separate |
| --- | --- | --- |
| [Round four chuda review](wp03-section-f-next-cereal-gap-review-20261013-round4.md) and [integration](../batches/wp03-section-f-chuda-alias-integration-20261013/README.md) | Added `chuda` to flattened rice (poha). | Different grain and regional term; no sorghum ownership change. |
| [Round three chira review](wp03-section-f-next-cereal-gap-review-20261013-round3.md) | Added `chira` to flattened rice (poha). | Different grain and regional term. |
| [WP02 jowar flour review](wp02-a6-jowar-sorghum-flour-terminology-review-20261012.md) | Added only `jowar flour` to the sorghum-flour reference; bare `jowar` and grain aliases were outside that flour decision. | This proposal is specifically the whole-grain phrase and leaves the flour alias intact. |
| [Sorghum semolina review](wp03-section-f-sorghum-semolina-jowar-rava-identity-review-20261013.md) | Added `jowar rava` and `sorghum rava` to sorghum semolina. | Semolina remains its own milled product and exact owner. |
| [Sorghum French-alias boundary review](wp03-section-f-sorgho-en-grains-french-alias-boundary-review-20261012.md) | Added two French sorghum-grain aliases; noted then that the available jowar review was flour-only and did not support a grain alias. | This new evidence directly covers whole human-food grain and the exact retail wording `Jowar Whole`; it does not reopen the earlier French or milo decisions. |
| Concurrent WP02 A6 round-five scope | `mandua` / `mandua flour` for finger millet. | Separate species, exact name family, and reference owner. |

The exact phrase `jowar whole` was not found as an existing active name/alias, form label/match term, legacy candidate, or prior focused proposal/batch decision. The earlier flour and semolina phrases remain owned by their respective references.

## Exact ownership and picker projection

The live audit covered 1,338 active references, all 98 forms, all 64 legacy candidates, and the research ledger. Exact-key normalization follows the Kotlin search code: lowercase with compatibility/accent folding, punctuation-to-space, and whitespace collapse. The search index first returns complete normalized word-phrase matches and uses substring fallback only when there are no phrase matches.

| Query or phrase | Current exact owner / picker result | With only `jowar whole` added |
| --- | --- | --- |
| `jowar whole` | No exact owner; no picker result. | `ingredient-ref-grain-sorghum` only. |
| `jowar` | No exact owner; picker returns `ingredient-ref-sorghum-flour` (via `jowar flour`) and `ingredient-ref-sorghum-semolina` (via `jowar rava`). | Those two plus `ingredient-ref-grain-sorghum` through the `jowar whole` word phrase. No bare alias is stored. |
| `jowar flour` | `ingredient-ref-sorghum-flour` only. | Same exact result. |
| `jowar rava` | `ingredient-ref-sorghum-semolina` only. | Same exact result. |
| `whole jowar`; `jowar grain(s)`; `jowari`; `jwari`; `juar` | No exact owner; no result. | No result; none is proposed. |
| `grain sorghum`; `sorgho à graine`; `sorgho en grain(s)` | `ingredient-ref-grain-sorghum` only. | Same result. |
| `sorghum` | Grain sorghum, sorghum flour, sorghum semolina, sorghum grits, and puffed sorghum. | Same five references. |

The displayed labels for the three `jowar` results are respectively `grain sorghum / sorgho à graine`, `sorghum flour / farine de sorgho`, and `sorghum semolina / semoule de sorgho`. This review accepts that explicit three-product menu; the qualified two-word query is uniquely grain. There are no ingredient forms attached to grain sorghum, flour, or semolina, so these projections are reference results rather than form choices. This is a static projection of current code/data, not a live app picker test.

## Recipe demand scan

The scan covered all manifest-listed recipe JSON, every ingredient row, and existing `ingredientRefId` links. It searched normalized complete recipe text and row content for `jowar`, `jowari`, `jwari`, `juar`, `jowar whole`, `whole jowar`, `jowar grain(s)`, `jowar flour`, `jowar atta`, `jowar rava`, grain/sorghum names, the existing sorghum product terms, and the current French display/aliases.

| Corpus measure | Result |
| --- | ---: |
| Recipe files | 114 |
| Ingredient rows | 1,123 |
| Serialized recipe bytes | 753,792 |
| Files / ingredient rows containing any searched phrase | 0 / 0 |
| Direct links to `ingredient-ref-grain-sorghum` | 0 |

The phrase scan supports no recipe link, recipe-line conversion, or recipe-specific form.

## Measurement, forms, and substitution limits

The grain-sorghum row currently has `defaultDensity: null`, `unitMappings: []`, and no forms or package yield. Its ledger has three existing Health Canada CNF 2015 food-code 4432 observations: 100 mL = 81.2 g, 250 mL = 202.9 g, and one serving = 20.0 g. They remain source-specific because CNF does not specify whole versus decorticated grain, raw versus cooked state, or a physical filling/packing method. Keep these existing observations unchanged and do not apply them to the Swadesh product or derive an active density. The retail `Per lb` label is not a measure; the Gazette's grading/moisture criteria are not culinary quantities.

Neither new source provides a household measure, cooking yield, conversion, or substitution ratio. The grain record's `substitutionResearchState` is `not_yet_researched`; retain that state rather than treating the identity sources as substitution research. Add no grain-to-flour, grain-to-semolina, or grain-to-other-cereal substitution. These are separate product identities; no substitution rule or conversion is proposed.

## Source register and uniqueness audit

The two new source IDs and exact URLs below had zero exact occurrences in the live ledger and proposal/batch archive at audit time. The existing OQLF source ID `WP03-S22` is reused for the unchanged French display and is not duplicated.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| Existing `WP03-S22` | Office québécois de la langue française, [GDT: sorgho à graine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19001698/sorgho-a-graine). | Already on the grain-sorghum ledger record; directly pairs `grain sorghum` with the Québec French display `sorgho à graine`. No new source entry is needed for that unchanged pair. |
| `WP03-JOWAR-GRAIN-ALIAS-20261013-R5-S01` | Government of India, Ministry of Agriculture and Farmers Welfare, [Millets Grading and Marking Rules, 2024](https://egazette.gov.in/WriteReadData/2024/256218.pdf), final Gazette notification dated 2024-08-05, Rule 1(3), PDF p. 18 (English text). | Primary regional food-grain source. Applies to whole or dehulled millets intended for human consumption and lists Sorghum (Jowar), *Sorghum bicolor*. Supports the regional grain identity and scope, not a household measure, recipe form, or conversion. |
| `WP03-JOWAR-GRAIN-ALIAS-20261013-R5-S02` | Swadesh Supermarket, [Jowar Whole (Sorghum) Per lb](https://www.swadesh.ca/products/jowar-whole-sorghum-per-lb), product title, in-stock listing, description, and Ontario store addresses. | Current Canadian retailer page, indexed in stock on 2026-10-13, explicitly describes whole sorghum grains. Supports the exact qualified English alias. `Per lb` is sale/pricing wording; no household measure or net package mass is claimed. |

The archive already contains `WP02-A6-JOWAR-FLOUR-20261012-S01` through `S04` for the separate flour decision and the Section F sorghum semolina source IDs for `jowar rava`; none is reused for this alias. The concurrent `mandua` review does not share these source IDs. The proposed S01/S02 IDs are unique to this review.

## Baseline snapshot

Read-only snapshot on 2026-10-13. File hashes cover exact bytes. The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, its exact recipe bytes, and a trailing NUL byte.

| Artifact | Count / bytes | SHA-256 or fingerprint |
| --- | ---: | --- |
| Ingredient references | 1,338 (147 `GRAIN_AND_CEREAL`) / 428,802 bytes | `4c5ebe5497543acde7d6d6aca9e50bea928cee477c538ce795910589e90239e3` |
| Ingredient forms | 98 / 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy candidates | 64 / 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,646 records; 6,248 source entries; 5,251 distinct source IDs / 6,217,304 bytes | `ae3605b31fb48d69b6e41242fa7a8ee08b2f7c56e22f86a129fa3f6fd564026d` |
| Seed manifest | 114 recipe paths / 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Package yields | 1 row / 853 bytes; no grain-sorghum entry | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Global / contextual substitution rules | 0 / 0 entries; 3 bytes each | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` (each) |
| Generated ingredient catalog | `BundledIngredientCatalog.kt`, 586,698 bytes | `f7fab835ba4b02f301c4ad966b52c78553bab66ba7801528a290f4988131fbd9` |

At this snapshot the target reference is `ingredient-ref-grain-sorghum`, `grain sorghum / sorgho à graine`, with only the two existing French aliases; its ledger states are `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. The proposed integration changes only `aliasesEn` by adding `jowar whole` and appends the two new source records plus an accepted alias decision to that existing ledger record. It does not alter observations, states, references, forms, recipe data, yields, or substitutions.

## Static review disposition

**Recommendation: integrate only the qualified English alias `jowar whole` on `ingredient-ref-grain-sorghum`.** Preserve the existing Québec French display and all numeric/substitution boundaries. The three-result bare `jowar` search is an intentional, labeled choice among whole grain, flour, and semolina; the exact qualified whole-grain query remains unique. This proposal changes no shared data. No app, unit, instrumentation, emulator, or application tests were run.

## Integration record

Integrated on 2026-10-13. Added jowar whole as the only new English alias on ingredient-ref-grain-sorghum. Added two source records and an accepted alias decision to its existing ledger record. The exact qualified query returns grain sorghum; bare jowar offers grain, flour, and semolina; jowar flour and jowar rava retain their existing owners. No French alias, form, numeric behavior, recipe link, or substitution was added.

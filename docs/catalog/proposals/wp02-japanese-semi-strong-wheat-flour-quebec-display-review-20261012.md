# WP02 Section A Japanese semi-strong wheat flour: Québec naming hold

- **Review date:** 2026-10-12
- **Status:** Proposal only. This review made no catalog, form, legacy, ledger, recipe, plan, roadmap, or code edits.
- **Scope:** Japanese semi-strong wheat flour, 準強力粉 (*jun-kyōrikiko*), as one distinct practical Japanese flour class. This review excludes the already reviewed Japanese medium- and strong-flour holds.
- **Proposal-local source prefix:** WP02-JAPANESE-SEMI-STRONG-WHEAT-20261012-S01 through S07. The prefix, candidate identity, and filename were absent before this review.

## Recommendation

**Hold 準強力粉 (*jun-kyōrikiko*) outside the active catalog until a Québec French name or a Canadian bilingual primary label establishes how this Japanese class should be represented.** Japanese sources establish a practical class and current mill product labels, but I found no authoritative Québec term or Canadian French label for this class. “Japanese semi-strong wheat flour (jun-kyōrikiko)” is an English research gloss only, not an active display proposal.

Do not merge it into Japanese strong flour, Japanese medium-strength flour, high-gluten flour, bread flour, or all-purpose flour. Do not create a generic semi-strong-flour identity. Revisit it when a Québec or Canadian manufacturer/importer label or authoritative terminology source qualifies the Japanese class and resolves whether it merits an independent row or a supported alias on an existing row.

MAFF’s current flour overview places 準強力粉 between 強力粉 and 中力粉 by relative gluten strength and says it is used for Chinese noodles. The Japan Flour Milling Promotion Foundation likewise describes it as a practical milling-company class, while stating that Japan has no public flour definitions or standards. Asahi Flour Mills currently lists a separate 準強力粉 product category, which confirms a real Japanese product boundary. These sources do not establish equivalence to a Canadian flour grade or a class-wide protein threshold. [S01–S03]

The French evidence does not establish a suitable display. OQLF’s preferred Québec term *farine de blé de force* means flour from strong wheat that is rich in gluten and is already an alias of the active high-gluten-flour row. Federal TERMIUM Plus records generic *farine forte*, without a Japanese qualification. The Canadian Grain Commission uses wording such as “force moyenne” to describe functional properties of specific Canadian grain classes; that is not a flour term or Japanese-grade crosswalk. Searches for Québec/Canadian *farine semi-forte* or a Japanese-qualified label did not find a primary label or authoritative term. Do not invent a French construction from these neighboring expressions. [S05–S07]

## Identity boundary

| Neighbor | Disposition |
|---|---|
| Japanese strong wheat flour, 強力粉 (*kyōrikiko*) | Keep distinct. MAFF says it has stronger gluten than the semi-strong class and is used for bread and gyoza wrappers. Its separate Québec display hold does not establish the semi-strong name. |
| Japanese medium-strength flour, 中力粉 (*chūrikiko*) | Keep distinct. MAFF describes it as the intermediate-strength class used for udon and other Japanese noodles. Its existing Québec naming hold is separate. |
| Japanese weak wheat flour, 薄力粉 (*hakurikiko*) | Keep the active Japanese weak-flour row distinct. The four practical classes are not aliases for one another. |
| High-gluten flour | Keep the active **ingredient-ref-high-gluten-flour** row. Its French alias *farine de blé de force* is not a Japanese semi-strong term. |
| Bread flour | Keep **ingredient-ref-bread-flour** distinct. Product use for noodles, gyoza, or bread does not establish a class crosswalk. |
| All-purpose flour | Keep **ingredient-ref-all-purpose-flour** distinct. Canadian and Japanese flour classification systems differ; the source use for Chinese noodles does not make this class an all-purpose equivalent. |
| Product name 麺用ストロング | Do not use “strong” as an alias. Asahi lists this product under its 準強力粉 category; the product name is a SKU name, not an alias for Japanese 強力粉 or Canadian high-gluten flour. |

## Names, aliases, and picker behavior

No active name or alias is proposed. If the identity is revisited, use the national qualifier and retain the Japanese class name in the English research display so it is not confused with generic bread or high-gluten flour. Leave the French display unresolved until a suitable source is available.

The current IngredientSearch.kt normalization lowercases text, decomposes accents, and replaces every character outside ASCII letters and digits with spaces. A CJK-only query 準強力粉 normalizes to an empty key; the picker then returns the full catalog. Romanized *jun-kyōrikiko* normalizes to *jun kyorikiko*, which could be searchable if a reviewed row were later added. Do not add native-script aliases until picker support can return a meaningful match.

The live phrase-first audit found no results for “Japanese semi-strong wheat flour,” *jun-kyōrikiko* / *jun-kyorikiko*, or the French search candidates *farine semi-forte japonaise*, *farine de blé japonaise semi-forte*, and *farine de force moyenne japonaise*. Existing distinct queries return their current owners: *farine de blé de force* returns high-gluten flour; *farine à pain* and “bread flour” return bread flour; *farine tout usage* and “all-purpose flour” return all-purpose flour. Keep those terms on their existing rows.

## Ownership audit

The live references, forms, legacy-import identities, and ledger were checked for the candidate ID and exact normalized candidate phrases. Normalization follows the current picker’s lowercase, NFKD accent-folding, and punctuation behavior.

| Surface | Finding |
|---|---|
| Active references | No exact owner for the candidate ID, “Japanese semi-strong wheat flour,” “semi-strong wheat flour,” *jun-kyōrikiko* / *jun-kyorikiko*, 準強力粉, or the proposed French search candidates. The active Japanese weak flour is distinct. The current French strong/high-gluten and bread-flour terms have separate owners. |
| Forms | No exact candidate ID, class label, romanization, or French candidate is owned by an active form. No preparation form is proposed. |
| Legacy-import identities | No legacy candidate owns the proposed ID or exact class terms. |
| Research ledger | No Japanese semi-strong flour record or candidate ID exists. The Japanese weak-flour record’s MAFF citation is scoped to the weak class; the high-gluten and bread-flour records have separate sources and states. Do not widen those records or add ledger values for this hold. |
| Proposal archive | The regional-flour proposal names Japanese strong and semi-strong flour as distinct from 中力粉 but adds neither. The Japanese medium and strong Québec reviews mention 準強力粉 only as a neighboring class and leave it outside their scope. No dedicated Japanese semi-strong naming review or owner for this proposal prefix was found. |

## Recipe demand

All 114 manifest-listed bundled recipe files and all 1,123 ingredient lines were scanned for the candidate ID, class name, romanizations, Japanese text, and French candidates. There were no matching recipe files and no ingredient links for this class. Do not link or relink a recipe based on product use descriptions.

## Data disposition

| Property | Disposition |
|---|---|
| Active ID and display | None. **ingredient-ref-japanese-semi-strong-wheat-flour** is a research candidate only; if reconsidered, keep the Japanese qualifier visible. |
| English / French aliases | None. The English wording is a research gloss only; French display unresolved. Do not add “bread flour,” “high-gluten flour,” *farine forte*, *farine de blé de force*, *farine à pain*, or *farine semi-forte*. |
| Density and unit mappings | No supported density or volume mapping. If later integrated, leave defaultDensity absent/null and unitMappings empty unless new evidence supports a value. |
| Measurements | No class-wide cup, mass-per-volume, or package-yield value. Asahi’s crude-protein and ash observations and 25 kg packages are tied to individual commercial products; they are not kitchen measurements or reusable catalog defaults. [S03] |
| Forms | None. 準強力粉 names a flour class, not a preparation state. |
| Conversions | None. No supported volume-to-mass mapping or cross-country flour-grade conversion. |
| Substitutions | None. Chinese-noodle and gyoza uses are not substitution tests or ratios. Do not infer substitutions to bread flour, high-gluten flour, or all-purpose flour. |
| Recipe links | None. The bundled recipe corpus has no matching class wording or reference ID. |

## Numeric evidence limits

Asahi’s current manufacturer page lists four products under its 準強力粉（小麦粉） category. The product-specific crude-protein reference values are 12.0%, 11.5%, 11.8%, and 12.5%; each is paired with its own ash value, use, and 25 kg package. The page explicitly calls ash and protein values reference values. Do not promote these SKU observations to a category-wide property.

A 2007 MAFF reference table lists a 10.5%–12.5% protein range for 準強力粉. Treat this as a dated table, not as a current legal standard: the current MAFF overview gives class ordering and use but no numerical cutoff, and the flour-milling association says Japan has no public flour definitions or standards. The overlapping, source-specific figures do not justify a catalog threshold, density, cup weight, conversion, or substitution. [S01–S04]

## Live-package snapshot

Read-only snapshot refreshed immediately before finalization on 2026-10-12; the counts and hashes still match the pre-write audit. Hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-listed relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Surface | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,269 | `adb6080896bea039e290a96f8a739978edaa6c6be735efdb128abf10723056ce` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy-import candidates | 65 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research ledger | 1,577 records; 5,566 source entries; 4,602 distinct source IDs; 8 unit conversions | `d782590ca04ee42c40e3cd7896b8d75d6d3187b73b61f173997accb602d6634a` |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient lines | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` (digest of each listed relative path + NUL + exact file bytes + NUL) |

## Sources

Sources were accessed or rechecked on 2026-10-12.

| ID | Source | Supports | Limit |
|---|---|---|---|
| S01 | [Japan Ministry of Agriculture, Forestry and Fisheries, “小麦粉の種類について教えてください”](https://www.maff.go.jp/j/heya/sodan/1106/02.html) | Current overview distinguishes the four practical classes and describes 準強力粉 as next in gluten strength after 強力粉, used for Chinese noodles. The page says it was updated in 2023. | Does not set a legal or class-wide protein threshold or a Canadian grade equivalence. |
| S02 | [Japan Flour Milling Promotion Foundation, “小麦粉の加工と製品”](https://www.seifun.or.jp/pages/79/) | States that Japan has no public flour definitions or standards; describes miller classes and common uses. | Industry explanation; not a Canadian or Québec term source. |
| S03 | [Asahi Flour Mills, “準強力粉（小麦粉）”](https://www.konaya.biz/products/5507) | Current mill product category and individual products; lists noodle/gyoza uses, product-specific ash/protein reference values, and 25 kg commercial packages. | Values and packaging belong to named commercial products, not a class-wide specification or kitchen measure. |
| S04 | [MAFF, 2007 flour class and protein reference table](https://www.maff.go.jp/j/council/seisaku/shokuryo/0711/pdf/ref_data3.pdf) | Historical reference table identifies 準強力粉 uses and gives a 10.5%–12.5% protein range. | Dated 2007 document; not a current statutory standard. Do not store the range as a catalog default. |
| S05 | [Canadian Grain Commission, “Classes de blé canadien”](https://www.grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html) | Describes Canadian wheat classes by regional class and functional properties, including French wording for medium dough/gluten strength. | Grain-class terminology, not a Japanese flour-class name or crosswalk. |
| S06 | [OQLF, “farine de blé de force” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force) | Preferred Québec term for flour from strong wheat, rich in gluten, used mainly for bread. | Does not name 準強力粉; the active catalog already owns this phrase on high-gluten flour. |
| S07 | [Translation Bureau, TERMIUM Plus, “strong flour / farine forte”](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=1&index=frt&lang=eng&srchtxt=FARINE+FORTE) | Records a generic English/French term pair for strong flour. | No Japanese qualification or semi-strong Québec label. |

No unsupported class-wide values, French display, aliases, forms, conversions, substitutions, or recipe links are proposed. This is a proposal-only naming hold; no tests or implementation changes were needed.

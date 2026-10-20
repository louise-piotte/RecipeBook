# WP03 Section F — Old-fashioned rolled oats phrase review (2026-10-13, round 7)

## Review record

- **Status:** Reviewer proposal completed; root integrated the approved `old-fashioned rolled oats` English alias and source-scoped AgroFusion portion observation. `large flake oats` remains held.
- **Scope:** Resolve the unowned exact picker phrase `old-fashioned rolled oats`, used by a bundled recipe and directly equated with `large flake oats` by current Canadian oat-product sources. Keep the exact source phrase `large flake oats` held from active aliases because of its effect on the broad `flake` query.
- **Open Section F context:** This is a narrow processed-oat naming decision under the still-open Section F regional cereal and preprocessed-grain review. It does not reopen oat species, wheat, rice, sorghum, poha, or cereal-mix identities.
- **Recommendation:** Add only `old-fashioned rolled oats` to `ingredient-ref-rolled-oats.aliasesEn`. Keep `large flake oats` source-attested but inactive until the picker can preserve multiword qualification in broad searches. Add no new reference or form.

## Exact proposed fields

| Field | Proposed disposition |
|---|---|
| Existing owner | `ingredient-ref-rolled-oats` |
| English display | Keep `rolled oats` |
| Québec French display | Keep `flocons d'avoine` |
| English aliases | Add only `old-fashioned rolled oats`; keep existing `old-fashioned oats` |
| French aliases | Keep existing `gros flocons d'avoine`; add none |
| `large flake oats` | Record as a source-attested synonym for this product class, but do not activate it as an alias |
| Category | Keep `GRAIN_AND_CEREAL` |
| New identity, form, or recipe link | None |
| Active density and unit mappings | Keep `defaultDensity: null` and `unitMappings: []` |
| Measurement research | Retain one Québec product listing as a source-scoped published-portion observation only; leave general measurement state `blocked_pending_evidence` |
| Substitutions | Add no finding or rule; retain `substitutionResearchState: not_yet_researched` |

The exact new English phrase closes a search gap without storing the broader word `flake` as a standalone search result. It also matches recipe 001's existing ingredient text. Do not add a French construction for `large flake oats`, `flocons d'avoine roulés`, `gruau gros flocons d'avoine`, or `gruau d'avoine`.

## Identity and Québec French boundary

Robin Hood's current Canadian product page calls its Large Flake Oats “old-fashioned rolled oats”; its French-language manufacturer page names the corresponding product `Gros flocons d'avoine` [S01–S02]. Arva Flour Mills' current instructions explicitly pair `Large Flake Oats` with `Old Fashioned Rolled Oats`. Its French product page describes large flakes as rolled or old-fashioned oat flakes [S03–S04]. This supports the proposed English phrase on the existing rolled-oat identity. It does not establish every brand's thickness, cooking performance, or cup mass as identical.

The live reference already owns the Québec French alias `gros flocons d'avoine`. Reuse the existing OQLF source `WP03-S1` for preferred `flocon d'avoine`, English `rolled oat`, and the warning against `avoine roulée`. OQLF's existing `WP03-S27` defines Québec `gruau` as cooked oatmeal; keep the product-page wording that contains `gruau` out of aliases. The French display and alias lists otherwise stay unchanged.

Keep the product and process boundaries explicit:

- Quick oats and instant oats remain separate active references; do not import a manufacturer's one-page `Quick Cooking Oats (Instant Oatmeal)` heading as a catalog equivalence.
- Steel-cut oats, oat groats, Scottish oatmeal, sprouted rolled oats, oat bran, oat flour, and multi-grain breakfast cereal remain distinct.
- `large flake oats` describes a commercially named rolled-oat style in the sources. This review does not add a thickness form, standardize a flake-size cutoff, or imply a recipe interchangeability rule.

## Current ownership and prior-review audit

The normalized-name audit covered the 1,339 active references, all 98 ingredient forms and match terms, 64 legacy import candidates, the research ledger, the active Section F checklist, and the proposal/batch archive.

| Surface | Current result |
|---|---|
| `ingredient-ref-rolled-oats` | `rolled oats / flocons d'avoine`; English alias `old-fashioned oats`; French alias `gros flocons d'avoine`; category `GRAIN_AND_CEREAL`; null density and no unit mappings. |
| Exact `old-fashioned rolled oats` | No exact active display, alias, form, or legacy-candidate owner. The recipe phrase is already linked to `ingredient-ref-rolled-oats`. |
| Exact `large flake oats` | No exact active display, alias, form, or legacy-candidate owner. It occurs in prior Red River 7-grain component evidence as one ingredient in a composite product, not as an owner or focused alias decision. Reuse the existing `WP03-REDRIVER-20261012-S07` evidence if needed; do not create a duplicate source entry for that URL. |
| Forms | No form is attached to rolled oats; no form label or match term owns either candidate phrase. |
| Other oat references | Quick oats, instant oats, Scottish oatmeal, sprouted rolled oats, and steel-cut oats remain separate exact identities. |
| Existing rolled-oats ledger record | `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`; it has no sources or measurement/substitution findings. The record's only decision documents removal of source-less density and mapping values. |
| Prior focused reviews | No focused alias review for `old-fashioned rolled oats` or `large flake oats` was found. The exact source wording appears incidentally in recipe 001 and in the Red River 7-grain and sprouted-oat review materials; those records do not allocate it as an active alias. |

## Picker projection

This static projection follows the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizer and phrase-first matcher against the live references and forms. It is not emulator or runtime picker QA.

| Query | Current result | With the proposed alias | Form behavior / decision |
|---|---|---|---|
| `old-fashioned rolled oats` | No result | `ingredient-ref-rolled-oats` — `rolled oats / flocons d'avoine` | One exact result; no form hint. |
| `old fashioned rolled oats` | No result | `ingredient-ref-rolled-oats` | Punctuation normalizes identically; no second alias is needed. |
| `large flake oats` / `large-flake oats` | No result | No result; the phrase remains held | Adding this alias would break the broad `flake` query below. |
| `old-fashioned oats` | `ingredient-ref-rolled-oats` | Same | Existing alias. |
| `gros flocons d'avoine` | `ingredient-ref-rolled-oats` | Same | Existing Québec French alias. |
| `rolled oats` | `ingredient-ref-rolled-oats` and `ingredient-ref-sprouted-rolled-oats` | Same two results | Both labels retain their product qualifiers. |
| `quick oats` / `flocons d'avoine à cuisson rapide` | `ingredient-ref-quick-oats` | Same one reference | Quick oats stay separate. |
| `oats` | Six references: instant, quick, rolled, Scottish oatmeal, sprouted rolled, and steel-cut | Same six references | No broad oat-family change. |
| `flake` | 24 references through the current substring fallback | Same 24 references | Safe only when `large flake oats` is not activated. If that alias were added, `flake` would become a complete word-phrase match in the new term and the matcher would return only `ingredient-ref-rolled-oats`, suppressing the current 24-result list. |
| `flakes` | 23 references | Same 23 references | Unchanged; the proposed alias is not activated. |
| `dry old-fashioned rolled oats`, `cooked old-fashioned rolled oats` | No result | No result | No dry/cooked form exists on rolled oats; the alias does not invent one. |

The exact query fix is therefore narrow: add the complete, source-attested recipe phrase. Keep `large flake oats` held because its `flake` token would turn a broad multi-product query into a misleading singleton result.

## Recipe-corpus demand

The read-only scan parsed every recipe path in the current bundled manifest and checked the complete serialized recipe plus every ingredient row. It covered **114 recipe files and 1,123 ingredient rows**.

- The exact phrase `old-fashioned rolled oats` appears in one file and one ingredient row: recipe **001#1**, `1/2 cup old-fashioned rolled oats`, already linked to `ingredient-ref-rolled-oats`.
- The exact `large flake oats`, `large-flake oats`, `large flake`, and French `gros flocons d'avoine` candidate phrases have **0 recipe-file hits and 0 ingredient-row hits**.
- The broader `rolled oats` phrase appears in two files and two rows: recipe 001#1 and recipe **065#1**, `1 part rolled oats`; both are already linked to `ingredient-ref-rolled-oats`.
- No recipe text, quantity, link, or form link needs to change.

## Measurement, forms, and substitutions

The alias decision does not authorize a reusable volume-to-mass measure or a change to the active catalog's numeric fields.

| Evidence | Source-scoped interpretation | Proposed handling |
|---|---|---|
| The Québec Food Directory lists AgroFusion `Gros flocons d'avoine`, 100% oats, with a published portion of 54 g per 1/2 cup for its 5 kg product [S05]. | A product-specific serving declaration. The page does not state a packing method or define a transferable cup-mass convention. | Preserve as one `portion_weight` / `published_portion` observation on `ingredient-ref-rolled-oats`, using source quantity 0.5 cup and observed mass 54 g. Keep `measurementState: blocked_pending_evidence`, `defaultDensity: null`, and `unitMappings: []`. Do not activate a cup mapping or density. |
| Robin Hood gives 1/3 cup (75 mL) for one serving in its product cooking directions [S01–S02]. | Brand-specific preparation quantity; no corresponding mass is supplied. | Keep as source text only; add no observation or measure. |
| Arva gives 1/2 cup with 1 cup water and a 10–20 minute cooking range for its large-flake oats [S03]. | Product-specific recipe direction with no dry mass or resulting cooked mass/volume. | Add no density, conversion, active measure, or general dry-to-cooked yield. |

No reviewed source describes large-flake oats as a general substitute for quick oats, instant oats, steel-cut oats, or another grain. Cooking and baking suggestions are not a scoped replacement rule. Keep `substitutionResearchState: not_yet_researched`; add no substitution finding ID, global form conversion, contextual rule, or recipe-line substitution link.

No form is proposed. `large flake` is a product-name qualifier here, and the reviewed sources do not establish a reusable flake-size form boundary for the catalog.

## Source register and ID-collision audit

The new source IDs below were checked against the live research ledger and archived proposals/batches. The exact URLs are absent from existing ledger sources. Reuse existing `WP03-S1` (OQLF `flocon d'avoine`), `WP03-S27` (OQLF `gruau`), and `WP03-REDRIVER-20261012-S07` (Arva's Red River 7-grain component list); do not duplicate those source records.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-LFOATS-R7-20261013-S01` | Robin Hood, [Large Flake Oats](https://www.robinhood.ca/en/products/oats/large-flake), product description and cooking instructions; checked 2026-10-13. | Current Canadian manufacturer page identifies its large flakes as old-fashioned rolled oats and gives product-specific volume directions. It does not establish a mass-per-volume value or general cooking yield. |
| `WP03-LFOATS-R7-20261013-S02` | Robin Hood, [Gros flocons d'avoine](https://www.robinhood.ca/fr/produits/gruaux/gros-flocons-d-avoine), French product name and directions; checked 2026-10-13. | Current manufacturer French page supports the existing Québec alias and source-specific preparation. Its use of `gruau` in product copy does not override OQLF's cooked-food definition or justify a new catalog alias. |
| `WP03-LFOATS-R7-20261013-S03` | Arva Flour Mills, [Hot Cereal Cooking Instructions](https://arvaflourmills.com/blogs/recipes/arva-flour-mills-hot-cereal-cooking-instructions), large-flake-oats section; checked 2026-10-13. | Directly pairs `Large Flake Oats` with `Old Fashioned Rolled Oats`, supporting the proposed English alias. Its 1/2-cup and water instructions are Arva-specific; its separate quick-oat heading is not adopted as a global quick/instant equivalence. |
| `WP03-LFOATS-R7-20261013-S04` | Arva Flour Mills, [Gros flocons d'avoine](https://arvaflourmills.com/fr/products/large-flake-oats-1), French product title and description; checked 2026-10-13. | Current Ontario mill page describes large flakes as rolled or old-fashioned oat flakes. It is market usage, not an OQLF ruling on the entire compound. |
| `WP03-LFOATS-R7-20261013-S05` | Gouvernement du Québec, [Répertoire des aliments québécois: Gros flocons d'avoine](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8208540), AgroFusion product record; checked 2026-10-13, record updated 2024-03-18. | The indexed official directory entry reports a 5 kg, 100%-oat product and 54 g per 1/2-cup portion. The directory republishes one producer's product data; its portion is not a universal measure. Direct browser extraction returned a dynamic-page shell, so the entry fields were checked in the current indexed result. |
| Existing `WP03-S1` | OQLF, [flocon d'avoine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497597/flocon-davoine), definition and preferred term. | Supports the existing French display and the English `rolled oat` name; discourages `avoine roulée`. Reuse the current ledger source ID. |
| Existing `WP03-S27` | OQLF, [gruau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), preferred Québec food term. | Supports keeping unqualified `gruau` wording out of the dry-oat alias list. Reuse the current ledger source ID. |
| Existing `WP03-REDRIVER-20261012-S07` | Arva Flour Mills, [Red River 7 Grain Hot Cereal](https://arvaflourmills.com/products/red-river-7-grain-hot-cereal), ingredient list. | Lists large-flake oats as one ingredient in the separate seven-grain cereal. It is not an exact catalog owner or a single-ingredient product specification. Reuse the existing source entry only if that boundary is needed. |

All five new source IDs were absent from **5,275 distinct source IDs** in the ledger and **5,565 distinct source-ID tokens** in the proposal/batch archive at this snapshot. The proposed observation ID `rolled-oats-agrofusion-54g-half-cup-20261013` was absent from all 339 existing measurement observations and the searched archive. No substitution-finding ID is allocated.

## Review-time baseline snapshot

The recipe fingerprint hashes each manifest-relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte in manifest order.

| Artifact | Review-time coverage | SHA-256 / corpus fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,339 references; 429,172 bytes | `5779b779d58d428fbabd4c073ee4a303bdb5809af857300be35668c353c2df15` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,648 records; 6,280 source entries; 5,275 distinct source IDs; 339 measurement observations; 190 substitution findings | `e53281fb3b3e9338bd46d8bee02e4e685f21eb21c3282deb66e9f04ab8247c01` |

## Disposition

**Recommend integrating only `old-fashioned rolled oats` as an English alias on `ingredient-ref-rolled-oats`.** Record the evidence and the held `large flake oats` boundary on that existing ledger record. Preserve one AgroFusion 54 g per 1/2-cup published-portion observation as source-specific ledger evidence; keep active density/mapping values empty and measurement research blocked. Add no new identity, French alias, form, recipe link, yield, conversion, or substitution. This proposal-only review ran no app, unit, instrumentation, emulator, or application tests.


## Root integration result (2026-10-13)

Added only `old-fashioned rolled oats` to `ingredient-ref-rolled-oats.aliasesEn`; kept `large flake oats` inactive because it would collapse the broad `flake` query. Recorded the exact phrase evidence and one AgroFusion 54 g per 1/2-cup portion as a source-specific ledger observation. The identity is now verified; `measurementState` remains `blocked_pending_evidence`, active density is null, mappings are empty, and substitution research remains open. No French alias, form, recipe link, or active measure was added. Static data validation passed; no app or emulator tests were run for this JSON-only change. See [the round-seven integration batch](../batches/wp02-wp03-wp04-round7-gap-review-integration-20261013/README.md).

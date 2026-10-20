# WP02 Section 04 A6 R152 — Sweet White Sorghum Flour Alias Review

## Review record

- **Reviewed and sources accessed:** 2026-10-15.
- **Status at proposal handoff:** Proposal only. No catalog, ledger, recipe, plan, roadmap, or generated data was changed.
- **Scope:** The exact Canadian/Québec-facing product wording **sweet white sorghum flour / farine douce de sorgho blanc**.
- **Open checklist item:** [WP02 Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1399) continues review of sorghum and other regional grain flours.
- **Source-ID prefix:** `WP02-A6-SWEET-WHITE-SORGHUM-FLOUR-R152-20261015-S` (S01–S06).

## Recommendation

**Add only `sweet white sorghum flour` as an English alias and `farine douce de sorgho blanc` as a French alias on the existing `ingredient-ref-sorghum-flour` reference.** Keep the display pair `sorghum flour / farine de sorgho`, the `FLOUR_AND_STARCH` category, existing English aliases, null density, empty unit mappings, and no-form state. Do not create a second reference.

Bob’s Red Mill’s Canadian product list pairs the English product name “Sorghum Flour” with French “Farine ‘Douce’ de Sorgho Blanc,” and names whole grain sorghum as the ingredient [S01]. A current Canadian retailer uses the exact English phrase, a Montréal-facing French retailer uses the exact French phrase, and a Canadian bread-maker manual tells shoppers to look for “sweet” white sorghum flour [S02–S05]. Together these support exact bilingual product-search aliases for the existing flour identity. The sources do not establish a separate milling process, cultivar, universal white-sorghum class, or added sweetener.

This review is limited to those exact qualified phrases. Do not add `white sorghum flour`, `sweet sorghum flour`, or bare `sweet`, `white`, or `sorghum` aliases. The shorter phrase `white sorghum flour` will nevertheless match the new longer alias through the picker’s phrase-first search behavior; that is an expected query effect, not a stored alias.

## Product and identity boundary

| Wording or nearby reference | Recommendation | Evidence boundary |
|---|---|---|
| `sweet white sorghum flour` / `farine douce de sorgho blanc` | Add as one exact English and one exact French alias on `ingredient-ref-sorghum-flour`. | Official Canadian product naming directly pairs the existing English display with the French phrase; current Canadian and Montréal-facing listings corroborate the exact market wording [S01–S04]. This is a search-name decision, not a new ingredient or process claim. |
| `sorghum flour` / `farine de sorgho` | Retain as the existing display pair on `ingredient-ref-sorghum-flour`. | Existing Codex and OQLF sources support the generic English/French flour wording [reused WP02-S33 and WP02-A6-JOWAR-FLOUR-20261012-S03]. |
| `white sorghum flour`; `farine de sorgho blanc` | Do not store as aliases. | Current sources support the longer `sweet white` wording. They do not establish these shorter forms as stable equivalents across other sorghum-flour products. Search can still match the English shorter phrase as part of the new alias. |
| Grain sorghum / sorgho à graine | Keep on `ingredient-ref-grain-sorghum`. | Flour and grain remain separate identities; no grain-level alias or recipe link is proposed. |
| Toasted white sorghum flour | Keep held as `candidate-toasted-white-sorghum-flour` in A7. | The R26 CerealVeneta source names a separate industrial semi-finished product and lacks a Québec French name; this review does not reopen it or equate its product with Bob’s [R26 proposal](wp02-a7-toasted-white-sorghum-flour-boundary-review-20261013-round26.md) or [integration record](../batches/wp02-wp03-wp04-round26-gap-review-integration-20261013/README.md). |
| Milo flour; mabele/amabele flour | Leave prior A6 decisions unchanged. | `milo flour` remains a picker-collision hold; mabele/amabele remain unresolved due to product/meal boundaries [R4; R12]. |

The A6 history was checked after the integrated [R151 brown-teff review](wp02-a6-next-regional-flour-gap-review-r151-20261015.md) and its [integration record](../batches/wp02-wp03-wp04-r151-gap-review-integration-20261015/README.md). R149 wild rice flour and R150 ivory teff flour are also already integrated; the general A6 checklist remains open. This proposal does not reopen the excluded brown or ivory teff candidates. Earlier A6 reviews cover the distinct `jowar atta` and `guinea corn flour` aliases [R8; R10].

## Complete proposed reference delta

Append the two aliases to the existing reference. No new ingredient ID or form ID is proposed. The following is the complete projected row; root may update `updatedAt` to its integration timestamp.

```json
{
  "id": "ingredient-ref-sorghum-flour",
  "nameFr": "farine de sorgho",
  "nameEn": "sorghum flour",
  "aliasesFr": ["farine douce de sorgho blanc"],
  "aliasesEn": ["jowar flour", "jowar atta", "guinea corn flour", "sweet white sorghum flour"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Do not add a literal French translation such as `sorgho blanc doux`; use the exact current retail wording. The French alias is source-attested, not presented as an OQLF-preferred term.

## Canadian and Québec source review

| Source ID | Source and locator | What it supports and does not support |
|---|---|---|
| `WP02-A6-SWEET-WHITE-SORGHUM-FLOUR-R152-20261015-S01` — Bob’s Red Mill, [Canadian Product List 2023](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-Product-List-2023) | Sorghum Flour / Farine ‘Douce’ de Sorgho Blanc, ingredient line. Accessed 2026-10-15. | The manufacturer’s Canadian list pairs the existing English generic product name with the qualified French wording and identifies whole grain sorghum as the ingredient. It does not identify a cultivar, milling sequence, or separate standardized flour class. This is manufacturer terminology, not an OQLF ruling. |
| `WP02-A6-SWEET-WHITE-SORGHUM-FLOUR-R152-20261015-S02` — Homegrown Foods Ltd., [Bob’s Red Mill Sweet White Sorghum Flour — 623 g](https://homegrownfoods.ca/products/brm-sorghum-flour-sweet-white) | Canadian storefront product title and package listing; accessed 2026-10-15. | Supports the exact English product wording and a Canadian-market listing. The page showed sold out when checked; no availability claim is made. The 623 g is a package quantity, not a kitchen measure. |
| `WP02-A6-SWEET-WHITE-SORGHUM-FLOUR-R152-20261015-S03` — Epipresto, [Farine, ingrédients et sucre — À Votre Santé](https://epipresto.ca/collections/farine-ingr-dients-et-sucre-a-votre-sante) | Product listing “Farine douce de sorgho blanc - Bob’s Red Mill,” 623 g; accessed 2026-10-15. | Supports the exact French wording in a French-language Montréal-market listing. The package mass is not a recipe amount. The listing does not make this an OQLF-preferred term or define a separate milling process. |
| `WP02-A6-SWEET-WHITE-SORGHUM-FLOUR-R152-20261015-S04` — Epipresto, [À Votre Santé retailer information](https://epipresto.ca/pages/a-votre-sante) | Store description and address identify the partner retailer in Montréal, Québec; accessed 2026-10-15. | Establishes the Québec context for S03 only. It provides no additional flour specification. |
| `WP02-A6-SWEET-WHITE-SORGHUM-FLOUR-R152-20261015-S05` — Cuisinart Canada, [CBK-210C Instruction Booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/en_CA/v1770977065750/Instruction%20Booklet/cbk210c_ib_en.pdf) | PDF p. 16, “Sorghum Flour”; accessed 2026-10-15. | The Canadian bread-maker manual says sorghum flour is a good oat-flour substitute and advises looking for “sweet” white sorghum flour when purchasing. This is qualitative, appliance-manual guidance without a replacement ratio, formula, or adjustment. It supports the target wording, not an active substitution rule. |
| `WP02-A6-SWEET-WHITE-SORGHUM-FLOUR-R152-20261015-S06` — Bob’s Red Mill, [Sorghum Flour](https://www.bobsredmill.com/product/sorghum-flour) | Current manufacturer product page; accessed 2026-10-15. | The page is titled only “Sorghum Flour,” describes whole-grain sorghum, reports a label serving of 1/4 cup (35 g), and suggests 15–20% sorghum flour in flour mixes. It does not expose a product code tying these details to the `Sweet White` wording. Do not add a new candidate-specific measure or treat blend guidance as a replacement ratio. |

Existing source IDs reused without re-registration: **WP02-S33** (Codex, generic `farine de sorgho`) and **WP02-A6-JOWAR-FLOUR-20261012-S03** (OQLF, `sorgho`). They support retaining the current base display only; neither source establishes the compound alias.

## Exact ownership, archive, picker, and recipe-corpus audit

The read-only catalog snapshot contains **1,520 ingredient references, 119 ingredient forms, 61 legacy-import candidates, and 1,865 research-ledger records**. The package manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Finding |
|---|---|
| Active references | `ingredient-ref-sorghum-flour` owns the exact generic display phrases `sorghum flour / farine de sorgho`, with `jowar flour`, `jowar atta`, and `guinea corn flour` as its English aliases. No reference exactly owns `sweet white sorghum flour`, `farine douce de sorgho blanc`, `white sorghum flour`, or `farine de sorgho blanc`. |
| Forms | No active sorghum flour form, label, or form-match term exists. No form is proposed. |
| Legacy import identities | The 61-candidate file has no exact target phrase or proposed new ID. No legacy identity change is proposed. |
| Research ledger | The existing `ingredient-ref-sorghum-flour` record contains the accepted generic, Jowar, Jowar Atta, and Guinea-corn flour decisions, one source-specific Westpoint portion observation, and a blocked substitution finding. No exact target phrase owns a separate record ID, and this proposal adds no new ledger record. The A7 toasted-white, A7 malted, and A7 meal candidates remain distinct existing records. |
| Proposal and batch archive | No focused Sweet White Sorghum Flour or `farine douce de sorgho blanc` review or disposition was found. R26’s `toasted white sorghum flour` hold is the only close white-sorghum flour boundary and remains A7-only. The proposed S01–S06 source IDs do not occur in the ledger or archive. |
| Exact phrase ownership | The two proposed aliases have no exact normalized owner across reference names/aliases, form names/match terms, legacy names/aliases, or ledger record IDs. The broader English and French display phrases remain owned by `ingredient-ref-sorghum-flour`. |
| Recipe corpus | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for the target English and French phrases, shorter white-sorghum variants, generic sorghum-flour wording, and the sorghum-flour reference ID. There are zero text hits, zero ingredient-row hits, and zero links to `ingredient-ref-sorghum-flour`. No recipe edit, relink, or amount is proposed. |

The static picker projection follows phrase-first normalized matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using current references and forms plus the two proposed aliases. It is a data projection, not runtime picker QA.

| Query | Before | After | Effect |
|---|---:|---:|---|
| `sweet white sorghum flour` | 0 | 1 | Finds only `ingredient-ref-sorghum-flour`. |
| `farine douce de sorgho blanc` | 0 | 1 | Finds only `ingredient-ref-sorghum-flour`. |
| `white sorghum flour` | 0 | 1 | Matches within the English alias; this phrase is not stored as an alias. |
| `sorghum flour` | 1 | 1 | Still resolves only to the existing generic sorghum-flour reference. |
| `farine de sorgho` | 1 | 1 | Still resolves only to the existing generic sorghum-flour reference. |
| `sorgho blanc` | 0 | 1 | Matches within the French alias. |
| `sweet` | 20 | 21 | Adds the generic sorghum-flour row to an already broad result set. |
| `white` | 32 | 33 | Adds the generic sorghum-flour row to an already broad result set. |
| `sorghum` | 6 | 6 | No result-set change; sorghum names are already indexed. |
| `toasted white sorghum flour` | 0 | 0 | The exact held A7 phrase remains unassigned in the active picker. |

## Measures, density, and substitutions

- Homegrown and Epipresto show **623 g**, which is package mass only [S02–S03]. It is not a cup measure or volume-to-mass observation.
- Bob’s current generic Sorghum Flour page reports **1/4 cup (35 g)** and suggests adding **15–20%** sorghum flour to flour mixes [S06]. The page does not identify the sweet-white item code, so this review proposes no additional observation. In any event, a label serving is not a measured density, and a flour-mix inclusion suggestion is not a replacement ratio.
- The Cuisinart manual calls sorghum flour a good oat-flour substitute but gives no amount, formula, or method adjustment [S05]. Do not add a global or contextual substitution, including a one-for-one oat-flour rule.
- Keep the existing generic flour ledger observation and blocked substitution finding source-scoped and unchanged. Keep `defaultDensity` null, `unitMappings` empty, and add no form, conversion, yield, recipe link, or active substitution rule.

## Proposed ledger linkage

If accepted, register S01–S06 on the existing `ingredient-ref-sorghum-flour` ledger record with one accepted decision for the exact bilingual product-name aliases. Keep identity, measurement, and substitution states otherwise unchanged; do not add a new record, measurement observation, or substitution finding ID. The new source-ID prefix and all six individual IDs were checked for exact collisions across current ledger records and `docs/catalog` before this proposal was written.

## Proposal-local static checks

After writing, verify UTF-8 without BOM, no trailing whitespace or mojibake, valid JSON in the proposed full-row delta, resolved local Markdown links, and that this is the only new file created for this task. No shared catalog JSON, generated files, plan, or roadmap is to be changed here. No Gradle, tests, emulator, app, or deployment work is in scope for this proposal-only review.

[R4 Milo flour hold](wp02-a6-next-regional-flour-gap-review-20261013-round4.md) · [R8 Jowar Atta review](wp02-a6-next-regional-flour-gap-review-20261013-round8.md) · [R10 Guinea-corn review](wp02-a6-next-regional-flour-gap-review-20261013-round10.md) · [R12 Mabele/Amabele hold](wp02-a6-next-regional-flour-gap-review-20261013-round12-mabele-amabele.md) · [R26 toasted-white-sorghum review](wp02-a7-toasted-white-sorghum-flour-boundary-review-20261013-round26.md)

## Root integration disposition (R152)

Accepted and integrated the two exact aliases on `ingredient-ref-sorghum-flour`; no new reference or
ledger record was added. The existing display, density, unit mappings, measurement observation, and
blocked substitution state remain unchanged. Registered S01–S06 and an accepted alias decision on
the existing ledger row. See the [R152 integration README](../batches/wp02-wp03-wp04-r152-gap-review-integration-20261015/README.md).

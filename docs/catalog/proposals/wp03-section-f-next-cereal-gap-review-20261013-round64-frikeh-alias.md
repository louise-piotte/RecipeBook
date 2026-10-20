# WP03 Section F round 64: freekeh / frikeh spelling alias — 2026-10-13

## Review record

- **Status:** Integrated as the `frikeh` spelling alias on existing `ingredient-ref-freekeh`. See [`wp03-section-f-freekeh-frikeh-alias-integration-20261013`](../batches/wp03-section-f-freekeh-frikeh-alias-integration-20261013/README.md).
- **Scope:** Review the exact spelling `frikeh` as a search alias for the existing processed-wheat grain identity `ingredient-ref-freekeh`.
- **Selection:** Freekeh is already integrated as an identity-only cereal, but the existing row has no aliases. The focused Section F archive contains no prior review of `frikeh`; the previous identity integration explicitly left aliases empty. This is a separate spelling and search-ownership question, not a proposal to recreate the grain.
- **Disposition:** Add `frikeh` to both alias arrays on `ingredient-ref-freekeh`. Keep the canonical displays `freekeh / freekeh`. Add no new identity, form, measurement, recipe link, or substitution behavior.

## Source evidence and limits

| Source | What it supports | Limits |
|---|---|---|
| Reuse `WP03-S72`, TERMIUM Plus, [freekeh](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?codom2nd_wet=1&consrv_prsent=1&i=1&index=esr&lang=eng&srchtxt=MADRE) | The Government of Canada's terminology record defines freekeh as a cereal made from unripened wheat that is roasted and crushed. Its French term is masculine `freekeh`, with the context *Le freekeh est fait de blé vert qui a été grillé.* | Supports keeping the standard French display `freekeh`; it does not list `frikeh` as a preferred or alternate term. The existing ledger record is reused. |
| `WP03-FREEKEH-FRIKEH-ALIAS-20261013-R64-S01`, [Canadian Trade-marks Journal, 2009](https://publications.gc.ca/collections/collection_2009/opic-cipo/RG42-2-56-2865.pdf) | A bilingual Canadian goods declaration includes `frikeh` in both the English list (“instant preparations, namely, couscous, frikeh”) and its French translation (“préparations instantanées, notamment couscous, frikeh”). The applicant declared use in Canada since at least 2000. | This is an applicant's historical trade-mark declaration, not a government terminology ruling or inspected package. Its “instant preparations” classification is not used to infer a form or cooking state. |
| `WP03-FREEKEH-FRIKEH-ALIAS-20261013-R64-S02`, Times Colonist, [Ask Eric: Freekeh is versatile, nutritious and easy to cook](https://www.timescolonist.com/life/food-and-drink/ask-eric-freekeh-is-versatile-nutritious-and-easy-to-cook-4635175) | A Canadian food article identifies `frikeh` as a spelling of freekeh and describes the food as immature, soft green wheat that is roasted and cracked. | Editorial spelling evidence; it does not establish Québec usage, species-specific scope, or a catalog form. |
| `WP03-FREEKEH-FRIKEH-ALIAS-20261013-R64-S03`, Instacart Canada, [Aoun Frikeh, 900 g](https://www.instacart.ca/store/products/27570302-aoun-frikeh-900-g) | A current Canadian retailer listing, sold through Adonis, uses the exact product title `Aoun Frikeh`, 900 g. | The listing supports Canadian product naming, not a detailed ingredient statement or every store's current local inventory. |
| `WP03-FREEKEH-FRIKEH-ALIAS-20261013-R64-S04`, Marché du Monde, [Aoun - Frikeh - 900 g](https://www.marchedumonde.ca/shop/page/5/?column=1&filter_cat=144%2C108%2C79%2C38%2C43%2C84&per_page=9&view=list-view&wmc-currency=CAD) | The French-language catalog lists `Aoun - Frikeh - 900g`, direct Québec-market wording for the candidate spelling. | The indexed product-page snapshot is about 1.3 years old and showed stock at that time; it does not establish current inventory. The French page keeps the product name `Frikeh` and does not supply a separate translated common name. |
| `WP03-FREEKEH-FRIKEH-ALIAS-20261013-R64-S05`, Marché du Monde, [contact page](https://marchedumonde.ca/contact/) | Identifies the retailer as Marché du Monde in Rimouski, Québec. | Confirms retailer location only, not the product's current inventory. |

Together these sources support one narrow spelling alias on the existing freekeh identity. TERMIUM remains the strongest French terminology source and supports keeping the displayed French name `freekeh`; the Canadian bilingual declaration and Québec-facing product title support searchable `frikeh`. Do not replace the French display with `frikeh` or translate the product description `blé vert` into a global alias.

## Exact ownership and prior-review boundary

The active row is:

| ID | English display | French display | Existing aliases | Category and numeric fields |
|---|---|---|---|---|
| `ingredient-ref-freekeh` | `freekeh` | `freekeh` | `aliasesEn: []`; `aliasesFr: []` | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

The active reference and form catalogs, legacy import identities, and exact candidate strings in the proposal/batch archive were checked. No active reference, form, or legacy identity owns `frikeh`, `freekah`, or `farik`; no form is attached to `ingredient-ref-freekeh`. The ledger's existing freekeh decision covers the identity and its process boundary, but contains no `frikeh` spelling decision. No focused prior proposal mentions the spelling family. Broad residual audits treat the freekeh identity as integrated and leave its names unchanged; they do not assess this alias.

| Candidate | Exact current owner | Disposition |
|---|---|---|
| `frikeh` | None | Add as the only new English and French search alias on `ingredient-ref-freekeh`. |
| `freekeh` | `ingredient-ref-freekeh` display in both locales | Keep as the canonical display; add nothing. |
| `farik` | None | Leave unassigned in this narrow review. The Canadian article mentions it, but no Canadian or Québec product title or authoritative French term record for it was found in this review. |
| `freekah` | None | Leave unassigned; no relevant Canadian or Québec product/name evidence was found. |
| `frik` | None | Leave unassigned; this proposal does not broaden the freekeh spelling family. |

Do not create a second freekeh row, map the alias to raw green wheat or mature cracked wheat, or alter the existing boundary against bulgur and wheat berries.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) builds reference search terms from both display names and both alias arrays. It prefers complete normalized word-phrase matches, then falls back to substring matching. The following is a static projection of that source behavior, not a live picker or emulator test:

| Query | Current exact result | With only this alias change |
|---|---|---|
| `frikeh` | None | `ingredient-ref-freekeh` |
| `freekeh` | `ingredient-ref-freekeh` | Same result |
| `farik` | None | None |
| `freekah` | None | None |

Since aliases are included in the shared search term set, `frikeh` will be searchable in either UI language. The stored canonical names remain unchanged, so the result's displayed labels remain `freekeh` in English and French.

## Recipe demand

The manifest-listed bundle contains **114 recipe files** and **1,123 ingredient rows**. A read-only scan of serialized recipe content and ingredient rows found zero matches for `frikeh`, `freekah`, `farik`, `freekeh`, or `green wheat`, and no direct recipe link to `ingredient-ref-freekeh`. No recipe edit, relink, measurement, or substitution is indicated.

## Exact proposed fields and limits

If accepted, change only the existing reference's alias fields and integration timestamp:

```text
ingredient-ref-freekeh
  nameEn: freekeh                 (unchanged)
  nameFr: freekeh                 (unchanged)
  aliasesEn: [frikeh]             (add one spelling)
  aliasesFr: [frikeh]             (add one spelling)
  category: GRAIN_AND_CEREAL      (unchanged)
  defaultDensity: null            (unchanged)
  unitMappings: []                (unchanged)
  updatedAt: 2026-10-13T00:00:00Z (if integrated)
```

The reference DTO already supports `aliasesEn` and `aliasesFr`; no schema, mapper, or generated-file change is required. Keep all numeric and behavioral fields as they are. Do not add a form for cracked, whole, cooked, instant, or otherwise qualified freekeh; the reviewed alias evidence does not establish a reusable form model. Retail package weights are not household measures or density evidence. Add no yield, conversion, recipe-line substitution, global substitution, or contextual substitution.

## Source-ID and URL handling

Reuse the existing ledger source ID `WP03-S72` for TERMIUM. The exact CIPO, Times Colonist, Instacart product, Marché du Monde product, and Marché du Monde contact URLs were not found in the current ledger or proposal/batch archive; IDs S01–S05 above are proposal-local references only. No new source records are added to the shared ledger in this proposal.

## Review coverage and test note

- Re-read `AGENTS.md`, the current Section F plan and roadmap summaries, active ingredient references and forms, the freekeh ledger record, and the Section F proposal/batch archive.
- Checked exact ownership across active names/aliases, forms, legacy identities, and the reviewed spelling archive; inspected the search projection; scanned the full bundled recipe corpus; and reviewed Canadian and Québec-facing product wording plus the Canadian French terminology record.
- **No tests or emulator checks were run.** This change adds only a proposal Markdown file. `AGENTS.md` also states that database-JSON-only additions require no testing if this alias is later integrated as a JSON-only change.

## Root integration outcome

Added `frikeh` to both English and French alias arrays on `ingredient-ref-freekeh`; the canonical `freekeh / freekeh` display, category, forms, and numeric fields remain unchanged. Added Canadian and Québec product-spelling evidence and an accepted alias decision to the existing research-ledger record. No recipe demand or recipe link was found. No tests or emulator checks were run because the accepted change only adds database JSON data under `AGENTS.md`.

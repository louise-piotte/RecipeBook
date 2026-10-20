# WP03 Section F — broken-rice regional alias review (R711, 2026-10-18)

## Review record

- **Candidate:** Hindi transliteration `tukda chawal` as a search alias for existing `ingredient-ref-broken-rice` (`broken rice / riz en brisures`).
- **Recommendation: add one bounded alias.** Add only the exact phrase `tukda chawal` to that existing reference's `aliasesEn` list after review. The proposal allocates no ID and changes no shared data.
- **Scope:** One Latin-script regional name for generic broken rice. This does not propose a new identity, rice variety, product grade, preparation form, French label, recipe link, numeric value, or substitution.
- **Section F gap:** The global plan leaves remaining Section F coverage open ([line 12535](../../RecipeBook-global-ingredient-catalog-plan.txt#L12563)); the active grain/cereal packet specifically says to keep broken-rice regional aliases under review ([line 546](../batches/plant-grains-cereals.md#L546)).
- **Current package snapshot:** 1,841 ingredient references (276 `GRAIN_AND_CEREAL`), 174 forms, 56 legacy candidates, and 2,224 research-ledger records. The manifest lists 114 recipes and 1,123 ingredient rows.

## Evidence and limits

Organic Mandya's producer page identifies its product as broken rice and says the milling fragments are broken rice; its language FAQ names Hindi `Tukda Chawal` for broken rice [S01]. This is direct product-maker evidence for the alias on the product class already represented by the catalog row. It is not a Hindi terminology authority and does not prove that every market uses the phrase with identical scope.

The Sports Authority of India's dry-ration procurement listing has an unbranded item named `Rice Tukda` [S02]. This is independent official procurement wording that corroborates use of `tukda` for a rice product. The indexed PDF text supplies no definition or grain specification, and direct PDF retrieval did not complete; it is used only as corroboration, not as a product definition or as evidence for the exact Hindi word order.

Together these sources support a narrowly searchable regional name for generic broken rice. They do not support a new rice identity, a variety-level mapping, broader English aliases, or a French equivalent.

## Identity, alias, and source ownership audit

The live row is `ingredient-ref-broken-rice`, with `nameEn: broken rice`, `nameFr: riz en brisures`, empty alias arrays, category `GRAIN_AND_CEREAL`, null default density, and no unit mappings. It has no attached forms. Its ledger record verifies the identity and leaves measurement and substitution research open. The 56-row legacy-candidate file has no `tukda` owner.

Exact-term searches across active reference names and aliases, forms and match terms, legacy candidates, the research ledger, prior proposals and batches, and the current plan found no existing owner for `tukda chawal`, `tukda`, `rice tukda`, `tukda rice`, or `tukda tandul`. No recipe links to `ingredient-ref-broken-rice`.

The R700-series proposal and batch archive contains no prior `tukda` decision. R702 reviewed pot-barley French display, R705 reviewed Riceberry rice, and R708 held the distinct puffed-rice term `pori`; none decides this broken-rice alias. See the [R702 review](wp03-section-f-pot-barley-quebec-display-review-r702-20261018.md), [R705 review](wp03-section-f-next-grain-gap-review-r705-20261018.md), and [R708 review](wp03-section-f-puffed-rice-pori-alias-boundary-review-r708-20261018.md). The related [broken-rice identity note](../batches/broken-rice-identity.md) keeps brewing-scoped OQLF wording such as `brisures de riz`, brewer's rice, rice grits, rice screenings, `riz cassé`, and `riz brisé` out of global aliases; this review preserves those limits. The separate [rice-grits boundary review](wp02-a7-rice-grits-boundary-review-20261013-round31.md) remains unchanged.

The proposed source IDs below are proposal-local, unique within this packet, and unallocated. Searches found neither ID nor either source URL in the current ledger or proposal/batch archive. No reference ID, legacy ID, or ledger source ID is requested.

## Bounded catalog disposition

If approved, the only field-level effect is:

| Existing field | Current | Proposed |
|---|---|---|
| `ingredient-ref-broken-rice.aliasesEn` | `[]` | `["tukda chawal"]` |

The catalog has no separate multilingual alias field. Keep the romanized Hindi phrase in the existing search-alias bucket used for non-French Latin-script regional names, as with `muri` and `murmura` on puffed rice. Do not add it to `aliasesFr`. Store neither a separate bare `tukda` alias nor any alternate spelling. The picker can match `tukda` as a complete word within the proposed phrase without a second stored alias.

Keep `tukda tandul` (Marathi), `rice tukda`, `tukda rice`, basmati-qualified wording, Devanagari spellings, and other product or regional variants outside this one-phrase decision. Do not create a French alias from the cited sources. Keep brewing-scoped terms and the existing rice-grits boundary unchanged. Add no form, measurement, density, unit mapping, conversion, yield, nutrition data, recipe association, or substitution.

## Phrase-first picker projection

`IngredientSearch.kt` normalizes terms, returns complete word-phrase matches first, and uses partial matching only when no full phrase matches. The table is a static projection from the current seed plus the proposed alias; it is not live app QA.

| Query | Current result | With only `tukda chawal` added |
|---|---|---|
| `tukda chawal` | No result | `broken rice / riz en brisures` only |
| `tukda` | No result | `broken rice / riz en brisures` only; complete word match in the alias |
| `chawal` | `rice / riz` | `broken rice / riz en brisures`; `rice / riz` |
| `broken rice` | `broken rice / riz en brisures` | Same one result |
| `riz en brisures` | `broken rice / riz en brisures` | Same one result |
| `rice tukda`, `tukda rice` | No result | No result; word order is not inferred |

The single-token `chawal` query broadens to a second, clearly named result because it is already a generic-rice alias. No active result is displaced or merged.

## Recipe scan

Scanned every manifest-listed recipe file and ingredient row using normalized complete-phrase matching across serialized recipe content and row fields. The scan covered `tukda chawal`, `tukda`, `tukda rice`, `rice tukda`, `tukda tandul`, `broken rice`, `riz en brisures`, `riz cassé`, and `riz brisé`.

| Scan | Result |
|---|---:|
| Manifest recipe files | 114 |
| Ingredient rows | 1,123 |
| Files with a candidate or boundary phrase | 0 |
| Rows with a candidate or boundary phrase | 0 |
| Rows linked to `ingredient-ref-broken-rice` | 0 |

No recipe line or quantity needs a change. The alias is a catalog search-coverage proposal, not a recipe-demand claim.

## Proposal-local sources

- **`WP03-BROKEN-RICE-TUKDA-CHAWAL-R711-20261018-S01` — [`Organic Mandya`, Broken Rice product page](https://organicmandya.com/products/broken-rice-1kg):** Product description and FAQ identify broken rice fragments and list Hindi `Tukda Chawal` (FAQ, “What is broken rice called in different languages?”). Primary evidence for this producer's product wording; not a language standard or Québec French authority.
- **`WP03-BROKEN-RICE-TUKDA-CHAWAL-R711-20261018-S02` — [Sports Authority of India, Procurement of Dry Ration (PDF)](https://sportsauthorityofindia.gov.in/sai_new/public/assets/uploads/tenders/1663568559_Procurement%20of%20Dry%20Ration.pdf):** Official procurement listing includes an unbranded `Rice Tukda` item. The indexed text was accessible while direct PDF retrieval timed out; the listing corroborates procurement wording but gives no product specification.

## Disposition requested

Approve only `tukda chawal` as an English/search alias on `ingredient-ref-broken-rice`. Keep every other identity, alias, form, recipe, numeric, measurement, conversion, and substitution field unchanged. This packet requests no shared-data edit or identifier allocation.

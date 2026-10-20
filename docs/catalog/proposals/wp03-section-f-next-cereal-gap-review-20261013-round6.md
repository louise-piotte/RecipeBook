# WP03 Section F — Hindi `chawal` rice alias review (2026-10-13, round 6)

## Review record

- **Status:** Integrated by root on 2026-10-13; see the [round-six integration](../batches/wp02-wp03-wp04-round6-gap-review-integration-20261013/README.md). The proposal-only reviewer changed no shared files.
- **Scope:** decide whether the unqualified Hindi name `chawal` should be an English-search alias on the existing generic rice identity. This does not reopen the completed flattened-rice regional aliases, jowar aliases, or any named rice identity.
- **Plan context:** Section F still leaves specialized regional cereal terms and broader regional grain/preprocessed-cereal coverage open. The round-four and round-five checkpoints resolved separate flattened-rice and sorghum terms; they did not assign `chawal` ([active checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2278), [round-four checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L11735), [round-five checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L11741)).
- **Recommendation:** add only the English-search alias `chawal` to `ingredient-ref-rice` (`rice / riz`). Keep all displays, the French alias list, dry/cooked forms, numeric fields, substitution state, and recipe links unchanged.

## Recommendation and exact fields

The Sikkim Government's Horticulture and Cash Crop Department lists `Chawal` as a Hindi name for rice (*Oryza sativa* L.). A current Mississauga rice listing uses `Chawal` for a bagged Surti Kolam rice product. Together, these support one narrow regional search alias on the existing generic rice identity. The retailer page is one SKU and is not a taxonomy or universal product standard; the government source establishes the regional name but does not specify dry versus cooked usage.

| Field | Proposed value |
|---|---|
| Existing owner | `ingredient-ref-rice` |
| English display | Keep `rice` |
| Québec French display | Keep `riz` |
| English aliases | Append only `chawal` to `aliasesEn` |
| French aliases | Keep empty; do not add `chawal` as a French term |
| Category | Keep `GRAIN_AND_CEREAL` |
| Identity, forms, recipe links | No new reference, form, or recipe link |
| Density and unit mappings | Keep `defaultDensity: null` and `unitMappings: []` |
| Measurements, yields, conversions | Add none; retain the existing research state and historical-data boundary below |
| Substitutions | Add no rule or finding; retain `substitutionResearchState: not_yet_researched` |

Do not add `dhan`, `chamal`, `chaul`, alternate transliterations, `chawal rice`, `chawal ka atta`, or prepared-dish phrases. The official source presents `Dhan` and `Chamal` as local names and `Dhan` and `Chawal` as Hindi names, but only the latter spelling is corroborated as a rice-product synonym by the Canadian listing. No Québec French source supports a regional alias beyond the current display `riz`.

## Product identity and naming limits

The proposed alias denotes the broad rice ingredient family, not a cultivar, grain length, milling state, parboiling process, or cooking state. The local Canadian retailer page that directly identifies rice as “Chawal” is for Surti Kolam rice; it does not make `chawal` a Surti Kolam alias or support adding a rice variety. A second current Mississauga listing names Gujarat 17 rice and mentions `Chawal` while describing Indian dishes. That usage is recorded as a boundary signal because it can refer to a prepared rice dish in culinary context; it is not used to broaden the alias beyond the bare term.

The live catalog already separates generic rice, white rice, brown rice, named rice types, rice flour, flattened rice (poha), puffed rice, crispy rice cereal, and other processed rice products. Bare `chawal` belongs on the generic rice base because the authoritative regional source labels it as rice and the Canadian retailer applies it to a whole-rice SKU. It must not route to flattened rice, a particular variety, flour, or a prepared dish.

OQLF's current entry pairs the French headword `riz` with English `rice`, defines the food term as the grain produced by the rice plant, and does not establish `chawal` as a Québec French term [WP03-S74]. Keep `riz` as the display and add no French alias.

## Exact ownership and prior-review audit

The read-only audit covered active reference names and aliases, all form labels and match terms, the 64 legacy import candidates, the rice research-ledger record, and Section F proposals and batches. There is no exact normalized owner or prior accepted decision for `chawal`, `chaawal`, `chāwal`, `chamal`, `chaul`, `dhan`, `chawal rice`, `chawal ka atta`, or `arwa chawal`. The ledger's existing `ingredient-ref-rice` record contains only its generic rice/Codex, Health Canada state-description, and OQLF terminology evidence; it has no `chawal` source or decision. The round-four and round-five records concern `chuda` and `jowar whole`, respectively; neither assigns `chawal`.

| Current reference | Current scope and boundary |
|---|---|
| `ingredient-ref-rice` | `rice / riz`, `GRAIN_AND_CEREAL`; no aliases; dry and cooked forms. Correct owner for a bare broad rice name. |
| `ingredient-ref-white-rice` | `white rice / riz blanchi`, with `milled rice` and `riz blanc`; own white-milling wording. |
| `ingredient-ref-brown-rice` | `brown rice / riz brun`, with `hulled rice`, `riz cargo`, and `riz complet`; own bran-retaining milling wording. |
| Named rice references | Basmati, Arborio, Bomba, Calrose, Carnaroli, grain-length classes, glutinous, parboiled, broken, red, black, wild, and other scoped products remain separate. The sources do not map bare `chawal` to one of these. |
| Rice flours and starch | Keep `rice flour / farine de riz` and its white, brown, glutinous, Mochiko, Shiratamako, and roasted-red variants separate. `chawal ka atta` is not included in this proposal. |
| `ingredient-ref-flattened-rice-poha` | Owns flattened rice (poha) and its accepted regional names. Keep processed flakes separate from whole rice. |

The existing rice forms are `ingredient-form-rice-dry` (`dry rice / riz sec`) and `ingredient-form-rice-cooked` (`cooked rice / riz cuit`). Both have null density and empty form-match arrays. No form or form-specific alias is proposed.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) gives exact form phrases first priority, then complete word-phrase matches, and only then substring matches. The following is a static projection of that current implementation against the live reference and form files; it is not runtime picker QA.

| Query | Current result | After the proposed alias | Form behavior / boundary |
|---|---|---|---|
| `chawal` | No result | `ingredient-ref-rice` — **rice / riz** | Base identity only; no dry or cooked form hint. |
| `chawal rice`, `chawal ka atta`, `chawal atta`, `chawal flour` | No result | No result | No compound or flour alias is proposed. |
| `dry chawal`, `cooked chawal` | No result | No result | No evidence supports state-qualified forms under this Hindi term. |
| `dry rice` | `ingredient-ref-rice` | Same | Existing exact dry-form query remains unchanged. |
| `cooked rice` | `ingredient-ref-rice` | Same | Existing exact cooked-form query remains unchanged. |
| `rice` | 51 references | Same 51 references | Broad family query is unchanged. |
| `riz` | 47 references | Same 47 references | French query is unchanged. |
| `rice flour` | 7 references | Same 7 references | Existing grain/flour phrase behavior is unchanged. |
| `white rice`, `brown rice`, `poha` | 2, 5, and 3 references respectively | Same results | Milling, variety, and flake boundaries are unchanged. |

The alias therefore fixes only the currently empty bare `chawal` query. It does not synthesize a `chawal` form or redirect the term to one rice variety. The result uses the existing generic display so that the picker does not imply a specific cultivar or cooking state.

## Recipe-corpus demand

The full current bundled manifest contains **114 recipe files and 1,123 ingredient rows**. I parsed every manifest-listed recipe, scanned all serialized string fields and every ingredient row, and checked existing ingredient-reference links for `chawal`, `chaawal`, `chāwal`, `chamal`, `chaul`, `dhan`, `chawal rice`, `chawal ka atta`, `chawal atta`, `arwa chawal`, `cooked chawal`, `raw chawal`, and related rice/flour/dish phrases. Result: **0 candidate-term recipe-file hits and 0 candidate-term ingredient-row hits**.

The existing generic `ingredient-ref-rice` has three linked recipe rows (recipes 086, 090, and 093); each explicitly requests cooked rice and already links to `ingredient-form-rice-cooked`. Recipe 066's optional `Cooked white rice, for serving` remains linked to the separate white-rice identity and its cooked form. No recipe is relinked and no quantity or source text changes.

## Measurement and substitution review

The generic rice reference has `defaultDensity: null`, no unit mappings, and the existing dry and cooked forms with `densityGPerMl: null`. Keep those fields unchanged. The current Canadian retail page's 10 lb package is a SKU package quantity, not a household measure, density, portion, or cooking yield.

Health Canada's CNF page for food code 4471 is explicitly **white, long-grain, regular, dry rice**. Its current serving page shows 100 mL = 78.2 g, 250 mL = 195.5 g, and an amount to make 125 mL = 35.3 g [existing source `WP03-S3`]. These are source- and state-scoped entries from the 2015 CNF page, which is marked interim in the existing rice state-form review. They were intentionally not imported as generic-rice measures; that earlier packet states that measure, yield, conversion, and substitution work is separate. The newer 2026 CNF dataset was not audited for this alias review. Do not attach these historical white-long-grain values to generic `chawal`, add an active density or unit mapping, infer a dry-to-cooked yield, or change `measurementState` from `not_yet_researched` in this proposal.

None of the alias sources recommends a replacement ratio. Regional naming and a rice retail listing do not show that one rice variety or preparation state can replace another in a defined recipe. Keep `substitutionResearchState: not_yet_researched`, add no substitution finding, and create no active global form conversion or contextual substitution rule. No measurement observation or substitution-finding ID is allocated in this alias-only review.

## Source register and ID-collision audit

The three new source IDs below were checked absent from the live ledger and proposal/batch archive before drafting. Existing `WP03-S2`, `WP03-S3`, and `WP03-S74` are reused for their already-recorded Codex, Health Canada, and OQLF evidence; do not duplicate their ledger source entries.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-CHAWAL-R6-20261013-S01` | Sikkim Government, Horticulture and Cash Crop Department, [Cereals](https://www.sikkim.gov.in/department/departmentmenudetails?url=Menu%3Dhorticulture-cash-crop-department%2Fcereals), rice entry. Checked 2026-10-13. | The official page identifies rice as *Oryza sativa* L. and lists `Dhan, Chawal` as Hindi names (and `Dhan, Chamal` as local names). Direct page retrieval returned a cache miss during this review; the indexed official page exposed the cited entry. It establishes regional name evidence, not a Canadian product standard, Québec French term, or dry/cooked state. Do not infer `dhan` or `chamal` as aliases from this proposal. |
| `WP03-CHAWAL-R6-20261013-S02` | Namaste Supermarket, Mississauga, [Vishva Surti Kolam Rice 10 lb](https://namastemississauga.ca/products/vishva-surti-kolam-rice-10lb/019a52cc-4408-788c-ad5d-f9bb802d8c36), current product title, location, and description. Checked 2026-10-13. | The local retailer identifies its item as Surti Kolam rice, gives its Mississauga address, and says it is commonly known as “Chawal” in Indian households. This is one Canadian-facing product page, not a standard, named-variety synonym rule, French label, recipe measure, or proof of current stock beyond the page's add-to-cart display. |
| `WP03-CHAWAL-R6-20261013-S03` | Namaste Supermarket, Mississauga, [Pahal Gujarat 17 Rice 10 lb](https://namastemississauga.ca/products/pahal-gujarat-17-rice-10-lb/019a4ef2-5280-788c-acb2-1a642c3078e7), current product title and description. Checked 2026-10-13. | Corroborates Canadian usage of `Chawal` with another named rice item, but the description phrases it as an Indian dish. This is treated as a boundary signal, not direct evidence that every prepared `chawal` phrase is an ingredient alias. Package mass is not a measure. |
| Existing `WP03-S74` | OQLF, [riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432759/riz), food/cereal domain and English translation; last updated 2025. | Supports keeping `riz / rice` as the bilingual display pair and the generic edible-grain scope. It does not support using `chawal` in French. |
| Existing `WP03-S3` | Health Canada, [CNF food code 4471](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471), dry white long-grain rice, serving table. | The existing ledger source is the dry-state description for food code 4471. The values are scoped to the named 2015 CNF food and are not imported as a generic rice measure, density, conversion, or cooking yield. |
| Existing `WP03-S2` | Codex Alimentarius, [Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf), scope and rice classes. | Existing source for the rice identity and separate milling and grain-length classes; it supplies no `chawal` alias, household measure, or substitution. |

No source ID in the proposed `WP03-CHAWAL-R6-20261013-S01`–`S03` range exists in the 5,266 distinct source IDs currently in the research ledger or in the searched proposal/batch archive. No new observation or finding ID is proposed; the existing ledger's 190 substitution finding IDs and 338 measurement observation IDs remain untouched.

## Review-time baseline snapshot

The following SHA-256 values describe the live files audited before this proposal was written; the recipe corpus fingerprint is the manifest-order path/NUL/file-bytes/NUL digest.

| File or corpus | Review-time size / coverage | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,339 references | `0c82c3f233e7d4056a39a38cf637062dac7efa2ae3cae3953e32cac96beb5021` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `manifest.v1.json` | 114 recipes listed | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe files | 114 files / 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `docs/catalog/legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `docs/catalog/research-ledger.v1.json` | 1,647 records / 5,266 distinct source IDs | `36a911dc6f79532bf3748c30fd03fde84f2c1ed35c420dab32ef18d68af382cf` |

## Integrated disposition

**Integrated by root:** added only `chawal` to `ingredient-ref-rice.aliasesEn` and added the three new source entries plus one accepted alias decision to the existing `ingredient-ref-rice` ledger record. Reused `WP03-S2`, `WP03-S3`, and `WP03-S74` without duplicate source records. Kept the `rice / riz` display, all French aliases, dry/cooked forms, three existing generic-rice recipe links, numeric behavior, and substitution state unchanged. The source evidence supports a regional name for rice, but it does not support a named variety, a French alias, a dry/cooked term, a household measure, or a substitution.

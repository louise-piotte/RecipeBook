# WP04 Section P R459 — generic breaded-shrimp preparation review

- **Review and source-access date:** 2026-10-17.
- **Checklist:** [WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish”](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717). The parent remains open.
- **Scope:** The generic breaded-shrimp preparation only. This is distinct from the accepted product-specific breaded butterfly, coconut butterfly, and popcorn shrimp identities, held shrimp tempura, and the separate crab cake, crab claws, crab legs, and lobster claws reviews.
- **Recommendation:** Add identity-only **`breaded shrimp / crevettes panées`** as a `PROTEIN` reference. Keep its aliases, forms, measures, recipe links, conversions, package yields, and substitutions empty.
- **Proposal status:** Accepted and integrated as an identity-only reference; the Section P parent remains open.
- **Source IDs:** `WP04-SECTIONP-BREADED-SHRIMP-R459-20261017-S01` through `S04`, now registered on `ingredient-ref-breaded-shrimp`; repository audit ID `R01`. Existing OQLF, Health Canada, and adjacent Section P sources are reused by their existing IDs below.

## Candidate selection and proposed identity

The Section P parent still calls for shrimp and prawn preparations. Recent decisions cover several named products but leave the generic breaded preparation unallocated:

- R438 integrated `breaded butterfly shrimp / crevettes en papillon panées` and expressly kept generic `breaded shrimp / crevettes panées` outside that product-specific identity. [R438 proposal](wp04-section-p-breaded-butterfly-shrimp-product-identity-review-r438-20261017.md); [R437–R439 integration](../batches/wp02-wp04-wp06-r437-r439-gap-review-integration-20261017/README.md)
- R441 integrated coconut butterfly shrimp as its own product identity; it did not allocate a general breaded-shrimp owner. [R441 proposal](wp04-section-p-coconut-butterfly-shrimp-product-boundary-review-r441-20261017.md); [R440–R442 integration](../batches/wp02-wp04-wp06-r440-r442-gap-review-integration-20261017/README.md)
- R444 integrated popcorn shrimp and kept `breaded shrimp / crevettes panées` out of that row’s aliases. [R444 proposal](wp04-section-p-next-seafood-gap-review-r444-20261017.md); [R443–R445 integration](../batches/wp02-wp04-wp06-r443-r445-next-gap-review-integration-20261017/README.md)
- R448 held shrimp tempura because it would make the broad `tempura` query misleading. The breadcrumb coating reviewed here remains distinct from tempura batter. [R448 proposal](wp04-section-p-shrimp-tempura-product-boundary-review-r448-20261017.md); [R448 integration](../batches/wp04-section-p-shrimp-tempura-hold-integration-r448-20261017/README.md)

The rest of the recent cut and prepared-food work is separate: R432 covers crab cakes, R435 crab claws, R450 crab legs, and R456 lobster claws. This proposal does not reopen those decisions, generic crab, crayfish, imitation crab, shrimp species, or other shrimp preparations.

OQLF defines *paner* as covering food with fresh bread crumb or breadcrumbs before frying, grilling, or sautéing. CFIA’s French guidance lists `crevettes panées` as an example of a crustacean product. Current Canadian supplier pages use the English product name `Breaded Shrimp` for products that vary by shrimp type, size, and shape. A Québec restaurant menu pairs `Crevettes panées` with `Breaded Shrimp`. Together these sources support a narrow, species-neutral identity for shrimp coated in bread crumb; they do not establish one formula, package, shape, or cooking state. [Reused OQLF source `WP03-G-CRUMB-20261011-S02`; S01–S04]

Proposed reference if accepted:

```json
{
  "id": "ingredient-ref-breaded-shrimp",
  "nameEn": "breaded shrimp",
  "nameFr": "crevettes panées",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

The display pair uses the exact generic English/French wording supported by CFIA and the Québec menu. No additional alias is needed to make those phrases searchable. Do not add the OQLF-specific popcorn terms `bouchée de crevette panée` or `mini-crevette panée`, or aliases for `popcorn`, `butterfly`, `coconut`, `tempura`, `torpedo`, panko, a species, brand, frozen state, or cooked state. The proposed identity includes bread-crumb-coated shrimp as a broad preparation group; it does not absorb narrower product names or imply that all such products share a shape or formula.

## Exact ownership, allocation, and snapshot audit

The read-only audit covered reference and form names/aliases, legacy-import candidates, ledger records and source IDs, package yields, conversion and substitution data, recent Section P proposals and integration records, picker behavior, and all manifest-listed recipe files. The inventory and counts in the following table are the proposal-time snapshot taken before the accepted integration; the current post-integration counts are recorded in the disposition below.

| Surface | Current state | R459 handling |
|---|---|---|
| Active catalog | **1,745 references** and **141 forms**. No normalized exact owner exists for `breaded shrimp`, `crevettes panées`, or the proposed reference ID in names, aliases, form labels, or form match terms. No generic active `shrimp` reference is present. | Propose only `ingredient-ref-breaded-shrimp`; do not turn this preparation into a form under another shrimp row. |
| Nearby active shrimp owners | R438 `ingredient-ref-breaded-butterfly-shrimp`; R441 `ingredient-ref-coconut-butterfly-shrimp`; R444 `ingredient-ref-popcorn-shrimp`; plus canned cocktail shrimp, dried shrimp, Northern shrimp, shrimp balls, and several fermented shrimp pastes/condiments. | Keep all current displays and aliases. The full qualified product names remain independently searchable. |
| Other shrimp preparation decisions | Generic frozen cooked shrimp is held by R229; generic fresh shrimp/prawn is held by the earlier boundary review; R448 holds shrimp tempura. Neither held review has an active identity row. | Do not add cooked, fresh, frozen, battered, or tempura aliases or forms. |
| Crab and crayfish | Active crab-meat and species rows are separate from crab cake, claws, legs, and lobster claws. The unqualified crayfish candidate remains held. | No crab, lobster, or crayfish reference, alias, form, recipe link, or substitution is proposed. |
| Legacy and ledger | **56** legacy candidates; **2,104** ledger records, **9,578** source entries, **8,125** distinct source IDs, and **6,838** distinct source URLs. No exact breaded-shrimp owner, `candidate-breaded-shrimp`, related ledger record, or proposed reference/form ID exists. | No legacy mapping or ledger record is added by this proposal. |
| Numeric and rule data | The ledger has **8** unit conversions. The package-yield file has one unrelated record; neither it nor the global or contextual substitution-rule files has a breaded-shrimp entry. Both substitution-rule files currently contain **0** active rules. | Add no measure, density, mapping, conversion, package yield, substitution observation, or rule. |
| Proposal and source allocation | The requested target path and the R459 source prefix were unused at audit time. New product-source URLs S01–S04 do not duplicate ledger URLs. The OQLF `paner` URL and Health Canada Table 8 URL are already registered under the reused IDs below. | At proposal time, keep new S01–S04 and R01 local pending disposition; reuse existing source IDs rather than duplicate URLs. |

### Current picker projection

Projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent/punctuation normalization, complete word-phrase matches first across names, aliases, and attached form terms, then substring fallback. The projection below uses the proposed display pair and empty alias arrays.

| Query | Current results | With proposed row |
|---|---|---|
| `breaded shrimp`; `crevettes panées` | 0 | 1 — `ingredient-ref-breaded-shrimp` |
| `breaded` | 3 — breaded butterfly shrimp, frozen breaded fish sticks, and popcorn shrimp | 4 — the same three plus breaded shrimp |
| `shrimp` | 8 | 9 |
| `crevettes` | 12 | 13 |
| `breaded butterfly shrimp`; `crevettes en papillon panées` | `ingredient-ref-breaded-butterfly-shrimp` | Unchanged |
| `breaded popcorn shrimp` | `ingredient-ref-popcorn-shrimp` | Unchanged |
| `coconut butterfly shrimp`; `shrimp balls` | Their respective existing rows | Unchanged |
| `shrimp tempura`; `tempura`; `prawn`; `crevette panée` | 0 | 0; none is an alias or display term |

The exact generic queries would gain one useful result. The broad `shrimp` and `crevettes` result sets each gain one result, and the existing English `breaded` query gains one result. Narrow butterfly, popcorn, coconut, and formed-product queries remain owned by their current rows. The proposed French canonical display is plural because the supporting CFIA example and Québec menu use `crevettes panées`; the singular `crevette panée` is intentionally not added. In particular, the OQLF’s singular phrase `bouchée de crevette panée` describes the already-separated popcorn-shrimp preparation.

## Manifest recipe-demand scan

The audit parsed all **114** recipe files named by `manifest.v1.json` and all **1,123** structured ingredient rows. It searched each full recipe document and each ingredient row for the proposed English/French terms, breaded shrimp variants, and shrimp/prawn/crevette wording. It found **zero matching recipe files and zero matching ingredient rows** for the candidate and **no shrimp, prawn, or crevette text anywhere in the recipe corpus**. No recipe link, relink, amount, or recipe-derived substitution is proposed.

## Measures, forms, conversions, yields, and substitutions

- **Preparation boundary:** OQLF’s method definition is general culinary terminology, while the CFIA page uses `crevettes panées` within an import-licensing product-class example. Neither standardizes the shrimp species, coating recipe, shape, or ready-to-cook state. Keep tempura batter and unbreaded shrimp separate. [Reused `WP03-G-CRUMB-20261011-S02`; S01]
- **Product variation:** Seafood Depot’s current Vaughan listing covers butterfly or torpedo shapes, black-tiger or white shrimp, 16–20 and 21–25 count-per-pound grades, an IQF presentation, and a 2 lb case. 3Fish’s Canadian product page describes a specific raw, panko-breaded 21/25 shrimp and gives its own deep-frying direction. These are supplier-specific item details, not reusable measures or forms. [S02–S03]
- **Québec wording:** Peking Garden’s online seafood menu lists `Crevettes panées / Breaded Shrimp`. This supports local paired wording for a menu item; it does not establish a package specification, a universal formula, or a kitchen conversion. [S04]
- **Count/weight evidence:** Health Canada’s 2008 fish-and-shellfish table lists `Shrimp, breaded and fried` as 6 medium shrimp weighing 66 g. This is one prepared, fried serving. It is not an unopened-product count conversion, mass-volume density, general portion, or yield. Keep it source-specific and do not activate it. [Reused `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S08`]
- **Forms and conversions:** Add no frozen, raw, cooked, panko, butterfly, popcorn, coconut, or tempura form, and no unit mapping or conversion. Product-specific count grades and pack weights do not supply a common recipe basis.
- **Yields and substitutions:** Add no package or edible yield and no global or contextual substitution. The sources do not test replacement amounts or method/role compatibility with unbreaded shrimp, breaded butterfly shrimp, popcorn shrimp, tempura shrimp, cooked/canned/dried shrimp, or shrimp balls. If integrated, the identity can use `measurementState: researched_no_supported_value` and `substitutionResearchState: not_yet_researched`; no rule or recipe-line link follows from this proposal.

## Source register and limits

The sources were accessed on 2026-10-17. The official sources support the French culinary method and product-class naming; they do not define a single commercial recipe. The Canadian supplier pages support their own product listings and package/grade variants, not a national formula or current store inventory. The Québec restaurant menu supports bilingual menu wording only.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **Reused `WP03-G-CRUMB-20261011-S02`** | OQLF, [paner (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8888028/paner). | Defines *paner* as coating food with fresh bread crumb or breadcrumbs before frying, grilling, or sautéing. It is a general cooking-method definition, not a shrimp product standard. The URL is already registered; reuse this ID. |
| **WP04-SECTIONP-BREADED-SHRIMP-R459-20261017-S01** | CFIA, [Ce qu’il faut savoir avant de présenter une demande de licence pour la salubrité des aliments au Canada](https://inspection.canada.ca/fr/licences-aliments/demande-licence), “Crustacés.” | Lists `crevettes panées` among crustacean product examples in import-licensing guidance. Supports the French product-category wording, not a specific recipe, retailer product, or equivalence. |
| **WP04-SECTIONP-BREADED-SHRIMP-R459-20261017-S02** | Seafood Depot, [Breaded Shrimp](https://www.seafooddepot.ca/product-shrimpbreaded2). | Canadian seller page at Vaughan, Ontario, titled `Breaded Shrimp`; lists butterfly/torpedo styles, black-tiger/white shrimp, count grades, IQF, and a 2 lb pack. Those variants show the seller’s range only and do not imply a standard package, species, or conversion. |
| **WP04-SECTIONP-BREADED-SHRIMP-R459-20261017-S03** | 3Fish / Frobisher International, [Breaded Shrimp](https://3fish.ca/product/breaded-shrimp/). | Canadian supplier page names a specific raw panko-breaded 21/25 shrimp product and gives a product-specific cooking instruction. It does not establish a common frozen/raw/cooked state for the identity. |
| **WP04-SECTIONP-BREADED-SHRIMP-R459-20261017-S04** | Peking Garden Restaurant, [Fish and seafood menu](https://peking-garden-quebec.com/menu/). | Québec-facing bilingual menu lists `Crevettes panées / Breaded Shrimp`. It is menu-language evidence, not packaged-product evidence or a standardized measure. |
| **Reused `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S08`** | Health Canada, [Nutrient Value of Some Common Foods: Fish and Shellfish](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-8-fish-shellfish-nutrient-value-some-common-foods-2008.html), Table 8. | Gives one `Shrimp, breaded and fried` serving as six medium shrimp / 66 g. This cooked table serving is not a raw or frozen package measure. The URL is already registered; reuse this ID and do not create an active mapping. |
| **Reused `WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S09`** | Metro, [seafood listings](https://www.metro.ca/en/online-grocery/themed-baskets/mmmazing/seafood) and [French seasoned-and-breaded seafood listings](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes). | R438 used these current category listings to distinguish regular butterfly shrimp, coconut butterfly shrimp, and breaded popcorn shrimp. Reused only for nearby product-name boundaries; do not duplicate the source URL or transfer a SKU’s details. |
| **WP04-SECTIONP-BREADED-SHRIMP-R459-20261017-R01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717), references/forms, legacy candidates, ledger IDs and URLs, package yields, conversion/substitution files, recent Section P proposals and batches, `IngredientSearch.kt`, and all manifest-listed recipe files. | Confirms the repository snapshot, exact ownership/allocation checks, picker projection, and complete 114-file / 1,123-row recipe scan. This repository audit adds no external-source claim. |

## Disposition

**Accepted and integrated:** added identity-only `breaded shrimp / crevettes panées` as `ingredient-ref-breaded-shrimp`. CFIA, OQLF, Canadian suppliers, and a Québec menu support a generic bread-crumb-coated shrimp preparation with bilingual product wording. The corpus has no matching demand, and the available measures are preparation- or product-specific. Kept the identity species-neutral and alias-free; added no forms, measures, conversions, yields, recipe links, or substitutions. Section P remains open.

The live audit was refreshed after R460: the accepted entry and its four new source IDs/URLs have no exact owner or allocation collision. The post-integration package has 1,747 references / 141 forms; 2,106 ledger records / 9,588 source entries / 8,135 distinct source IDs / 6,848 distinct source URLs; 114 recipes / 1,123 ingredient rows. Static package normalization, generated-index freshness, ledger-schema validation, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, and scoped whitespace checks passed. No app or Android tests were run for this database-JSON addition under `AGENTS.md`. See the [R459 integration README](../batches/wp04-section-p-breaded-shrimp-identity-integration-r459-20261017/README.md).

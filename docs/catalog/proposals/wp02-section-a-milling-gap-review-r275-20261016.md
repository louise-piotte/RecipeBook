# WP02 Section A rye-milling gap: French type 170 rye flour — 2026-10-16

## Review record

- **Status:** Accepted and integrated on 2026-10-16 as a documentation-only hold; see the [integration record](../batches/wp02-section-a-french-type-170-rye-flour-integration-r275-20261016/README.md).
- **Plan location:** The focused T170 hold is checked under the open Section A rye-milling review in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). Section A remains open.

## Disposition

**Held candidate, pending independent Québec wording review; if approved, add as an identity only.** Current mill sources name T170 rye flour as a distinct rye product and distinguish it from T130 products; some describe their own T170 flour as finely milled or wholemeal. Keep the candidate outside active references until a Québec reviewer accepts the proposed French construction. If accepted, keep the identity country-qualified and separate from the existing generic, light, medium, and whole-rye flour rows, the coarse rye-meal/pumpernickel row, malted rye flour, and the unresolved unqualified dark-rye candidate.

Proposed reference:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-french-type-170-rye-flour` |
| English display | `French type 170 rye flour` |
| Québec French display | `farine de seigle de type 170 (France)` — descriptive construction; provisional pending independent Québec review |
| English aliases | `T170 rye flour`; `rye flour T170` |
| French alias | `farine de seigle T170` |
| Category | `FLOUR_AND_STARCH` |
| Default density / unit mappings | `null` / empty |
| Forms, measures, conversions, yields, recipe links, substitutions | None |

These are type-qualified terms only. Do not add bare `rye flour`, `whole rye flour`, `wholemeal rye flour`, `dark rye flour`, `pumpernickel flour`, `farine de seigle entière`, or `farine de seigle intégrale` as aliases. Do not add a bare `T170` alias. The current picker will still match a `T170` query inside the qualified aliases; it returns only this candidate today because the catalog has no other T170 class.

The proposed display follows the country-qualified construction used for the French wheat-type rows, but no OQLF or Québec retail source reviewed here names the full T170 rye class. OQLF supports the base pair `farine de seigle / rye flour`, not a type-number name. Keep the full French display provisional until an independent Québec wording review accepts it. The French alias preserves the manufacturer-attested form `Farine de Seigle T170` [S01].

## Exact scope and class boundary

This review covers only **rye flour sold as French type 170 / T170**. The accepted identity would represent the market grade as named by mills, with the source country included in both display names. It would not encode a universal particle size, extraction percentage, ash interval, retained-bran specification, or baking performance. One current French mill reports ash above 1.50% for its own T170 flour; that is not copied into a reusable catalog property. The former French decree surfaced during this check is marked repealed, so this proposal does not claim a current legal standard.

The class has enough independent commercial naming to warrant its own qualified identity. Moulins Bourgeois lists T130 and T170 separately, describing its T130 as stone-ground rye flour and its T170 as stone-ground wholemeal rye flour [S02]. Dossche Mills separately sells “Whole Meal Rye Flour Type 170” and describes it as fine, pure wholemeal rye flour [S01]. Current French producer pages also use the exact French product title `Farine de seigle T170` [S03–S04]. This supports the named type-170 class; it does not establish equivalence among every product sold as “whole,” “integral,” or “dark” rye flour.

Keep the following boundaries:

- **Generic rye flour / `farine de seigle`:** retain `ingredient-ref-rye-flour`; its OQLF-backed broad identity is not a T170 alias.
- **Whole rye flour / `farine entière de seigle`:** retain `ingredient-ref-whole-rye-flour` and its current aliases. T170 is a country-qualified grade with its own commercial name; do not make plain `whole rye flour` or `wholemeal rye flour` a T170 alias. Conversely, do not redirect T170 wording to the generic whole-rye row.
- **Light and medium rye flour:** retain their active identities. T170 is not a synonym for either grade and no rye type-number crosswalk to North American light/medium grades is proposed.
- **Dark rye flour:** keep the current unresolved status. Suppliers use “dark” for materially different milling scopes, while T170 is a type-qualified product name. Do not add `dark rye flour` or `farine de seigle foncée` as aliases even where a T170 product is described as dark.
- **Rye meal / pumpernickel:** keep `ingredient-ref-rye-meal` and its existing TERMIUM-supported aliases. T170 is a flour grade and is not the coarse whole-kernel meal or pumpernickel product.
- **Malted, toasted, or roasted rye flour:** leave these products and candidates unchanged. This review does not infer processing from T170 or equate it with malted or toasted rye.
- **Québec T130 wording:** a Québec retailer currently calls a T130 product `Farine de seigle intégrale Bio T130` and describes that specific product as a more-complete milling [S06]. Do not transfer `farine de seigle intégrale` to T170 or turn it into a global alias; French and Québec product descriptions use the word with differing grade scopes.

## Current catalog, ledger, plan, and archive audit

Read the active Section A checklist around line 1554 of the [shared catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), the live reference and form files, the legacy-import candidate file, the research ledger, all rye-related proposals and batch READMEs, and the bundled recipe package before selecting this candidate. The Section A checkpoint is still open for rye milling grades. Its completed entries already cover whole rye flour, light rye flour, medium rye flour, and rye meal; this proposal does not repeat those decisions. The type-170 identity itself has no prior entry or disposition.

Snapshot at review:

| Source of truth | Read-only result |
| --- | --- |
| Active ingredient references | 1,657 rows; no proposed ID or exact/normalized T170 rye class name or alias |
| Ingredient forms | 125 rows; no rye-T170 form or attached form term |
| Legacy import identities | 61 candidates; no T170 rye candidate or matching legacy identity |
| Research ledger | 2,005 records; no T170 rye-flour record or prior decision |
| Proposal/batch archive | No exact T170 rye identity, alias, proposed ID, or prior class decision found |

The nearest decisions are explicitly preserved rather than reopened: the [medium/dark rye boundary review](wp02-medium-dark-rye-product-boundary-review-20261011.md) accepted medium rye as a name-only grade and held generic dark rye; the [whole-rye flour review](wp02-next-flour-gap-review-20261011-whole-rye-flour.md) added the general whole-rye identity; and the [rye-meal review](wp02-rye-meal-identity-boundary-20261010.md) assigned the coarse/pumpernickel terms to rye meal. No earlier proposal reviewed the French type-170 rye class. The proposed reference ID is unused across the active references, forms, legacy candidates, and ledger.

Proposal-local source IDs are `WP02-SECTION-A-RYE-T170-REVIEW-R275-20261016-S01` through `S06`. All six are distinct and were searched against the research ledger and existing proposal/batch archive before use; none was already assigned. No active JSON, ledger, generated file, plan, roadmap, or batch README has been edited.

## Québec wording and picker effect

OQLF’s `farine de seigle` entry directly pairs that Québec French term with English `rye flour`, but does not name T170 or another numbered rye grade [S05]. The French display `farine de seigle de type 170 (France)` is therefore a transparent catalog construction following existing French type-class displays, not a quoted OQLF term. The Québec T130 product page supplies local evidence that rye grades and the `T130` notation appear in Québec product naming; it does not establish a Québec T170 term or an English equivalent for the proposed full display [S06]. Independent fr-CA review should confirm the French construction before integration.

I projected the proposal against the current `IngredientReferenceSearchIndex` phrase/substring rules in `IngredientSearch.kt`. This is a static read-only projection, not a live app-picker test.

| Query | Current results | With proposed row |
| --- | --- | --- |
| `French type 170 rye flour` | None | Proposed row only |
| `T170 rye flour` / `rye flour T170` | None | Proposed row only |
| `farine de seigle T170` | None | Proposed row only |
| `T170` | None | Proposed row only, by contained type-qualified term |
| `rye flour` | 5 active rye-flour identities | Those 5 plus the proposed class |
| `farine de seigle` | 5 active rye-flour identities | Those 5 plus the proposed class |
| `whole rye flour` | Existing whole-rye-flour row only | Unchanged |
| `dark rye flour` | None | None; no dark alias is proposed |

The broad `rye flour` and `farine de seigle` queries already return several qualified identities. Adding one country-qualified grade adds a clearly named sixth choice; full T170 English and French queries resolve only to the new row. No active T170 class competes for the bare `T170` query at this snapshot. Do not add an unqualified `rye flour`, `whole rye flour`, or `dark rye flour` alias.

## Recipe demand, numeric data, and substitutions

All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched for `T170`, `type 170`, `French type 170 rye flour`, `rye flour T170`, `T170 rye flour`, `farine de seigle T170`, and related wholemeal wording. There were zero candidate-name full-file hits and zero candidate-name ingredient-row hits. The bundled corpus has no rye-containing recipe lines, so no recipe link, recipe amount, measure, or substitution is justified.

The product pages give industrial package sizes and product-specific descriptions. Grands Moulins de Paris lists a 25 kg format and one bakery formula for its own T170 flour [S03]; Moulin de Colagne reports an ash value for its own T170 product [S04]. Neither is a household measure or a transferable recipe behavior for every source-named T170 product. Keep density null, mappings and forms empty, and add no measures, conversions, ash property, extraction percentage, yield, recipe link, or substitution. The sources do not support replacing T170 flour with generic whole rye flour, dark rye flour, rye meal, malted rye flour, or a wheat grade.

## Source register

All sources were checked on 2026-10-16. The source IDs below are proposal-local.

| Source ID | Source and locator | What it supports and does not support |
| --- | --- | --- |
| `WP02-SECTION-A-RYE-T170-REVIEW-R275-20261016-S01` | Dossche Mills, [Whole Meal Rye Flour Type 170](https://www.dosschemills.com/en/assortment/whole-meal-rye-flour-type-170/P3001304), current manufacturer page. | Names the English product and the French phrase `Farine de Seigle T170`; describes it as pure, wholemeal, fine rye flour. This is product-family evidence, not a universal recipe or ash specification. |
| `WP02-SECTION-A-RYE-T170-REVIEW-R275-20261016-S02` | Moulins Bourgeois, [English export flour catalogue, 2024](https://www.moulins-bourgeois.com/wp-content/uploads/2024/10/Catalogue-EN-pays-tiers.pdf), rye section. | Names `Organic Rye T130` as stone-ground rye flour and separately names `Organic Rye T170` as stone-ground wholemeal rye flour. Supports distinct commercial T130 and T170 labels for this French mill; does not define a cross-mill grade threshold. |
| `WP02-SECTION-A-RYE-T170-REVIEW-R275-20261016-S03` | Grands Moulins de Paris, [Farine de seigle T170](https://www.grandsmoulinsdeparis.com/produits/farine-de-seigle-t170-04865), current French producer product page. | Uses `farine de seigle T170` as the product name and legal designation, lists the 25 kg package, and describes a source-specific rye-bread use. Does not establish a Québec display, household measure, or universal formula. |
| `WP02-SECTION-A-RYE-T170-REVIEW-R275-20261016-S04` | Moulin de Colagne, [Millstone Rye T170](https://moulindecolagne.fr/farines/meule-seigle-t170/?lang=en), current French mill product page. | Names `T170 rye flour`; reports ash above 1.50% for this product. The measurement is manufacturer/product-specific and is not proposed as a reusable catalog field. |
| `WP02-SECTION-A-RYE-T170-REVIEW-R275-20261016-S05` | Office québécois de la langue française, [farine de seigle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle), last updated 1982. | Directly pairs the Québec French base term `farine de seigle` with English `rye flour`; does not attest a full type-170 term or cross-country class. |
| `WP02-SECTION-A-RYE-T170-REVIEW-R275-20261016-S06` | Comptoir Saint-Vrac, [Farine de seigle intégrale Bio T130](https://comptoirstvrac.com/product/2091), current Québec retailer page for a product from Coaticook. | Uses the exact local T130 product name and describes that specific product as a more-complete milling. This supports keeping local `intégrale` wording source-specific; it does not name or translate a T170 product. |

## Integration recommendation

Keep the proposed identity and its aliases inactive until an independent fr-CA review accepts the display. Keep all numeric, form, measure, recipe-link, and substitution fields empty. Keep `farine de seigle intégrale` off the row and preserve the existing generic, whole, light, medium, meal, malted, toasted, and dark-rye boundaries.

Root integrated this as a documentation-only hold, checked the Section A item, and added the R275 roadmap entry. No catalog or ledger data changed. No tests, build, or emulator checks were needed. See the [integration README](../batches/wp02-section-a-french-type-170-rye-flour-integration-r275-20261016/README.md).

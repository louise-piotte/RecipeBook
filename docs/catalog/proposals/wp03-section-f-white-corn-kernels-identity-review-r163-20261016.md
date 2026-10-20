# WP03 Section F — white corn kernels identity review (R163)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog JSON, research ledger, generated code, plan, roadmap, recipe, or batch README was changed.
- **Scope:** Dry, food-grade, whole white corn kernels as a grain-market product. This review is separate from R162 blue corn kernels, R161 Chulpe corn, and the already integrated white canjica product.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference: **`white corn kernels / grains de maïs blanc`**. Keep the color class distinct from yellow or mixed field corn, sweet corn, blue corn, white canjica, popcorn, hominy, and milled or prepared products.
- **Prospective reference ID:** `ingredient-ref-white-corn-kernels` (unallocated).
- **Proposal-local source IDs:** `WP03-WHITE-CORN-KERNELS-R163-20261016-S01` through `S05`; all are unallocated. The Montréal retailer URL in S06 is already ledgered under `WP03-CANJICA-R67-20261013-S05` and should be reused without another source entry.

## Identity boundary and naming

The candidate is **dry, food-grade, whole white maize kernels for human food use**. It records a market color class, not one cultivar, hardness type, endosperm type, origin, non-GMO claim, or formal human-food grade. The Canadian Grain Commission's current maize-grading guidance recognizes white, yellow, and mixed classes, and says a sample must be at least 95% of a class to receive the specific white or yellow class [S02]. That grain-grading rule supports a distinct color class; it does not by itself establish food use.

Current Canadian supply evidence fills that gap. Toronto/GTA supplier Allzone lists food-use white corn in grains and cereals, offers a whole-kernel grade, and describes milling, masa, tortilla, grits, and snack uses [S01]. The page is quote-based: lot, origin, crop year, grade tolerances, and availability depend on the confirmed offer. This supports a current Canadian trade listing, not consumer-pack availability or a single universal specification.

Québec grain-sector material identifies yellow, white, and purple kernels and distinguishes grain corn from sweet corn; it also describes grain corn's human-food uses [S03]. A MAPAQ-commissioned 2020 competitiveness study discusses white corn as a separate food-use specialty and lists Mexican-style products, but the specific market figures and demand context it repeats are U.S. evidence, not Québec sales data [S04]. Together these sources support a useful product class without treating every white kernel as a separate cultivar or process.

The proposed English display `white corn kernels` follows the supplier's product name and whole-kernel grade. The Québec French display `grains de maïs blanc` is supported by local French usage: Aliments du Québec lists a Québec-made white-corn arepa and describes it as made from pure white-corn grain [S05]; a Montréal retailer uses the phrase `grains de maïs blanc` for a canjica product [reused source WP03-CANJICA-R67-20261013-S05]. The latter product is canjica and its listing includes `concassée`; it supports the local wording only, not the proposed whole-kernel product boundary. The display is not presented as an OQLF ruling or as an exact label for an unprocessed kernel SKU.

Exclude fresh, frozen, canned, or otherwise sweet corn; planting seed; mixed-color and decorative lots; popcorn; white canjica; nixtamalized hominy; cornmeal, corn grits, flour, masa, and other milled products; and tortillas, chips, or other prepared foods. Do not infer a specific variety or process from white kernel color.

## Proposed reference delta

If accepted, add only this identity row:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-white-corn-kernels` |
| English display | `white corn kernels` |
| Québec French display | `grains de maïs blanc` (local-evidence-supported wording; not an exact whole-kernel package title) |
| English / French aliases | `[]` / `[]` |
| Category | `GRAIN_AND_CEREAL` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

No form row is proposed. The reference itself is scoped to dry whole kernels; the sources do not justify mappings to fresh, cooked, canned, sweet, popped, nixtamalized, or milled corn.

## Existing ownership, source ownership, and archive review

The current package snapshot contains **1,538 ingredient references, 119 forms, 61 legacy-import candidates, 1,883 ledger records, 114 manifest-listed recipe files, and 1,123 structured ingredient rows**. Accent-, punctuation-, case-, and ligature-normalized exact-key checks found no active reference, form, legacy candidate, or ledger record for the proposed reference ID, `candidate-white-corn-kernels`, `white corn kernels`, or `grains de maïs blanc`. The term `maïs blanc` is already a phrase match on `ingredient-ref-canjica-white-maize` (`maïs blanc pour canjica`), so adding the proposed row will intentionally make that short French query return two choices.

Historical Section F proposals, batch notes, the active plan, catalog, forms, legacy import file, ledger, and bundled recipes were checked. The only close white-kernel identity is the existing `white canjica maize / maïs blanc pour canjica`, scoped by MAPA to a partially or fully degerminated Brazilian product. It is not a generic white-corn-kernel identity. The generic `corn kernels / maïs` row remains in `VEGETABLE_AND_AROMATIC`; it has no color qualifier. The R162 `blue corn kernels` row is a separate color-qualified grain class. Neither should be changed.

Exact URL ownership in the active research ledger was checked before drafting:

| Source | Ledger ownership |
|---|---|
| Allzone, Non-GMO White Corn (S01) | No exact URL owner found. |
| Canadian Grain Commission maize classification (S02) | No exact URL owner found. |
| Grains du Québec, maize page (S03) | No exact URL owner found. |
| MAPAQ-commissioned study (S04) | No exact URL owner found. |
| Aliments du Québec, white-corn arepa (S05) | No exact URL owner found. |
| Marché Branche D'Olivier, Canjica Cristal (S06) | Reuse `WP03-CANJICA-R67-20261013-S05`; do not duplicate the URL entry. |

The five proposal-local source IDs S01–S05 are unallocated in the ledger and archive. If accepted, attach them only to the new reference's ledger record; reuse the existing S06 source entry only if needed. No source ID is allocated by this proposal.

## Picker projection

The static projection uses the phrase-first, accent-folded ingredient matching implemented in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including reference and form search terms. It adds the proposed display with no aliases or forms:

| Query | Current → proposed | Result |
|---|---:|---|
| `white corn kernels` | 0 → 1 | New white-corn-kernel identity only. |
| `white corn` | 0 → 1 | New identity only. |
| `grains de maïs blanc` | 0 → 1 | New identity only. |
| `maïs blanc` | 1 → 2 | Adds the new row beside white canjica maize. |
| `corn kernels` | 3 → 4 | Adds white corn beside generic corn kernels, dried sweet corn kernels, and blue corn kernels. |
| `corn` | 29 → 30 | Adds one qualified grain result to the broad English search. |
| `maïs` | 31 → 32 | Adds one qualified result to the broad French search. |
| `maize` | 4 → 4 | Unchanged; no broad or unqualified maize alias is added. |
| `white canjica maize` / `canjica white` | 1 → 1 | Remains on the existing canjica product. |
| `hominy corn` / `hominy grits` | 1 / 1 → 1 / 1 | Existing product owners unchanged. |
| `corn grits` / `cornmeal` | 1 / 1 → 1 / 1 | Existing product owners unchanged. |
| `popcorn` / `blue corn kernels` | 1 / 1 → 1 / 1 | Existing product owners unchanged. |
| `sweet corn` / `dried sweet corn kernels` | 1 / 1 → 1 / 1 | Existing sweet-corn result unchanged. |

This intentionally adds a qualified option to broad corn and kernel queries. It does not add `white maize`, `corn`, `maize`, or `maïs` as aliases, and does not change the exact owner of existing processing-product searches.

## Recipe demand, measurements, forms, and substitutions

All **114 manifest-listed recipe files** and all **1,123 structured ingredient rows** were scanned for white-corn and color-qualified maize terms, including `white corn`, `white maize`, `white corn kernels`, `white maize kernels`, `grains de maïs blanc`, `maïs blanc`, `maiz blanco`, `maíz blanco`, `white canjica`, and `canjica white`. The scan found **zero complete-file string hits, zero ingredient-row hits, and no linked candidate ID**. No recipe link or edit is proposed.

No reusable kitchen measure or density is supported. Allzone's commercial 25 kg / 50 kg bags and bulk-bag options are shipping presentations, not kitchen measures [S01]. Aliments du Québec's 100 g arepa package is a finished product, not a grain portion [S05]. The Montréal canjica package and the separate Yoki canjica 50 g / ⅓ `xícara de chá` label serving belong to the existing white canjica product, whose process differs; neither value transfers to unprocessed whole white corn [reused source WP03-CANJICA-R67-20261013-S05; existing ledger source WP03-CANJICA-R67-20261013-S03]. Do not add observations, package yield, density, unit mapping, dry/cooked form, or cooking yield.

No source reviewed establishes a substitution ratio or recipe context for replacing white corn kernels with yellow or mixed field corn, sweet corn, blue corn, canjica, popcorn, hominy, or a milled maize product. Shared botanical identity or some overlapping downstream uses do not establish recipe interchangeability. Add no global or contextual substitution, form-conversion rule, or recipe-line link.

## Proposed ledger record

If integrated, add one `ingredient_reference` ledger record keyed `ingredient-ref-white-corn-kernels`, with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Register sources S01–S05 on that record, reuse the existing ledger source for the Montréal wording only if required, and leave `measurementObservations` and `substitutionFindings` empty. Record one accepted decision for the dry whole-kernel color class. Do not create a separate candidate record.

## Source register

Pages were checked on 2026-10-16. The IDs are proposal-local except S06, which is an existing ledger source.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP03-WHITE-CORN-KERNELS-R163-20261016-S01** | Allzone Trading, [Non-GMO White Corn](https://allzonetrading.ca/supply/non-gmo-white-corn), current Toronto/GTA supplier page. | Lists white corn as a food-use grain, gives whole kernel as an available grade, and describes masa, tortilla, milling, grits, and snack uses. Source-anywhere, quote-based trade listing; grade, origin, shipment, and availability are not fixed by the page. It supports a product class, not one lot specification or consumer availability. |
| **WP03-WHITE-CORN-KERNELS-R163-20261016-S02** | Canadian Grain Commission, [Maïs : Facteurs de classement](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/17-mais/facteurs-classement.html). | Current Canadian grain guidance distinguishes maize classes white, yellow, and mixed and describes the 95% class threshold. Grain classification evidence only; it does not establish human-food quality or a kitchen use. |
| **WP03-WHITE-CORN-KERNELS-R163-20261016-S03** | Grains du Québec, [Maïs](https://grainsduquebec.ca/nos-grains/mais), current French page. | Says maize kernels can be yellow, white, or purple; distinguishes grain corn from sweet corn; and describes human-food uses. Local terminology and context, not a product standard or source for whole-kernel handling. |
| **WP03-WHITE-CORN-KERNELS-R163-20261016-S04** | MAPAQ-commissioned, [Étude sur la compétitivité des producteurs de grains du Québec — annexe](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/publications-adm/rapport/RA_annexe_competitivite_producteurs_grains_MAPAQ.pdf), 2020, PDF pp. 191–192. | Discusses white corn as a food-use specialty and names tortillas, cornflakes, flour, grits, and hominy. This section explicitly draws on U.S. white-corn market data; do not treat its market shares or demand figures as Québec facts. |
| **WP03-WHITE-CORN-KERNELS-R163-20261016-S05** | Aliments du Québec, [Arepas de maïs blanc](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/arepas-de-mais-blanc), Québec manufacturer listing. | The manufacturer says its prepared arepas are made from pure white-corn grain and lists Québec retail channels. Supports local French food naming and use; the arepa is a prepared 100 g product, not a raw-kernel SKU or measure. |
| **Reused WP03-CANJICA-R67-20261013-S05** | Marché Branche D'Olivier, [Canjica Cristal](https://branchedolivier.com/products/canjica-cristal-400g), Montréal retailer listing. | Product description uses `grains de maïs blanc`. It is a canjica product and the title includes `concassée`; use only as corroboration of local wording, not evidence that the proposed kernels share that process. Exact URL already belongs to the canjica ledger record. |

## Review disposition

Recommend an identity-only white-corn-kernel reference with no aliases or numeric behavior. The evidence supports a currently listed Canadian food-grade whole-kernel market class, a distinct Canadian white maize grade, and locally attested French wording. Preserve the existing white canjica, blue corn, sweet corn, generic corn-kernel, popcorn, hominy, and milled-corn owners. No app or Android tests are proposed for a database-JSON-only implementation, consistent with the updated project rule.

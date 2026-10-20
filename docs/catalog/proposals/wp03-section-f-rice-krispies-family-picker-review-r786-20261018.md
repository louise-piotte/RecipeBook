# WP03 Section F — Rice Krispies family picker review (R786)

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated on 2026-10-18 in the [R785–R787 batch](../batches/wp02-wp03-wp04-r785-r787-gap-review-integration-20261018/README.md); three identity-only family references were added and the existing French source WP03-S88 was refreshed under its original owner.
- **Revisited hold:** [R780](wp03-section-f-next-gap-review-r780-20261018.md) held Rice Krispies Holiday Edition until the complete current family could be reviewed. The hold remains documented in the historical [R779–R781 roadmap entry](../../../roadmap.md#L1511); the active checklist now records the R786 resolution. The current Canadian English and French WK Kellogg family pages list the same three products, so this review resolves that family-level question.
- **Recommendation:** Add the complete three-product family as separate identity-only `GRAIN_AND_CEREAL` references. Keep the existing generic `crispy rice cereal / céréales de riz croustillantes` reference and R291's SKU-specific 1 Canadian label cup (28 g) Rice Krispies observation unchanged.

## Current bilingual family and proposed rows

The current WK Kellogg Canada family pages have a Products section that lists the same three product cards in the same order: Holiday Edition, Spring Edition, and the standard/Original cereal. The English and Canadian French cards provide paired names. The manufacturer marks the product names with `®`; the proposed catalog displays below omit that symbol, consistent with existing catalog wording, while retaining the product names and qualifiers.

| Manufacturer card | Proposed English display | Proposed French display | Proposed ID |
|---|---|---|---|
| Rice Krispies® Holiday Edition Cereal / Céréales Rice Krispies® Édition des Fêtes | `Rice Krispies Holiday Edition Cereal` | `Céréales Rice Krispies Édition des Fêtes` | `ingredient-ref-rice-krispies-holiday-edition-cereal` |
| Rice Krispies® Spring Edition Cereal / Céréales Rice Krispies® Édition printanière | `Rice Krispies Spring Edition Cereal` | `Céréales Rice Krispies Édition printanière` | `ingredient-ref-rice-krispies-spring-edition-cereal` |
| Rice Krispies® Cereal / Céréales Rice Krispies® Originale | `Rice Krispies Cereal` | `Céréales Rice Krispies Originale` | `ingredient-ref-rice-krispies-cereal` |

Each card is a distinct named finished cereal. Keep the three full bilingual titles as separate references, with empty aliases, forms, density, unit mappings, and measurements. The family pages support these names and the cereal-family context only. Do not infer product equivalence, a shared formula, ingredient details, package sizes, serving amounts, or regional availability from the family list. Add no recipe links, conversions, yields, or substitutions.

## Preserve the generic crispy-rice-cereal decision and R291 evidence

The active generic reference remains `ingredient-ref-rice-cereal`: `crispy rice cereal / céréales de riz croustillantes`, with empty aliases, null density, and no unit mappings. Keep its accepted boundary against the Rice Krispies trademark, puffed rice, infant rice cereal, and flattened rice. Do not add `Rice Krispies` or `riz croustillant` as aliases of the generic identity. `WP03-S90` remains on the current generic ledger record and retains its existing trademark-specific scope.

R291's observation `crispy-rice-cereal-rice-krispies-ca-cup-28g-r291-20261016` remains on the existing `ingredient-ref-rice-cereal` ledger record: WK Kellogg Rice Krispies Cereal, GTIN `00064100108271`, reported as 1 Canadian label cup (28 g) for the identified 1,120 g package. Preserve the source and observation as SKU-specific research. It is not a generic mass or mapping, and it must not be copied to any of these three family references. See the [R291 measurement review](wp03-section-f-crispy-rice-cereal-measurement-review-r291-20261016.md).

## Catalog, ledger, source, and path audit

At the time of this review, the live seed snapshot contained 1,870 ingredient references and 193 forms; the research ledger contained 2,272 records. The three proposed IDs and exact bilingual titles are absent from current references and forms. The ledger has no separate Rice Krispies brand-identity record; the Rice Krispies evidence it holds belongs to the generic crispy-rice-cereal research record, including R291's product-specific observation.

Before integration, the R786 path was free, the source-ID prefix `WP03-RK-FAMILY-R786-20261018-` was unallocated, and the English family URL had no ledger owner. The French family URL was already registered as `WP03-S88` on `ingredient-ref-rice-cereal`; integration preserved that URL, ID, and owner and refreshed its locator/support text for the current three-card family list and access date. The English family source is recorded on the three new identity rows; the French URL was not duplicated or reassigned.

The two manufacturer family URLs used for this recommendation are the only new identity evidence. Product-detail claims are outside scope, so no product-detail page or retailer URL is proposed for ledger registration.

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, punctuation, and spacing; prefer complete word-phrase matches; use substring matching only when no phrase match exists. It includes current reference names, aliases, and form terms; it is not live Android picker QA.

| Query | Current | After all three proposed rows | Effect |
|---|---:|---:|---|
| `Rice Krispies` | 0 | 3 | Presents the complete current family as three named choices. |
| `Rice Krispies Cereal` | 0 | 1 | Finds the standard product. |
| `Rice Krispies Spring` | 0 | 1 | Finds Spring Edition only. |
| `Rice Krispies Holiday` | 0 | 1 | Finds Holiday Edition only. |
| `Céréales Rice Krispies` | 0 | 3 | Finds all three French displays. |
| `crispy rice cereal` / `céréales de riz croustillantes` | 1 / 1 | 1 / 1 | The generic recipe ingredient remains the sole exact result. |
| `rice cereal` | 2 | 2 | The two generic/infant rice-cereal identities retain ownership; no brand alias is added. |
| `cereal` / `céréales` | 96 / 93 | 99 / 96 | The three newly named cereals enter broad category queries. |
| `puffed rice` / `riz soufflé` | 1 / 1 | 1 / 1 | Puffed-rice identity remains distinct. |

## Bundled recipe demand

The full manifest corpus contains **114 recipe files and 1,123 structured ingredient rows**. A serialized-file and ingredient-row scan for `Rice Krispies`, both edition names, their French family titles, and related product-name phrases found **0 family-specific files and 0 family-specific ingredient rows**.

Recipe 040 still has one generic row, `6 cups crispy rice cereal`, linked to `ingredient-ref-rice-cereal`. Keep it unchanged and unbranded. This recipe demand supports the existing generic identity only; it is not a brand-specific link or a reason to apply R291's 28 g observation as a recipe conversion.

## Source register

Sources were checked on 2026-10-18. `S01` is a proposed review-local source ID, not an allocated ledger ID.

| Key | Source and locator | Evidence and limit |
|---|---|---|
| `WP03-RK-FAMILY-R786-20261018-S01` | WK Kellogg Canada, [Rice Krispies family page (English)](https://www.wkkellogg.ca/en/our-foods/our-brands/rice-krispies), Products section | Lists Rice Krispies® Holiday Edition Cereal, Rice Krispies® Spring Edition Cereal, and Rice Krispies® Cereal. Supports the current family roster and English card names only; no product-level formula, portion, or equivalence is inferred. The URL was unregistered before integration and is now shared across the three new identity records. |
| `WP03-S88` (existing; original owner preserved) | WK Kellogg Canada, [Rice Krispies family page (French)](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/rice-krispies), Produits section | Lists Céréales Rice Krispies Édition des Fêtes, Édition printanière, and Originale. The existing source entry was refreshed on `ingredient-ref-rice-cereal`; no second French URL entry was added. |

R291's existing SmartLabel source `WP03-CRRICE-R291-20261016-S01` remains with the generic crispy-rice-cereal ledger record. It supports only the 28 g observation for GTIN `00064100108271`; do not use it as a source for the new identity rows or duplicate its URL under another owner.

## Recommendation

**Supersede R780's Holiday-only hold with three separate identity-only cereal references for Holiday Edition, Spring Edition, and the standard/Original product.** Their current bilingual family cards provide exact names and a complete picker boundary. Keep all product-specific facts outside the new rows until a matched product source supports them. Preserve the generic crispy-rice-cereal reference, its recipe link and current decisions, and R291's SKU-specific 28 g observation. Broader Section F identity and terminology work remains open.

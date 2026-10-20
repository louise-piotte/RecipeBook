# WP04 R344: Liquid egg-white form proposal

- **Date:** 2026-10-16
- **Packet:** WP04, Section Q (eggs, dairy, cheeses, and cultured products)
- **Status:** Accepted and integrated on 2026-10-16. See the [R344 integration README](../batches/wp04-section-q-liquid-egg-white-form-integration-r344-20261016/README.md).
- **Recommendation:** Add a form for commercially sold pasteurized liquid egg white under the existing `ingredient-ref-egg-white`. Do not add a new ingredient reference.

## Fit with the open plan

The active [Section Q checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7269) still calls for whole, white, yolk, liquid pasteurized, powdered, salted, and preserved egg coverage. The earlier [duck and quail egg review](wp04-duck-quail-eggs-identity-review-20261009.md) deferred liquid and other processed egg products. The existing [dried egg-white form](wp02-section-e-dried-egg-forms-meringue-powder-integration-review-r249-20261016.md) covers powder only; it does not cover this liquid product.

The current reference package has a generic `egg white / blanc d’œuf` row and a dried egg-white form, but no liquid or pasteurized egg-white form. The unreviewed egg-substitute legacy candidate is a separate product concept and is not a match for pure egg white.

## Proposed catalog entry

Add one identity-only form under the existing egg-white reference:

| Field | Proposed value |
| --- | --- |
| `id` | `ingredient-form-egg-white-liquid-pasteurized` |
| `ingredientRefId` | `ingredient-ref-egg-white` |
| `formCode` | `liquid_pasteurized` |
| `labelEn` | `pasteurized liquid egg white` |
| `labelFr` | `blanc d’œuf liquide pasteurisé` |
| `prepState` | `liquid` |
| `matchTermsEn` | `liquid egg white`; `liquid egg whites`; `pasteurized egg white`; `pasteurized egg whites`; `pasteurized liquid egg whites` |
| `matchTermsFr` | `blanc d’œuf liquide`; `blancs d’œufs liquides`; `blanc d’œuf liquide pasteurisé`; `blancs d’œufs liquides pasteurisés` |
| `densityGPerMl` | `null` |

These match terms belong on the **form**, not the parent reference aliases. That lets a selected, fully qualified phrase return `ingredient-ref-egg-white` with the liquid form hint while leaving generic egg-white queries attached to the same base ingredient.

## Evidence and exact naming claims

| Source | Supported claim and limit |
| --- | --- |
| [CFIA, Canadian Standards of Identity: Volume 2, §4](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-2) and [French version](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-2) | The Canadian standard names `Liquid Egg White` / `Liquid Albumen` and `blanc d’œuf liquide` / `albumen liquide` separately from dried and frozen white and from whole-egg and yolk products. Reuse existing CFIA source allocations `WP02-SECTIONE-DRIED-EGG-MERINGUE-R249-20261016-WHITE-S01` and `WP02-SECTIONE-DRIED-EGG-MERINGUE-R249-20261016-WHITE-S02`, with the liquid-white locator; do not add duplicate source entries for the same standard URLs. The standard identifies product classes, not a household conversion. |
| `WP04-SECTIONQ-LIQUID-EGG-WHITE-R344-20261016-S01` — [Burnbrae Farms, Naturegg Simply Egg Whites (English)](https://www.burnbraefarms.com/en/products/simply-egg-whites/naturegg-simply-egg-whites) | The manufacturer says this product is pasteurized, 100% pure egg white, sold in liquid format, and available in 500 g and 1 kg cartons. It explicitly supports the English terms `liquid egg whites` and `pasteurized egg whites`. Its 33 ml / 2 tbsp per white and carton-equivalent statements are manufacturer-specific; they do not establish a general egg-white mapping or substitution. |
| `WP04-SECTIONQ-LIQUID-EGG-WHITE-R344-20261016-S02` — [Fermes Burnbrae, Naturœuf Que des blancs d’œufs (French)](https://www.burnbraefarms.com/fr/products/simply-egg-whites/naturegg-simply-egg-whites) | The manufacturer uses `Que des blancs d’œufs`, states that the product is pasteurized and 100% pure white, and says it is sold in liquid format. It supports the proposed French phrase family; the manufacturer’s household and carton equivalences remain specific to its products. |
| `WP04-SECTIONQ-LIQUID-EGG-WHITE-R344-20261016-S03` — [Aliments du Québec, Naturoeuf Blancs d’œufs liquides Poules en liberté](https://alimentsduquebec.com/aliments-dici/produits-laitiers-et-substituts/naturoeuf-blancs-doeufs-liquides-poules-en-liberte) | A Québec-prepared product listing gives the exact name `Blancs d’œufs liquides`, identifies the product as pasteurized and 100% egg whites, and lists a 500 g format and retailers. The directory supports Québec product naming and a local-market product; it is not a guarantee of current stock at every listed retailer. |
| `WP04-SECTIONQ-LIQUID-EGG-WHITE-R344-20261016-S04` — [INSPQ, Prévention des infections d’origine alimentaire](https://www.inspq.qc.ca/mieux-vivre/grossesse/alimentation/prevention-infections-alimentaires) | Québec public-health guidance uses `œufs et blancs d’œufs liquides pasteurisés` when discussing raw-egg recipes. This supports the French phrase, not a product formulation or catalog-wide safety instruction. |

OQLF’s [blanc d’œuf entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887662/blanc-doeuf) supports the existing French base term. It does not establish the packaged liquid product; the CFIA and local product sources above do that.

## Catalog ownership, picker behavior, and recipe demand

I inspected the live reference and form JSON plus the phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Its index searches reference names, aliases, and attached form terms; a complete form phrase can return the parent reference and provide a form hint.

In the current package, `liquid egg white`, `liquid egg whites`, `pasteurized egg white(s)`, `blanc d’œuf liquide`, `blancs d’œufs liquides`, and their pasteurized French phrases return no active reference. `egg white` / `egg whites` and `blanc d’œuf` return only `ingredient-ref-egg-white`. The proposed qualified terms therefore fill a true search gap without creating another ingredient owner. After integration, the qualified terms should return that same reference with the new form hint; generic egg-white queries should remain unqualified.

The scan covered all 114 manifest-listed recipe files and 1,123 ingredient rows. No candidate English or French liquid/pasteurized phrase occurs in recipe text or ingredient rows. There are 64 direct linked egg-family rows: 48 whole egg, 8 egg white, and 8 egg yolk. No recipe link or relink is proposed.

## Boundaries and implementation notes

- Keep the form on `ingredient-ref-egg-white`; do not create a parallel liquid-white reference or broaden the generic `egg` or `egg white` aliases.
- Keep whole liquid egg, liquid yolk, formulated egg mixes, egg substitutes, shell eggs, the active dried egg-white form, and frozen egg-white products separate. The CFIA standard names these as distinct product classes.
- The reviewed consumer product examples are pure and pasteurized, but their package sizes and the manufacturer’s 33 ml / 2 tablespoon per-white and egg-equivalent claims are source-specific. Do not create an active volume mapping, density, package yield, cross-form conversion, whole-egg substitution, or recipe link from them.
- Leave broad egg measurement and substitution research on the existing ledger record unchanged. This proposal qualifies the identity/form only.
- Integration delta: add the proposed form object and its bilingual source evidence. The 500 g and 1 kg Burnbrae cartons remain source-specific ledger observations; no active quantity mapping, density, package yield, or substitution rule was added.

## Verification record

The form and ledger record were statically validated with the bundled seed package. No software tests were run for this database-data change; the broader Section Q checklist remains open.

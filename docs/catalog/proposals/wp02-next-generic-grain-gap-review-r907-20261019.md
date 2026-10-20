# WP02 Section A7 R907: canary-seed whole-meal identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, batch, recipe, or code changes were made.
- **Open-plan anchor:** The exact unchecked A7 parent remains “Continue A7 review of other grain meals (including the unresolved wheat-meal candidate) and milling products” ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Selected generic gap:** Whole meal from human-food glabrous canary seed (*Phalaris canariensis*), proposed as `whole canary seed meal / gruau complet d’alpiste des Canaries`.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference, `ingredient-ref-canary-seed-whole-meal`. Keep it distinct from canary-seed groats and canary-seed flour. This is one generic, regulator-recognized milling category, not a commercial-product roster.
- **Scope boundary:** Limit the food identity to dehulled, glabrous (hairless-hull), brown or yellow canary seed intended for human food. Ordinary pubescent bird-feed seed, the hull, and feed-use “canary meal” are outside the proposed identity.

## Recommendation and identity boundary

Health Canada’s English and French assessments enumerate dehulled glabrous canary seed as separate intended food products: whole groat, whole meal, and whole-grain flour. The French assessment names the meal form `gruaux complets`, separately from `farine complète` and `farine de grains entiers`. This supports a distinct whole-meal identity rather than folding the meal into the existing flour or groats rows. [WP03-CANARY-SEED-GROATS-R63-20261013-S01–S02; R907-S01–S02]

The proposed bilingual display is `whole canary seed meal / gruau complet d’alpiste des Canaries`. The French display joins Health Canada’s food-form wording with the Québec species name `alpiste des Canaries`; it is a clear descriptive construction, not a separately standardized OQLF ingredient term. Keep both alias lists empty. In particular, do not add unqualified `meal`, `whole meal`, `alpiste`, or `canary seed` as aliases. The complete bilingual displays already carry the source grain and the milling form.

Keep this identity limited to the named whole-meal product class from glabrous, dehulled human-food seed. The assessment does not specify a universal particle size, extraction rate, milling equipment, or equivalence between whole meal and flour. Preserve those unknowns rather than inventing a grind boundary. Keep separate:

- `canary seed groats`, which are the dehulled kernels before meal production;
- `canary seed flour`, an existing whole-grain flour identity;
- flakes, seed hulls, isolated starch or other extracts, and composite foods;
- pubescent/hairy seed and ordinary bird-feed material; and
- feed-study or aquaculture-use “canary seed meal,” which does not establish human-food culinary use.

Health Canada’s approval and label discussion applies to specified glabrous varieties and the uses assessed. Preserve its wheat-allergy label caution in the source context; do not turn it into a gluten-free, allergen-safety, or general health claim for this catalog row.

## Why this is a generic gap

The active catalog has a canary-seed groats identity and a separate canary-seed flour identity, but no whole-meal identity. Both existing records keep the same Canadian human-food scope and retain their own evidence. The regulator’s generic food-use assessment explicitly distinguishes whole meal from both groat and flour, so adding this one milling identity contributes a source-defined ingredient form instead of counting additional brands or product variants.

The A7 parent remains open for generic milling gaps. R875 already records that further Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal product-only research is out of scope because another commercial product does not add ingredient diversity. Preserve the historical R605 finding and all existing product-specific evidence; do not pursue or transfer that line in this review. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.

## Evidence and source limits

| Source ID | Claim supported | Limit |
|---|---|---|
| **R907-S01** | Health Canada, [Novel Food Information — Glabrous canary seed (*Phalaris canariensis* L.)](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/approved-products/novel-food-information-glabrous-canary-seed-phalaris-canariensis.html). The assessment lists dehulled glabrous seed as whole meal, whole-grain flour, whole groat, and other milled products intended as food ingredients. It also summarizes prototype substitutions. | The whole-meal name is an intended product category; the assessment does not give its particle-size or milling specification, kitchen measure, density, or meal-specific substitution. Prototype replacement percentages stay with the submitted formulations and assessment context. The variety and food-scope limits remain. |
| **R907-S02** | Santé Canada, [Information sur les aliments nouveaux — Graine d’alpiste des Canaries glabre (*Phalaris canariensis* L.)](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/produits-approuves/information-aliments-nouveaux-graine-alpiste-canaries-glabre-phalaris-canariensis.html). Directly distinguishes `gruaux complets`, `farine complète`, and `farine de grains entiers` for dehulled brown/yellow glabrous seed. | This supports the descriptive French construction from official Canadian terminology, not a separate OQLF ruling or exact Québec retail package label. The submitted product prototypes and their quantities are not generalized. |
| **Reused: `WP03-CANARY-SEED-GROATS-R63-20261013-S04`** | OQLF, [alpiste des Canaries (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17498891/alpiste-des-canaries), supports the Québec French name and species *Phalaris canariensis*. | Botanical name only; it does not name a food product or standardize `gruau complet d’alpiste des Canaries`. |
| **Reused: `WP03-CANARY-SEED-GROATS-R63-20261013-S03`** | Canadian Grain Commission, [Canary seed: a novel cereal from the Canadian Prairies](https://grainscanada.gc.ca/fr/recherche-donnees/rapports-scientifiques/canaris/). Supports the glabrous/dehulled human-food boundary and distinguishes groats, flour, and flakes. | Technical cereal overview, not a household measure or whole-meal specification; it is not used to infer a meal grind or meal/flour equivalence. |

The English and French Health Canada approved-product pages are already ledger-owned under `WP03-CANARY-SEED-GROATS-R63-20261013-S01–S02`; the OQLF and Grain Commission sources are also already owned. Reuse those IDs if this proposal is accepted. R907-S01 and R907-S02 are proposal-local source records for the detailed bilingual assessment pages; they were not added to the shared ledger.

## Live ownership and data audit

Read-only snapshot of the current worktree:

| Store | Current state | Finding |
|---|---:|---|
| Ingredient references | 1,934 rows | `ingredient-ref-canary-seed-flour` and `ingredient-ref-canary-seed-groats` are the only exact canary-seed milling identities. No active ID owns the proposed whole-meal identity or either complete target phrase. Preserve both existing rows and their English/French names and aliases. |
| Ingredient forms | 201 forms | No canary-seed form owns the proposed phrase. No form is proposed. |
| Research ledger | 2,337 records; 8 unit conversions | Existing flour and groats records already cite the Health Canada and OQLF evidence. Their source-specific observations, findings, and research states remain unchanged. No whole-meal record or observation exists. |
| Bundled recipes | 114 manifest-listed files; 1,123 ingredient rows | A complete text scan found no canary-seed meal, flour, groats, or alpiste ingredient mention. No recipe link or line change is supported. |

The existing flour ledger contains an approximately 0.6 g/mL bulk-density observation for a hydrothermally treated study flour sample. It is flour-specific, not meal evidence. The flour’s formula trials and all groat/product evidence also remain with their existing records; none is transferred to the proposed meal identity.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the picker normalizes accents, prefers complete word-phrase matches across displays and aliases, then falls back to substring matching. With the proposed display and no aliases:

| Query | Current result | With proposal | Boundary |
|---|---|---|---|
| `whole canary seed meal` / `canary seed meal` | No result | Proposed whole-meal identity | Complete source-grain-qualified phrase. |
| `gruau complet d’alpiste des Canaries` / unaccented equivalent | No result | Proposed whole-meal identity | Complete French display; accent and apostrophe normalization retains the same result. |
| `canary`, `canary seed`, or `alpiste` | Existing flour and groats (2 rows) | Same two plus whole meal (3 rows) | Expected family-level discovery; the new row stays visibly qualified. |
| `canary seed flour` | Existing flour row | Existing flour row | Phrase-first matching keeps flour separate. |
| `canary seed groats` | Existing groats row | Existing groats row | Phrase-first matching keeps groats separate. |
| `gruau complet` | No result | Proposed whole-meal identity | The complete phrase distinguishes it from the existing oatmeal and grain-grits entries. |
| `meal` | Broad existing results | Adds the proposed row only through its full name | No unqualified `meal` alias is added. |

The static projection was calculated against the current reference names/aliases using the current phrase-first, then-substring picker behavior. No existing picker owner changes.

## Proposed data delta for later integration

If accepted, add only this active reference row:

```json
{
  "id": "ingredient-ref-canary-seed-whole-meal",
  "nameEn": "whole canary seed meal",
  "nameFr": "gruau complet d’alpiste des Canaries",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

If integrated, add an identity-only ledger record and keep measurement and substitution research `not_yet_researched`. Add no aliases, forms, observations, density, unit mappings, recipe links, conversions, yields, global rules, contextual rules, or recipe-line substitutions. The current review does not establish a whole-meal household amount or a general replacement relationship. Keep the Health Canada prototype percentages scoped to those submitted food formulations; do not copy the existing flour study’s approximate bulk density onto the meal.

## Decision for integration

1. Add one identity-only `whole canary seed meal / gruau complet d’alpiste des Canaries` row as `ingredient-ref-canary-seed-whole-meal` in `FLOUR_AND_STARCH`, with empty aliases and provisional descriptive French terminology.
2. Scope the identity to dehulled, glabrous brown/yellow *Phalaris canariensis* intended for human food. Keep groats, whole-grain flour, flakes, hulls, extracts, ordinary bird-feed seed, and feed-use meal separate.
3. Preserve every existing canary-seed row and source record. Keep the flour’s study-specific bulk density and formula findings tied to the flour; keep groat evidence tied to groats. Do not merge or transfer their measurements or substitution claims.
4. Add no forms, numeric values, unit mappings, recipe links, conversions, yields, or substitutions. Leave measurement and substitution research `not_yet_researched` pending evidence for this meal identity.
5. Keep the open A7 parent and the generic wheat-meal hold unchanged. Further research limited to the named Anson Mills commercial product remains out of scope because commercial-product counts do not add ingredient diversity; preserve its R605 history and product-scoped evidence.

This file is the only change in this review. No software tests, build, emulator, or deployment were run; this is a proposal-only documentation change.

# WP03 Section I — peanut-butter formulation and picker review (R213)

- **Reviewed:** 2026-10-16
- **Status:** Proposal only. No shared catalog, ledger, generated file, recipe, plan, roadmap, or test was changed.
- **Scope:** The existing `ingredient-ref-peanut-butter` and the open Section I subcheck to record added sugar, salt, oil, and stabilizers when they materially affect culinary behavior. This is distinct from the [2026-10-13 WP07 portion review](wp07-peanut-butter-portion-observation-review-20261013.md), which recorded one USDA portion but did not compare current Canadian product formulations or audit exact picker phrases.

## Recommendation

Keep the single active identity **peanut butter / beurre d'arachide**, category `FAT_AND_OIL`. Do not create separate references or forms for “natural,” “smooth,” “creamy,” or “stabilized” peanut butter. Current products use “natural” for differing formulas: one Québec listing has only roasted peanuts, while a current Canadian manufacturer product titled natural and creamy contains peanuts and salt. Conventional smooth peanut butter can include added sugars, soybean oil, hydrogenated vegetable oil, salt, and mono-/diglycerides. These package-specific ingredients can change sweetness, salt load, oil separation, and handling; they do not establish a universal natural/stabilized split or conversion.

For integration, keep the current displays and French aliases, add English search aliases only for the two exact bundled recipe phrases that the picker currently misses, and add the product evidence to the existing ledger record. Keep “natural” and “creamy” as distinct qualifiers; these search terms do not assert a fixed recipe or product formula.

| Field | Recommended value |
|---|---|
| ID and category | Keep `ingredient-ref-peanut-butter`, `FAT_AND_OIL` |
| English display | Keep `peanut butter` |
| French display | Keep `beurre d'arachide`; OQLF accepts the singular complement, though its preferred term is `beurre d'arachides` |
| English aliases | Keep `natural peanut butter`, `smooth peanut butter`; add `creamy peanut butter`, `natural creamy peanut butter` |
| French aliases | Keep `beurre d'arachide crémeux` and `beurre d'arachide naturel` unchanged |
| Forms | None. Do not create “natural,” “creamy/smooth,” “salted,” or “stabilized” forms from these product labels. |
| New identity | None. Do not promote legacy `ingredient-ref-natural-peanut-butter` as a second reference. |

The proposed English aliases reproduce the exact English wording in recipes 020 and 090. They are picker keys only. Keep the recipe’s original wording so the `creamy` and `natural creamy` qualifiers remain distinct even though the active reference is shared. OQLF prefers `beurre d'arachides` but also accepts the singular complement in the current French display; this packet leaves the French display and aliases unchanged.

## Live ownership and checklist snapshot

A read-only scan of the live package on 2026-10-16 found 1,595 ingredient references, 122 forms, 61 legacy candidates, and 1,940 ledger records with 8,388 source entries. The manifest contains 114 recipes and 1,123 ingredient rows. Repeat the scan before integration if shared package files have changed.

The active row is `ingredient-ref-peanut-butter` with English display `peanut butter`, French display `beurre d'arachide`, English aliases `natural peanut butter` and `smooth peanut butter`, and French aliases `beurre d'arachide crémeux` and `beurre d'arachide naturel`. Its category is `FAT_AND_OIL`; `defaultDensity` is null and `unitMappings` is empty. No active form is attached to this reference.

The legacy import candidate `ingredient-ref-natural-peanut-butter` duplicates the active `natural peanut butter` alias. Keep it unpromoted. The separate `ingredient-ref-peanut-butter-chips` legacy candidate is a baking inclusion and is outside this review.

The existing ledger record has `identityState: unreviewed`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. Its only measurement source is `WP07-PEANUT-BUTTER-20261013-S01`, USDA SR28 NDB 16098: 32.0 g per 2 tbsp for “Peanut butter, smooth style, with salt.” The existing accepted decision correctly keeps this source-specific portion inactive as a generic mapping. This proposal recommends verifying the identity while retaining the current measurement and substitution states.

The active Section I checklist still has open entries for remaining seed identity coverage, useful nut/seed forms, butter/paste coverage, formulation details when they affect culinary behavior, and processing-sensitive kernels. This packet addresses only peanut-butter formulation and picker coverage; it does not close those broader entries.

## Formulation evidence and catalog treatment

| Current product evidence | Product-specific declaration | Culinary implication and limit |
|---|---|---|
| Kraft Smooth Peanut Butter, Québec Food Directory | Select roasted peanuts, soybean oil, sugars (corn maltodextrin and sugar), hydrogenated vegetable oil, salt, mono- and diglycerides. The directory describes a creamy product. | Documents one conventional formula with added sugar, salt, oil, and emulsifiers. Do not assign this list to every `peanut butter` product. |
| Kraft Only Peanuts All Natural Smooth Peanut Butter, Québec Food Directory | “100% Select roasted peanuts”; after opening, refrigerate and stir/store upside down for best texture. | A current natural/smooth product with one listed ingredient and product-specific separation/handling directions. Do not infer that all natural products are unsalted or identical. |
| Adams 100% Natural Creamy Peanut Butter, Canadian manufacturer | Fresh roasted peanuts and a dash of salt; no added sugar. | Confirms “natural” and “creamy” together on a salted Canadian product. It differs from the one-ingredient Kraft example. |

CFIA’s natural-claim guidance gives a general approach but allows companies to use a partially adherent or other evidence-based approach, subject to truthful and non-misleading claims. Therefore, neither `natural` nor `creamy` is a catalog-level ingredient declaration. The ingredient lists and handling directions above are SKU-specific evidence. They show why sugar, salt, oil, and stabilizers can matter in a recipe but do not justify a universal “natural” form or a general formula for this reference.

### Ledger integration recommendation

Add the proposal-local sources below to `ingredient-ref-peanut-butter` and mark its identity verified. Record a bounded decision: the reference covers the general ground-roasted-peanut spread; exact sugar, salt, added oil, and stabilizer state remains product-specific; keep no active formulation form or cross-product substitution.

The two Québec product labels each state 1 tbsp (15 g). Add them as source-specific published-portion observations for those exact products only, separate from the current USDA 2 tbsp (32 g) observation. The three observations do not establish an active mass-volume mapping, density, tablespoon convention, or transferable fill method. Leave active `defaultDensity: null` and `unitMappings: []`; keep `measurementState: researched_supported`.

No product label or source tests a recipe substitution. Leave `substitutionResearchState: not_yet_researched`; add no substitution rule between natural, conventional, creamy, or smooth peanut butter.

## Recipe demand

The manifest scan found seven ingredient rows already linked to `ingredient-ref-peanut-butter`. Preserve all original text, quantities, and links; do not add forms or recipe links.

| Recipe row | Bundled ingredient text | Existing owner |
|---|---|---|
| `001#9` | `1 tbsp peanut butter` (`ingredientName: natural peanut butter`) | `ingredient-ref-peanut-butter` |
| `020#10` | `1/2 cup creamy peanut butter` | `ingredient-ref-peanut-butter` |
| `022#1` | `240 g smooth peanut butter` | `ingredient-ref-peanut-butter` |
| `031#5` | `peanut butter` | `ingredient-ref-peanut-butter` |
| `067#3` | `1/2 cup natural peanut butter` | `ingredient-ref-peanut-butter` |
| `090#2` | `1/2 cup natural creamy peanut butter` | `ingredient-ref-peanut-butter` |
| `095#11` | `2 tbsp peanut butter` | `ingredient-ref-peanut-butter` |

Recipe `065` mentions peanut butter as an optional flavouring example in notes; its ingredient row is a generic flavoring and is not a linked peanut-butter demand. No other peanut-butter ingredient row appeared in the 114-recipe package.

The recipe quantities mix volume and mass, while the active ledger has only the bounded USDA portion noted above. The two Québec package servings do not establish recipe conversions. No amount normalization or substitution is recommended.

## Picker impact

The current picker uses `IngredientReferenceSearchIndex` in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), indexing active bilingual reference names, aliases, and attached form terms. It returns complete phrase matches before substring fallback. The legacy candidate file is not part of this picker index.

A static projection against the current 1,595 references and 122 forms shows:

| Query | Current picker owner | After proposed aliases |
|---|---|---|
| `peanut butter`, `natural peanut butter`, `smooth peanut butter` | `ingredient-ref-peanut-butter` | Same |
| `beurre d'arachide`, `beurre d'arachide crémeux`, `beurre d'arachide naturel` | `ingredient-ref-peanut-butter` | Same |
| `creamy peanut butter` | No result | `ingredient-ref-peanut-butter` |
| `natural creamy peanut butter` | No result | `ingredient-ref-peanut-butter` as its own exact alias; do not generalize it to `natural peanut butter` or `creamy peanut butter` |

These additions resolve the two exact English recipe phrases while keeping one picker result. The French display and aliases remain unchanged. No Android picker run was performed; this is a static projection of the current search code and seed terms.

## Proposal-local sources

Source IDs below were checked against the live ledger and proposal archive on 2026-10-16. The prefix `WP03-I-PB-FORMULATION-R213-20261016` and the listed URLs have no current ledger owner; these are proposal IDs only and have not been written to the ledger.

| Source ID | Source and locator | Claim used and boundary |
|---|---|---|
| `WP03-I-PB-FORMULATION-R213-20261016-S01` | CFIA, [Method of production claims on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/method-production-claims), “Nature, natural,” outcome-based approach, and substantiation sections. | Current guidance says food claims must be truthful and substantiated; companies may follow, partially follow, or support another evidence-based approach to “natural.” It does not define this peanut-butter product’s ingredient list. |
| `WP03-I-PB-FORMULATION-R213-20261016-S02` | OQLF, [beurre d'arachides (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360854/beurre-darachides), definition and preferred terms. | Defines a spread of roasted, ground peanuts; prefers `beurre d'arachides`, accepts the complement `d'arachide` in the singular, and discourages `beurre de pinotte` / `beurre de peanut` in neutral Québec writing. Supports retaining the current singular display as valid; no French alias change is proposed. |
| `WP03-I-PB-FORMULATION-R213-20261016-S03` | Québec Food Directory, [Kraft Smooth Peanut Butter, 2 kg](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202968), ingredients, serving, and product-description fields; last updated 2026-08-27. | Lists the ingredients above and 1 tbsp (15 g). The record identifies GS1 as the product-data source, so use it as current SKU-label evidence, not as a universal formula or measure. |
| `WP03-I-PB-FORMULATION-R213-20261016-S04` | Québec Food Directory, [Kraft Only Peanuts All Natural Smooth Peanut Butter, 750 g](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8243091), ingredients, storage, serving, and product-description fields; last updated 2026-10-01. | Lists 100% roasted peanuts, stir/refrigerate directions for best texture, and 1 tbsp (15 g). The directory attributes product data to GS1. These claims apply to this SKU only. |
| `WP03-I-PB-FORMULATION-R213-20261016-S05` | Adams Canada, [100% Natural Creamy Peanut Butter](https://www.adamspeanutbutter.ca/en/peanut-butter/creamy), product title and ingredient description. | Supports the current English product wording and one Canadian formula of roasted peanuts plus salt, with no added sugar. No universal composition or recipe conversion is inferred. |
| `WP03-I-PB-FORMULATION-R213-20261016-S06` | Adams Canada, [Beurre d'arachide crémeux Adams 100 % naturel](https://www.adamspeanutbutter.ca/Fr/Produits/Beurre-Darachide-Cremeux-Adams-Naturel), product title and ingredient declaration. | Supports Québec French product wording and the same maker’s peanuts-plus-salt formula. It is source wording for a named product, not a ruling that all natural peanut butter contains salt. |

## Remaining checklist status

If accepted, record the formulation review as complete for peanut butter only and retain the broader `[ ]` for formulations of other nut/seed butters and pastes. Do not mark the broader butter/paste, forms, remaining seed-identity, or processing-sensitive-kernel entries complete. No shared catalog data, recipe links, roadmap, plan, tests, or emulator work is included in this proposal.

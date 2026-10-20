# WP03 Section F — cream-of-barley cereal identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** integrated on 2026-10-12 as `ingredient-ref-cream-of-barley-cereal`; all five source IDs below were added to the research ledger. No recipe or numeric behavior changed.
- **Scope:** one marketed barley hot-cereal product identity and its exact English / Québec French naming boundary.
- **Recommendation:** integrate one identity-only `GRAIN_AND_CEREAL` reference as **`cream of barley cereal / crème d’orge`**, with no aliases, forms, recipe links, or numeric behavior. The current Québec manufacturer uses *crème d’orge* for a breakfast cereal, and a current U.S. manufacturer lists *Cream of Barley Cereal*. These are product-name attestations, not evidence that all products share a grind, ingredient specification, or cooking behavior.
- **Plan context:** the active Section F checklist still calls for broader review of regional cereal mixes and preprocessed-grain products ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L9343)). No focused `cream of barley` / `crème d’orge` identity proposal or batch was found. A prior barley-flakes packet rejected generic `barley cereal` as an alias for barley flakes because it is broader than that flake product; this proposal does not add that alias or merge cereal products. It reviews the distinct full product name *cream of barley cereal*.

## Pre-integration package snapshot at review time

Read-only counts at review time:

| Artifact | Count |
|---|---:|
| Active ingredient references | 1,262 |
| Ingredient forms | 94 |
| Legacy import candidates | 66 |
| Research-ledger records | 1,571 |
| Manifest-listed recipes | 114 |
| Ingredient rows in those recipes | 1,123 |

## Proposed identity and product boundary

| Proposed field | Decision |
|---|---|
| ID | `ingredient-ref-cream-of-barley-cereal` (unallocated) |
| English display | `cream of barley cereal` |
| Québec French display | `crème d’orge` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | None |
| Recipe links | None; the full bundled corpus has no matching phrase or barley ingredient row |
| Forms, density, unit mappings, measurements, conversions, yields, substitutions | None |

The proposed reference is limited to a dry cereal product marketed by the complete name *cream of barley cereal* / *crème d’orge* for breakfast preparation. It does not define a generic `barley cereal` ingredient, a barley-meal grind, or a particular particle size or production process. Keep the complete product qualifier in the display.

Keep this product separate from barley flakes; hulled, pearl, and pot barley; barley flour, whole barley flour, malted barley flour, and roasted barley flour; puffed barley; and the unresolved generic barley-meal candidate. Also keep it separate from cream of rice and cream of wheat hot cereals, creamy buckwheat cereal, rolled oats, and prepared porridge dishes. Similar breakfast use does not establish equivalent grain processing or recipe substitution.

The Québec producer's page does not give an ingredient declaration or particle-size specification. The English manufacturer describes a barley cereal product and identifies its own barley product range, but those details do not establish a shared manufacturing spec across brands. The identity therefore records the source-attested market name only; it does not claim that all products sold under the name are interchangeable or physically identical.

## Exact active, form, legacy, and ledger ownership

The audit used the repository's `normalize_search_key` function for exact normalized keys across live reference displays and aliases, form labels and match terms, all legacy candidates, and the full research ledger. Exact-key ownership is reported separately from the picker’s phrase-inside-longer-name behavior.

| Phrase family / record | Active reference owner | Form owner | Legacy owner | Ledger state |
|---|---|---|---|---|
| `cream of barley cereal`, `cream of barley`, `crème d’orge`, `crèmes de céréales d’orge` | None; no active reference has an exact normalized display or alias key. | None. | None. | No exact phrase, source ID, or `ingredient-ref-cream-of-barley-cereal` record. |
| `barley flakes / flocons d’orge` | `ingredient-ref-barley-flakes`, `GRAIN_AND_CEREAL`; no aliases. | None. | None. | Accepted identity `ingredient-ref-barley-flakes`; no measurement or substitution values were supported. |
| `barley flour / farine d’orge` | `ingredient-ref-barley-flour`, `FLOUR_AND_STARCH`; no aliases. | None. | None. | Accepted as a distinct flour identity. |
| `hulled barley / orge mondé` | `ingredient-ref-hulled-barley`, `GRAIN_AND_CEREAL`; no aliases. | None. | None. | Accepted grain identity. |
| `pearl barley / orge perlé` | `ingredient-ref-pearl-barley`, `GRAIN_AND_CEREAL`; no aliases. | None. | None. | Accepted grain identity. |
| `pot barley / orge en pot` | `ingredient-ref-pot-barley`, `GRAIN_AND_CEREAL`; English alias `Scotch barley`, no French aliases. | None. | None. | Accepted separate processing identity; `orge mondé(e)` remains excluded because it collides with hulled barley. |
| `puffed barley / orge soufflée` | `ingredient-ref-puffed-barley`, `GRAIN_AND_CEREAL`; no aliases. | None. | None. | Accepted identity-only human-food product. |
| `malted barley flour / farine d’orge maltée` | `ingredient-ref-malted-barley-flour`, `FLOUR_AND_STARCH`; English alias `malt barley flour`. | None. | None. | Accepted, separate from general barley flour and malt extract/syrup. |
| `roasted barley flour / farine d’orge torréfiée` | `ingredient-ref-roasted-barley-flour`, `FLOUR_AND_STARCH`; English alias `toasted barley flour`. | None. | None. | Accepted separate flour product. |
| `whole barley flour / farine d’orge entière` | `ingredient-ref-whole-barley-flour`, `FLOUR_AND_STARCH`; no aliases. | None. | None. | Accepted separate flour product. |
| `barley meal` | No active reference. | None. | No legacy candidate. | `candidate-barley-meal` is `needs_clarification`, with two unresolved decisions: Canadian sources use the phrase for both ground whole barley and cross-cut pieces, and no exact Québec French product name distinguishes it from flour or cracked barley. Keep it unresolved; this proposal does not resolve or alias it. |

There is no unqualified active `barley` / `orge` row. No active form or legacy candidate contains a barley/orge term. The proposed ID and proposal-local source IDs below were checked absent from the active package and current ledger. The ledger's existing cream-of-rice and cream-of-wheat identities are adjacent product-class precedents, not evidence for barley wording: `ingredient-ref-cream-of-rice-hot-cereal` and `ingredient-ref-cream-of-wheat-hot-cereal` are each accepted identity-only rows with no forms or numeric behavior.

### Picker phrase boundary

`IngredientSearch.kt` first returns complete normalized word phrases contained in longer indexed terms, then falls back to substring matching. The following are source-code behavior assessments, not live picker QA:

- `cream of barley` and `cream of barley cereal` match the proposed full English display; accent-folded `crème d’orge` matches the proposed French display.
- A query for `barley cereal` also matches the proposed display because those words appear contiguously in the complete source-backed name. The result remains labeled **cream of barley cereal**; no bare `barley cereal` alias is added to the barley-flakes identity or elsewhere.
- Bare `barley` and `orge` are broad queries. They match the existing qualified barley identities listed above, plus the proposed row after integration. Their results retain the grain/product qualifiers.
- `barley meal` remains unallocated in the active picker. It is not an alias of this marketed cereal, barley flour, or barley flakes.
- `cream of rice`, `cream of wheat`, and creamy-buckwheat cereal remain separately qualified product names.

## Recipe-corpus demand audit

All 114 manifest-listed recipe JSON files were scanned in their full serialized contents, including every ingredient row. The scan covered the candidate names plus nearby English and French barley product boundaries.

| Phrase group | Recipe files with a hit | Ingredient rows with a hit |
|---|---:|---:|
| `cream of barley`, `cream of barley cereal`, `cream of barley hot cereal`, `crème d’orge`, `crèmes de céréales d’orge`, `barley porridge`, `orge à déjeuner`, `orge chaude` | 0 / 114 | 0 / 1,123 |
| `barley meal`, `barley flakes`, `barley flour`, `hulled barley`, `pearl barley`, `pot barley`, `puffed barley`, `orge mondé`, `orge perlé`, `orge en pot`, `flocons d’orge`, `farine d’orge`, `orge moulue`, `orge concassée` | 0 / 114 | 0 / 1,123 |

There are no barley/orge ingredient rows in the current bundled corpus. No recipe link, amount, or text change is recommended; integration would fill a source-backed catalog gap rather than answer current seed-recipe demand.

## English and Québec French evidence; source limits

The French name is directly attested by a current Québec product manufacturer. Moulin Abénakis sells **Crème d’orge biologique** and describes it as a breakfast option; the page provides preparation directions and lists 300 g and 10 kg formats. The Aliments du Québec product registry separately lists **Crèmes de céréales - d’orge biologique**, identifies Moulin Abénakis, places it in “Céréales et granola,” and lists Québec retailers. These sources establish a current Québec market product and its French product wording. They do not constitute an OQLF/TERMIUM terminology ruling or disclose the Québec SKU's ingredient statement, grind, or exact grain structure.

For English, Alaska Flour Company currently lists a product titled **Cream of Barley Cereal**. The Alaska Department of Commerce's Alaska Made Products registry lists “cream of barley cereal” among products made of 100% Alaska-grown barley and categorizes the business's output under food grain products. This is direct English product naming and official state-market context; it is not Canadian or Québec terminology evidence. Alaska Flour Company's broader whole-grain / stone-ground statements are brand-specific and are not generalized to the Québec product or every cereal sold under this name.

No specific OQLF or TERMIUM entry for this hot-cereal name was found in the bounded search. Use `crème d’orge` as source-attested Québec product wording, not as an official standardized term. Do not add `gruau d’orge`, `orge moulue`, `orge concassée`, `semoule d’orge`, `farine d’orge`, or `barley meal` as aliases: the reviewed evidence does not establish these as interchangeable names for this marketed cereal.

## Numeric, form, and substitution limits

- Moulin Abénakis gives product-specific directions: boil 1 cup liquid, whisk in 3–4 tablespoons of *crème d’orge*, simmer 3–5 minutes, then rest 1–2 minutes. These instructions are not a reusable household measure or a general ratio for all products sold as cream of barley.
- Its 300 g and 10 kg are manufacturer package formats, not recipe yields, standard package sizes, or measurement conversions.
- No source establishes a general serving mass, cup/spoon-to-mass conversion, density, unit mapping, particle-size boundary, dry-to-prepared yield, or standardized preparation time. Keep `defaultDensity` null and `unitMappings` empty.
- Add no ingredient form: the marketed cereal identity does not provide evidence for reusable coarse/fine, dry/cooked, instant, or other form values.
- Add no global or contextual substitution between this cereal and barley meal, barley flakes, hulled/pearl/pot barley, cream of rice, cream of wheat, buckwheat cereal, or oats. Breakfast use alone is not a tested interchangeability rule.

## Source register

Sources were reviewed on 2026-10-12. Proposal-local source IDs were checked absent from the current ledger.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-CBARLEY-20261012-S01` | Moulin Abénakis, [Crème d’orge 100% biologique](https://moulinabenakis.com/products/creme-orge-bio), product page. | Québec manufacturer calls the product *crème d’orge biologique*, describes breakfast use and creamy texture, provides product-specific cooking directions, and lists package formats. It does not state an ingredient list, exact milling process, particle size, or a general conversion. |
| `WP03-CBARLEY-20261012-S02` | Aliments du Québec, [Crèmes de céréales - d’orge biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/cremes-de-cereales-dorge-biologique), product registry. | Identifies the Moulin Abénakis product under cereal/granola, gives the French market title, retailer list, and formats. Product registry evidence is not an OQLF terminology decision or a detailed specification. |
| `WP03-CBARLEY-20261012-S03` | Alaska Flour Company, [Cream of Barley Cereal](https://alaskaflour.com/products/16oz-cream-of-barley-cereal), current product page. | Direct English product title for a marketed cereal. The page provides little technical detail and does not establish a Canadian French name or a general process. |
| `WP03-CBARLEY-20261012-S04` | Alaska Department of Commerce, Community, and Economic Development, [Alaska Made Products — Alaska Flour Company](https://www.commerce.alaska.gov/dcra/akmadeproducts/business/Details/76e93a9d-87e6-4bf2-a458-111bcab07383), business/product listing. | Official state listing names cream of barley cereal among the company's products made of Alaska-grown barley and classifies the output as food grain products. It does not set Canadian terminology, preparation, or a general product specification. |
| `WP03-CBARLEY-20261012-S05` | Alaska Flour Company, [A Letter to Our Customers](https://alaskaflour.com/pages/a-letter-to-our-customers), company process statement. | Says the company's barley products are stone-ground and whole-grain. This applies to the company's own product range only; it is not transferred to the Moulin Abénakis product or used to define all cream-of-barley cereal. |

## Decision

**Accepted and integrated as identity-only `ingredient-ref-cream-of-barley-cereal`: `cream of barley cereal / crème d’orge`.** Keep aliases, forms, recipe links, density, unit mappings, measurements, conversions, yields, and substitutions empty. The current picker returns this full qualified display for `barley cereal`; bare `barley` and `orge` still match multiple qualified barley products. Preserve the existing barley-flakes identity and the unresolved generic barley-meal candidate. The English and French names are supported as current product-language evidence; the French display is not an official terminology-authority ruling. Section F remains open. See [`wp03-section-f-cream-of-barley-cereal-integration-20261012/README.md`](../batches/wp03-section-f-cream-of-barley-cereal-integration-20261012/README.md).

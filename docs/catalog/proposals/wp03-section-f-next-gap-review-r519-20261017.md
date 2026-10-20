# WP03 Section F R519 — Post Honeycomb cereal identity review (2026-10-17)

## Scope and recommendation

The open [Section F cereal and preprocessed-grain review](../../RecipeBook-global-ingredient-catalog-plan.txt#L15610) still calls for distinct, source-backed identities. After the [R516 Sugar Crisp decision](wp03-section-f-next-gap-review-r516-20261017.md) and the R517/R518 integrations, this review selects one separate current Canadian packaged cereal: Post Honeycomb. This is not a repeat of the Sugar Crisp, cereal-family, or cereal-measurement reviews.

**Recommend one bilingual, identity-only `GRAIN_AND_CEREAL` reference for the named Honeycomb cereal.** Keep it distinct from honey, corn and oat ingredients, puffed grains, and honeycomb candy/topping. Add no aliases, forms, package or household measures, mappings, density, conversions, yields, recipe links, or substitutions.

The live review snapshot is **1,792 references / 143 forms / 56 legacy candidates; 2,149 ledger records / 9,863 source entries / 8,347 distinct source IDs / 7,057 distinct URLs**. The [R517 proposal](../../catalog/proposals/wp04-section-p-next-seafood-review-r517-20261017.md) and [R518 proposal](../../catalog/proposals/wp06-african-next-regional-review-r518-20261017.md) document those adjacent integrations.

## Product identity and exact proposed fields

Post Consumer Brands Canada currently presents Honeycomb as a finished corn-and-oat cereal. Its English product page says “Original Honeycomb,” lists 400 g and 525 g boxes, and describes the ingredients. The Canadian French product page calls it “Honeycomb,” refers to “les céréales Honeycomb,” and lists the same sizes. Mayrand’s Québec listing calls the 400 g unit “Céréales miel Honeycomb,” provides unit UPC 628154138983, and showed stock at several Québec locations when reviewed. These sources support a local, named product identity; they do not establish that the retailer's descriptor is a preferred generic French name.

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-honeycomb-cereal` |
| English display | `Honeycomb cereal` |
| French display | `Céréales Honeycomb` |
| Category | `GRAIN_AND_CEREAL` |
| English aliases | `[]` |
| French aliases | `[]` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms and recipe links | None |
| Measures, conversions, yields, substitutions | None |

The English name combines the manufacturer’s Honeycomb product name with the food class. The French display follows the Canadian manufacturer’s French-language wording “céréales Honeycomb”; it is a descriptive Québec-facing label, not an OQLF ruling. Do not activate `Original Honeycomb`, `Post Honeycomb`, or `Céréales miel Honeycomb` as aliases: they are not needed to identify the product in the picker, and the latter two-token/descriptor wording could make broad `original` or `céréales miel` searches resolve to this single product. The retail phrase remains source evidence only.

The manufacturer’s ingredient panel shows a formulated cereal made from corn flour and oat flour, with sugars including honey and other ingredients. Do not alias the product to corn cereal, puffed corn, oats, honey, or plain honeycomb. The word “honeycomb” in earlier syrup proposals refers to a topping texture/recipe, not this cereal.

## Ownership and archive audit

The read-only audit covered the current [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), the plan, roadmap, prior proposals and batches, and the complete manifest-listed recipe corpus.

Normalized identity and ID checks found no active reference, form, or legacy candidate for `Honeycomb`, `Honeycomb cereal`, `Post Honeycomb`, `Céréales Honeycomb`, or `ingredient-ref-honeycomb-cereal`. There is one unrelated ledger occurrence: `ingredient-ref-dark-corn-syrup` cites a French recipe for a honeycomb-textured topping. It has no Honeycomb cereal identity or matching product source. An archive search found no prior Honeycomb-cereal decision; its only earlier proposal mentions are the syrup/topping boundaries above.

All three source IDs below are absent from the current ledger, and all three exact URLs are unowned there. The whole-ledger audit found zero source IDs mapped to multiple URLs. Each proposed ID maps to exactly one URL:

| Source ID | One URL | Evidence and limits |
|---|---|---|
| `WP03-POST-HONEYCOMB-CEREAL-R519-20261017-S01` | Post Consumer Brands Canada, [Original Honeycomb](https://www.postconsumerbrands.ca/brand/honeycomb/original-honeycomb/) | Current Canadian manufacturer product page; names Original Honeycomb, lists 400 g and 525 g boxes, and shows its ingredients. It cautions that product formulas can change. |
| `WP03-POST-HONEYCOMB-CEREAL-R519-20261017-S02` | Post Consumer Brands Canada, [Originale — Honeycomb (French-Canadian page)](https://www.postconsumerbrands.ca/fr-ca/marques/honeycomb-fr/originale/) | Current Canadian French page; calls the product Honeycomb, uses “les céréales Honeycomb,” and lists 400 g and 525 g boxes. It supports the French descriptive display, not a terminology ruling. |
| `WP03-POST-HONEYCOMB-CEREAL-R519-20261017-S03` | Mayrand, [Céréales miel Honeycomb 400 g](https://mayrand.ca/fr/nos-produits/epicerie/cereales-et-barre/cereales/cereales-honey-comb-post-06993) | Québec-facing listing, item 06993, 400 g unit, UPC 628154138983, with stock status shown at three Québec locations. Stock and listing details are time-sensitive; the 400 g package is not a household measure. |

Integration registered those three sources and one accepted identity decision on the new reference’s research-ledger record. Identity is `verified`; measurement is `researched_no_supported_value`, and substitution research remains `not_yet_researched`. No numeric observation was created: package sizes do not establish household measures, and neither manufacturer page exposes a paired household volume and mass here.

## Phrase-first picker projection

This static projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, punctuation, and spacing; search complete word phrases across display names, aliases, and linked form terms first; use substring fallback only when there are no phrase matches. The proposed row has no aliases or forms.

| Query | Current | With proposal | Projection |
|---|---:|---:|---|
| `Honeycomb`; `Honeycomb cereal`; `Céréales Honeycomb` | 0; 0; 0 | 1; 1; 1 | Each resolves to `ingredient-ref-honeycomb-cereal`. |
| `Original Honeycomb`; `Post Honeycomb` | 0; 0 | 0; 0 | Neither is an alias; `Honeycomb` alone is searchable. |
| `Céréales miel Honeycomb`; `céréales miel` | 0; 0 | 0; 0 | The retailer’s longer descriptor is not activated as an alias. |
| `honey`; `miel` | 8; 6 | 8; 6 | Unchanged; `honeycomb` is one word and is not a honey alias. |
| `cereal`; `céréales` | 57; 53 | 58; 54 | Each broad category query gains the new named cereal. |
| `puffed corn`; `honey corn cereal` | 0; 0 | 0; 0 | No puffed-corn or component aliases are added. |

These are static projections against the live reference/form data, not runtime picker tests.

## Recipe corpus scan

All **114** recipe files named in the current package manifest were parsed: **1,123** structured ingredient rows and **753,988** exact recipe-file bytes. The manifest-ordered corpus SHA-256 is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`; the digest hashes each manifest-relative path as UTF-8, a NUL byte, exact recipe-file bytes, then a NUL byte.

Full-file and ingredient-row scans for `Honeycomb`, `honeycomb cereal`, `Post Honeycomb`, `Céréales Honeycomb`, and the proposed reference ID found **zero matching files and zero matching ingredient rows**. The bundle supplies no candidate-specific demand, amount, or recipe link.

## Evidence limits and data boundaries

The manufacturer pages support a current Canadian cereal product, while the Mayrand listing supports Québec-facing availability and one 400 g presentation. The manufacturer warns that ingredients and formula can change; retailer inventory may also change. The French display is supported by manufacturer usage in French and corroborated by a Québec retailer descriptor, but is not a standardized term. Do not infer that every Honeycomb-branded product in other markets has the same formula, package, or French name.

No form or numeric behavior follows from the product’s corn/oat composition, box weights, or retailer UPC. The available evidence does not support an ingredient-to-ingredient substitution with other cereals, honey, corn, or oats. No matching bundled recipe supplies contextual substitution evidence.

## Static checks and testing rule

At proposal review, this file was the only proposed change. It was checked as UTF-8 without BOM with resolving local links. Source IDs and URLs were checked against ledger ownership; picker results were projected from the current implementation’s search terms; the full manifest corpus and fingerprint are recorded above.

The recommendation was accepted and integrated into the reference JSON, research ledger, and generated Kotlin catalog index. Static package, ledger/source-ownership, generated-index, picker, corpus, and documentation checks are recorded in the [R519 integration README](../batches/wp03-section-f-honeycomb-cereal-identity-integration-r519-20261017/README.md). No software tests, build, emulator, or deployment were run because this change only adds database JSON data under `AGENTS.md`.

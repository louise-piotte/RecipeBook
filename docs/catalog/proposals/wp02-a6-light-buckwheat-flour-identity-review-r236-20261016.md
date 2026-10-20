# WP02 Section A6 light buckwheat flour identity review — R236 — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Submitted proposal-only; root accepted and integrated the recommendation. The proposal file itself did not edit shared data. See the [R236–R237 integration README](../batches/wp02-wp03-r236-r237-gap-review-integration-20261016/README.md).
- **Scope:** One remaining named milling product surfaced by the WP02 Section A6 dark buckwheat flour review: light buckwheat flour.
- **Checklist:** [WP02 Section A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1598). Keep the parent item open.
- **New source-ID namespace:** `WP02-A6-LIGHT-BUCKWHEAT-FLOUR-R236-20261016-S01` through `S05`. The proposed IDs and source URLs were checked against the current ledger; none is already registered.

## Recommendation

**Add one identity-only reference: `light buckwheat flour / farine pâle de sarrasin`.** A Québec manufacturer lists the English and French names for the same 20 kg product under the same SKU (`056142006851`). The manufacturer’s current product range separately lists pale/light, gray/dark, and whole buckwheat flour; Aliments du Québec lists the pale French product under Moissonneries du Pays and names Québec retailers. This supports a real Canadian/Québec product identity and an exact local French display. It does not establish a universal light-flour class or a transferable milling specification. [S01–S04]

Keep the identity limited to the source-named product. The product pages call it fine-ground, stone-ground, made by processing whole grain, and not refined; their wording does not explain a technical difference between pale and gray flour. The product page also gives the same broad milling description for gray flour. Do not infer dehulling, extraction rate, ash content, colour threshold, or equivalence to white, whole, generic, or Tartary buckwheat flour. Do not add `T60`, `organic`, the package size, or the longer product title as aliases. The manufacturer’s `T60` descriptor also appears on its separately named dark product and is not established as a general buckwheat grade. [S01–S02, S05; reused R161 S01–S02]

Keep the active generic buckwheat-flour, dark/gray buckwheat-flour, sprouted buckwheat-flour, and Tartary buckwheat-flour identities unchanged. In particular, the source-qualified name does not justify moving `farine de sarrasin vert biologique` from the Tartary row, or adding `whole buckwheat flour`, `light buckwheat flour` or `farine pâle de sarrasin` to another row. No alias, form, measure, density, mapping, recipe link, conversion, yield, or substitution is proposed.

### Proposed reference JSON delta

```json
{
  "id": "ingredient-ref-light-buckwheat-flour",
  "nameFr": "farine pâle de sarrasin",
  "nameEn": "light buckwheat flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

If accepted, add one `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Keep `measurementObservations` and `substitutionFindings` empty. The package weights and product-use suggestions below are not reusable ingredient measurements or substitution evidence.

## Current ownership and prior-work audit

The read-only live snapshot contains **1,628 ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,973 research-ledger records**. The seed manifest lists **114 recipe files and 1,123 structured ingredient rows**.

Exact normalized ownership checks covered active reference IDs, names and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; and ledger record IDs. Normalization follows `IngredientSearch.kt` (lowercase NFKD, accent and compatibility folding, punctuation-to-space, and whitespace collapse). No exact owner was found for:

- `ingredient-ref-light-buckwheat-flour`
- `light buckwheat flour`, `pale buckwheat flour`, `organic light buckwheat flour`
- `farine pâle de sarrasin`, its accent-folded form, or `farine de sarrasin pâle`

Nearby references are distinct:

| Current owner | Existing identity and boundary | R236 boundary |
|---|---|---|
| `ingredient-ref-buckwheat-flour` | `buckwheat flour / farine de sarrasin`; no aliases, forms, density, or unit mappings. | Keep the generic family row and its broad name unchanged. Do not add the qualified source name to it. |
| `ingredient-ref-dark-buckwheat-flour` | `dark buckwheat flour / farine grise de sarrasin`, added after R161; no aliases, forms, density, or unit mappings. | Keep the separately named gray/dark product. R161 explicitly left the pale product unassigned for its own review. |
| `ingredient-ref-sprouted-buckwheat-flour` | `sprouted buckwheat flour / farine de sarrasin germé`, with `germinated buckwheat flour` as an English alias. | The sprouted maker product is titled “Sprouted Whole Grain Light Buckwheat Flour”; its light descriptor is part of a process-qualified product name, not an owner for plain light buckwheat flour. Keep it separate. |
| `ingredient-ref-tartary-buckwheat-flour` | `Tartary buckwheat flour / farine de sarrasin de Tartarie`, with the reviewed French alias `farine de sarrasin vert biologique`. | Keep the regional green-buckwheat wording on its source-matched Tartary row. Do not apply it to the pale product. |
| `candidate-buckwheat-meal`; `candidate-malted-buckwheat-flour` | Ledger-only candidates for different meal/process questions; neither is a picker identity for pale flour. | Leave both candidates unchanged. |

The archive has two relevant bounded decisions, neither of which settles this candidate. R161 integrated the dark/gray row and specifically left `light buckwheat flour / farine pâle de sarrasin` separate and unassigned pending a focused review. The A6 sprouted-buckwheat proposal records the maker phrase “Sprouted Whole Grain Light Buckwheat Flour” for a sprouted product. R23 and subsequent A7 reviews concern ambiguous buckwheat meal, not this separately named flour. The R236 filename, proposed source-ID prefix, and exact product-specific URLs below are not already present in the proposal, batch, or ledger archives.

## Picker projection

The projection follows the reference/form phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Current results use active names, aliases, and form match terms; projected results append only the two proposed canonical names, with empty alias arrays.

| Query | Current results | Projected results | Boundary |
|---|---:|---:|---|
| `light buckwheat flour` | 0 | 1 | Selects the new source-named light product. |
| `farine pâle de sarrasin` / `farine pale de sarrasin` | 0 | 1 | Exact Québec French display, including accent-folded input. |
| `organic light buckwheat flour` | 0 | 0 | No organic product-title alias is proposed. |
| `farine pâle de sarrasin biologique` | 0 | 0 | No organic product-title alias is proposed. |
| `buckwheat flour` | 4 | 5 | Adds the light product beside generic, dark, sprouted, and Tartary flour. |
| `farine de sarrasin` | 3 | 3 | Remains on generic, sprouted, and Tartary flour; the pale display has a different word order and no broad alias is added. |
| `buckwheat` | 11 | 12 | Adds a fifth flour choice within the broader buckwheat family. |
| `sarrasin` | 12 | 13 | Adds the pale product as one more scoped family result. |
| `dark buckwheat flour` | 1 | 1 | Remains on the accepted dark/gray identity. |
| `T60` | 0 | 0 | No class or package alias is proposed. |

The count projection was reproduced against current active references and forms using the current Kotlin normalization and phrase-first semantics. The `pale` single-word query currently has two unrelated results; it would have three after the proposal. The precise product query remains unambiguous.

## Bundled recipe demand

Scanned the serialized content and ingredient rows of all **114 manifest-listed recipes** (1,123 rows), accent-folding search text. There were zero exact or normalized hits for the proposed ID; `light buckwheat flour`; `organic light buckwheat flour`; `pale buckwheat flour`; `farine pâle de sarrasin`; `farine de sarrasin pâle`; or the product SKU. There are also no direct recipe links to the current generic, dark, sprouted, or Tartary buckwheat-flour references. No recipe link, relink, or recipe-line substitution is proposed.

## Forms, measurements, conversions, yields, and substitutions

- **Forms:** No buckwheat-flour form is attached in the current 122-form file. The light/dark product names and fine-grinding description do not establish a reusable form model.
- **Measures and density:** The manufacturer product page lists a 20 kg package, and the Québec directory lists 10 kg and 20 kg formats. These are package sizes only. No cup, spoon, volume-to-mass conversion, or candidate-specific bulk density was found. Keep `defaultDensity` null and `unitMappings` empty.
- **Conversions and yields:** No source establishes a light-to-dark conversion, milling yield, or cooking yield. Add none.
- **Substitutions:** The manufacturer lists pancakes and buckwheat cakes as uses; it supplies no tested ratio or replacement instruction. Do not treat that usage list as evidence to or from generic, dark/gray, whole, sprouted, or Tartary buckwheat flour. The seed has no global or contextual buckwheat substitution rule and no buckwheat package yield. Add no substitution finding or rule.
- **Recipe links:** The corpus has no matching line or direct buckwheat-flour reference link.

## Source register

All proposal-local sources were accessed on 2026-10-16. Product-specific process and size claims remain limited to the named pages and SKU.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A6-LIGHT-BUCKWHEAT-FLOUR-R236-20261016-S01` | Aliments Trigone, [Organic light buckwheat flour T60, 20 kg](https://en.alimentstrigone.com/products/organic-light-buckwheat-flour-t60-20-kg), product heading, SKU, description, uses, and Québec business address. | Names `Organic light buckwheat flour T60 20 kg`, SKU `056142006851`. The maker describes fine grinding, processing the whole grain, stone milling, and pancake/buckwheat-cake uses. It does not define what “light” means or establish a general grade, household measure, density, or substitution. The page showed a backorder status at access; this is not an availability claim. |
| `WP02-A6-LIGHT-BUCKWHEAT-FLOUR-R236-20261016-S02` | Aliments Trigone, [Farine pâle de sarrasin biologique, 20 kg](https://alimentstrigone.com/products/farine-pale-de-sarrasin-biologique-20-kg), French product heading, SKU, description, uses, and Québec address. | Gives the exact French product wording and the same SKU `056142006851` as S01, establishing the bilingual product pairing. It repeats the same product-specific fine-ground/stone-ground and use description and provides no general grade or conversion. The page showed a backorder status at access; no stock claim is made. |
| `WP02-A6-LIGHT-BUCKWHEAT-FLOUR-R236-20261016-S03` | Aliments du Québec, [Farine pâle de sarrasin biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-pale-de-sarrasin-biologique), producer, product name, retailer list, and package formats. | Current Québec-market directory listing for Moissonneries du Pays. It lists 10 kg and 20 kg formats and names Adonis, Avril, IGA, Metro, Provigo, and Rachelle-Béry as retailers. These are package and distribution details, not measures. |
| `WP02-A6-LIGHT-BUCKWHEAT-FLOUR-R236-20261016-S04` | Aliments Trigone, [Buckwheat flour types in its current product range](https://alimentstrigone.com/blogs/news/histoire-et-origine-de-la-gaufre-quelles-farines-pour-des-gaufres-sucrees-ou-salees), paragraph “Les farines de sarrasin,” published 2026-02-24. | The Québec maker says it offers separate whole, gray, and pale organic buckwheat flour grindings. It supports the product-family distinction and local French wording, not a technical definition or universal grade. Its broad use/applications prose is not substitution evidence. |
| `WP02-A6-LIGHT-BUCKWHEAT-FLOUR-R236-20261016-S05` | Aliments Trigone, [Farine grise de sarrasin biologique, 1 kg](https://alimentstrigone.com/products/farine-grise-de-sarrasin-biologique-1-kg), French product heading and description; cited for comparison with the proposed pale product. | The separately named gray product is also described as fine-ground, made from whole grain, stone-ground, and not refined. The shared wording does not define a technical pale-versus-gray boundary; it is a reason not to transfer process or composition claims. The page showed backorder status at access; no stock claim is made. |
| **Reused `WP02-S31`** | OQLF, [farine de sarrasin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin), preferred generic Québec French term and English equivalent; already recorded on the generic buckwheat-flour ledger row and R161. | Supports the base term `farine de sarrasin / buckwheat flour`; it does not independently define or approve the full compound `farine pâle de sarrasin`. No duplicate source record is proposed. |
| **Reused R161 S01–S02** | Aliments Trigone, [English product catalogue](https://en.alimentstrigone.com/collections/all) and [French buckwheat product catalogue](https://alimentstrigone.com/collections/sarrasin-noir-biologique). | Existing R161 source records already document the same maker’s separate dark/gray and pale/light product titles and the Québec address. Reused for the contrast with the accepted dark/gray identity; no duplicate source record is proposed. |

## Local references

- The open [WP02 Section A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1598).
- [R161 dark buckwheat flour review](wp02-a6-next-regional-flour-gap-review-r161-20261016-dark-buckwheat-flour.md), which explicitly left the pale product unassigned for a separate review.
- [R161 integration README](../batches/wp02-wp03-wp04-r161-gap-review-integration-20261016/README.md).
- [Sprouted buckwheat flour review](wp02-a6-sprouted-buckwheat-flour-identity-review-20261012.md), which documents a process-qualified “Sprouted Whole Grain Light Buckwheat Flour” product.
- Active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), manifest, recipe files, and [ingredient search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) were inspected read-only.

This proposal file itself is documentation-only; shared data additions are recorded in the integration README. No software tests were run under the updated `AGENTS.md` database JSON rule.

# WP02 Section A6 whole buckwheat flour identity review — R241 — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Accepted and integrated on 2026-10-16 by the parent agent. The catalog JSON, research ledger, generated index, checklist, roadmap, and batch README are updated.
- **Scope:** The next distinct open A6 flour product after the accepted light buckwheat flour review R236: source-named whole buckwheat flour.
- **Checklist:** [WP02 Section A6 open review](../../RecipeBook-global-ingredient-catalog-plan.txt#L1598). Keep the parent item open.
- **New source-ID namespace:** `WP02-A6-WHOLE-BUCKWHEAT-FLOUR-R241-20261016-S01` through `S03`. The prefix and new URLs were checked against the current ledger and proposal/batch archive.

## Recommendation

**Add one source-named identity-only reference: `whole buckwheat flour / farine entière de sarrasin`.** A Québec mill's current English catalogue lists whole buckwheat flour separately from its light and dark flours; its French product page names `farine entière de sarrasin` and describes that product as coarsely ground from whole grain. A current Québec Food Directory listing separately names `Farine de sarrasin entière biologique` for La Milanaise. This supports a real market identity and two attested Québec French word orders. It does not establish one universal whole-grain, hull, extraction, or grind specification across producers. [S01–S03; reused R161 S01–S02]

Use `ingredient-ref-whole-buckwheat-flour`, category `FLOUR_AND_STARCH`, with `farine de sarrasin entière` as the only French alias. Do not add `organic`, `T24`, `T26`, `coarse`, `whole-grain`, `dark`, `gray`, `light`, `pale`, or Tartary product qualifiers as aliases. The English catalog card says `T24`, while the card's linked product URL uses `T26`; the directly opened French page has no T-code. Leave milling-code meaning and English-to-French SKU pairing unresolved. Keep generic, dark/gray, light/pale, sprouted, and Tartary buckwheat flours separate, along with buckwheat groats, buckwheat meal, and native buckwheat starch.

### Proposed reference JSON delta

```json
{
  "id": "ingredient-ref-whole-buckwheat-flour",
  "nameFr": "farine entière de sarrasin",
  "nameEn": "whole buckwheat flour",
  "aliasesFr": ["farine de sarrasin entière"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

If accepted, preserve one source-specific published portion observation from the older La Milanaise directory record `8204187`: 60 g per 1/3 cup for that listed product only. Reuse existing source ID `WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S05`; do not create a duplicate URL or transfer the observation to the Trigone flour or another product. Do not set default density or a unit mapping. The current La Milanaise directory record `8205132` has a conflicting nutrition-facts basis and is not used for an observation. The ledger measurement state should remain `blocked_pending_evidence` until that current product-label discrepancy and cup convention can be resolved.

The current directory says its La Milanaise product is best combined with wheat flour, but gives no recipe context, ratio, method, or tested result. If recorded, keep this as a `blocked_pending_evidence` substitution finding with no replacements or active rule. No forms, conversions, yields, recipe links, or substitution rules are proposed.

## Current ownership and prior-work audit

The live snapshot contains **1,632 ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,977 research-ledger records**. The manifest lists **114 recipes and 1,123 ingredient rows**.

Exact normalized ownership checks followed the current `IngredientSearch.kt` rules (lowercase NFKD, accent and compatibility folding, punctuation-to-space, and whitespace collapse). No active reference, form, legacy candidate, or ledger record ID owns the proposed reference ID or these exact phrases:

- `whole buckwheat flour`, `organic whole buckwheat flour`
- `farine entière de sarrasin`, `farine de sarrasin entière`
- `farine entière de sarrasin biologique`, `farine de sarrasin entière biologique`

The active references are distinct:

| Current owner | Existing identity and boundary | R241 boundary |
|---|---|---|
| `ingredient-ref-buckwheat-flour` | `buckwheat flour / farine de sarrasin`; English aliases `kuttu atta`, `kuttu ka atta`, `kuttu flour`, `soba-ko`; no density or unit mappings. | Keep its generic row and aliases unchanged. Do not transfer a whole-flour name to it. |
| `ingredient-ref-dark-buckwheat-flour` | `dark buckwheat flour / farine grise de sarrasin`, accepted in R161. | Keep gray/dark product separate. R161 explicitly left whole buckwheat flour unassigned for focused review. |
| `ingredient-ref-light-buckwheat-flour` | `light buckwheat flour / farine pâle de sarrasin`, accepted in R236. | Keep pale/light product separate; do not treat `whole` as an alias or grade for it. |
| `ingredient-ref-sprouted-buckwheat-flour` | `sprouted buckwheat flour / farine de sarrasin germé`, with `germinated buckwheat flour` alias. | Keep its process-qualified flour separate from whole-grain milling language. |
| `ingredient-ref-tartary-buckwheat-flour` | Tartary flour, with source-reviewed French aliases including `farine de sarrasin vert biologique`. | Keep the distinct species and its aliases unchanged. |
| `candidate-buckwheat-meal`; `candidate-malted-buckwheat-flour` | Ledger candidates for separate meal and malted-product questions. | Do not convert either candidate to a whole-buckwheat-flour identity. |

R161 accepted the dark/gray product and explicitly held whole and pale flour apart from that row. R236 accepted the separately named light/pale product and again left whole flour distinct. Neither review allocated the whole-flour identity. The older A6 kuttu review used a La Milanaise whole-flour directory listing only to retain generic `farine de sarrasin`; it did not create or decide a whole-flour row. R241 source IDs, candidate ID, and new product-page URLs are absent from the prior proposal and batch archive. Reused R161 sources are identified below rather than duplicated.

There are no buckwheat entries in the current forms file, no buckwheat global or contextual substitution rules, and no buckwheat package yields. Existing buckwheat-flour references have null density and empty unit mappings.

## Picker projection

Projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The only added terms are the two proposed canonical names and the exact alternate French product wording `farine de sarrasin entière`.

| Query | Current results | Projected results | Boundary |
|---|---:|---:|---|
| `whole buckwheat flour` | 0 | 1 | Selects the new whole-flour identity. |
| `farine entière de sarrasin` | 0 | 1 | Exact Québec manufacturer wording. |
| `farine de sarrasin entière` | 0 | 1 | Exact alternate word order from the Québec directory. |
| `buckwheat flour` | 5 | 6 | Adds the whole product alongside generic, dark, light, sprouted, and Tartary flours. |
| `farine de sarrasin` | 3 | 4 | The alternate French phrase makes the whole row available to this broader query; all existing results remain. |
| `buckwheat` | 12 | 13 | Adds one product in the broader family. |
| `sarrasin` | 13 | 14 | Adds one product in the broader family. |
| `organic whole buckwheat flour` | 0 | 0 | Organic remains a product qualifier and is not an alias. |
| `farine entière de sarrasin biologique` | 0 | 0 | The product-specific organic title is not an alias. |
| `light buckwheat flour` | 1 | 1 | Remains on R236's pale flour. |
| `dark buckwheat flour` | 1 | 1 | Remains on R161's gray flour. |
| `T24` | 0 | 0 | No grade code is added; the maker's EN card/slug differs. |

The distinct whole/dark/light choices are expected when searching the broader `buckwheat flour` family. No exact normalized key is currently owned by another active reference or form.

## Bundled recipe demand

Scanned all **114 manifest-listed recipe files** and **1,123 ingredient rows**, accent-folding recipe text. There were no matches for `whole buckwheat flour`, the organic product title, either proposed French word order, Directory product identifiers `8204187`, `8205132`, the package GTINs, or any other buckwheat/sarrasin term. No recipe line links to a current buckwheat reference. No recipe link, relink, or line substitution is proposed.

## Forms, measurements, conversions, yields, and substitutions

- **Forms:** The form catalog contains no buckwheat forms. `whole` is part of the reviewed milling-product name; the available sources do not support creating a generic preparation form.
- **Measures and density:** Trigone lists package sizes only. The older Québec Food Directory entry `8204187` reports a 60 g / 1/3 cup portion for its La Milanaise product. The current entry `8205132` states nutrition facts per 1/4 cup (30 g) but separately gives serving size per 1/3 cup (60 g). Keep the older observation tied to its exact SKU only; do not infer density or a transferable cup-to-mass mapping from either listing.
- **Conversions and yields:** No source supports a conversion between whole, pale/light, dark/gray, generic, sprouted, or Tartary flour. Package weights are not recipe yields. Add no conversion or package/cooking yield.
- **Substitutions:** The Québec directory recommends combining its La Milanaise product with wheat flour but gives no ratio, recipe, method, or test. Keep the advice source-specific as blocked evidence; add no global or contextual substitution rule. Trigone's pancake/galette use wording does not establish a replacement ratio.
- **Recipe links:** No matching ingredient text or buckwheat-reference link appears in the bundled corpus.

## Source register

New sources were accessed 2026-10-16. Product titles, identifiers, package data, and processing statements are limited to the named products and pages.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A6-WHOLE-BUCKWHEAT-FLOUR-R241-20261016-S01` | Aliments Trigone, [Farine entière de sarrasin biologique, 1 kg](https://alimentstrigone.com/products/farine-entiere-de-sarrasin-biologique-1-kg), product title, SKU, product description, and Québec address. | Exact local French product display; SKU `056142003812`. This product is described as coarsely ground, processed from whole grain, stone-ground, and not refined, with crêpe/galette use. It does not define a universal grade, hull content, density, household measure, or substitution. The page showed backorder at access; no availability claim is made. |
| `WP02-A6-WHOLE-BUCKWHEAT-FLOUR-R241-20261016-S02` | Aliments Trigone, [current English buckwheat product catalogue](https://en.alimentstrigone.com/collections/organic-black-buckwheat), product cards and Québec business address. | Lists `Organic whole buckwheat flour T24` separately from dark T60 and light buckwheat flour products. The linked 1 kg product URL contains `T26` in its slug while the card says `T24`, and direct retrieval of that linked detail returned a cache miss. Do not import T24/T26 as a general grade or claim exact English/French SKU pairing. |
| `WP02-A6-WHOLE-BUCKWHEAT-FLOUR-R241-20261016-S03` | Québec Food Directory / MAPAQ, [Organic Whole Buckwheat Flour, product 8205132](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8205132), GS1 product sheet and serving fields; listing last updated 2026-07-24. | Names the 1 kg La Milanaise product and identifies La Meunerie Milanaise inc. Its French listing uses `Farine de sarrasin entière biologique`. Product description identifies organic black buckwheat and gives an unquantified recommendation to combine with wheat flour. The page's nutrition and portion fields conflict; do not use it for a mass observation or substitution ratio. MAPAQ notes product-sheet accuracy is the company's responsibility. |
| **Reused `WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S01–S02`** | Aliments Trigone, English [buckwheat product catalogue](https://en.alimentstrigone.com/collections/all) and French [sarrasin product catalogue](https://alimentstrigone.com/collections/sarrasin-noir-biologique). | Already recorded in R161; the French listing shows whole, gray, and pale flour as separately named products. Reuse for the product-family boundary without duplicating source IDs or URLs. |
| **Reused `WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S05`** | Québec Food Directory / MAPAQ, [older La Milanaise Organic Whole Buckwheat Flour product 8204187](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204187), product name, GTIN, serving, and description; listing last updated 2025-10-29. | Previously recorded on the R161 dark-flour record to show that the 60 g / 1/3 cup declaration belongs to a separate whole-flour product, not dark flour. Reuse only for a SKU-specific portion observation if desired; it does not establish general density or a current universal serving. |
| **Reused `WP02-S31`** | OQLF, [farine de sarrasin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin), generic preferred Québec French term. | Supports the generic base term only. It does not approve the compound `farine entière de sarrasin` or the alternate whole-flour phrase. No duplicate source record is proposed. |

## Local references

- [WP02 Section A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1598).
- [R161 dark buckwheat flour review](wp02-a6-next-regional-flour-gap-review-r161-20261016-dark-buckwheat-flour.md), which left whole and pale products unassigned.
- [R236 light buckwheat flour review](wp02-a6-light-buckwheat-flour-identity-review-r236-20261016.md), which keeps whole flour distinct.
- Active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json) were inspected read-only.
- The [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest-listed recipe files, and the search implementation were audited read-only.

The parent agent integrated the identity, historical product-specific portion observation, blocked blending note, and checklist update. No software tests were run for the database-JSON additions.

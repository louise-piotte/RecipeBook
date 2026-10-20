# WP03 Section F — Ponni rice identity review (R273, 2026-10-16)

## Review record

- **Status:** Accepted and integrated on 2026-10-16 as identity-only `ingredient-ref-ponni-rice`; see the [integration record](../batches/wp03-section-f-ponni-rice-identity-integration-r273-20261016/README.md).
- **Scope:** The bounded market-name identity `Ponni rice / riz Ponni`. This review does not identify every Ponni-labeled package as one cultivar, resolve processing state, or revisit the blocked Ponni-to-Sona-Masoori replacement claim in R255.
- **Plan location:** The dedicated Ponni item is now checked at [the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3506), while Section F remains open. The pre-integration rice inventory named Koshihikari and several rice classes but did not name Ponni; this review documents that omission without claiming that the broad inventory entry was an exact unchecked Ponni task.
- **Recommendation:** Add identity-only `ingredient-ref-ponni-rice` as `Ponni rice / riz Ponni`, category `GRAIN_AND_CEREAL`, with no aliases. Treat the English market name and French display as product-label wording, not a claim of one universal cultivar or an OQLF-approved translation. Add no form, density, unit mapping, measure, recipe link, conversion, yield, or substitution.
- **Integration README:** `docs/catalog/batches/wp03-section-f-ponni-rice-identity-integration-r273-20261016/README.md`.

## Product boundary and rationale

Tamil Nadu Agricultural University identifies **Improved White Ponni** as a rice variety and describes its grain as medium slender [S01]. The reviewed Canadian retailer pages (reported 5- and 8-month crawls) list products under the broader label **Ponni rice**: one collection shows Laxmi raw and boiled packages [S02], while a Québec seller page is titled Ponni Boiled Rice [S04]. These page labels support observed product wording; they do not establish present availability. A Canadian French product page labels a Laxmi product `Riz cru Ponni de marque Laxmi` [S03]. Together these support Ponni as a recognizable rice market name and the proposed bilingual display wording.

The evidence does not establish that every package called Ponni is Improved White Ponni, that all Ponni products share one cultivar or grain-length class, or that “boiled” has one standardized processing meaning. The proposed row represents the source-attested market name only. Do not use the TNAU grain description as a universal property or map `boiled` to cooked rice or parboiled rice.

## Ownership and archive audit

Read-only snapshot of the live package and catalog files: **1,656 ingredient references, 125 forms, 61 legacy-import candidates, 2,004 research-ledger records, 114 manifest-listed recipes, and 1,123 structured ingredient rows**.

| Surface | Pre-integration owner/result | Decision |
|---|---|---|
| Active reference displays and aliases | No exact normalized `Ponni`, `Ponni rice`, or `riz Ponni` owner. | Add a separate named-rice market identity; do not attach Ponni to generic rice or a grain-length class. |
| Active forms | No exact Ponni form label or match term. | Add no raw, boiled, dry, or cooked form. |
| Legacy-import candidates | No exact Ponni identity or alias. | No legacy promotion or remapping. |
| Research ledger | The only Ponni mention is the R255 Taste Lab 1:1 claim in `ingredient-ref-sona-masoori-rice`'s evidence; it is marked blocked. No Ponni identity candidate or record exists. | Keep the R255 substitution claim blocked; do not copy it into active rules or treat it as evidence of equivalence. |
| Proposal and batch archive | No prior Ponni identity review or Ponni integration batch was found. R255 mentions Ponni only as the unverified proposed substitute for Sona Masoori. | Record this as a separate identity review without reopening R255. The proposal source-ID prefix `WP03-PONNI-R273-20261016-` is unused. |
| Nearby rice identities | Generic rice, long/medium/short-grain classes, Koshihikari, and Sona Masoori have distinct current references. | Keep each identity and its names unchanged; add no aliases such as `medium-grain`, `Indian rice`, `idli rice`, or brand names. |

This ownership table is the pre-integration snapshot. The exact-key check followed the repository's accent- and punctuation-folded search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L8). The archive audit checked proposal, batch, plan, ledger, and legacy-candidate content for Ponni terms; a contextual mention is not an identity owner.

## Picker projection

This is a static pre-integration phrase-first projection of the ingredient-reference and form terms using [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), not live Android picker QA. It assumes the integrated English and French display values, with no aliases.

| Query | Pre-integration | Integrated projection | Effect |
|---|---|---|---|
| `Ponni`, `Ponni rice`, `riz Ponni` | No result | Ponni reference only | Makes the base market name searchable in both locales. |
| `Ponni raw rice`, `Ponni boiled rice`, `riz cru Ponni` | No result | No result | These SKU/state-qualified phrases remain outside the alias set because “boiled” is unresolved and raw/boiled labels must not collapse into one inferred form. |
| `rice` | 69 references | 70 references | Adds one result to an already broad query. |
| `riz` | 64 references | 65 references | Adds one result to an already broad query. |
| `medium-grain rice`, `riz à grain moyen` | `ingredient-ref-medium-grain-rice` only | Same single reference | Does not infer a grain-length class for Ponni. |
| `Sona Masoori` | `ingredient-ref-sona-masoori-rice` only | Same single reference | Keeps R255's identity and blocked substitution evidence separate. |

Do not add `Ponni raw rice`, `Ponni boiled rice`, `riz cru Ponni`, `parboiled rice`, or `cooked rice` as aliases. A later source-specific form review can determine whether particular package labels justify any state-level mapping.

## Bundled recipe demand

A scan of all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows** found no Ponni wording or Ponni reference link. The corpus gives no recipe-demand reason to add a form or connect this identity to a recipe. This conclusion is limited to the current bundled corpus.

## Numeric and substitution limits

- Retail package sizes and availability are SKU observations only; they are not household measures or density evidence [S02–S04].
- Add no default density, unit mapping, measure, or conversion. The TNAU variety page is not a culinary conversion source.
- Add no dry/cooked or boiled form and no cooking yield. Retailer labels alone do not establish a transferable preparation-state relation.
- Add no global or contextual substitution. The R255 Taste Lab claim lacks a test protocol, recipe context, and dish-role limits; it remains blocked [S05].

## Source evidence

Sources were checked on **2026-10-16**. Retail stock and prices are not used as identity evidence.

| ID | Source and locator | Supports / limits |
|---|---|---|
| `WP03-PONNI-R273-20261016-S01` | Tamil Nadu Agricultural University, [Improved White Ponni](https://agritech.tnau.ac.in/agriculture/Impr.whit.ponni.html), rice variety page, updated January 2023. | Names Improved White Ponni, gives its parentage, and describes it as medium slender rice. Supports a named variety; it does not show every market-labeled Ponni product is that variety or establish culinary measures. |
| `WP03-PONNI-R273-20261016-S02` | Indian Grocery Store Canada, [Ponni Rice collection](https://indiangrocerystore.ca/collections/ponni-rice), Canadian retail collection, checked 2026-10-16. | The collection groups products under Ponni Rice and lists `Laxmi Ponni Raw Rice 10 lb` and `Laxmi Ponni Boiled Rice 20 lb`. Supports observed Canadian market wording and two state-qualified SKU labels; it does not standardize their cultivar or processing. The collection page crawl is reported as 5 months old; no availability is inferred. The displayed weights are package sizes. |
| `WP03-PONNI-R273-20261016-S03` | Spice Divine Canada (French), [Riz cru Ponni de marque Laxmi](https://spicedivine.ca/fr/products/laxmi-ponni-raw-rice-10lb-4-54kg), French product title and description, checked 2026-10-16. | Indexed product text uses `Riz cru Ponni de marque Laxmi` and lists 4 lb, 10 lb, and 20 lb variants. Its indexed crawl is reported as 5 months old, and the direct page fetch returned a cache miss. The indexed text supports observed Canadian French retail wording, not present availability, a formal Québec terminology ruling, or a general Ponni processing specification. |
| `WP03-PONNI-R273-20261016-S04` | MonAgro Foods, [Ponni Boiled Rice 10 lb](https://www.mon-agrofoods.ca/product-page/ponni-boiled-rice-10lb), Saint-Constant, Québec retailer listing, checked 2026-10-16. | Supports a Québec seller's `Ponni Boiled Rice` product label. The page was directly retrievable during review, though the web index reports an 8-month-old crawl; no availability is inferred. It does not define “boiled” as parboiled or cooked rice and provides no general conversion. The package quantity is SKU-specific. |
| `WP03-PONNI-R273-20261016-S05` | Taste Lab, [Sona Masoori Rice](https://www.tastelab.food/ingredients/sona-masoori-rice), cited in the R255 review, checked 2026-10-16. | Claims Ponni can replace Sona Masoori at 1:1 but gives no test protocol, preparation context, or dish-role limits. Its nutrition section cites a USDA long-grain brown-rice record rather than Sona Masoori. Keep the claim blocked and do not transfer its nutrition values. |

## Proposed disposition

Add one identity-only `GRAIN_AND_CEREAL` reference, `ingredient-ref-ponni-rice`, displayed as `Ponni rice / riz Ponni`, with no aliases. Keep the name scoped to source-attested market wording; do not assert one universal cultivar, grain length, milling state, or processing state. Keep forms, density, unit mappings, reusable measures, conversions, yields, recipe links, and substitutions empty. Preserve the blocked R255 Ponni-to-Sona-Masoori claim without change.

Integration added the identity-only reference and ledger evidence, a checked Ponni item adjacent to the named-rice inventory in Section F, and a dated R273 completion note in the roadmap. The [integration README](../batches/wp03-section-f-ponni-rice-identity-integration-r273-20261016/README.md) records static verification. The completed R255 checklist entry and its blocked substitution claim remain unchanged.

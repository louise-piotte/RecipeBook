# WP03 Section F R386 — Rajgira whole-grain search alias review (2026-10-17)

## Review record

- **Scope:** One unresolved term boundary in the open Section F species-level grain sweep: whether bare `rajgira` should reach the existing edible amaranth-grain reference as well as the already-active amaranth-flour reference.
- **Recommendation:** Add `rajgira` as one English search alias on `ingredient-ref-amaranth-grain`. Keep the existing displays `amaranth / amarante`; leave the French aliases, flour aliases, category, measurement data, and all other references unchanged.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, README, code, or test files were changed.
- **Plan context:** This is a bounded follow-up under the still-open “Continue species-level millet, sorghum, fonio, quinoa, and amaranth review” item in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3837). It does not close the independent human Québec-display review or the broader Section F sweep.

## Prior decision and current gap

The grain row already has `ramdana` as an English alias and `grains d'amarante` as a French alias. The separate amaranth-flour row owns the English aliases `rajgira flour`, `rajgira atta`, and `ramdana flour`. The prior flour review held bare `rajgira` because it had found only flour-qualified Canadian product evidence; it explicitly did not allocate the word to the grain row ([Rajgira flour review](wp02-a6-regional-flour-next-candidate-review-20261012.md#L16)).

That evidence gap has narrowed: a current Canadian retailer's whole-seed listing now describes “amaranth grains (Rajgira),” and a second Canadian storefront lists “Amaranth Seeds / Rajgira.” FSSAI's current 2025 whole/dehulled millet standard independently includes `Amaranthus (Chaulai or Rajgira)` and names three *Amaranthus* species. Together these support the term on the existing broad edible-grain identity. The new proposal does not add `rajgira` to the flour row or reinterpret the qualified flour aliases.

## Live catalog and ownership audit

| Area | Current state and proposed boundary |
|---|---|
| Active package | **1,700 ingredient references** and **141 forms**. The target is `ingredient-ref-amaranth-grain`, `amaranth / amarante`, category `GRAIN_AND_CEREAL`, English alias `ramdana`, French alias `grains d'amarante`, null `defaultDensity`, and empty `unitMappings`. |
| Adjacent amaranth rows | Keep amaranth flour, flakes, greens, puffed amaranth, and sprouted amaranth flour distinct. In particular, retain `rajgira flour` and `rajgira atta` only on `ingredient-ref-amaranth-flour`. |
| Exact query ownership | No active name or alias is the single token `rajgira`. The qualified phrase owners are the two flour aliases `rajgira flour` and `rajgira atta`; under the current phrase search, a bare `rajgira` query therefore returns the flour row alone. The proposal adds the grain as a second result for that broad query. |
| Research ledger | **2,056 records** and **8 unit conversions**. The grain identity is verified; its measurement state is `researched_no_supported_value` and its substitution state is `not_yet_researched`. The ledger already contains the FSSAI standard as `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S05`; no new identity or candidate record is needed. If accepted, append the Canadian whole-seed evidence to this grain record and preserve both research states. |
| Legacy import | **56 candidates**; no Rajgira, amaranth-grain, or amaranth-flour candidate owns the bare token. |
| Forms and rules | No amaranth-grain form is attached. The current global and contextual substitution-rule files contain no active rule. Add no form, conversion, yield, measurement, recipe link, or substitution. |

The existing general grain identity remains species-broad. FSSAI's standard gives a three-species group (*A. caudatus*, *A. cruentus*, *A. hypochondriacus*); the Canadian seed listings do not state a species. Do not add a species-qualified row or botanical names as aliases.

## Naming and proposed data delta

The single proposed delta is:

```json
{
  "id": "ingredient-ref-amaranth-grain",
  "aliasesEn": ["ramdana", "rajgira"]
}
```

`rajgira` is supported here as the English-search spelling attached to a Canadian whole-seed product and to a food-standard grain term. Do not add a French `rajgira` alias. Keep the Québec French display `amarante`; OQLF's existing entry gives `amarante` as the preferred French term and `amaranth` as English, while Moulin Abénakis sells `Amarante biologique en grains` from its Québec-facing French storefront. Those sources support the current bilingual display, not a French Rajgira label.

Do not add `chaulai`: the Canadian crop/food naming evidence reviewed here does not establish that word as a safe whole-grain alias across the adjacent amaranth-green identity. Do not add `rajgira millet`, `rajgira seed`, or `rajgira grain`; the one-word source-attested term is sufficient, and a longer unsupported alias is unnecessary.

## Picker projection

The projection follows the current normalized phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The current package was checked across all reference names and aliases and attached form search terms.

| Query | Current results | With proposed alias | Effect |
|---|---|---|---|
| `rajgira` | Amaranth flour only | Amaranth flour and amaranth grain | The unqualified regional term no longer returns flour alone; users can choose the whole-grain or flour product. |
| `rajgira flour` | Amaranth flour only | Amaranth flour only | Flour-qualified selection stays exact. |
| `rajgira atta` | Amaranth flour only | Amaranth flour only | Flour-qualified selection stays exact. |
| `ramdana` | Amaranth grain and amaranth flour | Same two | Existing behavior is unchanged. |
| `amaranth` / `amarante` | Six amaranth-related rows | Same six | Broad searches remain multi-choice across grain, flour, flakes, greens, puffed grain, and sprouted flour. |
| `grains d'amarante` | Amaranth grain only | Amaranth grain only | Existing French search alias is unchanged. |
| `farine d'amarante` | Amaranth flour and sprouted amaranth flour | Same two | French flour results remain product-qualified. |

This is a static projection of catalog terms through the checked search implementation; no live-device picker check was performed.

## Recipe demand and numeric behavior

The bundled manifest lists **114 recipe files** and **1,123 structured ingredient rows**. A full scan of every manifest-listed recipe JSON file and ingredient row for `rajgira`, `ramdana`, `amaranth`, `amarante`, `chaulai`, and `ingredient-ref-amaranth-grain` found **zero file hits, zero ingredient-row hits, and zero direct reference links**. No bundled recipe needs a link or form from this review.

The Canadian listing's package sizes and suggested uses are product-specific. They do not establish a reusable household measure, density, conversion, or cooking yield. Preserve the target ledger's `researched_no_supported_value` measurement state and null runtime density. No substitution source was reviewed for this alias-only change; preserve `not_yet_researched` and add no active rule.

## Sources checked 2026-10-17

The proposal-local R386 source IDs below are not ledger additions. Existing source IDs are reused where the source is already on the amaranth-grain ledger row.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| Existing `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S05` | Food Safety and Standards Authority of India, [Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §2.4.23, PDF p. 18; reopened 2026-10-17. | The standard applies to whole or dehulled millets and lists `Amaranthus (Chaulai or Rajgira)` with *A. caudatus*, *A. cruentus*, and *A. hypochondriacus*. It supports a whole-grain Rajgira boundary and a multi-species scope; it is not Canadian terminology guidance. |
| `WP03-AMARANTH-RAJGIRA-R386-20261017-S01` | East India Pantry, [Amaranth Seeds](https://www.eastindiapantry.ca/products/amaranth-seeds), Canadian retailer, accessed 2026-10-17; indexed product description crawled within the last month. | The listing is titled `Amaranth Seeds`; its indexed description calls them “amaranth grains (Rajgira).” The live page lists a 400 g selection and gives a Mississauga pickup address, while its banner says the store is temporarily closed and orders require confirmation. Use the wording as a Canadian product-name observation only; do not infer availability, composition beyond the displayed name, species, or a recipe measure. |
| `WP03-AMARANTH-RAJGIRA-R386-20261017-S02` | Veehacart, [Nutty Yogi Organic Amaranth Seeds / Rajgira](https://veehacart.ca/products/nutty-yogi-organic-amaranth-seeds-rajgira-1), Canada-facing retailer listing, indexed within the last week. | The title directly pairs amaranth seeds with Rajgira. The listing showed 500 g and 1 kg package choices and was marked sold out when indexed; package sizes are not household measures. The listing is corroborating retailer evidence, not a botanical or regulatory standard. |
| Existing `WP03-S23` | Office québécois de la langue française, [GDT: *amarante*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), last updated 2009; reopened 2026-10-17. | Preferred French term `amarante`, English `amaranth`, and an edible-seed cereal definition. Its example species does not narrow the broad multi-species grain row or attest Rajgira as a French term. |
| Existing `WP03-AMARANTH-GRAIN-QC-R106-20261014-S01` | Moulin Abénakis, [Amarante biologique en grains](https://moulinabenakis.com/products/amarante-grains-bio), Québec distributor storefront; reopened 2026-10-17. | The French product title uses `Amarante biologique en grains`; the page gives a Saint-Léonard, Québec address. It corroborates the existing French display in local commerce, not the regional spelling Rajgira. |

## Recommendation and limits

Add only English alias `rajgira` to `ingredient-ref-amaranth-grain`. This revisits the prior bare-term hold using new whole-grain-specific Canadian product wording and the existing official grain standard. Keep the English/French displays, French alias, category, flour aliases, null density, empty mappings, recipe links, forms, and substitution state unchanged. Keep independent Québec review open.

The package/catalog ownership, projected query behavior, and full manifest recipe scans above were performed as static checks. This proposal changed documentation only; no software tests, build, or emulator run was needed.

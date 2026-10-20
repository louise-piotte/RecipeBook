# WP03 Section K generic produce gap review — R970

Reviewed 2026-10-19. Proposal only; no shared catalog, ledger, plan, roadmap, or checklist files were changed.

## Recommendation and scope

Recommend one identity-only generic ingredient for edible sunflower shoots harvested as microgreens: **sunflower shoots / pousses de tournesol**, from food-grown *Helianthus annuus* L. The scope is the young above-ground seedling shoot harvested at microgreen stage. Québec MAPAQ distinguishes soil- or fabric-grown pousses from water-grown germinations and lists tournesol as a pousse crop; Oregon State Extension documents culinary use of sunflower seedlings as microgreens. The sources support the identity and a clear crop/part boundary.

Keep this identity separate from sunflower seeds, oil, and seed butter; mature sunflower leaves or whole plants; and water-grown germinations/sprouts, where the seed and emerging root are consumed. Keep it separate from pea shoots and from other crop-specific shoots and sprouts. Do not use broad `shoots`, `microgreens`, `sprouts`, `pousses`, or `germes` as aliases.

The French display `pousses de tournesol` is a descriptive, provisional Québec French compound. MAPAQ uses `pousses` (also `micropousses`) for the category and lists `tournesol`; this review did not establish an OQLF-standardized species-part compound. Keep the crop-qualified wording and do not broaden it to generic sunflower greens. This terminology qualification does not leave the ingredient identity unresolved.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-sunflower-shoots` |
| nameEn | `sunflower shoots` |
| nameFr | `pousses de tournesol` (provisional descriptive wording) |
| aliasesEn | [`sunflower microgreens`] |
| aliasesFr | [`micropousses de tournesol`] (provisional, crop-qualified wording) |
| category | `VEGETABLE_AND_AROMATIC` |
| defaultDensity / unitMappings | `null` / `[]` |
| updatedAt | `2026-10-19T00:00:00Z` |

No form, density, unit mapping, conversion, yield, recipe link, or active substitution is proposed.

## Ownership, demand, and queue scope

The live package currently has **1,986 references**, **205 forms**, **2,391 research-ledger records**, and **55 legacy candidates**. Its manifest contains **114 recipes**; those files contain **1,123 ingredient rows**. These counts were recounted during this review.

Exact-name and botanical phrase scans found no sunflower-shoot owner in active references, forms, the legacy-candidate list, or the ledger. Searches across the proposal and batch archives found no focused prior sunflower-shoot or sunflower-microgreen review. The source-ID prefix `WP03-K-SUNFLOWER-SHOOTS-R970-20261019` is unused.

| Existing owner | Boundary to preserve |
|---|---|
| `ingredient-ref-sunflower-seeds` — sunflower seeds / graines de tournesol | Seeds remain the mature seed ingredient, not the young shoot. |
| `ingredient-ref-sunflower-oil` — sunflower oil / huile de tournesol | Preserve the extracted oil identity and its evidence. |
| `ingredient-ref-sunflower-seed-butter` — sunflower seed butter / beurre de graines de tournesol | Preserve the seed-butter identity and its evidence. |
| `ingredient-ref-pea-shoots` — pea shoots / pousses de pois | Keep the existing crop-specific shoot identity and its microgreens aliases. |
| `ingredient-ref-alfalfa-sprouts`, `ingredient-ref-mung-bean-sprouts`, `ingredient-ref-soybean-sprouts` | Keep these water-grown germination identities separate from sunflower pousses. |

MAPAQ's source URL is already present as `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S23` on the pea-shoot, alfalfa-sprout, and sprouted-rye candidate records. Preserve those records and their claims. If integrated, add a new R970 source record with the narrower sunflower-specific locator described below; do not rewrite or transfer the existing source record. The Oregon State, Utah State, and Cornell Extension page URLs have no exact current ledger source owner.

The live recipe corpus has **zero matching files and zero matching ingredient rows** for sunflower shoots, sunflower microgreens, sunflower sprouts, or the reviewed French phrases. No recipe link or relink is proposed.

The Section K plan leaves the wider regional greens and shoots sweep open ([plan, Section K](../../RecipeBook-global-ingredient-catalog-plan.txt#L6709)). The R966–R968 integration review found no new roster-only queue task; its existing Section F commercial roster clauses and named Anson Mills wheat-meal lead remain out of scope because commercial-product counts do not add ingredient diversity ([R966–R968 integration README](../batches/wp02-wp03-wp05-r966-r968-generic-gap-integration-20261019/README.md)). No brand, product-line, cultivar, retailer, or flavour roster was pursued here. Existing branded rows remain untouched.

## Measurements and substitutions

Utah State Extension gives sunflower-specific growing directions, including tray seeding, soaking, covering, and an estimated harvest interval. Those values describe that source's growing setup; they do not establish a kitchen amount, harvested mass, density, package measure, or transferable form. Keep them source-scoped.

Cornell Cooperative Extension's `Sunflower Shoot Smoothie` recipe lists **1/2 cup sunflower shoots** in that formula. It gives no corresponding mass or packing basis, so this is a recipe-specific amount, not a reusable cup-to-mass measure. The recipe's separate “baby spinach or microgreens” wording does not state that either replaces its sunflower shoots. It supports no transfer to other crop measurements or any substitution rule.

If integrated, propose `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Keep `measurementObservations` empty. Add no forms, conversions, density, yield, or substitution links. No reviewed source supports a contextual sunflower-shoot replacement with pea shoots, sprouts, spinach, or another microgreen at a named dish role, preparation state, and ratio.

## Sources and source ownership

These proposal-local IDs are not in the live ledger. The MAPAQ page has an existing shared source ID noted above; a separate R970 locator is proposed to keep the sunflower-specific evidence distinct.

| ID | Source | Supported claim and limits |
|---|---|---|
| WP03-K-SUNFLOWER-SHOOTS-R970-20261019-S01 | Québec MAPAQ, [Culture des pousses et germinations](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/agriculture-urbaine/quoi-planter/pousses-germinations) (`regional_authority`). | Use the sections distinguishing germinations and pousses, the pousses crop list naming tournesol, and the cutting/harvest description. Supports the Québec category wording, crop, and young-shoot boundary; it does not establish a household measure. Keep a new sunflower-specific locator separate from existing `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S23` claims. |
| WP03-K-SUNFLOWER-SHOOTS-R970-20261019-S02 | Oregon State University Extension, [Grow Your Own Sunflowers](https://extension.oregonstate.edu/catalog/em-9866-grow-your-own-sunflowers) (`extension`). | Identifies sunflower as *Helianthus annuus* and describes young seedlings harvested as microgreens for salads and sandwiches. Supports the species, stage, and culinary use; no recipe amount or Québec-market term. |
| WP03-K-SUNFLOWER-SHOOTS-R970-20261019-S03 | Utah State University Extension, [Grow Your Own Microgreens](https://extension.usu.edu/yardandgarden/research/grow-your-own-microgreens) (`extension`). | Names sunflower microgreens and gives a source-specific production setup and harvest estimate. Those directions remain scoped to the guide and do not establish kitchen measurements, package sizes, or product-wide claims. |
| WP03-K-SUNFLOWER-SHOOTS-R970-20261019-S04 | Cornell Cooperative Extension Seneca County, [April: What’s Up With Food & Nutrition?](https://senecacountycce.org/food-family/april-whats-up-with-food-nutrition-1) (`extension`). | Includes a sunflower-shoot smoothie formula with 1/2 cup shoots. The amount belongs to that formula; no mass, packing basis, generic serving, or substitution is established. |

## Checks and disposition

The reference, form, ledger, legacy-candidate, source-prefix, proposal/archive, recipe-file, and recipe-row scans found no existing sunflower-shoot identity or bundled demand. Live totals above were recounted. Local links to the Section K plan and R966–R968 README were checked. This proposal was checked for UTF-8 without BOM, final newline, trailing whitespace, and resolving local links. No software tests were run because this is proposal-only work.

Recommend adding the single identity-only `VEGETABLE_AND_AROMATIC` reference with the crop-qualified bilingual wording above. Keep the French compound provisional, preserve the existing seed/oil/butter and shoots/sprouts identities, and add no reusable measurement, form, recipe link, yield, or substitution. Section K's broader shoot sweep remains open.

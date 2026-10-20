# WP04 Section P — generic salmon-fillets identity review (R268)

- **Review and source-access date:** 2026-10-16.
- **Selected unfinished record:** `ingredient-ref-salmon-fillets-without-skin`.
- **Recommendation:** Keep the active identity `salmon fillets / filet de saumon`; add the French search alias `filets de saumon`. Record one source-specific published portion and one tightly scoped recipe substitution finding in the research ledger. Add no form, default measure, species assignment, recipe-line substitution, or active substitution rule.
- **Status:** Integrated. The catalog alias, ledger evidence, generated index, Section P checklist, roadmap, and integration note are recorded. No software tests, build, or emulator were run because the change adds database JSON data.

## Why this is the remaining salmon-fillets gap

The current [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5914) has already reviewed the unqualified salmon-species boundary, the generic salmon-market-group hold, the six active species-specific salmon rows, and the canned and smoked salmon product groups. The associated proposals include the [species-boundary recheck](wp04-finfish-salmon-tuna-species-boundary-recheck-20261011.md), [generic salmon-group hold](wp04-section-p-generic-salmon-market-group-review-r114-20261014.md), [smoked salmon review](wp04-section-p-smoked-salmon-product-boundary-review-r169-20261016.md), and [canned salmon review](wp04-section-p-canned-salmon-product-boundary-review-r172-20261016.md). The separately held Gravlax-style/semi-smoked salmon and salmon roe records are also outside this review.

At the start of this review, the active fillet reference was the only salmon fillet identity whose ledger row had `identityState: unreviewed`, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, and empty `sources` / `decisions`. At that point it displayed `salmon fillets / filet de saumon`, with no aliases, attached form, density, or unit mappings. The separate `candidate-wp04-salmon-species-scope` remains unresolved; this review does not infer a salmon species from its unqualified name.

The manifest lists **114 recipes and 1,123 ingredient rows**. A read-only corpus scan found exactly one salmon ingredient row: recipe 077 line 10, `675 g salmon fillets without skin, cut into cubes`, linked to this reference. Its `without skin` and `cut into cubes` details are recipe-line preparation, not a reason to create a skinless or cubed catalog form. The linked [RICARDO recipe page](https://www.ricardocuisine.com/recettes/6174-pate-au-saumon-style-pot-en-pot-de-ricardo) gives 675 g (1½ lb) for six portions; it first simmers 450 g (1 lb) for two minutes and adds the remainder later. These are amounts and handling for that pot pie, not a reusable fillet size or method-independent product state. The page identifies its content as advertising content rather than editorial RICARDO content, which further limits its use to the linked recipe.

The English name is already plural. The Québec French display is singular, while the IGA-credited Québec recipe page [Filets de saumon à l’aneth](https://www.recettes.qc.ca/recettes/recette/filet-de-saumon-a-l-aneth-196695), dated 2009-09-03, uses the plural phrase in both its title and ingredient list. Adding that exact plural as a search alias is the only active-name gap found in this bounded review. The recipe corpus has just one bundled salmon demand; the alias is supported by this Québec recipe wording and does not add a species or product-state claim.

## Identity, product state, and alias decision

**Added** `filets de saumon` to `aliasesFr` on the existing `ingredient-ref-salmon-fillets-without-skin` reference. Keep `salmon fillets` and `filet de saumon` as the displays. Do not add English aliases: `salmon fillet` already finds the plural English display through the current partial-search fallback, and `salmon fillets` is an exact match.

This remains an unqualified culinary fillet identity, not a fish species and not permission to use an unqualified name on a commercial fish label. CFIA says Canadian fish names ordinarily use the species common name for single-species products; its Fish List separates Atlantic salmon and the named Pacific salmon species, and it does not accept “Pacific salmon” as a replacement common name. The app search identity therefore stays separate from the active Atlantic, Chinook, chum, coho, pink, and sockeye references. Keep the generic salmon-group hold and the unresolved recipe-species candidate unchanged. Keep canned salmon and smoked salmon separate as finished-product groups; do not merge either into this fillet identity.

The phrase does not collide with an existing salmon, species, or processed-salmon identity. Under the current phrase-first search, `filets de saumon` has zero results and becomes one result after the alias is added: this fillet row. Broad `salmon / saumon` queries already return nine choices (the generic row, six species rows, and canned and smoked salmon); the proposed alias leaves that set at nine. Bare `filets` currently returns five fillet rows and would return six, so it remains a multi-result query. Bare `filet` currently returns the salmon and tilapia fillet rows and remains unchanged. No broad query becomes a singleton.

## Measures and product-state limits

The Québec IGA recipe lists four salmon fillets, approximately 200 g each, and serves four. This is one recipe-specific published portion, with no named species, skin state, trimming basis, or measuring method. The ledger records it only as a `portion_weight` observation with `sourceQuantity: {amount: 1, unit: "filet"}` and a quantity-basis note preserving those limits. Do not turn it into a default count-to-mass mapping or assume the pieces match recipe 077’s skinless fillets.

Recipe 077’s 675 g (1½ lb) remains its own recipe quantity. Existing CNF observations for named salmon species and cooked/canned states remain attached to those species records. Health Canada now publishes the CNF 2026 as relational CSV files; the old 2015 online lookup is explicitly described as an interim access path. This review does not copy older online values to the generic fillet row or claim to have extracted item-level values from the 2026 CSV. No generic density, unit mapping, fillet count default, edible yield, cooking yield, conversion, or package quantity is supported.

## Substitution finding and limits

The IGA source says its specific baked salmon-and-dill recipe can also be made with rainbow trout or “omble de l’Arctique.” The active identities already have the corresponding species-specific references, `ingredient-ref-rainbow-trout` and `ingredient-ref-arctic-char`. OQLF’s preferred Québec fish-product term is `omble chevalier`; it says `omble de l’Arctique` was not retained by the fish-product terminology committee. The ledger maps the recipe’s alternative to the existing Arctic-char reference for research purposes; `omble de l’Arctique` was not added as an alias.

The ledger preserves this as a supported **source-recipe-context finding** only. Do not create a global salmon-to-trout/char rule, a contextual rule, or a RecipeBook recipe-line link. The IGA dish bakes fillets with vegetables, lemon, and dill for 8–10 minutes. It is not the bundled pot pie, which simmers part of the fish in a milk-and-cream filling and then bakes the assembled pie. The source provides no adjustment ratio or broader interchangeability claim. No substitution is applied to recipe 077.

## Integrated catalog and ledger result

Catalog delta, limited to the alias:

```json
{
  "id": "ingredient-ref-salmon-fillets-without-skin",
  "nameFr": "filet de saumon",
  "nameEn": "salmon fillets",
  "aliasesFr": ["filets de saumon"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Applied ledger treatment for the same record:

- Set `identityState: verified` for the recipe-search identity only; keep `candidate-wp04-salmon-species-scope` unresolved.
- Set `measurementState: researched_supported` only for the source-specific approximate one-fillet portion observation above. Keep default density and unit mappings empty.
- Set `substitutionResearchState: researched_supported` only for the IGA recipe-specific trout / Arctic-char finding. Leave the active global and contextual substitution-rule files unchanged.
- Keep forms empty. Preserve recipe 077’s skinless/cubed wording on its ingredient line and its 675 g quantity.
- Add no new salmon species, generic salmon group, smoked/canned form, or duplicate fillet reference.

## Picker and recipe verification queries

Before integration, the search projection was read from the 1,656-reference, 125-form snapshot using the phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The table compares that baseline with the alias projection; it is a static data audit, not an app test.

| Query | Before integration | After integration |
|---|---:|---:|
| `filets de saumon` | 0 | 1 — `salmon fillets / filet de saumon` |
| `filet de saumon` | 1 | 1 — unchanged |
| `salmon fillet` / `salmon fillets` | 1 each | 1 each — unchanged |
| `filets` | 5 fillet identities | 6 fillet identities |
| `filet` | salmon and tilapia fillets | unchanged |
| `salmon` / `saumon` | 9 each | 9 each — unchanged |
| `canned salmon` / `smoked salmon` | 1 each | 1 each — unchanged |

Static corpus and picker checks completed for this integration:

- Scanned every path in `manifest.v1.json`, ingredient rows, and decoded recipe text for salmon and fillet terms; the bundled salmon ingredient count remains one row, recipe 077#10.
- Projected the exact and broad queries against the integrated references and attached forms; `filets de saumon` maps only to the generic fillet row, broad salmon remains multi-result, and bare `filets` remains multi-result.
- Confirmed species queries `saumon de l’Atlantique`, `saumon quinnat`, `saumon kéta`, `saumon coho`, `saumon rose`, and `saumon rouge` still select their corresponding species rows; `saumon fumé` and `saumon en conserve` still select their separate product rows.
- Confirmed no form, density, unit mapping, global substitution, contextual substitution rule, or recipe-line substitution was introduced.

## Source register and ownership notes

New proposal-local source IDs are unique under the R268 prefix and were checked against the current ledger and proposal archive. Access dates below are 2026-10-16.

| ID | Source | Supports and limits |
|---|---|---|
| **WP04-SECTIONP-SALMON-FILLETS-R268-20261016-S01** | Recettes du Québec / IGA, [Filets de saumon à l’aneth](https://www.recettes.qc.ca/recettes/recette/filet-de-saumon-a-l-aneth-196695), page dated 2009-09-03 and checked 2026-10-16. | The Québec-facing recipe uses the plural French phrase; its ingredient line gives four fillets at about 200 g each, and the author’s note permits trout or Arctic char for this particular recipe. It does not specify salmon species, skin state, or a transferable fillet measure. |
| **WP04-SECTIONP-SALMON-FILLETS-R268-20261016-S02** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), sections “Generic common names” and “Labelling of Pacific salmon.” | Single-species fish labelling generally requires the species name; the page gives the named salmon-species examples and rejects “Pacific salmon” as a replacement common name. Label guidance is not a rule for the app’s internal recipe-search identity. This URL is already used by multiple ledger records; this new proposal-local ID has a locator for the exact sections reviewed. |
| **WP04-SECTIONP-SALMON-FILLETS-R268-20261016-S03** | RICARDO, [Pâté au saumon style pot en pot de Ricardo](https://www.ricardocuisine.com/recettes/6174-pate-au-saumon-style-pot-en-pot-de-ricardo). | Confirms the bundled recipe’s French line, 675 g for six portions, and the 450 g / one-pound portion simmered first. This page is explicitly advertising content and is used only to document its linked recipe, not as a general salmon standard. The URL already appears in the ledger under celery with a celery-only locator; this source ID scopes the separate salmon statements. |
| **Reused `WP04-SALMON-TUNA-BOUNDARY-20261011-S02` and `-S06`** | CFIA Fish List salmon query and fish-labelling guidance. | Existing sources support the multiple-species boundary for the unqualified recipe phrase; the sources remain owned by their original records. |
| **Reused `WP04-SEA-GAP-20261009-S01`** | OQLF, [omble chevalier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198861/omble-chevalier). | Supports mapping the source’s `omble de l’Arctique` to the existing Arctic-char species identity, while retaining the preferred display and not adding that non-retained fish-product term as an alias. |
| **WP04-SECTIONP-SALMON-FILLETS-R268-20261016-S04** | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | The overview confirms the CNF 2026 relational-file format and interim status of the 2015 online lookup; it supplies no item-level salmon portion value. |
| **WP04-FINFISH-FOLLOWUP-20261009-S01** | OQLF, [truite arc-en-ciel (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel). | Reused regional-authority source supporting the existing rainbow-trout identity cited by the recipe-context finding. |
| **WP04-SECTIONP-SALMON-FILLETS-R268-20261016-A01** | Read-only audit of the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5914), active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest-listed recipes, the species/product proposals listed above, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Static recipe-demand, active-row, exact-key, source-ID, source-URL, form, numeric, and substitution ownership review. Proposal-local audit label only. |

## Final disposition

**Added** only the Québec French plural search alias `filets de saumon` to the existing generic salmon-fillets reference. **Recorded** the IGA recipe’s approximate one-fillet portion and trout / Arctic-char alternatives only as source-specific ledger evidence with explicit context and limits. Species assignment remains unresolved, all current salmon species and canned/smoked product boundaries are preserved, and no active measure or substitution rule was added. Section P remains open.

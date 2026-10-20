# WP03 Section U — winter savory identity review (R946)

- **Reviewed:** 2026-10-19
- **Status:** Integrated as an identity-only reference; see the [R945–R947 integration README](../batches/wp02-wp03-wp05-r945-r947-generic-gap-integration-20261019/README.md).
- **Scope:** One generic culinary herb identity, winter savory (*Satureja montana* L.), limited to its culinary leaves. No commercial-product roster.
- **Plan anchor:** Section U, “Fresh herbs botanical aromatics and regional flavorings,” at [line 9985](../../RecipeBook-global-ingredient-catalog-plan.txt#L9985). The completed R352 item added summer savory for *Satureja hortensis* and explicitly kept winter savory separate. Section U remains open for other herb coverage, including the checklist at [line 10011](../../RecipeBook-global-ingredient-catalog-plan.txt#L10011). This is a bounded follow-up for the deferred, distinct generic identity.

## Recommendation

Added an identity-only `HERB` reference for **winter savory / sarriette vivace**, scoped to culinary leaves of *Satureja montana* L. Espace pour la vie, Montréal Botanical Garden, gives the species, the French common name `sarriette vivace`, the English common name `winter savory`, and culinary use of fresh or dried leaves. It also distinguishes the plant from common savory (*Satureja hortensis*) by name and characteristics. Kew accepts *S. montana* and records that it is used for food. Together these sources support a separate generic ingredient identity, without relying on a product count or a cultivar distinction. [S01–S02]

Keep summer savory and winter savory separate. Do not change the existing `ingredient-ref-summer-savory`, its aliases, or its evidence. No merge, deletion, reclassification, or transfer of product-specific evidence is proposed.

## Ownership, aliases, and nearby identities

The current bundled package snapshot has **1,964 ingredient references, 205 forms, and 114 manifest-listed recipes with 1,123 ingredient rows**. Searches of active reference and form names and aliases found no owner for `winter savory`, `sarriette vivace`, `Satureja montana`, or the related qualified terms. The 55-entry legacy candidate list has no matching candidate. The only current ledger mention is source S09 on the *summer-savory* record, where the Montréal Botanical Garden page supports keeping *S. montana* separate; it does not own or define a winter-savory reference. No other winter-savory proposal or integration record was found.

The active `ingredient-ref-summer-savory` remains `summer savory / sarriette d’été`, with `summer savory leaves`, `sarriette des jardins`, and `sarriette commune` as aliases. Those names and the R352 evidence apply to *S. hortensis*, not *S. montana*. The integrated row uses only the bilingual display terms directly attested by Espace pour la vie; no additional aliases were added.

| Search term | Current result | Expected result after the proposal |
|---|---|---|
| `winter savory`, `sarriette vivace` | No active identity | The new winter-savory row |
| `summer savory`, `sarriette d’été` | Existing summer-savory row | Existing summer-savory row only |
| `savory`, `sarriette` | Existing summer-savory row | Both savory identities; these broad one-word queries are expected to become ambiguous |
| `Satureja montana` | No active identity | No result; botanical names stay evidence, not picker aliases |
| `sarriette des montagnes`, `winter savoury`, `winter thyme` | No active identity | No result; these terms are not added without a need and direct alias evidence |

The picker searches complete word phrases contained in names and aliases, so generic `savory` and `sarriette` queries match both display names. Do not add `winter thyme` or other thyme wording: it would conflate the savory identity with thyme searches. Keep both savory identities distinct from thyme.

The Section U work considered here is generic herb coverage. Brand, product-line, flavour-family, SKU, or retailer-variant rosters remain out of scope because commercial-product counts do not add ingredient diversity. If a roster-only task appears in the queue, record it as out of scope and stop that line. Preserve all existing branded rows and their product-scoped evidence.

## Recipe-demand check

All **114 manifest-listed recipes and 1,123 ingredient rows** were scanned for `winter savory`, `winter savoury`, `sarriette vivace`, `sarriette des montagnes`, `Satureja montana`, `Satureïa montana`, and `mountain savory`. There were **zero ingredient-row matches and zero recipe-file text matches**. Do not add a recipe link, relink, quantity, or use-specific note. The gap is supported as generic herb coverage by the identity and culinary evidence, even though this bundled snapshot has no matching recipe demand.

## Proposed reference row

The integrated row has no forms:

```json
{
  "id": "ingredient-ref-winter-savory",
  "nameFr": "sarriette vivace",
  "nameEn": "winter savory",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "HERB"
}
```

The source mentions fresh and dried leaves within one culinary identity. It does not establish a recipe need for separate form rows or a fresh-to-dried conversion, so keep forms, mappings, density, measures, conversions, yields, and active substitutions empty.

## Proposed ledger state and evidence limits

The `ingredient_reference` ledger record for `ingredient-ref-winter-savory` has:

- `identityState: verified`;
- `measurementState: not_yet_researched`;
- `substitutionResearchState: not_yet_researched`;
- source IDs `WP03-SECTIONU-WINTER-SAVORY-R946-20261019-S01` and `...-S02`;
- no measurement observations, forms, recipe links, conversions, yields, or active substitutions.

Espace pour la vie says a small amount is sufficient and recommends adding the leaves near the end of cooking. Those are general culinary tips, not a reusable numeric quantity, measure, timing rule for all recipes, or substitution rule. Its plant dimensions, hardiness, and growing details are horticultural and do not become ingredient measurements. Kew supports accepted taxonomy and general food use; it does not establish a Québec name, culinary part, form mapping, or quantity. No manufacturer or retailer source is used. Keep the R352 S09 source attached to its existing summer-savory record as contrast evidence; if an integration adds S01 for the new identity, record it as a separate source entry rather than transferring or moving S09.

## Sources

Sources were accessed 2026-10-19. The source IDs below are proposal-local; this proposal has not written them to the shared ledger.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-SECTIONU-WINTER-SAVORY-R946-20261019-S01** | Espace pour la vie, Montréal Botanical Garden, [Sarriette vivace](https://m.espacepourlavie.ca/carnet-horticole/sarriette-vivace). | Identifies *Satureja montana* as `sarriette vivace / winter savory`, distinguishes it from *S. hortensis*, and describes fresh or dried leaves for seasoning foods. The “small amount” and late-cooking advice are not transferable quantities or universal recipe rules; horticultural size and growing facts are not culinary measurements. |
| **WP03-SECTIONU-WINTER-SAVORY-R946-20261019-S02** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Satureja montana* L.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:457736-1). | Accepts *S. montana* and states that it is used for food. Supports current taxonomy and generic food use, not Québec terminology, recipe forms, or measures. |

## Preservation and reopen criteria

The separate, identity-only winter-savory row is integrated. Preserve the summer-savory identity, its existing branded entries, and all current product-scoped measurements and source records. Revisit aliases, forms, measurements, or substitutions only when specific recipe demand or appropriately scoped evidence supports those decisions.

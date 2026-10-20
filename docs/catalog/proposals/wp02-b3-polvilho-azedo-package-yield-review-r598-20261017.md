# WP02 B3 R598 — polvilho azedo package-yield evidence review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Accepted and integrated; one product-specific ledger observation was added, with no active catalog measure or conversion behavior.
- **Scope:** One product-specific package-mass observation for the existing `ingredient-ref-brazil-polvilho-azedo` identity. This does not answer a household-volume, density, or substitution question.
- **Open plan anchors:** The B3 flour/starch group remains unchecked at [line 3042](../../RecipeBook-global-ingredient-catalog-plan.txt#L3042); its child identity and Québec alias work for `polvilho azedo` is complete. The broader WP02 B2/B3 review remains open at [line 15872](../../RecipeBook-global-ingredient-catalog-plan.txt#L15900). R585 pea-starch evidence, R588 cornstarch portions, R591 sweet-potato-starch measures, and R595 generic tapioca-starch chart portions are separate completed reviews.
- **Prior-work boundary:** WP02-POLVILHO-LABELS added separate source-named `polvilho doce` and `polvilho azedo` references. The Québec alias `farine de polvilho azedo` is already integrated. R202 held the broader `amidon aigre de manioc` wording outside the picker. R598 proposes no new identity, alias, or French term; it concerns only one named Da Terrinha Azedo package.

## Recommendation

**Integrated evidence-only add:** appended one `package_yield` observation to the existing `ingredient-ref-brazil-polvilho-azedo` ledger record for one Da Terrinha `Polvilho Azedo 500 g` package. The manufacturer's current product page lists the Azedo and Doce products separately at 500 g; its 2020 official catalog assigns the Azedo package internal item 48163 and EAN `7898960982978`; a current Canadian retailer page shows that same barcode, a 500 g listing, and separate AZEDO/DOCE choices [S01–S03].

This establishes only a named product's package mass. The ledger `measurementState` is `researched_no_supported_value` because the reviewed sources do not provide a transferable kitchen measure or density. The package observation stays as ledger evidence; it was not added to active package-yield data and creates no conversion or recipe behavior.

If accepted, the single observation should be bounded as follows:

```json
{
  "observationId": "wp02-b3-polvilho-azedo-da-terrinha-500g-package-r598-20261017",
  "relationship": "package_yield",
  "value": 500,
  "valueUnit": "g",
  "foodDescription": "Da Terrinha Polvilho Azedo, one 500 g package (internal item 48163; EAN 7898960982978).",
  "foodState": "Dry product as sold.",
  "measurementMethod": "The current manufacturer listing names Polvilho Azedo 500 g; the official catalog identifies the 500 g item and EAN; the current Canadian listing shows the matching barcode and AZEDO option.",
  "quantityBasis": "One named product package only; not a serving, household measure, density, or generic polvilho azedo package size.",
  "sourceQuantity": { "amount": 1, "unit": "package" },
  "observedMassG": 500,
  "evidenceKind": "manufacturer_label",
  "sourceIds": [
    "WP02-B3-POLVILHO-AZEDO-PACKAGE-R598-20261017-S01",
    "WP02-B3-POLVILHO-AZEDO-PACKAGE-R598-20261017-S02",
    "WP02-B3-POLVILHO-AZEDO-PACKAGE-R598-20261017-S03"
  ]
}
```

## Existing ownership and picker effect

The active reference is already the source-named identity `ingredient-ref-brazil-polvilho-azedo`, displayed as `sour cassava starch (polvilho azedo)` / `polvilho azedo`, category `FLOUR_AND_STARCH`. Its French alias `farine de polvilho azedo` is already present. `defaultDensity` is `null`, `unitMappings` is empty, and no ingredient form is attached. The ledger identity is verified; measurement research is now `researched_no_supported_value` with one product-specific package observation, while substitution research remains `not_yet_researched` with zero substitution findings.

Keep related identities separate: `ingredient-ref-brazil-polvilho-doce`, generic `ingredient-ref-tapioca-starch`, whole-root `ingredient-ref-cassava-flour`, and the native-waxy-tapioca reference. The manufacturer's catalog lists sweet and sour polvilho as distinct items; its sour product's package mass does not make them interchangeable or establish a shared cooking measure.

No catalog term changes are proposed, so the picker is unchanged. The current complete-phrase search projection is:

| Search query | Current result |
|---|---|
| `polvilho azedo` | `ingredient-ref-brazil-polvilho-azedo` only |
| `farine de polvilho azedo` | `ingredient-ref-brazil-polvilho-azedo` only |
| `sour cassava starch` | `ingredient-ref-brazil-polvilho-azedo` only |
| `cassava starch` | Sour polvilho, sweet polvilho, and native-waxy tapioca starch |

The current French display and alias remain unchanged. The Toronto-area retailer listing is in Portuguese/English and is not Québec French terminology evidence. Keep `farine de polvilho azedo` as the existing exact local retail alias, and retain R202's hold on `amidon aigre de manioc`; this product-size evidence does not justify either a new French name or a broader alias.

## Measures, forms, and substitutions

- Add no `IngredientForm`, package-size default, volume measure, density, unit mapping, conversion, active package-yield entry, or recipe link. The single package mass is not a cup/spoon portion or mass-volume observation.
- Keep `defaultDensity: null` and `unitMappings: []`. The measurement state describes the absence of a supported reusable kitchen measure or density; it does not erase or generalize the product-specific ledger observation.
- Keep `substitutionResearchState: not_yet_researched` and add no substitution finding or active rule. None of the cited product listings tests replacement of another starch or polvilho product.

## Bundled recipe demand

A manifest-ordered scan covered all **114** bundled recipes and **1,123** structured ingredient rows. It found zero direct links to `ingredient-ref-brazil-polvilho-azedo` and zero recipe-text or ingredient-row matches for `polvilho azedo`, `sour cassava starch`, `farine de polvilho azedo`, `Da Terrinha`, or EAN `7898960982978`. No recipe demand supports adding a recipe link, package conversion, or substitution.

## Source register and ownership audit

The three source IDs below are new to this proposal. Their exact URLs were not assigned to another record in the active research ledger or the proposal/batch archive. The old manufacturer catalog entry's EAN and the proposed observation ID were also collision-checked against the active seed package and catalog archive. No existing source ID is being reused.

| Source ID | Direct source and locator | Support and boundary |
|---|---|---|
| **WP02-B3-POLVILHO-AZEDO-PACKAGE-R598-20261017-S01** | Da Terrinha Alimentos, [Farináceos](https://www.daterrinhaalimentos.com/pt/farinaceos), current manufacturer page; accessed 2026-10-17. | Product list separately names `Polvilho Azedo 500g` and `Polvilho Doce 500g`. Supports the current manufacturer product names and listed package size only; it supplies no household measure or density. |
| **WP02-B3-POLVILHO-AZEDO-PACKAGE-R598-20261017-S02** | Da Terrinha Alimentos, [2020 unified product catalog](https://www.daterrinhaalimentos.com.br/wp-content/uploads/2020/10/CATALOGO_UNIFICADO_DT_6D_WA.pdf), parser page `P8`, lines 202–204; accessed 2026-10-17. | Lists `Polvilho Azedo Da Terrinha 500g`, internal item 48163, EAN `7898960982978`, and the separate 500 g Doce SKU. This older catalog corroborates package identity and barcode; it is not used to assert current stock. |
| **WP02-B3-POLVILHO-AZEDO-PACKAGE-R598-20261017-S03** | Brazilian Market, [Polvilho 500g (Da Terrinha)](https://brazilianmarket.ca/products/polvilho-da-terrinha), current listing with Mississauga address; accessed 2026-10-17. | Page-level SKU/barcode matches the manufacturer's Azedo EAN; the listing states `500gr` and displays separate AZEDO and DOCE options. Because this is a multi-variant page, retain the match as corroboration for its AZEDO choice rather than claiming that the two variants share a barcode or stock status. It does not provide a kitchen measure. |

The existing Quebec naming decision is documented in the [polvilho Québec alias integration](../batches/wp02-polvilho-azedo-quebec-alias-integration-20261012/README.md). The separate `amidon aigre de manioc` hold is documented in the [R202 naming review](wp02-section-04-b2-polvilho-amidon-aigre-quebec-naming-review-r202-20261016.md).

## Static review checks

- [x] Read `AGENTS.md`, `roadmap.md`, the open B3 checklist, and the broad WP02 B2/B3 plan parent; confirmed R585, R588, R591, and R595 are separate completed work.
- [x] Checked the active reference, ledger state, existing French alias, forms, global/contextual substitution rules, and active package-yield file; the target has no form, substitution entry, or active package-yield entry.
- [x] Checked picker ownership for the source name, existing French retail alias, English display phrase, and broad `cassava starch` collision; the proposed ledger-only evidence adds no search term.
- [x] Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; found no direct target link or relevant phrase/product-code match.
- [x] Audited the exact source URLs, proposed source-ID namespace, observation ID, and EAN for existing ownership or collisions in the ledger, seed package, and proposal/batch archive.
- [x] Verified the direct manufacturer page, manufacturer catalog, and Canadian retailer listing; the scope stays with one 500 g named package and no claim beyond package mass.
- [x] Integrated only into research-ledger JSON; no active package-yield data, reference names, forms, conversions, recipe links, or substitutions changed. No app tests, build, emulator run, or deployment were needed under the current `AGENTS.md` database-JSON rule.

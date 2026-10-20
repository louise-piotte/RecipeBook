# WP03 Section I — pine-nut plural alias review (R364, 2026-10-16)

- **Status:** Integrated on 2026-10-16; see the [integration README](../batches/wp03-section-i-pine-nut-plural-alias-integration-r364-20261016/README.md). The existing pine-nut reference and ledger evidence were updated; recipe data and application code were unchanged.
- **Scope:** One French search alias for the existing whole pine-nut identity. This does not reopen nut identity, forms, measurements, or substitutions.
- **Proposal-time snapshot:** 1,694 active references, 139 forms, 56 legacy candidates, 2,050 research-ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows.

## Recommendation

Add the qualified French alias **`pignons de pin`** to existing `ingredient-ref-pine-nuts` (`pine nuts / noix de pin`). Keep the ID, displays, English aliases, category, density, mappings, forms, recipe links, and substitution state as they are. Do not add singular `pignon`, `pigne`, or `pignoles` as aliases in this change.

The OQLF recognizes `pignon` as a food term, and the Government of Québec uses `pignons de pin` while giving `noix de pin` as an alternate name. A Canadian marketplace listing snapshot accessed for this review also labels the item `Pignons de Pin`; it does not establish current availability. The live picker currently has no result for `pignons` or `pignons de pin`; the qualified plural term has no active or legacy owner. This fills one narrow retrieval gap without moving the singular `pignon` query from the distinct pine-nut-butter row.

## Plan fit and prior coverage

The Section I checklist has already accepted the whole-kernel pine-nut identity. It remains open for wider seed coverage, useful kernel forms, butters/pastes, and other plant-food review. This proposal addresses only the unowned French plural product wording and does not close any checklist item.

The 2026-10-09 tree-nut coordinator noted that OQLF's singular `pignon` should be added only if the picker needs it, because it can be ambiguous. The 2026-10-11 independent Québec review reused the Government of Québec page to support the separate display `beurre de pignon de pin`; it did not assign `pignons de pin` to the whole-kernel reference. The current query projection below supplies the missing retrieval check. This is distinct from the held raw-cashew form review (R361), the oolong identity review (R362), and the WP02 winged-bean-flour measurement review (R360).

## Identity and current ownership

The active whole-seed row is `ingredient-ref-pine-nuts`, displayed as `pine nuts / noix de pin`, category `NUT_SEED_AND_DRIED_FRUIT`, with empty alias arrays, `defaultDensity: null`, and no unit mappings. Its ledger record marks identity verified; measurement and substitution research remain `not_yet_researched`.

The adjacent `ingredient-ref-pine-nut-butter` is a separate `FAT_AND_OIL` identity displayed as `pine nut butter / beurre de pignon de pin`. It has no aliases or forms. No active ingredient form owns `pignon`, `pignons`, `pignons de pin`, `pignoles`, or `pigne`; the unrelated `crushed pineapple` form is not a pine-nut form. The legacy-candidate file has no matching candidate. The exact normalized scan found no whole-kernel owner for `pignons` or `pignons de pin`.

The proposed alias is a French retail/culinary term for pine seeds, not a species assignment. The Québec government page discusses seeds from stone pine (*Pinus pinea*); neither it nor the product page assigns a taxon to the current generic catalog identity. Keep the whole-kernel identity generic.

## Picker projection

This static projection follows `IngredientReferenceSearchIndex` in `IngredientSearch.kt`: it uses complete normalized word phrases before substring fallback, with forms indexed under their parent references.

| Query | Current picker owner | Projection with `pignons de pin` on `ingredient-ref-pine-nuts` |
|---|---|---|
| `pine nuts` | `ingredient-ref-pine-nuts` | Same |
| `noix de pin` | `ingredient-ref-pine-nuts` | Same |
| `pignons` | No result | `ingredient-ref-pine-nuts` through the plural word in the full alias |
| `pignons de pin` | No result | `ingredient-ref-pine-nuts` only |
| `pignon` | `ingredient-ref-pine-nut-butter` | Same; do not add the singular alias |
| `pignon de pin` | `ingredient-ref-pine-nut-butter` | Same; the singular compound remains with the butter display |

The plural alias does not collide with the current pine-nut-butter display, which uses singular `pignon`. Keeping `pignon` off the whole-seed row preserves the previously reviewed exact singular behavior rather than making it return both kernel and butter.

## Recipe demand and boundaries

The full manifest scan found one direct whole-pine-nut ingredient row: recipe `102#8`, `2 tbsp pine nuts`, linked to `ingredient-ref-pine-nuts`. The linked RICARDO recipe lists `30 ml (2 c. à soupe) de noix de pin (facultatif)`; the saved row does not carry the publisher's optional flag. Keep the saved row and its amount unchanged. The recipe supplies direct demand for the existing identity, but it does not require a new form or link.

RICARDO's team note suggests replacing the pine nuts with hazelnuts, walnuts, or pistachios for this particular chocolate sausage. That is recipe-specific variant guidance, not a tested or global substitution rule. Add no substitution.

The product listing below shows a product-specific `1/4 cup (30 g)` serving. The linked recipe asks for 2 tablespoons and gives no mass; this alias review does not transfer, halve, or convert the product serving. Keep `defaultDensity` null, `unitMappings` empty, and all form and package-yield data unchanged. Neither the row nor the source establishes roasted, raw, salted, or unsalted state.

## Sources and source-ID audit

| Source ID | Direct source | Claim and limit |
|---|---|---|
| `WP03-NUTS-20261009-S08` (existing; reuse) | OQLF, [*pignon*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon) | Lists `pignon`, `pigne`, and `noix de pin` as preferred French food terms and gives English `pine seed`, `pine nut`, and `pignoli`. Its earlier ledger note withheld the unqualified singular alias because of picker ambiguity. |
| `WP03-PINE-NUT-BUTTER-QC-20261011-S01` (existing; reuse) | Government of Québec, [*Pignons de pins*](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/salubrite-aliments-domicile/preparation-aliments-cuisson-securitaires/precautions-manipule-aliments/pignons-de-pins) | Uses `pignons de pin`, calls them `noix de pin` or `pignoles`, and describes culinary use. The page's stone-pine scope is not assigned to the catalog row. This source was already recorded for the pine-nut-butter display review and is not proposed for duplicate registration. |
| `WP03-I-PINE-NUT-PLURAL-ALIAS-R364-20261016-S01` (registered on integration) | Walmart Canada, [NOW Foods Real Food Organic Raw Pine Nuts](https://www.walmart.ca/fr/ip/NOW-Foods-NOW-Real-Food-Pignons-de-Pin-Biologiques-Crus-8-oz/42RK51A8WI1F) | Current French listing calls the product `Pignons de Pin` and places it in the `Pignons` product category. It supports present-day Canadian product wording only; the page identifies a third-party seller, does not report species, and is not used for its product-specific serving or preparation claims. |
| `WP02-D-DARK-CHOCOLATE-R329-20261016-S03` (existing; reuse without duplicate registration) | RICARDO, [*Saucissons de chocolat*](https://www.ricardocuisine.com/recettes/3769-saucissons-de-chocolat) | The current recipe calls for 2 tablespoons / 30 ml of `noix de pin` and marks it optional. This source ID is already represented in the ledger for the chocolate line in the same recipe; its prior support note does not cover pine nuts, so this proposal cites the page directly without duplicating the source record. The recipe-specific alternatives do not support a global substitute. |

The R364 source-ID prefix `WP03-I-PINE-NUT-PLURAL-ALIAS-R364-20261016-S` and the requested proposal path were absent from the ledger, proposal archive, and batch archive before drafting. The OQLF and Québec-government sources above reuse their existing source IDs. No new source ID is allocated for the RICARDO page because the same page is already registered for recipe 102's chocolate line. The exact terms, active reference/form owners, legacy candidates, and static picker projection were checked against the live package snapshot listed above.

## Integration boundary

Integration added only `pignons de pin` to `ingredient-ref-pine-nuts.aliasesFr` and attached the OQLF, Government of Québec, and Canadian marketplace evidence to that identity review. It preserved all display names, recipe data, forms, numeric fields, and substitution states. Section I remains open.

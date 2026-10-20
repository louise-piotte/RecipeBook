# WP03 Section G corn- and flour-tortilla boundary review — 2026-10-10

- **Packet type:** proposal-only identity, search, and fr-CA naming review. No canonical files changed.
- **Recommendation:** integrate two distinct identity-only catalog entries with no recipe relinks: corn tortillas and flour tortillas. Reuse the unresolved legacy ID `ingredient-ref-flour-tortillas` for the flour-tortilla entry; reserve `ingredient-ref-corn-tortillas` for corn tortillas. The manifest-listed corpus has no tortilla ingredient rows.
- **Online source access date:** 2026-10-10.

## Checklist mapping and prior work

The [active Section G checklist](../../../docs/RecipeBook-global-ingredient-catalog-plan.txt) still lists “Corn/wheat tortillas, pita, lavash, naan, roti, paratha, injera, flatbread, bread rolls, sandwich bread, sourdough bread, and regional breads used as ingredients.” The earlier [Mexico and Central America gap sweep](wp06-mexico-central-america-gap-sweep-20261009.md) mentioned tortillas as a prepared food and explicitly left product/catalog decisions outside its identity review. The existing [masa harina boundary notes](../batches/masa-harina-identity.md) distinguish masa harina from other maize products, but do not define finished tortilla identities. This packet addresses the two tortilla product classes only; other flatbreads and breads remain open.

## Current snapshot and recipe demand

Snapshot read 2026-10-10. I checked all 114 manifest-listed recipe files and all 1,123 ingredient rows. The row scan covered `originalText`, `ingredientName`, `ingredientRefId`, preparation, and notes for tortilla/tortillas, tortilla chips, wraps, and French corn/flour-tortilla variants. There are **0 matching ingredient rows** and therefore no recipe-line IDs or relinks to report. No recipe path was changed. The ordered corpus digest is SHA-256 over each manifest-relative path, a NUL byte, and its raw file bytes, concatenated in manifest order.

| Artifact | Current count | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| [Seed manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipes | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| [Ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 872 references | 274,909 | `4af290779e837b1e3562296bcbde3928c7079e7c0e94a9a30372f88e58f1307c` |
| [Ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 48 forms; no tortilla form | 33,483 | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| [Research ledger](../research-ledger.v1.json) | 1,118 records | 2,860,034 | `17b9c3db25ff6ed280a914c7432084e29b799f73c182d588ebe2601932252fcc` |
| [Legacy identity candidates](../legacy-import-identities.v1.json) | 78 candidates | 18,736 | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipe corpus | 1,123 ingredient rows; 751,959 recipe-file bytes; 0 tortilla rows | — | Ordered digest `009a0dbd340a3e85e8a6809bc19e871f911b110357b127d55f7eb50c0cbf1055` |

The legacy catalog has one matching candidate: `ingredient-ref-flour-tortillas`, displayed as `flour tortillas` / `tortillas de farine`, with no aliases and `reviewState: unreviewed`. Its [ledger record](../research-ledger.v1.json) is a candidate with identity `unreviewed`; measurement and substitution research are `not_yet_researched`; it has no attached sources. There is no legacy corn-tortilla or tortilla-chip candidate.

## Active identities, forms, and exact-key collisions

No active reference ID or alias contains `tortilla`; no exact normalized match exists for `tortilla(s)`, `corn tortilla(s)`, `flour tortilla(s)`, `tortilla(s) de maïs`, `tortilla(s) au maïs`, `tortilla(s) de farine`, or `tortilla(s) de farine de blé`. The active forms file has no tortilla form or product-state entry. No current `tortilla chips` identity or exact collision was found.

The closest active maize ingredient references checked are:

| Active ID | Current display | Keep distinct from finished tortillas because… |
| --- | --- | --- |
| `ingredient-ref-masa-harina` | `masa harina` / `farine de maïs nixtamalisée` | It is a dry nixtamalized flour used to make dough, not a finished tortilla. Its existing identity has a separate boundary review. |
| `ingredient-ref-cornmeal` | `cornmeal` / `semoule de maïs` | It is meal, not a finished flatbread. |
| `ingredient-ref-whole-kernel-corn-flour` | `whole-kernel corn flour` / `farine de maïs` | Flour product, not a tortilla. |
| `ingredient-ref-precooked-corn-flour` | `precooked corn flour` / `farine de maïs précuite` | Separately processed flour product, not a tortilla. |
| `ingredient-ref-roasted-corn-flour` | `roasted corn flour` / `farine de maïs torréfiée` | Roasted flour product, not a tortilla. |

Do not merge a finished tortilla into any of these ingredients or use their names as aliases. There is no active generic `tortilla`, flour-tortilla, corn-tortilla, wrap, or tortilla-chip reference to merge. If the owner accepts flour tortillas, resolve the legacy candidate into the one active reference; do not create a second flour-tortilla ID.

## Product boundary and identity recommendations

OQLF defines *tortilla* as an unleavened flatbread made with corn or wheat flour and gives `tortilla` as the preferred French term. It notes that traditional tortillas use maize dough [S01]. Manufacturer and Québec-market sources publish corn and flour/wheat tortillas as separate product categories [S02–S06]. That supports two composition-specific identities rather than treating corn and wheat tortillas as forms or aliases of one undifferentiated catalog item.

| Target | Recommendation | Proposed English display / aliases | Proposed fr-CA display / aliases | Boundary and integration action |
| --- | --- | --- | --- | --- |
| Corn tortillas | **Integrate as identity-only coverage**; proposed ID `ingredient-ref-corn-tortillas`. | Display `corn tortillas`; alias `corn tortilla`. | Display `tortillas de maïs`; aliases `tortilla de maïs`, `tortillas au maïs`, `tortilla au maïs`. | Product name supported by a Québec manufacturer and local product directory [S03, S05]; `tortilla au maïs` is also current Québec retail wording [S06]. Keep distinct from flour tortillas, masa harina, cornmeal, flour, and tortilla chips. No recipe relink. |
| Flour tortillas (wheat-flour commercial type) | **Integrate as identity-only coverage by resolving the legacy candidate** `ingredient-ref-flour-tortillas`; do not allocate a new ID. | Display `flour tortillas`; alias `flour tortilla`. | Display `tortillas de farine`; aliases `tortilla de farine`, `tortillas de farine de blé`, `tortilla de farine de blé`. | The existing legacy French display matches Canadian retail and local manufacturer wording; the French product sources explicitly identify wheat flour [S04, S07]. Keep separate from corn tortillas, tortilla chips, wraps as use, and other flatbreads. No recipe relink. |

These are generic product identities, not brand, size, flavor, grain blend, or dietary claims. In particular, do not add `tortilla` / `tortillas` alone as an alias to either entry: OQLF uses the unqualified term for both corn- and wheat-flour products, so the type qualifier is needed to select the intended identity. Do not add `wrap(s)` or `tortilla chip(s)` as aliases. Whole-wheat, multigrain, flavored, gluten-free, or mixed-grain product wording should retain its qualifier on any future exact recipe line; this packet does not model those as forms or equivalents.

## Chips, wraps, and other flatbreads

- **Tortilla chips / croustilles de tortilla:** Casa Bonita separately describes soft corn tortillas and corn tortilla chips [S04]. Chips are a further processed product, not an alias or form inferred for a soft tortilla. No tortilla-chip reference or recipe demand was found; do not create it in this packet.
- **Wraps / roulés:** Mejicano describes its tortillas as a product that can be rolled around fillings to make wraps, or cut and baked into homemade chips [S03]. This is evidence of use and preparation, not evidence that `wrap` is a synonym for a plain tortilla product. Do not assign the broad word `wrap` to either proposed identity.
- **Pita and other flatbreads:** OQLF’s tortilla term is a named Mexican/Latin American product, not an umbrella synonym for pita, naan, lavash, roti, paratha, injera, or generic flatbread [S01]. A Québec retailer groups tortillas and pita in an aisle taxonomy but lists separate products [S06]; aisle grouping does not establish identity equivalence.
- **Masa and maize flours:** Existing active references identify inputs or other maize products, not the prepared tortilla [S08]. Keep their present identities and do not infer a recipe conversion or substitution.

## Alias collision and search-suggestion caveats

An exact normalized-name/alias scan over all 872 active references and 48 forms found no current exact owner for any proposed corn- or flour-tortilla phrase. The one legacy flour-tortilla candidate is not in the active reference search index. The two proposed qualified name sets are mutually distinct.

The app’s [ingredient search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds accents and punctuation, first finds complete word phrases, and then falls back to substring matching. If both proposed entries are integrated, broad queries such as `tortilla` or `tortillas` can suggest both; that is an expected ambiguous query, not a canonical-name collision. Qualified searches such as `corn tortillas`, `tortillas de maïs`, `flour tortillas`, and `tortillas de farine` should identify only their corresponding entry. Avoid a bare `tortilla(s)` alias, because it would deliberately duplicate an already ambiguous generic term. Full `tortilla chips` wording does not match either proposed qualified display; if chips are later brought into scope, give them a separate name and rerun the search-collision audit.

## Measures, forms, substitutions, and recipe fixtures

There are no current tortilla forms, measure records, unit mappings, or substitution records. The proposed identities have no ingredient rows; leave density, package yield, count-to-mass mapping, volume conversion, form state, and substitution behavior **unknown / not yet researched**. Retail package weights and counts in sources are product-specific and are not calibration data. No `corn ↔ flour tortilla` substitution or tortilla-to-wrap/chip conversion is proposed.

If these candidates are integrated, focused catalog/search checks should confirm:

1. `corn tortilla(s)` and the supported French corn-tortilla names resolve only to `ingredient-ref-corn-tortillas`.
2. `flour tortilla(s)` and the supported French flour-tortilla names resolve only to the reused `ingredient-ref-flour-tortillas`.
3. `tortilla` / `tortillas` may return both qualified products; no generic identity is selected by the broad query.
4. `tortilla chips`, `wrap`, `pita`, `masa harina`, and `cornmeal` do not become aliases of either proposed tortilla identity.
5. Neither candidate creates a form, conversion, yield, substitution rule, or recipe relink.

## Sources and access limits

All sources below were accessed on 2026-10-10.

| ID | Source and support | Access note |
| --- | --- | --- |
| **S01** | Office québécois de la langue française, [*tortilla* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502282/tortilla). Defines the general food as an unleavened corn- or wheat-flour flatbread, gives preferred French `tortilla` and English `tortilla`, and notes the traditional corn-dough process. | Direct page opened. Terminology authority; does not define separate retail aliases for each subtype. |
| **S02** | Mission Foods Canada, [Products](https://www.missionfoods.ca/products/). Its manufacturer catalog has separate `Corn Tortillas` and `Flour Tortillas` categories. | Direct English page opened. Product taxonomy evidence, not French terminology authority. |
| **S03** | Les Aliments Mejicano, [French manufacturer site](https://mejicano.ca/). The Québec maker separately describes its 6-inch corn tortillas and its wheat-flour tortilla range; it explains that tortillas can be wrapped around fillings or cut and baked as chips [relevant sections: Maïs, lines 230–232; product use, lines 190 and 218; flour range, lines 127–129]. | Direct page opened. Manufacturer naming and use evidence; its descriptions are not a general product standard. |
| **S04** | Casa Bonita Foods, [French product site](https://casabonitafoods.com/fr/). Describes soft corn tortillas separately from `croustilles de tortilla de maïs` / tortilla chips. | Direct page opened. Manufacturer product-family distinction; not used for composition, quantities, or substitution. |
| **S05** | Aliments du Québec, [*Tortillas de maïs*](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/tortillas-de-mais). Lists a Mejicano corn-tortilla product as locally prepared and available through Québec retailers, using the display `Tortillas de maïs`. | Direct page opened. Local product and naming evidence only; listed pack data is not a general conversion. |
| **S06** | Mayrand, [*Tortilla au maïs 4,5'' x12*](https://mayrand.ca/fr/nos-produits/boulangerie/tortilla-et-pain-pita/tortilla-au-mais-45-mejicano-37010). Uses the French retail label `Tortilla au maïs`; nearby listings separately label wheat products `Tortilla au blé entier`. Its aisle route also groups tortillas and pita without identifying them as the same product. | Direct Québec retailer page opened. Availability and product titles can change; retailer evidence only. Product size/pack information is not used as a measure conversion. |
| **S07** | Aliments Torticana, [French manufacturer site](https://torticanafoods.com/). Uses `tortillas de farine` in recipe ingredient descriptions and describes its Montreal-made tortillas as wheat and whole-wheat products. | Direct page opened. Local manufacturer terminology and product context; not an official terminology source. |
| **S08** | [Current seed ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [current masa harina boundary notes](../batches/masa-harina-identity.md), and the [research ledger](../research-ledger.v1.json). These establish the nearby active cornmeal, masa harina, and corn-flour identities and their existing scope. | Local source snapshot. No tortilla identity or product-state evidence is present in those current catalog records. |

Mission’s French product detail page was also surfaced in search results with the label `Tortillas de farine`, but a direct open returned a cache-miss error. This packet does not rely on its full page; the French label and wheat-flour context are independently supported by S03, S06, and S07.

## Remaining Section G work

The tortilla portion of the checklist can be covered by the two identity-only recommendations above, with zero recipe relinks and no numeric behavior. Pita, lavash, naan, roti, paratha, injera, flatbread, rolls, sandwich bread, sourdough bread, and regional breads remain unreviewed. Generic tortilla, tortilla-chip, and wrap aliases remain deliberately absent.

## Integration outcome

Integrated on 2026-10-10 as `ingredient-ref-corn-tortillas` and the reused legacy
`ingredient-ref-flour-tortillas`. The references retain the qualified product names and the narrow
French aliases above. No recipe rows, forms, density, unit mappings, measurements, conversions,
yields, or substitutions were added. Picker regression coverage verifies that a broad `tortilla`
query can suggest both qualified products while `tortilla chips` remains outside them. See the
[catalog product-boundary batch report](../batches/catalog-product-boundary-followup-20261010/README.md).

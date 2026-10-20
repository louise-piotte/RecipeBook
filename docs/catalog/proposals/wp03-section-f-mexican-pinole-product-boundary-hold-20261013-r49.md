# WP03 Section F — Mexican pinole product boundary hold (R49, 2026-10-13)

- **Decision:** Keep Mexican `pinole` unallocated pending a product-level boundary decision. Do not add an active reference, alias, form, ledger record, measurement, conversion, or substitution in this proposal.
- **Scope:** Dry Mexican pinole made from toasted ground maize, including documented plain and sweetened/spiced versions. This review does not cover Central American `pinolillo`, prepared atole/champurrado, or the separate generic corn products already catalogued.
- **Open checklist:** The plan still asks for “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” at [Section F line 2530](../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
- **Recommendation:** Hold the bare word `pinole` out of the picker until a Canadian or Québec-facing package or product specification establishes whether the intended row is plain toasted corn flour or a formulated powder. The Québec-facing French evidence supports keeping the name `pinole`, but does not settle that product boundary.

## Review boundary and prior work

The Mexican agricultural sources establish pinole as a real regional maize preparation: toasted corn is ground into a fine powder, with source-specific additions such as cinnamon, piloncillo, or sugar [S01–S03]. Current product pages also show materially different formulations: one product lists only roasted ground blue corn, while another describes red corn with anise, cinnamon, and sugar [S06, S07]. A name-only `pinole` row could therefore overlap the existing plain roasted-corn-flour identity while also covering composite powders.

There is one prior repository mention, but no focused decision: the 2026-10-09 WP06 Mexico/Central America sweep included `pinolillo` among its broad corpus queries and reported no pinolillo candidate hit. That scan did not review Mexican `pinole` or assign it an owner. The live Section F checklist, roadmap, archive, catalog, legacy candidates, and ledger contain no prior pinole disposition.

## Product and naming boundary

| Boundary | Source-backed finding | Catalog treatment in this hold |
|---|---|---|
| **Core product** | Mexico’s agriculture ministry describes pinole/piznate in Nayarit and Sinaloa as toasted, ground maize prepared with water and, depending on the preparation, cinnamon or piloncillo [S01]. The Chihuahua state source documents a Ralámuli version made by roasting and repeatedly grinding maize to fine flour, then sweetening it with piloncillo or sugar [S02]. | The common toasted-maize base is well supported; the sources describe regional preparations rather than one package formula. |
| **Formula range** | A current blue-corn product lists only organic roasted ground blue corn [S06]. A separate current Mexican product describes roasted red corn with anise, cinnamon, and sugar [S07]. The Chihuahua source also describes sweetened powder and beverage, cookie, and dessert uses [S02]. | Do not use `pinole` as an alias for a generic flour or assume all products are single-ingredient. Keep formulated drink powders out until an exact package scope is selected. |
| **Québec French naming** | A Québec-based French-language organization uses `pinole` in its report about a Mexican corn-processing cooperative [S04]. A Montréal bakery menu uses `Polvorón Pinole` and explains the cookie is made with roasted corn flour and Mexican cinnamon [S05]. | If a product-specific identity is later accepted, the evidence supports the unchanged display `pinole` in French. These are not Québec terminology rulings or dry-package labels. Do not add `farine de maïs grillée` as an alias: that phrase describes an ingredient and would broaden the match. |
| **Adjacent spellings and foods** | A previous cuisine sweep queried `pinolillo`, but did not find a matching bundled ingredient row. The current ministry source places `piznate` alongside pinole in a regional beverage entry; it does not establish a package-name alias for a dry ingredient [S01]. | Keep `pinolli`, `pinolillo`, and `piznate` unassigned as aliases. Do not fold atole, champurrado, or other drinks into the dry ingredient. |

## Exact ownership and picker effects

At this snapshot, the active catalog has **1,370 references** and **100 forms**; the legacy-import file lists **64 candidates**, and the research ledger contains **1,700 records**. Exact case-insensitive scans for `pinole`, `pinolli`, `pinolillo`, `pinol`, and `piznate` found no owner in any of those artifacts. No `WP03-F-PINOLE-R49-20261013-S…` source IDs were present before this proposal.

| Current owner | Exact boundary | Effect of the hold |
|---|---|---|
| None for `pinole`, `pinolli`, `pinolillo`, or `piznate` | No active reference, form, legacy-import candidate, or ledger record owns these names. | Keep all four queries at zero results. Do not add an alias to an adjacent row. |
| `ingredient-ref-roasted-corn-flour` — `roasted corn flour / farine de maïs torréfiée` | `FLOUR_AND_STARCH`; no aliases or forms; `defaultDensity` is null and `unitMappings` is empty. This generic flour has a shared toasted-corn base with some plain pinole descriptions, but does not define sweetened or spiced pinole products. | Do not assign `pinole` to this row. Revisit whether a plain, single-ingredient product is a distinct regional identity only after an exact product label or specification is selected. |
| `ingredient-ref-cornmeal` — `cornmeal / semoule de maïs` | `FLOUR_AND_STARCH`; English alias `corn meal`; no forms or active numeric data. | Keep separate: generic cornmeal does not establish the toasted process or a pinole product formula. |
| `ingredient-ref-masa-harina` — `masa harina / farine de maïs nixtamalisée` | `FLOUR_AND_STARCH`; no aliases, forms, or active numeric data. | Keep separate; nixtamalized flour is not an alias or evidenced substitute for pinole. |
| `ingredient-ref-whole-kernel-corn-flour` and `ingredient-ref-precooked-corn-flour` | Separate `FLOUR_AND_STARCH` identities; neither owns the pinole term. | Leave their names and broad corn-flour search behavior unchanged. |
| `ingredient-ref-hominy-grits` — `hominy grits / gruau de maïs` | `GRAIN_AND_CEREAL`; separate alkali-treated grain product. | No merge, alias, form, or substitution. |

The static picker audit follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9), which searches bilingual reference names and aliases using full normalized phrases before partial matching. Current results are:

| Query | Current result | Hold effect |
|---|---|---|
| `pinole`, `pinol`, `pinolli`, `pinolillo`, `piznate` | 0 | Remain at 0; no active owner is added. |
| `roasted corn flour`, `farine de maïs torréfiée` | `ingredient-ref-roasted-corn-flour` only | Remain on the existing generic flour row. |
| `cornmeal`, `masa harina` | Their respective existing identities | Unchanged. |
| Broad `corn flour` | 4 current results, including the existing corn and sorghum flour terms | No new broad alias or result is added. |

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were searched across full serialized recipe JSON and ingredient rows for `pinole`, `pinol`, `pinolli`, `pinolillo`, and `piznate`.

- Candidate-term recipe files: **0**.
- Candidate-term ingredient rows: **0**.
- Ingredient-reference links to pinole: **0**.

The bundled recipes do not establish a need for this identity or provide a recipe-specific amount.

## Numeric, form, and substitution limits

- A current Mexican retailer page lists a 1 kg product and reports approximately **10–12 g per tablespoon**, with a usual serving of **2–3 tablespoons (about 30 g)** [S08]. The page does not supply a stable ingredient statement for a Canadian product; these retailer-specific statements are not reusable density or unit-mapping evidence. Do not activate them.
- No reviewed source establishes a transferable density, volume-to-mass mapping, cooked yield, dry/cooked form pair, or conversion for a defined Canadian/Québec pinole SKU. Add none.
- Add no global or contextual substitution between pinole and roasted corn flour, cornmeal, masa harina, precooked corn flour, hominy grits, or a prepared atole mix. Toasting, nixtamalization, ingredient additions, and grind differ, and the sources provide no transferable ratio or method.

## Source register

Sources were checked online on 2026-10-13. Source IDs are unique to this proposal and have not been added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-F-PINOLE-R49-20261013-S01` | Mexico Secretaría de Agricultura y Desarrollo Rural, [“Maíz, la raíz de las bebidas tradicionales en México”](https://www.gob.mx/agricultura/articulos/maiz-la-raiz-de-las-bebidas-tradicionales-en-mexico?idiom=es), 2026-01-20. | Current ministry source identifies pinole/piznate with Nayarit and Sinaloa and describes toasted, ground maize with water, cinnamon, or piloncillo. The search-indexed page returned HTTP 403 to direct retrieval during this review; rely only on the displayed source extract for this wording, not on details beyond it. |
| `WP03-F-PINOLE-R49-20261013-S02` | Chihuahua state government, [“Muestran técnica de elaboración del pinole artesanal durante el Festival Virtual Indígena”](https://chihuahua.gob.mx/contenidos/muestran-tecnica-de-elaboracion-del-pinole-artesanal-durante-el-festival-virtual-indigena), 2021-05-24. | Directly accessible state source describes the Ralámuli preparation: toasted maize, repeated grinding to fine flour, sweetening with piloncillo or sugar, and powder, beverage, cookie, and dessert uses. It is one community/regional account, not a universal formula. |
| `WP03-F-PINOLE-R49-20261013-S03` | Mexico Secretaría de Agricultura / SIAP, [“El pinole, desde el campo hasta la mesa”](https://www.gob.mx/agricultura%7Cdgsiap/es/articulos/el-pinole-desde-el-campo-hasta-la-mesa), 2019-07-03. | Government article describes a traditional process using maize and cinnamon, with maize toasted and ground to a fine powder. Direct retrieval returned HTTP 403; this source is corroborative and does not establish a current commercial package formula. |
| `WP03-F-PINOLE-R49-20261013-S04` | Centre international de solidarité ouvrière (CISO), [Rapport annuel 2020–2021](https://ciso.qc.ca/wp-content/uploads/2021/12/Rapport-annuel-2020-2021-FINAL.pdf), p. 9. | French-language Québec organization refers to a Mexican cooperative transforming maize and marketing products “tortillas, pinole, etc.” Supports use of the unchanged French spelling, not a consumer package name or recipe formula. |
| `WP03-F-PINOLE-R49-20261013-S05` | Montréal Carlota Boulangerie Mexicaine, [French Uber Eats menu](https://www.ubereats.com/ca-fr/store/carlota-boulangerie-mexicaine-new/AtJj-0udU2uIoW5i9wN-9w?pl=JTdCJTIyYWRkcmVzcyUyMiUzQSUyMjE4NjElMjBSdWUlMjBTYWludGUtQ2F0aGVyaW5lJTIwT3Vlc3QlMjIlMkMlMjJyZWZlcmVuY2UlMjIlM0ElMjJDaElKR1RuYmQyd2F5VXdSQk9mYV9OTmNITkUlMjIlMkMlMjJyZWZlcmVuY2VUeXBlJTIyJTNBJTIyZ29vZ2xlX3BsYWNlcyUyMiUyQyUyMmxhdGl0dWRlJTIyJTNBNDUuNDkzMDk2JTJDJTIybG9uZ2l0dWRlJTIyJTNBLTczLjU4MDMzNTQ5OTk5OTk5JTdE). | Local French menu calls a prepared cookie `Polvorón Pinole` and describes roasted corn flour and Mexican cinnamon. This is prepared-food wording, not a pinole package label or proof that all pinole contains cinnamon. |
| `WP03-F-PINOLE-R49-20261013-S06` | Pinole Blue, [Original Blue Corn Pinole product page](https://pinoleblue.com/products/original-pinole). | Manufacturer lists organic roasted ground blue corn as the product’s only ingredient. This supports one plain commercial formulation; it does not define all products sold as pinole or establish Canadian/Québec availability. |
| `WP03-F-PINOLE-R49-20261013-S07` | Moles Virrey, [Pinole product page](https://molesvirrey.com/tienda/producto/pinole/). | Mexican maker describes a red-corn product with anise, cinnamon, and sugar, offered in 500 g and larger sizes. Supports a distinct multi-ingredient formulation, not a national standard. |
| `WP03-F-PINOLE-R49-20261013-S08` | Mercado a Casa, [Pinole](https://mercadoacasa.mx/products/pinole). | Current Mexican retailer listing describes toasted ground corn that sometimes includes sugar/cinnamon; it states 1 kg, approximately 10–12 g per tablespoon, and a 2–3 tablespoon (~30 g) portion. The listing does not establish a standardized formulation, independent measurement method, or a Canadian package. Do not activate its measure. |

## Next action

Keep this candidate held and leave Section F open. Revisit after obtaining a Canadian or Québec-facing package/specification with an ingredient statement and exact bilingual product wording. If the selected product is plain toasted maize only, resolve whether it warrants a distinct cultural identity beside `ingredient-ref-roasted-corn-flour`; if it is sweetened or spiced, scope any future row to that exact blend. Add measurements, forms, and substitutions only from evidence for that exact product.

No shared files were edited. No tests were run because this is proposal-only research.

# WP03 Section F: sorghum grits identity review

## Review record

- **Reviewed:** 2026-10-13.
- **Source access date:** 2026-10-13.
- **Status:** Accepted and integrated on 2026-10-13 as identity-only `ingredient-ref-sorghum-grits`; no recipe, manifest, or app data changed.
- **Scope:** One dry sorghum milling product sold as food grits. This review does not cover whole grain sorghum, sorghum semolina, flour, meal, flakes, puffed sorghum, or prepared porridge.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference as **`sorghum grits / gruau de sorgho`**, with the English singular alias **`sorghum grit`**. Keep `sorghum groats` out of its aliases because a Canadian terminology record defines that synonym as hulled sorghum seeds, while food-processing sources use grits for coarsely ground material. Do not add forms, measures, conversions, yields, recipe links, or substitutions.
- **Open checklist:** The plan still has the regional cereal-mix and preprocessed-grain item open at [line 2210](../../RecipeBook-global-ingredient-catalog-plan.txt#L2303). The live plan separately names sorghum grits as a boundary beside the newly integrated sorghum semolina at [line 2266](../../RecipeBook-global-ingredient-catalog-plan.txt#L2359).

## Evidence and product boundary

Sorghum grits are a processed food-grain product distinct from whole sorghum and fine sorghum flour. FAO’s technical account describes sorghum processing that removes some hull or bran, then reduces the edible endosperm fraction to coarse grits or fine flour; it also reports low-fibre grits from industrial milling. The USDA Agricultural Marketing Service’s soy-fortified product specification treats sorghum grits as a named ingredient and specifies dehulling and degerming for that product. Anson Mills lists African red sorghum grits separately from African red sorghum flour and meal. These sources support the product boundary without establishing one universal variety, hull-removal level, or granulation.

For the French display, the OQLF GDT contains **gruau de sorgho** in the processed-cereal domain, with a source-attributed English spelling `shorghum grit`. The current TERMIUM Plus record pairs **sorghum grit** with **gruau de sorgho**. TERMIUM also lists **sorghum groats** as an English equivalent and defines the entry as hulled sorghum seeds. Since food-processing sources distinguish coarse-ground grits from hulled whole kernels, do not activate `sorghum groats` as an alias or use the TERMIUM definition to claim a universal processing specification. The French term is source-backed, but this is not an OQLF preferred-term ruling or a current Québec product-label attestation.

A current Ontario retailer page lists **Sorghum Millets Grit 2 lb**, calls the product jowar, and describes it as a flour alternative. This supports Canadian retail use of the name but does not establish exact ingredients, particle size, dehulling, or a bilingual Québec label. It is corroborative market evidence, not a product specification.

Keep these identities and uses separate:

| Existing or adjacent product | Boundary |
|---|---|
| Grain sorghum / `sorgho à graine` | Whole food grain; do not alias to the milled grit product. |
| Sorghum flour / `farine de sorgho` | Fine milled product; keep separate from grits. |
| Sorghum semolina / `semoule de sorgho` | Existing row for sorghum/jowar semolina (rava); it is not an alias for grits. |
| Puffed sorghum / `sorgho soufflé` | Expanded whole-grain product; keep separate. |
| Hominy grits / `gruau de maïs` | Maize product; do not merge by the shared word `grits` or `gruau`. |
| Attiéké | Existing cassava product with the English alias `steamed cassava grits`; do not merge by broad `grits` search. |
| Sorghum groats / hulled kernels | Do not add as an alias until the whole-kernel versus coarsely ground sense is resolved for the exact target product. |

## Proposed identity and inactive behavior

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-sorghum-grits` |
| English display | `sorghum grits` |
| French display | `gruau de sorgho` |
| English aliases | `sorghum grit` |
| French aliases | none |
| Category | `GRAIN_AND_CEREAL` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms | none |
| Recipe links | none |
| Yields, conversions, substitutions | none |

The English display is plural because the current food-product sources use that product name. The singular form is a narrowly scoped lexical variant. Do not add `sorghum groats`, `grain sorghum grits`, `jowar rava`, `rava`, `semolina`, `meal`, `gruau de sorgo`, or generic `grits` as aliases. In particular, `semolina` and `rava` belong to the separately reviewed sorghum-semolina identity.

## Live ownership, ledger, and picker audit

The live package snapshot contains **1,334 ingredient references**, **98 forms**, and **146 `GRAIN_AND_CEREAL` references**. No active reference or form owns the exact normalized keys `sorghum grits`, `sorghum grit`, `gruau de sorgho`, or the proposed ID. The existing `ingredient-ref-sorghum-semolina` owns `semoule de sorgho`, `jowar rava`, and `sorghum rava`; `ingredient-ref-hominy-grits` owns `hominy grits / gruau de maïs`; and `ingredient-ref-attieke` owns `steamed cassava grits`. Those rows remain unchanged.

The legacy import file has **64 candidates** and no separate sorghum-grits or `gruau de sorgho` candidate. The ledger has **1,642 records**; it contains the separate sorghum grain, flour, flakes, puffed-sorghum, and sorghum-semolina work, but no dedicated sorghum-grits record. The semolina review explicitly keeps grits outside that row. No record or source identifier is proposed in this documentation-only packet.

`IngredientSearch.kt` indexes reference names, aliases, and form terms; it prefers complete normalized word phrases and otherwise falls back to partial matching. Current results are:

| Query | Current result |
|---|---|
| `sorghum grits`, `sorghum grit`, `sorghum groats` | no results |
| `gruau de sorgho`, `gruau de sorgo` | no results |
| `sorghum` | 4 rows: grain sorghum, puffed sorghum, sorghum flour, and sorghum semolina |
| `grits` | 2 rows: attiéké and hominy grits |
| `gruau` | 5 rows: hominy grits, oat groats, raw buckwheat groats, rye meal, and Scottish oatmeal |

With the proposed names, each qualified query (`sorghum grits`, `sorghum grit`, and `gruau de sorgho`) would select the new row. Broad `sorghum`, `grits`, and `gruau` searches would return 5, 3, and 6 rows respectively. This is the expected broad-query behavior; do not add the generic `grits` or `gruau` tokens as aliases.

## Bundled recipe demand

The manifest lists **114 recipe files** containing **1,123 ingredient rows**. Every listed file and ingredient row was scanned after normalization for `sorghum grits`, `sorghum grit`, `sorghum groats`, `gruau de sorgho`, `gruau de sorgo`, `sorghum meal`, `grits`, `grit`, `sorghum`, and `sorgho`. The scan found **zero matching recipe files and zero matching ingredient rows** for every candidate-specific term. The generic French word `gruau` appears in two unrelated oatmeal recipe files (air-fryer baked oats and overnight oats), with no matching ingredient rows. No recipe link or recipe edit is supported.

The manifest-ordered corpus digest is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Measures, conversions, yields, and substitutions

- **Measures and density:** No source reviewed supplies a transferable household cup, spoon, or volume-to-mass value for plain sorghum grits. The Ontario listing's 2 lb package is SKU-specific, not a household portion. Leave default density null and unit mappings empty.
- **Cooking:** USDA’s cited 1:2 volume cooking instruction applies to its soy-fortified sorghum-grits formula, which includes soy grits; do not transfer its ratio or cooking time to plain sorghum grits. Add no dry-to-cooked form or cooking conversion.
- **Milling yield:** FAO reports process yields for specific commercial or laboratory grits milling runs. These are manufacturing yields, not recipe yields or dry-to-cooked quantity relations. Do not activate a yield.
- **Substitutions:** No reviewed source supplies a tested general substitution ratio for grits to sorghum grain, semolina, flour, corn grits, or another cereal. Add no global or contextual substitution rule. A future rule would need a named dish, role, method, and tested ratio.
- **Research states if integrated later:** The reviewed identity sources support no reusable household measurement or substitution; do not infer a positive value from the product package or fortified-product directions. Broader measurement or substitution research can remain open if the catalog workflow requires additional review before setting ledger states.

## Source register

All sources were accessed on 2026-10-13.

| Source | Supports and limits |
|---|---|
| Office québécois de la langue française, [gruau de sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18062438/gruau-de-sorgho) | Search-indexed GDT record lists the processed-cereal domain, the French term, and an FAO-attributed English form printed as `shorghum grit`. Direct page open returned a cache miss. This supports source-attested wording, not an OQLF preferred-term decision or a detailed milling definition. |
| Translation Bureau, Government of Canada, [TERMIUM Plus: gruau sorgo](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SORGO) | Record pairs `sorghum grit` and `sorghum groats` with `gruau de sorgho`, defines the English entry as hulled sorghum seeds, and notes the `sorgo` spelling. Modified 2026-06-10. The whole-kernel definition is why `sorghum groats` is not activated as an alias for a coarsely milled food product. |
| FAO, [Sorghum and millets in human nutrition, processing chapter](https://www.fao.org/4/T0818e/T0818E09.HTM) | Describes dehulling/bran removal and subsequent particle-size reduction to coarse grits or fine flour; reports specific milling yields. Supports the processed-grain boundary. Its manufacturing yields and preparation examples are not household measures or recipe substitutions. |
| USDA Agricultural Marketing Service, [SFSG13 — Soy-Fortified Sorghum Grits](https://www.ams.usda.gov/sites/default/files/media/sfsg13.pdf) | Defines a particular fortified product using dehulled and degermed sorghum grits and soy grits, with product-specific cooking directions. Supports that grits are a named food milling input, but not a plain-grits formula, measure, or cooking conversion. |
| Anson Mills, [Products](https://www.ansonmillsdirecttochefs.com/collections/all) | Current miller listing includes African Red Sorghum Grits and separately lists African Red Sorghum Flour and Meal. Supports a commercial product distinction; wholesale pricing per pound is not a household measure and the listing is not Canadian market evidence. |
| Namaste Supermarket Mississauga, [Sorghum Millets Grit 2 lb](https://namastemississauga.ca/products/sorghum-millets-grit-2lb/019a52aa-dc0e-788c-ad4d-7edb5b303aef) | Current Canadian retail search listing gives this title, a 2 lb package, and says it is known as jowar. Direct page retrieval timed out. The listing does not establish exact grain composition, processing, French naming, or a transferable measure. |

## Disposition

Root disposition (2026-10-13): accepted and integrated identity-only as **sorghum grits / gruau de sorgho**, with the English singular alias **sorghum grit**. Keep the hulled-kernel `sorghum groats` wording out of aliases; preserve the existing grain, flour, semolina, and puffed-sorghum identities; and leave forms and numeric behavior inactive. The complete bundled recipe corpus has no candidate demand. The ledger records no supported household measure or general substitution. No app tests or emulator checks were run because the changes only add database JSON data and catalog documentation.

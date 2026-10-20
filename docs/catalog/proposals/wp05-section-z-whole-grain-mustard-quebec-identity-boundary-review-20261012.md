# WP05 Section Z — whole-grain mustard identity and Québec wording review

- **Packet type:** accepted identity-only integration; no recipe text or legacy records changed.
- **Reviewed/accessed:** 2026-10-12.
- **Scope:** the WP05 Section Z whole-grain mustard candidate, limited to identity and search wording.
- **Disposition:** accepted one identity-only whole-grain mustard reference with Québec French display `moutarde à l’ancienne` and the directly attested English search alias `old-fashioned mustard`. Bare mustard, Dijon-qualified whole-grain products, old-style prepared products without texture evidence, and other mustard varieties remain outside this mapping.

## Recommendation

| Integrated ID | English display | fr-CA display | Aliases | Category | Status |
|---|---|---|---|---|---|
| `ingredient-ref-whole-grain-mustard` | `whole grain mustard` | `moutarde à l’ancienne` | English: `old-fashioned mustard`; French: none | `SAUCE_AND_CONDIMENT` | **Integrated identity-only**, with moderate confidence. |

The English product class is directly named by Morehouse, which distinguishes whole-grain mustard from yellow, Dijon, spicy brown, and stoneground mustard, and describes its texture as whole or partly crushed seeds. A Québec producer sells a bilingual `Moutarde à l’Ancienne Biologique / Organic Old-Fashioned Mustard` product and describes the French product as crunchy from partially crushed seeds. I infer that `moutarde à l’ancienne` is an appropriate Québec-facing label for the bounded coarse-seed class; neither source establishes a regulated or universally fixed definition. [S03–S06]

The alias `old-fashioned mustard` is limited to the product wording attested by the Québec manufacturer’s English page. Do not infer that every product called `old-style prepared mustard` or `moutarde préparée à l’ancienne` has this texture: a current Metro Canada product uses those old-style labels but lists a dill seasoning and does not describe seed size or crushing. Keep that SKU’s wording outside this alias mapping unless later evidence resolves the product class. [S07]

No whole-grain mustard line occurs in the bundled recipe corpus. This integration closes one named-product gap in the open Section Z checklist; it does not relink recipes or resolve the rest of the mustard checklist.

## Ownership and boundary audit

The proposal-time exact-owner audit checked active reference display names and aliases, all form labels and match terms, legacy candidate names and aliases, and ledger record IDs. At that snapshot, the candidate’s exact key and proposed ID were unowned. The snapshot is listed below.

| Exact identity or phrase | Active owner | Form / legacy / ledger state | Disposition |
|---|---|---|---|
| `whole grain mustard`; `moutarde à l’ancienne`; `old-fashioned mustard` | No active exact owner | No matching form or legacy candidate; no `ingredient-ref-whole-grain-mustard` ledger record | Proposed new identity and one English alias. |
| `Dijon mustard` / `moutarde de Dijon` | `ingredient-ref-dijon-mustard`, `SAUCE_AND_CONDIMENT`, no aliases | No form; ledger identity `unreviewed`, measurement `blocked_pending_evidence`, substitution `not_yet_researched` | Keep distinct. The OQLF defines Dijon as ground black or brown seeds with creamy texture; do not add a whole-grain or `à l’ancienne` alias to this row. [S02] |
| `yellow mustard` / `moutarde jaune` | `ingredient-ref-yellow-mustard`, `SAUCE_AND_CONDIMENT`, no aliases | No form; ledger identity `unreviewed`, measurement `not_yet_researched`, substitution `not_yet_researched` | Keep distinct. |
| `mustard seeds` / `graines de moutarde` | `ingredient-ref-mustard-seeds`, `BAKING_AND_SPICE` | No form or matching legacy candidate; ledger record has no sources | Dry ingredient, not the prepared condiment. |
| `mustard greens` / `feuilles de moutarde` | `ingredient-ref-mustard-greens`, `VEGETABLE_AND_AROMATIC` | No form or matching legacy candidate; ledger identity is `verified` for the edible leaves only | Keep distinct from the seed condiment. |
| `mustard oil` / `huile de moutarde` | `ingredient-ref-mustard-oil`, `FAT_AND_OIL` | English alias `mustard seed oil`; ledger identity `verified` | Keep distinct from both seeds and prepared mustard. |
| `pickled mustard greens` / `feuilles de moutarde marinées` | `ingredient-ref-pickled-mustard-greens`, `SAUCE_AND_CONDIMENT` | No form or matching legacy candidate; ledger identity `verified` for this prepared leafy product | Keep distinct; the recent WP05 Section W integration does not cover mustard-seed condiment. [S09] |
| Bare `mustard` / `moutarde` | No active exact display or alias | Legacy candidate `ingredient-ref-mustard` (`SAUCE_AND_CONDIMENT`) is `unreviewed`, has no aliases, and has unresolved ledger record `ingredient-ref-mustard` | Do not promote or alias. OQLF says unqualified `moutarde` denotes dry mustard and uses `moutarde préparée` for paste; the active picker query is also broad and ambiguous. [S01] |
| `mustard powder` / `moutarde en poudre` | No active owner | Legacy candidate `ingredient-ref-mustard-powder`, `BAKING_AND_SPICE`, remains `unreviewed`; unresolved candidate ledger row has no sources | Keep as a separate dry-spice review. |
| `moutarde à grains entiers`; `moutarde de Dijon à grains entiers`; `old-style prepared mustard` | No exact active owner | No matching form or legacy candidate | Do not add these as generic aliases. The Québec retailer example qualifies its `à grains entiers` item as Dijon and uses mixed “à l’ancienne”/stone-ground description; this does not establish an unqualified French synonym. Metro’s old-style SKU does not state the seed texture. [S07, S10] |

No current form is attached to any active mustard reference. `whole grain` describes the coarse-seed prepared condiment here; it is not evidence for a global mustard-seed form, a Dijon form, or a recipe substitution. Morehouse also sells a product named “Whole Grain Country Dijon,” so “whole grain” and “Dijon” can co-qualify on a particular SKU. Keep a full composite phrase such as `whole grain Dijon mustard` or `moutarde de Dijon à grains entiers` for product-specific review instead of assigning it globally to either row. [S03]

## Picker phrase boundary

`IngredientReferenceSearchIndex` prefers complete normalized word-phrase matches and falls back to partial matching only when no complete phrase matches (`app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`). In the pre-integration snapshot, `mustard` and `moutarde` each returned six active references: Dijon, yellow, seeds, oil, greens, and pickled mustard greens. The latter additions reflect the current catalog; a prior generic-mustard review predates the preserved-greens identity. Exact `Dijon mustard` and `yellow mustard` each returned their single existing row.

With the integrated row, exact queries `whole grain mustard`, `moutarde à l’ancienne`, and `old-fashioned mustard` return only `ingredient-ref-whole-grain-mustard` under the current phrase-first search rules. A broad `mustard` or `moutarde` query includes this seventh mustard-related identity and remains a multi-result query. Do not add bare `mustard`, `moutarde`, `prepared mustard`, or `moutarde préparée` to the new row, and do not use the legacy generic candidate to make those broad queries appear specific.

## Bundled recipe-corpus demand

The manifest contains **114 recipe files and 1,123 ingredient lines**. A case-, punctuation-, and accent-insensitive scan of each manifest-listed ingredient line’s original and normalized name fields found four mustard-related lines and no whole-grain, old-fashioned, or `à l’ancienne` demand:

| Recipe | Source ingredient text | Current linked owner |
|---|---|---|
| 019, Crab Balls | `1 tbsp Dijon mustard` | `ingredient-ref-dijon-mustard` |
| 082, Pulled Pork | `1 tbsp ground yellow mustard seeds` | `ingredient-ref-mustard-seeds` |
| 083, Curry Powder | `1/2 tsp ground mustard seeds` | `ingredient-ref-mustard-seeds` |
| 101, Big Mac Sauce | `3 tbsp yellow mustard` | `ingredient-ref-yellow-mustard` |

These lines confirm demand for the existing Dijon, dry-seed, and yellow identities only. They do not support relinking any line to whole-grain mustard, interpreting dry ground seeds as prepared mustard, or adding a substitution.

## Product, numeric, form, and substitution limits

- Products vary by seed species and mixture, how much seed remains whole or is crushed, acid source, wine, salt, sweetener, seasonings, and flavor additions. The cited Québec manufacturer discloses one vinegar-and-seed recipe; the Metro old-style SKU includes dill seasoning; neither is a universal formula. [S05, S07]
- Keep the new row identity-only: no ingredient form, form conversion, yield, density, or unit mapping. A product’s 250 mL package is not a mustard mass or a density; a stated household serving without product mass would not establish one. [S05]
- Do not substitute this identity for Dijon mustard, yellow mustard, ground mustard seed, or mustard powder. No source here supports a ratio, common pungency, equivalent seed fraction, dish scope, or reciprocal substitution.
- No recipe link or recipe text changed.

## Source-ID and package snapshot audit

The source prefix `WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S##` was absent from the existing proposals, batches, ledger, and seed package before this review introduced it; integration registered S01–S10 on the new ledger record. The most recent directly relevant WP05 findings were also checked: the barbecue-sauce boundary review explicitly kept generic prepared mustard unpromoted, while the 2026-10-12 Section W packet integrated only pickled mustard greens and takana-zuke. Neither establishes this whole-grain condiment identity. [S09, S11]

The counts and SHA-256 hashes below are the proposal-time baseline captured from the shared checkout on 2026-10-12, before integration. The recipe corpus digest hashes manifest-listed basenames in manifest order, then a NUL, exact file bytes, and a trailing NUL for each file.

| Artifact | Baseline count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,253 references | `75e1ecad60f53aa4698c98ab294c32903cfffa2266d4dc16a932ede6fda6c889` |
| `ingredient-forms.v1.json` | 94 forms; no mustard form | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,561 records; 5,446 source entries; 4,484 distinct source IDs; 8 unit conversions | `460185a66893d25c2381ee7b51c5950da04cd3d4feb015e05c889816977ff98f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe set | 114 files; 1,123 ingredient lines | `747f01139ccf1d682c6000a983c440642d454d1e3a8bd43fb4b2538d078d3a97` |

## Integration result

Added `ingredient-ref-whole-grain-mustard` in `SAUCE_AND_CONDIMENT`, with English display `whole grain mustard`, fr-CA display `moutarde à l’ancienne`, and English alias `old-fashioned mustard`. The row has no French aliases, forms, density, or unit mappings. Added sources S01–S10 and the accepted identity decision to its research-ledger record; internal project boundary source S11 remains linked here as review context. No recipe rows were relinked and no measurement, conversion, yield, or substitution behavior was added. Static seed-package, reference, generated-index, ledger, phrase-owner, recipe-corpus, encoding, and whitespace checks passed. No app tests or emulator checks were run because this integration only adds database JSON data under `AGENTS.md`.

## Sources accessed 2026-10-12

| ID | Source and locator | Evidence and limit |
|---|---|---|
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S01** | Office québécois de la langue française, [moutarde (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095323/moutarde), definition and note. | States that unqualified `moutarde` is dry mustard and that paste is `moutarde préparée`. Supports keeping bare French mustard unassigned; it does not define whole-grain mustard. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S02** | Office québécois de la langue française, [moutarde de Dijon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26543540/moutarde-de-dijon), definition and note, updated 2017. | Defines Dijon as ground black or brown seeds with a creamy texture and pairs it with `Dijon mustard`. Supports keeping the current Dijon owner; it does not say every product carrying “Dijon” has the same texture. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S03** | Morehouse Foods, [Industrial mustards](https://morehousefoods.com/our-products/our-products-industrial/), product list and “Whole Grain Country Dijon” wording. | Producer classifies Whole Grain separately from Yellow, Classic/Gourmet Dijon, Spicy Brown, and Stoneground, but also names a Whole Grain Country Dijon product. Supports the class and warns that classes can co-qualify; not a regulatory definition or complete formula. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S04** | Morehouse Foods, [Mustard Pairings: The Perfect Condiment for Every Meal](https://morehousefoods.com/2024/10/23/mustard-pairings-every-meal/), “Whole Grain Mustard” section, 2024-10-23. | Producer describes whole or somewhat crushed seeds and resulting texture/crunch. This is manufacturer guidance, not a standard covering all suppliers. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S05** | La Maison Orphée, [Moutarde à l’Ancienne Biologique](https://maisonorphee.com/products/moutarde-a-lancienne-biologique), product name, texture, origin, and ingredients. | Québec-facing French manufacturer page names `moutarde à l’ancienne`, describes partially crushed seeds, and says the product is made in Canada and certified as prepared in Québec. Its ingredients describe this SKU only. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S06** | La Maison Orphée, [Organic Old-Fashioned Mustard](https://maisonorphee.com/en/products/organic-old-fashioned-mustard), product name, texture, origin, and ingredients. | English counterpart uses `Old-Fashioned Mustard` and describes the same partial-crush texture. Supports the narrow English alias as one producer’s direct product wording, not a universal synonym for every old-style product. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S07** | Metro Québec / Metro Canada, [Irrésistible prepared old-style mustard](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/ketchup-et-moutarde/moutarde-preparee-a-l-ancienne/p/059749935050), corresponding English [product page](https://www.metro.ca/en/online-grocery/aisles/pantry/condiments-toppings/ketchup-mustard/old-style-prepared-mustard/p/059749935050), product 059749935050. | Current Canadian bilingual retail label uses `moutarde préparée à l’ancienne` / `Old-Style Prepared Mustard`; its ingredient list includes dill seasoning and turmeric but does not state seed-size or crushing. Used as a limit, not as an accepted alias. Retail product information can change. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S08** | Gouvernement du Québec, [Québec Food Directory — Organic Old-Fashioned Mustard 250 mL](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8203583), company, product size, ingredients, and prepared-in-Québec certification; last updated 2026-07-07. | The English listing confirms the Maison Orphée product, 250 mL size, mustard-seed/vinegar/salt ingredients, and Québec-prepared certification. It says its data comes from GS1 and MAPAQ is not responsible for accuracy. It corroborates the Québec product context, not French product wording, a general class standard, or density. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S09** | Morehouse Whole Grain mustard, [Aliments du Québec certified product listing](https://alimentsduquebec.com/en/certified-products/seasonings-sauces-and-condiments/morehouse-whole-grain-mustard-2x4l), listed producer Aliments Morehouse Canada Limitée, Laval. | Confirms current English whole-grain product wording for a Québec-prepared product. The listing gives commercial availability/size, not an ingredient specification. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S10** | Bulk Mart, [Dijona — Moutarde de Dijon à grains entiers en seau](https://bulkmart.ca/fr/products/dijona-dijon-mustard-whole-grain-in-pail-5-kg), French listing and description. | Attests the phrase only inside a Dijon-qualified product title; its listing also calls it `à l’ancienne` and stone-ground. It is retailer copy, not a terminology ruling, so it does not support a generic unqualified `moutarde à grains entiers` alias. |
| **WP05-Z-WHOLEGRAIN-MUSTARD-20261012-S11** | [WP05 barbecue-sauce alias and everyday-condiment boundary review](wp05-barbecue-sauce-alias-boundary-review-20261010.md) and [WP05 Section W preserved-mustard integration README](../batches/wp05-section-w-regional-preserved-vegetable-integration-20261012/README.md). | Existing project decisions keep the generic prepared-mustard legacy row unreviewed and integrate pickled mustard greens/takana-zuke separately. These are internal boundary records, not external product evidence. |


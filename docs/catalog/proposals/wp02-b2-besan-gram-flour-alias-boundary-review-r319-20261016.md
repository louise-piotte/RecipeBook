# WP02 B2 R319 — Besan and gram-flour alias boundary — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Proposal only; root is the merge owner.
- **Target rows:** `ingredient-ref-chickpea-flour`, `ingredient-ref-desi-chickpea-flour`, and `ingredient-ref-chana-sattu`.
- **Checklist anchor:** The open Section 04 B2 item at lines 2363–2364 of the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt): “Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours.” The R284 measurement subitem immediately below it is already complete. R319 is a separate naming and picker-boundary review; it does not change R284’s measurement findings or its decision not to add broad aliases as part of that measurement review.
- **Source IDs:** New R319 IDs `WP02-B2-BESAN-GRAM-FLOUR-R319-20261016-S01` through `S07` are proposed for the sources listed below. Existing evidence cited by source ID remains with its prior ledger owner; no shared source registry or ledger was edited.

## Recommendation

Add narrow search aliases to the existing flour rows:

| Existing identity | Proposed aliases | Boundary |
|---|---|---|
| `ingredient-ref-chickpea-flour` | English: `besan`, `besan flour`, `gram flour`. French: `farine de besan`. | General market and dictionary usage identifies these as chickpea-flour names. Keep the current display `chickpea flour / farine de pois chiche` and existing French alias unchanged. Treat `farine de besan` as a retailer-attested search alias, not a preferred French display or OQLF recommendation. |
| `ingredient-ref-desi-chickpea-flour` | English: `desi besan`. | A current Canadian retail product is titled “Desi Besan (Chickpea flour).” This qualified term returns the Desi flour row; the listing does not establish its cultivar, dehulling, or roast treatment. Keep this alias at the source-attested phrase only. |
| `ingredient-ref-chana-sattu` | No additions. | Keep `roasted Bengal gram flour`, `roasted chickpea flour`, and `farine de pois chiches grillés`. Do not add bare `besan`, `besan flour`, `gram flour`, `desi besan`, or `roasted gram flour`. |

The recommendation changes phrase ownership only. It does not change displays, numeric data, forms, substitutions, recipe links, or picker code. The broad `gram flour` query will return **both** generic chickpea flour and chana sattu because the latter already has the longer phrase alias `roasted Bengal gram flour`. This is the honest search result for an unqualified phrase that is used for chickpea flour but also occurs inside the roasted product’s existing name; do not force it into a false singleton.

## Identity and preparation boundary

FSSAI’s current compendium defines Besan as flour obtained by grinding dehusked Bengal gram (*Cicer arietinum*). That definition does **not** explicitly say “unroasted”; it defines dehusked Bengal gram as the input and does not include a roast step. In the same compendium, the separate Roasted Bengal Gram Flour (Chana Sattu) provision says sattu is made from gram grains “after grinding of roasted form.” These source definitions support a dehusked-besan versus explicitly roasted-sattu boundary, while avoiding the unsupported claim that the Besan standard explicitly forbids all prior heating. eNAM lists Chickpea Flour (Besan) and Roasted Bengal Gram Flour (Chana Sattu) separately under CHANA. [S01–S02; existing `WP02-S136`, `WP02-S137`, and `WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S09–S10`]

Current Indian product wording also keeps the terms distinct: Safe Harvest markets Besan/Gram Flour as chickpea flour, and Rajdhani’s current product catalog lists Mota Besan and Barik Besan separately from Chana Sattu, described as roasted Bengal gram flour. These are manufacturer/product descriptions, not legal definitions. [S03–S04]

Canadian evidence shows that Besan is used for chickpea flour, while some named products are specifically Desi-derived. Diefenbaker Spice & Pulse, a Canadian processor and miller, calls its product Chickpea Flour or Besan and describes its Besan as flour from split Desi chickpea (Chana Dahl/Yellow Gram). Galloway’s Canadian retail description similarly says Desi chickpeas may be ground into chickpea flour called Besan flour or yellow gram flour. Those are bounded producer/retailer descriptions; they do not establish that all Besan is Desi or that all Desi chickpea flour uses the same dehulling and milling process. [S05; existing `WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S07`]

The exact qualified product name “Desi Besan” appears in a current Mississauga retailer listing, whose description identifies it as chickpea flour. It supports the `desi besan` search alias on the existing Desi row, but the page gives no ingredient panel or process detail. Do not derive whole-seed versus dehulled flour properties, a form, a conversion, or any formula result from that title. [S06]

## Term-by-term disposition

| Term | Disposition | Evidence and limit |
|---|---|---|
| `besan` | Add to generic chickpea flour. | FSSAI defines Besan from dehusked Bengal gram, and current Indian and Canadian product pages pair Besan with chickpea flour. The generic row is the broad flour identity; do not use this term to transfer a specific food-code measure. [S01, S04–S05; existing R284 S04] |
| `besan flour` | Add to generic chickpea flour. | Current product listings use this explicit English phrase for chickpea flour. [S04–S06; existing `WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S07`] |
| `gram flour` | Add to generic chickpea flour, while preserving the Sattu result through its longer existing alias. | Cambridge’s dictionary defines gram flour as chickpea flour; the Norwegian Food Safety Authority’s food-composition table identifies gram flour as *Cicer arietinum* / Chickpea flour. These existing sources are owned by the modified-potato-starch ledger record and are cited by their existing source IDs, `WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S09–S10`; do not duplicate their entries. [R96 S09–S10] |
| `desi besan` | Add only to the Desi chickpea-flour row. | The exact current Canadian product title qualifies the phrase as Desi and expressly calls it chickpea flour. This is a product-title alias, not a definition of all Desi flour or evidence of its specific milling treatment. [S06] |
| `farine de besan` | Add as a generic chickpea-flour search alias only. | Metro’s French-language listing is titled “Farine de besan” for a 1.81 kg Meera flour product. The page currently reports it out of stock and redirects to an English page, so this is limited retailer-language evidence. It is not an OQLF-preferred term. Retain `farine de pois chiche` as the display and established French name. [S07; existing R284 S01–S02 and Desi S03] |
| `roasted Bengal gram flour` | Keep on chana sattu. | The official standard explicitly describes roasted Bengal gram flour (Chana Sattu) as made from roasted gram. Do not move or broaden the existing alias. [S01–S02; existing `WP02-S136–S137`] |
| `roasted gram flour` and `roasted besan` | Leave unassigned. | These unqualified process phrases are not established as unique product names by the reviewed standard or current product labels. They could conceal a specific pulse or roasting process. |
| `farine de pois chiche` / `farine de pois chiches` | Keep existing ownership unchanged. | The generic singular display and plural alias already exist; the broader plural phrase also retrieves the Desi and Sattu rows through their qualified names. Current Québec product directories use the generic French wording. Do not add `farine de besan` as a display name. [existing R284 S01–S02 and Desi S03] |

No OQLF entry for Besan or `farine de besan` was identified in this review. The proposed French alias therefore remains retailer-derived and internal to search. The Québec Food Directory’s Cuisine Soleil listing uses `Farine de Pois Chiches Biologique`; it supports the existing generic French naming, not Besan as a Québec-preferred term. [existing R284 S01–S02]

## Current ownership, forms, measurements, and prior decisions

The live catalog currently contains:

- `ingredient-ref-chickpea-flour`: `chickpea flour / farine de pois chiche`, French alias `farine de pois chiches`, no English aliases, `defaultDensity: null`, and `unitMappings: []`.
- `ingredient-ref-desi-chickpea-flour`: `Desi chickpea flour / farine de pois chiches Desi`, no aliases, `defaultDensity: null`, and `unitMappings: []`.
- `ingredient-ref-chana-sattu`: `chana sattu / farine de sattu`, with English aliases `roasted Bengal gram flour` and `roasted chickpea flour`, and French alias `farine de pois chiches grillés`; density is null and mappings are empty.

None of the 127 current ingredient forms is attached to these three rows. Neither active global nor contextual substitution-rule file contains a rule. Their ledger states are, respectively: generic chickpea flour `verified / researched_no_supported_value / researched_no_supported_substitute`; Desi chickpea flour `verified / researched_no_supported_value / not_yet_researched`; chana sattu `verified / not_yet_researched / not_yet_researched`. R319 proposes no change to these states.

R284 records two label portions of 1/4 cup (30 g) as product-specific observations and states that Health Canada CNF code 4886 is explicitly “Chickpea flour (besan).” Its reported code servings (100 ml = 38.9 g, 125 ml = 48.6 g, 250 ml = 97.2 g) remain scoped to that code and must not be copied to the generic row. The two package servings and CNF code do not establish a shared density, cup measure, or conversion. The alias decision here does not revise that distinction or add measurements for Besan, generic chickpea flour, Desi flour, or Sattu. [existing R284 S01–S06]

The prior generic-flour identity decision left Besan and gram flour unassigned without regional/product context. R319 supplies specific standard, dictionary, and current market-name evidence for search aliases, while preserving process and measurement limits. R284’s narrower instruction not to add broad aliases *in its measurement review* remains intact. R319 does not edit the prior proposal or its accepted measurement finding.

The legacy-import file has 59 candidates and no match for `besan`, `gram flour`, `chickpea flour`, or `sattu`. The ledger already contains the three target references, the R284 generic-flour findings, the Desi identity sources, and the Sattu standards. It also contains Cambridge gram-flour and Norwegian food-table sources under the modified-potato-starch record; those source IDs are reused, not reassigned. No exact alias is duplicated by the proposed set after normalized-key comparison.

## Picker and bundled-recipe boundary

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds case, accents, punctuation, and spacing, then returns complete word-phrase matches before falling back to substring matching. The current and proposed results were projected from the active reference and form terms using this behavior; the three flour references have no attached forms.

| Query | Current picker result | Projected result with R319 aliases |
|---|---|---|
| `besan` | No result | Generic chickpea flour; Desi chickpea flour (through qualified `desi besan`) |
| `besan flour` | No result | Generic chickpea flour |
| `gram flour` | Chana sattu (matched inside `roasted Bengal gram flour`) | Generic chickpea flour; chana sattu |
| `desi besan` | No result | Desi chickpea flour |
| `farine de besan` | No result | Generic chickpea flour |
| `chickpea flour` | Generic chickpea flour; Desi chickpea flour; chana sattu | Same three results |
| `farine de pois chiche` | Generic chickpea flour | Same |
| `farine de pois chiches` | Generic chickpea flour; Desi chickpea flour; chana sattu | Same three results |
| `roasted Bengal gram flour` | Chana sattu | Same |

The proposed exact alias keys have no normalized key collision with existing reference names or aliases. The broad `gram flour` search intentionally remains multi-result after the addition; do not remove or replace Sattu’s existing source-backed specific alias, and do not make generic `gram flour` a singleton by changing search behavior.

The current manifest lists 114 recipe files. The audit searched all manifest-listed recipe JSON text, ingredient rows, and reference links for `besan`, `besan flour`, `gram flour`, `desi besan`, `chickpea flour`, `chana sattu`, and the corresponding French phrases. It found no matching ingredient row or text and no direct link to the three flour references. There is no bundled recipe demand to decide these aliases or to support a measure, form, or substitution. No recipe changes are proposed.

## Proposed catalog-only delta

If approved for integration, append only these aliases to the existing rows:

```json
{
  "ingredient-ref-chickpea-flour": {
    "aliasesEn": ["besan", "besan flour", "gram flour"],
    "aliasesFr": ["farine de besan"]
  },
  "ingredient-ref-desi-chickpea-flour": {
    "aliasesEn": ["desi besan"]
  }
}
```

Keep chana sattu unchanged. Preserve all current display fields, category values, density and unit mappings; add no ingredient forms, conversion or substitution rules, recipe links, or measurement observations. The snippet shows additive values, not replacements for the current alias arrays.

## Sources

New sources were accessed on 2026-10-16. Retailer and manufacturer wording is limited to each named product; it is not treated as an independent food standard.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-B2-BESAN-GRAM-FLOUR-R319-20261016-S01` | Food Safety and Standards Authority of India, [Food Safety and Standards Regulations Compendium (Version XX, 30.12.2021)](https://www.fssai.gov.in/upload/uploadfiles/files/Compendium_Food_Additives_Regulations_04_01_2022.pdf), §2.4.4, PDF p. 218, and §2.4.33, PDF pp. 276–277. | Defines Besan as ground dehusked Bengal gram (*Cicer arietinum*) and separately defines Chana Sattu from roasted gram. The Besan provision does not expressly say “unroasted”; no broader treatment claim is made. No measures or composition values are used. |
| `WP02-B2-BESAN-GRAM-FLOUR-R319-20261016-S02` | eNAM, [Commodity Quality](https://www.enam.gov.in/web/commodity/commodity-quality), CHANA listings; accessed 2026-10-16. | The indexed official page separately lists CHICKPEA FLOUR (BESAN) and ROASTED BENGAL GRAM FLOUR (CHANA SATTU). A direct open returned HTTP 502 during this review, so the indexed page is corroborating evidence; the existing eNAM source `WP02-S137` is also cited. |
| `WP02-B2-BESAN-GRAM-FLOUR-R319-20261016-S03` | Rajdhani Foods, [current product catalog](https://rajdhanifoods.com/), product entries for Mota Besan, Barik Besan, and Chana Sattu; accessed 2026-10-16. | A current Indian miller lists Besan chickpea-flour products separately from Chana Sattu described as roasted Bengal gram flour. Manufacturer product naming only; no formal standard or recipe behavior is inferred. |
| `WP02-B2-BESAN-GRAM-FLOUR-R319-20261016-S04` | Safe Harvest, [Besan/Gram Flour: Made From Pesticide-Free Chickpeas](https://safeharvest.co.in/products/besan), 500 g product page; accessed 2026-10-16. | Current Indian product page explicitly calls Besan “gram flour,” “chana besan,” and “chickpea flour,” and says this named product is made from chickpeas. First-party claims apply to its product and do not establish universal input variety or treatment. |
| `WP02-B2-BESAN-GRAM-FLOUR-R319-20261016-S05` | Diefenbaker Spice & Pulse, [Special Crop Products](https://www.dspdirect.ca/special-crop-products.php), Desi Chickpeas and Chana Dahl sections; accessed 2026-10-16. | Canadian processor says its Desi chickpeas are split into Chana Dahl and that some split product is ground into flour called Besan. This is a producer-specific Canadian process description, not a universal recipe or milling specification. |
| `WP02-B2-BESAN-GRAM-FLOUR-R319-20261016-S06` | Namaste Indian Supermarket Mississauga, [Desi Besan 2lb](https://namastemississauga.ca/products/desi-besan-2-lb/019a4ddb-56cb-788c-ac0c-f31c5c54c14b); accessed 2026-10-16. | Current Ontario retail product is titled “Desi Besan” and its description calls it chickpea flour. The page gives no ingredient panel or source-grain/heat-treatment specification; no such detail is inferred. |
| `WP02-B2-BESAN-GRAM-FLOUR-R319-20261016-S07` | Metro, [Meera Farine de besan](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-de-besan/p/854492000037), 1.81 kg listing; accessed 2026-10-16. | The French-language listing title supports `farine de besan` as retailer search wording. The page redirected to English and said the product was out of stock at access time; no ingredient composition or preferred-language status is inferred. |
| Reused `WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S09–S10` | Cambridge Dictionary, [gram flour](https://dictionary.cambridge.org/us/dictionary/english/gram-flour); Norwegian Food Safety Authority, [Gram flour](https://matvaretabellen.mattilsynet.io/en/gram-flour/). | Existing source IDs define/classify gram flour as chickpea flour / *Cicer arietinum*. The source IDs remain owned by the modified-potato-starch record; no duplicate entries are proposed. |
| Reused `WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S05–S07` and `WP02-S136–S137` | Existing Axten Farms Desi product, Maxi Suraj French Desi-flour listing, Galloway’s Desi-chickpea description, FSSAI Chana Sattu section, and eNAM commodity list, already recorded in the ledger. | Reused for the current Desi-row and Sattu boundary only. Do not duplicate their source entries. |
| Reused `WP02-B2-CHICKPEA-FLOUR-R284-20261016-S01–S06` | Existing Québec Food Directory, Aliments du Québec, Bob’s Red Mill, Health Canada CNF code 4886, and two study sources on the generic chickpea-flour ledger record. | Reused to preserve the R284 product-specific measurement and formula-specific evidence boundaries. No new measurement or substitution claim is made here. |

## Snapshot and verification

Post-draft, pre-integration read-only snapshot of the shared worktree. Hashes are SHA-256 of the exact files inspected; the recipe-corpus digest is computed in manifest order from each relative recipe path, a NUL byte, and that file’s raw bytes.

| Surface | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,675 | `36cb183971aeb13220db008a7a8d99fe0cb311666e8dd4ef9ed17df149d35377` |
| Ingredient forms | 127 | `aa10345fa769bb94f7827d6b7eaa52be865d4e608deb726b23f035d6bfd50cb2` |
| Research-ledger records | 2,022 | `c1553997815494b711cbf75eded7131344f8d57754b29b9ef9aa4fbc00b7333f` |
| Legacy import candidates | 59 | `9167695ce41884213efb2dedc05fd3f4f56590a15c3add833239a43bf1a47fe8` |
| Seed-manifest recipe paths | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows / 753,928 bytes | `f4f9c6a3647d877769729715a383733f49aaa4f8f4bba8f99ab27bdb760466e8` |

The R319 source-ID prefix had no pre-existing owner at review time. The ingredient-reference and research-ledger counts advanced from 1,674/2,021 to 1,675/2,022 while this proposal was being drafted; the snapshot above was recaptured after those concurrent shared-worktree changes. Refresh it again immediately before integration if shared catalog or ledger data changes. This is a proposal-only documentation change; no software tests, build, emulator, or deployment checks were run, consistent with `AGENTS.md` for catalog-data work.

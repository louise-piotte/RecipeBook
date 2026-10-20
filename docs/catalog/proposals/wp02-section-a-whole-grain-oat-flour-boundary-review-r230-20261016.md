# WP02 Section A: whole-grain oat flour boundary review (R230)

- **Review date:** 2026-10-16
- **Status:** Accepted and integrated on 2026-10-16 as identity-only `ingredient-ref-whole-grain-oat-flour`; see the [integration record](../batches/wp02-section-a-whole-grain-oat-flour-identity-integration-r230-20261016/README.md).
- **Checklist anchor:** The live Section A cereal-flour checklist leaves oat flour distinctions open under “Resolve rye by useful extraction/grind, pumpernickel meal, remaining barley flour grades and malted/toasted distinctions, oat, and rice white/brown source-grain grades” in [the active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Candidate ID:** `ingredient-ref-whole-grain-oat-flour`
- **New source namespace:** `WP02-A4-WGOF-R230-20261016-S01` through `S03`; no prior use was found. Root registered them on the new record and reused existing source IDs for the CNF, OQLF, and Health Canada definition records.

## Recommendation

Add an identity-only `whole grain oat flour / farine d'avoine entière` reference in `FLOUR_AND_STARCH`. Current Canadian and Québec product records use the whole-grain qualifier as a product or ingredient name, Health Canada defines the whole-grain boundary, and the CNF maintains a separate whole-grain oat-flour food code. OQLF's broader `farine d'avoine` definition expressly includes flour made from whole or non-whole oat grains, so this is a qualified grade within the generic family rather than an alias for all oat flour [reused `WP02-S32`, `WP02-A4-WBF-20261011-S03`, `DOAM-20261011-S06`; new `S01`–`S03`].

Use the Québec product-attested display `farine d'avoine entière`; it is present on a current Québec retailer listing and in a recent Québec food-directory ingredient declaration. This is local product wording, not a claim that OQLF has ruled on the compound grade name. Keep the generic `oat flour / farine d'avoine` family row intact.

Do not infer an exact particle size, milling method, relative baking performance, or universal recipe substitution from these names. Add no forms, density, unit mappings, reusable measures, conversions, yields, recipe links, or substitutions.

## Identity and alias boundaries

| Phrase or neighbor | Disposition | Evidence boundary |
|---|---|---|
| `whole grain oat flour` / `farine d'avoine entière` | New distinct identity; use the exact English class name and the Québec-market French display. | Health Canada defines the whole-grain boundary by retention of bran, endosperm, and germ; the CNF lists the oat-flour whole-grain class separately. The Québec display is product-attested, not an OQLF grade ruling. |
| `whole oat flour` | English search alias on the new identity. | The Québec Food Directory's bilingual product record renders the local ingredient `farine d'avoine entière` as `Whole oat flour` [S02]. |
| `oat flour, whole-grain` | English search alias on the new identity. | Exact reordered wording in the CNF's class name; keep it as a qualified phrase, not a generic oat-flour alias [reused `WP02-S32`]. |
| `farine d'avoine, grains entiers` | French search alias on the new identity. | Exact wording in the CNF's bilingual class name [reused `WP02-S32`]. |
| `oat flour / farine d'avoine` | Retain the existing family-level identity unchanged. | OQLF defines it for flour milled from whole or non-whole oat grains, and notes flour may also be made from oat flakes. Do not move the generic display onto the whole-grain row. |
| `oatmeal` | Do not add as an alias. | OQLF includes `oatmeal` among English terms for generic oat flour, but bare `oatmeal` is ambiguous in Québec and the current picker already returns the Scottish-oatmeal identity for that short query. |
| `oatmeal flour`, `farine d'avoine complète`, `organic`, `gluten-free`, brand names, and package sizes | Do not add. | No stable additional Québec class wording is needed; organic/gluten-free and package claims are product attributes, not this grain-fraction identity. |

Do not merge the candidate with oat bran, oat groats, Scottish oatmeal, rolled/quick/instant oats, roasted oat malt flour, malted naked oat flour, or the held oat-flour thermal-grade candidate. Those names represent other fractions, grain states, meals, or process-specific products.

## Current ownership and archive audit

The read-only snapshot covered the live seed references and forms, legacy-import identities, research ledger, and manifest-listed recipes. Counts and byte hashes below identify the exact review snapshot.

| Surface | Snapshot | Candidate finding |
|---|---|---|
| Ingredient references | 1,619 rows; SHA-256 `191988240f6c642cdaa91f248357e100e23acadd334975025465eee9099def38` | `ingredient-ref-oat-flour` is the sole exact owner of generic `oat flour / farine d'avoine`; both alias arrays are empty, density is null, mappings are empty. No candidate ID or exact qualified-name owner exists. |
| Ingredient forms | 122 rows; SHA-256 `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` | No oat-flour form and no exact candidate phrase. The oat-bran dry/cooked forms belong to `ingredient-ref-oat-bran`. |
| Legacy-import identities | 61 candidates; SHA-256 `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` | No exact candidate phrase, spelling, or proposed ID. |
| Research ledger | 1,964 records; SHA-256 `1c961b7f4b7f70ba594c60101e261a38131269befcae67021379e291d2526eb2` | No separate `whole grain oat flour` record or candidate exists. The accepted `ingredient-ref-oat-flour` record already cites CNF source `WP02-S32`; it describes the whole-grain code as evidence for the generic flour identity, not as a distinct reference decision. |
| Proposal and batch archive | Exact-phrase search across WP02 proposals and batch notes | No prior dedicated whole-grain oat-flour boundary decision was found. The archive does cover generic oat flour, Scottish oatmeal, dry oat-meal holds, malted naked-oat flour, roasted oat-malt flour, and a separate thermal-grade hold; this review does not reopen them. |
| Source-ID namespace | `WP02-A4-WGOF-R230-20261016-S01`–`S03` | No collision found in the current ledger or WP02 proposal/batch archive. Reuse the existing IDs for the CNF, Health Canada whole-grain definition, and OQLF oat-flour entry rather than registering duplicate source records. |

The proposed JSON delta is:

```json
{
  "id": "ingredient-ref-whole-grain-oat-flour",
  "nameEn": "whole grain oat flour",
  "nameFr": "farine d'avoine entière",
  "aliasesEn": ["whole oat flour", "oat flour, whole-grain"],
  "aliasesFr": ["farine d'avoine, grains entiers"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "FLOUR_AND_STARCH"
}
```

## Picker impact

`IngredientSearch.kt` folds accents and punctuation, then prefers complete word phrases. A read-only projection using the proposed display and aliases gives:

| Query | Current result | Result with proposed row |
|---|---|---|
| `whole grain oat flour`, `whole-grain oat flour` | No result | `ingredient-ref-whole-grain-oat-flour` only |
| `whole oat flour` | No result | `ingredient-ref-whole-grain-oat-flour` only |
| `oat flour, whole-grain` | No result | `ingredient-ref-whole-grain-oat-flour` only |
| `farine d'avoine entière` | No result | `ingredient-ref-whole-grain-oat-flour` only |
| `farine d'avoine, grains entiers` | No result | `ingredient-ref-whole-grain-oat-flour` only |
| `oat flour` | `ingredient-ref-oat-flour` | Generic oat flour plus whole-grain oat flour |
| `farine d'avoine` | `ingredient-ref-oat-flour` | Generic oat flour plus whole-grain oat flour |
| `oatmeal` | `ingredient-ref-scottish-oatmeal` | Unchanged; no alias added |

The two broader base phrases will intentionally return both family and qualified-grade choices because the new display contains the generic phrase. No alias is added to the generic row, and no unrelated oatmeal or oat-state result is suppressed.

## Recipe-corpus demand

The current manifest lists 114 recipe files and 1,123 ingredient rows (manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`). A read-only scan of all listed recipe JSON found zero candidate-phrase mentions, zero whole-grain oat-flour rows, and zero ingredient links to the existing generic oat-flour reference. The bundled corpus therefore supplies no reason to add a recipe link or measurement; this absence only describes the current bundle.

## Measures, forms, and substitutions

- The current generic oat-flour reference has no forms, density, unit mappings, or substitution entries. The reviewed forms file has no oat-flour form.
- CNF code 6275 shows `1 serving = 20.0 g`; retain this as a source-specific food-code portion only. It is not a recipe household measure, volume-to-mass mapping, or density. Do not add a reusable 20 g portion.
- La Boîte à Grains lists a 1 kg product package and describes using the flour with wheat flour for baking, without a transferable ratio. Nature's Path lists a 4 × 900 g product package. Neither package size nor general use advice supports a recipe conversion or substitution rule.
- Add no raw/cooked, dry, toasted, sprouted, or other form. This candidate is the milling-grade qualifier itself.

## Source register

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| Reuse `WP02-A4-WBF-20261011-S03` | Health Canada, [Whole Grains — Get the Facts](https://www.canada.ca/en/health-canada/services/canada-food-guide/resources/healthy-eating-recommendations/eat-a-variety/whole-grain/get-facts.html), whole-grain/refined-grain explanation; rechecked 2026-10-16. | Oats are among the cereal grains; whole-grain products retain bran, endosperm, and germ, while refined grains have bran and germ removed. | General whole-grain definition; it does not certify any named oat-flour SKU. |
| Reuse `WP02-S32` | Health Canada, [Canadian Nutrient File code 6275](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6275), bilingual class name; rechecked 2026-10-16. | `Grains, oat flour, whole-grain / Grains céréaliers, farine d'avoine, grains entiers`; food code 6275. | The page's 20 g serving is food-code-specific, not a household measure or density. This source ID is already attached to `ingredient-ref-oat-flour`; reuse it. |
| Reuse `DOAM-20261011-S06` | OQLF, [farine d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497598/farine-davoine), definition and preferred term; rechecked 2026-10-16. | Québec base term `farine d'avoine`; its definition includes flour ground from whole or non-whole oat grains and it notes flour can be made from flakes. | Does not establish the whole-grain grade display or aliases. This source ID is already recorded on oat-related ledger candidates; reuse it. |
| `WP02-A4-WGOF-R230-20261016-S01` | La Boîte à Grains, [Farine d'Avoine Entière Biologique — La Milanaise](https://laboiteagrains.com/products/farine-davoine-entiere-biologique-milanaise), current Québec retailer listing; accessed 2026-10-16. | Current French product title `Farine d'Avoine Entière Biologique`, supplier, 1 kg package, organic-oat ingredient statement, and product-specific baking guidance. | Retail listing and product wording, not an independent milling specification or a general recipe measure/substitution. The page does not explain the retained kernel fractions. |
| `WP02-A4-WGOF-R230-20261016-S02` | Québec Food Directory / MAPAQ, [St-Méthode whole-oat bread product sheet](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8200371), ingredient list; record last updated 2026-09-29. | Local French ingredient `farine d'avoine entière` and its English rendering `whole oat flour`; the same list names rolled oats and oat-bran topping separately. | GS1-supplied ingredient data for a composite bread, not a standalone flour specification. |
| `WP02-A4-WGOF-R230-20261016-S03` | Nature's Path / Anita's Organic Mill, [Gluten Free Whole Grain Oat Flour](https://naturespath.com/en-ca/products/whole-grain-oat-flour-aom-ca), product title, ingredient, and Canada manufacturing notes; accessed 2026-10-16. | A Canadian-made product explicitly sold under the whole-grain oat-flour name; page says its oats are Canadian-grown and identifies Chilliwack milling/packaging. | The page showed the product sold out at access; its exact product claims do not define all manufacturers' milling or baking behavior. |

**Bounded disposition:** Add the new identity and the source-attested bilingual aliases above. Leave the family-level oat-flour row, Scottish oatmeal, oat meal candidates, malted/roasted oat products, and the thermal-grade hold unchanged. The CNF's 20.0 g food-code serving is recorded as a source-specific observation only; it is not activated as a reusable measure or conversion. No recipe links, forms, defaults, yields, or substitutions were added.

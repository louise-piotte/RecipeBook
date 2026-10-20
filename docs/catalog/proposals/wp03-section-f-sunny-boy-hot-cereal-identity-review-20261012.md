# WP03 Section F: Sunny Boy original hot cereal identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Accepted and integrated as identity-only `ingredient-ref-sunny-boy-cereal`; the plan and roadmap record the disposition. The package snapshot below is the pre-integration review baseline.
- **Plan location:** Section F leaves regionally significant cereal mixes and preprocessed grains open at [line 2080](../../RecipeBook-global-ingredient-catalog-plan.txt#L2173). Its Red River item is now integrated at [lines 2138–2143](../../RecipeBook-global-ingredient-catalog-plan.txt#L2231).
- **Scope:** Sunny Boy Foods’ **Sunny Boy Original Hot Cereal**, a packaged Canadian wheat, rye, and flax breakfast cereal. This review does not allocate other Sunny Boy products or the prepared bowl.
- **Recommendation:** Integrate one identity-only `GRAIN_AND_CEREAL` reference for `Sunny Boy cereal / céréales Sunny Boy`, with the current manufacturer title as one English alias. Keep it distinct from Red River cereal and the constituent grains. The Québec French wording is supported by historical sources rather than a current French product page; that limitation is recorded below.

## Identity, naming, and product boundaries

Sunny Boy Foods currently names **Sunny Boy Original Hot Cereal** and says it is made with non-GMO wheat, rye, and flax seeds. Its FAQ traces Sunny Boy Cereal to Camrose, Alberta, in 1929. A current Canadian retailer has a separate listing for the Original product. These sources support a real, named breakfast-cereal product rather than an inference from its ingredient grains.

For the bilingual display, the proposed French **céréales Sunny Boy** matches wording in a digitized Québec grocery advertisement and is consistent with the French-language Statistics Canada table that classifies Sunny Boy Ltd. among Canadian table-cereal manufacturers. Both sources are historical. No current French Voilà listing or current French manufacturer page for the Original product was located, so this display has less current Quebec-market support than a modern bilingual package or local retailer label would provide. The old advertisement’s “sucre compris” wording is not used to infer today’s formulation.

The scope is the maker’s named **Original** product. Do not alias it to the active `Red River cereal / Céréales Red River` row. Red River’s manufacturer lists cracked wheat, cracked rye, and cracked and whole flax; Sunny Boy’s current page names wheat, rye, and flax but does not state their ratios or particle sizes. Overlapping constituents do not establish identical formulas, equivalence, or a safe substitution. Keep both brand-specific product identities separate from `cracked wheat / blé concassé`, `rye / seigle`, and `flax seeds / graines de lin`.

Keep these products outside the proposed identity:

- **Organic Sunny Boy Hot Cereal:** a separately named organic product. The manufacturer also names wheat, rye, and flax for it, but the available pages do not establish that its blend ratios and milling match the Original product. Do not add it as an alias or claim formula identity in this proposal.
- **Sunny Boy Beta-glucan Hot Cereal:** a different blend containing barley, rye, and flax, with barley beta-glucan.
- **Sunny Boy muesli:** a separate multi-grain and seed product with added ingredients; it is not hot cereal or an alias.
- Sunny Boy flour and pancake or waffle mixes, the component grains, generic hot cereal, and cooked porridge.

| Proposed field | Recommendation |
|---|---|
| ID | `ingredient-ref-sunny-boy-cereal` |
| English display | `Sunny Boy cereal` |
| French display | `céréales Sunny Boy` |
| English alias | `Sunny Boy Original Hot Cereal` |
| French aliases | None; the historical French wording is used as the display, not multiplied into unverified variants. |
| Category | `GRAIN_AND_CEREAL` |
| Forms and recipe links | None. |

## Live package snapshot

Hashes and counts below were read from the live split package and research state on 2026-10-12, immediately before drafting. The recipe-corpus digest is SHA-256 over each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte, in manifest order.

| Artifact | Snapshot | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,274 references; 122 `GRAIN_AND_CEREAL` | `7dd8e817ac83fb11b5ee486007178f90e966e062cd890944dfa1a430a103b726` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,582 records; 5,608 source entries; 4,644 distinct source IDs | `bf2cba1f35c4d6281475358bb9623f42a2570be0991cc14fc6bc274aa566da14` |

All 114 manifest paths were read. These are a time-specific snapshot; concurrent package work can change the counts and hashes.

## Exact ownership and actual picker audit

An exact normalized-key audit covered active reference IDs, displays, and aliases; every form ID, label, and match term; the legacy candidate set; ledger record IDs and serialized record content; and prior catalog proposals, batches, and the live plan.

| Surface | Result at snapshot |
|---|---|
| Active references | No exact owner for `Sunny Boy`, `Sunny Boy cereal`, `Sunny Boy Original Hot Cereal`, `céréales Sunny Boy`, `céréales chaudes Sunny Boy`, `sunnyboy`, or `sunny-boy`. Proposed ID `ingredient-ref-sunny-boy-cereal` is unallocated. |
| Nearby active product | `ingredient-ref-red-river-cereal` is `Red River cereal / Céréales Red River`. Its aliases are `Red River hot cereal`, `Original Red River Cereal`, `céréales chaudes Red River`, and `céréale Red River`; it has no attached form. No Sunny Boy term is among them. |
| Ingredient constituents | Existing component references include cracked wheat, rye, and flax seeds, but none owns the named blend. The manufacturer does not identify Sunny Boy wheat or rye as cracked, so the product must not be mapped to `cracked wheat` or a grain form. |
| Forms | No exact candidate term is a form label or match term. No form is attached to the Red River cereal row. |
| Legacy identities | No exact candidate phrase or proposed ID appears in the 65 legacy candidates. |
| Research ledger | No Sunny Boy candidate, exact phrase, or source record appears in the 1,582 records. Proposal source IDs `WP03-SUNNYBOY-20261012-S01` through `S07` are unallocated. |
| Prior proposal / batch / plan | A full case-insensitive search for `Sunny Boy`, `Sunny-Boy`, and `SunnyBoy` found no earlier catalog review or ownership. The plan’s other completed Section F reviews do not include this product. |

The actual picker dialog in `RecipeEditorScreen.kt` uses `IngredientReferenceSearchIndex` with active references and forms. Search folds accents and punctuation, prefers complete normalized word-phrase matches, then falls back to partial matches. At the live snapshot:

| Picker query | Current results |
|---|---|
| `Sunny Boy` | 0 |
| `Sunny Boy Original Hot Cereal` | 0 |
| `céréales Sunny Boy` | 0 |
| `céréales chaudes Sunny Boy` | 0 |
| `Red River cereal` | 1: `ingredient-ref-red-river-cereal` |
| `hot cereal` | 4: cream of rice hot cereal, cream of wheat hot cereal, creamy buckwheat hot cereal, and Red River cereal |

With the proposed display and alias, the first three candidate searches would resolve to the new identity. Generic `hot cereal` would return the same four references plus Sunny Boy because the manufacturer alias contains that phrase. No French `chaudes` alias is proposed.

## Full recipe demand

Every manifest-listed recipe file and ingredient row was scanned for `Sunny Boy`, `Sunny Boy cereal`, `Sunny Boy Original Hot Cereal`, `Sunny Boy hot cereal`, `céréales Sunny Boy`, `céréales chaudes Sunny Boy`, `sunnyboy`, and `sunny-boy` after the picker’s case, accent, ligature, and punctuation normalization.

| Search scope | Results |
|---|---:|
| Full serialized bundled recipe files | 0 hits / 114 files |
| Bundled ingredient rows | 0 hits / 1,123 rows |
| Archived RecipeKeeper JSON files in `docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes` | 0 hits / 115 files |

No recipe text, ingredient reference, or recipe link is supported by current library demand. This does not negate the separately source-backed packaged-product identity.

## Measures, forms, and substitutions

- **Forms:** Add none. This entry identifies the packaged dry Original cereal. The sources do not specify a stable grain cut, particle size, or a reusable dry/cooked ingredient form.
- **Measures:** Voilà lists a 907 g package and product preparation directions of 1/4 cup cereal to 3/4 cup water for one serving, scaled to larger batches. The package weight is SKU-specific. The volume directions are product-specific cooking instructions, not grams per cup, density, a conversion, or a general cooking yield. Store no numeric mapping or density.
- **Other brand portions:** Do not transfer the approximate cup mass recorded for Arva’s Red River cereal, or Health Canada’s historical Robin Hood Red River portions, to Sunny Boy. Those observations describe other products.
- **Cooking yield:** Add no dry-to-cooked yield. The retailer’s water ratio does not establish cooked cereal mass or finished volume for the general identity.
- **Substitutions:** Add none. No source establishes an amount-qualified or contextual substitution between Sunny Boy, Red River, individual wheat/rye/flax ingredients, or other hot cereals.
- **Recipes:** Add no recipe links because the full bundled corpus has no matching demand.

## Proposal source register

Sources were accessed on 2026-10-12. IDs are local to this proposal and have not been written to the shared research ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-SUNNYBOY-20261012-S01` | Sunny Boy Foods, [Products](https://sunnyboyfoods.com/products), “Sunny Boy Original Hot Cereal” and adjacent product entries. | Current manufacturer title and stated wheat, rye, and flax composition. The page does not give ratios, cuts, a full current package ingredient panel, or a household mass-volume measure. It separately names organic cereal, beta-glucan cereal, and muesli, supporting the product boundaries above. |
| `WP03-SUNNYBOY-20261012-S02` | Sunny Boy Foods, [Frequently Asked Questions](https://sunnyboyfoods.com/faqs), origin and retail-location answers. | Manufacturer dates Sunny Boy Cereal to 1929 in Camrose and says ingredients and milling procedures have been consistently upheld. Its map is dated January 1, 2021; the FAQ says current in-store stock is not guaranteed and lists only certain Save-on and Federated Co-op stores. It does not establish current Quebec availability. |
| `WP03-SUNNYBOY-20261012-S03` | Voilà, [Sunny Boy Hot Cereal Original Value Size 907 g](https://voila.ca/products/sunny-boy-hot-cereal-original-value-size-907-g/507866EA), product title, package size, cooking and usage directions. | Current Canadian retailer listing for the Original SKU; gives product-specific 1:3 cereal-to-water volume directions and 907 g package size. It is English-facing and fulfillment is location-dependent; it is not a French label or ingredient-formulation authority. |
| `WP03-SUNNYBOY-20261012-S04` | Statistics Canada, [Canadian breakfast food manufacturers, 1983](https://publications.gc.ca/collections/collection_2017/statcan/CS22-502-1985.pdf), Appendix D, printed French table `Producteurs canadiens de céréales de table (1), 1983`, PDF p. 62. | Official historical French-language table lists Sunny Boy Ltd. in Camrose and wheat, rye, and flax. It supports Canadian cereal context and grain constituents, not the present formulation or current retail status. |
| `WP03-SUNNYBOY-20261012-S05` | Bibliothèque et Archives nationales du Québec, [digitized French grocery advertisement](https://diffusion.banq.qc.ca/pdfjs-1.6.210-dist_banq/web/pdf.php/f13wyjO-fQw1ZLsVNX0mrw.pdf), OCR-indexed line `CEREALES “Sunny Boy”, sucre compris`. | Historical Québec lexical evidence for the French wording `céréales Sunny Boy`. The accessible search extract does not expose reliable issue/date metadata; the source supports the phrase only, not today’s formula, product display, or availability. |
| `WP03-SUNNYBOY-20261012-S06` | Arva Flour Mills, [Red River Cereal 908 g](https://arvaflourmills.com/products/red-river-cereal-908g/1000); see the active [Red River integration record](../batches/wp03-section-f-red-river-cereal-integration-20261012/README.md). | Existing comparison product: Arva lists cracked wheat, cracked rye, and cracked and whole flax for Original Red River. These product-specific details are not applied to Sunny Boy and do not make the brands aliases. |
| `WP03-SUNNYBOY-20261012-S07` | Health Canada, [Canadian Nutrient File serving portions: Red River, dry, Robin Hood](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=5231), food code 5231, modified 2019-03-01. | Historical portions for another named Red River product. Included to make the non-transfer boundary explicit; it provides no Sunny Boy measure. |

## Integration applied

Added only one reference to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-sunny-boy-cereal",
  "nameFr": "céréales Sunny Boy",
  "nameEn": "Sunny Boy cereal",
  "aliasesFr": [],
  "aliasesEn": ["Sunny Boy Original Hot Cereal"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Added the seven source entries and accepted boundary decision to the research ledger, then regenerated the bundled catalog index. No form, unit mapping, density, substitution rule, package yield, recipe link, recipe text, or numeric ledger observation was added. The recipe corpus and application behavior were not changed. See the [integration record](../batches/wp03-section-f-sunny-boy-hot-cereal-identity-integration-20261012/README.md).

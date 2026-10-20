# WP03 Section F R528 — Nature’s Path Mesa Sunrise cereal pair review (2026-10-17)

## Integration status

Integrated on 2026-10-17. Two identity-only references and their five source entries were added. See the [R528–R530 integration README](../batches/wp02-wp03-wp04-r528-r530-gap-review-integration-20261017/README.md).

## Scope and recommendation

**Recommend adding two separate, bilingual, identity-only `GRAIN_AND_CEREAL` references** for the current Canadian Nature’s Path Mesa Sunrise ready-to-eat cereal products: original and with raisins. The open Section F checklist still calls for regionally significant cereal mixes and preprocessed grains ([active plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4385)); the broader Section F sweep also remains open ([plan overview](../../RecipeBook-global-ingredient-catalog-plan.txt#L15610)).

This pair is separate from the integrated R516 Sugar Crisp and R519 Honeycomb identities, the three Honey Bunches of Oats products integrated by R522, and the R524 Quaker Harvest Crunch Canadian Maple hold. The product formulations, source pages, and picker terms are distinct. This review covers only the two Mesa Sunrise identities directly supported here; it does not claim an exhaustive historic, international, or future Nature’s Path cereal roster.

The official Canadian product pages currently show the original and raisin SKUs, but both manufacturer multipacks were marked **sold out** when reviewed. Metro’s French-indexed product pages provide Québec-facing names and product numbers; a direct open of the French Metro URLs redirected to English pages. These limits affect current stock and the strength of direct French-page verification, not the identity distinction. Do not infer that either SKU is discontinued or available at any particular retailer.

## Proposed catalog fields

| ID | English display | French display | Category | English aliases | French aliases | Density / mappings |
|---|---|---|---|---|---|---|
| `ingredient-ref-mesa-sunrise-cereal` | `Mesa Sunrise cereal` | `Céréales Mesa Sunrise` | `GRAIN_AND_CEREAL` | `[]` | [`Céréales multigrains biologiques, Mesa Sunrise`] | `null` / `[]` |
| `ingredient-ref-mesa-sunrise-with-raisins-cereal` | `Mesa Sunrise with raisins cereal` | `Céréales Mesa Sunrise aux raisins secs` | `GRAIN_AND_CEREAL` | `[]` | [`Céréales multigrains avec raisins secs biologiques, Mesa Sunrise`] | `null` / `[]` |

The French aliases are the product-specific titles returned in Metro’s French-Canadian listings. They are alternate labels for the same named products, not aliases for a generic multigrain cereal. Keep “with raisins” as a separate product identity because the raisin SKU has a distinct name, package size, product number, and ingredient list. Neither SKU is a form of plain corn, flax, buckwheat, quinoa, amaranth, or raisins.

Do not add `Nature’s Path` as a picker alias: it is the producer name for a much wider cereal and pantry catalogue, and these two rows would be an incomplete result for that broad query. “Organic” and “gluten-free” describe product attributes rather than alternate ingredient identities. Do not alias the plain and raisin products to one another, to generic granola, to raisin bran, or to any constituent grain or fruit.

Add no forms, recipe links, default density, unit mappings, active measures, conversions, package yields, or substitutions. The pages identify ready-to-eat cereal flakes, not a recipe preparation state.

## Product identity and bilingual evidence

The manufacturer’s Canadian English pages name the products separately and show separate product images/UPC labels: original SKU `058449779018`, sold as a 750 g EcoPac; raisin SKU `058449771616`, sold as an 825 g EcoPac. The ingredient lists share corn, flax, buckwheat, quinoa, amaranth, cane sugar, and salt; the raisin product separately lists raisins coated with sunflower oil. Formula text can change, so retain the product boundary and names rather than treating the ingredient lists as permanent.

| Source ID | Source and locator | Evidence and limits; proposed owner |
|---|---|---|
| `WP03-NATURES-PATH-MESA-SUNRISE-R528-20261017-S01` | Nature’s Path Canada, [Mesa Sunrise original product page](https://naturespath.com/en-ca/products/mesa-sunrise-cold-cereal-np-ca), accessed 2026-10-17; title and pack selector at lines 311–339, product description at 356–357, ingredients/attributes at 365–384. | Current Canadian manufacturer name; 6 × 750 g offer and sold-out state; corn/flax/buckwheat/quinoa/amaranth cereal description. Attach only to `ingredient-ref-mesa-sunrise-cereal`. Page content and formula may change; sold-out is a stock snapshot. |
| `WP03-NATURES-PATH-MESA-SUNRISE-R528-20261017-S02` | Nature’s Path Canada French site, [Mesa Sunrise original page](https://naturespath.com/fr-ca/products/mesa-sunrise-cereal-750-g-de-terre-conviviale-sac), accessed 2026-10-17; French product heading and 6 × 750 g selector at lines 306–338; French cereal description at 349–356. | Confirms French-language product content and the Mesa Sunrise name, though the page heading itself is still English (`Mesa Sunrise Cereal`). The 6-pack is marked sold out. It does not establish a preferred French title for the raisin sibling. Attach only to the original identity. |
| `WP03-NATURES-PATH-MESA-SUNRISE-R528-20261017-S03` | Metro Québec, [Céréales multigrains biologiques, Mesa Sunrise, 750 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-biologiques-multigrains-en-flocons/p/058449779018), French indexed product result checked 2026-10-17; indexed title, 750 g, product number `058449779018`, and French ingredient list. Direct open redirected to the English page, whose H1/weight/product number are at lines 323–328 and 378–415. | Supports the French retailer title alias and the original SKU. The French page text is search-indexed; direct page access returned an English redirect, so do not present the indexed result as a successfully opened French page. Attach only to the original identity. |
| `WP03-NATURES-PATH-MESA-SUNRISE-R528-20261017-S04` | Nature’s Path Canada, [Mesa Sunrise with Raisins product page](https://naturespath.com/en-ca/products/mesa-sunrise-with-raisins-cold-cereal-np-ca), accessed 2026-10-17; title and pack selector at lines 308–336; product description at 353–354; raisin/flax/quinoa/buckwheat ingredient highlights at 413–438. | Current Canadian manufacturer product name; 6 × 825 g offer and sold-out state; separately formulated product containing raisins. Attach only to `ingredient-ref-mesa-sunrise-with-raisins-cereal`. |
| `WP03-NATURES-PATH-MESA-SUNRISE-R528-20261017-S05` | Metro Québec, [Céréales multigrains avec raisins secs biologiques Mesa Sunrise, 825 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-aux-raisins-secs-biologiques/p/058449771616), French indexed product result checked 2026-10-17; indexed title, 825 g, product number `058449771616`, and French description. Direct open redirected to the English item page; its product title/weight and number are at lines 326–380, and ingredient list at 403–405. | Supports the French product-title alias and identifies the distinct raisin SKU. The indexed French result was last crawled about three months before review; the opened English listing showed the item out of stock. This supports identity, not live Québec stock or a current French-page rendering. Attach only to the raisin identity. |

The short French displays use the product-specific wording “céréales Mesa Sunrise” and “céréales Mesa Sunrise aux raisins secs” from the French retailer descriptions. The longer aliases preserve the Metro catalog titles. These are Canadian/Québec-facing retailer terms, not an OQLF terminology ruling. The official French manufacturer page for the original and the Metro French indexed entries corroborate French naming; the current manufacturer product detail page for the raisin sibling was verified in English, not French.

## Measures, conversions, and substitutions

The reviewed manufacturer and retailer pages provide package masses (750 g and 825 g; the manufacturer sells multipacks) and ingredient/product descriptions. These package weights do not define a household volume measure or a reusable conversion. No reviewed source pairs a cup, bowl, or other household volume with mass for either cereal. Do not create density, unit mappings, a package-yield rule, or an active grams-per-cup conversion from pack weights.

No bundled recipe or reviewed source provides a substitution quantity or context rule. The raisin version’s distinct composition is a reason to keep the two products separate, not evidence that one can substitute for the other. No substitution is proposed.

## Catalog, archive, source ownership, and snapshot audit

The read-only audit covered current ingredient references, forms, legacy identities, the research ledger, Section F plan entries, the R516/R519/R522/R524 proposals and related batches, and the manifest-listed recipe corpus. Searches found no `Mesa Sunrise` identity, UPC, proposed reference ID, or proposed source ID in current references, forms, legacy identities, ledger, plans, proposals, or batches before this review. No earlier dedicated Mesa Sunrise review or integration was found.

At proposal review the bundled snapshot contained **1,797 ingredient references** (**263** in `GRAIN_AND_CEREAL`), **144 forms**, **56 legacy candidates**, and **2,154 ledger records** with **9,900 source entries**, **8,378 distinct source IDs**, and **7,086 distinct source URLs**. The complete ledger audit found zero source IDs mapped to multiple URLs. All five source IDs above and all five exact URLs were unowned in the ledger at review time. Each proposed source ID maps to exactly one URL and one candidate identity; no URL is shared between the two candidate records.

| File | SHA-256 at review |
|---|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `bb380278585b32b2785b8b1bad1907b5f1b1b3903ef32ad5c5c345a849f11923` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `5a47b562629b3f7a248f4d6068b606a6baf6c216480caca8a63fc9fb1ec74b17` |
| `docs/catalog/legacy-import-identities.v1.json` | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `docs/catalog/research-ledger.v1.json` | `c008ddb41869db43f5c9c20b2d2fd71760da66621d1689f04b844ea902dff13c` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Phrase-first picker projection

This is a static projection over the review-time references and forms, appending the two proposed references and no forms. It follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, accent and ligature folding, punctuation-to-space normalization, complete word-phrase matches first, and substring fallback only when there are no complete phrase matches. The English product names and French retailer-title aliases expose each exact product. `Nature’s Path` is deliberately not an alias, so the two additions do not imply that the broader brand catalog is represented.

| Query | Current results | With R528 | Projection |
|---|---:|---:|---|
| `Mesa Sunrise`; `Céréales Mesa Sunrise` | 0; 0 | 2; 2 | Both distinct products in the Mesa Sunrise pair. |
| `Mesa Sunrise cereal`; `Mesa Sunrise with raisins` | 0; 0 | 1; 1 | Original; raisin sibling, respectively. |
| `Céréales Mesa Sunrise aux raisins secs` | 0 | 1 | Raisin sibling. |
| `Céréales multigrains biologiques, Mesa Sunrise`; `Céréales multigrains avec raisins secs biologiques, Mesa Sunrise` | 0; 0 | 1; 1 | Exact French Metro product-title aliases resolve to their matching SKU. |
| `Nature’s Path` | 0 | 0 | No broad producer alias is added. |
| `cereal`; `céréales` | 61; 57 | 63; 59 | Each broad cereal search gains the two named products. |
| `céréales multigrains`; `multigrain` | 1; 2 | 3; 2 | The French source-title aliases add both rows to the former; the English query is unchanged. |
| `raisins`; `raisins secs` | 3; 1 | 4; 2 | Only the raisin SKU is added. |
| `granola` | 4 | 4 | Unchanged; the manufacturer identifies cereal flakes, and no granola alias is proposed. |
| `corn`; `flax`; `lin`; `buckwheat`; `sarrasin`; `quinoa`; `amaranth`; `amarante` | 36; 1; 1; 14; 15; 10; 6; 6 | unchanged | No component alias is added. |

These are deterministic static result counts from the source implementation and review-time data; they are not a runtime picker test.

## Full manifest recipe-corpus scan

All **114** files named in the bundled manifest were parsed: **1,123** structured ingredient rows and **753,988** exact recipe-file bytes. The manifest-ordered corpus SHA-256 is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`; it hashes each manifest-relative recipe path as UTF-8, a NUL byte, the exact recipe-file bytes, and a NUL byte.

Full-file and structured-row scans for `Mesa Sunrise`, `Mesa Sunrise with raisins`, both UPCs (`058449779018`, `058449771616`), both proposed reference IDs, the bilingual displays, and the French product-title aliases found **zero matching recipe files and zero matching ingredient rows**. The bundle contains no amount, recipe link, or candidate-specific demand for this pair.

Reproduce the corpus count, byte count, fingerprint, and phrase scan from the repository root with:

```python
import hashlib, json
from pathlib import Path

package = Path("app/src/main/assets/seed/bundled-library")
manifest = json.loads((package / "manifest.v1.json").read_text(encoding="utf-8"))
needles = ["mesa sunrise", "mesa sunrise with raisins", "058449779018", "058449771616",
           "ingredient-ref-mesa-sunrise-cereal",
           "ingredient-ref-mesa-sunrise-with-raisins-cereal",
           "céréales mesa sunrise"]
digest, byte_count, row_count, hits = hashlib.sha256(), 0, 0, []
for relative_path in manifest["recipeFiles"]:
    raw = (package / relative_path).read_bytes()
    byte_count += len(raw)
    digest.update(relative_path.encode("utf-8")); digest.update(b"\0")
    digest.update(raw); digest.update(b"\0")
    text = raw.decode("utf-8").casefold()
    if any(needle.casefold() in text for needle in needles):
        hits.append(relative_path)
    recipe = json.loads(raw)
    row_count += len(recipe.get("ingredients", []))
print(len(manifest["recipeFiles"]), row_count, byte_count, digest.hexdigest(), hits)
```

For the picker table, load the current references/forms, append the two proposed bilingual records from the catalog-fields table (including the two French aliases), and query the strings listed above using `IngredientReferenceSearchIndex.filter` in `IngredientSearch.kt`. The source-ID/URL audit is reproducible by collecting each `sources[]` entry from every ledger record, asserting each `sourceId` has only one URL, and checking the five IDs and exact URLs in the ownership table.

## Review disposition

The two bilingual identities were integrated with only the names and source-backed French product-title aliases shown above. The product pair remains distinct, package information remains source-specific, and measurement, conversion, yield, and substitution behavior remain unset. Section F remains open for other regional cereal mixes and preprocessed-grain gaps.

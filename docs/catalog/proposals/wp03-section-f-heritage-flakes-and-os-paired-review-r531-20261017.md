# WP03 Section F R531 — Nature’s Path Heritage Flakes and Heritage O’s paired identity review (2026-10-17)

## Integration status

Integrated on 2026-10-17 as two separate identity-only references. The Maxi 1 cup (49 g) serving is retained only as a SKU-specific ledger observation. No density, mapping, conversion, form, recipe link, yield, or substitution was added.

## Scope and recommendation

The open Section F checklist calls for review of regionally significant cereal mixes and preprocessed grains ([active plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4385)); the broader cereal and preprocessed-grain sweep remains open ([plan overview](../../RecipeBook-global-ingredient-catalog-plan.txt#L15654)). This review covers one paired Nature’s Path family: **Heritage Flakes** and **Heritage O’s**. It does not overlap the integrated Honey Bunches of Oats products (R522), the Quaker Harvest Crunch Canadian Maple family hold (R524), or the Mesa Sunrise pair (R528). A prior Heritage O’s mention in the wheat-meal research is ingredient-label evidence only, not a cereal identity decision.

**Recommend two separate bilingual, identity-only `GRAIN_AND_CEREAL` references.** The manufacturer identifies them as distinct finished cereals, with different product names and flake versus O-shaped products. Their descriptions name the same six grains, but this does not make them aliases or forms of one another. They should be reviewed together because adding only one would make the complete `Heritage` picker query resolve to a misleading single result.

The current English manufacturer pages are product-specific. The Canadian French manufacturer pages are accessible but retain English product headings and awkward pack text; the Heritage O’s page also machine-translates the name as “Le patrimoine O.” Québec retailer listings provide separate product-specific French wording for each SKU. These retailer phrases support descriptive labels and narrow aliases, not an OQLF terminology ruling.

## Proposed catalog fields

| ID | English display | French display | Category | English aliases | French aliases | Density / unit mappings |
|---|---|---|---|---|---|---|
| `ingredient-ref-heritage-flakes-cereal` | `Heritage Flakes cereal` | `Céréales Heritage Flakes` | `GRAIN_AND_CEREAL` | `[]` | [`Céréales biologiques Heritage Flakes`] | `null` / `[]` |
| `ingredient-ref-heritage-os-cereal` | `Heritage O's cereal` | `Céréales Heritage O's` | `GRAIN_AND_CEREAL` | `[]` | [`Céréales Héritage O's biologiques`] | `null` / `[]` |

The English displays preserve each current manufacturer product name and add the food class. The French displays retain the product marks and use the Québec retailer wording with a clear cereal class. The French aliases are product-specific retailer title variants: Maxi’s indexed Heritage Flakes title and Mayrand’s Heritage O’s title, with brand boilerplate, package weight, and trademark formatting omitted. Do not add generic `Heritage`, `Nature’s Path`, `organic/biologique`, `ancient grains/grains anciens`, or `six/seven grains` aliases. The Metro Heritage Flakes index phrase is recorded as evidence, but not activated as an alias because it adds the generic phrase `grains anciens` to that product’s search terms. The Metro Heritage O’s “sept grains” phrase conflicts with the current manufacturer and La Moisson descriptions and is excluded.

Keep these rows separate from each other, generic multigrain or ancient-grain blends, and the component grain/flour ingredients. Brand-only search would imply that Nature’s Path’s wider cereal and pantry catalog is represented. Package size and UPC identify retail SKUs; neither is a measure, conversion, or recipe quantity.

## Product identity and Québec French evidence

Nature’s Path’s Canadian English pages name each cereal separately and describe each as a ready-to-eat product made from six ancient grains: khorasan wheat, quinoa, millet, spelt, oats, and barley. The product images/page data carry distinct identifiers: Heritage Flakes UPC `058449770213`; Heritage O’s UPC `058449770015`. Both are shown as 6 × 907 g manufacturer multipacks and were marked sold out on the manufacturer pages when checked. These are current identity pages and a stock snapshot, not evidence of discontinuation.

The Canadian French manufacturer pages confirm French-language page content but do not provide usable French product headings. Heritage Flakes is headed “Heritage Flakes® Cereal, 907 g de Terre conviviale Sac”; Heritage O’s is headed “Heritage O's Cereal, 907 g Earth Friendly Sac.” The latter page’s French description translates the name as “Le patrimoine O.” These awkward titles and translation are excluded from the catalog display and aliases.

The Québec retail evidence is different for each SKU:

- **Heritage Flakes:** Maxi’s French indexed listing names “Céréales biologiques Heritage Flakes,” 907 g, product `20312067001_EA`. Its indexed details showed stock at Maxi Laval Laurentides when retrieved. Metro’s French indexed result names “Céréales biologiques de grains anciens, Heritage Flakes,” 907 g, UPC `058449770213`. Direct Metro access was not available in this review; the open returned an internal error, and an independent check reports that the Metro page redirects to English. Treat the French title and item details as indexed evidence only. Maxi’s direct page request also returned an internal error, so its title and local availability are index evidence, not a directly opened live listing.
- **Heritage O’s:** Mayrand’s French indexed title is “Céréales Héritage O's biologiques,” product `16360`, UPC `058449770015`. The listing title says 970 g but its unit is explicitly `1 × 907 g`; use 907 g only as the package SKU context and do not copy the inconsistent 970 g title text into the alias. The indexed result showed stock at named Mayrand Québec stores; direct access returned an internal error, so inventory is time- and store-specific. La Moisson’s directly opened French page is titled “Céréales Heritage - O'S,” lists 907 g, marks it “EN MAGASIN SEULEMENT” / pickup-only, and describes the cereal using the six-grain set. Metro’s French indexed title says “Céréales aux sept grains biologiques, Heritage O's” for UPC `058449770015`; its older indexed description and seven-grain claim conflict with the current manufacturer and La Moisson six-grain descriptions. The Metro direct page returned an error in this review and an independent check reports an English redirect. Do not use “sept grains” as a display, alias, or formula claim.

The names `Céréales Heritage Flakes` and `Céréales Heritage O's` are descriptive Québec-facing catalog labels grounded in these product-specific French listings; they are not asserted as official terminology. The English apostrophe and its curly form normalize equivalently in picker search. No alias is needed for punctuation or accent variants already handled by the search normalizer.

## Measures, conversions, and substitutions

Maxi’s indexed Heritage Flakes nutrition panel reports a product-serving observation of **1 cup (49 g)** for the 907 g SKU. Preserve this only as a SKU- and source-specific observation in the research ledger if integrated; it does not support a generic cup mass, active cup measure, unit mapping, density, or conversion for cereal flakes. The retailer says its product information can change and recommends checking the package.

The reviewed Heritage O’s retailer page gives 16 g of whole grains per serving in its indexed description, not a serving’s total mass or volume. The `907 g` package sizes, multipack totals, and Mayrand’s inconsistent title weight are not recipe measures. No source supports a transferable density, unit mapping, conversion, package yield, or active measure for either cereal.

No recipe or product source supports replacing flakes with O’s, another cereal, or a component grain in a particular recipe. The shared six-grain marketing description does not establish equivalent texture or recipe performance. Add no forms, recipe links, conversions, yields, or substitutions.

## Source IDs, URLs, and limits

These proposal-local IDs were checked against the live research ledger; none of the IDs or exact URLs below was owned there at review time. Each proposed source ID maps to one exact URL and one product decision. Access date: 2026-10-17.

| Source ID | URL and locator | Evidence and limits |
|---|---|---|
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S01` | [Nature’s Path Canada — Heritage Flakes](https://naturespath.com/en-ca/products/heritage-flakes-cold-cereal-np-ca), product heading, package selector, availability, product description, and product image. | Names the cereal; describes six grains; shows UPC `058449770213` in the product image data and a 6 × 907 g multipack marked sold out. Formulas and stock can change. Identity source for Flakes only. |
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S02` | [Nature’s Path Canada French site — Heritage Flakes](https://naturespath.com/fr-ca/products/heritage-flakes%C2%AE-cereal-907-g-de-terre-conviviale-sac), heading and product description. | The FR-CA page names the SKU and describes its six grains, but retains the English product heading and awkward translated pack text. Its multipack was marked sold out. It is evidence of French page content, not a French naming authority. |
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S03` | [Maxi Québec — Nature’s Path Céréales biologiques Heritage Flakes](https://www.maxi.ca/fr/c-r-ales-biologiques-heritage-flakes/p/20312067001_EA?icta=recommended-carousel), French indexed product title, product number, availability, and nutrition panel. | Indexed title is product-specific; 907 g and 1 cup (49 g) are SKU/listing details. It showed stock at Maxi Laval Laurentides when indexed. Direct open returned an internal error; retailer information and inventory are time-sensitive. Supports the proposed Flakes French alias and the source-specific serving observation only. |
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S04` | [Metro Québec — Heritage Flakes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-biologiques-de-grains-anciens/p/058449770213), French indexed product title, item number, and description. | Index names the 907 g product as “Céréales biologiques de grains anciens, Heritage Flakes” and gives UPC `058449770213`. The direct Metro page did not open in this session; an independent check reports an English redirect. Treat the indexed French listing as product-specific retailer evidence only, not a verified live French page or current stock claim. Not activated as an alias. |
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S05` | [Nature’s Path Canada — Heritage O’s](https://naturespath.com/en-ca/products/heritage-os-cold-cereal-np-ca), product heading, package selector, availability, and description. | Names the distinct O-shaped cereal; describes the six grains; product image data carries UPC `058449770015`; 6 × 907 g multipack was marked sold out. Formula and availability may change. Identity source for O’s only. |
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S06` | [Nature’s Path Canada French site — Heritage O’s](https://naturespath.com/fr-ca/products/heritage-os-cereal-907-g-earth-friendly-sac), heading and product description. | Confirms a French-language product page and six-grain description, but its heading and pack wording remain English; body translation includes “Le patrimoine O.” Marked sold out. Not used for the French display or alias. |
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S07` | [Mayrand Québec — Céréales Héritage O's biologiques](https://mayrand.ca/fr/nos-produits/epicerie/cereales-et-barre/cereales/cereales-heritage-os-biologiques-16360), indexed product title, item/UPC, unit package, and store availability. | Identifies item `16360`, unit UPC `058449770015`, and `1 × 907 g`; title says 970 g. Indexed inventory showed stock at Mayrand Anjou, Laval, Brossard, and Saint-Jérôme. Direct open returned an internal error; stock and title are indexed, store-specific observations. Supports the O’s French alias, with no package mass in the alias. |
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S08` | [La Moisson Québec — Céréales Heritage - O'S](https://lamoisson.com/products/cereales-heritage-os), product heading, package size, availability, description, and ingredient panel. | Directly opened French product page lists 907 g, pickup/in-store-only availability, and the six-grain description. The page warns product information may be out of date. Strong product-matched Québec French evidence for the O’s identity; stock remains retailer-specific. |
| `WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S09` | [Metro Québec — Heritage O’s](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-de-grains-entiers-biologiques/p/058449770015), French indexed title, UPC, package listing, and description. | Index title says “Céréales aux sept grains biologiques, Heritage O's” for 907 g / UPC `058449770015`; description and grain count conflict with current maker and La Moisson evidence. Direct open returned an error here; an independent check reports an English redirect. Retain only as evidence of an inconsistent indexed retailer label; no “sept grains” alias or current availability claim. |

## Catalog, archive, and snapshot audit

The read-only audit covered active ingredient references, forms, legacy identities, the research ledger, the plan, roadmap, relevant proposals/batches, and the full recipe bundle. No Heritage Flakes/O’s reference ID, product identity, form, or legacy candidate was present. The only active-row phrase search hit in cereal references is the separate Mesa Sunrise pair and an unrelated Rogers ancient-grain porridge blend; neither is this product. No prior focused Heritage Flakes/O’s catalog review was found. The sole ledger mention is source `A7WM-20261011-S07` (Voilà’s Heritage O’s finished-cereal ingredient label), attached to the wheat-meal research; it supports the ingredient declaration only, not a Nature’s Path product identity. It is not reused here.

Review-time snapshot: **1,799 references** (**265** `GRAIN_AND_CEREAL`), **144 forms**, **56 legacy candidates**, and **2,156 ledger records** with **9,913 source entries**, **8,390 distinct source IDs**, and **7,098 distinct URLs**. A full ledger audit found zero source IDs mapped to multiple URLs. All nine proposed source IDs and all nine exact URLs above were unowned. Snapshot hashes:

| File | SHA-256 |
|---|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `d653bdc31f156a1610dbbb4e3c2e6fa73de4adaed777ced14b9fcbc0643dce13` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `5a47b562629b3f7a248f4d6068b606a6baf6c216480caca8a63fc9fb1ec74b17` |
| `docs/catalog/legacy-import-identities.v1.json` | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `docs/catalog/research-ledger.v1.json` | `a210eda318aa2aa04b684e3c0e134ed5c618cc0b666fc8a0e2b50f9d291e494c` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Phrase-first picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, accent and ligature folding, punctuation-to-space normalization, complete word-phrase matches first, then substring fallback only if there are no complete phrase matches. It appends the two proposed bilingual rows and their two French aliases, with no forms.

| Query | Current results | With R531 | Projection |
|---|---:|---:|---|
| `Heritage`; `Céréales Heritage` | 0; 0 | 2; 2 | Both products; avoids a misleading single `Heritage` result. |
| `Heritage Flakes`; `Céréales Heritage Flakes` | 0; 0 | 1; 1 | Heritage Flakes only. |
| `Heritage O's`; `Heritage O’s`; `Céréales Heritage O's` | 0; 0; 0 | 1; 1; 1 | Heritage O’s only. Apostrophe variants normalize equivalently. |
| `Céréales biologiques Heritage Flakes` | 0 | 1 | Maxi product-specific French alias. |
| `Céréales Héritage O's biologiques` | 0 | 1 | Mayrand product-specific French alias. |
| `Céréales biologiques`; `biologiques` | 0; 2 | 1; 4 | The retailer-title aliases add the Flakes row to the first query and both products to the broad organic-word query. |
| `Nature’s Path` | 0 | 0 | No broad producer alias is added. |
| `cereal`; `céréales` | 63; 59 | 65; 61 | Each broad cereal query gains the two named products. |
| `flakes`; `flocons` | 28; 29 | 29; 29 | English Flakes query gains one; no `flocons` alias is added. |
| `grains anciens` | 1 | 1 | Unchanged; the Metro title is not activated as an alias. |

These are deterministic counts from the source search terms and review-time references/forms, not a runtime picker test.

## Full manifest recipe-corpus scan

All **114** paths in the current manifest were read and parsed: **1,123** structured ingredient rows and **753,988** exact recipe-file bytes. The manifest-ordered corpus SHA-256 is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`; it hashes each manifest-relative path as UTF-8, a NUL byte, exact file bytes, then a NUL byte.

Full-file and ingredient-row scans for `Heritage Flakes`, `Heritage O's` / `Heritage Os`, the proposed IDs and bilingual displays, `Nature’s Path Heritage Flakes/O’s`, and both retailer aliases found **zero matching recipe files, zero matching ingredient rows, and zero title/description/instruction matches**. The bundle supplies no amount, recipe link, or candidate-specific demand.

Reproduce the count, byte total, fingerprint, and full-file search from the repository root:

```python
import hashlib, json
from pathlib import Path

package = Path("app/src/main/assets/seed/bundled-library")
manifest = json.loads((package / "manifest.v1.json").read_text(encoding="utf-8"))
needles = ["heritage flakes", "heritage o's", "heritage o’s", "heritage os",
           "nature's path heritage flakes", "nature’s path heritage o’s",
           "céréales heritage flakes", "céréales heritage o's",
           "céréales héritage o's biologiques", "céréales biologiques heritage flakes",
           "058449770213", "058449770015",
           "ingredient-ref-heritage-flakes-cereal", "ingredient-ref-heritage-os-cereal"]
digest, byte_count, row_count, hits, row_hits = hashlib.sha256(), 0, 0, [], []
for relative_path in manifest["recipeFiles"]:
    raw = (package / relative_path).read_bytes()
    byte_count += len(raw)
    digest.update(relative_path.encode("utf-8")); digest.update(b"\0")
    digest.update(raw); digest.update(b"\0")
    text = raw.decode("utf-8").casefold()
    if any(needle in text for needle in needles):
        hits.append(relative_path)
    recipe = json.loads(raw)
    ingredients = recipe.get("ingredients", [])
    row_count += len(ingredients)
    if any(any(needle in json.dumps(row, ensure_ascii=False).casefold() for needle in needles)
           for row in ingredients):
        row_hits.append(relative_path)
print(len(manifest["recipeFiles"]), row_count, byte_count, digest.hexdigest(), hits, row_hits)
```

Reproduce the source-ownership audit with the same proposed IDs and exact URLs from the source table:

```python
import json
from pathlib import Path

ledger = json.loads(Path("docs/catalog/research-ledger.v1.json").read_text(encoding="utf-8"))
owners = {}
for record in ledger["records"]:
    for source in record.get("sources", []):
        owners.setdefault(source["sourceId"], set()).add(source["url"])
assert all(len(urls) == 1 for urls in owners.values())
proposed_ids = [f"WP03-NATURES-PATH-HERITAGE-CEREAL-R531-20261017-S{i:02d}"
                for i in range(1, 10)]
assert all(source_id not in owners for source_id in proposed_ids)
proposed_urls = [
    "https://naturespath.com/en-ca/products/heritage-flakes-cold-cereal-np-ca",
    "https://naturespath.com/fr-ca/products/heritage-flakes%C2%AE-cereal-907-g-de-terre-conviviale-sac",
    "https://www.maxi.ca/fr/c-r-ales-biologiques-heritage-flakes/p/20312067001_EA?icta=recommended-carousel",
    "https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-biologiques-de-grains-anciens/p/058449770213",
    "https://naturespath.com/en-ca/products/heritage-os-cold-cereal-np-ca",
    "https://naturespath.com/fr-ca/products/heritage-os-cereal-907-g-earth-friendly-sac",
    "https://mayrand.ca/fr/nos-produits/epicerie/cereales-et-barre/cereales/cereales-heritage-os-biologiques-16360",
    "https://lamoisson.com/products/cereales-heritage-os",
    "https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-de-grains-entiers-biologiques/p/058449770015",
]
ledger_urls = {source["url"] for record in ledger["records"]
               for source in record.get("sources", [])}
assert all(url not in ledger_urls for url in proposed_urls)
print(len(ledger["records"]), sum(len(r.get("sources", [])) for r in ledger["records"]),
      len(owners), len(ledger_urls))
```

For the picker rows, append the two records from the proposed-fields table and their French aliases to the review-time reference set and use the complete-phrase then substring behavior in `IngredientSearch.kt`; forms are included in the indexed search terms but no new forms are proposed.

## Static validation and testing rule

Shared integration has completed. The package, generated index, ledger schema/source ownership, picker projections, manifest-wide corpus scan, encoding, local links, and whitespace were checked. No app tests, build, emulator, or deployment were run; this database-JSON-only addition does not require software tests under `AGENTS.md`. Section F remains open for additional cereal and preprocessed-grain gaps.

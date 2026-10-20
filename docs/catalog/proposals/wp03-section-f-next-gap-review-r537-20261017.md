# WP03 Section F R537 — Quaker Life cereal family review (2026-10-17)

## Review record

- **Status:** Integrated on 2026-10-17. See the [R537–R539 integration README](../batches/wp02-wp03-wp04-r537-r539-gap-review-integration-20261017/README.md).
- **Scope:** One currently listed Canadian Quaker Life ready-to-eat cereal family: Original, Cinnamon, and Multigrains.
- **Recommendation:** Add three separate identity-only `GRAIN_AND_CEREAL` references, one per manufacturer-listed product. Use the current Canadian English and French manufacturer product names with distinct variant-qualified English search phrases. Each phrase keeps the family wording while retaining its Original, Cinnamon, or Multigrains qualifier; no exact alias is shared across rows.
- **Plan fit:** The open Section F checklist still asks for regionally significant cereal mixes and preprocessed grains ([plan checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4417)) and broader cereal/preprocessed-grain review ([plan continuation](../../RecipeBook-global-ingredient-catalog-plan.txt#L15685)). The roadmap retains Section F as open after R534 ([roadmap, R534–R536](../../../roadmap.md#L1325)).

## Decision and product boundaries

PepsiCo Canada’s current English and French Quaker Life family pages list the same three products: Original, Cinnamon, and Multigrains. Each listed product has a separate bilingual product page. The French family page says Quaker products are sold in grocery stores across Canada; this establishes the Canadian product family and bilingual naming context, not store-level inventory. Current Québec retailer results independently corroborate all three product names, with source-specific package information. The manufacturer’s roster is the basis for the narrow family scope; it does not claim a complete history or an exhaustive world-wide list of Life cereal products.

Recommend three rows rather than making one variant stand in for the brand family. Original, Cinnamon, and Multigrains are separately named ready-to-eat products with different ingredient declarations. Their shared Quaker Life family wording should return all three results. Do not map them to one another, to generic oats, oat bran, wheat flour, rice flour, corn flour, granola, muesli, or cereal components.

| Proposed ID | English display | Canadian French display | English aliases | French aliases | Category |
|---|---|---|---|---|---|
| `ingredient-ref-quaker-life-original-cereal` | `Quaker Life Original cereal` | `Quaker Céréales Life` | `Life cereal Original`; `Quaker Life cereal Original` | `[]` | `GRAIN_AND_CEREAL` |
| `ingredient-ref-quaker-life-cinnamon-cereal` | `Quaker Life Cinnamon cereal` | `Quaker Céréales Life Cannelle` | `Life cereal Cinnamon`; `Quaker Life cereal Cinnamon` | `[]` | `GRAIN_AND_CEREAL` |
| `ingredient-ref-quaker-life-multigrains-cereal` | `Quaker Life Multigrains cereal` | `Quaker Céréales Life Multigrains` | `Life cereal Multigrains`; `Quaker Life cereal Multigrains` | `[]` | `GRAIN_AND_CEREAL` |

The English manufacturer family heading is `Life Cereal`; its Original product page also calls the plain product `Quaker Life Cereal`. The active aliases preserve those family phrases with the variant name appended to each, so `Life cereal` and `Quaker Life cereal` queries return all three current members while every stored alias has one owner. Individual displays preserve the three distinct products; do not add sibling flavor terms to another row. The French manufacturer uses `Quaker Céréales Life`, `Quaker Céréales Life Cannelle`, and `Quaker Céréales Life Multigrains`. These French names are product wording, not an OQLF terminology ruling.

The English official product category currently shows three variants, matching the French category page. Metro also retains a `Life Chocolate Flavoured Whole Grain Cereal` listing, but its page redirects to English and currently reports the product out of stock. The Canadian Quaker Life family pages do not list it, and no current product-matched French name was found. Do not add it from that retailer record alone. Reopen if PepsiCo Canada restores it to the current family listing or product-matched current Canadian/French evidence establishes it as an offered SKU. This limitation keeps the recommendation tied to the current Canadian manufacturer list rather than asserting that no historical or retailer-only Life variants exist.

The immediate archive boundaries are separate:

- R524 holds Quaker Harvest Crunch Canadian Maple because the English and French Harvest Crunch/Croque Nature rosters differ; this is a different cereal family and remains held.
- R237’s active Quaker Super Grains Hot Cereal is a formulated hot cereal, not a Life variant.
- R500 holds Cinnamon Toast Crunch pending a different family decision. R534 added Golden Grahams cereal and documented the separate `Croque Cannelle Graham` CinnaGraham product.
- No dedicated Life cereal review or Life product identity appears in the reviewed plan, roadmap, proposal archive, or batch archive. R516, R519, R522, R528, R531, and R534 concern distinct products.

## Current package, catalog ownership, and source snapshot

The read-only audit covered active references, forms, legacy candidates, research-ledger records and unit conversions, proposal and batch archives, the Section F plan and roadmap, and every recipe in the active manifest.

| Surface | Snapshot at review |
|---|---:|
| Active ingredient references | 1,802 |
| `GRAIN_AND_CEREAL` references | 268 |
| Active ingredient forms | 145 |
| Legacy-import candidates | 56 |
| Research-ledger records | 2,160 |
| Ledger source entries / distinct source IDs / distinct URLs | 9,933 / 8,406 / 7,114 |
| Ledger unit-conversion records | 8 |
| Manifest recipes / structured ingredient rows | 114 / 1,123 |

| File at review | SHA-256 |
|---|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `d84e245608dabe7f33b9507f7d17590f84e6b10af19f3dcacac1f1e8fb2e14b6` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `f24f5a06aec56d0d89a6d0c22d3453eca80239636d2db7ceb800a4a1ce01cc78` |
| `docs/catalog/legacy-import-identities.v1.json` | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `docs/catalog/research-ledger.v1.json` | `1b3956a7878fe7084805b7283857650a1368c825c45b6a08356c391ea9edd1e7` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

No exact normalized active reference or form owner was found for the three product names, proposed IDs, `Life cereal`, or `Quaker Life cereal`. No exact candidate was found in the 56 legacy-import identities or in the ledger. The ledger does contain unrelated uses of “Life” in source titles, such as Country Life Natural Foods; none identifies Quaker Life cereal. Each proposed reference ID and the proposal-local source-ID prefix below were unused at review. A whole-ledger ownership check found no source ID mapped to more than one URL.

At proposal review, the 12 source URLs below had no exact URL owner in the ledger. Integration registered source IDs S01–S11 in the corresponding Life records; S12 remains a boundary-only retailer source and is not registered. The ownership snapshot and final assignments are summarized in the linked integration README.

## Phrase-first picker projection

The static projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and NFKD normalization, accent/ligature/punctuation folding, complete normalized word-phrase matches first, then substring fallback only if no full phrase matches. It includes reference names, aliases, and forms attached to each reference. The projection adds the three proposed rows and their two distinct, variant-qualified English aliases; no forms are proposed.

| Query | Current results | With proposal | Result and boundary |
|---|---:|---:|---|
| `Life`; `Quaker Life`; `Life cereal`; `Quaker Life cereal` | 0; 0; 0; 0 | 3; 3; 3; 3 | Each family query returns Original, Cinnamon, and Multigrains. |
| `Céréales Life`; `Quaker Céréales Life` | 0; 0 | 3; 3 | Both French family phrases return the same three products. |
| `Quaker Life Original cereal`; `Quaker Céréales Life Cannelle`; `Quaker Céréales Life Multigrains` | 0; 0; 0 | 1; 1; 1 | Product-specific names select Original, Cinnamon, or Multigrains. |
| `Original`; `Cinnamon`; `Cannelle`; `Multigrains` | 9; 6; 6; 5 | 10; 7; 7; 6 | Each existing broad flavor/grain term gains only its corresponding Life product. |
| `cereal`; `céréales` | 66; 62 | 69; 65 | Each broad cereal-category query gains the three named products. |
| `Quaker` | 1 | 4 | Adds three Life products alongside the existing Quaker Super Grains hot cereal. This is not a claim that all Quaker foods are represented; do not add a `Quaker` alias. |
| `oats`; `avoine` | 12; 18 | 12; 18 | Declared cereal components remain searchable through their own ingredient references; the finished products do not become oat aliases. |
| `Graham`; `Grahams`; `Golden Grahams` | 2; 1; 1 | 2; 1; 1 | Graham flour and crumbs remain the two singular `Graham` results; plural `Grahams` and `Golden Grahams` remain on the R534 product. |
| `Croque Cannelle Graham`; `CinnaGraham`; `Cinnamon Toast Crunch` | 0; 0; 0 | 0; 0; 0 | R500’s separately held CinnaGraham/Toast Crunch-family wording is unaffected. |

The proposal does not alias Life products to “Graham” or “Cinnamon Toast Crunch”. R534’s Golden Grahams result remains distinct from the two active Graham ingredient identities because `Graham` and `Grahams` are different complete query words. The variant-qualified Life family phrases preserve three-result family behavior without storing an alias on multiple references or merging product variants.

## Full manifest recipe-corpus scan

The active manifest contains **114 recipe files**, **1,123 structured ingredient rows**, and **753,988 recipe-file bytes**. The manifest-ordered corpus fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. The fingerprint hashes each manifest-relative path as UTF-8, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

Full recipe-object and structured-row scans for all proposed English/French product names, both shared Life-family phrases, retailer numbers `055577105221`, `055577105238`, and `21009965_EA`, and all three proposed reference IDs found **zero candidate-specific recipe files and zero matching ingredient rows**. No recipe line links to a Life product identity. The full scan also checked the specific Cinnamon/Graham boundary terms `Golden Grahams`, `Grahams`, `Croque Cannelle Graham`, `CinnaGraham`, and `Cinnamon Toast Crunch`.

The generic single word `Life` appears in recipe 032’s source name `Life Love and Sugar`; that is source attribution and there are **zero** Life product ingredient rows. The generic `Graham` word appears in three unrelated graham-cracker-crumb rows: recipe 006 row 5, recipe 026 row 1, and recipe 081 row 1. `Grahams` and the Life product phrases have no corpus hits. These matches do not create recipe demand for Quaker Life cereal.

## Portions, forms, conversions, and substitutions

| Product | Manufacturer label portion | Integrated treatment |
|---|---|---|
| Original | ¾ cup (30 g) | Product-specific `portion_weight` observation only. |
| Cinnamon | ¾ cup (32 g) | Separate product-specific `portion_weight` observation only. |
| Multigrains | ¾ cup (30 g) | Separate product-specific `portion_weight` observation only. |

The manufacturer product pages provide the stated label portions, which support recording SKU/variant-specific observations in the research ledger. The values vary and do not support a shared `Life cereal` volume-to-mass mapping, default density, or a transferable portion for other cereals. Package weights shown by Metro/Maxi (Original 450 g, Multigrains 425 g, Cinnamon 455 g) identify those retail presentations only.

Add no `IngredientForm`, active volume measure, density, unit mapping, conversion, package/cooking yield, or recipe link. The products are finished ready-to-eat cereals, not forms of oats or the other grains listed in their ingredient panels. The ingredient declarations establish formulated products but not ingredient proportions or an exact universal formula. No source gives a tested, quantity-qualified replacement among Life variants or between Life and another cereal, oat, granola, or muesli product; add no substitution finding or rule.

## Source register

Sources were reviewed online on **2026-10-17**. Tasty Rewards is PepsiCo Canada’s current Quaker product site (its pages carry the PepsiCo Canada ULC footer). Its current Canadian English and French family pages provide the aligned three-product roster. Product pages support exact names, product distinction, ingredient statements, and label portions. Retailer pages are corroborating title/package evidence only; package sizes and inventory are store/SKU-specific.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-QUAKER-LIFE-R537-20261017-S01` | Quaker / PepsiCo Canada, [Life Cereal family page, English](https://www.tastyrewards.com/en-ca/brands/quaker/products-categories/life-cereal), product-list entries `Quaker Life Cinnamon Cereal`, `Quaker Life Multigrains Cereal`, and `Quaker Life Original Cereal`. | Current Canadian manufacturer product category lists the three English products. The list is a current-site snapshot, not a permanent or historical complete roster. |
| `WP03-QUAKER-LIFE-R537-20261017-S02` | Quaker / PepsiCo Canada, [Céréales Life family page, français canadien](https://www.tastyrewards.com/fr-ca/marques/quaker/produits-categories/life-cereal), entries `Quaker Céréales Life Cannelle`, `Quaker Céréales Life Multigrains`, and `Quaker Céréales Life`; introductory Canadian availability statement. | Current French-Canadian manufacturer page lists the same three products and says Quaker products are sold in grocery stores across Canada. It is not a store-specific availability check or a terminology-authority ruling. |
| `WP03-QUAKER-LIFE-R537-20261017-S03` | Quaker / PepsiCo Canada, [Life Original Cereal](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-lifer-original-cereal), product title, ingredients, and nutrition panel. | Supports the English product name, ready-to-eat cereal identity, ¾ cup (30 g) label serving, and product-specific formulation. These are label statements, not a generic cereal measure or a full product-family roster. |
| `WP03-QUAKER-LIFE-R537-20261017-S04` | Quaker / PepsiCo Canada, [Quaker Céréales Life](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-lifer), French product heading, ingredients, and nutrition panel. | Supports the exact plain-product French heading. Its French nutrition-panel text renders `3/4 coup (30 g)`; use the English product page’s clear `3/4 Cup (30 g)` as the serving wording and retain 30 g only as the same product’s source-specific observation. The page does not establish an OQLF-preferred product name. |
| `WP03-QUAKER-LIFE-R537-20261017-S05` | Quaker / PepsiCo Canada, [Life Cinnamon Cereal](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-lifer-cinnamon-cereal), product title, ingredients, and nutrition panel. | Supports the English Cinnamon product, distinction from Original/Multigrains, and ¾ cup (32 g) product-panel serving. No shared density or conversion follows. |
| `WP03-QUAKER-LIFE-R537-20261017-S06` | Quaker / PepsiCo Canada, [Quaker Céréales Life Cannelle](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-lifer-cannelle), heading, French ingredient declaration, and `¾ tasse (32 g)` panel. | Directly supports the Canadian French display and product identity. The manufacturer’s ingredient list applies to this variant and may change; it does not give a generic Life formula. |
| `WP03-QUAKER-LIFE-R537-20261017-S07` | Quaker / PepsiCo Canada, [Life Multigrains Cereal](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-lifer-multigrains-cereal), product title, ingredients, and nutrition panel. | Supports the English Multigrains product, its oat/wheat/corn-based formulated cereal identity, and ¾ cup (30 g) product-specific panel serving. Ingredient ordering does not establish proportions. |
| `WP03-QUAKER-LIFE-R537-20261017-S08` | Quaker / PepsiCo Canada, [Quaker Céréales Life Multigrains](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-lifer-multigrains), French heading, ingredient declaration, and `¾ tasse (30 g)` panel. | Supports the French display and product-specific identity. Its source text contains spelling/diacritic errors in some ingredient names; none are adopted as catalog names or aliases. |
| `WP03-QUAKER-LIFE-R537-20261017-S09` | Metro Québec, [Céréales d’avoine à grains entiers, Life](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-d-avoine-a-grains-entiers/p/055577105221), product number `055577105221`, 450 g. | Current indexed Québec French listing uses a descriptive title and its description calls the product `céréales Life Originale de Quaker`. Metro’s search-index result was readable; a direct page fetch returned HTTP 403. Treat its title/package as retailer evidence, not a manufacturer label or measure. |
| `WP03-QUAKER-LIFE-R537-20261017-S10` | Metro Québec, [Céréales multigrains, Life](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-multigrains/p/055577105238), product number `055577105238`, 425 g. | Current indexed Québec French listing corroborates Life Multigrains naming and a Canadian-made product listing. Direct page fetch returned HTTP 403; the listing size is SKU-specific and is not a serving or conversion. |
| `WP03-QUAKER-LIFE-R537-20261017-S11` | Maxi Québec, [Life Céréales Cannelle, 455 g](https://www.maxi.ca/fr/life-c-r-ales-cannelle/p/21009965_EA?source=sptd), item `21009965_EA`, French item title and product description. | The indexed French retailer entry reports it prepared in Canada and showed stock at Maxi Laval Laurentides when crawled. Direct page opening failed in this review; the stock statement is store/time-specific and not a general availability claim. |
| `WP03-QUAKER-LIFE-R537-20261017-S12` | Metro, [Life Chocolate Flavoured Whole Grain Cereal, 455 g](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/family-cereals/chocolate-flavoured-whole-grain-cereal/p/055577105269), product number `055577105269`, retailer availability message. | Direct page opened after a French route redirected to English; Metro reported the listing out of stock. The current Canadian Quaker family page does not list this product, and no current French product page/name was found. This is a boundary observation only and does not establish that the SKU remains marketed or stocked in Canada. |

At proposal review, the three reference IDs, source IDs S01–S12, and exact URLs above had no existing owner. Integration allocated the three references and S01–S11; S12 remains an unregistered boundary source. The integrated ledger source IDs each map to one URL.

## Reproducible static validation

From the repository root, reproduce the reviewed source hashes with:

```sh
sha256sum \
  app/src/main/assets/seed/bundled-library/ingredient-references.v1.json \
  app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json \
  docs/catalog/legacy-import-identities.v1.json \
  docs/catalog/research-ledger.v1.json \
  app/src/main/assets/seed/bundled-library/manifest.v1.json
```

Reproduce the corpus fingerprint and verify no proposed product phrase/ID occurs in the manifest recipe text or ingredient rows with:

```sh
python3 - <<'PY'
import hashlib, json, pathlib, re, unicodedata
base = pathlib.Path('app/src/main/assets/seed/bundled-library')
manifest = json.loads((base / 'manifest.v1.json').read_text(encoding='utf-8'))
terms = [
    'Quaker Life Original cereal', 'Quaker Life Cinnamon cereal',
    'Quaker Life Multigrains cereal', 'Quaker Céréales Life',
    'Quaker Céréales Life Cannelle', 'Quaker Céréales Life Multigrains',
    'Life cereal', 'Quaker Life cereal', '055577105221', '055577105238',
    '21009965_EA', 'ingredient-ref-quaker-life-original-cereal',
    'ingredient-ref-quaker-life-cinnamon-cereal',
    'ingredient-ref-quaker-life-multigrains-cereal'
]
boundary_terms = [
    'Life', 'Graham', 'Grahams', 'Golden Grahams',
    'Croque Cannelle Graham', 'CinnaGraham', 'Cinnamon Toast Crunch'
]
def norm(text):
    text = text.casefold().replace('œ', 'oe').replace('æ', 'ae').replace('ß', 'ss').replace('&', ' and ')
    text = ''.join(c for c in unicodedata.normalize('NFKD', text)
                   if unicodedata.category(c) not in {'Mn', 'Mc', 'Me'})
    return re.sub(r'\s+', ' ', re.sub(r'[^a-z0-9]+', ' ', text)).strip()
def strings(value):
    if isinstance(value, dict):
        for child in value.values():
            yield from strings(child)
    elif isinstance(value, list):
        for child in value:
            yield from strings(child)
    elif isinstance(value, str):
        yield value
def contains_phrase(text, phrase):
    padded_text = ' ' + norm(text) + ' '
    return (' ' + norm(phrase) + ' ') in padded_text
digest = hashlib.sha256()
row_count = file_bytes = 0
file_hits, row_hits = [], []
boundary_hits = {}
boundary_row_hits = {}
for term in boundary_terms:
    boundary_hits[term] = []
    boundary_row_hits[term] = []
for rel in manifest['recipeFiles']:
    data = (base / rel).read_bytes()
    recipe = json.loads(data)
    rows = recipe.get('ingredients', [])
    row_count += len(rows)
    file_bytes += len(data)
    text = ' '.join(strings(recipe))
    if any(contains_phrase(text, term) for term in terms):
        file_hits.append(rel)
    for term in boundary_terms:
        if contains_phrase(text, term):
            boundary_hits[term].append(rel)
    for index, row in enumerate(rows, 1):
        row_text = ' '.join(strings(row))
        if any(contains_phrase(row_text, term) for term in terms):
            row_hits.append((rel, index))
        for term in boundary_terms:
            if contains_phrase(row_text, term):
                boundary_row_hits[term].append((rel, index))
    digest.update(rel.encode('utf-8'))
    digest.update(b'\0')
    digest.update(data)
    digest.update(b'\0')
print(len(manifest['recipeFiles']), row_count, file_bytes, digest.hexdigest())
print('candidate recipe files:', file_hits)
print('candidate ingredient rows:', row_hits)
print('boundary recipe hits:', boundary_hits)
print('boundary ingredient-row hits:', boundary_row_hits)
PY
```

The picker counts in this proposal were projected from the current reference/form terms using the normalization and phrase-first/fallback rules in IngredientSearch.kt, then repeated with the three proposed displays and distinct variant-qualified family aliases. No software tests, build, emulator run, or deployment were needed for the JSON-data integration under AGENTS.md.

## Recommendation

Add three distinct bilingual identities for the current Canadian Quaker Life Original, Cinnamon, and Multigrains cereal products. Use distinct variant-qualified English aliases (`Life cereal Original`, `Life cereal Cinnamon`, `Life cereal Multigrains`, and their `Quaker Life cereal` counterparts) so family phrase searches find all three products without alias collisions; retain exact French manufacturer product titles and no French aliases. Keep the three manufacturer label servings as variant-specific ledger observations only if integration records measurement evidence. Add no forms, reusable measures, densities, mappings, conversions, yields, recipe links, or substitutions. The bundled corpus has no candidate-specific demand. Section F remains open for other cereal and preprocessed-grain gaps.

# WP03 Section F R534 — Golden Grahams cereal identity review (2026-10-17)

## Decision

- **Recommendation:** Add one identity-only Canadian product reference, `ingredient-ref-golden-grahams-cereal`, in `GRAIN_AND_CEREAL`.
- **Proposed English display:** `Golden Grahams cereal`.
- **Proposed Canadian French display:** `Céréales Golden Grahams`.
- **Aliases:** none in either language. Keep `Golden Grahams Crunch Cereal` and `Croque Graham Doré Céréales` as retailer-specific titles in the source register only.
- **Limits:** Do not add forms, density, unit mappings, conversions, yields, recipe links, or substitutions. A Québec retailer lists a source-specific nutrition serving of 1 cup (41 g); it is not a reusable cup conversion.
- **Integration status:** Integrated on 2026-10-17. See the [R534–R536 integration README](../batches/wp02-wp03-wp04-r534-r536-gap-review-integration-20261017/README.md).

The Canadian General Mills English and French product guides identify the same named cereal and product code. Both give package GTIN `65633132955` and a 331 g package. Current Canadian retailer records corroborate the English brand/title and the French retail title for cereal products at this size. The narrow reference represents the named Canadian product evidenced by those sources; it does not assert that every international, historical, foodservice, or limited-edition Golden Grahams product has the same formulation.

## Checklist fit and adjacent decisions

The active plan still asks for regionally significant cereal mixes and preprocessed grains ([Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4417)) and leaves the broader cereal/preprocessed-grain review open ([plan continuation](../../RecipeBook-global-ingredient-catalog-plan.txt#L15672)). The roadmap likewise records Section F as open after the latest cereal integrations ([roadmap, R531–R533 summary](../../../roadmap.md#L1324)).

The archive contains separate cereal decisions for Sugar Crisp (R516), Honeycomb (R519), Honey Bunches of Oats formulations (R522), Quaker Harvest Crunch Canadian Maple (R524 hold), Mesa Sunrise (R528), and Heritage Flakes/O’s (R531). None names or owns Golden Grahams. R524 holds a single Quaker Maple variant because two manufacturer pages show a wider, differently sized family. That family question does not transfer to the one specific Canadian Golden Grahams package identified by matching manufacturer product code and package GTIN; this proposal does not claim a complete world-wide family roster.

The nearest naming overlap is the separately listed Cinnamon Toast Crunch CinnaGraham product, `Croque Cannelle Graham`, reviewed as part of R500’s family picker reassessment. General Mills’ French product guide lists that cereal under a different product code (`18948000`), package GTIN (`65633189485`), and 340 g package. Golden Grahams is product code `13295000`, package GTIN `65633132955`, and 331 g. They are distinct products, not variants or aliases of each other. R500’s Cinnamon Toast Crunch family remains held as documented; this proposal does not reopen it.

Keep the proposed cereal separate from Graham flour, graham cracker crumbs, plain wheat, corn meal, sugar or syrup, Honeycomb, Sugar Crisp, and other finished cereals. The retailer terms `Croque Graham Doré Céréales` and `Golden Grahams Crunch Cereal` are indexed as source-specific product titles, not added as aliases. The current retailer ingredient panels disagree about whether honey appears, so this proposal makes no definitive formula claim.

## Proposed active identity

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-golden-grahams-cereal` |
| English display | `Golden Grahams cereal` |
| Canadian French display | `Céréales Golden Grahams` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases, EN / FR | `[]` / `[]` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

The manufacturer’s English product guide uses `Golden Grahams™`. Its French guide places `Golden GrahamsMC` under the heading `CÉRÉALES GOLDEN GRAHAMSMC`; the proposed French display adds the category word while preserving the manufacturer’s brand spelling. This is the clearest product-level bilingual wording in the manufacturer material. Current Maxi and Walmart French pages instead use `Croque Graham Doré Céréales`; those retailer names remain source-specific pending manufacturer package wording. Likewise, `Golden Grahams Crunch Cereal` is Walmart’s current English item title, not a second product established by the Canadian guides.

## Live ownership snapshot

The read-only audit covered active references, forms, legacy candidates, research-ledger records and conversions, proposal/batch archives, plan, roadmap, and the full manifest recipe set. It found no active or archived Golden Grahams identity, candidate ID, exact brand phrase, or `Croque Graham Doré` owner. The only exact `Croque Cannelle Graham` archive discussion is R500; the related active Graham references are generic ingredients.

| Surface | Review snapshot |
|---|---:|
| Active ingredient references | 1,801 |
| `GRAIN_AND_CEREAL` references | 267 |
| Active ingredient forms | 144 |
| Legacy-import candidates | 56 |
| Research-ledger records | 2,158 |
| Ledger source entries / distinct source IDs / distinct URLs | 9,922 / 8,399 / 7,107 |
| Ledger unit-conversion records | 8 |
| Manifest recipes / structured ingredient rows | 114 / 1,123 |

| File at review | SHA-256 |
|---|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `0f4c4b4c3f86fab4ffe7c1bfbd5147c59a449d627295f9522d032a34f0ddef32` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `5a47b562629b3f7a248f4d6068b606a6baf6c216480caca8a63fc9fb1ec74b17` |
| `docs/catalog/legacy-import-identities.v1.json` | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `docs/catalog/research-ledger.v1.json` | `a749e9aef8c8cd8450e2069a31fd93a2c2595cdfabf72c57e0321bcf964838db` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The ledger audit found no source ID mapped to multiple URLs. The French General Mills guide URL is already registered as `WP03-RICE-CHEX-R485-20261017-S02`; that same source ID/URL appears in three existing Chex source entries. Reuse it if this proposal is integrated; do not mint a duplicate source ID for the same document. The other four URLs below and their proposed source IDs are unowned in the live ledger. All four proposed source IDs and the proposed ingredient reference ID were unused at review.

| Candidate source | Existing live-ledger owner at review |
|---|---|
| English General Mills guide, proposed S01 | None |
| French General Mills guide, proposed use of existing R485-S02 | `WP03-RICE-CHEX-R485-20261017-S02` → same URL; three source entries |
| Maxi French item page, proposed S03 | None |
| Walmart English item page, proposed S04 | None |
| Walmart French item page, proposed S05 | None |

The proposal-local new IDs are `WP03-GOLDEN-GRAHAMS-R534-20261017-S01`, `S03`, `S04`, and `S05`. `WP03-GOLDEN-GRAHAMS-R534-20261017-S02` is intentionally not assigned: the French guide is already owned by R485-S02.

## Phrase-first picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and NFKD normalization, accent/punctuation folding, complete normalized word-phrase matches first, then substring fallback only when no complete phrase matches. It includes reference names, aliases, and attached form labels/match terms. Proposed names have no aliases or forms.

| Query | Current | With proposed reference | Result and boundary |
|---|---:|---:|---|
| `Golden Grahams`; `Golden Grahams cereal` | 0; 0 | 1; 1 | Each exact manufacturer product phrase selects the new row. |
| `Céréales Golden Grahams`; `Grahams` | 0; 0 | 1; 1 | The bilingual display and plural brand spelling resolve to the row. |
| `Graham` | 2 | 2 | Remains Graham cracker crumbs and Graham flour. The singular query has exact phrase matches, so search does not fall back to the `Grahams` substring. |
| `graham flour`; `graham cracker` | 1; 1 | 1; 1 | Existing ingredient identities remain selected. |
| `Croque Graham Doré Céréales`; `Croque Cannelle Graham` | 0; 0 | 0; 0 | Retailer strings are not active aliases; R500’s separate CinnaGraham product remains unallocated. |
| `Golden` | 4 | 5 | The new brand word joins four current partial/exact results. |
| `cereal`; `céréales` | 65; 61 | 66; 62 | The cereal category results each increase by one. |

The current `Graham` result set does **not** include the proposed row, and neither the French retailer title nor R500’s `Croque Cannelle Graham` wording is added as an alias. If the separately identified CinnaGraham product is ever approved as its own reference, a broad singular `Graham` search could then return that separate SKU alongside the two existing ingredient identities. That would be a real broad-query overlap between distinct products, not an identity merge. The plural `Grahams` remains the exact Golden Grahams brand query.

## Full recipe-corpus scan

All **114** recipe files listed in the current manifest were parsed: **1,123** structured ingredient rows and **753,988** exact recipe-file bytes. The manifest-ordered recipe corpus SHA-256 is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. The digest hashes each manifest-relative path as UTF-8, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order.

Full recipe-file and structured-row scans for `Golden Grahams`, `Golden Grahams cereal`, `Céréales Golden Grahams`, `Golden Grahams Crunch Cereal`, `Croque Graham Doré Céréales`, the 331 g package GTIN `65633132955`, product code `13295000`, retailer item IDs `6000198836946` and `21104051_EA`, and `ingredient-ref-golden-grahams-cereal` found **zero matching recipe files and zero matching ingredient rows**. No recipe links or direct references exist. No candidate-specific recipe demand is supported by the bundled corpus.

## Measures, package data, and substitutions

- **Package:** The General Mills 2024 English and 2023 French product guides give a 331 g retail package and package GTIN `65633132955`. This is SKU context, not a recipe amount or conversion.
- **Source-specific serving:** Maxi’s current French nutrition panel lists `1 tasse (41 g)` for item `21104051_EA`. Preserve, at most, as an observation tied to that retailer source and listing. Maxi states that product information can change and should be checked against the package. This does not support a reusable `cup ↔ g` conversion or a general cereal density.
- **Formula:** Maxi’s French panel omits honey from its sugar line, while Walmart’s English and French indexed pages include honey. The Canadian manufacturer guides cited here are product lists, not ingredient labels. Retain each retailer panel only as its own source-specific text; do not claim a settled recipe/formula or use the panels to create component aliases.
- **Forms and conversions:** None. The item is a named ready-to-eat cereal, not a preparation state of wheat or graham flour.
- **Substitutions and yields:** None. No reviewed source establishes a tested replacement ratio, cooking yield, or contextual recipe use.
- **Recipe links:** None; the complete bundled corpus contains no matching line.

## Source register

Sources were checked online on **2026-10-17**. The source IDs below are proposal-local unless explicitly marked as an existing ID. Manufacturer product lists establish product code and package identity, but not current retail stock or ingredient formulation. Retailer content is store/retailer-specific and may be supplied by vendors.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-GOLDEN-GRAHAMS-R534-20261017-S01` | General Mills Foodservice Canada, [Product Guide, updated September 2024](https://www.generalmillsfoodservice.ca/wp-content/uploads/2024/10/GM-Broch-Aug2024-ENG-FA_FINAL.pdf), printed p. 8 / PDF p. 7, `GOLDEN GRAHAMS CEREAL`, product row. | Uses product name `Golden Grahams™`; product code `13295000`; case GTIN `10065633132952`; package GTIN `65633132955`; case pack/weight `12/331 GR`. The guide is a Canadian foodservice product list, not a consumer nutrition panel or a full retail-family roster. |
| Existing `WP03-RICE-CHEX-R485-20261017-S02` | General Mills Foodservice Canada, [Guide des produits, modified September 2023](https://www.generalmillsfoodservice.ca/wp-content/uploads/2023/10/GM-guide-des-produits-Sept-23.pdf), printed p. 8 / PDF p. 7, `CÉRÉALES GOLDEN GRAHAMSMC`, `Golden GrahamsMC` row. | The French product list carries the same product code, case/package GTINs, and `12/331 GR`, and supports the French manufacturer spelling. On printed p. 10 / PDF p. 9 it separately lists `Croque Cannelle GrahamMC`, code `18948000`, package GTIN `65633189485`, `12/340 GR`; this is a distinct Toast Crunch-family SKU. The guide is dated 2023 and does not establish 2026 stock. This URL is already owned by R485-S02 for three Chex rows. |
| `WP03-GOLDEN-GRAHAMS-R534-20261017-S03` | Maxi Québec, [Croque Graham Doré Céréales, 331 g](https://www.maxi.ca/fr/croque-graham-dor-c-r-ales/p/21104051_EA), product heading/item `21104051_EA`; nutrition panel and ingredients. | Current French-facing item title and package size; the page showed stock at Maxi Laval Laurentides when checked. The nutrition panel lists 1 tasse (41 g). Retail item code is not the manufacturer package GTIN; Maxi warns its product details may change and recommends checking packaging. Its ingredient text does not match Walmart’s honey detail exactly, so do not generalize the formula. |
| `WP03-GOLDEN-GRAHAMS-R534-20261017-S04` | Walmart Canada, [Golden Grahams Crunch Cereal](https://www.walmart.ca/en/ip/Golden-Grahams-Crunch-Cereal/6000198836946), item `6000198836946`, current product details. | English page gives brand `Golden Grahams`, flavor `Graham`, size 331 g, and its item title. Walmart says retailer/supplier-provided information is not separately verified. It does not show manufacturer UPC in the accessible details and is not a manufacturer formulation source. |
| `WP03-GOLDEN-GRAHAMS-R534-20261017-S05` | Walmart Canada, [Croque Graham Doré Céréales](https://www.walmart.ca/fr/ip/Croque-Graham-Dor-C-r-ales/6000198836946?classType=REGULAR), French counterpart to item `6000198836946`, indexed item title, brand and item details. | Search-indexed 2026 page maps the same Walmart item ID to brand Golden Grahams and the French title. Direct open returned a cache-miss fetch error, so use it as indexed retailer naming evidence only; do not claim live stock or package-label wording from it. The retailer title is not proposed as an active alias. |

The French and English Walmart item pages use the same retailer item ID; Maxi shows a separate retailer item code. Neither accessible retailer listing exposes the manufacturer package GTIN. The manufacturer guides supply the package GTIN and current retail records corroborate the product name/331 g size, but exact retailer-to-GTIN equivalence is not asserted from retailer metadata alone. No SKU number is added to the ingredient reference.

## Reproducible static validation

From the repository root, regenerate the reviewed file hashes with:

```sh
sha256sum \
  app/src/main/assets/seed/bundled-library/ingredient-references.v1.json \
  app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json \
  docs/catalog/legacy-import-identities.v1.json \
  docs/catalog/research-ledger.v1.json \
  app/src/main/assets/seed/bundled-library/manifest.v1.json
```

Recompute the complete manifest recipe fingerprint/counts with:

```sh
python3 - <<'PY'
import hashlib, json, pathlib, re, unicodedata
root = pathlib.Path('.')
base = root / 'app/src/main/assets/seed/bundled-library'
manifest = json.loads((base / 'manifest.v1.json').read_text())
digest = hashlib.sha256()
needles = ['Golden Grahams', 'Golden Grahams cereal', 'Céréales Golden Grahams',
           'Golden Grahams Crunch Cereal', 'Croque Graham Doré Céréales',
           '65633132955', '13295000', '6000198836946', '21104051_EA',
           'ingredient-ref-golden-grahams-cereal']
def norm(value):
    value = unicodedata.normalize('NFKD', value.casefold()).replace('œ', 'oe').replace('æ', 'ae').replace('ß', 'ss')
    value = ''.join(c for c in value if unicodedata.category(c) not in {'Mn', 'Mc', 'Me'})
    return re.sub(r'\s+', ' ', re.sub(r'[^a-z0-9]+', ' ', value)).strip()
def strings(value):
    if isinstance(value, dict):
        for item in value.values():
            yield from strings(item)
    elif isinstance(value, list):
        for item in value:
            yield from strings(item)
    elif isinstance(value, str):
        yield value
total_bytes = row_count = 0
file_hits, row_hits = [], []
for rel in manifest['recipeFiles']:
    path = base / rel
    data = path.read_bytes()
    total_bytes += len(data)
    recipe = json.loads(data)
    rows = recipe.get('ingredients', [])
    row_count += len(rows)
    if any(norm(term) in norm(' '.join(strings(recipe))) for term in needles):
        file_hits.append(rel)
    for index, row in enumerate(rows):
        if any(norm(term) in norm(' '.join(strings(row))) for term in needles):
            row_hits.append((rel, index))
    digest.update(rel.encode('utf-8'))
    digest.update(b'\0')
    digest.update(data)
    digest.update(b'\0')
print(len(manifest['recipeFiles']), row_count, total_bytes, digest.hexdigest(), file_hits, row_hits)
PY
```

The source/owner check used exact candidate IDs, URLs, and normalized candidate phrases across references, forms, legacy identities, the research ledger, plans, proposals, and batches before this file was created. Picker totals were projected from the live references plus attached forms using the implementation in `IngredientSearch.kt`. At proposal time, no shared catalog files had been changed; integration is summarized in the linked batch README.

## Disposition

Integrated one bilingual identity for the manufacturer-named 331 g Canadian Golden Grahams cereal with empty alias arrays. Maxi’s 1 cup (41 g) serving is retained only as a listing-specific ledger observation; there is no active numeric or substitution behavior. Keep the current Maxi/Walmart retail titles and differing ingredient panels tied to their sources. The French spelling, product code, package GTIN, and separation from the held `Croque Cannelle Graham` sibling are recorded in the [integration README](../batches/wp02-wp03-wp04-r534-r536-gap-review-integration-20261017/README.md). The broader Section F review remains open.

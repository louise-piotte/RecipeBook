# WP03 Section F R524 — Quaker Harvest Crunch Canadian Maple picker hold (2026-10-17)

## Review record

- **Scope:** One current Quaker Harvest Crunch ready-to-eat granola cereal: Canadian Maple.
- **Recommendation:** Hold this single variant outside active references and the research ledger pending a family-level picker review.
- **Plan fit:** The open Section F checklist explicitly calls for regionally significant cereal mixes and preprocessed grains ([plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4385)); broader Section F cereal/preprocessed-grain review also remains open ([plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L15610)).
- **Adjacent reviews checked:** R516 Sugar Crisp, R519 Honeycomb, and R522 Honey Bunches of Oats cover other named products and do not decide this Quaker family. The active Quaker Super Grains identity is a separate hot cereal; it does not own Harvest Crunch or Croque Nature.
- **Review status:** Proposal only. No catalog, ledger, manifest, generated index, plan, roadmap, batch, or recipe file was changed.

## Decision

The exact Canadian Maple product is well supported by current English and Canadian French manufacturer pages and current Canadian retail listings. Its product identity is distinct from generic granola, the other Harvest Crunch/Croque Nature products, and its oat, wheat, maple syrup, coconut, and almond components.

Hold the one-variant addition because the manufacturer currently lists **nine** Harvest Crunch variants in English, while its French-Canadian Croque Nature page lists **seven** variants. A hypothetical Canadian-Maple-only row would turn the broad `Harvest Crunch` and `Croque Nature` searches from no result into one apparently complete result. That would silently select this maple formulation from a family that has several differently formulated products. The current bundled corpus contains no product-specific line to resolve that ambiguity. This follows the family-picker boundary used for the Shreddies Original hold and later family review: an exact product can be credible while a singleton brand-family result remains misleading.

If a later review resolves the family as a set, Canadian Maple should be one identity-only product row; it should not become the parent identity for Original, Apple Crumble, Raisin & Almond, Dark Chocolate/Cranberry/Almond, Light & Crisp, or protein variants. Do not add the product as an alias or form of generic `granola`.

## Bilingual identity and product boundary

| Field | Hypothetical value if a family-level review later adopts the product |
|---|---|
| ID | `ingredient-ref-quaker-harvest-crunch-canadian-maple-cereal` |
| English display | `Quaker Harvest Crunch Canadian Maple Granola Cereal` |
| Canadian French display | `Quaker Céréales granola Croque Nature Érable canadien` |
| Category | `GRAIN_AND_CEREAL` |
| English / French aliases | `[]` / `[]` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

The Canadian Quaker manufacturer pages use the English product name and the French product wording above. The French page gives the label serving as `½ tasse (63 g)` and lists whole-grain oats, rolled wheat, brown sugar, dairy ingredients, oils, dried coconut, maple syrup, almonds, salt, and flavouring. Its ingredient text contains a source typo (`grans`); that typo is not used in the proposed display. The French wording is direct Canadian manufacturer usage and is corroborated by French-facing Canadian retail listings; it is not an OQLF terminology ruling.

The French Super C listing uses a longer descriptor, `Céréales bouchée d’avoine enrobées de sirop d’érable Croque Nature`, for the product identified by its Quaker Croque Nature Canadian Maple description. Keep that longer retailer title out of aliases: it contains the full phrase `sirop d’érable`, so the current phrase-first picker would also return the finished cereal for a plain maple-syrup search. The product's full display names already make the exact Canadian Maple variant searchable without that broadening.

The manufacturer's English family page lists Protein Oat, Honey and Almond; Protein Oat, Chocolate and Almond; Apple Crumble; Canadian Maple; Dark Chocolate, Cranberry & Almond; Light & Crisp Honey & Nut; Original; Raisin & Almond; and Light & Crisp Raisin Almond. The French Croque Nature family page lists Canadian Maple plus six other named variants, but not the two Protein products currently shown in English. This difference is an additional reason to review sibling names and their bilingual support together. Do not infer that the two family pages provide an exhaustive historical or international roster.

Keep Canadian Maple separate from:

- the generic `granola / granola` identity and Vector-branded granola cereal products;
- all other Harvest Crunch/Croque Nature variants, whose flavor formulations differ;
- plain rolled oats, wheat, maple syrup, dried coconut, and almonds;
- other maple-flavoured cereals or hot-oatmeal products.

`Harvest Crunch` and `Croque Nature` are family terms, not aliases for the Maple product. `Canadian Maple` and `Érable canadien` qualify one variant; they are not aliases for maple syrup or generic maple granola. No recipe-state form is supported by this identity review.

## Ownership, archive, and snapshot audit

The read-only audit covered active references, forms, legacy identities, the research ledger, the open Section F checklist, roadmap, proposal and batch archives, and the complete manifest-listed recipe corpus. Normalized exact-key and ID scans found no owner for the proposed ID or exact English/French product names, `Harvest Crunch`, `Croque Nature`, `Canadian Maple`, or `Érable canadien` in the live references, forms, legacy candidates, or ledger. The only closely related active product identity is Quaker Super Grains Hot Cereal; generic granola and Vector granola references remain separately owned.

No dedicated Harvest Crunch/Croque Nature review or integration appears in the plan, roadmap, proposal archive, or batch archive. R516/R519 and R522 are separate Post Consumer Brands families. R237 Quaker Super Grains is a separate hot cereal. A repository search also found no earlier use of this proposal's candidate ID or source-ID prefix.

At review, the live package snapshot was **1,797 active references** (263 `GRAIN_AND_CEREAL`), **143 forms**, and **56 legacy candidates**. The ledger contained **2,153 records**, **9,886 source entries**, **8,365 distinct source IDs**, **7,075 distinct source URLs**, and **8 unit-conversion records**. The full-ledger audit found no source ID mapped to multiple URLs. The manifest lists 114 recipes.

| File | SHA-256 at review |
|---|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `bb380278585b32b2785b8b1bad1907b5f1b1b3903ef32ad5c5c345a849f11923` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| `docs/catalog/legacy-import-identities.v1.json` | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `docs/catalog/research-ledger.v1.json` | `28211fb36c8cec0819fd763715866ff8da0150d25cbe374055b0f198aa8009a5` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The seven proposal-local source IDs below and their exact URLs are not owned in the current research ledger. They remain unallocated; no source or identity record is proposed for the hold.

## Phrase-first picker projection

This is a static projection over current references and forms using [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): NFKD/accent/punctuation normalization, complete word-phrase matching first, then substring fallback only when there are no phrase matches. The hypothetical row has no aliases or forms.

| Query | Current | With one Canadian Maple row | Projection |
|---|---:|---:|---|
| `Harvest Crunch`; `Croque Nature` | 0; 0 | 1; 1 | Each broad family term becomes a singleton Canadian Maple result despite the other family variants. This is the hold reason. |
| `Canadian Maple`; `Érable canadien` | 0; 0 | 1; 1 | Correctly selects the named variant. |
| `Quaker Harvest Crunch Canadian Maple Granola Cereal`; `Quaker Céréales granola Croque Nature Érable canadien` | 0; 0 | 1; 1 | Exact bilingual product displays resolve to the row. |
| `Quaker` | 1 | 2 | Adds Canadian Maple beside `ingredient-ref-quaker-super-grains-hot-cereal`; these are distinct products. |
| `granola` | 4 | 5 | Adds the product beside generic granola and three Vector granola products. |
| `cereal`; `céréales` | 61; 57 | 62; 58 | Broad category result counts each rise by one. |
| `maple`; `érable` | 8; 8 | 9; 9 | The display adds a product that contains these variant words. |
| `maple syrup`; `sirop d’érable` | 1; 1 | 1; 1 | Unchanged because neither full product display contains the syrup phrase. Do not add the longer Super C title as an alias. |
| `oats`; `avoine`; `almonds`; `amandes` | 12; 18; 2; 8 | 12; 18; 2; 8 | Unchanged: no ingredient-component aliases are added. |

The projected `Harvest Crunch` and `Croque Nature` result is only the hypothetical Canadian Maple row, not all current family choices. A family review should verify each current product's English and Québec French name and show the exact variant queries alongside these broad family queries before adding any sibling identities.

## Full bundled recipe-corpus scan

All **114** recipe files named in the current manifest were parsed: **1,123** structured ingredient rows and **753,988** exact recipe-file bytes. The manifest-ordered corpus SHA-256 is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`; it is computed by hashing each manifest-relative recipe path as UTF-8, a NUL byte, the exact recipe-file bytes, and another NUL byte.

Full-file and structured-row scans for `Harvest Crunch`, `Quaker Harvest Crunch`, `Canadian Maple`, `Canadian Maple Granola`, `Croque Nature`, `Érable canadien`, and the hypothetical reference ID found **zero matching recipe files and zero matching ingredient rows**. The corpus has no direct link to the hypothetical ID. A separate scan found no generic `granola` wording in the bundled files or structured rows. There is no product-specific recipe demand, amount, or family variant to resolve in the bundle.

## Measures, forms, and substitutions

- **Label serving:** The current manufacturer English and French product pages each list `½ cup / ½ tasse (63 g)` for Canadian Maple. This is one product-specific nutrition-label serving. It does not establish a reusable cup conversion, default density, or a measure for generic granola or the sibling products.
- **Conflicting retailer portion:** An Atlantic Superstore Canadian listing uses the same Canadian Maple name and 475 g package but reports `1 cup (105 g)`. That value differs from a direct doubling of the manufacturer's ½-cup serving and is not a Québec listing. Its retailer data is not enough to reconcile the package/portion versions; keep both source-scoped and add no numeric behavior.
- **Package:** Canadian retail listings report 475 g, including Québec-facing listing evidence. Package mass is not a recipe amount.
- **Forms and conversions:** Add no dry/cooked or other form, density, unit mapping, or conversion. The cereal is a named ready-to-eat formulation; the available serving is product-specific and conflicting retailer data prevents treating it as a stable conversion.
- **Substitutions:** Add no global or contextual substitution between Canadian Maple, another Harvest Crunch variant, generic granola, maple syrup, oats, or another cereal. No source gives a tested replacement amount or recipe context.
- **Recipe links:** None; the complete bundle has no matching product line.

## Source register

Sources were checked online on **2026-10-17**. Source IDs below are proposal-local only. Each proposed ID maps to one URL; the live ledger has no owner for any listed URL.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-QUAKER-HARVEST-CRUNCH-CANADIAN-MAPLE-R524-20261017-S01` | Quaker / PepsiCo Canada, [Harvest Crunch Canadian Maple Granola Cereal](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-harvest-crunchr-canadian-maple-granola-cereal), product name and description; nutrition panel and ingredients. | Current Canadian English product page calls out Canadian maple syrup and almonds in oat clusters; shows ½ cup (63 g) and the product ingredient list. It is SKU-specific product and portion evidence, not a family roster or reusable conversion. |
| `WP03-QUAKER-HARVEST-CRUNCH-CANADIAN-MAPLE-R524-20261017-S02` | Quaker / PepsiCo Canada, [Céréales granola Croque Nature Érable canadien](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-granola-croque-naturemc-erable-canadien), product title/description; nutrition panel and ingredients. | Current Canadian French product page directly supports the French display and ½ tasse (63 g) label serving. It is manufacturer wording, not a terminology ruling; its ingredient paragraph has the typo `grans`, which is not adopted. |
| `WP03-QUAKER-HARVEST-CRUNCH-CANADIAN-MAPLE-R524-20261017-S03` | Quaker / PepsiCo Canada, [Harvest Crunch Cereal family page](https://www.tastyrewards.com/en-ca/brands/quaker/products-categories/c%C3%A9r%C3%A9ales-croque-naturemc), product list, checked 2026-10-17. | Lists nine current English product names, establishing that Canadian Maple is one sibling variant, not the only product in the family. Family-page listings are current page content, not a complete history or guaranteed permanent roster. |
| `WP03-QUAKER-HARVEST-CRUNCH-CANADIAN-MAPLE-R524-20261017-S04` | Quaker / PepsiCo Canada, [Céréales Croque Nature family page](https://www.tastyrewards.com/fr-ca/marques/quaker/produits-categories/c%C3%A9r%C3%A9ales-croque-naturemc), product list and introductory text, checked 2026-10-17. | Uses the French family name Croque Nature, lists Canadian Maple and six other products, and says Quaker products are available in grocery stores across Canada. It omits two Protein products shown on the current English family page, so the two rosters are not identical; it does not settle their French names. |
| `WP03-QUAKER-HARVEST-CRUNCH-CANADIAN-MAPLE-R524-20261017-S05` | Walmart Canada, [Quaker Céréales granola Croque Nature Érable canadien](https://www.walmart.ca/fr/ip/Quaker-C-r-ales-granola-Croque-Nature-rable-canadien/6000203528227), current French-facing item page, title, details, 475 g size, ingredient panel, and stock notice. | Corroborates the exact French product wording, composition, and package size; the page was out of stock when checked. Walmart notes that third parties supply listing information and that it may not independently verify it. This is not a guarantee of Quebec availability or a reusable portion. |
| `WP03-QUAKER-HARVEST-CRUNCH-CANADIAN-MAPLE-R524-20261017-S06` | Super C Québec, [Céréales bouchée d’avoine enrobées de sirop d’érable Croque Nature, 475 g](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-bouchee-d-avoine-enrobees-de-sirop-d-erable/p/055577105511), indexed product title and item number. | Search-indexed page text gives item `055577105511`, 475 g, and a Canadian Maple product description. Direct page fetch returned HTTP 403 in this review, so title, item, package, and stock are retained as indexed evidence only. The longer descriptor is not a stored alias. |
| `WP03-QUAKER-HARVEST-CRUNCH-CANADIAN-MAPLE-R524-20261017-S07` | Atlantic Superstore, [Quaker Croque Nature Érable canadien, 475 g](https://www.atlanticsuperstore.ca/fr/c-r-ales-pr-tes-servir-croque-nature-erable-canadi/p/21294699_EA?icta=recommended-carousel), indexed French-facing item page, nutrition panel and package detail. | Canadian retailer result names the product, gives 475 g, and reports 1 cup (105 g), unlike the manufacturer’s ½ cup (63 g). This listing is outside Québec and the page could not be opened directly during this review; treat the portion as a conflicting retailer observation, not as a measure or conversion. |

## Reproducible validation

The live snapshot hashes above can be regenerated from the repository root with:

```sh
sha256sum \
  app/src/main/assets/seed/bundled-library/ingredient-references.v1.json \
  app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json \
  docs/catalog/legacy-import-identities.v1.json \
  docs/catalog/research-ledger.v1.json \
  app/src/main/assets/seed/bundled-library/manifest.v1.json
```

Recompute the stated manifest-ordered recipe count, row count, byte total, and fingerprint with this read-only command from the repository root:

```sh
python3 - <<'PY'
import hashlib, json, pathlib
root = pathlib.Path('.')
manifest = json.loads((root / 'app/src/main/assets/seed/bundled-library/manifest.v1.json').read_text())
digest = hashlib.sha256()
total_bytes = row_count = 0
for rel in manifest['recipeFiles']:
    path = root / 'app/src/main/assets/seed/bundled-library' / rel
    data = path.read_bytes()
    total_bytes += len(data)
    row_count += len(json.loads(data).get('ingredients', []))
    digest.update(rel.encode('utf-8'))
    digest.update(b'\0')
    digest.update(data)
    digest.update(b'\0')
print(len(manifest['recipeFiles']), row_count, total_bytes, digest.hexdigest())
PY
```

The static picker counts were computed against all current reference/form search terms using the normalization and phrase-first/substring-fallback rules in `IngredientSearch.kt`, then rechecked after appending only the hypothetical bilingual display terms with empty alias arrays. No app tests, build, emulator, or deployment were run; this proposal makes no data or code change.

## Disposition

Keep the specific Quaker Harvest Crunch Canadian Maple product unallocated until a family-level review can represent sibling variants and bilingual names without making the Maple product the sole result for `Harvest Crunch` / `Croque Nature`. Preserve the official product wording as proposal evidence, not as an alias or ledger identity. The parent Section F cereal/preprocessed-grain checklist remains open.

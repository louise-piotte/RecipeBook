# WP03 Section F — Sunny Boy cereal identity integration (2026-10-12)

## Decision

Added identity-only `ingredient-ref-sunny-boy-cereal` as **`Sunny Boy cereal / céréales Sunny Boy`**
in `GRAIN_AND_CEREAL`. The sole English alias is the manufacturer's current title, `Sunny Boy Original
Hot Cereal`; there are no French aliases.

This row represents the maker's named Original hot cereal. Keep it separate from Red River cereal,
the component grains, Organic Sunny Boy Hot Cereal, Sunny Boy Beta-glucan Hot Cereal, Sunny Boy
muesli, and generic hot cereal. Although the maker names wheat, rye, and flax, it does not provide
component proportions or particle sizes, and the overlapping ingredients do not establish product
equivalence. The historical French display wording is supported by a Québec grocery-ad extract; no
current bilingual package or manufacturer title was found.

No form, density, unit mapping, active measure, conversion, yield, recipe link, recipe text, or
substitution was added. A retailer's package size and cooking directions remain product-specific and
were not recorded as reusable catalog data.

The identity and boundary review is recorded in the [proposal](../../proposals/wp03-section-f-sunny-boy-hot-cereal-identity-review-20261012.md).
Primary identity sources are Sunny Boy Foods' [current product page](https://sunnyboyfoods.com/products)
and [FAQ](https://sunnyboyfoods.com/faqs). A current [Voilà listing](https://voila.ca/products/sunny-boy-hot-cereal-original-value-size-907-g/507866EA)
names the Original grocery item. For the French display, the historical [BAnQ grocery advertisement](https://diffusion.banq.qc.ca/pdfjs-1.6.210-dist_banq/web/pdf.php/f13wyjO-fQw1ZLsVNX0mrw.pdf)
contains the OCR-indexed phrase `CEREALES “Sunny Boy”`; its issue date is not available from the
accessible extract. Statistics Canada's 1983 French cereal-producer table lists Sunny Boy Ltd. in
Camrose and wheat, rye, and flax, but does not establish the current formulation.

## Picker and recipe audit

Picker queries were evaluated against the actual `IngredientReferenceSearchIndex` name, alias,
whole-phrase, and partial-fallback behavior:

| Query | Result |
|---|---|
| `Sunny Boy` | New Sunny Boy cereal identity only |
| `Sunny Boy Original Hot Cereal` | New identity only |
| `céréales Sunny Boy` | New identity only |
| `sunnyboy` | No result; no joined-word alias is supported |
| `hot cereal` | Cream of rice, cream of wheat, creamy buckwheat, Red River, and Sunny Boy |

The manifest lists 114 recipes and 1,123 ingredient rows. A full scan of all listed recipe files for
the brand, title, joined spelling, and new ID found no hits, so no recipe link was added.

## Package snapshot at Sunny Boy integration

This snapshot was captured immediately after the Sunny Boy change and before the later WP04 crappie
pair integration and ledger-wide Unicode-escape normalization. Those follow-up edits changed the
reference/ledger data and generated index without changing the Sunny Boy entry.

Hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a
NUL byte, the exact recipe-file bytes, and a trailing NUL byte in manifest order.

| Artifact | Count / size | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,275 references; 408,396 bytes | `40a36a787b887078915723b74fecaca1703b51ab39333e806a41924db5b654bb` |
| `ingredient-forms.v1.json` | 94 forms; 70,793 bytes | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates; 15,508 bytes | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,583 records; 5,615 source entries; 4,651 distinct source IDs; 8 conversions; 5,494,244 bytes | `4dca77aa41700c23f2a188a0dabb34eff9cd6abb0644b5c403f62e0ec3acdfd3` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,275 references; 558,911 bytes | `f352a91fab8c7dbf32e3fb266e079a6f4c779534a910cabf9fc7ac74db350982` |

## Validation

- Ingredient-reference normalization, bundled-package normalization, package validation, and
  generated-catalog freshness checks passed.
- Exact active-name ownership checks found no conflicting reference or form key for the new ID,
  displays, or alias. The seven Sunny Boy ledger sources have unique IDs.
- Picker queries for the bilingual display and manufacturer title return the new row alone. Generic
  `hot cereal` retains five distinct cereal choices.
- All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned; there were no Sunny
  Boy name, title, or ID hits.
- The ledger records seven sources, identity verification, no supported reusable measure, and no
  supported substitution. It contains no Sunny Boy measurement observation or runtime rule.
- No app tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog index, as stated in `AGENTS.md`.

# WP02 A5 Masa Harina Identity

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate masa harina as a nixtamalized maize-flour identity. Keep it separate from whole-kernel corn flour, cornmeal, cornstarch, and precooked refined maize flour. Do not add measurements or substitutions.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `40c44054cc34f1aa277e8f885b89ae2e8e7c472080b5ff1eb3cc18243af7bfaa` (310 references); pre-integration research ledger SHA-256 `454d4fac42ce4e8663ffbcfb93a5a539c80ed13294a2bb08f6a1ef4e6a33b37e` (460 records); plan snapshot SHA-256 `be6b893b427afcff7ff52dbac2ff897be9b3f66dd65d07b8b613f6ccd1987022`; seed contains 114 recipe files.
- **Dependencies:** WP01 identity/evidence contract; WP02 A5 maize-flour review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-masa-harina` | masa harina / farine de maïs nixtamalisée | None | Nixtamalization is the defining product process. Keep separate from cornmeal and untreated whole-kernel corn flour; precooked refined maize flour is a separate process product and is not an alias. Do not add brand, corn-color, grind, or serving qualifiers. [S81–S84] |

The reference is `FLOUR_AND_STARCH`; aliases remain empty, density is null, and unit mappings are
empty. No forms, conversions, or substitutions were added. The English display is the established
culinary name `masa harina`; the Québec-market French product name is `farine de maïs nixtamalisée`.
No recipe or product evidence supports treating `Maseca`, plain `corn flour`, cornmeal, or precooked
maize flour as aliases. White, yellow, and blue-corn products, grind classes, and brand formulations
remain outside the general identity.

## Source register

Sources were accessed on 2026-10-06.

- **S81 — University of Saskatchewan, Traditional corn tortillas:** [University extension page](https://gardening.usask.ca/articles-and-lists/articles-recipes/corn-tortillas.php). Defines masa harina as traditional maize flour cured with limewater, and distinguishes it from cornmeal and untreated American corn flour. No recipe quantity or nutrition claim is used.
- **S82 — Casa Sabor, Farine de maïs nixtamalisée (masa harina):** [Québec-market product listing](https://www.casa-sabor.ca/product/21076646/farine-de-mais-nixtamalisee-masa). Uses the exact French display name and identifies the product as masa harina made by nixtamalization. Package size and product-use claims are not imported.
- **S83 — Gwirtz and Garcia-Casal, Processing maize flour and corn meal food products:** [Journal article indexed by PubMed](https://pubmed.ncbi.nlm.nih.gov/24329576/). The abstract distinguishes precooked refined maize flour from dehydrated nixtamalized flour. No numeric, nutrition, or substitution data is used.
- **S84 — P.A.N. Food Business Solutions, Pre-cooked White Corn Meal:** [Manufacturer product page](https://panfoodbusiness.global/en/harina-precocida-de-maiz-blanco-english/). Documents a separate pre-cooked white-corn flour product to review separately; it does not establish an equivalence with masa harina.

## Recipe and duplicate audit

All 114 bundled recipe JSON files were searched for `masa harina`, `farine de maïs nixtamalisée`,
`nixtamalized corn flour`, `masarepa`, `precooked corn flour`, and `harina precocida`. No recipe
ingredient line matched these terms, so no recipe was relinked. Existing whole-kernel corn flour,
cornmeal, and cornstarch records remain unchanged.

## Integration and verification

Integration adds one source-backed reference and a generated catalog entry, and extends
`BundledIngredientCatalogTest` to assert its exact EN/fr-CA names, normalized search keys, category,
distinct IDs from related maize products, empty aliases, null density, and empty unit mappings.

- Final reference package: 311 references, SHA-256
  `56c251d1724ac379d1686c39d08eb23b8905f7e83a98f6cea844881a9d7963eb`.
- Final research ledger: 461 records, SHA-256
  `0bb072965e15711c6d608fcbf559e22fca7f4e69b17a59b47fe317bcd17fd8e3`.
- Unit tests passed: 204. Python seed-package tests passed: 9. Android 16 / API 36 Pixel 9a
  instrumentation reported 26 tests: 24 passed, two QA-gated skips, zero failures or errors. The
  skipped cases were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and
  `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The deploy script's test and debug-assembly steps passed and installed/launched the app on a
  temporary 8 GB Pixel 9a profile at 1080×2424 after the original AVD reported insufficient storage;
  the original emulator data was preserved.
- Seed-reference normalization, bundled-package validation and normalization, generated-catalog
  freshness, and `git diff --check` passed. All 124 bundled JSON files decoded as UTF-8, with no BOM,
  raw non-ASCII bytes, or known mojibake markers.
- Live picker searches returned `masa harina` in English and the exact localized result
  `farine de maïs nixtamalisée` for the accent-folded Québec French query. No ingredient was selected;
  the blank draft was discarded. After the recipe list finished loading, the French home screen
  showed 114 recipes.

Screenshots: `pixel9a-masa-harina-picker-en.png`, `pixel9a-masa-harina-picker-fr-ca.png`, and
`pixel9a-masa-harina-home-fr-ca-114.png` in this batch directory.

## Remaining work

- Obtain independent bilingual Québec French review of `farine de maïs nixtamalisée` and the processing boundary.
- Precooked corn flour is integrated separately as `precooked corn flour / farine de maïs précuite`;
  it is not an alias for masa harina. Its batch record is `precooked-maize-flour-identity.md`.
- Keep measurement and substitution evidence separate; no density, unit mapping, conversion, or replacement is active.
- Continue the remaining A4 and A5 maize-flour distinctions and the wider catalog plan.

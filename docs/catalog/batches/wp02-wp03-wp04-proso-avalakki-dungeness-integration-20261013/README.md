# WP02/WP03/WP04 alias and seafood integration (2026-10-13)

## Changes

- Added `proso millet atta` as the sole English alias on the existing
  `ingredient-ref-proso-millet-flour`. Kept `farine de millet commun`, French aliases, null active
  density, and empty unit mappings unchanged. The [maker's product page](https://organicmandya.com/products/proso-millet-flour-500-gm)
  describes proso millet atta as finely milled proso millet; its package mass is not a household
  measure. The [Canada-localized listing](https://www.distacart.com/en-ca/collections/millet-flour)
  gives the exact qualified phrase but is a stale snapshot, while [Little India Grocers](https://littleindiagrocers.ca/shop/flour-19949)
  provides current Canadian proso-flour category context. The ledger records no supported flour
  household measure, keeps intact-grain `0.79 g/mL` bulk density off the flour row, and stores two
  formula-specific wheat/proso bread studies as blocked substitution findings.
- Added `avalakki` as an English alias on existing `ingredient-ref-flattened-rice-poha`; kept its
  French display and aliases, three thickness forms, and active numeric fields unchanged. The
  [Indian Institute of Food Processing Technology handbook](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/Rice-Based-Product-Handbook.pdf)
  identifies avalakki as a Kannada name for flaked rice, and a [Canada-facing white-poha listing](https://pushmycart.com/en-ca/products/nutty-yogi-organic-white-thick-poha)
  includes it among the product's regional names. [Thindi Cafe's prepared dish](https://www.thindi.ca/product/poha/108)
  and [Shastha Canada's instant upma mix](https://shasthacanada.com/products/adukale-instant-poha-upma-mix-250g)
  are recorded as scope evidence only. The ledger records no supported household measure for plain
  poha; industrial flake dimensions/yield, package sizes, and the mixed-product water direction do not
  become a measure or conversion for plain flattened rice.
- Added identity-only `ingredient-ref-dungeness-crab`: `Dungeness crab / crabe dormeur` for
  *Metacarcinus magister*, with French aliases `crabe Dungeness` and `crabe de Dungeness`. OQLF's
  [preferred Québec term](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198911/crabe-dormeur)
  and [DFO's current species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/dungeness-crab-crabe-dormeur-fra.html)
  support the identity and display. A Montréal fishmonger and Costco Canada's French article provide
  the two phrase aliases. The ledger retains seven source-specific retailer/consumer-guide
  weight, portion, and whole-to-picked observations. Active density and unit mappings remain empty.
  The Alaska Seafood Marketing Institute's recipe-set comparison remains a blocked finding; no
  global or contextual rule was added. Generic crab meat and its Jumbo Lump form remain unchanged.

## Picker and recipe audit

Static projections using the current `IngredientSearch.kt` normalization and phrase-first search:

| Query | Projected result |
|---|---|
| `proso millet atta` | `ingredient-ref-proso-millet-flour` only |
| `avalakki` | `ingredient-ref-flattened-rice-poha` only |
| `Dungeness crab`, `crabe dormeur`, `crabe Dungeness`, `crabe de Dungeness` | Dungeness crab only |
| `Dungeness crab meat` | No result |
| `crab`, `crabe` | Existing `ingredient-ref-crab` and the species-qualified Dungeness row |

The manifest-ordered corpus remains 114 recipe files and 1,123 ingredient rows. Searches for the
candidate phrases, scientific names, and regional alias found zero recipe-text/ingredient-row hits and
zero links to the three reviewed reference IDs. The recipe corpus fingerprint remains
`7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — package already normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — package valid.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated index current at 1,338 references.
- `validate_research_ledger()` — 1,646 records, zero errors.
- Custom static checks confirmed the exact alias owners, nine picker projections, unique new source IDs, distinct observation/finding IDs, no reviewed recipe demand, and no recipe links.
- Touched JSON and Markdown were checked for UTF-8 without BOM, mojibake markers, trailing whitespace, and JSON integrity.

No app tests or emulator checks were run because these changes add database JSON data only, as directed in
`AGENTS.md`. No app logic, recipe JSON, recipe links, active conversions, package-yield records, or
substitution-rule files changed.

## Snapshot

Hashes cover exact file bytes at integration. The recipe digest hashes each manifest-relative path, a
NUL byte, exact recipe bytes, and a trailing NUL in manifest order.

| Artifact | Count | Bytes | SHA-256 / digest |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,338 references | 428,755 | `2e7900418e95d420b0fe16f44d64e870f59c032e0134b187375d329698e3a88a` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,646 records; 6,225 source entries; 5,229 distinct source IDs | 6,196,145 | `43a6523376af96b26ab0bc7c7c23c56dc66b1c44f029cdb7fa49e169257c7436` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | 1,338 references | 586,669 | `3fe619271d9f59f865bd4955651b655f824b26b2f9652b98586f0e3cf4958596` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

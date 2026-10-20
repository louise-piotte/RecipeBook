# WP03 Section F — cream of rice hot cereal integration (2026-10-12)

## Decision

Added `ingredient-ref-cream-of-rice-hot-cereal` as an identity-only `GRAIN_AND_CEREAL` reference:
English `cream of rice hot cereal`, Québec French `crème de riz`. The English name makes the dry
hot-cereal scope explicit. The French display follows the wording used by Québec culinary and retail
sources rather than the proposal's initially constructed compound `céréale chaude à la crème de riz`.

The identity is limited to dry rice cereal intended for hot preparation. It remains distinct from
plain rice and its state forms, rice flour, crispy rice cereal, puffed rice, poha, prepared congee,
and the separately named brown-rice farina product. Manufacturer and retailer ingredients,
fortification, package sizes, and preparation directions remain source context only. No aliases,
forms, numeric observations, density, unit mappings, conversions, yields, recipe links, or
substitutions were added. Measurement and substitution research remain unresearched in the ledger.

The full source register and scope discussion are in the
[identity review](../../proposals/wp03-section-f-cream-of-rice-hot-cereal-identity-review-20261012.md).
Key sources include [Health Canada's bilingual food category](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1224),
[Cream of Wheat Canada's product page](https://creamofwheat.ca/product/cream-of-rice-stove-top/),
[RICARDO's Québec culinary discussion](https://www.ricardocuisine.com/chroniques/a-votre-sante/39-des-cereales-chaudes-au-petit-dejeuner),
and a [Québec retailer listing titled “Crème de riz”](https://epnutrition.ca/products/47327974).

## Package snapshot after integration

Hashes are SHA-256 over exact file bytes. The recipe-corpus digest hashes each manifest-relative path,
a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count/state | SHA-256 or corpus digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,221 references; 108 `GRAIN_AND_CEREAL` | `dbbbae79b74064e4989ab0057e304598595895fa7ab14735a07720517dd055c0` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `manifest.v1.json` | 114 listed recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 recipe-file bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,522 records; 5,156 source entries; 4,219 distinct source IDs; 8 unit conversions | `a44a10bc8ec6c16f0fa0a47d0def0101025d59f89ca7af0faf687039c17e84f0` |
| Generated `BundledIngredientCatalog.kt` | 1,221 references | `f555aa8491addb6d95be3e6256c21a3b90d50d30af2561c8d242d6189e38bcff` |

## Validation

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 1,221 references.
- Research-ledger schema and consistency validation reported zero errors.
- Normalized exact-key ownership confirms the reference is the sole owner of `cream of rice hot cereal`
  and `crème de riz`; no alias was added.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows: zero cream-of-rice hits.
- UTF-8/no-BOM and trailing-whitespace checks passed for changed JSON and documentation; scoped
  `git diff --check` passed for the changed catalog, generated index, plan, roadmap, workflow, proposal,
  and integration README.
- No unit tests, instrumentation tests, or emulator checks were run because this change only adds
  database JSON data and its generated index, per `AGENTS.md`.

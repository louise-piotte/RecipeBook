# WP04 Section P — octopus identity integration (2026-10-12)

## Decision

Promoted the held `ingredient-ref-octopus` candidate to an identity-only `PROTEIN` reference:
`octopus / pieuvre`, with `poulpe` as the sole French alias. CFIA, OQLF, and current Canadian and
Québec product listings support this common consumer identity without selecting one taxon.

Kept named species, `tako`, baby/size/presentation descriptors, and prepared products out of the
identity. Squid/calamari and cuttlefish/seiche remain separate. The bundle has no octopus-specific
ingredient row, so no recipe link was added. No form, density, unit mapping, conversion, package or
edible yield, or substitution was added. The ledger record is `ingredient_reference` / `verified`;
measurement and substitution research remain `not_yet_researched`.

The reviewed proposal and source notes are in
[the octopus identity review](../../proposals/wp04-section-p-octopus-identity-gap-sweep-20261012.md).

## Package snapshot at octopus integration

This is the post-octopus, pre-millet-flakes snapshot captured for this batch. Later additions on
2026-10-12 update the aggregate catalog counts.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,219 references | `81b004bbfef246f76da8fd1c421b84d8ba94b91ae6188c67ed81b1399030dfb4` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,520 records; 5,146 source entries; 4,209 distinct source IDs | `366e024f9c402faa8efebc56f88f93b43c240f489214552678e178bc60b52f9c` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `b70a826e18497a37ce343f6c98cafa143d573dd59704ea6022bb034b2640e5a2` |
| `BundledIngredientCatalog.kt` | 1,219 generated reference entries | `a69a7775e0b2cc3bf6d97edf2f9d6bf2377acf70bb9010a39543cbd00e6cc1fd` |

## Validation

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed.
- Research-ledger schema validation reported zero errors.
- Normalized exact-key ownership: `octopus`, `pieuvre`, and `poulpe` resolve only to
  `ingredient-ref-octopus`; `calamari` and `squid` remain on `ingredient-ref-calamari`; `cuttlefish`
  and `seiche` remain on `ingredient-ref-cuttlefish`. No plural, `tako`, or prepared-product alias
  was added.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows: zero octopus-specific hits.
- Changed files decode as UTF-8 without BOM; scoped `git diff --check` passed.
- No unit tests, instrumentation tests, or emulator checks were run because this change only adds
  database JSON data and its generated catalog index, per `AGENTS.md`.

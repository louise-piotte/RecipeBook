# WP06 African regional identity integration

**Integrated:** 2026-10-13  
**Status:** Five identity rows added; three researched candidates remain ledger-only. The broader WP06 Section 05 and Section Z reviews remain open.

## Integrated identities

| Reference ID | English / fr-CA display | Category | Search terms and boundary |
|---|---|---|---|
| ingredient-ref-khlii | Moroccan khlii / khlii marocain | PROTEIN | English alias khlia. Keep separate from gueddid, merguez, biltong, and generic jerky. |
| ingredient-ref-kilishi | kilishi / kilishi | PROTEIN | No aliases. Keep separate from biltong, jerky, charqui, cecina, and generic dried meat. |
| ingredient-ref-njansang-kernels | njansang kernels / amandes de njansang | NUT_SEED_AND_DRIED_FRUIT | French display wording is descriptive and provisional. Keep distinct from ogbono, egusi, and bush mango kernels. |
| ingredient-ref-mursik | mursik / mursik | DAIRY_AND_ALTERNATIVE | Kalenjin community-named Kenyan fermented milk; no generic fermented-milk aliases. |
| ingredient-ref-mopane-caterpillars | mopane caterpillars / chenilles mopane | PROTEIN | English alias mopane worms. Identity is limited to larvae of Gonimbrasia belina; bare mopane, Botswana-local phane, and other caterpillars remain separate. |

All five references have null default density and empty unit mappings. No forms, measurements, recipe links, conversions, yields, or substitutions were added.

## Ledger-only candidates

| Ledger record | Disposition |
|---|---|
| candidate-nigerian-yaji | Held because reviewed sources call yaji both a spiced-pepper mixture and a meat sauce. Product form and category remain unresolved; no active alias, formula, measure, or substitution was added. |
| candidate-ethiopian-shiro-powder | Held for category review. The sources distinguish the dry pulse product from prepared shiro wot, but the category remains unresolved. Bare shiro, shiro flour, and Japanese shiro-named products remain outside aliases. |
| candidate-south-african-amasi-maas | Held because South African standards and industry guidance overlap cultured-milk and cultured-buttermilk names. No active identity or buttermilk alias was added. |

The existing matooke hold remains unchanged. This batch does not resolve or close the larger regional coverage items.

## Evidence and recipe scope

The [proposal and source map](../../proposals/wp06-african-regional-gap-continuation-20261013.md) records the reviewed evidence and source limits. The ledger adds 13 source entries across the five accepted identities and three held candidates. The njansang identity uses the [CIFOR-ICRAF Riches of the Forest report](https://www.cifor-icraf.org/publications/ntfpsite/pdf/Riches-Africa.PDF), which distinguishes njansang kernels of Ricinodendron heudelotii from bush-mango kernels.

The pre-integration normalized exact-key audit found no preexisting reference, form, or legacy owner for the accepted names and aliases. The manifest-listed corpus remains 114 recipe files and 1,123 ingredient rows; normalized phrase matching found no recipe-line hits for these candidates or the retained holds. No recipe files were changed.

## Artifact snapshot

| Artifact | Count | SHA-256 |
|---|---:|---|
| ingredient-references.v1.json | 1,362 references | ab2bb60e0a0679e65d2a91ed4ce7a3cc1e32b4014155f3d7aa9e67e1e0adb274 |
| ingredient-forms.v1.json | 100 forms | 10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63 |
| BundledIngredientCatalog.kt | 1,362 generated reference entries | 23cc8ed4597ad9b7262196f8ee6f1fb6581a807fc61b7e1d5d79eb769792221d |
| research-ledger.v1.json | 1,689 records; 6,585 source entries; 5,521 distinct source IDs | e32cc59fa7812a9b51a0b93a83798fb8f544f07f621cacda0fdb974d6aff1a1c |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | fingerprint 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

## Verification

- Bundled seed-package normalization check and package validation passed.
- Ingredient-reference normalization check passed.
- Generated Kotlin catalog freshness check passed at 1,362 references.
- Research-ledger Draft 2020-12 schema validation passed with no errors; the 13 batch source IDs are unique.
- Focused ID, alias, form, legacy-owner, and recipe-corpus checks passed; the recipe corpus fingerprint is unchanged.
- UTF-8/no-BOM checks and scoped whitespace checks passed.
- No Android, unit, instrumentation, emulator, or other tests were run. The functional changes are database data and its generated reference index; no behavior code changed, per the updated AGENTS.md rule.


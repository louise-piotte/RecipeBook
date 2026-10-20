# WP02 A6 regional flour naming review: nachni flour

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12. Added `nachni flour` as one English alias on the existing finger-millet flour row and recorded four source entries plus an accepted alias decision on its ledger record; broad A6 coverage remains open.
- **Scope:** Decide whether the exact English flour phrase `nachni flour` should be an alias on the existing finger-millet flour reference.
- **Source IDs:** `WP02-A6-NACHNI-FLOUR-20261012-S01` through `S04`. The prefix was checked against the current ledger before drafting; the four IDs now appear on the existing finger-millet flour ledger record.
- **Related work:** The WP06 South Asian cuisine review established the finger-millet flour row and retained `ragi flour` as an English alias. It mentioned `nachni` in source recipe wording but did not decide the exact alias `nachni flour`. This review does not reopen that identity or the existing alias.
- **A6 status:** Keep the broad regional-grain-flour checklist open.

## Decision

**Added only `nachni flour` as an English alias** to `ingredient-ref-finger-millet-flour`. The FSSAI recipe booklet explicitly labels an ingredient “Ragi flour (finger millet flour or nachni),” and current Canadian retailer listings put `Nachni` alongside `Ragi` and `Finger Millet` in flour-product headings [S01–S02]. FSSAI's millet guidance identifies `Nachni` as a Marathi name for finger millet, confirming the source-grain boundary [S03]. Together, the recipe wording and Canadian flour-product headings support the search phrase without treating the retailer title as a verbatim `nachni flour` label.

Retain `finger millet flour / farine de ragi`, including the existing `ragi flour` English alias. A current Canadian French retailer listing uses `farine de ragi`; no reviewed Québec/Canadian French product label uses `farine de nachni` [S04]. Keep bare `nachni` and `nachni atta` off the flour row: the proposed alias keeps the flour qualifier, while the reviewed current Canadian flour listing supplies the exact `nachni flour` construction. Do not create a new ingredient identity.

| Wording | Disposition | Boundary |
|---|---|---|
| `nachni flour` | **Added one English alias** on `ingredient-ref-finger-millet-flour`. | FSSAI recipe wording and a Canadian product heading independently identify nachni with finger-millet flour. [S01–S03] |
| `finger millet flour` / `farine de ragi` | Retain as the existing display pair. | The active row is already verified; current Canadian French retail wording supports `farine de ragi`. [S04] |
| `ragi flour` | Retain as the existing English alias. | Already attached to the flour row; no change is proposed. |
| `nachni` | Do not add as a flour alias. | This is a source-grain name; the flour qualifier preserves the product boundary. [S03] |
| `nachni atta`; `farine de nachni` | Do not add in this pass. | Neither exact phrase has the reviewed direct Canadian product-label support available for `nachni flour`; no Québec French `farine de nachni` wording was found. [S02, S04] |
| New nachni flour ID or form | Do not create. | Evidence resolves the exact flour phrase to the existing finger-millet flour identity. |

No recipe link, form, measurement, density, conversion, yield, substitution, or other numeric behavior is supported or proposed.

## Naming evidence and Canada/Québec boundary

FSSAI's “100 Millets Recipes” booklet gives the ingredient phrase `Ragi flour (finger millet flour or nachni)` in its finger-millet roti recipe [S01]. This expressly uses `nachni` as an alternate name in a flour ingredient phrase; the recipe's quantities and method are not imported into the catalog. Shahi Grocery, an Atlantic Canadian retailer in Halifax, currently lists products titled `Ragi/Nachni/Finger Millet Flour` in its atta-and-flour category [S02]. The retailer heading groups Nachni with ragi and finger-millet flour, though it does not print the contiguous phrase `nachni flour`. FSSAI's millet guidance separately lists `Nachni` among the Marathi vernacular names for finger millet, *Eleusine coracana* [S03].

For Canadian French, Walmart Canada's current French-facing Verka listing is titled `Farine de ragi` and describes the product as ragi/finger-millet flour [S04]. It was marked out of stock when checked, so this review uses it only as wording evidence, not an availability claim. Retain the catalog's existing `farine de ragi` display; do not translate `nachni` mechanically or introduce a French alias unsupported by a Québec/Canadian label.

## Pre-integration package, ledger, exact-key, and recipe audit

The read-only audit used the split bundled-seed package, legacy-import candidates, research ledger, generated Kotlin ingredient catalog, and every path in the current seed manifest. Exact normalized-key checks use the project `normalize_search_key` behavior: Unicode NFKD and case-folding, ligature and accent folding, punctuation replacement, and whitespace collapse.

| Surface | Snapshot before integration | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,224 rows; 391,453 bytes | `cb5bc0962c77e97dcad944c6352ed933002dd6d2ea2c7ef9a578c6064c3f8fcf` |
| Ingredient forms | 86 rows; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import candidates | 66 rows; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,523 records; 5,192 source entries; 4,255 distinct source IDs; 5,037,117 bytes | `05223549fbf89b9e452282865ea1c551013d12f5d3a4214fa5d8792c984732fb` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | Ordered fingerprint `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin catalog | 1 file; 1,224 generated references; 536,146 bytes | `dad935ecd939cdbea8cc1e53b511ac8ffce5f36b4f74b4d4e29bbb6cc3f0e751` |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte. File SHA-256 values cover exact bytes.

| Exact normalized key | Owner before integration |
|---|---|
| `finger millet flour`; `ragi flour`; `farine de ragi`; `ingredient-ref-finger-millet-flour` | `ingredient-ref-finger-millet-flour` |
| `nachni flour`; `nachni atta`; `nachni`; `farine de nachni`; proposed ID `ingredient-ref-nachni-flour` | None across reference names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, or ledger record IDs |

Before integration, `ingredient-ref-finger-millet-flour` was verified, had `ragi flour` as its English alias, `defaultDensity: null`, and `unitMappings: []`. Its ledger record had `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it retained the two WP06 sources for the flour identity and `farine de ragi`, with no nachni alias decision. The forms file and legacy candidates had no exact owner for the proposed alias or ID.

All 114 manifest-listed recipes and all 1,123 ingredient rows were scanned across every string field for normalized whole-phrase matches for `nachni flour`, `nachni atta`, `nachni`, `finger millet flour`, `ragi flour`, `farine de ragi`, `farine de nachni`, and the target/proposed IDs. Result: **zero recipe-file hits and zero ingredient-row hits**; no recipe references `ingredient-ref-finger-millet-flour`. No recipe link is proposed.

## Source register

Sources were checked on 2026-10-12. Recipe and retail text supports names only; no culinary or numeric behavior is imported.

| Source ID | Source and locator | Support and limit |
|---|---|---|
| **WP02-A6-NACHNI-FLOUR-20261012-S01** | Food Safety and Standards Authority of India, [100 Millets Recipes](https://fssai.gov.in/upload/EATRIGHTINDIA/English.pdf), `Dinner 5: Finger Millet Roti`, PDF p. 100. | Explicitly labels the ingredient `Ragi flour (finger millet flour or nachni)`. This is recipe wording evidence only; its recipe quantity and preparation are not generalized. |
| **WP02-A6-NACHNI-FLOUR-20261012-S02** | Shahi Grocery, Halifax, [Atta & Flours](https://www.shahigrocery.com/atta-flours?limit=100&order=ASC&page=2&sort=p.sort_order), current category listing, products titled `MEGH Ragi/Nachni/Finger Millet Flour` and `SHER Ragi/Nachni/Finger Millet Flour`. | Current Atlantic Canadian product headings use the exact phrase. Retail listing evidence only; no universal flour process is inferred. |
| **WP02-A6-NACHNI-FLOUR-20261012-S03** | FSSAI, [Guidance Notes Version 2 — Millets](https://fssai.gov.in/upload/uploadfiles/files/Guidance_Notes_Version_2_Millets_29_01_2020.pdf), `Finger Millet (Ragi)` language-name list. | Lists Marathi `Nagli, Nachni` among finger-millet vernacular names. Supports the source-grain name and species scope, not a standalone flour specification. |
| **WP02-A6-NACHNI-FLOUR-20261012-S04** | Walmart Canada, [Farine de ragi Verka](https://www.walmart.ca/fr/ip/Farine-de-ragi-Verka-2-lb/6000203211214), current French-facing product title and description. | Uses `Farine de ragi` and identifies ragi flour as finger-millet flour. It was marked out of stock when accessed. It does not use `nachni` as a French flour name. |

## Integrated disposition

The existing `ingredient-ref-finger-millet-flour` now has `nachni flour` as one English alias. Retain `finger millet flour / farine de ragi` and the current `ragi flour` alias; keep bare `nachni`, `nachni atta`, and `farine de nachni` inactive. The existing ledger record now includes the four listed sources and an accepted alias decision. No identity, form, recipe link, measurement, conversion, yield, substitution, or other numeric behavior was added. This narrow alias decision leaves broader WP02 A6 coverage open.

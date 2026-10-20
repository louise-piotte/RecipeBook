# WP02 A6 terminology boundary: jowar flour and sorghum flour

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated. Added `jowar flour` as one English alias of the existing sorghum-flour reference and recorded four source entries plus the accepted alias decision on that ledger record. No recipe, form, or numeric behavior changed.
- **Scope:** Decide whether the regional English flour name `jowar flour` belongs as an alias on the existing generic sorghum-flour reference.
- **Proposal-local source IDs:** `WP02-A6-JOWAR-FLOUR-20261012-S01` through `S04`. The prefix was checked against the shared ledger before drafting and was absent.
- **Related reviews:** The 2026-10-10 A6 gap proposal accepted the existing generic `sorghum flour / farine de sorgho` identity without aliases. Recent WP03 references to jowar concern separating grain sorghum from pearl millet or excluding regional grain names from sorghum flakes; they did not review the flour alias boundary. This packet covers only the exact phrase `jowar flour`.
- **A6 status:** Keep the broad regional-grain-flour checklist open.

## Recommendation

**Decision:** Add `jowar flour` as one English alias to the existing `ingredient-ref-sorghum-flour`. FSSAI’s current food standard names “Jowar Flour (Sorghum Flour)” as flour milled from *Sorghum bicolor* [S01]. A current Canadian mill page uses the same paired product name and says its Jowar Flour is made from sorghum grains [S02]. This is a supported regional name for the existing flour product, not a new ingredient identity.

Keep the active French display `farine de sorgho`. OQLF gives `sorgho` as the Québec preferred term for *Sorghum bicolor* [S03], and a current Canadian French retailer page uses `Farine de sorgho` for a Nutrifresh Jowar Flour listing [S04]. Do not add `farine de jowar`; do not add bare `jowar` or `jowar atta`; and do not add any jowar name to the separate grain-sorghum row. This proposal adds no form, recipe link, measurement, density, conversion, yield, or substitution behavior.

| Wording or candidate | Disposition | Evidence boundary |
|---|---|---|
| `jowar flour` | **Recommend one English alias** on `ingredient-ref-sorghum-flour`. | FSSAI explicitly defines the paired “Jowar Flour (Sorghum Flour)” product from *S. bicolor*; the Canadian mill uses the same paired name. [S01–S02] |
| `sorghum flour` / `farine de sorgho` | Retain as the existing display pair. | The current A6 reference and its accepted ledger record already use these names. OQLF supports the Québec base noun `sorgho`; a Canadian French retailer uses `farine de sorgho` on a Jowar flour listing. [S03–S04] |
| `jowar` | Do not add to this flour row or to the grain-sorghum row in this pass. | The FSSAI grain standard and OQLF/TERMIUM grain terminology establish a regional sorghum name, but the candidate here is the more specific, source-confirmed flour wording. [S01, S03] |
| `jowar atta` | Do not add as an alias. | FSSAI’s flour standard and the Canadian mill both use the exact phrase `jowar flour`; this review does not normalize other flour-market expressions. [S01–S02] |
| `farine de jowar` | Do not add as a French alias. | OQLF’s preferred Québec name is `sorgho`, and the reviewed Canadian French listing uses `farine de sorgho`. [S03–S04] |
| `ingredient-ref-jowar-flour` | Do not create. | The source evidence supports a regional name for the existing sorghum-flour identity, not a separate ingredient. |

## Naming and scope

The 2025 FSSAI standard uses the combined heading “Jowar Flour (Sorghum Flour)” and defines that product as milled from grains of *Sorghum bicolor* [S01]. That is direct food-standard evidence that `jowar flour` and `sorghum flour` name the same milling-product class within the standard’s scope. Its regulatory quality limits are not recipe measures or conversion data.

Puremill Canada currently lists `Puremill Jowar Flour` and describes it as “Jowar Flour (Sorghum Flour)” made from 100% sorghum grains [S02]. The page identifies the mill’s Ontario locations. Product claims about nutrition, health, milling freshness, and suggested dishes stay specific to that supplier and are not generalized.

For Québec French, OQLF records `sorgho` as a preferred masculine term and maps it to English `sorghum` and Latin *Sorghum bicolor* [S03]. It does not list `jowar` as the French name. The Canadian French Spice Divine listing for Nutrifresh Jowar Flour is titled `Farine de sorgho Nutrifresh` and describes a 100% sorghum flour; it was marked out of stock when accessed [S04]. Use it as current Canadian French market wording, not as an OQLF ruling or availability claim. Retain `farine de sorgho` as the catalog display.

This alias is narrow: it does not mean that every regional sorghum word is interchangeable, nor does it authorize `jowar` on the grain reference. It does not establish `jowar atta` as a common catalog term, and it does not justify `farine de jowar` when the Québec term and reviewed Canadian French product label use `sorgho`.

## Live package, ledger, exact ownership, and recipe audit

The read-only audit used the live split seed package, legacy candidate file, research ledger, generated Kotlin catalog, and every recipe path listed in the seed manifest. Exact phrase ownership followed the repository’s `normalize_search_key` behavior: Unicode NFKD and case-folding, ligature and accent folding, punctuation replacement, and whitespace collapse.

| Surface | Snapshot at audit time | Hash or fingerprint |
|---|---:|---|
| Active ingredient references | 1,221 | SHA-256 `dbbbae79b74064e4989ab0057e304598595895fa7ab14735a07720517dd055c0` |
| Ingredient forms | 86 | SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import candidates | 66 | SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,522 records; 5,156 source entries; 4,219 distinct source IDs | SHA-256 `a44a10bc8ec6c16f0fa0a47d0def0101025d59f89ca7af0faf687039c17e84f0` |
| Seed manifest | 114 recipe paths | SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | Fingerprint `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin ingredient catalog | 1 file; 1,221 generated references | SHA-256 `f555aa8491addb6d95be3e6256c21a3b90d50d30af2561c8d242d6189e38bcff` |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte. File hashes cover exact bytes.

The exact-key audit covered reference IDs/names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, and ledger record IDs. It checked `jowar flour`, the proposed `ingredient-ref-jowar-flour`, `jowar`, `jowar atta`, `farine de jowar`, `farine de sorgho jowar`, `sorghum flour`, `farine de sorgho`, `grain sorghum`, and `sorgho à graine`.

| Exact wording or ID | Exact normalized owner |
|---|---|
| `jowar flour`, `ingredient-ref-jowar-flour`, `jowar`, `jowar atta`, `farine de jowar` | None across active references, forms, legacy candidates, or ledger record IDs |
| `sorghum flour`; `farine de sorgho` | `ingredient-ref-sorghum-flour` |
| `grain sorghum`; `sorgho à graine` | `ingredient-ref-grain-sorghum` |

The ledger has one accepted reference record for `ingredient-ref-sorghum-flour`: `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its current source is the Codex standard for sorghum flour; it records no aliases. The ledger has no Jowar-flour identity or candidate record. At integration, the four proposal sources and accepted alias decision were added to this existing verified ledger record.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched for `jowar`, `jowar flour`, `jowar atta`, `jowar sorghum flour`, `farine de jowar`, `farine de sorgho jowar`, and the existing `sorghum flour / farine de sorgho` terms. There were zero recipe-file hits and zero ingredient-row hits. No recipe link is proposed.

## Proposal-local source register

These proposal-local source IDs were checked absent from the shared ledger before assignment and are now attached to the existing verified sorghum-flour record. Pages were accessed on 2026-10-12.

| Source ID | Source and locator | Scope and limits |
|---|---|---|
| `WP02-A6-JOWAR-FLOUR-20261012-S01` | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §2.4.18, PDF p. 58. | Primary food standard: explicitly names “Jowar Flour (Sorghum Flour)” and defines it as product milled from *Sorghum bicolor*. Its composition and quality limits are not imported into RecipeBook measures or behavior. |
| `WP02-A6-JOWAR-FLOUR-20261012-S02` | Puremill Canada, [Puremill Jowar Flour](https://www.puremill.ca/products/puremill-jowar-flour), product name and description. | Current Canadian mill listing explicitly pairs `Jowar Flour` with `Sorghum Flour` and says the product is made from 100% sorghum grains. It does not establish a French label or a universal milling specification. |
| `WP02-A6-JOWAR-FLOUR-20261012-S03` | Office québécois de la langue française, [sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho), GDT, botanical/Poaceae domain, updated 2010. | Québec terminology source lists `sorgho` as a preferred French term, maps it to English `sorghum`, and identifies *Sorghum bicolor*. It does not propose `jowar` as a French flour name. |
| `WP02-A6-JOWAR-FLOUR-20261012-S04` | Spice Divine, [Farine de sorgho Nutrifresh 2 lb](https://spicedivine.ca/fr/products/nutrifresh-jowar-flour-2lb), French listing for a Canadian retailer’s Nutrifresh Jowar Flour product. | Current Canadian French retail wording uses `farine de sorgho` for the Jowar product; the listing was marked out of stock when accessed. It supports market wording only, not a terminology ruling or current stock status. |

## Review disposition

Integrate one English alias, `jowar flour`, on the existing sorghum-flour reference. Keep the canonical display `sorghum flour / farine de sorgho`, keep grain sorghum separate, make no recipe or numeric changes, and leave the broader WP02 A6 review open.

## Integration status

- Added `jowar flour` as the sole English alias on `ingredient-ref-sorghum-flour`; retained the
  French display `farine de sorgho` and kept the grain-sorghum reference separate.
- Added the four proposal sources and the accepted alias decision to the existing ledger record.
- No bundled recipe, form, measurement, conversion, yield, or substitution changed. No tests or emulator
  checks were run because the change only adds database JSON data and its generated index.
- See `../batches/wp02-wp03-wp04-jowar-poha-langoustine-integration-20261012/README.md`.

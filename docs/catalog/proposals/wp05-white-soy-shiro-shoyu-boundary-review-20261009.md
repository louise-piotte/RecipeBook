# WP05 Section W proposal — white soy sauce / shiro shoyu

**Packet type:** proposal-only identity and naming review  
**Prepared/source access date:** 2026-10-09  
**Scope:** Japanese shiro shoyu (white soy sauce) as a named soy-sauce style; whether existing generic, light, or dark soy-sauce references represent it; candidate fr-CA wording.  
**Checklist state:** keep Section W open. The current plan leaves white soy sauce and other soy-sauce styles open.  
**Related work:** `wp05-shoyu-tamari-boundary-review-20261009.md` accepted `shoyu` only as an English alias on generic soy sauce and explicitly left white soy sauce out of scope. The existing light/dark identity work describes Chinese-style products and expressly does not crosswalk them to Japanese usukuchi.

## Recommendation

1. **Add one separate style identity for Japanese shiro shoyu.** MAFF’s JAS 1703 standard names five shoyu types in its scope and defines shiro shoyu separately. Its definition distinguishes the style by using a small amount of soybeans with wheat or wheat gluten and strongly suppressing darkening during production. MAFF’s explanatory page says white soy sauce is lighter than usukuchi and has a light body, less umami, and more pronounced koji aroma and sweetness. This is enough to support a stable catalog identity for the Japanese product style, while leaving brand and formulation variants within that style together. [S01, S02]
2. **Do not reuse `ingredient-ref-soy-sauce`, `ingredient-ref-light-soy-sauce`, or `ingredient-ref-dark-soy-sauce`.** The generic row remains the right result for an unqualified soy-sauce request. The current light and dark rows are separately sourced Chinese-style identities; neither has a verified crosswalk to Japanese shiro. MAFF distinguishes shiro from Japanese usukuchi as well, so a pale color alone does not make these identities interchangeable. [S01–S03, S05]
3. **Proposed canonical record:** `ingredient-ref-white-soy-sauce`, category `SAUCE_AND_CONDIMENT`; English display `white soy sauce`; English alias `shiro shoyu`; no French alias beyond the proposed French display. Do not add generic aliases such as `soy sauce`, `shoyu`, `light soy sauce`, or `sauce soya claire` to the new row. `Shoyu` alone remains the generic family term on the existing soy-sauce row. [S01, S03, S07]
4. **Provisional fr-CA display:** `sauce soya extra-claire (shiro shoyu)`. This combines OQLF’s Québec-preferred base term *sauce soya* with the Japanese Soy Sauce Information Center’s French descriptor *extra-claire*, while retaining the Japanese style name. It is a transparent candidate, not a verified OQLF term. An OQLF record for shiro or a Québec product source using this exact phrase was not located. A Québec terminology review should decide whether to accept this wording or display `shiro shoyu` in both locales until a local descriptor is confirmed. [S04–S06]
5. **Do not create a preparation form or activate measurements, conversions, or substitutions.** The 17 live forms represent preparation-state records and none describes shiro or soy-sauce styles. The JAS standard’s technical product-quality tests do not provide a household measure or a density. No exact shiro-specific recipe line or supported, scoped substitution was found in the bundled recipes or the reviewed authoritative sources. Leave density, unit mappings, package yield, measurement observation, conversion, and substitution unset. [S01]
6. **Keep related styles and compounds outside this identity.** Do not add `usukuchi`, `koikuchi`, or `saishikomi` as aliases; they are separately named JAS types. Do not map `shiro dashi` to this ingredient; it is a distinct dashi/soy seasoning compound. The broad phrase `white soy sauce` is supported as a commercial English name for Japanese shiro in the cited Canadian/Japanese sources, but the proposal’s identity scope is specifically the Japanese shiro style, not any product described as white or pale soy sauce without that crosswalk. [S01–S04, S07]

## Proposal-time snapshot

Hashes below are SHA-256 of exact file bytes. The recipe corpus digest is SHA-256 over each manifest-listed recipe **basename** sorted lexically, then the exact recipe-file bytes, with a NUL byte before and after each file’s bytes. This is the raw-file aggregate used in the related shoyu/tamari proposal; it differs from the per-file hash-index aggregate documented at the prior coordinator checkpoint.

| Input | Count | SHA-256 |
|---|---:|---|
| Canonical ingredient references | 453 | `52bc70c5d568f09521bb7aae2d28d0c00520edc0e34579e5dda72986d780324c` |
| Canonical ingredient forms | 17 | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| Research ledger | 620 records / 808 source entries | `54c1102732a2a89b580f0441ba360bb79f6c3e9b84bf01adc16360751ede3816` |
| Legacy-import candidates | 99 | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Recipe manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `b4723f4a0dc4a19008c9f866307696235320845eaa8c0cfb21b8327d055f5194` |

The live rows are:

| ID | English display | fr-CA display | Relevant aliases / data |
|---|---|---|---|
| `ingredient-ref-soy-sauce` | `soy sauce` | `sauce soya` | French alias `sauce soja`; English alias `shoyu`; density null; no unit mappings. |
| `ingredient-ref-light-soy-sauce` | `light soy sauce` | `sauce soya claire` | No aliases; density null; no unit mappings. The accepted row is documented as Chinese-style and has no crosswalk to Japanese usukuchi. |
| `ingredient-ref-dark-soy-sauce` | `dark soy sauce` | `sauce soya foncée` | No aliases; density null; no unit mappings. The accepted row is documented as Chinese-style. |

The form file has 17 records and no shiro/white-soy or soy-sauce-style form. The ledger contains verified generic/light/dark rows and no existing `ingredient-ref-white-soy-sauce` or shiro-specific identity record. The prior Section W proposals mention white soy/shiro only as explicitly out of scope; this packet is the first dedicated identity review found among the 36 proposal files.

## Normalized-key and collision audit

The audit used `normalize_search_key` from `tools/seed_package/bundled_seed_package.py`: case-fold, Unicode NFKD and accent/ligature folding, punctuation-to-space, and trim. Candidate terms were checked against all 453 bilingual reference names and aliases, all 17 form labels and match terms, and all 99 bilingual legacy candidate names and aliases.

| Candidate/search term | Normalized key | Exact owner in live refs/forms/legacy | Related owner / disposition |
|---|---|---|---|
| `white soy sauce` | `white soy sauce` | None | Related to generic `soy sauce` by substring only. Proposed English display for the specific Japanese style. |
| `shiro shoyu` / `shiro-shoyu` | `shiro shoyu` | None | Related to the generic row’s `shoyu` alias by substring only. Proposed narrow English alias; a broad `shoyu` query may return both the generic family and the specific style. |
| `white shoyu` | `white shoyu` | None | Not proposed; no need for this additional variation. |
| `sauce soya extra-claire` | `sauce soya extra claire` | None | Related to generic `sauce soya` by substring; provisional fr-CA display. |
| `sauce de soya extra-claire` | `sauce de soya extra claire` | None | Not proposed as alias; no exact Québec source for this compound wording was located. |
| `sauce de soja extra-claire` | `sauce de soja extra claire` | None | Used by the Japanese Soy Sauce Information Center’s French translation, but not selected as fr-CA display/alias because OQLF says *sauce soya* / *sauce de soya* are usual in Québec. |
| `sauce soya blanche` / `sauce soja blanche` | `sauce soya blanche` / `sauce soja blanche` | None | Not proposed; the evidence reviewed names the Japanese product *shiro shoyu* and describes it as extra-light, not with these Québec label terms. |
| `sauce soya claire` | `sauce soya claire` | `ingredient-ref-light-soy-sauce` | Reject as a shiro alias; this is the exact existing display for a separate Chinese-style light soy sauce. |
| `soy sauce` / `sauce soya` | `soy sauce` / `sauce soya` | `ingredient-ref-soy-sauce` | Keep on the existing generic row; do not alias the generic family name to shiro. |
| `shoyu` | `shoyu` | English alias on `ingredient-ref-soy-sauce` | Keep as the broad Japanese family name. Do not copy it as an alias to the new row. |
| `light soy sauce` / `dark soy sauce` | `light soy sauce` / `dark soy sauce` | Their respective existing IDs | Do not reuse either row or add either style as a shiro alias. |
| `usukuchi`, `koikuchi`, `saishikomi`, `shiro dashi` | respective normalized keys | None as shiro terms | No alias proposed; separate styles or compound seasoning scope. |
| `白醤油`, `しろしょうゆ` | empty key | None | The current normalizer removes these Japanese-script strings to an empty key; do not activate them as aliases in this search system. |

There is no exact normalized-key collision for the proposed identity name or `shiro shoyu` alias. The full normalized-key scan found no exact white/shiro candidate in the 99 legacy entries and no matching form. The recommended ID `ingredient-ref-white-soy-sauce` is absent from the 453 live reference IDs, the legacy IDs, and the existing ledger record IDs.

## Recipe-line audit

All 114 manifest-listed recipe files and all 1,123 `ingredients[]` rows were scanned, including complete row values and full recipe JSON text, for `white soy sauce`, `white shoyu`, `shiro`, `shiro-shoyu`, `白醤油`, `しろしょうゆ`, and the candidate French phrases. **No style-specific line or recipe-text mention was found.**

Three current ingredient lines match the generic soy-sauce family; none needs relinking to the proposed shiro identity:

| Recipe | Ingredient line | Current reference | Disposition |
|---|---|---|---|
| 066, `Korean Soy-Marinated Jammy Eggs` | `1 cup soy sauce or tamari` | `ingredient-ref-soy-sauce` | Leave linked to its stated lead choice. Its explicit tamari alternative is source-local; it does not mention shiro. |
| 085, `Maple Chicken` | `2 1/2 tbsp soy sauce` | `ingredient-ref-soy-sauce` | Generic recipe request; do not reinterpret as shiro. |
| 095, `Satay` | `1 tbsp soy sauce` | `ingredient-ref-soy-sauce` | Generic recipe request; do not reinterpret as shiro. |

No recipe line includes a shiro/white-style quantity to preserve. The one cup/tablespoon values above belong to their exact generic recipe lines and are not shiro measurements.

## Measurements and substitutions

- **No supported shiro-specific household-measure value or density found.** JAS 1703 has technical product-quality criteria and measurement methods; those are standard-compliance tests, not a cup/spoon measure or a general g/mL conversion. Do not transfer USDA or generic soy-sauce values to shiro.
- **No supported form conversion or substitution found.** No bundled recipe uses shiro, and the authoritative sources reviewed distinguish it from other soy-sauce types without providing a quantity-equivalent substitution. Leave measurement observations, unit mappings, conversions, package yields, and substitutions unset. Any future recipe or product quantities must remain attached to their exact source and product.

## Proposed record treatment

| Field | Proposal |
|---|---|
| Stable identity | Japanese shiro shoyu / white soy sauce style |
| Suggested ID | `ingredient-ref-white-soy-sauce` |
| Category | `SAUCE_AND_CONDIMENT` |
| English display | `white soy sauce` |
| English aliases | `shiro shoyu` only |
| fr-CA display candidate | `sauce soya extra-claire (shiro shoyu)` — provisional pending Québec terminology review |
| French aliases | None beyond the display; the Japanese style name is already included in the candidate display. |
| Forms, density, unit mappings, measures, conversions, substitutions | None proposed. |

The Canadian retailer Ozawa pairs `Shiro Shoyu` with `White Soy Sauce`, while the Japanese Soy Sauce Information Center names the style `Shiro Shoyu` in its English guide. This supports the proposed English display/alias for the Japanese style, not every product that may be informally described as white soy sauce. A generic query such as `soy sauce` or `sauce soya` will still find the generic row and may also find this subtype; a style-specific search should use `white soy sauce` or `shiro shoyu`.

## Sources and proposed unique source IDs

The source-ID namespace `WP05-W-SHIRO-SHOYU-20261009-S01` through `WP05-W-SHIRO-SHOYU-20261009-S07` was checked against the ledger’s 808 source entries (703 distinct source-ID strings) and source-ID strings in all 36 existing proposal files. No exact collision was found. The ledger contains some repeated source-ID strings from earlier batches; none is in this proposed namespace. These IDs are reserved only for this proposal and are not ledger entries.

| Proposed source ID | Source and claim supported | Source-to-claim limits |
|---|---|---|
| `WP05-W-SHIRO-SHOYU-20261009-S01` | Ministry of Agriculture, Forestry and Fisheries (MAFF), [Japanese Agricultural Standard JAS 1703, Soy Sauce (Shoyu)](https://www.maff.go.jp/j/jas/jas_standard/attach/pdf/index-470.pdf), scope §1 and definitions §§3.8–3.13. The standard includes koikuchi, usukuchi, tamari, saishikomi, and shiro; §3.13 separately defines shiro using a small amount of soybeans with wheat or wheat gluten and strong suppression of darkening. | Japanese product standard for identity/process and quality. It does not establish a Québec French display, recipe measure, density, or substitution. |
| `WP05-W-SHIRO-SHOYU-20261009-S02` | MAFF, [Soy sauce, miso, other seasonings — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/syouyu-miso.html), soy-sauce style section. Lists the five styles and describes white soy sauce as lighter than usukuchi, relatively less umami and light-bodied, with koji flavor and sweetness standing out. | Official descriptive summary of Japanese food styles; not a regulatory term translation, recipe conversion, or product guarantee outside that scope. |
| `WP05-W-SHIRO-SHOYU-20261009-S03` | Japanese Soy Sauce Information Center, [Types and how to use them (English)](https://www.soysauce.or.jp/en/types-and-how-to-use-them), “Shiro Shoyu (Extra light color).” Uses the shiro shoyu name and describes a pale-amber style lighter than the light-color type. | Industry-association terminology and description; not OQLF/Québec authority. Supports the style crosswalk and English alias, not a composition claim for every bottle. |
| `WP05-W-SHIRO-SHOYU-20261009-S04` | Japanese Soy Sauce Information Center, [Sauce de soja (French)](https://www.soysauce.or.jp/fr), “Shiro shoyu (sauce de soja extra-claire).” Supports the French descriptor and the sweet, very light-colored Japanese style. | French-language source from a Japanese industry body, not a Québec French terminology authority. The exact wording is not adopted as a fr-CA alias. |
| `WP05-W-SHIRO-SHOYU-20261009-S05` | Office québécois de la langue française, [sauce soya (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya). Gives the generic soy-sauce definition and says Québec uses *sauce soya* or *sauce de soya*; it names clear and dark soy sauce in its note. | Supports the Québec base term and identifies the existing generic/light/dark wording. It does not discuss Japanese shiro or validate *sauce soya extra-claire*. |
| `WP05-W-SHIRO-SHOYU-20261009-S06` | Mito, [La sauce soya pour sushi](https://mito.ca/sauce-soya-sushi/), a Québec French culinary/product source. Uses *sauce soya (shoyu)* and identifies *shiro shoyu* as very clear and more delicate. | Local Québec usage supports retaining the style name and the *sauce soya* base; it does not provide the exact compound label *sauce soya extra-claire* or an OQLF endorsement. |
| `WP05-W-SHIRO-SHOYU-20261009-S07` | Ozawa Canada, [Yuasa Premium Shiro Shoyu (White Soy Sauce)](https://ozawa.ca/product/yuasa-premium-shiro-shoyu-200ml/), product heading/category. Pairs *Shiro Shoyu* with *White Soy Sauce* and classifies it under soy sauce. | Canadian distributor listing supports retail English naming and family placement; it does not determine Québec French usage, all formulations, recipe measures, or substitution ratios. |

## Review disposition

**Recommend:** one separate `ingredient-ref-white-soy-sauce` identity scoped to Japanese shiro shoyu; English display `white soy sauce` with the narrow alias `shiro shoyu`; a provisional fr-CA display `sauce soya extra-claire (shiro shoyu)`; no forms, measurements, conversions, package yields, or substitutions; no recipe relink.

**Keep open:** Section W remains incomplete. Obtain independent Québec terminology disposition for *sauce soya extra-claire* before treating that phrase as canonical; keep the Chinese light/dark rows distinct, and review other Japanese soy-sauce styles separately.

At proposal preparation, this packet added only its own Markdown file and made no canonical catalog, recipe, plan, checklist, workflow, roadmap, or test edits. The coordinator's later integration is recorded below.

## Coordinator integration — 2026-10-09

Added `ingredient-ref-white-soy-sauce` as a separate `SAUCE_AND_CONDIMENT` identity scoped to Japanese shiro shoyu. EN display is `white soy sauce`, with `shiro shoyu` as its only English alias; the provisional fr-CA display is `sauce soya extra-claire (shiro shoyu)`. Generic `shoyu` remains on generic soy sauce, and Chinese-style light/dark soy sauces remain separate. No recipe line was relinked, and no form, measure, density, conversion, yield, or substitution was activated. The French compound remains pending independent Québec terminology review; Section W remains open.

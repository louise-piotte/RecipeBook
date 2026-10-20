# WP03 Section F — foxtail-millet `navane` alias review (2026-10-13, round 14)

## Review record

- **Status:** Proposal only; root integration pending. No shared catalog JSON, ledger, plan, roadmap, recipe, or generated file was changed.
- **Scope:** One Kannada regional name for the existing foxtail-millet grain, `ingredient-ref-foxtail-millet`.
- **Distinct from recent reviews:** This is a grain alias for foxtail millet. It does not revisit the finger-millet-rava candidate hold (round 12) or the black-fonio `iburu` alias (round 13).
- **Plan location:** Section F's species-level millet coverage remains open ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2233)). The foxtail-millet grain and its separate flour identity are already active.
- **Recommendation:** Add only **`navane`** to the English aliases of `ingredient-ref-foxtail-millet`. Keep the French display, all other aliases, the separate flour row, forms, measurements, recipe links, and substitutions unchanged.

## Evidence and identity boundary

The ICAR–Indian Institute of Millets Research (IIMR) names `Navane` as Kannada for foxtail millet in its current language table. Its 2025 foxtail-millet leaflet identifies the crop as *Setaria italica* and lists `Navane (Kannada)` among the crop's common names [reused WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01 and WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06]. A current Canadian retailer page also describes its food-grain product as `Foxtail Millet` and lists `Navane` among the names for that grain [S01]. A second Canada-facing listing titles a product `Foxtail Millet / Navane`; it is corroborating indexed product wording, but its page could not be opened during this review [S02].

The relevant Québec term source is OQLF's GDT entry for `millet des oiseaux`, which identifies *Setaria italica* and lists `millet d'Italie` among its preferred French terms [reused WP03-S175]. The entry was last updated in 2010. Root integration reopened the page and confirmed the existing French term; it supports retaining the display, not adding `navane` as a French alias or claiming that a Québec retailer uses the Kannada name.

| Candidate or neighbor | Decision | Boundary |
|---|---|---|
| `navane` | Add only as an English search alias to `ingredient-ref-foxtail-millet`. | IIMR pairs it with foxtail millet; the Canadian food-grain listing independently uses it for that product. Do not create a separate reference. |
| `ingredient-ref-foxtail-millet-flour` | Leave unchanged. | The active flour row has its own qualified aliases. This review does not propose `navane flour`, `navane atta`, or a flour reference link. |
| `navane payasa`, `navane upma`, and other dish names | Keep outside the ingredient alias. | They identify preparations or recipe phrases, not additional names for the dry grain. |
| `millet d'Italie` | Keep as the existing French display. | OQLF supports this term for *Setaria italica*. No new French name or alias is proposed. |
| `thinai`, `kangni`, `korra`, `rala` | Keep the existing aliases unchanged. | This pass adds no spelling variants such as `navani` or `navanakki`, and does not change other regional-name ownership. |
| Kodo millet and other millet species | Keep separate. | Do not infer a foxtail-millet identity from product copy that assigns `Navane` to *Paspalum scrobiculatum* (kodo millet). One current Walmart Canada marketplace page has that contradictory sentence despite its foxtail title and *Setaria italica* ingredient declaration; it was excluded as unreliable evidence [excluded source note, not proposed for ledger registration]. |

## Proposed catalog fields

| Field | Current | Proposed |
|---|---|---|
| ID | `ingredient-ref-foxtail-millet` | Unchanged |
| English display | `foxtail millet` | Unchanged |
| French display | `millet d'Italie` | Unchanged |
| English aliases | `thinai`, `kangni`, `korra`, `rala` | Add only `navane` |
| French aliases | `[]` | Unchanged |
| Category | `GRAIN_AND_CEREAL` | Unchanged |
| Default density / unit mappings | `null` / `[]` | Unchanged |
| Forms and recipe links | None | None |

Do not add `navane` to the flour aliases. The existing WP02 flour review considered `navane flour` among out-of-scope flour phrases; this grain-only proposal does not reopen that flour boundary.

## Current ownership and picker projection

The read-only key audit applied the repository's normalized phrase rules to active reference displays and aliases, form labels and match terms, legacy candidates, and ledger record IDs. No exact `navane` owner exists on those surfaces. The existing foxtail rows are:

| Reference | Active names and aliases | Relevant fields |
|---|---|---|
| `ingredient-ref-foxtail-millet` | `foxtail millet / millet d'Italie`; English aliases `thinai`, `kangni`, `korra`, `rala` | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-foxtail-millet-flour` | `foxtail millet flour / farine de millet d'Italie`; English aliases `thinai flour`, `kangni flour`, `korra flour` | `FLOUR_AND_STARCH`; current source-scoped measurement observations and blocked substitution research remain untouched |

This is a static projection of `IngredientReferenceSearchIndex` behavior from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including reference terms and attached form terms; it is not runtime or emulator QA.

| Query | Current result | Result after adding only `navane` |
|---|---|---|
| `navane` | No result | `ingredient-ref-foxtail-millet` only |
| `navane flour` | No result | No result; the grain alias does not create a flour-qualified match |
| `foxtail millet` | Foxtail millet grain and foxtail millet flour | Same two results |
| `foxtail millet flour` | Foxtail millet flour only | Same result |
| `thinai` | Foxtail millet grain and foxtail millet flour | Same two results |
| `millet d'Italie` | Foxtail millet grain and foxtail millet flour | Same two results |
| `rala` | Foxtail millet grain only | Same result |

The exact alias has no active-reference, form, or legacy-candidate key collision. `navane flour` is not activated by this one-word grain alias under the current complete-phrase-first search behavior.

## Recipe demand

All **114** manifest-listed recipe files and **1,123** ingredient rows were parsed and scanned for `navane`, `navani`, `navanakki`, `foxtail millet`, `millet d'Italie`, and foxtail-millet reference links. The scan found **zero matching recipe files, zero matching ingredient rows, and zero links** to `ingredient-ref-foxtail-millet`. This is regional catalog coverage, not a recipe-demand correction.

The manifest-ordered recipe corpus remains 114 files, 1,123 rows, and 753,792 bytes, with fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Measures and substitutions

- Keep the grain ledger's `measurementState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []`. Singal's lists a 2 lb package and a product-specific water-to-grain cooking suggestion; neither is a household volume-to-mass measure, density, or reusable cooking yield [S01].
- Keep `substitutionResearchState: not_yet_researched`; add no global or contextual substitution. The retailer's description of the grain as an alternative to rice does not supply a tested recipe role or replacement ratio [S01].
- Add no dry/cooked form, conversion, yield, observation, recipe link, or active rule. The alias identifies the same grain and carries no new numeric or preparation behavior.

## Live baseline and collision audit

Snapshot checked on 2026-10-13. Hashes cover exact file bytes.

| Artifact | Current state | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,343 | `eb03d3377d44c22b9288361b1e9a4032aa529f8eb187781f535f8fea6a828609` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,655 records; 6,390 source entries; 5,357 distinct source IDs | `a6fad4069ed0c825e2f7b2301d558f8a0d43a3fc201e9b858875cad9571a7323` |
| Recipe manifest | 114 paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Proposal-local source IDs `WP03-FOXTAIL-NAVANE-20261013-S01` and `S02` were checked absent from the ledger and proposal/batch archive. Existing IDs for IIMR and OQLF evidence are cited as reused sources rather than duplicated. The IIMR source objects already registered as `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01` and `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06` do not currently mention `Navane` in their short `supports` summaries; if integrating this alias, update those existing summaries on the shared foxtail-grain and flour records rather than registering the same source URLs again.

## Source register

New proposal-local sources were checked on 2026-10-13. Existing sources are reused by ID.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| Reused `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01` | ICAR–Indian Institute of Millets Research, [Millets Information: Common name of Millets in Indian Languages](https://www.millets.res.in/millets_info.php), foxtail-millet row; page footer updated 2026-07-07. | Directly lists `Foxtail Millet` and `Kannada: Navane`. The page is an authoritative regional-language-name source; it does not establish Canadian product use, a household measure, or substitution. It is already registered on both foxtail grain and flour ledger rows. |
| Reused `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06` | ICAR–Indian Institute of Millets Research, [Foxtail millet leaflet](https://www.millets.res.in/farmer/2025/Millets_chalisa/English/7Millets_chalisa_foxtail_millet.pdf), common-name section. | Identifies foxtail millet as *Setaria italica L.* and lists `Navane (Kannada)`. It supports species and regional-name scope; it does not define a flour term or a kitchen measure. Already registered on the foxtail grain and flour rows. |
| Reused `WP03-S175` | Office québécois de la langue française, [millet des oiseaux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), updated 2010. | Identifies *Setaria italica* and lists `millet d'Italie` among preferred French terms. It does not mention `Navane`. The page was reopened during root integration; this is existing Québec terminology evidence, not new market evidence. |
| `WP03-FOXTAIL-NAVANE-20261013-S01` | Singal's Indian Grocery Delivery, [Organic Foxtail Millet Thinai Kangani (2 lb)](https://www.singals.ca/products/manna-foxtail-millet-thinai-kangani-500-gm), current product description and availability. | Canadian retailer page says it ships throughout Canada, showed the item in stock, describes the product as foxtail millet, and lists `Navane` among names for the grain. It is one retailer's product copy, not a Québec French label; the 2 lb package and cooking instructions are SKU-specific. A customer review reports a delivery problem, so the page is not treated as a guarantee of fulfillment or ongoing stock. |
| `WP03-FOXTAIL-NAVANE-20261013-S02` | PushmyCart, [Nutty Yogi Organic Foxtail Millet / Navane](https://pushmycart.com/en-ca/products/nutty-yogi-organic-foxtail-millet-navane), Canada-facing indexed product title and description. | Indexed title pairs `Foxtail Millet` with `Navane` and its description identifies Kannada usage. Direct retrieval returned a cache miss. Use only as corroborating product wording; it does not establish current stock, Québec availability, French naming, or a transferable measure. |

## Disposition

**Recommend adding only `navane` as an English alias on `ingredient-ref-foxtail-millet`.** Keep the existing French display `millet d'Italie`, all other aliases, the separate foxtail-millet-flour reference, measurements, forms, recipe links, and substitutions unchanged. The official IIMR naming evidence, OQLF's existing species/French-term boundary, and current Canada-facing grain listings support the exact alias. No recipe demand or reusable numeric behavior was found. Section F remains open.

No app, unit, instrumentation, or emulator tests were run; this proposal does not change application data or code.

## Root integration status

**Integrated.** Added only `navane` to the existing foxtail-millet grain aliases, registered the two Canada-facing source entries, and updated the existing IIMR source summaries on the grain and flour ledger records. The French display, flour aliases, measurements, forms, and substitutions remain unchanged. Section F remains open.

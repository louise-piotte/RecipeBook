# WP03 Section F — Kannada `avalakki` alias review (2026-10-13, round 2)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated on 2026-10-13. Added only the English alias `avalakki` to `ingredient-ref-flattened-rice-poha`; the ledger records the bounded no-measurement result, with no active numeric behavior.
- **Scope:** Decide whether the bare Kannada regional name `avalakki` belongs as an English search alias for the existing flattened-rice product. This review adds no identity, form, recipe link, measurement observation, conversion, yield, or substitution.
- **Plan context:** Section F says specialized regional poha terms remain open after adding `atukulu` ([active checklist, lines 2164–2175](../../RecipeBook-global-ingredient-catalog-plan.txt#L2257)); the broader regional cereal-mix and preprocessed-grain review remains open ([checkpoint, line 9450](../../RecipeBook-global-ingredient-catalog-plan.txt#L9731)).
- **Prior-review check:** The 2026-10-10 poha-thickness batch held `avalakki` for a separate regional/product-scope review. The 2026-10-12 focused `aval` proposal explicitly left it unassigned. The 2026-10-13 `atukulu` proposal and integration batch changed only `atukulu`. No earlier proposal or batch makes an `avalakki` alias decision. See the [poha-thickness batch](../batches/poha-thickness-synonyms-integration-20261010/README.md), [aval review](wp03-section-f-regional-cereal-mix-next-gap-review-20261012.md), and [atukulu review](wp03-section-f-next-regional-cereal-review-20261013.md).

## Recommendation

**Integrate only bare `avalakki` as an English search alias on `ingredient-ref-flattened-rice-poha`.** Keep the display names, French aliases, category, forms, and numeric fields unchanged. Do not create a new ingredient identity or legacy candidate, and do not add dish phrases, color or grade qualifiers, a French alias, recipe links, or substitution rules.

| Field | Proposed disposition |
| --- | --- |
| Existing owner | `ingredient-ref-flattened-rice-poha` |
| English display | Keep `flattened rice (poha)` |
| fr-CA display | Keep `flocons de riz (poha)` |
| English aliases | Add only `avalakki` to the existing aliases |
| French aliases | Keep `riz aplati` and `riz battu`; add none |
| Category | Keep `GRAIN_AND_CEREAL` |
| New identity, form, or legacy candidate | None |
| Recipe links | None |
| Density, mappings, measures, conversions, yields, substitutions | None |

## Identity and product boundary

The Indian Institute of Food Processing Technology's government PMFME handbook identifies `avalakki` as Kannada for flaked rice in its regional-name list. A current Canada-facing listing for white thick poha also lists `Avalakki` among other names for flattened white rice. Together they support a regional search alias for the existing processed rice-flake family. The Canadian listing is a specific white/thick product page; it does not establish a color, cultivar, grade, or processing specification for every product called `avalakki`.

The source distinction between a flaked-rice ingredient and prepared food remains important. The NIFTEM handbook describes common dishes made with flaked rice and separately describes roasted thick flakes used in snack mixtures. A current Toronto café menu calls a prepared `Poha` dish “Pohaa or avalakki” and describes its cooked seasonings. A current Canadian retail page calls its product `Adukale Instant Poha Upma Mix` and lists beaten rice with pulses, nuts, oil, and seasonings. These prepared uses do not justify a separate dish or mix identity or broaden the bare ingredient alias to `avalakki upma`, `avalakki bath`, or snack phrases.

Do not add `avalaki` as a spelling variant; the reviewed regional and Canadian sources spell the term `avalakki`. Do not add `white avalakki`, `red avalakki`, `thin avalakki`, `thick avalakki`, or other qualified terms. The NIFTEM source identifies the unqualified name under flaked rice, while the Canadian plain-ingredient listing is specifically a white thick poha SKU; this evidence supports the bare alias but does not establish those qualified phrases as global names or form mappings. No reviewed Canadian French source uses `avalakki`; keep the Québec French display and aliases unchanged.

## Exact ownership and picker boundary

A read-only normalized-key audit covered all active ingredient-reference names and aliases, all form labels and match terms, the 64 legacy import candidates, and the complete research ledger. No exact normalized owner exists for `avalakki`, `avalaki`, `avalakki upma`, `avalakki bath`, `avalakki puri`, `avalakki chivada`, `avalakki chivda`, or `avalakki poha` in references, forms, or legacy candidates. The ledger contains regional `avalakki` mentions within the existing poha identity's CFTRI/CSIR source records (`WP03-S92` and `WP03-S93`), but no separate `avalakki` record or accepted alias decision. The historic mention is evidence to reuse, not an existing ownership assignment.

Current relevant reference ownership is:

| Reference | Current names and aliases | Boundary |
| --- | --- | --- |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)`; English aliases `beaten rice`, `flaked rice`, `rice flakes`, `chiura`, `aval`, `atukulu`; French aliases `riz aplati`, `riz battu` | Generic flattened rice. Existing English regional aliases are individually scoped; none is an `avalakki` owner. `defaultDensity` is null and `unitMappings` is empty. |
| `ingredient-ref-red-rice-flakes` | `red rice flakes / riz rouge aplati`; aliases `red rice poha`, `poha rouge` | Keep explicit red-rice queries here. Do not add a red qualifier to the generic alias. |
| `ingredient-ref-corn-poha` | `corn poha / poha de maïs`; maize-qualified aliases | Keep maize flakes separate from rice flakes. |
| `ingredient-ref-brown-rice-flakes` | `brown rice flakes / flocons de riz brun` | Keep the brown-rice product distinct; broad `rice flakes` already returns more than one product. |

The generic flattened-rice reference has three commercial forms: thin, medium, and thick poha. Their form IDs and bilingual labels are grade-specific; all three `densityGPerMl` fields are null. No form or form hint is proposed for `avalakki`.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes terms, prefers complete word-phrase matches, then uses substring fallback. Static projection from the live catalog and this search code gives:

| Query | Current projection | Projection after the proposed alias |
| --- | --- | --- |
| `avalakki` | No result | One result: `ingredient-ref-flattened-rice-poha` |
| `avalaki` | No result | No result; spelling not proposed |
| `avalakki upma` | No result | No result; the full dish phrase is not an ingredient alias |
| `aval` | One result: generic flattened rice | Unchanged |
| `atukulu` | One result: generic flattened rice | Unchanged |
| `poha` | Three results: generic flattened rice, red rice flakes, corn poha | Unchanged |
| `rice flakes` | Three results: brown rice flakes, generic flattened rice, red rice flakes | Unchanged |
| `riz aplati` | One result: generic flattened rice | Unchanged |

The proposed exact alias replaces the current empty result for `avalakki`. It does not remove the broader results for `poha` or `rice flakes`, and it does not change French matching. This is a code-and-data projection, not live picker QA.

## Recipe-demand audit

A read-only scan parsed all manifest-listed recipes, checked every serialized recipe, and inspected every ingredient row and existing reference link. Search terms included `avalakki`, `avalaki`, `avalakki upma`, `avalakki bath`, `avalakki puri`, `avalakki chivada`, `avalakki chivda`, `avalakki poha`, neighboring `aval` and `atukulu`, other held regional terms, the generic flattened-rice/poha names and aliases, and the existing French names.

| Corpus measure | Result |
| --- | ---: |
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Candidate-phrase recipe files | 0 |
| Candidate-phrase ingredient rows | 0 |
| Existing links to `ingredient-ref-flattened-rice-poha` | 0 |
| Total recipe-file bytes | 753,792 |
| Manifest-order corpus fingerprint | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The fingerprint hashes each manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order. The corpus shows no current ingredient demand, quantity, form-specific use, or recipe link for this term or the existing poha family. No recipe change is proposed.

## Measurements, density, and conversions

No source supports a household mass-to-volume measure or density for bare `avalakki`. Keep the generic reference's `defaultDensity: null` and `unitMappings: []`; keep each of the three poha form densities null. Do not infer a soak ratio, cooking yield, or conversion from manufacturing descriptions or package data.

| Source-scoped numeric observation | What it applies to | Catalog effect |
| --- | --- | --- |
| NIFTEM reports flake thicknesses of thick about 1 mm, medium about 0.6 mm, thin 0.55–0.3 mm, and very thin below 0.3 mm; it also reports 55–70% field yield depending on paddy variety, quality, process conditions, and flake type. | Industrial flake grades and paddy-to-flake processing, handbook pp. 22–24. These are not household measurements or a cooking yield. | Retain only as source-specific observations. Do not map `avalakki` to any thickness form or activate a yield or conversion. |
| PushmyCart offers 500 g and 1 kg package variants for the listed white thick poha. | One current retailer SKU. | Package size only; no portion, density, or household-volume mapping. |
| Shastha Canada lists a 250 g instant poha-upma mix; directions say one chosen cup/container measure of the mix plus one equal measure of warm water, rest 5 minutes, and one pack serves three. | A multi-ingredient ready-to-cook mix, with beaten rice, pulses, ground nuts, seasonings, oil, sugar, and salt. | Mix-specific package and preparation directions only; not a measure, density, or yield for plain flattened rice or bare `avalakki`. |

## Substitutions

No reviewed source supports replacing another ingredient with `avalakki`, replacing `avalakki` with another grain, or substituting among thin/medium/thick poha for a defined dish and method. NIFTEM establishes a regional name and industrial product process, not culinary interchangeability. PushmyCart's product copy lists uses but no replacement or ratio. The Thindi page describes a prepared dish, and Shastha's equal-measure instruction concerns its formulated mix plus water; neither is a single-ingredient substitution study.

Add no global same-ingredient conversion, form-to-form rule, contextual ingredient substitution, warning, or recipe-line substitution link. The existing poha ledger state remains `substitutionResearchState: blocked_pending_evidence`; this review does not resolve that broader research gap.

## Source register and source-ID audit

Two existing source IDs are reused because their URLs and source entries are already in the shared ledger. Their linked pages explicitly mention `avalakki` as well as `atukulu`; integration should reuse those source IDs and may expand their `supports` descriptions to record the additional reviewed term. Do not create duplicate source entries for those URLs. Before this proposal was created, the two new proposal-local IDs below were absent from all 5,210 distinct current ledger source IDs and 1,514 WP03 source-ID tokens in the proposal/batch archive; they are allocated only in this proposal. Reused IDs remain existing IDs, not new allocations.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| Reused `WP03-ATUKULU-20261013-S01` | Indian Institute of Food Processing Technology / NIFTEM PMFME, [Handbook of Processing of Puffed & Flaked Rice](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/Rice-Based-Product-Handbook.pdf), section 1.3.2, p. 16; industrial grade and yield details, pp. 22–24. Accessed 2026-10-13. | Official regional/technical source: under flaked rice it identifies `avalakki` as Kannada, alongside other regional names. Later pages document flake-processing stages, thicknesses, and field yield. Those figures are process-specific and establish no household measure, cooking yield, color/grade mapping for the word, or substitution. |
| Reused `WP03-ATUKULU-20261013-S02` | PushmyCart, Canada-facing [Nutty Yogi Organic White Thick Poha](https://pushmycart.com/en-ca/products/nutty-yogi-organic-white-thick-poha), product description. Indexed and rechecked 2026-10-13. | Current listing describes white poha as flattened white rice and includes `Avalakki` in its other-names list. The page is for one white thick SKU; its 500 g/1 kg sizes are package variants, and inconsistent sold-out/pre-order controls do not support a stock claim. |
| `WP03-AVALAKKI-20261013-R2-S01` | Thindi Cafe, Toronto, [Poha](https://www.thindi.ca/product/poha/108), current menu description. Search-indexed 2026-10-13. | The menu calls the prepared dish `Pohaa or avalakki` and describes flattened rice with sautéed onion, turmeric, lemon, sugar, and toppings. Supports current local prepared-dish usage only, not a raw ingredient package, standalone measure, or substitution. |
| `WP03-AVALAKKI-20261013-R2-S02` | Shastha Canada, [Adukale Instant Poha Upma Mix 250 g](https://shasthacanada.com/products/adukale-instant-poha-upma-mix-250g), product weight, ingredient list, and cooking method. Indexed and accessed 2026-10-13. | Current Canadian listing distinguishes an instant multi-ingredient mix and calls it `Adukale Avalakki Upma Mix` in the directions. Its package weight, equal-volume mix/water instruction, and three-serving statement apply to this mix only; they do not establish plain-avalakki measures or ingredient ownership. |
| Reused `WP03-S92` / `WP03-S93` | CFTRI, [Improvement of the traditional process for rice flakes](https://ir.cftri.res.in/6762/); CSIR, [Socially Relevant Technologies](https://www.csir.res.in/sites/default/files/2023-06/Compendium-of-Social-relevant-technologies-2.6.2021.pdf), cereal-flakes entry. | Existing ledger entries already mention poha/avalakki and the regional name family. They document product/process context but do not constitute a previous accepted `avalakki` alias decision. |

## Review-time baseline snapshot (before integration)

Read-only snapshot refreshed on 2026-10-13. SHA-256 values cover exact file bytes. The corpus fingerprint uses the manifest-order path/NUL/file-bytes/NUL method above.

| Artifact | Current count/state | SHA-256 or fingerprint |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,337 references; 147 `GRAIN_AND_CEREAL` | `c7bdd65a833d345292f6a480867267a72321cdce4f631018afb4040b9644c8ae` |
| `ingredient-forms.v1.json` | 98 forms; three attached to flattened rice/poha | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; no exact `avalakki` owner | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,645 records; 6,206 source entries; 5,210 distinct source IDs | `f57a7dc26346beda9f850bc5f42a0da0c4c4385d8035c11c7113a1ab9e0c44ec` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | 1,337 references | `117fe0019ddd9ceeee1a4954936dac7df8780c9f147ec64548b57c9f0821c885` |
| `package-yields.v1.json` | One record; none for flattened rice/poha | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Global and contextual substitution files | Zero rules in each | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` for each |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Disposition

Add the single English alias `avalakki` to `ingredient-ref-flattened-rice-poha`. Reuse the existing official institute and current Canada-facing retailer source records; add two separate sources documenting prepared-dish and composite-mix boundaries. Keep displays, French aliases, red-rice/corn/brown-rice boundaries, three thickness forms, and active numeric fields unchanged. Advance measurement research to `researched_no_supported_value`: industrial processing values, package sizes, and composite-mix directions do not provide a household measure for plain flattened rice. Keep the existing blocked substitution state. The term is supported as a regional flaked-rice name, while current Canadian prepared-dish and premix uses show why dish and composite-product phrases remain outside the alias. Section F's broader regional cereal-mix and preprocessed-grain review remains open.

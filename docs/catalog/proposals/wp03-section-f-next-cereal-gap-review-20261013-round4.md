# WP03 Section F — Odia `chuda` flattened-rice alias review (2026-10-13, round 4)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated. Shared files were unchanged when this proposal was drafted; the implementation record below documents the later root integration.
- **Recommendation:** Add only the bare regional name `chuda` as an English-search alias on the existing `ingredient-ref-flattened-rice-poha` identity.
- **Scope:** Resolve one previously deferred regional name for plain flattened rice. This does not review prepared chuda dishes or mixtures, another poha grade, a rice cultivar, a new ingredient identity, or French terminology.
- **Checklist context:** Section F says common rice-flake synonyms and thin/medium/thick poha grades are integrated while other specialized regional terms remain open ([active checklist, lines 2185–2190](../../RecipeBook-global-ingredient-catalog-plan.txt#L2278)).

## Prior-review and ownership audit

The 2026-10-10 poha-thickness integration explicitly left `chuda` out pending regional and product-scope review ([batch record, line 23](../batches/poha-thickness-synonyms-integration-20261010/README.md#L23)). The 2026-10-12 `aval` review listed `chuda` among unowned neighboring terms, and the round-three `chira` review recorded `chuda` as not reviewed or added ([`aval` review, lines 35–39](wp03-section-f-regional-cereal-mix-next-gap-review-20261012.md#L35); [round-three review, lines 57–66](wp03-section-f-next-cereal-gap-review-20261013-round3.md#L57)). The proposal and batch archive contains no focused `chuda` disposition. The bare `chivda/chiwda` hold remains a separate prepared-snack boundary and is not reopened here.

A normalized-key audit of current active reference names and aliases, all form labels and match terms, legacy candidate fields, and ledger record/source/decision text found **no exact normalized owner for `chuda`**. No exact owner exists in the 64 legacy candidates or 98 active forms. The current active poha identity already owns `chiura`, `aval`, `atukulu`, `avalakki`, and `chira`; this proposal adds only the distinct spelling `chuda`.

| Existing reference | Current ownership | Boundary retained |
| --- | --- | --- |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)`; English aliases `beaten rice`, `flaked rice`, `rice flakes`, `chiura`, `aval`, `atukulu`, `avalakki`, `chira`; French aliases `riz aplati`, `riz battu` | Generic flattened rice; proposed owner for bare `chuda`. |
| `ingredient-ref-red-rice-flakes` | `red rice flakes / riz rouge aplati`; aliases `red rice poha`, `poha rouge` | Keep red-rice wording qualified. |
| `ingredient-ref-corn-poha` | Corn flakes sold as poha | Keep maize product separate from rice flakes. |
| `ingredient-ref-brown-rice-flakes` | Brown-rice flakes | Keep the grain-color distinction. |
| `ingredient-ref-puffed-rice` | Puffed rice | Odisha sources distinguish `mudhi` (puffed rice) from `chuda`. |

## Identity and evidence limits

The current Angul district administration page, hosted by the Government of Odisha, names “Chuda (flattened rice)” and separately names `Mudhi (pop rice)` and `Pakhal (watered rice)`. The National Council for Hotel Management’s Odisha food-heritage material likewise defines `Chuda` as flattened rice and distinguishes it from puffed rice. A current Odisha product page labels one plain product “100% Unbleached Flattened White Rice (Chuda / Poha).” These sources support a regional name for the existing product family and the boundary from puffed rice and prepared foods. They do not establish a particular rice cultivar, color, flake thickness, or processing method for every product called `chuda`.

A current Canada-locale marketplace listing includes **Mithila Foods Pure Bhagalpuri Katarni Chuda (Poha)** at a CAD price and 1 kg package size. This provides Canada-facing product-title evidence for the wording, not evidence of Canadian manufacture, local-store prevalence, Québec French usage, or a universal cultivar. Its product is explicitly Bhagalpuri Katarni rice; the proposed bare alias does not transfer that cultivar to generic poha.

Keep `chuda mixture`, `chuda upma`, `chuda powder`, and other product/dish phrases out of the alias list. The sources distinguish plain flakes from prepared uses: for example, the Odisha model menu separately lists `Chuda` and `ChudaUpama`, while the product page describes chivda as a use for its flakes. The existing bare `chivda/chiwda` hold remains unchanged because Canadian sources also apply that spelling family to prepared snack mixtures.

No reviewed Canadian French retailer or Québec terminology authority uses `chuda` as a French label. Keep the existing French display and aliases unchanged; do not add `chuda` to `aliasesFr` or invent a French translation.

## Exact picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, prefers complete normalized word-phrase matches, then uses substring fallback only when there is no phrase match. Static projection against the current reference and form data gives:

| Query | Current result | With only `chuda` added |
| --- | --- | --- |
| `chuda` | No result | Sole result: `ingredient-ref-flattened-rice-poha` |
| `chuda mixture`, `chuda powder`, `chuda upma`, `chuda poha`, or `chuda thick` | No result | No result; none of these longer product/dish phrases is added. |
| `chivda` or `chiwda` | No result | No result; existing prepared-snack hold is unchanged. |
| `poha` | Three results: generic flattened rice, red-rice flakes, and corn poha | Same three results. |
| `rice flakes` | Three results: brown-rice flakes, generic flattened rice, and red-rice flakes | Same three results. |
| `chira` | `ingredient-ref-flattened-rice-poha` | Same result. |
| `achira starch` | `ingredient-ref-canna-starch` | Same result. |
| `mudhi` / `puffed rice` | No result / `ingredient-ref-puffed-rice` | Unchanged. |
| `riz aplati` or `riz battu` | `ingredient-ref-flattened-rice-poha` | Unchanged. |

The exact one-word alias fills the current `chuda` miss without changing longer phrase, French, or adjacent-product results. This is a code-and-data projection, not live picker QA.

## Recipe-demand scan

A read-only scan covered every manifest-listed recipe JSON file, its complete serialized contents, every ingredient row, and existing `ingredientRefId` links. Search terms included `chuda`, `chudwa`, `chura`, `chuda rice`, `chuda poha`, `chuda mixture`, `chuda powder`, `chuda upma`, `chivda`, `chiwda`, `poha`, `flattened rice`, `beaten rice`, `flaked rice`, `rice flakes`, the active English and French flattened-rice names, and the neighboring names `chiura`, `aval`, `atukulu`, `avalakki`, and `chira`.

| Corpus measure | Result |
| --- | ---: |
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Candidate or neighboring term hits in serialized recipe files | 0 |
| Candidate or neighboring term hits in ingredient rows | 0 |
| Existing links to `ingredient-ref-flattened-rice-poha` | 0 |
| Recipe-file bytes | 753,792 |
| Manifest-order corpus fingerprint | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The fingerprint hashes each manifest-relative recipe path, a NUL byte, the exact file bytes, and a trailing NUL byte in manifest order. The current corpus has no recipe demand or poha link; no recipe edit or link is proposed.

## Forms, measurements, and substitutions

### Forms and measurements

Keep the existing thin, medium, and thick poha commercial forms. Each has `densityGPerMl: null`; the generic flattened-rice row has `defaultDensity: null` and `unitMappings: []`. Do not create a form for `chuda`, assign it to a thickness grade, or add a default measure, density, conversion, or cooking yield.

The Odisha School Education Programme Authority page displays a model breakfast line with `Chuda-50g`, sugar, banana, and coconut. Treat this as one menu-context quantity only: the page does not state whether the amount is dry or prepared, which poha grade it uses, or a reproducible household measure. It does not support density or a transferable recipe conversion, so this proposal adds no `measurementObservation`. The Canada-locale retailer’s 1 kg package and the manufacturer’s per-100-g nutrition panel are likewise SKU/package or nutrition basis, not household measures.

The active flattened-rice ledger record currently has `measurementState: researched_supported` because a separate Bangladesh *Chirar Polao* source documents 60 g / 3 fistfuls as a complete recipe-formula amount. Keep that observation strictly within its recorded child-feeding recipe, food state, and quantity basis; it is not evidence for a generic `chuda` or poha measure. Do not change the current measurement state based on this review.

### Substitutions

None of the reviewed sources recommends replacing `chuda` with another ingredient, replacing another ingredient with it, or exchanging thin/medium/thick poha grades using a defined dish, method, or ratio. Food-use examples and product descriptions are not substitution instructions. Keep the current `substitutionResearchState: blocked_pending_evidence`, the existing unresolved grade-interchangeability finding, and all global/contextual substitution rules unchanged. Add no recipe-line substitution link.

## Exact proposed fields and disposition

| Target | Proposed change |
| --- | --- |
| `ingredient-ref-flattened-rice-poha.aliasesEn` | Add only `chuda`. |
| `nameEn`, `nameFr`, `aliasesFr`, `category` | Keep unchanged: `flattened rice (poha)`, `flocons de riz (poha)`, `riz aplati` / `riz battu`, `GRAIN_AND_CEREAL`. |
| `defaultDensity`, `unitMappings` | Keep `null` and `[]`. |
| Thin/medium/thick poha forms | Keep all three; do not add `chuda` to form labels or match terms; preserve null densities. |
| New identity, legacy candidate, recipe link, yield, conversion, substitution | None. |
| `ingredient-ref-flattened-rice-poha` ledger record | Add the reviewed sources and an accepted alias decision for bare `chuda`; keep existing measurement observations and substitution findings unchanged. Do not add a `chuda` measurement observation. |

**Disposition: integrate the one alias only.** The government regional definition, plain-product label, and Canada-facing `Chuda (Poha)` product listing jointly support one bounded search name on the existing flattened-rice row. Product-specific cultivar, grade, prepared dish, prepared mixture, French-language, numeric, and substitution claims remain outside the proposed fields.

## Source register and source-ID audit

Before this file was written, the five proposal-local source IDs below were absent from the **5,241 distinct source IDs** in the current research ledger and the **5,765 distinct source-ID tokens** in the proposal/batch archive. Their exact URLs were also absent from current ledger source entries and the archive. No existing source is duplicated or reused in this proposal.

| Source ID | Source and locator | Supports / limits |
| --- | --- | --- |
| `WP03-CHUDA-20261013-R4-S01` | Government of Odisha, Angul District Administration, [Art & Culture](https://angul.odisha.gov.in/en/tourism-art-and-culture), “Food” section. Accessed 2026-10-13; page indexed as updated about three months earlier. | Current official regional page names `Chuda (flattened rice)` and separately `Mudhi (pop rice)` and `Pakhal (watered rice)`. Supports the Odia regional name and product boundary, not a universal cultivar, process, or measure. |
| `WP03-CHUDA-20261013-R4-S02` | National Council for Hotel Management and Catering Technology, [Indian Food Heritage](https://nchm.gov.in/sites/default/files/2025-01/Indian_Food_Heritage.pdf), Odisha, “Ingredient Wise Festival Food” / “Rice, Breads & Lentils.” Accessed 2026-10-13. | Official regional food-heritage material glosses `Chuda` as flattened rice and distinguishes `Mudhi/Ukhuda` as puffed rice. It is regional survey context, not a current product standard or measurement source. |
| `WP03-CHUDA-20261013-R4-S03` | PIP Agro, [White Kanda Poha — Flattened Rice](https://pipagro.com/products/white-kanda-poha), product ingredients and maker section. Accessed 2026-10-13; indexed about three weeks earlier. | Product page labels one plain white item “100% Unbleached Flattened White Rice (Chuda / Poha)” and identifies its Odisha mill partner. Supports the product-name pairing on that SKU only; no universal white-rice, grade, process, or measure claim. |
| `WP03-CHUDA-20261013-R4-S04` | DistaCart, Canada-locale [Poha collection](https://www.distacart.com/en-ca/collections/poha), listing `Mithila Foods Pure Bhagalpuri Katarni Chuda (Poha)`, CAD price, 1 kg variant. Accessed 2026-10-13; page indexed about four months earlier. | Current Canada-facing listing pairs `Chuda` with `Poha` in a plain flattened-rice product title. DistaCart states it serves Canada; this is not a Canadian manufacturer or local-store prevalence evidence. The listing’s Bhagalpuri Katarni product and package size are product-specific. |
| `WP03-CHUDA-20261013-R4-S05` | Odisha School Education Programme Authority, [Interventions](https://osepa.odisha.gov.in/?p=intervention), “Model Food Menu,” Monday breakfast line. Accessed 2026-10-13; page indexed within the last few days, but the displayed material does not identify a publication/version date. | Displays `Chuda-50g` with sugar, banana, and coconut in a model menu. Supports only that page’s menu context; it does not state product grade, dry/prepared state, or household measure. No active measure or ledger observation is proposed from it. |

## Review-time baseline snapshot

Read-only snapshot after the round-three `chira` integration and before this proposal. SHA-256 values cover exact bytes; the recipe corpus fingerprint uses the manifest-order method above.

| Artifact | Current count/state | SHA-256 or fingerprint |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,338 references; 147 `GRAIN_AND_CEREAL` | `31403369c9ab28910a5f88f5b915f794e8bac3fb472b3527f95954a4021343c3` |
| `ingredient-forms.v1.json` | 98 forms; three attached to flattened rice/poha | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; no exact `chuda` owner | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,646 records; 6,238 source entries; 5,241 distinct source IDs | `8e0a39792083df8494584a28eba0a450845fedef06f7d844e2755e2346e16f88` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | 1,338 references | `fac8b6ebe6ce442c0965388d69da39b6be9ab16dced23782d44c32810536ecfd` |
| `package-yields.v1.json` | One package-yield record; none for flattened rice/poha | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Global substitution rules | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitution rules | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Manifest-order recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Static review checks

- Re-read `AGENTS.md`, the live Section F checklist, the current poha row/forms/ledger, and the prior poha-thickness, `aval`, `chira`, and `chivda` records.
- Recomputed exact normalized ownership, recipe corpus counts/fingerprint, picker-query projection, current baseline hashes, and source-ID/URL collision checks from the current worktree.
- Checked this proposal file for UTF-8 without BOM, trailing whitespace, and mojibake markers. No app tests or emulator checks were run.

## Integration record

Root added only `chuda` to `ingredient-ref-flattened-rice-poha.aliasesEn`, attached the five proposal source records and an accepted alias decision to that ingredient's research-ledger record, and regenerated `BundledIngredientCatalog.kt`. No chuda-specific measurement observation was added; the existing recipe-specific Chirar Polao observation remains unchanged. No recipe or form changed.

Package normalization and validation, generated-index freshness, focused data assertions, static picker projection, the 114-recipe / 1,123-row scan, UTF-8/no-BOM, and scoped whitespace checks passed. No app, unit, instrumentation, or emulator tests were run under the database-JSON exemption. See the [integration batch record](../batches/wp03-section-f-chuda-alias-integration-20261013/README.md).

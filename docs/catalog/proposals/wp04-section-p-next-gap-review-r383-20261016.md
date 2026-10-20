# WP04 Section P — fish milt / laitance identity review (R383)

## Scope and recommendation

- **Review date:** 2026-10-16.
- **Open checklist:** Section P still has an open roe/product-coverage item, “Roe, tobiko, masago, salmon roe, bottarga, and caviar where recipes call for them,” in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7293). This review addresses the distinct male-gonad product term *milt / laitance*; it does not reopen the female-roe decisions or any species-specific fish identity.
- **Recommendation:** Add one identity-only `PROTEIN` reference, `ingredient-ref-fish-milt`, displayed as **`milt / laitance`**, with the OQLF English alias `soft roe`. Keep fish eggs and female roe, herring `rave`, cod roe, bottarga, mentaiko, tarako, ikura, tobiko, masago, kazunoko, sea-urchin gonads, and formed fish products separately scoped. Add no forms, recipe links, numeric data, conversions, yields, or substitutions.
- **Status:** Integrated 2026-10-16 as an identity-only reference and ledger decision. The parent Section P roe checklist remains open.

The OQLF defines *laitance* as a mature male fish gonad and explicitly describes it as a commercializable anatomical part. Its preferred Québec French term is *laitance*; English terms include *milt* and *soft roe*. DFO’s Québec-area herring plan separately names herring eggs (*rave*) and sperm (*laitance*) in its historical account. A Canadian seafood supplier’s live catalogue lists fresh cod milt separately from fresh cod roe. Together, these sources support a bounded food identity for the male reproductive product, independent of species and product state. The DFO passage is historical context, and the retailer listing does not establish Québec inventory or a universal preparation. [S01–S03]

This candidate is adjacent to the open roe checklist but is not a female egg product. It should not inherit aliases from generic fish roe, herring roe, or any named roe product. The OQLF English synonym `soft roe` is included because it identifies this exact anatomical term; the picker effect on a broad `roe` query is recorded below.

## Proposed reference if accepted

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-fish-milt` |
| `category` | `PROTEIN` |
| `nameEn` | `milt` |
| `nameFr` | `laitance` |
| `aliasesEn` | `["soft roe"]` |
| `aliasesFr` | `[]` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |

Use OQLF’s Québec-standardized *laitance*. Do not use France-specific *laite*, the explanatory phrase *sperme de poisson*, or a species phrase as a French alias. Do not add the retailer-specific Japanese/Korean labels `shirako` or `iri`, `fish sperm`, `fish milt`, `cod milt`, `herring milt`, or `laitance de poisson` as broader aliases. The proposed row describes the mature male gonad product only; it does not assert that every fish species is sold in this form, or define fresh, frozen, cooked, salted, or other states.

## Ownership and product boundary

| Surface | Current owner or state | R383 disposition |
|---|---|---|
| Active references | No exact `milt`, `laitance`, or `soft roe` name or alias. `ingredient-ref-bottarga` displays salted, pressed, dried fish roe / *œufs de poisson*; `ingredient-ref-finger-lime` owns the existing English `lime caviar` term. | Add only the proposed male-gonad identity. Keep female roe and other existing products intact. |
| Active forms | No form owns `milt`, `laitance`, or `soft roe`; no fish-milt form is attached to a fish species. | Add no form. Source-specific freshness, season, and retailer size text do not define reusable forms. |
| Legacy import candidates | No exact candidate ID, display term, or alias for the milt/laitance product. | Add no legacy mapping. |
| Research ledger | No exact candidate or identity record for `ingredient-ref-fish-milt` or the names above. The incidental substring `milt` in a canned-trout source locator is part of “Hamilton”; it is not an exact term or owner. | If accepted, create the new identity record and attach only source claims that are explicitly within this scope. Reuse the existing DFO source ID noted below; do not duplicate that source URL. |
| Plan and proposal archive | The generic roe checklist remains open. Prior roe decisions cover female roe products, including salmon roe, bottarga, lumpfish roe, mentaiko, tarako, kazunoko, and sea-urchin gonads; no milt/laitance identity or focused hold was found. R40’s Daily Seafood URL contains `shirako` in its slug, but its cited page is a specific spiced cod-roe listing, not a general milt decision. | Record this as a separate male-gonad product review. Keep the parent roe checklist open. |
| Fish and formed seafood | Active species references and separate fish-ball, chikuwa, and other formed-seafood references remain distinct. | Do not attach milt to a fish species, fish balls, chikuwa, surimi, or fish cake. |

The new reference should not become a catch-all for fish reproductive products. OQLF’s `soft roe` is the only proposed alternate English phrase. Do not add generic `roe`, `fish roe`, `fish eggs`, `œufs de poisson`, or *rave* as aliases. The DFO use of *rave* refers to herring eggs in that historical passage, not to milt.

## Picker projection and Québec naming boundary

The projection follows the live phrase-first matching behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Current names, aliases, and attached form terms were checked before adding the proposed names below.

| Query | Current result | With proposed row | Boundary |
|---|---|---|---|
| `milt`; `laitance` | No result | `ingredient-ref-fish-milt` | Exact English and Québec French names identify the product. |
| `soft roe` | No result | `ingredient-ref-fish-milt` | OQLF-listed English synonym; no broader synonym family is inferred. |
| `roe` | `ingredient-ref-bottarga` | `ingredient-ref-bottarga`; `ingredient-ref-fish-milt` | The OQLF alias adds a second, anatomically distinct result for this broad query. It is not added as a bare alias. |
| `fish roe`; `œufs de poisson` | `ingredient-ref-bottarga` | Same | Keep the current female-roe wording and bottarga boundary unchanged. |
| `caviar` | `ingredient-ref-finger-lime` | Same | Do not introduce a second caviar result or confuse roe with finger lime’s descriptor. |
| `cod milt`; `herring milt`; `laitance de poisson` | No result | No result | The source examples are species/product phrases, not aliases for a cross-species identity. |
| `shirako`; `shiroko` | No result | No result | Seller-specific or transliterated terms are not adopted as Québec picker names. |
| `iri` | `ingredient-ref-mirin`, `ingredient-ref-ogiri-egusi`, and `ingredient-ref-white-vinegar` | Same three results | The current substring fallback matches `iri` inside `mirin`, `ogiri`, and the `spirit vinegar` alias. Do not adopt the retailer’s transliteration or promise a no-result query. |
| `lait` | Existing milk-related matches | Same matches | The exact phrase-first matches remain milk terms; `laitance` does not add a milk result. |
| `fish`; `poisson` | 10 results each | Same 10 results each | The proposed row has no broad fish/poisson alias. |

OQLF’s page also marks *laite* as a France term and says it was not retained for Québec fish-product commercialization. Keep it out of the French display and aliases. The source’s accepted `soft roe` synonym is narrower than bare `roe`; the picker projection makes the resulting two-row `roe` query explicit for root review.

## Manifest-listed recipe demand and numeric limits

The manifest-ordered scan parsed all **114** recipe files, every one of the **1,123** structured ingredient rows, and each complete UTF-8 JSON file. It searched for whole-word normalized phrase matches to `milt`, `milt of fish`, `fish milt`, `soft roe`, `laitance`, `laitance de poisson`, `laitance de morue`, `laitance de hareng`, `fish sperm`, `sperme de poisson`, `fish gonad`, `gonade mâle`, `cod milt`, `herring milt`, `shirako`, `shiroko`, `iri`, and nearby egg/roe terms: `roe`, `fish roe`, `fish eggs`, `œufs de poisson`, `rave`, `roe sac`, `bottarga`, `ikura`, `tobiko`, `masago`, `tarako`, `mentaiko`, and `kazunoko`. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe link or numeric behavior is supported.

The Salties page lists a supplier-specific size of approximately 400 g for its fresh cod-milt item and approximately 1,000 g for its fresh cod-roe item, with a stated seasonal window. These are supplier listing details; they do not establish a household measure, serving, count-weight factor, density, yield, or recipe amount. Add no default density, unit mapping, package yield, conversion, cooking yield, or substitution. Do not infer that male milt substitutes for female roe, bottarga, or fish flesh.

## Snapshot and source-uniqueness checks

Read-only workspace snapshot on **2026-10-16**. The corpus digest uses every manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order.

| Artifact | Snapshot |
|---|---|
| Active ingredient references / forms | 1,699 / 141 |
| Legacy import candidates | 56 |
| Research ledger | 2,055 records; 9,264 source entries; 7,840 distinct source IDs; 6,562 distinct URLs |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,988 bytes; SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

Exact normalized ownership checks covered active reference IDs/names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, and ledger record IDs. They found no exact owner for `ingredient-ref-fish-milt`, `milt`, `laitance`, `soft roe`, `fish milt`, `cod milt`, `herring milt`, `shirako`, or `shiroko`. Plan and archive checks found no dedicated milt/laitance proposal, active allocation, or prior focused hold. The R40 `shirako` URL slug is scoped in that review to one spiced cod-roe product and does not own the generic anatomical term.

The new source prefix `WP04-SECTIONP-FISH-MILT-R383-20261016-`, IDs S01/S03, and their exact URLs were absent from the live ledger and exact-URL archive check. The DFO URL is already in the ledger and R204 proposal as `WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S02`; this review reuses that exact source ID/URL for a new, line-specific historical claim and proposes no duplicate source ID. Salties has earlier product-specific links in the archive, but the exact homepage URL used here was not previously registered; its product page confirms the homepage listing observed in the current capture. If integrated, add the DFO locator for the milt wording to the reused source’s evidence rather than creating a second URL record.

## Recommendation and reopen conditions

Add the bounded identity-only `milt / laitance` reference with the OQLF English alias `soft roe`; keep the phrase-first `roe` result visibly multi-product, with bottarga and milt as separate owners. Retain no product-state forms, species aliases, measures, recipe links, conversions, yields, substitutions, or safety claims. Keep the Section P parent open for unresolved roe products and other seafood coverage.

Revisit alias scope if a bundled recipe or Québec label uses another stable milt name, if the broad `roe` result proves confusing in picker review, or if a recipe establishes a specific species and state. This proposal changes only this Markdown file; no tests, builds, or emulator checks were run.

## Source register

Pages were accessed or rechecked on 2026-10-16. New source IDs below have one exact URL each; reused source IDs retain their existing URL and are not reassigned.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-FISH-MILT-R383-20261016-S01** | Office québécois de la langue française, [GDT: laitance](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199069/laitance), last updated 2012; preferred term normalized July 1990; “Notes,” “Terme privilégié,” and English terms. | Defines the item as a commercializable anatomical part and a mature male gonad, with commercial-potential fish species listed broadly; prefers Québec French *laitance* and gives English *milt* and *soft roe*. It does not specify a species, state, preparation, recipe use, measure, or food-safety instruction. |
| **Reused `WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S02`** | Fisheries and Oceans Canada, [Hareng Atlantique Division 4S (Zone de pêche du hareng 15)](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/herring-hareng/2021/area-15-zone-fra.html), 2021 plan, §1.1 “Historique,” lines 110–112. | In a Québec-area Atlantic-herring history passage, the plan distinguishes eggs (*rave*) from sperm (*laitance*). It is historical herring-fishery context, not evidence of present retail stock, a modern consumer label, or a species-general recipe instruction. This exact URL and source ID already belong to the R204 smoked-bloater ledger record; reuse them and add no duplicate. |
| **WP04-SECTIONP-FISH-MILT-R383-20261016-S03** | Salties, [seafood catalogue](https://www.salties.ca/), listing “Fresh Cod Roe” and “Fresh Cod Milt (Shirako 白子) (Iri 이리)” (accessed 2026-10-16). | The Edmonton supplier page lists cod milt separately from cod roe and shows supplier-specific size/season wording. It supports a Canadian product-label example only; it does not establish Quebec availability, a French label, current stock, cod taxonomy, standardized package content, or transferable measures. |

## Root review

The proposed ownership and picker change is narrow: `milt` and `laitance` become discoverable, OQLF’s exact English `soft roe` maps to the same identity, and a bare `roe` query returns both the existing bottarga row and the new male-gonad row. The female-roe-specific phrases `fish roe` and `œufs de poisson`, the existing `caviar` result, and broad `fish`/`poisson` result sets remain unchanged. Root review and integration are recorded below.

## Root review and integration

Root independently rechecked OQLF’s GDT entry: it defines *laitance* as a mature male gonad and commercializable anatomical part, prefers the Québec term *laitance*, and lists English *milt* and *soft roe*. The current Salties catalogue separately lists fresh cod roe and fresh cod milt, with supplier-specific size and season text; this is a Canadian product listing, not Québec availability or a transferable measure. Root also confirmed DFO’s historical herring passage distinguishes eggs (*rave*) from sperm (*laitance*). The reused DFO source ID remains attached to the new ledger record with a milt-specific locator and claim; no duplicate source ID or URL allocation was made.

Root checked active reference/form/legacy ownership and the ledger; there was no exact owner for the proposed identity or its search terms. The new OQLF and Salties URLs were absent from the ledger and exact-URL proposal/batch archive. Whole-word normalized phrase scanning reproduced zero recipe-file, ingredient-row, or direct-reference-link matches across all 114 manifest-listed files and 1,123 rows; substring text inside `mirin` was not counted as a match for the transliterated product name `iri`.

Root added `ingredient-ref-fish-milt` as `milt / laitance` in `PROTEIN`, with only `soft roe` as an English alias, and added an accepted ledger decision with the two new sources and the reused DFO source. Measurement research is recorded as `researched_no_supported_value`; no product-specific size was promoted to a reusable measure. No form, recipe link, conversion, yield, or substitution was added. Static package/ledger schema, generated-catalog freshness, ownership, picker projection, recipe-corpus, encoding, local-link, and whitespace checks passed. No software tests, builds, emulator checks, or deployment work were run for this database JSON addition.

See the [R383 integration README](../batches/wp04-section-p-fish-milt-identity-integration-r383-20261016/README.md). After integration the package has **1,700 references and 141 forms**; the ledger has **2,056 records, 9,267 source entries, 7,842 distinct source IDs, and 6,564 distinct URLs**. The parent Section P roe checklist remains open.

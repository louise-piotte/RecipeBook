# WP03 Section F — fonio flakes product-boundary review (2026-10-13, round 10)

## Review record

- **Status:** Root integration complete. `candidate-fonio-flakes` is recorded in the research ledger only; no active ingredient reference was created.
- **Scope:** Review the distinct processed-cereal candidate `fonio flakes`, after the prior sorghum-couscous candidate. This does not reopen puffed fonio, fonio grain or flour identities, or the composition of any named breakfast cereal.
- **Open checklist:** Section F continues the review of regionally significant cereal mixes and preprocessed grains ([active plan, regional cereal item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2352)). Round nine added `candidate-sorghum-couscous` as an unresolved ledger-only record; that candidate is separate from fonio flakes.
- **Recommendation:** Record one unresolved ledger-only `candidate-fonio-flakes`; keep it out of active references until a current Canadian or Québec product source establishes the product composition boundary and Québec French display. Do not allocate `ingredient-ref-fonio-flakes`, add aliases or forms, or create numeric or substitution behavior.
- **Evidence scope:** Sources establish that fonio flakes are a named cereal format and that current Ghana-market products use the name for fruit-containing breakfast products. They do not establish a plain single-grain flake class or a current Canadian/Québec product label.

## Why this is a distinct gap

The prior [puffed-fonio review](wp03-section-f-puffed-fonio-identity-review-20261012.md) and its [hold integration record](../batches/wp03-section-f-puffed-fonio-hold-integration-20261012/README.md) explicitly list fonio flakes as a separate neighboring product. They decide only puffed fonio and do not resolve flakes. A repository-wide proposal and batch search found no focused fonio-flake identity, alias, measurement, or picker decision.

The product phrase is not evidence of one stable ingredient composition. CBI’s 2023 market report describes flakes as a possible fonio breakfast-cereal format while saying fonio had not yet entered the European breakfast segment. Current Ghana retail pages name Nourimeal fonio flakes, but specify whole fonio with pineapple and ginger or with dates. A 2024 food-science study also calls a baked product “acha flakes” even though it is a composite of fonio flour, Bambara-nut flour, and crayfish powder. These sources support a real processed-cereal candidate; they do not define `fonio flakes` as plain flaked fonio.

The candidate also lacks a current Québec product label. OQLF’s entry for *fonio blanc* covers the grain identity and its names, including *fonio* and *acha*; it does not define a flaked product. The official French-language Canadian Trademarks Journal entry for application 1,483,767 (SIMPLI) contains the phrase *flocons de fonio transformés* in CIPO’s French translation of the English goods description. The journal’s front matter says the first-listed language is the language filed by the applicant and the later goods text is a translation for convenience only. Here, the English goods text is applicant-filed; the French phrase is not applicant-filed wording. The current CIPO application PDF is English-language and supports only the English phrase *processed fonio flakes*. Neither the proposed-use record nor its convenience translation proves actual Canadian use, a product label, or a Québec-preferred product name. The shorter candidate display *flocons de fonio* is a constructed, unverified shortening of the journal wording, not an established Québec product term.

## Exact proposed disposition

| Field | Proposed value or disposition |
|---|---|
| Ledger record ID | `candidate-fonio-flakes` |
| Record type | `candidate` |
| Identity state | `needs_clarification` |
| Measurement state | `researched_no_supported_value` |
| Substitution research state | `researched_no_supported_substitute` |
| Decision | `unresolved`; preserve only as a ledger candidate |
| Candidate phrases | `fonio flakes`, `fonio flake`, `flaked fonio`, `processed fonio flakes`, `flocons de fonio`, `flocons de fonio transformés`, and `acha flakes`; evidence phrases are not active aliases |
| Active reference ID | None; do not allocate `ingredient-ref-fonio-flakes` yet |
| Possible future category | `GRAIN_AND_CEREAL`, only if a stable ingredient identity is established |
| English/French displays and aliases | No active display or aliases. Treat `fonio flakes / flocons de fonio` only as a provisional candidate gloss; the shorter French form is constructed and unverified, not a Québec-approved bilingual display. |
| Forms, measures, mappings, conversions, yields | None |
| Recipe links and substitution rules | None |

The ledger candidate should cite the seven new source IDs below and reuse the existing OQLF and Québec retailer source records cited in the prior fonio work. The unresolved decision should explain that the evidence spans both an emerging flake format and composite ready-to-eat cereals, while no current Canadian/Québec label establishes the generic identity or its French display.

## Product and identity boundary

The current active catalog has distinct identities for white fonio, black fonio, fonio flour, and black fonio flour. None is a flake identity. Keep those records unchanged.

| Neighbor | Boundary |
|---|---|
| `ingredient-ref-white-fonio` — `white fonio / fonio blanc` | Whole edible grain; OQLF’s unqualified *fonio* and *acha* terms belong to this grain entry. They do not establish a flake alias. |
| `ingredient-ref-black-fonio` — `black fonio / fonio noir` | Separate *Digitaria iburua* grain identity; current flake product pages do not state species. |
| `ingredient-ref-fonio-flour` and `ingredient-ref-black-fonio-flour` | Milled products, not flakes or ready-to-eat cereal. |
| `candidate-puffed-fonio` review and hold | Puffed fonio is a separate process candidate; do not share its name or aliases with flakes. The earlier review left flakes outside its scope. |
| Nourimeal flavored flakes | Current source descriptions include fruit and spice. Do not treat these exact SKUs as evidence for a plain one-ingredient fonio flake reference. |
| Research “acha flakes” | A formulated baked product, not a synonym for whole fonio flakes. Do not alias `acha flakes` to white fonio or a future plain-flake row. |
| Composite breakfast cereals and snack products | Keep fruit, pulse, seafood, or other added ingredients in their own product scope; no generic cereal mix identity is proposed here. |

The archive note in the puffed-fonio review is a prior mention, not a prior decision. This review does not turn the already-held puffed-fonio candidate into a flakes candidate or claim that the two products share a process.

## Current ownership and picker projection

The structured ownership audit covered all active reference displays and aliases, all 98 form labels and match terms, all 64 legacy candidates, and the ledger’s formal record IDs and candidate records. It found no exact normalized owner for `fonio flakes`, `fonio flake`, `flaked fonio`, `processed fonio flakes`, `flocons de fonio`, `flocons de fonio transformés`, or `acha flakes`. There is no active form for fonio. The string `fonio flakes` occurs in the puffed-fonio review only as an explicitly separate neighboring product.

Current picker results below follow `IngredientSearch.kt`: NFKD/accent folding, complete word-phrase matching before substring fallback, with reference names, aliases, and attached form terms included. The conditional projection uses only the hypothetical names `fonio flakes` / `flocons de fonio`, with no aliases or forms; it is shown to quantify the collision, not to recommend activation.

| Query | Current result set | If the hypothetical row were activated |
|---|---|---|
| `fonio` | 4: black fonio; black fonio flour; fonio flour; white fonio | 5, adding `fonio flakes`; the broad query gains another product choice. |
| `fonio flakes` | 0 | 1: the hypothetical row. |
| `flocons de fonio` | 0 | 1: the hypothetical row. |
| `flocons` | 26 existing references, including grain flakes and other flaked products | 27; a French display containing `flocons` adds to an already broad result set. |
| `fonio flour` | 2: fonio flour and black fonio flour | 2; unchanged. |
| `fonio blanc` | 1: white fonio | 1; unchanged. |
| `fonio noir` | 2: black fonio and black fonio flour | 2; unchanged. |
| `acha` | 2: white fonio and fonio flour | 2; unchanged. |
| `acha flakes` | 0 | 0; no alias is proposed. |

The proposed hold leaves all current results unchanged. If a later source resolves the product, keep any candidate row phrase-qualified: do not add bare `fonio`, `acha`, or `flocons`, and do not place flakes as a state form on whole fonio. The candidate’s present composition and species evidence is insufficient to justify even the conditional active row.

## Québec French and source limits

OQLF’s *fonio blanc* entry (existing source ID `WP03-S34`) identifies the white-grain term and lists *fonio*, *acha*, *fundi*, and *findi* as terms for that grain. It does not establish *flocons de fonio*, and its scope must not be stretched from *Digitaria exilis* grain to an unspecified processed product.

The current CIPO application PDF for SIMPLI application 1483767 supports the English proposed-use goods wording *processed fonio flakes* and records the later withdrawal. It does not contain French wording. The exact French phrase *flocons de fonio transformés* appears in CIPO’s French-language [Canadian Trademarks Journal of May 2, 2012](https://www.ic.gc.ca/opic-cipo/tmj/fra/02May2012.pdf?edition=05-02&year=2012), Vol. 59, No. 3001, entry 1,483,767 / SIMPLI. The journal front matter states that the first-listed goods language is the language filed by the applicant, that registration is restricted to those goods, and that later goods text is translated for convenience only. In this entry English is listed first, so the French wording is CIPO’s published convenience translation of the English goods description, not applicant-filed French wording. It does not establish actual Canadian retail use, a package label, current Québec usage, or an OQLF-approved term. The shorter candidate display *flocons de fonio* is a constructed, unverified shortening of the translation. The current Québec retailer Mako Foods Exotik lists a separate whole-grain product as *Fonio précuit*; reuse its earlier source record `WP03-PUFF-FONIO-20261012-S06`. That supports local use of the base noun and a different processing label, not a French name for flakes.

Do not promote the constructed, unverified shorter candidate display `flocons de fonio` to the active `fr-CA` display: only the longer CIPO-published convenience translation `flocons de fonio transformés` appears in the historical journal entry, and no reviewed source verifies the shorter form as a Québec product term. Reopen when a current Québec or Canadian product label names the fonio flake product and clarifies whether it is plain grain flakes or a formulated breakfast cereal, or when an authoritative Québec source defines that product class.

## Measurements and substitutions

### Measurement findings

- The Ghana product page lists a 250 g package option; that is a package size, not a recipe measure, serving, density, or conversion.
- The Amazon page reports the same product as 8.8185 oz and lists the ingredients as whole-grain fonio, pineapple, and ginger. Do not use the package mass as a cup weight.
- The Kedar page’s 50 g with 150 mL instruction is for its separate fonio shake powder variant, not for flakes. Do not transfer it to cereal flakes.
- The 2024 research paper reports formulation ratios for fonio/Bambara-nut/crayfish baked flakes. Those experimental batch percentages do not provide a household measure or transferable mass-volume density for a commercial fonio-flake product.
- No reviewed source provides a reusable cup, spoon, serving, density, unit mapping, cooking yield, or conversion for a generic fonio-flake identity. Store no measurement observation or active numeric value.

### Substitution findings

Sources describe the Nourimeal product as a ready-to-eat cereal or snack, sometimes eaten with milk or yogurt. Those serving suggestions are not evidence that fonio flakes replace plain fonio grain, flour, oats, another flake, or a recipe’s cereal ingredient at equal quantity. CBI’s discussion of breakfast-cereal potential is a market use, not a tested replacement. General sources that use whole fonio instead of rice, quinoa, or couscous do not establish substitutions for processed flakes. Record no replacement target, amount, contextual rule, or recipe-line substitution; the candidate’s substitution status is researched with no supported substitute found.

## Recipe-corpus demand

The full split seed manifest lists **114 recipe files** containing **1,123 ingredient rows**. Every file and ingredient row was scanned, including serialized text and reference links. There were zero recipe files, zero ingredient rows, and zero existing reference links matching `fonio flakes`, `fonio flake`, `flaked fonio`, `processed fonio flakes`, `fonio cereal`, `fonio cereal flakes`, `flocons de fonio`, `flocons de fonio transformés`, `acha flakes`, `fonio puffed`, or the other fonio/flake spellings audited above. There were no occurrences of `fonio` anywhere in the recipe corpus. No recipe demand supports an identity, alias, form, numeric value, or relink.

## Source-ID and baseline audit

New proposal source IDs are `WP03-FONIO-FLAKES-20261013-R10-S01` through `WP03-FONIO-FLAKES-20261013-R10-S07`. Exact-string searches found no collisions in the ledger, proposals, batches, plan, or active seed package. Reuse the existing `WP03-S34` OQLF record and `WP03-PUFF-FONIO-20261012-S06` Mako record; do not register either again as a new source. The candidate ID `candidate-fonio-flakes` and possible active ID `ingredient-ref-fonio-flakes` are currently unallocated.

| ID | Source and evidence | Limit |
|---|---|---|
| `WP03-FONIO-FLAKES-20261013-R10-S01` | CBI, [Entering the European market for fonio](https://www.cbi.eu/market-information/grains-pulses-oilseeds/fonio/market-entry), updated 2023-11-15, breakfast-cereal section. | Says flakes are a possible cereal format and notes fonio had not penetrated Europe’s breakfast segment. Market-development evidence, not a product standard or Canadian name. |
| `WP03-FONIO-FLAKES-20261013-R10-S02` | Africa Eats, [Agromyx](https://www.africaeats.com/agromyx/), manufacturer profile dated 2020-06-20. | Identifies Agromyx as a Ghana processor of fonio cereal meals with added fruit/vegetables and links to its fonio flakes. Secondary company-profile source; not a present product label. |
| `WP03-FONIO-FLAKES-20261013-R10-S03` | Amazon, [Nourimeal FONIO (FLAKES)](https://www.amazon.com/NOURIMEAL-FONIO-FLAKES/dp/B0CL3TS7QY), accessed 2026-10-13. | Product page names the flake item and lists whole-grain fonio, pineapple, and ginger; it was unavailable at review. Marketplace content is not a Canadian package or proof of current availability. |
| `WP03-FONIO-FLAKES-20261013-R10-S04` | Kedar Health, Ghana, [Fonio Flakes & Shake Powder | Nourimeal](https://kedarhealth.com/products/fonio-ready-to-eat-nourimeal), accessed 2026-10-13. | Lists 250 g Original and With Dates flakes and describes their ingredients; variants were sold out. The same page also lists a separate shake powder product. Retailer data, not evidence of a plain-flake formula. |
| `WP03-FONIO-FLAKES-20261013-R10-S05` | Anaemene, Adifeseso, and Adesanya, [Nutritional and Sensory Evaluation of Locally Produced Acha (*Digitaria exilis*) Flakes Fortified with Bambara Nut and Crayfish](https://journalejnfs.com/index.php/EJNFS/article/view/1413), *European Journal of Nutrition & Food Safety* 16(4), 2024, DOI 10.9734/ejnfs/2024/v16i41413. | Describes a study formulation made from fonio flour, Bambara-nut flour, and crayfish powder. Supports a composite-flake sense only; batch percentages are not product measures. |
| `WP03-FONIO-FLAKES-20261013-R10-S06` | CIPO, [SIMPLI — Canadian trademark application 1483767](https://ised-isde.canada.ca/cipo/trademark-search/pdf/1483767?lang=eng), official English-language record accessed 2026-10-13. | Supports the English goods wording “processed fonio flakes,” the 2010 filing, proposed-use status, and owner withdrawal in 2016. This PDF contains no French wording and is not evidence of actual retail use. |
| `WP03-FONIO-FLAKES-20261013-R10-S07` | CIPO, [Canadian Trademarks Journal, Vol. 59, No. 3001, May 2, 2012, application 1,483,767 / SIMPLI](https://www.ic.gc.ca/opic-cipo/tmj/fra/02May2012.pdf?edition=05-02&year=2012), official French-language issue, entry begins on printed p. 49 and continues onto p. 50; front matter on p. 1. | English is the first-listed, applicant-filed goods language in the entry. CIPO publishes “flocons de fonio transformés” as its French translation for convenience only; the front matter says later goods text is a convenience translation and registration is restricted to the first-listed filed language. This is not applicant-filed French wording, a package label, evidence of actual sale, current Québec usage, an OQLF term, or support for the shorter display “flocons de fonio.” |
| Reuse `WP03-S34` | OQLF, [fonio blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529747/fonio-blanc), existing ledger source. | Supports the base grain term and white-fonio identity only; not flakes. |
| Reuse `WP03-PUFF-FONIO-20261012-S06` | Mako Foods Exotik, [Fonio précuit (400 g)](https://www.makofoods.ca/products/fonio-precuit), source already cited in the puffed-fonio proposal. | Current Québec-facing product name for a different pre-cooked fonio product; not a flake label. |

Proposal-time package snapshot, 2026-10-13. File hashes cover exact bytes. The corpus digest hashes manifest-relative paths and recipe bytes in manifest order, with NUL separators.

| Artifact | Count | Bytes | SHA-256 / corpus digest |
|---|---:|---:|---|
| Ingredient references | 1,342 | 430,176 | `a1b425300c63e9961a1c81f4fddd4e5b6e39de8b82c60056dab297300c90fb1c` |
| Ingredient forms | 98 | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy candidates | 64 | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,652 records; 6,328 source entries | 6,295,260 | `7181987854fa0934831792757985f39e8f53b3bb7dcb50412473af1a026621fe` |
| Seed manifest | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files; 1,123 ingredient rows | 753,792 total recipe bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Final recommendation

**Hold `fonio flakes` as the unresolved ledger-only `candidate-fonio-flakes`.** Product-format evidence exists, but current examples use the name for fruit-containing ready-to-eat cereal, while experimental “acha flakes” can be a distinct multi-ingredient baked product. The only reviewed French phrase is CIPO’s convenience translation in a historical proposed-use journal entry, not applicant-filed French wording; no current Québec product label identifies a plain fonio-flake ingredient. Keep active references, aliases, forms, measures, conversions, yields, recipe links, and substitutions unchanged. Reopen after a current Canadian/Québec product source establishes both the intended product boundary and its French label.


## Root integration result

Added unresolved ledger-only record `candidate-fonio-flakes` with identity `needs_clarification`, measurement `researched_no_supported_value`, and substitution `researched_no_supported_substitute`. The record includes seven new review sources, the existing OQLF `WP03-S34` source reused from white fonio, and the previously cited Mako `WP03-PUFF-FONIO-20261012-S06` source. No active reference, alias, form, measurement observation, conversion, recipe link, or substitution was added. Static package, generated-index, ledger schema/ID/source-link, picker, recipe-corpus, encoding, and whitespace checks passed. No app or emulator tests were run because this was a database-JSON-only catalog update.

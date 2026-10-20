# WP04 Section P — Atlantic sea raven / hémitriptère atlantique boundary review (R79)

- **Review date:** 2026-10-13.
- **Packet type:** source-backed species identity, Québec market-scope, ownership, picker, recipe-demand, and numeric-boundary review.
- **Decision:** **Hold** *Hemitripterus americanus* outside the active ingredient catalog and research ledger for now. The species and bilingual name pair are identifiable, but this review found no current Québec consumer product or bundled-recipe demand that would justify assigning an active picker identity. This is a market-evidence hold, not a claim that the species is absent from commercial fishing.
- **Current integration delta:** zero rows in references, forms, legacy identities, ledger, conversions, recipe links, or substitutions. Do not reserve a candidate ID.
- **Tests:** none run; this is proposal-only research and makes no product change.

## Chosen open checklist item

The selected open line is the regional-fish portion of the Section P checklist:

> [ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.

See the [live checklist at line 4134](../../RecipeBook-global-ingredient-catalog-plan.txt#L4143). This candidate is a regional finfish review, independent of the R77 rock-crab and R78 soft-shell-crab reviews. It is also distinct from the earlier holds and additions for other regional fish.

## Identity and scope

The species is *Hemitripterus americanus*. Government of Canada TERMIUM Plus pairs the English common name **sea raven** with the French **hémitriptère atlantique** for this scientific name. Québec-facing Exploramer uses the same French species name and names it as the kitchen name. The English page uses **Sea raven**. These sources support a clear candidate identity and French display wording.

The CFIA Fish List is the relevant federal source for acceptable English and French fish names used in Canadian fish labelling. Its published guidance says the list maps common names to species. I verified that scope, but could not retrieve a candidate-specific Fish List result for *H. americanus* through the dynamic search page or indexed search. I therefore do **not** claim that either display name is confirmed as a CFIA-accepted label name. TERMIUM and Exploramer are naming evidence, not a substitute for a CFIA row.

No OQLF GDT entry for `sea raven`, `hémitriptère atlantique`, or *Hemitripterus americanus* was located in the exact-name searches. This is a search limitation, not an OQLF decision or a reason to replace the locally used French species name. No OQLF preference is claimed.

Exploramer's Québec species page, reviewed 2026-10-13 (footer © 2025), says the species is “Pas encore commercialisé au Québec,” reports no directed Québec fishery, and describes incidental catch in groundfish trawling and lobster traps. That is scoped Québec-facing market information. It does not establish a universal absence from commercial fishing or prove that incidental catch is always discarded. DFO's Maritimes-region observed-trip data below documents retained catch in a different, explicitly identified fishery and time period. No Québec retailer listing, current consumer package, or recipe line was found.

## Current ownership and archive audit

The live snapshot contains 1,403 active ingredient references, 104 forms, 63 legacy-import candidates, and 1,741 research-ledger records. Whole-phrase searches across active names and aliases, form labels and match terms, legacy names and aliases, and ledger records found no owner for:

- `sea raven`, `hémitriptère atlantique`, or *Hemitripterus americanus*;
- `crapaud de mer`, `crapaud gonfleur`, `plogueuil`, or `plogueil`;
- `ingredient-ref-sea-raven` or `candidate-sea-raven`.

The proposal-source prefix `WP04-SECTIONP-SEA-RAVEN-BOUNDARY-R79-20261013-` is unused in the live ledger and proposal/batch archive. No focused sea-raven proposal, hold, or integration was found. R77 rock crab and R78 soft-shell crab remain excluded from this review.

There is one lexical overlap worth preserving as a boundary: an earlier monkfish proposal discusses `crapaud de mer` for *Lophius americanus*. Exploramer also lists `crapaud de mer` among sea-raven appellations, so this name is demonstrably shared across distinct fish identities in Québec-facing material. The monkfish proposal's OQLF discussion applies to its *Lophius* market concept only; it is not a ruling on sea raven. Keep `crapaud de mer` out of both identities' global aliases. Likewise, do not add `crapaud gonfleur`, `plogueuil` / `plogueil` (the latter names are geographically attributed to Îles-de-la-Madeleine by Exploramer), or generic `sculpin` as sea-raven aliases. The latter is group-level wording in the DFO bycatch table and would overstate species scope.

## Recipe demand and picker boundary

All 114 manifest-listed bundled recipes and their 1,123 ingredient rows were scanned for complete normalized phrases for the candidate identity, scientific name, regional appellations, candidate IDs, and `sculpin`. **Result: zero matching recipe files and zero matching ingredient rows.** No recipe link, amount, preparation form, or contextual use is supported.

The active search implementation in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and matches complete word phrases first, then falls back to substring matching. A static query projection against current references and forms gives:

| Query | Current picker results | Boundary |
|---|---:|---|
| `sea raven` | 0 | No current identity owner. |
| `hémitriptère atlantique` | 0 | No current French identity owner. |
| `crapaud de mer`, `crapaud gonfleur`, `plogueuil`, `plogueil` | 0 each | No active alias; do not import locally listed appellations as global search terms. |
| `sculpin` | 0 | Generic group wording, not a species-safe alias. |
| `sea` | 6 | Coarse, fine, and flaky sea salt; orange-footed sea cucumber; sea buckthorn berry; sea lettuce. |

If a future evidence gate is met and a single qualified display row is added, exact `sea raven` and `hémitriptère atlantique` searches would each select that row; broad `sea` would expand from six to seven rows, alongside salts, cucumber, buckthorn, and lettuce. That projection does not itself create an ambiguity among fish, but `sea` remains a broad and low-value picker query. The species-specific query is usable; the missing Québec product evidence and zero recipe demand are the reasons to hold. No aliases should be added to manufacture more search coverage.

## Forms, measurements, conversions, yield, and substitutions

| Dimension | Evidence and decision |
|---|---|
| **Identity** | Candidate is the species *H. americanus*, with TERMIUM's English/French pair `sea raven` / `hémitriptère atlantique`. The exact CFIA Fish List row was not verified. Keep the candidate unallocated. |
| **Product and form** | Exploramer gives general culinary texture and a Québec consumer-market statement, but no current product or package. Do not add whole, gutted, fillet, fresh, frozen, smoked, or other forms. |
| **Measurement** | Exploramer's “up to 70 cm” is a biological size observation, not a purchase or recipe measure. DFO weights are summed observed fishery catch, not a retail package, serving, or recipe quantity. Add no default measure or count conversion. |
| **Conversion and density** | No source supports a unit conversion, density, or a conversion among whole fish, fillet, cooked fish, or another state. Add none. |
| **Yield** | No edible-yield or trimming evidence was found. Do not derive a fillet yield from biological length or fishery catch weights. |
| **Substitution** | No recipe or product source establishes a quantity- and method-based substitute. Do not create global or contextual substitution rules to cod, wolffish, sculpin, or another finfish. Culinary similarity is insufficient. |

The biological size note is included only to make the numeric boundary explicit; it is not a portion estimate or default measure. No source reviewed supports safe-cooking, storage, curing, or raw-consumption equivalence.

## Numeric evidence and limits

DFO's 2024 report *Estimating Incidental Catch of Non-Target Species from the Commercial Fishery for Atlantic Halibut in Maritimes Region* lists sea raven (*H. americanus*) in two appendices of summed catch weights from **observed Atlantic-halibut-directed trips**:

| DFO table and observation period | Kept weight | Discard weight | Total weight |
|---|---:|---:|---:|
| Appendix 2, Table A4; 2009–2013 | 76.00 kg | 410.39 kg | 486.39 kg |
| Appendix 2, Table A5; 2014–2020 | 108.00 kg | 1,235.59 kg | 1,343.59 kg |

These are aggregate observed-trip catch weights in DFO's Maritimes Region, not Québec landings, retail sales, a consumer product, a count of fish, edible yield, or recipe amounts. The `kept` values prove retention in those observed commercial trips only; they do not by themselves prove a sale or consumer availability. Exploramer's statement about Québec consumer commercialization and DFO's Maritimes observations have different geography, periods, and measures and should remain separate.

## Recommended disposition and exact delta

**Hold** the candidate from the active picker. Keep its source review in this proposal only; do not create a ledger candidate or reserve an ID. The exact current data delta is empty:

```json
{
  "ingredient-references.v1.json": [],
  "ingredient-forms.v1.json": [],
  "legacy-import-identities.v1.json": [],
  "research-ledger.v1.json": [],
  "recipe-links": [],
  "conversions": [],
  "yields": [],
  "substitutions": []
}
```

If later evidence supports activation, review the Canadian label name first and then consider at most one identity row with `nameEn: "sea raven"`, `nameFr: "hémitriptère atlantique"`, `category: "PROTEIN"`, empty English/French alias arrays, null density, and no unit mappings. That is a contingent shape only, not a request to insert it now. Do not add any of the regional appellations as aliases without separate Québec product evidence and a picker collision review.

Reopen only if a current Québec consumer product or a bundled/user recipe need is documented, the product's species and preparation state are explicit, and the CFIA Fish List name boundary is checked directly. Any later form, measure, conversion, yield, or substitution requires its own evidence.

## Sources

Sources were checked on 2026-10-13. Source IDs are proposal-local and have not been written to the research ledger.

| Proposal source ID | Source | What it supports and what it does not |
|---|---|---|
| `WP04-SECTIONP-SEA-RAVEN-BOUNDARY-R79-20261013-S01` | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Defines the role of accepted English/French common fish names, scientific names, and species links for Canadian fish labelling. The dynamic candidate-specific lookup was not available in this review, so no exact CFIA name-pair approval is claimed. |
| `WP04-SECTIONP-SEA-RAVEN-BOUNDARY-R79-20261013-S02` | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Describes the Fish List's role and Canadian scope for fish sold or processed in Canada. It is labelling guidance, not a recipe alias or product-availability source. |
| `WP04-SECTIONP-SEA-RAVEN-BOUNDARY-R79-20261013-S03` | Government of Canada Translation Bureau, [TERMIUM Plus result for *Hemitripterus americanus*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frr&lang=eng&srchtxt=HEMITRIPTERE+ATLANTIQUE) | Pairs the scientific name with `sea raven` (English) and `hémitriptère atlantique` (French); the record is dated 2016-03-14. Terminology evidence, not CFIA labelling confirmation or current retail evidence. |
| `WP04-SECTIONP-SEA-RAVEN-BOUNDARY-R79-20261013-S04` | Exploramer / Université Laval, [Hémitriptère atlantique](https://deleaualabouche.ca/especes/hemitriptere-atlantique/) | Québec-facing species and kitchen name, regional appellations, “not yet commercialized in Québec,” no directed Québec fishery, incidental-catch description, and general flesh description. It is a Québec species/food education page, not a retail SKU, harvest authorization, or proof of zero retained catch. |
| `WP04-SECTIONP-SEA-RAVEN-BOUNDARY-R79-20261013-S05` | Exploramer / Université Laval, [English sea raven page](https://deleaualabouche.ca/en/species/hemitriptere-atlantique/) | English species name and corresponding Québec market/fishery description. Page translation shares the same source scope as S04 and is not independent market evidence. |
| `WP04-SECTIONP-SEA-RAVEN-BOUNDARY-R79-20261013-S06` | Fisheries and Oceans Canada, [Estimating Incidental Catch of Non-Target Species from the Commercial Fishery for Atlantic Halibut in Maritimes Region](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41230218.pdf) | Appendix 2 Tables A4/A5 give summed kept, discarded, and total weights for *H. americanus* in observed Atlantic-halibut-directed trips in 2009–2013 and 2014–2020. These Maritimes observations do not establish Québec retail sale, package sizes, recipe quantities, or edible yield. |
| `WP04-SECTIONP-SEA-RAVEN-BOUNDARY-R79-20261013-S07` | Office québécois de la langue française, [Vitrine linguistique / GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/) | Exact-name searches were run for `sea raven`, `hémitriptère atlantique`, and *Hemitripterus americanus*; no matching OQLF entry was located. This records a search outcome only, not an OQLF term decision. |

Archive cross-checks: [R77 rock crab review](wp04-section-p-rock-crab-picker-boundary-review-r77-20261013.md), [R78 soft-shell crab review](wp04-section-p-next-seafood-gap-review-r78-20261013.md), and [monkfish / baudroie boundary review](wp04-section-p-monkfish-baudroie-picker-boundary-review-20261012.md). The R77 and R78 candidates are excluded; the monkfish file is noted solely because it also discusses `crapaud de mer` under a different species concept.

## Static review record

- Re-read current `AGENTS.md`, the open Section P checklist line, live references, forms, legacy identities, ledger, recipe manifest, R77/R78 proposals, and relevant proposal/batch archive before drafting.
- Rechecked the source pages and DFO table snippets for this review; recorded regional/time-period scope and numeric limits above.
- Verified the unique R79 source-ID prefix and candidate-ID absence in live data and the archive.
- Verified this proposal as UTF-8 without BOM, with a final newline, no trailing whitespace, and no mojibake markers.
- Checked local Markdown links resolve from this proposal's directory and external links are direct primary-source pages or documents.
- No tests or emulator were run; no product files changed.

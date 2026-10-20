# WP02 A6 round 15: little-millet flour naming and picker hold — 2026-10-13

## Review record

- **Reviewed and sources rechecked:** 2026-10-13.
- **Status:** Proposal packet; root integration is complete. The integrated outcome is recorded below and in the [round-fifteen integration](../batches/wp02-wp03-wp04-round15-gap-review-integration-20261013/README.md).
- **Selected unfinished A6 gap:** Plain little millet flour from *Panicum sumatrense*.
- **Related held grain candidate:** `candidate-little-millet` already exists in the ledger; its grain identity is source-supported, but it has no active reference because its Québec French display was unresolved.
- **Non-overlap:** This revisits the little-millet flour hold from the 2026-10-12 millet-flour review. It does not reopen the integrated kodo, proso, foxtail, pearl, finger, or sorghum products, or the distinct barnyard, brown-top, Rala, Mabele, Sikiya, and sprouted-pearl-millet holds. It is not an alias review for Kambu from round 14.
- **Disposition:** Keep both the companion little-millet grain and little-millet flour unallocated for now. New official Canadian French evidence resolves the old species-name evidence gap, but the current picker makes the supported `petit millet` phrase capture the separate OQLF term `petit mil` through substring fallback. That would offer only little millet for a shorter Québec query that also names foxtail and pearl millet.

## Why this held candidate is being reconsidered

The October 10 WP03 review held human-food little millet (*Panicum sumatrense*) because it could not validate a distinct Québec French display. The October 12 A6 flour review then held little millet flour because Canadian listings used `little millet flour` and `farine de petit millet`, but did not state a botanical species, and the grain-level French display remained unresolved. The OQLF entry for `millet` lists `petit mil` as a preferred term and says it can be generic; separate OQLF entries also use `petit mil` for foxtail and pearl millet.

That evidence picture has changed. Agriculture and Agri-Food Canada’s current bilingual article now directly pairs English `little millet` with French `petit millet` and identifies both as *Panicum sumatrense*. The 2025 FSSAI standard independently lists Little Millet (Kutki) as *Panicum sumatrense*, separately from the other millets. Current Canadian storefronts also list little-millet flour, and a Canadian French product page is headed `Farine de petit millet` and calls the grain `kutki`.

This is enough to identify the candidate and to distinguish the full phrase **petit millet** from the OQLF phrase **petit mil** at the source level. It does not make the pair safe in this app’s current picker. `IngredientSearch.kt` first checks complete normalized word phrases and then falls back to substring matching. Because `petit millet` begins with the character string `petit mil`, a query for `petit mil` falls through and returns the proposed little-millet rows even though the query is not a complete-word match. Since OQLF uses `petit mil` for a broader millet group and specifically for foxtail and pearl millet, those results omit plausible intended species. The source-backed names therefore meet the identity-evidence threshold, while the current picker still blocks catalog allocation.

## Candidate identity and exact product boundary

The evidence supports a paired grain/flour review, not a flour row by itself. If only a flour row were added, a bare `little millet` or French query could resolve to flour alone. The possible identities are:

| Prospective ID (unallocated) | English / fr-CA display supported by sources | Scope | Current disposition |
|---|---|---|---|
| `ingredient-ref-little-millet` | `little millet` / `petit millet` | Human-food whole or dehulled grain of *Panicum sumatrense*. | Hold until the picker can distinguish `petit millet` from the shorter `petit mil` query. |
| `ingredient-ref-little-millet-flour` | `little millet flour` / `farine de petit millet` | Plain flour milled from little millet (*Panicum sumatrense*), without a supported grade or special process. | Hold with the grain row; do not attach it to generic millet flour. |

No proposed reference ID is currently allocated. If the picker boundary is resolved in a future review, add the two rows together with `GRAIN_AND_CEREAL` and `FLOUR_AND_STARCH` categories, empty aliases, `defaultDensity: null`, and `unitMappings: []`. Do not add a grain or flour row alone.

Keep these product boundaries explicit:

- FSSAI’s grain standard covers whole or dehulled millets. It supports a distinct grain identity but does not prove that every retail little-millet grain has the same polishing or dehulling state.
- The flour identity is for plain flour from the named species. Do not include mixed-millet flour, dosa or porridge mixes, cooked dishes, flakes, granules, malted flour, sprouted flour, or an unspecified processed product.
- Keep the retailer phrase `Little Millet Rice` as source wording only. It does not make this *Panicum* grain a rice (*Oryza sativa*) identity or support `rice`, `millet rice`, or `little millet rice` as aliases.
- Do not activate `petit mil`, `millet indien`, `kutki`, `kutki flour`, `samai`, `saamai`, `samai flour`, or `Panicum sumatrense` as aliases in this pass. `Kutki` is a supported grain-name crosswalk, but no direct plain-flour alias is needed for the proposed display. The Canadian grain listing uses `Samai` in a paired product title, but no `Samai flour` product label is needed to identify this A6 flour gap. No alternate French name was verified from OQLF or a Canadian French flour label. The scientific name belongs in identity evidence, not a user-facing alias.

## Canadian and Québec evidence

The new evidence supports both the grain identity and the source-observed flour product:

1. **Authoritative species and English name:** The live 2025 FSSAI cereal standard lists little millet (Kutki) as *Panicum sumatrense*, distinct from foxtail, kodo, pearl, and proso millet. The existing ledger source `WP03-LITTLE-MILLET-20261010-S01` covers that standard. Agriculture and Agri-Food Canada’s existing English-language source `WP03-LITTLE-MILLET-20261010-S02` uses `little millet` for *Panicum sumatrense*.
2. **New Canadian French evidence:** Agriculture and Agri-Food Canada’s French-language counterpart names `le petit millet (Panicum sumatrense)`. Its English/French pairing is direct Canadian governmental evidence for the full species-qualified French common name. The French page remains indexed by AAFC and was crawled in the last month; its direct fetch timed out during this review. The English counterpart shows a last-modified date of 2023-01-27. It is a federal science article, not an OQLF preferred-term ruling.
3. **Current Canadian flour product:** FreshOnTheGo Grocery’s current Scarborough, Ontario `Millet Flours` category lists `Little Millet flour 1 Kg` with a product card and Add to Cart control. Its product card does not state the Latin name; the FSSAI/AAFC sources establish the taxonomy separately.
4. **Current Canadian French flour wording:** Spice Divine’s French storefront page is headed `Farine de petit millet S&V 2 lb`; its French product description says little millet is called `kutki` in Hindi. The same page was already recorded in the October 12 A6 flour review as its proposal-local source `WP02-A6-MILLET-FLOUR-FOLLOWUP-20261012-S10`; this packet does not count that page as independent new evidence or create another source ID for the same URL. On the October 13 re-query, the search listing showed the French product title and availability, but the direct page fetch was unavailable, so the displayed stock state may be stale.
5. **Current Canadian grain wording:** FreshOnTheGo’s Ontario `Millets Whole` category lists `Samai Little Millet 1 Kg`. The page supports a current Canadian retail name for a grain product, not the botanical identity or a claim about a standardized grain preparation.
6. **Independent Canadian flour listing:** Little India Grocers’ current Thornhill, Ontario flour category lists `S&V Little Millet Flour 2LB` under flour. The listing confirms a second Canadian seller’s product wording; stock and online ordering are subject to change.

### Why the old OQLF concern remains relevant

The OQLF records are still the best Québec terminology sources reviewed for the competing shorter phrase. Its `millet` entry, last updated in 2010, lists `petit mil` as a preferred term and describes `millet` as a generic term that groups multiple species. Its `millet des oiseaux` entry maps *Setaria italica* (foxtail millet) and lists `petit mil`; its `millet perle` entry maps pearl millet and also lists `petit mil`. These entries do **not** list the full phrase `petit millet` as the little-millet term. The AAFC article is new direct evidence for `petit millet` tied to *Panicum sumatrense*, but the current query implementation bridges the spelling distinction by substring fallback.

The full French product label `farine de petit millet` is directly attested on the Canadian French storefront. A query for that complete phrase would select only the flour row. A shorter query for `petit mil`, however, would match the same display as a substring and would select the proposed little-millet grain and flour rows without returning the foxtail or pearl choices named by OQLF. No alternate safe fr-CA display was found in the reviewed authoritative sources.

## Proposal-time ownership, IDs, and picker projection

At proposal time, the live snapshot contained **1,343 references**, **98 forms**, **64 legacy-import candidates**, and **1,655 ledger records**. Exact normalized-key ownership was checked across active reference names and aliases, form labels and match terms, legacy-import candidates, and ledger IDs. Normalization mirrors `IngredientSearch.kt`: lowercase, NFKD folding, accent removal, punctuation-to-space conversion, and whitespace collapse.

| Candidate key or ID | Current exact owner | Finding |
|---|---|---|
| `little millet`; `little millet flour`; `petit millet`; `farine de petit millet` | None | No active exact key. |
| `Panicum sumatrense`; `kutki`; `samai`; `saamai`; `petit mil`; `little millet rice` | None | No active exact key; several remain excluded or source-only for the reasons above. |
| `ingredient-ref-little-millet`; `ingredient-ref-little-millet-flour` | None | Both prospective reference IDs are unused in references, forms, legacy candidates, and ledger record IDs. |
| `candidate-little-millet` | Existing research-ledger candidate | Reuse this record for any future grain-level evidence update; do not create a second grain candidate. |
| `candidate-little-millet-flour` | None | No flour-specific candidate record exists. |

New proposal-local source IDs `WP02-A6-LITTLE-MILLET-20261013-R15-S01` through `S06` were checked against the live ledger and proposal/batch archive; none is already assigned. Reuse the already registered FSSAI and AAFC English source IDs and the existing OQLF source IDs. The Spice Divine French URL was already documented as proposal-local `WP02-A6-MILLET-FLOUR-FOLLOWUP-20261012-S10`; do not record that URL a second time under another source ID if it is later added to the ledger.

Static picker projection using the two source-supported displays, with no aliases:

| Query | Projected result | Search path and interpretation |
|---|---|---|
| `little millet` | Grain and flour rows | Complete phrase in both displays; intended two-product choice. |
| `little millet flour` | Flour row only | Complete phrase; intended qualified result. |
| `petit millet` | Grain and flour rows | Complete word phrase in `petit millet` and `farine de petit millet`; intended grain/flour choice. |
| `farine de petit millet` | Flour row only | Complete phrase; intended qualified result. |
| `petit mil` | Grain and flour rows only | No exact word-phrase hit; the substring fallback matches the prefix of `petit millet`. This omits the other species understood by the OQLF term, so it is not acceptable picker behavior. |
| `millet` | Many generic and species-specific rows | Broad query remains a multiple-choice search; the projected catalog has 20 results. |

The projection is an in-memory audit of the current search algorithm, not a runtime picker test. The no-alias proposal also means `kutki` and `samai` remain unmatched by these candidate rows.

## Bundled recipe demand

The current manifest lists **114 recipe files** and **1,123 ingredient rows**. The serialized recipe corpus and ingredient-row fields were scanned for `little millet`, `little millet flour`, `petit millet`, `farine de petit millet`, `petit mil`, *Panicum sumatrense*, `kutki`, `samai`, `saamai`, `little millet rice`, and both prospective reference IDs.

- Recipe files with a candidate phrase or target ID: **0 of 114**.
- Ingredient rows with a candidate phrase or target ID: **0 of 1,123**.
- Direct links to either prospective target reference: **0**.

No recipe link, relink, text edit, or inferred demand is proposed.

## Measures, forms, and substitution implications

No little-millet grain or flour reference is active, and there is no active form, household measure, density, conversion, cooking yield, package yield, recipe link, or substitution rule for these candidates.

The Canadian store package labels show retail quantities such as 1 kg and 2 lb. They are package masses, not household measures or flour-to-volume conversions. The 2025 FSSAI grain standard’s moisture and quality limits are regulatory specifications, not culinary measurements. No reusable cup, spoon, density, or cooked-yield value was found for the candidate flour.

Research does show experimental wheat-flour replacement in specific bread formulas. Mannuramath et al. tested little-millet flour at 10%, 30%, and 50% in a straight-dough bread formula; the 10% and 30% samples had sensory scores not significantly different from the control, while the 50% sample scored lower. Pradhan and Tripathy tested 10%, 25%, and 40% little-millet flour in refined-wheat composite bread; the 25% sample was acceptable in that study, while incorporation affected dough and loaf properties. These are formula-specific findings, not a general replacement ratio or recipe-independent conversion. Do not activate a wheat substitution, substitution warning, or flour measure from these studies. A future ledger record may retain the study observations with their test formulas and limits.

## Source and ID register

New source IDs below are proposal-local. Existing source IDs named in the text should be reused rather than duplicated.

| Proposal source ID | Source | Supports | Limit |
|---|---|---|---|
| **WP02-A6-LITTLE-MILLET-20261013-R15-S01** | Agriculture and Agri-Food Canada, [Pleins feux sur le mil](https://agriculture.canada.ca/fr/science/science-racontee/realisations-scientifiques-agriculture/pleins-feux-mil), “Le puissant petit millet”; French page search result rechecked 2026-10-13; English sibling shows last modified 2023-01-27. | Direct Canadian French pairing of `petit millet` and *Panicum sumatrense*. | French page search result was current/crawled within the month, but its direct fetch timed out; federal science article, not an OQLF preferred-term record. The exact term still falls under substring behavior in the current picker. |
| **WP02-A6-LITTLE-MILLET-20261013-R15-S02** | FreshOnTheGo Grocery, [Millet Flours](https://www.freshonthegrocery.ca/categories/millet-flours/10705000000442901), Scarborough, Ontario; accessed 2026-10-13. | Current Canadian product card `Little Millet flour 1 Kg` with Add to Cart. | Retail card does not state Latin species, ingredient processing, or kitchen measures. Availability can change. |
| **WP02-A6-LITTLE-MILLET-20261013-R15-S03** | FreshOnTheGo Grocery, [Millets Whole](https://www.freshonthegrocery.ca/categories/millets-whole/10705000000442911), Scarborough, Ontario; accessed 2026-10-13. | Current Canadian grain card `Samai Little Millet 1 Kg`. | Retail name does not establish taxonomy or a standardized grain preparation; no alias is proposed. |
| **WP02-A6-LITTLE-MILLET-20261013-R15-S04** | Little India Grocers, [Atta and Flour](https://www.littleindiagrocers.ca/shop/flour-19949), Thornhill, Ontario; accessed 2026-10-13. | Independent Canadian flour listing `S&V Little Millet Flour 2LB`. | Retail listing, not a flour standard or botanical declaration; store says online and in-store prices/stock may vary. |
| **WP02-A6-LITTLE-MILLET-20261013-R15-S05** | Mannuramath, M., Yenagi, N., and Orsat, V., [“Quality evaluation of little millet (*Panicum miliare*) incorporated functional bread”](https://pmc.ncbi.nlm.nih.gov/articles/PMC4648869/), *Journal of Food Science and Technology* 52(12) (2015). | A study-specific 10%, 30%, and 50% flour replacement experiment and the corresponding sensory comparison. | Experimental bread formula and sample; does not establish a general wheat-substitution rule, kitchen measure, or active conversion. The paper uses *P. miliare* nomenclature; PubMed Central’s direct page fetch presented a CAPTCHA during this review. |
| **WP02-A6-LITTLE-MILLET-20261013-R15-S06** | Pradhan, A., and Tripathy, P. P., [“Effect of little millet (*Panicum miliare*) on physical, rheological, nutritional and microstructural properties of bread”](https://onlinelibrary.wiley.com/doi/10.1111/jfpp.16782), *Journal of Food Processing and Preservation* 46 (2022), e16782. | A second study-specific 10%, 25%, and 40% composite-bread experiment; reports the tested 25% formulation as acceptable and notes dough/loaf changes. | Experimental bread result only; no transferable replacement ratio or culinary measure. The paper uses *P. miliare* nomenclature. |
| **WP03-LITTLE-MILLET-20261010-S01** (reuse) | FSSAI, [Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §23, PDF p. 17. | Official species crosswalk and whole/dehulled grain scope for Little Millet (Kutki), *Panicum sumatrense*. | Grain standard, not little-millet flour specification or kitchen measurement. Already attached to `candidate-little-millet`. |
| **WP03-LITTLE-MILLET-20261010-S02** (reuse) | Agriculture and Agri-Food Canada, [Shining a Spotlight on Millet](https://agriculture.canada.ca/en/science/story-agricultural-science/scientific-achievements-agriculture/shining-spotlight-millet), “The mighty little millet.” | Canadian government English name and species crosswalk. | English page only; the newly reviewed French page is registered as S01 above. Already attached to `candidate-little-millet`. |
| **WP03-LITTLE-MILLET-20261010-S04–S06** (reuse) | OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), [millet des oiseaux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), and [millet perle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle), rechecked 2026-10-13. | Generic `petit mil` terminology and its use for foxtail and pearl millet. | The entries were last updated in 2010 and do not decide whether the full form `petit millet` is a preferred term. Existing source IDs are already attached to the held grain candidate. |
| **WP02-A6-MILLET-FLOUR-FOLLOWUP-20261012-S10** (reuse proposal source) | Spice Divine, [Farine de petit millet S&V](https://spicedivine.ca/fr/products/sv-little-millet-flour), re-queried 2026-10-13. | Source-observed Canadian French flour title and description naming `kutki`. | This same URL was already reviewed in the October 12 A6 proposal; no duplicate URL/source entry is proposed. Direct fetch was unavailable on the new access. |

## Integration outcome

The existing `candidate-little-millet` was updated with the new AAFC French source and the picker collision as its unresolved reason. The separate `candidate-little-millet-flour` record was added with the Canadian flour evidence. Two formula-specific bread findings were recorded as blocked findings, not general substitution rules. Neither prospective ingredient reference was activated because `petit mil` queries still produce a misleading singleton pair under substring fallback. No recipes, forms, measures, active densities, conversions, yields, or substitutions were added. The broader WP02 A6 review remains open.

## Root integration status

**Integrated.** Both little-millet grain and flour remain unallocated because of the documented `petit mil` / `petit millet` picker boundary. The shared ledger now records the Canadian French evidence, the flour candidate, and the two formula-specific blocked bread findings. See [round-fifteen integration](../batches/wp02-wp03-wp04-round15-gap-review-integration-20261013/README.md). No app or emulator tests were run because the shared changes add database JSON data and documentation.

# WP04 Section P — Northern wolffish / loup à tête large market and picker hold (round 20)

- **Review and source-access date:** 2026-10-13.
- **Status:** Hold accepted and integrated on 2026-10-13; no catalog or ledger row was added.
- **Packet type:** proposal-only identity, bilingual-name, picker, Québec-market, recipe-demand, measurement, and fishery-boundary review.
- **Candidate:** Northern wolffish / loup à tête large (*Anarhichas denticulatus*).
- **Disposition:** **Hold** the prospective identity outside the active catalog and research ledger. Canadian and Québec government sources support a distinct species and the bilingual name pair. The current DFO recovery strategy says Northern Wolffish has no commercial value, unlike Atlantic and spotted wolffish; targeted current Québec retail searches found no product identified as this species; and the 2026 DFO recreational rules prohibit retention in their stated Newfoundland and Labrador scope. These findings do not establish a blanket ban on every possible product or prove that no product is available in Québec. They leave no verified Québec culinary product or recipe that would justify a recipe-ingredient row now.
- **Worktree scope:** this proposal file only. No catalog JSON, research ledger, plan, roadmap, recipe, generated file, test, or other reviewer’s work was changed.

## Distinct open gap and plan location

The live Section P parent checklist remains open at `P Fish shellfish seafood products roe and other regional proteins`, beginning at [`docs/RecipeBook-global-ingredient-catalog-plan.txt:3367`](../../RecipeBook-global-ingredient-catalog-plan.txt#L3563). Its open finfish item names broad fish groups and regional fish; it does not yet have a dedicated Northern-wolffish disposition.

The round-17 spotted-wolffish proposal explicitly says that Atlantic wolffish (*A. lupus*), spotted wolffish (*A. minor*), and Northern wolffish (*A. denticulatus*) are separate species, then considers only *A. minor*. That boundary mention is not a Northern-wolffish review or allocation. The current plan, references, forms, legacy identities, ledger, and proposal/batch archive contain no focused Northern-wolffish decision. The round-18 Yellowmouth Rockfish hold and round-19 Pangasius group review address different taxa and do not resolve this candidate.

This packet addresses only *A. denticulatus*. It does not reopen the active Atlantic- or spotted-wolffish identities, the broader `wolffish` group, fish powders, fish balls, surimi, preserved fish, or any other Section P product boundary.

## Conditional identity and bilingual naming

If future evidence supports a recipe-ingredient identity, the narrow candidate would be:

| Candidate ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| `ingredient-ref-northern-wolffish` | `PROTEIN` | **Northern wolffish** | **loup à tête large** | *Anarhichas denticulatus* | None proposed |

The name pair is supported by the CFIA Fish List and by a Québec Gazette schedule that prints the scientific, French, and English names together. The Canadian COSEWIC status report and a DFO 2025 status assessment distinguish *A. denticulatus* from Atlantic and spotted wolffish. The CFIA result page’s displayed binomial appears as `Anarhicha denticulatus` (missing the final `s`); this review relies on COSEWIC, DFO, and the Québec schedule for the correctly spelled taxon and uses CFIA only for its bilingual fish-list names. The Québec Gazette source is a wildlife-status schedule, not a retail label. No OQLF preferred-term entry for this exact name was located in the searches made; this packet does not present the term as an OQLF ruling or a current commercial name.

The ingredient-reference shape has no taxon field. Do not add the scientific name as an alias or infer a product identity from an unqualified `wolffish`, `loup`, `catfish`, or `poisson-loup` phrase. Do not add `Broadhead Wolffish`, `Bullheaded Wolffish`, `Blue Sea Cat`, `Jelly-Cat`, or the France-specific `loup gélatineux` as aliases: these are alternate names found in biological sources, not a verified Québec consumer/product naming set, and some overlap broader fish wording.

## Québec product and fishery scope

The official Government of Canada recovery-strategy page reports that, historically, Northern Wolffish had no commercial value and was discarded rather than reported, while Atlantic and spotted wolffish had commercial value. It notes occasional Greenland consumption but says the gelatinous flesh was generally not favored. The COSEWIC assessment is dated 2012 and the recovery strategy was updated in 2018; treat those statements as historical biological/market context, not a current market census. They are distinct from product evidence for the adjacent species.

The current DFO 2026 Gulf of St. Lawrence groundfish plan lists Northern Wolffish as Threatened under SARA, Schedule 1. DFO’s 2026 Newfoundland and Labrador recreational groundfish-fishery page prohibits retention of Northern Wolffish within that page’s defined recreational-fishery scope. Neither source by itself establishes the rules for every fishery, a blanket sale or possession prohibition, or the status of a farmed or imported product. No such general legal conclusion is made here.

Targeted searches of current Québec retail sources for `Northern Wolffish` and `loup à tête large` did not locate a product page identifying this species. That is a bounded search result, not evidence that no Québec seller could ever carry it. The CFIA Fish List is fish-labelling name evidence; it does not establish retail availability. No species-specific Québec package, origin, product state, or current culinary use was verified.

## Exact ownership and picker projection

The current snapshot contains **1,346 active references, 98 forms, 64 legacy-import candidates, and 1,659 ledger records**. Exact normalized-key checks covered reference IDs, displays and aliases; form IDs, labels and match terms; legacy candidate IDs and names; and ledger record IDs. No exact owner was found for `Northern wolffish`, `loup à tête large`, *Anarhichas denticulatus*, `broadhead wolffish`, `bullheaded wolffish`, `blue sea cat`, `jelly-cat`, `loup gélatineux`, `poisson-loup`, `ingredient-ref-northern-wolffish`, or `candidate-northern-wolffish`. The exact source-ID prefix proposed for this packet was also unused before drafting.

The picker uses the bilingual reference names, aliases, and attached form terms. It prioritizes complete normalized word phrases, then uses partial matching; it does not search a separate taxon field. The following projection applies only the proposed bilingual displays and no aliases or forms:

| Query | Current picker | With the conditional row | Boundary |
|---|---|---|---|
| `Northern Wolffish` | No result | Northern wolffish / loup à tête large | Qualified English display only. |
| `loup à tête large` | No result | Northern wolffish / loup à tête large | Qualified Québec French display only. |
| `wolffish` | Atlantic wolffish; spotted wolffish | Those two plus Northern wolffish | Broad query stays plural; no species is promoted as its only result. |
| `loup` | Atlantic wolffish; spotted wolffish | Those two plus Northern wolffish | Broad French component stays plural. |
| `catfish` | Brown bullhead; channel catfish | Unchanged | No catfish or `poisson-chat` alias is added. |
| `broadhead wolffish`, `bullheaded wolffish`, `Blue Sea Cat`, `Jelly-Cat`, `loup gélatineux`, `poisson-loup` | No result | No result | Alternate names remain unallocated. |
| `Anarhichas denticulatus` | No result | No result | The scientific name is evidence scope, not a picker alias. |

The proposed display pair would not create a broad-name singleton under the current picker, because its English and French components already return the two active wolffish rows. Picker ambiguity is not the reason for this hold. The unresolved culinary-market evidence and species-at-risk context are the reasons not to turn this biological identity into an active ingredient choice now.

## Bundled recipe demand, measures, and substitutions

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and full recipe JSON text were scanned for the proposed names, *A. denticulatus*, source-listed alternatives, and related broad terms. The manifest-ordered corpus contains **753,792 bytes** and has SHA-256 fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`; the digest hashes each manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order.

**Result: zero matching recipe files and zero matching ingredient-row hits.** There is no recipe link, amount, preparation, serving context, or named Northern-wolffish product to map. Nearby Atlantic wolffish, spotted wolffish, generic seafood, and fish-stock demand is not a species request for *A. denticulatus*.

Health Canada’s Canadian Nutrient File record 3091 is explicitly raw Atlantic wolffish. Its 148.4 g half-fillet, 90 g Food Guide serving, and 73% refuse value are not Northern-wolffish measurements. No species-matched household portion, product package, fillet weight, density, unit mapping, conversion, preparation form, cooking yield, or rehydration yield was identified. Biological size or fishery data are not kitchen quantities. If the identity is reconsidered, keep `defaultDensity` null and `unitMappings` empty absent new evidence.

The bundled global and contextual substitution-rule files currently contain no rules. No source establishes a directed, dish-, role-, or method-scoped replacement involving Northern Wolffish. Add no substitution to Atlantic wolffish, spotted wolffish, cod, or any other fish; do not infer culinary, nutrition, safety, or cooking equivalence from shared family or market wording.

## Source-ID and URL audit

New IDs use `WP04-P-NORTHERN-WOLFFISH-20261013-R20-`; the prefix and the three new IDs below were absent from the live ledger and proposal/batch archive. Exact URL checks across the research ledger and archived proposal/batch Markdown found no exact match for these three new URLs. Exact existing URLs are cited with their existing source IDs rather than receiving duplicate identifiers.

| Source ID | Source and support | Scope and limit |
|---|---|---|
| **New `WP04-P-NORTHERN-WOLFFISH-20261013-R20-S01`** | Government of Canada / COSEWIC, [Northern Wolffish assessment and status report](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/cosewic-assessments-status-reports/northern-wolffish.html), 2012 report, accessed 2026-10-13. | Identifies *Anarhichas denticulatus*, the English/French pair, SARA context, and alternate biological names. The report is dated 2012; it is not current retail evidence or a culinary specification. |
| **Reused `WP04-P-ATLANTIC-WOLFFISH-20261012-S02`** | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). | Lists `Northern Wolffish / Loup à tête large` on the Northern-wolffish row. Canadian fish-label name evidence only; the displayed binomial has the spelling caveat noted above. |
| **New `WP04-P-NORTHERN-WOLFFISH-20261013-R20-S02`** | Québec, [Gazette officielle, Schedule II](https://www.publicationsduquebec.gouv.qc.ca/fileadmin/gazette/pdf_encrypte/gaz_entiere/1550-A.pdf), 2015-12-16. | Prints *Anarhichas denticulatus* — `Loup à tête large` — `Northern wolffish` in the schedule of wildlife species likely to be designated threatened or vulnerable. Bilingual government identity/status context, not a food-market label or current retail source. |
| **Reused `WP04-P-ATLANTIC-WOLFFISH-20261012-S03`** | DFO, [2025 status assessment of Atlantic, spotted, and Northern wolffishes](https://www.dfo-mpo.gc.ca/csas-sccs/Publications/ResDocs-DocRech/2025/2025_037-eng.pdf). | Separates *A. denticulatus* from *A. lupus* and *A. minor* in Canadian Atlantic/Arctic status analysis. It does not establish current Québec product availability or a recipe measure. |
| **Reused `WP04-P-ATLANTIC-WOLFFISH-20261012-S04`** | DFO, [2026 Gulf of St. Lawrence groundfish IFMP](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2026/groundfish-poisson-fond-4rst-3pn-4vn-eng.html). | Current plan table lists Northern Wolffish as Threatened under SARA Schedule 1. Fishery interactions and handling statements are scoped to the named plan; this is not a general product or sale determination. |
| **Reused `WP04-P-ATLANTIC-WOLFFISH-20261012-S07`** | DFO, [Northern and spotted wolffish recovery strategy and Atlantic wolffish management plan](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/recovery/wolffish-northern-spotted-atlantic-strategy-management-plan-2020.html), 2018 update, accessed 2026-10-13. | The plan says Northern Wolffish has no commercial value and distinguishes it from the commercially valuable Atlantic and spotted species. This is historical/contextual evidence, not a current retail survey, all-jurisdiction legal opinion, or safety claim. |
| **New `WP04-P-NORTHERN-WOLFFISH-20261013-R20-S03`** | DFO, [2026 Newfoundland and Labrador recreational groundfish fishery](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-21-eng.html). | Current page prohibits retention of Northern Wolffish in the defined recreational fishery. This does not state commercial-retail rules or apply outside its geographic and recreational scope. |
| **Reused `WP04-P-ATLANTIC-WOLFFISH-20261012-S06`** | Health Canada, [CNF serving sizes, food code 3091](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3091). | Raw Atlantic wolffish only. The listed half-fillet, Food Guide serving, and refuse values are not transferred to Northern Wolffish. |

## Recommendation

Keep `ingredient-ref-northern-wolffish` and `candidate-northern-wolffish` unallocated. Do not add a catalog row, research-ledger candidate, alias, form, measurement, density, conversion, yield, recipe link, or substitution. Reconsider only if a future recipe or a verifiable Québec/Canadian food product names this exact species and establishes the intended culinary product scope. Preserve the species boundary from Atlantic and spotted wolffish and do not treat an unqualified `wolffish` or `loup` product as this taxon.

This is a proposal-only documentation change. No tests or emulator checks were run; no database JSON changed.

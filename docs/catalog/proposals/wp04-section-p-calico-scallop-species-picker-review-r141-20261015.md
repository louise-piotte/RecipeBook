# WP04 Section P — calico scallop species and picker review (R141)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Calico scallop, *Argopecten gibbus* (Linnaeus, 1758); Canadian French commercial term **pétoncle calicot**.
- **Recommendation:** Bounded picker hold; add no active reference or research-ledger record in this proposal.
- **Primary boundary:** A row named `Calico Scallop / pétoncle calicot` would appear as the sole result for those phrases even though CFIA also assigns the French labels `Pétoncle Calicot` and `Peigne Baie De L'Atlantique` to the integrated bay scallop, *A. irradians*. CFIA additionally lists *A. ventricosus* as `Pacific Calico Scallop`, so the current partial-phrase picker would make broad `calico` queries appear species-specific if only *A. gibbus* were added.
- **Market boundary:** Canadian taxonomic and fish-label naming sources support the identity, but the reviewed current Canadian/Québec search did not locate a direct species-specific product listing. An old DFO market report is historical context only.
- **Data boundary:** No names, aliases, forms, measurement values, conversions, recipe links, or substitutions are proposed. No shared catalog, ledger, plan, roadmap, or generated file was changed. No app or Gradle tests were run.

## Candidate selection and ownership

The active Section P checklist leaves shellfish coverage open while scallop identities are already integrated for generic scallop / `pétoncle`, sea scallop / `pétoncle géant`, Icelandic scallop / `pétoncle d’Islande`, bay scallop / `pétoncle de baie`, and dried scallop / `pétoncle séché`. The archive contains no focused Calico scallop decision. R140 mentions *A. gibbus* only to document the CFIA label shared with bay scallop; it does not allocate the identity.

The current bundled package has 1,496 ingredient references and 114 manifest-listed recipes. The candidate ID `ingredient-ref-calico-scallop` and binomials *Argopecten gibbus* / *A. ventricosus* have no current reference, form, or ledger-record owner. No current reference uses `Calico Scallop`, `pétoncle calicot`, `Peigne Baie De L'Atlantique`, or `Pacific Calico Scallop` as a name or alias. The R140 bay-scallop ledger sources mention the shared CFIA labels as evidence, but do not assign them as active aliases. Existing scallop references have no active ingredient forms. Other scallop ledger records contain species- or product-specific observations; none is transferable to *A. gibbus*.

## Identity and Canadian/French naming

ITIS identifies TSN 79734 as species *Argopecten gibbus* (Linnaeus, 1758), with common name “Atlantic calico scallop.” CFIA’s current Fish List query independently associates TSN 79734 with *Argopecten gibbus* and lists English “Calico Scallop.” These sources establish an exact taxon/name association in Canadian and North American nomenclature. [S01, S04]

TERMIUM Plus’s 2023 Translation Bureau terminology record pairs *Argopecten gibbus* with English **calico scallop** and French **pétoncle calicot**; it marks `pétoncle calicot` as a standardized French commercial name and calls `calico scallop` a trade name recommended by the fisheries terminology committee and Fisheries and Oceans Canada. This is the strongest reviewed Québec-useful French label. The targeted OQLF GDT search for `pétoncle calicot`, `calico scallop`, and *Argopecten gibbus* did not surface a species-specific OQLF entry. That search result is a limit on the reviewed sources, not evidence that OQLF has ruled against the term. [S03]

CFIA’s list creates a material picker ambiguity that the terminology record alone does not show. For *A. gibbus*, CFIA lists both `Calico Scallop / Peigne Baie De L'Atlantique` and `Scallop / Pétoncle Calicot`. For *A. irradians*, it separately lists `Bay Scallop / Peigne Baie De L'Atlantique` and a French-only `Pétoncle Calicot` row. Thus both French phrases are attached to two taxa by the same Canadian label list. The CFIA page says the list supplies English and French common names acceptable for Canadian fish labelling; it is not a consumer inventory or proof of a current product listing. [S01–S02]

CFIA also lists *A. ventricosus* under English `Pacific Calico Scallop`. Because the app search matches complete word phrases contained inside longer names and then uses substring fallback, a proposed `Calico Scallop` or `Atlantic calico scallop` term would also match a future `Pacific Calico Scallop` reference. Until both calico taxa are accounted for, `calico` and `calico scallop` would be a misleading singleton if only *A. gibbus* were represented. [S01]

## Exact picker projection

Projection follows `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: accent-folded word phrases match inside longer terms; substring fallback applies when no complete phrase matches. Current values below are direct results from the live reference and form JSON. The proposal projection assumes the smallest plausible addition, one *A. gibbus* row with `Calico Scallop / pétoncle calicot` as its display names and the English qualifier as an alias. No shared French labels are silently placed on that one row.

| Query | Current results | With an *A. gibbus*-only row | Assessment |
|---|---:|---:|---|
| `scallop` / `pétoncle` | 5 / 5 | 6 / 6 | Remains broad and multi-result. |
| `calico` | 0 | 1 | False singleton risk: CFIA also names *A. ventricosus* `Pacific Calico Scallop`. |
| `calico scallop` | 0 | 1 | Would hide the CFIA-listed Pacific calico taxon until it has a reference. |
| `Atlantic calico scallop` | 0 | 1 | Exact qualified name maps to *A. gibbus*, but search also accepts the shorter contained phrase `calico scallop`; qualification does not fix the broad query. |
| `Pacific Calico Scallop` | 0 | 0 | *A. ventricosus* has no active reference; adding only *A. gibbus* would not make this sibling product findable. |
| `pétoncle calicot` | 0 | 1 if assigned only to *A. gibbus* | False singleton: CFIA also lists this French name for *A. irradians*. |
| `peigne baie de l’Atlantique` | 0 | 1 if assigned only to *A. gibbus* | False singleton: CFIA uses this French name for both *A. gibbus* and *A. irradians*. |
| `pétoncle de baie` | 1 | 1 | Existing bay-scallop identity remains distinct. |

The two French labels could be represented without a false singleton only if each is attached to both known CFIA taxa: in that projection, `pétoncle calicot` and `peigne baie de l’Atlantique` each return two references; if either label is attached only to *A. gibbus*, it returns one. That limited repair would still leave the `calico` / `calico scallop` search family resolving to the *A. gibbus* row alone while CFIA has a second, currently unrepresented calico species. Do not add the shared labels to only one row, and do not use the binomial as a searchable qualifier: the reference schema has no separate taxon qualifier field.

## Canadian/Québec product evidence and availability

The reviewed current web searches used the binomial, `Calico Scallop`, `pétoncle calicot`, Canada/Québec, and retailer/supplier wording. They found CFIA and terminology records but no direct current Canadian or Québec retailer/supplier SKU that explicitly names *A. gibbus*. A current Canadian frozen-seafood directory lists a `Pacific Calico Scallop` variety as *A. ventricosus*, but it is an aggregated variety list rather than an *A. gibbus* product listing. [S06] This is a bounded search result, not proof that no Canadian seller carries the product. Do not infer present availability or local harvest from nomenclature records alone.

DFO’s 1989 *Scallop Market Outlook* has a `Pétoncle calico` section. It says the United States was the only producer of calico scallop at the time, describes it as occurring in the southeastern United States, and reports a 150–200 count-per-pound range and fresh supermarket sales in that historical market. The report predates current retail channels by decades and does not identify *A. gibbus* by binomial in the cited section; it does not support current Canadian availability, a current package specification, or a transferable recipe measure. [S05]

## Forms, numeric evidence, demand, and substitutions

No current *A. gibbus*-specific consumer product listing was found from which to establish fresh, frozen, IQF, shucked, or other supported forms. Existing scallop references have no active forms. The historic DFO 150–200 count/lb statement is preserved here only as historical fishery-market context, not an active measurement observation; it is not sufficiently current or product-specific for a default count mapping, density, unit conversion, package yield, or cooking yield. Other scallop species’ numeric observations are not transferable.

The manifest lists 114 recipe files. The scan examined only each ingredient row’s `ingredientName` and `originalText` fields across 1,123 rows; it did not count recipe titles, descriptions, instructions, or tags as ingredient demand. Terms covered `calico`, `calico scallop`, `Atlantic calico scallop`, `pétoncle calicot`, `peigne baie de l’Atlantique`, `Argopecten gibbus`, and broad scallop terms.

**Result: zero matching recipe files and zero matching ingredient rows.** No recipe link or recipe-specific substitution can be researched from the bundle. No reviewed source supports a *gibbus*-specific substitute or ratio. Add no form, measurement, conversion, yield, substitution rule, or recipe-line link.

## Recommendation and bounded reopening criteria

Keep *Argopecten gibbus* outside active references and the research ledger for now. The taxon and its Canadian English/French commercial terms are clear, but the picker would turn a broader English `calico` name family into a singleton, and either shared French CFIA label would be misleading if assigned to just one species. The reviewed current market search also did not confirm a species-specific Canadian/Québec product listing, and the bundle has no ingredient demand.

Reopen after the picker can represent the calico name family without hiding *A. ventricosus*—for example, after both *A. gibbus* and *A. ventricosus* have reviewed identities or query matching can distinguish exact qualified terms from contained phrases—and after shared French CFIA labels are assigned to both *A. gibbus* and *A. irradians* so those queries return both taxa. If reopened, recheck current Canadian/Québec product listings and retain the 1989 count-per-pound figure as historical only.

**Exact proposed JSON delta: none.** No reference, ledger record, source record, form, measure, alias, conversion, or substitution is proposed by R141.

## Source register

| ID | Direct source | Exact evidence and limit |
|---|---|---|
| S01 | [CFIA Fish List search results for “scallop”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=scallop) | Current query output: *A. gibbus* rows `Calico Scallop / Peigne Baie De L'Atlantique` and `Scallop / Pétoncle Calicot`; *A. irradians* rows include `Bay Scallop / Peigne Baie De L'Atlantique` and French-only `Pétoncle Calicot`; *A. ventricosus* is listed as `Pacific Calico Scallop`. Fish-label terms, not proof of current product availability. |
| S02 | [CFIA Fish List description](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Says the list provides English and French common names acceptable in Canada for fish labelling, plus scientific names and TSNs. It does not promise retail stock. |
| S03 | [TERMIUM Plus, calico scallop / pétoncle calicot (2023 record)](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frb&lang=eng&srchtxt=CALICOT) | Record associates *Argopecten gibbus* and synonym *Aequipecten gibbus* with `calico scallop` and standardized French `pétoncle calicot`; it describes the English term as a trade name recommended by the fisheries terminology committee and DFO. Terminology evidence; CFIA separately applies that French label to *A. irradians*. |
| S04 | [ITIS, TSN 79734 report for *Argopecten gibbus*](https://www.itis.gov/servlet/SingleRpt/SingleRpt?print_version=PRT&search_topic=TSN&search_value=79734&source=to_print) | Identifies species *Argopecten gibbus* (Linnaeus, 1758) and common name “Atlantic calico scallop.” Taxonomic/name evidence, not a current retail listing. |
| S05 | [DFO, *Scallop Market Outlook*, Economic and Commercial Analysis Report No. 12 (1989)](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/111827.pdf) | Historical p. 13 discusses `Pétoncle calico`, U.S. production, 150–200 count/lb, and fresh supermarket sales. It predates the current market and does not itself name *A. gibbus* by binomial in that section. |
| S06 | [Tridge, Canada frozen-scallop product directory](https://dir.tridge.com/products/product-country/scallop-canada) | Current directory lists `Pacific Calico Scallop (=Argopecten ventricosus)` as a Canada product variety. It is not a direct SKU or evidence of a current *A. gibbus* listing. |

## Static review record

- Re-read the active Section P checklist, current reference catalog, forms, legacy-import identities, ledger, roadmap, and relevant proposal/batch archive before selecting the candidate.
- Checked reference, form, legacy, and ledger ownership for the candidate ID, names, aliases, and binomials; no existing owner or focused decision was found.
- Projected picker behavior using live JSON terms and the source-code phrase/substr matching behavior; identified the shared French labels and the missing Pacific-calico sibling as singleton risks.
- Scanned manifest-listed recipe ingredient `ingredientName` and `originalText` fields only: 114 files and 1,123 rows; no scallop/calico match.
- No shared catalog, ledger, plan, roadmap, batch README, or generated file was edited. No tests were run; this is proposal-only work.

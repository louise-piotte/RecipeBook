# WP04 Section P — Pacific calico scallop identity and product boundary (R142)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Pacific calico scallop, *Argopecten ventricosus* (G. B. Sowerby II, 1842); FAO French name **pétoncle volant**.
- **Recommendation:** Bounded picker and Québec-market hold. Add no active reference, form, alias, ledger record, source record, or recipe link.
- **Primary boundary:** A single *A. ventricosus* row named `Pacific calico scallop / pétoncle volant` would make broad English `calico` and `calico scallop` searches singletons while the distinct, already reviewed *A. gibbus* / Calico scallop remains held. CFIA also gives *A. ventricosus* only broad French names (`Peigne`, `Pétoncle`); the exact French pair `pétoncle volant` is supported by FAO nomenclature, but no Québec-specific product terminology entry or direct Canadian/Québec SKU was located.
- **Market boundary:** A current U.S. supplier page pairs Magdalena Bay scallops with *A. ventricosus* and describes them as hand-shucked and flash-frozen. A Canadian-facing frozen-scallop directory includes the taxon in its variety list but does not connect it to a Canadian supplier SKU. This is not evidence that the species is absent from Canadian imports or retail; local harvest and market availability are separate questions.
- **Data boundary:** No names, aliases, forms, measures, conversions, recipe links, yields, or substitutions are proposed. No shared catalog, ledger, plan, roadmap, batch README, or generated file was changed. No tests were run.

## Candidate selection and ownership

The active Section P checklist leaves “mussel, clam, oyster, cockle, and remaining shellfish identities” open and records scallop as a continuing species/product review area. Generic scallop, sea scallop, Icelandic scallop, bay scallop, and dried scallop are already represented. R141 is a separate decision on *Argopecten gibbus*: it held that taxon because its CFIA French names overlap with *A. irradians* and because a lone English calico row would hide the recognized *A. ventricosus* name family. R142 reviews the distinct *A. ventricosus* taxon as that next open sibling gap; it does not repeat the *A. gibbus* disposition. See the [R141 Calico scallop proposal](wp04-section-p-calico-scallop-species-picker-review-r141-20261015.md).

The current package has 1,498 ingredient references, 115 forms, 114 manifest-listed recipes, and 1,123 ingredient rows. The proposed ID `ingredient-ref-pacific-calico-scallop`, binomial *Argopecten ventricosus*, English `Pacific calico scallop`, and French `pétoncle volant` have no active reference, form, legacy-import identity, or ingredient-reference ledger record owner. Existing R140 bay-scallop ledger evidence mentions the CFIA shared names for *A. gibbus* and *A. irradians* but does not allocate them as aliases. The R141 proposal mentions *A. ventricosus* only as the unrepresented sibling name; it does not provide a focused disposition for this taxon. No active ingredient form is attached to the existing scallop references. [R140, R141]

## Identity and Canadian / Québec naming

ITIS TSN 567241 records *Argopecten ventricosus* as a valid species and gives the English common name “Pacific calico scallop.” CFIA’s Fish List query returns that same TSN and scientific name with English `Pacific Calico Scallop`; its French-name rows for this taxon are `Peigne` and `Pétoncle`, without a species qualifier. CFIA describes its list as acceptable English and French common names for Canadian fish labelling, paired with scientific names and TSNs. These are naming and label sources, not proof that a Canadian shop currently stocks this species. [S01–S03]

FAO’s scallop production table pairs **Pacific calico scallop / Pétoncle volant / Peine volador / *Argopecten ventricosus*** in the same row. The row reports Mexican production over the 2002–2011 reporting period; that historical production context is not evidence of present Canadian sales. FAO supports `pétoncle volant` as a French species name internationally, but the source does not establish it as a preferred Québec market term. [S04]

The OQLF GDT entry identifies normalized Québec French `pétoncle` as the broad edible-fish term and translates it as `scallop`; its note says Québec catches comprise *Chlamys islandica* (`pétoncle d’Islande`) and *Placopecten magellanicus* (`pétoncle géant`). The entry is generic and was last updated in 1998; it does not include *A. ventricosus* or validate `pétoncle volant` as a Québec product name. A targeted OQLF search for the binomial and `pétoncle volant` did not surface a species-specific record. That is a bounded search result, not a ruling against the FAO term. [S05]

Do not use CFIA’s `Peigne` or `Pétoncle` as a species-only alias. The same list uses those generic French names for multiple scallop taxa; placing one on this row would make an otherwise broad query look species-specific. Do not use `pétoncle calicot` or `peigne baie de l’Atlantique` for this candidate: CFIA associates those French labels with *A. gibbus* and *A. irradians*, not *A. ventricosus*. Do not use `Mexican bay scallop`, `Catarina`, or `Magdalena Bay scallop` as Québec-facing aliases: the reviewed product references use those names outside Québec, and the generic `bay scallop` phrase already finds the active *A. irradians* reference. [S02, S04, S06]

## Canadian and Québec product evidence

The direct supplier page for Northern Wind Seafood names its Magdalena Bay Scallops as *Argopecten ventricosus*, describes them as diver-caught, hand-shucked, and flash-frozen, and lists a Massachusetts address. It is current product evidence from a U.S. supplier, not a Canadian or Québec retailer listing. It supplies no retail package weight, item count, serving amount, or reusable kitchen measure. [S06]

Tridge’s current Canada frozen-scallop directory has 37 general results and lists `Pacific Calico Scallop (=Argopecten ventricosus)` among the category’s popular varieties. Its displayed Canadian supplier listings identify scallop products at broader levels and do not associate *A. ventricosus* with a specific Canadian supplier or SKU. This is a Canadian-facing directory mention, not direct evidence of a current species-specific Canadian product. No direct Québec seller page pairing this binomial with a consumer product was found in the targeted search. Do not treat the lack of a direct listing as proof that the species is unavailable for import or sale. [S07]

Accordingly, the evidence supports a real edible scallop identity and a U.S.-market frozen/shucked product, but not a sufficiently local bilingual product identity for the Québec-focused catalog. There is no finding about a Canadian harvest prohibition or present retail availability; neither is inferred from the other.

## Exact picker projection

Projection follows `IngredientReferenceSearchIndex` in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): a normalized query matches a complete word phrase contained within a longer display name or alias, then uses substring fallback when there is no phrase match. Current results below were calculated from the live reference and form JSON using those matching rules. The hypothetical row uses only the potential paired displays `Pacific calico scallop / pétoncle volant`; it does not add `Peigne`, `Pétoncle`, `pétoncle calicot`, `bay scallop`, a binomial, or a regional product name as an alias.

| Query | Current results | With a ventricosus-only row | Assessment |
|---|---:|---:|---|
| `scallop` | 5 | 6 | Remains a broad multi-result query. |
| `calico` | 0 | 1 | Misleading singleton: CFIA also identifies *A. gibbus* as Calico scallop, and R141 keeps it held. |
| `calico scallop` | 0 | 1 | Same contained phrase and same unresolved sibling. |
| `Pacific Calico Scallop` | 0 | 1 | Correctly identifies the exact candidate, but the current picker cannot stop the shorter `calico` phrase from returning it alone. |
| `pétoncle` | 5 | 6 | Remains a broad multi-result query. |
| `pétoncle volant` | 0 | 1 | Would be specific, but the reviewed support is international FAO terminology rather than a Québec product term. |
| `Pétoncle calicot` | 0 | 0 | Excluded; CFIA applies this to *A. gibbus* and *A. irradians*. |
| `Peigne Baie de l’Atlantique` | 0 | 0 | Excluded; CFIA applies this to *A. gibbus* and *A. irradians*. |
| `Peigne` | 0 | 0 | Excluded; CFIA’s French name is generic and not safe as a single-row alias. |
| `bay scallop` | 1 | 1 | Existing *A. irradians* result remains; no unqualified “bay scallop” alias is proposed. |

Adding both *A. gibbus* and *A. ventricosus* later would make `calico` and `calico scallop` return two identities, but that would be a coordinated two-taxon decision rather than an *A. ventricosus*-only addition. The shared CFIA French labels would still need to be assigned to all supported taxa so that `Pétoncle calicot` and `Peigne Baie de l’Atlantique` do not become false singletons. The app has no separate taxon-qualifier field; a longer display name cannot prevent a contained shorter query from matching it.

## Forms, measurements, demand, and substitutions

The U.S. supplier source supports a species-named product that is hand-shucked and flash-frozen. Those are product-state observations, not grounds to add a reusable form while the identity is held. No reviewed Canadian or Québec listing supplies a species-specific package amount or count. The supplier page supplies no reusable numeric value. Other scallop entries’ measures are species- or SKU-specific and are not transferable to *A. ventricosus*. Add no density, unit mapping, count-to-mass mapping, package conversion, cooking yield, or recipe quantity. [S06–S07]

The manifest lists 114 recipe files. The full corpus scan read every manifest-listed file and examined every ingredient row’s `ingredientName` and `originalText` fields: 114 files and 1,123 rows. It searched for *A. ventricosus*, reviewed older/alternate strings including *Argopecten aequisulcatus* and *A. circularis*, `Pacific calico scallop`, `calico scallop`, `pétoncle volant`, `pétoncle calicot`, `Catarina`, `Mexican bay scallop`, `Magdalena Bay scallop`, and broad `scallop`, `pétoncle`, and `peigne` terms. Recipe titles, descriptions, instructions, and tags were not counted as ingredient demand.

**Result: zero matching ingredient rows and zero matching recipe files.** No bundle-linked recipe substitution can be researched. No reviewed source supports a species-specific substitute, conversion ratio, or contextual replacement. Keep *A. ventricosus* separate from bay scallop (*A. irradians*) unless a source explicitly authorizes a dish- and method-scoped substitution; none was found. Add no substitution, recipe link, or form-to-form conversion.

## Recommendation and bounded reopening criteria

Keep *Argopecten ventricosus* outside active references and the research ledger for now. The scientific identity and English common name are clear, and a U.S. supplier provides direct species-specific frozen-product evidence. A lone row would nevertheless turn the broad `calico` name family into a false singleton while *A. gibbus* remains unrepresented. The strongest exact French pair reviewed is international `pétoncle volant`; CFIA’s Canadian French labels are generic, and OQLF does not resolve the species to a Québec retail term. The Canadian-focused directory does not identify a species-specific Canadian product, and the recipe bundle has no demand.

Reopen after a coordinated calico-name review can represent *A. gibbus* and *A. ventricosus* without making `calico` or `calico scallop` misleading singletons; after the shared CFIA French names are assigned consistently to all taxa that carry them; and after a Québec-suitable French display and a current Canadian/Québec product source are established. If reconsidered, keep any product-specific frozen/shucked state and package quantity separate from generic measurements.

**Exact proposed JSON delta: none.** R142 adds no reference, alias, form, ledger record, source record, measure, conversion, yield, recipe link, or substitution.

## Source register

| ID | Direct source | Evidence and limits |
|---|---|---|
| S01 | [ITIS, TSN 567241, *Argopecten ventricosus*](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=567241) | Records species rank, current standing `valid`, and common name `Pacific calico scallop`. Taxonomy/common-name source, not retail availability. |
| S02 | [CFIA Fish List results for `scallop`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=scallop) | Query checked 2026-10-15; the displayed list (modified 2023-09-18) gives TSN 567241, *A. ventricosus*, English `Pacific Calico Scallop`, French `Peigne`, and a second row with French `Pétoncle`. It also gives shared `Pétoncle Calicot` / `Peigne Baie De L’Atlantique` labels for *A. gibbus* and *A. irradians*. Fish-label names, not product listings. |
| S03 | [CFIA Fish List description](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | States that the Fish List supplies acceptable Canadian English and French fish-label common names and scientific names/TSNs; says “No French name specified” when none is found in its references. It explains the naming scope, not consumer availability. |
| S04 | [FAO, *Capture production by species*, B-55, 2011 yearbook](https://www.fao.org/fishery/docs/CDrom/CD_yearbook_2011/root/capture/b55.pdf) | p. 0, lines 60–63: pairs `Pacific calico scallop`, `Pétoncle volant`, `Peine volador`, and *Argopecten ventricosus*; the reported catch is Mexico, for 2002–2011. Historical international fisheries nomenclature and production, not current Canadian trade. |
| S05 | [OQLF GDT, `pétoncle`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199064/petoncle) | Last updated 1998; gives normalized Québec term `pétoncle`, English `scallop`, Latin `Pectinidae`, and describes Québec catches as *C. islandica* and *P. magellanicus*. Does not name *A. ventricosus* or reject the FAO term. |
| S06 | [Northern Wind Seafood, Magdalena Bay Scallops](https://www.northernwind.com/magdalena-bay-scallops/) | Product page identifies *A. ventricosus*, says diver-caught, hand-shucked, and flash-frozen, and lists a Massachusetts company address. Direct species-specific supplier evidence outside Canada; no package weight or item count. |
| S07 | [Tridge, Canada frozen scallop directory](https://dir.tridge.com/products/product-country/scallop-canada) | Current directory reports 37 broad results and lists Pacific Calico Scallop (= *A. ventricosus*) in its popular variety menu. Displayed Canadian supplier products are not tied to this species. Directory-level Canada context, not a species-specific Canadian SKU. |
| S08 | [U.S. FDA Seafood List, *Argopecten ventricosus*](https://hfpappexternal.fda.gov/scripts/Fdcc/index.cfm?id=Argopecten_ventricosus&set=SeafoodList) | Gives the U.S. acceptable market names `Scallop, Calico`, common name `Pacific Calico Scallop`, and states *A. aequisulcatus* is a junior synonym. U.S. regulatory naming only; used to include the alternate spelling in the corpus scan, not as Canadian label authority. |
| S09 | [Fisheries and Oceans Canada, Trematode Metacercariae of Scallops](https://www.dfo-mpo.gc.ca/science/aah-saa/diseases-maladies/tremetsc-eng.html) | DFO's 2003 disease synopsis cites a paper using `catarina scallop Argopecten ventricosus (circularis)` in its title. This supports including the older printed string in the recall scan only; it is not used to resolve synonymy, Canadian harvest status, or retail availability. |

## Static review record

- Re-read `AGENTS.md`, `Requirements.md`, the active Section P plan and roadmap, live references/forms, legacy-import identities, research ledger, and the R140/R141 proposal and batch archive.
- Confirmed the proposed ID, taxon, English/French phrases, and known variant strings have no active reference/form/legacy owner or ingredient-reference ledger owner.
- Projected current and candidate-only query counts using the live JSON and the phrase/substring rules in `IngredientSearch.kt`; broad `calico` remains a false singleton if only *A. ventricosus* is represented.
- Scanned every manifest-listed recipe file’s ingredient `ingredientName` and `originalText` fields only: 114 files, 1,123 rows, zero candidate matches.
- No shared JSON, ledger, plan, roadmap, index, batch README, or other generated file was edited. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run; this is proposal-only and the project rule exempts database-JSON-only changes from testing.

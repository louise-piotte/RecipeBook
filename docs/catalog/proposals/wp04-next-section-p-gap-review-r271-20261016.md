# WP04 Section P — horse-clam species-pair gap review (R271)

- **Review and source-access date:** 2026-10-16.
- **Selected unfinished candidate:** the paired horse-clam taxa, *Tresus capax* and *Tresus nuttallii*.
- **Recommendation:** Hold both species rows outside active references, forms, legacy mappings, and the research ledger until Québec food terminology can distinguish the taxa without misdirecting a broad search.
- **Status:** Proposal-only. No shared catalog JSON, ledger, checklist, roadmap, generated index, recipe, or app file changed.
- **Proposed integration batch path:** **docs/catalog/batches/wp04-section-p-horse-clam-species-pair-picker-hold-integration-r271-20261016/README.md** (proposed path only; not created).

## Why this is an unfinished bounded gap

The live Section P checklist still leaves **mussel, clam, oyster, cockle, and remaining shellfish identities** open at [the Section P item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6244). This review selects one bounded pair within that open shellfish scope: the two west-coast horse-clam species. It does not reopen the held generic clam candidate or any previously reviewed clam species or products.

A focused audit across active references, forms, legacy import identities, the research ledger, and archived proposals/batches found no exact owner or focused review for *Tresus capax*, *T. nuttallii*, horse clam, gaper, fat gaper, Pacific gaper, or their Québec French terms. The nearby [R143 Atlantic surf-clam review](wp04-section-p-atlantic-surf-clam-picker-boundary-review-r143-20261015.md) concerns *Spisula solidissima*. The [R207 dried-mussel review](wp04-section-p-next-shellfish-gap-review-r207-20261016.md) concerns a species-neutral prepared product. The [R260 grass-carp review](wp04-section-p-next-gap-review-r260-20261016.md) and [R268 salmon-fillets review](wp04-next-section-p-gap-review-r268-20261016.md) are unrelated fish reviews and are not reopened here. The completed salmon-species and salmon-product decisions remain outside this shellfish scope.

The bundle has no horse-clam ingredient demand. This packet is an identity and picker-boundary review only; it proposes no recipe link or product-state row.

## Identity and bilingual naming evidence

The English species distinction is well supported. Fisheries and Oceans Canada (DFO) describes two horse-clam species, also called gaper clams: *T. capax* and *T. nuttallii*. A 2023 DFO table distinguishes **Horse Clam/Fat Gaper** for *T. capax* from **Horse Clam/Pacific Gaper** for *T. nuttallii*. WoRMS lists both scientific names as accepted species. [S01–S03]

The Canadian Food Inspection Agency Fish List gives *T. capax* the entries **Clam / Fausse-mactre** and **Horse Clam**. For the second species, it displays **Tresus nuttalli** (one final “i”) with **Horse Clam** and **Clam**, without a French common name. DFO and WoRMS use the accepted spelling *T. nuttallii*. Treat the CFIA spelling difference as a source-level nomenclature discrepancy to document, not as evidence for a third species. The Fish List is Canadian fish-labelling terminology; its generic “Clam” rows do not establish a RecipeBook alias policy. [S04–S05]

A provisional pair, if the French-name boundary is resolved, would be **fat gaper / fausse-mactre** for *T. capax* and **Pacific gaper / fausse-mactre du Pacifique** for *T. nuttallii*. The English displays are source-attested. The French pair is not equally established for whole edible animals:

- DFO's French conservation report uses **Fausse-mactre** for both *T. capax* and *T. nuttallii*. DFO's current French sport-identification page labels *T. capax* **Fausse-mactre** and says it is often confused with geoduck; that morphology note is not a food-name distinction or substitution statement. [S06, S09]
- The OQLF's 1993 **mactre du Pacifique** entry is in zoology/malacology and edible-mollusc domains, but its note uses the historical combination *Tresus nuttali capax*. The current WoRMS record lists *Schizothaerus nuttallii capax* as a superseded combination under accepted *T. capax*. This makes the old OQLF note relevant to *T. capax*, but its date and historical taxonomy leave the intended whole-food scope uncertain. [S05, S07]
- OQLF also uses **fausse mactre du Pacifique (Tresus nuttalli)** in its **siphon** entry. That entry explicitly describes a commercializable anatomical part. It is evidence for a Québec name attached to the siphon of *T. nuttallii*, not by itself a current culinary or retail name for the whole animal. [S08]

No current Québec consumer, fish-market, or recipe source was found in this review that distinguishes both whole-animal taxa with a stable French pair. This is the main reason to keep both rows held pending a better scoped term or an exact product/recipe target.

## Conditional picker projection and generic-clam boundary

For a static projection only, I modeled the provisional displays above and shared English terms **horse clam(s)**, **gaper**, and **gaper clam(s)** on both species. I modeled **mactre du Pacifique** as a provisional *T. capax* synonym based on the historical OQLF entry. These are hypothetical terms, not proposed active aliases. The projection follows the current phrase-first, accent- and punctuation-normalizing behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Query | Current result | Conditional pair projection | Review |
|---|---:|---:|---|
| horse clam, horse clams, gaper, gaper clam, clam, or mactre | 0 | 2 candidate species | These broad terms select only the pair in the current baseline, while other clam identities and the generic clam candidate remain unrepresented. |
| mactre du Pacifique | 0 | 2 candidate species if the historical OQLF term is retained on *T. capax* | Without that provisional synonym, the query would select only the sibling display containing “mactre du Pacifique”; that could misstate the old OQLF scope. |
| fausse-mactre | 0 | 2 candidate species | Consistent with the French DFO report applying this name to both taxa, but does not distinguish them. |
| fat gaper / Pacific gaper | 0 / 0 | 1 species each | English source names separate the two taxa. |
| horse | 1: existing horse gram | 3 total | The proposed shared horse-clam terms would add two choices beside the unrelated horse-gram reference. |

The current **ingredient-ref-clam** ledger candidate remains **needs_clarification**; its decision holds unqualified clam pending a product or recipe target because Québec terminology distinguishes multiple species. Do not change that candidate. Do not add **clam**, **clams**, **fausse-mactre**, or **mactre** as a generic one-row alias. Even though the hypothetical species pair avoids a singleton result, a broad clam query would expose only these two horse-clam species in the current baseline. The corpus supplies no target requiring that incomplete broad-scope result.

## Measurements and substitutions

Health Canada's online CNF entry 3111 is **Mollusks, clam, mixed species, boiled or steamed**. It lists measures such as 100 ml = 63.4 g, one large clam = 12 g, and 85% total refuse. These values are for a generic mixed-species cooked/steamed food; they are not horse-clam evidence and must not be copied to either candidate. The targeted online CNF search did not surface a species-specific horse-clam entry. Health Canada now publishes the 2026 CNF as relational CSV files and describes the older online interface as an interim 2015 access path. A raw 2026 CSV retry is documented as blocked in the adjacent [R270 review](wp03-next-section-f-gap-review-r270-20261016.md); this packet makes no inference from the unavailable file and does not claim that the 2026 CNF has no horse-clam data. [S10–S11, R02]

No density, volume conversion, count-to-mass mapping, edible-yield estimate, cooked yield, package measure, or default serving is proposed. DFO's statement that horse clams may be confused with geoduck describes harvest/identification context, not a culinary replacement. No source reviewed here establishes interchangeability between the two *Tresus* species or between horse clams and geoduck or another clam. Add no global/contextual substitution rule or recipe-line substitution link.

## Ownership and corpus audit

The read-only snapshot contained **1,656 active references**, **125 forms**, **61 legacy import candidates**, and **2,004 research-ledger records**. Exact candidate terms were checked against bilingual reference names/aliases, form labels/match terms, legacy identities, ledger record IDs, and archived proposals/batches. No candidate-specific owner was found. The only directly related ledger allocation is the held generic **ingredient-ref-clam** candidate described above. The R271 source-ID prefix was unused before this packet; all IDs in its source register are proposal-local and are not ledger allocations.

A manifest-ordered scan covered all **114 recipe files** and **1,123 structured ingredient rows**. It searched the complete recipe JSON text and the structured ingredient name/original-text fields for horse clam, gaper, both taxa, and the scoped French terms. Result: **zero matching recipe files and zero matching ingredient rows**. No ingredient link, quantity, form, or preparation is supported by the bundle. [R01]

## Reopen conditions and disposition

Reopen this pair when a current Québec source or exact target product/recipe supports the French naming of both whole-animal species and the broad clam search can present an adequate scope. Until then, hold both prospective references outside the active catalog, forms, legacy mappings, and ledger. Keep the generic clam decision unchanged.

If reopened, the candidate IDs **ingredient-ref-fat-gaper** and **ingredient-ref-pacific-gaper** are illustrative only, not reserved. Begin with identity-only species rows and recheck every proposed alias against the generic-clam boundary. Do not add forms, default measures, conversions, yields, package values, recipe links, substitutions, or a species-neutral horse-clam row from this evidence.

## Source register

Sources were accessed on 2026-10-16. Source IDs below are local to this proposal and do not create ledger entries.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S01** | DFO, [Pacific Region Integrated Fisheries Management Plan, geoduck and horse clam, 2023–24](https://publications.gc.ca/collections/collection_2023/mpo-dfo/Fs143-3-22-2223-eng.pdf), horse-clam biological synopsis. | Identifies two horse-clam species, also called gaper clams: *T. capax* and *T. nuttallii*. Fisheries biology, not Québec consumer terminology or a recipe source. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S02** | DFO, [Pacific estuary assessment, 2023](https://publications.gc.ca/collections/collection_2024/mpo-dfo/fs70-6/Fs70-6-2023-039-eng.pdf), Appendix Table A.2. | Pairs Horse Clam/Fat Gaper with *T. capax* and Horse Clam/Pacific Gaper with *T. nuttallii*. Ecological species nomenclature, not market-label evidence. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S03** | World Register of Marine Species / MolluscaBase, [*Tresus capax*](https://www.marinespecies.org/aphia.php?id=367776&p=taxdetails) and [*Tresus nuttallii*](https://www.marinespecies.org/aphia.php?id=505780&p=taxdetails), taxon details. | Both are listed as accepted species; the *T. capax* entry lists historical *Schizothaerus nuttallii capax* combinations as superseded. Taxonomic crosswalk only; not food names. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S04** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSNs 80955 and 568382. | Shows the Canadian label common names for *T. capax* and *T. nuttalli*, including different French coverage and the one-“i” spelling in the second row. Label-name evidence does not define recipe aliases. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S05** | DFO, [Cadre d’identification des priorités en matière de conservation écologique, French report](https://publications.gc.ca/collections/collection_2019/mpo-dfo/fs70-5/Fs70-5-2018-055-fra.pdf), species table. | Uses Fausse-mactre for both *T. capax* and *T. nuttallii*. Supports the French overlap; conservation nomenclature is not a Québec consumer label. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S06** | DFO, [French sport fishing identification guide](https://www.pac.dfo-mpo.gc.ca/fm-gp/rec/identify-identifier-fra.html), Fausse-mactre. | Identifies *T. capax* as Fausse-mactre and notes confusion with geoduck in identification. Morphology and fishing guidance do not establish a culinary substitute. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S07** | OQLF, [mactre du Pacifique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17017503/mactre-du-pacifique). | Preferred term in zoology/malacology and edible-mollusc domains; updated 1993; note refers to the historical combination *Tresus nuttali capax* and says Pacific-coast *Tresus* are food. The old taxonomic wording is not adopted as a settled modern consumer label. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S08** | OQLF, [siphon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199061/siphon). | Names *Tresus nuttalli* as an example species whose siphon is commercializable. Anatomy/product-part scope; not evidence for a whole-animal recipe identity. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S09** | DFO, [Integrated Fisheries Management Plan summary: geoduck and horse clam, 2026–27](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/geoduck-panope-ifmp-pgip-sm-fra.html). | Current commercial-management context for geoduck and horse clam; states the fishery's products are marketed mainly in China. It does not establish Québec availability, a species-specific French food label, recipe use, or substitution. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S10** | Health Canada, [CNF serving entry 3111](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3111). | Mixed-species cooked/steamed clam entry and its serving measures. Explicitly not species-specific horse-clam evidence; no listed value is proposed for these candidates. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-S11** | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Confirms the 2026 relational-file publication and explains the older 2015 online interface is interim. This proposal did not retrieve or inspect the 2026 raw CSVs. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-R01** | Read-only audit of the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6244), active references/forms, legacy identities, research ledger, manifest-listed recipes, proposal/batch archive, and [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Confirms no focused prior owner, no recipe demand, current counts, held generic-clam scope, source-ID prefix, and conditional picker projection. No shared files changed. |
| **WP04-SECTIONP-HORSE-CLAM-PAIR-R271-20261016-R02** | [WP03 R270 CNF recovery review](wp03-next-section-f-gap-review-r270-20261016.md). | Records the neighboring attempt to retrieve raw CNF 2026 CSV data as blocked; cited here only to avoid inference from unavailable measurement data. |

## Static review record

- Read the live Section P plan item, active split seed-package reference/form files, legacy import identities, research ledger, and relevant nearby clam and recent Section P proposals.
- Checked exact candidate terms and illustrative IDs against current ownership and archive records; checked that the R271 source-ID prefix was unused.
- Reproduced the picker projection from its current Kotlin phrase-first behavior against the active reference snapshot and the two hypothetical species rows.
- Scanned the 114 manifest-listed recipes and 1,123 ingredient rows; found no horse-clam demand.
- No test, build, emulator, deployment, integration, or shared catalog change was performed. This is a documentation-only proposal, and the current AGENTS.md rule exempts database-JSON-only data additions from testing in any case.


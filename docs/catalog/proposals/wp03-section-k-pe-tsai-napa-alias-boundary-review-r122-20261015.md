# WP03 Section K pe-tsai and Napa cabbage alias-boundary review (R122)

- **Reviewed:** 2026-10-15
- **Review slot:** R122
- **Status:** Documentation-only hold integrated on 2026-10-15; see [the batch README](../batches/wp03-section-k-pe-tsai-napa-alias-boundary-hold-integration-r122-20261015/README.md).
- **Scope:** Decide whether pe-tsai / pé-tsaï is a safe alias of the existing Napa cabbage reference or a distinct unresolved market type.
- **Recommendation:** Keep pe-tsai and its French spellings out of active references and aliases for now. Do not create a second row without a market-level scope that can be distinguished from the existing Napa cabbage row.
- **Proposal-local source-ID prefix:** WP03-K-PETSAI-20261015-R122-S; it was absent from the ledger and proposal/batch files at the audit snapshot.

## Open Section K question

Section K of the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) keeps the broader lettuce, leafy-green, and brassica sweep open. This review narrows that item to a concrete bilingual picker question: should pe-tsai / pé-tsaï resolve to the existing Napa cabbage reference, or should the term remain separate?

The current row is ingredient-ref-napa-cabbage, displayed as Napa cabbage / chou nappa. Its aliases are English nappa cabbage, nappa, and napa, and French nappa, napa, and chou napa. The prior Napa boundary record intentionally leaves Chinese cabbage / chou chinois unassigned as umbrella wording spanning multiple named types. The R121 chaya safety hold does not review this cabbage naming question.

The source evidence does not settle the market boundary. Canadian government and terminology sources place pe-tsai within Brassica rapa subsp. pekinensis and one Canadian terminology record lists petsai and nappa cabbage under Brassica pekinensis. Other horticultural and Québec terminology sources describe pe-tsai and Napa as different market types within the broader Chinese-cabbage group. Current Québec retail listings use Napa / nappa wording, not pe-tsai. This review therefore makes no active identity change.

## Repository audit and snapshot

I checked the Section K plan/checklist, the recent WP03 Section K proposals and batch READMEs, active ingredient references and forms, the legacy import candidates, the research ledger, the recipe manifest, and every manifest-listed recipe file. The spellings pe-tsai, pé-tsai, pé-tsaï, petsaï, and petsai have no exact active reference, form, legacy candidate, or Napa ledger source/decision. No earlier focused pe-tsai proposal or integration batch was found. The current Napa row remains the sole active Napa cabbage identity; adjacent cabbage and brassica rows remain separate.

Snapshot refreshed after concurrent WP02 B3 and WP04 Section P catalog integrations on 2026-10-15. These counts and hashes reflect the latest read-only recheck:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 1,470 references | 25ea4bacd09b463b887f4db00a2e4ab33d2801e6966ca27d3045e5eaa338dd7b |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 105 forms | 32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0 |
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| docs/catalog/legacy-import-identities.v1.json | 63 candidates | a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb |
| docs/catalog/research-ledger.v1.json | 1,811 records / 7,482 source entries / 6,360 distinct source IDs | 4d5223951e59343e3d96dfca03458757768f100b71bfad27639b4a74e2aed1d3 |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | 75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f |

The corpus digest is SHA-256 over each manifest-listed relative recipe path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order. The proposed R122 source-ID prefix was not found in the ledger or prior proposal/batch files.

## Evidence and boundary

The strongest evidence for aliasing is that TERMIUM Plus places petsai, nappa cabbage, nappa, and celery cabbage under Brassica pekinensis, with French pé-tsai and petsaï. The CFIA biological account also places pé-tsai in the B. rapa pekinensis group. That establishes a close taxonomic and terminology relationship; it does not show that every retail product called pe-tsai is the narrower Napa market type already represented in the app.

Two sources preserve a meaningful market distinction. The OQLF's 1991 entry lists nappa, pak-choï, and pé-tsaï as different North American Chinese-cabbage market types. Oregon State University Extension says Chinese cabbage, often called pe-tsai, contains at least two major head types: elongated Chihli and barrel-shaped Napa / Won Bok. These sources are older and their taxonomic naming differs, but together they warn against mapping the unqualified group name to one specific market type.

Current Québec-facing listings support the existing name boundary. Metro and Super C sell the product as chou nappa and describe a compact, oblong head; Metro and Super C product copy also uses chou chinois as a description. The Marché de proximité de Québec lists Ferme Labonté products as chou chinois NAPA BIO. This retailer-specific descriptive use does not establish chou chinois as a safe general alias: OQLF and TERMIUM use it as umbrella wording covering multiple market types. A targeted marketplace search did not surface a current Québec pe-tsai-labelled food listing. This is a bounded search result, not evidence that the product is unavailable in Québec.

The Ontario government's French food guide lists pé-tsaï as a leafy vegetable and gives preparation examples, supporting culinary use in Canada. It does not say that pé-tsaï and Québec-market Napa are interchangeable. Do not interpret any agricultural classification, older botanical name, or shared species group as a recipe equivalence.

## Picker projection

The query projection follows the app's NFKD, accent-folding, punctuation-normalizing, complete-phrase-first search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a source-code-equivalent static simulation, not live picker QA.

| Query | Current results | If the source-listed aliases were added to Napa | Decision |
|---|---|---|---|
| pe-tsai, pé-tsai, pé-tsaï | 0 | 1: ingredient-ref-napa-cabbage | Keep unresolved until the market scope is clear. |
| petsai, petsaï | 0 | 1: ingredient-ref-napa-cabbage | These spellings would also point to Napa if accepted as aliases. |
| tsai | 1: ingredient-ref-tatsoi | 2: Napa cabbage plus tatsoi | Do not create this added collision while pe-tsai's product scope remains broader or unclear. |
| napa, nappa, napa cabbage, chou nappa | 1: Napa cabbage | Unchanged | Preserve current exact Napa ownership. |
| Chinese cabbage, chou chinois | 0 | 0 with the considered pe-tsai spellings | Keep the broad family terms unassigned. |
| cabbage | 6 references | 6 | The considered aliases do not contain this broad token. |
| chou | 11 references | 11 | The considered aliases do not contain this broad token. |

For the hypothetical projection, the candidate alias set is English pe-tsai and petsai, plus French pé-tsaï and petsaï. The TERMIUM spelling pé-tsai normalizes to the same key as pe-tsai. Accent and punctuation normalization makes the hyphenated forms equivalent to pe tsai; the no-hyphen forms remain a separate normalized search key. These aliases would make the exact queries find Napa, but they would also make tsai return both Napa and tatsoi because tatsoi already owns tah tsai. The projected result is technically precise only if pe-tsai always means the same market head type as Napa; the reviewed sources do not establish that condition.

Do not add Chinese cabbage, chou chinois, or chou de Chine as Napa aliases. OQLF and TERMIUM treat those as umbrella wording, while bok choy and Napa have separate active references.

## Bundle demand and recipe evidence

The manifest-listed corpus has zero Napa, nappa, pe-tsai, petsai, Chinese-cabbage, or chou nappa ingredient-row/reference-ID matches across 114 recipes and 1,123 ingredient rows. There is no bundled recipe link or direct bundle demand for this alias question.

An external Québec Metro recipe, “Chou Nappa à l'érable et au cari,” lists 750 mL (3 cups) chopped Napa cabbage or four mini Napa for four portions. This demonstrates local recipe usage and a recipe-specific alternative form. It does not provide a mass for either amount, a general cup mapping, or a reason to use pe-tsai as a substitute.

## Alias, form, and numeric decisions

| Catalog behavior | Recommendation |
|---|---|
| New reference | None; do not add a separate pe-tsai row while its market scope overlaps the existing Napa identity. |
| English aliases | None. Keep pe-tsai and petsai inactive. |
| French aliases | None. Keep pé-tsai and petsaï inactive; pé-tsaï accent folding would not resolve the market-scope ambiguity. |
| Density | No default density. |
| Forms | None. This review found no processing state that should be modeled as a Napa form. |
| Unit mappings or conversions | None. Metro's recipe volume and whole-mini-head wording are one source's recipe amounts, not a general conversion. |
| Yield or count mapping | None. No matching bundle recipe requires a mapping. |
| Substitution | None. The Metro alternative is within one Napa recipe, not an equivalence to pe-tsai or another cabbage identity. |
| Recipe links | None; no manifest-listed recipe has a matching line or reference. |

## Sources reviewed on 2026-10-15

| Source ID | Source | Evidence used and limit |
|---|---|---|
| WP03-K-PETSAI-20261015-R122-S01 | CFIA, [La biologie du Brassica rapa L.](https://inspection.canada.ca/fr/varietes-vegetales/vegetaux-caracteres-nouveaux/demandeurs/directive-94-08/documents-biologie/brassica-rapa). | Lists the leaf groups as chinensis (pak-choï), pekinensis (pé-tsai), and perviridis (verdure tendre). This is an official biological overview whose cited crop-group taxonomy is not a current market equivalence standard. |
| WP03-K-PETSAI-20261015-R122-S02 | CFIA, [Tout sur l'importation de semences au Canada](https://inspection.canada.ca/fr/protection-vegetaux/semences/importation-semences/limportation). | Canadian seed-import list names Pe-Tsai under Brassica rapa subsp. pekinensis and Pak-Choï under var. chinensis. Supports crop-group distinction, not a produce-label or cultivar equivalence. |
| WP03-K-PETSAI-20261015-R122-S03 | OQLF, [GDT: chou de Chine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082728/chou-de-chine), last updated 1991. | Names nappa, pak-choï, and pé-tsaï among North American Chinese-cabbage market types and treats Chinese cabbage as an umbrella. The entry is Québec-authoritative but dated and uses older botanical names. |
| WP03-K-PETSAI-20261015-R122-S04 | Translation Bureau, [TERMIUM Plus: PETSAI](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enw&lang=fra&srchtxt=PETSAI), terminology record dated 2016-03-01. | Under Brassica pekinensis, lists English petsai, nappa cabbage, nappa and celery cabbage, and French pé-tsai / petsaï. It also says Chinese cabbage is broader than pe-tsai. Shared taxon and terminology do not settle whether a recipe or shop listing's pe-tsai means a particular Napa head type. |
| WP03-K-PETSAI-20261015-R122-S05 | Oregon State University Extension, [Cabbage, Chinese](https://horticulture.oregonstate.edu/oregon-vegetables/cabbage-chinese), revised 2010-02-01. | Says Chinese cabbage var. pekinensis is often called pe-tsai and distinguishes elongated Chihli from barrel-shaped Napa / Won Bok. Horticultural guidance, dated and geographically bounded; it is useful for the subtype boundary, not Québec naming. |
| WP03-K-PETSAI-20261015-R122-S06 | Government of Ontario, [Les légumes-feuilles d'origines diverses](https://www.ontario.ca/fr/terre-nourriciere/aliments/les-legumes-feuilles-dorigines-diverses). | Lists pé-tsaï as a leafy vegetable and describes cooking its stems and leaves. Canadian culinary evidence; it does not equate all pé-tsaï with the narrower Napa market label. |
| WP03-K-PETSAI-20261015-R122-S07 | Metro Québec, [Chou nappa](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/brocolis-choux-et-choux-fleurs/chou-nappa/p/4552); Super C, [Chou nappa](https://www.superc.ca/allees/fruits-et-legumes/legumes/brocolis-choux-et-choux-fleurs/chou-nappa/p/4552). | Current retailer listings use chou nappa / Napa and describe the compact oblong head. Metro's item card reports an approximate product weight; this is package/item data, not an ingredient density or cup conversion. The Super C page may require a store context. |
| WP03-K-PETSAI-20261015-R122-S08 | Marché de proximité de Québec, [Ferme Labonté products](https://marchequebec.org/index.php?action=produits&cleproducteur=56&tri=pro_asc). | Current indexed Québec farm listings use Chou chinois NAPA BIO and show package-size variants. This confirms the local label, not absence of other labels in every market. |
| WP03-K-PETSAI-20261015-R122-S09 | Metro, [Chou Nappa à l'érable et au cari](https://www.metro.ca/recettes-et-occasions/recettes/chou-nappa-a-l-erable-et-au-cari). | One French Québec recipe lists 750 mL / 3 cups chopped Napa or four mini Napa for four portions. Keep the quantity and alternative recipe-specific; the recipe supplies no weight conversion and does not mention pe-tsai. |

## Recommendation and revisit condition

Keep the current Napa row unchanged and leave pe-tsai / pé-tsaï outside active references and aliases. The evidence confirms a close Pekinensis-group relationship, but Québec terminology and horticultural sources preserve market subtypes while current Québec retailer wording points to Napa specifically. Assigning pe-tsai to Napa now would risk converting a broader or differently shaped cabbage type into one narrower picker result; creating a second row would risk duplicating the same commodity.

Revisit if a current Québec or Canadian produce listing and an authoritative cultivar/product source together establish that pe-tsai is consistently the same Napa head type, or establish a clearly distinct pe-tsai commodity that can coexist with Napa without overlapping identity scope. Keep the broader Section K sweep and independent bilingual terminology review open.

The documentation-only hold was integrated on 2026-10-15. No active reference or ledger record was added; the plan, roadmap, and batch README now record the boundary decision. No app, Gradle, instrumentation, or emulator tests were run. The proposal’s scoped static checks cover source-ID uniqueness, picker projection, and the manifest-listed corpus audit.

# WP03 Section F R516 — Sugar Crisp cereal identity review (2026-10-17)

## Scope and recommendation

The open Section F checklist includes continued review of cereal mixes and preprocessed grain products ([global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4385)). This review covers one current Canadian Post cereal that has no active catalog owner: Sugar Crisp. It does not reopen R513's held Inno Foods Blueberry Oat Puffs or any R514/R515 work; those unrelated integrations were read before taking this snapshot ([R514](wp04-section-p-next-seafood-review-r514-20261017.md), [R515](wp06-african-next-regional-review-r515-20261017.md)).

**Status:** integrated on 2026-10-17; see the [R516 integration README](../batches/wp03-section-f-sugar-crisp-cereal-identity-integration-r516-20261017/README.md).

**Recommendation: add one bilingual, identity-only GRAIN_AND_CEREAL reference for the named finished cereal, with one product-specific nutrition-panel observation retained in the research ledger.** Keep it separate from plain puffed wheat. Add no aliases, ingredient forms, reusable measures, density, unit mappings, conversions, yields, recipe links, or substitutions.

The review snapshot before R516 and R517 integration was 1,790 ingredient references, 143 forms, 56 legacy candidates, and 2,147 ledger records containing 9,853 source entries, 8,340 distinct source IDs, and 7,050 distinct URLs. It followed the R514, R515, and R518 integrations. The manifest lists 114 recipes; none of those changes affects this candidate's picker projection.

## Bilingual identity and product boundary

The Canadian manufacturer currently lists a Sugar Crisp product in 365 g and 550 g boxes. Its French-Canadian product page uses the name Sugar-Crisp and the same two box sizes. The manufacturer's French brand history describes the Canadian product as sweetened puffed-wheat cereal and says the Canadian name remains Sugar-Crisp. A current Provigo Québec listing uses “Céréales Sugar Crisp,” describes sweetened puffed wheat, and gives a 365 g listing with a nutrition-panel serving of 1 cup (40 g).

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-sugar-crisp-cereal |
| English display | Sugar Crisp cereal |
| French display | Céréales Sugar-Crisp |
| Category | GRAIN_AND_CEREAL |
| English aliases | [] |
| French aliases | [] |
| defaultDensity | null |
| unitMappings | [] |
| Forms and recipe links | None |
| Reusable measures, conversions, yields, substitutions | None |

“Cereal” and “céréales” make the packaged-food identity explicit; the brand wording follows current Canadian manufacturer usage. The French display is supported by the manufacturer’s French-Canadian page and the Québec retailer listing; it is not an OQLF ruling.

The manufacturer's French history page says that the Canadian cereal retains the Sugar-Crisp name and gives Golden Crisp and Super Sugar Crisp in its cross-market and historical discussion. Do not add Golden Crisp, Super Sugar Crisp, or Sugar Bear as aliases. The exact word order “Sugar Crisp cereal” is searchable through the display name, so no spelling alias is needed.

The packaged, sweetened cereal is distinct from active ingredient-ref-puffed-wheat (puffed wheat / blé soufflé). Do not add puffed wheat, sweet puffed wheat, grains de blé soufflé, or blé soufflé as aliases; those terms would blur the named formulated product with the plain puffed-grain identity. Do not attach the cereal's sugar, honey, or wheat components as recipe links.

## Ownership and archive audit

The read-only audit covered the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), the plan, roadmap, prior proposals and batches, and the full manifest-listed recipe corpus.

At proposal review, normalized exact-key checks found no owner for Sugar Crisp, Sugar-Crisp, Sugar Crisp cereal, Céréales Sugar-Crisp, Sugar Bear, or ingredient-ref-sugar-crisp-cereal in active references, forms, legacy candidates, or ledger records. Integration assigned the ingredient ID and five source mappings to the accepted record. A repository archive search found no previous focused Sugar Crisp decision.

A whole-ledger ownership audit found zero source IDs mapped to multiple URLs. At proposal review, each of the five URLs below was unowned in the ledger and each proposal-local source ID mapped to exactly one URL. Integration registered these source mappings to the accepted record.

| Source ID | One URL | Evidence and limits |
|---|---|---|
| WP03-SUGAR-CRISP-CEREAL-R516-20261017-S01 | Post Consumer Brands Canada, [Original Sugar Crisp](https://www.postconsumerbrands.ca/brand/sugar-crisp/original-sugar-crisp/) | Current Canadian manufacturer product page names Sugar Crisp and lists 365 g and 550 g package options. The page's current text does not expose a readable ingredient panel or a serving mass. |
| WP03-SUGAR-CRISP-CEREAL-R516-20261017-S02 | Post Consumer Brands Canada, [Sugar-Crisp, French-Canadian product page](https://www.postconsumerbrands.ca/fr-ca/marques/sugar-crisp-fr/sugar-crisp/) | Current French-Canadian manufacturer page names Sugar-Crisp and lists the same 365 g and 550 g box options. The brand title is source wording, not a French terminology ruling. |
| WP03-SUGAR-CRISP-CEREAL-R516-20261017-S03 | Post Consumer Brands Canada, [Céréales Sugar-Crisp — Notre histoire](https://www.postconsumerbrands.ca/fr-ca/marques/sugar-crisp-fr/notre-histoire/) | Says that Canada's Sugar-Crisp is a sweetened puffed-wheat cereal and distinguishes the Canadian name from U.S. Golden Crisp and former names. This supports the cereal boundary and the decision not to activate cross-market or historical names as aliases. |
| WP03-SUGAR-CRISP-CEREAL-R516-20261017-S04 | Super C, [Céréales de blé au miel, Sugar-Crisp](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-ble-a-saveur-de-miel/p/628154138006) | Québec retailer product page for item 628154138006, with the French-facing descriptor and Sugar-Crisp name, 365 g package, and a product-specific ingredient listing. It corroborates a named finished cereal; its location-specific stock status and formula may change. |
| WP03-SUGAR-CRISP-CEREAL-R516-20261017-S05 | Provigo, [Céréales Sugar Crisp, 365 g](https://www.provigo.ca/fr/c-r-ales-sugar-crisp/p/20071915001_EA) | The Québec-facing indexed listing uses the product name, describes sweetened puffed wheat, and displays a 1 cup (40 g) nutrition-panel serving; it showed stock in Longueuil when indexed. Direct browser text extraction returned no page text, so treat the portion as indexed listing evidence only. The listing uses retailer item 20071915001_EA; do not equate that internal item number with Super C's UPC or transfer the serving to another package without a verified crosswalk. Stock is temporary. |

## Phrase-first picker projection

This static projection follows the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, ligatures, punctuation, and spacing; returns complete word-phrase matches first; and uses substring fallback only when no full phrase matches. It searches reference display names and aliases plus linked form terms. The proposed row has no aliases or forms.

| Query | Current results | With proposal | Projection |
|---|---:|---:|---|
| Sugar Crisp; Sugar-Crisp; Sugar Crisp cereal | 0 | 1 | ingredient-ref-sugar-crisp-cereal |
| Céréales Sugar-Crisp | 0 | 1 | ingredient-ref-sugar-crisp-cereal |
| Sugar | 23 | 24 | Broad result set gains the named cereal because Sugar is a complete token in its display. |
| cereal; céréales | 56; 52 | 57; 53 | Both remain broad result sets. |
| puffed wheat; blé soufflé | 1; 1 | 1; 1 | Unchanged: ingredient-ref-puffed-wheat. |
| wheat; blé | 62; 67 | 62; 67 | Unchanged; the proposed display does not add a wheat alias. |
| Golden Crisp; Super Sugar Crisp; Céréales de blé au miel | 0; 0; 0 | 0; 0; 0 | These are not added as aliases; the Québec retailer's descriptive category wording is not treated as the product's canonical name. |

These are static catalog projections, not runtime picker tests.

## Measurement, forms, and substitutions

The two manufacturer package sizes and the Québec 365 g retail package describe package presentations, not household measures. The Provigo indexed listing reports a 1 cup (40 g) nutrition serving for its specific retailer listing. Proposed ledger-only observation fields: observationId ingredient-ref-sugar-crisp-cereal-provigo-1-cup-40g-r516; relationship portion_weight; value 40; valueUnit g; sourceQuantity 1 cup; observedMassG 40; foodDescription Post Sugar Crisp cereal, Provigo listing 20071915001_EA, as sold; foodState dry ready-to-eat cereal; measurementMethod retailer nutrition-panel serving shown in the indexed listing; quantityBasis limited to this retailer listing, with cup volume and fill method unspecified; evidenceKind published_portion; sourceIds [WP03-SUGAR-CRISP-CEREAL-R516-20261017-S05]. Direct browser text extraction returned no page text. Do not turn the observation into a reusable cup measure, density, unit mapping, or conversion.

The integrated ledger states are `verified` identity, `researched_supported` measurement for the source-specific portion observation, and `not_yet_researched` substitution research. No active or contextual substitute was added: the reviewed product sources and recipe corpus establish no replacement amount or equivalence with plain puffed wheat or other breakfast cereals. No forms were added because the branded finished product is not a state form of wheat grain or puffed wheat.

## Full manifest recipe scan

All 114 recipe files named in the current manifest were parsed, covering 1,123 structured ingredient rows and 753,988 exact recipe-file bytes. The manifest-ordered corpus SHA-256 is 847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e; the digest hashes each manifest-relative path encoded as UTF-8, a NUL byte, exact recipe-file bytes, then a NUL byte.

The full-file and ingredient-row scans for Sugar Crisp, Sugar-Crisp, Sugar Crisp cereal, Sugar Bear, sweet puffed wheat, and the proposed reference ID found zero matching recipe files and zero matching ingredient rows. There is no bundled recipe demand, recipe amount, or link for this cereal.

## Decision and evidence limits

The proposed identity is scoped to the current Canadian Sugar Crisp finished cereal. It does not assert a complete international brand roster, a stable product formula, or equivalence to every plain or sweetened puffed-wheat product. Current page details and package sizes can change. The French wording is direct Canadian manufacturer and Québec retail usage, not a standardized Québec term. The single 1 cup (40 g) observation belongs only to the named Provigo listing; no active conversion follows from it.

Integration added one identity-only reference and one listing-specific portion observation to its research-ledger record; no runtime conversion was added. No software tests, build, emulator, or deployment were run because the catalog change adds database JSON data under `AGENTS.md`. Static package, ledger, generated-index, picker, corpus, and source-ownership checks are recorded in the [R516 integration README](../batches/wp03-section-f-sugar-crisp-cereal-identity-integration-r516-20261017/README.md).


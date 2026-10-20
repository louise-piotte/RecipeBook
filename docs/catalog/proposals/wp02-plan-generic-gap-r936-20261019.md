# WP02 plan generic gap R936: barley-germ fraction review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Research proposal accepted and integrated on 2026-10-19. The researcher made no shared-data changes; the accepted integration is documented in the [R936–R938 README](../batches/wp02-wp03-wp04-r936-r938-generic-gap-integration-20261019/README.md).
- **Open-plan anchor:** WP02 Section A7 remains open for other grain meals and milling products ([plan, A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). This review selects one source-grain fraction, not a commercial product.
- **Selected gap:** Isolated barley germ, proposed as `barley germ / germe d’orge`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference if accepted. Treat the French compound as provisional. Add no aliases, forms, measurements, recipe links, conversions, yields, or substitutions.

## Recommendation and identity boundary

The primary cereal-germ study explicitly prepared a barley-germ fraction by impact milling and evaluated cereal-germ preparations for potential use as food ingredients. A barley-grain review distinguishes the embryo from the surrounding endosperm and other kernel tissues. Together, these support a generic, source-grain-qualified barley fraction with food-ingredient potential. They do not establish common retail availability, a regulated milling specification, or routine household use. Keep the proposed identity narrow and research-supported; do not infer that every barley germinated during malting is a separate barley-germ ingredient. [R933-S01; R936-S01]

Use `barley germ` for the barley-germ preparation described by the cereal-germ study, a fraction associated with the grain embryo. The abstract does not quantify the preparation’s purity, so do not claim a standardized or analytically pure embryo fraction. Keep it separate from barley grain, barley bran, barley flour, whole-barley flour, malted barley flour, sprouted barley, and meal made by sprouting and grinding whole barley. The primary study’s germ preparation is not a process or composition standard for other products. Do not alter the existing barley, sprouted-barley, malted-barley-flour, bran, or branded references. [R933-S01; R936-S01]

OQLF supports `orge` as the Québec French base term and `germe de blé` as a distinct wheat-kernel fraction whose defining part is the embryo. OQLF does not attest the barley-specific compound `germe d’orge`. Use that compound only as a transparent descriptive French display, marked provisional pending exact Québec terminology evidence or a local human-food label. Keep both alias arrays empty. Reuse `WP03-GENERIC-BARLEY-R52-20261013-S01` for the OQLF barley term and `WP02-S99` for the separate OQLF wheat-germ terminology pattern if integrated; neither source by itself attests `germe d’orge`.

## Generic scope and nearby decisions

This review addresses grain-fraction diversity, not a brand or product roster. No brand, product line, flavour family, SKU, or retailer variant was researched. Any queued task limited to additional commercial products remains out of scope because commercial-product counts do not add ingredient diversity. Preserve existing branded barley/cereal entries and all product-specific evidence; transfer no product measurements or claims to this identity.

The R872 triticale-bran proposal noted the phrase “barley germ” only inside existing malted-barley-flour evidence and found no standalone barley-germ owner. That incidental phrase describes barley germination in malting; R872 selected a different fraction rather than adjudicating the standalone candidate. R936 is a separate review of the barley-germ preparation documented in the primary study. The existing sprouted-barley row and its evidence remain unchanged. [R872]

## Ownership, recipe demand, and picker audit

Read-only audit of current repository data on 2026-10-19:

| Surface | Current state | Proposed boundary |
| --- | --- | --- |
| Ingredient references | 1,955 references. No row owns the proposed ID, exact phrase `barley germ`, or `germe d’orge`. Existing neighbors include barley, barley bran, barley flour, whole-barley flour, malted-barley flour, sprouted barley, wheat germ, oat germ, and toasted corn germ. | Add one barley-germ identity only. Preserve all neighboring and branded rows. |
| Ingredient forms | 204 forms; no exact barley-germ form or form hint. | Add no form or processing state. The source does not establish a consumer-facing form taxonomy. |
| Legacy identities | 55 candidates; no proposed ID or exact English/French name. | No legacy promotion or merge. |
| Research ledger | 2,359 records; no standalone barley-germ record or candidate. One phrase hit in the malted-barley-flour sources says that barley is germinated, dried, and ground; it concerns malted flour, not a standalone barley-germ fraction. | If accepted, add one identity record and reuse the exact-source IDs listed below. Add no measurements or formula findings. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. No exact `barley germ`, `barley-germ`, `barley embryo`, or `germe d’orge` match occurs in ingredient names or original ingredient text. | No recipe link or recipe amount is justified by current bundled demand. |

Exact proposed names and ID are unowned in current reference, form, legacy-identity, and standalone-ledger records. The exact source-qualified queries `barley germ` and `germe d’orge` therefore have no current identity owner. Do not add broad `germ` / `germe`, `barley` / `orge`, or `barley embryo` aliases: they are unnecessary for exact retrieval, and the broad terms would blur grain, sprouting, and milling-fraction boundaries. The unqualified barley/orge searches may continue to return several existing grain, flour, bran, and sprouting results.

## Measurement and substitution limits

The primary study reports compositional analyses of its prepared barley-germ sample. These sample results do not establish a household amount, cup weight, density, cooking yield, or transferable composition for all barley germ. No source reviewed supplies a culinary measure. Leave `defaultDensity` null and `unitMappings` empty. If integrated, use `measurementState: not_yet_researched` unless a separate measurement review supports a more specific state.

The study's food-ingredient potential statement does not establish a replacement role, proportion, or recipe adaptation. Its sample-specific laboratory findings must not be converted into a recipe substitution. Add no global or contextual substitution rule; use `substitutionResearchState: not_yet_researched` pending separate evidence.

## Proposed identity-only data

If accepted later, add one reference:

```json
{
  "id": "ingredient-ref-barley-germ",
  "nameEn": "barley germ",
  "nameFr": "germe d’orge",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

If integrated, create one `ingredient_reference` ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Mark the French display provisional. Reuse the existing Barnes source ID `WP02-B2-OAT-GERM-R933-20261019-S01` for its exact URL rather than minting a duplicate source ID; scope its support on the barley record to the study’s barley sample. Reuse the existing OQLF barley source ID for `orge`, and `WP02-S99` only for the explicitly limited French terminology pattern. Add no forms, aliases, measurements, conversions, yields, recipe links, or substitution findings.

## Evidence and source limits

| Source ID | Source and support | Limit |
| --- | --- | --- |
| **Reused `WP02-B2-OAT-GERM-R933-20261019-S01`** | P. J. Barnes, [“Composition of cereal germ preparations”](https://pubmed.ncbi.nlm.nih.gov/7124118/), *Zeitschrift für Lebensmittel-Untersuchung und -Forschung* 174(6) (1982), 467–471; DOI [10.1007/BF01042727](https://doi.org/10.1007/BF01042727). The abstract names barley among the cereals whose germ fractions were prepared by impact milling and assessed for potential food-ingredient use. | Primary research and direct support for a prepared barley-germ fraction. The method, composition results, and food-ingredient potential remain limited to the study material; no household measure, retail standard, or transferable substitution is reported. The source ID is already used for this exact URL on the oat-germ record. |
| **R936-S01** | L. Geng et al., [“Barley: a potential cereal for producing healthy and functional foods”](https://academic.oup.com/fqs/article/doi/10.1093/fqsafe/fyac012/6532626), *Food Quality and Safety* 6 (2022), fyac012; DOI [10.1093/fqsafe/fyac012](https://doi.org/10.1093/fqsafe/fyac012). Describes the barley caryopsis as including embryo and endosperm and locates the embryo as a distinct kernel component. | Peer-reviewed review of barley structure and food use; it supports anatomy, not standalone barley-germ market prevalence, processing specifications, a French term, or a kitchen value. |
| **Reused `WP03-GENERIC-BARLEY-R52-20261013-S01`** | Office québécois de la langue française, [*orge* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge). | Supports the Québec French base term `orge`; it does not attest `germe d’orge`. |
| **Reused `WP02-S99`** | Office québécois de la langue française, [*germe de blé* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432763/germe-de-ble). | Defines the wheat germ as the grain’s embryo and supplies a French cereal-fraction naming pattern. It is wheat-specific and does not establish the barley compound. |
| **R872** | Existing [generic triticale-bran proposal](./wp02-generic-triticale-bran-identity-review-r872-20261019.md). | Notes no standalone barley-germ owner and the unrelated use of “barley germ” in malted-flour evidence. It does not decide this isolated cereal-germ identity. |

## Remaining uncertainty

1. The barley-germ identity is supported as a research-prepared cereal fraction with food-ingredient potential, not as a standardized or commonly available home-cooking ingredient.
2. `Germe d’orge` is a descriptive French construction from OQLF-supported components; the compound remains provisional.
3. No bundled recipe demand, household measure, reusable density, or general substitution is supported.
4. Preserve existing branded entries and source-scoped claims. No commercial roster was pursued because additional commercial-product counts do not add ingredient diversity.

No software tests were run because the accepted integration only adds database JSON under `AGENTS.md`; static checks are recorded in the [integration README](../batches/wp02-wp03-wp04-r936-r938-generic-gap-integration-20261019/README.md).

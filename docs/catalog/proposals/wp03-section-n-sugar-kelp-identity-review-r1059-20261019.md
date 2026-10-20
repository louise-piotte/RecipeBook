# WP03 Section N R1059 — sugar-kelp identity review

- **Review date:** 2026-10-19
- **Status:** proposal only; this review did not edit shared references, forms, ledger, recipes, plan, roadmap, or generated files.
- **Recommendation:** add one generic, identity-only reference for sugar kelp, bounded to *Saccharina latissima*.
- **Open-plan anchor:** the Section N item for named and regional sea vegetables remains open at [plan line 7172](../../RecipeBook-global-ingredient-catalog-plan.txt#L7172). The prior sea-vegetable review keeps the unqualified kelp name unresolved.
- **Scope:** one edible seaweed species. No brand, product line, flavour, SKU, retailer variant, or commercial roster was researched.

## Candidate and bilingual boundary

NOAA Fisheries identifies **sugar kelp** as *Saccharina latissima* and describes the alga as eaten as food. Fisheries and Oceans Canada’s Québec harvesting guide uses the French name **laminaire sucrée** with the same binomial. The OQLF’s standardized Québec term **laminaire saccharine** points to the older scientific name *Laminaria saccharina*; the taxonomic cross-reference lists *Saccharina latissima* as the accepted name for that former combination. Together, those sources support a generic species-bounded culinary identity and the proposed French display. The French terms here identify the same alga; they are not aliases for all kelp. [S01–S04]

Keep this row to the edible alga identified as *S. latissima*. The sources describe its blade and stipe but do not establish a narrower catalog plant-part boundary or a distinct culinary part. Do not infer that every tissue, harvest stage, cut, or preparation is interchangeable. Model no fresh, dried, powdered, rehydrated, extracted, or soaking-liquid form in this identity-only proposal.

Keep it distinct from:

- `ingredient-ref-kombu`, the active *Saccharina japonica* identity, with its `konbu` spelling alias;
- `ingredient-ref-wakame`, the active *Undaria pinnatifida* identity;
- `ingredient-ref-alaria-esculenta`, winged kelp / alarie succulente, including its qualified Atlantic-wakame wording;
- the unresolved `ingredient-ref-kelp` candidate, which holds broad `kelp`, `varech`, and `goémon` wording because those terms span species, mixed harvest, and non-food contexts.

Do not add bare **kelp**, **varech**, or **goémon** as aliases. Do not add **kombu royal**: the active kombu decision explicitly keeps that term off *S. japonica*, while the current proposal has no need to use a potentially cross-applied common name. NOAA lists **sea belt** and **Devil’s apron** on its species page, but neither is needed for a minimal Québec-facing row. Preserve all current rows, aliases, evidence, and the generic-kelp hold. [S01, S02, S05]

| Field | Proposed value |
|---|---|
| Suggested ID | `ingredient-ref-sugar-kelp` |
| English display | `sugar kelp` |
| fr-CA display | `laminaire sucrée` |
| English aliases | `Saccharina latissima`; `Laminaria saccharina` |
| French aliases | `Saccharina latissima`; `Laminaria saccharina`; `laminaire saccharine` |
| Category | `VEGETABLE_AND_AROMATIC` |
| Default density / unit mappings | `null` / `[]` |
| Forms, measures, conversions, yields, substitutions | none proposed |

The Latin aliases are taxonomic search terms, not common names. *Laminaria saccharina* is included only as a source-attested former scientific name cross-referenced to the accepted *S. latissima*. Do not add the broad English translation `kelp` from the OQLF record as an alias. [S02–S04]

## Live ownership and recipe-demand audit

Read-only snapshot refreshed on 2026-10-19: **2,060 ingredient references**, **205 forms**, **2,465 ledger records / 11,504 source entries**, **55 legacy candidates**, and **114 recipes / 1,123 ingredient rows**.

| Area | Finding | Disposition |
|---|---|---|
| Active references | No exact sugar-kelp, *S. latissima*, *L. saccharina*, `laminaire sucrée`, or `laminaire saccharine` owner. Existing owners are kombu, wakame, Alaria winged kelp, and other named sea vegetables. | Propose a new species-qualified row; preserve each owner. |
| Forms | No seaweed or algae forms exist in the 205-form file; no form is attached to these neighboring owners. | Add no form. |
| Ledger | No target-specific record. The one `ingredient-ref-kelp` candidate is `needs_clarification`; its existing evidence says broad kelp and the French harvest terms span multiple species or mixed/non-food contexts. The active kombu record already rejects generic kelp and kombu royal as aliases. | Leave both records and all their sources and decisions unchanged; if accepted, create a separate `ingredient-ref-sugar-kelp` identity record. |
| Legacy candidates | None of the 55 candidates matches the proposed display terms or taxon. | Do not revive or merge a legacy identity. |
| Prior work | The integrated sea-vegetable set includes kombu, Japanese wakame, and qualified *Alaria esculenta*; generic kelp remains held. The seaweed-form review found no bundled demand for seaweed forms. | This is a narrower species identity under the open regional-sea-vegetable item; it does not resolve the broad-kelp hold or mark the Section N parent complete. |
| Recipes | A full scan of all 114 manifest-listed recipe files and 1,123 structured ingredient rows found no match for sugar kelp, *Saccharina latissima*, *Laminaria saccharina*, the proposed French terms, or broader seaweed/kelp wording. | No recipe link, relink, amount, or recipe-derived form is supported. |

No roster-only queued item was encountered in the inspected Section N work. Any brand-, product-line-, flavour-, SKU-, or retailer-variant-only lead remains out of scope because commercial-product counts do not add ingredient diversity; stop that line without researching it.

## Numeric and substitution evidence limits

NOAA’s species page reports a nutrition-panel basis of **100 g raw**, describes biological blade length up to **5 m**, and gives U.S.-specific fresh-harvest and dried-product availability. These are respectively a composition-panel basis, organism dimension, and U.S. supply context—not a reusable kitchen portion, volume-to-mass conversion, density, edible yield, or Québec availability claim. Do not create a measurement observation, default density, unit mapping, or form from these figures. The reviewed evidence does not supply a transferable recipe quantity or preparation yield. [S01]

No reviewed source establishes a tested replacement ratio or global interchangeability between sugar kelp and kombu, wakame, winged kelp, carrageenan, or another seaweed. Keep substitutions absent. If integrated, record `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute` for the evidence reviewed here; these states do not claim that no future, context-specific evidence can exist.

## Minimal proposed data

If accepted, add one reference row only:

- `id`: `ingredient-ref-sugar-kelp`
- `nameEn`: `sugar kelp`
- `nameFr`: `laminaire sucrée`
- `aliasesEn`: `["Saccharina latissima", "Laminaria saccharina"]`
- `aliasesFr`: `["Saccharina latissima", "Laminaria saccharina", "laminaire saccharine"]`
- `defaultDensity`: `null`
- `unitMappings`: `[]`
- `category`: `VEGETABLE_AND_AROMATIC`

Suggested ledger record: `recordId: ingredient-ref-sugar-kelp`, `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`, with the identity sources below. Add no form, measurement observation, recipe link, conversion, yield, or substitution. Preserve the generic-kelp candidate and its source allocation unchanged.

## Evidence register

- **[S01] NOAA Fisheries, [Sugar Kelp](https://www.fisheries.noaa.gov/species/sugar-kelp)**, updated 2025-04-25, accessed 2026-10-19. Names sugar kelp as *Saccharina latissima* and describes it as eaten as food. Also reports blade anatomy, dimensions, U.S.-market availability, and a 100 g raw nutrition basis; those claims remain source-scoped and do not support a reusable recipe measure or Québec supply statement.
- **[S02] Fisheries and Oceans Canada, [Guide de bonnes pratiques pour une récolte durable et sécuritaire des algues marines au Québec (French, 2025)](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-13-2025-fra.pdf)**, accessed 2026-10-19. The indexed guide names **Laminaire sucrée (*Saccharina latissima*)**. Supports Canadian French wording tied to the species; the guide is harvest guidance, not a recipe-measure or substitution source.
- **[S03] Office québécois de la langue française, [laminaire saccharine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198887/laminaire-saccharine)**, accessed 2026-10-19. Standardizes the Québec French name and lists *Laminaria saccharina*; its English translation is the broad word `kelp`, which is not used as an alias here. OQLF’s note describes the wider `goémon` / `varech` harvest category as mixed algae, supporting the broad-term hold.
- **[S04] Ocean Biodiversity Information System / WoRMS taxon record, [*Laminaria saccharina*](https://www.obis.org/taxon/145730)**, accessed 2026-10-19. Lists *Saccharina latissima* as the accepted name for the OQLF record’s older *L. saccharina* combination; taxonomic cross-reference only.
- **[S05] WP03, [sea-vegetable identity boundary review](wp03-sea-vegetables-algae-product-boundaries-20261009.md), and [seaweed forms / hydration / yield review](wp03-section-n-seaweed-forms-hydration-yield-review-20261011.md)**. Preserve the specific seaweed identities, generic-kelp hold, absent forms, and prior evidence allocations; these reviews do not establish sugar-kelp measures or substitutions.
- **[R01] Read-only audit** of the active ingredient references and forms, the live ledger and legacy-candidate file, the Section N plan, prior seaweed proposals, and all manifest-listed recipe files. Snapshot counts and exact candidate-term findings are recorded above; no shared file was changed.

The sources support one generic culinary identity for **sugar kelp / laminaire sucrée**, limited to *Saccharina latissima*. They do not justify broadening the held kelp identity, adding commercial variants, or transferring measures, forms, or substitutions from other seaweeds.

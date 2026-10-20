# WP04 Section P R594 — Rohu regional-fish identity review

- **Review and source-access date:** 2026-10-17.
- **Open work items:** The regional-fish parent remains unchecked at [plan line 6417](../../RecipeBook-global-ingredient-catalog-plan.txt#L6426). The broader Section P fish-powder, fish-ball, surimi, and regional-seafood review remains open at [plan line 14953](../../RecipeBook-global-ingredient-catalog-plan.txt#L14981).
- **Recent distinct integrations:** The roadmap records R587 Hilsa, R590 Arapaima, and R593 Tambaqui at [lines 1370](../../../roadmap.md#L1370), [1373](../../../roadmap.md#L1373), and [1374](../../../roadmap.md#L1374). R594 addresses *Labeo rohita*, a different fish and taxon.
- **Candidate:** Rohu, *Labeo rohita*, a South Asian freshwater food fish.
- **Recommendation:** Add identity-only `ingredient-ref-rohu`, category `PROTEIN`, with English and French display `rohu / labéo roho` and empty alias lists. Scope the identity to *L. rohita*.
- **Boundary:** Do not add `Rui`, `rohu carp`, generic `carp` / `carpe`, `Labeo rohita`, or other local or scientific names as aliases. Keep common carp, catla, mrigal, Pangasius, Hilsa, Arapaima, and Tambaqui distinct. Do not add a form, recipe link, measure, density, unit mapping, yield, conversion, or substitution.
- **Status:** Integrated as an identity-only catalog reference and verified ledger record. See the [integration README](../batches/wp04-section-p-rohu-identity-integration-r594-20261017/README.md).
- **New source IDs:** `WP04-SECTIONP-ROHU-R594-20261017-S01` (2023–24 yearbook) and `WP04-SECTIONP-ROHU-R594-20261017-S02` (Department of Fisheries publication index); read-only audit label `WP04-SECTIONP-ROHU-R594-20261017-R01`. CFIA source IDs listed below are reused from the ledger.

## Why this is a distinct open gap

The open finfish item explicitly includes regional fish. R587, R590, and R593 integrated Hilsa (*Tenualosa ilisha*), Arapaima (*Arapaima gigas*), and Tambaqui (*Colossoma macropomum*); none covers Rohu. A targeted case-insensitive archive search found only R587's incidental use of `rohu` as a recipe-corpus search variant, not a Rohu identity review, hold, or allocation. The active catalog, forms, legacy identities, and ledger have no exact owner for the Rohu names or *Labeo rohita*.

The recommendation is deliberately limited to the bilingual Canadian fish-label name pair and one species. Bangladesh's 2023–24 yearbook documents the species in pond production as historical regional context; it does not determine RecipeBook measures or product availability in Canada. The Department of Fisheries index, updated 2026-08-12, also lists a 2024–25 yearbook, but that newer table was not used for the reported figure.

## Species and fr-CA name evidence

The CFIA Fish List row for TSN 163681 identifies *Labeo rohita* with English `Rohu` and French `Labéo roho`. The CFIA overview says the Fish List supplies English and French common names acceptable in Canada for fish labelling and gives scientific names and corresponding TSNs. This directly supports the proposed English and Québec-facing French displays; it does not prove that a particular Canadian retailer currently stocks the fish. The list page reports a 2023-09-18 modification date, retained here so the age of the underlying naming data is visible. [Reused CFIA sources S-CFIA-ROW and S-CFIA-OVERVIEW]

Targeted searches of OQLF's GDT and TERMIUM did not locate a separate Rohu entry. The French display therefore follows CFIA's exact Canadian fish-label name `Labéo roho`; it is not represented as a distinct OQLF-preferred term. Do not substitute the variant `labéo rohu` from unrelated aquatic-animal-health terminology for the fish-label spelling.

The Bangladesh Department of Fisheries' *Yearbook of Fisheries Statistics of Bangladesh 2023–24*, Table 3.18, lists `Rui (Labeo rohita)` as pond production of 345,046 metric tonnes, or 14.57% of the reported annual pond total. This dated statistic supports regional food-fish context and distinguishes the entry from Catla, Mrigal, and other species in the table. `Rui` remains source-local and is not added as an alias. The DoF statistics index, updated 2026-08-12, lists a 2024–25 yearbook too; its table was not reviewed here, so the 2023–24 figure is not presented as current. [S01–S02]

The proposed reference is:

```json
{
  "id": "ingredient-ref-rohu",
  "nameEn": "rohu",
  "nameFr": "labéo roho",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

No Canadian or Québec retail listing, package, or product-origin claim is included in this review. The identity is not a statement about where any particular Rohu product was farmed or caught.

## Current ownership and picker projection

Before integration, the read-only snapshot contained **1,813 active references**, **154 forms**, **56 legacy identities**, and **2,183 research-ledger records**. Exact phrase and identifier checks found no owner for `ingredient-ref-rohu`, `candidate-rohu`, `rohu`, `labéo roho`, `rohu fish`, or *Labeo rohita* in active references, forms, legacy identities, or ledger records. R594 has no prior proposal or batch allocation, and no source ID with the prefix `WP04-SECTIONP-ROHU-R594-20261017-` is allocated in the ledger.

The CFIA Fish List results URL is already owned by ledger source ID `WP04-P-MILKFISH-IDENTITY-20261013-S02`; that ID is reused for the Rohu row locator. The CFIA overview URL is already owned by `WP04-FINFISH-GAPS-20261010-S11`; reuse it for the Fish List's scope and labeling role. The Bangladesh 2023–24 Yearbook PDF and Department of Fisheries index URLs had no ledger owners and are assigned the new R594 S01 and S02. No source ID is duplicated or newly allocated for either already-owned CFIA URL.

The picker in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) checks normalized English/French names and aliases, preferring complete word phrases before substring fallback. No aliases or forms are proposed.

| Query | Current result | With proposal | Effect |
|---|---|---|---|
| `rohu` | No result | Rohu | Adds the exact English fish-label name. |
| `labéo roho` | No result | Rohu | Adds the exact French fish-label name; accent folding preserves normalized search. |
| `Labeo rohita` | No result | No result | Scientific names are not stored as picker aliases. |
| `rui` | 25 substring-fallback results, including unrelated names containing `fruit` | Unchanged | The Bengali source name is not added to the English or French alias fields. |
| `carp` / `carpe` | One substring-fallback result (`mascarpone`) / no result | Unchanged | Rohu has no `carp` term; no broad carp search is reassigned. |
| `fish` / `poisson` | 14 / 13 references | Unchanged | The proposed display contains neither generic fish term. |

`Rohu carp` and bare `carp` are intentionally excluded from aliases. The Bangladesh table separately lists Rohu, Catla, Mrigal, and common carp, and adding a broad carp alias would change the existing `carp` fallback query into an exact single-result match.

## Bundled recipe demand

All **114 manifest-listed recipe files**, their **1,123 structured ingredient rows**, and **753,988 exact recipe-file bytes** were scanned. The search covered `rohu`, `Rohu fish`, `rohu carp`, `Rui`, `ruhu`, `rohit`, `ruee`, `labéo roho`, `labéo rohu`, *Labeo rohita*, and spacing/case variants using whole-word phrase matching. It found **zero matching recipe files and zero matching ingredient rows**. Corpus fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, SHA-256 over each manifest-relative recipe path, NUL separator, exact recipe bytes, and NUL separator in manifest order.

The recipe bundle supplies no Rohu quantity, preparation, role, or method for a recipe-line link.

## Forms, measurements, and substitutions

The yearbook's **345,046 metric tonnes** is an annual pond-production statistic, not an ingredient quantity. Neither it nor the CFIA Fish List supports a serving size, cooked yield, edible yield, purchase size, household measure, or density. Add no form, unit mapping, measurement observation, default density, conversion, yield, or recipe link.

No reviewed recipe or source establishes a directed Rohu substitution, or a recipe context that would support substituting Rohu for common carp, Catla, Mrigal, Pangasius, or another fish. Add no substitution rule or recipe-line link.

## Source register and ownership

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ROHU-R594-20261017-S01** | Bangladesh Department of Fisheries, [Yearbook of Fisheries Statistics of Bangladesh 2023–24](https://fisheries.gov.bd/sites/default/files/files/fisheries.portal.gov.bd/publications/21964f20_05cc_4cf7_968b_9a351aa055f3/2025-06-15-10-40-24afb31473c54701bb5e3a4de91f8d41.pdf), Table 3.18, published 2025. | Lists Rui (*Labeo rohita*) at 345,046 metric tonnes and 14.57% of annual pond production for 2023–24. This is dated regional context, not a current production figure, household measure, recipe, Canadian market listing, or product-origin certificate. The table is exposed by the official PDF search extract; the PDF download was not available to the proposal author. |
| **WP04-SECTIONP-ROHU-R594-20261017-S02** | Bangladesh Department of Fisheries, [fisheries statistics publication index](https://fisheries.portal.gov.bd/pages/static-pages/6922e13e933eb65569e2b13e), updated 2026-08-12. | Lists Yearbooks for 2024–25 and 2023–24. This establishes that S01 is not represented as the latest yearbook; it gives no Rohu production table value. |
| **Reused `WP04-P-MILKFISH-IDENTITY-20261013-S02`** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), row for TSN 163681, *Labeo rohita*. | The result row gives `Rohu / Labéo roho` for this species. The accessed list showed 2,148 entries and reports a 2023-09-18 modification date. The source ID and URL are reused; this proposal records a different row locator and does not alter the ledger. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Defines the Fish List's Canadian labelling role and says it provides acceptable English/French fish common names, scientific names, and TSNs. It is naming guidance, not evidence of current stock at a particular retailer. |

**R01 read-only audit:** Re-read `AGENTS.md`, the open regional-fish and broader Section P anchors, roadmap integrations for R587/R590/R593, current Section P proposals and batches, active reference/form JSON, legacy-import identities, the research ledger, `IngredientSearch.kt`, the bundled manifest, and every manifest-listed recipe file. Exact candidate/phrase, picker, recipe-corpus, source-URL, and source-ID ownership checks were performed. The CFIA URLs reuse their existing IDs; the Bangladesh Yearbook URL and new S01 have no current owner. The proposal-stage R01 audit was read-only. After review, root integrated the reference and ledger record, updated the plan and roadmap, and added an integration README. Static package, schema/source-ownership, picker, corpus, encoding, link, and whitespace checks passed. No application tests, build, emulator run, or deployment were needed for this database-JSON addition under `AGENTS.md`.

## Accepted integration

Added identity-only **rohu / labéo roho** as `ingredient-ref-rohu`, scoped to *Labeo rohita*, with no aliases, forms, measures, densities, unit mappings, recipe links, conversions, yields, or substitutions. Used the exact CFIA fish-label pair for the English and fr-CA displays. Kept `Rui` source-local and documented the 2023–24 production figure as historical regional context, not current data. See the [integration README](../batches/wp04-section-p-rohu-identity-integration-r594-20261017/README.md). R587, R590, R593, and the broader Section P work remain unchanged.

# WP04 Section P — toad crab / *Hyas* identity boundary review (R81)

- **Open checklist line:** `[ ] Shrimp/prawn by meaningful preparation; crab and crayfish.` in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Candidate:** Québec-listed `Crabe araignée / Toad crab, Hyas sp.`
- **Recommendation:** Hold active allocation. Québec sources identify a historical supplier product at the genus level, but do not establish one species or a safe, unambiguous bilingual picker display. No reference, form, ledger record, or recipe link is proposed.
- **Snapshot audited:** 1,408 active references, 104 forms, 1,747 research-ledger records, and 63 legacy-import candidates; all 114 bundled recipes and 1,123 ingredient rows.

## Scope and archive overlap

This review covers the unresolved naming and identity boundary for the toad-crab product group. It does not reopen R77 rock crab, R78 soft-shell crab, or the existing snow-crab, Jonah-crab, Dungeness-crab, blue-crab, generic crab-meat, and crab-flavoured pollock-flake decisions.

The archive contains no dedicated `toad crab`, `Hyas`, or `crabe araignée` identity review or active allocation. The R77 rock-crab proposal cites DFO’s commercial-fisheries page, whose title mentions toad crab; that citation is fishery-page context only and does not assess a toad-crab identity or picker name. The earlier generic-crab proposal cites OQLF’s snow-crab naming note about `crabe araignée`; it does not review *Hyas* or the Québec supplier entry. Candidate-term scans found no live reference, form, ledger record, or legacy candidate for `toad crab`, `crabe araignée`, `crabe lyre`, or *Hyas*.

The source-ID prefix `WP04-SECTIONP-TOAD-CRAB-BOUNDARY-R81-20261013-` is not present in the current proposal, batch, or ledger archive. The exact source-register IDs below are unique within this proposal and do not collide with existing ledger source IDs.

## Identity, product scope, and Québec naming

CFIA’s Fish List separates *Hyas araneus* (TSN 98426) from *H. coarctatus* (TSN 98423). It lists `Toad Crab` for each but leaves the French cell blank. It also lists `Atlantic Lyre Crab / Crabe araignée` for both species [S01]. CFIA says its common-name guidance applies to people preparing or importing fish for commercial purposes in Canada [S02]. These are Canadian fish-label sources, not a recipe synonym policy.

Government of Canada TERMIUM Plus gives species-qualified terms: *H. araneus* includes `Atlantic lyre crab / crabe lyre de l’Atlantique`, while *H. coarctatus* includes `lesser toad crab` and `Arctic lyre crab / crabe lyre de l’Arctique`. TERMIUM also records `toad crab` as a common name for both species; it says `crabe araignée` applies to other *Hyas* species and *Maja squinado*, and `crabe lyre` is shared among *Hyas* species [S03]. This supports the group boundary but does not make the broad names species-specific.

Exploramer/Fourchette bleue’s **2022** Québec supplier directory lists `Crabe araignée, Toad crab, Hyas sp.` It reports Fruits de Mer Madeleine as fresh from mid-September to mid-October for Québec and Montréal, and Mermax as frozen year-round for Saguenay–Lac-Saint-Jean, Charlevoix, Côte-Nord, and Baie-Comeau [S04]. This is evidence that a Québec supplier directory described a *Hyas* product group in 2022. `Hyas sp.` leaves the species unspecified; the directory does not establish that the product was *H. araneus*, *H. coarctatus*, or multiple species. It is not evidence of current 2026 inventory.

OQLF’s Québec entry for `crabe des neiges` says `crabe araignée` has been used in some contexts but was not retained for Québec commercial fish-product labeling, to avoid consumer confusion and normalize one term per specific species [S05]. This is a naming caution scoped to Québec commercial labeling, not a ban on every use of `crabe araignée`, and it does not prove anything about current *Hyas* supply. Together with TERMIUM’s shared-name notes, however, it makes an unqualified `crabe araignée` picker row a poor identity label. The species-qualified French terms do not resolve the supplier’s unspecified `Hyas sp.` product.

## Current ownership and picker projection

Current crab-related active references are:

| Reference ID | Display and aliases | Boundary |
|---|---|---|
| `ingredient-ref-blue-crab` | `blue crab / crabe bleu`; no aliases | Species identity, separate from the *Hyas* group. |
| `ingredient-ref-crab` | `crab meat / chair de crabe`; no aliases | Generic meat identity; attached form `ingredient-form-crab-jumbo-lump` is a commercial grade. |
| `ingredient-ref-crab-flavoured-pollock-flakes` | `crab-flavoured pollock flakes / goberge en flocons à saveur de crabe`; descriptive aliases | Pollock product, not crab. |
| `ingredient-ref-dungeness-crab` | `Dungeness crab / crabe dormeur`; aliases `crabe Dungeness`, `crabe de Dungeness` | Separate species identity. |
| `ingredient-ref-jonah-crab` | `Jonah crab / crabe nordique`; no aliases | Separate species identity. |

No candidate phrase is owned by the active references, forms, research ledger, or [legacy import identities](../legacy-import-identities.v1.json). The existing search implementation [normalizes bilingual names and aliases, checks complete word phrases first, then uses substring fallback](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

The following counts were checked against that phrase-first behavior and the current active reference/form terms:

| Query | Current results | Counterfactual if an unqualified `toad crab / crabe araignée` row were added | Assessment |
|---|---:|---:|---|
| `toad crab` | 0 | 1 | A singleton would appear to identify the product, although the Canadian common name covers two species and the Québec supplier left its species unspecified. |
| `crabe araignée` | 0 | 1 | A singleton would hide the shared *Hyas* / *Maja* terminology and the Québec snow-crab labeling caveat. |
| `Hyas`, `Hyas araneus`, `Hyas coarctatus`, `crabe lyre` | 0 each | Not added | No Latin name or other broad group term is proposed as an alias. |
| `crab`, `crabe` | 5 each | 6 each | Broad search remains multiple-choice; its extra result would not fix the unqualified-name boundary. |

Do not attach `toad crab` or `crabe araignée` as aliases to any single-species reference. Do not select either *Hyas* species from the directory’s genus-only wording, and do not create a custom parenthetical label to make the picker appear more certain than the source.

## Bundled recipe demand and numeric evidence limits

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `toad crab`, `crabe araignée`, `crabe lyre`, *Hyas*, *H. araneus*, *H. coarctatus*, `Atlantic lyre crab`, and related species-qualified phrases. The scan found **0 matching recipe files and 0 matching ingredient rows**.

The corpus’s existing crab request is recipe [019, “Boulettes de crabe / Crab Balls”](../../../app/src/main/assets/seed/bundled-library/recipes/019-boulettes-de-crabe-crab-balls-135813a6-75e2-4596-8c71-ffd450fab0ca.v1.json), ingredient 8: `1 lb jumbo lump crab meat`, already linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. It is a generic crab-meat grade request, not evidence for *Hyas* or a species substitution.

The directory’s `fresh`/`frozen` labels and mid-September-to-mid-October season are supplier availability descriptions from 2022. They provide no package mass, count, edible-meat fraction, recipe measure, or transferable value. Record no measure, density, unit mapping, conversion, cooking yield, edible yield, package yield, or numeric product specification. The directory’s delivery regions and season must not be treated as current supply data.

No source or bundled recipe supports a substitution between this unresolved *Hyas* product and blue crab, Dungeness crab, Jonah crab, snow crab, generic crab meat/Jumbo Lump, or crab-flavoured pollock. Add no global conversion, contextual substitution, or recipe-line substitution.

## Recommendation and exact future JSON delta

**Hold** the candidate outside active references, forms, legacy mappings, and the research ledger. Reconsider only if a current Québec source supplies a species-qualified product name or a picker display can represent the unresolved group without making an ambiguous common name look species-specific.

The exact proposed append delta is zero:

```json
{
  "ingredient-references.v1.json": [],
  "ingredient-forms.v1.json": [],
  "research-ledger.v1.json.records": [],
  "legacy-import-identities.v1.json.candidates": [],
  "recipeIngredientLinks": [],
  "unitConversions": [],
  "packageYields": [],
  "substitutions": []
}
```

This JSON block is a proposal delta manifest, not a database object to insert. No ingredient or ledger schema change is proposed. No tests or emulator work are needed for this proposal-only hold.

## Source register

| Source ID | Source and locator | What it supports and does not support |
|---|---|---|
| `WP04-SECTIONP-TOAD-CRAB-BOUNDARY-R81-20261013-S01` | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSNs 98426 and 98423. | Lists *H. araneus* and *H. coarctatus*, each with English `Toad Crab` and no French for that name; both also have `Atlantic Lyre Crab / Crabe araignée`. Canadian fish common-name listing, not recipe equivalence or Québec retail availability. |
| `WP04-SECTIONP-TOAD-CRAB-BOUNDARY-R81-20261013-S02` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), scope section. | Defines commercial Canadian fish-preparation/import context for the guidance and Fish List. It is not an app alias standard. |
| `WP04-SECTIONP-TOAD-CRAB-BOUNDARY-R81-20261013-S03` | Government of Canada Translation Bureau, [TERMIUM Plus, crustacean records for *Hyas araneus* and *H. coarctatus*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=1&index=frr&lang=fra&srchtxt=AUSSI), records dated 2026-03-09. | Species-qualified English/French names and explicit shared-name observations for `toad crab`, `crabe araignée`, and `crabe lyre`. Terminology evidence; not local supply or label authorization. |
| `WP04-SECTIONP-TOAD-CRAB-BOUNDARY-R81-20261013-S04` | Exploramer / Fourchette bleue, [Répertoire des fournisseurs 2022](https://exploramer.qc.ca/wp-content/uploads/2022/05/22.05.04-Repertoire-des-fournisseurs-2022.pdf), p. 5, item 10. | Québec supplier-directory entry `Crabe araignée, Toad crab, Hyas sp.` plus dated fresh/frozen and service-area descriptions. It does not identify the exact species or establish current stock, package size, or recipe measure. |
| `WP04-SECTIONP-TOAD-CRAB-BOUNDARY-R81-20261013-S05` | OQLF, [crabe des neiges, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198901/crabe-des-neiges), updated 2012. | Québec-specific note that `crabe araignée` was not retained for commercial fishing-product labeling of snow crab to prevent consumer confusion. It is a scoped naming caution, not a ban or a finding about *Hyas* products. |

## Static review record

- Read the current `AGENTS.md`, exact open Section P line, current search implementation, active references/forms, ledger, legacy identities, recipe manifest/files, and proposal/batch archive before selecting the candidate.
- Confirmed live counts of 1,408 references, 104 forms, 1,747 ledger records, 63 legacy candidates, 114 recipe files, and 1,123 ingredient rows; all current JSON sources parsed successfully.
- Confirmed zero active/legacy/archive ownership for candidate identity terms; the only prior archive mentions are the R77 DFO page title and generic-crab proposal’s OQLF snow-crab note described above.
- Recomputed current picker results for candidate and broad queries from [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt); candidate terms return no current rows and broad `crab`/`crabe` queries return five each.
- Static artifact checks: UTF-8 without BOM, final newline, no trailing whitespace or mojibake, valid fenced JSON, unique source IDs with no live-ledger collisions, and all relative Markdown links resolve. Parsed the checked-in research-ledger schema; this zero-delta proposal contains no schema-bound record to validate. No app tests or emulator were run.

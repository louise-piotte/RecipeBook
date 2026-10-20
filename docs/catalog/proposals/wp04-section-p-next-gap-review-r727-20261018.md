# WP04 Section P — sailfish genus-scope review (R727)

- **Review date:** 2026-10-18.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, integration, or generated file was changed.
- **Recommendation:** Add one identity-only `PROTEIN` reference for the Canadian genus-level label **sailfish / voilier**, scoped to the CFIA `Istiophorus spp.` entry. Do not assign the unqualified label to *I. platypterus*, add the separate Indo-Pacific species name, or add forms, aliases, measures, conversions, yields, recipe links, or substitutions.

## Open gap and review boundary

The WP04 Section P parent remains open for salmon, cod, pollock, flatfish, other named finfish, and regional fish in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6792). Recent [R722–R724 integration](../batches/wp02-wp03-wp04-r722-r724-gap-review-integration-20261018/README.md) held the unrelated Red Mullet group; this proposal does not revisit that decision or the R718 rock-sole/dab hold.

This is a distinct name-scope gap. The earlier blue-marlin proposal mentions sailfish only as a neighbor in its recipe scan; it neither evaluated an *Istiophorus* identity nor allocated a sailfish row. The reviewed [swordfish proposal](wp04-section-p-swordfish-espadon-identity-review-20261012.md) likewise names sailfish only to preserve the neighboring billfish boundary. Neither is reopened here.

## Source evidence and limits

| Proposal-local source ID | Source | Evidence used and limit |
|---|---|---|
| `WP04-SECTIONP-SAILFISH-R727-20261018-S01` | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), rows for TSN 172487 and 172488; accessed 2026-10-18. | The list gives *Istiophorus spp.* as **Sailfish / Voilier**, and separately lists *I. platypterus* as **Indo-pacific Sailfish / Voilier De L'indo-pacifique**. These are Canadian fish-labelling names and taxonomic scopes; the result does not show current Québec retail stock or a recipe use. The Fish List last-modified date shown in the results is 2023-09-18. |
| `WP04-SECTIONP-SAILFISH-R727-20261018-S02` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), purpose and scope; accessed 2026-10-18. | CFIA says the list supplies English/French common names acceptable for Canadian fish labelling and links them to scientific names and TSNs. This validates the regulatory naming context, not local product availability or culinary behavior. |
| `WP04-SECTIONP-SAILFISH-R727-20261018-S03` | OQLF, [voilier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8877509/voilier), accessed 2026-10-18; last updated 1988. | OQLF gives Québec **voilier**, English **sailfish**, and defines the fish at genus *Istiophorus* scope. The entry is in zoology/ichthyology, not the edible-fish terminology domain, and does not establish Québec retail availability. It corroborates the French label and broad scope, not food-market demand. |
| `WP04-SECTIONP-SAILFISH-R727-20261018-S04` | ITIS, [*Istiophorus platypterus*, TSN 172488](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=0172488), accessed 2026-10-18. | ITIS lists *I. platypterus* as valid and *I. albicans* among its synonyms. This is taxonomy context only; it is not a Canadian or Québec product-name source. It cautions against inventing separate Atlantic/Indo-Pacific species rows from older name usage. |
| `WP04-SECTIONP-SAILFISH-R727-20261018-S05` | First Global Seafood, [Sailfish](https://firstglobalseafood.com/product/sailfish/), accessed 2026-10-18. | The page names *I. platypterus*, English `Sailfish`, French `voilier`, and fillet, steak, cubes, and HGT forms. Its contact address is in London, England; it is not evidence of Canadian/Québec supply or French-Canadian naming. No form, measure, or SKU detail is transferred. |

CFIA and OQLF align on a genus-level bilingual name pair. ITIS currently lists *I. platypterus* as the valid name and *I. albicans* as a synonym; therefore, this proposal does not claim that the group contains multiple currently accepted species. It represents the broader CFIA market-label scope without assigning the ordinary market term to a single species.

The exact **Indo-pacific Sailfish / Voilier De L'indo-pacifique** CFIA row is not proposed as a second active reference. It is species-qualified and could be reviewed separately if a recipe or product specifically requires it. Adding that row alongside the genus-level name now could create two apparently distinct fish choices without evidence that the market/product boundary is distinct under current taxonomy. Adding it alone would make broad `sailfish` and `voilier` searches look species-resolved.

## Proposed bounded data delta

Add only identity-level `sailfish / voilier` for the genus-level CFIA name group. Use the paired official labels as the displays, with no aliases. Do not add the Indo-Pacific species name, scientific name, `billfish`, `marlin`, or any product form as an alias. Keep the following out of this delta:

- species-specific *Istiophorus* references or assignments;
- fillet, steak, cube, headless-gutted-tailed, fresh, frozen, smoked, or other form records;
- density, unit mappings, measures, conversions, edible/cooking yields, or package yields;
- recipe links or substitution findings/rules.

No reviewed source supports a reusable measure or a safe culinary substitution. The foreign seller's forms establish only its own product menu. The recipe corpus has no sailfish demand.

The following examples use **proposal-local identifiers only**. They are not shared allocations. The reference object matches the current `IngredientReference` shape; the ledger object is an identity-only record with no numeric observations.

```json
{
  "id": "ingredient-ref-sailfish-market-group",
  "nameFr": "voilier",
  "nameEn": "sailfish",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "PROTEIN"
}
```

```json
{
  "recordId": "ingredient-ref-sailfish-market-group",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-SAILFISH-R727-20261018-S01",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "CFIA Fish List lookup results",
      "accessedOn": "2026-10-18",
      "locator": "Rows for TSN 172487 (*Istiophorus* spp.) and TSN 172488 (*I. platypterus*).",
      "supports": "The CFIA group row pairs Sailfish / Voilier with Istiophorus spp.; the separate species row is Indo-pacific Sailfish / Voilier De L'indo-pacifique. This is Canadian fish-labelling evidence, not proof of Québec stock or a recipe measure.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SAILFISH-R727-20261018-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8877509/voilier",
      "title": "OQLF, voilier (GDT)",
      "accessedOn": "2026-10-18",
      "locator": "Preferred term, English equivalent, and definition at genus Istiophorus scope.",
      "supports": "Supports Québec French voilier as the genus-level counterpart to sailfish. The entry is zoological and does not establish current edible-fish retail supply.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Represent the CFIA genus-level Sailfish / Voilier market-label scope without assigning the broad terms to one species. Do not add the separate Indo-Pacific species name or infer current Québec stock, forms, measures, yields, or substitutions.",
      "sourceIds": [
        "WP04-SECTIONP-SAILFISH-R727-20261018-S01",
        "WP04-SECTIONP-SAILFISH-R727-20261018-S03"
      ]
    }
  ]
}
```

## Current ownership and source audit

The live package contains **1,845 ingredient references**, **174 forms**, **56 legacy-import candidates**, and **2,228 research-ledger records**. Exact and normalized-key checks across references, aliases, forms, legacy entries, ledger record IDs, and source text found no current owner for `sailfish`, `voilier`, *Istiophorus*, the CFIA species-qualified wording, `ingredient-ref-sailfish-market-group`, or the proposal-local R727 source-ID prefix. No active reference or form connects a recipe to this candidate.

The generic CFIA results URL is already shared by 43 ledger records and 30 distinct source IDs; the CFIA overview URL is shared by 33 records and 15 source IDs. Neither URL currently has a sailfish-specific ledger claim. The OQLF `voilier` and ITIS TSN 172488 URLs have no current ledger source entry. Source IDs above are proposal-local; integration should recheck exact URL/source-ID ownership and may reuse an existing CFIA source record if its locator and support cover these rows. No shared source ID is allocated here.

## Phrase-first picker projection

Projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases across bilingual names and aliases take precedence; substring matching is used only when no full phrase is found. The candidate is the single genus-level reference above and has no aliases or forms.

| Query | Current results | With proposal | Result boundary |
|---|---:|---:|---|
| `sailfish` | 0 | 1: sailfish / voilier | Resolves to the genus-level market-label identity, not one species. |
| `voilier` | 0 | 1: sailfish / voilier | Resolves to the aligned Québec French genus-level term. |
| `Indo-pacific Sailfish` | 0 | 0 | The species-qualified term remains intentionally unassigned; no species alias is added to the broader group. |
| `voilier de l’Indo-Pacifique` | 0 | 0 | Same species-specific boundary remains explicit. |
| `billfish` | 0 | 0 | No billfish-family alias or group is added. |
| `Istiophorus` | 0 | 0 | Scientific names are not aliases or display terms. |
| `sail` | 0 | 1: sailfish / voilier | Expected substring fallback only; the visible result remains the sailfish group. |
| `fish` | 18 | 18 | Existing full-phrase results take precedence; no broad-result change. |
| `poisson` | 14 | 14 | Existing full-phrase results take precedence; no broad-result change. |

The only candidate string matches are its two bilingual display terms. Do not add `sailfish` or `voilier` as aliases to the Indo-Pacific species name, and do not infer a relationship to swordfish, marlin, or other billfish beyond taxonomy.

## Recipe corpus and numeric scope

The manifest-ordered scan parsed all **114** bundled recipe files and **1,123** structured ingredient rows. It searched complete normalized phrases in all recipe JSON strings and ingredient rows for `sailfish`, `voilier`, `Istiophorus`, `Indo-Pacific Sailfish`, `voilier de l’Indo-Pacifique`, `billfish`, and the proposed reference ID. It found **no file hits, ingredient-row hits, or recipe links**.

With no recipe or measured source context, the proposal adds no mass/volume amount, density, unit mapping, conversion, edible portion, cooking yield, package yield, recipe link, or substitution. It does not infer raw-consumption, curing, storage, or cooking-safety equivalence from the UK supplier's general preparation wording.

## Static checks and test scope

- Confirmed the open Section P parent item and recent workflow/roadmap progress; R724 is the latest integrated Section P item.
- Audited current reference, form, legacy, ledger-ID, source-text, source-URL, and exact alias ownership. Proposal-local ID prefix is unallocated.
- Simulated the exact-phrase-first picker behavior for current and proposed references; `fish` and `poisson` result counts are unchanged.
- Scanned the full manifest-listed recipe corpus and all structured ingredient rows; no candidate demand or link was found.
- Validated both JSON examples against the current ingredient-reference and research-ledger schemas. `python3 tools/seed_package/normalize_bundled_seed_package.py --check --validate-only` passed, and `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` reported the generated catalog current at 1,845 references. Documentation is UTF-8 without BOM; no database JSON or generated catalog file was changed.
- Checked local Markdown targets and whitespace; both passed.
- No software tests, build, emulator, or deployment were run. This is proposal-only research, and the current `AGENTS.md` also exempts database-JSON-only changes from software testing.

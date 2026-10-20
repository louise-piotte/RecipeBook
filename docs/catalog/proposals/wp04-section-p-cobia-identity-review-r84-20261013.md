# WP04 Section P — Cobia identity review (R84)

- **Review date:** 2026-10-13.
- **Recommendation:** Integrate one identity-only `PROTEIN` reference, **cobia / cobia**, for *Rachycentron canadum*.
- **Data boundary:** Add no aliases, forms, measurements, density, unit mappings, conversion, yield, recipe link, or substitution.
- **Repository rule:** Proposal-only research. `AGENTS.md` says changes limited to database JSON data need no app tests; no tests or emulator were run.

## Open checklist line and distinctness

The live [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4205) still has this open parent line:

> [ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.

The active catalog plan, proposal archive, and batch archive contain no focused Cobia / *Rachycentron canadum* decision. This is distinct from R83 barracuda and the prior species, product, or picker holds listed under the same broad checklist. Prior generic grouper/snapper/bass holds are not reopened.

The current package snapshot has **1,412 ingredient references, 104 forms, 63 legacy candidates, and 1,751 research-ledger records**. Exact ownership scans found no reference, form, legacy candidate, or ledger record for `cobia`, *Rachycentron canadum*, `cabio`, `mafou`, `black bonito`, `sergeant fish`, or `crabeater`; `ingredient-ref-cobia` is unallocated. No archive occurrence of the candidate or scientific name was found. The source-ID prefix `WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-` is new.

## Identity and Québec naming scope

OQLF’s fish-food entry names the edible species *Rachycentron canadum*, gives **cobia** as both the preferred Québec French term and the English term, and notes commercial potential in Québec. The entry says French `mafou`, `cabilo`, and `cabio` were not retained for Québec fish-product marketing; its English equivalents also include `cabio`, `black bonito`, `sergeant fish`, and `crabeater`. The accepted display pair is therefore **cobia / cobia**, with no aliases. The OQLF entry was last updated in 2011; it establishes terminology and species scope, not current inventory. [S01]

The CFIA Fish List independently maps TSN **168566** to *Rachycentron canadum*, English **Cobia**, French **Cobia**, family Rachycentridae. This confirms a single species-level Canadian label identity. The CFIA list is regulatory naming evidence, not a recipe synonym or picker policy. [S02]

Poissonnerie La Mer’s bilingual Montréal arrival sheet dated **2026-01-23** lists `FILET DE COBIA 'OPEN BLUE' / OPEN BLUE' COBIA FILLET`, Panama, farmed, sold by `KG`. It also lists an Open Blue whole cobia entry from Panama, farmed, marked `H-OFF / S-TÊTE` and with a `6/8` size code. These are dated seller presentations; neither line prints the scientific name or establishes current stock. The source supports Québec use of the bilingual name, while the OQLF and CFIA records supply the taxon mapping. [S03]

## Current ownership and picker projection

The active reference, form, legacy, and ledger files contain no exact owner for the candidate’s bilingual display or stable ID. The listed other English terms are deliberately excluded. In particular, **black bonito** is not added: it is an OQLF English equivalent, but it would make broad `bonito` search return cobia alongside the existing Atlantic and dried-bonito records. The Québec-rejected `mafou`, `cabilo`, and `cabio` forms are also excluded; `sergeant fish`, `crabeater`, and the Latin binomial are not needed for a Québec-facing picker row.

`IngredientSearch.kt` first finds complete normalized word phrases across reference displays, aliases, and form terms, then falls back to substring matching only when no phrase matches. A projection using the current 1,412 references / 104 forms and a synthetic reference with only the proposed displays gives:

| Query | Current picker | With proposed row | Boundary |
|---|---|---|---|
| `cobia` | No result | One result: **cobia / cobia** | Direct species-name selection. |
| `cobia fillet` | No result | No result | The seller’s fillet SKU does not become a form or alias. |
| `cabio`, `mafou`, or `crabeater` | No result | No result | Not added as aliases; Québec product terminology prefers `cobia`. |
| `black bonito` | No result | No result | Excluded to avoid adding a third result to broad `bonito`. |
| `bonito` | Atlantic bonito and dried bonito | Same two results | Existing results remain unchanged. |
| `sergeant fish` or *Rachycentron canadum* | No result | No result | Alternate English wording and Latin name stay out of picker terms. |

The same word is the preferred French and English display, so a query in either locale resolves to the same species identity. No broad `fish` / `poisson`, `bonito`, `fillet` / `filet`, or general seafood alias is introduced. The app has no product-origin or farmed/wild disambiguation; the proposed identity does not encode the supplier’s Panama origin or aquaculture status.

## Recipe demand and numeric/form/substitution limits

The manifest lists **114 recipes and 1,123 ingredient rows**. All manifest-listed recipe JSON files and ingredient rows were scanned for `cobia`, *Rachycentron canadum*, and the OQLF-listed alternate terms. The scan found **zero matching files and zero matching rows**. There is no bundled recipe demand, role, method, amount, or recipe link for cobia.

The local supplier’s `KG` field is a sales unit, not a package mass or household measure. Its whole-fish `6/8` code is unexplained in the document, so it is not interpreted as kilograms, pounds, count, or a per-fish weight. No reviewed source supports a reusable household measure, density, unit mapping, mass-volume conversion, edible yield, or raw-to-cooked yield. The evidence review therefore supports ledger state `measurementState: researched_no_supported_value`, but no measurement observation or runtime numeric behavior.

The vendor lists a fillet and a separate head-off whole product. They remain supplier-specific presentations; no recipe demand or cross-source culinary evidence supports catalog forms or a conversion between them. No reviewed identity or product source establishes a substitute or method-scoped replacement. Since no dedicated substitution study was performed, keep `substitutionResearchState: not_yet_researched`; add no global/contextual substitution or recipe-line substitution.

## Exact proposed database delta

If accepted, add this one reference row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-cobia",
  "nameFr": "cobia",
  "nameEn": "cobia",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

Add one verified `ingredient_reference` record for the same ID to the research ledger. This is the complete prospective ledger delta; add no form, measurement observation, conversion, yield, substitution finding, or recipe link.

```json
{
  "recordId": "ingredient-ref-cobia",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199007/cobia",
      "title": "Office québécois de la langue française, GDT: cobia",
      "accessedOn": "2026-10-13",
      "locator": "Preferred term, English equivalent, species name, commercial-potential note, and excluded names",
      "supports": "Normalizes cobia as the Québec fish-product term and English equivalent for Rachycentron canadum; identifies the edible-fish scope and commercial potential in Québec, and says mafou, cabilo, and cabio were not retained for Québec fish-product marketing.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Last updated 2011; preferred term normalized 1989"
    },
    {
      "sourceId": "WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S02",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "Canadian Food Inspection Agency, Fish List",
      "accessedOn": "2026-10-13",
      "locator": "Search result for cobia; TSN 168566",
      "supports": "Maps Rachycentron canadum to English Cobia and French Cobia in family Rachycentridae.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Fish List page modified 2023-09-18"
    },
    {
      "sourceId": "WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S03",
      "url": "https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_23-01-2026.pdf?v=1769118808",
      "title": "Poissonnerie La Mer, Arrival list / Liste des arrivages, 2026-01-23",
      "accessedOn": "2026-10-13",
      "locator": "Page 1, bilingual Open Blue cobia fillet and whole head-off rows",
      "supports": "A dated Montréal fishmonger arrival sheet lists an Open Blue Cobia fillet and a separate whole head-off Cobia from Panama, farmed; KG is the sales unit and the whole-product 6/8 code is unexplained.",
      "sourceKind": "other",
      "versionOrDate": "2026-01-23 arrival list"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only PROTEIN reference cobia / cobia for Rachycentron canadum. Use the OQLF-preferred Québec and English display with empty aliases. Keep supplier fillet and whole head-off presentations unmodeled because no bundled recipe demands them; do not interpret KG or 6/8 as a reusable quantity. No recipe link, measurement observation, numeric rule, or substitution is proposed.",
      "sourceIds": [
        "WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S01",
        "WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S02",
        "WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S03"
      ]
    }
  ]
}
```

## Source register

| Source ID | Source | Use and limits |
|---|---|---|
| WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S01 | Office québécois de la langue française, [GDT: cobia](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199007/cobia), last updated 2011. | Gives the preferred Québec French and English term `cobia`, Latin *Rachycentron canadum*, and Québec commercial-potential scope. Explicitly says `mafou`, `cabilo`, and `cabio` were not retained for Québec fish-product marketing. The English equivalents also include `black bonito`, `sergeant fish`, and `crabeater`; these are not proposed aliases. Terminology evidence, not current inventory or measurement evidence. |
| WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S02 | Canadian Food Inspection Agency, [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), search `cobia`, retrieved 2026-10-13. | Row TSN 168566 maps *R. canadum* to `Cobia / Cobia`, family Rachycentridae. Canadian fish-label name evidence; it does not define recipe-picker behavior, substitutions, or product form. The list page reports a 2023-09-18 modification date. |
| WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S03 | Poissonnerie La Mer, [Arrival list / Liste des arrivages, 2026-01-23](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_23-01-2026.pdf?v=1769118808). | Dated Montréal supplier list provides bilingual fillet wording and a separate whole head-off Open Blue product from Panama marked farmed. `KG` is only the sale unit; `6/8` is unexplained. It gives no binomial, current stock confirmation, transferable measure, or yield. |

## Static review record

- Re-read current `AGENTS.md`, the open Section P checklist line, proposal/batch archive, live references/forms/legacy/ledger, recipe manifest, and recipe corpus.
- Checked stable ID, exact bilingual-term ownership, source-ID-prefix collisions, and candidate-term overlap in the current archive.
- Projected current and synthetic-candidate queries using the current `IngredientSearch.kt` phrase-first/fallback behavior and attached form terms.
- Scanned all 114 manifest-listed recipe files / 1,123 ingredient rows; zero candidate-term hits.
- Proposal-only static checks: UTF-8 without BOM, final newline, no trailing whitespace, local Markdown links, unique source IDs, ledger schema states, reference/ledger JSON parsing and shape. No app tests, Gradle tasks, or emulator were run.

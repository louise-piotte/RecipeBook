# WP04 Section P — fresh whole barramundi form review (R676)

- **Review/source-access date:** 2026-10-18.
- **Open item:** [Section P finfish and regional-fish coverage](../../RecipeBook-global-ingredient-catalog-plan.txt#L6670).
- **Candidate:** Fresh whole barramundi, *Lates calcarifer*, under active `ingredient-ref-barramundi`.
- **Recommendation:** Integrate one fresh-whole form and one form-level research-ledger record. Leave measures, recipe links, and substitutions unset.
- **Status:** Integrated 2026-10-18; see the [integration README](../batches/wp04-section-p-barramundi-fresh-whole-form-integration-r676-20261018/README.md). The source, ownership, and picker counts below are the pre-integration proposal snapshot.
- **Form-ledger source IDs:** `WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S01`–`S03` were allocated to the new form record; `R01` remains a repository-audit label, not a ledger source ID.

## Candidate and bounded shape

The active Barramundi reference is identity-only and has no forms. Metro’s bilingual Québec-facing fish guidance describes fresh whole Barramundi and recommends cooking it whole. The archive contains WP06’s identity review and R331’s sea-bass-family naming boundary, but no focused review of this product form. R331 keeps `Asian seabass` and `seabass` off the Barramundi aliases because OQLF assigns those English equivalents to *L. calcarifer*; this review preserves that boundary. R668’s Atlantic mackerel and R672’s Hoki form are separate completed reviews and excluded.

| Proposed form ID / parent | English display | Québec French display | Qualified match terms |
|---|---|---|---|
| `ingredient-form-barramundi-fresh-whole` / `ingredient-ref-barramundi` | `fresh whole barramundi` | `barramundi frais entier` | EN `whole barramundi`; FR `barramundi entier` |

Do not add generic `whole fish` / `poisson entier` terms or infer scaled, gutted, gilled, trimmed, or frozen states.

## Current naming and Québec product evidence

| Source | Finding and limit |
|---|---|
| CFIA, [*Lates calcarifer* Fish List result](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=&cmbIn=s&lang=e&q=Lates+calcarifer) [S01] and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) (generic URL already owned in ledger) | TSN 167669 pairs *L. calcarifer* with **Barramundi / Barramundi**. A separate English-only `Barramundi Perch` row is not proposed as an alias. CFIA supports Canadian fish-label naming, not a product form or stock. |
| OQLF, [GDT `barramundi`, fiche 8349020](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8349020/barramundi) [reused `WP06-OCEANIA-ANIMAL-20261012-S06`] | Identifies *L. calcarifer* and prefers French `barramundi` / `perche barramundi`; English equivalents include `Asian seabass` and `seabass`. Terminology source, not product evidence. |
| Metro, [French guidance](https://www.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/barramundi) and [English guidance](https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/barramundi) [S02–S03] | Current bilingual copy says Metro fishmongers offer **barramundi frais entier / fresh whole barramundi** and recommends whole cooking. This is Québec-facing retail guidance, not a live stock feed, dated SKU, or store-specific inventory; it does not specify whether the fish is scaled, gutted, or gilled. |

The sources support the bilingual identity and the proposed presentation. Metro provides Québec-market context, but no specific current item or store inventory can be claimed.

## Ownership, archive, and source audit

Pre-integration read-only snapshot: **1,837 references**, **167 forms**, **56 legacy candidates**, and **2,213 ledger records** (10,364 source entries; 8,753 distinct source IDs; 7,402 distinct URLs). It predates R674 and R675 integration. The manifest lists **114 recipes / 1,123 ingredient rows**. [R01]

- `ingredient-ref-barramundi` is the verified active *L. calcarifer* identity (`PROTEIN`), with no aliases or forms; density and unit mappings are empty. Its measurement and substitution research remains `not_yet_researched`.
- The proposed form ID and exact bilingual labels have no exact active reference/form, legacy, or ledger owner. Whole-tilapia terminology already owns the generic search phrases `whole fish` / `poisson entier`.
- The R676 proposal path and source-ID prefix were absent from the archive and ledger before this file. The parent Barramundi record already owns OQLF source `WP06-OCEANIA-ANIMAL-20261012-S06`; it remains there and is not duplicated on the form record. The exact CFIA query URL and both Metro URLs were unowned in the pre-integration snapshot and now have one source ID each on the form record. The generic CFIA overview URL is already shared by other records and was not duplicated.
- R331 is an adjacent alias-boundary review, not a prior fresh-whole form decision. No earlier focused WP04 review of this form was found.

## Picker projection

The read-only projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized phrases win before substring fallback; forms resolve to the parent, with a form hint for an exact label or match-term query. [R01]

| Query | Current | With proposed form | Effect |
|---|---|---|---|
| `barramundi` | Barramundi | Same | Identity unchanged. |
| `fresh whole barramundi`; `barramundi frais entier` | None | Barramundi + form hint | Exact bilingual product wording becomes selectable. |
| `whole barramundi`; `barramundi entier` | None | Barramundi + form hint | Qualified form searches; no generic terms added. |
| `whole fish`; `poisson entier` | Whole Tilapia | Same | Generic query stays with its current owner. |
| `whole`; `entier`; `fresh`; `frais` | 38; 15; 31; 25 | 39; 16; 32; 26 | Each remains multi-result. |
| `fillet`; `filet` | 7; 2 | 7; 2 | No cut-query collapse. |

## Recipe demand and numeric limits

The full manifest-ordered corpus scan searched decoded recipe JSON and ingredient rows for `barramundi`, *Lates calcarifer*, `perche barramundi`, `fresh whole barramundi`, and `barramundi frais entier`: **zero matching files or rows**. The corpus has 114 recipe files, 1,123 ingredient rows, and 754,048 bytes; manifest-ordered recipe-byte SHA-256: `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`. [R01]

No recipe link or quantity is supported. Metro gives no package amount, edible fraction, count-to-mass relation, density, or household measure. No reviewed source establishes cooking yield or a directed fish substitution. Keep density, unit mappings, conversions, yields, and substitutions unset.

## Example form-level ledger delta

Integration added one `ingredient_form` record keyed by the proposed form ID. The parent identity keeps its existing OQLF source ID; the form record uses only the three previously unowned product/name URLs. Measurement and substitution research are complete for this narrow form with no supported reusable value or replacement. There are no source-backed numeric or substitution observations, so the record has no observation or finding arrays.

```json
{
  "recordId": "ingredient-form-barramundi-fresh-whole",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S01",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=&cmbIn=s&lang=e&q=Lates+calcarifer",
      "title": "CFIA, Fish List search results for Lates calcarifer",
      "accessedOn": "2026-10-18",
      "locator": "TSN 167669 search result rows",
      "supports": "Pairs Lates calcarifer with Barramundi / Barramundi. Supports the Canadian species-linked name, not a fresh-whole form, measure, product listing, or current stock.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S02",
      "url": "https://www.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/barramundi",
      "title": "Metro, Barramundi fish guidance (French)",
      "accessedOn": "2026-10-18",
      "locator": "Fresh-whole product wording and whole-versus-fillet cooking guidance",
      "supports": "Uses barramundi frais entier and recommends cooking Barramundi whole rather than as fillets. Qu\u00e9bec-facing product guidance; no dated SKU, store inventory, package amount, or prepared condition is specified.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S03",
      "url": "https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/barramundi",
      "title": "Metro, Barramundi fish guidance (English)",
      "accessedOn": "2026-10-18",
      "locator": "Fresh-whole product wording and whole-versus-fillet cooking guidance",
      "supports": "Uses fresh whole barramundi and recommends cooking Barramundi whole rather than as fillets. Qu\u00e9bec-facing product guidance; no dated SKU, store inventory, package amount, or prepared condition is specified.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept one fresh-whole form under ingredient-ref-barramundi. The bilingual Metro guidance supports the named product presentation. The reviewed corpus has no Barramundi line, and no reusable measure, density, yield, or directed substitute is supported.",
      "sourceIds": [
        "WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S01",
        "WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S02",
        "WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S03"
      ]
    }
  ]
}
```

## Bounded recommendation

**The integration added only `ingredient-form-barramundi-fresh-whole` under the existing Barramundi identity, plus the form-level ledger record shown above.** The bilingual displays and qualified match terms add exact form searches without making generic `whole fish`, `poisson entier`, `fillet`, or `filet` searches collapse. The parent identity and its OQLF source record are unchanged. No legacy candidate, recipe link, measure, conversion, yield, or substitution behavior was added. Section P remains open for remaining fish coverage.

## Source labels

Sources checked 2026-10-18. S01–S03 were assigned as form-ledger source IDs because their exact URLs were unowned in the pre-integration snapshot. Reuse the existing OQLF source ID on the parent record.

| ID | Source | Limit |
|---|---|---|
| `WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S01` | CFIA, [*Lates calcarifer* Fish List result](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=&cmbIn=s&lang=e&q=Lates+calcarifer) | Species-linked Canadian fish-label name; not form or stock evidence. The generic CFIA overview URL is already owned elsewhere and is not duplicated. |
| **Existing parent source `WP06-OCEANIA-ANIMAL-20261012-S06`** | OQLF, [GDT `barramundi`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8349020/barramundi) | Retained on `ingredient-ref-barramundi`; not duplicated on the form record. |
| `WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S02` | Metro, [French guidance](https://www.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/barramundi) | Exact URL unowned in the ledger snapshot; supports the French presentation, not store inventory or a SKU. |
| `WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-S03` | Metro, [English guidance](https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/barramundi) | Exact URL unowned in the ledger snapshot; supports the English presentation, not store inventory or a SKU. |
| `WP04-SECTIONP-BARRAMUNDI-FRESH-WHOLE-R676-20261018-R01` | Repository audit of plan, references/forms, legacy identities, ledger, proposal/batch archive, manifest/recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) | Read-only ownership, source-URL, picker, archive, and corpus checks; not a ledger source. |

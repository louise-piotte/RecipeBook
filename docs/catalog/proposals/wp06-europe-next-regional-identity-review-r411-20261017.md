# WP06 Section 05 — Pimentón de la Vera identity review (R411)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review creates only this proposal file; it does not change shared catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Scope:** One Spanish regional spice identity: the protected designation of origin (PDO) Pimentón de la Vera, a smoked and ground paprika. Keep it distinct from generic smoked paprika, generic paprika, and hot paprika.
- **Source-ID prefix:** `WP06-EUROPE-LA-VERA-PAPRIKA-R411-20261017`. The prefix, proposed reference ID, and source URLs were checked for collisions.

## Recommendation

Add one identity-only `BAKING_AND_SPICE` reference for **`Pimentón de la Vera / paprika fumé de La Vera`** if accepted. The European Union's current specification defines Pimentón de la Vera as a Spanish PDO for paprika made from specified pepper varieties, smoked-dried with oak and/or holm-oak wood and milled in the defined production area. It includes sweet, ocal/bittersweet, and hot flavor groups. [S01]

Use OQLF's preferred Québec French term **`paprika fumé`**, qualified by `de La Vera`. The Canadian French product listing also uses `paprika doux fumé de la Vera`. Keep the exact Spanish PDO name for English search and preserve it as the recognized product name. Do not add bare `pimentón` as a French alias: OQLF lists `pimenton` and `pimenton fumé` as discouraged French terms. [S02–S04]

The active catalog already distinguishes `smoked paprika`, `hot paprika`, and `paprika`. The proposed regional row is specifically for the La Vera PDO; it does not make every smoked paprika product a La Vera product. The bundled recipe corpus has no La Vera or Pimentón de la Vera demand. Its two generic smoked-paprika ingredient lines remain attached to the existing `ingredient-ref-smoked-paprika`; add no recipe links. [S01–S05]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-pimenton-de-la-vera",
  "nameFr": "paprika fumé de La Vera",
  "nameEn": "Pimentón de la Vera",
  "aliasesFr": [],
  "aliasesEn": ["smoked paprika from La Vera"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "BAKING_AND_SPICE"
}
```

The French display uses OQLF's preferred generic term with the source-backed regional qualifier; this is a descriptive display, not an OQLF ruling on the full PDO name. The English display preserves the official Spanish name used by Canadian product listings. The qualified English alias supplies a readable search phrase. Do not add `paprika`, `smoked paprika`, `pimentón`, `paprika fumé`, `Spanish paprika`, or a producer/brand name as aliases. The generic terms already match their own references and should continue to return a broader choice set.

## Identity and product boundaries

The current EU single document names **Pimentón de la Vera** as a PDO and defines it as ground, ripe red fruit of specified *Capsicum annuum* and *Capsicum longum* varieties, dried with oak and/or holm-oak wood in the traditional La Vera process. All production processes must occur in the designated area. The specification includes three flavor groups: sweet, ocal/bittersweet, and hot. [S01]

The proposed row covers that PDO umbrella and its documented flavor groups. It does not cover generic paprika, generic smoked paprika, hot paprika without the PDO identity, paprika from another region, or products that merely contain paprika. A source's use of `La Vera` or an unverified PDO claim is not by itself proof that every SKU meets the EU specification. The Canadian product pages support current market naming; the EU specification supplies the protected identity boundary. [S01, S03–S04]

Keep the nearby active references distinct:

- **`ingredient-ref-smoked-paprika` / `smoked paprika / paprika fumé`:** the general smoked-ground-paprika identity remains active. The proposed row adds only the region-qualified PDO product.
- **`ingredient-ref-hot-paprika` / `hot paprika / paprika fort`:** hot paprika is a separate general style. The PDO specification's hot group does not make every hot paprika a La Vera product.
- **`ingredient-ref-paprika` / `paprika`:** generic paprika remains distinct from the smoked PDO product.
- **Other Spanish products and composite foods:** do not include Spanish-style paprika without the PDO name, paprika-flavoured snacks, chorizo, sauces, or blends.

Refill&co's Québec page calls its generic smoked-paprika product “pimenton de la Vera,” but its ingredient line identifies only organic smoked paprika. The page does not establish a La Vera origin or PDO status. Treat it as a broad local wording collision, not as evidence that generic smoked paprika and the protected product are synonyms. OQLF's preferred `paprika fumé` supports keeping the French label clear and qualified. [S02, S05]

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Live count | Finding |
|---|---:|---|
| Active ingredient references | 1,714 | No exact owner for `Pimentón de la Vera`, `paprika fumé de La Vera`, `smoked paprika from La Vera`, or `ingredient-ref-pimenton-de-la-vera`. |
| Ingredient forms | 141 | No exact La Vera or Pimentón form label or match term. |
| Legacy import candidates | 56 | No exact candidate name, alias, or proposed reference ID. |
| Research ledger | 2,073 records; 9,384 source entries | No exact La Vera identity record, proposed ID, R411 source-ID prefix, or collision for the URLs below. |
| Proposal and batch archive | 3,803 files | An exact phrase and proposed-ID search found no prior La Vera paprika review, batch, or allocation. The target proposal path was unallocated. |

The nearby owners are `ingredient-ref-paprika`, `ingredient-ref-smoked-paprika`, and `ingredient-ref-hot-paprika`; none owns the regional name. The five source IDs and direct URLs below were absent from the ledger before drafting. The exact proposed reference ID was absent from active references, legacy candidates, the ledger, and the archive. The Europe coverage item remains open in the [regional checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L8936).

## Phrase-first picker projection

The projection follows the accent- and punctuation-folding phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It includes the proposed name and alias above.

| Query | Current result | With proposed row |
|---|---|---|
| `Pimentón de la Vera` | No exact result | `ingredient-ref-pimenton-de-la-vera` only |
| `paprika fumé de La Vera` | No exact result | `ingredient-ref-pimenton-de-la-vera` only |
| `smoked paprika from La Vera` | No exact result | `ingredient-ref-pimenton-de-la-vera` only |
| `smoked paprika`; `paprika fumé` | `ingredient-ref-smoked-paprika` only | `ingredient-ref-smoked-paprika` plus the regional PDO row |
| `hot paprika`; `paprika fort` | `ingredient-ref-hot-paprika` only | Same single result |
| `paprika` | Broad set including generic, hot, and smoked paprika references | Same broad set plus the regional PDO row |

The two broad smoked-paprika searches intentionally surface both the generic style and the qualified PDO identity because those phrases appear within the proposed names. This adds a choice; it does not establish equivalence. Do not add the generic terms as aliases.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan checked the full decoded recipe documents and each ingredient row for `Pimentón de la Vera`, `Pimenton de la Vera`, `paprika de la Vera`, `paprika fumé de La Vera`, `smoked paprika from La Vera`, and related accentless/word-order variants. It found **zero matching La Vera/Pimentón recipe files, zero matching ingredient rows, and zero recipe links**.

The broad phrase `smoked paprika` appears in two ingredient rows, both already linked to `ingredient-ref-smoked-paprika`:

- Recipe 018, *Turkey Meatballs / Boulettes de dinde*: `4 tsp smoked paprika`.
- Recipe 074, *Meatloaf / Pain de viande*: `1/2 tsp smoked paprika`.

These are generic recipe quantities, not evidence that either author intended a La Vera PDO product. Keep both rows unchanged. The manifest-order corpus fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`.

## Measurement and substitution disposition

The Canadian Qualifirst listing identifies a 55 g container of 24K `paprika doux fumé de la Vera` and reports a **5 g nutrition serving**. The listing does not provide a teaspoon, tablespoon, cup, mass-volume relation, or a visible statement that this exact SKU is certified under the PDO. Treat its package size and nutrition serving as SKU-specific label facts, not a reusable kitchen measure or a measurement for the protected regional identity. Add no `portion_weight`, package yield, `defaultDensity`, unit mapping, or conversion to the proposed row; if integrated, leave its reusable measurement state at `researched_no_supported_value`. [S03]

The two bundled recipe quantities belong to generic smoked paprika and cannot be transferred to the proposed row. No reviewed source establishes a tested replacement ratio or general use of generic paprika, hot paprika, or another smoked paprika in place of the PDO product. Add no global or contextual substitution, recipe-line link, or inverse rule. Leave `substitutionResearchState` at `not_yet_researched` pending a focused substitution review. [S01–S05]

## Source register

Sources were accessed on 2026-10-17. The source IDs are proposal-local and were checked against the live ledger and archive.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-LA-VERA-PAPRIKA-R411-20261017-S01` | European Union, [current single document for Pimentón de la Vera PDO](https://eur-lex.europa.eu/eli/C/2025/3697/oj/eng), Official Journal C/2025/3697, 2025-07-11, sections 1 and 3.2–3.4. | Primary authority for the protected name, Spain, specified pepper varieties and species, smoke-drying/milling boundary, production area, and sweet, ocal/bittersweet, and hot groups. Not Québec terminology or evidence that a specific Canadian SKU bears the PDO mark. |
| `WP06-EUROPE-LA-VERA-PAPRIKA-R411-20261017-S02` | Office québécois de la langue française, [GDT — paprika fumé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26519911/paprika-fume), definition, varieties, and terminology notes; last updated 2012. | Establishes `paprika fumé` as the preferred Québec French term, describes it as Spanish dried, smoked, ground red pepper, notes sweet/medium-hot/hot varieties, and discourages unqualified `pimenton` and `pimenton fumé`. It does not establish La Vera PDO scope. |
| `WP06-EUROPE-LA-VERA-PAPRIKA-R411-20261017-S03` | Qualifirst, [Paprika doux fumé de la Vera 55 g 24K](https://www.qualifirst.com/fr_CA/food/chillie_peppers/smoked-sweet-paprika-de-la-vera-s), Canadian French product title, origin, nutrition facts, and ingredient statement. | Current Canadian bilingual retailer wording and one Spanish-origin sweet-smoked paprika SKU. Reports a 55 g package and a 5 g label serving. The listing does not establish PDO certification for this exact SKU; the amounts do not provide a kitchen-volume mapping. |
| `WP06-EUROPE-LA-VERA-PAPRIKA-R411-20261017-S04` | ARC Iberico Imports, [Smoked Paprika collection](https://arcimports.ca/collections/smoked-paprika), Las Hermanas `Pimentón Dulce de la Vera` and `Pimentón Picante de la Vera` listings and product description. | Current Canadian seller uses the Spanish product name and describes oak-smoked pepper; the page states the Las Hermanas brand has the PDO. Seller copy is not the protected specification, and a brand-level statement does not independently certify every listed SKU. Listed pack sizes are product-specific. |
| `WP06-EUROPE-LA-VERA-PAPRIKA-R411-20261017-S05` | Refill&co, [Paprika fumé](https://refilleco.ca/produit/paprika-fume/), description and ingredient statement. | Québec retailer page calls generic smoked paprika “pimenton de la Vera” but identifies its own ingredient only as organic smoked paprika. Use as evidence of a broad wording collision, not as La Vera origin or PDO evidence. |

## Disposition

Proceed with one identity-only `BAKING_AND_SPICE` row for **`Pimentón de la Vera / paprika fumé de La Vera`** if accepted. Keep the protected region and product specification attached to the qualified name; preserve generic smoked paprika, generic paprika, hot paprika, other paprika origins, and prepared foods as separate identities. Add no forms, recipe links, active measurements, conversions, yields, or substitutions. The Europe-wide coverage checklist remains open.

No software tests, builds, emulator runs, or deployment were performed because this is a proposal-only documentation change.

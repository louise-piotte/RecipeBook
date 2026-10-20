# WP04 Section Q proposal: goat milk identity

- **Reviewed:** 2026-10-16
- **Status:** Integrated on 2026-10-16 in the [R281–R283 integration README](../batches/wp02-wp03-wp04-r281-r283-gap-review-integration-20261016/README.md). Added the identity-only reference and accepted research-ledger record.
- **Target anchor:** [WP04, Section Q, cow/goat/sheep/buffalo milk checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7059).
- **Recommendation:** add one identity-only `DAIRY_AND_ALTERNATIVE` reference for **goat milk / lait de chèvre**, with the OQLF-backed English alias **goat's milk**. Leave forms, measurements, mappings, conversions, recipe links, yields, and substitutions empty.
- **Candidate ID:** `ingredient-ref-goat-milk`.

## Why this is the next distinct gap

The latest roadmap records WP04 R280 as integrated. This review selects a separate, still-open Section Q item instead of reopening the Section P seafood work. Section Q’s milk checklist remains open. The broad `docs/catalog/batches/protein-dairy-identities.md` packet lists goat's milk / lait de chèvre as a family candidate, but its integration decisions added cow’s-milk distinctions and did not allocate or hold a goat-milk identity. The focused WP04 proposal and hold search found no prior goat-milk decision. The current catalog has goat meat, but no fluid goat milk.

The read-only snapshot used here has 1,659 active ingredient references, 125 forms, 2,007 research-ledger records, 60 legacy candidates, and the 114 manifest-listed recipes (1,123 ingredient rows). The proposed ID is absent from active references and legacy candidates. No exact active reference or form owns `goat milk`, `goat's milk`, or `lait de chèvre` after the app’s accent- and punctuation-folding search normalization.

## Proposed identity and boundary

| Field | Proposal |
| --- | --- |
| ID | `ingredient-ref-goat-milk` |
| Category | `DAIRY_AND_ALTERNATIVE` |
| English display | `goat milk` |
| Québec French display | `lait de chèvre` |
| English aliases | `goat's milk` |
| French aliases | none |
| Default density / unit mappings | `null` / `[]` |

The reference means fluid goat milk sold for human consumption. It does not assert one milk-fat class or processing treatment. Keep percentages and other qualifiers in recipe/source wording; do not add `1%`, `2%`, or `3.25%` as aliases or separate identities in this proposal. Liberté currently markets goat-milk products under more than one fat percentage, so an unqualified goat-milk row must not imply a uniform fat class.

Keep it distinct from cow milk and skim milk; goat-milk yogurt, butter, cheese, milk powder, evaporated or condensed products; infant formula; animal feed; and goat milk used in soap or cosmetics. Do not add the broad aliases `goat`, `chèvre`, `milk`, or `lait`. The French phrase `lait de chèvre` identifies the milk itself; the existing goat-meat alias `viande de chèvre` remains a separate phrase and identity.

The smallest proposed reference is:

```json
{
  "id": "ingredient-ref-goat-milk",
  "category": "DAIRY_AND_ALTERNATIVE",
  "nameEn": "goat milk",
  "nameFr": "lait de chèvre",
  "aliasesEn": ["goat's milk"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": []
}
```

## Naming and source support

The OQLF GDT entry directly pairs `lait de chèvre` with English `goat's milk`. Liberté’s current Canadian product pages use `Goat Milk 3.25%` and `lait de chèvre 3,25%`, and its product listing describes other fat-percentage variants. The current MAPAQ caprine-sector page says goat milk is sold as consumption milk and describes the Québec dairy-goat sector. CFIA’s dairy-label guidance says unqualified “milk” refers to cow’s milk and requires dairy products from another animal to identify that animal source. These sources support an explicit species identity, not an equivalence to cow milk.

The product pages show a 250 mL (1 cup) nutrition-label serving and product-specific package presentations. Those are label/product observations only. They do not provide a mass value or support a reusable weight-volume conversion. No numeric observation is proposed here.

## Picker projection

I projected the candidate against current reference names and aliases using the same normalization and phrase-first matching behavior as `IngredientReferenceSearchIndex` in `IngredientSearch.kt`:

| Query | Current results | With the candidate |
| --- | --- | --- |
| `goat milk` | 0 | 1 — goat milk |
| `goat's milk` | 0 | 1 — goat milk |
| `lait de chèvre` / `lait de chevre` | 0 | 1 — goat milk |
| `goat` | 1 — goat meat | 2 — goat meat, goat milk |
| `chèvre` / `chevre` | 1 — goat meat | 2 — goat meat, goat milk |
| `milk` | 7 | 8 |
| `lait` | 9 | 10 |

The full milk phrases resolve to one row. Broad goat/chèvre queries return both meat and milk, preserving the meaningful product distinction. The short query `chèvre` already reaches goat meat through its `viande de chèvre` alias, so the added display makes that query more transparent by returning both relevant identities. No broad term would become a singleton.

## Recipe demand and numeric behavior

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for goat milk, goat's milk, `lait de chèvre`, and accent-folded variants. There are zero matching recipe rows and zero other goat/chèvre ingredient rows. No recipe should be relinked, and no measurement or substitution need can be inferred from this corpus.

- **Forms:** add none. Species and fat qualifiers are not preparation-state forms; powdered, evaporated, condensed, and cultured products need their own product review.
- **Measures and density:** add none. The manufacturer’s 250 mL / 1 cup nutrition serving is not a mass measure. Do not transfer cow-milk density or unit mappings to goat milk.
- **Conversions and yields:** add none. No supported mass-volume relation, package conversion, or yield was found.
- **Substitutions:** add no cow-milk ↔ goat-milk global or contextual rule. The identity and labeling sources do not establish recipe-role-specific equivalence; the recipe corpus has no goat-milk use from which to evaluate one.
- **Recipe links:** none. No bundled recipe mentions goat milk.

## Source ID and URL ownership

At proposal review, source IDs WP04-GOAT-MILK-IDENTITY-20261016-S01 through S03 were reserved for the OQLF and Liberté evidence. Integration added S01–S04 to the goat-milk record; S04 is a focused citation to the already-used CFIA URL. The MAPAQ URL and source ID remain owned by the goat-meat record and are reused with a goat-milk-specific locator and support statement.

| Source ID | Source and supported claim | Limit |
| --- | --- | --- |
| `WP04-GOAT-MILK-IDENTITY-20261016-S01` | OQLF, [GDT: lait de chèvre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2073045/lait-de-chevre). Directly pairs the French term with `goat's milk`; defines milk from a goat. | Terminology evidence; not product treatment, measure, or recipe-substitution evidence. |
| `WP04-GOAT-MILK-IDENTITY-20261016-S02` | Liberté, [Goat Milk 3.25%](https://liberte.ca/en/goat/goat-milk-3-25/1000). Current Canadian manufacturer name and product page; lists milk-fat percentage, Canadian product imagery, a 250 mL (1 cup) label serving, and product formats. | A branded product page. Package formats and serving size are product/label observations, not general milk measures or conversion evidence. |
| `WP04-GOAT-MILK-IDENTITY-20261016-S03` | Liberté, [lait de chèvre 3,25 %](https://liberte.ca/fr/chevre/lait-de-chevre-3-25). Current French product title; the page also lists goat milk at more than one fat percentage. | Product naming and presentation only; not an OQLF fat-class rule or a recipe substitution source. |
| Existing `WP04-GOAT-MEAT-IDENTITY-20261013-S02` | Gouvernement du Québec / MAPAQ, [Élevage caprin (chèvre)](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/elevage-caprin-chevre). This URL and source ID already belong to the `ingredient-ref-goat-meat` ledger record. The current page describes Québec production and consumption-milk products. | Sector context; it does not establish a package size or household measure. Reuse the existing source ID if this page is cited at integration. |
| Existing CFIA source records; a new focused source ID may be allocated if needed | CFIA, [Labelling requirements for dairy products](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy). This URL is already cited by butter, cultured-dairy, and Greek-yogurt records, including `WP04-GREEK-YOGURT-20261010-S02`. The current page states that “milk” defaults to cow milk and dairy products from other animals must identify the animal source. | Canadian labeling context; it does not define culinary equivalence or recipe behavior. |

## Disposition

Accept the identity-only candidate `goat milk / lait de chèvre` in `DAIRY_AND_ALTERNATIVE`, with only the OQLF-backed English alias `goat's milk`. Keep it distinct from cow milk, goat meat, goat dairy products, and concentrated or cultured goat-milk products. Keep density, measures, forms, conversions, yields, recipe links, and substitutions unset. The broader Section Q milk and fat-class checklist remains open.

# WP05 Section T — Dried black lime identity review (R299)

- **Packet type:** ingredient identity, bilingual naming, picker boundary, and recipe-demand review.
- **Prepared and source-access date:** 2026-10-16.
- **Plan target:** Section T, the open regional souring-spice checklist. Asafoetida was integrated in R294 and amchur is already present; this packet covers dried black lime only.
- **Status:** integrated on 2026-10-16 as identity-only reference `ingredient-ref-dried-black-lime`.
- **Proposed source IDs:** `WP05-DRIED-BLACK-LIME-R299-20261016-S01` through `WP05-DRIED-BLACK-LIME-R299-20261016-S03`. Their exact IDs and URLs were checked against the proposal archive, batch records, and research ledger. The existing OQLF lime source is reused under its original ID.

## Recommendation

Add one identity-only reference for the whole dried lime product used as a Middle Eastern souring spice:

| Field | Value |
|---|---|
| ID | `ingredient-ref-dried-black-lime` |
| Category | `BAKING_AND_SPICE` |
| English display | `dried black lime` |
| English aliases | `dried lime`; `black lime`; `loomi`; `limoo amani` |
| French display | `lime séchée` |
| French aliases | None |
| Density and unit mappings | None |
| Forms, yields, conversions, substitutions, and recipe links | None |

The identity is separate from fresh `lime / lime`: Canadian specialty retailers describe the named whole product as lime boiled in brine and sun-dried until its pulp turns black, then used to sour soups and stews [S01, S02]. The Montréal Persian restaurant Maman Sady uses the Québec French wording `lime séchée` in its Ghormeh Sabzi herb stew [S03]. OQLF lists `lime` among the preferred Québec French terms for the fruit [reused source WP03-M-CITRUS-IDENTITY-20261009-S04]. The local menu supports the compound culinary wording; the OQLF entry supports only the base fruit term.

Use only the narrow English terms directly attached to this product. Do not add `black lemon`, `Omani lemon`, or `Persian lime` as aliases: one Canadian seller lists the first two as loose alternative names, but they can point to other dried-citrus identities or imply a species/origin not established here [S01]. Do not alias generic `dried lime slices` or cocktail garnish wording to this whole souring-spice identity.

The sources mention whole, crushed, and powdered use. Do not create a ground form or a powder identity in this batch: there is no bundled recipe demand, and no stable recipe-line form relationship needs to be represented. A retailer's 30 g or 100 g package size is packaging data, not a portion, conversion, or density [S01, S02]. No measurement observations, recipe links, unit mappings, yields, or substitutions are proposed.

## Catalog, archive, and picker audit

Before integration, the bundled catalog contained **1,667 references and 127 forms**. The active reference for fresh `lime` has no dried form. No active reference, form, or legacy-import candidate owned `dried black lime`, `dried lime`, `black lime`, `loomi`, `limoo amani`, or `lime séchée`. Existing lime juice, lime pickle, and makrut lime-leaf identities remain separate.

The current picker normalizes accents and punctuation, prefers complete word-phrase matches, then falls back to substring matches. Each full proposed display or alias phrase uniquely identifies the new reference. The unqualified query `lime` is already a broad family search and will also match the new identity; this batch does not change the fresh-lime identity or claim `lime` as an alias. The wording `black lemon` and `Omani lemon` is deliberately not activated.

The three new source URLs below have no earlier owners in the proposal archive, batch records, or research ledger. The OQLF source is reused as `WP03-M-CITRUS-IDENTITY-20261009-S04`; it retains its existing ownership under the fresh lime record.

### Recipe corpus and numeric behavior

A read-only scan of all **114 manifest-listed recipes and 1,123 ingredient rows**, including recipe instructions and ingredient names, found no matches for dried black lime, dried lime, loomi, limoo amani, lime séchée, or closely related black-lime wording. No recipe link or relink is supported.

The reviewed package weights are specific retail package sizes. None supplies a transferable count-to-mass, mass-to-volume, density, or recipe portion relationship. The sources describe sourness and culinary use but do not establish an ingredient substitution ratio or context. No reusable numeric or substitution behavior is added.

## Source ownership and evidence register

| Source ID | Source and evidence | Limit |
|---|---|---|
| **WP05-DRIED-BLACK-LIME-R299-20261016-S01** | The Silk Road Spice Merchant, [Loomi (Black Limes)](https://silkroadspices.ca/products/loomi). The Canadian spice retailer identifies loomi as dried, preserved limes used in Middle Eastern cooking, describes boiling in brine followed by sun-drying until the pulp turns black, and gives soups and stews as uses. | Its additional “black lemon” and “Omani lemon” names are not promoted to catalog aliases. Its 30 g bag is a package size, not a recipe portion. The page does not establish a lime species. |
| **WP05-DRIED-BLACK-LIME-R299-20261016-S02** | Cafe Nuts, [Dried Lime](https://cafenuts.ca/product/dried-lime/). The Canadian retailer labels the product “Dried Lime (Limoo Amani/Loomi),” describes its whole dried product, and gives Persian and Iraqi stew use. | Supports the exact product wording and transliterations shown by this seller. Its 100 g listing is a package amount only; health claims are not used. |
| **WP05-DRIED-BLACK-LIME-R299-20261016-S03** | Maman Sady, [menu](https://mamansady.com/menu/). The Montréal Persian restaurant lists `lime séchée` in its Ghormeh Sabzi herb stew. | Supports local French culinary wording in this dish context, not a species, universal product specification, or measure. |
| **Reused: WP03-M-CITRUS-IDENTITY-20261009-S04** | Office québécois de la langue française, [lime (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366576/lime). The entry includes `lime` and `citron vert` among preferred French terms and identifies the fruit. | Already owned by the fresh-lime research record. It supports the base word `lime`, not the compound `lime séchée`, and is not assigned a new ID. |

## Disposition

Accept one identity-only `dried black lime / lime séchée` reference in `BAKING_AND_SPICE`, with the narrow English aliases `dried lime`, `black lime`, `loomi`, and `limoo amani`. Keep it separate from fresh lime, juice, pickle, makrut lime leaves, dried citrus slices, and ambiguously named black-lemon products. Add no forms, numeric behavior, recipe links, or active substitutions. Section T remains open for kokum, goraka, and other regional souring-spice coverage.

## Integration record

Added the reference and its three new source records; reused the existing OQLF lime source under its original ID. The reference has empty forms, density, mappings, numeric observations, substitution findings, and recipe links. The generated picker index includes the new identity.

Static package normalization/validation, reference normalization, generated-index freshness, ledger schema and source ownership, picker projection, the 114-recipe / 1,123-row corpus, UTF-8/no-BOM and explicit Unicode escaping, local-link, and scoped-whitespace checks passed. No software tests, builds, or emulator run were performed for this database JSON addition.

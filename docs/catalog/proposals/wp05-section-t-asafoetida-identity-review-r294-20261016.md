# WP05 Section T — Asafoetida identity and product-boundary review (R294)

- **Packet type:** ingredient identity, naming, picker-boundary, and recipe-demand review.
- **Prepared and source-access date:** 2026-10-16.
- **Plan target:** Section T, the open checklist item at line 7320: “Asafoetida, amchur, dried black lime, kokum, goraka, and documented regional souring spices.” Amchur is already integrated; this packet covers only asafoetida.
- **Status:** integrated on 2026-10-16 as identity-only reference `ingredient-ref-asafoetida`.
- **Proposed source IDs:** `WP05-ASAFOETIDA-R294-20261016-S01` through `WP05-ASAFOETIDA-R294-20261016-S05`. Exact IDs and URLs were checked against the current catalog archive and research ledger; no collision or existing URL owner was found. The pre-existing chaat-masala source is reused under its original ID, not reissued.

## Recommendation

Add one identity-only spice reference for the asafoetida culinary ingredient class:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-asafoetida` |
| Category | `BAKING_AND_SPICE` |
| English display | `asafoetida` |
| English aliases | `hing`; `asafetida` |
| French display | `ase fétide` |
| French aliases | None |
| Density and unit mappings | None |
| Forms, yields, conversions, substitutions, and recipe links | None |

The OQLF GDT entry gives `ase fétide` as the French food-spice term and `asafoetida` as its English counterpart [S01]. A current Walmart Canada product listing uses `Hing (Asafoetida)` and lists the product’s ingredient declaration as wheat flour, gum arabic, and asafoetida [S05]. `Hing` is therefore a useful English search alias for the culinary ingredient class, but that alias must not imply that any particular package is carrier-free. FDA’s US food-substances inventory records `asafetida` as a variant spelling and `hing` as another name for asafetida gum [S03]; retain `asafetida` as a spelling alias only, not a Canadian regulatory term.

The catalog identity should represent the culinary asafoetida ingredient, whose source material is described in the official US food-substances record as gum [S03]. It should not claim that all commercial “hing” products are pure gum resin or that every product comes exclusively from one *Ferula* species. OQLF’s older terminology record gives *Ferula assafoetida* L.; Kew currently accepts the hyphenated *Ferula assa-foetida* L. name [S01, S02]. These references support the name and one accepted taxon, not an exclusive species specification for every marketed asafoetida product.

Do not add a generic powder form, `asafoetida powder` alias, or `hing powder` alias. Current Canadian listings show that products sold under those phrases can be compounded blends: Walmart Canada lists wheat flour and gum arabic alongside asafoetida in MTR Hing Powder [S05], while Metro Québec’s French ingredient declaration lists `Ase fétide en poudre` within Tata Masala with rice flour, wheat flour, asa fétide, gum arabic, and rice-bran oil [S04]. The compound’s carriers and proportions are product-specific. A named compounded product could be considered separately if a recipe later calls for it explicitly; this packet does not add a universal compound identity.

## Catalog, archive, and picker audit

The current bundled catalog contains **1,663 references and 127 forms**. No active reference or form owns `asafoetida`, `asafetida`, `hing`, `heeng`, `ase fétide`, or `asa fétide`; the corresponding current picker queries return no match. The legacy-import identity file has no exact matching candidate. The existing search code normalizes accents and punctuation, prefers complete phrase matches, and falls back to substring matches [picker source](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Under that behavior, the proposed display terms and aliases would each resolve to this one reference, with no existing exact or fallback collision. Powder-qualified queries remain deliberately unclaimed because the reviewed powder examples are formulated products.

The proposal archive contains one relevant prior asafoetida occurrence: The Silk Road Spice Merchant lists asafoetida in its product-specific chaat-masala blend [WP05-CHAAT-MASALA-20261011-S07]. That source ID and URL already belong to the chaat-masala record in the current research ledger and are reused here without a new source ID. This is evidence that asafoetida appears in one blend formula; it is not a bundled recipe line and does not support a recipe link, universal chaat-masala formula, or asafoetida measure.

### Recipe corpus, measures, and substitutions

A read-only scan covered all **114 manifest-listed recipes and 1,123 ingredient rows**, including ingredient text and the decoded recipe JSON, for `asafoetida`, `asafetida`, `asa foetida`, `asa fétide`, `ase fétide`, `hing`, and `heeng`. It found **zero matching recipe files and zero matching ingredient rows**. No recipe link, relink, or recipe-specific form is supported.

No reviewed source supplies a transferable mass-to-volume or other recipe measure for generic asafoetida. The 100 g shown for the MTR package is package labeling for that named product, not a portion or conversion [S05]. No density, unit mapping, yield, or conversion is proposed. The retailer’s marketing description of an onion-and-garlic-like flavor does not establish a safe substitution ratio or a general contextual replacement; no substitution is proposed.

## Source ownership and evidence register

The five new source IDs below were checked for exact collisions in the proposal archive, batch records, and research ledger. Their exact URLs have no existing owner there. The prior chaat-masala source is the only reused entry and retains its original ID.

| Source ID | Source and evidence | Limit |
|---|---|---|
| **WP05-ASAFOETIDA-R294-20261016-S01** | Office québécois de la langue française, [ase fétide (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3499893/ase-fetide). Lists the food/spice domain, French term `ase fétide`, English term `asafoetida`, and Latin name *Ferula assafoetida* L.; the entry attributes the terms to AFNOR (1975). | Supports the Québec French display and English counterpart. It is an older terminology record and does not establish the botanical source of every retail product. |
| **WP05-ASAFOETIDA-R294-20261016-S02** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Ferula assa-foetida* L.](https://powo.science.kew.org/taxon/842190-1). Marks the name accepted and gives its native range as southern Iran. | Taxonomic evidence for that species only; not evidence that all commercial asafoetida comes from it. |
| **WP05-ASAFOETIDA-R294-20261016-S03** | US Food and Drug Administration, [Substances Added to Food: Asafetida, gum (*Ferula assafoetida* L.)](https://www.hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=ASAFETIDAGUM&set=FoodSubstances). Lists `asafoetida`, `asafetida`, and `hing` among names and records a flavoring-agent/adjuvant use. | US food-substances evidence, not Canadian regulatory guidance or a Canadian consumer-label rule. Supports name and gum identity only. |
| **WP05-ASAFOETIDA-R294-20261016-S04** | Metro Québec, [Tata Masala product listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/sauces-et-assaisonnements-en-sachet/epices-masala/p/8904043902777). Its French ingredient list identifies `Ase fétide en poudre` and shows rice flour, wheat flour, asa fétide, gum arabic, and rice-bran oil in that sub-ingredient. | A product-specific French ingredient declaration within masala, not a standalone asafoetida product or a universal powder formula. |
| **WP05-ASAFOETIDA-R294-20261016-S05** | Walmart Canada, [MTR HING](https://www.walmart.ca/en/ip/MTR-HING/64CDNH35U0EF). The current listing pairs `MTR HING` with `Asafoetida` and lists a 100 g powder containing wheat flour, gum arabic, and asafoetida. | The listing currently says out of stock and notes that Walmart does not separately verify supplier-provided product information. Use for the displayed product name and its listing-specific declaration, not availability, a universal formulation, or a numeric conversion. |
| **Reused: WP05-CHAAT-MASALA-20261011-S07** | The Silk Road Spice Merchant, [Chaat Masala](https://silkroadspices.ca/collections/spice-blends/products/chaat-masala). The existing record says its named Canadian blend includes asafoetida among other spices. | Already owned by the chaat-masala research record; reuse as one blend example only. No new source ID is assigned here. |

## Disposition

Recommend one identity-only `asafoetida / ase fétide` reference with narrowly sourced English aliases `hing` and `asafetida`. Keep carrier-containing compounded powders distinct from the unqualified culinary ingredient class and leave powder-qualified search terms unclaimed pending recipe or product-specific evidence. The bundled corpus has no demand, and no form, measurement, conversion, yield, or substitution is supported. The broader Section T souring-spice checklist remains open.

## Integration record

Added `ingredient-ref-asafoetida` as `asafoetida / ase fétide` in `BAKING_AND_SPICE`, with only the English aliases `hing` and `asafetida`. Kept carrier-containing compounds distinct, and added no powder form or powder-qualified aliases, measurements, mappings, conversions, recipe links, or active substitutions. The ledger records identity evidence, the product-specific source limits, and the no-supported-substitution finding; the existing chaat-masala source retains its original ID.

Static package normalization/validation, reference normalization, generated-index freshness, ledger schema/source ownership, picker projection, the 114-recipe / 1,123-row corpus, UTF-8/no-BOM, local-link, and scoped-whitespace checks passed. No software tests, build, or emulator run was performed because this change only adds database JSON data and its generated index under `AGENTS.md`. See the [R294 integration README](../batches/wp05-section-t-asafoetida-identity-integration-r294-20261016/README.md). Section T remains open.

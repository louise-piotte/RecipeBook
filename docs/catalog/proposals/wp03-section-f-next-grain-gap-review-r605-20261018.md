# WP03 Section F R605 — Nicaraguan pinolillo product and picker-boundary review (2026-10-18)

- **Decision:** Keep the dry Nicaraguan `pinolillo` candidate out of the active catalog and shared research ledger for now. The regional product identity and Spanish name are supported, but this review did not establish a Québec French product name or an unambiguous Québec-facing product scope.
- **Plan item:** “Regionally significant cereal mixes/preprocessed grains” remains open at [Section F in the global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4545). The grain packet says other regional mixes and preprocessed grains remain open in its [Section F checklist](../batches/plant-grains-cereals.md#L269).
- **Scope:** The candidate is the *dry, ground, packaged Nicaraguan maize/cacao/spice mix* defined by Nicaragua’s NTON 03 071-06 for later consumption. It is not the prepared drink, generic toasted maize flour, Mexican `pinole`, the Salvadoran-market `Pinole/Pinolillo` listing, or the separate Chiapas `tascalate` mix.
- **No shared edits:** This proposal does not assign an ingredient or ledger-record ID, add an alias, form, measurement, substitution, recipe link, or modify the plan, roadmap, package JSON, generated files, or shared ledger. All source IDs below are proposal-local.

## Why this candidate is unfinished

The Nicaraguan Ministry of Health’s posted technical standard defines `pinolillo` as a product made from maize, cacao, and spices, processed by roasting, grinding, cooling, and packaging for later consumption [S01–S02]. Current Nicaraguan manufacturer pages show packaged `Pinolillo SaSa` and a separate `Pinolillo El Mejor` product [S03–S05]. That resolves the core identity as a dry regional cereal-based mix and distinguishes it from a prepared beverage.

There is no focused pinolillo product review in the repository. The 2026-10-13 Mexican `pinole` review explicitly excluded Central American `pinolillo`; it mentioned the term only as an adjacent, unassigned name [R49]. The 2026-10-09 WP06 Mexico/Central America sweep included `pinolillo` in its recipe-corpus query list, but did not review the product or propose an identity [WP06]. The active `tascalate` row is a distinct Chiapas mix and also names pinole/pozol as separate foods [R50]. These are prior boundaries, not prior pinolillo decisions.

## Product identity and regional boundary

| Evidence | What it establishes | Limit |
|---|---|---|
| **Nicaragua technical definition** | The official NTON defines `pinolillo` as a maize-, cacao-, and spice-based product that is roasted, ground, cooled, and packaged for later consumption [S02]. The document separately identifies maize as *Zea mays* and describes the finished texture as powdery. | The standard gives a product class, not proportions, a single spice set, or a household recipe. Its text says it was approved in 2007; MINSA’s online record is dated 2022. This proposal does not make a claim about current legal force. Quality and microbiological specifications are not cooking measurements. |
| **Current SaSa manufacturer** | Café Soluble S.A. currently presents SaSa as a Nicaraguan cereal-based beverage brand that includes pinolillo; its product page calls Pinolillo SaSa proudly Nicaraguan and lists 45 g, 380 g, and 1,000 g packages [S03–S04]. | The product page does not expose a legible ingredient declaration or exact dry-to-prepared instructions. Package weights are not serving weights or measures. |
| **Current El Mejor manufacturer** | INCOPANI sells a product titled `Pinolillo - EL MEJOR` and lists maize, cacao, sugar, cinnamon, `pimienta de chapa`, and cloves; it offers 400 g and 50 g packages [S05]. | This is one manufacturer’s formulation. Preserve its spice wording rather than assigning an unsupported English species/name. The listed weights are package sizes, and the page gives no ingredient proportions or use quantity. |
| **Regional lexical scope** | ASALE records `pinolillo` as a pinole drink in Honduras, El Salvador, and Nicaragua, and also records a toasted-corn-flour sense in Honduras, Nicaragua, and Costa Rica [S06]. | This is Spanish regional terminology, not a Québec French naming authority. It shows why unqualified regional and neighboring uses must not be treated as synonyms for the NTON-defined Nicaraguan dry mix. |
| **Nicaraguan cultural/product context** | Nicaragua’s MEFCCA described a family business producing and commercializing the typical Nicaraguan beverage `Pinolillo` and transforming local maize [S07]. | This supports regional significance, not a packaged formula, French name, or recipe quantity. It describes the drink/business rather than establishing a catalog form. |

The defensible food boundary is therefore the *dry powder product named `pinolillo` in the Nicaraguan standard*. The commercial examples agree on a packaged cereal-based product but do not establish one universal formula. Do not store the El Mejor ingredient list as a formula for every product, do not add maize or cacao as aliases, and do not treat prepared `pinolillo` as a cooked form of the powder.

Keep these neighboring identities separate:

- **Mexican `pinole`:** the held R49 candidate covers toasted maize preparations whose product boundary can range from plain maize flour to sweetened/spiced products. R49 specifically left `pinolillo` outside its scope. Do not add `pinole` or `pinol` as pinolillo aliases.
- **`tascalate`:** the active reference `ingredient-ref-tascalate` is a named Chiapas dry mix with its own evidence and source-specific composition. Do not merge or cross-alias it with Nicaraguan pinolillo.
- **Generic toasted corn flour, cornmeal, masa harina, and cocoa/cacao products:** these are components or neighboring processed products; none represents the complete maize/cacao/spice mix.
- **Prepared drink:** the regulatory and manufacturer sources describe pinolillo as a beverage product/use. The catalog candidate here is the dry packaged powder; do not add water, milk, sugar, or a prepared serving as forms or aliases.

## English name and Québec French assessment

The exact Spanish source name is `pinolillo`; current Nicaraguan makers use it on their product pages [S03–S05]. English-language product wording also preserves the term. Mama Lycha’s English page, however, titles its item `Corn Meal Mix - 6009`, while its Spanish page titles the same item `Pinole/Pinolillo - 6009` [S08–S09]. Its page describes a beverage mix, but the double title does not resolve whether a Québec retailer is selling the NTON-defined Nicaraguan identity or a broader regional/import product.

The only Québec-facing package listing found in this review is Des Champs Foods’ `Mama Lycha Pinole/Pinolillo`. Its search-indexed listing tags the item `El Salvador`, places it under “Drinks, Powder & Concentrates,” gives a 12 oz package, and showed “SOLD OUT” when indexed. Direct page retrieval timed out, so use it only as bounded evidence that a Saint-Hubert distributor has listed a mixed-name SKU, not as proof of current stock, a French title, or the Nicaraguan product identity [S10].

Targeted searches for the exact term did not surface a Québec French title in OQLF/TERMIUM terminology results or a bilingual Québec package label. The importer listing is in English, and its `Pinole/Pinolillo` pairing does not establish a preferred French display. Do not invent `farine de maïs grillée au cacao`, `mélange de maïs au cacao`, or `poudre de pinolillo` as the French display or aliases. Leave the French catalog wording unresolved until direct Québec product or terminology evidence supports it. This is a bounded search result, not a claim that no such French wording exists.

## Exact ownership and search behavior

Read-only snapshot at this review: **1,817 active ingredient references**, **154 ingredient forms**, **56 legacy-import candidates**, **2,187 research-ledger records**, and **114 manifest-listed recipes / 1,123 structured ingredient rows**.

Repository scans found no `pinolillo` identity in active reference names or aliases, form labels or match terms, legacy candidates, or a dedicated ledger record. The only current ledger string hit for neighboring `pinole` is the R50 `tascalate` decision that says to keep pinole separate. Repository proposal history contains the R49 pinole hold and broad WP06 recipe sweep, but no focused pinolillo disposition. The exact phrase `pinolillo` therefore has no current owner.

Relevant active owners and their boundaries:

| Existing reference | Current boundary | Effect of this hold |
|---|---|---|
| `ingredient-ref-tascalate` — `tascalate / tascalate` (`GRAIN_AND_CEREAL`) | Named Chiapas mix; aliases are empty. | Keep its query and identity unchanged. No pinolillo alias or merge. |
| `ingredient-ref-roasted-corn-flour` — `roasted corn flour / farine de maïs torréfiée` (`FLOUR_AND_STARCH`) | Generic toasted-corn flour, no aliases or forms; density is null and unit mappings are empty. | Do not use the generic flour row for this maize/cacao/spice product. |
| `ingredient-ref-cornmeal` — `cornmeal / semoule de maïs` (`FLOUR_AND_STARCH`) | Generic cornmeal; English alias `corn meal`. | Keep separate; no pinolillo alias. |
| `ingredient-ref-masa-harina` — `masa harina / farine de maïs nixtamalisée` | Nixtamalized maize flour. | Keep separate; no equivalence or substitution is supported. |

The picker audit is a static projection of [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it searches bilingual names, aliases, and attached form terms, prefers complete normalized phrases, then falls back to substring matching.

| Query | Current picker result | Future search consequence if a single `pinolillo` row were added |
|---|---|---|
| `pinolillo` | 0 | Exact phrase would resolve to the new row. |
| `pinole` | 0 | Still 0; `pinole` is not a substring of `pinolillo`. Do not add it as an alias. |
| `pinol` | 0 | Would return the new row through substring fallback even with no `pinol` alias. This broad prefix can refer to toasted maize flour/beverage products, so the current picker cannot keep it unresolved while exposing only `pinolillo`. |
| `tascalate` | 1: `ingredient-ref-tascalate` | Remains the separate Chiapas mix. |
| `roasted corn flour` / `farine de maïs torréfiée` | 1: `ingredient-ref-roasted-corn-flour` | Remains generic toasted corn flour. |
| `cornmeal` | 1: `ingredient-ref-cornmeal` | Remains generic cornmeal. |

No unverified alias such as `pinole`, `pinol`, `pinole/pinolillo`, `pinolillo drink`, or a descriptive French ingredient phrase is proposed. The broad partial result for `pinol` is a picker limitation relevant to promotion, not evidence that these terms are synonyms.

## Bundled recipe demand

I searched every manifest-listed recipe’s full serialized JSON and structured ingredient rows for `pinolillo`, `pinol`, `pinole`, `pinole/pinolillo`, and `tascalate`.

- Candidate-term recipe files: **0 / 114**.
- Candidate-term structured ingredient rows: **0 / 1,123**.
- Direct ingredient-reference links to pinolillo: **0**.

The earlier WP06 regional sweep also included `pinolillo` in its 96-query ingredient-line scan and reported no candidate-line hit [WP06]. There is no bundled recipe quantity or recipe-specific need to justify guessing a measure or French display.

## Measures, forms, and substitutions

- **Package values:** SaSa’s 45 g, 380 g, and 1,000 g and El Mejor’s 50 g and 400 g are package sizes [S04–S05]. Mama Lycha’s 12 oz value is also a package size [S08–S10]. None is a serving, household measure, volume-to-mass observation, or preparation ratio.
- **Standard specifications:** NTON’s texture and quality limits describe product quality and safety. They do not establish ingredient proportions, density, cup weight, serving size, or recipe quantity [S02].
- **Forms and conversions:** Add no form, density, unit mapping, cooking yield, or dry-to-prepared conversion. No source supplies a transferable mix-to-liquid ratio or defined prepared yield for the NTON product.
- **Substitutions:** Add no global or contextual substitution between pinolillo and pinole, roasted corn flour, cornmeal, masa harina, tascalate, cacao/cocoa, or another drink mix. The sources show different compositions and scopes but provide no tested ratio or method-specific interchangeability.

## Source register and ownership

Sources were checked online on 2026-10-18. Source IDs are unique to this proposal and are not registered in the shared ledger.

| Source ID | Direct source | Supports and limits |
|---|---|---|
| `WP03-F-PINOLILLO-R605-20261018-S01` | Nicaragua Ministry of Health (MINSA), [NTON 03 071 06 Pinolillo publication page](https://www.minsa.gob.ni/index.php/publicaciones/direccion-general-de-regulacion-sanitaria/nton-03-071-06-pinolillo-especificaciones). | Official MINSA catalogue record for the standard; the page lists publication date 2022-09-01 and links the PDF. It establishes official source ownership, not that the 2007 standard is currently in force. |
| `WP03-F-PINOLILLO-R605-20261018-S02` | MINSA, [NTON 03 071-06 PDF: Pinolillo quality and safety specifications](https://www.minsa.gob.ni/sites/default/files/2022-10/NTON%2003%20071%2006%20Pinolillo.%20Especificaciones%20de%20Calidad%20e%20Inocuidad.pdf), §3.5, pp. 3–4; PDF says approved 2007-02-22. | Defines the product as maize, cacao, and spice-based, roasted, ground, cooled, and packaged for later consumption. It does not give a universal recipe, spice list, proportion, serving, density, or cooking ratio. |
| `WP03-F-PINOLILLO-R605-20261018-S03` | Café Soluble S.A., [SaSa brand page](https://www.cafesoluble.com/nuestras-marcas/sasa/), accessed 2026-10-18. | Manufacturer describes SaSa as a Nicaraguan cereal-based beverage brand that includes pinolillo. Supports present product-family context, not formula or Québec French wording. |
| `WP03-F-PINOLILLO-R605-20261018-S04` | Café Soluble S.A., [Pinolillo SaSa product page](https://www.cafesoluble.com/nuestras-marcas/sasa/pinolillo-sasa/), accessed 2026-10-18. | Current manufacturer page calls the product Nicaraguan `Pinolillo SaSa` and lists 45 g, 380 g, and 1,000 g formats. Package sizes are not ingredient measures; no readable formula or preparation ratio is given. |
| `WP03-F-PINOLILLO-R605-20261018-S05` | INCOPANI, [Pinolillo — El Mejor](https://incopani.com/producto/pinolillo-el-mejor/), accessed 2026-10-18. | Current maker page names maize, cacao, sugar, cinnamon, allspice, and cloves and lists 400 g and 50 g formats. The formula belongs to this product only; weights are packaging. |
| `WP03-F-PINOLILLO-R605-20261018-S06` | Asociación de Academias de la Lengua Española (ASALE), [Diccionario de americanismos: pinolillo](https://www.asale.org/damer/pinolillo), accessed 2026-10-18; entry ©2010. | Records regional beverage and toasted-corn-flour senses in Central America, plus unrelated Mexican zoological senses. Supports lexical-boundary caution only; it does not name a packaged product or establish Québec French. |
| `WP03-F-PINOLILLO-R605-20261018-S07` | Nicaragua Ministry of Family Economy, [Boletín Informativo, April 2021](https://www.economiafamiliar.gob.ni/backend/vistas/doc/boletain/documento952980.pdf), PDF p. 14, `Pinolillo Cmillas D’Oro` profile. | Government bulletin describes a Nicaraguan family business producing the typical beverage and transforming local maize. It supports cultural/product relevance, not package formula, measure, or French naming. |
| `WP03-F-PINOLILLO-R605-20261018-S08` | Mama Lycha, [Spanish product page: Pinole/Pinolillo — 6009](https://www.mamalycha.com/es/products/corn-meal-mix), accessed 2026-10-18. | Product page uses the combined title `Pinole/Pinolillo`, calls pinolillo a traditional drink, lists maize/cacao/cinnamon, says sugar and milk are sometimes added, and lists 12 oz. It is a neighboring market SKU, not proof that the item conforms to the Nicaraguan standard or a Québec bilingual label. |
| `WP03-F-PINOLILLO-R605-20261018-S09` | Mama Lycha, [English product page: Corn Meal Mix — 6009](https://www.mamalycha.com/products/corn-meal-mix), accessed 2026-10-18. | Same item is titled `Corn Meal Mix`; its English description names corn, cocoa, cinnamon, “fat pepper,” and cloves and calls it Nicaraguan. Its wording is not a stable exact English title or an ingredient statement for SaSa/El Mejor. |
| `WP03-F-PINOLILLO-R605-20261018-S10` | Des Champs Foods, [Mama Lycha Pinole/Pinolillo listing](https://deschampsfoods.com/product/mama-lycha-pinole-pinolillo/), Saint-Hubert, Québec. | Search-indexed listing showed `SOLD OUT`, 12 oz, category `Drinks, Powder & Concentrates`, and origin tag `El Salvador`. Direct fetch timed out. Treat as a limited Québec-distributor listing with a mixed product name, not current availability, a French title, or exact Nicaraguan identity evidence. |

**Ownership audit:** all ten proposed source IDs were absent from the research ledger and repository text before this proposal. Each listed URL had no exact owner in the ledger or catalog proposal/batch archive. The sources remain proposal-local; do not add them to any shared record while the candidate is held.

## Next action

Keep the pinolillo candidate held and leave the Section F umbrella open. Revisit only when a current Québec-facing package or authoritative Québec terminology source establishes a French display for a specifically identified dry Nicaraguan pinolillo product. At that review, confirm whether the package is the NTON-defined mix or a broader `Pinole/Pinolillo` product and re-run the picker audit; the existing substring fallback makes bare `pinol` return a pinolillo row if one is added. Do not pre-assign an ID, French translation, alias, form, measure, or substitute.

This proposal-only research did not edit shared catalog data and did not run software tests.

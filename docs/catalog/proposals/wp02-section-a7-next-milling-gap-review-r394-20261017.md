# WP02 Section A7 R394: spring wheat semolina identity

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This file does not change shared catalog JSON, the research ledger, the checklist, the roadmap, generated code, recipes, or tests.
- **Open checklist:** WP02 Section A7, “Continue A7 review of other grain meals (including the unresolved wheat-meal candidate), other malted/toasted flour identities, and gluten-flour equivalence” ([plan, line 1998](../../RecipeBook-global-ingredient-catalog-plan.txt#L1998)). The related open wheat-flour item is at [plan line 1521](../../RecipeBook-global-ingredient-catalog-plan.txt#L1521).
- **Proposed source-ID prefix:** `WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017`; new IDs S01–S03 below are proposal-local. OQLF and prior-review sources are cited using their existing IDs.
- **Scope:** Review the distinct Canadian spring-wheat semolina product class against active wheat semolina/meal identities, prior A7 holds, search behavior, the current 114-recipe bundle, and exact-class measurement/substitution evidence. This does not resolve bare `farina`, `wheat farina`, or generic `wheat meal`.

## Recommendation

Add an identity-only wheat milling product:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-spring-wheat-semolina` |
| Category | `FLOUR_AND_STARCH` |
| English display | `spring wheat semolina` |
| French display | `semoule de blé tendre` |
| English aliases | `[]` |
| French aliases | `[]` |
| Forms, density, unit mappings, measurements, yields, conversions, recipe links, substitutions | none |

Prairie Flour Mills identifies its wheat semolina as a specialty product milled from the endosperm of Canadian Red Spring Wheat and offered in coarse or fine granulation [S01]. OQLF lists **semoule de blé tendre** as the preferred French term and **spring wheat semolina** as an English term; its technical definition distinguishes the non-durum product from durum semolina [WP03-IDLI-RAVA-20261012-S07]. These sources support an exact milling identity that is absent from the current catalog.

Keep the product distinct from durum semolina and remilled durum semolina; from the whole-kernel product `whole wheat meal / farine de blé entier brute`; from wheat flour; and from prepared `cream of wheat hot cereal / crème de blé`. Do not generalize the identity to every product called `farina` or `wheat farina`. Earlier A7 work held those unqualified terms because ingredient-label uses and finished hot-cereal products do not share one established milling boundary ([residual-grain-meals review](wp02-a7-residual-grain-meals-followup-20261011.md), [R22 wheat-meal review](wp02-a7-unqualified-wheat-meal-round22-review-20261013.md)). The proposed name pair is narrower and comes from an exact OQLF term plus a separate Canadian mill product.

Do not add **farina** as an alias. Although OQLF lists it as an English term for this product, the live picker already returns four Italian flour-grade rows for the query `farina`; the same broad word also appears in prior holds and hot-cereal context. The new canonical English phrase is searchable without broadening that ambiguous query. Do not add `wheat farina`, `whole grain wheat farina`, `semoule de blé` or a literal `semoule de blé de printemps` alias: none is necessary to find the exact identity, and the generic names have separate scope or picker boundaries.

The mill page reports coarse and fine granulations, but gives no sieve specification, separate grade names, or product-matched French form labels [S01]. Keep these source descriptions out of the form catalog for now. Measurement research found no reusable value for this exact class; substitution research found only broad, unquantified guidance for a different U.S. class. No density, kitchen measure, mapping, conversion, yield, form, or active substitution is proposed.

## Current-state audit

The audit used the current split seed package, current source files, and every recipe listed by the package manifest. Current counts and SHA-256 hashes are recorded here so a later integrator can identify the audited snapshot.

| Store | Current snapshot | Exact ownership/result |
| --- | ---: | --- |
| Active ingredient references | 1,703 rows; SHA-256 `8d40f5ca6cc2c0e7869eb94b9913811615608a369aeb24050eebc4c28e6dd2c6` | No active row has `spring wheat semolina`, `semoule de blé tendre`, `wheat semolina`, or the proposed ID. Neighbors are `ingredient-ref-durum-semolina`, `ingredient-ref-semola-rimacinata`, `ingredient-ref-wheat-meal`, and `ingredient-ref-cream-of-wheat-hot-cereal`. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form or match term names spring-wheat semolina, `farina`, or `semoule de blé tendre`; the active durum-semolina and remilled-durum-semolina references have no forms. |
| Legacy import candidates | 56 entries; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact owner or matching alias for the proposed identity or French term. |
| Research ledger | 2,059 records / 9,285 source entries; SHA-256 `629ce7f25795bf35ea15c9e7f3ec4037e87eeeb588df7e8206e09f0009e28064` | No `ingredient-ref-spring-wheat-semolina` or dedicated spring-wheat-semolina candidate record. `ingredient-ref-wheat-meal` has 34 sources and retains the unresolved bare-wheat-meal decision, separately from its verified whole-wheat-meal identity. |
| Recipe manifest | 114 recipe files; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest-listed files were scanned; totals and results are below. |

Relevant live rows remain narrowly named:

- `ingredient-ref-durum-semolina`: `durum semolina / semoule de blé dur`, no aliases.
- `ingredient-ref-semola-rimacinata`: `remilled durum semolina / semoule de blé dur remoulue`, with its existing Italian aliases.
- `ingredient-ref-wheat-meal`: `whole wheat meal / farine de blé entier brute`, with its existing French alternate alias. It does not represent spring-wheat semolina or generic wheat meal.
- `ingredient-ref-cream-of-wheat-hot-cereal`: a prepared hot-cereal identity, not the dry milling ingredient.

The current ledger already contains the relevant OQLF term source as `WP03-IDLI-RAVA-20261012-S07` under the idli-rava and Cream-of-Wheat records. It contains OQLF's durum-semolina boundary as `WP02-S23` under the durum-semolina record. Reuse these source IDs when integrating rather than adding duplicate source objects. The Québec allergy-term page was previously cited as `WP02-A7-RESIDUAL-GRAIN-MEALS-20261011-S08`; that earlier source list pairs “Farina” and “semoule de blé tendre” under wheat/triticale. Treat it as vocabulary context, not a product or milling specification.

### Archive and collision review

- `docs/catalog/proposals/wp02-section-a-next-milling-gap-review-r385-20261017.md` reviews Finnish rye semolina / Ruismanna, not spring-wheat semolina; it remains unchanged.
- The 2026-10-11 A7 residual-meal review held `whole grain wheat farina` and `wheat farina` because blend-component and hot-cereal examples did not establish a common milling boundary or generic French display [R11]. It did not review a Canadian mill's semolina made from Canadian Red Spring Wheat.
- The 2026-10-13 R22 review held unqualified `wheat meal` and kept `ingredient-ref-wheat-meal` restricted to the whole-wheat product [R22]. This proposal does not alter either decision.
- The Cream-of-Wheat identity review treats `farina` and semolina milling ingredients as distinct from the prepared hot cereal. This proposal preserves that boundary.
- The exact proposed reference ID, R394 source-ID prefix, proposal filename, Prairie Flour Mills URL, Provigo listing URL, and U.S. Wheat Associates URL were absent from the active catalog/ledger and proposal/batch archive at audit time. New source IDs S01–S03 were also absent from the ledger.

## Picker projection

`IngredientSearch.kt` normalizes accents and punctuation, prefers complete word phrases, then falls back to substring matching. The projection below applies that behavior to current reference and form terms, then appends the proposed display pair without aliases or forms.

| Query | Current result(s) | Projected result(s) |
| --- | --- | --- |
| `spring wheat semolina` | none | `spring wheat semolina` |
| `semoule de blé tendre` | none | `spring wheat semolina` |
| `wheat semolina` | none | `spring wheat semolina` |
| `semolina` | durum semolina; remilled durum semolina; sankhal (broken millet semolina); sorghum semolina | prior four plus spring wheat semolina |
| `semoule de blé` | durum semolina; remilled durum semolina | prior two plus spring wheat semolina |
| `farina` | Italian type 0, 00, 1, and 2 soft-wheat flours | unchanged; no bare `farina` alias is proposed |
| `wheat meal` | whole wheat meal (substring within its display) | unchanged; generic wheat meal remains unresolved |
| `semoule de blé dur` | durum semolina; remilled durum semolina | unchanged |

The broad `semolina` and `semoule de blé` results expose the distinct supported types rather than merging them. Keep the current broad `farina` result unchanged because it already spans four Italian flour rows and prior evidence also uses the term for hot cereal and an unresolved whole-grain wheat-farina component.

## Bundled recipe-demand audit

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned. The scan covered full serialized recipe JSON and each ingredient row's `originalText`, `ingredientName`, `preparation`, `notes`, and `ingredientRefId`, using the same lowercasing, accent/ligature folding, punctuation removal, and whitespace normalization described in `IngredientSearch.kt`.

Search phrases included `spring wheat semolina`, `semoule de blé tendre`, `semoule de blé de printemps`, `wheat semolina`, `farina`, and `wheat farina`. Results: **0 matching recipes, 0 matching ingredient rows, and 0 links** to the proposed ID. No recipe relink or bundled recipe edit is justified.

## Measurements, forms, and substitutions

- Prairie Flour Mills offers bulk totes and describes coarse or fine granulation, but publishes no household-volume amount, mass/volume pair, density, or product label serving for this semolina [S01]. Its coarse/fine statement does not give the product names, sieve thresholds, or bilingual form labels needed to add useful explicit forms.
- A current Provigo search result for Clic Fine Wheat Semolina reports a 1/4 cup (30 g) serving [S02]. Its ingredient is only identified as “Fine Wheat Semolina”; it does not identify spring/non-durum wheat, and the direct page response did not expose the product details. Do not attribute the retailer's serving to this proposed identity, infer a density, or use it as a generic semolina mapping.
- The OQLF definition's composition limits and the Prairie mill's bulk production notes are not kitchen measures or density observations. Do not derive a volume conversion from regulatory moisture content, bulk-tote packaging, or product use suggestions.
- U.S. Wheat Associates describes U.S. Hard Red Spring wheat flour or semolina as an alternative in pasta applications where traditional durum semolina is not needed [S03]. This is qualitative, class-level U.S. guidance; it specifies no ratio or recipe and does not establish equivalence for the exact Canadian mill product. Record no active same-ingredient or contextual substitution from it. If integrated, measurement can be `researched_no_supported_value`; substitution should remain `not_yet_researched` until a recipe-relevant exact-product review is warranted.

## Source register

| ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S01** | Prairie Flour Mills Ltd., [Products](https://prairieflour.com/products/), “Wheat Semolina” and company description, accessed 2026-10-17. | A current Canadian mill lists wheat semolina milled from the endosperm of Canadian Red Spring Wheat, in coarse or fine granulation, for several food applications. | Bulk product description, not a retail label or Canadian compositional standard; does not state a cultivar, wheat-class code, sieve size, household measure, density, or substitution ratio. It does not provide French wording. |
| **Reused `WP03-IDLI-RAVA-20261012-S07`** | Office québécois de la langue française, [semoule de blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432749/semoule-de-ble-tendre), preferred term, definition, English terms; accessed 2026-10-17. | Supports the exact French display `semoule de blé tendre` and English `spring wheat semolina`; its milling definition distinguishes this term from durum semolina. | The record is dated 1982 and gives terminology/definition, not Canadian retail availability or the Prairie mill's exact process. |
| **Reused `WP02-S23`** | OQLF, [semoule de blé dur (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur), preferred term and definition; accessed 2026-10-17. | Existing source for the durum-qualified milling product and the French/English distinction from spring-wheat semolina. | Supports the neighboring durum identity, not the proposed spring-wheat product. |
| **WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S02** | Provigo, [Clic Wheat Semolina, Fine, 907 g](https://www.provigo.ca/en/wheat-semolina-fine/p/20018233_EA), search-indexed product title, serving, and ingredient declaration; accessed 2026-10-17. | Search result reports “Fine Wheat Semolina” and 1/4 cup (30 g), illustrating a current Canadian semolina label with a product-specific serving. | Grain class is not stated, and direct page extraction returned no product details. Not evidence for spring wheat semolina or for a reusable semolina measure. |
| **WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S03** | U.S. Wheat Associates, [Hard Red Spring](https://newuswheat.mysites.io/crop-quality/hard-red-spring/), pasta-use note; accessed 2026-10-17. | Gives qualitative, pasta-scoped guidance that HRS wheat flour or semolina can serve as an alternative when traditional durum wheat semolina is not needed. | U.S. HRS class guidance, not an exact Prairie product match; no dose, ratio, or recipe context is specified. Do not create a catalog substitution rule. |
| **Reused archived `WP02-A7-RESIDUAL-GRAIN-MEALS-20261011-S08`** | Gouvernement du Québec, [Allergènes et leurs différentes appellations](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations), wheat/triticale heading; accessed 2026-10-17. | Lists `Farina, semoule de blé tendre` in Québec French-language allergen vocabulary. | The page is a non-exhaustive allergen-term list, not a milling standard or standalone-product label. The source ID already belongs to the earlier A7 proposal; reuse it rather than minting a duplicate. |

## Disposition

Promote only the source-defined, identity-level `spring wheat semolina / semoule de blé tendre` row if the integration reviewer accepts this proposal. Keep `farina`, `wheat farina`, whole-grain wheat farina, generic wheat meal, durum semolina, remilled durum semolina, and prepared cream-of-wheat hot cereal separate under their current owners or holds. Add no aliases, forms, numeric behavior, recipe links, conversions, yields, or substitutions. The A7 parent and the broader wheat-flour review remain open.

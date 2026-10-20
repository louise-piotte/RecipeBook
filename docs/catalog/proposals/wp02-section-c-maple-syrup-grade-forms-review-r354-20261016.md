# WP02 Section C — maple syrup grade and picker-boundary review

- **Round:** R354
- **Reviewed:** 2026-10-16
- **Status:** Integrated in the bundled catalog on 2026-10-16.
- **Scope:** The four current Canada Grade A maple syrup colour classes; their English and Québec French names; relationship to the existing maple syrup identity, generic syrup queries, and neighboring maple products; bundled recipe demand; and numeric/substitution limits.
- **Plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, WP02 Section C, open line “Preserve specialty grades, concentrations, and solid/liquid states when they materially affect use.” The conditional allulose follow-up remains out of scope: it still lacks a selected product and use, and its current Canadian-status hold was already reviewed in the [2026-10-11 proposal](wp02-allulose-product-specific-canadian-status-recheck-20261011.md).

## Recommendation

**Add four identity-only colour-class forms under the existing `ingredient-ref-maple-syrup` reference.** Use the official class names `Golden, Delicate Taste / Doré, goût délicat`, `Amber, Rich Taste / Ambré, goût riche`, `Dark, Robust Taste / Foncé, goût robuste`, and `Very Dark, Strong Taste / Très foncé, goût prononcé`. Keep them as forms of `maple syrup / sirop d’érable`; do not create four new ingredient identities or attach grade terms as aliases to the parent reference.

Canada’s current grade standard limits the four colour classes to Grade A maple syrup. It defines them through light transmission and a maple flavour characteristic of the class. Québec’s maple-producer association describes different flavour strengths and recommends the classes for different uses. This is enough to make the qualifiers meaningful picker choices. All four remain colour classes within the same single-ingredient maple syrup identity; CFIA defines maple syrup as obtained exclusively by concentrating maple sap or by diluting or dissolving another maple product in potable water. The standard does not establish a different density or a general recipe replacement ratio for each class.

Add only the four grades. Do not add a generic `Grade A` form, `Canada Processing Grade`, historical `Grade B`, or legacy light/medium/extra-light labels. CFIA says there are no colour classes for Processing Grade; the current Grade A names already provide precise terms. Do not relink the bundled generic maple-syrup recipe lines to a grade.

## Live catalog, ownership, and recipe demand

The active reference is `ingredient-ref-maple-syrup`, displayed as `maple syrup / sirop d’érable`, in `SUGAR_AND_SWEETENER`. It has no aliases, default density, or unit mappings. There are no forms attached to it. Keep the identity and display name unchanged. Existing separate maple products include maple sugar, maple butter, maple taffy, and maple flakes; those identities are not syrup grades. The active golden-syrup and dark-corn-syrup rows also remain separate.

`legacy-import-identities.v1.json` has no maple-syrup grade candidate. Its only maple-related entry is the already active `maple sugar / sucre d’érable` identity. The maple-syrup research-ledger record is already verified and owns the existing base-name/identity research, including OQLF’s preferred `sirop d’érable` and CFIA’s single-ingredient boundary. Its CNF portions are source-specific historic observations, not grade-specific mappings. The current CFIA maple-labelling page is already owned under `ingredient-ref-maple-flakes` as `WP06-MAPLE-FLAKES-R295-20261016-S08`; reuse that source reference if needed rather than minting a duplicate URL entry. No focused proposal reviewed the four syrup colour classes as forms. The R293 maple-syrup measurement proposal records that there are no maple-syrup forms today.

The bundled package contains 114 recipes and 1,123 ingredient rows. It has three direct maple-syrup rows, all generic:

| Recipe | Existing line | Grade demand |
| --- | --- | --- |
| 001 Air Fryer Baked Oats | `1 tbsp maple syrup` | None stated |
| 025 Maple Pecan Cranberry Squares | `1/2 cup maple syrup` | None stated |
| 085 Maple Chicken | `3 1/2 tbsp maple syrup` | None stated |

Recipe 065 mentions maple syrup only in an unlinked optional “sweetener, to taste” note. No bundled row names a colour class. Keep all three direct recipe links and their authored quantities unchanged; the grade forms are for explicit product/search wording, not a reason to guess the recipe author’s selection.

## Supported identity and form terms

Keep the current base pair `maple syrup / sirop d’érable`. Put each colour class beneath that reference as a form, with the official class words as the form labels. The whole-product phrases below can be form match terms so an explicit query returns the existing maple-syrup reference with the appropriate class hint; they are not new aliases on the parent.

| Form label EN / FR | Whole-product match terms EN / FR | Bounded claim |
| --- | --- | --- |
| `Golden, Delicate Taste` / `Doré, goût délicat` | `golden maple syrup` / `sirop d’érable doré` | Canada Grade A colour class; delicate taste. |
| `Amber, Rich Taste` / `Ambré, goût riche` | `amber maple syrup` / `sirop d’érable ambré` | Canada Grade A colour class; rich taste. |
| `Dark, Robust Taste` / `Foncé, goût robuste` | `dark maple syrup` / `sirop d’érable foncé` | Canada Grade A colour class; robust taste. |
| `Very Dark, Strong Taste` / `Très foncé, goût prononcé` | `very dark maple syrup` / `sirop d’érable très foncé` | Canada Grade A colour class; pronounced/strong taste. |

The Québec producer page uses complete product phrasing, including `sirop d’érable foncé, goût robuste` and `sirop d’érable très foncé, goût prononcé`. Add that full French wording as match terms if the catalog needs exact label-order matching. Do not shorten any French class to unqualified `doré`, `ambré`, `foncé`, or `très foncé` aliases on the parent reference.

Do not assign `golden syrup` or `sirop doré` to maple syrup. The active golden-syrup identity owns those unqualified product names. Similarly, keep `dark corn syrup / sirop de maïs foncé` separate from the exact phrase `dark maple syrup / sirop d’érable foncé`. Bare colour words are not global synonyms; the complete class-plus-product phrases preserve the source ingredient.

## Picker effects

The live `IngredientReferenceSearchIndex` searches complete normalized phrases from reference names, aliases, and attached form labels/match terms before falling back to partial matching. A form match returns its parent ingredient reference; it does not create an additional picker identity.

Read from the current names/forms and that matching rule, the present catalog behaves as follows:

| Query | Current result |
| --- | --- |
| `maple syrup`; `sirop d’érable` | `ingredient-ref-maple-syrup` |
| `golden syrup`; `sirop doré` | The active golden-syrup reference; no maple-syrup result is introduced. |
| `dark maple syrup`; `sirop d’érable foncé` | No result; no maple-syrup form currently owns these phrases. |
| `very dark maple syrup`; `sirop d’érable très foncé` | No result; no maple-syrup form currently owns these phrases. |

With the integrated whole-product form match terms, an exact query such as `dark maple syrup` selects the existing maple-syrup reference with a `Dark, Robust Taste` form hint. `golden syrup` remains on its current syrup reference because `golden maple syrup` is a different full phrase. Bare `golden` and `doré` queries also match the maple-syrup colour forms; they are broad and can return unrelated existing rows as well, and a single-word query does not produce a form hint. The English and French complete phrases retain the useful product distinctions, so the broad terms remain visibly ambiguous rather than aliases on the maple-syrup parent.

## Grade, composition, and usage limits

CFIA’s Volume 7 standard defines Canada Grade A maple syrup as 66–68.9% soluble solids at 20°C, free of fermentation, uniform and clear, with the maple flavour characteristic of its colour class. It separates Canada Processing Grade, which has the same specified soluble-solids range but does not meet Grade A appearance/colour/flavour requirements. The four colour classes are determined by percentage light transmission at 560 nm:

| Class | Light transmission |
| --- | ---: |
| Golden, Delicate Taste | at least 75.0% |
| Amber, Rich Taste | at least 50.0% and less than 75.0% |
| Dark, Robust Taste | at least 25.0% and less than 50.0% |
| Very Dark, Strong Taste | less than 25.0% |

These thresholds are grade-classification criteria, not kitchen measures or density evidence. The equal specified solids range does not establish class-specific mass-per-volume data. Keep `defaultDensity` null and `unitMappings` empty. Do not derive a density, spoon/cup weight, conversion, yield, or size adjustment for any form. Existing CNF portions do not distinguish colour classes and must not be copied onto these forms as grade measurements.

Érable du Québec recommends golden/amber for delicate or refined applications and dark/very-dark for baking, sauces, marinades, and dishes that benefit from a more pronounced maple flavour. Its separate milk-with-maple recipe calls for maple syrup “preferably very dark” to get the stronger taste. These are grade-specific culinary preferences, not substitution ratios. No grade-to-grade or maple-syrup-to-other-sweetener substitution is proposed. Keep `substitutionResearchState` unchanged and add no global or contextual rule.

## Source register

Sources were checked on 2026-10-16. Proposal-local source IDs below are not shared-ledger allocations. Claims are limited to the stated use.

| Source ID | Source and URL | Claim and limit |
| --- | --- | --- |
| `WP02-C-MAPLE-GRADE-R354-S01` | CFIA, [Canadian Grade Compendium: Volume 7 — Maple Syrup](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-7), §§2–5. | Primary federal grade definitions: Canada Grade A and Processing Grade; 66–68.9% soluble solids; colour-class wording and light-transmission thresholds. These are product-standard criteria, not culinary measurements. |
| Existing `WP06-MAPLE-FLAKES-R295-20261016-S08` | CFIA, [Labelling requirements for maple products](https://inspection.canada.ca/en/food-labels/labelling/industry/maple-products), grade-name, colour-class, and language sections. | Current Canadian label scope and official bilingual class wording. This URL is already owned on the maple-flakes ledger record; do not add a duplicate source entry. |
| Existing `WP07-MAPLE-SYRUP-R293-20261016-S03` | OQLF, [GDT: sirop d’érable](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358382/sirop-derable). | Existing preferred Québec French base term and English equivalent. It does not define the four grade names. |
| `WP02-C-MAPLE-GRADE-R354-S02` | Producteurs et productrices acéricoles du Québec / Érable du Québec, [Sirop d’érable](https://erableduquebec.ca/produits/sirop-derable/). | Gives all four exact French product phrases, explains colour/taste variation, and lists culinary uses. Producer-association consumer guidance, not a density or substitution source. |
| `WP02-C-MAPLE-GRADE-R354-S03` | Maple from Canada, [Maple Classification](https://www.maplefromcanada.com/about/maple-classification/). | Gives the four English class names and corresponding consumer uses. Association guidance, not a recipe ratio or independent government standard. |
| `WP02-C-MAPLE-GRADE-R354-S04` | Érablière Jérémie Tétreault, [Sirop d’érable (gallon)](https://www.erablierejt.ca/produit/sirop-derable-gallon/). | Current Québec producer offers a `Sirop d’érable` product with `Doré goût délicat` and `Ambré goût riche` selectable options. Its gallon and 540 mL pack details are product-specific; no general measure is inferred. |
| `WP02-C-MAPLE-GRADE-R354-S05` | Producteurs et productrices acéricoles du Québec / Érable du Québec, [Lait à l’érable](https://erableduquebec.ca/recettes/lait-a-lerable/). | One Québec recipe prefers very-dark maple syrup for pronounced taste. Its 1–2 tablespoon recipe amount is not a grade conversion or general substitution. |
| `WP02-C-MAPLE-GRADE-R354-S06` | Canada Gazette, [Regulations Amending the Maple Products Regulations](https://gazette.gc.ca/rp-pr/p2/2014/2014-12-31/html/sor-dors297-eng.html), SOR/2014-297, §§4–5 and Schedule III. | Official amendment introduced Canada Grade A / Canada Processing Grade and the four colour classes, replacing the previous grade system. Supports treating `Grade B`, `Extra Light`, `Light`, and `Medium` as historical wording rather than current Canadian class aliases. |

## Coordinator implementation notes

- Add four forms beneath `ingredient-ref-maple-syrup`, using the official English/French class labels and whole-product match terms in this proposal. Preserve the existing parent name and empty alias lists.
- Do not change existing generic maple-syrup recipe references or quantities. None names a class.
- Add no grade-specific density, measure mapping, recipe conversion, yield, or substitution.
- Keep maple sugar, maple butter, maple taffy, maple flakes, golden syrup, dark corn syrup, maple-flavoured table syrups, and Canada Processing Grade outside these forms.
- Keep the broad Section C checklist open; this proposal covers the maple-syrup grade example only.
- The proposal is archived as a record of the evidence and picker decisions. The integrated catalog change is summarized in the batch README below.

## Integration record

- Added four Canada Grade A colour-class forms under `ingredient-ref-maple-syrup`, with official bilingual class labels and whole-product match terms. Kept the parent aliases empty and the generic recipe links and amounts unchanged.
- Recorded one verified ledger form entry for each class. The classification thresholds and culinary guidance do not create grade-specific measures, density, conversions, or substitutions.
- Added the completed Section C grade review to the plan. Broader specialty-grade and allulose work remains open.
- Static package, generated-index, ledger, picker-boundary, recipe-demand, encoding, and whitespace checks are recorded in [the integration README](../batches/wp02-section-c-maple-syrup-grade-forms-integration-r354-20261016/README.md). No software tests were run because this change only adds database JSON data under `AGENTS.md`.

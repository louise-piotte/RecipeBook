# WP04 Section O — generic chicken / poulet identity review (R1014)

- **Review and source-access date:** 2026-10-19.
- **Status:** Proposal only. No catalog, form, ledger, recipe, plan, roadmap, batch README, or code was changed.
- **Exact plan anchor:** The open WP04 Section O species checklist at [global catalog plan, line 7207](../../RecipeBook-global-ingredient-catalog-plan.txt#L7207): “Beef, veal, pork, lamb, mutton, goat, chicken, turkey, duck, goose, quail, rabbit, and documented regional game.”
- **Candidate:** The unqualified food identity **chicken / poulet**, for ordinary chicken meat.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **chicken / poulet**. If accepted, record only Health Canada’s source-scoped cooked Food Guide portion of 75 g per one legacy Food Guide serving. Add no aliases, forms, recipe links, conversions, yields, or substitutions.
- **Scope:** One generic meat identity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.

## Identity and Québec terminology

The OQLF food-domain GDT entry selects **poulet**, gives English **chicken**, and defines the food as meat from a young hen or rooster. CFIA's current Canadian Standards of Identity defines regulated chicken carcasses within *Gallus domesticus*, and treats mature chicken and old rooster as separately named carcass classes. CFIA's meat-cuts manual also says that poultry includes several bird species and that product descriptions should name the bird species. Together, these sources support a species-specific chicken identity and distinguish it from the broader poultry category and from cut or maturity qualifiers. [R1014-S01–S03]

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-chicken-meat` |
| Category | `PROTEIN` |
| English display | `chicken` |
| Québec French display | `poulet` |
| English aliases | None |
| French aliases | None |
| Default density / unit mappings | `null` / `[]` |

Use the OQLF food-domain pair without adding `poultry`, `volaille`, `hen`, `poule`, `rooster`, or `coq` as aliases. Those terms either cover more than chicken meat or can name an animal or sex rather than the requested food. Keep the CFIA-labelled classes mature chicken, old rooster, chicken capon, and Rock Cornish hen visibly distinct when one is requested; the cited carcass standard does not make those class names synonyms for an unqualified meat identity. Do not imply a particular cut, bone or skin state, grind, temperature, processing state, or whole-bird presentation. [R1014-S01–S03]

Keep the existing chicken breast and chicken thigh identities separate. The CFIA cut manual treats breast, thigh, leg, wings, and giblets as separately described parts; that supports the boundary but does not make those cut names aliases or forms of this proposed base row. Keep chicken stock, broth, bouillon, rendered fat, eggs, and organ/giblet products in their existing identities and categories. [R1014-S03]

## Current ownership and evidence-transfer review

The read-only snapshot covered **2,025 active references, 205 forms, 55 legacy-import candidates, 2,431 ledger records, and all 114 manifest-listed recipes / 1,123 ingredient rows**. No base `chicken / poulet` identity, `ingredient-ref-chicken-meat` ID, matching form, legacy candidate, or generic chicken-meat ledger record exists. No form label or form match term owns chicken or poulet. [R1014-R01]

| Current owner | Existing scope and retained boundary |
|---|---|
| `ingredient-ref-chicken-breast` | Existing cut identity with breast-specific aliases. Its ledger record is `unreviewed` and has no sources. Do not copy its aliases, links, or any measurement to the proposed base identity. |
| `ingredient-ref-chicken-thigh` | Verified cut identity. Its four sources cover CFIA cut terminology and Québec wording for the thigh; they do not establish a generic chicken identity or measurements. Preserve the source record unchanged. |
| `ingredient-ref-chicken-stock`, `ingredient-ref-low-salt-chicken-broth`, `ingredient-ref-chicken-bouillon-powder`, and `ingredient-ref-chicken-bouillon-cubes` | Separate `STOCK_AND_BROTH` identities. They do not represent chicken meat. |
| `ingredient-ref-rendered-chicken-fat` | Separate `FAT_AND_OIL` identity. Its named product and rendering evidence remains scoped there. |
| `candidate-generic-poultry-fat` | Unresolved candidate for broad poultry-fat wording. It is not a chicken-meat candidate and does not support this identity. |

The older [`protein-dairy-identities.md`](../batches/protein-dairy-identities.md) inventory also lists chicken as a generic meat identity candidate, while separately listing chicken breast among the active cut identities. The newer Section O cut review for chicken thigh does not decide this base identity. No source-specific statement from a branded or retailer entry is transferred; the proposal uses OQLF and CFIA terminology sources directly. [R1014-R01]

## Bundled recipe demand

The corpus scan found **three chicken-meat rows**, all explicitly naming chicken breast and linked to `ingredient-ref-chicken-breast`:

| Recipe row | Saved line | Existing link |
|---|---|---|
| `085#1` — Maple Chicken | `1 chicken breast` | `ingredient-ref-chicken-breast` |
| `086#1` — Butter Chicken | `1 kg chicken breasts, boneless and cut into cubes` | `ingredient-ref-chicken-breast` |
| `087#2` — Chicken Parmesan | `2 chicken breasts` | `ingredient-ref-chicken-breast` |

These are cut-specific requests, so keep their original text, amounts, notes, and links unchanged. They support catalog coverage of chicken as a common species but do not request the unqualified base row, a whole bird, chicken thigh, or a per-breast measure. The `chicken broth` line in recipe `037` belongs to `STOCK_AND_BROTH` and is not chicken-meat demand. [R1014-R01]

## Portion, forms, and substitutions

- **One source-scoped cooked portion:** Health Canada's legacy *What is a Food Guide Serving of Meat and Alternatives* handout says its meat, fish, poultry, and shellfish servings are cooked and lists **Chicken — 75 g / 125 mL (½ cup)** for one Food Guide serving. If integrated, store only **75 g** as a cooked, source-specific `portion_weight` observation with basis `one legacy Food Guide serving`. Treat this as a historical dietary portion, not current dietary guidance, a recipe amount, or a raw-to-cooked yield. Do not store the paired 125 mL as a density, mapping, or conversion. [R1014-S04]
- **No generic form or recipe-linked measure:** The recipe rows name breast, not a generic cut. Add no forms and no count weight for a chicken breast. Health Canada's portion is not a per-breast amount. The current CNF Food Code 919 observation is specifically lean, ground, cooked chicken; do not transfer that product-state-specific row to generic chicken. [R1014-R01, R1014-S04]
- **No substitution rule:** The corpus contains no generic chicken-meat row or directed replacement context. Add no global or contextual substitution, and leave substitution research open for a future cut-, form-, dish-, and method-specific request.

## Queue disposition

This review advances generic ingredient diversity and pursued no commercial-product roster. Any queued item whose only output would be brand, product-line, flavour-family, SKU, or retailer-variant counts is out of scope because commercial-product counts do not add ingredient diversity. Preserve existing branded rows and their evidence; keep product-specific claims and measurements attached to their named products unless separate evidence proves they transfer.

## Proposal source register

These source IDs are proposal-local; none was added to the research ledger.

| Source ID | Source and locator | Support and limits |
|---|---|---|
| **R1014-S01** | Office québécois de la langue française, [poulet (GDT), food domain](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428070/poulet), updated 2015. | Selects `poulet`, gives English `chicken`, and defines the food as meat from a young hen or rooster. Supports the Québec French and English base display in the food domain; it does not establish a cut, amount, maturity class beyond its definition, form, or substitution. |
| **R1014-S02** | Canadian Food Inspection Agency, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7), Standards for Poultry Carcasses, ss. 6–11. | Defines regulated chicken carcasses as *Gallus domesticus* with specified carcass maturity characteristics; separately names chicken capon, Rock Cornish hen, mature chicken, and old rooster. This is a standard for graded dressed or partially dressed carcasses, not a complete culinary taxonomy or generic amount. |
| **R1014-S03** | Canadian Food Inspection Agency, [Poultry — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/poultry) and [Chicken wholesale nomenclature](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/wholesale-meat/chicken). | Defines poultry across turkey, duck, goose, guinea fowl, and *Gallus domesticus*, asks that the species be named, and distinguishes whole carcasses and their cut parts. Supports keeping chicken separate from poultry and keeping cuts/giblets out of base aliases; does not support any unreviewed form or recipe measurement. |
| **R1014-S04** | Health Canada, [Eating Well with Canada’s Food Guide — What is a Food Guide Serving of Meat and Alternatives](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/hpfb-dgpsa/pdf/food-guide-aliment/serving_meat-viande_portion-eng.pdf), PDF p. 1, Chicken row and cooked-serving note. | Lists 75 g / 125 mL for one `Chicken` Food Guide serving and says the listed meat, fish, poultry, and shellfish servings are cooked. The document is legacy guidance; only its exact source-scoped cooked portion is proposed. It does not support a breast count, conversion, density, yield, or current dietary recommendation. |
| **R1014-R01** | Local read-only audit of the current Section O checklist, active references and aliases, forms and match terms, legacy-import identities, ledger ownership, and all manifest-listed recipes, 2026-10-19. | Confirms point-in-time ownership, three cut-specific chicken recipe rows, no generic base identity, and adjacent product/cut boundaries. It is not external name or measurement evidence. |

## Recommendation

Add identity-only **chicken / poulet** as `ingredient-ref-chicken-meat` in `PROTEIN`, with no aliases, forms, recipe links, density, or unit mappings. If the legacy Food Guide observation is accepted, record only 75 g as a cooked portion for one source-defined serving and keep its paired volume outside conversion data. Preserve all existing cut, stock, broth, fat, and branded rows and their source ownership. Add no cooking-safety or raw-consumption claims. Section O remains open for its other species, cuts, offal, and cured products; Section P remains open.

No software tests or builds were run because this is a proposal-only documentation change.

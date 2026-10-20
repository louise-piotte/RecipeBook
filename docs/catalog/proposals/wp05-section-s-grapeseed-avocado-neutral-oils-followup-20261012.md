# WP05 Section S — grapeseed, avocado, neutral oils, and olive wording follow-up

- **Review date:** 2026-10-12
- **Status:** proposal-only; no canonical or shared planning files changed
- **Scope:** current owners and recipe demand for grapeseed oil, avocado oil, neutral or mixed vegetable oil, and remaining olive-oil wording

## Recommendation

Add two named-oil identities in a later identity-only integration. The current Québec evidence now supports the culinary terminology for grapeseed oil and the bilingual display for avocado oil. Neither has an exact ingredient-row match in the 114-recipe library, so do not create recipe links. Keep neutral or mixed oil wording generic, and preserve the current olive-oil split.

| Candidate | Proposed decision | Display and aliases | Boundary |
|---|---|---|---|
| Grapeseed oil | Add `ingredient-ref-grapeseed-oil` | EN `grapeseed oil`; FR `huile de pépins de raisin`; EN alias `grape seed oil`; no FR aliases | Use the current Québec product name and OQLF term. Do not add `huile de raisin`, `raisin seed oil`, `grape oil`, or `neutral oil` as aliases. |
| Avocado oil | Promote the existing legacy candidate `ingredient-ref-avocado-oil` | EN `avocado oil`; FR `huile d'avocat`; no aliases | Keep `deodorized` and other process or quality wording out of the base identity and aliases. |
| Neutral or mixed vegetable oil | Do not add a new identity or alias | Retain active `ingredient-ref-vegetable-oil`: EN `vegetable oil`; FR `huile végétale`; aliases remain empty | Do not attach `neutral oil`, `neutral vegetable oil`, bare `oil`, or bare `huile` to generic or source-specific refs. A blend has no recipe demand or stable formula in this corpus. |
| Olive oil | Keep the two active identities and current links | `ingredient-ref-olive-oil`: `olive oil` / `huile d'olive`; `ingredient-ref-extra-virgin-olive-oil`: `extra-virgin olive oil` / `huile d'olive vierge extra`; no aliases | Do not add virgin, refined, light, or pomace identities or aliases without exact recipe wording and a separate source-backed case. |

This resolves only the earlier evidence holds for grapeseed and avocado oil. The existing decisions on canola, generic vegetable oil, and extra-virgin olive oil remain in force. Add no forms, densities, unit mappings, conversions, substitutions, or recipe links.

## Repository and ownership audit

I read `AGENTS.md`, the global ingredient-catalog plan and WP05 workflow checkpoint, the earlier [Section S fats-and-oils proposal](wp05-section-s-fats-oils-gap-review-20261012.md), and the completed [fats-and-oils](../batches/wp05-section-s-fats-oils-integration-20261012/README.md), [regional-oils](../batches/wp05-section-s-regional-oils-integration-20261012/README.md), [animal-fats](../batches/wp05-section-s-animal-fats-integration-20261012/README.md), and [infused-oil](../batches/wp05-section-s-infused-oil-integration-20261012/README.md) work. This working-tree snapshot contains **1,152 active references, 83 forms, 68 legacy candidates, 114 recipes, 1,123 ingredient rows, and 1,453 research-ledger records**. Refresh these counts before integration.

Exact phrase and alias inspection across active references, forms, and legacy candidates found:

- `ingredient-ref-olive-oil` owns only `olive oil` / `huile d'olive`; its alias arrays are empty.
- `ingredient-ref-extra-virgin-olive-oil` owns only `extra-virgin olive oil` / `huile d'olive vierge extra`; its alias arrays are empty.
- `ingredient-ref-vegetable-oil` owns only `vegetable oil` / `huile végétale`; its alias arrays are empty. The prior integration removed `canola oil`, `huile de canola`, `neutral oil`, `oil`, and `huile`. Do not restore them.
- `ingredient-ref-canola-oil` is the separate active owner for `canola oil` / `huile de canola`.
- No active reference or form owns grapeseed oil, avocado oil, `neutral oil`, or a mixed-vegetable-oil phrase. The legacy file has one exact candidate, `ingredient-ref-avocado-oil` (`avocado oil` / `huile d'avocat`, no aliases, `unreviewed`). There is no grapeseed or neutral-oil legacy candidate. The avocado ledger record remains an unresolved, source-less candidate; this review supplies new terminology and current product evidence but does not alter the ledger.
- The already integrated regional-oil IDs and their aliases remain the owners for their named sources; this proposal adds none of those oils again.

## Recipe-demand scan

I searched every manifest-listed recipe file, inspecting each `ingredients[]` row's original wording, normalized name, current reference ID, and notes for grapeseed, grape-seed, avocado, neutral-oil, mixed-vegetable-oil, and olive-grade wording in English and French. The scan covered all **114 recipes / 1,123 ingredient rows**.

- **Grapeseed, avocado, neutral oil, and explicit mixed vegetable-oil blend:** zero ingredient-row matches. The two proposed source identities are supported by catalog and Québec market evidence, not by current recipe demand.
- **Generic vegetable oil:** nine rows remain on `ingredient-ref-vegetable-oil`. Two mention canola as an alternative or note: Red Velvet Cake says “Canola oil also works,” and German Chocolate Cake says “canola or vegetable oil.” Neither line selects a source; both remain generic.
- **Unqualified olive oil:** seven rows remain on `ingredient-ref-olive-oil`.
- **Extra-virgin olive oil:** exactly two explicit rows are already linked to `ingredient-ref-extra-virgin-olive-oil`:

| Recipe | Exact row | Current text and link |
|---|---|---|
| [Sous Vide Tuna](https://recipes.anovaculinary.com/recipe/sous-vide-tuna) | `b699f193-4545-4e7a-98ad-ce092a1e38e4-ingredient-4` | `1 tbsp extra-virgin olive oil` → `ingredient-ref-extra-virgin-olive-oil`; notes say `extra-virgin` / `extra-vierge`. |
| [Tzatziki](https://cookieandkate.com/how-to-make-tzatziki/) | `9dc0c02c-ac20-411c-9adf-38095e980487-ingredient-3` | `2 tbsp extra-virgin olive oil` → `ingredient-ref-extra-virgin-olive-oil`; notes say `extra-virgin` / `extra-vierge`. |

No new recipe link or change to either existing olive-oil link is warranted. No standalone “virgin,” “refined,” “light,” or “pomace” olive-oil row appears in the recipe ingredients.

## Québec and Canadian terminology and boundaries

**Grapeseed oil.** OQLF's [huile de pépins de raisin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8886279/huile-de-pepins-de-raisin) record pairs the French term with `grape seed oil` and `grapeseed oil`. It is dated 1983 and classed in organic chemistry, with industrial uses; by itself it would not establish a culinary ingredient. Current food-product evidence fills that gap: Québec producer La Maison Orphée sells [Neutral-Tasting Grapeseed Oil](https://maisonorphee.com/en/collections/seed-oils/products/neutral-tasting-grapeseed-oil) and the French [Huile de pépins de raisin au goût neutre](https://maisonorphee.com/collections/huiles-classiques/products/huile-de-pepins-de-raisins) for cooking. A current Québec retailer, Mayrand, lists [Huile de pépins de raisin](https://mayrand.ca/fr/nos-produits/epicerie/huile-et-vinaigre/huile/huile-de-pepins-de-raisin-unico-30487) as a grocery oil. Together, these support the proposed bilingual identity and the English spelling alias. The OQLF associated `huile de raisin` and `raisin seed oil` are excluded: they are not the preferred product names, and the OQLF record does not establish them as current culinary labels.

“Neutral-tasting” is a qualifier on a particular grapeseed product, not a source identity. La Maison Orphée's current [avocado-oil product](https://maisonorphee.com/en/collections/all/products/deodorized-avocado-oil) also describes a neutral taste, reinforcing that neutral describes a sensory property shared by distinct source oils. Its product-specific extraction and deodorization details should not become aliases or catalog forms.

**Avocado oil.** La Maison Orphée's French product page names [Huile d’avocat désodorisée](https://maisonorphee.com/products/huile-avocat-desodorisee), while its English page names [Deodorized Avocado Oil](https://maisonorphee.com/en/collections/all/products/deodorized-avocado-oil). Both pages identify the food as avocado oil and describe culinary use; the French ingredient line uses `Huile d'avocat`. Reusing the exact legacy candidate ID avoids a duplicate identity. Promote only the base bilingual name with no aliases. Do not promote `deodorized avocado oil`, `huile d'avocat désodorisée`, cold-pressed, origin, or taste wording to aliases: these refer to product/process attributes, not alternate source names.

**Generic and mixed oil.** CFIA publishes current [English](https://inspection.canada.ca/en/food-labels/labelling/industry/fats-and-oils) and [French](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/matieres-grasses-huiles) guidance. It names a single-source cooking oil by source and accepts `vegetable oil` / `huile végétale` for multi-source vegetable oil; in certain ingredient-list contexts, the general wording can also be used for a source oil. This explains why a generic recipe row does not choose canola, grapeseed, avocado, or a blend. Keep the current generic identity on all nine rows, including the two canola alternatives. Do not create a universal mixed-oil identity from the label class.

OQLF's [huile neutre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8473088/huile-neutre) page is a 1975 petroleum-and-natural-gas term for lubricating oil, not an edible oil. That entry is not proof that cooks never use “neutral oil” colloquially. However, the phrase does not name the oil source, is not an alias for any one current source oil, and has no exact recipe demand here. Keep it out of the reference catalog and preserve it, if encountered in future recipes, as unqualified wording pending context.

**Olive oil.** CFIA states that extra-virgin and virgin designations are specific to olive oil and distinguishes them from refined and pomace oils. The existing generic/extra-virgin identities and their seven/two recipe split already capture the only olive wording found. Preserve the [prior OQLF/CFIA-backed integration decision](../batches/wp05-section-s-fats-oils-integration-20261012/README.md); this follow-up does not add aliases such as `extra virgin olive oil` without a hyphen, French ordering variants, or broader grade terms.

## Sources and limits

| ID | Source | Use and limitation |
|---|---|---|
| `WP05-OIL-FOLLOWUP-20261012-S01` | OQLF, [huile de pépins de raisin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8886279/huile-de-pepins-de-raisin) | Québec bilingual terminology and spelling; dated 1983 and not a culinary source. |
| `WP05-OIL-FOLLOWUP-20261012-S02` | La Maison Orphée, [EN grapeseed oil](https://maisonorphee.com/en/collections/seed-oils/products/neutral-tasting-grapeseed-oil) and [FR huile de pépins de raisin](https://maisonorphee.com/collections/huiles-classiques/products/huile-de-pepins-de-raisins) | Current bilingual product names and culinary use from one Québec producer; product-specific neutral-taste and processing language is not generalized. |
| `WP05-OIL-FOLLOWUP-20261012-S03` | Mayrand, [Huile de pépins de raisin](https://mayrand.ca/fr/nos-produits/epicerie/huile-et-vinaigre/huile/huile-de-pepins-de-raisin-unico-30487) | Current Québec grocery product corroborates the French display name; no broader alias set inferred. |
| `WP05-OIL-FOLLOWUP-20261012-S04` | La Maison Orphée, [FR avocado oil](https://maisonorphee.com/products/huile-avocat-desodorisee) and [EN avocado oil](https://maisonorphee.com/en/collections/all/products/deodorized-avocado-oil) | Current matching product pages support the exact bilingual base oil name and culinary product class; process and origin details stay product-specific. |
| `WP05-OIL-FOLLOWUP-20261012-S05` | CFIA, [EN fats-and-oils labelling](https://inspection.canada.ca/en/food-labels/labelling/industry/fats-and-oils) and [FR exigences d’étiquetage](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/matieres-grasses-huiles) | Supports source-specific naming, generic multi-source vegetable-oil wording, some ingredient-list exceptions, and olive-grade boundaries. Labelling rules do not infer a recipe author's intended source or substitutability. |
| `WP05-OIL-FOLLOWUP-20261012-S06` | OQLF, [huile neutre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8473088/huile-neutre) | Demonstrates that this Québec terminology entry is industrial/petroleum-related; not evidence against informal culinary use. |

The market evidence establishes names and product existence, not recipe demand or equivalence among oils. No recipe row is linked to either proposed source identity. This packet proposes identity and alias decisions only; no numeric data, conversions, substitutions, forms, or recipe edits are proposed. No tests or emulator checks were run for this proposal-only review.

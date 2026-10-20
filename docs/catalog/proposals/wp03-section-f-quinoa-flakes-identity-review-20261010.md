# WP03 Section F proposal: quinoa flakes identity review (2026-10-10)

**Status:** coordinator integration completed 2026-10-10; see the integration note below.  
**Recommendation:** accept one identity-only `GRAIN_AND_CEREAL` reference for the flaked quinoa product class. Keep forms, aliases, recipe links, measurements, density, unit mappings, yields, and substitutions empty.

## Scope and current-package check

Section F still calls for coverage of regionally significant cereal mixes and preprocessed grains. This review isolates plain quinoa flakes as a processed quinoa product that is not in the live catalog and is not the recently reviewed puffed-quinoa product. A search of the existing Section F proposals and batch notes found no focused quinoa-flakes review. The existing puffed-quinoa packet covers a different process and product.

The manifest-backed package snapshot contains 883 ingredient references, 48 forms, 114 recipe files, and 1,123 recipe ingredient rows. The research ledger has 1,128 records; the legacy candidate file has 77 candidates. The active neighboring references are:

| Active identity | Category | Boundary to preserve |
|---|---|---|
| `ingredient-ref-quinoa` (`quinoa / quinoa`) | `GRAIN_AND_CEREAL` | Generic quinoa grain; dry and cooked states are separate forms. |
| `ingredient-ref-quinoa-flour` (`quinoa flour / farine de quinoa`) | `FLOUR_AND_STARCH` | Ground flour product. |
| `ingredient-ref-roasted-quinoa-flour` (`roasted quinoa flour / farine de quinoa torréfiée`) | `FLOUR_AND_STARCH` | Separate roasted milling product. |
| `ingredient-ref-puffed-quinoa` (`puffed quinoa / quinoa soufflé`) | `GRAIN_AND_CEREAL` | Expanded/puffed grain product, not flattened flakes. |

`ingredient-ref-quinoa-flakes` is absent from active references, forms, ledger record IDs, and legacy candidates. The exact-key audit used the package's `normalize_search_key` routine (case folding, Unicode decomposition/accent folding, punctuation and whitespace normalization) for `quinoa flakes`, `quinoa flake`, `flaked quinoa`, color- and organic-qualified English product names, `flocons de quinoa`, singular and color-qualified French product wording, and the proposed ID. There are no exact normalized collisions in active reference names/aliases, form labels/match terms, ledger strings, or legacy names/aliases. A separate text search across prior Section F proposals found no focused quinoa-flakes packet. Broad `quinoa` searches intentionally return the neighboring generic, flour, roasted-flour, and puffed-quinoa identities.

## Recipe demand audit

Every recipe path in the current manifest was searched for the candidate English and French product phrases, first in complete recipe text and then in ingredient rows. Candidate-specific demand is zero.

| Search scope | Recipe files with a candidate phrase | Ingredient rows with a candidate phrase |
|---|---:|---:|
| `quinoa flakes`, `quinoa flake`, `flaked quinoa`, `flocons de quinoa` and qualified variants | 0 / 114 | 0 / 1,123 |

Generic quinoa occurs in two recipe files but does not establish demand for flakes:

| Recipe | Exact context | Catalog effect |
|---|---|---|
| 016, Quinoa Bites | Ingredient row `2 cups cooked quinoa` | Already linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`; do not relink. |
| 018, Turkey Meatballs | Serving suggestion says to serve with couscous, quinoa, or salad greens | No quinoa ingredient row and no flake wording; no new link. |

## Proposed catalog identity

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-quinoa-flakes` |
| `nameEn` | `quinoa flakes` |
| `nameFr` | `flocons de quinoa` |
| `category` | `GRAIN_AND_CEREAL` |
| `aliasesEn` / `aliasesFr` | `[]` / `[]` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |

The recommended French display uses the plural product wording found in Québec product listings and in the Québec producer's product family. Tootsi's French page titles one SKU with singular `flocon de quinoa blanc biologique`, but its description uses plural `flocons de quinoa blanc`; the organic and color qualifiers are SKU-specific. Do not add that singular title, `white`, `red`, `organic`, or `toasted` wording as a global alias. OQLF records `flocons` as a plural noun for “flakes”; that entry supports number and word choice, while the exact compound is supported by Québec-market product sources rather than an OQLF compound-term ruling.

Use a separate identity rather than a dry/cooked form of generic quinoa: flaking changes the product, and current Section F practice models processed flakes (such as corn flakes and barley flakes) as cereal identities. Keep it distinct from intact quinoa, quinoa flour, roasted quinoa flour, and puffed quinoa. Tootsi and Quinoa du Québec document white/red and conventional/roasted product variations; this packet does not multiply them into catalog identities or aliases. In particular, “toasted quinoa flakes” is a source-described variant, not an accepted synonym for every flake product.

## Evidence and limits

Sources were opened on 2026-10-10. The source IDs below are proposal-local and are not ledger records.

| Source ID | Source | Evidence used and limits |
|---|---|---|
| `WP03-QFLAKES-20261010-S01` | OQLF, [grain entier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544101/grain-entier), 2018 | Names quinoa as a possible whole-grain source and says whole grains may be intact, crushed, flaked, ground, or milled. Supports the product boundary; it does not establish that every commercial quinoa flake retains every whole-grain component. |
| `WP03-QFLAKES-20261010-S02` | OQLF, [produit céréalier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17033605/produit-cerealier), 2023 | Defines a grain product as food from grain transformation and explicitly includes products based on quinoa. Supports the existing `GRAIN_AND_CEREAL` classification convention; it does not define the compound “quinoa flakes.” |
| `WP03-QFLAKES-20261010-S03` | OQLF, [flocons](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299098/flocons), 1982 | Gives preferred plural `flocons` and English `flakes`. This is general food terminology, not a quinoa-specific term ruling. |
| `WP03-QFLAKES-20261010-S04` | Tootsi, [Organic White Quinoa Flakes](https://tootsi.com/en-GB/Product/Detail/30099) and [French SKU page](https://tootsi.com/fr-FR/Product/Detail/30099) | The producer names SKU 30099 as organic white quinoa flakes; the French body describes quinoa grains flattened into flakes and calls them `flocons de quinoa blanc`. The ingredient is organic quinoa. The brand's suggested oat uses are not a general substitution rule. Its declared 1/4-cup serving is 40 g for this SKU only. |
| `WP03-QFLAKES-20261010-S05` | Tootsi, [Organic Red Quinoa Flakes](https://tootsi.com/en-GB/Product/Detail/30093) | A separate red SKU describes flattened whole red quinoa seeds. Its nutrition label declares 1/4 cup as 45 g. The different color and package declaration are product-specific and must not be generalized to white flakes or the identity. |
| `WP03-QFLAKES-20261010-S06` | Quinoa du Québec, [Nos produits pour les professionnels](https://www.quinoaquebec.com/nosproduitprofessionnel) | The Québec producer lists whole grains, quinoa flour, and `flocons de quinoa` under distinct product headings. It distinguishes conventional flakes from roasted flakes and describes different flavor/texture attributes. This supports a processed product class and French naming; wholesale 20/25 kg pack formats are not recipe measures. |
| `WP03-QFLAKES-20261010-S07` | La Moisson, [Flocons de Quinoa bio](https://lamoisson.com/collections/abenakis-gourmet/products/flocons-de-quinoa-bio) | Québec retailer title and ingredient statement use `Flocons de Quinoa` / `Flocons de quinoa biologiques` and identify the product as prepared in Québec. This supports Québec-market wording, not a general organic qualifier. |
| `WP03-QFLAKES-20261010-S08` | GoGo Quinoa, [Organic Quinoa Flakes](https://gogoquinoa.com/products/quinoa-flakes-6-boxes) | Canadian product page names quinoa flakes and supplies product-specific porridge instructions: 1/3 cup (40 g) with 1/2–2/3 cup water or milk, then rest 1 minute. The 350 g package, portion, and directions are not transferable measures, density, form, or yield. Its “alternative to oatmeal” positioning is not a scoped substitution rule. |

## Forms, measurements, yields, and substitutions

| Aspect | Evidence-qualified disposition |
|---|---|
| Forms | Add no `IngredientForm`. The flaked product is the proposed identity. Do not treat “dry” or “cooked” as a measured conversion to generic quinoa. No bundled line asks for cooked flakes or porridge. |
| Density and unit mappings | Keep `defaultDensity: null` and `unitMappings: []`. Tootsi's white SKU gives 1/4 cup = 40 g; its red SKU gives 1/4 cup = 45 g; GoGo's product gives 1/3 cup = 40 g. These are differing product-label serving declarations, not a universal cup-to-mass factor or a density. |
| Cooking yield | Add no yield or hydration conversion. GoGo gives one product's porridge liquid range and rest time; Tootsi describes cooking flakes like oatmeal. Neither source provides a transferable dry-to-cooked yield. |
| Substitution | Add no global or contextual substitution. Tootsi recommends using its product in oatmeal or in baked goods in place of oats; GoGo describes its flakes as an alternative to oatmeal. Those producer-use statements do not specify recipe role, quantity equivalence, method limits, or performance across recipes. The package has no matching recipe line to validate a context. |

## Acceptance checks if integrated

1. Add only `ingredient-ref-quinoa-flakes` with the bilingual display pair and empty alias arrays shown above, category `GRAIN_AND_CEREAL`, null density, and no unit mappings.
2. Preserve the generic quinoa dry/cooked forms, quinoa flour, roasted quinoa flour, and puffed quinoa identities; do not relink recipes 016 or 018.
3. Verify exact normalized matching for `quinoa flakes` and `flocons de quinoa` resolves to the new identity; keep color, organic, roasted, cereal, oatmeal, and broad `quinoa` matches visibly qualified.
4. Keep forms, measures, density, unit mappings, conversions, yields, and substitutions absent unless later recipe-specific evidence supports them.

## Section F work remaining

This proposal addresses one preprocessed-grain identity only and does not close Section F. The plan's open coverage still includes the unresolved generic sushi-rice and farro boundaries, the pot/Scotch-barley French name, ordinary grits/polenta and pearled hominy/pozole-corn/dried-sweet-corn holds, remaining species and product review across millet, sorghum, fonio, quinoa, and amaranth, regional cereal mixes, and selective dry/cooked form questions. The broader independent Québec French review also remains open. Preserve those holds and review scopes as recorded in the plan.

## Coordinator integration — 2026-10-10

Root independently checked the OQLF entries for `grain entier`, `produit céréalier`, and `flocons`, plus the Québec producer Quinoa du Québec, Tootsi's white and red product pages, the La Moisson Québec listing, and GoGo Quinoa's product page. Together they support a distinct flaked quinoa product and the bilingual display `quinoa flakes` / `flocons de quinoa`. The neighboring whole-grain, flour, roasted-flour, and puffed-quinoa identities remain distinct.

**Decision: accept `ingredient-ref-quinoa-flakes` as an identity-only `GRAIN_AND_CEREAL` row.** It has no aliases, forms, recipe links, density, or unit mappings. The shared ledger retains three different manufacturer/publisher portion statements as product-specific observations (Tootsi white 40 g per 1/4 cup, Tootsi red 45 g per 1/4 cup, and GoGo 40 g per 1/3 cup); the generic measurement state remains `researched_no_supported_value`. Broad oatmeal/baking statements support no active substitution. No recipe files or ingredient lines were changed. The generator, package tests, and Android picker tests cover the identity and both displays.

# WP03 Section F: spelt-flakes identity review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Integrated on 2026-10-11 as an identity-only reference. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.
- **Checklist scope:** one product identity under the open Section F item for regionally significant cereal mixes and preprocessed grains: plain spelt flakes.
- **Recommendation:** **accept an identity-only `GRAIN_AND_CEREAL` reference** as `spelt flakes / flocons d’épeautre`, with no aliases, forms, measurements, conversions, yields, recipe links, or substitutions. Québec product listings attest the French product wording and describe the flakes as spelt grain rolled flat. OQLF supports the base pair *épeautre / spelt* and identifies spelt as a variety of wheat; it does not standardize a flake-product term.

## Open item and prior coverage

The active plan leaves “regionally significant cereal mixes and preprocessed grains” open [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L1720), and the [plant-grains checklist](../batches/plant-grains-cereals.md#section-f-checklist-disposition) also marks this family open. The plan separately tracks rice cakes and related prepared starches; this review does not cover those products.

No prior proposal in the current proposal set reviews spelt flakes. Existing spelt-related coverage is limited to [spelt flour](wp02-wheat-flour-quebec-identity-gap-review-20261010.md), [puffed spelt](wp03-section-f-next-gap-review-20261011-puffed-spelt.md), and [einkorn flour / farine de petit épeautre](../batches/plant-grains-cereals.md). Other cereal-flake identities, including buckwheat, barley, and rye, have separate reviews or active rows; they do not cover spelt flakes.

This candidate means plain flakes made from spelt grain rolled flat, as directly described by Québec product sources. It does not assert that the flakes are whole-grain, steamed, precooked, quick-cooking, or interchangeable with any other flake. Organic status belongs to the cited commercial product and is not part of the proposed ingredient identity.

## Live package and exact-key audit

The audit read the current manifest-listed seed package and its recipe files, the active reference catalog, forms, package-yield and substitution parts, research ledger, legacy import candidates, the Section F plan/checklist, and all existing proposals. Candidate terms were compared with the repository’s `normalize_search_key` behavior, which folds case, accents, punctuation, and ligatures.

| Live surface | Current result |
| --- | --- |
| Active ingredient references | 907 references. There is no exact normalized reference or alias for `spelt flakes`, `spelt flake`, `flaked spelt`, `organic spelt flakes`, `flocons d’épeautre`, `flocons d’épeautre biologiques`, or `flocons de blé d’épeautre`; the proposed ID `ingredient-ref-spelt-flakes` is also unallocated. Nearby exact identities are `ingredient-ref-spelt-flour` (`spelt flour / farine d’épeautre`), `ingredient-ref-puffed-spelt` (`puffed spelt / épeautre soufflé`), and `ingredient-ref-einkorn-flour` (`einkorn flour / farine de petit épeautre`). None is an alias or form for flakes. |
| Search collisions and sibling products | Exact proposed keys have no collision. A broad `spelt` search already reaches spelt flour and puffed spelt; broad `épeautre` text also occurs in the qualified einkorn display `farine de petit épeautre`. Keep those identities separate and do not offer a bare `épeautre` alias. Active flake-related identities include barley, buckwheat, corn, quinoa, rye, oat, poha, and dried-bonito flakes; none is a spelt synonym. |
| Ingredient forms | 48 forms total. No form or match term refers to spelt flakes, `flaked spelt`, or *flocons d’épeautre*. The existing poha thickness grades are unrelated and must not be reused. |
| Research ledger | 1,161 records. No exact spelt-flake candidate or prior decision exists. Related records cover spelt flour, puffed spelt, einkorn flour, and unresolved farro scope; those records establish boundaries but do not cover this rolled product. |
| Legacy import candidates | 77 candidates; no exact spelt-flake name, alias, or proposed ID. |
| Bundled recipe demand | 114 recipes and 1,123 ingredient rows. **Zero** ingredient rows contain `spelt`, `épeautre`, or a spelt-flake phrase. No recipe link, form, quantity, conversion, yield, or substitution is presently required. |
| Numeric and substitution parts | The active package has no spelt-flake package yield, density, unit mapping, or substitution relation. The one package-yield record is unrelated; no substitution rule is linked to spelt. |

## Identity, terminology, and boundaries

The Québec product evidence describes a grain product, not a flour or a generic state of the unprocessed grain. Aliments du Québec lists La Milanaise’s *Flocons d’épeautre biologique* and says they come from organic spelt grain rolled flat. La Boîte à Grains uses the unqualified phrase *flocons d’épeautre* in its product description and gives an ingredient declaration of *flocons de blé d’épeautre biologiques*. The manufacturer’s English catalog lists *Organic Spelt Flakes* separately from spelt berries, spelt flour, spelt bran, and its other flake products. Together these support the narrow product identity and the proposed bilingual name pair.

| Term or boundary | Disposition | Evidence and limit |
| --- | --- | --- |
| English display | `spelt flakes` | Direct English product wording is `Organic Spelt Flakes`. Remove only the organic qualifier from the ingredient identity; do not claim this covers every spelt-flake grade or processing method. |
| Québec French display | `flocons d’épeautre` | The exact unqualified phrase appears in a Québec retailer’s product description; the product title and ingredient panel add the organic qualifier. OQLF supports *épeautre* as the preferred base noun and pairs it with *spelt*, but does not name this processed product. |
| Aliases | None | Keep `organic spelt flakes` and `flocons d’épeautre biologiques` as source product wording, not extra aliases. Do not add `flaked spelt`, `wheat flakes`, `flocons de blé`, or a mechanical singular/plural variant without distinct recipe or search evidence. |
| Spelt flour | Keep separate | The active `spelt flour / farine d’épeautre` row is a milled product, not flakes. No conversion or substitution between flour and flakes is supported. |
| Puffed spelt | Keep separate | The active `puffed spelt / épeautre soufflé` row is an expanded-grain product. Rolling flat and puffing are different processes; do not alias either product to the other. |
| Einkorn / petit épeautre | Keep separate | Existing `einkorn flour / farine de petit épeautre` is species-qualified. OQLF’s *épeautre* entry describes spelt, while the current catalog separately reserves *petit épeautre* for einkorn flour. Do not use `petit épeautre` or unqualified `épeautre` as an alias for these flakes. |
| Other flakes and mixed cereals | Exclude | Keep barley, rye, buckwheat, oat, Khorasan, poha, and multigrain flakes under their own product identities. Do not map a generic `wheat flakes` phrase to spelt. |
| Whole grain, heat treatment, and cooking state | Unspecified | The Québec retailer says the grain is rolled flat, but reviewed sources do not establish bran retention, steaming, precooking, or a general ready-to-eat/cooked state. Do not add those qualifiers or forms. |

## Forms, quantities, recipes, and substitutions

| Data area | Disposition |
| --- | --- |
| Forms | Add none. The available product description identifies rolled flakes but does not establish catalog-worthy raw, cooked, steamed, or quick-cooking forms. |
| Density and unit mappings | Leave unset. The documented 500 g package is a net package size, not a household volume measure. No `g/cup`, `g/ml`, or other flake density was found. |
| Measurements and conversions | Add none. La Milanaise gives a product-specific instruction to boil two parts water, add one part flakes, and simmer 12–15 minutes. The page does not define a mass or volume unit for “parts”; this is not a conversion, a general quantity mapping, or a seed recipe measurement. |
| Package yields | Add none. A 500 g package size does not describe a prepared yield. No source reports a spelt-flake cooked yield. |
| Substitutions | Add no rule. La Milanaise calls its flakes an alternative to traditional oat flakes, but gives no ratio or validated dish/method scope. That product suggestion does not support automatic substitution or conversion. |
| Bundled recipes | Add no recipe link or relinking. The complete current recipe corpus has zero rows naming spelt or spelt flakes. |

## Source register

Sources were checked on 2026-10-11 unless a page’s crawl date is noted.

| Ref | Source | Use and limits |
| --- | --- | --- |
| S01 | [OQLF, Grand dictionnaire terminologique — épeautre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre) | Primary Québec terminology authority pairs *épeautre* with English *spelt* and defines it as a variety of wheat. It supports the base word and wheat-family boundary, not a flake product term. |
| S02 | [Aliments du Québec — Flocons d’épeautre biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/flocons-depeautre-biologique) | Québec product-directory listing for La Milanaise gives the French product name, says the flakes come from spelt grain rolled flat, and lists a 500 g format and Québec retail channels. The search result was crawled the prior month; direct page retrieval returned a cache miss. This supports local product wording but is not a universal processing specification. |
| S03 | [La Milanaise — Flocons d’épeautre biologiques](https://lamilanaise.com/produits/flocons-epeautre-biologique/) | Manufacturer’s French product page lists 500 g and uses, gives product-specific 2-parts-water/1-part-flakes and 12–15-minute directions, and says the product contains wheat/gluten. The instructions and allergen statement are product-specific; neither supports a density or generic conversion. The manufacturer identifies its address in Saint-Jean-sur-Richelieu, Québec. |
| S04 | [La Boîte à Grains — Flocons d’épeautre biologiques, La Milanaise](https://laboiteagrains.com/products/flocons-depeautre-biologiques-milanaise) | Québec retailer page calls the product *flocons d’épeautre* in the description, states that it comes from spelt grain rolled flat, lists 500 g and `Flocons de blé d’épeautre biologiques` as ingredients, and marks the listing out of stock when retrieved. It supports Québec-market wording and product identity, not current availability or a household measure. |
| S05 | [La Milanaise — Organic products, English](https://lamilanaise.com/en/organic-products/) | Manufacturer’s English catalog lists `Organic Spelt Flakes` separately from spelt berries, flour, bran, and barley, rye, oat, Khorasan, and multigrain flakes. Its product list is an English name source; the organic qualification belongs to the listed SKU. |

## Decision

**Integrated `spelt flakes / flocons d’épeautre` as the identity-only `GRAIN_AND_CEREAL` reference** `ingredient-ref-spelt-flakes`. The local product evidence names and describes a specific preprocessed grain type, and the base bilingual cereal name is supported by OQLF. The recommendation does not depend on recipe demand: the package audit found none.

The French product phrase is Québec product-attested, while OQLF standardizes only the base noun. The 500 g package size, cooking directions, and oat-alternative suggestion are product-specific. The integrated row has no aliases, forms, density, unit mappings, conversions, package yields, recipe links, or substitutions. It remains distinct from spelt flour, puffed spelt, einkorn / *petit épeautre*, and other cereal flakes. Verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).

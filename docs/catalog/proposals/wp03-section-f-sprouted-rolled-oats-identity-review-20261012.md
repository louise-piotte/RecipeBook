# WP03 Section F — sprouted rolled oats identity review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12. The identity and source record are in the active reference catalog and research ledger; see the [integration README](../batches/wp03-section-f-sprouted-rolled-oats-identity-integration-20261012/README.md). No forms, numeric behavior, recipe links, yields, conversions, or substitutions were added.
- **Scope:** Plain food-grade oat flakes made from sprouted oat kernels and processed as standard rolled/old-fashioned flakes.
- **Open checklist:** Section F remains open for grains, processed cereals, and Québec terminology coverage ([plan, line 8799](../../RecipeBook-global-ingredient-catalog-plan.txt#L9080)); the broader preprocessed-grain review remains open at [line 10315](../../RecipeBook-global-ingredient-catalog-plan.txt#L10596).
- **Decision:** Add one identity-only `GRAIN_AND_CEREAL` reference, **`sprouted rolled oats / flocons d’avoine germés`**, as `ingredient-ref-sprouted-rolled-oats`. Add no aliases, forms, measurements, recipe links, yields, conversions, or substitutions.
- **Candidate freshness:** No active reference, form, ledger record, legacy candidate, prior proposal, or integration note owns this candidate name or ID. Existing oat terminology work covers quick and instant oats. The held puffed-oats candidate concerns expanded oat kernels and does not cover sprouted flakes. Sprouted brown rice and spelt berries are separate, previously reviewed products.

## Identity boundary

The candidate is a dry, plain oat-flake product made by sprouting oat kernels before processing them into standard rolled flakes. One Degree Organics identifies `Sprouted Rolled Oats` as its product and distinguishes that style from sprouted quick oats and sprouted steel-cut oats. Its description of processing is evidence for that manufacturer’s product, not a universal sprouting or manufacturing standard.

The active `rolled oats / flocons d’avoine` reference represents the unqualified flake product. The proposed identity keeps the documented sprouted product searchable as a distinct product class without broadening the existing rolled-oats aliases. It does not imply that all sprouted oats are rolled, or that sprouted rolled oats are interchangeable with quick oats, steel-cut oats, instant oatmeal, puffed oats, granola, or composite cereals.

## Proposed identity and limits

| Field | Recommendation | Evidence and limit |
|---|---|---|
| Stable ID | `ingredient-ref-sprouted-rolled-oats` | Absent from active references, forms, ledger record IDs, and legacy candidates. |
| English display | `sprouted rolled oats` | Exact product wording from the manufacturer and the Canadian retailer’s English product name. Do not use bare `sprouted oats` as an alias; it does not identify the flake size/style. |
| Québec French display | `flocons d’avoine germés` | The Canadian French listing for the exact Sprouted Rolled Oats product uses this wording in its product name and ingredient declaration. OQLF supports `flocon d’avoine` as the Québec term for a flattened oat grain and discourages the calque `avoine roulée`. This product wording is not an OQLF ruling on the full compound. |
| Aliases | None | The current sources support the proposed displays. No broader regional or orthographic alias is needed for this identity-only proposal. |
| Category | `GRAIN_AND_CEREAL` | The product is a plain processed oat grain, not a formulated breakfast cereal or prepared oatmeal. |
| Forms and numeric data | None; `defaultDensity: null`, `unitMappings: []` | The Canadian retail page’s package size is SKU-specific and is not a household measure. The recipe corpus has no matching line. |

Keep this identity limited to plain sprouted oats processed into the standard larger rolled flake style. Exclude sprouted quick oats, sprouted steel-cut oats, sprouted instant oatmeal, sprouted oat flour, puffed oat kernels, flavored products, and multigrain mixes. Do not attach this wording as an alias or form to `ingredient-ref-rolled-oats`, `ingredient-ref-quick-oats`, or `ingredient-ref-steel-cut-oats`.

The manufacturer discusses uses in recipes written for ordinary rolled oats. That is manufacturer-specific usage guidance, not a tested app-wide substitution rule. Add no global or contextual substitution. Do not carry over the manufacturer’s nutrition, digestion, gluten-free, or other product claims into the catalog identity.

## Current package and ownership audit

The candidate phrase set was checked with the repository’s `normalize_search_key` function, which folds case and accents, normalizes Unicode, and converts punctuation to spaces. Exact normalized ownership was searched across all active reference fields and aliases, all form labels and match terms, the full research ledger including record IDs and sources, and the full legacy-candidate file.

| Candidate key checked | Exact owner |
|---|---|
| `sprouted rolled oats`; `sprouted rolled oat`; `sprouted oats`; `sprouted oat`; `germinated oats`; `germinated oat`; `sprouted oat flakes` | None |
| `flocons d’avoine germés`; `flocon d’avoine germé`; `flocons d’avoine germée`; `flocons d’avoine biologiques germés` | None |
| `ingredient-ref-sprouted-rolled-oats` | None |

At review time the live package had 1,305 references, 98 forms, 114 manifest-listed recipes, 1,613 ledger records, 8 shared unit conversions, and 64 legacy-import candidates. The active oat references are oat bran, oat flour, oat groats, oat beverage, rolled oats, quick oats, instant oats, steel-cut oats, and Scottish oatmeal. The only active oat forms are dry and cooked oat bran; no sprouted, rolled-oat, quick-oat, or steel-cut-oat form is present.

The ledger has no matching sprouted-oat record or candidate ID. Its separate `candidate-puffed-oats` record and review concern puffed whole kernels, not sprouted rolled flakes. The prior Québec oat terminology review covers quick and instant flakes and does not review sprouted rolled oats. The sprouted-brown-rice review does not allocate this oat identity.

## Recipe and ingredient-row audit

Every path in the live seed manifest and every structured ingredient row in those recipe files was scanned for the candidate English and French phrases, sprouted/germinated oat variants, and candidate ID.

| Corpus | Recipe files | Ingredient rows | Candidate hits |
|---|---:|---:|---:|
| Bundled manifest recipes | 114 | 1,123 | 0 files; 0 rows |

The only four current oat rows are:

| Recipe row | Existing ingredient | Current wording |
|---|---|---|
| `001#1` | `ingredient-ref-rolled-oats` | `1/2 cup old-fashioned rolled oats` |
| `024#6` | `ingredient-ref-quick-oats` | `175 g quick oats` |
| `047#4` | `ingredient-ref-quick-oats` | `1 1/2 cups quick oats` |
| `065#1` | `ingredient-ref-rolled-oats` | `1 part rolled oats` |

None requests sprouted oats. No recipe relink, source-text correction, quantity, or preparation form is indicated by current bundle demand.

## Source register

These sources were accessed on 2026-10-12 and are recorded under the same source IDs in the shared research ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-SROATS-20261012-S01` | One Degree Organics, [Organic Sprouted Rolled Oats](https://onedegreeorganics.com/products/organic-sprouted-rolled-oats-us/). | Manufacturer product page names `Organic Sprouted Rolled Oats` and describes the product as sprouted oats. Supports the English identity and product existence. Manufacturer claims about nutrition or digestibility are excluded from this review. |
| `WP03-SROATS-20261012-S02` | One Degree Organics, [Sprouted Oats FAQs](https://onedegreeorganics.com/sprouted-oats-faqs/), sections on rolled versus quick and steel-cut oats and product processing. | Distinguishes sprouted rolled oats from sprouted quick and steel-cut products by final shape/particle size and describes the maker’s process. It is one manufacturer’s process, not an industry standard. Its recipe-use suggestions do not establish an app-wide substitution. |
| `WP03-SROATS-20261012-S03` | Well.ca, [One Degree Organics Sprouted Rolled Oats](https://well.ca/fr/produits/flocons-davoine-germs-one-degree-organics_183909.html), French product title and ingredient declaration. | The English product label identifies `Sprouted Rolled Oats`; the French product name and ingredient statement use `Flocons d’avoine germés`. This Canadian retailer source supports product-specific Québec-facing wording. Its 1.28 kg package is not a volume-to-mass conversion. |
| `WP03-SROATS-20261012-S04` | Office québécois de la langue française, [flocon d’avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497597/flocon-davoine). | Gives `flocon d’avoine` as the preferred Québec term for `rolled oat` and defines the flake as a whole or partial oat grain steamed and flattened. It discourages `avoine roulée`; it does not define a sprouted-oat product class. |

## Decision

Accept `sprouted rolled oats / flocons d’avoine germés` as a distinct, identity-only Section F reference. Preserve the boundary from ordinary rolled oats and from the manufacturer’s sprouted quick and steel-cut products. Add no aliases, form, measure, density, unit mapping, recipe link, yield, conversion, or substitution. Section F and its broader processed-grain review remain open.

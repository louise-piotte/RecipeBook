# WP04 Section P — clam product-state boundary review (round 70)

- **Review and source access date:** 2026-10-13.
- **Cluster:** Clover Leaf Clam Juice and Clover Leaf Whole Yellow Baby Clams in Water, two distinct clam products currently listed by Québec retailers.
- **Decision:** Hold both outside active references and forms. Keep the generic `ingredient-ref-clam` candidate unresolved. Make no aliases, measures, forms, recipe links, conversions, densities, yields, or substitutions.
- **Status:** Proposal reviewed and integrated; root integration is recorded below. The proposal author edited only this review file. No app tests or emulator checks were run because this documentation-only hold changes no database data.

## Recommendation

These are separate product identities within the open Section P preservation and packing review: strained clam liquid and whole canned clams packed in water. Current Québec listings provide exact bilingual wording, product codes, and package quantities for both. The product pages do not create recipe demand in the bundled library, and either row would become the only result for broad clam-related picker queries while the generic clam identity remains unresolved. Hold each separately; do not turn either SKU into a generic clam identity or attach a form to the unresolved candidate.

The live plan still has an open checklist item for smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented fish or seafood forms. Its generic clam / palourde boundary has already been reviewed and held. This packet addresses two specific commercial products under the still-open product-state item; it does not reopen or resolve the generic clam decision. See the [existing generic-clam review](wp04-section-p-clam-quebec-market-boundary-review-20261012.md), its [integration note](../batches/wp04-section-p-clam-hold-integration-20261012/README.md), and the [preserved-fish product-state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md).

## Separate product dispositions

| Candidate product | Product evidence and Québec wording | Disposition |
|---|---|---|
| **Clam Juice / jus de palourde** | Clover Leaf describes it as liquid strained from freshly cooked, shucked clams, with water and clam extract in the ingredient declaration. Its French product page uses `Le jus de palourde`; Metro Québec lists the same bilingual product as 236 mL, item 061362442204. The manufacturer assigns the clam source to *Arctica islandica*. [S01–S04] | **Hold.** Product scope is legible, but adding `clam juice / jus de palourde` would make `clam` and `palourde` return this specialized liquid as a singleton. No bundled recipe requests clam juice. Do not alias it to clam broth, clam stock, fish stock, fumet de poisson, or a generic clam identity. |
| **Whole Yellow Baby Clams in Water / petites palourdes jaunes entières dans l’eau** | Clover Leaf describes canned whole yellow baby clams packed in water and lists *Paphia undulata*. Metro Québec lists the same product in English and French, at 142 g, item 061362442006, with ingredients clams, water, salt, citric acid, and calcium disodium EDTA. The French title is current retail wording for this product, not a species-specific OQLF term. [S06–S09] | **Hold.** A row named for the SKU would make `clam` and `palourde` return this canned product alone when considered separately. No bundled recipe requests canned baby clams. Do not assign it to the unresolved generic clam reference, or treat it as fresh clam meat, drained clam solids by package weight, clam juice, or clam broth. |

For the first product, the English Clover Leaf page spells the binomial `Arcitca islandica`; its French page spells it *Arctica islandica*. OQLF and CFIA identify *Arctica islandica* as ocean quahog / `quahog nordique`. OQLF notes that `palourde de mer` was not retained by Québec’s fish-product terminology committee. The exact French retail name `jus de palourde` is useful evidence for this specific product, but it does not justify using `palourde` as a broad clam alias or equating the product label with the preferred species name. [S01, S03–S05]

For the canned product, CFIA’s 2026 aquatic-animal update changes the taxonomic name *Paphia undulata* to *Paratapes undulatus*. CFIA’s susceptible-species page supplies the English common name `undulated surf clam` for aquatic animal health and explicitly says that list does not replace the Fish List used for food labelling. The reviewed sources establish the current retailer French phrase for this product, but no species-specific Québec food-label name. Keep the retailer’s wording product-scoped; do not promote bare `palourde(s)` or `clam(s)` as a universal identity. [S06–S08]

## Ownership, archive, and picker projection

The package snapshot has **1,390 active ingredient references**, **100 forms**, **63 legacy candidates**, and **1,723 research-ledger records**. Exact normalized phrase checks covered names and aliases in active references; labels and match terms in forms; names and aliases in legacy candidates; and ledger record IDs and source text.

| Exact query family | Active reference / form / legacy owner | Ledger and archive state |
|---|---|---|
| `clam juice`, `jus de palourde`, `clam extract`, `clam broth`, `clam stock` | None. | No dedicated product record. |
| `whole baby clams`, `whole baby clams in water`, `baby clams`, `petites palourdes`, `petites palourdes jaunes entières dans l’eau` | None. | No dedicated product record. |
| `clam`, `clams`, `palourde`, `palourdes`, `quahog nordique` | None in active references, forms, or legacy candidates. | The only related ledger candidate is the existing `ingredient-ref-clam`, `recordType: candidate`, `identityState: needs_clarification`; its decision remains unresolved pending a product or recipe target. No product-specific candidate ID or decision exists. |

Archive searches found the focused generic clam / palourde review and species-specific clam holds, but no earlier review of either product name or SKU. The generic packet addresses species and universal naming boundaries; it did not decide these exact product states. The current preserved-fish packet holds universal product-state forms without recipe or product need; the round-69 cod-liver review is a separate fish-organ product decision. No duplicate product-specific hold was found in proposal or batch archives.

The projection below applies the current `IngredientReferenceSearchIndex` behavior: normalized complete word-phrase matches are returned first; substring matching is used only when no complete phrase matches. Each candidate is simulated with only the stated bilingual display and no aliases. Current reference results and the projections were checked against the seed catalog and forms.

| Query | Current results | If **clam juice** alone were activated | If **whole baby clams** alone were activated |
|---|---:|---:|---:|
| `clam` | 0 | 1 result: clam juice (complete phrase) | 1 result: whole baby clams (substring fallback) |
| `clams` / `baby clams` | 0 / 0 | 0 / 0 | 1 / 1 result: whole baby clams |
| `clam juice` / `jus de palourde` | 0 / 0 | 1 / 1 result: clam juice | 0 / 0 |
| `whole baby clams` / `petites palourdes` | 0 / 0 | 0 / 0 | 1 / 1 result: whole baby clams |
| `palourde` / `palourdes` | 0 / 0 | 1 / 0 result: clam juice / no result | 1 / 1 result: whole baby clams |
| `juice` / `jus` | 12 / 11 | 13 / 12 | 12 / 11 |
| `clam broth` / `clam stock` | 0 / 0 | 0 / 0 | 0 / 0 |
| `fish stock` / `fumet de poisson` | 1 / 1 (`ingredient-ref-fish-stock`) | unchanged | unchanged |

If both products were activated, the singular queries `clam` and `palourde` would still return only clam juice because its complete word phrase wins before substring fallback; the plural queries `clams` and `palourdes` would return only whole baby clams. That is a product-state split hidden behind singular/plural query behavior, not a safe generic clam choice. Do not add `clam`, `clams`, `palourde`, `palourdes`, `broth`, `stock`, `quahog`, or species terms as aliases to either product.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for exact product names, bilingual terms, and broader clam/species terms, including `clam juice`, `jus de palourde`, `clam extract`, `clam broth`, `clam stock`, `whole baby clams`, `petites palourdes`, `clam`, `palourde`, `mye`, `quahog`, and the relevant binomials. There were **no recipe-file or ingredient-row matches**. A catchall line such as “cooked meat or seafood” does not select either clam product. Do not add a recipe link or relink a generic seafood row.

## Measures, density, conversions, and substitutions

**Clam juice:** Clover Leaf reports a nutrition serving of **1 tbsp (15 mL)**. Health Canada’s current Table of Reference Amounts lists **15 mL / 1 tbsp** for major condiments including clam juice. The latter is a nutrition-labelling reference amount and declared-serving framework, not a cooking-conversion rule. Metro’s **236 mL** package listing is net product volume. None of these sources gives product mass, density, a mass-to-volume conversion, or a recipe-specific clam-juice measure. Do not infer grams from millilitres or reuse a density from water, broth, or another juice. [S01–S04, S11]

**Whole baby clams:** Clover Leaf’s French product nutrition panel declares **¼ cup drained (55 g)**. This is a product-specific drained serving observation; it does not establish density or a proportional cup-to-gram mapping for other quantities. Metro’s **142 g** is package quantity. The manufacturer’s Clam Cakes recipe says to drain **one can (142 g)**, reserve its liquid, and add **2 tbsp** of that liquid. It does not say that the drained clams weigh 142 g, state the drained yield, or provide a general package-to-solid conversion. Do not calculate drained mass from net package mass or apply 55 g per ¼ cup to other clam species or canned products. [S06–S09]

The bundled seed’s global and contextual substitution-rule files are empty, and no reviewed source establishes an equivalence or substitution between these products, each other, generic clam flesh, clam broth/stock, fish stock, or another seafood. The manufacturer’s use of clam juice in cocktails and its recipe use of reserved can liquid are preparation examples, not global substitution rules. Add no form, default density, unit mapping, conversion, yield, or substitution for either product.

## Sources and limits

All pages were accessed on 2026-10-13 unless the source itself reports an earlier update or a search snapshot date.

| Source | Evidence used | Limit |
|---|---|---|
| **S01. Clover Leaf**, [Clam Juice (English)](https://www.cloverleaf.ca/en/products/clam-juice/) and [Le jus de palourde (French)](https://www.cloverleaf.ca/fr/produits/le-jus-de-palourde/). | Manufacturer description, liquid preparation, listed species, ingredients, and 1 tbsp (15 mL) nutrition portion. The French page spells *Arctica islandica* correctly. | Manufacturer product description and nutrition panel, not an independent laboratory measurement or a gram-density source. The English page has a binomial spelling typo. |
| **S02. Metro**, [Clover Leaf Clam Juice (English)](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/fish-seafood/clam-juice/p/061362442204) and [Jus de palourde (French)](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/jus-de-palourde/p/061362442204). | Current Québec product wording, matching item 061362442204, 236 mL package size, and ingredients. | Retailer listing; price and availability change, and it is not a full package-panel inspection. |
| **S03. OQLF**, [GDT: quahog nordique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198880/quahog-nordique) (updated 2012). | Québec preferred name `quahog nordique` for *Arctica islandica*; `ocean quahog`; note that `palourde de mer` was not retained by the fish-product terminology committee. | Species terminology, not the current product’s market title or product availability. |
| **S04. CFIA**, [Fish List lookup results for *Arctica islandica*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). | The Fish List pairs the binomial with English `Ocean Quahog` / `Ocean Clam` and French `Quahog Nordique` for `Black Quahog`. | Common-name list; it does not identify a species from a package beyond the manufacturer’s own sourcing statement. |
| **S05. OQLF**, [GDT: mye](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198878/mye) (updated 2012). | Notes that broad `clam`, `coque`, `palourde`, and `quahog` were not retained for Québec fish-product marketing, in order to avoid consumer-label confusion. | The entry is for *Mya arenaria* and does not decide the label for these two products. |
| **S06. Clover Leaf**, [Whole Baby Clams (English)](https://www.cloverleaf.ca/en/products/whole-baby-clams/) and [Petites palourdes Clover Leaf (French)](https://www.cloverleaf.ca/fr/produits/petites-palourdes-clover-leaf/). | Canned, water-packed product description; manufacturer’s species *Paphia undulata*; ingredient statement; French serving **¼ cup drained (55 g)**. | Manufacturer terminology and serving information; no drained yield, density, or species-specific Québec common name. |
| **S07. Metro**, [Whole Yellow Baby Clams in Water (English)](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/fish-seafood/whole-yellow-baby-clams-in-water/p/061362442006) and [Petites palourdes jaunes entières dans l’eau (French)](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/petites-palourdes-jaunes-entieres-dans-l-eau/p/061362442006). | Current Québec bilingual title, item 061362442006, 142 g package, and product ingredient declaration. | Retailer product copy; not a species determination or a drained-weight statement. |
| **S08. CFIA**, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species) and [16 January 2026 taxonomic update](https://inspection.canada.ca/en/animal-health/aquatic-animals/notices-industry/upcoming-changes-species-susceptible-perkinsus-marinus-dermo-and-perkinsus-olseni). | Lists *Paratapes undulatus* (formerly *Paphia undulata*) as `undulated surf clam`; records the 2026 taxonomic change. | CFIA explicitly says this animal-health list does not replace the Fish List for food labelling; it does not establish a Québec French food name. |
| **S09. Clover Leaf**, [Clam Cakes](https://www.cloverleaf.ca/en/recipes/clam-cakes/). | Recipe uses one can (142 g) drained, reserves liquid, and adds 2 tbsp reserved liquid. | A single manufacturer recipe; it does not state drained mass or establish a general conversion. |
| **S10. Health Canada**, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), row R.5; published 2024-10-18. | Lists clam juice among major condiments, with reference amount 15 mL and household measure 1 tbsp. | Regulatory nutrition-labelling framework; not a recipe standard, density, or mass conversion. |

**Final disposition:** Hold both product candidates; keep the generic clam candidate unresolved and the Section P product-state work open. Revisit either only when a bundled recipe or explicit product request establishes the desired product and amount. At that point, keep product-specific French wording scoped, rerun picker projection, and add only direct product-specific measurement data. No tests or emulator checks are needed for this proposal-only documentation work.

## Integration outcome (2026-10-13)

Root accepted separate holds on both specific products. No active reference, form, alias, measure,
ledger candidate, or source record was added; the existing `ingredient-ref-clam` candidate remains
unresolved. The decision preserves the product-specific portion and package limits from this review
without applying them to generic clams. See the
[integration README](../batches/wp04-section-p-clam-product-state-hold-integration-20261013/README.md).

This documentation-only hold changes no database JSON and needs no app tests or emulator checks.

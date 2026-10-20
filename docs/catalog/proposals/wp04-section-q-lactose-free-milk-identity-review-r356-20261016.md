# WP04 Section Q review: lactose-free milk identity — R356 — 2026-10-16

- **Status:** Integrated in the bundled catalog on 2026-10-16.
- **Plan anchor:** The open Section Q milk line includes lactose-free milk alongside milk species, fat classes, evaporated/condensed milk, and species-specific powders.
- **Recommendation:** Add one identity-only product reference, `lactose-free milk / lait sans lactose`, in `DAIRY_AND_ALTERNATIVE`. Do not model it as a form of the active whole-milk reference: Canadian guidance says adding lactase to standardized milk requires a modified common name, while current products include several fat classes. Do not add aliases, forms, measures, recipe links, density, conversions, or substitutions.
- **Candidate ID:** `ingredient-ref-lactose-free-milk`.

## Why this is the next open, non-overlapping item

The Section Q milk checklist remains open for lactose-free products. The R353 whole-goat-milk-powder form is now present in the live form file; this review does not reopen it. The live catalog has `ingredient-ref-milk` (`milk / lait`, with only `whole milk / lait entier` aliases) and the separate `ingredient-ref-skim-milk` (`skim milk / lait écrémé`). There is no lactose-free reference, form, or legacy-import candidate. The catalog and ledger search found no existing lactose-free-milk decision or dedicated source record. This review does not touch the R351 dried-whole-egg item or any other egg work.

The milk identity history deliberately removed `lait 2%` from the standard-milk aliases and left 2% milk unresolved. Preserve that decision here: this candidate is defined by the lactose-free product name, not by a fat percentage. Existing active references and forms remain as they are.

## Product identity, not a form of whole milk

The current CFIA dairy-labeling guidance states that lactase is not permitted as an addition to standardized milk. If it is added, the common name must be modified to describe the deviation, with **lactose-free milk** and **lactose-reduced milk** given as separate examples. CFIA’s lactose-claim guidance further distinguishes “lactose-free” (no detectable lactose using an acceptable analytical method) from “lactose-reduced” (a reduction of at least 25%). These names are not interchangeable aliases.

That product boundary supports a separate reference instead of a `lactose-free` form under `ingredient-ref-milk`. The active milk reference also carries whole-milk wording, and a form there would make a 2% or skim lactose-free product appear to be whole milk. The live catalog has no partly-skimmed-milk reference or cross-product fat-class facet. A separate lactose-free product reference can accept the exact standardized common-name phrase without assigning the product to the whole or skim class.

The proposed identity is the human-food product class named **lactose-free milk**. It does not mean plant beverage, lactose-reduced milk, lactose-free cream or cultured dairy, or any non-cow milk. CFIA says unqualified milk refers to cow’s milk; other animal-source dairy must name its source. Keep species-qualified lactose-free milks out of this generic cow-milk candidate unless a later source and picker review scopes them explicitly. The identity records a product name, not a medical or allergy claim; it must not be described as dairy-free or milk-protein-free.

## Supported names and exact claim boundary

| Candidate field or phrase | Evidence and disposition |
| --- | --- |
| English display: `lactose-free milk` | Exact Canadian common-name example in CFIA’s current dairy guidance; also the current Lactantia English product-family wording. |
| Québec French display: `lait sans lactose` | Exact French common-name example in CFIA’s current French dairy guidance and the title of Lactantia’s French product page. The French Plaisirs laitiers product listing also gives the qualified name `Lait partiellement écrémé sans lactose 2% M.G.` |
| Aliases | None. The display names themselves cover the exact bilingual terms. Search normalization already treats a hyphen as punctuation, so `lactose free milk` is covered by the English display. Do not add `lactose-reduced milk`, `milk without lactose`, `lactose-free 2% milk`, `2% milk`, `lait réduit en lactose`, or `lait 2%` as aliases. |
| Form | None. The named dairy product already has its own modified common name; do not create a form under whole milk or skim milk. |
| French terminology note | The GDT entry `sans lactose` pairs that phrase with English `lactose-free`, authored by Santé en français inc. (Manitoba, 2025). Use it as phrase-level support only, not as an OQLF definition of lactose-free milk. The current Québec-facing Lactantia product page directly attests the complete French product name. |

### Product and fat-class evidence

Lactantia’s current English 2% page names **Lactose Free 2% Milk** and lists the ingredients as partly skimmed milk, lactase, vitamin A palmitate, and vitamin D3. Its French counterpart is titled **Lait sans lactose 2 %** and lists the same ingredient structure in French. The French page exposes 0%, 1%, 2%, and 3.25% fat-content options. The English product page shows 1%, 2%, and 3.25% options and links to a separate skim product. The French Plaisirs laitiers listing calls the 2% SKU **Lait partiellement écrémé sans lactose 2% M.G.**

This supports a generic lactose-free milk product class, not one universal fat composition. OQLF distinguishes `lait partiellement écrémé / partly skimmed milk` from `lait écrémé / skim milk`; its 1% entry defines 1% milk as partly skimmed. Preserve a recipe’s explicit fat percentage in its source text if one is encountered later. Do not add 0%, 1%, 2%, 3.25%, “partly skimmed,” or “skim” aliases to this generic row, and do not treat this row as a resolver for the open 2% milk distinction.

The French Lactantia page’s listed 2% SKU is a product-specific example, not a catalog-wide formula: its ingredients include a partly-skimmed base, lactase, and vitamins. Lactantia also labels the product as containing milk, so it remains dairy and is not dairy-free or milk-protein-free. Do not infer that all brands use the same process, fortification, or exact ingredient list. The manufacturer’s statement that this product provides the same nutrients as regular milk does not establish a kitchen conversion or recipe substitution.

## Current ownership and catalog overlap

| Current item | Ownership or collision | Proposed handling |
| --- | --- | --- |
| `ingredient-ref-milk` (`milk / lait`; aliases `whole milk / lait entier`) | Represents standard whole cow milk in the current Canadian naming context; a lactase-treated product cannot retain the unmodified standardized common name when it deviates from that standard. | Leave its display, aliases, forms, measurements, and links unchanged. Do not attach a lactose-free form. |
| `ingredient-ref-skim-milk` (`skim milk / lait écrémé`) | Separate fat-class identity; no lactose-free reference or form currently exists under it. | Leave unchanged. Do not make an unspecified lactose-free product a skim-milk alias. |
| `ingredient-form-whole-goat-milk-powder` / `ingredient-ref-goat-milk` | R353 is integrated as a whole-qualified goat-milk powder presentation; it is an unrelated species and physical form. | Leave unchanged; do not widen the candidate to goat milk. |
| `ingredient-ref-evaporated-milk`, `ingredient-ref-sweetened-condensed-milk` | Existing concentrated products with distinct Canadian/French product names and recipe usage. | Keep separate; lactose-free milk is neither identity’s alias or form. |
| Legacy candidates and active forms | No lactose-free-milk entry was found. | Add no legacy promotion or existing-form edit. |

The terminology packets and current R283/R353 work are source context, not competing allocations. No exact active key, form, or source-ledger record owns the proposed generic product name.

## Picker effects

`IngredientReferenceSearchIndex` prefers complete word phrases, indexes a form’s terms under its parent row, and then falls back to partial matches. The counts below were projected from the live references and forms with the proposed bilingual identity added; no alias or form is needed.

| Query | Current | With candidate | Interpretation |
| --- | --- | --- | --- |
| `lactose-free milk` / `lactose free milk` | No result | One result: `lactose-free milk / lait sans lactose` | Exact English product name; hyphen folding comes from the existing search normalizer. |
| `lait sans lactose` / `sans lactose` | No result | One result: `lactose-free milk / lait sans lactose` | Exact French display or phrase within it. |
| `lactose-reduced milk` / `lait réduit en lactose` | No result | No result | Remains distinct from the no-detectable-lactose claim. |
| `milk` | 10 results | 11 results | Adds one labeled candidate to the existing phrase-first family search. |
| `lait` | 12 results | 13 results | Adds one labeled candidate to the existing French family search. |
| `2% milk` / `lait 2%` | No result | No result | Keeps the prior fat-class boundary and the exact percentage unresolved. |
| `whole milk` | `ingredient-ref-milk` | `ingredient-ref-milk` | The candidate has no whole-milk alias or term. |
| `skim milk` | `ingredient-ref-skim-milk` | `ingredient-ref-skim-milk` | The candidate has no skim-milk alias or term. |
| `milk powder` | 3 results, including the separate cow and goat powder matches | 3 results, unchanged | The lactose-free product has no powder wording. |
| `poudre de lait` | 2 results | 2 results, unchanged | The French whole-goat-powder display uses a different word order; this candidate adds no powder term. |

This adds one result to the broad `milk` and `lait` searches because the full candidate labels contain those words. It does not add any generic alias or alter the existing milk-family results beyond that labeled row. Search does not automatically attach an ingredient identity to a recipe line.

## Recipe demand, measures, and substitutions

The current manifest lists **114 recipes and 1,123 ingredient rows**. All ingredient rows were scanned for `lactose-free`, `lactose free`, `lactose-reduced`, `lactose reduced`, `lait sans lactose`, and `lait réduit en lactose`; the scan found zero matches. No recipe link or quantity depends on this candidate.

Lactantia lists 1 L, 1.5 L, 2 L, and 4 L formats for a reviewed product family, and the Québec Plaisirs laitiers listing gives a 2 L package/UPC for one 2% SKU. These are product-specific package facts. Add no density, unit mapping, kitchen measure, reusable package-size record, recipe link, conversion, yield, or substitution. In particular, same-source or same-nutrient marketing language does not establish a universal 1:1 recipe substitution, and no milk-to-lactose-free-milk rule is proposed.

## Source ownership and integration notes

Exact source URLs were checked against `docs/catalog/research-ledger.v1.json`:

- CFIA’s English dairy-labeling page already appears under several dairy records, including `ingredient-ref-goat-milk` (`WP04-GOAT-MILK-IDENTITY-20261016-S04`) for the default cow-milk meaning and non-cow source declaration. Integration added a scoped source record on the new identity with a locator covering both **Common names for dairy products with lactase** and the cow-milk/source boundary.
- CFIA’s English composition-and-quality page is already referenced by `ingredient-ref-light-corn-syrup` (`WP02-C-LCS-20261011-S03`) for unrelated light-claim guidance. Integration added new scoped English and French source records for the **Lactose-free and lactose-reduced claims** section.
- Integration added the GDT `sans lactose` entry and current Lactantia English/French product pages with precise locators. The `lait`, `lait partiellement écrémé`, and `lait à 1 %` entries and Plaisirs laitiers listing were not needed for the accepted identity; manufacturer formulations remain product-specific.
- Suggested source IDs, if integrated: `WP04-LACTOSE-FREE-MILK-R356-20261016-S01` through `S11`, in the order listed below.

Integration added one identity-only reference with the two supported display names and empty alias arrays. It did not update `ingredient-ref-milk`, `ingredient-ref-skim-milk`, goat-milk powder, recipe rows, forms, numeric data, or substitution rules. Section Q remains open for fat classes, lactose-reduced products, other milk species/forms, and the remaining dairy checklist.

## Sources

- [CFIA, Labelling requirements for dairy products (English)](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy), Common names for dairy products with lactase; states the modified standardized common name examples **lactose-free milk** and **lactose-reduced milk** when lactase is added to milk.
- [CFIA, Exigences en matière d’étiquetage des produits laitiers (French)](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/produits-laitiers), Noms usuels des produits laitiers additionnés de lactase; gives **lait sans lactose** and **lait réduit en lactose**.
- [CFIA, Food composition and quality claims (English)](https://inspection.canada.ca/en/food-labels/labelling/industry/composition-and-quality), Lactose-free and lactose-reduced claims; CFIA’s guidelines define the claim thresholds and distinguish these claims.
- [CFIA, Allégations relatives à la composition et à la qualité des aliments (French)](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/composition-qualite), allégations « sans lactose » ou « teneur réduite en lactose ».
- [OQLF GDT, sans lactose](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26580421/sans-lactose), French phrase and English translation; the entry identifies Santé en français inc. (Manitoba, 2025) as author.
- [OQLF GDT, lait](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2093335/lait), current Québec French/English milk term and general animal-source note.
- [OQLF GDT, lait partiellement écrémé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298763/lait-partiellement-ecreme), partly-skimmed milk class terminology.
- [OQLF GDT, lait à 1 %](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8370065/lait-a-1), defines 1% milk as partly skimmed milk and lists Québec French/English forms.
- [Lactantia, Lactose Free 2% Milk](https://lactantia.ca/food_product/lactantia-lactose-free-2-milk/), current English product name, 2% product ingredients, available fat variants, and package options.
- [Lactantia, Lait sans lactose 2 %](https://lactantia.ca/fr/food_product/lait-lactantia-sans-lactose-2/), current French product name, ingredient list, displayed fat variants, and package options.
- [Les Producteurs laitiers du Canada, Plaisirs laitiers: Lait partiellement écrémé sans lactose 2% M.G.](https://producteurslaitiersducanada.ca/fr/plaisirs-laitiers/repertoire-de-la-vache-bleue/lactantia-lait-partiellement-ecreme-sans-lactose-2-mg-2l), Québec-facing French SKU name and product-specific 2 L / UPC information.

## Integration record

- Added one `DAIRY_AND_ALTERNATIVE` identity, `ingredient-ref-lactose-free-milk`, displayed as `lactose-free milk / lait sans lactose`, with no aliases, forms, density, or unit mappings.
- Recorded a verified identity entry in the research ledger with bilingual CFIA labeling guidance, claim-boundary evidence, terminology support, and current manufacturer examples. The product-specific 2% ingredient list is not applied to the generic identity.
- Kept lactose-reduced milk, standard milk fat classes, other animal species, plant beverages, and dairy-free products separate. No recipe link or numeric behavior was added.
- Added the completed review under the Section Q milk checklist. Static package, generated-index, ledger, picker, corpus, encoding, and whitespace checks are recorded in [the integration README](../batches/wp04-section-q-lactose-free-milk-identity-integration-r356-20261016/README.md). No software tests were run because this change only adds database JSON data under `AGENTS.md`.

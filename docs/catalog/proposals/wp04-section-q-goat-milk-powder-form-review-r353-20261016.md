# WP04 Section Q review: whole goat milk powder form — R353 — 2026-10-16

- **Status:** Integrated; see the [R353 integration README](../batches/wp04-section-q-goat-milk-powder-form-integration-r353-20261016/README.md).
- **Plan anchor:** The open Section Q milk line calls out “species-specific powder coverage beyond the integrated whole- and skim-milk powder forms.”
- **Recommendation:** Add one whole goat milk powder form under the active `ingredient-ref-goat-milk`. Keep the broader goat-milk-powder wording unresolved because Canadian rules also name skimmed and partly skimmed goat milk powder. Add no generic powder alias, density, kitchen measure, conversion, recipe link, yield, or substitution.
- **Candidate form ID:** `ingredient-form-whole-goat-milk-powder`.

## Why this is an open, non-overlapping candidate

Section Q remains open after the cow whole- and skim-milk powder forms. Its goat-milk child item, R283, added identity-only `goat milk / lait de chèvre` with the English alias `goat's milk`; that proposal explicitly left milk powder outside its scope. No later goat-powder proposal, integration, hold, active reference, active form, or legacy candidate was found. R286 sheep milk, R289 water buffalo milk, R348 century egg, and R351 whole egg powder do not allocate goat powder.

At the proposal snapshot, the active package contained 1,690 ingredient references and 132 forms. It had `ingredient-ref-goat-milk` (`goat milk / lait de chèvre`) but no goat-milk powder reference or form. Nearby precedents are the whole-milk powder form under `ingredient-ref-milk`, the skim-milk powder form under `ingredient-ref-skim-milk`, and separate buttermilk- and whey-powder identities. The whole/skim forms preserve an explicit fat class and leave unqualified `milk powder` without an exact form match.

This proposal treats whole goat milk powder as a dried form of goat milk because the product evidence describes drying whole goat milk itself. It remains separate from the fluid base as a form; it does not turn powder wording into an alias for the fluid ingredient. It does not create powder coverage for sheep, water buffalo, or other animal milks.

## Identity and form boundary

The current parent identity was scoped to fluid goat milk in R283. A powder form is a narrow extension of the same animal-source ingredient through dehydration, not a new base ingredient. This is consistent with the live whole-milk powder form. A separate powder identity would duplicate the goat-milk reference for a simple physical state and would not improve picker disambiguation.

The Canadian Food and Drug Regulations (FDR) distinguish goat milk powder from skimmed and partly skimmed goat milk powder in their vitamin provisions. This means a bare powder label does not guarantee a whole-fat class. The proposed form therefore covers only product explicitly identified as **whole** goat milk powder. Do not add `goat milk powder`, `powdered goat milk`, `dried goat milk`, `lait de chèvre en poudre`, or `poudre de lait de chèvre` as exact form terms. Keep unqualified powder wording unresolved until a source or recipe specifies its intended fat class.

Keep goat milk powder separate from fluid goat milk, goat-milk yogurt, kefir, cheese, butter, evaporated or condensed goat milk, goat-milk protein concentrates, infant formula, pet food or supplements, and cosmetic ingredients. Vitamin-enriched whole powder can remain within this form when its label identifies whole goat milk powder; do not imply every product is single-ingredient or has the same fortification.

## Evidence and exact wording

| Claim | Evidence | Boundary |
| --- | --- | --- |
| Canada recognizes goat milk powder as a named product. | The current [FDR, B.08.029](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.08.029.html) names “goat’s milk powder” in its vitamin-D provision and separately names skimmed and partly skimmed goat milk powder in subsection (2). The current French FDR page uses **lait de chèvre en poudre**, **lait de chèvre partiellement écrémé en poudre**, and **lait de chèvre écrémé en poudre**. | These vitamin-fortification provisions establish product names and fat-class distinctions; they do not define a general powder composition or reconstitution formula. The ready-to-serve 100 mL basis is not a powder-to-water quantity. |
| Whole goat milk powder is an attested Canadian product name. | Canadian producer Canada Royal Milk’s [CAPRISS page](https://www.capriss.ca/WholeGoatMilkPowder) is titled **Whole Goat Milk Powder** and describes it as vitamin-D enriched. Its [brand page](https://www.canadaroyalmilk.com/our-brands) independently calls CAPRISS “whole goat milk powder.” | Product-specific evidence; it does not establish a universal goat-milk-fat threshold, recipe use, or nutrient profile. |
| A plain product is made by drying whole goat milk. | Canadian producer Happy Days’ [human-food product page](https://happydaysdairy.ca/goat-milk-powder-for-humans/) says the powder is made from farm-fresh whole goat milk, pasteurized and spray-dried, with no additives and “100% goat milk.” | This is that producer’s human-food product claim, not a rule for all goat milk powders. Its product page and instructions are brand-specific. |
| The Québec-facing French product wording is usable. | The French human-food shop page is titled **Lait de chèvre en poudre en vrac** and uses **lait de chèvre en poudre** / **poudre de lait de chèvre** in its description. A French [CAPRISS listing](https://supportontariomade.ca/fr/explore-products/capriss-whole-goat-milk-powder) uses the explicitly qualified title **Lait de chèvre entier en poudre**. | The first phrase is unqualified and must not be attached as an exact alias to the proposed whole-only form. The CAPRISS French listing supports the qualified name, but is a product listing rather than a Québec standard. |
| Québec French terminology supports the whole-powder pattern. | OQLF’s GDT entries for [lait de chèvre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2073045/lait-de-chevre) and [lait entier en poudre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9473357/lait-entier-en-poudre) support the species name and whole-powder terminology. The latter gives **lait entier en poudre** and **poudre de lait entier**, and the English equivalents `whole milk powder`, `powdered whole milk`, and `dried whole milk`. | OQLF does not have a goat-specific whole-powder entry. The exact displayed French compound **lait de chèvre entier en poudre** is directly attested by the CAPRISS French product listing; other species-qualified variants are derived wording, not independent OQLF entries. |
| Québec recognizes goat-milk powder as a dairy-product category. | The [Régie des marchés agricoles et alimentaires du Québec caprine dairy reporting form](https://cdn-contenu.quebec.ca/cdn-contenu/adm/org/rmaaq/publications-adm/formulaires/entreprises-laitieres/FO_Rapport-produits-laitiers-caprins_RMAAQ.pdf) lists **Poudre de lait** as a manufactured caprine dairy product and as an inventory category. | The form is marked `MOD. 02-2004`. It confirms a Québec category, not current production volume, a retail common name, or a product formula. |

CFIA’s current [dairy labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy) says unqualified “milk” normally refers to cow’s milk, dairy products from other animals must identify the animal source, and CFCS Sections 7.1.1–7.1.20 do not apply to non-cow milk. Do **not** transfer the cow whole-milk-powder standard’s 95% milk-solids or 26% milk-fat figures to goat powder. The CFIA Grade Compendium’s cow-powder grading values also do not establish a goat-powder composition.

The shop marks the French Happy Days product as the **Humain** category. This is the human-food product used for the food identity decision. Similar goat-milk powders marketed for pets, animal feed, soap, or cosmetics are out of scope.

## Proposed form

| Field | Proposed value |
| --- | --- |
| Form ID | `ingredient-form-whole-goat-milk-powder` |
| Parent reference | `ingredient-ref-goat-milk` |
| Form code / prep state | `powdered` / `powdered` |
| English label | `whole goat milk powder` |
| Québec French label | `lait de chèvre entier en poudre` |
| English match terms | `powdered whole goat milk`; `dried whole goat milk` |
| French match terms | None; keep the French search phrase to the directly attested label. |
| Density | `null` |

The English match terms follow OQLF’s listed equivalents for **whole milk powder** with the animal qualifier that Canadian dairy labelling requires for non-cow products. The French display is directly product-attested. No alternate French match term is added because the proposed reordered construction is not directly attested. Do not add the unqualified terms in the preceding section as aliases or match terms.

Do not create or imply separate goat whole-milk-fat percentages. Do not create goat skim or partly skimmed forms from this record; the FDR shows those classes exist, but their independent catalog treatment requires its own exact identity and naming review. Do not imply milk powder from sheep, water buffalo, or another animal is covered.

## Picker behavior and collision analysis

`IngredientReferenceSearchIndex` indexes form labels and match terms alongside their parent row. It returns a form hint only when the complete normalized query exactly equals a form search term; shorter contiguous phrases may still return the row without the form hint. The picker filters visible results and does not automatically attach a form or recipe reference.

| Query | Current active result | With proposed form | Interpretation |
| --- | --- | --- | --- |
| `whole goat milk powder` / `powdered whole goat milk` | none | goat milk row with whole-powder form hint | Exact qualified match. |
| `lait de chèvre entier en poudre` | none | goat milk row with whole-powder form hint | Exact qualified French label. |
| `goat milk powder` | none | goat milk row, no form hint | The phrase occurs inside the qualified English label; do not add it as an exact synonym or infer a fat class. |
| `poudre de lait de chèvre entier` / `poudre de lait de chèvre` | none | none | The reordered phrases are not in the directly attested French label and are intentionally omitted. |
| `lait de chèvre en poudre` | none | none | This word order is not a contiguous phrase in the qualified label. Keep it unassigned to avoid resolving an unqualified product name to whole powder. |
| `milk powder` | milk and skim milk rows, no form hints | goat milk, milk, and skim milk rows, no form hints | Adds a third species/class candidate to an already ambiguous generic search; do not add `milk powder` as a term. |
| `poudre de lait` | milk and skim milk rows, no form hints | milk and skim milk rows, no form hints | No reordered French alias is added to the goat-milk form. |
| `goat milk` / `lait de chèvre` | goat milk row | unchanged | The base ingredient remains searchable. |
| `goat` / `chèvre` | goat meat and goat milk rows | unchanged | A form adds no result row and does not add the standalone animal terms. |
| `powdered goat milk` / `dried goat milk` | none | none | No exact or contiguous match to the whole-qualified terms. |

The exact labels add no second identity row. The broad English `milk powder` result becomes more crowded because both cow classes and goat whole powder can match as phrases. The French `poudre de lait` result remains limited to the existing cow classes because the constructed goat term is omitted. Keep whole qualifiers on the form and leave broad searches without a form hint.

## Recipe demand, amounts, and substitutions

The current bundled package has **114 manifest-listed recipes and 1,123 ingredient rows**. All ingredient rows were scanned for goat-milk powder and dried-goat-milk wording in English and French, and for goat milk / lait de chèvre more generally. There are zero matching rows. Do not relink a recipe or infer culinary equivalence from the product pages.

Happy Days’ English product page gives **4 Tbsp powder + 1 cup warm water** and says **1 kg makes 8 L**. Its French human-food page for the 10 kg product gives **3 c. à soupe powder + 1 cup water** and also says **1 kg makes 8 L**. The spoon quantity conflicts between the English and French pages, and each set of directions belongs to this producer’s product. Keep both as source-specific observations only; do not encode either in the catalog, a general conversion, or a substitute rule. The 1 kg-to-8 L statement is also product-specific and is not a mass-per-volume density.

CAPRISS describes a 640 g enriched product and provides no comparable reconstitution direction on the reviewed product page. Happy Days lists 400 g, 1 kg, and 10 kg formats; these package sizes are source-specific. The FDR’s vitamin table uses 100 mL of ready-to-serve product but does not specify a recipe powder amount or kitchen reconstitution ratio.

Add no density, `g/ml` value, unit mapping, cup or spoon mass, package size, liquid-milk conversion, household measure, yield, recipe link, or substitution. In particular, do not transfer the goat directions to cow, sheep, or water-buffalo powders, and do not assume a powdered product can replace liquid goat milk in a recipe without a recipe-specific water and method analysis.

## Source ownership and integration notes

The source URLs were checked against `docs/catalog/research-ledger.v1.json`:

- CFIA dairy labelling guidance is already owned by `ingredient-ref-goat-milk` as `WP04-GOAT-MILK-IDENTITY-20261016-S04` (and by other dairy records). Reuse that owner for the cow-default / non-cow boundary; do not duplicate the generic source.
- OQLF’s goat-milk entry is already owned by `ingredient-ref-goat-milk` as `WP04-GOAT-MILK-IDENTITY-20261016-S01`.
- OQLF’s whole-milk-powder entry is already owned by `ingredient-form-whole-milk-powder` as `WP04-DAIRY-POWDERS-CONCENTRATES-20261010-S07`. Its term entry supports the general whole-powder wording, not goat-product composition.
- CFIA’s Canadian Food Compositional Standards URL is already owned by `ingredient-ref-milk` as `WP04-S20`, with a locator for Sections 7.1.1–7.1.3. If an integrator wants to retain the cow powder figures below as contrast, add a scoped source locator for Section 7.1.10; the same page’s standard does not apply to goat milk under the CFIA guidance above.
- The CFIA dairy Grade Compendium is already owned by the integrated whole- and skim-powder forms as `WP04-DAIRY-POWDERS-CONCENTRATES-20261010-S04`. The integration is recorded in `docs/catalog/batches/wp02-wp03-wp04-dairy-broth-sweetener-leafy-greens-integration-20261010/README.md`. Do not reuse its cow-only numeric grading statements for goat powder.
- No exact current ledger owner was found for FDR B.08.029, the CAPRISS manufacturer page, the French CAPRISS listing, the Happy Days human product pages, or the RMAAQ form. If integrated, add scoped ledger sources for those claims; retain page-specific locators and do not copy package or reconstitution numbers into generic conversion data.

Integration adds only the one qualified whole-goat-powder form and its sourced ledger record. The parent goat reference’s existing base names and aliases, active recipe links, conversion mappings, and substitutions remain unchanged. The broader Section Q milk and species-powder checklist remains open.

## Integration notes

- Added `ingredient-form-whole-goat-milk-powder` under `ingredient-ref-goat-milk` as `whole goat milk powder / lait de chèvre entier en poudre`. Kept the English alternatives `powdered whole goat milk` and `dried whole goat milk`; added no reordered French match term.
- Kept unqualified goat-milk-powder phrases without an exact form term. Search can still return the parent goat-milk row for contiguous partial phrases such as `goat milk powder`; this does not assign a whole-powder hint.
- The ledger reuses the existing goat-milk OQLF and CFIA records and adds sources for the FDR wording, CAPRISS, Happy Days, the Ontario Made French listing, and the Québec RMAAQ reporting category. Happy Days’ source notes preserve the conflicting tablespoon instructions and matching 1 kg-to-8 L statements; no general conversion or active yield was added.
- Measurement research is `researched_no_supported_value`; no density or kitchen measure is active. No recipe demand, recipe link, or substitution rule was added. The current package has 1,691 references, 134 forms, and 2,042 ledger records. Static package, ledger/schema/source, picker projection, corpus, encoding, local-link, and whitespace checks are recorded in the batch README. No software tests were run because this change only adds database JSON data under `AGENTS.md`.

## Sources

- [Justice Canada, Food and Drug Regulations, B.08.029 (English)](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.08.029.html), goat milk powder and skimmed / partly skimmed goat-powder wording.
- [Justice Canada, Règlement sur les aliments et drogues, page 21 (French)](https://laws-lois.justice.gc.ca/fra/reglements/c.r.c.,_ch._870/page-21.html), B.08.028.1–B.08.029; animal-source labelling and French product terms.
- [CFIA, Labelling requirements for dairy products](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy), common-name and non-cow species rules.
- [CFIA, Canadian Food Compositional Standards, Volume 7](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §§7.1.1 and 7.1.10; cow-milk default and whole-milk-powder composition, not applicable to goat milk under the CFIA guidance above.
- [OQLF, GDT: lait de chèvre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2073045/lait-de-chevre), species-specific French base term.
- [OQLF, GDT: lait entier en poudre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9473357/lait-entier-en-poudre), whole-powder terms in French and English.
- [Canada Royal Milk / CAPRISS, Whole Goat Milk Powder](https://www.capriss.ca/WholeGoatMilkPowder), current Canadian product name and vitamin-D enrichment.
- [Canada Royal Milk, Our Brands](https://www.canadaroyalmilk.com/our-brands), CAPRISS whole-goat-powder corroboration.
- [Happy Days Dairy, Powdered Goat Milk for Humans](https://happydaysdairy.ca/goat-milk-powder-for-humans/), human-food product, source milk, spray-drying process, package formats, and English preparation directions.
- [Happy Days Dairy, Lait de chèvre en poudre en vrac](https://shop.happydaysdairy.ca/fr-ca/produit/goat-milk-powder-bulk-fr-ca/), French human-food product name and product-specific directions.
- [Ontario Made, CAPRISS Lait de chèvre entier en poudre](https://supportontariomade.ca/fr/explore-products/capriss-whole-goat-milk-powder), French qualified product title and Canadian product listing.
- [RMAAQ, Transformation et mise en marché des produits laitiers – Caprins](https://cdn-contenu.quebec.ca/cdn-contenu/adm/org/rmaaq/publications-adm/formulaires/entreprises-laitieres/FO_Rapport-produits-laitiers-caprins_RMAAQ.pdf), form marked MOD. 02-2004, reporting / inventory category `Poudre de lait`.

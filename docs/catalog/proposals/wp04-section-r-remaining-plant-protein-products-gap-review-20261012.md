# WP04 Section R proposal: Remaining plant-protein product boundaries

**Review date:** 2026-10-12  
**Status:** Proposal only; no catalog or workflow files changed.  
**Scope:** Natto, soy curls, mycoprotein, textured soy protein/PST, and formulated plant-based mince and sausage products. Tempeh, tofu, seitan, and generic textured vegetable protein are checked only to avoid duplicating prior decisions.

## Recommendation summary

- Consider identity-only `natto / natto` and `mycoprotein / mycoprotéine` candidates under `PROTEIN`, each without aliases. The sources support the product identities and bilingual names, but the bundled recipes contain no corresponding ingredient lines.
- Keep soy-specific textured protein / PST on the existing hold. Preserve its OQLF-defined distinction from the integrated generic TVP identity; do not add PST/TSP terms to the TVP aliases.
- Hold a generic `soy curls` identity. Butler’s `Soy Curls™` is a documented named product listed by a Canadian retailer, but the reviewed evidence does not establish a Québec French generic name or a cross-product equivalence with TVP/PST.
- Do not create one global plant-based mince or plant-based sausage identity. Canadian guidance and current manufacturer pages show that formulation, common name, and product representation vary. If an exact future recipe names a product, review that label and recipe line directly.
- No exact bundled recipe lines support new links, forms, quantities, conversions, yields, or substitutions for these candidates. Recipe 095’s tempeh variation remains the previously reviewed note and has no tempeh ingredient line or amount.

## Repository audit

The active bundled package currently contains **1,121 ingredient references, 79 forms, 114 manifest-listed recipe files, and 1,123 ingredient rows**. The legacy identity file contains 71 candidates. Exact term scans of current references, forms, and legacy entries found no entries for natto, soy curls/Protein Curls, mycoprotein, textured soy protein/PST, or plant-based mince/sausage. The recipe scan below used the manifest-listed corpus.

| Neighboring active reference | Current display and relevant aliases | Boundary preserved |
|---|---|---|
| `ingredient-ref-tempeh` | tempeh / tempeh; no aliases | Existing fermented soy product; do not duplicate. |
| `ingredient-ref-seitan` | seitan / seitan; EN alias `wheat meat` | Existing cooked wheat-gluten food; not vital wheat gluten or a formulated meat analogue. |
| `ingredient-ref-textured-vegetable-protein` | textured vegetable protein / protéine végétale texturée; EN aliases `TVP`, `texturized vegetable protein`, `texturised vegetable protein`; FR alias `PVT` | Existing generic TVP identity. The prior review keeps soy-specific PST separate. |
| `ingredient-ref-tofu`, `ingredient-ref-pressed-tofu`, `ingredient-ref-silken-tofu`, `ingredient-ref-smoked-tofu`, `ingredient-ref-tofu-skin` | Previously integrated tofu family | No new tofu work proposed here. |
| `ingredient-ref-white-fermented-bean-curd`, `ingredient-ref-red-fermented-bean-curd` | White fermented bean curd / tofu blanc fermenté; red fermented bean curd / tofu fermenté rouge | Keep these existing colour-qualified curds separate from natto and from unqualified fermented curd. |

The matching scan found no target records among the current 79 forms and no target phrase in the 71 legacy candidates. No candidate ID is assigned for products held in this proposal.

## Prior proposal and batch audit

- [WP04 seitan and TVP boundary review](wp04-plant-protein-seitan-tvp-boundary-review-20261011.md) and its [residual identity integration batch](../batches/wp02-wp03-wp04-residual-identities-integration-20261011/README.md) integrated seitan and generic TVP, kept TVP distinct from soy-specific PST, and left PST, soy curls, mycoprotein, natto, and formulated meat alternatives open for their own evidence and recipe-demand review.
- [WP04 tofu product boundary review](wp04-section-r-tofu-product-boundaries-review-20261012.md) and its [integration batch](../batches/wp04-tofu-product-boundaries-integration-20261012/README.md) cover the tofu family and preserve the separate white/red fermented-curd identities. This proposal does not reopen them.
- The earlier [protein/dairy identity inventory](../batches/protein-dairy-identities.md) lists PST and mycoprotein as terminology candidates and cautions against treating brand-shaped alternatives as generic meat aliases. Its seed-state summary predates the above integrations, so the current package audit here controls.
- The WP05 [East Asian fermented-product review](wp05-east-asian-fermented-sesame-identity-resolution-20261010.md) lists natto separately from douchi and fermented bean curd as product classes; it did not add a natto catalog identity.
- Exact target-term scans of the WP06 [East Asian cuisine gap sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md) and [Southeast Asian cuisine gap sweep](wp06-southeast-asia-cuisine-gap-sweep-20261011.md) found no matching focused product decision to duplicate.

The active plan still leaves the broader Section R plant-protein line open. Its checked tofu child records the tofu integration, and its checked seitan/TVP child records that integration. Tempeh is already an active catalog identity and is covered by earlier WP04 material. This document covers only the remaining product questions named in its scope.

## Recipe-demand scan

Across all **114 manifest-listed recipe documents and 1,123 ingredient rows**, the scan found no target-name matches for natto, soy curls, Protein Curls, mycoprotein, textured soy protein/PST, plant-based mince, plant-based sausage, or common veggie-mince/sausage wording. It also found no exact ingredient line for any of the candidates below; therefore there are no recipe IDs or ingredient rows to link.

The nearby results are not evidence for plant-based products:

- Recipe 095, *Satay*, has an English/French tempeh variation in its notes, but no tempeh ingredient row or amount. That existing tempeh note is already covered by the earlier WP04 review.
- Recipe 027 has an unqualified `breakfast sausage` row with no plant-based qualifier. Recipes 034, 074, and 078 identify ground beef (recipe 078 also permits ground lamb). None identifies a meat alternative.
- Recipe 102’s “Chocolate Sausage” is a dessert title, not a sausage ingredient.

These unrelated rows and notes remain untouched; no substitution from them is inferred.

## Findings and proposed boundaries

| Candidate | Evidence-supported identity/name boundary | Proposal and alias limit | Exact recipe link |
|---|---|---|---|
| **Natto** | Health Canada’s Canadian Nutrient File pairs `Soybean, fermented products, natto` with `Soya, produits fermentés, natto`. A Montréal maker’s French page calls its product `natto` and describes it as fermented soy food. These sources support the same headword in English and Québec French and distinguish it from plain tofu. [S01–S02] | **Candidate:** `natto / natto`, category `PROTEIN`, no aliases. Keep it distinct from tempeh, white/red fermented bean curd, douchi, fresh tofu, and generic TVP. Do not add broad aliases such as `fermented soybeans`, `fermented tofu`, or `bean curd`. The local maker’s strain, freshness, ingredient source, and package are product-specific. | None. |
| **Mycoprotein** | OQLF’s 2025 GDT entry gives French `mycoprotéine` and English `mycoprotein`, defining a fermented edible-mycelium food product. It notes different fungal strains and sale as patties, sausages, or strips. [S03] | **Candidate:** `mycoprotein / mycoprotéine`, category `PROTEIN`, no aliases. Keep the underlying mycelium-derived protein identity separate from mushroom fruiting bodies, soy/other plant proteins, and finished shaped products. Do not add `Quorn` or a finished-product form as a global alias. The source does not support a common recipe conversion or substitution. | None. |
| **Textured soy protein / PST** | OQLF gives `protéine de soya texturée`, `PST`, and `protéine de soja texturée`, with English `textured soy protein`, `TSP`, and spelling variants. Its entry defines a soy-specific subtype of textured vegetable protein. [S04–S05] | **Retain prior hold; no new row or aliases here.** Continue to keep PST/TSP out of `ingredient-ref-textured-vegetable-protein` aliases. The terminology boundary is well supported, but no exact recipe line or product-specific need appears in the live corpus. No rehydration behavior or equivalence is inferred. | None. |
| **Soy curls** | Butler’s official page names `Soy Curls™` and describes that product as whole-soybean protein strips. A current Canadian retailer lists the same product. Butler’s product/FAQ describes its own process; OQLF’s generic TVP entry describes extrusion, so those sources do not support treating this named product as a generic TVP synonym. [S05–S06] | **Hold a generic identity.** The evidence supports the Butler product name, not a generic Québec French product name or an alias mapping to PST/TVP. If a future recipe calls for the branded product, review its package text and recipe demand then. Do not generalize the manufacturer’s preparation amounts or time to other products. | None. |
| **Plant-based mince and sausage products** | CFIA’s current English/French guidance distinguishes simulated meat products from other plant-composed foods by product composition, appearance, and how labels/advertising represent them. It says some products may contain milk or eggs and gives accurate non-simulated descriptions such as `saucisse de soya` / soy sausage. Current Beyond Canada product pages use manufacturer-specific descriptions: `plant-based ground meat` / `viande hachée à base de plantes` for Beyond Beef, and a named Beyond Sausage product with flavor variants. [S07–S09] | **Do not create one catch-all identity or attach these terms to TVP, PST, seitan, mycoprotein, soy curls, or natto.** These sources show product and regulatory descriptions, not one standardized formulation or universal recipe substitute. Keep product names, common names, brand, and variant tied to a future exact ingredient line and its package label. Do not infer vegan status from `plant-based`. | None. |

## Unresolved cases and limits

1. **Natto:** `natto` is supported as a bilingual food name, but no corpus line determines whether RecipeBook should represent fresh natto, frozen retail natto, a natto-type soy seed, or another packaged presentation as a form. No form is proposed.
2. **Mycoprotein:** OQLF supports a root identity and several finished formats, but the corpus does not identify a strain, brand, product, or recipe format. No alias, form, or substitution is proposed.
3. **PST:** The language and soy-specific boundary are clear; there is no present recipe or product demand that justifies a separate row. The previous hold remains the only decision.
4. **Soy curls:** The reviewed product is Butler’s branded `Soy Curls™`; no source here establishes a Québec French generic label or equivalence to other curl-shaped soy products. No generic row or crosswalk is proposed.
5. **Formulated mince/sausage:** CFIA classification depends on each product’s composition, appearance, common name, and representation. Current manufacturer examples are not a complete market inventory or stable product formula. No global generic alias, brand crosswalk, vegan claim, or meat-substitution rule is established.
6. **Recipe behavior:** No new candidate has an exact bundled ingredient line. No amount, density, package size, form, conversion, hydration ratio, yield, cooking instruction, or substitution can be transferred from these sources to the recipe corpus.

## Source register

Sources were accessed on **2026-10-12**. The source IDs are local to this proposal and are not shared research-ledger entries. Descriptions are paraphrased.

| Source ID | Source | Supports and limits |
|---|---|---|
| **WP04-R-PLANT-PRODUCT-20261012-S01** | Health Canada, [Canadian Nutrient File: Soybean, fermented products, natto / Soya, produits fermentés, natto](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3320). | Supplies a bilingual Canadian product name and fermented-soy class. This review uses the names only; it does not reuse the page’s serving measures or nutrition values. |
| **WP04-R-PLANT-PRODUCT-20261012-S02** | Natto Mtl, [Natto artisanal et biologique fabriqué à Montréal](https://nattomtl.com/). | Montréal maker’s French product name and description of natto as fermented soy food. Its local ingredient, strain, freshness, and packaging details are not generalized. |
| **WP04-R-PLANT-PRODUCT-20261012-S03** | OQLF, [mycoprotéine, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26578857/mycoproteine). | Updated 2025; supports French `mycoprotéine`, English `mycoprotein`, fungal-mycelium product identity, variable strains, and marketed finished formats. Does not establish a specific recipe substitute or formula. |
| **WP04-R-PLANT-PRODUCT-20261012-S04** | OQLF, [protéine de soya texturée, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26560132/proteine-de-soya-texturee). | Updated 2025; supports bilingual PST/TSP names and the soy-specific boundary. It does not establish recipe demand or ingredient-line equivalence. |
| **WP04-R-PLANT-PRODUCT-20261012-S05** | OQLF, [protéine végétale texturée, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086121/proteine-vegetale-texturee). | Supports the existing generic PVT/TVP identity and its distinct process/source scope. The prior WP04 proposal documents the accepted alias set. It does not support assigning every soy product to TVP. |
| **WP04-R-PLANT-PRODUCT-20261012-S06** | Butler Foods, [Soy Curls](https://www.butlerfoods.com/soycurls) and [Frequently Asked Questions](https://www.butlerfoods.com/frequently-asked-questions.html); Canadian retailer Ambrosia, [100% Natural Soy Curls](https://canada.ambrosia.ca/products/100-natural-soy-curls). | Manufacturer identifies a branded whole-soybean strip product and product-specific method; retailer demonstrates a Canadian listing. Preparation amounts and times are not reused. No Québec French generic term is established. |
| **WP04-R-PLANT-PRODUCT-20261012-S07** | CFIA, [Simulated meat and simulated poultry products (English)](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/simulated-products) and [Simili-produits de viande et simili-produits de volaille (French)](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/simili-produits). | Current bilingual guidance separates simulated products from other plant-composed foods using composition, appearance, and representation. It notes milk/egg may be present and supplies examples including `saucisse de soya`; the guidance classifies products and does not create ingredient synonyms. |
| **WP04-R-PLANT-PRODUCT-20261012-S08** | Beyond Meat Canada, [Beyond Beef (English)](https://www.beyondmeat.com/en-CA/products/beyond-beef/) and [Beyond Beef (French)](https://www.beyondmeat.com/fr-CA/products/beyond-beef/). | Manufacturer’s paired product pages use `plant-based ground meat` / `viande hachée à base de plantes` for this branded product. Formulation and claims remain SKU-specific and can change. This is not evidence for a generic product formula. |
| **WP04-R-PLANT-PRODUCT-20261012-S09** | Beyond Meat Canada, [Beyond Sausage (English)](https://www.beyondmeat.com/en-CA/products/beyond-sausage) and [Beyond Sausage (French)](https://www.beyondmeat.com/fr-CA/products/beyond-sausage). | Paired current product pages identify a named sausage line and flavour variants; product details are SKU-specific. They do not standardize all plant-based sausage products. |

This is a documentation-only proposal. No canonical JSON, recipe, seed package, checklist, roadmap, workflow, or shared integration document was edited; no tests or emulator checks were run.

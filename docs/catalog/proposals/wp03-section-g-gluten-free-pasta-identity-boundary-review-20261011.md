# WP03 Section G gluten-free pasta identity and boundary review

- **Reviewed:** 2026-10-11
- **Disposition:** Recommend an identity-only finished-product reference, **gluten-free pasta / pâtes sans gluten**, in GRAIN_AND_CEREAL. Keep it distinct from generic pasta, egg pasta, whole-wheat pasta, grain- or pulse-specific pasta products, named shapes, and fresh/dry states. Add no aliases, forms, measurements, recipe links, yields, conversions, or substitutions in this review.
- **Scope:** Review the open Section G item against the current bundle, normalized search ownership, ledger and legacy candidates, Canadian regulatory terminology, Québec-facing product naming, and current manufacturer and grocery listings. The product evidence supports a marketed pasta class, but does not define one recipe or ingredient formula.
- **Source IDs:** This proposal uses the locally preserved prefix WP03-GFPASTA-QC-20261011, suffixes S01–S08. The prefix was checked against docs/ and app/ before use. These are proposal-local references; the shared research ledger was not changed.

## Current snapshot

Snapshot checked on 2026-10-11:

| Artifact | Current count or result |
| --- | ---: |
| Active ingredient references | 973 |
| Active ingredient forms | 61 |
| Research-ledger records / source entries / distinct source IDs | 1,248 / 3,936 / 3,228 |
| Legacy import candidates | 75 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |
| Active unit definitions | 30 |
| Active direct / contextual substitution rules | 0 / 0 |
| Active package-yield rows | 1; the only row is for canned black beans, none for pasta |
| Active reference densities / non-empty unit mappings | 0 / 0 |

The current checklist remains open at Section G's review of dried/fresh wheat pasta, egg pasta, whole-wheat pasta, gluten-free pasta, shapes, and forms. Generic pasta is already ingredient-ref-pasta, displayed as pasta / pâtes alimentaires, with only pâte alimentaire as its French alias. Egg pasta is already ingredient-ref-egg-pasta, displayed as egg pasta / pâtes aux œufs, with pâtes alimentaires aux œufs as its French alias. Egg noodles remain a separate ingredient-ref-egg-noodles identity.

## Exact-key and recipe audit

All current ingredient displays and aliases were compared using the seed search-key normalization (case-fold, Unicode decomposition and accent removal, œ/oe folding, ampersand expansion to “and,” punctuation-to-space). The 61 forms, all 75 legacy candidates, all 1,248 ledger records, and every ingredient line in all 114 manifest-listed recipe files were also scanned.

| Checked key or neighbor | Exact normalized owner before this proposal |
| --- | --- |
| gluten-free pasta / gluten free pasta | None; hyphen and spacing normalize to one key |
| pâtes sans gluten | None |
| pâtes alimentaires sans gluten | None |
| gluten-free spaghetti, fusilli, penne, macaroni, or linguine | None |
| rice pasta, corn pasta, quinoa pasta, chickpea pasta, or lentil pasta | None |
| whole-wheat pasta / whole wheat pasta | None |
| pasta, pâtes alimentaires, pâte alimentaire | ingredient-ref-pasta |
| egg pasta | ingredient-ref-egg-pasta |
| egg noodles / nouilles aux œufs | ingredient-ref-egg-noodles |

No matching gluten-free pasta or whole-wheat pasta reference, alias, form, legacy candidate, or ledger record ID exists. No exact owner exists for either proposed display. The active references nearest to this boundary are:

| Live reference | Current display and boundary |
| --- | --- |
| ingredient-ref-pasta | pasta / pâtes alimentaires; French alias pâte alimentaire; GRAIN_AND_CEREAL. This is the broad finished pasta class. |
| ingredient-ref-egg-pasta | egg pasta / pâtes aux œufs; French alias pâtes alimentaires aux œufs; GRAIN_AND_CEREAL. Keep the composition-qualified identity separate. |
| ingredient-ref-egg-noodles | egg noodles / nouilles aux œufs; GRAIN_AND_CEREAL. Do not alias to either pasta row. |
| ingredient-ref-spaghetti, ingredient-ref-farfalle, ingredient-ref-fusilli, ingredient-ref-penne, ingredient-ref-macaroni, ingredient-ref-orzo | Shape-specific pasta references, all GRAIN_AND_CEREAL. A shape is independent of a gluten-free claim. |
| ingredient-ref-shirataki-noodles, ingredient-ref-sweet-potato-starch-noodles | Distinct finished noodle products. They do not establish aliases or formulas for gluten-free pasta. |
| ingredient-ref-rice-flour, ingredient-ref-white-rice-flour, ingredient-ref-brown-rice-flour, ingredient-ref-quinoa-flour, ingredient-ref-chickpea-flour, ingredient-ref-chickpeas | Ingredient-source references, not finished pasta products. Keep these distinct from gluten-free pasta. |
| ingredient-ref-vital-wheat-gluten, ingredient-ref-high-gluten-flour | Gluten-containing ingredient references; neither is a pasta identity or alias. |

The form scan found no form linked to a pasta, noodle, or gluten-free pasta reference and no form label or match term for pasta, noodles, or gluten-free pasta. No legacy candidate has an exact matching display or alias. The ledger has current records for generic pasta, egg pasta, and egg noodles, but no gluten-free pasta or whole-wheat pasta record. Its candidate-gluten-free-flour-blend-family entry remains unresolved and concerns flour blends, not a pasta product; do not reuse it as a pasta identity. The unresolved ingredient-ref-noodles ledger entry records only the unqualified noodle wording in a serving instruction.

All 1,123 manifest ingredient lines were searched for pasta and noodle identities, common shape terms, gluten-free wording, whole-wheat pasta, composition-qualified pasta, and current pasta/egg-pasta/egg-noodle reference IDs: **zero matching ingredient lines and zero recipe links**. Across full recipe text, recipe 015, Beef Stroganov / Bœuf Stroganov, says “rice or noodles” / “riz ou des nouilles” in its final serving instruction; this is not an ingredient line and does not identify a pasta type. Recipe 019, Crab Balls / Boulettes de crabe, mentions “whole wheat panko” in a note that explains normalization to panko bread crumbs; it is not whole-wheat pasta demand. No recipe was relinked.

## Product and identity boundary

The Canadian gluten-free wording is a regulated product claim, not a manufacturing process name or one fixed pasta formula. The Food and Drug Regulations prohibit representing a food as gluten-free if it contains the specified gluten proteins; CFIA explains that “gluten-free” is not interchangeable with “wheat-free” and that processing controls also matter. These sources define limits for the claim, not a prescribed gluten-free pasta recipe or a health guarantee for an app catalog entry. [S02–S03]

Canadian manufacturer pages market gluten-free pasta as a product line across familiar pasta shapes. Catelli's French catalog lists separate Grains, Légumineuses, and Sans Gluten product lines, each with product/shape listings; its gluten-free collection uses the exact wording “pâtes sans gluten.” Catelli describes its own white-rice, brown-rice, corn, and quinoa blend. Barilla Canada's gluten-free spaghetti is made from corn and rice. Catelli separately describes chickpea pasta and red-lentil pasta as gluten-free products; its chickpea spaghetti lists chickpea flour as the sole ingredient. These examples establish a usable market class across different formulations, not common composition or interchangeable behavior. [S04–S07]

The accessed Québec-facing Provigo French catalog lists Catelli gluten-free fusilli, penne, macaroni, linguine, and spaghetti as 340 g products. Its wording includes “Pâtes sans gluten.” That direct local retail phrase supports the proposed Québec French display; the page is dynamic and establishes only the retailer's displayed names and product availability at access, not a linguistic standard or product formula. [S08]

### Proposed identity-only row

| Field | Proposal |
| --- | --- |
| ID | ingredient-ref-gluten-free-pasta |
| English display | **gluten-free pasta** |
| Québec French display | **pâtes sans gluten** |
| English aliases | None. The unhyphenated spacing variant has the same normalized key as the display. |
| French aliases | None. The display is directly attested by the Canadian manufacturer and Québec grocery listing; no broader synonym is needed. |
| Category | GRAIN_AND_CEREAL, consistent with the catalog's finished pasta and pasta-shape references. This classification is for the finished pasta product; it does not assert that every eligible formula is cereal-based. |
| Identity scope | Finished pasta explicitly named or marketed as gluten-free. A raw flour or starch, a wheat-free claim, or a generic pasta line without a gluten-free product claim is not enough to assign this identity. |
| Aliases explicitly excluded | pasta / pâtes alimentaires; egg pasta / pâtes aux œufs; whole-wheat pasta; egg noodles / nouilles aux œufs; wheat-free pasta; generic noodles / nouilles; rice, corn, quinoa, chickpea, or lentil flour; named shapes or products such as gluten-free spaghetti. |
| Forms, numeric behavior, links | None proposed. |

“Gluten-free pasta” is a finished-product market class whose member products may have different grain or legume bases. It is not an ingredient form: gluten-free status is not a preparation state, and it is independent of fresh/dry and shape. The OQLF's broad pasta entry identifies fresh and dry pasta and variable shapes separately; the live catalog likewise holds spaghetti, fusilli, penne, and other shapes in separate rows. This proposal does not assert that all gluten-free pasta is dried, egg-free, grain-based, or made by one process. [S01, S04–S08]

Do not attach the new identity as an alias to generic pasta: that would erase a recipe's explicit product qualifier. Do not add grain-specific phrases as aliases: the sampled rice/corn/quinoa blend, corn/rice blend, and chickpea-only pasta are different source-specific products. A future recipe naming “chickpea pasta,” “rice pasta,” or a full product label should retain the specified product wording and be reviewed against its exact ingredients. The existing gluten-free flour-blend candidate stays separate; the active rice and chickpea flours remain raw ingredients. Whole-wheat pasta is also a separate composition description, not another name for gluten-free pasta. Egg composition can cross independently with other product properties; only an exact product with source evidence should be treated as both egg pasta and gluten-free pasta.

## Measurements and substitutions

No default density, household unit mapping, pasta form, dry-to-cooked yield, or package yield is supported. The live catalog currently has no non-null reference density or unit mapping, and its sole package-yield row is unrelated canned black beans. Current manufacturer pages provide only product-specific package and nutrition observations: Catelli lists a 340 g gluten-free product and a nutrition amount of about one quarter of the package (85 g); Barilla lists a 340 g spaghetti pack, a 56 g nutrition serving, and a 10-minute cooking time. Barilla's page also says “4 x servings,” which does not reconcile with four 56 g portions. Do not resolve that page-specific mismatch by inference or apply any of these observations to another product, shape, recipe quantity, or household measure. [S04, S07]

No direct or contextual pasta substitutions are active. The sources do not establish a universal weight or volume replacement, cooking yield, or shape- and sauce-independent interchange between generic pasta, gluten-free pasta, and grain- or pulse-specific pastas. Barilla's cooking recommendation applies to its own gluten-free spaghetti; it is not a global recipe substitution rule. Keep substitutions inactive until a bundled recipe and product-specific method support a directed, scoped rule.

## Source-to-claim map

All sources below were accessed on 2026-10-11. Retail inventory, price, and product formulas may change; each maker or retailer entry supports only the product or listing shown.

| Local source ID | Source and URL | Claim supported | Limit |
| --- | --- | --- | --- |
| WP03-GFPASTA-QC-20261011-S01 | Office québécois de la langue française, [pâte alimentaire (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870035/pate-alimentaire) | Defines broad pasta as a formed food from semolina or flour with water or eggs; notes variable shapes and fresh and dry pasta. Supports keeping shape and state separate from the gluten-free qualifier. | Last updated 2017; generic pasta entry, not a gluten-free term or gluten-free product definition. |
| WP03-GFPASTA-QC-20261011-S02 | Canadian Food Inspection Agency, [Allergen-free, gluten-free and cross-contamination statements](https://inspection.canada.ca/en/food-labels/labelling/industry/allergens-and-gluten) | A gluten-free representation must comply with the Food and Drug Regulations; CFIA distinguishes gluten-free from wheat-free and discusses cross-contamination and controls. | Regulatory claim guidance, not a pasta composition, market taxonomy, consumer medical recommendation, or endorsement of a particular product. |
| WP03-GFPASTA-QC-20261011-S03 | Government of Canada, [Food and Drug Regulations, B.24.018](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.24.018.html) | Prohibits representing a food as gluten-free when it contains specified gluten proteins; page states regulations current to 2026-09-21 and last amended 2026-06-17. | Legal claim restriction only. It does not prescribe pasta ingredients or make all gluten-free products one formula. |
| WP03-GFPASTA-QC-20261011-S04 | Catelli, [Gluten Free Spaghetti](https://www.catelli.ca/en/pastas/catelli-gluten-free-spaghetti/) | Manufacturer's Canadian gluten-free pasta product and category; its spaghetti uses white and brown rice, corn, and quinoa flour, with a 340 g pack and an approximately 85 g quarter-pack nutrition amount. | One maker's blend and label. Package and nutrition values are not a universal measure, density, or yield. |
| WP03-GFPASTA-QC-20261011-S05 | Catelli, [Pâtes product catalog](https://www.catelli.ca/fr/pasta/) and [Sans Gluten product collection](https://www.catelli.ca/fr/brands/catelli-gluten-free) | Direct Québec French manufacturer wording “pâtes sans gluten”; the French product catalog separates Grains, Légumineuses, and Sans Gluten lines and lists gluten-free spaghetti, linguine, macaroni, penne rigate, fusilli, and lasagne. | Catelli's brand and product-line terminology; not an OQLF-approved term record or a full industry taxonomy/formula for all brands. |
| WP03-GFPASTA-QC-20261011-S06 | Catelli, [Légumineuses / Legumes product collection](https://www.catelli.ca/fr/brands/catelli-legumes) and [Chickpea Spaghetti](https://www.catelli.ca/en/pastas/catelli-chickpea-spaghetti) | Catelli describes chickpea and red-lentil pasta products as gluten-free; its chickpea spaghetti product page identifies chickpea flour as its ingredient. Shows the gluten-free marketed class can include a pulse-based finished pasta. | Specific Catelli products and claims; does not mean every chickpea or lentil pasta is gluten-free or equivalent to the grain blends. |
| WP03-GFPASTA-QC-20261011-S07 | Barilla Canada, [Gluten Free Spaghetti](https://www.barilla.com/en-ca/products/pasta/gluten-free/gluten-free-spaghetti) | Canadian manufacturer product uses corn and rice; page labels gluten-free spaghetti, shows a 340 g pack, 56 g nutrition serving, 10-minute cooking time, and a gluten-free product family with multiple shapes. | One product and source-page data. Serving metadata is internally inconsistent with the “4 x servings” pack note; do not calculate a general serving or cooking rule. |
| WP03-GFPASTA-QC-20261011-S08 | Provigo, [Catelli French search listings](https://www.provigo.ca/fr/search?search-bar=catelli) | Québec-facing French grocery catalog displayed Catelli “Pâtes sans gluten” listings in fusilli, penne, macaroni, linguine, and spaghetti, each in a 340 g listing at access. | Dynamic retailer page and store-dependent inventory/pricing. Supports local displayed naming and variety only, not formula or a regulatory determination. |

## Recommendation and verification

Recommend integrating the identity-only row above. The regulated gluten-free label and current Canadian/Québec product evidence establish a stable finished-pasta class with bilingual market naming, despite its varying grain and pulse formulations. Preserve those formulations as separate ingredient identities if a later exact recipe asks for one; do not make gluten-free pasta an alias, form, automatic property, or substitution of generic pasta. The current bundle has no matching recipe demand, so add no recipe link.

The proposal file was checked as UTF-8 without BOM and with a final newline. A mojibake-marker scan found no damaged text. This review changed no catalog, ledger, plan, roadmap, test, or other proposal file; no tests were run for this proposal-only review.

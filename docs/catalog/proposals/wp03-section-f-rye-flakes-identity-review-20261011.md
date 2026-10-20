# WP03 Section F Preprocessed-Grain Identity Review — Rye Flakes

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Integrated on 2026-10-11 as an identity-only reference. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.
- **Checklist scope:** one candidate from Section F's open regional cereal-mix and preprocessed-grain review. This packet does not propose a generic cereal-mix identity or formula.
- **Recommendation:** accept an identity-only reference for the plain food product **rye flakes / flocons de seigle**. Keep both alias arrays empty, category GRAIN_AND_CEREAL, defaultDensity null, and unitMappings empty. Add no forms, measurements, conversions, yields, recipe links, or substitutions.
- **Snapshot inspected:** 902 active ingredient references, 48 forms, 1,155 research-ledger records plus 8 unit-conversion records, 77 legacy candidates, 114 manifest-listed recipes with 1,123 ingredient rows, 1 package-yield record, and no active global or contextual substitution rules.

## Identity decision and boundaries

| Candidate or wording | Disposition | Scope and limit |
| --- | --- | --- |
| rye flakes / flocons de seigle | **Accept for integration review** | A distinct, plain human-food rye product marketed and used as flakes. Québec producer and product records use the exact French phrase; the English phrase is also attested in Canadian product and food-surveillance sources. |
| Proposed reference ID | ingredient-ref-rye-flakes | New ID, absent from the live package, ledger, and legacy candidates at this review. |
| English aliases | None | The sourced English product name is already the display. Do not add flaked rye, rolled rye, rye groat flakes, rye kernels, organic rye flakes, or whole rye as global aliases. These are either unverified synonyms, process descriptions, product qualifiers, or names of neighboring products. |
| French aliases | None | The Québec-facing producer phrase is already the display. Do not add seigle en flocons, seigle aplati, flocons de seigle biologiques, or generic grains de seigle. The last phrase is the current rye-berries display. |
| Rye / seigle | Keep separate | The broad grain identity does not identify flakes. OQLF says seigle names both the plant and grain; it does not define a flaked product [S05]. |
| Rye berries / grains de seigle | Keep separate | The current identity is for intact food kernels and owns the English alias rye kernels. It is not the flaked product [S09]. |
| Rye meal / gruau de seigle and rye flour | Keep separate | These are milled products. The rye-meal evidence distinguishes meal, chops, flour, and flakes in one supplier's product family [S08]. |
| Brewing-supply rye flakes | Exclude from this row's scope | A Sherbrooke brewing supplier lists a product as Flocons de seigle, but the reviewed listing does not establish its composition or relation to plain food flakes. Do not infer a brewing adjunct, malted, toasted, or partially gelatinized product from the unqualified food name [S12]. |
| Rye breads, granola, bars, and multigrain cereal blends | Keep separate | These are composite foods that may list rye flakes as one ingredient. They do not turn the finished product into a rye-flakes identity or define a standard blend [S01–S03]. |

The proposed row, if approved, is:

| ID | English display | Québec French display | EN aliases | FR aliases | Category and numeric fields |
| --- | --- | --- | --- | --- | --- |
| ingredient-ref-rye-flakes | rye flakes | flocons de seigle | none | none | GRAIN_AND_CEREAL; density null; unit mappings empty |

The Québec producer Les Moissons Dorées describes its own flocons de seigle as whole rye grains steamed and flattened [S04]. A Canadian mill describes its rye flakes as whole kernels steamed, rolled, and dried [S07]. These are compatible product examples, not a universal processing specification for every product sold under the name. Do not attach whole-grain, organic, ready-to-eat, or cooking-time claims to the general identity.

The French display is supported by current Québec producer and product usage, not an OQLF ruling for the compound. OQLF's entry establishes seigle / rye and the base term's food-grain use; it was last updated in 2018 and belongs to a brewing vocabulary [S05]. Keep the compound display source-qualified and do not describe it as a preferred terminology-authority term.

## Live catalog and collision audit

The review searched all active reference IDs, English and French names and aliases, form IDs and labels, form match terms, the full ledger, legacy candidates, package yields, substitution files, unit-conversion records, and all manifest-listed recipe ingredient rows. Candidate phrase matching used the repository's case-folded, accent-folded, punctuation-normalized search key.

- No active reference name or alias has an exact normalized key for rye flakes, rye flake, flaked rye, rolled rye, flocons de seigle, flocon de seigle, flocons seigle, or seigle en flocons.
- No active form label or match term contains rye or seigle. There is no form record for the candidate.
- The proposed ID is absent from active references, forms, ledger record IDs, and legacy candidates. No rye-flakes candidate record exists in the ledger.
- The current live catalog has neighboring references for rye / seigle, rye berries / grains de seigle, rye flour / farine de seigle, rye meal / gruau de seigle, malted rye flour, and whole rye flour. These are exact product neighbors, not exact normalized collisions with the proposed flake phrase.
- Broad one-word searches for rye or seigle will reach those neighboring grain and flour references. The search index first matches a query as a normalized phrase within a name or alias and falls back to substring matches if no phrase match exists; the exact multiword candidate phrase currently has no matching row. This is a static corpus and search-code audit, not a live picker test.
- The ledger contains incidental rye-flake mentions in the barley-flakes product research and rye-meal source notes. Those records concern other identities and do not allocate or evaluate a rye-flakes reference. Existing proposals mention rye flakes as outside the rye-berries scope, as a separate product in rye-meal boundaries, or as an ingredient in a barley-flake granola example; none is a focused rye-flakes identity decision [S09–S11].
- The current plan still lists regionally significant cereal mixes and preprocessed grains as open. The prior barley-flakes packet addresses a different cereal product. It does not settle rye flakes or complete this open checklist line.

## Recipe demand and numeric data

All 114 manifest-listed recipe files and 1,123 ingredient rows were searched for the exact English and French candidate phrases and the broad words rye and seigle. There were **0 exact candidate hits and 0 broad rye/seigle ingredient-row hits**. No recipe link, recipe edit, or inferred use is recommended.

| Concern | Disposition |
| --- | --- |
| Forms | Add no dry, cooked, toasted, or other form. Flaking identifies the processed product; the reviewed sources do not establish a shared recipe-state model or a needed state conversion. |
| Density and household measures | Leave density null and unit mappings empty. Product package sizes and serving quantities are not transferable ingredient measures. |
| Conversions and cooking yield | Add no mass-volume, water, dry-to-cooked, or package-yield data. Product cooking instructions, where given, are SKU-specific and do not establish a general yield. |
| Substitutions | Add no rule for oats, barley flakes, rye berries, rye meal, or another grain. Product use in similar dishes does not supply a transferable ratio or method-specific limits. |
| Recipe links | Add none. The bundled recipe corpus has no rye or seigle ingredient-line demand. |

The CFIA report's rye survey included flakes among the sampled product types, but the survey was for ochratoxin surveillance and does not provide culinary measurements or conversions [S06]. No number from that survey is used as catalog data.

## Source register

Sources were reviewed on 2026-10-11. Dates and scope limits are recorded where available.

| Source ID | Source and locator | Supports / does not support |
| --- | --- | --- |
| **S01** | Québec Food Directory, [Inéwa Boulangerie Alternative, Multigrain Bread Organic 7 Grain 500 g](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8239554), product sheet last updated 2026-09-03; ingredient statement. | The French indexed listing uses flocons de seigle in a Montréal-made multigrain bread; the opened English rendering lists rye flakes separately from cracked rye, oat flakes, and barley flakes. Supports current Québec culinary wording and component distinction, not stand-alone flake processing or a recipe measure. |
| **S02** | Québec Food Directory, [Bon Matin Ancient Grains bread](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207400), last updated 2026-07-06; ingredient statement. | The French indexed listing uses flocons de seigle; the opened English rendering says rye flakes. Supports recent Québec market wording in a composite bread, not product-specific process or a transferable measure. |
| **S03** | Québec Food Directory, [Grand Granola Divin](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202199), product sheet last updated 2025-10-29; ingredient statement. | Its French indexed ingredients list flocons de seigle separately from oat flakes and barley flakes. Supports a Québec food-use example, not a plain flake specification or general cereal-mix formula. |
| **S04** | Les Moissons Dorées, [Flocons de seigle](https://lesmoissonsdorees.com/produits), product listing. | The manufacturer's indexed French description says its flakes are whole rye grains, steamed and flattened. The page could not be fetched directly in this review; the exact text is available in the indexed product result. This is one producer's process and product label, not a universal standard. |
| **S05** | Office québécois de la langue française, [seigle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432764/seigle), Grand dictionnaire terminologique, last updated 2018. | Gives seigle as the preferred French term and rye as its English equivalent; notes that seigle names both plant and grain. The entry is in a brewing vocabulary and does not define flocons de seigle. |
| **S06** | Canadian Food Inspection Agency, [Ochratoxin A in Wheat Products, Oat Products, Rice Products and Other Grains, April 2018 to March 2019](https://inspection.canada.ca/DAM/DAM-food-aliments/STAGING/text-texte/ochratoxin_grains_apr_2018_mar_2019_1593541026427_eng.pdf), Table 1, PDF p. 4. | A federal retail survey sampled rye products in six Canadian cities, including Montréal, and lists flakes among rye product types. Supports a distinct market product class; it is older surveillance evidence, not current Québec terminology, a processing standard, or measurement evidence. |
| **S07** | Arva Flour Mill, [Rye Flakes 425 g](https://arvaflourmills.com/products/rye-flakes), product description. | The Ontario mill describes a product made from whole rye kernels that are steamed, rolled, and dried, and lists breakfast cereal and baking uses. Supports one manufacturer's product and process only; its 425 g package is not a general household measure or density. |
| **S08** | Ardent Mills, [Rye products](https://www.ardentmills.com/products/alternative-grains/additional-gluten-free-flours-grains-seeds/rye/), product-family descriptions. | The mill distinguishes rye flakes from rye meal, rye chops, and flours. Supports keeping these processed products separate within this supplier's range, not a universal product specification or French name. |
| **S09** | Prior proposal, [WP03 Section F rye-berries identity review](wp03-section-f-residual-grain-identities-review-20261010.md), boundary table. | Explicitly excludes rye flakes from the intact-kernel rye-berries identity. It is a scope boundary, not a prior rye-flakes recommendation. |
| **S10** | Prior proposal, [WP02 rye-meal identity boundary review](wp02-rye-meal-identity-boundary-20261010.md), product-family evidence. | Records rye flakes as a product separate from rye meal, flour, and chops. The proposal is not a rye-flakes identity decision. |
| **S11** | Prior proposal, [WP03 Section F barley-flakes review](wp03-section-f-regional-cereal-process-gap-review-20261010.md), Québec granola source entry. | Mentions rye flakes as another ingredient in a Québec granola product while assessing barley flakes. It does not review rye flakes as an identity. |
| **S12** | Vinestrie Sherbrooke, [Flocons de seigle](https://vinestrie.ca/produit/flocons-de-seigle/), Québec brewing-supply listing; product category Flocons and a 500 g option. | The retailer presents itself as a home-brewing supply shop. This is a scope warning only: the listing does not establish the product's ingredients or process, so it is not used to define the proposed human-food identity or as evidence for general measurements. |
| **S13** | Produits de la ferme, [Les Moissons Dorées](https://www.produitsdelaferme.ca/fr/entreprise/les-moissons-dorees/), producer profile. | Identifies the Compton, Québec cereal grower/processor, lists Flocons de seigle, and says its mill transforms its products into flakes and flour. Corroborates local product wording and processing context; it does not specify the rye-flake recipe or a universal process. |

## Integration record

Integrated as `ingredient-ref-rye-flakes` with the exact display pair and empty aliases. The row keeps category GRAIN_AND_CEREAL, null density, and empty unit mappings. No forms, package yields, conversions, recipe links, or substitutions were added. The identity remains distinct from rye grain, rye berries, meal, flour, brewing adjuncts, and multi-ingredient cereal products.

This integration closes this one named preprocessed-grain candidate only. Continue the wider Section F sweep for other regional products and cereal mixes with their exact compositions and source-supported names. Verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).

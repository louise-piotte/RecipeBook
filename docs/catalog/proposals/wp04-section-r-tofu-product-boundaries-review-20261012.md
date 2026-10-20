# WP04 Section R — Tofu Product Boundary Review

Date: 2026-10-12  
Status: proposal only; no canonical or checklist changes made  
Scope: tofu identities and product states named in the open Section R checklist

This review covers plain, pressed/block, silken, smoked, fried, tofu skin/yuba, and fermented tofu wording, including soft/firm/extra-firm grades. Source IDs below are local to this proposal and are not entries in the shared research ledger.

## Recommendation summary

- Keep pressed/block tofu and silken tofu as distinct product identities. The Office québécois de la langue française (OQLF) defines them by different production/texture descriptions and relative moisture. Both can range from soft to extra-firm, so firmness words do not identify either product on their own [S01–S03].
- Treat soft, firm, and extra-firm as grade qualifiers, not new global identities or cross-subtype aliases. Health Canada's bilingual Canadian Nutrient File (CNF) uses firm and extra-firm for silken tofu as well as soft/firm or firm/extra-firm for regular tofu [S04].
- If a future exact recipe calls only for “tofu” or “bean curd,” keep that generic class distinct from pressed, silken, and fermented tofu. The OQLF lists English “bean curd” as a term for generic tofu [S01]. No recipe in the current package needs that row or alias.
- Smoked tofu / tofu fumé is a supported prepared-product candidate [S05]. Fried tofu / tofu frit is a bilingual Canadian food class, but the bare phrase needs context before aliasing it to any named fried product [S04, S06].
- Treat tofu skin / peau de tofu as a separate soybean product made from the surface film of heated soy milk; yuba is a supported product name for that family [S06–S08]. Keep product shapes and further processing unresolved without an exact recipe line.
- White and red fermented bean curd are already separate active references. Keep unqualified fermented tofu / fermented bean curd held; do not create a duplicate reference or map it to plain tofu, douchi, or natto [S09–S11].
- No exact recipe lines were found. Add no recipe links, relinks, forms, quantities, or measurements from this review.

## Scope and repository audit

The [active global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3122) still has the Section R line open: “Silken/soft/firm/extra-firm tofu, pressed tofu, smoked tofu, fried tofu, tofu skin/yuba, and fermented tofu.” The repository instructions in [AGENTS.md](../../AGENTS.md) establish the bundled split seed package as canonical and say JSON-only data additions do not require tests. This packet is documentation only.

The live package under `app/src/main/assets/seed/bundled-library/` was reread for this pass:

| Surface | Current observation |
|---|---|
| `ingredient-references.v1.json` | 1,103 references. No plain tofu, pressed tofu, silken tofu, smoked tofu, fried tofu, or tofu-skin/yuba reference is present. The only tofu-labelled references are `ingredient-ref-white-fermented-bean-curd` (`white fermented bean curd` / `tofu blanc fermenté`) and `ingredient-ref-red-fermented-bean-curd` (`red fermented bean curd` / `tofu fermenté rouge`). Both have empty French and English alias lists and category `SAUCE_AND_CONDIMENT`. |
| `ingredient-forms.v1.json` | 79 forms. No tofu/yuba form is present. |
| Recipe manifest and files | 114 manifest-listed recipe files and 1,123 ingredient rows. The full recipe JSON documents and ingredient rows were searched for tofu, bean-curd, pressed/silken/smoked/fried tofu, peau de tofu, yuba, sufu/furu/doufuru, and 腐乳 wording. No match was found. |

Related repository review:

- [`protein-dairy-identities.md`](../batches/protein-dairy-identities.md) already separates pressed and silken tofu and cites the OQLF. Its old seed-state sentence predates later integrations, so this pass checked the live package rather than reusing that snapshot.
- [The WP04 seitan/TVP review](wp04-plant-protein-seitan-tvp-boundary-review-20261011.md) leaves tofu variants open; it contains no tofu product identity decision to duplicate.
- [The WP04 tempeh follow-up](wp04-next-animal-food-review-20261010.md) mentions a tempeh variation in recipe 095, not a tofu line. That existing tempeh work stays separate.
- [The WP05 fermented/sesame review](wp05-east-asian-fermented-sesame-identity-resolution-20261010.md) and [integration batch](../batches/wp02-wp04-wp05-grain-ferment-count-integration-20261010/README.md) already resolve white and red fermented curd as separate identities and keep generic fermented curd held. The live seed reflects those decisions; this packet proposes no duplicate.
- [The WP05 Section W review](wp05-east-asian-condiments-section-w-review-20261011.md) repeats the same fermented-curd boundary. [The WP06 East Asia sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md) mentions mapo tofu as a named dish in regional context, not as a bundled ingredient line.
- [The WP03 shirataki review](wp03-shirataki-konjac-noodle-boundary-review-20261011.md) treats tofu-shirataki as a separate composite product rather than an alias for plain shirataki or plain tofu. It has no matching recipe demand here.

## Recipe-demand scan

The package scan covered all 114 recipe documents, their ingredient rows, and their English/French/general text. It found zero tofu/yuba/fermented-tofu matches and therefore no ingredient-line IDs to link. Recipe 095’s tempeh variation is not a tofu line. The WP06 mapo-tofu mention is a dish name only. No alias, identity, form, conversion, or substitution is justified by a current bundled recipe.

## Findings and proposed boundaries

| Checklist wording | Evidence-supported boundary and recommendation | Alias limits and current recipe links |
|---|---|---|
| Generic `tofu` / `bean curd` | OQLF defines tofu as coagulated soy liquid and lists generic English `bean curd` alongside `tofu` [S01]. If a future recipe requests only one of these generic terms, keep a generic tofu identity separate from pressed, silken, and fermented products. No generic tofu reference is proposed for this no-demand packet. | Do not route bare `tofu` or `bean curd` to pressed, silken, white/red fermented curd, douchi, or natto. No recipe link. |
| Pressed/block/regular tofu | Candidate identity: French `tofu pressé`; English `pressed tofu`. OQLF lists `block tofu`, `regular tofu`, and `pressed tofu` as English terms for the pressed product [S02]. This product is distinct from silken tofu by process/texture and relative moisture [S02–S03]. | If later promoted, use only those OQLF-attested English equivalents as aliases on this product. Do not infer the product from a recipe direction to press or drain tofu. Do not merge with silken tofu. No recipe link. |
| Silken tofu | Candidate identity: French `tofu soyeux`; English `silken tofu` [S03]. OQLF distinguishes its smooth, gelled texture and higher moisture from pressed tofu. | Do not alias to pressed/block/regular tofu. Firmness words do not uniquely identify silken tofu. No recipe link. |
| Soft, firm, extra-firm | Treat as grade qualifiers if future recipe data can represent a grade. OQLF says both pressed and silken tofu can range from soft to extra-firm; CNF entries also name firm and extra-firm silken tofu and several firmness descriptions for regular tofu [S02–S04]. | Do not create one identity per grade or map `soft tofu`, `firm tofu`, or `extra-firm tofu` globally to pressed or silken tofu. No recipe link. The exact modeling of these qualifiers is unresolved. |
| Smoked tofu | Candidate prepared-product identity: French `tofu fumé`; English `smoked tofu`. Canadian manufacturer Sunrise lists matching English/French products and product-specific ingredients [S05]. This supports the named product class; its formula and “firm” texture are specific to the Sunrise SKU. | Do not alias to plain tofu, extra-firm tofu, tempeh, or a generic smoky-flavoured tofu. Do not generalize the Sunrise formula or grade. No recipe link. |
| Fried tofu | Health Canada lists the bilingual class `Tofu, fried` / `Tofu, frit` [S04]. MAFF describes several distinct products made by frying tofu: aburaage, atsuage, and ganmodoki [S06]. Keep generic fried tofu as a possible distinct product class only where a recipe explicitly names it as an ingredient. | The phrase can describe a purchased prepared product or a cooking step. Do not map it automatically to aburaage, atsuage, ganmodoki, tofu puffs, or plain tofu. Exact product scope stays unresolved; no recipe link. |
| Tofu skin / yuba | Candidate identity: `tofu skin` / `peau de tofu`, with `yuba` as a supported shared product name. MAFF describes yuba as the film forming on heated soy milk and lists it separately from coagulated tofu; a Canadian importer lists `Hikiage Hira-Yuba (Tofu Skin)`, and a Québec retailer uses the bilingual title `Tofu skin / Peau de tofu` [S06–S08]. | Keep distinct from coagulated tofu and soy milk. Do not infer that every sheet, stick, roll, dried, frozen, raw, or cooked soy-skin product has the same form or preparation. Keep `bean curd sheet`, fuzhu, tofu puffs, and named preparations out of the alias list pending exact crosswalk evidence. No recipe link. |
| Fermented tofu / fermented bean curd | Already resolved in the live seed as two color-qualified identities: white fermented bean curd / tofu blanc fermenté and red fermented bean curd / tofu fermenté rouge. The earlier WP05 packet and integration batch support these existing IDs; the regulator groups fermented bean curd separately from fresh tofu and other fermented soy foods [S09–S11]. | Keep the two active IDs separate. Keep unqualified `fermented tofu`, `fermented bean curd`, `tofu fermenté`, `sufu`, `furu`, `doufuru`, and 腐乳 unresolved unless a recipe or label specifies the product. Never alias these to plain tofu, douchi, or natto. No recipe link. |

## Disposition and unresolved cases

This packet recommends product boundaries, not seed edits. If a later integration chooses to add a product, recheck the live package and research ledger then. The source-backed candidates are generic tofu, pressed/block tofu, silken tofu, smoked tofu, fried tofu, and tofu skin/yuba; this corpus does not establish demand for any of them. No canonical IDs or aliases are assigned here.

Keep these questions open until an exact ingredient line or additional technical/retail evidence resolves them:

1. Whether firmness belongs in a dedicated qualifier field, a normalized form, or only preserved recipe text. The evidence shows the words cross pressed/silken boundaries but does not establish RecipeBook’s modeling choice.
2. Whether bare `fried tofu` denotes a generic retail product in any future line or merely a preparation method; the named Japanese products are distinct.
3. Which tofu-skin languages and structures a future recipe means. `Yuba` is supported for the Japanese surface-film product, but the reviewed evidence does not prove that all regional products labelled tofu/bean-curd skin or sheet are interchangeable.
4. Generic fermented-curd wording remains ambiguous and held under the earlier WP05 decision.

No recipe links, aliases on existing IDs, forms, amounts, conversions, yields, substitutions, or measurements are proposed. No tests were run because this is a proposal-only documentation change; canonical JSON and shared workflow documents were not edited.

## Sources accessed 2026-10-12

All descriptions below are paraphrased. CNF is used only for bilingual food names and category wording; its serving masses and nutrient values are not reused.

| ID | Source | Supports and limits |
|---|---|---|
| **S01** | OQLF, [tofu — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26526882/tofu). | Defines generic tofu; classifies tofu generally into pressed and silken types; lists English `tofu` and `bean curd`. Does not resolve recipe demand or all regional tofu products. |
| **S02** | OQLF, [tofu pressé — GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26527131/tofu-presse). | Supports French `tofu pressé`, English `block tofu`, `regular tofu`, `pressed tofu`, texture/moisture distinction, and soft-to-extra-firm range. It is terminology/product-type evidence, not proof that every home-pressed block is this retail class. |
| **S03** | OQLF, [tofu soyeux — GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26526996/tofu-soyeux). | Supports French `tofu soyeux`, English `silken tofu`, relative moisture/texture, and soft-to-extra-firm range. |
| **S04** | Health Canada, Canadian Nutrient File: [regular tofu, soft or firm (food code 4909)](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4909&wbdisable=true); [regular tofu, firm or extra firm (3404)](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3404); [silken tofu, firm (4911)](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4911); [silken tofu, extra firm (4912)](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4912); [fried tofu (6577)](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6577). | Government bilingual names demonstrate firmness words across regular and silken entries and `Tofu, fried / Tofu, frit`. The records are specific food entries and do not define a universal retail grading system or aliased formulas. |
| **S05** | Sunrise Soya Foods, [Tofu fumé Sunrise (French)](https://sunrise-soya.com/fr/product/tofu-fume-sunrise/) and [Sunrise Smoked Tofu Original (English)](https://sunrise-soya.com/product/sunrise-smoked-tofu-original/). | Canadian manufacturer’s bilingual product-name pair and one product’s ingredients/texture. Product details are SKU-specific. |
| **S06** | Japan Ministry of Agriculture, Forestry and Fisheries, [Processed bean products — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/mamerui-kakou.html). | Separates tofu, aburaage, yuba, soy milk, and fermented soy products; describes how aburaage, atsuage, and ganmodoki are fried products and yuba is the heated soy-milk surface film. It is Japanese product-process evidence, not a complete cross-cultural naming standard. |
| **S07** | Ozawa Canada, [Hikiage Hira-Yuba (Tofu Skin)](https://ozawa.ca/product/hikiage-hira-yuba-tofu-skin/). | Canadian importer’s named frozen, 10-sheet product supports the English yuba/tofu-skin pairing and existence of a sheet SKU. It does not establish Québec French or universal yuba forms. |
| **S08** | Paradis Végétarien, Montréal, [Veg-o-mix: Tofu skin \| Végé-mix : Peau de tofu](https://www.paradisvegetarien.com/fr/product-page/veg-o-mix-tofu-skin-v%C3%A9g%C3%A9-mix-peau-de-tofu-vegan). | Québec bilingual retail wording supports `tofu skin / peau de tofu`; this page describes a particular precooked product and does not define the whole product family. |
| **S09** | China State Administration for Market Regulation, [Soy product production-license review rules](https://www.samr.gov.cn/spscs/tzgg/art/2023/art_8c3dc6a187e443328a830dd87b424839.html). | Regulatory list treats fermented bean curd, douchi, and natto as distinct fermented soybean products. It supports separation, not Canadian display names. |
| **S10** | Lee Kum Kee Canada, [Chu Hou Paste](https://ca.lkk.com/fr-ca/products/chu-hou-paste). | Canadian French ingredient list uses `tofu blanc fermenté` for white fermented tofu as one ingredient in a prepared sauce. It supports wording but not product equivalence with the sauce. |
| **S11** | SUE Foods, [Tofu fermenté rouge](https://suefoods.com/products/koon-yick-wah-kee-tofu-fermente-rouge); repository decisions in the [WP05 fermented/sesame review](wp05-east-asian-fermented-sesame-identity-resolution-20261010.md) and [integration batch](../batches/wp02-wp04-wp05-grain-ferment-count-integration-20261010/README.md). | Canadian retailer uses the red French product name; the existing WP05 packet documents product evidence and notes that the retailer listing did not guarantee stock when reviewed. The integration batch already created the two color-qualified references and kept generic curd held. |

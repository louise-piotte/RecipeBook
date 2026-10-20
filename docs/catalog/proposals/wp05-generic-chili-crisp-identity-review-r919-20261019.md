# WP05 generic chili-crisp identity review (R919)

- Reviewed: 2026-10-19
- Status: proposal only; no shared catalog data, ledger, checklist, workflow, or roadmap was edited.
- Scope: generic chili crisp as a culinary condiment, its Québec French naming, active catalog/search boundaries, and bundled recipe demand.
- Out of scope: brand, product-line, flavour, SKU, retailer, and named-product rosters. Commercial-product counts do not add ingredient diversity.

## Recommendation

Add one identity-only generic condiment reference:

- English display: **chili crisp**
- Québec French display: **huile pimentée croustillante** (local recipe wording; provisional and not presented as an official terminology ruling)
- French search alias: **huile piquante et croustillante** (the wording used by Télé-Québec for a recipe it explicitly identifies as chili crisp)
- Proposed ID: `ingredient-ref-chili-crisp`
- Category: `SAUCE_AND_CONDIMENT`
- English aliases: none
- Density: null; unit mappings: empty
- Forms, recipe links, measures, conversions, yields, and substitutions: none

The transferable generic boundary is a chili-based, oil-bearing condiment with intentionally retained crunchy solids. Culinary references consistently treat the solids and texture as part of the chili-crisp identity, while describing substantial variation in the component choices and recipes. That supports a generic identity distinct from plain chili oil without establishing a universal recipe. [S01, S04]

Use **huile pimentée croustillante** as the French display because a Montréal recipe uses it directly alongside the English parenthetical *chili crisp*. Télé-Québec independently titles its recipe **Huile piquante et croustillante** and identifies it as chili crisp. Both are local culinary usages, not official terminology rulings. [S02, S03]

## Plan and catalog boundary

The active [WP05 East Asian condiments checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L10205) still includes chili crisp. Its nested completed item added identity-only `chili oil` and `Chiu Chow Style Chili Crisp Oil`; the prior [sauce-preserve follow-up](wp05-east-asian-sauce-preserve-followup-20261010.md) explicitly kept generic chili crisp separate from chili oil and confined its manufacturer evidence to the named Chiu Chow style.

The current seed snapshot has **1,939 ingredient references** and **204 forms**. It contains no generic chili-crisp reference or form and no exact matching legacy candidate. Relevant active rows are:

| Active row | Boundary to preserve |
|---|---|
| `ingredient-ref-chili-oil` — **chili oil / huile de piment rouge** | Keep distinct from the crunchy condiment; do not alias the two identities. |
| `ingredient-ref-chiu-chow-style-chili-crisp-oil` — **Chiu Chow Style Chili Crisp Oil / huile au piment croustillante de type Chiu Chow** | Preserve the Chiu Chow qualifier and the existing row. Its manufacturer evidence supports that named style and its product-specific description only; do not generalize its formula, details, or measurements to generic chili crisp. [WP05-EASP-FU-20261010-S09, S15] |
| `ingredient-ref-chili-powder` — **chili powder / poudre de chili**; `ingredient-ref-red-chili-flakes` — **red chili flakes / flocons de piment rouge** | Keep dry chili ingredients separate from the prepared condiment. |
| `ingredient-ref-nam-prik-pao` — **Thai chili paste (nam prik pao) / pâte de chili rouge thaï (nam prik pao)**; `ingredient-ref-salsa-macha` — **Salsa macha / salsa macha** | Keep these separately named preparations; shared chili content does not make them aliases or generic chili crisp forms. |

The proposed English phrase **chili crisp** will intentionally match both the generic identity and the existing Chiu Chow style row in the phrase-first [ingredient search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The specific row's display already contains that exact phrase. This is a useful generic/style result pair, not a reason to merge them. The proposed French display and alias are not exact phrase matches for the existing Chiu Chow French display. No aliases are proposed for `chili crunch`, `chili oil`, `crisp oil`, or named regional styles.

## Recipe demand

All **114** manifest-listed recipes and **1,123** ingredient rows were scanned for `chili crisp`, `chili crisp oil`, `chili oil`, `huile pimentée croustillante`, and `huile piquante et croustillante`. **No ingredient row matched.** The neighboring chili references appear in recipe 034, line 6 (`2 tbsp chili powder`), and recipe 043, line 6 (`1 tbsp red chili flakes`); both remain linked to their current identities. No bundled recipe link or relabeling is proposed.

No recipe demand means this proposal adds identity coverage only: no recipe-line association, form, package yield, measurement, conversion, density, or substitution is inferred from external recipe examples.

## Evidence and transfer limits

The compact citations S01–S04 above refer to the new R919 source IDs listed below.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-GENERIC-CHILI-CRISP-R919-20261019-S01` | The Kitchn, [Homemade Chili Crisp](https://www.thekitchn.com/chili-crisp-recipe-23276210), sections “What Makes Up a Chili Crisp?” and “How I Make Chili Crisp.” | Describes chili crisp as a condiment built around chili and oil, aromatics, and retained crispy bits; explicitly treats recipes as variable. The article's specific ingredients, regional descriptions, methods, and proportions are not generalized. |
| `WP05-GENERIC-CHILI-CRISP-R919-20261019-S02` | Télé-Québec, Cuisinez, [Huile piquante et croustillante](https://cuisinez.telequebec.tv/recettes/6505/huile-piquante-et-croustillante), title and introduction. | Local French title; its introduction calls the preparation chili crisp. Its ingredient list, method, temperature, shelf-life, and serving suggestions belong to that recipe only. |
| `WP05-GENERIC-CHILI-CRISP-R919-20261019-S03` | Musée McCord Stewart, [Fiche recette Chefs Nuit Blanche 2026 FR](https://www.musee-mccord-stewart.ca/app/uploads/2023/02/mccord-stewart-recette_chefs_nuit-blanche_2026_fr.pdf), page 4, ingredient list. | A Montréal recipe calls for **huile pimentée croustillante (chili crisp)**. The listed amount and recipe context are not catalog measurements or universal usage claims. |
| `WP05-GENERIC-CHILI-CRISP-R919-20261019-S04` | Feasting at Home, [Homemade Chili Crisp Recipe](https://www.feastingathome.com/chili-crisp/), description and chef’s tips. | Independently describes chili crisp as a condiment with retained crispy components and emphasizes recipe adaptability. Its ingredient list, optional additions, heat, storage advice, and uses remain scoped to that recipe. |
| Existing source IDs | Lee Kum Kee Canada, [Chiu Chow Style Chili Crisp Oil](https://ca.lkk.com/en/products/chiu-chow-style-chili-oil) and [French product page](https://ca.lkk.com/fr-ca/products/chiu-chow-style-chili-oil), previously recorded as WP05-EASP-FU-20261010-S09 and S15. | Retain only as evidence for the existing Chiu Chow style row. These named-product pages do not define a generic formula or justify transferring their product-specific ingredients and claims. |

Do not carry over any source-specific formula, ingredient list, quantity, package data, texture ratio, method, storage/safety claim, heat level, or serving recommendation. No commercial-product roster is needed to establish generic ingredient diversity.

## Proposed research-ledger disposition

If accepted, add one `ingredient_reference` record for `ingredient-ref-chili-crisp`, with identity state `verified`, measurement and substitution research left `not_yet_researched`, and sources `WP05-GENERIC-CHILI-CRISP-R919-20261019-S01` through `S04`. Preserve the existing Chiu Chow record and its source IDs without edits or crosswalks. The proposed R919 source IDs were not present in the current ledger or proposal files at review time.

No software tests were run; none were requested for this documentation-only proposal.

## Root integration decision

Accepted and integrated on 2026-10-19 as identity-only `ingredient-ref-chili-crisp` in
`SAUCE_AND_CONDIMENT`, with French display `huile pimentée croustillante` and the source-attested
French alias `huile piquante et croustillante`. Kept it separate from plain chili oil and the
existing Chiu Chow style reference. The latter and its manufacturer evidence remain unchanged; no
formula, ingredient list, amount, texture ratio, heat, process, storage claim, or use was transferred.
No form, reusable measurement, recipe link, conversion, yield, or substitution was added. See the
[R919 integration README](../batches/wp05-r919-generic-chili-crisp-integration-20261019/README.md).

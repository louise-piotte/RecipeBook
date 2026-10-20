# WP03 Section F — ordinary corn grits boundary and Québec name review (R113, 2026-10-14)

## Review record

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as the identity-only `corn grits / semoule de maïs de type grits` reference and source ledger records. See the [R113 batch README](../batches/wp03-section-f-ordinary-corn-grits-identity-integration-20261014/README.md). The proposal's review snapshot predates integration.
- **Scope:** ordinary dry corn grits for direct human consumption, distinguished from cornmeal and hominy grits. This review does not assign generic `grits`, polenta, instant/quick grits, or alkaline-treated maize products.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference for **`corn grits / semoule de maïs de type grits`**, suggested ID `ingredient-ref-corn-grits`. Keep the English aliases to `degermed corn grits` and `maize grits`; use no French aliases. Keep `ingredient-ref-cornmeal` and `ingredient-ref-hominy-grits` unchanged.

The October 10 review held the candidate because it had not found a Québec French product name that could distinguish ordinary grits from the existing displays. Current Canadian manufacturer naming and current Québec culinary use now support a qualified display. The French phrase is deliberately qualified: plain `semoule de maïs` remains the cornmeal display, and `gruau de maïs` remains the current hominy-grits display.

## Product boundary and name evidence

Codex CXS 155 applies to degermed maize grits for direct human consumption from common maize. It excludes hominy grits, quick grits, and alkaline-treated corn products. The description requires bran and germ to be almost completely removed. The standard also distinguishes grits from meal by granularity: at least 95% of grits passes a 2.00 mm sieve and no more than 20% passes a 0.71 mm sieve; its meal limits are finer. This supports a product identity separate from hominy grits and from the broader cornmeal identity, rather than making “coarse” alone a new identity [S01].

Newer Canadian/Québec evidence improves the name case:

- Bob’s Red Mill’s 2026 Canadian French product list directly pairs **`Corn Grits, White`** with **`Gruau de maïs blanc typique du Sud`** and identifies white corn as the ingredient. Bob’s current Canadian French page describes a dried-white-corn product ground into a coarse gruel, says it is not instant, and lists stone-ground cornmeal separately [S05–S06].
- Bob’s product-specific FAQ says its grits are partially degerminated, while its medium and coarse cornmeal is stone-ground with the germ intact. This is useful evidence that an actual Canadian-market grits product is processed and sold separately from that manufacturer’s cornmeal. It does not establish that the named Bob’s product meets every Codex limit or that all manufacturers use the same process [S07].
- Le Porc du Québec and RICARDO both use **`semoule de maïs de type grits`** in Québec recipe writing. Le Porc du Québec also gives `gruau de maïs` parenthetically, while RICARDO describes the ingredient as coarse-ground American corn semolina. These are direct local culinary attestations for the qualified display, not proof that every such recipe product meets Codex degermination or granularity requirements [S08–S09].

Use **`semoule de maïs de type grits`** as the fr-CA display. It is a source-attested Québec phrase that retains the distinguishing word *grits*. Do not use the shorter `semoule de maïs`: OQLF treats it as the broad milling term for cornmeal and includes fine, medium, and coarse grinds; the active catalog already assigns it to `ingredient-ref-cornmeal` [S02]. Do not use `gruau de maïs` or add Bob’s longer `gruau de maïs blanc typique du Sud` as an alias: Statistics Canada already maps the human-food class `Hominy grits` to `Gruau de maïs`, and current Québec usage also applies the phrase to ordinary corn grits [S03–S05].

## Current ownership and open plan state

The current package snapshot contains **1,455 ingredient references**, **105 forms**, and the research ledger contains **1,795 records**. The relevant active rows are:

| Current owner | Current seed state | Ledger state | Boundary retained here |
|---|---|---|---|
| `ingredient-ref-cornmeal` | `cornmeal / semoule de maïs`; `FLOUR_AND_STARCH`; English alias `corn meal`; density null; unit mappings empty. | Identity `verified`; measurements and substitutions `not_yet_researched`. | Keep broad meal and its coarse grind descriptions here. Do not add `grits` or `corn grits` as cornmeal aliases. |
| `ingredient-ref-hominy-grits` | `hominy grits / gruau de maïs`; `GRAIN_AND_CEREAL`; aliases empty; density null; unit mappings empty. | Identity `verified`; measurements and substitutions `not_yet_researched`. | Keep the ground alkaline-treated hominy product here. Codex excludes it from ordinary degermed grits. |
| `ingredient-ref-hominy-corn` | `hominy corn / maïs lessivé`; `VEGETABLE_AND_AROMATIC`; only English alias `lyed corn`. | Identity `verified`; measurements and substitutions `not_yet_researched`. | Keep the whole-kernel processed product separate from both ground products. |
| `ingredient-ref-dried-sweet-corn-kernels` | `dried sweet corn kernels / maïs sucré séché`; identity-only. | Identity `verified`; measurements researched with no supported reusable value (one product observation); substitutions `not_yet_researched`. | Keep whole dried sweet-corn kernels separate from dry-milled grits. |

No active display or alias owns `corn grits`, `degermed corn grits`, `maize grits`, or `semoule de maïs de type grits`. No current form contains a grits, hominy-grits, or cornmeal term. The ledger has records for the four existing identities above but no `ingredient-ref-corn-grits` record. No existing form, density, mapping, or substitution should move between these owners.

The aggregate Section F checklist remains open for grits, polenta, pearled hominy, pozole corn, dried sweet corn, and remaining puffed-grain candidates. The focused October 10 ordinary-grits review is complete as a hold; this R113 proposal revisits only its name/allocation decision. It does not close the aggregate checklist or reopen the R111 hominy-grits display decision. See the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2881), [October 10 ordinary-grits review](wp03-section-f-ordinary-corn-grits-boundary-review-20261010.md), [R111 hominy-grits Québec display review](wp03-section-f-hominy-grits-quebec-display-review-r111-20261014.md), [R112 dried-sweet-corn identity review](wp03-section-f-dried-sweet-corn-identity-review-r112-20261014.md), and [polenta/grits boundary review](wp03-polenta-grits-product-boundary-review-20261011.md).

## Search behavior and proposed picker result

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case and accents, then searches complete word phrases anywhere in display names, aliases, and form terms before using substring fallback. A query can therefore match a shorter phrase inside a longer display. The following is a static ownership projection using the proposed English aliases and French display; it is not a UI or emulator test.

| Query | Current result(s) | Proposed result(s) | Decision |
|---|---|---|---|
| `corn grits` | None | `ingredient-ref-corn-grits` | Exact ordinary-grits phrase. |
| `degermed corn grits`; `maize grits` | None | `ingredient-ref-corn-grits` | Keep these as the only English aliases. |
| `hominy grits`; `gruau de maïs` | `ingredient-ref-hominy-grits` | Same single row | Preserve R111’s existing English/French ownership. |
| `cornmeal`; `corn meal` | `ingredient-ref-cornmeal` | Same single row | Preserve the existing English owner. |
| `semoule de maïs` | `ingredient-ref-cornmeal` | `ingredient-ref-cornmeal` and `ingredient-ref-corn-grits` | Broad French phrase remains ambiguous; the full qualified phrase below resolves to the proposed row. |
| `semoule de maïs de type grits` | None | `ingredient-ref-corn-grits` | The full Québec phrase resolves to the new row. |
| `grits` | `ingredient-ref-attieke`, `ingredient-ref-hominy-grits`, `ingredient-ref-sorghum-grits` | Those three plus `ingredient-ref-corn-grits` | Keep bare `grits` unassigned; do not add it as an alias. |

Do not add `gruau de maïs blanc typique du Sud` as a French alias even though Bob’s current Canadian list attests it for its white-corn SKU: because phrase search matches a query inside a longer term, that alias would make the broad `gruau de maïs` query return both the new row and the current hominy-grits row. The proposed full `semoule de maïs de type grits` phrase gives a distinct exact search, while a broad `semoule de maïs` query returns both rows for the user to distinguish.

## Recipe demand and numeric/form/substitution limits

The manifest lists **114 bundled recipes**. A scan of all 114 JSON files and their **1,123 structured ingredient rows** found no occurrence of grits, hominy, cornmeal, `semoule de maïs`, `gruau de maïs`, polenta, or `maïs lessivé`. There is no bundled recipe demand and no recipe link to add.

Some source pages contain amounts, but they remain source-specific observations:

| Source observation | Limit |
|---|---|
| Bob’s Canadian product page gives a label serving of `1/4 cup (40 g)` [S06]. | One branded product serving; do not set a default measure, density, or unit mapping. |
| Le Porc du Québec lists `250 ml / 1 cup`; RICARDO lists `180 g / 1 cup` [S08–S09]. | Recipe-specific quantities differ and do not define a general volume-to-mass conversion. |
| Bob’s says its non-instant grits cook in five minutes; RICARDO’s recipe cooks grits for 30 minutes [S06, S09]. | Product and recipe preparation instructions only; do not infer a shared cooked form, cooking yield, or time. |

Keep the row identity-only: no forms, default measures, density, unit mappings, conversions, yields, recipe links, or substitutions. RICARDO’s suggestion to replace its recipe’s grits with coarse cornmeal/polenta-type semolina and Le Porc du Québec’s coarse `semoule de maïs no 120` alternative are recipe-specific; neither supports a global cornmeal, polenta, or hominy-grits substitution rule [S08–S09]. Do not treat quick/instant grits as this row: CXS 155 expressly excludes quick grits. Do not treat alkaline-treated or hominy grits as this row.

## Proposed identity payload

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-corn-grits` |
| English display | `corn grits` |
| fr-CA display | `semoule de maïs de type grits` |
| Category | `GRAIN_AND_CEREAL` |
| English aliases | `degermed corn grits`; `maize grits` |
| French aliases | None |
| Forms, measures, density, mappings, conversions, yields | None; density `null`; mappings empty |
| Recipe links and substitutions | None |

## Sources and access notes

Sources were checked on 2026-10-14. Standards and government terminology/classification sources define the product and existing French-term owners; manufacturer and Québec recipe pages support current product wording and local use, with their limits stated below.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP03-OCG-R113-20261014-S01` | Codex Alimentarius, [Standard for Degermed Maize (Corn) Meal and Maize (Corn) Grits, CXS 155-1985 (Rev. 1-1995)](https://www.fao.org/4/a1392e/a1392e00.pdf), scope §§1.1–1.3, description §2.2, label §7.1, Annex granularity table. | Direct-human-food degermed grits from common maize; excludes hominy grits, quick grits, and alkaline-treated products. Defines near-complete germ/bran removal and a distinct coarser sieve profile. It supplies no Québec French name. |
| `WP03-OCG-R113-20261014-S02` | OQLF, [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), term record. | Supports the existing broad cornmeal display and fine/medium/coarse grind range; coarse grind alone does not justify a grits identity. |
| `WP03-OCG-R113-20261014-S03` | OQLF, [gruau de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais), brewing/malt-crushing domain, updated 1986. | Lists `grits`, `corn grits`, and U.S.-scoped `hominy grits`; useful lexical context, not a current human-food product crosswalk. |
| `WP03-OCG-R113-20261014-S04` | Statistics Canada, [MDFoodCode](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), F232 rows 916 and 918. | Separately maps human-food `Corn meal / Semoule de maïs` and `Hominy grits / Gruau de maïs`. It does not name ordinary corn grits. |
| `WP03-OCG-R113-20261014-S05` | Bob’s Red Mill, [2026 Canadian French Product List, pages 30–31](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/30-31/), item P101087. | Directly pairs `Corn Grits, White` with `Gruau de maïs blanc typique du Sud`, ingredient white corn. Product-specific color/name, not evidence for all variants or a Codex process claim. |
| `WP03-OCG-R113-20261014-S06` | Bob’s Red Mill Canada, [Céréales chaudes de gruau de maïs crémeux](https://www.bobsredmill.ca/produit/cereales-chaudes-de-gruau-de-mais-cremeux), description and nutrition panel. | Current Canadian French page describes dried white corn ground coarse, non-instant cooking, and separate stone-ground cornmeal. Its `1/4 cup (40 g)` belongs to this product. The page does not state alkali treatment or germ-removal percentage. |
| `WP03-OCG-R113-20261014-S07` | Bob’s Red Mill Help Center, [difference between Corn Grits, Polenta, and Cornmeal](https://support.bobsredmill.com/hc/en-us/articles/32919731280659-What-is-the-difference-between-Bob-s-Red-Mill-Corn-Grits-Polenta-and-Cornmeal), updated 2025-05-14. | Manufacturer says its grits/polenta are partially degerminated and its medium/coarse cornmeal is stone-ground with germ intact. Brand-specific process description, not an industry-wide definition or proof of Codex conformity. |
| `WP03-OCG-R113-20261014-S08` | Le Porc du Québec, [Côtes levées coupe St-Louis et grits au cheddar et au jalapeno](https://www.leporcduquebec.com/recette/489-cotes-levees-coupe-st-louis-et-grits-au-cheddar-et-au-jalapeno/), ingredient line. | Uses `semoule de maïs de type grits (gruau de maïs)` and gives `250 ml / 1 cup`; the alternate coarse semolina and amount are recipe-specific. It gives no germ/alkali specification or mass equivalent. |
| `WP03-OCG-R113-20261014-S09` | RICARDO, [Grits aux crevettes](https://www.ricardocuisine.com/recettes/8419-grits-aux-crevettes), ingredient list and team note. | Uses `semoule de maïs de type grits`, `180 g / 1 cup`, and suggests coarse cornmeal/polenta-type semolina for that recipe. It does not establish a universal conversion or substitution. |
| `WP03-OCG-R113-20261014-S10` | La Moisson, [Gruau de maïs blanc crémeux](https://lamoisson.com/products/gruau-de-mais-blanc-cremeux-creamy-white-corn-grits), current Québec retailer listing. | Confirms local retail use of `gruau de maïs` for a white-corn grits product; it does not identify the product as hominy or establish its germ-removal process. |
| `WP03-OCG-R113-20261014-S11` | Repository evidence: [hominy-grits identity record](../batches/hominy-grits-identity.md), [R111 Québec display review](wp03-section-f-hominy-grits-quebec-display-review-r111-20261014.md), and [R112 dried-sweet-corn review](wp03-section-f-dried-sweet-corn-identity-review-r112-20261014.md). | Records the active ground-hominy display, its known Québec overlap, and the separate whole dried-sweet-corn identity. These rows remain unchanged. |

## Conclusion

Add `corn grits / semoule de maïs de type grits` as an identity-only grain/cereal row with the two scoped English aliases listed above and no French aliases. Codex establishes a separate ordinary-grits product boundary; a current Canadian bilingual product list and Québec recipe language now provide usable names. Preserve cornmeal and hominy-grits ownership, including their current French displays. Keep broad `grits`, `gruau de maïs`, and `semoule de maïs` queries visibly ambiguous where phrase matching requires it; do not auto-assign them through aliases. The bundled corpus has no grits demand and supplies no reusable numeric, form, yield, or substitution data.

# WP05 Filipino banana ketchup and bottled toyomansi Québec display review — 2026-10-12

- **Reviewed:** 2026-10-12
- **Status:** Proposal only. This review changes no canonical catalog, ledger, plan, roadmap, recipe, code, or test files.
- **Scope:** Independent review of the existing Section X banana-ketchup and toyomansi candidates. Toyomansi here means a ready-to-use bottled Filipino soy-sauce product with calamansi. Fresh, table-mixed toyo and calamansi dipping sauce is kept outside that identity.
- **Recommendation:** Advance both as distinct condiment identities with the bilingual displays below. Keep product formulations open where sources vary; do not infer recipe demand or numeric behavior.

## Disposition

| Candidate | Proposed EN display | Proposed fr-CA display | Alias recommendation | Decision and limits |
|---|---|---|---|---|
| Philippine-style banana ketchup | `banana ketchup` | `ketchup aux bananes` | EN: `banana catsup`. FR: `ketchup à la banane`. | Add as a prepared banana-based ketchup condiment/ingredient. Keep distinct from plain `ketchup`, Québec fruit ketchup, and green-tomato ketchup. Do not impose a tomato-free formula, fixed banana percentage, color, heat, or one brand recipe. |
| Bottled toyomansi | `toyomansi soy sauce with calamansi` | `sauce soya toyomansi` | None proposed. | Add only for the ready-to-use bottled soy-sauce condiment containing calamansi. Do not alias to `soy sauce`, `calamansi`, or bare `toyomansi`; the bare Filipino term also names a fresh, variable table-side dipping sauce. |

Suggested distinct IDs, subject to integrator review: `ingredient-ref-banana-ketchup` and `ingredient-ref-toyomansi-soy-sauce`. Both are unoccupied in the live references and the research ledger at review time.

## Product boundaries

### Banana ketchup

The Philippine FDA's official food-registration manual lists `PNS/FDA 40:2015 Banana Ketchup – Specifications` and the corresponding handling code, establishing banana ketchup as a named Philippine product-standard class. The full specification PDF did not surface on the official page in this review, so this supports the identity and standard title only; it does not establish a detailed composition here. NutriAsia, a Philippine manufacturer, calls its UFC line both `Banana Catsup` and `Banana Ketchup`, and describes it as a blend using selected bananas and spices.

The product should remain separate from the catalog's generic `ketchup`, `fruit ketchup / ketchup aux fruits`, and `green tomato ketchup / ketchup vert`. OQLF says bare `ketchup` conventionally means tomato ketchup and that other ketchup types need a qualifier. A current Québec-made product from Asia Sauce is explicitly presented as Filipino `Ketchup aux bananes`; its formula includes banana, pear, and apple purées **and tomato paste**. That variation is why the identity must not imply “tomato-free” or a fixed ingredient list.

For fr-CA, prefer **`ketchup aux bananes`**. It is the wording on a Québec manufacturer's current product page and fits the locally familiar qualified-ketchup pattern, including `ketchup aux fruits`. Accept **`ketchup à la banane`** as a scoped alias: a Québec recipe page uses it as the title for this Filipino condiment, then also uses `ketchup aux bananes` in its text. Neither phrase is an OQLF ruling; OQLF's entry supports qualifying the non-tomato-default product, but contains no banana-ketchup term. Do not add broader `sauce banane`, `sauce aux bananes`, or `banana sauce` aliases: those retail-style names are less specific and may describe other sauces.

`banana catsup` is a directly attested manufacturer spelling on NutriAsia's UFC product page. Keep it as an EN alias to this identity, not as a new product. No recipe demand was found for either spelling.

### Bottled toyomansi

NutriAsia's Datu Puti brand page classifies Toyomansi under its `Toyomixes` and describes that variant as soy sauce with calamansi, intended for grilled food. The company also lists a distinct 250 mL Datu Puti Toyomansi product. This supports the proposed **bottled, ready-to-use soy-sauce condiment with calamansi**. Current Canadian retail evidence uses the product name `Datu Puti Toyomansi Soy Sauce with Calamansi`; Metro's Québec French listing names it `Sauce soya toyomansi` and lists calamansi extract. The maker's and retailer's ingredient information shows this is a formulated product and need not contain only soy sauce and calamansi.

Keep this bottled identity distinct from **fresh, recipe-made toyomansi**. A published Filipino dipping-sauce recipe uses calamansi juice and soy sauce, with vinegar, oil, garlic, and chiles. A recent Philippine condiment feature also describes diners mixing soy sauce with fresh calamansi and optional chili at the table. These versions have variable recipes and are prepared at serving time. A future recipe that means that fresh dip should encode the recipe/preparation separately; it must not be mapped through this bottled-product row. This review proposes no second identity for the fresh sauce.

The exact Québec retailer wording `sauce soya toyomansi` is the recommended fr-CA display. OQLF confirms `sauce soya` and `sauce de soya` as Québec usage; a Montréal Filipino restaurant menu separately glosses the borrowed product word as `toyomansi (soya/calamansi)`. The display retains `calamansi` as used on the product and local menu. OQLF's fruit entry lists `calamondin`, not `calamansi`; that terminology entry does not settle the wording of this Filipino product name. No additional alias is proposed because generic `soy sauce with calamansi` or bare `toyomansi` could collapse the bottled condiment with the fresh dip.

## Current catalog and recipe scan

The live bundled reference file contains 1,101 references. It has no banana-ketchup or toyomansi reference, alias, or matching form, and the ledger has no identity record for either candidate. Relevant active neighbors are:

- `ingredient-ref-ketchup` — `ketchup / ketchup`;
- `ingredient-ref-fruit-ketchup` — `fruit ketchup / ketchup aux fruits`;
- `ingredient-ref-green-tomato-ketchup` — `green tomato ketchup / ketchup vert`, with `ketchup aux tomates vertes` as a French alias;
- `ingredient-ref-soy-sauce` — `soy sauce / sauce soya` and other distinct soy-sauce styles;
- `ingredient-ref-calamansi` — `calamansi / calamondin`.

The two recommended identities do not collide with those display names or aliases. Keep banana ketchup outside all three existing ketchup rows, and keep bottled toyomansi outside the soy-sauce and calamansi rows.

I scanned all 114 manifest-listed bundled recipes, including ingredient text, titles, descriptions, instructions, and notes. There were no exact mentions of `banana ketchup`, `ketchup aux bananes`, `ketchup à la banane`, `toyomansi`, `calamansi`, or `calamondin`. Plain `ketchup` is present in three recipe ingredient rows under `ingredient-ref-ketchup`; none indicates the Filipino product. This review requests no recipe relinking or recipe edits.

## Measurement and substitution

No density, unit mapping, conversion, or substitution ratio is proposed. Retail package sizes and general product descriptions do not establish kitchen-volume conversions or safe replacements. Keep measurement behavior null/empty and substitution behavior unclaimed for both candidates.

## Source register

Sources were accessed on 2026-10-12. Québec usage evidence is kept separate from the Philippine product/standard evidence. Retail, restaurant-menu, and recipe wording supports local usage but is not treated as a formal terminology ruling.

| ID | Source | Supports and limit |
|---|---|---|
| **WP05-FILIPINO-SAUCE-QC-20261012-S01** | Philippine Food and Drug Administration, [CFRR User Manual for the Modified e-Portal](https://www.fda.gov.ph/wp-content/uploads/2022/04/CFRR-User-Manual-for-the-Modified-E-portal-V2.pdf#page=159), Annex A, printed pp. 159–160. | Official FDA manual lists `PNS/FDA 40:2015 Banana Ketchup – Specifications` and PNS/FDA 41:2015. The full specification itself was not accessible from the official source in this review; no detailed standard formula is asserted. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S02** | NutriAsia, [UFC brand](https://nutriasia.com/brands/ufc/). | Philippine manufacturer uses `Banana Catsup` and `Banana Ketchup`, describes selected bananas/spices, and presents it as a dip, cooking ingredient, and marinade. Product-owner evidence, not a universal formula. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S03** | Office québécois de la langue française, GDT, [ketchup](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2077493/ketchup). | Says unqualified `ketchup` denotes the common tomato product; non-tomato types require a qualifier. It does not provide a banana-ketchup entry or rule between `à la banane` and `aux bananes`. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S04** | Asia Sauce, Chicoutimi, [Ketchup aux bananes](https://asiasauce.ca/). | Current Québec-made Filipino product uses the exact proposed fr-CA display. Its ingredient list includes banana, pear, and apple purées and tomato paste; this supports naming/formula variation, not a fixed Philippine-standard recipe. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S05** | Bon pour toi, [Ketchup à la banane](https://bonpourtoi.ca/recettes/ketchup-a-la-banane/). | Québec-facing French recipe title uses the proposed scoped alias for the Philippine condiment. Recipe wording is not a packaged-food standard or OQLF ruling. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S06** | NutriAsia, [Datu Puti brand](https://nutriasia.com/brands/datu-puti/) and [Datu Puti Toyomansi 250 mL](https://nutriasia.com/products/datu-puti-toyomansi-250ml/). | Original Philippine manufacturer describes Toyomansi as soy sauce with calamansi, a member of its ready-made `Toyomixes`, and lists a retail SKU. This supports the bottled-product identity; it does not describe every brand's formula. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S07** | Metro Québec, [Sauce soya toyomansi Datu Puti](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/condiments-internationaux/sauce-soya-toyomansi/p/737964000370). | Current indexed Québec product listing uses the exact French wording and names calamansi extract in the ingredients. Direct page fetch returned HTTP 403 in this review; exact title and ingredient text were available in the current search index. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S08** | Save-On-Foods, [Datu Puti Toyomansi Soy Sauce with Calamansi](https://www.saveonfoods.com/sm/pickup/rsid/4410/product/datu-puti-toyomansi-soy-sauce-with-calamansi-id-00737964000370). | Current Canadian English retail listing names the bottled product and describes it as soy sauce with calamansi for marinades and dipping. Retailer listing; verify the physical label for final ingredients. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S09** | OQLF, GDT, [sauce soya](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya) and [calamondin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084068/calamondin). | OQLF lists `sauce soya` / `sauce de soya` as Québec forms and `calamondin` as the French fruit term. It does not provide a Toyomansi or `calamansi` ruling. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S10** | Uber Eats, [Junior, Montréal menu](https://www.ubereats.com/ca-fr/store/junior/8xneh64xRfat6CYzgw94Ag). | Montréal menu glosses `toyomansi` as `soya/calamansi`, supporting local bilingual comprehension. Uber Eats records this restaurant as closed on the platform as of 2025-06-13; this is local usage evidence, not current restaurant availability or a packaged-product label. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S11** | Saveur, [Filipino Toyomansi Sauce Recipe](https://www.saveur.com/recipes/toyomansi/). | Filipino dipping-sauce recipe uses fresh or bottled calamansi juice and soy sauce with vinegar and aromatics, supporting a distinct recipe-made usage. This is editorial/chef recipe evidence, not a Philippine standard. |
| **WP05-FILIPINO-SAUCE-QC-20261012-S12** | Michelin Guide, [The Philippine Condiment Table: Lessons on Sauce Culture](https://guide.michelin.com/sg/en/article/features/the-philippine-condiment-table-lessons-on-sauce-culture). | Describes fresh calamansi and soy sauce combined at the table to make toyomansi. This is editorial food-culture reporting, not a formal definition or product standard. |

## Checks and disposition

- Confirmed exact-name and alias collisions against current references, forms, recipe-linked use, and the research ledger. The earlier WP05 proposal remains the owner; later WP05/WP06 review documents refer back to its pending candidates without adding separate catalog rows.
- Confirmed all cited French displays or aliases against current Québec/Canadian usage or OQLF guidance, with the stated limits.
- Scanned all 114 bundled recipes; no demand hit for either proposed identity or their distinguishing fruit name.
- Proposal-only review: no tests or emulator checks run, and no canonical data was edited.

**Disposition:** Recommend advancing `banana ketchup / ketchup aux bananes` with the scoped aliases `banana catsup` and `ketchup à la banane`. Recommend a separate bottled-product identity `toyomansi soy sauce with calamansi / sauce soya toyomansi`, with no aliases that could pull in base soy sauce, calamansi, or the fresh dipping sauce. The full Philippine banana-ketchup specification and a dedicated OQLF banana/toyomansi term were not available in the bounded source set; this review does not claim either.

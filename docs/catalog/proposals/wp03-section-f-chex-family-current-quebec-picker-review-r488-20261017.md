# WP03 Section F R488: Current Québec Chex identity and picker review (2026-10-17)

## Review decision

- **Scope:** The open Section F identity and terminology sweep, which still includes packaged cereals and other grain products ([plan, line 552](../../RecipeBook-global-ingredient-catalog-plan.txt#L552)).
- **Recommendation:** Add five separate, identity-only Chex cereal references: Rice, Cinnamon, Honey Nut, Chocolate, and Apple Cinnamon. Each has a current Québec French retail label and a current English product record; Cinnamon and Apple Cinnamon also have paired Metro pages with matching product numbers in both languages.
- **Family limit:** These five are a reviewed set of locally evidenced products, not a complete Chex lineup. General Mills Canada says the brand has nine varieties but does not enumerate them. A broad `Chex` picker query will therefore return five supported products and should not be described as representing every Chex variety.
- **Status:** Proposal only. No shared ingredient references, forms, legacy candidates, research-ledger records, recipes, plan, roadmap, or workflow files changed.

## Prior-work boundary

R485 held Rice Chex alone because adding it would make `Chex` return a misleading singleton while the May 2025 manufacturer guide listed four other Canadian Chex cereals. This review resolves that picker concern for the products supported by current Québec-facing evidence and adds the locally evidenced Apple Cinnamon sibling. It replaces the Rice-only hold recommendation with a bounded five-product proposal; it does not claim that the open Chex family roster is complete.

R482 concerns an inaccessible CNF 2026 cooked-rice row and has no cereal identity overlap. R479 integrated Irish-oat terminology and has no Chex overlap. Neither decision is reopened.

## Proposed identities and boundary

Each row is a separately named, dry, ready-to-eat branded cereal product in `GRAIN_AND_CEREAL`. The display strings use the product-specific English and Québec French labels below. Package sizes and retailer item numbers identify the evidence only; they are not catalog measures.

| Proposed ID | English display | French display | English aliases | French aliases | Product boundary and evidence |
|---|---|---|---|---|---|
| `ingredient-ref-rice-chex-cereal` | Rice Chex cereal | Céréales Chex au riz | None | None | Keep separate from plain rice, puffed rice, baby rice cereal, and crispy rice cereal. Current Maxi French listing and current English Rice Chex product listing support the product identity [R485-S01, R488-S01, R488-S08]. |
| `ingredient-ref-cinnamon-chex-cereal` | Cinnamon Chex cereal | Céréales de riz à la cannelle Chex | None | Chex Saveur Cannelle | Keep distinct from Apple Cinnamon Chex. The French alias is the current Maxi wording; Metro’s French and English pages use the same product number `065633400139` [R488-S01, R488-S04–S05]. |
| `ingredient-ref-honey-nut-chex-cereal` | Honey Nut Chex cereal | Céréales Chex saveur de miel et de noix | None | Chex Céréales saveur de miel et de noix; Chex Saveur de miel et de noix | Keep distinct from Cinnamon, Chocolate, and other honey- or nut-flavored cereals. The first alias follows the current Maxi title; the shorter wording is attested in the General Mills French guide [R485-S02, R488-S01, R488-S06]. |
| `ingredient-ref-chocolate-chex-cereal` | Chocolate Chex cereal | Céréales Chex au chocolat | None | Chex Chocolat Céréales | Keep distinct from chocolate-flavored Cheerios, cocoa, chocolate, and generic chocolate cereal. Maxi’s English and French pages share item number `20966716_EA`; their product descriptions identify Chex cereal, and Provigo’s current French collection lists it as Chex Chocolat Céréales [R488-S02–S03, Provigo reuse]. |
| `ingredient-ref-apple-cinnamon-chex-cereal` | Apple Cinnamon Chex cereal | Céréales de riz aux pommes et cannelle Chex | None | Chex Pomme et cannelle | Keep distinct from Cinnamon Chex. The current Metro English and French pages share product number `065633184916`; the French alias is the earlier General Mills French product wording [R485-S02, R488-S09–S11]. |

The proposed IDs are unallocated in the active references, forms, legacy-import candidates, and ledger. Add no forms, density, unit mappings, reusable measures, cooking or package yields, conversions, recipe links, or substitutions. In particular, do not infer a generic cup-to-mass value from a cereal package or nutrition serving.

Do not add `sans gluten`, `gluten-free`, whole-grain, or other package claims as identity aliases. Do not add `Chex` as a standalone alias; the five names already contain the brand and make the family query return the reviewed set.

## Current family evidence and exclusions

Maxi’s current French cereal collection lists Cinnamon Chex, Rice Chex, Honey Nut Chex, and a General Mills chocolate cereal. The chocolate product’s paired Maxi pages use the same retailer item number and 360 g size; their product descriptions identify it as Chex cereal. Provigo’s French cereal collection also currently lists the four Québec products together, including the exact title `Chex Chocolat Céréales`. Apple Cinnamon is separately supported by current English and French Metro pages for product number `065633184916`, plus a current English Voilà listing. These records establish the five reviewed products without asserting that every Chex flavor is available in Québec.

**Corn Chex stays outside this set.** General Mills’ May 2025 guide lists it, and Voilà and Metro still expose English item pages. A Chex-team response posted on a Target-hosted Q&A says the product is discontinued in Canada. Metro’s selected-store page reports it out of stock, and no current Québec French Corn Chex listing was found. The retailer pages conflict with the brand-team response, so this proposal excludes Corn because current bilingual Québec evidence is missing and records the discontinuation conflict without claiming that the retailer records prove Canadian availability.

**Peanut Butter Chex stays outside this set** because the current item page found is English-only and no current Québec French product label was found. No discontinuation claim is made.

The current General Mills Canada brand page says there are nine Chex varieties, but does not name them. The product guide is a May 2025 snapshot, not a full October 2026 roster. The five-row proposal is therefore intentionally limited to the current products evidenced by Québec French labels and paired/current English product records.

## Ownership and corpus audit

The read-only audit used the current workspace snapshot: **1,762 active ingredient references** (247 `GRAIN_AND_CEREAL`), **143 forms**, **56 legacy-import candidates**, and **2,121 research-ledger records** with **9,688 source entries**, **8,220 distinct source IDs**, and **6,933 distinct source URLs**.

| Surface | Result |
|---|---|
| Active references and aliases | No exact normalized owner for Chex, Rice Chex, Cinnamon Chex, Honey Nut Chex, Chocolate Chex, Apple Cinnamon Chex, or the proposed French product phrases. The only nearby rice-cereal identities remain `ingredient-ref-baby-rice-cereal` and `ingredient-ref-rice-cereal` (crispy rice cereal). |
| Forms | No Chex form label, match term, or proposed ID among the 143 active forms. No form is proposed. |
| Legacy-import candidates | No exact candidate phrase or proposed ID among the 56 legacy candidates. |
| Research ledger | No Chex text, Chex record, proposed identity ID, or matching candidate phrase was found in the 2,121 current records. |
| Proposed source IDs and URLs | New R488 source IDs below are proposal-local and unallocated. The only collection URL already owned by the ledger is Provigo’s French cereal collection, owned by `WP03-OAT-CRUNCH-FAMILY-R198-20261016-S05` on two Cheerios records; its current locator documents Cheerios, not Chex. Reuse that exact ID if the Chex collection evidence is integrated and extend its locator. The R485 General Mills guide source IDs are reused as proposal references. All other URLs below have no exact URL owner in the current ledger. |

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for Chex names, aliases, product numbers, and proposed IDs. No Chex demand or link was found. Recipe 040 contains `6 cups crispy rice cereal`, linked to `ingredient-ref-rice-cereal`; it remains generic crispy rice cereal and is not a Chex reference.

## Picker projection

This is a static projection using the current phrase-first ingredient search terms from active references and their forms. It is not an Android picker test.

| Query | Current | With proposal | Effect |
|---|---:|---:|---|
| `Chex` | 0 | 5 | Shows the five reviewed products only; it is not a complete Chex roster. |
| `Rice Chex` | 0 | 1 | Rice Chex. |
| `Cinnamon Chex` | 0 | 2 | Cinnamon Chex and Apple Cinnamon Chex share this contiguous phrase. |
| `Honey Nut Chex` | 0 | 1 | Honey Nut Chex. |
| `Chocolate Chex` | 0 | 1 | Chocolate Chex. |
| `Apple Cinnamon Chex` | 0 | 1 | Apple Cinnamon Chex. |
| `Chex au riz` | 0 | 1 | Rice Chex. |
| `Chex Saveur Cannelle` | 0 | 1 | Cinnamon Chex. |
| `Chex Céréales saveur de miel et de noix` | 0 | 1 | Honey Nut Chex. |
| `Chex Chocolat Céréales` | 0 | 1 | Chocolate Chex. |
| `Céréales de riz à la cannelle Chex` | 0 | 1 | Cinnamon Chex. |
| `Céréales de riz aux pommes et cannelle Chex` | 0 | 1 | Apple Cinnamon Chex. |
| `rice cereal` | 2 | 2 | The existing baby and crispy rice cereal results remain unchanged. |
| `cereal` / `céréales` | 47 / 43 | 52 / 48 | Adds five packaged cereal identities to each broad language query. |
| `Chex au maïs` | 0 | 0 | Corn Chex is excluded. |

Do not add the Metro English full product titles `Chex Cinnamon Flavoured Rice Cereal` or `Chex Apple Cinnamon Rice Cereal` as aliases: both would add branded flavors to the broad `rice cereal` result set. The canonical product queries and the current French labels remain searchable. This preserves the generic `rice cereal` query at two results. The existing `Cinnamon Chex` query still becomes two results because Apple Cinnamon contains that exact phrase; the distinct `Apple Cinnamon Chex` query resolves to one result.

## Source register

Sources were checked on 2026-10-17. New R488 IDs are proposal-local references only; this proposal does not write them to the shared ledger. R485-S01 and R485-S02 below refer to the full reused proposal IDs `WP03-RICE-CHEX-R485-20261017-S01` and `WP03-RICE-CHEX-R485-20261017-S02`.

| Source ID / reuse | Source URL | What it supports and limits |
|---|---|---|
| Reuse R485-S01 | General Mills Foodservice Canada, [Product Guide updated May 2025](https://www.generalmillsfoodservice.ca/wp-content/uploads/2025/05/GM-Complete-Product-Guide-May-2025-ENG.pdf), printed page 8. | Manufacturer’s Canadian English Chex product names, including Rice, Cinnamon, Honey Nut, Chocolate, and Corn, with package identifiers and sizes. This is a 2025 snapshot, not proof of the full current 2026 lineup. |
| Reuse R485-S02 | General Mills Foodservice Canada, [Guide des produits updated September 2023](https://www.generalmillsfoodservice.ca/wp-content/uploads/2023/10/GM-guide-des-produits-Sept-23.pdf), printed page 8. | Manufacturer’s French product names, including Chex au riz, Chex Cannelle, Chex au maïs, Chex Pomme et cannelle, and Chex Saveur de miel et de noix. Older wording only; current Québec retail pages support the products proposed here. |
| WP03-CHEX-QUEBEC-R488-20261017-S01 | [Maxi Québec, French cereal collection](https://www.maxi.ca/fr/collection/cereal). | Current French listing context for Cinnamon Chex Saveur Cannelle, Chex au riz, Honey Nut Chex, and a General Mills chocolate cereal. The page lists 345 g, 340 g, 354 g, and 360 g packages respectively; sizes are product identifiers, not measures. |
| Reuse WP03-OAT-CRUNCH-FAMILY-R198-20261016-S05 | [Provigo Québec, French cereal collection](https://www.provigo.ca/fr/collection/cereal). | Current page lists the same four products and gives the French Chex Chocolat Céréales title. Its existing ledger locator describes Cheerios listings only; if integrated, update that locator instead of creating another source ID for this exact URL. |
| WP03-CHEX-QUEBEC-R488-20261017-S02 | [Maxi Québec, Chocolat Céréales, 360 g (French)](https://www.maxi.ca/fr/chocolat-c-r-ales/p/20966716_EA?source=sptd). | Current French product page, retailer item number 20966716_EA, 360 g, and product description identifying Chex cereals. The displayed title itself omits Chex, so the paired English page and Provigo title are used to establish product identity. |
| WP03-CHEX-QUEBEC-R488-20261017-S03 | [Maxi Québec, Chocolate Cereal, 360 g (English)](https://www.maxi.ca/en/chocolate-cereal/p/20966716_EA?source=sptd). | Same retailer item number and package as the French page; its text identifies a box of Chex cereal. Supports the paired bilingual product identity, not a transferable measure. |
| WP03-CHEX-QUEBEC-R488-20261017-S04 | Metro Québec, [Céréales de riz à la cannelle Chex](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-riz-a-la-cannelle/p/065633400139). | Current French product title, 345 g, item number 065633400139. |
| WP03-CHEX-QUEBEC-R488-20261017-S05 | Metro, [Chex Cinnamon Flavoured Rice Cereal](https://api.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/family-cereals/cinnamon-flavoured-rice-cereal/p/065633400139). | Current English product title and the same item number as the French page. The alternate full title is not retained as an alias because it would broaden rice cereal. |
| WP03-CHEX-QUEBEC-R488-20261017-S06 | Voilà, [Chex Gluten-Free Cereal Honey Nut, 354 g](https://voila.ca/products/chex-gluten-free-cereal-honey-nut-354-g/19877EA). | Current English Honey Nut product record and 354 g package, matching the Québec French listing’s flavor and package size. It does not establish a French label. |
| WP03-CHEX-QUEBEC-R488-20261017-S07 | Voilà, [Chex Gluten-Free Cereal Chocolate, 360 g](https://voila.ca/products/chex-gluten-free-cereal-chocolate-360-g/647465EA). | Current English Chocolate Chex product record and 360 g package; corroborates the paired Maxi/Provigo French evidence. |
| WP03-CHEX-QUEBEC-R488-20261017-S08 | Voilà, [Chex Gluten-Free Cereal Rice, 365 g](https://voila.ca/products/chex-gluten-free-cereal-rice-365-g/280573EA). | Current English Rice Chex product record. General Mills’ guide lists Rice Chex in both 340 g and 365 g packages; package-size variation does not create another identity. |
| WP03-CHEX-QUEBEC-R488-20261017-S09 | Metro Québec, [Céréales de riz aux pommes et cannelle Chex](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-riz-aux-pommes-et-cannelle/p/065633184916). | Current French title, 340 g, item number 065633184916. Metro’s selected-store page reported out of stock during this review; the page supports a current product record and label, not local stock. |
| WP03-CHEX-QUEBEC-R488-20261017-S10 | Metro, [Chex Apple Cinnamon Rice Cereal](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/family-cereals/apple-cinnamon-rice-cereal/p/065633184916). | Current English title with the same item number as the French page. The full title is not retained as an alias because it would broaden rice cereal. |
| WP03-CHEX-QUEBEC-R488-20261017-S11 | Voilà, [Chex Gluten-Free Cereal Apple Cinnamon, 340 g](https://voila.ca/products/chex-gluten-free-cereal-apple-cinnamon-340-g/887556EA). | Current English product record corroborating the Apple Cinnamon flavor; it does not establish Québec stock or a French label. |
| WP03-CHEX-QUEBEC-R488-20261017-S12 | General Mills Canada, [Chex brand page](https://www.generalmills.ca/our-food/brands/chex-cereal). | Current Canadian brand page says there are nine varieties but does not name them. Used only to limit the completeness claim. |
| WP03-CHEX-QUEBEC-R488-20261017-S13 | Target-hosted [Chex product Q&A](https://www.target.com/p/-/A-88914640). | A reply from the Chex team says Corn Chex is discontinued in Canada. The statement is a current brand-team response hosted by a retailer, not a Canadian manufacturer SKU roster; it conflicts with live English retailer item pages. |
| WP03-CHEX-QUEBEC-R488-20261017-S14 | Voilà, [Chex Gluten-Free Cereal Corn, 340 g](https://voila.ca/products/chex-gluten-free-cereal-corn-340-g/999526EA). | Current English retail item page, which conflicts with the Chex-team discontinuation response. It does not provide a Québec French title or establish Canadian availability. |
| WP03-CHEX-QUEBEC-R488-20261017-S15 | Metro, [Chex Corn Cereal](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/granola-healthier-cereals/corn-cereals/p/065633197794). | English item page for product number 065633197794; Metro’s selected-store page reported out of stock. It provides no current French Québec label. |
| WP03-CHEX-QUEBEC-R488-20261017-S16 | Voilà, [Chex Gluten Free Cereal Peanut Butter, 340 g](https://voila.ca/products/chex-gluten-free-cereal-peanut-butter-340-g/736587EA). | Current English Peanut Butter product record. No current Québec French product label was found, so it is excluded without a discontinuation claim. |

## Test requirement

If accepted and implemented only as additions to the database JSON, the AGENTS.md rule says no software tests are needed. This R488 change is proposal-only; no software tests, builds, emulator checks, or deployment were run.

## Recommendation

Accept the five localized, identity-only product references above as the current Québec-evidenced Chex set. Keep Corn Chex and Peanut Butter Chex out of this proposal for the stated evidence gaps. Preserve the limits: the set is not a complete Chex roster, Cinnamon Chex and Apple Cinnamon Chex both match the phrase `Cinnamon Chex`, and generic `rice cereal` stays on its two existing references.

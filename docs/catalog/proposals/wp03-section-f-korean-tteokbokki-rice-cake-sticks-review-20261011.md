# WP03 Section F: Korean tteokbokki rice-cake sticks

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** The Québec French naming hold was recorded in the 2026-10-11 follow-up integration; no active reference was added. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
- **Checklist scope:** one open regional prepared-starch item in Section F: unseasoned Korean rice-cake sticks in the tubular/stick product type sold for tteokbokki.
- **Recommendation:** **hold catalog integration pending Québec French terminology review.** The food identity and local product evidence are strong. The most specific French Québec product title located is a listing that spells the dish name `tteobokki`; the OQLF entry for the unqualified base phrase `gâteau de riz` means rice pudding. Preserve the product title as evidence, but do not choose a canonical French display or alias from it without review. Do not infer a replacement French phrase.

## Open item and prior coverage

The live plan leaves “Rice cakes, Korean tteok, Chinese niangao, and comparable regional prepared starches” open at [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L1849). The [plant-grains checklist](../batches/plant-grains-cereals.md#section-f-checklist-disposition) records rice cakes as out of scope for puffed rice and leaves the broader regional prepared-starch item open. No earlier proposal in the current proposal set reviews tteok, garaetteok, tteokbokki rice-cake sticks, or niangao as an ingredient identity. The cracker and wrapper proposals mention these foods only as still-open boundaries.

This review is limited to plain, unseasoned, cylindrical Korean rice cakes marketed for tteokbokki. It does not propose a family-wide `tteok` identity, and it does not combine tteokbokki sticks with oval rice-cake slices, sweet or filled Korean tteok, Chinese niangao, rice flour, cooked rice, or a prepared tteokbokki meal with sauce. Korean rice cakes can be cut into different shapes for different dishes, so this packet treats the retailer-marketed tubular/stick product as a narrow candidate rather than claiming that every cylinder and slice is a distinct base dough.

## Live package and exact-key audit

The audit read the current manifest-listed package and its 114 recipe files. Candidate strings were compared with the repository's `normalize_search_key` behavior across active reference names and aliases, form labels and match terms, research-ledger strings, legacy candidates, and recipe ingredient rows.

| Live surface | Current result |
| --- | --- |
| Active ingredient references | 906 references. There is no exact reference or alias for `rice cake`, `rice cakes`, `rice cake sticks`, `tteok`, `tteokbokki`, `garaetteok`, `gâteau de riz`, or the retailer spelling `gâteau de riz pour tteobokki`. The one normalized nearby hit for the audited `rice-paper` spelling is the existing `rice paper` alias on `ingredient-ref-rice-paper-wrapper`; it is a wrapper, not tteok. |
| Nearby rice identities | The catalog separately contains generic rice, glutinous rice, rice flour, glutinous rice flour, rice vermicelli, rice-paper sheets, crispy rice cereal, puffed rice, and flattened rice (poha), plus named rice varieties. These are not prepared tteok. Broad `rice` / `riz` queries can return many of them; no broad token is proposed as an alias. |
| Ingredient forms | 48 forms total. No form or match term refers to tteok or rice cakes. Generic rice has dry and cooked forms; neither describes a pounded/steamed cake product. Do not copy those forms to this candidate. |
| Research ledger | 1,160 records. No tteok, garaetteok, niangao, or rice-cake identity decision was found. One puffed-rice decision mentions “rice cakes” only to explicitly exclude them from that identity; it is not a prior rice-cake review. |
| Legacy candidates | 77 candidates; no exact tteok, garaetteok, niangao, rice-cake-stick, or French product-label candidate. |
| Bundled recipe demand | 114 recipes and 1,123 ingredient rows. **Zero** exact or broader recipe ingredient rows for `rice cake`, `rice cakes`, `tteok`, `tteokbokki`, `garaetteok`, `niangao`, or `gâteau de riz`. No recipe link, form, measure, conversion, yield, or substitution is currently needed. |

## Product identity, terminology, and boundaries

Korean food and product sources support a specific tubular rice-cake product used for tteokbokki. The Korean Tourism Organization's VISITKOREA describes tteokbokki as stir-fried rice-cake sticks. Maangchi's ingredient reference calls the tube-shaped Korean rice cake *garaetteok* and describes it as short-grain-rice-flour dough pressed into cylinders. A Montréal Korean grocer sells Jongga products under separate “Rice Cake Tubular Type” and “Rice Cake Sliced Type” listings; the same listing set also identifies a wheat-flour cake product separately. These sources support the proposed narrow product boundary, not a universal recipe for all Korean rice cakes.

The most specific Québec French evidence is a product listing from Montréal retailer SUE FOODS titled `Gâteau de riz pour tteobokki`, in a 500 g package. The retrieved page copy marks it “Bientôt disponible,” so this supports local wording but does not establish current stock, ingredient composition, or the package's exact shape. It also spells the dish name `tteobokki`, which this review cannot resolve as an intended spelling or a product-page error. A French T&T Supermarket (Brossard) listing is indexed as `bâtonnets de gâteau de riz - rice cake sticks - 900 g`, but the fetched menu page confirms the merchant and address without returning that specific line; it also does not identify the item as Korean tteok. OQLF's entry for `gâteau de riz` gives the English equivalent “rice pudding”; that authority entry does not cover Korean tteok. Consequently, neither the base French term nor the retailer spelling is safe as a global alias without a Québec terminology decision.

| Term or boundary | Disposition | Evidence and limit |
| --- | --- | --- |
| Candidate English wording | `Korean tteokbokki rice-cake sticks` (candidate wording only) | Korean government tourism and food-specialist sources attest rice-cake sticks, tube-shaped rice cake, and their tteokbokki use. This descriptive combination is not activated as a catalog display while the bilingual record is on hold. |
| French Québec wording | Hold. Record the product-attested title only as evidence: `Gâteau de riz pour tteobokki`. | The Montréal retailer's product title is exact local evidence but its retrieved copy shows unavailable status and spells `tteobokki`. The Brossard listing attests `bâtonnets de gâteau de riz` for rice-cake sticks but does not identify Korean tteok. OQLF's separate `gâteau de riz` entry means rice pudding. Do not drop the qualifier, silently correct the spelling, or invent another French label. |
| Candidate scope | Plain, unseasoned rice-cake sticks/tubes marketed for tteokbokki | Keep distinct from sauce kits or prepared dishes, even when those packages also contain rice cakes. Keep wheat-flour tteok products out of this rice-based candidate. Product formulas still require an ingredient-label check before any composition claim. |
| `tteok` | Do not use as a global alias for this candidate | It is the broader Korean word for rice cake, not a precise stick-format term. It can lead to sweet, filled, pounded, steamed, or other prepared cakes. |
| `garaetteok` | Do not activate as an alias yet | Maangchi uses it for tube-shaped rice cake and explains that the cylinder can be cut into discs for soup. It may be a useful Korean term, but this review does not establish whether every retail tteokbokki stick maps to that name. Preserve the source term in research only. |
| `tteokbokki` / `topokki` | Do not use alone as an ingredient alias | These name the prepared Korean dish or its product category; retail pages also use them for seasoned cup or pouch meals. |
| `rice cake`, `rice cakes`, `gâteau de riz`, `galettes de riz` | No global aliases | These broad terms conflate multiple regional products and have local search/meaning collisions. OQLF uses `gâteau de riz` for rice pudding. The wrapper reference already owns qualified French *galettes de riz pour rouleaux de printemps*; do not shorten that alias. |
| Oval soup slices | Keep out of this candidate | Montréal retail lists sliced rice cake separately from tubular rice cake. Maangchi describes cutting cooled cylinder dough into discs for soup; that recipe process does not authorize treating pre-sliced packaged rice cake as the same search identity or as a universal interchangeable form. |
| Chinese niangao | Keep separate and unresolved | The Wuxi municipal source describes a regional New Year cake made with glutinous rice flour, steamed and typically rectangular. That example is not a universal definition of niangao, but demonstrates why the generic English/French “rice cake” terms must not merge the Chinese and Korean product families. |
| Sweet, filled, coated, or pounded tteok | Exclude | They are different product types and are not covered by the plain tteokbokki-stick product evidence. |

## Forms, quantities, recipes, and substitutions

| Data area | Disposition |
| --- | --- |
| Forms | Add none while the identity is on hold. Commercial sticks can be chilled or frozen, and Maangchi also describes fresh or frozen product; the current recipe corpus requests neither state. Do not add generic rice's dry/cooked forms. |
| Density and unit mappings | Leave unset. Retail package sizes such as 500 g and 1 kg are net package weights, not grams-per-cup or volume-density observations. |
| Measures and conversions | Add none. The homemade Maangchi recipe measures rice flour, water, salt, and oil to make dough; it does not establish a commercial rice-cake-stick volume-to-mass conversion or a rice-flour-to-cake conversion. |
| Yields | Add no yield relation. A recipe made from flour and water cannot be used to infer a standard cooked yield for packaged tteok. The listed package weights are not a preparation yield. |
| Substitutions | Add no global or contextual rule. The evidence does not establish safe or equivalent substitution with generic rice, glutinous rice, rice flour, rice vermicelli, wheat-based tteok, oval soup slices, mochi, or niangao. |
| Bundled recipe links | Add none. The complete package has zero matching ingredient rows, so no line needs relinking or a quantity change. |

## Source register

Sources were checked on 2026-10-11 unless a source page gives a publication/update date.

| Ref | Source | Use and limits |
| --- | --- | --- |
| S01 | [Korea Tourism Organization, VISITKOREA — Tteokbokki](https://english.visitkorea.or.kr/svc/sp/food/ext/special_view.do?menuSn=913&page=1&sort=regDt&vcontsId=178955) | Korean government tourism page describes tteokbokki as stir-fried thin rice-cake sticks with vegetables and chili paste. Supports dish/product context; it does not define commercial ingredient labels or measurements. |
| S02 | [Maangchi — Tube-shaped rice cake (Garaetteok)](https://www.maangchi.com/ingredient/garaetteok-rice-cake) | Korean-cooking specialist identifies the product as tube-shaped rice cake, gives the Korean name *garaetteok*, and describes short-grain-rice-flour dough pressed into cylinders. Updated 2025-05-31. Expert culinary usage, not a Québec terminology authority. |
| S03 | [Maangchi — Garaetteok recipe](https://www.maangchi.com/recipe/garaetteok) | Recipe describes forming cylinder-shaped rice cakes for tteokbokki and chilling the dough before cutting it into discs for soup. Updated 2026-04-26. Homemade recipe quantities are not commercial package measurements or yields. |
| S04 | [Marché Korea, Montréal — Jongga Rice Cake Tubular Type 500 g](https://marchekorea.com/shop/jongga-rice-cake-tubular-type-%EC%88%9C%EC%8C%80-%EB%96%A1%EB%B3%B6%EC%9D%B4%EB%96%A1-500g/) and [1 kg](https://marchekorea.com/shop/jongga-rice-cake-tubular-type-%EC%88%9C%EC%8C%80-%EB%96%A1%EB%B3%B6%EC%9D%B4%EB%96%A1-1kg/) | Local Korean grocer lists a tubular type at 500 g and 1 kg. Its rice-cake category also lists sliced type and wheat-flour cake as separate products; store locations are in Montréal. The pages do not expose an ingredient panel, so do not infer exact composition from the title alone. |
| S05 | [SUE FOODS, Montréal — Gâteau de riz pour tteobokki](https://suefoods.com/products/hansang-gateau-de-riz-tteoboki) | Exact French local product title and 500 g package wording. Page displayed “Bientôt disponible” when checked and gives no useful shape or ingredient details. The spelling `tteobokki` is preserved as source wording only; do not turn it into an alias or assume it is an approved standard. |
| S06 | [SUE FOODS — À propos](https://suefoods.com/pages/a-propos-de-nous) and [store locations](https://suefoods.com/) | Seller describes its grocery business and lists Montréal-area stores, establishing that S05 is Québec retailer evidence. Store listings do not establish current stock of the specific rice cake. |
| S07 | [OQLF, Grand dictionnaire terminologique — gâteau de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298252/gateau-de-riz) | OQLF's entry gives `rice pudding` as the English equivalent of the unqualified French phrase. It is a homonym/collision warning; it is not a definition of Korean tteok. |
| S08 | [Wuxi Municipal People's Government — Hongshan rice cake, a Wuxi Spring Festival tradition](https://en.wuxi.gov.cn/2021-02/02/c_587514.htm) | Government source identifies *nian gao* and describes one Wuxi regional cake as a steamed, rectangular glutinous-rice-flour product. This is one regional example, not a universal definition of Chinese niangao. |
| S09 | [T&T Supermarket (Brossard BR), French Uber Eats menu](https://www.ubereats.com/fr/store/t%26t-supermarket-brossard-br/WH848O5BV_iVuUJb0U3qGw?diningMode=DELIVERY) | Search-indexed item wording is `T&t bâtonnets de gâteau de riz - rice cake sticks - 900 g`; the opened page confirms the merchant at 9750 Boulevard Leduc, Brossard, Québec, but did not expose this item row in the fetched page. It supports Québec French market wording, not Korean identity, composition, or current item availability. |

## Decision

**Hold catalog integration pending a Québec French terminology review.** The narrow product itself is supported by Korean culinary evidence and direct Montréal retail listings, and the package/recipe audit shows that it is currently missing from the catalog. The available Québec French retail wording is relevant but is only one out-of-stock product title, spells `tteobokki`, and contains the OQLF-defined phrase `gâteau de riz` that otherwise means rice pudding. Record the candidate as plain tubular Korean rice-cake sticks for tteokbokki, keep all aliased and numerical data empty, and ask the terminology review to decide whether the exact local title is acceptable for display before the identity enters the active catalog. Do not merge it with all `tteok`, oval soup slices, niangao, wheat-based tteok, or seasoned tteokbokki kits.

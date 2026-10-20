# WP03 Section F: Shanghai-style rice-cake slices

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** proposal packet. Its hold recommendation was recorded in the canonical research ledger and Section F plan during the 2026-10-11 integration; see the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md). No active reference, form, recipe link, or numeric behavior was added for this candidate.
- **Checklist scope:** one specific Chinese regional prepared-starch product under the open Section F rice-cake item: plain Shanghai-style rice-cake slices sold for cooking.
- **Recommendation:** **hold active catalog integration pending Québec French naming review.** The product identity and English market wording are well supported. Québec French sources use *galettes de riz* in prepared-dish names, but no reviewed local source gives an exact French ingredient label for the plain packaged slices. Do not invent one or activate a broad rice-cake alias.

## Open item and prior coverage

The active plan leaves “Rice cakes, Korean tteok, Chinese niangao, and comparable regional prepared starches” open at [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L1857). The focused [Korean tteokbokki-stick review](wp03-section-f-korean-tteokbokki-rice-cake-sticks-review-20261011.md) covers plain tubular Korean rice cakes and explicitly leaves Chinese niangao unresolved. No existing proposal makes a focused decision on Shanghai-style slices. This packet covers only the plain, thin, oval, non-glutinous Shanghai product sold fresh or frozen for cooking; it does not review all Chinese niangao or other Asian rice cakes.

## Live package and exact-key audit

The audit read the current split seed package, all manifest-listed recipes, the research ledger, legacy candidates, Section F plan/checklist, and the existing proposal set. Candidate wording was checked with the repository's `normalize_search_key` behavior across active reference names and aliases, form labels and match terms, ledger records and unit conversions, legacy candidates, and recipe ingredient rows.

| Live surface | Current result |
| --- | --- |
| Active ingredient references | 910 references. There is no exact normalized reference or alias for `Shanghai rice cake slices`, `Shanghai rice cake slice`, `Chinese rice cake slices`, `niangao`, `nian gao`, `gâteau de riz de Shanghai`, or `galettes de riz Shanghai`; the proposed ID `ingredient-ref-shanghai-rice-cake-slices` is unused. |
| Nearby rice identities | The catalog separately contains generic rice and glutinous rice; rice and glutinous-rice flours; rice vermicelli; rice-paper sheets; crispy rice cereal; puffed rice; flattened rice (poha); named rice varieties; and a wild-rice blend. None is a prepared Shanghai-style slice. The French rice-paper wrapper row owns the qualified alias `galettes de riz pour rouleaux de printemps`; do not shorten it or reuse bare `galettes de riz`. |
| Ingredient forms | 48 forms. No form or match term refers to Shanghai rice cakes, niangao, or rice-cake slices. Generic rice has dry and cooked forms; poha has thin, medium, and thick commercial flakes. These describe different products and must not be copied to this candidate. |
| Research ledger | 1,165 records and 8 unit-conversion entries. No exact candidate wording, proposed ID, or Shanghai-slice identity decision was found. |
| Legacy candidates | 77 candidates; no exact Shanghai-slice or niangao candidate. |
| Bundled recipe demand | 114 recipes and 1,123 ingredient rows. **Zero** ingredient rows match the candidate or broader `rice cake`, `rice cakes`, `niangao`, `nian gao`, `年糕`, `gâteau de riz`, or `galettes de riz` terms. No recipe link or quantity change is indicated. |

Exact normalized-key matches are absent; broader searches remain noisy. `rice` / `riz` can return many separate rice references, and unqualified `galettes de riz` is close to the existing wrapper alias. The English phrase `rice cake` also spans distinct regional products. Do not create aliases from these broad terms.

## Product identity and terminology

The Shanghai Municipal Government Information Office describes two uses of *niangao*: many traditional festival cakes made with glutinous rice flour, and the thin, oval, less-sticky slices used in Shanghai stir-fries or soups, made from non-glutinous rice. This is a useful regional identity boundary, not a universal definition of every product marketed as Chinese rice cake. A current Montréal wholesale listing sells `Tastie Frozen ShangHai Rice Cake slice` and lists Korean rice-cake sticks separately. Walmart Canada's Tastie listing independently labels the product Shanghai style, Chinese, and frozen; it lists rice and water as ingredients, says the product is from China, and includes a possible sodium-metabisulfite statement. Walmart marks the item out of stock and cautions that supplier-provided product information is not separately verified.

Québec French market wording is less exact. The Montréal restaurant Sangji lists `Galettes de riz au bouillon de poisson / Rice cake in fish broth` alongside its Chinese dish name, and separately lists Shanghai-style pork chop with homemade rice cake. Those phrases name prepared dishes, not the plain packaged ingredient. OQLF's entry for unqualified *gâteau de riz* gives the English equivalent *rice pudding*, so that phrase is a collision warning rather than a safe French name for this product. The reviewed sources do not establish a Québec French canonical display for Shanghai-style rice-cake slices.

| Term or boundary | Disposition | Evidence and limit |
| --- | --- | --- |
| Candidate English wording | `Shanghai-style rice-cake slices` (research wording only) | Montréal supplier wording is `Tastie Frozen ShangHai Rice Cake slice`; the Shanghai municipal source describes the thin oval slice type. No active catalog display is proposed while French naming is unresolved. |
| Québec French wording | Hold. Record `Galettes de riz au bouillon de poisson` only as the exact local wording of a prepared soup item. | The Montréal menu does not name the plain ingredient in a product listing. Do not turn this dish title into a French display, or invent `galettes de riz à la Shanghai`, `tranches de gâteau de riz de Shanghai`, or another unverified compound. |
| `gâteau de riz` | Do not use alone as a display or alias. | OQLF defines the unqualified phrase as a dessert equivalent to rice pudding. The source does not cover Shanghai slices. |
| Candidate scope | Plain thin oval Shanghai-style slices made from non-glutinous rice and sold for cooking | The municipal source supports the regional product description. The Tastie retail listing supports one frozen SKU with rice and water, but does not establish that all Shanghai-style slices share this exact ingredient panel. |
| Chinese `niangao` / `nian gao` | Keep as a source term, not a global alias. | The same name covers products with differing regional ingredients and shapes; the Shanghai municipal source specifically distinguishes non-glutinous Shanghai slices from glutinous festival cakes. |
| Korean tteok / tteokbokki sticks | Keep separate. | The Montréal wholesaler lists Korean sticks separately from Shanghai slices; the earlier proposal is limited to tubular Korean sticks. Do not merge tubular products, oval slices, soup cakes, or seasoned meals. |
| `rice cake(s)`, `galettes de riz`, `rice paper`, `mochi`, rice crackers, puffed rice, poha | Do not add as aliases or substitutions. | These include broad or different products. The catalog already uses qualified `galettes de riz` wording for rice-paper wrappers; puffed rice, poha, and rice crackers are distinct products. |

## Forms, quantities, recipes, and substitutions

| Data area | Disposition |
| --- | --- |
| Forms | Add none. “Frozen” is the storage condition of one commercial listing; it does not establish a general ingredient form or a recipe need. Do not attach generic rice dry/cooked forms. |
| Density and unit mappings | Leave unset. The supplier's `1 kg × 10 bags/case` is a package/case listing, not a mass-per-volume measurement. No density or unit mapping is supported. |
| Measures and conversions | Add none. The reviewed evidence provides no cup measure or volume-to-mass conversion for these slices. Do not convert the package size into a recipe measure. |
| Yields | Add no cooking-yield relation. The sources do not establish a general raw-to-cooked yield, and the bundled recipes request no such state. |
| Substitutions | Add no global or contextual rule for replacing glutinous rice, glutinous-rice cakes, Korean sticks, rice vermicelli, rice paper, mochi, or another rice-cake product. The evidence does not establish equivalence, and no bundled recipe requests a substitution. |
| Bundled recipe links | Add none. There are zero matching ingredient rows, so no recipe link or quantity requires correction. |

## Source register

Sources were checked on 2026-10-11 unless the page lists its own publication/update date.

| Ref | Source | Use and limits |
| --- | --- | --- |
| S01 | [Shanghai Municipal Government Information Office — Sticky rice dishes are traditional festival fare](https://touch.shio.gov.cn/jsp/jrsh_detail.jsp?id=2593) | Published 2016-12-23. It says Shanghai cuisine's thin, oval, less-sticky slices used in stir-fries or soups are non-glutinous-rice products, distinct from many glutinous-rice-flour festival cakes also called *niangao*. Authoritative regional food description; it does not provide a Québec French term or current package label. |
| S02 | [Lordford, Montréal — Frozen Noodles product listings](https://lordford.ca/product-category/frozen-food/frozen-noodles/) | The Montréal supplier's current listing gives `Tastie Frozen ShangHai Rice Cake slice 1kgx10bags/case` and separately `Tastie Frozen Korean Rice Cake sticks 1kgx10bags/case`. Supports local wholesale product wording, format distinction, and package SKU only; the page is English and supplies no ingredient panel or French product display. |
| S03 | [Walmart Canada — Tastie Shanghai Rice Cake](https://www.walmart.ca/en/ip/Tastie-Shanghai-Rice-Cake/6000196535610) | Retail listing identifies a frozen, Shanghai-style Chinese product of China, lists rice and water, and says it may contain sodium metabisulfite. It was marked out of stock when checked. The image alt text says the package is labeled in English and French but does not transcribe the French label; Walmart notes product data comes from suppliers and is not separately verified. |
| S04 | [Sangji, Montréal — Uber Eats menu](https://www.ubereats.com/ca/store/sangji/gU_YqtMGQICtY6p0RSN-2A) | The page identifies Sangji at 1211 Rue Bishop, Montréal, and lists `Galettes de riz au bouillon de poisson / Rice cake in fish broth` with the Chinese dish name 雪菜魚片年糕湯, plus a Shanghainese-style pork chop dish with homemade rice cake. Local Québec French prepared-dish wording only; it is not a package label or ingredient standard. |
| S05 | [OQLF, Grand dictionnaire terminologique — gâteau de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298252/gateau-de-riz) | The entry gives *rice pudding* as the English equivalent of unqualified *gâteau de riz*. It is a Québec French collision warning, not a definition of Chinese rice-cake slices. The entry dates to 1984. |

## Decision

**Hold active integration pending a Québec French naming decision for the plain packaged product.** The Shanghai-style slice identity is distinct from generic/glutinous New Year cakes and Korean tteokbokki sticks, and local wholesale/retail listings confirm the English product wording. The current Québec French evidence describes prepared dishes and does not establish a bilingual ingredient label. Keep `ingredient-ref-shanghai-rice-cake-slices` unallocated; add no French display, aliases, forms, recipe links, measurements, density, conversions, yield, or substitutions until direct French product evidence or an authoritative Québec term resolves the name.

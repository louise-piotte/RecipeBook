# WP02 A7 Hattai-ko / mugikogashi: identity and form adjudication

## Review record

- **Reviewed:** 2026-10-11.
- **Status:** proposal-only follow-up; no shared catalog, ledger, plan, checklist, roadmap, recipe, code, or test file was edited.
- **Scope:** the relationship between Hattai-ko and mugikogashi, whether either warrants a separate identity or form, and the remaining Québec/Canadian naming gap. This note does not repeat the earlier pulse-flour review; see the [2026-10-11 regional product review](wp02-hattai-ko-mugikogashi-product-and-quebec-name-review-20261011.md) and [2026-10-10 boundary review](wp02-hattai-ko-mugikogashi-boundary-review-20261010.md).

## Recommendation

**Hold activation of the unqualified regional names. Do not create separate Hattai-ko and mugikogashi identities or forms.** In the barley-specific meaning documented by Japan’s Ministry of Education, Culture, Sports, Science and Technology (MEXT), the names refer to one product: barley grain is roasted, then ground into flour. When a recipe or named product explicitly establishes barley, the existing catalog display `roasted barley flour / farine d'orge torréfiée` is the closest match. This review does not establish process or performance equivalence with the Québec mill’s functional roasted-barley flour product.

Do **not** add `Hattai-ko`, `hattaiko`, `mugikogashi`, `mugi-kogashi`, `kōsen` / `kosen`, `はったい粉`, `麦こがし`, or `香煎` as aliases. Maehara Seifun uses the Hattai-ko / mugikogashi name family for a regional product whose cereal can vary, including corn or millet in some areas. Its exact 120 g product is explicitly 100% domestic barley, but that SKU does not make the broad regional names safe global search keys. No separate Japanese-specific display is justified.

## Live catalog and recipe audit

The ledger has one open record, `candidate-hattai-ko-mugikogashi`, with `identityState: needs_clarification`; measurement and substitution research are not yet done. The active seed already has `ingredient-ref-roasted-barley-flour`, displayed as `roasted barley flour / farine d'orge torréfiée`, with English alias `toasted barley flour`, no French aliases, density, or unit mappings. There is no active Hattai-ko or mugikogashi row.

A focused scan of the 114 bundled recipe files found no matches for Hattai-ko, mugikogashi, their Japanese spellings, roasted/toasted barley flour, or the existing French display. There is no current recipe demand for either name, quantity data, or a substitution rule.

## Identity boundary

| Context | Identity/form finding | Catalog disposition |
| --- | --- | --- |
| MEXT’s barley-specific `麦こがし` product, also named `こうせん` or `はったい粉` | One roasted-barley-flour product: barley kernels are roasted and ground. The different names do not describe separate forms. | If an exact recipe or product source confirms barley, resolve to the existing roasted-barley-flour display. No new ID or form. |
| Broader regional Hattai-ko family | Grain inputs may differ by region; Maehara’s overview includes barley, naked barley, corn, or millet. The product family cannot be treated as one barley identity without context. | Keep all unqualified regional names inactive as aliases. Require a source that identifies the grain. |
| Québec mill’s roasted barley flour | The Québec manufacturer names a roasted-barley-flour product and heat-treatment process, but its public page does not establish the same grain-roast-then-mill sequence or culinary use as the Japanese product. | Keep the existing general display; do not claim product-specific process equivalence. |

The present evidence therefore supports **one identity under the barley-qualified standard meaning**, not two Japanese identities and not a separate form. The broader unqualified name family remains unresolved because it can refer to different grains. `Kinako` remains a separate roasted-soy-flour product; use in the same dish is not identity evidence.

## Québec and Canadian French disposition

The existing French display `farine d'orge torréfiée` comes from Les Moulins de Soulanges’ Québec product page, with adjective agreement corrected from the manufacturer's heading. OQLF supports the base French term `farine d'orge` for English `barley flour`; neither source names Hattai-ko or mugikogashi specifically. Targeted searches found no Québec/Canadian French package, retailer, or terminology-authority entry for the Japanese names.

Use `roasted barley flour / farine d'orge torréfiée` only when the grain is established as barley. Do not introduce a literal or invented French name for an unqualified Hattai-ko product. The remaining gap is a Québec or Canadian bilingual product label for the exact barley-only Japanese product, or an independent Québec French review that explicitly approves mapping that product to the existing French display. The Québec mill would also need to state enough process detail to support product-level equivalence if such equivalence is needed.

## Measurement and substitution limits

This is an identity-only recommendation. Do not transfer MEXT food-composition values into the catalog. The product pages provide no transferable flour density, volume mapping, recipe yield, or substitution rule. Keep measurement and substitution states open.

## Sources

Sources were checked on 2026-10-11. The IDs are local to this proposal and have not been added to the shared ledger.

| Source ID | Source and finding | Limit |
| --- | --- | --- |
| `WP02-A7-HM-IDENTITY-FORM-20261011-S01` | MEXT, [Standard Tables of Food Composition in Japan 2020, 8th edition](https://www.mext.go.jp/content/20201225-mxt_kagsei-mext_01110_011.pdf), barley entry 01010; see also the current [MEXT Food Composition Database item 01010](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01010_7). MEXT says `麦こがし` is also called `こうせん` or `はったい粉`, and is made by roasting barley kernels and grinding them into flour. The database labels it `CEREALS/Barley/roasted flour` and gives *Hordeum vulgare*. | Primary national food-composition identity and process description; not a Canadian name approval or full regional product standard. No composition or nutrition values are imported. |
| `WP02-A7-HM-IDENTITY-FORM-20261011-S02` | Maehara Seifun, [Hattai-ko product overview](https://gishi.co.jp/home/item.asp?ct=28), Japanese text. It describes regional barley and naked-barley inputs, with corn or millet in some places, and roasting/grinding the material. | Primary producer account of regional product variation. The English machine-rendered grain wording is not used to identify the cereal. |
| `WP02-A7-HM-IDENTITY-FORM-20261011-S03` | Maehara Seifun, current [120 g Hattai-ko / mugikogashi product](https://shop.gishi.co.jp/products/hattaiko-120g), headed `はったい粉(麦こがし) 120g 国内産大麦100％`; description identifies domestic barley flour and slow roasting. | Confirms that one exact SKU is barley-only; does not resolve all regional Hattai-ko products or provide Canadian French wording. |
| `WP02-A7-HM-IDENTITY-FORM-20261011-S04` | Kawamitsu Bussan, [麦こがし products](https://www.kawamitsu.co.jp/product/list06/). Under one mugikogashi product section, the maker lists a domestic-barley item and a Hattai-ko item made with domestic naked barley, using `はったい粉`, `香煎`, and `麦焦がし` in its product description. | Independent producer corroboration that the names overlap within barley products; no Québec or Canadian label and no universal regional standard. |
| `WP02-A7-HM-IDENTITY-FORM-20261011-S05` | Japan Ministry of Agriculture, Forestry and Fisheries, [Yaseuma, Oita regional cuisine](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/6819/index.html). In this recipe context, it identifies Hattai-ko / mugikogashi as roasted barley flour used instead of kinako. | Official regional recipe context; not a universal definition or substitution rule. |
| `WP02-A7-HM-IDENTITY-FORM-20261011-S06` | Les Moulins de Soulanges, Québec producer, [English Roasted Barley Flour](https://moulinsdesoulanges.com/language/en/roasted-barley-flour/) and [French Farine d'Orge Torréfié](https://moulinsdesoulanges.com/language/fr/farine-dorge-torrefie/) pages. | Supports the existing product-specific English/French display. It does not link its product to Japanese names or make the roasting sequence explicit enough to establish equivalence. |
| `WP02-A7-HM-IDENTITY-FORM-20261011-S07` | OQLF, [farine d'orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge), GDT entry. | Supports the base French / English pair `farine d'orge / barley flour`, not a roasted Japanese product name. |

## Integration boundary

No catalog or ledger change is proposed. Keep `candidate-hattai-ko-mugikogashi` unresolved, retain the existing roasted-barley-flour reference as-is, and do not add aliases, forms, recipe links, numeric data, or substitutions. Revisit only when a source identifies the cereal for an exact product or recipe and Québec/Canadian French evidence settles the product display.

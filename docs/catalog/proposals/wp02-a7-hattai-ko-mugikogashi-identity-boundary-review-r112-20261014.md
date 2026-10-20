# WP02 A7 — Hattai-ko / Mugikogashi Identity Boundary Review (R112)

## Review record

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as a documentation-only boundary decision; the unqualified names remain inactive and no catalog or ledger data changed. See the [R112 batch README](../batches/wp02-a7-hattai-ko-mugikogashi-boundary-review-integration-20261014/README.md).
- **Scope:** decide whether Japanese Hattai-ko / mugikogashi should be an ingredient identity, an alias of roasted barley flour, a grain form, or remain unresolved at the global picker boundary. This review does not reopen the pulse-flour decisions in the earlier [regional product review](wp02-hattai-ko-mugikogashi-product-and-quebec-name-review-20261011.md) or [identity/form adjudication](wp02-a7-hattai-mugikogashi-identity-form-adjudication-20261011.md).

## Recommendation

Keep the unqualified romanized names **Hattai-ko / hattaiko** and **mugikogashi / mugi-kogashi** off the active roasted-barley-flour row. The source evidence supports one barley-specific product class: roasted barley grain milled into flour. In that exact, source-confirmed barley meaning, Hattai-ko, mugikogashi, and kōsen are names for the existing **roasted barley flour** identity; they do not describe separate identities or a cooking form. A recipe or package that explicitly establishes barley can be resolved to the existing `ingredient-ref-roasted-barley-flour` row.

The names are not safe unconditional picker aliases. Maehara Seifun documents regional Hattai-ko products made from barley, naked barley, and in some places corn or millet; its page groups the name family while describing those different grain inputs. The official Japanese barley entry and several current barley-only products confirm the barley-specific use, but do not erase the broader regional use. Québec sources support the base term `farine d'orge` and the existing product display `farine d'orge torréfiée`; none reviewed names Hattai-ko or mugikogashi as a Québec/Canadian French product. Keep the regional names unresolved globally until a recipe or bilingual product supplies both a grain boundary and a locally supported display.

Do not create a separate Japanese-origin row or a dry/cooked form. Do not transfer nutritional values, package weights, densities, unit mappings, recipe yields, conversions, or substitutions.

## Identity and form finding

| Evidence context | Classification | Catalog consequence |
| --- | --- | --- |
| MEXT item 01010, `麦こがし`, under barley; current English name “CEREALS/Barley/roasted flour,” scientific name *Hordeum vulgare*. MEXT's 2020 notes and Japanese manufacturers identify Hattai-ko / kōsen as names for the barley-roasted flour product and describe roasting grain before milling. | One barley-roasted-flour identity with source-context synonyms. Roasting followed by milling defines the product; it is not a state form attached to whole barley. | For an exact barley-qualified source, use the existing roasted-barley-flour identity. No second reference is warranted. |
| Maehara's regional overview; exact barley-only products from Maehara, Maeda, and Kawamitsu. Maeda states that its product is 100% domestic naked barley, roasted and milled, and also called mugikogashi; Kawamitsu lists mugikogashi and Hattai-ko products made from domestic barley/naked barley. | Confirms multiple barley-specific instances and the alias relationship in those product contexts. NARO classifies naked barley as a barley type; Maehara's English rendering of 裸麦 as “rye” is not used. | Exact barley product evidence may resolve a recipe to the existing row, but does not justify global aliases for every unqualified regional use. |
| Maehara's description of regional inputs, including corn and millet, alongside barley and naked barley. | The broader regional name family does not have a stable global grain identity. | Keep unqualified Hattai-ko / mugikogashi inactive as aliases. Do not route a corn- or millet-based product to barley. |
| Québec OQLF entry and Les Moulins de Soulanges product pages. | OQLF supports `farine d'orge` / `barley flour`. The Québec mill uses `farine d'orge torréfiée` for its own functional, heat-treated flour; the public description does not specify the treatment sequence or connect the product to Japanese flour. | Retain the active French display for barley-qualified roasted flour. Do not present it as a Québec-approved translation of the Japanese regional names or claim identical process/performance. |

This separates three decisions that should not be collapsed: the MEXT-defined barley item is the same broad ingredient identity as roasted barley flour; a particular regional Hattai-ko product can have a different grain; and the Québec mill's named functional flour has its own product/process boundary.

## Active catalog, picker, and recipe boundary

The current reference file has separate rows for generic barley flour (`farine d'orge`), roasted barley flour (`farine d'orge torréfiée`), malted barley flour, whole barley flour, and roasted barley malt flour. The roasted-barley row still has only `toasted barley flour` as its English alias, with no French aliases, density, or unit mappings. There are no forms attached to `ingredient-ref-roasted-barley-flour`; the barley dry/cooked forms belong to pearl barley, a different grain reference.

Read-only matching against the current reference/form data found no picker row for `Hattai-ko`, `hattaiko`, `mugikogashi`, `mugi-kogashi`, `kōsen`, or `kosen`. The picker search index matches reference names/aliases and attached form labels/match terms without source- or region-specific conditions ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Therefore, adding these as ordinary aliases would make a global assignment that the evidence does not support. Japanese kana/kanji input such as `はったい粉` currently normalizes to an empty search key and returns the unfiltered reference set; it is not an exact no-result search and does not supply Japanese-script picker support.

The current manifest lists 114 bundled recipes with 1,123 ingredient rows. A focused search of all manifest-listed ingredient rows found no matches for the Latin spellings, Japanese spellings, or the active roasted-barley English/French names. No recipe link is eligible on current demand.

The ledger still has `candidate-hattai-ko-mugikogashi` as `needs_clarification`; its measurement and substitution research states are `not_yet_researched`. That remains appropriate for the unresolved global name. This review does not update the shared ledger.

## Numeric-data transfer

No numeric behavior is proposed. MEXT's composition table reports food-composition values by mass, not household volume-to-mass mappings. The Japanese maker pages' `120 g`, `150 g`, and `180 g` figures are retail package quantities, not recipe portions or density observations. No source supplies a transferable flour density, cup mass, yield, conversion, or substitution rule. Keep all such fields inactive.

## Sources checked

Sources were opened or search-verified on 2026-10-14. The MEXT 2020 PDF was indexed with the relevant Japanese barley note, but a direct fetch timed out in the web research tool during this review; its claim is cross-checked against the current MEXT database item and accessible manufacturer pages. Maehara's Japanese text is used where its English rendering mistranslates naked barley as rye.

| ID | Source and evidence used | Limit |
| --- | --- | --- |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S01` | MEXT, [Standard Tables of Food Composition in Japan 2020, 8th edition](https://gkz781swok1ivzu2.www.mext.go.jp/content/20201225-mxt_kagsei-mext_01110_011.pdf), barley note for item 01010. The indexed Japanese text says mugikogashi, also called kōsen or Hattai-ko, is flour made by roasting barley whole grain and milling it. | National food-composition description, not a Canadian label standard or definition of all regional products. Direct fetch timed out in the review tool. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S02` | MEXT, [Food Composition Database, item 01010](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01010_7). Classifies `麦こがし` under barley; gives “CEREALS/Barley/roasted flour” and *Hordeum vulgare*. | Used for identity/classification only. Do not transfer the database's nutrient values. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S03` | Maehara Seifun, [Hattai-ko product information](https://gishi.co.jp/home/item.asp?ct=28), Japanese description. Regional inputs include barley, naked barley, and sometimes corn or millet; material is roasted and ground. | Documents regional name/input variation; it does not give Québec/Canadian labeling for the variants. Its English rendering of naked barley as “rye” is not relied on. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S04` | Maehara Seifun, [Hattai-ko / mugikogashi, 100% domestic barley, 120 g](https://shop.gishi.co.jp/products/hattaiko-120g). Exact SKU identifies domestic barley flour and slow roasting. | A product-specific barley example, not a global definition of the regional names. Package mass is not a cooking measure. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S05` | Maeda, [Hattai-ko 180 g](https://an-maeda.co.jp/products/hattaiko). Current product page states 100% domestic naked barley, roasting and milling, and `mugikogashi` as another name. | Manufacturer-specific barley product and name usage; no Canadian French display. Its nutrient statements are not imported. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S06` | Kawamitsu Bussan, [Mugikogashi products](https://www.kawamitsu.co.jp/product/list06/). Lists domestic barley and naked-barley products under mugikogashi / Hattai-ko naming. | Product naming and grain scope only. Package sizes are not volume conversions. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S07` | NARO, [High beta-glucan barley guide](https://www.naro.go.jp/publicity_report/publication/files/20180731nics_kind_pamph.pdf). Its classification diagram places naked barley under barley. | Used only to interpret the Japanese 裸麦 term; it does not establish Hattai-ko naming or flour behavior. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S08` | MAFF, [Yaseuma, Oita regional cuisine](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/6819/index.html). In this dish context, Hattai-ko / mugikogashi is identified as roasted barley flour used instead of kinako. | A source-qualified local food context, not a universal alias or substitution rule. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S09` | OQLF, [farine d'orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge), paired with English `barley flour`. | Supports the base Québec French term, not a Japanese name or roasted-flour term. |
| `WP02-A7-HATTAI-MUGIKOGASHI-R112-20261014-S10` | Les Moulins de Soulanges, [Ingrédients fonctionnels](https://moulinsdesoulanges.com/language/fr/ingredients-fonctionnels/). Names its functional product `Farine d'Orge Torréfié` and describes a developed thermal treatment. | Supports the existing product-specific Québec wording; does not establish a shared process or a translation for Hattai-ko/mugikogashi. |

Targeted searches of Québec/Canadian French terminology and retail sources found no product label for `Hattai-ko`, `mugikogashi`, or their Japanese spellings. This is a scoped search result, not proof that no such label exists.

## Integration boundary

No integration change is recommended. Keep `ingredient-ref-roasted-barley-flour` and its existing aliases/forms/numeric fields unchanged. Keep `candidate-hattai-ko-mugikogashi` unresolved for unqualified regional use; use the existing roasted-barley row only when the recipe or product source explicitly identifies barley. Revisit global aliasing only with evidence that a candidate name has a stable barley-only scope plus Québec/Canadian French display evidence.

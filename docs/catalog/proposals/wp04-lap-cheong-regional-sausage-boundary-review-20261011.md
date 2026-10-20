# WP04 Proposal: Lap Cheong / Chinese-Style Dried Sausage Boundary

**Review date:** 2026-10-11  
**Status:** Coordinator integration completed. The source-bounded candidate and unresolved identity decision are in the research ledger and plan. No active lap-cheong reference, alias, form, recipe link, measurement, or substitution was added. See `docs/catalog/batches/wp02-wp03-wp04-flour-jackfruit-lap-cheong-integration-20261011/README.md`.  
**Scope:** Review the open lap cheong item in WP04 Section O against bundled recipe demand, active references/forms, legacy candidates, the research ledger, and current Québec/Canadian terminology and product evidence.

The open checklist is in [plan Section O](../../RecipeBook-global-ingredient-catalog-plan.txt#L2259). The earlier [sausage-family demand review](wp04-section-o-sausage-family-gap-review-20261010.md) already found no lap cheong recipe demand and held regional sausage additions. The separate [chorizo, andouille, and kielbasa review](wp04-section-o-regional-sausage-product-review-20261010.md) covers those three families, not lap cheong. This packet resolves only the lap-cheong terminology and product-boundary question; it does not repeat either review’s decisions.

## Recommendation

**Keep lap cheong out of the active catalog for now.** The current bundled library has no recipe line or text mention for it, and no matching active reference, ingredient form, legacy candidate, or ledger record. The evidence does support a bounded candidate if a future recipe names the product explicitly:

| Field | Candidate guidance if exact demand appears | Boundary |
| --- | --- | --- |
| English display | `lap cheong (dried Chinese sausage)` | Use for a source-confirmed lap cheong line; the descriptor clarifies the product without making `Chinese sausage` a matching alias. |
| Québec French display | `saucisse chinoise séchée (lap cheong)` | Provisional descriptive wording built from OQLF’s preferred term `saucisse chinoise` plus the source-supported preparation qualifier. OQLF does not define lap cheong or certify this full compound. |
| Aliases | Keep the exact source wording. `lap cheung` is documented for one Vancouver manufacturer’s pork sausage and can be considered only for that product-specific line. | Do not add `Chinese sausage`, `Chinese-style sausage`, `saucisse chinoise`, `lap-mei`, `guan cheung`, `yun cheong`, or Vietnamese `lạp xưởng` as global aliases. |
| Identity/form behavior | Add no identity, form, measurement, conversion, package property, or substitution now. | If a future line says only `Chinese sausage`, resolve its cited product/source first. Do not infer whether it is dried, ready-to-eat, raw, cooked, or a liver style from the umbrella wording. |

The product family varies materially. The current South Australian smallgoods guidance treats “Dry Chinese Sausage, including Lap Cheong” as a dried, unfermented group intended to be eaten after cooking, but says there are numerous types and ingredients may include pork, pork fat, pig or poultry liver, rice wine, soy sauce, salt, rose water, and spices. It separately excludes other Chinese or Asian sausages that are not dried or not intended only for cooking. Its typical process observations are source-specific; they are not universal catalog properties. A Vancouver manufacturer likewise distinguishes its pork `lap cheung` sausage from its pork-and-liver `guan cheung` sausage. These are enough to reject an umbrella alias or cross-product merge, but not enough to encode a single formula or process for every product bearing a related name.

## Snapshot and demand audit

The audit read every manifest-listed recipe JSON and searched its string fields and ingredient rows for `lap cheong/cheung/chiong/chong/xuong`, `Chinese sausage`/`Chinese-style sausage`, `saucisse chinoise`, `saucisson chinois`, `Guan Cheung`, `Yun Cheong`, and `lạp xưởng` variants. It also searched the current reference, form, candidate, and ledger files.

| Artifact | Current snapshot | SHA-256 / result |
| --- | ---: | --- |
| [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files | 114 files; 1,123 ingredient rows | Zero lap-cheong/Chinese-sausage target-string matches in recipe text or ingredient rows. |
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 927 references | `e14ad6668bc34bd83f7e1fd3993ac023d5d748ff134fafd807583435d6850468`; no target match. |
| [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 51 forms | `a195a0f3b487d193be11cf5648b291f5b51f001ee21cd643af766655dbf28267`; no target match or sausage form. |
| [Legacy identity candidates](../legacy-import-identities.v1.json) | 76 candidates | `be5ff09fb522c8a36633dbaea66f57e44653c2840da88600f03f943e1bbd9fb0`; no target match. |
| [Research ledger](../research-ledger.v1.json) | 1,184 records | `56cb8e03300cb59696fbed1664d2c02bc2f3405ca92cd9014c178315ca1cee77`; no target match. |

The only meat-sausage ingredient row found by a separate generic sausage-word scan remains recipe `027#1`, `1 lb breakfast sausage`, linked to `ingredient-ref-breakfast-sausage`; it is unrelated to lap cheong and is covered by the earlier breakfast-sausage review. Recipe `102` uses sausage imagery for a chocolate log, not a meat ingredient. Recipes `005` and `093` carry the Chinese cuisine tag but have no Chinese-sausage ingredient demand. The active `ingredient-ref-merguez-sausage` is also unrelated and has no lap-cheong aliases.

The active reference and ledger counts are from the current worktree snapshot, which has since changed from the counts recorded in the two earlier sausage proposals. The hashes above identify the exact files reviewed for this packet.

## Terminology and product boundary

### Québec and Canadian terminology

OQLF’s GDT lists **`saucisse chinoise`** as the preferred French term and **`Chinese sausage`** / **`Chinese style sausage`** as its English terms. The record is in the food/charcuterie domain and was last updated in 1982; it provides terminology, not a lap-cheong definition, composition, or preparation state. That makes `saucisse chinoise` a well-supported component for a French display, but too broad to use alone as the identity or global alias for a dried lap cheong product.

The current CFIA Canadian Standards of Identity, Volume 7, includes general sausage classes and was last amended 2024-12-18. A direct text check finds no `lap cheong` entry. It therefore does not resolve a specific Canadian identity, composition, or bilingual name for this regional product; that absence is not a broader finding about all Canadian labelling law. CFIA’s general meat-label guidance also distinguishes ready-to-eat products from products that require cooking, which reinforces using the actual package/source wording rather than assigning one state to the whole family.

### Source-qualified product and process evidence

The 2025 third edition of *Guidelines for the Safe Manufacture of Smallgoods*, hosted by South Australia’s Department of Primary Industries and Regions and endorsed by state regulatory representatives, has a dedicated section titled “Dry Chinese Sausage, including Lap Cheong.” The guide says the examples are general, that there are many ways to make such products, and that it is a technical industry resource rather than a regulatory standard. In §8.10.2 it describes numerous dried, unfermented sausages intended to be eaten after cooking; ingredients vary and may include pork/fat or pig and poultry livers, along with rice wine, soy, salt, rose water, and spices. For its typical lap cheong process, it reports controlled drying at 45–50°C and 65–75% relative humidity, 30–35% moisture and 11–12% salt after initial drying, and 40–55% weight loss. The guide explicitly cautions that drying may not cook the sausage. These figures describe that guide’s typical process and must not become universal unit, shelf-stability, package, preservation, or ready-to-eat properties.

The Vancouver manufacturer Wing Wing identifies its pork Chinese sausage as **`lap cheung`** and its pork-and-liver product as **`guan cheung`**. The company’s history describes a Southern China recipe and controlled rooms that reproduce traditional drying. Its current page lists separate Canadian pork and pork/liver packages. The British Columbia government’s export catalogue also profiles the producer’s two products and separates Lap Cheung pork sausage from Guan Cheung pork-and-liver sausage. This is useful Canadian market evidence for the product names and one maker’s distinct formulations, not a generic definition of all Chinese sausages. Keep `guan cheung` distinct; it is not an alias for lap cheong.

Hong Kong’s Centre for Food Safety uses **Lap-mei** for a broader traditional preserved-meat category that includes preserved Chinese sausages, preserved pork, and preserved duck, and says curing formulations vary by meat and product type. That source supports keeping `lap-mei` out of the lap-cheong alias set; it does not define lap cheong as equivalent to the whole Lap-mei group.

## Integration boundary

1. Add no active reference or alias for lap cheong in this snapshot because no bundled recipe line requests it.
2. If a future exact line names `lap cheong`, consider the bilingual display candidates above and preserve any product qualifier present in that source. Treat `lap cheung` as a source-specific spelling unless a stronger terminology source establishes a broader equivalence.
3. Do not treat the generic OQLF terms `saucisse chinoise` / `Chinese sausage` as aliases for lap cheong. Do not merge pork, liver, poultry-liver, Lap-mei, fresh, dried, cooked, and ready-to-eat products based on the shared sausage label.
4. Add no form, recipe link, species/formula assertion, storage or package property, amount, density, conversion, yield, substitution, or cooking-safety conclusion. Keep Section O open, including its safety-equivalence rule.

## Sources

All online sources below were accessed **2026-10-11**.

| ID | Source | Evidence and limit |
| --- | --- | --- |
| **S01** | OQLF, [saucisse chinoise (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298988/saucisse-chinoise) | Food/charcuterie record, last updated 1982. Preferred French term `saucisse chinoise`; English `Chinese sausage` and `Chinese style sausage`. No lap-cheong definition or product-state evidence. |
| **S02** | CFIA, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) | Incorporated Canadian standard; last amended 2024-12-18. Contains general sausage classes; the current text has no `lap cheong` occurrence. This is a scope observation, not a complete legal labelling determination. |
| **S03** | CFIA, [Labelling requirements for meat and poultry products](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products) | Current general guidance, page modified 2026-06-17. Defines ready-to-eat and discusses cooking-required statements for relevant non-ready-to-eat meat products; it does not assign a state to lap cheong. |
| **S04** | South Australian Department of Primary Industries and Regions / Australian Meat Industry Council, [Guidelines for the Safe Manufacture of Smallgoods, 3rd ed. (2025-02-24)](https://pir.sa.gov.au/__data/assets/pdf_file/0003/487371/guidelines-safe-manufacture-smallgoods.pdf#page=211), §8.10.2, pp. 211–213 | Technical source-qualified definition, ingredient range, and typical drying process for “Dry Chinese Sausage, including Lap Cheong.” The guide says it is general industry guidance, not a regulatory standard; processes and products vary. |
| **S05** | Wing Wing Co. Ltd., [Products](https://www.wing-wing.com/products.php?lang=en), [About Us](https://www.wing-wing.com/aboutus.php?lang=en), and [History](https://www.wing-wing.com/history.php?lang=en) | Manufacturer’s own Vancouver product/name evidence: pork `lap cheung` versus pork-and-liver `guan cheung`; it describes its Southern China recipe and controlled drying rooms. One manufacturer’s portfolio, not a universal family definition. |
| **S06** | Government of British Columbia, [Wing Wing export catalogue profile](https://www2.gov.bc.ca/gov/content/export-catalogue/bc-agrifood-seafood-export-catalogue/meat-dairy-exporters/wing-wing) | Government export catalogue profile last updated 2021-11-24; corroborates separate Lap Cheung pork and Guan Cheung pork/liver products and describes the company’s drying process. Use as a local product example, not a standard. |
| **S07** | Hong Kong Centre for Food Safety, [Meat Curing in Chinese Cuisine: A Risk Assessment on Lap-mei](https://www.cfs.gov.hk/english/programme/programme_rafs/programme_rafs_fa_01_03_report.html) | Government risk-assessment report. Describes Lap-mei as including preserved Chinese sausage, preserved pork, and preserved duck, with curing inputs/process varying by product. It is a broader category, not a lap-cheong synonym. |

## Local evidence links

- [Section O plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2259)
- [Prior sausage-family review](wp04-section-o-sausage-family-gap-review-20261010.md)
- [Prior regional sausage product review](wp04-section-o-regional-sausage-product-review-20261010.md)
- [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Research ledger](../research-ledger.v1.json)

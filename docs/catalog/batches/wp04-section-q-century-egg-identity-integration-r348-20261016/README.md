# WP04 Section Q R348 — century egg identity integration

Integrated on 2026-10-16 as a standalone `EGG` identity:

- `ingredient-ref-century-egg`: `century egg / œuf de cent ans`.
- English search aliases include `pidan`, `preserved egg(s)`, `preserved duck egg(s)`, `hundred-year egg(s)`, `thousand-year-old egg(s)`, and `alkaline egg(s)`.
- French aliases: `œufs de cent ans` and `pidàn`.
- Density remains null; unit mappings and forms remain empty.

The identity represents the recognizable alkaline-preserved finished product across duck, chicken, and quail egg inputs. It is separate from raw species identities and from salted duck egg, salted duck-egg yolk, balut, tea egg, and egg substitutes. `preserved duck egg` is retained as a product-attested search phrase, so the existing `duck egg` query intentionally returns two rows. This is visible as two labeled picker choices and does not classify pidan as a duck-egg form.

Québec wording `œuf de cent ans` and `Pidàn` is attested in the Fondation OLO / Dispensaire diététique de Montréal cultural-food guide. BCCDC’s December 2024 guidance identifies the product as pidan/century egg/hundred-year egg, describes its alkaline processing as a non-microbial chemical process, and says it can be made from duck, chicken, or quail eggs. The Chinese standards index lists current GB/T 9694-2014 as *皮蛋 / Preserved egg*; only metadata was accessible, so no additional definition or species claim is drawn from it. Current T&T and Walmart listings provide Canadian preserved-egg product naming; package weights remain SKU-specific evidence. OQLF’s general egg entry provides only the language context that unqualified `œuf` usually refers to a hen egg.

## Picker projection

Projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), applying complete word-phrase matching before partial fallback:

| Query | Results after R348 |
|---|---|
| `century egg(s)`, `preserved egg(s)`, `pidan`, `œuf(s) de cent ans`, `pidàn` | Century egg only |
| `preserved duck egg(s)` | Century egg only |
| `duck egg` | Duck egg and century egg |
| `œuf de canard` | Duck egg only |
| `salted duck egg` / `œuf de canard salé` | Duck egg with the existing salted-form hint |
| `egg` / `œuf` | 9 / 6 identities, including century egg |

The canonical `egg` and `œuf` queries remain broad because the catalog already contains whole egg, duck egg, quail egg, egg white, egg yolk, egg noodles, egg pasta, and egg-roll wrapper. The added identity creates no recipe link; the scan found no matching phrase in the 114 manifest-listed recipes / 1,123 ingredient rows.

No household measure, count weight, density, unit mapping, conversion, process yield, package yield, or substitution is supported. T&T's 600 g and Walmart's 350 g sizes are package observations only; the BCCDC preparation times/recipes and OLO guide's one 50-day preparation are process-specific. No numeric values were activated.

The active reference and its source-backed evidence are recorded in the bundled reference JSON and research ledger. The existing R292 T&T English category source is reused in the ledger to preserve its salted-versus-preserved boundary. The generated Kotlin import catalog was refreshed; the seed package was statically validated and required no normalization changes. **No software tests, build, emulator checks, or deployment were run** because the catalog change only adds database JSON data, as specified by `AGENTS.md`.

## Sources reviewed

- China National Standards Information Service, [GB/T 9694-2014](https://openstd.samr.gov.cn/bzgk/std/newGbInfo?hcno=D839B1FF668A354CAB8628022491B378) (metadata only).
- BC Centre for Disease Control, [Pidan/Century Egg guidance](https://www.bccdc.ca/resource-gallery/Documents/Educational%20Materials/EH/FPS/Food/Fermented/Fermented%20Foods%20Guidance%20-%203.14%20Pidan%20Century%20Egg.pdf).
- Fondation OLO and Dispensaire diététique de Montréal, [Profils alimentaires](https://stage.fondationolo.ca/wp-content/uploads/2017/12/fondation-olo-profils-alimentaires-complet-2017.pdf); Fondation OLO, [guide purpose and publication context](https://fondationolo.ca/fr/actualites/le-dispensaire-dietetique-de-montreal-et-la-fondation-olo-devoilent-profils-alimentaires/).
- T&T Supermarket, [French-locale eggs category](https://www.tntsupermarket.com/fr/product-categories/tt-dairy-frozen/tt-eggs.html) (current indexed listing; direct page fetch unavailable).
- Walmart Canada, [Six Fortune Preserved Duck Eggs](https://www.walmart.ca/en/ip/Preserved-Duck-Eggs/6000197109351?selectedSellerId=0).
- OQLF, [œuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429205/oeuf).

# WP04 Section Q — cultured-dairy identity gap review — 2026-10-10

- **Packet type:** proposal-only research. This packet changes only this proposal file; it does not edit the shared catalog, ledger, recipe files, checklist, plan, roadmap, code, or tests.
- **Scope:** plain and sweetened yogurt, Greek-style/strained yogurt, skyr, kefir, cultured buttermilk, labneh, and ayran.
- **Audit snapshot:** all 114 bundled recipe files and 1,123 ingredient rows; current ingredient references, forms, legacy candidates, research ledger, and prior dairy proposals were reviewed.
- **Source IDs:** the local prefix `WP04-CULTURED-GAP-20261010-S` was checked against repository files, including the research ledger, with no existing matches. Source IDs below are proposal-local and have not been added to the ledger.

## Recommendation

Advance three missing product identities, without forms or numeric mappings:

| Proposed ID | English display name | Québec French display name | Narrow supported aliases |
|---|---|---|---|
| `ingredient-ref-skyr` | `skyr` | `yogourt skyr` | EN: `skyr yogurt`, `skyr yoghurt`; FR: `skyr` |
| `ingredient-ref-kefir` | `kefir` | `kéfir` | EN: `kephir`; FR: `képhir` |
| `ingredient-ref-ayran` | `ayran` | `yogourt à boire ayran` | EN: `ayran yogurt drink`; FR: `ayran` |

These are identity-only proposals. Use the names as product-family identifiers, not as claims of a fixed milk species, fat level, culture recipe, salt level, or production method. A dairy-family boundary is supported for milk kefir; water/fruit kefir is excluded. Ayran remains distinct from generic drinkable yogurt because Canadian sources describe and sell it as a savoury yogurt drink with water and salt. The French retail name `yogourt à boire ayran` is directly attested in Québec.

Retain existing plain yogurt, Greek-style yogurt, buttermilk, and labneh identities exactly as they stand. Keep the Greek-style plain form and the two already reviewed WP08 findings unchanged. Do not create an identity/form for sweetened yogurt, a generic drinkable yogurt, or process-based `strained yogurt`. Do not relink or edit the bundled line that offers plain yogurt as an unlinked option.

No bundled recipe calls for skyr, kefir, labneh, ayran, or sweetened yogurt. The source recipes below support a narrow, source-recipe choice between plain Greek-style yogurt and plain skyr in the named recipes, including one explicitly paired volume/weight portion. They do not establish a general conversion or an ingredient-reference density. No other new substitution, conversion, density, or edible-portion value is proposed.

## Current package and related-review audit

The active package contains these relevant rows:

| Active ID | Current EN / FR | Forms and numeric data | Treatment here |
|---|---|---|---|
| `ingredient-ref-plain-yogurt` | `plain yogurt` / `yogourt nature`; EN alias `plain yoghurt` | No form, density, or unit mappings | Retain. This is already the plain product identity. Do not add Greek-style yogurt as an alias. |
| `ingredient-ref-greek-yogurt` | `Greek-style yogurt` / `yogourt grec`; EN aliases `Greek yogurt`, `Greek yoghurt`, `Greek-style yoghurt` | `ingredient-form-greek-yogurt-plain`: `plain Greek-style yogurt` / `yogourt grec nature`; no density | Retain the accepted identity and form. Its four bundle lines are already linked to this identity. |
| `ingredient-ref-buttermilk` | `buttermilk` / `babeurre`; FR alias `lait de beurre` | No form, density, or unit mappings | Retain. Do not duplicate as “cultured buttermilk” or equate with acidified milk. |
| `ingredient-ref-labneh` | `labneh` / `labneh`; EN and FR alias `lebneh` | No form, density, or unit mappings | Retain as its own identity; do not merge with yogurt or Greek-style yogurt. |

There is no active skyr, kefir, or ayran identity or form. No other legacy candidate matches those terms. The one remaining legacy yogurt candidate is the broad, unreviewed `ingredient-ref-yogurt` / `yogurt` / `yogourt`; keep it held. It is an umbrella term over the already distinct plain and Greek-style entries and other cultured-dairy products, and it has no exact unqualified recipe demand. There is no active sweetened-yogurt or generic drinkable-yogurt candidate.

Prior review boundaries remain in force:

- [WP04 Greek-style yogurt identity-boundary review](wp04-greek-style-yogurt-identity-boundary-review-20261010.md) accepted the Greek-style identity and plain form, held the broad generic-yogurt candidate, and did not establish a process-based `strained yogurt` alias. Its four exact plain-Greek recipe lines are already linked in the current package; they are not new demand for this packet.
- [WP08 sour-cream/Greek-style-yogurt context review](wp08-sour-cream-greek-yogurt-context-review-20261010.md) contains the existing directional, context-limited sour-cream/Greek-style-yogurt research. It remains research-only and is not restated, broadened to skyr, or activated here.
- [WP08 cultured-buttermilk/acidified-milk context review](wp08-buttermilk-acidified-milk-context-review-20261010.md) distinguishes cultured buttermilk from a fresh milk-plus-acid preparation and limits its findings to specified pancake and biscuit-dough contexts. This packet adds no buttermilk substitute or rule.
- [WP05 South-Central Asia/MENA follow-up](wp05-south-central-asia-mena-followup.md) already accepted labneh as a separately named cultured-dairy product, found no bundled labneh ingredient line, and established no universal formulation, measure, density, or substitution.

## Exact bundled recipe demand

The following rows were found by parsing each current recipe JSON's ingredient array. Recipe positions use the recipe ID prefix and one-based ingredient row number.

| Recipe row | Exact ingredient text | Current reference | Disposition |
|---|---|---|---|
| `019#2` | `1/4 cup plain Greek yogurt` | `ingredient-ref-greek-yogurt` | Existing Greek-style identity/form demand; already reviewed. |
| `019#12` | `1/4 cup plain Greek yogurt` | `ingredient-ref-greek-yogurt` | Same recipe repeats this ingredient as a separate row; already reviewed. |
| `086#5` | `1/2 cup plain Greek yogurt` | `ingredient-ref-greek-yogurt` | Existing Greek-style identity/form demand; already reviewed. |
| `113#2` | `1 1/2 cups plain Greek yogurt` | `ingredient-ref-greek-yogurt` | Existing Greek-style identity/form demand; already reviewed. |
| `051#9` | `75 g sour cream or plain yogurt, room temperature` | None | One unlinked optional plain-yogurt choice, not Greek-style yogurt and not sweetened yogurt. This packet does not alter the recipe. |
| `008#10`, `038#6`, `049#9`, `059#6`, `091#12`, `114#11` | Buttermilk in six linked ingredient rows | `ingredient-ref-buttermilk` | Existing buttermilk demand and prior WP08 coverage; no new identity or substitution evidence here. |
| `049#10` | `30 ml heavy cream or buttermilk` | None | Optional unlinked biscuit-top brush choice; WP08 excluded it from its dough substitution finding. |

No ingredient row requests skyr, kefir, labneh, ayran, generic drinkable yogurt, or sweetened yogurt. No separate `strained yogurt` line was found. The four Greek-style rows above and the buttermilk rows are recorded only to show current boundaries and avoid duplicate work.

## Identity and alias dispositions

| Product | Disposition | Name and boundary |
|---|---|---|
| Plain yogurt | **Retain existing identity** | Preserve `plain yogurt / yogourt nature` and its existing spelling alias. OQLF confirms that `yogourt` is the most common Québec form for the base product. It is not an alias for Greek-style yogurt, kefir, labneh, or ayran. |
| Sweetened/flavoured yogurt | **Hold as a new identity or form** | Sugar and flavour are additions that vary by product; Canadian dairy guidance treats plain, flavoured, and sweetened products as product variants. No bundled ingredient line requests sweetened yogurt. Keep an explicit sweetened/flavoured qualifier on a future recipe line rather than adding a broad form now. Do not resolve it to `plain yogurt`. |
| Greek-style yogurt / strained yogurt | **Retain existing identity and plain form; keep process alias held** | The four plain Greek lines are linked to `ingredient-ref-greek-yogurt`. DFC describes Greek yogurt as thick and strained, but the prior WP04 proposal found no universal process synonym. Do not add unqualified `strained yogurt` or treat skyr as a Greek-yogurt alias. |
| Skyr | **Accept a new, distinct identity** | Use `skyr / yogourt skyr`. OQLF records `skyr` as the Québec French term and English term; current Canadian dairy sources use `Skyr`, `Skyr Yogurt`, and `yogourt skyr`. DFC describes it as Icelandic-style, thick like Greek yogurt but milder. Keep it distinct even though exact DFC recipes permit skyr or Greek-style yogurt as alternatives. Do not add broad `Icelandic yogurt` or `strained yogurt` aliases: those descriptions do not establish that every product sold under those phrases is skyr. |
| Milk kefir | **Accept a new, distinct identity** | Use `kefir / kéfir`; accept the supported spelling alternatives `kephir / képhir`. OQLF describes a fermented milk beverage involving yeasts and lactic bacteria, while Canadian dairy guidance separately names kefir among dairy-product categories. Limit the identity note to dairy kefir. Exclude water/fruit kefir and kefir grains from this identity. Do not alias kefir to yogurt, buttermilk, or generic drinkable yogurt. |
| Cultured buttermilk | **Retain existing identity** | The active `buttermilk / babeurre` row and WP08 review already cover this name. The identity is the cultured dairy product; fresh acidified milk remains a prepared substitute only in the already documented WP08 contexts. |
| Labneh | **Retain existing identity** | Active `labneh / labneh` with `lebneh` aliases is already accepted. Its yogurt relationship does not make it a plain-yogurt alias, a generic strained-yogurt process name, or a recipe substitute. No labneh line is present in the bundle. |
| Ayran | **Accept a new, distinct identity** | Use `ayran / yogourt à boire ayran`; accept only the narrow descriptive aliases `ayran yogurt drink / ayran`. Québec grocery naming supplies `yogourt à boire ayran`; Canadian makers identify Ayran as a yogurt drink. Product examples contain milk/yogurt, water, salt, and cultures, sometimes with additional stabilizers or preservatives. Do not alias the product to generic sweetened `drinkable yogurt`, lassi, kefir, or buttermilk. |

The names above represent culinary product families rather than protected compositional specifications. The CFIA distinguishes standardized foods from unstandardized foods and cautions that only products meeting an applicable standard may use its prescribed common name. This proposal does not claim a Canadian standard for skyr or ayran, or a single recipe for kefir or ayran. Where the evidence describes a single manufacturer product, it is recorded as a product-specific example only.

## Measurement, density, edible portions, and substitution review

### Recipe-specific plain Greek-style yogurt / skyr choices

These external Canadian recipes name Greek-style yogurt and skyr as explicit alternatives in the same ingredient slot:

| Source recipe | Exact source amount | What the source supports | Limit |
|---|---|---|---|
| Dairy Farmers of Canada, *Cloud Smoothie* | `1/2 cup (125 g) plain Siggi’s Skyr 3.6% ... (or Canadian Greek yogurt)`; the topping repeats `2 tbsp (30 ml)` with the same product alternative. | A source-authored, same-amount alternative between the named plain Skyr product and Canadian Greek yogurt in a blended drink and as a topping. The recipe gives one paired `1/2 cup / 125 g` quantity. | Recipe-specific and product-specific. It is not a measured generic density for skyr or Greek-style yogurt, and does not establish a cooked-use rule. |
| Dairy Farmers of Canada, *Roasted Root Vegetable Yogurt Bowl* | `2 cups (500 mL) plain Canadian yogurt, greek or skyr style` | One cold bowl recipe accepts either style at the stated amount. | Volume pair only; no mass/density data. Yogurt is mixed with honey and served cold. |
| Dairy Farmers of Canada, *Thai Peanut and Yogurt Dip* | `1 cup (250 mL) plain Canadian yogurt, Greek or Skyr style` | One uncooked dip recipe accepts either style at the stated amount. | Volume pair only; no mass/density data. |
| Dairy Farmers of Canada, *Cinnamon Multigrain & Yogurt Pancakes* | Cinnamon-yogurt topping: `1/2 cup (125 mL) plain Canadian yogurt, greek or skyr style`. | A source-specific alternative for the uncooked topping. | The pancake batter's separate yogurt line is generic plain yogurt; this alternative text applies only to the topping line. The recipe gives no yogurt mass. |

Record these as source-specific alternative evidence if the coordinator chooses to extend the research ledger. They are not bundled recipe demand. The explicit common ingredient line supports using the same recipe amount for either named product in those exact recipes, but it does not show that Greek yogurt and skyr behave alike across other roles, fat levels, brands, or heated methods. Keep the finding research-only; no new runtime rule or recipe link is proposed.

### Other numeric and functional data

- The `1/2 cup (125 g)` skyr amount in *Cloud Smoothie* is the only mass-and-volume observation found for the new identity. Do not turn it into a default density or cup-to-gram mapping: it is one recipe's amount for a branded product, offered alongside Greek yogurt as an alternative.
- DFC's current product directory lists Siggi's plain skyr products at both `0% M.F.` and `3.6% M.F.`. This shows that no universal skyr fat percentage should be inferred from the older OQLF skim-milk description or from one brand.
- Baladi Fresh describes one original kefir as cultured full-fat cow's milk with named probiotic cultures, minimum `8.2%` solids-not-fat, and vitamin D. This is a single product label, not a category specification, volume-to-mass relationship, or cooking conversion.
- Baladi Fresh gives one Ayran formula with approximately `0.7%` salt and a minimum `1%` fat; another Canadian Ayran maker lists milk, water, active culture, salt, potassium sorbate, and citric acid. These examples show product formulation can vary. No universal water/salt ratio, fat value, density, or measure is proposed.
- The bundle's linked buttermilk quantities are recipe amounts in cups or millilitres; they do not provide product mass or a density. No edible-portion factor applies to these pourable cultured dairy products.
- No exact bundled or reviewed source recipe supports a numeric volume/mass conversion for kefir, labneh, buttermilk, ayran, or sweetened yogurt. Mark such values unavailable rather than deriving them from package sizes or unrelated products.

### Substitution dispositions

1. **Plain skyr ↔ plain Greek-style yogurt:** preserve only the exact, source-recipe alternatives above. The recipes offer either product in the same amount; they do not establish a universal one-way or bidirectional interchange rule. No runtime rule is proposed.
2. **Skyr ↔ generic plain yogurt:** no new substitution is proposed. The DFC recipes name Greek or skyr as options in selected lines; this packet does not infer that all plain yogurt works in the same ways or amounts.
3. **Kefir, labneh, or ayran ↔ yogurt/buttermilk:** no exact bundled recipe or reviewed source recipe supports a directional substitution. Do not infer an amount from similar acidity, dairy origin, or drinkability.
4. **Sweetened ↔ plain yogurt:** no recipe demand or exact source alternative was found; do not substitute without a recipe-specific source.
5. **Sour cream ↔ Greek-style yogurt** and **cultured buttermilk → acidified milk:** leave entirely to the existing WP08 proposals. No direction, use case, or recipe is added to those records here.

## Source register

| Source ID | Source and supported scope |
|---|---|
| **WP04-CULTURED-GAP-20261010-S01** | Office québécois de la langue française, [`yogourt` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8872897/yogourt), updated 2025. Defines yogurt as a dairy product from lactic fermentation and says `yogourt` is the most common Québec French form; lists `yogourt`, `yoghourt`, and `yaourt`. |
| **WP04-CULTURED-GAP-20261010-S02** | Office québécois de la langue française, [`kéfir` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2073035/kefir). Gives the dairy-fermented beverage definition, French `kéfir` and `képhir`, and English `kefir` and `kephir`. The entry's composition description is not treated as a universal modern product formula. |
| **WP04-CULTURED-GAP-20261010-S03** | Office québécois de la langue française, [`skyr` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17049170/skyr). Records `skyr` as the French and English term and identifies it as fermented skimmed milk from Iceland; the fat classification is not generalized to current Canadian branded products. |
| **WP04-CULTURED-GAP-20261010-S04** | Les Producteurs laitiers du Canada, [Tout sur le yogourt](https://producteurslaitiersducanada.ca/fr/plaisirs-laitiers/yogourt). French product-family descriptions distinguish yogourt grec, yogourt skyr, kéfir, and yogourt à boire; describes skyr's Icelandic tradition, thicker texture and milder taste, and kefir's yeast fermentation. It notes sweetening/flavour as a characteristic of drinkable yogurt without defining a universal formula. |
| **WP04-CULTURED-GAP-20261010-S05** | Dairy Farmers of Canada, [All about Yogurt](https://dairyfarmersofcanada.ca/en/canadian-goodness/yogurt). English counterpart distinguishes Greek yogurt, skyr, kefir, and drinkable yogurt. Used for product boundaries and market terminology; not a product standard. |
| **WP04-CULTURED-GAP-20261010-S06** | Canadian Food Inspection Agency, [Labelling requirements for dairy products](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy). Explains that standardized dairy product names depend on applicable standards and separately identifies yogurt, drinkable yogurt, kefir, and buttermilk in dairy labelling/nutrition contexts. It does not define a universal skyr or ayran composition. |
| **WP04-CULTURED-GAP-20261010-S07** | Dairy Farmers of Canada, [Siggi’s Skyr Yogurt Plain 0% M.F.](https://dairyfarmersofcanada.ca/en/canadian-goodness/blue-cow-spotter/siggis-skyr-yogurt-plain-0-mf-750g) and [Siggi’s Skyr Yogurt Plain 3.6% M.F.](https://dairyfarmersofcanada.ca/en/canadian-goodness/blue-cow-spotter/siggis-skyr-yogurt-plain-36-mf-750g). Current Canadian product directory records two plain skyr products at distinct milk-fat levels; no general fat or density value is inferred. |
| **WP04-CULTURED-GAP-20261010-S08** | Baladi Fresh, [Plain Yogurt](https://baladifresh.ca/plain-yogurt/). Canadian maker's product page lists its plain-yogurt ingredients. Used only as a contemporary Canadian example that plain yogurt formulas can include modified milk ingredients and preservative; not a universal definition. |
| **WP04-CULTURED-GAP-20261010-S09** | Baladi Fresh, [Original Kefir](https://baladifresh.ca/original-kefir/). Canadian product page describes full-fat cultured cow's milk, named probiotic cultures, minimum SNF `8.2%`, and vitamin D; product-specific only. |
| **WP04-CULTURED-GAP-20261010-S10** | Baladi Fresh, [Original Ayran](https://baladifresh.ca/original-ayran/). Canadian product page reports its Ayran ingredients and approximate `0.7%` salt/minimum `1%` fat. Product-specific only. |
| **WP04-CULTURED-GAP-20261010-S11** | Dairy Fountain, [Ayran – Yogurt Drink](https://dairyfountain.com/product/ayran-yogurt-drink/). Canadian maker uses the English name `Ayran – Yogurt Drink` and lists a plain formula with milk, water, culture, salt, potassium sorbate, and citric acid; its mint product has a different ingredient list. |
| **WP04-CULTURED-GAP-20261010-S12** | Provigo Québec, [Yogourts grecs product listing](https://www.provigo.ca/fr/alimentation/produits-laitiers-et-ufs/yogourt/yogourts-grecs/c/29805?page=3). Uses the French listing `Elegant Yogourt à boire ayran` and `Yogourt Skyr de style islandais`; retail names support the proposed Québec naming, but not a universal synonym. |
| **WP04-CULTURED-GAP-20261010-S13** | Dairy Farmers of Canada, [Cloud Smoothie](https://dairyfarmersofcanada.ca/en/canadian-goodness/recipes/cloud-smoothie). Gives `1/2 cup (125 g)` plain Siggi's Skyr 3.6% or Canadian Greek yogurt and repeats the option for a `2 tbsp (30 ml)` topping. Supports only this exact recipe's product choice and paired portion. |
| **WP04-CULTURED-GAP-20261010-S14** | Dairy Farmers of Canada, [Roasted Root Vegetable Yogurt Bowl](https://dairyfarmersofcanada.ca/en/canadian-goodness/recipes/roasted-root-vegetable-yogurt-bowl). Exact ingredient line specifies `2 cups (500 mL)` plain Canadian yogurt, Greek or skyr style, served cold with roasted vegetables. |
| **WP04-CULTURED-GAP-20261010-S15** | Dairy Farmers of Canada, [Thai Peanut and Yogurt Dip](https://dairyfarmersofcanada.ca/en/canadian-goodness/recipes/thai-peanut-and-yogurt-dip). Exact line specifies `1 cup (250 mL)` plain Canadian yogurt, Greek or Skyr style, blended into an uncooked dip. |
| **WP04-CULTURED-GAP-20261010-S16** | Dairy Farmers of Canada, [Cinnamon Multigrain & Yogurt Pancakes](https://dairyfarmersofcanada.ca/en/canadian-goodness/recipes/cinnamon-multigrain-yogurt-pancakes). The cinnamon-yogurt topping line permits `1/2 cup (125 mL)` plain yogurt, Greek or skyr style. The separate batter line says plain yogurt without that product alternative. |

## Proposed coordinator disposition

- Add identity-only `ingredient-ref-skyr`, `ingredient-ref-kefir`, and `ingredient-ref-ayran` with the names and narrow aliases above; no form, density, unit mapping, edible portion, or global substitution rule is supported.
- Retain existing plain yogurt, Greek-style yogurt and its plain form, cultured buttermilk, and labneh. Keep generic `ingredient-ref-yogurt` and process-based `strained yogurt` held.
- Hold sweetened/flavoured yogurt and generic drinkable yogurt as forms or identities until exact recipe demand or stronger product-boundary evidence requires catalog treatment.
- If a coordinator records Skyr/Greek-style yogurt substitution research, scope it to the exact Dairy Farmers of Canada recipe alternatives and preserve source amounts; do not create an active rule.
- Preserve both existing WP08 dairy proposals without expansion. No recipe line, shared package file, ledger record, checklist, plan, roadmap, code, or test is changed by this packet.

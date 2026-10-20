# WP03 Section F R193 — pearled hominy Canadian classification and Québec-name recheck

- **Date:** 2026-10-16
- **Status:** Integrated as a ledger-only candidate hold. No active reference, alias, form, recipe link, measure, conversion, or substitution was added.
- **Disposition:** Keep `ingredient-ref-pearled-hominy` as a ledger-only candidate. Do not add a reference, alias, form, measure, recipe link, conversion, or substitution.
- **Scope:** Recheck the still-open pearled-hominy candidate using current Canadian human-food classification and Québec-facing terminology evidence. This is a source update to the earlier boundary hold, not a claim that the product has never been reviewed.
- **Open checklist:** The active Section F item still includes pearled hominy under [grits, polenta, pearled hominy, pozole corn, dried sweet corn, and remaining puffed-grain candidates](../../RecipeBook-global-ingredient-catalog-plan.txt#L3450). Earlier reviews are recorded in the [shared hominy boundary note](../batches/hominy-boundary-review.md), the [October 12 grain sweep](./wp03-section-f-next-grains-gap-sweep-20261012.md), and the [millet-flakes identity review](./wp03-section-f-millet-flakes-identity-review-20261012.md). The plan keeps the prior boundary decision at [lines 3353–3356](../../RecipeBook-global-ingredient-catalog-plan.txt#L3362).

## Recommendation

Keep the existing candidate unresolved. Current Statistics Canada evidence now clearly places **pearled corn (maize)** within “Grain products for human consumption, n.e.c.” and excludes hulled, pearled, sliced, or kibbled corn from the unprocessed corn-for-grain class. The same human-food example list names **white hominy** separately from pearled corn. This strengthens the Canadian product-class boundary, but it does not establish that `pearled corn` and `pearled hominy` are synonymous, define a retail SKU, or provide a Québec French human-food name [`WP02-A7-BUCKWHEAT-MEAL-20261013-S01`; `WP03-PEARLED-HOMINY-R193-20261016-S02`; `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S02`].

The French wording found so far does not close the name gap. CFIA's current French feed-ingredient table uses *hominy perlé* only inside a feed-byproduct definition. A CFIA import-reference update uses *maïs mondé ou perlé* as a customs/import classification, not a human-food package title. OQLF's *semoules du maïs* is broader: its definition is hulled and degermed maize broken or ground to varying sizes, which overlaps the existing milling products rather than naming whole pearled kernels. The Québec food article's *maïs perlé* identifies a broad maize type, with no pearling process or product definition. A current Québec farm's similarly worded *Perles de maïs* SKU is explicitly a bird and small-animal treat made from dried and shelled ears, not a human-food product [`WP03-S139`; `WP05-VINEGAR-INT-20261012-S02`; `WP03-S153`; `WP03-PH-20261012-S01`; `WP03-PEARLED-HOMINY-R193-20261016-S08`].

Therefore, do not activate `hominy perlé`, `maïs perlé`, or *semoules du maïs* as aliases or displays. The first is currently evidenced here only in feed context; the second is broad and process-unspecified in the food article and denotes a different current Québec product on the farm page; the third is a broader ground product. Keep the dry-milled/pearled candidate separate from lye-treated or preserved `hominy corn / maïs lessivé`, ground `hominy grits / gruau de maïs`, ordinary corn grits, cornmeal, masa harina, and pozole corn [`WP03-S139`; `WP03-S126`; `WP03-S151`; `WP03-S153`; `WP03-PH-20261012-S01`].

## Product boundary and Québec terminology

| Evidence | What it supports | Limit for this decision |
| --- | --- | --- |
| Statistics Canada NAPCS 2022, class 1821294 | Human-food grain products include the separate examples `pearled corn (maize)` and `white hominy`. The class also lists corn grits and maize groats. | Examples under one statistical class do not establish equivalence, preparation, a consumer package name, or Québec wording [`WP02-A7-BUCKWHEAT-MEAL-20261013-S01`]. |
| Statistics Canada NAPCS 2022, class 1151111 | Unmilled corn for grain excludes hulled, pearled, sliced, or kibbled corn to class 1821294. | Confirms a processed-grain boundary; it is not a consumer product specification [`WP03-PEARLED-HOMINY-R193-20261016-S02`]. |
| CBSA Customs Tariff 2026, Chapter 11 | Maize is classified under worked grains, with pearling among the listed processing examples. | Trade classification does not identify a specific pearled-hominy food SKU or consumer measure [`WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S02`]. |
| CFIA French SARI update and Canadian Feed Ingredients Table | *Maïs mondé ou perlé* appears in the French import-reference category; *hominy perlé* appears in a current feed-byproduct definition. | Neither page is a human-food retail label. The feed-table instance must not be promoted as the food display [`WP05-VINEGAR-INT-20261012-S02`; `WP03-S139`]. |
| OQLF GDT, *semoules du maïs* | Quebec terminology for broad hominy includes hulled and degermed maize broken or ground to varying degrees; hominy grits are a ground fraction coarser than cornmeal. | The defined scope is broader and ground; it cannot name whole pearled kernels without additional evidence [`WP03-S153`]. |
| Recettes du Québec, *Le maïs* | The article calls *maïs perlé* one of the broad maize types grown for food. | It does not define a dry-milled product or connect that phrase to pearled hominy [`WP03-PH-20261012-S01`]. |
| Ferme Maxiel, *Perles de maïs* | A current Québec-facing product uses the similar phrase for dried, shelled maize. The page places it among pet products and describes it for birds and small rodents. | This is an animal-food homonym, not a human-food name or process match [`WP03-PEARLED-HOMINY-R193-20261016-S08`]. |
| TERMIUM Plus and USDA ERS | TERMIUM distinguishes pearled hominy (degermed hulled maize) from lye-treated hominy and says corn grits are ground hominy. The USDA dry-milling account separates pearl hominy from hominy grits, meal, and flour. | Supports keeping processes and grind states separate, but neither source establishes a current Canadian/Québec package name, measure, or substitution ratio [`WP03-S126`; `WP03-S151`]. |

## Ownership, aliases, and picker audit

The pre-integration read-only snapshot contained **1,572 active references**, **122 forms**, **61 legacy candidates**, and **1,917 research-ledger records** in the [reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identity map](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json). Exact normalized searches found no reference, form, or legacy-candidate owner for `pearled hominy`, `pearl hominy`, `hominy perlé`, `maïs perlé`, `pearled corn`, `pearled maize`, `white hominy`, `semoules du maïs`, or `maïs mondé ou perlé`. The sole research owner was `ingredient-ref-pearled-hominy`, a `candidate` with `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it then had six sources and one unresolved decision. The integrated candidate now retains that identity state, has 11 unique sources and one unresolved decision, and records completed searches for measures and substitutions. Do not create a second candidate or ledger row.

Relevant active neighbors remain:

- `ingredient-ref-hominy-corn`: `hominy corn / maïs lessivé`, category `VEGETABLE_AND_AROMATIC`, with only the English alias `lyed corn`.
- `ingredient-ref-hominy-grits`: `hominy grits / gruau de maïs`, category `GRAIN_AND_CEREAL`.
- `ingredient-ref-corn-grits`: `corn grits / semoule de maïs de type grits`, category `GRAIN_AND_CEREAL`.
- `ingredient-ref-cornmeal`: `cornmeal / semoule de maïs`, category `FLOUR_AND_STARCH`.
- `ingredient-ref-masa-harina`: `masa harina / farine de maïs nixtamalisée`, category `FLOUR_AND_STARCH`.
- `ingredient-ref-popcorn`: `popcorn / maïs soufflé`, with `maïs éclaté` as a French alias.

No exact name/alias collision or active form owner exists for the candidate terms. Current picker projection, using `IngredientReferenceSearchIndex` phrase-first matching and substring fallback, is:

| Query | Current result |
| --- | --- |
| `pearled hominy`, `pearled corn`, `hominy perlé`, `maïs perlé`, `white hominy`, `semoules du maïs` | 0 results |
| `hominy` | 2 results: hominy corn and hominy grits |
| `hominy grits` / `gruau de maïs` | hominy grits only |
| `hominy corn` / `maïs lessivé` | hominy corn only |
| `corn` | 33 results |
| `maïs` | 34 results |
| `popcorn` / `maïs soufflé` | popcorn only |

If a future review establishes a valid bilingual row with canonical English `pearled hominy`, that exact English phrase would add one product-specific choice and broad `hominy` would return three products. Its French query effects cannot be projected until a human-food French display is supported. An accepted French phrase such as `maïs mondé ou perlé` would also join the already broad `maïs` result set; do not add it based on a customs/import classification alone. Leave the existing broad `hominy` results intact for now.

## Bundled recipe demand

Scanned all **114 bundled recipe files** and **1,123 ingredient rows**. There are zero recipe-line or recipe-file text hits for `pearled hominy`, `pearl hominy`, `hominy perlé`, `maïs perlé`, `pearled corn`, `pearled maize`, `white hominy`, or the candidate ID. The bundle has no direct demand, recipe link, authored amount, or substitution requiring this identity.

## Measures, forms, and substitutions

The reviewed Canadian classifications, terminology entries, and retailer pages do not supply a food-use volume-to-mass measure or a reusable density for pearled hominy. The customs tariff's kilogram unit is a reporting unit, not a kitchen measure. Ferme Maxiel's under-14% moisture statement belongs to its pet-feed *Perles de maïs* SKU and is not transferable. No active form or unit mapping belongs to the candidate, and the bundled corpus has no matching recipe measure. Do not add density, cup-to-gram mappings, forms, cooking yield, rehydration ratio, or package yield.

TERMIUM's “corn grits are ground hominy” note and the USDA's dry-milling description identify a processing relationship, not an interchangeable one-to-one recipe substitution. No source supports substituting pearled hominy for hominy grits, corn grits, cornmeal, masa harina, canned hominy, or dried pozole corn. No global form conversion or contextual substitution rule was added. The integrated candidate's measurement state is `researched_no_supported_value` and substitution state is `researched_no_supported_substitute`; both evidence arrays remain empty. This records the completed search without inventing numeric or culinary behavior.

## If later evidence supports activation

Do not integrate a reference from this packet. If a future Québec human-food label or a terminology authority explicitly names the same dry-milled product, reuse the existing candidate ID rather than allocating a second one:

| Reference field | Conditional value |
| --- | --- |
| `id` | `ingredient-ref-pearled-hominy` |
| `category` | `GRAIN_AND_CEREAL` |
| `nameEn` | `pearled hominy` only if that exact English product scope remains supported |
| `nameFr` | Exact human-food Québec French display still to be established; no value is approved here |
| `aliasesEn`, `aliasesFr` | Empty unless separate source evidence supports a unique phrase |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| forms, recipe links, yields, conversions, substitutions | None |

On activation, transform the existing ledger candidate record into the reference's evidence record; do not duplicate its `recordId`. Preserve this packet's classification and terminology sources, add product-label sources, set `identityState: verified` only after the name/scope are settled, and retain the no-supported-measure/substitute states unless later product-specific evidence changes them.

## Integrated ledger-only update for this hold

The integration updated the existing `ingredient-ref-pearled-hominy` candidate only. It preserves `recordType: candidate`, `identityState: needs_clarification`, and prior evidence dates. It added two new URL records in this packet: `WP03-PEARLED-HOMINY-R193-20261016-S02` (Statistics Canada NAPCS 1151111) and `WP03-PEARLED-HOMINY-R193-20261016-S08` (Ferme Maxiel). It reused the existing source IDs in the register for the other URLs, attaching them only where absent from the candidate's `sources` array, without minting duplicate IDs or URLs. The three reused IDs newly attached to the candidate were `WP02-A7-BUCKWHEAT-MEAL-20261013-S01`, `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S02`, and `WP05-VINEGAR-INT-20261012-S02`; each source's existing `accessedOn` and version metadata was preserved.

Refresh the candidate's existing `WP03-S139` source in place because the current CFIA page is modified 2026-10-07 and entry 1-202-008 explicitly mentions *hominy perlé*. Preserve `accessedOn: 2026-10-07`; change `versionOrDate` from `modified 2026-06-26` to `modified 2026-10-07`; set the locator to entries `1-202-007, Gruau de maïs (ou gruau hominy)` and `1-202-008, Sous-produit du gruau de maïs (ou farine hominy)`. Keep the supports text feed-scoped: entry 1-202-008 describes a feed byproduct resulting from preparation of pearled hominy, hominy grits, or table meal; it does not support a human-food name or label.

The integration updated the candidate's one existing unresolved decision in place, retaining its earlier reason and original `sourceIds` while merging the unique source IDs listed above. The final array has all six original source IDs and five added/reused IDs (11 total); no duplicate unresolved decision or evidence row was added. The candidate now has 11 source records, with `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`; no `measurementObservations` or `substitutionFindings` were added. No active reference, form, or legacy candidate changed in this batch.

## Reopen conditions

Reopen this candidate when one of these is found:

1. A current Canadian manufacturer or Québec retailer sells the **human-food dry-milled/pearled product** and gives a French product title that clearly applies to the same process-defined item; or
2. OQLF, TERMIUM, or another authoritative Canadian/Québec food terminology source explicitly connects a French product name to the dry-milled pearled-hominy scope, not just to broad maize, ground hominy, a feed byproduct, or an import category.

Any future measure must be tied to that exact human-food SKU/form and state its unit, mass, and method. Any substitution evidence must preserve the distinction among dry pearled kernels, lye-treated/preserved whole hominy, and ground grits. A new recipe occurrence may justify demand review but does not by itself resolve the Québec display or measurement boundary.

## Source register

The register has one row per URL. Only the Statistics Canada 1151111 page and Ferme Maxiel page introduce new URLs; the other rows reuse existing source IDs and evidence.

| Source ID | Source and locator | Supported use and limitation | Ledger action | URL |
| --- | --- | --- | --- |
| `WP02-A7-BUCKWHEAT-MEAL-20261013-S01` | Statistics Canada, NAPCS Canada 2022, class 1821294 examples; accessed 2026-10-13; page modified 2026-01-08. | All examples for human-consumption grain products; includes pearled corn and white hominy as separate examples. Classification examples only. | Reuse existing source ID; attach to this candidate with its candidate-specific locator/supports. | https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022 |
| `WP03-PEARLED-HOMINY-R193-20261016-S02` | Statistics Canada, NAPCS Canada 2022, class 1151111 corn for grain; accessed 2026-10-16; page modified 2026-01-08. | Excludes hulled, pearled, sliced, or kibbled corn to human-food grain-product class 1821294. | New source URL and ID to append to this candidate. | https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1151111&CST=17022022&CVD=1386659&Function=getVD&MLV=4&TVD=1384502 |
| `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S02` | Canada Border Services Agency, Customs Tariff 2026, Chapter 11, tariff item 1104.23.00; accessed 2026-10-14; 2026 edition. | Places maize under other worked grains, where pearling is listed as a working process. Customs classification, not consumer wording. | Reuse existing source ID; attach to this candidate with the maize locator/supports; preserve the existing source's access and version dates. | https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html |
| `WP05-VINEGAR-INT-20261012-S02` | CFIA, ACIA-SARI update, 2024-12-02, French plant-product import categories; accessed 2026-10-12. | Uses `Maïs : mondé ou perlé` as an import-reference category, not a human-food package title. | Reuse existing source ID; attach to this candidate with this locator; preserve the existing source's access date. | https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/vegetaux-produits-vegetaux/sari/mises-jour-acia-sari-2024-12-02 |
| `WP03-S139` | CFIA, Tableau canadien des ingrédients des aliments du bétail, entries 1-202-007 and 1-202-008; accessed 2026-10-07; modified 2026-10-07. | Entry 1-202-008 mentions *hominy perlé* as an input to a feed byproduct; entry 1-202-007 defines feed-grade medium ground maize fragments. Feed context only. | Refresh the candidate's existing source in place: update version/date and locator; do not append a duplicate source row. | https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail |
| `WP03-S153` | OQLF, GDT, *semoules du maïs*, definition and note; accessed 2026-10-07; updated 1987. | Defines hominy broadly as hulled/degermed maize broken or ground to varying sizes and names hominy grits as a ground product. Not a whole-kernel display. | Already on candidate; retain existing ID and source dates. | https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17036518/semoules-du-mais |
| `WP03-PH-20261012-S01` | Recettes du Québec, *Le maïs*, paragraph beginning “La popularité du maïs tient...”; accessed 2026-10-12; article dated 2000-03-01. | Uses `maïs perle` for a broad maize type consumed as food; supplies no dry-milling definition or product equivalence. | Already on candidate; retain existing ID and source dates. | https://www.recettes.qc.ca/chroniques/quoi-manger/article/le-mais-29 |
| `WP03-PEARLED-HOMINY-R193-20261016-S08` | Ferme Maxiel, *Perles de maïs*, accessed 2026-10-16, current Québec-facing product page. | Product page identifies birds and small rodents as users and describes dried, shelled maize; disconfirms this SKU as a human-food hominy label. | New source URL and ID to append to this candidate. | https://maxiel.ca/products/perles-de-mais |
| `WP03-S126` | TERMIUM Plus, hominy, Food Industries terminology entry and observations; accessed 2026-10-07. | Distinguishes lye-treated from pearled hominy; defines pearled hominy as degermed hulled maize and grits as ground hominy. Process boundary only. | Already on candidate; retain existing ID and source dates. | https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=23&i=&index=enb&lang=eng&sg_kp_wet=1113184&srchtxt=CAUSTIC |
| `WP03-S151` | USDA Economic Research Service, *Feed Situation and Outlook*, August 1982, “Dry-Milling Industry,” PDF pp. 10–11; accessed 2026-10-07. | Separates pearl hominy from hominy grits, meal, and flour, and notes pearl hominy may be further processed into flaking grits. Historical U.S. milling evidence, not Canadian naming or measure evidence. | Already on candidate; retain existing ID and source dates. | https://esmis.nal.usda.gov/sites/default/release-files/dv13zt20x/2j62s871n/m613n2962/Feedsit-08-18-1982.pdf |

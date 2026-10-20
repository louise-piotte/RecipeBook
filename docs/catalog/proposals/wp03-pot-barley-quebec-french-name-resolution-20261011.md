# WP03 Section F: pot-barley Québec French picker-name resolution

## Review record

- **Reviewed:** 2026-10-11.
- **Status:** proposal for coordinator integration; this file does not change the shared catalog, ledger, tests, or checklist.
- **Scope:** resolve the French picker display for the existing pot/Scotch-barley candidate while preserving its processing boundary from hulled and pearl barley.
- **Disposition:** promote the candidate as an identity-only `pot barley / orge en pot` reference. Keep `orge mondé / orge mondée` out of its French aliases because that French key is already assigned to hulled barley in the active catalog and by OQLF.

## Finding and recommendation

Pot/Scotch barley is a distinct processed product between hulled and pearl barley. The federal food-purchasing specification distinguishes the three: pot/Scotch barley retains more bran than pearl barley, while hulled barley has only the inedible outside hull removed. Nith River Milling further describes pot barley as dehulled and lightly polished to remove some, but not all, of the bran; its dehulled product retains the bran layer intact. The exact amount of polishing is not specified, so this supports a product boundary, not a universal process formula. [S03–S05]

The main French term remains conflicted. OQLF pairs *orge mondé* with *hulled barley* and defines removal of the outer hull. TERMIUM groups *pot barley*, *hulled barley*, and rare *Scotch barley* under *orge mondé / orge mondée*. The bilingual federal purchasing specification uses *orge mondé* for the paragraph corresponding to English *Scotch or pot barley*, then uses *orge entière* for the paragraph corresponding to English *hulled, whole or hull-less barley*. These official sources therefore do not give a stable one-to-one French mapping for the current active hulled-barley name. [S01–S03]

Current Canadian French retail and supplier listings provide a narrower disambiguating label: *orge en pot*. Healthy Planet’s French page titles and labels a Canadian-grown-and-processed Oak Manor pot-barley product *orge en pot* and describes bran remaining in the grain. FoodServiceDirect’s French-Canada listing sells Agrofusion *Orge En Pot* separately from *Orge Perlé*. Arva Flour Mill’s French collection lists *Orge en pot* as a 900 g grain product. These are commercial names rather than terminology-authority decisions; together they support using the exact narrow wording as a picker display. [S06–S08]

There is still regional and retailer variation. Metro’s English page identifies Cedar Phoenicia product UPC `062356506537` as *Pot Barley*, while its Québec French page for the same UPC calls it *Orge mondé*. That is direct evidence of the same collision described by OQLF, not evidence that pot barley and hulled barley are identical. Do not import *orge mondé(e)* as an alias for the pot-barley identity. [S09]

**Recommendation:** resolve the hold by adding an identity-only `ingredient-ref-pot-barley` with display names `pot barley / orge en pot`. If an English search alias is desired, add only `Scotch barley`, which TERMIUM marks rare and the federal specification explicitly pairs with pot barley. Add no French aliases. Do not merge this row with hulled barley or pearl barley, and do not use `orge mondé`, `orge mondée`, or `orge entière` as pot-barley aliases.

## Proposed catalog disposition

| Field or boundary | Proposed value | Evidence and limit |
| --- | --- | --- |
| ID | `ingredient-ref-pot-barley` | Reuse the existing ledger candidate ID. |
| English display | `pot barley` | Federal specification and Canadian product listings. |
| French display | `orge en pot` | Exact current Canadian French product-listing wording; market-attested, not OQLF-approved terminology. |
| English alias | `Scotch barley` only | TERMIUM marks it rare; federal specification says “Scotch or pot barley.” Do not alias `hulled barley`. |
| French aliases | None | Keep the collided `orge mondé / orge mondée` and the federal `orge entière` wording out of the pot-barley search keys. |
| Category | `GRAIN_AND_CEREAL` | Match the existing active barley-grain identities. |
| Forms, density, unit mappings | None; density null and unit mappings empty | No evidence here supports a reusable mass-volume conversion or form relation. |
| Recipe links and numeric data | None | The current bundle has no barley recipe demand; package weights are not volume or conversion evidence. |
| Substitutions or yields | None | A process distinction and general cooking advice do not establish a safe global substitution or cooking-yield rule. |

Keep active `ingredient-ref-hulled-barley` as `hulled barley / orge mondé` and active `ingredient-ref-pearl-barley` as `pearl barley / orge perlé`. The proposal does not change either row.

## Recipe demand and measurement limits

A fresh whole-file scan of all 114 current bundled recipe JSON files found no occurrence of `barley`, `orge mondé`, `orge en pot`, `orge perlé`, `pot barley`, `Scotch barley`, or `hulled barley`. No recipe names or links to these identities were found. The previous broader ingredient-row audit likewise found no barley line. Do not infer recipe quantities from retail packages or external recipe pages.

The reviewed process pages give qualitative preparation context such as bran retention, texture, and presoak guidance. Retail pages show package sizes (including 450 g, 900 g, 907 g, 1 kg, and 10 kg), but no measured volume for those masses. They support no default grams-per-cup density, unit mapping, cooking yield, mass conversion, or substitution among pot, hulled, and pearl barley. Keep the candidate’s measurement and substitution research states unresolved; an identity promotion can remain data-empty.

## Focused picker expectations

These are proposal expectations only; no fixtures or tests are changed here.

| Input | Expected result after coordinator integration |
| --- | --- |
| `pot barley`, `Scotch barley` | `ingredient-ref-pot-barley` only. |
| `orge en pot` | `ingredient-ref-pot-barley` only. |
| `hulled barley`, `orge mondé` | Existing `ingredient-ref-hulled-barley` only. |
| `pearl barley`, `orge perlé` | Existing `ingredient-ref-pearl-barley` only. |
| `orge mondée`, `orge entière` | Do not add either to the pot-barley row. Preserve existing behavior and avoid cross-linking identities based on federal terminology variation. |

## Sources

Sources were accessed on 2026-10-11. Official terminology and federal purchasing material establish the naming collision and processing boundary. Retail and miller listings support only current market wording and product context.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-PB-NAME-20261011-S01` | Office québécois de la langue française, [orge mondé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358517/orge-monde), updated 2004; preferred term and definition. | Pairs *hulled barley* with *orge mondé* and defines the grain as barley with the exterior envelope removed. This does not establish *orge mondé* as a unique translation for all products sold as pot barley. |
| `WP03-PB-NAME-20261011-S02` | TERMIUM Plus, [Scotch barley record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enw&lang=fra&srchtxt=SCOTCH+BARLEY), Grain Growing record dated 2021-10-14, modified 2026-08-06. | Lists *pot barley*, *hulled barley*, and rare *Scotch barley* in English under French *orge mondé / orge mondée*. Records that pot barley is less heavily processed than pearl barley. The grouped record does not prove equivalence of the English product classes. |
| `WP03-PB-NAME-20261011-S03` | Department of National Defence, [Food Quality Specifications: Grains, English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf), dated 2018-04-01, FQS 24-01, paragraphs 11–14, pp. 2–3. | For federal food purchasing, separates pearl, Scotch/pot, and hulled barley; says Scotch/pot has more bran retained than pearl and defines hulled barley as having only the inedible outside hull removed. Dated procurement guidance, not a Québec French naming authority or process tolerance. |
| `WP03-PB-NAME-20261011-S04` | Department of National Defence, [Spécifications sur la qualité des aliments : Grain céréalier, French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), dated 2018-04-01, SQA 24-01, paragraphs 11–14, pp. 2–3. | The translated specification calls its three forms *orge perlé*, *orge mondé*, and *orge entière*. The paragraph corresponding to English Scotch/pot uses *orge mondé*; the following hulled paragraph uses *orge entière*. This conflicts with OQLF’s *orge mondé* = *hulled barley* entry, so it documents the collision rather than resolving a unique French mapping. |
| `WP03-PB-NAME-20261011-S05` | Nith River Milling, [Barley Products](https://www.nithriver.ca/barley), “Pot Barley,” “Pearled Barley,” and “Milling (Dehulled) Barley” sections. | Defines pot barley as dehulled and lightly polished to remove some, but not all, bran; defines dehulled barley as retaining the bran layer intact. Supports the distinct process classes, not a French term, a fixed polishing percentage, or a conversion. |
| `WP03-PB-NAME-20261011-S06` | Healthy Planet Canada, [Oak Manor Barley Pot / Orge en pot](https://www.healthyplanetcanada.com/fr/oak-manor-barley-pot-organic-1kg.html), current French product page, SKU A0039206. | French title and section label say *orge en pot* for a Canadian-grown-and-processed Oak Manor pot-barley product; description says bran remains. Ingredient line says *orge mondé*, revealing retailer-label variation. Search result exposed the complete product text; direct page open returned an internal tool error, so no package-image wording is claimed. |
| `WP03-PB-NAME-20261011-S07` | FoodServiceDirect.ca, [French-Canada barley listings](https://www.foodservicedirect.ca/fr-CA/foods/rice-grains/barley/barley.html), current listing for Agrofusion 10 kg. | Lists *Agrofusion Orge En Pot* separately from *Agrofusion Orge Perlé*. This is a product-title listing, not a process specification. Search result was current; direct page open returned an internal tool error. |
| `WP03-PB-NAME-20261011-S08` | Arva Flour Mill, [Céréales et grains chauds, page 4](https://arvaflourmills.com/fr/collections/cereals-grains?page=4), current listing. | Lists *Orge en pot 900 g* as a French-language grain product. Arva is in Ontario; the listing attests Canadian French-market usage but not a Québec-specific standard or process detail. Search result was current; direct page open returned an internal tool error. |
| `WP03-PB-NAME-20261011-S09` | Metro, [Cedar Phoenicia Pot Barley, English](https://www.metro.ca/en/online-grocery/aisles/pantry/pasta-rice-beans/quinoa-specialty-grains/pot-barley/p/062356506537), product `062356506537`. | English retail page names the product *Pot Barley*. The paired Québec French listing for the same UPC uses *Orge mondé*. This English listing and paired French page document the name collision; do not add *orge mondé* as a pot-barley alias. |
| `WP03-PB-NAME-20261011-S10` | Metro, [same Cedar Phoenicia UPC, French](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/orge-monde/p/062356506537), product `062356506537`. | The Québec French page uses *Orge mondé* for the same UPC sold as *Pot Barley* in Metro’s English listing. This documents the collision with OQLF and the active hulled-barley row; do not add the term as an alias. |

## Source-access limits

OQLF, the DND English and French PDFs, Nith River Milling, and Metro’s paired pages were available through direct source results. TERMIUM’s search result exposed the complete record and its modification date; its direct page open returned an internal tool error. The Healthy Planet, FoodServiceDirect, and Arva pages were visible through current indexed product results; direct page opens returned internal tool errors. Treat those retailer sources as attestation of displayed product wording, not as independent process definitions. No authoritative Québec term entry for *orge en pot* was found in this refresh.

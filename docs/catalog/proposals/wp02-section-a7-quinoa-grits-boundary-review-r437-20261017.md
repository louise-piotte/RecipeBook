# WP02 Section A7 R437: quinoa grits milling and Québec naming boundary

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal-only bounded hold. This review changes no shared ingredient references, forms, legacy identities, research ledger, manifest, recipe, plan, roadmap, or generated index.
- **Open checklist:** WP02 Section A7 remains open for other grain meals, malted/toasted flour identities, and gluten-flour equivalence; see the [active checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Prior A7 decisions kept:** R51 holds `quinoa meal` unresolved; R38 holds experimental malted quinoa flour; R434 reviews rye grits. This review concerns only **quinoa grits** as a dry milling candidate. It does not reopen or overlap those decisions.
- **Archive check:** Before this report, no prior catalog proposal or integration batch named `quinoa grits` or `quinoa grit`. The shared ledger likewise has no such candidate.
- **Scope:** Assess whether a research-described quinoa grits fraction has enough current Canadian/Québec product and French-name evidence for an active catalog identity. Keep it distinct from whole quinoa and its dry/cooked forms, quinoa meal, flour, flakes, puffed quinoa, and prepared quinoa porridge.

## Recommendation

**Keep `quinoa grits` and `quinoa grit` unallocated. Add no active reference, alias, French display, ledger candidate, or recipe link.** Do not assign `gruau de quinoa` to a dry milling product: current Canadian/Québec sources use that expression for a cooked dish made with whole quinoa. Do not construct `semoule de quinoa` without a product-matched Canadian/Québec source.

One primary food-science paper calls a dry-milled, particle-size-selected quinoa fraction “grits” and studies a medium-size fraction near 500 μm [S01]. This confirms a technical milling use of the phrase, but it does not establish a standardized retail product class or a general granulation boundary. The current Québec quinoa producer's product page names whole and toasted grains, flour, and flakes, but does not list a quinoa-grits product [S02]. This is a bounded product-list observation, not proof that no such product is sold elsewhere in Canada.

The French candidate is not established. OQLF's `quinoa` entry supplies the Québec name for the plant/food and its seeds, not for grits [reused source WP03-BLACKQUINOA-R151-20261015-S01]. OQLF's technical English/French `grits / gruau` entry is specifically in malt crushing [reused source WP03-BW-GROATS-QC-20261011-S02]. Separately, OQLF defines Québec `gruau` as a cooked oat-flake dish and says the dish sense can extend to other cereals [reused source WP03-BW-GROATS-QC-20261011-S01]. Les Producteurs laitiers du Canada uses `gruau de quinoa` for a cooked breakfast prepared with whole quinoa, milk, and apples; the recipe ingredient is white or tri-colour whole quinoa [S03]. That French phrase would therefore introduce a prepared-dish interpretation rather than identify the dry milling fraction.

| Candidate data | Disposition |
|---|---|
| Active identity / category | None; do not add `ingredient-ref-quinoa-grits`. |
| English display or aliases | None; keep `quinoa grits` and singular `quinoa grit` unallocated. |
| French display or aliases | None. Do not move prepared-dish `gruau de quinoa` onto a dry product or invent `semoule de quinoa`. |
| Ledger candidate / source entries | None; do not add `candidate-quinoa-grits` or new shared-ledger source records. |
| Forms, density, measures, unit mappings, conversions, and yields | None. Whole-quinoa or experimental fraction values are not transferable. |
| Recipe links or substitutions | None. The current bundle has no quinoa-grits demand. |

## Product and ownership boundary

| Neighbor | Live owner and boundary to preserve |
|---|---|
| Whole quinoa | `ingredient-ref-quinoa` — `quinoa / quinoa`, category `GRAIN_AND_CEREAL`, English alias `quinua`. Its `quinoa, dry / quinoa, sec` and `quinoa, cooked / quinoa, cuit` forms describe whole seed states, not a milled fraction. |
| Quinoa meal | R51's plain `quinoa meal` candidate remains held. Do not use the research grits fraction to resolve the separate meal-versus-flour terminology issue. |
| Quinoa flours | Keep `ingredient-ref-quinoa-flour`, `ingredient-ref-roasted-quinoa-flour`, `ingredient-ref-white-quinoa-flour`, `ingredient-ref-red-quinoa-flour`, and `ingredient-ref-black-quinoa-flour` distinct. A study's milling fractions or flour comparisons do not define a retail grits row. |
| Flakes and puffed quinoa | Keep `ingredient-ref-quinoa-flakes` and `ingredient-ref-puffed-quinoa` distinct; the Québec producer lists these as separate product types [S02]. |
| Prepared `gruau de quinoa` | A cooked dish made from whole quinoa in the Canadian recipe source [S03]. Do not attach the prepared-dish wording to dry grits. |

The scientific paper's fraction labels and the word `grits` are research evidence only. Its cultivar, process, and fraction sizes do not establish whether a consumer-facing quinoa-grits product is hulled, decorticated, whole-seed, or otherwise processed. No universal fraction or display should be inferred from that paper.

## Current live catalog, forms, legacy, and ledger audit

The read-only snapshot was taken from the current split seed package and ledger on 2026-10-17. Hashes identify the exact files reviewed.

| Store | Live snapshot | Finding |
|---|---:|---|
| Ingredient references | 1,729 rows; SHA-256 `a78fe43a9d263b0e893d63a544a60ae90a2841295b88e7eec9159f60bf914f5e` | No exact `quinoa grits`, `quinoa grit`, proposed reference ID, or French candidate term. Ten references have quinoa in their names/aliases: black quinoa, black quinoa flour, puffed quinoa, quinoa, quinoa flakes, quinoa flour, red quinoa, red quinoa flour, roasted quinoa flour, and white quinoa flour. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | Only `ingredient-form-quinoa-dry` and `ingredient-form-quinoa-cooked` attach to the generic quinoa row; no grits form, label, or match term exists. Both form densities are null. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact English, French, or proposed-ID owner for quinoa grits. |
| Research ledger | 2,088 records, 9,467 source entries, 8 unit-conversion records; SHA-256 `ddb29ceba01bfb71c4e3e128d9683e17a709ba848009eae352a7be49f2d4405a` | No `candidate-quinoa-grits`, `ingredient-ref-quinoa-grits`, or exact quinoa-grits phrase. Existing quinoa, dry/cooked quinoa form, flour, flakes, and puffed-quinoa records remain on their current owners. |
| Recipe manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest-listed files exist and parse. Full-corpus results are below. |

The ten current quinoa references are:

| Reference | English / French | Category | Numeric fields |
|---|---|---|---|
| `ingredient-ref-black-quinoa` | `black quinoa / quinoa noir` | `GRAIN_AND_CEREAL` | null density; empty mappings |
| `ingredient-ref-black-quinoa-flour` | `black quinoa flour / farine de quinoa noir` | `FLOUR_AND_STARCH` | null density; empty mappings |
| `ingredient-ref-puffed-quinoa` | `puffed quinoa / quinoa soufflé` | `GRAIN_AND_CEREAL` | null density; empty mappings |
| `ingredient-ref-quinoa` | `quinoa / quinoa` | `GRAIN_AND_CEREAL` | null density; empty mappings |
| `ingredient-ref-quinoa-flakes` | `quinoa flakes / flocons de quinoa` | `GRAIN_AND_CEREAL` | null density; empty mappings |
| `ingredient-ref-quinoa-flour` | `quinoa flour / farine de quinoa` | `FLOUR_AND_STARCH` | null density; empty mappings |
| `ingredient-ref-red-quinoa` | `red quinoa / quinoa rouge` | `GRAIN_AND_CEREAL` | null density; empty mappings |
| `ingredient-ref-red-quinoa-flour` | `red quinoa flour / farine de quinoa rouge` | `FLOUR_AND_STARCH` | null density; empty mappings |
| `ingredient-ref-roasted-quinoa-flour` | `roasted quinoa flour / farine de quinoa torréfiée` | `FLOUR_AND_STARCH` | null density; empty mappings |
| `ingredient-ref-white-quinoa-flour` | `white quinoa flour / farine de quinoa blanc` | `FLOUR_AND_STARCH` | null density; empty mappings |

## Picker projection

The current `IngredientReferenceSearchIndex` searches reference terms and attached form terms; it prefers complete word phrases before substring fallback. Static projections from the live references and forms are:

| Query | Current result | Projection / disposition |
|---|---|---|
| `quinoa grits`; `quinoa grit`; `grits de quinoa` | None | Keep unallocated. |
| `gruau de quinoa`; `semoule de quinoa` | None | Do not add without a product-matched French display. |
| `quinoa` | Ten references listed above | An English-only hypothetical grits row would add an eleventh broad `quinoa` result; no row is proposed. |
| `grits` | Six references: attiéké, barley grits, buckwheat grits, corn grits, hominy grits, and sorghum grits | An English-only hypothetical grits row would add a seventh result; no row is proposed. |
| `gruau` | Eleven references | Adding unsupported `gruau de quinoa` would broaden this query to twelve and would overlap the prepared-dish wording. Do not add it. |
| `quinoa flour`; `farine de quinoa` | Five quinoa-flour references | No effect from the proposed hold. |
| `quinoa meal` | None | Preserve R51's separate unresolved boundary. |

These are static projections from the current seed data and search implementation, not a live UI or emulator test.

## Complete bundled recipe demand

All **114** manifest paths were read and parsed, covering **1,123 structured ingredient rows**. Every ingredient row and each complete serialized recipe was scanned for `quinoa grits`, `quinoa grit`, `grits de quinoa`, `gruau de quinoa`, `gruaux de quinoa`, `semoule de quinoa`, `quinoa meal`, `whole quinoa meal`, `quinoa flour`, `farine de quinoa`, and `quinoa flakes`. The scan found **zero candidate phrase hits in recipe files and zero candidate phrase hits in ingredient rows**.

A broad `quinoa` scan found two recipe files and one structured ingredient row. The structured row is recipe 016, **Quinoa Bites / Bouchées de quinoa**, which explicitly links `2 cups cooked quinoa` to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`. The other file contains a recipe-text mention without a quinoa-grits ingredient line. Neither provides demand for a dry grits product, and no links or measures should be added.

## Measures, density, and substitutions

- The live quinoa and quinoa-flour references have null default densities and empty unit mappings; the two whole-quinoa forms have null density. No grits form or grits-specific observation exists.
- Health Canada's CNF food code 4495 is explicitly **“Grains, quinoa, dry / Grains céréaliers, quinoa, sec”**. Its published 100 mL = 71.9 g, 250 mL = 179.6 g, and 20 g serving apply to dry whole quinoa, not the research-milled grits fraction [reused source WP03-S5; see also WP03-QUINOA-DRY-CNF2015-R303-20261016-S01]. Do not transfer them.
- The research paper's particle-size fractions describe one cultivar and experimental milling/fractionation. They are not household measures, bulk density, cooking ratios, or recipe yields [S01].
- The current A7 candidate has no conversion or substitution evidence. Do not infer a conversion from whole quinoa, quinoa flour, or a prepared porridge recipe, and add no form substitution, package yield, or recipe-line link.

## Sources checked on 2026-10-17

Source IDs prefixed **Reused** already exist in the shared research ledger and are cited here without proposing duplicate ledger entries. New IDs below are local to this proposal only.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-QUINOA-GRITS-R437-20261017-S01` | García Solaesa et al., [“Protein and lipid enrichment of quinoa (cv. Titicaca) by dry fractionation”](https://www.sciencedirect.com/science/article/pii/S0268005X19327079), *Food Hydrocolloids* 105 (2020), article 105770, DOI [10.1016/j.foodhyd.2020.105770](https://doi.org/10.1016/j.foodhyd.2020.105770). | Primary research describes dry-milled quinoa flour/grits fractions and a medium fraction near 500 μm. | One cultivar and research process; no Canadian/Québec retail label, universal grits specification, French display, household measure, density, or reusable recipe behavior. |
| **Reused:** `WP03-QFLAKES-20261010-S06` | Quinoa du Québec, [Nos produits pour les professionnels](https://quinoaquebec.com/nosproduitprofessionnel), current Québec manufacturer product list. | Separately names whole/toasted grains, quinoa flour, and quinoa flakes; confirms these neighboring product boundaries and local French terms. | This page is one manufacturer's range, not an exhaustive market survey. It does not list a quinoa-grits SKU or establish that none exists elsewhere. |
| `WP02-A7-QUINOA-GRITS-R437-20261017-S02` | Les Producteurs laitiers du Canada, [Gruau de quinoa aux pommes et à la cannelle](https://producteurslaitiersducanada.ca/fr/plaisirs-laitiers/recettes/gruau-de-quinoa-aux-pommes-et-la-cannelle), current French-language recipe page. | Uses `gruau de quinoa` for a cooked breakfast and lists whole white or tri-colour quinoa as the grain ingredient, cooked with milk and fruit. | A prepared dish recipe, not a dry grits product or an ingredient naming standard. Its recipe portion is not transferable to grits. |
| **Reused:** `WP03-BLACKQUINOA-R151-20261015-S01` | OQLF, [quinoa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa), updated 2025. | Supports Québec `quinoa` as the name for the plant/food and identifies its edible seeds and pseudocereal status. | Does not define flour, meal, grits, particle size, or a compound French display for quinoa grits. |
| **Reused:** `WP03-BW-GROATS-QC-20261011-S01` | OQLF, [gruau (GDT), prepared-dish sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), 2002. | Defines Québec `gruau` as a cooked oat-flake dish and notes that the dish sense can extend to other cereals. | Prepared-food sense; not a dry quinoa-grits label. |
| **Reused:** `WP03-BW-GROATS-QC-20261011-S02` | OQLF, [gruau (GDT), malt-crushing sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), 1983. | Gives the English equivalent `grits` for technical grits in the malt-crushing domain and describes milling fractions. | Brewing/malt terminology; it does not name or translate a quinoa-grits product. |
| **Reused:** `WP03-S5` and `WP03-QUINOA-DRY-CNF2015-R303-20261016-S01` | Health Canada, [CNF serving portion: grains, quinoa, dry, food code 4495](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495). | Gives bilingual naming and edition-specific serving portions for dry whole quinoa. | Not a milled fraction; no values are transferred to quinoa grits. |

## Disposition and reopening condition

Keep `quinoa grits` / `quinoa grit` outside active references, forms, aliases, and the shared ledger. Preserve whole quinoa and its dry/cooked forms, R51's held quinoa-meal boundary, and the separate flour/flakes/puffed rows. Add no measurement, form, conversion, yield, recipe link, or substitution. This proposal-only review requires no tests.

Reopen only if a current Canadian or Québec source identifies a standalone dry quinoa-grits product, gives a product-matched French label, and supplies enough milling detail to distinguish it from whole quinoa, meal, and flour. Reassess measurements from that exact product; do not transfer the CNF whole-quinoa portions or the experimental study fractions.

# WP02 Section A7 R993: einkorn bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This review writes no shared catalog JSON, forms, ledger data, plan, roadmap, recipes, generated files, or tests.
- **Open-plan anchor:** Section A7 remains open to review other grain meals and milling products, including the unresolved wheat-meal question ([catalog plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Selected gap:** Generic einkorn bran, the edible bran fraction from cultivated *Triticum monococcum*, proposed as `einkorn bran / son de petit épeautre`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference if accepted. Keep the French display provisional pending a Québec-facing bran label or terminology review. Add no aliases, forms, measures, densities, conversions, recipe links, yields, or active substitution rules.

## Recommendation and identity boundary

The selected identity is a generic grain-specific bran fraction, not a commercial product roster. A primary food-science study names two einkorn genotypes, identifies them as *Triticum monococcum*, separates and studies their bran, and uses the study-specific bran samples in common-wheat bread. A French product title independently attests the ingredient wording `son de petit épeautre`; current Québec-facing sources and the reused Government of Canada terminology record support `petit épeautre` as the French name for the einkorn taxon. Together these support the paired identity `einkorn bran / son de petit épeautre`, with the Québec status of the bran compound left provisional.

Keep the proposed scope to bran from cultivated einkorn. Do not broaden it to bran from spelt, emmer, common wheat, or all hulled wheats. Keep einkorn bran distinct from einkorn flour, einkorn berries, wholegrain einkorn semolina (still unresolved), and the existing generic wheat-bran and spelt-bran rows. The primary study's cultivars, laboratory milling, super-fine grinding, bread formula, sample properties, and results remain study-specific.

The study replaced 20% of common-wheat flour with each of seven ancient-wheat bran samples, including two einkorn genotypes. Its raw bran was laboratory-ground through a 0.5 mm outlet grid, and its water quantity was optimized for each formula. This is bounded evidence of a bread application, not a general home-baking replacement ratio or adjustment. Keep substitution research blocked for reusable behavior and add no runtime rule.

## Search log

Exact web-search queries used for candidate selection, naming, culinary use, measurement, and substitution review:

| Exact query | Result used or disposition |
|---|---|
| `"einkorn bran" food` | Surfaced the peer-reviewed ancient-grain bran study and direct product naming. |
| `"einkorn bran" baking food product` | Surfaced human-food and bakery-use evidence; product-only claims were not generalized. |
| `"einkorn bran" bread flour replacement study` | Surfaced the primary wheat-bread trial described below. |
| `"Triticum monococcum" bran human food bread study` | Confirmed species-specific bran research and bread use. |
| `"son de petit épeautre" moulin` | Surfaced Moulin des Moines' exact French product title. |
| `"son de petit épeautre" "Triticum monococcum"` | Found the exact French bran phrase; species naming is corroborated separately by the reused TERMIUM record and Québec einkorn-flour evidence. |
| `site:vitrinelinguistique.oqlf.gouv.qc.ca engrain blé Triticum monococcum` | Did not find a Québec food-bran name; the returned OQLF `engrain` result is a tobacco-manufacturing term and is excluded. |
| `site:termiun.gc.ca einkorn French engrain` | Surfaced the Government of Canada TERMIUM entry mapping *T. monococcum* to `petit épeautre` and `engrain`; reused only for taxon/base-name support. |
| `site:quebec.ca "petit épeautre"` | Surfaced the Québec Food Directory's einkorn-flour product; it supports local use of the base species phrase, not a bran label. |
| `"einkorn bran" "1 cup" grams` | No reusable household measure found. |
| `"einkorn bran" density "g/ml"` | No generic density or mass-volume mapping found. |
| `"einkorn bran" replacement wheat flour bread` | Confirmed the study-specific 20% flour-replacement experiment; no general home-recipe rule was found. |
| `"einkorn bran" recipe measure cup` | No transferable measure found. |

The separate exploratory searches `"teff bran" human food ingredient` and `"teff bran" baking food product` returned evidence that teff is commonly milled whole because its small grains are difficult to separate. No distinct generic teff-bran ingredient was selected from that evidence.

## Source register and transferability

New source IDs are proposal-local and unused in the current ledger. Existing sources are identified as reused and remain attached to their current owners.

| Source ID | Source, locator, and support | Limits and transferability |
|---|---|---|
| **WP02-A7-EINKORN-BRAN-R993-20261019-S01** | Oumayma Toumi, Costantino Fadda, Alessandra Del Caro, and Paola Conte, [“Using Bran of Ancient and Old Grains for Wheat Bread Production”](https://pmc.ncbi.nlm.nih.gov/articles/PMC11898424/), *Foods* 14(5), 860 (2025), DOI [10.3390/foods14050860](https://doi.org/10.3390/foods14050860). Abstract; Introduction; §2.1 and Table 1; §2.6 breadmaking procedure. | The abstract tests 20% replacement of wheat flour with bran from seven ancient grains. The introduction and Table 1 identify einkorn as *T. monococcum*; §2.1 lists Monlis and Norberto einkorn genotypes and says their resulting brans were used. The methods specify a laboratory 0.5 mm outlet grid and a controlled straight-dough bread process with water optimized by formula. This supports the generic species-specific milling fraction and human-food culinary use. It does not establish a consumer grade, generic particle size, household amount, density, transferable replacement ratio, or formula adjustment. Genotypes, preparation, sample composition, 20% formulation, water setting, and outcomes stay with the study. |
| **WP02-A7-EINKORN-BRAN-R993-20261019-S02** | Moulin des Moines, [“Son de petit épeautre bio”](https://moulindesmoines.com/sons-bio/1300-son-de-petit-epeautre-bio-3347437779824.html), product title and ingredient description, accessed 2026-10-19. | Directly attests the French name `son de petit épeautre` and describes it as an outer cereal layer. Use it only for the exact French ingredient wording and generic fraction name. The page's organic status, SKU/EAN, 500 g package, origin list, price, nutrition panel, and suggested uses are product-scoped and are not transferred to the generic identity. This French product page does not establish a Québec-preferred term. |
| Reused `WP03-EINKORN-BERRIES-20261012-S04` | Government of Canada Translation Bureau, [TERMIUM Plus: EINKORN](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=EINKORN), record 2. Current owner: `ingredient-ref-einkorn-berries`. | Maps *Triticum monococcum* to English `einkorn` and French `petit épeautre` / `engrain`. Reuse only for the taxon and base-name mapping; it does not define bran or settle a Québec consumer label. |
| Reused `WP02A4-EI-S01` | La Milanaise, [farine de petit épeautre entière biologique](https://lamilanaise.com/produits/farine-de-petit-epeautre-entiere-biologique/), product heading and distinction note. Current owner: `ingredient-ref-einkorn-flour`. | Québec manufacturer wording supports `farine de petit épeautre` as a local base-grain phrase and distinguishes petit épeautre from spelt/épeautre. Reuse only for the base species name and distinction, not as einkorn-bran evidence or for its product's organic, whole-grain, grade, or performance claims. |
| Reused `WP02A4-SP-S01` | Office québécois de la langue française, [GDT: épeautre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre). Current owner: `ingredient-ref-spelt-bran`. | Maps Québec French `épeautre` to English `spelt` and *Triticum aestivum* subsp. *spelta*. Reuse only to preserve the existing species boundary; it does not name einkorn bran. |
| Boundary-only reference, not proposed for ledger transfer | United States Pharmacopeia, [Wheat Bran](https://doi.usp.org/USPNF/USPNF_M89020_01_01.html), Dietary Supplement Monograph preview, definition. | This dietary-supplement definition includes bran from “other common einkorn and emmer wheat cultivars” within its broad wheat-bran scope. It is relevant to overlap review, not to a Québec recipe-facing name or a transferable product specification. Preserve the active `wheat bran` row and do not claim these identities are taxonomically exclusive under every standard. |

## Ownership and recipe-demand audit

Read-only checks covered the current split seed package, forms, legacy identities, ledger, A7 plan, relevant proposals, and all bundled recipe files.

| Surface | Current snapshot | Finding |
|---|---:|---|
| Ingredient references | 2,007 rows | No `ingredient-ref-einkorn-bran`, exact `einkorn bran` name/alias, or exact `son de petit épeautre` owner. Nearest active owners are `ingredient-ref-einkorn-flour` — `einkorn flour / farine de petit épeautre`; `ingredient-ref-einkorn-berries` — `einkorn berries / grains de petit épeautre`; `ingredient-ref-wheat-bran` — `wheat bran / son de blé`; and `ingredient-ref-spelt-bran` — `spelt bran / son d’épeautre`. Preserve them. |
| Ingredient forms | 205 rows | No einkorn-bran form, label, or match-term owner. The study's super-fine treatment is not a general consumer form. |
| Legacy import identities | 55 candidates | No matching ID or exact `einkorn bran`, `son de petit épeautre`, `son d’engrain`, or `engrain bran` candidate. No legacy promotion or merge is proposed. |
| Research ledger | 2,413 records | No `ingredient-ref-einkorn-bran`, `candidate-einkorn-bran`, new proposal source ID, or either new source URL is present. `candidate-wholegrain-einkorn-semolina` is an adjacent, unresolved semolina candidate and does not own bran. Reuse the TERMIUM and La Milanaise source records above without copying or changing their owners. |
| Recipe package | 114 files; 1,123 ingredient rows | Full recipe JSON and ingredient-row text were scanned for `einkorn bran`, `son de petit epeautre`, `son d'engrain`, `einkorn`, `engrain`, `petit-epeautre`, and `Triticum monococcum`. There were 0 file matches and 0 ingredient-row matches. No recipe link or demand-driven measurement is proposed. |

### Nearby identity boundaries

- The active `spelt bran / son d’épeautre` identity was separately supported as a species-qualified bran fraction in R887. Einkorn is *T. monococcum*, while OQLF's `épeautre` entry is *T. aestivum* subsp. *spelta*. Keep these rows separate; do not add `son d’épeautre` to the proposed French aliases.
- The active `wheat bran / son de blé` identity has no aliases. The USP definition above shows that some standards use `wheat bran` broadly enough to include einkorn cultivars; the current catalog also preserves source-qualified bran identities such as spelt bran. Keep both rows unchanged, add no `einkorn bran` alias to wheat bran, and avoid claiming that the two terms are mutually exclusive in every milling or regulatory classification.
- The active einkorn flour and berries rows share the crop phrase `petit épeautre`; the new display retains the `son` fraction qualifier so searches distinguish bran, flour, and whole grain. Keep `engrain` out of aliases: TERMIUM supports it as a species name, but no Québec bran label was found and the OQLF search result is for a tobacco-manufacturing sense.
- R987 keeps wholegrain einkorn semolina unresolved because its milling class and Québec wording remain unestablished. This bran proposal is separate: it does not use semolina evidence, resolve the semolina candidate, or create an einkorn-meal alias. Existing holds remain intact.

## Measurement and contextual-substitution assessment

### Measurement

No reusable household measurement is supported. The primary study reports experimental bread ratios, sample analyses, and particle-size testing; none is a cup measure or mass-volume relation. The French product page gives a 500 g package and nutrition values per 100 g, but these are product-specific and do not establish a household portion or density. Exact-name searches for a cup amount and `g/ml` density found no transferable value. If integrated, set measurement research to `researched_no_supported_value`, keep `defaultDensity` null and `unitMappings` empty, and do not add an observation from the commercial package or the study.

### Context-scoped substitution

The 2025 study directly tests a context-bounded wheat-bread formulation in which 20% of total flour mass is replaced with the studied einkorn-bran samples. That formula uses a specific pair of einkorn genotypes, lab-ground super-fine bran, common-wheat type-00 flour, a straight-dough method, and individually optimized water. Record this only as a source-bounded research finding if accepted. It is not a home-recipe recommendation, transferable 20% ceiling, or general flour substitution rule. Keep substitution research `blocked_pending_evidence` for reusable recipe behavior and add no active rule or recipe-line substitution.

## Proposed minimal delta for later integration

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-einkorn-bran",
  "nameEn": "einkorn bran",
  "nameFr": "son de petit épeautre",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Proposed ledger state: `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`. Use the two R993 source records for the identity and retain the source-specific bread finding only on the ledger. Reuse the TERMIUM, La Milanaise, and OQLF source records for their narrow current scopes. Keep aliases, forms, measures, unit mappings, recipe links, conversions, yields, global rules, contextual rules, and recipe-line substitutions empty.

## Queue scope and remaining gaps

The named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal line is product-only. R875 already records further work on that one item as out of scope because **commercial-product counts do not add ingredient diversity**. Stop that line here: do not research variants, treat the named meal as a generic identity, or transfer its product-only evidence. Preserve the historical R605 record and all existing branded entries and source-scoped claims. No other brand, product-line, flavour-family, SKU, or retailer-variant roster was pursued for R993.

Remaining review points are the Québec status of the French bran compound, whether the project's broad wheat-bran display should be explicitly described as an umbrella alongside species-qualified bran identities, and the absence of transferable household measures or recipe substitution behavior. The current evidence supports an identity-only proposal while those limits remain visible. The bundled recipe corpus contains no einkorn-bran demand.

This proposal is the only requested write. No tests, build, emulator run, or deployment were performed.

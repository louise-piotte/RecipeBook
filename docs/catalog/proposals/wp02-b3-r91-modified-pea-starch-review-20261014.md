# WP02 B3 R91 modified pea starch identity review

- **Reviewed:** 2026-10-14.
- **Status:** Reviewed and integrated on 2026-10-14; see the [integration record](../batches/wp02-b3-modified-pea-starch-identity-integration-20261014/README.md).
- **Scope:** Resolve the still-open chemically modified pea-starch boundary left by the integrated `ingredient-ref-pea-starch` review. This is a distinct follow-up in Section 04 B2/B3, not a repeat of native pea starch, R89 defatted pistachio flour, or R90 white-bean flour.
- **Recommendation:** Add one identity-only `modified pea starch / amidon de pois modifié` reference. Keep it separate from `pea starch / amidon de pois`; record the single bread-study result as bounded formulation evidence, with no reusable substitution rule or kitchen conversion. This recommendation was adopted.

## Why this is an open boundary

The live plan still leaves the Section 04 B2/B3 alternative-flour and regional-starch checklist open. The integrated pea-starch identity and Québec terminology follow-up explicitly left modified-pea-starch wording outside the native row. The follow-up also rejected putting this qualifier on the unmodified identity as an alias. See the [pea-starch identity proposal](wp02-b3-pea-starch-identity-review-20261012.md), its [terminology follow-up](wp02-b3-pea-starch-quebec-term-adjudication-20261012.md), and the two [integration records](../batches/wp02-b3-pea-starch-identity-integration-20261012/README.md) and [terminology integration](../batches/wp02-b3-pea-starch-quebec-terminology-integration-20261012/README.md).

The pre-integration snapshot was **1,421 ingredient references, 104 forms, 1,760 ledger records, 63 legacy candidates, 114 manifest-listed recipes, and 1,123 ingredient rows**. The R90 white-bean-flour hold was the latest B2/B3 roadmap item before this review, and the broader section remains open.

## Integrated identity and exact JSON delta

CFIA's current English and French incorporated common-name tables distinguish ordinary starch naming from modified starch naming and require the plant source in both cases. A current Québec French Selection listing and the English listing for the same 135 g product and SKU show the exact pair `Modified pea starch` / `Amidon de pois modifié`. Roquette and Emsland document modified pea starch as a distinct ingredient family from native pea starch, while their product pages also show that the modification and function can differ by product. [S01–S08]

Add this single reference:

```json
{
  "id": "ingredient-ref-modified-pea-starch",
  "nameEn": "modified pea starch",
  "nameFr": "amidon de pois modifié",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The proposal treats the source-named class as the identity boundary. It does not identify the modification chemistry of the Selection candy ingredient, nor claim that the several modified grades in supplier portfolios are technically interchangeable. Do not add `modified starch` or `amidon modifié` as aliases: those unqualified phrases omit the plant source that CFIA's naming rule requires. Do not add grade or process terms such as `E1420`, `E1412`, `cross-linked`, `acetylated`, `hydroxypropylated`, or `pregelatinized` as aliases or forms without a source tying a specific term to a general consumer-facing identity. [S01–S08]

## Exact ownership and picker projection

I checked normalized names and aliases in active references, form labels and match terms, legacy candidates, and ledger record IDs. There is no exact owner for `modified pea starch`, `amidon de pois modifié`, or `ingredient-ref-modified-pea-starch`. The two unqualified terms are already owned by `ingredient-ref-pea-starch`: `pea starch` is its English display and `amidon de pois` its French display. Its `native pea starch` English alias remains on that row. The modified wording is mentioned in the earlier pea-starch research, but has no active identity or dedicated ledger record.

The picker uses complete normalized phrase matching first and substring matching only when there are no phrase matches. The projection below adds the integrated row with **empty alias arrays**:

| Query | Current result | With integrated row | Effect |
|---|---|---|---|
| `modified pea starch` | None | New row only | Exact English phrase resolves to the modified identity. |
| `amidon de pois modifié` | None | New row only | Exact Québec French phrase resolves to the modified identity. |
| `pea starch` | `ingredient-ref-pea-starch` | Existing and integrated rows | The broad base phrase offers native/general and modified choices. The existing identity remains visible. |
| `amidon de pois` | `ingredient-ref-pea-starch` | Existing and integrated rows | The French base phrase offers both identities; the unqualified existing row remains visible. |
| `native pea starch` | `ingredient-ref-pea-starch` | Same single row | Native-specific wording remains uniquely owned by the existing identity. |
| `modified starch` / `amidon modifié` | None | None | Keep the source-plant-unspecified terms unassigned. |
| `pea` | 7 rows | 8 rows | Adds the integrated identity to the broad family query. |
| `peas` | 8 rows | 8 rows | No change; singular `pea` does not match plural `peas`. |
| `starch` | 19 rows | 20 rows | Adds one result to the existing broad starch query. |
| `amidon` | 13 rows | 14 rows | Adds one result to the existing broad French starch query. |
| `pois` | 22 rows | 23 rows | Adds one result to the existing broad pea/pulse query. |

The exact English and French modified phrases are unambiguous. The shorter `pea starch` and `amidon de pois` queries will show both related identities, which reflects the source-backed distinction and does not collapse or hide either row. No other active row, form, legacy candidate, or ledger ID is being reassigned.

## Bundled recipe demand

All 114 files listed by the pre-integration seed manifest and their 1,123 ingredient rows were scanned, including complete recipe JSON text and ingredient-line fields. There are **zero** complete-phrase hits for `modified pea starch` and **zero** for `amidon de pois modifié`; no line was linked to the new ID. No recipe link or recipe-driven alias was added.

## Measurements, conversions, and substitution evidence

- **Kitchen measure and density:** No reviewed food-label, food-grade supplier, or recipe-study source provides a reproducible spoon/cup mass or ingredient-level bulk density for modified pea starch. Roquette's 0.5 kg order quantity is a commercial package size, and the Selection product's 135 g is the mass of finished candy; neither reports the starch quantity or a kitchen measure. Keep `defaultDensity: null` and `unitMappings: []`. [S03–S04, S06, S09]
- **Numeric result excluded from conversion data:** Roquette's 2026 LYCOAT RS 780 study reports bulk and tapped densities for granulated mannitol/maize-starch blends made with a 3% pharmaceutical binder, including 0.63/0.76 g/mL for dry-form binder and 0.65/0.81 g/mL for liquid-form binder. These are densities of finished pharmaceutical granules, not the pea-starch ingredient; do not use them as a density or volume conversion. [S10]
- **Bounded human-food formulation result:** Sanz-Penella et al. studied the high-resistant-starch modified pea starch PeaP in wheat bread. The publisher abstract reports that replacing flour with PeaP up to 20% did not significantly hinder dough machinability, while 30% negatively affected mixing and overmixing; acceptable bread-quality changes were reported through 10–20%. This is evidence for one study-specific bread formulation, not a general 1:1 flour substitution or an exchange rate for other modified pea starches. The article page exposes the abstract while the full paper is subscription-gated, so this review does not infer omitted formula details. [S08]
- **Decision boundary:** Record that one contextual study supports a limited formulation finding, but add no `SubstitutionRule`, `ContextualSubstitutionRule`, ingredient form, or recipe-line substitution. Do not transfer the study's percentages to cakes, cookies, sauces, general starch thickening, native pea starch, or other modified grades. The active JSON has no numeric field for the study result.

## Integrated research-ledger record

The integration added one `ingredient_reference` record keyed by `ingredient-ref-modified-pea-starch`, with the ten sources in the source register and one accepted decision. Its state fields are:

```json
{
  "recordId": "ingredient-ref-modified-pea-starch",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_supported",
  "measurementObservations": [],
  "substitutionFindings": [
    {
      "findingId": "modified-pea-starch-peap-wheat-bread-study-r91",
      "researchState": "researched_supported",
      "replacements": [
        { "ingredientRefId": "ingredient-ref-modified-pea-starch" }
      ],
      "context": "One wheat-bread study using the high-resistant-starch modified pea starch PeaP as a partial wheat-flour replacement; the paper's wheat-flour source is not mapped to an existing reference.",
      "basis": "The publisher abstract reports flour replacement up to 20% without significant hindrance to dough machinability, with 30% negatively affecting mixing and overmixing; acceptable bread-quality changes were reported through 10–20%.",
      "limitations": [
        "This is a study-specific formulation result, not a general flour or starch substitution, kitchen conversion, or active recipe rule.",
        "The study product is not identified as the Selection candy ingredient or as equivalent to all modified pea-starch grades.",
        "The full paper is subscription-gated on the publisher page; do not infer omitted methods or formula details."
      ],
      "sourceIds": [
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S09"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add modified pea starch / amidon de pois modifié as a distinct identity from the existing native/general pea-starch row. Keep aliases and forms empty, density null, and unit mappings empty. Record the single high-resistant-starch bread-study finding as source-specific only; add no active conversion, substitution rule, or recipe link.",
      "sourceIds": [
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S01",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S02",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S03",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S04",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S05",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S06",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S07",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S08",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S09",
        "WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S10"
      ]
    }
  ]
}
```

The source register supplies each source object's URL, locator, support, and limit for the ledger. No `IngredientForm`, `SubstitutionRule`, `ContextualSubstitutionRule`, unit conversion, measurement observation, recipe link, or recipe-row edit was added.

## Source register

All sources were accessed on 2026-10-14. The ten IDs use the new prefix `WP02-B3-MODIFIED-PEA-STARCH-20261014-R91`; a prefix collision check found no existing matching source IDs.

| Source ID | Source and direct link | Supports | Limits |
|---|---|---|---|
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S01** | CFIA, [Common Names for Ingredients and Components](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components), last amended 2026-02-11, Table 1 items 20–21. | English rule names ordinary starch as plant name + “starch” and modified starch as “modified” + plant name + “starch.” | Establishes Canadian common-name construction, not a grade specification, exact modification method, household measure, or substitution. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S02** | CFIA, [Noms usuels d'ingrédients et de constituants](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants), last amended 2026-02-11, Tableau 1 articles 20–21. | French rule names modified starch as `amidon de` + plant name + `modifié` or `modifiée`; with `pois`, it supports the structure `amidon de pois modifié`. | Establishes Canadian common-name construction; does not identify the modification chemistry of the Selection product. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S03** | Metro, [Selection Sour Peach Ring Candy](https://www.metro.ca/en/online-grocery/aisles/snacks/sweet-snacks-candy/candy-gum/sour-peach-ring-candy/p/059749970310), product 059749970310, 135 g. | English listing ingredient declaration includes `Modified pea starch`. | Finished candy label, not a standalone starch package; it gives no ingredient proportion or grade. The page showed out-of-stock at the selected store and warns product information can change. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S04** | Metro, [Bonbons anneaux à la pêche surs Selection](https://api.metro.ca/epicerie-en-ligne/allees/collations/collations-sucrees-et-bonbons/bonbons-et-gommes/bonbons-anneaux-a-la-peche-surs/p/059749970310), product 059749970310, 135 g. | French listing gives `Amidon de pois modifié` in the ingredient declaration for the same SKU. | Retail listing rather than manufacturer ingredient specification; page fetch returned a cache miss in this review, so this wording was corroborated against the directly opened Jean Coutu French listing S05. It gives no amount or grade. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S05** | Jean Coutu, [Bonbons anneaux à la pêche surs Selection](https://www.jeancoutu.com/magasiner/categories/confiserie-et-epicerie/bonbons/bonbon/bonbons-anneaux-a-la-peche-surs/p/059749970310), product 059749970310, 135 g. | Directly opened French listing declares `Amidon de pois modifié`; independently corroborates the Québec French wording. | Finished mixed candy, not standalone starch; it gives no starch amount or grade. It showed out of stock at the selected store and is a retailer listing, not maker documentation. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S06** | OQLF, [amidon modifié (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357365/amidon-modifie), updated 2004. | Preferred Québec term `amidon modifié`; defines chemically treated starch and notes changes to viscosity or gelling. | General terminology entry, not a pea-specific compound or the exact modification method in the candy. Its stated update date is 2004. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S07** | Roquette, [CLEARAM LG 00 20](https://www.roquette.com/food-nutrition/product-catalog/clearam-lg-00-20), current food product page. | Names a specific modified pea starch (E1420) with low swelling temperature and gel strength, with food-industry applications including instant noodles and surimi. | B2B product evidence only; does not identify the Selection candy ingredient, represent all modified pea starch, or establish consumer usage ratios or kitchen measures. The 0.5 kg order unit is not a recipe portion. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S08** | Emsland Group, [Pea starch & Modified pea starch](https://www.emsland-group.de/en/our-ingredients/peas/pea-starch-modified-pea-starch/), current manufacturer portfolio. | Explicitly distinguishes native and modified pea-starch families and says each has cold-water-soluble variants; supports the processing boundary and within-family variation. | Industrial portfolio description; no Canadian/Québec consumer label, food-grade SKU match to Selection, or household measure/substitution. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S09** | Sanz-Penella et al., [Impact of the addition of resistant starch from modified pea starch on dough and bread performance](https://link.springer.com/article/10.1007/s00217-010-1294-7), *European Food Research and Technology* 231 (2010), 499–508, DOI 10.1007/s00217-010-1294-7. | Primary study abstract reports the specific PeaP wheat-bread result: up to 20% flour replacement did not significantly hinder machinability; 30% harmed mixing/overmixing; bread-quality changes were acceptable up to 10–20%. | Specific high-resistant-starch product and wheat-bread formula, not a universal substitution rule or density. Full paper is subscription-gated on the publisher page, so unshown method/formula details were not inferred. |
| **WP02-B3-MODIFIED-PEA-STARCH-20261014-R91-S10** | Roquette, [LYCOAT RS 780 modified pea starch as binder for wet granulation](https://www.roquette.com/health-pharma/resources/lycoat-R-rs-780-as-binder), published 2026-10-01. | Reports numeric bulk/tapped densities for granulated mannitol/maize-starch blends using 3% hydroxypropyl pea-starch binder; useful to identify a product- and matrix-specific density boundary. | Pharmaceutical/nutraceutical granules rather than starch powder or human food. The reported granule densities cannot support this ingredient's default density or any kitchen conversion. |

## Static checks actually run

- Read the current `AGENTS.md`, `Requirements.md`, WP02 baking packet, Section 04 B2/B3 checklist, latest roadmap entries, active pea-starch integration records, and previous pea-starch identity/terminology proposals.
- Recomputed the pre-integration reference, form, ledger-record, legacy-candidate, recipe-file, and recipe-row counts from JSON.
- Mirrored `IngredientReferenceSearchIndex` normalization and complete-phrase-first matching against references and forms, then projected the integrated row for the listed picker queries.
- Checked exact normalized term and ID ownership across references, forms, legacy candidates, and ledger record IDs; checked the source-ID prefix against the pre-integration ledger.
- Scanned all manifest-listed recipe JSON files for complete English and French candidate phrases and existing candidate-ID links.
- Verified CFIA English and French common-name tables, the current Metro English page and French search listing, the Jean Coutu French listing, OQLF terminology, manufacturer product pages, and the primary study online.
- No Gradle, app, instrumentation, or emulator tests were run; this change only adds database JSON data, which the current `AGENTS.md` exempts from testing.

The proposal records an identity review, one source-specific bread formulation, and explicit numeric limits. It does not resolve the broader B2/B3 checklist or claim WP02 is complete.

# WP02 Section 04 B3 R96 — modified potato starch identity review

- **Reviewed:** 2026-10-14.
- **Status:** Accepted and integrated on 2026-10-14 as one identity-only reference and one research-ledger record; no recipe or active substitution rule was added.
- **Open checklist:** Section 04 B2/B3 remains open under the flour-and-starch checklist. This is a distinct plant-specific modified-starch review after the integrated modified-pea, modified-corn, and modified-tapioca starch reviews.
- **Scope:** Review the current food ingredient name `modified potato starch` and its Québec French wording, picker boundary, recipe demand, measures, and replacement evidence.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference and one source-bounded cookie-study substitution finding. Keep measurements, forms, density, mappings, recipe links, conversions, yields, and active substitution rules empty.
- **Source-ID prefix:** `WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96`; no collision was found in the active ledger or catalog/proposal files.

## Recommendation and identity boundary

**Add `modified potato starch / amidon de pomme de terre modifié` as an identity distinct from ordinary potato starch and from modified corn, pea, and tapioca starch.** CFIA's current English table names modified starch as “modified” plus the plant name plus “starch”; its French table gives `amidon de` plus the plant name followed by `modifié` or `modifiée`. Current Canadian product declarations use the exact English and French pair. [S01–S06]

The identity is the plant-qualified ingredient class only. It does not specify the modification chemistry, grade, potato variety, resistant-starch content, or performance. KMC's current supplier portfolio describes multiple potato-starch variants selected for different heat, shear, pH, and retrogradation behavior. A separate primary cookie study uses starch made from three Pakistani potato varieties and modified by a particular acid-hydrolysis and heat/cooling sequence; neither source makes that study material equivalent to every commercial product labelled modified potato starch. [S07–S08]

Use `amidon de pomme de terre modifié` as the French display. It is the French common-name construction in ACIA's current incorporated table, appears in current Canadian product labels, and uses OQLF's preferred general term `amidon`; OQLF says `fécule` is used more specifically for starch from tubers and confirms its use for potato starch. Retain `fécule de pomme de terre modifiée` as one source-attested French search alias because Springer's Canadian bilingual ingredient declaration uses that wording for the potato-derived modified ingredient. [S02–S06]

Do not add generic `modified starch / amidon modifié`, `modified food starch`, `amidon modifié de pomme de terre`, `modified potato flour`, E-number names, or process terms such as `pregelatinized`, `acetylated`, `cross-linked`, or `resistant potato starch` as aliases. The common-name source requires the botanical source for a modified-starch declaration, and the available labels do not make these broader or treatment-specific phrases synonyms for this row. Do not change the existing potato-starch row. [S01–S04, S07–S08]

Do not add `potato flour` as an alias. OQLF's potato-starch entry also lists `potato flour` among its English translations, but the catalog has an independently supported whole-potato-flour identity and the project keeps that product distinct from extracted starch. The modified row should not collapse that existing boundary. [S04; existing `ingredient-ref-potato-flour` and `ingredient-ref-potato-starch`]

## Recommended reference delta

Add this row to `ingredient-references.v1.json` if accepted:

```json
{
  "id": "ingredient-ref-modified-potato-starch",
  "nameEn": "modified potato starch",
  "nameFr": "amidon de pomme de terre modifié",
  "aliasesEn": [],
  "aliasesFr": ["fécule de pomme de terre modifiée"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Add no `IngredientForm`. `Modified` identifies a separate ingredient class in the catalog; the sources do not establish one household-preparation state or a single technical grade that should be represented as a form.

## Ownership and picker projection

The current package has **1,428 references, 105 forms, 1,768 research-ledger records, and 63 legacy candidates**. I checked normalized reference names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger record IDs for the proposed ID and three display/search phrases. No exact owner or collision was found. The existing `ingredient-ref-potato-starch` remains the only direct owner of ordinary `potato starch`, `fécule de pomme de terre`, and `amidon de pomme de terre`; `ingredient-ref-potato-flour` remains separate. The R96 source-ID prefix is absent from the ledger and proposal files. [current package; `IngredientSearch.kt`]

The picker returns exact normalized form-term matches first. Otherwise it matches complete normalized word phrases across each display, alias, and form term, then falls back to substrings only if there are no phrase matches. The projection was calculated against the current reference/form package with the proposed row added:

| Query | Current result | With proposed row |
|---|---|---|
| `modified potato starch` | None | `ingredient-ref-modified-potato-starch` |
| `amidon de pomme de terre modifié` | None | `ingredient-ref-modified-potato-starch` |
| `fécule de pomme de terre modifiée` | None | `ingredient-ref-modified-potato-starch` |
| `potato starch` | `ingredient-ref-potato-starch`; `ingredient-ref-sweet-potato-starch`; `ingredient-ref-sweet-potato-starch-noodles` | Those three plus `ingredient-ref-modified-potato-starch` |
| `amidon de pomme de terre` | `ingredient-ref-potato-starch` | `ingredient-ref-potato-starch`; `ingredient-ref-modified-potato-starch` |
| `fécule de pomme de terre` | `ingredient-ref-potato-starch` | `ingredient-ref-potato-starch`; `ingredient-ref-modified-potato-starch` |
| `potato flour` | `ingredient-ref-potato-flour`; `ingredient-ref-sweet-potato-flour` | Same two results |
| `modified starch` / `amidon modifié` | None | None |
| `modified pea starch` | `ingredient-ref-modified-pea-starch` | Same single result |
| `modified corn starch` | `ingredient-ref-modified-corn-starch` | Same single result |
| `modified tapioca starch` | `ingredient-ref-modified-tapioca-starch` | Same single result |

The qualified query selects the proposed identity. The broad potato-starch terms gain a distinct modified choice while retaining the ordinary and sweet-potato results. No unqualified “modified starch” alias is needed.

## Recipe demand

All **114** manifest-listed recipe JSON files and **1,123** ingredient rows were scanned, including full recipe JSON text and ingredient-line fields. Searches for `modified potato starch`, `amidon de pomme de terre modifié`, `fécule de pomme de terre modifiée`, `potato starch`, `amidon de pomme de terre`, `fécule de pomme de terre`, and adjacent `potato flour` wording found **zero** matching files and **zero** matching ingredient rows. No bundled recipe link, recipe-driven alias, or immediate in-library demand supports a recipe edit.

## Measures, density, forms, and substitution evidence

- **Measures and density:** No reviewed product label, manufacturer source, or study supplies a reproducible kitchen volume-to-mass measure or an ingredient-level bulk density for modified potato starch. The primary study gives 15 g as a formula quantity; that is not a cup/spoon observation or a reusable conversion. Keep `defaultDensity: null`, `unitMappings: []`, and `measurementObservations: []`. [S05–S08]
- **Commercial dosage excluded:** 100x100Chef describes its branded CUSTARD COLD product as being basically composed of modified potato starch and recommends 40–80 g/kg for the product. The page also describes the blend as a cold thickener that can replace corn starch's thickening function. This is a dosage and functional claim for that branded product, without a pure-starch formula or an ingredient-equivalent ratio; do not turn it into a generic measure, density, or active substitution rule. [S11]
- **One bounded study finding:** Ali et al. prepared gluten-free cookies using a laboratory modified potato starch produced by lintnerization and repeated autoclaving/cooling. The test formula used 15 g starch/modified starch with 55 g gram flour; the control replaced the modified starch with an additional 15 g gram flour. Cambridge defines gram flour as chickpea flour, and Norway's official food table classifies gram flour under *Cicer arietinum* and FoodEx2 “Chickpea flour,” so the comparison can be linked to the current broad `ingredient-ref-chickpea-flour`, without narrowing it to Desi chickpea flour or roasted sattu. Across the study, sensory scores did not differ significantly overall between the control and starch-containing cookie groups; the modified starch changed texture hardness relative to native starch. Preserve this as one formula-specific finding only. [S08–S10]
- **No active substitution rule:** This study is not a home-cooking recommendation for all cookies or commercial modified-starch grades. KMC documents multiple grade-specific behaviors, and CUSTARD COLD is a branded product rather than a specified pure starch. Add no global or contextual substitution rule, replacement ratio, recipe-line link, or general equivalence with native potato starch, corn starch, or another modified starch. [S07–S08, S11]

## Recommended research-ledger delta

Add one `ingredient_reference` record for `ingredient-ref-modified-potato-starch`. It records identity, no supported reusable measurement, and the single bounded formula comparison; it does not create a `SubstitutionRule` or `ContextualSubstitutionRule`.

```json
{
  "recordId": "ingredient-ref-modified-potato-starch",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S01",
      "url": "https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components",
      "title": "CFIA — Common Names for Ingredients and Components",
      "accessedOn": "2026-10-14",
      "locator": "Table 1, items 20–21; page last amended 2026-02-11.",
      "supports": "Current Canadian common-name construction distinguishes starch from modified starch and requires the plant source in the name.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S02",
      "url": "https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants",
      "title": "ACIA — Noms usuels d'ingrédients et de constituants",
      "accessedOn": "2026-10-14",
      "locator": "Tableau 1, articles 20–21; page modifiée le 2026-02-11.",
      "supports": "French construction names modified starch as `amidon de` plus the plant name and `modifié` or `modifiée`.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon",
      "title": "OQLF — amidon (GDT)",
      "accessedOn": "2026-10-14",
      "locator": "Preferred term and usage note; last updated 2026.",
      "supports": "`Amidon` is the preferred general term; `fécule` is used more specifically for starch in tubers, including potato.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre",
      "title": "OQLF — fécule de pomme de terre (GDT)",
      "accessedOn": "2026-10-14",
      "locator": "Definition, preferred French terms, and English translations; last updated 2004.",
      "supports": "Defines potato starch and lists `fécule de pomme de terre`, `fécule de pommes de terre`, `amidon de pomme de terre`, and `amidon de pommes de terre` as preferred French terms. Its English cross-reference to potato flour is not used to merge this project's distinct potato-starch and whole-potato-flour rows.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S05",
      "url": "https://daiyafoods.com/en-ca/products/dairy-free-cheddar-block",
      "title": "Daiya — Dairy-Free Cheddar Block",
      "accessedOn": "2026-10-14",
      "locator": "Current en-CA manufacturer product page, bilingual ingredient declarations.",
      "supports": "The English ingredients list `Modified potato starch`; the French list uses `Amidon de pomme de terre modifié`. This is a finished food label, not a grade specification or starch-quantity source.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S06",
      "url": "https://www.springersmeats.com/trade/food-service-product-details.php?cat=w6jk758s84zd&prod=9d6he3jt00j1",
      "title": "Springer's Meats — Turkey Pepperoni, product 90511",
      "accessedOn": "2026-10-14",
      "locator": "Manufacturer food-service product listing; made and sold in Canada; English/French ingredient declarations; page copyright 2026.",
      "supports": "Pairs `Modified Potato Starch` with French `fecule de pomme de terre modifiee`, supporting the normalized French alias. The 5 kg case and finished-meat nutrition serving do not measure the starch ingredient.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S07",
      "url": "https://www.kmc.dk/solutions/ingredients/modified-starches",
      "title": "KMC — Modified starches",
      "accessedOn": "2026-10-14",
      "locator": "Current manufacturer portfolio description and modified-starch product families.",
      "supports": "Identifies multiple modified potato starch variants developed for distinct heat, shear, pH, retrogradation, and food-processing needs; does not establish a household measure or cross-grade substitution.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S08",
      "url": "https://pmc.ncbi.nlm.nih.gov/articles/PMC10558832/",
      "title": "Ali et al. — Extraction and characterization of starch from low-grade potatoes and formulation of gluten-free cookies containing modified potato starch",
      "versionOrDate": "Heliyon 9(9), e19581 (2023), DOI 10.1016/j.heliyon.2023.e19581.",
      "accessedOn": "2026-10-14",
      "locator": "Methods sections 2.4 and 2.12–2.13; results sections 3.2.7–3.2.9.",
      "supports": "Primary study modifies starch from Asterix, Kruda, and Mosaic potatoes using lintnerization plus repeated autoclaving/cooling. Its gluten-free-cookie formula uses 15 g starch/modified starch; the control substitutes an additional 15 g gram flour for the modified starch. Sensory scores were not significantly different overall, while texture effects differed from native starch.",
      "sourceKind": "test_kitchen"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S09",
      "url": "https://dictionary.cambridge.org/us/dictionary/english/gram-flour",
      "title": "Cambridge Dictionary — gram flour",
      "accessedOn": "2026-10-14",
      "locator": "Current entry definition and synonym.",
      "supports": "Defines gram flour as flour made from chickpeas and lists besan as a synonym; used only to map the study's generic `gram flour` wording to the existing broad chickpea-flour identity.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S10",
      "url": "https://matvaretabellen.mattilsynet.io/en/gram-flour/",
      "title": "Norwegian Food Safety Authority — Gram flour, food composition table",
      "accessedOn": "2026-10-14",
      "locator": "Current food record, Food ID 05.383; scientific name and FoodEx2 classification.",
      "supports": "Classifies gram flour as *Cicer arietinum* and FoodEx2 Chickpea flour, corroborating the study-term mapping to the existing generic chickpea-flour identity. Its nutrient values are not imported.",
      "sourceKind": "food_composition"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S11",
      "url": "https://100x100ingredients.com/en/product/custard-cold-3",
      "title": "100x100 Ingredients — CUSTARD COLD",
      "accessedOn": "2026-10-14",
      "locator": "Product description, uses, dosage, and product-specific recipe links.",
      "supports": "Describes one branded cold custard product as basically composed of modified potato starch, with product dosage of 40–80 g/kg and use as an alternative to corn starch's thickening function. This product-specific formulation claim is not a pure-ingredient conversion or reusable substitution rule.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [
    {
      "findingId": "modified-potato-starch-gram-flour-cookie-study-r96",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-modified-potato-starch",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-chickpea-flour"
        }
      ],
      "context": "One 2023 laboratory gluten-free-cookie formula used 15 g of study-modified potato starch; the control used an additional 15 g gram flour instead. The starch was extracted from Pakistani Asterix, Kruda, or Mosaic potatoes and modified by lintnerization and repeated autoclaving/cooling.",
      "basis": "The study's methods say the control cookies replaced the modified-starch amount with additional gram flour. Cambridge defines gram flour as flour made from chickpeas, and Norway's official food table identifies gram flour as Cicer arietinum / FoodEx2 Chickpea flour. The study reports no significant overall sensory difference among control, native-starch, and modified-starch cookie groups, while modified starch changed cookie hardness relative to native starch.",
      "limitations": [
        "This is one study-specific formulation and one laboratory modification process; it does not establish a general cookie substitution or the behavior of commercial modified potato starch grades.",
        "The study's 15 g amount is a recipe mass, not a volume measure, density, or reusable conversion.",
        "The study does not identify its gram flour as a particular chickpea variety or milling state; link only to the existing broad chickpea-flour identity, not Desi chickpea flour or roasted chana sattu.",
        "No `SubstitutionRule`, `ContextualSubstitutionRule`, recipe-line substitution, or bundled-recipe link is proposed."
      ],
      "sourceIds": [
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S08",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S09",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S10"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add modified potato starch / amidon de pomme de terre modifié as a plant-qualified identity distinct from ordinary potato starch and the other modified botanical starch rows. Retain the French fécule variant as a source-attested alias. Record the single laboratory cookie-formula replacement only as a bounded research finding; keep measures, default density, mappings, forms, recipe links, conversions, yields, and active substitution rules empty.",
      "sourceIds": [
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S01",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S02",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S03",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S04",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S05",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S06",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S07",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S08",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S09",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S10",
        "WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S11"
      ]
    }
  ]
}
```

The `researched_supported` substitution state applies only to the explicit cookie-study comparison. It does **not** mean that the catalog has a reusable substitution: the proposed row has no active rule, no recipe line link, and no bundled recipe demand.

## Source register and limitations

Sources were checked on **2026-10-14**. CFIA's English and French common-name pages were both accessible and last amended February 11, 2026. The product-label sources are declarations for finished foods and do not disclose the amount or grade of their modified potato starch. KMC describes industry grades but not consumer measures. The primary cookie study is open access and reports its experimental method and formula; its laboratory material is not equated to current retail grades. [S01–S11]

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S01** | CFIA, [Common Names for Ingredients and Components](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components), Table 1 items 20–21; last amended 2026-02-11. | Establishes plant-qualified naming construction, not a particular starch modification, product grade, measure, or substitution. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S02** | ACIA, [Noms usuels d'ingrédients et de constituants](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants), Tableau 1 articles 20–21; last amended 2026-02-11. | Gives the French naming construction; does not identify modification chemistry or establish the use of `fécule` for a modified ingredient. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S03** | OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), entry last updated 2026. | Supports the preferred general term and usage note; does not specifically define modified potato starch. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S04** | OQLF, [fécule de pomme de terre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre), entry last updated 2004. | Supports the potato-starch French term family and explains the English `potato flour` cross-reference; it is not evidence to merge the project's distinct whole-potato flour and extracted-starch rows. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S05** | Daiya, [Dairy-Free Cheddar Block](https://daiyafoods.com/en-ca/products/dairy-free-cheddar-block), current en-CA maker page. | Exact bilingual ingredient wording; finished-product label only, with no starch specification or quantity. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S06** | Springer's Meats, [Turkey Pepperoni product 90511](https://www.springersmeats.com/trade/food-service-product-details.php?cat=w6jk758s84zd&prod=9d6he3jt00j1), current manufacturer food-service listing. | Made and sold in Canada; exact English and French ingredient wording (the page omits French diacritics). Finished-meat package and nutrition values are not starch measurements. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S07** | KMC, [Modified starches](https://www.kmc.dk/solutions/ingredients/modified-starches), current manufacturer portfolio. | Confirms multiple product-grade functions and variability; industrial applications do not establish kitchen measures or cross-grade equivalence. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S08** | Ali et al., [Extraction and characterization of starch from low-grade potatoes and formulation of gluten-free cookies containing modified potato starch](https://pmc.ncbi.nlm.nih.gov/articles/PMC10558832/), *Heliyon* 9(9), e19581 (2023), DOI 10.1016/j.heliyon.2023.e19581. | Primary study using three Pakistani potato varieties and one specific acid/heat modification process. The 15 g formula amount and gram-flour comparison are study-specific and provide neither a volume mapping nor a general rule. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S09** | Cambridge Dictionary, [gram flour](https://dictionary.cambridge.org/us/dictionary/english/gram-flour), current entry. | Supports the common English name mapping to chickpea flour, not a specific chickpea variety or milling state. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S10** | Norwegian Food Safety Authority, [Gram flour food-composition record](https://matvaretabellen.mattilsynet.io/en/gram-flour/), Food ID 05.383. | Classifies gram flour as *Cicer arietinum* / chickpea flour; its composition data are not imported. |
| **WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S11** | 100x100 Ingredients, [CUSTARD COLD](https://100x100ingredients.com/en/product/custard-cold-3), manufacturer product page. | Brand says the product is basically composed of modified potato starch and provides its own dosage and cold-thickening claim; the product's complete composition and a pure-starch substitution ratio are not given. |

## Review-time static checks

- JSON snippets parsed successfully; proposed record ID and all 11 source IDs are unique against current references, forms, legacy candidates, ledger record IDs/source IDs, and proposal files.
- Picker projection was recalculated with the current catalog and form match terms; the table above reports complete-phrase matching results.
- Recipe corpus scan covered 114 manifest-listed files and 1,123 ingredient rows; zero candidate phrase hits were found.
- UTF-8/no-BOM, trailing whitespace, source-ID uniqueness, and local Markdown links in this proposal were checked. No app, Gradle, instrumentation, or emulator tests were run because the accepted change only adds database JSON data and its generated catalog index under the `AGENTS.md` exception.

## Root integration decision (2026-10-14)

Accepted `modified potato starch / amidon de pomme de terre modifié` as a plant-qualified
`FLOUR_AND_STARCH` identity distinct from ordinary potato starch, potato flour, and modified corn,
pea, and tapioca starch. Added the source-attested French alias `fécule de pomme de terre modifiée`.
Recorded the single laboratory cookie-formula comparison as a bounded research finding only. No
measurement observation, density, unit mapping, form, recipe link, conversion, yield, or active
substitution rule was added.

Updated the Section 04 B2/B3 checklist, global plan, and roadmap. The canonical package now has 1,430
references and 1,770 research-ledger records. Static validation results are in the batch README.

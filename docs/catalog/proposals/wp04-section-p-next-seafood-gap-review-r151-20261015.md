# WP04 Section P — Hokkaido scallop identity review (R151)

- **Reviewed / sources accessed:** 2026-10-15.
- **Recommendation:** Add identity-only **Hokkaido scallop / pétoncle d’Hokkaido** as **ingredient-ref-hokkaido-scallop**, category **PROTEIN**. Keep **Japanese scallop** as an English search alias and retain the exact current retail wording as narrow English/French aliases.
- **Identity scope:** A species-scoped Québec market product for the edible adductor muscle of *Mizuhopecten yessoensis*. CFIA’s Fish List and several current supplier pages use the older combination *Patinopecten yessoensis*. Do not infer this species from an unqualified Hokkaido seller listing unless that product source identifies the taxon.
- **Status at proposal handoff:** This was the only artifact written for R151. The reviewer changed no shared reference/form JSON, legacy identity data, ledger, recipe, plan, roadmap, batch archive, or generated source. No tests, Gradle tasks, emulator, app, or deployment checks were run.
- **Root disposition:** Accepted and integrated in R151 on 2026-10-15; the shared reference, ledger, checklist, roadmap, batch README, and generated index now contain the approved row and supplier-specific portion observation.
- **Proposed source IDs:** **WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S01** through **S10**; all were absent from the live ledger and proposal/batch archive before drafting.

## Why this is the next unfinished candidate

The active Section P checklist names scallop coverage among its remaining seafood work. The catalog already has generic scallop / pétoncle, sea scallop / pétoncle géant, Icelandic scallop / pétoncle d’Islande, bay scallop / pétoncle de baie, and dried scallop / pétoncle séché. Recent reviews cover the Bay and Calico scallop boundaries, but not the Japanese/Hokkaido market product or *M. yessoensis*. R148 shrimp balls, R149 smoked haddock, and R150 seal meat cover separate products. No Hokkaido/Japanese scallop review, hold, integration, or candidate was found in the R1–R150 proposal/batch archive. An exact phrase search across that archive found no match for Japanese scallop, Hokkaido scallop, *Mizuhopecten yessoensis*, *Patinopecten yessoensis*, or pétoncle d’Hokkaido.

At proposal handoff, the live package contained **1,517 ingredient references**, **119 forms**, and **114 manifest-listed recipes / 1,123 ingredient rows**. The legacy-import file has **61 candidates**; the research ledger has **1,862 records** and **7,854 source entries**. No active reference, form, legacy identity, or ledger record exactly owns the proposed ID or any of these normalized phrases: Hokkaido scallop, Hokkaido scallops, Japanese scallop, pétoncle d’Hokkaido, pétoncle Hokkaido, pétoncles Hokkaido du Japon, pétoncle du Japon, *Patinopecten yessoensis*, *Mizuhopecten yessoensis*, or Yesso scallop. No source-ID collision was found.

## Canadian and Québec naming, taxon, and product boundary

The CFIA Fish List identifies TSN 79756 as *Patinopecten yessoensis*. It lists the English common names Japanese Scallop and Scallop, while the corresponding French rows are Pétoncle and a blank French field. CFIA’s list is a Canadian fish-label naming resource; it does not make bare Pétoncle species-specific. The Government of Canada’s DFO aquaculture species list uses Japanese Scallop / *Mizuhopecten yessoensis*, and WoRMS treats the CFIA/supplier combination *Patinopecten yessoensis* as accepted *Mizuhopecten yessoensis*. [S01, S03, S04]

Current Québec seafood suppliers connect the Hokkaido product wording to this taxon. Pêcheries Océanic, based in Saint-Mathieu-de-Beloeil, lists Pétoncles Hokkaido du Japon with species *Patinopecten yessoensis*. Montréal-area supplier Pearlmark lists Hokkaido Scallops, identifies the same species, and lists Japan as origin for its current Hokkaido SKUs. Montréal retailer La Mer currently lists several Pétoncle Hokkaido products; Mayrand’s Québec-facing French catalogue lists Hokkaido scallop products by package and size grade. These listings support a present Canadian/Québec market product name and taxon crosswalk for the named products, not an inventory guarantee or a universal rule that every product mentioning Hokkaido is *M. yessoensis*. [S05–S08]

The OQLF’s normalized Québec term is **pétoncle**. Its GDT entry describes the Québec commercial item as the adductor muscle, sometimes with roe, rather than the whole animal; the entry does not name *M. yessoensis*. The current Québec menu wording pétoncle d’Hokkaido supplies a species/product qualifier but is not an OQLF ruling. Accordingly, use the qualified French market display **pétoncle d’Hokkaido** and keep bare **pétoncle** off the proposed row’s alias list. Also keep **coquille Saint-Jacques** out; it has a different Québec meaning and is not the name of this product. [S02, S09]

Scope this row to the named Hokkaido/Japanese scallop product identified by the cited supplier listings. Keep generic scallop, sea scallop, bay scallop, Icelandic scallop, dried scallop/conpoy, roe, and whole-shell presentation distinct. Do not add a universal frozen/IQF form: current listings show frozen/IQF SKUs, but the market identity itself is not a storage-state form.

## Exact ownership and picker projection

The picker uses accent-folded phrase-first search across bilingual reference names, aliases, and attached form terms, falling back to substring matching when no full phrase matches ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The projection below mirrors the live data and adds only the proposed display and aliases.

| Query | Current results | With proposed row | Projection |
|---|---:|---:|---|
| **Hokkaido scallop / Hokkaido scallops** | 0 | 1 | Selects the qualified market product. |
| **Japanese scallop** | 0 | 1 | Selects the CFIA common-name alias for the same taxon. |
| **pétoncle d’Hokkaido** | 0 | 1 | Selects the qualified Québec display. |
| **pétoncle Hokkaido / pétoncles Hokkaido du Japon** | 0 | 1 | Selects exact seller-attested French variants. |
| **scallop / scallops** | 5 | 6 | Remains a multi-result search across generic, bay, dried, Icelandic, sea, and Hokkaido scallops. |
| **pétoncle / pétoncles** | 5 | 6 | Remains a multi-result Québec search; no bare alias is added. |
| **Hokkaido** | 0 | 1 | Returns the product label, not a new geographic or preparation category. |

The broad scallop searches remain multi-result. The exact Hokkaido/Japanese terms become useful species-qualified choices. CFIA’s unqualified French label is not promoted to an alias.

## Bundled-recipe demand

The complete scan parsed all **114** manifest-listed recipe files and **1,123** ingredient rows. It searched ingredient-row text for Hokkaido scallop variants, Japanese scallop, Yesso scallop, the *Mizuhopecten* and *Patinopecten* binomials, and pétoncle du Japon/Hokkaido variants. **No matching ingredient row or recipe file was found.** No recipe link or recipe-line change is proposed.

## Forms, measures, and substitutions

No form is reusable from these listings. Retail and wholesale pages show source-specific product states, size grades, and package sizes, including IQF and frozen packages. Those details do not establish a common storage form or a recipe conversion.

The Pêcheries Océanic product sheet lists five IQF size grades and its nutrition panel declares **5 pieces (125 g)**. Preserve that as one published, product-specific portion observation in the proposed ledger record; the sheet does not identify which grade or whether the serving mass basis is frozen, thawed, or cooked. The reported pair does not establish a reusable count-to-mass measure for Hokkaido scallops generally. Its size grades and case/package weights are also product-specific. No source establishes a household volume, default density, cooking yield, or package yield. Use **defaultDensity: null** and **unitMappings: []**; add no reusable measurement mapping, conversion, or yield record.

No reviewed source or bundled recipe supports a tested substitution ratio between Hokkaido scallop, generic scallop, or another seafood. Record substitution research as **researched_no_supported_substitute**; add no global conversion, contextual substitution, or recipe-line link.

## Proposed reference delta

~~~json
{
  "id": "ingredient-ref-hokkaido-scallop",
  "nameEn": "Hokkaido scallop",
  "nameFr": "p\u00e9toncle d\u2019Hokkaido",
  "aliasesEn": [
    "Hokkaido scallops",
    "Japanese scallop"
  ],
  "aliasesFr": [
    "p\u00e9toncle Hokkaido",
    "p\u00e9toncles Hokkaido du Japon"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
~~~

No ingredient form, measure, conversion, yield, recipe link, or substitution rule is proposed.

## Proposed ledger delta

This proposed ledger delta was prepared at handoff; root integrated the record and its sources into the R151 ledger.

~~~json
{
  "recordId": "ingredient-ref-hokkaido-scallop",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S01",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=f&q=scallop",
      "title": "Canadian Food Inspection Agency, Fish List results for scallop",
      "versionOrDate": "Fish List data modified 2023-09-18; query checked 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "TSN 79756 entries for Patinopecten yessoensis.",
      "supports": "Lists Japanese Scallop and Scallop as English common names for Patinopecten yessoensis, paired respectively with Pétoncle and a blank French field. This supports the English common-name alias and the species mapping; it does not make bare Pétoncle species-specific or establish Hokkaido as a universal taxon label.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle",
      "title": "Office québécois de la langue française, GDT, pétoncle",
      "versionOrDate": "Last updated 1998; accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Notes on the commercial Québec item and preferred French term.",
      "supports": "Identifies pétoncle as the normalized Québec French term and describes the commercial item as the adductor muscle, sometimes accompanied by roe, rather than the whole animal. It does not supply a species-specific French name for Mizuhopecten yessoensis.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S03",
      "url": "https://www.dfo-mpo.gc.ca/aquaculture/management-gestion/licen-permi-eng.htm",
      "title": "Fisheries and Oceans Canada, Licences for introductions and transfers",
      "versionOrDate": "Current page retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Shellfish table, Japanese Scallop entry.",
      "supports": "Pairs Japanese Scallop with Mizuhopecten yessoensis. Taxon/common-name evidence only; this page is not a Québec retail listing or a recipe measure.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S04",
      "url": "https://www.marinespecies.org/aphia.php?id=393716&p=taxdetails",
      "title": "World Register of Marine Species, Mizuhopecten yessoensis",
      "versionOrDate": "Taxonomic record retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Synonym/taxonomic treatment for Patinopecten (Mizuhopecten) yessoensis.",
      "supports": "Accepts Mizuhopecten yessoensis and treats Patinopecten yessoensis as the older combination used by CFIA and current supplier listings. Taxonomic crosswalk only.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S05",
      "url": "https://pecheriesoceanic.com/nos-produits/",
      "title": "Pêcheries Océanic, Nos produits",
      "versionOrDate": "Current Québec supplier product page retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Featured product Pétoncles Hokkaido du Japon; species field Patinopecten yessoensis.",
      "supports": "A Québec seafood supplier pairs the exact French market wording Pétoncles Hokkaido du Japon with Patinopecten yessoensis. This supports the narrow product/taxon crosswalk, not a universal mapping for every unqualified Hokkaido listing or a live inventory guarantee.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S06",
      "url": "https://www.pearlmarkfoods.com/our-products/hokkaido-scallops",
      "title": "Pearlmark Foods, Hokkaido Scallops",
      "versionOrDate": "Current product page retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Product title, scientific name, Japan origin, and SKU pack table.",
      "supports": "A Canadian seafood supplier lists Hokkaido Scallops as Patinopecten yessoensis and identifies Japan origin for its Hokkaido product SKUs. Its dry-pack statement, size grades, and pack quantities remain product-specific; none is promoted to a reusable measure or form.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S07",
      "url": "https://www.lamer.ca/collections/petoncles",
      "title": "La Mer, Pétoncles",
      "versionOrDate": "Current Montréal retailer collection retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Current listings for Pétoncle Hokkaido, including product size and package variants.",
      "supports": "A Montréal seafood retailer currently uses Pétoncle Hokkaido for several listed products. Its page supports Québec market wording and product-category presence, not the taxon of any one Hokkaido SKU, package equivalence, or continuous stock.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S08",
      "url": "https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/petoncle-surgele",
      "title": "Mayrand, Pétoncle surgelé",
      "versionOrDate": "Current Québec-facing retailer page retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Hokkaido product titles, IQF/state wording, package weights, and size grades.",
      "supports": "Lists Hokkaido scallop products in the French-language catalogue. Package weights, frozen/IQF wording, and size grades are SKU-specific and do not establish a species or reusable quantity for every Hokkaido product.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S09",
      "url": "https://shinya.ca/menu.html",
      "title": "SHINYA, menu",
      "versionOrDate": "Current Québec restaurant menu retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Crudo de pétoncles and Hotate menu entries.",
      "supports": "Uses pétoncle d’Hokkaido as Québec French menu wording paired with Hokkaido scallop in English. Menu wording supports the display phrase but does not identify the taxon or establish a retail product specification.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S10",
      "url": "https://pecheriesoceanic.com/wp-content/uploads/2024/04/Petoncle-Hokkaido-du-Japon.pdf",
      "title": "Pêcheries Océanic, Pétoncle Hokkaido du Japon technical sheet",
      "versionOrDate": "Technical sheet URL dated 2024-04; accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Species/origin, five IQF size grades and case format, and nutrition facts serving-size line.",
      "supports": "Identifies Patinopecten yessoensis, Japan origin, five IQF size grades in 2 x 2.27 kg cases, and the nutrition-panel serving declaration Pour 5 pièces (125 g) / Per 5 pieces (125 g). Preserve the serving only as this supplier product-sheet portion observation; the sheet does not associate it with one listed grade or state whether its mass basis is frozen, thawed, or cooked. It establishes no general count-to-mass mapping, density, or household measure.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "oceanic-hokkaido-scallop-five-pieces-125g-serving-r151-20261015",
      "relationship": "portion_weight",
      "value": 125,
      "valueUnit": "g",
      "sourceQuantity": {
        "amount": 5,
        "unit": "pieces"
      },
      "observedMassG": 125,
      "foodDescription": "Pêcheries Océanic Pétoncle Hokkaido du Japon, product-sheet nutrition serving.",
      "foodState": "The product sheet describes IQF product but does not state whether the nutrition serving mass basis is frozen, thawed, or cooked, or which listed size grade it represents.",
      "measurementMethod": "Published nutrition serving declaration on the supplier product sheet: 5 pieces (125 g); no independent measurement method is supplied.",
      "quantityBasis": "One supplier product-sheet portion only. The sheet lists multiple piece-size grades and does not associate this serving declaration with a particular grade; do not generalize it to other brands, grades, or scallop identities or turn it into a reusable count-to-mass mapping.",
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP04-SECTIONP-HOKKAIDO-SCALLOP-R151-20261015-S10"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only Hokkaido scallop / pétoncle d’Hokkaido for the species-supported Japanese/Hokkaido scallop product, with the exact English and French market variants and CFIA’s specific English Japanese Scallop name searchable. Keep bare pétoncle off aliases because CFIA assigns it across scallop taxa and OQLF uses it as a broad normalized Québec commercial term. The bundle has no matching demand. Record the supplier's 5 pieces (125 g) nutrition serving as product-specific portion evidence only; size grades, package amounts, and frozen/IQF listings do not establish a reusable form, measure, conversion, yield, recipe link, or substitution."
    }
  ]
}
~~~

## Static proposal checks

The read-only audit verified current reference/form/legacy/ledger counts, exact normalized-key ownership, candidate-ID and source-ID absence, the picker projection, and all manifest-listed recipe ingredient rows. The archive phrase search found no prior Hokkaido/Japanese scallop identity decision in proposals or batch records. No Gradle, unit, instrumentation, emulator, app, or deployment checks were run.

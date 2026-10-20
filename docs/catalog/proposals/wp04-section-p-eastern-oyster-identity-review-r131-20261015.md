# WP04 Section P — Eastern oyster identity review (R131)

- **Review and source-access date:** 2026-10-15.
- **Status:** integrated as proposed; see the [R131 batch README](../batches/wp04-section-p-eastern-oyster-identity-integration-r131-20261015/README.md).
- **Candidate:** Eastern oyster / *huître de l’Est* (*Crassostrea virginica*).
- **Recommendation:** Add one identity-only `PROTEIN` reference for this species. Keep the generic fresh-oyster candidate unresolved and keep Pacific oyster, dried oyster, oyster sauces, and oyster-named mushrooms distinct.
- **Data boundary:** No forms, measurements, recipe links, conversions, yields, or substitutions are supported.

## Exact parent checklist and distinction from prior work

The exact open parent is **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.”** in the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5279). It remains open.

This packet reviews only the species *C. virginica*. The earlier [fresh-oyster review](wp04-section-p-fresh-oyster-identity-boundary-review-20261012.md) and its [hold README](../batches/wp04-section-p-fresh-oyster-hold-integration-20261012/README.md) kept the unqualified fresh-oyster candidate unresolved and did not allocate a species row. The R130 [Pacific-oyster review](wp04-section-p-pacific-oyster-species-picker-review-r130-20261015.md) added *Magallana gigas* / *Crassostrea gigas* as a separate species and explicitly left species-qualified oyster work open. This proposal does not reopen either decision. It adds a second species-specific choice, supported by a Québec retail product whose ingredient list identifies *C. virginica*.

## Ownership, active data, and prior-decision audit

The 2026-10-15 live snapshot has **1,480 active references**, **109 forms**, **61 legacy-import candidates**, and **1,825 ledger records / 7,599 source entries / 6,455 distinct source IDs**. The bundled manifest lists **114 recipes**.

There is no active reference or form, legacy candidate, or species-specific ledger identity for `ingredient-ref-eastern-oyster`, `Eastern oyster`, `American oyster`, `Atlantic oyster`, `huître de l’Est`, or *Crassostrea virginica*. The active oyster-adjacent references are `ingredient-ref-pacific-oyster`, `ingredient-ref-dried-oyster`, `ingredient-ref-oyster-sauce`, `ingredient-ref-vegan-oyster-sauce`, `ingredient-ref-oyster-mushroom`, and `ingredient-ref-king-oyster-mushroom`. No oyster form or form hint is active. The existing `ingredient-ref-fresh-oyster` is still a generic `candidate` with `identityState: needs_clarification`; it is not an identity owner for *C. virginica*.

The proposal-local source prefix **`WP04-SECTIONP-EASTERN-OYSTER-R131-20261015`** was checked against the live research ledger and all prior proposal and batch Markdown files before use; no match was found. The proposed reference ID and normalized names were also checked for active, form, legacy, and ledger ownership.

## Identity, taxonomy, and Québec name assignment

ITIS lists *Crassostrea virginica* (TSN 79872) as a valid species and includes `eastern oyster` among its common names. CFIA’s Fish List assigns this same TSN the Canadian food names `Oyster / Huître américaine`, `Atlantic Oyster / Huître`, and the French `Huître de l’Atlantique`. It also assigns unqualified `Oyster` or `Huître` names to other oyster taxa, so none of those bare terms should be added as an alias. CFIA guidance says the Fish List names are species-linked common names for Canadian fish labelling. [S01–S03]

DFO’s English bivalve guide calls *C. virginica* `American oyster`; its French guide gives the species-qualified Québec-facing name **huître de l’Est**. The pages say this oyster is harvested along Canada’s Atlantic coast and farmed on leased Maritime seabed. Use **Eastern oyster / huître de l’Est** as the bilingual display pair. Retain only species-qualified alternatives as search aliases. [S04–S05]

OQLF’s food-domain `huître` entry is normalized for Québec and links the species to the English name `American oyster` and *C. virginica*. OQLF also says the regional product appellations `huître de Caraquet` and `huître Malpèque` were not retained for Québec fish-product commercialization terminology. Accordingly, do not use bare `huître` as an alias and do not turn Malpèque or Caraquet product names into species aliases. The federal `huître américaine` spelling is not used as the display; OQLF labels that form France/Europe, while DFO provides the Québec-specific qualified display. [S06]

## Canadian and Québec human-food-market evidence

- Metro Québec’s current listing **Huîtres Malpèque ÎPE** identifies the ingredient as *Crassostrea virginica* and gives Prince Edward Island, Canada as provenance. The page was returned in search during this review, but direct page retrieval returned HTTP 403; treat the listing as a dated retailer snapshot, not as a live inventory guarantee. It directly connects a Quebec-market food product to the species. [S07]
- Montréal-area Mayrand’s product page lists a Malpeque oyster by unit and case and showed it in stock at its Anjou store when checked. The listing does not give a binomial, so it corroborates local human-food commerce only; it is not used to identify the taxon or to infer a reusable kitchen measure. [S08]
- DFO’s bivalve guide describes the species as harvested and farmed in the Maritimes. That is Canadian fishery context, not proof of current Québec aquaculture output or year-round local supply. [S04–S05]

Taken together, the Canadian taxon and food-name records, the DFO bilingual species names, OQLF’s Québec terminology, and a current Québec retailer listing that names *C. virginica* support an identity-only species row. The local product name Malpèque is evidence of market demand, not a picker alias.

## Picker projection

`IngredientSearch.kt` uses phrase-first matching across each reference’s French and English displays and aliases, then falls back to partial matching. The projection below applies that behavior to the current 1,480 references and the exact proposed row.

| Query | Current results | With the proposed row | Effect |
|---|---|---|---|
| `oyster` | Six: dried oyster, king oyster mushroom, oyster mushroom, oyster sauce, Pacific oyster, and vegan oyster sauce. | Those six plus Eastern oyster. | Broad English query remains ambiguous and exposes the new species option. |
| `oysters` | Dried oyster and Pacific oyster. | Those two plus Eastern oyster. | The proposed plural alias makes the species available for plural recipe text. |
| `huître` | Dried oyster, oyster mushroom, oyster sauce, and Pacific oyster. | Those four plus Eastern oyster. | Broad French query remains multi-result. |
| `huîtres` | Dried oyster, oyster sauce, Pacific oyster, and vegan oyster sauce. | Those four plus Eastern oyster. | Broad French plural remains multi-result. |
| `Eastern oyster`, `Eastern oysters`, `American oyster`, `Atlantic oyster`, `huître de l’Est`, `huîtres de l’Est`, `huître de l’Atlantique`, or `huîtres de l’Atlantique` | No exact match. | Eastern oyster / huître de l’Est only. | Qualified name queries identify the species. |
| `fresh oyster`, `Malpeque oyster`, or *Crassostrea virginica* | No match. | No match. | Do not resolve the generic fresh-oyster candidate or expose source/product names and taxonomy as recipe aliases. |

Do not add bare `oyster`, `oysters`, `huître`, or `huîtres` aliases. The display itself contains the common word, so broad queries naturally return multiple seafood, mushroom, and sauce results. Keep Pacific and Eastern oyster identities separate.

## Manifest recipe demand and data boundaries

The complete **114-file manifest-listed recipe corpus** and all **1,123 ingredient rows** were searched for oyster / huître wording, the qualified Eastern/American/Atlantic names, Malpèque and Caraquet, and *C. virginica*. There are **zero matching files and zero matching ingredient rows**. No bundled recipe requests this species or a fresh oyster product.

No recipe links are warranted. Retailer piece and case counts do not establish a generic count-to-mass measure. Add no form, default density, unit mapping, package yield, conversion, cooking yield, or substitution. The current records establish species and food-name identity only; they do not establish equivalence with Pacific oyster, dried oyster, oyster sauce, or mushroom products.

## Recommendation and exact candidate JSON delta

Add `ingredient-ref-eastern-oyster` as an identity-only `PROTEIN` reference and a matching accepted ledger identity. Do not modify or merge the existing generic `ingredient-ref-fresh-oyster` candidate.

### Ingredient reference

```json
{
  "id": "ingredient-ref-eastern-oyster",
  "nameFr": "hu\u00eetre de l\u2019Est",
  "nameEn": "Eastern oyster",
  "aliasesFr": [
    "hu\u00eetres de l\u2019Est",
    "hu\u00eetre de l\u2019Atlantique",
    "hu\u00eetres de l\u2019Atlantique"
  ],
  "aliasesEn": [
    "Eastern oysters",
    "American oyster",
    "American oysters",
    "Atlantic oyster",
    "Atlantic oysters"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

Do not alias `huître américaine` despite its CFIA listing: OQLF marks it as France/Europe wording, while the display uses DFO’s species-qualified French name. Do not add Malpèque or Caraquet names, unqualified oyster terms, or scientific names to the picker.

### Research ledger record

```json
{
  "recordId": "ingredient-ref-eastern-oyster",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S01",
      "url": "https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=79872",
      "title": "Integrated Taxonomic Information System, Crassostrea virginica, TSN 79872",
      "accessedOn": "2026-10-15",
      "locator": "Taxonomic rank, current standing, and common-name fields.",
      "supports": "Identifies Crassostrea virginica as a valid species and lists eastern oyster among its common names.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S02",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "Canadian Food Inspection Agency, CFIA Fish List result for Crassostrea virginica",
      "versionOrDate": "Fish List date modified 2023-09-18; species result checked 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "TSN 79872 rows for Oyster / Huître américaine, Atlantic Oyster / Huître, and Huître de l’Atlantique.",
      "supports": "Assigns these Canadian food common names to Crassostrea virginica; other oyster taxa also carry unqualified Oyster or Huître names.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S03",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "Canadian Food Inspection Agency, Guidance on determining the common names for fish sold or processed in Canada",
      "versionOrDate": "Date modified 2023-09-25",
      "accessedOn": "2026-10-15",
      "locator": "Sections 2 and 4, CFIA Fish List scope and species-linked common names.",
      "supports": "Explains that the CFIA Fish List supplies Canadian English/French common names and that names listed for a species are used for that species in Canadian sale or processing.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S04",
      "url": "https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm",
      "title": "Fisheries and Oceans Canada, Identifying bivalve shellfish",
      "versionOrDate": "Date modified 2021-06-09",
      "accessedOn": "2026-10-15",
      "locator": "Oysters, American oyster (Crassostrea virginica); harvested Atlantic coast species, farmed on leased Maritime seabed.",
      "supports": "Confirms the English name, species, and Canadian harvest/farming context.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S05",
      "url": "https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm",
      "title": "Pêches et Océans Canada, Identification des mollusques bivalves",
      "versionOrDate": "Date modified 2021-06-09",
      "accessedOn": "2026-10-15",
      "locator": "Huîtres, Huître de l’Est (Crassostrea virginica).",
      "supports": "Provides the species-qualified French name used as the proposed Québec display.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S06",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198865/huitre",
      "title": "Office québécois de la langue française, huître (GDT)",
      "versionOrDate": "Last updated 2012",
      "accessedOn": "2026-10-15",
      "locator": "Food-mollusc entry, preferred term, English/Latin cross-reference, and notes on Malpèque and Caraquet appellations.",
      "supports": "Supports the Québec base term huître and its link to American oyster / Crassostrea virginica; says Malpèque and Caraquet names were not retained for Québec fish-product commercialization terminology.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S07",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/huitres/huitres-malpeque/p/836443006084",
      "title": "Metro Québec, Huîtres Malpèque ÎPE",
      "accessedOn": "2026-10-15",
      "locator": "Search-indexed product listing; title, 25-unit package, ingredient Crassostrea virginica, and PEI, Canada provenance. Direct page retrieval returned HTTP 403.",
      "supports": "Provides Québec retail human-food evidence linking a named oyster listing to Crassostrea virginica and Canadian provenance.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S08",
      "url": "https://mayrand.ca/en/our-products/fish-and-seafood/oyster/huitre-malpeque-53986",
      "title": "Mayrand, Malpeque Oyster",
      "accessedOn": "2026-10-15",
      "locator": "Current product page with unit/case offers and Anjou store marked in stock; no scientific name given.",
      "supports": "Corroborates a current Montréal-area human-food market for Malpeque oysters; it does not identify the species or establish a kitchen measurement.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add an identity-only Eastern oyster / huître de l’Est reference for Crassostrea virginica, with source-qualified alternate names. Keep the generic fresh-oyster candidate and Pacific oyster identity separate. No forms, measures, recipe links, conversions, yields, or substitutions are supported.",
      "sourceIds": [
        "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S01",
        "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S02",
        "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S03",
        "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S04",
        "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S05",
        "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S06",
        "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S07",
        "WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S08"
      ]
    }
  ]
}
```

## Source register and limits

| Source ID | Source and support | Limits |
|---|---|---|
| **WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S01** | [ITIS, *Crassostrea virginica*, TSN 79872](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=79872). Current standing is valid; common names include eastern oyster. | Taxonomy and names only; not Canadian market availability or label law. |
| **WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S02** | [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), result for TSN 79872, checked 2026-10-15; list modified 2023-09-18. Names include Oyster / Huître américaine, Atlantic Oyster / Huître, and Huître de l’Atlantique. | Canadian common-name evidence; common-name rows do not establish product form or recipe equivalence. Other taxa also have unqualified oyster names. |
| **WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S03** | [CFIA fish common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25. Explains the Fish List’s Canadian labelling role. | Regulatory guidance does not select a recipe’s intended species. |
| **WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S04** | [DFO, Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm), modified 2021-06-09. Identifies American oyster (*C. virginica*) as an Atlantic-coast harvested species farmed in the Maritimes. | Species/fishery context, not a current retail inventory or a measure. |
| **WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S05** | [DFO, Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm), modified 2021-06-09. Gives Huître de l’Est (*C. virginica*). | Official bilingual species guide; does not establish every retailer’s label. |
| **WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S06** | [OQLF, huître (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198865/huitre), last updated 2012. Preferred Québec base term; linked to American oyster and *C. virginica*. Says Malpèque and Caraquet terms were not retained for Québec fish-product commercialization terminology. | Terminology authority but older entry; not a current market inventory. It marks `huître américaine` as France/Europe, so that wording is not used as the canonical French display or alias. |
| **WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S07** | [Metro Québec, Huîtres Malpèque ÎPE](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/huitres/huitres-malpeque/p/836443006084). Search snapshot identifies *C. virginica*, PEI provenance, and a 25-count package. | Search-index snapshot only; direct retrieval returned HTTP 403. Product availability can change, and the count is not a recipe measure. Product name not adopted as an alias per OQLF. |
| **WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S08** | [Mayrand, Malpeque Oyster](https://mayrand.ca/en/our-products/fish-and-seafood/oyster/huitre-malpeque-53986), checked 2026-10-15. Product page lists unit/case offers and Anjou in-stock status. | Retailer page does not state a binomial; market corroboration only, not species identification or a reusable kitchen quantity. |

## Static review record

- Read `AGENTS.md`, Requirements FR-3/FR-5/FR-7, the current Section P checklist and latest roadmap entries, current live references/forms/ledger/legacy file, manifest-listed recipe corpus, and `IngredientSearch.kt`.
- Audited the prior generic fresh-oyster hold and R130 Pacific oyster proposal/batch. The active generic candidate remains distinct; no Eastern identity is already resolved.
- Reproduced current/projected phrase-first search results from the live reference and form terms. Checked exact-key ownership and verified the R131 source-ID prefix is unused in the ledger and proposal/batch archive.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; no oyster, huître, named-species, or *C. virginica* demand was found.
- Integration completed: the reference and ledger record were added, with no recipe, form, or numeric data changes. No tests were run for this database-JSON-only change.

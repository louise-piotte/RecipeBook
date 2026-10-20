# WP04 Section P — Sablefish / morue charbonnière identity review

- **Review date:** 2026-10-11.
- **Packet type:** identity and recipe-demand review; root integration complete.
- **Disposition:** accept one species-scoped, identity-only finfish reference for sablefish (*Anoplopoma fimbria*), displayed as **sablefish / morue charbonnière**. Use “black cod” and “morue noire” only as search aliases; do not display “morue noire” as the preferred Québec name. No recipe link or product-state behavior is proposed.
- **Research scope:** the agent review produced this report only; root integration added the reviewed identity and ledger record, refreshed the generated catalog index, and updated the checklist and roadmap.

## Why this is a distinct open item

The Section P plan still leaves its finfish and “regional fish” checklist open. Its earlier fish packets review and integrate cod, pollock, halibut, mackerel, sardine, anchovy, trout, herring, eel, and other listed identities; the regional-finfish gap remains broad. This packet selects sablefish, a commercially relevant Pacific species with a species-specific English/Québec French name pair. It does not reopen the earlier bonito, salmon, tuna, or held sole/flounder/turbot and bass/bream/snapper/grouper/tilapia/carp decisions.

The pre-integration phrase and taxon audit below found no sablefish candidate in the active references, forms, legacy identities, or ledger. The fish is a species identity, not a generic “black fish” class, cod synonym, or separate recipe product.

## Pre-integration catalog, collision, and recipe audit

The following counts and exact-byte hashes are the point-in-time snapshot before root integration. The recipe corpus digest hashes each manifest-ordered UTF-8 relative path, a NUL byte, the exact recipe file bytes, and another NUL byte.

| Artifact | Count at audit | SHA-256 |
|---|---:|---|
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 1,029 references | f089a129d865d334659a2b77b65a9ca0bcc9efe415aedaff11b55be3552377b7 |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 72 forms | 22688dde53382446d17da625d85c8c89648e9d4ff160202efa95b297482d0d05 |
| docs/catalog/legacy-import-identities.v1.json | 75 candidates | e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0 |
| docs/catalog/research-ledger.v1.json | 1,320 records | 92cf8b08b1a7e70a5d4e38ceed67170d46ffc2d0969761f662ba569ad8f873b0 |
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | 10202b4c7803b57ef2b5b3b2f283acab1e12b1dd8d4f72ebe7cf3550ba19d73c |

Exact normalized phrase checks in the pre-integration snapshot for “sablefish,” “morue charbonnière,” “black cod,” “morue noire,” and *Anoplopoma fimbria* found no owner among active reference names or aliases, form labels or match terms, or legacy candidate names or aliases. The proposed ID `ingredient-ref-sablefish` was absent from active references, legacy candidates, and ledger record IDs before root integration. No matching term or ID appeared in an earlier WP04 proposal or batch. The source-ID prefix `WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S` was unused in the shared ledger and existing WP04 proposals before this report.

The live search implementation prefers complete word phrases and falls back to partial matching. Before root integration, searches for the exact terms above returned no ingredient result. The shorter queries “cod” and “morue” then returned `ingredient-ref-atlantic-cod` and `ingredient-ref-salt-cod`. With the integrated row, full searches for “sablefish,” “black cod,” “morue charbonnière,” and “morue noire” resolve to the displayed species row; the shorter queries “cod” and “morue” also match this distinct sablefish result. Do not add bare “cod” or “morue” as aliases.

All 114 manifest-listed recipes and 1,123 ingredient rows were scanned. Full recipe JSON and each ingredient row were checked for sablefish, black cod, morue charbonnière, morue noire, *Anoplopoma fimbria*, coal fish, and poisson charbonnier. **There are zero matching recipe files and zero matching ingredient rows.** No recipe link is supported. The current generic “cooked meat or seafood, to taste” placeholder does not identify a fish species and does not count as demand. No amount, form, package yield, density, conversion, or substitution should be inferred.

## Naming and product boundary

| Name or boundary | Evidence and disposition |
|---|---|
| **sablefish / morue charbonnière — *Anoplopoma fimbria*** | CFIA pairs the English common names “Sablefish” and “Black Cod” with French “Morue Charbonnière” under *A. fimbria*. OQLF’s edible-fish entry gives the preferred Québec French display **morue charbonnière**, English **sablefish / black cod**, and the same Latin name. DFO’s bilingual species profiles also pair Sablefish / Morue charbonnière with *A. fimbria*. This supports one species-scoped identity. |
| **morue noire** | OQLF records it as a term used in some contexts, but says it was not retained by the fishing-products terminology committee. DFO also says that the species is often called morue noire. Current Canadian/Québec product pages use it with sablefish or morue charbonnière. Keep it as a search alias to find the same species, not as the preferred display or a recommendation for fish labels. |
| **Whole/frozen fish and fillets** | A current Montréal fishmonger lists “Morue Charbonnière - Poisson Entier” as a whole frozen product of Canada. A Canadian seafood supplier identifies *A. fimbria* as Black Cod, also known as Sablefish, and lists whole and fillet presentations in fresh and frozen states. These market examples support culinary food-product use; they do not establish a default form, portion, yield, recipe equivalence, or specific SKU as a universal ingredient. |
| **Morue de l’Atlantique / Atlantic cod** | Keep separate. The word “morue” is not a reason to alias sablefish to Atlantic cod. The full species-qualified Québec term names *A. fimbria*, not *Gadus morhua*. |
| **Salt cod / morue salée** | Keep as the separate preserved product row already in the catalog. Neither the shared word “cod” nor the similar French “morue” makes sablefish a salt-cod synonym. |
| **butterfish, gindara, poisson charbonnier, rascasse noire** | Omit as catalog aliases. Retail pages use some of these as product wording, but this review does not establish them as preferred Canadian/Québec ingredient names. OQLF labels rascasse noire as France/Europe usage; poisson charbonnier and butterfish are not needed to identify the proposed row. |

## Labeling and culinary limits

The CFIA Fish List is a Canadian fish-label naming resource that ties acceptable English/French common names and taxonomic identifiers to listed fish. Its listing supports the species/common-name pairing, but does not show that a recipe requesting an unqualified fish name intends sablefish, and it does not establish culinary interchangeability. OQLF’s entry is specifically in the edible-fish domain and supplies Québec terminology; DFO supplies biological species identification. Retail product pages document how products are marketed, not universal naming rules or standardized recipe states.

The integration accepts only the identity. It does not classify the species as interchangeable with cod, halibut, tuna, or another fish; adopt a preparation form; record cooking advice; infer safe raw consumption; or copy retailer portion/yield claims into the catalog.

## Integrated active reference JSON

Root added this identity-only row to the shared catalog. The scientific name is the scope recorded in the ledger; the current reference schema does not have a taxon field.

~~~json
{
  "id": "ingredient-ref-sablefish",
  "nameFr": "morue charbonnière",
  "nameEn": "sablefish",
  "aliasesFr": [
    "morue noire"
  ],
  "aliasesEn": [
    "black cod"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "PROTEIN"
}
~~~

The French display follows OQLF’s preferred term and the CFIA/DFO species pairing. The two aliases are for ingredient search only. In particular, morue noire must not replace morue charbonnière in the display or be represented as CFIA’s preferred French label.

## Integrated ledger record JSON

Root added this record to the research ledger. The source entries are bounded to identity, Canadian/Québec terminology, and product-state examples; the accepted decision does not set recipe, measurement, form, or substitution behavior.

~~~json
{
  "recordId": "ingredient-ref-sablefish",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S01",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Sablefish",
      "title": "CFIA Fish List, sablefish lookup",
      "accessedOn": "2026-10-11",
      "versionOrDate": "2023-09-18 (Fish List modification date)",
      "locator": "Rows for Taxonomic Serial Number 167123, Anoplopoma fimbria.",
      "supports": "Lists Sablefish and Black Cod for Anoplopoma fimbria and pairs Black Cod with the French common name Morue Charbonnière. Supports the accepted Canadian fish-name and taxon pairing; it is not culinary or recipe evidence.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198952/morue-charbonniere",
      "title": "Office québécois de la langue française, morue charbonnière (GDT)",
      "accessedOn": "2026-10-11",
      "versionOrDate": "2011",
      "locator": "Edible-fish domain; preferred French term, English terms, Latin name, and naming note.",
      "supports": "Sets morue charbonnière as the preferred Québec term for edible Anoplopoma fimbria; lists English sablefish and black cod; records morue noire as a term used in some contexts while noting it was not retained by the fishing-products terminology committee.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S03",
      "url": "https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sablefish-morue-charbonniere-eng.html",
      "title": "Fisheries and Oceans Canada, Sablefish species profile",
      "accessedOn": "2026-10-11",
      "locator": "Species heading, Latin Name, and life-history common-name note.",
      "supports": "Identifies Sablefish as Anoplopoma fimbria, describes the species’ Pacific range, and notes that it is often referred to as Blackcod. Biological identification, not a recipe or preparation standard.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S04",
      "url": "https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sablefish-morue-charbonniere-fra.html",
      "title": "Pêches et Océans Canada, profil de la morue charbonnière",
      "accessedOn": "2026-10-11",
      "locator": "Species heading, nom latin, and life-history common-name note.",
      "supports": "Identifies Morue charbonnière as Anoplopoma fimbria, describes its Pacific range, and notes that it is often called morue noire. Biological identification does not make morue noire the preferred commercial-label name.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S05",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "CFIA, Guidance on determining common names for fish sold or processed in Canada",
      "accessedOn": "2026-10-11",
      "versionOrDate": "2023-09-25",
      "locator": "Sections 1, 3.2, and 4.",
      "supports": "Explains that the Fish List provides English/French common names for Canadian fish labelling, ties common names to fish species, and aims to avoid false or misleading names. Does not imply that a culinary recipe phrase selects this species.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S06",
      "url": "https://www.ferro.fish/achat-en-ligne/p/morue-charbonniere-msc",
      "title": "Ferro Poisson et fruits de mer, Morue Charbonnière - Poisson Entier",
      "accessedOn": "2026-10-11",
      "locator": "Current online product page; product title, description, and provenance.",
      "supports": "A Montréal fishmonger lists a whole frozen Morue Charbonnière product of Canadian origin. Product-name and product-state example only; its stated package/portion claims are SKU-specific and are not copied as general yield data.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S07",
      "url": "https://www.seafooddepot.ca/product-blackcod2",
      "title": "Seafood Depot, Black Cod",
      "accessedOn": "2026-10-11",
      "locator": "Species name, also-known-as wording, and product presentation list.",
      "supports": "A Canadian seafood supplier identifies Black Cod as Anoplopoma fimbria, says it is also known as Sablefish, and lists fresh/frozen whole and fillet presentations. Supplier product information, not a terminology authority or a universal recipe form.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept one identity-only PROTEIN reference for Anoplopoma fimbria using the species-specific Canadian/Québec name pair. Keep morue noire as a search-only alternate; keep generic cod/morue, Atlantic cod, salt cod, forms, measurements, conversions, yields, substitutions, and recipe links separate or unset.",
      "sourceIds": [
        "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S01",
        "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S02",
        "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S03",
        "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S04",
        "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S05",
        "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S06",
        "WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S07"
      ]
    }
  ]
}
~~~

## Sources and review limits

| Source ID | Source | Use and limit |
|---|---|---|
| **S01** | CFIA, [Fish List sablefish lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Sablefish) | Ties Sablefish / Black Cod and Morue Charbonnière to *Anoplopoma fimbria*. Canadian common-name list, not a recipe or cooking reference. |
| **S02** | OQLF, [morue charbonnière (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198952/morue-charbonniere) | Preferred fr-CA display, English terms, edible-fish domain, taxon, and the limit on “morue noire.” |
| **S03–S04** | Fisheries and Oceans Canada, [Sablefish](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sablefish-morue-charbonniere-eng.html) and [Morue charbonnière](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sablefish-morue-charbonniere-fra.html) species profiles | Bilingual species and Latin name; Pacific biology and common-name note only. |
| **S05** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Fish List’s Canadian labeling role and its species linkage. It is not proof of recipe intent. |
| **S06** | Ferro Poisson et fruits de mer, [Morue Charbonnière - Poisson Entier](https://www.ferro.fish/achat-en-ligne/p/morue-charbonniere-msc) | Current Montréal-market listing for whole frozen Canadian-origin fish; product naming/state evidence only. |
| **S07** | Seafood Depot, [Black Cod](https://www.seafooddepot.ca/product-blackcod2) | Current Canadian supplier listing with the *A. fimbria* name, “also known as Sablefish,” and fresh/frozen whole or fillet presentations. Commercial evidence, not a regulatory naming authority. |

No CFIA label name is treated as a complete recipe taxonomy. No retail package amount, preparation, storage, or cooking note is generalized to other products or recipes. No tests or emulator were run under the current `AGENTS.md` data-only rule.

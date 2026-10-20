# WP04 Section P — bay scallop identity and picker review (R140)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** bay scallop, *Argopecten irradians*; Québec French **pétoncle de baie**.
- **Recommendation:** Add one identity-only `PROTEIN` reference, separate from generic scallop, sea scallop, Icelandic scallop, and dried scallop.
- **Scope:** Use the current species-specific English and French product names. Document the older OQLF genus-level record without treating it as an exact species mapping, and keep the CFIA shared French alternate visible; do not add `peigne baie de l’Atlantique`, `Atlantic bay scallop`, or scientific names as picker aliases.
- **Data boundary:** Record one supplier label serving as a product-specific observation only. Add no reusable density, unit mapping, form, cooking yield, conversion, recipe link, or substitution.
- **Write scope:** This proposal is the only intended change. It does not edit shared catalog JSON, the ledger, generated files, plan, roadmap, or batch files. No app or Gradle tests were run.

## Candidate selection and ownership audit

The open Section P checklist says “Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.” Its scallop work has integrated the generic scallop / `pétoncle`, sea scallop / `pétoncle géant` (*Placopecten magellanicus*), Icelandic scallop / `pétoncle d’Islande` (*Chlamys islandica*), and dried scallop / `pétoncle séché`. The fresh-scallop boundary review names Bay scallop among the species and products excluded from the generic identity; it did not resolve *Argopecten irradians* as its own species. The R89 sea-scallop review likewise excludes Bay scallop from that different species’ aliases. No focused Bay scallop decision or integration was found in the proposal or batch archive.

The current package contains **1,494** ingredient references, **113** forms, **61** legacy candidates, and **1,839** ledger records with **7,708** source entries. The manifest lists **114** recipes. Exact normalized checks across reference names/aliases, form labels/match terms, legacy names/aliases/IDs, and ledger record IDs found no owner for `ingredient-ref-bay-scallop`, `bay scallop(s)`, `pétoncle(s) de baie`, or *Argopecten irradians*. The generic scallop, sea scallop, Icelandic scallop, and dried scallop references remain separate. No active form is attached to any scallop reference. The proposed ID and source prefix `WP04-SECTIONP-BAY-SCALLOP-R140-20261015` have no current allocation.

## Species identity, Québec French, and Canadian naming

The 2025 OQLF GDT entry authored by Groupe ELiSO gives the French term **pétoncle de baie** and the Latin name *Argopecten irradians*. It is the direct recent Québec French-to-taxon pairing for this candidate. The page does not supply an English common name, so the English label below is attributed to CFIA and current English product listings, not to this OQLF page. [S01]

An older OQLF GDT record, last updated in 1998, gives the same French term, English **bay scallop**, and Latin **Aequipecten sp.** It also describes commercial potential in Québec. Because `sp.` identifies the genus without specifying a species, this record is under-resolved for the exact identity and does not independently establish *A. irradians*. It is not evidence of a different species: current marine taxonomy accepts *Aequipecten irradians* as a synonym of *Argopecten irradians*. [S02, S10]

CFIA’s Fish List is a Canadian common-name resource. Its current output has TSN 79737, *Argopecten irradians*, with separate rows for `Scallop / Pétoncle De Baie` and `Bay Scallop / Peigne Baie De L'Atlantique`. The list does **not** put `Bay Scallop` and `Pétoncle de baie` together in the same row. It also assigns `Peigne Baie De L'Atlantique` to *Argopecten gibbus* / `Calico Scallop`. CFIA says the list supplies acceptable Canadian English/French fish-label names and scientific names with taxonomic serial numbers. These rows support the taxon and Canadian label context, while the bilingual product pair is directly established by the Québec retailer pages below. [S03–S04]

Accordingly, use the species-qualified common-name pair **bay scallop / pétoncle de baie**. Do not add `peigne baie de l’Atlantique`: CFIA uses that French label for two *Argopecten* taxa. Do not add *Argopecten irradians* as an alias; it is taxonomic evidence, not a consumer search term. The 1998 OQLF record supplies only the genus-level label *Aequipecten* and does not resolve an exact species; WoRMS confirms that the named species *Aequipecten irradians* is accepted as *Argopecten irradians*. The 2025 OQLF entry and current product labels provide the exact species pairing used here. [S01–S05, S10]

## Canadian and Québec product evidence

Metro Québec’s product 244940 is titled **Pétoncle de baie** on its French page and **Bay Scallop** on its English page. Both pages identify *Argopecten irradians*. The French page gives a 300 g average-weight item, provenance in China’s Northwest Pacific, and aquaculture by suspended cage/bag. When checked, the selected-store page indicated the item was out of stock. The pages establish current Québec retail naming and a species-specific product listing; they do not guarantee stock at other stores or establish local harvest. [S05–S06]

Québec seafood supplier Pêcheries Océanic lists **Pétoncles de Baie**, explicitly names *Argopecten irradians*, and describes the product as IQF and aquacultured in China. Its product page gives several caliber and case-pack options. These are supplier product specifications, not recipe portions or global count-to-mass rules. The page is a product listing, not a live inventory guarantee. [S07]

Food Basics lists a separate 400 g frozen **Bay Scallops** consumer product and identifies *Argopecten irradians*, China provenance, and farm-raised production. This adds Canadian grocery evidence for the English product name and frozen presentation, but does not establish an exact stock position for every store. [S09]

The reviewed current market evidence therefore supports Canadian/Québec listings for imported, farmed *A. irradians* products. It does not establish in-store availability at the time of review, a current Canadian harvest, or Québec aquaculture supply for this species. Keep product availability separate from harvest geography.

## Exact-key ownership and picker projection

Search behavior follows `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: accent-folded complete word phrases are preferred across reference and form terms, with substring fallback only when no complete phrase matches. The projection below uses the live reference/form package plus the proposed row.

| Query | Current results | With proposed row | Decision |
|---|---:|---:|---|
| `scallop` / `scallops` | 4 | 5 | Remains a multi-result search across generic, dried, sea, Icelandic, and bay scallop. |
| `pétoncle` / `pétoncles` | 4 | 5 | Remains a multi-result Québec search. |
| `bay scallop` / `bay scallops` | 0 | 1 | Resolves the directly named *A. irradians* product. |
| `pétoncle de baie` / `pétoncles de baie` | 0 | 1 | Resolves the 2025 OQLF term and current Québec retail wording. |
| `peigne baie de l’Atlantique` | 0 | 0 | Excluded because CFIA attaches this French label to both *A. irradians* and *A. gibbus*. |
| `Atlantic bay scallop` | 0 | 0 | Not needed for the supported display pair and not added as an alias. |
| `Argopecten irradians` | 0 | 0 | Scientific name remains out of picker terms. |

The generic scallop picker continues to offer multiple references after this addition. No unqualified `scallop` or `pétoncle` alias is added to the bay-specific row.

## Manifest recipe demand

The scan included all **114** manifest-listed recipe files and **1,123** ingredient rows. It examined only each row’s `ingredientName` and `originalText`; recipe titles, descriptions, instructions, tags, and text outside ingredient rows were not counted as ingredient demand. Search terms covered bay scallop singular/plural in English and French, generic scallop singular/plural, and *Argopecten* / *Aequipecten* names.

**Result: zero matching recipe files and zero matching ingredient rows.** No recipe link or ingredient relinking is proposed.

## Product state, numeric evidence, and substitutions

The product listings describe frozen/IQF scallops. They do not justify a global `frozen` or `IQF` form for the species reference. No forms are active for the existing scallop references, and no recipe requests a named scallop state. Add no form.

Pêcheries Océanic’s technical sheet states a nutrition serving of **“1/2 tasse (112 g)”** for its IQF bay scallop product. Preserve this as one supplier-specific published-portion observation only. The sheet does not define the portion’s filling method or establish a reusable cup-to-mass relation across sizes, brands, or preparation states. Its caliber ranges, case packs, and Metro’s approximate 300 g by-weight listing are likewise product-specific. The supplier’s qualitative statement about little volume loss during cooking gives no numeric yield or method. Add no default density, unit mapping, package yield, conversion, or cooking yield. [S05, S07–S08]

No reviewed source supplies a tested substitute or ratio for bay scallop; the recipe corpus contains no scallop request from which a recipe-specific substitute could be researched. Record substitution research as **researched, no supported substitute**. This does not claim that culinary substitution is impossible; it means no catalog rule is supported by this evidence. Add no form conversion, contextual substitution rule, or recipe-line link.

## Recommendation and exact proposed JSON

Add an identity-only `PROTEIN` reference for **bay scallop / pétoncle de baie**, *Argopecten irradians*. Retain only the English and French plurals supported by current product naming. Keep generic scallop, sea scallop, Icelandic scallop, and dried scallop separate. Do not add `Peigne Baie de l’Atlantique`, scientific names, broad aliases, forms, or conversions.

### Ingredient reference

```json
{
  "id": "ingredient-ref-bay-scallop",
  "nameFr": "p\u00e9toncle de baie",
  "nameEn": "bay scallop",
  "aliasesFr": [
    "p\u00e9toncles de baie"
  ],
  "aliasesEn": [
    "bay scallops"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

### Research-ledger record

```json
{
  "recordId": "ingredient-ref-bay-scallop",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26583527/petoncle-de-baie",
      "title": "Office québécois de la langue française, GDT, pétoncle de baie",
      "versionOrDate": "Groupe ELiSO, 2025",
      "accessedOn": "2026-10-15",
      "locator": "French term and linked Latin taxon fields.",
      "supports": "Gives pétoncle de baie and Argopecten irradians in the same taxon-specific GDT entry. This page does not supply the English common name.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198936/petoncle-de-baie",
      "title": "Office québécois de la langue française, GDT, pétoncle de baie (legacy entry)",
      "versionOrDate": "Last updated 1998",
      "accessedOn": "2026-10-15",
      "locator": "Preferred-term entry, English translation, Latin translation, and note.",
      "supports": "Uses pétoncle de baie and bay scallop but links the older record to Aequipecten sp. The entry is a genus-level legacy crosswalk and does not independently resolve the exact species; it does not establish a different species. WoRMS accepts Aequipecten irradians as Argopecten irradians, while the OQLF record itself says only Aequipecten sp.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S03",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=scallop",
      "title": "Canadian Food Inspection Agency, Fish List results for scallop",
      "versionOrDate": "Fish List modified 2023-09-18; query checked 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "TSN 79737 rows for Argopecten irradians; comparison with TSN 79734, Argopecten gibbus.",
      "supports": "For Argopecten irradians, lists separate rows Scallop / Pétoncle De Baie and Bay Scallop / Peigne Baie De L'Atlantique. The latter French wording also appears for Argopecten gibbus / Calico Scallop. This is a Canadian fish-label common-name list; it does not pair Bay Scallop with Pétoncle de Baie in one row.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S04",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list",
      "title": "Canadian Food Inspection Agency, CFIA Fish List",
      "versionOrDate": "Page modified 2019-06-28",
      "accessedOn": "2026-10-15",
      "locator": "Description of acceptable Canadian English/French fish-label common names, scientific names, and TSNs.",
      "supports": "Explains that the Fish List supplies English and French common names acceptable for Canadian fish labelling and gives scientific names and TSNs. This establishes the list's naming role, not a recipe identity or culinary equivalence.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S05",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/petoncle-de-baie/p/244940",
      "title": "Metro Québec, Pétoncle de baie, product 244940",
      "versionOrDate": "Listing accessed 2026-10-15; selected-store page indicated out of stock",
      "accessedOn": "2026-10-15",
      "locator": "French product title, product number, approximate weight/pricing, ingredient identity, provenance, and farming method.",
      "supports": "Titles the item Pétoncle de baie and identifies Argopecten irradians; gives China / Northwest Pacific provenance, aquaculture by suspended cage or bag, and approximately 300 g per item. Confirms a Québec product listing and species pairing, not current stock at all stores or local harvest. The approximate item weight is SKU-specific.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S06",
      "url": "https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/bay-scallop/p/244940",
      "title": "Metro Québec, Bay Scallop, product 244940",
      "accessedOn": "2026-10-15",
      "locator": "English product title and ingredient identity for the same product number as S05.",
      "supports": "Titles product 244940 Bay Scallop and identifies Argopecten irradians in the ingredient text. This provides the English side of the current bilingual Québec retail pair; page-level availability is store-dependent.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S07",
      "url": "https://pecheriesoceanic.com/produit/petoncles-de-baie/",
      "title": "Pêcheries Océanic, Pétoncles de Baie",
      "accessedOn": "2026-10-15",
      "locator": "Product title, species, origin, aquaculture/IQF description, and caliber/case-pack list.",
      "supports": "A Québec seafood supplier lists Pétoncles de Baie, species Argopecten irradians, China origin, aquaculture, IQF product, and supplier-specific caliber/case-pack options. The page is product evidence, not an inventory guarantee or reusable recipe measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S08",
      "url": "https://pecheriesoceanic.com/wp-content/uploads/2023/03/Petoncles-de-baie.pdf",
      "title": "Pêcheries Océanic, Pétoncle de baie technical sheet",
      "versionOrDate": "Technical sheet; accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Species and format fields, nutrition facts serving-size line, and cooking-volume statement.",
      "supports": "Names Argopecten irradians and IQF formats; its nutrition panel states “Pour 1/2 tasse (112 g).” This is one published serving basis for this supplier's product, not a general cup-to-mass conversion. The sheet gives a qualitative cooking-volume statement without a numeric yield or method.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S09",
      "url": "https://www.foodbasics.ca/aisles/frozen/fish-seafood/shrimp-seafood/frozen-bay-scallops/p/059749951722",
      "title": "Food Basics, Irrésistible Frozen Bay Scallops",
      "versionOrDate": "400 g product listing accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Product title, net package weight, ingredient species, provenance, and farming method.",
      "supports": "Lists a 400 g frozen Bay Scallops product and identifies Argopecten irradians, China / Northwest Pacific provenance, and farm-raised production. This is Canadian consumer product evidence; it does not guarantee availability at every store.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S10",
      "url": "https://www.marinespecies.org/aphia.php?p=taxlist&tName=Aequipecten",
      "title": "WoRMS, Aequipecten taxon list",
      "versionOrDate": "Taxon list accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Taxon record for Aequipecten irradians (Lamarck, 1819).",
      "supports": "Lists Aequipecten irradians (Lamarck, 1819) as accepted as Argopecten irradians (Lamarck, 1819). This synonym relation shows that the genus label can be taxonomically compatible with the current species name, but the OQLF record itself is only Aequipecten sp. and does not resolve a species.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "bay-scallop-oceanic-label-serving-r140-20261015",
      "relationship": "portion_weight",
      "value": 112,
      "valueUnit": "g",
      "sourceQuantity": {
        "amount": 0.5,
        "unit": "cup"
      },
      "foodDescription": "One nutrition-label serving of Pêcheries Océanic IQF bay scallops (Argopecten irradians).",
      "foodState": "The listing describes an IQF product; the panel does not specify whether the serving basis is frozen, thawed, or cooked.",
      "measurementMethod": "Published serving declaration on the supplier technical sheet: 1/2 cup (112 g). No independent volume-to-mass method is supplied.",
      "quantityBasis": "One product-label serving only. The sheet does not state a filling method or establish a transferable cup measure across piece sizes, brands, or states.",
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S08"
      ]
    }
  ],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only bay scallop / pétoncle de baie for Argopecten irradians, with source-backed plurals. The 2025 taxon-specific OQLF entry and current Québec product listings support this bounded identity. The 1998 OQLF Aequipecten sp. entry is genus-level and does not independently resolve the exact species; WoRMS accepts Aequipecten irradians as Argopecten irradians. Keep generic scallop, sea scallop, Icelandic scallop, dried scallop, and that under-resolved legacy record distinct.",
      "sourceIds": [
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S01",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S02",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S03",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S05",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S06",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S07",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S09",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S10"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Retain the 1/2 cup (112 g) declaration only as a supplier-specific published-portion observation. The product pack sizes, count/caliber labels, and approximate retail weight do not support a default density, transferable unit mapping, form, package yield, or cooking yield.",
      "sourceIds": [
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S05",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S07",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S08",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S09"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "No reviewed source establishes a bay-scallop substitute or ratio, and no bundled recipe requests scallop. Record no supported substitute; add no conversion, substitution rule, or recipe-line link.",
      "sourceIds": [
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S05",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S07",
        "WP04-SECTIONP-BAY-SCALLOP-R140-20261015-S09"
      ]
    }
  ]
}
```

## Source register

| ID | Direct source | Claim and limit |
|---|---|---|
| S01 | [OQLF GDT, pétoncle de baie (Groupe ELiSO, 2025)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26583527/petoncle-de-baie) | Directly pairs the French term with *Argopecten irradians*; it does not supply an English common name. |
| S02 | [OQLF GDT, pétoncle de baie (1998 record)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198936/petoncle-de-baie) | Genus-level `Aequipecten sp.` crosswalk; it does not independently resolve an exact species. |
| S03 | [CFIA Fish List, scallop results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=scallop) | Current query output lists the English and French terms in separate rows and shows that `Peigne Baie De L'Atlantique` is shared. Fish-label naming evidence, not a picker alias list. |
| S04 | [CFIA Fish List description](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Describes the list’s acceptable Canadian common names and taxonomic identifiers. |
| S05 | [Metro Québec, Pétoncle de baie, product 244940](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/petoncle-de-baie/p/244940) | French product title, *A. irradians*, China-origin farmed listing, approximate item weight; selected store showed out of stock. |
| S06 | [Metro Québec, Bay Scallop, product 244940](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/bay-scallop/p/244940) | English product title and same species/product number as S05. Availability is store-dependent. |
| S07 | [Pêcheries Océanic, Pétoncles de Baie](https://pecheriesoceanic.com/produit/petoncles-de-baie/) | Québec supplier product listing with species, IQF status, origin, and case-pack options; not a stock guarantee or recipe measure. |
| S08 | [Pêcheries Océanic, product technical sheet](https://pecheriesoceanic.com/wp-content/uploads/2023/03/Petoncles-de-baie.pdf) | Supports the published `1/2 tasse (112 g)` serving and supplier-specific formats; it does not establish a universal measure or numeric cooking yield. |
| S09 | [Food Basics, Irrésistible Frozen Bay Scallops](https://www.foodbasics.ca/aisles/frozen/fish-seafood/shrimp-seafood/frozen-bay-scallops/p/059749951722) | Canadian retail listing for a 400 g frozen product with species and China provenance; not a store-by-store stock guarantee. |
| S10 | [WoRMS, Aequipecten taxon list](https://www.marinespecies.org/aphia.php?p=taxlist&tName=Aequipecten) | Accepts *Aequipecten irradians* as *Argopecten irradians*; this resolves the synonymy but does not add species resolution to OQLF's genus-level `Aequipecten sp.` record. |

## Static review record

- Re-read the Section P plan/checklist, roadmap, current reference catalog, forms, legacy identities, research ledger, and relevant proposal archive before selecting the candidate.
- Checked the exact proposed ID, source prefix, and common-name owners against active references, forms, legacy identities, and ledger records; no owner was found. Existing mentions in the broad scallop work are exclusions from other review scopes, not a Bay scallop disposition.
- Mirrored current picker normalization and complete-phrase-first matching. Broad `scallop` / `pétoncle` queries remain multi-result; the supported species-qualified singular and plural queries add one distinct result. The overlapping CFIA French alternate is excluded.
- Scanned only manifest-listed recipe ingredient `ingredientName` and `originalText` fields across all 114 files / 1,123 rows; no scallop or species match was found.
- The proposed ledger record uses the `researched_supported` measurement state only for the one published supplier serving observation. It does not propose a default density or unit mapping. Substitution state is `researched_no_supported_substitute`.
- No shared catalog, ledger, plan, roadmap, batch, or generated file was edited. No tests were run; this was proposal-only work.

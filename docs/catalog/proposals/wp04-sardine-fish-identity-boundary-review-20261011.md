# WP04 Section P — sardine fish identity and product boundary review

- **Packet type:** proposal-only identity, naming, and product-boundary review.
- **Reviewed:** 2026-10-11.
- **Recommendation:** Add two species-qualified, identity-only finfish references for European pilchard (*Sardina pilchardus*) and Pacific sardine (*Sardinops sagax*). Keep an unqualified sardine identity and the wider common-name group unresolved. Hold canned, oil-packed, salted, smoked, dried, marinated, and other prepared sardine products as separate product/form work; add none without an exact recipe or product requirement.
- **Scope:** Québec and Canadian bilingual naming; species and accepted-common-name overlap; raw fish identity versus preserved products; current active catalog, ledger, legacy, and recipe demand.
- **Worktree changes:** this proposal only. It does not change shared catalog JSON, the research ledger, recipes, the plan, roadmap, code, or tests.

## Recommendation and proposed identities

CFIA’s Fish List attaches the accepted name “Sardine” to several species and also uses it for *Engraulis anchoita*, an anchovy-family fish. The OQLF’s Québec edible-fish entry is narrower: it pairs French “sardine” with English “sardine” / “pilchard” and Latin *Sardina pilchardus*. DFO separately names Pacific sardine / sardine du Pacifique as *Sardinops sagax*. Those sources support the two specific references below, but they do not support a single generic sardine row or equivalence among the listed species [S01–S07].

Add only these two species identities if this proposal is accepted:

| ID | Category | English display | fr-CA display | Species scope | Additional aliases |
|---|---|---|---|---|---|
| ingredient-ref-european-pilchard | PROTEIN | **European pilchard** | **sardine européenne** | *Sardina pilchardus* | EN: “European sardine”, “European sardines”. FR: “sardines européennes”. |
| ingredient-ref-pacific-sardine | PROTEIN | **Pacific sardine** | **sardine du Pacifique** | *Sardinops sagax* | EN: “Pacific sardines”. FR: “sardines du Pacifique”. |

The European display uses FAO’s species-qualified English/French common names; OQLF’s entry supplies the Québec-preferred base term “sardine” and directly ties it to *S. pilchardus*. The English alias “European sardine” is a qualified common name recorded by NCBI Taxonomy. The Pacific display uses DFO’s current bilingual fishery name and scientific scope. Keep aliases species-qualified; do not add unqualified “sardine”, “sardines”, “pilchard”, “pilchards”, “Canadian sardine”, “sardine canadienne”, “anchovy”, or “anchois” as aliases.

This proposal does not create an unqualified ingredient-ref-sardine row, choose one taxon for all sardine wording, or relabel the existing Atlantic-herring or anchovy identities. It also does not imply that every species named “sardine” in the CFIA Fish List is represented by these two candidates. The catalog entries would be two explicit species results, not an exhaustive CFIA fish-label lookup.

Exact proposed active-reference JSON:

    [
      {
        "id": "ingredient-ref-european-pilchard",
        "nameFr": "sardine europ\u00e9enne",
        "nameEn": "European pilchard",
        "aliasesFr": ["sardines europ\u00e9ennes"],
        "aliasesEn": ["European sardine", "European sardines"],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-11T00:00:00Z",
        "category": "PROTEIN"
      },
      {
        "id": "ingredient-ref-pacific-sardine",
        "nameFr": "sardine du Pacifique",
        "nameEn": "Pacific sardine",
        "aliasesFr": ["sardines du Pacifique"],
        "aliasesEn": ["Pacific sardines"],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-11T00:00:00Z",
        "category": "PROTEIN"
      }
    ]

No forms, measurements, recipe links, unit mappings, package yields, conversions, or substitutions are proposed. In particular, a recipe line that only says “sardines” or “sardines en conserve” must not be linked to either species or to a preserved product based on this review.

## Current catalog and demand audit

The snapshot below was read on 2026-10-11. Hashes are SHA-256 over exact file bytes. The recipe-corpus digest follows manifest.v1.json order and hashes each relative recipe path, a NUL byte, the file’s exact bytes, and a NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Active ingredient-references.v1.json | 1,016 references | 745be1e811cce72b19f51aec77fe790e39eadf6035db1f998a4b1f2855981cd3 |
| Active ingredient-forms.v1.json | 66 forms | 6d194ec1390e239bc2026ea93edbe5f3c1512f244486c2a8e513aca7173a76bd |
| legacy-import-identities.v1.json | 75 candidates | e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0 |
| research-ledger.v1.json | 1,296 records; 4,171 source entries / 3,419 distinct source IDs | d7849baffe5096e0a6458b52d5190d0fbedefaae6f8151b2d571e1f9e736b77c |
| Seed manifest | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | b4bd736f4b3f6d4fd6528f76419c632c8afec4e9d32a288f668212de5214ab6d |

No sardine, pilchard, *Sardina*, or *Sardinops* name or alias is present in the active references or forms. The only active neighboring finfish identities are separately scoped rows such as ingredient-ref-atlantic-herring (Atlantic herring / hareng de l’Atlantique) and ingredient-ref-anchovy (anchovy / anchois); ingredient-ref-anchovy-paste remains a separate condiment. No sardine form is active. No matching sardine or pilchard legacy candidate exists.

There is no sardine-specific record in the research ledger. The relevant existing fish record is ingredient-ref-atlantic-herring, whose DFO sources verify *Clupea harengus* as Atlantic herring; the record does not claim a sardine alias. The proposed reference IDs are absent from active references, legacy candidates, and ledger record IDs. Exact normalized display and qualified-alias keys listed above have no current owner among active names/aliases, form labels/match terms, or legacy candidate names/aliases. The proposal-local source-ID prefix WP04-SARDINE-FISH-BOUNDARY-20261011-S was absent from the ledger and existing catalog documents before this file was created.

All 114 manifest-listed recipes and their 1,123 ingredient rows were searched for sardine, sardines, pilchard, pilchards, the two proposed species, canned sardines, sardine oil, salted sardines, and Québec French product phrases. There were zero matching ingredient rows and zero matching recipe files. There is no recipe link or product-state demand to resolve. Existing fish-sauce lines remain condiment references and do not establish a sardine ingredient.

The exact candidate keys were also checked against the app’s normalizeIngredientSearchKey behavior: lowercase with Locale.ROOT, Unicode NFKD, fold œ / æ / ß and &, remove combining marks, convert non-alphanumeric runs to spaces, and collapse whitespace. Species-qualified searches can retrieve their own rows; an English or French bare “sardine” search may retrieve the two proposed qualified displays, but it is not a general species assignment or an exhaustive result for all CFIA Fish List names.

## Québec and Canadian species/name boundaries

| Name or taxon | Evidence and disposition |
|---|---|
| **European pilchard — *Sardina pilchardus*** | OQLF’s Québec edible-fish entry gives “sardine”, English “sardine” / “pilchard”, and the scientific name *S. pilchardus*. FAO uses the qualified names “European pilchard” / “sardine européenne”; NCBI records “European sardine” as a GenBank common name and “European pilchard” as a common name. Use the qualified pair shown above, not bare “sardine” or “pilchard” as aliases [S01, S03–S04]. |
| **Pacific sardine — *Sardinops sagax*** | DFO’s current Pacific-region plan uses “Pacific Sardine” / “sardine du Pacifique” with *S. sagax*. DFO reports that the species has not been commercially harvested in British Columbia since 2012 and that formal closures have been in place since 2015; this regional fishery fact does not rule out imported product or define a product form [S05–S06]. |
| **Atlantic herring — *Clupea harengus*** | CFIA’s Fish List includes “Sardine” and “Canadian Sardine” for *C. harengus*, while the catalog’s active species row is Atlantic herring / hareng de l’Atlantique. Keep those identities distinct and do not add “sardine” or “Canadian sardine” as an alias to the herring row [S02, S07]. |
| **Anchovy-family overlap — *Engraulis anchoita*** | CFIA’s Fish List also assigns “Sardine” to *E. anchoita*, alongside “Anchovy” / “Anchois”. This is an accepted common-name overlap, not evidence that sardines and anchovies are culinary synonyms or that the active family-scoped anchovy identity should be changed [S02]. |
| **Other sardine/pilchard names** | The CFIA list applies “Sardine” and/or “Pilchard” to several species in *Sardinella*, *Sardinops*, and other genera; examples include *Sardinella aurita*, *Sardinella maderensis*, and *Sardinops melanostictus*. Keep these taxa out of the two proposed rows. A future identity must begin with its own qualified bilingual name and scope [S02]. |

CFIA says its Fish List supplies English and French common names for Canadian fish labeling and ties names to individual taxa. Its online list page currently displays a 2023-09-18 modification date. The list is useful evidence of Canadian name scope; it does not define ingredient equivalence or recipe substitution [S02, S07].

## Fresh fish versus preserved and prepared products

The proposed references identify species only. They do not declare a default fresh, frozen, whole, filleted, drained, canned, salted, smoked, dried, or oil-packed form.

| Product or wording | Boundary |
|---|---|
| **Fresh or chilled European pilchard / Pacific sardine** | A species identity may name the unprepared edible fish. No recipe chooses a species, cut, or fresh state, so no fresh/chilled form or measurement is proposed. FAO reports multiple market preparations for *S. pilchardus*; that does not make them one interchangeable food state [S10]. |
| **Canned sardines / sardine-type products** | Codex Standard CXS 94-1981 defines a canned product made from multiple listed fish species, including *Sardina pilchardus*, *Sardinops* species, *Sardinella* species, *Clupea harengus*, *Engraulis* species, and *Sprattus sprattus*. The standard covers fish packed in water, oil, or another suitable medium. It is evidence of a distinct product class and broad species scope, not a Canadian authorization to relabel those species as the same raw fish [S08]. |
| **Oil-packed sardines** | Fish in an oil packing medium remains a preserved fish product. CFIA requires descriptors of form, packing medium, or condition when needed to communicate the true nature of a packaged fish product. Do not model oil-packed sardines as the unqualified species identity or treat them as “sardine oil” [S09]. |
| **Sardine oil** | Extracted fish oil is a separate ingredient/product category from fish packed in oil. CFIA’s fish-oil guidance distinguishes oils extracted from a single species from mixed-species fish oils. No oil identity, density, or species equivalence is proposed [S09]. |
| **Salted, smoked, dried, or marinated sardines** | These are preserved or treated fish products, not aliases for an unqualified species. CFIA’s fish-product guidance identifies salted, dried, and smoked condition descriptors; FAO’s *S. pilchardus* sheet separately notes fresh/chilled, salted, smoked, marinated, canned, oil/fish-meal, and bait uses. Those examples do not establish a recipe amount, a general form conversion, or a product that can be linked to either species row [S09–S10]. |
| **Fish meal, fish powder, paste, sauce, and bait** | These are different purposes or preparations. FAO’s market list includes fish meal and bait separately from edible fresh, salted, smoked, and canned forms; the catalog also keeps active fish sauce, anchovy paste, and Bonga fish powder as separate products. No aliases, forms, or substitutions are proposed [S10]. |

CFIA’s product-label guidance says the common name of a fish product must be its prescribed or generally known product name, and requires added descriptors about form, packing medium, or condition when omission could mislead. This supports keeping product state explicit; it does not supply a universal recipe-book form model. Codex is cited here as an international canned-product standard, not as a Canadian labeling rule [S08–S09].

## Proposed research-ledger entries

If the two identity rows are integrated, add only the following identity records. The source IDs below are proposal-local; they have not been added to the shared ledger. Keep measurements and substitutions not yet researched. Do not create ledger records for canned, oil-packed, salted, smoked, dried, or other sardine products in the absence of a recipe or defined product request.

    [
      {
        "recordId": "ingredient-ref-european-pilchard",
        "recordType": "ingredient_reference",
        "identityState": "verified",
        "measurementState": "not_yet_researched",
        "substitutionResearchState": "not_yet_researched",
        "sources": [
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S01",
            "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198919/sardine",
            "title": "OQLF, sardine (GDT)",
            "accessedOn": "2026-10-11",
            "versionOrDate": "1998",
            "locator": "Québec edible-fish entry; term, English equivalents, and Latin name.",
            "supports": "Pairs French sardine with English sardine / pilchard and Sardina pilchardus. Supports the Québec base term and this species; it does not define canned or preserved product equivalence.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S02",
            "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
            "title": "CFIA Fish List, sardine/pilchard species rows",
            "accessedOn": "2026-10-11",
            "versionOrDate": "2023-09-18 (page date modified)",
            "locator": "Rows for Sardina pilchardus and Sardinops sagax and additional Sardine / Pilchard entries, including species from Sardinella and Engraulis.",
            "supports": "Lists French and English common names against individual fish taxa. The published rows assign Sardine or Pilchard names to several species; supports keeping an unqualified catalog identity unresolved and does not establish culinary equivalence.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S03",
            "url": "https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=27697",
            "title": "NCBI Taxonomy, Sardina pilchardus",
            "accessedOn": "2026-10-11",
            "locator": "Current-name and common-name fields.",
            "supports": "Identifies Sardina pilchardus and records European sardine and European pilchard common-name variants. Taxonomy/name evidence only.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S04",
            "url": "https://www.fao.org/4/F0752F/F0752F02.htm",
            "title": "FAO, Manual of Fisheries Science, Sardina pilchardus species-name entry",
            "accessedOn": "2026-10-11",
            "locator": "FAO common names for Sardina pilchardus.",
            "supports": "Lists European pilchard / sardine européenne for Sardina pilchardus. Supports a species-qualified bilingual display; it does not set a Québec regulatory label.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S07",
            "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
            "title": "CFIA, Guidance on determining the common names for fish sold or processed in Canada",
            "accessedOn": "2026-10-11",
            "versionOrDate": "2023-09-25",
            "locator": "Sections 3.2 and 4.",
            "supports": "Explains that accepted common names in the Fish List are tied to individual fish species. It does not treat different listed species or products as interchangeable.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S08",
            "url": "https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B94-1981%2FCXS_094e.pdf",
            "title": "Codex Alimentarius, Standard for Canned Sardines and Sardine-Type Products (CXS 94-1981)",
            "accessedOn": "2026-10-11",
            "locator": "Sections 1–2, scope and product definition.",
            "supports": "Defines canned sardine/sardine-type products made from multiple species and packed in water, oil, or another suitable medium. International product-class evidence only; not a Canadian species-equivalence rule.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S09",
            "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish",
            "title": "CFIA, Labelling requirements for fish and fish products",
            "accessedOn": "2026-10-11",
            "locator": "Sections “Fish oils” and “Descriptive words about the true nature of fish products.”",
            "supports": "Distinguishes fish-oil products from fish meat and describes form, packing-medium, and condition descriptors for packaged fish products. Label guidance only; no ingredient conversion is established.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S10",
            "url": "https://www.fao.org/fishery/docs/CDrom/ARTFIMED/ArtFiWeb/descript/Species/CLUSAPIL.HTML",
            "title": "FAO, Sardina pilchardus species sheet",
            "accessedOn": "2026-10-11",
            "locator": "Fishing and utilization section.",
            "supports": "Reports distinct market preparations for Sardina pilchardus, including fresh/chilled, salted, smoked, marinated, canned, oil, fish meal, and bait. Trade-use examples only; no recipe measurement or conversion is derived.",
            "sourceKind": "other"
          }
        ],
        "decisions": [
          {
            "outcome": "accepted",
            "reason": "Scope this identity to Sardina pilchardus using European pilchard / sardine européenne. Keep bare sardine and pilchard names out of aliases; do not infer canned, oil-packed, salted, smoked, dried, marinated, or other forms. Add no recipe links, measurements, yields, conversions, or substitutions.",
            "sourceIds": [
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S01",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S02",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S03",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S04",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S07",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S08",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S09",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S10"
            ]
          }
        ]
      },
      {
        "recordId": "ingredient-ref-pacific-sardine",
        "recordType": "ingredient_reference",
        "identityState": "verified",
        "measurementState": "not_yet_researched",
        "substitutionResearchState": "not_yet_researched",
        "sources": [
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S02",
            "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
            "title": "CFIA Fish List, sardine/pilchard species rows",
            "accessedOn": "2026-10-11",
            "versionOrDate": "2023-09-18 (page date modified)",
            "locator": "Rows for Sardina pilchardus and Sardinops sagax and additional Sardine / Pilchard entries, including species from Sardinella and Engraulis.",
            "supports": "Lists French and English common names against individual fish taxa. The published rows assign Sardine or Pilchard names to several species; supports keeping an unqualified catalog identity unresolved and does not establish culinary equivalence.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S05",
            "url": "https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/sardine-ifmp-pgip-sm-eng.html",
            "title": "Fisheries and Oceans Canada, Pacific Sardine Integrated Fisheries Management Plan summary",
            "accessedOn": "2026-10-11",
            "versionOrDate": "Modified 2025-01-30; management period 2024-09-30 to 2029-05-31",
            "locator": "Page heading and summary identify Pacific Sardine (Sardinops sagax) and the management-plan period.",
            "supports": "Uses Pacific Sardine for Sardinops sagax in the Canadian fishery context. The page covers the stated management period and does not establish retail availability or recipe use.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S06",
            "url": "https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/sardine-ifmp-pgip-sm-fra.html",
            "title": "Pêches et Océans Canada, résumé du Plan de gestion intégrée des pêches de la sardine du Pacifique",
            "accessedOn": "2026-10-11",
            "versionOrDate": "Modified 2025-01-30; management period 2024-09-30 to 2029-05-31",
            "locator": "Titre et sommaire : Sardine du Pacifique (Sardinops sagax), période du plan.",
            "supports": "Uses sardine du Pacifique for Sardinops sagax in the Canadian fishery context. The page covers the stated management period and does not establish retail availability or culinary use.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S07",
            "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
            "title": "CFIA, Guidance on determining the common names for fish sold or processed in Canada",
            "accessedOn": "2026-10-11",
            "versionOrDate": "2023-09-25",
            "locator": "Sections 3.2 and 4.",
            "supports": "Explains that accepted common names in the Fish List are tied to individual fish species. It does not treat different listed species or products as interchangeable.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S08",
            "url": "https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B94-1981%2FCXS_094e.pdf",
            "title": "Codex Alimentarius, Standard for Canned Sardines and Sardine-Type Products (CXS 94-1981)",
            "accessedOn": "2026-10-11",
            "locator": "Sections 1–2, scope and product definition.",
            "supports": "Defines canned sardine/sardine-type products made from multiple species and packed in water, oil, or another suitable medium. International product-class evidence only; not a Canadian species-equivalence rule.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP04-SARDINE-FISH-BOUNDARY-20261011-S09",
            "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish",
            "title": "CFIA, Labelling requirements for fish and fish products",
            "accessedOn": "2026-10-11",
            "locator": "Sections “Fish oils” and “Descriptive words about the true nature of fish products.”",
            "supports": "Distinguishes fish-oil products from fish meat and describes form, packing-medium, and condition descriptors for packaged fish products. Label guidance only; no ingredient conversion is established.",
            "sourceKind": "regional_authority"
          }
        ],
        "decisions": [
          {
            "outcome": "accepted",
            "reason": "Scope this identity to Sardinops sagax using Pacific sardine / sardine du Pacifique. Keep it separate from Sardina pilchardus, Atlantic herring, anchovy, and all canned or preserved products. Add no recipe links, forms, measurements, yields, conversions, or substitutions.",
            "sourceIds": [
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S02",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S05",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S06",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S07",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S08",
              "WP04-SARDINE-FISH-BOUNDARY-20261011-S09"
            ]
          }
        ]
      }
    ]

## Sources

Online sources were accessed 2026-10-11. Source IDs are local to this proposal and have not been added to the shared ledger.

| ID | Source | Support and limits |
|---|---|---|
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S01** | OQLF, [sardine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198919/sardine) | Québec edible-fish term, English equivalents “sardine” / “pilchard”, and Latin *Sardina pilchardus*. The page notes commercial potential in Québec; it does not define every Canadian or canned-food use of “sardine.” |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S02** | CFIA Fish List, [sardine query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List guidance page](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | The current Fish List results page is dated 2023-09-18 and lists Sardine/Pilchard common names against multiple taxa, including *Sardina pilchardus*, *Sardinella*, *Sardinops*, and *Engraulis anchoita*. Canadian fish-label naming evidence, not recipe equivalence. |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S03** | NCBI Taxonomy, [Sardina pilchardus](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=27697) | Taxon and recorded common names “European sardine” / “European pilchard”. Scientific-name/common-name evidence; not Québec regulatory naming. |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S04** | FAO, [Manual of Fisheries Science, species-name entry](https://www.fao.org/4/F0752F/F0752F02.htm) | Lists the species-specific English/French pair “European pilchard” / “sardine européenne” for *Sardina pilchardus*. This qualified pair is not presented as an OQLF ruling. |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S05** | Fisheries and Oceans Canada, [Pacific Sardine IFMP summary](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/sardine-ifmp-pgip-sm-eng.html) | English Pacific-region name and *Sardinops sagax* scope; the page covers the 2024–2029 management period and was modified 2025-01-30. Not a retail-product or recipe source. |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S06** | Pêches et Océans Canada, [Résumé du PGIP : Sardine du Pacifique](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/sardine-ifmp-pgip-sm-fra.html) | Québec-facing French fishery display and the same species scope; the page covers the 2024–2029 management period and was modified 2025-01-30. The regional fishery status does not define availability of imported products. |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S07** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains that the Fish List ties accepted English/French common names to fish taxa. It is Canadian labeling guidance, not a culinary equivalence standard. |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S08** | Codex Alimentarius, [Standard for Canned Sardines and Sardine-Type Products (CXS 94-1981)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B94-1981%2FCXS_094e.pdf) | Defines a canned product class using several possible species and packing media. International standard evidence only; it is not treated here as Canadian law or a base-species identity. |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S09** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Explains species/product common names, fish oils, and descriptors for fish form, packing medium, and condition. Supports product separation; no recipe conversion or specific sardine product is inferred. |
| **WP04-SARDINE-FISH-BOUNDARY-20261011-S10** | FAO, [Sardina pilchardus species sheet](https://www.fao.org/fishery/docs/CDrom/ARTFIMED/ArtFiWeb/descript/Species/CLUSAPIL.HTML) | Gives species-specific market-use examples including fresh/chilled, salted, smoked, marinated, canned, oil, fish meal, and bait. These examples do not establish kitchen measures, yields, or equivalence among the preparations. |

## Prior work and remaining boundary

The earlier WP04 finfish gap proposal held generic “sardine” and “anchovy” names because CFIA applies these common names across species. The finfish species follow-up and coordinator review left sardine identity work open. This review narrows that open item to two source-qualified species and keeps the broad common-name group and prepared products unresolved; it does not revise those proposal files:

- [WP04 finfish gaps review](wp04-finfish-gaps-20261010.md)
- [WP04 finfish species follow-up](wp04-finfish-species-followup-20261009.md)
- [WP04 finfish identity coordinator review](wp04-finfish-identity-coordinator-review-20261009.md)

Section P remains open for additional finfish, shellfish, and preserved seafood. Any integration of these two rows should preserve their species scope and leave recipes and all form/numeric behavior untouched. No tests were run because this packet is a proposal document only.

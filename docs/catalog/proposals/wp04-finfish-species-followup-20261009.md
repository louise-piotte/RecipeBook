# WP04 Section P — finfish species follow-up

- **Packet type:** proposal-only research and catalog/recipe audit.
- **Review date:** 2026-10-09.
- **Disposition:** advance three species-scoped, identity-only candidates: rainbow trout, white hake, and Atlantic herring. Use the source-backed English and Québec French labels below, with no additional aliases. Do not add forms, numeric data, conversions, yields, substitution rules, or recipe links.
- **Worktree changes:** this proposal only. No shared catalog, recipes, ledger, plan, roadmap, code, or tests are changed.

## Scope and prior work

This is a bounded continuation of Section P. The live package already contains species-qualified Atlantic cod, haddock, Atlantic halibut, Arctic char, and American eel. It also contains separate salmon-fillets, tuna, salt-cod, stockfish, and dried-bonito identities; those product rows are not reopened or treated as evidence for additional fish species. This proposal does not finish the finfish checklist.

The candidates were selected for exact bilingual names and taxonomic anchors in Québec terminology and Canadian government sources. Generic common names are kept out of aliases where sources show that they cover more than one species. Requirements.md and the global catalog plan call for usable English/fr-CA display names, recognized terminology, explicit ambiguity handling, primary sources, and separate identity, measurement, and substitution evidence. All three candidates remain identity-only.

## Refreshed inventory and reproducible audit

The snapshot below was refreshed immediately before this proposal was written. Hashes are SHA-256 values of exact file bytes. The recipe corpus digest sorts the manifest-listed recipe basenames and hashes each basename, a NUL byte, the exact recipe-file bytes, and a NUL byte.

| Artifact | Current count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 618 references | `87220c5008d76b7f89f805e4cebe67d05e3729b9f8e5ae17c878c03763bf31d3` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `docs/catalog/legacy-import-identities.v1.json` | 88 candidates | `048ab0b0d99447ac3374af17ef6aa14681aa06f72fbe6c1139de78beffa984c8` |
| `docs/catalog/research-ledger.v1.json` | 790 records; 1,288 source entries / 1,096 distinct source IDs | `97570bc5586dc066e7b2afe58362b4c79f6ad543c47fd1e2cae3f5b466e5fdfb` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `cc98378c4f49693c810093027be574fa812ae0084a2e6a3b76408e98245c7c43` |

The exact normalized keys for all six proposed display names and the three scientific names were checked against active reference names and aliases, active form labels and match terms, and legacy candidate names and aliases. There were no exact key collisions. The three proposed IDs (`ingredient-ref-rainbow-trout`, `ingredient-ref-white-hake`, and `ingredient-ref-atlantic-herring`) are absent from active references, legacy candidate IDs, and ledger record IDs. No active form is attached to any of the three candidates. The proposal-local source-ID prefix `WP04-FINFISH-FOLLOWUP-20261009-S` was absent from the refreshed ledger and existing catalog research documents.

Search keys followed `normalizeIngredientSearchKey`: lowercase with Unicode NFKD, fold œ/æ/ß and ampersands, remove combining marks, and normalize punctuation/spacing. All 114 manifest-listed recipes and 1,123 ingredient rows were searched using ingredient name, original text, reference ID, and all parsed recipe text. The three candidate name pairs and their scientific names had **zero ingredient-row hits and zero full-file hits**. Existing adjacent fish rows are recipe 077 row 10 (salmon fillets) and recipe 111 row 1 (tuna steak); recipes 093 row 6 and 095 row 5 use fish sauce, which is a condiment rather than a finfish demand. None supports a new candidate, form, or substitution.

## Identity-only candidates

| Candidate ID | Category | English display | fr-CA display | Additional aliases | Species boundary |
|---|---|---|---|---|---|
| `ingredient-ref-rainbow-trout` | `PROTEIN` | **rainbow trout** | **truite arc-en-ciel** | EN: none. FR: none. | *Oncorhynchus mykiss*. Use the OQLF-normalized freshwater name. |
| `ingredient-ref-white-hake` | `PROTEIN` | **white hake** | **merluche blanche** | EN: none. FR: none. | *Urophycis tenuis*. Keep distinct from red hake / merluche-écureuil (*U. chuss*) and generic hake / merluche wording. |
| `ingredient-ref-atlantic-herring` | `PROTEIN` | **Atlantic herring** | **hareng de l’Atlantique** | EN: none. FR: none. | DFO identifies Atlantic herring as *Clupea harengus*. Do not collapse it into unqualified herring / hareng. |

### Name and alias boundaries

- **Rainbow trout:** OQLF directly pairs `truite arc-en-ciel`, `rainbow trout`, and *Oncorhynchus mykiss*, and distinguishes four Québec salmonids called trout. Keep bare `trout` / `truite` out of aliases. OQLF treats `saumon arc-en-ciel` as wording for the marine, anadromous strain and says the normalized consumer-label term is `truite arc-en-ciel`; do not use it as a general alias. DFO describes steelhead as the sea-run form of the same species, but this proposal does not add a steelhead alias or a form.
- **White hake:** CFIA directly pairs `White Hake`, `Merluche Blanche`, and *Urophycis tenuis*. OQLF’s broader `merluche` entry is *Urophycis* sp. and names both merluche blanche and merluche-écureuil as commercially found species; do not add bare `hake` or `merluche` as aliases. Red hake remains a separate identity candidate.
- **Atlantic herring:** DFO’s English and French rebuilding-plan pages use `Atlantic herring` / `hareng de l’Atlantique` with *Clupea harengus*. CFIA separately lists Pacific herring (*C. pallasii*) and multiple river-herring names; omit bare `herring` / `hareng`. CFIA also uses “Canadian sardine” for a *C. harengus* listing, which does not establish a recipe-level alias or an equivalence with sardine products.

## Direct recipe demand and held terms

There is no direct bundled recipe demand for rainbow trout, white hake, or Atlantic herring. The only fish-family words in ingredient rows relevant to this scan are the existing salmon and tuna lines and two fish-sauce lines described above. This is a coverage recommendation, not a recipe relinking request.

Hold the following Section P scope for a later bounded review:

- **Pollock:** CFIA uses `Pollock` for both *Pollachius virens* and Alaska / walleye / Pacific pollock (*Gadus chalcogrammus*). OQLF’s Québec `goberge` names *P. virens*, but CFIA also lists `Goberge` for Alaska pollock. Keep generic `pollock` / `goberge` unassigned until the Québec display and product search boundary can be made unambiguous.
- **Mackerel:** CFIA’s fish list spans multiple mackerel species and uses `maquereau` for more than one listing. OQLF’s general `maquereau` entry does not resolve those Canadian species boundaries. No generic mackerel identity or alias is proposed.
- **Other unselected names:** sole, flounder, turbot, other hake, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, sardine, anchovy, and other regional fish remain open for source-qualified naming. Salmon, tuna, bonito, cod, haddock, halibut, Arctic char, and eel are already represented by the active rows noted above and are not expanded here.

No candidate receives a density, unit mapping, package value, portion default, yield, form, conversion, or substitution. No current recipe line is changed.

## Sources

Online sources were accessed 2026-10-09. These proposal-local source IDs are not ledger additions.

| Source ID | Source and URL | Support and limit |
|---|---|---|
| WP04-FINFISH-FOLLOWUP-20261009-S01 | OQLF GDT, [truite arc-en-ciel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel) | Preferred Québec term, direct English `rainbow trout` and Latin *O. mykiss* pairing; distinguishes Québec trout species and the marine `saumon arc-en-ciel` context. Naming source only. |
| WP04-FINFISH-FOLLOWUP-20261009-S02 | Fisheries and Oceans Canada, [Rainbow Trout](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/rainbow-trout-truite-arc-en-ciel-eng.html) | Confirms *Oncorhynchus mykiss* and distinguishes sea-run steelhead from landlocked freshwater fish; does not establish recipe forms or culinary equivalence. |
| WP04-FINFISH-FOLLOWUP-20261009-S03 | CFIA Fish List, [rainbow trout query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Rainbow%20Trout) | Canadian fish-name cross-check for *O. mykiss* and species-related trade wording. The CFIA French listing and OQLF’s normalized Québec label differ; the proposed display follows OQLF. Fish List last modified 2023-09-18. |
| WP04-FINFISH-FOLLOWUP-20261009-S04 | CFIA Fish List, [white hake query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=White%20Hake) | Direct English/French/common-name and *Urophycis tenuis* pairing. Fish List last modified 2023-09-18. |
| WP04-FINFISH-FOLLOWUP-20261009-S05 | Fisheries and Oceans Canada, [Plan de rétablissement : Merluche blanche, *Urophycis tenuis*](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2025/white-hake-merluche-blanche-2025-fra.html) | Confirms the exact Québec French name and species. Fishery/biology source, not a recipe, portion, or substitution source. |
| WP04-FINFISH-FOLLOWUP-20261009-S06 | OQLF GDT, [merluche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199931/merluche) | Defines the broader term as *Urophycis* sp. and identifies merluche blanche and merluche-écureuil as separate commercial species; supports withholding generic aliases. |
| WP04-FINFISH-FOLLOWUP-20261009-S07 | Fisheries and Oceans Canada, [Rebuilding plan: Atlantic Herring, *Clupea harengus*](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/herring-hareng/2025/herring-4t-hareng-eng.html) | English species-qualified label and taxon. Management document, not culinary or measurement evidence. |
| WP04-FINFISH-FOLLOWUP-20261009-S08 | Pêches et Océans Canada, [Plan de rétablissement : Hareng de l’Atlantique, *Clupea harengus*](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/herring-hareng/2025/herring-4t-hareng-fra.html) | Exact French species-qualified label and taxon. Management document, not culinary or measurement evidence. |
| WP04-FINFISH-FOLLOWUP-20261009-S09 | CFIA Fish List, [herring query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Herring) | Shows Atlantic herring alongside Pacific herring and other herring-named taxa; supports withholding unqualified `herring` / `hareng`. Fish List last modified 2023-09-18. |
| WP04-FINFISH-FOLLOWUP-20261009-S10 | CFIA Fish List, [pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock) | Shows `Pollock` attached to *P. virens* and *G. chalcogrammus*, and `Goberge` attached to Alaska pollock; supports deferral of generic aliases. Fish List last modified 2023-09-18. |
| WP04-FINFISH-FOLLOWUP-20261009-S11 | OQLF GDT, [goberge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198637/goberge) | Québec/Canada term `goberge`, English `pollock` / `Atlantic pollock`, and *Pollachius virens*; also notes use of goberge flesh in surimi. It does not resolve the CFIA cross-species name collision. |
| WP04-FINFISH-FOLLOWUP-20261009-S12 | CFIA Fish List, [mackerel query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=MACKEREL) | Returns multiple mackerel-named taxa and supports holding a generic `mackerel` identity or alias. Fish List last modified 2023-09-18. |

## Source and candidate ID checks; remaining work

The source IDs above use a proposal-local prefix that had no match in the refreshed ledger or existing catalog research documents. The proposed reference IDs were checked against active reference IDs, legacy candidate IDs, and ledger record IDs; none is currently owned. The only candidate additions recommended here are the three bilingual identity-only rows. Remaining Section P names, regional fish terms, preserved products, shellfish, roe, surimi, and species-specific measurement/substitution evidence stay open.

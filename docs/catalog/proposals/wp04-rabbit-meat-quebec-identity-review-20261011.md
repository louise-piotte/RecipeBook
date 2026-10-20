# WP04 Proposal: Rabbit Meat / Viande de lapin Identity Review

**Review date:** 2026-10-11

**Status:** Root independently reviewed, accepted, and integrated as an identity-only reference on 2026-10-11.

**Scope:** The open WP04 Section O rabbit item, checked against current Canadian and Québec product naming, the current active catalog and legacy candidates, and the full manifest-listed recipe corpus.

## Recommendation

**Accept a narrowly scoped identity-only candidate** for plain human-food rabbit meat, with no recipe links or active measurement or substitution behavior. The Québec Ministry of Agriculture, Fisheries and Food (MAPAQ) currently describes rabbit meat as a specialty food sold in Québec grocery stores and directly by producers. MAPAQ’s animal-welfare guide identifies domestic rabbit as *Oryctolagus cuniculus domesticus*. Together, these sources support an internal candidate named **rabbit meat / viande de lapin**, scoped to meat from farmed domestic rabbit. They do not establish a recipe amount, product form, yield, or culinary replacement.

| Proposed field | Candidate value |
|---|---|
| ID | `ingredient-ref-rabbit-meat` (available in the snapshot inspected) |
| Category | `PROTEIN` |
| English name | `rabbit meat` |
| French name | `viande de lapin` |
| Aliases | None. The canonical names contain the search terms `rabbit` and `lapin`; no additional alias is needed. |
| Identity scope | Plain human-food skeletal meat from farmed domestic rabbit, using MAPAQ’s listed domestic taxon *Oryctolagus cuniculus domesticus* as the source-bounded scope. |
| Density, unit mappings, forms, yields, conversions, substitutions | None proposed. Leave measurement and substitution research unestablished. |

This recommendation is an identity proposal, not a finding that every rabbit product or source is approved for sale in Canada. CFIA’s current import guidance lists rabbit meat only within origin-, product-, establishment-, and certification-specific rules. No package, brand, processor, or import shipment was reviewed.

## Product and species boundary

- **Include:** Plain skeletal meat sold for human food from farmed domestic rabbit. MAPAQ’s current Québec page uses the food expression `viande de lapin`; its separate domestic-animal guide lists `Lapin domestique — Oryctolagus cuniculus domesticus`. The species and farming scope is an inference from these two sources, not a rabbit-meat compositional standard.
- **Exclude live animals and pet products:** MAPAQ notes that many rabbit keepers raise animals as a hobby, for self-consumption, or as pets, while it separately describes producers whose activity is rabbit meat. Live rabbits, companion animals, and pet feed are not this human-food ingredient.
- **Exclude wild rabbit and hare/game:** Québec’s hunting guidance names `lapin à queue blanche`, `lièvre arctique`, and `lièvre d’Amérique` separately as small game. OQLF defines `lapin à queue blanche` as a wild rabbit and identifies it as *Sylvilagus floridanus*; Québec identifies `lièvre d’Amérique` as *Lepus americanus*. Do not alias `hare`, `lièvre`, `lapin à queue blanche`, `cottontail`, `wild rabbit`, or `gibier` to the farmed meat candidate.
- **Exclude transformed rabbit products:** MAPAQ names rillettes, confits, and chorizo as processed rabbit products. These are not synonyms for plain rabbit meat. Do not include meat preparations, broth/extract, pet feed, or offal under the proposed name.
- **Do not infer physical forms:** No recipe demand or product-specific source supports an active `whole`, `cut`, `ground`, `raw`, `cooked`, `fresh`, `chilled`, or `frozen` form. Preserve such wording on a future recipe line until evidence and demand support a separate representation.

CFIA’s export certificate commodity table places both `Rabbit` and `Hare` product-common-name rows under a `Rabbit` hierarchy in several export categories. That is an administrative export classification, not evidence that the names are culinary synonyms; the table itself keeps the product-common-name rows separate. The Québec wildlife and OQLF sources provide the clearer species boundary for this proposal.

## Canadian and Québec naming and status

MAPAQ uses `viande de lapin` for a Québec human-food product and says consumers can find it at grocery stores or directly from producers. The page also describes the sector as specialty-food production and lists some transformed products. These statements establish a current, local food category and French product wording; they do not establish a prescribed bilingual retail label or authorize every individual product.

CFIA’s general common-name guidance requires a common name on the principal display panel of prepackaged food and requires the name on consumer prepackaged food to be in both French and English. It says a name should be prescribed where a standard applies, otherwise generally known or specific and descriptive. The current CFIA-incorporated Volume 7 meat-product standard reviewed here contains no `rabbit` or `hare` entry, so no rabbit-specific standardized name was identified in the current standard pages reviewed. `Rabbit meat / viande de lapin` is therefore the proposed catalog display pair, grounded in MAPAQ’s French food wording and OQLF’s animal-term pairing `rabbit / lapin`; it is not presented as a ruling on any particular package.

CFIA’s current country eligibility page lists `Rabbit – raw` for specified origins, including France and Hungary, and marks those entries with additional requirements. CFIA’s EU conditions include rabbit-specific animal-health and handling certification. These pages show rabbit meat as a regulated human-food commodity and make clear that import eligibility is conditional. They do not establish blanket approval for all origins, products, establishments, or domestic-market labels.

## Current catalog, ledger, and recipe demand

The refreshed point-in-time snapshot is from the shared worktree on 2026-10-11. Shared catalog files were changing during review, so recheck before integration.

| Artifact | Snapshot | SHA-256 / digest |
|---|---:|---|
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files | 114 files / 1,123 ingredient rows | `09e82b7d7ff8922e552869bf3a355e71ad3817b4a6d8ec9fd030f73e73963e37` |
| `ingredient-references.v1.json` | 939 references | `53017642b778177d42cff2899ccc015a290823fbb3bc828b9dbff424e4291126` |
| `ingredient-forms.v1.json` | 52 forms | `2d1d872697cae29d9c448e1df11f9bd3405306ea1f3f860fc2b4163180288c50` |
| `legacy-import-identities.v1.json` | 75 candidates | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| `research-ledger.v1.json` | 1,203 records / 8 unit conversions / 3,463 source entries | `94fc509973bcea2cd7db6b04964d2326934e3ae3f0ca23cdf9afc65d3fb62113` |

The recipe digest is SHA-256 over manifest-listed recipe filenames sorted lexically, followed for each by the basename, a NUL byte, exact file bytes, and a NUL byte. Counts and hashes identify this snapshot only.

I applied the current `IngredientSearch.kt` key normalization (lowercase, NFKD, fold `œ`/`æ`/`ß`, convert `&` to `and`, strip combining marks, and normalize punctuation/spacing) to the reference names and aliases, form labels and match terms, and legacy candidate names and aliases. No exact key or proposed ID collision was found for `rabbit`, `rabbit meat`, `viande de lapin`, `lapin`, `lapin domestique`, `domestic rabbit`, *Oryctolagus cuniculus domesticus*, `hare`, `hare meat`, `lièvre`, `lièvre d’Amérique`, `lapin à queue blanche`, `eastern cottontail`, `cottontail`, `wild rabbit`, `lapin sauvage`, `gibier`, or `lapereau`. No matching key was found in ledger records or unit conversions. No current active reference, form, or legacy candidate owns this identity.

The current app search simulation returns no result for `rabbit`, `rabbit meat`, `lapin`, or `viande de lapin`. A partial-search fallback for `hare` returns `ingredient-ref-atlantic-herring` because `hare` is a substring of normalized French `hareng`. This is a search false positive, not an identity collision; it is another reason to avoid the alias `hare`.

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for normalized phrase matches in rabbit/meat terms, including `rabbit`, `rabbit meat`, `viande de lapin`, `lapin`, `hare`, `lièvre`, `lapin à queue blanche`, and `cottontail`. No ingredient row matched. The candidate has no recipe-level demand or source-linked quantity in this bundled corpus. The checklist category remains broad and open; identity coverage should not be represented as existing recipe demand.

## Measures, conversions, yields, and substitutions

No source reviewed supports a household measure, pack size, mass-volume conversion, density, edible-portion factor, raw-to-cooked yield, or recipe substitution for rabbit meat. MAPAQ’s sector figures are production and market statistics, not kitchen measurements. Its description of the meat as lean and its comments about taste are qualitative product descriptions and do not justify an amount or substitution. The CFIA processing/chilling material concerns licensed establishments and cold-chain control, not recipe conversion or cooking yield.

Accordingly, do not add a density, unit mapping, `g/ml` value, count conversion, yield, or global/contextual substitution to the active catalog. Do not substitute hare/game, poultry, or another meat based on species relationship or broad culinary similarity. If an exact rabbit recipe appears later, record its source-specific ingredient wording and amount on that recipe line; do not generalize it.

## Source-to-claim register

All external sources below were accessed on **2026-10-11**. Source IDs are local to this proposal and have not been added to the shared research ledger. New prefix `WP04-RABBIT-20261011-S` was checked against the ledger, proposal files, and batch files before this proposal was created.

| ID | Primary source | Supports | Limits |
|---|---|---|---|
| **S01** | MAPAQ, [Élevage de lapins (cuniculture)](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/elevage-lapins-cuniculture) | Current Québec page (last updated 2026-03-05) uses `viande de lapin`, describes it as a specialty meat sold through grocery stores and producers, distinguishes meat producers from hobby/pet keeping, and names rillettes, confits, and chorizo as transformed rabbit products. | Sector description and market availability, not a retail label standard, specific SKU, recipe measure, yield, substitution, or blanket legal approval. Some numerical sector figures on the page are marked 2019 or 2020 and were not treated as current. |
| **S02** | MAPAQ, [Guide d’application de la Loi sur le bien-être et la sécurité de l’animal](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/sante-animale/bien-etre-animal/GM_Guide_application_Loi_Bien_etre_animal_MAPAQ.pdf), 2nd ed. (2022), printed p. 10 / PDF p. 9 | Lists `Lapin domestique — Oryctolagus cuniculus domesticus` among domestic species. | Animal-welfare/legal classification, not a food identity or meat-labeling standard. Using it as the farmed-meat scope alongside S01 is an inference. |
| **S03** | OQLF, [lapin, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423618/lapin) | Zoology entry pairs French `lapin` with English `rabbit`. | Animal terminology, not a rabbit-meat product name; MAPAQ S01 is the source for `viande de lapin`. The entry is dated 2003. |
| **S04** | CFIA, [Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name), “Manner of declaring” and “Choosing an appropriate common name” | Requires a common name on prepackaged foods and bilingual French/English common name on consumer prepackaged products; states how to choose prescribed, generally known, or descriptive names. | General Canadian label guidance, not a rabbit-specific standard or approval of a particular package. |
| **S05** | CFIA, [Labelling requirements for meat and poultry products](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products), “Species-specific common name” | Says species-specific meat names must reflect the source species and that proof of origin/segregation must be available to CFIA on request. | General meat-labeling guidance; the rabbit-specific common-name question is checked against the incorporated standard in S12. |
| **S06** | CFIA, [Eligible countries and meat products for importation into Canada](https://inspection.canada.ca/en/importing-food-plants-animals/food-imports/food-specific-requirements/eligible-countries), country entries for France and Hungary | Lists raw rabbit meat for those origins with the linked additional-requirements footnote. | Import eligibility is country-, product-, establishment-, and certification-specific and may change. It is not blanket sale authorization for all rabbit products. |
| **S07** | CFIA, [Conditions for importing meat products from the European Union](https://inspection.canada.ca/en/importing-food-plants-animals/food-imports/food-specific-requirements/approved-countries/european-union), §§2.2.4 and 3.10 | Describes accepted EU-origin rabbit meat/product categories and rabbit-specific animal-health/handling certification conditions. | Import conditions, not household food safety advice or recipe-state evidence. |
| **S08** | Gouvernement du Québec, [Chasse au petit gibier](https://www.quebec.ca/tourisme-loisirs-sport/activites-sportives-et-de-plein-air/chasse-sportive/gibier/petit-gibier) | Lists `lapin à queue blanche`, `lièvre arctique`, and `lièvre d’Amérique` separately as small game. | Wildlife/hunting classification, not food-market naming or permission to sell wild game. |
| **S09** | OQLF, [lapin à queue blanche, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355662/lapin-a-queue-blanche) | Identifies `lapin à queue blanche` as a wild rabbit, English `eastern cottontail rabbit`, scientific name *Sylvilagus floridanus*. | Wildlife terminology; does not establish meat-product labeling or recipe use. Entry last updated 2005. |
| **S10** | Gouvernement du Québec, [Lièvre d’Amérique](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/lievre-amerique) | Identifies `lièvre d’Amérique` as `Snowshoe Hare`, *Lepus americanus*, and distinguishes it from `lapin à queue blanche`. | Wildlife species guide, not a meat-product or retail-label standard. |
| **S11** | CFIA, [Commodity table: Categorized listing of food products for export](https://inspection.canada.ca/en/exporting-food-plants-animals/food-exports/certification/certificate-free-sale/commodity-table), rabbit group | Under several export product categories, the table shows separate product-common-name rows for `Rabbit` and `Hare`. | Export certificate workflow hierarchy only; does not establish culinary synonymy, consumer label wording, domestic market authorization, or species equivalence. |
| **S12** | CFIA, [Canadian Standards of Identity: Volume 7 – Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7), amended 2024-12-18 | The current incorporated standard defines meat and lists identity standards for specified meat products; the reviewed document has no `rabbit` or `hare` entry. | Absence in this document only; general common-name guidance for foods without a prescribed standard is in S04. This is not a determination about all CFIA rules or a specific label. |

## Review outcome

At review time, the Section O rabbit item had no active catalog owner or recipe line, but current Québec government sources established a distinct farmed human-food product and a stable French food phrase. The root accepted the narrow identity-only `rabbit meat / viande de lapin` reference, kept wild rabbit and hare/game separate, and added no aliases, forms, measurements, conversions, yields, or substitutions; the integration is recorded below.

## Root integration

The root review independently checked the live MAPAQ cuniculture page, the MAPAQ domestic-species guide (printed page 10 / PDF page 9), and the OQLF `lapin` entry. It also rechecked exact normalized-name ownership and the recipe corpus; the review snapshot had 939 references, 52 forms, 75 legacy candidates, and no matching rabbit ingredient rows among 114 recipes / 1,123 ingredient rows. The identity is now active as `ingredient-ref-rabbit-meat`, category `PROTEIN`, with display names `rabbit meat / viande de lapin`, no aliases, no forms, no recipe links, and no numeric or substitution behavior. The broader product classes remain separate. Ledger source IDs `WP04-RABBIT-20261011-S01` through `S03` are attached to the active record.

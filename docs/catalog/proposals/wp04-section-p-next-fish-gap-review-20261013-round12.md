# WP04 Section P — Manila clam species and picker boundary (round 12)

- **Review date:** 2026-10-13.
- **Candidate:** Manila clam, currently named *Venerupis philippinarum* by CFIA/DFO; accepted taxon *Ruditapes philippinarum*.
- **Recommendation:** **Hold** a species-specific active row and keep the existing generic `ingredient-ref-clam` candidate unresolved. The candidate’s species identity is well supported, but the Canadian Fish List assigns both `Manila Clam` and `Palourde Japonaise` to other clam taxa as well. The current picker would expose the proposed species as the sole result for broad `clam` and `palourde` searches.
- **Scope:** one previously unallocated Manila-clam species boundary. This does not reopen the generic clam hold, the Stimpson’s surf-clam hold, the cockle/coque hold, or the scallop identity.
- **Shared-data effect:** none proposed. No reference, form, recipe link, measurement, substitution, or ledger record is added by this packet.
- **New proposal-local source IDs:** `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S01` through `S08`. Existing CFIA and DFO source IDs are reused where noted below.

## Why this is a distinct open question

The current Section P checklist keeps species and regional seafood boundaries open. The 2026-10-12 generic-clam review named `manila clam` among its exact-key scan terms, but it did not assess a Manila-clam species row, the current taxonomic name, or the two CFIA common-name collisions found here. Its decision remains the broader hold on unqualified `clam / palourde`; this review leaves that decision intact and asks whether a particular species can be allocated without making its names look exclusive.

The prior archive and current data contain no focused Manila-clam proposal or batch, no `ingredient-ref-manila-clam` row or form, and no Manila-clam ledger identity. The active held candidate `ingredient-ref-clam` remains the only ledger-level clam identity record. A broad search result in the previous clam review is not an allocation to this species.

## Identity and Canadian / Québec naming evidence

The Office québécois de la langue française (OQLF) treats **palourde japonaise** as the preferred Québec edible-mollusc term and directly pairs it with English **Manila clam** and *Tapes philippinarum*. The entry says *Tapes philippinarum* appears to be falling out of use; it lists **asari**, **tapes japonais**, and **tapès japonais** as contextual terms not retained for Québec fish-product marketing. The current accepted scientific name is *Ruditapes philippinarum*. NCBI Taxonomy records *Venerupis philippinarum* and *Tapes philippinarum* as synonyms of that accepted name. CFIA and DFO still use *Venerupis philippinarum* in Canadian fish and aquaculture material. These are naming histories for one target taxon, not evidence that every product bearing a Manila- or Japanese-littleneck name is that taxon.

The collision is visible in the CFIA Fish List itself:

| CFIA taxon and TSN | Listed English / French common names relevant here | What it means for allocation |
|---|---|---|
| *Venerupis philippinarum*, TSN 81477 | `Manila Clam`; `Clam / Palourde Japonaise` | Direct Canadian naming for the OQLF/DFO Manila-clam species. |
| *Venerupis variegata*, TSN 205646 | `Littleneck Clam / Palourde Japonaise`; also `Clam / Palourde` | The exact French phrase is also assigned to a second CFIA taxon. |
| *Protothaca staminea* (CFIA TSN 81464) | `Clam / Palourde du Pacifique`; `Manila Clam`; `Pacific Littleneck Clam` | The exact English phrase is also assigned to a separate littleneck-clam taxon. DFO independently lists Pacific littleneck and Manila clams as separate species. |

CFIA says its Fish List pairs English/French common names accepted for Canadian fish labels with scientific names and taxonomic serial numbers. The list is marked modified 2023-09-18; the listed rows were rechecked on 2026-10-13. These entries establish a Canadian label-name collision. They do not establish that the taxa are culinary equivalents or that a retail item uses the name correctly.

OQLF’s term is therefore useful Québec naming evidence for *R. philippinarum*, but it does not remove the conflict across Canadian fish-label names. Do not broaden the candidate to the generic clam identity or treat the collision as a synonym decision.

## Product evidence and market scope

DFO’s current Manila-clam species profile identifies *Ruditapes philippinarum*, places it on the Pacific coast, describes a BC commercial fishery, and says Manila clams are commonly sold live to restaurants in the United States. Its page was modified 2026-06-11. DFO’s current Pacific shellfish aquaculture licence separately lists Manila clam (*Venerupis philippinarum*) as a licensed species. This supports an active Canadian species and harvest/culture boundary, while remaining specific to British Columbia; it does not establish current Québec cultivation or province-wide availability.

Current Canadian product evidence is similarly scoped:

- Cooper’s Cove in Sooke, British Columbia lists **Manila Clams – 1 LB** as a fresh product and offers 1, 3, and 5 lb options. Its page does not give a binomial, number of clams, live/shucked status, or edible-yield basis. Those weights are seller/SKU options only.
- Capillas Enterprise says it stocks Manila or Japonica clams directly from producers on Canada’s Pacific coast and handles three sizes. It is supplier evidence for Canadian trade, not a species declaration on an individual package.
- Metro Québec’s current fish-counter article uses **palourde de Manille** while discussing clam varieties and says this type is frozen whole for export. It supplies Québec-facing wording and a product-state example, but no binomial or package listing. The phrase is not substituted for OQLF’s preferred **palourde japonaise** in the conditional row.
- A current Montréal restaurant delivery menu for Fish Bone + Elefanté lists **palourdes de Manille** in its spaghetti alle vongole. This supports a local menu use of the phrase, but the menu does not identify a scientific taxon or product specification. A previously considered Joséphine Uber Eats menu is excluded as stale: Uber Eats now reports that venue closed and unavailable since 2026-05-14. No current Québec grocery package naming *R. philippinarum* by binomial was located in this pass; that search limit is not evidence of absence from Québec commerce.

The local sources show that Manila-clam wording appears in Québec commerce, while the strongest species-specific current fishery/product evidence is from British Columbia. They do not override the CFIA common-name collisions.

## Exact ownership and source-ID audit

The exact-key audit used the same normalization as `normalizeIngredientSearchKey`: lowercase, NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. It checked current active reference display names and aliases, form labels and match terms, legacy-candidate names and aliases, ledger record IDs/identity names, and the Section P proposal/batch archive.

| Normalized key or identifier | Current owner / evidence state |
|---|---|
| `Manila clam`, `Manila clams`, `Japanese littleneck clam`, `palourde japonaise`, `palourdes japonaises`, `palourde de Manille`, `clam`, `palourde`, *Ruditapes philippinarum*, *Venerupis philippinarum*, *Tapes philippinarum* | No exact active-reference, form, or legacy-import owner. The prior generic-clam packet mentions `Manila clam` only in its scan; the open generic candidate is not an active search result. |
| `ingredient-ref-manila-clam` | Absent from current references, forms, legacy candidates, ledger record IDs, and focused prior packet titles. Do not create it while this hold stands. |
| `ingredient-ref-clam` | Existing ledger candidate only; `identityState: needs_clarification`. It remains generic and is not an active picker row. |
| Forms | No current form is attached to a Manila-clam identity. No form is proposed. |
| New source prefix `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S` | No source-ID occurrence in the current ledger or archive before this proposal. The eight new IDs below are distinct from one another. |

The already registered DFO bivalve-identification source `WP04-MOLLUSKS-20261009-S14` is reused, not given a new ID. The previous generic-clam proposal’s CFIA Fish List source `WP04-CLAM-QUEBEC-BOUNDARY-20261012-S01` is also reused and rechecked; this packet does not duplicate either source ID. Other reused older sources are not counted among the eight new IDs.

## Current and conditional picker projection

The picker indexes active bilingual display names, aliases, and attached form terms. It first returns complete normalized word-phrase matches, then uses substring matches if no full-phrase result exists. The current catalog has no active clam species row, so the queries below return no current reference. The conditional projection is only the narrow identity-only shape that would be considered if the name collision were later resolved; it is **not** recommended for integration now.

| Query | Current result | If the conditional row below were activated | Boundary |
|---|---|---|---|
| `Manila clam` | No result | Manila clam / palourde japonaise | Exact display match, but CFIA also applies `Manila Clam` to *P. staminea*. |
| `palourde japonaise` | No result | Manila clam / palourde japonaise | Exact Québec display match, but CFIA also assigns the phrase to *V. variegata*. |
| `clam` | No result | Manila clam / palourde japonaise only | The English display contains the broad word; a singleton would suppress the wider clam scope. |
| `palourde` | No result | Manila clam / palourde japonaise only | The French display contains the broad word; a singleton would overstate the species scope. |
| `Manila clams`, `Japanese littleneck clam`, `littleneck clam`, `palourde de Manille`, `asari`, `Japonica clam` | No result | No result with empty alias arrays | These are not proposed as aliases. The unqualified terms and supplier/menu wording have different evidence and market scope; OQLF marks `asari` and Japanese-transliterated variants unretained for Québec fish-product marketing. |

Conditional fields considered solely to measure the impact:

```json
{
  "id": "ingredient-ref-manila-clam",
  "category": "PROTEIN",
  "nameEn": "Manila clam",
  "nameFr": "palourde japonaise",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": []
}
```

No form is attached in this projection. Adding plural or alternate-name aliases would add more queries, but would not repair the demonstrated singleton results for `clam` and `palourde`; no aliases are recommended while the species allocation is held.

## Recipe demand

The full current manifest was scanned in manifest order: **114 recipe files, 1,123 ingredient rows, and 753,792 raw recipe-file bytes**. The scan checked every complete recipe JSON document and every ingredient row for `Manila clam(s)`, `Japanese littleneck clam(s)`, `clam(s)`, `palourde(s)`, `palourde(s) japonaise(s)`, `palourde(s) de Manille`, `Japonica clam(s)`, `asari`, and the relevant scientific names. It found **zero matching recipe files and zero matching ingredient rows**.

Recipe 093#4 still says `Cooked meat or seafood, to taste`; it is unlinked, species-neutral optional wording and does not request clams. No recipe link, relink, product state, or recipe-derived quantity is supported.

## Measurement and substitution evidence

| Dimension | Evidence found | Catalog decision |
|---|---|---|
| Identity | OQLF, CFIA, DFO, and current taxonomy sources identify the species/name boundary. | This evidence does not make its market names unique in the CFIA list. Hold the active row. |
| Product state | DFO describes live sales to restaurants in the U.S.; a current BC seller lists a fresh Manila-clam product; Metro’s Québec counter article mentions whole/frozen Manila clams. | These are source-scoped product descriptions, not a common global form. Add no live, fresh, frozen, whole, or shucked form. |
| Measurements | DFO’s approximately 75 mm biological maximum length is not a kitchen quantity. Cooper’s Cove lists 1/3/5 lb seller options without count or edible basis. No source supplies a transferable serving, shell-to-meat yield, or volume measure. | Add no default measure, density, unit mapping, package yield, or conversion. Retain the pound values only as listing/SKU observations if the product is later researched in the ledger. |
| Substitutions | No reviewed recipe or source supports Manila clam as a global or contextual replacement for generic clam, littleneck, quahog, surf clam, scallop, or another shellfish. Shared bivalve family and CFIA name overlap are not cooking evidence. | Add no substitution finding or rule. Do not infer cooking, raw-consumption, storage, or safety equivalence. |

## Baseline snapshot

Proposal-time snapshot read on 2026-10-13. JSON and generated-file hashes cover exact bytes. The corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Artifact | Count | Bytes | SHA-256 / fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,343 references | 430,576 | `43c02ea1acdf0ff3cc2e47a6ac28a634f7fd08488e5a40b52b063d4663ff9a05` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,654 records; 6,363 sources; 5,340 distinct source IDs | 6,330,103 | `0c371c92e0ac81492d2f65020dd59235ee63f2b42f9c02e692cc0497958e5c22` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,343 references | 588,994 | `34ba41f3731379d77c00cddf0e9d46356741f23097d4c7f4ca148a0fb35348d0` |

## Source register

Sources were checked on 2026-10-13. Reused source IDs refer to the same archived/ledger source; new IDs are proposal-local and were checked for collisions against the current ledger and proposal/batch archive. Sources establish species names, market terminology, or product listings only.

| Source ID | Source and evidence | Limits |
|---|---|---|
| `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S01` | OQLF, [palourde japonaise (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199083/palourde-japonaise). Preferred Québec edible-mollusc name; English `Manila clam`; linked taxon *Tapes philippinarum*; says other contextual names were not retained. | Last updated 2012. The Latin name is noted as falling out of use. It is not current product availability or a substitute for Canadian label rows. |
| Reused `WP04-CLAM-QUEBEC-BOUNDARY-20261012-S01` | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), rechecked for `Manila Clam` and `Palourde Japonaise`; the [overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) explains that the list pairs acceptable Canadian English/French label names with scientific names and TSNs. | Fish List data marked modified 2023-09-18. It establishes naming collision, not equivalence, consumer availability, or cooking behavior. This source ID is reused from the 2026-10-12 clam review, not reassigned. |
| Reused `WP04-MOLLUSKS-20261009-S14` | DFO, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm). Distinguishes Manila clam (*Venerupis philippinarum*) from littleneck clam (*Protothaca staminea*) and other harvested species. | General Canadian bivalve identification, not a recipe or transferable measure. Already registered in the ledger. |
| `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S02` | DFO, [Manila Clam species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/manila-clam-palourde-japonaise-eng.html), modified 2026-06-11. Identifies *Ruditapes philippinarum*, BC distribution and fishery, and live restaurant-market context. | Biological and fishery profile; its U.S. restaurant-market observation is not Canadian retail or Québec availability. Shell size is not an ingredient measure. |
| `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S03` | NCBI Taxonomy, [*Ruditapes philippinarum*](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=129788). Current accepted name and homotypic synonyms *Venerupis philippinarum* and *Tapes philippinarum*. | Taxonomy source; not Canadian food-label authority. |
| `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S04` | DFO, [Pacific Region shellfish aquaculture licence under the Fisheries Act 2025](https://www.pac.dfo-mpo.gc.ca/aquaculture/licence-permis/docs/licence-cond-permis-shell-coq/index-eng.html). Lists Manila clam (*Venerupis philippinarum*) among licensed bivalve species. | Regulatory/aquaculture scope in the Pacific Region; not evidence of a particular product, Québec production, or sales volume. |
| `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S05` | Cooper’s Cove, [Manila Clams – 1 LB](https://cooperscove.ca/shop/manila-clams). Current Canadian Sooke, BC product page lists fresh category and 1/3/5 lb variants. | Retailer-specific package options; page gives no binomial, count, live/shucked state, or usable-meat basis. |
| `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S06` | Capillas Enterprise, [Manila Clams](https://www.capillasenterprise.com/products/clams). Current supplier page says its three-size products come from Canadian Pacific coast producers. | Supplier listing without a product binomial, consumer package, or kitchen measure. |
| `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S07` | Metro Québec, [Palourdes fish-counter guide](https://www.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/palourdes). Uses `palourde de Manille` in current Québec-facing retail guidance and discusses a whole/frozen export product. | Not a current species-labeled SKU; no binomial, amount, or standardized-name decision. The OQLF display remains `palourde japonaise`. |
| `WP04-SECTIONP-MANILA-CLAM-BOUNDARY-20261013-R12-S08` | Fish Bone + Elefanté, Montréal, [Uber Eats menu](https://www.ubereats.com/ca/store/fish-bone-%2B-elefante/iPYh1dtpSSKDtwwdOxVqpg). A current menu lists `Palourdes de Manille` in spaghetti alle vongole. | Restaurant-menu evidence only. It does not identify the taxon or disclose species-specific product, amount, or source. The prior Joséphine menu was excluded after Uber Eats marked the venue closed/unavailable since 2026-05-14. |

## Recommendation and revisit condition

Keep the species name and candidate evidence source-bounded, but do not activate `ingredient-ref-manila-clam`, its aliases, forms, measurements, recipe link, or substitutions. Keep `ingredient-ref-clam` unchanged. Revisit only if Canadian label evidence separates the CFIA common-name assignments, the picker can preserve multiple species for broad `clam / palourde` queries, or a recipe/product requirement supplies an unambiguous taxon. A later identity-only row would still require its alias set to be checked separately; source synonyms do not automatically become global search aliases.

Static review checks: exact active/form/legacy ownership, ledger and archive ID collisions, live name-source review, hypothetical picker projection using the repository search rules, and all 114 manifest recipes / 1,123 ingredient rows. The proposal is UTF-8 text. No catalog JSON or application files changed; no tests or emulator checks were run.

## Root integration result

Integrated by root on 2026-10-13 as a documentation-only hold under the open Section P shellfish checklist. Manila clam remains outside the active picker, and the generic `ingredient-ref-clam` ledger candidate remains unchanged. No catalog or ledger row, alias, form, recipe link, measurement, or substitution was added. Section P remains open. No app or emulator tests were run because this hold only updates documentation.

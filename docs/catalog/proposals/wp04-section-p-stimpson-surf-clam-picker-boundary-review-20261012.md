# WP04 Section P — Stimpson’s surf clam picker boundary review

- **Review date:** 2026-10-12
- **Packet type:** Proposal-only species/name boundary review under the open Section P shellfish item.
- **Candidate:** *Mactromeris polynyma*, Québec-preferred **mactre de Stimpson**; CFIA-listed English **Stimpson Surf Clam**.
- **Recommendation:** **Hold the species row out of the shared picker for now.** The evidence supports a distinct commercial species and Québec product, but the current phrase-first picker would make this row the only result for broad `clam`, `surf clam`, and `mactre` searches. No recipe requests the species or any clam product.
- **Data outcome:** No catalog, forms, legacy identities, ledger, recipes, generated files, or code changed. This proposal adds no candidate record or source to the ledger. No app, unit, instrumentation, or emulator tests were run.

## Open checklist item and archive boundary

The exact open checklist parent is **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.”** Its generic clam child was reviewed separately and checked as a hold: [`docs/catalog/batches/wp04-section-p-clam-hold-integration-20261012/README.md`](../batches/wp04-section-p-clam-hold-integration-20261012/README.md). This packet reviews only the species-specific *Mactromeris polynyma* boundary. It does not reopen or replace the `ingredient-ref-clam` decision.

The proposal/archive scan found no dedicated Stimpson surf-clam proposal, batch, active reference, or held species candidate. The [generic clam review](wp04-section-p-clam-quebec-market-boundary-review-20261012.md) mentions a Montréal collection that included canned Stimpson’s clams, but did not resolve this species or its Québec display. The separate [whelk review](wp04-whelk-species-product-boundary-review-20261011.md) names **Stimpson’s Whelk** (*Colus stimpsoni*), an unrelated gastropod; the shared epithet does not make it a duplicate. Other crab, crayfish, and finfish packets are outside this mollusc review.

The species is a real and distinct possible future catalog identity. Its status here is a picker hold, not a claim that Québec lacks the product. The broader shellfish checklist remains open.

## Current ownership and picker projection

The exact-owner audit mirrors `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, fold ligatures and selected symbols, remove combining marks, replace punctuation with spaces, and collapse whitespace.

| Key or name | Active reference | Form | Legacy candidate | Ledger | Finding |
|---|---|---|---|---|---|
| `ingredient-ref-stimpson-surf-clam` / `candidate-stimpson-surf-clam` | None | None | None | None | Both prospective IDs are unused; no identity is allocated here. |
| *Mactromeris polynyma*; `Stimpson Surf Clam`; `Stimpson’s surf clam`; `mactre de Stimpson`; `mactre arctique`; `surf clam`; `mactre` | No exact normalized owner | No exact owner | No exact owner | No exact name/ID owner | No current ingredient/form owns these terms. |
| `ingredient-ref-clam` | None | None | None | Existing candidate, `identityState: needs_clarification` | Preserve the generic clam hold and its existing three source records. |

There are **1,325 active references, 98 forms, 64 legacy candidates, and 1,633 ledger records** in this snapshot. The ledger has 6,041 source entries / 5,057 distinct source IDs and 8 unit conversions. Both bundled substitution-rule files contain zero rules, and neither has Stimpson- or clam-related text.

The projection follows the current picker’s complete-word phrase matching, before its substring fallback. If a row displayed `Stimpson surf clam / mactre de Stimpson`, then queries `clam`, `surf clam`, and `mactre` would each match the display itself, even with no aliases. CFIA lists **Surf Clam / Mactre** for *Mactromeris polynyma* and also **Surf Clam / Mactre solide** for *Spisula solidissima*; its *M. polynyma* entries additionally include **Arctic Surf Clam / Mactre arctique** and **Stimpson Surf Clam / Mactre de Stimpson**. The species-qualified pair is clear, but broad `clam` and `surf clam` are not exclusive to it in Canadian fish naming. With generic clam still unresolved, the new row would misleadingly present one species as the sole result for broad queries. The French preferred display itself contains the broader searchable word `mactre`.

## Québec and Canadian naming / market evidence

| Source ID | Source and result | Scope limit |
|---|---|---|
| **WP04-SECTIONP-STIMPSON-CLAM-20261012-S01** | OQLF GDT, [mactre de Stimpson](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199089/mactre-de-stimpson). OQLF marks **mactre de Stimpson** as the normalized preferred term for an edible mollusc species with commercial potential in Québec. Its English terms include `Stimpson’s clam` and `Stimpson’s surf clam`; it says `palourde de Stimpson` was not retained for Québec fish-product marketing to avoid label confusion. It lists *Mactromeris polynyma* and notes that the older *Spisula polynyma* name appears to be falling into disuse. | The entry was last updated in 2012. Use the modern DFO/CFIA taxon *Mactromeris polynyma*; do not turn contextual `palourde de Stimpson` or the older taxon spelling into aliases. |
| **WP04-SECTIONP-STIMPSON-CLAM-20261012-S02** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSNs 80983 and 80944. For *M. polynyma*, the list includes `Stimpson Surf Clam / Mactre de Stimpson`, `Arctic Surf Clam / Mactre arctique`, and the broader `Surf Clam / Mactre`. It separately lists *Spisula solidissima* with `Clam / Mactre d’Amérique` and `Surf Clam / Mactre solide`. | Fish List common names are Canadian fish-label guidance (list last modified 2023-09-18), not proof that every listed product is sold in Québec. The overlapping broad English/French names cannot be treated as species-specific aliases. |
| **WP04-SECTIONP-STIMPSON-CLAM-20261012-S03** | Fisheries and Oceans Canada, [Mactre de Stimpson (*Mactromeris polynyma*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-surf-clam-mactre-stimpson-fra.html). Confirms current taxon and Québec coastal commercial fishery, managed across ten zones (eight Côte-Nord and two Îles-de-la-Madeleine); first Québec landings were recorded in 1993. | Species identification and fishery context do not establish a recipe use, consumer portion, edible yield, or substitute. |
| **WP04-SECTIONP-STIMPSON-CLAM-20261012-S04** | Gouvernement du Québec, [Transformation des produits marins](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/transformation-produits-marins), updated 2026-06-16. It identifies Stimpson’s mactre among Québec molluscs, notes prepared flesh is sold refrigerated or frozen, and mentions chowder and increasing sale in brine; the foot is sought by Asian markets. | Current sector overview, not a consumer-label standard or package-measure conversion. |
| **WP04-SECTIONP-STIMPSON-CLAM-20261012-S05** | Montréal retailer Poissonnerie La Mer, [canned Stimpson’s mactre mantle](https://www.lamer.ca/products/mactres-de-stimpson-en-conserve-142-gr). The current page describes Côte-Nord product, cooked mantle meat in light brine, ready to use, in 142 g and 600 g packages. | A specific retailer’s current stock and package sizes can change; package weights are not recipe equivalents or standard servings. |
| **WP04-SECTIONP-STIMPSON-CLAM-20261012-S06** | MAPAQ, [Les mollusques du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf). The government factsheet pairs *Mactromeris polynyma* with `Stimpson’s surfclam`, describes foot and mantle as edible parts marketed separately, and documents historical commercial frozen/canned packages. It reports approximately 9–12 cm and 150 g for harvested clams. | The factsheet’s publication date is not clear. Its package examples are bulk/commercial formats. The animal’s whole size/weight is not edible meat yield, and its 100 g cooked-meat nutrition panel is not a recipe measure. |
| **WP04-SECTIONP-STIMPSON-CLAM-20261012-S07** | DFO, [Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm). Lists *M. polynyma* as mactre de Stimpson and Atlantic surf clam (*Spisula solidissima*) as mactre de l’Atlantique, also known as mactre d’Amérique. | Useful official species comparison; not a source for culinary conversion or interchangeability. |

The evidence supports keeping the species and the Québec product distinct from generic clam, Atlantic surf clam, fresh oyster, cockle, and other shellfish identities. It supports a future bilingual species display if the picker can preserve that distinction; it does **not** support broad aliases `clam`, `surf clam`, `mactre`, or `palourde`.

## Bundled recipe demand

The audit followed every path in the current `manifest.v1.json`, parsed all 114 recipe files and their 1,123 `ingredients[]` rows, and scanned the complete recipe JSON text. There are **zero matching ingredient rows and zero matching recipe files** for *Mactromeris polynyma*, Stimpson’s clam/surf clam, mactre, palourde, or clam wording. The corpus therefore supports no ingredient link, amount, form, preparation, conversion, or substitution for this species.

## Forms, measurements, and substitutions

- Québec product evidence distinguishes foot and mantle, and chilled/frozen, cooked, canned-in-brine, and chowder products. These are commercially real states, not enough to define shared culinary forms or a conversion chain.
- The current Montréal listing’s 142 g and 600 g sizes and the older MAPAQ bulk formats describe packages. The whole harvested clam’s approximate 150 g weight includes shell and cannot be used as a meat amount; the factsheet’s cooked 100 g nutrition basis is not a suggested recipe serving.
- No density, unit mapping, drained-weight yield, cooking yield, shell-to-meat yield, or unit conversion is supported. Add none.
- No recipe or source gives a controlled replacement quantity or culinary rule. A flavor comparison to lobster/scallop is not a substitution rule. Add no global or contextual substitution.

## Review snapshot and reproducibility

Snapshot read from the shared worktree on **2026-10-12**. File hashes cover exact bytes. Recipe digest hashes sorted recipe basenames, NUL, exact file bytes, NUL.

| File / corpus | Current count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,325 references | `cf9aa167cb0f144f8a066a0e60b6ba3eb75bd39336747d075471ba2938973a42` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,633 records / 6,041 source entries / 5,057 source IDs | `d75e13648aa59375da93d0e0b0a331d0e4d5f45a22f473e9b163a686c74a0d73` |
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest recipe corpus | 114 files / 1,123 ingredient rows / 753,792 bytes | `16688e6f2ebb97eb590cb27fb711af7a025872be7a837d56846765c2e3e1ebe6` |

The proposal path [`wp04-section-p-stimpson-surf-clam-picker-boundary-review-20261012.md`](wp04-section-p-stimpson-surf-clam-picker-boundary-review-20261012.md) was confirmed unused before writing. Before this packet was written, the source prefix `WP04-SECTIONP-STIMPSON-CLAM-20261012` was absent from existing catalog proposals/batches and the research ledger; its seven source IDs now occur only in this proposal and were not added to the ledger. The prospective reference and candidate IDs were also confirmed unallocated.

Scoped checks after writing: UTF-8 decodes without a BOM; the file ends with one newline; no trailing whitespace; all cited local relative paths exist; and the seven source IDs are unique within this proposal. No app or test suite was run.

# WP02 A6 follow-up: brown-top millet flour naming hold

## Review record

- **Reviewed and sources accessed:** 2026-10-12.
- **Status:** Reviewed and reconciled as a hold. Brown-top millet flour remains an unallocated A6 candidate; no canonical package or ledger data changed. See [the integration record](../batches/wp02-a6-brown-top-millet-flour-hold-integration-20261012/README.md).
- **Scope:** Decide whether single-grain brown-top millet flour is a separate candidate under the open A6 regional-grain-flour review. The 2026-10-10 WP03 brown-top packet explicitly scoped its grain review away from flour; the later WP02 millet-flour proposal reviewed kodo, proso, foxtail, and little millet flour, but not brown-top flour.
- **Proposal-local source IDs:** `WP02-A6-BROWNTOP-FLOUR-20261012-S01` through `S06`. These are not ledger entries.
- **A6 status:** Keep the broad checklist open. This decision does not close A6 or reopen the already covered generic millet, fonio, Job's tears, quinoa, amaranth, kodo, proso, or foxtail flour rows.

## Recommendation

**Hold brown-top millet flour as an unallocated A6 candidate until a Québec French display is established.** Do not create `ingredient-ref-brown-top-millet-flour`, add the English phrase as an alias to generic `ingredient-ref-millet-flour`, or assign a French display or aliases in this pass.

The flour product itself is source-attested: current manufacturer pages name brown-top millet flour, and one identifies its grain as *Urochloa ramosa* (also called *Brachiaria ramosa*) [S02–S03]. The naming gate remains open. OQLF treats *millet* as a generic grouping of species and has no brown-top entry [S04]. The tempting French phrase `farine de millet brun` appears on a current French retail product whose ingredient is *Panicum miliaceum*, so it cannot safely name *U. ramosa* flour in this bilingual catalog [S05]. The earlier brown-top grain review also found no Québec validation for its competing French candidates [WP03-BTM-20261010]. A Québec flour label or independent Québec terminology review is needed before allocating a bilingual row.

| Candidate or phrase | Disposition | Boundary |
|---|---|---|
| `brown top millet flour` / `brown-top millet flour` / `browntop millet flour` | **Hold as an A6 candidate.** | Product pages establish named flour products. They do not supply a Québec French name or a common processing specification. [S02–S03] |
| `ingredient-ref-brown-top-millet-flour` | Do not allocate yet. | Keep it as a proposed future key only; no active reference or flour ledger record exists. |
| `farine de millet brun` | Do not use as the French display or alias for brown-top flour. | The current French product page uses this wording for *Panicum miliaceum*, while the candidate grain is *Urochloa ramosa*. This is a species collision in source usage, not an active RecipeBook key collision. [S05] |
| `farine de millet à tête brune` | Keep inactive. | The prior grain packet documented this phrase only in an international crop list, not as Québec food or flour wording. [WP03-BTM-20261010] |
| `activated brown top millet flour` | Keep as source-specific product wording. | One maker describes an overnight-soaked, dried, cold-milled flour. Do not infer that all brown-top millet flour is activated or create a process state from that page. [S02] |
| `millet flour / farine de millet` | Retain unchanged. | The current generic millet-flour identity remains separate; do not broaden it with the unallocated brown-top name. |

## Evidence and Québec/Canadian wording

The Food Safety and Standards Authority of India's current cereal standard identifies brown top (Korale) as *Urochloa ramosa* within its whole/dehulled-millet scope [S01]. Its flour provision is for **mixed millet flour**, defined as flour milled from a blend of millets or blended from separate millet flours; it is not a single-grain brown-top flour specification [S01]. This regulatory evidence anchors the source grain but does not define a Canadian flour name or a transferable flour process.

Two current manufacturer pages list brown-top millet flour. Dhatu Organics names *U. ramosa* and describes one activated product made by soaking grain before milling [S02]. B&B Organics titles a product `Healthy Brown Top Millet Flour` and gives regional product wording, but does not state a botanical name [S03]. These sources support the existence of the product class and the source-specific wording only. Their process details, product claims, package sizes, nutrition values, and recipe suggestions are not adopted.

For local terminology, a flour maker in Ontario lists brown-top millet as one component of a locally milled 18-plus-grain flour blend [S06]. That is evidence of current Canadian English ingredient wording in a blend; it is not evidence for a standalone brown-top flour product or its French label. OQLF's entry gives *millet*, *mil*, and *petit mil* as preferred terms and explains that *millet* groups multiple species [S04]. It does not name brown-top millet. The only directly relevant French flour product found for `millet brun` identifies *Panicum miliaceum* as its ingredient [S05]. Do not translate `brown top` mechanically or reuse `farine de millet brun` for *U. ramosa*.

## Live catalog, ledger, and recipe audit

Snapshot read from the shared working tree on 2026-10-12. File hashes cover exact bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, its exact file bytes, and a trailing NUL byte.

| Surface | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,217 rows | `ddae6e2ca49e677e775946d8e4860d8b34e045a9993feb0f850f88767202d9ac` |
| Ingredient forms | 86 rows | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import candidates | 66 rows | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,520 records; 5,133 source entries; 4,196 distinct source IDs; 8 unit conversions | `7e5c4d725908208bbd1814c1645fd7ba2f2f8ad95d939ae66a0d8f98af65cca4` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated `BundledIngredientCatalog.kt` | 1 file; 1,217 reference entries | `457ffd0ca375a04256b2a406a262cf9ceca6b3dec5d18416216aae57243e78a9` |

The active catalog has a generic `ingredient-ref-millet-flour` row, but no brown-top grain or flour reference. The ledger contains the existing grain candidate `candidate-brown-top-millet` with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`; it has seven sources. There is no brown-top flour ledger record. The proposed flour ID and exact normalized keys below have no owner across active reference names/aliases, form labels/match terms, legacy names/aliases, or ledger record IDs:

- `ingredient-ref-brown-top-millet-flour`
- `brown top millet flour`, `brown-top millet flour`, `browntop millet flour`, `activated brown top millet flour`
- `farine de millet brun`, `farine de millet à tête brune`, `farine de millet brown top`
- `Urochloa ramosa flour`, `Brachiaria ramosa flour`, `Korale flour`, `Andu Korralu flour`

The exact-key audit uses the project search-key normalization: case and accents are folded, punctuation is converted to spaces, and whitespace is collapsed. The no-owner result does not turn the generic active `millet flour` row into a species-qualified identity.

All **114 manifest-listed recipes** and **1,123 ingredient rows** were searched across parsed recipe text for the proposed ID, English product-name variants, French wording candidates, botanical names, and regional flour terms listed above. Result: **zero recipe-file hits and zero ingredient-row hits**. No recipe link or recipe edit is proposed.

## Integration boundary

Keep the candidate unallocated until a Québec French name for the *U. ramosa* flour product is supported. If a later review clears that gate, recheck package ownership and recipes, then consider a separate `FLOUR_AND_STARCH` identity with only names supported by that review. This proposal adds no aliases, forms, density, unit mappings, measurements, conversions, cooking or package yields, substitutions, or recipe links. No source-specific amounts, ratios, nutrition values, process claims, or recipe suggestions are promoted to numeric or runtime behavior. No tests or emulator checks were run because this review resulted in documentation of a hold and changed no database data.

## Source register

All web pages below were checked on 2026-10-12. Source IDs are unique to this proposal and are not ledger entries.

| ID | Source and evidence | Limit |
|---|---|---|
| **WP02-A6-BROWNTOP-FLOUR-20261012-S01** | Food Safety and Standards Authority of India, [Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), version 4 dated 2025-05-07, §2.4.6 and §2.4.38. Lists `Brown top (Korale) — Urochloa ramosa` under whole/dehulled millet and separately defines mixed millet flour. | Primary Indian food standard. It does not set a single-grain brown-top flour name or Québec/Canadian wording. No quality limits are used as recipe measures. |
| **WP02-A6-BROWNTOP-FLOUR-20261012-S02** | Dhatu Organics, [Activated Brown Top Millet Flour 500g](https://www.dhatuorganics.com/products/activated-brown-top-millet-flour-500g). Names *Brachiaria ramosa*, reclassified as *Urochloa ramosa*, and describes a maker-specific soaked, dried, cold-milled product. | Manufacturer page; its variant currently displays as unavailable. It supports the named flour product and its own process description, not universal activation, recipe behavior, or a Canadian label. |
| **WP02-A6-BROWNTOP-FLOUR-20261012-S03** | B&B Organics, [Healthy Brown Top Millet Flour](https://bnborganics.com/products/brown-top-millet-flour). Names `Brown Top Millet Flour` and the product wording `Hari Kangni Atta, Korale Hittu`. | Manufacturer product listing; no botanical species or Québec French label is given. Regional names are not proposed as global aliases. |
| **WP02-A6-BROWNTOP-FLOUR-20261012-S04** | Office québécois de la langue française, [millet, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), updated 2010. Lists `millet`, `mil`, and `petit mil`; states that `millet` is a generic grouping of species. | Québec terminology authority; the entry does not identify brown-top millet or its flour. |
| **WP02-A6-BROWNTOP-FLOUR-20261012-S05** | Naturalia, [Farine de millet brun 500 g bio](https://www.naturalia.fr/produit/farine-millet-brun-500g). The ingredient declaration identifies `farine de millet brun` as *Panicum miliaceum*. | Current French retail wording outside Québec. Used only to show why `millet brun` is ambiguous; not used as Québec terminology. |
| **WP02-A6-BROWNTOP-FLOUR-20261012-S06** | Desi Chakki, Ontario, [Our Products](https://desichakki.com/products). Lists a locally milled 18-plus-grain flour blend whose ingredient list includes `Brown Top Millet`. | Canadian bilingual-market context is limited to English wording in a multigrain blend; it does not establish a standalone flour product or French display. |

## Disposition

Keep **brown-top millet flour** on hold as one open A6 candidate. The sources establish that the flour product exists and identify at least one maker's source grain, but they do not establish an unambiguous Québec French name. Do not change the catalog, ledger, or recipes. The A6 checklist now records this reviewed hold; broader A6 work remains open.

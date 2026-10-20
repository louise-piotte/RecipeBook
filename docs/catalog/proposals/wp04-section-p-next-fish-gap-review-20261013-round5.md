# WP04 Section P — blue crab / crabe bleu identity review

- **Review date:** 2026-10-13.
- **Status:** Integrated on 2026-10-13; see the integration record at the end of this proposal.
- **Packet type:** Species identity species identity, Canadian/Québec naming, picker, product-boundary, and recipe-demand review.
- **Recommendation:** Add one identity-only `PROTEIN` reference for *Callinectes sapidus*, displayed as **blue crab / crabe bleu**, with empty alias arrays, null density, and empty unit mappings. OQLF directly pairs the preferred Québec food-fish term with English `blue crab` and the species; CFIA lists both common names against the same taxonomic serial number and separately lists blue swimming crab / étrille bleue for *Portunus pelagicus*. The shared picker would add an explicit crab choice while retaining the generic crab-meat and Dungeness results. Do not attach the current Québec frozen-crab SKU to the species: its listing does not expose a scientific name. Add no form, active measure, density, unit mapping, conversion, package yield, recipe link, or substitution.
- **Exact proposed fields:** `ingredient-ref-blue-crab`, category `PROTEIN`, English `blue crab`, French `crabe bleu`, empty `aliasesEn` and `aliasesFr`, `defaultDensity: null`, and `unitMappings: []`; scope the evidence to *Callinectes sapidus*.

```json
{
  "id": "ingredient-ref-blue-crab",
  "nameFr": "crabe bleu",
  "nameEn": "blue crab",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

## Scope and prior-work boundary

The active Section P checklist remains open for fish, shellfish, seafood products, and regional proteins. The latest dedicated crab checkpoints cover generic crab meat, Dungeness crab, snow crab, red king crab, and the golden-king species picker hold. The golden-king hold is integrated. This packet reviews only the unallocated blue-crab identity for *C. sapidus*, its distinction from blue swimming crab, and the picker effects of the exact bilingual display. It does not revisit any existing crab decision or assign a species to recipe 019.

The current plan and proposal/batch archive were reread, then searched for `blue crab`, `crabe bleu`, *Callinectes sapidus*, `blue swimming crab`, *Portunus pelagicus*, and `étrille bleue`. There is no focused earlier proposal, hold, integration, or ledger candidate for either blue-crab identity. The exact matches in the current package are the existing generic crab-meat identity/form and the Dungeness identity described below; neither assigns the blue-crab species. The candidate and source IDs in this packet were checked before drafting against the live catalog, legacy candidates, ledger, proposals, and batches.

## Canadian and Québec naming and taxonomic boundary

OQLF’s GDT entry for edible crustaceans gives **crabe bleu** as the preferred normalized Québec term, **blue crab** as its English equivalent, and *Callinectes sapidus* as the Latin name. It also describes the species as having commercial potential in Québec. The entry was last updated in 1998, so it supports the terminology and scoped name, not current local catch or inventory. DFO’s 2025 eastern-Canada crab identification guide independently labels the species `Crabe bleu / Callinectes sapidus`; it categorizes the animal among species to watch and maps known observations. That is occurrence and identification evidence, not evidence of an established Québec fishery.

CFIA’s current Fish List crab query returns two name rows for taxonomic serial number 98696, both *C. sapidus*: `Crab / Crabe Bleu` and `Blue Crab / Crabe`. The list does not place `Blue Crab` and `Crabe Bleu` together in one row. OQLF supplies that direct bilingual pairing. The CFIA result also assigns bare `Crab / Crabe` across many taxa, so those broad names are not species aliases. The CFIA Fish List guidance explains that it collects Canadian English and French fish names tied to scientific taxa; this review uses the list for that Canadian naming boundary, not as product or recipe evidence.

The neighboring **blue swimming crab / étrille bleue** is *Portunus pelagicus*, a different CFIA taxon. A Canadian seller page for *C. sapidus* also says “Swimming Crab,” but that seller wording is not promoted as a synonym: the CFIA Fish List distinguishes `Blue Swimming Crab` / `étrille bleue` for *P. pelagicus*. Omit `swimming crab`, `blue swimming crab`, `crabe nageur`, Latin names, and other adjacent trade names from the proposed aliases. Do not treat a generic retailer phrase as a taxonomic assignment.

Current Québec retail evidence shows a Super C / Metro product listing for Geparco **Crabes bleu surgelés**, product 628235530231, 454 g. The listing exposes the product name, brand, package amount, and frozen category, but no Latin name or ingredient detail. Direct retailer retrieval returned 403 during this review, and the linked image could not be inspected; the package label’s taxon therefore remains unverified. This is evidence that the French market phrase and a frozen SKU are currently listed, not evidence to attach this SKU or its mass to *C. sapidus*.

Two Canadian supplier pages add product context. Seafood Depot, in Vaughan, Ontario, lists `Blue Crab / Callinectes sapidus`, describes its offered meat as pasteurized, says live product is available by special order, and identifies the products as from the U.S.A. and Vietnam. SeaCore Seafood lists a `Real Calli Crab Cakes` product as *C. sapidus*, made in Canada from domestic and imported ingredients, in bulk and retail formats. These are supplier-specific product claims; the crab cake is a composite product and does not establish a raw-crab form, universal preparation state, recipe substitution, or Canadian harvest.

## Exact ownership and source-ID audit

Exact ownership was checked using the active bilingual displays and aliases, attached form labels and match terms, legacy candidate IDs/names/aliases, and ledger record IDs. Normalization follows `normalizeIngredientSearchKey`: lowercase, NFKD compatibility decomposition, accent/ligature folding, non-alphanumeric-to-space normalization, and whitespace folding.

| Candidate key | Exact current owner | Boundary |
|---|---|---|
| `ingredient-ref-blue-crab`; `candidate-blue-crab` | None in active references, forms, legacy candidates, or ledger record IDs. | The proposed ID is not allocated. |
| `blue crab`; `crabe bleu`; *Callinectes sapidus* | No exact active reference, form label/match term, or legacy candidate owner; no ledger record allocates this candidate. | These remain available for one species-scoped display and its taxonomic evidence; Latin is not a search alias. |
| `blue swimming crab`; `étrille bleue`; *Portunus pelagicus* | No active reference/form/legacy owner or focused candidate record. | CFIA names a separate species. Keep these terms out of the *C. sapidus* row; they may require a future distinct review if recipe or product demand warrants it. |
| `crab meat`; `chair de crabe` | Active `ingredient-ref-crab`, category `PROTEIN`, with no aliases. | Species-unspecified edible meat; not a blue-crab species assignment. |
| `jumbo lump crab meat`; `chair de crabe en gros morceaux (jumbo lump)` | Active `ingredient-form-crab-jumbo-lump` attached to `ingredient-ref-crab`. | A commercial meat grade, not a crab species or form of *C. sapidus*. |
| `Dungeness crab`; `crabe dormeur`; `crabe Dungeness`; `crabe de Dungeness` | Active `ingredient-ref-dungeness-crab`, category `PROTEIN`, with the latter two French aliases. | Separate species identity *Metacarcinus magister*. |
| Bare `crab` / `crabe` | No exact bare-key owner. Search currently returns the generic crab-meat row and Dungeness crab. | Broad category queries remain multi-choice after the proposed addition; no bare alias is added. |

The proposal-local source-ID prefix used below was absent from the current ledger and proposal/batch archive before drafting. The eight source IDs are distinct within this packet. No source IDs or candidate record are proposed for ledger insertion as part of this proposal-only review.

## Picker projection, including current forms

The projection follows the current bilingual reference/form search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): an exact form-term match is handled first, then complete normalized word phrases across reference displays, aliases, and attached form terms take priority over partial matching. The hypothetical row contains only the two display names, so no alternate trade names are introduced.

| Query | Current results and forms | With proposed row | Implication |
|---|---|---|---|
| `blue crab` | None | `blue crab / crabe bleu` | Exact English identity query. |
| `crabe bleu` | None | `blue crab / crabe bleu` | OQLF-preferred Québec French query. |
| `crab` | `crab meat / chair de crabe`; `Dungeness crab / crabe dormeur` | The same two rows plus `blue crab / crabe bleu` | Broad English search remains multiple-choice; existing results are not suppressed. |
| `crabe` | `crab meat / chair de crabe`; `Dungeness crab / crabe dormeur` | The same two rows plus `blue crab / crabe bleu` | Broad French search remains multiple-choice; existing results are not suppressed. |
| `crab meat` | `crab meat / chair de crabe`; the attached `jumbo lump crab meat` form remains a separate exact form query | Same result | The species display has no `meat` term, so it does not take ownership of the meat product query. |
| `jumbo lump crab meat` | `crab meat / chair de crabe`, with `ingredient-form-crab-jumbo-lump` | Same result and form | The existing recipe-grade form remains on the generic crab-meat identity. |
| `blue crab meat` | None | None | Do not imply that a species name establishes a picked-meat product or form. |
| `crabes bleu surgelés` | None | None | The retailer’s plural, product-state phrase does not match the singular identity display; do not link the SKU. |
| `blue swimming crab`; `étrille bleue` | None | None | Separate *P. pelagicus* terms stay unowned by this candidate. |
| *Callinectes sapidus* | None | None | Scientific names are evidence only, not catalog aliases. |

The practical search effect is explicit: exact species-qualified searches will resolve to the proposed row; generic crab searches will offer that row alongside the existing generic meat and Dungeness choices. The query `blue crab` does not match the CFIA name `blue swimming crab` as a complete phrase, and the candidate will not carry the ambiguous `swimming crab` alias. The current Québec SKU phrase is not silently converted to the species row.

## Recipe demand

The full scan covered every **114** path in the live `manifest.v1.json` and all **1,123** ingredient rows. Complete UTF-8 recipe JSON text and each ingredient row’s name, original text, reference/form IDs, and other string fields were checked for `blue crab`, `blue crabs`, `crabe bleu`, `crabes bleu`, `crabes bleus`, `Callinectes sapidus`, `blue swimming crab`, `blue swimmer crab`, *Portunus pelagicus*, `étrille bleue`, and related blue-crab wording.

**Result: zero matching recipe files and zero matching ingredient rows.** The broader crab scan finds recipe **019#8**, `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. It does not identify a crab species or support relinking to *C. sapidus*. No recipe link or substitution is proposed.

## Product states, numeric evidence, and substitutions

Evidence dimensions remain separate:

- **Identity:** OQLF and CFIA name *C. sapidus*; the DFO guide independently uses `Crabe bleu / Callinectes sapidus`. Recommend one identity-only row with no aliases.
- **Product state:** Super C / Metro’s SKU is titled as a frozen blue-crab product, but the listed record does not establish whether it is whole, raw, cooked, or a particular taxon. Seafood Depot’s pasteurized meat and live special-order items and SeaCore’s crab cakes are distinct supplier-specific products. Do not add a frozen, live, whole, cooked, pasteurized, picked-meat, or cake form.
- **Measurements:** Super C / Metro’s **454 g** is the package amount for product 628235530231 only; the listing does not confirm the species, portion basis, drained/net edible mass, or serving count. Do not attach it as a *C. sapidus* observation. Seafood Depot provides no package mass; SeaCore gives no weight. The DFO guide’s approximate body-length illustration is biological identification, not a kitchen quantity. Add no measure, density, unit mapping, conversion, count mapping, or yield.
- **Substitutions:** Neither the Canadian product pages nor the bundled corpus establish a directed, context-specific replacement between blue crab, blue swimming crab, Dungeness crab, generic crab meat, or Jumbo Lump crab meat. The crab-cake SKU is not a substitution ratio or a recipe-line link. Add no global or contextual rule.

## Sources

Sources were reviewed on 2026-10-13. IDs are proposal-local and are not ledger additions.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S01` | Office québécois de la langue française, [GDT: crabe bleu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198912/crabe-bleu) | In edible-crustacean terminology, gives preferred `crabe bleu`, English `blue crab`, and *Callinectes sapidus*. Last updated 1998; the “commercial potential” note is historical terminology context, not current market supply. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S02` | CFIA, [Fish List crab query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) | TSN 98696 is *C. sapidus* and has separate `Crab / Crabe Bleu` and `Blue Crab / Crabe` rows. Other taxa also carry bare `Crab / Crabe`. The query page reports the list modified 2023-09-18; names and taxon scope, not product contents or recipes. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S03` | CFIA, [Fish List blue query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue) | Lists *Portunus pelagicus* separately as `Blue Swimming Crab / étrille bleue`; this is a neighboring taxon, not an alias for *C. sapidus*. The query page is a naming/taxon source only. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S04` | CFIA, [CFIA Fish List scope and purpose](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the list contains Canadian-acceptable English/French fish common names, scientific names, and taxonomic serial numbers. It defines label-name scope, not retail availability or culinary equivalence. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S05` | Fisheries and Oceans Canada, [Guide d’identification des crabes de l’est du Canada, 2025](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-12-2025-fra.pdf) | Page 14 labels `Crabe bleu / Callinectes sapidus`, maps known observations and watch areas, and marks it as a species to watch. The observation map does not establish a Québec fishery, product supply, edible yield, or cooking method. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S06` | Super C, [Geparco Crabes bleu surgelés, product 628235530231](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/crabes-bleu-surgeles/p/628235530231) | Current indexed Québec retailer listing: French product title and 454 g package. It supplies no Latin name or product description; direct retrieval returned 403 and the linked package image could not be inspected. The package species is unverified; 454 g applies only to this SKU. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S07` | Seafood Depot (Vaughan, Ontario), [Blue Crab](https://www.seafooddepot.ca/product-bluecrab2) | Supplier page identifies *C. sapidus*, a pasteurized-meat product, live special-order availability, and U.S.A./Vietnam origin. It gives no package mass. Its phrase “also known as Swimming Crab” is not used as an alias because CFIA distinguishes blue swimming crab / *P. pelagicus*. Supplier claims do not establish Canadian harvest or Québec retail availability. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S08` | SeaCore Seafood Products (Vaughan, Ontario), [Real Calli Crab Cakes](https://www.seacoreseafood.com/product/Crab_Cakes_Real_Calli) | Supplier page identifies *C. sapidus* in a crab-cake product made in Canada from domestic and imported ingredients and offered in bulk/retail formats. This is a composite product page, not a raw-crab package, exact formula, portion measure, recipe, or substitution source. |

## Baseline snapshot and verification

The baseline was recomputed from the shared worktree on 2026-10-13, after upstream catalog integrations visible in that worktree. File hashes cover exact bytes. The recipe corpus digest hashes each manifest-ordered UTF-8 relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Artifact | Current count / bytes | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,338 references / 428,802 bytes | `4c5ebe5497543acde7d6d6aca9e50bea928cee477c538ce795910589e90239e3` |
| `ingredient-forms.v1.json` | 98 forms / 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates / 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,646 records; 6,248 source entries; 5,251 distinct source IDs / 6,217,304 bytes | `ae3605b31fb48d69b6e41242fa7a8ee08b2f7c56e22f86a129fa3f6fd564026d` |
| `manifest.v1.json` | 114 recipe paths / 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `BundledIngredientCatalog.kt` | 586,698 bytes | `f7fab835ba4b02f301c4ad966b52c78553bab66ba7801528a290f4988131fbd9` |
| `package-yields.v1.json` | 1 record / 853 bytes | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| `substitution-rules.v1.json`; `contextual-substitution-rules.v1.json` | 0 rules / 3 bytes each | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |

Static review confirmed no exact active/form/legacy/ledger owner for the candidate, no prior focused review or integration, and no source-ID collision. The picker projection was calculated in memory from current bilingual displays, aliases, and attached forms using the existing phrase-first matching behavior; the 114-file / 1,123-row recipe scan found no candidate demand. UTF-8/no-BOM and scoped whitespace checks passed. The proposal was initially proposal-only; the subsequent integration is recorded below. No app tests or emulator checks were run.


## Integration record

Integrated on 2026-10-13. Added identity-only ingredient-ref-blue-crab for blue crab / crabe bleu (Callinectes sapidus), with empty aliases, null density, and empty unit mappings. Added the eight source records and one accepted identity decision to a new verified ledger record; measurement and substitution research remain not yet researched. Blue swimming crab / étrille bleue remains distinct, broad crab/crabe searches remain multiple-choice, and the unidentified 454 g retailer SKU is not attached. No form, measurement, recipe link, or substitution was added.

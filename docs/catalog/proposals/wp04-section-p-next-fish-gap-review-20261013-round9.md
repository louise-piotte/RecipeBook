# WP04 Section P — Pacific hake / merlu du Pacifique picker-boundary review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only species identity, Canadian and Québec naming, product scope, picker, ownership, recipe-demand, measurement, and substitution review.
- **Disposition:** **Hold** *Merluccius productus* outside the active picker. CFIA and DFO establish a distinct Pacific-hake identity and CFIA supplies the bilingual pair `Pacific Hake / Merlu du Pacifique`. However, putting `merlu du Pacifique` in the French display makes the current exact-phrase search return this single species for broad `merlu`, overriding its current fallback results for red and white hake. OQLF records `merlu` as a name for another *Merluccius* species and says it was not retained for Québec fish marketing because it can confuse consumers. The reviewed Québec sources do not establish a standalone species-named retail SKU. Do not add an active reference, alias, legacy candidate, ledger record, form, measure, recipe link, conversion, yield, or substitution.
- **Conditional reference shape if search can preserve the broad French query:** `ingredient-ref-pacific-hake`, category `PROTEIN`, English **Pacific hake**, French **merlu du Pacifique**, empty alias arrays, null density, and empty unit mappings. No form is proposed. This row is **not** proposed for activation now.

## Why this is a distinct open Section P gap

Section P remains open for fish identities. The archive search found only neighboring mentions of Pacific hake: the Pacific-tomcod boundary review names it as a distinct species; the silver-hake review lists *M. productus* as a comparison taxon; the lingcod review says lingcod is not a true cod and names Pacific hake as a neighbor; and the finfish sweep records a surimi product containing pollock and/or Pacific hake. None allocates *M. productus* to the catalog or reviews its picker behavior. No focused proposal, hold, active identity, legacy candidate, or taxon-specific ledger record was found. This packet makes the first focused decision for Pacific hake and does not reopen the separate silver-hake / *M. bilinearis* hold.

The identity itself is well supported. CFIA's Fish List assigns TSN **164792** to *Merluccius productus* and lists `Pacific Hake / Merlu du Pacifique` as well as separate broader `Hake / Merlu` and `Whiting` names. DFO independently identifies *M. productus* as Pacific Hake/Pacific Whiting and describes it as a commercial human-food fish. A current Canadian manufacturer and Metro product listing also use the French species phrase in a finished surimi product. The hold is about the Québec-facing search boundary and the lack of a standalone species-named Québec SKU, not taxonomic uncertainty. [S01–S03, S07; archived source `WP04-P-NEXT-FINFISH-20261012-S05`]

## Canadian and Québec naming evidence

The CFIA Fish List separates four English/French name rows for *M. productus*: `Pacific Whiting`; `Pacific Hake / Merlu du Pacifique`; `Hake / Merlu`; and `Whiting`. The qualified bilingual pair is suitable identity evidence. The other two short market words are broader: the same list assigns `Hake` and `Merlu` to *M. bilinearis*, *M. hubbsi*, *M. merluccius*, and additional *Merluccius* taxa, while `Whiting` is also assigned across multiple taxa. The species-specific English `Pacific Whiting` does not make bare `whiting` safe in a picker. The Fish List says its names are the common-name references for Canadian fish labelling; its public list currently reports a modification date of 2023-09-18. [S01–S02]

DFO's current species profile pairs `Pacific Hake / Pacific Whiting` with *Merluccius productus*. It says most are headed, gutted, and sold for human consumption, with fishmeal as another use. This supports identity and broad commercial use only; it does not define a recipe form, cut, portion, or household measure. [S03]

The Québec language boundary is less straightforward:

- OQLF's `merluche` entry identifies *Urophycis* spp. and names merluche blanche (*U. tenuis*) and merluche-écureuil (*U. chuss*) as the two species that may be marketed in Québec under that grouping. It says `merlu`, `merlan`, and `merluchon` were not retained for fish commercialization because a single species-specific term is preferred to avoid consumer confusion. Do not invent `merluche du Pacifique` for *M. productus*; the reviewed OQLF entry ties `merluche` to the separate *Urophycis* genus. [S04]
- OQLF's `merlu` entry is attributed to AFNOR, not OQLF, and associates the unqualified term with European hake, *M. merluccius*. It is not a Québec-preferred name for Pacific hake. OQLF's preferred `merlu argenté` entry is separately tied to *M. bilinearis*. These records reinforce that a bare `merlu` query spans distinct fish identities. [S05–S06]
- CFIA's qualified `Merlu du Pacifique` remains the best directly supported French display candidate found. Metro's live Québec listing uses `merlu du Pacifique` in a product ingredient description; Clover Leaf's French-Canadian product page uses the same phrase and identifies *M. productus* in its sourcing information. These are product-context uses, not evidence that OQLF has adopted the phrase as a standalone fish-market display. [S07; archived source `WP04-P-NEXT-FINFISH-20261012-S05`]

Accordingly, do not replace the federal name with the unsupported `merluche du Pacifique`, and do not add `merlu`, `whiting`, `Pacific whiting`, `North Pacific hake`, `jack salmon`, `merlan`, or the scientific name as aliases. `Pacific Hake` and `Merlu du Pacifique` would be the only conditional display terms; the alias arrays would stay empty. The product sources establish ingredient use and a branded finished product, but they do not identify every package's fish species because the label says pollock **and/or** Pacific hake.

## Exact ownership and baseline snapshot

The exact-key review follows [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD normalization, compatibility folding for `œ`, `æ`, `ß`, and `&`, combining-mark removal, punctuation-to-space replacement, and whitespace collapse. Picker projections below also follow the active order: exact form terms, complete word phrases in reference/form terms, then substring fallback.

| Phrase or ID | Active reference and attached forms | Legacy candidate | Ledger ownership | Finding |
|---|---|---|---|---|
| `Pacific hake`; `Pacific whiting`; `merlu du Pacifique`; *Merluccius productus* | No exact owner or attached form. | None | No record keyed to the taxon or candidate terms. | Species and French phrase remain unallocated. |
| `ingredient-ref-pacific-hake`; `candidate-pacific-hake` | None | None | None | Both candidate IDs are unallocated. |
| `ingredient-ref-red-hake` | **red hake / merluche-écureuil**, *Urophycis chuss*; no forms | No duplicate candidate | Existing identity and source-specific record | Keep distinct; OQLF ties `merluche` to *Urophycis*. |
| `ingredient-ref-white-hake` | **white hake / merluche blanche**, *Urophycis tenuis*; no forms | No duplicate candidate | Existing identity and source-specific record | Keep distinct. |
| `ingredient-ref-pacific-cod` | **Pacific cod / morue du Pacifique**, *Gadus macrocephalus*; no forms | No duplicate candidate | Existing identity | The shared geographic qualifier does not make this a hake. |
| `merlu` | No exact display/alias owner; current fallback reaches the two `merluche…` rows | None | No generic merlu identity | Do not let a qualified display turn this broad query into a singleton. |

The taxon, proposed reference/candidate IDs, and new source/finding prefix were searched across current references, forms, legacy candidates, ledger record/source IDs, plan, proposals, and batch archive. There is no focused Pacific-hake decision. The proposed ID strings below were not present. The earlier finfish sweep already cited the Clover Leaf French product page as `WP04-P-NEXT-FINFISH-20261012-S05`; this review reuses that existing archived source ID rather than assigning it a second identifier. Source IDs `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S01` through `S09` and finding ID `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-F01` are new and unique to this packet; none is allocated to the shared ledger because the recommendation is a hold.

The following baseline hashes cover exact file bytes. The manifest-ordered recipe digest hashes each relative recipe path, a NUL byte, exact file bytes, and another NUL byte.

| Baseline artifact | Count / size | SHA-256 or digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,342 references; 430,132 bytes | `71e1a1aa77fb9c6063c2b85f5178b5784f949b692ea7471f11415427ff766c0e` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50e50dca192bcb370a300` |
| `research-ledger.v1.json` | 1,651 records; 6,309 source entries; 5,300 unique source IDs; 6,278,782 bytes | `60c4b13c5bd39aa4e18fe2dd5abe8b0e1be337d98b1b1d75c37a97a0cfa60aa5` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,342 entries; 588,478 bytes | `c546347852e2163f099237f7a1c65f3ee77e5656c1eb1cdeca16812beb2cb77e` |

## Picker projection, including attached forms

Projection is for the current catalog and the conditional species-only row above. No current or conditional form is attached to Pacific hake, red hake, white hake, or Pacific cod. The row is not given a fillet, frozen, fresh, cooked, surimi, or other form. Results list references with their attached forms; all listed fish rows currently have none.

| Query | Current result(s) | Conditional result(s) | Boundary |
|---|---|---|---|
| `Pacific hake` | None | `ingredient-ref-pacific-hake` — Pacific hake / merlu du Pacifique; no form | Qualified English display returns the candidate alone. |
| `merlu du Pacifique` | None | `ingredient-ref-pacific-hake`; no form | Qualified CFIA French phrase returns the candidate alone. |
| `hake` | `ingredient-ref-red-hake`; `ingredient-ref-white-hake`; no forms | Those two plus Pacific hake; no forms | The broad English query remains multiple-choice. |
| `merlu` | Red hake; white hake; no forms (substring fallback) | **Pacific hake alone; no form** | The exact `merlu` token in `merlu du Pacifique` wins before fallback and hides the current two results. This is the blocker. |
| `merluche` | Red hake; white hake; no forms | Same two; no forms | Existing Québec *Urophycis* names remain intact. |
| `Pacific whiting` | None | None with empty aliases | Adding it as an alias would cause broad `whiting` to return this one species. |
| `whiting` | None | None with empty aliases | CFIA assigns the name across taxa; do not activate it by alias. |
| `Pacific cod`; `morue du Pacifique` | Pacific cod; no form | Same | Existing *G. macrocephalus* identity remains separate. |
| `Pacific` | Six current Pacific-named fish; no forms | Those six plus Pacific hake; no forms | The geographic word remains a multi-result query. |

The conditional French display creates the problem even with no alias: on the current exact-phrase-first picker, searching `merlu` selects the one term containing that exact word before searching substrings such as `merluche`. The broader Canadian Fish List assigns `Merlu` to multiple taxa, and OQLF's terminology record makes the Québec consumer boundary explicit. A species row should wait until the picker can preserve both the broad query and the qualified species choice, or until a Québec species-specific display is verified that avoids the collision.

## Full bundled recipe-corpus audit

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned. The review checked parsed recipe text and each ingredient row for normalized word phrases **Pacific hake**, **Pacific whiting**, **merlu du Pacifique**, *Merluccius productus*, **hake**, **whiting**, **merlu**, and **merluche**.

**Result: zero matching recipe files and zero matching ingredient rows for every candidate or broad name.** There is no recipe demand, product-state form, recipe link, quantity, or contextual substitution in the bundle that supports adding this identity now.

## Product state, measurements, and substitutions

Current Québec retail evidence is limited to a finished surrogate-seafood product. Metro lists Clover Leaf Crab Delectables sticks as a **227 g** product and its current ingredient text says `goberge et/ou merlu du Pacifique`; the listing showed the SKU out of stock when reviewed. This is mixture wording and does not establish which fish is present in an individual package. The 227 g amount is the complete finished surimi SKU only. [S07]

Clover Leaf's French-Canadian manufacturer page says its Delectables are made from pollock and/or Pacific-hake fillets, identifies the Pacific-hake supplier taxon as *Merluccius productus*, and locates that fish source in the Pacific Ocean near Oregon/Washington. The product is a cooked, crab-flavoured surimi with multiple ingredients, not a package of Pacific-hake fillets. Its archived evidence ID is `WP04-P-NEXT-FINFISH-20261012-S05`. Neither the finished-product package size nor the manufacturer's two-stick 55 g nutrition portion is a measure of Pacific hake. [archived source `WP04-P-NEXT-FINFISH-20261012-S05`]

Health Canada's Canadian Nutrient File has raw and cooked/baked-or-broiled foods labelled **hake (whiting), mixed species**. The raw entry reports 94.7 g per fillet, a 90 g food-guide portion, and 73% total refuse. The cooked entry reports 57.5 g per 100 ml flaked, 143.7 g per 250 ml, a 75 g food-guide portion, and 73% refuse. These values are explicitly mixed-species records; they cannot be attached to *M. productus* as a recipe measure, cut yield, density, or unit mapping. No species-specific mass/volume evidence, density, kitchen count, or edible-yield value was found. Add no measure, form, conversion, or yield. [S08–S09]

No reviewed recipe or product source supports a directed substitution between Pacific hake and cod, pollock, whiting, or another fish. The fact that a manufacturer uses either pollock or Pacific hake in one surimi formula is formulation-specific and does not establish a general fish-to-fish interchange. Add no global form conversion or contextual substitution. Reassess identity, aliases, forms, measurement/density, and substitutions as separate evidence dimensions if picker support later clears the name hold.

## Source register

Sources were checked on 2026-10-13. The archive source is explicitly reused rather than assigned a duplicate ID.

| Source ID | Source and direct URL | Evidence and limits |
|---|---|---|
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S01` | CFIA, [Fish List search page](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) — queried for Pacific Hake | Lists TSN 164792, *M. productus*, with `Pacific Hake / Merlu du Pacifique`, and separate broad `Hake / Merlu` and `Whiting` rows. Name/taxon and Canadian fish-label evidence; no recipe measure or Québec-preferred display conclusion. |
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S02` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Fish List's Canadian fish-labelling role and the species/name connection. It does not establish a Québec OQLF preference or consumer SKU for this species. |
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S03` | Fisheries and Oceans Canada, [Pacific Hake/Pacific Whiting](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pacifichake-whiting-merlupacifique-nord-eng.html) | Pairs the English names with *Merluccius productus* and describes broad commercial human-food use. It does not provide a kitchen form, household quantity, or substitution. |
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S04` | OQLF, [merluche (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199931/merluche) | Normalizes `merluche` for the *Urophycis* grouping and says bare `merlu` and related names were not retained for fish-product commercialization in Québec. It is not a Pacific-hake naming record. |
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S05` | OQLF, [merlu (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3297726/merlu) | AFNOR-attributed entry associates bare `merlu` with *Merluccius merluccius*. It is not an OQLF preferred Québec market term for *M. productus*. |
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S06` | OQLF, [merlu argenté (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198847/merlu-argente) | OQLF's preferred Québec term for *M. bilinearis*, another hake species. Terminology distinction only; this identity remains separately held. |
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S07` | Metro, [Crab Delectables sticks, 227 g](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/batonnets-de-goberge-a-saveur-de-crabe/p/061362800004) | Current Québec listing names pollock and/or Pacific hake in finished surimi and shows a 227 g package; it was out of stock at review. No binomial or per-package species confirmation. Amount is SKU-only. |
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S08` | Health Canada, [CNF 3089 — hake (whiting), mixed species, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3089) | Mixed-species raw fish only: 94.7 g fillet, 90 g guide serving, 73% refuse. Do not transfer these values to Pacific hake. |
| `WP04-P-PACIFIC-HAKE-PICKER-HOLD-20261013-R9-S09` | Health Canada, [CNF 3090 — hake (whiting), mixed species, baked or broiled](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3090) | Mixed-species cooked fish only: 57.5 g/100 ml flaked, 143.7 g/250 ml, 75 g guide serving, 73% refuse. Do not transfer these values to Pacific hake. |
| Existing archived source ID `WP04-P-NEXT-FINFISH-20261012-S05` | Clover Leaf, [Crab Delectables, flake style — French product page](https://www.cloverleaf.ca/fr/produits/crabe-delectables-de-clover-leaf-mc-en-flocons/) | Existing archive entry identifies the optional Pacific-hake ingredient as *M. productus* and names the Oregon/Washington Pacific source. Reused from the finfish sweep; product/sourcing evidence only, not a standalone species SKU or species-specific quantity. |

## Review outcome and reconsideration evidence

1. Keep Section P open and record a **picker/name hold** for *Merluccius productus*.
2. Add no `ingredient-ref-pacific-hake`, `candidate-pacific-hake`, aliases, shared-ledger source or finding, form, measure, density, mapping, recipe link, yield, or substitution.
3. Reconsider after the picker can retain multiple results for broad `merlu`, or when an OQLF/Québec species-specific display avoids the broad token while preserving the CFIA species identity. Recheck exact owners, product scope, source IDs, recipe demand, and numeric/substitution evidence at that time.

## Root integration result

The picker/name hold was upheld. No active reference, candidate, or shared-ledger row was added. The plan, roadmap, and round-nine batch README record the hold and reconsideration condition. No app, unit, instrumentation, emulator, or application tests were run; the hold is documentation-only.

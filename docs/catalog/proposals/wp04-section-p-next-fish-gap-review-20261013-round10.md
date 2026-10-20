# WP04 Section P — chain pickerel / brochet maillé picker-boundary review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only species identity, naming, picker, market, and recipe-demand review.
- **Recommendation:** **Hold** *Esox niger* outside the active picker. Québec’s current species profile supplies a distinct identity pair, **chain pickerel / brochet maillé**, but the English display necessarily makes a broad **pickerel** search return this one species. CFIA, Québec government, and current Québec retail evidence use **pickerel** for *Sander vitreus* (walleye); CFIA also assigns pickerel wording to other *Sander* taxa. A one-row result would therefore suggest the wrong taxonomic scope. Add no active reference, alias, legacy candidate, ledger record, form, measurement, recipe link, conversion, yield, or substitution.
- **Conditional identity shape if the picker can preserve broad-name ambiguity:** `ingredient-ref-chain-pickerel`, category `PROTEIN`, English **chain pickerel**, Québec French **brochet maillé**, aliases empty, scoped to *Esox niger*. This shape is not recommended for activation under current search behavior.

## Why this is a distinct open gap

The Section P finfish parent remains open. The Canadian/Québec freshwater finfish review names chain pickerel as a neighboring species when defining *Esox lucius* / northern pike, but it does not assign a chain-pickerel identity, choose its own Québec/English display, inspect current market-name conflicts, or project it against the live picker. Searches of the checklist, active catalog, forms, legacy candidates, ledger, proposals, and batches found no focused chain-pickerel proposal, hold, or integration. The single earlier mention is a boundary note, not an allocation decision. This packet does not reopen northern pike, muskellunge, walleye, or sauger.

The species identity itself is clear: the Gouvernement du Québec’s current species profile pairs **brochet maillé** with **chain pickerel** and *Esox niger*, and distinguishes it from grand brochet, maskinongé, brochet d’Amérique, and brochet vermiculé. The blocker is the English picker boundary and lack of species-matched consumer product evidence, not uncertainty over the taxon.

## Canadian and Québec naming and product evidence

The Gouvernement du Québec profile, last updated 2026-10-02, gives the bilingual pair and *Esox niger*. It describes the fish in a recreational-fishing context, notes its Québec range and current conservation-status wording, and reports usual observed size and weight. That profile is strong Québec identity evidence, not a retail label, commercial supply record, recipe measure, or permission to infer market availability. [S01]

OQLF’s GDT entry for **brochet maillé** also gives *Esox niger*, but its English equivalent is **grass pike**, attributed to FAO (1972), in a zoology/ichthyology entry. This older terminology does not establish a current Québec fish-counter name. Do not use **grass pike** as the English display or alias: it would also make broad `pike` searches return the candidate alongside northern pike. [S02]

CFIA says the Fish List supplies English/French common names acceptable in Canada for fish labelling and the associated scientific names. Its currently available list (modified 2023-09-18) assigns **Pickerel / Doré jaune** and **Yellow Pickerel** to *Sander vitreus*; **Baby Pickerel / Doré noir** to *S. canadensis*; and **European Pickerel / Doré européen** to *S. lucioperca*. The retrieved complete result list contains no *E. niger* entry. This is a naming and labelling boundary, not proof that *E. niger* cannot be eaten or sold. Reuse the exact prior source ID `WP04-SAUGER-20261012-S02` for this same CFIA Fish List overview/results source; do not mint a duplicate ID. [WP04-SAUGER-20261012-S02]

Québec’s current walleye species profile separately lists **Yellow Pickerel** as an English alternate for *S. vitreus*. More directly, Metro’s current English listing **Pickerel Fillet** and French listing **Filet de doré** are the same product number 216838 and identify the fish as *S. vitreus*, sourced from the Great Lakes in Canada. Metro currently marks the item out of stock; this supports the live product naming and taxon statement, not current inventory. Metro shows an approximate 200 g average each on this specific walleye SKU; that is not a chain-pickerel or general finfish measure. [S03]

Costco Canada’s current **Purepac Lake Erie Pickerel Fillets** listing identifies the ingredients as **Pickerel (*Sander vitreus*)**, says the product is wild-caught and Canadian, and lists a 4 × 1 kg pack. This is independent Canadian product evidence that the bare English consumer term `pickerel` can mean walleye rather than chain pickerel. Its pack mass is SKU-specific and cannot be transferred to another fish identity. [S04]

Together, the primary and product sources support a species-qualified conditional pair but reject allocating the shared English query to *E. niger*. The broad query currently has no catalog result; activating the row would turn that absence into one apparently definitive, conflicting result. Empty aliases do not fix the issue because `pickerel` occurs in the required English display itself.

## Exact ownership and collision audit

The audit follows [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, compatibility folding, accent removal, punctuation-to-space conversion, and whitespace collapse. Exact phrase ownership is distinct from broad picker queries that match a word inside a display.

| Candidate phrase or ID | Current exact owner | Boundary |
|---|---|---|
| `chain pickerel`; `brochet maillé`; `brochet de rivière`; *Esox niger* | None in active references, attached forms, or legacy candidates. | The Québec species profile’s alternate French `brochet de rivière` is not needed as a search alias. The scientific name remains evidence, not an ingredient search term. |
| `ingredient-ref-chain-pickerel`; `candidate-chain-pickerel` | None in active reference IDs, legacy IDs, or ledger record IDs. | Candidate and IDs are unallocated. |
| `pickerel`; `yellow pickerel`; `walleye` | `pickerel` and `yellow pickerel` have no active exact catalog term; `walleye` belongs to **walleye / doré jaune**, *S. vitreus*. | Canadian label and retailer evidence assigns pickerel wording to walleye; do not add these terms as aliases to chain pickerel. |
| `grand brochet` / `northern pike` | **ingredient-ref-northern-pike**, *Esox lucius*; no attached forms. | Distinct active species. |
| `maskinongé` / `muskellunge` | **ingredient-ref-muskellunge**, *E. masquinongy*; English aliases `muskie`, `musky`; no attached forms. | Distinct active species. |
| `doré noir` / `sauger` | **ingredient-ref-sauger**, *Sander canadensis*; no attached forms. | CFIA’s `Baby Pickerel / Doré Noir` term is source evidence, not an active alias. |
| `doré jaune` / `walleye` | **ingredient-ref-walleye**, *S. vitreus*; no attached forms. | Keep its species identity separate from pickerel-named product use. |

The 2026-10-10 freshwater review states that generic `pickerel` remains unassigned because sources use it for multiple fish; it did not review *E. niger* as a catalog candidate. The 2026-10-12 sauger review records the CFIA *Sander* rows under `WP04-SAUGER-20261012-S02`; that source ID is reused above rather than reissued. The new proposal prefix `WP04-P-CHAIN-PICKEREL-PICKER-HOLD-20261013-R10` and finding ID `WP04-P-CHAIN-PICKEREL-PICKER-HOLD-20261013-R10-F01` were absent from the ledger and archive before this packet. The new source IDs S01–S04 are unique within the packet and repository; none is added to the shared ledger because the recommendation is a hold.

## Picker projection, including attached forms

This is a static read-only projection of the live references and forms plus an in-memory conditional row with no aliases or forms. It follows the active search order: exact form phrase, complete phrase in reference/form terms, then substring fallback.

| Query | Current result(s), with forms | If the conditional row were active | Implication |
|---|---|---|---|
| `chain pickerel` | None | chain pickerel / brochet maillé; no form | Species-qualified English lookup. |
| `brochet maillé` | None | chain pickerel / brochet maillé; no form | Qualified Québec French lookup. |
| `brochet de rivière` | None | None | Keep the page’s secondary name inactive. |
| `pickerel` | None | **chain pickerel / brochet maillé only; no form** | Unsafe singleton: CFIA and current Québec/Canadian consumer sources use pickerel for walleye and other *Sander* species. |
| `brochet` | northern pike / grand brochet; no form | northern pike / grand brochet **and** chain pickerel / brochet maillé; neither has a form | A broader French query would show two qualified choices. |
| `pike` | northern pike / grand brochet; no form | Same | Do not add OQLF’s old `grass pike` wording; it would broaden this result. |
| `walleye`; `doré jaune` | walleye / doré jaune; no form | Same | Existing *S. vitreus* identity stays separate. |
| `yellow pickerel`; `Pickerel Fillet` | None | None | Do not add the CFIA or retailer wording as an alias for *E. niger*. |
| *Esox niger* | None | None | Scientific names do not become search aliases. |

The key search/index risk is concrete: under current search behavior, adding the conditional bilingual display alone changes `pickerel` from zero results to one result for *E. niger*, while current Canadian evidence uses that bare word for *S. vitreus*. Search has no region or taxon disambiguation setting that could keep both choices visible for this broad query. Keeping the row held preserves the current unassigned state instead of asserting the wrong species.

## Full bundled-recipe demand scan

All **114** manifest-listed recipe files and **1,123** ingredient rows/links were scanned. Parsed recipe strings and ingredient-row text, names, and links were checked for normalized whole-phrase matches on **chain pickerel**, **brochet maillé**, **brochet de rivière**, *Esox niger*, **pickerel**, **brochet**, and **pike**.

**Result: zero candidate or broad-name matches in recipe rows and zero matching recipe files.** Nearby seafood requests are not chain-pickerel demand: recipe 077#10 requests salmon fillets, recipe 093#4 has the unlinked placeholder “Cooked meat or seafood, to taste,” recipe 111#1 requests one tuna steak, recipe 019#8 requests Jumbo Lump crab meat, and recipe 023#1 requests sliced calamari. No line links to or selects *E. niger*. Add no recipe link or relink.

## Product state, measurements, and substitutions

| Evidence dimension | Finding and boundary |
|---|---|
| **Identity and market scope** | *E. niger* and the Québec profile’s pair `chain pickerel / brochet maillé` are source-supported. The reviewed current Québec retail product naming does not establish a chain-pickerel SKU; the unqualified pickerel products inspected identify *S. vitreus*. Do not infer that a walleye listing is chain pickerel. |
| **Forms** | Add none. No chain-pickerel source establishes a retail whole, fillet, fresh/frozen, or cooked form. Metro’s listing is a walleye fillet SKU, not an *E. niger* product. |
| **Numbers and measures** | Québec’s observed 31–50 cm and 0.6–2 kg ranges, with some fish near 80 cm / 4 kg, describe fish biology, not edible portion or kitchen amount. Metro’s approximate 200 g each and Costco’s 4 × 1 kg are specific to walleye product listings; neither transfers to this species or to a generic pickerel reference. Add no measure, density, unit mapping, conversion, package basis, or yield. |
| **Recipe quantity** | No bundled recipe demand or species-specific recipe amount exists. |
| **Substitution** | Add no substitution. Shared family, freshwater habitat, similar fishing use, or comparable retail placement does not establish equivalence to northern pike, muskellunge, walleye, sauger, or any other fish. No recipe method/role evidence supplies a directed substitution. |

## Baseline snapshot

Snapshot captured on 2026-10-13 before this proposal was created. Hashes cover exact file bytes. The manifest-ordered recipe digest hashes each relative path, a NUL byte, the exact file bytes, and another NUL byte.

| Baseline artifact | Count / size | SHA-256 or digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,342 references; 430,176 bytes | `a1b425300c63e9961a1c81f4fddd4e5b6e39de8b82c60056dab297300c90fb1c` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,652 records; 6,328 source entries; 5,313 unique source IDs; 6,295,260 bytes | `7181987854fa0934831792757985f39e8f53b3bb7dcb50412473af1a026621fe` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,342 entries; 588,504 bytes | `95e2a5271a9126a39f347e3152267b436b2f913560ae30666db37ef8ae0cf2e2` |

## Sources and source limits

Sources were checked live on 2026-10-13. The sources establish separate evidence dimensions: species identity, Québec terminology, Canadian labelling terms, and a current market-name conflict. Retail amounts remain tied to the product and species printed on those listings.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP04-P-CHAIN-PICKEREL-PICKER-HOLD-20261013-R10-S01` | Gouvernement du Québec, [Brochet maillé](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/brochet-maille) | Current Québec profile (updated 2026-10-02) pairs `brochet maillé / chain pickerel` with *E. niger*, describes Québec range and recreational context, distinguishes similar Esocidae, and gives biological size/weight. It is not a retail label or recipe-measure source. |
| `WP04-P-CHAIN-PICKEREL-PICKER-HOLD-20261013-R10-S02` | OQLF GDT, [brochet maillé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19050677/brochet-maille) | Identifies the term and *E. niger* but gives older source-attributed English `grass pike` (FAO, 1972) in zoology/ichthyology. This does not establish a contemporary Québec consumer-label name. |
| **Reused:** `WP04-SAUGER-20261012-S02` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Official Canadian fish-labelling name scope and the *Sander* rows assigning `Pickerel / Doré Jaune`, `Yellow Pickerel`, and `Baby Pickerel / Doré Noir` to distinct taxa. Reused because it is the same source and result set already logged in the sauger review. The available list reports modification date 2023-09-18. |
| `WP04-P-CHAIN-PICKEREL-PICKER-HOLD-20261013-R10-S03` | Metro, English [Pickerel Fillet](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/pickerel-fillet/p/216838) and French [Filet de doré](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/filet-de-dore/p/216838) | Same current Québec retailer product number 216838; both pages identify *S. vitreus* and Great Lakes, Canada. The page currently says out of stock. Its approximate 200 g per each is specific to this walleye product. |
| `WP04-P-CHAIN-PICKEREL-PICKER-HOLD-20261013-R10-S04` | Costco Canada, [Purepac Lake Erie Pickerel Fillets](https://www.costco.ca/p/-/purepac-lake-erie-pickerel-fillets-1-kg-22-lb-4-pack/100746328?langId=-24) | Current Canadian listing names Pickerel and identifies *S. vitreus*, wild-caught Canadian origin, uncooked/frozen state, and a 4 × 1 kg package. Product-specific evidence; not *E. niger* availability or a reusable measure. |
| **Context only** | Gouvernement du Québec, [Doré jaune](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/dore-jaune) | Current *S. vitreus* profile separately lists `Yellow Pickerel` as another English name. This supports the picker conflict and does not supply a chain-pickerel alias. |

## Verification and disposition

The live reference, form, legacy, and ledger ownership checks found no exact candidate owner; the archive search found no focused prior chain-pickerel decision; the proposed source/finding IDs were unique; the read-only picker projection exposes the `pickerel` singleton risk; and the complete 114-file / 1,123-row recipe scan found no matching demand. Static review only.

## Root integration result

The hold is upheld. Chain pickerel remains outside active references, legacy candidates, and the research ledger; the CFIA source is reused in the proposal without creating a new ledger registration. The plan, roadmap, and round-ten batch README record the hold. No catalog JSON, generated file, recipe, or application code changed for this WP04 item. No app, unit, instrumentation, emulator, or application tests were run because the item is documentation-only.

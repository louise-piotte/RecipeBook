# WP04 Section P — saffron cod / navaga jaune picker-boundary review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only species identity, Québec naming, product scope, picker, ownership, recipe-demand, measurement, and substitution review.
- **Disposition:** **Hold** *Eleginus gracilis* outside the active picker. Canadian sources establish the species and a bilingual naming conflict, but the currently supported French display `navaga jaune` makes a broad `navaga` query return this single species. DFO records a separate *Eleginus navaga* as `navaga`; CFIA instead displays the French name `Morne Boréale`. No OQLF entry or current Québec product name resolves that boundary. Do not add an active reference, alias, legacy candidate, ledger record, form, measurement, recipe link, conversion, yield, or substitution.
- **Conditional reference shape for a future picker-capable or better localized review:** `ingredient-ref-saffron-cod`, `PROTEIN`, English **saffron cod**, French **navaga jaune**, no aliases. The conditional row is **not** proposed for activation now.

## Why this is a distinct open Section P gap

The active Section P checklist remains open for regional fish. Searches of the current plan, roadmap, WP04 proposal and batch archives, active references, forms, legacy candidates, and research ledger found no focused saffron-cod / *Eleginus gracilis* review, hold, active allocation, or species-specific ledger record. The earlier cod and regional-finfish work covers Arctic cod, Atlantic cod, Pacific cod, Atlantic tomcod, burbot, Alaska pollock, and other named fish; none makes a saffron-cod decision. Exact repository searches for `saffron cod`, `navaga jaune`, `morne boréale`, `Eleginus gracilis`, and the proposed IDs returned no prior saffron-cod finding. This packet does not reopen the integrated cod species or the Arctic-cod / polar-cod naming boundary.

The candidate is a real food-fish identity in Canadian sources. The hold concerns how a Québec-facing picker should expose it: CFIA's French field and DFO's French name do not agree, the DFO name contains a shorter common name for another *Eleginus* species, and no current Québec consumer product or OQLF entry was found to resolve that choice.

## Canadian and Québec naming evidence

CFIA's Fish List identifies TSN **164708**, *Eleginus gracilis*, as **Saffron Cod / Morne Boréale**. CFIA describes the list as the common-name reference for fish sold or processed in Canada. Its current Fish List page reports a modification date of 2023-09-18. This supports the species and Canadian edible-fish naming scope, but its displayed French wording is not corroborated in the other reviewed Canadian or Québec terminology sources. I retain `Morne Boréale` exactly as CFIA displays it; I do not silently amend it to `Morue Boréale` or treat it as an OQLF-approved Québec display. [S01–S02]

DFO's *Annotated List of the Arctic Marine Fishes of Canada* independently pairs *E. gracilis* with **Saffron Cod / Navaga jaune**. It lists the species for Yukon, Northwest Territories, and Nunavut, says it is used in local fisheries and commercially important elsewhere, and gives a 63 cm biological size. The geographic and fisheries statements are not evidence of Québec retail availability, a kitchen measure, or edible yield. The same DFO list places the fish in Gadidae (cods/morues). [S03]

DFO's Canadian Arctic bibliography distinguishes *E. gracilis* / `navaga jaune` from *Eleginus navaga* / `navaga`. This is an actual common-name scope distinction, not a spelling variant. The current picker indexes the conditional display phrase `navaga jaune` and matches its complete word `navaga`; it cannot tell a user intending the other species that the proposed row is only *E. gracilis*. The other species has no active row to retain that choice. [S04]

The Government of Hokkaido's fisheries research institute identifies **Komai** as *E. gracilis* and gives **Saffron cod** as its English name. Fukuya Foods, a Canadian seller, currently lists **Dried Hokkaido Saffron Cod (Komai)** with a **400 g** product variant; the page was indexed as sold out when checked. This is Canadian product-name evidence for one dried SKU, not a Québec listing, current inventory confirmation, species-declared package label, universal form, recipe quantity, or standard package size. A focused search of OQLF and Québec retailer/product sources did not surface a dedicated `saffron cod` / `navaga jaune` entry or a current Québec SKU naming this fish. That is a bounded search result, not proof that no such source exists. [S06–S07]

The European Commission's fish-names database uses French **morue boréale** for *E. gracilis*. That provides a separately scoped European French name, not Québec naming evidence. It does not repair the Canadian conflict or justify adding `morue boréale` as a Québec alias. [S08]

### Boundary for names and market scope

- Conditional displays would be **saffron cod / navaga jaune**, scoped only to *Eleginus gracilis*.
- Keep **navaga** out of aliases. DFO assigns that shorter name to the separate *E. navaga*; the conditional French display itself would nevertheless match a `navaga` query alone.
- Keep CFIA's literal **Morne Boréale** out of aliases until its wording is corroborated in a Canadian or Québec consumer-name source. Do not infer that it means `morue boréale`.
- Keep **morue boréale** out of the Québec display and aliases. Its reviewed support is the European Commission's trade-name database, not OQLF or a Canadian/Québec consumer label.
- Keep **komai**, **Pacific saffron cod**, **Far Eastern navaga**, **Wachna cod**, scientific names, and other vernaculars out of aliases. They are unnecessary for this narrow Québec-facing row or are attached to specific source contexts.
- Keep saffron cod distinct from Arctic cod (*Boreogadus saida*), polar cod (*Arctogadus glacialis*), Atlantic cod (*Gadus morhua*), Pacific cod (*G. macrocephalus*), Atlantic navaga (*E. navaga*), Alaska pollock, and dried/preserved fish products. Taxonomic family membership and the shared word `cod` do not establish synonymy or substitution.

## Exact ownership and baseline snapshot

The exact-key audit follows [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD normalization, compatibility folding for `œ`, `æ`, `ß`, and `&`, combining-mark removal, punctuation-to-space replacement, and whitespace collapse. I checked active reference IDs/displays/aliases, form IDs/labels/match terms, all legacy candidate IDs/names/aliases, ledger record IDs and source/finding ID allocations, and the proposal/batch archive. Exact phrase ownership is separate from a broader picker query that matches a word inside a display.

| Candidate phrase or ID | Active reference | Form | Legacy candidate | Ledger record / source ID | Finding |
|---|---|---|---|---|---|
| `saffron cod`; `navaga jaune`; `Morne Boréale`; `morue boréale`; *Eleginus gracilis* | None | None | None | No record keyed to the taxon or candidate; no exact source/finding allocation. | Candidate and jurisdictional name conflict are unallocated. |
| `ingredient-ref-saffron-cod`; `candidate-saffron-cod` | None | None | None | None | Both proposed IDs are unallocated. |
| `navaga` | None | None | None | No ingredient identity record | DFO separately assigns this name to *E. navaga*; do not store it as an alias. |
| `ingredient-ref-arctic-cod` | **Arctic cod / morue polaire**, *Boreogadus saida* | No attached forms | No duplicate legacy owner | Separate active identity record | Keep the Arctic-cod taxon and its polar-cod common-name boundary unchanged. |
| `ingredient-ref-atlantic-cod` | **Atlantic cod / morue de l’Atlantique**, *Gadus morhua* | No attached forms | No duplicate legacy owner | Separate active identity record | Keep Atlantic cod distinct. |
| `ingredient-ref-pacific-cod` | **Pacific cod / morue du Pacifique**, *Gadus macrocephalus* | No attached forms | No duplicate legacy owner | Separate active identity record | Keep Pacific cod distinct. |
| `ingredient-ref-sablefish` | **sablefish / morue charbonnière**, *Anoplopoma fimbria*; includes `black cod` among reviewed aliases | No attached forms | No duplicate legacy owner | Separate active identity record | The shared word `cod` is not a taxonomic allocation. |
| `ingredient-ref-salt-cod` | **salt cod / morue salée** | No attached forms | No duplicate legacy owner | Separate product identity record | A cured product, not *E. gracilis*. |

No exact saffron-cod or proposed-ID owner was found in references, forms, legacy candidates, ledger record IDs/source IDs, or earlier proposal/batch records. Proposal-local IDs `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S01` through `S08` and finding ID `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-F01` were absent from the repository and ledger before this review. The eight source IDs below are distinct within this packet. Because the recommendation is a hold, **none is allocated to the shared ledger**.

Hash values cover exact file bytes. The manifest-ordered recipe digest hashes each relative recipe path, a NUL byte, exact file bytes, and another NUL byte.

| Baseline artifact | Count / size | SHA-256 or digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,341 references; 429,818 bytes | `c59281b35053e251f419a57e82785dce2f09c2ae439238d5dfa37f8664d1163f` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,650 records; 6,301 source entries; 5,293 unique source IDs; 6,271,366 bytes | `14a8d25a6303d08d88fb31a25ab127686873d607a36fe010745d03f909c4208d` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,341 entries; 588,042 bytes | `d74ae81199a67cbbe2c4b9b21d802deb40a810b8c08337cc24c8221844397ce6` |

## Picker projection, including attached forms

Projection follows the active picker: exact form terms first, then complete normalized phrases within reference/form terms, then substring fallback. All listed current cod-related references have **no attached form** in this snapshot. The conditional saffron-cod row would have no form either.

| Query | Current result(s), with forms | Conditional result(s), with forms | Interpretation |
|---|---|---|---|
| `saffron cod` | None | `ingredient-ref-saffron-cod` — saffron cod / navaga jaune; no form | Exact English species-qualified lookup. |
| `navaga jaune` | None | `ingredient-ref-saffron-cod`; no form | Exact DFO French species name. |
| `cod` | Arctic cod; Atlantic cod; Pacific cod; sablefish; salt cod — none has a form | Those five plus saffron cod — none has a form | Correctly broadens an existing multiple-choice search. No generic `cod` identity is proposed. |
| `morue` | Arctic cod; Atlantic cod; Pacific cod; sablefish; salt cod — none has a form | Same five; `navaga jaune` contains no `morue` term | French broad query remains as it is; this is part of the naming gap. |
| `navaga` | None | Saffron cod / navaga jaune; no form | **Unsafe singleton:** DFO distinguishes *E. navaga* / `navaga` from *E. gracilis* / `navaga jaune`. |
| `Morne Boréale` | None | None | CFIA's literal French display is deliberately not stored as an alias. |
| `morue boréale` | None | None | European French phrase is not promoted to a Québec term or alias. |
| `komai` | None | None | One seller's product name is not a global alias. |
| `Arctic cod`; `morue polaire` | Arctic cod / morue polaire; no form | Same | Existing *B. saida* row remains distinct. |
| `Pacific cod`; `morue du Pacifique` | Pacific cod / morue du Pacifique; no form | Same | Existing *G. macrocephalus* row remains distinct. |
| `salt cod`; `morue salée` | salt cod / morue salée; no form | Same | Existing cured-product identity remains distinct. |

The projection shows why the hold is not based on a taxonomic doubt: the English name is a distinct result, and the broad `cod` query can show it with the existing cod choices. The blocker is that the best supported Canadian French candidate `navaga jaune` also matches the shorter `navaga` word, whose DFO scope includes a different species; meanwhile the alternative CFIA phrase has no local consumer-name corroboration.

## Full bundled recipe-corpus audit

All **114** manifest-listed recipe files and all **1,123** ingredient rows were scanned. I checked full parsed recipe JSON text and every row for normalized whole phrases including **saffron cod**, **navaga jaune**, **Morne Boréale**, **morue boréale**, **navaga**, **Komai**, *Eleginus gracilis*, broad **cod**, and broad **morue**.

**Result: zero matching recipe files and zero matching ingredient rows for every candidate and broad cod/morue phrase.** No bundled demand, recipe link, relink, recipe-derived form, or contextual substitute supports adding this identity now.

## Product state, numeric evidence, and substitutions

The current Canadian Fukuya Foods listing is for **dried** Hokkaido saffron cod / Komai and offers a 400 g variant. Search-indexed page text showed the variant sold out. Preserve **400 g** only as that product-variant package amount, not a portion, recipe amount, default measure, package convention, edible yield, or unit mapping. Do not infer a fresh/frozen state, fillet/whole form, soaking ratio, or yield for the species generally. The local source does not print a binomial on the product listing; the Hokkaido fisheries page independently identifies Komai as *E. gracilis*, but this is not a taxon declaration on the Canadian SKU. [S06–S07]

DFO's 63 cm figure is biological body length and has no kitchen-measure meaning. No reviewed source establishes a recipe serving, fillet weight, mass/volume relationship, density, count conversion, cooking yield, or general package measure for *E. gracilis*. If a future Québec product supplies those data, keep each numeric observation scoped to that named product and state. Do not copy any value from other cod species or from the dried 400 g SKU to a generic species measurement. [S03, S06]

No reviewed source supports a directed saffron-cod substitution with a recipe, method, amount, or adjustment. Fukuya's product copy compares the taste of grilled Komai to grilled cod; that sensory comparison is product copy, not a recipe substitution or cooking/safety equivalence. Add no global or contextual rule for Atlantic cod, Arctic cod, Pacific cod, pollock, or other fish. [S07]

Because the candidate remains held, record no measurement or substitution state in the shared ledger. If picker support or new naming evidence later clears the hold, reassess the dimensions independently: identity only, alias terms, measurements/density, product forms, and directed recipe substitutions must each be re-evidenced.

## Source register

Sources were reviewed on 2026-10-13. The list separates Canadian species/naming evidence, local terminology, and one source-specific product observation.

| Source ID | Source and direct URL | Evidence and limits |
|---|---|---|
| `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S01` | CFIA, [Fish List search for Saffron Cod](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Saffron%20Cod) | Current searchable list identifies TSN 164708, *Eleginus gracilis*, as `Saffron Cod / Morne Boréale`. The page reports its 2023-09-18 modification date. Supports Canadian fish-label name/taxon pairing; not OQLF approval, current Québec availability, a kitchen measure, or a substitution. |
| `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S02` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains the Canadian labeling purpose of the Fish List and its common-name/taxon scope. It does not resolve the French wording discrepancy for this row or establish Québec retail usage. |
| `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S03` | Fisheries and Oceans Canada, [Annotated List of the Arctic Marine Fishes of Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/278854.pdf), *Eleginus gracilis* entry, pp. 33–34 | Pairs *E. gracilis* with Saffron Cod / Navaga jaune; lists Yukon, Northwest Territories, and Nunavut, local-fishery use and commercial importance elsewhere, plus biological length. The list is from 2004 (current federal repository copy surfaced in 2025); it is not current Québec retail evidence or a recipe/measure source. |
| `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S04` | DFO, [A bibliography of the Arctic species of the Gadidae](https://publications.gc.ca/collections/collection_2013/mpo-dfo/Fs97-6-1141-eng.pdf), 1983 report | Separately identifies *Eleginus gracilis* as `navaga jaune` and *E. navaga* as `navaga`, explaining the unsafe broad French picker query. The bibliography predates current market labels and does not establish product availability. |
| `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S05` | NatureServe Explorer, [*Eleginus gracilis*](https://explorer.natureserve.org/Taxon/ELEMENT_GLOBAL.2.101936/Eleginus_gracilis) | Gives Saffron Cod and French `Navaga jaune`, citing the American Fisheries Society 2023 eighth edition of common and scientific names of fishes from the United States, Canada, and Mexico. Biodiversity/name cross-check, not a Québec commercial-term ruling. |
| `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S06` | Hokkaido Research Organization, Wakkanai Fisheries Research Institute, [Komai](https://www.hro.or.jp/fisheries/research/wakkanai/surveys-knowledge-of-fish/inpvt400000007sg/inpvt40000000fzr.html) | Japanese fisheries authority pairs Komai with *Eleginus gracilis* and English Saffron cod. It identifies the source-language product term, not a Canadian label or Québec name. |
| `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S07` | Fukuya Foods, [Dried Hokkaido Saffron Cod (Komai)](https://fukuya.ca/products/dried-hokkaido-saffron-cod-komai?variant=45761536327939) | Canadian seller's current indexed listing names a dried Hokkaido product, shows a 400 g variant and a sold-out state, and compares its grilled taste with cod. Direct page retrieval returned a cache miss during this review; indexed page text was available. SKU-specific product wording and package amount only; not a Québec listing, current inventory confirmation, species declaration, standard size, portion, or substitution. |
| `WP04-P-SAFFRON-COD-PICKER-HOLD-20261013-R8-S08` | European Commission, [EU fish commercial names: *Eleginus gracilis*](https://fish-commercial-names.ec.europa.eu/fish-names/species/eleginus-gracilis_en) | Lists French `morue boréale` for the species in the European trade-name context. This explains a French alternative but is not a Canadian/Québec name source; no alias is proposed from it. |

## Review outcome and reconsideration evidence

1. Keep Section P open and record this proposal as a **picker/name hold** only.
2. Add no `ingredient-ref-saffron-cod`, `candidate-saffron-cod`, alias, source record, form, numeric data, recipe link, or substitution to shared files.
3. Reconsider only when one of these conditions is met: (a) the picker can preserve the distinct `navaga` and `navaga jaune` scopes, (b) a current Canadian/Québec authority or consumer label establishes a safe French term that avoids the broader singleton, or (c) a Québec source identifies the intended *E. gracilis* product and its consumer-facing bilingual name.
4. Re-audit exact ownership, picker results, recipe demand, and source IDs before any later integration because the shared catalog changes during this work.

No shared catalog, ledger, plan/checklist, roadmap, batch, recipe, generated file, or application file was edited. This proposal-only documentation pass used static source, ownership, picker, corpus, and hash checks; no app tests or emulator checks were run.

## Root integration result

Root upheld the picker/name hold on 2026-10-13. Saffron cod remains outside the active references and shared research ledger; the conditional row, aliases, forms, measures, recipe links, and substitutions were not added. The hold is recorded in the round-eight plan, roadmap, and batch README. No app tests or emulator checks were run for this documentation-only hold.

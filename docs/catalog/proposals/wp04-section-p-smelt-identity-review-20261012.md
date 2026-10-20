# WP04 Section P — American smelt / éperlan identity review

- **Review date:** 2026-10-12.
- **Packet type:** proposal-only Canadian/Québec species identity, naming, ownership, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** propose one species-scoped, identity-only `PROTEIN` reference for American smelt / `éperlan` (*Osmerus mordax*). Use `rainbow smelt` as the sole English search alias. Add no French alias, form, recipe link, default measure, density, unit mapping, conversion, yield, or substitution.
- **Scope:** this review changes only this proposal file. No catalog/database JSON, ledger, recipe, plan, roadmap, generated file, or test was changed. No tests or emulator checks apply.

## Bounded identity decision

| Candidate ID | Category | English display | fr-CA display | English aliases | French aliases | Taxon |
|---|---|---|---|---|---|---|
| `ingredient-ref-american-smelt` | `PROTEIN` | American smelt | éperlan | rainbow smelt | None | *Osmerus mordax* |

The current CFIA Fish List assigns `Rainbow Smelt`, `Smelt`, `American Smelt`, and `Lake Smelt` to *O. mordax*, while listing European Smelt separately as *O. eperlanus*. Its `American Smelt` result pairs the French field with `éperlan de lac`; its separate `Lake Smelt` row has no French field. OQLF also identifies *O. mordax* as `éperlan`, but distinguishes `éperlan de lac` as a lake product with different sensory properties. Use OQLF's normalized `éperlan` as the Québec display and do not promote the CFIA lake wording as a general alias. DFO’s species profile identifies American smelt as *O. mordax* and explains the common name rainbow smelt. These sources support the species row and English search alias, but not a merger with European smelt or every fish called smelt internationally. [S01–S04]

Use the OQLF-normalized Québec display `éperlan`. OQLF classifies the term as an edible fish name, pairs it with *O. mordax* and English `rainbow smelt`, and says `éperlan arc-en-ciel` was not retained for Québec fish-product commercialization. Keep that phrase out of the French alias list. OQLF also distinguishes `éperlan de lac` from `éperlan` as a freshwater/lake product of the same species with different texture and flavour. CFIA's `American Smelt` French field uses the lake-product term, while its separate `Lake Smelt` row has no French field; do not treat `éperlan de lac` as a general search alias. [S01–S03]

Keep the identity separate from Atlantic capelin (*Mallotus villosus*). Québec’s species profile calls capelin similar to éperlan but distinguishes them as separate Québec Osmeridae. The existing Atlantic capelin reference remains its own ingredient. Keep New Zealand whitebait separate as well: its active record is a regional multi-species product class and explicitly is not a single-species synonym for smelt. [S05, existing ledger record `ingredient-ref-new-zealand-whitebait`]

## Prior-work and checklist fit

The live Section P checklist keeps regional fish open under its broad finfish item. The focused `smelt` searches across that checklist, proposals, batch notes, active references, forms, legacy candidates, and ledger found no prior *O. mordax* identity proposal, hold, or integration. Existing references to smelt are boundary mentions: capelin and Atlantic tomcod reviews reject an unproven substitution, the roe review distinguishes smelt roe wording from capelin roe, and the Oceania review keeps New Zealand whitebait as a multi-species product. None decides ownership for *O. mordax*.

The nearest active identities are `ingredient-ref-atlantic-capelin` and `ingredient-ref-new-zealand-whitebait`; neither owns the proposed species. The smelt identity is not an alias of capelin or whitebait and does not reopen those decisions.

## Exact ownership and live snapshot

The ownership audit used the current ingredient-query normalization: lowercase, Unicode NFKD, fold œ/æ/ß and ampersand, remove combining marks, and normalize punctuation and whitespace. It compared complete normalized phrases in active reference names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger record IDs and terms.

| Candidate key | Active reference owner | Active form owner | Legacy candidate owner | Ledger identity owner |
|---|---|---|---|---|
| `smelt` / `American smelt` | None | None | None | None |
| `rainbow smelt` / `Atlantic smelt` | None | None | None | None |
| `éperlan` / `éperlan arc-en-ciel` | None | None | None | None |
| `lake smelt` / `éperlan de lac` | None | None | None | None |
| `European smelt` / *Osmerus eperlanus* | None | None | None | None |
| *Osmerus mordax* | None | None | None | None |
| `ingredient-ref-american-smelt` / `candidate-wp04-smelt-identity` | Neither ID exists | Neither ID exists | Neither ID exists | Neither ID exists |

The ledger contains no *O. mordax* identity record. Its only active `smelt`-related identity is the separate New Zealand whitebait record, which explicitly rejects a single-species synonym relationship. Other Section P documents mention smelt only as a comparator or in the distinct roe term `œufs d’éperlan`; those mentions are not owners. No exact candidate phrase appears in active forms or legacy identities.

This snapshot was read from the live worktree on 2026-10-12. Hashes cover exact file bytes. The recipe digest processes paths in manifest order and hashes each relative path, a NUL byte, exact recipe bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,268 references | `8e91765cbf4f5e334dcf95662e7af4606dac6804a6d4aa490d133d2afd23d737` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,576 records; 5,561 source entries; 4,597 distinct source IDs | `e71d8321beffe3530bc0ba902ab48dd44a6d304731b51d87e13f8d32aefb8a32` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The seven proposal-local source IDs below were absent from the live ledger and all other proposal/batch Markdown when checked. They are proposal citations only, not ledger additions.

## Picker-query behavior

`IngredientReferenceSearchIndex` normalizes accents and punctuation, returns complete phrase matches across display names, aliases, and form terms first, and uses substring matching only if there are no complete-phrase results.

- Before this proposal, `smelt`, `American smelt`, `rainbow smelt`, `éperlan`, `éperlan arc-en-ciel`, `éperlan de lac`, `European smelt`, and *O. mordax* queries return no active ingredient identity. `whitebait` returns only the qualified New Zealand whitebait product; `capelin` returns the separate Atlantic capelin reference.
- With the proposed display and alias, `American smelt`, `rainbow smelt`, and `éperlan` find the *O. mordax* identity. A bare `smelt` query also finds it because `smelt` is a full word in the English display, even though it is not stored as a separate alias. CFIA lists `Smelt` as a common name for this taxon. Do not add a generic “all smelt” row from that match.
- `European smelt` remains unmatched by the proposed row: it is a distinct CFIA-listed species, *O. eperlanus*. If it is reviewed later, the picker’s phrase behavior can return both species for the bare `smelt` query so the user can distinguish them.
- Do not add `lake smelt` / `éperlan de lac` as aliases: OQLF says those terms distinguish a lake product with sensory differences, despite sharing *O. mordax*. Do not add `éperlan arc-en-ciel` as the fr-CA display; OQLF says it was not retained for commercial fish labeling.
- Keep `capelan` and New Zealand whitebait in their current separate references. Similar appearance, family grouping, roe wording, or food use does not establish ingredient equivalence.

## Full bundled-recipe audit

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `smelt`, `American smelt`, `rainbow smelt`, `Atlantic smelt`, `lake smelt`, `European smelt`, `éperlan`, `éperlan arc-en-ciel`, `whitebait`, and both scientific names. The scan included complete parsed recipe content and ingredient-row fields.

**Result: zero candidate phrase hits in all recipe files and zero matching ingredient rows.** Recipe 093, Fried Rice / Riz frit, row 4, says “Cooked meat or seafood, to taste” without a reference or species. It supports no smelt link or quantity. Its separate fish-sauce row and the fish-sauce row in recipe 095, Satay, are unrelated. No recipe link, relink, or recipe-derived measure is proposed.

## Measurements and numeric limits

The sources establish the species and naming boundary, not a kitchen measure. DFO’s profile says smelt are usually under 20 cm and can reach 25 cm; those are biological body lengths, not package weights or portions. Québec’s fish-consumption page lists raw éperlan at 730 mg omega-3 per 100 g; that is a nutrient value, not an ingredient conversion or recipe quantity. Neither figure should become an active default measure. [S04, S07]

- **Aliases:** English `rainbow smelt` only; no French aliases. Keep the OQLF-normalized `éperlan` as the French display. Do not store bare `smelt` separately; the English display already allows that query. Do not alias `lake smelt` / `éperlan de lac` or the non-normalized commercial phrase `éperlan arc-en-ciel`.
- **Forms:** none. Current evidence does not justify fresh, frozen, whole, fillet, breaded, cooked, or preserved forms for this catalog identity.
- **Default density:** none; leave null.
- **Unit mappings:** none; leave empty.
- **Measurements:** none. No household portion, count-to-weight, or package quantity is supported.
- **Conversions and yields:** none. Do not infer volume-to-mass, edible yield, raw/cooked, frozen/fresh, or lake/marine conversion.
- **Substitutions:** none. Do not substitute capelin, anchovy, sardine, tomcod, European smelt, or other small fish based on size, family, habitat, or cooking similarity; no recipe context supports a directed rule.
- **Recipe links:** none; the corpus has no species-specific demand.

## Recommended integration delta

1. Add `ingredient-ref-american-smelt` in `PROTEIN` with English display `American smelt`, fr-CA display `éperlan`, and English search alias `rainbow smelt`.
2. Add a verified identity ledger record for *Osmerus mordax* using the sources below. If the two source-derived numeric facts are retained in a later ledger record, keep them as biological size and nutrient-composition observations; do not activate them as measures.
3. Keep `defaultDensity` null, `unitMappings` empty, and forms, recipe links, conversions, yields, and substitutions absent.
4. Keep European smelt (*Osmerus eperlanus*), `éperlan de lac` product wording, Atlantic capelin, and New Zealand whitebait separate.

## Sources

Sources were checked on 2026-10-12. Source-specific body length and nutrition data are not recipe measures.

| Source ID | Primary source | Evidence and limits |
|---|---|---|
| `WP04-P-SMELT-IDENTITY-20261012-S01` | Canadian Food Inspection Agency, [Fish List search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fplist.asp?cmbIn=e&lang=e&q=American+Smelt) and [lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *Osmerus mordax* as Rainbow Smelt, Smelt, American Smelt, and Lake Smelt; lists *O. eperlanus* as European Smelt separately. The American Smelt row's French field is `éperlan de lac`; the distinct Lake Smelt row has no French field. OQLF is used for the normalized fr-CA display and product-wording boundary. |
| `WP04-P-SMELT-IDENTITY-20261012-S02` | Office québécois de la langue française, [éperlan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198849/eperlan) | Identifies edible-fish *O. mordax*, gives preferred normalized `éperlan`, and English `rainbow smelt`, `American smelt`, and `Atlantic smelt`. Says `éperlan arc-en-ciel` and related forms were not retained in Québec fish-product commercialization. |
| `WP04-P-SMELT-IDENTITY-20261012-S03` | Office québécois de la langue française, [éperlan de lac](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198864/eperlan-de-lac) | Identifies the lake form with the same *O. mordax* species as `éperlan`, while distinguishing freshwater/lake habitat and sensory properties. This supports keeping lake-product wording out of the English/French alias set. |
| `WP04-P-SMELT-IDENTITY-20261012-S04` | Fisheries and Oceans Canada, [American Smelt species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/american-smelt-eperlan-arc-en-ciel-eng.html) | Pairs American smelt with *O. mordax*, explains the common name rainbow smelt, describes its anadromous life cycle and commercial fisheries, and reports biological length. The profile is not a kitchen-measure source. |
| `WP04-P-SMELT-IDENTITY-20261012-S05` | Gouvernement du Québec, [Éperlan arc-en-ciel, population du sud de l’estuaire du Saint-Laurent](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/eperlan-arc-en-ciel-pop-st-laurent) | Gives Québec scientific naming and distinguishes éperlan from capelin as similar but separate Osmeridae. The page concerns a specific vulnerable population and is not used to infer commercial availability or a recipe product form. |
| `WP04-P-SMELT-IDENTITY-20261012-S06` | Fisheries and Oceans Canada, [Commercial fisheries for Smelt](https://www.dfo-mpo.gc.ca/fisheries-peches/commercial-commerciale/atl-arc/smelt-eperlan-eng.html) | Current federal fisheries-by-species page lists smelt, but its linked multi-year management plan is archived (effective 2007–2011). It supports the Canadian commercial-fishery category only, not current package form, landing volume, or market availability. |
| `WP04-P-SMELT-IDENTITY-20261012-S07` | Gouvernement du Québec, [Recommandations — Consommation de poisson et santé](https://www.quebec.ca/sante/alimentation/saines-habitudes-alimentaires/consommation-de-poisson-et-sante/recommandations) | Lists raw éperlan (éperlan arc-en-ciel) at 730 mg omega-3 per 100 g, sourced from Health Canada’s Canadian Nutrient File. This is composition data, not a portion or recipe measure. |

Related review context, not reissued as new source IDs: the [Atlantic capelin review](wp04-section-p-atlantic-capelin-identity-review-20261012.md), [Atlantic tomcod review](wp04-section-p-atlantic-tomcod-identity-review-20261012.md), [tobiko/masago roe boundary review](wp04-tobiko-masago-roe-boundary-review-20261009.md), and [Oceania whitebait gap review](wp06-oceania-animal-foods-gap-sweep-20261012.md).

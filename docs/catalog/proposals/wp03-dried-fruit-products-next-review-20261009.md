# WP03 Section M dried-fruit products: next review

- **Reviewed:** 2026-10-09
- **Status:** proposal only. This file is the sole change in this packet; active seed data, the research ledger, plans, roadmap, code, tests, and existing proposals were not changed.
- **Scope:** sultana/golden-raisin terminology on the active raisins identity; dried barberry; dried wolfberry/goji terminology; and dried sweet, sour, and tart cherry boundaries.
- **Sources accessed:** 2026-10-09. Government of Canada food specifications, OQLF terminology, ISO standards, and a U.S. International Trade Commission report support the identity terms and product boundaries below. No measurement, form, or substitution evidence is activated.

## Recommendation

Carry forward three source-backed identity candidates and alias recommendations for two existing identities. Keep the new rows identity-only in `NUT_SEED_AND_DRIED_FRUIT`. The exact display pairs and candidate aliases below are proposals, not active catalog edits. Review normalized search collisions before any integration.

| Disposition | Candidate ID | English display | FR-CA display | Scope and alias candidates |
|---|---|---|---|---|
| Alias candidates on active identity | `ingredient-ref-raisins` (retain) | raisins | raisins secs | Conditional aliases for the named golden type: EN `sultana`, `sultanas`, `sultana raisin`, `sultana raisins`, `golden raisin`, `golden raisins`; FR `raisin de Smyrne`, `raisins de Smyrne`, `raisin doré`, `raisins dorés`, `raisin sultana`, `raisins sultana`. These point to the broader dried-grape identity only if the picker can represent the type without implying all raisins are golden. Do not add bare French `raisin`, which is owned by fresh grapes. |
| Recommend new identity | `ingredient-ref-dried-barberry` | dried barberry | épine-vinette séchée | Limit the identity to the dried red fruit of *Berberis vulgaris* covered by ISO 24090. Candidate grammatical variants: EN `dried barberries`; FR `épines-vinettes séchées`. Keep bare `barberry` / `épine-vinette` out of the alias list because the cited OQLF entry names the plant. |
| Recommend new identity; hold Goji terms | `ingredient-ref-dried-wolfberry` | dried wolfberry | baie du lyciet séchée | Candidate grammatical variants: EN `dried wolfberries`; FR `baies du lyciet séchées`. OQLF describes the fruit as marketed dried or in juice and gives `wolfberry` / `baie du lyciet`; keep juice separate. Hold `goji`, `gojiberry`, `goji berry`, and `baie(s) de goji` as aliases pending current terminology and trademark review. |
| Recommend new identity | `ingredient-ref-dried-sweet-cherries` | dried sweet cherries | cerises séchées sucrées | The Government of Canada specification explicitly separates the sweet type from the acidulées type. Do not use `dried cherries` or `sweetened dried cherries` as aliases. |
| Alias candidates on active identity | `ingredient-ref-dried-tart-cherries` (retain) | dried tart cherries | cerises séchées acidulées | Candidate EN aliases: `dried sour cherries`, `dried red tart cherries`. U.S. government scope language equates these terms and associates tart cherries generally with *Prunus cerasus*. OQLF identifies `cerise acide` / `griotte` with sour cherry; no extra French alias is proposed because the active display already uses the Government of Canada’s `acidulées` wording. |

The three proposed IDs are absent from the active reference IDs and all 86 legacy candidate IDs. No separate sultana ID is proposed: the sources describe sultana/golden raisins as a named type of dried grape, and the current recipe corpus has no line that requires preserving that type as its own ingredient. No separate sour-cherry ID is proposed because the cited government scope treats dried sour cherries as dried tart cherries. Exact ID collisions were checked; normalized alias matching still needs coordinator review.

## Refreshed working-tree snapshot

The snapshot was refreshed immediately before this proposal was written. The recipe corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe file bytes, and a NUL byte, in manifest order. Ledger source-entry count is the number of entries in `records[].sources[]`; distinct source IDs are the union of `sourceId` values in those entries and IDs listed in `unitConversions[].sourceIds[]`.

| Artifact | Live count | SHA-256 |
|---|---:|---|
| ingredient-references.v1.json | 631 references | 8935fb3c03acc994f0127d59a2a44c580e93260db8367229c0d9cdb9975dbfe0 |
| ingredient-forms.v1.json | 33 forms | 275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| research-ledger.v1.json | 801 records; 1,321 source entries; 1,119 distinct source IDs | 99448ddaf0ac44ef0b34130634eead1132e41a90ce0f69cada0f60e6a66cba2e |
| legacy-import-identities.v1.json | 86 candidates | 7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab |
| Manifest-listed recipe corpus | 114 recipes; 1,123 ingredient rows | 7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f |

All source IDs in this file use the `WP03-DRIED-NEXT-20261009-Sxx` prefix. Each was checked against the 1,119 distinct shared-ledger source IDs; none collides. They are proposal-local citations, not ledger entries.

## Current ownership and product boundaries

| Product or nearby identity | Current owner and state | Boundary for this proposal |
|---|---|---|
| Dried raisins | `ingredient-ref-raisins` is active as `raisins` / `raisins secs`; its ledger identity state is verified and measurement state is blocked pending evidence. | Keep it as the generic dried-grape owner. Consider only the specifically qualified Sultana/golden terms above; keep fresh grape `raisin` separate. |
| Fresh grapes | `ingredient-ref-grapes` is active as `grapes` / `raisin`. | Do not add bare French `raisin` to dried raisins. |
| Barberry | No active or legacy identity owner and no matching ledger identity record. | A product standard supplies a narrow dried red *B. vulgaris* product. Do not infer all *Berberis* species or ornamental barberry products from that standard. |
| Wolfberry / goji | No active or legacy identity owner and no matching ledger identity record. | OQLF supports the food term `baie du lyciet` / `wolfberry` and says the fruit is sold dried or in juice. Its entry, last updated in 2009, labels the goji forms as trademarks; this packet holds those terms instead of treating that note as current legal advice. |
| Dried tart cherries | `ingredient-ref-dried-tart-cherries` is active as `dried tart cherries` / `cerises séchées acidulées`; its ledger identity state is verified. | Keep this owner for tart/sour dried cherries. Add the English `dried sour cherries` and `dried red tart cherries` only as alias candidates. |
| Fresh cherries and generic cherry | `ingredient-ref-cherries` is active as `cherries` / `cerises`, with fresh/frozen/pitted terms. Legacy `ingredient-ref-cherry` remains an unreviewed generic duplicate. | Keep both out of the dried sweet/tart rows; do not promote the legacy duplicate. |
| Dried sweet cherries | No active or legacy identity owner and no matching ledger identity record. | Propose a distinct identity because the Government of Canada specification recognizes dried sweet and dried acidulées cherries as two types. Do not route generic `dried cherries` to either subtype. |

The active forms catalog has no form for these scoped targets. The active and legacy ID check found no collision for `ingredient-ref-dried-barberry`, `ingredient-ref-dried-wolfberry`, or `ingredient-ref-dried-sweet-cherries`. No recipe links or shared-ledger changes are proposed.

## Recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned using `originalText`, `ingredientName`, and `ingredientRefId`. The only direct dried-grape line is generic `raisins`; there are no lines naming sultanas, golden raisins, barberries, wolfberries/goji, or dried sweet/sour/tart cherries.

The nearby cherry lines confirm existing product boundaries and remain unchanged:

| Recipe and line | Ingredient wording | Current reference | Audit result |
|---|---|---|---|
| 028#5 | maraschino cherry juice | `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` | Keep the juice product separate. |
| 028#7 | maraschino cherries, drained and chopped | `ingredient-ref-cerises-au-marasquin` | Keep the preserved cherry product separate. |
| 029#1 | pitted cherries, fresh or frozen | `ingredient-ref-cherries` | Keep the fresh/frozen generic cherry owner. |
| 067#6 | maraschino cherry juice | `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` | Keep the juice product separate. |
| 067#8 | maraschino cherries | `ingredient-ref-cerises-au-marasquin` | Keep the preserved cherry product separate. |
| 102#7 | raisins | `ingredient-ref-raisins` | Retain generic dried raisins; wording does not identify Sultana or golden raisins. |

These candidates therefore add catalog coverage without recipe relinking.

## Holds and exclusions

| Item | Disposition | Boundary |
|---|---|---|
| Sultana as a separate identity | Hold. | The cited sources describe it as a golden dried-grape type; the current corpus only requires generic raisins. Keep qualified terms as conditional search aliases on the existing broad identity. |
| Goji-specific names | Hold as aliases. | OQLF prefers `baie du lyciet` and `wolfberry`; its 2009 entry marks Goji-related forms as trademarks. Review contemporary Québec usage and current mark status before adding those spellings. |
| Dried barberry beyond the ISO product | Hold. | The recommendation covers only dried red *Berberis vulgaris* fruit in ISO 24090. No general *Berberis* or plant identity is proposed. |
| Generic dried cherries | Hold. | The Government of Canada specification identifies sweet and acidulées types; `dried cherries` does not select one. Do not make it an alias for the sweet or tart row. |
| Added-sugar, infused, sweetened, or partially rehydrated cherries | No identity decision. | Processing and composition wording does not establish a different cherry species identity here. Do not infer a form, conversion, or alias from those properties. |
| Densities, mappings, forms, yields, conversions, substitutions, and recipe links | No proposal. | This review establishes identity terminology only. Existing measurement states remain as recorded in the ledger. |

## Sources

Source IDs below are stable and local to this proposal. Government and ISO standards support product categories; OQLF supports Québec terminology and lexical boundaries. No measurement, yield, or substitution claim is derived from them.

| ID | Source and URL | Support used |
|---|---|---|
| WP03-DRIED-NEXT-20261009-S01 | Government of Canada, Department of National Defence, [Food Quality Specifications: Dried Fruits, English PDF](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-eng.pdf) | Raisins are dried grapes; sultana/golden-raisin wording is interchangeable. Dried cherries have sweet and tart types. |
| WP03-DRIED-NEXT-20261009-S02 | Government of Canada, Department of National Defence, [Spécifications sur la qualité des aliments : Fruits séchés, French PDF](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-fra.pdf) | Gives `raisin de Smyrne`, `raisin doré`, and `raisin(s) sultana`; describes dried cherries as `sucrées` or `acidulées`. |
| WP03-DRIED-NEXT-20261009-S03 | OQLF, [raisin de Smyrne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297130/raisin-de-smyrne) | Preferred French term and English Sultana raisin/Sultana; notes Smyrna varieties are used to make raisins secs. |
| WP03-DRIED-NEXT-20261009-S04 | OQLF, [baie du lyciet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502910/baie-du-lyciet) | French/English wolfberry terms; food-fruit domain; red and yellow lyciet fruits; marketed dried or in juice; marks goji spellings as trademarks in this 2009 entry. |
| WP03-DRIED-NEXT-20261009-S05 | ISO, [ISO 24090:2021 — Dried barberry](https://www.iso.org/standard/77797.html) | Standard scope is dried barberry fruit of *Berberis vulgaris* L.; dried red barberries only. |
| WP03-DRIED-NEXT-20261009-S06 | ISO, [ISO 24090:2021 — Épine-vinette séchée](https://www.iso.org/fr/standard/77797.html) | French title for the dried barberry standard. |
| WP03-DRIED-NEXT-20261009-S07 | OQLF, [épine-vinette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19002216/epine-vinette) | Quebec French plant term corresponding to barberry; supports the name, not a broader dried-fruit scope. |
| WP03-DRIED-NEXT-20261009-S08 | ISO, [ISO 7908:1991 — Dried sweet cherries](https://www.iso.org/standard/14870.html) | Separate dried sweet-cherry product standard, current when accessed. |
| WP03-DRIED-NEXT-20261009-S09 | ISO, [ISO 6755:2001 — Dried sour cherries](https://committee.iso.org/cms/live/live/en/sites/isoorg/contents/data/standard/03/49/34981.html?browse=tc) | Dried sour cherries are a specified *Prunus cerasus* product; standard confirmed in 2024 when accessed. |
| WP03-DRIED-NEXT-20261009-S10 | OQLF, [cerise acide](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358080/cerise-acide) | Preferred French term `cerise acide` / `griotte`, English sour cherry, and *Prunus cerasus*. |
| WP03-DRIED-NEXT-20261009-S11 | U.S. International Trade Commission, [Dried Tart Cherries from Turkey](https://www.usitc.gov/publications/701_731/pub5014.pdf) | Official scope groups dried tart cherries with dried sour cherries and dried red tart cherries; tart cherries are generally *Prunus cerasus*. |
| WP03-DRIED-NEXT-20261009-S12 | OQLF, [cerise douce](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358079/cerise-douce) | Preferred Québec French term and English sweet-cherry term; supports the clearer display `cerises douces séchées`. |

No independent Québec alias-collision approval is claimed. The coordinator should resolve the conditional aliases and candidate IDs before any catalog integration.

## Coordinator integration disposition

Accepted dried barberry, dried wolfberry, and dried sweet cherries as identity-only references. The sweet-cherry French display is `cerises douces séchées`, using the OQLF entry for `cerise douce` to avoid a possible “sweetened dried cherries” reading of `cerises séchées sucrées`. Added the English aliases `dried sour cherries` and `dried red tart cherries` to the existing dried tart-cherries reference. Sultana/golden-raisin terms and Goji spellings remain inactive; generic dried cherries remain unassigned. No forms, measurements, recipe links, or substitutions were added. See the linked integration README for the accepted rows and verification.

# WP02 Section A: Québec French term boundary for high-gluten flour

**Review date:** 2026-10-12

**Status:** Proposal only. No catalog, form, legacy, ledger, recipe, plan, roadmap, code, or test file changed.

**Scope:** Whether the OQLF-preferred Québec term `farine de blé de force` should be searchable as the active high-gluten-flour identity, while keeping bread flour and other strong-flour products distinct.

**Proposal-local source prefix:** `WP02-HG-FORCE-20261012-S01` through `S07`; no exact prefix or filename owner was found before drafting.

## Recommendation

Add only **`farine de blé de force`** as a French search alias on the existing `ingredient-ref-high-gluten-flour` identity. Keep the displayed names `high-gluten flour / farine à haute teneur en gluten`, all English aliases empty, and all other French aliases empty. Do not add a new flour identity.

The OQLF identifies `farine de blé de force` as a preferred Québec term for flour made from strong wheat, rich in gluten, and used mainly for bread. Its listed English equivalent is `hard wheat flour`, so mapping it to the catalog’s narrower `high-gluten flour` row is an editorial search decision based on that definition and the current Canadian high-gluten product evidence, not an exact bilingual synonym pair stated by OQLF. Ardent Mills Canada names the high-gluten product in English and French, says it is milled from hard red spring Canadian wheat, and lists breads and bagels among its applications. [S01–S03]

Keep the active bread-flour identity separate. OQLF’s bread-related use description does not make every bread flour a high-gluten flour. Ardent Mills lists **Artisan Bread Flour / Artisan farine à pain** separately from **High Gluten Flour / Haute teneur en gluten**; its French **Farine forte** / English **Strong Bakers Flour** is also a separately named product. Do not move the active bread-flour terms, or add `farine forte`, `hard wheat flour`, or brand/product names as aliases to either row. [S02–S07]

## Proposed catalog delta

| Field | Current state | Proposal |
|---|---|---|
| Identity | `ingredient-ref-high-gluten-flour` | Reuse the existing identity. Do not create a separate `hard wheat flour` or `strong wheat flour` row. |
| English display | `high-gluten flour` | No change. |
| French display | `farine à haute teneur en gluten` | No change; it matches the current Canadian supplier’s French product wording. |
| English aliases | None | Keep empty. In particular, do not add `hard wheat flour`; the OQLF lists it as the English equivalent of the broader French term, but this review does not promote that broader English phrase to a high-gluten-only alias. |
| French aliases | None | Add only `farine de blé de force`. Keep `farine forte`, `farine à pain`, and `farine pour pain` off this row. |
| Forms | None attached | Add none. These are flour-class names, not preparation states. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` | No change. Add no generic cup, volume, or mass conversion. |
| Product specifications | No class-wide numeric specification in the catalog | Do not import Ardent Mills’ product-specific protein, ash, or moisture figures as universal thresholds or numeric catalog values. |
| Substitutions | High-gluten ledger state: `not_yet_researched`; bread-flour record has separate, source-specific substitution research | Add no substitution rule and transfer no bread-flour evidence to high-gluten flour. |
| Recipe links | No high-gluten recipe links; bread flour is actively linked | Add none. Retain each bread-flour link and its existing recipe note. |

The French alias is not a synonym for generic `bread flour / farine à pain`, `farine forte`, or `farine de blé dur`. The last phrase already belongs to durum flour. Keep the national and functional distinctions in the existing catalog rows.

## Evidence and boundary

| Evidence | What it establishes | Limit |
|---|---|---|
| OQLF, `farine de blé de force` | Preferred Québec French term; definition identifies a flour from strong wheat that is rich in gluten and mainly used for bread, with pizza and some noodle uses also named. OQLF lists `hard wheat flour` as the English equivalent. | The OQLF page does not list `high-gluten flour` as its English translation, set a protein threshold, or say the term is exclusive to one commercial grade. The catalog alias mapping is an inference from the definition plus Canadian product evidence. |
| Ardent Mills Canada, `High Gluten Flour / Haute teneur en gluten` | Current Canadian bilingual product pages use matching high-gluten product names. They describe the flour as milled from hard red spring Canadian wheat and identify bread and bagel applications. | One supplier’s product and category. Its specifications do not define a universal high-gluten class threshold. |
| Ardent Mills Canada, `Artisan Bread Flour / Artisan farine à pain` | Current bilingual pages name a bread-flour product separately from high-gluten flour. | Product-level evidence; does not mean all bread flours share this product’s composition. |
| Ardent Mills Canada, `Strong Bakers Flour / Farine forte` | Current English and French pages distinguish another strong-baker product from high-gluten flour and artisan bread flour. | Product-level naming and composition; do not generalize `farine forte` as a universal synonym or add a new catalog class from this review. |

The proposal adds the OQLF French phrase as a search alias only because its definition’s high-gluten property aligns with the existing high-gluten identity and current Canadian product evidence. It does not collapse all flours used for bread into that row, create a broader strong-wheat identity, or treat the Ardent Mills products as equivalent to each other.

## Names, ownership, and picker audit

The read-only audit used the live package snapshot on 2026-10-12. Exact phrase ownership was checked after applying the same lowercase, NFKD accent-folding, ligature folding, and punctuation-to-space normalization used by `IngredientSearch.kt`.

| Surface | Finding |
|---|---|
| Active references | `ingredient-ref-high-gluten-flour` owns `high-gluten flour / farine à haute teneur en gluten` and has empty alias arrays. `ingredient-ref-bread-flour` separately owns `bread flour / farine à pain` and `farine pour pain`. No active name or alias owns `farine de blé de force` or its unaccented key `farine de ble de force`. `ingredient-ref-durum-flour` owns `durum flour / farine de blé dur`; keep that separate. |
| Forms | There are 94 active forms. None is attached to the high-gluten or bread-flour identity, and no form label or match term owns the proposed phrase. |
| Legacy candidates | There are 65 legacy candidates. None owns the proposed phrase, its unaccented key, or a high-gluten/bread-flour candidate identity. |
| Research ledger | The high-gluten record already contains the Ardent Mills English/French product evidence under `WP02A1-S05` and `WP02A1-S06`, with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It contains no OQLF source or alias decision for `farine de blé de force`. The bread-flour record is separate (`identityState: unreviewed`, `measurementState: blocked_pending_evidence`, `substitutionResearchState: researched_supported`) and contains formula-specific test-kitchen evidence; that does not establish a high-gluten substitution. No ledger record owns the exact proposed French alias. |
| Proposal archive | The phrase appears in the Japanese medium-strength flour reviews only as a term that must not be applied to the unrelated Japanese class. Those reviews do not assess the phrase’s owner within the active high-gluten/bread-flour boundary. No dedicated high-gluten Québec-alias review was found. |
| Current picker | `farine de blé de force` and `farine de ble de force` currently return no reference. `farine à haute teneur en gluten` returns only high-gluten flour; `farine à pain` and `farine pour pain` return only bread flour; `farine de blé dur` returns only durum flour. `hard wheat flour` and `farine forte` currently return no reference. |
| Picker after proposed delta | Adding the complete French phrase to the high-gluten alias list should make both accented and unaccented searches resolve only to `ingredient-ref-high-gluten-flour`. The archive, reference, form, and legacy exact-key audit found no competing owner. Broad partial queries such as `farine` remain family searches and are not added as aliases. |

`IngredientSearch.kt` checks exact normalized word phrases first and falls back to substring matches only when no complete phrase matches. Because the proposed alias is a complete phrase and has no current exact owner, it has one natural destination without changing the bread-flour or durum-flour picker behavior.

## Recipe demand

All **114 manifest-listed recipe files** and their **1,123 ingredient rows** were scanned for the proposed phrase, its unaccented form, `hard wheat flour`, `high-gluten flour`, `farine à haute teneur en gluten`, `farine forte`, and the active high-gluten and bread-flour IDs.

- No recipe row is linked to `ingredient-ref-high-gluten-flour`.
- Two rows are linked to `ingredient-ref-bread-flour`: 420 g in recipe 072 (hamburger buns) and 95 g in recipe 094 (brownie cookie sandwiches).
- Recipe 076 (pizza dough) stores all-purpose flour as its ingredient and says in a note that bread flour may be used instead. It is not linked to high-gluten flour.
- No recipe contains `farine de blé de force`, `hard wheat flour`, or `farine forte` as ingredient wording.

The recipe corpus therefore supports keeping bread flour as its own identity; it does not establish a high-gluten recipe link or any recipe-specific need to change the alias recommendation.

## Forms, measurements, conversions, and substitutions

- **Forms:** None. High-gluten flour is an ingredient-class distinction; there are no attached high-gluten forms to update.
- **Measurements:** Ardent Mills lists product-specific protein of 13–14.5%, ash of 0.65–0.75, moisture up to 15%, and commercial package formats. Do not promote these figures or package sizes to class-wide composition, kitchen measures, density, or yield. Keep `defaultDensity: null` and `unitMappings: []`.
- **Conversions:** None. The source evidence supports no cup-to-mass conversion, volume mapping, or conversion from bread flour or durum flour.
- **Substitutions:** None proposed. The high-gluten ledger state remains `not_yet_researched`. Existing bread-flour substitution observations are tied to named test-kitchen recipes and remain on the bread-flour research record; do not generalize them to high-gluten flour.
- **Recipe links:** None added or changed. Recipe 076’s note and the two existing bread-flour line links remain attached to bread flour.

## Live-package snapshot

Counts and hashes are for the exact files read on 2026-10-12. The recipe corpus digest hashes each manifest-listed relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,266 | `44c8f14808fc3da227cb7218359b80c0e4276ec724ede2f1852d8e7b84f4b60f` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy candidates | 65 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research ledger | 1,574 records | `c11f1209cb768adf3a191bfa645d657087f61fe38e42a8f35feffdd2f6d2500e` |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The proposed filename and source-ID prefix were checked against the current proposal archive and ledger before drafting. Recheck exact ownership against the live snapshot before any integration.

## Source register

Sources were checked on 2026-10-12. Ardent Mills’ numerical and use statements below apply only to the named commercial products.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP02-HG-FORCE-20261012-S01** | Office québécois de la langue française, [farine de blé de force (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force), updated 2004. | Preferred Québec term; defines flour made from strong wheat, rich in gluten, mainly for bread and also used for pizza and some noodles; English equivalent `hard wheat flour`. No protein threshold and no one-to-one `high-gluten flour` translation. |
| **WP02-HG-FORCE-20261012-S02** | Ardent Mills Canada, [Haute teneur en gluten](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/high-gluten/). | Current French product page for a high-gluten flour milled from Canadian hard red spring wheat; lists breads, bagels, and product specifications. Product-level, not a general class standard. |
| **WP02-HG-FORCE-20261012-S03** | Ardent Mills Canada, [High Gluten Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/high-gluten/). | Matching English page for the same product category and applications. Its composition and commercial sizes remain product-specific. |
| **WP02-HG-FORCE-20261012-S04** | Ardent Mills Canada, [Artisan farine à pain](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/artisan/). | Current French bread-flour page, paired with its own English product page; demonstrates distinct product wording from high-gluten flour. Does not define every bread flour. |
| **WP02-HG-FORCE-20261012-S05** | Ardent Mills Canada, [Artisan Bread Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/artisan/). | Current English counterpart to S04; states a hard spring and soft winter wheat blend and bread/baking applications. Product-specific composition. |
| **WP02-HG-FORCE-20261012-S06** | Ardent Mills Canada, [Farine forte](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/strong-bakers/). | Current French page for a separately named strong-bakers product; it gives product-level composition and applications. Does not make `farine forte` a synonym for high-gluten flour. |
| **WP02-HG-FORCE-20261012-S07** | Ardent Mills Canada, [Strong Bakers Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/strong-bakers/). | Current English counterpart to S06. Confirms this is separately named from high-gluten and artisan bread flour in the supplier’s portfolio; not a universal class definition. |

## Integration boundary

If accepted, add only `farine de blé de force` to `aliasesFr` on `ingredient-ref-high-gluten-flour`, and record the OQLF term-definition and current Canadian product evidence with the stated limits. Keep displays, empty English aliases, all other French aliases, no-form state, null density, empty unit mappings, current ledger numeric/substitution states, and all recipe links as described. The broader Section A wheat-flour checklist remains open.

# WP02 B2 — `manioc flour` English alias boundary review

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as recommended on 2026-10-12. See the [integration record](../batches/wp02-wp03-wp04-wp05-manioc-chiura-capelin-vernonia-integration-20261012/README.md).
- **Scope:** Whether the exact English phrase `manioc flour` should search to the existing whole-root `ingredient-ref-cassava-flour` identity. This is one alias decision; it does not reopen the cassava-flour/tapioca-starch boundary or regional cassava products.
- **Plan mapping:** WP02 Section B lists cassava flour separately from tapioca starch and keeps the broader B2/B3 review open. The flour identity and its Québec French alias are already active; this packet resolves only the unassigned English synonym.
- **Source-ID prefix:** `WP02-B2-MANIOC-FLOUR-EN-ALIAS-20261012`; checked against the current proposal and ledger source IDs before drafting.

## Recommendation

**Accept only the English alias `manioc flour` on the existing `ingredient-ref-cassava-flour` row.** Keep the canonical display pair `edible cassava flour / farine comestible de manioc` and the existing French alias `farine de manioc`. OQLF's GDT pairs the Québec French headword `farine de manioc` with English `manioc flour` and defines it as powder from dry-ground manioc roots [S01]. Codex independently defines edible cassava flour as dried cassava flakes or paste that is milled and sifted to separate fibre, with `farine comestible de manioc` as the product label [S02]. A Canadian retail listing also uses `Manioc flour` in the ingredient statement for a product titled `Toasted Cassava Flour` [S03].

This is a bilingual search alias for the existing whole-root flour identity. The sources do not establish one grind, toast, fermentation, or hydration profile for all products sold with manioc wording. Keep the source-qualified regional products and wet-extracted starch separate. The alias does not create a recipe equivalence, preparation direction, or product-grade claim.

| Phrase or behavior | Disposition | Boundary |
|---|---|---|
| `manioc flour` | **Accept as the sole new English alias** on `ingredient-ref-cassava-flour`. | OQLF's GDT lists it as an English term for the French headword whose definition matches dry-ground cassava-root flour; the current Canadian listing supplies limited retail corroboration. [S01, S03] |
| `cassava flour` | Keep resolving to `ingredient-ref-cassava-flour` through the existing English display `edible cassava flour`. | This query already returns the whole-root flour row. Do not add a redundant stored alias or attach it to cassava starch, polvilho, lafun, or another source-named product. |
| `farine de manioc` | Keep as the existing French alias. | Its acceptance is recorded in the current reference and ledger; this review adds no French alias. [S01, S02] |
| `manioc starch` / `fécule de manioc` | Keep on `ingredient-ref-tapioca-starch`; do not add to cassava flour. | `manioc starch` is already the English alias of wet-extracted tapioca starch. The active French starch display is `fécule de manioc`. [S04] |
| `manioc meal`, `raspa`, `farine de manioc fermentée`, `farine de manioc fumée`, `tapioca flour`, or `farine de tapioca` | **Do not add.** | The GDT marks `manioc meal` and `raspa` as U.S. terms; process-qualified cassava products have separate or unresolved boundaries; OQLF marks `tapioca flour` obsolete for the starch product. None is established here as a generic Québec alias of whole-root cassava flour. [S01, S04] |
| Forms, measures, conversions, yields, recipe links, or substitutions | **No additions.** | The alias evidence supports a search name only. It does not supply reusable numeric or culinary behavior. |

## Exact active, legacy, and ledger ownership

Read-only snapshot at drafting on 2026-10-12. Hashes cover the exact file bytes.

| Surface | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,250 | `c6e2de7a57665fc3795821387a24fdd5b5372f43f6ed3bea5810fe06ff5ff376` |
| Active ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Research-ledger records | 1,558 | `01453d4513a92b7855463ec94ad39fa6f67d64f789199d35728bfc0bf93f4db9` |
| Legacy import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The active row is `ingredient-ref-cassava-flour`, category `FLOUR_AND_STARCH`, displayed as `edible cassava flour / farine comestible de manioc`. Its current `aliasesEn` is empty and `aliasesFr` contains only `farine de manioc`; `defaultDensity` is `null` and `unitMappings` is empty.

| Exact normalized phrase | Exact stored-key owner | Form / legacy owner | Proposal |
|---|---|---|---|
| `manioc flour` | None. | No exact form or legacy candidate. | Add only to `ingredient-ref-cassava-flour.aliasesEn`. |
| `edible cassava flour` | `ingredient-ref-cassava-flour` (`nameEn`). | None. | Keep canonical display. |
| `cassava flour` | No field stores this exact phrase; the picker query matches the canonical phrase `edible cassava flour`. | No exact form or legacy candidate. | Keep its current one-row result; do not store a redundant alias. |
| `farine de manioc` | `ingredient-ref-cassava-flour` (`aliasesFr`). | No exact form or legacy candidate. | Keep current French alias. |
| `farine comestible de manioc` | `ingredient-ref-cassava-flour` (`nameFr`). | No exact form or legacy candidate. | Keep canonical display. |
| `manioc` | `ingredient-ref-cassava-root` (`nameFr`). | No exact form or legacy candidate. | Keep broad query behavior; do not add bare `manioc` as an alias. |
| `manioc starch` / `fécule de manioc` | `ingredient-ref-tapioca-starch` (`aliasesEn` / `nameFr`). | No exact form or legacy candidate. | Keep on extracted starch only. |
| `farine de manioc fermentée` | None. | No exact form or legacy candidate. | Keep unassigned; do not make the generic flour alias process-qualified. |

The cassava-flour ledger record is `recordId: ingredient-ref-cassava-flour`, with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It already contains the Codex identity decision and an accepted decision for the French alias `farine de manioc`. Its OQLF source record lists `manioc flour` among the English terms, but no decision currently accepts that phrase as an active alias. No separate `manioc flour` ledger candidate or exact candidate ID exists. The ledger also holds a separate tapioca-starch record, whose current alias decision assigns `manioc starch` to the wet-extracted product. No ledger or catalog ownership is proposed to move.

The exact-phrase scan used the app's current search normalization (case, accents, punctuation, and spacing) across reference names/aliases, form labels/match terms, and legacy names/aliases. The new source-ID prefix was absent from the current source ledger and prior proposal files. The prior [`cassava-flour French-alias review`](wp02-section-b-alternative-flour-starch-gap-sweep-20261012.md) proposed and the [`integration report`](../batches/wp02-section-b-cassava-flour-alias-integration-20261012/README.md) records only the French alias `farine de manioc`; its mention of the GDT English equivalent is evidence, not an accepted `manioc flour` alias. The separate [`manioc-starch alias review`](wp02-b2-b3-next-flour-starch-gap-review-20261012.md) and [integration report](../batches/wp02-b2-b3-manioc-starch-alias-integration-20261012/README.md) assign `manioc starch` to the extracted-starch row and do not propose a flour alias. This packet therefore covers one unassigned English phrase, not either completed change.

## Picker phrase boundary

The static audit follows `IngredientReferenceSearchIndex`: it prefers full normalized word-phrase matches, then falls back to substring matches. Current query results are:

| Query | Current picker result |
|---|---|
| `manioc flour` | No result. |
| `cassava flour` | `ingredient-ref-cassava-flour` only, through `edible cassava flour`. |
| `farine de manioc` | `ingredient-ref-cassava-flour` only. |
| `manioc starch` | `ingredient-ref-tapioca-starch` only. |
| `fécule de manioc` | `ingredient-ref-tapioca-starch` only. |
| `manioc` | Four references: cassava flour, cassava leaves, cassava root, and tapioca starch. |
| `cassava` | Six references: attiéké, both Brazilian polvilho identities, cassava flour, cassava leaves, and cassava root. |
| `farine de manioc fermentée` | No result. |

After integration, `manioc flour` should return only `ingredient-ref-cassava-flour`; the broader `manioc` and `cassava` queries should retain their multi-result behavior. Do not add broad `manioc`, `cassava`, `cassava starch`, or process-qualified phrases as aliases.

## Recipe-corpus demand audit

All 114 recipe files in the current seed manifest and all 1,123 ingredient rows were scanned. The complete recipe JSON text was searched case-insensitively for `manioc flour`, `cassava flour`, `edible cassava flour`, `farine de manioc`, `farine comestible de manioc`, `fécule de manioc`, `manioc starch`, `tapioca flour`, `farine de tapioca`, `farine de manioc fermentée`, and `farine de manioc fumée`. **No recipe file or ingredient row matched any phrase, and no row links to `ingredient-ref-cassava-flour`.** The manifest-order corpus fingerprint (relative path + NUL + exact file bytes + NUL for each entry) is `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3`.

The bundled corpus supplies no direct demand, recipe link, quantity, or recipe-specific substitution evidence. This zero-hit result applies to the current bundled manifest only.

## English / Québec French evidence and limits

The bilingual naming basis is source-attested: the OQLF-hosted GDT page gives the Québec French headword `farine de manioc`, defines it as dry-ground manioc-root powder, and lists both `manioc flour` and `cassava flour` in English [S01]. Codex's French standard uses the existing canonical display `farine comestible de manioc` for a human-food product milled from dried cassava material [S02]. The current Canadian marketplace listing supplies a direct but product-specific English ingredient statement, `Manioc flour`, for its Kisabor `Toasted Cassava Flour` [S03].

Source limits matter: the GDT page credits AFNOR (1979), so it records a terminology equivalence but is not a new current OQLF ruling or a retail label. Codex establishes the food-product/process boundary and standardized French product name, but does not list `manioc flour` as its English label. Walmart's page is an online listing, was out of stock when checked, and says marketplace product information is not independently verified; it corroborates the wording in Canada but does not establish a universal label or a Québec-specific retail convention. The proposal accepts the narrow synonym with those limits and retains the canonical Codex display.

## Forms, measurements, and substitutions

- Keep the existing flour row's `defaultDensity: null`, `unitMappings: []`, and both ledger research states `not_yet_researched`.
- Add no ingredient form, package-yield rule, conversion, recipe link, portion, household measure, density, or numeric observation. The Codex moisture and quality criteria are product specifications; Walmart's 500 g figure is package net mass. Neither is a kitchen volume-to-mass mapping.
- Add no global or contextual substitution between cassava flour, tapioca/manioc starch, the two polvilho products, lafun, or any other flour. The naming sources do not test recipe interchangeability or give a reusable ratio. Toasted, fermented, and other process-qualified products remain outside this alias decision.

## Source register

All sources were accessed on 2026-10-12. These proposal-local IDs were not added as duplicate ledger sources during integration; root reused the already verified OQLF and Codex source records attached to the cassava-flour identity.

| ID | Source and bounded evidence | Limits |
|---|---|---|
| **WP02-B2-MANIOC-FLOUR-EN-ALIAS-20261012-S01** | Office québécois de la langue française, [*farine de manioc* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc). Defines the product as powder obtained by dry-grinding manioc roots and lists `manioc flour` and `cassava flour` as English terms. The entry credits AFNOR (1979). | Supports bilingual term equivalence and a whole-root flour class; not a current product specification or kitchen measure. The same source is already cited in the existing cassava-flour ledger record. |
| **WP02-B2-MANIOC-FLOUR-EN-ALIAS-20261012-S02** | Codex Alimentarius Commission, [*Norme du Codex pour la farine comestible de manioc*, CXS 176-1989](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B176-1989%252FCXS_176f.pdf), amended 2013. Defines edible cassava flour as dried cassava flakes or paste that is milled and sifted to separate fibre; sets `farine comestible de manioc` as the label name. | Product identity and process evidence; it does not name `manioc flour` as an English standard label and does not provide a household measure, density, or substitution ratio. |
| **WP02-B2-MANIOC-FLOUR-EN-ALIAS-20261012-S03** | Walmart Canada, [*Kisabor Toasted Cassava Flour*](https://www.walmart.ca/en/ip/Kisabor-Toasted-Cassava-Flour/6000203122420), 500 g listing. The product details state `Ingredients: Manioc flour`. | Canadian marketplace listing; it was out of stock when accessed and disclaims independent verification of seller-provided product details. Supports one product's English wording only, not general Québec usage or an alias for `toasted cassava flour`. |
| **WP02-B2-MANIOC-FLOUR-EN-ALIAS-20261012-S04** | Office québécois de la langue française, [*fécule de manioc* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc). Defines the wet-extracted product and gives the related English terms `manioc starch`, `cassava starch`, and `tapioca starch`; it marks `tapioca flour` obsolete. | Used only to maintain the flour/starch boundary; it is already present on the active tapioca-starch ledger record and does not support aliases for whole-root flour. |

## Integration result

Added only `manioc flour` to `ingredient-ref-cassava-flour.aliasesEn`, supported by the existing OQLF and Codex source records in the ledger. Preserved the active names, French alias, recipe corpus, forms, numeric fields, and substitution states. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`. See the [integration record](../batches/wp02-wp03-wp04-wp05-manioc-chiura-capelin-vernonia-integration-20261012/README.md).

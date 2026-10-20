# WP03 Section M: Sultana and dried-grape boundary

- **Reviewed:** 2026-10-09
- **Status:** proposal only; no shared catalog or data edit is proposed here.
- **Scope:** Sultana/Sultana raisins, golden raisins, raisins de Smyrne, the active generic dried-raisins row, and the already accepted dried-currants / raisins de Corinthe row. Dried tart cherries and Goji/wolfberry are outside this packet.
- **Sources accessed:** 2026-10-09. Canadian government procurement specifications and labelling guidance, Codex, OQLF, and current Canadian product listings were reviewed.

## Recommendation

Keep the active generic `ingredient-ref-raisins` row as the owner for unqualified raisins. Propose a separate, identity-only **named-product candidate** for Sultana raisins, with English display `Sultana raisins` and Québec French display `raisins sultana`, under `NUT_SEED_AND_DRIED_FRUIT`. This represents a marketed dried-grape type; it does not assert a particular grape cultivar or varietal equivalence. The candidate ID `ingredient-ref-sultana-raisins` is unused in the live references, ledger, and legacy candidate list.

The source-supported candidate alias is English `sultanas` on that new row. The display names already cover `Sultana raisins` and `raisins sultana`. Keep `golden raisin(s)`, `raisin(s) doré(s)`, and `raisin(s) de Smyrne` inactive. The federal procurement specification uses golden raisins and sultanas interchangeably, but the Codex labelling standard also uses “Golden” as an optional descriptor for bleached raisins. OQLF’s *raisin de Smyrne* entry spans botanical and food-fruit domains and discusses a grape variety used to make dried raisins. Those sources do not establish one unambiguous Québec retail meaning for either term across products.

Do not add Sultana aliases to the generic raisins row. Do not alter the active dried-currants identity. Keep recipe 102#7 linked to generic raisins: its wording does not identify Sultana or golden raisins. This is an identity-only proposal; it establishes no measurement, form, density, unit mapping, conversion, yield, substitution, or recipe link.

## Current live snapshot

Counts describe the worktree read on 2026-10-09. File hashes are SHA-256 over raw file bytes. The recipe-corpus hash is computed in manifest order over each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a NUL byte.

| Artifact | Live count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 643 references | `e983262f70b8195e83b50eb1b4a205ec0adab7eb3c193e1c31b8fba8f2e6ca18` |
| `ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 813 records; 1,360 source entries; 1,150 distinct source IDs (including unit-conversion source IDs) | `0f3b91d066acb2a4149b13e079deea12dd0235db403865d73fffb2c8ec2749c0` |
| `legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Manifest-listed recipe corpus | 114 recipes; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The proposal-local source-ID prefix is `WP03-RAISIN-BOUNDARY-20261009`. A repository-wide search before this packet was created found no existing use; the current occurrences are only the source IDs below. No proposed source ID is being added to the shared ledger.

## Live catalog, ledger, and legacy audit

| Current row | Live catalog state | Ledger state and decision |
|---|---|---|
| `ingredient-ref-raisins` | `raisins` / `raisins secs`; no aliases; category `NUT_SEED_AND_DRIED_FRUIT` | Identity `verified`; measurement `blocked_pending_evidence`; existing accepted decision retains dried raisins and keeps French `raisin` with fresh grapes. The ledger has one OQLF source entry for *raisin sec*. |
| `ingredient-ref-grapes` | `grapes` / `raisin`; no aliases; category `FRUIT` | Identity `verified`; OQLF source entry. Preserve the bare French name `raisin` on this fresh-grape row. |
| `ingredient-ref-dried-currants` | `dried currants` / `raisins de Corinthe séchés`; aliases EN `dried currant`, FR `raisin de Corinthe`; category `NUT_SEED_AND_DRIED_FRUIT` | Identity `verified`; measurement `not_yet_researched`; existing accepted decision keeps this as a separate dried Vitis product. Leave this accepted row and its aliases unchanged. |

The 86 legacy candidates contain no Sultana, golden-raisin, Smyrna-raisin, Corinth-raisin, or dried-currant candidate. The proposed `ingredient-ref-sultana-raisins` ID is absent from active references, ledger record IDs, and legacy candidate IDs. No matching ingredient form exists for these dried-grape identities.

The current dried-currant row is not an alias of generic raisins: Codex explicitly excludes dried currants from its raisins standard, while OQLF identifies the *currant* of genus *Vitis* as dried grapes and gives *raisin de Corinthe* as the Québec French term. Fresh black and red currants remain separate *Ribes* identities. This packet records that established boundary without reopening it.

## Candidate and source decisions

| Candidate or wording | Recommendation | Evidence and limit |
|---|---|---|
| New named product `ingredient-ref-sultana-raisins` | Propose identity-only row: EN `Sultana raisins`; FR-CA `raisins sultana`; category `NUT_SEED_AND_DRIED_FRUIT`. Candidate alias: EN `sultanas`. | The Canadian federal procurement specification names Sultana as a type of dried grape and says any grape kind may be used; Québec product records and labels use `Sultana raisins` / `raisins sultana` and distinguish the type from Thompson raisins. This supports a named dried product, not a fixed cultivar. [S01–S02, S06–S08] |
| Active generic `ingredient-ref-raisins` | Retain `raisins` / `raisins secs` with no new aliases. | OQLF gives *raisin sec* as the dried-grape term and lists Sultana among dried-raisin types. The single recipe demand is explicitly generic. A narrower Sultana term should not silently make the generic row mean only golden raisins. [S03, S09] |
| `sultana raisin` (singular), `raisin sultana` (singular) | Hold these aliases pending search-collision review. | The app’s bilingual search matches a query token inside a longer stored phrase. A singular alias containing `raisin` would also make a bare French `raisin` query return the Sultana row alongside fresh grapes. Current plural Québec retail wording `raisins sultana` avoids that singular token collision. [S07–S08; current search behavior in `IngredientSearch.kt`] |
| `golden raisin(s)` / `raisin(s) doré(s)` | Hold as aliases on both generic raisins and the Sultana candidate. | DND’s 2018 purchasing specification treats golden-coloured raisins and Sultanas as interchangeable in that procurement context. Codex says a meaningful name such as “Golden” may identify bleached raisins. Current product labels also use golden colour to describe Sultanas. This does not prove every “golden raisin” label identifies the same marketed type. [S01–S02, S04, S06] |
| `raisin(s) de Smyrne` | Hold as a dried-product alias. | The French DND specification calls a golden dried grape a *raisin de Smyrne*, but OQLF presents that term in both botanical and food-fruit domains and notes Smyrna varieties are used to prepare raisins secs. The term can name the grape type as well as appear in a dried-product specification; current Québec labels prefer *raisins sultana*. Do not map it to fresh grapes or dried raisins without clearer product-label evidence. [S02, S05, S08] |
| Accepted `ingredient-ref-dried-currants` / *raisins de Corinthe séchés* | Retain the existing distinct row and its current aliases exactly. | Federal product specifications and OQLF distinguish Corinth/Zante dried grapes from ordinary raisins; Codex excludes dried currants from the raisins standard. Do not merge with the proposed Sultana type, generic raisins, or fresh black/red currants. [S02–S04, S09] |

The current search is language-agnostic. If the proposed row is later integrated, a generic query `raisins` will also match the specific display `Sultana raisins` / `raisins sultana`; the coordinator should decide whether showing both generic and named-type results is acceptable. No search behavior is changed by this proposal.

## Recipe audit

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned using `originalText`, `ingredientName`, and `ingredientRefId` for raisin, Sultana, golden, Smyrna, Corinth, and currant terms.

| Recipe and line | Ingredient wording | Current reference | Decision |
|---|---|---|---|
| 102#7 | `2 tbsp raisins` | `ingredient-ref-raisins` | Retain the generic dried-raisin link. The text does not specify Sultana, golden, Smyrna, or Corinth. |

No bundled ingredient line names Sultana raisins, golden raisins, raisins de Smyrne, or dried currants. No recipe relinking is proposed.

## Source register

IDs below are local to this proposal, unique under the checked prefix, and were accessed 2026-10-09. The federal DND files are **Food Quality Specifications used for federal departmental purchasing**; this packet does not describe them as Canadian regulatory standards of identity. Retail records establish current market wording, not regulatory equivalence.

| ID | Source | Support used |
|---|---|---|
| WP03-RAISIN-BOUNDARY-20261009-S01 | Government of Canada, Department of National Defence, [Food Quality Specifications: Dried Fruits (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-eng.pdf) | Product table under raisins says Sultana refers to golden-coloured dried grapes, also called golden raisins; calls the terms interchangeable for this purchasing specification and says any grape kind may be used. It does not identify one required cultivar. |
| WP03-RAISIN-BOUNDARY-20261009-S02 | Ministère de la Défense nationale, [Spécifications sur la qualité des aliments : Fruits séchés (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-fra.pdf) | Uses *raisins secs*, *raisins sultana*, and *raisin de Smyrne* in its dried-raisins specification; says any grape type may produce Sultana and any golden raisin may be marketed as Sultana. Also has a separate *raisins de Corinthe séchés* product row. |
| WP03-RAISIN-BOUNDARY-20261009-S03 | OQLF, [raisin sec](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084076/raisin-sec) | Preferred French term *raisin sec*; English terms *dried raisin* and *raisin*. Lists Sultana among common dried-raisin types and discusses Corinth/Zante as a different small, dark, seedless type. Last updated 1990. |
| WP03-RAISIN-BOUNDARY-20261009-S04 | OQLF, [raisin de Corinthe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298833/raisin-de-corinthe) | Preferred Québec French *raisin de Corinthe*; English *dried currant* and *currant* in a note specifically about the *Vitis* genus. Last updated 1982. |
| WP03-RAISIN-BOUNDARY-20261009-S05 | OQLF, [raisin de Smyrne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297130/raisin-de-smyrne) | Preferred Québec French term; English *Sultana raisin* / *Sultana*; classifies the entry under botanical and food-fruit domains and notes Smyrna varieties are used to make raisins secs. Last updated 1990. |
| WP03-RAISIN-BOUNDARY-20261009-S06 | Codex Alimentarius, [Standard for Raisins CXS 67-1981](https://www.fao.org/input/download/standards/244/CXS_067e.pdf) | Covers dried *Vitis vinifera* grapes and excludes dried currants. Allows the product name *Sultanas* where used for certain raisin types; says *Golden* may identify bleached raisins. |
| WP03-RAISIN-BOUNDARY-20261009-S07 | CFIA, [Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) | General Canadian labelling rule: if no prescribed name applies, use a generally known or accurately descriptive common name; use an established subcategory when the broad category is too wide; avoid misleading names. This is context for keeping a named type explicit, not a raisin-specific standard. |
| WP03-RAISIN-BOUNDARY-20261009-S08 | Government of Québec, MAPAQ, [Premium Sultana Raisins — Québec Food Directory](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8208065) | Current Québec product record for “Premium Sultana Raisins,” categorized as prepared/processed fruit; product data comes from GS1 and was last updated 2026-09-28. Confirms retail product wording, not a universal identity rule. |
| WP03-RAISIN-BOUNDARY-20261009-S09 | PRANA Foods, [Organic Sultana Raisins (English)](https://pranafoods.ca/products/organic-sultana-raisins) and [Raisins sultana biologiques (French)](https://pranafoods.ca/fr/products/organic-sultana-raisins) | Current Canadian seller uses Sultana raisins / *raisins sultana* and distinguishes them from other raisin types and Thompson raisins. Its statement about interchangeability with Thompson is not treated here as a catalog substitution rule. |
| WP03-RAISIN-BOUNDARY-20261009-S10 | Tootsi, [Canada Catalogue 2026, dried-fruit page](https://tootsi.com/pdf/e-catalog-canada/files/basic-html/page52.html) | Canadian bilingual distributor catalogue lists Thompson, Sultana, California Flame, and Zante currant raisins as separate named products; gives *Raisins Sultana* and *Raisins de Corinthe zante*. Supports current market naming, not botanical equivalence. |

## No-shared-mutation statement

This research task created only this proposal packet. It did not edit catalog JSON, recipe files, the research ledger, legacy candidate list, catalog plan, roadmap, code, tests, or any existing proposal. All new source IDs are proposal-local and are not ledger entries.

## Coordinator disposition — 2026-10-09

Accepted `ingredient-ref-sultana-raisins` as `sultana raisins / raisins sultana`, with only the English alias `sultanas`. The catalog and ledger now record this as an identity-only named dried-grape product; generic raisins and dried currants remain separate. Golden-raisin and `raisin de Smyrne` terms remain unassigned because the evidence describes context-dependent label and product usage. A broad `raisins` query may return both generic and specific rows, which is intentional. No recipe link, form, measurement, yield, conversion, or substitution was added. See `docs/catalog/batches/wp03-wp04-sultana-agaricus-shrimp-followup-20261009/README.md`.

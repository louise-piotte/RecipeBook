# WP04 Section P — Atlantic mackerel `maquereau bleu` alias review (R304)

- **Review and source-access date:** 2026-10-16.
- **Recommendation:** Add the exact French search alias `maquereau bleu` to the existing `ingredient-ref-atlantic-mackerel` reference only. Keep its displayed bilingual names `maquereau de l’Atlantique / Atlantic mackerel` and its *Scomber scombrus* scope unchanged.
- **Scope:** One Québec-facing alternate-name review. No new identity, English alias, form, measurement, conversion, yield, substitution, recipe link, or legacy mapping is proposed.
- **Proposal-only status:** This file is the only proposed artifact. Shared references, forms, research ledger, plan, roadmap, generated catalog, recipe files, and batch history are unchanged. No tests or emulator checks were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-MACKEREL-BLEU-R304-20261016-S01` and `S02`; `R01` is a proposal-local repository audit label. Reused evidence is identified by its existing shared-ledger ID below.

## Why this is an open gap

The active `ingredient-ref-atlantic-mackerel` row already scopes *Scomber scombrus* and displays `maquereau de l’Atlantique / Atlantic mackerel`, but both alias lists are empty. The exact phrase `maquereau bleu` has no exact owner in current reference names or aliases, forms, legacy candidates, or ledger record IDs/text. No prior Section P proposal or batch makes a focused decision about that phrase. The existing mackerel reviews cover other boundaries: the horse-mackerel/chinchard hold (R157), smoked-mackerel product (R167), and canned-mackerel product (R176). This proposal does not reopen them.

The recent R238, R248, R250–R252, R256, R260, R271, R274, R277, and R280 reviews concern other species, products, or picker holds. None allocates `maquereau bleu`. The Section P fish checklist remains open for further bounded work.

## Québec terminology and taxon evidence

DFO’s French fish-identification guide has a *Scomber scombrus* entry headed **MAQUEREAU BLEU** and gives **atlantic mackerel** as the English equivalent. Its adjacent text discusses the fish as food and commercial fresh, frozen, smoked, and canned product. This is direct bilingual species/name evidence, although the guide is older. [S02]

DFO’s 2022 integrated fisheries management plan is titled **Maquereau Bleu – En vigueur à partir de 2022**; its foreword and biology section identify the managed fish as *Scomber scombrus*. This confirms continued use of the phrase in an official Atlantic-Canadian context, but it is a fisheries-plan title, not a consumer label. [S01]

The existing 2024 DFO rebuilding-plan evidence uses **maquereau de l’Atlantique** with *S. scombrus*. OQLF’s existing GDT entry treats **maquereau** as the preferred general term, translates it as *mackerel / Atlantic mackerel*, and gives *Scomber* sp.; it does not identify `maquereau bleu` as its preferred Québec term. Keep the active display unchanged and treat `maquereau bleu` only as a source-attested search alias. [reused S03–S04]

## Exact recommendation and boundaries

| Catalog field or term | Recommendation |
|---|---|
| `ingredient-ref-atlantic-mackerel` | Add `maquereau bleu` to `aliasesFr`. The exact search phrase then resolves to the existing *Scomber scombrus* reference. |
| `nameFr` / `nameEn` | Preserve `maquereau de l’Atlantique` / `Atlantic mackerel` as the displayed names. |
| English alias | Add none. DFO’s bilingual fish guide gives `Atlantic mackerel`, not a literal English translation `blue mackerel`. |
| Unqualified `maquereau` / `mackerel` | Do not assign either as an alias. Current species and product results remain broad and multi-result. |
| Other mackerel references | Do not add the alias to Pacific, smoked, or canned mackerel. Keep their distinct species/product boundaries unchanged. |
| Horse mackerel / chinchard | Leave the R157 unresolved market-name and species boundary unchanged. |
| Forms, measures, conversions, yields, substitutions | Add none. The Atlantic-mackerel reference has no attached forms; its ledger still marks measurement and substitution research `not_yet_researched`. |

This recommendation is a name alias only. DFO’s product descriptions in the older guide do not establish which forms belong in this app’s form model, recipe quantities, yields, or substitutions.

## Exact-key ownership and picker projection

The read-only audit followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercasing, Unicode/accent folding, punctuation-to-space normalization, complete-word-phrase matching first, then substring fallback. It checked the live bilingual references and aliases, forms and match terms, legacy candidates, ledger, proposals, and batch archive. `maquereau bleu` is currently unowned by those catalog layers; the current Atlantic-mackerel row has no aliases or forms.

The table compares current picker results with an in-memory projection that adds only `maquereau bleu` to the Atlantic row. It is a static query projection, not a software test or a shared-data change.

| Query | Current result | Projected result | Boundary |
|---|---|---|---|
| `maquereau bleu` | None | Atlantic mackerel only | Exact phrase reaches the already verified *S. scombrus* row. |
| `maquereau de l’Atlantique` | Atlantic mackerel | Same | Display name is unchanged. |
| `maquereau` | Atlantic mackerel, canned mackerel, Pacific mackerel, smoked mackerel, and gooseberry / groseille à maquereau | Same five | No generic species or product ownership is introduced. |
| `maquereau du Pacifique` | Pacific mackerel only | Same | Species-qualified Pacific result remains isolated. |
| `mackerel` | Atlantic, canned, narrow-barred Spanish, Pacific, smoked, and spotted Spanish mackerel | Same six | No English alias broadens or narrows the family-word query. |
| `bleu` | Five current results: blue cheese, blue corn kernels, blue crab, and two Blue Menu oatmeal products | Those five plus Atlantic mackerel | Expected short-token expansion from the alias; reviewer should consider this picker cost. |
| `blue mackerel`; `maquereau tacheté`; `horse mackerel` | None | None | No unsupported English translation, spotted-mackerel term, or horse-mackerel synonym is added. |

Adding an alias phrase exposes its word `bleu` to the picker’s normal single-token matching. The broader query will therefore gain one result. If the picker should not return the Atlantic row for a short `bleu` search, the current alias model has no phrase-only flag; leave the alias out rather than adding a workaround or another identity.

## Recipe-corpus demand

The manifest-ordered audit covered all **114 bundled recipe files** and searched complete recipe text for `maquereau bleu`, `maquereau de l’Atlantique`, `Atlantic mackerel`, and *Scomber scombrus*. It found zero hits. No recipe ingredient row or text supplies a reason to add a recipe link or infer a form, quantity, or substitution. [R01]

## Source ownership and register

The exact proposed source IDs S01–S02 and audit ID R01 were absent from the shared ledger and Section P proposal/batch archive at review time. S01’s URL was also absent there. The S02 DFO guide URL is already cited elsewhere in the ledger/archive for unrelated species entries; the proposal uses its separate Atlantic-mackerel entry and printed-page locator, and does not create a ledger record. Existing Atlantic-mackerel ledger sources S03–S04 are reused by their current IDs, with no duplicate IDs or entries proposed.

| Source ID | Source | Claim and limit |
|---|---|---|
| **WP04-SECTIONP-MACKEREL-BLEU-R304-20261016-S01** | Fisheries and Oceans Canada, [Maquereau Bleu — Integrated Fisheries Management Plan, in force from 2022](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/mackerel-atl-maquereau/mac-atl-maq-2022-fra.html), accessed 2026-10-16. | The title uses `Maquereau Bleu`; the foreword identifies the fish as *Scomber scombrus L.* Atlantic fisheries context. Not a consumer label or an OQLF terminology ruling. |
| **WP04-SECTIONP-MACKEREL-BLEU-R304-20261016-S02** | Fisheries and Oceans Canada, [French fish-identification guide, “MAQUEREAU BLEU” entry](https://waves-vagues.dfo-mpo.gc.ca/Library/24740v.3fre.pdf), printed p. 32, accessed 2026-10-16. | The entry pairs `MAQUEREAU BLEU` and *Scomber scombrus* with English `atlantic mackerel`. The guide also describes historical commercial uses; it does not establish current retail availability or app forms. The URL is shared with other species citations, but this page-specific proposal ID is new and local. |
| **Reused: `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S09`** | Fisheries and Oceans Canada, [2024 Atlantic mackerel rebuilding plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/mackerel-atl-maquereau/mac-atl-maq-2024-fra.html), already registered on `ingredient-ref-atlantic-mackerel`. | Confirms the active display `maquereau de l’Atlantique` with *S. scombrus*. Reused, not duplicated. |
| **Reused: `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S07`** | OQLF GDT, [maquereau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198842/maquereau), already registered on `ingredient-ref-atlantic-mackerel`. | Preferred general term, English translations, and *Scomber* sp. Supports keeping the broader term unqualified; it does not attest `maquereau bleu`. Reused, not duplicated. |
| **WP04-SECTIONP-MACKEREL-BLEU-R304-20261016-R01** | Read-only audit of current references, forms, [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), Section P proposals/batches, `IngredientSearch.kt`, and manifest-listed recipes. | Records exact-key/source-ID ownership checks, static picker projection, and the zero-hit recipe scan. Repository evidence only; proposal-local ID, not a ledger source. |

## Final disposition

**Recommend** one French search alias, `maquereau bleu`, on the existing Atlantic mackerel (*Scomber scombrus*) reference, subject to review of the disclosed `bleu` one-word picker expansion. Preserve `maquereau de l’Atlantique / Atlantic mackerel` as the display, retain the current generic mackerel and product boundaries, and add no other catalog behavior. No tests were run.

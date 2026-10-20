# WP04 Section P — langoustine / scampi identity boundary review

- **Review and source access date:** 2026-10-12.
- **Scope:** the held `ingredient-ref-langoustine` candidate; exact-key ownership across active references, forms, and legacy imports; current Canadian and Québec consumer/product naming; and all manifest-listed recipes.
- **Recommendation:** promote the existing candidate to one identity-only `PROTEIN` reference for unqualified culinary **langoustine / scampi**, with French `langoustine`, English `scampi`, and the directly evidenced French plural `langoustines` as a search alias. Keep species-specific names, related crustaceans, and product presentations outside this identity.
- **Proposal status:** Integrated. Root promoted the held candidate in place, added its bilingual identity to the active catalog, and recorded the seven proposal sources and accepted decision on the existing ledger record. No manifest or recipe changed. No tests or emulator checks were run for this database-JSON-only update.

## Recommendation

Current Canadian evidence supports an unqualified culinary identity named `langoustine` in French and `scampi` in English. The CFIA Fish List uses French `Langoustine` and English `Scampi` for *Nephrops norvegicus* and four listed *Metanephrops* species. A Canadian supplier based in Montréal markets *M. thomsoni*, *M. rubellus*, and *N. norvegicus* under one `Langoustines` product category. Current Québec and Ontario sellers also use `langoustine(s)` and `scampi` for products sold to consumers. This supports a broad, species-unspecified ingredient identity for the named culinary class without choosing one species.

Promote the existing `ingredient-ref-langoustine` candidate, preserving its record ID. A minimal reference would use `nameFr: "langoustine"`, `nameEn: "scampi"`, category `PROTEIN`, `aliasesFr: ["langoustines"]`, and no English aliases. Keep measurement and substitution research `not_yet_researched`. Add no recipe link, form, density, unit mapping, conversion, package yield, or substitution.

The English `scampi` label is supported by the English terms in OQLF and by CFIA species rows. Do **not** add French `scampi` as an alias: OQLF says that in French it names langoustine only when prepared as a dish. `langoustine` itself is a directly supported English retail term as well, and remains searchable through the French display name; no second English alias is needed.

## Existing catalog and ledger state at proposal review

| Record | Current state | Boundary retained |
|---|---|---|
| `ingredient-ref-langoustine` | Ledger candidate; `identityState: needs_clarification`; one existing source (`WP04-MOLLUSKS-20261009-S05`); measurement and substitution research are `not_yet_researched`. | Not present as an active reference in `ingredient-references.v1.json`; there is no active langoustine form. The existing candidate holds OQLF's Québec term and species note. |
| Other active or legacy owners | No exact owner for the proposed normalized keys in active references, forms, or legacy-import candidates. | Keep langouste, homard/lobster, écrevisse/crayfish, shrimp/prawn, and unqualified generic seafood separately scoped. Their checklist or reference state is not altered here. |

The candidate's current ledger decision says to hold pending recipe demand and to keep langoustine distinct from langouste, shrimp/prawn, lobster, and unqualified scampi. New species-linked regulatory and current market evidence now supports a bounded species-unspecified consumer identity; it does not support expanding the alias set to those related names.

## Species and product boundary

| Scope | Evidence | Decision for this identity |
|---|---|---|
| **Langoustine / scampi** | The CFIA Fish List applies `Scampi / Langoustine` to *Metanephrops challengeri*, *M. rubellus*, *M. sagamiensis*, and *M. thomsoni*. Its *Nephrops norvegicus* rows include `Deep Sea Lobster / Langoustine`, `Scampi`, `Dublin Bay Prawn`, and `Norway Lobster`. OQLF places the edible crustacean term in Nephropidae and lists the corresponding English names. | Use one species-unspecified culinary reference for the listed langoustine/scampi class. The record does not assert that a recipe product contains any particular species. [S01; reused `WP04-MOLLUSKS-20261009-S05`] |
| **Species-named sales products** | Pearlmark separately identifies *M. thomsoni*, *M. rubellus* (Brazil), and *N. norvegicus* (Netherlands), all under its langoustine product family, and serves Québec and other Canadian regions. | Species are evidence that the consumer category spans taxa, not aliases or cultivar-like forms. Keep Latin names and regional species product names out of the generic identity. [S03] |
| **Norway lobster / Dublin Bay prawn** | CFIA lists these English common names on the *N. norvegicus* row. DFO's Canada–U.S. seafood trade report also identifies the langoustine it discusses as *N. norvegicus* and distinguishes it from Homarus lobster and Palinuridae langouste. | Do not add these as global aliases: they are species-scoped and would cross the separate lobster and prawn boundaries. [S01, S02] |
| **Langouste / homard / lobster** | OQLF says langoustine is not a small langouste. It describes a resemblance to a small homard, which is not an identity equivalence. | No cross-aliases to spiny lobster (`langouste`) or clawed lobster (`homard` / `lobster`). [reused `WP04-MOLLUSKS-20261009-S05`; reused `WP04-MOLLUSKS-20261009-S02`–`S03`] |
| **Fresh, frozen, whole, tails, butterfly-cut, and size-marked packs** | Current Québec listings include frozen butterfly-cut tails sold by pack weight and count range; a Montréal seafood shop separately offers whole products and tails; an Ontario seller lists frozen whole langoustines. | These are seller-specific presentations. Add no form, preparation alias, numeric behavior, conversion, density, or yield. [S03–S06] |
| **Prepared scampi dish** | OQLF's usage note says French `scampi` names the langoustine only when prepared as a dish. | `scampi` is the English display term based on the English OQLF/CFIA names. Do not add French `scampi` as an ingredient alias or merge a prepared-dish recipe with this identity. [reused `WP04-MOLLUSKS-20261009-S05`] |

This is a consumer identity only. The CFIA Fish List is a common-name reference keyed to species and does not establish recipe amounts or forms. The DFO trade report is historical (2019 trade data) and is used only to anchor its named *N. norvegicus* example, not to claim current Canadian supply. Current product evidence establishes that Canadian sellers use the category, but does not make their cuts or counts global catalog forms.

## Exact-key ownership and search behavior

The exact-key audit follows `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase; NFKD; fold ligatures, `ß`, and `&`; remove combining marks; replace punctuation with spaces; and collapse whitespace. Active reference names and aliases, form labels and match terms, and legacy-import candidate names and aliases were checked in the live files.

| Normalized exact key | Current owner in this snapshot |
|---|---|
| `langoustine`, `langoustines` | None in active reference, form, or legacy-import data. `ingredient-ref-langoustine` is only a held ledger candidate. |
| `scampi` | None in active reference, form, or legacy-import data. Proposed only as the English display name; not as a French alias. |
| `norway lobster`, `dublin bay prawn` | None in active reference, form, or legacy-import data. These species-scoped names are not proposed as aliases. |
| `langouste`, `homard`, `lobster`, `crayfish`, `shrimp`, `prawn` | No exact owner in the audited reference/form/legacy files at this snapshot. These are neighboring terms and remain outside this proposal; no one is added as an alias. |

No partial-match collision was found for the proposed `langoustine`, `langoustines`, or `scampi` keys. The exact-key result is separate from the fact that future species-specific search phrases may contain one of these words.

## Complete bundled-recipe audit

All **114** recipe paths in the current `manifest.v1.json`, their **1,123** ingredient rows, and every full recipe JSON file were scanned for `langoustine(s)`, `langouste(s)`, `scampi`, `Nephrops`, `Metanephrops`, `Norway lobster`, `Dublin Bay prawn`, and `langostino`. There are **zero** target ingredient-row hits and **zero** full-file hits.

| Recipe / row | Source text | Interpretation |
|---|---|---|
| 093#4 | `Cooked meat or seafood, to taste` | Generic optional choice; it does not request langoustine, scampi, or any species. Do not link it to this identity. |
| 019 | `1 lb jumbo lump crab meat` | Recipe-specific crab-meat grade; unrelated to langoustine. Its title `Crab Balls` does not create additional seafood demand. |
| 023 | `140 g sliced calamari` | Existing squid/calamari identity; not langoustine or demand for another seafood. |

No recipe link, ingredient relink, or form is proposed.

## Refreshed package, ledger, generated-catalog, and corpus snapshot

Proposal-review snapshot read from the live shared worktree on **2026-10-12**. Hashes cover exact file bytes. The recipe-corpus digest sorts manifest-listed recipe basenames and hashes each basename, a NUL byte, exact recipe-file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,221 references | `dbbbae79b74064e4989ab0057e304598595895fa7ab14735a07720517dd055c0` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,522 records; 5,156 source entries; 4,219 distinct source IDs | `a44a10bc8ec6c16f0fa0a47d0def0101025d59f89ca7af0faf687039c17e84f0` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `b70a826e18497a37ce343f6c98cafa143d573dd59704ea6022bb034b2640e5a2` |
| `BundledIngredientCatalog.kt` | 1,221 generated references | `f555aa8491addb6d95be3e6256c21a3b90d50d30af2561c8d242d6189e38bcff` |

## Sources

All proposal-local sources below were accessed on 2026-10-12. IDs `WP04-LANGOUSTINE-IDENTITY-20261012-S01` through `S07` were checked for absence from the shared ledger and existing `docs/catalog` proposals/batches before assignment. Reused ledger sources retain their existing IDs and are not reissued here.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-LANGOUSTINE-IDENTITY-20261012-S01** | CFIA, [Fish List lookup for French “Langoustine”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=f&q=Langoustine) | Lookup on French `Langoustine` returns species-linked rows for *Metanephrops challengeri*, *M. rubellus*, *M. sagamiensis*, *M. thomsoni*, and *Nephrops norvegicus*. The first four pair English `Scampi` with French `Langoustine`; *N. norvegicus* also has `Scampi`, `Dublin Bay Prawn`, and `Norway Lobster`. The Fish List is a species common-name resource (modified 2023-09-18), not a recipe taxonomy. |
| **WP04-LANGOUSTINE-IDENTITY-20261012-S02** | Fisheries and Oceans Canada, [Canada–U.S. fish and seafood trade, 2019](https://waves-vagues.dfo-mpo.gc.ca/Library/40966422.pdf) | In the discussion of Homarus lobster, langouste, and langoustine, this 2021 DFO report identifies its langoustine as *Nephrops norvegicus* and says it is sold separately, mainly in the EU. It is historical trade context, not evidence of current Canadian retail availability or an all-species definition. |
| **WP04-LANGOUSTINE-IDENTITY-20261012-S03** | Aliments Pearlmark, [Langoustines](https://www.pearlmarkfoods.com/fr/nos-produits/langoustines) | Current Canadian food-service supplier page presents *M. thomsoni* as `Langoustines`, lists Chinese-origin butterfly-cut tails in count ranges, and links the same category to Brazil's *M. rubellus* and Netherlands' *N. norvegicus*. It establishes a Canadian sales category across named taxa; pack and size data are not global forms. |
| **WP04-LANGOUSTINE-IDENTITY-20261012-S04** | Mayrand, [Queues de langoustines coupe papillon surgelées 26/30](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/fruits-de-mer-divers-surgeles/queues-de-langoustine-2630-surgelees-pearlmark-17004) | Current Québec consumer-facing listing identifies a 454 g frozen Pearlmark butterfly-tail package and SKU 17004. It supports Québec market wording and a specific package, not a species or general tail form. |
| **WP04-LANGOUSTINE-IDENTITY-20261012-S05** | Poissonnerie La Mer (Montréal), [Langoustines / Scampi products](https://www.lamer.ca/en/collections/langoustines) | Current Montréal shop uses the category `Langoustines`, product titles `Scampi`, and separately offers whole and tail products from different origins. Retail stock and origin vary; no single form or species is inferred. |
| **WP04-LANGOUSTINE-IDENTITY-20261012-S06** | Daily Seafood (Toronto), [Scampi Whole Langoustines Jumbo 6/9](https://shop.dailyseafood.ca/products/67f54017ec75c6002d29d834/scampi-whole-langoustines-1520-1x3kg) | Current Ontario retail listing calls the frozen 3 kg product `Scampi Whole Langoustines`, states Scotland origin, and describes langoustine as also known as scampi, Norway lobster, or Dublin Bay prawn. This is vendor product language and does not establish a generic species assignment. |
| **WP04-LANGOUSTINE-IDENTITY-20261012-S07** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Current guidance says Fish List names are acceptable common names and their use is recommended; it also connects common-name guidance with species-specific labels. This supports following the Fish List's English/French language fields, not extrapolating product forms. |

Reused ledger sources: `WP04-MOLLUSKS-20261009-S05` (OQLF, [langoustine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198632/langoustine)); `WP04-MOLLUSKS-20261009-S02` (OQLF, [homard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198631/homard)); `WP04-MOLLUSKS-20261009-S03` (OQLF, [langouste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198630/langouste)); and `WP04-FINFISH-ID-20261009-S06` (CFIA, [guidance on determining Canadian fish common names](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names)).

## Remaining Section P gaps

This proposal resolves no shared data and addresses only the langoustine/scampi identity. The live Section P materials retain separate work for generic crab beyond the crab-meat/Jumbo Lump identity; generic lobster and crayfish; generic mussel beyond blue mussel; fresh oyster; generic/fresh scallop beyond dried scallop; unqualified cockle/coque and eel; generic hake/pollock and bare `goberge`; and preserved-seafood product-state questions. The clam hold has its own reconciled review. Roe, fish powders, fish balls/surimi, regional aquatic foods, and measurement/substitution research remain separate. The accepted squid/calamari, cuttlefish/seiche, octopus/pieuvre, and crab-meat/Jumbo Lump decisions are not reopened here.

No tests or emulator checks were run because the integration only added database JSON data and its generated index. See the integration status and batch README below.

## Integration status

- Promoted `ingredient-ref-langoustine` in place to a verified identity-only `PROTEIN` reference:
  French `langoustine`, English `scampi`, and French plural alias `langoustines`.
- Added the seven proposal sources and accepted decision to the existing ledger record; retained the
  original OQLF source and candidate record ID.
- No recipe link, form, measurement, conversion, yield, or substitution changed. No tests or emulator
  checks were run because the change only adds database JSON data and its generated index.
- See `../batches/wp02-wp03-wp04-jowar-poha-langoustine-integration-20261012/README.md`.

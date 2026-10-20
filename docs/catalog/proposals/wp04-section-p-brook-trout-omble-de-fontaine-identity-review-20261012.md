# WP04 Section P — brook trout / omble de fontaine identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** species identity, Québec naming, picker-boundary, ownership, and recipe-demand review.
- **Disposition:** Accepted and integrated as identity-only `ingredient-ref-brook-trout`; see the batch README.
- **Scope:** The accepted decision is recorded in the catalog JSON, ledger, plan, roadmap, generated index, and batch README. No forms or recipe data changed. No app tests or emulator checks were run.

## Proposed identity and bounded decision

| Candidate ID | Category | English display | fr-CA display | English search aliases | French search aliases | Taxon |
|---|---|---|---|---|---|---|
| `ingredient-ref-brook-trout` | `PROTEIN` | **brook trout** | **omble de fontaine** | `brook charr`; `speckled trout` | `truite mouchetée`* | *Salvelinus fontinalis* |

\* `truite mouchetée` is proposed only as an internal picker/search alias. Keep `omble de fontaine` as the sole French display. OQLF says that `truite mouchetée`, along with `saumon de fontaine`, `truite saumonée`, and `truite rouge`, was not retained for Québec fish-product marketing. The alias lets a recipe author find the normalized identity without using the non-normalized phrase as a displayed product name [S01–S02].

The proposed English display and Québec French display both identify the same species. The Québec government lists brook trout as a food-market aquaculture species, which supports an edible-fish identity, but does not establish a currently stocked retail item or the availability of a particular product [S02]. This is one species identity, not a generic trout row, cut, preservation state, ecological-form selection, or recipe-specific fish.

## Taxonomy, names, and phrase boundary

- Scope the identity to *Salvelinus fontinalis*. OQLF pairs `omble de fontaine`, `brook trout`, and this taxon in its edible-fish and ichthyology domains; the Québec species profile and CFIA Fish List independently give the same bilingual name and taxon [S01–S02, S04].
- Keep it distinct from the active *Salvelinus namaycush* lake trout / `touladi`, *Oncorhynchus mykiss* rainbow trout / `truite arc-en-ciel`, and *Salvelinus alpinus* Arctic char / `omble chevalier`. Québec’s species page lists those as similar species, not synonyms [S02]. The source evidence does not establish recipe interchangeability among them.
- Use `brook charr` and `speckled trout` only as English search aliases. The Québec government lists both as alternate names; OQLF and CFIA also list `speckled trout` for this taxon [S01–S02, S04]. Do not add unqualified `trout`, `truite`, `char`, `charr`, or `omble` as aliases. These are broad words, and the Fish List applies `Trout` to multiple species [S04].
- The French picker currently returns only rainbow trout for the broad query `truite`. The proposed search-only alias `truite mouchetée`, which the Québec government lists for *S. fontinalis*, would make that broad query return both rainbow and brook trout. The displayed result remains `omble de fontaine`; the alias is not a Québec commercial product name [S01–S02].
- Do not add `truite de mer`, `sea trout`, `omble de fontaine anadrome`, or other sea-run phrasing as a general alias or separate species. OQLF’s 2026 entry scopes these to a migratory form of *S. fontinalis* and cautions that `truite de mer` is also used for migratory forms of other salmonids [S03]. The ingredient corpus does not request an anadromous product.
- Do not use `saumon de fontaine`, `truite saumonée`, or `truite rouge` as aliases; OQLF specifically notes that those French names were not retained for Québec fish-product marketing [S01]. Do not add the binomial as a picker alias; retain it as identity evidence.

## Prior work and Section P fit

Section P remains open for named finfish and regional fish. Existing work covers the separate lake-trout, rainbow-trout, and Arctic-char identities, plus recent species/product reviews such as Atlantic wolffish, cusk, Pacific perch, gilthead bream, bluefish, and other named fish. The lake-trout review mentions brook trout only as a distinct sibling species; it does not allocate `ingredient-ref-brook-trout`, examine its Québec name or alias scope, or recommend a brook-trout row. A scan of the current Section P proposal and batch files found no dedicated brook-trout / omble-de-fontaine review or integration.

This proposal does not reopen the gilthead-bream picker hold, the generic trout boundary, or any other species or product decision. It proposes one species-specific identity with query aliases that remain bounded to *S. fontinalis*.

## Pre-integration exact active, form, legacy, and ledger ownership audit

Snapshot read from the live worktree before integration on 2026-10-12. Hashes cover exact bytes. The manifest-ordered recipe fingerprint hashes each manifest-relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte. Later unrelated catalog additions changed the active catalog and ledger snapshots; the exact candidate ownership result was unchanged.

| Artifact | Current count / state | SHA-256 or digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,260 references | `f0e0f496d79abedf2e4ff0409cdc0acaaad389f6b08161ece4c6180d68185434` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,569 records; 5,502 source entries; 4,540 distinct source IDs | `5c551e67598cbefed66d9cbbb98bba869e5cb62c627df58fc5ab01f576ab9c13` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The active/form/legacy exact-key audit mirrors `normalizeIngredientSearchKey`: lowercase; Unicode NFKD; fold `œ`, `æ`, `ß`, and `&`; remove combining marks; replace punctuation with spaces; and collapse whitespace. It checked exact normalized values across active reference displays and aliases, form labels and match terms, and legacy candidate names and aliases. The ledger audit separately checked the candidate IDs and literal candidate phrases/binomial in all record IDs and serialized record contents.

| Candidate key or ID | Exact current owner | Result |
|---|---|---|
| `brook trout`, `brook charr`, `speckled trout`, `omble de fontaine`, `truite mouchetée`, and *Salvelinus fontinalis* | None in active references, forms, or legacy names/aliases. | No exact phrase collision; the proposed display pair and search aliases are unowned. |
| `ingredient-ref-brook-trout` | No active reference ID or ledger record ID. | Available as the proposed stable identity ID. |
| `ingredient-form-brook-trout` | No current form ID; no form labels or match terms name the candidate. | No form exists or is proposed. |
| `candidate-brook-trout` | No legacy candidate ID. | There is no candidate record to promote. |
| Brook-trout phrases or *S. fontinalis* in the evidence ledger | No record ID or exact text match. | No dedicated identity or source decision is already recorded. Broad `trout`, `truite`, `omble`, `char`, and `charr` tokens occur in other fish-family evidence and are not claimed here. |

For picker context, the active sibling references are `ingredient-ref-lake-trout` (`lake trout / touladi`, alias `lake charr`), `ingredient-ref-rainbow-trout` (`rainbow trout / truite arc-en-ciel`), and `ingredient-ref-arctic-char` (`Arctic char / omble chevalier`, alias `Arctic charr`). Their exact names remain assigned to those separate rows. The source IDs `WP04-P-BROOK-TROUT-20261012-S01` through `S04` were checked against all ledger source IDs and existing catalog Markdown files before integration, then migrated to the accepted ledger record.

## Picker boundary simulation

The existing search folds accents and punctuation, then matches complete word phrases across displays, aliases, and forms. A static term simulation against the live active rows gives the following result; the “after” column adds only the proposed identity and search aliases.

| Query | Current result | After proposal |
|---|---|---|
| `brook trout`, `omble de fontaine`, `brook charr`, `speckled trout` | No result | Brook trout only |
| `trout` | Lake trout; rainbow trout | Lake trout; rainbow trout; brook trout |
| `truite` | Rainbow trout only | Rainbow trout; brook trout |
| `omble` | Arctic char | Arctic char; brook trout |
| `charr` | Arctic char; lake trout | Arctic char; lake trout; brook trout |
| `truite de mer` | No result | No result |

The no-alias boundary for bare `trout`, `truite`, `omble`, `char`, and `charr` is intentional. Those queries can match the species-qualified displays or alternate names but do not become a single generic ingredient. The French search alias is specifically the source-attested `truite mouchetée`; it does not turn `truite de mer` into a synonym or imply the marine ecotype.

## Full recipe-demand audit

All 114 files listed by `manifest.v1.json` and all 1,123 ingredient rows were parsed. The audit checked ingredient names, original line text, reference/form identifiers, localized strings, and other parsed recipe text for whole-word normalized phrases: `brook trout`, `brook charr`, `speckled trout`, *Salvelinus fontinalis*, `omble de fontaine`, `truite mouchetée`, the other French variants above, and the broad tokens `trout`, `truite`, `omble`, `char`, and `charr`.

**Result: zero matching ingredient rows and zero matching recipe files.** The bundled corpus supplies no recipe link, product state, form, portion, count-to-mass basis, measurement, or substitution for brook trout. Existing broad salmon, tuna, seafood, and fish-sauce lines do not select *S. fontinalis* and should not be relinked.

## Source limits, measurements, forms, and substitutions

- **Québec French:** OQLF’s preferred normalized edible-fish term is `omble de fontaine`; its exact species and English pairing are strong identity evidence. The entry was last updated in 2011. Its commercial-potential statement is not proof of present retail supply [S01].
- **Current Québec context:** the Québec species page was updated 2026-10-02. It provides the English/French/scientific-name trio, lists brook charr and speckled trout among other names, says the species is farmed for stocking or food markets, and distinguishes it from rainbow trout, touladi, and omble chevalier [S02]. It does not identify a current SKU, market form, or recipe product. Its biological length and weight observations are not kitchen quantities, edible yields, or standard fish/fillet counts.
- **Canadian naming:** CFIA’s Fish List gives TSN 162003, *S. fontinalis*, `Brook Trout / Omble De Fontaine`, and separate English `Speckled Trout` and `Trout` rows. It also applies `Trout` to other taxa. The list was last modified 2023-09-18; it is a Canadian fish-label naming source, not a culinary equivalence standard [S04].
- **Anadromous boundary:** OQLF’s current 2026 entry treats anadromous brook trout as a migratory form of the same taxon and notes that `truite de mer` may refer to other salmonid migration forms. That does not support a separate ingredient identity, a generic `sea trout` alias, or a culinary form [S03].
- **Numeric and product limits:** add no default density, unit mapping, portion, fillet count, package amount/yield, edible fraction, cooking yield, conversion, or source-specific recipe measurement. No fish-size or body-weight value in the biological profile can stand in for those quantities.
- **Form and substitution limits:** add no fresh/frozen, whole/fillet, skin/bone, raw/cooked, smoked/canned, resident/anadromous, or other ingredient form without recipe/product evidence. Add no global conversion or substitution to lake trout, rainbow trout, Arctic char, salmon, or generic fish; these sources establish names and taxonomy, not recipe interchangeability or food-safety equivalence.

## Integration outcome

Added `ingredient-ref-brook-trout` in `PROTEIN` with English display `brook trout`, Québec French display `omble de fontaine`, English search aliases `brook charr` and `speckled trout`, and French search alias `truite mouchetée` only. The French display remains OQLF-normalized; the non-normalized French term is searchable but is not shown as the product name. Scoped the row to *Salvelinus fontinalis*, with null density and empty unit mappings. No form, measurement, yield, recipe link, conversion, or substitution was added. Section P remains open. See `docs/catalog/batches/wp04-section-p-brook-trout-identity-integration-20261012/README.md`.

## Sources

Sources were accessed on 2026-10-12. These IDs were proposal-local during review and are now recorded on the accepted `ingredient-ref-brook-trout` ledger record.

| Source ID | Primary source | Evidence and limits |
|---|---|---|
| **WP04-P-BROOK-TROUT-20261012-S01** | OQLF, [omble de fontaine, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198650/omble-de-fontaine) | Edible-fish/ichthyology term; normalized Québec `omble de fontaine`; English `brook trout`; Latin *Salvelinus fontinalis*. Distinguishes freshwater and marine forms and records that `truite mouchetée`, `saumon de fontaine`, `truite saumonée`, and `truite rouge` were not retained for Québec fish-product marketing. Last updated 2011. Terminology evidence, not current inventory or a kitchen measure. |
| **WP04-P-BROOK-TROUT-20261012-S02** | Gouvernement du Québec, [Omble de fontaine](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/omble-fontaine) | Lists `Omble de fontaine / Brook trout / Salvelinus fontinalis`, alternate names including `brook charr`, `speckled trout`, and `truite mouchetée`, and aquaculture for food markets. Updated 2026-10-02. Biological size and weight are not cooking or portion data; the page does not establish current retail supply. |
| **WP04-P-BROOK-TROUT-20261012-S03** | OQLF, [omble de fontaine anadrome, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199920/omble-de-fontaine-anadrome) | Updated 2026; identifies anadromous brook trout as a migratory *S. fontinalis* form and says `truite de mer` can also be used for migratory forms of other salmonids. Boundary evidence only; no recipe form, portion, or equivalence. |
| **WP04-P-BROOK-TROUT-20261012-S04** | CFIA, [Fish List query for Brook Trout](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Brook%20Trout) | Lists TSN 162003, *S. fontinalis*, `Brook Trout / Omble De Fontaine`, `Speckled Trout`, and `Trout`, and gives `Trout` entries for other taxa. Fish-label common-name evidence, not a recipe taxonomy or substitution standard; the Fish List was modified 2023-09-18. |

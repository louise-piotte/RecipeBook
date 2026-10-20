# WP04 Section P — frozen Hoki fillet form review (R672)

- **Review date:** 2026-10-18.
- **Checklist:** The [Section P finfish parent](../../RecipeBook-global-ingredient-catalog-plan.txt#L6654) remains open for fish and regional products.
- **Candidate:** Frozen *Macruronus novaezelandiae* fillets under the existing `ingredient-ref-hoki` identity.
- **Scope:** One frozen-fillet product form only. This is not a new fish identity, a Canadian-caught fish claim, a prepared/breaded product, or a general white-fish substitution.
- **Recommendation:** Hold the form outside active data. Keep the verified Hoki identity unchanged and leave Section P open.
- **Status:** Hold integrated into the catalog plan, workflow, roadmap, and a batch README. No seed, ledger, legacy, or application data changed. No software tests were run because this documentation-only hold changes no runtime or database data.
- **Proposal-local source IDs:** `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-S01` through `S06`; `R01` is a repository audit label. These are not shared-ledger allocations. Existing WP06 OQLF and New Zealand MPI source IDs are reused where noted.

## Candidate selection and prior-work boundary

Hoki is a genuine product-form gap under Section P’s open regional-fish item. The active identity was added by the [WP06 Oceania animal-food review](wp06-oceania-animal-foods-gap-sweep-20261012.md) and its [integration README](../batches/wp06-oceania-regional-identities-integration-20261012/README.md). That work accepted identity-only `hoki / hoki` for *Macruronus novaezelandiae* and explicitly added no form, measure, or substitution. The live reference still has no forms.

This review excludes Arctic grayling, R668’s whole-thawed Atlantic mackerel, and the separate R630/R633/R637/R641/R645/R649/R652/R655/R658/R661/R664 gaps. None owns Hoki or this frozen-fillet product boundary. The proposal archive contains the WP06 identity review but no focused WP04 Section P review of a Hoki fillet form. No pivot was needed.

## Naming and market evidence

| Evidence | Finding | Scope limit |
|---|---|---|
| CFIA Fish List, [*Macruronus novaezelandiae* lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&q=Macruronus%20novaezelandiae) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) [S01] | TSN 623193 is listed as `Hoki`; a separate row lists `Blue Hake / Hoki`; `New Zealand Hoki` and `Whiptail` also appear. The CFIA overview describes the list as accepted common names paired with scientific names for Canadian fish labelling. | Canadian naming evidence, not a retailer listing, stocked item, fillet specification, or proof of Canadian harvest. |
| OQLF, [GDT: `hoki`, fiche 1199120](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199120/hoki) [reused `WP06-OCEANIA-ANIMAL-20261012-S08`] | The Québec edible-fish entry pairs English `hoki` with *M. novaezelandiae* and prefers `hoki` in French. It lists `grenadier bleu` and `grenadier bleu de Nouvelle-Zélande` but says those names were not retained by the fish-products terminology committee. Its English equivalents include `blue hake`, `blue grenadier`, `New Zealand whiting`, and `whiptail`. | The entry was last updated in 2011. Its note says the species has commercial potential in Québec; that is not evidence of current Québec sales or stock. |
| TERMIUM Plus, [record for *Macruronus novaezelandiae*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=ZEALAND), record 9 [S02] | The 2023 record identifies `hoki` as the trade name recommended by the commercial fisheries terminology committee and Fisheries and Oceans Canada in both English and French. It records `blue hake` and other English equivalents, and marks `grenadier bleu de Nouvelle-Zélande` as European French. | Terminology evidence. It does not establish Canadian or Québec product availability. |
| DFO, [*Lexique des espèces marines*](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/118315.pdf), 1990 edition [S03] | The historical lexicon pairs the English name `hoki` with *Macruronus novaezelandiae* and French `hoki` (masculine). | This is a 1990 terminology cross-check, not a current fisheries or market source. Current Québec display follows OQLF and TERMIUM. |
| New Zealand Ministry for Primary Industries, [Hoki: New Zealand’s largest fishery](https://www.mpi.govt.nz/fishing-aquaculture/fisheries-management/fish-stock-status/hoki-new-zealands-largest-fishery) [reused `WP06-OCEANIA-ANIMAL-20261012-S07`] | Identifies Hoki as *M. novaezelandiae* and documents the New Zealand fishery. | Supports the species and New Zealand source context only; it does not demonstrate Canadian availability. |
| Seafood Depot, [Hoki](https://www.seafooddepot.ca/product-hoki) [S04] | A Vaughan, Ontario seafood supplier identifies `Hoki / Macruronus novaezelandiae`, says the fish is available as fillet and frozen, and gives New Zealand as product origin. It lists `Blue Hake` as another name. | Current supplier product page, but no item number, package size, or live inventory status is shown. It is not Québec retail evidence. |
| Cityfish, [Seafood – Frozen](https://www.cityfish.ca/seafood-frozen) [S05] | The current frozen-seafood catalogue lists `Hoki Fillet “New Zealand” (Fz) (15 lb)`. The supplier’s listed address is Calgary, Alberta. | Canadian wholesale catalogue evidence. It does not identify the binomial, a paired French label, per-fillet weight, or in-stock status. |
| Groupe Export Agroalimentaire, [Sogelco International](https://groupexport.ca/repertoire-des-membres/sogelco-international-inc/) [S06] | The Montréal-based importer/exporter profile includes Hoki in its fish portfolio and lists food-service and retail customer types. The profile’s current export markets are Europe, Asia, the United States, and Mexico. | Québec business/channel context, not a Québec SKU or evidence of local Hoki stock. Targeted Québec retailer searches did not locate a current Hoki fillet listing. |

The sources support a frozen Hoki fillet as a product sold through Canadian seafood channels, but they do not establish an in-stock Canadian SKU at review time or a currently stocked Québec retail product. Sogelco’s Montréal address and Hoki portfolio do not prove Québec availability; its listed export markets are outside Canada. Do not claim this is a Canadian-caught fish. The supplier pages identify New Zealand origin or New Zealand product wording.

### Bilingual display and alias boundary

The existing identity already has the supported bilingual display `hoki / hoki`; no identity rename is needed. If a later form is reconsidered, a descriptive display could be `frozen hoki fillet / filet de hoki surgelé`, built from the standardized fish name and the source-supported product state and cut. No Québec seller page was found that pairs that exact French form wording with a specific Hoki SKU.

`Blue Hake` is a source-attested English equivalent and could be reviewed as an identity alias separately. It is not included in this form proposal. The active picker currently returns two fish for `hake` (Red Hake and White Hake); adding `Blue Hake` would make that query three results, while the specific `blue hake` query would identify Hoki. The French `grenadier bleu` forms are excluded because OQLF says they were not retained. Do not add `New Zealand whiting`, `blue grenadier`, or `whiptail` as aliases: those alternatives are not needed to identify the listed Canadian product and would introduce broad or poorly scoped search terms.

## Ownership and ID audit

At the read-only snapshot, the live package had **1,837 active references**, **166 forms**, **56 legacy candidates**, and the shared research ledger had **2,212 records**, **10,355 source entries**, **8,745 distinct source IDs**, and **7,395 distinct URLs**. The manifest listed **114 recipes** and **1,123 structured ingredient rows**. [R01]

| Candidate or nearby owner | Current state | R672 disposition |
|---|---|---|
| `ingredient-ref-hoki` | Active `hoki / hoki`, category `PROTEIN`, no aliases, `defaultDensity: null`, and no unit mappings. Its ledger identity state is `verified`; measurement and substitution research remain `not_yet_researched`. | Keep the reference and existing source record unchanged. No duplicate identity. |
| Forms attached to `ingredient-ref-hoki` | None. | A frozen fillet is not represented as a form. |
| Hoki in the legacy-import list | No matching legacy candidate for `Hoki`, `Blue Hake`, *M. novaezelandiae*, or this product form. | Do not create a legacy mapping. |
| `ingredient-form-hoki-frozen-fillet`; `frozen hoki fillet`; `filet de hoki surgelé` | No exact active reference, form, legacy, or ledger owner. The exact candidate form ID is unallocated. | No ID is allocated because the form is held. |
| Hoki source record and source URLs | The Hoki ledger record owns MPI source `WP06-OCEANIA-ANIMAL-20261012-S07` and OQLF source `WP06-OCEANIA-ANIMAL-20261012-S08`. CFIA, TERMIUM, DFO, Seafood Depot, Cityfish, and Sogelco locators have no exact URL owner in the ledger snapshot. | Reuse MPI/OQLF; use only proposal-local labels for the other sources. Do not add source rows to the shared ledger. |
| R672 proposal/source IDs | The proposal path and `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-` prefix are unallocated. | Reserve no shared ID; these source labels remain proposal-local. |

## Picker projection

The read-only projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, and punctuation; return all complete word-phrase matches before falling back to substring matches; and return the parent reference for a form. A form hint is exposed only when the complete query equals a form label or match term. The hypothetical label pair below is not active data.

| Query | Current picker | With hypothetical `frozen hoki fillet / filet de hoki surgelé` form | Effect |
|---|---|---|---|
| `hoki` | Hoki only | Hoki only | Existing bilingual identity remains unchanged. |
| `hoki fillet` | No result | Hoki | The two-word product phrase becomes searchable; because it is not the full label, it does not produce the exact form hint. |
| `frozen hoki fillet`; `filet de hoki surgelé` | No result | Hoki with the form hint | Exact source-supported product terms become selectable. |
| `fillet` | Seven references through substring fallback: anchovy, herring, Pangasius, salmon, smoked herring, smoked sardine, and tilapia fillets. | Hoki only | The new singular `fillet` word is a complete phrase inside the form label. Phrase-first matching suppresses the existing seven broader results. This is the blocking picker collision. |
| `filet` | Salmon and tilapia (two references) | Hoki, salmon, and tilapia (three references) | The French generic query remains multi-result, though it gains another fish. |
| `hake` | Red Hake and White Hake (two references) | Same, because this form does not add `Blue Hake` as an identity alias. | The broad English query remains unchanged. |

A plural-only English label could avoid making the one-word `fillet` query an exact phrase, but it would no longer match Cityfish’s singular item title as an exact form hint. Adding the singular product phrase as a match term restores the same `fillet` singleton. Under the current matcher, the exact product wording cannot be made form-searchable in English while preserving the current broad `fillet` results. Do not work around this by leaving the cut out of the form label or adding only the French term.

## Bundled recipe demand

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**, totaling **754,048 recipe-file bytes**. It searched decoded recipe content and ingredient rows for `Hoki`, *Macruronus novaezelandiae*, `Blue Hake`, `New Zealand Hoki`, `New Zealand whiting`, `blue grenadier`, `whiptail`, and `grenadier bleu`. It found **zero matching files, rows, or linked rows**. The SHA-256 of manifest-ordered recipe bytes concatenated without separators is `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`. No bundled recipe supports the form, a quantity, or a substitution. [R01]

## Measures, density, and substitutions

- Cityfish’s catalogue title includes `(15 lb)`. This is a wholesale line/package quantity, not a per-fillet or household amount; no fish count, individual fillet weight, or portion is given. Do not turn it into a unit mapping, package yield, serving, or recipe quantity.
- Seafood Depot states that Hoki is sold frozen as fillet but gives no package amount or unit weight. Sogelco’s profile gives no product size. These sources support no reusable kitchen measure, density, thawing/cooking yield, or edible-mass relationship. Keep the active Hoki reference’s density and unit mappings empty.
- The current Hoki ledger record has no measurement or substitution findings, and both active substitution-rule files have no Hoki rule. The recipe corpus has no Hoki line. No source reviewed here establishes a directed Hoki-to-cod, Hoki-to-hake, or other fish replacement, so add no global or contextual substitution.

## Bounded recommendation

**Hold only the frozen-Hoki-fillet form** outside active references, forms, legacy mappings, and the shared ledger. Keep the existing `ingredient-ref-hoki` identity unchanged. Add no form, alias, measurement, density, mapping, package yield, conversion, recipe link, or substitution.

The product cut and frozen state are documented in Canadian supplier catalogues, but the reviewed listings do not show live inventory and do not establish a currently stocked Québec fillet SKU. More decisively, the current English phrase-first picker returns seven references for generic `fillet`; adding the proposed exact term `frozen hoki fillet` would make the singular query an exact word-phrase match and return Hoki alone, suppressing those seven plural `fillets` matches. The French query `filet` currently returns two references and would return three with the proposed French form label, so it remains multi-result. The English narrowing is sufficient to keep this form held. Leave the Section P parent open. Revisit if a current Québec product listing or recipe creates demand and the picker can expose exact Hoki-form wording without collapsing generic `fillet` search.

No active JSON snippet is warranted for a held candidate. Any future measurement or substitution would need its own direct evidence and ownership review; no values are inferred here.

## Static acceptance checks for a future reconsideration

These are catalog checks, not software tests. Before integrating this form in a later batch:

1. Recheck the then-current exact ownership of `ingredient-form-hoki-frozen-fillet` and the R672 source prefix; reuse the existing Hoki identity and OQLF/MPI source records.
2. Confirm a current Canadian or Québec product listing identifies the same frozen Hoki fillet form; record inventory status separately and do not imply Canadian harvest.
3. Re-run the phrase-first projection. Exact English and French form searches must return Hoki with a form hint; verify whether broad `fillet` and `filet` queries collapse before any future integration. Under the current search code, adding the exact English form phrase makes `fillet` a Hoki-only result. `hake` remains multi-result.
4. Rescan the full then-current manifest corpus before attaching recipe links or numeric behavior.
5. Keep trade package quantities source-specific. Add no reusable measure, density, conversion, yield, or substitution without direct supporting evidence.
6. Validate source-URL and source-ID ownership, UTF-8 without BOM, local proposal links, and scoped whitespace. No software tests are needed for a future database-JSON-only addition under `AGENTS.md`.

## Sources

Sources were checked on 2026-10-18. New R672 source labels are proposal-local provenance labels, not shared-ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-S01` | CFIA, [Fish List lookup for *Macruronus novaezelandiae*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&q=Macruronus%20novaezelandiae) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | TSN 623193 rows support the Canadian common-name boundary. The list is not a market-stock database. |
| **Reused `WP06-OCEANIA-ANIMAL-20261012-S08`** | OQLF, [GDT: `hoki`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199120/hoki) | Existing Hoki ledger source; preferred Québec edible-fish term and rejected French grenadier wording. |
| `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-S02` | TERMIUM Plus, [*Macruronus novaezelandiae*, record 9](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=ZEALAND) | 2023 trade-name and English/French terminology record. |
| `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-S03` | DFO, [*Lexique des espèces marines* (1990)](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/118315.pdf) | Historical English/French name and binomial cross-check only. |
| **Reused `WP06-OCEANIA-ANIMAL-20261012-S07`** | New Zealand MPI, [Hoki: New Zealand’s largest fishery](https://www.mpi.govt.nz/fishing-aquaculture/fisheries-management/fish-stock-status/hoki-new-zealands-largest-fishery) | Existing Hoki ledger source; supports species and New Zealand fishery context, not Canadian or Québec availability. |
| `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-S04` | Seafood Depot, [Hoki](https://www.seafooddepot.ca/product-hoki) | Vaughan supplier page identifies the binomial, frozen fillet presentation, and New Zealand product origin; no current inventory or package measure. |
| `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-S05` | Cityfish, [Seafood – Frozen](https://www.cityfish.ca/seafood-frozen) | Calgary supplier catalogue listing `Hoki Fillet “New Zealand” (Fz) (15 lb)`; no binomial, French product wording, per-fillet mass, or stock status. |
| `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-S06` | Groupe Export Agroalimentaire, [Sogelco International](https://groupexport.ca/repertoire-des-membres/sogelco-international-inc/) | Montréal exporter/importer profile names Hoki in its product portfolio and lists current export markets outside Canada. It does not establish a local Québec SKU or stock. |
| `WP04-SECTIONP-HOKI-FROZEN-FILLET-R672-20261018-R01` | Repository audit of the Section P plan, [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), proposal/batch archive, package manifest and recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) | Read-only ownership audit, static picker projection, and full manifest-corpus scan; not a ledger source record. |

# WP04 Section P — pompano market-group identity review (R109)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** Proposal-only Québec/Canadian naming, identity, exact-ownership, picker, and recipe-demand review.
- **Recommendation:** Add one alias-free, identity-only **pompano / pompano** `PROTEIN` reference for the generic *Trachinotus* market group. OQLF uses `pompano` as the Québec preferred edible-fish term for *Trachinotus* sp.; the CFIA Fish List independently has a matching `Trachinotus spp. — Pompano / Pompano` group row. Do not narrow this group to Florida pompano or another single species, and do not use `permit`, *pompano lune*, `palomine`, or `pompano dolphin` as aliases.
- **Scope:** This file is the only proposed change. No catalog JSON, research ledger, generated code, checklist, roadmap, recipe, or application code was edited. No tests or emulator checks were run; this is a documentation-only proposal.

## Candidate identity and naming boundary

OQLF’s edible-fish entry gives the preferred Québec term **pompano**, English **pompano**, and the Latin designation *Trachinotus* sp. It says the species chiefly found in the market are *T. falcatus* and *T. carolinus*. The CFIA Fish List contains a separate *Trachinotus* spp. group entry named **Pompano / Pompano**, alongside species-level rows for *T. blochii* (**Snubnose Pompano / Pompano lune**) and *T. ovatus* (**Pompano / Palomine**). Together these sources support the unqualified market-group identity, but they do not make each species-level name an alias for the group. [S01, S02]

| Proposed ID | Category | English display | fr-CA display | Proposed search aliases | Evidence scope |
|---|---|---|---|---|---|
| `ingredient-ref-pompano` | `PROTEIN` | `pompano` | `pompano` | None | Generic *Trachinotus* spp. food-fish market group; not a single-species assertion. |

Keep the English and French displays as the same normalized word. OQLF lists `permit` among its English translations, but the current U.S. FDA Seafood List assigns **Permit** as the common name for *T. falcatus* and **Pompano** as that species’ acceptable market name. Because `permit` can point to a narrower species and is not needed to find either display, leave it out of the group row. The U.S. list is species-name boundary evidence only; it does not set Canadian labelling or recipe identity. [S01, S04]

OQLF says **trachynote** (France/Europe) and **pompaneau** (France) were not retained for Québec fish-product commercialization; do not add them. Keep species-qualified CFIA names `snubnose pompano`, `pompano lune`, and `palomine` out of the group aliases. Keep **pompano dolphin** separate from this fish: the existing mahi-mahi review explicitly excludes that phrase from its aliases, and it is not a *Trachinotus* name. Do not infer species, product state, or culinary equivalence from a broad market label. [S01, S02; see the prior mahi-mahi boundary review](wp04-section-p-mahi-mahi-coryphene-market-identity-review-20261012.md)

## Prior work and exact ownership

The open Section P checklist still includes regional fish. The existing finfish gap review and its follow-ups do not assign a Pompano identity; a repository-wide exact phrase search found no Pompano-specific proposal, hold, batch, or ledger decision. The only prior proposal/archive reference to the word is the mahi-mahi boundary above, where `pompano dolphin` is explicitly excluded. This review therefore covers the *Trachinotus* group without reopening that distinct *Coryphaena* decision.

The ownership audit used `normalizeIngredientSearchKey` behavior from [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD, fold common ligatures and ampersands, remove combining marks, replace punctuation runs with spaces, and collapse whitespace. It checked active reference displays and aliases, form labels and match terms, legacy candidate names and aliases, ledger text and record IDs, plus proposal and batch archives. Current worktree counts at review time were 1,448 active references, 105 forms, 63 legacy candidates, and 1,788 ledger records.

| Key or proposed allocation | Active reference owner | Form owner | Legacy owner | Ledger/archive result |
|---|---|---|---|---|
| `ingredient-ref-pompano` / `candidate-wp04-pompano` | None | None | Neither ID is allocated | No ledger ID; no prior Pompano-specific packet. |
| `pompano` / `Trachinotus` | No exact display or alias | None | None | No ledger identity or taxon owner; `pompano dolphin` occurs only in the mahi-mahi boundary. |
| `permit`, `pompaneau`, `trachynote` | No exact display or alias | None | None | No exact identity owner; these terms are not proposed aliases. |
| `snubnose pompano`, `pompano lune`, `palomine` | No exact display or alias | None | None | CFIA species-level names remain outside this group row. |
| `WP04-SECTIONP-POMPANO-R109-20261014-S01`–`S05` | — | — | — | Prefix absent from the ledger and prior proposal/batch archive before this packet. These IDs are proposal-local, not ledger allocations. |

## Picker ownership and projected results

`IngredientReferenceSearchIndex` searches bilingual names, aliases, and attached form terms. It returns complete normalized word-phrase matches before falling back to substring matches. The projection below adds only the hypothetical alias-free `pompano / pompano` row in memory; it does not alter catalog data.

| Query | Current result | With the proposed row | Boundary |
|---|---|---|---|
| `pompano` | None | `pompano / pompano` only | Resolves to the generic market group, consistent with the OQLF and CFIA group entries. |
| `pompano lune`, `snubnose pompano`, `palomine` | None | None | Species-qualified names are not aliases for the group. |
| `permit` | None | None | Do not make a species-specific common name select the whole group. |
| `pompaneau`, `trachynote` | None | None | OQLF does not retain these terms for Québec fish-product commercialization. |
| `pompano dolphin` | None | None | Remains separate from the existing mahi-mahi identity. |
| `mahi-mahi` | Mahi-mahi / coryphène | Same result | The new row does not change the existing Mahi search. |

No active form term needs to be created or attached. The proposed group display itself supplies the complete `pompano` phrase; no extra short alias is required.

## Bundled recipe demand

All 114 recipe files listed in the bundled manifest, all 1,123 ingredient rows, and all parsed recipe strings were searched using normalized whole-word phrases for `pompano`, *Trachinotus*, `pompaneau`, `trachynote`, `permit`, `pompano lune`, `snubnose pompano`, `palomine`, `golden pompano`, `golden pomfret`, and `pompano dolphin`.

**Result: zero matching files and zero matching ingredient rows.** No recipe link or relink is supported. This demand result does not block an identity-only reference, but it supplies no recipe-specific product, amount, or substitution evidence.

## Product, measurement, and substitution limits

Seafood Depot, a Canadian Vaughan supplier, lists a generic **Pompano / *Trachinotus*** item as wild, available whole or as fillets, fresh or frozen, with listed product origins of the USA and Trinidad and Tobago. This supports a Canadian trade listing for the group but does not identify the species, establish Québec retail stock, or standardize the displayed product presentations. Treat those statements as source-specific observations only. [S05]

No reviewed source supplies a recipe quantity, package weight, household measure, count-to-mass mapping, density, edible yield, or cooking yield for this candidate. If integrated, keep `defaultDensity` null and `unitMappings` empty, and create no forms or reusable measures from the supplier’s presentation list. No recipe or reviewed source supports a global or contextual substitution involving pompano and another fish; add no substitutions, cooking guidance, or safety claims.

## Proposed integration shape

If accepted, add only this identity reference and its evidence record in a later integration step. The following is a proposed shape, not a catalog edit:

```json
{
  "id": "ingredient-ref-pompano",
  "nameFr": "pompano",
  "nameEn": "pompano",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

No form, measure, recipe link, conversion, yield, or substitution is proposed. Section P remains open.

## Sources

Sources were opened or rechecked on 2026-10-14. Source IDs are local to this proposal and have not been added to the research ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-POMPANO-R109-20261014-S01** | OQLF, [pompano — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198983/pompano) | Edible-fish and ichthyology entry; preferred Québec term `pompano`, English `pompano`, Latin *Trachinotus* sp.; names *T. falcatus* and *T. carolinus* as the principal market species. Also lists `permit` as an English translation and says `trachynote` and `pompaneau` were not retained for Québec fish-product commercialization. Last updated 2011; terminology and market-scope evidence, not a current inventory record. |
| **WP04-SECTIONP-POMPANO-R109-20261014-S02** | CFIA, [Fish List search results for *Trachinotus*](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s&q=Trachinotus), with [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | The rendered result lists TSN 168707 *Trachinotus* spp. as `Pompano / Pompano`, TSN 168716 *T. blochii* as `Snubnose Pompano / Pompano lune`, and TSN 168718 *T. ovatus* as `Pompano / Palomine`. Canadian fish-labelling names, not recipe equivalence or proof of the taxon in an unlabelled product. The list page is dated 2023-09-18. |
| **WP04-SECTIONP-POMPANO-R109-20261014-S03** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Says only the common name(s) listed for the fish species should be used as the name(s) for that species sold or processed in Canada; explains the Fish List’s labelling role. Guidance last modified 2023-09-25; not a recipe identity resolver. |
| **WP04-SECTIONP-POMPANO-R109-20261014-S04** | U.S. FDA, [The Seafood List: *Trachinotus falcatus*](https://hfpappexternal.fda.gov/scripts/Fdcc/index.cfm?id=Trachinotus_falcatus&set=SeafoodList) | Lists `Pompano` as the acceptable market name and `Permit` as the common name for *T. falcatus*. Supports keeping `permit` from broadening a group-level Canadian picker row; U.S. naming evidence does not control Canadian labelling. The FDA list says it is updated every six months. |
| **WP04-SECTIONP-POMPANO-R109-20261014-S05** | Seafood Depot (Vaughan, Ontario), [Pompano product listing](https://www.seafooddepot.ca/product-pompano2) | Lists `Pompano`, genus *Trachinotus*, wild; whole or fillet; fresh or frozen; product of the USA and Trinidad and Tobago. Canadian supplier evidence, not a species determination, Québec inventory, recipe measure, or standardized form. |

## Static review checks

- Rechecked the active references, forms, legacy candidates, ledger, Section P checklist, roadmap, and adjacent finfish/seafood proposals and batches for exact ownership and prior-review overlap.
- Mirrored the Kotlin phrase-first picker behavior for the table above; no catalog files were modified.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; the candidate and adjacent naming phrases had no hits.
- This proposal is UTF-8 text with no BOM and a final newline. No application tests or emulator checks were run for this documentation-only file.

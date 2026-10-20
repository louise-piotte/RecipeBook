# WP04 Section P — generic tilapia name-group review (R901)

- **Review and source-access date:** 2026-10-19.
- **Status:** Integrated as a separate identity-only name group in the R899–R901 batch.
- **Open plan anchor:** [Section P finfish parent, which still lists tilapia](../../RecipeBook-global-ingredient-catalog-plan.txt#L7216).
- **Recommendation:** Add one separate, identity-only, visibly qualified generic name group: `tilapia (name used for multiple fish species) / tilapia (nom utilisé pour plusieurs espèces de poissons)`. This records the repeated unqualified English/French name in the CFIA Fish List. It is a catalog search identity for broad recipe wording, not a taxon, species roster, preparation state, or claim of culinary equivalence.

## Scope and prior decisions

This review addresses only the generic name gap. It does not repeat the existing product-form work or revisit the species hold:

- [R218](wp04-section-p-next-seafood-gap-review-r218-20261016.md) added species-neutral **tilapia fillets / filets de tilapia** and kept measurements and recipe quantities source-specific.
- [R428](wp04-section-p-whole-tilapia-boundary-review-r428-20261017.md) added species-neutral **whole tilapia / tilapia entier**, separately from fillets.
- [The Nile tilapia review](wp04-section-p-nile-tilapia-identity-review-20261012.md) left `candidate-nile-tilapia` in the ledger for *Oreochromis niloticus*. Its verified species identity stays unallocated because a species-only display could capture the bare query `tilapia`.

Those decisions remain intact. The proposed group is a visibly qualified search target for recipe text that says only “tilapia.” It does not settle whether that recipe means a fillet, a whole fish, a particular species, or some other preparation. Its value is generic name coverage and clear presentation of that ambiguity, not additional commercial-product coverage.

## Name evidence and boundary

The current CFIA Fish List displays the exact pair **Tilapia / Tilapia** for more than one species row, including *Oreochromis urolepis hornorum* and *Sarotherodon melanotheron*. It also uses “Tilapia” in narrower or differently paired names for other taxa, including *O. niloticus*, *O. mossambicus*, and *S. galilaeus*. The proposed group is limited to the repeated exact pair; it does not include every species whose row contains the word “tilapia.” The Fish List connects common names to species for Canadian fish labelling. It is not a culinary equivalence list or approval of this catalog-authored qualified display.

OQLF’s GDT defines *tilapia* as an edible African freshwater fish in the Cichlidae family and gives `tilapia` as a preferred French term and English translation. The entry also contains Nile-tilapia and *Oreochromis niloticus* terminology. This review uses only its generic definition and base `tilapia` term; it does not transfer the species-specific material into the proposed name group.

The qualifier is explanatory catalog wording, not a standardized common name. Do not alias `perche d’Afrique`, `Nile tilapia`, `tilapia du Nil`, `Mozambique tilapia`, `tilapia du Mozambique`, `Wami tilapia`, `Blackchin tilapia`, *Oreochromis*, *Oreochromis niloticus*, or other species and scientific names. Keep the group limited to name usage and do not infer that any listed species is interchangeable in recipes.

## Integrated reference

Add one separate reference; do not repurpose the held Nile candidate or modify either existing tilapia row:

```json
{
  "id": "ingredient-ref-tilapia-name-group",
  "nameEn": "tilapia (name used for multiple fish species)",
  "nameFr": "tilapia (nom utilisé pour plusieurs espèces de poissons)",
  "aliasesEn": ["tilapias"],
  "aliasesFr": ["tilapias"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The plural aliases are search inflections only. The French qualified wording is catalog-authored, not an OQLF-approved compound term. The integrated ledger record verifies identity only for this repeated-name-group scope, with measurement and substitution research left `not_yet_researched`. No form, density, unit mapping, package relationship, portion, conversion, yield, recipe link, or substitution was added.

## Proposal-time ownership and picker projection

The proposal-time package snapshot had **1,927 active ingredient references**, **201 forms**, **56 legacy-import candidates**, and **2,330 research-ledger records**. The manifest lists **114 recipe files** and **1,123 structured ingredient rows**.

| Current owner | Existing scope | R901 boundary |
|---|---|---|
| `ingredient-ref-tilapia-fillets` | `tilapia fillets / filets de tilapia`; French singular alias `filet de tilapia`; 12 ledger sources | Keep the fillet identity and all its product- and recipe-scoped observations unchanged. |
| `ingredient-ref-whole-tilapia` | `whole tilapia / tilapia entier`; whole-fish wording aliases; 6 ledger sources | Keep whole fish separate from fillets and the name group. |
| `candidate-nile-tilapia` | Verified candidate for *O. niloticus*, unallocated; 8 ledger sources | Preserve its species-specific identity, decision, aliases, and all source evidence. Do not promote it as generic tilapia. |
| Legacy identities | No tilapia candidate or target ID | No legacy entry is promoted or rewritten. |
| Proposed `ingredient-ref-tilapia-name-group` | No active reference, form, legacy identity, or ledger record owns this exact ID or qualified name | A separate reference is needed if the generic name group is accepted. |

The source IDs proposed for reuse below already exist in the ledger. OQLF’s generic terminology source is currently cited on the held Nile candidate and both active product-form references; the CFIA Fish List source is shared across multiple fish references. Reuse only the claims that transfer to a generic name group. Do not copy or alter those source entries, and do not copy the Nile-specific terminology or product evidence.

Picker projection mirrors phrase-first matching and partial fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a static projection from the live reference/form data, not an emulator result.

| Query | Current active results | With proposed group | Scope |
|---|---:|---:|---|
| `tilapia` | 2: fillets, whole tilapia | 3, including the qualified name group | The broad query remains multi-result and gains an explicit species-unspecified name option. |
| `tilapias` | 0 | 1 | Plural search inflection only. |
| `tilapia fillets`, `filets de tilapia`, `filet de tilapia` | 1 each | 1 each | Existing fillet reference remains the only result. |
| `whole tilapia`, `tilapia entier` | 1 each | 1 each | Existing whole-fish reference remains the only result. |
| `Nile tilapia`, `tilapia du Nil`, *O. niloticus* | 0 each | 0 each | The species candidate remains inactive; no species alias is introduced. |
| `perche d’Afrique` | 0 | 0 | OQLF’s broader alternate term is not assigned to the group. |
| Either full qualified display | 0 | 1 each | Selects only the proposed name group. |

## Recipe demand and measurement limits

All **114 manifest-listed recipes**, the **1,123 ingredient rows**, and serialized recipe text were scanned for `tilapia`, `tilapias`, fillet/filet phrases, whole-fish phrases, Nile tilapia and *Oreochromis* names, and `perche d’Afrique`. There were **zero matching recipe files and zero matching ingredient rows**. The bundle provides no recipe line or measure to attach to the proposed name group.

Existing R218 evidence contains recipe uses of **fillets**, not an unqualified generic tilapia line. Any counts, masses, serving amounts, or recipe-specific substitution context remain scoped to those existing sources and the fillet identity. R428’s product observations and package amount remain scoped to the named whole-fish products. None of those claims or measurements transfers to this name group. The held Nile candidate’s aquaculture and species sources likewise remain species-scoped.

## Source-by-source transferability review

| Source | Transferability decision |
|---|---|
| Reused `WP04-FINFISH-GAPS-20261010-S11` — CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), with the current [tilapia result table](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tilapia), checked 2026-10-19. | Reusable only for the repeated species-linked common-name pair `Tilapia / Tilapia`. Current official results show that pair on multiple species rows. They also show narrower or differently paired tilapia names. Do not transfer a taxon, universal species membership, product state, or culinary-equivalence claim. The list page is dated 2023-09-18; the results were rechecked from the current indexed official table. |
| Root review source `R901-S01` — CFIA, [Fish List search results for tilapia](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tilapia), checked 2026-10-19. | The indexed official results show exact `Tilapia / Tilapia` rows for *Oreochromis urolepis hornorum* and *Sarotherodon melanotheron*, among other narrower names. The dynamic endpoint did not open directly in the browser; use only for the repeated exact name pair, not as a taxon or culinary-equivalence source. |
| Reused `WP04-SECTIONP-NILETILAPIA-20261012-S01` — OQLF, [GDT: tilapia](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8367900/tilapia), last updated 2001; page opened 2026-10-19. | Reusable only for the generic Québec French/English term `tilapia` and the edible freshwater-fish definition. Do not transfer the entry’s Nile-tilapia / *O. niloticus* association, or use `perche d’Afrique` as a broad alias. |
| Reused `WP04-FINFISH-GAPS-20261010-S12` — CFIA, [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25; page reopened 2026-10-19. | Use to bound the Fish List as Canadian fish-label naming evidence and note that group names covering multiple species may be considered. It does not approve this catalog display or establish recipe equivalence. |
| Existing Metro, Loblaws, and Mayrand product sources on the R218 and R428 records. | Not transferred. They describe particular fillet or whole-fish product listings and do not establish a generic name group’s product state, composition, measure, or portion. Keep all retailer amounts and product claims on their original records. |
| Nile-specific TERMIUM, DFO, Ontario aquaculture, and CFIA aquatic-animal-health sources on `candidate-nile-tilapia`. | Not transferred. These sources support the named species or aquaculture/health context, not the broader generic name group. The generic TERMIUM result surfaced in search but its page could not be independently opened in this review; it is not relied upon. |
| Repository audit (R01). | Read-only comparison of the plan, catalog references/forms, legacy candidates, ledger/source ownership, picker implementation, scope review, manifest, and listed recipes. It supports ownership, picker, and recipe-demand findings only. |

## Queue disposition and no-transfer boundary

The current Section P work item is a broad finfish-identity parent, not a commercial roster assignment. The latest cross-category [generic ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md) found no open checklist item whose sole deliverable is a brand, product-line, flavour-family, SKU, or retailer-variant roster. No roster-only queued line was encountered in this review. Any such line remains out of scope because commercial-product counts do not add ingredient diversity.

Preserve all existing branded entries, retailer evidence, source observations, and measurements. Do not delete or merge any existing tilapia entry, generalize product-specific evidence, or use a product listing as proof of species membership. The proposal does not determine which species a particular package or recipe uses, whether whole fish and fillets can substitute for one another, or what amount belongs to any species or form.

## Files reviewed

`AGENTS.md`; the open Section P finfish parent; R218 tilapia fillets; R428 whole tilapia; the Nile tilapia candidate and its source records; the current reference/form package; `legacy-import-identities.v1.json`; the research ledger; the generic scope review; the 114 manifest-listed recipes; and `IngredientSearch.kt`.

No shared catalog, ledger, plan, roadmap, or workflow file was edited by the proposal author. No test, build, emulator run, or deployment was performed for this proposal-only review.

## Root review and integration

- Added a separate visibly qualified `ingredient-ref-tilapia-name-group` for the exact generic `Tilapia / Tilapia` name pair used on multiple CFIA Fish List species rows. The plural `tilapias` forms are search inflections only; the French qualifier is catalog-authored and is not presented as an approved fish label.
- Root review verified the repeated name pair in the official indexed CFIA result table and confirmed the OQLF generic `tilapia` term plus CFIA group-name guidance. The indexed query is recorded as `R901-S01`; direct endpoint access failed. No Nile-specific species claim, alias, product, amount, or form evidence was transferred.
- Preserved `ingredient-ref-tilapia-fillets`, `ingredient-ref-whole-tilapia`, `candidate-nile-tilapia`, their decisions, sources, and all product- or recipe-scoped observations unchanged. Added no forms, measurements, mappings, conversions, yields, recipe links, or substitutions.
- No queued brand-, product-line-, flavour-, SKU-, or retailer-roster assignment was encountered or pursued. Section P remains open.

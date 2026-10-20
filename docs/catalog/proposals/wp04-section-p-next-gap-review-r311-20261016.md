# WP04 Section P — Indian mackerel / maquereau des Indes identity review (R311)

- **Review and source-access date:** 2026-10-16.
- **Recommendation:** Add an identity-only `PROTEIN` reference for Indian mackerel / maquereau des Indes, scoped to *Rastrelliger kanagurta*. Keep aliases and forms empty. The Canadian Food Inspection Agency (CFIA) pairs this species with those bilingual names, and a current Ontario supplier separately identifies its Indian-mackerel product as the same species. The current picker already returns multiple results for broad `mackerel` and `maquereau` queries, so adding the qualified row does not make either family query appear species-specific.
- **Scope:** One species identity. This does not reopen the Atlantic-mackerel `maquereau bleu` alias review (R304), the Atlantic/Pacific/spotted Spanish mackerel identities, or the separate canned and smoked mackerel product groups. No shared catalog, ledger, plan, roadmap, recipe, generated file, or application code was changed. No software tests, build, emulator check, or deployment was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-INDIAN-MACKEREL-R311-20261016-S01` and `S02`; `R01` is a repository audit label. Reused shared evidence is identified by its existing source ID below.

## Why this is an open gap

The live reference catalog contains Atlantic mackerel, Pacific mackerel, narrow-barred Spanish mackerel, spotted Spanish mackerel, canned mackerel, and smoked mackerel, but no *Rastrelliger* identity. A case-insensitive audit of active reference names and aliases, form names and match terms, legacy-import identities, ledger record IDs/text, Section P proposals and batches, and the plan found no exact owner or focused decision for `Indian mackerel`, `maquereau des Indes`, `maquereau indien`, *Rastrelliger kanagurta*, or *Rastrelliger*. The proposed ID `ingredient-ref-indian-mackerel` and R311 source-ID prefix are also unallocated. [R01]

The existing R304 review adds only `maquereau bleu` to Atlantic mackerel (*Scomber scombrus*). The smoked- and canned-mackerel reviews concern separate prepared-product identities; none of these reviews assigns *R. kanagurta*. This proposal preserves all of those boundaries. [reused R304 and the current references]

## Species and naming boundary

CFIA lists *R. kanagurta* (TSN 172462) as **Indian Mackerel / Maquereau des Indes**. It also lists the broader **Mackerel / Maquereau** name for this taxon. That broader row is not needed as an alias: the specific bilingual pair is available, and the existing catalog already has several other mackerel species and product groups. CFIA's Fish List is Canadian fish-name evidence, not a Québec retail inventory or a recipe-equivalence source. [S01]

Fresh Water Foods Inc., a Richmond Hill, Ontario seafood importer and wholesaler, independently lists **Indian Mackerel / *Rastrelliger kanagurta***. The same page separately lists seer fish (*Scomberomorus commerson*); that entry does not support merging seer fish with Indian mackerel. The supplier source supports this named product; it does not establish an unqualified fish-counter label or Québec availability. [S02]

| Candidate field or term | Recommendation |
|---|---|
| Prospective identity | Add only `ingredient-ref-indian-mackerel`, category `PROTEIN`, displayed as **Indian mackerel / maquereau des Indes**, scoped to *R. kanagurta*. |
| Aliases | Add none. In particular, do not add broad `mackerel` / `maquereau`, the externally attested French variant `maquereau indien`, or other regional/vernacular names without Québec-facing product evidence. The exact CFIA display pair is enough for a first identity row. |
| Atlantic mackerel / `maquereau bleu` | Keep R304's alias on the existing *Scomber scombrus* reference only. Do not copy it to *R. kanagurta*. |
| Other *Rastrelliger* species | Do not infer *R. brachysoma* or genus-wide scope from the product name. No sibling-species row or alias is proposed. |
| Forms and numeric data | Add no whole, cleaned, fresh, frozen, IQF, or other reusable form; no measure, density, unit mapping, conversion, or yield. Supplier pack and size observations remain source-specific. |
| Recipes and substitutions | Add no recipe link, recipe-line alternative, global rule, or contextual rule. No reviewed recipe or source establishes a directed substitute. |

The displayed French name `maquereau des Indes` follows CFIA's Canadian Fish List. No independent OQLF entry or current Québec consumer package for this species was found in this bounded review; that terminology and market-coverage limit should remain visible if the row is later integrated. OQLF's existing generic `maquereau` entry is reused only as a broad-term boundary, not as support for assigning that term to *R. kanagurta*. [reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S07`]

## Exact ownership and picker projection

The ownership audit followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized whole-word phrases across displays, aliases, and attached form terms take precedence over substring fallback. The proposed row below adds only the CFIA bilingual display pair, with no aliases or forms.

| Query | Current picker | With the proposed row | Boundary |
|---|---|---|---|
| `Indian mackerel` | None | Indian mackerel only | Qualified English display resolves to *R. kanagurta*. |
| `maquereau des Indes` | None | Indian mackerel only | Exact CFIA French display resolves to *R. kanagurta*. |
| `mackerel` | Six: Atlantic, canned, narrow-barred Spanish, Pacific, smoked, and spotted Spanish mackerel | Same six plus Indian mackerel (seven total) | The broad English query remains multi-result. |
| `maquereau` | Five: Atlantic, canned, Pacific, and smoked mackerel, plus gooseberry / `groseille à maquereau` | Same five plus Indian mackerel (six total) | The broad French query remains multi-result; the existing gooseberry phrase match is unchanged. |
| `maquereau bleu` | Atlantic mackerel only | Same | R304 remains on its current owner. |
| `maquereau indien` | None | None | No alias is proposed; this variant lacks a Québec-specific product source in this review. |
| `Rastrelliger kanagurta` | None | None | Scientific names are not picker aliases and remain unallocated as search terms. |

The projection is a static application of the current search terms to an in-memory candidate row. It does not change shared catalog data or constitute an app test. A short `Indian` query would gain this result, as expected from the displayed name; it does not create a mackerel-name collision. [R01]

## Bundled-recipe demand

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**, then searched complete recipe JSON and ingredient-row text for `Indian mackerel`, `maquereau des Indes`, `maquereau indien`, `Rastrelliger kanagurta`, and `Rastrelliger`. It found zero matching files and zero matching ingredient rows. No recipe link, amount, preparation state, or recipe-specific substitution is supported. [R01]

## Product measurements and substitution evidence

The Ontario supplier lists this product as whole-round, whole-cleaned, IQF/IVP and reports seller-specific size bands of 4/5, 6/8, and 8/10 fish per pound, 20 × 1 lb IVP packs, 10 kg bulk packing, and India / Asia origin. These are supplier product and size-grade observations, not a household measure, serving amount, edible-yield factor, or transferable conversion. The product page describes wholesale/retail programs but does not establish Québec stock or provide a consumer package panel. Keep all such values out of reusable catalog behavior. [S02]

The bundled global and contextual substitution-rule files contain no rules. No bundled recipe requests this fish, and no reviewed source provides a dish-, method-, direction-, and quantity-specific replacement. Do not infer interchangeability with Atlantic/Pacific mackerel, Spanish mackerel, sardines, or generic fish from the shared mackerel label or culinary category. Add no global or contextual substitution. [R01]

## Source register and limits

The source IDs below are proposal-local and are not allocated to the shared research ledger. The Fresh Water Foods URL was already consulted in R252 for separate pomfret products; this proposal uses its distinct Indian-mackerel entry as a separately scoped locator. No duplicate shared ledger entry is proposed.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-INDIAN-MACKEREL-R311-20261016-S01** | CFIA, [Fish List results for *Rastrelliger kanagurta*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s&q=Rastrelliger%20kanagurta); [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), accessed 2026-10-16. | Lists TSN 172462 as *R. kanagurta* with **Indian Mackerel / Maquereau des Indes**, and also lists **Mackerel / Maquereau** for the taxon. Supports a species-qualified bilingual display and the distinction from generic mackerel searches. Canadian fish-name evidence; not a Québec product listing, recipe identity, or substitution source. |
| **WP04-SECTIONP-INDIAN-MACKEREL-R311-20261016-S02** | Fresh Water Foods Inc., [Tropical Fish products](https://freshwaterfood.ca/tropical-fish.html), accessed 2026-10-16; Indian Mackerel section. | Identifies *R. kanagurta* and lists whole-round, whole-cleaned, IQF/IVP presentations, size grades, pack configurations, and India / Asia origin. Canadian importer/wholesaler evidence; sizes and packs are supplier-specific, not reusable culinary measures, and the source does not establish Québec retail stock. The URL was previously cited by R252 for other species; this proposal uses a separate product locator. |
| **Reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S07`** | OQLF, [maquereau — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198842/maquereau). | Reused only for the broad Québec term boundary. It identifies `maquereau` with *Scomber* sp.; it does not identify *R. kanagurta* or support `maquereau indien` as a Québec product label. |
| **WP04-SECTIONP-INDIAN-MACKEREL-R311-20261016-R01** | Read-only audit of the Section P checklist, current [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), Section P proposals and batches, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Exact-key and source-prefix ownership audit, static picker projection, and recipe-corpus scan. Repository evidence only; proposal-local audit label, not a ledger source. |

## Final recommendation

**Recommend** an identity-only `PROTEIN` reference for **Indian mackerel / maquereau des Indes** (*Rastrelliger kanagurta*), with empty alias arrays. Keep the generic `mackerel / maquereau` search terms broad, preserve the existing Atlantic/Pacific and prepared-product boundaries, and add no form, reusable measurement, recipe link, conversion, yield, or substitution. The Canadian bilingual name and species identity are supported; Québec retail availability and independent OQLF confirmation remain unverified. This proposal is the only R311 artifact; no software tests or emulator checks were run.

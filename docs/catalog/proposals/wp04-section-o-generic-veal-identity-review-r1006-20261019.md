# WP04 Section O — generic veal / veau identity review (R1006)

- **Review and source-access date:** 2026-10-19.
- **Status:** Integrated in the [R1004–R1006 batch](../batches/wp02-wp03-wp04-r1004-r1006-generic-gap-integration-20261019/README.md). This file preserves the evidence and limits recorded when the proposal was drafted.
- **Exact plan anchor:** The open WP04 species checklist at [global catalog plan, line 7207](../../RecipeBook-global-ingredient-catalog-plan.txt#L7207): “Beef, veal, pork, lamb, mutton, goat, chicken, turkey, duck, goose, quail, rabbit, and documented regional game.”
- **Candidate:** Generic culinary veal.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **veal / veau**, with no aliases or forms. If accepted, retain one source-scoped cooked Food Guide portion of 75 g; do not turn its paired 125 mL into a unit conversion. Leave recipe links and substitutions empty.
- **Scope:** One generic species-derived meat identity. Do not research or add brands, product lines, flavours, SKUs, or retailer variants.

## Identity and Québec terminology

OQLF’s food-domain GDT entry selects **veau** and directly gives English **veal**; its definition describes veal as meat from a young bovine used for food. CFIA’s Canadian meat-cuts manual defines regulated veal as meat from dressed bovine carcasses meeting its maturity characteristics and warm-carcass-weight limit. Together, these sources support an independent generic meat identity and keep it distinct from generic beef. [R1006-S01–S02]

Use the direct food-domain pair, without added aliases:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-veal` |
| Category | `PROTEIN` |
| English display | `veal` |
| Québec French display | `veau` |
| English aliases | None |
| French aliases | None |
| Default density / unit mappings | `null` / `[]` |

Do not add `calf` or `calf meat` as meat aliases. OQLF has a separate zootechnics entry where `veau` means the animal and translates as `calf`; that is a different domain from its food entry. Keep `beef / bœuf`, ground beef, goat meat, and any future lamb or mutton identity distinct. Do not add cut names such as diced veal, stewing veal, veal chop, or veal liver as aliases or forms of the unqualified identity. CFIA’s cut nomenclature names these as qualified products; it does not make them synonyms for the generic picker entry. [R1006-S01–S02]

## Current ownership and evidence-transfer review

Read-only snapshot checked against the bundled package, legacy-import file, and research ledger: **2,018 active references, 205 forms, 55 legacy-import candidates, and 2,424 ledger records**. No active display or alias, form label or match term, or legacy candidate owns `veal`, `veau`, or `calf`; there is no `ingredient-ref-veal` or generic veal ledger record. The open Section O species item is therefore still unfinished.

The ledger contains a few narrower uses of these words. They do not establish an existing generic veal identity, and their evidence remains with its current owner:

| Current owner | Existing evidence and boundary |
|---|---|
| `ingredient-ref-stew-meat` | Recipe `090#8` remains linked to the publisher’s mixed `stew meat` option. Its OQLF source `WP04-STEW-MEAT-20261010-S06` supports the separate term `veau à ragoût / stewing veal` and species-qualified meat-label wording; it does not make the recipe’s generic line a veal request. Preserve the record’s `needs_clarification` state and do not add `veau à ragoût` as a generic alias. |
| `candidate-beef-jerky` | CFIA’s Annex G source lists veal among several species in an export categorization for dried meat. That classification is not a generic veal definition or a recipe-equivalence source. Keep it with the jerky boundary review. |
| `ingredient-ref-chimichurri-sauce` | Its Metro Québec source title names one veal-and-chimichurri recipe, but the ledger claim supports local use of the sauce name only. Its recipe quantities and handling remain recipe-specific; do not use them as veal measures or count that external recipe as bundled demand. |
| `ingredient-ref-goat-meat` | MAPAQ’s goat-meat evidence includes qualitative cooking comparisons. Those claims are about goat meat and do not transfer to veal or support a goat-to-veal substitution. |
| `ingredient-ref-pork` | Its source `WP04-SECTIONO-GENERIC-PORK-R992-20261019-S03` is the same Health Canada Food Guide handout cited below, but its current locator and observation cover only the pork row. The handout separately labels a veal row. If accepted, cite that row separately and preserve the pork source claim and observation unchanged. |

The older offal review keeps calf and beef sweetbreads as separate held identities. Do not promote an offal candidate, or use `ris de veau`, as an alias for generic veal. No source or product-only claim from a branded entry is reused for this proposal.

## Bundled recipe demand

The scan covered all **114 manifest-listed recipe files and 1,123 structured ingredient rows**, and searched the recipe files for `veal`, `veau`, and `calf`. It found **zero** matches. No recipe link, recipe-specific amount, preparation form, or substitution context is supported. The mention of `veau à ragoût` in the ledger belongs to the separate unresolved stew-meat review and is not a bundled veal ingredient row.

If integrated, add the identity without recipe links. Keep `ingredient-ref-stew-meat` and recipe `090#8` unchanged.

## Measures, forms, and substitutions

- **One source-scoped portion:** Health Canada’s handout says its listed meat, fish, poultry, and shellfish servings are cooked, and its `Veal` row gives **75 g / 125 mL (½ cup)** for one Food Guide serving. This is dietary portion evidence, not a recipe quantity or a raw-to-cooked yield. If retained, store only 75 g as a cooked `portion_weight` observation with `quantityBasis: one legacy Food Guide serving`. The paired 125 mL is source wording, not a density, unit mapping, or mass-volume conversion. [R1006-S03]
- **No reusable amount or form:** The reviewed sources do not establish a generic recipe amount, household measure, density, package yield, raw/cooked form conversion, or neutral preparation form. CFIA’s cut names are cut-level nomenclature and should remain separate from this base identity. Leave `defaultDensity` null, `unitMappings` empty, and forms empty.
- **Substitution state:** A focused initial search for authoritative veal-replacement guidance (including university-extension and government sources) found no context-matched, directed exchange with a supported amount or method adjustment. General lifestyle advice about replacing veal in a named stew was not treated as evidence. The bundle has no veal line to ground a dish-specific rule. Keep `substitutionResearchState: not_yet_researched` for a future cut-, form-, dish-, and method-scoped review; add no global or contextual rule and no recipe-line substitution.

## Queue disposition

This proposal advances generic ingredient diversity. No commercial-roster-only item was pursued. If a queued task is limited to brand, product-line, flavour-family, SKU, or retailer-variant counts, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that line of work. Preserve existing branded rows and their evidence; review transferability before reusing any product-specific claim.

## Proposal source register

These source IDs were proposal-local when drafted; the R1006 integration registered them on the veal identity record.

| Source | Evidence and limits |
|---|---|
| **R1006-S01** | Office québécois de la langue française, [veau (GDT), food domain](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363317/veau), updated 2002, lines 21–49. Selects `veau`, identifies the `alimentation — viande de veau` domain, and gives English `veal`. A separate zootechnics entry uses `veau / calf` for the animal and is not used as meat terminology. Supports the bilingual base identity, not a cut, preparation state, portion, or substitution. |
| **R1006-S02** | Canadian Food Inspection Agency, [Veal — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/veal) and [Veau — Manuel de coupes de viande](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/coupes-viande/veau), definition of veal and species-qualified cut nomenclature. The manual uses maturity characteristics and a maximum warm-carcass weight of 190 kg for its regulated veal definition, then names cuts and modifiers separately. Supports Canadian meat scope and cut boundaries; it does not prove an exact retail product, recipe state, household amount, or substitution. |
| **R1006-S03** | Reused page, with a new veal-row locator: Health Canada, [Eating Well with Canada’s Food Guide — What is a Food Guide Serving of Meat and Alternatives](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/hpfb-dgpsa/pdf/food-guide-aliment/serving_meat-viande_portion-eng.pdf), PDF p. 1, cooked-serving note and `Veal` row. Explicitly lists veal as 75 g / 125 mL for one serving and says the listed servings are cooked. This legacy handout supports only a source-scoped cooked dietary portion. The existing pork observation remains separately owned and unchanged; the volume is not a conversion. |
| **R1006-R01** | Read-only audit of the current Section O checklist, active references and aliases, forms and match terms, legacy-import candidates, ledger source ownership, and all manifest-listed recipes. Confirms the point-in-time gap, zero bundled demand, and adjacent-record boundaries; it is not external identity or measurement evidence. |

## Recommendation

Add `ingredient-ref-veal` as identity-only `veal / veau` in `PROTEIN`, with no aliases, forms, recipe links, density, or unit mappings. If the source-scoped portion is accepted, add only the 75 g cooked Food Guide observation and keep the paired volume outside conversion data. Preserve all existing rows and source ownership. Keep substitution research open until a focused review supplies context-specific evidence; Section O remains open for its other species, cuts, offal, and cured-product work.

No software tests or builds were run. The app change only adds database JSON data, which `AGENTS.md` exempts from testing.

# WP02 B3 cornstarch bilingual picker alias review

- Reviewed: 2026-10-13
- Status: accepted and integrated on 2026-10-13.
- Scope: two searchable spelling/terminology variants for the existing `ingredient-ref-cornstarch` identity. This is not a new ingredient or process/form review.
- Source-ID prefix: `WP02-B3-CORN-STARCH-ALIAS-20261013-S01–S05`; checked against `docs/` and `app/` before drafting with no collision.

## Recommendation

**Add two aliases to the existing cornstarch reference:** English `corn starch` and French `amidon de maïs`. Keep the canonical display `cornstarch / fécule de maïs`. OQLF defines *amidon de maïs* as fine powder made from maize kernels and lists both `amidon de maïs` and `fécule de maïs` as preferred French terms; its English entry lists `corn starch`. A current Metro Canada English listing and Metro Québec French listing use the two proposed phrases for the same Selection SKU, product number 059749887199, 454 g. [S01–S03]

| Field or wording | Disposition | Boundary |
|---|---|---|
| Existing ID `ingredient-ref-cornstarch` | Retain; do not allocate another identity. | The existing row is `cornstarch / fécule de maïs`, category `FLOUR_AND_STARCH`, with no aliases, forms, density, or unit mappings. |
| English `corn starch` | Add as an English alias. | OQLF directly pairs it with *amidon de maïs*, and Metro's Canadian product title uses this spaced spelling for the same SKU sold under the French name *fécule de maïs*. [S01–S02] |
| French `amidon de maïs` | Add as a French alias. | OQLF lists it as a preferred French term alongside the current display `fécule de maïs`; the alias preserves the current display while making the other preferred term searchable. [S01, S03] |
| English `corn flour` | Keep unassigned to cornstarch. | OQLF labels it UK usage for starch and also records it for Québec whole-kernel maize flour. The catalog cannot scope aliases by locale; the separate whole-kernel flour identity and the existing picker boundary remain in force. [WP02-S88–S89; prior decision] |
| English `maize starch` | Do not add in this proposal. | OQLF labels this spelling UK usage. No need to expand beyond the directly attested Canadian `corn starch` wording. [S01] |
| `Maïzena` | Do not add. | OQLF identifies Maïzena as a trademark. [S01] |

The exact proposed data delta, if accepted, is limited to `aliasesEn: ["corn starch"]` and `aliasesFr: ["amidon de maïs"]` on the existing cornstarch reference. Keep both canonical names, the ID, category, forms, and numeric fields unchanged. Add no form, process-qualified identity, conversion, recipe link, or substitution rule.

## Identity and regional terminology boundary

OQLF's *amidon de maïs* entry defines the ingredient as a carbohydrate from maize kernels in fine-powder form, notes its use as a food thickener, lists `amidon de maïs` and `fécule de maïs` as preferred French terms, and pairs it with English `corn starch`. The note explains that *fécule* is more narrowly associated with underground plant parts in strict usage, but that this distinction is rarely applied and *fécule de maïs* is widespread. The current canonical French display is therefore well supported; the proposed alias adds the other OQLF-preferred wording without changing that display. [S01]

Metro's current English and French pages list Selection Corn Starch / Fécule de maïs Selection, both as 454 g and with product number 059749887199. This is direct Canadian bilingual retail evidence that both spellings identify the same ordinary cornstarch product. Package mass is included only to identify the listing; it does not establish a household measure. Do not infer Canadian origin of the product from the Canadian retailer. [S02–S03]

This proposal does not reopen the earlier locale collision review. OQLF's separate *farine de maïs* entry records finely ground maize flour and English `corn flour`, while its *amidon de maïs* entry marks that same English spelling as UK starch usage. Because aliases have no locale field, keep unqualified `corn flour` without an owner; retain the explicit `whole-kernel corn flour / farine de maïs` and `cornstarch / fécule de maïs` identities. [WP02-S88–S89; prior decision]

## Exact ownership and picker audit

The read-only audit used the repository's normalized search key (lowercase, compatibility decomposition, accent folding, punctuation-to-space, and whitespace collapse) across active reference displays and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs/names. Current snapshot: 1,385 active references, 100 forms, 63 legacy candidates, and 1,718 ledger records. No exact normalized owner exists for `corn starch`, `amidon de maïs`, or `maize starch` across those surfaces. `cornstarch` and `fécule de maïs` each have their one intended exact active owner, `ingredient-ref-cornstarch`. `farine de maïs` belongs to `ingredient-ref-whole-kernel-corn-flour`.

The current picker prefers complete normalized word-phrase matches across the result set, then falls back to substring matches. Projection against the current active references and the proposed aliases gives:

| Search query | Current results | With proposed aliases | Effect |
|---|---|---|---|
| `corn starch` | none | `ingredient-ref-cornstarch` | Adds one direct English search path to the existing row. |
| `amidon de maïs` | none | `ingredient-ref-cornstarch` | Adds one direct French search path to the existing row. |
| `cornstarch`; `fécule de maïs` | cornstarch row | same row | Existing canonical searches are unchanged. |
| `corn flour` | precooked corn flour; roasted corn flour; sorghum flour (through `guinea corn flour`); whole-kernel corn flour | same four rows | The ambiguous phrase remains unresolved; cornstarch is not added. |
| `farine de maïs` | masa harina; precooked corn flour; roasted corn flour; whole-kernel corn flour | same four rows | The French broader phrase remains unchanged and does not resolve to cornstarch. |
| `maize starch` | none | none | No unreviewed alias is introduced. |

No duplicate active-reference, form, legacy, or ledger key is created by the proposed aliases. The source-ID prefix above was unused in the reviewed archive before drafting.

## Recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. Nine rows in eight recipes are already linked to `ingredient-ref-cornstarch`; each original line uses `cornstarch`, not either proposed spelling. No recipe line uses exact `corn starch` or `amidon de maïs`. The existing links demonstrate ongoing use of the current ingredient identity, but no recipe relink or recipe edit is supported or needed for an alias-only picker change. One linked row says `2 tbsp cornstarch or arrowroot`; it remains attached to cornstarch and is not evidence that arrowroot is an alias. [current recipe corpus]

## Measurement, process, and substitution limits

The existing cornstarch row has `defaultDensity: null`, `unitMappings: []`, and no attached form. The ledger records `measurementState: blocked_pending_evidence` and `substitutionResearchState: blocked_pending_evidence`; this proposal changes neither state. Metro's 454 g figure is a package net mass. The OQLF definition describes a fine powder but supplies no household volume/mass pairing, density, grade, or kitchen conversion. The recipe corpus contains isolated volume or mass amounts, not paired measurements of the same product under a stated packing method. Keep the row's numeric fields empty. [S01–S03; current catalog and ledger]

An existing ledger finding, WP08-S12, reports **1 tbsp cornstarch per 1 cup liquid** versus **2 tbsp all-purpose flour per 1 cup liquid** for sauce/gravy thickening, including cheese sauce. It notes the visual difference (cornstarch gives a clear, glossy sauce; flour gives a cloudy, opaque one) and that flour works best in sauces prepared with fat, such as roux. This compares volumes for a fixed-liquid, thickener-role context; it is not a general mass or volume replacement ratio. The active package has no substitution rule, and the resolver cannot enforce the required role and method. Preserve the bounded ledger finding only; this alias packet adds no substitution, numeric behavior, or recipe-specific link. [WP08-S12]

## Prior-work reconciliation

- The [baking-flours and starches review](../batches/baking-flours-starches.md) accepted the existing cornstarch identity and documented why unqualified `corn flour` cannot be a global alias. This proposal adds only the OQLF-listed spelling `corn starch` and French synonym `amidon de maïs`; it leaves that collision decision intact.
- Recent WP02 B2/B3 rounds 8–10 reviewed pinto-, navy-, and Great Northern-bean flour identities. The [round 10 review](wp02-b2b3-next-gap-review-20261012-round10.md) and [integrated red kidney bean flour packet](../batches/wp02-b2b3-whole-red-kidney-bean-flour-integration-20261013/README.md) do not assign these cornstarch spellings or change cornstarch picker behavior.
- The broader WP02 B2/B3 checklist remains open; this focused alias review does not claim to complete its flour/starch coverage. [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt)

## Evidence register

Pages checked online on 2026-10-13. These proposal-local source IDs are not ledger additions.

| ID | Source and direct support | Limit |
|---|---|---|
| **WP02-B3-CORN-STARCH-ALIAS-20261013-S01** | Office québécois de la langue française, [*amidon de maïs* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais), last updated 2004. Defines maize starch as a fine powder from maize kernels; lists preferred French terms *amidon de maïs* and *fécule de maïs*; lists English `corn starch`; marks `corn flour` and `maize starch` as UK usage. | Terminology and identity definition; not a product-grade specification, household measure, or substitution test. |
| **WP02-B3-CORN-STARCH-ALIAS-20261013-S02** | Metro Canada, [Selection Corn Starch](https://www.metro.ca/en/online-grocery/aisles/pantry/baking-ingredients/flour-baking-essentials/corn-starch/p/059749887199), current English listing. Names Selection Corn Starch 454 g and product number 059749887199. | Canadian retail product-page wording and package identifier; package mass is not a kitchen measure, and the page does not establish product origin. |
| **WP02-B3-CORN-STARCH-ALIAS-20261013-S03** | Metro Québec, [Fécule de maïs Selection](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/fecule-de-mais/p/059749887199), current French listing. Names Fécule de maïs Selection 454 g and the same product number 059749887199. | Direct Québec French retail wording for the same listing; package mass is not a kitchen measure, and the page does not establish product origin. |
| **WP02-B3-CORN-STARCH-ALIAS-20261013-S04** | RecipeBook, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Implementation context for complete-phrase-first and substring-fallback search; no UI test was run for this proposal. |
| **WP02-B3-CORN-STARCH-ALIAS-20261013-S05** | RecipeBook, [prior corn-flour disambiguation record](../batches/baking-flours-starches.md), plus ledger entries `WP02-S88` and `WP02-S89`. | Documents the previously accepted regional ambiguity and current identity boundary; this proposal does not revise those decisions. |

## Root review and integration outcome

**Accepted as proposed.** The active `ingredient-ref-cornstarch` row now has `corn starch` in `aliasesEn` and `amidon de maïs` in `aliasesFr`. The canonical displays, category, forms, numeric fields, and recipes are unchanged; `corn flour` remains unassigned. The existing research record cites OQLF source `WP02-S89` for the accepted terminology. See the [integration record](../batches/wp02-b3-cornstarch-bilingual-alias-integration-20261013/README.md).

No tests were run because this change only adds database JSON data, per `AGENTS.md`.

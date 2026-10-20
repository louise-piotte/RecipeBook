# WP03 Section G — Bannock / banique identity review (Round 25)

- **Reviewed:** 2026-10-13
- **Status:** Proposal only; coordinator decision pending.
- **Scope:** One Canadian regional prepared-bread identity under the still-open Section G item for regional breads used as ingredients. This proposal does not represent one Indigenous bread tradition or formula.

## Recommendation

Add one identity-only reference for the Canadian/Québec prepared bread named **bannock** in English and **banique** in Québec French:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-bannock` |
| Category | `BAKING_MIXIN_AND_PANTRY` |
| English display | `bannock` |
| English aliases | `bannocks` |
| fr-CA display | `banique` |
| French aliases | `baniques`, `bannique`, `banniques`, `banik`, `baniks`, `pain banique`, `pain bannique` |
| Density / unit mappings | None |
| Forms / recipe links / package yield | None |
| Active conversions / substitutions | None |

The OQLF pairs English *bannock* with the preferred Canadian French terms *banique*, *bannique*, and *banik*. Its Québec entry defines a prepared compact bread while describing one common preparation, not a mandatory recipe. Recent Québec French use also includes *pain bannique*. Use the local term pair to represent this Canadian product identity; do not make the row a generic “Indigenous bread” identity or assign it to every First Nations, Inuit, or Métis food tradition.

This does not merge bannock with Mi’kmaq *luski*, the family-specific “Grandma’s Bangs,” or other community- and region-specific breads. The earlier North American sweep correctly kept those names and contexts distinct. R25 revisits only the bannock/banique identity because the main Section G checklist remains open and the exact Québec terminology and product scope now have a focused review. The OQLF also notes that *banique* is a Canadian French term derived from English *bannock*; this linguistic note is not used as a claim about the food’s origin.

## Why this remains Section G work

The active [Section G checklist](../../RecipeBook-global-ingredient-catalog-plan.txt) still includes regional breads used as ingredients. Its later identity reviews cover specific breads such as injera, chapati, bagel, focaccia, and arepa, plus the generic `flatbread / pain plat` family. None creates an active bannock/banique identity. The earlier [WP06 North American cuisine sweep](wp06-north-american-cuisine-gap-sweep-20261009.md) mentions bannock alongside luski and Grandma’s Bangs, but leaves all three proposal-only and explicitly rejects collapsing them into one family. R25 preserves that boundary while reassessing the narrower OQLF-defined bannock/banique product name.

The prepared bread is separate from its flour inputs and from tortilla, generic flatbread, and bread-roll identities. A similar shape or cooking use does not make these products synonyms or recipe substitutions.

## Live ownership and recipe-demand audit

Snapshot checked on 2026-10-13.

| Artifact | Current state and audit result |
|---|---|
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,352 references. No reference owns `bannock`, `banique`, `bannique`, `banik`, or the proposed ID. Nearby rows include `ingredient-ref-flatbread`, `ingredient-ref-bread-roll`, and named breads; none owns these proposed exact terms. |
| [Ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 98 forms. No form label or match term contains the proposed names. |
| [Legacy import identities](../legacy-import-identities.v1.json) | 64 candidates. No bannock/banique candidate or proposed ID exists. |
| [Research ledger](../research-ledger.v1.json) | 1,671 records and 6,527 source entries. No record currently establishes a bannock/banique identity. The shared Parks Canada source was cited as WP06 source S16 in the earlier proposal, but was not integrated into the live ledger. |
| Recipe corpus | All 114 manifest-listed files and 1,123 ingredient rows were scanned for `bannock`, `banique`, `bannique`, `banik`, `pain banique`, `pain bannique`, `luski`, and fry-bread spellings. There are 0 matching rows and 0 recipe-text hits, so no recipe link is proposed. The corpus totals 753,792 bytes; its manifest-ordered SHA-256 is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. |

No recipe demand means this is source-backed coverage, not a relink request. No source ID under the proposed R25 prefix or source URL below is currently used by the research ledger. The Parks Canada page reuses the citation from WP06 source S16 rather than assigning a second source ID to the same page.

## Picker projection and boundaries

The current [picker](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds case, accents, ligatures, punctuation, and spacing; it prefers a complete word phrase before partial matching. The exact proposed terms have no active picker owner today.

| Query | Current result | With proposal | Boundary |
|---|---|---|---|
| `bannock`, `bannocks` | No result | `ingredient-ref-bannock` | Canadian/Québec bannock sense documented by OQLF. |
| `banique`, `baniques`, `bannique`, `banniques`, `banik`, `baniks` | No result | `ingredient-ref-bannock` | OQLF-listed Québec French spellings plus regular plural search forms. |
| `pain banique`, `pain bannique` | No result | `ingredient-ref-bannock` | Current French compounds attested by Parks Canada and L’Itinéraire; the broad `pain` query will consequently include this row among other bread results. |
| `flatbread`, `pain plat` | `ingredient-ref-flatbread` | Same | Keep the generic flatbread family separate. |
| `bread roll`, `petit pain` | `ingredient-ref-bread-roll` | Same | Do not merge with the generic roll identity. |
| `luski`, `Grandma’s Bangs`, `fry bread`, `frybread` | No result | No result | These names and product traditions are not aliases. |
| `Scottish bannock` | No result | No result | Do not use the Canadian row for an explicitly Scottish oat- or barley-based product. A bare `bannock` query follows the Québec/Canadian OQLF sense in this catalog. |

Do not add generic `galette`, `flatbread`, `bread`, `fry bread`/`frybread`, community-specific bread names, or flour names as aliases. Do not add `bannock` as a form of flatbread, tortilla, or bread roll. The Scots dictionary also documents distinct Scottish bannock uses; a recipe explicitly calling for Scottish oat- or barley-based bannock should not be linked to this Canada-focused row merely because the English word is shared.

## Identity, forms, measures, and substitutions

- **Identity:** The OQLF’s Canadian English/French term pair supports a named prepared-bread identity. Keep the row scoped to the Canadian/Québec bannock/banique sense and preserve the variation described by its sources. Do not state that all Indigenous communities share one bannock tradition or one recipe.
- **Forms:** Add no forms. Sources describe several cooking approaches and ingredient variations; they do not establish a transferable form taxonomy for the catalog.
- **Measurements:** Add no density, unit mapping, household measure, count-to-mass conversion, or package yield. Parks Canada publishes amounts for one test-kitchen adaptation of a Métis recipe; those recipe quantities are not generic bannock measurements.
- **Substitutions:** Add no global or contextual substitution. Shared shape, meal role, or ingredients do not establish that bannock can replace tortilla, flatbread, roll, luski, or another regional bread in a recipe.
- **Recipe links:** Add none; the bundled corpus has no matching ingredient row.

## Evidence register

| ID | Source and supported claim | Limits |
|---|---|---|
| **WP03-G-BANNOCK-20261013-R25-S01** | Office québécois de la langue française, [*banique* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26501672/banique), updated 2008. Pairs English `bannock` with the preferred French terms `banique`, `bannique`, and `banik`; defines the prepared bread and identifies `banique` as Canadian French. | Terminology and Québec product scope. The definition is not a single recipe, a universal Indigenous history, or a measurement standard. |
| **WP06-NA-CUISINE-20261009-S16** | Parks Canada, [*Pain banique*](https://parcs.canada.ca/culture/gourmand-gourmet/recette-recipe66), modified 2025-03-19. The French page uses the compound `pain banique`; its page identifies one Rocky Mountain House recipe prepared by Métis interpreters and says this particular recipe’s origin is unknown. | Reused from the earlier WP06 proposal. Supports one page’s naming and one adapted recipe, not pan-Indigenous origin, a universal recipe, or equivalence with luski or Grandma’s Bangs. |
| **WP03-G-BANNOCK-20261013-R25-S02** | L’Itinéraire, [*Café Sanaaq : un mélange des cultures autochtones et québécoise*](https://www.itineraire.ca/cafe-sanaaq-un-melange-des-cultures-autochtones-et-quebecoise/), 2026-06-15. Current Montréal French-language coverage uses `pain bannique` and describes a Café Sanaaq context. | Supports contemporary local wording only. The article is not used as a universal history or terminology ruling for every Indigenous nation. |
| **WP03-G-BANNOCK-20261013-R25-S03** | Dictionaries of the Scots Language, [*bannock* (Scottish National Dictionary)](https://www.dsl.ac.uk/entry/snd/bannock). Records Scottish senses involving oatcake and oat/barley/pea meal. | Establishes a separate Scottish use of the English word; it does not define the Canadian/Québec product or its French name. |

## Review record

- Compared the open Section G checklist, R21–R24 prepared-bread proposals, the earlier WP06 North American sweep, live references/forms/legacy identities, ledger, and all manifest-listed recipes.
- Checked proposed source IDs, URLs, exact picker ownership, recipe demand, and query boundaries against the current files and picker implementation.
- No catalog JSON, ledger, generated file, plan, roadmap, code, or test was edited. No Android, unit, instrumentation, or emulator tests were run for this proposal-only Markdown review.
- This file is UTF-8 without BOM, has a final newline, and contains no mojibake markers.

## Coordinator decision

**Accepted as an identity-only reference.** Added `ingredient-ref-bannock`, displayed as `bannock / banique`, with the proposed OQLF and source-attested French aliases. The decision is scoped to the Canadian/Québec prepared-bread sense; Scottish bannock, luski, and Grandma’s Bangs remain separate. No forms, measurements, recipe links, conversions, yields, or substitutions were added.

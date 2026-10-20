# WP03 Section F R479 — Irish-oat terminology and steel-cut-oat picker ownership

- **Review date:** 2026-10-17
- **Scope:** One terminology gap under the open Section F identity and terminology work: route the documented English names `Irish oats` and `pinhead oats`, and Québec French `avoine irlandaise`, to the existing steel-cut-oats reference.
- **Recommendation:** Accept a narrow alias update to `ingredient-ref-steel-cut-oats`. Keep its display as `steel-cut oats / avoine découpée`. Add no new ingredient identity, form, number, recipe link, conversion, yield, or substitution.
- **Status:** Evidence proposal only. No shared catalog, ledger, checklist, roadmap, manifest, or generated-index files were changed.

The open Section F work includes remaining identity and terminology coverage and regional cereal/preprocessed-grain candidates ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L552), [regional cereal item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4342)). This is a small, concrete picker-ownership gap within the existing cut-oat identity, not a new cereal product class.

## Proposed disposition and data delta

Keep `ingredient-ref-steel-cut-oats` and its canonical display unchanged. Add the source-attested aliases:

```json
{
  "id": "ingredient-ref-steel-cut-oats",
  "nameEn": "steel-cut oats",
  "nameFr": "avoine découpée",
  "aliasesEn": ["Irish oats", "pinhead oats"],
  "aliasesFr": ["avoine irlandaise"],
  "defaultDensity": null,
  "unitMappings": []
}
```

OQLF’s current GDT entry (updated 2024) names `avoine découpée` as its preferred French term, defines the product as whole oats cut into pieces with steel blades, and lists `steel-cut oats`, `Irish oats`, and `pinhead oats` as English terms [WP03-S60]. RICARDO explicitly calls the cut oats `avoine irlandaise` in its Québec recipe note [S01]; Bob’s Red Mill Canada independently uses `flocons d’avoine irlandais` for its cut-oat product [S02]. Together these support aliases on the existing cut-oat row rather than a second reference.

Keep the following out of the proposed alias arrays:

- **`Irish oatmeal` and bare `oatmeal`:** the evidence directly supports `Irish oats`, while the broader oatmeal wording is held as ambiguous in the oat-family research. Do not expand it by inference.
- **`gruau irlandais`:** RICARDO uses this for the prepared recipe/dish title. Keep it as dish wording, not as a dry-ingredient alias.
- **`avoine écossaise`:** R109 found local use for cut oats but did not assign it to the cut-oat row. The active `Scottish oatmeal / gruau écossais` row already owns English `Scottish oats`; adding a close Scottish phrase risks merging two distinct oat products.
- **`flocons d’avoine irlandais`:** Bob’s Red Mill attests this product wording, but adding the phrase would make a broad `flocons d’avoine` query return steel-cut oats alongside flake identities. Keep the alias set narrow and use the directly attested singular alias `avoine irlandaise` instead.
- **`avoine épointée`:** OQLF explicitly discourages this term; RICARDO’s use of it does not override that guidance.

The proposal requires only an alias-list change on the existing row and its research-ledger decision/source references if accepted. Update the reference timestamp when integrating. Do not alter canonical display, category, density, unit mappings, forms, or substitution records.

## Current ownership and archive audit

Read-only live snapshot: **1,757 references, 142 forms, 56 legacy-import candidates, and 2,116 research-ledger records**.

| Surface | Finding |
|---|---|
| Active references | `ingredient-ref-steel-cut-oats` exists as `steel-cut oats / avoine découpée` with empty aliases. No exact active alias/display owner was found for `Irish oats`, `pinhead oats`, or `avoine irlandaise`. `ingredient-ref-scottish-oatmeal` remains separate and owns `Scottish oats` / `Scotch oatmeal`. |
| Forms | No form is attached to steel-cut oats, and none of the proposed terms appears in the 142 form labels or match terms. No form or form hint is proposed. |
| Legacy import | No exact candidate or alias match for the proposed terms among the 56 legacy candidates. |
| Research ledger | The existing `ingredient-ref-steel-cut-oats` record already owns OQLF source `WP03-S60` at the exact URL below. No ledger record contains an exact `Irish oats`, `pinhead oats`, or `avoine irlandaise` identity/alias decision. The RICARDO and Bob’s Red Mill URLs below have no exact URL owner in the live ledger; the two R479 source IDs are proposal-local and currently unallocated. |
| Proposal and batch archive | Search across `docs/catalog`, the plan, and roadmap found one earlier discussion of `avoine irlandaise`: R109’s oat-groats display review. R109 explicitly says Québec sources use it for cut oats and excludes it from the whole-groat row, but it did not add the phrase to the separate steel-cut row. No prior proposal assigns the English `Irish oats` or `pinhead oats` terms, or the French phrase, to that active row. This review completes that adjacent ownership step without reopening the R109 whole-groat decision. See the [R109 proposal](wp03-section-f-oat-groats-quebec-display-review-r109-20261014.md) and [integration note](../batches/wp03-section-f-oat-groats-quebec-display-review-integration-20261014/README.md). |

The boundary remains: whole oat groats are intact hulled kernels; steel-cut oats are whole oat kernels cut into pieces; Scottish oatmeal is a separately named coarse-ground oat product; rolled, quick, and instant oats remain separate; prepared `gruau` remains a dish. R109’s hold on `amande(s) d’avoine complète(s)` remains untouched.

## Picker and query effects

The static projection below follows the normalization and phrase-first matching behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using the current references and forms. It is a local data projection, not emulator QA.

| Query | Current results | After proposed aliases | Effect |
|---|---:|---:|---|
| `Irish oats` | 0 | 1 | Returns `ingredient-ref-steel-cut-oats`. |
| `pinhead oats` | 0 | 1 | Returns `ingredient-ref-steel-cut-oats`. |
| `avoine irlandaise` | 0 | 1 | Returns `ingredient-ref-steel-cut-oats`. |
| `steel-cut oats` / `steel cut oats` | 1 | 1 | Existing English phrase remains stable under punctuation folding. |
| `avoine découpée` | 1 | 1 | Existing preferred Québec French phrase remains stable. |
| `oats` | 9 | 9 | The added terms do not add another reference; steel-cut oats already matches. |
| `avoine` | 15 | 15 | The added phrase remains within the existing steel-cut row. |
| `Irish oatmeal` / `gruau irlandais` | 0 | 0 | Intentionally remain unowned. |

Do not add `avoine écossaise` or `flocons d’avoine irlandais`; those phrases would blur the adjacent Scottish identity or broaden general oat-flake queries.

## Recipe corpus scan

The manifest-ordered scan parsed **all 114 recipe files and 1,123 structured ingredient rows**. It checked complete recipe JSON and ingredient-row content for `Irish oats`, `pinhead oats`, `Irish oatmeal`, `avoine irlandaise`, `avoine écossaise`, `avoine découpée`, `avoine épointée`, `gruau irlandais`, `steel-cut oats`, and `steel cut oats`.

- Every listed phrase had **0 matching recipe files and 0 matching ingredient rows**.
- No ingredient row links to `ingredient-ref-steel-cut-oats`.
- The corpus has four oat ingredient rows, all already linked to rolled or quick oats: recipe 001 row 1 and recipe 065 row 1 use rolled oats; recipe 024 row 6 and recipe 047 row 4 use quick oats. None establishes a steel-cut-oat recipe link or alias demand.
- Corpus fingerprint: **753,988 recipe-file bytes**, manifest-ordered SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` (relative recipe path, NUL, exact bytes, NUL for each manifest entry).

No recipe link or source-specific recipe amount is proposed.

## Forms, measurements, and substitutions

- Add no form, preparation state, yield, or form match term. OQLF’s cut-kernel definition does not imply a reusable preparation form.
- Keep `defaultDensity` null and `unitMappings` empty. RICARDO’s single recipe lists **180 g (1 cup)** for its pressure-cooker recipe; that source-specific quantity does not establish a generic cup conversion or density.
- RICARDO suggests replacing the cut oats with large-flake oats in that particular pressure-cooker recipe and reducing its cook time. This is recipe-specific advice, not a general substitution rule. The bundled corpus contains no matching cut-oat recipe context, so add no global or contextual substitution, yield, or recipe-line substitution link.
- Add no active conversions, package amounts, or generic numeric behavior.

## Sources and exact URL ownership

OQLF source `WP03-S60` is reused from the existing steel-cut-oats ledger record; its exact URL is already owned there. The two current product/recipe URLs have no exact URL owner in the ledger. R479 IDs below are proposal-local, not ledger mutations.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-S60` | OQLF, [avoine découpée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26574686/avoine-decoupee), page updated 2024. | Preferred French display; defines oats cut by steel blades; English term list includes `steel-cut oats`, `Irish oats`, and `pinhead oats`; explicitly discourages `avoine épointée`. This is terminology authority, not a source for recipe amounts or cooking substitutions. Exact URL is already registered to `ingredient-ref-steel-cut-oats` in the ledger. |
| `WP03-STEELCUT-IRISH-ALIAS-R479-20261017-S01` | RICARDO, [Gruau irlandais à l’autocuiseur](https://www.ricardocuisine.com/recettes/8763-gruau-irlandais-a-l-autocuiseur), current Québec recipe page. | The note identifies `avoine irlandaise` as another name for the cut-oat ingredient and describes whole grains cut into pieces. Page ingredient amount and large-flake replacement apply to this one recipe only. It uses the discouraged phrase `avoine épointée`; that term is not adopted. Exact URL was not already present in the ledger. |
| `WP03-STEELCUT-IRISH-ALIAS-R479-20261017-S02` | Bob’s Red Mill Canada, [Flocons d’avoine coupée biologiques](https://www.bobsredmill.ca/produit/flocons-davoine-coupee-biologiques), French Canadian manufacturer page. | Names and describes the manufacturer’s steel-cut-oat product and says it is also called `flocons d’avoine irlandais`. Corroborates the Irish/cut-oat relationship in Canadian French product usage. This is manufacturer terminology, not an OQLF ruling or reusable measurement source. Exact URL was not already present in the ledger. |

## Disposition

Recommend adding English aliases `Irish oats` and `pinhead oats`, and French alias `avoine irlandaise`, to `ingredient-ref-steel-cut-oats`, while retaining `steel-cut oats / avoine découpée` as the display. Keep `Irish oatmeal`, `gruau irlandais`, `avoine écossaise`, and the broad `flocons d’avoine irlandais` wording out of the active aliases for the scope reasons above. No other catalog behavior is supported by this review.

This is a documentation-only evidence proposal. No tests, build, or emulator checks were run.

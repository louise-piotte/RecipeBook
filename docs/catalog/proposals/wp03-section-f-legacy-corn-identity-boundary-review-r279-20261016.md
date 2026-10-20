# WP03 Section F — legacy `corn / maïs` identity boundary review (R279)

## Packet record

- **Review date:** 2026-10-16
- **Work package:** WP03, Section F
- **Plan anchor:** [remaining Section F identity and terminology coverage](../../RecipeBook-global-ingredient-catalog-plan.txt#L528)
- **Scope:** the former unreviewed legacy candidate `ingredient-ref-corn` (`corn / mais`), its possible relationship to existing corn-kernel and corn-on-the-cob identities, and its recipe, picker, numeric, and substitution boundaries.
- **Recommendation:** reject `ingredient-ref-corn` as a separate catalog identity. Do not create a generic `corn / maïs` row, alias bare `corn` to corn kernels, or map the legacy candidate automatically to `ingredient-ref-corn-kernels`. Keep the existing state-qualified rows and require recipe context to choose among them.
- **Status:** accepted and integrated. Removed the unresolved legacy candidate and retained its source-backed rejection in the research ledger; no active reference, recipe, or generated index changed.
- **Proposed integration README:** `docs/catalog/batches/wp03-section-f-legacy-corn-boundary-hold-integration-r279-20261016/README.md`.

## Decision

The old `corn / mais` pair names the plant and crop broadly. It does not distinguish loose kernels, corn on the cob, dry field-corn kernels, processed hominy, or corn-derived products. The active catalog already represents those narrower products separately. A new generic row would add another broad choice without resolving what the recipe or user intends, and it would duplicate the exact French display `maïs` already used by `corn kernels / maïs`.

The live picker confirms that the broad terms are already multi-result searches: `corn` returns 34 references and `maïs` returns 35. A hypothetical `corn / maïs` row would raise those sets to 35 and 36 while creating two references with the exact French term `maïs`. The bundled recipes contain explicit requests for corn on the cob and frozen corn kernels, plus corn syrup; none requests bare corn. No evidence justifies choosing the kernel row as a universal destination for the legacy identity.

The OQLF distinguishes the broad crop name `maïs` from the product phrase `maïs en grains / kernel corn`. Health Canada's CNF has a cooked sweet-corn food code that expressly combines corn served on or off the cob. These sources support keeping the legacy crop term separate from product-state identities. Their portion data remain scoped to the named cooked sweet-corn food code or individual recipe.

## Pre-integration ownership and archive audit

| Surface | Finding |
|---|---|
| Legacy import list | `docs/catalog/legacy-import-identities.v1.json` contains `ingredient-ref-corn`, English `corn`, French `mais`, category `VEGETABLE_AND_AROMATIC`, no aliases, and `reviewState: unreviewed`. The French spelling normalizes to `maïs`. |
| Research ledger | `ingredient-ref-corn` is an unreviewed `candidate` with no sources; its sole decision asks for identity and alias reconciliation. Its measurement and substitution states are `not_yet_researched`. No `ingredient-ref-corn` record exists in the canonical references. |
| Existing active kernel identity | `ingredient-ref-corn-kernels` is `corn kernels / maïs`, category `VEGETABLE_AND_AROMATIC`, with empty aliases, null density, and empty unit mappings. Its ledger record has no sources or decisions. |
| Adjacent active identities | The package separately has corn on the cob, dry color-qualified kernel products, dried sweet corn, popcorn, hominy corn, grits, cornmeal, corn flours, corn starches, corn flakes, corn poha, corn syrup, corn oil, tortillas, and other named products. These are not synonyms for the broad legacy label. |
| Forms and rules | There is no corn form attached to `ingredient-ref-corn-kernels`; the sole corn-named form is dried corn husks attached to `ingredient-ref-corn-husks`. No corn-specific unit conversion, form conversion, package yield, global substitution, or contextual substitution rule was found. |
| Prior decisions | Searches of the plan, roadmap, proposal archive, batch archive, active references, forms, ledger, legacy list, and recipe package found no focused review of the exact legacy ID `ingredient-ref-corn`. Related corn-product reviews address their own product scopes and do not adjudicate this generic candidate. |

The ownership scan covered 1,658 active references, 125 forms, 61 legacy import candidates, and 2,006 ledger records. The current active French key `maïs` belongs to `ingredient-ref-corn-kernels`; the legacy record would duplicate that key if allocated as written. No active reference has `corn` as its complete stored name or alias, although the word appears within many qualified product names.

## Québec terminology and product boundary

The OQLF entry for `maïs` gives English `corn`, identifies *Zea mays*, and says the word denotes both the plant and the grain it produces. It therefore supports the general bilingual crop name but does not specify one recipe-ready ingredient state. The separate OQLF entry for `maïs en grains` gives the English equivalent `kernel corn` and notes that sweet corn is sold in kernels, canned or natural. That entry supplies a much narrower kernel-product term; it does not make the legacy bare word `corn` equivalent to loose kernels in every recipe context.

Health Canada's food code 2068 names `Corn, sweet, yellow, on or off the cob, boiled, drained / Maïs sucré, jaune, avec ou sans épi, bouilli, égoutté`. Its two physical presentations share one cooked-food code and are not a basis for merging the app's uncooked kernel and cob identities. The current Canada.ca chowder recipe instead specifies `maïs en grains`, gives one recipe-specific cup amount, and permits fresh or frozen corn. That recipe is useful evidence of a kernel request; its amount is not a reusable catalog measure.

Keep these boundaries:

- `corn kernels / maïs`: current generic kernel reference; retain unchanged.
- `corn on the cob / maïs en épis`: current whole-ear reference; retain unchanged.
- named dry, colored, dried, popped, hominy, milled, and prepared products: keep their existing identities.
- bare legacy `corn / maïs`: no standalone identity and no automatic default mapping.

Do not use `blé d'Inde` as an alias for this candidate. OQLF marks it as a Québec colloquial term for the general plant/crop, and adding it to a kernel-only row would narrow its scope without evidence. Do not add `maïs en grains` to only the generic kernel row in this packet: the current picker would turn the broad phrase into a singleton despite other distinct kernel products. That alias question needs an explicit family-wide picker decision.

## Picker projection

The projection below follows `IngredientSearch.kt`: complete normalized word-phrase matches are returned first, then substring matching is used only when no exact phrase matches. It includes reference names, aliases, and attached form terms.

| Query | Current results | Interpretation |
|---|---:|---|
| `corn` | 34 | A broad search spanning kernels, cob, dry color-qualified corn, hominy, grits, flour, syrup, oil, couscous, cereal, and related products; it also matches sorghum through `guinea corn`. |
| `maïs` | 35 | A broad French search spanning corn products and names; the exact `maïs` display belongs to the current kernel row. |
| `corn kernels` | 6 | Generic and named kernel identities are visible together. |
| `corn on the cob` | 1 | The explicit whole-ear product remains distinguishable. |
| `maïs en grains` | 0 | The OQLF product phrase is not currently stored as an active term. No alias is proposed here because a one-row alias could suppress other kernel choices. |

If a generic `corn / maïs` row were added with the legacy names, `corn` and `maïs` would each gain one broad result, while the French exact-key set would contain two entries named `maïs`. This creates no useful disambiguation and does not provide a safe mapping from a recipe's bare `corn` line to kernels or ears.

## Recipe demand

The manifest-listed corpus has **114 recipe files and 1,123 ingredient rows**. A whole-word scan of all serialized recipe fields found corn/maïs wording in 25 files, but only five ingredient rows:

| Recipe line | Current interpretation |
|---|---|
| Recipe 040, `1 cup corn syrup` | Corn syrup, not the vegetable/cereal candidate. |
| Recipe 044, `2 ears corn on the cob` | Explicit whole ears; already linked to `ingredient-ref-corn-on-the-cob`. |
| Recipe 057, `1/4 cup corn syrup` | Corn syrup, not the candidate. |
| Recipe 078, `1/2 cup frozen corn kernels` | Explicit frozen kernels; already linked to `ingredient-ref-corn-kernels`. |
| Recipe 109, `1/3 cup dark corn syrup` | Dark corn syrup, not the candidate. |

There are zero bare `corn` or `maïs` ingredient lines and zero recipe links to the legacy candidate ID. No recipe link, relink, or recipe-text edit is proposed.

## Measures, forms, conversions, yields, and substitutions

The legacy candidate has no researched measure, density, form, conversion, yield, or substitution evidence. The active `corn kernels` row keeps `defaultDensity: null` and `unitMappings: []`; it has no attached corn-kernel form. The dried corn-husk form belongs to `ingredient-ref-corn-husks` and is unrelated.

Health Canada food code 2068 lists 100 mL = 69.3 g, 250 mL = 173.3 g, small/medium/large ears of 89/103/118 g, and 45% refuse for the particular cooked, drained, yellow sweet-corn entry. These values combine a named cooking state and presentations with or without the cob; do not apply them to dry corn, frozen kernels, a generic corn identity, or the active corn-kernels row. Canada.ca's chowder recipe calls for 250 mL (1 cup) of kernels, but that is one recipe quantity, not a general density or serving conversion.

No transferable preparation yield, package yield, mass-volume mapping, dry-to-cooked conversion, kernel-to-ear conversion, or substitution ratio is supported. Keep substitutions between corn kernels, corn on the cob, hominy, popcorn, and milled corn products contextual and recipe-specific unless evidence later supports a defined rule.

## Source register

| ID | Source | Support and limits |
|---|---|---|
| **Reused: `WP03-MAIZE-ARRAW-R8-20261013-S04`** | Office québécois de la langue française, [maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082788/mais); rechecked 2026-10-16. | Gives preferred French `maïs`, English `corn`, and *Zea mays*; the entry says the term names both the plant and grain. This is crop terminology, not an ingredient-state decision. Reuse the existing ledger source ID; do not duplicate the URL. |
| **Reused: `WP03-DSC-R112-20261014-S03`** | Office québécois de la langue française, [maïs en grains](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18057878/mais-en-grains); rechecked 2026-10-16. | Gives `maïs en grains / kernel corn` and notes sweet corn sold in kernels. This narrower term distinguishes kernel presentation; it does not define bare `corn` or authorize a singleton alias for all kernel products. Reuse the existing ledger source ID. |
| `WP03-CORN-LEGACY-R279-S01` | Health Canada, [Canadian Nutrient File food code 2068](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2068), `Corn, sweet, yellow, on or off the cob, boiled, drained / Maïs sucré, jaune, avec ou sans épi, bouilli, égoutté`; page modified 2019-03-01. | Documents one cooked food code spanning on-cob and off-cob servings and source-specific portions. It does not provide a generic corn measure or conversion. |
| `WP03-CORN-LEGACY-R279-S02` | Health Canada, [Chaudrée de palourdes crémeuse](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/manger-favoriser/cuisine/recettes/chaudree-palourdes-cremeuse.html), current page dated 2026-03-30. | Uses 250 mL (1 cup) `maïs en grains` and says fresh or frozen corn can be used. This is direct recipe evidence for a kernel request; its amount is recipe-specific. |

Source-ID and URL ownership were checked against the live ledger and proposal archive. The two OQLF records already have registered ledger IDs and are reused above. The two Health Canada URLs have no existing ledger source entry; their proposal-local IDs are unique.

## Proposed resolution and integration checks

1. Remove `ingredient-ref-corn` from `legacy-import-identities.v1.json`, which is the unresolved-candidate list, and record the rejected disposition in its research-ledger record (`identityState: rejected` plus a source-backed rejected decision). Do not mark it merged into `ingredient-ref-corn-kernels`, because the bare source term also permits an ear or another corn product. This follows the existing rejected `ingredient-ref-bread-cubes` precedent: its candidate was removed from the legacy list while its rejection remains in the ledger.
2. Add no active `corn / maïs` reference or alias. Keep the active kernel, ear, and derived-product references unchanged.
3. Leave active density, unit mappings, forms, measures, conversions, yields, recipe links, and substitutions unchanged. The candidate's research states may be updated to document that the reviewed sources do not support transferable numeric or substitution behavior.
4. Add this disposition as a checked child under the open Section F item at plan line 528. The Section F parent remains open.
5. Create the integration README at `docs/catalog/batches/wp03-section-f-legacy-corn-boundary-hold-integration-r279-20261016/README.md` and record a dated roadmap entry. Root owns those shared integration edits.

No tests, builds, or emulator checks were run; this packet changes documentation only.

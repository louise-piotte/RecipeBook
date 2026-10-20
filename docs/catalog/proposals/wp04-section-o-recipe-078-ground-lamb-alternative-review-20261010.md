# WP04 Proposal: Recipe 078 Ground-Lamb Alternative

**Review date:** 2026-10-10

**Disposition:** Review complete. The existing source line and bilingual note remain unchanged; the plan records this as a recipe-local alternative with no shared substitution rule.

**Scope:** Determine whether the source-stated ground-lamb option on Shepherd’s Pie recipe `078#3` should become a linked substitution or remain a recipe-local note.

## Recommendation

Keep the ground-lamb alternative in `078#3` as the current bilingual note and exact source line. Do not create an `IngredientLineSubstitution`, `ContextualSubstitutionRule`, ground-lamb reference, or general beef-to-lamb substitution from this review.

The publisher explicitly says this recipe can use ground beef or ground lamb and lists both after one one-pound quantity. That is enough evidence for this recipe-local editorial option. It is not evidence of a general species equivalence. The current rule model cannot enforce this exact recipe-and-line scope: contextual rules are keyed by ingredient references and evaluated against broad dish-type tags; they have no recipe or line scope, and a linked contextual rule still passes the same context checks. The recipe is tagged only `Main Dish`, `Oven`, `Quebec`, and `Shareable`, not specifically `Shepherd’s Pie`. A `Main Dish` rule would be broader than the evidence.

The existing note is the faithful representation for now. A bare line-substitution link is not a useful substitute: the current link model has no target ingredient-reference field, and a record with no rule ID would not produce a structured suggestion in the resolver. A later model change could support a true recipe-line alternative with a target identity, exact line scope, and evidence, but this packet does not propose that change or promote a rule.

## Exact saved row and source evidence

The current [bundled recipe file](../../../app/src/main/assets/seed/bundled-library/recipes/078-pate-chinois-shepherd-s-pie-d356eec5-b3c4-4e22-b943-63900317e569.v1.json) identifies its source as The Wholesome Dish and stores the relevant row as:

| Field | Saved value |
|---|---|
| Line ID | `d356eec5-b3c4-4e22-b943-63900317e569-ingredient-3` |
| `originalText` | `1 lb. 90% lean ground beef -or ground lamb` |
| `quantity` / `unit` | `1` / `lb` |
| `ingredientRefId` / `ingredientName` | `ingredient-ref-ground-beef` / `ground beef` |
| `notes.en` | `ground lamb can be used instead` |
| `notes.fr` | `de l'agneau haché peut être utilisé à la place` |
| `substitutions` | absent; domain default is empty list |

The [current publisher page](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/) directly matches the saved line: its ingredient list gives one pound of `90% lean ground beef -or ground lamb`. The introduction explains that the author wrote this recipe to allow either ground beef or ground lamb; its instructions likewise say to add either meat. The page is dated February 9, 2019 and was directly accessed on 2026-10-10. No source-version conflict was observed for this row.

The line’s single one-pound amount is attached to both alternatives in this recipe. That establishes the publisher’s recipe formula only; do not treat it as a transferable measurement or general conversion rule. The source does not give a separate ground-lamb composition claim, product label, brand, or SKU. The `90% lean` phrase grammatically qualifies the ground-beef option; do not carry it over to lamb.

The previous [ground-beef qualifier follow-up](wp04-ground-beef-90-percent-lean-line-followup-20261010.md) records that the exact line was restored to the bundle and that the ground-lamb wording remains recipe-local. The [ground-meat qualifier review](wp04-section-o-ground-meat-qualifier-review-20261010.md) separately found this to be the corpus’s only ground-lamb mention, and only as this option. This review narrows the question to whether that phrase should become a structured substitution; it does not reopen the source-text correction.

## Current identity and research evidence

The active [ingredient-reference file](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) contains `ingredient-ref-ground-beef` (`ground beef / bœuf haché`) but no ground-lamb reference and no lamb/agneau alias. No `ground lamb` / `agneau haché` reference row is proposed here. The current line remains linked to ground beef, the first-listed product, and preserves lamb in the source text and bilingual note.

The [research-ledger entry](../research-ledger.v1.json) for `ingredient-ref-ground-beef` already records the publisher page and an accepted decision to preserve the exact line and the recipe-local ground-lamb note. Its support text explicitly limits that source to the wording and this dish-specific choice; it does not treat the text as a general substitution relation. No ground-lamb record or rule-specific ledger record exists for this option. The current beef ledger measurement and substitution states remain `not_yet_researched`.

## Why the current substitution model does not fit this exact scope

| Model piece | Current shape and behavior | Consequence for `078#3` |
|---|---|---|
| `ContextualSubstitutionRule` | References `fromIngredientRefId` and `toIngredientRefId`, with a ratio/offset, risk, confidence, notes, and broad `allowedDishTypes`, excluded dish types, roles, and methods. There is no `recipeId` or `ingredientLineId`. | Requires a target ingredient reference that is currently absent. A contextual rule cannot encode “only line `d356…-ingredient-3` in this source recipe.” |
| Recipe context in the resolver | The resolver derives context from recipe tags whose category is `DISH_TYPE`. Explicitly linked contextual rules pass the same context and identity checks as discovered rules. The current resolver also rejects contextual rules with nonempty allowed/excluded role or allowed-method constraints. | `078` has the broad `tag-main-dish` plus oven, cuisine, and serving-context tags; it has no Shepherd’s Pie dish-type tag or ingredient-role field. `allowedDishTypes: ["Main Dish"]` would extend beyond this one recipe. A line link does not narrow that rule to this line. |
| `IngredientLineSubstitution` | Contains `ingredientLineId`, optional global/contextual rule IDs, `isPreferred`, and custom labels; it has no `toIngredientRefId`. DTO/domain and JSON Schema allow nullable rule IDs. | A link without a rule ID cannot identify ground lamb as a normalized target. The resolver reads linked rule IDs; a custom label alone is not a structured alternative and is not currently rendered as one. |
| Form-to-form `SubstitutionRule` | References `fromFormId` and `toFormId`; intended for directed transformations between forms of an ingredient. | Beef and lamb are distinct species and ingredient identities, not two forms of the same ingredient. This rule type is unsuitable. |

The bundled [global rule file](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json) and [contextual rule file](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json) are both empty. The DTOs and schema support contextual ingredient-to-ingredient rules in general, but current support does not make a rule exact to this single line. The source evidence is stronger than a vague suggestion but narrower than the scope the current rule engine can guarantee.

This recommendation follows the repository’s separation of identity from substitution evidence and its requirement that a substitution be supported for a stated culinary use, basis, quantity relation, adjustments, and limitations. See [Requirements.md](../../../Requirements.md), especially the substitution model and contextual-substitution requirements. Retain the existing note rather than weakening those constraints to fit the current schema.

## Bounded future path

If a future acceptance criterion requires a selectable, normalized ground-lamb option here, implement a first-class recipe-line alternative that stores its target ingredient reference and is scoped to the exact recipe line, with its own source evidence. Keep that relationship separate from the general contextual rule graph unless the product intentionally wants broader matching and there is evidence for that scope. At that point:

1. Review the ground-lamb identity and Québec French display term before adding a target reference.
2. Preserve the direct source URL and exact line on the evidence record; keep the `90% lean` qualifier on beef only.
3. Use the publisher’s shared one-pound formulation only for this recipe line. Do not infer yield, cooking adjustment, nutrition, or a general ratio from it.
4. Update the v1 domain model, DTO, mapper, full-library schema, docs/examples, import validation, presentation/resolution path, and round-trip tests together; pre-MVP, evolve v1 in place without a compatibility shim.
5. Verify the source link appears only for this line and does not become a suggestion for other beef recipes.

Until that capability exists, keep `notes.en`, `notes.fr`, and `originalText` as they are. This review makes no safety claim and adds no conversion, portion, form, alias, substitution confidence, risk classification, or global/contextual rule.

## Snapshot and sources

The inspected snapshot is 2026-10-10. Hashes below cover exact file bytes.

| Artifact | Current count or state | SHA-256 |
|---|---:|---|
| Target recipe `078` | One saved row `078#3` | `212e565a9174f90946ac6cda99958a466154e87b36aaa8bb1651b1fab1652eec` |
| `ingredient-references.v1.json` | 869 references; no ground-lamb reference | `b51bf8e8aa2198b54e789eca1063bb843e29ac157bea7cfae98d3329e9dc810a` |
| `ingredient-forms.v1.json` | 48 forms | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `substitution-rules.v1.json` | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `tags.v1.json` | 84 tags | `90dfcacdfb710784a129521e567fb3251c75a97350482a55dc6873b2ad5a4c9a` |
| `research-ledger.v1.json` | 1,115 records | `481f3718f9b7ef27035584edb5c0c4dc4d9ca5d2ae6eb80443871104e86dff1e` |

| ID | Source | Evidence and limit |
|---|---|---|
| **S01** | The Wholesome Dish, [The Best Classic Shepherd’s Pie](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/), introductory text, ingredient list, and method. | Directly supports ground beef or ground lamb as options in the author’s named recipe, with the one-pound quantity in the same ingredient line. It does not establish a general species equivalence, a separate lamb amount, or any cooking-yield or safety claim. Accessed 2026-10-10. |

No historical or alternate publisher version was needed to verify `078#3`: the currently accessible page and saved line match. No other culinary, regulatory, or safety source was used to broaden the alternative.

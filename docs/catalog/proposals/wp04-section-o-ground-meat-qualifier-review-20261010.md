# WP04 Proposal: Ground-Meat Species and Composition Qualifier Review

**Review date:** 2026-10-10

**Disposition:** Review complete. Existing recipe, reference, form, and ledger data remain unchanged; the plan records the accepted species and qualifier boundaries and keeps the source-version conflict open.

**Scope:** The four exact ground/minced animal-meat ingredient rows in the current 114-recipe package, their active references and forms, and the recorded source version for Turkey Meatballs `018#1`.

## Disposition

Keep species and the ground product in the existing ingredient identity: `ground beef / bœuf haché` and `ground turkey / dinde hachée` remain distinct references. Do not create `lean ground turkey`, `lean ground beef`, or `90% lean ground beef` identities, aliases, or forms. A lean/fat phrase describes the source-named product’s composition or label claim; it is not a preparation state. Do not turn a source phrase into a Canadian fat class or a parsed fat percentage.

The exact source wording is retained in each recipe’s `originalText`. The current DTO/domain model has no dedicated product-composition qualifier. Recipe `018#1` also places `lean / maigre` in `preparation`, which the detail formatter displays, but that is a semantic mismatch and should not become a precedent. For `078#3`, the exact `90% lean` wording is in `originalText`, but the normal detail label is built from the linked canonical name, quantity, preparation, and notes; it does not display that source-only qualifier. This packet recommends no catalog or ledger integration. If WP04 requires composition qualifiers to be queryable or consistently visible, handle that as a separate, explicit v1 line-model decision; do not encode it as an identity, form, or preparation.

Do not rewrite `018#1`. The saved `2 lb lean ground turkey` line conflicts with the currently accessible publisher card, which lists one pound of ground turkey and says any type may be used. The local export establishes the imported wording, not which historical publisher version was used. Keep the mismatch unresolved until a matching source version is found or an owner resolves the saved recipe’s provenance.

No measurement, count, edible-portion, density, cooking-yield, or substitution value is established. Keep both ground-meat measurement states and substitution-research states as they are. The lamb option in `078#3` is a recipe-local source statement, not a general replacement rule.

## Exact recipe demand

The manifest contains **114 recipes and 1,123 ingredient rows**. A targeted scan of manifest-listed `originalText` and ingredient names for animal meat terms adjoining “ground” or “minced” found exactly **four rows**: three ground beef rows and one ground turkey row. No separate pork, chicken, or lamb mince row was found; ground lamb appears only as the source’s recipe-local alternative in `078#3`.

| Recipe line | Current bundled fields | Direct source comparison and disposition |
|---|---|---|
| `018#1` — Turkey Meatballs; `43199cff-7fba-4cd0-8447-2c7265b0bb1c-ingredient-1` | `originalText: "2 lb lean ground turkey"`; `quantity: 2`; `unit: lb`; `ingredientRefId: ingredient-ref-ground-turkey`; `preparation.en: lean`; `preparation.fr: maigre`. The [bundled recipe](../../../app/src/main/assets/seed/bundled-library/recipes/018-boulette-de-dinde-turkey-meatballs-43199cff-7fba-4cd0-8447-2c7265b0bb1c.v1.json) and [RecipeKeeper export](../../../docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes/processed_018-boulette-de-dinde-turkey-meatballs-43199cff-7fba-4cd0-8447-2c7265b0bb1c.json) retain the two-pound phrase. | The [current Preppy Kitchen card](https://preppykitchen.com/turkey-meatballs/) is for four servings and lists `1 pound ground turkey (450g)`. The body says any type of ground turkey can be used and that the less-lean option is more flavorful and moist. It does not contain the saved two-pound formulation or its `lean` qualifier. Keep the amount and text unchanged; do not infer which source version RecipeBook imported. |
| `034#4` — Classic Beef Chili; `4cbff09a-679f-420c-89e2-4175fb8e8662-ingredient-4` | `originalText: "1 kg ground beef"`; `quantity: 1`; `unit: kg`; `ingredientRefId: ingredient-ref-ground-beef`; no qualifier. | The [RICARDO card](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili) lists `2 lbs (1 kg) ground beef`, matching the saved amount and wording. No composition qualifier or source-version conflict was observed. |
| `074#1` — Meatloaf; `35267f47-fcd6-4d69-9124-c6e8ac85aa57-ingredient-1` | `originalText: "1 1/2 lb ground beef"`; `quantity: 1.5`; `unit: lb`; `ingredientRefId: ingredient-ref-ground-beef`; no qualifier. | The [Allrecipes card](https://www.allrecipes.com/recipe/16354/easy-meatloaf/) lists `1 ½ pounds ground beef` for its original recipe yield. It matches the saved amount and wording; no composition qualifier or source-version conflict was observed. |
| `078#3` — Shepherd’s Pie; `d356eec5-b3c4-4e22-b943-63900317e569-ingredient-3` | `originalText: "1 lb. 90% lean ground beef -or ground lamb"`; `quantity: 1`; `unit: lb`; `ingredientRefId: ingredient-ref-ground-beef`; notes preserve the lamb option in English and French. | The [The Wholesome Dish recipe](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/) has the exact ingredient line `1 lb. 90% lean ground beef -or ground lamb` and says the author wrote the recipe for either ground beef or ground lamb. Keep the current line and note. Treat the alternative as local to this recipe. Do not infer that `90% lean` means a 10% fat product or a Canadian `Lean Ground Beef` class. |

The `078#3` text is already source-corrected and its current beef-reference ledger entry already records the recipe source. This review does not duplicate that integration. See the [ground-beef follow-up](wp04-ground-beef-90-percent-lean-line-followup-20261010.md), which reports the source-text correction and ledger decision.

## Active reference, form, and ledger fit

The current [ingredient-reference file](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) contains 869 references. The two relevant records are:

| Reference | Current record | Finding |
|---|---|---|
| `ingredient-ref-ground-beef` | `ground beef / bœuf haché`, category `PROTEIN`, empty alias lists, no default density or unit mappings. | Correct for the linked `034`, `074`, and `078` rows. Keep separate from generic `beef / bœuf` and from any future ground-lamb identity. |
| `ingredient-ref-ground-turkey` | `ground turkey / dinde hachée`, category `PROTEIN`, empty alias lists, no default density or unit mappings. | Correct for the linked `018` row. Keep separate from ground beef. The French name is the active reference label; this review does not assert it is a publisher-sourced composition term. |

The [ingredient-form file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) contains 48 forms and no form attached to either ground-meat reference. That is appropriate: “ground” is already part of the two ingredient identities in this corpus, and “lean” or “90% lean” does not describe a further physical preparation state. The [legacy candidate file](../legacy-import-identities.v1.json) contains 78 candidates and has no matching ground-beef, ground-turkey, or lean-ground candidate.

The [research ledger](../research-ledger.v1.json) marks `ingredient-ref-ground-beef` identity verified, with measurement and substitution research `not_yet_researched`; it records OQLF terminology and the `078#3` source decision. `ingredient-ref-ground-turkey` is still `unreviewed`, with no sources or decisions; its measurement and substitution states are also `not_yet_researched`. Do not mark the turkey identity verified from the current page alone: the current recipe is not the saved two-pound version. If an owner later decides to record the source conflict in the ledger, scope that entry to the current page and the unresolved version comparison, not to a fat-class or measurement claim.

## Representation assessment

- **Species and product identity:** The existing references represent species-specific ground products without merging beef and turkey. Keep `ingredientRefId` as the normalized ingredient identity. Do not put ground lamb in the ground-beef aliases; it is a different species and appears only as a stated option on this recipe line.
- **Ground state:** In these four rows, “ground” is already carried by the canonical ingredient identity. There is no need for a `ground` form that repeats the identity. This review found no exact recipe demand for other minced-meat spellings.
- **Lean/fat phrase:** A composition or product-label phrase is neither a preparation state nor evidence of a separate reusable ingredient. Preserve the imported source phrase verbatim in `originalText`; do not extend `preparation` to encode new composition qualifiers. The existing `018#1.preparation` value is legacy line data and is left untouched because the source version remains unresolved.
- **Structured and visible representation:** `IngredientLineDto` and domain `IngredientLine` expose `originalText`, `ingredientName`, `preparation`, and other line details but no composition-qualifier field. The full-library schema’s `IngredientLine` uses `additionalProperties: false` and likewise has no such field. `IngredientForm` exposes a `prepState`, so it is not a suitable bucket for fat content. `SchemaMappers` round-trip only the defined line fields. Because detail presentation normally formats the reference name plus quantity, preparation, and notes, `078#3`’s `90% lean` text is preserved in the payload but not rendered as a structured qualifier. The current model is therefore **source-text-preserving but not composition-structured or uniformly visible**.
- **Numeric interpretation:** The current source wording does not provide a verified product label, brand, SKU, laboratory composition, market standard, or exact percentage basis. Keep `lean` and `90% lean` as text. No structured `fatPercent`, `leanPercent`, fat class, or normalized numeric value is supported.
- **Pre-MVP model rule:** If a later acceptance criterion requires search/filtering or rendering of product composition, add a dedicated optional line-level source-qualifier concept to v1 in place, and update domain model, DTO, mapper, schemas, docs/examples, and round-trip fixtures together. Store exact source wording and keep any normalized composition value absent until separate evidence establishes the meaning and basis. Do not use a compatibility shim, rewrite historical source versions, or overload `preparation`/`ingredientFormId` to avoid that model change. No such shared change is proposed in this packet.

### Measurement and substitution boundary

All four recipe amounts are already masses (`lb` or `kg`); they are not count-to-weight or edible-portion observations. The sources reviewed do not give a matching refuse fraction, edible portion, raw-to-cooked yield, or mass-volume conversion. The line in `078#3` permits ground lamb in this dish only. The current Preppy Kitchen card’s optional “less lean” note belongs to its current one-pound version and does not settle the older saved two-pound formula. No safety guidance or global/contextual substitution is evaluated or proposed here.

## Snapshot and audit method

Snapshot taken from the live bundled package and current local catalog files on 2026-10-10. SHA-256 hashes below cover exact file bytes; the recipe corpus digest hashes sorted manifest-relative paths, NUL, exact recipe-file bytes, NUL.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files | 114 files / 1,123 ingredient rows | `84bc23e6f72f9ecbe51642710e395fde7cf48dcb40abeae676f9d6957fba68b0` |
| `ingredient-references.v1.json` | 869 references | `85041671d69daa5763acd9940cae78131c8ea8d8877680970f14295b9b4826e4` |
| `ingredient-forms.v1.json` | 48 forms | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `legacy-import-identities.v1.json` | 78 candidates | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| `research-ledger.v1.json` | 1,115 records / 8 unit conversions | `68efe3269ea8b83090bd76ea3e9e558a4159245554cd604050478f37ab734129` |

The audit read manifest-listed recipe ingredient names and source strings, the two active references, matching forms and legacy candidates, current ledger records, Section O in the [WP04 plan](../../RecipeBook-global-ingredient-catalog-plan.txt), the DTO/domain/mapper/schema shape, and the existing [018 source-version proposal](wp04-next-uncovered-evidence-review-20261010.md), [078 ground-beef follow-up](wp04-ground-beef-90-percent-lean-line-followup-20261010.md), and [animal-food residual audit](wp04-animal-foods-residual-coverage-audit-20261010.md). It did not treat general mentions of “chopped” or “minced” produce as meat demand. No tests were run, as this is a proposal-only review.

## Sources and access limits

All external pages listed below were opened directly on **2026-10-10**. The linked culinary pages support their own current recipe cards and wording only; they do not establish a retail package specification or a reusable composition equivalence.

| ID | Source | Evidence and limit |
|---|---|---|
| **S01** | Preppy Kitchen, [Turkey Meatballs](https://preppykitchen.com/turkey-meatballs/), current recipe card and ground-turkey note. | The page displays “Updated Mar 25, 2023,” lists one pound (450 g) ground turkey for four servings, and says any type of ground turkey works; a less-lean option is more flavorful and moist. It does not establish the older two-pound “lean” formula in local files. Accessed 2026-10-10. |
| **S02** | The Wholesome Dish, [The Best Classic Shepherd’s Pie](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/), introduction and ingredient list. | Gives the exact one-pound `90% lean ground beef -or ground lamb` phrase and explains the author’s recipe-local choice. It is not a product label and does not identify the product’s market class, brand, or measured composition. Accessed 2026-10-10. |
| **S03** | RICARDO, [Classic Beef Chili](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili), ingredient list. | Lists `2 lbs (1 kg) ground beef`, matching `034#4`. No fat qualifier or package specification. Accessed 2026-10-10. |
| **S04** | Allrecipes, [Easy Meatloaf](https://www.allrecipes.com/recipe/16354/easy-meatloaf/), original 1X ingredient list. | Lists `1 ½ pounds ground beef`, matching `074#1`. No fat qualifier or product specification. Accessed 2026-10-10. |
| **S05** | Canadian Food Inspection Agency, [Labelling requirements for meat and poultry products](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products), “Ground meat” and “Lean and extra lean” sections. | For Canadian standardized ground-meat common names, gives maximum fat limits of 30% regular, 23% medium, 17% lean, and 10% extra lean, and says the species must be accurately represented. It also says general “lean” and “extra lean” claims do not apply to ground meats covered by those standards. These Canadian classes cannot be inferred from the U.S. recipe phrases. Accessed 2026-10-10. |
| **S06** | OQLF, [bœuf haché](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8888340/boeuf-hache), Grand dictionnaire terminologique. | Directly pairs `bœuf haché` with `ground beef` and lists `minced beef` among associated English terms. The record is dated 1982 and includes a historical definition capped at 30% fat. Use it here for the active bilingual identity, not to interpret `lean` or `90% lean` in a recipe from another market. Accessed 2026-10-10. |

**Unresolved evidence:** The current Preppy Kitchen page is available, but no dated publisher-page capture or version identifier matching the saved `018#1` ingredient row was found in the reviewed repository. The RecipeKeeper export confirms only the saved text and its local export snapshot. The mismatch is established; its origin and the intended canonical recipe version are not.

## Review outcome

The current species-specific ground-beef and ground-turkey references are sufficient for the observed identity demand. The two source-qualified rows show that composition wording belongs to a recipe line and should not be converted into a new identity, form, preparation state, numeric measurement, or substitution relation. Keep the exact saved words and present source-version uncertainty intact. A future dedicated line-level qualifier field is an explicit schema/UI choice, not a catalog alias or measurement observation. No integration of qualifier semantics is recommended until that requirement is accepted and the turkey source-version question is resolved.

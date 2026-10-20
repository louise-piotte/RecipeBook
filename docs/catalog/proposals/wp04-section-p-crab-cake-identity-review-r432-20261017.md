# WP04 Section P R432 — prepared crab-cake identity review

- **Review date:** 2026-10-17.
- **Packet:** Proposal-only identity, Québec naming, picker, ownership, and recipe-demand review.
- **Recommendation:** Add a narrow prepared crab-cake identity, `crab cake / croquette de crabe`, as `PROTEIN`. Add no form, recipe link, measure, density, conversion, yield, or substitution.
- **Checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717)).
- **Scope:** This covers the named crab-based prepared food sold as a crab cake/croquette. It does not reopen generic crab meat, crab species, the generic fish-cake hold, or recipe 019’s homemade crab balls. No shared catalog or tracking data is changed.

## Decision and exact proposed delta

OQLF provides a stable Québec identity boundary: its 2022 GDT entry defines *croquette de crabe* as crab pieces mixed with breadcrumbs, egg, and seasonings, shaped and fried. It lists *croquette de crabe*, *beignet de crabe*, and *galette de crabe* as preferred French terms and maps the English product to *crab cake* and *crab croquette*. OQLF specifically discourages the borrowed English phrase *crab cake* in French. Current Québec sellers independently use these names for purchasable crab products, including frozen ready-to-cook products. [reused S07; S01–S02]

Proposed reference only:

```json
{
  "id": "ingredient-ref-crab-cake",
  "nameFr": "croquette de crabe",
  "nameEn": "crab cake",
  "aliasesFr": ["beignet de crabe", "beignets de crabe", "croquettes de crabe", "galette de crabe", "galettes de crabe"],
  "aliasesEn": ["crab cakes", "crab croquette", "crab croquettes"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

**Root picker review:** Add the grammatical plural `croquettes de crabe` alongside OQLF's listed singular term so the plural query in the projection table resolves to this row. This is a search inflection, not a separate product form.

**Root ledger boundary review:** The existing source `WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S05` is Clover Leaf's *Mini-croquettes de crabe* recipe and remains attached to `ingredient-form-crab-canned`. Its ingredient list calls for three 120 g cans, drained, of two named Clover Leaf crab products. It is recipe evidence for canned crab meat, not an active ingredient/form owner or a retail crab-cake product specification. Keep it with the canned form; do not transfer its package quantity, drained state, recipe, or yield to this identity.

Do not add *gâteau de crabe*: although one Montréal retailer uses a literal rendering on its French product page, the OQLF recommends other terms. Do not add bare `crab`/`crabe`, `crab balls`/`boulettes de crabe`, generic `fish cake`, `surimi`, imitation crab, or crab-flavoured pollock as aliases. The English `crab cake` name is not a French alias.

## Ownership and prior-boundary audit

The live worktree snapshot has **1,728 references, 141 forms, 56 legacy-import candidates, and 2,087 research-ledger records**. Exact normalized candidate terms were checked across reference names/aliases, form labels/match terms, legacy candidates, and ledger record IDs. No exact owner exists for the crab-cake/croquette terms; `ingredient-ref-crab-cake` and `candidate-crab-cake` are unallocated.

| Existing owner | Live boundary | Effect on this proposal |
|---|---|---|
| `ingredient-ref-crab` (`PROTEIN`) | `crab meat / chair de crabe`; no aliases. Ledger identity is `verified`; measurement and substitution research remain `not_yet_researched`. | Keep as edible crab meat. Do not make cakes a form of crab meat or reinterpret its recipe amount. |
| `ingredient-form-crab-canned`, `ingredient-form-crab-jumbo-lump` | Canned crab meat and Jumbo Lump grade, both attached to `ingredient-ref-crab`. | Neither is a prepared cake. Recipe 019 uses the Jumbo Lump form. |
| `ingredient-ref-crab-flavoured-pollock-flakes` | A pollock product with crab flavour. | Keep imitation/flavoured product identity separate from actual crab cakes. |
| Species-specific crab refs | Blue crab, Dungeness, Jonah, northern stone, and stone crab. | Do not infer any one crab species for a crab cake. |
| `ingredient-ref-fish-balls` and `ingredient-ref-cuttlefish-balls` | Separate formed seafood identities. | Shape alone does not make a fish ball, cuttlefish ball, or crab ball a cake/croquette alias. |

The earlier generic-crab boundary review treats recipe 019’s title as a homemade dish, not a second ingredient request. This proposal retains that decision. It addresses the distinct market product explicitly sold in Québec as a crab cake/croquette; it does not turn the recipe title or its source URL into a recipe link. The R171 generic fish-cake hold concerns an unqualified market phrase spanning different seafood products; it explicitly leaves species-specific cakes and croquettes outside its scope.

The exact OQLF page was previously cited as `WP04-GENERIC-CRAB-20261012-S07`; that source ID is reused. New Québec product sources use the unique R432 prefix below. No new ledger candidate or source record is proposed unless the parent accepts the row.

## Picker impact

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent/punctuation normalization and complete phrase matching across reference names, aliases, and attached form terms before substring fallback. No exact candidate phrase is currently owned.

| Query | Current result | With proposed row |
|---|---|---|
| `crab cake(s)`, `crab croquette(s)`, `croquette(s) de crabe`, `beignet(s) de crabe`, `galette(s) de crabe` | None | `ingredient-ref-crab-cake` only |
| `crab meat`, `chair de crabe`, `jumbo lump crab meat` | `ingredient-ref-crab` with its matching meat form where explicit | Unchanged |
| `crab`, `crabe` | Seven existing results: crab meat, blue crab, Dungeness crab, Jonah crab, northern stone crab, stone crab, and crab-flavoured pollock flakes | Same seven plus the proposed cake row; both remain multiple-result queries |
| `cake` | Three existing cake-related results | Same three plus crab cake |
| `fish cake`, `crab balls`, `boulettes de crabe` | None | Still none; no broad aliases are proposed |

The broad `crab`/`crabe` queries gain one result because the qualified display terms contain those words. The candidate does not capture exact crab-meat or species phrases, and it does not merge with the pollock product.

## Full manifest recipe scan

All **114 manifest-listed recipe files and 1,123 ingredient rows** were parsed. The scan covered the full JSON text for crab-cake/croquette, beignet/galette de crabe, crab-ball/boulette de crabe, and related French/English forms. Recipe 019 is the only near-hit in full recipe text: its source URL names “Baked Crab Cake Bites,” while the recipe itself is titled `Crab Balls / Boulettes de crabe` and its instructions describe shaping and cooking homemade crab balls. Excluding ingredient `group` labels, **zero ingredient rows request a crab cake, crab croquette, crab beignet, or crab galette**.

Recipe 019 ingredient **#8** is `1 lb jumbo lump crab meat`, already linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. The dish title and source URL do not support relinking it to the proposed prepared-product row. No recipe link is proposed.

## Measurements, forms, and substitutions

- **Forms:** None. The Québec listings include frozen and ready-to-cook products, but those are specific retail states and do not establish a shared form set for the identity.
- **Measures:** No generic measure, density, unit mapping, conversion, or yield is supported. Aliments DKL’s listing gives an approximately 26-piece, 85 g-per-piece, 5 lb case; those are product-specific package details, not reusable mappings. La Mer gives a single-product price and no transferable measure.
- **Substitutions:** No directed or contextual substitute is supported. Crab cake cannot be inferred as a replacement for plain crab meat, fish cakes, fish/cuttlefish balls, or imitation crab; no tested ratio, recipe role, or cooking method supports equivalence.
- **Ledger if accepted:** Create one `ingredient_reference` record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. The measurement and substitution states apply only to the proposed prepared identity; they do not update the existing crab-meat record.

## Sources and limits

All sources were accessed 2026-10-17. OQLF establishes Québec terminology and a dish definition. Retailer pages establish current market naming and product state, not a standardized ingredient formula, crab species, or recipe equivalence.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **Reused `WP04-GENERIC-CRAB-20261012-S07`** | OQLF, [croquette de crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503150/croquette-de-crabe), updated 2022. | Defines the crab-piece, breadcrumb, egg, and seasoning preparation; prefers *croquette de crabe*, *beignet de crabe*, and *galette de crabe*; gives English *crab cake* and *crab croquette*; discourages the English loan in French. It does not standardize every retailer’s formula. |
| **WP04-SECTIONP-CRAB-CAKE-R432-20261017-S01** *(proposal-local)* | Poissonnerie La Mer (Montréal), [Crab Cake](https://www.lamer.ca/en/products/gateau-crabe-maison). | Current English listing calls the product “Crab Cake,” says it is made with fresh crab, and describes it as frozen and ready to cook. It does not disclose species, formula proportions, or a general measure. |
| **WP04-SECTIONP-CRAB-CAKE-R432-20261017-S02** *(proposal-local)* | Aliments DKL, [Beignet de Crabe Gourmet “Crab Cakes”](https://alimentsdkl.com/products/beignet-de-crabe-crabe-cake). | Current Québec listing names the product in French and English, offers Québec delivery, and gives frozen preparation instructions. Its approximately 26 × 85 g, 5 lb box is a vendor-specific package; the page gives no crab species or complete formula. |

**Implementation recommendation:** Add only the bilingual `ingredient-ref-crab-cake` identity shown above if the parent accepts this proposal. Keep every existing crab identity and all recipe links unchanged. No tests or app checks are needed for this proposal-only documentation task.

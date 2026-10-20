# WP03 Section F — generic barley grain identity review (2026-10-13, round 52)

- **Status:** Proposal only; no catalog, ledger, checklist, roadmap, or recipe data changed.
- **Scope:** The plain edible barley grain ingredient, with no variety, hull, polishing, germination, milling, or cooking qualifier.
- **Open checklist:** Continue remaining Section F identity and terminology coverage in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L519).
- **Recommendation:** Add identity-only `ingredient-ref-barley` as **`barley / orge`** in `GRAIN_AND_CEREAL`, with no aliases, forms, numeric behavior, recipe links, or substitutions. Keep it as the unqualified food-grain choice, not a redirect for a specified barley product.

## Why this is a distinct open gap

The active references contain many qualified barley products, but no bare `barley / orge` identity. The prior sprouted-barley packet noted the missing generic row while deciding that dried sprouted barley could not be linked to one of several unsprouted barley products; it did not review ownership or a bilingual display for plain barley grain. Searches of the Section F checklist and proposal archive found no focused decision for that generic identity. This packet does not reopen the accepted barley product rows, the separate barley-meal hold, or the regional cereal products reviewed in other rounds.

The OQLF entry directly pairs French **orge** with English **barley** and says *orge* applies to both the plant and its grain [S01]. The Canadian Grain Commission (CGC) treats food barley as a grain class distinct from malting and general-purpose barley, and distinguishes covered and hulless types within barley [S02]. A current Canadian producer sells whole-grain barley for food and describes its own product as dehulled while retaining bran [S03]. Together these sources support a useful generic food-grain identity while showing why the row must not claim a single kernel treatment. The CGC's feed and malting scopes are not recipe ingredients and are excluded from this picker identity.

## Proposed reference

| Field | Recommendation |
|---|---|
| ID | `ingredient-ref-barley` |
| English display | `barley` |
| Québec French display | `orge` |
| Category | `GRAIN_AND_CEREAL` |
| English/French aliases | None |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

Do not add `barley grain` or `grain d'orge` as aliases. OQLF's *grain d'orge* entry is in the malting domain; the current food-grain evidence supports the base pair without making that technical phrase a general recipe synonym. Do not add covered, hulless, whole, hulled, pearl, pot, quick-cooking, sprouted, puffed, flaked, couscous, malted, roasted, or flour wording to the aliases. Those are distinct processing, product, or end-use qualifiers with existing active owners or separate evidence boundaries.

## Ownership and archive audit

Read-only snapshot: **1,372 active references, 100 forms, 64 legacy-import candidates, and 1,702 research-ledger records**.

| Surface | Finding |
|---|---|
| Active references | No exact normalized display or alias owns `barley`, `orge`, `barley grain`, or `grain d'orge`. The neighboring rows are `ingredient-ref-barley-couscous`, `ingredient-ref-barley-flakes`, `ingredient-ref-barley-flour`, `ingredient-ref-cream-of-barley-cereal`, `ingredient-ref-hulled-barley`, `ingredient-ref-malted-barley-flour`, `ingredient-ref-pearl-barley`, `ingredient-ref-pot-barley`, `ingredient-ref-puffed-barley`, `ingredient-ref-quick-cooking-barley`, `ingredient-ref-roasted-barley-flour`, `ingredient-ref-sprouted-barley`, and `ingredient-ref-whole-barley-flour`. |
| Forms | No generic-barley form exists. The only barley forms are `ingredient-form-pearl-barley-dry` and `ingredient-form-pearl-barley-cooked`; both belong to pearl barley, have empty match-term arrays, and have no density or yield behavior. |
| Legacy identities | No exact normalized candidate key for `barley` or `orge`. |
| Research ledger | No generic-barley identity record or exact candidate exists. `candidate-barley-meal` remains an unresolved, distinct grind-boundary candidate; it is not an owner for plain grain. The accepted neighboring barley records cover only their named products. |
| Proposal archive | The sprouted-barley review notes that the generic row is absent but does not decide its scope or name. No focused plain-barley review or prior proposal/source-ID prefix `WP03-GENERIC-BARLEY-R52-20261013` was found. The root-integrated tascalate and Palestinian maftool rows are unrelated and unchanged. |

## Picker impact

The projection uses the current `IngredientReferenceSearchIndex` phrase-first search over active reference names and aliases. The query `barley` currently returns 13 qualified barley references; `orge` returns the same 13. Adding the proposed base row would make each broad query return 14 rows, including a clearly labelled general-grain option. Neither query becomes a singleton or hides the existing specific choices.

Qualified queries remain stable: `hulled barley` and `pearl barley` each remain one result; `barley cereal` remains the cream-of-barley-cereal result; `barley flour` remains its four flour results. The exact `barley grain` and `grain d'orge` queries currently return no result and would remain so because this proposal deliberately adds no aliases. `barley meal` remains unowned pending its separate grind/French-boundary evidence.

## Bundled recipe demand

A read-only scan covered all **114 manifest-listed recipe files**, the serialized JSON text, and all **1,123 ingredient rows**. Whole-word searches for `barley`, `orge`, `hulled barley`, `pearl barley`, `pot barley`, `barley grain`, and `grain d'orge` found **zero matching recipe files, ingredient rows, or direct reference links**. No recipe edit or link is proposed.

## Numeric and substitution evidence

- Keep density null, unit mappings empty, and forms and package yields absent. The seed package has no barley package-yield record.
- Fieldstone Organics' current whole-grain product page gives product-specific preparation directions of one part barley to four parts water and 35–40 minutes at a simmer [S03]. Ambrosia's current Canadian listing for its organic hulled-barley SKU gives one cup dry barley to three cups liquid and about 50 minutes [S04]. These different instructions describe named products, not a reusable measure, mass/volume conversion, cooking yield, or generic recipe rule; do not transfer either to the proposed row.
- No source validates replacing plain barley with another grain or vice versa at a reusable amount and method. Fieldstone's comparison of cooked barley as a side dish similar to rice or quinoa is a serving/use comparison, not a substitution ratio. Existing manufacturer alternative claims for quick-cooking and sprouted barley remain product-specific or blocked in their own records; they do not establish behavior for generic barley. Add no substitution finding or rule.

## Sources

| Source ID | Source and locator | Use and limitation |
|---|---|---|
| `WP03-GENERIC-BARLEY-R52-20261013-S01` | Office québécois de la langue française, [orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), updated 2019; accessed 2026-10-13. | Direct English `barley` / French `orge` pair; says the French term applies to both plant and grain. It does not identify a hull or processing state. |
| `WP03-GENERIC-BARLEY-R52-20261013-S02` | Canadian Grain Commission, [Barley: classes, types and varieties](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/06-barley/classes-types-varieties.html), current page; accessed 2026-10-13. | Distinguishes food, malting, and general-purpose barley; lists food uses and covered/hulless grain types. It is a grain-class source, not a consumer package label or household-measure source. |
| `WP03-GENERIC-BARLEY-R52-20261013-S03` | Fieldstone Organics, [Organic Whole Grain Barley](https://www.fieldstoneorganics.ca/product/organic-whole-grain-barley/), current producer page; accessed 2026-10-13. | Names a current Canadian food-grain product and says its barley is dehulled with bran intact; offers cooking directions and package options. Product processing and recipe instructions remain SKU-specific. |
| `WP03-GENERIC-BARLEY-R52-20261013-S04` | Ambrosia, [Organic Hulled Barley](https://canada.ambrosia.ca/products/organic-hulled-barley), current Canadian product listing; accessed 2026-10-13. | Lists a Canadian-product hulled-barley SKU with separate cooking directions. The page's serving and preparation values are not a generic barley measure or yield. |

**Decision for integration:** accept the plain edible-grain identity `barley / orge` with empty aliases and no numeric, form, recipe, or substitution behavior. Preserve all existing qualified barley products and the separate barley-meal candidate. This proposal is source-grounded identity work only; Section F remains open.

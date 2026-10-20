# WP03 Section K — Swiss chard stems identity-gap review (R994)

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. This review changed no shared catalog, ledger, recipe, plan, roadmap, or generated data.
- **Disposition:** Recommend one generic culinary plant-part reference for Swiss chard stems / côtes de bette à carde.
- **Plan anchor:** Section K remains open to continue the leafy-green, brassica, stem, shoot, and edible-flower sweep ([Section K heading, line 6557](../../RecipeBook-global-ingredient-catalog-plan.txt#L6557); [open sweep, lines 6563–6564](../../RecipeBook-global-ingredient-catalog-plan.txt#L6563)).
- **Scope:** The edible leaf stalks/cardes of culinary Swiss chard, kept as a distinct part identity from whole Swiss chard. No brand, product line, flavour family, cultivar, SKU, or retailer-variant roster was researched.

## Recommendation

Add `ingredient-ref-swiss-chard-stems` as an identity-only `VEGETABLE_AND_AROMATIC` reference for the edible stems and ribs separated from Swiss chard leaves. The OQLF pairs the Québec crop name *bette à carde* with English *chard* and *Swiss chard*, identifies *Beta vulgaris* var. *cicla*, and says the *cardes (côtes)* are consumed as much as the leaves. UMass Extension independently says chard is grown for edible stems and leaves, describes separating and chopping stems/ribs, and presents them as a separate cooked ingredient. A Québec produce guide uses *côtes de bette* for preparation of the same generic vegetable. [S01–S04]

This is a plant-part identity, not a processed form of the current whole-plant `ingredient-ref-swiss-chard`. Keep the new result part-qualified and the existing whole-chard row and evidence unchanged. Do not transfer the whole-plant aliases `chard`, `leaf beet`, `silver beet`, `bette à cardes`, or `bette` to the part row. The OQLF-listed `spinach beet` remains inactive because the existing catalog decision records picker pollution with ordinary spinach. [S01]

## Proposed minimal reference

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-swiss-chard-stems` |
| English display | `Swiss chard stems` |
| Québec French display | `côtes de bette à carde` — descriptive, part-qualified wording; not a separate OQLF-preferred lemma |
| English aliases | `chard stalks`; `Swiss chard ribs` |
| French aliases | `cardes de bette à carde` — descriptive, part-qualified wording |
| Category | `VEGETABLE_AND_AROMATIC` |
| Default density / unit mappings | `null` / `[]` |
| Updated at | `2026-10-19T00:00:00Z` |

The English stem wording is directly used by UMass; UMass also uses *ribs*, and Illinois Extension refers to chard *stalks*. For French, the proposed display combines the locally attested phrase *côtes de bette* with the OQLF crop name *bette à carde*. The French alias combines OQLF’s part term *cardes* with that same crop name. Neither compound is presented as an OQLF ruling for a standalone plant-part term. Keep `côtes de bette à carde` as the preferred display because it is immediately recognizable and crop-qualified; do not add broad aliases such as `côtes`, `cardes`, `bette`, `bette à carde`, or the France-specific `poirée` / `blette`.

Scope this reference to edible leaf stalks/cardes and their fleshy ribs from culinary chard (*Beta vulgaris* var. *cicla*). It does not cover leaves as a whole, the beetroot, beet greens, celery stalks, cardoon, the plant’s flower stalk, cultivars/colour types as separate ingredients, or commercial products. Do not add a `Swiss chard stems` form to the whole-chard reference.

## Ownership and duplicate audit

Read-only working-tree snapshot on 2026-10-19:

| Surface | Count | Candidate result |
|---|---:|---|
| Ingredient references | 2,007 | No owner for the proposed ID or part-qualified English/French phrases |
| Ingredient forms | 205 | No Swiss-chard-stem form, matching label, alias, or match term |
| Legacy import candidates | 55 | No candidate for the ID or reviewed plant-part names |
| Research-ledger records | 2,413 | No plant-part record, source ID, or decision for the proposed identity |
| Manifest recipes / structured ingredient rows | 114 / 1,123 | No exact plant-part demand; see corpus scan below |

Exact and case/accent-normalized scans covered `ingredient-ref-swiss-chard-stems`, `Swiss chard stems`, `Swiss chard stalks`, `chard stems`, `chard stalks`, `chard ribs`, `Swiss chard petioles`, `côtes de bette à carde`, `côtes de bette`, `cardes de bette à carde`, `tiges de bette à carde`, the botanical name with stem wording, and the proposed R994 source-ID prefix. Active references, forms, legacy candidates, ledger text, and the proposal/batch archive contain no owner for the proposed part identity or its source-ID prefix. No focused prior Swiss-chard-stem proposal was found.

The current `ingredient-ref-swiss-chard` row is `Swiss chard / bette à carde`, with EN aliases `chard`, `leaf beet`, and `silver beet`, and FR aliases `bette à cardes` and `bette`. It has no forms, density, or unit mappings. Preserve those values. The current `ingredient-ref-beet`, `ingredient-ref-beet-greens`, `ingredient-ref-cardoon`, `ingredient-ref-celery`, and `ingredient-ref-celeriac` remain separate identities; none owns the proposed part-qualified phrases. In particular, do not move `leaf beet` or `bette` to beet greens, and do not infer celery interchangeability from the stalk resemblance.

The OQLF URL below is already owned by `ingredient-ref-swiss-chard` as `WP03K-S06`, with a locator for the whole-plant preferred terms and taxonomy. Its current locator/support does not record the separate *cardes (côtes)* food-use note. If integrated, add a new R994 source record for that URL with a narrow part-specific locator; leave `WP03K-S06` and its owner unchanged. The UMass Extension, Illinois Extension, and Mangez Québec URLs have no exact source-URL owner in the current ledger. The proposed source prefix `WP03-K-CHARD-STEMS-R994-20261019` is unused.

No manufacturer, brand, product-line, flavour-family, SKU, or retailer page was consulted. The Section K Broccolini mention is a trademark/alias exclusion, not a generic-ingredient assignment. No Section K roster-only queue item was found. The plan contains separate commercial cereal roster and named Anson Mills wheat-meal lines; treat those product-roster lines as out of scope because **commercial-product counts do not add ingredient diversity**, and stop those lines without research. This review does not expand product rosters in any ingredient category. Preserve existing branded references and product-specific evidence.

## Bundled recipe demand

All 114 manifest-listed recipe files and their 1,123 structured ingredient rows were scanned for whole-chard and part-specific English/French wording, including `Swiss chard`, `chard`, `Swiss chard stems`, `chard ribs`, `bette à carde`, `cardes de bette`, and `côtes de bette`, as well as *Beta vulgaris* var. *cicla* with stem terms. The scan found **zero matching recipe files and zero matching ingredient rows**. The manifest-ordered recipe-file digest was `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17` (SHA-256 over each manifest-relative path, NUL, exact file bytes, and NUL in manifest order). There is no bundled recipe link, relink, or recipe-derived demand for this identity.

**Static picker projection:** the current normalized phrase search would return the part row for `Swiss chard stems`, `Swiss chard ribs`, and `côtes de bette à carde`; the broad queries `Swiss chard` and `bette à carde` would also match the existing whole-chard row. The display remains visibly part-qualified. This is a code-based projection, not live picker QA.

## Measurement assessment

UMass Extension reports that one pound of fresh Swiss chard yields “5 to 6 packed cups” of leaves and “2½ cups of stems.” Its preparation section says to separate stems from leaves and chop stems/ribs into bite-sized pieces. [S02]

This supports one source-reported whole-chard-to-separated-stem volume observation. It does **not** establish stem mass, a stem-only cup-to-mass factor, ingredient density, or a general count/volume conversion. The source does not specify the measured stem cut size, whether the 2½ cups are packed, or a trim/discard basis. Do not infer metric amounts, a measurement method, a recipe portion, or equivalence to celery. Keep UMass’s separate total cooked-yield range and leaf-cup amounts out of the stem observation.

If integrated, a single ledger observation on `ingredient-ref-swiss-chard-stems` may preserve only the stated relationship:

```json
{
  "observationId": "umass-fresh-whole-chard-to-stems-20261019",
  "relationship": "edible_portion_yield",
  "sourceQuantity": { "amount": 1, "unit": "lb" },
  "value": 2.5,
  "valueUnit": "cup",
  "foodDescription": "Fresh whole Swiss chard; stems separated from leaves",
  "foodState": "Fresh stems separated from leaves; measured cut size and cup packing basis are unspecified",
  "measurementMethod": "Source-reported UMass amount; the source does not explicitly tie the 2½-cup figure to its separate chopping direction or specify stem cut size, cup packing method, or trim basis",
  "quantityBasis": "UMass reports 1 lb fresh chard as 5–6 packed cups of leaves and 2½ cups of stems",
  "evidenceKind": "published_portion",
  "sourceIds": ["WP03-K-CHARD-STEMS-R994-20261019-S02"]
}
```

Use `measurementState: researched_supported` only for that bounded source observation. Keep `defaultDensity` null and `unitMappings` empty; create no active conversion or reusable yield. If the ledger review cannot retain the unstated cup/cut basis clearly, omit the observation instead of filling in a method.

## Substitution assessment

The targeted searches below surfaced broad or low-confidence web claims that chard stems can replace celery, but no reviewed authoritative source defines a dish role, preparation-state match, quantity basis, ratio, or adjustment. UMass and Illinois discuss cooking the stems separately; neither establishes a stem-to-celery replacement. Illinois says whole Swiss chard can replace spinach or kale in most recipes, which is not evidence about the stem part. [S02–S03]

Recommend `substitutionResearchState: researched_no_supported_substitute`, with no `substitutionFindings`, replacement links, recipe-line links, or active contextual rules. In particular, do not create a global Swiss-chard-stem-to-celery rule from a shared texture or shape. Any later candidate needs evidence naming the actual dish role and method and a supported amount basis; do not invent a ratio or adjustment.

## Search record

Exact external search queries used on 2026-10-19:

- `site:vitrinelinguistique.oqlf.gouv.qc.ca "bette à carde" "cardes" côtes`
- `"Swiss chard stems" edible separate cook leaves extension`
- `site:umass.edu/agriculture-food-environment "Swiss Chard" stems ribs`
- `"côtes de bette à carde" Québec recette`
- `site:mangezquebec.com "côtes de bette"`
- `"chard stems" celery substitute recipe role ratio`
- `"Swiss chard stems" celery substitute soup`
- `"côtes de bette" céleri remplacer substitution recette`
- `site:extension.* chard stems substitute celery`

Search results for celery substitution were not used as general or product evidence: the accessible examples were unspecific or low-confidence and supplied no scoped ratio. The UMass, Illinois, OQLF, and Mangez Québec pages below were opened and reviewed directly. No brand or product roster query was pursued.

## Sources and source ownership

Sources were accessed on 2026-10-19. The IDs below are proposal-local. The repeated OQLF URL needs a new locator-specific source record if integrated; retain its existing whole-chard record unchanged.

| ID | Source | Supported claim and limits |
|---|---|---|
| `WP03-K-CHARD-STEMS-R994-20261019-S01` | Office québécois de la langue française, [GDT: bette à carde](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2295681/bette-a-carde), updated 2014, lines 16–24, 27–33, 43–58. | Pairs `bette à carde` / `bette à cardes` / `bette` with English `chard` and `Swiss chard`, gives *Beta vulgaris* var. *cicla*, and says the `cardes (côtes)` are consumed as much as the leaves. The part note supports culinary identity and French part terminology; it does not establish a standalone standardized term `côtes de bette à carde`, household measure, or substitution. Existing ledger source `WP03K-S06` remains attached to whole chard with its current narrower locator. |
| `WP03-K-CHARD-STEMS-R994-20261019-S02` | University of Massachusetts Amherst Extension Nutrition Education Program, [Swiss Chard](https://www.umass.edu/agriculture-food-environment/ht/nutrition/publications-resources/produce-spotlight/swiss-chard), lines 24, 33–37, 45–53. | Says Swiss chard is grown for edible stems and leaves; directs separating stems and leaves and chopping stems/ribs; reports 1 lb fresh chard to 2½ cups stems. The report does not specify stem cup packing, cut size, or trimming. Its total cooked yield, leaf cups, storage guidance, and variety descriptions remain source-specific and are not assigned to this stem identity. `sourceKind: extension`. |
| `WP03-K-CHARD-STEMS-R994-20261019-S03` | University of Illinois Extension, [Swiss chard: From bitter to better](https://extension.illinois.edu/blogs/simply-nutritious-quick-and-delicious/2024-05-17-swiss-chard-bitter-better), published 2024-05-17, lines 93–95. | Uses `stalks` for chard and says stems take longer to cook and should be sautéed separately. This supports the part boundary and English alias, not a measure. Its broad whole-chard spinach/kale replacement advice is not transferred to stems. `sourceKind: extension`. |
| `WP03-K-CHARD-STEMS-R994-20261019-S04` | Mangez Québec, [Bette à carde](https://mangezquebec.com/produit/bette-a-carde/), lines 17, 23, 29–30. | Gives a Québec-facing generic chard page and uses `côtes de bette` in preparation directions, including separating them and removing hard threads. This supports descriptive local French part wording, not an OQLF ruling, a household measure, or a general cooking rule. The page is a generic produce guide, not a branded product specification. `sourceKind: culinary_reference`. |

## Remaining gaps and disposition

- The proposed identity fills a plant-part gap under the open Section K leafy-green sweep; bundled recipe demand is zero.
- The French compound is clear and source-composed but not separately standardized by OQLF. Keep it qualified and descriptive; do not expand the alias set with unqualified plant names.
- UMass provides one published whole-plant-to-stem cup relationship, but the cut and packing basis is unstated. Preserve it only as a source-bounded ledger observation or omit it if the ledger cannot retain those limits. No density or runtime conversion is supported.
- No supported context-scoped substitution was found. Measurement state beyond the cited UMass observation, stem size/count measures, crop-preparation basis, and any celery replacement remain open for evidence.
- Preserve whole Swiss chard, beet/beet greens, celery, cardoon, and all existing branded references and their evidence. Do not transfer whole-plant aliases, substitution claims, or product-specific measures.

Recommend one part-qualified reference, `Swiss chard stems / côtes de bette à carde`, distinct from `Swiss chard / bette à carde`. Keep the identity proposal-only and add no form under the whole-chard row, recipe link, density, unit mapping, conversion, or active substitution. Section K's broader generic sweep remains open.

No software tests, builds, emulator checks, or deployments were run because this is proposal-only documentation work.

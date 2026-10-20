# WP02 Section A7 R848 — durum-flour substitution evidence review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated as a blocked, recipe-specific finding on the existing durum-flour ledger row; no replacement identity, measure, or active rule was added. See the [R848–R850 integration README](../batches/wp02-wp03-wp04-r848-r850-gap-review-integration-20261019/README.md).
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products, including unresolved wheat-meal work ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). The A7 checklist records the completed product-specific durum-flour portions from R710 at line 2318. This review handles the distinct substitution-evidence field left open there. The catalog plan separately keeps durum flour distinct from durum semolina and remilled durum semolina ([plan, lines 1645–1648](../../RecipeBook-global-ingredient-catalog-plan.txt#L1645)).
- **Candidate:** Existing `ingredient-ref-durum-flour` (`durum flour / farine de blé dur`), category `FLOUR_AND_STARCH`.
- **Prior-work boundary:** [R710](wp02-a7-next-open-gap-review-r710-20261018.md) added two product-specific cup portions and explicitly left substitution research open. [R809](wp02-section-a7-durum-semolina-baking-substitution-review-r809-20261019.md) covers the other direction for the separate `ingredient-ref-durum-semolina` identity. [R845](wp02-section-a7-wheat-starch-substitution-review-r845-20261019.md) covers native wheat starch and its unnamed flour replacement lead. This review does not repeat those findings or reopen identity/measurement work.

## Recommendation

Record King Arthur Baking's formula-specific substitution note as a **blocked replacement lead** on the existing durum-flour ledger row. Set `substitutionResearchState` to `blocked_pending_evidence`, add the recipe source and one finding, and leave the active reference unchanged.

King Arthur's *Jeffrey’s Golden Durum Sesame Bread* is a four-loaf formula. Its dough lists 7 cups (868 g) of linked King Arthur Durum Flour, and an optional note says: “Substitute finely ground semolina for up to half of the durum flour, if desired.” The source establishes a one-way, recipe-bound lead for that named durum-flour product. It does not identify the semolina grade or product, state whether “half” is by mass or volume, quantify a replacement amount, or provide an adjustment method.

Do not assign the candidate replacement to either `ingredient-ref-durum-semolina` or `ingredient-ref-semola-rimacinata`. The active durum-semolina identity is supported as a coarse milling product; the separate remilled identity is documented as extra-fine. King Arthur's recipe says only “finely ground semolina,” without naming a product or linking to either class. The evidence therefore does not establish which active identity, if either, owns the stated replacement.

Keep the finding in the research ledger only. Do not add a replacement reference, alias, form, measure, density, mapping, conversion, yield, recipe link, global rule, or contextual runtime rule. Do not calculate half of the source's listed 7 cups or 868 g: the note does not identify its basis.

Do not add a one-cup portion observation. The recipe's 7 cups (868 g) remains formula context for this four-loaf formula, not a general measure or a new product-specific cup conversion.

## Current ownership and behavior

| Surface | Current state and proposed effect |
|---|---|
| Active reference | `ingredient-ref-durum-flour` is `durum flour / farine de blé dur`, with English alias `durum wheat flour`, French alias `farine de blé durum`, category `FLOUR_AND_STARCH`, `defaultDensity: null`, and `unitMappings: []`. No active reference or alias change is supported. |
| Neighboring identities | `ingredient-ref-durum-semolina` is `durum semolina / semoule de blé dur`; `ingredient-ref-semola-rimacinata` is `remilled durum semolina / semoule de blé dur remoulue`. Both remain separate from durum flour and each other. |
| Research ledger | The durum-flour row is `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. It has two R710 portion observations, six source entries, and no substitution findings. The proposed ledger-only delta changes substitution state to `blocked_pending_evidence`, appends one source, and appends one finding with no assigned replacements. |
| Forms and active rules | The current package contains 201 ingredient forms; none belongs to durum flour, durum semolina, or remilled durum semolina. The global and contextual substitution-rule files each contain zero rules. No form or active rule is proposed. |
| Picker projection | `IngredientSearch.kt` prefers complete normalized phrases before partial matches ([source](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L10)). Static projection from current names, aliases, and forms returns: `durum flour` → `ingredient-ref-durum-flour`; `farine de blé dur` → `ingredient-ref-durum-flour`; `durum` → durum flour, durum semolina, durum wheat berries, and remilled durum semolina; `semolina flour` → no result; `finely ground semolina` → no result. With no catalog term change, results stay as they are. |
| Bundled recipes | The current manifest lists 114 recipe files. Parsing all files found 1,123 ingredient rows; full serialized-file and row scans found zero target links and zero hits for `durum flour`, `durum wheat flour`, `farine de blé dur`, `farine de blé durum`, `durum semolina`, `semolina`, `finely ground semolina`, `semoule de blé dur`, or `semoule de blé durum`. The external King Arthur formula does not create bundled recipe demand; do not add a recipe link. |

## Source evidence

| Source | Direct evidence | Boundary |
|---|---|---|
| King Arthur Baking, [Jeffrey’s Golden Durum Sesame Bread](https://www.kingarthurbaking.com/recipes/jeffreys-golden-durum-sesame-bread-recipe), updated 2024-09-10; ingredients / dough; accessed 2026-10-19. Proposed source ID: `WP02-A7-DURUM-FLOUR-SUB-R848-20261019-S01`. | The four-loaf recipe links its 7 cups (868 g) durum-flour line to King Arthur Durum Flour. Its optional note allows finely ground semolina for up to half of that durum flour. | A source-specific baking formula, not a universal replacement rule. The note gives no replacement SKU, named semolina grade, mass/volume basis for “half,” amount, or adjustment. It does not support a same-mass or same-volume instruction. |
| King Arthur Baking, [Durum Flour, SKU 100243](https://shop.kingarthurbaking.com/items/durum-flour), existing ledger source `WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S01`; accessed 2026-10-19. | Confirms the recipe-linked product is King Arthur Durum Flour, SKU 100243, described as finely textured flour ground from extra-hard wheat. | Product identity and description only; does not identify the recipe's “finely ground semolina” replacement. |
| King Arthur Baking, [Semolina Flour, SKU 100227](https://shop.kingarthurbaking.com/items/semolina-flour), existing source `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02`. | Identifies King Arthur Semolina Flour as a coarse grind of durum wheat. | This product description cannot establish that the recipe's unlinked “finely ground semolina” phrase means this coarse product. Reuse the existing source ID; do not create a duplicate. |
| King Arthur Baking, [What is semolina flour, and how do I bake with it?](https://www.kingarthurbaking.com/blog/2023/06/20/what-is-semolina-flour-and-how-do-i-bake-with-it), existing source `WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01`. | Defines semolina flour as coarsely ground durum wheat and distinguishes finer durum flour. | The article discusses the reverse substitution direction on the separate durum-semolina row. It does not interpret the R848 recipe's phrase or support a durum-flour replacement rule. Reuse the existing source ID. |
| OQLF, [semoule de blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur), existing source `WP02-S23`. | Defines the ordinary durum-wheat semolina milling product and lists `durum semolina` / `semolina` as English terms. | Supports the existing ordinary semolina identity and its coarse-milling boundary; it does not identify the recipe's fine-grind candidate. Reuse the existing source ID. |
| European Commission, [Pane di Matera PGI product specification amendment](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=oj%3AJOC_2017_305_R_0013), existing source `WP02A2-S06`. | Names `semola rimacinata` as extra-fine semola and distinguishes it from `semolato` (fine semolina). | A protected-product specification showing a separate grade class, not proof that the King Arthur recipe means remilled durum semolina. Reuse the existing source ID. |

## Exact proposed ledger delta

On the existing `ingredient-ref-durum-flour` record:

- Change `substitutionResearchState` from `not_yet_researched` to `blocked_pending_evidence`.
- Append the R848 King Arthur recipe source below. Reuse the existing source IDs listed in the evidence table as supporting local source entries on this record; do not mint duplicate source IDs or URLs.
- Append one blocked finding with an empty `replacements` array. The candidate replacement remains unassigned because its catalog grade is unclear.
- Append one accepted decision documenting that the source lead is preserved while no replacement identity or active behavior is inferred.
- Leave `identityState`, `measurementState`, the two existing observations, active names and aliases, `defaultDensity`, `unitMappings`, forms, active rules, package yields, and recipes unchanged. In particular, do not append a measurement observation for the formula's 7 cups (868 g) or derive a one-cup amount from it.

```json
{
  "recordId": "ingredient-ref-durum-flour",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A7-DURUM-FLOUR-SUB-R848-20261019-S01",
      "url": "https://www.kingarthurbaking.com/recipes/jeffreys-golden-durum-sesame-bread-recipe",
      "title": "King Arthur Baking, Jeffrey’s Golden Durum Sesame Bread",
      "versionOrDate": "Updated 2024-09-10",
      "accessedOn": "2026-10-19",
      "locator": "Ingredients / Dough, King Arthur Durum Flour line and following substitution note.",
      "supports": "The four-loaf formula lists 7 cups (868 g) of linked King Arthur Durum Flour and says finely ground semolina may replace up to half of the durum flour. It does not identify a semolina grade or SKU, state whether the limit is by mass or volume, give a replacement amount, or provide a method adjustment.",
      "sourceKind": "test_kitchen"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "durum-flour-fine-semolina-replacement-lead-r848-20261019",
      "researchState": "blocked_pending_evidence",
      "fromIngredientRefId": "ingredient-ref-durum-flour",
      "replacements": [],
      "context": "King Arthur Baking’s optional substitution note for its four-loaf Jeffrey’s Golden Durum Sesame Bread formula, whose linked durum flour is SKU 100243.",
      "basis": "The formula's dough contains 7 cups (868 g) King Arthur Durum Flour. The note permits finely ground semolina for up to half of the durum flour, but does not name the semolina product or state a mass or volume basis for the limit.",
      "limitations": [
        "Keep this as a lead for the named King Arthur recipe and linked SKU 100243 only; do not generalize it to every durum-flour product, recipe, or pasta use.",
        "Do not assign the phrase finely ground semolina to ordinary durum semolina or remilled durum semolina. Current sources document those as separate coarse and extra-fine classes, while this recipe does not identify a product or class.",
        "Do not calculate half of the listed 7 cups or 868 g, infer equal mass or volume, or add a replacement quantity; the note does not state the basis.",
        "The source gives no liquid adjustment, method, performance result, or recipe link in the bundled library. Do not add an active global or contextual substitution rule, alias, form, measure, density, mapping, conversion, or yield."
      ],
      "sourceIds": [
        "WP02-A7-DURUM-FLOUR-SUB-R848-20261019-S01",
        "WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S01",
        "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02",
        "WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01",
        "WP02-S23",
        "WP02A2-S06"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Preserve King Arthur's explicit but recipe-specific fine-semolina replacement lead as blocked evidence. The source does not identify which active semolina grade it means or the basis of its up-to-half limit; no replacement reference, amount, or active rule is supported.",
      "sourceIds": [
        "WP02-A7-DURUM-FLOUR-SUB-R848-20261019-S01",
        "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02",
        "WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01",
        "WP02-S23",
        "WP02A2-S06"
      ]
    }
  ]
}
```

This is a partial update keyed to the existing record. Append the new source and finding, add the reused source entries to this row by their existing IDs and URLs, and preserve all other fields. The schema permits a blocked finding with no replacements; the proposal does not create an active rule record.

## Source-ID and URL ownership

| Identifier or URL | Owner at proposal time | R848 disposition |
|---|---|---|
| Recipe URL `https://www.kingarthurbaking.com/recipes/jeffreys-golden-durum-sesame-bread-recipe` | No active ledger source owner found. | Add once as R848 source S01 on `ingredient-ref-durum-flour`. |
| Source ID `WP02-A7-DURUM-FLOUR-SUB-R848-20261019-S01` | No ledger owner found. | Integrated on 2026-10-19; see the batch README. |
| Finding ID `durum-flour-fine-semolina-replacement-lead-r848-20261019` | No ledger owner found. | Integrated on 2026-10-19; see the batch README. |
| Target product page, `WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S01` | Already attached to `ingredient-ref-durum-flour`. | Reuse; do not create a second ID. |
| King Arthur semolina product, `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02` | Already shared by the durum-semolina and cornmeal ledger rows. | Reuse its existing ID and URL; copy the product-identification source entry from the durum-semolina row to document the coarse-grind boundary. |
| King Arthur semolina article, `WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01` | Already shared by the durum-semolina and emmer-semolina rows. | Reuse its existing ID and URL; copy the opening-definition source entry from the durum-semolina row to document the semolina/durum-flour grind distinction. |
| OQLF `WP02-S23`; European Commission `WP02A2-S06` | Already owned by the relevant durum-semolina/remilled-semolina identity rows. | Reuse their existing IDs and URLs; copy their current entries from the durum-semolina and remilled-durum-semolina rows, respectively, to support the established grade boundaries. |

The target proposal path did not exist before this review. No proposed ID or URL collides with an existing ledger owner or proposal path.

## Static checks and limits

- Read current `AGENTS.md`, the A7 plan and R710/R809 entries, the R845–R847 integrated batch, current workflow and roadmap, and the matching completed proposals before selecting this gap. The current R845–R847 README says A7 remains open ([integration README](../batches/wp02-wp03-wp04-r845-r847-gap-review-integration-20261019/README.md)); workflow and roadmap retain the same open status ([workflow, R845–R847](../ingredient-catalog-workflow.md#L3279), [roadmap, line 1537](../../../roadmap.md#L1537)).
- Parsed the active reference catalog, forms, both active substitution-rule files, manifest, every listed recipe, and research ledger. Counts were 1,888 references, 201 forms, 114 manifest recipes, 1,123 ingredient rows, zero global rules, and zero contextual rules.
- Checked the ledger schema shape for `sources`, `substitutionFindings`, `replacements`, and `decisions`; the proposed enums and blocked empty-replacement shape are valid for that schema. Rechecked current source-ID, URL, finding-ID, and proposal-path ownership.
- Recreated relevant picker results from current canonical names, aliases, and forms following `IngredientSearch.kt`; no catalog edits are proposed, so these results are unchanged.
- Opened the current King Arthur recipe, linked product page, semolina product page, King Arthur semolina guide, and OQLF entry online. Those pages were accessible. The European Commission's EUR-Lex page returned a cache-miss on direct open; its official French search-index result and the already-owned ledger entry were available and confirm the extra-fine `semola rimacinata` / fine `semolato` distinction. This retrieval limit affects only corroborating grade context, not the accessible King Arthur substitution lead.
- Checked UTF-8 and no-BOM for the saved proposal and local links/plan anchors after writing. No software tests, build, emulator, or deployment were run for this database-JSON-only integration under `AGENTS.md`.

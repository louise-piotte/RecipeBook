# WP02 B2/B3 polvilho azedo substitution review — R716 — 2026-10-18

## Review record

- **Status:** Proposal only; no shared catalog, ledger, recipe, plan, roadmap, workflow, or integration file changed.
- **Scope:** One open substitution-evidence question on existing `ingredient-ref-brazil-polvilho-azedo`: whether `polvilho doce` has a tested, bounded use in place of part of `polvilho azedo` in a named baking context.
- **Checklist anchor:** The open WP02 B3 parent covers cassava/tapioca, the two polvilho identities, potato starch, arrowroot, kudzu, and sweet-potato starch at [plan lines 3194–3252](../../RecipeBook-global-ingredient-catalog-plan.txt#L3203). R688 completed a Yoki-specific portion observation for the separate `ingredient-ref-brazil-polvilho-doce` and left its substitution research open; R598 recorded only an Azedo product package weight.
- **Selection boundary:** R202 resolved a Québec naming hold for `amidon aigre de manioc`; it did not review baking interchangeability. R677 reviewed arrowroot in Cherry Cake Filling. The regional-cuisine review kept an unrelated tacacá wording option out of general rules. This proposal does not reopen those decisions; it evaluates a separate primary experiment for a specific polvilho biscuit.
- **Proposal-local identifiers:** `WP02-B3-POLVILHO-AZEDO-SUBSTITUTION-R716-20261018-S01` and `polvilho-azedo-to-doce-biscoito-partial-substitution-r716-20261018`. They are examples for review only and have not been allocated in shared data.

## Recommendation

**Record one evidence-only, recipe-context substitution finding on the existing Azedo ledger record.** A University of Ceará institutional-repository abstract reports an experiment replacing 30%, 40%, and 50% of the polvilho azedo ingredient portion with polvilho doce in one polvilho-biscuit formulation. Given the stated 100-part azedo line, those percentages most naturally refer to that ingredient line rather than total dough; this denominator reading is an inference, and the abstract does not state whether its parts or percentages are by mass, volume, or another basis. It reports that dough acidity decreased as replacement rose and that measured specific volumes showed no significant variation at the authors' stated p=0.05 criterion through 50% replacement in the tested formulations.

Set `ingredient-ref-brazil-polvilho-azedo.substitutionResearchState` to `researched_supported` to reflect that one directional, bounded finding. Keep the finding in the research ledger only: do not create an active global or contextual substitution rule, add a `ruleId`, link a recipe line, or represent a general equivalence. The 2016 conference-proceedings abstract does not identify product brands or state the mass/volume/other basis of its parts and replacement percentages; its denominator can only be inferred from the formula context. It reports expansion and acidity rather than sensory acceptance, and applies only to the described biscuit experiment.

Keep the existing Azedo `measurementState: researched_no_supported_value`, Da Terrinha 500 g package observation, null default density, empty unit mappings, names, aliases, forms, and recipe data unchanged. Keep the separate Doce ledger record and its Yoki 20 g per `colher de sopa` portion unchanged. Do not reverse the direction, infer full replacement, or transfer the result to pão de queijo, generic tapioca/cassava starch, other starches, or flour.

## Evidence and limits

The University of Ceará repository describes the work as a 2016 conference abstract in *Revista Encontros Universitários da UFC*, v. 1, n. 1, from the IX Encontro de Pesquisa e Pós-Graduação. Its abstract says the authors prepared three formulations replacing 30%, 40%, and 50% of polvilho azedo with polvilho doce. Since the same sentence gives a formula with 100 parts polvilho azedo, 2.0 parts salt, 8.0 parts edible oil, and 50.0 parts water, the most natural denominator reading is the 100-part azedo ingredient line (inference), not total dough. The abstract does not specify whether the parts or replacement percentages are by mass, volume, or another basis. Biscuits were baked in an electric oven at 180 °C for 60 minutes; the abstract reports three repetitions and measures specific volume by millet-seed displacement. It says dough acidity declined as replacement increased and specific volumes had no significant variation at the authors' stated p=0.05 criterion through 50% replacement. The abstract provides no per-formulation measurements, exact p-values, or full statistical method.

The abstract's recipe context suggests the replacement denominator is the 100-part polvilho azedo ingredient line, not the total dough, but this reading is inferred. The source does not state whether the parts or percentages are mass-based, volume-based, or another basis. It does not name product brands or their processing details, provide per-formulation specific-volume/acidity values, exact p-values, or the full statistical method, or report flavor, texture, dough handling, storage, or consumer acceptance. Therefore the percentage levels belong in the finding's textual basis, not as a volume/mass quantity or reusable ratio. The test supports a narrow experimental use; it does not establish equivalence between the product identities or a safe general substitution.

Brazil MAPA's existing guidance distinguishes the source-named polvilho products and notes variability in their production and in methods to characterize them. That reinforces keeping both identities and the finding's scope separate; it does not replace the experiment or validate transfer across products. Current Yoki and Grupo PQ pages identify the separate source-named products but provide no substitution experiment.

## Current ownership and identity boundaries

| Reference | Current bilingual display and search terms | Disposition |
|---|---|---|
| `ingredient-ref-brazil-polvilho-azedo` | EN `sour cassava starch (polvilho azedo)`; FR `polvilho azedo`; FR alias `farine de polvilho azedo`; no EN aliases. | Keep the source name visible; attach the directed evidence finding here because this is the ingredient partially replaced in the study. The French display remains provisional for Québec review. |
| `ingredient-ref-brazil-polvilho-doce` | EN `sweet cassava starch (polvilho doce)`; FR `polvilho doce`; aliases empty. | Keep as the tested replacement. Do not add an inverse finding or infer that it can replace Azedo in other directions or uses. |
| `ingredient-ref-tapioca-starch` | EN `tapioca starch`; FR `fécule de manioc`; source-backed aliases remain as stored. | Keep generic wet-extracted cassava/manioc starch separate from each Brazilian polvilho row. |
| `ingredient-ref-cassava-flour` | Whole-root flour with current French `farine de manioc` alias. | Keep separate from extracted starch and the two source-named polvilho products. |

No form, package-yield record, global substitution rule, or contextual substitution rule refers to either polvilho reference. The existing naming boundaries and the broad `cassava starch` search are unchanged.

## Picker projection

`IngredientReferenceSearchIndex` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents, punctuation, and spacing, returns full word-phrase matches first, and only then falls back to substring matching. This proposal changes only the ledger, so each projected result is unchanged:

| Query | Current result | Proposed result |
|---|---|---|
| `polvilho azedo`; `farine de polvilho azedo`; `sour cassava starch` | `ingredient-ref-brazil-polvilho-azedo` | Same |
| `polvilho doce`; `sweet cassava starch` | `ingredient-ref-brazil-polvilho-doce` | Same |
| `polvilho` | Both Azedo and Doce | Same two rows |
| `cassava starch` | Azedo, Doce, and `ingredient-ref-native-waxy-tapioca-starch` | Same three rows |
| `fécule de manioc` | `ingredient-ref-tapioca-starch` | Same |
| `sour tapioca starch`; `sweet tapioca starch` | No result | No result |

The Portuguese experiment terms are evidence only; they are not proposed as aliases or as new English/French picker labels. No alias collision is introduced.

## Bundled recipe and link scan

Scanned every path listed in `seed/bundled-library/manifest.v1.json`: **114 recipe files and 1,123 structured ingredient rows**. Normalized searches of serialized recipe JSON and ingredient-row content for `polvilho azedo`, `polvilho doce`, `polvilho`, `sour cassava starch`, `sweet cassava starch`, `cassava starch`, `amidon de manioc`, `farine de polvilho azedo`, `pão de queijo` / `pao de queijo`, and `biscoito de polvilho` found no hits. No row links to either polvilho reference. The experiment is external evidence, not a bundled recipe request; add no recipe link or recipe edit.

The live forms and active substitution files contain no polvilho-linked records or rules. The existing Azedo package observation remains ledger evidence only and is not an active package-yield record.

## Proposed ledger delta

The following is a schema-valid `Record`-shaped proposal example containing the R716 source, finding, and decision. It shows only the proposed delta entries; at integration, append them to the existing Azedo record, preserve its earlier sources and measurement observation, and update only its top-level substitution research state. The source ID and finding ID remain proposal-local until an integration owner accepts them.

```json
{
  "recordId": "ingredient-ref-brazil-polvilho-azedo",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP02-B3-POLVILHO-AZEDO-SUBSTITUTION-R716-20261018-S01",
      "url": "https://repositorio.ufc.br/handle/riufc/48786",
      "title": "Mendonça et al., Avaliação da propriedade de expansão do biscoito de polvilho azedo com adição de polvilho doce",
      "versionOrDate": "2016; Revista Encontros Universitários da UFC, v. 1, n. 1; IX Encontro de Pesquisa e Pós-Graduação",
      "accessedOn": "2026-10-18",
      "locator": "Institutional repository abstract: formulation, methods, and results",
      "supports": "Reports experimental partial replacement of polvilho azedo with polvilho doce at 30%, 40%, and 50% in one polvilho-biscuit formulation; reports decreasing acidity with increased substitution and no significant variation in specific volume at the authors' stated p=0.05 criterion through 50%.",
      "sourceKind": "direct_measurement"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "polvilho-azedo-to-doce-biscoito-partial-substitution-r716-20261018",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-brazil-polvilho-azedo",
      "replacements": [
      {
        "ingredientRefId": "ingredient-ref-brazil-polvilho-doce"
      }
    ],
      "context": "Only the polvilho biscuit ('biscoito de polvilho azedo' / peta-style biscuit) formulation reported in the 2016 UFC conference abstract.",
      "basis": "The abstract reports 30%, 40%, and 50% replacement of polvilho azedo by polvilho doce. Given the formula's 100-part polvilho azedo line, those percentages most naturally refer to that ingredient portion, not total dough (inference). The abstract does not say whether the parts or percentages are by mass, volume, or another basis. It reports decreasing dough acidity and no significant variation in measured specific volumes at the authors' stated p=0.05 criterion through 50% replacement in the tested formulations; it provides no per-formulation values, exact p-values, or full statistical method.",
      "adjustments": [],
      "expectedEffects": [
      "Lower measured dough acidity as the polvilho-doce share increases in the tested formulation.",
      "No statistically significant specific-volume change was reported for the tested 30%, 40%, and 50% replacement levels in this experiment."
    ],
      "limitations": [
      "The source is a conference-proceedings abstract, not a full methods/results report. Brands and processing details are not identified; the denominator reading is inferred from the 100-part azedo formula line, and the mass/volume/other basis of the parts and percentages is unstated; per-formulation measurements, exact p-values, and full statistical method are absent.",
      "Evidence applies only to this biscuit formulation and its tested partial replacement levels; do not infer full replacement, another direction, or transfer to pão de queijo or other recipes.",
      "The source reports expansion and acidity, not sensory acceptance, flavor, texture, handling, shelf life, or general baking performance.",
      "Do not create an active global or contextual rule, a recipe-line link, a density, a measurement conversion, or a reusable amount from this finding."
    ],
      "sourceIds": [
        "WP02-B3-POLVILHO-AZEDO-SUBSTITUTION-R716-20261018-S01"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record one directed, evidence-only partial replacement finding for polvilho azedo replaced by polvilho doce in the specific tested biscuit formulation. Keep the product identities, bilingual names, measurement data, active rules, and recipe links unchanged.",
      "sourceIds": [
        "WP02-B3-POLVILHO-AZEDO-SUBSTITUTION-R716-20261018-S01"
      ]
    }
  ]
}
```

No measure, density, active substitution rule, inverse finding, or recipe-line substitution is proposed.

## Source ownership audit

| Source ID / owner | URL | Use and limit |
|---|---|---|
| **R716-S01, proposal-local** | University of Ceará, [institutional repository record](https://repositorio.ufc.br/handle/riufc/48786). | New URL and ID for the primary experimental abstract; no current ledger owner was found. Its online repository metadata and indexed abstract identify it as 2016 conference-proceedings work. The source's age and abstract-only reporting are part of the limit. |
| `WP02-POLVILHO-LABELS-20261010-S01`, existing on both polvilho ledger rows | Brazil MAPA, [Ofício-Circular 1/2022](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/arquivos/orientacao_tecnica_oficio_circular_nr_01_2022-polvilhos/%40%40download/file). | Reuse only as product-boundary context: named polvilho products and process variability. It does not establish the R716 experimental result or a generic substitution. |
| `WP02-POLVILHO-LABELS-20261010-S05-AZEDO`, existing on the Azedo ledger row | Grupo PQ, [Polvilho Azedo](https://www.grupopq.com.br/produto/polvilho-azedo/). | Current manufacturer name, English product wording, package options, and a labeled serving; no replacement test. |
| `WP02-B3-POLVILHO-DOCE-MEASURE-R688-20261018-S01`, existing on the Doce ledger row | Yoki, [Polvilho Doce](https://www.yoki.com.br/produtos/polvilho-doce-500-g). | Current product identity and Yoki's own 20 g per one `colher de sopa` serving; it does not support a transferable measure or substitution. |

The proposed R716 source ID and UFC handle URL were checked against the live ledger, plan, roadmap, and proposal/batch archives. Neither is currently owned there; the R716 prefix and finding ID were also absent. Existing MAPA, Grupo PQ, and Yoki source IDs and URLs remain with their current owners and are reused only as listed above. No shared source IDs are allocated by this proposal.

## Review checks

- [x] Read `AGENTS.md`, relevant `Requirements.md` substitution provisions, the open B2/B3 checklist, recent roadmap/workflow progress, the active references/forms/ledger/rules, and prior polvilho/arrowroot proposals before selecting this gap.
- [x] Verified the primary UFC abstract and current manufacturer product pages online; reviewed MAPA's product-boundary guidance. The UFC work is explicitly a 2016 conference abstract, so its findings remain formula-scoped.
- [x] Audited English/French names and current picker projection with `IngredientSearch.kt`; no aliases or picker behavior change.
- [x] Scanned the 114 manifest-listed recipes / 1,123 ingredient rows and checked forms, active rules, package yields, and links for both target references; no bundled demand or linked row was found.
- [x] Audited current URL/source-ID ownership. R716 identifiers remain proposal-local; no shared data changed.
- [x] No software tests, build, emulator, or deployment were run for this proposal-only evidence review.

# WP02 Section A7 R978: defatted oat bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Integration status:** Accepted and integrated root-only in the [R978–R980 integration README](../batches/wp02-wp03-wp05-r978-r980-generic-gap-integration-20261019/README.md). This packet records the proposal-stage recommendation and pre-integration snapshot.
- **Open-plan anchor:** Section A7 remains open for other grain meals and milling products ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Selected generic gap:** Defatted oat bran, a distinct human-food oat-bran material named in primary biscuit research.
- **Recommendation:** If accepted, add one identity-only `GRAIN_AND_CEREAL` reference for `defatted oat bran / son d’avoine dégraissé`. Keep the French compound provisional. Add no aliases, forms, measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.

## Identity boundary and recommendation

The catalog already has generic `oat bran / son d’avoine`, with dry and cooked forms. A primary food study separately names full-fat and defatted cereal brans, including oat bran, and uses these materials in biscuit formulations. This supports a distinct named ingredient identity for defatted oat bran; it does not define a universal defatting method or product specification. [R978-S01]

Keep the proposed identity separate from:

- `ingredient-ref-oat-bran`, the general oat-bran identity and its dry/cooked forms;
- `ingredient-ref-oat-germ` and `ingredient-ref-oat-germ-meal`, which are different kernel fractions;
- oat-bran concentrates, isolated beta-glucan or other fibre fractions, and other further-processed ingredients;
- defatted rice bran and the other source-grain-qualified bran identities.

The Québec French base term `son d’avoine` is the OQLF-preferred term for edible oat bran and its English equivalent is `oat bran`. The proposed `dégraissé` qualifier is a descriptive construction, not an attested OQLF term for this ingredient. Keep the full French display provisional and add no aliases. Reuse the existing oat-germ boundary record's OQLF source entry rather than adding a duplicate source record; it directly defines oat bran and supports keeping the candidate separate from the kernel's germ fraction. [Reused: `WP02-B2-OAT-GERM-R933-20261019-S04`]

This is an identity-driven gap, not a recipe-demand claim. The bundled recipe audit found no oat-bran wording or candidate-specific demand.

## Scope and queued-work disposition

- The cross-category queue review found no open checklist item whose sole task is to expand a commercial-product roster. Additional brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only work is out of scope because commercial-product counts do not add ingredient diversity. Existing branded references and their evidence remain preserved. [Generic-ingredient scope review]
- The A7 Anson Mills `Colonial-Style Toasted Stone Cut Wheat Meal` lead was already explicitly marked out of scope in R875 for the same reason. Preserve the historical R605 review and its product-specific evidence; stop that product-only line here. This proposal does not pursue or use it as evidence for a generic meal.
- A named-product technical sheet appeared in the bounded exact-name density search. It was excluded as product-specific evidence and not pursued further. No product-only measurement or claim is transferred to the proposed generic identity.
- R972's defatted rice bran is a separate source-grain identity. R962's oat germ meal is a separate kernel fraction. This proposal does not revise either record or reuse product-specific claims.

## Current ownership and recipe-demand audit

Read-only pre-integration snapshot of the live package and ledger on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | 1,995 rows. No exact `ingredient-ref-defatted-oat-bran` ID, `defatted oat bran` name or alias, or `son d’avoine dégraissé` display or alias exists. Existing adjacent rows are `ingredient-ref-oat-bran`, `ingredient-ref-oat-germ`, and `ingredient-ref-oat-germ-meal`; the separate `ingredient-ref-defatted-rice-bran` row is also present. | Add at most one source-bounded identity. Preserve every existing row and its evidence. |
| Ingredient forms | 205 forms. No form belongs to the proposed ID or matches the proposed defatted wording. The existing dry and cooked oat-bran forms remain attached only to `ingredient-ref-oat-bran`. | Add no form and do not copy the general oat-bran forms to the defatted identity. |
| Legacy import identities | 55 candidates. No exact ID, English phrase, or French phrase is present. | No legacy promotion, merge, or alias transfer is needed. |
| Research ledger | 2,400 records. No identity record owns the proposed ID or exact candidate wording. The IndianJournals article and VTT dissertation URLs are not assigned to ledger sources. The OQLF `son d’avoine` URL is already recorded under existing oat-bran terminology work. | If accepted, add proposal-local S01–S02 to a new generic identity record and reuse the existing OQLF source ID. Do not duplicate its URL. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 structured ingredient rows were scanned. Searches for `defatted oat bran`, `oat bran defatted`, the candidate ID, `son d’avoine dégraissé`, and `son d’avoine déshuilé` found 0 matching recipe files, 0 matching ingredient rows, and 0 direct links. A separate scan found no generic `oat bran` or `son d’avoine` recipe demand either. | No recipe link, recipe-line edit, or recipe amount is supported. |
| Prior proposal archive | No prior focused `defatted oat bran` identity review or candidate allocation was found. R962 covers oat germ meal; R972 covers defatted rice bran; neither owns this source-grain-qualified identity. | Review only defatted oat bran; do not reopen or generalize adjacent decisions. |

No existing branded entry, source owner, form, recipe line, or product-specific evidence is changed by this proposal.

## Evidence and limits

| Source ID | Source and support | Scope limit |
|---|---|---|
| **R978-S01** | J. Kaur, H.P.S. Nagi, Savita Sharma, and B.N. Dar, [“Physico-chemical and sensory quality of cereal bran enriched biscuits”](https://indianjournals.com/article/jdfhs-31-3-004), *Journal of Dairying, Foods & Home Sciences* 31(3) (2012), 176–183. The primary study abstract names both full-fat and defatted cereal brans, including oat, as ingredients in biscuit formulations. | The abstract reports cereal-bran replacement levels of 0, 5, 10, 15, and 20% in those biscuit formulations. These levels, materials, sensory-panel results, and conditions belong to that study; they do not establish household amounts, general wheat-flour substitution advice, density, or a standard defatting process for every oat-bran material. |
| **R978-S02** | Juhani Sibakov, [*Processing of oat dietary fibre for improved functionality as a food ingredient*](https://cris.vtt.fi/en/publications/processing-of-oat-dietary-fibre-for-improved-functionality-as-a-f/), dissertation, Aalto University / VTT Technical Research Centre of Finland (2014). The primary research describes defatting oats and preparing oat-bran concentrate fractions for food-process studies. | This work concerns its specific supercritical-CO₂ defatting, milling, fractionation, concentrates, and experimental extrudates. It corroborates a processing boundary only; it does not define the proposed unqualified identity, a universal grade, or transferable composition or recipe behavior. |
| **Reused: `WP02-B2-OAT-GERM-R933-20261019-S04`** | Office québécois de la langue française, [GDT: `son d’avoine`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18955166/son-davoine), last updated 2017. | Supports the preferred Québec French base term and the edible oat-bran concept; it does not attest the complete phrase `son d’avoine dégraissé`. Reuse the oat-germ record's existing source ID. |

The two new R978 study source IDs were proposal-local at review time and are now allocated to the integrated identity record. The existing OQLF source ID is reused from the oat-germ boundary record. No claims, amounts, or results are transferred from an oat-bran concentrate or a named retail product.

## Proposed minimal data and ledger state

If accepted, add only this identity reference:

```json
{
  "id": "ingredient-ref-defatted-oat-bran",
  "nameEn": "defatted oat bran",
  "nameFr": "son d’avoine dégraissé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Proposed research-ledger state, if integrated:

- `recordId`: `ingredient-ref-defatted-oat-bran`; `recordType`: `ingredient_reference`.
- `identityState`: `verified`, based on the primary biscuit study naming defatted oat bran as a human-food ingredient, with the OQLF source supporting only the Québec French base term.
- `measurementState`: `researched_no_supported_value`. Bounded generic searches for `defatted oat bran` with `cup grams`, `1 cup weight`, and `bulk density g/ml` did not establish a generic kitchen measure, density, unit mapping, conversion, or yield. One named-product technical sheet surfaced and was excluded; its density cannot be transferred to generic oat bran. Study formulation values also remain source-specific.
- `substitutionResearchState`: `blocked_pending_evidence`. The biscuit study tests cereal-bran replacement of wheat flour in its own formulations, but does not support a reusable recipe-picker rule. Record the study boundary only; add no global or contextual rule or recipe-line substitution link.
- Add the two R978 primary-study sources and one identity decision; reuse the OQLF source ID above.
- Add no aliases, forms, measurement observations, density, mappings, conversions, yields, recipe links, or active substitution rules.

## Unsupported bounds and next review boundary

1. The reviewed primary study supports the ingredient name and research use, not current Québec retail prevalence or commonplace household use.
2. The source studies do not establish one standard oil-removal process, residual-fat threshold, particle size, grade, or composition for generic defatted oat bran.
3. The proposed French compound is descriptive and provisional; only `son d’avoine` is directly supported as OQLF-preferred wording.
4. Experimental biscuit replacement levels and oat-bran-concentrate processing data cannot be turned into generic measures, densities, yields, substitutions, or nutrition claims.
5. Reopen measurement work only with evidence that is transferable beyond a named product. Reopen substitution work only with evidence for a clear recipe role, method, and usable scope.

This proposal changes only this Markdown file. No tests, build, emulator run, or deployment were performed, as requested.

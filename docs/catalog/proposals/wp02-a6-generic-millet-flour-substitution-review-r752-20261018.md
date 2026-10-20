# WP02 A6 R752 — generic millet-flour substitution review

- **Status:** integrated 2026-10-18; two formula-specific findings are recorded as `blocked_pending_evidence` on the existing ledger row.
- **Target:** existing `ingredient-ref-millet-flour` / ledger record `ingredient-ref-millet-flour`
- **Disposition:** integrated two formula-specific substitution findings as `blocked_pending_evidence`; added no active global or contextual substitution rule.

## Checklist scope and current state

The active [WP02 Section A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1838) remains open for continued review of millet and other grain flours. The generic millet-flour identity decision is already complete: retain it as `millet flour / farine de millet`, separate from pearl- and finger-millet flours. The [R312 measurement review](wp02-a6-next-regional-flour-gap-review-r312-20261016.md) closed the measurement question with source-scoped portions and no reusable density or unit mapping; it explicitly left substitution research unchanged. The latest [R749–R751 integration checkpoint](../batches/wp02-wp03-wp04-r749-r751-gap-review-integration-20261018/README.md) covers red quinoa flour, corn-poha thickness, and whole Walleye, not generic millet-flour substitution. No later generic-millet-flour substitution review was found in the proposal, batch, plan, or roadmap archive.

The [reference row](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L13311) has no aliases, default density, or unit mappings. At proposal drafting, the identity-verified [ledger row](../research-ledger.v1.json) had measurement research marked `researched_no_supported_value` and substitution research still `not_yet_researched`, with no substitution findings. Integration added two formula-specific findings and set substitution research to `blocked_pending_evidence`; it added no form, active rule, or numeric behavior. Existing identity and measurement sources remain owned by this ledger row; the proposed study source IDs and URLs were unowned when checked.

## Finding

Two primary research articles report controlled wheat–millet flour formulas. Their publisher abstracts do not identify the millet species. One explicitly reports experimental wheat-bread substitution levels; the other describes flour addition in a chapati experiment. These are useful as formula-specific evidence, but neither supplies a transferable home-recipe rule for an unspecified millet flour, other recipes, or other millet-flour products. Therefore, record the tested contexts as blocked findings and keep the runtime substitution catalog empty for this ingredient.

The existing IFAD source [WP06-SA-20261010-S28](https://www.ifad.org/en/w/recipes-for-change/recipes-for-change-ema-datshi-and-millet-momos) is already attached to this ledger row. Its Bhutan-context recipe uses 680 g of generic millet flour in a standalone momo dough, then adds water to knead; it gives no replacement instruction or comparison flour. Reuse that existing source ID as context only; do not duplicate its ledger source entry or infer a substitution rule from the recipe.

## Proposed source entries

Append these two source records to the existing generic millet-flour ledger row. Both source IDs and exact URLs were checked against the live ledger and proposal/batch archive and were unowned when this proposal was drafted.

| Source ID | Primary source and evidence limit |
| --- | --- |
| `WP02-A6-MILLET-FLOUR-SUB-R752-20261018-S01` | Aprodu and Banu, [“Rheological, thermo-mechanical, and baking properties of wheat-millet flour blends”](https://journals.sagepub.com/doi/10.1177/1082013214536175), *Food Science and Technology International* 21(5), 342–353 (first published online 2014-05-16; issue 2015). Accessed 2026-10-18. Locator: publisher abstract. The abstract says the study made doughs and breads with 10%, 20%, 30%, 40%, and 50% millet flour in white, dark, and whole-wheat flour; it reports up to 30% as usable in composite bread and adverse loaf results at 40% and 50%. The full article is restricted, and the accessible abstract does not identify millet species, sample processing, or a household recipe basis. Source kind: `other`. |
| `WP02-A6-MILLET-FLOUR-SUB-R752-20261018-S02` | Siddique, Wang, Wu, and Ahmad, [“Effect of Millet flour addition on dough rheology, chapati quality, and moisture distribution”](https://www.sciencedirect.com/science/article/pii/S2949824424000247), *Food and Humanity* 2 (2024), 100249, DOI [10.1016/j.foohum.2024.100249](https://doi.org/10.1016/j.foohum.2024.100249). Accessed 2026-10-18. Locator: publisher metadata and abstract. The abstract describes 0–50% millet-flour addition in wheat dough and chapati evaluation; the abstract reports favorable sensory quality up to 30%, while a publisher highlight reports up to 35%. Direct page retrieval returned HTTP 403 during this review. The accessible publisher material does not identify millet species or state a general recipe replacement instruction; the differing summary thresholds are not adopted. Source kind: `other`. |

These are source-scoped experimental reports, not product, species, or Québec naming evidence. Do not update the existing OQLF, Mako Foods, IFAD, CNF, or Cuisine Soleil sources. The CNF and Cuisine Soleil portions remain measurement-only as decided in R312.

## Exact proposed ledger delta

On `ingredient-ref-millet-flour` only:

1. Append source entries S01 and S02 above.
2. Set `substitutionResearchState` to `blocked_pending_evidence`.
3. Append these two findings, each with `researchState: blocked_pending_evidence`:

| Finding ID | Context and basis | Limits | Source IDs |
| --- | --- | --- | --- |
| `millet-flour-wheat-bread-trial-r752-20261018` | Aprodu and Banu's controlled wheat–millet composite bread trial. The publisher abstract reports tested ratios of 10–50%, says levels up to 30% could be used in that composite bread, and reports poorer loaf volume, crumb texture, and taste at 40% and 50%. | The abstract does not identify millet species or a household flour product. This is one bread-study formulation across named wheat-flour extraction classes; it does not support a generic replacement percentage, hydration adjustment, or substitution for flatbreads, cakes, cookies, pastry, or thickening. | `WP02-A6-MILLET-FLOUR-SUB-R752-20261018-S01` |
| `millet-flour-chapati-trial-r752-20261018` | Siddique et al.'s wheat-dough and chapati experiment. The publisher abstract describes 0–50% millet-flour addition and reports favorable sensory quality up to 30%; the publisher highlight gives a different upper figure of 35%, so do not store either figure as a recommended threshold. | The accessible source calls this flour “added,” does not identify millet species, and does not establish a recipe-independent replacement instruction. The accessible abstract and highlight disagree on the sensory cutoff. Do not infer a generic ratio, dough hydration change, or rule for a different flatbread or other recipe. | `WP02-A6-MILLET-FLOUR-SUB-R752-20261018-S02` |

4. Append an `unresolved` decision explaining that the papers document only their controlled wheat-bread and chapati contexts, leave the botanical millet identity unresolved in the accessible abstracts, and do not support an active substitution rule. Cite S01 and S02.

Do not change reference IDs, names, aliases, category, or source ownership. Add no form, measurement observation, density, unit mapping, yield, recipe link, conversion, or substitution rule. Keep `defaultDensity: null` and `unitMappings: []`. The blocked state preserves the research evidence and its limits; it does not express a general recommendation to replace wheat flour with millet flour.

## Ownership, picker, and bundled recipe corpus

At proposal drafting, the source-ID prefix and finding IDs were absent from the research ledger, proposals, and integration batches. Exact URL ownership checks found no prior ledger source for the SAGE or ScienceDirect study page. Existing IFAD URL ownership remains `ingredient-ref-millet-flour` / `WP06-SA-20261010-S28` and is reused without duplication. No active or legacy candidate used the proposed IDs.

The current [ingredient search projection](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) is unchanged by this ledger-only proposal. Following its normalized complete-phrase behavior, “millet flour” returns six references: finger, foxtail, kodo, generic, pearl, and proso millet flour. “Farine de millet” returns five: foxtail, kodo, generic, pearl, and proso millet flour. There are no forms or rule matches for generic millet flour. The proposal adds no alias, so those picker results remain unchanged.

A scan of all 114 recipe files listed by the current [bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), covering 1,123 structured ingredient rows and the full serialized recipe text, found zero hits for `ingredient-ref-millet-flour`, “millet flour,” or “farine de millet.” This bundled-corpus result is not evidence about user-created recipes. The IFAD recipe above is outside the bundled corpus and has no explicit flour substitution.

## Static review checks

- Read current `AGENTS.md`, the active A6 checklist, roadmap, workflow, and R749–R751 integration checkpoint; no newer review of this exact substitution question was found.
- Confirmed the reference, form, global-rule, contextual-rule, ledger, source-ID/URL, and bundled recipe state described above from the current package and ledger.
- Recomputed picker phrase results from the current reference names/aliases and the search implementation; no catalog term changes are proposed.
- Checked relative local links, UTF-8 without BOM, trailing whitespace, and mojibake markers in this proposal.
- During proposal review, no database JSON, code, or package data was edited. Integration added ledger-only research data; no software tests, build, emulator, or deployment was run under the current database-JSON-only rule.


## Integration result

Both formula-specific findings and their two study sources are now on `ingredient-ref-millet-flour`; `substitutionResearchState` is `blocked_pending_evidence`. No active rule, measurement observation, or numeric behavior was added. See the [R752–R754 integration README](../batches/wp02-wp03-wp04-r752-r754-gap-review-integration-20261018/README.md).

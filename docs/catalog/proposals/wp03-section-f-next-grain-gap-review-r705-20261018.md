# WP03 Section F R705 — Riceberry rice identity review

- **Reviewed:** 2026-10-18
- **Status:** Proposal only; no shared catalog, ledger, plan, workflow, or generated file changed.
- **Plan anchors:** Section F asks to continue unresolved grain identity and terminology coverage at [line 564](../../RecipeBook-global-ingredient-catalog-plan.txt#L564), says to keep named rice types separate without multiplying them by preparation state at [line 789](../../RecipeBook-global-ingredient-catalog-plan.txt#L789), and explicitly withholds generic `purple rice` as an unsupported color-based alias at [line 546](../../RecipeBook-global-ingredient-catalog-plan.txt#L546). This review tests whether source-named Riceberry merits its own variety identity without broadening that generic color term.
- **Gap:** The active catalog has broad black rice and several named rice identities, but does not represent the current Canadian/Québec-market Riceberry rice product or named Thai variety.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for Riceberry rice, scoped to grain sold expressly as Riceberry. Do not treat unqualified purple rice, black rice, or Riceberry-containing blends as the same ingredient.

## Selection and ownership audit

Before selecting this candidate, I checked the active Section F list, the current seed references and forms, the research ledger, the legacy identities, and the WP03 Section F proposal and batch archive. The exact terms `Riceberry`, `Riceberry rice`, `rice berry`, `riz violet`, and `purple rice` have no active reference, alias, form, or legacy-candidate owner. The proposed ID `ingredient-ref-riceberry-rice` and R705 source-ID prefix below are unallocated.

The sole relevant archive mention is the existing `WP03-WILD-RICE-BLEND-20261011-S05` Costco listing on `ingredient-ref-wild-rice-blend`. Its ledger locator notes a possibly inconsistent Riceberry mention in a wild-rice-blend description; the source was used for the mixture’s French title and blend boundary, not as evidence for a plain Riceberry identity. Reuse it only for that blend-boundary context, and do not reassign its source ID or URL.

## Identity and product boundary

Kasetsart University’s Rice Science Center describes Riceberry as a named rice variety developed by crossing Jao Hom Nin with Khao Dawk Mali 105, and reports the variety and trademark registration [S01]. A current Canadian manufacturer lists `Riceberry Rice` as pure Riceberry rice from Thailand and names Riceberry rice in its ingredient statement [S02]. This establishes a stable, source-named grain product, not a generic purple-rice class.

Current Québec-facing listings use `Riz violet Riceberry` for Sumer’s Riceberry product [S03–S04]. This is market-attested French wording, not an OQLF ruling. Use the title only for Riceberry-labelled grain; do not turn `purple rice`, `riz violet`, `black rice`, `riz noir`, or `jasmine rice` into aliases. Riceberry’s ancestry and colour do not make those broad color or parent-variety terms equivalent.

Keep plain Riceberry distinct from the broader `black rice / riz noir` identity, black glutinous rice, jasmine rice, generic rice, and composite products. The explicit Riceberry name identifies a variety; brown/whole, dry/cooked, or other preparation qualifiers remain separate dimensions and do not justify a Riceberry state matrix. Riceberry listed as a component in a wild-rice blend or another mixture remains part of that mixture and does not make the blend a Riceberry ingredient.

## Proposed identity if accepted

| Field | Proposed value |
| --- | --- |
| Reference ID | `ingredient-ref-riceberry-rice` (suggested, not reserved) |
| Category | `GRAIN_AND_CEREAL` |
| English display | `Riceberry rice` |
| French display | `riz violet Riceberry` (current Québec-market product wording; not OQLF-approved) |
| English aliases | None |
| French aliases | None |
| Scope | Edible rice grain expressly sold or identified as Riceberry; exclude blends, prepared dishes, and generic colour descriptions. |

Add no forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions. Keep `defaultDensity: null` and `unitMappings: []`. Product package sizes and cooking instructions are source-specific and are not reusable measures or state conversions.

## Recipe demand

All 114 manifest-listed recipes and 1,123 structured ingredient rows were scanned for `Riceberry`, `Riceberry rice`, `rice berry`, `riz violet`, and `purple rice`. There were no matching recipe files, ingredient rows, or links to a Riceberry reference. The absence of bundled demand does not erase this source-backed named variety, but no recipe link or recipe-specific behavior is supported.

## Picker projection

The following static projection applies the repository’s current normalized phrase-first search rules to live reference names, aliases, and forms, then adds only the proposed displays. It is a data projection, not an emulator or application test.

| Query | Current result | With proposed display names |
| --- | --- | --- |
| `Riceberry`; `Riceberry rice` | No result | New Riceberry row only |
| `riz violet Riceberry`; `riz violet` | No result | New Riceberry row only; the shorter phrase comes from the source-attested French display |
| `purple rice` | No result | No result; no generic color alias is added |
| `black rice` | Four current results, including the color identity and related black-rice products | Same four results; Riceberry does not enter the black-rice query |
| `rice`; `riz` | 72; 69 current results | 73; 70 results, respectively, adding one named rice choice to each broad query |

The French display means an exact `riz violet` search returns the named Riceberry product. It does not claim that all purple rice is Riceberry; a future generic purple-rice identity would need separate evidence and would share that broad query. Avoid a `purple rice` English alias so the current picker does not imply that equivalence.

## Integration shape

If accepted, add only one reference matching the proposed ID, bilingual displays, `GRAIN_AND_CEREAL` category, empty aliases, null density, and empty unit mappings. Add a verified identity ledger record with the new source entries below; retain measurement and substitution states as `not_yet_researched`, with no observations or active behavior. Do not add a separate Riceberry candidate row or a Riceberry form under generic rice. This proposal allocates no shared source IDs.

| Proposal-local source ID | Source and support | Limits |
| --- | --- | --- |
| `WP03-RICEBERRY-R705-20261018-S01` | Kasetsart University, Rice Science Center, [Riceberry](https://www.dna.kps.ku.ac.th/research/breeding/riceberry), published 2026-03-10. Identifies Riceberry as a rice variety, its breeding parents, and the variety/trademark registrations. | Primary variety evidence; does not define Canadian grading, milling, preparation forms, or a general purple-rice class. |
| `WP03-RICEBERRY-R705-20261018-S02` | Floating Leaf Fine Foods, [Riceberry Rice](https://eatwildrice.ca/collections/all/products/riceberry-rice-2-x-1kg), current Canadian manufacturer product page, accessed 2026-10-18. Names a pure Riceberry rice product from Thailand and identifies pure Riceberry rice in the ingredient statement. | Manufacturer product evidence. Its package and product-specific cooking instructions are not general measures, density, or cooking-yield evidence. |
| `WP03-RICEBERRY-R705-20261018-S03` | Satau / AgroFusion, [French product list](https://satau.ca/fr/nos-produits/agrofusion/), accessed 2026-10-18, listing `Riz violet Riceberry (Sumer) bio 10x1kg`. | Québec distributor wording and product listing; not an ingredient declaration or OQLF terminology decision. |
| `WP03-RICEBERRY-R705-20261018-S04` | Distribution alimentaire Aubut, [Riz/Grain category](https://www.aubut.ca/produits/epicerie-1/rizgrain-85), accessed 2026-10-18, listing `Sumer Riz violet riceberry biologique`. | Current Québec retail title supports local French market wording; the category listing does not establish product composition or a reusable measure. |

Exact source-URL searches found no prior ledger owner for S01–S04. The IDs above are citations local to this proposal only; add them to the shared ledger once if this identity is integrated. Preserve the existing wild-rice-blend S05 source ownership unchanged.

## Review checks

- Rechecked the open Section F checklist and named-rice rule in the global plan.
- Audited current ingredient references, forms, legacy candidates, ledger entries, and WP03 proposal/batch archive for exact names and ID/source ownership.
- Checked Kasetsart University’s current variety record, the Canadian manufacturer’s current product page, and current Québec French distributor/retailer listings.
- Scanned every manifest-listed recipe file and ingredient row; found no matching Riceberry demand.
- Projected picker matches from the current phrase-search behavior; did not run tests, build, emulator, or deployment work.

No shared data or workflow file was changed.
